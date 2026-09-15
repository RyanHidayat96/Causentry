package defpackage;

import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;

/* JADX INFO: loaded from: classes6.dex */
final class createImageInfo extends NetworkConnectionInfo {
    private final NetworkConnectionInfo.MobileSubtype TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final NetworkConnectionInfo.NetworkType TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* synthetic */ createImageInfo(NetworkConnectionInfo.NetworkType networkType, NetworkConnectionInfo.MobileSubtype mobileSubtype, byte b) {
        this(networkType, mobileSubtype);
    }

    private createImageInfo(NetworkConnectionInfo.NetworkType networkType, NetworkConnectionInfo.MobileSubtype mobileSubtype) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = networkType;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = mobileSubtype;
    }

    @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo
    public final NetworkConnectionInfo.NetworkType TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo
    public final NetworkConnectionInfo.MobileSubtype TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkConnectionInfo{networkType=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append(", mobileSubtype=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NetworkConnectionInfo)) {
            return false;
        }
        NetworkConnectionInfo networkConnectionInfo = (NetworkConnectionInfo) obj;
        NetworkConnectionInfo.NetworkType networkType = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (networkType == null) {
            if (networkConnectionInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1() != null) {
                return false;
            }
        } else if (!networkType.equals(networkConnectionInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1())) {
            return false;
        }
        NetworkConnectionInfo.MobileSubtype mobileSubtype = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (mobileSubtype == null) {
            if (networkConnectionInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3() != null) {
                return false;
            }
        } else if (!mobileSubtype.equals(networkConnectionInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        NetworkConnectionInfo.NetworkType networkType = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int iHashCode = networkType == null ? 0 : networkType.hashCode();
        NetworkConnectionInfo.MobileSubtype mobileSubtype = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        return ((iHashCode ^ 1000003) * 1000003) ^ (mobileSubtype != null ? mobileSubtype.hashCode() : 0);
    }

    public static final class TuitionPaymentFragmentbindingInflater1 extends NetworkConnectionInfo.b {
        private NetworkConnectionInfo.NetworkType TuitionPaymentFragmentbindingInflater1;
        private NetworkConnectionInfo.MobileSubtype TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo.b
        public final NetworkConnectionInfo.b TuitionPaymentFragmentbindingInflater1(NetworkConnectionInfo.NetworkType networkType) {
            this.TuitionPaymentFragmentbindingInflater1 = networkType;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo.b
        public final NetworkConnectionInfo.b TuitionPaymentFragmentspecialinlinedviewModeldefault3(NetworkConnectionInfo.MobileSubtype mobileSubtype) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = mobileSubtype;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo.b
        public final NetworkConnectionInfo TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            return new createImageInfo(this.TuitionPaymentFragmentbindingInflater1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (byte) 0);
        }
    }
}
