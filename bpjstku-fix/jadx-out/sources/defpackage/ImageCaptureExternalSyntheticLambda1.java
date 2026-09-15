package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class ImageCaptureExternalSyntheticLambda1 {
    final long TuitionPaymentFragmentbindingInflater1;
    final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    final long TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public ImageCaptureExternalSyntheticLambda1(long j, boolean z, long j2) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = j;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = z;
        this.TuitionPaymentFragmentbindingInflater1 = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageCaptureExternalSyntheticLambda1)) {
            return false;
        }
        ImageCaptureExternalSyntheticLambda1 imageCaptureExternalSyntheticLambda1 = (ImageCaptureExternalSyntheticLambda1) obj;
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == imageCaptureExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault3 && this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == imageCaptureExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 && this.TuitionPaymentFragmentbindingInflater1 == imageCaptureExternalSyntheticLambda1.TuitionPaymentFragmentbindingInflater1;
    }

    public final int hashCode() {
        return (((Long.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) * 31) + Boolean.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2)) * 31) + Long.hashCode(this.TuitionPaymentFragmentbindingInflater1);
    }

    public final String toString() {
        long j = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        boolean z = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        long j2 = this.TuitionPaymentFragmentbindingInflater1;
        StringBuilder sb = new StringBuilder("BatchClosedMetadata(lastTimeWasUsedInMs=");
        sb.append(j);
        sb.append(", forcedNew=");
        sb.append(z);
        sb.append(", eventsCount=");
        sb.append(j2);
        sb.append(")");
        return sb.toString();
    }
}
