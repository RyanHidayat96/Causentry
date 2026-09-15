package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public abstract class notifyOnOpenAvailableListener {
    private static final notifyOnOpenAvailableListener TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new notifyOnOpenAvailableListener() { // from class: notifyOnOpenAvailableListener.4
        @Override // defpackage.notifyOnOpenAvailableListener
        public final long b() {
            return System.nanoTime();
        }
    };

    public abstract long b();

    protected notifyOnOpenAvailableListener() {
    }

    public static notifyOnOpenAvailableListener TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }
}
