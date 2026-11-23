use std::collections::BTreeMap;
use std::fs;
use std::path::Path;

use crate::config::valid_package_name;

pub const PACKAGES_LIST_PATH: &str = "/data/system/packages.list";
pub const CONTROL_APP_PKG: &str = "com.causentry.app";

pub fn read_package_uids() -> BTreeMap<String, u32> {
    read_package_uids_from(Path::new(PACKAGES_LIST_PATH))
}

pub fn read_package_uids_from(path: &Path) -> BTreeMap<String, u32> {
    let mut map = BTreeMap::new();
    let Ok(content) = fs::read_to_string(path) else {
        return map;
    };
    for line in content.lines() {
        let mut parts = line.split_whitespace();
        let Some(pkg) = parts.next() else { continue };
        let Some(uid_str) = parts.next() else { continue };
        if !valid_package_name(pkg) {
            continue;
        }
        if let Ok(uid) = uid_str.parse::<u32>() {
            map.insert(pkg.to_string(), uid);
        }
    }
    map
}

pub fn control_app_uid(pkg_uids: &BTreeMap<String, u32>) -> Option<u32> {
    pkg_uids.get(CONTROL_APP_PKG).copied()
}

#[cfg(test)]
mod tests {
    use super::*;
    use std::io::Write;

    #[test]
    fn parses_packages_list_lines() {
        let dir = std::env::temp_dir();
        let path = dir.join("causentry_test_packages.list");
        {
            let mut f = fs::File::create(&path).unwrap();
            writeln!(f, "com.gojek.app 10313 0 /data/user/0/com.gojek.app default:targetSdkVersion=35 none 0 1").unwrap();
            writeln!(f, "com.causentry.app 10412 0 /data/user/0/com.causentry.app default:targetSdkVersion=35 none 0 1").unwrap();
            writeln!(f, "invalid_no_dot 10999 0 /data/user/0/x").unwrap();
        }
        let parsed = read_package_uids_from(&path);
        let _ = fs::remove_file(&path);
        assert_eq!(parsed.get("com.gojek.app"), Some(&10313));
        assert_eq!(control_app_uid(&parsed), Some(10412));
        assert!(!parsed.contains_key("invalid_no_dot"));
    }
}
