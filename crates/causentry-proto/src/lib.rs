//! Shared protocol definitions for `causentryd` and `causentry-zygisk`.

use std::io::{self, Read, Write};

/// Hard ceiling on a single framed IPC message (4 MiB).
pub const MAX_FRAME_BYTES: usize = 4 * 1024 * 1024;

/// Internal Unix domain socket served by `causentryd` for Zygisk Companion FD handoff.
pub const INTERNAL_SOCK_PATH: &str = "/data/adb/causentry/internal.sock";

/// Cold-start fallback cloak snapshot readable by `system_server`.
pub const CLOAK_FALLBACK_PATH: &str = "/data/system/causentry/cloak.json";

/// Target process classification passed from Zygisk to the Root Companion.
#[repr(i32)]
#[derive(Debug, Clone, Copy, PartialEq, Eq)]
pub enum TargetProcess {
    None = -1,
    MediaAosp = 0,
    MediaGoogle = 1,
    Settings = 2,
    SystemServer = 3,
}

/// Wire-level handshake sent over the Zygisk Companion Unix socket.
#[repr(C)]
#[derive(Debug, Clone, Copy, PartialEq, Eq)]
pub struct CompanionHandshake {
    pub target: i32,
    pub pid: i32,
}

/// Reads a single 4-byte big-endian length-prefixed frame.
pub fn read_frame<R: Read>(reader: &mut R) -> io::Result<Vec<u8>> {
    let mut len_buf = [0u8; 4];
    reader.read_exact(&mut len_buf)?;
    let len = u32::from_be_bytes(len_buf) as usize;
    if len == 0 || len > MAX_FRAME_BYTES {
        return Err(io::Error::new(
            io::ErrorKind::InvalidData,
            format!("invalid frame length: {len}"),
        ));
    }
    let mut payload = vec![0u8; len];
    reader.read_exact(&mut payload)?;
    Ok(payload)
}

/// Writes a single 4-byte big-endian length-prefixed frame.
pub fn write_frame<W: Write>(writer: &mut W, payload: &[u8]) -> io::Result<()> {
    if payload.len() > MAX_FRAME_BYTES {
        return Err(io::Error::new(
            io::ErrorKind::InvalidInput,
            format!("frame too large: {}", payload.len()),
        ));
    }
    let len_bytes = (payload.len() as u32).to_be_bytes();
    writer.write_all(&len_bytes)?;
    writer.write_all(payload)?;
    writer.flush()
}

#[cfg(test)]
mod tests {
    use super::*;
    use std::io::Cursor;

    #[test]
    fn frame_roundtrip_and_limits() {
        let mut buf = Vec::new();
        let data = br#"{"action":"get_status"}"#;
        write_frame(&mut buf, data).unwrap();
        let mut cursor = Cursor::new(buf);
        assert_eq!(read_frame(&mut cursor).unwrap(), data);

        let huge = ((MAX_FRAME_BYTES as u32) + 1).to_be_bytes();
        let mut bad = Cursor::new(huge.to_vec());
        assert!(read_frame(&mut bad).is_err());
    }

    #[test]
    fn companion_handshake_abi_size() {
        assert_eq!(std::mem::size_of::<CompanionHandshake>(), 8);
        assert_eq!(TargetProcess::SystemServer as i32, 3);
    }
}
