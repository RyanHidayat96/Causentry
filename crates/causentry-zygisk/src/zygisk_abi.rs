//! Exact Zygisk v4 C ABI layout matching `zygisk.hpp`.

#![allow(dead_code)]

use jni_sys::{JNIEnv, JNINativeMethod, jboolean, jint, jintArray, jlong, jobjectArray, jstring};
use std::ffi::{c_char, c_int, c_long, c_void};

pub const ZYGISK_API_VERSION: c_long = 4;
pub const OPTION_FORCE_DENYLIST_UNMOUNT: c_int = 0;
pub const OPTION_DLCLOSE_MODULE_LIBRARY: c_int = 1;

#[cfg(unix)]
pub type DevT = libc::dev_t;
#[cfg(unix)]
pub type InoT = libc::ino_t;
#[cfg(not(unix))]
pub type DevT = u64;
#[cfg(not(unix))]
pub type InoT = u64;

/// C++ references in `zygisk::AppSpecializeArgs` are ABI-equivalent to non-null pointers.
#[repr(C)]
pub struct AppSpecializeArgs {
    pub uid: *mut jint,
    pub gid: *mut jint,
    pub gids: *mut jintArray,
    pub runtime_flags: *mut jint,
    pub rlimits: *mut jobjectArray,
    pub mount_external: *mut jint,
    pub se_info: *mut jstring,
    pub nice_name: *mut jstring,
    pub instruction_set: *mut jstring,
    pub app_data_dir: *mut jstring,

    pub fds_to_ignore: *const jintArray,
    pub is_child_zygote: *const jboolean,
    pub is_top_app: *const jboolean,
    pub pkg_data_info_list: *const jobjectArray,
    pub whitelisted_data_info_list: *const jobjectArray,
    pub mount_data_dirs: *const jboolean,
    pub mount_storage_dirs: *const jboolean,
}

#[repr(C)]
pub struct ServerSpecializeArgs {
    pub uid: *mut jint,
    pub gid: *mut jint,
    pub gids: *mut jintArray,
    pub runtime_flags: *mut jint,
    pub permitted_capabilities: *mut jlong,
    pub effective_capabilities: *mut jlong,
}

#[repr(C)]
pub struct ModuleAbi {
    pub api_version: c_long,
    pub impl_: *mut c_void,
    pub pre_app_specialize: extern "C" fn(*mut c_void, *mut AppSpecializeArgs),
    pub post_app_specialize: extern "C" fn(*mut c_void, *const AppSpecializeArgs),
    pub pre_server_specialize: extern "C" fn(*mut c_void, *mut ServerSpecializeArgs),
    pub post_server_specialize: extern "C" fn(*mut c_void, *const ServerSpecializeArgs),
}

#[repr(C)]
pub struct ApiTable {
    pub impl_: *mut c_void,
    pub register_module: Option<extern "C" fn(*mut ApiTable, *mut ModuleAbi) -> bool>,
    pub hook_jni_native_methods:
        Option<extern "C" fn(*mut JNIEnv, *const c_char, *mut JNINativeMethod, c_int)>,
    pub plt_hook_register:
        Option<extern "C" fn(DevT, InoT, *const c_char, *mut c_void, *mut *mut c_void)>,
    pub exempt_fd: Option<extern "C" fn(c_int) -> bool>,
    pub plt_hook_commit: Option<extern "C" fn() -> bool>,
    pub connect_companion: Option<extern "C" fn(*mut c_void) -> c_int>,
    pub set_option: Option<extern "C" fn(*mut c_void, c_int)>,
    pub get_module_dir: Option<extern "C" fn(*mut c_void) -> c_int>,
    pub get_flags: Option<extern "C" fn(*mut c_void) -> u32>,
}

impl ApiTable {
    /// # Safety
    /// Must only be called with a valid `ApiTable` provided by Zygisk v4.
    pub unsafe fn connect_companion(&self) -> c_int {
        match self.connect_companion {
            Some(f) => f(self.impl_),
            None => -1,
        }
    }

    /// # Safety
    /// Must only be called with a valid `ApiTable` provided by Zygisk v4.
    pub unsafe fn get_module_dir(&self) -> c_int {
        match self.get_module_dir {
            Some(f) => f(self.impl_),
            None => -1,
        }
    }

    /// # Safety
    /// Must only be called with a valid `ApiTable` provided by Zygisk v4.
    pub unsafe fn set_option(&self, opt: c_int) {
        if let Some(f) = self.set_option {
            f(self.impl_, opt);
        }
    }

    /// # Safety
    /// Must only be called with a valid `ApiTable` provided by Zygisk v4 and a valid file descriptor.
    pub unsafe fn exempt_fd(&self, fd: c_int) -> bool {
        match self.exempt_fd {
            Some(f) => f(fd),
            None => false,
        }
    }
}

#[cfg(test)]
mod tests {
    use super::*;
    use std::mem::{offset_of, size_of};

    #[test]
    fn zygisk_v4_abi_offsets_match_header() {
        assert_eq!(offset_of!(ModuleAbi, api_version), 0);
        assert_eq!(offset_of!(ApiTable, impl_), 0);
        assert_eq!(offset_of!(ApiTable, register_module), size_of::<*mut c_void>());
        assert_eq!(offset_of!(AppSpecializeArgs, nice_name), 7 * size_of::<*mut c_void>());
    }
}
