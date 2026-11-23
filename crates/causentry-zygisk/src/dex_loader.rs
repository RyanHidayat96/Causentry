//! In-memory DEX preloader (`mmap` + `InMemoryDexClassLoader`) and JNI `RegisterNatives`.

#![cfg(target_os = "android")]

use crate::log;
use jni_sys::{JNIEnv, JNINativeMethod, jclass, jint, jlong, jobject, jsize, jvalue};
use std::ffi::{CStr, CString, c_int, c_void};
use std::mem::zeroed;
use std::ptr;
use std::sync::atomic::{AtomicI32, AtomicPtr, Ordering};

static G_DEX_LOADER: AtomicPtr<c_void> = AtomicPtr::new(ptr::null_mut());
static G_POLICY_FD: AtomicI32 = AtomicI32::new(-1);

pub fn set_policy_channel_fd(fd: c_int) {
    let prev = G_POLICY_FD.swap(fd, Ordering::AcqRel);
    if prev >= 0 && prev != fd {
        unsafe { libc::close(prev) };
    }
}

extern "system" fn native_take_policy_fd(_env: *mut JNIEnv, _clazz: jclass) -> jint {
    G_POLICY_FD.swap(-1, Ordering::AcqRel)
}

struct MmapRegions {
    regions: Vec<(*mut c_void, usize)>,
    armed: bool,
}

impl MmapRegions {
    fn new() -> Self {
        Self {
            regions: Vec::new(),
            armed: true,
        }
    }
    fn disarm(&mut self) {
        self.armed = false;
    }
}

impl Drop for MmapRegions {
    fn drop(&mut self) {
        if self.armed {
            for &(ptr, len) in &self.regions {
                if !ptr.is_null() && len > 0 {
                    unsafe { libc::munmap(ptr, len) };
                }
            }
        }
    }
}

unsafe fn clear_if_exception(env: *mut JNIEnv) -> bool {
    let fns = unsafe { &**env };
    if let Some(check) = fns.ExceptionCheck {
        if unsafe { check(env) } != 0 {
            if let Some(clear) = fns.ExceptionClear {
                unsafe { clear(env) };
            }
            return true;
        }
    }
    false
}

unsafe fn find_in_dex(env: *mut JNIEnv, class_name: &CStr) -> jclass {
    let loader = G_DEX_LOADER.load(Ordering::Acquire) as jobject;
    if loader.is_null() || env.is_null() {
        return ptr::null_mut();
    }
    let fns = unsafe { &**env };
    let loader_cls = unsafe { (fns.FindClass.unwrap())(env, c"dalvik/system/BaseDexClassLoader".as_ptr()) };
    if loader_cls.is_null() {
        unsafe { clear_if_exception(env) };
        return ptr::null_mut();
    }
    let load_class = unsafe {
        (fns.GetMethodID.unwrap())(
            env,
            loader_cls,
            c"loadClass".as_ptr(),
            c"(Ljava/lang/String;)Ljava/lang/Class;".as_ptr(),
        )
    };
    unsafe { (fns.DeleteLocalRef.unwrap())(env, loader_cls) };
    if load_class.is_null() {
        unsafe { clear_if_exception(env) };
        return ptr::null_mut();
    }
    let jname = unsafe { (fns.NewStringUTF.unwrap())(env, class_name.as_ptr()) };
    let arg = [jvalue { l: jname }];
    let clazz = unsafe { (fns.CallObjectMethodA.unwrap())(env, loader, load_class, arg.as_ptr()) } as jclass;
    unsafe { (fns.DeleteLocalRef.unwrap())(env, jname) };
    if clazz.is_null() {
        unsafe { clear_if_exception(env) };
        return ptr::null_mut();
    }
    clazz
}

