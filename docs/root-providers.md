# Root Providers

Causentry packages a standard Magisk-compatible module directory (`root-module/`) that works across:

- KernelSU and KernelSU Next
- Magisk (with Zygisk enabled)
- APatch (with ZygiskNext / compatible Zygisk loader)

## Runtime Behavior

- SELinux stays `Enforcing` at all times; `sepolicy.rule` adds only the minimal domain rules required for socket IPC between the control UI, system processes, and `causentryd`.
- Provider detection in `causentryd` (`daemon/src/system.rs`) checks `/data/adb/ksu`, `/data/adb/ap`, and `/data/adb/magisk` dynamically without hardcoding a single root manager.
- SUSFS userspace tools (`ksu_susfs` / `susfsd`) are probed at runtime when `"susfs": true` is configured; if unavailable, the remaining hooks continue to operate normally.
- The control UI (`com.causentry.app`) does not request `su` access. All privileged operations execute inside `causentryd`, gated by `SO_PEERCRED` UID checks.
