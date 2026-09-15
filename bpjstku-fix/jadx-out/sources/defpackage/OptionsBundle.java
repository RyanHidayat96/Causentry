package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class OptionsBundle extends MutableTagBundle {
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f190a;
    int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    final OptionsBundleExternalSyntheticLambda0 b;

    OptionsBundle(int i, int i2, OptionsBundleExternalSyntheticLambda0 optionsBundleExternalSyntheticLambda0) {
        super(i, i2);
        this.b = optionsBundleExternalSyntheticLambda0;
    }

    public static int b() {
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i2 = i % 9243621;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i + 1;
        if (i2 != 0) {
            return f190a;
        }
        int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().densityDpi;
        f190a = i3;
        return i3;
    }
}
