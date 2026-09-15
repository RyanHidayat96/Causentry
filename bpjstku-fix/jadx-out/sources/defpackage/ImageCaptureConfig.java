package defpackage;

import kotlin.UByte;

/* JADX INFO: loaded from: classes6.dex */
public final class ImageCaptureConfig {
    public int TuitionPaymentFragmentbindingInflater1;
    public final byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public int b;

    public ImageCaptureConfig(byte[] bArr) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = bArr;
    }

    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i) {
        if (i > 0 && i <= 32) {
            byte[] bArr = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int length = bArr.length;
            int i2 = this.TuitionPaymentFragmentbindingInflater1;
            int i3 = this.b;
            if (i <= ((length - i2) * 8) - i3) {
                int i4 = 0;
                if (i3 > 0) {
                    int i5 = 8 - i3;
                    int i6 = i < i5 ? i : i5;
                    int i7 = i5 - i6;
                    byte b = bArr[i2];
                    i -= i6;
                    int i8 = i3 + i6;
                    this.b = i8;
                    if (i8 == 8) {
                        this.b = 0;
                        this.TuitionPaymentFragmentbindingInflater1 = i2 + 1;
                    }
                    i4 = (b & ((255 >> (8 - i6)) << i7)) >> i7;
                }
                if (i > 0) {
                    while (i >= 8) {
                        byte[] bArr2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        int i9 = this.TuitionPaymentFragmentbindingInflater1;
                        i4 = (i4 << 8) | (bArr2[i9] & UByte.MAX_VALUE);
                        this.TuitionPaymentFragmentbindingInflater1 = i9 + 1;
                        i -= 8;
                    }
                    if (i > 0) {
                        int i10 = 8 - i;
                        byte b2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1[this.TuitionPaymentFragmentbindingInflater1];
                        this.b += i;
                        return (i4 << i) | ((b2 & ((255 >> i10) << i10)) >> i10);
                    }
                }
                return i4;
            }
        }
        throw new IllegalArgumentException(String.valueOf(i));
    }
}
