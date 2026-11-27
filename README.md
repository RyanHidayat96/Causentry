<div align="center">

<img src="docs/assets/icon.svg" width="96" height="96" alt="Causentry">

<h1>Causentry</h1>

<p>System-level root artifact containment and identity isolation module for Android.</p>

<p>
  <a href="https://github.com/RyanHidayat96/Causentry/releases/latest"><img src="https://img.shields.io/github/v/release/RyanHidayat96/Causentry?style=flat-square&color=3B82F6" alt="Release"></a>
  <a href="https://github.com/RyanHidayat96/Causentry/actions/workflows/ci.yml"><img src="https://img.shields.io/github/actions/workflow/status/RyanHidayat96/Causentry/ci.yml?style=flat-square" alt="CI"></a>
  <a href="LICENSE"><img src="https://img.shields.io/badge/License-Apache--2.0-12141A?style=flat-square" alt="License"></a>
  <img src="https://img.shields.io/badge/Android-8.0%2B%20(API%2026%2B)-3B82F6?style=flat-square" alt="Android 8.0+">
  <img src="https://img.shields.io/badge/ABI-arm64--v8a%20%7C%20armeabi--v7a-12141A?style=flat-square" alt="ABI">
</p>

</div>

## Overview

Causentry is a multi-layer Android root module (`causentryd`, a Zygisk module, a system-server Java hook, and a Jetpack Compose control app) built to hide root traces, package visibility signals, mount tables, and selected device identifiers on a per-package basis without modifying or injecting code into protected target applications.

## Scope & Non-Goals

> [!NOTE]
> Causentry focuses on userspace/runtime containment (mount namespaces, `system_server` / `SettingsProvider` mediation, property filtering, and identity overrides). It does **not** bypass Play Integrity hardware attestation (`MEETS_STRONG_INTEGRITY`) and is intended to complement keybox/attestation modules rather than replace them.

- **No target app injection**: Target applications are never patched or hooked directly in-process; mediation runs through `causentryd` and `system_server` / `SettingsProvider` hooks.
- **SELinux stays Enforcing**: Policy rules are injected cleanly via `sepolicy.rule` without switching SELinux to permissive mode.
- **Scoped isolation**: Protection rules are applied per target UID/package without restricting `app_zygote` globally.

## Compatibility

| Component | Supported Range / Notes |
| --- | --- |
| Root Manager | KernelSU, KernelSU Next, Magisk, APatch |
| Zygisk Runtime | Zygisk Next, ReZygisk, Magisk built-in Zygisk |
| Android Version | Android 8.0 - 16 (API 26+, see [`root-module/module.prop`](root-module/module.prop)) |
| Architecture | `arm64-v8a` (primary), `armeabi-v7a` |
| `SettingsProvider` | AOSP standalone `SettingsProvider` process and MIUI/HyperOS in-`system_server` `SettingsProvider` |

See [Root Providers](docs/root-providers.md) for manager-specific behavior and mount/path details.

## Installation

1. Ensure a supported root manager (KernelSU / KernelSU Next / Magisk / APatch) and Zygisk runtime are installed and active.
2. Download the latest module archive (for example `Causentry-KSUN-v*.zip`) from [Releases](https://github.com/RyanHidayat96/Causentry/releases) or build it locally from source.
3. Flash the ZIP archive in your root manager and reboot the device.
4. Open the Causentry app to configure protected packages, mount hiding, and per-app identity overrides.

To inspect daemon health or re-apply configuration from an elevated shell:

```sh
su -c "/data/adb/causentry/causentryd status"
su -c "/data/adb/causentry/causentryd apply"
```

## Architecture

Causentry splits privileged enforcement, Zygisk/Java interception, and UI configuration across distinct privilege boundaries:

- **Native Daemon (`daemon/`)**: Rust daemon (`causentryd`) managing configuration (`/data/adb/causentry/config.json`), cloak state (`/data/system/causentry/cloak.json`), socket IPC, mount namespace isolation, and system property mediation.
- **Zygisk & System-Server Layer (`crates/causentry-zygisk/`, `android/zygote/`)**: Hooks `system_server` and `SettingsProvider` to mediate package queries, settings reads, and identity fields per protected UID.
- **Shared Wire Protocol (`crates/causentry-proto/`)**: Shared IPC serialization and type definitions shared across daemon and Zygisk components.
- **Control Application (`android/app/`)**: Jetpack Compose management app with JNI helpers (`forensic-core-rs`, `backup-core-rs`) communicating with `causentryd` over `SO_PEERCRED`-verified local sockets (`/data/user/0/com.causentry.app/no_backup/.rpc.sock`, `/data/adb/causentry/ctl.sock`, `/data/adb/causentry/internal.sock`).

Documentation:

- [Architecture Overview](docs/architecture.md)
- [IPC & Wire Protocol](docs/protocol.md)
- [Security Model](docs/security-model.md)
- [Root Providers](docs/root-providers.md)

## Building from Source

### Host Verification (Cross-Platform)

Run Rust workspace tests, Clippy checks, and Android debug/unit test verification via [`scripts/verify.sh`](scripts/verify.sh):

```sh
./scripts/verify.sh
```

Individual verification targets:

```sh
cargo test --workspace
cargo clippy --workspace -- -D warnings
cargo test --manifest-path android/app/rust/forensic-core-rs/Cargo.toml
cargo test --manifest-path android/app/rust/backup-core-rs/Cargo.toml
cd android && gradle --no-daemon :app:testDebugUnitTest
```

### Module ZIP Packaging (Windows)

Full release ZIP packaging (cross-compiling native binaries, Zygisk payload, JNI libraries, and control APK into `release/`) runs on Windows with [`build.ps1`](build.ps1) (wrapping [`scripts/build-causentry.ps1`](scripts/build-causentry.ps1)):

```powershell
.\build.ps1
```

Optional flags:

- `.\build.ps1 -NoApk`: Build native module artifacts without rebuilding the control APK.
- `.\build.ps1 -Deploy`: Push and install the built package over ADB after compilation.

## Troubleshooting & Bug Reports

If a protected app still detects root or an unrelated app encounters unexpected issues after enabling protection, run the diagnostics below before opening an issue:

```sh
su -c "/data/adb/causentry/causentryd status"
su -c "tail -n 200 /data/adb/causentry/causentry.log"
```

When reporting a bug, include:

1. Device model, Android version, and ROM (AOSP, HyperOS/MIUI, ColorOS, OneUI, etc.).
2. Root manager and Zygisk implementation/version.
3. Exact output of `causentryd status` and relevant entries from `/data/adb/causentry/causentry.log`.
4. Reproduction steps and the affected package name.

## Credits & License

Causentry is licensed under the [Apache License 2.0](LICENSE).

Third-party projects, attributions, and licenses are documented in [NOTICE](NOTICE), including:

- FuseHide (XiaoTong6666, Apache-2.0)
- Dobby (jmpews, Apache-2.0)
- ZygoteLoader, Pine, AndroidVMTools, and PanamaPort (Apache-2.0 / MIT)
- Serde and `libc` (Apache-2.0 / MIT)
