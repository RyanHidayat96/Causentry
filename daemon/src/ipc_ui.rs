use std::collections::BTreeSet;
use std::fs;
use std::os::unix::fs::PermissionsExt;
use std::os::unix::io::AsRawFd;
use std::os::unix::net::{UnixListener, UnixStream};
use std::path::Path;
use std::sync::{Arc, Mutex};
use std::thread;
use std::time::{Duration, Instant};

use serde::{Deserialize, Serialize};
use serde_json::{json, Value};

use crate::config::{
    default_hidden_relatives, default_hidden_roots, valid_package_name, valid_template_name,
    Config, PerAppConfig,
};
use crate::framing::{read_frame, write_frame};
use crate::ipc_zygisk::ZygiskHub;
use crate::packages::{control_app_uid, read_package_uids, CONTROL_APP_PKG};
use crate::ringlog::RingLog;
use crate::system::{
    apply_boot_props, apply_susfs, clear_verdict_cache,
    force_stop_package, settings_get, susfs_variant, CONFIG_PATH, CTL_SOCK_PATH,
};

pub struct DaemonState {
    pub config: Mutex<Config>,
    pub hub: Arc<ZygiskHub>,
    pub log: Arc<RingLog>,
    pub started_at: Instant,
    pub generation: Mutex<u64>,
    pub root_provider: String,
    pub control_uid: Mutex<Option<u32>>,
}

#[derive(Debug, Deserialize)]
#[serde(rename_all = "camelCase")]
struct UiRequest {
    action: String,
    #[serde(default)]
    pkg: String,
    #[serde(default)]
    dev_off: bool,
    #[serde(default)]
    mock: bool,
    #[serde(default)]
    isolate: bool,
    #[serde(default)]
    acc_off: bool,
    #[serde(default)]
    template: Option<String>,
    #[serde(default)]
    name: String,
    #[serde(default)]
    packages: Vec<String>,
    #[serde(default)]
    delete_name: Option<String>,
    #[serde(default)]
    config: Option<Value>,
    #[serde(default)]
    hidden_root_entry_names: Vec<String>,
    #[serde(default)]
    hidden_relative_paths: Vec<String>,
}

#[derive(Debug, Serialize)]
#[serde(rename_all = "camelCase")]
pub struct RpcStatusResponse {
    ok: bool,
    state: String,
    daemon: bool,
    daemon_pid: u32,
    daemon_uptime_sec: u64,
    root_provider: String,
    ts: u64,
    susfs: String,
    zygisk: String,
    cloak_ready: bool,
    pkg_hook_count: u32,
    settings_hook_ready: bool,
    settings_hook_count: u32,
    usb_hook_ready: bool,
    usb_hook_count: u32,
    a11y_hook_count: u32,
    app_zygote_hook_count: u32,
    targets: Vec<String>,
    hardened: Vec<String>,
    denylist: Vec<String>,
    auto_dev_off: bool,
    hide_mock_location: bool,
    always_hidden: bool,
    susfs_on: bool,
    hide_root_apps: bool,
    ui_apk: bool,
    system_cloak: bool,
    hide_mode: String,
    cloak_packages: Vec<String>,
    default_storage_roots: Vec<String>,
    default_storage_relatives: Vec<String>,
    fuse: Value,
    config: Config,
    log: String,
    error: Option<String>,
}

