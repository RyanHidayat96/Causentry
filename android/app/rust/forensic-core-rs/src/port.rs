//! Native logcat parser and crash trace classifier.

#![forbid(unsafe_code)]

fn java_trim(s: &str) -> &str {
    s.trim_matches(|c: char| (c as u32) <= 0x20)
}

fn json_escape(s: &str) -> String {
    let mut out = String::with_capacity(s.len() + 8);
    for ch in s.chars() {
        match ch {
            '\\' => out.push_str("\\\\"),
            '"' => out.push_str("\\\""),
            '\u{0008}' => out.push_str("\\b"),
            '\u{000C}' => out.push_str("\\f"),
            '\n' => out.push_str("\\n"),
            '\r' => out.push_str("\\r"),
            '\t' => out.push_str("\\t"),
            c if (c as u32) < 0x20 => {
                use std::fmt::Write;
                let _ = write!(out, "\\u{:04x}", c as u32);
            }
            c => out.push(c),
        }
    }
    out
}

fn is_timestamp_prefix(b: &[u8]) -> bool {
    if b.len() < 18 {
        return false;
    }
    b[0].is_ascii_digit()
        && b[1].is_ascii_digit()
        && b[2] == b'-'
        && b[3].is_ascii_digit()
        && b[4].is_ascii_digit()
        && b[5] == b' '
        && b[6].is_ascii_digit()
        && b[7].is_ascii_digit()
        && b[8] == b':'
        && b[9].is_ascii_digit()
        && b[10].is_ascii_digit()
        && b[11] == b':'
        && b[12].is_ascii_digit()
        && b[13].is_ascii_digit()
        && b[14] == b'.'
        && b[15].is_ascii_digit()
        && b[16].is_ascii_digit()
        && b[17].is_ascii_digit()
}

fn skip_spaces(b: &[u8], mut i: usize) -> usize {
    while i < b.len() && (b[i] == b' ' || b[i] == b'\t') {
        i += 1;
    }
    i
}

fn parse_positive_int_token(b: &[u8], mut i: usize) -> Option<(i32, usize)> {
    if i >= b.len() || !b[i].is_ascii_digit() {
        return None;
    }
    let mut value: i64 = 0;
    while i < b.len() && b[i].is_ascii_digit() {
        value = value
            .saturating_mul(10)
            .saturating_add(i64::from(b[i] - b'0'));
        if value > i64::from(i32::MAX) {
            value = i64::from(i32::MAX);
        }
        i += 1;
    }
    Some((value as i32, i))
}

fn extract_hint_from_start_proc(msg: &str) -> (i32, String) {
    let Some(idx) = msg.find("Start proc ") else {
        return (0, String::new());
    };
    let rest = &msg[idx + 11..];
    let Some(colon) = rest.find(':') else {
        return (0, String::new());
    };
    if colon == 0 {
        return (0, String::new());
    }
    let pid_str = java_trim(&rest[..colon]);
    let Ok(pid) = pid_str.parse::<i32>() else {
        return (0, String::new());
    };
    if pid <= 0 {
        return (0, String::new());
    }
    let after_colon = &rest[colon + 1..];
    let segment = match after_colon.find(':') {
        Some(end) => &after_colon[..end],
        None => after_colon,
    };
    let before_slash = match segment.find('/') {
        Some(slash) => &segment[..slash],
        None => segment,
    };
    let pkg = java_trim(before_slash);
    if pkg.is_empty() {
        (0, String::new())
    } else {
        (pid, pkg.to_string())
    }
}

fn extract_hint_from_android_runtime(msg: &str) -> (i32, String) {
    let Some(p_idx) = msg.find("Process: ") else {
        return (0, String::new());
    };
    let Some(pid_idx) = msg.find("PID: ") else {
        return (0, String::new());
    };
    if pid_idx <= p_idx {
        return (0, String::new());
    }
    let pkg_raw = msg[p_idx + 9..pid_idx].replace(',', "");
    let pkg_part = java_trim(&pkg_raw);
    let bytes = msg.as_bytes();
    let pid_start = skip_spaces(bytes, pid_idx + 5);
    let Some((pid, _)) = parse_positive_int_token(bytes, pid_start) else {
        return (0, String::new());
    };
    let pkg = match pkg_part.find(':') {
        Some(colon) => &pkg_part[..colon],
        None => pkg_part,
    };
    if pkg.is_empty() {
        (0, String::new())
    } else {
        (pid, pkg.to_string())
    }
}

