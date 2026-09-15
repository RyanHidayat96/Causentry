package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class DeferrableSurfacesExternalSyntheticLambda1 extends DeferrableSurfacesExternalSyntheticLambda0 {
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final int asInterface;
    private final int b;
    private final byte[] d;

    public DeferrableSurfacesExternalSyntheticLambda1(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6) {
        super(i5, i6);
        if (i5 + i3 > i || i6 + i4 > i2) {
            throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
        }
        this.d = bArr;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2;
        this.b = i3;
        this.asInterface = i4;
    }

    @Override // defpackage.DeferrableSurfacesExternalSyntheticLambda0
    public final byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = this.TuitionPaymentFragmentbindingInflater1;
        int i2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (i == i3 && i2 == this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            return this.d;
        }
        int i4 = i * i2;
        byte[] bArr = new byte[i4];
        int i5 = (this.asInterface * i3) + this.b;
        if (i == i3) {
            System.arraycopy(this.d, i5, bArr, 0, i4);
            return bArr;
        }
        for (int i6 = 0; i6 < i2; i6++) {
            System.arraycopy(this.d, i5, bArr, i6 * i, i);
            i5 += this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
        return bArr;
    }

    @Override // defpackage.DeferrableSurfacesExternalSyntheticLambda0
    public final byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i, byte[] bArr) {
        if (i < 0 || i >= this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            throw new IllegalArgumentException("Requested row is outside the image: ".concat(String.valueOf(i)));
        }
        int i2 = this.TuitionPaymentFragmentbindingInflater1;
        if (bArr == null || bArr.length < i2) {
            bArr = new byte[i2];
        }
        int i3 = this.asInterface;
        int i4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        System.arraycopy(this.d, ((i + i3) * i4) + this.b, bArr, 0, i2);
        return bArr;
    }
}
