package defpackage;

import com.google.zxing.NotFoundException;

/* JADX INFO: loaded from: classes6.dex */
final class Quirks {
    DeferrableSurfaces1 TuitionPaymentFragmentbindingInflater1;
    int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    getBufferFormat TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    DeferrableSurfaces1 TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    DeferrableSurfaces1 asBinder;
    int asInterface;
    int b;
    int d;
    DeferrableSurfaces1 g;

    Quirks(getBufferFormat getbufferformat, DeferrableSurfaces1 deferrableSurfaces1, DeferrableSurfaces1 deferrableSurfaces2, DeferrableSurfaces1 deferrableSurfaces3, DeferrableSurfaces1 deferrableSurfaces4) throws NotFoundException {
        if ((deferrableSurfaces1 == null && deferrableSurfaces3 == null) || ((deferrableSurfaces2 == null && deferrableSurfaces4 == null) || ((deferrableSurfaces1 != null && deferrableSurfaces2 == null) || (deferrableSurfaces3 != null && deferrableSurfaces4 == null)))) {
            throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = getbufferformat;
        this.g = deferrableSurfaces1;
        this.TuitionPaymentFragmentbindingInflater1 = deferrableSurfaces2;
        this.asBinder = deferrableSurfaces3;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = deferrableSurfaces4;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
    }

    Quirks(Quirks quirks) {
        getBufferFormat getbufferformat = quirks.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        DeferrableSurfaces1 deferrableSurfaces1 = quirks.g;
        DeferrableSurfaces1 deferrableSurfaces2 = quirks.TuitionPaymentFragmentbindingInflater1;
        DeferrableSurfaces1 deferrableSurfaces3 = quirks.asBinder;
        DeferrableSurfaces1 deferrableSurfaces4 = quirks.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = getbufferformat;
        this.g = deferrableSurfaces1;
        this.TuitionPaymentFragmentbindingInflater1 = deferrableSurfaces2;
        this.asBinder = deferrableSurfaces3;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = deferrableSurfaces4;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
    }

    final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        if (this.g == null) {
            this.g = new DeferrableSurfaces1(0.0f, this.asBinder.b);
            this.TuitionPaymentFragmentbindingInflater1 = new DeferrableSurfaces1(0.0f, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b);
        } else if (this.asBinder == null) {
            this.asBinder = new DeferrableSurfaces1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1, this.g.b);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new DeferrableSurfaces1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1, this.TuitionPaymentFragmentbindingInflater1.b);
        }
        this.asInterface = (int) Math.min(this.g.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (int) Math.max(this.asBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        this.d = (int) Math.min(this.g.b, this.asBinder.b);
        this.b = (int) Math.max(this.TuitionPaymentFragmentbindingInflater1.b, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b);
    }
}
