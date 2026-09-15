package defpackage;

import android.os.Process;
import com.bpjstku.domain.general.model.CodeNamePair;
import com.bpjstku.presentation.partner.PartnerFilterActivity;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wrapCallback implements Function1 {
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private /* synthetic */ PartnerFilterActivity TuitionPaymentFragmentbindingInflater1;

    public /* synthetic */ wrapCallback(PartnerFilterActivity partnerFilterActivity) {
        this.TuitionPaymentFragmentbindingInflater1 = partnerFilterActivity;
    }

    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i2 = i % 6045708;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i + 1;
        if (i2 != 0) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
        int iMyTid = Process.myTid();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = iMyTid;
        return iMyTid;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return PartnerFilterActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentbindingInflater1, (CodeNamePair) obj);
    }
}