pub fn build_status_response(state: &DaemonState, ok: bool, error: Option<String>) -> RpcStatusResponse {
    let cfg = state.config.lock().unwrap().clone();
    let t = state.hub.snapshot_telemetry();
    let zygisk_status = if t.system_server_pid > 0 && t.pkg_hook_count > 0 {
        "system-server-active".to_string()
    } else if t.system_server_pid > 0 {
        "zygisk-connected".to_string()
    } else {
        "standby".to_string()
    };
    let cloak_ready = t.system_server_pid > 0 && t.pkg_hook_count > 0;
    let now_ts = std::time::SystemTime::now()
        .duration_since(std::time::UNIX_EPOCH)
        .map(|d| d.as_secs())
        .unwrap_or(0);

    RpcStatusResponse {
        ok,
        state: if cfg.targets.is_empty() {
            "idle".to_string()
        } else {
            "active".to_string()
        },
        daemon: true,
        daemon_pid: std::process::id(),
        daemon_uptime_sec: state.started_at.elapsed().as_secs(),
        root_provider: state.root_provider.clone(),
        ts: now_ts,
        susfs: susfs_variant(),
        zygisk: zygisk_status,
        cloak_ready,
        pkg_hook_count: t.pkg_hook_count,
        settings_hook_ready: t.settings_hook_ready,
        settings_hook_count: t.settings_hook_count,
        usb_hook_ready: t.usb_hook_ready,
        usb_hook_count: t.usb_hook_count,
        a11y_hook_count: t.a11y_hook_count,
        app_zygote_hook_count: t.app_zygote_hook_count,
        targets: cfg.targets.clone(),
        hardened: cfg.hardened.clone(),
        denylist: cfg.denylist.clone(),
        auto_dev_off: cfg.auto_dev_off,
        hide_mock_location: cfg.hide_mock_location,
        always_hidden: cfg.always_hidden,
        susfs_on: cfg.susfs,
        hide_root_apps: cfg.hide_root_apps,
        ui_apk: cfg.ui_apk,
        system_cloak: cfg.system_cloak,
        hide_mode: cfg.hide_mode.clone(),
        cloak_packages: cfg.cloak_packages.clone(),
        default_storage_roots: default_hidden_roots(),
        default_storage_relatives: default_hidden_relatives(),
        fuse: json!({
            "active": t.fuse_active,
            "covered": t.fuse_covered,
            "targetCount": t.fuse_target_count,
            "rootCount": t.fuse_root_count,
            "relativeCount": t.fuse_relative_count,
        }),
        config: cfg,
        log: state.log.tail(80),
        error,
    }
}

fn push_policy(state: &DaemonState) {
    let pkg_uids = read_package_uids();
    if let Some(uid) = control_app_uid(&pkg_uids) {
        *state.control_uid.lock().unwrap() = Some(uid);
    }
    let generation = {
        let mut g = state.generation.lock().unwrap();
        *g += 1;
        *g
    };
    let policy = {
        let cfg = state.config.lock().unwrap();
        cfg.compile_policy(&pkg_uids, generation)
    };
    state.hub.update_and_broadcast(&policy, &state.log);
}

