package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambda1GtIzncz4245_HpTJbEZFoVqMQY extends ProcessCameraProviderconfigureInstanceInternal111 {
    public static int asBinder;
    public static int g;
    public int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public int TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1331a;
    public int b;

    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = g;
        int i2 = i % 7662896;
        g = i + 1;
        if (i2 != 0) {
            return asBinder;
        }
        int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().mcc;
        asBinder = i3;
        return i3;
    }
}
