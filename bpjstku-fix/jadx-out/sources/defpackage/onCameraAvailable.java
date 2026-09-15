package defpackage;

import android.os.Process;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class onCameraAvailable implements Function1 {
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    public static int b;
    private /* synthetic */ Camera2CameraImplExternalSyntheticLambda3 TuitionPaymentFragmentbindingInflater1;

    public /* synthetic */ onCameraAvailable(Camera2CameraImplExternalSyntheticLambda3 camera2CameraImplExternalSyntheticLambda3) {
        this.TuitionPaymentFragmentbindingInflater1 = camera2CameraImplExternalSyntheticLambda3;
    }

    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i2 = i % 6479768;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i + 1;
        if (i2 != 0) {
            return b;
        }
        int iMyPid = Process.myPid();
        b = iMyPid;
        return iMyPid;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return Camera2CameraImplExternalSyntheticLambda3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1, (VirtualCameraAdapter1) obj);
    }
}
