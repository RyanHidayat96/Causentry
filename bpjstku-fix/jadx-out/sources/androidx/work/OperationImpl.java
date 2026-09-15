package androidx.work;

import androidx.p002lifecycle.LiveData;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0017¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0017¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Landroidx/work/OperationImpl;", "Landroidx/work/Operation;", "Landroidx/lifecycle/LiveData;", "Landroidx/work/Operation$State;", "p0", "Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/work/Operation$State$SUCCESS;", "p1", "<init>", "(Landroidx/lifecycle/LiveData;Lcom/google/common/util/concurrent/ListenableFuture;)V", "getResult", "()Lcom/google/common/util/concurrent/ListenableFuture;", "getState", "()Landroidx/lifecycle/LiveData;", "future", "Lcom/google/common/util/concurrent/ListenableFuture;", RemoteConfigConstants.ResponseFieldKey.STATE, "Landroidx/lifecycle/LiveData;"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class OperationImpl implements Operation {
    private final ListenableFuture<Operation.State.SUCCESS> future;
    private final LiveData<Operation.State> state;

    public OperationImpl(LiveData<Operation.State> liveData, ListenableFuture<Operation.State.SUCCESS> listenableFuture) {
        Intrinsics.checkNotNullParameter(liveData, "");
        Intrinsics.checkNotNullParameter(listenableFuture, "");
        this.state = liveData;
        this.future = listenableFuture;
    }

    @Override // androidx.work.Operation
    public final LiveData<Operation.State> getState() {
        return this.state;
    }

    @Override // androidx.work.Operation
    public final ListenableFuture<Operation.State.SUCCESS> getResult() {
        return this.future;
    }
}
