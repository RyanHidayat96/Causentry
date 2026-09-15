package defpackage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.NotFoundException;

/* JADX INFO: loaded from: classes6.dex */
public final class LiveDataObservableLiveDataObserverAdapterExternalSyntheticLambda0 extends withInitialError {
    private final int[] b = new int[4];

    @Override // defpackage.withInitialError
    protected final int TuitionPaymentFragmentspecialinlinedviewModeldefault2(getFlashType getflashtype, int[] iArr, StringBuilder sb) throws NotFoundException {
        int[] iArr2 = this.b;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int i = getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i2 = iArr[1];
        for (int i3 = 0; i3 < 4 && i2 < i; i3++) {
            sb.append((char) (TuitionPaymentFragmentspecialinlinedviewModeldefault1(getflashtype, iArr2, i2, TuitionPaymentFragmentspecialinlinedviewModeldefault2) + 48));
            for (int i4 : iArr2) {
                i2 += i4;
            }
        }
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(getflashtype, i2, true, TuitionPaymentFragmentspecialinlinedviewModeldefault1)[1];
        for (int i6 = 0; i6 < 4 && i5 < i; i6++) {
            sb.append((char) (TuitionPaymentFragmentspecialinlinedviewModeldefault1(getflashtype, iArr2, i5, TuitionPaymentFragmentspecialinlinedviewModeldefault2) + 48));
            for (int i7 : iArr2) {
                i5 += i7;
            }
        }
        return i5;
    }

    @Override // defpackage.withInitialError
    final BarcodeFormat TuitionPaymentFragmentbindingInflater1() {
        return BarcodeFormat.EAN_8;
    }
}
