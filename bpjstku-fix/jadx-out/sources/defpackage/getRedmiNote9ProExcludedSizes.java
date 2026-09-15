package defpackage;

import androidx.p002lifecycle.Observer;
import com.bpjstku.presentation.vocational.VocationalCheckEligibilityActivity;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class getRedmiNote9ProExcludedSizes implements Observer {
    private /* synthetic */ VocationalCheckEligibilityActivity b;

    public /* synthetic */ getRedmiNote9ProExcludedSizes(VocationalCheckEligibilityActivity vocationalCheckEligibilityActivity) {
        this.b = vocationalCheckEligibilityActivity;
    }

    @Override // androidx.p002lifecycle.Observer
    public final void onChanged(Object obj) {
        VocationalCheckEligibilityActivity.TuitionPaymentFragmentbindingInflater1(this.b, (VirtualCameraAdapter1) obj);
    }
}
