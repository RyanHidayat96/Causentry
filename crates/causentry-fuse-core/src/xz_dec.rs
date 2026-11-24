//! Pure-Rust `.gnu_debugdata` XZ decompression with strict output bounds.

use lzma_rust2::XzReader;
use std::io::{Cursor, Read};

/// Hard output limit for `.gnu_debugdata` decompression (16 MiB).
pub const MAX_GNU_DEBUGDATA_OUTPUT_BYTES: usize = 16 * 1024 * 1024;

/// Decompresses an XZ stream (typically ELF `.gnu_debugdata`) with an upper bound `max_out`.
///
/// Returns `None` on empty input, malformed streams, or if decompressed output exceeds `max_out`.
pub fn decompress_gnu_debugdata(compressed: &[u8], max_out: usize) -> Option<Vec<u8>> {
    if compressed.is_empty() || max_out == 0 {
        return None;
    }
    let limit = (max_out as u64).saturating_add(1);
    let reader = XzReader::new(Cursor::new(compressed), true);
    let mut out = Vec::with_capacity(64 * 1024);
    if reader.take(limit).read_to_end(&mut out).is_err() {
        return None;
    }
    if out.is_empty() || out.len() > max_out {
        return None;
    }
    Some(out)
}

#[cfg(test)]
mod tests {
    use super::*;

    const SAMPLE_XZ: &[u8] = &[
        0xfd, 0x37, 0x7a, 0x58, 0x5a, 0x00, 0x00, 0x04, 0xe6, 0xd6, 0xb4, 0x46, 0x02, 0x00, 0x21,
        0x01, 0x16, 0x00, 0x00, 0x00, 0x74, 0x2f, 0xe5, 0xa3, 0x01, 0x00, 0x1d, 0x68, 0x65, 0x6c,
        0x6c, 0x6f, 0x20, 0x63, 0x61, 0x75, 0x73, 0x65, 0x6e, 0x74, 0x72, 0x79, 0x20, 0x2e, 0x67,
        0x6e, 0x75, 0x5f, 0x64, 0x65, 0x62, 0x75, 0x67, 0x64, 0x61, 0x74, 0x61, 0x00, 0x00, 0x00,
        0x84, 0x70, 0x9a, 0x8f, 0xc3, 0xb4, 0x84, 0xd2, 0x00, 0x01, 0x36, 0x1e, 0x3d, 0x19, 0x95,
        0x53, 0x1f, 0xb6, 0xf3, 0x7d, 0x01, 0x00, 0x00, 0x00, 0x00, 0x04, 0x59, 0x5a,
    ];

    #[test]
    fn decompresses_valid_xz_stream() {
        let out = decompress_gnu_debugdata(SAMPLE_XZ, MAX_GNU_DEBUGDATA_OUTPUT_BYTES).unwrap();
        assert_eq!(out, b"hello causentry .gnu_debugdata");
    }

    #[test]
    fn rejects_invalid_truncated_or_oversized_streams() {
        assert_eq!(decompress_gnu_debugdata(&[], MAX_GNU_DEBUGDATA_OUTPUT_BYTES), None);
        assert_eq!(decompress_gnu_debugdata(b"not-xz-data", MAX_GNU_DEBUGDATA_OUTPUT_BYTES), None);
        assert_eq!(
            decompress_gnu_debugdata(&SAMPLE_XZ[..SAMPLE_XZ.len() - 4], MAX_GNU_DEBUGDATA_OUTPUT_BYTES),
            None
        );
        assert_eq!(decompress_gnu_debugdata(SAMPLE_XZ, 10), None);
    }
}
