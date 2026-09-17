#requires -version 5
<#
Causentry - build the payload APK, Zygisk backend, and KernelSU module zip.
PowerShell drives the existing Android Gradle build for the system_server backend.
Run from anywhere.

  .\scripts\build-causentry.ps1                 build everything -> release\*.zip
  .\scripts\build-causentry.ps1 -NoApk          repack the zip only (payload APK as-is)
  .\scripts\build-causentry.ps1 -Deploy         also adb push the zip to /sdcard/Download
  .\scripts\build-causentry.ps1 -Version 1.2.0  stamp another module version
  .\scripts\build-causentry.ps1 -Pause          wait for Enter at the end

Outputs
  root-module\payload\Causentry.apk             (bundled in the module)
  release\Causentry-KSUN-v<version>.zip         <-- install this in KernelSU / Magisk
#>
[CmdletBinding()]
param(
  [switch]$NoApk,
  [switch]$Deploy,
  [switch]$Pause,
  [string]$Version = "",
  [string]$Device  = ""
)

$ErrorActionPreference = "Stop"

$ScriptDir = $PSScriptRoot
$Root      = Split-Path -Parent $ScriptDir
$Mod       = Join-Path $Root "root-module"
$Src       = Join-Path $Root "payload-src"
$Build     = Join-Path $Root "build"
$Release   = Join-Path $Root "release"
$Ks        = Join-Path $Root "causentry.keystore"
$ApkOut    = Join-Path $Mod "payload\Causentry.apk"
$PropPath  = Join-Path $Mod "module.prop"
$IncludeZygisk = $env:CAUSENTRY_EXCLUDE_ZYGISK -ne "1"

function Say($m, $c = "Cyan") { Write-Host $m -ForegroundColor $c }
function Die($m) { Write-Host "ERROR: $m" -ForegroundColor Red; exit 1 }

# build tooling (zip/AV/indexer) can hold a transient lock - retry instead of crashing
function Retry([scriptblock]$Action, [string]$What, [int]$Tries = 8) {
  for ($i = 1; $i -le $Tries; $i++) {
    try { return & $Action } catch {
      if ($i -eq $Tries) { Die "$What failed: $($_.Exception.Message)" }
      Start-Sleep -Milliseconds (250 * $i)
    }
  }
}
function Write-TextFile([string]$Path, [string]$Text) {
  Retry { [IO.File]::WriteAllText($Path, $Text, (New-Object Text.UTF8Encoding($false))) } "writing $Path"
}

# only one build at a time: two concurrent runs clobber module.prop / the zip
$mutex = New-Object System.Threading.Mutex($false, "Global\CausentryBuild")
if (-not $mutex.WaitOne([TimeSpan]::FromSeconds(60))) {
  Die "another build-causentry.ps1 run is still active (waited 60s). Let it finish or close it."
}

function Read-Version {
  $v = (Select-String -Path $PropPath -Pattern '^version=v?([0-9].*)$').Matches.Groups[1].Value
  if (-not $v) { $v = "0.0.0" }
  return $v.Trim()
}

function Find-Java {
  if ($env:JAVA_HOME) {
    $j = Join-Path $env:JAVA_HOME "bin\java.exe"
    if (Test-Path $j) { return $j }
  }
  $roots = @("C:\Program Files\Java", "C:\Program Files\Eclipse Adoptium", "C:\Program Files\Microsoft",
             (Join-Path $env:LOCALAPPDATA "Programs"))
  foreach ($r in $roots) {
    if (-not (Test-Path $r)) { continue }
    $cand = Get-ChildItem $r -Directory -ErrorAction SilentlyContinue | Sort-Object Name -Descending
    foreach ($c in $cand) {
      $j = Join-Path $c.FullName "bin\java.exe"
      if (Test-Path $j) { return $j }
    }
  }
  $cmd = Get-Command java -ErrorAction SilentlyContinue
  if ($cmd) { return $cmd.Source }
  Die "Java not found. Install a JDK (17+) or set JAVA_HOME."
}

