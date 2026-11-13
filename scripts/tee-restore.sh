#!/system/bin/sh
# Restore the pre-Causentry-debug state of the Tricky Store / AlwaysStrong setup:
#   - com.bpjstku back in target.txt  (from the timestamped backup)
#   - the keybox that was live before the swap (keybox.xml.causentry-current-*)
#   - auto-keybox updates re-enabled (remove the custom_keybox marker)
#
#   sh tee-restore.sh            -> list what it would do
#   sh tee-restore.sh --apply    -> do it
DIR=/data/adb/tricky_store
cd "$DIR" || exit 1

echo "== before =="
echo "target.txt lines : $(wc -l < target.txt)   bpjstku: $(grep -c bpjstku target.txt)"
echo "keybox md5       : $(md5sum keybox.xml | cut -c1-32)"
echo "custom_keybox    : $([ -f custom_keybox ] && echo present || echo absent)"
echo "backups          : $(ls target.txt.causentry-bak-* keybox.xml.causentry-current-* 2>/dev/null | tr '\n' ' ')"

[ "$1" = "--apply" ] || { echo; echo "(dry run - add --apply)"; exit 0; }

# 1. package list: the backup that still contains bpjstku
PKG_BAK=$(for f in target.txt.causentry-bak-*; do
            [ -f "$f" ] && [ "$(grep -c '^com.bpjstku$' "$f")" -gt 0 ] && { echo "$f"; break; }
          done)
if [ -n "$PKG_BAK" ]; then
  cp -f "$PKG_BAK" target.txt && echo "target.txt restored from $PKG_BAK"
else
  printf 'com.bpjstku\n' >> target.txt && echo "appended com.bpjstku to target.txt"
fi

# 2. keybox: the one that was live before the swap
KB_BAK=$(ls -t keybox.xml.causentry-current-* 2>/dev/null | head -1)
if [ -n "$KB_BAK" ]; then
  cp -f "$KB_BAK" keybox.xml && chmod 600 keybox.xml && echo "keybox restored from $KB_BAK"
fi

# 3. re-enable the hourly auto keybox fetch
rm -f custom_keybox && echo "custom_keybox marker removed (auto keybox fetch re-enabled)"

echo
echo "== after =="
echo "target.txt lines : $(wc -l < target.txt)   bpjstku: $(grep -c bpjstku target.txt)"
echo "keybox md5       : $(md5sum keybox.xml | cut -c1-32)"
echo "custom_keybox    : $([ -f custom_keybox ] && echo present || echo absent)"
