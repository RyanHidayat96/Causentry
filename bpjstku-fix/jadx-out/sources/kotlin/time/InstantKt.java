package kotlin.time;

import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import java.io.IOException;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\u0015\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a.\u0010\r\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0082\b¢\u0006\u0004\b\r\u0010\u000e\u001a.\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0082\b¢\u0006\u0004\b\u000f\u0010\u000e\u001a\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0001\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001b\u0010\u0014\u001a\u00020\u0010*\u00020\u00102\u0006\u0010\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001b\u0010\u0016\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\"\u001f\u0010\u0018\u001a\u00020\u0011*\u00020\u00028Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019\"\u001f\u0010\u001c\u001a\u00020\u0011*\u00020\u00028Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001c\u0010\u0019\"\u0014\u0010\u001e\u001a\u00020\b8\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\"\u0014\u0010 \u001a\u00020\b8\u0002X\u0083T¢\u0006\u0006\n\u0004\b \u0010\u001f\"\u0014\u0010!\u001a\u00020\b8\u0002X\u0083T¢\u0006\u0006\n\u0004\b!\u0010\u001f\"\u0014\u0010\"\u001a\u00020\b8\u0002X\u0083T¢\u0006\u0006\n\u0004\b\"\u0010\u001f\"\u0014\u0010#\u001a\u00020\u00108\u0002X\u0083T¢\u0006\u0006\n\u0004\b#\u0010$\"\u0014\u0010%\u001a\u00020\u00108\u0002X\u0083T¢\u0006\u0006\n\u0004\b%\u0010$\"\u0014\u0010&\u001a\u00020\u00108\u0002X\u0083T¢\u0006\u0006\n\u0004\b&\u0010$\"\u0014\u0010'\u001a\u00020\u00108\u0002X\u0083T¢\u0006\u0006\n\u0004\b'\u0010$\"\u0014\u0010(\u001a\u00020\u00108\u0002X\u0083T¢\u0006\u0006\n\u0004\b(\u0010$\"\u0014\u0010)\u001a\u00020\u00108\u0002X\u0083T¢\u0006\u0006\n\u0004\b)\u0010$\"\u0014\u0010*\u001a\u00020\u00108\u0000X\u0081T¢\u0006\u0006\n\u0004\b*\u0010$\"\u0014\u0010+\u001a\u00020\u00108\u0002X\u0083T¢\u0006\u0006\n\u0004\b+\u0010$\"\u0014\u0010,\u001a\u00020\u00108\u0002X\u0083T¢\u0006\u0006\n\u0004\b,\u0010$\"\u0014\u0010.\u001a\u00020-8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b.\u0010/\"\u0014\u00100\u001a\u00020-8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b0\u0010/\"\u0014\u00101\u001a\u00020-8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b1\u0010/\"\u0014\u00102\u001a\u00020-8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b2\u0010/"}, d2 = {"", "p0", "Lkotlin/time/Instant;", "parseIso", "(Ljava/lang/CharSequence;)Lkotlin/time/Instant;", "", "formatIso", "(Lkotlin/time/Instant;)Ljava/lang/String;", "", "p1", "Lkotlin/Function0;", "", "p2", "safeAddOrElse", "(JJLkotlin/jvm/functions/Function0;)J", "safeMultiplyOrElse", "", "", "isLeapYear", "(I)Z", "monthLength", "(IZ)I", "truncateForErrorMessage", "(Ljava/lang/CharSequence;I)Ljava/lang/String;", "isDistantPast", "(Lkotlin/time/Instant;)Z", "isDistantPast$annotations", "(Lkotlin/time/Instant;)V", "isDistantFuture", "isDistantFuture$annotations", "DISTANT_PAST_SECONDS", "J", "DISTANT_FUTURE_SECONDS", "MIN_SECOND", "MAX_SECOND", "DAYS_PER_CYCLE", "I", "DAYS_0000_TO_1970", "SECONDS_PER_HOUR", "SECONDS_PER_MINUTE", "HOURS_PER_DAY", "SECONDS_PER_DAY", "NANOS_PER_SECOND", "NANOS_PER_MILLI", "MILLIS_PER_SECOND", "", "POWERS_OF_TEN", "[I", "asciiDigitPositionsInIsoStringAfterYear", "colonsInIsoOffsetString", "asciiDigitsInIsoOffsetString"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class InstantKt {
    private static final int DAYS_0000_TO_1970 = 719528;
    private static final int DAYS_PER_CYCLE = 146097;
    private static final long DISTANT_FUTURE_SECONDS = 3093527980800L;
    private static final long DISTANT_PAST_SECONDS = -3217862419201L;
    private static final int HOURS_PER_DAY = 24;
    private static final long MAX_SECOND = 31556889864403199L;
    private static final int MILLIS_PER_SECOND = 1000;
    private static final long MIN_SECOND = -31557014167219200L;
    private static final int NANOS_PER_MILLI = 1000000;
    public static final int NANOS_PER_SECOND = 1000000000;
    private static final int SECONDS_PER_DAY = 86400;
    private static final int SECONDS_PER_HOUR = 3600;
    private static final int SECONDS_PER_MINUTE = 60;
    private static final int[] POWERS_OF_TEN = {1, 10, 100, 1000, 10000, AndroidComposeViewAccessibilityDelegateCompat.ParcelSafeTextLength, 1000000, 10000000, 100000000, 1000000000};
    private static final int[] asciiDigitPositionsInIsoStringAfterYear = {1, 2, 4, 5, 7, 8, 10, 11, 13, 14};
    private static final int[] colonsInIsoOffsetString = {3, 6};
    private static final int[] asciiDigitsInIsoOffsetString = {1, 2, 4, 5, 7, 8};

    public static /* synthetic */ void isDistantFuture$annotations(Instant instant) {
    }

    public static /* synthetic */ void isDistantPast$annotations(Instant instant) {
    }

    private static final int monthLength(int i, boolean z) {
        if (i != 2) {
            return (i == 4 || i == 6 || i == 9 || i == 11) ? 30 : 31;
        }
        return z ? 29 : 28;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean parseIso$lambda$1(char c) {
        return c == '-';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean parseIso$lambda$2(char c) {
        return c == '-';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean parseIso$lambda$3(char c) {
        return c == 'T' || c == 't';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean parseIso$lambda$4(char c) {
        return c == ':';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean parseIso$lambda$5(char c) {
        return c == ':';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean parseIso$lambda$6(char c) {
        return '0' <= c && c < ':';
    }

    private static final boolean isDistantPast(Instant instant) {
        Intrinsics.checkNotNullParameter(instant, "");
        return instant.compareTo2(Instant.INSTANCE.getDISTANT_PAST()) <= 0;
    }

    private static final boolean isDistantFuture(Instant instant) {
        Intrinsics.checkNotNullParameter(instant, "");
        return instant.compareTo2(Instant.INSTANCE.getDISTANT_FUTURE()) >= 0;
    }

    private static final Void parseIso$parseFailure(CharSequence charSequence, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" when parsing an Instant from \"");
        sb.append(truncateForErrorMessage(charSequence, 64));
        sb.append(Typography.quote);
        throw new InstantFormatException(sb.toString());
    }

    private static final void parseIso$expect(CharSequence charSequence, String str, int i, Function1<? super Character, Boolean> function1) {
        char cCharAt = charSequence.charAt(i);
        if (function1.invoke(Character.valueOf(cCharAt)).booleanValue()) {
            return;
        }
        StringBuilder sb = new StringBuilder("Expected ");
        sb.append(str);
        sb.append(", but got '");
        sb.append(cCharAt);
        sb.append("' at position ");
        sb.append(i);
        parseIso$parseFailure(charSequence, sb.toString());
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Instant parseIso(CharSequence charSequence) {
        int i;
        int i2;
        int i3;
        char cCharAt;
        char cCharAt2;
        if (charSequence.length() <= 0) {
            throw new IllegalArgumentException("An empty string is not a valid Instant".toString());
        }
        char cCharAt3 = charSequence.charAt(0);
        if (cCharAt3 == '+' || cCharAt3 == '-') {
            i = 1;
        } else {
            i = 0;
            cCharAt3 = ' ';
        }
        int iCharAt = 0;
        int i4 = i;
        while (i4 < charSequence.length() && '0' <= (cCharAt2 = charSequence.charAt(i4)) && cCharAt2 < ':') {
            iCharAt = (iCharAt * 10) + (charSequence.charAt(i4) - '0');
            i4++;
        }
        int i5 = i4 - i;
        if (i5 > 10) {
            StringBuilder sb = new StringBuilder("Expected at most 10 digits for the year number, got ");
            sb.append(i5);
            sb.append(" digits");
            parseIso$parseFailure(charSequence, sb.toString());
            throw new KotlinNothingValueException();
        }
        if (i5 == 10 && Intrinsics.compare((int) charSequence.charAt(i), 50) >= 0) {
            StringBuilder sb2 = new StringBuilder("Expected at most 9 digits for the year number or year 1000000000, got ");
            sb2.append(i5);
            sb2.append(" digits");
            parseIso$parseFailure(charSequence, sb2.toString());
            throw new KotlinNothingValueException();
        }
        if (i5 < 4) {
            StringBuilder sb3 = new StringBuilder("The year number must be padded to 4 digits, got ");
            sb3.append(i5);
            sb3.append(" digits");
            parseIso$parseFailure(charSequence, sb3.toString());
            throw new KotlinNothingValueException();
        }
        if (cCharAt3 == '+' && i5 == 4) {
            parseIso$parseFailure(charSequence, "The '+' sign at the start is only valid for year numbers longer than 4 digits");
            throw new KotlinNothingValueException();
        }
        if (cCharAt3 == ' ' && i5 != 4) {
            parseIso$parseFailure(charSequence, "A '+' or '-' sign is required for year numbers longer than 4 digits");
            throw new KotlinNothingValueException();
        }
        if (cCharAt3 == '-') {
            iCharAt = -iCharAt;
        }
        int i6 = i4 + 16;
        if (charSequence.length() < i6) {
            parseIso$parseFailure(charSequence, "The input string is too short");
            throw new KotlinNothingValueException();
        }
        parseIso$expect(charSequence, "'-'", i4, new Function1() { // from class: kotlin.time.InstantKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(InstantKt.parseIso$lambda$1(((Character) obj).charValue()));
            }
        });
        parseIso$expect(charSequence, "'-'", i4 + 3, new Function1() { // from class: kotlin.time.InstantKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(InstantKt.parseIso$lambda$2(((Character) obj).charValue()));
            }
        });
        parseIso$expect(charSequence, "'T' or 't'", i4 + 6, new Function1() { // from class: kotlin.time.InstantKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(InstantKt.parseIso$lambda$3(((Character) obj).charValue()));
            }
        });
        parseIso$expect(charSequence, "':'", i4 + 9, new Function1() { // from class: kotlin.time.InstantKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(InstantKt.parseIso$lambda$4(((Character) obj).charValue()));
            }
        });
        parseIso$expect(charSequence, "':'", i4 + 12, new Function1() { // from class: kotlin.time.InstantKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(InstantKt.parseIso$lambda$5(((Character) obj).charValue()));
            }
        });
        for (int i7 : asciiDigitPositionsInIsoStringAfterYear) {
            parseIso$expect(charSequence, "an ASCII digit", i7 + i4, new Function1() { // from class: kotlin.time.InstantKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(InstantKt.parseIso$lambda$6(((Character) obj).charValue()));
                }
            });
        }
        int iso$twoDigitNumber = parseIso$twoDigitNumber(charSequence, i4 + 1);
        int iso$twoDigitNumber2 = parseIso$twoDigitNumber(charSequence, i4 + 4);
        int iso$twoDigitNumber3 = parseIso$twoDigitNumber(charSequence, i4 + 7);
        int iso$twoDigitNumber4 = parseIso$twoDigitNumber(charSequence, i4 + 10);
        int iso$twoDigitNumber5 = parseIso$twoDigitNumber(charSequence, i4 + 13);
        int i8 = i4 + 15;
        if (charSequence.charAt(i8) == '.') {
            i8 = i6;
            int iCharAt2 = 0;
            while (i8 < charSequence.length() && '0' <= (cCharAt = charSequence.charAt(i8)) && cCharAt < ':') {
                iCharAt2 = (iCharAt2 * 10) + (charSequence.charAt(i8) - '0');
                i8++;
            }
            int i9 = i8 - i6;
            if (i9 > 0 && i9 < 10) {
                i2 = iCharAt2 * POWERS_OF_TEN[9 - i9];
            } else {
                StringBuilder sb4 = new StringBuilder("1..9 digits are supported for the fraction of the second, got ");
                sb4.append(i9);
                sb4.append(" digits");
                parseIso$parseFailure(charSequence, sb4.toString());
                throw new KotlinNothingValueException();
            }
        } else {
            i2 = 0;
        }
        if (i8 >= charSequence.length()) {
            parseIso$parseFailure(charSequence, "The UTC offset at the end of the string is missing");
            throw new KotlinNothingValueException();
        }
        char cCharAt4 = charSequence.charAt(i8);
        if (cCharAt4 == '+' || cCharAt4 == '-') {
            int length = charSequence.length() - i8;
            if (length > 9) {
                StringBuilder sb5 = new StringBuilder("The UTC offset string \"");
                sb5.append(truncateForErrorMessage(charSequence.subSequence(i8, charSequence.length()).toString(), 16));
                sb5.append("\" is too long");
                parseIso$parseFailure(charSequence, sb5.toString());
                throw new KotlinNothingValueException();
            }
            if (length % 3 != 0) {
                StringBuilder sb6 = new StringBuilder("Invalid UTC offset string \"");
                sb6.append(charSequence.subSequence(i8, charSequence.length()).toString());
                sb6.append(Typography.quote);
                parseIso$parseFailure(charSequence, sb6.toString());
                throw new KotlinNothingValueException();
            }
            int[] iArr = colonsInIsoOffsetString;
            int length2 = iArr.length;
            int i10 = 0;
            while (i10 < length2) {
                int i11 = i8 + iArr[i10];
                if (i11 >= charSequence.length()) {
                    break;
                }
                int[] iArr2 = iArr;
                if (charSequence.charAt(i11) != ':') {
                    StringBuilder sb7 = new StringBuilder("Expected ':' at index ");
                    sb7.append(i11);
                    sb7.append(", got '");
                    sb7.append(charSequence.charAt(i11));
                    sb7.append('\'');
                    parseIso$parseFailure(charSequence, sb7.toString());
                    throw new KotlinNothingValueException();
                }
                i10++;
                iArr = iArr2;
            }
            int[] iArr3 = asciiDigitsInIsoOffsetString;
            int length3 = iArr3.length;
            int i12 = 0;
            while (i12 < length3) {
                int i13 = iArr3[i12] + i8;
                if (i13 >= charSequence.length()) {
                    break;
                }
                char cCharAt5 = charSequence.charAt(i13);
                int[] iArr4 = iArr3;
                if ('0' > cCharAt5 || cCharAt5 >= ':') {
                    StringBuilder sb8 = new StringBuilder("Expected an ASCII digit at index ");
                    sb8.append(i13);
                    sb8.append(", got '");
                    sb8.append(charSequence.charAt(i13));
                    sb8.append('\'');
                    parseIso$parseFailure(charSequence, sb8.toString());
                    throw new KotlinNothingValueException();
                }
                i12++;
                iArr3 = iArr4;
            }
            int iso$twoDigitNumber6 = parseIso$twoDigitNumber(charSequence, i8 + 1);
            int iso$twoDigitNumber7 = length > 3 ? parseIso$twoDigitNumber(charSequence, i8 + 4) : 0;
            int iso$twoDigitNumber8 = length > 6 ? parseIso$twoDigitNumber(charSequence, i8 + 7) : 0;
            if (iso$twoDigitNumber7 > 59) {
                parseIso$parseFailure(charSequence, "Expected offset-minute-of-hour in 0..59, got ".concat(String.valueOf(iso$twoDigitNumber7)));
                throw new KotlinNothingValueException();
            }
            if (iso$twoDigitNumber8 > 59) {
                parseIso$parseFailure(charSequence, "Expected offset-second-of-minute in 0..59, got ".concat(String.valueOf(iso$twoDigitNumber8)));
                throw new KotlinNothingValueException();
            }
            if (iso$twoDigitNumber6 > 17 && (iso$twoDigitNumber6 != 18 || iso$twoDigitNumber7 != 0 || iso$twoDigitNumber8 != 0)) {
                StringBuilder sb9 = new StringBuilder("Expected an offset in -18:00..+18:00, got ");
                sb9.append(charSequence.subSequence(i8, charSequence.length()).toString());
                parseIso$parseFailure(charSequence, sb9.toString());
                throw new KotlinNothingValueException();
            }
            i3 = (cCharAt4 == '-' ? -1 : 1) * ((iso$twoDigitNumber6 * SECONDS_PER_HOUR) + (iso$twoDigitNumber7 * 60) + iso$twoDigitNumber8);
        } else if (cCharAt4 == 'Z' || cCharAt4 == 'z') {
            int i14 = i8 + 1;
            if (charSequence.length() != i14) {
                parseIso$parseFailure(charSequence, "Extra text after the instant at position ".concat(String.valueOf(i14)));
                throw new KotlinNothingValueException();
            }
            i3 = 0;
        } else {
            StringBuilder sb10 = new StringBuilder("Expected the UTC offset at position ");
            sb10.append(i8);
            sb10.append(", got '");
            sb10.append(cCharAt4);
            sb10.append('\'');
            parseIso$parseFailure(charSequence, sb10.toString());
            throw new KotlinNothingValueException();
        }
        if (iso$twoDigitNumber <= 0 || iso$twoDigitNumber >= 13) {
            parseIso$parseFailure(charSequence, "Expected a month number in 1..12, got ".concat(String.valueOf(iso$twoDigitNumber)));
            throw new KotlinNothingValueException();
        }
        if (iso$twoDigitNumber2 <= 0 || iso$twoDigitNumber2 > monthLength(iso$twoDigitNumber, isLeapYear(iCharAt))) {
            StringBuilder sb11 = new StringBuilder("Expected a valid day-of-month for month ");
            sb11.append(iso$twoDigitNumber);
            sb11.append(" of year ");
            sb11.append(iCharAt);
            sb11.append(", got ");
            sb11.append(iso$twoDigitNumber2);
            parseIso$parseFailure(charSequence, sb11.toString());
            throw new KotlinNothingValueException();
        }
        if (iso$twoDigitNumber3 > 23) {
            parseIso$parseFailure(charSequence, "Expected hour in 0..23, got ".concat(String.valueOf(iso$twoDigitNumber3)));
            throw new KotlinNothingValueException();
        }
        if (iso$twoDigitNumber4 > 59) {
            parseIso$parseFailure(charSequence, "Expected minute-of-hour in 0..59, got ".concat(String.valueOf(iso$twoDigitNumber4)));
            throw new KotlinNothingValueException();
        }
        if (iso$twoDigitNumber5 > 59) {
            parseIso$parseFailure(charSequence, "Expected second-of-minute in 0..59, got ".concat(String.valueOf(iso$twoDigitNumber5)));
            throw new KotlinNothingValueException();
        }
        return new UnboundLocalDateTime(iCharAt, iso$twoDigitNumber, iso$twoDigitNumber2, iso$twoDigitNumber3, iso$twoDigitNumber4, iso$twoDigitNumber5, i2).toInstant(i3);
    }

    private static final int parseIso$twoDigitNumber(CharSequence charSequence, int i) {
        return ((charSequence.charAt(i) - '0') * 10) + (charSequence.charAt(i + 1) - '0');
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String formatIso(Instant instant) throws IOException {
        int[] iArr;
        StringBuilder sb = new StringBuilder();
        UnboundLocalDateTime unboundLocalDateTimeFromInstant = UnboundLocalDateTime.INSTANCE.fromInstant(instant);
        int year = unboundLocalDateTimeFromInstant.getYear();
        int i = 0;
        if (Math.abs(year) < 1000) {
            StringBuilder sb2 = new StringBuilder();
            if (year >= 0) {
                sb2.append(year + 10000);
                Intrinsics.checkNotNullExpressionValue(sb2.deleteCharAt(0), "");
            } else {
                sb2.append(year - 10000);
                Intrinsics.checkNotNullExpressionValue(sb2.deleteCharAt(1), "");
            }
            sb.append((CharSequence) sb2);
        } else {
            if (year >= 10000) {
                sb.append('+');
            }
            sb.append(year);
        }
        sb.append('-');
        StringBuilder sb3 = sb;
        formatIso$lambda$8$appendTwoDigits(sb3, sb, unboundLocalDateTimeFromInstant.getMonth());
        sb.append('-');
        formatIso$lambda$8$appendTwoDigits(sb3, sb, unboundLocalDateTimeFromInstant.getDay());
        sb.append('T');
        formatIso$lambda$8$appendTwoDigits(sb3, sb, unboundLocalDateTimeFromInstant.getHour());
        sb.append(':');
        formatIso$lambda$8$appendTwoDigits(sb3, sb, unboundLocalDateTimeFromInstant.getMinute());
        sb.append(':');
        formatIso$lambda$8$appendTwoDigits(sb3, sb, unboundLocalDateTimeFromInstant.getSecond());
        if (unboundLocalDateTimeFromInstant.getNanosecond() != 0) {
            sb.append('.');
            while (true) {
                int nanosecond = unboundLocalDateTimeFromInstant.getNanosecond();
                iArr = POWERS_OF_TEN;
                int i2 = i + 1;
                if (nanosecond % iArr[i2] != 0) {
                    break;
                }
                i = i2;
            }
            int i3 = i - (i % 3);
            String strValueOf = String.valueOf((unboundLocalDateTimeFromInstant.getNanosecond() / iArr[i3]) + iArr[9 - i3]);
            Intrinsics.checkNotNull(strValueOf, "");
            String strSubstring = strValueOf.substring(1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            sb.append(strSubstring);
        }
        sb.append('Z');
        return sb.toString();
    }

    private static final void formatIso$lambda$8$appendTwoDigits(Appendable appendable, StringBuilder sb, int i) throws IOException {
        if (i < 10) {
            appendable.append('0');
        }
        sb.append(i);
    }

    private static final long safeAddOrElse(long j, long j2, Function0 function0) {
        long j3 = j + j2;
        if ((j ^ j3) >= 0 || (j ^ j2) < 0) {
            return j3;
        }
        function0.invoke();
        throw new KotlinNothingValueException();
    }

    private static final long safeMultiplyOrElse(long j, long j2, Function0 function0) {
        if (j2 == 1) {
            return j;
        }
        if (j == 1) {
            return j2;
        }
        if (j == 0 || j2 == 0) {
            return 0L;
        }
        long j3 = j * j2;
        if (j3 / j2 == j && ((j != Long.MIN_VALUE || j2 != -1) && (j2 != Long.MIN_VALUE || j != -1))) {
            return j3;
        }
        function0.invoke();
        throw new KotlinNothingValueException();
    }

    public static final boolean isLeapYear(int i) {
        if ((i & 3) == 0) {
            return i % 100 != 0 || i % 400 == 0;
        }
        return false;
    }

    private static final String truncateForErrorMessage(CharSequence charSequence, int i) {
        if (charSequence.length() <= i) {
            return charSequence.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence.subSequence(0, i).toString());
        sb.append("...");
        return sb.toString();
    }
}
