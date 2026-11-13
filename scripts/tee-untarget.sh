#!/system/bin/sh
# Remove a package from MhmRdd/AlwaysStrong's target.txt with a timestamped backup.
DIR=/data/adb/tricky_store
PKG="${1:-com.bpjstku}"

cd "$DIR" || exit 1
STAMP=$(date +%H%M%S)
cp -f target.txt "target.txt.causentry-bak-$STAMP" || exit 1
before=$(grep -c "^$PKG\$" target.txt)
grep -v "^$PKG\$" target.txt > target.txt.new && mv -f target.txt.new target.txt
after=$(grep -c "^$PKG\$" target.txt)
echo "pkg=$PKG before=$before after=$after backup=target.txt.causentry-bak-$STAMP"
echo "--- existing backups ---"
ls target.txt.causentry-bak-* 2>/dev/null | tail -3
