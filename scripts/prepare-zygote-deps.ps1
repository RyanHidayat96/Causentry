#requires -version 5
[CmdletBinding()]
param()

$ErrorActionPreference = "Stop"
$Root = Split-Path -Parent $PSScriptRoot
$Vendor = Join-Path $Root "android\zygote\third_party"
New-Item -ItemType Directory -Force -Path $Vendor | Out-Null

function Ensure-Repository([string]$Name, [string]$Url, [string]$Commit, [string]$Marker) {
  $path = Join-Path $Vendor $Name
  if (Test-Path (Join-Path $path $Marker)) {
    if (-not (Test-Path (Join-Path $path ".git"))) { return }
    $actual = (& git -C $path rev-parse HEAD).Trim()
    if ($actual -eq $Commit) { return }
    throw "Dependency '$Name' is at $actual, expected pinned commit $Commit"
  }
  if (Test-Path $path) {
    throw "Incomplete vendored dependency '$Name' at $path. Remove that generated directory, then rerun the build."
  }
  Write-Host "   cloning $Name"
  & git clone $Url $path
  if ($LASTEXITCODE -ne 0) { throw "git clone failed for $Name" }
  & git -C $path checkout --detach $Commit
  if ($LASTEXITCODE -ne 0) { throw "git checkout failed for $Name at $Commit" }
  if (-not (Test-Path (Join-Path $path $Marker))) {
    throw "Dependency '$Name' cloned but marker '$Marker' is missing"
  }
}

Ensure-Repository "AndroidVMTools" "https://github.com/aerath-stuff/AndroidVMTools.git" "9475e31" "src\main\java\com\v7878\vmtools\Hooks.java"
Ensure-Repository "PanamaPort" "https://github.com/aerath-stuff/PanamaPort.git" "6e546bb" "Core\src\openjdk\java\com\v7878\foreign\MemorySegment.java"

# SDK 35 does not expose API 36's SDK_INT_FULL field. At runtime this backend
# runs on the target's real API level; SDK_INT * 100000 is the compatible value
# for the ART version gates used by this pinned PanamaPort revision.
$compatFiles = @(
  "Unsafe\src\main\java\com\v7878\unsafe\ArtVersion.java",
  "Unsafe\src\main\java\com\v7878\unsafe\access\AccessLinker.java",
  "Unsafe\src\main\java\com\v7878\unsafe\foreign\BulkLinker.java"
)
foreach ($relative in $compatFiles) {
  $path = Join-Path (Join-Path $Vendor "PanamaPort") $relative
  $content = [IO.File]::ReadAllText($path)
  $content = $content.Replace(
    "import static android.os.Build.VERSION.SDK_INT_FULL;",
    "import static android.os.Build.VERSION.SDK_INT;")
  $content = $content.Replace("SDK_INT_FULL", "(SDK_INT * 100000)")
  [IO.File]::WriteAllText($path, $content, (New-Object Text.UTF8Encoding($false)))
}
