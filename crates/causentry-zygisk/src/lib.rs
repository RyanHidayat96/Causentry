//! Causentry v3.0 — Pure Rust Zygisk v4 native loader.
//!
//! Replaces `zygisk/module.cpp`, `dex_loader.cpp`, `dlopen_monitor.cpp`, and
//! `native_hook_adapter.cpp` with memory-safe Rust sharing `causentry-proto` with `causentryd`.

pub mod hook_adapter;
pub mod log;
pub mod zygisk_abi;

#[cfg(target_os = "android")]
pub mod companion;
#[cfg(target_os = "android")]
pub mod dex_loader;
#[cfg(target_os = "android")]
pub mod dlopen_monitor;

#[cfg(target_os = "android")]
use std::ffi::{CStr, CString, c_int, c_void};
#[cfg(target_os = "android")]
use std::ptr;
#[cfg(target_os = "android")]
use std::sync::atomic::{AtomicI32, AtomicPtr, Ordering};

#[cfg(target_os = "android")]
use causentry_proto::TargetProcess;
#[cfg(target_os = "android")]
use jni_sys::{JNI_OK, JNI_VERSION_1_6, JNIEnv, JavaVM, jstring};
#[cfg(target_os = "android")]
use zygisk_abi::{
    ApiTable, AppSpecializeArgs, ModuleAbi, OPTION_DLCLOSE_MODULE_LIBRARY, ServerSpecializeArgs,
    ZYGISK_API_VERSION,
};

#[cfg(target_os = "android")]
pub static G_VM: AtomicPtr<c_void> = AtomicPtr::new(ptr::null_mut());
#[cfg(target_os = "android")]
static G_ENV: AtomicPtr<JNIEnv> = AtomicPtr::new(ptr::null_mut());
#[cfg(target_os = "android")]
pub static G_FUSEHIDE_HANDLE: AtomicPtr<c_void> = AtomicPtr::new(ptr::null_mut());

#[cfg(target_os = "android")]
static G_API: AtomicPtr<ApiTable> = AtomicPtr::new(ptr::null_mut());
#[cfg(target_os = "android")]
static G_TARGET: AtomicI32 = AtomicI32::new(TargetProcess::None as i32);

#[cfg(target_os = "android")]
#[repr(C)]
struct AndroidDlExtInfo {
    flags: u64,
    reserved_addr: *mut c_void,
    reserved_size: usize,
    relro_fd: c_int,
    library_fd: c_int,
    library_fd_offset: i64,
    library_namespace: *mut c_void,
}

#[cfg(target_os = "android")]
const ANDROID_DLEXT_USE_LIBRARY_FD: u64 = 0x10;

#[cfg(target_os = "android")]
fn abi_dir() -> &'static str {
    #[cfg(target_arch = "aarch64")]
    {
        "arm64-v8a"
    }
    #[cfg(target_arch = "arm")]
    {
        "armeabi-v7a"
    }
    #[cfg(not(any(target_arch = "aarch64", target_arch = "arm")))]
    {
        "unknown"
    }
}

#[cfg(target_os = "android")]
fn vm_env() -> *mut JNIEnv {
    let saved = G_ENV.load(Ordering::Acquire);
    if !saved.is_null() {
        return saved;
    }
    let vm = G_VM.load(Ordering::Acquire) as *mut JavaVM;
    if vm.is_null() {
        return ptr::null_mut();
    }
    let mut env: *mut c_void = ptr::null_mut();
    unsafe {
        let fns = &**vm;
        if (fns.GetEnv.unwrap())(vm, &raw mut env, JNI_VERSION_1_6) == JNI_OK {
            env.cast()
        } else {
            ptr::null_mut()
        }
    }
}

#[cfg(target_os = "android")]
fn classify_process(env: *mut JNIEnv, nice_name: jstring) -> TargetProcess {
    if env.is_null() || nice_name.is_null() {
        return TargetProcess::None;
    }
    unsafe {
        let fns = &**env;
        let chars = (fns.GetStringUTFChars.unwrap())(env, nice_name, ptr::null_mut());
        if chars.is_null() {
            if let Some(check) = fns.ExceptionCheck {
                if check(env) != 0 {
                    if let Some(clear) = fns.ExceptionClear {
                        clear(env);
                    }
                }
            }
            return TargetProcess::None;
        }
        let target = match CStr::from_ptr(chars).to_str() {
            Ok("com.android.providers.media.module") => TargetProcess::MediaAosp,
            Ok("com.google.android.providers.media.module") => TargetProcess::MediaGoogle,
            Ok("com.android.providers.settings") => TargetProcess::Settings,
            _ => TargetProcess::None,
        };
        (fns.ReleaseStringUTFChars.unwrap())(env, nice_name, chars);
        target
    }
}

