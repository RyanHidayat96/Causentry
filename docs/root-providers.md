# Root Providers

Supported package layout:

- Magisk-compatible module directory and service/action scripts.
- KernelSU and KernelSU-Next module managers.
- APatch-compatible module installation when it honors the Magisk-style layout.

Runtime behavior is intentionally conservative:

- Module scripts avoid SELinux permissive mode.
- Feature detection prefers local binaries (`ksud`, `magisk`, BusyBox/httpd, SUSFS
  controls) instead of assuming one provider.
- UI operation does not require the Android app to receive root.
- `systemCloak` is served by the bundled Zygisk backend only. It should be verified
  on the target ROM/provider combination before being treated as production.

No-root limited mode and provider-specific Rust adapters remain future work.
