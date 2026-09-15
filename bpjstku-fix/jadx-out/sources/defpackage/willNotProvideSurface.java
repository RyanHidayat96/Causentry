package defpackage;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import androidx.exifinterface.media.ExifInterface;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class willNotProvideSurface {
    private static int TuitionPaymentFragmentbindingInflater1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static final File TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static final String[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f1426a;
    private static final String b;
    private static int d;
    private static boolean g;
    private static final byte[] $$c = {109, 7, 114, -90};
    private static final int $$f = 230;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {29, 88, -118, 32, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$e = 131;
    private static final byte[] $$a = {97, 58, 103, -72, -19, 19, 2};
    private static final int $$b = 42;
    private static int asInterface = 0;
    private static int onTransact = 1;
    private static int asBinder = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 3
            int r7 = r7 + 101
            int r8 = r8 * 2
            int r8 = r8 + 4
            byte[] r0 = defpackage.willNotProvideSurface.$$a
            int r6 = r6 * 2
            int r6 = r6 + 4
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L2c
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            r4 = r0[r6]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2c:
            int r7 = -r7
            int r6 = r6 + 1
            int r7 = r7 + r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.willNotProvideSurface.c(byte, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(int r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 4
            int r6 = 103 - r6
            byte[] r0 = defpackage.willNotProvideSurface.$$d
            int r7 = r7 * 52
            int r1 = r7 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L13
            r4 = r7
            r6 = r8
            r3 = r2
            goto L2a
        L13:
            r3 = r2
            r5 = r8
            r8 = r6
            r6 = r5
        L17:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            int r6 = r6 + 1
            r4 = r0[r6]
            int r3 = r3 + 1
        L2a:
            int r4 = -r4
            int r8 = r8 + r4
            int r8 = r8 + (-11)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.willNotProvideSurface.e(int, byte, int, java.lang.Object[]):void");
    }

    static {
        d = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        StringBuilder sb = new StringBuilder();
        sb.append(SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append("RootDetector");
        b = sb.toString();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new File("/system/app/Superuser.apk");
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new String[]{"/system/xbin/which", "su"};
        int i = asBinder + 25;
        d = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:99:0x05d4  */
    private static boolean b() throws Throwable {
        int i;
        String string;
        Method method;
        int i2 = 2 % 2;
        try {
            ArrayList arrayList = new ArrayList();
            byte b2 = (byte) 0;
            byte b3 = b2;
            Object[] objArr = new Object[1];
            c(b2, b3, b3, objArr);
            Method[] methodArr = {Runtime.class.getMethod((String) objArr[0], String[].class)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
            int i3 = 24;
            long j = 0;
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                int doubleTapTimeout = 2823 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 22;
                byte[] bArr = $$d;
                byte b4 = bArr[10];
                byte b5 = bArr[5];
                Object[] objArr2 = new Object[1];
                e(b4, b5, (byte) (-b5), objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(maximumDrawingCacheSize, doubleTapTimeout, packedPositionType, 1814927978, false, (String) objArr2[0], null);
            }
            BufferedReader bufferedReader = null;
            char c = '0';
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null) == null) {
                Method[] declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) View.MeasureSpec.getMode(0), View.resolveSize(0, 0) + 2823, 23 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)))).getDeclaredMethods();
                int length = declaredMethods.length;
                int i4 = 0;
                while (i4 < length) {
                    Method method2 = declaredMethods[i4];
                    try {
                        int iLastIndexOf = 126 - TextUtils.lastIndexOf("", c);
                        byte[] bArr2 = new byte[i3];
                        // fill-array-data instruction
                        bArr2[0] = -112;
                        bArr2[1] = -113;
                        bArr2[2] = -114;
                        bArr2[3] = -116;
                        bArr2[4] = -119;
                        bArr2[5] = -115;
                        bArr2[6] = -124;
                        bArr2[7] = -116;
                        bArr2[8] = -117;
                        bArr2[9] = -119;
                        bArr2[10] = -123;
                        bArr2[11] = -118;
                        bArr2[12] = -119;
                        bArr2[13] = -120;
                        bArr2[14] = -124;
                        bArr2[15] = -121;
                        bArr2[16] = -122;
                        bArr2[17] = -126;
                        bArr2[18] = -123;
                        bArr2[19] = -124;
                        bArr2[20] = -126;
                        bArr2[21] = -125;
                        bArr2[22] = -126;
                        bArr2[23] = -127;
                        Object[] objArr3 = new Object[1];
                        f(null, null, iLastIndexOf, bArr2, objArr3);
                        Class<?> cls = Class.forName((String) objArr3[0]);
                        Object[] objArr4 = new Object[1];
                        f(null, null, View.resolveSizeAndState(0, 0, 0) + 127, new byte[]{-110, -120, -119, -111, -118, -111, -112, -113, -115, -116, -119, -121}, objArr4);
                        Object[] objArr5 = {Integer.valueOf(((Integer) cls.getMethod((String) objArr4[0], null).invoke(method2, null)).intValue())};
                        Object[] objArr6 = new Object[1];
                        f(null, null, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 127, new byte[]{-120, -119, -111, -118, -111, -112, -113, -115, -124, -116, -117, -119, -123, -118, -119, -120, -124, -121, -122, -126, -123, -124, -126, -125, -126, -127}, objArr6);
                        Class<?> cls2 = Class.forName((String) objArr6[0]);
                        Object[] objArr7 = new Object[1];
                        f(null, null, (SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1)) + 126, new byte[]{-119, -125, -111, -116, -126, -109, -110, -111}, objArr7);
                        if (((Boolean) cls2.getMethod((String) objArr7[0], Integer.TYPE).invoke(null, objArr5)).booleanValue()) {
                            Class cls3 = Long.TYPE;
                            Object[] objArr8 = new Object[1];
                            f(null, null, 127 - ((Process.getThreadPriority(0) + 20) >> 6), new byte[]{-112, -113, -114, -116, -119, -115, -124, -116, -117, -119, -123, -118, -119, -120, -124, -121, -122, -126, -123, -124, -126, -125, -126, -127}, objArr8);
                            Class<?> cls4 = Class.forName((String) objArr8[0]);
                            Object[] objArr9 = new Object[1];
                            f(null, null, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 126, new byte[]{-119, -104, -105, -106, -122, -120, -107, -116, -119, -108, -116, -119, -121}, objArr9);
                            if (cls3.equals(cls4.getMethod((String) objArr9[0], null).invoke(method2, null))) {
                                Object[] objArr10 = new Object[1];
                                f(null, null, TextUtils.indexOf("", "") + 127, new byte[]{-112, -113, -114, -116, -119, -115, -124, -116, -117, -119, -123, -118, -119, -120, -124, -121, -122, -126, -123, -124, -126, -125, -126, -127}, objArr10);
                                Class<?> cls5 = Class.forName((String) objArr10[0]);
                                Object[] objArr11 = new Object[1];
                                f(null, null, View.MeasureSpec.getMode(0) + 127, new byte[]{-110, -119, -104, -105, -106, -120, -119, -116, -119, -102, -126, -120, -126, -103, -116, -119, -121}, objArr11);
                                Object[] objArr12 = (Object[]) cls5.getMethod((String) objArr11[0], null).invoke(method2, null);
                                if (objArr12.length == 2 && Long.TYPE.equals(objArr12[0])) {
                                    i3 = 24;
                                    Object[] objArr13 = new Object[1];
                                    f(null, null, 126 - TextUtils.lastIndexOf("", '0', 0, 0), new byte[]{-112, -113, -114, -116, -119, -115, -124, -116, -117, -119, -123, -118, -119, -120, -124, -121, -122, -126, -123, -124, -126, -125, -126, -127}, objArr13);
                                    if (Class.forName((String) objArr13[0]).equals(objArr12[1])) {
                                        int i5 = asInterface + 83;
                                        onTransact = i5 % 128;
                                        if (i5 % 2 == 0) {
                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                                                int iIndexOf = TextUtils.indexOf("", "", 0) + 2823;
                                                int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 22;
                                                byte[] bArr3 = $$d;
                                                byte b6 = bArr3[10];
                                                byte b7 = bArr3[5];
                                                Object[] objArr14 = new Object[1];
                                                e(b6, b7, (byte) (-b7), objArr14);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cNormalizeMetaState, iIndexOf, iCombineMeasuredStates, 1814927978, false, (String) objArr14[0], null);
                                            }
                                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).set(null, method2);
                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1);
                                                int i6 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 2822;
                                                int maxKeyCode = 22 - (KeyEvent.getMaxKeyCode() >> 16);
                                                byte[] bArr4 = $$d;
                                                byte b8 = bArr4[10];
                                                byte b9 = bArr4[5];
                                                Object[] objArr15 = new Object[1];
                                                e(b8, b9, (byte) (-b9), objArr15);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cLastIndexOf, i6, maxKeyCode, 1814927978, false, (String) objArr15[0], null);
                                            }
                                            try {
                                                Object[] objArr16 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null)};
                                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                                    char mirror = (char) ('0' - AndroidCharacter.getMirror('0'));
                                                    int iAlpha = Color.alpha(0) + 2823;
                                                    int i7 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 21;
                                                    byte b10 = $$d[7];
                                                    byte b11 = b10;
                                                    Object[] objArr17 = new Object[1];
                                                    e(b10, b11, (byte) (b11 | 51), objArr17);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(mirror, iAlpha, i7, -2137287382, false, (String) objArr17[0], new Class[]{Long.TYPE, Method.class});
                                                }
                                                ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr16)).longValue();
                                                break;
                                            } catch (Throwable th) {
                                                Throwable cause = th.getCause();
                                                if (cause != null) {
                                                    throw cause;
                                                }
                                                throw th;
                                            }
                                        }
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                            char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                                            int touchSlop = 2823 - (ViewConfiguration.getTouchSlop() >> 8);
                                            int touchSlop2 = 22 - (ViewConfiguration.getTouchSlop() >> 8);
                                            byte[] bArr5 = $$d;
                                            byte b12 = bArr5[10];
                                            byte b13 = bArr5[5];
                                            Object[] objArr18 = new Object[1];
                                            e(b12, b13, (byte) (-b13), objArr18);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(scrollBarSize, touchSlop, touchSlop2, 1814927978, false, (String) objArr18[0], null);
                                        }
                                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, method2);
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                            char cRed = (char) Color.red(0);
                                            int iIndexOf2 = 2822 - TextUtils.indexOf((CharSequence) "", '0');
                                            int iRgb = Color.rgb(0, 0, 0) + 16777238;
                                            byte[] bArr6 = $$d;
                                            byte b14 = bArr6[10];
                                            byte b15 = bArr6[5];
                                            Object[] objArr19 = new Object[1];
                                            e(b14, b15, (byte) (-b15), objArr19);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cRed, iIndexOf2, iRgb, 1814927978, false, (String) objArr19[0], null);
                                        }
                                        try {
                                            Object[] objArr20 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).get(null)};
                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                                                char c2 = (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                                                int keyRepeatDelay = 2823 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                                                int maxKeyCode2 = 22 - (KeyEvent.getMaxKeyCode() >> 16);
                                                byte b16 = $$d[7];
                                                byte b17 = b16;
                                                Object[] objArr21 = new Object[1];
                                                e(b16, b17, (byte) (b17 | 51), objArr21);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c2, keyRepeatDelay, maxKeyCode2, -2137287382, false, (String) objArr21[0], new Class[]{Long.TYPE, Method.class});
                                            }
                                            ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr20)).longValue();
                                            break;
                                        } catch (Throwable th2) {
                                            Throwable cause2 = th2.getCause();
                                            if (cause2 != null) {
                                                throw cause2;
                                            }
                                            throw th2;
                                        }
                                    }
                                } else {
                                    i3 = 24;
                                }
                            } else {
                                i3 = 24;
                            }
                        } else {
                            i3 = 24;
                        }
                        j = 0;
                        i4++;
                        c = '0';
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 != null) {
                            throw cause3;
                        }
                        throw th3;
                    }
                }
            }
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0) + 2824;
                int iMyTid = 22 - (Process.myTid() >> 22);
                byte[] bArr7 = $$d;
                byte b18 = bArr7[10];
                byte b19 = bArr7[5];
                Object[] objArr22 = new Object[1];
                e(b18, b19, (byte) (-b19), objArr22);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(maximumFlingVelocity, iLastIndexOf2, iMyTid, 1814927978, false, (String) objArr22[0], null);
            }
            try {
                Object[] objArr23 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).get(null)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                    char keyRepeatTimeout = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    int i8 = 2823 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 23;
                    byte[] bArr8 = $$d;
                    byte b20 = (byte) (bArr8[19] - 1);
                    byte b21 = bArr8[7];
                    Object[] objArr24 = new Object[1];
                    e(b20, b21, (byte) (b21 | 51), objArr24);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(keyRepeatTimeout, i8, bitsPerPixel, 1025296417, false, (String) objArr24[0], new Class[]{Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).invoke(null, objArr23);
                try {
                    Object[] objArr25 = {0, methodArr, null};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                        char maximumFlingVelocity2 = (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 37657);
                        int edgeSlop = 2720 - (ViewConfiguration.getEdgeSlop() >> 16);
                        int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 19;
                        byte[] bArr9 = $$d;
                        byte b22 = (byte) (bArr9[19] - 1);
                        byte b23 = bArr9[7];
                        Object[] objArr26 = new Object[1];
                        e(b22, b23, (byte) (b23 | 51), objArr26);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(maximumFlingVelocity2, edgeSlop, windowTouchSlop, -1568796068, false, (String) objArr26[0], new Class[]{Integer.TYPE, Method[].class, List.class});
                    }
                    long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).invoke(null, objArr25)).longValue();
                    long j2 = -435184430;
                    long j3 = -167;
                    long j4 = (j3 * j2) + (j3 * jLongValue);
                    long j5 = 168;
                    long j6 = -1;
                    long j7 = j2 ^ j6;
                    long j8 = jLongValue ^ j6;
                    long j9 = j7 | j8;
                    long jMyPid = Process.myPid();
                    long j10 = jMyPid ^ j6;
                    long j11 = j4 + (((j9 ^ j6) | ((j8 | j10) ^ j6)) * j5) + (((j9 | jMyPid) ^ j6) * j5) + (j5 * ((((j8 | j2) | jMyPid) ^ j6) | ((j7 | j10) ^ j6) | ((j7 | jLongValue) ^ j6))) + ((long) (-1375221415));
                    int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                    int i9 = ~startElapsedRealtime;
                    int i10 = ((int) (j11 >> 32)) & (1710353574 + ((startElapsedRealtime | 1145132048) * 988) + (((~((-999041861) | i9)) | 285474884) * (-1976)) + (((~(startElapsedRealtime | 1858699024)) | 1145132048 | (~((-1858699025) | i9))) * 988));
                    int i11 = (int) j11;
                    int startUptimeMillis = (int) Process.getStartUptimeMillis();
                    int i12 = (~(1984394051 | startUptimeMillis)) | 9964696;
                    int i13 = ~startUptimeMillis;
                    int i14 = i10 | (i11 & ((-987269447) + ((i12 | (~((-1447191107) | i13))) * 886) + (((~(i13 | (-1984394052))) | 547167641) * (-1772)) + ((~(i13 | 547167641)) * 886)));
                    int i15 = i14 >>> 24;
                    int i16 = i14 & ViewCompat.MEASURED_SIZE_MASK;
                    if (i15 != 0) {
                        int i17 = asInterface + 63;
                        onTransact = i17 % 128;
                        int i18 = i17 % 2;
                        i = 1;
                    } else {
                        i = 0;
                    }
                    if ((i ^ 1) != 0) {
                        string = null;
                    } else {
                        int i19 = onTransact + 119;
                        asInterface = i19 % 128;
                        if (i19 % 2 != 0) {
                            try {
                                throw null;
                            } catch (Throwable th4) {
                                throw th4;
                            }
                        }
                        if (i16 >= 1 || (method = methodArr[i16]) == null) {
                            string = null;
                        } else {
                            string = method.toString();
                        }
                    }
                    arrayList.add(string);
                    if ((i15 + 6) * i != 0) {
                        throw new NullPointerException();
                    }
                    Process processExec = Runtime.getRuntime().exec(TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    try {
                        ArrayList arrayList2 = new ArrayList();
                        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(processExec.getInputStream()));
                        while (true) {
                            try {
                                String line = bufferedReader2.readLine();
                                if (line == null) {
                                    if (arrayList2.size() <= 0) {
                                        return false;
                                    }
                                    int i20 = asInterface + 1;
                                    onTransact = i20 % 128;
                                    int i21 = i20 % 2;
                                    return true;
                                }
                                int i22 = onTransact + 115;
                                asInterface = i22 % 128;
                                if (i22 % 2 != 0) {
                                    arrayList2.add(line);
                                    try {
                                        throw null;
                                    } catch (Throwable th5) {
                                        throw th5;
                                    }
                                }
                                arrayList2.add(line);
                            } catch (Exception unused) {
                                bufferedReader = bufferedReader2;
                                if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                                    ViewPort.a("unable to read response from 'which' command");
                                }
                                if (bufferedReader == null) {
                                    return false;
                                }
                                try {
                                    bufferedReader.close();
                                    return false;
                                } catch (IOException unused2) {
                                    if (!SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                                        return false;
                                    }
                                    ViewPort.a("unable to close stream");
                                    return false;
                                }
                            }
                        }
                    } catch (Exception unused3) {
                    }
                } catch (Throwable th6) {
                    Throwable cause4 = th6.getCause();
                    if (cause4 != null) {
                        throw cause4;
                    }
                    throw th6;
                }
            } catch (Throwable th7) {
                Throwable cause5 = th7.getCause();
                if (cause5 != null) {
                    throw cause5;
                }
                throw th7;
            }
        } catch (Exception unused4) {
            return false;
        }
    }

    private static boolean TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        try {
            boolean zExists = TuitionPaymentFragmentspecialinlinedviewModeldefault2.exists();
            int i2 = asInterface + 83;
            onTransact = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 5 / 0;
            }
            return zExists;
        } catch (Exception unused) {
            if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                ViewPort.a(TuitionPaymentFragmentspecialinlinedviewModeldefault2.toString());
                int i4 = asInterface + 83;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
            }
            return false;
        }
    }

    private static void f(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
        char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        char c = '0';
        int i3 = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i3] = Integer.valueOf(cArr2[i4]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char cMyTid = (char) (31339 - (Process.myTid() >> 22));
                        int bitsPerPixel = 2993 - ImageFormat.getBitsPerPixel(i3);
                        int iIndexOf = TextUtils.indexOf("", c, i3) + 18;
                        byte b2 = (byte) i3;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cMyTid, bitsPerPixel, iIndexOf, 1182129903, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i4++;
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
            int i5 = $11 + 15;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((Process.myPid() >> 22) + 43325), TextUtils.lastIndexOf("", '0') + 254, View.combineMeasuredStates(0, 0) + 22, 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
        int i7 = 33602;
        if (f1426a) {
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
            char[] cArr4 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                int i8 = $11 + 117;
                $10 = i8 % 128;
                if (i8 % 2 != 0) {
                    cArr4[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 / 0) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] / i] * iIntValue);
                    Object[] objArr4 = {getsupportedpostviewsize, getsupportedpostviewsize};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b4 = (byte) 1;
                        byte b5 = (byte) (b4 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (33601 - TextUtils.lastIndexOf("", '0', 0, 0)), 3085 - View.resolveSize(0, 0), KeyEvent.keyCodeFromString("") + 26, -2146875848, false, $$g(b4, b5, b5), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                } else {
                    cArr4[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                    Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b6 = (byte) 1;
                        byte b7 = (byte) (b6 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (i7 - Color.green(0)), (ViewConfiguration.getEdgeSlop() >> 16) + 3085, TextUtils.lastIndexOf("", '0', 0, 0) + 27, -2146875848, false, $$g(b6, b7, b7), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                    i7 = 33602;
                }
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!g) {
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
            char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                int i9 = $10 + 27;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1++;
                int i11 = $11 + 1;
                $10 = i11 % 128;
                int i12 = i11 % 2;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
        char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
        getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
            int i13 = $11 + 91;
            $10 = i13 % 128;
            int i14 = i13 % 2;
            cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
            Object[] objArr6 = {getsupportedpostviewsize, getsupportedpostviewsize};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                byte b8 = (byte) 1;
                byte b9 = (byte) (b8 - 1);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (33602 - (ViewConfiguration.getPressedStateDuration() >> 16)), 3133 - AndroidCharacter.getMirror('0'), View.resolveSizeAndState(0, 0, 0) + 26, -2146875848, false, $$g(b8, b9, b9), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr6);
    }

    public static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = onTransact + 45;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        String str = Build.TAGS;
        if (str != null) {
            int i4 = asInterface + 77;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            if (str.contains("test-keys")) {
                return true;
            }
        }
        if (TuitionPaymentFragmentbindingInflater1()) {
            return true;
        }
        int i6 = onTransact + 29;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
        return b();
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new char[]{47408, 47417, 47396, 47340, 47406, 47404, 47411, 47400, 47413, 47412, 47415, 47398, 47373, 47410, 47403, 47414, 47409, 47399, 47372, 47368, 47397, 47366, 47393, 47402, 47370, 47405};
        TuitionPaymentFragmentbindingInflater1 = 2047719642;
        g = true;
        f1426a = true;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r6, int r7, short r8) {
        /*
            int r7 = r7 * 3
            int r0 = r7 + 1
            int r6 = 68 - r6
            byte[] r1 = defpackage.willNotProvideSurface.$$c
            int r8 = r8 * 3
            int r8 = 3 - r8
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L2a
        L14:
            r3 = r2
        L15:
            int r8 = r8 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L24:
            r3 = r1[r8]
            r5 = r8
            r8 = r6
            r6 = r3
            r3 = r5
        L2a:
            int r6 = -r6
            int r6 = r6 + r8
            r8 = r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.willNotProvideSurface.$$g(int, int, short):java.lang.String");
    }
}
