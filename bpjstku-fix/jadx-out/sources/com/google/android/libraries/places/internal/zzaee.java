package com.google.android.libraries.places.internal;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
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
import android.widget.Toast;
import defpackage.SessionConfigValidatingBuilder;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzaee implements zzbak {
    private static int[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    static final zzbak zza;
    private static final byte[] $$c = {104, 27, -72, 120};
    private static final int $$f = 222;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {60, 80, 13, 34, -15, -1, 60, -60, -11, -3, 5, -8, 4, 52, -54, -16, 7, -17, 0, 3, 2, 51, -60, -9, -9, 66, -66, 9, -18, -6, 66, -66, -5, 8, -4, -10, 59, -37, -34, 0, -16, 15, -11, -2, -36, 9, -14, 8, -9, -2, 27, -20, -27, 9, 5, -12, -9, 43, -47, 14, -9, -9, 5, -12, -9, 15, -10, -8, 7, -8, -8, 4, 27, -40, 5, -9, 8, -22, 12, -16, 62};
    private static final int $$e = 143;
    private static final byte[] $$a = {55, -64, 35, -71, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
    private static final int $$b = 228;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
    private static int b = 1;

    private static void a(int i, short s, int i2, Object[] objArr) {
        int i3 = 56 - (i2 * 52);
        int i4 = 98 - (s * 14);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[53 - i];
        int i5 = 52 - i;
        int i6 = -1;
        if (bArr == null) {
            i3++;
            i4 = (i5 + i3) - 10;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i4;
            if (i6 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                byte b2 = bArr[i3];
                i3++;
                i4 = (i4 + b2) - 10;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(int r7, int r8, int r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.google.android.libraries.places.internal.zzaee.$$d
            int r7 = r7 * 40
            int r7 = r7 + 4
            int r8 = r8 * 15
            int r8 = r8 + 84
            int r9 = r9 * 3
            int r9 = r9 + 38
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2d
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r9) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L27:
            r3 = r0[r7]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L2d:
            int r7 = -r7
            int r8 = r8 + 1
            int r3 = r3 + r7
            int r7 = r3 + (-3)
            r3 = r4
            r6 = r8
            r8 = r7
            r7 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzaee.d(int, int, int, java.lang.Object[]):void");
    }

    private static void c(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int length;
        int[] iArr2;
        int i3;
        int i4 = 2 % 2;
        SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i5 = -1870535734;
        int i6 = 1;
        int i7 = 0;
        if (iArr3 != null) {
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int i8 = 0;
            while (i8 < length2) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i8])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i5);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 3291, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 30, 1948206109, false, $$g(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                    }
                    iArr4[i8] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    i8++;
                    i5 = -1870535734;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr4;
        }
        int length3 = iArr3.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (iArr6 != null) {
            int i9 = $10 + 73;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                length = iArr6.length;
                iArr2 = new int[length];
                i3 = 1;
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
                i3 = 0;
            }
            while (i3 < length) {
                int i10 = $10 + 11;
                $11 = i10 % 128;
                if (i10 % 2 == 0) {
                    Object[] objArr3 = new Object[i6];
                    objArr3[i7] = Integer.valueOf(iArr6[i3]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) i7;
                        byte b5 = b4;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), (ViewConfiguration.getTapTimeout() >> 16) + 3291, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 31, 1948206109, false, $$g(b4, b5, (byte) (b5 + 1)), new Class[]{Integer.TYPE});
                    }
                    iArr2[i3] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                    i3 /= 0;
                } else {
                    length = length;
                    Object[] objArr4 = {Integer.valueOf(iArr6[i3])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) Drawable.resolveOpacity(0, 0), 3291 - TextUtils.indexOf("", "", 0), ExpandableListView.getPackedPositionGroup(0L) + 31, 1948206109, false, $$g(b6, b7, (byte) (b7 + 1)), new Class[]{Integer.TYPE});
                    }
                    iArr2[i3] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                    i3++;
                }
                length = length;
                i6 = 1;
                i7 = 0;
            }
            i2 = i7;
            iArr6 = iArr2;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr6, i2, iArr5, i2, length3);
        int i11 = 2;
        sessionConfigValidatingBuilder.b = 2;
        while (sessionConfigValidatingBuilder.b < iArr.length) {
            int i12 = $11 + 123;
            $10 = i12 % 128;
            int i13 = i12 % i11;
            cArr[0] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
            cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
            cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
            cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
            int i14 = 17;
            for (int i15 = 1; i14 > i15; i15 = 1) {
                int i16 = $10 + 35;
                $11 = i16 % 128;
                if (i16 % 2 == 0) {
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr5[i14];
                    Object[] objArr5 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b8 = (byte) 0;
                        byte b9 = b8;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 2558 - TextUtils.lastIndexOf("", '0'), Color.green(0) + 29, 683220507, false, $$g(b8, b9, b9), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                    i14 += 117;
                } else {
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr5[i14];
                    Object[] objArr6 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        byte b10 = (byte) 0;
                        byte b11 = b10;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 2559 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 29, 683220507, false, $$g(b10, b11, b11), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue();
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue2;
                    i14--;
                }
            }
            int i17 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i17;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr5[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr5[0];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
            int i18 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object[] objArr7 = {sessionConfigValidatingBuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b((char) (28879 - (ViewConfiguration.getTapTimeout() >> 16)), TextUtils.indexOf((CharSequence) "", '0') + 349, 25 - (ViewConfiguration.getWindowTouchSlop() >> 8), -30507727, false, "G", new Class[]{Object.class});
            }
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i18 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7)).intValue()];
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

    @Override // com.google.android.libraries.places.internal.zzbak
    public final boolean zza(int i) throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        int i2 = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char keyRepeatTimeout = (char) (31533 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
            int i3 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 920;
            int modifierMetaStateMask = 27 - ((byte) KeyEvent.getModifierMetaStateMask());
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            a((byte) 52, bArr[80], bArr[37], objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(keyRepeatTimeout, i3, modifierMetaStateMask, -1048449946, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        c(new int[]{-726475711, 55453822, 1004417004, -187627111, 365979484, 377031117, -585852411, 616128445, -1712732504, -1603074894, 214860434, 1250066599, -1222185896, 1776351084}, 22 - View.resolveSizeAndState(0, 0, 0), objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        c(new int[]{2057709008, -2029097016, -1436380259, -1886821162, -533458645, -1301335134, -1698757854, -337642736, 818973105, 1163414575}, 15 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char scrollDefaultDelay = (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 31533);
            int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 922;
            int i4 = 29 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
            byte[] bArr2 = $$a;
            byte b2 = bArr2[80];
            byte b3 = bArr2[37];
            Object[] objArr6 = new Object[1];
            a(b2, b3, b3, objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(scrollDefaultDelay, bitsPerPixel, i4, -778300370, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 13;
            TuitionPaymentFragmentbindingInflater1 = i5 % 128;
            int i6 = i5 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cRgb = (char) (Color.rgb(0, 0, 0) + 16808749);
                int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 921;
                int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 28;
                byte[] bArr3 = $$a;
                Object[] objArr7 = new Object[1];
                a(bArr3[33], bArr3[37], bArr3[80], objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cRgb, iResolveSizeAndState, maximumFlingVelocity, -1142834547, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i ^ (i << 5)}, new int[]{((int[]) objArr8[1])[0]}, (Object[]) objArr8[2], new int[]{((int[]) objArr8[3])[0]}, (String[]) objArr8[4]};
            int i7 = ~i;
            int i8 = 4975307 + (((~(i7 | 866620669)) | (~((-907458975) | i7)) | 68167938) * 464) + (((-839291037) | i) * (-464)) + (((~(i | 866620669)) | 68167938) * 464) + 191640617;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
        } else {
            Object[] objArr9 = new Object[1];
            c(new int[]{-240795832, -1351065455, 1232492138, 1505586794, -920261477, 368269766, -392362624, -887037675, -752430232, -455549527, 1770475476, 1426144903, 988606366, 1668154004, -2093264269, 960368539}, 26 - TextUtils.getCapsMode("", 0, 0), objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            c(new int[]{-1335039410, -1128049169, -1620638081, -97147694, -302912841, 290611030, -2098249348, 329859866, -1128951246, -1950406348, 1851507603, -973366384}, 18 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr10);
            Context applicationContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 93;
            TuitionPaymentFragmentbindingInflater1 = i11 % 128;
            int i12 = i11 % 2;
            try {
                Object[] objArr11 = {applicationContext, Integer.valueOf(i), 0, 191640617};
                byte[] bArr4 = $$d;
                byte b4 = bArr4[18];
                byte b5 = (byte) (-bArr4[5]);
                Object[] objArr12 = new Object[1];
                d(b4, b5, b5, objArr12);
                Class<?> cls3 = Class.forName((String) objArr12[0]);
                byte b6 = (byte) (-bArr4[5]);
                byte b7 = bArr4[18];
                Object[] objArr13 = new Object[1];
                d(b6, b7, b7, objArr13);
                Object[] objArr14 = (Object[]) cls3.getMethod((String) objArr13[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char scrollBarFadeDuration = (char) (31533 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
                    int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 922;
                    int deadChar = KeyEvent.getDeadChar(0, 0) + 28;
                    byte[] bArr5 = $$a;
                    Object[] objArr15 = new Object[1];
                    a(bArr5[33], bArr5[37], bArr5[80], objArr15);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(scrollBarFadeDuration, packedPositionChild, deadChar, -1142834547, false, (String) objArr15[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr14);
                try {
                    Object[] objArr16 = new Object[1];
                    c(new int[]{-726475711, 55453822, 1004417004, -187627111, 365979484, 377031117, -585852411, 616128445, -1712732504, -1603074894, 214860434, 1250066599, -1222185896, 1776351084}, 22 - View.MeasureSpec.getMode(0), objArr16);
                    Class<?> cls4 = Class.forName((String) objArr16[0]);
                    Object[] objArr17 = new Object[1];
                    c(new int[]{2057709008, -2029097016, -1436380259, -1886821162, -533458645, -1301335134, -1698757854, -337642736, 818973105, 1163414575}, 16 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr17);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char defaultSize = (char) (View.getDefaultSize(0, 0) + 31533);
                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 922;
                        int i13 = 29 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                        byte[] bArr6 = $$a;
                        byte b8 = bArr6[80];
                        byte b9 = bArr6[37];
                        Object[] objArr18 = new Object[1];
                        a(b8, b9, b9, objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(defaultSize, iIndexOf, i13, -778300370, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c = (char) (31533 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                        int threadPriority = 921 - ((Process.getThreadPriority(0) + 20) >> 6);
                        int iGreen = Color.green(0) + 28;
                        byte[] bArr7 = $$a;
                        Object[] objArr19 = new Object[1];
                        a((byte) 52, bArr7[80], bArr7[37], objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, threadPriority, iGreen, -1048449946, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr14;
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
        int i14 = ((int[]) objArr[1])[0];
        int i15 = ((int[]) objArr[3])[0];
        if (i15 == i14) {
            int i16 = ((int[]) objArr[0])[0];
            objArr2 = new Object[]{new int[]{i ^ (i << 5)}, new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int i17 = ~i;
            int i18 = i16 + 1053551265 + (((~((-1411282207) | i17)) | (~((-362797438) | i))) * (-370)) + (((~(i17 | (-362797438))) | (~((-1411282207) | i)) | (-1436548480)) * (-370)) + 1053007104;
            int i19 = (i18 << 13) ^ i18;
            int i20 = i19 ^ (i19 >>> 17);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                int i21 = TuitionPaymentFragmentbindingInflater1 + 29;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i21 % 128;
                int i22 = 2;
                int i23 = i21 % 2;
                int i24 = 0;
                while (i24 < strArr.length) {
                    int i25 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 121;
                    TuitionPaymentFragmentbindingInflater1 = i25 % 128;
                    int i26 = i25 % i22;
                    arrayList.add(strArr[i24]);
                    i24++;
                    i22 = 2;
                }
            }
            int[] iArr = new int[i15];
            int i27 = i15 - 1;
            iArr[i27] = 1;
            Toast.makeText((Context) null, iArr[((i15 * i27) % 2) - 1], 1).show();
            int i28 = ((int[]) objArr[0])[0];
            objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iMyUid = Process.myUid();
            int i29 = ~iMyUid;
            int i30 = i28 + (-720528378) + ((1073458843 | i29) * (-369)) + (((~((-701735044) | i29)) | 1072344600) * (-369)) + (((~(iMyUid | 701735043)) | 371723800 | (~(i29 | (-1114244)))) * 369);
            int i31 = (i30 << 13) ^ i30;
            int i32 = i31 ^ (i31 >>> 17);
            ((int[]) objArr2[0])[0] = i32 ^ (i32 << 5);
        }
        if (i != 0 && i != 1) {
            int i33 = ((int[]) objArr2[0])[0];
            int i34 = ((i33 * i33) - (~(-(690764268 * i33)))) - 1;
            int i35 = -(i33 * 284304868);
            int i36 = (i34 ^ i35) + ((i35 & i34) << 1);
            int i37 = ((i36 | 908526144) << 1) - (908526144 ^ i36);
            int i38 = i37 >> 23;
            int i39 = ((i38 & (-1023)) + (i38 | (-1023))) / 512;
            int i40 = (i39 & 1) + (i39 | 1);
            int i41 = (i37 & i40) + (i40 | i37);
            int i42 = i37 >> 28;
            int i43 = ((i42 & (-31)) + (i42 | (-31))) / 16;
            int i44 = -(((i43 & 1) + (i43 | 1)) ^ i41);
            int i45 = (i44 ^ 8) + ((i44 & 8) << 1);
            int i46 = i45 >> 28;
            int i47 = ((i46 & (-31)) + (i46 | (-31))) / 16;
            int i48 = (i47 & 1) + (i47 | 1);
            if (i != 9408 / (((-((i48 ^ 1) + ((i48 & 1) << 1))) & i45) * 588) && i != 3 && i != 4) {
                return false;
            }
        }
        return true;
    }

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        zza = new zzaee();
        int i = b + 67;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private zzaee() {
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new int[]{1238881258, 1547292418, -615263424, -46184034, 2087278845, -879698068, 1117343288, 1112901437, 634799530, -1510681394, 1528324366, 1286139212, -1157402789, 198282142, -1074006661, -1021529542, -1478419887, -506505174};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r5, int r6, byte r7) {
        /*
            int r5 = r5 * 3
            int r0 = r5 + 1
            int r7 = r7 * 56
            int r7 = 122 - r7
            int r6 = r6 * 4
            int r6 = 4 - r6
            byte[] r1 = com.google.android.libraries.places.internal.zzaee.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L16
            r4 = r5
            r3 = r2
            goto L26
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r5) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L22:
            int r3 = r3 + 1
            r4 = r1[r6]
        L26:
            int r6 = r6 + 1
            int r7 = r7 + r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzaee.$$g(short, int, byte):java.lang.String");
    }
}
