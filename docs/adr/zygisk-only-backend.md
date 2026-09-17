# Zygisk-Only Cloak Backend

Decision: Causentry does not use Vector or LSPosed as a legacy fallback.

Package cloaking is owned by the bundled Zygisk backend. The root daemon writes
target-scoped policy into `/data/system/causentry/cloak.json`; ZygoteLoader enters
`system_server`, and the bundled ART hook runtime filters Package Manager queries
for the configured target UIDs. Readiness is proved by
`/data/system/causentry/zygisk.cloak.ready`.

The implementation follows the loader shape used by HMA-OSS but uses pinned
upstream AndroidVMTools/PanamaPort dependencies under their respective licenses,
plus Causentry's own policy layer. HMA-OSS itself is not bundled and is not a
fallback dependency.

Rollback: disable/remove Causentry's Zygisk `.so` and reboot. Shell hardening,
developer-option/mocking toggles, SUSFS, and the control UI continue to work; cloak
mode remains inactive until the `zygisk.cloak.ready` marker is live again.
