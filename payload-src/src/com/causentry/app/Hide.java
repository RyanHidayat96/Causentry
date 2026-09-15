package com.causentry.app;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/** Detection-surface data for the Causentry cloak engine. */
public final class Hide {

    private Hide() {
    }

    /** Settings keys that make apps refuse to run. */
    public static final Set<String> SETTINGS_KEYS = unmodifiable(
            "development_settings_enabled",
            "adb_enabled",
            "adb_wifi_enabled",
            "mock_location",
            "allow_mock_location",
            "package_verifier_include_adb",
            "verifier_verify_adb_installs"
    );

    /**
     * Packages hidden from protected apps: fake-GPS tools, root managers,
     * root cloak/anti-hide tools, patchers and the local root tooling stack.
     */
    public static final Set<String> PACKAGES = buildPackages();

    /** Root-ish binary names used by classic root detection (RootBeer path list). */
    private static final Set<String> ROOT_BINARIES = unmodifiable(
            "su", "daemonsu", "supersu", "superuser", "kingroot", "kingouser",
            "busybox", "magisk", "magiskhide", "magiskpolicy", "resetprop",
            "ksu", "ksud", "ksu_susfs", "susfs",
            "sugote", "sugote-mksh", "supolicy", "libsupol.so",
            "frida-server", "frida", "frida-helper",
            "xposed", "xposedbridge.jar", "supersu.apk", "superuser.apk",
            "rootcloak", "rootcloak.apk", "appquarantine.apk"
    );

    /** Directories that root binaries typically live in. */
    private static final String[] ROOT_DIR_PREFIXES = {
            "/data/local/", "/data/local/bin/", "/data/local/xbin/", "/data/local/tmp/",
            "/sbin/", "/su/bin/", "/system/bin/.ext/", "/system/bin/failsafe/",
            "/system/sd/xbin/", "/system/usr/we-need-root/", "/system/xbin/",
            "/cache/", "/dev/", "/system/app/", "/system/priv-app/"
    };

    /** Explicit paths that always look "rooted". */
    private static final String[] ROOT_EXACT_PREFIXES = {
            "/data/adb", "/data/magisk", "/sbin/.magisk", "/system/xbin/su", "/system/bin/su",
            "/su", "/magisk", "/cache/magisk.log", "/data/adb/modules", "/data/adb/ksu",
            "/data/adb/ksud", "/debug_ramdisk", "/sbin/su"
    };

    /** Commands whose execution is treated as a root probe. */
    private static final String[] ROOT_COMMAND_TOKENS = {
            " su", "su ", "/su", "which su", "type su", "command -v su",
            "magisk", "busybox", "supersu", "superuser", "kingroot", "ksud", "ksu_susfs",
            "frida", "xposed", "resetprop",
            "/data/adb", "supolicy", "mount -o rw,remount"
    };

    /** Class/package name prefixes that reveal a hooking framework. */
    public static final String[] FRAMEWORK_PREFIXES = {
            "de.robv.android.xposed", "com.saurik.substrate", "org.lsposed",
            "org.matrix.vector", "io.github.libxposed", "com.topjohnwu.magisk",
            "eu.chainfire.supersu", "me.weishu.kernelsu", "com.rifsxd.ksunext",
            "com.causentry.app"
    };

    /** System properties reported as stock/clean values. */
    public static final String[][] PROP_SPOOFS = {
            {"ro.debuggable", "0"},
            {"ro.secure", "1"},
            {"ro.build.tags", "release-keys"},
            {"ro.build.type", "user"},
            {"ro.build.selinux", "1"},
            {"ro.boot.verifiedbootstate", "green"},
            {"ro.boot.flash.locked", "1"},
            {"ro.boot.veritymode", "enforcing"},
            {"ro.boot.vbmeta.device_state", "locked"},
            {"ro.boot.warranty_bit", "0"},
            {"ro.warranty_bit", "0"},
            {"ro.adb.secure", "1"},
            {"service.adb.root", "0"},
            {"sys.oem_unlock_allowed", "0"},
            {"ro.oem_unlock_supported", "0"},
            {"init.svc.adbd", "stopped"},
            {"persist.sys.usb.config", "mtp"}
    };

