//! `extern "C"` FFI exports consumed by `libfusehide.so`.

use crate::dirent::{align_dirent_name, fuse_dirent_record_size, fuse_direntplus_record_size};
use crate::path::{
    canonicalize_hidden_entry_name, canonicalize_relative_hidden_path,
    normalize_relative_hidden_path, visible_storage_root_len,
};
use crate::unicode::{
    contains_interesting_ignorable_utf8, decode_utf8_code_point, escape_for_log,
    is_default_ignorable,
};
use std::slice;

#[repr(C)]
pub struct CausentryBuf {
    pub ptr: *mut u8,
    pub len: usize,
    pub cap: usize,
}

impl CausentryBuf {
    fn from_vec(mut v: Vec<u8>) -> Self {
        let ptr = v.as_mut_ptr();
        let len = v.len();
        let cap = v.capacity();
        std::mem::forget(v);
        Self { ptr, len, cap }
    }
}

unsafe fn slice_from_raw<'a>(ptr: *const u8, len: usize) -> &'a [u8] {
    if ptr.is_null() || len == 0 {
        &[]
    } else {
        unsafe { slice::from_raw_parts(ptr, len) }
    }
}

/// # Safety
/// `buf` must have been returned by a `causentry_fuse_*` function in this crate and freed at most once.
#[unsafe(no_mangle)]
pub unsafe extern "C" fn causentry_fuse_buf_free(buf: CausentryBuf) {
    if !buf.ptr.is_null() && buf.cap > 0 {
        // SAFETY: `buf` was allocated by `CausentryBuf::from_vec`.
        unsafe {
            drop(Vec::from_raw_parts(buf.ptr, buf.len, buf.cap));
        }
    }
}

#[unsafe(no_mangle)]
pub extern "C" fn causentry_fuse_is_default_ignorable(cp: u32) -> bool {
    is_default_ignorable(cp)
}

/// # Safety
/// `ptr` must be null or valid for `len` readable bytes.
#[unsafe(no_mangle)]
pub unsafe extern "C" fn causentry_fuse_contains_ignorable_utf8(
    ptr: *const u8,
    len: usize,
) -> bool {
    contains_interesting_ignorable_utf8(unsafe { slice_from_raw(ptr, len) })
}

/// # Safety
/// `ptr` must be null or valid for `len` readable bytes; `cp` and `width` must be null or valid writable pointers.
#[unsafe(no_mangle)]
pub unsafe extern "C" fn causentry_fuse_decode_utf8(
    ptr: *const u8,
    len: usize,
    index: usize,
    cp: *mut u32,
    width: *mut usize,
) -> bool {
    if cp.is_null() || width.is_null() {
        return false;
    }
    let data = unsafe { slice_from_raw(ptr, len) };
    if let Some((c, w)) = decode_utf8_code_point(data, index) {
        unsafe {
            *cp = c;
            *width = w;
        }
        true
    } else {
        false
    }
}

/// # Safety
/// `ptr` must be null or valid for `len` readable bytes; `out` must be null or a valid writable pointer.
#[unsafe(no_mangle)]
pub unsafe extern "C" fn causentry_fuse_escape_for_log(
    ptr: *const u8,
    len: usize,
    out: *mut CausentryBuf,
) -> bool {
    if out.is_null() {
        return false;
    }
    let escaped = escape_for_log(unsafe { slice_from_raw(ptr, len) });
    unsafe { *out = CausentryBuf::from_vec(escaped) };
    true
}

/// # Safety
/// `ptr` must be null or valid for `len` readable bytes.
#[unsafe(no_mangle)]
pub unsafe extern "C" fn causentry_fuse_visible_storage_root_len(
    ptr: *const u8,
    len: usize,
) -> usize {
    visible_storage_root_len(unsafe { slice_from_raw(ptr, len) })
}

