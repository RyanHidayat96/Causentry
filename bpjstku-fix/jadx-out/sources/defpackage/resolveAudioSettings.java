package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\bÀ\u0002\u0018\u00002\u00020\u00012\u00060\u0003j\u0002`\u0002B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u001c\u001a\u00020\u001d2\n\u0010\u001e\u001a\u00060\u0003j\u0002`\u0002H\u0016¢\u0006\u0002\u0010\u001fJ\u0018\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020#H\u0014J\b\u0010$\u001a\u00020\u001dH\u0002J\b\u0010%\u001a\u00020\u001dH\u0016J)\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\t2\n\u0010)\u001a\u00060\u0003j\u0002`\u00022\u0006\u0010*\u001a\u00020+H\u0016¢\u0006\u0002\u0010,J\b\u0010-\u001a\u00020\u001dH\u0016J\b\u0010.\u001a\u00020\fH\u0002J\r\u0010/\u001a\u00020\u001dH\u0000¢\u0006\u0002\b0J\b\u00101\u001a\u00020\u0019H\u0002J\u000e\u00102\u001a\u00020\u001d2\u0006\u00103\u001a\u00020\tJ\b\u00104\u001a\u00020\u001dH\u0002J\b\u00107\u001a\u00020\u0007H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\b\n\u0000\u0012\u0004\b\r\u0010\u0005R\u0014\u0010\u000e\u001a\u00020\f8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0012X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0012X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0012X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001aR\u0014\u00105\u001a\u00020\u00198@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b6\u0010\u001a¨\u00068"}, d2 = {"Lkotlinx/coroutines/DefaultExecutor;", "Lkotlinx/coroutines/EventLoopImplBase;", "Lkotlinx/coroutines/Runnable;", "Ljava/lang/Runnable;", "<init>", "()V", "THREAD_NAME", "", "DEFAULT_KEEP_ALIVE_MS", "", "KEEP_ALIVE_NANOS", "_thread", "Ljava/lang/Thread;", "get_thread$annotations", "thread", "getThread", "()Ljava/lang/Thread;", "FRESH", "", "ACTIVE", "SHUTDOWN_REQ", "SHUTDOWN_ACK", "SHUTDOWN", "debugStatus", "isShutDown", "", "()Z", "isShutdownRequested", "enqueue", "", "task", "(Ljava/lang/Runnable;)V", "reschedule", "now", "delayedTask", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "shutdownError", "shutdown", "invokeOnTimeout", "Lkotlinx/coroutines/DisposableHandle;", "timeMillis", "block", "context", "Lkotlin/coroutines/CoroutineContext;", "(JLjava/lang/Runnable;Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/DisposableHandle;", "run", "createThreadSync", "ensureStarted", "ensureStarted$kotlinx_coroutines_core", "notifyStartup", "shutdownForTests", "timeout", "acknowledgeShutdownIfNeeded", "isThreadPresent", "isThreadPresent$kotlinx_coroutines_core", "toString", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class resolveAudioSettings extends AutoValue_AudioMimeInfo1 implements Runnable {
    public static final resolveAudioSettings TuitionPaymentFragmentbindingInflater1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static final long TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    private static int g;
    private static final byte[] $$c = {113, 29, -123, -97};
    private static final int $$f = 36;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {89, 107, -36, -112, -5, 12, -53, 28, 15, -17, -50, -5, 28, 19, -5, 4, -16, 16, -2, -6, -16, 30, -15, 8, -14, 3, -4, -33, 14, 21, -15, -11, 6, 3, -49, 41, -20, 3, 3, -11, 6, 3, -4, -6, -14, -5, 3, -11, 8, -6, 2, -5, -6, 2, -12, -4, 15, -16, -7, 15, -45, 31, -14, -2, 4, -11, -2, -2, -8, 17, -12, 5, -68, 9, -5, -66, 54, 5, -3, -11, 2, -10, -58, 48, 10, -13, 11, -6, -9, -8, -57, 54, 3, 3, -72, 56, 2, 3, -18, 10, -7, -16, 8, -65, 60, -11, -7, 15, -1, -6, -16, 5, -11, 6, 3, -73, 73, -3, -16, 1, 30, -15, 8, -14, 3, -4, -33, 14, 21, -15, -11, 6, 3, -49, 41, -20, 3, 3, -11, 6, 3, -4, -6, -14, -5, 3, -11, 8, -6, 2, -5, -6, 2, -12, -4, 15, -16, -7, 15, -45, 31, -14, -2, 4, -11, -2, -2, -8, 17, -12, 5, -69};
    private static final int $$h = 204;
    private static final byte[] $$a = {89, 92, -72, 43, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
    private static final int $$b = 81;
    private static int asInterface = 0;
    private static int d = 1;
    private static int asBinder = 1;

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i5;
        int i8 = ~i3;
        int i9 = i7 | i8;
        int i10 = ~(i9 | i);
        int i11 = ~i;
        int i12 = (~(i7 | i3)) | (~(i8 | i11)) | (~(i8 | i5));
        int i13 = ~(i11 | i9);
        int i14 = i5 + i3 + i2 + (1938118820 * i6) + ((-1869228383) * i4);
        int i15 = i14 * i14;
        int i16 = (i5 * (-1046486968)) + 2037645312 + ((-1046486968) * i3) + (1604861810 * i10) + (i12 * (-1345052743)) + ((-1345052743) * i13) + (1903427584 * i2) + ((-1907359744) * i6) + (1374945280 * i4) + (1516044288 * i15);
        int i17 = ((i5 * 647972376) - 1941852458) + (i3 * 647972376) + (i10 * 1702) + (i12 * 851) + (i13 * 851) + (i2 * 647973227) + (i6 * (-1260466036)) + (i4 * 1557372491) + (i15 * 1239351296);
        if (i16 + (i17 * i17 * 490405888) != 1) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
        }
        int i18 = 2 % 2;
        int i19 = debugStatus;
        if (i19 == 2 || i19 == 3) {
            int i20 = d + 1;
            asInterface = i20 % 128;
            int i21 = i20 % 2;
            return true;
        }
        int i22 = d + 51;
        asInterface = i22 % 128;
        int i23 = i22 % 2;
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r7, int r8, int r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 14
            int r9 = r9 + 84
            int r7 = 53 - r7
            int r8 = r8 + 4
            byte[] r0 = defpackage.resolveAudioSettings.$$a
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r7
            r5 = r2
            goto L29
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L22
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L22:
            int r8 = r8 + 1
            r3 = r0[r8]
            r6 = r3
            r3 = r9
            r9 = r6
        L29:
            int r9 = -r9
            int r3 = r3 + r9
            int r9 = r3 + (-11)
            r3 = r5
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.resolveAudioSettings.c(int, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(int r7, byte r8, byte r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = defpackage.resolveAudioSettings.$$g
            int r8 = r8 * 5
            int r8 = 53 - r8
            int r7 = 103 - r7
            int r9 = 119 - r9
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r8
            r7 = r9
            r5 = r2
            goto L2a
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            int r9 = r9 + 1
            if (r5 != r8) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L25:
            r3 = r0[r9]
            r6 = r9
            r9 = r7
            r7 = r6
        L2a:
            int r9 = r9 + r3
            int r9 = r9 + 3
            r3 = r5
            r6 = r9
            r9 = r7
            r7 = r6
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.resolveAudioSettings.f(int, byte, byte, java.lang.Object[]):void");
    }

    private resolveAudioSettings() {
    }

    static {
        Long l;
        g = 0;
        b();
        resolveAudioSettings resolveaudiosettings = new resolveAudioSettings();
        TuitionPaymentFragmentbindingInflater1 = resolveaudiosettings;
        resolveaudiosettings.TuitionPaymentFragmentspecialinlinedviewModeldefault1(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
            int i = asBinder + 65;
            g = i % 128;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (SecurityException unused) {
            l = 1000L;
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = timeUnit.toNanos(l.longValue());
        int i4 = asBinder + 21;
        g = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        resolveAudioSettings resolveaudiosettings = (resolveAudioSettings) objArr[0];
        int i = 2 % 2;
        int i2 = asInterface + 123;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            Thread thread = _thread;
            int i3 = 55 / 0;
            if (thread != null) {
                return thread;
            }
        } else {
            Thread thread2 = _thread;
            if (thread2 != null) {
                return thread2;
            }
        }
        Thread threadINotificationSideChannel = resolveaudiosettings.INotificationSideChannel();
        int i4 = asInterface + 9;
        d = i4 % 128;
        int i5 = i4 % 2;
        return threadINotificationSideChannel;
    }

    @Override // defpackage.AutoValue_AudioMimeInfo1
    public final void b(Runnable runnable) throws Throwable {
        int i = 2 % 2;
        int i2 = d + 7;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        if (debugStatus == 4) {
            int i4 = d;
            int i5 = i4 + 69;
            asInterface = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = i4 + 1;
                asInterface = i6 % 128;
                int i7 = i6 % 2;
                getInterfaceDescriptor();
            }
        }
        super.b(runnable);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0127  */
    /* JADX WARN: Code duplicated, block: B:39:0x0148  */
    /* JADX WARN: Code duplicated, block: B:42:0x0192 A[Catch: all -> 0x036d, TryCatch #0 {all -> 0x036d, blocks: (B:11:0x0031, B:13:0x003f, B:14:0x0070, B:18:0x008b, B:20:0x009c, B:21:0x00ce, B:40:0x014a, B:42:0x0192, B:43:0x0207, B:47:0x021c, B:49:0x0257, B:51:0x02c3), top: B:71:0x0031 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x021a  */
    /* JADX WARN: Code duplicated, block: B:49:0x0257 A[Catch: all -> 0x036d, TryCatch #0 {all -> 0x036d, blocks: (B:11:0x0031, B:13:0x003f, B:14:0x0070, B:18:0x008b, B:20:0x009c, B:21:0x00ce, B:40:0x014a, B:42:0x0192, B:43:0x0207, B:47:0x021c, B:49:0x0257, B:51:0x02c3), top: B:71:0x0031 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:53:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:55:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:56:0x0314  */
    private static void e(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        Object[] objArr2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        int length;
        char[] cArr2;
        int i3 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i4 = 1770390596;
        Object obj2 = null;
        long j = 0;
        int i5 = 3;
        if (cArr3 != null) {
            int i6 = $10 + 23;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                length = cArr3.length;
                cArr2 = new char[length];
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
            }
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr3 = {Integer.valueOf(cArr3[i7])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cIndexOf = (char) TextUtils.indexOf("", "", 0);
                        int iRed = Color.red(0) + 2267;
                        int i8 = 33 - (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1));
                        byte b2 = (byte) i5;
                        byte b3 = (byte) (b2 - 3);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, iRed, i8, -1927765101, false, $$i(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr2[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr3)).charValue();
                    i7++;
                    i4 = 1770390596;
                    j = 0;
                    i5 = 3;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr2;
        }
        Object[] objArr4 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
            byte b4 = (byte) 3;
            byte b5 = (byte) (b4 - 3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (KeyEvent.getMaxKeyCode() >> 16), Color.argb(0, 0, 0, 0) + 2267, TextUtils.indexOf("", "", 0) + 33, -1927765101, false, $$i(b4, b5, b5), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr4)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        char c = '\t';
        if (i2 > 1) {
            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                int i9 = $10 + 55;
                $11 = i9 % 128;
                if (i9 % 2 == 0) {
                    deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b);
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b);
                        int i10 = $10 + 91;
                        $11 = i10 % 128;
                        int i11 = i10 % 2;
                        obj = obj2;
                    } else {
                        objArr2 = new Object[13];
                        objArr2[12] = deinitsession;
                        objArr2[11] = Integer.valueOf(cCharValue);
                        objArr2[10] = deinitsession;
                        objArr2[c] = deinitsession;
                        objArr2[8] = Integer.valueOf(cCharValue);
                        objArr2[7] = deinitsession;
                        objArr2[6] = deinitsession;
                        objArr2[5] = Integer.valueOf(cCharValue);
                        objArr2[4] = deinitsession;
                        objArr2[3] = deinitsession;
                        objArr2[2] = Integer.valueOf(cCharValue);
                        objArr2[1] = deinitsession;
                        objArr2[0] = deinitsession;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b6 = (byte) 2;
                            byte b7 = (byte) (b6 - 2);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (49266 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 3262 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), ExpandableListView.getPackedPositionChild(0L) + 31, -127612708, false, $$i(b6, b7, b7), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue() == deinitsession.asBinder) {
                            Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                byte b8 = (byte) 0;
                                byte b9 = b8;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 22877), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 594, 17 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 1570859318, false, $$i(b8, b9, b9), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr5)).intValue();
                            int i12 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[iIntValue];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i12];
                        } else {
                            obj = null;
                            if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                int i13 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                int i14 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[i13];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i14];
                            } else {
                                int i15 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                int i16 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[i15];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i16];
                            }
                        }
                    }
                } else {
                    deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                    if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b);
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b);
                        int i17 = $10 + 91;
                        $11 = i17 % 128;
                        int i18 = i17 % 2;
                        obj = obj2;
                    } else {
                        objArr2 = new Object[13];
                        objArr2[12] = deinitsession;
                        objArr2[11] = Integer.valueOf(cCharValue);
                        objArr2[10] = deinitsession;
                        objArr2[c] = deinitsession;
                        objArr2[8] = Integer.valueOf(cCharValue);
                        objArr2[7] = deinitsession;
                        objArr2[6] = deinitsession;
                        objArr2[5] = Integer.valueOf(cCharValue);
                        objArr2[4] = deinitsession;
                        objArr2[3] = deinitsession;
                        objArr2[2] = Integer.valueOf(cCharValue);
                        objArr2[1] = deinitsession;
                        objArr2[0] = deinitsession;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b10 = (byte) 2;
                            byte b11 = (byte) (b10 - 2);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (49266 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 3262 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), ExpandableListView.getPackedPositionChild(0L) + 31, -127612708, false, $$i(b10, b11, b11), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue() == deinitsession.asBinder) {
                            Object[] objArr6 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                byte b12 = (byte) 0;
                                byte b13 = b12;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 22877), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 594, 17 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 1570859318, false, $$i(b12, b13, b13), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr6)).intValue();
                            int i19 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[iIntValue2];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i19];
                        } else {
                            obj = null;
                            if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                int i110 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                int i111 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[i110];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i111];
                            } else {
                                int i112 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                int i113 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[i112];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i113];
                            }
                        }
                    }
                }
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                obj2 = obj;
                c = '\t';
            }
        }
        int i20 = $11 + 9;
        $10 = i20 % 128;
        int i21 = i20 % 2;
        int i22 = 0;
        while (i22 < i) {
            int i23 = $10 + 21;
            $11 = i23 % 128;
            if (i23 % 2 == 0) {
                cArr4[i22] = (char) (cArr4[i22] ^ 30797);
                i22 += 79;
            } else {
                cArr4[i22] = (char) (cArr4[i22] ^ 13722);
                i22++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x022b  */
    /* JADX WARN: Code duplicated, block: B:27:0x022d  */
    @Override // defpackage.AutoValue_AudioMimeInfo
    protected final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(long j, AutoValue_AudioMimeInfo1.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cMakeMeasureSpec = (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 31533);
            int bitsPerPixel = 920 - ImageFormat.getBitsPerPixel(0);
            int deadChar = 28 - KeyEvent.getDeadChar(0, 0);
            Object[] objArr2 = new Object[1];
            c((byte) 52, (short) 140, $$a[5], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cMakeMeasureSpec, bitsPerPixel, deadChar, -1048449946, false, (String) objArr2[0], null);
        }
        long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{19, 16, '\f', 27, 21, 11, 21, 27, 20, '#', 20, 3, 2, 30, 15, 28, 11, 17, '#', 21, '\n', 25}, (byte) (100 - View.combineMeasuredStates(0, 0)), (ViewConfiguration.getTouchSlop() >> 8) + 22, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{'!', 3, 23, 20, '!', 26, '\f', '!', 28, 21, Typography.quote, 15, 11, 3, 13925}, (byte) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 103), 15 - Color.blue(0), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cCombineMeasuredStates = (char) (31533 - View.combineMeasuredStates(0, 0));
            int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 921;
            int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 28;
            byte b = $$a[7];
            byte b2 = b;
            Object[] objArr5 = new Object[1];
            c(b2, (short) (b2 | 51), b, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cCombineMeasuredStates, windowTouchSlop, longPressTimeout, -778300370, false, (String) objArr5[0], null);
        }
        if (j2 == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char mode = (char) (View.MeasureSpec.getMode(0) + 31533);
                int jumpTapTimeout = 921 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                int i2 = 29 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                Object[] objArr6 = new Object[1];
                c((byte) 15, (short) 103, $$a[7], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(mode, jumpTapTimeout, i2, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int iMyUid = Process.myUid();
            int i3 = (-736470384) + ((~((-1614547521) | iMyUid)) * 623) + (((~iMyUid) | 100729883) * (-623)) + (((~(iMyUid | 130131003)) | (~((-1643948641) | iMyUid)) | 1614547520) * 623) + 898006862;
            int i4 = (i3 << 13) ^ i3;
            int i5 = i4 ^ (i4 >>> 17);
            ((int[]) objArr[0])[0] = i5 ^ (i5 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{19, 16, '\f', 27, 21, 11, 21, 27, 23, 20, 20, 22, 1, '\r', 15, '\n', 15, '\b', '\f', 4, 26, 7, 25, 28, 21, 16}, (byte) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 25), KeyEvent.getDeadChar(0, 0) + 26, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{11, '\r', 13910, 13910, 25, 15, '\r', Typography.quote, 13912, 13912, 3, 15, '\n', 19, 15, '\n', 19, 17}, (byte) (111 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 18 - View.resolveSizeAndState(0, 0, 0), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i6 = d + 47;
                int i7 = i6 % 128;
                asInterface = i7;
                int i8 = i6 % 2;
                if (applicationContext instanceof ContextWrapper) {
                    int i9 = i7 + 21;
                    d = i9 % 128;
                    if (i9 % 2 == 0) {
                        int i10 = 15 / 0;
                        if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                            applicationContext = applicationContext.getApplicationContext();
                        } else {
                            applicationContext = null;
                        }
                    } else if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = applicationContext.getApplicationContext();
                    } else {
                        applicationContext = null;
                    }
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                }
            }
            Object[] objArr10 = new Object[1];
            e(new char[]{4, 21, 16, 20, 27, 3, 19, 16, '!', 22, 3, 1, Typography.quote, 14, 29, 3}, (byte) (ExpandableListView.getPackedPositionType(0L) + 52), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 16, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            e(new char[]{15, 21, 25, 15, 15, '\n', '\f', 4, 16, 18, 2, 14, 17, 29, 21, '!'}, (byte) (Color.blue(0) + 60), Color.red(0) + 16, objArr11);
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, 898006862};
                byte[] bArr = $$g;
                byte b3 = bArr[15];
                byte b4 = bArr[119];
                Object[] objArr13 = new Object[1];
                f(b3, b4, (byte) (b4 | 46), objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b5 = bArr[13];
                byte b6 = (byte) (bArr[119] - 1);
                Object[] objArr14 = new Object[1];
                f(b5, b6, b6, objArr14);
                objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char gidForName = (char) (Process.getGidForName("") + 31534);
                    int iAlpha = 921 - Color.alpha(0);
                    int offsetBefore = 28 - TextUtils.getOffsetBefore("", 0);
                    Object[] objArr15 = new Object[1];
                    c((byte) 15, (short) 103, $$a[7], objArr15);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(gidForName, iAlpha, offsetBefore, -1142834547, false, (String) objArr15[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr16 = new Object[1];
                    e(new char[]{19, 16, '\f', 27, 21, 11, 21, 27, 20, '#', 20, 3, 2, 30, 15, 28, 11, 17, '#', 21, '\n', 25}, (byte) (101 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 22 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr16);
                    Class<?> cls5 = Class.forName((String) objArr16[0]);
                    Object[] objArr17 = new Object[1];
                    e(new char[]{'!', 3, 23, 20, '!', 26, '\f', '!', 28, 21, Typography.quote, 15, 11, 3, 13925}, (byte) (103 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 14, objArr17);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char maximumDrawingCacheSize = (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 31533);
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 922;
                        int mirror = AndroidCharacter.getMirror('0') - 20;
                        byte b7 = $$a[7];
                        byte b8 = b7;
                        Object[] objArr18 = new Object[1];
                        c(b8, (short) (b8 | 51), b7, objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(maximumDrawingCacheSize, iLastIndexOf, mirror, -778300370, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char fadingEdgeLength = (char) (31533 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                        int i11 = 922 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                        int i12 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 28;
                        Object[] objArr19 = new Object[1];
                        c((byte) 52, (short) 140, $$a[5], objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(fadingEdgeLength, i11, i12, -1048449946, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    int i13 = d + 37;
                    asInterface = i13 % 128;
                    int i14 = i13 % 2;
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
            for (String str : strArr) {
                arrayList.add(str);
            }
            throw null;
        }
        int i15 = ((int[]) objArr[0])[0];
        Object[] objArr20 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
        int iIdentityHashCode = System.identityHashCode(this);
        int i16 = (-1950307963) + (((~((-104184765) | iIdentityHashCode)) | 70592800 | (~(1669894879 | iIdentityHashCode))) * (-754));
        int i17 = ~((-70592801) | iIdentityHashCode);
        int i18 = ~iIdentityHashCode;
        int i19 = i15 + i16 + ((i17 | (~(1740487679 | i18))) * (-754)) + ((i18 | (-104184765)) * 754);
        int i20 = (i19 << 13) ^ i19;
        int i21 = i20 ^ (i20 >>> 17);
        ((int[]) objArr20[0])[0] = i21 ^ (i21 << 5);
        getInterfaceDescriptor();
    }

    private final void getInterfaceDescriptor() throws Throwable {
        Object[] objArr;
        char c;
        Object[] objArr2;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char keyRepeatTimeout = (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 43042);
            int mirror = AndroidCharacter.getMirror('0') + 3063;
            int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 22;
            byte[] bArr = $$a;
            byte b = bArr[7];
            Object[] objArr3 = new Object[1];
            c(b, bArr[132], b, objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(keyRepeatTimeout, mirror, absoluteGravity, -1272852037, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        e(new char[]{19, 16, '\f', 27, 21, 11, 21, 27, 20, '#', 20, 3, 2, 30, 15, 28, 11, 17, '#', 21, '\n', 25}, (byte) (100 - (ViewConfiguration.getJumpTapTimeout() >> 16)), 22 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        e(new char[]{'!', 3, 23, 20, '!', 26, '\f', '!', 28, 21, Typography.quote, 15, 11, 3, 13925}, (byte) (102 - View.resolveSize(0, 0)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 14, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cMyPid = (char) ((Process.myPid() >> 22) + 43042);
            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 3112;
            int iRed = 22 - Color.red(0);
            byte b2 = $$a[7];
            byte b3 = b2;
            Object[] objArr6 = new Object[1];
            c(b3, (short) (b3 | 51), b2, objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cMyPid, iIndexOf, iRed, -1269618118, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char touchSlop = (char) (43042 - (ViewConfiguration.getTouchSlop() >> 8));
                int i2 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 3110;
                int iLastIndexOf = 21 - TextUtils.lastIndexOf("", '0');
                Object[] objArr7 = new Object[1];
                c((byte) 15, (short) 103, $$a[7], objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(touchSlop, i2, iLastIndexOf, 154975793, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i3 = ((int[]) objArr8[2])[0];
            int i4 = ((int[]) objArr8[1])[0];
            String[] strArr = (String[]) objArr8[3];
            int i5 = (int) Runtime.getRuntime().totalMemory();
            int i6 = ((((-893389840) + (((~((~i5) | (-76528475))) | 1628502984) * (-235))) + (((~((-76528475) | i5)) | 1628502984) * (-470))) + (((~(i5 | (-76480531))) | 1628455040) * 235)) - 2104381446;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[0])[0] = i8 ^ (i8 << 5);
            objArr = new Object[]{new int[1], new int[]{i4}, new int[]{i3}, strArr};
            c = 2;
        } else {
            Object[] objArr9 = new Object[1];
            e(new char[]{4, 21, 16, 20, 27, 3, 19, 16, '!', 22, 3, 1, Typography.quote, 14, 29, 3}, (byte) (TextUtils.indexOf((CharSequence) "", '0') + 53), TextUtils.indexOf((CharSequence) "", '0', 0) + 17, objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            e(new char[]{15, 21, 25, 15, 15, '\n', '\f', 4, 16, 18, 2, 14, 17, 29, 21, '!'}, (byte) (Color.argb(0, 0, 0, 0) + 60), 16 - Gravity.getAbsoluteGravity(0, 0), objArr10);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr10[0], Object.class).invoke(null, this)).intValue();
            int i9 = d + 117;
            asInterface = i9 % 128;
            int i10 = i9 % 2;
            try {
                Object[] objArr11 = {null, Integer.valueOf(iIntValue), 0, -2104381446};
                byte[] bArr2 = $$g;
                Object[] objArr12 = new Object[1];
                f((byte) (bArr2[119] - 1), (byte) (-bArr2[58]), (byte) 116, objArr12);
                Class<?> cls3 = Class.forName((String) objArr12[0]);
                byte b4 = bArr2[13];
                byte b5 = (byte) (bArr2[119] - 1);
                Object[] objArr13 = new Object[1];
                f(b4, b5, (byte) (b5 | 99), objArr13);
                objArr = (Object[]) cls3.getMethod((String) objArr13[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 43043);
                    int i11 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 3110;
                    int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 22;
                    Object[] objArr14 = new Object[1];
                    c((byte) 15, (short) 103, $$a[7], objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cLastIndexOf, i11, pressedStateDuration, 154975793, false, (String) objArr14[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr15 = new Object[1];
                    e(new char[]{19, 16, '\f', 27, 21, 11, 21, 27, 20, '#', 20, 3, 2, 30, 15, 28, 11, 17, '#', 21, '\n', 25}, (byte) (((byte) KeyEvent.getModifierMetaStateMask()) + 101), 21 - TextUtils.lastIndexOf("", '0', 0, 0), objArr15);
                    Class<?> cls4 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    e(new char[]{'!', 3, 23, 20, '!', 26, '\f', '!', 28, 21, Typography.quote, 15, 11, 3, 13925}, (byte) ((Process.myTid() >> 22) + 102), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 15, objArr16);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char gidForName = (char) (Process.getGidForName("") + 43043);
                        int packedPositionType = 3111 - ExpandableListView.getPackedPositionType(0L);
                        int capsMode = 22 - TextUtils.getCapsMode("", 0, 0);
                        byte b6 = $$a[7];
                        byte b7 = b6;
                        Object[] objArr17 = new Object[1];
                        c(b7, (short) (b7 | 51), b6, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(gidForName, packedPositionType, capsMode, -1269618118, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char keyRepeatTimeout2 = (char) (43042 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                        int i12 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 3112;
                        int offsetAfter = TextUtils.getOffsetAfter("", 0) + 22;
                        byte[] bArr3 = $$a;
                        byte b8 = bArr3[7];
                        Object[] objArr18 = new Object[1];
                        c(b8, bArr3[132], b8, objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(keyRepeatTimeout2, i12, offsetAfter, -1272852037, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    int i13 = asInterface + 33;
                    d = i13 % 128;
                    c = 2;
                    int i14 = i13 % 2;
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
        int i15 = ((int[]) objArr[1])[0];
        int i16 = ((int[]) objArr[c])[0];
        if (i16 != i15) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[3];
            if (strArr2 != null) {
                int i17 = asInterface + 37;
                d = i17 % 128;
                for (int i18 = i17 % 2 == 0 ? 1 : 0; i18 < strArr2.length; i18++) {
                    arrayList.add(strArr2[i18]);
                }
            }
            int[] iArr = new int[i16];
            int i19 = i16 - 1;
            iArr[i19] = 1;
            Toast.makeText((Context) null, iArr[((i16 * i19) % 2) - 1], 1).show();
            int i20 = ((int[]) objArr[0])[0];
            int i21 = ((int[]) objArr[2])[0];
            int i22 = ((int[]) objArr[1])[0];
            String[] strArr3 = (String[]) objArr[3];
            int iIdentityHashCode = System.identityHashCode(this);
            int i23 = i20 + ((((-1140544862) + (((~((-1699478196) | iIdentityHashCode)) | 4241443) * 576)) + (((~((~iIdentityHashCode) | (-1695236753))) | 1311820) * 576)) - 1851896128);
            int i24 = (i23 << 13) ^ i23;
            int i25 = i24 ^ (i24 >>> 17);
            ((int[]) objArr2[0])[0] = i25 ^ (i25 << 5);
            objArr2 = new Object[]{new int[1], new int[]{i22}, new int[]{i21}, strArr3};
        } else {
            int i26 = ((int[]) objArr[0])[0];
            int i27 = ((int[]) objArr[2])[0];
            int i28 = ((int[]) objArr[1])[0];
            String[] strArr4 = (String[]) objArr[3];
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i29 = ~startElapsedRealtime;
            int i30 = i26 + 482706697 + (((~(i29 | 1377445089)) | (-1402910434) | (~((-302121026) | startElapsedRealtime))) * 717) + (((~(startElapsedRealtime | 1377445089)) | (~(i29 | (-302121026))) | (-1402910434)) * 717);
            int i31 = (i30 << 13) ^ i30;
            int i32 = i31 ^ (i31 >>> 17);
            ((int[]) objArr2[0])[0] = i32 ^ (i32 << 5);
            objArr2 = new Object[]{new int[1], new int[]{i28}, new int[]{i27}, strArr4};
        }
        int i33 = ((int[]) objArr2[0])[0];
        int i34 = i33 * i33;
        int i35 = -(2061213453 * i33);
        int i36 = ((i34 | i35) << 1) - (i34 ^ i35);
        int i37 = -(i33 * (-1985363269));
        int i38 = (((i36 | i37) << 1) - (i37 ^ i36)) - (-1070222096);
        int i39 = ((i38 >> 23) - 1023) / 512;
        int i40 = (i39 & 1) + (i39 | 1);
        int i41 = (i38 ^ i40) + ((i40 & i38) << 1);
        int i42 = i38 >> 28;
        int i43 = (((i42 | (-31)) << 1) - (i42 ^ (-31))) / 16;
        int i44 = -(i41 ^ (((i43 | 1) << 1) - (i43 ^ 1)));
        int i45 = (i44 ^ 5) + ((i44 & 5) << 1);
        int i46 = i45 >> 22;
        throw new RejectedExecutionException("7|14|6|28|20|DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details".substring(8190 / (((-(((((i46 | (-2047)) << 1) - (i46 ^ (-2047))) / 1024) + 2)) & i45) * 126)));
    }

    @Override // defpackage.AutoValue_AudioMimeInfo1, defpackage.AutoValue_AudioMimeInfoBuilder
    public final void TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = asInterface + 115;
        d = i2 % 128;
        int i3 = i2 % 2;
        debugStatus = 4;
        super.TuitionPaymentFragmentbindingInflater1();
        int i4 = asInterface + 21;
        d = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // defpackage.AutoValue_AudioMimeInfo1, defpackage.selectSampleRateOrNearestSupported
    public final setCompatibleAudioProfile TuitionPaymentFragmentspecialinlinedviewModeldefault1(long j, Runnable runnable, CoroutineContext coroutineContext) {
        int i = 2 % 2;
        int i2 = d + 41;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        long jB = AutoValue_VideoMimeInfoBuilder.b(j);
        if (jB < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            AutoValue_AudioMimeInfo1.b bVar = new AutoValue_AudioMimeInfo1.b(jB + jNanoTime, runnable);
            TuitionPaymentFragmentspecialinlinedviewModeldefault2(jNanoTime, bVar);
            AutoValue_AudioMimeInfo1.b bVar2 = bVar;
            int i4 = asInterface + 79;
            d = i4 % 128;
            int i5 = i4 % 2;
            return bVar2;
        }
        return AutoValue_AudioEncoderConfigBuilder.INSTANCE;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i = 2 % 2;
        setDataSpace setdataspace = setDataSpace.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        setDataSpace.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this);
        try {
            if (RemoteActionCompatParcelizer()) {
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jG = g();
                    if (jG == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            int i2 = asInterface + 85;
                            d = i2 % 128;
                            int i3 = i2 % 2;
                            j = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + jNanoTime;
                        }
                        long j2 = j - jNanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            cancel();
                            if (TuitionPaymentFragmentspecialinlinedviewModeldefault3()) {
                                return;
                            }
                            int i4 = d + 109;
                            asInterface = i4 % 128;
                            if (i4 % 2 != 0) {
                                throw null;
                            }
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(setAspectRatio.AnonymousClass6.b(), setAspectRatio.AnonymousClass6.b(), 848039907, setAspectRatio.AnonymousClass6.b(), -848039907, new Object[]{this}, setAspectRatio.AnonymousClass6.b());
                        } else {
                            jG = RangesKt.coerceAtMost(jG, j2);
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (jG > 0) {
                        if (((Boolean) TuitionPaymentFragmentspecialinlinedviewModeldefault3(setAspectRatio.AnonymousClass6.b(), setAspectRatio.AnonymousClass6.b(), -48900062, setAspectRatio.AnonymousClass6.b(), 48900063, new Object[0], setAspectRatio.AnonymousClass6.b())).booleanValue()) {
                            int i5 = d + 45;
                            asInterface = i5 % 128;
                            int i6 = i5 % 2;
                            _thread = null;
                            cancel();
                            if (TuitionPaymentFragmentspecialinlinedviewModeldefault3()) {
                                return;
                            }
                            int i7 = asInterface + 103;
                            d = i7 % 128;
                            if (i7 % 2 != 0) {
                                return;
                            }
                            int i8 = 72 / 0;
                            return;
                        }
                        LockSupport.parkNanos(this, jG);
                    }
                }
            } else {
                int i9 = asInterface + 77;
                d = i9 % 128;
                int i10 = i9 % 2;
                _thread = null;
                cancel();
                if (TuitionPaymentFragmentspecialinlinedviewModeldefault3()) {
                    return;
                }
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(setAspectRatio.AnonymousClass6.b(), setAspectRatio.AnonymousClass6.b(), 848039907, setAspectRatio.AnonymousClass6.b(), -848039907, new Object[]{this}, setAspectRatio.AnonymousClass6.b());
            }
        } catch (Throwable th) {
            _thread = null;
            cancel();
            if (!TuitionPaymentFragmentspecialinlinedviewModeldefault3()) {
            }
            throw th;
        }
    }

    private final Thread INotificationSideChannel() {
        Thread thread;
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                resolveAudioSettings resolveaudiosettings = TuitionPaymentFragmentbindingInflater1;
                _thread = thread;
                thread.setContextClassLoader(resolveaudiosettings.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    private final boolean RemoteActionCompatParcelizer() {
        synchronized (this) {
            int iB = setAspectRatio.AnonymousClass6.b();
            int iB2 = setAspectRatio.AnonymousClass6.b();
            int iB3 = setAspectRatio.AnonymousClass6.b();
            if (((Boolean) TuitionPaymentFragmentspecialinlinedviewModeldefault3(iB, iB2, -48900062, setAspectRatio.AnonymousClass6.b(), 48900063, new Object[0], iB3)).booleanValue()) {
                return false;
            }
            debugStatus = 1;
            Intrinsics.checkNotNull(this, "");
            notifyAll();
            return true;
        }
    }

    private final void cancel() {
        synchronized (this) {
            int iB = setAspectRatio.AnonymousClass6.b();
            int iB2 = setAspectRatio.AnonymousClass6.b();
            int iB3 = setAspectRatio.AnonymousClass6.b();
            if (((Boolean) TuitionPaymentFragmentspecialinlinedviewModeldefault3(iB, iB2, -48900062, setAspectRatio.AnonymousClass6.b(), 48900063, new Object[0], iB3)).booleanValue()) {
                debugStatus = 3;
                a();
                Intrinsics.checkNotNull(this, "");
                notifyAll();
            }
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final String toString() {
        int i = 2 % 2;
        int i2 = d + 77;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 1;
        d = i5 % 128;
        int i6 = i5 % 2;
        return "DefaultExecutor";
    }

    private static boolean cancelAll() {
        int iB = setAspectRatio.AnonymousClass6.b();
        int iB2 = setAspectRatio.AnonymousClass6.b();
        int iB3 = setAspectRatio.AnonymousClass6.b();
        return ((Boolean) TuitionPaymentFragmentspecialinlinedviewModeldefault3(iB, iB2, -48900062, setAspectRatio.AnonymousClass6.b(), 48900063, new Object[0], iB3)).booleanValue();
    }

    @Override // defpackage.AutoValue_AudioMimeInfo
    protected final Thread TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int iB = setAspectRatio.AnonymousClass6.b();
        int iB2 = setAspectRatio.AnonymousClass6.b();
        int iB3 = setAspectRatio.AnonymousClass6.b();
        return (Thread) TuitionPaymentFragmentspecialinlinedviewModeldefault3(iB, iB2, 848039907, setAspectRatio.AnonymousClass6.b(), -848039907, new Object[]{this}, iB3);
    }

    static void b() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new char[]{60034, 60059, 60072, 60049, 60042, 60054, 60044, 60056, 60051, 60050, 60057, 60088, 60083, 60053, 60045, 60063, 60047, 60046, 60037, 60043, 60061, 60117, 60058, 60052, 60041, 60079, 60039, 60062, 60048, 60038, 60073, 60090, 60040, 60055, 60060, 60036};
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (char) 57191;
    }

    private static String $$i(byte b, int i, byte b2) {
        int i2 = (i * 2) + 4;
        byte[] bArr = $$c;
        int i3 = b2 * 3;
        int i4 = 116 - b;
        byte[] bArr2 = new byte[i3 + 1];
        int i5 = -1;
        if (bArr == null) {
            i4 = i3 + i4;
            i2++;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i4;
            if (i5 == i3) {
                return new String(bArr2, 0);
            }
            i4 += bArr[i2];
            i2++;
        }
    }
}
