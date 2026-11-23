use std::fs;
use std::path::{Path, PathBuf};
use std::process::Command;

use crate::ringlog::RingLog;

pub const DATA_DIR: &str = "/data/adb/causentry";
pub const SYSTEM_STATE_DIR: &str = "/data/system/causentry";
pub const CONFIG_PATH: &str = "/data/adb/causentry/config.json";
pub const INTERNAL_SOCK_PATH: &str = "/data/adb/causentry/internal.sock";
pub const CTL_SOCK_PATH: &str = "/data/adb/causentry/ctl.sock";
pub const CLOAK_POLICY_PATH: &str = "/data/system/causentry/cloak.json";
pub const LOG_PATH: &str = "/data/adb/causentry/causentry.log";

pub fn ensure_runtime_dirs() {
    let _ = fs::create_dir_all(DATA_DIR);
    let _ = fs::create_dir_all(SYSTEM_STATE_DIR);

    #[cfg(unix)]
    {
        use std::os::unix::fs::PermissionsExt;
        let _ = fs::set_permissions(DATA_DIR, fs::Permissions::from_mode(0o700));
        let _ = fs::set_permissions(SYSTEM_STATE_DIR, fs::Permissions::from_mode(0o700));
        unsafe {
            let c_sys = std::ffi::CString::new(SYSTEM_STATE_DIR).unwrap();
            libc::chown(c_sys.as_ptr(), 1000, 1000);
            let ctx = b"u:object_r:system_data_file:s0\0";
            let attr = b"security.selinux\0";
            libc::lsetxattr(
                c_sys.as_ptr(),
                attr.as_ptr() as *const libc::c_char,
                ctx.as_ptr() as *const libc::c_void,
                ctx.len(),
                0,
            );
        }
    }
}

pub fn detect_root_provider() -> String {
    if Path::new("/data/adb/ksu").exists() || Path::new("/data/adb/ksud").exists() {
        if let Ok(out) = Command::new("/data/adb/ksu/bin/ksud").arg("--version").output() {
            let v = String::from_utf8_lossy(&out.stdout).trim().to_string();
            if !v.is_empty() {
                return format!("KernelSU ({v})");
            }
        }
        return "KernelSU".to_string();
    }
    if Path::new("/data/adb/ap").exists() {
        return "APatch".to_string();
    }
    if Path::new("/data/adb/magisk").exists() || Path::new("/sbin/.magisk").exists() {
        return "Magisk".to_string();
    }
    "Root".to_string()
}

pub fn find_binary(candidates: &[&str], name: &str) -> Option<PathBuf> {
    for p in candidates {
        let path = Path::new(p);
        if path.exists() {
            return Some(path.to_path_buf());
        }
    }
    if let Ok(out) = Command::new("which").arg(name).output()
        && out.status.success()
    {
        let s = String::from_utf8_lossy(&out.stdout).trim().to_string();
        if !s.is_empty() {
            return Some(PathBuf::from(s));
        }
    }
    None
}

pub fn find_resetprop() -> Option<PathBuf> {
    find_binary(
        &[
            "/data/adb/ksu/bin/resetprop",
            "/data/adb/magisk/resetprop",
            "/data/adb/ap/bin/resetprop",
        ],
        "resetprop",
    )
}

pub fn find_susfs() -> Option<PathBuf> {
    find_binary(
        &[
            "/data/adb/ksu/bin/ksu_susfs",
            "/data/adb/ksu/bin/susfs",
            "/data/adb/magisk/ksu_susfs",
            "/data/adb/ap/bin/ksu_susfs",
            "/data/adb/ap/bin/susfs",
        ],
        "ksu_susfs",
    )
}

pub fn susfs_variant() -> String {
    let Some(bin) = find_susfs() else {
        return "unsupported".to_string();
    };
    let Ok(out) = Command::new(bin).args(["show", "variant"]).output() else {
        return "unsupported".to_string();
    };
    let v = String::from_utf8_lossy(&out.stdout).trim().to_string();
    if v.is_empty() {
        "unsupported".to_string()
    } else {
        v
    }
}

pub fn getprop(name: &str) -> String {
    let Ok(out) = Command::new("getprop").arg(name).output() else {
        return String::new();
    };
    String::from_utf8_lossy(&out.stdout).trim().to_string()
}

pub fn apply_boot_props(log: &RingLog) {
    let Some(rp) = find_resetprop() else {
        return;
    };
    let props = [
        ("ro.debuggable", "0"),
        ("ro.secure", "1"),
        ("ro.boot.verifiedbootstate", "green"),
        ("ro.boot.flash.locked", "1"),
        ("ro.boot.veritymode", "enforcing"),
        ("ro.boot.vbmeta.device_state", "locked"),
        ("sys.oem_unlock_allowed", "0"),
    ];
    for (k, v) in props {
        let cur = getprop(k);
        if cur != v {
            let _ = Command::new(&rp).args(["-n", k, v]).status();
        }
    }

    let fp = getprop("ro.build.fingerprint");
    if !fp.is_empty() {
        for p in [
            "ro.system.build.fingerprint",
            "ro.system_ext.build.fingerprint",
        ] {
            let cur = getprop(p);
            if !cur.is_empty() && cur != fp {
                let _ = Command::new(&rp).args(["-n", p, &fp]).status();
            }
        }
    }
    let inc = getprop("ro.build.version.incremental");
    if !inc.is_empty() {
        for p in [
            "ro.system.build.version.incremental",
            "ro.system_ext.build.version.incremental",
        ] {
            let cur = getprop(p);
            if !cur.is_empty() && cur != inc {
                let _ = Command::new(&rp).args(["-n", p, &inc]).status();
            }
        }
    }
    log.info("boot properties verified/aligned");
}

