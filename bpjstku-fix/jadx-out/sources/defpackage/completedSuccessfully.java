package defpackage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class completedSuccessfully extends ObservableObserver {
    @Override // defpackage.clone, defpackage.EncoderProfilesProvider
    public final getBufferFormat TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        if (barcodeFormat != BarcodeFormat.EAN_8) {
            throw new IllegalArgumentException("Can only encode EAN_8, but got ".concat(String.valueOf(barcodeFormat)));
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
        boolean[] zArr = new boolean[67];
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(zArr, 0, withInitialError.asBinder, true);
        int i = 0;
        while (i <= 3) {
            int i2 = i + 1;
            iTuitionPaymentFragmentspecialinlinedviewModeldefault3 += TuitionPaymentFragmentspecialinlinedviewModeldefault3(zArr, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, withInitialError.TuitionPaymentFragmentspecialinlinedviewModeldefault2[Integer.parseInt(str.substring(i, i2))], false);
            i = i2;
        }
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = iTuitionPaymentFragmentspecialinlinedviewModeldefault3 + TuitionPaymentFragmentspecialinlinedviewModeldefault3(zArr, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, withInitialError.TuitionPaymentFragmentspecialinlinedviewModeldefault1, false);
        int i3 = 4;
        while (i3 <= 7) {
            int i4 = i3 + 1;
            iTuitionPaymentFragmentspecialinlinedviewModeldefault4 += TuitionPaymentFragmentspecialinlinedviewModeldefault3(zArr, iTuitionPaymentFragmentspecialinlinedviewModeldefault4, withInitialError.TuitionPaymentFragmentspecialinlinedviewModeldefault2[Integer.parseInt(str.substring(i3, i4))], true);
            i3 = i4;
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(zArr, iTuitionPaymentFragmentspecialinlinedviewModeldefault4, withInitialError.asBinder, true);
        return zArr;
    }
}
