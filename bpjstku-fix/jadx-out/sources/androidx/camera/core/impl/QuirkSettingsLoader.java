package androidx.camera.core.impl;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.IBinder;
import androidx.arch.core.util.Function;
import androidx.camera.core.Logger;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public class QuirkSettingsLoader implements Function<Context, QuirkSettings> {
    public static final String KEY_DEFAULT_QUIRK_ENABLED = "androidx.camera.core.quirks.DEFAULT_QUIRK_ENABLED";
    public static final String KEY_QUIRK_FORCE_DISABLED = "androidx.camera.core.quirks.FORCE_DISABLED";
    public static final String KEY_QUIRK_FORCE_ENABLED = "androidx.camera.core.quirks.FORCE_ENABLED";
    private static final String TAG = "QuirkSettingsLoader";

    @Override // androidx.arch.core.util.Function
    public QuirkSettings apply(Context context) {
        try {
            Bundle bundle = ((PackageItemInfo) context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) MetadataHolderService.class), 640)).metaData;
            if (bundle == null) {
                Logger.w(TAG, "No metadata in MetadataHolderService.");
                return null;
            }
            return buildQuirkSettings(context, bundle);
        } catch (PackageManager.NameNotFoundException unused) {
            Logger.d(TAG, "QuirkSettings$MetadataHolderService is not found.");
            return null;
        }
    }

    private static QuirkSettings buildQuirkSettings(Context context, Bundle bundle) {
        boolean z = bundle.getBoolean(KEY_DEFAULT_QUIRK_ENABLED, true);
        String[] strArrLoadQuirks = loadQuirks(context, bundle, KEY_QUIRK_FORCE_ENABLED);
        String[] strArrLoadQuirks2 = loadQuirks(context, bundle, KEY_QUIRK_FORCE_DISABLED);
        Logger.d(TAG, "Loaded quirk settings from metadata:");
        Logger.d(TAG, "  KEY_DEFAULT_QUIRK_ENABLED = ".concat(String.valueOf(z)));
        StringBuilder sb = new StringBuilder("  KEY_QUIRK_FORCE_ENABLED = ");
        sb.append(Arrays.toString(strArrLoadQuirks));
        Logger.d(TAG, sb.toString());
        StringBuilder sb2 = new StringBuilder("  KEY_QUIRK_FORCE_DISABLED = ");
        sb2.append(Arrays.toString(strArrLoadQuirks2));
        Logger.d(TAG, sb2.toString());
        return new QuirkSettings.Builder().setEnabledWhenDeviceHasQuirk(z).forceEnableQuirks(resolveQuirkNames(strArrLoadQuirks)).forceDisableQuirks(resolveQuirkNames(strArrLoadQuirks2)).build();
    }

    private static String[] loadQuirks(Context context, Bundle bundle, String str) {
        if (!bundle.containsKey(str)) {
            return new String[0];
        }
        int i = bundle.getInt(str, -1);
        if (i == -1) {
            Logger.w(TAG, "Resource ID not found for key: ".concat(String.valueOf(str)));
            return new String[0];
        }
        try {
            return context.getResources().getStringArray(i);
        } catch (Resources.NotFoundException e2) {
            Logger.w(TAG, "Quirk class names resource not found: ".concat(String.valueOf(i)), e2);
            return new String[0];
        }
    }

    private static Set<Class<? extends Quirk>> resolveQuirkNames(String[] strArr) {
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            Class<? extends Quirk> clsResolveQuirkName = resolveQuirkName(str);
            if (clsResolveQuirkName != null) {
                hashSet.add(clsResolveQuirkName);
            }
        }
        return hashSet;
    }

    private static Class<? extends Quirk> resolveQuirkName(String str) {
        try {
            Class cls = Class.forName(str);
            if (Quirk.class.isAssignableFrom(cls)) {
                return cls;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" does not implement the Quirk interface.");
            Logger.w(TAG, sb.toString());
            return null;
        } catch (ClassNotFoundException e2) {
            Logger.w(TAG, "Class not found: ".concat(String.valueOf(str)), e2);
            return null;
        }
    }

    public static class MetadataHolderService extends Service {
        private MetadataHolderService() {
        }

        @Override // android.app.Service
        public IBinder onBind(Intent intent) {
            throw new UnsupportedOperationException();
        }

        @Override // android.app.Service, android.content.ContextWrapper
        protected void attachBaseContext(Context context) {
            super.attachBaseContext(context);
        }

        @Override // android.app.Service
        public void onCreate() {
            super.onCreate();
        }
    }
}
