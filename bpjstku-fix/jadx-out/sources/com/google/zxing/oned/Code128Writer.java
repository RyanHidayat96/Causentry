package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import defpackage.LiveDataObservableExternalSyntheticLambda2;
import defpackage.clone;
import defpackage.getBufferFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class Code128Writer extends clone {

    enum CType {
        UNCODABLE,
        ONE_DIGIT,
        TWO_DIGITS,
        FNC_1
    }

    @Override // defpackage.clone, defpackage.EncoderProfilesProvider
    public final getBufferFormat TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        if (barcodeFormat != BarcodeFormat.CODE_128) {
            throw new IllegalArgumentException("Can only encode CODE_128, but got ".concat(String.valueOf(barcodeFormat)));
        }
        return super.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str, barcodeFormat, i, i2, map);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0092  */
    /* JADX WARN: Code duplicated, block: B:51:0x0094  */
    @Override // defpackage.clone
    public final boolean[] TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str) {
        int i;
        CType cTypeTuitionPaymentFragmentbindingInflater1;
        int length = str.length();
        if (length <= 0 || length > 80) {
            throw new IllegalArgumentException("Contents length should be between 1 and 80 characters, but got ".concat(String.valueOf(length)));
        }
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt < ' ' || cCharAt > '~') {
                switch (cCharAt) {
                    case 241:
                    case 242:
                    case 243:
                    case 244:
                        break;
                    default:
                        throw new IllegalArgumentException("Bad character in input: ".concat(String.valueOf(cCharAt)));
                }
            }
        }
        ArrayList<int[]> arrayList = new ArrayList();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1;
        while (i3 < length) {
            CType cTypeTuitionPaymentFragmentbindingInflater2 = TuitionPaymentFragmentbindingInflater1(str, i3);
            int iCharAt = 100;
            if (cTypeTuitionPaymentFragmentbindingInflater2 == CType.UNCODABLE || cTypeTuitionPaymentFragmentbindingInflater2 == CType.ONE_DIGIT) {
                i = 100;
            } else {
                i = 99;
                if (i5 == 99) {
                    i = i5;
                } else if (i5 == 100) {
                    if (cTypeTuitionPaymentFragmentbindingInflater2 == CType.FNC_1 || (cTypeTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(str, i3 + 2)) == CType.UNCODABLE || cTypeTuitionPaymentFragmentbindingInflater1 == CType.ONE_DIGIT) {
                        i = i5;
                    } else if (cTypeTuitionPaymentFragmentbindingInflater1 != CType.FNC_1) {
                        int i7 = i3 + 4;
                        while (true) {
                            CType cTypeTuitionPaymentFragmentbindingInflater3 = TuitionPaymentFragmentbindingInflater1(str, i7);
                            if (cTypeTuitionPaymentFragmentbindingInflater3 == CType.TWO_DIGITS) {
                                i7 += 2;
                            } else if (cTypeTuitionPaymentFragmentbindingInflater3 == CType.ONE_DIGIT) {
                                i = 100;
                            }
                        }
                    } else if (TuitionPaymentFragmentbindingInflater1(str, i3 + 3) != CType.TWO_DIGITS) {
                        i = 100;
                    }
                } else {
                    if (cTypeTuitionPaymentFragmentbindingInflater2 == CType.FNC_1) {
                        cTypeTuitionPaymentFragmentbindingInflater2 = TuitionPaymentFragmentbindingInflater1(str, i3 + 1);
                    }
                    if (cTypeTuitionPaymentFragmentbindingInflater2 != CType.TWO_DIGITS) {
                        i = 100;
                    }
                }
            }
            if (i == i5) {
                switch (str.charAt(i3)) {
                    case 241:
                        iCharAt = 102;
                        break;
                    case 242:
                        iCharAt = 97;
                        break;
                    case 243:
                        iCharAt = 96;
                        break;
                    case 244:
                        break;
                    default:
                        if (i5 == 100) {
                            iCharAt = str.charAt(i3) - ' ';
                        } else {
                            iCharAt = Integer.parseInt(str.substring(i3, i3 + 2));
                            i3++;
                        }
                        break;
                }
                i3++;
            } else {
                iCharAt = i5 == 0 ? i == 100 ? 104 : 105 : i;
                i5 = i;
            }
            arrayList.add(LiveDataObservableExternalSyntheticLambda2.TuitionPaymentFragmentspecialinlinedviewModeldefault3[iCharAt]);
            i4 += iCharAt * i6;
            if (i3 != 0) {
                i6++;
            }
        }
        arrayList.add(LiveDataObservableExternalSyntheticLambda2.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i4 % 103]);
        arrayList.add(LiveDataObservableExternalSyntheticLambda2.TuitionPaymentFragmentspecialinlinedviewModeldefault3[106]);
        int i8 = 0;
        for (int[] iArr : arrayList) {
            for (int i9 : iArr) {
                i8 += i9;
            }
        }
        boolean[] zArr = new boolean[i8];
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            iTuitionPaymentFragmentspecialinlinedviewModeldefault3 += TuitionPaymentFragmentspecialinlinedviewModeldefault3(zArr, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, (int[]) it.next(), true);
        }
        return zArr;
    }

    private static CType TuitionPaymentFragmentbindingInflater1(CharSequence charSequence, int i) {
        int length = charSequence.length();
        if (i >= length) {
            return CType.UNCODABLE;
        }
        char cCharAt = charSequence.charAt(i);
        if (cCharAt == 241) {
            return CType.FNC_1;
        }
        if (cCharAt < '0' || cCharAt > '9') {
            return CType.UNCODABLE;
        }
        int i2 = i + 1;
        if (i2 >= length) {
            return CType.ONE_DIGIT;
        }
        char cCharAt2 = charSequence.charAt(i2);
        if (cCharAt2 < '0' || cCharAt2 > '9') {
            return CType.ONE_DIGIT;
        }
        return CType.TWO_DIGITS;
    }
}
