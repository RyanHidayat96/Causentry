package androidx.work;

import androidx.tracing.Trace;
import defpackage.MimeInfo;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\t\u001a\u0004\u0018\u00010\u0002*\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\t\u0010\n\"\u0014\u0010\f\u001a\u00020\u000b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"", "p0", "Ljava/util/concurrent/Executor;", "createDefaultExecutor", "(Z)Ljava/util/concurrent/Executor;", "Landroidx/work/Tracer;", "createDefaultTracer", "()Landroidx/work/Tracer;", "Lkotlin/coroutines/CoroutineContext;", "asExecutor", "(Lkotlin/coroutines/CoroutineContext;)Ljava/util/concurrent/Executor;", "", "DEFAULT_CONTENT_URI_TRIGGERS_WORKERS_LIMIT", "I"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ConfigurationKt {
    public static final int DEFAULT_CONTENT_URI_TRIGGERS_WORKERS_LIMIT = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Executor createDefaultExecutor(final boolean z) {
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new ThreadFactory() { // from class: androidx.work.ConfigurationKt$createDefaultExecutor$factory$1
            private final AtomicInteger threadCount = new AtomicInteger(0);

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable p0) {
                Intrinsics.checkNotNullParameter(p0, "");
                String str = z ? "WM.task-" : "androidx.work-";
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(this.threadCount.incrementAndGet());
                return new Thread(p0, sb.toString());
            }
        });
        Intrinsics.checkNotNullExpressionValue(executorServiceNewFixedThreadPool, "");
        return executorServiceNewFixedThreadPool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Tracer createDefaultTracer() {
        return new Tracer() { // from class: androidx.work.ConfigurationKt$createDefaultTracer$tracer$1
            @Override // androidx.work.Tracer
            public final boolean isEnabled() {
                return Trace.isEnabled();
            }

            @Override // androidx.work.Tracer
            public final void beginSection(String p0) {
                Intrinsics.checkNotNullParameter(p0, "");
                Trace.beginSection(p0);
            }

            @Override // androidx.work.Tracer
            public final void endSection() {
                Trace.endSection();
            }

            @Override // androidx.work.Tracer
            public final void beginAsyncSection(String p0, int p1) {
                Intrinsics.checkNotNullParameter(p0, "");
                Trace.beginAsyncSection(p0, p1);
            }

            @Override // androidx.work.Tracer
            public final void endAsyncSection(String p0, int p1) {
                Intrinsics.checkNotNullParameter(p0, "");
                Trace.endAsyncSection(p0, p1);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Executor asExecutor(CoroutineContext coroutineContext) {
        ContinuationInterceptor continuationInterceptor = coroutineContext != null ? (ContinuationInterceptor) coroutineContext.get(ContinuationInterceptor.INSTANCE) : null;
        CoroutineDispatcher coroutineDispatcher = continuationInterceptor instanceof CoroutineDispatcher ? (CoroutineDispatcher) continuationInterceptor : null;
        if (coroutineDispatcher != null) {
            return MimeInfo.b(coroutineDispatcher);
        }
        return null;
    }
}
