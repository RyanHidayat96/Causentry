use std::collections::HashMap;
use std::fs;
use std::os::unix::fs::PermissionsExt;
use std::os::unix::net::{UnixListener, UnixStream};
use std::path::Path;
use std::sync::{Arc, Mutex, RwLock};
use std::thread;

use serde::{Deserialize, Serialize};

use crate::config::CompiledPolicy;
use crate::framing::{read_frame, write_frame};
use crate::ringlog::RingLog;
use crate::system::{write_cold_start_policy_file, INTERNAL_SOCK_PATH};

#[derive(Debug, Clone, Serialize, Deserialize, Default)]
#[serde(rename_all = "camelCase")]
pub struct TelemetryState {
    pub system_server_pid: u32,
    pub settings_provider_pid: u32,
    pub media_provider_pid: u32,
    pub pkg_hook_count: u32,
    pub settings_hook_count: u32,
    pub settings_hook_ready: bool,
    pub usb_hook_count: u32,
    pub usb_hook_ready: bool,
    pub a11y_hook_count: u32,
    pub app_zygote_hook_count: u32,
    pub fuse_active: bool,
    pub fuse_covered: bool,
    pub fuse_target_count: usize,
    pub fuse_root_count: usize,
    pub fuse_relative_count: usize,
    pub last_policy_generation: u64,
}

#[derive(Debug, Deserialize)]
#[serde(rename_all = "camelCase")]
struct ZygiskInboundMsg {
    #[serde(rename = "type")]
    msg_type: String,
    #[serde(default)]
    role: String,
    #[serde(default)]
    pid: u32,
    #[serde(default)]
    pkg_hooks: u32,
    #[serde(default)]
    settings_hooks: u32,
    #[serde(default)]
    usb_hooks: u32,
    #[serde(default)]
    a11y_hooks: u32,
    #[serde(default)]
    app_zygote_hooks: u32,
    #[serde(default)]
    fuse_active: bool,
    #[serde(default)]
    fuse_covered: bool,
    #[serde(default)]
    target_count: usize,
    #[serde(default)]
    root_count: usize,
    #[serde(default)]
    relative_count: usize,
}

struct ClientHandle {
    role: String,
    writer: UnixStream,
}

pub struct ZygiskHub {
    clients: Mutex<HashMap<u64, ClientHandle>>,
    next_id: Mutex<u64>,
    latest_policy_bytes: RwLock<Vec<u8>>,
    pub telemetry: RwLock<TelemetryState>,
}

impl ZygiskHub {
    pub fn new(initial_policy: &CompiledPolicy) -> Arc<Self> {
        let bytes = serde_json::to_vec(initial_policy).unwrap_or_else(|_| b"{}".to_vec());
        write_cold_start_policy_file(&bytes);
        let mut t = TelemetryState::default();
        t.last_policy_generation = initial_policy.generation;
        Arc::new(Self {
            clients: Mutex::new(HashMap::new()),
            next_id: Mutex::new(1),
            latest_policy_bytes: RwLock::new(bytes),
            telemetry: RwLock::new(t),
        })
    }

    pub fn update_and_broadcast(&self, policy: &CompiledPolicy, log: &RingLog) {
        let Ok(bytes) = serde_json::to_vec(policy) else {
            return;
        };
        write_cold_start_policy_file(&bytes);
        if let Ok(mut guard) = self.latest_policy_bytes.write() {
            *guard = bytes.clone();
        }
        if let Ok(mut t) = self.telemetry.write() {
            t.last_policy_generation = policy.generation;
        }

        let mut dead_ids = Vec::new();
        if let Ok(mut clients) = self.clients.lock() {
            for (id, client) in clients.iter_mut() {
                if write_frame(&mut client.writer, &bytes).is_err() {
                    dead_ids.push(*id);
                }
            }
            for id in &dead_ids {
                if let Some(removed) = clients.remove(id) {
                    log.info(&format!("zygisk client disconnected: {}", removed.role));
                }
            }
            if !clients.is_empty() {
                log.info(&format!(
                    "pushed policy gen={} to {} live process(es)",
                    policy.generation,
                    clients.len()
                ));
            }
        }
    }

    pub fn snapshot_telemetry(&self) -> TelemetryState {
        self.telemetry
            .read()
            .map(|g| g.clone())
            .unwrap_or_default()
    }

    pub fn connected_roles(&self) -> Vec<String> {
        let Ok(clients) = self.clients.lock() else {
            return Vec::new();
        };
        clients.values().map(|c| c.role.clone()).collect()
    }
}

