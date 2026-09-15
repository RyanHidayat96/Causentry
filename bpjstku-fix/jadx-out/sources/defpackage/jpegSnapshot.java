package defpackage;

import android.content.Context;
import com.midtrans.sdk.corekit.models.snap.EnabledPayment;
import com.midtrans.sdk.uikit.models.EnabledPayments;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class jpegSnapshot {
    private final String TuitionPaymentFragmentbindingInflater1 = "Back";
    private final Context TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final List<EnabledPayment> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public jpegSnapshot(Context context, EnabledPayments enabledPayments) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = context;
        ArrayList arrayList = new ArrayList();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = arrayList;
        if (enabledPayments != null) {
            arrayList.addAll(enabledPayments.enabledPayments);
        }
    }

    public final List<getCropRectOfReferenceAspectRatio> TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        ArrayList arrayList = new ArrayList();
        List<EnabledPayment> list = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (list != null && !list.isEmpty()) {
            for (EnabledPayment enabledPayment : this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                getCropRectOfReferenceAspectRatio getcroprectofreferenceaspectratioTuitionPaymentFragmentspecialinlinedviewModeldefault1 = intersectDynamicRangeBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, enabledPayment.getType(), enabledPayment.getStatus());
                if (getcroprectofreferenceaspectratioTuitionPaymentFragmentspecialinlinedviewModeldefault1 != null) {
                    arrayList.add(getcroprectofreferenceaspectratioTuitionPaymentFragmentspecialinlinedviewModeldefault1);
                }
            }
        }
        Collections.sort(arrayList, new onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
        return arrayList;
    }
}
