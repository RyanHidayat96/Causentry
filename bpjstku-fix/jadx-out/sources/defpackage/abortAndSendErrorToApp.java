package defpackage;

import com.google.android.datatransport.cct.internal.ClientInfo;

/* JADX INFO: loaded from: classes6.dex */
final class abortAndSendErrorToApp extends ClientInfo {
    private final onProcessFailure TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final ClientInfo.ClientType TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* synthetic */ abortAndSendErrorToApp(ClientInfo.ClientType clientType, onProcessFailure onprocessfailure, byte b) {
        this(clientType, onprocessfailure);
    }

    private abortAndSendErrorToApp(ClientInfo.ClientType clientType, onProcessFailure onprocessfailure) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = clientType;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = onprocessfailure;
    }

    @Override // com.google.android.datatransport.cct.internal.ClientInfo
    public final ClientInfo.ClientType b() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    @Override // com.google.android.datatransport.cct.internal.ClientInfo
    public final onProcessFailure TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClientInfo{clientType=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append(", androidClientInfo=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientInfo)) {
            return false;
        }
        ClientInfo clientInfo = (ClientInfo) obj;
        ClientInfo.ClientType clientType = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (clientType == null) {
            if (clientInfo.b() != null) {
                return false;
            }
        } else if (!clientType.equals(clientInfo.b())) {
            return false;
        }
        onProcessFailure onprocessfailure = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (onprocessfailure == null) {
            if (clientInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2() != null) {
                return false;
            }
        } else if (!onprocessfailure.equals(clientInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        ClientInfo.ClientType clientType = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int iHashCode = clientType == null ? 0 : clientType.hashCode();
        onProcessFailure onprocessfailure = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        return ((iHashCode ^ 1000003) * 1000003) ^ (onprocessfailure != null ? onprocessfailure.hashCode() : 0);
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 extends ClientInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3 {
        private onProcessFailure TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private ClientInfo.ClientType b;

        @Override // com.google.android.datatransport.cct.internal.ClientInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3
        public final ClientInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault1(ClientInfo.ClientType clientType) {
            this.b = clientType;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.ClientInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3
        public final ClientInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault1(onProcessFailure onprocessfailure) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = onprocessfailure;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.ClientInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3
        public final ClientInfo TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            return new abortAndSendErrorToApp(this.b, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (byte) 0);
        }
    }
}
