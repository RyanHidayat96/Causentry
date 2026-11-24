//! `extern "C"` FFI exports consumed by `libfusehide.so`.

use crate::dirent::{
    align_dirent_name, filter_dirent_records, filter_read_out_dirent_payload,
    find_emulated_zero_direntplus_nodeid, fuse_dirent_record_size, fuse_direntplus_record_size,
    strip_sensitive_direntplus_cache,
};
use crate::elf_zip::{
    ElfDynamicInfo, compute_elf_hash, compute_gnu_hash, dynamic_symbol_count,
    find_dynamic_symbol_index, find_dynamic_symbol_index_with_gnu_hash, find_embedded_stored_elf,
    find_largest_symbol_containing, find_named_section, find_relocation_slots_for_symbol,
    find_symbol_offset, find_symbol_offsets_batch, parse_dynamic_info, parse_maps_for_marker,
    vaddr_to_file_offset,
};
use crate::path::{
    canonicalize_hidden_entry_name, canonicalize_relative_hidden_path,
    normalize_relative_hidden_path, visible_storage_root_len,
};
use crate::unicode::{
    contains_interesting_ignorable_utf8, decode_utf8_code_point, escape_for_log,
    is_default_ignorable,
};
use crate::xz_dec::decompress_gnu_debugdata;
use std::ffi::c_void;
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

#[repr(C)]
#[derive(Clone, Copy, Default)]
pub struct CausentryElfDynamicInfo {
    pub symtab: u64,
    pub strtab: u64,
    pub hash: u64,
    pub gnu_hash: u64,
    pub jmprel: u64,
    pub pltrel_size: usize,
    pub rela: u64,
    pub rela_size: usize,
    pub rel: u64,
    pub rel_size: usize,
    pub syment: usize,
    pub uses_rela: bool,
}

impl From<ElfDynamicInfo> for CausentryElfDynamicInfo {
    fn from(v: ElfDynamicInfo) -> Self {
        Self {
            symtab: v.symtab,
            strtab: v.strtab,
            hash: v.hash,
            gnu_hash: v.gnu_hash,
            jmprel: v.jmprel,
            pltrel_size: v.pltrel_size,
            rela: v.rela,
            rela_size: v.rela_size,
            rel: v.rel,
            rel_size: v.rel_size,
            syment: v.syment,
            uses_rela: v.uses_rela,
        }
    }
}

impl From<CausentryElfDynamicInfo> for ElfDynamicInfo {
    fn from(v: CausentryElfDynamicInfo) -> Self {
        Self {
            symtab: v.symtab,
            strtab: v.strtab,
            hash: v.hash,
            gnu_hash: v.gnu_hash,
            jmprel: v.jmprel,
            pltrel_size: v.pltrel_size,
            rela: v.rela,
            rela_size: v.rela_size,
            rel: v.rel,
            rel_size: v.rel_size,
            syment: v.syment,
            uses_rela: v.uses_rela,
        }
    }
}

#[repr(C)]
pub struct CausentryMapsMatch {
    pub mapped_start: u64,
    pub mapped_end: u64,
    pub file_offset: usize,
    pub exec_start: u64,
    pub exec_end: u64,
    pub exec_perms: i32,
    pub path: CausentryBuf,
}

pub type CausentryNamePredicate =
    Option<unsafe extern "C" fn(ctx: *mut c_void, name: *const u8, name_len: usize) -> bool>;
pub type CausentryDirentPredicate = Option<
    unsafe extern "C" fn(ctx: *mut c_void, ino: u64, name: *const u8, name_len: usize) -> bool,
>;

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

/// # Safety
/// `data` must be null or readable for `len` bytes; `out_nodeid` must be valid when non-null.
#[unsafe(no_mangle)]
pub unsafe extern "C" fn causentry_fuse_find_emulated_zero_nodeid(
    data: *const u8,
    len: usize,
    out_nodeid: *mut u64,
) -> bool {
    if out_nodeid.is_null() {
        return false;
    }
    match find_emulated_zero_direntplus_nodeid(unsafe { slice_from_raw(data, len) }) {
        Some(id) => {
            unsafe { *out_nodeid = id };
            true
        }
        None => false,
    }
}

