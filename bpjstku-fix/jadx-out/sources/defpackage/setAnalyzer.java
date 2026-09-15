package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class setAnalyzer {
    private final Context b;

    public setAnalyzer(Context context) {
        this.b = context;
    }

    public final List<ImageAnalysisExternalSyntheticLambda2> TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        ArrayList arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfo = this.b.getPackageManager().getApplicationInfo(this.b.getPackageName(), 128);
            if (applicationInfo != null && ((PackageItemInfo) applicationInfo).metaData != null) {
                if (Log.isLoggable("ManifestParser", 2)) {
                    Objects.toString(((PackageItemInfo) applicationInfo).metaData);
                }
                for (String str : ((PackageItemInfo) applicationInfo).metaData.keySet()) {
                    if ("GlideModule".equals(((PackageItemInfo) applicationInfo).metaData.get(str))) {
                        arrayList.add(TuitionPaymentFragmentbindingInflater1(str));
                        Log.isLoggable("ManifestParser", 3);
                    }
                }
                Log.isLoggable("ManifestParser", 3);
            }
            return arrayList;
        } catch (PackageManager.NameNotFoundException e2) {
            throw new RuntimeException("Unable to find metadata to parse GlideModules", e2);
        }
    }

    private static ImageAnalysisExternalSyntheticLambda2 TuitionPaymentFragmentbindingInflater1(String str) {
        try {
            Class<?> cls = Class.forName(str);
            try {
                Object objNewInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                if (!(objNewInstance instanceof ImageAnalysisExternalSyntheticLambda2)) {
                    throw new RuntimeException("Expected instanceof GlideModule, but found: ".concat(String.valueOf(objNewInstance)));
                }
                return (ImageAnalysisExternalSyntheticLambda2) objNewInstance;
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Unable to instantiate GlideModule implementation for ".concat(String.valueOf(cls)), e2);
            } catch (InstantiationException e3) {
                throw new RuntimeException("Unable to instantiate GlideModule implementation for ".concat(String.valueOf(cls)), e3);
            } catch (NoSuchMethodException e4) {
                throw new RuntimeException("Unable to instantiate GlideModule implementation for ".concat(String.valueOf(cls)), e4);
            } catch (InvocationTargetException e5) {
                throw new RuntimeException("Unable to instantiate GlideModule implementation for ".concat(String.valueOf(cls)), e5);
            }
        } catch (ClassNotFoundException e6) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e6);
        }
    }
}