pub fn preload_injected_dex(env: *mut JNIEnv, dex_dir_fd: c_int) -> bool {
    if env.is_null() || dex_dir_fd < 0 {
        return false;
    }
    let mut dex_files: Vec<String> = Vec::new();
    let scan_fd = unsafe { libc::dup(dex_dir_fd) };
    let dir = if scan_fd >= 0 {
        unsafe { libc::fdopendir(scan_fd) }
    } else {
        ptr::null_mut()
    };
    if dir.is_null() {
        if scan_fd >= 0 {
            unsafe { libc::close(scan_fd) };
        }
        log::error("fdopendir failed while scanning dex files");
        return false;
    }

    loop {
        let entry = unsafe { libc::readdir(dir) };
        if entry.is_null() {
            break;
        }
        let name = unsafe { CStr::from_ptr((*entry).d_name.as_ptr()) };
        if let Ok(s) = name.to_str() {
            if (s.starts_with("injected") || s.starts_with("classes")) && s.contains(".dex") {
                dex_files.push(s.to_string());
            }
        }
    }
    unsafe { libc::closedir(dir) };

    if dex_files.is_empty() {
        log::error("no injected dex in module directory");
        return false;
    }
    dex_files.sort();

    let mut mapped = MmapRegions::new();
    for file in &dex_files {
        let Ok(cfile) = CString::new(file.as_str()) else {
            continue;
        };
        let fd = unsafe { libc::openat(dex_dir_fd, cfile.as_ptr(), libc::O_RDONLY | libc::O_CLOEXEC) };
        if fd < 0 {
            continue;
        }
        let mut st: libc::stat = unsafe { zeroed() };
        if unsafe { libc::fstat(fd, &raw mut st) } != 0 || st.st_size <= 0 {
            unsafe { libc::close(fd) };
            continue;
        }
        let size = st.st_size as usize;
        let ptr = unsafe { libc::mmap(ptr::null_mut(), size, libc::PROT_READ, libc::MAP_PRIVATE, fd, 0) };
        unsafe { libc::close(fd) };
        if ptr == libc::MAP_FAILED {
            continue;
        }
        mapped.regions.push((ptr, size));
    }

    if mapped.regions.is_empty() {
        log::error("failed to mmap injected dex files");
        return false;
    }

    unsafe {
        let fns = &**env;
        let loader_cls = (fns.FindClass.unwrap())(env, c"dalvik/system/InMemoryDexClassLoader".as_ptr());
        if loader_cls.is_null() {
            clear_if_exception(env);
            return false;
        }
        let init = (fns.GetMethodID.unwrap())(
            env,
            loader_cls,
            c"<init>".as_ptr(),
            c"([Ljava/nio/ByteBuffer;Ljava/lang/ClassLoader;)V".as_ptr(),
        );
        if init.is_null() {
            (fns.DeleteLocalRef.unwrap())(env, loader_cls);
            clear_if_exception(env);
            return false;
        }
        let buf_cls = (fns.FindClass.unwrap())(env, c"java/nio/ByteBuffer".as_ptr());
        let buffers = (fns.NewObjectArray.unwrap())(
            env,
            mapped.regions.len() as jsize,
            buf_cls,
            ptr::null_mut(),
        );
        (fns.DeleteLocalRef.unwrap())(env, buf_cls);
        for (i, &(ptr, size)) in mapped.regions.iter().enumerate() {
            let direct = (fns.NewDirectByteBuffer.unwrap())(env, ptr, size as jlong);
            (fns.SetObjectArrayElement.unwrap())(env, buffers, i as jsize, direct);
            (fns.DeleteLocalRef.unwrap())(env, direct);
        }
        let args = [jvalue { l: buffers }, jvalue { l: ptr::null_mut() }];
        let loader = (fns.NewObjectA.unwrap())(env, loader_cls, init, args.as_ptr());
        (fns.DeleteLocalRef.unwrap())(env, buffers);
        (fns.DeleteLocalRef.unwrap())(env, loader_cls);
        if loader.is_null() {
            clear_if_exception(env);
            log::error("InMemoryDexClassLoader failed");
            return false;
        }
        let global = (fns.NewGlobalRef.unwrap())(env, loader);
        (fns.DeleteLocalRef.unwrap())(env, loader);
        G_DEX_LOADER.store(global.cast(), Ordering::Release);
        mapped.disarm();
        log::info(&format!("loaded {} injected dex file(s) via Rust loader", mapped.regions.len()));
        true
    }
}

pub fn register_policy_channel_natives(env: *mut JNIEnv) {
    if env.is_null() || G_DEX_LOADER.load(Ordering::Acquire).is_null() {
        return;
    }
    unsafe {
        let fns = &**env;
        let cls = find_in_dex(env, c"com.causentry.zygote.PolicyChannel");
        if cls.is_null() {
            log::warn("PolicyChannel class missing in dex");
            return;
        }
        let method = JNINativeMethod {
            name: c"nativeTakePolicyFd".as_ptr().cast_mut(),
            signature: c"()I".as_ptr().cast_mut(),
            fnPtr: native_take_policy_fd as *mut c_void,
        };
        (fns.RegisterNatives.unwrap())(env, cls, &raw const method, 1);
        if clear_if_exception(env) {
            log::error("RegisterNatives PolicyChannel failed");
        }
        (fns.DeleteLocalRef.unwrap())(env, cls);
    }
}

