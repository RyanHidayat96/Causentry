package defpackage;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class lambdaonChanged0androidxcameracoreimplLiveDataObservableLiveDataObserverAdapter extends insertOption {
    static final int[] TuitionPaymentFragmentbindingInflater1;
    private static final char[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".toCharArray();
    private static final int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final StringBuilder TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new StringBuilder(20);
    private final int[] b = new int[6];

    static {
        int[] iArr = {276, 328, 324, 322, 296, 292, 290, 336, 274, 266, TypedValues.CycleType.TYPE_WAVE_OFFSET, TypedValues.CycleType.TYPE_EASING, 418, 404, TypedValues.CycleType.TYPE_VISIBILITY, 394, 360, 356, 354, 308, 282, 344, 332, 326, 300, 278, 436, 434, 428, TypedValues.CycleType.TYPE_CUSTOM_WAVE_SHAPE, 406, 410, 364, 358, 310, 314, 302, 468, 466, 458, 366, 374, 430, 294, 474, 470, 306, 350};
        TuitionPaymentFragmentbindingInflater1 = iArr;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iArr[47];
    }

    private static int TuitionPaymentFragmentbindingInflater1(int[] iArr) {
        int i = 0;
        for (int i2 : iArr) {
            i += i2;
        }
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            int iRound = Math.round((iArr[i4] * 9.0f) / i);
            if (iRound <= 0 || iRound > 4) {
                return -1;
            }
            if ((i4 & 1) == 0) {
                for (int i5 = 0; i5 < iRound; i5++) {
                    i3 = (i3 << 1) | 1;
                }
            } else {
                i3 <<= iRound;
            }
        }
        return i3;
    }

    private static void b(CharSequence charSequence, int i, int i2) throws ChecksumException {
        int iIndexOf = 0;
        int i3 = 1;
        for (int i4 = i - 1; i4 >= 0; i4--) {
            iIndexOf += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(charSequence.charAt(i4)) * i3;
            i3++;
            if (i3 > i2) {
                i3 = 1;
            }
        }
        if (charSequence.charAt(i) != TuitionPaymentFragmentspecialinlinedviewModeldefault1[iIndexOf % 47]) {
            throw ChecksumException.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        }
    }

    @Override // defpackage.insertOption
    public final DynamicRanges b(int i, getFlashType getflashtype, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        int i2;
        char c;
        int i3 = getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault1(0);
        Arrays.fill(this.b, 0);
        int[] iArr = this.b;
        int length = iArr.length;
        boolean z = false;
        int i4 = 0;
        int i5 = iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        while (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 < i3) {
            if ((((1 << (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 & 31)) & getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault3[iTuitionPaymentFragmentspecialinlinedviewModeldefault1 / 32]) != 0) ^ z) {
                iArr[i4] = iArr[i4] + 1;
            } else {
                int i6 = length - 1;
                if (i4 != i6) {
                    i4++;
                } else if (TuitionPaymentFragmentbindingInflater1(iArr) == TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                    int[] iArr2 = {i5, iTuitionPaymentFragmentspecialinlinedviewModeldefault1};
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault1(iArr2[1]);
                    int i7 = getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    int[] iArr3 = this.b;
                    Arrays.fill(iArr3, 0);
                    StringBuilder sb = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    sb.setLength(0);
                    while (true) {
                        b(getflashtype, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, iArr3);
                        int iTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(iArr3);
                        if (iTuitionPaymentFragmentbindingInflater1 < 0) {
                            throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
                        }
                        int i8 = 0;
                        while (true) {
                            int[] iArr4 = TuitionPaymentFragmentbindingInflater1;
                            if (i8 < iArr4.length) {
                                if (iArr4[i8] == iTuitionPaymentFragmentbindingInflater1) {
                                    break;
                                }
                                i8++;
                            } else {
                                throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
                            }
                        }
                        char c2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1[i8];
                        sb.append(c2);
                        int i9 = iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        for (int i10 : iArr3) {
                            i9 += i10;
                        }
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i9);
                        if (c2 == '*') {
                            sb.deleteCharAt(sb.length() - 1);
                            int i11 = 0;
                            for (int i12 : iArr3) {
                                i11 += i12;
                            }
                            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 == i7 || (getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault3[iTuitionPaymentFragmentspecialinlinedviewModeldefault3 / 32] & (1 << (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 & 31))) == 0) {
                                throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
                            }
                            if (sb.length() < 2) {
                                throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
                            }
                            int length2 = sb.length();
                            b(sb, length2 - 2, 20);
                            b(sb, length2 - 1, 15);
                            sb.setLength(sb.length() - 2);
                            int length3 = sb.length();
                            StringBuilder sb2 = new StringBuilder(length3);
                            int i13 = 0;
                            while (i13 < length3) {
                                char cCharAt = sb.charAt(i13);
                                if (cCharAt >= 'a' && cCharAt <= 'd') {
                                    if (i13 >= length3 - 1) {
                                        throw FormatException.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                    }
                                    i13++;
                                    char cCharAt2 = sb.charAt(i13);
                                    switch (cCharAt) {
                                        case 'a':
                                            if (cCharAt2 < 'A' || cCharAt2 > 'Z') {
                                                throw FormatException.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                            }
                                            i2 = cCharAt2 - '@';
                                            c = (char) i2;
                                            sb2.append(c);
                                            break;
                                            break;
                                        case 'b':
                                            if (cCharAt2 >= 'A' && cCharAt2 <= 'E') {
                                                i2 = cCharAt2 - '&';
                                            } else if (cCharAt2 >= 'F' && cCharAt2 <= 'J') {
                                                i2 = cCharAt2 - 11;
                                            } else if (cCharAt2 < 'K' || cCharAt2 > 'O') {
                                                if (cCharAt2 >= 'P' && cCharAt2 <= 'S') {
                                                    i2 = cCharAt2 + '+';
                                                } else {
                                                    if (cCharAt2 < 'T' || cCharAt2 > 'Z') {
                                                        throw FormatException.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                                    }
                                                    c = 127;
                                                }
                                                sb2.append(c);
                                            } else {
                                                i2 = cCharAt2 + 16;
                                            }
                                            c = (char) i2;
                                            sb2.append(c);
                                            break;
                                        case 'c':
                                            if (cCharAt2 >= 'A' && cCharAt2 <= 'O') {
                                                i2 = cCharAt2 - ' ';
                                                c = (char) i2;
                                            } else {
                                                if (cCharAt2 != 'Z') {
                                                    throw FormatException.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                                }
                                                c = ':';
                                            }
                                            sb2.append(c);
                                            break;
                                        case 'd':
                                            if (cCharAt2 < 'A' || cCharAt2 > 'Z') {
                                                throw FormatException.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                            }
                                            i2 = cCharAt2 + ' ';
                                            c = (char) i2;
                                            sb2.append(c);
                                            break;
                                            break;
                                        default:
                                            c = 0;
                                            sb2.append(c);
                                            break;
                                    }
                                } else {
                                    sb2.append(cCharAt);
                                }
                                i13++;
                            }
                            String string = sb2.toString();
                            float f = i;
                            return new DynamicRanges(string, null, new DeferrableSurfaces1[]{new DeferrableSurfaces1((iArr2[1] + iArr2[0]) / 2.0f, f), new DeferrableSurfaces1(iTuitionPaymentFragmentspecialinlinedviewModeldefault2 + (i11 / 2.0f), f)}, BarcodeFormat.CODE_93);
                        }
                        iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    }
                } else {
                    i5 += iArr[0] + iArr[1];
                    int i14 = length - 2;
                    System.arraycopy(iArr, 2, iArr, 0, i14);
                    iArr[i14] = 0;
                    iArr[i6] = 0;
                    i4--;
                }
                iArr[i4] = 1;
                z = !z;
            }
            iTuitionPaymentFragmentspecialinlinedviewModeldefault1++;
        }
        throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
    }
}
