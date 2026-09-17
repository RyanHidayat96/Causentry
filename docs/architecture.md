# Architecture

Causentry currently ships as a universal root module plus a small Android control UI.

- `root-module/`: Magisk/KernelSU-compatible module layout. Boot logic stages
  runtime files, starts the shell daemon, applies configured protections, and serves
  the optional localhost UI.
- `root-module/bin/causentryd.sh`: foreground watcher. It toggles developer-options
  and mock-location state only while protected apps are active, refreshes app/status
  snapshots for the UI, and processes file-backed commands.
- `payload-src/`: Java native Android APK. It uses platform widgets and communicates
  with the daemon through private app files, so the APK does not need root, network
  access, WebView, or a JavaScript bridge.
- `root-module/webroot/`: legacy localhost browser UI and CGI API protected by a
  per-install token.
- `android/zygote/`: ZygoteLoader backend injected only into `system_server`. It
  loads the pinned AndroidVMTools/PanamaPort ART hook runtime and filters Package
  Manager queries using the daemon's target-scoped policy.
- `zygisk-src/`: old native stage-1 diagnostic backend. It is not used by the
  release packer when the Java ART backend is available.

Long-lived privileged logic may move into the Rust `daemon/` crate later. The
production path is the shell module runtime plus the bundled `system_server` ART
backend. The module does not use Vector/LSPosed as a legacy fallback.
