package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.core.content.ContextCompat;
import androidx.p002lifecycle.Lifecycle;
import androidx.p002lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes.dex */
public final class getLaunchPendingIntent {
    public static final Lifecycle TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context context) {
        Object baseContext = context;
        while (!(baseContext instanceof LifecycleOwner)) {
            if (!(baseContext instanceof ContextWrapper)) {
                return null;
            }
            baseContext = ((ContextWrapper) baseContext).getBaseContext();
        }
        return ((LifecycleOwner) baseContext).getLifecycle();
    }

    public static final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context context, String str) {
        return ContextCompat.checkSelfPermission(context, str) == 0;
    }
}
