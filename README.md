# Causentry

Causentry is a universal Android root-cause diagnostic platform. Its goal is to explain observable application startup failures, crashes, freezes, environment correlations, and unknowns without hiding uncertainty.

Development proceeds one roadmap step at a time. The root-module implementation in
`root-module/` is currently the most complete artifact; the Rust daemon and Android
Kotlin app remain foundation scaffolds.

## Status

Current implementation target: root-module hardening and device validation.

Implemented foundation:

- Android Kotlin/Jetpack Compose app scaffold in `android/`
- Rust daemon crate in `daemon/`
- Universal root-module skeleton in `root-module/`
- Proto, rules, testdata, scripts, and initial documentation directories

The root module now includes shell-based privileged state management, a bundled native
Android control app, file-based app-to-daemon RPC, and a legacy token-protected loopback CGI UI.
The Rust diagnostic daemon, provider adapters, collectors, and analyzer are still roadmap
work.

## Build

Android:

``` sh
./scripts/build-android.sh
```

Daemon:

``` sh
./scripts/build-daemon.sh
```

All available host checks:

``` sh
./scripts/verify.sh
```

Toolchain requirements are captured in the build scripts and Android/Rust project files.
