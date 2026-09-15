package com.appsflyer.internal;

import android.adservices.measurement.MeasurementManager;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import com.appsflyer.AFLogger;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import defpackage.SessionConfigValidatingBuilder;
import defpackage.getCompleter;
import defpackage.initSession;
import defpackage.updateSelectorStateCompat;
import java.io.ByteArrayInputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes3.dex */
public final class AFj1iSDK {
    private static final byte[] $$c = {118, 35, -100, -35};
    private static final int $$f = 92;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {21, 65, -9, -121, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$e = 254;
    private static final byte[] $$a = {88, 99, -94, -58, -15, 8, -16, 1, 4, 3, 52, -55, -14, -1, -8, 13, -11, -8, 68, -68, 1, Base64.padSymbol, -36, -19, -4, -10, 8, -8, 0, 22, -22, -15, 11, -8, 0, -15, 0, -17, 34, -19, -4, -10, 8, -8, 0, 26, -39, 6, -11};
    private static final int $$b = 234;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
    private static int[] b = {1164979973, -959883784, -149136560, -2005739226, 1667984498, -1313451968, 1530123027, 1911565727, -1066893992, 1341829706, 1497626558, 834564307, -671571688, -2080512207, 1836318654, -896364923, -1678174510, -1462730150};

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r7, int r8, byte r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 32
            int r9 = 36 - r9
            int r7 = r7 * 6
            int r7 = r7 + 97
            int r8 = r8 * 19
            int r8 = 33 - r8
            byte[] r0 = com.appsflyer.internal.AFj1iSDK.$$a
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r8
            r7 = r9
            r4 = r2
            goto L2f
        L17:
            r3 = r2
        L18:
            r6 = r9
            r9 = r7
            r7 = r6
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r8) goto L2a
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L2a:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r6
        L2f:
            int r9 = r9 + 1
            int r3 = -r3
            int r7 = r7 + r3
            int r7 = r7 + (-2)
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFj1iSDK.a(short, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r5, byte r6, short r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 52
            int r5 = r5 + 4
            int r7 = 103 - r7
            int r6 = r6 * 52
            int r0 = r6 + 1
            byte[] r1 = com.appsflyer.internal.AFj1iSDK.$$d
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r4 = r7
            r3 = r2
            r7 = r6
            goto L27
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L23:
            int r3 = r3 + 1
            r4 = r1[r5]
        L27:
            int r5 = r5 + 1
            int r7 = r7 + r4
            int r7 = r7 + (-11)
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFj1iSDK.c(short, byte, short, java.lang.Object[]):void");
    }