pub fn apply_susfs(enabled: bool, log: &RingLog) {
    if !enabled {
        return;
    }
    let Some(susfs) = find_susfs() else {
        return;
    };
    let ok = Command::new(&susfs)
        .arg("support")
        .status()
        .map(|s| s.success())
        .unwrap_or(false);
    if !ok {
        return;
    }
    let _ = Command::new(&susfs)
        .args(["hide_sus_mnts_for_non_su_procs", "1"])
        .status();
    let paths = [
        "/data/adb",
        "/data/adb/modules",
        "/data/adb/ksu",
        "/data/adb/magisk",
        "/data/adb/ap",
        "/data/magisk",
        "/sbin/.magisk",
        "/debug_ramdisk",
    ];
    for p in paths {
        if Path::new(p).exists() {
            let _ = Command::new(&susfs).args(["add_sus_path", p]).status();
        }
    }
    log.info("susfs rules refreshed");
}

pub fn force_stop_package(pkg: &str, log: &RingLog) {
    if pkg == "com.causentry.app" || pkg.is_empty() {
        return;
    }
    if let Ok(status) = Command::new("am").args(["force-stop", pkg]).status()
        && status.success()
    {
        log.info(&format!("restarted target {pkg}"));
    }
}

/// Strictly targeted verdict cache cleanup (no broad `"security"`/`"integrity"`/`"key"` wildcards).
pub fn clear_verdict_cache(pkg: &str, log: &RingLog) {
    if pkg.is_empty() {
        return;
    }
    let verdict_tokens = [
        "talsec",
        "freerasp",
        "threatcast",
        "rootbeer",
        "rootcheck",
        "integrity_baseline",
        "tapjacking",
        "debugger_detect",
    ];
    let credential_tokens = [
        "token",
        "password",
        "passwd",
        "secret",
        "credential",
        "keystore",
        "session",
        "cookie",
        "pin",
        "otp",
        "auth",
        "vkey",
    ];

    let mut cleared = 0usize;
    for base in ["/data/user/0", "/data/data"] {
        for sub in ["files/datastore", "shared_prefs"] {
            let dir = Path::new(base).join(pkg).join(sub);
            let Ok(entries) = fs::read_dir(&dir) else {
                continue;
            };
            for entry in entries.flatten() {
                let path = entry.path();
                if !path.is_file() {
                    continue;
                }
                let name_lower = entry.file_name().to_string_lossy().to_lowercase();
                if !(name_lower.ends_with(".preferences_pb") || name_lower.ends_with(".xml")) {
                    continue;
                }
                if !verdict_tokens.iter().any(|t| name_lower.contains(t)) {
                    continue;
                }
                if let Ok(bytes) = fs::read(&path) {
                    let text_lower = String::from_utf8_lossy(&bytes).to_lowercase();
                    if credential_tokens.iter().any(|t| text_lower.contains(t)) {
                        continue;
                    }
                }
                let backup_dir = Path::new(DATA_DIR).join("verdict_backups").join(pkg);
                let _ = fs::create_dir_all(&backup_dir);
                let backup_file = backup_dir.join(format!("{name_lower}.bak"));
                if !backup_file.exists() {
                    let _ = fs::copy(&path, &backup_file);
                }
                if fs::remove_file(&path).is_ok() {
                    cleared += 1;
                }
            }
        }
    }
    if cleared > 0 {
        log.info(&format!("cleared {cleared} verdict cache file(s) for {pkg}"));
    }
}

pub fn write_cold_start_policy_file(policy_json: &[u8]) {
    ensure_runtime_dirs();
    let target = Path::new(CLOAK_POLICY_PATH);
    let tmp = Path::new(SYSTEM_STATE_DIR).join(".cloak.json.tmp");
    if let Ok(mut f) = fs::File::create(&tmp) {
        use std::io::Write;
        if f.write_all(policy_json).is_ok() && f.sync_all().is_ok() {
            #[cfg(unix)]
            {
                use std::os::unix::fs::PermissionsExt;
                let _ = fs::set_permissions(&tmp, fs::Permissions::from_mode(0o640));
                unsafe {
                    let c_tmp = std::ffi::CString::new(tmp.to_string_lossy().as_ref()).unwrap();
                    libc::chown(c_tmp.as_ptr(), 1000, 1000);
                    let ctx = b"u:object_r:system_data_file:s0\0";
                    let attr = b"security.selinux\0";
                    libc::lsetxattr(
                        c_tmp.as_ptr(),
                        attr.as_ptr() as *const libc::c_char,
                        ctx.as_ptr() as *const libc::c_void,
                        ctx.len(),
                        0,
                    );
                }
            }
            let _ = fs::rename(&tmp, target);
        }
    }
}

pub fn settings_get(ns: &str, key: &str) -> String {
    let Ok(out) = Command::new("settings").args(["get", ns, key]).output() else {
        return String::new();
    };
    String::from_utf8_lossy(&out.stdout).trim().to_string()
}

pub fn grant_read_logs() {
    let _ = Command::new("pm")
        .args([
            "grant",
            "com.causentry.app",
            "android.permission.READ_LOGS",
        ])
        .status();
}
