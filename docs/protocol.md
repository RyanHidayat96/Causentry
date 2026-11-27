# Protocol

Causentry uses length-prefixed JSON framing (`4`-byte big-endian length header followed by payload bytes, capped at `4 MiB` in `causentry-proto`) across two local Unix-domain channels.

## 1. Control UI / CLI (`ctl.sock` and `.rpc.sock`)

`causentryd` listens on two Unix stream sockets:

- **App-private UI socket**: `/data/user/0/com.causentry.app/no_backup/.rpc.sock` (`0660`, owned and SELinux-labeled for `com.causentry.app`).
- **Root CLI socket**: `/data/adb/causentry/ctl.sock` (`0600`, root-only).

On every connection, `causentryd` inspects `SO_PEERCRED` (`getsockopt(SOL_SOCKET, SO_PEERCRED)`). Only `uid == 0` or a peer whose `uid % 100000` matches `com.causentry.app` is authorized.

Supported JSON actions (`UiRequest` in `daemon/src/ipc_ui.rs`):

| Action | Purpose |
|---|---|
| `get_status` | Return current telemetry, hook readiness, active config, and daemon log tail |
| `refresh` | Re-read package UIDs, recompile policy, and broadcast to active Zygisk hooks |
| `set_app` | Upsert per-app flags (`devOff`, `mock`, `isolate`, `accOff`, `template`), push policy, force-stop target |
| `del_app` | Remove per-app policy entry, push policy, force-stop target |
| `save_template` | Create, update, or delete a hidden-app package template |
| `save_storage_rules` | Update FUSE hidden root entries and relative paths |
| `import_config` | Validate and apply a full configuration JSON object |
| `apply` | Apply boot props, SUSFS state, and push compiled policy |
| `restore` | Clear active per-app targets, push empty policy, and restart previously targeted apps |
| `diag` | Sample current global Settings values into daemon logs and return status |

Every request returns a single `RpcStatusResponse` JSON frame containing live hook counters, FUSE status, active config, and recent log entries.

## 2. Zygisk Companion Channel (`internal.sock`)

Zygisk modules loaded inside `system_server`, `com.android.providers.settings`, and `com.android.providers.media.module` / `com.google.android.providers.media.module` connect to the `causentry-zygisk` root companion during `preSystemServerSpecialize` / `preAppSpecialize`.

1. The native loader sends a `CompanionHandshake { target, pid }` struct describing the process role.
2. The companion relays policy updates from `/data/adb/causentry/internal.sock` and passes a pre-connected socket FD back to the unprivileged process via `SCM_RIGHTS`.
3. Subsequent policy updates (new `generation`, UID targets, hidden templates, storage rules) are pushed asynchronously over the bridged stream without writing temporary policy files for every UI action.
4. A cold-start snapshot is maintained at `/data/system/causentry/cloak.json` (`system:system`, `0700`) so `system_server` has policy ready immediately on boot before `internal.sock` reconnects.
