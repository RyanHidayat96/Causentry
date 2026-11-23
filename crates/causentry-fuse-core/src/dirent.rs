//! Overflow-checked FUSE `fuse_dirent` & `fuse_direntplus` wire-format bounds and filtering.

/// `offsetof(struct fuse_dirent, name)` = 8 (ino) + 8 (off) + 4 (namelen) + 4 (type) = 24 bytes.
pub const FUSE_DIRENT_HEADER_SIZE: usize = 24;

/// `sizeof(struct fuse_entry_out)` on Android/Linux FUSE ABI = 128 bytes.
pub const FUSE_ENTRY_OUT_WIRE_SIZE: usize = 128;

/// `sizeof(struct fuse_entry_out) + offsetof(struct fuse_dirent, name)` = 152 bytes.
pub const FUSE_DIRENTPLUS_HEADER_SIZE: usize = FUSE_ENTRY_OUT_WIRE_SIZE + FUSE_DIRENT_HEADER_SIZE;

/// Aligns a dirent name length up to 8 bytes with overflow protection.
pub fn align_dirent_name(name_len: usize) -> Option<usize> {
    const ALIGN: usize = 8;
    name_len.checked_add(ALIGN - 1).map(|v| v & !(ALIGN - 1))
}

/// Computes the total wire size of a `fuse_dirent` record if it fits within `available` bytes.
pub fn fuse_dirent_record_size(name_len: u32, available: usize) -> Option<usize> {
    let nlen = name_len as usize;
    if available < FUSE_DIRENT_HEADER_SIZE || nlen > available - FUSE_DIRENT_HEADER_SIZE {
        return None;
    }
    let aligned = align_dirent_name(nlen)?;
    if aligned > available - FUSE_DIRENT_HEADER_SIZE {
        return None;
    }
    Some(FUSE_DIRENT_HEADER_SIZE + aligned)
}

/// Computes the total wire size of a `fuse_direntplus` record if it fits within `available` bytes.
pub fn fuse_direntplus_record_size(name_len: u32, available: usize) -> Option<usize> {
    let nlen = name_len as usize;
    if available < FUSE_DIRENTPLUS_HEADER_SIZE || nlen > available - FUSE_DIRENTPLUS_HEADER_SIZE {
        return None;
    }
    let aligned = align_dirent_name(nlen)?;
    if aligned > available - FUSE_DIRENTPLUS_HEADER_SIZE {
        return None;
    }
    Some(FUSE_DIRENTPLUS_HEADER_SIZE + aligned)
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn alignment_and_overflow_checks() {
        assert_eq!(align_dirent_name(0), Some(0));
        assert_eq!(align_dirent_name(1), Some(8));
        assert_eq!(align_dirent_name(8), Some(8));
        assert_eq!(align_dirent_name(9), Some(16));
        assert_eq!(align_dirent_name(usize::MAX), None);
    }

    #[test]
    fn dirent_and_direntplus_bounds() {
        // 24 header + align8(4) = 32
        assert_eq!(fuse_dirent_record_size(4, 32), Some(32));
        // Truncated by 1 byte -> rejected safely
        assert_eq!(fuse_dirent_record_size(4, 31), None);
        // Overflow namelen -> rejected safely
        assert_eq!(fuse_dirent_record_size(u32::MAX, 4096), None);
        // direntplus: 152 header + align8(6) = 160
        assert_eq!(fuse_direntplus_record_size(6, 160), Some(160));
        assert_eq!(fuse_direntplus_record_size(6, 159), None);
    }
}
