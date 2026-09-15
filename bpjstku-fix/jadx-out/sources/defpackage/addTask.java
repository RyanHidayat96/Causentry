package defpackage;

import com.bpjstku.presentation.program.jht.olddaysecurity.evidence.ReceiptClaimOldDaySecurityActivity;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class addTask implements Function1 {
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    public static int b;
    private /* synthetic */ ReceiptClaimOldDaySecurityActivity TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    public /* synthetic */ addTask(ReceiptClaimOldDaySecurityActivity receiptClaimOldDaySecurityActivity) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = receiptClaimOldDaySecurityActivity;
    }

    public static int TuitionPaymentFragmentbindingInflater1() {
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i2 = i % 6525949;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i + 1;
        if (i2 != 0) {
            return b;
        }
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        b = iFreeMemory;
        return iFreeMemory;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ReceiptClaimOldDaySecurityActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (Boolean) obj);
    }
}
