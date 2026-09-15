package defpackage;

import com.datadog.android.api.InternalLogger;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class nativeShiftPixel {
    public static final boolean b(long j, InternalLogger internalLogger) {
        Intrinsics.checkNotNullParameter(internalLogger, "");
        try {
            try {
                Thread.sleep(j);
                return false;
            } catch (SecurityException e2) {
                internalLogger.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.ERROR, InternalLogger.Target.MAINTAINER, new Function0<String>() { // from class: com.datadog.android.core.internal.thread.ThreadExtKt$sleepSafe$1
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
                    public final String invoke() {
                        return "Thread was unable to set its own interrupted state";
                    }
                }, e2, false, null);
                return true;
            }
        } catch (IllegalArgumentException e3) {
            internalLogger.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.WARN, InternalLogger.Target.MAINTAINER, new Function0<String>() { // from class: com.datadog.android.core.internal.thread.ThreadExtKt$sleepSafe$2
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "Thread tried to sleep for a negative amount of time";
                }
            }, e3, false, null);
            return false;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return true;
        }
    }

    public static final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Runnable runnable, Throwable th, InternalLogger internalLogger) {
        Intrinsics.checkNotNullParameter(internalLogger, "");
        if (th == null && (runnable instanceof Future) && ((Future) runnable).isDone()) {
            try {
                try {
                    ((Future) runnable).get();
                } catch (SecurityException e2) {
                    internalLogger.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.ERROR, InternalLogger.Target.MAINTAINER, new Function0<String>() { // from class: com.datadog.android.core.internal.thread.ThreadExtKt$loggingAfterExecute$1
                        @Override // kotlin.jvm.functions.Function0
                        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: merged with bridge method [inline-methods] */
                        public final String invoke() {
                            return "Thread was unable to set its own interrupted state";
                        }
                    }, e2, false, null);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (CancellationException e3) {
                th = e3;
            } catch (ExecutionException e4) {
                th = e4.getCause();
            }
        }
        Throwable th2 = th;
        if (th2 != null) {
            internalLogger.TuitionPaymentFragmentspecialinlinedviewModeldefault1(InternalLogger.Level.ERROR, CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.USER, InternalLogger.Target.TELEMETRY}), new Function0<String>() { // from class: com.datadog.android.core.internal.thread.ThreadExtKt$loggingAfterExecute$2
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "Uncaught exception during the task execution";
                }
            }, th2, false, null);
        }
    }
}
