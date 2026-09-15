# Architecture

Causentry is split into three major artifacts:

- Android APK: Kotlin, Jetpack Compose, Material 3, Hilt, Room, DataStore.
- `causentryd`: Rust daemon for privileged diagnostics.
- Universal root module: module wrapper for Magisk, KernelSU family, KernelSU Next, and APatch.

This STEP 1 foundation creates directories and build entrypoints only. Collectors, IPC, provider detection, diagnosis, and packaging are future steps.
