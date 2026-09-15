package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class addNonRepeatingSurface extends DeferrableSurfaces1 {
    public final float TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public addNonRepeatingSurface(float f, float f2, float f3) {
        this(f, f2, f3, 1);
    }

    private addNonRepeatingSurface(float f, float f2, float f3, int i) {
        super(f, f2);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = f3;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i;
    }

    public final addNonRepeatingSurface TuitionPaymentFragmentbindingInflater1(float f, float f2, float f3) {
        int i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i2 = i + 1;
        float f4 = i2;
        return new addNonRepeatingSurface(((i * this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) + f2) / f4, ((this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 * this.b) + f) / f4, ((this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 * this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) + f3) / f4, i2);
    }

    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(float f, float f2, float f3) {
        if (Math.abs(f2 - this.b) > f || Math.abs(f3 - this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) > f) {
            return false;
        }
        float fAbs = Math.abs(f - this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        return fAbs <= 1.0f || fAbs <= this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }
}
