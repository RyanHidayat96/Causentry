use std::collections::{BTreeMap, BTreeSet};
use std::fs::{self, File};
use std::io::{self, Write};
use std::path::Path;

use serde::{Deserialize, Serialize};

pub const DEFAULT_HIDDEN_ROOT_ENTRIES: &[&str] = &[
    "MT2",
    "TWRP",
    "twrp",
    "Fox",
    "OrangeFox",
    "su",
    "daemonsu",
    "Magisk",
    "magisk",
    ".magisk",
    "SuperSU",
    "KernelSU",
    "APatch",
    "busybox",
    "TitaniumBackup",
    "SwiftBackup",
    "xinhao",
];

pub const DEFAULT_HIDDEN_RELATIVE_PATHS: &[&str] = &[
    "Download/KernelSU",
    "Download/KernelSU.apk",
    "Download/kernelsu.apk",
    "Download/Magisk",
    "Download/Magisk.apk",
    "Download/magisk.apk",
    "Download/Magisk.zip",
    "Download/APatch",
    "Download/APatch.apk",
    "TWRP/TWRP.app",
];

pub fn default_hidden_roots() -> Vec<String> {
    DEFAULT_HIDDEN_ROOT_ENTRIES
        .iter()
        .map(|s| (*s).to_string())
        .collect()
}

pub fn default_hidden_relatives() -> Vec<String> {
    DEFAULT_HIDDEN_RELATIVE_PATHS
        .iter()
        .map(|s| (*s).to_string())
        .collect()
}

#[derive(Debug, Clone, Serialize, Deserialize, PartialEq, Eq, Default)]
#[serde(rename_all = "camelCase")]
pub struct PerAppConfig {
    #[serde(default)]
    pub dev_off: bool,
    #[serde(default)]
    pub mock: bool,
    #[serde(default)]
    pub isolate: bool,
    #[serde(default)]
    pub acc_off: bool,
    #[serde(default, skip_serializing_if = "Option::is_none")]
    pub hide_template: Option<String>,
}

impl PerAppConfig {
    pub fn has_any_active(&self) -> bool {
        self.dev_off
            || self.mock
            || self.isolate
            || self.acc_off
            || self
                .hide_template
                .as_deref()
                .map(|t| !t.is_empty() && !t.eq_ignore_ascii_case("none"))
                .unwrap_or(false)
    }
}

#[derive(Debug, Clone, Serialize, Deserialize, PartialEq, Eq, Default)]
#[serde(rename_all = "camelCase")]
pub struct StorageRules {
    #[serde(default)]
    pub hidden_root_entry_names: Vec<String>,
    #[serde(default)]
    pub hidden_relative_paths: Vec<String>,
}

fn default_true() -> bool {
    true
}

fn default_hide_mode() -> String {
    "cloak".to_string()
}

#[derive(Debug, Clone, Serialize, Deserialize, PartialEq, Eq)]
#[serde(rename_all = "camelCase")]
pub struct Config {
    #[serde(default)]
    pub targets: Vec<String>,
    #[serde(default)]
    pub denylist: Vec<String>,
    #[serde(default)]
    pub hide_templates: BTreeMap<String, Vec<String>>,
    #[serde(default)]
    pub hardened: Vec<String>,
    #[serde(default)]
    pub apps: BTreeMap<String, PerAppConfig>,
    #[serde(default = "default_true")]
    pub auto_dev_off: bool,
    #[serde(default = "default_true")]
    pub hide_mock_location: bool,
    #[serde(default)]
    pub always_hidden: bool,
    #[serde(default = "default_true")]
    pub susfs: bool,
    #[serde(default)]
    pub hide_root_apps: bool,
    #[serde(default = "default_true")]
    pub ui_apk: bool,
    #[serde(default)]
    pub system_cloak: bool,
    #[serde(default = "default_hide_mode")]
    pub hide_mode: String,
    #[serde(default)]
    pub cloak_packages: Vec<String>,
    #[serde(default, alias = "root_packages")]
    pub root_packages: Vec<String>,
    #[serde(default)]
    pub storage_rules: StorageRules,
}

