package defpackage;

import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes6.dex */
public final class lambdaremoveObserver3androidxcameracoreimplLiveDataObservable {
    private static final String[] b = {"\nABCDEFGHIJKLMNOPQRSTUVWXYZ\ufffa\u001c\u001d\u001e\ufffb ￼\"#$%&'()*+,-./0123456789:\ufff1\ufff2\ufff3\ufff4\ufff8", "`abcdefghijklmnopqrstuvwxyz\ufffa\u001c\u001d\u001e\ufffb{￼}~\u007f;<=>?[\\]^_ ,./:@!|￼\ufff5\ufff6￼\ufff0\ufff2\ufff3\ufff4\ufff7", "ÀÁÂÃÄÅÆÇÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚ\ufffa\u001c\u001d\u001eÛÜÝÞßª¬±²³µ¹º¼½¾\u0080\u0081\u0082\u0083\u0084\u0085\u0086\u0087\u0088\u0089\ufff7 \ufff9\ufff3\ufff4\ufff8", "àáâãäåæçèéêëìíîïðñòóôõö÷øùú\ufffa\u001c\u001d\u001e\ufffbûüýþÿ¡¨«¯°´·¸»¿\u008a\u008b\u008c\u008d\u008e\u008f\u0090\u0091\u0092\u0093\u0094\ufff7 \ufff2\ufff9\ufff4\ufff8", "\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\ufffa￼￼\u001b\ufffb\u001c\u001d\u001e\u001f\u009f ¢£¤¥¦§©\u00ad®¶\u0095\u0096\u0097\u0098\u0099\u009a\u009b\u009c\u009d\u009e\ufff7 \ufff2\ufff3\ufff9\ufff8", "\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789:;<=>?"};

    public static getCaptureBundle TuitionPaymentFragmentbindingInflater1(byte[] bArr, int i) {
        String strValueOf;
        StringBuilder sb = new StringBuilder(144);
        if (i == 2 || i == 3) {
            if (i == 2) {
                strValueOf = new DecimalFormat("0000000000".substring(0, TuitionPaymentFragmentbindingInflater1(bArr, new byte[]{39, 40, 41, 42, 31, 32}))).format(TuitionPaymentFragmentbindingInflater1(bArr, new byte[]{33, 34, 35, 36, 25, 26, 27, 28, 29, 30, 19, 20, 21, 22, 23, 24, 13, 14, 15, 16, 17, 18, 7, 8, 9, 10, 11, 12, 1, 2}));
            } else {
                String[] strArr = b;
                strValueOf = String.valueOf(new char[]{strArr[0].charAt(TuitionPaymentFragmentbindingInflater1(bArr, new byte[]{39, 40, 41, 42, 31, 32})), strArr[0].charAt(TuitionPaymentFragmentbindingInflater1(bArr, new byte[]{33, 34, 35, 36, 25, 26})), strArr[0].charAt(TuitionPaymentFragmentbindingInflater1(bArr, new byte[]{27, 28, 29, 30, 19, 20})), strArr[0].charAt(TuitionPaymentFragmentbindingInflater1(bArr, new byte[]{21, 22, 23, 24, 13, 14})), strArr[0].charAt(TuitionPaymentFragmentbindingInflater1(bArr, new byte[]{15, 16, 17, 18, 7, 8})), strArr[0].charAt(TuitionPaymentFragmentbindingInflater1(bArr, new byte[]{9, 10, 11, 12, 1, 2}))});
            }
            DecimalFormat decimalFormat = new DecimalFormat("000");
            String str = decimalFormat.format(TuitionPaymentFragmentbindingInflater1(bArr, new byte[]{53, 54, 43, 44, 45, 46, 47, 48, 37, 38}));
            String str2 = decimalFormat.format(TuitionPaymentFragmentbindingInflater1(bArr, new byte[]{55, 56, 57, 58, 59, 60, 49, 50, 51, 52}));
            sb.append(TuitionPaymentFragmentspecialinlinedviewModeldefault2(bArr, 10, 84));
            if (sb.toString().startsWith("[)>\u001e01\u001d")) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(strValueOf);
                sb2.append((char) 29);
                sb2.append(str);
                sb2.append((char) 29);
                sb2.append(str2);
                sb2.append((char) 29);
                sb.insert(9, sb2.toString());
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(strValueOf);
                sb3.append((char) 29);
                sb3.append(str);
                sb3.append((char) 29);
                sb3.append(str2);
                sb3.append((char) 29);
                sb.insert(0, sb3.toString());
            }
        } else if (i == 4) {
            sb.append(TuitionPaymentFragmentspecialinlinedviewModeldefault2(bArr, 1, 93));
        } else if (i == 5) {
            sb.append(TuitionPaymentFragmentspecialinlinedviewModeldefault2(bArr, 1, 77));
        }
        return new getCaptureBundle(bArr, sb.toString(), null, String.valueOf(i));
    }

    private static int TuitionPaymentFragmentbindingInflater1(byte[] bArr, byte[] bArr2) {
        if (bArr2.length == 0) {
            throw new IllegalArgumentException();
        }
        int length = 0;
        for (int i = 0; i < bArr2.length; i++) {
            int i2 = bArr2[i] - 1;
            length += ((bArr[i2 / 6] & (1 << (5 - (i2 % 6)))) == 0 ? 0 : 1) << ((bArr2.length - i) - 1);
        }
        return length;
    }

    private static String TuitionPaymentFragmentspecialinlinedviewModeldefault2(byte[] bArr, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        int i3 = i;
        int i4 = -1;
        int i5 = 0;
        int i6 = 0;
        while (i3 < i + i2) {
            char cCharAt = b[i5].charAt(bArr[i3]);
            switch (cCharAt) {
                case 65520:
                case 65521:
                case 65522:
                case 65523:
                case 65524:
                    i6 = i5;
                    i5 = cCharAt - 65520;
                    i4 = 1;
                    break;
                case 65525:
                    i4 = 2;
                    i6 = i5;
                    i5 = 0;
                    break;
                case 65526:
                    i4 = 3;
                    i6 = i5;
                    i5 = 0;
                    break;
                case 65527:
                    i4 = -1;
                    i5 = i6;
                    i6 = i5;
                    i5 = 0;
                    break;
                case 65528:
                    i4 = -1;
                    i5 = 1;
                    break;
                case 65529:
                    i4 = -1;
                    break;
                case 65530:
                default:
                    sb.append(cCharAt);
                    break;
                case 65531:
                    byte b2 = bArr[i3 + 1];
                    byte b3 = bArr[i3 + 2];
                    byte b4 = bArr[i3 + 3];
                    byte b5 = bArr[i3 + 4];
                    i3 += 5;
                    sb.append(new DecimalFormat("000000000").format((b2 << 24) + (b3 << 18) + (b4 << 12) + (b5 << 6) + bArr[i3]));
                    break;
            }
            if (i4 == 0) {
                i5 = i6;
            }
            i3++;
            i4--;
        }
        while (sb.length() > 0 && sb.charAt(sb.length() - 1) == 65532) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }
}
