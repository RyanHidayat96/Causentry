package defpackage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class LiveDataObservableLiveDataObserverAdapter extends insertOption {
    static final int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    static final int[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final StringBuilder TuitionPaymentFragmentbindingInflater1;
    private final int[] TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final boolean asBinder;
    private final boolean b;

    static {
        int[] iArr = {52, 289, 97, 352, 49, 304, 112, 37, 292, 100, 265, 73, 328, 25, 280, 88, 13, 268, 76, 28, 259, 67, 322, 19, 274, 82, 7, 262, 70, 22, 385, 193, 448, 145, 400, 208, 133, 388, 196, 148, 168, 162, 138, 42};
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iArr;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = iArr[39];
    }

    public LiveDataObservableLiveDataObserverAdapter() {
        this(false);
    }

    public LiveDataObservableLiveDataObserverAdapter(boolean z) {
        this(z, (byte) 0);
    }

    private LiveDataObservableLiveDataObserverAdapter(boolean z, byte b) {
        this.asBinder = z;
        this.b = false;
        this.TuitionPaymentFragmentbindingInflater1 = new StringBuilder(20);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new int[9];
    }

    @Override // defpackage.insertOption
    public final DynamicRanges b(int i, getFlashType getflashtype, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        int[] iArr = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        Arrays.fill(iArr, 0);
        StringBuilder sb = this.TuitionPaymentFragmentbindingInflater1;
        sb.setLength(0);
        int i2 = getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault1(0);
        int length = iArr.length;
        boolean z = false;
        int i3 = 0;
        int i4 = iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        while (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            if ((((1 << (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 & 31)) & getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault3[iTuitionPaymentFragmentspecialinlinedviewModeldefault1 / 32]) != 0) ^ z) {
                iArr[i3] = iArr[i3] + 1;
            } else {
                int i5 = length - 1;
                if (i3 != i5) {
                    i3++;
                } else if (b(iArr) == TuitionPaymentFragmentspecialinlinedviewModeldefault1 && getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Math.max(0, i4 - ((iTuitionPaymentFragmentspecialinlinedviewModeldefault1 - i4) / 2)), i4)) {
                    int[] iArr2 = {i4, iTuitionPaymentFragmentspecialinlinedviewModeldefault1};
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault1(iArr2[1]);
                    int i6 = getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    while (true) {
                        b(getflashtype, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, iArr);
                        int iB = b(iArr);
                        if (iB < 0) {
                            throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
                        }
                        int i7 = 0;
                        while (true) {
                            int[] iArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            if (i7 < iArr3.length) {
                                if (iArr3[i7] == iB) {
                                    break;
                                }
                                i7++;
                            } else {
                                throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
                            }
                        }
                        char cCharAt = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. *$/+%".charAt(i7);
                        sb.append(cCharAt);
                        int i8 = iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        for (int i9 : iArr) {
                            i8 += i9;
                        }
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i8);
                        if (cCharAt == '*') {
                            sb.setLength(sb.length() - 1);
                            int i10 = 0;
                            for (int i11 : iArr) {
                                i10 += i11;
                            }
                            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != i6 && (((iTuitionPaymentFragmentspecialinlinedviewModeldefault3 - iTuitionPaymentFragmentspecialinlinedviewModeldefault2) - i10) << 1) < i10) {
                                throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
                            }
                            if (this.asBinder) {
                                int length2 = sb.length() - 1;
                                int iIndexOf = 0;
                                for (int i12 = 0; i12 < length2; i12++) {
                                    iIndexOf += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(this.TuitionPaymentFragmentbindingInflater1.charAt(i12));
                                }
                                if (sb.charAt(length2) != "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(iIndexOf % 43)) {
                                    throw ChecksumException.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                }
                                sb.setLength(length2);
                            }
                            if (sb.length() == 0) {
                                throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
                            }
                            String string = sb.toString();
                            float f = i;
                            return new DynamicRanges(string, null, new DeferrableSurfaces1[]{new DeferrableSurfaces1((iArr2[1] + iArr2[0]) / 2.0f, f), new DeferrableSurfaces1(iTuitionPaymentFragmentspecialinlinedviewModeldefault2 + (i10 / 2.0f), f)}, BarcodeFormat.CODE_39);
                        }
                        iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    }
                } else {
                    i4 += iArr[0] + iArr[1];
                    int i13 = length - 2;
                    System.arraycopy(iArr, 2, iArr, 0, i13);
                    iArr[i13] = 0;
                    iArr[i5] = 0;
                    i3--;
                }
                iArr[i3] = 1;
                z = !z;
            }
            iTuitionPaymentFragmentspecialinlinedviewModeldefault1++;
        }
        throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
    }

    private static int b(int[] iArr) {
        int length = iArr.length;
        int i = 0;
        while (true) {
            int i2 = Integer.MAX_VALUE;
            for (int i3 : iArr) {
                if (i3 < i2 && i3 > i) {
                    i2 = i3;
                }
            }
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < length; i7++) {
                int i8 = iArr[i7];
                if (i8 > i2) {
                    i5 |= 1 << ((length - 1) - i7);
                    i4++;
                    i6 += i8;
                }
            }
            if (i4 == 3) {
                for (int i9 = 0; i9 < length && i4 > 0; i9++) {
                    int i10 = iArr[i9];
                    if (i10 > i2) {
                        i4--;
                        if ((i10 << 1) >= i6) {
                            return -1;
                        }
                    }
                }
                return i5;
            }
            if (i4 <= 3) {
                return -1;
            }
            i = i2;
        }
    }
}