/// # Safety
/// `data` must be null or readable for `len` bytes; `pred`, `out_buf`, and `out_changed` must be valid.
#[unsafe(no_mangle)]
pub unsafe extern "C" fn causentry_fuse_strip_sensitive_direntplus_cache(
    data: *const u8,
    len: usize,
    pred: CausentryNamePredicate,
    ctx: *mut c_void,
    out_buf: *mut CausentryBuf,
    out_changed: *mut usize,
) -> bool {
    let Some(pred_fn) = pred else {
        return false;
    };
    if out_buf.is_null() || out_changed.is_null() {
        return false;
    }
    let input = unsafe { slice_from_raw(data, len) };
    match strip_sensitive_direntplus_cache(input, |name| unsafe {
        pred_fn(ctx, name.as_ptr(), name.len())
    }) {
        Some((bytes, count)) => {
            unsafe {
                *out_buf = CausentryBuf::from_vec(bytes);
                *out_changed = count;
            }
            true
        }
        None => false,
    }
}

/// # Safety
/// `data` must be null or readable for `len` bytes; `pred`, `out_buf`, and `out_removed` must be valid.
#[unsafe(no_mangle)]
pub unsafe extern "C" fn causentry_fuse_filter_dirent_payload(
    data: *const u8,
    len: usize,
    is_direntplus: bool,
    pred: CausentryDirentPredicate,
    ctx: *mut c_void,
    out_buf: *mut CausentryBuf,
    out_removed: *mut usize,
) -> bool {
    let Some(pred_fn) = pred else {
        return false;
    };
    if out_buf.is_null() || out_removed.is_null() {
        return false;
    }
    let input = unsafe { slice_from_raw(data, len) };
    match filter_dirent_records(input, is_direntplus, |ino, name| unsafe {
        pred_fn(ctx, ino, name.as_ptr(), name.len())
    }) {
        Some((bytes, removed)) => {
            unsafe {
                *out_buf = CausentryBuf::from_vec(bytes);
                *out_removed = removed;
            }
            true
        }
        None => {
            unsafe { *out_removed = 0 };
            false
        }
    }
}

/// # Safety
/// `data` must be null or readable for `len` bytes; `pred`, `out_buf`, and `out_removed` must be valid.
#[unsafe(no_mangle)]
pub unsafe extern "C" fn causentry_fuse_filter_read_out_dirent_payload(
    data: *const u8,
    len: usize,
    pred: CausentryDirentPredicate,
    ctx: *mut c_void,
    out_buf: *mut CausentryBuf,
    out_removed: *mut usize,
) -> bool {
    let Some(pred_fn) = pred else {
        return false;
    };
    if out_buf.is_null() || out_removed.is_null() {
        return false;
    }
    let input = unsafe { slice_from_raw(data, len) };
    match filter_read_out_dirent_payload(input, |ino, name| unsafe {
        pred_fn(ctx, ino, name.as_ptr(), name.len())
    }) {
        Some((bytes, removed)) => {
            unsafe {
                *out_buf = CausentryBuf::from_vec(bytes);
                *out_removed = removed;
            }
            true
        }
        None => {
            unsafe { *out_removed = 0 };
            false
        }
    }
}

/// # Safety
/// `apk` / `entry_path` must be valid readable slices; output pointers must be writable.
#[unsafe(no_mangle)]
pub unsafe extern "C" fn causentry_fuse_find_embedded_stored_elf(
    apk: *const u8,
    apk_len: usize,
    entry_path: *const u8,
    entry_len: usize,
    out_offset: *mut usize,
    out_size: *mut usize,
) -> bool {
    if out_offset.is_null() || out_size.is_null() {
        return false;
    }
    let apk_slice = unsafe { slice_from_raw(apk, apk_len) };
    let entry_slice = unsafe { slice_from_raw(entry_path, entry_len) };
    match find_embedded_stored_elf(apk_slice, entry_slice) {
        Some((off, sz)) => {
            unsafe {
                *out_offset = off;
                *out_size = sz;
            }
            true
        }
        None => false,
    }
}

