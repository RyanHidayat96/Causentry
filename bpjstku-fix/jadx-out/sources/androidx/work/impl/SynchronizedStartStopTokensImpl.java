package androidx.work.impl;

import androidx.work.impl.model.WorkGenerationalId;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0002\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\r2\u0006\u0010\u0002\u001a\u00020\fH\u0017¢\u0006\u0004\b\n\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Landroidx/work/impl/SynchronizedStartStopTokensImpl;", "Landroidx/work/impl/StartStopTokens;", "p0", "<init>", "(Landroidx/work/impl/StartStopTokens;)V", "Landroidx/work/impl/model/WorkGenerationalId;", "", "contains", "(Landroidx/work/impl/model/WorkGenerationalId;)Z", "Landroidx/work/impl/StartStopToken;", "remove", "(Landroidx/work/impl/model/WorkGenerationalId;)Landroidx/work/impl/StartStopToken;", "", "", "(Ljava/lang/String;)Ljava/util/List;", "tokenFor", "delegate", "Landroidx/work/impl/StartStopTokens;", "", "lock", "Ljava/lang/Object;"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class SynchronizedStartStopTokensImpl implements StartStopTokens {
    private final StartStopTokens delegate;
    private final Object lock;

    public SynchronizedStartStopTokensImpl(StartStopTokens startStopTokens) {
        Intrinsics.checkNotNullParameter(startStopTokens, "");
        this.delegate = startStopTokens;
        this.lock = new Object();
    }

    @Override // androidx.work.impl.StartStopTokens
    public final StartStopToken tokenFor(WorkGenerationalId p0) {
        StartStopToken startStopToken;
        Intrinsics.checkNotNullParameter(p0, "");
        synchronized (this.lock) {
            startStopToken = this.delegate.tokenFor(p0);
        }
        return startStopToken;
    }

    @Override // androidx.work.impl.StartStopTokens
    public final StartStopToken remove(WorkGenerationalId p0) {
        StartStopToken startStopTokenRemove;
        Intrinsics.checkNotNullParameter(p0, "");
        synchronized (this.lock) {
            startStopTokenRemove = this.delegate.remove(p0);
        }
        return startStopTokenRemove;
    }

    @Override // androidx.work.impl.StartStopTokens
    public final List<StartStopToken> remove(String p0) {
        List<StartStopToken> listRemove;
        Intrinsics.checkNotNullParameter(p0, "");
        synchronized (this.lock) {
            listRemove = this.delegate.remove(p0);
        }
        return listRemove;
    }

    @Override // androidx.work.impl.StartStopTokens
    public final boolean contains(WorkGenerationalId p0) {
        boolean zContains;
        Intrinsics.checkNotNullParameter(p0, "");
        synchronized (this.lock) {
            zContains = this.delegate.contains(p0);
        }
        return zContains;
    }
}
