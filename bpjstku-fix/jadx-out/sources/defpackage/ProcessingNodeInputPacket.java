package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ProcessingNodeInputPacket extends ProcessingNodeIn {
    private final Integer TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public ProcessingNodeInputPacket(Integer num) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = num;
    }

    @Override // defpackage.ProcessingNodeIn
    public final Integer TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProductData{productId=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProcessingNodeIn)) {
            return false;
        }
        Integer num = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        Integer numTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ((ProcessingNodeIn) obj).TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        if (num == null) {
            return numTuitionPaymentFragmentspecialinlinedviewModeldefault2 == null;
        }
        return num.equals(numTuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    public final int hashCode() {
        Integer num = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }
}
