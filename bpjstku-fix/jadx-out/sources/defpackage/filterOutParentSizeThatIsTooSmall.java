package defpackage;

import com.midtrans.sdk.corekit.core.MidtransSDK;
import defpackage.getCameraSupportedResolutions;

/* JADX INFO: loaded from: classes4.dex */
public class filterOutParentSizeThatIsTooSmall<V extends getCameraSupportedResolutions> {
    public V TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public String TuitionPaymentFragmentspecialinlinedviewModeldefault3 = getClass().getSimpleName();
    private volatile MidtransSDK TuitionPaymentFragmentspecialinlinedviewModeldefault2 = MidtransSDK.getInstance();

    public final MidtransSDK b() {
        V v;
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = MidtransSDK.getInstance();
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.isSdkNotAvailable() && (v = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) != null) {
                v.TuitionPaymentFragmentbindingInflater1();
            }
        }
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }
}
