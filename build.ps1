#requires -version 5
<#
Causentry - root entry point. Forwards every argument to scripts\build-causentry.ps1
(build payload APK -> pack the install-ready KernelSU module zip in release\).

  .\build.ps1                 build everything
  .\build.ps1 -Deploy         build + adb push the zip to /sdcard/Download
  .\build.ps1 -NoApk          repack the zip only
  .\build.ps1 -Version 1.2.0  stamp another version
#>
[CmdletBinding()]
param(
  [switch]$NoApk,
  [switch]$Deploy,
  [switch]$Pause,
  [string]$Version = "",
  [string]$Device  = ""
)
$target = Join-Path $PSScriptRoot "scripts\build-causentry.ps1"
if (-not (Test-Path $target)) { Write-Host "ERROR: missing $target" -ForegroundColor Red; exit 1 }

# hashtable splat keeps switches as switches (an array splat would pass "-NoApk" as a value)
$fwd = @{}
foreach ($k in $PSBoundParameters.Keys) { $fwd[$k] = $PSBoundParameters[$k] }
& $target @fwd
exit $LASTEXITCODE