function Find-Gradle {
  $cmd = Get-Command gradle -ErrorAction SilentlyContinue
  if ($cmd) { return $cmd.Source }
  $wrapperRoot = Join-Path $env:USERPROFILE ".gradle\wrapper\dists"
  $candidate = Get-ChildItem $wrapperRoot -Recurse -Filter gradle.bat -ErrorAction SilentlyContinue |
    Sort-Object FullName -Descending | Select-Object -First 1
  if ($candidate) { return $candidate.FullName }
  Die "Gradle not found. Install Gradle 8+ or run once with the Android Gradle wrapper available."
}

if (-not $Version) { $Version = Read-Version }

Add-Type -AssemblyName System.IO.Compression -ErrorAction SilentlyContinue
Add-Type -AssemblyName System.IO.Compression.FileSystem -ErrorAction SilentlyContinue

$Java    = Find-Java
$JavaBin = Split-Path -Parent $Java
$Javac   = Join-Path $JavaBin "javac.exe"
$Keytool = Join-Path $JavaBin "keytool.exe"

$Sdk = Join-Path $Root "tools\sdk"
if (-not (Test-Path (Join-Path $Sdk "build-tools"))) {
  $Sdk = Join-Path $env:LOCALAPPDATA "Android\Sdk"
}
$Bt         = Join-Path $Sdk "build-tools\35.0.0"
$AJar       = Join-Path $Sdk "platforms\android-35\android.jar"
$aapt2      = Join-Path $Bt "aapt2.exe"
$zipalign   = Join-Path $Bt "zipalign.exe"
$d8Jar      = Join-Path $Bt "lib\d8.jar"
$signerJar  = Join-Path $Bt "lib\apksigner.jar"

foreach ($f in @($Javac, $aapt2, $zipalign, $d8Jar, $signerJar, $AJar)) {
  if (-not (Test-Path $f)) { Die "missing toolchain file: $f`n     (install build-tools 35.0.0 + platform android-35, or set CAUSENTRY_SDK)" }
}
if (-not (Test-Path $Src)) { Die "payload source not found at $Src" }

Say "== Causentry build ==" 
Say "   root    : $Root"
Say "   java    : $Java"
Say "   sdk     : $Sdk"
Say "   version : v$Version"
if ($IncludeZygisk) {
  Say "   zygisk  : included when native .so artifacts are present" "Green"
} else {
  Say "   zygisk  : excluded by CAUSENTRY_EXCLUDE_ZYGISK=1" "DarkGray"
}
New-Item -ItemType Directory -Force -Path $Release | Out-Null

