package defpackage;

import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.serialization.json.internal.JsonDecodingException;
import kotlinx.serialization.json.internal.JsonEncodingException;

/* JADX INFO: loaded from: classes7.dex */
public final class setScreenFlashOverlayColor {
    public static final JsonDecodingException b(int i, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (i >= 0) {
            StringBuilder sb = new StringBuilder("Unexpected JSON token at offset ");
            sb.append(i);
            sb.append(": ");
            sb.append(str);
            str = sb.toString();
        }
        return new JsonDecodingException(str);
    }

    public static final JsonDecodingException TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, String str, CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("\nJSON input: ");
        sb.append((Object) TuitionPaymentFragmentbindingInflater1(charSequence, i));
        return b(i, sb.toString());
    }

    public static final JsonEncodingException TuitionPaymentFragmentspecialinlinedviewModeldefault1(Number number, String str) {
        Intrinsics.checkNotNullParameter(number, "");
        Intrinsics.checkNotNullParameter(str, "");
        StringBuilder sb = new StringBuilder("Unexpected special floating-point value ");
        sb.append(number);
        sb.append(". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: ");
        sb.append((Object) TuitionPaymentFragmentbindingInflater1(str, -1));
        return new JsonEncodingException(sb.toString());
    }

    public static final Void TuitionPaymentFragmentspecialinlinedviewModeldefault2(stopListeningToDisplayChange stoplisteningtodisplaychange, Number number) {
        Intrinsics.checkNotNullParameter(stoplisteningtodisplaychange, "");
        Intrinsics.checkNotNullParameter(number, "");
        StringBuilder sb = new StringBuilder("Unexpected special floating-point value ");
        sb.append(number);
        sb.append(". By default, non-finite floating point values are prohibited because they do not conform JSON specification");
        stopListeningToDisplayChange.TuitionPaymentFragmentbindingInflater1(stoplisteningtodisplaychange, sb.toString(), 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
        throw new KotlinNothingValueException();
    }

    public static final Void TuitionPaymentFragmentspecialinlinedviewModeldefault2(stopListeningToDisplayChange stoplisteningtodisplaychange, String str) {
        Intrinsics.checkNotNullParameter(stoplisteningtodisplaychange, "");
        Intrinsics.checkNotNullParameter(str, "");
        stoplisteningtodisplaychange.TuitionPaymentFragmentspecialinlinedviewModeldefault3("Trailing comma before the end of JSON ".concat(String.valueOf(str)), stoplisteningtodisplaychange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 - 1, "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingCommas = true' in 'Json {}' builder to support them.");
        throw new KotlinNothingValueException();
    }

    public static final JsonEncodingException TuitionPaymentFragmentbindingInflater1(createImageAnalysis createimageanalysis) {
        Intrinsics.checkNotNullParameter(createimageanalysis, "");
        StringBuilder sb = new StringBuilder("Value of type '");
        sb.append(createimageanalysis.getINotificationSideChannel());
        sb.append("' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '");
        sb.append(createimageanalysis.TuitionPaymentFragmentbindingInflater1());
        sb.append("'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
        return new JsonEncodingException(sb.toString());
    }

    static final String b(Number number, String str, String str2) {
        StringBuilder sb = new StringBuilder("Unexpected special floating-point value ");
        sb.append(number);
        sb.append(" with key ");
        sb.append(str);
        sb.append(". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: ");
        sb.append((Object) TuitionPaymentFragmentbindingInflater1(str2, -1));
        return sb.toString();
    }

    public static final CharSequence TuitionPaymentFragmentbindingInflater1(CharSequence charSequence, int i) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        if (charSequence.length() < 200) {
            return charSequence;
        }
        if (i != -1) {
            int i2 = i - 30;
            int i3 = i + 30;
            String str = i2 <= 0 ? "" : ".....";
            String str2 = i3 < charSequence.length() ? "....." : "";
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(charSequence.subSequence(RangesKt.coerceAtLeast(i2, 0), RangesKt.coerceAtMost(i3, charSequence.length())).toString());
            sb.append(str2);
            return sb.toString();
        }
        int length = charSequence.length() - 60;
        if (length <= 0) {
            return charSequence;
        }
        StringBuilder sb2 = new StringBuilder(".....");
        sb2.append(charSequence.subSequence(length, charSequence.length()).toString());
        return sb2.toString();
    }
}
