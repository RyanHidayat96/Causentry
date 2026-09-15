package androidx.core.content.res;

import android.content.res.Resources;

/* JADX INFO: loaded from: classes6.dex */
public final class ConfigurationHelper {
    private ConfigurationHelper() {
    }

    public static int getDensityDpi(Resources resources) {
        return resources.getConfiguration().densityDpi;
    }
}
