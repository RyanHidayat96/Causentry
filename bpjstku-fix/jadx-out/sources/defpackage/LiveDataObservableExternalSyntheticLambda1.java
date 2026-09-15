package defpackage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class LiveDataObservableExternalSyntheticLambda1 extends clone {
    @Override // defpackage.clone, defpackage.EncoderProfilesProvider
    public final getBufferFormat TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        if (barcodeFormat != BarcodeFormat.CODE_39) {
            throw new IllegalArgumentException("Can only encode CODE_39, but got ".concat(String.valueOf(barcodeFormat)));
        }
        return super.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str, barcodeFormat, i, i2, map);
    }

    @Override // defpackage.clone
    public final boolean[] TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str) {
        int length = str.length();
        if (length > 80) {
            throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
        }
        int[] iArr = new int[9];
        int i = length + 25;
        for (int i2 = 0; i2 < length; i2++) {
            int iIndexOf = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. *$/+%".indexOf(str.charAt(i2));
            if (iIndexOf < 0) {
                throw new IllegalArgumentException("Bad contents: ".concat(String.valueOf(str)));
            }
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(LiveDataObservableLiveDataObserverAdapter.TuitionPaymentFragmentspecialinlinedviewModeldefault3[iIndexOf], iArr);
            for (int i3 = 0; i3 < 9; i3++) {
                i += iArr[i3];
            }
        }
        boolean[] zArr = new boolean[i];
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(LiveDataObservableLiveDataObserverAdapter.TuitionPaymentFragmentspecialinlinedviewModeldefault1, iArr);
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(zArr, 0, iArr, true);
        int[] iArr2 = {1};
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = iTuitionPaymentFragmentspecialinlinedviewModeldefault3 + TuitionPaymentFragmentspecialinlinedviewModeldefault3(zArr, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, iArr2, false);
        for (int i4 = 0; i4 < length; i4++) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(LiveDataObservableLiveDataObserverAdapter.TuitionPaymentFragmentspecialinlinedviewModeldefault3["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. *$/+%".indexOf(str.charAt(i4))], iArr);
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = iTuitionPaymentFragmentspecialinlinedviewModeldefault4 + TuitionPaymentFragmentspecialinlinedviewModeldefault3(zArr, iTuitionPaymentFragmentspecialinlinedviewModeldefault4, iArr, true);
            iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = iTuitionPaymentFragmentspecialinlinedviewModeldefault5 + TuitionPaymentFragmentspecialinlinedviewModeldefault3(zArr, iTuitionPaymentFragmentspecialinlinedviewModeldefault5, iArr2, false);
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(LiveDataObservableLiveDataObserverAdapter.TuitionPaymentFragmentspecialinlinedviewModeldefault1, iArr);
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(zArr, iTuitionPaymentFragmentspecialinlinedviewModeldefault4, iArr, true);
        return zArr;
    }

    private static void TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i, int[] iArr) {
        for (int i2 = 0; i2 < 9; i2++) {
            int i3 = 1;
            if (((1 << (8 - i2)) & i) != 0) {
                i3 = 2;
            }
            iArr[i2] = i3;
        }
    }
}
