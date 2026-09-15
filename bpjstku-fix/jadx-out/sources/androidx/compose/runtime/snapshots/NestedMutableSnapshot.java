package androidx.compose.runtime.snapshots;

import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.snapshots.tooling.SnapshotObserverKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001BO\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\u0006\u0010\f\u001a\u00020\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0014\u0010\u0010R\u001a\u0010\u0015\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001c8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e"}, d2 = {"Landroidx/compose/runtime/snapshots/NestedMutableSnapshot;", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "p0", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "p1", "Lkotlin/Function1;", "", "", "p2", "p3", "p4", "<init>", "(JLandroidx/compose/runtime/snapshots/SnapshotIdSet;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/snapshots/MutableSnapshot;)V", "dispose", "()V", "Landroidx/compose/runtime/snapshots/SnapshotApplyResult;", "apply", "()Landroidx/compose/runtime/snapshots/SnapshotApplyResult;", "deactivate", "parent", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "getParent", "()Landroidx/compose/runtime/snapshots/MutableSnapshot;", "", "deactivated", "Z", "Landroidx/compose/runtime/snapshots/Snapshot;", "getRoot", "()Landroidx/compose/runtime/snapshots/Snapshot;", "root"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NestedMutableSnapshot extends MutableSnapshot {
    public static final int $stable = 8;
    private boolean deactivated;
    private final MutableSnapshot parent;

    public final MutableSnapshot getParent() {
        return this.parent;
    }

    public NestedMutableSnapshot(long j, SnapshotIdSet snapshotIdSet, Function1<Object, Unit> function1, Function1<Object, Unit> function2, MutableSnapshot mutableSnapshot) {
        super(j, snapshotIdSet, function1, function2);
        this.parent = mutableSnapshot;
        mutableSnapshot.mo3673nestedActivated$runtime(this);
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public final Snapshot getRoot() {
        return this.parent.getRoot();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public final void dispose() {
        if (getDisposed()) {
            return;
        }
        super.dispose();
        deactivate();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0071 A[Catch: all -> 0x00dc, TryCatch #0 {, blocks: (B:12:0x0036, B:14:0x003e, B:17:0x0045, B:21:0x0061, B:23:0x0069, B:27:0x007f, B:29:0x008b, B:30:0x0090, B:25:0x0071, B:26:0x007a), top: B:39:0x0036 }] */
    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    public final SnapshotApplyResult apply() {
        if (this.parent.getApplied() || this.parent.getDisposed()) {
            return new SnapshotApplyResult.Failure(this);
        }
        MutableScatterSet<StateObject> modified$runtime = getModified$runtime();
        long snapshotId = getSnapshotId();
        Map<StateRecord, ? extends StateRecord> mapOptimisticMerges = modified$runtime != null ? SnapshotKt.optimisticMerges(this.parent.getSnapshotId(), this, this.parent.getInvalid()) : null;
        synchronized (SnapshotKt.getLock()) {
            SnapshotKt.validateOpen(this);
            if (modified$runtime == null || modified$runtime.get_size() == 0) {
                closeAndReleasePinning$runtime();
                Unit unit = Unit.INSTANCE;
            } else {
                SnapshotApplyResult snapshotApplyResultInnerApplyLocked$runtime = innerApplyLocked$runtime(this.parent.getSnapshotId(), modified$runtime, mapOptimisticMerges, this.parent.getInvalid());
                if (!Intrinsics.areEqual(snapshotApplyResultInnerApplyLocked$runtime, SnapshotApplyResult.Success.INSTANCE)) {
                    return snapshotApplyResultInnerApplyLocked$runtime;
                }
                MutableScatterSet<StateObject> modified$runtime2 = this.parent.getModified$runtime();
                if (modified$runtime2 != null) {
                    modified$runtime2.addAll(modified$runtime);
                    if (modified$runtime2 == null) {
                        this.parent.setModified$runtime(modified$runtime);
                        setModified$runtime(null);
                    }
                } else {
                    this.parent.setModified$runtime(modified$runtime);
                    setModified$runtime(null);
                }
            }
            if (Intrinsics.compare(this.parent.getSnapshotId(), snapshotId) < 0) {
                this.parent.advance$runtime();
            }
            MutableSnapshot mutableSnapshot = this.parent;
            mutableSnapshot.setInvalid$runtime(mutableSnapshot.getInvalid().clear(snapshotId).andNot(getPreviousIds()));
            this.parent.recordPrevious$runtime(snapshotId);
            this.parent.recordPreviousPinnedSnapshot$runtime(takeoverPinnedSnapshot$runtime());
            this.parent.recordPreviousList$runtime(getPreviousIds());
            this.parent.recordPreviousPinnedSnapshots$runtime(getPreviousPinnedSnapshots());
            Unit unit2 = Unit.INSTANCE;
            setApplied$runtime(true);
            deactivate();
            SnapshotObserverKt.dispatchObserverOnApplied(this, modified$runtime);
            return SnapshotApplyResult.Success.INSTANCE;
        }
    }

    private final void deactivate() {
        if (this.deactivated) {
            return;
        }
        this.deactivated = true;
        this.parent.mo3674nestedDeactivated$runtime(this);
    }
}
