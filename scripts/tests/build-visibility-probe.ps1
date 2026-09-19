$ErrorActionPreference = 'Stop'
$root = (Resolve-Path "$PSScriptRoot/../..").Path
$probeBuild = Join-Path $root 'build/visibility-probe'
$sdk = Join-Path $root 'tools/sdk'
$javaBin = 'C:/Program Files/Java/jdk-21/bin'
$androidJar = Join-Path $sdk 'platforms/android-36/android.jar'
New-Item -ItemType Directory -Force "$probeBuild/classes", "$probeBuild/dex" | Out-Null
& "$javaBin/javac.exe" --release 11 -cp $androidJar -d "$probeBuild/classes" "$PSScriptRoot/PackageVisibilityProbe.java"
if ($LASTEXITCODE -ne 0) { throw 'Probe compilation failed' }
$classes = @(Get-ChildItem "$probeBuild/classes" -Filter '*.class' -Recurse | ForEach-Object FullName)
& "$javaBin/java.exe" -cp "$sdk/build-tools/36.0.0/lib/d8.jar" com.android.tools.r8.D8 --min-api 26 --lib $androidJar --output "$probeBuild/dex" $classes
if ($LASTEXITCODE -ne 0) { throw 'Probe dex generation failed' }
Write-Output "$probeBuild/dex/classes.dex"
