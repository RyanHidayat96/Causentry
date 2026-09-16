#!/system/bin/sh
DIR=/data/adb/causentry
. "$DIR/lib.sh"
# Causentry - root-indicator app candidates. Protected apps often enumerate
# installed packages to find Magisk, KernelSU, Xposed, fake-GPS tools, etc.
# This helper only supplies candidate lists. Actual hiding is target-scoped via
# cloak.json; it must not uninstall, disable, or globally hide user apps.

# --- common root managers / patchers / injectors
DB="com.topjohnwu.magisk com.topjohnwu.magisk.debug com.topjohnwu.magisk.canary
eu.chainfire.supersu eu.chainfire.supersu.pro com.noshufou.android.su
com.noshufou.android.su.elite com.koushikdutta.superuser com.thirdparty.superuser
com.yellowes.su com.kingroot.kinguser com.kingo.root com.smedialink.oneclickroot
com.zhiqupk.root.global com.alephzain.framaroot com.geohot.towelroot
com.ramdroid.appquarantine com.ramdroid.appquarantinepro me.phh.superuser
me.weishu.kernelsu com.rifsxd.ksunext com.saurik.substrate
de.robv.android.xposed.installer org.lsposed.manager com.solohsu.android.edxp.manager
org.meowcat.edxposed.manager com.chelpus.lackypatch com.dimonvideo.luckypatcher
com.forpix.valet com.keramidas.TitaniumBackup"

# --- spotted on this device but not auto-selected. The UI lists them so the
#     user can opt in by adding them to the hidden-app list.
SUGGEST="io.github.a13e300.ksuwebui io.github.lsposed.disableflagsecure
bin.mt.plus bin.mt.termex eu.thedarken.sdm eu.thedarken.sdm.unlocker
com.coderstory.toolkit org.adaway io.github.xiaotong6666.fusehide com.daiesp
com.termux com.android.virtualization.terminal ma.wanam.youtubeadaway"

extras() {
  { jlist root_packages; [ -f "$DIR/root_extra.txt" ] && cat "$DIR/root_extra.txt"; } \
    | while IFS= read -r p; do valid_package_name "$p" && echo "$p"; done
}

PKG_CACHE=
load_packages() {
  [ -n "$PKG_CACHE" ] && return 0
  PKG_CACHE=$(pm list packages --user 0 2>/dev/null | sed 's/^package://')
}

installed() {
  valid_package_name "$1" || return 1
  load_packages
  printf '%s\n' "$PKG_CACHE" | grep -Fxq "$1"
}

case "$1" in
  list)
    printf '%s\n' $DB
    extras
    ;;
  suggest)
    for p in $SUGGEST; do installed "$p" && echo "$p"; done
    ;;
  scan)
    for p in $DB $(extras); do installed "$p" && echo "$p"; done
    ;;
  hide)
    echo "root app physical hiding is disabled; add packages to the hidden-app list instead"
    echo "root-apps hidden: 0"
    ;;
  *)
    echo "usage: root-apps.sh list|suggest|scan|hide"
    ;;
esac
