#!/usr/bin/env bash
# Causentry APK build (no gradle: javac -> d8 -> aapt2 -> zipalign -> apksigner)
set -e
BASE=/c/Users/exery/Documents/tools/Causentry/bpjstku-fix
SDK=$BASE/tools/sdk
BT=$SDK/build-tools/35.0.0
AJAR=$SDK/platforms/android-35/android.jar
SRC=$BASE/causentry/apk
B=$BASE/causentry/build
OUT=$BASE/causentry/out
KS=$BASE/causentry/causentry.keystore

win() { echo "$1" | sed 's|^/c/|C:/|'; }

rm -rf "$B"; mkdir -p "$B/stubs" "$B/classes" "$B/dex" "$B/gen" "$B/apk" "$OUT"

echo "== 1/7 stubs =="
javac -nowarn -d "$(win "$B/stubs")" $(find "$SRC/stubs" -name '*.java' | sed 's|^/c/|C:/|')

echo "== 2/7 module classes =="
javac -nowarn --release 11 -cp "$(win "$AJAR");$(win "$B/stubs")" -d "$(win "$B/classes")" \
  $(find "$SRC/src" -name '*.java' | sed 's|^/c/|C:/|')

echo "== 3/7 d8 =="
CLASSES=$(find "$B/classes" -name '*.class' | sed 's|^/c/|C:/|' | tr '\n' ' ')
java -cp "$(win "$BT/lib/d8.jar")" com.android.tools.r8.D8 --release --min-api 26 \
  --lib "$(win "$AJAR")" --output "$(win "$B/dex")" $CLASSES

echo "== 4/7 aapt2 =="
"$BT/aapt2.exe" compile --dir "$(win "$SRC/res")" -o "$(win "$B/res.zip")"
"$BT/aapt2.exe" link -o "$(win "$B/apk/base.apk")" -I "$(win "$AJAR")" \
  --manifest "$(win "$SRC/manifest/AndroidManifest.xml")" -R "$(win "$B/res.zip")" \
  -A "$(win "$SRC/assets")" --java "$(win "$B/gen")" \
  --min-sdk-version 26 --target-sdk-version 35 --no-version-vectors

echo "== 5/7 add classes.dex =="
python - <<PYEOF
import zipfile
base = r"$(win "$B/apk/base.apk")"
out  = r"$(win "$B/apk/dexed.apk")"
dex  = r"$(win "$B/dex/classes.dex")"
import shutil
shutil.copyfile(base, out)
with zipfile.ZipFile(out, "a", zipfile.ZIP_DEFLATED) as z:
    z.write(dex, "classes.dex")
print("dexed apk:", out)
PYEOF

echo "== 6/7 zipalign =="
"$BT/zipalign.exe" -f -p 4 "$(win "$B/apk/dexed.apk")" "$(win "$B/apk/aligned.apk")"

echo "== 7/7 sign =="
if [ ! -f "$KS" ]; then
  keytool -genkeypair -keystore "$(win "$KS")" -alias causentry -keyalg RSA -keysize 2048 \
    -validity 10000 -storepass causentry -keypass causentry \
    -dname "CN=Causentry,O=Causentry,C=ID"
fi
java -jar "$(win "$BT/lib/apksigner.jar")" sign --ks "$(win "$KS")" \
  --ks-pass pass:causentry --key-pass pass:causentry \
  --out "$(win "$OUT/Causentry.apk")" "$(win "$B/apk/aligned.apk")"
java -jar "$(win "$BT/lib/apksigner.jar")" verify --print-certs "$(win "$OUT/Causentry.apk")" | head -4
ls -la "$OUT/Causentry.apk"
echo BUILD_OK
