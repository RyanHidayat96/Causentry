#!/system/bin/sh
DIR=/data/adb/causentry
. "$DIR/lib.sh"
# Causentry — root-indicator apps: the thing protected apps actually scan for.
#
# Measured on this device (com.bpjstku / JMO, Zimperium + PairIP protected):
#   * Magisk Manager installed (13:01)  -> app force-closed 3/3 right after start
#   * Magisk Manager hidden for user 0  -> app launched clean 3/3 (reached OnBoarding)
#   * camera permission was NOT the cause (granted -> still crashed)
# So a visible root tool is a hard kill trigger; it has to be invisible while
# protected apps run.
#
# Hiding uses `pm uninstall --user 0` -> fully reversible (Restore button, or
# `pm install-existing --user 0 <pkg>`), app data is preserved.

# --- auto-hidden: root managers / patchers / injectors (hard kill triggers)
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

# --- spotted on this device but NOT auto-hidden (they were present while the
#     protected app still launched fine). The UI lists them so you can opt in.
SUGGEST="io.github.a13e300.ksuwebui io.github.lsposed.disableflagsecure
bin.mt.plus bin.mt.termex eu.thedarken.sdm eu.thedarken.sdm.unlocker
com.coderstory.toolkit org.adaway io.github.xiaotong6666.fusehide com.daiesp
com.termux com.android.virtualization.terminal ma.wanam.youtubeadaway"

extras() { jlist root_packages; [ -f "$DIR/root_extra.txt" ] && cat "$DIR/root_extra.txt"; }
installed() { pm list packages --user 0 2>/dev/null | grep -q "^package:${1}$"; }
never_hide() { [ "$1" = "com.causentry.app" ] && return 0; return 1; }

case "$1" in
  list)    printf '%s\n' $DB; extras ;;
  suggest) for p in $SUGGEST; do installed "$p" && echo "$p"; done ;;
  scan)    for p in $DB $(extras); do installed "$p" && echo "$p"; done ;;
  hide)
    n=0
    MODE=$(hide_mode)
    for p in $DB $(extras); do
      never_hide "$p" && continue
      if installed "$p"; then
        if [ "$MODE" = "cloak" ]; then
          # cloak mode: leave the app alone, the system_server filter hides it from
          # protected apps only (that is the whole point)
          echo "cloaked (not touched): $p"; n=$((n+1)); continue
        fi
        if [ "$MODE" = "hide" ]; then
          pm hide --user 0 "$p" >/dev/null 2>&1 && { echo "hidden: $p"; n=$((n+1)); }
          continue
        fi
        if pm uninstall --user 0 "$p" >/dev/null 2>&1; then
          grep -qx "$p" "$DIR/hidden_packages" 2>/dev/null || echo "$p" >> "$DIR/hidden_packages"
          log "root app hidden: $p"
          echo "hidden: $p"; n=$((n+1))
        fi
      fi
    done
    [ "$n" = 0 ] && echo "no root app visible to the user"
    echo "root-apps hidden: $n"
    ;;
  *)
    echo "usage: root-apps.sh list|suggest|scan|hide"
    ;;
esac