    public static boolean L_(Context context, Intent intent) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 91;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        if (context.getPackageManager().queryIntentServices(intent, 0).size() <= 0) {
            return false;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 19;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002b  */
    /* JADX WARN: Code duplicated, block: B:14:0x0035  */
    /* JADX WARN: Code duplicated, block: B:16:0x0040 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:17:0x0041  */
    /* JADX WARN: Code duplicated, block: B:26:0x001d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    public static boolean getRevenue(Context context) {
        int i;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentbindingInflater1 + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 56 / 0;
            if (context != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    try {
                        if (((MeasurementManager) context.getApplicationContext().getSystemService(MeasurementManager.class)) != null) {
                            int i5 = TuitionPaymentFragmentbindingInflater1 + 33;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
                            int i6 = i5 % 2;
                            return true;
                        }
                        i = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 49;
                        TuitionPaymentFragmentbindingInflater1 = i % 128;
                        if (i % 2 == 0) {
                            return false;
                        }
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    } catch (Throwable th) {
                        AFLogger.INSTANCE.e(AFg1cSDK.PRIVACY_SANDBOX, th.getMessage() != null ? th.getMessage() : "", th, false, false);
                        int i7 = TuitionPaymentFragmentbindingInflater1 + 105;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
                        int i8 = i7 % 2;
                    }
                }
            }
        } else if (context != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (((MeasurementManager) context.getApplicationContext().getSystemService(MeasurementManager.class)) != null) {
                    int i9 = TuitionPaymentFragmentbindingInflater1 + 33;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i9 % 128;
                    int i10 = i9 % 2;
                    return true;
                }
                i = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 49;
                TuitionPaymentFragmentbindingInflater1 = i % 128;
                if (i % 2 == 0) {
                    return false;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }
        return false;
    }

    public static boolean getMonetizationNetwork(Context context) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (context == null) {
            return false;
        }
        int i4 = i2 + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        try {
            IntegrityManagerFactory.create(context);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean getCurrencyIso4217Code(Context context) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 13;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        if (context != null) {
            int i5 = i3 + 69;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            int i6 = i5 % 2;
            try {
                AppSet.getClient(context);
                return true;
            } catch (Throwable unused) {
            }
        }
        int i7 = TuitionPaymentFragmentbindingInflater1 + 115;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
        if (i7 % 2 != 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static boolean AFAdRevenueData(Context context) {
        int i = 2 % 2;
        if (context != null) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 101;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            int i3 = i2 % 2;
            try {
                if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0) {
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 81;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 == 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static boolean getMonetizationNetwork(Context context, String str) {
        int i = 2 % 2;
        int iCheckPermission = context.checkPermission(str, Process.myPid(), Process.myUid());
        StringBuilder sb = new StringBuilder("is Permission Available: ");
        sb.append(str);
        sb.append("; res: ");
        sb.append(iCheckPermission);
        AFLogger.afRDLog(sb.toString());
        if (iCheckPermission == 0) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 61;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            return i2 % 2 == 0;
        }
        int i3 = TuitionPaymentFragmentbindingInflater1 + 125;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    public static boolean getMediationNetwork() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 25;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            return Build.BRAND.equals("OPPO");
        }
        int i3 = 97 / 0;
        return Build.BRAND.equals("OPPO");
    }

    private static void d(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = b;
        int i4 = -1870535734;
        int i5 = 1;
        int i6 = 0;
        if (iArr2 != null) {
            int i7 = $10 + 63;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i9 = 0;
            while (i9 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i9])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), 3292 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), View.resolveSize(0, 0) + 31, 1948206109, false, $$g(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                    }
                    iArr3[i9] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    i9++;
                    i4 = -1870535734;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = b;
        char c = '0';
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i10 = 0;
            while (i10 < length3) {
                try {
                    Object[] objArr3 = new Object[i5];
                    objArr3[i6] = Integer.valueOf(iArr5[i10]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        char defaultSize = (char) View.getDefaultSize(i6, i6);
                        int iLastIndexOf = TextUtils.lastIndexOf("", c) + 3292;
                        int iLastIndexOf2 = TextUtils.lastIndexOf("", c) + 32;
                        byte b4 = (byte) i6;
                        byte b5 = b4;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(defaultSize, iLastIndexOf, iLastIndexOf2, 1948206109, false, $$g(b4, b5, (byte) (b5 + 1)), new Class[]{Integer.TYPE});
                    }
                    iArr6[i10] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                    i10++;
                    iArr5 = iArr5;
                    c = '0';
                    i5 = 1;
                    i6 = 0;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            i2 = i6;
            iArr5 = iArr6;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr5, i2, iArr4, i2, length2);
        int i11 = 2;
        sessionConfigValidatingBuilder.b = 2;
        while (sessionConfigValidatingBuilder.b < iArr.length) {
            int i12 = $11 + 111;
            $10 = i12 % 128;
            int i13 = i12 % i11;
            cArr[0] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
            cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
            cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
            cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
            for (int i14 = 17; i14 > 1; i14--) {
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i14];
                Object[] objArr4 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getPressedStateDuration() >> 16), (ViewConfiguration.getWindowTouchSlop() >> 8) + 2559, 28 - TextUtils.lastIndexOf("", '0', 0, 0), 683220507, false, $$g(b6, b7, b7), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
            }
            int i15 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i15;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
            int i16 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object[] objArr5 = {sessionConfigValidatingBuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TextUtils.lastIndexOf("", '0') + 28880), 348 - TextUtils.indexOf("", "", 0), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 25, -30507727, false, "G", new Class[]{Object.class});
            }
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i16 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()];
            cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
            cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
            cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
            sessionConfigValidatingBuilder.b += 2;
            i11 = 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0280  */
    /* JADX WARN: Code duplicated, block: B:40:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:44:0x0331 A[Catch: all -> 0x05f5, TryCatch #0 {all -> 0x05f5, blocks: (B:42:0x031c, B:44:0x0331, B:45:0x0376, B:57:0x03e9, B:59:0x03f6, B:60:0x0439, B:62:0x0456, B:63:0x04a8), top: B:95:0x031c }] */
    public static String N_(PackageManager packageManager, String str) throws Throwable {
        int length;
        int i;
        boolean z;
        int i2;
        Method method;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        int i3 = 2;
        int i4 = 2 % 2;
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            int i5 = TuitionPaymentFragmentbindingInflater1 + 99;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            int i6 = i5 % 2;
            length = str.length();
        } else {
            length = 0;
        }
        byte[] bArr = $$a;
        byte b2 = bArr[28];
        Object[] objArr = new Object[1];
        a(b2, b2, bArr[7], objArr);
        Class<?> cls = Class.forName((String) objArr[0]);
        byte b3 = bArr[7];
        Object[] objArr2 = new Object[1];
        a(b3, b3, bArr[28], objArr2);
        Method method2 = cls.getMethod((String) objArr2[0], String.class, Integer.TYPE);
        Class<?> cls2 = Class.forName("android.app.ApplicationPackageManager");
        byte b4 = bArr[7];
        Object[] objArr3 = new Object[1];
        a(b4, b4, bArr[28], objArr3);
        Method[] methodArr = {method2, cls2.getMethod((String) objArr3[0], String.class, Integer.TYPE)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 1);
            int iResolveSize = View.resolveSize(0, 0) + 2823;
            int i7 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 23;
            byte[] bArr2 = $$d;
            Object[] objArr4 = new Object[1];
            c(bArr2[7], (byte) (-bArr2[5]), bArr2[54], objArr4);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cLastIndexOf, iResolveSize, i7, 1814927978, false, (String) objArr4[0], null);
        }
        Class<?>[] clsArr = null;
        float f = 0.0f;
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null) == null) {
            Method[] declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0) + 2824, 22 - KeyEvent.getDeadChar(0, 0))).getDeclaredMethods();
            int length2 = declaredMethods.length;
            int i8 = 0;
            while (true) {
                if (i8 < length2) {
                    int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 77;
                    TuitionPaymentFragmentbindingInflater1 = i9 % 128;
                    int i10 = i9 % i3;
                    Method method3 = declaredMethods[i8];
                    try {
                        Object[] objArr5 = new Object[1];
                        d(new int[]{-566179512, 367561651, 1205529778, 1577177867, -1059188196, -1911838499, 472453203, 1568060698, -1204107832, 982316087, 305597912, 965378062, 1964652514, -1303704130}, 25 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr5);
                        Class<?> cls3 = Class.forName((String) objArr5[0]);
                        int i11 = 12 - (TypedValue.complexToFloat(0) > f ? 1 : (TypedValue.complexToFloat(0) == f ? 0 : -1));
                        Object[] objArr6 = new Object[1];
                        d(new int[]{959019741, 807498499, -1170782674, -961785939, 1784975974, -172141148, 27562964, -980678742}, i11, objArr6);
                        Object[] objArr7 = {Integer.valueOf(((Integer) cls3.getMethod((String) objArr6[0], clsArr).invoke(method3, clsArr)).intValue())};
                        Object[] objArr8 = new Object[1];
                        d(new int[]{-1221057984, 363704634, 220560297, -1078940246, 1098637958, 1280087675, 1073560917, 343063285, -2077247089, -1920493685, -1569701840, -17793175, 1704179942, -880461874, -627353213, 1159542300}, (ViewConfiguration.getTapTimeout() >> 16) + 26, objArr8);
                        Class<?> cls4 = Class.forName((String) objArr8[0]);
                        Object[] objArr9 = new Object[1];
                        d(new int[]{1658814918, 292952954, 1957926652, -1956195557, -1931908226, 1952854964}, View.MeasureSpec.getSize(0) + 8, objArr9);
                        if (((Boolean) cls4.getMethod((String) objArr9[0], Integer.TYPE).invoke(null, objArr7)).booleanValue()) {
                            Class cls5 = Long.TYPE;
                            Object[] objArr10 = new Object[1];
                            d(new int[]{-566179512, 367561651, 1205529778, 1577177867, -1059188196, -1911838499, 472453203, 1568060698, -1204107832, 982316087, 305597912, 965378062, 1964652514, -1303704130}, View.MeasureSpec.makeMeasureSpec(0, 0) + 24, objArr10);
                            Class<?> cls6 = Class.forName((String) objArr10[0]);
                            Object[] objArr11 = new Object[1];
                            d(new int[]{1481141185, -1632571360, 1409229415, 680720392, 1178225079, 1838623644, -542213240, -85591394, 1046043934, 373953480}, 12 - TextUtils.indexOf((CharSequence) "", '0'), objArr11);
                            if (!cls5.equals(cls6.getMethod((String) objArr11[0], null).invoke(method3, null))) {
                                continue;
                            } else {
                                Object[] objArr12 = new Object[1];
                                d(new int[]{-566179512, 367561651, 1205529778, 1577177867, -1059188196, -1911838499, 472453203, 1568060698, -1204107832, 982316087, 305597912, 965378062, 1964652514, -1303704130}, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 23, objArr12);
                                Class<?> cls7 = Class.forName((String) objArr12[0]);
                                Object[] objArr13 = new Object[1];
                                d(new int[]{-530969799, 95932549, 2131120890, -110845978, -1647264707, -1469623151, 120264817, -361597749, 717922660, -336347157, 964922643, -191912478}, 18 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr13);
                                Object[] objArr14 = (Object[]) cls7.getMethod((String) objArr13[0], null).invoke(method3, null);
                                if (objArr14.length == 2 && Long.TYPE.equals(objArr14[0])) {
                                    int i12 = TuitionPaymentFragmentbindingInflater1 + 55;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i12 % 128;
                                    if (i12 % 2 == 0) {
                                        Object[] objArr15 = new Object[1];
                                        d(new int[]{-566179512, 367561651, 1205529778, 1577177867, -1059188196, -1911838499, 472453203, 1568060698, -1204107832, 982316087, 305597912, 965378062, 1964652514, -1303704130}, 124 % TextUtils.getOffsetAfter("", 1), objArr15);
                                        if (Class.forName((String) objArr15[0]).equals(objArr14[1])) {
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                char maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
                                                int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 2823;
                                                int i13 = 21 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                                byte[] bArr3 = $$d;
                                                Object[] objArr16 = new Object[1];
                                                c(bArr3[7], (byte) (-bArr3[5]), bArr3[54], objArr16);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(maxKeyCode, touchSlop, i13, 1814927978, false, (String) objArr16[0], null);
                                            }
                                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method3);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                char size = (char) View.MeasureSpec.getSize(0);
                                                int i14 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2822;
                                                int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 23;
                                                byte[] bArr4 = $$d;
                                                Object[] objArr17 = new Object[1];
                                                c(bArr4[7], (byte) (-bArr4[5]), bArr4[54], objArr17);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(size, i14, iLastIndexOf, 1814927978, false, (String) objArr17[0], null);
                                            }
                                            try {
                                                Object[] objArr18 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                    char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
                                                    int maximumFlingVelocity = 2823 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                                    int iResolveSize2 = View.resolveSize(0, 0) + 22;
                                                    byte[] bArr5 = $$d;
                                                    byte b5 = (byte) (-bArr5[5]);
                                                    byte b6 = bArr5[7];
                                                    Object[] objArr19 = new Object[1];
                                                    c(b5, b6, b6, objArr19);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(packedPositionGroup, maximumFlingVelocity, iResolveSize2, -2137287382, false, (String) objArr19[0], new Class[]{Long.TYPE, Method.class});
                                                }
                                                ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr18)).longValue();
                                            } catch (Throwable th) {
                                                Throwable cause = th.getCause();
                                                if (cause != null) {
                                                    throw cause;
                                                }
                                                throw th;
                                            }
                                        }
                                    } else {
                                        Object[] objArr20 = new Object[1];
                                        d(new int[]{-566179512, 367561651, 1205529778, 1577177867, -1059188196, -1911838499, 472453203, 1568060698, -1204107832, 982316087, 305597912, 965378062, 1964652514, -1303704130}, 24 - TextUtils.getOffsetAfter("", 0), objArr20);
                                        if (!(!Class.forName((String) objArr20[0]).equals(objArr14[1]))) {
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                char maxKeyCode2 = (char) (KeyEvent.getMaxKeyCode() >> 16);
                                                int touchSlop2 = (ViewConfiguration.getTouchSlop() >> 8) + 2823;
                                                int i15 = 21 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                                byte[] bArr6 = $$d;
                                                Object[] objArr110 = new Object[1];
                                                c(bArr6[7], (byte) (-bArr6[5]), bArr6[54], objArr110);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(maxKeyCode2, touchSlop2, i15, 1814927978, false, (String) objArr110[0], null);
                                            }
                                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method3);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                char size2 = (char) View.MeasureSpec.getSize(0);
                                                int i16 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2822;
                                                int iLastIndexOf2 = TextUtils.lastIndexOf("", '0') + 23;
                                                byte[] bArr7 = $$d;
                                                Object[] objArr111 = new Object[1];
                                                c(bArr7[7], (byte) (-bArr7[5]), bArr7[54], objArr111);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(size2, i16, iLastIndexOf2, 1814927978, false, (String) objArr111[0], null);
                                            }
                                            Object[] objArr112 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                char packedPositionGroup2 = (char) ExpandableListView.getPackedPositionGroup(0L);
                                                int maximumFlingVelocity2 = 2823 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                                int iResolveSize3 = View.resolveSize(0, 0) + 22;
                                                byte[] bArr8 = $$d;
                                                byte b7 = (byte) (-bArr8[5]);
                                                byte b8 = bArr8[7];
                                                Object[] objArr113 = new Object[1];
                                                c(b7, b8, b8, objArr113);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(packedPositionGroup2, maximumFlingVelocity2, iResolveSize3, -2137287382, false, (String) objArr113[0], new Class[]{Long.TYPE, Method.class});
                                            }
                                            ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr112)).longValue();
                                        }
                                    }
                                }
                            }
                        }
                        i8++;
                        i3 = 2;
                        clsArr = null;
                        f = 0.0f;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th2;
                    }
                }
            }
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
            char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
            int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 2823;
            int i17 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 22;
            byte[] bArr9 = $$d;
            Object[] objArr21 = new Object[1];
            c(bArr9[7], (byte) (-bArr9[5]), bArr9[54], objArr21);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cResolveSizeAndState, keyRepeatDelay, i17, 1814927978, false, (String) objArr21[0], null);
        }
        Object[] objArr22 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
            char mode = (char) View.MeasureSpec.getMode(0);
            int offsetAfter = 2823 - TextUtils.getOffsetAfter("", 0);
            int i18 = 23 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
            byte[] bArr10 = $$d;
            byte b9 = (byte) (-bArr10[5]);
            byte b10 = bArr10[7];
            Object[] objArr23 = new Object[1];
            c(b9, b10, (byte) (b10 + 5), objArr23);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(mode, offsetAfter, i18, 1025296417, false, (String) objArr23[0], new Class[]{Object.class});
        }
        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr22);
        Object[] objArr24 = {0, methodArr, null};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char offsetBefore = (char) (TextUtils.getOffsetBefore("", 0) + 37657);
            int i19 = 2720 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            int iLastIndexOf3 = TextUtils.lastIndexOf("", '0', 0, 0) + 20;
            byte[] bArr11 = $$d;
            byte b11 = (byte) (-bArr11[5]);
            byte b12 = bArr11[7];
            Object[] objArr25 = new Object[1];
            c(b11, b12, (byte) (b12 + 5), objArr25);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(offsetBefore, i19, iLastIndexOf3, -1568796068, false, (String) objArr25[0], new Class[]{Integer.TYPE, Method[].class, List.class});
        }
        long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr24)).longValue();
        long j = -1667099125;
        long j2 = -112;
        int i20 = length;
        long j3 = -1;
        long j4 = jLongValue ^ j3;
        long j5 = (int) Runtime.getRuntime().totalMemory();
        long j6 = j4 | (j5 ^ j3);
        long j7 = j ^ j3;
        long j8 = (j2 * j) + (j2 * jLongValue) + (((long) 226) * (j | (j6 ^ j3))) + (((long) (-113)) * (((j7 | jLongValue) ^ j3) | ((j7 | j5) ^ j3) | ((j6 | j) ^ j3))) + (((long) 113) * (j3 ^ (j4 | j5))) + ((long) (-143306720));
        int i21 = ~((int) SystemClock.elapsedRealtime());
        int i22 = ((int) (j8 >> 32)) & (684667098 + (((-21102601) | i21) * 184) + (((~(i21 | 1279020945)) | (-1163020681)) * 184));
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        int i23 = ~iMaxMemory;
        int i24 = i22 | (((int) j8) & (1017052896 + (((~(i23 | 1735653809)) | 1122087076) * (-1042)) + ((1735653809 | iMaxMemory) * 521) + (((~(iMaxMemory | (-1122087077))) | 1113698464 | (~(i23 | 1744042421))) * 521)));
        int i25 = i24 >>> 24;
        int i26 = i24 & ViewCompat.MEASURED_SIZE_MASK;
        if (i25 != 0) {
            z = true;
            i = 2;
        } else {
            int i27 = TuitionPaymentFragmentbindingInflater1 + 81;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i27 % 128;
            i = 2;
            int i28 = i27 % 2;
            z = false;
        }
        if (z) {
            i2 = 1;
        } else {
            int i29 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 105;
            TuitionPaymentFragmentbindingInflater1 = i29 % 128;
            int i30 = i29 % i;
            i2 = 0;
        }
        arrayList.add((!z || i26 >= i || (method = methodArr[i26]) == null) ? null : method.toString());
        if ((i25 + 6) * i2 != 0) {
            throw new RuntimeException(String.valueOf(i20));
        }
        Signature[] signatureArr = packageManager.getPackageInfo(str, 64).signatures;
        if (signatureArr == null) {
            return null;
        }
        X509Certificate x509Certificate = (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()));
        MessageDigest messageDigest = MessageDigest.getInstance("SHA256");
        messageDigest.update(x509Certificate.getEncoded());
        String str2 = String.format("%032X", new BigInteger(1, messageDigest.digest()));
        int i31 = TuitionPaymentFragmentbindingInflater1 + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i31 % 128;
        if (i31 % 2 != 0) {
            return str2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0501  */
    /* JADX WARN: Code duplicated, block: B:67:0x0519  */
    /* JADX WARN: Code duplicated, block: B:69:0x051d  */
    public static long AFAdRevenueData(Context context, String str) throws Throwable {
        int i;
        int i2;
        String string;
        Method method;
        int i3 = 2 % 2;
        ArrayList arrayList = new ArrayList();
        byte[] bArr = $$a;
        byte b2 = bArr[28];
        Object[] objArr = new Object[1];
        a(b2, b2, bArr[7], objArr);
        Class<?> cls = Class.forName((String) objArr[0]);
        byte b3 = bArr[7];
        Object[] objArr2 = new Object[1];
        a(b3, b3, bArr[28], objArr2);
        Method method2 = cls.getMethod((String) objArr2[0], String.class, Integer.TYPE);
        Class<?> cls2 = Class.forName("android.app.ApplicationPackageManager");
        byte b4 = bArr[7];
        Object[] objArr3 = new Object[1];
        a(b4, b4, bArr[28], objArr3);
        Method[] methodArr = {method2, cls2.getMethod((String) objArr3[0], String.class, Integer.TYPE)};
        int i4 = -2001519171;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        int i5 = 16;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cMyTid = (char) (Process.myTid() >> 22);
            int mode = View.MeasureSpec.getMode(0) + 2823;
            int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 22;
            byte[] bArr2 = $$d;
            Object[] objArr4 = new Object[1];
            c(bArr2[7], (byte) (-bArr2[5]), bArr2[54], objArr4);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cMyTid, mode, jumpTapTimeout, 1814927978, false, (String) objArr4[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null) != null) {
            i = i4;
            break;
        }
        Method[] declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 2822 - TextUtils.lastIndexOf("", '0', 0), 22 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)))).getDeclaredMethods();
        int length = declaredMethods.length;
        int i6 = 0;
        while (true) {
            if (i6 >= length) {
                i = i4;
                break;
            }
            Method method3 = declaredMethods[i6];
            try {
                Object[] objArr5 = new Object[1];
                d(new int[]{-566179512, 367561651, 1205529778, 1577177867, -1059188196, -1911838499, 472453203, 1568060698, -1204107832, 982316087, 305597912, 965378062, 1964652514, -1303704130}, TextUtils.lastIndexOf("", '0', 0, 0) + 25, objArr5);
                Class<?> cls3 = Class.forName((String) objArr5[0]);
                Object[] objArr6 = new Object[1];
                d(new int[]{959019741, 807498499, -1170782674, -961785939, 1784975974, -172141148, 27562964, -980678742}, 12 - TextUtils.getOffsetBefore("", 0), objArr6);
                Object[] objArr7 = {Integer.valueOf(((Integer) cls3.getMethod((String) objArr6[0], null).invoke(method3, null)).intValue())};
                int[] iArr = new int[i5];
                // fill-array-data instruction
                iArr[0] = -1221057984;
                iArr[1] = 363704634;
                iArr[2] = 220560297;
                iArr[3] = -1078940246;
                iArr[4] = 1098637958;
                iArr[5] = 1280087675;
                iArr[6] = 1073560917;
                iArr[7] = 343063285;
                iArr[8] = -2077247089;
                iArr[9] = -1920493685;
                iArr[10] = -1569701840;
                iArr[11] = -17793175;
                iArr[12] = 1704179942;
                iArr[13] = -880461874;
                iArr[14] = -627353213;
                iArr[15] = 1159542300;
                Object[] objArr8 = new Object[1];
                d(iArr, 26 - (ViewConfiguration.getFadingEdgeLength() >> i5), objArr8);
                Class<?> cls4 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                d(new int[]{1658814918, 292952954, 1957926652, -1956195557, -1931908226, 1952854964}, 8 - View.combineMeasuredStates(0, 0), objArr9);
                if (((Boolean) cls4.getMethod((String) objArr9[0], Integer.TYPE).invoke(null, objArr7)).booleanValue()) {
                    Class cls5 = Long.TYPE;
                    Object[] objArr10 = new Object[1];
                    d(new int[]{-566179512, 367561651, 1205529778, 1577177867, -1059188196, -1911838499, 472453203, 1568060698, -1204107832, 982316087, 305597912, 965378062, 1964652514, -1303704130}, Color.alpha(0) + 24, objArr10);
                    Class<?> cls6 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    d(new int[]{1481141185, -1632571360, 1409229415, 680720392, 1178225079, 1838623644, -542213240, -85591394, 1046043934, 373953480}, Color.rgb(0, 0, 0) + 16777229, objArr11);
                    if (cls5.equals(cls6.getMethod((String) objArr11[0], null).invoke(method3, null))) {
                        Object[] objArr12 = new Object[1];
                        d(new int[]{-566179512, 367561651, 1205529778, 1577177867, -1059188196, -1911838499, 472453203, 1568060698, -1204107832, 982316087, 305597912, 965378062, 1964652514, -1303704130}, View.combineMeasuredStates(0, 0) + 24, objArr12);
                        Class<?> cls7 = Class.forName((String) objArr12[0]);
                        Object[] objArr13 = new Object[1];
                        d(new int[]{-530969799, 95932549, 2131120890, -110845978, -1647264707, -1469623151, 120264817, -361597749, 717922660, -336347157, 964922643, -191912478}, ExpandableListView.getPackedPositionChild(0L) + 18, objArr13);
                        Object[] objArr14 = (Object[]) cls7.getMethod((String) objArr13[0], null).invoke(method3, null);
                        if (objArr14.length == 2) {
                            int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 43;
                            TuitionPaymentFragmentbindingInflater1 = i7 % 128;
                            int i8 = i7 % 2;
                            if (Long.TYPE.equals(objArr14[0])) {
                                Object[] objArr15 = new Object[1];
                                d(new int[]{-566179512, 367561651, 1205529778, 1577177867, -1059188196, -1911838499, 472453203, 1568060698, -1204107832, 982316087, 305597912, 965378062, 1964652514, -1303704130}, 24 - View.combineMeasuredStates(0, 0), objArr15);
                                if (Class.forName((String) objArr15[0]).equals(objArr14[1])) {
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                        char c = (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                                        int iRed = 2823 - Color.red(0);
                                        int iAlpha = 22 - Color.alpha(0);
                                        byte[] bArr3 = $$d;
                                        Object[] objArr16 = new Object[1];
                                        c(bArr3[7], (byte) (-bArr3[5]), bArr3[54], objArr16);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, iRed, iAlpha, 1814927978, false, (String) objArr16[0], null);
                                    }
                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).set(null, method3);
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                        char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                                        int fadingEdgeLength2 = 2823 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                                        int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 23;
                                        byte[] bArr4 = $$d;
                                        Object[] objArr17 = new Object[1];
                                        c(bArr4[7], (byte) (-bArr4[5]), bArr4[54], objArr17);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(fadingEdgeLength, fadingEdgeLength2, bitsPerPixel, 1814927978, false, (String) objArr17[0], null);
                                    }
                                    try {
                                        Object[] objArr18 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null)};
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                            char gidForName = (char) ((-1) - Process.getGidForName(""));
                                            int keyRepeatTimeout = 2823 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                            int i9 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 21;
                                            byte[] bArr5 = $$d;
                                            byte b5 = (byte) (-bArr5[5]);
                                            byte b6 = bArr5[7];
                                            Object[] objArr19 = new Object[1];
                                            c(b5, b6, b6, objArr19);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(gidForName, keyRepeatTimeout, i9, -2137287382, false, (String) objArr19[0], new Class[]{Long.TYPE, Method.class});
                                        }
                                        ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr18)).longValue();
                                        i = -2001519171;
                                        break;
                                    } catch (Throwable th) {
                                        Throwable cause = th.getCause();
                                        if (cause != null) {
                                            throw cause;
                                        }
                                        throw th;
                                    }
                                }
                            } else {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
                i6++;
                int i10 = TuitionPaymentFragmentbindingInflater1 + 95;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i10 % 128;
                int i11 = i10 % 2;
                i4 = -2001519171;
                i5 = 16;
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th2;
            }
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
            char cAlpha = (char) Color.alpha(0);
            int iResolveSizeAndState = 2823 - View.resolveSizeAndState(0, 0, 0);
            int gidForName2 = Process.getGidForName("") + 23;
            byte[] bArr6 = $$d;
            Object[] objArr20 = new Object[1];
            c(bArr6[7], (byte) (-bArr6[5]), bArr6[54], objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cAlpha, iResolveSizeAndState, gidForName2, 1814927978, false, (String) objArr20[0], null);
        }
        Object[] objArr21 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
            char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 2824;
            int bitsPerPixel2 = 21 - ImageFormat.getBitsPerPixel(0);
            byte[] bArr7 = $$d;
            byte b7 = (byte) (-bArr7[5]);
            byte b8 = bArr7[7];
            Object[] objArr22 = new Object[1];
            c(b7, b8, (byte) (b8 + 5), objArr22);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(tapTimeout, iLastIndexOf, bitsPerPixel2, 1025296417, false, (String) objArr22[0], new Class[]{Object.class});
        }
        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr21);
        Object[] objArr23 = {0, methodArr, null};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char c2 = (char) (37658 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
            int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 2720;
            int iIndexOf = 19 - TextUtils.indexOf("", "");
            byte[] bArr8 = $$d;
            byte b9 = (byte) (-bArr8[5]);
            byte b10 = bArr8[7];
            Object[] objArr24 = new Object[1];
            c(b9, b10, (byte) (b10 + 5), objArr24);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c2, iKeyCodeFromString, iIndexOf, -1568796068, false, (String) objArr24[0], new Class[]{Integer.TYPE, Method[].class, List.class});
        }
        long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr23)).longValue();
        long j = -1481291393;
        long jFreeMemory = (int) Runtime.getRuntime().freeMemory();
        long j2 = -1;
        long j3 = jFreeMemory ^ j2;
        long j4 = jLongValue ^ j2;
        long j5 = (((long) 758) * j) + (((long) (-756)) * jLongValue) + (((long) (-757)) * (j | j3)) + (((long) 1514) * (((j4 | j) | jFreeMemory) ^ j2)) + (((long) 757) * ((((j ^ j2) | j4) ^ j2) | ((j4 | j3) ^ j2) | ((jFreeMemory | (jLongValue | j)) ^ j2))) + ((long) (-329114452));
        int i12 = (int) Runtime.getRuntime().totalMemory();
        int i13 = ~i12;
        int i14 = (-1432963134) + (((~((-1283576534) | i13)) | 128) * (-1188));
        int i15 = (~(i12 | 1283576533)) | 128;
        int i16 = ~((-1574164352) | i13);
        int i17 = ((int) (j5 >> 32)) & (i14 + ((i15 | i16) * 594) + (((~(1283576533 | i13)) | 290587946 | i16) * 594));
        int i18 = (int) Runtime.getRuntime().totalMemory();
        int i19 = i17 | (((int) j5) & ((-1794177691) + (((~((-1409401435) | (~i18))) | (~(1448339451 | i18))) * (-272)) + (((~((-1444004604) | i18)) | 34603169) * (-272)) + (((~(i18 | 1444004603)) | 1413736282) * 272)));
        int i20 = i19 >>> 24;
        int i21 = i19 & ViewCompat.MEASURED_SIZE_MASK;
        if (i20 != 0) {
            int i22 = TuitionPaymentFragmentbindingInflater1 + 103;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i22 % 128;
            if (i22 % 2 == 0) {
                i2 = 0;
            } else {
                i2 = 1;
            }
        } else {
            i2 = 0;
        }
        if (i2 != 0) {
            int i23 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i24 = i23 + 59;
            TuitionPaymentFragmentbindingInflater1 = i24 % 128;
            if (i24 % 2 != 0) {
                int i25 = 14 / 0;
                if (i21 < 2) {
                    method = methodArr[i21];
                    if (method != null) {
                        int i26 = i23 + 57;
                        TuitionPaymentFragmentbindingInflater1 = i26 % 128;
                        int i27 = i26 % 2;
                        string = method.toString();
                    }
                }
            } else if (i21 < 2) {
                method = methodArr[i21];
                if (method != null) {
                    int i28 = i23 + 57;
                    TuitionPaymentFragmentbindingInflater1 = i28 % 128;
                    int i29 = i28 % 2;
                    string = method.toString();
                }
            }
            string = null;
        } else {
            string = null;
        }
        arrayList.add(string);
        if ((i20 + 6) * i2 != 0) {
            throw null;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            if (Build.VERSION.SDK_INT < 28) {
                return packageInfo.versionCode;
            }
            int i30 = TuitionPaymentFragmentbindingInflater1 + 65;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i30 % 128;
            if (i30 % 2 != 0) {
                return packageInfo.getLongVersionCode();
            }
            int i31 = 90 / 0;
            return packageInfo.getLongVersionCode();
        } catch (PackageManager.NameNotFoundException e2) {
            AFLogger.afErrorLog(e2.getMessage(), e2);
            return 0L;
        }
    }

    public static String getMediationNetwork(Context context, String str) {
        int i = 2 % 2;
        if (updateSelectorStateCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new ArrayList()) != 0) {
            throw null;
        }
        try {
            String str2 = context.getPackageManager().getPackageInfo(str, 0).versionName;
            int i2 = TuitionPaymentFragmentbindingInflater1 + 47;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            return str2;
        } catch (PackageManager.NameNotFoundException e2) {
            AFLogger.afErrorLog(e2.getMessage(), e2);
            return "";
        }
    }

    public static Application O_(Context context) {
        int i = 2 % 2;
        if (!(!(context instanceof Application))) {
            return (Application) context;
        }
        if (!(context instanceof Activity)) {
            try {
                return (Application) context.getApplicationContext();
            } catch (ClassCastException unused) {
                AFLogger.afErrorLog("Application or Activity Context should be used", new IllegalStateException(), true, true);
                return null;
            }
        }
        int i2 = TuitionPaymentFragmentbindingInflater1 + 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        Application application = ((Activity) context).getApplication();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 111;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
        return application;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006e  */
    /* JADX WARN: Code duplicated, block: B:31:0x007b  */
    public static Map<String, String> M_(Context context, Map<String, String> map, Uri uri) {
        int i = 2 % 2;
        if (getCompleter.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new ArrayList()) != 0) {
            throw null;
        }
        Iterator<String> it = uri.getQueryParameterNames().iterator();
        while (true) {
            String str = "agency";
            byte b2 = 0;
            if (it.hasNext()) {
                String next = it.next();
                String queryParameter = uri.getQueryParameter(next);
                if (map.containsKey(next)) {
                    int i2 = TuitionPaymentFragmentbindingInflater1 + 57;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
                    int i3 = i2 % 2;
                    str = next;
                } else {
                    int iHashCode = next.hashCode();
                    if (iHashCode != -1420799080) {
                        int i4 = TuitionPaymentFragmentbindingInflater1 + 5;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
                        int i5 = i4 % 2;
                        if (iHashCode != 99) {
                            if (iHashCode == 110987 && next.equals("pid")) {
                                b2 = 1;
                            } else {
                                b2 = -1;
                            }
                        } else if (!next.equals("c")) {
                            b2 = -1;
                        }
                    } else if (!(!next.equals("af_prt"))) {
                        b2 = 2;
                    } else {
                        b2 = -1;
                    }
                    if (b2 == 0) {
                        str = "campaign";
                    } else if (b2 == 1) {
                        str = "media_source";
                    } else if (b2 != 2) {
                        int i6 = TuitionPaymentFragmentbindingInflater1 + 57;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
                        int i7 = i6 % 2;
                        str = next;
                    }
                }
                map.put(str, queryParameter);
            } else {
                try {
                    break;
                } catch (Exception e2) {
                    AFLogger.afErrorLog("Could not fetch install time. ", e2);
                }
            }
        }
        if (!map.containsKey("install_time")) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
            long j = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            map.put("install_time", simpleDateFormat.format(new Date(j)));
        }
        if (map.containsKey("af_deeplink")) {
            int i8 = TuitionPaymentFragmentbindingInflater1 + 39;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i8 % 128;
            int i9 = i8 % 2;
            if (!map.containsKey("af_status")) {
                map.put("af_status", "Non-organic");
            }
        }
        if (map.containsKey("agency")) {
            map.remove("media_source");
        }
        String path = uri.getPath();
        if (path != null) {
            int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 19;
            TuitionPaymentFragmentbindingInflater1 = i10 % 128;
            int i11 = i10 % 2;
            map.put("path", path);
        }
        String scheme = uri.getScheme();
        if (scheme != null) {
            int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 3;
            TuitionPaymentFragmentbindingInflater1 = i12 % 128;
            if (i12 % 2 != 0) {
                map.put("scheme", scheme);
                throw null;
            }
            map.put("scheme", scheme);
        }
        String host = uri.getHost();
        if (host != null) {
            map.put("host", host);
        }
        return map;
    }

    private static String $$g(int i, int i2, int i3) {
        int i4 = 122 - (i3 * 56);
        int i5 = 3 - (i2 * 4);
        byte[] bArr = $$c;
        int i6 = i * 2;
        byte[] bArr2 = new byte[i6 + 1];
        int i7 = -1;
        if (bArr == null) {
            i7 = -1;
            i4 = (-i5) + i6;
            i5 = i5;
        }
        while (true) {
            int i8 = i7 + 1;
            bArr2[i8] = (byte) i4;
            if (i8 == i6) {
                return new String(bArr2, 0);
            }
            int i9 = i5 + 1;
            i7 = i8;
            i4 = (-bArr[i9]) + i4;
            i5 = i9;
        }
    }
}
