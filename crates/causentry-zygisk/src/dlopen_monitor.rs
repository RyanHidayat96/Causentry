//! MediaProvider `libfuse_jni.so` loader monitor (`dl_iterate_phdr` + Dobby inline hooks).

#![cfg(target_os = "android")]
#![cfg_attr(not(target_arch = "aarch64"), allow(dead_code, unused_imports))]

use crate::dex_loader::{register_all_native_methods, start_injected_java};
use crate::hook_adapter::{
    DOBBY_BRANCH_REQUIRE_NEAR, DOBBY_HOOK_PRESERVE_LANDING_PAD,
    DOBBY_HOOK_RECOVERY_REQUIRED, DOBBY_HOOK_REQUIRE_CONCURRENT_SAFE,
    DOBBY_HOOK_REQUIRE_PRISTINE_ENTRY, DOBBY_HOOK_VALIDATE_BACKUP, DobbyAbortHook,
    DobbyCommitHook, DobbyHookHandle, DobbyHookOptions, DobbyHookResult, DobbyPrepareHook,
    DobbyRecoverHook, RT_SUCCESS, native_hook_api_v2_ptr, native_hook_api_v3_ptr,
};
use crate::log;
use crate::{G_FUSEHIDE_HANDLE, G_VM};
use jni_sys::{JNI_EDETACHED, JNI_OK, JNI_VERSION_1_6, JNIEnv, JavaVM, jint};
use std::ffi::{CStr, CString, c_char, c_int, c_void};
use std::mem::{size_of, zeroed};
use std::ptr;
use std::sync::Mutex;
use std::sync::atomic::{AtomicBool, AtomicPtr, AtomicU8, Ordering};
use std::thread;
use std::time::Duration;

const INIT_NOT_STARTED: u8 = 0;
const INIT_INITIALIZING: u8 = 1;
const INIT_READY: u8 = 2;
const INIT_SKIPPED: u8 = 3;
const INIT_FAILED_AFTER_JNI: u8 = 4;

static G_FUSEHIDE_INIT_STATE: AtomicU8 = AtomicU8::new(INIT_NOT_STARTED);
static G_OBSERVER_STARTED: AtomicBool = AtomicBool::new(false);
static G_PUBLIC_HOOK_ATTEMPTED: AtomicBool = AtomicBool::new(false);
static G_ANDROID_DLOPEN_EXT_ORIG: AtomicPtr<c_void> = AtomicPtr::new(ptr::null_mut());
static G_PUBLIC_DLOPEN_ORIG: AtomicPtr<c_void> = AtomicPtr::new(ptr::null_mut());

struct LoaderHookMeta {
    handle: DobbyHookHandle,
    recovery_required: bool,
    needs_abort: bool,
}

impl LoaderHookMeta {
    const fn new() -> Self {
        Self {
            handle: 0,
            recovery_required: false,
            needs_abort: false,
        }
    }
}

static G_EXT_META: Mutex<LoaderHookMeta> = Mutex::new(LoaderHookMeta::new());
static G_DLOPEN_META: Mutex<LoaderHookMeta> = Mutex::new(LoaderHookMeta::new());

fn is_init_finished(state: u8) -> bool {
    matches!(state, INIT_READY | INIT_FAILED_AFTER_JNI | INIT_SKIPPED)
}

fn is_fuse_jni(name: *const c_char) -> bool {
    if name.is_null() {
        return false;
    }
    unsafe { CStr::from_ptr(name) }
        .to_str()
        .is_ok_and(|s| s.ends_with("libfuse_jni.so"))
}

struct PhdrSearch {
    own_base: usize,
    found_path: Option<String>,
    found_other_fusehide: bool,
}

extern "C" fn phdr_find_other_fusehide(
    info: *mut libc::dl_phdr_info,
    _size: usize,
    data: *mut c_void,
) -> c_int {
    if info.is_null() || data.is_null() {
        return 0;
    }
    unsafe {
        let search = &mut *data.cast::<PhdrSearch>();
        if (*info).dlpi_name.is_null() || (*info).dlpi_addr as usize == search.own_base {
            return 0;
        }
        if let Ok(name) = CStr::from_ptr((*info).dlpi_name).to_str() {
            if name == "libfusehide.so" || name.ends_with("/libfusehide.so") {
                search.found_other_fusehide = true;
                return 1;
            }
        }
    }
    0
}

