package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class onValidImageAvailable {
    private final long TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final long TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final long TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    public final long b;

    public onValidImageAvailable(long j, long j2, long j3, long j4) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = j;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = j2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = j3;
        this.b = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onValidImageAvailable)) {
            return false;
        }
        onValidImageAvailable onvalidimageavailable = (onValidImageAvailable) obj;
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == onvalidimageavailable.TuitionPaymentFragmentspecialinlinedviewModeldefault3 && this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == onvalidimageavailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1 && this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == onvalidimageavailable.TuitionPaymentFragmentspecialinlinedviewModeldefault2 && this.b == onvalidimageavailable.b;
    }

    public final int hashCode() {
        return (((((Long.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) * 31) + Long.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) * 31) + Long.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2)) * 31) + Long.hashCode(this.b);
    }

    public final String toString() {
        long j = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        long j2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        long j3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        long j4 = this.b;
        StringBuilder sb = new StringBuilder("TimeInfo(deviceTimeNs=");
        sb.append(j);
        sb.append(", serverTimeNs=");
        sb.append(j2);
        sb.append(", serverTimeOffsetNs=");
        sb.append(j3);
        sb.append(", serverTimeOffsetMs=");
        sb.append(j4);
        sb.append(")");
        return sb.toString();
    }
}
