package defpackage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class putTag extends ObservableObserver {
    @Override // defpackage.clone, defpackage.EncoderProfilesProvider
    public final getBufferFormat TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        if (barcodeFormat != BarcodeFormat.UPC_E) {
            throw new IllegalArgumentException("Can only encode UPC_E, but got ".concat(String.valueOf(barcodeFormat)));
        }
        return super.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str, barcodeFormat, i, i2, map);
    }

    @Override // defpackage.clone
    public final boolean[] TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str) {
        if (str.length() != 8) {
            StringBuilder sb = new StringBuilder("Requested contents should be 8 digits long, but got ");
            sb.append(str.length());
            throw new IllegalArgumentException(sb.toString());
        }
        int i = Observable.b[Integer.parseInt(str.substring(7, 8))];
        boolean[] zArr = new boolean[51];
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(zArr, 0, withInitialError.asBinder, true);
        int i2 = 1;
        while (i2 <= 6) {
            int i3 = i2 + 1;
            int i4 = Integer.parseInt(str.substring(i2, i3));
            if (((i >> (6 - i2)) & 1) == 1) {
                i4 += 10;
            }
            iTuitionPaymentFragmentspecialinlinedviewModeldefault3 += TuitionPaymentFragmentspecialinlinedviewModeldefault3(zArr, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, withInitialError.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i4], false);
            i2 = i3;
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(zArr, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, withInitialError.TuitionPaymentFragmentbindingInflater1, false);
        return zArr;
    }
}