/// # Safety
/// `compressed` must be readable for `len` bytes; `out_buf` must be writable.
#[unsafe(no_mangle)]
pub unsafe extern "C" fn causentry_fuse_decompress_gnu_debugdata(
    compressed: *const u8,
    len: usize,
    max_out: usize,
    out_buf: *mut CausentryBuf,
) -> bool {
    if out_buf.is_null() {
        return false;
    }
    let input = unsafe { slice_from_raw(compressed, len) };
    match decompress_gnu_debugdata(input, max_out) {
        Some(bytes) => {
            unsafe { *out_buf = CausentryBuf::from_vec(bytes) };
            true
        }
        None => false,
    }
}

/// # Safety
/// `elf` / `name` must be valid readable slices; output pointers must be writable.
#[unsafe(no_mangle)]
pub unsafe extern "C" fn causentry_fuse_find_named_section(
    elf: *const u8,
    elf_len: usize,
    name: *const u8,
    name_len: usize,
    out_offset: *mut usize,
    out_size: *mut usize,
) -> bool {
    if out_offset.is_null() || out_size.is_null() {
        return false;
    }
    match find_named_section(
        unsafe { slice_from_raw(elf, elf_len) },
        unsafe { slice_from_raw(name, name_len) },
    ) {
        Some((off, sz)) => {
            unsafe {
                *out_offset = off;
                *out_size = sz;
            }
            true
        }
        None => false,
    }
}

/// # Safety
/// `elf` / `name` must be valid readable slices; `out_value` must be writable.
#[unsafe(no_mangle)]
pub unsafe extern "C" fn causentry_fuse_find_symbol_offset(
    elf: *const u8,
    elf_len: usize,
    name: *const u8,
    name_len: usize,
    out_value: *mut u64,
) -> bool {
    if out_value.is_null() {
        return false;
    }
    match find_symbol_offset(
        unsafe { slice_from_raw(elf, elf_len) },
        unsafe { slice_from_raw(name, name_len) },
        2,
    ) {
        Some(val) => {
            unsafe { *out_value = val };
            true
        }
        None => false,
    }
}

/// # Safety
/// Pointer arrays `names`, `name_lens`, `out_values`, and `out_found` must have length `count`.
#[unsafe(no_mangle)]
pub unsafe extern "C" fn causentry_fuse_find_symbol_offsets_batch(
    elf: *const u8,
    elf_len: usize,
    names: *const *const u8,
    name_lens: *const usize,
    count: usize,
    out_values: *mut u64,
    out_found: *mut bool,
) -> bool {
    if count == 0 {
        return true;
    }
    if names.is_null() || name_lens.is_null() || out_values.is_null() || out_found.is_null() {
        return false;
    }
    let elf_slice = unsafe { slice_from_raw(elf, elf_len) };
    let name_ptrs = unsafe { slice::from_raw_parts(names, count) };
    let lens = unsafe { slice::from_raw_parts(name_lens, count) };

    let mut targets = Vec::with_capacity(count);
    for (&p, &l) in name_ptrs.iter().zip(lens.iter()) {
        targets.push(unsafe { slice_from_raw(p, l) });
    }

    let resolved = find_symbol_offsets_batch(elf_slice, &targets);
    let values_out = unsafe { slice::from_raw_parts_mut(out_values, count) };
    let found_out = unsafe { slice::from_raw_parts_mut(out_found, count) };
    for (i, val) in resolved.into_iter().enumerate() {
        match val {
            Some(v) => {
                values_out[i] = v;
                found_out[i] = true;
            }
            None => {
                values_out[i] = 0;
                found_out[i] = false;
            }
        }
    }
    true
}

