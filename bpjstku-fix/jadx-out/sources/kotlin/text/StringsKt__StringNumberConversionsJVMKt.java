package kotlin.text;

import androidx.exifinterface.media.ExifInterface;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0010\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\f\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b\u0004\u0010\u0007\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b\u0004\u0010\b\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b\u0004\u0010\n\u001a\u0016\u0010\f\u001a\u00020\u000b*\u0004\u0018\u00010\u0003H\u0087\b¢\u0006\u0004\b\f\u0010\r\u001a\u0014\u0010\u000e\u001a\u00020\u0000*\u00020\u0003H\u0087\b¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001c\u0010\u000e\u001a\u00020\u0000*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b\u000e\u0010\u0010\u001a\u0014\u0010\u0011\u001a\u00020\u0006*\u00020\u0003H\u0087\b¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001c\u0010\u0011\u001a\u00020\u0006*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b\u0011\u0010\u0013\u001a\u0014\u0010\u0014\u001a\u00020\u0001*\u00020\u0003H\u0087\b¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001c\u0010\u0014\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b\u0014\u0010\u0016\u001a\u0014\u0010\u0017\u001a\u00020\t*\u00020\u0003H\u0087\b¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001c\u0010\u0017\u001a\u00020\t*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b\u0017\u0010\u0019\u001a\u0014\u0010\u001b\u001a\u00020\u001a*\u00020\u0003H\u0087\b¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0014\u0010\u001e\u001a\u00020\u001d*\u00020\u0003H\u0087\b¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0015\u0010 \u001a\u0004\u0018\u00010\u001a*\u00020\u0003H\u0007¢\u0006\u0004\b \u0010!\u001a\u0015\u0010\"\u001a\u0004\u0018\u00010\u001d*\u00020\u0003H\u0007¢\u0006\u0004\b\"\u0010#\u001a\u0014\u0010%\u001a\u00020$*\u00020\u0003H\u0087\b¢\u0006\u0004\b%\u0010&\u001a\u001c\u0010%\u001a\u00020$*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b%\u0010'\u001a\u0015\u0010(\u001a\u0004\u0018\u00010$*\u00020\u0003H\u0007¢\u0006\u0004\b(\u0010&\u001a\u001d\u0010(\u001a\u0004\u0018\u00010$*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b(\u0010'\u001a\u0014\u0010*\u001a\u00020)*\u00020\u0003H\u0087\b¢\u0006\u0004\b*\u0010+\u001a\u001c\u0010*\u001a\u00020)*\u00020\u00032\u0006\u0010\u0002\u001a\u00020,H\u0087\b¢\u0006\u0004\b*\u0010-\u001a\u0015\u0010.\u001a\u0004\u0018\u00010)*\u00020\u0003H\u0007¢\u0006\u0004\b.\u0010+\u001a\u001d\u0010.\u001a\u0004\u0018\u00010)*\u00020\u00032\u0006\u0010\u0002\u001a\u00020,H\u0007¢\u0006\u0004\b.\u0010-\u001a4\u00102\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010/2\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u000000H\u0082\b¢\u0006\u0004\b2\u00103\u001a\u0017\u00104\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¢\u0006\u0004\b4\u0010\r\u001a\"\u00105\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u00101\u001a\u00020\u0001H\u0083\b¢\u0006\u0004\b5\u0010\b\u001a\u0014\u00107\u001a\u00020\u000b*\u000206H\u0083\b¢\u0006\u0004\b7\u00108\u001a\u0014\u00109\u001a\u00020\u000b*\u000206H\u0083\b¢\u0006\u0004\b9\u00108\u001a\u0014\u0010:\u001a\u00020\u0001*\u000206H\u0083\b¢\u0006\u0004\b:\u0010;\u001a8\u0010=\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u00101\u001a\u00020\u00012\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\u000b00H\u0083\b¢\u0006\u0004\b=\u0010>\u001a8\u0010?\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u00101\u001a\u00020\u00012\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\u000b00H\u0083\b¢\u0006\u0004\b?\u0010>\u001a@\u0010A\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u00101\u001a\u00020\u00012\u0006\u0010<\u001a\u00020\u000b2\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\u000b00H\u0083\b¢\u0006\u0004\bA\u0010B"}, d2 = {"", "", "p0", "", "toString", "(BI)Ljava/lang/String;", "", "(SI)Ljava/lang/String;", "(II)Ljava/lang/String;", "", "(JI)Ljava/lang/String;", "", "toBoolean", "(Ljava/lang/String;)Z", "toByte", "(Ljava/lang/String;)B", "(Ljava/lang/String;I)B", "toShort", "(Ljava/lang/String;)S", "(Ljava/lang/String;I)S", "toInt", "(Ljava/lang/String;)I", "(Ljava/lang/String;I)I", "toLong", "(Ljava/lang/String;)J", "(Ljava/lang/String;I)J", "", "toFloat", "(Ljava/lang/String;)F", "", "toDouble", "(Ljava/lang/String;)D", "toFloatOrNull", "(Ljava/lang/String;)Ljava/lang/Float;", "toDoubleOrNull", "(Ljava/lang/String;)Ljava/lang/Double;", "Ljava/math/BigInteger;", "toBigInteger", "(Ljava/lang/String;)Ljava/math/BigInteger;", "(Ljava/lang/String;I)Ljava/math/BigInteger;", "toBigIntegerOrNull", "Ljava/math/BigDecimal;", "toBigDecimal", "(Ljava/lang/String;)Ljava/math/BigDecimal;", "Ljava/math/MathContext;", "(Ljava/lang/String;Ljava/math/MathContext;)Ljava/math/BigDecimal;", "toBigDecimalOrNull", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function1;", "p1", "screenFloatValue$StringsKt__StringNumberConversionsJVMKt", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "isValidFloat$StringsKt__StringNumberConversionsJVMKt", "guessNamedFloatConstant$StringsKt__StringNumberConversionsJVMKt", "", "isAsciiDigit$StringsKt__StringNumberConversionsJVMKt", "(C)Z", "isHexLetter$StringsKt__StringNumberConversionsJVMKt", "asciiLetterToLowerCaseCode$StringsKt__StringNumberConversionsJVMKt", "(C)I", "p2", "advanceWhile$StringsKt__StringNumberConversionsJVMKt", "(Ljava/lang/String;IILkotlin/jvm/functions/Function1;)I", "backtrackWhile$StringsKt__StringNumberConversionsJVMKt", "p3", "advanceAndValidateMantissa$StringsKt__StringNumberConversionsJVMKt", "(Ljava/lang/String;IIZLkotlin/jvm/functions/Function1;)I"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/text/StringsKt")
public class StringsKt__StringNumberConversionsJVMKt extends StringsKt__StringBuilderKt {
    private static final int asciiLetterToLowerCaseCode$StringsKt__StringNumberConversionsJVMKt(char c) {
        return c | ' ';
    }

