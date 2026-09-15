package com.midtrans.sdk.corekit.utilities;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.google.android.material.timepicker.TimeModel;
import com.midtrans.sdk.corekit.core.Logger;
import com.midtrans.sdk.corekit.models.snap.Authentication;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes4.dex */
public class Utils {
    public static final String CARD_TYPE_AMEX = "AMEX";
    public static final String CARD_TYPE_JCB = "JCB";
    public static final String CARD_TYPE_MASTERCARD = "MASTERCARD";
    public static final String CARD_TYPE_VISA = "VISA";
    private static final long DAY = 86400000;
    private static final long HOUR = 3600000;
    private static final long MINUTE = 60000;
    private static final long SECOND = 1000;

    public static int dpToPx(int i) {
        return (int) (i * Resources.getSystem().getDisplayMetrics().density);
    }

    public static String formatDouble(double d) {
        long j = (long) d;
        try {
            return d == ((double) j) ? String.format(TimeModel.NUMBER_FORMAT, Long.valueOf(j)) : String.format("%s", Double.valueOf(d));
        } catch (RuntimeException e2) {
            StringBuilder sb = new StringBuilder("formatDouble():");
            sb.append(e2.getMessage());
            Logger.e(sb.toString());
            return "0";
        }
    }

    public static String getCardType(String str) {
        try {
            if (str.isEmpty()) {
                return "";
            }
            if (str.charAt(0) == '4') {
                return CARD_TYPE_VISA;
            }
            if (str.charAt(0) == '5' && (str.charAt(1) == '1' || str.charAt(1) == '2' || str.charAt(1) == '3' || str.charAt(1) == '4' || str.charAt(1) == '5')) {
                return CARD_TYPE_MASTERCARD;
            }
            if (str.charAt(0) == '3' && (str.charAt(1) == '4' || str.charAt(1) == '7')) {
                return CARD_TYPE_AMEX;
            }
            return (str.startsWith("35") || str.startsWith("2131") || str.startsWith("1800")) ? CARD_TYPE_JCB : "";
        } catch (RuntimeException unused) {
            return "";
        }
    }

    public static String getDeviceType(Activity activity) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        float f = displayMetrics.heightPixels / displayMetrics.ydpi;
        float f2 = displayMetrics.widthPixels / displayMetrics.xdpi;
        return Math.sqrt((double) ((f2 * f2) + (f * f))) >= 6.5d ? "TABLET" : "PHONE";
    }

    public static String getFormattedAmount(double d) {
        try {
            DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
            decimalFormatSymbols.setDecimalSeparator('.');
            decimalFormatSymbols.setGroupingSeparator(',');
            return new DecimalFormat("#,###.##", decimalFormatSymbols).format(d);
        } catch (IllegalArgumentException | NullPointerException unused) {
            return "".concat(String.valueOf(d));
        }
    }

    public static String getFormattedCreditCardNumber(String str) {
        StringBuilder sb = new StringBuilder();
        if (str.length() == 16) {
            int i = 0;
            while (i < 16) {
                int i2 = i + 4;
                sb.append(str.substring(i, i2));
                sb.append(" ");
                i = i2;
            }
        }
        return sb.toString();
    }

    public static String getFormattedTime(long j) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("Asia/Jakarta"));
        return simpleDateFormat.format(new Date(j));
    }

    public static String getMonth(int i) {
        switch (i) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "Invalid Month";
        }
    }

    public static String getValidityTime(String str) {
        if (str != null) {
            String[] strArrSplit = str.split(" ");
            if (strArrSplit.length > 1) {
                try {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTime(simpleDateFormat.parse(strArrSplit[0]));
                    calendar.add(5, 1);
                    String str2 = simpleDateFormat.format(calendar.getTime());
                    String[] strArrSplit2 = str2.split("-");
                    String month = getMonth(Integer.parseInt(strArrSplit2[1]));
                    StringBuilder sb = new StringBuilder("");
                    sb.append(strArrSplit2[2]);
                    sb.append(" ");
                    sb.append(month);
                    sb.append(" ");
                    sb.append(strArrSplit2[0]);
                    sb.append(", ");
                    sb.append(strArrSplit[1]);
                    String string = sb.toString();
                    StringBuilder sb2 = new StringBuilder("after parsing validity date becomes : ");
                    sb2.append(str2);
                    Logger.i(sb2.toString());
                    StringBuilder sb3 = new StringBuilder("month is : ");
                    sb3.append(month);
                    Logger.i(sb3.toString());
                    StringBuilder sb4 = new StringBuilder("validity time is : ");
                    sb4.append(string);
                    Logger.i(sb4.toString());
                    return string;
                } catch (ParseException e2) {
                    StringBuilder sb5 = new StringBuilder("Error while parsing date : ");
                    sb5.append(e2.getMessage());
                    Logger.e(sb5.toString());
                }
            }
        }
        return str;
    }

    public static void hideKeyboard(Context context, View view) {
        try {
            InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
            if (view != null) {
                inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
                view.clearFocus();
            }
        } catch (Exception e2) {
            Logger.e(e2.getMessage());
        }
    }

    public static boolean isNetworkAvailable(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            return connectivityManager.getActiveNetworkInfo() != null && connectivityManager.getActiveNetworkInfo().isAvailable() && connectivityManager.getActiveNetworkInfo().isConnected();
        } catch (Exception e2) {
            Logger.e(e2.getMessage());
            return false;
        }
    }

    public static String mappingToCreditCardAuthentication(String str, boolean z) {
        if (str.equalsIgnoreCase(Authentication.AUTH_3DS) && z) {
            return Authentication.AUTH_3DS;
        }
        return (!str.equalsIgnoreCase("rba") || z) ? "none" : "rba";
    }
}
