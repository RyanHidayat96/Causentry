package defpackage;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import com.google.zxing.datamatrix.decoder.DecodedBitStreamParser;
import kotlin.UByte;

/* JADX INFO: loaded from: classes6.dex */
public final class ImageOutputConfigRotationDegreesValue {
    private final getDefaultResolution TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new getDefaultResolution(ImageInputConfigBuilder.asBinder);

    public final getCaptureBundle TuitionPaymentFragmentbindingInflater1(getBufferFormat getbufferformat) throws ChecksumException, FormatException {
        validateConfig validateconfig = new validateConfig(getbufferformat);
        ImageOutputConfigOptionalRotationValue[] imageOutputConfigOptionalRotationValueArrTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ImageOutputConfigOptionalRotationValue.TuitionPaymentFragmentspecialinlinedviewModeldefault3(validateconfig.TuitionPaymentFragmentbindingInflater1(), validateconfig.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        int i = 0;
        for (ImageOutputConfigOptionalRotationValue imageOutputConfigOptionalRotationValue : imageOutputConfigOptionalRotationValueArrTuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            i += imageOutputConfigOptionalRotationValue.TuitionPaymentFragmentbindingInflater1;
        }
        byte[] bArr = new byte[i];
        int length = imageOutputConfigOptionalRotationValueArrTuitionPaymentFragmentspecialinlinedviewModeldefault3.length;
        for (int i2 = 0; i2 < length; i2++) {
            ImageOutputConfigOptionalRotationValue imageOutputConfigOptionalRotationValue2 = imageOutputConfigOptionalRotationValueArrTuitionPaymentFragmentspecialinlinedviewModeldefault3[i2];
            byte[] bArr2 = imageOutputConfigOptionalRotationValue2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int i3 = imageOutputConfigOptionalRotationValue2.TuitionPaymentFragmentbindingInflater1;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2(bArr2, i3);
            for (int i4 = 0; i4 < i3; i4++) {
                bArr[(i4 * length) + i2] = bArr2[i4];
            }
        }
        return DecodedBitStreamParser.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bArr);
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault2(byte[] bArr, int i) throws ChecksumException {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & UByte.MAX_VALUE;
        }
        try {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(iArr, bArr.length - i);
            for (int i3 = 0; i3 < i; i3++) {
                bArr[i3] = (byte) iArr[i3];
            }
        } catch (ReedSolomonException unused) {
            throw ChecksumException.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        }
    }
}