# ---------------- 1..7 payload APK ----------------
if (-not $NoApk) {
  # clean per entry: a foreign file (e.g. a ROM dump being inspected) may be locked,
  # and that must not break the build
  if (Test-Path $Build) {
    Get-ChildItem -Force $Build | ForEach-Object {
      try { Remove-Item -Recurse -Force $_.FullName -ErrorAction Stop } catch { Write-Host "   (skip locked: $($_.Name))" }
    }
  }
  foreach ($d in "stubs", "classes", "dex", "gen", "apk") {
    New-Item -ItemType Directory -Force -Path (Join-Path $Build $d) | Out-Null
  }

  Say "[1/7] selecting Zygisk-only control UI sources"
  $legacyHookSources = @(
    "AppOpsCloak.java",
    "AppZygoteCloak.java",
    "CausentryModule.java",
    "Cfg.java",
    "CloakCfg.java",
    "Hide.java",
    "PackageCloak.java",
    "SystemCloak.java"
  )

  Say "[2/7] compiling payload classes"
  $modSrc = (Get-ChildItem (Join-Path $Src "src") -Recurse -Filter *.java |
    Where-Object { $legacyHookSources -notcontains $_.Name }).FullName
  if (-not $modSrc) { Die "no payload sources under $Src\src" }
  & $Javac -nowarn --release 11 -cp $AJar -d (Join-Path $Build "classes") @modSrc
  if ($LASTEXITCODE -ne 0) { Die "javac (payload) failed" }

  Say "[3/7] dexing (d8)"
  $classes = (Get-ChildItem (Join-Path $Build "classes") -Recurse -Filter *.class).FullName
  & $Java -cp $d8Jar com.android.tools.r8.D8 --release --min-api 26 --lib $AJar --output (Join-Path $Build "dex") @classes
  if ($LASTEXITCODE -ne 0) { Die "d8 failed" }

  Say "[4/7] aapt2 compile + link"
  & $aapt2 compile --dir (Join-Path $Src "res") -o (Join-Path $Build "res.zip")
  if ($LASTEXITCODE -ne 0) { Die "aapt2 compile failed" }
  & $aapt2 link -o (Join-Path $Build "apk\base.apk") -I $AJar `
      --manifest (Join-Path $Src "manifest\AndroidManifest.xml") `
      --java (Join-Path $Build "gen") `
      --min-sdk-version 26 --target-sdk-version 35 --no-version-vectors (Join-Path $Build "res.zip")
  if ($LASTEXITCODE -ne 0) { Die "aapt2 link failed" }

  Say "[5/7] injecting classes.dex"
  $dexedApk = Join-Path $Build "apk\dexed.apk"
  Copy-Item (Join-Path $Build "apk\base.apk") $dexedApk -Force
  $dexBytes = [IO.File]::ReadAllBytes((Join-Path $Build "dex\classes.dex"))
  $za = [System.IO.Compression.ZipFile]::Open($dexedApk, [System.IO.Compression.ZipArchiveMode]::Update)
  try {
    $old = $za.GetEntry("classes.dex"); if ($old) { $old.Delete() }
    $e = $za.CreateEntry("classes.dex", [System.IO.Compression.CompressionLevel]::Optimal)
    $s = $e.Open(); $s.Write($dexBytes, 0, $dexBytes.Length); $s.Dispose()
  } finally { $za.Dispose() }

  Say "[6/7] zipalign"
  & $zipalign -f -p 4 $dexedApk (Join-Path $Build "apk\aligned.apk")
  if ($LASTEXITCODE -ne 0) { Die "zipalign failed" }

  Say "[7/7] signing"
  if (-not (Test-Path $Ks)) {
    Say "      creating keystore (alias causentry)"
    & $Keytool -genkeypair -keystore $Ks -alias causentry -keyalg RSA -keysize 2048 -validity 10000 `
      -storepass causentry -keypass causentry -dname "CN=Causentry,O=Causentry,C=ID"
    if ($LASTEXITCODE -ne 0) { Die "keytool failed" }
  }
  New-Item -ItemType Directory -Force -Path (Split-Path -Parent $ApkOut) | Out-Null
  & $Java -jar $signerJar sign --ks $Ks --ks-pass pass:causentry --key-pass pass:causentry `
        --out $ApkOut (Join-Path $Build "apk\aligned.apk")
  if ($LASTEXITCODE -ne 0) { Die "apksigner failed" }
  & $Java -jar $signerJar verify $ApkOut | Out-Null
  if ($LASTEXITCODE -ne 0) { Die "apksigner verify failed" }
  Say ("      payload ok: {0} ({1:n0} bytes)" -f $ApkOut, (Get-Item $ApkOut).Length) "Green"
} else {
  if (-not (Test-Path $ApkOut)) { Die "-NoApk given but $ApkOut does not exist" }
  Say "[1/1] skipping payload build (using existing APK)"
}

# ---------------- Zygisk system_server backend ----------------
if ($IncludeZygisk) {
  Say ""
  Say "== building Zygisk system_server backend =="
  $prepare = Join-Path $ScriptDir "prepare-zygote-deps.ps1"
  if (Test-Path $prepare) { & $prepare }
  if ($LASTEXITCODE -ne 0) { Die "preparing Zygisk dependencies failed" }

  $gradle = Find-Gradle
  $oldAndroidHome = $env:ANDROID_HOME
  $oldAndroidSdkRoot = $env:ANDROID_SDK_ROOT
  $env:ANDROID_HOME = $Sdk
  $env:ANDROID_SDK_ROOT = $Sdk
  try {
    Push-Location (Join-Path $Root "android")
    & $gradle --no-daemon :zygote:assembleRelease
    if ($LASTEXITCODE -ne 0) { Die "Gradle Zygisk backend build failed" }
  } finally {
    Pop-Location
    $env:ANDROID_HOME = $oldAndroidHome
    $env:ANDROID_SDK_ROOT = $oldAndroidSdkRoot
  }

  $zygoteZip = Join-Path $Root "android\zygote\build\outputs\magisk\release\Causentry-Zygisk.zip"
  if (-not (Test-Path $zygoteZip)) { Die "Gradle completed but $zygoteZip is missing" }
  $zygoteStage = Join-Path $Build "zygote-backend"
  if (Test-Path $zygoteStage) { Remove-Item -Recurse -Force $zygoteStage }
  Expand-Archive -LiteralPath $zygoteZip -DestinationPath $zygoteStage -Force

  Copy-Item (Join-Path $zygoteStage "classes.dex") (Join-Path $Mod "classes.dex") -Force
  New-Item -ItemType Directory -Force -Path (Join-Path $Mod "packages") | Out-Null
  Copy-Item (Join-Path $zygoteStage "packages\android") (Join-Path $Mod "packages\android") -Force
  $zygiskDest = Join-Path $Mod "zygisk"
  New-Item -ItemType Directory -Force -Path $zygiskDest | Out-Null
  Get-ChildItem $zygiskDest -Filter *.so -File -ErrorAction SilentlyContinue | Remove-Item -Force
  Copy-Item (Join-Path $zygoteStage "zygisk\*") $zygiskDest -Force
  $modulePropText = [IO.File]::ReadAllText($PropPath)
  if ($modulePropText -notmatch '(?m)^entrypoint=') {
    Add-Content -Path $PropPath -Value "entrypoint=com.causentry.zygote.ZygoteEntry"
  }
  if ($modulePropText -notmatch '(?m)^attachNativeLibs=') {
    Add-Content -Path $PropPath -Value "attachNativeLibs=false"
  }
  $backendClasses = (Get-ChildItem (Join-Path $zygoteStage "zygisk") -Filter *.so -File).Count
  Say "   backend ok : classes.dex + packages/android + $backendClasses Zygisk loader libraries" "Green"
} else {
  Say "   backend    : excluded by CAUSENTRY_EXCLUDE_ZYGISK=1" "DarkGray"
}

# ---------------- module zip ----------------
Say ""
Say "== packing module zip =="

$prop = [IO.File]::ReadAllText($PropPath) -replace "`r`n", "`n"
$prop = [Text.RegularExpressions.Regex]::Replace($prop, "(?m)^version=v?.*$", "version=v$Version")
$prop = [Text.RegularExpressions.Regex]::Replace($prop, "(?m)^versionCode=.*$", "versionCode=$($Version -replace '\.', '')")
Write-TextFile $PropPath $prop
Say "   module.prop : v$Version"

