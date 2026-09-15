package com.google.android.libraries.places.internal;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import defpackage.SessionConfigValidatingBuilder;
import defpackage.initSession;
import defpackage.registerCamera;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
abstract class zzbos implements zzblt {
    private static final byte[] $$c = {89, 107, -36, -112};
    private static final int $$f = 182;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {25, 31, 20, 1, 2, -21, 2, -11, -6, -23, -8, 28, -46, -11, -14, -8, 24, -43, -6, 3, -4, -11, -11, 42, -56, -22, 1, -23, -6, -3, -4, -29, 12, -7, -21, -1, -22, 8, -11, -21, -12, 4, -20, -11, -6, 3, -11, -23, -9, 1, -14, -2, 26, -42, -10, -4, -29, 0, -17, 24, -43, -6, 3, -4, -11, -11, 12, -43, -6, 3, -11, -23, -9, -5, -12, -42, 3, -20, 2, -15, -8, 21, -26, -33, 3, -1, -18, -15, 37, -53, 8, -15, -15, -1, -18, -15, 9, -16, -14, 1, -14, -14, -2, 21, -46, -1, -15, 2, -28, 6, -22, 56};
    private static final int $$e = 231;
    private static final byte[] $$a = {90, 46, 113, 8, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
    private static final int $$b = 130;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private static int b = 1;
    private static int[] TuitionPaymentFragmentbindingInflater1 = {-1696172901, 2079116149, -1728065189, -1353035143, -1422336812, 1362172056, -817396085, 353272702, 540928579, -1031245253, -1232372839, -1617344636, 1989970707, -1390743788, 84217249, 1161909820, 350299716, 1883611034};

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r5, int r6, int r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 + 1
            byte[] r0 = com.google.android.libraries.places.internal.zzbos.$$a
            int r5 = r5 + 4
            int r7 = r7 * 14
            int r7 = r7 + 84
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L12
            r4 = r6
            r3 = r2
            goto L26
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L22:
            int r5 = r5 + 1
            r4 = r0[r5]
        L26:
            int r7 = r7 + r4
            int r7 = r7 + (-10)
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzbos.a(byte, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002c  */
    /* JADX WARN: Code duplicated, block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002c
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 71
            int r6 = 75 - r6
            byte[] r0 = com.google.android.libraries.places.internal.zzbos.$$d
            int r7 = r7 * 24
            int r7 = 108 - r7
            int r8 = r8 * 34
            int r1 = 72 - r8
            byte[] r1 = new byte[r1]
            int r8 = 71 - r8
            r2 = 0
            if (r0 != 0) goto L19
            r3 = r7
            r4 = r2
            r7 = r6
            goto L2e
        L19:
            r3 = r2
            r5 = r7
            r7 = r6
            r6 = r5
        L1d:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L2c
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2c:
            r3 = r0[r7]
        L2e:
            int r3 = -r3
            int r6 = r6 + r3
            int r7 = r7 + 1
            int r6 = r6 + (-9)
            r3 = r4
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzbos.d(byte, int, short, java.lang.Object[]):void");
    }

    public final String toString() {
        int i = 2 % 2;
        registerCamera.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = new registerCamera.TuitionPaymentFragmentbindingInflater1(getClass().getSimpleName(), (byte) 0);
        zzblt zzbltVarZze = zze();
        registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = new registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
        tuitionPaymentFragmentspecialinlinedviewModeldefault2.b = zzbltVarZze;
        tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "delegate";
        String string = tuitionPaymentFragmentbindingInflater1.toString();
        int i2 = b + 15;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.libraries.places.internal.zzblt
    public final void zza(zzbip zzbipVar) {
        int i = 2 % 2;
        int i2 = b + 27;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        zze().zza(zzbipVar);
        if (i3 != 0) {
            throw null;
        }
    }

    protected abstract zzblt zze();

    private static void c(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = TuitionPaymentFragmentbindingInflater1;
        char c = '0';
        int i4 = -1870535734;
        int i5 = 1;
        int i6 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $11 + 63;
                $10 = i8 % 128;
                if (i8 % i2 != 0) {
                    try {
                        Object[] objArr2 = new Object[1];
                        objArr2[i6] = Integer.valueOf(iArr2[i7]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b2 = (byte) (-1);
                            byte b3 = (byte) (b2 + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.lastIndexOf("", c, i6) + 1), 3291 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), MotionEvent.axisFromString("") + 32, 1948206109, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        iArr3[i7] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(iArr2[i7])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) (-1);
                        byte b5 = (byte) (b4 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), 3291 - View.combineMeasuredStates(0, 0), 30 - ExpandableListView.getPackedPositionChild(0L), 1948206109, false, $$g(b4, b5, b5), new Class[]{Integer.TYPE});
                    }
                    iArr3[i7] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                    i7++;
                }
                i2 = 2;
                c = '0';
                i4 = -1870535734;
                i6 = 0;
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = TuitionPaymentFragmentbindingInflater1;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i9 = 0;
            while (i9 < length3) {
                int i10 = $11 + 97;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                Object[] objArr4 = new Object[i5];
                objArr4[0] = Integer.valueOf(iArr5[i9]);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b6 = (byte) (-1);
                    byte b7 = (byte) (b6 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getTapTimeout() >> 16), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 3290, 30 - TextUtils.indexOf((CharSequence) "", '0', 0), 1948206109, false, $$g(b6, b7, b7), new Class[]{Integer.TYPE});
                }
                iArr6[i9] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                i9++;
                iArr5 = iArr5;
                i5 = 1;
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        sessionConfigValidatingBuilder.b = 2;
        while (sessionConfigValidatingBuilder.b < iArr.length) {
            int i12 = $11 + 11;
            $10 = i12 % 128;
            int i13 = i12 % 2;
            cArr[0] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
            cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
            cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
            cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
            int i14 = 17;
            for (int i15 = 1; i14 > i15; i15 = 1) {
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i14];
                Object[] objArr5 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b8 = (byte) (-1);
                    byte b9 = (byte) (b8 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (KeyEvent.getMaxKeyCode() >> 16), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 2559, Drawable.resolveOpacity(0, 0) + 29, 683220507, false, $$g(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                i14--;
                int i16 = $10 + 59;
                $11 = i16 % 128;
                if (i16 % 2 == 0) {
                    int i17 = 5 % 5;
                }
            }
            int i18 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i18;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
            int i19 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object[] objArr6 = {sessionConfigValidatingBuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 28879), 348 - (ViewConfiguration.getDoubleTapTimeout() >> 16), Color.blue(0) + 25, -30507727, false, "G", new Class[]{Object.class});
            }
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i19 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue()];
            cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
            cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
            cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
            sessionConfigValidatingBuilder.b += 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x021f  */
    @Override // com.google.android.libraries.places.internal.zzbwj
    public final void zzb(zzbwi zzbwiVar) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = b + 85;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 31533);
            int iResolveSize = 921 - View.resolveSize(0, 0);
            int i4 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 27;
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            a(bArr[7], bArr[80], bArr[37], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, iResolveSize, i4, -1048449946, false, (String) objArr2[0], null);
        }
        Object obj = null;
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new int[]{-2029930161, 1427114594, 116903293, 1457494066, 1405305337, -718991554, 750722536, -534491690, 697201977, 489904167, -1664284626, -448612097, 2075764208, 335430850}, TextUtils.indexOf("", "") + 22, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new int[]{1738763808, 1481937367, 921324124, -1715262837, 668351284, 1862616957, 1966367722, -182488583, -1138447118, 809476555}, TextUtils.getCapsMode("", 0, 0) + 15, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cAlpha = (char) (Color.alpha(0) + 31533);
            int threadPriority = 921 - ((Process.getThreadPriority(0) + 20) >> 6);
            int iIndexOf = 27 - TextUtils.indexOf((CharSequence) "", '0');
            byte[] bArr2 = $$a;
            byte b2 = bArr2[7];
            Object[] objArr5 = new Object[1];
            a(b2, (byte) (b2 & 52), bArr2[80], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cAlpha, threadPriority, iIndexOf, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 49;
            b = i5 % 128;
            int i6 = i5 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char gidForName = (char) (31532 - Process.getGidForName(""));
                int threadPriority2 = ((Process.getThreadPriority(0) + 20) >> 6) + 921;
                int iAlpha = Color.alpha(0) + 28;
                Object[] objArr6 = new Object[1];
                a((byte) 51, (byte) 37, $$a[80], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(gidForName, threadPriority2, iAlpha, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i7 = ~iIdentityHashCode;
            int i8 = (((~(i7 | 1332653453)) | (~((-441426191) | i7)) | 268500994) * (-397)) + 923462286 + ((iIdentityHashCode | 1428229251) * 397) + 1008524140;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[0])[0] = i10 ^ (i10 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c(new int[]{-337025814, 615058498, -469427425, 962690400, -1121614730, -1216885782, 2127728376, 444434161, -2037523445, -417489579, 1453998015, 281355860, 36842131, 133730256, 559549808, -1334322700}, 25 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new int[]{1574878814, -1931947162, -868407050, 1897709600, -1203811970, -930087193, -1178365610, 1128538340, 1889775815, 1137192915, 1228271517, -1813872733}, TextUtils.indexOf((CharSequence) "", '0', 0) + 19, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 53;
                int i12 = i11 % 128;
                b = i12;
                int i13 = i11 % 2;
                if (applicationContext instanceof ContextWrapper) {
                    int i14 = i12 + 49;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i14 % 128;
                    if (i14 % 2 != 0) {
                        ((ContextWrapper) applicationContext).getBaseContext();
                        obj.hashCode();
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
            c(new int[]{777785454, -320452917, -34943900, 200640131, 647074244, 2066176277, 1177276397, -300852546, 1770065809, -499343115}, TextUtils.indexOf("", "") + 16, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(new int[]{1659180995, -480105037, -1384235416, -1884082660, -1895296984, 690955855, 447798730, -980832248, 473910662, 2001406440}, KeyEvent.getDeadChar(0, 0) + 16, objArr11);
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, 1008524140};
                byte[] bArr3 = $$d;
                byte b3 = bArr3[3];
                byte b4 = bArr3[57];
                Object[] objArr13 = new Object[1];
                d(b3, b4, b4, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b5 = bArr3[57];
                byte b6 = bArr3[3];
                Object[] objArr14 = new Object[1];
                d(b5, b6, b6, objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c2 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 31534);
                    int gidForName2 = 920 - Process.getGidForName("");
                    int i15 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 28;
                    Object[] objArr16 = new Object[1];
                    a((byte) 51, (byte) 37, $$a[80], objArr16);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, gidForName2, i15, -1142834547, false, (String) objArr16[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                try {
                    Object[] objArr17 = new Object[1];
                    c(new int[]{-2029930161, 1427114594, 116903293, 1457494066, 1405305337, -718991554, 750722536, -534491690, 697201977, 489904167, -1664284626, -448612097, 2075764208, 335430850}, 21 - TextUtils.lastIndexOf("", '0', 0), objArr17);
                    Class<?> cls5 = Class.forName((String) objArr17[0]);
                    Object[] objArr18 = new Object[1];
                    c(new int[]{1738763808, 1481937367, 921324124, -1715262837, 668351284, 1862616957, 1966367722, -182488583, -1138447118, 809476555}, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 15, objArr18);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cIndexOf = (char) (TextUtils.indexOf("", "") + 31533);
                        int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 921;
                        int absoluteGravity2 = 28 - Gravity.getAbsoluteGravity(0, 0);
                        byte[] bArr4 = $$a;
                        byte b7 = bArr4[7];
                        Object[] objArr19 = new Object[1];
                        a(b7, (byte) (b7 & 52), bArr4[80], objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf, absoluteGravity, absoluteGravity2, -778300370, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c3 = (char) (31533 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                        int absoluteGravity3 = Gravity.getAbsoluteGravity(0, 0) + 921;
                        int iIndexOf2 = TextUtils.indexOf("", "") + 28;
                        byte[] bArr5 = $$a;
                        byte b8 = bArr5[7];
                        byte b9 = bArr5[80];
                        byte b10 = bArr5[37];
                        Object[] objArr20 = new Object[1];
                        a(b8, b9, b10, objArr20);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c3, absoluteGravity3, iIndexOf2, -1048449946, false, (String) objArr20[0], null);
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
        if (((int[]) objArr[3])[0] != ((int[]) objArr[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr == null) {
                throw null;
            }
            int i16 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 75;
            b = i16 % 128;
            int i17 = i16 % 2;
            for (String str : strArr) {
                arrayList.add(str);
            }
            throw null;
        }
        int i18 = ((int[]) objArr[0])[0];
        Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
        int i19 = ~((int) Runtime.getRuntime().freeMemory());
        int i20 = i18 + (-1613505887) + (((-536872963) | i19) * 494) + (((~(i19 | 1190081909)) | (-1679830100)) * 494);
        int i21 = (i20 << 13) ^ i20;
        int i22 = i21 ^ (i21 >>> 17);
        ((int[]) objArr21[0])[0] = i22 ^ (i22 << 5);
        zze().zzb(zzbwiVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbwj
    public final void zzd() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 43;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            zze().zzd();
            throw null;
        }
        zze().zzd();
        int i3 = b + 57;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
    }

    zzbos() {
    }

    @Override // com.google.android.libraries.places.internal.zzblt
    public void zzc(zzbjv zzbjvVar, zzbls zzblsVar, zzbip zzbipVar) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 113;
        b = i2 % 128;
        int i3 = i2 % 2;
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r5, byte r6, byte r7) {
        /*
            byte[] r0 = com.google.android.libraries.places.internal.zzbos.$$c
            int r5 = r5 + 4
            int r7 = r7 * 56
            int r7 = r7 + 66
            int r6 = r6 * 4
            int r1 = 1 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            int r6 = 0 - r6
            if (r0 != 0) goto L17
            r3 = r7
            r4 = r2
            r7 = r6
            goto L29
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r5 = r5 + 1
            int r4 = r3 + 1
            if (r3 != r6) goto L27
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L27:
            r3 = r0[r5]
        L29:
            int r7 = r7 + r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzbos.$$g(int, byte, byte):java.lang.String");
    }
}
