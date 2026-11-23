#requires -version 5
<#
Causentry v3.0 — Full Native Rust build pipeline:
  [1/5] Static Dobby (arm64-v8a + armeabi-v7a)
  [2/5] Root Cargo Workspace (causentryd, causentry-zygisk, causentry-fuse-core)
  [3/5] Rust-Anything verified App Core JNI libs (forensic-core-rs, backup-core-rs)
  [4/5] FuseHide C++20 + Rust Safety Core (libfusehide.so)
  [5/5] Android Control UI APK + Zygisk DEX + KernelSU/Magisk zip

  .\scripts\build-causentry.ps1                 build everything -> release\*.zip
  .\scripts\build-causentry.ps1 -NoApk          skip Control UI APK rebuild
  .\scripts\build-causentry.ps1 -Deploy         also adb push the zip to /sdcard/Download
  .\scripts\build-causentry.ps1 -Version 3.0.0  stamp another module version
  .\scripts\build-causentry.ps1 -Pause          wait for Enter at the end
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
$Build     = Join-Path $Root "build"
$Release   = Join-Path $Root "release"
$Ks        = Join-Path $Root "causentry.keystore"
$ApkOut    = Join-Path $Mod "payload\Causentry.apk"
$PropPath  = Join-Path $Mod "module.prop"
$IncludeZygisk = $env:CAUSENTRY_EXCLUDE_ZYGISK -ne "1"

function Say($m, $c = "Cyan") { Write-Host $m -ForegroundColor $c }
function Die($m) { Write-Host "ERROR: $m" -ForegroundColor Red; exit 1 }

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

$mutex = New-Object System.Threading.Mutex($false, "Global\CausentryBuild")
if (-not $mutex.WaitOne([TimeSpan]::FromSeconds(60))) {
  Die "another build-causentry.ps1 run is still active (waited 60s)."
}