# CRLF in an Android shell script silently breaks it - normalise first
$textExt = @(".sh", ".prop", ".json", ".html", ".md", ".txt")
$fixed = 0
Get-ChildItem $Mod -Recurse -File | Where-Object { $textExt -contains $_.Extension.ToLower() } | ForEach-Object {
  $b = [IO.File]::ReadAllBytes($_.FullName)
  if ([Array]::IndexOf($b, [byte]13) -ge 0) {
    $t = [Text.Encoding]::UTF8.GetString($b).Replace("`r`n", "`n")
    Write-TextFile $_.FullName $t
    $fixed++
  }
}
if ($fixed) { Say "   normalised CRLF -> LF in $fixed file(s)" }

$zipPath = Join-Path $Release "Causentry-KSUN-v$Version.zip"
if (Test-Path $zipPath) { Retry { Remove-Item $zipPath -Force } "removing the previous zip" }

$mode755 = [Convert]::ToInt32("755", 8) -shl 16
$mode644 = [Convert]::ToInt32("644", 8) -shl 16
$stamp = [DateTimeOffset]::new([DateTime]::new(2026, 9, 15, 12, 0, 0, [DateTimeKind]::Utc))

$files = Get-ChildItem $Mod -Recurse -File | Where-Object {
  $_.FullName -notmatch "\\build\\|\\.git\\" `
    -and $_.Name -ne ".gitkeep" `
    -and $_.Extension -ne ".idsig" `
    -and ($IncludeZygisk -or $_.FullName -notmatch "\\zygisk\\[^\\]+\.so$")
}
$zip = [System.IO.Compression.ZipFile]::Open($zipPath, [System.IO.Compression.ZipArchiveMode]::Create)
try {
  foreach ($f in $files) {
    $rel = $f.FullName.Substring($Mod.Length + 1).Replace("\", "/")
    $entry = $zip.CreateEntry($rel, [System.IO.Compression.CompressionLevel]::Optimal)
    $entry.ExternalAttributes = if ($f.Extension.ToLower() -in @(".sh", ".prop")) { $mode755 } else { $mode644 }
    $entry.LastWriteTime = $stamp
    $in = [IO.File]::OpenRead($f.FullName)
    $es = $entry.Open()
    try { $in.CopyTo($es) } finally { $es.Dispose(); $in.Dispose() }
  }
} finally { $zip.Dispose() }

$zipCheck = [System.IO.Compression.ZipFile]::OpenRead($zipPath)
try {
  if (-not $zipCheck.GetEntry("payload/Causentry.apk")) {
    Die "zip validation failed: payload/Causentry.apk is missing"
  }
  if ($IncludeZygisk) {
    foreach ($required in @("classes.dex", "packages/android", "zygisk/arm64-v8a.so")) {
      if (-not $zipCheck.GetEntry($required)) { Die "zip validation failed: $required is missing" }
    }
    if ($prop -notmatch '(?m)^entrypoint=com\.causentry\.zygote\.ZygoteEntry$') {
      Die "zip validation failed: module.prop entrypoint is missing"
    }
  }
} finally { $zipCheck.Dispose() }

Say ("   zip ok      : {0} ({1:n0} bytes, {2} files)" -f $zipPath, (Get-Item $zipPath).Length, $files.Count) "Green"

# ---------------- optional deploy ----------------
if ($Deploy) {
  $adb = (Get-Command adb -ErrorAction SilentlyContinue).Source
  if (-not $adb) { Die "adb not found on PATH (needed for -Deploy)" }
  Say ""
  Say "== pushing to /sdcard/Download =="
  if ($Device) { & $adb -s $Device push $zipPath "/sdcard/Download/$(Split-Path -Leaf $zipPath)" }
  else         { & $adb push $zipPath "/sdcard/Download/$(Split-Path -Leaf $zipPath)" }
  if ($LASTEXITCODE -ne 0) { Die "adb push failed" }
}

Say ""
Say "DONE" "Green"
Say "   APK : $ApkOut"
Say "   ZIP : $zipPath"
Write-Host ""
Write-Host "Install : KernelSU/Magisk manager -> Modules -> Install from storage -> $(Split-Path -Leaf $zipPath)"
Write-Host "Then    : reboot, tap the module Action button to open the control UI"
$mutex.ReleaseMutex(); $mutex.Dispose()
if ($Pause) { Read-Host "Press Enter to close" | Out-Null }
