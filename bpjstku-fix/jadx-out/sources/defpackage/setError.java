package defpackage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class setError implements EncoderProfilesProvider {
    private final LiveDataObservableResult b = new LiveDataObservableResult();

    @Override // defpackage.EncoderProfilesProvider
    public final getBufferFormat TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        if (barcodeFormat != BarcodeFormat.UPC_A) {
            throw new IllegalArgumentException("Can only encode UPC-A, but got ".concat(String.valueOf(barcodeFormat)));
        }
        LiveDataObservableResult liveDataObservableResult = this.b;
        int length = str.length();
        if (length == 11) {
            int iCharAt = 0;
            for (int i3 = 0; i3 < 11; i3++) {
                iCharAt += (str.charAt(i3) - '0') * (i3 % 2 == 0 ? 3 : 1);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append((1000 - iCharAt) % 10);
            str = sb.toString();
        } else if (length != 12) {
            StringBuilder sb2 = new StringBuilder("Requested contents should be 11 or 12 digits long, but got ");
            sb2.append(str.length());
            throw new IllegalArgumentException(sb2.toString());
        }
        return liveDataObservableResult.TuitionPaymentFragmentspecialinlinedviewModeldefault1("0".concat(String.valueOf(str)), BarcodeFormat.EAN_13, i, i2, map);
    }
}