struct NativeMethodSpec {
    name: &'static CStr,
    sig: &'static CStr,
    suffix: &'static str,
}

const FUSEHIDE_METHODS: &[NativeMethodSpec] = &[
    NativeMethodSpec { name: c"getDefaultEnableHideAllRootEntries", sig: c"()Z", suffix: "getDefaultEnableHideAllRootEntries" },
    NativeMethodSpec { name: c"getDefaultHideAllRootEntriesExemptions", sig: c"()[Ljava/lang/String;", suffix: "getDefaultHideAllRootEntriesExemptions" },
    NativeMethodSpec { name: c"getDefaultHiddenRootEntryNames", sig: c"()[Ljava/lang/String;", suffix: "getDefaultHiddenRootEntryNames" },
    NativeMethodSpec { name: c"getDefaultHiddenRelativePaths", sig: c"()[Ljava/lang/String;", suffix: "getDefaultHiddenRelativePaths" },
    NativeMethodSpec { name: c"getDefaultHiddenPackages", sig: c"()[Ljava/lang/String;", suffix: "getDefaultHiddenPackages" },
    NativeMethodSpec { name: c"getCurrentEnableHideAllRootEntries", sig: c"()Z", suffix: "getCurrentEnableHideAllRootEntries" },
    NativeMethodSpec { name: c"getCurrentHideAllRootEntriesExemptions", sig: c"()[Ljava/lang/String;", suffix: "getCurrentHideAllRootEntriesExemptions" },
    NativeMethodSpec { name: c"getCurrentEnableHideAllPublicRootEntries", sig: c"()Z", suffix: "getCurrentEnableHideAllPublicRootEntries" },
    NativeMethodSpec { name: c"getCurrentHideAllPublicRootEntriesExemptions", sig: c"()[Ljava/lang/String;", suffix: "getCurrentHideAllPublicRootEntriesExemptions" },
    NativeMethodSpec { name: c"getCurrentHiddenRootEntryNames", sig: c"()[Ljava/lang/String;", suffix: "getCurrentHiddenRootEntryNames" },
    NativeMethodSpec { name: c"getCurrentHiddenRelativePaths", sig: c"()[Ljava/lang/String;", suffix: "getCurrentHiddenRelativePaths" },
    NativeMethodSpec { name: c"getCurrentHiddenPackages", sig: c"()[Ljava/lang/String;", suffix: "getCurrentHiddenPackages" },
    NativeMethodSpec { name: c"getCurrentPackageRulePackages", sig: c"()[Ljava/lang/String;", suffix: "getCurrentPackageRulePackages" },
    NativeMethodSpec { name: c"getCurrentPackageRuleHiddenRootEntryNames", sig: c"()[Ljava/lang/String;", suffix: "getCurrentPackageRuleHiddenRootEntryNames" },
    NativeMethodSpec { name: c"getCurrentPackageRuleHiddenRelativePaths", sig: c"()[Ljava/lang/String;", suffix: "getCurrentPackageRuleHiddenRelativePaths" },
    NativeMethodSpec {
        name: c"applyHideConfig",
        sig: c"(Z[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;Z[Ljava/lang/String;)V",
        suffix: "applyHideConfig",
    },
    NativeMethodSpec { name: c"notifyPackageSetChanged", sig: c"(Ljava/lang/String;)V", suffix: "notifyPackageSetChanged" },
    NativeMethodSpec { name: c"hasCompleteFuseCallbackCoverage", sig: c"()Z", suffix: "hasCompleteFuseCallbackCoverage" },
    NativeMethodSpec { name: c"waitForHideInvalidations", sig: c"(J)Z", suffix: "waitForHideInvalidations" },
];

