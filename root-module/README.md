# Causentry module (KernelSU / KernelSU-Next, Magisk-compatible layout)

Universal detection bypass for apps that refuse to run, show a block dialog, or
force-close because of developer options, mock location / fake-GPS apps, root
tooling, or anti-injection (PairIP / RASP) protection.

Protected apps are never injected by the control APK. Hardened apps can crash when
foreign code is loaded into their process, so the default path is **system / kernel
side** shell hardening. Package cloaking is Zygisk-only; Vector/LSPosed is not used
as a fallback.

## Files

| Path | Purpose |
|---|---|
| `module.prop` | module metadata |
| `customize.sh` | install-time message + payload check |
| `service.sh` | boot: stage runtime, apply protections, start daemon + UI |
| `action.sh` | module Action button: re-apply and open the control UI |
| `uninstall.sh` | restore packages + flags, stop daemon, remove runtime state |
| `config.default.json` | default configuration |
| `bin/*.sh` | lib, apply, restore, watch daemon, root-apps, denylist, status, doctor |
| `webroot/` | legacy browser UI (`index.html`) + token-protected CGI API |
| `payload/Causentry.apk` | native Android control UI app; not an Xposed/LSPosed module |

Runtime state lives in `/data/adb/causentry/` (config, log, legacy restore list,
UI token). Nothing is written inside protected apps.

## Per-app bypass (the main flow)

Pick an app in the control UI, choose its bypass, press **Apply for this app**:

```json
"targets": ["com.example.target"],
"apps": { "com.example.target": { "devOff": true, "mock": true, "hideTemplate": "default" } }
```

* `devOff` - hide the developer-options flag only while that app runs
* `mock`   - force `mock_location=0` and apply the target-scoped hidden-app template while it runs
* apps without an entry fall back to the global toggles (`autoDevOff`, `hideMockLocation`)

The daemon resolves the running app's own feature set on every activation, and restores
the real flags as soon as no protected app is in the foreground.

CLI equivalent: `APP_PKG_NEW=com.x APP_FEATS_NEW=devOff,mock APP_HIDE_TEMPLATE_NEW=default sh bin/appcfg.sh set`
(`del` removes it again, `show` prints the current mapping).

## Configuration (`/data/adb/causentry/config.json`)

| Key | Meaning |
|---|---|
| `targets` | protected apps; the watch daemon hides detection state while they run |
| `hardened` | apps with PairIP/RASP: never injected, handled system side |
| `denylist` | compatibility alias for `hideTemplates.default`; empty by default |
| `hideTemplates` | named package lists hidden from target apps; each protected app chooses one template |
| `root_packages` | extra root-indicator candidates shown for quick add |
| `autoDevOff` | hide the developer-options flag while a target runs |
| `hideMockLocation` | force `mock_location=0`; package hiding follows the app's `hideTemplate` |
| `alwaysHidden` | keep flags hidden permanently (dev menu stays hidden too) |
| `susfs` | kernel-level path hiding when SUSFS is available |
| `hideRootApps` | deprecated compatibility flag; UI/save forces it off |
| `hideMode` | `none` by default; normal apply never disables/uninstalls user apps |
| `systemCloak` | enables target-scoped package cloaking only when the Zygisk ART hook marker is live |

## Control UI (the app) — design rules

The APK uses native Android widgets and follows Android accessibility + Material list guidance:

| Rule | Implementation |
|---|---|
| Touch targets >= 48dp, >= 8dp apart | every row/button/switch hit area is at least 48x48 dp |
| List items: leading slot + 2 lines + trailing | monogram circle + app name + package + state chips + chevron |
| One primary action per screen | sticky bottom bar with **Apply for this app** (destructive action next to it, behind a confirm dialog) |
| Progressive disclosure | app detail has per-app settings; home has app list, template editor, and actions |
| Destructive actions ask first | Restore everything opens a confirmation dialog |
| Never a dead end | loading skeletons, "no match" empty state and a "daemon not running" error state with the fix |
| Feedback | Android toast for every queued action (queued / applied / failed) |
| Contrast | WCAG AA verified for every muted label (measured, not guessed) |
| Accessibility | native Button, Switch, Spinner, CheckBox, EditText, ScrollView |

## Control UI (the app)

Installing the zip is enough: at boot `apply.sh` installs `payload/Causentry.apk` as a
launcher app (disable with `"uiApk": false`). The app:

* shows a native Android interface built from platform widgets (no WebView),
* talks to the root daemon through **its own private files dir** - the daemon drops
  `status.json` / `apps.json` there and executes the commands the app queues in `files/cmd/`,
* therefore needs **no root prompt, no LSPosed, no Vector, no web server and no network**.

`127.0.0.1:8899` (busybox httpd) still exists for the browser and for automation
(`webroot/cgi-bin/api.sh`), and the daemon restarts it if it dies - but nothing depends
on it: if busybox is missing the app keeps working.

## Legacy: browser access



`service.sh` also serves a token-protected page on **127.0.0.1:8899** only:

```
http://127.0.0.1:8899/index.html?t=<contents of /data/adb/causentry/ui.token>
```

The module Action button opens it. From the UI you pick which apps are protected,
which features are on, which packages targets should not be able to enumerate, and
restore everything with one tap.

`cgi-bin/token.sh` intentionally never returns the token. Read the token over `adb`
or use the module Action flow instead.

## Notes / current limitations

- Physical package hiding is deprecated. The normal path keeps Magisk, fake-GPS apps,
  and other selected packages installed and visible to the user.
- Target-scoped package invisibility requires the bundled Zygisk ART hook layer to be
  active in `system_server`.
  Without it, Causentry saves the list and avoids destructive fallback.
- The native Zygisk backend under `zygisk-src/` is bundled when `.so` artifacts are
  present (set `CAUSENTRY_EXCLUDE_ZYGISK=1` to omit it). Stage 1 reports loader
  activity; Java method cloaking still needs the bundled ART hook runtime to be
  completed.
- The watch daemon is currently implemented in shell (`bin/causentryd.sh`). Porting
  long-lived privileged logic into the Rust `daemon/` crate remains a roadmap item.
