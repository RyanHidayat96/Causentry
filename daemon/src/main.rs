#[cfg(unix)]
mod unix_main {
    use std::fs::{self, File};
    use std::io::Write;
    use std::os::unix::net::UnixStream;
    use std::path::Path;
    use std::process::ExitCode;
    use std::sync::{Arc, Mutex};
    use std::time::Instant;

    use causentryd::config::Config;
    use causentryd::framing::{read_frame, write_frame};
    use causentryd::ipc_ui::{start_ui_rpc_servers, DaemonState};
    use causentryd::ipc_zygisk::{start_zygisk_server, ZygiskHub};
    use causentryd::packages::read_package_uids;
    use causentryd::ringlog::RingLog;
    use causentryd::system::{
        apply_boot_props, apply_susfs, ensure_runtime_dirs, grant_read_logs, CONFIG_PATH,
        CTL_SOCK_PATH, DATA_DIR, LOG_PATH,
    };
    use causentryd::version_line;

    fn send_ctl_command(action: &str) -> Result<String, String> {
        let mut stream = UnixStream::connect(CTL_SOCK_PATH)
            .map_err(|e| format!("cannot connect to causentryd ({CTL_SOCK_PATH}): {e}"))?;
        let payload = format!(r#"{{"action":"{action}"}}"#);
        write_frame(&mut stream, payload.as_bytes()).map_err(|e| e.to_string())?;
        let resp = read_frame(&mut stream).map_err(|e| e.to_string())?;
        Ok(String::from_utf8_lossy(&resp).to_string())
    }

    fn run_serve() -> ExitCode {
        ensure_runtime_dirs();

        let pid_path = Path::new(DATA_DIR).join("daemon.pid");
        if let Ok(mut f) = File::create(&pid_path) {
            let _ = writeln!(f, "{}", std::process::id());
        }

        let log = Arc::new(RingLog::new(LOG_PATH.into()));
        let cfg = Config::load_or_default(Path::new(CONFIG_PATH));
        if !Path::new(CONFIG_PATH).exists() {
            let _ = cfg.save_atomic(Path::new(CONFIG_PATH));
        }

        log.info(&format!("{} starting (pid={})", version_line(), std::process::id()));

        apply_boot_props(&log);
        apply_susfs(cfg.susfs, &log);
        grant_read_logs();

        let pkg_uids = read_package_uids();
        let initial_policy = cfg.compile_policy(&pkg_uids, 1);
        let hub = ZygiskHub::new(&initial_policy);

        let state = Arc::new(DaemonState {
            config: Mutex::new(cfg),
            hub: Arc::clone(&hub),
            log: Arc::clone(&log),
            started_at: Instant::now(),
            generation: Mutex::new(1),
            root_provider: causentryd::system::detect_root_provider(),
            control_uid: Mutex::new(None),
        });

        start_zygisk_server(hub, Arc::clone(&log));
        start_ui_rpc_servers(Arc::clone(&state));

        log.info("daemon ready (event-driven, 0% idle polling)");

        loop {
            std::thread::park();
        }
    }

    pub fn entry() -> ExitCode {
        let mut args = std::env::args().skip(1);

        match args.next().as_deref() {
            Some("--version") | Some("-V") => {
                println!("{}", version_line());
                ExitCode::SUCCESS
            }
            Some("serve") => run_serve(),
            Some("apply") => match send_ctl_command("apply") {
                Ok(resp) => {
                    if let Ok(val) = serde_json::from_str::<serde_json::Value>(&resp) {
                        let targets = val["targets"].as_array().map(|a| a.len()).unwrap_or(0);
                        let zygisk = val["zygisk"].as_str().unwrap_or("unknown");
                        println!("Causentry: applied ({targets} target(s), zygisk={zygisk})");
                    }
                    ExitCode::SUCCESS
                }
                Err(e) => {
                    ensure_runtime_dirs();
                    let log = RingLog::new(LOG_PATH.into());
                    let cfg = Config::load_or_default(Path::new(CONFIG_PATH));
                    apply_boot_props(&log);
                    apply_susfs(cfg.susfs, &log);
                    let policy = cfg.compile_policy(&read_package_uids(), 1);
                    if let Ok(bytes) = serde_json::to_vec(&policy) {
                        causentryd::system::write_cold_start_policy_file(&bytes);
                    }
                    eprintln!("Causentry: applied offline ({e})");
                    ExitCode::SUCCESS
                }
            },
            Some("status") => match send_ctl_command("get_status") {
                Ok(resp) => {
                    if let Ok(v) = serde_json::from_str::<serde_json::Value>(&resp) {
                        println!("Causentry {}", causentryd::VERSION);
                        println!("--------------");
                        println!("daemon       : pid {} ({}s)", v["daemonPid"], v["daemonUptimeSec"]);
                        println!("root         : {}", v["rootProvider"].as_str().unwrap_or("?"));
                        println!(
                            "zygisk       : {} (pkgHooks={}, settingsHooks={}, usbHooks={}, a11yHooks={})",
                            v["zygisk"].as_str().unwrap_or("?"),
                            v["pkgHookCount"],
                            v["settingsHookCount"],
                            v["usbHookCount"],
                            v["a11yHookCount"]
                        );
                        println!(
                            "fuse         : active={}, covered={}, targets={}",
                            v["fuse"]["active"], v["fuse"]["covered"], v["fuse"]["targetCount"]
                        );
                        println!("susfs        : {}", v["susfs"].as_str().unwrap_or("unsupported"));
                        println!("targets      : {}", v["targets"]);
                    } else {
                        println!("{resp}");
                    }
                    ExitCode::SUCCESS
                }
                Err(e) => {
                    eprintln!("{e}");
                    ExitCode::FAILURE
                }
            },
            Some("restore") => match send_ctl_command("restore") {
                Ok(_) => {
                    println!("Causentry: restored default settings");
                    ExitCode::SUCCESS
                }
                Err(e) => {
                    let _ = fs::remove_file(Path::new(CONFIG_PATH));
                    eprintln!("Causentry: restore fallback ({e})");
                    ExitCode::SUCCESS
                }
            },
            Some("--help") | Some("-h") | None => {
                println!("{} - Privileged native daemon for Causentry", causentryd::DAEMON_NAME);
                println!();
                println!("Usage:");
                println!("  causentryd serve      Run the background daemon");
                println!("  causentryd apply      Trigger immediate policy & prop reconciliation");
                println!("  causentryd status     Print live daemon and hook diagnostics");
                println!("  causentryd restore    Clear active protections");
                println!("  causentryd --version  Print version");
                ExitCode::SUCCESS
            }
            Some(arg) => {
                eprintln!("unknown argument: {arg}");
                ExitCode::from(2)
            }
        }
    }
}

#[cfg(not(unix))]
mod unix_main {
    use std::process::ExitCode;
    pub fn entry() -> ExitCode {
        println!("{}", causentryd::version_line());
        ExitCode::SUCCESS
    }
}

fn main() -> std::process::ExitCode {
    unix_main::entry()
}
