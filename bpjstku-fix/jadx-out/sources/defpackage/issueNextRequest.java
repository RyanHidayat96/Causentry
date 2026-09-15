package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class issueNextRequest {
    public final ProcessingNodeExternalSyntheticLambda7 TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    public final byte[] b;

    public issueNextRequest(ProcessingNodeExternalSyntheticLambda7 processingNodeExternalSyntheticLambda7, byte[] bArr) {
        if (processingNodeExternalSyntheticLambda7 == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = processingNodeExternalSyntheticLambda7;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof issueNextRequest)) {
            return false;
        }
        issueNextRequest issuenextrequest = (issueNextRequest) obj;
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.equals(issuenextrequest.TuitionPaymentFragmentspecialinlinedviewModeldefault3)) {
            return Arrays.equals(this.b, issuenextrequest.b);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EncodedPayload{encoding=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append(", bytes=[...]}");
        return sb.toString();
    }
}
