# ZygoteLoader resolves this class and methods from module.prop at runtime.
-keep class com.causentry.zygote.ZygoteEntry {
    public static void premain();
    public static void main();
}

# ART hook targets are selected by their framework class and method names.
-keep class com.causentry.zygote.PackageCloakHooks { *; }
-keep class com.causentry.zygote.AppZygoteHooks { *; }
-keep class com.causentry.zygote.SystemServerBackend { *; }
-keep class com.causentry.zygote.CloakPolicy { *; }
-keep class com.causentry.zygote.SettingsProviderBackend { *; }
-keep class com.causentry.zygote.SettingsProviderHooks { *; }

# Pinned AndroidVMTools / PanamaPort uses reflection and hidden ART members.
-dontwarn com.v7878.**
