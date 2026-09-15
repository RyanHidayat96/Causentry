package com.appsflyer.internal;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import defpackage.getSupportedPostviewSize;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class AFe1gSDK extends AFe1dSDK<String> {
    private final AFe1mSDK component2;
    private final AFc1pSDK copy;
    private final AFc1qSDK copydefault;
    private final Map<String, Object> equals;
    private final AFg1qSDK hashCode;
    private final AFf1dSDK toString;
    private static final byte[] $$c = {68, -119, -76, 97};
    private static final int $$f = 244;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {27, -8, 5, 78, 6, 55, -71, 14, 6, 4, 52, -50, -10, 6, -7, -3, 70, -61, -8, 9, 13, 52, -29, -40, 9, 5, -4, 14, -12, 12, -1, 20, -18, -13, -1, 10, -7};
    private static final int $$h = 168;
    private static final byte[] $$a = {97, 58, 103, -72, 23, -37, 42, 11, -10, 18, -7, 0, 7, 7, 23, -44, 44, 10, -5, 6, 18};
    private static final int $$b = 193;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static int asBinder = 1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {47327, 47314, 47324, 47310, 47313, 47319, 47250, 47309, 47277, 47303, 47308, 47323, 47315, 47293, 47316, 47325, 47317, 47312, 47278, 47318, 47306, 47321, 47288, 47320};
    private static int b = 2047719488;
    private static boolean TuitionPaymentFragmentbindingInflater1 = true;
    private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r5, short r6, short r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 + 4
            byte[] r0 = com.appsflyer.internal.AFe1gSDK.$$a
            int r1 = r7 + 1
            int r5 = r5 * 3
            int r5 = 100 - r5
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L13
            r4 = r5
            r5 = r7
            r3 = r2
            goto L27
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r5
            r1[r3] = r4
            if (r3 != r7) goto L21
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L21:
            int r6 = r6 + 1
            r4 = r0[r6]
            int r3 = r3 + 1
        L27:
            int r5 = r5 + r4
            int r5 = r5 + (-5)
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFe1gSDK.a(short, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(short r5, short r6, short r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 33
            int r0 = r6 + 1
            byte[] r1 = com.appsflyer.internal.AFe1gSDK.$$g
            int r5 = r5 + 4
            int r7 = r7 * 7
            int r7 = 105 - r7
            byte[] r0 = new byte[r0]
            r2 = -1
            if (r1 != 0) goto L14
            r3 = r2
            r2 = r5
            goto L2f
        L14:
            r4 = r7
            r7 = r5
            r5 = r4
        L17:
            int r2 = r2 + 1
            byte r3 = (byte) r5
            r0[r2] = r3
            int r7 = r7 + 1
            if (r2 != r6) goto L29
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r0, r6)
            r8[r6] = r5
            return
        L29:
            r3 = r1[r7]
            r4 = r2
            r2 = r7
            r7 = r3
            r3 = r4
        L2f:
            int r7 = -r7
            int r5 = r5 + r7
            int r5 = r5 + 1
            r7 = r2
            r2 = r3
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFe1gSDK.d(short, short, short, java.lang.Object[]):void");
    }

    public abstract AFd1nSDK<String> AFAdRevenueData(Map<String, Object> map, String str, String str2);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFe1gSDK(AFe1mSDK aFe1mSDK, AFe1mSDK[] aFe1mSDKArr, AFc1dSDK aFc1dSDK, String str, Map<String, ? extends Object> map) {
        super(aFe1mSDK, aFe1mSDKArr, aFc1dSDK, null);
        Intrinsics.checkNotNullParameter(aFe1mSDK, "");
        Intrinsics.checkNotNullParameter(aFe1mSDKArr, "");
        Intrinsics.checkNotNullParameter(aFc1dSDK, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.component2 = aFe1mSDK;
        this.equals = map;
        AFc1pSDK revenue = aFc1dSDK.getRevenue();
        Intrinsics.checkNotNullExpressionValue(revenue, "");
        this.copy = revenue;
        AFc1qSDK aFc1qSDKComponent2 = aFc1dSDK.component2();
        Intrinsics.checkNotNullExpressionValue(aFc1qSDKComponent2, "");
        this.copydefault = aFc1qSDKComponent2;
        AFg1qSDK aFg1qSDKComponent3 = aFc1dSDK.component3();
        Intrinsics.checkNotNullExpressionValue(aFg1qSDKComponent3, "");
        this.hashCode = aFg1qSDKComponent3;
        AFf1dSDK aFf1dSDKAfErrorLog = aFc1dSDK.afErrorLog();
        Intrinsics.checkNotNullExpressionValue(aFf1dSDKAfErrorLog, "");
        this.toString = aFf1dSDKAfErrorLog;
    }

    protected void getMediationNetwork(Map<String, Object> map, String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        map.put("app_id", this.copy.getRevenue.getMonetizationNetwork.getPackageName());
        String currencyIso4217Code = AFc1pSDK.getCurrencyIso4217Code();
        if (currencyIso4217Code != null) {
            map.put("cuid", currencyIso4217Code);
        }
        AFc1pSDK aFc1pSDK = this.copy;
        map.put("app_version_name", AFj1iSDK.getMediationNetwork(aFc1pSDK.getRevenue.getMonetizationNetwork, aFc1pSDK.getRevenue.getMonetizationNetwork.getPackageName()));
        if (!(!component1())) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 123;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            map.put("event_timestamp", Long.valueOf(this.hashCode.AFAdRevenueData()));
        }
        if (str != null) {
            int i4 = asBinder + 7;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            int i5 = i4 % 2;
            map.put("billing_lib_version", str);
            if (i5 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        int i6 = asBinder + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
        int i7 = i6 % 2;
    }

    private static void c(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
        int length;
        char[] cArr2;
        int i2 = 2;
        int i3 = 2 % 2;
        getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
        char[] cArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i4 = 1;
        int i5 = 0;
        if (cArr3 != null) {
            int i6 = $11 + 49;
            int i7 = i6 % 128;
            $10 = i7;
            if (i6 % 2 != 0) {
                length = cArr3.length;
                cArr2 = new char[length];
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
            }
            int i8 = i7 + 13;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 0;
            while (i10 < length) {
                int i11 = $11 + 67;
                $10 = i11 % 128;
                if (i11 % i2 != 0) {
                    try {
                        Object[] objArr2 = new Object[i4];
                        objArr2[i5] = Integer.valueOf(cArr3[i10]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char cMakeMeasureSpec = (char) (View.MeasureSpec.makeMeasureSpec(i5, i5) + 31339);
                            int iArgb = 2994 - Color.argb(i5, i5, i5, i5);
                            int iIndexOf = TextUtils.indexOf("", "", i5) + 17;
                            byte b2 = (byte) i4;
                            byte b3 = (byte) (b2 - 1);
                            String str$$i = $$i(b2, b3, b3);
                            Class[] clsArr = new Class[i4];
                            clsArr[0] = Integer.TYPE;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cMakeMeasureSpec, iArgb, iIndexOf, 1182129903, false, str$$i, clsArr);
                        }
                        cArr2[i10] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        i2 = 2;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    try {
                        Object[] objArr3 = new Object[i4];
                        objArr3[0] = Integer.valueOf(cArr3[i10]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b4 = (byte) i4;
                            byte b5 = (byte) (b4 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 31339), (Process.myPid() >> 22) + 2994, TextUtils.getTrimmedLength("") + 17, 1182129903, false, $$i(b4, b5, b5), new Class[]{Integer.TYPE});
                        }
                        cArr2[i10] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                        i10++;
                        i2 = 2;
                        i4 = 1;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                i5 = 0;
            }
            cArr3 = cArr2;
        }
        Object[] objArr4 = {Integer.valueOf(b)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43325 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), 254 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 22, 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
        int i12 = 33602;
        if (TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
            char[] cArr4 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                int i13 = $10 + 1;
                $11 = i13 % 128;
                int i14 = i13 % 2;
                cArr4[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (33602 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), 3085 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 26 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), -2146875848, false, $$i(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!TuitionPaymentFragmentbindingInflater1) {
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
            char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            int i15 = $11 + 91;
            $10 = i15 % 128;
            int i16 = i15 % 2;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i17 = $10 + 53;
        $11 = i17 % 128;
        int i18 = i17 % 2;
        getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
        char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
        getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
            int i19 = $10 + 63;
            $11 = i19 % 128;
            if (i19 % 2 == 0) {
                cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 + 1) * getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] % i] / iIntValue);
                Object[] objArr6 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (i12 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), TextUtils.indexOf("", "", 0, 0) + 3085, Color.red(0) + 26, -2146875848, false, $$i(b8, b9, b9), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
            } else {
                cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                Object[] objArr7 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    byte b10 = (byte) 0;
                    byte b11 = b10;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 33601), (ViewConfiguration.getTouchSlop() >> 8) + 3085, 26 - (Process.myPid() >> 22), -2146875848, false, $$i(b10, b11, b11), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7);
            }
            i12 = 33602;
        }
        objArr[0] = new String(cArr6);
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    protected final AFd1nSDK<String> getRevenue(String str) {
        String str2;
        String str3;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Map<String, Object> mutableMap = MapsKt.toMutableMap(this.equals);
        String strAFAdRevenueData = AFAdRevenueData(mutableMap);
        String monetizationNetwork = getMonetizationNetwork(mutableMap);
        Map<String, Object> mutableMap2 = MapsKt.toMutableMap(mutableMap);
        getMediationNetwork(mutableMap2, strAFAdRevenueData);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String strAFAdRevenueData2 = this.copy.AFAdRevenueData();
        String str4 = strAFAdRevenueData2;
        if (str4 != null && !StringsKt.isBlank(str4)) {
            linkedHashMap.put("advertising_id", strAFAdRevenueData2);
        }
        AFb1mSDK mediationNetwork = AFb1jSDK.getMediationNetwork(this.copy.getRevenue.getMonetizationNetwork);
        String str5 = null;
        if (mediationNetwork != null) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 103;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            str2 = mediationNetwork.getMonetizationNetwork;
        } else {
            str2 = null;
        }
        String str6 = str2;
        if (str6 != null && !StringsKt.isBlank(str6)) {
            linkedHashMap.put("oaid", str2);
        }
        AFb1mSDK aFb1mSDKK_ = AFb1jSDK.k_(this.copy.getRevenue.getMonetizationNetwork.getContentResolver());
        if (aFb1mSDKK_ != null) {
            int i4 = asBinder + 31;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            if (i4 % 2 != 0) {
                str3 = aFb1mSDKK_.getMonetizationNetwork;
                int i5 = 41 / 0;
            } else {
                str3 = aFb1mSDKK_.getMonetizationNetwork;
            }
        } else {
            str3 = null;
        }
        String str7 = str3;
        if (str7 != null && !StringsKt.isBlank(str7)) {
            linkedHashMap.put("amazon_aid", str3);
        }
        if (!AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 25;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
            AFf1gSDK aFf1gSDK = ((AFe1dSDK) this).component3;
            String str8 = (String) AFf1gSDK.getCurrencyIso4217Code(new Object[]{aFf1gSDK, this.copydefault}, -1198101809, 1198101809, System.identityHashCode(aFf1gSDK));
            String str9 = str8;
            if (str9 != null) {
                int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 35;
                asBinder = i8 % 128;
                if (i8 % 2 == 0) {
                    StringsKt.isBlank(str9);
                    throw null;
                }
                if (!StringsKt.isBlank(str9)) {
                    linkedHashMap.put("imei", str8);
                }
            }
        } else {
            mutableMap2.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
        }
        String revenue = AFb1iSDK.getRevenue(this.copy.getMonetizationNetwork);
        if (revenue == null) {
            int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 119;
            asBinder = i9 % 128;
            if (i9 % 2 == 0) {
                throw null;
            }
            revenue = "";
        }
        linkedHashMap.put("appsflyer_id", revenue);
        linkedHashMap.put("os_version", String.valueOf(Build.VERSION.SDK_INT));
        linkedHashMap.put("sdk_version", "6.17.0");
        String str10 = monetizationNetwork;
        if (str10 != null && !StringsKt.isBlank(str10)) {
            linkedHashMap.put("sdk_connector_version", monetizationNetwork);
        }
        mutableMap2.put("device_data", linkedHashMap);
        this.toString.AFAdRevenueData(mutableMap2, this.component2);
        AFd1nSDK<String> aFd1nSDKAFAdRevenueData = AFAdRevenueData(mutableMap2, str, strAFAdRevenueData);
        if (aFd1nSDKAFAdRevenueData != null) {
            int i10 = asBinder + 17;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i10 % 128;
            int i11 = i10 % 2;
            AFd1cSDK aFd1cSDK = aFd1nSDKAFAdRevenueData.getRevenue;
            if (aFd1cSDK != null) {
                int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 51;
                asBinder = i12 % 128;
                int i13 = i12 % 2;
                str5 = aFd1cSDK.getMonetizationNetwork;
            }
        }
        if (str5 != null) {
            JSONObject jSONObject = new JSONObject(mutableMap2);
            String string = toString();
            StringBuilder sb = new StringBuilder();
            sb.append(string);
            sb.append(": preparing data: ");
            AFh1ySDK.getCurrencyIso4217Code(sb.toString(), jSONObject);
            AFd1pSDK aFd1pSDK = ((AFe1dSDK) this).areAllFieldsValid;
            String string2 = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "");
            aFd1pSDK.getCurrencyIso4217Code(str5, string2);
        }
        int i14 = asBinder + 125;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i14 % 128;
        int i15 = i14 % 2;
        return aFd1nSDKAFAdRevenueData;
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [boolean, int] */
    protected boolean component1() throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        int i = 2 % 2;
        int i2 = asBinder + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
            int i4 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 877;
            int trimmedLength = 10 - TextUtils.getTrimmedLength("");
            byte b2 = (byte) ($$b & 7);
            Object[] objArr3 = new Object[1];
            a(b2, (byte) (-b2), $$a[17], objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(scrollBarFadeDuration, i4, trimmedLength, -1199417970, false, (String) objArr3[0], null);
        }
        Object obj = null;
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        c(null, null, Color.blue(0) + 127, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        c(null, null, 127 - TextUtils.getOffsetAfter("", 0), new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0'));
            int iGreen = Color.green(0) + 876;
            int i5 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 9;
            byte b3 = $$a[11];
            byte b4 = b3;
            Object[] objArr6 = new Object[1];
            a(b4, (byte) (b4 | 9), b3, objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cLastIndexOf, iGreen, i5, 254769921, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i6 = asBinder + 3;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
            int i7 = i6 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char bitsPerPixel = (char) ((-1) - ImageFormat.getBitsPerPixel(0));
                int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 876;
                int i8 = 10 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                byte b5 = (byte) ($$b & 7);
                Object[] objArr7 = new Object[1];
                a(b5, (byte) (b5 | 8), $$a[12], objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(bitsPerPixel, absoluteGravity, i8, 1324201839, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr8[0])[0]}, new int[1], new int[]{((int[]) objArr8[2])[0]}, (String[]) objArr8[3]};
            int i9 = ~((int) Process.getElapsedCpuTime());
            int i10 = (((-1247137304) + (((-339790017) | i9) * 494)) + (((~(i9 | (-342673652))) | 46077499) * 494)) - 369809262;
            int i11 = (i10 << 13) ^ i10;
            int i12 = i11 ^ (i11 >>> 17);
            ((int[]) objArr[1])[0] = i12 ^ (i12 << 5);
        } else {
            Object[] objArr9 = new Object[1];
            c(null, null, 127 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), new byte[]{-115, -116, -117, -120, -118, -119, -121, -106, -126, -127, -113, -121, -127, -107, -127, -108}, objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            c(null, null, 127 - Drawable.resolveOpacity(0, 0), new byte[]{-116, -125, -123, -114, -104, -120, -127, -105, -118, -117, -122, -117, -126, -116, -125, -122}, objArr10);
            try {
                Object[] objArr11 = {Integer.valueOf(((Integer) cls2.getMethod((String) objArr10[0], Object.class).invoke(null, this)).intValue()), -369809262};
                byte[] bArr = $$g;
                byte b6 = bArr[30];
                byte b7 = (byte) (-b6);
                Object[] objArr12 = new Object[1];
                d(b6, b7, (byte) (b7 - 1), objArr12);
                Class<?> cls3 = Class.forName((String) objArr12[0]);
                byte b8 = (byte) ($$h & 112);
                byte b9 = bArr[30];
                Object[] objArr13 = new Object[1];
                d(b8, (byte) (b9 + 1), (byte) (-b9), objArr13);
                objArr = (Object[]) cls3.getMethod((String) objArr13[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char deadChar = (char) KeyEvent.getDeadChar(0, 0);
                    int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 876;
                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 11;
                    byte b10 = (byte) ($$b & 7);
                    Object[] objArr14 = new Object[1];
                    a(b10, (byte) (b10 | 8), $$a[12], objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(deadChar, longPressTimeout, iIndexOf, 1324201839, false, (String) objArr14[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr15 = new Object[1];
                    c(null, null, View.combineMeasuredStates(0, 0) + 127, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr15);
                    Class<?> cls4 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    c(null, null, Color.argb(0, 0, 0, 0) + 127, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr16);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char trimmedLength2 = (char) TextUtils.getTrimmedLength("");
                        int iMyTid = (Process.myTid() >> 22) + 876;
                        int iIndexOf2 = 10 - TextUtils.indexOf("", "");
                        byte b11 = $$a[11];
                        byte b12 = b11;
                        Object[] objArr17 = new Object[1];
                        a(b12, (byte) (b12 | 9), b11, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(trimmedLength2, iMyTid, iIndexOf2, 254769921, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                        int maxKeyCode = 876 - (KeyEvent.getMaxKeyCode() >> 16);
                        int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 10;
                        byte b13 = (byte) ($$b & 7);
                        Object[] objArr18 = new Object[1];
                        a(b13, (byte) (-b13), $$a[17], objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(edgeSlop, maxKeyCode, iNormalizeMetaState, -1199417970, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i13 = ((int[]) objArr[2])[0];
        int i14 = ((int[]) objArr[0])[0];
        if (i14 == i13) {
            int i15 = ((int[]) objArr[1])[0];
            objArr2 = new Object[]{new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int i16 = (int) Runtime.getRuntime().totalMemory();
            int i17 = (-1032508948) + (((~((-1051691557) | i16)) | 1011381327) * (-318));
            int i18 = ~(1011381327 | i16);
            int i19 = ~i16;
            int i20 = i15 + i17 + ((i18 | (~((-4224076) | i19))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + (((~(i16 | (-4224076))) | (~(1055915631 | i19))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET);
            int i21 = (i20 << 13) ^ i20;
            int i22 = i21 ^ (i21 >>> 17);
            ((int[]) objArr2[1])[0] = i22 ^ (i22 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[3];
            if (strArr != null) {
                int i23 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 51;
                asBinder = i23 % 128;
                for (int i24 = i23 % 2 == 0 ? 1 : 0; i24 < strArr.length; i24++) {
                    arrayList.add(strArr[i24]);
                }
            }
            int[] iArr = new int[i14];
            int i25 = i14 - 1;
            iArr[i25] = 1;
            Toast.makeText((Context) null, iArr[((i14 * i25) % 2) - 1], 1).show();
            int i26 = ((int[]) objArr[1])[0];
            objArr2 = new Object[]{new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int i27 = ~System.identityHashCode(this);
            int i28 = i26 + 189264874 + ((~((-423886977) | i27)) * (-783)) + (((~(i27 | (-426128053))) | (-466438282)) * 783);
            int i29 = (i28 << 13) ^ i28;
            int i30 = i29 ^ (i29 >>> 17);
            ((int[]) objArr2[1])[0] = i30 ^ (i30 << 5);
        }
        int i31 = ((int[]) objArr2[1])[0];
        int i32 = i31 * i31;
        int i33 = -(587483237 * i31);
        int i34 = (i32 ^ i33) + ((i32 & i33) << 1);
        int i35 = -(i31 * 969920023);
        int i36 = ((i34 | i35) << 1) - (i35 ^ i34);
        int i37 = ((i36 | (-1747557628)) << 1) - ((-1747557628) ^ i36);
        int i38 = ((i37 >> 29) - 15) / 8;
        int i39 = (i38 ^ 1) + ((i38 & 1) << 1);
        int i40 = (i37 & i39) + (i39 | i37);
        int i41 = i37 >> 26;
        int i42 = ((i41 ^ ComposerKt.defaultsKey) + ((i41 & ComposerKt.defaultsKey) << 1)) / 64;
        int i43 = (-(i40 ^ ((i42 & 1) + (i42 | 1)))) + 8;
        int i44 = i43 >> 21;
        int i45 = ((i44 ^ (-4095)) + ((i44 & (-4095)) << 1)) / 2048;
        int i46 = (i45 & 1) + (i45 | 1);
        ?? r6 = 0 / ((i43 & (-((i46 ^ 1) + ((i46 & 1) << 1)))) * 663);
        int i47 = asBinder + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i47 % 128;
        if (i47 % 2 == 0) {
            return r6;
        }
        obj.hashCode();
        throw null;
    }

    protected String AFAdRevenueData(Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = asBinder + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 25;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    protected final AppsFlyerRequestListener component3() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 7;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 43;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        Object obj = null;
        if (i5 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    protected final boolean copydefault() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        boolean z = i3 % 2 == 0;
        int i4 = i2 + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            return z;
        }
        throw null;
    }

    protected String getMonetizationNetwork(Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = asBinder + 87;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Intrinsics.checkNotNullParameter(map, "");
        if (i3 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(short r7, byte r8, int r9) {
        /*
            int r9 = r9 * 4
            int r9 = 1 - r9
            byte[] r0 = com.appsflyer.internal.AFe1gSDK.$$c
            int r8 = r8 * 4
            int r8 = 4 - r8
            int r7 = r7 + 67
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L15
            r7 = r8
            r3 = r9
            r5 = r2
            goto L28
        L15:
            r3 = r2
            r6 = r8
            r8 = r7
            r7 = r6
        L19:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L26
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L26:
            r3 = r0[r7]
        L28:
            int r3 = -r3
            int r8 = r8 + r3
            int r7 = r7 + 1
            r3 = r5
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFe1gSDK.$$i(short, byte, int):java.lang.String");
    }
}
