package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public abstract class getVideoStabilizationMode {
    private static final getVideoStabilizationMode TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new getVideoStabilizationMode() { // from class: getVideoStabilizationMode.4
        @Override // defpackage.getVideoStabilizationMode
        public final int b() {
            return 0;
        }

        @Override // defpackage.getVideoStabilizationMode
        public final getVideoStabilizationMode TuitionPaymentFragmentspecialinlinedviewModeldefault1(Comparable<?> comparable, Comparable<?> comparable2) {
            int iCompareTo = comparable.compareTo(comparable2);
            if (iCompareTo < 0) {
                return getVideoStabilizationMode.b;
            }
            return iCompareTo > 0 ? getVideoStabilizationMode.TuitionPaymentFragmentspecialinlinedviewModeldefault2 : getVideoStabilizationMode.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
    };
    private static final getVideoStabilizationMode b = new TuitionPaymentFragmentbindingInflater1(-1);
    private static final getVideoStabilizationMode TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new TuitionPaymentFragmentbindingInflater1(1);

    public abstract getVideoStabilizationMode TuitionPaymentFragmentspecialinlinedviewModeldefault1(Comparable<?> comparable, Comparable<?> comparable2);

    public abstract int b();

    /* synthetic */ getVideoStabilizationMode(byte b2) {
        this();
    }

    private getVideoStabilizationMode() {
    }

    public static getVideoStabilizationMode TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    static final class TuitionPaymentFragmentbindingInflater1 extends getVideoStabilizationMode {
        private int TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        @Override // defpackage.getVideoStabilizationMode
        public final getVideoStabilizationMode TuitionPaymentFragmentspecialinlinedviewModeldefault1(Comparable<?> comparable, Comparable<?> comparable2) {
            return this;
        }

        TuitionPaymentFragmentbindingInflater1(int i) {
            super((byte) 0);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i;
        }

        @Override // defpackage.getVideoStabilizationMode
        public final int b() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
    }
}
