package com.google.zxing.pdf417.decoder;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.zxing.FormatException;
import com.google.zxing.common.CharacterSetECI;
import defpackage.QuirkSettingsLoader;
import defpackage.getCaptureBundle;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class DecodedBitStreamParser {
    private static final BigInteger[] TuitionPaymentFragmentbindingInflater1;
    private static final char[] b = ";<>@[\\]_`~!\r\t,:\n-.$/\"|*()?{}'".toCharArray();
    private static final char[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = "0123456789&\r\t,:#-.$/+%*=^".toCharArray();
    private static final Charset TuitionPaymentFragmentspecialinlinedviewModeldefault2 = Charset.forName("ISO-8859-1");

    enum Mode {
        ALPHA,
        LOWER,
        MIXED,
        PUNCT,
        ALPHA_SHIFT,
        PUNCT_SHIFT
    }

    static {
        BigInteger[] bigIntegerArr = new BigInteger[16];
        TuitionPaymentFragmentbindingInflater1 = bigIntegerArr;
        bigIntegerArr[0] = BigInteger.ONE;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(900L);
        bigIntegerArr[1] = bigIntegerValueOf;
        int i = 2;
        while (true) {
            BigInteger[] bigIntegerArr2 = TuitionPaymentFragmentbindingInflater1;
            if (i >= bigIntegerArr2.length) {
                return;
            }
            bigIntegerArr2[i] = bigIntegerArr2[i - 1].multiply(bigIntegerValueOf);
            i++;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x019e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:101:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:107:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:108:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:132:0x020a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0081  */
    /* JADX WARN: Code duplicated, block: B:69:0x0116  */
    /* JADX WARN: Code duplicated, block: B:96:0x0190  */
    /* JADX WARN: Code duplicated, block: B:99:0x0195 A[LOOP:6: B:98:0x0193->B:99:0x0195, LOOP_END] */
    public static getCaptureBundle TuitionPaymentFragmentspecialinlinedviewModeldefault2(int[] iArr, String str) throws IOException, FormatException {
        ByteArrayOutputStream byteArrayOutputStream;
        long j;
        int i;
        char c;
        boolean z;
        int i2;
        int i3;
        int i4;
        int[] iArr2;
        char c2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        StringBuilder sb = new StringBuilder(iArr.length << 1);
        Charset charset = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i10 = iArr[1];
        QuirkSettingsLoader quirkSettingsLoader = new QuirkSettingsLoader();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        while (true) {
            char c3 = 0;
            int i11 = iArr[0];
            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 < i11) {
                if (i10 != 913) {
                    int i12 = TypedValues.Custom.TYPE_FLOAT;
                    int i13 = 922;
                    int i14 = 900;
                    switch (i10) {
                        case 900:
                            iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(iArr, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, sb);
                            break;
                        case TypedValues.Custom.TYPE_FLOAT /* 901 */:
                            byteArrayOutputStream = new ByteArrayOutputStream();
                            if (i10 == 901) {
                                iArr2 = new int[6];
                                int i15 = iArr[iTuitionPaymentFragmentspecialinlinedviewModeldefault3];
                                iTuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                                long j2 = 0;
                                c2 = 0;
                                boolean z2 = false;
                                i5 = 0;
                                while (true) {
                                    i6 = iArr[c2];
                                    if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 >= i6 && !z2) {
                                        int i16 = i5 + 1;
                                        iArr2[i5] = i15;
                                        j2 = (j2 * 900) + ((long) i15);
                                        int i17 = iTuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1;
                                        i15 = iArr[iTuitionPaymentFragmentspecialinlinedviewModeldefault3];
                                        if (i15 == 900 || i15 == i12 || i15 == 902 || i15 == 924 || i15 == 928 || i15 == 923 || i15 == i13) {
                                            i5 = i16;
                                            i12 = TypedValues.Custom.TYPE_FLOAT;
                                            i13 = 922;
                                            c2 = 0;
                                            z2 = true;
                                        } else {
                                            if (i16 % 5 != 0 || i16 <= 0) {
                                                i5 = i16;
                                            } else {
                                                int i18 = 0;
                                                for (int i19 = 6; i18 < i19; i19 = 6) {
                                                    byteArrayOutputStream.write((byte) (j2 >> ((5 - i18) * 8)));
                                                    i18++;
                                                }
                                                j2 = 0;
                                                i5 = 0;
                                            }
                                            iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = i17;
                                            i12 = TypedValues.Custom.TYPE_FLOAT;
                                            i13 = 922;
                                            c2 = 0;
                                        }
                                    }
                                }
                                if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 == i6 || i15 >= 900) {
                                    i7 = i5;
                                } else {
                                    iArr2[i5] = i15;
                                    i7 = i5 + 1;
                                }
                                for (i8 = 0; i8 < i7; i8++) {
                                    byteArrayOutputStream.write((byte) iArr2[i8]);
                                }
                            } else if (i10 == 924) {
                                j = 0;
                                i = 0;
                                z = false;
                                for (c = 0; iTuitionPaymentFragmentspecialinlinedviewModeldefault3 < iArr[c] && !z; c = 0) {
                                    i2 = iTuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1;
                                    i3 = iArr[iTuitionPaymentFragmentspecialinlinedviewModeldefault3];
                                    if (i3 < i14) {
                                        i++;
                                        j = (j * 900) + ((long) i3);
                                        iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2;
                                    } else if (i3 != i14 || i3 == 901) {
                                        z = true;
                                    } else {
                                        if (i3 != 902 && i3 != 924 && i3 != 928 && i3 != 923) {
                                            if (i3 != 922) {
                                                iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2;
                                            }
                                        }
                                        z = true;
                                    }
                                    if (i % 5 == 0 || i <= 0) {
                                        i4 = iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                    } else {
                                        int i20 = 0;
                                        while (i20 < 6) {
                                            byteArrayOutputStream.write((byte) (j >> ((5 - i20) * 8)));
                                            i20++;
                                            iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                        }
                                        i4 = iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                        j = 0;
                                        i = 0;
                                    }
                                    iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4;
                                    i14 = 900;
                                }
                            }
                            sb.append(new String(byteArrayOutputStream.toByteArray(), charset));
                            break;
                        case TypedValues.Custom.TYPE_COLOR /* 902 */:
                            int[] iArr3 = new int[15];
                            boolean z3 = false;
                            int i21 = 0;
                            while (true) {
                                int i22 = iArr[c3];
                                if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 >= i22 || z3) {
                                    break;
                                } else {
                                    int i23 = iTuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1;
                                    int i24 = iArr[iTuitionPaymentFragmentspecialinlinedviewModeldefault3];
                                    if (i23 == i22) {
                                        z3 = true;
                                    }
                                    if (i24 < 900) {
                                        iArr3[i21] = i24;
                                        i21++;
                                    } else {
                                        if (i24 == 900 || i24 == 901 || i24 == 924 || i24 == 928 || i24 == 923 || i24 == 922) {
                                            i9 = i21;
                                            z3 = true;
                                        }
                                        if ((i9 % 15 != 0 || i24 == 902 || z3) && i9 > 0) {
                                            sb.append(TuitionPaymentFragmentspecialinlinedviewModeldefault3(iArr3, i9));
                                            c3 = 0;
                                            i21 = 0;
                                        } else {
                                            i21 = i9;
                                            c3 = 0;
                                        }
                                    }
                                    iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = i23;
                                    i9 = i21;
                                    if (i9 % 15 != 0) {
                                        sb.append(TuitionPaymentFragmentspecialinlinedviewModeldefault3(iArr3, i9));
                                        c3 = 0;
                                        i21 = 0;
                                    } else {
                                        sb.append(TuitionPaymentFragmentspecialinlinedviewModeldefault3(iArr3, i9));
                                        c3 = 0;
                                        i21 = 0;
                                    }
                                }
                            }
                            break;
                        default:
                            switch (i10) {
                                case 922:
                                case 923:
                                    throw FormatException.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                case 924:
                                    byteArrayOutputStream = new ByteArrayOutputStream();
                                    if (i10 == 901) {
                                        iArr2 = new int[6];
                                        int i110 = iArr[iTuitionPaymentFragmentspecialinlinedviewModeldefault3];
                                        iTuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                                        long j3 = 0;
                                        c2 = 0;
                                        boolean z4 = false;
                                        i5 = 0;
                                        while (true) {
                                            i6 = iArr[c2];
                                            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 >= i6) {
                                            }
                                            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 == i6) {
                                                i7 = i5;
                                            } else {
                                                i7 = i5;
                                            }
                                            while (i8 < i7) {
                                                byteArrayOutputStream.write((byte) iArr2[i8]);
                                            }
                                        }
                                    } else if (i10 == 924) {
                                        j = 0;
                                        i = 0;
                                        z = false;
                                        while (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 < iArr[c]) {
                                            i2 = iTuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1;
                                            i3 = iArr[iTuitionPaymentFragmentspecialinlinedviewModeldefault3];
                                            if (i3 < i14) {
                                                i++;
                                                j = (j * 900) + ((long) i3);
                                                iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2;
                                            } else {
                                                if (i3 != i14) {
                                                }
                                                z = true;
                                            }
                                            if (i % 5 == 0) {
                                                i4 = iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                            } else {
                                                i4 = iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                            }
                                            iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4;
                                            i14 = 900;
                                        }
                                    }
                                    sb.append(new String(byteArrayOutputStream.toByteArray(), charset));
                                    break;
                                case 925:
                                    iTuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                                    break;
                                case 926:
                                    iTuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                                    break;
                                case 927:
                                    Charset charsetForName = Charset.forName(CharacterSetECI.TuitionPaymentFragmentspecialinlinedviewModeldefault3(iArr[iTuitionPaymentFragmentspecialinlinedviewModeldefault3]).name());
                                    iTuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                                    charset = charsetForName;
                                    break;
                                case 928:
                                    if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 + 2 > i11) {
                                        throw FormatException.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                    }
                                    int[] iArr4 = new int[2];
                                    int i25 = 0;
                                    while (i25 < 2) {
                                        iArr4[i25] = iArr[iTuitionPaymentFragmentspecialinlinedviewModeldefault3];
                                        i25++;
                                        iTuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                                    }
                                    Integer.parseInt(TuitionPaymentFragmentspecialinlinedviewModeldefault3(iArr4, 2));
                                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(iArr, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, new StringBuilder());
                                    int i26 = iArr[iTuitionPaymentFragmentspecialinlinedviewModeldefault4];
                                    if (i26 == 923) {
                                        iTuitionPaymentFragmentspecialinlinedviewModeldefault4++;
                                        int[] iArr5 = new int[iArr[0] - iTuitionPaymentFragmentspecialinlinedviewModeldefault4];
                                        boolean z5 = false;
                                        int i27 = 0;
                                        for (char c4 = 0; iTuitionPaymentFragmentspecialinlinedviewModeldefault4 < iArr[c4] && !z5; c4 = 0) {
                                            int i28 = iArr[iTuitionPaymentFragmentspecialinlinedviewModeldefault4];
                                            if (i28 < 900) {
                                                iArr5[i27] = i28;
                                                i27++;
                                                iTuitionPaymentFragmentspecialinlinedviewModeldefault4++;
                                            } else {
                                                if (i28 != 922) {
                                                    throw FormatException.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                                }
                                                iTuitionPaymentFragmentspecialinlinedviewModeldefault4 += 2;
                                                z5 = true;
                                            }
                                        }
                                        Arrays.copyOf(iArr5, i27);
                                    } else if (i26 == 922) {
                                        iTuitionPaymentFragmentspecialinlinedviewModeldefault4++;
                                    }
                                    iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                                    break;
                                    break;
                                default:
                                    iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(iArr, iTuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1, sb);
                                    break;
                            }
                            break;
                    }
                } else {
                    sb.append((char) iArr[iTuitionPaymentFragmentspecialinlinedviewModeldefault3]);
                    iTuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                }
                if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 < iArr.length) {
                    i10 = iArr[iTuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    iTuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                } else {
                    throw FormatException.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                }
            } else {
                if (sb.length() == 0) {
                    throw FormatException.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                }
                getCaptureBundle getcapturebundle = new getCaptureBundle(null, sb.toString(), null, str);
                getcapturebundle.TuitionPaymentFragmentbindingInflater1 = quirkSettingsLoader;
                return getcapturebundle;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x002f. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x0032. Please report as an issue. */
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3(int[] iArr, int i, StringBuilder sb) {
        int i2 = (iArr[0] - i) << 1;
        int[] iArr2 = new int[i2];
        int[] iArr3 = new int[i2];
        boolean z = false;
        int i3 = 0;
        while (i < iArr[0] && !z) {
            int i4 = i + 1;
            int i5 = iArr[i];
            if (i5 < 900) {
                iArr2[i3] = i5 / 30;
                iArr2[i3 + 1] = i5 % 30;
                i3 += 2;
            } else if (i5 != 913) {
                if (i5 != 928) {
                    switch (i5) {
                        case 900:
                            iArr2[i3] = 900;
                            i3++;
                            break;
                        case TypedValues.Custom.TYPE_FLOAT /* 901 */:
                        case TypedValues.Custom.TYPE_COLOR /* 902 */:
                            break;
                        default:
                            switch (i5) {
                                case 922:
                                case 923:
                                case 924:
                                    break;
                                default:
                                    break;
                            }
                            break;
                    }
                }
                z = true;
            } else {
                iArr2[i3] = 913;
                i += 2;
                iArr3[i3] = iArr[i4];
                i3++;
            }
            i = i4;
        }
        TuitionPaymentFragmentbindingInflater1(iArr2, iArr3, i3, sb);
        return i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static void TuitionPaymentFragmentbindingInflater1(int[] iArr, int[] iArr2, int i, StringBuilder sb) {
        int i2;
        Mode mode = Mode.ALPHA;
        Mode mode2 = Mode.ALPHA;
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = iArr[i3];
            char c = ' ';
            switch (AnonymousClass5.TuitionPaymentFragmentspecialinlinedviewModeldefault3[mode.ordinal()]) {
                case 1:
                    if (i4 < 26) {
                        i2 = i4 + 65;
                        c = (char) i2;
                    } else if (i4 != 26) {
                        if (i4 == 27) {
                            mode = Mode.LOWER;
                        } else if (i4 != 28) {
                            if (i4 == 29) {
                                mode2 = Mode.PUNCT_SHIFT;
                            } else if (i4 == 913) {
                                sb.append((char) iArr2[i3]);
                            } else if (i4 == 900) {
                                mode = Mode.ALPHA;
                            }
                            c = 0;
                            Mode mode3 = mode2;
                            mode2 = mode;
                            mode = mode3;
                        } else {
                            mode = Mode.MIXED;
                        }
                        Mode mode4 = mode2;
                        mode2 = mode;
                        mode = mode4;
                        c = 0;
                        Mode mode5 = mode2;
                        mode2 = mode;
                        mode = mode5;
                    }
                    break;
                case 2:
                    if (i4 < 26) {
                        i2 = i4 + 97;
                        c = (char) i2;
                    } else if (i4 != 26) {
                        if (i4 == 27) {
                            mode2 = Mode.ALPHA_SHIFT;
                        } else {
                            if (i4 == 28) {
                                mode = Mode.MIXED;
                            } else if (i4 == 29) {
                                mode2 = Mode.PUNCT_SHIFT;
                            } else if (i4 == 913) {
                                sb.append((char) iArr2[i3]);
                            } else if (i4 == 900) {
                                mode = Mode.ALPHA;
                            }
                            Mode mode6 = mode2;
                            mode2 = mode;
                            mode = mode6;
                        }
                        c = 0;
                        Mode mode7 = mode2;
                        mode2 = mode;
                        mode = mode7;
                    }
                    break;
                case 3:
                    if (i4 < 25) {
                        c = TuitionPaymentFragmentspecialinlinedviewModeldefault1[i4];
                    } else {
                        if (i4 == 25) {
                            mode = Mode.PUNCT;
                        } else if (i4 != 26) {
                            if (i4 == 27) {
                                mode = Mode.LOWER;
                            } else if (i4 != 28) {
                                if (i4 == 29) {
                                    mode2 = Mode.PUNCT_SHIFT;
                                } else if (i4 == 913) {
                                    sb.append((char) iArr2[i3]);
                                } else if (i4 == 900) {
                                    mode = Mode.ALPHA;
                                }
                                c = 0;
                                Mode mode8 = mode2;
                                mode2 = mode;
                                mode = mode8;
                            } else {
                                mode = Mode.ALPHA;
                            }
                        }
                        Mode mode9 = mode2;
                        mode2 = mode;
                        mode = mode9;
                        c = 0;
                        Mode mode10 = mode2;
                        mode2 = mode;
                        mode = mode10;
                    }
                    break;
                case 4:
                    if (i4 < 29) {
                        c = b[i4];
                    } else {
                        if (i4 == 29) {
                            mode = Mode.ALPHA;
                        } else if (i4 == 913) {
                            sb.append((char) iArr2[i3]);
                        } else if (i4 == 900) {
                            mode = Mode.ALPHA;
                        }
                        Mode mode11 = mode2;
                        mode2 = mode;
                        mode = mode11;
                        c = 0;
                        Mode mode12 = mode2;
                        mode2 = mode;
                        mode = mode12;
                    }
                    break;
                case 5:
                    if (i4 < 26) {
                        c = (char) (i4 + 65);
                    } else if (i4 != 26) {
                        if (i4 == 900) {
                            mode = Mode.ALPHA;
                            Mode mode13 = mode2;
                            mode2 = mode;
                            mode = mode13;
                        } else {
                            mode = mode2;
                        }
                        c = 0;
                        Mode mode14 = mode2;
                        mode2 = mode;
                        mode = mode14;
                    }
                    mode = mode2;
                    break;
                case 6:
                    if (i4 < 29) {
                        c = b[i4];
                        mode = mode2;
                    } else {
                        if (i4 != 29) {
                            if (i4 != 913) {
                                if (i4 == 900) {
                                    mode = Mode.ALPHA;
                                }
                                c = 0;
                                Mode mode15 = mode2;
                                mode2 = mode;
                                mode = mode15;
                            } else {
                                sb.append((char) iArr2[i3]);
                            }
                            mode = mode2;
                            c = 0;
                            Mode mode16 = mode2;
                            mode2 = mode;
                            mode = mode16;
                        } else {
                            mode = Mode.ALPHA;
                        }
                        Mode mode17 = mode2;
                        mode2 = mode;
                        mode = mode17;
                        c = 0;
                        Mode mode18 = mode2;
                        mode2 = mode;
                        mode = mode18;
                    }
                    break;
                default:
                    Mode mode19 = mode2;
                    mode2 = mode;
                    mode = mode19;
                    c = 0;
                    Mode mode110 = mode2;
                    mode2 = mode;
                    mode = mode110;
                    break;
            }
            if (c != 0) {
                sb.append(c);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.zxing.pdf417.decoder.DecodedBitStreamParser$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        static {
            int[] iArr = new int[Mode.values().length];
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iArr;
            try {
                iArr[Mode.ALPHA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3[Mode.LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3[Mode.MIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3[Mode.PUNCT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3[Mode.ALPHA_SHIFT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3[Mode.PUNCT_SHIFT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private static String TuitionPaymentFragmentspecialinlinedviewModeldefault3(int[] iArr, int i) throws FormatException {
        BigInteger bigIntegerAdd = BigInteger.ZERO;
        for (int i2 = 0; i2 < i; i2++) {
            bigIntegerAdd = bigIntegerAdd.add(TuitionPaymentFragmentbindingInflater1[(i - i2) - 1].multiply(BigInteger.valueOf(iArr[i2])));
        }
        String string = bigIntegerAdd.toString();
        if (string.charAt(0) != '1') {
            throw FormatException.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        }
        return string.substring(1);
    }
}
