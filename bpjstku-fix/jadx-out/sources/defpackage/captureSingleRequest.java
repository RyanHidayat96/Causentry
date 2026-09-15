package defpackage;

import android.content.Context;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class captureSingleRequest implements Function1 {
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    public static int b;
    private /* synthetic */ generateUltraHdrSupportedCombinationList TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private /* synthetic */ isBurstCaptureSupported TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public /* synthetic */ captureSingleRequest(isBurstCaptureSupported isburstcapturesupported, generateUltraHdrSupportedCombinationList generateultrahdrsupportedcombinationlist) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = isburstcapturesupported;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = generateultrahdrsupportedcombinationlist;
    }

    public static int b() {
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i2 = i % 9283111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i + 1;
        if (i2 != 0) {
            return b;
        }
        int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenHeightDp;
        b = i3;
        return i3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return isBurstCaptureSupported.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (VirtualCameraAdapter1) obj);
    }
}
