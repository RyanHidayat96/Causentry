#!/usr/bin/env sh
set -eu

if [ "$#" -eq 0 ]; then
    echo "usage: checksums.sh FILE..." >&2
    exit 64
fi

if command -v sha256sum >/dev/null 2>&1; then
    exec sha256sum "$@"
fi

if command -v shasum >/dev/null 2>&1; then
    exec shasum -a 256 "$@"
fi

echo "sha256sum or shasum required." >&2
exit 127
