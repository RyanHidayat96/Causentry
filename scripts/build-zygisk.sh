#!/usr/bin/env bash
# Build the Causentry Zygisk backend and drop the .so files into the KernelSU module.
#
#   scripts/build-zygisk.sh            -> root-module/zygisk/{arm64-v8a,armeabi-v7a}.so
#
# Needs the Android SDK (this repo keeps one in tools/sdk) with an NDK and a CMake package:
#   tools/sdk/cmdline-tools/latest/bin/sdkmanager "ndk;26.1.10909125" "cmake;3.22.1"
set -euo pipefail

ROOT="$(cd "$(dirname "$0")/.." && pwd)"
SDK="$ROOT/tools/sdk"
NDK="$(ls -d "$SDK"/ndk/* 2>/dev/null | tail -1)"
CMAKEBIN="$(ls -d "$SDK"/cmake/*/bin 2>/dev/null | tail -1)"

if [ -z "$NDK" ]; then echo "no NDK under $SDK/ndk" >&2; exit 1; fi
if [ -z "$CMAKEBIN" ]; then echo "no cmake under $SDK/cmake" >&2; exit 1; fi

# cmake.exe is a native Windows binary: C:/... paths, not MSYS /c/...
nat() { if command -v cygpath >/dev/null 2>&1; then cygpath -m "$1"; else echo "$1" | sed -E 's|^/([a-zA-Z])/|\1:/|'; fi; }

OUT="$ROOT/root-module/zygisk"
mkdir -p "$OUT"

for ABI in arm64-v8a armeabi-v7a; do
  BUILD="$ROOT/zygisk-src/build-$ABI"
  rm -rf "$BUILD"
  "$CMAKEBIN/cmake.exe" -S "$(nat "$ROOT/zygisk-src/jni")" -B "$(nat "$BUILD")" -G Ninja \
    -DCMAKE_TOOLCHAIN_FILE="$(nat "$NDK/build/cmake/android.toolchain.cmake")" \
    -DANDROID_ABI="$ABI" \
    -DANDROID_PLATFORM=android-29 \
    -DCMAKE_BUILD_TYPE=Release \
    -DCMAKE_MAKE_PROGRAM="$(nat "$CMAKEBIN/ninja.exe")" >/dev/null
  "$CMAKEBIN/cmake.exe" --build "$(nat "$BUILD")" >/dev/null
  cp "$BUILD/libcausentry-zygisk.so" "$OUT/$ABI.so"
  echo "zygisk ok: $ABI.so ($(wc -c < "$OUT/$ABI.so") bytes)"
done
