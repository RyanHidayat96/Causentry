package defpackage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class disable extends clone {
    @Override // defpackage.clone, defpackage.EncoderProfilesProvider
    public final getBufferFormat TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        if (barcodeFormat != BarcodeFormat.CODE_93) {
            throw new IllegalArgumentException("Can only encode CODE_93, but got ".concat(String.valueOf(barcodeFormat)));
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
        boolean[] zArr = new boolean[((str.length() + 4) * 9) + 1];
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(lambdaonChanged0androidxcameracoreimplLiveDataObservableLiveDataObserverAdapter.TuitionPaymentFragmentbindingInflater1[47], iArr);
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(zArr, 0, iArr);
        for (int i = 0; i < length; i++) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(lambdaonChanged0androidxcameracoreimplLiveDataObservableLiveDataObserverAdapter.TuitionPaymentFragmentbindingInflater1["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(i))], iArr);
            iTuitionPaymentFragmentspecialinlinedviewModeldefault1 += TuitionPaymentFragmentspecialinlinedviewModeldefault1(zArr, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, iArr);
        }
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(str, 20);
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(lambdaonChanged0androidxcameracoreimplLiveDataObservableLiveDataObserverAdapter.TuitionPaymentFragmentbindingInflater1[iTuitionPaymentFragmentspecialinlinedviewModeldefault3], iArr);
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = iTuitionPaymentFragmentspecialinlinedviewModeldefault1 + TuitionPaymentFragmentspecialinlinedviewModeldefault1(zArr, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, iArr);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".charAt(iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(lambdaonChanged0androidxcameracoreimplLiveDataObservableLiveDataObserverAdapter.TuitionPaymentFragmentbindingInflater1[TuitionPaymentFragmentspecialinlinedviewModeldefault3(sb.toString(), 15)], iArr);
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = iTuitionPaymentFragmentspecialinlinedviewModeldefault2 + TuitionPaymentFragmentspecialinlinedviewModeldefault1(zArr, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, iArr);
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(lambdaonChanged0androidxcameracoreimplLiveDataObservableLiveDataObserverAdapter.TuitionPaymentFragmentbindingInflater1[47], iArr);
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(zArr, iTuitionPaymentFragmentspecialinlinedviewModeldefault4, iArr);
        zArr[iTuitionPaymentFragmentspecialinlinedviewModeldefault4 + 9] = true;
        return zArr;
    }

    private static void TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i, int[] iArr) {
        for (int i2 = 0; i2 < 9; i2++) {
            int i3 = 1;
            if (((1 << (8 - i2)) & i) == 0) {
                i3 = 0;
            }
            iArr[i2] = i3;
        }
    }

    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1(boolean[] zArr, int i, int[] iArr) {
        int length = iArr.length;
        int i2 = 0;
        while (i2 < 9) {
            zArr[i] = iArr[i2] != 0;
            i2++;
            i++;
        }
        return 9;
    }

    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str, int i) {
        int iIndexOf = 0;
        int i2 = 1;
        for (int length = str.length() - 1; length >= 0; length--) {
            iIndexOf += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(length)) * i2;
            i2++;
            if (i2 > i) {
                i2 = 1;
            }
        }
        return iIndexOf % 47;
    }
}
