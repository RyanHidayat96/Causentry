package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.firebase.FirebaseApp;
import defpackage.initSession;
import defpackage.setVideoStabilizationMode;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
class Metadata {
    private static final String ACTION_C2DM_REGISTER = "com.google.android.c2dm.intent.REGISTER";
    private static final String ACTION_IID_TOKEN_REQUEST = "com.google.iid.TOKEN_REQUEST";
    static final int GMSCORE_NOT_FOUND = 0;
    private static final String GMSCORE_SEND_PERMISSION = "com.google.android.c2dm.permission.SEND";
    static final String GMS_PACKAGE = "com.google.android.gms";
    static final int IID_VIA_RECEIVER = 2;
    static final int IID_VIA_SERVICE = 1;
    private String appVersionCode;
    private String appVersionName;
    private final Context context;
    private int gmsVersionCode;
    private int iidImplementation = 0;
    private static final byte[] $$c = {8, -36, 87, -65};
    private static final int $$f = 26;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {32, 1, 70, -122, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$e = 159;
    private static final byte[] $$a = {114, -115, 48, 84, 2, -15, 36, -17, -2, -8, 10, -6, 2, 28, -37, 8, -9};
    private static final int $$b = 190;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = {59757, 59870, 59824, 59820, 59848, 59869, 59859, 59870, 59864, 59866, 59844, 59870, 59870, 59834, 59836, 59867, 59866, 59871, 59839, 59825, 59870, 59844, 59864, 59865, 59807, 59427, 59429, 59433, 59435, 59424, 59427, 59426, 59426, 59426, 59430, 59455, 59807, 59433, 59413, 59413, 59413, 59414, 59435, 59422, 59903, 59395, 59433, 59408, 59412, 59435, 59415, 59433, 59404, 59402, 59434, 59413, 59414, 59407, 59893, 59433, 59433, 59415, 59711, 59749, 59755, 59740, 59745, 59749, 59748, 59750, 59704, 59757, 59751, 59752, 59728, 59751, 59775, 59768, 59771, 59754, 59757, 59775, 59745, 59698, 59751, 59745, 59775, 59757, 59752, 59744, 59751, 59751, 59746, 59756, 59746, 59746, 59731, 59753, 59751, 59757};

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r5, byte r6, short r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 * 4
            int r0 = 14 - r7
            byte[] r1 = com.google.firebase.messaging.Metadata.$$a
            int r5 = r5 * 4
            int r5 = 103 - r5
            int r6 = r6 * 4
            int r6 = 3 - r6
            byte[] r0 = new byte[r0]
            int r7 = 13 - r7
            r2 = 0
            if (r1 != 0) goto L18
            r3 = r7
            r4 = r2
            goto L2c
        L18:
            r3 = r2
        L19:
            int r6 = r6 + 1
            byte r4 = (byte) r5
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L2a
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L2a:
            r3 = r1[r6]
        L2c:
            int r3 = -r3
            int r5 = r5 + r3
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.Metadata.a(int, byte, short, java.lang.Object[]):void");
    }

    private static void b(int i, int i2, int i3, Object[] objArr) {
        int i4 = i + 4;
        int i5 = i3 * 52;
        int i6 = i2 + 84;
        byte[] bArr = $$d;
        byte[] bArr2 = new byte[53 - i5];
        int i7 = 52 - i5;
        int i8 = -1;
        if (bArr == null) {
            i6 = (i6 + i7) - 11;
        }
        while (true) {
            i8++;
            bArr2[i8] = (byte) i6;
            i4++;
            if (i8 == i7) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i6 = (i6 + bArr[i4]) - 11;
        }
    }

    Metadata(Context context) {
        this.context = context;
    }

