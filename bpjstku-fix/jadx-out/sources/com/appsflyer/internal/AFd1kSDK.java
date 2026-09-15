package com.appsflyer.internal;

import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.google.firebase.messaging.Constants;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFd1kSDK implements AFd1pSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long areAllFieldsValid = 0;
    private static char copy = 0;
    private static int equals = 1;
    private static final int getRevenue;
    private static int hashCode;
    private static int toString;
    private final AFc1dSDK component1;
    private List<String> getCurrencyIso4217Code = new ArrayList();
    private boolean getMonetizationNetwork = true;
    private final Map<String, Object> AFAdRevenueData = new HashMap();
    private SecureRandom component3 = new SecureRandom();
    private boolean component2 = true ^ AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DPM, false);
    private int getMediationNetwork = 0;
    private boolean component4 = false;

    public static /* synthetic */ Object getMediationNetwork(Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~i2;
        int i6 = ~i3;
        int i7 = i | i2;
        int i8 = ~(i2 | i6);
        int i9 = (i * 85) + (i2 * 85) + (((~(i4 | i6)) | (~(i4 | i5)) | (~(i5 | i6)) | (~(i7 | i3))) * (-84)) + ((i | (~(i3 | i5)) | i8) * (-84)) + (((~i7) | i8) * 84);
        if (i9 == 1) {
            AFd1kSDK aFd1kSDK = (AFd1kSDK) objArr[0];
            String str = (String) objArr[1];
            String[] strArr = (String[]) objArr[2];
            equals = (toString + 69) % 128;
            aFd1kSDK.getCurrencyIso4217Code("public_api_call", str, strArr);
            toString = (equals + 1) % 128;
            return null;
        }
        if (i9 == 2) {
            return getCurrencyIso4217Code(objArr);
        }
        if (i9 == 3) {
            return getMonetizationNetwork(objArr);
        }
        AFd1kSDK aFd1kSDK2 = (AFd1kSDK) objArr[0];
        boolean zAFAdRevenueData = aFd1kSDK2.AFAdRevenueData(getCurrencyIso4217Code(aFd1kSDK2.component1.component1().getMediationNetwork.getCurrencyIso4217Code), getCurrencyIso4217Code(aFd1kSDK2.component1.component1().getMediationNetwork.AFAdRevenueData));
        if (!zAFAdRevenueData) {
            aFd1kSDK2.getRevenue();
            aFd1kSDK2.getMediationNetwork();
        } else {
            equals = (toString + 57) % 128;
            aFd1kSDK2.areAllFieldsValid();
        }
        equals = (toString + 31) % 128;
        return Boolean.valueOf(zAFAdRevenueData);
    }

    static {
        component3();
        getRevenue = 98166;
        int i = equals + 117;
        toString = i % 128;
        if (i % 2 != 0) {
            throw new ArithmeticException();
        }
    }

    public AFd1kSDK(AFc1dSDK aFc1dSDK) {
        this.component1 = aFc1dSDK;
    }

    private void areAllFieldsValid() {
        synchronized (this) {
            int i = toString + 63;
            equals = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
            if (this.component4) {
                return;
            }
            this.component4 = true;
            try {
                getCurrencyIso4217Code("r_debugging_on", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
                equals = (toString + 3) % 128;
                return;
            } catch (Throwable th) {
                AFLogger.INSTANCE.e(AFg1cSDK.PROXY, "Error while starting remote debugger", th, true, true, true);
                return;
            }
            throw th;
        }
    }

    private static void a(int i, char c, String str, String str2, String str3, Object[] objArr) {
        char[] charArray;
        char[] charArray2;
        if (str3 != null) {
            int i2 = $11 + 31;
            $10 = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            charArray = str3.toCharArray();
        } else {
            charArray = str3;
        }
        char[] cArr = charArray;
        if (str2 != null) {
            charArray2 = str2.toCharArray();
            $10 = ($11 + 29) % 128;
        } else {
            charArray2 = str2;
        }
        char[] cArr2 = charArray2;
        char[] charArray3 = str != null ? str.toCharArray() : str;
        AFk1jSDK aFk1jSDK = new AFk1jSDK();
        int length = charArray3.length;
        char[] cArr3 = new char[length];
        int length2 = cArr.length;
        char[] cArr4 = new char[length2];
        System.arraycopy(charArray3, 0, cArr3, 0, length);
        System.arraycopy(cArr, 0, cArr4, 0, length2);
        cArr3[0] = (char) (cArr3[0] ^ c);
        cArr4[2] = (char) (cArr4[2] + ((char) i));
        int length3 = cArr2.length;
        char[] cArr5 = new char[length3];
        aFk1jSDK.getMediationNetwork = 0;
        while (aFk1jSDK.getMediationNetwork < length3) {
            int i3 = (aFk1jSDK.getMediationNetwork + 2) % 4;
            int i4 = (aFk1jSDK.getMediationNetwork + 3) % 4;
            aFk1jSDK.AFAdRevenueData = (char) (((cArr3[aFk1jSDK.getMediationNetwork % 4] * 32718) + cArr4[i3]) % 65535);
            cArr4[i4] = (char) (((cArr3[i4] * 32718) + cArr4[i3]) / 65535);
            cArr3[i4] = aFk1jSDK.AFAdRevenueData;
            cArr5[aFk1jSDK.getMediationNetwork] = (char) (((((long) (cArr3[i4] ^ cArr2[aFk1jSDK.getMediationNetwork])) ^ (areAllFieldsValid ^ (-866183138771165766L))) ^ ((long) ((int) (((long) hashCode) ^ (-866183138771165766L))))) ^ ((long) ((char) (((long) copy) ^ (-866183138771165766L)))));
            aFk1jSDK.getMediationNetwork++;
        }
        objArr[0] = new String(cArr5);
    }

    @Override // com.appsflyer.internal.AFd1pSDK
    public final void getMediationNetwork() {
        synchronized (this) {
            int i = (toString + 35) % 128;
            equals = i;
            if (this.component4) {
                this.component4 = false;
                this.getMonetizationNetwork = false;
                getCurrencyIso4217Code("r_debugging_off", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
                return;
            }
            int i2 = i + 23;
            toString = i2 % 128;
            if (i2 % 2 != 0) {
                throw new NullPointerException();
            }
            if (!this.getMonetizationNetwork) {
                return;
            }
            this.component4 = false;
            this.getMonetizationNetwork = false;
            try {
                getCurrencyIso4217Code("r_debugging_off", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
                return;
            } catch (Throwable th) {
                AFLogger.INSTANCE.e(AFg1cSDK.PROXY, "Error while stopping remote debugger", th, true, true, true);
                return;
            }
            throw th;
        }
    }

    @Override // com.appsflyer.internal.AFd1pSDK
    public final void AFAdRevenueData() {
        synchronized (this) {
            toString = (equals + 31) % 128;
            this.AFAdRevenueData.clear();
            this.getCurrencyIso4217Code.clear();
            this.getMediationNetwork = 0;
            int i = toString + 105;
            equals = i % 128;
            if (i % 2 == 0) {
                throw new ArithmeticException();
            }
        }
    }

    @Override // com.appsflyer.internal.AFd1pSDK
    public final void o_(String str, PackageManager packageManager) {
        int i = equals + 117;
        toString = i % 128;
        try {
            if (i % 2 == 0) {
                final AFd1mSDK revenue = this.component1.getCurrencyIso4217Code().getRevenue(p_(str, packageManager), this.component1.registerClient().getMediationNetwork());
                if (revenue == null) {
                    AFLogger.afErrorLogForExcManagerOnly("could not send null proxy data", new NullPointerException("request was null"));
                    return;
                }
                ExecutorService monetizationNetwork = this.component1.getMonetizationNetwork();
                Objects.requireNonNull(revenue);
                monetizationNetwork.execute(new Runnable() { // from class: com.appsflyer.internal.AFd1kSDK$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        revenue.getMonetizationNetwork();
                    }
                });
                int i2 = toString + 19;
                equals = i2 % 128;
                if (i2 % 2 == 0) {
                    throw null;
                }
                return;
            }
            this.component1.getCurrencyIso4217Code().getRevenue(p_(str, packageManager), this.component1.registerClient().getMediationNetwork());
            throw new NullPointerException();
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("could not send proxy data", th);
        }
    }

    @Override // com.appsflyer.internal.AFd1pSDK
    public final void getMonetizationNetwork(Throwable th) {
        StackTraceElement[] stackTrace;
        equals = (toString + 45) % 128;
        Throwable cause = th.getCause();
        String simpleName = th.getClass().getSimpleName();
        String message = cause == null ? th.getMessage() : cause.getMessage();
        if (cause == null) {
            int i = equals + 73;
            toString = i % 128;
            if (i % 2 != 0) {
                th.getStackTrace();
                throw null;
            }
            stackTrace = th.getStackTrace();
        } else {
            stackTrace = cause.getStackTrace();
            equals = (toString + 3) % 128;
        }
        getCurrencyIso4217Code("exception", simpleName, getRevenue(message, stackTrace));
    }

    @Override // com.appsflyer.internal.AFd1pSDK
    public final void getCurrencyIso4217Code(String str, String str2) {
        int i = toString + 17;
        equals = i % 128;
        if (i % 2 == 0) {
            String[] strArr = new String[0];
            strArr[0] = str2;
            getCurrencyIso4217Code("server_request", str, strArr);
        } else {
            getCurrencyIso4217Code("server_request", str, str2);
        }
        int i2 = toString + 101;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFd1pSDK
    public final void getRevenue(String str, int i, String str2) {
        equals = (toString + 29) % 128;
        getCurrencyIso4217Code("server_response", str, String.valueOf(i), str2);
        int i2 = equals + 121;
        toString = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFd1pSDK
    public final void getMonetizationNetwork(String str, String str2) {
        int i = toString + 53;
        equals = i % 128;
        if (i % 2 == 0) {
            String[] strArr = new String[1];
            strArr[1] = str2;
            getCurrencyIso4217Code(null, str, strArr);
        } else {
            getCurrencyIso4217Code(null, str, str2);
        }
        int i2 = equals + 45;
        toString = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFd1pSDK
    public final void getRevenue() {
        synchronized (this) {
            equals = (toString + 125) % 128;
            this.getMonetizationNetwork = false;
            AFAdRevenueData();
            equals();
            toString = (equals + 121) % 128;
        }
    }

    @Override // com.appsflyer.internal.AFd1pSDK
    public final void getCurrencyIso4217Code() {
        int i = toString + 23;
        int i2 = i % 128;
        equals = i2;
        this.component2 = i % 2 == 0;
        int i3 = i2 + 63;
        toString = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFd1pSDK
    public final boolean component4() {
        int i = equals;
        int i2 = i + 103;
        toString = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        boolean z = this.component4;
        toString = (i + 119) % 128;
        return z;
    }

    private float component2() {
        equals = (toString + 65) % 128;
        float fNextFloat = this.component3.nextFloat();
        int i = equals + 119;
        toString = i % 128;
        if (i % 2 == 0) {
            return fNextFloat;
        }
        throw new ArithmeticException();
    }

    private Map<String, Object> p_(String str, PackageManager packageManager) {
        int i = equals + 95;
        toString = i % 128;
        if (i % 2 == 0) {
            q_(str, packageManager, this.component1.registerClient(), this.component1.afInfoLog());
            Map<String, Object> mapCopy = copy();
            int i2 = equals + 29;
            toString = i2 % 128;
            if (i2 % 2 == 0) {
                return mapCopy;
            }
            throw null;
        }
        q_(str, packageManager, this.component1.registerClient(), this.component1.afInfoLog());
        copy();
        throw null;
    }

    private static String component1() {
        int i = toString;
        int i2 = i + 77;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        equals = (i + 33) % 128;
        return "6.17.0";
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
        AFd1kSDK aFd1kSDK = (AFd1kSDK) objArr[0];
        if (aFd1kSDK.component2) {
            int i = equals;
            toString = (i + 49) % 128;
            if (aFd1kSDK.getMonetizationNetwork || aFd1kSDK.component4) {
                int i2 = i + 57;
                toString = i2 % 128;
                if (i2 % 2 == 0) {
                    return Boolean.TRUE;
                }
                throw null;
            }
        }
        return Boolean.FALSE;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x006f A[Catch: all -> 0x006b, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:5:0x0055, B:13:0x006f), top: B:31:0x0055 }] */
    /* JADX WARN: Code duplicated, block: B:16:0x007b A[Catch: all -> 0x009e, TRY_ENTER, TryCatch #1 {all -> 0x009e, blocks: (B:3:0x0001, B:6:0x005d, B:8:0x0063, B:16:0x007b, B:18:0x0081, B:20:0x008a, B:24:0x008f, B:26:0x0095), top: B:33:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x0081 A[Catch: all -> 0x009e, TryCatch #1 {all -> 0x009e, blocks: (B:3:0x0001, B:6:0x005d, B:8:0x0063, B:16:0x007b, B:18:0x0081, B:20:0x008a, B:24:0x008f, B:26:0x0095), top: B:33:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0089  */
    private void getMediationNetwork(String str, String str2, String str3) {
        int i;
        synchronized (this) {
            try {
                Map<String, Object> map = this.AFAdRevenueData;
                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                Object[] objArr = new Object[1];
                a(428417108 - iIndexOf, (char) (45453 - TextUtils.indexOf((CharSequence) "", '0', 0)), "嗊褠踙\ue7b1", "ᒸي醼뇗ൎ", "\u0000\u0000\u0000\u0000", objArr);
                map.put(((String) objArr[0]).intern(), Build.BRAND);
                this.AFAdRevenueData.put("model", Build.MODEL);
                this.AFAdRevenueData.put("platform", "Android");
                this.AFAdRevenueData.put("platform_version", Build.VERSION.RELEASE);
                if (str != null) {
                    equals = (toString + 111) % 128;
                    if (str.length() > 0) {
                        this.AFAdRevenueData.put("advertiserId", str);
                    }
                    if (str2 != null) {
                        i = toString + 27;
                        equals = i % 128;
                        if (i % 2 != 0) {
                            throw null;
                        }
                        if (str2.length() > 0) {
                            this.AFAdRevenueData.put("imei", str2);
                        }
                    }
                    if (str3 != null && str3.length() > 0) {
                        this.AFAdRevenueData.put("android_id", str3);
                    }
                } else {
                    if (str2 != null) {
                        i = toString + 27;
                        equals = i % 128;
                        if (i % 2 != 0) {
                            throw null;
                        }
                        if (str2.length() > 0) {
                            this.AFAdRevenueData.put("imei", str2);
                        }
                    }
                    if (str3 != null) {
                        this.AFAdRevenueData.put("android_id", str3);
                    }
                }
                throw th;
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002e A[Catch: all -> 0x002a, TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:5:0x000a, B:16:0x002e, B:25:0x0050), top: B:40:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:19:0x003a A[Catch: all -> 0x0075, TRY_ENTER, TryCatch #0 {all -> 0x0075, blocks: (B:3:0x0001, B:8:0x0016, B:10:0x001c, B:11:0x0024, B:12:0x0029, B:19:0x003a, B:21:0x0040, B:22:0x0048, B:23:0x004d, B:28:0x005c, B:30:0x0062, B:31:0x006b, B:32:0x0070), top: B:39:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x0040 A[Catch: all -> 0x0075, TryCatch #0 {all -> 0x0075, blocks: (B:3:0x0001, B:8:0x0016, B:10:0x001c, B:11:0x0024, B:12:0x0029, B:19:0x003a, B:21:0x0040, B:22:0x0048, B:23:0x004d, B:28:0x005c, B:30:0x0062, B:31:0x006b, B:32:0x0070), top: B:39:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0048 A[Catch: all -> 0x0075, TryCatch #0 {all -> 0x0075, blocks: (B:3:0x0001, B:8:0x0016, B:10:0x001c, B:11:0x0024, B:12:0x0029, B:19:0x003a, B:21:0x0040, B:22:0x0048, B:23:0x004d, B:28:0x005c, B:30:0x0062, B:31:0x006b, B:32:0x0070), top: B:39:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0050 A[Catch: all -> 0x002a, TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:5:0x000a, B:16:0x002e, B:25:0x0050), top: B:40:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:28:0x005c A[Catch: all -> 0x0075, TRY_ENTER, TryCatch #0 {all -> 0x0075, blocks: (B:3:0x0001, B:8:0x0016, B:10:0x001c, B:11:0x0024, B:12:0x0029, B:19:0x003a, B:21:0x0040, B:22:0x0048, B:23:0x004d, B:28:0x005c, B:30:0x0062, B:31:0x006b, B:32:0x0070), top: B:39:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0062 A[Catch: all -> 0x0075, TryCatch #0 {all -> 0x0075, blocks: (B:3:0x0001, B:8:0x0016, B:10:0x001c, B:11:0x0024, B:12:0x0029, B:19:0x003a, B:21:0x0040, B:22:0x0048, B:23:0x004d, B:28:0x005c, B:30:0x0062, B:31:0x006b, B:32:0x0070), top: B:39:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x006b A[Catch: all -> 0x0075, TryCatch #0 {all -> 0x0075, blocks: (B:3:0x0001, B:8:0x0016, B:10:0x001c, B:11:0x0024, B:12:0x0029, B:19:0x003a, B:21:0x0040, B:22:0x0048, B:23:0x004d, B:28:0x005c, B:30:0x0062, B:31:0x006b, B:32:0x0070), top: B:39:0x0001 }] */
    private void getCurrencyIso4217Code(String str, String str2, String str3, String str4) {
        int i;
        int i2;
        synchronized (this) {
            try {
                this.AFAdRevenueData.put("sdk_version", str);
                if (str2 != null) {
                    int i3 = toString + 61;
                    equals = i3 % 128;
                    if (i3 % 2 == 0) {
                        throw new ArithmeticException();
                    }
                    if (str2.length() > 0) {
                        this.AFAdRevenueData.put("devkey", str2);
                    }
                    if (str3 != null) {
                        i2 = toString + 19;
                        equals = i2 % 128;
                        if (i2 % 2 != 0) {
                            throw new ArithmeticException();
                        }
                        if (str3.length() > 0) {
                            this.AFAdRevenueData.put("originalAppsFlyerId", str3);
                        }
                    }
                    if (str4 != null) {
                        i = toString + 61;
                        equals = i % 128;
                        if (i % 2 != 0) {
                            throw new ArithmeticException();
                        }
                        if (str4.length() > 0) {
                            this.AFAdRevenueData.put("uid", str4);
                        }
                    }
                } else {
                    if (str3 != null) {
                        i2 = toString + 19;
                        equals = i2 % 128;
                        if (i2 % 2 != 0) {
                            throw new ArithmeticException();
                        }
                        if (str3.length() > 0) {
                            this.AFAdRevenueData.put("originalAppsFlyerId", str3);
                        }
                    }
                    if (str4 != null) {
                        i = toString + 61;
                        equals = i % 128;
                        if (i % 2 != 0) {
                            throw new ArithmeticException();
                        }
                        if (str4.length() > 0) {
                            this.AFAdRevenueData.put("uid", str4);
                        }
                    }
                }
                throw th;
            } catch (Throwable unused) {
            }
        }
    }

    private void getMonetizationNetwork(String str, String str2, String str3, String str4) {
        synchronized (this) {
            int i = toString;
            int i2 = i + 71;
            equals = i2 % 128;
            try {
                if (i2 % 2 == 0) {
                    throw null;
                }
                if (str != null) {
                    equals = (i + 35) % 128;
                    if (str.length() > 0) {
                        int i3 = toString + 109;
                        equals = i3 % 128;
                        if (i3 % 2 != 0) {
                            this.AFAdRevenueData.put("app_id", str);
                        } else {
                            this.AFAdRevenueData.put("app_id", str);
                            throw new ArithmeticException();
                        }
                    }
                }
                if (str2 != null && str2.length() > 0) {
                    this.AFAdRevenueData.put("app_version", str2);
                }
                if (str3 != null && str3.length() > 0) {
                    this.AFAdRevenueData.put(AppsFlyerProperties.CHANNEL, str3);
                    int i4 = equals + 55;
                    toString = i4 % 128;
                    int i5 = i4 % 2;
                }
                if (str4 != null && str4.length() > 0) {
                    this.AFAdRevenueData.put("preInstall", str4);
                }
            } catch (Throwable unused) {
            }
        }
    }

    private void getCurrencyIso4217Code(String str, String str2, String... strArr) {
        String string;
        synchronized (this) {
            if (copydefault()) {
                equals = (toString + 75) % 128;
                if (this.getMediationNetwork < 98304) {
                    try {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        String strJoin = TextUtils.join(", ", strArr);
                        if (str != null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(jCurrentTimeMillis);
                            sb.append(" ");
                            sb.append(Thread.currentThread().getId());
                            sb.append(" _/AppsFlyer_6.17.0 [");
                            sb.append(str);
                            sb.append("] ");
                            sb.append(str2);
                            sb.append(" ");
                            sb.append(strJoin);
                            string = sb.toString();
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(jCurrentTimeMillis);
                            sb2.append(" ");
                            sb2.append(Thread.currentThread().getId());
                            sb2.append(" ");
                            sb2.append(str2);
                            sb2.append("/AppsFlyer_6.17.0 ");
                            sb2.append(strJoin);
                            string = sb2.toString();
                            toString = (equals + 73) % 128;
                        }
                        int i = this.getMediationNetwork;
                        int length = string.length();
                        int i2 = getRevenue;
                        int i3 = i + (length << 1);
                        boolean z = false;
                        if (i3 > i2) {
                            string = string.substring(0, (i2 - this.getMediationNetwork) / 2);
                            z = true;
                        }
                        this.getCurrencyIso4217Code.add(string);
                        this.getMediationNetwork += string.length() << 1;
                        if (z) {
                            int i4 = toString + 47;
                            equals = i4 % 128;
                            if (i4 % 2 == 0) {
                                this.getCurrencyIso4217Code.add("+~+~ The limit has been exceeded, and no more data is available. +~+~");
                                this.getMediationNetwork += 7164;
                            } else {
                                this.getCurrencyIso4217Code.add("+~+~ The limit has been exceeded, and no more data is available. +~+~");
                                this.getMediationNetwork += 138;
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    private Map<String, Object> copy() {
        Map<String, Object> map;
        synchronized (this) {
            equals = (toString + 47) % 128;
            this.AFAdRevenueData.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, this.getCurrencyIso4217Code);
            equals();
            map = this.AFAdRevenueData;
            toString = (equals + 111) % 128;
        }
        return map;
    }

    private void q_(String str, PackageManager packageManager, AFf1gSDK aFf1gSDK, AFc1kSDK aFc1kSDK) {
        synchronized (this) {
            int i = toString + 43;
            equals = i % 128;
            if (i % 2 != 0) {
                AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
                String string = appsFlyerProperties.getString("remote_debug_static_data");
                this.AFAdRevenueData.clear();
                if (string != null) {
                    try {
                        this.AFAdRevenueData.putAll(AFg1lSDK.getMonetizationNetwork(new JSONObject(string)));
                    } catch (Throwable unused) {
                    }
                } else {
                    getMediationNetwork(this.component1.getRevenue().AFAdRevenueData(), aFf1gSDK.getRevenue(), aFc1kSDK.AFAdRevenueData);
                    StringBuilder sb = new StringBuilder("6.17.0.");
                    sb.append(AFa1tSDK.getMonetizationNetwork);
                    getCurrencyIso4217Code(sb.toString(), this.component1.registerClient().getMediationNetwork(), appsFlyerProperties.getString("KSAppsFlyerId"), AFb1iSDK.getRevenue(this.component1.getRevenue().getMonetizationNetwork));
                    try {
                        int i2 = packageManager.getPackageInfo(str, 0).versionCode;
                        getMonetizationNetwork(str, String.valueOf(i2), appsFlyerProperties.getString(AppsFlyerProperties.CHANNEL), appsFlyerProperties.getString("preInstallName"));
                    } catch (Throwable unused2) {
                    }
                    appsFlyerProperties.set("remote_debug_static_data", new JSONObject(this.AFAdRevenueData).toString());
                    int i3 = toString + 43;
                    equals = i3 % 128;
                    int i4 = i3 % 2;
                }
                this.AFAdRevenueData.put("launch_counter", String.valueOf(this.component1.getRevenue().getMonetizationNetwork.AFAdRevenueData("appsFlyerCount", 0)));
            } else {
                AppsFlyerProperties.getInstance().getString("remote_debug_static_data");
                this.AFAdRevenueData.clear();
                throw new ArithmeticException();
            }
        }
    }

    private static String[] getRevenue(String str, StackTraceElement[] stackTraceElementArr) {
        int i = toString;
        equals = (i + 55) % 128;
        if (stackTraceElementArr != null) {
            String[] strArr = new String[stackTraceElementArr.length + 1];
            strArr[0] = str;
            for (int i2 = 1; i2 < stackTraceElementArr.length; i2++) {
                strArr[i2] = stackTraceElementArr[i2].toString();
            }
            return strArr;
        }
        int i3 = i + 91;
        equals = i3 % 128;
        if (i3 % 2 != 0) {
            return new String[]{str};
        }
        String[] strArr2 = new String[0];
        strArr2[1] = str;
        return strArr2;
    }

    private void equals() {
        synchronized (this) {
            this.getCurrencyIso4217Code = new ArrayList();
            this.getMediationNetwork = 0;
            toString = (equals + 115) % 128;
        }
    }

    private boolean AFAdRevenueData(AFi1xSDK aFi1xSDK, AFi1xSDK aFi1xSDK2) {
        synchronized (this) {
            boolean z = false;
            try {
                if (aFi1xSDK == null) {
                    AFInAppEventParameterName();
                    return false;
                }
                if (!aFi1xSDK.getCurrencyIso4217Code()) {
                    int i = toString;
                    equals = (i + 13) % 128;
                    int i2 = i + 77;
                    equals = i2 % 128;
                    if (i2 % 2 != 0) {
                        return false;
                    }
                    throw null;
                }
                if (this.component1.getRevenue().getMonetizationNetwork.AFAdRevenueData("appsFlyerCount", 0) > aFi1xSDK.getMonetizationNetwork) {
                    toString = (equals + 3) % 128;
                    return false;
                }
                if (!getRevenue(aFi1xSDK, aFi1xSDK2)) {
                    return false;
                }
                if (AFAdRevenueData(aFi1xSDK.getRevenue)) {
                    if (getCurrencyIso4217Code(aFi1xSDK.AFAdRevenueData)) {
                        return true;
                    }
                    int i3 = toString + 113;
                    equals = i3 % 128;
                    return i3 % 2 == 0;
                }
                int i4 = equals;
                int i5 = i4 + 113;
                toString = i5 % 128;
                if (i5 % 2 == 0) {
                    z = true;
                }
                toString = (i4 + 21) % 128;
                return !z;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private boolean getRevenue(AFi1xSDK aFi1xSDK, AFi1xSDK aFi1xSDK2) {
        equals = (toString + 87) % 128;
        if (!aFi1xSDK.equals(aFi1xSDK2)) {
            boolean monetizationNetwork = getMonetizationNetwork(aFi1xSDK.getMediationNetwork);
            getMediationNetwork(new Object[]{this, Boolean.valueOf(monetizationNetwork)}, 124011145, -124011142, System.identityHashCode(this));
            return monetizationNetwork;
        }
        equals = (toString + 63) % 128;
        return registerClient();
    }

    private static boolean getCurrencyIso4217Code(String str) {
        toString = (equals + 65) % 128;
        if (!AFk1ySDK.getCurrencyIso4217Code(str)) {
            new AFd1sSDK();
            return AFd1sSDK.getMediationNetwork(component1(), str);
        }
        int i = toString + 97;
        equals = i % 128;
        return i % 2 != 0;
    }

    private boolean AFAdRevenueData(String str) {
        int i = equals + 125;
        toString = i % 128;
        if (i % 2 != 0) {
            AFk1ySDK.getCurrencyIso4217Code(str);
            throw new ArithmeticException();
        }
        if (AFk1ySDK.getCurrencyIso4217Code(str)) {
            return true;
        }
        AFc1pSDK revenue = this.component1.getRevenue();
        boolean zEquals = str.equals(AFj1iSDK.getMediationNetwork(revenue.getRevenue.getMonetizationNetwork, revenue.getRevenue.getMonetizationNetwork.getPackageName()));
        int i2 = toString + 93;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            return zEquals;
        }
        throw new ArithmeticException();
    }

    private boolean getMonetizationNetwork(float f) {
        double d = f;
        if (d >= 1.0d) {
            return true;
        }
        if (d <= 0.0d) {
            equals = (toString + 39) % 128;
            return false;
        }
        if (component2() > f) {
            return false;
        }
        toString = (equals + 67) % 128;
        return true;
    }

    private static AFi1xSDK getCurrencyIso4217Code(AFi1wSDK aFi1wSDK) {
        if (aFi1wSDK != null) {
            int i = equals + 49;
            toString = i % 128;
            if (i % 2 == 0) {
                AFh1cSDK aFh1cSDK = aFi1wSDK.getMonetizationNetwork;
                if (aFh1cSDK != null) {
                    AFi1xSDK aFi1xSDK = aFh1cSDK.AFAdRevenueData;
                    equals = (toString + 51) % 128;
                    return aFi1xSDK;
                }
            } else {
                AFh1cSDK aFh1cSDK2 = aFi1wSDK.getMonetizationNetwork;
                throw null;
            }
        }
        return null;
    }

    private void AFInAppEventParameterName() {
        toString = (equals + 89) % 128;
        this.component1.component2().getMonetizationNetwork("participantInProxy");
        equals = (toString + 121) % 128;
    }

    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        AFd1kSDK aFd1kSDK = (AFd1kSDK) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = toString + 41;
        equals = i % 128;
        if (i % 2 != 0) {
            aFd1kSDK.component1.component2().getCurrencyIso4217Code("participantInProxy", zBooleanValue);
            toString = (equals + 31) % 128;
            return null;
        }
        aFd1kSDK.component1.component2().getCurrencyIso4217Code("participantInProxy", zBooleanValue);
        throw new ArithmeticException();
    }

    private boolean registerClient() {
        equals = (toString + 9) % 128;
        return this.component1.component2().getMediationNetwork("participantInProxy", false);
    }

    static void component3() {
        areAllFieldsValid = -866183138771165766L;
        hashCode = 1193057722;
        copy = (char) 29794;
    }

    private void getMonetizationNetwork(boolean z) {
        getMediationNetwork(new Object[]{this, Boolean.valueOf(z)}, 124011145, -124011142, System.identityHashCode(this));
    }

    private boolean copydefault() {
        return ((Boolean) getMediationNetwork(new Object[]{this}, -1999031441, 1999031443, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.appsflyer.internal.AFd1pSDK
    public final void getMediationNetwork(String str, String... strArr) {
        getMediationNetwork(new Object[]{this, str, strArr}, 595413115, -595413114, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFd1pSDK
    public final boolean getMonetizationNetwork() {
        return ((Boolean) getMediationNetwork(new Object[]{this}, -1790300573, 1790300573, System.identityHashCode(this))).booleanValue();
    }
}
