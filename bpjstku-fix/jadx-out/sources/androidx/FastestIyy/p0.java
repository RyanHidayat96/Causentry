package androidx.FastestIyy;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public abstract class p0 {
    public static void a(Context context) {
        T t;
        if (T.d == null) {
            synchronized (i0.class) {
                if (T.d == null) {
                    T.d = new T();
                }
                t = T.d;
            }
            t.d(context);
        }
        Z.a(context);
        O.a(context);
        k0.a(context);
        o0.a(context);
        d0.b();
    }
}
