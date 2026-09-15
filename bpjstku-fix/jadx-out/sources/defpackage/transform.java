package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class transform {
    public final CaptureNodeExternalSyntheticLambda4 TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final CaptureNodeExternalSyntheticLambda4 TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final int b;

    public transform(CaptureNodeExternalSyntheticLambda4 captureNodeExternalSyntheticLambda4, CaptureNodeExternalSyntheticLambda4 captureNodeExternalSyntheticLambda5, int i) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = captureNodeExternalSyntheticLambda4;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = captureNodeExternalSyntheticLambda5;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        transform transformVar = (transform) obj;
        return this.b == transformVar.b && this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.equals(transformVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.equals(transformVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    public final int hashCode() {
        return (((this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode() * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode()) * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RageTap{firstTap=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        sb.append(", lastTap=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        sb.append(", numOfTaps=");
        sb.append(this.b);
        sb.append('}');
        return sb.toString();
    }
}
