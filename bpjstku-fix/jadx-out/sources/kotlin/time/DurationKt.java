package kotlin.time;

import androidx.compose.animation.core.AnimationKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0013\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0007\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\t\u001a\u001c\u0010\f\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H\u0087\n¢\u0006\u0004\b\n\u0010\u000b\u001a\u001c\u0010\f\u001a\u00020\u0003*\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0003H\u0087\n¢\u0006\u0004\b\r\u0010\u000e\u001a\u001f\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a0\u0010\u0018\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u00002\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00100\u0016H\u0082\b¢\u0006\u0004\b\u0018\u0010\u0019\u001a0\u0010\u001a\u001a\u00020\u0000*\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u00002\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00100\u0016H\u0082\b¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0017\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001e\u0010\u001d\u001a\u0017\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001f\u0010\u001d\u001a\u0017\u0010 \u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0006H\u0002¢\u0006\u0004\b \u0010\u001d\u001a\u001f\u0010!\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0000H\u0002¢\u0006\u0004\b!\u0010\"\u001a\u0017\u0010#\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0006H\u0002¢\u0006\u0004\b#\u0010\u001d\u001a\u0017\u0010$\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0006H\u0002¢\u0006\u0004\b$\u0010\u001d\"\u0014\u0010%\u001a\u00020\u00008\u0000X\u0081T¢\u0006\u0006\n\u0004\b%\u0010&\"\u0014\u0010'\u001a\u00020\u00068\u0000X\u0081T¢\u0006\u0006\n\u0004\b'\u0010(\"\u0014\u0010)\u001a\u00020\u00068\u0000X\u0081T¢\u0006\u0006\n\u0004\b)\u0010(\"\u0014\u0010*\u001a\u00020\u00068\u0002X\u0083T¢\u0006\u0006\n\u0004\b*\u0010("}, d2 = {"", "Lkotlin/time/DurationUnit;", "p0", "Lkotlin/time/Duration;", "toDuration", "(ILkotlin/time/DurationUnit;)J", "", "(JLkotlin/time/DurationUnit;)J", "", "(DLkotlin/time/DurationUnit;)J", "times-mvk6XK0", "(IJ)J", "times", "times-kIfJnKk", "(DJ)J", "", "", "p1", "parseDuration", "(Ljava/lang/String;Z)J", "parseOverLongIsoComponent", "(Ljava/lang/String;)J", "Lkotlin/Function1;", "", "substringWhile", "(Ljava/lang/String;ILkotlin/jvm/functions/Function1;)Ljava/lang/String;", "skipWhile", "(Ljava/lang/String;ILkotlin/jvm/functions/Function1;)I", "nanosToMillis", "(J)J", "millisToNanos", "durationOfNanos", "durationOfMillis", "durationOf", "(JI)J", "durationOfNanosNormalized", "durationOfMillisNormalized", "NANOS_IN_MILLIS", "I", "MAX_NANOS", "J", "MAX_MILLIS", "MAX_NANOS_IN_MILLIS"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class DurationKt {
    public static final long MAX_MILLIS = 4611686018427387903L;
    public static final long MAX_NANOS = 4611686018426999999L;
    private static final long MAX_NANOS_IN_MILLIS = 4611686018426L;
    public static final int NANOS_IN_MILLIS = 1000000;

    /* JADX INFO: Access modifiers changed from: private */
    public static final long millisToNanos(long j) {
        return j * AnimationKt.MillisToNanos;
    }

    public static final long toDuration(int i, DurationUnit durationUnit) {
        Intrinsics.checkNotNullParameter(durationUnit, "");
        if (durationUnit.compareTo(DurationUnit.SECONDS) <= 0) {
            return durationOfNanos(DurationUnitKt.convertDurationUnitOverflow(i, durationUnit, DurationUnit.NANOSECONDS));
        }
        return toDuration(i, durationUnit);
    }

    public static final long toDuration(long j, DurationUnit durationUnit) {
        Intrinsics.checkNotNullParameter(durationUnit, "");
        long jConvertDurationUnitOverflow = DurationUnitKt.convertDurationUnitOverflow(MAX_NANOS, DurationUnit.NANOSECONDS, durationUnit);
        if ((-jConvertDurationUnitOverflow) <= j && j <= jConvertDurationUnitOverflow) {
            return durationOfNanos(DurationUnitKt.convertDurationUnitOverflow(j, durationUnit, DurationUnit.NANOSECONDS));
        }
        return durationOfMillis(RangesKt.coerceIn(DurationUnitKt.convertDurationUnit(j, durationUnit, DurationUnit.MILLISECONDS), -4611686018427387903L, 4611686018427387903L));
    }

    public static final long toDuration(double d, DurationUnit durationUnit) {
        Intrinsics.checkNotNullParameter(durationUnit, "");
        double dConvertDurationUnit = DurationUnitKt.convertDurationUnit(d, durationUnit, DurationUnit.NANOSECONDS);
        if (Double.isNaN(dConvertDurationUnit)) {
            throw new IllegalArgumentException("Duration value cannot be NaN.".toString());
        }
        long jRoundToLong = MathKt.roundToLong(dConvertDurationUnit);
        if (-4611686018426999999L <= jRoundToLong && jRoundToLong < 4611686018427000000L) {
            return durationOfNanos(jRoundToLong);
        }
        return durationOfMillisNormalized(MathKt.roundToLong(DurationUnitKt.convertDurationUnit(d, durationUnit, DurationUnit.MILLISECONDS)));
    }

    /* JADX INFO: renamed from: times-mvk6XK0, reason: not valid java name */
    private static final long m9471timesmvk6XK0(int i, long j) {
        return Duration.m9405timesUwyO8pc(j, i);
    }

    /* JADX INFO: renamed from: times-kIfJnKk, reason: not valid java name */
    private static final long m9470timeskIfJnKk(double d, long j) {
        return Duration.m9404timesUwyO8pc(j, d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long parseDuration(String str, boolean z) {
        long jM9403plusLRDsOJo;
        char cCharAt;
        char cCharAt2;
        long jM9403plusLRDsOJo2;
        char cCharAt3;
        int length = str.length();
        if (length == 0) {
            throw new IllegalArgumentException("The string is empty");
        }
        long jM9465getZEROUwyO8pc = Duration.INSTANCE.m9465getZEROUwyO8pc();
        char cCharAt4 = str.charAt(0);
        int length2 = (cCharAt4 == '+' || cCharAt4 == '-') ? 1 : 0;
        boolean z2 = length2 > 0;
        boolean z3 = z2 && StringsKt.startsWith$default((CharSequence) str, '-', false, 2, (Object) null);
        if (length <= length2) {
            throw new IllegalArgumentException("No components");
        }
        String str2 = "Unexpected order of duration components";
        char c = ':';
        char c2 = '0';
        if (str.charAt(length2) == 'P') {
            int i = length2 + 1;
            if (i == length) {
                throw new IllegalArgumentException();
            }
            boolean z4 = false;
            DurationUnit durationUnit = null;
            while (i < length) {
                if (str.charAt(i) != 'T') {
                    int i2 = i;
                    while (i2 < str.length() && ((c2 <= (cCharAt3 = str.charAt(i2)) && cCharAt3 < c) || StringsKt.contains$default((CharSequence) "+-.", cCharAt3, false, 2, (Object) null))) {
                        i2++;
                        c2 = '0';
                    }
                    Intrinsics.checkNotNull(str, "");
                    String strSubstring = str.substring(i, i2);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                    String str3 = strSubstring;
                    if (str3.length() == 0) {
                        throw new IllegalArgumentException();
                    }
                    int length3 = i + strSubstring.length();
                    String str4 = str;
                    if (length3 < 0 || length3 >= str4.length()) {
                        throw new IllegalArgumentException("Missing unit for value ".concat(String.valueOf(strSubstring)));
                    }
                    char cCharAt5 = str4.charAt(length3);
                    i = length3 + 1;
                    DurationUnit durationUnitDurationUnitByIsoChar = DurationUnitKt.durationUnitByIsoChar(cCharAt5, z4);
                    if (durationUnit != null && durationUnit.compareTo(durationUnitDurationUnitByIsoChar) <= 0) {
                        throw new IllegalArgumentException(str2);
                    }
                    int iIndexOf$default = StringsKt.indexOf$default((CharSequence) str3, '.', 0, false, 6, (Object) null);
                    if (durationUnitDurationUnitByIsoChar == DurationUnit.SECONDS && iIndexOf$default > 0) {
                        Intrinsics.checkNotNull(strSubstring, "");
                        String strSubstring2 = strSubstring.substring(0, iIndexOf$default);
                        Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
                        long jM9403plusLRDsOJo3 = Duration.m9403plusLRDsOJo(jM9465getZEROUwyO8pc, toDuration(parseOverLongIsoComponent(strSubstring2), durationUnitDurationUnitByIsoChar));
                        Intrinsics.checkNotNull(strSubstring, "");
                        String strSubstring3 = strSubstring.substring(iIndexOf$default);
                        Intrinsics.checkNotNullExpressionValue(strSubstring3, "");
                        jM9403plusLRDsOJo2 = Duration.m9403plusLRDsOJo(jM9403plusLRDsOJo3, toDuration(Double.parseDouble(strSubstring3), durationUnitDurationUnitByIsoChar));
                    } else {
                        jM9403plusLRDsOJo2 = Duration.m9403plusLRDsOJo(jM9465getZEROUwyO8pc, toDuration(parseOverLongIsoComponent(strSubstring), durationUnitDurationUnitByIsoChar));
                    }
                    jM9465getZEROUwyO8pc = jM9403plusLRDsOJo2;
                    durationUnit = durationUnitDurationUnitByIsoChar;
                    str2 = str2;
                    c2 = '0';
                    c = ':';
                } else {
                    if (z4 || (i = i + 1) == length) {
                        throw new IllegalArgumentException();
                    }
                    z4 = true;
                }
            }
        } else {
            if (z) {
                throw new IllegalArgumentException();
            }
            String str5 = "Unexpected order of duration components";
            String str6 = "";
            if (StringsKt.regionMatches(str, length2, "Infinity", 0, Math.max(length - length2, 8), true)) {
                jM9465getZEROUwyO8pc = Duration.INSTANCE.m9463getINFINITEUwyO8pc();
            } else {
                boolean z5 = !z2;
                if (z2 && str.charAt(1) == '(' && StringsKt.last(str) == ')') {
                    length2++;
                    length--;
                    if (2 == length) {
                        throw new IllegalArgumentException("No components");
                    }
                    z5 = true;
                }
                DurationUnit durationUnit2 = null;
                boolean z6 = false;
                while (length2 < length) {
                    if (z6 && z5) {
                        while (length2 < str.length() && str.charAt(length2) == ' ') {
                            length2++;
                        }
                    }
                    int i3 = length2;
                    while (i3 < str.length() && (('0' <= (cCharAt2 = str.charAt(i3)) && cCharAt2 < ':') || cCharAt2 == '.')) {
                        i3++;
                    }
                    String str7 = str6;
                    Intrinsics.checkNotNull(str, str7);
                    String strSubstring4 = str.substring(length2, i3);
                    Intrinsics.checkNotNullExpressionValue(strSubstring4, str7);
                    String str8 = strSubstring4;
                    if (str8.length() == 0) {
                        throw new IllegalArgumentException();
                    }
                    int length4 = length2 + strSubstring4.length();
                    int i4 = length4;
                    while (i4 < str.length() && 'a' <= (cCharAt = str.charAt(i4)) && cCharAt < '{') {
                        i4++;
                    }
                    Intrinsics.checkNotNull(str, str7);
                    String strSubstring5 = str.substring(length4, i4);
                    Intrinsics.checkNotNullExpressionValue(strSubstring5, str7);
                    length2 = length4 + strSubstring5.length();
                    DurationUnit durationUnitDurationUnitByShortName = DurationUnitKt.durationUnitByShortName(strSubstring5);
                    if (durationUnit2 != null && durationUnit2.compareTo(durationUnitDurationUnitByShortName) <= 0) {
                        throw new IllegalArgumentException(str5);
                    }
                    str5 = str5;
                    int iIndexOf$default2 = StringsKt.indexOf$default((CharSequence) str8, '.', 0, false, 6, (Object) null);
                    if (iIndexOf$default2 > 0) {
                        Intrinsics.checkNotNull(strSubstring4, str7);
                        String strSubstring6 = strSubstring4.substring(0, iIndexOf$default2);
                        Intrinsics.checkNotNullExpressionValue(strSubstring6, str7);
                        long jM9403plusLRDsOJo4 = Duration.m9403plusLRDsOJo(jM9465getZEROUwyO8pc, toDuration(Long.parseLong(strSubstring6), durationUnitDurationUnitByShortName));
                        Intrinsics.checkNotNull(strSubstring4, str7);
                        String strSubstring7 = strSubstring4.substring(iIndexOf$default2);
                        Intrinsics.checkNotNullExpressionValue(strSubstring7, str7);
                        jM9403plusLRDsOJo = Duration.m9403plusLRDsOJo(jM9403plusLRDsOJo4, toDuration(Double.parseDouble(strSubstring7), durationUnitDurationUnitByShortName));
                        if (length2 < length) {
                            throw new IllegalArgumentException("Fractional component must be last");
                        }
                    } else {
                        jM9403plusLRDsOJo = Duration.m9403plusLRDsOJo(jM9465getZEROUwyO8pc, toDuration(Long.parseLong(strSubstring4), durationUnitDurationUnitByShortName));
                    }
                    jM9465getZEROUwyO8pc = jM9403plusLRDsOJo;
                    str6 = str7;
                    durationUnit2 = durationUnitDurationUnitByShortName;
                    z6 = true;
                }
            }
        }
        return z3 ? Duration.m9418unaryMinusUwyO8pc(jM9465getZEROUwyO8pc) : jM9465getZEROUwyO8pc;
    }

    private static final long parseOverLongIsoComponent(String str) {
        char cCharAt;
        int length = str.length();
        int i = (length <= 0 || !StringsKt.contains$default((CharSequence) "+-", str.charAt(0), false, 2, (Object) null)) ? 0 : 1;
        if (length - i > 16) {
            int i2 = i;
            while (true) {
                if (i >= length) {
                    if (length - i2 <= 16) {
                        break;
                    }
                    return str.charAt(0) == '-' ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
                char cCharAt2 = str.charAt(i);
                if (cCharAt2 == '0') {
                    if (i2 == i) {
                        i2++;
                    }
                } else if ('1' > cCharAt2 || cCharAt2 >= ':') {
                    break;
                }
                i++;
            }
        }
        return (!StringsKt.startsWith$default(str, "+", false, 2, (Object) null) || length <= 1 || '0' > (cCharAt = str.charAt(1)) || cCharAt >= ':') ? Long.parseLong(str) : Long.parseLong(StringsKt.drop(str, 1));
    }

    private static final int skipWhile(String str, int i, Function1<? super Character, Boolean> function1) {
        while (i < str.length() && function1.invoke(Character.valueOf(str.charAt(i))).booleanValue()) {
            i++;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long nanosToMillis(long j) {
        return j / AnimationKt.MillisToNanos;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long durationOfNanos(long j) {
        return Duration.m9374constructorimpl(j << 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long durationOfMillis(long j) {
        return Duration.m9374constructorimpl((j << 1) + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long durationOf(long j, int i) {
        return Duration.m9374constructorimpl((j << 1) + ((long) i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long durationOfNanosNormalized(long j) {
        if (-4611686018426999999L <= j && j < 4611686018427000000L) {
            return durationOfNanos(j);
        }
        return durationOfMillis(nanosToMillis(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long durationOfMillisNormalized(long j) {
        if (-4611686018426L <= j && j < 4611686018427L) {
            return durationOfNanos(millisToNanos(j));
        }
        return durationOfMillis(RangesKt.coerceIn(j, -4611686018427387903L, 4611686018427387903L));
    }

    private static final String substringWhile(String str, int i, Function1<? super Character, Boolean> function1) {
        int i2 = i;
        while (i2 < str.length() && function1.invoke(Character.valueOf(str.charAt(i2))).booleanValue()) {
            i2++;
        }
        Intrinsics.checkNotNull(str, "");
        String strSubstring = str.substring(i, i2);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        return strSubstring;
    }
}
