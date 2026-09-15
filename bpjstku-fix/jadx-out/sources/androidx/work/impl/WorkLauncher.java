package androidx.work.impl;

import androidx.work.WorkInfo;
import androidx.work.WorkerParameters;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\u0005\u0010\tJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u000bH&¢\u0006\u0004\b\n\u0010\fJ\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u000bH&¢\u0006\u0004\b\r\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/work/impl/WorkLauncher;", "", "Landroidx/work/impl/StartStopToken;", "p0", "", "startWork", "(Landroidx/work/impl/StartStopToken;)V", "Landroidx/work/WorkerParameters$RuntimeExtras;", "p1", "(Landroidx/work/impl/StartStopToken;Landroidx/work/WorkerParameters$RuntimeExtras;)V", "stopWork", "", "(Landroidx/work/impl/StartStopToken;I)V", "stopWorkWithReason"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface WorkLauncher {
    void startWork(StartStopToken p0, WorkerParameters.RuntimeExtras p1);

    void stopWork(StartStopToken p0, int p1);

    default void startWork(StartStopToken p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        startWork(p0, null);
    }

    default void stopWork(StartStopToken p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        stopWork(p0, WorkInfo.STOP_REASON_UNKNOWN);
    }

    default void stopWorkWithReason(StartStopToken p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        stopWork(p0, p1);
    }
}
