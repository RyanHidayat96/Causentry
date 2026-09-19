# Package visibility regression test

## Reproduced failure

On Android 16 / Xiaomi OS3.0.302.0, the target UID could still discover a
package selected in its hidden-app template. A successful `cmd package path`
check did not prove that other PackageManager APIs hid the same package.

A separate `app_process` running the Binder probe as the target UID returned:

| Query | Before the fix | After the fix |
| --- | --- | --- |
| `getApplicationInfo` | Hidden package's ApplicationInfo | `null` |
| `getPackageGids` | `[3003]` | `null` |
| `getPackagesForUid`, `getNameForUid` | Hidden package name | `null` |
| `getReceiverInfo`, `getProviderInfo`, `resolveContentProvider` | Hidden component | `null` |
| `getApplicationEnabledSetting` | `0` | Unknown-package exception |
| `getInstallSourceInfo` | InstallSourceInfo | `null` |
| `checkPermission(INTERNET)` | Granted | Denied |
| `queryIntentReceivers(LOCALE_CHANGED)` | One matching hidden receiver | No matching hidden receiver |

The fix covers every `ComputerEngine.shouldFilterApplication` overload taking a
`PackageStateInternal` and a calling UID, and protects the public application-info
entry point. Intent-result filtering also covers receivers and content providers
in `ResolveIntentHelper`. Non-target callers skip result scanning, and returned
lists are copied only into the replacement result rather than modified in place.

Framework references:
- [ComputerEngine](https://github.com/aosp-mirror/platform_frameworks_base/blob/android16-release/services/core/java/com/android/server/pm/ComputerEngine.java)
- [ResolveIntentHelper](https://github.com/aosp-mirror/platform_frameworks_base/blob/android16-release/services/core/java/com/android/server/pm/ResolveIntentHelper.java)

## Running the probe

Build on Windows using the repository's local SDK and JDK 21:

```powershell
.\scripts\tests\build-visibility-probe.ps1
adb -s SERIAL push build/visibility-probe/dex/classes.dex /data/local/tmp/causentry-visibility-probe.dex
adb -s SERIAL shell chmod 444 /data/local/tmp/causentry-visibility-probe.dex
adb -s SERIAL shell "su TARGET_UID -c 'CLASSPATH=/data/local/tmp/causentry-visibility-probe.dex app_process /system/bin PackageVisibilityProbe HIDDEN_PACKAGE HIDDEN_UID TARGET_PACKAGE --expect-hidden'"
```

Resolve both UIDs with `cmd package list packages -U` from the ordinary ADB shell.
The probe does not install or inject code into the target app, alter templates,
or change package state. Android requires the DEX to be read-only.

The optional target-package argument verifies the caller's own package remains
visible. Settings is another visible control. `--expect-hidden` exits nonzero
when the probe finds a visible hidden package, an unavailable method, an unexpected
exception, or a missing control package. Expected unknown-package exceptions are
reported but do not count as errors.

Repeat without `su TARGET_UID` and without `--expect-hidden` to verify that the
ordinary shell can still see the hidden package. A positive `leaks` count in this
control run is expected: that caller has no hiding policy.

## Device evidence, 2026-09-19

With `com.topjohnwu.magisk` still installed and selected in JMO's `hehe` template,
the patched probe reported `SUMMARY leaks=0 errors=0`. Its own package and Settings
remained visible; the shell control still saw Magisk's package and components.
The installed backend's SHA-256 matched the built `classes.dex`:
`4ae35bda76f355249c55522446eb16e3b5dc302d662cb4bcc8559684ef629d0e`.

The final module ZIP includes the control APK and all four Zygisk loader ABIs.
Three cold starts reached JMO's welcome screen with Magisk installed and no JMO
exception in the crash log. Skipping onboarding reached the Login screen. Testing
stopped before authentication. Local probe output and UI hierarchy captures are
under `build/visibility-probe/` (ignored by Git).

The Binder probe uses the target's Linux UID but a root-tool SELinux context;
it is evidence about PackageManager calls, not a filesystem-isolation test.
The real-app launch check is separate. Passing these checks does not establish
that every possible detection method, ROM, or future app version is covered.
