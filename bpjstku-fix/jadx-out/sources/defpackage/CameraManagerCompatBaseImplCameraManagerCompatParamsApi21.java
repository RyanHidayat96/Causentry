package defpackage;

import android.os.Process;
import com.bpjstku.presentation.tuition.TuitionPaymentCodeActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class CameraManagerCompatBaseImplCameraManagerCompatParamsApi21 implements Function0 {
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public static int b;
    private /* synthetic */ TuitionPaymentCodeActivity TuitionPaymentFragmentbindingInflater1;

    public /* synthetic */ CameraManagerCompatBaseImplCameraManagerCompatParamsApi21(TuitionPaymentCodeActivity tuitionPaymentCodeActivity) {
        this.TuitionPaymentFragmentbindingInflater1 = tuitionPaymentCodeActivity;
    }

    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = b;
        int i2 = i % 9177188;
        b = i + 1;
        if (i2 != 0) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
        int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = startElapsedRealtime;
        return startElapsedRealtime;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return TuitionPaymentCodeActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1);
    }
}
