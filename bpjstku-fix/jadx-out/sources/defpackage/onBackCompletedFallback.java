package defpackage;

import android.os.Process;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class onBackCompletedFallback implements readableMs {
    public static int TuitionPaymentFragmentbindingInflater1;
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private /* synthetic */ Function1 TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    public /* synthetic */ onBackCompletedFallback(Function1 function1) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = function1;
    }

    public static int b() {
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i2 = i % 7624507;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i + 1;
        if (i2 != 0) {
            return TuitionPaymentFragmentbindingInflater1;
        }
        int iMyPid = Process.myPid();
        TuitionPaymentFragmentbindingInflater1 = iMyPid;
        return iMyPid;
    }

    @Override // defpackage.readableMs
    public final Object apply(Object obj) {
        return dispatcherlambda0.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, obj);
    }
}
