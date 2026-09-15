#!/usr/bin/env bash
set -x
BASE=/c/Users/exery/Documents/tools/Causentry/bpjstku-fix
SDKM="C:/Users/exery/Documents/tools/Causentry/bpjstku-fix/tools/sdk/cmdline-tools/latest/bin/sdkmanager.bat"
SDKROOT="C:/Users/exery/Documents/tools/Causentry/bpjstku-fix/tools/sdk"
cd "$BASE/tools" || exit 1
cmd /c "$SDKM --sdk_root=$SDKROOT --install platforms;android-35 build-tools;35.0.0" 2>&1 | tail -6
echo "--- result ---"
ls sdk/build-tools/ sdk/platforms/ 2>&1
ls -la sdk/build-tools/35.0.0/aapt2.exe sdk/build-tools/35.0.0/d8.bat sdk/build-tools/35.0.0/zipalign.exe sdk/build-tools/35.0.0/apksigner.bat sdk/platforms/android-35/android.jar 2>&1
echo SDK_FIX_DONE