pub fn start_zygisk_server(hub: Arc<ZygiskHub>, log: Arc<RingLog>) {
    let sock_path = Path::new(INTERNAL_SOCK_PATH);
    if let Some(parent) = sock_path.parent() {
        let _ = fs::create_dir_all(parent);
    }
    let _ = fs::remove_file(sock_path);

    let listener = match UnixListener::bind(sock_path) {
        Ok(l) => l,
        Err(e) => {
            log.info(&format!("failed to bind internal zygisk socket: {e}"));
            return;
        }
    };
    let _ = fs::set_permissions(sock_path, fs::Permissions::from_mode(0o600));
    log.info("internal zygisk socket listening");

    thread::Builder::new()
        .name("zygisk-hub".into())
        .spawn(move || {
            for stream in listener.incoming() {
                let Ok(stream) = stream else { continue };
                if !is_root_peer(&stream) {
                    continue;
                }
                let hub_clone = Arc::clone(&hub);
                let log_clone = Arc::clone(&log);
                thread::Builder::new()
                    .name("zygisk-client".into())
                    .spawn(move || handle_client(stream, hub_clone, log_clone))
                    .ok();
            }
        })
        .ok();
}

fn is_root_peer(stream: &UnixStream) -> bool {
    use std::os::unix::io::AsRawFd;
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
    rc == 0 && (cred.uid == 0 || cred.uid == 1000)
}

fn handle_client(mut stream: UnixStream, hub: Arc<ZygiskHub>, log: Arc<RingLog>) {
    let Ok(writer_clone) = stream.try_clone() else {
        return;
    };

    let id = {
        let mut next = hub.next_id.lock().unwrap();
        let cur = *next;
        *next += 1;
        cur
    };

    let mut role = "unknown".to_string();
    {
        let mut clients = hub.clients.lock().unwrap();
        clients.insert(
            id,
            ClientHandle {
                role: role.clone(),
                writer: writer_clone,
            },
        );
    }

    // Push current policy immediately upon connection
    if let Ok(bytes) = hub.latest_policy_bytes.read() {
        let mut clients = hub.clients.lock().unwrap();
        if let Some(c) = clients.get_mut(&id) {
            let _ = write_frame(&mut c.writer, &bytes);
        }
    }

    while let Ok(frame) = read_frame(&mut stream) {
        let Ok(msg) = serde_json::from_slice::<ZygiskInboundMsg>(&frame) else {
            continue;
        };
        match msg.msg_type.as_str() {
            "hello" => {
                if !msg.role.is_empty() {
                    role = msg.role.clone();
                    if let Ok(mut clients) = hub.clients.lock() {
                        if let Some(c) = clients.get_mut(&id) {
                            c.role = role.clone();
                        }
                    }
                }
                if let Ok(mut t) = hub.telemetry.write() {
                    match msg.role.as_str() {
                        "system_server" => t.system_server_pid = msg.pid,
                        "settings" => t.settings_provider_pid = msg.pid,
                        "mediaprovider" => t.media_provider_pid = msg.pid,
                        _ => {}
                    }
                }
                log.info(&format!("zygisk connected role={} pid={}", msg.role, msg.pid));
            }
            "telemetry" => {
                if let Ok(mut t) = hub.telemetry.write() {
                    match msg.role.as_str() {
                        "system_server" => {
                            if msg.pid > 0 {
                                t.system_server_pid = msg.pid;
                            }
                            t.pkg_hook_count = msg.pkg_hooks;
                            if msg.settings_hooks > 0 {
                                t.settings_hook_count = msg.settings_hooks;
                                t.settings_hook_ready = true;
                            }
                            t.usb_hook_count = msg.usb_hooks;
                            t.usb_hook_ready = msg.usb_hooks > 0;
                            t.a11y_hook_count = msg.a11y_hooks;
                            t.app_zygote_hook_count = msg.app_zygote_hooks;
                        }
                        "settings" => {
                            if msg.pid > 0 {
                                t.settings_provider_pid = msg.pid;
                            }
                            if msg.settings_hooks > 0 {
                                t.settings_hook_count = msg.settings_hooks;
                                t.settings_hook_ready = true;
                            }
                        }
                        "mediaprovider" => {
                            if msg.pid > 0 {
                                t.media_provider_pid = msg.pid;
                            }
                            t.fuse_active = msg.fuse_active;
                            t.fuse_covered = msg.fuse_covered;
                            t.fuse_target_count = msg.target_count;
                            t.fuse_root_count = msg.root_count;
                            t.fuse_relative_count = msg.relative_count;
                        }
                        _ => {}
                    }
                }
            }
            _ => {}
        }
    }

    if let Ok(mut clients) = hub.clients.lock() {
        clients.remove(&id);
    }
    log.info(&format!("zygisk stream closed role={role}"));
}
