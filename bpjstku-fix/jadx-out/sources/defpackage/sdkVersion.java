package defpackage;

import android.os.Build;
import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public final class sdkVersion {
    public static String TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        String string = sb.toString();
        return string.length() > 23 ? string.substring(0, 23) : string;
    }

    public static void TuitionPaymentFragmentbindingInflater1(String str, Object obj) {
        if (Log.isLoggable(Build.VERSION.SDK_INT < 26 ? TuitionPaymentFragmentspecialinlinedviewModeldefault3("TRuntime.", str) : "TRuntime.".concat(String.valueOf(str)), 3)) {
            new Object[]{obj};
        }
    }
}
