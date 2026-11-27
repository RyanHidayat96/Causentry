# Security Model

Causentry isolates policy enforcement in system processes and a privileged native daemon rather than injecting into target applications or leaving global system settings disabled.

## Core Guarantees

- **Allowlisted Control RPC**: `causentryd` accepts only schema-validated JSON requests (`get_status`, `refresh`, `set_app`, `del_app`, `save_template`, `save_storage_rules`, `import_config`, `apply`, `restore`, `diag`). Package names, template keys, and storage rules are validated before modifying `/data/adb/causentry/config.json`.
- **Kernel-Authenticated IPC (`SO_PEERCRED`)**: Connections to `/data/user/0/com.causentry.app/no_backup/.rpc.sock` (and `/data/adb/causentry/ctl.sock`) are checked via `SO_PEERCRED`. Peers whose UID is neither root (`0`) nor the resolved app ID of `com.causentry.app` are dropped before reading frames.
- **Rootless Control App**: `com.causentry.app` never spawns `su` and does not declare `android.permission.INTERNET` or host a WebView. Logcat forensics uses `READ_LOGS`, granted during module installation/boot.
- **Scoped SELinux Policy**: `root-module/sepolicy.rule` keeps SELinux `Enforcing` and avoids global `deny` rules on shared domains such as `app_zygote` (which would break isolated renderers in unrelated apps).
- **System-Side Enforcement**: Package visibility filtering, Settings/USB spoofing, accessibility masking, App-Zygote handling, and FUSE storage filtering run inside `system_server`, `SettingsProvider`, and `MediaProvider` without modifying target APKs or injecting into target app processes.
- **Restricted Storage Paths**: Daemon state lives under `/data/adb/causentry` (`0700`, `root:root`); the cold-start snapshot under `/data/system/causentry` (`0700`, `system:system`, `u:object_r:system_data_file:s0`).
