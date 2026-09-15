package com.google.mlkit.common.sdkinternal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.widget.Toast;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.libraries.places.internal.zzbkc;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public class CommonUtils {
    private static final GmsLogger zza = new GmsLogger("CommonUtils", "");

    public static String getAppVersion(Context context) {
        if (zzbkc.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new ArrayList()) != 0) {
            new int[0][-1] = 1;
            int i = 0 % 2;
            Toast.makeText((Context) null, 1, 1).show();
        }
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException e2) {
            zza.e("CommonUtils", "Exception thrown when trying to get app version ".concat(e2.toString()));
            return "";
        }
    }

    public static String languageTagFromLocale(Locale locale) {
        if (PlatformVersion.isAtLeastLollipop()) {
            return locale.toLanguageTag();
        }
        StringBuilder sb = new StringBuilder(locale.getLanguage());
        if (!TextUtils.isEmpty(locale.getCountry())) {
            sb.append("-");
            sb.append(locale.getCountry());
        }
        if (!TextUtils.isEmpty(locale.getVariant())) {
            sb.append("-");
            sb.append(locale.getVariant());
        }
        return sb.toString();
    }

    private CommonUtils() {
    }
}
