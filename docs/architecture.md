# Architecture

Causentry separates privileged configuration management, ART/Binder interception, FUSE storage filtering, and user-facing controls across four components:

## 1. Native Daemon (`daemon/` -> `causentryd`)

- Written in Rust, launched at `post-fs-data` (`root-module/post-fs-data.sh`) before Zygote specializes `system_server` and system providers.
- Owns `/data/adb/causentry/config.json` (atomic temp-write + rename), resolves installed package UIDs, compiles per-UID policy snapshots, applies optional SUSFS/boot property rules, and cleans MIUI/HyperOS verdict caches when target rules change.
- Runs the Zygisk hub (`internal.sock`) and the `SO_PEERCRED`-authenticated Control RPC servers (`.rpc.sock` and `ctl.sock`).

## 2. Rust Zygisk v4 Loader & Companion (`crates/causentry-zygisk`, `crates/causentry-proto`)

- Implements Zygisk API v4 module entry points and companion FD bridging (`SCM_RIGHTS`) without C++ loader glue.
- Hooks `dlopen` via static Dobby where native hooking is needed (for example, initializing FuseHide once `libfuse_jni.so` loads in MediaProvider).
- Loads the compiled system DEX (`classes.dex`) exclusively inside four target system processes:
  - `system_server` (`android`)
  - `com.android.providers.settings` (AOSP / non-MIUI ROMs)
  - `com.android.providers.media.module`
  - `com.google.android.providers.media.module`

## 3. System Java Hooks & FuseHide (`android/zygote/`)

- **SystemServer & SettingsProvider hooks** (`com.causentry.zygote`, built with AndroidVMTools + PanamaPort):
  - `PackageCloakHooks`: filters Package Manager queries (`getInstalledPackages`, `getInstalledApplications`, `getPackageInfo`, `getApplicationInfo`, intent queries) per caller UID according to each target's assigned `hideTemplate`.
  - `SettingsProviderHooks`: returns `0` / empty for `development_settings_enabled`, `adb_enabled`, `adb_wifi_enabled`, `mock_location`, and accessibility settings checks scoped to caller UID. On HyperOS/MIUI where SettingsProvider runs inside `system_server`, both hooks initialize in `system_server`.
  - `UsbStateHooks`: masks active USB debugging / data-state broadcasts or queries per caller UID when `devOff` is enabled.
  - `AccessibilityHooks` & `AppZygoteHooks`: masks configured accessibility services (`accOff`) and selectively demotes App-Zygote isolation (`isolate`) per target package without touching other apps.
- **FuseHide (`android/zygote/src/main/cpp/fusehide/` + `crates/causentry-fuse-core/`)**:
  - Hooks `MediaProvider`'s FUSE daemon (`libfuse_jni.so`) to filter configured `hiddenRootEntryNames` and `hiddenRelativePaths` from directory listings and stat/lookup calls for target UIDs.
  - Unicode 12.1 normalization, path canonicalization, ELF/ZIP/XZ symbol inspection, and dirent buffer filtering live in `causentry-fuse-core` (`#![forbid(unsafe_code)]` outside FFI boundaries).

## 4. Control App & JNI Helpers (`android/app/`, `android/app/rust/`)

- Kotlin + Jetpack Compose + Hilt UI (`com.causentry.app`) installed automatically from `payload/Causentry.apk`.
- Communicates solely over `no_backup/.rpc.sock` using `LocalSocket` (zero `su` calls, zero network permissions).
- Offloads logcat parsing/crash classification (`forensic-core-rs`) and backup inspection/merge (`backup-core-rs`) to dual-ABI Rust JNI libraries via `com.causentry.app.core.jni`, with JVM fallback implementations for host unit tests.