fn has_other_fusehide_runtime() -> bool {
    let handle = G_FUSEHIDE_HANDLE.load(Ordering::Acquire);
    let mut own_base = 0usize;
    if !handle.is_null() {
        unsafe {
            let sym = libc::dlsym(handle, c"JNI_OnLoad".as_ptr());
            let mut info: libc::Dl_info = zeroed();
            if sym.is_null() || libc::dladdr(sym, &raw mut info) == 0 {
                return false;
            }
            own_base = info.dli_fbase as usize;
        }
    }
    let mut search = PhdrSearch {
        own_base,
        found_path: None,
        found_other_fusehide: false,
    };
    unsafe {
        libc::dl_iterate_phdr(
            Some(phdr_find_other_fusehide),
            (&raw mut search).cast::<c_void>(),
        );
    }
    search.found_other_fusehide
}

extern "C" fn phdr_find_fuse_jni(
    info: *mut libc::dl_phdr_info,
    _size: usize,
    data: *mut c_void,
) -> c_int {
    if info.is_null() || data.is_null() {
        return 0;
    }
    unsafe {
        let search = &mut *data.cast::<PhdrSearch>();
        if (*info).dlpi_name.is_null() {
            return 0;
        }
        if let Ok(name) = CStr::from_ptr((*info).dlpi_name).to_str() {
            if name.contains("libfuse_jni.so") {
                search.found_path = Some(name.to_string());
                return 1;
            }
        }
    }
    0
}

fn find_loaded_fuse_jni() -> Option<String> {
    let mut search = PhdrSearch {
        own_base: 0,
        found_path: None,
        found_other_fusehide: false,
    };
    unsafe {
        libc::dl_iterate_phdr(
            Some(phdr_find_fuse_jni),
            (&raw mut search).cast::<c_void>(),
        );
    }
    search.found_path
}

unsafe fn get_jni_env() -> Option<(*mut JNIEnv, bool)> {
    let vm = G_VM.load(Ordering::Acquire) as *mut JavaVM;
    if vm.is_null() {
        return None;
    }
    let fns = unsafe { &**vm };
    let mut env: *mut c_void = ptr::null_mut();
    let rc = unsafe { (fns.GetEnv.unwrap())(vm, &raw mut env, JNI_VERSION_1_6) };
    if rc == JNI_OK && !env.is_null() {
        return Some((env.cast(), false));
    }
    if rc == JNI_EDETACHED
        && unsafe { (fns.AttachCurrentThread.unwrap())(vm, &raw mut env, ptr::null_mut()) }
            == JNI_OK
        && !env.is_null()
    {
        return Some((env.cast(), true));
    }
    None
}

unsafe fn detach_if_needed(attached: bool) {
    if attached {
        let vm = G_VM.load(Ordering::Acquire) as *mut JavaVM;
        if !vm.is_null() {
            let fns = unsafe { &**vm };
            unsafe { (fns.DetachCurrentThread.unwrap())(vm) };
        }
    }
}

fn start_injected_java_when_ready(env: *mut JNIEnv) {
    if start_injected_java(env) {
        return;
    }
    thread::spawn(|| {
        let vm = G_VM.load(Ordering::Acquire) as *mut JavaVM;
        if vm.is_null() {
            return;
        }
        let mut raw_env: *mut c_void = ptr::null_mut();
        unsafe {
            let fns = &**vm;
            if (fns.AttachCurrentThread.unwrap())(vm, &raw mut raw_env, ptr::null_mut()) != JNI_OK
                || raw_env.is_null()
            {
                log::error("failed to attach Java initialization worker");
                return;
            }
            for attempt in 1..=100 {
                thread::sleep(Duration::from_millis(100));
                if start_injected_java(raw_env.cast()) {
                    log::info(&format!(
                        "Application ready after {attempt} Java initialization attempts"
                    ));
                    (fns.DetachCurrentThread.unwrap())(vm);
                    return;
                }
            }
            log::error("timed out waiting for MediaProvider Application");
            (fns.DetachCurrentThread.unwrap())(vm);
        }
    });
}