pub fn register_all_native_methods(env: *mut JNIEnv, fusehide_handle: *mut c_void) {
    register_policy_channel_natives(env);
    if fusehide_handle.is_null() || env.is_null() || G_DEX_LOADER.load(Ordering::Acquire).is_null() {
        return;
    }
    unsafe {
        let fns = &**env;
        let bridge = find_in_dex(env, c"io.github.xiaotong6666.fusehide.config.HideConfigNativeBridge");
        if bridge.is_null() {
            log::error("HideConfigNativeBridge not found in injected dex");
            return;
        }
        let mut methods: Vec<JNINativeMethod> = Vec::with_capacity(FUSEHIDE_METHODS.len());
        for spec in FUSEHIDE_METHODS {
            let sym_str = format!(
                "Java_io_github_xiaotong6666_fusehide_config_HideConfigNativeBridge_{}",
                spec.suffix
            );
            let Ok(csym) = CString::new(sym_str) else {
                continue;
            };
            let fn_ptr = libc::dlsym(fusehide_handle, csym.as_ptr());
            if fn_ptr.is_null() {
                continue;
            }
            methods.push(JNINativeMethod {
                name: spec.name.as_ptr().cast_mut(),
                signature: spec.sig.as_ptr().cast_mut(),
                fnPtr: fn_ptr,
            });
        }
        if !methods.is_empty() {
            (fns.RegisterNatives.unwrap())(env, bridge, methods.as_ptr(), methods.len() as jint);
            if clear_if_exception(env) {
                log::error("RegisterNatives HideConfigNativeBridge failed");
            } else {
                log::info(&format!("registered {} FuseHide native methods", methods.len()));
            }
        }
        (fns.DeleteLocalRef.unwrap())(env, bridge);
    }
}

pub fn start_injected_java(env: *mut JNIEnv) -> bool {
    if env.is_null() || G_DEX_LOADER.load(Ordering::Acquire).is_null() {
        return false;
    }
    unsafe {
        let fns = &**env;
        let entry_cls = find_in_dex(env, c"io.github.xiaotong6666.fusehide.xposed.ZygiskEntry");
        if entry_cls.is_null() {
            log::error("ZygiskEntry not found in injected dex");
            return false;
        }
        let at_cls = (fns.FindClass.unwrap())(env, c"android/app/ActivityThread".as_ptr());
        if at_cls.is_null() {
            clear_if_exception(env);
            (fns.DeleteLocalRef.unwrap())(env, entry_cls);
            return false;
        }
        let cur_app = (fns.GetStaticMethodID.unwrap())(
            env,
            at_cls,
            c"currentApplication".as_ptr(),
            c"()Landroid/app/Application;".as_ptr(),
        );
        if cur_app.is_null() {
            clear_if_exception(env);
            (fns.DeleteLocalRef.unwrap())(env, at_cls);
            (fns.DeleteLocalRef.unwrap())(env, entry_cls);
            return false;
        }
        let ctx = (fns.CallStaticObjectMethodA.unwrap())(env, at_cls, cur_app, ptr::null());
        (fns.DeleteLocalRef.unwrap())(env, at_cls);
        if ctx.is_null() {
            clear_if_exception(env);
            (fns.DeleteLocalRef.unwrap())(env, entry_cls);
            return false;
        }
        let init = (fns.GetStaticMethodID.unwrap())(
            env,
            entry_cls,
            c"init".as_ptr(),
            c"(Landroid/content/Context;)V".as_ptr(),
        );
        if init.is_null() {
            clear_if_exception(env);
            (fns.DeleteLocalRef.unwrap())(env, ctx);
            (fns.DeleteLocalRef.unwrap())(env, entry_cls);
            return false;
        }
        let args = [jvalue { l: ctx }];
        (fns.CallStaticVoidMethodA.unwrap())(env, entry_cls, init, args.as_ptr());
        let failed = clear_if_exception(env);
        (fns.DeleteLocalRef.unwrap())(env, ctx);
        (fns.DeleteLocalRef.unwrap())(env, entry_cls);
        if failed {
            log::error("ZygiskEntry.init threw exception");
            return false;
        }
        log::info("ZygiskEntry.init invoked");
        true
    }
}

pub fn start_causentry_zygote_entry(env: *mut JNIEnv) -> bool {
    if env.is_null() || G_DEX_LOADER.load(Ordering::Acquire).is_null() {
        return false;
    }
    register_policy_channel_natives(env);
    unsafe {
        let fns = &**env;
        let entry_cls = find_in_dex(env, c"com.causentry.zygote.ZygoteEntry");
        if entry_cls.is_null() {
            log::error("ZygoteEntry not found in injected dex");
            return false;
        }
        let main_id = (fns.GetStaticMethodID.unwrap())(
            env,
            entry_cls,
            c"main".as_ptr(),
            c"()V".as_ptr(),
        );
        if main_id.is_null() {
            clear_if_exception(env);
            (fns.DeleteLocalRef.unwrap())(env, entry_cls);
            return false;
        }
        (fns.CallStaticVoidMethodA.unwrap())(env, entry_cls, main_id, ptr::null());
        let failed = clear_if_exception(env);
        (fns.DeleteLocalRef.unwrap())(env, entry_cls);
        if failed {
            log::error("ZygoteEntry.main failed");
            return false;
        }
        log::info("ZygoteEntry.main invoked successfully");
        true
    }
}
