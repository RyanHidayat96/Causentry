package defpackage;

import android.os.Process;
import com.bpjstku.presentation.membership.registration.RegistrationVerifyPhoneOtpActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class getTextOn implements Function0 {
    public static int TuitionPaymentFragmentbindingInflater1;
    public static int b;
    private /* synthetic */ RegistrationVerifyPhoneOtpActivity TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public /* synthetic */ getTextOn(RegistrationVerifyPhoneOtpActivity registrationVerifyPhoneOtpActivity) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = registrationVerifyPhoneOtpActivity;
    }

    public static int TuitionPaymentFragmentbindingInflater1() {
        int i = TuitionPaymentFragmentbindingInflater1;
        int i2 = i % 5500570;
        TuitionPaymentFragmentbindingInflater1 = i + 1;
        if (i2 != 0) {
            return b;
        }
        int iMyPid = Process.myPid();
        b = iMyPid;
        return iMyPid;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return RegistrationVerifyPhoneOtpActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }
}
