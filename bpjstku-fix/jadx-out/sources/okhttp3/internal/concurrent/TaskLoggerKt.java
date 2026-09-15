package okhttp3.internal.concurrent;

import androidx.compose.animation.core.AnimationKt;
import androidx.exifinterface.media.ExifInterface;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a'\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a7\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\f2\u0006\u0010\u0001\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0080\bø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a1\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"", "p0", "", "formatDuration", "(J)Ljava/lang/String;", "Lokhttp3/internal/concurrent/Task;", "Lokhttp3/internal/concurrent/TaskQueue;", "p1", "p2", "", "log", "(Lokhttp3/internal/concurrent/Task;Lokhttp3/internal/concurrent/TaskQueue;Ljava/lang/String;)V", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function0;", "logElapsed", "(Lokhttp3/internal/concurrent/Task;Lokhttp3/internal/concurrent/TaskQueue;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "taskLog", "(Lokhttp3/internal/concurrent/Task;Lokhttp3/internal/concurrent/TaskQueue;Lkotlin/jvm/functions/Function0;)V"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class TaskLoggerKt {
    public static final void taskLog(Task task, TaskQueue taskQueue, Function0<String> function0) {
        Intrinsics.checkNotNullParameter(task, "");
        Intrinsics.checkNotNullParameter(taskQueue, "");
        Intrinsics.checkNotNullParameter(function0, "");
        if (TaskRunner.INSTANCE.getLogger().isLoggable(Level.FINE)) {
            log(task, taskQueue, function0.invoke());
        }
    }

    public static final <T> T logElapsed(Task task, TaskQueue taskQueue, Function0<? extends T> function0) {
        long jNanoTime;
        long jNanoTime2;
        StringBuilder sb;
        Intrinsics.checkNotNullParameter(task, "");
        Intrinsics.checkNotNullParameter(taskQueue, "");
        Intrinsics.checkNotNullParameter(function0, "");
        boolean zIsLoggable = TaskRunner.INSTANCE.getLogger().isLoggable(Level.FINE);
        if (zIsLoggable) {
            jNanoTime = taskQueue.getTaskRunner$okhttp().getBackend().nanoTime();
            log(task, taskQueue, "starting");
        } else {
            jNanoTime = -1;
        }
        try {
            T tInvoke = function0.invoke();
            if (zIsLoggable) {
                jNanoTime2 = taskQueue.getTaskRunner$okhttp().getBackend().nanoTime();
                sb = new StringBuilder("finished run in ");
            }
            return tInvoke;
        } finally {
            if (zIsLoggable) {
                jNanoTime2 = taskQueue.getTaskRunner$okhttp().getBackend().nanoTime();
                sb = new StringBuilder("failed a run in ");
                sb.append(formatDuration(jNanoTime2 - jNanoTime));
                log(task, taskQueue, sb.toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void log(Task task, TaskQueue taskQueue, String str) {
        Logger logger = TaskRunner.INSTANCE.getLogger();
        StringBuilder sb = new StringBuilder();
        sb.append(taskQueue.getName$okhttp());
        sb.append(' ');
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str2 = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "");
        sb.append(str2);
        sb.append(": ");
        sb.append(task.getName());
        logger.fine(sb.toString());
    }

    public static final String formatDuration(long j) {
        String string;
        if (j <= -999500000) {
            StringBuilder sb = new StringBuilder();
            sb.append((j - 500000000) / 1000000000);
            sb.append(" s ");
            string = sb.toString();
        } else if (j <= -999500) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append((j - 500000) / AnimationKt.MillisToNanos);
            sb2.append(" ms");
            string = sb2.toString();
        } else if (j <= 0) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append((j - 500) / 1000);
            sb3.append(" µs");
            string = sb3.toString();
        } else if (j < 999500) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append((j + 500) / 1000);
            sb4.append(" µs");
            string = sb4.toString();
        } else if (j < 999500000) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append((j + 500000) / AnimationKt.MillisToNanos);
            sb5.append(" ms");
            string = sb5.toString();
        } else {
            StringBuilder sb6 = new StringBuilder();
            sb6.append((j + 500000000) / 1000000000);
            sb6.append(" s ");
            string = sb6.toString();
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%6s", Arrays.copyOf(new Object[]{string}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }
}
