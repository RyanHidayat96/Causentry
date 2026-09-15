package defpackage;

import android.app.Application;
import android.os.Build;

/* JADX INFO: loaded from: classes4.dex */
public final class getImageCaptureException {
    public static String TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        if (Build.VERSION.SDK_INT >= 28) {
            return Application.getProcessName();
        }
        try {
            return (String) Class.forName("android.app.ActivityThread").getMethod("currentProcessName", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