/// # Safety
/// `elf` / `needle` must be readable slices; output pointers must be writable.
#[unsafe(no_mangle)]
pub unsafe extern "C" fn causentry_fuse_find_largest_symbol_containing(
    elf: *const u8,
    elf_len: usize,
    needle: *const u8,
    needle_len: usize,
    out_value: *mut u64,
    out_size: *mut usize,
    out_name: *mut CausentryBuf,
) -> bool {
    if out_value.is_null() || out_size.is_null() || out_name.is_null() {
        return false;
    }
    match find_largest_symbol_containing(
        unsafe { slice_from_raw(elf, elf_len) },
        unsafe { slice_from_raw(needle, needle_len) },
    ) {
        Some(m) => {
            unsafe {
                *out_value = m.value;
                *out_size = m.size;
                *out_name = CausentryBuf::from_vec(m.name);
            }
            true
        }
        None => false,
    }
}

/// # Safety
/// `elf` must be readable for `elf_len`; `out_offset` must be writable.
#[unsafe(no_mangle)]
pub unsafe extern "C" fn causentry_fuse_vaddr_to_file_offset(
    elf: *const u8,
    elf_len: usize,
    vaddr: u64,
    out_offset: *mut usize,
) -> bool {
    if out_offset.is_null() {
        return false;
    }
    match vaddr_to_file_offset(unsafe { slice_from_raw(elf, elf_len) }, vaddr) {
        Some(off) => {
            unsafe { *out_offset = off };
            true
        }
        None => false,
    }
}

/// # Safety
/// `elf` must be readable for `elf_len`; `out_info` must be writable.
#[unsafe(no_mangle)]
pub unsafe extern "C" fn causentry_fuse_parse_dynamic_info(
    elf: *const u8,
    elf_len: usize,
    out_info: *mut CausentryElfDynamicInfo,
) -> bool {
    if out_info.is_null() {
        return false;
    }
    match parse_dynamic_info(unsafe { slice_from_raw(elf, elf_len) }) {
        Some(info) => {
            unsafe { *out_info = info.into() };
            true
        }
        None => false,
    }
}

/// # Safety
/// `name` must be null or readable for `len` bytes.
#[unsafe(no_mangle)]
pub unsafe extern "C" fn causentry_fuse_compute_gnu_hash(name: *const u8, len: usize) -> u32 {
    compute_gnu_hash(unsafe { slice_from_raw(name, len) })
}

/// # Safety
/// `name` must be null or readable for `len` bytes.
#[unsafe(no_mangle)]
pub unsafe extern "C" fn causentry_fuse_compute_elf_hash(name: *const u8, len: usize) -> u32 {
    compute_elf_hash(unsafe { slice_from_raw(name, len) })
}

/// # Safety
/// `elf` must be readable for `elf_len`; `info` must be non-null.
#[unsafe(no_mangle)]
pub unsafe extern "C" fn causentry_fuse_dynamic_symbol_count(
    elf: *const u8,
    elf_len: usize,
    info: *const CausentryElfDynamicInfo,
) -> usize {
    if info.is_null() {
        return 0;
    }
    let dyn_info: ElfDynamicInfo = unsafe { *info }.into();
    dynamic_symbol_count(unsafe { slice_from_raw(elf, elf_len) }, &dyn_info)
}

/// # Safety
/// `elf`, `info`, `name`, and `out_idx` must be valid.
#[unsafe(no_mangle)]
pub unsafe extern "C" fn causentry_fuse_find_dynamic_symbol_index_with_gnu_hash(
    elf: *const u8,
    elf_len: usize,
    info: *const CausentryElfDynamicInfo,
    name: *const u8,
    name_len: usize,
    gnu_hash: u32,
    out_idx: *mut u32,
) -> bool {
    if info.is_null() || out_idx.is_null() {
        return false;
    }
    let dyn_info: ElfDynamicInfo = unsafe { *info }.into();
    match find_dynamic_symbol_index_with_gnu_hash(
        unsafe { slice_from_raw(elf, elf_len) },
        &dyn_info,
        unsafe { slice_from_raw(name, name_len) },
        gnu_hash,
    ) {
        Some(idx) => {
            unsafe { *out_idx = idx };
            true
        }
        None => false,
    }
}

