package defpackage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class LiveDataObservableExternalSyntheticLambda0 extends insertOption {
    static final char[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = "0123456789-$:/.+ABCD".toCharArray();
    static final int[] b = {3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};
    private static final char[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = {'A', 'B', 'C', 'D'};
    private final StringBuilder d = new StringBuilder(20);
    private int[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new int[80];
    private int TuitionPaymentFragmentbindingInflater1 = 0;

    /* JADX WARN: Code duplicated, block: B:117:0x022f A[LOOP:4: B:34:0x0079->B:117:0x022f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:140:0x00a7 A[EDGE_INSN: B:140:0x00a7->B:48:0x00a7 BREAK  A[LOOP:4: B:34:0x0079->B:117:0x022f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00a3  */
    @Override // defpackage.insertOption
    public final DynamicRanges b(int i, getFlashType getflashtype, Map<DecodeHintType, ?> map) throws NotFoundException {
        int i2;
        Arrays.fill(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, 0);
        this.TuitionPaymentFragmentbindingInflater1 = 0;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault3(0);
        int i3 = getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 >= i3) {
            throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
        }
        int i4 = 0;
        boolean z = true;
        while (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 < i3) {
            if ((((1 << (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 & 31)) & getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault3[iTuitionPaymentFragmentspecialinlinedviewModeldefault3 / 32]) != 0) ^ z) {
                i4++;
            } else {
                b(i4);
                z = !z;
                i4 = 1;
            }
            iTuitionPaymentFragmentspecialinlinedviewModeldefault3++;
        }
        b(i4);
        int i5 = 1;
        while (i5 < this.TuitionPaymentFragmentbindingInflater1) {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(i5);
            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 != -1) {
                char[] cArr = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                char c = TuitionPaymentFragmentspecialinlinedviewModeldefault1[iTuitionPaymentFragmentspecialinlinedviewModeldefault1];
                if (cArr != null) {
                    for (char c2 : cArr) {
                        if (c2 == c) {
                            int i6 = 0;
                            for (int i7 = i5; i7 < i5 + 7; i7++) {
                                i6 += this.TuitionPaymentFragmentspecialinlinedviewModeldefault2[i7];
                            }
                            if (i5 != 1 && this.TuitionPaymentFragmentspecialinlinedviewModeldefault2[i5 - 1] < i6 / 2) {
                                break;
                            }
                            this.d.setLength(0);
                            int i8 = i5;
                            loop4: while (true) {
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(i8);
                                if (iTuitionPaymentFragmentspecialinlinedviewModeldefault2 == -1) {
                                    throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
                                }
                                this.d.append((char) iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                                i2 = i8 + 8;
                                if (this.d.length() > 1) {
                                    char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                    char c3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1[iTuitionPaymentFragmentspecialinlinedviewModeldefault2];
                                    if (cArr2 == null) {
                                        if (i2 >= this.TuitionPaymentFragmentbindingInflater1) {
                                            break;
                                            break;
                                        }
                                        i8 = i2;
                                    } else {
                                        for (char c4 : cArr2) {
                                            if (c4 == c3) {
                                                break loop4;
                                            }
                                        }
                                        if (i2 >= this.TuitionPaymentFragmentbindingInflater1) {
                                            break;
                                        }
                                        i8 = i2;
                                    }
                                } else {
                                    if (i2 >= this.TuitionPaymentFragmentbindingInflater1) {
                                        break;
                                        break;
                                    }
                                    i8 = i2;
                                }
                            }
                            int i9 = i8 + 7;
                            int i10 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2[i9];
                            int i11 = 0;
                            for (int i12 = -8; i12 < -1; i12++) {
                                i11 += this.TuitionPaymentFragmentspecialinlinedviewModeldefault2[i2 + i12];
                            }
                            if (i2 < this.TuitionPaymentFragmentbindingInflater1 && i10 < i11 / 2) {
                                throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
                            }
                            int[] iArr = {0, 0, 0, 0};
                            int[] iArr2 = {0, 0, 0, 0};
                            int length = this.d.length() - 1;
                            int i13 = i5;
                            int i14 = 0;
                            while (true) {
                                int i15 = b[this.d.charAt(i14)];
                                for (int i16 = 6; i16 >= 0; i16--) {
                                    int i17 = (i16 & 1) + ((i15 & 1) << 1);
                                    iArr[i17] = iArr[i17] + this.TuitionPaymentFragmentspecialinlinedviewModeldefault2[i13 + i16];
                                    iArr2[i17] = iArr2[i17] + 1;
                                    i15 >>= 1;
                                }
                                if (i14 >= length) {
                                    break;
                                }
                                i13 += 8;
                                i14++;
                            }
                            float[] fArr = new float[4];
                            float[] fArr2 = new float[4];
                            int i18 = 0;
                            for (int i19 = 2; i18 < i19; i19 = 2) {
                                fArr2[i18] = 0.0f;
                                int i20 = i18 + 2;
                                float f = iArr[i18] / iArr2[i18];
                                float f2 = iArr[i20];
                                float f3 = iArr2[i20];
                                float f4 = (f + (f2 / f3)) / 2.0f;
                                fArr2[i20] = f4;
                                fArr[i18] = f4;
                                fArr[i20] = ((f2 * 2.0f) + 1.5f) / f3;
                                i18++;
                            }
                            int i21 = i5;
                            int i22 = 0;
                            loop10: while (true) {
                                int i23 = b[this.d.charAt(i22)];
                                for (int i24 = 6; i24 >= 0; i24--) {
                                    int i25 = (i24 & 1) + ((i23 & 1) << 1);
                                    float f5 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2[i21 + i24];
                                    if (f5 < fArr2[i25] || f5 > fArr[i25]) {
                                        break loop10;
                                    }
                                    i23 >>= 1;
                                }
                                if (i22 >= length) {
                                    for (int i26 = 0; i26 < this.d.length(); i26++) {
                                        StringBuilder sb = this.d;
                                        sb.setCharAt(i26, TuitionPaymentFragmentspecialinlinedviewModeldefault1[sb.charAt(i26)]);
                                    }
                                    char cCharAt = this.d.charAt(0);
                                    char[] cArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                    if (cArr3 != null) {
                                        for (char c5 : cArr3) {
                                            if (c5 == cCharAt) {
                                                StringBuilder sb2 = this.d;
                                                char cCharAt2 = sb2.charAt(sb2.length() - 1);
                                                if (cArr3 != null) {
                                                    for (char c6 : cArr3) {
                                                        if (c6 == cCharAt2) {
                                                            if (this.d.length() <= 3) {
                                                                throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
                                                            }
                                                            if (map == null || !map.containsKey(DecodeHintType.RETURN_CODABAR_START_END)) {
                                                                StringBuilder sb3 = this.d;
                                                                sb3.deleteCharAt(sb3.length() - 1);
                                                                this.d.deleteCharAt(0);
                                                            }
                                                            int i27 = 0;
                                                            for (int i28 = 0; i28 < i5; i28++) {
                                                                i27 += this.TuitionPaymentFragmentspecialinlinedviewModeldefault2[i28];
                                                            }
                                                            float f6 = i27;
                                                            while (i5 < i9) {
                                                                i27 += this.TuitionPaymentFragmentspecialinlinedviewModeldefault2[i5];
                                                                i5++;
                                                            }
                                                            float f7 = i27;
                                                            float f8 = i;
                                                            return new DynamicRanges(this.d.toString(), null, new DeferrableSurfaces1[]{new DeferrableSurfaces1(f6, f8), new DeferrableSurfaces1(f7, f8)}, BarcodeFormat.CODABAR);
                                                        }
                                                    }
                                                }
                                                throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
                                            }
                                        }
                                    }
                                    throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
                                }
                                i21 += 8;
                                i22++;
                            }
                            throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
                        }
                    }
                } else {
                    continue;
                }
            }
            i5 += 2;
        }
        throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
    }

    private void b(int i) {
        int[] iArr = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i2 = this.TuitionPaymentFragmentbindingInflater1;
        iArr[i2] = i;
        int i3 = i2 + 1;
        this.TuitionPaymentFragmentbindingInflater1 = i3;
        if (i3 >= iArr.length) {
            int[] iArr2 = new int[i3 << 1];
            System.arraycopy(iArr, 0, iArr2, 0, i3);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = iArr2;
        }
    }

    static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(char[] cArr, char c) {
        if (cArr != null) {
            for (char c2 : cArr) {
                if (c2 == c) {
                    return true;
                }
            }
        }
        return false;
    }

    private int TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i) {
        int i2 = i + 7;
        if (i2 >= this.TuitionPaymentFragmentbindingInflater1) {
            return -1;
        }
        int[] iArr = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = Integer.MAX_VALUE;
        int i4 = 0;
        int i5 = Integer.MAX_VALUE;
        int i6 = 0;
        for (int i7 = i; i7 < i2; i7 += 2) {
            int i8 = iArr[i7];
            if (i8 < i5) {
                i5 = i8;
            }
            if (i8 > i6) {
                i6 = i8;
            }
        }
        int i9 = (i5 + i6) / 2;
        int i10 = 0;
        for (int i11 = i + 1; i11 < i2; i11 += 2) {
            int i12 = iArr[i11];
            if (i12 < i3) {
                i3 = i12;
            }
            if (i12 > i10) {
                i10 = i12;
            }
        }
        int i13 = (i3 + i10) / 2;
        int i14 = 128;
        int i15 = 0;
        for (int i16 = 0; i16 < 7; i16++) {
            i14 >>= 1;
            if (iArr[i + i16] > ((i16 & 1) == 0 ? i9 : i13)) {
                i15 |= i14;
            }
        }
        while (true) {
            int[] iArr2 = b;
            if (i4 >= iArr2.length) {
                return -1;
            }
            if (iArr2[i4] == i15) {
                return i4;
            }
            i4++;
        }
    }
}
