package defpackage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import java.nio.charset.Charset;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class EncoderProfilesProvider1 implements EncoderProfilesProvider {
    private static final Charset b = Charset.forName("ISO-8859-1");

    /* JADX WARN: Code duplicated, block: B:13:0x004a A[PHI: r0 r1
  0x004a: PHI (r0v1 java.nio.charset.Charset) = (r0v0 java.nio.charset.Charset), (r0v5 java.nio.charset.Charset) binds: [B:3:0x0005, B:11:0x0039] A[DONT_GENERATE, DONT_INLINE]
  0x004a: PHI (r1v1 int) = (r1v0 int), (r1v7 int) binds: [B:3:0x0005, B:11:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.EncoderProfilesProvider
    public final getBufferFormat TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) {
        int i3;
        Charset charsetForName = b;
        int i4 = 33;
        if (map == null) {
            i3 = 0;
        } else {
            if (map.containsKey(EncodeHintType.CHARACTER_SET)) {
                charsetForName = Charset.forName(map.get(EncodeHintType.CHARACTER_SET).toString());
            }
            i4 = map.containsKey(EncodeHintType.ERROR_CORRECTION) ? Integer.parseInt(map.get(EncodeHintType.ERROR_CORRECTION).toString()) : 33;
            if (map.containsKey(EncodeHintType.AZTEC_LAYERS)) {
                i3 = Integer.parseInt(map.get(EncodeHintType.AZTEC_LAYERS).toString());
            } else {
                i3 = 0;
            }
        }
        if (barcodeFormat != BarcodeFormat.AZTEC) {
            throw new IllegalArgumentException("Can only encode AZTEC, but got ".concat(String.valueOf(barcodeFormat)));
        }
        getBufferFormat getbufferformat = EncoderProfilesProxyAudioProfileProxy.TuitionPaymentFragmentspecialinlinedviewModeldefault3(str.getBytes(charsetForName), i4, i3).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (getbufferformat == null) {
            throw new IllegalStateException();
        }
        int i5 = getbufferformat.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i6 = getbufferformat.b;
        int iMax = Math.max(i, i5);
        int iMax2 = Math.max(i2, i6);
        int iMin = Math.min(iMax / i5, iMax2 / i6);
        int i7 = (iMax - (i5 * iMin)) / 2;
        int i8 = (iMax2 - (i6 * iMin)) / 2;
        getBufferFormat getbufferformat2 = new getBufferFormat(iMax, iMax2);
        int i9 = 0;
        while (i9 < i6) {
            int i10 = i7;
            int i11 = 0;
            while (i11 < i5) {
                if (getbufferformat.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i11, i9)) {
                    getbufferformat2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i10, i8, iMin, iMin);
                }
                i11++;
                i10 += iMin;
            }
            i9++;
            i8 += iMin;
        }
        return getbufferformat2;
    }
}
