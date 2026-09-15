#!/usr/bin/env sh
# Causentry - package the universal KernelSU/Magisk module zip.
# (CODEX.md STEP 5 slot; it used to be a placeholder.)
set -eu

repo_root=$(CDPATH= cd -- "$(dirname -- "$0")/.." && pwd)
module_dir="$repo_root/root-module"
release_dir="$repo_root/release"

test -f "$module_dir/module.prop"
test -f "$module_dir/customize.sh"
test -f "$module_dir/service.sh"
test -f "$module_dir/uninstall.sh"

version=$(sed -n 's/^version=v\{0,1\}//p' "$module_dir/module.prop" | head -1)
[ -n "$version" ] || version=0.0.0
zip="$release_dir/Causentry-KSUN-v$version.zip"

# Android shell scripts must use LF: a stray CR turns the shebang into garbage.
find "$module_dir" -type f \( -name '*.sh' -o -name '*.prop' -o -name '*.json' -o -name '*.html' \) -print0 \
  | while IFS= read -r -d '' f; do
      if grep -q $'\r' "$f" 2>/dev/null; then
        tr -d '\r' < "$f" > "$f.lf" && mv "$f.lf" "$f"
      fi
    done

mkdir -p "$release_dir"
rm -f "$zip"

# python (native Windows build) cannot read MSYS /c/... paths
winpath() { printf '%s' "$1" | sed -E 's|^/([a-zA-Z])/|\1:/|'; }

python - "$(winpath "$module_dir")" "$(winpath "$zip")" <<'PYEOF'
import os, sys, zipfile
module, zip_path = sys.argv[1], sys.argv[2]
with zipfile.ZipFile(zip_path, "w", zipfile.ZIP_DEFLATED) as z:
    n = 0
    for root, dirs, files in os.walk(module):
        dirs[:] = [d for d in dirs if d not in (".git", "__pycache__")]
        for f in sorted(files):
            if f.endswith((".keystore", ".idsig")):
                continue
            fp = os.path.join(root, f)
            rel = os.path.relpath(fp, module).replace("\\", "/")
            zi = zipfile.ZipInfo(rel, date_time=(2026, 9, 15, 12, 0, 0))
            zi.external_attr = (0o755 if f.endswith((".sh", ".prop")) else 0o644) << 16
            zi.compress_type = zipfile.ZIP_DEFLATED
            z.writestr(zi, open(fp, "rb").read())
            n += 1
    print(f"packed {n} files")
PYEOF

ls -la "$zip"
echo "MODULE_ZIP_OK $zip"