    private static final boolean isAsciiDigit$StringsKt__StringNumberConversionsJVMKt(char c) {
        return ((c + 65488) & 65535) < 10;
    }

    private static final boolean isHexLetter$StringsKt__StringNumberConversionsJVMKt(char c) {
        return (((c | ' ') + (-97)) & 65535) < 6;
    }

    private static final String toString(byte b, int i) {
        String string = Integer.toString(b, CharsKt.checkRadix(i));
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    private static final String toString(short s, int i) {
        String string = Integer.toString(s, CharsKt.checkRadix(i));
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    private static final String toString(int i, int i2) {
        String string = Integer.toString(i, CharsKt.checkRadix(i2));
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    private static final String toString(long j, int i) {
        String string = Long.toString(j, CharsKt.checkRadix(i));
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    private static final boolean toBoolean(String str) {
        return Boolean.parseBoolean(str);
    }

    private static final byte toByte(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Byte.parseByte(str);
    }

    private static final byte toByte(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return Byte.parseByte(str, CharsKt.checkRadix(i));
    }

    private static final short toShort(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Short.parseShort(str);
    }

    private static final short toShort(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return Short.parseShort(str, CharsKt.checkRadix(i));
    }

    private static final int toInt(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Integer.parseInt(str);
    }

    private static final int toInt(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return Integer.parseInt(str, CharsKt.checkRadix(i));
    }

    private static final long toLong(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Long.parseLong(str);
    }

    private static final long toLong(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return Long.parseLong(str, CharsKt.checkRadix(i));
    }

    private static final float toFloat(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Float.parseFloat(str);
    }

    private static final double toDouble(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Double.parseDouble(str);
    }

    private static final BigInteger toBigInteger(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new BigInteger(str);
    }

    private static final BigInteger toBigInteger(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return new BigInteger(str, CharsKt.checkRadix(i));
    }

    public static final BigInteger toBigIntegerOrNull(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return StringsKt.toBigIntegerOrNull(str, 10);
    }

    public static final BigInteger toBigIntegerOrNull(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        CharsKt.checkRadix(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        if (length == 1) {
            if (CharsKt.digitOf(str.charAt(0), i) < 0) {
                return null;
            }
        } else {
            for (int i2 = str.charAt(0) != '-' ? 0 : 1; i2 < length; i2++) {
                if (CharsKt.digitOf(str.charAt(i2), i) < 0) {
                    return null;
                }
            }
        }
        return new BigInteger(str, CharsKt.checkRadix(i));
    }

    private static final BigDecimal toBigDecimal(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new BigDecimal(str);
    }

    private static final BigDecimal toBigDecimal(String str, MathContext mathContext) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mathContext, "");
        return new BigDecimal(str, mathContext);
    }

    private static final <T> T screenFloatValue$StringsKt__StringNumberConversionsJVMKt(String str, Function1<? super String, ? extends T> function1) {
        try {
            if (isValidFloat$StringsKt__StringNumberConversionsJVMKt(str)) {
                return function1.invoke(str);
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b3  */
    private static final boolean isValidFloat$StringsKt__StringNumberConversionsJVMKt(String str) {
        boolean z;
        int i;
        boolean z2;
        String str2;
        boolean z3;
        int length = str.length() - 1;
        int i2 = 0;
        while (i2 <= length && str.charAt(i2) <= ' ') {
            i2++;
        }
        if (i2 > length) {
            return false;
        }
        while (length > i2 && str.charAt(length) <= ' ') {
            length--;
        }
        if (str.charAt(i2) == '+' || str.charAt(i2) == '-') {
            i2++;
        }
        if (i2 > length) {
            return false;
        }
        if (str.charAt(i2) != '0') {
            z = false;
        } else {
            int i3 = i2 + 1;
            if (i3 > length) {
                return true;
            }
            if ((str.charAt(i3) | ' ') == 120) {
                int i4 = i2 + 2;
                int i5 = i4;
                while (i5 <= length) {
                    char cCharAt = str.charAt(i5);
                    if (((cCharAt - '0') & 65535) >= 10 && (((cCharAt | ' ') - 97) & 65535) >= 6) {
                        break;
                    }
                    i5++;
                }
                boolean z4 = i4 != i5;
                if (i5 <= length) {
                    if (str.charAt(i5) == '.') {
                        int i6 = i5 + 1;
                        int i7 = i6;
                        while (i7 <= length) {
                            char cCharAt2 = str.charAt(i7);
                            if (((cCharAt2 - '0') & 65535) >= 10 && (((cCharAt2 | ' ') - 97) & 65535) >= 6) {
                                break;
                            }
                            i7++;
                        }
                        if (i6 != i7) {
                            i5 = i7;
                            z3 = true;
                        } else {
                            i5 = i7;
                            z3 = false;
                        }
                    } else {
                        z3 = false;
                    }
                    if (z4 || z3) {
                        i2 = i5;
                    } else {
                        i2 = -1;
                    }
                } else {
                    i2 = -1;
                }
                if (i2 == -1 || i2 > length) {
                    return false;
                }
                z = true;
            } else {
                z = false;
            }
        }
        if (!z) {
            int i8 = i2;
            while (i8 <= length && ((str.charAt(i8) - '0') & 65535) < 10) {
                i8++;
            }
            boolean z5 = i2 != i8;
            if (i8 > length) {
                i2 = i8;
            } else {
                if (str.charAt(i8) == '.') {
                    int i9 = i8 + 1;
                    i = i9;
                    while (i <= length && ((str.charAt(i) - '0') & 65535) < 10) {
                        i++;
                    }
                    if (i9 != i) {
                        z2 = true;
                    } else {
                        i8 = i;
                        i = i8;
                        z2 = false;
                    }
                } else {
                    i = i8;
                    z2 = false;
                }
                if (z5 || z2) {
                    i2 = i;
                } else {
                    if (length == i + 2) {
                        str2 = "NaN";
                    } else {
                        str2 = length == i + 7 ? "Infinity" : null;
                    }
                    i2 = (str2 != null && StringsKt.indexOf((CharSequence) str, str2, i, false) == i) ? length + 1 : -1;
                }
            }
            if (i2 == -1) {
                return false;
            }
            if (i2 > length) {
                return true;
            }
        }
        int i10 = i2 + 1;
        int iCharAt = str.charAt(i2) | ' ';
        if (iCharAt != (z ? 112 : 101)) {
            return !z && (iCharAt == 102 || iCharAt == 100) && i10 > length;
        }
        if (i10 > length) {
            return false;
        }
        if ((str.charAt(i10) == '+' || str.charAt(i10) == '-') && (i10 = i2 + 2) > length) {
            return false;
        }
        while (i10 <= length && ((str.charAt(i10) - '0') & 65535) < 10) {
            i10++;
        }
        if (i10 > length) {
            return true;
        }
        if (i10 != length) {
            return false;
        }
        int iCharAt2 = str.charAt(i10) | ' ';
        return iCharAt2 == 102 || iCharAt2 == 100;
    }

    private static final String guessNamedFloatConstant$StringsKt__StringNumberConversionsJVMKt(int i, int i2) {
        if (i2 == i + 2) {
            return "NaN";
        }
        if (i2 == i + 7) {
            return "Infinity";
        }
        return null;
    }

    private static final int advanceWhile$StringsKt__StringNumberConversionsJVMKt(String str, int i, int i2, Function1<? super Character, Boolean> function1) {
        while (i <= i2 && function1.invoke(Character.valueOf(str.charAt(i))).booleanValue()) {
            i++;
        }
        return i;
    }

    private static final int backtrackWhile$StringsKt__StringNumberConversionsJVMKt(String str, int i, int i2, Function1<? super Character, Boolean> function1) {
        while (i2 > i && function1.invoke(Character.valueOf(str.charAt(i2))).booleanValue()) {
            i2--;
        }
        return i2;
    }

    private static final int advanceAndValidateMantissa$StringsKt__StringNumberConversionsJVMKt(String str, int i, int i2, boolean z, Function1<? super Character, Boolean> function1) {
        boolean z2;
        String str2;
        int i3 = i;
        while (i3 <= i2 && function1.invoke(Character.valueOf(str.charAt(i3))).booleanValue()) {
            i3++;
        }
        boolean z3 = i != i3;
        if (i3 > i2) {
            if (z) {
                return -1;
            }
            return i3;
        }
        if (str.charAt(i3) == '.') {
            int i4 = i3 + 1;
            int i5 = i4;
            while (i5 <= i2 && function1.invoke(Character.valueOf(str.charAt(i5))).booleanValue()) {
                i5++;
            }
            z2 = i4 != i5;
            i3 = i5;
        } else {
            z2 = false;
        }
        if (z3 || z2) {
            return i3;
        }
        if (z) {
            return -1;
        }
        if (i2 == i3 + 2) {
            str2 = "NaN";
        } else {
            str2 = i2 == i3 + 7 ? "Infinity" : null;
        }
        if (str2 != null && StringsKt.indexOf((CharSequence) str, str2, i3, false) == i3) {
            return i2 + 1;
        }
        return -1;
    }

    public static final Float toFloatOrNull(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            if (isValidFloat$StringsKt__StringNumberConversionsJVMKt(str)) {
                return Float.valueOf(Float.parseFloat(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static final Double toDoubleOrNull(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            if (isValidFloat$StringsKt__StringNumberConversionsJVMKt(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static final BigDecimal toBigDecimalOrNull(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            if (isValidFloat$StringsKt__StringNumberConversionsJVMKt(str)) {
                return new BigDecimal(str);
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static final BigDecimal toBigDecimalOrNull(String str, MathContext mathContext) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mathContext, "");
        try {
            if (isValidFloat$StringsKt__StringNumberConversionsJVMKt(str)) {
                return new BigDecimal(str, mathContext);
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