fn init_fusehide_on_fuse_loaded(loaded_library: *const c_char, loaded_handle: *mut c_void) {
    let fusehide = G_FUSEHIDE_HANDLE.load(Ordering::Acquire);
    if fusehide.is_null() {
        log::error("preloaded libfusehide.so is unavailable");
        return;
    }
    if G_FUSEHIDE_INIT_STATE
        .compare_exchange(
            INIT_NOT_STARTED,
            INIT_INITIALIZING,
            Ordering::AcqRel,
            Ordering::Acquire,
        )
        .is_err()
    {
        return;
    }

    if has_other_fusehide_runtime() {
        G_FUSEHIDE_INIT_STATE.store(INIT_SKIPPED, Ordering::Release);
        log::info("another libfusehide.so instance is loaded; skip Zygisk initialization");
        return;
    }

    let Some((env, attached)) = (unsafe { get_jni_env() }) else {
        log::error("failed to obtain JNIEnv");
        G_FUSEHIDE_INIT_STATE.store(INIT_NOT_STARTED, Ordering::Release);
        return;
    };

    unsafe {
        let vm = G_VM.load(Ordering::Acquire) as *mut JavaVM;
        type JniOnLoadFn = extern "C" fn(*mut JavaVM, *mut c_void) -> jint;
        type NativeInitFn = extern "C" fn(*mut c_void) -> *mut c_void;
        type PostNativeInitFn = extern "C" fn(*const c_char, *mut c_void);

        let jni_sym = libc::dlsym(fusehide, c"JNI_OnLoad".as_ptr());
        if jni_sym.is_null() {
            log::error("JNI_OnLoad not found in libfusehide.so");
            G_FUSEHIDE_INIT_STATE.store(INIT_FAILED_AFTER_JNI, Ordering::Release);
            detach_if_needed(attached);
            return;
        }
        let jni_on_load: JniOnLoadFn = std::mem::transmute(jni_sym);
        if jni_on_load(vm, ptr::null_mut()) < JNI_VERSION_1_6 {
            log::error("JNI_OnLoad failed for libfusehide.so");
            G_FUSEHIDE_INIT_STATE.store(INIT_FAILED_AFTER_JNI, Ordering::Release);
            detach_if_needed(attached);
            return;
        }

        let init_v3 = libc::dlsym(fusehide, c"native_init_v3".as_ptr());
        let init_v2 = libc::dlsym(fusehide, c"native_init".as_ptr());
        let post_addr = if !init_v3.is_null() {
            let f: NativeInitFn = std::mem::transmute(init_v3);
            f(native_hook_api_v3_ptr().cast_mut().cast())
        } else if !init_v2.is_null() {
            let f: NativeInitFn = std::mem::transmute(init_v2);
            f(native_hook_api_v2_ptr().cast_mut().cast())
        } else {
            log::error("native_init not found in libfusehide.so");
            G_FUSEHIDE_INIT_STATE.store(INIT_FAILED_AFTER_JNI, Ordering::Release);
            detach_if_needed(attached);
            return;
        };

        if post_addr.is_null() {
            log::error("native_init returned null");
            G_FUSEHIDE_INIT_STATE.store(INIT_FAILED_AFTER_JNI, Ordering::Release);
            detach_if_needed(attached);
            return;
        }

        register_all_native_methods(env, fusehide);
        let post_fn: PostNativeInitFn = std::mem::transmute(post_addr);
        post_fn(loaded_library, loaded_handle);
        G_FUSEHIDE_INIT_STATE.store(INIT_READY, Ordering::Release);
        start_injected_java_when_ready(env);
        log::info("FuseHide initialized via Rust Zygisk loader");
        detach_if_needed(attached);
    }
}

