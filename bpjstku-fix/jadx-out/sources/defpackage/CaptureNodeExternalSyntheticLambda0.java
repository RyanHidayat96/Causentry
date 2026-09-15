package defpackage;

import java.lang.Enum;

/* JADX INFO: loaded from: classes4.dex */
public final class CaptureNodeExternalSyntheticLambda0<T extends Enum<T>> {
    public final long TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final T TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public CaptureNodeExternalSyntheticLambda0(T t, setViewPort setviewport) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = t;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = setviewport.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = setviewport.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            CaptureNodeExternalSyntheticLambda0 captureNodeExternalSyntheticLambda0 = (CaptureNodeExternalSyntheticLambda0) obj;
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == captureNodeExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 && this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == captureNodeExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 && this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == captureNodeExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode();
        long j = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        return (((iHashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LifecycleEvent{eventType=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        sb.append(", timestamp=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        sb.append(", sequenceNumber=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append('}');
        return sb.toString();
    }
}
