package com.google.zxing.aztec.decoder;

import androidx.exifinterface.media.ExifInterface;
import com.google.zxing.FormatException;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import defpackage.ImageInputConfigBuilder;
import defpackage.canResolveUnderSpecifiedTo;
import defpackage.getBufferFormat;
import defpackage.getCaptureBundle;
import defpackage.getDefaultResolution;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class Decoder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private canResolveUnderSpecifiedTo f832a;
    private static final String[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {"CTRL_PS", " ", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "C", "D", ExifInterface.LONGITUDE_EAST, "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", ExifInterface.LATITUDE_SOUTH, ExifInterface.GPS_DIRECTION_TRUE, "U", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, ExifInterface.LONGITUDE_WEST, "X", "Y", "Z", "CTRL_LL", "CTRL_ML", "CTRL_DL", "CTRL_BS"};
    private static final String[] TuitionPaymentFragmentbindingInflater1 = {"CTRL_PS", " ", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "CTRL_US", "CTRL_ML", "CTRL_DL", "CTRL_BS"};
    private static final String[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = {"CTRL_PS", " ", "\u0001", "\u0002", "\u0003", "\u0004", "\u0005", "\u0006", "\u0007", "\b", "\t", "\n", "\u000b", "\f", "\r", "\u001b", "\u001c", "\u001d", "\u001e", "\u001f", "@", "\\", "^", "_", "`", "|", "~", "\u007f", "CTRL_LL", "CTRL_UL", "CTRL_PL", "CTRL_BS"};
    private static final String[] b = {"", "\r", "\r\n", ". ", ", ", ": ", "!", "\"", "#", "$", "%", "&", "'", "(", ")", "*", "+", ",", "-", ".", "/", ":", ";", "<", "=", ">", "?", "[", "]", "{", "}", "CTRL_UL"};
    private static final String[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {"CTRL_PS", " ", "0", "1", ExifInterface.GPS_MEASUREMENT_2D, ExifInterface.GPS_MEASUREMENT_3D, "4", "5", "6", "7", "8", "9", ",", ".", "CTRL_UL", "CTRL_US"};

    enum Table {
        UPPER,
        LOWER,
        MIXED,
        DIGIT,
        PUNCT,
        BINARY
    }

    public final getCaptureBundle TuitionPaymentFragmentbindingInflater1(canResolveUnderSpecifiedTo canresolveunderspecifiedto) throws FormatException {
        this.f832a = canresolveunderspecifiedto;
        boolean[] zArrTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(b(canresolveunderspecifiedto.b));
        getCaptureBundle getcapturebundle = new getCaptureBundle(TuitionPaymentFragmentspecialinlinedviewModeldefault2(zArrTuitionPaymentFragmentspecialinlinedviewModeldefault3), TuitionPaymentFragmentspecialinlinedviewModeldefault1(zArrTuitionPaymentFragmentspecialinlinedviewModeldefault3), null, null);
        getcapturebundle.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = zArrTuitionPaymentFragmentspecialinlinedviewModeldefault3.length;
        return getcapturebundle;
    }

    private static String TuitionPaymentFragmentspecialinlinedviewModeldefault1(boolean[] zArr) {
        String str;
        int length = zArr.length;
        Table table = Table.UPPER;
        Table table2 = Table.UPPER;
        StringBuilder sb = new StringBuilder(20);
        int i = 0;
        loop0: while (true) {
            Table table3 = table2;
            table2 = table;
            table = table3;
            while (true) {
                if (i < length) {
                    if (table != Table.BINARY) {
                        int i2 = table == Table.DIGIT ? 4 : 5;
                        if (length - i < i2) {
                            break loop0;
                        }
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(zArr, i, i2);
                        i += i2;
                        int i3 = AnonymousClass5.TuitionPaymentFragmentspecialinlinedviewModeldefault3[table.ordinal()];
                        if (i3 == 1) {
                            str = TuitionPaymentFragmentspecialinlinedviewModeldefault1[iTuitionPaymentFragmentspecialinlinedviewModeldefault1];
                        } else if (i3 == 2) {
                            str = TuitionPaymentFragmentbindingInflater1[iTuitionPaymentFragmentspecialinlinedviewModeldefault1];
                        } else if (i3 == 3) {
                            str = TuitionPaymentFragmentspecialinlinedviewModeldefault3[iTuitionPaymentFragmentspecialinlinedviewModeldefault1];
                        } else if (i3 == 4) {
                            str = b[iTuitionPaymentFragmentspecialinlinedviewModeldefault1];
                        } else if (i3 == 5) {
                            str = TuitionPaymentFragmentspecialinlinedviewModeldefault2[iTuitionPaymentFragmentspecialinlinedviewModeldefault1];
                        } else {
                            throw new IllegalStateException("Bad table");
                        }
                        if (str.startsWith("CTRL_")) {
                            char cCharAt = str.charAt(5);
                            if (cCharAt == 'B') {
                                table2 = Table.BINARY;
                            } else if (cCharAt == 'D') {
                                table2 = Table.DIGIT;
                            } else if (cCharAt == 'P') {
                                table2 = Table.PUNCT;
                            } else if (cCharAt == 'L') {
                                table2 = Table.LOWER;
                            } else if (cCharAt == 'M') {
                                table2 = Table.MIXED;
                            } else {
                                table2 = Table.UPPER;
                            }
                            if (str.charAt(6) != 'L') {
                                break;
                            }
                        } else {
                            sb.append(str);
                        }
                        table = table2;
                    } else {
                        if (length - i < 5) {
                            break loop0;
                        }
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(zArr, i, 5);
                        int i4 = i + 5;
                        if (iTuitionPaymentFragmentspecialinlinedviewModeldefault2 == 0) {
                            if (length - i4 < 11) {
                                break loop0;
                            }
                            iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(zArr, i4, 11) + 31;
                            i4 = i + 16;
                        }
                        int i5 = 0;
                        while (true) {
                            if (i5 >= iTuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                                i = i4;
                                break;
                            }
                            if (length - i4 < 8) {
                                i = length;
                                break;
                            }
                            sb.append((char) TuitionPaymentFragmentspecialinlinedviewModeldefault1(zArr, i4, 8));
                            i4 += 8;
                            i5++;
                        }
                        table = table2;
                    }
                } else {
                    break loop0;
                }
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: com.google.zxing.aztec.decoder.Decoder$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        static {
            int[] iArr = new int[Table.values().length];
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iArr;
            try {
                iArr[Table.UPPER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3[Table.LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3[Table.MIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3[Table.PUNCT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3[Table.DIGIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private boolean[] TuitionPaymentFragmentspecialinlinedviewModeldefault3(boolean[] zArr) throws FormatException {
        int i;
        ImageInputConfigBuilder imageInputConfigBuilder;
        if (this.f832a.TuitionPaymentFragmentspecialinlinedviewModeldefault1 <= 2) {
            imageInputConfigBuilder = ImageInputConfigBuilder.b;
            i = 6;
        } else {
            i = 8;
            if (this.f832a.TuitionPaymentFragmentspecialinlinedviewModeldefault1 <= 8) {
                imageInputConfigBuilder = ImageInputConfigBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            } else if (this.f832a.TuitionPaymentFragmentspecialinlinedviewModeldefault1 <= 22) {
                imageInputConfigBuilder = ImageInputConfigBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                i = 10;
            } else {
                imageInputConfigBuilder = ImageInputConfigBuilder.TuitionPaymentFragmentbindingInflater1;
                i = 12;
            }
        }
        int i2 = this.f832a.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int length = zArr.length / i;
        if (length < i2) {
            throw FormatException.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        }
        int length2 = zArr.length % i;
        int[] iArr = new int[length];
        int i3 = 0;
        while (i3 < length) {
            iArr[i3] = TuitionPaymentFragmentspecialinlinedviewModeldefault1(zArr, length2, i);
            i3++;
            length2 += i;
        }
        try {
            new getDefaultResolution(imageInputConfigBuilder).TuitionPaymentFragmentspecialinlinedviewModeldefault1(iArr, length - i2);
            int i4 = 1 << i;
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                int i7 = iArr[i6];
                if (i7 == 0 || i7 == i4 - 1) {
                    throw FormatException.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                }
                if (i7 == 1 || i7 == i4 - 2) {
                    i5++;
                }
            }
            boolean[] zArr2 = new boolean[(i2 * i) - i5];
            int i8 = 0;
            for (int i9 = 0; i9 < i2; i9++) {
                int i10 = iArr[i9];
                if (i10 == 1 || i10 == i4 - 2) {
                    Arrays.fill(zArr2, i8, (i8 + i) - 1, i10 > 1);
                    i8 += i - 1;
                } else {
                    int i11 = i - 1;
                    while (i11 >= 0) {
                        zArr2[i8] = ((1 << i11) & i10) != 0;
                        i11--;
                        i8++;
                    }
                }
            }
            return zArr2;
        } catch (ReedSolomonException e2) {
            throw FormatException.TuitionPaymentFragmentspecialinlinedviewModeldefault2(e2);
        }
    }

    private boolean[] b(getBufferFormat getbufferformat) {
        boolean z = this.f832a.TuitionPaymentFragmentbindingInflater1;
        int i = this.f832a.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i2 = (z ? 11 : 14) + (i << 2);
        int[] iArr = new int[i2];
        boolean[] zArr = new boolean[((z ? 88 : 112) + (i << 4)) * i];
        int i3 = 2;
        if (z) {
            for (int i4 = 0; i4 < i2; i4++) {
                iArr[i4] = i4;
            }
        } else {
            int i5 = i2 / 2;
            int i6 = ((i2 + 1) + (((i5 - 1) / 15) * 2)) / 2;
            for (int i7 = 0; i7 < i5; i7++) {
                int i8 = (i7 / 15) + i7;
                iArr[(i5 - i7) - 1] = (i6 - i8) - 1;
                iArr[i5 + i7] = i8 + i6 + 1;
            }
        }
        int i9 = 0;
        int i10 = 0;
        while (i9 < i) {
            int i11 = ((i - i9) << i3) + (z ? 9 : 12);
            int i12 = i9 << 1;
            int i13 = (i2 - 1) - i12;
            int i14 = 0;
            while (i14 < i11) {
                int i15 = i14 << 1;
                int i16 = 0;
                while (i16 < i3) {
                    int i17 = i12 + i16;
                    int i18 = i12 + i14;
                    zArr[i10 + i15 + i16] = getbufferformat.TuitionPaymentFragmentspecialinlinedviewModeldefault1(iArr[i17], iArr[i18]);
                    int i19 = iArr[i18];
                    int i20 = i13 - i16;
                    boolean z2 = z;
                    zArr[(i11 * 2) + i10 + i15 + i16] = getbufferformat.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i19, iArr[i20]);
                    int i21 = i13 - i14;
                    zArr[(i11 * 4) + i10 + i15 + i16] = getbufferformat.TuitionPaymentFragmentspecialinlinedviewModeldefault1(iArr[i20], iArr[i21]);
                    zArr[(i11 * 6) + i10 + i15 + i16] = getbufferformat.TuitionPaymentFragmentspecialinlinedviewModeldefault1(iArr[i21], iArr[i17]);
                    i16++;
                    z = z2;
                    i3 = 2;
                }
                i14++;
                i3 = 2;
            }
            i10 += i11 << 3;
            i9++;
            i3 = 2;
        }
        return zArr;
    }

    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1(boolean[] zArr, int i, int i2) {
        int i3 = 0;
        for (int i4 = i; i4 < i + i2; i4++) {
            i3 <<= 1;
            if (zArr[i4]) {
                i3 |= 1;
            }
        }
        return i3;
    }

    private static byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault2(boolean[] zArr) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int length = (zArr.length + 7) / 8;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i << 3;
            int length2 = zArr.length - i2;
            if (length2 >= 8) {
                iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(zArr, i2, 8);
            } else {
                iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(zArr, i2, length2) << (8 - length2);
            }
            bArr[i] = (byte) iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
        return bArr;
    }
}
