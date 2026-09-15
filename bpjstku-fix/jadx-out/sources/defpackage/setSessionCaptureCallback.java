package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.provider.Settings;
import androidx.core.os.EnvironmentCompat;
import com.google.android.gms.internal.measurement.zzip;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\b"}, d2 = {"LsetSessionCaptureCallback;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "b", "(Landroid/content/Context;)Ljava/lang/String;", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class setSessionCaptureCallback {
    public static final setSessionCaptureCallback INSTANCE = new setSessionCaptureCallback();

    private setSessionCaptureCallback() {
    }

    public static String b(Context p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        String string = Settings.Secure.getString(p0.getContentResolver(), "android_id");
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static String b() {
        String str = Build.MANUFACTURER;
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    public static String TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        String str = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    public final String TuitionPaymentFragmentbindingInflater1(Context p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        try {
            PackageManager packageManager = p0.getPackageManager();
            String packageName = p0.getPackageName();
            int iIntValue = ((Integer) Class.forName("java.lang.System").getMethod("identityHashCode", Object.class).invoke(null, this)).intValue();
            if (zzip.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new ArrayList()) != 0) {
                throw new RuntimeException(String.valueOf(iIntValue));
            }
            String str = packageManager.getPackageInfo(packageName, 0).versionName;
            return str == null ? EnvironmentCompat.MEDIA_UNKNOWN : str;
        } catch (Exception unused) {
            return EnvironmentCompat.MEDIA_UNKNOWN;
        }
    }
}
