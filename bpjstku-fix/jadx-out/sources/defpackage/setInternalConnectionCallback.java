package defpackage;

import android.content.Context;
import com.bpjstku.R;

/* JADX INFO: loaded from: classes5.dex */
public final class setInternalConnectionCallback {
    public static String TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context context, long j) {
        String string = "";
        if (context != null) {
            long j2 = j / 1000;
            int i = (int) (j2 % 60);
            int i2 = (int) (j2 / 60);
            if (i2 > 1) {
                StringBuilder sb = new StringBuilder();
                sb.append(i2);
                sb.append(" ");
                sb.append(context.getString(R.string.minutes));
                string = sb.toString();
            } else if (i2 > 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i2);
                sb2.append(" ");
                sb2.append(context.getString(R.string.minute));
                string = sb2.toString();
            }
            if (i > 1) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(string);
                sb3.append(" ");
                sb3.append(i);
                sb3.append(" ");
                sb3.append(context.getString(R.string.seconds));
                return sb3.toString();
            }
            if (i > 0) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(string);
                sb4.append(" ");
                sb4.append(i);
                sb4.append(" ");
                sb4.append(context.getString(R.string.second));
                return sb4.toString();
            }
        }
        return string;
    }
}
