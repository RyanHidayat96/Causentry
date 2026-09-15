package com.google.gson.internal.bind.util;

import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes4.dex */
public class ISO8601Utils {
    private static final String UTC_ID = "UTC";
    private static final TimeZone TIMEZONE_UTC = TimeZone.getTimeZone(UTC_ID);

    public static String format(Date date) {
        return format(date, false, TIMEZONE_UTC);
    }

    public static String format(Date date, boolean z) {
        return format(date, z, TIMEZONE_UTC);
    }

    public static String format(Date date, boolean z, TimeZone timeZone) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder sb = new StringBuilder((z ? 4 : 0) + 19 + (timeZone.getRawOffset() == 0 ? "Z" : "+hh:mm").length());
        padInt(sb, gregorianCalendar.get(1), 4);
        sb.append('-');
        padInt(sb, gregorianCalendar.get(2) + 1, 2);
        sb.append('-');
        padInt(sb, gregorianCalendar.get(5), 2);
        sb.append('T');
        padInt(sb, gregorianCalendar.get(11), 2);
        sb.append(':');
        padInt(sb, gregorianCalendar.get(12), 2);
        sb.append(':');
        padInt(sb, gregorianCalendar.get(13), 2);
        if (z) {
            sb.append('.');
            padInt(sb, gregorianCalendar.get(14), 3);
        }
        int offset = timeZone.getOffset(gregorianCalendar.getTimeInMillis());
        if (offset != 0) {
            int i = offset / 60000;
            int iAbs = Math.abs(i / 60);
            int iAbs2 = Math.abs(i % 60);
            sb.append(offset >= 0 ? '+' : '-');
            padInt(sb, iAbs, 2);
            sb.append(':');
            padInt(sb, iAbs2, 2);
        } else {
            sb.append('Z');
        }
        return sb.toString();
    }

    public static Date parse(String str, ParsePosition parsePosition) throws ParseException {
        String string;
        int i;
        int i2;
        int i3;
        int i4;
        int length;
        TimeZone timeZone;
        int i5;
        char cCharAt;
        try {
            int index = parsePosition.getIndex();
            int i6 = index + 4;
            int i7 = parseInt(str, index, i6);
            if (checkOffset(str, i6, '-')) {
                i6 = index + 5;
            }
            int i8 = i6 + 2;
            int i9 = parseInt(str, i6, i8);
            if (checkOffset(str, i8, '-')) {
                i8 = i6 + 3;
            }
            int i10 = i8 + 2;
            int i11 = parseInt(str, i8, i10);
            boolean zCheckOffset = checkOffset(str, i10, 'T');
            if (!zCheckOffset && str.length() <= i10) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(i7, i9 - 1, i11);
                gregorianCalendar.setLenient(false);
                parsePosition.setIndex(i10);
                return gregorianCalendar.getTime();
            }
            if (zCheckOffset) {
                int i12 = i8 + 5;
                i2 = parseInt(str, i8 + 3, i12);
                if (checkOffset(str, i12, ':')) {
                    i12 = i8 + 6;
                }
                int i13 = i12 + 2;
                int i14 = parseInt(str, i12, i13);
                if (checkOffset(str, i13, ':')) {
                    i13 = i12 + 3;
                }
                if (str.length() <= i13 || (cCharAt = str.charAt(i13)) == 'Z' || cCharAt == '+' || cCharAt == '-') {
                    i10 = i13;
                    i4 = 0;
                } else {
                    i10 = i13 + 2;
                    i4 = parseInt(str, i13, i10);
                    if (i4 > 59 && i4 < 63) {
                        i4 = 59;
                    }
                    if (checkOffset(str, i10, '.')) {
                        int i15 = i13 + 3;
                        int iIndexOfNonDigit = indexOfNonDigit(str, i13 + 4);
                        int iMin = Math.min(iIndexOfNonDigit, i13 + 6);
                        i5 = parseInt(str, i15, iMin);
                        int i16 = iMin - i15;
                        if (i16 == 1) {
                            i5 *= 100;
                        } else if (i16 == 2) {
                            i5 *= 10;
                        }
                        i10 = iIndexOfNonDigit;
                    }
                    i = i14;
                    i3 = i5;
                }
                i5 = 0;
                i = i14;
                i3 = i5;
            } else {
                i = 0;
                i2 = 0;
                i3 = 0;
                i4 = 0;
            }
            if (str.length() <= i10) {
                throw new IllegalArgumentException("No time zone indicator");
            }
            char cCharAt2 = str.charAt(i10);
            if (cCharAt2 == 'Z') {
                timeZone = TIMEZONE_UTC;
                length = i10 + 1;
            } else {
                if (cCharAt2 != '+' && cCharAt2 != '-') {
                    StringBuilder sb = new StringBuilder("Invalid time zone indicator '");
                    sb.append(cCharAt2);
                    sb.append("'");
                    throw new IndexOutOfBoundsException(sb.toString());
                }
                String strSubstring = str.substring(i10);
                if (strSubstring.length() < 5) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(strSubstring);
                    sb2.append("00");
                    strSubstring = sb2.toString();
                }
                length = i10 + strSubstring.length();
                if ("+0000".equals(strSubstring) || "+00:00".equals(strSubstring)) {
                    timeZone = TIMEZONE_UTC;
                } else {
                    StringBuilder sb3 = new StringBuilder("GMT");
                    sb3.append(strSubstring);
                    String string2 = sb3.toString();
                    TimeZone timeZone2 = TimeZone.getTimeZone(string2);
                    String id2 = timeZone2.getID();
                    if (!id2.equals(string2) && !id2.replace(":", "").equals(string2)) {
                        StringBuilder sb4 = new StringBuilder("Mismatching time zone indicator: ");
                        sb4.append(string2);
                        sb4.append(" given, resolves to ");
                        sb4.append(timeZone2.getID());
                        throw new IndexOutOfBoundsException(sb4.toString());
                    }
                    timeZone = timeZone2;
                }
            }
            GregorianCalendar gregorianCalendar2 = new GregorianCalendar(timeZone);
            gregorianCalendar2.setLenient(false);
            gregorianCalendar2.set(1, i7);
            gregorianCalendar2.set(2, i9 - 1);
            gregorianCalendar2.set(5, i11);
            gregorianCalendar2.set(11, i2);
            gregorianCalendar2.set(12, i);
            gregorianCalendar2.set(13, i4);
            gregorianCalendar2.set(14, i3);
            parsePosition.setIndex(length);
            return gregorianCalendar2.getTime();
        } catch (IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException e2) {
            if (str == null) {
                string = null;
            } else {
                StringBuilder sb5 = new StringBuilder("\"");
                sb5.append(str);
                sb5.append(Typography.quote);
                string = sb5.toString();
            }
            String message = e2.getMessage();
            if (message == null || message.isEmpty()) {
                StringBuilder sb6 = new StringBuilder("(");
                sb6.append(e2.getClass().getName());
                sb6.append(")");
                message = sb6.toString();
            }
            StringBuilder sb7 = new StringBuilder("Failed to parse date [");
            sb7.append(string);
            sb7.append("]: ");
            sb7.append(message);
            ParseException parseException = new ParseException(sb7.toString(), parsePosition.getIndex());
            parseException.initCause(e2);
            throw parseException;
        }
    }

    private static boolean checkOffset(String str, int i, char c) {
        return i < str.length() && str.charAt(i) == c;
    }

    private static int parseInt(String str, int i, int i2) throws NumberFormatException {
        int i3;
        int i4;
        if (i < 0 || i2 > str.length() || i > i2) {
            throw new NumberFormatException(str);
        }
        if (i < i2) {
            i4 = i + 1;
            int iDigit = Character.digit(str.charAt(i), 10);
            if (iDigit < 0) {
                StringBuilder sb = new StringBuilder("Invalid number: ");
                sb.append(str.substring(i, i2));
                throw new NumberFormatException(sb.toString());
            }
            i3 = -iDigit;
        } else {
            i3 = 0;
            i4 = i;
        }
        while (i4 < i2) {
            int iDigit2 = Character.digit(str.charAt(i4), 10);
            if (iDigit2 < 0) {
                StringBuilder sb2 = new StringBuilder("Invalid number: ");
                sb2.append(str.substring(i, i2));
                throw new NumberFormatException(sb2.toString());
            }
            i3 = (i3 * 10) - iDigit2;
            i4++;
        }
        return -i3;
    }

    private static void padInt(StringBuilder sb, int i, int i2) {
        String string = Integer.toString(i);
        for (int length = i2 - string.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(string);
    }

    private static int indexOfNonDigit(String str, int i) {
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt < '0' || cCharAt > '9') {
                return i;
            }
            i++;
        }
        return str.length();
    }
}