extern "C" fn hooked_android_dlopen_ext(
    name: *const c_char,
    flags: c_int,
    extinfo: *const c_void,
) -> *mut c_void {
    let orig = G_ANDROID_DLOPEN_EXT_ORIG.load(Ordering::Acquire);
    if orig.is_null() {
        return ptr::null_mut();
    }
    type OrigFn = extern "C" fn(*const c_char, c_int, *const c_void) -> *mut c_void;
    let f: OrigFn = unsafe { std::mem::transmute(orig) };
    let handle = f(name, flags, extinfo);
    if !handle.is_null() && is_fuse_jni(name) {
        init_fusehide_on_fuse_loaded(name, handle);
    }
    handle
}

extern "C" fn hooked_public_dlopen(name: *const c_char, flags: c_int) -> *mut c_void {
    let orig = G_PUBLIC_DLOPEN_ORIG.load(Ordering::Acquire);
    if orig.is_null() {
        return ptr::null_mut();
    }
    type OrigFn = extern "C" fn(*const c_char, c_int) -> *mut c_void;
    let f: OrigFn = unsafe { std::mem::transmute(orig) };
    let handle = f(name, flags);
    if !handle.is_null() && is_fuse_jni(name) {
        init_fusehide_on_fuse_loaded(name, handle);
    }
    handle
}

fn start_fuse_jni_observer() {
    if G_OBSERVER_STARTED
        .compare_exchange(false, true, Ordering::AcqRel, Ordering::Acquire)
        .is_err()
    {
        return;
    }

    if let Some(path) = find_loaded_fuse_jni() {
        if let Ok(cpath) = CString::new(path) {
            init_fusehide_on_fuse_loaded(cpath.as_ptr(), ptr::null_mut());
            return;
        }
    }

    thread::spawn(|| {
        let mut slow_logged = false;
        for attempt in 0u32.. {
            if is_init_finished(G_FUSEHIDE_INIT_STATE.load(Ordering::Acquire)) {
                return;
            }
            if let Some(path) = find_loaded_fuse_jni() {
                if let Ok(cpath) = CString::new(path) {
                    init_fusehide_on_fuse_loaded(cpath.as_ptr(), ptr::null_mut());
                    if is_init_finished(G_FUSEHIDE_INIT_STATE.load(Ordering::Acquire)) {
                        return;
                    }
                }
            }
            if attempt < 1000 {
                thread::sleep(Duration::from_millis(5));
            } else if attempt < 2200 {
                thread::sleep(Duration::from_millis(50));
            } else {
                if !slow_logged {
                    log::info("libfuse_jni.so not loaded yet; continuing low-frequency observer");
                    slow_logged = true;
                }
                thread::sleep(Duration::from_millis(500));
            }
        }
    });
}

fn recover_loader_hook(label: &str, meta_mtx: &Mutex<LoaderHookMeta>) {
    let Ok(mut meta) = meta_mtx.lock() else {
        return;
    };
    if !meta.recovery_required || meta.handle == 0 {
        return;
    }
    let mut res = DobbyHookResult::empty();
    let rc = unsafe {
        if meta.needs_abort {
            DobbyAbortHook(meta.handle, &raw mut res)
        } else {
            DobbyRecoverHook(meta.handle, &raw mut res)
        }
    };
    if rc == RT_SUCCESS {
        log::info(&format!("{label} monitor recovery completed"));
        meta.handle = 0;
        meta.recovery_required = false;
        meta.needs_abort = false;
    }
}

