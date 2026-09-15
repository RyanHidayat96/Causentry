package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.api.Status;
import defpackage.getRealtimeCaptureLatency;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes6.dex */
final class zbf extends zba {
    private static int $10 = 0;
    private static int $11 = 1;
    final /* synthetic */ Context zba;
    final /* synthetic */ GoogleSignInOptions zbb;
    final /* synthetic */ zbg zbc;
    private static final byte[] $$d = {21, ByteCompanionObject.MAX_VALUE, 49, -115, 9, -5, -66, 54, 5, -3, -11, 2, -10, -58, 48, 10, -13, 11, -6, -9, -8, -57, 54, 3, 3, -72, 56, 2, 3, -18, 10, -7, -16, 8, -65, 60, -11, -7, 15, -1, -6, -16, 5, -11, 6, 3, -73, 73, -3, -16, 1, 30, -15, 8, -14, 3, -4, -33, 14, 21, -15, -11, 6, 3, -49, 41, -20, 3, 3, -11, 6, 3, -4, -6, -14, -5, 3, -11, 8, -6, 2, -5, -6, 2, -12, -4, 15, -16, -7, 15, -45, 31, -14, -2, 4, -11, -2, -2, -8, 17, -12, 5, -69};
    private static final int $$e = 50;
    private static final byte[] $$a = {0, -94, -62, -97, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
    private static final int $$b = 132;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private static int TuitionPaymentFragmentbindingInflater1 = 1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -1287735554354109088L;

    zbf(zbg zbgVar, Context context, GoogleSignInOptions googleSignInOptions) {
        this.zba = context;
        this.zbb = googleSignInOptions;
        Objects.requireNonNull(zbgVar);
        this.zbc = zbgVar;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.google.android.gms.auth.api.signin.internal.zbf.$$a
            int r8 = r8 + 4
            int r1 = 53 - r7
            int r6 = r6 * 14
            int r6 = r6 + 84
            byte[] r1 = new byte[r1]
            int r7 = 52 - r7
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L2c
        L14:
            r3 = r2
        L15:
            int r8 = r8 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2c:
            int r6 = r6 + r8
            int r6 = r6 + (-10)
            r8 = r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.internal.zbf.a(short, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    /* JADX WARN: Code duplicated, block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002b
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(short r5, short r6, int r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = com.google.android.gms.auth.api.signin.internal.zbf.$$d
            int r7 = r7 * 5
            int r1 = r7 + 48
            int r5 = r5 * 47
            int r5 = 50 - r5
            int r6 = r6 * 15
            int r6 = 99 - r6
            byte[] r1 = new byte[r1]
            int r7 = r7 + 47
            r2 = 0
            if (r0 != 0) goto L19
            r3 = r6
            r6 = r7
            r4 = r2
            goto L2d
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r5 = r5 + 1
            int r4 = r3 + 1
            if (r3 != r7) goto L2b
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L2b:
            r3 = r0[r5]
        L2d:
            int r6 = r6 + r3
            int r6 = r6 + 3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.internal.zbf.d(short, short, int, java.lang.Object[]):void");
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i3 = getrealtimecapturelatency.b;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (19471 - ((byte) KeyEvent.getModifierMetaStateMask())), 2624 - View.MeasureSpec.getMode(0), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 12, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i3] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault2 ^ 9053247990562531611L);
                Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (39421 - TextUtils.lastIndexOf("", '0')), 482 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 37 - KeyEvent.keyCodeFromString(""), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr2 = new char[length];
        getrealtimecapturelatency.b = 0;
        int i4 = $11 + 9;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i6 = $10 + 97;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            try {
                Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 39421), 481 - View.getDefaultSize(0, 0), 37 - (ViewConfiguration.getJumpTapTimeout() >> 16), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0252  */
    /* JADX WARN: Code duplicated, block: B:36:0x025e  */
    @Override // com.google.android.gms.auth.api.signin.internal.zba, com.google.android.gms.auth.api.signin.internal.zbr
    public final void zbb(GoogleSignInAccount googleSignInAccount, Status status) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object obj = null;
        if (googleSignInAccount != null) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 113;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            if (i2 % 2 == 0) {
                zbn.zba(this.zba).zbc(this.zbb, googleSignInAccount);
                obj.hashCode();
                throw null;
            }
            zbn.zba(this.zba).zbc(this.zbb, googleSignInAccount);
        }
        zbg zbgVar = this.zbc;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char keyRepeatDelay = (char) (31533 - (ViewConfiguration.getKeyRepeatDelay() >> 16));
            int keyRepeatTimeout = 921 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
            int deadChar = KeyEvent.getDeadChar(0, 0) + 28;
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            a(bArr[37], (byte) 52, bArr[7], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(keyRepeatDelay, keyRepeatTimeout, deadChar, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{35866, 40344, 44805, 47278, 51744, 56275, 58705, 63118, '|', 4605, 9175, 19751, 24222, 26657, 31161, 35677, 38086, 42597, 47101, 49507, 54044, 64641}, View.MeasureSpec.makeMeasureSpec(0, 0) + 4493, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{35870, 720, 37268, 8286, 46868, 17917, 54453, 27480, 64038, 35045, 8145, 44674, 15686, 52237, 17148}, 36551 - TextUtils.indexOf("", "", 0, 0), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char tapTimeout = (char) ((ViewConfiguration.getTapTimeout() >> 16) + 31533);
            int i3 = 922 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
            int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 28;
            byte[] bArr2 = $$a;
            byte b = bArr2[0];
            Object[] objArr5 = new Object[1];
            a(b, b, bArr2[7], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(tapTimeout, i3, packedPositionType, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c = (char) (31533 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                int gidForName = Process.getGidForName("") + 922;
                int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 28;
                byte[] bArr3 = $$a;
                Object[] objArr6 = new Object[1];
                a(bArr3[0], bArr3[33], (byte) 51, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, gidForName, windowTouchSlop, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i4 = ((int[]) objArr7[3])[0];
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{i4}, (String[]) objArr7[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i5 = (((133950613 + (((~(1052146718 | iIdentityHashCode)) | 16876129) * (-140))) + ((~(1069022847 | iIdentityHashCode)) * 70)) + (((~(iIdentityHashCode | 721932925)) | 363966051) * 70)) - 1401709154;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArr[0])[0] = i7 ^ (i7 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{35866, 54882, 14577, 33644, 58824, 18497, 37589, 62740, 24482, 41508, 1197, 28488, 45486, 5139, 32397, 49387, 11133, 36341, 53329, 15063, 40291, 59344, 18995, 44207, 63282, 22912}, 23158 - TextUtils.lastIndexOf("", '0', 0, 0), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{35864, 27885, 19919, 11936, 3986, 59514, 51549, 43535, 35603, 27632, 17609, 9683, 1724, 59293, 49253, 41311, 33316, 25350}, TextUtils.indexOf("", "", 0, 0) + 57571, objArr9);
            Method method = cls2.getMethod((String) objArr9[0], new Class[0]);
            Context applicationContext = (Context) method.invoke(null, null);
            if (applicationContext != null) {
                int i8 = TuitionPaymentFragmentbindingInflater1 + 53;
                int i9 = i8 % 128;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i9;
                if (i8 % 2 != 0) {
                    boolean z = applicationContext instanceof ContextWrapper;
                    throw null;
                }
                if (applicationContext instanceof ContextWrapper) {
                    int i10 = i9 + 125;
                    TuitionPaymentFragmentbindingInflater1 = i10 % 128;
                    if (i10 % 2 == 0) {
                        int i11 = 75 / 0;
                        if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                            applicationContext = applicationContext.getApplicationContext();
                        } else {
                            int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 71;
                            TuitionPaymentFragmentbindingInflater1 = i12 % 128;
                            int i13 = i12 % 2;
                            applicationContext = null;
                        }
                    } else if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = applicationContext.getApplicationContext();
                    } else {
                        int i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 71;
                        TuitionPaymentFragmentbindingInflater1 = i14 % 128;
                        int i15 = i14 % 2;
                        applicationContext = null;
                    }
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                }
            }
            Object[] objArr10 = new Object[1];
            c(new char[]{35857, 27343, 16807, 14437, 5889, 3646, 58596, 50118, 47796, 37160, 34938, 26405, 24052, 13534, 5048, 2669}, 59093 - TextUtils.getOffsetBefore("", 0), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(new char[]{35858, 35988, 36104, 36276, 36387, 36517, 36685, 36815, 34923, 35065, 35174, 35306, 35516, 35611, 35717, 33851}, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 138, objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i16 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 49;
            TuitionPaymentFragmentbindingInflater1 = i16 % 128;
            int i17 = i16 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, -1401709154};
                byte[] bArr4 = $$d;
                byte b2 = bArr4[50];
                byte b3 = (byte) (b2 - 1);
                Object[] objArr13 = new Object[1];
                d(b2, b3, b3, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b4 = bArr4[50];
                byte b5 = (byte) (b4 - 1);
                byte b6 = b4;
                Object[] objArr14 = new Object[1];
                d(b5, b6, b6, objArr14);
                objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0') + 31534);
                    int iResolveSizeAndState = 921 - View.resolveSizeAndState(0, 0, 0);
                    int iResolveOpacity = 28 - Drawable.resolveOpacity(0, 0);
                    byte[] bArr5 = $$a;
                    Object[] objArr15 = new Object[1];
                    a(bArr5[0], bArr5[33], (byte) 51, objArr15);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf, iResolveSizeAndState, iResolveOpacity, -1142834547, false, (String) objArr15[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr16 = new Object[1];
                    c(new char[]{35866, 40344, 44805, 47278, 51744, 56275, 58705, 63118, '|', 4605, 9175, 19751, 24222, 26657, 31161, 35677, 38086, 42597, 47101, 49507, 54044, 64641}, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 4492, objArr16);
                    Class<?> cls5 = Class.forName((String) objArr16[0]);
                    Object[] objArr17 = new Object[1];
                    c(new char[]{35870, 720, 37268, 8286, 46868, 17917, 54453, 27480, 64038, 35045, 8145, 44674, 15686, 52237, 17148}, View.resolveSize(0, 0) + 36551, objArr17);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char offsetAfter = (char) (TextUtils.getOffsetAfter("", 0) + 31533);
                        int i18 = 922 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                        int absoluteGravity = 28 - Gravity.getAbsoluteGravity(0, 0);
                        byte[] bArr6 = $$a;
                        byte b7 = bArr6[0];
                        Object[] objArr18 = new Object[1];
                        a(b7, b7, bArr6[7], objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(offsetAfter, i18, absoluteGravity, -778300370, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cResolveSize = (char) (View.resolveSize(0, 0) + 31533);
                        int iGreen = Color.green(0) + 921;
                        int iMyPid = 28 - (Process.myPid() >> 22);
                        byte[] bArr7 = $$a;
                        Object[] objArr19 = new Object[1];
                        a(bArr7[37], (byte) 52, bArr7[7], objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cResolveSize, iGreen, iMyPid, -1048449946, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    int i19 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 53;
                    TuitionPaymentFragmentbindingInflater1 = i19 % 128;
                    if (i19 % 2 == 0) {
                        int i20 = 4 % 5;
                    }
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
        int i21 = ((int[]) objArr[1])[0];
        int i22 = ((int[]) objArr[3])[0];
        if (i22 == i21) {
            int i23 = ((int[]) objArr[0])[0];
            int i24 = ((int[]) objArr[3])[0];
            Object[] objArr20 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{i24}, (String[]) objArr[4]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i25 = ~iIdentityHashCode2;
            int i26 = i23 + 134002307 + (((~((-1063563685) | i25)) | 708874404 | (~((-710515960) | i25))) * (-1136)) + (((~((-1063563685) | iIdentityHashCode2)) | (~((-710515960) | iIdentityHashCode2)) | (~(1065205239 | i25))) * (-568)) + (((~(iIdentityHashCode2 | (-708874405))) | (~(i25 | 710515959)) | (~(1063563684 | i25))) * 568);
            int i27 = (i26 << 13) ^ i26;
            int i28 = i27 ^ (i27 >>> 17);
            ((int[]) objArr20[0])[0] = i28 ^ (i28 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                int i29 = 0;
                while (i29 < strArr.length) {
                    int i30 = TuitionPaymentFragmentbindingInflater1 + 1;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i30 % 128;
                    if (i30 % 2 != 0) {
                        arrayList.add(strArr[i29]);
                        i29 += 38;
                    } else {
                        arrayList.add(strArr[i29]);
                        i29++;
                    }
                }
            }
            int[] iArr = new int[i22];
            int i31 = i22 - 1;
            iArr[i31] = 1;
            Toast.makeText((Context) null, iArr[((i22 * i31) % 2) - 1], 1).show();
            int i32 = ((int[]) objArr[0])[0];
            int i33 = ((int[]) objArr[3])[0];
            Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{i33}, (String[]) objArr[4]};
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i34 = ~((-704811329) | startUptimeMillis);
            int i35 = ~startUptimeMillis;
            int i36 = i32 + (-1371295504) + ((i34 | (~((-339281947) | i35))) * 497) + (((~(startUptimeMillis | (-339281947))) | (~((-729986370) | i35)) | 25175041) * 497);
            int i37 = (i36 << 13) ^ i36;
            int i38 = i37 ^ (i37 >>> 17);
            ((int[]) objArr21[0])[0] = i38 ^ (i38 << 5);
        }
        zbgVar.setResult(new GoogleSignInResult(googleSignInAccount, status));
    }
}
