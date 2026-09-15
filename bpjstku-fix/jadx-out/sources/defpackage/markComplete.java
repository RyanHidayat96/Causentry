package defpackage;

import com.google.android.datatransport.cct.internal.ComplianceData;

/* JADX INFO: loaded from: classes6.dex */
final class markComplete extends ComplianceData {
    private final ComplianceData.ProductIdOrigin TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final submitCameraRequest TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* synthetic */ markComplete(submitCameraRequest submitcamerarequest, ComplianceData.ProductIdOrigin productIdOrigin, byte b) {
        this(submitcamerarequest, productIdOrigin);
    }

    private markComplete(submitCameraRequest submitcamerarequest, ComplianceData.ProductIdOrigin productIdOrigin) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = submitcamerarequest;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = productIdOrigin;
    }

    @Override // com.google.android.datatransport.cct.internal.ComplianceData
    public final submitCameraRequest b() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    @Override // com.google.android.datatransport.cct.internal.ComplianceData
    public final ComplianceData.ProductIdOrigin TuitionPaymentFragmentbindingInflater1() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ComplianceData{privacyContext=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append(", productIdOrigin=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ComplianceData)) {
            return false;
        }
        ComplianceData complianceData = (ComplianceData) obj;
        submitCameraRequest submitcamerarequest = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (submitcamerarequest == null) {
            if (complianceData.b() != null) {
                return false;
            }
        } else if (!submitcamerarequest.equals(complianceData.b())) {
            return false;
        }
        ComplianceData.ProductIdOrigin productIdOrigin = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (productIdOrigin == null) {
            if (complianceData.TuitionPaymentFragmentbindingInflater1() != null) {
                return false;
            }
        } else if (!productIdOrigin.equals(complianceData.TuitionPaymentFragmentbindingInflater1())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        submitCameraRequest submitcamerarequest = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int iHashCode = submitcamerarequest == null ? 0 : submitcamerarequest.hashCode();
        ComplianceData.ProductIdOrigin productIdOrigin = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        return ((iHashCode ^ 1000003) * 1000003) ^ (productIdOrigin != null ? productIdOrigin.hashCode() : 0);
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 extends ComplianceData.TuitionPaymentFragmentspecialinlinedviewModeldefault1 {
        private submitCameraRequest TuitionPaymentFragmentbindingInflater1;
        private ComplianceData.ProductIdOrigin TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        @Override // com.google.android.datatransport.cct.internal.ComplianceData.TuitionPaymentFragmentspecialinlinedviewModeldefault1
        public final ComplianceData.TuitionPaymentFragmentspecialinlinedviewModeldefault1 TuitionPaymentFragmentspecialinlinedviewModeldefault2(submitCameraRequest submitcamerarequest) {
            this.TuitionPaymentFragmentbindingInflater1 = submitcamerarequest;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.ComplianceData.TuitionPaymentFragmentspecialinlinedviewModeldefault1
        public final ComplianceData.TuitionPaymentFragmentspecialinlinedviewModeldefault1 b(ComplianceData.ProductIdOrigin productIdOrigin) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = productIdOrigin;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.ComplianceData.TuitionPaymentFragmentspecialinlinedviewModeldefault1
        public final ComplianceData TuitionPaymentFragmentbindingInflater1() {
            return new markComplete(this.TuitionPaymentFragmentbindingInflater1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (byte) 0);
        }
    }
}
