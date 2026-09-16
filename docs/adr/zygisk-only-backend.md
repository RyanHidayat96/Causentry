# Zygisk-Only Cloak Backend

Decision: Causentry does not use Vector or LSPosed as a legacy fallback.

Package cloaking is owned by the bundled Zygisk backend. The root daemon writes
target-scoped policy into `/data/system/causentry/cloak.json`; Zygisk enters
`system_server` and writes `/data/system/causentry/zygisk.loaded` with the live
`system_server` pid.

Raw Zygisk loads code into `system_server`, but it does not hook arbitrary Java
methods by itself. The next backend step must bundle an ART hook runtime inside
Causentry, similar in shape to HMA-OSS using Zygisk as the loader and an internal
hooking layer for PackageManager/AppOps/Settings methods. That hook layer must
write `/data/system/causentry/zygisk.cloak.ready`; until then, cloak mode stays
inactive even when Zygisk loading is active. Do not copy HMA-OSS AGPL code unless
Causentry intentionally adopts compatible licensing.

Rollback: disable/remove Causentry's Zygisk `.so` and reboot. Shell hardening,
developer-option/mocking toggles, SUSFS, and the control UI continue to work; cloak
mode remains inactive until the `zygisk.cloak.ready` marker is live again.
