package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.schedulers.RxThreadFactory;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes4.dex */
public final class getInputChannelCountRanges extends appendBackupVideoProfile {
    static final RxThreadFactory TuitionPaymentFragmentbindingInflater1;
    static final TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2 = false;
    private static RxThreadFactory asBinder;
    private static TuitionPaymentFragmentspecialinlinedviewModeldefault1 g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ThreadFactory f945a;
    private AtomicReference<TuitionPaymentFragmentspecialinlinedviewModeldefault1> d;
    private static final TimeUnit asInterface = TimeUnit.SECONDS;
    private static final long TuitionPaymentFragmentspecialinlinedviewModeldefault3 = Long.getLong("rx2.io-keep-alive-time", 60).longValue();

    static {
        TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = new TuitionPaymentFragmentbindingInflater1(new RxThreadFactory("RxCachedThreadSchedulerShutdown"));
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentbindingInflater1;
        tuitionPaymentFragmentbindingInflater1.dispose();
        int iMax = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        RxThreadFactory rxThreadFactory = new RxThreadFactory("RxCachedThreadScheduler", iMax);
        asBinder = rxThreadFactory;
        TuitionPaymentFragmentbindingInflater1 = new RxThreadFactory("RxCachedWorkerPoolEvictor", iMax);
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = Boolean.getBoolean("rx2.io-scheduled-release");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = new TuitionPaymentFragmentspecialinlinedviewModeldefault1(0L, null, rxThreadFactory);
        g = tuitionPaymentFragmentspecialinlinedviewModeldefault1;
        tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements Runnable {
        private static int $10 = 0;
        private static int $11 = 1;
        final ThreadFactory TuitionPaymentFragmentbindingInflater1;
        final ConcurrentLinkedQueue<TuitionPaymentFragmentbindingInflater1> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private final ScheduledExecutorService TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        final acquireBuffer TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        final long b;
        private final Future<?> d;
        private static final byte[] $$d = {27, -8, 5, 78, -16, -2, 59, -61, -12, -4, 4, -9, 3, 51, -55, -17, 6, -18, -1, 2, 1, 50, -67, 8, -23, 11, -17, 5, 4, -15, 58, -57, -16, -1, -7, -7, 64, -75, -3, 7, -7, -1, -15, 7, 0, -18, 65, -35, -24, -23, 11, -17, 5, 4, -15, 36, -57, 7, 9, -16, 0, 2, 28, -48, -1, -7, -7, -5, 75, -4, -37, -55, 0, 11, -17, 0, 9, -15, 21, -42, 7, -10, 8, -1, -19, 7, 2, 19, -25, -16, 7, -6, -1, 44, -9, 1, -37, 8, -15, 7, -10, -3, 26, -21, -28, 8, 4, -13, -10, 42, -48, 13, -10, -10, 4, -13, -10, -3, -1, 7, -2, -10, 4, -15, -1, -9, -2, -1, -9, 5, -3, -22, 9, 0, -22, 38, -38, 7, -5, -11, 4, -5, -5, 1, -24, 5, -12, 62};
        private static final int $$e = 123;
        private static final byte[] $$a = {49, 84, -120, 101, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
        private static final int $$b = 209;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f946a = 0;
        private static int g = 1;
        private static long asInterface = -4283916005584395647L;

        /* JADX WARN: Code duplicated, block: B:10:0x0026  */
        /* JADX WARN: Code duplicated, block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(byte r6, short r7, int r8, java.lang.Object[] r9) {
            /*
                int r7 = r7 * 52
                int r7 = r7 + 4
                byte[] r0 = getInputChannelCountRanges.TuitionPaymentFragmentspecialinlinedviewModeldefault1.$$a
                int r1 = 53 - r8
                int r6 = r6 * 14
                int r6 = 98 - r6
                byte[] r1 = new byte[r1]
                int r8 = 52 - r8
                r2 = 0
                if (r0 != 0) goto L16
                r3 = r7
                r4 = r2
                goto L2b
            L16:
                r3 = r2
            L17:
                byte r4 = (byte) r6
                r1[r3] = r4
                int r4 = r3 + 1
                if (r3 != r8) goto L26
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L26:
                r3 = r0[r7]
                r5 = r3
                r3 = r7
                r7 = r5
            L2b:
                int r6 = r6 + r7
                int r6 = r6 + (-10)
                int r7 = r3 + 1
                r3 = r4
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: getInputChannelCountRanges.TuitionPaymentFragmentspecialinlinedviewModeldefault1.c(byte, short, int, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0027  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002f). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void f(short r6, short r7, byte r8, java.lang.Object[] r9) {
            /*
                int r6 = r6 * 40
                int r6 = 93 - r6
                byte[] r0 = getInputChannelCountRanges.TuitionPaymentFragmentspecialinlinedviewModeldefault1.$$d
                int r7 = r7 + 4
                int r8 = r8 * 15
                int r8 = 99 - r8
                byte[] r1 = new byte[r6]
                r2 = 0
                if (r0 != 0) goto L14
                r3 = r7
                r4 = r2
                goto L2f
            L14:
                r3 = r2
                r5 = r8
                r8 = r7
                r7 = r5
            L18:
                byte r4 = (byte) r7
                r1[r3] = r4
                int r3 = r3 + 1
                if (r3 != r6) goto L27
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L27:
                int r8 = r8 + 1
                r4 = r0[r8]
                r5 = r3
                r3 = r8
                r8 = r4
                r4 = r5
            L2f:
                int r8 = -r8
                int r7 = r7 + r8
                int r7 = r7 + (-4)
                r8 = r3
                r3 = r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: getInputChannelCountRanges.TuitionPaymentFragmentspecialinlinedviewModeldefault1.f(short, short, byte, java.lang.Object[]):void");
        }

        private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
            getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
            int length = cArr.length;
            long[] jArr = new long[length];
            getrealtimecapturelatency.b = 0;
            int i3 = $10 + 27;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            while (getrealtimecapturelatency.b < cArr.length) {
                int i5 = $11 + 11;
                $10 = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = getrealtimecapturelatency.b;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ExpandableListView.getPackedPositionType(0L) + 19472), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2623, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 13, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                        }
                        jArr[i6] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() * asInterface * 9053247990562531611L;
                        Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (39422 - TextUtils.getOffsetAfter("", 0)), 482 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), TextUtils.lastIndexOf("", '0', 0, 0) + 38, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    int i7 = getrealtimecapturelatency.b;
                    Object[] objArr4 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (MotionEvent.axisFromString("") + 19473), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2623, 13 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i7] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).longValue() ^ (asInterface ^ 9053247990562531611L);
                    Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TextUtils.indexOf("", "", 0, 0) + 39422), Gravity.getAbsoluteGravity(0, 0) + 481, 37 - (KeyEvent.getMaxKeyCode() >> 16), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                }
            }
            char[] cArr2 = new char[length];
            getrealtimecapturelatency.b = 0;
            while (getrealtimecapturelatency.b < cArr.length) {
                int i8 = $11 + 63;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                Object[] objArr6 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (TextUtils.lastIndexOf("", '0') + 39423), 481 - View.resolveSize(0, 0), ((byte) KeyEvent.getModifierMetaStateMask()) + 38, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
            }
            objArr[0] = new String(cArr2);
        }

        TuitionPaymentFragmentspecialinlinedviewModeldefault1(long j, TimeUnit timeUnit, ThreadFactory threadFactory) {
            long nanos;
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool;
            ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay;
            if (timeUnit != null) {
                nanos = timeUnit.toNanos(j);
            } else {
                int i = f946a + 115;
                g = i % 128;
                if (i % 2 == 0) {
                    int i2 = 2 % 5;
                } else {
                    int i3 = 2 % 2;
                }
                nanos = 0;
            }
            long j2 = nanos;
            this.b = j2;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new ConcurrentLinkedQueue<>();
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new acquireBuffer();
            this.TuitionPaymentFragmentbindingInflater1 = threadFactory;
            if (timeUnit != null) {
                int i4 = g + 119;
                f946a = i4 % 128;
                int i5 = i4 % 2;
                scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, getInputChannelCountRanges.TuitionPaymentFragmentbindingInflater1);
                scheduledFutureScheduleWithFixedDelay = scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(this, j2, j2, TimeUnit.NANOSECONDS);
                int i6 = 2 % 2;
            } else {
                scheduledExecutorServiceNewScheduledThreadPool = null;
                scheduledFutureScheduleWithFixedDelay = null;
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = scheduledExecutorServiceNewScheduledThreadPool;
            this.d = scheduledFutureScheduleWithFixedDelay;
        }

        @Override // java.lang.Runnable
        public final void run() throws Throwable {
            int i = 2 % 2;
            int i2 = g + 7;
            f946a = i2 % 128;
            if (i2 % 2 != 0) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.isEmpty();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.isEmpty()) {
                return;
            }
            int i3 = g + 23;
            f946a = i3 % 128;
            int i4 = i3 % 2;
            long jTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            for (TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 : this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                if (tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 > jTuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                    return;
                }
                if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.remove(tuitionPaymentFragmentbindingInflater1)) {
                    int i5 = f946a + 79;
                    g = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 62 / 0;
                        if (!(!this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(tuitionPaymentFragmentbindingInflater1))) {
                            tuitionPaymentFragmentbindingInflater1.dispose();
                        }
                    } else if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(tuitionPaymentFragmentbindingInflater1)) {
                        tuitionPaymentFragmentbindingInflater1.dispose();
                    }
                }
            }
        }

        final long TuitionPaymentFragmentspecialinlinedviewModeldefault1() throws Throwable {
            Object[] objArr;
            int i = 2 % 2;
            int i2 = g + 109;
            f946a = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char cIndexOf = (char) (31533 - TextUtils.indexOf("", "", 0));
                int bitsPerPixel = 920 - ImageFormat.getBitsPerPixel(0);
                int i4 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 27;
                byte b = $$a[80];
                byte b2 = b;
                Object[] objArr2 = new Object[1];
                c(b, b2, (byte) (b2 | 52), objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, bitsPerPixel, i4, -1048449946, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            e(new char[]{35835, 2171, 36064, 325, 34249, 6712, 40612, 4957, 38797, 11246, 43042, 11500, 41303, 9642, 47676, 16030, 45831, 14246, 52216, 18536, 52437, 16714}, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 33680, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            e(new char[]{35839, 797, 39469, 4395, 43077, 10088, 48764, 13733, 52391, 23480, 53976, 27127, 57591, 30744, 63269}, 35051 - View.MeasureSpec.getSize(0), objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cAlpha = (char) (Color.alpha(0) + 31533);
                int i5 = 921 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 28;
                byte[] bArr = $$a;
                byte b3 = bArr[37];
                byte b4 = bArr[80];
                Object[] objArr5 = new Object[1];
                c(b3, b4, b4, objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cAlpha, i5, edgeSlop, -778300370, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char maxKeyCode = (char) (31533 - (KeyEvent.getMaxKeyCode() >> 16));
                    int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 921;
                    int capsMode = TextUtils.getCapsMode("", 0, 0) + 28;
                    byte[] bArr2 = $$a;
                    byte b5 = bArr2[37];
                    Object[] objArr6 = new Object[1];
                    c(b5, b5, bArr2[33], objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(maxKeyCode, windowTouchSlop, capsMode, -1142834547, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
                int iIdentityHashCode = System.identityHashCode(this);
                int i6 = (((635273406 + ((~((~iIdentityHashCode) | (-9784833))) * 433)) + (((~((-925401176) | iIdentityHashCode)) | (-848678469)) * (-433))) + (((~(iIdentityHashCode | (-848678469))) | (-935186008)) * 433)) - 808084901;
                int i7 = (i6 << 13) ^ i6;
                int i8 = i7 ^ (i7 >>> 17);
                ((int[]) objArr[0])[0] = i8 ^ (i8 << 5);
            } else {
                Object[] objArr8 = new Object[1];
                e(new char[]{35835, 65505, 25556, 55255, 23457, 53146, 13184, 42791, 11091, 40791, 824, 30547, 64295, 28392, 53960, 18120, 51900, 16022, 41620, 5740, 39530, 3659, 29222, 58908, 27139, 56819}, 29717 - TextUtils.getTrimmedLength(""), objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                e(new char[]{35833, 3314, 34258, 7871, 38795, 10341, 41280, 14864, 45826, 19439, 52436, 17868, 56997, 22402, 59512, 24896, 64037, 29465}, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 34589, objArr9);
                Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                if (applicationContext != null) {
                    if ((!(applicationContext instanceof ContextWrapper)) || ((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = applicationContext.getApplicationContext();
                        int i9 = f946a + 31;
                        g = i9 % 128;
                        int i10 = i9 % 2;
                    } else {
                        applicationContext = null;
                    }
                }
                Object[] objArr10 = new Object[1];
                e(new char[]{35824, 3404, 34434, 8158, 37224, 10853, 41905, 9461, 48709, 14299, 51439, 16958, 56189, 23717, 54781, 28494}, (ViewConfiguration.getTouchSlop() >> 8) + 34487, objArr10);
                Class<?> cls3 = Class.forName((String) objArr10[0]);
                Object[] objArr11 = new Object[1];
                e(new char[]{35827, 28701, 31801, 30813, 25698, 24732, 27836, 26838, 21706, 20736, 23863, 22835, 17789, 16754, 19860, 18866}, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 64483, objArr11);
                try {
                    Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, -808084901};
                    byte[] bArr3 = $$d;
                    byte b6 = bArr3[44];
                    Object[] objArr13 = new Object[1];
                    f(b6, bArr3[18], b6, objArr13);
                    Class<?> cls4 = Class.forName((String) objArr13[0]);
                    byte b7 = bArr3[20];
                    byte b8 = b7;
                    Object[] objArr14 = new Object[1];
                    f(b8, (byte) (b8 | 90), b7, objArr14);
                    Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char windowTouchSlop2 = (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 31533);
                        int i11 = 920 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                        int iIndexOf = 27 - TextUtils.indexOf((CharSequence) "", '0');
                        byte[] bArr4 = $$a;
                        byte b9 = bArr4[37];
                        Object[] objArr16 = new Object[1];
                        c(b9, b9, bArr4[33], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(windowTouchSlop2, i11, iIndexOf, -1142834547, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                    try {
                        Object[] objArr17 = new Object[1];
                        e(new char[]{35835, 2171, 36064, 325, 34249, 6712, 40612, 4957, 38797, 11246, 43042, 11500, 41303, 9642, 47676, 16030, 45831, 14246, 52216, 18536, 52437, 16714}, (ViewConfiguration.getFadingEdgeLength() >> 16) + 33679, objArr17);
                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        e(new char[]{35839, 797, 39469, 4395, 43077, 10088, 48764, 13733, 52391, 23480, 53976, 27127, 57591, 30744, 63269}, 35051 - TextUtils.indexOf("", "", 0, 0), objArr18);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char pressedStateDuration = (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 31533);
                            int tapTimeout = 921 - (ViewConfiguration.getTapTimeout() >> 16);
                            int i12 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 28;
                            byte[] bArr5 = $$a;
                            byte b10 = bArr5[37];
                            byte b11 = bArr5[80];
                            Object[] objArr19 = new Object[1];
                            c(b10, b11, b11, objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(pressedStateDuration, tapTimeout, i12, -778300370, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char packedPositionChild = (char) (31532 - ExpandableListView.getPackedPositionChild(0L));
                            int iResolveSizeAndState = 921 - View.resolveSizeAndState(0, 0, 0);
                            int longPressTimeout = 28 - (ViewConfiguration.getLongPressTimeout() >> 16);
                            byte b12 = $$a[80];
                            byte b13 = b12;
                            Object[] objArr20 = new Object[1];
                            c(b12, b13, (byte) (b13 | 52), objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(packedPositionChild, iResolveSizeAndState, longPressTimeout, -1048449946, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        objArr = objArr15;
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
            int i13 = ((int[]) objArr[1])[0];
            int i14 = ((int[]) objArr[3])[0];
            if (i14 != i13) {
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) objArr[4];
                if (strArr != null) {
                    for (String str : strArr) {
                        int i15 = f946a + 73;
                        g = i15 % 128;
                        int i16 = i15 % 2;
                        arrayList.add(str);
                    }
                }
                throw new RuntimeException(String.valueOf(i14));
            }
            int i17 = ((int[]) objArr[0])[0];
            Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i18 = ~((-549211068) | iIdentityHashCode2);
            int i19 = ~iIdentityHashCode2;
            int i20 = i17 + 865047539 + ((i18 | (~(1224868576 | i19))) * (-1808)) + (((~((-673) | iIdentityHashCode2)) | (~(i19 | 1774078971))) * TypedValues.Custom.TYPE_BOOLEAN) + (((~(iIdentityHashCode2 | (-1224868577))) | 549210395 | (~(549211067 | i19))) * TypedValues.Custom.TYPE_BOOLEAN);
            int i21 = (i20 << 13) ^ i20;
            int i22 = i21 ^ (i21 >>> 17);
            ((int[]) objArr21[0])[0] = i22 ^ (i22 << 5);
            return System.nanoTime();
        }

        final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            int i = 2 % 2;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.dispose();
            Future<?> future = this.d;
            if (future != null) {
                int i2 = f946a + 93;
                g = i2 % 128;
                if (i2 % 2 == 0) {
                    future.cancel(false);
                } else {
                    future.cancel(true);
                }
            }
            ScheduledExecutorService scheduledExecutorService = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (scheduledExecutorService != null) {
                int i3 = f946a + 39;
                g = i3 % 128;
                int i4 = i3 % 2;
                scheduledExecutorService.shutdownNow();
            }
        }
    }

    static final class b extends appendBackupVideoProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements Runnable {
        private final TuitionPaymentFragmentspecialinlinedviewModeldefault1 TuitionPaymentFragmentbindingInflater1;
        private AtomicBoolean TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new AtomicBoolean();
        private final acquireBuffer TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new acquireBuffer();
        private final TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private static final byte[] $$c = {114, -115, 48, 84};
        private static final int $$f = 84;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {64, 73, -26, 82, 9, -5, -66, 54, 5, -3, -11, 2, -10, -58, 60, -4, -4, -5, 8, -73, 50, 9, -5, -3, -1, -4, -67, 66, -18, 4, -5, 2, 3, -18, 10, -7, -16, 8, -65, 73, -3, -20, 30, -15, 8, -14, 3, -4, -33, 14, 21, -15, -11, 6, 3, -49, 41, -20, 3, 3, -11, 6, 3, -4, -6, -14, -5, 3, -11, 8, -6, 2, -5, -6, 2, -12, -4, 15, -16, -7, 15, -45, 31, -14, -2, 4, -11, -2, -2, -8, 17, -12, 5, -68};
        private static final int $$e = 17;
        private static final byte[] $$a = {86, -48, ByteCompanionObject.MIN_VALUE, 88, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
        private static final int $$b = 118;
        private static int asBinder = 0;
        private static int d = 1;
        private static int b = -83722478;

        /* JADX WARN: Code duplicated, block: B:10:0x0025  */
        /* JADX WARN: Code duplicated, block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0029). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(short r6, short r7, byte r8, java.lang.Object[] r9) {
            /*
                byte[] r0 = getInputChannelCountRanges.b.$$a
                int r6 = r6 + 4
                int r7 = r7 * 15
                int r7 = r7 + 38
                int r8 = r8 * 4
                int r8 = 84 - r8
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L15
                r3 = r8
                r5 = r2
                r8 = r7
                goto L29
            L15:
                r3 = r2
            L16:
                byte r4 = (byte) r8
                int r5 = r3 + 1
                r1[r3] = r4
                if (r5 != r7) goto L25
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L25:
                int r6 = r6 + 1
                r3 = r0[r6]
            L29:
                int r8 = r8 + r3
                int r8 = r8 + (-11)
                r3 = r5
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: getInputChannelCountRanges.b.a(short, short, byte, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0027  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void e(int r5, short r6, byte r7, java.lang.Object[] r8) {
            /*
                int r5 = r5 * 15
                int r5 = 99 - r5
                int r6 = r6 * 14
                int r6 = 53 - r6
                byte[] r0 = getInputChannelCountRanges.b.$$d
                int r7 = r7 * 38
                int r7 = r7 + 4
                byte[] r1 = new byte[r6]
                r2 = 0
                if (r0 != 0) goto L17
                r5 = r6
                r4 = r7
                r3 = r2
                goto L29
            L17:
                r3 = r2
            L18:
                byte r4 = (byte) r5
                r1[r3] = r4
                int r3 = r3 + 1
                if (r3 != r6) goto L27
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                r8[r2] = r5
                return
            L27:
                r4 = r0[r7]
            L29:
                int r7 = r7 + 1
                int r5 = r5 + r4
                int r5 = r5 + 3
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: getInputChannelCountRanges.b.e(int, short, byte, java.lang.Object[]):void");
        }

        private static void c(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
            int i4 = 2 % 2;
            setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
            char[] cArr2 = new char[i2];
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                int i5 = $10 + 67;
                $11 = i5 % 128;
                int i6 = i5 % 2;
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                int i7 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(b)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getScrollBarSize() >> 8), 3291 - TextUtils.getTrimmedLength(""), (ViewConfiguration.getTapTimeout() >> 16) + 31, 1199271174, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr2[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 651 - (ViewConfiguration.getWindowTouchSlop() >> 8), MotionEvent.axisFromString("") + 45, -450685997, false, $$g(b4, b5, (byte) (b5 - 1)), new Class[]{Object.class, Object.class});
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
            if (i3 > 0) {
                setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
                char[] cArr3 = new char[i2];
                System.arraycopy(cArr2, 0, cArr3, 0, i2);
                System.arraycopy(cArr3, 0, cArr2, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
                System.arraycopy(cArr3, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr2, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            }
            if (z) {
                char[] cArr4 = new char[i2];
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                int i8 = $10 + 123;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                    int i10 = $10 + 73;
                    $11 = i10 % 128;
                    if (i10 % 2 == 0) {
                        cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + i2) >> 1];
                        Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = (byte) (b6 + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), ((Process.getThreadPriority(0) + 20) >> 6) + 651, ExpandableListView.getPackedPositionType(0L) + 44, -450685997, false, $$g(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    } else {
                        cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                        Object[] objArr5 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b8 = (byte) 0;
                            byte b9 = (byte) (b8 + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), TextUtils.getTrimmedLength("") + 651, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 44, -450685997, false, $$g(b8, b9, (byte) (b9 - 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                    }
                }
                cArr2 = cArr4;
            }
            objArr[0] = new String(cArr2);
        }

        b(TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1;
            TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater2;
            this.TuitionPaymentFragmentbindingInflater1 = tuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (!tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.isDisposed()) {
                while (true) {
                    if (!tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.isEmpty()) {
                        tuitionPaymentFragmentbindingInflater1 = tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.poll();
                        if (tuitionPaymentFragmentbindingInflater1 != null) {
                            int i = asBinder + 57;
                            d = i % 128;
                            if (i % 2 != 0) {
                                break;
                            } else {
                                throw null;
                            }
                        }
                    } else {
                        tuitionPaymentFragmentbindingInflater1 = new TuitionPaymentFragmentbindingInflater1(tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1);
                        tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(tuitionPaymentFragmentbindingInflater1);
                        break;
                    }
                }
                int i2 = 2 % 2;
                tuitionPaymentFragmentbindingInflater2 = tuitionPaymentFragmentbindingInflater1;
            } else {
                tuitionPaymentFragmentbindingInflater2 = getInputChannelCountRanges.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = tuitionPaymentFragmentbindingInflater2;
            int i3 = d + 87;
            asBinder = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 96 / 0;
            }
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            int i = 2 % 2;
            int i2 = d + 97;
            asBinder = i2 % 128;
            if (i2 % 2 != 0) {
                if (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.compareAndSet(false, true)) {
                    return;
                }
            } else if (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.compareAndSet(false, true)) {
                return;
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.dispose();
            if (getInputChannelCountRanges.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, 0L, TimeUnit.NANOSECONDS, (hasMatchedVideoProfileForDynamicRange) null);
                return;
            }
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.TuitionPaymentFragmentbindingInflater1;
            TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1() + tuitionPaymentFragmentspecialinlinedviewModeldefault1.b;
            tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.offer(tuitionPaymentFragmentbindingInflater1);
            int i3 = d + 103;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i = 2 % 2;
            int i2 = d + 17;
            asBinder = i2 % 128;
            if (i2 % 2 != 0) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.TuitionPaymentFragmentbindingInflater1;
                TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1() | tuitionPaymentFragmentspecialinlinedviewModeldefault1.b;
                tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.offer(tuitionPaymentFragmentbindingInflater1);
            } else {
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.TuitionPaymentFragmentbindingInflater1;
                TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                tuitionPaymentFragmentbindingInflater2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1() + tuitionPaymentFragmentspecialinlinedviewModeldefault2.b;
                tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.offer(tuitionPaymentFragmentbindingInflater2);
            }
            int i3 = asBinder + 105;
            d = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            int i = 2 % 2;
            int i2 = d + 87;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            AtomicBoolean atomicBoolean = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (i3 == 0) {
                return atomicBoolean.get();
            }
            atomicBoolean.get();
            throw null;
        }

        @Override // appendBackupVideoProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault3
        public final BufferProviderState TuitionPaymentFragmentbindingInflater1(Runnable runnable, long j, TimeUnit timeUnit) throws Throwable {
            Object[] objArr;
            char c = 2;
            int i = 2 % 2;
            int i2 = asBinder + 13;
            d = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0'));
                int iAlpha = 876 - Color.alpha(0);
                int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 10;
                byte[] bArr = $$a;
                byte b2 = bArr[5];
                byte b3 = bArr[7];
                Object[] objArr2 = new Object[1];
                a(b2, b3, b3, objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, iAlpha, maximumDrawingCacheSize, -1650998592, false, (String) objArr2[0], null);
            }
            long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            c(true, 210 - TextUtils.lastIndexOf("", '0'), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 21, TextUtils.getCapsMode("", 0, 0) + 15, new char[]{17, 16, 22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534, '\b', 0, '\f', '\t', 65504, '\n', 2}, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c(true, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 215, 15 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 13 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), new char[]{2, '\r', 5, 65530, 65534, 65515, 65533, 65534, '\f', '\t', 65530, 5, 65534, 65534, 6}, objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cIndexOf2 = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1);
                int iResolveOpacity = 876 - Drawable.resolveOpacity(0, 0);
                int i4 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 10;
                byte b4 = (byte) ($$b & 173);
                byte[] bArr2 = $$a;
                Object[] objArr5 = new Object[1];
                a(b4, bArr2[28], bArr2[7], objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf2, iResolveOpacity, i4, 2012020043, false, (String) objArr5[0], null);
            }
            if (j2 == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                int i5 = d + 91;
                asBinder = i5 % 128;
                int i6 = i5 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char cBlue = (char) Color.blue(0);
                    int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 876;
                    int i7 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 10;
                    byte[] bArr3 = $$a;
                    Object[] objArr6 = new Object[1];
                    a(bArr3[3], bArr3[28], bArr3[7], objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cBlue, minimumFlingVelocity, i7, 2012931276, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
                int iIdentityHashCode = System.identityHashCode(this);
                int i8 = ~iIdentityHashCode;
                int i9 = (-621273100) + (((~((-42420233) | i8)) | (~((-743441797) | iIdentityHashCode)) | (~(787972031 | iIdentityHashCode))) * 765) + (((~((-785862029) | i8)) | 42420232) * 1530) + (((~(iIdentityHashCode | (-785862029))) | (~(i8 | 787972031))) * 765) + 209492976;
                int i10 = (i9 << 13) ^ i9;
                int i11 = i10 ^ (i10 >>> 17);
                ((int[]) objArr[1])[0] = i11 ^ (i11 << 5);
            } else {
                Object[] objArr8 = new Object[1];
                c(true, 211 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0') + 27, 12 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), new char[]{65483, '\r', '\r', 65534, 65483, 1, 6, '\f', 15, 1, 11, 65534, 1, 65534, 2, 15, 5, 65521, 22, 17, 6, 19, 6, 17, 0, 65502}, objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                c(true, View.resolveSize(0, 0) + 218, (Process.myPid() >> 22) + 18, 15 - ExpandableListView.getPackedPositionGroup(0L), new char[]{'\n', 65527, 65529, 65535, 2, 6, 6, 65495, '\n', 4, 65531, '\b', '\b', 11, 65529, 4, 5, 65535}, objArr9);
                Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                if (applicationContext != null) {
                    applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
                }
                Object[] objArr10 = new Object[1];
                c(true, (Process.myPid() >> 22) + 210, TextUtils.indexOf("", "", 0, 0) + 16, Color.red(0) + 10, new char[]{65484, 5, '\f', 65535, '\n', 65484, 65535, 20, 65535, '\b', 11, 3, 18, 17, 23, 65521}, objArr10);
                Class<?> cls3 = Class.forName((String) objArr10[0]);
                Object[] objArr11 = new Object[1];
                c(false, AndroidCharacter.getMirror('0') + 166, KeyEvent.getDeadChar(0, 0) + 16, (Process.myTid() >> 22) + 13, new char[]{'\b', 14, 3, 14, 19, 65506, 65531, '\r', 2, 65501, '\t', 65534, 65535, 3, 65534, 65535}, objArr11);
                int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
                int i12 = asBinder + 73;
                int i13 = i12 % 128;
                d = i13;
                int i14 = i12 % 2;
                int i15 = i13 + 119;
                asBinder = i15 % 128;
                int i16 = i15 % 2;
                try {
                    Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, 209492976};
                    byte[] bArr4 = $$d;
                    byte b5 = bArr4[24];
                    byte b6 = (byte) (b5 + 1);
                    byte b7 = (byte) (-b5);
                    Object[] objArr13 = new Object[1];
                    e(b6, b7, (byte) (b7 - 1), objArr13);
                    Class<?> cls4 = Class.forName((String) objArr13[0]);
                    byte b8 = bArr4[24];
                    byte b9 = (byte) (-b8);
                    Object[] objArr14 = new Object[1];
                    e(b9, (byte) (b9 - 1), (byte) (-b8), objArr14);
                    Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                    if (applicationContext != null) {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char c2 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                            int jumpTapTimeout = 876 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                            int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 10;
                            byte[] bArr5 = $$a;
                            Object[] objArr16 = new Object[1];
                            a(bArr5[3], bArr5[28], bArr5[7], objArr16);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, jumpTapTimeout, packedPositionGroup, 2012931276, false, (String) objArr16[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                        try {
                            Object[] objArr17 = new Object[1];
                            c(true, 211 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 21, Color.red(0) + 15, new char[]{17, 16, 22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534, '\b', 0, '\f', '\t', 65504, '\n', 2}, objArr17);
                            Class<?> cls5 = Class.forName((String) objArr17[0]);
                            Object[] objArr18 = new Object[1];
                            c(true, 215 - TextUtils.indexOf("", "", 0), 14 - TextUtils.lastIndexOf("", '0', 0), 13 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), new char[]{2, '\r', 5, 65530, 65534, 65515, 65533, 65534, '\f', '\t', 65530, 5, 65534, 65534, 6}, objArr18);
                            long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char c3 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                int modifierMetaStateMask = 875 - ((byte) KeyEvent.getModifierMetaStateMask());
                                int keyRepeatTimeout = 10 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                byte b10 = (byte) ($$b & 173);
                                byte[] bArr6 = $$a;
                                Object[] objArr19 = new Object[1];
                                a(b10, bArr6[28], bArr6[7], objArr19);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c3, modifierMetaStateMask, keyRepeatTimeout, 2012020043, false, (String) objArr19[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
                                int iMyPid = 876 - (Process.myPid() >> 22);
                                int iRed = Color.red(0) + 10;
                                byte[] bArr7 = $$a;
                                byte b11 = bArr7[5];
                                byte b12 = bArr7[7];
                                Object[] objArr20 = new Object[1];
                                a(b11, b12, b12, objArr20);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(maxKeyCode, iMyPid, iRed, -1650998592, false, (String) objArr20[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                            int i17 = d + 65;
                            asBinder = i17 % 128;
                            int i18 = i17 % 2;
                        } catch (Exception unused) {
                            throw new RuntimeException();
                        }
                    }
                    objArr = objArr15;
                    c = 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            if (((int[]) objArr[0])[0] != ((int[]) objArr[c])[0]) {
                throw null;
            }
            int i19 = ((int[]) objArr[1])[0];
            Object[] objArr21 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i20 = i19 + ((((~(385871727 | iIdentityHashCode2)) | 275187008) * 449) - 806773052) + (((~((~iIdentityHashCode2) | 385871727)) | 275187008) * 449);
            int i21 = (i20 << 13) ^ i20;
            int i22 = i21 ^ (i21 >>> 17);
            ((int[]) objArr21[1])[0] = i22 ^ (i22 << 5);
            if (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.isDisposed()) {
                return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(runnable, j, timeUnit, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
            int i23 = d + 103;
            asBinder = i23 % 128;
            if (i23 % 2 == 0) {
                return EmptyDisposable.INSTANCE;
            }
            EmptyDisposable emptyDisposable = EmptyDisposable.INSTANCE;
            throw null;
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
        private static java.lang.String $$g(byte r5, byte r6, int r7) {
            /*
                int r6 = 120 - r6
                int r7 = r7 * 4
                int r0 = r7 + 1
                int r5 = r5 * 3
                int r5 = 3 - r5
                byte[] r1 = getInputChannelCountRanges.b.$$c
                byte[] r0 = new byte[r0]
                r2 = 0
                if (r1 != 0) goto L15
                r4 = r6
                r6 = r7
                r3 = r2
                goto L27
            L15:
                r3 = r2
            L16:
                int r5 = r5 + 1
                byte r4 = (byte) r6
                r0[r3] = r4
                if (r3 != r7) goto L23
                java.lang.String r5 = new java.lang.String
                r5.<init>(r0, r2)
                return r5
            L23:
                int r3 = r3 + 1
                r4 = r1[r5]
            L27:
                int r6 = r6 + r4
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: getInputChannelCountRanges.b.$$g(byte, byte, int):java.lang.String");
        }
    }

    public getInputChannelCountRanges() {
        this(asBinder);
    }

    private getInputChannelCountRanges(ThreadFactory threadFactory) {
        this.f945a = threadFactory;
        this.d = new AtomicReference<>(g);
        TuitionPaymentFragmentspecialinlinedviewModeldefault3();
    }

    @Override // defpackage.appendBackupVideoProfile
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = new TuitionPaymentFragmentspecialinlinedviewModeldefault1(TuitionPaymentFragmentspecialinlinedviewModeldefault3, asInterface, this.f945a);
        if (PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.d, g, tuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
            return;
        }
        tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
    }

    @Override // defpackage.appendBackupVideoProfile
    public final appendBackupVideoProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return new b(this.d.get());
    }

    public static final class TuitionPaymentFragmentbindingInflater1 extends registerAudioRecordingCallback {
        public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        public static int b;
        long TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        TuitionPaymentFragmentbindingInflater1(ThreadFactory threadFactory) {
            super(threadFactory);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0L;
        }

        public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            int i = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i2 = i % 8103524;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i + 1;
            if (i2 != 0) {
                return b;
            }
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            b = iElapsedRealtime;
            return iElapsedRealtime;
        }
    }
}
