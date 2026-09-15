package androidx.work.impl.utils;

import androidx.work.Logger;
import androidx.work.WorkInfo;
import androidx.work.impl.Processor;
import androidx.work.impl.StartStopToken;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Landroidx/work/impl/utils/StopWorkRunnable;", "Ljava/lang/Runnable;", "Landroidx/work/impl/Processor;", "p0", "Landroidx/work/impl/StartStopToken;", "p1", "", "p2", "<init>", "(Landroidx/work/impl/Processor;Landroidx/work/impl/StartStopToken;Z)V", "", "p3", "(Landroidx/work/impl/Processor;Landroidx/work/impl/StartStopToken;ZI)V", "", "run", "()V", "processor", "Landroidx/work/impl/Processor;", "reason", "I", "stopInForeground", "Z", "token", "Landroidx/work/impl/StartStopToken;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class StopWorkRunnable implements Runnable {
    private final Processor processor;
    private final int reason;
    private final boolean stopInForeground;
    private final StartStopToken token;

    public StopWorkRunnable(Processor processor, StartStopToken startStopToken, boolean z, int i) {
        Intrinsics.checkNotNullParameter(processor, "");
        Intrinsics.checkNotNullParameter(startStopToken, "");
        this.processor = processor;
        this.token = startStopToken;
        this.stopInForeground = z;
        this.reason = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StopWorkRunnable(Processor processor, StartStopToken startStopToken, boolean z) {
        this(processor, startStopToken, z, WorkInfo.STOP_REASON_UNKNOWN);
        Intrinsics.checkNotNullParameter(processor, "");
        Intrinsics.checkNotNullParameter(startStopToken, "");
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zStopWork;
        if (this.stopInForeground) {
            zStopWork = this.processor.stopForegroundWork(this.token, this.reason);
        } else {
            zStopWork = this.processor.stopWork(this.token, this.reason);
        }
        Logger logger = Logger.get();
        String strTagWithPrefix = Logger.tagWithPrefix("StopWorkRunnable");
        StringBuilder sb = new StringBuilder("StopWorkRunnable for ");
        sb.append(this.token.getId().getWorkSpecId());
        sb.append("; Processor.stopWork = ");
        sb.append(zStopWork);
        logger.debug(strTagWithPrefix, sb.toString());
    }
}