/// # Safety
/// `elf`, `info`, `name`, and `out_idx` must be valid.
#[unsafe(no_mangle)]
pub unsafe extern "C" fn causentry_fuse_find_dynamic_symbol_index(
    elf: *const u8,
    elf_len: usize,
    info: *const CausentryElfDynamicInfo,
    name: *const u8,
    name_len: usize,
    out_idx: *mut u32,
) -> bool {
    if info.is_null() || out_idx.is_null() {
        return false;
    }
    let dyn_info: ElfDynamicInfo = unsafe { *info }.into();
    match find_dynamic_symbol_index(
        unsafe { slice_from_raw(elf, elf_len) },
        &dyn_info,
        unsafe { slice_from_raw(name, name_len) },
    ) {
        Some(idx) => {
            unsafe { *out_idx = idx };
            true
        }
        None => false,
    }
}

/// # Safety
/// `elf`, `info`, and `out_u64_bytes` must be valid. Outputs packed native-endian `u64` slot addresses.
#[unsafe(no_mangle)]
pub unsafe extern "C" fn causentry_fuse_find_relocation_slots_for_symbol(
    elf: *const u8,
    elf_len: usize,
    info: *const CausentryElfDynamicInfo,
    sym_index: u32,
    load_bias: u64,
    out_u64_bytes: *mut CausentryBuf,
) -> bool {
    if info.is_null() || out_u64_bytes.is_null() {
        return false;
    }
    let dyn_info: ElfDynamicInfo = unsafe { *info }.into();
    let slots = find_relocation_slots_for_symbol(
        unsafe { slice_from_raw(elf, elf_len) },
        &dyn_info,
        sym_index,
        load_bias,
    );
    let mut raw = Vec::with_capacity(slots.len() * std::mem::size_of::<u64>());
    for s in slots {
        raw.extend_from_slice(&s.to_ne_bytes());
    }
    unsafe { *out_u64_bytes = CausentryBuf::from_vec(raw) };
    true
}

/// # Safety
/// `maps` / `marker` must be readable slices; `out_match` must be writable.
#[unsafe(no_mangle)]
pub unsafe extern "C" fn causentry_fuse_parse_maps_for_marker(
    maps: *const u8,
    maps_len: usize,
    marker: *const u8,
    marker_len: usize,
    out_match: *mut CausentryMapsMatch,
) -> bool {
    if out_match.is_null() {
        return false;
    }
    match parse_maps_for_marker(
        unsafe { slice_from_raw(maps, maps_len) },
        unsafe { slice_from_raw(marker, marker_len) },
    ) {
        Some(m) => {
            unsafe {
                *out_match = CausentryMapsMatch {
                    mapped_start: m.mapped_start,
                    mapped_end: m.mapped_end,
                    file_offset: m.file_offset,
                    exec_start: m.exec_start,
                    exec_end: m.exec_end,
                    exec_perms: m.exec_perms,
                    path: CausentryBuf::from_vec(m.path),
                };
            }
            true
        }
        None => false,
    }
}

#[cfg(test)]
mod tests {
    use super::*;
    use std::ptr;

    #[test]
    fn ffi_buf_roundtrip_and_free() {
        let mut buf = CausentryBuf {
            ptr: ptr::null_mut(),
            len: 0,
            cap: 0,
        };
        let input = b"/Download//Magisk/";
        assert!(unsafe {
            causentry_fuse_canonicalize_relative_path(input.as_ptr(), input.len(), &raw mut buf)
        });
        let slice = unsafe { slice::from_raw_parts(buf.ptr, buf.len) };
        assert_eq!(slice, b"download/magisk");
        unsafe { causentry_fuse_buf_free(buf) };
    }
}
