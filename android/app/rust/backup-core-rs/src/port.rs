//! Native configuration backup inspector and merger.

#![forbid(unsafe_code)]

use serde_json::{Map, Value};
use std::collections::HashSet;

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

fn make_error(msg: &str) -> String {
    format!("{{\"ok\":false,\"error\":\"{}\"}}", json_escape(msg))
}

fn opt_string<'a>(obj: &'a Map<String, Value>, key: &str, default: &'a str) -> &'a str {
    obj.get(key).and_then(Value::as_str).unwrap_or(default)
}

fn opt_bool(obj: &Map<String, Value>, key: &str, default: bool) -> bool {
    obj.get(key).and_then(Value::as_bool).unwrap_or(default)
}

fn opt_int(obj: &Map<String, Value>, key: &str, default: i32) -> i32 {
    obj.get(key)
        .and_then(Value::as_i64)
        .map(|v| v as i32)
        .unwrap_or(default)
}

fn opt_obj<'a>(obj: &'a Map<String, Value>, key: &str) -> Option<&'a Map<String, Value>> {
    obj.get(key).and_then(Value::as_object)
}

fn opt_string_list(obj: &Map<String, Value>, key: &str) -> Vec<String> {
    let Some(arr) = obj.get(key).and_then(Value::as_array) else {
        return Vec::new();
    };
    arr.iter()
        .filter_map(Value::as_str)
        .filter(|s| !s.is_empty())
        .map(ToString::to_string)
        .collect()
}

fn list_to_val(values: Vec<String>) -> Value {
    Value::Array(values.into_iter().map(Value::String).collect())
}

/// Port of `inspectBackupJson` (`backup/BackupCore.java`).
pub fn inspect_backup_json(raw_json: String) -> Result<String, String> {
    let stripped = raw_json.replace('\u{FEFF}', "");
    let clean = java_trim(&stripped);
    let Ok(Value::Object(root)) = serde_json::from_str::<Value>(clean) else {
        return Ok(make_error("Invalid JSON object"));
    };

    let mut out = Map::new();

    if opt_string(&root, "format", "") == "causentry_backup" {
        let empty = Map::new();
        let cfg = opt_obj(&root, "config").unwrap_or(&empty);
        let ver = opt_int(&root, "version", 1);
        let targets = opt_string_list(cfg, "targets");
        let tpls = opt_obj(cfg, "hideTemplates").unwrap_or(&empty);
        let tpl_names: Vec<String> = tpls.keys().cloned().collect();
        let apps_count = opt_obj(cfg, "apps").map_or(0, Map::len);
        let storage_count = opt_obj(cfg, "storageRules").map_or(0, |s| {
            opt_string_list(s, "hiddenRootEntryNames").len()
                + opt_string_list(s, "hiddenRelativePaths").len()
        });
        let hardened_count = opt_string_list(cfg, "hardened").len();

        out.insert("ok".into(), Value::Bool(true));
        out.insert("format".into(), Value::String(format!("Causentry v{ver}")));
        out.insert("sourceVersion".into(), Value::Number(ver.into()));
        out.insert("targetCount".into(), Value::Number(targets.len().into()));
        out.insert(
            "templateCount".into(),
            Value::Number(tpl_names.len().into()),
        );
        out.insert("hardenedCount".into(), Value::Number(hardened_count.into()));
        out.insert("appPolicyCount".into(), Value::Number(apps_count.into()));
        out.insert(
            "storageRuleCount".into(),
            Value::Number(storage_count.into()),
        );
        out.insert(
            "systemCloak".into(),
            Value::Bool(opt_bool(cfg, "systemCloak", false)),
        );
        out.insert(
            "hideMode".into(),
            Value::String(opt_string(cfg, "hideMode", "none").to_string()),
        );
        out.insert("targetNames".into(), list_to_val(targets));
        out.insert("templateNames".into(), list_to_val(tpl_names));
        out.insert("config".into(), Value::Object(cfg.clone()));

        return serde_json::to_string(&Value::Object(out)).map_err(|e| e.to_string());
    }

    if root.contains_key("hideTemplates")
        || root.contains_key("apps")
        || root.contains_key("templates")
    {
        let targets = opt_string_list(&root, "targets");
        let empty = Map::new();
        let tpls = opt_obj(&root, "hideTemplates")
            .or_else(|| opt_obj(&root, "templates"))
            .unwrap_or(&empty);
        let tpl_names: Vec<String> = tpls.keys().cloned().collect();

        let mut cfg_map = root.clone();
        if !cfg_map.contains_key("hideTemplates")
            && let Some(t) = cfg_map.get("templates").cloned()
        {
            cfg_map.insert("hideTemplates".into(), t);
        }

        let format_label = if root.contains_key("templates") {
            "HMA-OSS"
        } else {
            "Direct Config"
        };
        let apps_count = opt_obj(&root, "apps").map_or(0, Map::len);

        out.insert("ok".into(), Value::Bool(true));
        out.insert("format".into(), Value::String(format_label.to_string()));
        out.insert("sourceVersion".into(), Value::Number(1.into()));
        out.insert("targetCount".into(), Value::Number(targets.len().into()));
        out.insert(
            "templateCount".into(),
            Value::Number(tpl_names.len().into()),
        );
        out.insert("hardenedCount".into(), Value::Number(0.into()));
        out.insert("appPolicyCount".into(), Value::Number(apps_count.into()));
        out.insert("storageRuleCount".into(), Value::Number(0.into()));
        out.insert("systemCloak".into(), Value::Bool(false));
        out.insert("hideMode".into(), Value::String("none".to_string()));
        out.insert("targetNames".into(), list_to_val(targets));
        out.insert("templateNames".into(), list_to_val(tpl_names));
        out.insert("config".into(), Value::Object(cfg_map));

        return serde_json::to_string(&Value::Object(out)).map_err(|e| e.to_string());
    }

    Ok(make_error(
        "Unrecognized backup format. File must be a Causentry or HMA-OSS JSON backup.",
    ))
}

