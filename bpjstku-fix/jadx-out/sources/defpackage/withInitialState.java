package defpackage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.ResultMetadataType;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class withInitialState {
    private static final int[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = {1, 1, 2};
    private final MutableOptionsBundle TuitionPaymentFragmentbindingInflater1 = new MutableOptionsBundle();
    private final MutableStateObservable TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new MutableStateObservable();

    withInitialState() {
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0123  */
    /* JADX WARN: Code duplicated, block: B:56:0x0124 A[Catch: ReaderException -> 0x0178, TryCatch #0 {ReaderException -> 0x0178, blocks: (B:3:0x0017, B:7:0x0035, B:9:0x0047, B:11:0x0050, B:13:0x0057, B:14:0x0060, B:15:0x0066, B:19:0x006f, B:21:0x0075, B:23:0x0082, B:24:0x008e, B:26:0x0093, B:27:0x009e, B:29:0x00a3, B:57:0x0131, B:60:0x015a, B:62:0x015e, B:63:0x0161, B:32:0x00b1, B:38:0x00c4, B:56:0x0124, B:41:0x00ce, B:44:0x00d9, B:49:0x00e9, B:51:0x00f7, B:53:0x0106, B:52:0x0102, B:65:0x0165, B:66:0x0169, B:67:0x016a, B:68:0x016e, B:69:0x0172, B:70:0x0173, B:71:0x0177), top: B:103:0x0017 }] */
    final DynamicRanges TuitionPaymentFragmentbindingInflater1(int i, getFlashType getflashtype, int i2) throws NotFoundException {
        EnumMap enumMap;
        char c;
        String str;
        String string;
        EnumMap enumMap2;
        int i3;
        int[] iArrTuitionPaymentFragmentspecialinlinedviewModeldefault3 = withInitialError.TuitionPaymentFragmentspecialinlinedviewModeldefault3(getflashtype, i2, false, TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        try {
            MutableStateObservable mutableStateObservable = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            StringBuilder sb = mutableStateObservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            sb.setLength(0);
            int[] iArr = mutableStateObservable.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            iArr[3] = 0;
            int i4 = getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i5 = 0;
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = iArrTuitionPaymentFragmentspecialinlinedviewModeldefault3[1];
            for (int i6 = 0; i6 < 5 && iTuitionPaymentFragmentspecialinlinedviewModeldefault3 < i4; i6++) {
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = withInitialError.TuitionPaymentFragmentspecialinlinedviewModeldefault1(getflashtype, iArr, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, withInitialError.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                sb.append((char) ((iTuitionPaymentFragmentspecialinlinedviewModeldefault1 % 10) + 48));
                for (int i7 : iArr) {
                    iTuitionPaymentFragmentspecialinlinedviewModeldefault3 += i7;
                }
                if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 >= 10) {
                    i5 |= 1 << (4 - i6);
                }
                if (i6 != 4) {
                    iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault3(getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault1(iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                }
            }
            if (sb.length() != 5) {
                throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
            }
            for (int i8 = 0; i8 < 10; i8++) {
                if (i5 == MutableStateObservable.b[i8]) {
                    String string2 = sb.toString();
                    int length = string2.length();
                    int iCharAt = 0;
                    for (int i9 = length - 2; i9 >= 0; i9 -= 2) {
                        iCharAt += string2.charAt(i9) - '0';
                    }
                    int iCharAt2 = iCharAt * 3;
                    for (int i10 = length - 1; i10 >= 0; i10 -= 2) {
                        iCharAt2 += string2.charAt(i10) - '0';
                    }
                    if ((iCharAt2 * 3) % 10 == i8) {
                        String string3 = sb.toString();
                        if (string3.length() == 5) {
                            char cCharAt = string3.charAt(0);
                            if (cCharAt == '0') {
                                str = "£";
                            } else if (cCharAt != '5') {
                                str = "";
                                if (cCharAt == '9') {
                                    if ("90000".equals(string3)) {
                                        string = null;
                                    } else if ("99991".equals(string3)) {
                                        string = "0.00";
                                    } else if ("99990".equals(string3)) {
                                        string = "Used";
                                    }
                                }
                                if (string == null) {
                                    i3 = 2;
                                    enumMap2 = null;
                                } else {
                                    enumMap2 = new EnumMap(ResultMetadataType.class);
                                    enumMap2.put(ResultMetadataType.SUGGESTED_PRICE, string);
                                    i3 = 2;
                                }
                            } else {
                                str = "$";
                            }
                            int i11 = Integer.parseInt(string3.substring(1));
                            int i12 = i11 / 100;
                            int i13 = i11 % 100;
                            String strConcat = i13 < 10 ? "0".concat(String.valueOf(i13)) : String.valueOf(i13);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(str);
                            sb2.append(String.valueOf(i12));
                            sb2.append('.');
                            sb2.append(strConcat);
                            string = sb2.toString();
                            if (string == null) {
                                i3 = 2;
                                enumMap2 = null;
                            } else {
                                enumMap2 = new EnumMap(ResultMetadataType.class);
                                enumMap2.put(ResultMetadataType.SUGGESTED_PRICE, string);
                                i3 = 2;
                            }
                        } else {
                            i3 = 2;
                            enumMap2 = null;
                        }
                        DeferrableSurfaces1[] deferrableSurfaces1Arr = new DeferrableSurfaces1[i3];
                        float f = i;
                        deferrableSurfaces1Arr[0] = new DeferrableSurfaces1((iArrTuitionPaymentFragmentspecialinlinedviewModeldefault3[0] + iArrTuitionPaymentFragmentspecialinlinedviewModeldefault3[1]) / 2.0f, f);
                        deferrableSurfaces1Arr[1] = new DeferrableSurfaces1(iTuitionPaymentFragmentspecialinlinedviewModeldefault3, f);
                        DynamicRanges dynamicRanges = new DynamicRanges(string3, null, deferrableSurfaces1Arr, BarcodeFormat.UPC_EAN_EXTENSION);
                        if (enumMap2 != null && enumMap2 != null) {
                            Map<ResultMetadataType, Object> map = dynamicRanges.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            if (map == null) {
                                dynamicRanges.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = enumMap2;
                            } else {
                                map.putAll(enumMap2);
                            }
                        }
                        return dynamicRanges;
                    }
                    throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
                }
            }
            throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
        } catch (ReaderException unused) {
            MutableOptionsBundle mutableOptionsBundle = this.TuitionPaymentFragmentbindingInflater1;
            StringBuilder sb3 = mutableOptionsBundle.b;
            sb3.setLength(0);
            int[] iArr2 = mutableOptionsBundle.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            iArr2[0] = 0;
            iArr2[1] = 0;
            iArr2[2] = 0;
            iArr2[3] = 0;
            int i14 = getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = iArrTuitionPaymentFragmentspecialinlinedviewModeldefault3[1];
            int i15 = 0;
            int i16 = 0;
            for (int i17 = 2; i15 < i17 && iTuitionPaymentFragmentspecialinlinedviewModeldefault4 < i14; i17 = 2) {
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = withInitialError.TuitionPaymentFragmentspecialinlinedviewModeldefault1(getflashtype, iArr2, iTuitionPaymentFragmentspecialinlinedviewModeldefault4, withInitialError.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                sb3.append((char) ((iTuitionPaymentFragmentspecialinlinedviewModeldefault2 % 10) + 48));
                for (int i18 : iArr2) {
                    iTuitionPaymentFragmentspecialinlinedviewModeldefault4 += i18;
                }
                if (iTuitionPaymentFragmentspecialinlinedviewModeldefault2 >= 10) {
                    i16 = (1 << (1 - i15)) | i16;
                }
                if (i15 != 1) {
                    iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault3(getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault1(iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                }
                i15++;
            }
            if (sb3.length() != 2) {
                throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
            }
            if (Integer.parseInt(sb3.toString()) % 4 == i16) {
                String string4 = sb3.toString();
                if (string4.length() != 2) {
                    c = 0;
                    enumMap = null;
                } else {
                    enumMap = new EnumMap(ResultMetadataType.class);
                    enumMap.put(ResultMetadataType.ISSUE_NUMBER, Integer.valueOf(string4));
                    c = 0;
                }
                float f2 = i;
                DynamicRanges dynamicRanges2 = new DynamicRanges(string4, null, new DeferrableSurfaces1[]{new DeferrableSurfaces1((iArrTuitionPaymentFragmentspecialinlinedviewModeldefault3[c] + iArrTuitionPaymentFragmentspecialinlinedviewModeldefault3[1]) / 2.0f, f2), new DeferrableSurfaces1(iTuitionPaymentFragmentspecialinlinedviewModeldefault4, f2)}, BarcodeFormat.UPC_EAN_EXTENSION);
                if (enumMap != null && enumMap != null) {
                    Map<ResultMetadataType, Object> map2 = dynamicRanges2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    if (map2 == null) {
                        dynamicRanges2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = enumMap;
                    } else {
                        map2.putAll(enumMap);
                    }
                }
                return dynamicRanges2;
            }
            throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
        }
    }
}
