package defpackage;

import com.google.zxing.FormatException;

/* JADX INFO: loaded from: classes6.dex */
final class validateConfig {
    private final getBufferFormat TuitionPaymentFragmentbindingInflater1;
    final getTargetResolution TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final getBufferFormat TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    validateConfig(getBufferFormat getbufferformat) throws FormatException {
        int i = getbufferformat.b;
        if (i < 8 || i > 144 || (i & 1) != 0) {
            throw FormatException.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        }
        getTargetResolution gettargetresolutionTuitionPaymentFragmentspecialinlinedviewModeldefault1 = getTargetResolution.TuitionPaymentFragmentspecialinlinedviewModeldefault1(getbufferformat.b, getbufferformat.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = gettargetresolutionTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i2 = gettargetresolutionTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1;
        int i3 = gettargetresolutionTuitionPaymentFragmentspecialinlinedviewModeldefault1.b;
        if (getbufferformat.b != i2) {
            throw new IllegalArgumentException("Dimension of bitMarix must match the version size");
        }
        int i4 = gettargetresolutionTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i5 = gettargetresolutionTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i6 = i2 / i4;
        int i7 = i3 / i5;
        getBufferFormat getbufferformat2 = new getBufferFormat(i7 * i5, i6 * i4);
        for (int i8 = 0; i8 < i6; i8++) {
            for (int i9 = 0; i9 < i7; i9++) {
                for (int i10 = 0; i10 < i4; i10++) {
                    for (int i11 = 0; i11 < i5; i11++) {
                        if (getbufferformat.TuitionPaymentFragmentspecialinlinedviewModeldefault1(((i5 + 2) * i9) + 1 + i11, ((i4 + 2) * i8) + 1 + i10)) {
                            int i12 = (i9 * i5) + i11;
                            int i13 = (((i8 * i4) + i10) * getbufferformat2.TuitionPaymentFragmentspecialinlinedviewModeldefault1) + (i12 / 32);
                            int[] iArr = getbufferformat2.TuitionPaymentFragmentbindingInflater1;
                            iArr[i13] = (1 << (i12 & 31)) | iArr[i13];
                        }
                    }
                }
            }
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = getbufferformat2;
        this.TuitionPaymentFragmentbindingInflater1 = new getBufferFormat(getbufferformat2.TuitionPaymentFragmentspecialinlinedviewModeldefault3, getbufferformat2.b);
    }

    final byte[] TuitionPaymentFragmentbindingInflater1() throws FormatException {
        boolean z;
        boolean z2;
        boolean z3;
        byte[] bArr = new byte[this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.f995a];
        int i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b;
        int i2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = 0;
        boolean z4 = false;
        int i4 = 0;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        int i5 = 4;
        while (true) {
            if (i5 == i && i3 == 0 && !z4) {
                int i6 = i - 1;
                int i7 = (TuitionPaymentFragmentspecialinlinedviewModeldefault3(i6, 0, i, i2) ? 1 : 0) << 1;
                if (TuitionPaymentFragmentspecialinlinedviewModeldefault3(i6, 1, i, i2)) {
                    i7 |= 1;
                }
                int i8 = i7 << 1;
                if (TuitionPaymentFragmentspecialinlinedviewModeldefault3(i6, 2, i, i2)) {
                    i8 |= 1;
                }
                int i9 = i8 << 1;
                if (TuitionPaymentFragmentspecialinlinedviewModeldefault3(0, i2 - 2, i, i2)) {
                    i9 |= 1;
                }
                int i10 = i9 << 1;
                int i11 = i2 - 1;
                if (TuitionPaymentFragmentspecialinlinedviewModeldefault3(0, i11, i, i2)) {
                    i10 |= 1;
                }
                int i12 = i10 << 1;
                if (TuitionPaymentFragmentspecialinlinedviewModeldefault3(1, i11, i, i2)) {
                    i12 |= 1;
                }
                int i13 = i12 << 1;
                if (TuitionPaymentFragmentspecialinlinedviewModeldefault3(2, i11, i, i2)) {
                    i13 |= 1;
                }
                int i14 = i13 << 1;
                if (TuitionPaymentFragmentspecialinlinedviewModeldefault3(3, i11, i, i2)) {
                    i14 |= 1;
                }
                bArr[i4] = (byte) i14;
                i5 -= 2;
                i3 += 2;
                i4++;
                z3 = true;
                z2 = z5;
                z = z6;
            } else {
                int i15 = i - 2;
                if (i5 != i15 || i3 != 0 || (i2 & 3) == 0 || z5) {
                    if (i5 == i + 4 && i3 == 2 && (i2 & 7) == 0 && !z6) {
                        int i16 = i - 1;
                        int i17 = (TuitionPaymentFragmentspecialinlinedviewModeldefault3(i16, 0, i, i2) ? 1 : 0) << 1;
                        int i18 = i2 - 1;
                        if (TuitionPaymentFragmentspecialinlinedviewModeldefault3(i16, i18, i, i2)) {
                            i17 |= 1;
                        }
                        int i19 = i17 << 1;
                        int i20 = i2 - 3;
                        if (TuitionPaymentFragmentspecialinlinedviewModeldefault3(0, i20, i, i2)) {
                            i19 |= 1;
                        }
                        int i21 = i19 << 1;
                        int i22 = i2 - 2;
                        if (TuitionPaymentFragmentspecialinlinedviewModeldefault3(0, i22, i, i2)) {
                            i21 |= 1;
                        }
                        int i23 = i21 << 1;
                        if (TuitionPaymentFragmentspecialinlinedviewModeldefault3(0, i18, i, i2)) {
                            i23 |= 1;
                        }
                        int i24 = i23 << 1;
                        if (TuitionPaymentFragmentspecialinlinedviewModeldefault3(1, i20, i, i2)) {
                            i24 |= 1;
                        }
                        int i25 = i24 << 1;
                        if (TuitionPaymentFragmentspecialinlinedviewModeldefault3(1, i22, i, i2)) {
                            i25 |= 1;
                        }
                        int i26 = i25 << 1;
                        if (TuitionPaymentFragmentspecialinlinedviewModeldefault3(1, i18, i, i2)) {
                            i26 |= 1;
                        }
                        bArr[i4] = (byte) i26;
                        i5 -= 2;
                        i3 += 2;
                        i4++;
                        z = true;
                        z3 = z4;
                        z2 = z5;
                    } else {
                        if (i5 == i15 && i3 == 0) {
                            if ((i2 & 7) == 4 && !z7) {
                                int i27 = (TuitionPaymentFragmentspecialinlinedviewModeldefault3(i + (-3), 0, i, i2) ? 1 : 0) << 1;
                                if (TuitionPaymentFragmentspecialinlinedviewModeldefault3(i15, 0, i, i2)) {
                                    i27 |= 1;
                                }
                                int i28 = i27 << 1;
                                if (TuitionPaymentFragmentspecialinlinedviewModeldefault3(i - 1, 0, i, i2)) {
                                    i28 |= 1;
                                }
                                int i29 = i28 << 1;
                                if (TuitionPaymentFragmentspecialinlinedviewModeldefault3(0, i2 - 2, i, i2)) {
                                    i29 |= 1;
                                }
                                int i30 = i29 << 1;
                                int i31 = i2 - 1;
                                if (TuitionPaymentFragmentspecialinlinedviewModeldefault3(0, i31, i, i2)) {
                                    i30 |= 1;
                                }
                                int i32 = i30 << 1;
                                if (TuitionPaymentFragmentspecialinlinedviewModeldefault3(1, i31, i, i2)) {
                                    i32 |= 1;
                                }
                                int i33 = i32 << 1;
                                if (TuitionPaymentFragmentspecialinlinedviewModeldefault3(2, i31, i, i2)) {
                                    i33 |= 1;
                                }
                                int i34 = i33 << 1;
                                if (TuitionPaymentFragmentspecialinlinedviewModeldefault3(3, i31, i, i2)) {
                                    i34 |= 1;
                                }
                                bArr[i4] = (byte) i34;
                                i5 -= 2;
                                i3 += 2;
                                i4++;
                                z7 = true;
                                z4 = z4;
                                z5 = z5;
                                z6 = z6;
                            }
                        }
                        while (true) {
                            if (i5 < i && i3 >= 0 && !this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i3, i5)) {
                                bArr[i4] = (byte) TuitionPaymentFragmentspecialinlinedviewModeldefault2(i5, i3, i, i2);
                                i4++;
                            }
                            int i35 = i5 - 2;
                            int i36 = i3 + 2;
                            if (i35 < 0 || i36 >= i2) {
                                break;
                            }
                            i5 = i35;
                            i3 = i36;
                        }
                        int i37 = i5 - 1;
                        int i38 = i3 + 5;
                        while (true) {
                            if (i37 >= 0 && i38 < i2 && !this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i38, i37)) {
                                bArr[i4] = (byte) TuitionPaymentFragmentspecialinlinedviewModeldefault2(i37, i38, i, i2);
                                i4++;
                            }
                            int i39 = i37 + 2;
                            int i40 = i38 - 2;
                            if (i39 >= i || i40 < 0) {
                                break;
                            }
                            i37 = i39;
                            i38 = i40;
                        }
                        i5 = i37 + 5;
                        i3 = i38 - 1;
                        z4 = z4;
                        z5 = z5;
                        z6 = z6;
                        z7 = z7;
                    }
                    if (i5 < i && i3 >= i2) {
                        break;
                    }
                } else {
                    int i41 = (TuitionPaymentFragmentspecialinlinedviewModeldefault3(i + (-3), 0, i, i2) ? 1 : 0) << 1;
                    if (TuitionPaymentFragmentspecialinlinedviewModeldefault3(i15, 0, i, i2)) {
                        i41 |= 1;
                    }
                    int i42 = i41 << 1;
                    if (TuitionPaymentFragmentspecialinlinedviewModeldefault3(i - 1, 0, i, i2)) {
                        i42 |= 1;
                    }
                    int i43 = i42 << 1;
                    if (TuitionPaymentFragmentspecialinlinedviewModeldefault3(0, i2 - 4, i, i2)) {
                        i43 |= 1;
                    }
                    int i44 = i43 << 1;
                    if (TuitionPaymentFragmentspecialinlinedviewModeldefault3(0, i2 - 3, i, i2)) {
                        i44 |= 1;
                    }
                    int i45 = i44 << 1;
                    if (TuitionPaymentFragmentspecialinlinedviewModeldefault3(0, i2 - 2, i, i2)) {
                        i45 |= 1;
                    }
                    int i46 = i45 << 1;
                    int i47 = i2 - 1;
                    if (TuitionPaymentFragmentspecialinlinedviewModeldefault3(0, i47, i, i2)) {
                        i46 |= 1;
                    }
                    int i48 = i46 << 1;
                    if (TuitionPaymentFragmentspecialinlinedviewModeldefault3(1, i47, i, i2)) {
                        i48 |= 1;
                    }
                    bArr[i4] = (byte) i48;
                    i5 -= 2;
                    i3 += 2;
                    i4++;
                    z2 = true;
                    z3 = z4;
                    z = z6;
                }
            }
            z4 = z3;
            z5 = z2;
            z6 = z;
            z7 = z7;
            if (i5 < i) {
            }
        }
        if (i4 == this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.f995a) {
            return bArr;
        }
        throw FormatException.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
    }

