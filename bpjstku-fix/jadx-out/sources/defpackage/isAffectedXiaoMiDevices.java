package defpackage;

import android.os.Process;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class isAffectedXiaoMiDevices implements logToString {
    public static int TuitionPaymentFragmentbindingInflater1;
    public static int b;
    private /* synthetic */ Function1 TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public /* synthetic */ isAffectedXiaoMiDevices(Function1 function1) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = function1;
    }

    public static int TuitionPaymentFragmentbindingInflater1() {
        int i = b;
        int i2 = i % 8327471;
        b = i + 1;
        if (i2 != 0) {
            return TuitionPaymentFragmentbindingInflater1;
        }
        int iMyUid = Process.myUid();
        TuitionPaymentFragmentbindingInflater1 = iMyUid;
        return iMyUid;
    }

    @Override // defpackage.logToString
    public final void accept(Object obj) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.invoke(obj);
    }
}
