package com.appsflyer.internal;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.exifinterface.media.ExifInterface;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import defpackage.getSupportedPostviewSize;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes3.dex */
public final class AFj1sSDK {
    public final List<AFj1qSDK> getCurrencyIso4217Code = new ArrayList();
    public final AFc1dSDK getMediationNetwork;
    private static final byte[] $$c = {109, 84, -87, -114};
    private static final int $$f = 88;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {Base64.padSymbol, -108, 49, -100, -4, -20, -6, 6, -26, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$e = 86;
    private static final byte[] $$a = {5, -91, 77, 46, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
    private static final int $$b = 113;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f374a = 1;
    private static char[] TuitionPaymentFragmentbindingInflater1 = {47335, 47386, 47332, 47382, 47385, 47391, 47322, 47381, 47349, 47375, 47380, 47331, 47387, 47301, 47388, 47333, 47389, 47384, 47350, 47303, 47378, 47348, 47328, 47379, 47390, 47329, 47296};
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 2047719560;
    private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
    private static boolean b = true;

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.appsflyer.internal.AFj1sSDK.$$a
            int r1 = r6 + 1
            int r7 = r7 * 52
            int r7 = r7 + 4
            int r8 = r8 * 14
            int r8 = r8 + 84
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2c
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r7 = -r7
            int r3 = r3 + r7
            int r7 = r8 + 1
            int r8 = r3 + (-10)
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFj1sSDK.c(int, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0031). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(int r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.appsflyer.internal.AFj1sSDK.$$d
            int r6 = r6 * 5
            int r6 = 9 - r6
            int r8 = r8 * 47
            int r1 = r8 + 6
            int r7 = r7 * 33
            int r7 = r7 + 84
            byte[] r1 = new byte[r1]
            int r8 = r8 + 5
            r2 = 0
            if (r0 != 0) goto L19
            r7 = r6
            r4 = r8
            r3 = r2
            goto L31
        L19:
            r3 = r2
        L1a:
            r5 = r7
            r7 = r6
            r6 = r5
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2a:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r5
        L31:
            int r6 = r6 + 1
            int r4 = -r4
            int r7 = r7 + r4
            int r7 = r7 + (-11)
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFj1sSDK.e(int, int, short, java.lang.Object[]):void");
    }

    public AFj1sSDK(AFc1dSDK aFc1dSDK) {
        this.getMediationNetwork = aFc1dSDK;
    }

    public final void getMediationNetwork(AFj1qSDK aFj1qSDK) {
        synchronized (this) {
            this.getCurrencyIso4217Code.add(aFj1qSDK);
        }
    }

    public final AFj1qSDK[] getRevenue() {
        AFj1qSDK[] aFj1qSDKArr;
        synchronized (this) {
            aFj1qSDKArr = (AFj1qSDK[]) this.getCurrencyIso4217Code.toArray(new AFj1qSDK[0]);
        }
        return aFj1qSDKArr;
    }

    private static void d(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
        char[] cArr2;
        int i2 = 2 % 2;
        getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
        char[] cArr3 = TuitionPaymentFragmentbindingInflater1;
        char c = '0';
        int i3 = 0;
        if (cArr3 != null) {
            int i4 = $10 + 77;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i3] = Integer.valueOf(cArr3[i6]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char capsMode = (char) (31339 - TextUtils.getCapsMode("", i3, i3));
                        int iResolveSizeAndState = View.resolveSizeAndState(i3, i3, i3) + 2994;
                        int iLastIndexOf = 16 - TextUtils.lastIndexOf("", c);
                        byte b2 = (byte) i3;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(capsMode, iResolveSizeAndState, iLastIndexOf, 1182129903, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr4[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i6++;
                    c = '0';
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr4;
        }
        Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
        long j = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (KeyEvent.getDeadChar(0, 0) + 43325), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 252, 22 - TextUtils.getCapsMode("", 0, 0), 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
        if (b) {
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
            char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                Object[] objArr4 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b4 = (byte) 1;
                    byte b5 = (byte) (b4 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((Process.myTid() >> 22) + 33602), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 3085, Color.alpha(0) + 26, -2146875848, false, $$g(b4, b5, b5), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr5);
            return;
        }
        if (TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            int i7 = $11 + 87;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
                cArr2 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            } else {
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
                cArr2 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            }
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                int i8 = $11 + 95;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                cArr2[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b6 = (byte) 1;
                    byte b7 = (byte) (b6 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1)) + 33601), 3084 - TextUtils.indexOf((CharSequence) "", '0'), 25 - TextUtils.lastIndexOf("", '0', 0, 0), -2146875848, false, $$g(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                j = 0;
            }
            objArr[0] = new String(cArr2);
            return;
        }
        int i10 = 0;
        getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
        char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
        while (true) {
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i10;
            while (true) {
                if (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >= getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                    objArr[0] = new String(cArr6);
                    return;
                }
                int i11 = $10 + 77;
                $11 = i11 % 128;
                if (i11 % 2 == 0) {
                    cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 >> 1) >> getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] / iIntValue);
                    int i12 = getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                }
            }
            cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
            i10 = getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x024d  */
    public final void getMediationNetwork(final Runnable runnable) {
        Object[] objArr;
        int i = 2 % 2;
        AFj1zSDK aFj1zSDK = new AFj1zSDK(this.getMediationNetwork.getRevenue(), this.getMediationNetwork.getMonetizationNetwork(), AFj1ySDK.FACEBOOK, runnable, new Runnable() { // from class: com.appsflyer.internal.AFj1sSDK$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                AFj1sSDK.$r8$lambda$w5cBXyXhclVwL1qxfnURPt9H37g(this.f$0, runnable);
            }
        });
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char capsMode = (char) (TextUtils.getCapsMode("", 0, 0) + 31533);
            int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 921;
            int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 28;
            byte[] bArr = $$a;
            byte b2 = bArr[80];
            Object[] objArr2 = new Object[1];
            c(b2, b2, bArr[7], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(capsMode, threadPriority, iCombineMeasuredStates, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        d(null, null, 127 - Color.argb(0, 0, 0, 0), new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        d(null, null, 127 - KeyEvent.normalizeMetaState(0), new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 31533);
            int i3 = 922 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
            int threadPriority2 = ((Process.getThreadPriority(0) + 20) >> 6) + 28;
            byte b3 = $$a[80];
            Object[] objArr5 = new Object[1];
            c((byte) 52, b3, b3, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, i3, threadPriority2, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c2 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 31532);
                int iCombineMeasuredStates2 = View.combineMeasuredStates(0, 0) + 921;
                int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 28;
                byte[] bArr2 = $$a;
                Object[] objArr6 = new Object[1];
                c((byte) (bArr2[17] + 1), bArr2[7], bArr2[80], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, iCombineMeasuredStates2, doubleTapTimeout, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i4 = ((int[]) objArr7[3])[0];
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{i4}, (String[]) objArr7[4]};
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i5 = ~iMaxMemory;
            int i6 = (((134002307 + ((((~((-621331933) | i5)) | 67141788) | (~((-1152747712) | i5))) * (-1136))) + ((((~((-621331933) | iMaxMemory)) | (~((-1152747712) | iMaxMemory))) | (~(1706937855 | i5))) * (-568))) + (((~(iMaxMemory | (-67141789))) | ((~(i5 | 1152747711)) | (~(621331932 | i5)))) * 568)) - 276467483;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[0])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            d(null, null, TextUtils.indexOf((CharSequence) "", '0') + 128, new byte[]{-125, -127, -116, -124, -105, -106, -118, -117, -122, -107, -122, -117, -112, -108, -121, -110, -110, -127, -121, -125, -122, -123, -124, -125, -126, -127}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            d(null, null, TextUtils.lastIndexOf("", '0') + 128, new byte[]{-126, -123, -122, -117, -127, -112, -122, -113, -110, -110, -108, -117, -126, -116, -124, -124, -104, -112}, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                int i10 = i9 + 43;
                f374a = i10 % 128;
                int i11 = i10 % 2;
                if (applicationContext instanceof ContextWrapper) {
                    int i12 = i9 + 101;
                    f374a = i12 % 128;
                    if (i12 % 2 == 0) {
                        ((ContextWrapper) applicationContext).getBaseContext();
                        throw null;
                    }
                    if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = applicationContext.getApplicationContext();
                    } else {
                        applicationContext = null;
                    }
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                }
            }
            Object[] objArr10 = new Object[1];
            d(null, null, 126 - TextUtils.lastIndexOf("", '0'), new byte[]{-115, -116, -117, -120, -118, -119, -121, -102, -126, -127, -113, -121, -127, -107, -127, -103}, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            d(null, null, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 127, new byte[]{-116, -125, -123, -114, -105, -120, -127, -101, -118, -117, -122, -117, -126, -116, -125, -122}, objArr11);
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, -276467483};
                byte[] bArr3 = $$d;
                byte b4 = bArr3[10];
                Object[] objArr13 = new Object[1];
                e(b4, b4, bArr3[12], objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b5 = bArr3[12];
                Object[] objArr14 = new Object[1];
                e(b5, b5, bArr3[10], objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cRgb = (char) (Color.rgb(0, 0, 0) + 16808749);
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 922;
                    int packedPositionGroup = 28 - ExpandableListView.getPackedPositionGroup(0L);
                    byte[] bArr4 = $$a;
                    Object[] objArr16 = new Object[1];
                    c((byte) (bArr4[17] + 1), bArr4[7], bArr4[80], objArr16);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cRgb, iLastIndexOf, packedPositionGroup, -1142834547, false, (String) objArr16[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                try {
                    Object[] objArr17 = new Object[1];
                    d(null, null, 128 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr17);
                    Class<?> cls5 = Class.forName((String) objArr17[0]);
                    Object[] objArr18 = new Object[1];
                    d(null, null, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 126, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr18);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char gidForName = (char) (31532 - Process.getGidForName(""));
                        int i13 = 922 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                        int i14 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 28;
                        byte b6 = $$a[80];
                        Object[] objArr19 = new Object[1];
                        c((byte) 52, b6, b6, objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(gidForName, i13, i14, -778300370, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char jumpTapTimeout = (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 31533);
                        int iIndexOf = 920 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                        int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 28;
                        byte[] bArr5 = $$a;
                        byte b7 = bArr5[80];
                        Object[] objArr20 = new Object[1];
                        c(b7, b7, bArr5[7], objArr20);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(jumpTapTimeout, iIndexOf, scrollBarSize, -1048449946, false, (String) objArr20[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr15;
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i15 = ((int[]) objArr[1])[0];
        int i16 = ((int[]) objArr[3])[0];
        if (i16 != i15) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                while (i2 < strArr.length) {
                    int i17 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 75;
                    f374a = i17 % 128;
                    int i18 = i17 % 2;
                    arrayList.add(strArr[i2]);
                    i2++;
                    int i19 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 89;
                    f374a = i19 % 128;
                    int i20 = i19 % 2;
                }
            }
            throw new RuntimeException(String.valueOf(i16));
        }
        int i21 = ((int[]) objArr[0])[0];
        int i22 = ((int[]) objArr[3])[0];
        Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{i22}, (String[]) objArr[4]};
        int iMyTid = Process.myTid();
        int i23 = ~iMyTid;
        int i24 = (~((-1742718416) | i23)) | 31359180;
        int i25 = ~(iMyTid | 1742720463);
        int i26 = i21 + ((i24 | i25) * (-252)) + 1086658411 + ((i25 | (~(i23 | (-1711359236)))) * 252);
        int i27 = (i26 << 13) ^ i26;
        int i28 = i27 ^ (i27 >>> 17);
        ((int[]) objArr21[0])[0] = i28 ^ (i28 << 5);
        getMediationNetwork(aFj1zSDK);
    }

    private /* synthetic */ void getCurrencyIso4217Code(final Runnable runnable) {
        int i = 2 % 2;
        AFj1dSDK.getMediationNetwork(this.getMediationNetwork.AFAdRevenueData(), new Runnable() { // from class: com.appsflyer.internal.AFj1sSDK$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                AFj1sSDK.m7546$r8$lambda$fnlS7WzN_0uPwHNAEZw6dQJ8iE(this.f$0, runnable);
            }
        }, 0L, TimeUnit.MILLISECONDS);
        int i2 = f374a + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 8 / 0;
        }
    }

    private /* synthetic */ void getRevenue(Runnable runnable) {
        int i = 2 % 2;
        try {
            if (!(!getCurrencyIso4217Code(new AFh1kSDK()))) {
                int i2 = f374a + 111;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
                if (i2 % 2 != 0) {
                    runnable.run();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                runnable.run();
                int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 3;
                f374a = i3 % 128;
                int i4 = i3 % 2;
            }
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
        }
    }

    public final AFi1aSDK AFAdRevenueData(final Runnable runnable) {
        int i = 2 % 2;
        AFi1aSDK aFi1aSDK = new AFi1aSDK(new Runnable() { // from class: com.appsflyer.internal.AFj1sSDK$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                AFj1sSDK.$r8$lambda$NGFpXf371N6tfDOV4pNzKS1S9m0(this.f$0, runnable);
            }
        }, this.getMediationNetwork.getMonetizationNetwork(), this.getMediationNetwork.getRevenue());
        int i2 = f374a + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        return aFi1aSDK;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0052 A[RETURN] */
    public final boolean getCurrencyIso4217Code(AFh1rSDK aFh1rSDK) {
        boolean z;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 15;
        f374a = i2 % 128;
        int i3 = i2 % 2;
        int iAFAdRevenueData = this.getMediationNetwork.getRevenue().getMonetizationNetwork.AFAdRevenueData("appsFlyerCount", 0);
        if (iAFAdRevenueData == 1 && (!(aFh1rSDK instanceof AFh1kSDK))) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 35;
            f374a = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!this.getMediationNetwork.component2().getMediationNetwork(AppsFlyerProperties.NEW_REFERRER_SENT, false)) {
            int i6 = f374a + 45;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
            if (i6 % 2 == 0 ? iAFAdRevenueData != 1 : iAFAdRevenueData != 0) {
                if (z) {
                    return false;
                }
            }
        } else if (z) {
            return false;
        }
        return true;
    }

    public final Runnable AFAdRevenueData(final AFi1aSDK aFi1aSDK, final Runnable runnable) {
        int i = 2 % 2;
        Runnable runnable2 = new Runnable() { // from class: com.appsflyer.internal.AFj1sSDK$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                AFj1sSDK.$r8$lambda$XozqFaS_B7XTOxdmYlzC9Q7Ra9s(this.f$0, aFi1aSDK, runnable);
            }
        };
        int i2 = f374a + 9;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        return runnable2;
    }

    private /* synthetic */ void getMonetizationNetwork(AFi1aSDK aFi1aSDK, Runnable runnable) {
        int i = 2 % 2;
        int i2 = f374a + 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        AFc1qSDK aFc1qSDKComponent2 = this.getMediationNetwork.component2();
        boolean z = false;
        int iAFAdRevenueData = this.getMediationNetwork.getRevenue().getMonetizationNetwork.AFAdRevenueData("appsFlyerCount", 0);
        boolean mediationNetwork = aFc1qSDKComponent2.getMediationNetwork(AppsFlyerProperties.NEW_REFERRER_SENT, false);
        if (aFi1aSDK.component4 == AFj1qSDK.AFa1ySDK.NOT_STARTED) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 25;
            f374a = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        }
        if (iAFAdRevenueData == 1) {
            if (z || mediationNetwork) {
                runnable.run();
                int i6 = f374a + 83;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
                int i7 = i6 % 2;
            }
        }
    }

    public final boolean getMonetizationNetwork() {
        int i = 2 % 2;
        int i2 = f374a + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        boolean monetizationNetwork = this.getMediationNetwork.getRevenue().getMonetizationNetwork("AF_PREINSTALL_DISABLED", false);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 21;
        f374a = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 35 / 0;
        }
        return monetizationNetwork;
    }

    public final boolean AFAdRevenueData() {
        int i = 2 % 2;
        int i2 = f374a + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Iterator<AFj1qSDK> it = this.getCurrencyIso4217Code.iterator();
        while (!(!it.hasNext())) {
            if (it.next().component4 == AFj1qSDK.AFa1ySDK.STARTED) {
                return false;
            }
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 33;
        f374a = i4 % 128;
        if (i4 % 2 != 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private /* synthetic */ void getMonetizationNetwork(Runnable runnable) {
        int i = 2 % 2;
        AFj1zSDK aFj1zSDK = new AFj1zSDK(this.getMediationNetwork.getRevenue(), this.getMediationNetwork.getMonetizationNetwork(), AFj1ySDK.FACEBOOK_LITE, runnable, new Runnable() { // from class: com.appsflyer.internal.AFj1sSDK$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                AFj1sSDK.m7545$r8$lambda$JZnfO6Uodgd4pdPgBqK_Z6kang();
            }
        });
        getMediationNetwork(aFj1zSDK);
        aFj1zSDK.getRevenue(this.getMediationNetwork.AFInAppEventType().getMonetizationNetwork);
        int i2 = f374a + 119;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private /* synthetic */ void component2(final Runnable runnable) {
        int i = 2 % 2;
        AFj1zSDK aFj1zSDK = new AFj1zSDK(this.getMediationNetwork.getRevenue(), this.getMediationNetwork.getMonetizationNetwork(), AFj1ySDK.INSTAGRAM, runnable, new Runnable() { // from class: com.appsflyer.internal.AFj1sSDK$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                AFj1sSDK.$r8$lambda$QUrJ2DIe0N85RlFB3GckkFxOXOw(this.f$0, runnable);
            }
        });
        getMediationNetwork(aFj1zSDK);
        aFj1zSDK.getRevenue(this.getMediationNetwork.AFInAppEventType().getMonetizationNetwork);
        int i2 = f374a + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX INFO: renamed from: $r8$lambda$JZnfO6Uodgd4pdPgBqK_Z6-kang, reason: not valid java name */
    public static /* synthetic */ void m7545$r8$lambda$JZnfO6Uodgd4pdPgBqK_Z6kang() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 1;
        f374a = i2 % 128;
        int i3 = i2 % 2;
        getCurrencyIso4217Code();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 109;
        f374a = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void $r8$lambda$NGFpXf371N6tfDOV4pNzKS1S9m0(AFj1sSDK aFj1sSDK, Runnable runnable) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 115;
        f374a = i2 % 128;
        int i3 = i2 % 2;
        aFj1sSDK.getCurrencyIso4217Code(runnable);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 83;
        f374a = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void $r8$lambda$QUrJ2DIe0N85RlFB3GckkFxOXOw(AFj1sSDK aFj1sSDK, Runnable runnable) {
        int i = 2 % 2;
        int i2 = f374a + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        aFj1sSDK.getMonetizationNetwork(runnable);
        if (i3 != 0) {
            int i4 = 19 / 0;
        }
    }

    public static /* synthetic */ void $r8$lambda$XozqFaS_B7XTOxdmYlzC9Q7Ra9s(AFj1sSDK aFj1sSDK, AFi1aSDK aFi1aSDK, Runnable runnable) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 121;
        f374a = i2 % 128;
        int i3 = i2 % 2;
        aFj1sSDK.getMonetizationNetwork(aFi1aSDK, runnable);
        if (i3 == 0) {
            int i4 = 45 / 0;
        }
    }

    /* JADX INFO: renamed from: $r8$lambda$fnlS7W-zN_0uPwHNAEZw6dQJ8iE, reason: not valid java name */
    public static /* synthetic */ void m7546$r8$lambda$fnlS7WzN_0uPwHNAEZw6dQJ8iE(AFj1sSDK aFj1sSDK, Runnable runnable) {
        int i = 2 % 2;
        int i2 = f374a + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        aFj1sSDK.getRevenue(runnable);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 81;
        f374a = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 77 / 0;
        }
    }

    public static /* synthetic */ void $r8$lambda$w5cBXyXhclVwL1qxfnURPt9H37g(AFj1sSDK aFj1sSDK, Runnable runnable) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 53;
        f374a = i2 % 128;
        int i3 = i2 % 2;
        aFj1sSDK.component2(runnable);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 77;
        f374a = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ void getCurrencyIso4217Code() {
        int i = 2 % 2;
        int i2 = f374a + 7;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r5, int r6, byte r7) {
        /*
            int r6 = r6 * 3
            int r6 = r6 + 4
            int r7 = r7 * 4
            int r0 = r7 + 1
            int r5 = 68 - r5
            byte[] r1 = com.appsflyer.internal.AFj1sSDK.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r4 = r5
            r5 = r7
            r3 = r2
            goto L25
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r5
            r0[r3] = r4
            if (r3 != r7) goto L21
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L21:
            int r3 = r3 + 1
            r4 = r1[r6]
        L25:
            int r6 = r6 + 1
            int r5 = r5 + r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFj1sSDK.$$g(int, int, byte):java.lang.String");
    }
}
