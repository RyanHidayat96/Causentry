package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.location.LocationManager;
import android.provider.Settings;
import android.widget.Toast;
import com.google.android.gms.measurement.internal.zzjh;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class AndroidImageReaderProxyExternalSyntheticLambda1 {
    public static final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        try {
            return Settings.Secure.getInt(context.getContentResolver(), "development_settings_enabled", 0) != 0;
        } catch (Exception unused) {
        }
    }

    public static final boolean b(Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        try {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2(context);
        } catch (Exception unused) {
            return false;
        }
    }

    public static final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            List<String> listListOf = CollectionsKt.listOf((Object[]) new String[]{"com.lexa.fakegps", "com.fakegps.mock", "com.incorporateapps.fakegps", "com.incorporateapps.fakegps.fre", "com.lkr.fakelocation", "com.marlon.floating.fake.location", "com.location.faker", "com.theappninjas.fakegpsjoystick", "com.theappninjas.gpsjoystick", "com.evezzon.fakegps", "ru.gavrikov.mocklocations", "com.blogspot.newapphorizons.fakegps", "fr.dvilleneuve.lockito", "com.fake.location", "com.fake.gps.location", "com.gsmartstudio.fakegps", "com.rosteam.gpsemulator", "com.divi.fakeGPS", "com.mockgps.fakegpslocation"});
            if ((listListOf instanceof Collection) && listListOf.isEmpty()) {
                return false;
            }
            for (String str : listListOf) {
                try {
                    if (zzjh.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new ArrayList()) != 0) {
                        new int[0][-1] = 1;
                        int i = 0 % 2;
                        Toast.makeText((Context) null, 1, 1).show();
                    }
                    packageManager.getPackageInfo(str, 0);
                    return true;
                } catch (Exception unused) {
                }
            }
            return false;
        } catch (Exception unused2) {
            return false;
        }
    }

    public static final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        try {
            Object systemService = context.getSystemService(FirebaseAnalytics.Param.LOCATION);
            Intrinsics.checkNotNull(systemService, "");
            LocationManager locationManager = (LocationManager) systemService;
            List<String> allProviders = locationManager.getAllProviders();
            Intrinsics.checkNotNullExpressionValue(allProviders, "");
            List<String> list = allProviders;
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            for (String str : list) {
                try {
                    if (locationManager.getProvider(str) != null) {
                        Intrinsics.checkNotNull(str);
                        if (StringsKt.contains((CharSequence) str, (CharSequence) "mock", true) || StringsKt.contains((CharSequence) str, (CharSequence) "fake", true) || StringsKt.contains((CharSequence) str, (CharSequence) "test", true)) {
                            return true;
                        }
                    } else {
                        continue;
                    }
                } catch (Exception unused) {
                }
            }
            return false;
        } catch (Exception unused2) {
            return false;
        }
    }

    public static final void TuitionPaymentFragmentbindingInflater1(Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        try {
            File cacheDir = context.getCacheDir();
            Intrinsics.checkNotNullExpressionValue(cacheDir, "");
            File externalCacheDir = context.getExternalCacheDir();
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(cacheDir);
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(externalCacheDir);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(File file) {
        if (file != null && file.isDirectory()) {
            for (String str : file.list()) {
                if (!TuitionPaymentFragmentspecialinlinedviewModeldefault3(new File(file, str))) {
                    return false;
                }
            }
            return file.delete();
        }
        if (file == null || !file.isFile()) {
            return false;
        }
        return file.delete();
    }
}
