package defpackage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public abstract class clone implements EncoderProfilesProvider {
    public abstract boolean[] TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str);

    public int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return 10;
    }

    @Override // defpackage.EncoderProfilesProvider
    public getBufferFormat TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (i < 0 || i2 < 0) {
            StringBuilder sb = new StringBuilder("Negative size is not allowed. Input: ");
            sb.append(i);
            sb.append('x');
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        if (map != null && map.containsKey(EncodeHintType.MARGIN)) {
            iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = Integer.parseInt(map.get(EncodeHintType.MARGIN).toString());
        }
        boolean[] zArrTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(str);
        int length = zArrTuitionPaymentFragmentspecialinlinedviewModeldefault2.length;
        int i3 = iTuitionPaymentFragmentspecialinlinedviewModeldefault3 + length;
        int iMax = Math.max(i, i3);
        int iMax2 = Math.max(1, i2);
        int i4 = iMax / i3;
        int i5 = (iMax - (length * i4)) / 2;
        getBufferFormat getbufferformat = new getBufferFormat(iMax, iMax2);
        int i6 = 0;
        while (i6 < length) {
            if (zArrTuitionPaymentFragmentspecialinlinedviewModeldefault2[i6]) {
                getbufferformat.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i5, 0, i4, iMax2);
            }
            i6++;
            i5 += i4;
        }
        return getbufferformat;
    }

    protected static int TuitionPaymentFragmentspecialinlinedviewModeldefault3(boolean[] zArr, int i, int[] iArr, boolean z) {
        int i2 = 0;
        for (int i3 : iArr) {
            int i4 = 0;
            while (i4 < i3) {
                zArr[i] = z;
                i4++;
                i++;
            }
            i2 += i3;
            z = !z;
        }
        return i2;
    }
}
