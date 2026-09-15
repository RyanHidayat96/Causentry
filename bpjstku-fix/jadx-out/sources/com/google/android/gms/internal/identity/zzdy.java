package com.google.android.gms.internal.identity;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.location.Location;
import android.media.AudioTrack;
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
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.location.zzy;
import defpackage.initSession;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Random;

/* JADX INFO: loaded from: classes6.dex */
final class zzdy extends zzy {
    private final zzdr zza;
    private static final byte[] $$c = {114, -59, 10, 31};
    private static final int $$f = 119;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {108, -26, -110, 50, 22, 8, -53, 67, 18, 10, 2, 15, 3, -45, 67, 22, 6, 9, -54, 69, 15, 16, -5, 23, 6, -3, 21, -52, 62, 17, 15, 0, -44, 48, 47, 1, -1, -26, 45, 7, 25, 14, -5, 23, 11, -69, 25, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -57};
    private static final int $$e = 90;
    private static final byte[] $$a = {87, 51, -85, 78, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$b = 111;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
    private static char[] b = {13178, 32311, 43515, 54447, 1660, 45368, 64755, 12283, 22884, 33850, 14241, 25246, 44154, 57138, 2803, 46496, 59222, 4666, 24019, 34962, 14928, 25882, 45561, 64690, 11129, 22058, 34023, 13235, 32372, 44288, 56297, 1711, 46436, 57406, 12013, 23979, 34917, 24190, 4915, 50431, 47531, 27512, 56380, 37367, 17151, 13422, 59709, 23291, 4071, 49478, 45606, 26615, 55464, 35401, 32532, 12495, 58752, 22371, 2077, 64961, 44692, 24654, 54537, 45567, 64683, 11114, 22056, 34033, 13240, 32356, 44307, 56316, 1726, 46436, 57379, 12007, 23975, 34932, 14123, 26067, 37008, 45558, 64703, 11118, 22075, 33978, 13242, 32369, 44348, 56299, 1760, 46427, 57395, 12023, 23986, 34917, 14127, 45557, 64698, 11133, 22068, 34016, 13247, 32356, 44331, 56260, 1711, 46459, 57378, 11975, 23977, 34916, 14119};
    private static long TuitionPaymentFragmentbindingInflater1 = 5370964975759195358L;

    zzdy(zzdr zzdrVar) {
        this.zza = zzdrVar;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 52
            int r6 = r6 + 1
            int r8 = 103 - r8
            byte[] r0 = com.google.android.gms.internal.identity.zzdy.$$a
            int r7 = r7 * 52
            int r7 = r7 + 4
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r6
            goto L27
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            r3 = r0[r7]
        L27:
            int r8 = r8 + r3
            int r8 = r8 + (-11)
            int r7 = r7 + 1
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.identity.zzdy.a(byte, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(short r5, short r6, short r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 43
            int r6 = 47 - r6
            byte[] r0 = com.google.android.gms.internal.identity.zzdy.$$d
            int r7 = r7 * 15
            int r7 = 99 - r7
            int r5 = r5 * 9
            int r1 = 53 - r5
            byte[] r1 = new byte[r1]
            int r5 = 52 - r5
            r2 = 0
            if (r0 != 0) goto L18
            r3 = r5
            r4 = r2
            goto L2a
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r5) goto L28
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L28:
            r3 = r0[r6]
        L2a:
            int r7 = r7 + r3
            int r7 = r7 + (-10)
            int r6 = r6 + 1
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.identity.zzdy.d(short, short, short, java.lang.Object[]):void");
    }

    final zzdy zzc(ListenerHolder listenerHolder) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        this.zza.zzb(listenerHolder);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return this;
    }

    private static void c(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        int i4 = $11 + 103;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i6 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            try {
                Object[] objArr2 = {Integer.valueOf(b[i + i6])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) Color.green(0), 2187 - (ViewConfiguration.getLongPressTimeout() >> 16), TextUtils.getTrimmedLength("") + 40, 841711447, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(TuitionPaymentFragmentbindingInflater1), Integer.valueOf(c)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char capsMode = (char) (TextUtils.getCapsMode("", 0, 0) + 33017);
                    int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 3011;
                    int mode = 26 - View.MeasureSpec.getMode(0);
                    byte b4 = (byte) ($$f & 10);
                    byte b5 = (byte) (b4 - 2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(capsMode, maximumFlingVelocity, mode, 321985076, false, $$g(b4, b5, b5), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char defaultSize = (char) (36505 - View.getDefaultSize(0, 0));
                    int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 3376;
                    int iAlpha = 17 - Color.alpha(0);
                    byte b6 = (byte) ($$f & 1);
                    byte b7 = (byte) (b6 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(defaultSize, fadingEdgeLength, iAlpha, -968507904, false, $$g(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
            Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                char cArgb = (char) (36505 - Color.argb(0, 0, 0, 0));
                int iLastIndexOf = 3375 - TextUtils.lastIndexOf("", '0');
                int iIndexOf = 17 - TextUtils.indexOf("", "", 0);
                byte b8 = (byte) ($$f & 1);
                byte b9 = (byte) (b8 - 1);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cArgb, iLastIndexOf, iIndexOf, -968507904, false, $$g(b8, b9, b9), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr);
        int i7 = $11 + 51;
        $10 = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    final void zzf() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 23;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        this.zza.zza().clear();
        if (i3 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x021a  */
    @Override // com.google.android.gms.location.zzz
    public final void zzd(Location location) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
            int i2 = 876 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
            int iAlpha = 10 - Color.alpha(0);
            byte b2 = $$a[7];
            byte b3 = b2;
            Object[] objArr2 = new Object[1];
            a(b2, b3, (byte) (b3 + 5), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(touchSlop, i2, iAlpha, 252381699, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c((-1) - ImageFormat.getBitsPerPixel(0), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 22, (char) (33416 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(22 - (ViewConfiguration.getScrollBarSize() >> 8), 15 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) Color.alpha(0), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            int iAlpha2 = Color.alpha(0) + 876;
            int tapTimeout = 10 - (ViewConfiguration.getTapTimeout() >> 16);
            byte[] bArr = $$a;
            Object[] objArr5 = new Object[1];
            a((byte) (-bArr[5]), bArr[7], bArr[54], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, iAlpha2, tapTimeout, 2009631821, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cResolveSize = (char) View.resolveSize(0, 0);
                int i3 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 876;
                int size = View.MeasureSpec.getSize(0) + 10;
                byte[] bArr2 = $$a;
                byte b4 = bArr2[7];
                Object[] objArr6 = new Object[1];
                a(b4, (byte) (-bArr2[5]), b4, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cResolveSize, i3, size, 256017550, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i4 = ((572784152 + (((~((-42407465) | (~iIdentityHashCode))) | 2097235) * (-591))) + ((iIdentityHashCode | (-42407465)) * 591)) - 2046448037;
            int i5 = (i4 << 13) ^ i4;
            int i6 = i5 ^ (i5 >>> 17);
            ((int[]) objArr[1])[0] = i6 ^ (i6 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c(37 - Gravity.getAbsoluteGravity(0, 0), View.resolveSize(0, 0) + 26, (char) (61315 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(63 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 18 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) TextUtils.getCapsMode("", 0, 0), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 109;
                int i8 = i7 % 128;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i8;
                int i9 = i7 % 2;
                if (applicationContext instanceof ContextWrapper) {
                    int i10 = i8 + 79;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i10 % 128;
                    int i11 = i10 % 2;
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
            c((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 81, 15 - ExpandableListView.getPackedPositionChild(0L), (char) ((-1) - MotionEvent.axisFromString("")), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(97 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 15 - MotionEvent.axisFromString(""), (char) ((-1) - MotionEvent.axisFromString("")), objArr11);
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), -2046448037};
                byte[] bArr3 = $$d;
                byte b5 = bArr3[35];
                Object[] objArr13 = new Object[1];
                d(b5, b5, bArr3[31], objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b6 = bArr3[31];
                Object[] objArr14 = new Object[1];
                d(b6, b6, bArr3[35], objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 125;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i12 % 128;
                    int i13 = i12 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
                        int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 876;
                        int edgeSlop = 10 - (ViewConfiguration.getEdgeSlop() >> 16);
                        byte[] bArr4 = $$a;
                        byte b7 = bArr4[7];
                        Object[] objArr16 = new Object[1];
                        a(b7, (byte) (-bArr4[5]), b7, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(maxKeyCode, doubleTapTimeout, edgeSlop, 256017550, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                    try {
                        Object[] objArr17 = new Object[1];
                        c((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1, 22 - View.resolveSize(0, 0), (char) (33415 - View.resolveSize(0, 0)), objArr17);
                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        c(TextUtils.getOffsetAfter("", 0) + 22, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 15, (char) (TextUtils.lastIndexOf("", '0') + 1), objArr18);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cMyPid = (char) (Process.myPid() >> 22);
                            int maxKeyCode2 = (KeyEvent.getMaxKeyCode() >> 16) + 876;
                            int offsetBefore = TextUtils.getOffsetBefore("", 0) + 10;
                            byte[] bArr5 = $$a;
                            Object[] objArr19 = new Object[1];
                            a((byte) (-bArr5[5]), bArr5[7], bArr5[54], objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cMyPid, maxKeyCode2, offsetBefore, 2009631821, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0'));
                            int maxKeyCode3 = 876 - (KeyEvent.getMaxKeyCode() >> 16);
                            int iArgb = Color.argb(0, 0, 0, 0) + 10;
                            byte b8 = $$a[7];
                            byte b9 = b8;
                            Object[] objArr20 = new Object[1];
                            a(b8, b9, (byte) (b9 + 5), objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf, maxKeyCode3, iArgb, 252381699, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr15;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i14 = ((int[]) objArr[2])[0];
        int i15 = ((int[]) objArr[0])[0];
        if (i15 != i14) {
            throw new RuntimeException(String.valueOf(i15));
        }
        int i16 = ((int[]) objArr[1])[0];
        Object[] objArr21 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
        int iNextInt = new Random().nextInt(1036229655);
        int i17 = ~((-480772829) | (~iNextInt));
        int i18 = i16 + (((-518582240) | i17 | (~(480772828 | iNextInt))) * (-338)) + 853172244 + (((~(iNextInt | (-37809412))) | i17) * 338);
        int i19 = (i18 << 13) ^ i18;
        int i20 = i19 ^ (i19 >>> 17);
        ((int[]) objArr21[1])[0] = i20 ^ (i20 << 5);
        this.zza.zza().notifyListener(new zzdw(this, location));
    }

    @Override // com.google.android.gms.location.zzz
    public final void zze() {
        int i = 2 % 2;
        this.zza.zza().notifyListener(new zzdx(this));
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 5;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
    }

    final /* synthetic */ zzdr zzg() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 57;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        int i4 = i2 % 2;
        zzdr zzdrVar = this.zza;
        int i5 = i3 + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return zzdrVar;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r7, short r8, short r9) {
        /*
            int r8 = r8 * 2
            int r8 = r8 + 4
            int r7 = r7 * 3
            int r7 = r7 + 109
            byte[] r0 = com.google.android.gms.internal.identity.zzdy.$$c
            int r9 = r9 * 3
            int r9 = r9 + 1
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L17
            r7 = r8
            r3 = r9
            r5 = r2
            goto L2d
        L17:
            r3 = r2
        L18:
            r6 = r8
            r8 = r7
            r7 = r6
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L28
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L28:
            r3 = r0[r7]
            r6 = r8
            r8 = r7
            r7 = r6
        L2d:
            int r3 = -r3
            int r8 = r8 + 1
            int r7 = r7 + r3
            r3 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.identity.zzdy.$$g(short, short, short):java.lang.String");
    }
}