fn handle_request(state: &DaemonState, req: UiRequest) -> RpcStatusResponse {
    match req.action.as_str() {
        "get_status" | "refresh" => {
            if req.action == "refresh" {
                push_policy(state);
            }
            build_status_response(state, true, None)
        }
        "set_app" => {
            if !valid_package_name(&req.pkg) {
                return build_status_response(state, false, Some("invalid package name".into()));
            }
            let tpl = req
                .template
                .as_deref()
                .map(str::trim)
                .filter(|t| valid_template_name(t))
                .map(str::to_string);
            let app_cfg = PerAppConfig {
                dev_off: req.dev_off,
                mock: req.mock,
                isolate: req.isolate,
                acc_off: req.acc_off,
                hide_template: tpl,
            };
            {
                let mut cfg = state.config.lock().unwrap();
                if app_cfg.has_any_active() {
                    cfg.apps.insert(req.pkg.clone(), app_cfg);
                } else {
                    cfg.apps.remove(&req.pkg);
                    cfg.targets.retain(|p| p != &req.pkg);
                    cfg.hardened.retain(|p| p != &req.pkg);
                }
                cfg.sanitize();
                if let Err(e) = cfg.save_atomic(Path::new(CONFIG_PATH)) {
                    return build_status_response(state, false, Some(e.to_string()));
                }
            }
            push_policy(state);
            force_stop_package(&req.pkg, &state.log);
            clear_verdict_cache(&req.pkg, &state.log);
            state.log.info(&format!("configured app {}", req.pkg));
            build_status_response(state, true, None)
        }
        "del_app" => {
            if !valid_package_name(&req.pkg) {
                return build_status_response(state, false, Some("invalid package name".into()));
            }
            {
                let mut cfg = state.config.lock().unwrap();
                cfg.apps.remove(&req.pkg);
                cfg.targets.retain(|p| p != &req.pkg);
                cfg.hardened.retain(|p| p != &req.pkg);
                cfg.sanitize();
                if let Err(e) = cfg.save_atomic(Path::new(CONFIG_PATH)) {
                    return build_status_response(state, false, Some(e.to_string()));
                }
            }
            push_policy(state);
            force_stop_package(&req.pkg, &state.log);
            clear_verdict_cache(&req.pkg, &state.log);
            state.log.info(&format!("removed app {}", req.pkg));
            build_status_response(state, true, None)
        }
        "save_template" => {
            {
                let mut cfg = state.config.lock().unwrap();
                if let Some(del) = req.delete_name.as_deref() {
                    cfg.hide_templates.remove(del);
                    for app in cfg.apps.values_mut() {
                        if app.hide_template.as_deref() == Some(del) {
                            app.hide_template = None;
                        }
                    }
                }
                if valid_template_name(&req.name) {
                    let clean_pkgs: Vec<String> = req
                        .packages
                        .into_iter()
                        .filter(|p| valid_package_name(p))
                        .collect();
                    cfg.hide_templates.insert(req.name.trim().to_string(), clean_pkgs);
                }
                cfg.sanitize();
                if let Err(e) = cfg.save_atomic(Path::new(CONFIG_PATH)) {
                    return build_status_response(state, false, Some(e.to_string()));
                }
            }
            push_policy(state);
            state.log.info("templates updated");
            build_status_response(state, true, None)
        }
        "save_storage_rules" => {
            {
                let mut cfg = state.config.lock().unwrap();
                cfg.storage_rules.hidden_root_entry_names = req.hidden_root_entry_names;
                cfg.storage_rules.hidden_relative_paths = req.hidden_relative_paths;
                cfg.sanitize();
                if let Err(e) = cfg.save_atomic(Path::new(CONFIG_PATH)) {
                    return build_status_response(state, false, Some(e.to_string()));
                }
            }
            push_policy(state);
            state.log.info("storage cloak rules updated");
            build_status_response(state, true, None)
        }
        "import_config" => {
            let Some(raw_val) = req.config else {
                return build_status_response(state, false, Some("missing config object".into()));
            };
            let mut next_cfg: Config = match serde_json::from_value(raw_val) {
                Ok(c) => c,
                Err(e) => {
                    return build_status_response(state, false, Some(format!("invalid config: {e}")))
                }
            };
            next_cfg.sanitize();

            let changed_pkgs: Vec<String> = {
                let mut cfg = state.config.lock().unwrap();
                let old_apps = cfg.apps.clone();
                let mut diff = BTreeSet::new();
                for (p, app_c) in &next_cfg.apps {
                    if old_apps.get(p) != Some(app_c) {
                        diff.insert(p.clone());
                    }
                }
                for p in old_apps.keys() {
                    if !next_cfg.apps.contains_key(p) {
                        diff.insert(p.clone());
                    }
                }
                *cfg = next_cfg.clone();
                if let Err(e) = cfg.save_atomic(Path::new(CONFIG_PATH)) {
                    return build_status_response(state, false, Some(e.to_string()));
                }
                diff.into_iter().collect()
            };

            apply_susfs(next_cfg.susfs, &state.log);
            push_policy(state);
            for p in changed_pkgs {
                force_stop_package(&p, &state.log);
                clear_verdict_cache(&p, &state.log);
            }
            state.log.info("configuration imported & applied");
            build_status_response(state, true, None)
        }
        "apply" => {
            let susfs_on = state.config.lock().unwrap().susfs;
            apply_boot_props(&state.log);
            apply_susfs(susfs_on, &state.log);
            push_policy(state);
            build_status_response(state, true, None)
        }
        "restore" => {
            let targets_to_stop: Vec<String> = {
                let mut cfg = state.config.lock().unwrap();
                let prev = cfg.targets.clone();
                cfg.apps.clear();
                cfg.targets.clear();
                cfg.hardened.clear();
                let _ = cfg.save_atomic(Path::new(CONFIG_PATH));
                prev
            };
            push_policy(state);
            for p in targets_to_stop {
                force_stop_package(&p, &state.log);
            }
            state.log.info("restored default protections");
            build_status_response(state, true, None)
        }
        "diag" => {
            let mut resp = build_status_response(state, true, None);
            let dev_g = settings_get("global", "development_settings_enabled");
            let adb_g = settings_get("global", "adb_enabled");
            state.log.info(&format!("diag global dev={dev_g} adb={adb_g}"));
            resp.log = state.log.tail(80);
            resp
        }
        other => build_status_response(state, false, Some(format!("unknown action: {other}"))),
    }
}

fn peer_uid(stream: &UnixStream) -> Option<u32> {
    let mut cred: libc::ucred = unsafe { std::mem::zeroed() };
    let mut len = std::mem::size_of::<libc::ucred>() as libc::socklen_t;
    let rc = unsafe {
        libc::getsockopt(
            stream.as_raw_fd(),
            libc::SOL_SOCKET,
            libc::SO_PEERCRED,
            (&mut cred as *mut libc::ucred).cast(),
            &mut len,
        )
    };
    if rc == 0 {
        Some(cred.uid)
    } else {
        None
    }
}