/// # Safety
/// `ptr` must be null or valid for `len` readable bytes; `out` must be null or a valid writable pointer.
#[unsafe(no_mangle)]
pub unsafe extern "C" fn causentry_fuse_normalize_relative_path(
    ptr: *const u8,
    len: usize,
    out: *mut CausentryBuf,
) -> bool {
    if out.is_null() {
        return false;
    }
    let norm = normalize_relative_hidden_path(unsafe { slice_from_raw(ptr, len) });
    unsafe { *out = CausentryBuf::from_vec(norm) };
    true
}

/// # Safety
/// `ptr` must be null or valid for `len` readable bytes; `out` must be null or a valid writable pointer.
#[unsafe(no_mangle)]
pub unsafe extern "C" fn causentry_fuse_canonicalize_entry_name(
    ptr: *const u8,
    len: usize,
    out: *mut CausentryBuf,
) -> bool {
    if out.is_null() {
        return false;
    }
    let canon = canonicalize_hidden_entry_name(unsafe { slice_from_raw(ptr, len) });
    unsafe { *out = CausentryBuf::from_vec(canon) };
    true
}

/// # Safety
/// `ptr` must be null or valid for `len` readable bytes; `out` must be null or a valid writable pointer.
#[unsafe(no_mangle)]
pub unsafe extern "C" fn causentry_fuse_canonicalize_relative_path(
    ptr: *const u8,
    len: usize,
    out: *mut CausentryBuf,
) -> bool {
    if out.is_null() {
        return false;
    }
    let canon = canonicalize_relative_hidden_path(unsafe { slice_from_raw(ptr, len) });
    unsafe { *out = CausentryBuf::from_vec(canon) };
    true
}

/// # Safety
/// `aligned_size` must be null or a valid writable pointer.
#[unsafe(no_mangle)]
pub unsafe extern "C" fn causentry_fuse_align_dirent_name(
    name_len: usize,
    aligned_size: *mut usize,
) -> bool {
    if aligned_size.is_null() {
        return false;
    }
    match align_dirent_name(name_len) {
        Some(v) => {
            unsafe { *aligned_size = v };
            true
        }
        None => {
            unsafe { *aligned_size = 0 };
            false
        }
    }
}

/// # Safety
/// `record_size` must be null or a valid writable pointer.
#[unsafe(no_mangle)]
pub unsafe extern "C" fn causentry_fuse_dirent_record_size(
    name_len: u32,
    available: usize,
    record_size: *mut usize,
) -> bool {
    if record_size.is_null() {
        return false;
    }
    match fuse_dirent_record_size(name_len, available) {
        Some(v) => {
            unsafe { *record_size = v };
            true
        }
        None => {
            unsafe { *record_size = 0 };
            false
        }
    }
}

/// # Safety
/// `record_size` must be null or a valid writable pointer.
#[unsafe(no_mangle)]
pub unsafe extern "C" fn causentry_fuse_direntplus_record_size(
    name_len: u32,
    available: usize,
    record_size: *mut usize,
) -> bool {
    if record_size.is_null() {
        return false;
    }
    match fuse_direntplus_record_size(name_len, available) {
        Some(v) => {
            unsafe { *record_size = v };
            true
        }
        None => {
            unsafe { *record_size = 0 };
            false
        }
    }
}

#[cfg(test)]
mod tests {
    use super::*;
    use std::ptr;

    #[test]
    fn ffi_buf_roundtrip_and_free() {
        let mut buf = CausentryBuf { ptr: ptr::null_mut(), len: 0, cap: 0 };
        let input = b"/Download//Magisk/";
        assert!(unsafe {
            causentry_fuse_canonicalize_relative_path(input.as_ptr(), input.len(), &raw mut buf)
        });
        let slice = unsafe { slice::from_raw_parts(buf.ptr, buf.len) };
        assert_eq!(slice, b"download/magisk");
        unsafe { causentry_fuse_buf_free(buf) };
    }
}