fn merge_string_list(
    current_values: Vec<String>,
    imported: &Map<String, Value>,
    key: &str,
    replace_all: bool,
) -> Value {
    if !imported.contains_key(key) {
        return list_to_val(current_values);
    }
    let imp = opt_string_list(imported, key);
    if replace_all {
        return list_to_val(imp);
    }
    let mut seen = HashSet::new();
    let mut merged = Vec::new();
    for item in current_values.into_iter().chain(imp) {
        if seen.insert(item.clone()) {
            merged.push(item);
        }
    }
    list_to_val(merged)
}

fn merge_app_entry(raw: &Map<String, Value>, prev: Option<&Map<String, Value>>) -> Value {
    let dev_off = opt_bool(
        raw,
        "devOff",
        prev.is_some_and(|p| opt_bool(p, "devOff", false)),
    );
    let mock = opt_bool(
        raw,
        "mock",
        prev.is_some_and(|p| opt_bool(p, "mock", false)),
    );
    let isolate = opt_bool(
        raw,
        "isolate",
        prev.is_some_and(|p| opt_bool(p, "isolate", false)),
    );
    let acc_off = opt_bool(
        raw,
        "accOff",
        prev.is_some_and(|p| opt_bool(p, "accOff", false)),
    );
    let raw_tmpl = opt_string(raw, "hideTemplate", "");
    let tmpl = if !raw_tmpl.is_empty() {
        raw_tmpl
    } else {
        prev.map_or("", |p| opt_string(p, "hideTemplate", ""))
    };

    let mut map = Map::new();
    map.insert("devOff".into(), Value::Bool(dev_off));
    map.insert("mock".into(), Value::Bool(mock));
    map.insert("isolate".into(), Value::Bool(isolate));
    map.insert("accOff".into(), Value::Bool(acc_off));
    if !tmpl.is_empty() {
        map.insert("hideTemplate".into(), Value::String(tmpl.to_string()));
    }
    Value::Object(map)
}

