package okhttp3.internal.concurrent;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
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
import android.widget.Toast;
import androidx.compose.animation.core.AnimationKt;
import defpackage.initSession;
import defpackage.setOrVerifyExpectFrameRateRange;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 .2\u00020\u0001:\u0003/.0B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\r¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001a\u0010\u0013R\u001a\u0010\u001b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00070\u001f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010%\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010(\u001a\u00020'8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00070\u001f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b*\u0010!R\u0014\u0010,\u001a\u00020+8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b,\u0010-"}, d2 = {"Lokhttp3/internal/concurrent/TaskRunner;", "", "Lokhttp3/internal/concurrent/TaskRunner$Backend;", "p0", "<init>", "(Lokhttp3/internal/concurrent/TaskRunner$Backend;)V", "", "Lokhttp3/internal/concurrent/TaskQueue;", "activeQueues", "()Ljava/util/List;", "Lokhttp3/internal/concurrent/Task;", "", "p1", "", "afterRun", "(Lokhttp3/internal/concurrent/Task;J)V", "awaitTaskToRun", "()Lokhttp3/internal/concurrent/Task;", "beforeRun", "(Lokhttp3/internal/concurrent/Task;)V", "cancelAll", "()V", "kickCoordinator$okhttp", "(Lokhttp3/internal/concurrent/TaskQueue;)V", "newQueue", "()Lokhttp3/internal/concurrent/TaskQueue;", "runTask", "backend", "Lokhttp3/internal/concurrent/TaskRunner$Backend;", "getBackend", "()Lokhttp3/internal/concurrent/TaskRunner$Backend;", "", "busyQueues", "Ljava/util/List;", "", "coordinatorWaiting", "Z", "coordinatorWakeUpAt", "J", "", "nextQueueName", "I", "readyQueues", "Ljava/lang/Runnable;", "runnable", "Ljava/lang/Runnable;", "Companion", "Backend", "RealBackend"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TaskRunner {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final TaskRunner INSTANCE;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static int b;
    private static final Logger logger;
    private final Backend backend;
    private final List<TaskQueue> busyQueues;
    private boolean coordinatorWaiting;
    private long coordinatorWakeUpAt;
    private int nextQueueName;
    private final List<TaskQueue> readyQueues;
    private final Runnable runnable;
    private static final byte[] $$c = {36, -74, -79, -21};
    private static final int $$f = 76;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {51, -99, -8, -59, -11, 60, -73, 8, -1, -7, -22, 6, -18, 12, -24, 69, -64, -10, -11, 10, -18, -1, 8, -16, 57, -61, -20, 2, 6, -22, 6, -11, -4, -10, 64, -29, -52, 2, 6, -22, 6, -11, -4, -10, 74, -72, -3, -20, 28, -23, -19, -5, 5, -11, -4, 21, -32, -1, 1, -14, -38, 7, -16, 6, -11, -4, 25, -22, -29, 7, 3, -14, -11, 41, -49, 12, -11, -11, 3, -14, -11, -4, -2, 6, -3, -11, 3, -16, -2, -10, -3, -2, -10, 4, -4, -23, 8, -1, -23, 37, -39, 6, -6, -12, 3, -6, -6, 0, -25, 4, -13, 60};
    private static final int $$e = 25;
    private static final byte[] $$a = {102, -96, -78, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54};
    private static final int $$b = 44;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
    private static int TuitionPaymentFragmentbindingInflater1 = 1;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\fH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH&¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lokhttp3/internal/concurrent/TaskRunner$Backend;", "", "Lokhttp3/internal/concurrent/TaskRunner;", "p0", "", "beforeTask", "(Lokhttp3/internal/concurrent/TaskRunner;)V", "coordinatorNotify", "", "p1", "coordinatorWait", "(Lokhttp3/internal/concurrent/TaskRunner;J)V", "Ljava/lang/Runnable;", "execute", "(Ljava/lang/Runnable;)V", "nanoTime", "()J"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Backend {
        void beforeTask(TaskRunner p0);

        void coordinatorNotify(TaskRunner p0);

        void coordinatorWait(TaskRunner p0, long p1);

        void execute(Runnable p0);

        long nanoTime();
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
    private static void a(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 14
            int r6 = r6 + 84
            byte[] r0 = okhttp3.internal.concurrent.TaskRunner.$$a
            int r8 = r8 * 52
            int r8 = r8 + 4
            int r7 = r7 * 52
            int r7 = r7 + 1
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r6
            r6 = r7
            r4 = r2
            goto L29
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r6
            r1[r3] = r5
            if (r4 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            r3 = r0[r8]
        L29:
            int r6 = r6 + r3
            int r6 = r6 + (-11)
            int r8 = r8 + 1
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.concurrent.TaskRunner.a(byte, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(int r5, byte r6, int r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = okhttp3.internal.concurrent.TaskRunner.$$d
            int r5 = r5 * 56
            int r5 = r5 + 4
            int r7 = r7 * 4
            int r1 = 57 - r7
            int r6 = r6 * 21
            int r6 = r6 + 84
            byte[] r1 = new byte[r1]
            int r7 = 56 - r7
            r2 = 0
            if (r0 != 0) goto L19
            r4 = r5
            r6 = r7
            r3 = r2
            goto L2b
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L27
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L27:
            r4 = r0[r5]
            int r3 = r3 + 1
        L2b:
            int r5 = r5 + 1
            int r4 = -r4
            int r6 = r6 + r4
            int r6 = r6 + (-5)
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.concurrent.TaskRunner.d(int, byte, int, java.lang.Object[]):void");
    }

    public TaskRunner(Backend backend) {
        Intrinsics.checkNotNullParameter(backend, "");
        this.backend = backend;
        this.nextQueueName = 10000;
        this.busyQueues = new ArrayList();
        this.readyQueues = new ArrayList();
        this.runnable = new Runnable() { // from class: okhttp3.internal.concurrent.TaskRunner$runnable$1
            @Override // java.lang.Runnable
            public final void run() {
                Task taskAwaitTaskToRun;
                long jNanoTime;
                while (true) {
                    TaskRunner taskRunner = this.this$0;
                    synchronized (taskRunner) {
                        taskAwaitTaskToRun = taskRunner.awaitTaskToRun();
                    }
                    if (taskAwaitTaskToRun == null) {
                        return;
                    }
                    TaskQueue queue$okhttp = taskAwaitTaskToRun.getQueue$okhttp();
                    Intrinsics.checkNotNull(queue$okhttp);
                    TaskRunner taskRunner2 = this.this$0;
                    boolean zIsLoggable = TaskRunner.INSTANCE.getLogger().isLoggable(Level.FINE);
                    if (zIsLoggable) {
                        jNanoTime = queue$okhttp.getTaskRunner$okhttp().getBackend().nanoTime();
                        TaskLoggerKt.log(taskAwaitTaskToRun, queue$okhttp, "starting");
                    } else {
                        jNanoTime = -1;
                    }
                    try {
                        TaskRunner.access$runTask(taskRunner2, taskAwaitTaskToRun);
                        try {
                            Unit unit = Unit.INSTANCE;
                            if (zIsLoggable) {
                                long jNanoTime2 = queue$okhttp.getTaskRunner$okhttp().getBackend().nanoTime();
                                StringBuilder sb = new StringBuilder("finished run in ");
                                sb.append(TaskLoggerKt.formatDuration(jNanoTime2 - jNanoTime));
                                TaskLoggerKt.log(taskAwaitTaskToRun, queue$okhttp, sb.toString());
                            }
                        } catch (Throwable th) {
                            if (zIsLoggable) {
                                long jNanoTime3 = queue$okhttp.getTaskRunner$okhttp().getBackend().nanoTime();
                                StringBuilder sb2 = new StringBuilder("failed a run in ");
                                sb2.append(TaskLoggerKt.formatDuration(jNanoTime3 - jNanoTime));
                                TaskLoggerKt.log(taskAwaitTaskToRun, queue$okhttp, sb2.toString());
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        taskRunner2.getBackend().execute(this);
                        throw th2;
                    }
                }
            }
        };
    }

    public static final /* synthetic */ Logger access$getLogger$cp() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 121;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        int i4 = i2 % 2;
        Logger logger2 = logger;
        int i5 = i3 + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 != 0) {
            return logger2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void access$runTask(TaskRunner taskRunner, Task task) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        taskRunner.runTask(task);
        if (i3 != 0) {
            throw null;
        }
    }

    public final Backend getBackend() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Backend backend = this.backend;
        if (i3 != 0) {
            int i4 = 55 / 0;
        }
        return backend;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if (java.lang.Thread.holdsLock(r3) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        r0 = new java.lang.StringBuilder("Thread ");
        r0.append(java.lang.Thread.currentThread().getName());
        r0.append(" MUST hold lock on ");
        r0.append(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004c, code lost:
    
        throw new java.lang.AssertionError(r0.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001f, code lost:
    
        if (java.lang.Thread.holdsLock(r3) != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void kickCoordinator$okhttp(okhttp3.internal.concurrent.TaskQueue r4) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            java.lang.String r1 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r1)
            boolean r1 = okhttp3.internal.Util.assertionsEnabled
            if (r1 == 0) goto L4d
            int r1 = okhttp3.internal.concurrent.TaskRunner.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            int r1 = r1 + 107
            int r2 = r1 % 128
            okhttp3.internal.concurrent.TaskRunner.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L22
            boolean r1 = java.lang.Thread.holdsLock(r3)
            r2 = 45
            int r2 = r2 / 0
            if (r1 == 0) goto L29
            goto L4d
        L22:
            boolean r1 = java.lang.Thread.holdsLock(r3)
            if (r1 == 0) goto L29
            goto L4d
        L29:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Thread "
            r0.<init>(r1)
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = " MUST hold lock on "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
        L4d:
            okhttp3.internal.concurrent.Task r1 = r4.getActiveTask$okhttp()
            if (r1 != 0) goto L77
            java.util.List r1 = r4.getFutureTasks$okhttp()
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L72
            java.util.List<okhttp3.internal.concurrent.TaskQueue> r1 = r3.readyQueues
            okhttp3.internal.Util.addIfAbsent(r1, r4)
            int r4 = okhttp3.internal.concurrent.TaskRunner.TuitionPaymentFragmentspecialinlinedviewModeldefault2
            int r4 = r4 + 33
            int r1 = r4 % 128
            okhttp3.internal.concurrent.TaskRunner.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r1
            int r4 = r4 % r0
            if (r4 != 0) goto L77
            int r4 = r0 % 3
            goto L77
        L72:
            java.util.List<okhttp3.internal.concurrent.TaskQueue> r1 = r3.readyQueues
            r1.remove(r4)
        L77:
            boolean r4 = r3.coordinatorWaiting
            if (r4 == 0) goto L96
            int r4 = okhttp3.internal.concurrent.TaskRunner.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            int r4 = r4 + 77
            int r1 = r4 % 128
            okhttp3.internal.concurrent.TaskRunner.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = r1
            int r4 = r4 % r0
            if (r4 != 0) goto L8c
            okhttp3.internal.concurrent.TaskRunner$Backend r4 = r3.backend
            r4.coordinatorNotify(r3)
            return
        L8c:
            okhttp3.internal.concurrent.TaskRunner$Backend r4 = r3.backend
            r4.coordinatorNotify(r3)
            r4 = 0
            r4.hashCode()
            throw r4
        L96:
            okhttp3.internal.concurrent.TaskRunner$Backend r4 = r3.backend
            java.lang.Runnable r0 = r3.runnable
            r4.execute(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.concurrent.TaskRunner.kickCoordinator$okhttp(okhttp3.internal.concurrent.TaskQueue):void");
    }

    private final void beforeRun(Task p0) {
        int i = 2 % 2;
        Object obj = null;
        if (Util.assertionsEnabled) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 99;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            if (i2 % 2 == 0) {
                Thread.holdsLock(this);
                throw null;
            }
            if (!Thread.holdsLock(this)) {
                StringBuilder sb = new StringBuilder("Thread ");
                sb.append(Thread.currentThread().getName());
                sb.append(" MUST hold lock on ");
                sb.append(this);
                throw new AssertionError(sb.toString());
            }
        }
        p0.setNextExecuteNanoTime$okhttp(-1L);
        TaskQueue queue$okhttp = p0.getQueue$okhttp();
        Intrinsics.checkNotNull(queue$okhttp);
        queue$okhttp.getFutureTasks$okhttp().remove(p0);
        this.readyQueues.remove(queue$okhttp);
        queue$okhttp.setActiveTask$okhttp(p0);
        this.busyQueues.add(queue$okhttp);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 63;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0073  */
    /* JADX WARN: Code duplicated, block: B:22:0x007b  */
    private final void afterRun(Task p0, long p1) {
        int i = 2 % 2;
        if (Util.assertionsEnabled && !Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder("Thread ");
            sb.append(Thread.currentThread().getName());
            sb.append(" MUST hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        TaskQueue queue$okhttp = p0.getQueue$okhttp();
        Intrinsics.checkNotNull(queue$okhttp);
        if (queue$okhttp.getActiveTask$okhttp() != p0) {
            throw new IllegalStateException("Check failed.".toString());
        }
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        boolean cancelActiveTask$okhttp = queue$okhttp.getCancelActiveTask$okhttp();
        queue$okhttp.setCancelActiveTask$okhttp(false);
        queue$okhttp.setActiveTask$okhttp(null);
        this.busyQueues.remove(queue$okhttp);
        if (p1 != -1) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 69;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 95 / 0;
                if (!cancelActiveTask$okhttp) {
                    if (!queue$okhttp.getShutdown$okhttp()) {
                        queue$okhttp.scheduleAndDecide$okhttp(p0, p1, true);
                    }
                }
            } else if (!cancelActiveTask$okhttp) {
                if (!queue$okhttp.getShutdown$okhttp()) {
                    queue$okhttp.scheduleAndDecide$okhttp(p0, p1, true);
                }
            }
        }
        if (!queue$okhttp.getFutureTasks$okhttp().isEmpty()) {
            this.readyQueues.add(queue$okhttp);
        }
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 65;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
        int i7 = i6 % 2;
    }

    private static void c(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
        char[] cArr2;
        int i4 = 2 % 2;
        setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
        char[] cArr3 = new char[i2];
        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        int i5 = $11 + 17;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr3[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i7 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr3[i7]), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) View.MeasureSpec.makeMeasureSpec(0, 0), MotionEvent.axisFromString("") + 3292, 31 - View.MeasureSpec.makeMeasureSpec(0, 0), 1199271174, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr3[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Process.myPid() >> 22), 651 - View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 44, -450685997, false, $$g(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class, Object.class});
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
            int i8 = $10 + 1;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
            char[] cArr4 = new char[i2];
            System.arraycopy(cArr3, 0, cArr4, 0, i2);
            System.arraycopy(cArr4, 0, cArr3, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            System.arraycopy(cArr4, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr3, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
        }
        if (z) {
            int i10 = $11 + 67;
            $10 = i10 % 128;
            if (i10 % 2 != 0) {
                cArr2 = new char[i2];
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            } else {
                cArr2 = new char[i2];
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            }
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                int i11 = $11 + 113;
                $10 = i11 % 128;
                if (i11 % 2 != 0) {
                    cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                    Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 651 - (ViewConfiguration.getJumpTapTimeout() >> 16), 44 - ((Process.getThreadPriority(0) + 20) >> 6), -450685997, false, $$g(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                } else {
                    cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                    Object[] objArr5 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b8 = (byte) 0;
                        byte b9 = b8;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) View.resolveSizeAndState(0, 0, 0), 650 - ImageFormat.getBitsPerPixel(0), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 44, -450685997, false, $$g(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                }
                int i12 = $10 + 1;
                $11 = i12 % 128;
                int i13 = i12 % 2;
            }
            cArr3 = cArr2;
        }
        objArr[0] = new String(cArr3);
        int i14 = $10 + 33;
        $11 = i14 % 128;
        int i15 = i14 % 2;
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\tJ\u001f\u0010\r\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lokhttp3/internal/concurrent/TaskRunner$RealBackend;", "Lokhttp3/internal/concurrent/TaskRunner$Backend;", "Ljava/util/concurrent/ThreadFactory;", "p0", "<init>", "(Ljava/util/concurrent/ThreadFactory;)V", "Lokhttp3/internal/concurrent/TaskRunner;", "", "beforeTask", "(Lokhttp3/internal/concurrent/TaskRunner;)V", "coordinatorNotify", "", "p1", "coordinatorWait", "(Lokhttp3/internal/concurrent/TaskRunner;J)V", "Ljava/lang/Runnable;", "execute", "(Ljava/lang/Runnable;)V", "nanoTime", "()J", "shutdown", "()V", "Ljava/util/concurrent/ThreadPoolExecutor;", "executor", "Ljava/util/concurrent/ThreadPoolExecutor;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class RealBackend implements Backend {
        private final ThreadPoolExecutor executor;

        public RealBackend(ThreadFactory threadFactory) {
            Intrinsics.checkNotNullParameter(threadFactory, "");
            this.executor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public final long nanoTime() {
            return System.nanoTime();
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public final void coordinatorWait(TaskRunner p0, long p1) throws InterruptedException {
            Intrinsics.checkNotNullParameter(p0, "");
            long j = p1 / AnimationKt.MillisToNanos;
            if (j > 0 || p1 > 0) {
                p0.wait(j, (int) (p1 - (AnimationKt.MillisToNanos * j)));
            }
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public final void execute(Runnable p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.executor.execute(p0);
        }

        public final void shutdown() {
            this.executor.shutdown();
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public final void coordinatorNotify(TaskRunner p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            p0.notify();
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public final void beforeTask(TaskRunner p0) {
            Intrinsics.checkNotNullParameter(p0, "");
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Lokhttp3/internal/concurrent/TaskRunner$Companion;", "", "<init>", "()V", "Lokhttp3/internal/concurrent/TaskRunner;", "INSTANCE", "Lokhttp3/internal/concurrent/TaskRunner;", "Ljava/util/logging/Logger;", "logger", "Ljava/util/logging/Logger;", "getLogger", "()Ljava/util/logging/Logger;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final Logger getLogger() {
            return TaskRunner.access$getLogger$cp();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final void runTask(Task p0) {
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder("Thread ");
            sb.append(Thread.currentThread().getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(p0.getName());
        try {
            long jRunOnce = p0.runOnce();
            synchronized (this) {
                afterRun(p0, jRunOnce);
                Unit unit = Unit.INSTANCE;
            }
        } finally {
            synchronized (this) {
                afterRun(p0, -1L);
                Unit unit2 = Unit.INSTANCE;
                threadCurrentThread.setName(name);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:92:0x0705  */
    /* JADX WARN: Type inference failed for: r2v64, types: [boolean, int] */
    public final Task awaitTaskToRun() throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        boolean z;
        int i = 2 % 2;
        Object obj = null;
        if (Util.assertionsEnabled) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 71;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            if (i2 % 2 == 0) {
                Thread.holdsLock(this);
                obj.hashCode();
                throw null;
            }
            if (!Thread.holdsLock(this)) {
                StringBuilder sb = new StringBuilder("Thread ");
                sb.append(Thread.currentThread().getName());
                sb.append(" MUST hold lock on ");
                sb.append(this);
                throw new AssertionError(sb.toString());
            }
        }
        while (true) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char cRgb = (char) (Color.rgb(0, 0, 0) + 16814783);
                int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 626;
                int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 14;
                byte[] bArr = $$a;
                byte b2 = (byte) (-bArr[5]);
                byte b3 = bArr[7];
                Object[] objArr3 = new Object[1];
                a(b2, b3, b3, objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cRgb, modifierMetaStateMask, windowTouchSlop, -477065106, false, (String) objArr3[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr4 = new Object[1];
            c(true, 292 - View.MeasureSpec.getMode(0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 22, 20 - TextUtils.getOffsetBefore("", 0), new char[]{'\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534, '\b', 0}, objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            c(true, 296 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), View.resolveSize(0, 0) + 15, 5 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), new char[]{'\t', 65530, 5, 65534, 65534, 6, 2, '\r', 5, 65530, 65534, 65515, 65533, 65534, '\f'}, objArr5);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char c = (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 37567);
                int iLastIndexOf = 624 - TextUtils.lastIndexOf("", '0');
                int iAlpha = 14 - Color.alpha(0);
                byte[] bArr2 = $$a;
                byte b4 = bArr2[7];
                Object[] objArr6 = new Object[1];
                a(b4, (byte) (-bArr2[5]), b4, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, iLastIndexOf, iAlpha, -976899241, false, (String) objArr6[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char gidForName = (char) (Process.getGidForName("") + 37568);
                    int iLastIndexOf2 = 624 - TextUtils.lastIndexOf("", '0');
                    int i3 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 13;
                    byte[] bArr3 = $$a;
                    byte b5 = bArr3[7];
                    byte b6 = (byte) (-bArr3[5]);
                    Object[] objArr7 = new Object[1];
                    a(b5, b6, b6, objArr7);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(gidForName, iLastIndexOf2, i3, -973632554, false, (String) objArr7[0], null);
                }
                Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                int i4 = ((int[]) objArr8[2])[0];
                int i5 = ((int[]) objArr8[0])[0];
                String[] strArr = (String[]) objArr8[3];
                int iMyPid = Process.myPid();
                int i6 = (((((~((-605452370) | iMyPid)) | 604137536) * (-566)) + 168199816) + ((~(iMyPid | (-1314834))) * 566)) - 1626749842;
                int i7 = (i6 << 13) ^ i6;
                int i8 = i7 ^ (i7 >>> 17);
                ((int[]) objArr[1])[0] = i8 ^ (i8 << 5);
                objArr = new Object[]{new int[]{i5}, new int[1], new int[]{i4}, strArr};
            } else {
                Object[] objArr9 = new Object[1];
                c(true, 292 - Color.alpha(0), 27 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 7 - TextUtils.indexOf((CharSequence) "", '0', 0), new char[]{65483, 1, 6, '\f', 15, 1, 11, 65534, 1, 65534, 2, 15, 5, 65521, 22, 17, 6, 19, 6, 17, 0, 65502, 65483, '\r', '\r', 65534}, objArr9);
                Class<?> cls2 = Class.forName((String) objArr9[0]);
                Object[] objArr10 = new Object[1];
                c(false, TextUtils.getOffsetBefore("", 0) + 299, 17 - TextUtils.lastIndexOf("", '0', 0, 0), 18 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), new char[]{65529, 11, '\b', '\b', 65531, 4, '\n', 65495, 6, 6, 2, 65535, 65529, 65527, '\n', 65535, 5, 4}, objArr10);
                Context applicationContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
                if (applicationContext != null) {
                    applicationContext = (!((applicationContext instanceof ContextWrapper) ^ true) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
                }
                Object[] objArr11 = new Object[1];
                c(true, TextUtils.lastIndexOf("", '0') + 292, 15 - ((byte) KeyEvent.getModifierMetaStateMask()), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 7, new char[]{'\f', 65535, '\n', 65484, 65535, 20, 65535, '\b', 11, 3, 18, 17, 23, 65521, 65484, 5}, objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                Object[] objArr12 = new Object[1];
                c(false, (ViewConfiguration.getTouchSlop() >> 8) + 295, 16 - ((Process.getThreadPriority(0) + 20) >> 6), 10 - ExpandableListView.getPackedPositionType(0L), new char[]{14, 19, 65506, 65531, '\r', 2, 65501, '\t', 65534, 65535, 3, 65534, 65535, '\b', 14, 3}, objArr12);
                int iIntValue = ((Integer) cls3.getMethod((String) objArr12[0], Object.class).invoke(null, this)).intValue();
                Object[] objArr13 = new Object[1];
                c(true, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 265, 64 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 41 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), new char[]{29, 24, 65519, 65512, 65512, 65520, 65513, 24, 65520, 65520, 65515, 27, 65514, 65512, 25, 65518, 28, 25, 65518, 65518, 65516, 28, 65517, 65512, 65518, 65516, 24, 28, 28, 65516, 29, 29, 65520, 65517, 29, 25, 24, 24, 29, 28, 65513, 25, 65513, 29, 25, 25, 65515, 65519, 65520, 25, 65513, 65519, 65515, 24, 65519, 65511, 24, 65516, 65514, 28, 29, 65519, 65515, 65516}, objArr13);
                String str = (String) objArr13[0];
                Object[] objArr14 = new Object[1];
                c(true, 263 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), View.MeasureSpec.makeMeasureSpec(0, 0) + 64, 28 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), new char[]{65524, 29, 65519, 29, 65521, '!', 65522, 65520, 65518, 65521, 65518, 65517, 65519, '!', 65517, ' ', 29, 65515, '!', ' ', 65522, 29, 65520, 65515, 65521, 31, 28, 30, '!', 65521, 65515, 28, 65519, 65517, '!', 30, 65517, 65518, 65519, 29, 65524, 65524, 30, 65524, 65518, 65518, 65519, 65522, 65521, '!', ' ', 65517, 65517, 28, ' ', 65519, 65516, 65520, 29, 65524, 65523, 65524, 65524, 65518}, objArr14);
                try {
                    Object[] objArr15 = {applicationContext, new String[]{str, (String) objArr14[0]}, Integer.valueOf(iIntValue), 17, -1626749842};
                    byte[] bArr4 = $$d;
                    byte b7 = bArr4[107];
                    Object[] objArr16 = new Object[1];
                    d(b7, bArr4[58], b7, objArr16);
                    Class<?> cls4 = Class.forName((String) objArr16[0]);
                    byte b8 = bArr4[58];
                    Object[] objArr17 = new Object[1];
                    d(b8, bArr4[107], b8, objArr17);
                    objArr = (Object[]) cls4.getMethod((String) objArr17[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr15);
                    int i9 = ((int[]) objArr[0])[0];
                    int i10 = ((int[]) objArr[2])[0];
                    if (applicationContext != null) {
                        int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 17;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i11 % 128;
                        int i12 = i11 % 2;
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char cKeyCodeFromString = (char) (37567 - KeyEvent.keyCodeFromString(""));
                            int packedPositionType = 625 - ExpandableListView.getPackedPositionType(0L);
                            int iLastIndexOf3 = TextUtils.lastIndexOf("", '0', 0) + 15;
                            byte[] bArr5 = $$a;
                            byte b9 = bArr5[7];
                            byte b10 = (byte) (-bArr5[5]);
                            Object[] objArr18 = new Object[1];
                            a(b9, b10, b10, objArr18);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cKeyCodeFromString, packedPositionType, iLastIndexOf3, -973632554, false, (String) objArr18[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                        try {
                            Object[] objArr19 = new Object[1];
                            c(true, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 292, TextUtils.lastIndexOf("", '0') + 23, (ViewConfiguration.getEdgeSlop() >> 16) + 20, new char[]{'\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534, '\b', 0}, objArr19);
                            Class<?> cls5 = Class.forName((String) objArr19[0]);
                            Object[] objArr20 = new Object[1];
                            c(true, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 296, TextUtils.getOffsetBefore("", 0) + 15, 4 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), new char[]{'\t', 65530, 5, 65534, 65534, 6, 2, '\r', 5, 65530, 65534, 65515, 65533, 65534, '\f'}, objArr20);
                            long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr20[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char modifierMetaStateMask2 = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 37568);
                                int iIndexOf = 624 - TextUtils.indexOf((CharSequence) "", '0');
                                int iAlpha2 = 14 - Color.alpha(0);
                                byte[] bArr6 = $$a;
                                byte b11 = bArr6[7];
                                Object[] objArr21 = new Object[1];
                                a(b11, (byte) (-bArr6[5]), b11, objArr21);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(modifierMetaStateMask2, iIndexOf, iAlpha2, -976899241, false, (String) objArr21[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char cNormalizeMetaState = (char) (KeyEvent.normalizeMetaState(0) + 37567);
                                int iMakeMeasureSpec = 625 - View.MeasureSpec.makeMeasureSpec(0, 0);
                                int iArgb = Color.argb(0, 0, 0, 0) + 14;
                                byte[] bArr7 = $$a;
                                byte b12 = (byte) (-bArr7[5]);
                                byte b13 = bArr7[7];
                                Object[] objArr22 = new Object[1];
                                a(b12, b13, b13, objArr22);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cNormalizeMetaState, iMakeMeasureSpec, iArgb, -477065106, false, (String) objArr22[0], null);
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
            int i13 = ((int[]) objArr[0])[0];
            int i14 = ((int[]) objArr[2])[0];
            if (i14 == i13) {
                int i15 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 19;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i15 % 128;
                int i16 = i15 % 2;
                int i17 = ((int[]) objArr[1])[0];
                int i18 = ((int[]) objArr[2])[0];
                int i19 = ((int[]) objArr[0])[0];
                String[] strArr2 = (String[]) objArr[3];
                int[] iArr = {i18};
                int iIdentityHashCode = System.identityHashCode(this);
                int i20 = ~(254364331 | iIdentityHashCode);
                int i21 = i17 + (-285392087) + ((1350743124 | i20) * (-814)) + ((i20 | (~((~iIdentityHashCode) | (-1569373790))) | 35733666) * 407) + (((~(iIdentityHashCode | 1569373789)) | (~((-254364332) | iIdentityHashCode)) | 35733666) * 407);
                int i22 = (i21 << 13) ^ i21;
                int i23 = i22 ^ (i22 >>> 17);
                ((int[]) objArr2[1])[0] = i23 ^ (i23 << 5);
                objArr2 = new Object[]{new int[]{i19}, new int[1], iArr, strArr2};
            } else {
                ArrayList arrayList = new ArrayList();
                String[] strArr3 = (String[]) objArr[3];
                if (strArr3 != null) {
                    int i24 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 71;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i24 % 128;
                    int i25 = i24 % 2;
                    for (String str2 : strArr3) {
                        arrayList.add(str2);
                    }
                }
                int[] iArr2 = new int[i14];
                int i26 = i14 - 1;
                iArr2[i26] = 1;
                Toast.makeText((Context) null, iArr2[((i14 * i26) % 2) - 1], 1).show();
                int i27 = ((int[]) objArr[1])[0];
                int i28 = ((int[]) objArr[2])[0];
                int i29 = ((int[]) objArr[0])[0];
                String[] strArr4 = (String[]) objArr[3];
                int i30 = ~((~((int) SystemClock.uptimeMillis())) | 1188010603);
                int i31 = i27 + (((1108054114 | i30) * (-970)) - 1648945598) + ((i30 | 79956489) * 970);
                int i32 = (i31 << 13) ^ i31;
                int i33 = i32 ^ (i32 >>> 17);
                ((int[]) objArr2[1])[0] = i33 ^ (i33 << 5);
                objArr2 = new Object[]{new int[]{i29}, new int[1], new int[]{i28}, strArr4};
            }
            if (this.readyQueues.isEmpty()) {
                return null;
            }
            long jNanoTime = this.backend.nanoTime();
            Iterator<TaskQueue> it = this.readyQueues.iterator();
            long jMin = Long.MAX_VALUE;
            Task task = null;
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                Task task2 = it.next().getFutureTasks$okhttp().get(0);
                long jMax = Math.max(0L, task2.getNextExecuteNanoTime$okhttp() - jNanoTime);
                if (jMax > 0) {
                    int i34 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 115;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i34 % 128;
                    int i35 = i34 % 2;
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (task != null) {
                        int i36 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 113;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i36 % 128;
                        int i37 = i36 % 2;
                        z = true;
                        break;
                    }
                    task = task2;
                }
            }
            if (task != null) {
                int i38 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 59;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i38 % 128;
                if (i38 % 2 == 0) {
                    beforeRun(task);
                    obj.hashCode();
                    throw null;
                }
                beforeRun(task);
                if (!(!z)) {
                    this.backend.execute(this.runnable);
                } else if (!this.coordinatorWaiting) {
                    int i39 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 89;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i39 % 128;
                    if (i39 % 2 != 0) {
                        int i40 = 98 / 0;
                        if (!this.readyQueues.isEmpty()) {
                            this.backend.execute(this.runnable);
                        }
                    } else if (!this.readyQueues.isEmpty()) {
                        this.backend.execute(this.runnable);
                    }
                }
                return task;
            }
            if (this.coordinatorWaiting) {
                if (jMin < this.coordinatorWakeUpAt - jNanoTime) {
                    int i41 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 31;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i41 % 128;
                    if (i41 % 2 == 0) {
                        this.backend.coordinatorNotify(this);
                        int i42 = 77 / 0;
                    } else {
                        this.backend.coordinatorNotify(this);
                    }
                }
                return null;
            }
            int i43 = ((int[]) objArr2[1])[0];
            int i44 = ((i43 * i43) - (~(-(1094003081 * i43)))) - 1;
            int i45 = -(i43 * 1811598509);
            int i46 = ((i44 | i45) << 1) - (i45 ^ i44);
            int i47 = (i46 ^ 1411904729) + ((1411904729 & i46) << 1);
            int i48 = i47 >> 21;
            int i49 = (((i48 | (-4095)) << 1) - (i48 ^ (-4095))) / 2048;
            int i50 = (i49 ^ 1) + ((i49 & 1) << 1);
            int i51 = (i47 & i50) + (i50 | i47);
            int i52 = i47 >> 22;
            int i53 = -(i51 ^ ((((i52 & (-2047)) + (i52 | (-2047))) / 1024) + 1));
            int i54 = (i53 & 2) + (i53 | 2);
            int i55 = i54 >> 25;
            int i56 = ((i55 ^ (-255)) + ((i55 & (-255)) << 1)) / 128;
            int i57 = (i56 ^ 1) + ((i56 & 1) << 1);
            this.coordinatorWaiting = 688 / (((-((i57 & 1) + (i57 | 1))) & i54) * 344);
            this.coordinatorWakeUpAt = jNanoTime + jMin;
            try {
                try {
                    this.backend.coordinatorWait(this, jMin);
                } catch (Throwable th2) {
                    this.coordinatorWaiting = false;
                    throw th2;
                }
            } catch (InterruptedException unused2) {
                cancelAll();
            }
            this.coordinatorWaiting = false;
        }
    }

    public final TaskQueue newQueue() {
        int i;
        synchronized (this) {
            i = this.nextQueueName;
            this.nextQueueName = i + 1;
        }
        return new TaskQueue(this, "Q".concat(String.valueOf(i)));
    }

    public final List<TaskQueue> activeQueues() {
        List<TaskQueue> listPlus;
        synchronized (this) {
            listPlus = CollectionsKt.plus((Collection) this.busyQueues, (Iterable) this.readyQueues);
        }
        return listPlus;
    }

    public final void cancelAll() {
        int i = 2 % 2;
        for (int size = this.busyQueues.size() - 1; size >= 0; size--) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 71;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            this.busyQueues.get(size).cancelAllAndDecide$okhttp();
        }
        for (int size2 = this.readyQueues.size() - 1; size2 >= 0; size2--) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 117;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            int i5 = i4 % 2;
            TaskQueue taskQueue = this.readyQueues.get(size2);
            taskQueue.cancelAllAndDecide$okhttp();
            if (!(!taskQueue.getFutureTasks$okhttp().isEmpty())) {
                this.readyQueues.remove(size2);
                int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 77;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
                int i7 = i6 % 2;
            }
        }
    }

    static {
        b = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        INSTANCE = new Companion(null);
        StringBuilder sb = new StringBuilder();
        sb.append(Util.okHttpName);
        sb.append(" TaskRunner");
        INSTANCE = new TaskRunner(new RealBackend(Util.threadFactory(sb.toString(), true)));
        Logger logger2 = Logger.getLogger(TaskRunner.class.getName());
        Intrinsics.checkNotNullExpressionValue(logger2, "");
        logger = logger2;
        int i = TuitionPaymentFragmentbindingInflater1 + 121;
        b = i % 128;
        int i2 = i % 2;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -83722333;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r6, int r7, int r8) {
        /*
            int r7 = r7 * 3
            int r7 = 4 - r7
            byte[] r0 = okhttp3.internal.concurrent.TaskRunner.$$c
            int r8 = 120 - r8
            int r6 = r6 * 3
            int r1 = r6 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r4 = r6
            r8 = r7
            r3 = r2
            goto L2b
        L15:
            r3 = r2
        L16:
            r5 = r8
            r8 = r7
            r7 = r5
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r8
            r8 = r7
            r7 = r5
        L2b:
            int r7 = r7 + 1
            int r8 = r8 + r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.concurrent.TaskRunner.$$g(byte, int, int):java.lang.String");
    }
}