#[cfg(target_os = "android")]
fn preload_dex_only(api: *mut ApiTable, env: *mut JNIEnv) -> bool {
    if api.is_null() || env.is_null() {
        return false;
    }
    let mod_fd = unsafe { (*api).get_module_dir() };
    if mod_fd < 0 {
        return false;
    }
    let mut dex_fd = unsafe {
        libc::openat(
            mod_fd,
            c"dex".as_ptr(),
            libc::O_RDONLY | libc::O_DIRECTORY | libc::O_CLOEXEC,
        )
    };
    if dex_fd < 0 {
        dex_fd = unsafe { libc::dup(mod_fd) };
    }
    unsafe { libc::close(mod_fd) };
    if dex_fd < 0 {
        return false;
    }
    let ok = dex_loader::preload_injected_dex(env, dex_fd);
    unsafe { libc::close(dex_fd) };
    ok
}

#[cfg(target_os = "android")]
fn preload_module_runtime(api: *mut ApiTable, env: *mut JNIEnv) -> bool {
    if !G_FUSEHIDE_HANDLE.load(Ordering::Acquire).is_null() {
        return true;
    }
    if api.is_null() || env.is_null() {
        return false;
    }
    let mod_fd = unsafe { (*api).get_module_dir() };
    if mod_fd < 0 {
        log::error("getModuleDir failed");
        return false;
    }
    let mut dex_fd = unsafe {
        libc::openat(
            mod_fd,
            c"dex".as_ptr(),
            libc::O_RDONLY | libc::O_DIRECTORY | libc::O_CLOEXEC,
        )
    };
    if dex_fd < 0 {
        dex_fd = unsafe { libc::dup(mod_fd) };
    }
    let lib_rel = CString::new(format!("lib/{}/libfusehide.so", abi_dir())).unwrap();
    let lib_fd = unsafe { libc::openat(mod_fd, lib_rel.as_ptr(), libc::O_RDONLY | libc::O_CLOEXEC) };
    unsafe { libc::close(mod_fd) };

    if dex_fd < 0 || lib_fd < 0 {
        log::error("failed to open module resources for MediaProvider");
        if dex_fd >= 0 {
            unsafe { libc::close(dex_fd) };
        }
        if lib_fd >= 0 {
            unsafe { libc::close(lib_fd) };
        }
        return false;
    }

    let dex_ok = dex_loader::preload_injected_dex(env, dex_fd);
    unsafe { libc::close(dex_fd) };
    if !dex_ok {
        unsafe { libc::close(lib_fd) };
        return false;
    }

    let ext = AndroidDlExtInfo {
        flags: ANDROID_DLEXT_USE_LIBRARY_FD,
        reserved_addr: ptr::null_mut(),
        reserved_size: 0,
        relro_fd: 0,
        library_fd: lib_fd,
        library_fd_offset: 0,
        library_namespace: ptr::null_mut(),
    };
    type AndroidDlopenExtFn =
        unsafe extern "C" fn(*const libc::c_char, c_int, *const AndroidDlExtInfo) -> *mut c_void;
    let sym = unsafe { libc::dlsym(libc::RTLD_DEFAULT, c"android_dlopen_ext".as_ptr()) };
    let handle = if sym.is_null() {
        log::error("android_dlopen_ext symbol unavailable");
        ptr::null_mut()
    } else {
        let dlopen_ext: AndroidDlopenExtFn = unsafe { std::mem::transmute(sym) };
        unsafe {
            dlopen_ext(
                c"libfusehide.so".as_ptr(),
                libc::RTLD_NOW | libc::RTLD_LOCAL,
                &raw const ext,
            )
        }
    };
    unsafe { libc::close(lib_fd) };
    if handle.is_null() {
        log::error("preload libfusehide.so failed");
        return false;
    }
    G_FUSEHIDE_HANDLE.store(handle, Ordering::Release);
    log::info(&format!("preloaded module runtime for abi={}", abi_dir()));
    true
}

#[cfg(target_os = "android")]
extern "C" fn on_pre_server_specialize(_impl: *mut c_void, _args: *mut ServerSpecializeArgs) {
    G_TARGET.store(TargetProcess::SystemServer as i32, Ordering::Release);
    let api = G_API.load(Ordering::Acquire);
    companion::acquire_policy_socket_fd(api, TargetProcess::SystemServer, false);
    if !preload_dex_only(api, vm_env()) {
        log::error("failed to preload dex for system_server");
    }
}

