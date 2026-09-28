# Zygisk-Only Cloak Backend

Decision: Causentry does not use Vector or LSPosed as a legacy fallback.

Package cloaking is owned by the bundled Zygisk backend. The root daemon writes
target-scoped policy into `/data/system/causentry/cloak.json`; ZygoteLoader enters
`system_server`, and the bundled ART hook runtime filters Package Manager queries
for the configured target UIDs. Readiness is proved by
`/data/system/causentry/zygisk.cloak.ready`.

Developer-mode cloaking uses the same policy but enters only the framework
`com.android.providers.settings` process. Its hook intercepts a target caller's
`Settings.Global` or `Settings.Secure` read of `development_settings_enabled` and
returns `"0"`. This avoids the global-setting timing/cache race without injecting
the target app. Readiness is proved by
`/data/system/causentry/zygisk.settings.ready`; when absent, the daemon retains the
older foreground-only global-toggle fallback.

The implementation follows the loader shape used by HMA-OSS but uses pinned
upstream AndroidVMTools/PanamaPort dependencies under their respective licenses,
plus Causentry's own policy layer. HMA-OSS itself is not bundled and is not a
fallback dependency.

Rollback: disable/remove Causentry's Zygisk `.so` and reboot. Shell hardening,
developer-option/mocking toggles, SUSFS, and the control UI continue to work; package
cloak stays inactive and developer mode falls back to the foreground toggle until
the ready markers are live again.
