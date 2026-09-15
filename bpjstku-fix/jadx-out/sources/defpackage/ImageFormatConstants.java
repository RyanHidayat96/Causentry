package defpackage;

import com.google.zxing.NotFoundException;
import java.lang.reflect.Array;
import kotlin.UByte;

/* JADX INFO: loaded from: classes6.dex */
public final class ImageFormatConstants extends hasCaptureMode {
    private getBufferFormat TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    public ImageFormatConstants(DeferrableSurfacesExternalSyntheticLambda0 deferrableSurfacesExternalSyntheticLambda0) {
        super(deferrableSurfacesExternalSyntheticLambda0);
    }

    @Override // defpackage.hasCaptureMode, defpackage.DeferrableSurfaces
    public final getBufferFormat TuitionPaymentFragmentbindingInflater1() throws NotFoundException {
        int i;
        getBufferFormat getbufferformat = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (getbufferformat != null) {
            return getbufferformat;
        }
        DeferrableSurfacesExternalSyntheticLambda0 deferrableSurfacesExternalSyntheticLambda0 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i2 = deferrableSurfacesExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1;
        int i3 = deferrableSurfacesExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (i2 >= 40 && i3 >= 40) {
            byte[] bArrTuitionPaymentFragmentspecialinlinedviewModeldefault2 = deferrableSurfacesExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            int i4 = i2 >> 3;
            if ((i2 & 7) != 0) {
                i4++;
            }
            int i5 = i3 >> 3;
            if ((i3 & 7) != 0) {
                i5++;
            }
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i5, i4);
            int i6 = 0;
            while (true) {
                int i7 = 8;
                if (i6 >= i5) {
                    break;
                }
                int i8 = i6 << 3;
                int i9 = i3 - 8;
                if (i8 > i9) {
                    i8 = i9;
                }
                int i10 = 0;
                while (i10 < i4) {
                    int i11 = i10 << 3;
                    int i12 = i2 - 8;
                    if (i11 > i12) {
                        i11 = i12;
                    }
                    int i13 = (i8 * i2) + i11;
                    int i14 = 255;
                    int i15 = 0;
                    int i16 = 0;
                    int i17 = 0;
                    while (i15 < i7) {
                        int i18 = i17;
                        int i19 = 0;
                        while (i19 < i7) {
                            int i20 = i13;
                            int i21 = bArrTuitionPaymentFragmentspecialinlinedviewModeldefault2[i13 + i19] & UByte.MAX_VALUE;
                            i16 += i21;
                            if (i21 < i14) {
                                i14 = i21;
                            }
                            if (i21 > i18) {
                                i18 = i21;
                            }
                            i19++;
                            i13 = i20;
                            i7 = 8;
                        }
                        int i22 = i13;
                        if (i18 - i14 > 24) {
                            i = i22;
                            while (true) {
                                i15++;
                                i += i2;
                                if (i15 < 8) {
                                    int i23 = 0;
                                    for (int i24 = 8; i23 < i24; i24 = 8) {
                                        i16 += bArrTuitionPaymentFragmentspecialinlinedviewModeldefault2[i + i23] & UByte.MAX_VALUE;
                                        i23++;
                                        i = i;
                                    }
                                }
                            }
                        } else {
                            i = i22;
                        }
                        i15++;
                        i13 = i + i2;
                        i17 = i18;
                        i7 = 8;
                    }
                    int i25 = i16 >> 6;
                    if (i17 - i14 <= 24) {
                        i25 = i14 / 2;
                        if (i6 > 0 && i10 > 0) {
                            int[] iArr2 = iArr[i6 - 1];
                            int i26 = i10 - 1;
                            int i27 = ((iArr2[i10] + (iArr[i6][i26] * 2)) + iArr2[i26]) / 4;
                            if (i14 < i27) {
                                i25 = i27;
                            }
                        }
                    }
                    iArr[i6][i10] = i25;
                    i10++;
                    i7 = 8;
                }
                i6++;
            }
            getBufferFormat getbufferformat2 = new getBufferFormat(i2, i3);
            for (int i28 = 0; i28 < i5; i28++) {
                int i29 = i28 << 3;
                int i30 = i3 - 8;
                if (i29 > i30) {
                    i29 = i30;
                }
                int i31 = 0;
                while (i31 < i4) {
                    int i32 = i31 << 3;
                    int i33 = i2 - 8;
                    if (i32 > i33) {
                        i32 = i33;
                    }
                    int i34 = i4 - 3;
                    int i35 = i31 < 2 ? 2 : i31 > i34 ? i34 : i31;
                    int i36 = i5 - 3;
                    if (i28 < 2) {
                        i36 = 2;
                    } else if (i28 <= i36) {
                        i36 = i28;
                    }
                    int i37 = -2;
                    int i38 = 0;
                    for (int i39 = 2; i37 <= i39; i39 = 2) {
                        int[] iArr3 = iArr[i36 + i37];
                        i38 += iArr3[i35 - 2] + iArr3[i35 - 1] + iArr3[i35] + iArr3[i35 + 1] + iArr3[i35 + 2];
                        i37++;
                    }
                    int i40 = i38 / 25;
                    int i41 = (i29 * i2) + i32;
                    int i42 = 0;
                    while (true) {
                        if (i42 < 8) {
                            int i43 = i3;
                            int i44 = 0;
                            for (int i45 = 8; i44 < i45; i45 = 8) {
                                byte[] bArr = bArrTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                if ((bArrTuitionPaymentFragmentspecialinlinedviewModeldefault2[i41 + i44] & UByte.MAX_VALUE) <= i40) {
                                    int i46 = i32 + i44;
                                    int i47 = ((i29 + i42) * getbufferformat2.TuitionPaymentFragmentspecialinlinedviewModeldefault1) + (i46 / 32);
                                    int[] iArr4 = getbufferformat2.TuitionPaymentFragmentbindingInflater1;
                                    iArr4[i47] = (1 << (i46 & 31)) | iArr4[i47];
                                }
                                i44++;
                                bArrTuitionPaymentFragmentspecialinlinedviewModeldefault2 = bArr;
                            }
                            i42++;
                            i41 += i2;
                            i3 = i43;
                        }
                    }
                    i31++;
                }
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = getbufferformat2;
        } else {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = super.TuitionPaymentFragmentbindingInflater1();
        }
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    @Override // defpackage.hasCaptureMode, defpackage.DeferrableSurfaces
    public final DeferrableSurfaces TuitionPaymentFragmentbindingInflater1(DeferrableSurfacesExternalSyntheticLambda0 deferrableSurfacesExternalSyntheticLambda0) {
        return new ImageFormatConstants(deferrableSurfacesExternalSyntheticLambda0);
    }
}
