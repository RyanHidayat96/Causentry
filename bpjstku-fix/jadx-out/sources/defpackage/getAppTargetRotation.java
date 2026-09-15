package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class getAppTargetRotation {
    public static final getAppTargetRotation TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new getAppTargetRotation(new TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 0);
    public final int TuitionPaymentFragmentbindingInflater1;
    public final int b;

    public static class TuitionPaymentFragmentspecialinlinedviewModeldefault2 {
        int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 360;
        int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 600;
    }

    /* synthetic */ getAppTargetRotation(TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2, byte b) {
        this(tuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    private getAppTargetRotation(TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2) {
        this.TuitionPaymentFragmentbindingInflater1 = tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        this.b = tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    public static TuitionPaymentFragmentspecialinlinedviewModeldefault2 b() {
        return new TuitionPaymentFragmentspecialinlinedviewModeldefault2();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            getAppTargetRotation getapptargetrotation = (getAppTargetRotation) obj;
            if (this.TuitionPaymentFragmentbindingInflater1 == getapptargetrotation.TuitionPaymentFragmentbindingInflater1 && this.b == getapptargetrotation.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.TuitionPaymentFragmentbindingInflater1 * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionSplitConfiguration{maxSessionDuration=");
        sb.append(this.TuitionPaymentFragmentbindingInflater1);
        sb.append(", inactivityTimeout=");
        sb.append(this.b);
        sb.append('}');
        return sb.toString();
    }
}
