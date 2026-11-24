//! Overflow-checked FUSE `fuse_dirent`, `fuse_direntplus`, and `fuse_read_out` filtering.

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

fn read_u32_le(bytes: &[u8], off: usize) -> Option<u32> {
    let s = bytes.get(off..off.checked_add(4)?)?;
    Some(u32::from_le_bytes([s[0], s[1], s[2], s[3]]))
}

fn read_u64_le(bytes: &[u8], off: usize) -> Option<u64> {
    let s = bytes.get(off..off.checked_add(8)?)?;
    Some(u64::from_le_bytes([
        s[0], s[1], s[2], s[3], s[4], s[5], s[6], s[7],
    ]))
}

fn validate_direntplus_name(bytes: &[u8]) -> bool {
    !bytes.is_empty() && bytes.len() <= 255 && !bytes.contains(&b'/') && !bytes.contains(&0)
}

/// Extracts the unique kernel nodeid (> 1) of child `"0"` from a verified READDIRPLUS root page.
pub fn find_emulated_zero_direntplus_nodeid(input: &[u8]) -> Option<u64> {
    if input.is_empty() {
        return None;
    }
    let mut at = 0usize;
    let mut found: Option<u64> = None;

    while at < input.len() {
        let remaining = input.len() - at;
        let len = read_u32_le(input, at + FUSE_ENTRY_OUT_WIRE_SIZE + 16)?;
        if len == 0 || len > 255 {
            return None;
        }
        let record_size = fuse_direntplus_record_size(len, remaining)?;
        let name = input.get(at + FUSE_DIRENTPLUS_HEADER_SIZE..at + FUSE_DIRENTPLUS_HEADER_SIZE + len as usize)?;
        if !validate_direntplus_name(name) {
            return None;
        }
        if name == b"0" {
            let nodeid = read_u64_le(input, at)?;
            if nodeid <= 1 || found.is_some() {
                return None;
            }
            found = Some(nodeid);
        }
        at += record_size;
    }

    if at == input.len() {
        found
    } else {
        None
    }
}

/// Copies a validated READDIRPLUS page and zeroes kernel dcache TTLs for matched entries.
pub fn strip_sensitive_direntplus_cache<F>(
    input: &[u8],
    mut matches_name: F,
) -> Option<(Vec<u8>, usize)>
where
    F: FnMut(&[u8]) -> bool,
{
    const VALIDITY_OFFSET: usize = 16;
    const VALIDITY_SIZE: usize = 24;

    if input.is_empty() {
        return None;
    }

    let mut offsets = Vec::new();
    let mut at = 0usize;
    while at < input.len() {
        let remaining = input.len() - at;
        let len = read_u32_le(input, at + FUSE_ENTRY_OUT_WIRE_SIZE + 16)?;
        if len == 0 || len > 255 {
            return None;
        }
        let record_size = fuse_direntplus_record_size(len, remaining)?;
        let name = input.get(at + FUSE_DIRENTPLUS_HEADER_SIZE..at + FUSE_DIRENTPLUS_HEADER_SIZE + len as usize)?;
        if !validate_direntplus_name(name) {
            return None;
        }
        if matches_name(name) {
            offsets.push(at);
        }
        at += record_size;
    }

    if at != input.len() || offsets.is_empty() {
        return None;
    }

    let mut out = input.to_vec();
    for record in &offsets {
        if let Some(slice) = out.get_mut(record + VALIDITY_OFFSET..record + VALIDITY_OFFSET + VALIDITY_SIZE) {
            slice.fill(0);
        }
    }
    Some((out, offsets.len()))
}

/// Filters a complete `fuse_dirent` or `fuse_direntplus` payload using `should_remove(ino, name)`.
///
/// Returns `Some((filtered_bytes, removed_count))` iff the buffer is well-formed and at least one
/// entry was removed.
pub fn filter_dirent_records<F>(
    input: &[u8],
    is_direntplus: bool,
    mut should_remove: F,
) -> Option<(Vec<u8>, usize)>
where
    F: FnMut(u64, &[u8]) -> bool,
{
    if input.is_empty() {
        return None;
    }

    let base_prefix = if is_direntplus { FUSE_ENTRY_OUT_WIRE_SIZE } else { 0 };
    let header_size = base_prefix + FUSE_DIRENT_HEADER_SIZE;

    let mut out = Vec::with_capacity(input.len());
    let mut offset = 0usize;
    let mut removed = 0usize;

    while offset < input.len() {
        let remaining = input.len() - offset;
        let ino = read_u64_le(input, offset + base_prefix)?;
        let namelen = read_u32_le(input, offset + base_prefix + 16)?;
        let record_size = if is_direntplus {
            fuse_direntplus_record_size(namelen, remaining)?
        } else {
            fuse_dirent_record_size(namelen, remaining)?
        };
        let name = input.get(offset + header_size..offset + header_size + namelen as usize)?;
        if should_remove(ino, name) {
            removed += 1;
        } else {
            out.extend_from_slice(&input[offset..offset + record_size]);
        }
        offset += record_size;
    }

    if offset != input.len() || removed == 0 {
        return None;
    }
    Some((out, removed))
}

