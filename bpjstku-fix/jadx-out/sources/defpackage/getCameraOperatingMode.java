package defpackage;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Currency;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class getCameraOperatingMode {
    private static final Locale TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new Locale("id", "ID");

    public static final String TuitionPaymentFragmentbindingInflater1(double d) {
        String string;
        Locale locale = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        String symbol = Currency.getInstance(locale).getSymbol(locale);
        NumberFormat numberInstance = NumberFormat.getNumberInstance(locale);
        String str = numberInstance.format(d);
        Intrinsics.checkNotNullExpressionValue(str, "");
        if (StringsKt.contains$default((CharSequence) str, (CharSequence) ",", false, 2, (Object) null)) {
            string = numberInstance.format(d);
            if (StringsKt.substringAfter$default(string, ",", (String) null, 2, (Object) null).length() == 1) {
                String str2 = numberInstance.format(d);
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append("0");
                string = sb.toString();
            }
        } else {
            String str3 = numberInstance.format(d);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str3);
            sb2.append(",00");
            string = sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(symbol);
        sb3.append(" ");
        sb3.append(string);
        return sb3.toString();
    }

    public static final String TuitionPaymentFragmentbindingInflater1(String str) throws ParseException {
        Intrinsics.checkNotNullParameter(str, "");
        Number number = NumberFormat.getNumberInstance(Locale.US).parse(str);
        return TuitionPaymentFragmentbindingInflater1(number != null ? number.doubleValue() : 0.0d);
    }

    public static final String TuitionPaymentFragmentspecialinlinedviewModeldefault2(double d) throws ParseException {
        Number number = NumberFormat.getNumberInstance(Locale.US).parse(String.valueOf(d));
        return TuitionPaymentFragmentbindingInflater1(number != null ? number.doubleValue() : 0.0d);
    }

    public static final String TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str) throws ParseException {
        String string;
        Intrinsics.checkNotNullParameter(str, "");
        Number number = NumberFormat.getNumberInstance(Locale.US).parse(str);
        double dDoubleValue = number != null ? number.doubleValue() : 0.0d;
        NumberFormat numberInstance = NumberFormat.getNumberInstance(TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        String str2 = numberInstance.format(dDoubleValue);
        Intrinsics.checkNotNullExpressionValue(str2, "");
        if (StringsKt.contains$default((CharSequence) str2, (CharSequence) ",", false, 2, (Object) null)) {
            string = numberInstance.format(dDoubleValue);
            if (StringsKt.substringAfter$default(string, ",", (String) null, 2, (Object) null).length() == 1) {
                String str3 = numberInstance.format(dDoubleValue);
                StringBuilder sb = new StringBuilder();
                sb.append(str3);
                sb.append("0");
                string = sb.toString();
            }
        } else {
            String str4 = numberInstance.format(dDoubleValue);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str4);
            sb2.append(",00");
            string = sb2.toString();
        }
        return String.valueOf(string);
    }

    public static final String TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str) throws ParseException {
        String string;
        Intrinsics.checkNotNullParameter(str, "");
        Number number = NumberFormat.getNumberInstance(Locale.US).parse(str);
        double dDoubleValue = number != null ? number.doubleValue() : 0.0d;
        NumberFormat numberInstance = NumberFormat.getNumberInstance(TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        String str2 = numberInstance.format(dDoubleValue);
        Intrinsics.checkNotNullExpressionValue(str2, "");
        if (StringsKt.contains$default((CharSequence) str2, (CharSequence) ",", false, 2, (Object) null)) {
            string = numberInstance.format(dDoubleValue);
            if (StringsKt.substringAfter$default(string, ",", (String) null, 2, (Object) null).length() == 1) {
                String str3 = numberInstance.format(dDoubleValue);
                StringBuilder sb = new StringBuilder();
                sb.append(str3);
                sb.append("0");
                string = sb.toString();
            }
        } else {
            string = numberInstance.format(dDoubleValue);
        }
        return String.valueOf(string);
    }
}
