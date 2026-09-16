# Architecture

Causentry currently ships as a universal root module plus a small Android control UI.

- `root-module/`: Magisk/KernelSU-compatible module layout. Boot logic stages
  runtime files, starts the shell daemon, applies configured protections, and serves
  the optional localhost UI.
- `root-module/bin/causentryd.sh`: foreground watcher. It toggles developer-options
  and mock-location state only while protected apps are active, refreshes app/status
  snapshots for the UI, and processes file-backed commands.
- `payload-src/`: Java WebView APK. It bundles the same HTML UI and communicates with
  the daemon through private app files, so the APK does not need root, network access,
  or a JavaScript HTTP bridge.
- `root-module/webroot/`: legacy localhost browser UI and CGI API protected by a
  per-install token.
- `zygisk-src/`: native Zygisk backend. Stage 1 proves `system_server` injection and
  writes a live loading marker; the ART method hooks for package cloaking are the
  next backend step.

Long-lived privileged logic may move into the Rust `daemon/` crate later. Until then,
the production path is the shell module runtime plus the bundled Zygisk backend. The
module does not use Vector/LSPosed as a legacy fallback.
