#!/usr/bin/env sh
set -eu

repo_root=$(CDPATH= cd -- "$(dirname -- "$0")/.." && pwd)
cd "$repo_root/android"

if [ -x "./gradlew" ]; then
    exec ./gradlew :app:assembleDebug :app:testDebugUnitTest
fi

if command -v gradle >/dev/null 2>&1; then
    exec gradle :app:assembleDebug :app:testDebugUnitTest
fi

gradle_home=${GRADLE_USER_HOME:-"$HOME/.gradle"}
cached_gradle=$(find "$gradle_home/wrapper/dists" -path "*/gradle-*/bin/gradle" -type f 2>/dev/null | sort | tail -n 1 || true)
if [ -n "$cached_gradle" ]; then
    exec "$cached_gradle" :app:assembleDebug :app:testDebugUnitTest
fi

echo "Gradle wrapper or gradle command required." >&2
exit 127