    private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i, int i2, int i3, int i4) {
        if (i < 0) {
            i += i3;
            i2 += 4 - ((i3 + 4) & 7);
        }
        if (i2 < 0) {
            i2 += i4;
            i += 4 - ((i4 + 4) & 7);
        }
        getBufferFormat getbufferformat = this.TuitionPaymentFragmentbindingInflater1;
        int i5 = (getbufferformat.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * i) + (i2 / 32);
        int[] iArr = getbufferformat.TuitionPaymentFragmentbindingInflater1;
        iArr[i5] = (1 << (i2 & 31)) | iArr[i5];
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i2, i);
    }

    private int TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, int i2, int i3, int i4) {
        int i5 = i - 2;
        int i6 = i2 - 2;
        int i7 = (TuitionPaymentFragmentspecialinlinedviewModeldefault3(i5, i6, i3, i4) ? 1 : 0) << 1;
        int i8 = i2 - 1;
        if (TuitionPaymentFragmentspecialinlinedviewModeldefault3(i5, i8, i3, i4)) {
            i7 |= 1;
        }
        int i9 = i7 << 1;
        int i10 = i - 1;
        if (TuitionPaymentFragmentspecialinlinedviewModeldefault3(i10, i6, i3, i4)) {
            i9 |= 1;
        }
        int i11 = i9 << 1;
        if (TuitionPaymentFragmentspecialinlinedviewModeldefault3(i10, i8, i3, i4)) {
            i11 |= 1;
        }
        int i12 = i11 << 1;
        if (TuitionPaymentFragmentspecialinlinedviewModeldefault3(i10, i2, i3, i4)) {
            i12 |= 1;
        }
        int i13 = i12 << 1;
        if (TuitionPaymentFragmentspecialinlinedviewModeldefault3(i, i6, i3, i4)) {
            i13 |= 1;
        }
        int i14 = i13 << 1;
        if (TuitionPaymentFragmentspecialinlinedviewModeldefault3(i, i8, i3, i4)) {
            i14 |= 1;
        }
        int i15 = i14 << 1;
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3(i, i2, i3, i4) ? i15 | 1 : i15;
    }
}
