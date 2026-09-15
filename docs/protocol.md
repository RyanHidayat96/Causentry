# Protocol

The active control protocol is intentionally small and local.

- APK UI: the daemon writes `status.json`, `apps.json`, `root_apps.txt`, and logs into
  the APK private files directory. The UI queues JSON command files in `files/cmd/`.
- Browser UI: `root-module/webroot/cgi-bin/api.sh` exposes the same actions over
  `127.0.0.1:8899` only, guarded by `/data/adb/causentry/ui.token`.
- Commands are allowlisted by action and package names are validated before mutation.
- `cgi-bin/token.sh` is fail-closed and never discloses the token.

A future daemon may replace the file protocol with an authenticated Unix-domain socket,
but that is not the active production interface.