fn install_public_loader_hook(
    label: &str,
    target: *mut c_void,
    replacement: *mut c_void,
    orig_slot: &AtomicPtr<c_void>,
    meta_mtx: &Mutex<LoaderHookMeta>,
) -> bool {
    if target.is_null() {
        return false;
    }
    let Ok(mut meta) = meta_mtx.lock() else {
        return false;
    };
    if meta.handle != 0 || meta.recovery_required {
        return false;
    }

    #[cfg(target_arch = "aarch64")]
    let (branch_policy, flags) = (
        DOBBY_BRANCH_REQUIRE_NEAR,
        DOBBY_HOOK_REQUIRE_CONCURRENT_SAFE
            | DOBBY_HOOK_REQUIRE_PRISTINE_ENTRY
            | DOBBY_HOOK_VALIDATE_BACKUP
            | DOBBY_HOOK_PRESERVE_LANDING_PAD,
    );
    #[cfg(not(target_arch = "aarch64"))]
    let (branch_policy, flags) = (crate::hook_adapter::DOBBY_BRANCH_LEGACY, DOBBY_HOOK_REQUIRE_PRISTINE_ENTRY);

    let opts = DobbyHookOptions {
        struct_size: size_of::<DobbyHookOptions>() as u32,
        branch_policy,
        flags,
        reserved: 0,
        target,
        replacement,
    };
    let mut tx = DobbyHookResult::empty();
    if unsafe { DobbyPrepareHook(&raw const opts, &raw mut tx) } != RT_SUCCESS
        || tx.original.is_null()
    {
        if tx.handle != 0 {
            let mut aborted = DobbyHookResult::empty();
            if unsafe { DobbyAbortHook(tx.handle, &raw mut aborted) } != RT_SUCCESS {
                meta.handle = tx.handle;
                meta.recovery_required = true;
                meta.needs_abort = true;
            }
        }
        return false;
    }

    let ticket = tx.handle;
    meta.handle = ticket;
    orig_slot.store(tx.original, Ordering::Release);
    if unsafe { DobbyCommitHook(ticket, &raw mut tx) } != RT_SUCCESS {
        if tx.handle == ticket
            && tx.ever_published == 0
            && tx.target_may_be_patched == 0
            && tx.status != DOBBY_HOOK_RECOVERY_REQUIRED
        {
            let mut aborted = DobbyHookResult::empty();
            if unsafe { DobbyAbortHook(ticket, &raw mut aborted) } == RT_SUCCESS {
                tx.handle = 0;
            } else {
                meta.needs_abort = true;
            }
        }
        meta.handle = tx.handle;
        meta.recovery_required = tx.handle != 0;
        if tx.status == DOBBY_HOOK_RECOVERY_REQUIRED {
            meta.needs_abort = false;
        }
        if tx.ever_published == 0 && tx.handle == 0 {
            orig_slot.store(ptr::null_mut(), Ordering::Release);
        }
        return false;
    }

    log::info(&format!("hooked public {label} at {target:p}"));
    true
}

pub fn install_dlopen_monitor() {
    start_fuse_jni_observer();
    #[cfg(not(target_arch = "aarch64"))]
    {
        log::info("loader inline hooks disabled on non-arm64; using phdr observer");
        return;
    }
    #[cfg(target_arch = "aarch64")]
    {
        recover_loader_hook("android_dlopen_ext", &G_EXT_META);
        recover_loader_hook("dlopen", &G_DLOPEN_META);
        let state = G_FUSEHIDE_INIT_STATE.load(Ordering::Acquire);
        if state == INIT_READY || state == INIT_SKIPPED {
            return;
        }
        if G_PUBLIC_HOOK_ATTEMPTED.swap(true, Ordering::AcqRel) {
            return;
        }
        let ext_target = unsafe { libc::dlsym(libc::RTLD_DEFAULT, c"android_dlopen_ext".as_ptr()) };
        let dl_target = unsafe { libc::dlsym(libc::RTLD_DEFAULT, c"dlopen".as_ptr()) };
        let ext_ok = install_public_loader_hook(
            "android_dlopen_ext",
            ext_target,
            hooked_android_dlopen_ext as *mut c_void,
            &G_ANDROID_DLOPEN_EXT_ORIG,
            &G_EXT_META,
        );
        let dl_ok = install_public_loader_hook(
            "dlopen",
            dl_target,
            hooked_public_dlopen as *mut c_void,
            &G_PUBLIC_DLOPEN_ORIG,
            &G_DLOPEN_META,
        );
        if !ext_ok && !dl_ok {
            log::info("public loader hooks unavailable; using dl_iterate_phdr observer only");
        }
    }
}
