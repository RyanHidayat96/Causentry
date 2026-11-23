//! Storage root detection, slash normalization, and canonical matching for FuseHide.

use crate::unicode::strip_default_ignorables;

/// Returns the byte length of the visible storage root prefix (`/storage/emulated/0` or
/// `/storage/XXXX-XXXX`), or `0` if `path` is not under a visible storage root.
pub fn visible_storage_root_len(path: &[u8]) -> usize {
    const PRIMARY: &[u8] = b"/storage/emulated/0";
    if path == PRIMARY || (path.len() > PRIMARY.len() && path.starts_with(PRIMARY) && path[PRIMARY.len()] == b'/') {
        return PRIMARY.len();
    }

    const PREFIX: &[u8] = b"/storage/";
    if !path.starts_with(PREFIX) || path.len() < PREFIX.len() + 9 {
        return 0;
    }
    let volume = &path[PREFIX.len()..PREFIX.len() + 9];
    for (idx, &ch) in volume.iter().enumerate() {
        if idx == 4 {
            if ch != b'-' {
                return 0;
            }
        } else if !ch.is_ascii_hexdigit() {
            return 0;
        }
    }
    let end = PREFIX.len() + 9;
    if path.len() != end && path[end] != b'/' {
        return 0;
    }
    end
}

/// Trims leading/trailing `/` and collapses consecutive `/` into a single `/`.
pub fn normalize_relative_hidden_path(path: &[u8]) -> Vec<u8> {
    let mut begin = 0;
    let mut end = path.len();
    while begin < end && path[begin] == b'/' {
        begin += 1;
    }
    while end > begin && path[end - 1] == b'/' {
        end -= 1;
    }
    let slice = &path[begin..end];
    let mut out = Vec::with_capacity(slice.len());
    let mut prev_slash = false;
    for &ch in slice {
        if ch == b'/' {
            if prev_slash {
                continue;
            }
            prev_slash = true;
        } else {
            prev_slash = false;
        }
        out.push(ch);
    }
    out
}

fn fold_ascii_lowercase(buf: &mut [u8]) {
    for b in buf.iter_mut() {
        if b.is_ascii_uppercase() {
            *b = b.to_ascii_lowercase();
        }
    }
}

/// Strips Unicode 12.1 default-ignorable code points and ASCII-folds to lowercase.
pub fn canonicalize_hidden_entry_name(name: &[u8]) -> Vec<u8> {
    let mut out = strip_default_ignorables(name);
    fold_ascii_lowercase(&mut out);
    out
}

/// Strips default-ignorable code points, normalizes slashes, and ASCII-folds to lowercase.
pub fn canonicalize_relative_hidden_path(path: &[u8]) -> Vec<u8> {
    let stripped = strip_default_ignorables(path);
    let mut normalized = normalize_relative_hidden_path(&stripped);
    fold_ascii_lowercase(&mut normalized);
    normalized
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn detects_emulated_and_sdcard_roots() {
        assert_eq!(visible_storage_root_len(b"/storage/emulated/0"), 19);
        assert_eq!(visible_storage_root_len(b"/storage/emulated/0/TWRP"), 19);
        assert_eq!(visible_storage_root_len(b"/storage/emulated/01"), 0);
        assert_eq!(visible_storage_root_len(b"/storage/1A2B-3C4D/Download"), 18);
        assert_eq!(visible_storage_root_len(b"/storage/ZZZZ-1234/Download"), 0);
    }

    #[test]
    fn normalizes_and_canonicalizes_paths() {
        assert_eq!(normalize_relative_hidden_path(b"///Download//Magisk///"), b"Download/Magisk");
        assert_eq!(
            canonicalize_hidden_entry_name("\u{200B}TWRP".as_bytes()),
            b"twrp"
        );
        assert_eq!(
            canonicalize_relative_hidden_path("/Download//Kernel\u{FEFF}SU/".as_bytes()),
            b"download/kernelsu"
        );
    }
}
