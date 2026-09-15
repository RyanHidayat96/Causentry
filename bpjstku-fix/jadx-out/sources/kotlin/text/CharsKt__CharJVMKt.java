package kotlin.text;

import java.util.Locale;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0010\f\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0014\u0010\u0006\u001a\u00020\u0001*\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0006\u0010\u0003\u001a\u0014\u0010\u0007\u001a\u00020\u0001*\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0007\u0010\u0003\u001a\u0014\u0010\b\u001a\u00020\u0001*\u00020\u0000H\u0087\b¢\u0006\u0004\b\b\u0010\u0003\u001a\u0014\u0010\t\u001a\u00020\u0001*\u00020\u0000H\u0087\b¢\u0006\u0004\b\t\u0010\u0003\u001a\u0014\u0010\n\u001a\u00020\u0001*\u00020\u0000H\u0087\b¢\u0006\u0004\b\n\u0010\u0003\u001a\u0011\u0010\u000b\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u000b\u0010\u0003\u001a\u0014\u0010\f\u001a\u00020\u0001*\u00020\u0000H\u0087\b¢\u0006\u0004\b\f\u0010\u0003\u001a\u0014\u0010\r\u001a\u00020\u0001*\u00020\u0000H\u0087\b¢\u0006\u0004\b\r\u0010\u0003\u001a\u0014\u0010\u000e\u001a\u00020\u0000*\u00020\u0000H\u0087\b¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0014\u0010\u0010\u001a\u00020\u0000*\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0010\u0010\u000f\u001a\u0014\u0010\u0012\u001a\u00020\u0011*\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001b\u0010\u0012\u001a\u00020\u0011*\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0012\u0010\u0016\u001a\u0014\u0010\u0017\u001a\u00020\u0000*\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0017\u0010\u000f\u001a\u0014\u0010\u0018\u001a\u00020\u0000*\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0018\u0010\u000f\u001a\u0014\u0010\u0019\u001a\u00020\u0011*\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0019\u0010\u0013\u001a\u001b\u0010\u0019\u001a\u00020\u0011*\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0019\u0010\u0016\u001a\u0014\u0010\u001a\u001a\u00020\u0001*\u00020\u0000H\u0087\b¢\u0006\u0004\b\u001a\u0010\u0003\u001a\u0014\u0010\u001b\u001a\u00020\u0000*\u00020\u0000H\u0087\b¢\u0006\u0004\b\u001b\u0010\u000f\u001a\u0014\u0010\u001c\u001a\u00020\u0000*\u00020\u0000H\u0087\b¢\u0006\u0004\b\u001c\u0010\u000f\u001a\u001b\u0010\u001d\u001a\u00020\u0011*\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u001d\u0010\u0016\u001a\u0014\u0010\u001e\u001a\u00020\u0001*\u00020\u0000H\u0087\b¢\u0006\u0004\b\u001e\u0010\u0003\u001a\u0014\u0010\u001f\u001a\u00020\u0001*\u00020\u0000H\u0087\b¢\u0006\u0004\b\u001f\u0010\u0003\u001a\u001f\u0010\"\u001a\u00020 2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010!\u001a\u00020 H\u0000¢\u0006\u0004\b\"\u0010#\u001a\u0017\u0010$\u001a\u00020 2\u0006\u0010\u0015\u001a\u00020 H\u0001¢\u0006\u0004\b$\u0010%\"\u0015\u0010)\u001a\u00020&*\u00020\u00008G¢\u0006\u0006\u001a\u0004\b'\u0010(\"\u0015\u0010-\u001a\u00020**\u00020\u00008G¢\u0006\u0006\u001a\u0004\b+\u0010,"}, d2 = {"", "", "isDefined", "(C)Z", "isLetter", "isLetterOrDigit", "isDigit", "isIdentifierIgnorable", "isISOControl", "isJavaIdentifierPart", "isJavaIdentifierStart", "isWhitespace", "isUpperCase", "isLowerCase", "toUpperCase", "(C)C", "uppercaseChar", "", "uppercase", "(C)Ljava/lang/String;", "Ljava/util/Locale;", "p0", "(CLjava/util/Locale;)Ljava/lang/String;", "toLowerCase", "lowercaseChar", "lowercase", "isTitleCase", "toTitleCase", "titlecaseChar", "titlecase", "isHighSurrogate", "isLowSurrogate", "", "p1", "digitOf", "(CI)I", "checkRadix", "(I)I", "Lkotlin/text/CharCategory;", "getCategory", "(C)Lkotlin/text/CharCategory;", "category", "Lkotlin/text/CharDirectionality;", "getDirectionality", "(C)Lkotlin/text/CharDirectionality;", "directionality"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/text/CharsKt")
public class CharsKt__CharJVMKt {
    public static final CharCategory getCategory(char c) {
        return CharCategory.INSTANCE.valueOf(Character.getType(c));
    }

    private static final boolean isDefined(char c) {
        return Character.isDefined(c);
    }

    private static final boolean isLetter(char c) {
        return Character.isLetter(c);
    }

    private static final boolean isLetterOrDigit(char c) {
        return Character.isLetterOrDigit(c);
    }

    private static final boolean isDigit(char c) {
        return Character.isDigit(c);
    }

    private static final boolean isIdentifierIgnorable(char c) {
        return Character.isIdentifierIgnorable(c);
    }

    private static final boolean isISOControl(char c) {
        return Character.isISOControl(c);
    }

    private static final boolean isJavaIdentifierPart(char c) {
        return Character.isJavaIdentifierPart(c);
    }

    private static final boolean isJavaIdentifierStart(char c) {
        return Character.isJavaIdentifierStart(c);
    }

    public static final boolean isWhitespace(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    private static final boolean isUpperCase(char c) {
        return Character.isUpperCase(c);
    }

    private static final boolean isLowerCase(char c) {
        return Character.isLowerCase(c);
    }

    @Deprecated(message = "Use uppercaseChar() instead.", replaceWith = @ReplaceWith(expression = "uppercaseChar()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "2.1", warningSince = "1.5")
    private static final char toUpperCase(char c) {
        return Character.toUpperCase(c);
    }

    private static final char uppercaseChar(char c) {
        return Character.toUpperCase(c);
    }

    private static final String uppercase(char c) {
        String strValueOf = String.valueOf(c);
        Intrinsics.checkNotNull(strValueOf, "");
        String upperCase = strValueOf.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        return upperCase;
    }

    public static final String uppercase(char c, Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "");
        String strValueOf = String.valueOf(c);
        Intrinsics.checkNotNull(strValueOf, "");
        String upperCase = strValueOf.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        return upperCase;
    }

    @Deprecated(message = "Use lowercaseChar() instead.", replaceWith = @ReplaceWith(expression = "lowercaseChar()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "2.1", warningSince = "1.5")
    private static final char toLowerCase(char c) {
        return Character.toLowerCase(c);
    }

    private static final char lowercaseChar(char c) {
        return Character.toLowerCase(c);
    }

    private static final String lowercase(char c) {
        String strValueOf = String.valueOf(c);
        Intrinsics.checkNotNull(strValueOf, "");
        String lowerCase = strValueOf.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        return lowerCase;
    }

    public static final String lowercase(char c, Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "");
        String strValueOf = String.valueOf(c);
        Intrinsics.checkNotNull(strValueOf, "");
        String lowerCase = strValueOf.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        return lowerCase;
    }

    private static final boolean isTitleCase(char c) {
        return Character.isTitleCase(c);
    }

    @Deprecated(message = "Use titlecaseChar() instead.", replaceWith = @ReplaceWith(expression = "titlecaseChar()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "2.1", warningSince = "1.5")
    private static final char toTitleCase(char c) {
        return Character.toTitleCase(c);
    }

    private static final char titlecaseChar(char c) {
        return Character.toTitleCase(c);
    }

    public static final String titlecase(char c, Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "");
        String strUppercase = CharsKt.uppercase(c, locale);
        if (strUppercase.length() <= 1) {
            String strValueOf = String.valueOf(c);
            Intrinsics.checkNotNull(strValueOf, "");
            String upperCase = strValueOf.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "");
            if (Intrinsics.areEqual(strUppercase, upperCase)) {
                return String.valueOf(Character.toTitleCase(c));
            }
        } else if (c != 329) {
            char cCharAt = strUppercase.charAt(0);
            Intrinsics.checkNotNull(strUppercase, "");
            String strSubstring = strUppercase.substring(1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            Intrinsics.checkNotNull(strSubstring, "");
            String lowerCase = strSubstring.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            StringBuilder sb = new StringBuilder();
            sb.append(cCharAt);
            sb.append(lowerCase);
            return sb.toString();
        }
        return strUppercase;
    }

    public static final CharDirectionality getDirectionality(char c) {
        return CharDirectionality.INSTANCE.valueOf(Character.getDirectionality(c));
    }

    private static final boolean isHighSurrogate(char c) {
        return Character.isHighSurrogate(c);
    }

    private static final boolean isLowSurrogate(char c) {
        return Character.isLowSurrogate(c);
    }

    public static final int digitOf(char c, int i) {
        return Character.digit((int) c, i);
    }

    public static final int checkRadix(int i) {
        if (2 <= i && i < 37) {
            return i;
        }
        StringBuilder sb = new StringBuilder("radix ");
        sb.append(i);
        sb.append(" was not in valid range ");
        sb.append(new IntRange(2, 36));
        throw new IllegalArgumentException(sb.toString());
    }
}
