package com.bpjstku.util.liveness.model;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.firebase.analytics.FirebaseAnalytics;
import defpackage.initSession;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÇ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000e\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0013\u0010\tR\u001a\u0010\u0014\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\tR\u001a\u0010\u0017\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/bpjstku/util/liveness/model/DataPassive;", "", "", "p0", "", "p1", "<init>", "(Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "copy", "(Ljava/lang/String;Z)Lcom/bpjstku/util/liveness/model/DataPassive;", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", FirebaseAnalytics.Param.SCORE, "Ljava/lang/String;", "getScore", "passed", "Z", "getPassed"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class DataPassive {
    public static final int $stable = 0;
    private static int TuitionPaymentFragmentbindingInflater1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static char[] b;
    private final boolean passed;
    private final String score;
    private static final byte[] $$c = {53, -70, 9, -72};
    private static final int $$f = 63;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {119, -102, -34, -3, -9, -18, 31, -44, 0, -20, 32, -41, -23, -3, -24, 6, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$e = 149;
    private static final byte[] $$a = {53, -70, 9, -72, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = 19;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int g = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.bpjstku.util.liveness.model.DataPassive.$$a
            int r7 = r7 * 3
            int r7 = 84 - r7
            int r6 = r6 * 15
            int r6 = 53 - r6
            int r8 = 93 - r8
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r6
            r7 = r8
            r4 = r2
            goto L27
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            r3 = r0[r8]
        L27:
            int r8 = r8 + 1
            int r7 = r7 + r3
            int r7 = r7 + (-11)
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.util.liveness.model.DataPassive.a(byte, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(int r7, int r8, int r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.bpjstku.util.liveness.model.DataPassive.$$d
            int r7 = r7 * 40
            int r7 = r7 + 13
            int r8 = r8 * 32
            int r8 = 116 - r8
            int r9 = r9 * 12
            int r9 = r9 + 4
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r7
            r8 = r9
            r5 = r2
            goto L2c
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L27:
            r3 = r0[r9]
            r6 = r9
            r9 = r8
            r8 = r6
        L2c:
            int r3 = -r3
            int r9 = r9 + r3
            int r8 = r8 + 1
            int r9 = r9 + (-11)
            r3 = r5
            r6 = r9
            r9 = r8
            r8 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.util.liveness.model.DataPassive.d(int, int, int, java.lang.Object[]):void");
    }

    public DataPassive(String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.score = str;
        this.passed = z;
    }

    private static void c(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i4 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            try {
                Object[] objArr2 = {Integer.valueOf(b[i + i4])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = (byte) (b2 + 2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), View.getDefaultSize(0, 0) + 2187, TextUtils.getOffsetBefore("", 0) + 40, 841711447, false, $$g(b2, b3, (byte) (b3 - 3)), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2), Integer.valueOf(c)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (33017 - Color.argb(0, 0, 0, 0)), TextUtils.lastIndexOf("", '0') + 3012, TextUtils.indexOf("", "") + 26, 321985076, false, $$g(b4, b5, (byte) (b5 - 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i4] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (Process.getGidForName("") + 36506), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 3376, (ViewConfiguration.getTapTimeout() >> 16) + 17, -968507904, false, $$g(b6, b7, (byte) (-b7)), new Class[]{Object.class, Object.class});
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
            int i5 = $11 + 99;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
            Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                byte b8 = (byte) 0;
                byte b9 = (byte) (b8 + 1);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (36505 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 3376 - Drawable.resolveOpacity(0, 0), 17 - (ViewConfiguration.getJumpTapTimeout() >> 16), -968507904, false, $$g(b8, b9, (byte) (-b9)), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr);
        int i7 = $11 + 41;
        $10 = i7 % 128;
        int i8 = i7 % 2;
    }

    public final String getScore() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 89;
        g = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char offsetAfter = (char) TextUtils.getOffsetAfter("", 0);
            int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 876;
            int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 11;
            byte[] bArr = $$a;
            byte b2 = bArr[28];
            byte b3 = bArr[7];
            Object[] objArr2 = new Object[1];
            a(b2, b3, (byte) (b3 | 89), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(offsetAfter, packedPositionType, modifierMetaStateMask, -1650998592, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 22 - View.MeasureSpec.getSize(0), (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 52592), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 22, 14 - ImageFormat.getBitsPerPixel(0), (char) View.getDefaultSize(0, 0), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
            int iResolveOpacity = 876 - Drawable.resolveOpacity(0, 0);
            int minimumFlingVelocity2 = 10 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
            byte b4 = $$a[7];
            byte b5 = b4;
            Object[] objArr5 = new Object[1];
            a(b4, b5, (byte) (b5 | 52), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(minimumFlingVelocity, iResolveOpacity, minimumFlingVelocity2, 2012020043, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
                int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 876;
                int pressedStateDuration = 10 - (ViewConfiguration.getPressedStateDuration() >> 16);
                byte b6 = $$a[7];
                byte b7 = b6;
                Object[] objArr6 = new Object[1];
                a(b6, b7, b7, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(tapTimeout, scrollBarFadeDuration, pressedStateDuration, 2012931276, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int iNextInt = new Random().nextInt();
            int i4 = ~iNextInt;
            int i5 = ((((-219778240) + (((~(988985668 | i4)) | 1029295897) * 226)) + (((~(i4 | 1073479517)) | ((~((-1029295898) | iNextInt)) | 944802048)) * (-113))) + ((~(iNextInt | 988985668)) * 113)) - 8443638;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArr[1])[0] = i7 ^ (i7 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 37, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 26, (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 47034), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 64, 17 - ExpandableListView.getPackedPositionChild(0L), (char) View.MeasureSpec.makeMeasureSpec(0, 0), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) {
                    int i8 = g + 93;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i8 % 128;
                    if (i8 % 2 != 0) {
                        int i9 = 4 / 3;
                    }
                    applicationContext = null;
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                }
            }
            Object[] objArr10 = new Object[1];
            c(81 - (KeyEvent.getMaxKeyCode() >> 16), 16 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (39138 - TextUtils.lastIndexOf("", '0', 0)), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c((ViewConfiguration.getKeyRepeatDelay() >> 16) + 97, 16 - TextUtils.indexOf("", ""), (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 11717), objArr11);
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, -8443638};
                byte[] bArr2 = $$d;
                byte b8 = bArr2[8];
                byte b9 = b8;
                Object[] objArr13 = new Object[1];
                d(b8, b9, b9, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b10 = bArr2[17];
                byte b11 = b10;
                Object[] objArr14 = new Object[1];
                d(b10, b11, b11, objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                        int scrollBarFadeDuration2 = 876 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        int i10 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 10;
                        byte b12 = $$a[7];
                        byte b13 = b12;
                        Object[] objArr16 = new Object[1];
                        a(b12, b13, b13, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cCombineMeasuredStates, scrollBarFadeDuration2, i10, 2012931276, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                    try {
                        Object[] objArr17 = new Object[1];
                        c(Drawable.resolveOpacity(0, 0), 22 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (52592 - Color.red(0)), objArr17);
                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        c(23 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), Color.red(0) + 15, (char) (Process.getGidForName("") + 1), objArr18);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char mode = (char) View.MeasureSpec.getMode(0);
                            int iAxisFromString = 875 - MotionEvent.axisFromString("");
                            int i11 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 9;
                            byte b14 = $$a[7];
                            byte b15 = b14;
                            Object[] objArr19 = new Object[1];
                            a(b14, b15, (byte) (b15 | 52), objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(mode, iAxisFromString, i11, 2012020043, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char c = (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                            int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 876;
                            int i12 = 11 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                            byte[] bArr3 = $$a;
                            byte b16 = bArr3[28];
                            byte b17 = bArr3[7];
                            Object[] objArr20 = new Object[1];
                            a(b16, b17, (byte) (b17 | 89), objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, windowTouchSlop, i12, -1650998592, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 11;
                        g = i13 % 128;
                        int i14 = i13 % 2;
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr15;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        if (((int[]) objArr[0])[0] != ((int[]) objArr[2])[0]) {
            throw null;
        }
        int i15 = ((int[]) objArr[1])[0];
        Object[] objArr21 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        int i16 = i15 + (((~((-748841462) | iMaxMemory)) | 673333280) * (-283)) + 1615067444 + ((~(iMaxMemory | (-75508182))) * 283);
        int i17 = (i16 << 13) ^ i16;
        int i18 = i17 ^ (i17 >>> 17);
        ((int[]) objArr21[1])[0] = i18 ^ (i18 << 5);
        int i19 = g + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i19 % 128;
        int i20 = i19 % 2;
        return this.score;
    }

    public final boolean getPassed() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.passed;
        int i5 = i2 + 119;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }

    static {
        TuitionPaymentFragmentbindingInflater1 = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 117;
        TuitionPaymentFragmentbindingInflater1 = i % 128;
        if (i % 2 != 0) {
            int i2 = 47 / 0;
        }
    }

    public static /* synthetic */ DataPassive copy$default(DataPassive dataPassive, String str, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = g + 83;
        int i4 = i3 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            str = dataPassive.score;
        }
        if ((i & 2) != 0) {
            int i6 = i4 + 77;
            g = i6 % 128;
            if (i6 % 2 == 0) {
                boolean z2 = dataPassive.passed;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            z = dataPassive.passed;
        }
        return dataPassive.copy(str, z);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = g + 89;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.score;
        int i4 = i3 + 5;
        g = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final boolean component2() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        boolean z = this.passed;
        int i4 = i2 + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 95 / 0;
        }
        return z;
    }

    public final DataPassive copy(String p0, boolean p1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        DataPassive dataPassive = new DataPassive(p0, p1);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 3;
        g = i2 % 128;
        int i3 = i2 % 2;
        return dataPassive;
    }

    public final boolean equals(Object p0) {
        int i = 2 % 2;
        if (this == p0) {
            int i2 = g + 37;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            return i2 % 2 == 0;
        }
        if (p0 instanceof DataPassive) {
            DataPassive dataPassive = (DataPassive) p0;
            return Intrinsics.areEqual(this.score, dataPassive.score) && this.passed == dataPassive.passed;
        }
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 17;
        g = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    public final int hashCode() {
        int iHashCode;
        boolean z;
        int i = 2 % 2;
        int i2 = g + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            iHashCode = this.score.hashCode() * 108;
            z = this.passed;
        } else {
            iHashCode = this.score.hashCode() * 31;
            z = this.passed;
        }
        int iHashCode2 = iHashCode + Boolean.hashCode(z);
        int i3 = g + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 == 0) {
            return iHashCode2;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = this.score;
        boolean z = this.passed;
        StringBuilder sb = new StringBuilder("DataPassive(score=");
        sb.append(str);
        sb.append(", passed=");
        sb.append(z);
        sb.append(")");
        String string = sb.toString();
        int i2 = g + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        b = new char[]{31885, 1277, 35958, 5603, 40319, 9982, 44658, 14267, 49019, 16616, 51252, 20938, 55649, 25324, 60010, 29688, 64369, 31936, 1134, 36334, 5475, 40684, 45561, 51599, 16643, 55441, 20499, 60290, 25346, 64183, 29185, 36234, 1286, 40093, 5121, 44930, 9995, 1606, 32310, 63165, 28456, 59316, 23605, 54457, 19824, 50622, 14880, 45729, 11132, 41874, 6199, 37025, 2367, 33185, 1569, 32445, 63283, 28575, 58404, 23743, 54571, 19886, 49700, 45567, 51606, 16656, 55443, 20485, 60297, 25362, 64164, 29204, 36251, 1286, 40064, 5131, 44942, 10010, 48772, 13827, 45469, 10517, 20833, 55799, 16483, 51373, 29544, 64484, 25192, 60128, 5414, 40410, 1139, 36088, 14200, 49128, 9827, 39987, 58433, 27841, 62793, 32210, 50760, 20180, 55130, 24554, 41036, 10463, 45383, 14829, 33350, 2764, 37710};
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -2764568301817706013L;
    }

    private static String $$g(byte b2, byte b3, short s) {
        byte[] bArr = $$c;
        int i = b2 * 4;
        int i2 = s + 4;
        int i3 = 115 - (b3 * 3);
        byte[] bArr2 = new byte[i + 1];
        int i4 = -1;
        if (bArr == null) {
            i3 += i2;
            i4 = -1;
        }
        while (true) {
            int i5 = i2;
            int i6 = i3;
            int i7 = i4 + 1;
            int i8 = i5 + 1;
            bArr2[i7] = (byte) i6;
            if (i7 == i) {
                return new String(bArr2, 0);
            }
            i2 = i8;
            i3 = bArr[i8] + i6;
            i4 = i7;
        }
    }
}
