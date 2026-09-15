package androidx.work;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\r\u0010\f"}, d2 = {"Landroidx/work/WorkerFactory;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "p1", "Landroidx/work/WorkerParameters;", "p2", "Landroidx/work/ListenableWorker;", "createWorker", "(Landroid/content/Context;Ljava/lang/String;Landroidx/work/WorkerParameters;)Landroidx/work/ListenableWorker;", "createWorkerWithDefaultFallback"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class WorkerFactory {
    public abstract ListenableWorker createWorker(Context p0, String p1, WorkerParameters p2);

    private static final Class<? extends ListenableWorker> createWorkerWithDefaultFallback$getWorkerClass(String str) {
        try {
            Class clsAsSubclass = Class.forName(str).asSubclass(ListenableWorker.class);
            Intrinsics.checkNotNullExpressionValue(clsAsSubclass, "");
            return clsAsSubclass;
        } catch (Throwable th) {
            Logger.get().error(WorkerFactoryKt.TAG, "Invalid class: ".concat(String.valueOf(str)), th);
            throw th;
        }
    }

    private static final ListenableWorker createWorkerWithDefaultFallback$fallbackToReflection(Context context, String str, WorkerParameters workerParameters) {
        try {
            ListenableWorker listenableWorkerNewInstance = createWorkerWithDefaultFallback$getWorkerClass(str).getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
            Intrinsics.checkNotNullExpressionValue(listenableWorkerNewInstance, "");
            return listenableWorkerNewInstance;
        } catch (Throwable th) {
            Logger.get().error(WorkerFactoryKt.TAG, "Could not instantiate ".concat(String.valueOf(str)), th);
            throw th;
        }
    }

    public final ListenableWorker createWorkerWithDefaultFallback(Context p0, String p1, WorkerParameters p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        ListenableWorker listenableWorkerCreateWorker = createWorker(p0, p1, p2);
        if (listenableWorkerCreateWorker == null) {
            listenableWorkerCreateWorker = createWorkerWithDefaultFallback$fallbackToReflection(p0, p1, p2);
        }
        if (!listenableWorkerCreateWorker.isUsed()) {
            return listenableWorkerCreateWorker;
        }
        StringBuilder sb = new StringBuilder("WorkerFactory (");
        sb.append(getClass().getName());
        sb.append(") returned an instance of a ListenableWorker (");
        sb.append(p1);
        sb.append(") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
        throw new IllegalStateException(sb.toString());
    }
}