/// Filters a `fuse_read_out` (4-byte little-endian payload size) + `fuse_dirent` payload.
pub fn filter_read_out_dirent_payload<F>(
    input: &[u8],
    should_remove: F,
) -> Option<(Vec<u8>, usize)>
where
    F: FnMut(u64, &[u8]) -> bool,
{
    const FUSE_READ_OUT_SIZE: usize = 4;
    if input.len() <= FUSE_READ_OUT_SIZE {
        return None;
    }
    let declared_size = read_u32_le(input, 0)? as usize;
    let payload_size = declared_size.min(input.len() - FUSE_READ_OUT_SIZE);
    let payload = &input[FUSE_READ_OUT_SIZE..FUSE_READ_OUT_SIZE + payload_size];

    let (filtered_payload, removed) = filter_dirent_records(payload, false, should_remove)?;
    let patched_len = u32::try_from(filtered_payload.len()).ok()?;

    let mut patched = Vec::with_capacity(FUSE_READ_OUT_SIZE + filtered_payload.len());
    patched.extend_from_slice(&patched_len.to_le_bytes());
    patched.extend_from_slice(&filtered_payload);
    Some((patched, removed))
}

#[cfg(test)]
mod tests {
    use super::*;

    fn make_dirent(ino: u64, off: u64, name: &[u8], typ: u32) -> Vec<u8> {
        let aligned = align_dirent_name(name.len()).unwrap();
        let mut buf = Vec::with_capacity(FUSE_DIRENT_HEADER_SIZE + aligned);
        buf.extend_from_slice(&ino.to_le_bytes());
        buf.extend_from_slice(&off.to_le_bytes());
        buf.extend_from_slice(&(name.len() as u32).to_le_bytes());
        buf.extend_from_slice(&typ.to_le_bytes());
        buf.extend_from_slice(name);
        buf.resize(FUSE_DIRENT_HEADER_SIZE + aligned, 0);
        buf
    }

    fn make_direntplus(nodeid: u64, ino: u64, name: &[u8]) -> Vec<u8> {
        let mut entry_out = vec![0xAAu8; FUSE_ENTRY_OUT_WIRE_SIZE];
        entry_out[0..8].copy_from_slice(&nodeid.to_le_bytes());
        entry_out.extend_from_slice(&make_dirent(ino, 1, name, 4));
        entry_out
    }

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
        assert_eq!(fuse_dirent_record_size(4, 32), Some(32));
        assert_eq!(fuse_dirent_record_size(4, 31), None);
        assert_eq!(fuse_dirent_record_size(u32::MAX, 4096), None);
        assert_eq!(fuse_direntplus_record_size(6, 160), Some(160));
        assert_eq!(fuse_direntplus_record_size(6, 159), None);
    }

    #[test]
    fn extracts_zero_nodeid_and_strips_cache_ttls() {
        let mut page = make_direntplus(42, 42, b"0");
        page.extend_from_slice(&make_direntplus(99, 99, b"TWRP"));

        assert_eq!(find_emulated_zero_direntplus_nodeid(&page), Some(42));
        // Truncated page is rejected safely
        assert_eq!(find_emulated_zero_direntplus_nodeid(&page[..page.len() - 1]), None);

        let (stripped, changed) =
            strip_sensitive_direntplus_cache(&page, |n| n == b"TWRP").unwrap();
        assert_eq!(changed, 1);
        // Unmatched entry kept its non-zero TTLs, matched entry had +16..+40 zeroed
        assert_ne!(&stripped[16..40], &[0u8; 24]);
        let second_off = make_direntplus(42, 42, b"0").len();
        assert_eq!(&stripped[second_off + 16..second_off + 40], &[0u8; 24]);
    }

    #[test]
    fn filters_dirent_and_read_out_payloads() {
        let mut payload = make_dirent(10, 1, b"DCIM", 4);
        let twrp = make_dirent(11, 2, b"TWRP", 4);
        let docs = make_dirent(12, 3, b"Download", 4);
        payload.extend_from_slice(&twrp);
        payload.extend_from_slice(&docs);

        let (filtered, removed) =
            filter_dirent_records(&payload, false, |_, name| name == b"TWRP").unwrap();
        assert_eq!(removed, 1);
        assert_eq!(filtered.len(), payload.len() - twrp.len());

        let mut read_out = (payload.len() as u32).to_le_bytes().to_vec();
        read_out.extend_from_slice(&payload);
        let (patched, r2) =
            filter_read_out_dirent_payload(&read_out, |ino, _| ino == 11).unwrap();
        assert_eq!(r2, 1);
        assert_eq!(read_u32_le(&patched, 0), Some(filtered.len() as u32));
        assert_eq!(&patched[4..], filtered.as_slice());
    }
}
