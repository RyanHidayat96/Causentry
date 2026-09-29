# Architecture

Causentry currently ships as a universal root module plus a small Android control UI.

- `root-module/`: Magisk/KernelSU-compatible module layout. Boot logic stages
  runtime files, starts the shell daemon, applies configured protections, and serves
  the optional localhost UI.
- `root-module/bin/causentryd.sh`: foreground watcher. It controls mock-location
  state while protected apps are active, uses the legacy global developer-mode
  toggle only while the provider hook is unavailable, refreshes app/status snapshots
  for the UI, and processes file-backed commands.
- `payload-src/`: Java native Android APK. It uses platform widgets and communicates
  with the daemon through private app files, so the APK does not need root, network
  access, WebView, or a JavaScript bridge.
- `root-module/webroot/`: legacy localhost browser UI and CGI API protected by a
  per-install token.
- `android/zygote/`: ZygoteLoader backend injected into `system_server` and, where
  the ROM uses one, the framework SettingsProvider. It loads the pinned
  AndroidVMTools/PanamaPort ART hook runtime, filters Package Manager queries, and
  returns developer-mode, USB-debugging, and wireless-ADB settings as OFF for
  configured caller UIDs. MIUI hosts SettingsProvider in `system_server`, so that
  backend installs the same hook there.
- `zygisk-src/`: old native stage-1 diagnostic backend. It is not used by the
  release packer when the Java ART backend is available.

Long-lived privileged logic may move into the Rust `daemon/` crate later. The
production path is the shell module runtime plus bundled system-side ART backends.
The module does not use Vector/LSPosed as a legacy fallback and never injects a
protected target app for developer-mode cloaking.
