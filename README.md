# Causentry

Causentry is a universal Android root-cause diagnostic platform. Its goal is to explain observable application startup failures, crashes, freezes, environment correlations, and unknowns without hiding uncertainty.

This repository follows `CODEX.md` as the authoritative engineering specification. Development proceeds one roadmap step at a time.

## Status

Current implementation target: STEP 1 - Repository & Toolchain Foundation.

Implemented foundation:

- Android Kotlin/Jetpack Compose app scaffold in `android/`
- Rust daemon crate in `daemon/`
- Universal root-module skeleton in `root-module/`
- Proto, rules, testdata, scripts, and initial documentation directories

Collectors, IPC, provider detection, diagnosis, and packaging are intentionally not implemented yet.

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

Toolchain requirements are tracked in `CODEX.md` STEP 0.
