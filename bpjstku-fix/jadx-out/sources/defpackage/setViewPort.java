package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class setViewPort {
    public final long TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final int b;

    public setViewPort(long j, int i) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = j;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            setViewPort setviewport = (setViewPort) obj;
            if (this.b == setviewport.b && this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == setviewport.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.b;
        long j = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        return (i * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MeasurementPoint{sequenceNumber=");
        sb.append(this.b);
        sb.append(", timestamp=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        sb.append('}');
        return sb.toString();
    }
}
