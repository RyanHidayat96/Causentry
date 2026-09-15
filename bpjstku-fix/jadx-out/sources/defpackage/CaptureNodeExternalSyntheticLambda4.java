package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class CaptureNodeExternalSyntheticLambda4 {
    public final CaptureNodeExternalSyntheticLambda5 TuitionPaymentFragmentbindingInflater1;
    public final CaptureNodeExternalSyntheticLambda5 TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public CaptureNodeExternalSyntheticLambda4(CaptureNodeExternalSyntheticLambda5 captureNodeExternalSyntheticLambda5, CaptureNodeExternalSyntheticLambda5 captureNodeExternalSyntheticLambda6) {
        this.TuitionPaymentFragmentbindingInflater1 = captureNodeExternalSyntheticLambda5;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = captureNodeExternalSyntheticLambda6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CaptureNodeExternalSyntheticLambda4 captureNodeExternalSyntheticLambda4 = (CaptureNodeExternalSyntheticLambda4) obj;
        return this.TuitionPaymentFragmentbindingInflater1.equals(captureNodeExternalSyntheticLambda4.TuitionPaymentFragmentbindingInflater1) && this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.equals(captureNodeExternalSyntheticLambda4.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public final int hashCode() {
        return (this.TuitionPaymentFragmentbindingInflater1.hashCode() * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TapData{tapDown=");
        sb.append(this.TuitionPaymentFragmentbindingInflater1);
        sb.append(", tapUp=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append('}');
        return sb.toString();
    }
}
