package defpackage;

import kotlin.UByte;

/* JADX INFO: loaded from: classes6.dex */
public final class lambdasurfaceListWithTimeout0 extends DeferrableSurfacesExternalSyntheticLambda0 {
    private final DeferrableSurfacesExternalSyntheticLambda0 TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    @Override // defpackage.DeferrableSurfacesExternalSyntheticLambda0
    public final byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i, byte[] bArr) {
        byte[] bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i, bArr);
        int i2 = this.TuitionPaymentFragmentbindingInflater1;
        for (int i3 = 0; i3 < i2; i3++) {
            bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1[i3] = (byte) (255 - (bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1[i3] & UByte.MAX_VALUE));
        }
        return bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    @Override // defpackage.DeferrableSurfacesExternalSyntheticLambda0
    public final byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        byte[] bArrTuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int i = this.TuitionPaymentFragmentbindingInflater1 * this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) (255 - (bArrTuitionPaymentFragmentspecialinlinedviewModeldefault2[i2] & UByte.MAX_VALUE));
        }
        return bArr;
    }

    @Override // defpackage.DeferrableSurfacesExternalSyntheticLambda0
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
    }

    @Override // defpackage.DeferrableSurfacesExternalSyntheticLambda0
    public final DeferrableSurfacesExternalSyntheticLambda0 TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    @Override // defpackage.DeferrableSurfacesExternalSyntheticLambda0
    public final DeferrableSurfacesExternalSyntheticLambda0 b() {
        return new lambdasurfaceListWithTimeout0(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b());
    }

    public lambdasurfaceListWithTimeout0(DeferrableSurfacesExternalSyntheticLambda0 deferrableSurfacesExternalSyntheticLambda0) {
        super(deferrableSurfacesExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1, deferrableSurfacesExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = deferrableSurfacesExternalSyntheticLambda0;
    }
}
