package defpackage;

import androidx.p002lifecycle.Observer;
import com.bpjstku.presentation.membership.forgotpassword.reset.ResetPasswordActivity;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class supportsAutoSizeText implements Observer {
    private /* synthetic */ ResetPasswordActivity TuitionPaymentFragmentbindingInflater1;

    public /* synthetic */ supportsAutoSizeText(ResetPasswordActivity resetPasswordActivity) {
        this.TuitionPaymentFragmentbindingInflater1 = resetPasswordActivity;
    }

    @Override // androidx.p002lifecycle.Observer
    public final void onChanged(Object obj) {
        ResetPasswordActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1, (VirtualCameraAdapter1) obj);
    }
}
