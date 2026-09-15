# Causentry module (KernelSU / KernelSU-Next, Magisk-compatible layout)

Universal detection bypass for apps that refuse to run, show a block dialog, or
force-close because of developer options, mock location / fake-GPS apps, root
tooling, or anti-injection (PairIP / RASP) protection.

Protected apps are never injected by default. Hardened apps can crash when foreign
code is loaded into their process, so the default path is **system / kernel side**
shell hardening. Optional hook backends are explicit and must be verified per device.

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
| `webroot/` | control UI (`index.html`) + token-protected CGI API |
| `payload/Causentry.apk` | control UI and optional hook app (only for apps that are *not* PairIP-hardened) |

Runtime state lives in `/data/adb/causentry/` (config, log, hidden package list,
UI token). Nothing is written inside protected apps.

## Per-app bypass (the main flow)

Pick an app in the control UI, choose its bypass, press **Apply for this app**:

```json
"targets": ["com.bpjstku"],
"apps": { "com.bpjstku": { "devOff": true, "mock": true } }
```

* `devOff` - hide the developer-options flag only while that app runs
* `mock`   - force `mock_location=0` (and hide fake-GPS packages) while it runs
* apps without an entry fall back to the global toggles (`autoDevOff`, `hideMockLocation`)

The daemon resolves the running app's own feature set on every activation, and restores
the real flags as soon as no protected app is in the foreground.

CLI equivalent: `APP_PKG_NEW=com.x APP_FEATS_NEW=devOff,mock sh bin/appcfg.sh set`
(`del` removes it again, `show` prints the current mapping).

## Configuration (`/data/adb/causentry/config.json`)

| Key | Meaning |
|---|---|
| `targets` | protected apps; the watch daemon hides detection state while they run |
| `hardened` | apps with PairIP/RASP: never injected, handled system side |
| `denylist` | packages hidden for the user (fake-GPS tools, ...) |
| `root_packages` | extra root-indicator packages to hide |
| `autoDevOff` | hide the developer-options flag while a target runs |
| `hideMockLocation` | force `mock_location=0` and hide fake-GPS apps |
| `alwaysHidden` | keep flags hidden permanently (dev menu stays hidden too) |
| `susfs` | kernel-level path hiding when SUSFS is available |
| `hideRootApps` | hide Magisk Manager & friends for the user |
| `hooks` | install/scope the optional in-process payload (non-hardened apps only) |
| `hideMode` | `hide` by default; `cloak` falls back to `hide` unless `systemCloak` is true |
| `systemCloak` | enables non-destructive package cloaking only when a verified backend is installed |

## Control UI (the app) — design rules

The page shipped inside the APK follows the Android accessibility + Material list guidance:

| Rule | Implementation |
|---|---|
| Touch targets >= 48dp, >= 8dp apart | every row/button/switch hit area is at least 48x48 CSS px (`--tap`) |
| List items: leading slot + 2 lines + trailing | monogram circle + app name + package + state chips + chevron |
| One primary action per screen | sticky bottom bar with **Apply for this app** (destructive action next to it, behind a confirm dialog) |
| Progressive disclosure | Apps is the only expanded card; Advanced / Detection packages / Root apps / Actions collapse and show a summary in the header |
| Destructive actions ask first | Remove protection and Restore everything both open a confirmation dialog |
| Never a dead end | loading skeletons, "no match" empty state and a "daemon not running" error state with the fix |
| Feedback | toast for every queued action (queued / applied / failed) |
| Contrast | WCAG AA verified for every muted label (measured, not guessed) |
| Accessibility | role=switch + aria-checked + aria-label on switch rows, aria-live toast, aria-expanded collapsibles, focus-visible rings, prefers-reduced-motion honoured |
| Language | follows the phone language (English / Indonesian), overridable in Advanced -> Language |

## Control UI (the app)

Installing the zip is enough: at boot `apply.sh` installs `payload/Causentry.apk` as a
launcher app (disable with `"uiApk": false`). The app:

* shows the same interface as before, bundled inside the APK (`assets/index.html`),
* talks to the root daemon through **its own private files dir** - the daemon drops
  `status.json` / `apps.json` there and executes the commands the app queues in `files/cmd/`,
* therefore needs **no root prompt, no LSPosed, no web server and no network**.

`127.0.0.1:8899` (busybox httpd) still exists for the browser and for automation
(`webroot/cgi-bin/api.sh`), and the daemon restarts it if it dies - but nothing depends
on it: if busybox is missing the app keeps working.

## Legacy: browser access



`service.sh` also serves a token-protected page on **127.0.0.1:8899** only:

```
http://127.0.0.1:8899/index.html?t=<contents of /data/adb/causentry/ui.token>
```

The module Action button opens it. From the UI you pick which apps are protected and
which features are on, see which root apps are visible to the system, and restore
everything with one tap.

`cgi-bin/token.sh` intentionally never returns the token. Read the token over `adb`
or use the module Action flow instead.

## Notes / current limitations

- `pm uninstall --user 0` is reversible for **system** apps; for **user-installed**
  apps Android deletes the APK too, so Restore cannot bring those back.
- `hideMode=cloak` requires a working system-side backend. Without `systemCloak=true`,
  Causentry falls back to the safer `pm hide` path.
- The native Zygisk backend under `zygisk-src/` is stage-1 only and is excluded from
  release zips unless `CAUSENTRY_INCLUDE_EXPERIMENTAL_ZYGISK=1` is set.
- The watch daemon is currently implemented in shell (`bin/causentryd.sh`). Porting
  long-lived privileged logic into the Rust `daemon/` crate remains a roadmap item.
