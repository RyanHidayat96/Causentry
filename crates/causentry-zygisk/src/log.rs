//! Android logcat logging helpers (`CausentryNative` tag).

#[cfg(target_os = "android")]
use std::ffi::CString;

#[cfg(target_os = "android")]
const ANDROID_LOG_INFO: libc::c_int = 4;
#[cfg(target_os = "android")]
const ANDROID_LOG_WARN: libc::c_int = 5;
#[cfg(target_os = "android")]
const ANDROID_LOG_ERROR: libc::c_int = 6;

#[cfg(target_os = "android")]
unsafe extern "C" {
    fn __android_log_write(
        prio: libc::c_int,
        tag: *const libc::c_char,
        text: *const libc::c_char,
    ) -> libc::c_int;
}

#[cfg(target_os = "android")]
fn write_log(prio: libc::c_int, msg: &str) {
    if let Ok(cmsg) = CString::new(msg) {
        // SAFETY: static NUL-terminated tag and freshly allocated NUL-terminated cmsg.
        unsafe {
            __android_log_write(prio, c"CausentryNative".as_ptr(), cmsg.as_ptr());
        }
    }
}

#[cfg(not(target_os = "android"))]
fn write_log(_prio: i32, _msg: &str) {}

pub fn info(msg: &str) {
    #[cfg(target_os = "android")]
    write_log(ANDROID_LOG_INFO, msg);
    #[cfg(not(target_os = "android"))]
    write_log(4, msg);
}

pub fn warn(msg: &str) {
    #[cfg(target_os = "android")]
    write_log(ANDROID_LOG_WARN, msg);
    #[cfg(not(target_os = "android"))]
    write_log(5, msg);
}

pub fn error(msg: &str) {
    #[cfg(target_os = "android")]
    write_log(ANDROID_LOG_ERROR, msg);
    #[cfg(not(target_os = "android"))]
    write_log(6, msg);
}
