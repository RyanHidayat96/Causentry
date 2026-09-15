#!/usr/bin/env sh
set -eu

repo_root=$(CDPATH= cd -- "$(dirname -- "$0")/.." && pwd)
module_dir="$repo_root/root-module"

test -f "$module_dir/module.prop"
test -f "$module_dir/customize.sh"
test -f "$module_dir/service.sh"
test -f "$module_dir/uninstall.sh"

echo "Module packaging is scheduled for STEP 5."