impl Default for Config {
    fn default() -> Self {
        Self {
            targets: Vec::new(),
            denylist: Vec::new(),
            hide_templates: BTreeMap::new(),
            hardened: Vec::new(),
            apps: BTreeMap::new(),
            auto_dev_off: true,
            hide_mock_location: true,
            always_hidden: false,
            susfs: true,
            hide_root_apps: false,
            ui_apk: true,
            system_cloak: true,
            hide_mode: "cloak".to_string(),
            cloak_packages: Vec::new(),
            root_packages: Vec::new(),
            storage_rules: StorageRules::default(),
        }
    }
}

#[derive(Debug, Clone, Serialize, Deserialize, PartialEq, Eq)]
#[serde(rename_all = "camelCase")]
pub struct CompiledPolicy {
    #[serde(rename = "type")]
    pub msg_type: String,
    pub generation: u64,
    pub target_uids: Vec<u32>,
    pub targets: Vec<String>,
    pub hidden: Vec<String>,
    pub hidden_by_target: BTreeMap<String, Vec<String>>,
    pub hidden_uids_by_target: BTreeMap<String, Vec<u32>>,
    pub app_zygote: Vec<String>,
    pub developer_options_uids: Vec<u32>,
    pub accessibility_uids: Vec<u32>,
    pub mock_location_uids: Vec<u32>,
    pub storage_rules: StorageRules,
}

pub fn valid_package_name(pkg: &str) -> bool {
    if pkg.is_empty() || pkg.starts_with('.') || pkg.ends_with('.') || pkg.contains("..") {
        return false;
    }
    if !pkg.contains('.') {
        return false;
    }
    pkg.bytes()
        .all(|b| b.is_ascii_alphanumeric() || b == b'.' || b == b'_')
}

pub fn valid_template_name(name: &str) -> bool {
    let trimmed = name.trim();
    if trimmed.is_empty() || trimmed.eq_ignore_ascii_case("default") || trimmed.eq_ignore_ascii_case("none") {
        return false;
    }
    trimmed
        .bytes()
        .all(|b| b.is_ascii_alphanumeric() || matches!(b, b'_' | b'.' | b'-' | b' '))
}

pub fn sanitize_storage_path(raw: &str) -> Option<String> {
    let cleaned = raw.trim().trim_matches('/');
    if cleaned.is_empty() || cleaned.contains("..") || cleaned.contains('\0') || cleaned.contains('\\') {
        return None;
    }
    Some(cleaned.to_string())
}

impl Config {
    pub fn sanitize(&mut self) {
        self.targets.retain(|p| valid_package_name(p));
        self.targets.sort();
        self.targets.dedup();

        self.denylist.retain(|p| valid_package_name(p));
        self.denylist.sort();
        self.denylist.dedup();

        self.cloak_packages.retain(|p| valid_package_name(p));
        self.cloak_packages.sort();
        self.cloak_packages.dedup();

        self.root_packages.retain(|p| valid_package_name(p));
        self.root_packages.sort();
        self.root_packages.dedup();

        let mut clean_templates = BTreeMap::new();
        for (k, v) in std::mem::take(&mut self.hide_templates) {
            if !valid_template_name(&k) {
                continue;
            }
            let mut pkgs: Vec<String> = v
                .into_iter()
                .filter(|p| valid_package_name(p))
                .collect();
            pkgs.sort();
            pkgs.dedup();
            clean_templates.insert(k.trim().to_string(), pkgs);
        }
        self.hide_templates = clean_templates;

        let mut clean_apps = BTreeMap::new();
        for (pkg, mut cfg) in std::mem::take(&mut self.apps) {
            if !valid_package_name(&pkg) {
                continue;
            }
            if let Some(tpl) = cfg.hide_template.as_deref()
                && !valid_template_name(tpl)
            {
                cfg.hide_template = None;
            }
            if cfg.has_any_active() {
                clean_apps.insert(pkg, cfg);
            }
        }
        self.apps = clean_apps;

        let mut target_set: BTreeSet<String> = self.targets.iter().cloned().collect();
        for pkg in self.apps.keys() {
            target_set.insert(pkg.clone());
        }
        for pkg in &target_set {
            if !self.apps.contains_key(pkg) {
                let mut default_app = PerAppConfig {
                    dev_off: self.auto_dev_off,
                    mock: self.hide_mock_location,
                    isolate: self.hardened.contains(pkg),
                    acc_off: self.auto_dev_off,
                    hide_template: None,
                };
                if !default_app.has_any_active() {
                    default_app.dev_off = true;
                }
                self.apps.insert(pkg.clone(), default_app);
            }
        }
        self.targets = self.apps.keys().cloned().collect();
        self.hardened = self
            .apps
            .iter()
            .filter(|(_, c)| c.isolate)
            .map(|(p, _)| p.clone())
            .collect();

        let mut roots: Vec<String> = self
            .storage_rules
            .hidden_root_entry_names
            .iter()
            .filter_map(|s| sanitize_storage_path(s))
            .filter(|s| !s.contains('/'))
            .collect();
        roots.sort();
        roots.dedup();
        self.storage_rules.hidden_root_entry_names = roots;

        let mut rels: Vec<String> = self
            .storage_rules
            .hidden_relative_paths
            .iter()
            .filter_map(|s| sanitize_storage_path(s))
            .filter(|s| s.contains('/'))
            .collect();
        rels.sort();
        rels.dedup();
        self.storage_rules.hidden_relative_paths = rels;
    }

