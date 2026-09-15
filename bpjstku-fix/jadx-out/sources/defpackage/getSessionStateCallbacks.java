package defpackage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class getSessionStateCallbacks implements EncoderProfilesProvider {
    @Override // defpackage.EncoderProfilesProvider
    public final getBufferFormat TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (barcodeFormat != BarcodeFormat.QR_CODE) {
            throw new IllegalArgumentException("Can only encode QR_CODE, but got ".concat(String.valueOf(barcodeFormat)));
        }
        if (i < 0 || i2 < 0) {
            StringBuilder sb = new StringBuilder("Requested dimensions are too small: ");
            sb.append(i);
            sb.append('x');
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
        ErrorCorrectionLevel errorCorrectionLevelValueOf = ErrorCorrectionLevel.L;
        int i3 = 4;
        if (map != null) {
            if (map.containsKey(EncodeHintType.ERROR_CORRECTION)) {
                errorCorrectionLevelValueOf = ErrorCorrectionLevel.valueOf(map.get(EncodeHintType.ERROR_CORRECTION).toString());
            }
            if (map.containsKey(EncodeHintType.MARGIN)) {
                i3 = Integer.parseInt(map.get(EncodeHintType.MARGIN).toString());
            }
        }
        addOutputConfig addoutputconfig = SessionConfigCloseableErrorListener.TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, errorCorrectionLevelValueOf, map).TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (addoutputconfig == null) {
            throw new IllegalStateException();
        }
        int i4 = addoutputconfig.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i5 = addoutputconfig.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i6 = i3 << 1;
        int i7 = i4 + i6;
        int i8 = i6 + i5;
        int iMax = Math.max(i, i7);
        int iMax2 = Math.max(i2, i8);
        int iMin = Math.min(iMax / i7, iMax2 / i8);
        int i9 = (iMax - (i4 * iMin)) / 2;
        int i10 = (iMax2 - (i5 * iMin)) / 2;
        getBufferFormat getbufferformat = new getBufferFormat(iMax, iMax2);
        int i11 = 0;
        while (i11 < i5) {
            int i12 = 0;
            int i13 = i9;
            while (i12 < i4) {
                if (addoutputconfig.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i11][i12] == 1) {
                    getbufferformat.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i13, i10, iMin, iMin);
                }
                i12++;
                i13 += iMin;
            }
            i11++;
            i10 += iMin;
        }
        return getbufferformat;
    }
}
