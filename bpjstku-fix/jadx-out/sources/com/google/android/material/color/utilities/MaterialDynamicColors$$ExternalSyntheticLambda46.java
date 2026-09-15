package com.google.android.material.color.utilities;

import android.content.Context;
import java.util.function.Function;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class MaterialDynamicColors$$ExternalSyntheticLambda46 implements Function {
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i2 = i % 7078087;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i + 1;
        if (i2 != 0) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }
        int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().keyboardHidden;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        return i3;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return MaterialDynamicColors.lambda$onErrorContainer$101((DynamicScheme) obj);
    }
}
