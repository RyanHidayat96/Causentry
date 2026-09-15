package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public abstract class TransformExperimental<T> {
    public static int TuitionPaymentFragmentbindingInflater1;
    public static int b;
    protected final accesssetAnchoredZoomModep TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = TuitionPaymentFragmentbindingInflater1;
        int i2 = i % 8933412;
        TuitionPaymentFragmentbindingInflater1 = i + 1;
        if (i2 != 0) {
            return b;
        }
        int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().keyboardHidden;
        b = i3;
        return i3;
    }
}