    boolean isGmscorePresent() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            getIidImplementation();
            throw null;
        }
        if (getIidImplementation() != 0) {
            return true;
        }
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 == 0) {
            return false;
        }
        obj.hashCode();
        throw null;
    }

    int getIidImplementation() {
        synchronized (this) {
            int i = this.iidImplementation;
            if (i != 0) {
                return i;
            }
            PackageManager packageManager = this.context.getPackageManager();
            if (packageManager.checkPermission(GMSCORE_SEND_PERMISSION, "com.google.android.gms") == -1) {
                return 0;
            }
            if (!PlatformVersion.isAtLeastO()) {
                Intent intent = new Intent(ACTION_C2DM_REGISTER);
                intent.setPackage("com.google.android.gms");
                List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
                if (listQueryIntentServices != null && listQueryIntentServices.size() > 0) {
                    this.iidImplementation = 1;
                    return 1;
                }
            }
            Intent intent2 = new Intent(ACTION_IID_TOKEN_REQUEST);
            intent2.setPackage("com.google.android.gms");
            List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
            if (listQueryBroadcastReceivers != null && listQueryBroadcastReceivers.size() > 0) {
                this.iidImplementation = 2;
                return 2;
            }
            if (PlatformVersion.isAtLeastO()) {
                this.iidImplementation = 2;
            } else {
                this.iidImplementation = 1;
            }
            return this.iidImplementation;
        }
    }

    static String getDefaultSenderId(FirebaseApp firebaseApp) {
        int i = 2 % 2;
        String gcmSenderId = firebaseApp.getOptions().getGcmSenderId();
        Object obj = null;
        if (gcmSenderId != null) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 73;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            if (i2 % 2 != 0) {
                return gcmSenderId;
            }
            obj.hashCode();
            throw null;
        }
        String applicationId = firebaseApp.getOptions().getApplicationId();
        if (!applicationId.startsWith("1:")) {
            return applicationId;
        }
        String[] strArrSplit = applicationId.split(":");
        if (strArrSplit.length < 2) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 21;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
            if (i3 % 2 == 0) {
                return null;
            }
            throw null;
        }
        String str = strArrSplit[1];
        if (!str.isEmpty()) {
            return str;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    String getAppVersionCode() {
        String str;
        synchronized (this) {
            if (this.appVersionCode == null) {
                populateAppVersionInfo();
            }
            str = this.appVersionCode;
        }
        return str;
    }

    String getAppVersionName() {
        String str;
        synchronized (this) {
            if (this.appVersionName == null) {
                populateAppVersionInfo();
            }
            str = this.appVersionName;
        }
        return str;
    }

    int getGmsVersionCode() {
        int i;
        PackageInfo packageInfo;
        synchronized (this) {
            if (this.gmsVersionCode == 0 && (packageInfo = getPackageInfo("com.google.android.gms")) != null) {
                this.gmsVersionCode = packageInfo.versionCode;
            }
            i = this.gmsVersionCode;
        }
        return i;
    }

    private void populateAppVersionInfo() {
        synchronized (this) {
            PackageInfo packageInfo = getPackageInfo(this.context.getPackageName());
            if (packageInfo != null) {
                this.appVersionCode = Integer.toString(packageInfo.versionCode);
                this.appVersionName = packageInfo.versionName;
            }
        }
    }

    private static void c(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        int i2 = 2 % 2;
        setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
        int i3 = 0;
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i3] = Integer.valueOf(cArr[i8]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b = (byte) i3;
                        byte b2 = (byte) (b + 5);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getPressedStateDuration() >> 16), 1270 - (KeyEvent.getMaxKeyCode() >> 16), Color.rgb(i3, i3, i3) + 16777234, 407021364, false, $$g(b, b2, (byte) (b2 - 5)), new Class[]{Integer.TYPE});
                    }
                    cArr2[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i8++;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i9 = $11 + 47;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            cArr = cArr2;
        }
        char[] cArr3 = new char[i5];
        System.arraycopy(cArr, i4, cArr3, 0, i5);
        if (bArr != null) {
            char[] cArr4 = new char[i5];
            setvideostabilizationmode.b = 0;
            int i11 = $11 + 53;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            char c = 0;
            while (setvideostabilizationmode.b < i5) {
                int i13 = $10 + 17;
                $11 = i13 % 128;
                if (i13 % 2 != 0 ? bArr[setvideostabilizationmode.b] != 1 : bArr[setvideostabilizationmode.b] != 0) {
                    int i14 = setvideostabilizationmode.b;
                    Object[] objArr3 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        char scrollDefaultDelay = (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 29944);
                        int i15 = 1755 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                        int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 23;
                        byte length2 = (byte) $$c.length;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(scrollDefaultDelay, i15, maximumDrawingCacheSize, 387247676, false, $$g((byte) 0, length2, (byte) (length2 - 4)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i14] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                } else {
                    int i16 = setvideostabilizationmode.b;
                    Object[] objArr4 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b3 = (byte) 0;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) TextUtils.getTrimmedLength(""), (ViewConfiguration.getWindowTouchSlop() >> 8) + 3225, KeyEvent.getDeadChar(0, 0) + 13, 2133916302, false, $$g(b3, (byte) (b3 | 6), b3), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i16] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                }
                c = cArr4[setvideostabilizationmode.b];
                Object[] objArr5 = {setvideostabilizationmode, setvideostabilizationmode};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (41241 - Drawable.resolveOpacity(0, 0)), 1705 - View.combineMeasuredStates(0, 0), 21 - TextUtils.getTrimmedLength(""), -1434471773, false, $$g(b4, b5, b5), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i7 > 0) {
            char[] cArr5 = new char[i5];
            i = 0;
            System.arraycopy(cArr3, 0, cArr5, 0, i5);
            int i17 = i5 - i7;
            System.arraycopy(cArr5, 0, cArr3, i17, i7);
            System.arraycopy(cArr5, i7, cArr3, 0, i17);
        } else {
            i = 0;
        }
        if (!(!z)) {
            char[] cArr6 = new char[i5];
            while (true) {
                setvideostabilizationmode.b = i;
                if (setvideostabilizationmode.b >= i5) {
                    break;
                }
                cArr6[setvideostabilizationmode.b] = cArr3[(i5 - setvideostabilizationmode.b) - 1];
                i = setvideostabilizationmode.b + 1;
            }
            cArr3 = cArr6;
        }
        if (i6 > 0) {
            int i18 = 0;
            while (true) {
                setvideostabilizationmode.b = i18;
                if (setvideostabilizationmode.b >= i5) {
                    break;
                }
                int i19 = $11 + 1;
                $10 = i19 % 128;
                int i20 = i19 % 2;
                cArr3[setvideostabilizationmode.b] = (char) (cArr3[setvideostabilizationmode.b] - iArr[2]);
                i18 = setvideostabilizationmode.b + 1;
            }
        }
        objArr[0] = new String(cArr3);
        int i21 = $10 + 117;
        $11 = i21 % 128;
        int i22 = i21 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0254 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:0x035a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:0x035a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x021e A[PHI: r0
  0x021e: PHI (r0v70 java.lang.Object[]) = (r0v69 java.lang.Object[]), (r0v99 java.lang.Object[]) binds: [B:28:0x021c, B:23:0x01df] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x0228  */
    /* JADX WARN: Code duplicated, block: B:35:0x025d  */
    /* JADX WARN: Code duplicated, block: B:38:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:42:0x0304 A[Catch: all -> 0x0566, TryCatch #0 {all -> 0x0566, blocks: (B:40:0x02ef, B:42:0x0304, B:43:0x034e, B:57:0x03bb, B:59:0x03c8, B:60:0x0402, B:62:0x041e, B:63:0x0466), top: B:93:0x02ef }] */
    private PackageInfo getPackageInfo(String str) throws Throwable {
        boolean z;
        int i;
        Method method;
        Object[] objArr;
        Object[] objArr2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        int i2 = 2;
        int i3 = 2 % 2;
        ArrayList arrayList = new ArrayList();
        Class<?> cls = Class.forName("android.content.pm.PackageManager");
        byte b = (byte) 0;
        byte b2 = b;
        byte b3 = b2;
        int i4 = 1;
        Object[] objArr3 = new Object[1];
        a(b, b2, b3, objArr3);
        Method method2 = cls.getMethod((String) objArr3[0], String.class, Integer.TYPE);
        Class<?> cls2 = Class.forName("android.app.ApplicationPackageManager");
        Object[] objArr4 = new Object[1];
        a(b, b2, b3, objArr4);
        Method[] methodArr = {method2, cls2.getMethod((String) objArr4[0], String.class, Integer.TYPE)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
            char cIndexOf = (char) TextUtils.indexOf("", "", 0, 0);
            int iGreen = 2823 - Color.green(0);
            int deadChar = KeyEvent.getDeadChar(0, 0) + 22;
            byte[] bArr = $$d;
            byte b4 = bArr[5];
            byte b5 = bArr[7];
            Object[] objArr5 = new Object[1];
            b(b4, b5, b5, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf, iGreen, deadChar, 1814927978, false, (String) objArr5[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null) == null) {
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 63;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
            int i6 = i5 % 2;
            Method[] declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) Color.red(0), 2822 - MotionEvent.axisFromString(""), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 21)).getDeclaredMethods();
            int length = declaredMethods.length;
            int i7 = 0;
            while (i7 < length) {
                int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 59;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i8 % 128;
                if (i8 % i2 != 0) {
                    Method method3 = declaredMethods[i7];
                    throw null;
                }
                Method method4 = declaredMethods[i7];
                try {
                    Object[] objArr6 = new Object[1];
                    c(new int[]{0, 24, 106, 9}, false, new byte[]{1, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 0, 1}, objArr6);
                    Class<?> cls3 = Class.forName((String) objArr6[0]);
                    Object[] objArr7 = new Object[1];
                    c(new int[]{24, 12, 194, 0}, false, new byte[]{1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1}, objArr7);
                    Object[] objArr8 = {Integer.valueOf(((Integer) cls3.getMethod((String) objArr7[0], null).invoke(method4, null)).intValue())};
                    Object[] objArr9 = new Object[1];
                    c(new int[]{36, 26, 183, 0}, true, new byte[]{1, 1, 0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1}, objArr9);
                    Class<?> cls4 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    c(new int[]{62, 8, 0, 0}, false, new byte[]{1, 0, 1, 1, 1, 1, 1, 1}, objArr10);
                    if (((Boolean) cls4.getMethod((String) objArr10[0], Integer.TYPE).invoke(null, objArr8)).booleanValue()) {
                        Class cls5 = Long.TYPE;
                        Object[] objArr11 = new Object[1];
                        c(new int[]{0, 24, 106, 9}, false, new byte[]{1, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 0, 1}, objArr11);
                        Class<?> cls6 = Class.forName((String) objArr11[0]);
                        Object[] objArr12 = new Object[1];
                        c(new int[]{70, 13, 0, 13}, false, new byte[]{1, 0, 1, 0, 1, 1, 1, 1, 0, 0, 1, 1, 1}, objArr12);
                        if (cls5.equals(cls6.getMethod((String) objArr12[0], null).invoke(method4, null))) {
                            int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 25;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i9 % 128;
                            if (i9 % 2 == 0) {
                                Object[] objArr13 = new Object[1];
                                c(new int[]{0, 24, 106, 9}, false, new byte[]{1, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 0, 1}, objArr13);
                                Class<?> cls7 = Class.forName((String) objArr13[0]);
                                Object[] objArr14 = new Object[1];
                                c(new int[]{83, 17, 0, 0}, false, new byte[]{1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 1, 0}, objArr14);
                                objArr = (Object[]) cls7.getMethod((String) objArr14[0], null).invoke(method4, null);
                                if (objArr.length != 5) {
                                    continue;
                                } else if (Long.TYPE.equals(objArr[0])) {
                                    int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 93;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i10 % 128;
                                    int i11 = i10 % 2;
                                    objArr2 = new Object[1];
                                    c(new int[]{0, 24, 106, 9}, false, new byte[]{1, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 0, 1}, objArr2);
                                    if (Class.forName((String) objArr2[0]).equals(objArr[1])) {
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                            char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
                                            int i12 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2822;
                                            int scrollDefaultDelay = 22 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                                            byte[] bArr2 = $$d;
                                            byte b6 = bArr2[5];
                                            byte b7 = bArr2[7];
                                            Object[] objArr15 = new Object[1];
                                            b(b6, b7, b7, objArr15);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(touchSlop, i12, scrollDefaultDelay, 1814927978, false, (String) objArr15[0], null);
                                        }
                                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method4);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                            char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                                            int i13 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2822;
                                            int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 22;
                                            byte[] bArr3 = $$d;
                                            byte b8 = bArr3[5];
                                            byte b9 = bArr3[7];
                                            Object[] objArr16 = new Object[1];
                                            b(b8, b9, b9, objArr16);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cNormalizeMetaState, i13, threadPriority, 1814927978, false, (String) objArr16[0], null);
                                        }
                                        try {
                                            Object[] objArr17 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                                                int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 2823;
                                                int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 23;
                                                byte[] bArr4 = $$d;
                                                Object[] objArr18 = new Object[1];
                                                b((byte) 51, bArr4[54], bArr4[1], objArr18);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(windowTouchSlop, fadingEdgeLength, iLastIndexOf, -2137287382, false, (String) objArr18[0], new Class[]{Long.TYPE, Method.class});
                                            }
                                            ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr17)).longValue();
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
                                Object[] objArr19 = new Object[1];
                                c(new int[]{0, 24, 106, 9}, false, new byte[]{1, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 0, 1}, objArr19);
                                Class<?> cls8 = Class.forName((String) objArr19[0]);
                                Object[] objArr20 = new Object[1];
                                c(new int[]{83, 17, 0, 0}, true, new byte[]{1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 1, 0}, objArr20);
                                objArr = (Object[]) cls8.getMethod((String) objArr20[0], null).invoke(method4, null);
                                if (objArr.length != 2) {
                                    continue;
                                } else if (Long.TYPE.equals(objArr[0])) {
                                    int i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 93;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i14 % 128;
                                    int i15 = i14 % 2;
                                    objArr2 = new Object[1];
                                    c(new int[]{0, 24, 106, 9}, false, new byte[]{1, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 0, 1}, objArr2);
                                    if (Class.forName((String) objArr2[0]).equals(objArr[1])) {
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                            char touchSlop2 = (char) (ViewConfiguration.getTouchSlop() >> 8);
                                            int i16 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2822;
                                            int scrollDefaultDelay2 = 22 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                                            byte[] bArr5 = $$d;
                                            byte b10 = bArr5[5];
                                            byte b11 = bArr5[7];
                                            Object[] objArr110 = new Object[1];
                                            b(b10, b11, b11, objArr110);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(touchSlop2, i16, scrollDefaultDelay2, 1814927978, false, (String) objArr110[0], null);
                                        }
                                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method4);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                            char cNormalizeMetaState2 = (char) KeyEvent.normalizeMetaState(0);
                                            int i17 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2822;
                                            int threadPriority2 = ((Process.getThreadPriority(0) + 20) >> 6) + 22;
                                            byte[] bArr6 = $$d;
                                            byte b12 = bArr6[5];
                                            byte b13 = bArr6[7];
                                            Object[] objArr111 = new Object[1];
                                            b(b12, b13, b13, objArr111);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cNormalizeMetaState2, i17, threadPriority2, 1814927978, false, (String) objArr111[0], null);
                                        }
                                        Object[] objArr112 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                            char windowTouchSlop2 = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                                            int fadingEdgeLength2 = (ViewConfiguration.getFadingEdgeLength() >> 16) + 2823;
                                            int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0) + 23;
                                            byte[] bArr7 = $$d;
                                            Object[] objArr113 = new Object[1];
                                            b((byte) 51, bArr7[54], bArr7[1], objArr113);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(windowTouchSlop2, fadingEdgeLength2, iLastIndexOf2, -2137287382, false, (String) objArr113[0], new Class[]{Long.TYPE, Method.class});
                                        }
                                        ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr112)).longValue();
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                    i7++;
                    int i18 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 33;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i18 % 128;
                    int i19 = i18 % 2;
                    i2 = 2;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th2;
                }
            }
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
            char cIndexOf2 = (char) TextUtils.indexOf("", "", 0);
            int offsetBefore = TextUtils.getOffsetBefore("", 0) + 2823;
            int bitsPerPixel = 21 - ImageFormat.getBitsPerPixel(0);
            byte[] bArr8 = $$d;
            byte b14 = bArr8[5];
            byte b15 = bArr8[7];
            Object[] objArr21 = new Object[1];
            b(b14, b15, b15, objArr21);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf2, offsetBefore, bitsPerPixel, 1814927978, false, (String) objArr21[0], null);
        }
        Object[] objArr22 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
            char cArgb = (char) Color.argb(0, 0, 0, 0);
            int i20 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 2824;
            int mode = 22 - View.MeasureSpec.getMode(0);
            Object[] objArr23 = new Object[1];
            b((byte) 51, (byte) ($$e & 46), $$d[1], objArr23);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cArgb, i20, mode, 1025296417, false, (String) objArr23[0], new Class[]{Object.class});
        }
        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr22);
        Object[] objArr24 = {0, methodArr, null};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char maximumFlingVelocity = (char) (37657 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
            int deadChar2 = KeyEvent.getDeadChar(0, 0) + 2720;
            int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 19;
            Object[] objArr25 = new Object[1];
            b((byte) 51, (byte) ($$e & 46), $$d[1], objArr25);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(maximumFlingVelocity, deadChar2, tapTimeout, -1568796068, false, (String) objArr25[0], new Class[]{Integer.TYPE, Method[].class, List.class});
        }
        long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr24)).longValue();
        long j = -493017964;
        long j2 = -406;
        long j3 = -1;
        long j4 = jLongValue ^ j3;
        long jIdentityHashCode = System.identityHashCode(this);
        long j5 = jIdentityHashCode ^ j3;
        long j6 = (((long) (-405)) * j) + (((long) 407) * jLongValue) + ((((j4 | jIdentityHashCode) ^ j3) | (((j5 | j) | jLongValue) ^ j3)) * j2) + (j2 * (((j4 | j5) | j) ^ j3)) + (((long) 406) * (((jIdentityHashCode | (j ^ j3)) ^ j3) | ((j5 | jLongValue) ^ j3))) + ((long) (-1317387881));
        int iMyPid = Process.myPid();
        int i21 = ((int) (j6 >> 32)) & ((((~((-4753921) | iMyPid)) * 521) - 419415414) + (((~((~iMyPid) | (-4753921))) | 1359020064) * 521));
        int iIdentityHashCode = System.identityHashCode(this);
        int i22 = 86181109 + (((~((-904134279) | iIdentityHashCode)) | (-533092132)) * 672);
        int i23 = ~iIdentityHashCode;
        int i24 = i21 | (((int) j6) & (i22 + (((~(iIdentityHashCode | (-533092132))) | (~(904134278 | i23))) * (-672)) + (((~(533092131 | i23)) | 539076740) * 672)));
        int i25 = i24 >>> 24;
        int i26 = i24 & ViewCompat.MEASURED_SIZE_MASK;
        if (i25 != 0) {
            int i27 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 51;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i27 % 128;
            int i28 = i27 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!(!z)) {
            int i29 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i29 % 128;
            i = 2;
            int i30 = i29 % 2;
        } else {
            i = 2;
            int i31 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 77;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i31 % 128;
            int i32 = i31 % 2;
            i4 = 0;
        }
        arrayList.add((!z || i26 >= i || (method = methodArr[i26]) == null) ? null : method.toString());
        if ((i25 + 6) * i4 != 0) {
            throw null;
        }
        try {
            return this.context.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e2) {
            e2.toString();
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r5, byte r6, int r7) {
        /*
            int r7 = r7 * 3
            int r0 = 1 - r7
            byte[] r1 = com.google.firebase.messaging.Metadata.$$c
            int r5 = r5 * 2
            int r5 = r5 + 4
            int r6 = 105 - r6
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L26
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L24:
            r3 = r1[r5]
        L26:
            int r5 = r5 + 1
            int r6 = r6 + r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.Metadata.$$g(short, byte, int):java.lang.String");
    }
}
