package defpackage;

import androidx.p002lifecycle.Observer;
import com.bpjstku.presentation.partner.PartnerActivity;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ensureBundleContains implements Observer {
    private /* synthetic */ PartnerActivity TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    public /* synthetic */ ensureBundleContains(PartnerActivity partnerActivity) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = partnerActivity;
    }

    @Override // androidx.p002lifecycle.Observer
    public final void onChanged(Object obj) {
        PartnerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (VirtualCameraAdapter1) obj);
    }
}