fn serve_ui_client(mut stream: UnixStream, state: Arc<DaemonState>) {
    let Some(uid) = peer_uid(&stream) else {
        return;
    };
    let expected = *state.control_uid.lock().unwrap();
    let app_id = uid % 100_000;
    let authorized = uid == 0 || expected.map(|e| (e % 100_000) == app_id).unwrap_or(false);
    if !authorized {
        state
            .log
            .info(&format!("rejected unauthorized RPC peer uid={uid}"));
        return;
    }

    let Ok(frame) = read_frame(&mut stream) else {
        return;
    };
    let resp = match serde_json::from_slice::<UiRequest>(&frame) {
        Ok(req) => handle_request(&state, req),
        Err(e) => build_status_response(&state, false, Some(format!("bad json: {e}"))),
    };
    if let Ok(out) = serde_json::to_vec(&resp) {
        let _ = write_frame(&mut stream, &out);
    }
}

fn get_selinux_context(path: &Path) -> Option<Vec<u8>> {
    let c_path = std::ffi::CString::new(path.to_string_lossy().as_ref()).ok()?;
    let attr = b"security.selinux\0";
    let mut buf = vec![0u8; 256];
    let len = unsafe {
        libc::lgetxattr(
            c_path.as_ptr(),
            attr.as_ptr() as *const libc::c_char,
            buf.as_mut_ptr().cast(),
            buf.len(),
        )
    };
    if len > 0 {
        buf.truncate(len as usize);
        Some(buf)
    } else {
        None
    }
}

fn apply_app_ownership_and_label(path: &Path, uid: u32, selinux_ctx: Option<&[u8]>) {
    let Ok(c_path) = std::ffi::CString::new(path.to_string_lossy().as_ref()) else {
        return;
    };
    unsafe {
        libc::chown(c_path.as_ptr(), uid, uid);
        if let Some(ctx) = selinux_ctx {
            let attr = b"security.selinux\0";
            libc::lsetxattr(
                c_path.as_ptr(),
                attr.as_ptr() as *const libc::c_char,
                ctx.as_ptr().cast(),
                ctx.len(),
                0,
            );
        }
    }
}

fn bind_ui_socket_loop(state: Arc<DaemonState>) {
    let app_root = Path::new("/data/user/0").join(CONTROL_APP_PKG);
    let no_backup = app_root.join("no_backup");
    let sock_path = no_backup.join(".rpc.sock");

    loop {
        let uid = control_app_uid(&read_package_uids());
        if let Some(app_uid) = uid {
            *state.control_uid.lock().unwrap() = Some(app_uid);
            if app_root.exists() {
                let _ = fs::create_dir_all(&no_backup);
                let ctx = get_selinux_context(&app_root);
                let _ = fs::set_permissions(&no_backup, fs::Permissions::from_mode(0o700));
                apply_app_ownership_and_label(&no_backup, app_uid, ctx.as_deref());

                let _ = fs::remove_file(&sock_path);
                if let Ok(listener) = UnixListener::bind(&sock_path) {
                    let _ = fs::set_permissions(&sock_path, fs::Permissions::from_mode(0o660));
                    apply_app_ownership_and_label(&sock_path, app_uid, ctx.as_deref());
                    state
                        .log
                        .info(&format!("UI RPC socket ready for uid={app_uid}"));

                    for stream in listener.incoming() {
                        let Ok(stream) = stream else { break };
                        let st = Arc::clone(&state);
                        thread::spawn(move || serve_ui_client(stream, st));
                    }
                }
            }
        }
        thread::sleep(Duration::from_secs(3));
    }
}

pub fn start_ui_rpc_servers(state: Arc<DaemonState>) {
    // 1. CLI control socket (root-only)
    let ctl_state = Arc::clone(&state);
    thread::Builder::new()
        .name("ctl-rpc".into())
        .spawn(move || {
            let sock = Path::new(CTL_SOCK_PATH);
            let _ = fs::remove_file(sock);
            if let Ok(listener) = UnixListener::bind(sock) {
                let _ = fs::set_permissions(sock, fs::Permissions::from_mode(0o600));
                for stream in listener.incoming() {
                    let Ok(stream) = stream else { continue };
                    let st = Arc::clone(&ctl_state);
                    thread::spawn(move || serve_ui_client(stream, st));
                }
            }
        })
        .ok();

    // 2. App-private UI RPC socket (SO_PEERCRED authenticated to com.causentry.app)
    thread::Builder::new()
        .name("ui-rpc".into())
        .spawn(move || bind_ui_socket_loop(state))
        .ok();
}
