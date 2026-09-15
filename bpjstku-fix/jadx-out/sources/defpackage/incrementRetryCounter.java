package defpackage;

import com.google.android.datatransport.runtime.backends.BackendResponse;

/* JADX INFO: loaded from: classes4.dex */
public final class incrementRetryCounter extends BackendResponse {
    private final long TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final BackendResponse.Status TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public incrementRetryCounter(BackendResponse.Status status, long j) {
        if (status == null) {
            throw new NullPointerException("Null status");
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = status;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = j;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendResponse
    public final BackendResponse.Status TuitionPaymentFragmentbindingInflater1() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendResponse
    public final long TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append(", nextRequestWaitMillis=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BackendResponse)) {
            return false;
        }
        BackendResponse backendResponse = (BackendResponse) obj;
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.equals(backendResponse.TuitionPaymentFragmentbindingInflater1()) && this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == backendResponse.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
    }

    public final int hashCode() {
        int iHashCode = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
        long j = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        return ((iHashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }
}
