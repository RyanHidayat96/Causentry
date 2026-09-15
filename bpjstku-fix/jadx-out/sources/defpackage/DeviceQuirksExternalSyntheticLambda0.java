package defpackage;

import android.os.Process;
import com.bpjstku.presentation.util.WebviewFaqCustomActivity;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DeviceQuirksExternalSyntheticLambda0 implements Function1 {
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private /* synthetic */ WebviewFaqCustomActivity b;

    public /* synthetic */ DeviceQuirksExternalSyntheticLambda0(WebviewFaqCustomActivity webviewFaqCustomActivity) {
        this.b = webviewFaqCustomActivity;
    }

    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i2 = i % 8853311;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i + 1;
        if (i2 != 0) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
        int startUptimeMillis = (int) Process.getStartUptimeMillis();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = startUptimeMillis;
        return startUptimeMillis;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return WebviewFaqCustomActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b, (Throwable) obj);
    }
}
