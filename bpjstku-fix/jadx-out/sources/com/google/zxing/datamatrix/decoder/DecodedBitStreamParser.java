package com.google.zxing.datamatrix.decoder;

import androidx.recyclerview.widget.ItemTouchHelper;
import com.google.zxing.FormatException;
import defpackage.ImageCaptureConfig;
import defpackage.getCaptureBundle;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes6.dex */
public final class DecodedBitStreamParser {
    private static final char[] TuitionPaymentFragmentbindingInflater1;
    private static final char[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static final char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static final char[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static final char[] b = {'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    enum Mode {
        PAD_ENCODE,
        ASCII_ENCODE,
        C40_ENCODE,
        TEXT_ENCODE,
        ANSIX12_ENCODE,
        EDIFACT_ENCODE,
        BASE256_ENCODE
    }

    static {
        char[] cArr = {'!', Typography.quote, '#', Typography.dollar, '%', Typography.amp, '\'', '(', ')', '*', '+', ',', '-', '.', '/', ':', ';', Typography.less, '=', Typography.greater, '?', '@', '[', '\\', ']', '^', '_'};
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = cArr;
        TuitionPaymentFragmentbindingInflater1 = new char[]{'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new char[]{'`', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '{', '|', '}', '~', 127};
    }

    public static getCaptureBundle TuitionPaymentFragmentspecialinlinedviewModeldefault3(byte[] bArr) throws FormatException {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        char c;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        ImageCaptureConfig imageCaptureConfig = new ImageCaptureConfig(bArr);
        StringBuilder sb = new StringBuilder(100);
        int i = 0;
        StringBuilder sb2 = new StringBuilder(0);
        int i2 = 1;
        ArrayList arrayList = new ArrayList(1);
        Mode mode = Mode.ASCII_ENCODE;
        while (true) {
            char c2 = 29;
            int i3 = 254;
            if (mode == Mode.ASCII_ENCODE) {
                int i4 = i;
                while (true) {
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = imageCaptureConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault2(8);
                    if (iTuitionPaymentFragmentspecialinlinedviewModeldefault5 == 0) {
                        throw FormatException.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    }
                    if (iTuitionPaymentFragmentspecialinlinedviewModeldefault5 <= 128) {
                        if (i4 != 0) {
                            iTuitionPaymentFragmentspecialinlinedviewModeldefault5 += 128;
                        }
                        sb.append((char) (iTuitionPaymentFragmentspecialinlinedviewModeldefault5 - i2));
                        mode = Mode.ASCII_ENCODE;
                        break;
                    }
                    if (iTuitionPaymentFragmentspecialinlinedviewModeldefault5 == 129) {
                        mode = Mode.PAD_ENCODE;
                        break;
                    }
                    if (iTuitionPaymentFragmentspecialinlinedviewModeldefault5 <= 229) {
                        int i5 = iTuitionPaymentFragmentspecialinlinedviewModeldefault5 - 130;
                        if (i5 < 10) {
                            sb.append('0');
                        }
                        sb.append(i5);
                    } else {
                        if (iTuitionPaymentFragmentspecialinlinedviewModeldefault5 == 230) {
                            mode = Mode.C40_ENCODE;
                            break;
                        }
                        if (iTuitionPaymentFragmentspecialinlinedviewModeldefault5 == 231) {
                            mode = Mode.BASE256_ENCODE;
                            break;
                        }
                        if (iTuitionPaymentFragmentspecialinlinedviewModeldefault5 == 232) {
                            sb.append((char) 29);
                        } else if (iTuitionPaymentFragmentspecialinlinedviewModeldefault5 != 233 && iTuitionPaymentFragmentspecialinlinedviewModeldefault5 != 234) {
                            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault5 == 235) {
                                i4 = i2;
                            } else if (iTuitionPaymentFragmentspecialinlinedviewModeldefault5 == 236) {
                                sb.append("[)>\u001e05\u001d");
                                sb2.insert(i, "\u001e\u0004");
                            } else if (iTuitionPaymentFragmentspecialinlinedviewModeldefault5 == 237) {
                                sb.append("[)>\u001e06\u001d");
                                sb2.insert(i, "\u001e\u0004");
                            } else {
                                if (iTuitionPaymentFragmentspecialinlinedviewModeldefault5 == 238) {
                                    mode = Mode.ANSIX12_ENCODE;
                                    break;
                                }
                                if (iTuitionPaymentFragmentspecialinlinedviewModeldefault5 == 239) {
                                    mode = Mode.TEXT_ENCODE;
                                    break;
                                }
                                if (iTuitionPaymentFragmentspecialinlinedviewModeldefault5 == 240) {
                                    mode = Mode.EDIFACT_ENCODE;
                                    break;
                                }
                                if (iTuitionPaymentFragmentspecialinlinedviewModeldefault5 != 241 && iTuitionPaymentFragmentspecialinlinedviewModeldefault5 >= 242 && (iTuitionPaymentFragmentspecialinlinedviewModeldefault5 != 254 || ((imageCaptureConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault1.length - imageCaptureConfig.TuitionPaymentFragmentbindingInflater1) * 8) - imageCaptureConfig.b != 0)) {
                                    throw FormatException.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                }
                            }
                        }
                    }
                    if (((imageCaptureConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault1.length - imageCaptureConfig.TuitionPaymentFragmentbindingInflater1) * 8) - imageCaptureConfig.b <= 0) {
                        mode = Mode.ASCII_ENCODE;
                        break;
                    }
                }
            } else {
                int i6 = AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault2[mode.ordinal()];
                int i7 = 2;
                if (i6 == i2) {
                    int[] iArr = new int[3];
                    boolean z = false;
                    int i8 = 0;
                    while (((imageCaptureConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault1.length - imageCaptureConfig.TuitionPaymentFragmentbindingInflater1) * 8) - imageCaptureConfig.b != 8 && (iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = imageCaptureConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault2(8)) != 254) {
                        TuitionPaymentFragmentbindingInflater1(iTuitionPaymentFragmentspecialinlinedviewModeldefault2, imageCaptureConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault2(8), iArr);
                        int i9 = 0;
                        while (i9 < 3) {
                            int i10 = iArr[i9];
                            if (i8 != 0) {
                                if (i8 == i2) {
                                    c = 30;
                                    if (z) {
                                        sb.append((char) (i10 + 128));
                                        z = false;
                                    } else {
                                        sb.append((char) i10);
                                    }
                                } else if (i8 == 2) {
                                    char[] cArr = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                    if (i10 < cArr.length) {
                                        char c3 = cArr[i10];
                                        if (z) {
                                            sb.append((char) (c3 + 128));
                                            c = 30;
                                            z = false;
                                        } else {
                                            sb.append(c3);
                                            c = 30;
                                        }
                                    } else if (i10 == 27) {
                                        sb.append((char) 29);
                                        c = 30;
                                    } else {
                                        c = 30;
                                        if (i10 != 30) {
                                            throw FormatException.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                        }
                                        z = true;
                                    }
                                } else {
                                    if (i8 != 3) {
                                        throw FormatException.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                    }
                                    if (z) {
                                        sb.append((char) (i10 + 224));
                                        c = 30;
                                        z = false;
                                    } else {
                                        sb.append((char) (i10 + 96));
                                        c = 30;
                                    }
                                }
                                i8 = 0;
                            } else if (i10 < 3) {
                                i8 = i10 + 1;
                            } else {
                                char[] cArr2 = b;
                                if (i10 < cArr2.length) {
                                    char c4 = cArr2[i10];
                                    if (z) {
                                        sb.append((char) (c4 + 128));
                                        z = false;
                                    } else {
                                        sb.append(c4);
                                    }
                                } else {
                                    throw FormatException.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                }
                            }
                            i9++;
                            i2 = 1;
                        }
                        if (((imageCaptureConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault1.length - imageCaptureConfig.TuitionPaymentFragmentbindingInflater1) * 8) - imageCaptureConfig.b <= 0) {
                            break;
                        }
                        i2 = 1;
                    }
                } else if (i6 == 2) {
                    int[] iArr2 = new int[3];
                    int i11 = i;
                    int i12 = i11;
                    while (((imageCaptureConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault1.length - imageCaptureConfig.TuitionPaymentFragmentbindingInflater1) * 8) - imageCaptureConfig.b != 8 && (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = imageCaptureConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault2(8)) != i3) {
                        TuitionPaymentFragmentbindingInflater1(iTuitionPaymentFragmentspecialinlinedviewModeldefault3, imageCaptureConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault2(8), iArr2);
                        int i13 = i12;
                        int i14 = 0;
                        while (i14 < 3) {
                            int i15 = iArr2[i14];
                            if (i13 != 0) {
                                if (i13 != i2) {
                                    if (i13 == i7) {
                                        char[] cArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                        if (i15 < cArr3.length) {
                                            char c5 = cArr3[i15];
                                            if (i11 != 0) {
                                                sb.append((char) (c5 + 128));
                                                i11 = 0;
                                            } else {
                                                sb.append(c5);
                                            }
                                        } else if (i15 == 27) {
                                            sb.append(c2);
                                        } else {
                                            if (i15 != 30) {
                                                throw FormatException.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                            }
                                            i11 = i2;
                                        }
                                    } else if (i13 == 3) {
                                        char[] cArr4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                        if (i15 < cArr4.length) {
                                            char c6 = cArr4[i15];
                                            if (i11 != 0) {
                                                sb.append((char) (c6 + 128));
                                                i11 = 0;
                                            } else {
                                                sb.append(c6);
                                            }
                                        } else {
                                            throw FormatException.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                        }
                                    } else {
                                        throw FormatException.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                    }
                                } else if (i11 != 0) {
                                    sb.append((char) (i15 + 128));
                                    i11 = 0;
                                } else {
                                    sb.append((char) i15);
                                }
                                i13 = 0;
                            } else if (i15 < 3) {
                                i13 = i15 + 1;
                            } else {
                                char[] cArr5 = TuitionPaymentFragmentbindingInflater1;
                                if (i15 < cArr5.length) {
                                    char c7 = cArr5[i15];
                                    if (i11 != 0) {
                                        sb.append((char) (c7 + 128));
                                        i11 = 0;
                                    } else {
                                        sb.append(c7);
                                    }
                                } else {
                                    throw FormatException.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                }
                            }
                            i14++;
                            c2 = 29;
                            i7 = 2;
                        }
                        if (((imageCaptureConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault1.length - imageCaptureConfig.TuitionPaymentFragmentbindingInflater1) * 8) - imageCaptureConfig.b <= 0) {
                            break;
                        }
                        i12 = i13;
                        c2 = 29;
                        i3 = 254;
                        i7 = 2;
                    }
                } else if (i6 == 3) {
                    int[] iArr3 = new int[3];
                    while (((imageCaptureConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault1.length - imageCaptureConfig.TuitionPaymentFragmentbindingInflater1) * 8) - imageCaptureConfig.b != 8 && (iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = imageCaptureConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault2(8)) != 254) {
                        TuitionPaymentFragmentbindingInflater1(iTuitionPaymentFragmentspecialinlinedviewModeldefault4, imageCaptureConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault2(8), iArr3);
                        for (int i16 = i; i16 < 3; i16++) {
                            int i17 = iArr3[i16];
                            if (i17 == 0) {
                                sb.append('\r');
                            } else if (i17 == i2) {
                                sb.append('*');
                            } else if (i17 == 2) {
                                sb.append(Typography.greater);
                            } else if (i17 == 3) {
                                sb.append(' ');
                            } else if (i17 < 14) {
                                sb.append((char) (i17 + 44));
                            } else if (i17 < 40) {
                                sb.append((char) (i17 + 51));
                            } else {
                                throw FormatException.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                            }
                        }
                        if (((imageCaptureConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault1.length - imageCaptureConfig.TuitionPaymentFragmentbindingInflater1) * 8) - imageCaptureConfig.b <= 0) {
                            break;
                        }
                    }
                } else if (i6 != 4) {
                    if (i6 != 5) {
                        throw FormatException.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    }
                    int i18 = imageCaptureConfig.TuitionPaymentFragmentbindingInflater1;
                    int i19 = i18 + 2;
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = imageCaptureConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault2(8) - ((((i18 + 1) * 149) % 255) + i2);
                    if (iTuitionPaymentFragmentspecialinlinedviewModeldefault6 < 0) {
                        iTuitionPaymentFragmentspecialinlinedviewModeldefault6 += 256;
                    }
                    if (iTuitionPaymentFragmentspecialinlinedviewModeldefault6 == 0) {
                        iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = (((imageCaptureConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault1.length - imageCaptureConfig.TuitionPaymentFragmentbindingInflater1) * 8) - imageCaptureConfig.b) / 8;
                    } else if (iTuitionPaymentFragmentspecialinlinedviewModeldefault6 >= 250) {
                        int i20 = (iTuitionPaymentFragmentspecialinlinedviewModeldefault6 - 249) * ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION;
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault7 = imageCaptureConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault2(8) - (((i19 * 149) % 255) + i2);
                        if (iTuitionPaymentFragmentspecialinlinedviewModeldefault7 < 0) {
                            iTuitionPaymentFragmentspecialinlinedviewModeldefault7 += 256;
                        }
                        iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = i20 + iTuitionPaymentFragmentspecialinlinedviewModeldefault7;
                        i19 = i18 + 3;
                    }
                    if (iTuitionPaymentFragmentspecialinlinedviewModeldefault6 < 0) {
                        throw FormatException.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    }
                    byte[] bArr2 = new byte[iTuitionPaymentFragmentspecialinlinedviewModeldefault6];
                    int i21 = i;
                    while (i21 < iTuitionPaymentFragmentspecialinlinedviewModeldefault6) {
                        if (((imageCaptureConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault1.length - imageCaptureConfig.TuitionPaymentFragmentbindingInflater1) * 8) - imageCaptureConfig.b < 8) {
                            throw FormatException.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        }
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault8 = imageCaptureConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault2(8) - (((i19 * 149) % 255) + i2);
                        if (iTuitionPaymentFragmentspecialinlinedviewModeldefault8 < 0) {
                            iTuitionPaymentFragmentspecialinlinedviewModeldefault8 += 256;
                        }
                        bArr2[i21] = (byte) iTuitionPaymentFragmentspecialinlinedviewModeldefault8;
                        i21++;
                        i19++;
                    }
                    arrayList.add(bArr2);
                    try {
                        sb.append(new String(bArr2, "ISO8859_1"));
                    } catch (UnsupportedEncodingException e2) {
                        throw new IllegalStateException("Platform does not support required encoding: ".concat(String.valueOf(e2)));
                    }
                } else {
                    while (((imageCaptureConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault1.length - imageCaptureConfig.TuitionPaymentFragmentbindingInflater1) * 8) - imageCaptureConfig.b > 16) {
                        for (int i22 = i; i22 < 4; i22++) {
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault9 = imageCaptureConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault2(6);
                            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault9 != 31) {
                                if ((iTuitionPaymentFragmentspecialinlinedviewModeldefault9 & 32) == 0) {
                                    iTuitionPaymentFragmentspecialinlinedviewModeldefault9 |= 64;
                                }
                                sb.append((char) iTuitionPaymentFragmentspecialinlinedviewModeldefault9);
                            } else {
                                int i23 = 8 - imageCaptureConfig.b;
                                if (i23 == 8) {
                                    break;
                                }
                                imageCaptureConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault2(i23);
                                break;
                            }
                        }
                        if (((imageCaptureConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault1.length - imageCaptureConfig.TuitionPaymentFragmentbindingInflater1) * 8) - imageCaptureConfig.b <= 0) {
                            break;
                        }
                    }
                }
                mode = Mode.ASCII_ENCODE;
            }
            if (mode == Mode.PAD_ENCODE || ((imageCaptureConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault1.length - imageCaptureConfig.TuitionPaymentFragmentbindingInflater1) * 8) - imageCaptureConfig.b <= 0) {
                if (sb2.length() > 0) {
                    sb.append((CharSequence) sb2);
                }
                String string = sb.toString();
                if (arrayList.isEmpty()) {
                    arrayList = null;
                }
                return new getCaptureBundle(bArr, string, arrayList, null);
            }
            i = 0;
            i2 = 1;
        }
    }

    /* JADX INFO: renamed from: com.google.zxing.datamatrix.decoder.DecodedBitStreamParser$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        static {
            int[] iArr = new int[Mode.values().length];
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = iArr;
            try {
                iArr[Mode.C40_ENCODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault2[Mode.TEXT_ENCODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault2[Mode.ANSIX12_ENCODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault2[Mode.EDIFACT_ENCODE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault2[Mode.BASE256_ENCODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private static void TuitionPaymentFragmentbindingInflater1(int i, int i2, int[] iArr) {
        int i3 = ((i << 8) + i2) - 1;
        int i4 = i3 / 1600;
        iArr[0] = i4;
        int i5 = i3 - (i4 * 1600);
        int i6 = i5 / 40;
        iArr[1] = i6;
        iArr[2] = i5 - (i6 * 40);
    }
}