/// Port of `parseLogcatLine` (`forensic/ForensicCore.java`).
pub fn parse_logcat_line(raw: String) -> Result<String, String> {
    let b = raw.as_bytes();
    if !is_timestamp_prefix(b) {
        return Ok(String::new());
    }
    let ts = &raw[..18];

    let pos = skip_spaces(b, 18);
    if pos == 18 {
        return Ok(String::new());
    }

    let Some((pid, pos)) = parse_positive_int_token(b, pos) else {
        return Ok(String::new());
    };

    let tid_start = skip_spaces(b, pos);
    if tid_start == pos {
        return Ok(String::new());
    }
    let Some((tid, pos)) = parse_positive_int_token(b, tid_start) else {
        return Ok(String::new());
    };

    let lvl_start = skip_spaces(b, pos);
    if lvl_start == pos || lvl_start >= b.len() {
        return Ok(String::new());
    }
    let lvl_byte = b[lvl_start];
    if !matches!(lvl_byte, b'V' | b'D' | b'I' | b'W' | b'E' | b'F') {
        return Ok(String::new());
    }
    let lvl_char = lvl_byte as char;
    let pos = lvl_start + 1;

    let tag_start = skip_spaces(b, pos);
    if tag_start == pos || tag_start >= b.len() {
        return Ok(String::new());
    }

    let rest = &raw[tag_start..];
    let Some(rel_colon) = rest.find(": ") else {
        return Ok(String::new());
    };
    let tag = java_trim(&rest[..rel_colon]);
    let msg = &rest[rel_colon + 2..];

    let (hint_pid, hint_pkg) =
        if tag == "ActivityManager" && msg.contains("Start proc") && msg.contains(':') {
            extract_hint_from_start_proc(msg)
        } else if tag == "AndroidRuntime" && msg.contains("Process: ") && msg.contains("PID: ") {
            extract_hint_from_android_runtime(msg)
        } else {
            (0, String::new())
        };

    Ok(format!(
        "{{\"ts\":\"{}\",\"pid\":{},\"tid\":{},\"lvl\":\"{}\",\"tag\":\"{}\",\"msg\":\"{}\",\"hintPid\":{},\"hintPkg\":\"{}\"}}",
        json_escape(ts),
        pid,
        tid,
        lvl_char,
        json_escape(tag),
        json_escape(msg),
        hint_pid,
        json_escape(&hint_pkg),
    ))
}

/// Port of `classifyCrashTrace` (`forensic/ForensicCore.java`).
pub fn classify_crash_trace(
    trace: String,
    pkg: String,
    crash_type: String,
) -> Result<String, String> {
    let mut title = "App Crash (FATAL EXCEPTION)";
    let mut diagnosis = "";
    let mut fix = String::new();

    if trace.contains("ArrayIndexOutOfBoundsException: length=") && trace.contains("index=-1") {
        title = "PairIP Anti-Tamper Trap";
        diagnosis =
            "Target detected root or uncloaked indicator and triggered a deliberate bounds trap.";
        fix = format!("Enable Hide Developer Options + Hide Template for {pkg}.");
    } else if trace.contains("OutOfMemoryError: Failed to allocate")
        && trace.contains("allocation with")
    {
        title = "RASP Intentional OOM Trap";
        diagnosis = "Target intentionally triggered an impossible allocation to self-terminate.";
        fix = format!("Verify Hide Template and App-Zygote settings for {pkg}.");
    } else if trace.contains("libzimperium")
        || trace.contains("libpairipcore")
        || trace.contains("libsecneo")
        || trace.contains("libdexguard")
    {
        title = "RASP Native Self-Defense";
        diagnosis = "Native security library detected an environment anomaly.";
        fix = "Ensure target is protected with system_server package cloak and SUSFS.".to_string();
    } else if crash_type == "NATIVE_CRASH" {
        title = "Native Signal Crash (SIGSEGV/SIGABRT)";
        diagnosis = "Process terminated with a native signal.";
        fix = "Inspect fault address and library offset in stack trace.".to_string();
    }

    Ok(format!(
        "{{\"title\":\"{}\",\"diagnosis\":\"{}\",\"fix\":\"{}\"}}",
        json_escape(title),
        json_escape(diagnosis),
        json_escape(&fix),
    ))
}

/// Port of `formatUptimeSeconds` (`forensic/ForensicCore.java`).
pub fn format_uptime_seconds(seconds: i64) -> Result<String, String> {
    if seconds <= 0 {
        return Ok("0s".to_string());
    }
    let h = seconds / 3600;
    let m = (seconds % 3600) / 60;
    let s = seconds % 60;
    let out = if h > 0 {
        format!("{h}h {m}m")
    } else if m > 0 {
        format!("{m}m {s}s")
    } else {
        format!("{s}s")
    };
    Ok(out)
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn parses_start_proc_and_pairip() {
        let parsed = parse_logcat_line(
            "11-23 14:22:01.123  1234  5678 I ActivityManager: Start proc 9876:com.gojek.app/u0a245 for activity"
                .to_string(),
        )
        .unwrap();
        assert!(parsed.contains("\"hintPid\":9876"));
        assert!(parsed.contains("\"hintPkg\":\"com.gojek.app\""));

        let crash = classify_crash_trace(
            "ArrayIndexOutOfBoundsException: length=4; index=-1".to_string(),
            "com.gojek.app".to_string(),
            "JAVA_CRASH".to_string(),
        )
        .unwrap();
        assert!(crash.contains("PairIP Anti-Tamper Trap"));
        assert_eq!(format_uptime_seconds(3665).unwrap(), "1h 1m");
    }
}