    pub fn load_or_default(path: &Path) -> Self {
        match fs::read_to_string(path) {
            Ok(raw) => {
                let clean = raw.trim_start_matches('\u{feff}').trim();
                match serde_json::from_str::<Config>(clean) {
                    Ok(mut cfg) => {
                        cfg.sanitize();
                        cfg
                    }
                    Err(_) => Self::default(),
                }
            }
            Err(_) => Self::default(),
        }
    }

    pub fn save_atomic(&self, path: &Path) -> io::Result<()> {
        if let Some(parent) = path.parent() {
            fs::create_dir_all(parent)?;
        }
        let tmp_path = path.with_extension("json.tmp");
        let serialized = serde_json::to_vec_pretty(self)
            .map_err(|e| io::Error::new(io::ErrorKind::InvalidData, e))?;
        {
            let mut file = File::create(&tmp_path)?;
            file.write_all(&serialized)?;
            file.write_all(b"\n")?;
            file.sync_all()?;
        }
        #[cfg(unix)]
        {
            use std::os::unix::fs::PermissionsExt;
            let _ = fs::set_permissions(&tmp_path, fs::Permissions::from_mode(0o600));
        }
        fs::rename(&tmp_path, path)?;
        Ok(())
    }

    pub fn compile_policy(
        &self,
        pkg_uids: &BTreeMap<String, u32>,
        generation: u64,
    ) -> CompiledPolicy {
        let mut target_uids = Vec::new();
        let mut targets = Vec::new();
        let mut hidden_by_target = BTreeMap::new();
        let mut hidden_uids_by_target = BTreeMap::new();
        let mut app_zygote = Vec::new();
        let mut dev_uids = Vec::new();
        let mut acc_uids = Vec::new();
        let mut mock_uids = Vec::new();

        let mut global_hidden: BTreeSet<String> = self
            .denylist
            .iter()
            .chain(self.cloak_packages.iter())
            .filter(|p| valid_package_name(p))
            .cloned()
            .collect();

        for (pkg, app_cfg) in &self.apps {
            let Some(&uid) = pkg_uids.get(pkg) else {
                continue;
            };
            let app_id = uid % 100_000;
            if app_id < 10_000 {
                continue;
            }

            targets.push(pkg.clone());
            target_uids.push(app_id);

            let mut per_target_hidden: BTreeSet<String> = self
                .cloak_packages
                .iter()
                .filter(|p| valid_package_name(p))
                .cloned()
                .collect();

            if let Some(tpl_name) = app_cfg.hide_template.as_deref()
                && let Some(tpl_pkgs) = self.hide_templates.get(tpl_name)
            {
                for p in tpl_pkgs {
                    if valid_package_name(p) && p != pkg {
                        per_target_hidden.insert(p.clone());
                        global_hidden.insert(p.clone());
                    }
                }
            }

            let mut per_target_hidden_uids = BTreeSet::new();
            for hpkg in &per_target_hidden {
                if let Some(&huid) = pkg_uids.get(hpkg) {
                    let hid = huid % 100_000;
                    if hid >= 10_000 && hid != app_id {
                        per_target_hidden_uids.insert(hid);
                    }
                }
            }

            hidden_by_target.insert(pkg.clone(), per_target_hidden.into_iter().collect());
            hidden_uids_by_target
                .insert(pkg.clone(), per_target_hidden_uids.into_iter().collect());

            if app_cfg.isolate {
                app_zygote.push(pkg.clone());
            }
            if app_cfg.dev_off {
                dev_uids.push(app_id);
            }
            if app_cfg.acc_off {
                acc_uids.push(app_id);
            }
            if app_cfg.mock {
                mock_uids.push(app_id);
            }
        }

        let mut merged_roots: BTreeSet<String> =
            default_hidden_roots().into_iter().collect();
        for r in &self.storage_rules.hidden_root_entry_names {
            if let Some(clean) = sanitize_storage_path(r)
                && !clean.contains('/')
            {
                merged_roots.insert(clean);
            }
        }

        let mut merged_relatives: BTreeSet<String> =
            default_hidden_relatives().into_iter().collect();
        for p in &self.storage_rules.hidden_relative_paths {
            if let Some(clean) = sanitize_storage_path(p)
                && clean.contains('/')
            {
                merged_relatives.insert(clean);
            }
        }

        CompiledPolicy {
            msg_type: "policy".to_string(),
            generation,
            target_uids,
            targets,
            hidden: global_hidden.into_iter().collect(),
            hidden_by_target,
            hidden_uids_by_target,
            app_zygote,
            developer_options_uids: dev_uids,
            accessibility_uids: acc_uids,
            mock_location_uids: mock_uids,
            storage_rules: StorageRules {
                hidden_root_entry_names: merged_roots.into_iter().collect(),
                hidden_relative_paths: merged_relatives.into_iter().collect(),
            },
        }
    }
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn compiles_custom_storage_rules_and_hidden_uids() {
        let mut cfg = Config::default();
        cfg.hide_templates.insert(
            "stealth".into(),
            vec!["com.topjohnwu.magisk".into(), "me.weishu.kernelsu".into()],
        );
        cfg.apps.insert(
            "com.gojek.app".into(),
            PerAppConfig {
                dev_off: true,
                mock: true,
                isolate: false,
                acc_off: true,
                hide_template: Some("stealth".into()),
            },
        );
        cfg.storage_rules
            .hidden_root_entry_names
            .push("PrivateVault".into());
        cfg.storage_rules
            .hidden_relative_paths
            .push("Download/secret_apk".into());
        cfg.sanitize();

        let mut uids = BTreeMap::new();
        uids.insert("com.gojek.app".into(), 10313);
        uids.insert("com.topjohnwu.magisk".into(), 10299);
        uids.insert("me.weishu.kernelsu".into(), 10301);

        let policy = cfg.compile_policy(&uids, 7);
        assert_eq!(policy.generation, 7);
        assert_eq!(policy.target_uids, vec![10313]);
        assert_eq!(policy.developer_options_uids, vec![10313]);
        assert_eq!(policy.accessibility_uids, vec![10313]);
        assert_eq!(policy.mock_location_uids, vec![10313]);
        assert!(policy.app_zygote.is_empty());
        assert_eq!(
            policy.hidden_uids_by_target.get("com.gojek.app").unwrap(),
            &vec![10299, 10301]
        );
        assert!(policy
            .storage_rules
            .hidden_root_entry_names
            .contains(&"PrivateVault".to_string()));
        assert!(policy
            .storage_rules
            .hidden_relative_paths
            .contains(&"Download/secret_apk".to_string()));
    }

    #[test]
    fn sanitize_keeps_template_only_app() {
        let mut cfg = Config::default();
        cfg.apps.insert(
            "com.example.bank".into(),
            PerAppConfig {
                dev_off: false,
                mock: false,
                isolate: false,
                acc_off: false,
                hide_template: Some("stealth".into()),
            },
        );
        cfg.sanitize();
        assert!(cfg.targets.contains(&"com.example.bank".to_string()));
        assert!(cfg.apps.contains_key("com.example.bank"));
    }
}
