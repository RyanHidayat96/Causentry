package defpackage;

/* JADX INFO: loaded from: classes6.dex */
final class RequestWithCallbackExternalSyntheticLambda1 extends TakePictureCallback {
    private final long TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    RequestWithCallbackExternalSyntheticLambda1(long j) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = j;
    }

    @Override // defpackage.TakePictureCallback
    public final long TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LogResponse{nextRequestWaitMillis=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof TakePictureCallback) && this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == ((TakePictureCallback) obj).TuitionPaymentFragmentspecialinlinedviewModeldefault1();
    }

    public final int hashCode() {
        long j = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        return ((int) (j ^ (j >>> 32))) ^ 1000003;
    }
}
