package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public class DeferrableSurfaces1 {
    public final float TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final float b;

    public DeferrableSurfaces1(float f, float f2) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof DeferrableSurfaces1)) {
            return false;
        }
        DeferrableSurfaces1 deferrableSurfaces1 = (DeferrableSurfaces1) obj;
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == deferrableSurfaces1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 && this.b == deferrableSurfaces1.b;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) * 31) + Float.floatToIntBits(this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        sb.append(',');
        sb.append(this.b);
        sb.append(')');
        return sb.toString();
    }

    public static void TuitionPaymentFragmentbindingInflater1(DeferrableSurfaces1[] deferrableSurfaces1Arr) {
        DeferrableSurfaces1 deferrableSurfaces1;
        DeferrableSurfaces1 deferrableSurfaces2;
        DeferrableSurfaces1 deferrableSurfaces3;
        float fTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(deferrableSurfaces1Arr[0], deferrableSurfaces1Arr[1]);
        float fTuitionPaymentFragmentbindingInflater2 = TuitionPaymentFragmentbindingInflater1(deferrableSurfaces1Arr[1], deferrableSurfaces1Arr[2]);
        float fTuitionPaymentFragmentbindingInflater3 = TuitionPaymentFragmentbindingInflater1(deferrableSurfaces1Arr[0], deferrableSurfaces1Arr[2]);
        if (fTuitionPaymentFragmentbindingInflater2 >= fTuitionPaymentFragmentbindingInflater1 && fTuitionPaymentFragmentbindingInflater2 >= fTuitionPaymentFragmentbindingInflater3) {
            deferrableSurfaces1 = deferrableSurfaces1Arr[0];
            deferrableSurfaces2 = deferrableSurfaces1Arr[1];
            deferrableSurfaces3 = deferrableSurfaces1Arr[2];
        } else if (fTuitionPaymentFragmentbindingInflater3 >= fTuitionPaymentFragmentbindingInflater2 && fTuitionPaymentFragmentbindingInflater3 >= fTuitionPaymentFragmentbindingInflater1) {
            deferrableSurfaces1 = deferrableSurfaces1Arr[1];
            deferrableSurfaces2 = deferrableSurfaces1Arr[0];
            deferrableSurfaces3 = deferrableSurfaces1Arr[2];
        } else {
            deferrableSurfaces1 = deferrableSurfaces1Arr[2];
            deferrableSurfaces2 = deferrableSurfaces1Arr[0];
            deferrableSurfaces3 = deferrableSurfaces1Arr[1];
        }
        float f = deferrableSurfaces1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        float f2 = deferrableSurfaces1.b;
        if (((deferrableSurfaces3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - f) * (deferrableSurfaces2.b - f2)) - ((deferrableSurfaces3.b - f2) * (deferrableSurfaces2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - f)) < 0.0f) {
            DeferrableSurfaces1 deferrableSurfaces4 = deferrableSurfaces3;
            deferrableSurfaces3 = deferrableSurfaces2;
            deferrableSurfaces2 = deferrableSurfaces4;
        }
        deferrableSurfaces1Arr[0] = deferrableSurfaces2;
        deferrableSurfaces1Arr[1] = deferrableSurfaces1;
        deferrableSurfaces1Arr[2] = deferrableSurfaces3;
    }

    public static float TuitionPaymentFragmentbindingInflater1(DeferrableSurfaces1 deferrableSurfaces1, DeferrableSurfaces1 deferrableSurfaces2) {
        float f = deferrableSurfaces1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        float f2 = deferrableSurfaces1.b;
        float f3 = f - deferrableSurfaces2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        float f4 = f2 - deferrableSurfaces2.b;
        return (float) Math.sqrt((f3 * f3) + (f4 * f4));
    }
}
