# Causentry module (KernelSU / KernelSU-Next, Magisk-compatible layout)

Universal detection bypass for apps that refuse to run, show a block dialog, or
force-close because of developer options, mock location / fake-GPS apps, root
tooling, or anti-injection (PairIP / RASP) protection.

Nothing is ever injected into a protected app: hardened apps crash on injection, so
every bypass here is **system / kernel side**.

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
| `payload/Causentry.apk` | optional in-process hook app (only for apps that are *not* PairIP-hardened) |

Runtime state lives in `/data/adb/causentry/` (config, log, hidden package list,
UI token). Nothing is written inside protected apps.

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

## Control UI

`service.sh` serves a token-protected UI on **127.0.0.1:8899** only:

```
http://127.0.0.1:8899/index.html?t=<contents of /data/adb/causentry/ui.token>
```

The module Action button opens it. From the UI you pick which apps are protected and
which features are on, see which root apps are visible to the system, and restore
everything with one tap.

## Notes / current limitations

- `pm uninstall --user 0` is reversible for **system** apps; for **user-installed**
  apps Android deletes the APK too, so Restore cannot bring those back.
- The watch daemon is implemented in shell (`bin/causentryd.sh`). CODEX.md wants
  complex logic in the Rust `daemon/` crate; porting it is part of the roadmap, and
  the module keeps working in the meantime.
