package defpackage;

import android.view.View;
import com.bpjstku.databinding.ActivityVerifyOtpBinding;
import com.bpjstku.presentation.account.verify.AccountVerificationActivity;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class setDisplayShowTitleEnabled implements Function1 {
    private /* synthetic */ ActivityVerifyOtpBinding TuitionPaymentFragmentbindingInflater1;
    private /* synthetic */ AccountVerificationActivity TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public /* synthetic */ setDisplayShowTitleEnabled(AccountVerificationActivity accountVerificationActivity, ActivityVerifyOtpBinding activityVerifyOtpBinding) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = accountVerificationActivity;
        this.TuitionPaymentFragmentbindingInflater1 = activityVerifyOtpBinding;
    }

    public static /* synthetic */ void b() {
        ExecutedBy.b[0] = PreviewCapabilitiesImpl.b[0];
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return AccountVerificationActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, this.TuitionPaymentFragmentbindingInflater1, (View) obj);
    }
}
