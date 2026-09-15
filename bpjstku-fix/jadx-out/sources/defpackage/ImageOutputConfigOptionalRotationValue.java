package defpackage;

/* JADX INFO: loaded from: classes6.dex */
final class ImageOutputConfigOptionalRotationValue {
    final int TuitionPaymentFragmentbindingInflater1;
    final byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    private ImageOutputConfigOptionalRotationValue(int i, byte[] bArr) {
        this.TuitionPaymentFragmentbindingInflater1 = i;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = bArr;
    }

    static ImageOutputConfigOptionalRotationValue[] TuitionPaymentFragmentspecialinlinedviewModeldefault3(byte[] bArr, getTargetResolution gettargetresolution) {
        getTargetResolution.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = gettargetresolution.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        getTargetResolution.TuitionPaymentFragmentspecialinlinedviewModeldefault3[] tuitionPaymentFragmentspecialinlinedviewModeldefault3Arr = tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i = 0;
        for (getTargetResolution.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 : tuitionPaymentFragmentspecialinlinedviewModeldefault3Arr) {
            i += tuitionPaymentFragmentspecialinlinedviewModeldefault3.b;
        }
        ImageOutputConfigOptionalRotationValue[] imageOutputConfigOptionalRotationValueArr = new ImageOutputConfigOptionalRotationValue[i];
        int i2 = 0;
        for (getTargetResolution.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault4 : tuitionPaymentFragmentspecialinlinedviewModeldefault3Arr) {
            int i3 = 0;
            while (i3 < tuitionPaymentFragmentspecialinlinedviewModeldefault4.b) {
                int i4 = tuitionPaymentFragmentspecialinlinedviewModeldefault4.TuitionPaymentFragmentbindingInflater1;
                imageOutputConfigOptionalRotationValueArr[i2] = new ImageOutputConfigOptionalRotationValue(i4, new byte[tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + i4]);
                i3++;
                i2++;
            }
        }
        int length = imageOutputConfigOptionalRotationValueArr[0].TuitionPaymentFragmentspecialinlinedviewModeldefault2.length - tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i5 = length - 1;
        int i6 = 0;
        for (int i7 = 0; i7 < i5; i7++) {
            int i8 = 0;
            while (i8 < i2) {
                imageOutputConfigOptionalRotationValueArr[i8].TuitionPaymentFragmentspecialinlinedviewModeldefault2[i7] = bArr[i6];
                i8++;
                i6++;
            }
        }
        boolean z = gettargetresolution.asBinder == 24;
        int i9 = z ? 8 : i2;
        int i10 = 0;
        while (i10 < i9) {
            imageOutputConfigOptionalRotationValueArr[i10].TuitionPaymentFragmentspecialinlinedviewModeldefault2[i5] = bArr[i6];
            i10++;
            i6++;
        }
        int length2 = imageOutputConfigOptionalRotationValueArr[0].TuitionPaymentFragmentspecialinlinedviewModeldefault2.length;
        while (length < length2) {
            int i11 = 0;
            while (i11 < i2) {
                int i12 = z ? (i11 + 8) % i2 : i11;
                imageOutputConfigOptionalRotationValueArr[i12].TuitionPaymentFragmentspecialinlinedviewModeldefault2[(!z || i12 <= 7) ? length : length - 1] = bArr[i6];
                i11++;
                i6++;
            }
            length++;
        }
        if (i6 == bArr.length) {
            return imageOutputConfigOptionalRotationValueArr;
        }
        throw new IllegalArgumentException();
    }
}
