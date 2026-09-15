package defpackage;

import android.content.Context;
import com.midtrans.sdk.corekit.models.snap.EnabledPayment;
import com.midtrans.sdk.uikit.models.EnabledPayments;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class removeDuplicates {
    private final String TuitionPaymentFragmentbindingInflater1 = "Back";
    private final List<EnabledPayment> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final Context TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public removeDuplicates(Context context, EnabledPayments enabledPayments) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = context;
        ArrayList arrayList = new ArrayList();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = arrayList;
        if (enabledPayments != null) {
            arrayList.addAll(enabledPayments.enabledPayments);
        }
    }

    public final List<getChildrenRequiredResolutions> b() {
        ArrayList arrayList = new ArrayList();
        List<EnabledPayment> list = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (list != null && !list.isEmpty()) {
            for (EnabledPayment enabledPayment : this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                getChildrenRequiredResolutions getchildrenrequiredresolutionsTuitionPaymentFragmentspecialinlinedviewModeldefault2 = intersectDynamicRangeBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, enabledPayment.getType(), enabledPayment.getStatus());
                if (getchildrenrequiredresolutionsTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                    arrayList.add(getchildrenrequiredresolutionsTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                }
            }
        }
        Collections.sort(arrayList, new onConnectionFailed.TuitionPaymentFragmentbindingInflater1());
        return arrayList;
    }
}
