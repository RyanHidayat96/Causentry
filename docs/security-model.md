# Security Model

Core principles:

- No arbitrary shell command RPCs from the APK.
- No LSPosed, Vector, KPM, metamodule, root hiding, or third-party module dependency.
- No SELinux permissive mode.
- No protected-app process injection by default.
- Bounded privileged behavior: shell actions are allowlisted, package inputs are
  validated, and the browser API requires a local per-install token.
- Fallbacks prefer reversible state changes. `hideMode=cloak` only stays active when
  the bundled Zygisk ART hook marker is live in `system_server`; otherwise the module keeps
  package lists saved and avoids destructive hiding.
- The UI APK does not request network access and blocks WebView navigation outside its
  bundled asset page.

Known tradeoff: `pm uninstall --user 0` can be irreversible for user-installed apps
because Android may remove the APK. The module therefore treats that path as a fallback
and documents it clearly.
