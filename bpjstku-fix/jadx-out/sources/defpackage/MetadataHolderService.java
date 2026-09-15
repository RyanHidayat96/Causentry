package defpackage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class MetadataHolderService extends clone {
    private static final int[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {1, 1, 1, 1};
    private static final int[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {3, 1, 1};

    @Override // defpackage.clone, defpackage.EncoderProfilesProvider
    public final getBufferFormat TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        if (barcodeFormat != BarcodeFormat.ITF) {
            throw new IllegalArgumentException("Can only encode ITF, but got ".concat(String.valueOf(barcodeFormat)));
        }
        return super.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str, barcodeFormat, i, i2, map);
    }

    @Override // defpackage.clone
    public final boolean[] TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("The length of the input should be even");
        }
        if (length > 80) {
            throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
        }
        boolean[] zArr = new boolean[(length * 9) + 9];
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(zArr, 0, TuitionPaymentFragmentspecialinlinedviewModeldefault2, true);
        for (int i = 0; i < length; i += 2) {
            int iDigit = Character.digit(str.charAt(i), 10);
            int iDigit2 = Character.digit(str.charAt(i + 1), 10);
            int[] iArr = new int[18];
            for (int i2 = 0; i2 < 5; i2++) {
                int i3 = i2 * 2;
                iArr[i3] = MultiValueSet.TuitionPaymentFragmentspecialinlinedviewModeldefault3[iDigit][i2];
                iArr[i3 + 1] = MultiValueSet.TuitionPaymentFragmentspecialinlinedviewModeldefault3[iDigit2][i2];
            }
            iTuitionPaymentFragmentspecialinlinedviewModeldefault3 += TuitionPaymentFragmentspecialinlinedviewModeldefault3(zArr, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, iArr, true);
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(zArr, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, TuitionPaymentFragmentspecialinlinedviewModeldefault1, true);
        return zArr;
    }
}
