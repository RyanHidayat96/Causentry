package defpackage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class setSessionStateCallback {
    private static final Locale b = new Locale("in", "ID");

    public static final String TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str, String str2, String str3) throws ParseException {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Locale locale = b;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str2, locale);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(str3, locale);
        Date date = simpleDateFormat.parse(str);
        Intrinsics.checkNotNull(date);
        String str4 = simpleDateFormat2.format(date);
        Intrinsics.checkNotNullExpressionValue(str4, "");
        return str4;
    }

    public static final String TuitionPaymentFragmentbindingInflater1(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        List listSplit$default = StringsKt.split$default((CharSequence) str, new String[]{"-"}, false, 0, 6, (Object) null);
        String str2 = (String) listSplit$default.get(1);
        switch (str2.hashCode()) {
            case 65027:
                if (!str2.equals("APR")) {
                    return str;
                }
                Object obj = listSplit$default.get(0);
                Object obj2 = listSplit$default.get(2);
                StringBuilder sb = new StringBuilder();
                sb.append(obj);
                sb.append("-04-20");
                sb.append(obj2);
                return sb.toString();
            case 65171:
                if (!str2.equals("AUG")) {
                    return str;
                }
                Object obj3 = listSplit$default.get(0);
                Object obj4 = listSplit$default.get(2);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(obj3);
                sb2.append("-08-20");
                sb2.append(obj4);
                return sb2.toString();
            case 67554:
                if (!str2.equals("DEC")) {
                    return str;
                }
                Object obj5 = listSplit$default.get(0);
                Object obj6 = listSplit$default.get(2);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(obj5);
                sb3.append("-12-20");
                sb3.append(obj6);
                return sb3.toString();
            case 69475:
                if (!str2.equals("FEB")) {
                    return str;
                }
                Object obj7 = listSplit$default.get(0);
                Object obj8 = listSplit$default.get(2);
                StringBuilder sb4 = new StringBuilder();
                sb4.append(obj7);
                sb4.append("-02-20");
                sb4.append(obj8);
                return sb4.toString();
            case 73207:
                if (!str2.equals("JAN")) {
                    return str;
                }
                Object obj9 = listSplit$default.get(0);
                Object obj10 = listSplit$default.get(2);
                StringBuilder sb5 = new StringBuilder();
                sb5.append(obj9);
                sb5.append("-01-20");
                sb5.append(obj10);
                return sb5.toString();
            case 73825:
                if (!str2.equals("JUL")) {
                    return str;
                }
                Object obj11 = listSplit$default.get(0);
                Object obj12 = listSplit$default.get(2);
                StringBuilder sb6 = new StringBuilder();
                sb6.append(obj11);
                sb6.append("-07-20");
                sb6.append(obj12);
                return sb6.toString();
            case 73827:
                if (!str2.equals("JUN")) {
                    return str;
                }
                Object obj13 = listSplit$default.get(0);
                Object obj14 = listSplit$default.get(2);
                StringBuilder sb7 = new StringBuilder();
                sb7.append(obj13);
                sb7.append("-06-20");
                sb7.append(obj14);
                return sb7.toString();
            case 76094:
                if (!str2.equals("MAR")) {
                    return str;
                }
                Object obj15 = listSplit$default.get(0);
                Object obj16 = listSplit$default.get(2);
                StringBuilder sb8 = new StringBuilder();
                sb8.append(obj15);
                sb8.append("-03-20");
                sb8.append(obj16);
                return sb8.toString();
            case 76101:
                if (!str2.equals("MAY")) {
                    return str;
                }
                Object obj17 = listSplit$default.get(0);
                Object obj18 = listSplit$default.get(2);
                StringBuilder sb9 = new StringBuilder();
                sb9.append(obj17);
                sb9.append("-05-20");
                sb9.append(obj18);
                return sb9.toString();
            case 77493:
                if (!str2.equals("NOV")) {
                    return str;
                }
                Object obj19 = listSplit$default.get(0);
                Object obj20 = listSplit$default.get(2);
                StringBuilder sb10 = new StringBuilder();
                sb10.append(obj19);
                sb10.append("-11-20");
                sb10.append(obj20);
                return sb10.toString();
            case 78328:
                if (!str2.equals("OKT")) {
                    return str;
                }
                Object obj21 = listSplit$default.get(0);
                Object obj22 = listSplit$default.get(2);
                StringBuilder sb11 = new StringBuilder();
                sb11.append(obj21);
                sb11.append("-10-20");
                sb11.append(obj22);
                return sb11.toString();
            case 81982:
                if (!str2.equals("SEP")) {
                    return str;
                }
                Object obj23 = listSplit$default.get(0);
                Object obj24 = listSplit$default.get(2);
                StringBuilder sb12 = new StringBuilder();
                sb12.append(obj23);
                sb12.append("-09-20");
                sb12.append(obj24);
                return sb12.toString();
            default:
                return str;
        }
    }

    public static final String TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(12, 0);
        String str = new SimpleDateFormat("HH:").format(calendar.getTime());
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    public static final Date TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        Date time = Calendar.getInstance().getTime();
        Intrinsics.checkNotNullExpressionValue(time, "");
        return time;
    }

    public static final String TuitionPaymentFragmentspecialinlinedviewModeldefault3(Date date, String str) {
        Intrinsics.checkNotNullParameter(date, "");
        Intrinsics.checkNotNullParameter(str, "");
        String str2 = new SimpleDateFormat(str, b).format(date);
        Intrinsics.checkNotNullExpressionValue(str2, "");
        return str2;
    }

    public static final Date b(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        String strSubstring = str.substring(0, 10);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date date = new Date();
        try {
            return simpleDateFormat.parse(strSubstring);
        } catch (android.net.ParseException e2) {
            e2.printStackTrace();
            return date;
        }
    }
}