/// Port of `mergeBackupConfigJson` (`backup/BackupCore.java`).
pub fn merge_backup_config_json(
    current_json: String,
    imported_json: String,
    replace_all: bool,
) -> Result<String, String> {
    let Ok(Value::Object(current)) = serde_json::from_str::<Value>(java_trim(&current_json)) else {
        return Ok(String::new());
    };
    let Ok(Value::Object(imported)) = serde_json::from_str::<Value>(java_trim(&imported_json))
    else {
        return Ok(String::new());
    };

    let mut out = Map::new();

    let mut seen_targets = HashSet::new();
    let mut merged_targets = Vec::new();
    if !replace_all {
        for t in opt_string_list(&current, "targets") {
            if seen_targets.insert(t.clone()) {
                merged_targets.push(t);
            }
        }
    }
    for t in opt_string_list(&imported, "targets") {
        if seen_targets.insert(t.clone()) {
            merged_targets.push(t);
        }
    }
    out.insert("targets".into(), list_to_val(merged_targets));

    let empty = Map::new();
    let cur_apps = opt_obj(&current, "apps").unwrap_or(&empty);
    let mut apps_map = Map::new();
    if !replace_all {
        for (pkg, entry) in cur_apps {
            if entry.is_object() {
                apps_map.insert(pkg.clone(), entry.clone());
            }
        }
    }
    if let Some(imp_apps) = opt_obj(&imported, "apps") {
        for (pkg, entry) in imp_apps {
            if let Some(raw_obj) = entry.as_object() {
                let prev = opt_obj(cur_apps, pkg);
                apps_map.insert(pkg.clone(), merge_app_entry(raw_obj, prev));
            }
        }
    }
    out.insert("apps".into(), Value::Object(apps_map));

    let cur_tpls = opt_obj(&current, "hideTemplates").unwrap_or(&empty);
    let mut tpls_map = Map::new();
    if !replace_all {
        for (name, arr) in cur_tpls {
            if arr.is_array() {
                tpls_map.insert(name.clone(), arr.clone());
            }
        }
    }
    if let Some(imp_tpls) =
        opt_obj(&imported, "hideTemplates").or_else(|| opt_obj(&imported, "templates"))
    {
        for (name, arr) in imp_tpls {
            tpls_map.insert(
                name.clone(),
                if arr.is_array() {
                    arr.clone()
                } else {
                    Value::Array(Vec::new())
                },
            );
        }
    }
    out.insert("hideTemplates".into(), Value::Object(tpls_map));

    out.insert(
        "hardened".into(),
        merge_string_list(
            opt_string_list(&current, "hardened"),
            &imported,
            "hardened",
            replace_all,
        ),
    );
    out.insert(
        "denylist".into(),
        merge_string_list(
            opt_string_list(&current, "denylist"),
            &imported,
            "denylist",
            replace_all,
        ),
    );

    let cur_system_cloak = opt_bool(&current, "systemCloak", true);
    out.insert(
        "systemCloak".into(),
        Value::Bool(if imported.contains_key("systemCloak") {
            opt_bool(&imported, "systemCloak", cur_system_cloak)
        } else {
            cur_system_cloak
        }),
    );

    let cur_hide_mode = opt_string(&current, "hideMode", "cloak");
    let imp_hide_mode = {
        let v = opt_string(&imported, "hideMode", cur_hide_mode);
        if v.is_empty() { cur_hide_mode } else { v }
    };
    out.insert(
        "hideMode".into(),
        Value::String(
            if imported.contains_key("hideMode") {
                imp_hide_mode
            } else {
                cur_hide_mode
            }
            .to_string(),
        ),
    );

    out.insert(
        "cloakPackages".into(),
        if imported.contains_key("cloakPackages") {
            list_to_val(opt_string_list(&imported, "cloakPackages"))
        } else {
            list_to_val(opt_string_list(&current, "cloakPackages"))
        },
    );

    let storage_val = if let Some(s) = opt_obj(&imported, "storageRules") {
        Value::Object(s.clone())
    } else if let Some(s) = opt_obj(&current, "storageRules") {
        Value::Object(s.clone())
    } else {
        let mut s = Map::new();
        s.insert("hiddenRootEntryNames".into(), Value::Array(Vec::new()));
        s.insert("hiddenRelativePaths".into(), Value::Array(Vec::new()));
        Value::Object(s)
    };
    out.insert("storageRules".into(), storage_val);

    out.insert(
        "autoDevOff".into(),
        Value::Bool(opt_bool(
            &imported,
            "autoDevOff",
            opt_bool(&current, "autoDevOff", true),
        )),
    );
    out.insert(
        "hideMockLocation".into(),
        Value::Bool(opt_bool(
            &imported,
            "hideMockLocation",
            opt_bool(&current, "hideMockLocation", true),
        )),
    );
    out.insert(
        "alwaysHidden".into(),
        Value::Bool(opt_bool(
            &imported,
            "alwaysHidden",
            opt_bool(&current, "alwaysHidden", false),
        )),
    );
    out.insert(
        "susfs".into(),
        Value::Bool(opt_bool(
            &imported,
            "susfs",
            opt_bool(&current, "susfs", true),
        )),
    );
    out.insert(
        "hideRootApps".into(),
        Value::Bool(opt_bool(
            &imported,
            "hideRootApps",
            opt_bool(&current, "hideRootApps", false),
        )),
    );
    out.insert(
        "uiApk".into(),
        Value::Bool(opt_bool(
            &imported,
            "uiApk",
            opt_bool(&current, "uiApk", true),
        )),
    );

    serde_json::to_string(&Value::Object(out)).map_err(|e| e.to_string())
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn inspects_v2_and_hma_and_merges_safely() {
        let v2 = inspect_backup_json(
            "\u{FEFF}{\"format\":\"causentry_backup\",\"version\":2,\"config\":{\"targets\":[\"com.gojek.app\"],\"systemCloak\":true,\"hideMode\":\"cloak\"}}"
                .to_string(),
        )
        .unwrap();
        assert!(v2.contains("\"ok\":true"));
        assert!(v2.contains("\"format\":\"Causentry v2\""));

        let hma = inspect_backup_json(
            "{\"targets\":[\"com.a\"],\"templates\":{\"t\":[\"com.root\"]}}".to_string(),
        )
        .unwrap();
        assert!(hma.contains("\"format\":\"HMA-OSS\""));
        assert!(hma.contains("\"hideTemplates\""));

        let merged = merge_backup_config_json(
            "{\"targets\":[\"com.a\"],\"systemCloak\":true,\"hideMode\":\"cloak\",\"cloakPackages\":[\"com.root\"]}".to_string(),
            "{\"targets\":[\"com.b\"]}".to_string(),
            false,
        )
        .unwrap();
        assert!(merged.contains("\"systemCloak\":true"));
        assert!(merged.contains("\"com.a\",\"com.b\""));
    }
}
