#!/usr/bin/env sh
set -eu

repo_root=$(CDPATH= cd -- "$(dirname -- "$0")/.." && pwd)
cd "$repo_root/daemon"

cargo_bin=${CARGO:-}

if [ -z "$cargo_bin" ] && command -v cargo >/dev/null 2>&1; then
    cargo_bin=$(command -v cargo)
fi

if [ -z "$cargo_bin" ] && [ -x "$HOME/.cargo/bin/cargo" ]; then
    cargo_bin="$HOME/.cargo/bin/cargo"
fi

if [ -z "$cargo_bin" ] && [ -x "$HOME/.cargo/bin/cargo.exe" ]; then
    cargo_bin="$HOME/.cargo/bin/cargo.exe"
fi

if [ -z "$cargo_bin" ]; then
    echo "cargo required." >&2
    exit 127
fi

exec "$cargo_bin" test
