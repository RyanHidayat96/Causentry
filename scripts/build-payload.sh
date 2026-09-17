#!/usr/bin/env bash
# Causentry - build the optional in-process payload APK (no gradle:
# javac -> d8 -> aapt2 -> zipalign -> apksigner) and drop it where the module wants it.
#
#   ./scripts/build-payload.sh            build payload-src -> root-module/payload/Causentry.apk
#   ./scripts/build-payload.sh --pack     ... and also pack the module zip (release/)
set -euo pipefail

ROOT="$(cd "$(dirname "$0")/.." && pwd)"
SRC="$ROOT/payload-src"
B="$ROOT/build/payload"
OUT_APK="$ROOT/root-module/payload/Causentry.apk"
KS="$ROOT/causentry.keystore"
SDK="${CAUSENTRY_SDK:-$ROOT/tools/sdk}"
BT="$SDK/build-tools/35.0.0"
AJAR="$SDK/platforms/android-35/android.jar"

win() { case "$1" in /?/*) printf 'C:/%s' "${1:3}";; *) printf '%s' "$1";; esac; }
[ -f "$AJAR" ] || { echo "missing $AJAR (run tools setup or set CAUSENTRY_SDK)"; exit 1; }

rm -rf "$B"; mkdir -p "$B/stubs" "$B/classes" "$B/dex" "$B/gen" "$B/apk"
echo "== 1/6 stubs =="
javac -nowarn -cp "$(win "$AJAR")" -d "$(win "$B/stubs")" $(find "$SRC/stubs" -name '*.java' | sed 's|^/?/|C:/|')
echo "== 2/6 payload classes =="
javac -nowarn --release 11 -cp "$(win "$AJAR");$(win "$B/stubs")" -d "$(win "$B/classes")" $(find "$SRC/src" -name '*.java' | sed 's|^/?/|C:/|')
echo "== 3/6 d8 =="
CLASSES=$(find "$B/classes" -name '*.class' | sed 's|^/?/|C:/|' | tr '\n' ' ')
java -cp "$(win "$BT/lib/d8.jar")" com.android.tools.r8.D8 --release --min-api 26 --lib "$(win "$AJAR")" --output "$(win "$B/dex")" $CLASSES
echo "== 4/6 aapt2 =="
"$BT/aapt2.exe" compile --dir "$(win "$SRC/res")" -o "$(win "$B/res.zip")"
"$BT/aapt2.exe" link -o "$(win "$B/apk/base.apk")" -I "$(win "$AJAR")" \
  --manifest "$(win "$SRC/manifest/AndroidManifest.xml")" \
  --java "$(win "$B/gen")" --min-sdk-version 26 --target-sdk-version 35 --no-version-vectors "$(win "$B/res.zip")"
echo "== 5/6 classes.dex =="
python - "$(win "$B/apk/base.apk")" "$(win "$B/apk/dexed.apk")" "$(win "$B/dex/classes.dex")" <<'PYEOF'
import shutil, sys, zipfile
base, out, dex = sys.argv[1], sys.argv[2], sys.argv[3]
shutil.copyfile(base, out)
with zipfile.ZipFile(out, "a", zipfile.ZIP_DEFLATED) as z:
    z.write(dex, "classes.dex")
PYEOF
"$BT/zipalign.exe" -f -p 4 "$(win "$B/apk/dexed.apk")" "$(win "$B/apk/aligned.apk")"
echo "== 6/6 sign =="
if [ ! -f "$KS" ]; then
  keytool -genkeypair -keystore "$(win "$KS")" -alias causentry -keyalg RSA -keysize 2048 \
    -validity 10000 -storepass causentry -keypass causentry -dname "CN=Causentry,O=Causentry,C=ID"
fi
mkdir -p "$(dirname "$OUT_APK")"
java -jar "$(win "$BT/lib/apksigner.jar")" sign --ks "$(win "$KS")" --ks-pass pass:causentry \
  --key-pass pass:causentry --out "$(win "$OUT_APK")" "$(win "$B/apk/aligned.apk")"
java -jar "$(win "$BT/lib/apksigner.jar")" verify "$(win "$OUT_APK")" >/dev/null
ls -la "$OUT_APK"
echo PAYLOAD_BUILD_OK

[ "${1:-}" = "--pack" ] && "$ROOT/scripts/package-universal-module.sh"
