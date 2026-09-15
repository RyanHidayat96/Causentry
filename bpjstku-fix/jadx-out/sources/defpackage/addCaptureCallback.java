package defpackage;

import android.content.Context;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class addCaptureCallback implements Function1 {
    public static int TuitionPaymentFragmentbindingInflater1;
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private /* synthetic */ Camera2CameraControlImplExternalSyntheticLambda4 b;

    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i2 = i % 6863099;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i + 1;
        if (i2 != 0) {
            return TuitionPaymentFragmentbindingInflater1;
        }
        int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().orientation;
        TuitionPaymentFragmentbindingInflater1 = i3;
        return i3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return Camera2CameraControlImplExternalSyntheticLambda4.notify(this.b, (Throwable) obj);
    }
}
