package defpackage;

/* JADX INFO: loaded from: classes6.dex */
final class sendSurfaceRequest {
    final long TuitionPaymentFragmentbindingInflater1;
    final long TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public sendSurfaceRequest(long j, long j2) {
        this.TuitionPaymentFragmentbindingInflater1 = j;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sendSurfaceRequest)) {
            return false;
        }
        sendSurfaceRequest sendsurfacerequest = (sendSurfaceRequest) obj;
        return this.TuitionPaymentFragmentbindingInflater1 == sendsurfacerequest.TuitionPaymentFragmentbindingInflater1 && this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == sendsurfacerequest.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    public final int hashCode() {
        return (Long.hashCode(this.TuitionPaymentFragmentbindingInflater1) * 31) + Long.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public final String toString() {
        long j = this.TuitionPaymentFragmentbindingInflater1;
        long j2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        StringBuilder sb = new StringBuilder("Timing(startTime=");
        sb.append(j);
        sb.append(", duration=");
        sb.append(j2);
        sb.append(")");
        return sb.toString();
    }
}
