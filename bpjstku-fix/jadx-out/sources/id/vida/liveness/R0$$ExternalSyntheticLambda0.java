package id.vida.liveness;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class R0$$ExternalSyntheticLambda0 implements Runnable {
    public static int TuitionPaymentFragmentbindingInflater1;
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final /* synthetic */ R0 f$0;

    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = TuitionPaymentFragmentbindingInflater1;
        int i2 = i % 9968101;
        TuitionPaymentFragmentbindingInflater1 = i + 1;
        if (i2 != 0) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = iFreeMemory;
        return iFreeMemory;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f$0.e();
    }
}
