package androidx.work.impl.constraints.trackers;

import android.content.Context;
import androidx.exifinterface.media.ExifInterface;
import androidx.work.Logger;
import androidx.work.impl.constraints.ConstraintListener;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0019\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\n2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00028\u0000H&¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u000f\u001a\u00020\n2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u000f\u0010\fJ\u000f\u0010\u0010\u001a\u00020\nH&¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\nH&¢\u0006\u0004\b\u0012\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u00038\u0005X\u0085\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0017\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\u00198\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R$\u0010 \u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u00008G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u000e\"\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010\""}, d2 = {"Landroidx/work/impl/constraints/trackers/ConstraintTracker;", ExifInterface.GPS_DIRECTION_TRUE, "", "Landroid/content/Context;", "p0", "Landroidx/work/impl/utils/taskexecutor/TaskExecutor;", "p1", "<init>", "(Landroid/content/Context;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;)V", "Landroidx/work/impl/constraints/ConstraintListener;", "", "addListener", "(Landroidx/work/impl/constraints/ConstraintListener;)V", "readSystemState", "()Ljava/lang/Object;", "removeListener", "startTracking", "()V", "stopTracking", "appContext", "Landroid/content/Context;", "getAppContext", "()Landroid/content/Context;", "currentState", "Ljava/lang/Object;", "Ljava/util/LinkedHashSet;", "listeners", "Ljava/util/LinkedHashSet;", "lock", "getState", "setState", "(Ljava/lang/Object;)V", RemoteConfigConstants.ResponseFieldKey.STATE, "taskExecutor", "Landroidx/work/impl/utils/taskexecutor/TaskExecutor;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class ConstraintTracker<T> {
    private final Context appContext;
    private T currentState;
    private final LinkedHashSet<ConstraintListener<T>> listeners;
    private final Object lock;
    private final TaskExecutor taskExecutor;

    public abstract T readSystemState();

    public abstract void startTracking();

    public abstract void stopTracking();

    protected ConstraintTracker(Context context, TaskExecutor taskExecutor) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(taskExecutor, "");
        this.taskExecutor = taskExecutor;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        this.appContext = applicationContext;
        this.lock = new Object();
        this.listeners = new LinkedHashSet<>();
    }

    protected final Context getAppContext() {
        return this.appContext;
    }

    public final void addListener(ConstraintListener<T> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        synchronized (this.lock) {
            if (this.listeners.add(p0)) {
                if (this.listeners.size() == 1) {
                    this.currentState = readSystemState();
                    Logger logger = Logger.get();
                    String str = ConstraintTrackerKt.TAG;
                    StringBuilder sb = new StringBuilder();
                    sb.append(getClass().getSimpleName());
                    sb.append(": initial state = ");
                    sb.append(this.currentState);
                    logger.debug(str, sb.toString());
                    startTracking();
                }
                p0.onConstraintChanged(this.currentState);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void removeListener(ConstraintListener<T> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        synchronized (this.lock) {
            if (this.listeners.remove(p0) && this.listeners.isEmpty()) {
                stopTracking();
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final T getState() {
        T t = this.currentState;
        return t == null ? readSystemState() : t;
    }

    public final void setState(T t) {
        synchronized (this.lock) {
            T t2 = this.currentState;
            if (t2 == null || !Intrinsics.areEqual(t2, t)) {
                this.currentState = t;
                final List list = CollectionsKt.toList(this.listeners);
                this.taskExecutor.getMainThreadExecutor().execute(new Runnable() { // from class: androidx.work.impl.constraints.trackers.ConstraintTracker$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ConstraintTracker._set_state_$lambda$4$lambda$3(list, this);
                    }
                });
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _set_state_$lambda$4$lambda$3(List list, ConstraintTracker constraintTracker) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((ConstraintListener) it.next()).onConstraintChanged(constraintTracker.currentState);
        }
    }
}
