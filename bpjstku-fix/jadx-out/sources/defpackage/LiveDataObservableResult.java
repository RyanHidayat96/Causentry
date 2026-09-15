package defpackage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.WriterException;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class LiveDataObservableResult extends ObservableObserver {
    @Override // defpackage.clone, defpackage.EncoderProfilesProvider
    public final getBufferFormat TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        if (barcodeFormat != BarcodeFormat.EAN_13) {
            throw new IllegalArgumentException("Can only encode EAN_13, but got ".concat(String.valueOf(barcodeFormat)));
        }
        return super.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str, barcodeFormat, i, i2, map);
    }

    @Override // defpackage.clone
    public final boolean[] TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str) {
        if (str.length() != 13) {
            StringBuilder sb = new StringBuilder("Requested contents should be 13 digits long, but got ");
            sb.append(str.length());
            throw new IllegalArgumentException(sb.toString());
        }
        try {
            if (!withInitialError.TuitionPaymentFragmentspecialinlinedviewModeldefault2(str)) {
                throw new IllegalArgumentException("Contents do not pass checksum");
            }
            int i = fromError.b[Integer.parseInt(str.substring(0, 1))];
            boolean[] zArr = new boolean[95];
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
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = iTuitionPaymentFragmentspecialinlinedviewModeldefault3 + TuitionPaymentFragmentspecialinlinedviewModeldefault3(zArr, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, withInitialError.TuitionPaymentFragmentspecialinlinedviewModeldefault1, false);
            int i5 = 7;
            while (i5 <= 12) {
                int i6 = i5 + 1;
                iTuitionPaymentFragmentspecialinlinedviewModeldefault4 += TuitionPaymentFragmentspecialinlinedviewModeldefault3(zArr, iTuitionPaymentFragmentspecialinlinedviewModeldefault4, withInitialError.TuitionPaymentFragmentspecialinlinedviewModeldefault2[Integer.parseInt(str.substring(i5, i6))], true);
                i5 = i6;
            }
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(zArr, iTuitionPaymentFragmentspecialinlinedviewModeldefault4, withInitialError.asBinder, true);
            return zArr;
        } catch (FormatException unused) {
            throw new IllegalArgumentException("Illegal contents");
        }
    }
}
