package defpackage;

import com.google.zxing.WriterException;
import com.google.zxing.common.CharacterSetECI;
import com.google.zxing.pdf417.encoder.Compaction;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.Arrays;
import kotlin.UByte;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes5.dex */
public final class getDeviceStateCallbacks {
    private static final byte[] TuitionPaymentFragmentbindingInflater1;
    private static final byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 38, 13, 9, 44, 58, 35, 45, 46, 36, 47, 43, 37, 42, Base64.padSymbol, 94, 0, 32, 0, 0, 0};
    private static final byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {59, 60, 62, 64, 91, 92, 93, 95, 96, 126, 33, 13, 9, 44, 58, 10, 45, 46, 36, 47, 34, 124, 42, 40, 41, 63, 123, 125, 39, 0};
    private static final byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new byte[128];
    private static final Charset b = Charset.forName("ISO-8859-1");

    static {
        byte[] bArr = new byte[128];
        TuitionPaymentFragmentbindingInflater1 = bArr;
        Arrays.fill(bArr, (byte) -1);
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (i2 >= bArr2.length) {
                break;
            }
            byte b2 = bArr2[i2];
            if (b2 > 0) {
                TuitionPaymentFragmentbindingInflater1[b2] = (byte) i2;
            }
            i2++;
        }
        Arrays.fill(TuitionPaymentFragmentspecialinlinedviewModeldefault2, (byte) -1);
        while (true) {
            byte[] bArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (i >= bArr3.length) {
                return;
            }
            byte b3 = bArr3[i];
            if (b3 > 0) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault2[b3] = (byte) i;
            }
            i++;
        }
    }

    public static String b(String str, Compaction compaction, Charset charset) throws WriterException {
        CharacterSetECI characterSetECITuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i;
        int i2;
        Charset charset2 = charset;
        StringBuilder sb = new StringBuilder(str.length());
        int i3 = 0;
        if (charset2 == null) {
            charset2 = b;
        } else if (!b.equals(charset2) && (characterSetECITuitionPaymentFragmentspecialinlinedviewModeldefault1 = CharacterSetECI.TuitionPaymentFragmentspecialinlinedviewModeldefault1(charset.name())) != null) {
            int i4 = characterSetECITuitionPaymentFragmentspecialinlinedviewModeldefault1.values[0];
            if (i4 >= 0 && i4 < 900) {
                sb.append((char) 927);
                sb.append((char) i4);
            } else if (i4 < 810900) {
                sb.append((char) 926);
                sb.append((char) ((i4 / 900) - 1));
                sb.append((char) (i4 % 900));
            } else if (i4 < 811800) {
                sb.append((char) 925);
                sb.append((char) (810900 - i4));
            } else {
                throw new WriterException("ECI number not in valid range from 0..811799, but was ".concat(String.valueOf(i4)));
            }
        }
        int length = str.length();
        if (compaction == Compaction.TEXT) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault1(str, 0, length, sb, 0);
        } else if (compaction == Compaction.BYTE) {
            byte[] bytes = str.getBytes(charset2);
            TuitionPaymentFragmentspecialinlinedviewModeldefault2(bytes, bytes.length, 1, sb);
        } else {
            char c = 902;
            if (compaction == Compaction.NUMERIC) {
                sb.append((char) 902);
                TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, 0, length, sb);
            } else {
                int i5 = 0;
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                int i6 = 0;
                while (i5 < length) {
                    int length2 = str.length();
                    if (i5 < length2) {
                        char cCharAt = str.charAt(i5);
                        int i7 = i5;
                        i = i3;
                        while (cCharAt >= '0' && cCharAt <= '9' && i7 < length2) {
                            i++;
                            i7++;
                            if (i7 < length2) {
                                cCharAt = str.charAt(i7);
                            }
                        }
                    } else {
                        i = i3;
                    }
                    if (i >= 13) {
                        sb.append(c);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, i5, i, sb);
                        i5 += i;
                        i6 = 2;
                        iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
                    } else {
                        int length3 = str.length();
                        int i8 = i5;
                        while (true) {
                            if (i8 < length3) {
                                char cCharAt2 = str.charAt(i8);
                                while (i3 < 13 && cCharAt2 >= '0' && cCharAt2 <= '9' && i8 < length3) {
                                    i3++;
                                    i8++;
                                    if (i8 < length3) {
                                        cCharAt2 = str.charAt(i8);
                                    }
                                }
                                if (i3 >= 13) {
                                    i2 = (i8 - i5) - i3;
                                    break;
                                }
                                if (i3 <= 0) {
                                    char cCharAt3 = str.charAt(i8);
                                    if (cCharAt3 == '\t' || cCharAt3 == '\n' || cCharAt3 == '\r' || (cCharAt3 >= ' ' && cCharAt3 <= '~')) {
                                        i8++;
                                    }
                                }
                                i3 = 0;
                            }
                            i2 = i8 - i5;
                            break;
                        }
                        if (i2 >= 5 || i == length) {
                            i3 = 0;
                            if (i6 != 0) {
                                sb.append((char) 900);
                                iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                                i6 = 0;
                            }
                            iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(str, i5, i2, sb, iTuitionPaymentFragmentspecialinlinedviewModeldefault1);
                            i5 += i2;
                        } else {
                            CharsetEncoder charsetEncoderNewEncoder = charset2.newEncoder();
                            int length4 = str.length();
                            int i9 = i5;
                            while (i9 < length4) {
                                char cCharAt4 = str.charAt(i9);
                                int i10 = 0;
                                while (i10 < 13 && cCharAt4 >= '0' && cCharAt4 <= '9') {
                                    i10++;
                                    int i11 = i9 + i10;
                                    if (i11 >= length4) {
                                        break;
                                    }
                                    cCharAt4 = str.charAt(i11);
                                }
                                if (i10 >= 13) {
                                    break;
                                }
                                char cCharAt5 = str.charAt(i9);
                                if (!charsetEncoderNewEncoder.canEncode(cCharAt5)) {
                                    StringBuilder sb2 = new StringBuilder("Non-encodable character detected: ");
                                    sb2.append(cCharAt5);
                                    sb2.append(" (Unicode: ");
                                    sb2.append((int) cCharAt5);
                                    sb2.append(')');
                                    throw new WriterException(sb2.toString());
                                }
                                i9++;
                            }
                            int i12 = i9 - i5;
                            if (i12 == 0) {
                                i12 = 1;
                            }
                            int i13 = i12 + i5;
                            byte[] bytes2 = str.substring(i5, i13).getBytes(charset2);
                            if (bytes2.length == 1 && i6 == 0) {
                                i3 = 0;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2(bytes2, 1, 0, sb);
                            } else {
                                i3 = 0;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2(bytes2, bytes2.length, i6, sb);
                                i6 = 1;
                                iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                            }
                            i5 = i13;
                        }
                        c = 902;
                    }
                }
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:109:0x000e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x0104 A[EDGE_INSN: B:85:0x0104->B:64:0x0104 BREAK  A[LOOP:0: B:3:0x000e->B:108:0x000e], SYNTHETIC] */
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1(CharSequence charSequence, int i, int i2, StringBuilder sb, int i3) {
        char cCharAt;
        StringBuilder sb2 = new StringBuilder(i2);
        int i4 = i3;
        int i5 = 0;
        while (true) {
            int i6 = i + i5;
            char cCharAt2 = charSequence.charAt(i6);
            if (i4 == 0) {
                if (cCharAt2 == ' ' || (cCharAt2 >= 'A' && cCharAt2 <= 'Z')) {
                    if (cCharAt2 == ' ') {
                        sb2.append((char) 26);
                    } else {
                        sb2.append((char) (cCharAt2 - 'A'));
                    }
                } else if (cCharAt2 == ' ' || (cCharAt2 >= 'a' && cCharAt2 <= 'z')) {
                    sb2.append((char) 27);
                    i4 = 1;
                } else if (TuitionPaymentFragmentbindingInflater1[cCharAt2] != -1) {
                    sb2.append((char) 28);
                    i4 = 2;
                } else {
                    sb2.append((char) 29);
                    sb2.append((char) TuitionPaymentFragmentspecialinlinedviewModeldefault2[cCharAt2]);
                }
                i5++;
                if (i5 >= i2) {
                    break;
                    break;
                }
            } else {
                if (i4 != 1) {
                    if (i4 != 2) {
                        byte b2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2[cCharAt2];
                        if (b2 != -1) {
                            sb2.append((char) b2);
                        } else {
                            sb2.append((char) 29);
                            i4 = 0;
                        }
                    } else {
                        byte b3 = TuitionPaymentFragmentbindingInflater1[cCharAt2];
                        if (b3 != -1) {
                            sb2.append((char) b3);
                        } else if (cCharAt2 == ' ' || (cCharAt2 >= 'A' && cCharAt2 <= 'Z')) {
                            sb2.append((char) 28);
                            i4 = 0;
                        } else if (cCharAt2 == ' ' || (cCharAt2 >= 'a' && cCharAt2 <= 'z')) {
                            sb2.append((char) 27);
                            i4 = 1;
                        } else {
                            int i7 = i6 + 1;
                            if (i7 < i2) {
                                if (TuitionPaymentFragmentspecialinlinedviewModeldefault2[charSequence.charAt(i7)] != -1) {
                                    sb2.append((char) 25);
                                    i4 = 3;
                                }
                            }
                            sb2.append((char) 29);
                            sb2.append((char) TuitionPaymentFragmentspecialinlinedviewModeldefault2[cCharAt2]);
                        }
                    }
                } else if (cCharAt2 == ' ' || (cCharAt2 >= 'a' && cCharAt2 <= 'z')) {
                    if (cCharAt2 == ' ') {
                        sb2.append((char) 26);
                    } else {
                        sb2.append((char) (cCharAt2 - 'a'));
                    }
                } else if (cCharAt2 == ' ' || (cCharAt2 >= 'A' && cCharAt2 <= 'Z')) {
                    sb2.append((char) 27);
                    sb2.append((char) (cCharAt2 - 'A'));
                } else if (TuitionPaymentFragmentbindingInflater1[cCharAt2] != -1) {
                    sb2.append((char) 28);
                    i4 = 2;
                } else {
                    sb2.append((char) 29);
                    sb2.append((char) TuitionPaymentFragmentspecialinlinedviewModeldefault2[cCharAt2]);
                }
                i5++;
                if (i5 >= i2) {
                    break;
                }
            }
        }
        int length = sb2.length();
        char c = 0;
        for (int i8 = 0; i8 < length; i8++) {
            if (i8 % 2 != 0) {
                cCharAt = (char) ((c * 30) + sb2.charAt(i8));
                sb.append(cCharAt);
            } else {
                cCharAt = sb2.charAt(i8);
            }
            c = cCharAt;
        }
        if (length % 2 != 0) {
            sb.append((char) ((c * 30) + 29));
        }
        return i4;
    }

    private static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(byte[] bArr, int i, int i2, StringBuilder sb) {
        if (i == 1 && i2 == 0) {
            sb.append((char) 913);
        } else if (i % 6 == 0) {
            sb.append((char) 924);
        } else {
            sb.append((char) 901);
        }
        int i3 = 0;
        if (i >= 6) {
            char[] cArr = new char[5];
            int i4 = 0;
            while (i - i4 >= 6) {
                long j = 0;
                for (int i5 = 0; i5 < 6; i5++) {
                    j = (j << 8) + ((long) (bArr[i4 + i5] & UByte.MAX_VALUE));
                }
                for (int i6 = 0; i6 < 5; i6++) {
                    cArr[i6] = (char) (j % 900);
                    j /= 900;
                }
                for (int i7 = 4; i7 >= 0; i7--) {
                    sb.append(cArr[i7]);
                }
                i4 += 6;
            }
            i3 = i4;
        }
        while (i3 < i) {
            sb.append((char) (bArr[i3] & UByte.MAX_VALUE));
            i3++;
        }
    }

    private static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str, int i, int i2, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder((i2 / 3) + 1);
        BigInteger bigIntegerValueOf = BigInteger.valueOf(900L);
        BigInteger bigIntegerValueOf2 = BigInteger.valueOf(0L);
        int i3 = 0;
        while (i3 < i2) {
            sb2.setLength(0);
            int iMin = Math.min(44, i2 - i3);
            StringBuilder sb3 = new StringBuilder("1");
            int i4 = i + i3;
            sb3.append(str.substring(i4, i4 + iMin));
            BigInteger bigInteger = new BigInteger(sb3.toString());
            do {
                sb2.append((char) bigInteger.mod(bigIntegerValueOf).intValue());
                bigInteger = bigInteger.divide(bigIntegerValueOf);
            } while (!bigInteger.equals(bigIntegerValueOf2));
            for (int length = sb2.length() - 1; length >= 0; length--) {
                sb.append(sb2.charAt(length));
            }
            i3 += iMin;
        }
    }
}