try {
  function Read-Version {
    $v = (Select-String -Path $PropPath -Pattern '^version=v?([0-9].*)$').Matches.Groups[1].Value
    if (-not $v) { $v = "3.0.0" }
    return $v.Trim()
  }

  function Find-Java {
    if ($env:JAVA_HOME) {
      $j = Join-Path $env:JAVA_HOME "bin\java.exe"
      if (Test-Path $j) { return $j }
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
    Die "Gradle not found. Install Gradle 8+ or add gradle to PATH."
  }

  function Find-Cargo {
    $cmd = Get-Command cargo -ErrorAction SilentlyContinue
    if ($cmd) { return $cmd.Source }
    $cand = Join-Path $env:USERPROFILE ".cargo\bin\cargo.exe"
    if (Test-Path $cand) { return $cand }
    Die "Rust cargo not found. Install rustup / cargo."
  }

  if (-not $Version) { $Version = Read-Version }

  Add-Type -AssemblyName System.IO.Compression -ErrorAction SilentlyContinue
  Add-Type -AssemblyName System.IO.Compression.FileSystem -ErrorAction SilentlyContinue

  $Java    = Find-Java
  $JavaBin = Split-Path -Parent $Java
  $Keytool = Join-Path $JavaBin "keytool.exe"
  $Gradle  = Find-Gradle
  $Cargo   = Find-Cargo

  $Sdk = if ($env:CAUSENTRY_SDK) { $env:CAUSENTRY_SDK } else { Join-Path $Root "tools\sdk" }
  if (-not (Test-Path (Join-Path $Sdk "platforms"))) {
    $Sdk = Join-Path $env:LOCALAPPDATA "Android\Sdk"
  }
  if (-not (Test-Path (Join-Path $Sdk "platforms"))) {
    Die "Android SDK not found at $Sdk"
  }

  $cmake = Get-ChildItem (Join-Path $Sdk "cmake") -Recurse -Filter cmake.exe -ErrorAction SilentlyContinue |
    Sort-Object FullName -Descending | Select-Object -First 1 -ExpandProperty FullName
  $ninja = Get-ChildItem (Join-Path $Sdk "cmake") -Recurse -Filter ninja.exe -ErrorAction SilentlyContinue |
    Sort-Object FullName -Descending | Select-Object -First 1 -ExpandProperty FullName
  $ndkDir = Get-ChildItem (Join-Path $Sdk "ndk") -Directory -ErrorAction SilentlyContinue |
    Sort-Object Name -Descending | Select-Object -First 1 -ExpandProperty FullName
  if (-not $cmake -or -not $ninja -or -not $ndkDir) {
    Die "Missing CMake, Ninja, or Android NDK inside $Sdk"
  }
  $llvmBin = Join-Path $ndkDir "toolchains\llvm\prebuilt\windows-x86_64\bin"
  $clang   = Join-Path $llvmBin "clang.exe"
  $strip   = Join-Path $llvmBin "llvm-strip.exe"

  $rustTargets = @(
    @{ Target = "aarch64-linux-android";   ClangTarget = "aarch64-linux-android26";   Abi = "arm64-v8a" },
    @{ Target = "armv7-linux-androideabi"; ClangTarget = "armv7a-linux-androideabi26"; Abi = "armeabi-v7a" }
  )

  Say "== Causentry v3.0 Full Native Rust Build =="
  Say "   root    : $Root"
  Say "   java    : $Java"
  Say "   sdk     : $Sdk"
  Say "   ndk     : $ndkDir"
  Say "   cargo   : $Cargo"
  Say "   version : v$Version"
  New-Item -ItemType Directory -Force -Path $Release | Out-Null

  $cppDir = Join-Path $Root "android\zygote\src\main\cpp"

  # ---------------- [1/5] Static Dobby (Dual-ABI) ----------------
  if ($IncludeZygisk) {
    Say ""
    Say "[1/5] Building static Dobby (arm64-v8a + armeabi-v7a) for Rust Zygisk..."
    foreach ($rt in $rustTargets) {
      $abi = $rt.Abi
      $buildAbi = Join-Path $cppDir "build-$abi"
      New-Item -ItemType Directory -Force -Path $buildAbi | Out-Null
      Push-Location $buildAbi
      try {
        & $cmake .. -G "Ninja" "-DCMAKE_MAKE_PROGRAM=$ninja" `
          "-DCMAKE_TOOLCHAIN_FILE=$ndkDir/build/cmake/android.toolchain.cmake" `
          "-DANDROID_ABI=$abi" "-DANDROID_PLATFORM=android-26" "-DCMAKE_BUILD_TYPE=Release"
        if ($LASTEXITCODE -ne 0) { Die "CMake configure (Dobby) failed for $abi" }
        & $ninja dobby
        if ($LASTEXITCODE -ne 0) { Die "Ninja dobby build failed for $abi" }
      } finally {
        Pop-Location
      }
    }
  }

  # ---------------- [2/5] Root Cargo Workspace (Dual-ABI) ----------------
  Say ""
  Say "[2/5] Building Root Cargo Workspace (causentryd + causentry-zygisk + causentry-fuse-core)..."
  $zygiskDest = Join-Path $Mod "zygisk"
  New-Item -ItemType Directory -Force -Path $zygiskDest | Out-Null
  Get-ChildItem $zygiskDest -Filter "*.so" -File -ErrorAction SilentlyContinue | Remove-Item -Force

  Push-Location $Root
  try {
    foreach ($rt in $rustTargets) {
      Say "      cargo build --release --workspace --target $($rt.Target)" "DarkCyan"
      & $Cargo build --release --workspace --target $rt.Target
      if ($LASTEXITCODE -ne 0) { Die "Cargo workspace build failed for $($rt.Target)" }

      $outDir = Join-Path $Root "target\$($rt.Target)\release"

      # 1. causentryd
      $binOutDir = Join-Path $Mod "bin\$($rt.Abi)"
      New-Item -ItemType Directory -Force -Path $binOutDir | Out-Null
      $srcBin = Join-Path $outDir "causentryd"
      if (-not (Test-Path $srcBin)) { Die "Missing compiled daemon binary: $srcBin" }
      $dstBin = Join-Path $binOutDir "causentryd"
      Copy-Item $srcBin $dstBin -Force

      # 2. pure Rust Zygisk loader
      if ($IncludeZygisk) {
        $srcZyg = Join-Path $outDir "libcausentry_zygisk.so"
        if (-not (Test-Path $srcZyg)) { Die "Missing compiled Rust Zygisk library: $srcZyg" }
        $dstZyg = Join-Path $zygiskDest "$($rt.Abi).so"
        Copy-Item $srcZyg $dstZyg -Force
        if (Test-Path $strip) { & $strip --strip-all $dstZyg }
        Say ("      {0}: causentryd={1:n0} B, zygisk(rust)={2:n0} B" -f $rt.Abi, (Get-Item $dstBin).Length, (Get-Item $dstZyg).Length) "Green"
      } else {
        Say ("      {0}: causentryd={1:n0} B" -f $rt.Abi, (Get-Item $dstBin).Length) "Green"
      }
    }
  } finally {
    Pop-Location
  }

  # ---------------- [3/5] Rust-Anything App Core JNI Libs (Dual-ABI) ----------------
  if (-not $NoApk) {
    Say ""
    Say "[3/5] Building rust-anything JNI App Core (forensic-core-rs + backup-core-rs)..."
    $jniCrates = @(
      @{ Dir = (Join-Path $Root "android\app\rust\forensic-core-rs"); Lib = "libforensic_core_rs.so" },
      @{ Dir = (Join-Path $Root "android\app\rust\backup-core-rs");   Lib = "libbackup_core_rs.so" }
    )
    $oldLinkerA64 = $env:CARGO_TARGET_AARCH64_LINUX_ANDROID_LINKER
    $oldFlagsA64  = $env:CARGO_TARGET_AARCH64_LINUX_ANDROID_RUSTFLAGS
    $oldLinkerV7  = $env:CARGO_TARGET_ARMV7_LINUX_ANDROIDEABI_LINKER
    $oldFlagsV7   = $env:CARGO_TARGET_ARMV7_LINUX_ANDROIDEABI_RUSTFLAGS
    try {
      $env:CARGO_TARGET_AARCH64_LINUX_ANDROID_LINKER    = $clang
      $env:CARGO_TARGET_AARCH64_LINUX_ANDROID_RUSTFLAGS = "-C link-arg=--target=aarch64-linux-android26 -C link-arg=-Wl,-z,max-page-size=16384 -C link-arg=-Wl,--gc-sections"
      $env:CARGO_TARGET_ARMV7_LINUX_ANDROIDEABI_LINKER    = $clang
      $env:CARGO_TARGET_ARMV7_LINUX_ANDROIDEABI_RUSTFLAGS = "-C link-arg=--target=armv7a-linux-androideabi26 -C link-arg=-Wl,-z,max-page-size=16384 -C link-arg=-Wl,--gc-sections"

      foreach ($jc in $jniCrates) {
        Push-Location $jc.Dir
        try {
          foreach ($rt in $rustTargets) {
            & $Cargo build --release --target $rt.Target
            if ($LASTEXITCODE -ne 0) { Die "JNI crate build failed in $($jc.Dir) for $($rt.Target)" }
            $srcSo = Join-Path $jc.Dir "target\$($rt.Target)\release\$($jc.Lib)"
            if (-not (Test-Path $srcSo)) { Die "Missing JNI library: $srcSo" }
            $jniOutDir = Join-Path $Root "android\app\src\main\jniLibs\$($rt.Abi)"
            New-Item -ItemType Directory -Force -Path $jniOutDir | Out-Null
            $dstSo = Join-Path $jniOutDir $jc.Lib
            Copy-Item $srcSo $dstSo -Force
            if (Test-Path $strip) { & $strip --strip-all $dstSo }
            Say ("      {0}/{1}: {2:n0} B" -f $rt.Abi, $jc.Lib, (Get-Item $dstSo).Length) "Green"
          }
        } finally {
          Pop-Location
        }
      }
    } finally {
      if ($null -eq $oldLinkerA64) { Remove-Item Env:CARGO_TARGET_AARCH64_LINUX_ANDROID_LINKER -ErrorAction SilentlyContinue } else { $env:CARGO_TARGET_AARCH64_LINUX_ANDROID_LINKER = $oldLinkerA64 }
      if ($null -eq $oldFlagsA64)  { Remove-Item Env:CARGO_TARGET_AARCH64_LINUX_ANDROID_RUSTFLAGS -ErrorAction SilentlyContinue } else { $env:CARGO_TARGET_AARCH64_LINUX_ANDROID_RUSTFLAGS = $oldFlagsA64 }
      if ($null -eq $oldLinkerV7)  { Remove-Item Env:CARGO_TARGET_ARMV7_LINUX_ANDROIDEABI_LINKER -ErrorAction SilentlyContinue } else { $env:CARGO_TARGET_ARMV7_LINUX_ANDROIDEABI_LINKER = $oldLinkerV7 }
      if ($null -eq $oldFlagsV7)   { Remove-Item Env:CARGO_TARGET_ARMV7_LINUX_ANDROIDEABI_RUSTFLAGS -ErrorAction SilentlyContinue } else { $env:CARGO_TARGET_ARMV7_LINUX_ANDROIDEABI_RUSTFLAGS = $oldFlagsV7 }
    }
  } else {
    Say "[3/5] Skipping rust-anything JNI build (-NoApk)"
  }

  # ---------------- [4/5] FuseHide C++20 + Rust Safety Core ----------------
  if ($IncludeZygisk) {
    Say ""
    Say "[4/5] Linking FuseHide C++20 + Rust causentry-fuse-core (arm64-v8a + armeabi-v7a)..."
    foreach ($rt in $rustTargets) {
      $abi = $rt.Abi
      $fuseLib = (Join-Path $Root "target\$($rt.Target)\release\libcausentry_fuse_core.a").Replace("\", "/")
      if (-not (Test-Path $fuseLib)) { Die "Missing Rust staticlib: $fuseLib" }
      $buildAbi = Join-Path $cppDir "build-$abi"
      New-Item -ItemType Directory -Force -Path $buildAbi | Out-Null
      Push-Location $buildAbi
      try {
        & $cmake .. -G "Ninja" "-DCMAKE_MAKE_PROGRAM=$ninja" `
          "-DCMAKE_TOOLCHAIN_FILE=$ndkDir/build/cmake/android.toolchain.cmake" `
          "-DANDROID_ABI=$abi" "-DANDROID_PLATFORM=android-26" "-DCMAKE_BUILD_TYPE=Release" `
          "-DCAUSENTRY_FUSE_CORE_LIB=$fuseLib"
        if ($LASTEXITCODE -ne 0) { Die "CMake configure (fusehide) failed for $abi" }
        & $ninja fusehide
        if ($LASTEXITCODE -ne 0) { Die "Ninja fusehide build failed for $abi" }
        if (Test-Path $strip) { & $strip --strip-all "libfusehide.so" }
        $fuseDir = Join-Path $Mod "lib\$abi"
        New-Item -ItemType Directory -Force -Path $fuseDir | Out-Null
        $fuseDst = Join-Path $fuseDir "libfusehide.so"
        Copy-Item "libfusehide.so" $fuseDst -Force
        Say ("      {0}/libfusehide.so: {1:n0} B" -f $abi, (Get-Item $fuseDst).Length) "Green"
      } finally {
        Pop-Location
      }
    }
  }

  # ---------------- [5/5] Android APK + Zygisk DEX + Module Zip ----------------
  $oldAndroidHome = $env:ANDROID_HOME
  $oldAndroidSdkRoot = $env:ANDROID_SDK_ROOT
  $oldGradleUserHome = $env:GRADLE_USER_HOME
  $gradleUserHome = Join-Path $Root ".gradle-causentry"
  New-Item -ItemType Directory -Force -Path $gradleUserHome | Out-Null
  $env:ANDROID_HOME = $Sdk
  $env:ANDROID_SDK_ROOT = $Sdk
  $env:GRADLE_USER_HOME = $gradleUserHome

  try {
    Say ""
    Say "[5/5] Building Control UI APK, Zygisk DEX, and packing module zip..."
    if (-not $NoApk) {
      if (-not (Test-Path $Ks)) {
        Say "      creating local keystore (alias causentry)"
        & $Keytool -genkeypair -keystore $Ks -alias causentry -keyalg RSA -keysize 2048 -validity 10000 `
          -storepass causentry -keypass causentry -dname "CN=Causentry,O=Causentry,C=ID"
        if ($LASTEXITCODE -ne 0) { Die "keytool failed" }
      }
      Push-Location (Join-Path $Root "android")
      try {
        & $Gradle --no-daemon --no-watch-fs :app:assembleRelease
        if ($LASTEXITCODE -ne 0) { Die "Gradle :app:assembleRelease failed" }
      } finally { Pop-Location }

      $appReleaseApk = Join-Path $Root "android\app\build\outputs\apk\release\app-release.apk"
      if (-not (Test-Path $appReleaseApk)) { Die "Gradle finished but $appReleaseApk not found" }
      New-Item -ItemType Directory -Force -Path (Split-Path -Parent $ApkOut) | Out-Null
      Copy-Item $appReleaseApk $ApkOut -Force
      Say ("      payload APK ok: {0:n0} bytes" -f (Get-Item $ApkOut).Length) "Green"
    } else {
      if (-not (Test-Path $ApkOut)) { Die "-NoApk given but $ApkOut does not exist" }
      Say "      skipping Control UI APK build (using existing payload)"
    }

    if ($IncludeZygisk) {
      $prepare = Join-Path $ScriptDir "prepare-zygote-deps.ps1"
      if (Test-Path $prepare) { & $prepare }

      Push-Location (Join-Path $Root "android")
      try {
        & $Gradle --no-daemon --no-watch-fs :zygote:assembleRelease
        if ($LASTEXITCODE -ne 0) { Die "Gradle :zygote:assembleRelease failed" }
      } finally { Pop-Location }

      $zygoteZip = Join-Path $Root "android\zygote\build\outputs\magisk\release\Causentry-Zygisk.zip"
      if (-not (Test-Path $zygoteZip)) { Die "Missing $zygoteZip" }
      $zygoteStage = Join-Path $Build "zygote-backend"
      if (Test-Path $zygoteStage) { Remove-Item -Recurse -Force $zygoteStage }
      Expand-Archive -LiteralPath $zygoteZip -DestinationPath $zygoteStage -Force

      # Copy ONLY classes*.dex (Rust Zygisk .so was built in stage 2)
      $zygoteDex = Get-ChildItem $zygoteStage -Filter "classes*.dex" -File
      if (-not $zygoteDex) { Die "ZygoteLoader build produced no classes*.dex" }
      Get-ChildItem $Mod -Filter "classes*.dex" -File -ErrorAction SilentlyContinue | Remove-Item -Force
      foreach ($dex in $zygoteDex) {
        Copy-Item $dex.FullName (Join-Path $Mod $dex.Name) -Force
      }

      # Copy package markers (explicitly excluding .all)
      $modulePackages = Join-Path $Mod "packages"
      New-Item -ItemType Directory -Force -Path $modulePackages | Out-Null
      Get-ChildItem $modulePackages -File -Force -ErrorAction SilentlyContinue | Remove-Item -Force
      $packageMarkers = Get-ChildItem (Join-Path $zygoteStage "packages") -File -Force -ErrorAction SilentlyContinue |
        Where-Object { $_.Name -ne ".all" }
      if (-not $packageMarkers) { Die "ZygoteLoader build produced no package markers" }
      foreach ($marker in $packageMarkers) {
        Copy-Item $marker.FullName (Join-Path $modulePackages $marker.Name) -Force
      }
    }
  } finally {
    $env:ANDROID_HOME = $oldAndroidHome
    $env:ANDROID_SDK_ROOT = $oldAndroidSdkRoot
    if ($null -eq $oldGradleUserHome) { Remove-Item Env:GRADLE_USER_HOME -ErrorAction SilentlyContinue }
    else { $env:GRADLE_USER_HOME = $oldGradleUserHome }
  }

  $prop = [IO.File]::ReadAllText($PropPath) -replace "`r`n", "`n"
  $prop = [Text.RegularExpressions.Regex]::Replace($prop, "(?m)^version=v?.*$", "version=v$Version")
  $prop = [Text.RegularExpressions.Regex]::Replace($prop, "(?m)^versionCode=.*$", "versionCode=$($Version -replace '\.', '')")
  Write-TextFile $PropPath $prop

  # Normalize CRLF -> LF on all text/script/rule files
  $textExt = @(".sh", ".prop", ".json", ".rule", ".md", ".txt")
  $fixed = 0
  Get-ChildItem $Mod -Recurse -File | Where-Object { $textExt -contains $_.Extension.ToLower() } | ForEach-Object {
    $b = [IO.File]::ReadAllBytes($_.FullName)
    if ([Array]::IndexOf($b, [byte]13) -ge 0) {
      $t = [Text.Encoding]::UTF8.GetString($b).Replace("`r`n", "`n")
      Write-TextFile $_.FullName $t
      $fixed++
    }
  }
  if ($fixed) { Say "      normalised CRLF -> LF in $fixed file(s)" }

  $zipPath = Join-Path $Release "Causentry-KSUN-v$Version.zip"
  if (Test-Path $zipPath) { Retry { Remove-Item $zipPath -Force } "removing previous zip" }

  $mode755 = [Convert]::ToInt32("755", 8) -shl 16
  $mode644 = [Convert]::ToInt32("644", 8) -shl 16
  $stamp = [DateTimeOffset]::new([DateTime]::new(2026, 11, 23, 12, 0, 0, [DateTimeKind]::Utc))

  $files = Get-ChildItem $Mod -Recurse -File | Where-Object {
    $_.FullName -notmatch "\\build\\|\\.git\\|\\webroot\\" `
      -and $_.Name -ne ".gitkeep" `
      -and $_.Name -ne ".all" `
      -and $_.Extension -ne ".idsig" `
      -and ($IncludeZygisk -or $_.FullName -notmatch "\\zygisk\\[^\\]+\.so$")
  }

  $zip = [System.IO.Compression.ZipFile]::Open($zipPath, [System.IO.Compression.ZipArchiveMode]::Create)
  try {
    foreach ($f in $files) {
      $rel = $f.FullName.Substring($Mod.Length + 1).Replace("\", "/")
      $entry = $zip.CreateEntry($rel, [System.IO.Compression.CompressionLevel]::Optimal)
      $isExec = ($f.Extension.ToLower() -eq ".sh") -or ($rel -match "^bin/[^/]+/causentryd$")
      $entry.ExternalAttributes = if ($isExec) { $mode755 } else { $mode644 }
      $entry.LastWriteTime = $stamp
      $in = [IO.File]::OpenRead($f.FullName)
      $es = $entry.Open()
      try { $in.CopyTo($es) } finally { $es.Dispose(); $in.Dispose() }
    }
  } finally { $zip.Dispose() }

  # Strict Zip + APK JNI Verification
  $zipCheck = [System.IO.Compression.ZipFile]::OpenRead($zipPath)
  try {
    $required = @(
      "module.prop",
      "sepolicy.rule",
      "post-fs-data.sh",
      "service.sh",
      "customize.sh",
      "action.sh",
      "uninstall.sh",
      "config.default.json",
      "payload/Causentry.apk",
      "bin/arm64-v8a/causentryd",
      "bin/armeabi-v7a/causentryd"
    )
    if ($IncludeZygisk) {
      $required += @(
        "classes.dex",
        "packages/android",
        "packages/com.android.providers.settings",
        "zygisk/arm64-v8a.so",
        "zygisk/armeabi-v7a.so",
        "lib/arm64-v8a/libfusehide.so",
        "lib/armeabi-v7a/libfusehide.so"
      )
    }
    foreach ($req in $required) {
      if (-not $zipCheck.GetEntry($req)) { Die "zip validation failed: $req is missing" }
    }
    foreach ($e in $zipCheck.Entries) {
      if ($e.FullName -like "webroot/*" -or $e.FullName -eq "packages/.all" -or $e.FullName -like "zygisk/x86*.so") {
        Die "zip validation failed: forbidden legacy entry present: $($e.FullName)"
      }
    }
  } finally { $zipCheck.Dispose() }

  # Verify embedded Dual-ABI rust-anything JNI libs inside Causentry.apk
  $apkCheck = [System.IO.Compression.ZipFile]::OpenRead($ApkOut)
  try {
    $requiredJni = @(
      "lib/arm64-v8a/libforensic_core_rs.so",
      "lib/arm64-v8a/libbackup_core_rs.so",
      "lib/armeabi-v7a/libforensic_core_rs.so",
      "lib/armeabi-v7a/libbackup_core_rs.so"
    )
    foreach ($j in $requiredJni) {
      if (-not $apkCheck.GetEntry($j)) { Die "APK validation failed: missing JNI library $j" }
    }
  } finally { $apkCheck.Dispose() }

  Say ("      zip ok: {0} ({1:n0} bytes, {2} files)" -f $zipPath, (Get-Item $zipPath).Length, $files.Count) "Green"

  if ($Deploy) {
    $adb = (Get-Command adb -ErrorAction SilentlyContinue).Source
    if (-not $adb) { Die "adb not found on PATH (needed for -Deploy)" }
    Say ""
    Say "== Pushing to /sdcard/Download =="
    if ($Device) { & $adb -s $Device push $zipPath "/sdcard/Download/$(Split-Path -Leaf $zipPath)" }
    else         { & $adb push $zipPath "/sdcard/Download/$(Split-Path -Leaf $zipPath)" }
    if ($LASTEXITCODE -ne 0) { Die "adb push failed" }
  }

  Say ""
  Say "DONE" "Green"
  Say "   APK : $ApkOut"
  Say "   ZIP : $zipPath"
} finally {
  $mutex.ReleaseMutex()
  $mutex.Dispose()
  if ($Pause) { Read-Host "Press Enter to close" | Out-Null }
}
