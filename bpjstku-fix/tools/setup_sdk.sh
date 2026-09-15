#!/usr/bin/env bash
set -x
BASE=/c/Users/exery/Documents/tools/Causentry/bpjstku-fix
cd "$BASE/tools" || exit 1
curl -sL -o cmdline-tools.zip "https://dl.google.com/android/repository/commandlinetools-win-11076708_latest.zip"
echo "cmdline-tools.zip size: $(wc -c < cmdline-tools.zip)"
mkdir -p sdk/cmdline-tools
cd sdk/cmdline-tools
unzip -oq ../../cmdline-tools.zip
[ -d cmdline-tools ] && mv cmdline-tools latest
cd "$BASE/tools"
curl -sL -o api-82.jar "https://repo1.maven.org/maven2/de/robv/android/xposed/api/82/api-82.jar"
echo "api-82.jar size: $(wc -c < api-82.jar)"
SDKM="C:/Users/exery/Documents/tools/Causentry/bpjstku-fix/tools/sdk/cmdline-tools/latest/bin/sdkmanager.bat"
SDKROOT="C:/Users/exery/Documents/tools/Causentry/bpjstku-fix/tools/sdk"
yes | cmd /c "$SDKM --sdk_root=$SDKROOT --licenses" >/dev/null 2>&1
cmd /c "$SDKM --sdk_root=$SDKROOT \"platforms;android-35\" \"build-tools;35.0.0\""
ls sdk/build-tools/ 2>&1
ls sdk/platforms/ 2>&1
ls -la sdk/build-tools/35.0.0/aapt2.exe sdk/build-tools/35.0.0/d8.bat sdk/build-tools/35.0.0/zipalign.exe sdk/build-tools/35.0.0/apksigner.bat 2>&1
echo SETUP_DONE
