# Entry point invoked by native Zygisk DEX loader
-keep class com.causentry.zygote.ZygoteEntry {
    public static void premain();
    public static void main();
}

# Companion policy socket JNI bridge
-keep class com.causentry.zygote.PolicyChannel { *; }

# ART hook targets and backends
-keep class com.causentry.zygote.PackageCloakHooks { *; }
-keep class com.causentry.zygote.AppZygoteHooks { *; }
-keep class com.causentry.zygote.ActiveServicesHooks { *; }
-keep class com.causentry.zygote.AccessibilityHooks { *; }
-keep class com.causentry.zygote.UsbStateHooks { *; }
-keep class com.causentry.zygote.SystemServerBackend { *; }
-keep class com.causentry.zygote.CloakPolicy { *; }
-keep class com.causentry.zygote.SettingsProviderBackend { *; }
-keep class com.causentry.zygote.SettingsProviderHooks { *; }

# Pinned AndroidVMTools / PanamaPort uses reflection and hidden ART members
-dontwarn com.v7878.**

# FUSE Storage Cloak backend & JNI bridges
-keep class com.causentry.zygote.MediaProviderBackend { *; }
-keep class io.github.xiaotong6666.fusehide.** { *; }
