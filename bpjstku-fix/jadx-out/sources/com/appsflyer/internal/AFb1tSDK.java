package com.appsflyer.internal;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.graphics.Color;
import android.media.AudioTrack;
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
import com.appsflyer.AFLogger;
import defpackage.initSession;
import defpackage.onCaptureSessionEnd;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class AFb1tSDK<T> {
    public final FutureTask<T> AFAdRevenueData = new FutureTask<>(new Callable<T>() { // from class: com.appsflyer.internal.AFb1tSDK.5
        @Override // java.util.concurrent.Callable
        public final T call() {
            if (AFb1tSDK.this.getMediationNetwork()) {
                return (T) AFb1tSDK.this.getCurrencyIso4217Code();
            }
            return null;
        }
    });
    public final Context getCurrencyIso4217Code;
    public final String getMediationNetwork;
    private final String[] getMonetizationNetwork;
    public final Executor getRevenue;
    private static final byte[] $$l = {58, 66, -14, -31};
    private static final int $$m = 116;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {84, 10, 24, -102, 40, 13, 8, 11, -5, 9, -3, 24, 7, -23, 44, 27, -1, 23, -3, 21, 15, -43, 47, 20, 7, 6, -1, 34, -34, 44, -1, 11, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55};
    private static final int $$k = 198;
    private static final byte[] $$d = {86, -48, ByteCompanionObject.MIN_VALUE, 88, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$e = 127;
    private static int b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f369a = 1;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 63987;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 43837;
    private static char TuitionPaymentFragmentbindingInflater1 = 62964;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 59667;

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(short r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = 103 - r7
            int r6 = r6 * 52
            int r6 = r6 + 4
            byte[] r0 = com.appsflyer.internal.AFb1tSDK.$$d
            int r8 = r8 * 52
            int r8 = 53 - r8
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r7
            r7 = r8
            r4 = r2
            goto L27
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            r3 = r0[r6]
        L27:
            int r7 = r7 + r3
            int r6 = r6 + 1
            int r7 = r7 + (-11)
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1tSDK.f(short, int, short, java.lang.Object[]):void");
    }

    private static void i(byte b2, short s, byte b3, Object[] objArr) {
        int i = 31 - (b2 * 28);
        byte[] bArr = $$j;
        int i2 = 84 - (s * 4);
        int i3 = b3 * 24;
        byte[] bArr2 = new byte[i3 + 29];
        int i4 = i3 + 28;
        int i5 = -1;
        if (bArr == null) {
            i5 = -1;
            i2 = (i4 + i) - 10;
            i = i;
        }
        while (true) {
            int i6 = i5 + 1;
            bArr2[i6] = (byte) i2;
            if (i6 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i7 = i + 1;
            i5 = i6;
            i2 = (i2 + bArr[i7]) - 10;
            i = i7;
        }
    }

    protected abstract T getCurrencyIso4217Code();

    public AFb1tSDK(Context context, Executor executor, String str, String... strArr) {
        this.getCurrencyIso4217Code = context;
        this.getMediationNetwork = str;
        this.getMonetizationNetwork = strArr;
        this.getRevenue = executor;
    }

    private static void h(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        while (true) {
            char c = 0;
            if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i);
                return;
            }
            cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
            int i3 = $11 + 125;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 58224;
            int i6 = 0;
            while (i6 < 16) {
                char c2 = cArr3[1];
                char c3 = cArr3[c];
                int i7 = (c3 + i5) ^ ((c3 << 4) + ((char) (((long) TuitionPaymentFragmentbindingInflater1) ^ 8611973335120459638L)));
                int i8 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    objArr2[2] = Integer.valueOf(i8);
                    objArr2[1] = Integer.valueOf(i7);
                    objArr2[c] = Integer.valueOf(c2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char cAxisFromString = (char) (47772 - MotionEvent.axisFromString(""));
                        int i9 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 467;
                        int maxKeyCode = 13 - (KeyEvent.getMaxKeyCode() >> 16);
                        Class[] clsArr = new Class[4];
                        clsArr[c] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cAxisFromString, i9, maxKeyCode, -2007001706, false, "o", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    int i10 = i6;
                    Object[] objArr3 = {Integer.valueOf(cArr3[c]), Integer.valueOf((cCharValue + i5) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47772 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 468, View.MeasureSpec.getMode(0) + 13, -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i5 -= 40503;
                    i6 = i10 + 1;
                    int i11 = $10 + 37;
                    $11 = i11 % 128;
                    int i12 = i11 % 2;
                    c = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr3[1] ^ cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1]);
            Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                byte b2 = (byte) 0;
                byte b3 = b2;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 2323 - View.resolveSize(0, 0), ExpandableListView.getPackedPositionType(0L) + 44, -1312321721, false, $$n(b2, b3, b3), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x04b0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:52:0x04b1  */
    public T getMonetizationNetwork() throws Throwable {
        Object[] objArr;
        int i;
        int i2 = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cResolveSize = (char) View.resolveSize(0, 0);
            int iResolveSizeAndState = 876 - View.resolveSizeAndState(0, 0, 0);
            int offsetAfter = TextUtils.getOffsetAfter("", 0) + 10;
            byte[] bArr = $$d;
            byte b2 = bArr[7];
            Object[] objArr2 = new Object[1];
            f(b2, (byte) (b2 + 5), (byte) (-bArr[5]), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cResolveSize, iResolveSizeAndState, offsetAfter, 252381699, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        h(new char[]{61141, 55523, 40757, 61450, 5172, 38278, 25937, 49549, 5261, 61707, 21381, 58520, 61607, 15386, 3547, 34323, 40148, 53200, 33711, 23626, 51232, 58114, 59478, 43823}, 21 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        h(new char[]{9483, 50289, 16290, 7292, 55647, 64868, 57139, 10421, 58984, 33685, 46381, 9599, 55744, 58031, 15818, 33149, 17854, 43210}, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 15, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char size = (char) View.MeasureSpec.getSize(0);
            int modifierMetaStateMask = 875 - ((byte) KeyEvent.getModifierMetaStateMask());
            int fadingEdgeLength = 10 - (ViewConfiguration.getFadingEdgeLength() >> 16);
            byte[] bArr2 = $$d;
            byte b3 = bArr2[7];
            Object[] objArr5 = new Object[1];
            f(b3, bArr2[54], b3, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(size, modifierMetaStateMask, fadingEdgeLength, 2009631821, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c = (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                int i3 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 876;
                int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 10;
                byte[] bArr3 = $$d;
                byte b4 = bArr3[5];
                Object[] objArr6 = new Object[1];
                f((byte) (-b4), bArr3[7], (byte) (-b4), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, i3, iNormalizeMetaState, 256017550, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int i4 = ~(System.identityHashCode(this) | (-452795891));
            int i5 = ((((-536690680) | i4) * (-196)) - 1335357408) + ((i4 | 83894789) * 196) + 126862572;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArr[1])[0] = i7 ^ (i7 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            h(new char[]{30571, 38513, 28236, 37859, 40629, 15294, 16852, 59401, 29477, 43906, 63091, 16150, 50575, 61416, 8816, 57713, 51220, 52140, 34479, 51835, 29981, 10287, 46508, 11741, 53614, 37151, 10536, 58236}, MotionEvent.axisFromString("") + 27, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            h(new char[]{11880, 29322, 42014, 30036, 14009, 36560, 24680, 39811, 33825, 13596, 3490, 42901, 63880, 20895, 58924, 10717, 20332, 57812, 40539, 14916}, 18 - Color.argb(0, 0, 0, 0), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            h(new char[]{52169, 36814, 31906, 1658, 37774, 21339, 61060, 47172, 6689, 51312, 45959, 36826, 54421, 21284, 25049, 21415, 30773, 63522}, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 16, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            h(new char[]{24041, 49616, 60945, 19421, 5576, 29957, 36566, 20816, 53466, 11657, 35742, 1622, 16002, 45034, 57659, 35389, 15778, 44973}, (ViewConfiguration.getScrollBarSize() >> 8) + 16, objArr11);
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 126862572};
                byte[] bArr4 = $$j;
                byte b5 = bArr4[65];
                byte b6 = (byte) (b5 - 1);
                Object[] objArr13 = new Object[1];
                i(b5, b6, b6, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b7 = bArr4[65];
                byte b8 = (byte) (b7 - 1);
                Object[] objArr14 = new Object[1];
                i(b8, b8, b7, objArr14);
                objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cBlue = (char) Color.blue(0);
                        int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 876;
                        int i8 = 11 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                        byte[] bArr5 = $$d;
                        byte b9 = bArr5[5];
                        Object[] objArr15 = new Object[1];
                        f((byte) (-b9), bArr5[7], (byte) (-b9), objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cBlue, scrollBarFadeDuration, i8, 256017550, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr16 = new Object[1];
                        h(new char[]{61141, 55523, 40757, 61450, 5172, 38278, 25937, 49549, 5261, 61707, 21381, 58520, 61607, 15386, 3547, 34323, 40148, 53200, 33711, 23626, 51232, 58114, 59478, 43823}, 21 - TextUtils.lastIndexOf("", '0'), objArr16);
                        Class<?> cls5 = Class.forName((String) objArr16[0]);
                        Object[] objArr17 = new Object[1];
                        h(new char[]{9483, 50289, 16290, 7292, 55647, 64868, 57139, 10421, 58984, 33685, 46381, 9599, 55744, 58031, 15818, 33149, 17854, 43210}, TextUtils.getCapsMode("", 0, 0) + 15, objArr17);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char c2 = (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                            int i9 = 876 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                            int offsetAfter2 = 10 - TextUtils.getOffsetAfter("", 0);
                            byte[] bArr6 = $$d;
                            byte b10 = bArr6[7];
                            Object[] objArr18 = new Object[1];
                            f(b10, bArr6[54], b10, objArr18);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c2, i9, offsetAfter2, 2009631821, false, (String) objArr18[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cMyTid = (char) (Process.myTid() >> 22);
                            int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 876;
                            int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 10;
                            byte[] bArr7 = $$d;
                            byte b11 = bArr7[7];
                            Object[] objArr19 = new Object[1];
                            f(b11, (byte) (b11 + 5), (byte) (-bArr7[5]), objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cMyTid, maximumFlingVelocity, keyRepeatTimeout, 252381699, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
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
        int i10 = b + 71;
        f369a = i10 % 128;
        int i11 = i10 % 2;
        int i12 = ((int[]) objArr[1])[0];
        Object[] objArr20 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
        int iIdentityHashCode = System.identityHashCode(this);
        int i13 = (~((-694809876) | iIdentityHashCode)) | 141107201;
        int i14 = i12 + 1521273620 + (i13 * 992) + ((i13 | (~((~iIdentityHashCode) | (-100796973)))) * (-496)) + ((iIdentityHashCode | (-654499647)) * 496);
        int i15 = (i14 << 13) ^ i14;
        int i16 = i15 ^ (i15 >>> 17);
        Object obj = objArr20[1];
        ((int[]) obj)[0] = i16 ^ (i16 << 5);
        int i17 = f369a + 57;
        b = i17 % 128;
        int i18 = i17 % 2;
        try {
            FutureTask<T> futureTask = this.AFAdRevenueData;
            int i19 = ((int[]) obj)[0];
            int i20 = ((((i19 * i19) - (~(-(1108084285 * i19)))) - 1) - (~(-(i19 * (-373120157))))) - 1;
            int i21 = (i20 & 1266231552) + (1266231552 | i20);
            int i22 = i21 >> 16;
            int i23 = ((((-131071) | i22) << 1) - (i22 ^ (-131071))) / 65536;
            int i24 = (i21 - (~((i23 & 1) + (i23 | 1)))) - 1;
            int i25 = ((i21 >> 21) - 4095) / 2048;
            int i26 = -(i24 ^ (((i25 | 1) << 1) - (i25 ^ 1)));
            int i27 = (i26 & 5) + (i26 | 5);
            int i28 = i27 >> 27;
            int i29 = ((i28 & (-63)) + (i28 | (-63))) / 32;
            int i30 = (i29 ^ 1) + ((i29 & 1) << 1);
            return futureTask.get(((long) (129375 / (((-(((i30 | 1) << 1) - (i30 ^ 1))) & i27) * 207))) + 375, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e2) {
            e = e2;
            AFLogger.afErrorLog(e.getMessage(), e, false, true);
            i = f369a + 23;
            b = i % 128;
            if (i % 2 == 0) {
                return null;
            }
            throw null;
        } catch (ExecutionException e3) {
            e = e3;
            AFLogger.afErrorLog(e.getMessage(), e, false, true);
            i = f369a + 23;
            b = i % 128;
            if (i % 2 == 0) {
                return null;
            }
            throw null;
        } catch (TimeoutException e4) {
            AFLogger.afErrorLog(e4.getMessage(), e4, false, false);
            return null;
        }
    }

    public final boolean getMediationNetwork() {
        int i = 2 % 2;
        int i2 = b + 75;
        f369a = i2 % 128;
        int i3 = i2 % 2;
        try {
            ProviderInfo providerInfoResolveContentProvider = this.getCurrencyIso4217Code.getPackageManager().resolveContentProvider(this.getMediationNetwork, 128);
            return (providerInfoResolveContentProvider == null || (Arrays.asList(this.getMonetizationNetwork).contains(AFj1iSDK.N_(this.getCurrencyIso4217Code.getPackageManager(), ((PackageItemInfo) providerInfoResolveContentProvider).packageName)) ^ true)) ? false : true;
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException | CertificateException e2) {
            AFLogger.afErrorLog(e2.getMessage(), e2, false, true);
            int i4 = f369a + 79;
            b = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$n(short r5, byte r6, byte r7) {
        /*
            int r7 = r7 * 4
            int r7 = 4 - r7
            int r5 = r5 * 2
            int r0 = r5 + 1
            int r6 = r6 * 2
            int r6 = 108 - r6
            byte[] r1 = com.appsflyer.internal.AFb1tSDK.$$l
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L17
            r6 = r5
            r4 = r7
            r3 = r2
            goto L27
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r5) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L23:
            int r3 = r3 + 1
            r4 = r1[r7]
        L27:
            int r7 = r7 + 1
            int r4 = -r4
            int r6 = r6 + r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1tSDK.$$n(short, byte, byte):java.lang.String");
    }
}
