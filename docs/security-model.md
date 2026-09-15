# Security Model

Core principles:

- No arbitrary shell command RPCs from the APK.
- No mandatory Zygisk, LSPosed, KPM, metamodule, root hiding, or third-party module dependency.
- No SELinux permissive mode.
- No protected-app process injection by default.
- Bounded privileged behavior: shell actions are allowlisted, package inputs are
  validated, and the browser API requires a local per-install token.
- Fallbacks prefer reversible state changes. `hideMode=cloak` only stays active when a
  verified `systemCloak` backend is enabled; otherwise the module falls back to `hide`.
- The UI APK does not request network access and blocks WebView navigation outside its
  bundled asset page.

Known tradeoff: `pm uninstall --user 0` can be irreversible for user-installed apps
because Android may remove the APK. The module therefore treats that path as a fallback
and documents it clearly.