    public static boolean isRootishPath(String path) {
        if (path == null || path.isEmpty()) return false;
        String p = path.toLowerCase();
        for (String exact : ROOT_EXACT_PREFIXES) {
            if (p.equals(exact) || p.startsWith(exact + "/")) return true;
        }
        int slash = p.lastIndexOf('/');
        String name = slash >= 0 ? p.substring(slash + 1) : p;
        if (ROOT_BINARIES.contains(name)) {
            if (slash < 0) return true;
            String dir = p.substring(0, slash + 1);
            for (String prefix : ROOT_DIR_PREFIXES) {
                if (dir.startsWith(prefix)) return true;
            }
            return true; // bare "su" in a name check is close enough
        }
        return false;
    }

    public static boolean isRootishCommand(String cmd) {
        if (cmd == null || cmd.isEmpty()) return false;
        String c = " " + cmd.toLowerCase() + " ";
        for (String token : ROOT_COMMAND_TOKENS) {
            if (c.contains(token)) return true;
        }
        return false;
    }

    public static boolean isFrameworkName(String name) {
        if (name == null) return false;
        for (String prefix : FRAMEWORK_PREFIXES) {
            if (name.startsWith(prefix)) return true;
        }
        String lower = name.toLowerCase();
        return lower.contains("frida") || lower.contains("xposed") || lower.contains("substrate");
    }

    private static Set<String> buildPackages() {
        Set<String> s = new LinkedHashSet<>();
        Collections.addAll(s,
                // fake GPS / mock location tools
                "com.lexa.fakegps", "com.fakegps.mock", "com.incorporateapps.fakegps",
                "com.incorporateapps.fakegps.fre", "com.lkr.fakelocation",
                "com.marlon.floating.fake.location", "com.location.faker",
                "com.theappninjas.fakegpsjoystick", "com.theappninjas.gpsjoystick",
                "com.evezzon.fakegps", "ru.gavrikov.mocklocations",
                "com.blogspot.newapphorizons.fakegps", "fr.dvilleneuve.lockito",
                "com.fake.location", "com.fake.gps.location", "com.gsmartstudio.fakegps",
                "com.rosteam.gpsemulator", "com.divi.fakeGPS", "com.mockgps.fakegpslocation",
                // root managers
                "com.noshufou.android.su", "com.noshufou.android.su.elite", "eu.chainfire.supersu",
                "com.koushikdutta.superuser", "com.thirdparty.superuser", "com.yellowes.su",
                "com.topjohnwu.magisk", "com.kingroot.kinguser", "com.kingo.root",
                "com.smedialink.oneclickroot", "com.zhiqupk.root.global", "com.alephzain.framaroot",
                "me.weishu.kernelsu", "com.rifsxd.ksunext", "kwlkkw.odbaum.pebxnq",
                "io.github.a13e300.ksuwebui",
                // root cloak / hooking / hiding tools
                "com.devadvance.rootcloak", "com.devadvance.rootcloakplus",
                "de.robv.android.xposed.installer", "com.saurik.substrate",
                "com.zachspong.temprootremovejb", "com.amphoras.hidemyroot",
                "com.amphoras.hidemyrootadfree", "com.formyhm.hiderootPremium",
                "com.formyhm.hideroot", "org.lsposed.manager", "org.frknkrc44.hma_oss",
                "io.github.xiaotong6666.fusehide", "top.ltfan.notdeveloper",
                "io.github.lsposed.disableflagsecure", "io.github.mhmrdd.isolationpolicy",
                // patchers / dangerous tools
                "com.dimonvideo.luckypatcher", "com.chelpus.lackypatch", "com.chelpus.luckypatcher",
                "com.blackmartalpha", "org.blackmart.market", "com.allinone.free",
                "com.repodroid.app", "com.koushikdutta.rommanager", "com.koushikdutta.rommanager.license",
                "com.ramdroid.appquarantine", "com.ramdroid.appquarantinepro",
                // local root tooling stack
                "bin.mt.plus", "bin.mt.termex", "eu.thedarken.sdm", "eu.thedarken.sdm.unlocker",
                "org.adaway", "me.paladin.wifi", "com.coderstory.toolkit", "com.daiesp",
                "com.absinthe.libchecker", "com.reveny.nativecheck", "krypton.tbsafetychecker",
                "gr.nikolasspyr.integritycheck", "flar2.devcheck", "com.f0x1d.logfox",
                "com.touchfield.appbackuprestore", "org.swiftapps.swiftbackup",
                "com.termux", "com.causentry.app",
                // hooking support
                "com.parallelc.micts", "ma.wanam.youtubeadaway"
        );
        return s;
    }

    private static Set<String> unmodifiable(String... items) {
        return Collections.unmodifiableSet(new HashSet<>(Arrays.asList(items)));
    }
}
