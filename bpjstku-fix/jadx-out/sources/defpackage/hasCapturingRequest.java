package defpackage;

import com.google.android.datatransport.Priority;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class hasCapturingRequest extends retryRequest {
    private final String TuitionPaymentFragmentbindingInflater1;
    private final Priority TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final byte[] b;

    /* synthetic */ hasCapturingRequest(String str, byte[] bArr, Priority priority, byte b) {
        this(str, bArr, priority);
    }

    private hasCapturingRequest(String str, byte[] bArr, Priority priority) {
        this.TuitionPaymentFragmentbindingInflater1 = str;
        this.b = bArr;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = priority;
    }

    @Override // defpackage.retryRequest
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return this.TuitionPaymentFragmentbindingInflater1;
    }

    @Override // defpackage.retryRequest
    public final byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return this.b;
    }

    @Override // defpackage.retryRequest
    public final Priority TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof retryRequest)) {
            return false;
        }
        retryRequest retryrequest = (retryRequest) obj;
        if (this.TuitionPaymentFragmentbindingInflater1.equals(retryrequest.TuitionPaymentFragmentspecialinlinedviewModeldefault2())) {
            return Arrays.equals(this.b, retryrequest instanceof hasCapturingRequest ? ((hasCapturingRequest) retryrequest).b : retryrequest.TuitionPaymentFragmentspecialinlinedviewModeldefault1()) && this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.equals(retryrequest.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.TuitionPaymentFragmentbindingInflater1.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b)) * 1000003) ^ this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 extends retryRequest.TuitionPaymentFragmentspecialinlinedviewModeldefault3 {
        private byte[] TuitionPaymentFragmentbindingInflater1;
        private String TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        Priority b;

        TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        }

        @Override // retryRequest.TuitionPaymentFragmentspecialinlinedviewModeldefault3
        public final retryRequest.TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentbindingInflater1(String str) {
            if (str == null) {
                throw new NullPointerException("Null backendName");
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str;
            return this;
        }

        @Override // retryRequest.TuitionPaymentFragmentspecialinlinedviewModeldefault3
        public final retryRequest.TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentbindingInflater1(byte[] bArr) {
            this.TuitionPaymentFragmentbindingInflater1 = bArr;
            return this;
        }

        @Override // retryRequest.TuitionPaymentFragmentspecialinlinedviewModeldefault3
        public final retryRequest.TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault2(Priority priority) {
            if (priority == null) {
                throw new NullPointerException("Null priority");
            }
            this.b = priority;
            return this;
        }

        @Override // retryRequest.TuitionPaymentFragmentspecialinlinedviewModeldefault3
        public final retryRequest TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            String string;
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                string = "";
            } else {
                string = " backendName";
            }
            if (this.b == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(string);
                sb.append(" priority");
                string = sb.toString();
            }
            if (!string.isEmpty()) {
                throw new IllegalStateException("Missing required properties:".concat(String.valueOf(string)));
            }
            return new hasCapturingRequest(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.TuitionPaymentFragmentbindingInflater1, this.b, (byte) 0);
        }
    }
}
