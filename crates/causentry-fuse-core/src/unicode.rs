//! Unicode 12.1 default-ignorable code points & strict UTF-8 decoding (matching Android kernel casefold).

/// Matches `DerivedCoreProperties.txt` / `Default_Ignorable_Code_Point` (Unicode 12.1.0).
pub const fn is_default_ignorable(cp: u32) -> bool {
    matches!(
        cp,
        0x00AD
            | 0x034F
            | 0x061C
            | 0x115F..=0x1160
            | 0x17B4..=0x17B5
            | 0x180B..=0x180E
            | 0x200B..=0x200F
            | 0x202A..=0x202E
            | 0x2060..=0x206F
            | 0x3164
            | 0xFE00..=0xFE0F
            | 0xFEFF
            | 0xFFA0
            | 0xFFF0..=0xFFF8
            | 0x1BCA0..=0x1BCA3
            | 0x1D173..=0x1D17A
            | 0xE0000..=0xE0FFF
    )
}

/// Checks for common zero-width / BOM UTF-8 sequences used to evade path filters.
pub fn contains_interesting_ignorable_utf8(bytes: &[u8]) -> bool {
    const PATTERNS: [&[u8]; 5] = [
        b"\xE2\x80\x8B", // U+200B
        b"\xE2\x80\x8C", // U+200C
        b"\xE2\x80\x8D", // U+200D
        b"\xE2\x81\xA0", // U+2060
        b"\xEF\xBB\xBF", // U+FEFF
    ];
    PATTERNS
        .iter()
        .any(|pat| bytes.windows(pat.len()).any(|w| w == *pat))
}

/// Strict UTF-8 decoder rejecting overlongs, UTF-16 surrogates, and >U+10FFFF.
pub fn decode_utf8_code_point(data: &[u8], index: usize) -> Option<(u32, usize)> {
    let b0 = *data.get(index)?;
    if b0 < 0x80 {
        return Some((u32::from(b0), 1));
    }

    let b1 = *data.get(index + 1)?;
    if b0 < 0xE0 {
        if b0 <= 0xC1 || (b1 ^ 0x80) >= 0x40 {
            return None;
        }
        let cp = ((u32::from(b0 & 0x1F)) << 6) | u32::from(b1 & 0x3F);
        return Some((cp, 2));
    }

    let b2 = *data.get(index + 2)?;
    if b0 < 0xF0 {
        if (b0 == 0xE0 && b1 < 0xA0)
            || (b0 == 0xED && b1 >= 0xA0)
            || (b1 ^ 0x80) >= 0x40
            || (b2 ^ 0x80) >= 0x40
        {
            return None;
        }
        let cp = ((u32::from(b0 & 0x0F)) << 12)
            | ((u32::from(b1 & 0x3F)) << 6)
            | u32::from(b2 & 0x3F);
        return Some((cp, 3));
    }

    if b0 >= 0xF5 {
        return None;
    }
    let b3 = *data.get(index + 3)?;
    if (b0 == 0xF0 && b1 < 0x90)
        || (b0 == 0xF4 && b1 >= 0x90)
        || (b1 ^ 0x80) >= 0x40
        || (b2 ^ 0x80) >= 0x40
        || (b3 ^ 0x80) >= 0x40
    {
        return None;
    }
    let cp = ((u32::from(b0 & 0x07)) << 18)
        | ((u32::from(b1 & 0x3F)) << 12)
        | ((u32::from(b2 & 0x3F)) << 6)
        | u32::from(b3 & 0x3F);
    Some((cp, 4))
}

/// Escapes non-printable bytes as `\xHH` for safe log output.
pub fn escape_for_log(data: &[u8]) -> Vec<u8> {
    const HEX: &[u8; 16] = b"0123456789abcdef";
    let mut out = Vec::with_capacity(data.len().saturating_mul(2));
    for &b in data {
        if (0x20..=0x7E).contains(&b) {
            out.push(b);
        } else {
            out.extend_from_slice(&[
                b'\\',
                b'x',
                HEX[(b >> 4) as usize],
                HEX[(b & 0x0F) as usize],
            ]);
        }
    }
    out
}

/// Strips Unicode 12.1 default-ignorable code points from UTF-8 bytes while preserving non-ignorable bytes.
pub fn strip_default_ignorables(data: &[u8]) -> Vec<u8> {
    let mut out = Vec::with_capacity(data.len());
    let mut i = 0;
    while i < data.len() {
        if let Some((cp, width)) = decode_utf8_code_point(data, i) {
            if !is_default_ignorable(cp) {
                out.extend_from_slice(&data[i..i + width]);
            }
            i += width;
        } else {
            out.push(data[i]);
            i += 1;
        }
    }
    out
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn rejects_overlong_and_surrogate_utf8() {
        // Overlong '/' (C0 AF)
        assert_eq!(decode_utf8_code_point(&[0xC0, 0xAF], 0), None);
        // UTF-16 surrogate U+D800 (ED A0 80)
        assert_eq!(decode_utf8_code_point(&[0xED, 0xA0, 0x80], 0), None);
        // > U+10FFFF (F4 90 80 80)
        assert_eq!(decode_utf8_code_point(&[0xF4, 0x90, 0x80, 0x80], 0), None);
        // Valid 4-byte emoji U+1F6E1 (F0 9F 9B A1)
        assert_eq!(decode_utf8_code_point("\u{1F6E1}".as_bytes(), 0), Some((0x1F6E1, 4)));
    }

    #[test]
    fn strips_zero_width_bypass_characters() {
        let sneaky = "\u{200B}M\u{FEFF}agisk\u{200D}";
        assert!(contains_interesting_ignorable_utf8(sneaky.as_bytes()));
        assert_eq!(strip_default_ignorables(sneaky.as_bytes()), b"Magisk");
    }

    #[test]
    fn escapes_control_bytes_for_log() {
        assert_eq!(escape_for_log(b"ab\x00\xff"), b"ab\\x00\\xff");
    }
}