#[cfg(target_os = "android")]
extern "C" fn on_post_server_specialize(_impl: *mut c_void, _args: *const ServerSpecializeArgs) {
    if G_TARGET.load(Ordering::Acquire) == TargetProcess::SystemServer as i32 {
        dex_loader::start_causentry_zygote_entry(vm_env());
    } else {
        let api = G_API.load(Ordering::Acquire);
        if !api.is_null() {
            unsafe { (*api).set_option(OPTION_DLCLOSE_MODULE_LIBRARY) };
        }
    }
}

#[cfg(target_os = "android")]
extern "C" fn on_pre_app_specialize(_impl: *mut c_void, args: *mut AppSpecializeArgs) {
    let nice_name = if !args.is_null() && unsafe { !(*args).nice_name.is_null() } {
        unsafe { *(*args).nice_name }
    } else {
        ptr::null_mut()
    };
    let target = classify_process(vm_env(), nice_name);
    G_TARGET.store(target as i32, Ordering::Release);
    let api = G_API.load(Ordering::Acquire);
    if target == TargetProcess::None {
        if !api.is_null() {
            unsafe { (*api).set_option(OPTION_DLCLOSE_MODULE_LIBRARY) };
        }
        return;
    }
    companion::acquire_policy_socket_fd(api, target, true);

    if target == TargetProcess::Settings {
        if !preload_dex_only(api, vm_env()) {
            log::error("failed to preload dex for SettingsProvider");
            G_TARGET.store(TargetProcess::None as i32, Ordering::Release);
        }
        return;
    }

    if !preload_module_runtime(api, vm_env()) {
        log::error("failed to preload module runtime for MediaProvider");
        G_TARGET.store(TargetProcess::None as i32, Ordering::Release);
    }
}

#[cfg(target_os = "android")]
extern "C" fn on_post_app_specialize(_impl: *mut c_void, _args: *const AppSpecializeArgs) {
    let target = G_TARGET.load(Ordering::Acquire);
    if target == TargetProcess::None as i32 {
        let api = G_API.load(Ordering::Acquire);
        if !api.is_null() {
            unsafe { (*api).set_option(OPTION_DLCLOSE_MODULE_LIBRARY) };
        }
        return;
    }
    if target == TargetProcess::Settings as i32 {
        dex_loader::start_causentry_zygote_entry(vm_env());
        return;
    }
    if target == TargetProcess::MediaAosp as i32 || target == TargetProcess::MediaGoogle as i32 {
        dlopen_monitor::install_dlopen_monitor();
    }
}

#[cfg(target_os = "android")]
static mut MODULE_IMPL_TAG: usize = 0xCA05_E717;

#[cfg(target_os = "android")]
static mut MODULE_ABI: ModuleAbi = ModuleAbi {
    api_version: ZYGISK_API_VERSION,
    impl_: ptr::null_mut(),
    pre_app_specialize: on_pre_app_specialize,
    post_app_specialize: on_post_app_specialize,
    pre_server_specialize: on_pre_server_specialize,
    post_server_specialize: on_post_server_specialize,
};

/// Zygisk v4 module entry point (exported symbol `zygisk_module_entry`).
#[cfg(target_os = "android")]
#[unsafe(no_mangle)]
pub extern "C" fn zygisk_module_entry(table: *mut ApiTable, env: *mut JNIEnv) {
    if table.is_null() || env.is_null() {
        return;
    }
    let Some(register) = (unsafe { (*table).register_module }) else {
        return;
    };
    unsafe {
        MODULE_ABI.impl_ = (&raw mut MODULE_IMPL_TAG).cast();
    }
    if !register(table, &raw mut MODULE_ABI) {
        return;
    }
    G_API.store(table, Ordering::Release);
    G_ENV.store(env, Ordering::Release);
    let mut vm: *mut JavaVM = ptr::null_mut();
    unsafe {
        let fns = &**env;
        if let Some(get_vm) = fns.GetJavaVM {
            if get_vm(env, &raw mut vm) == JNI_OK {
                G_VM.store(vm.cast(), Ordering::Release);
            }
        }
    }
}

/// Zygisk v4 root companion entry point (exported symbol `zygisk_companion_entry`).
#[cfg(target_os = "android")]
#[unsafe(no_mangle)]
pub extern "C" fn zygisk_companion_entry(client: c_int) {
    companion::handle_companion_request(client);
}
