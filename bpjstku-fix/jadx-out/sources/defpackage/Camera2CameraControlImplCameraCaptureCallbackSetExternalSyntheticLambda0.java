package defpackage;

import android.content.Context;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class Camera2CameraControlImplCameraCaptureCallbackSetExternalSyntheticLambda0 implements logToString {
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public static int b;
    private /* synthetic */ Function1 TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i2 = i % 5978826;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i + 1;
        if (i2 != 0) {
            return b;
        }
        int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenWidthDp;
        b = i3;
        return i3;
    }

    @Override // defpackage.logToString
    public final void accept(Object obj) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.invoke(obj);
    }
}
