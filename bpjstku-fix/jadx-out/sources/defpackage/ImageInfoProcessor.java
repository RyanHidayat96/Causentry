package defpackage;

import com.google.zxing.NotFoundException;

/* JADX INFO: loaded from: classes6.dex */
public final class ImageInfoProcessor extends isSoftwareJpegEncoderRequested {
    @Override // defpackage.isSoftwareJpegEncoderRequested
    public final getBufferFormat TuitionPaymentFragmentspecialinlinedviewModeldefault3(getBufferFormat getbufferformat, int i, int i2, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) throws NotFoundException {
        return b(getbufferformat, i, i2, ImageInputConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault3(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16));
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0098  */
    /* JADX WARN: Code duplicated, block: B:30:0x009b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x009d  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:86:0x00a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x00de A[SYNTHETIC] */
    @Override // defpackage.isSoftwareJpegEncoderRequested
    public final getBufferFormat b(getBufferFormat getbufferformat, int i, int i2, ImageInputConfig imageInputConfig) throws NotFoundException {
        int i3 = i2;
        if (i <= 0 || i3 <= 0) {
            throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
        }
        getBufferFormat getbufferformat2 = new getBufferFormat(i, i3);
        int i4 = i * 2;
        float[] fArr = new float[i4];
        int i5 = 0;
        while (i5 < i3) {
            float f = i5;
            for (int i6 = 0; i6 < i4; i6 += 2) {
                fArr[i6] = (i6 / 2) + 0.5f;
                fArr[i6 + 1] = 0.5f + f;
            }
            float f2 = imageInputConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            float f3 = imageInputConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            float f4 = imageInputConfig.b;
            float f5 = imageInputConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            float f6 = imageInputConfig.TuitionPaymentFragmentbindingInflater1;
            float f7 = imageInputConfig.asBinder;
            float f8 = imageInputConfig.asInterface;
            float f9 = imageInputConfig.g;
            float f10 = imageInputConfig.f155a;
            for (int i7 = 0; i7 < i4; i7 += 2) {
                float f11 = fArr[i7];
                int i8 = i7 + 1;
                float f12 = fArr[i8];
                float f13 = (f4 * f11) + (f7 * f12) + f10;
                fArr[i7] = (((f2 * f11) + (f5 * f12)) + f8) / f13;
                fArr[i8] = (((f11 * f3) + (f12 * f6)) + f9) / f13;
            }
            int i9 = getbufferformat.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i10 = getbufferformat.b;
            boolean z = true;
            for (int i11 = 0; i11 < i4 && z; i11 += 2) {
                int i12 = (int) fArr[i11];
                int i13 = i11 + 1;
                int i14 = (int) fArr[i13];
                if (i12 < -1 || i12 > i9 || i14 < -1 || i14 > i10) {
                    throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
                }
                if (i12 == -1) {
                    fArr[i11] = 0.0f;
                } else {
                    if (i12 == i9) {
                        fArr[i11] = i9 - 1;
                    } else {
                        z = false;
                    }
                    if (i14 == -1) {
                        fArr[i13] = 0.0f;
                    } else {
                        if (i14 == i10) {
                            fArr[i13] = i10 - 1;
                        }
                    }
                    z = true;
                }
                z = true;
                if (i14 == -1) {
                    fArr[i13] = 0.0f;
                } else {
                    if (i14 == i10) {
                        fArr[i13] = i10 - 1;
                    }
                }
                z = true;
            }
            boolean z2 = true;
            for (int i15 = i4 - 2; i15 >= 0 && z2; i15 -= 2) {
                int i16 = (int) fArr[i15];
                int i17 = i15 + 1;
                int i18 = (int) fArr[i17];
                if (i16 < -1 || i16 > i9 || i18 < -1 || i18 > i10) {
                    throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
                }
                if (i16 == -1) {
                    fArr[i15] = 0.0f;
                } else {
                    if (i16 == i9) {
                        fArr[i15] = i9 - 1;
                    } else {
                        z2 = false;
                    }
                    if (i18 == -1) {
                        fArr[i17] = 0.0f;
                    } else {
                        if (i18 == i10) {
                            fArr[i17] = i10 - 1;
                        }
                    }
                    z2 = true;
                }
                z2 = true;
                if (i18 == -1) {
                    fArr[i17] = 0.0f;
                } else {
                    if (i18 == i10) {
                        fArr[i17] = i10 - 1;
                    }
                }
                z2 = true;
            }
            for (int i19 = 0; i19 < i4; i19 += 2) {
                try {
                    if (getbufferformat.TuitionPaymentFragmentspecialinlinedviewModeldefault1((int) fArr[i19], (int) fArr[i19 + 1])) {
                        int i20 = i19 / 2;
                        int i21 = (getbufferformat2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * i5) + (i20 / 32);
                        int[] iArr = getbufferformat2.TuitionPaymentFragmentbindingInflater1;
                        iArr[i21] = (1 << (i20 & 31)) | iArr[i21];
                    }
                } catch (ArrayIndexOutOfBoundsException unused) {
                    throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
                }
            }
            i5++;
            i3 = i2;
        }
        return getbufferformat2;
    }
}
