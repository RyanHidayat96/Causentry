package defpackage;

/* JADX INFO: loaded from: classes6.dex */
final class lambdanew1androidxcameracoreimagecaptureRequestWithCallback extends RgbaImageProxy {
    private final Integer TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* synthetic */ lambdanew1androidxcameracoreimagecaptureRequestWithCallback(Integer num, byte b) {
        this(num);
    }

    private lambdanew1androidxcameracoreimagecaptureRequestWithCallback(Integer num) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = num;
    }

    @Override // defpackage.RgbaImageProxy
    public final Integer TuitionPaymentFragmentbindingInflater1() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExternalPRequestContext{originAssociatedProductId=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RgbaImageProxy)) {
            return false;
        }
        Integer num = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Integer numTuitionPaymentFragmentbindingInflater1 = ((RgbaImageProxy) obj).TuitionPaymentFragmentbindingInflater1();
        if (num == null) {
            return numTuitionPaymentFragmentbindingInflater1 == null;
        }
        return num.equals(numTuitionPaymentFragmentbindingInflater1);
    }

    public final int hashCode() {
        Integer num = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 extends RgbaImageProxy.TuitionPaymentFragmentbindingInflater1 {
        private Integer b;

        @Override // RgbaImageProxy.TuitionPaymentFragmentbindingInflater1
        public final RgbaImageProxy.TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentspecialinlinedviewModeldefault1(Integer num) {
            this.b = num;
            return this;
        }

        @Override // RgbaImageProxy.TuitionPaymentFragmentbindingInflater1
        public final RgbaImageProxy TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            return new lambdanew1androidxcameracoreimagecaptureRequestWithCallback(this.b, (byte) 0);
        }
    }
}
