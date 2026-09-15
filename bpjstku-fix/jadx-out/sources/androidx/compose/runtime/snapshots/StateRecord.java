package androidx.compose.runtime.snapshots;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\b'\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0007B\u0011\b\u0017\u0012\u0006\u0010\u0004\u001a\u00020\b¢\u0006\u0004\b\u0005\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0000H&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0000H'¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\r\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\bH\u0017¢\u0006\u0004\b\r\u0010\u000fJ\u001b\u0010\r\u001a\u00020\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0017¢\u0006\u0004\b\r\u0010\u0010R&\u0010\u0011\u001a\u00060\u0002j\u0002`\u00038\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0006R$\u0010\u0016\u001a\u0004\u0018\u00010\u00008\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\f"}, d2 = {"Landroidx/compose/runtime/snapshots/StateRecord;", "", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "p0", "<init>", "(J)V", "()V", "", "(I)V", "", "assign", "(Landroidx/compose/runtime/snapshots/StateRecord;)V", "create", "()Landroidx/compose/runtime/snapshots/StateRecord;", "(I)Landroidx/compose/runtime/snapshots/StateRecord;", "(J)Landroidx/compose/runtime/snapshots/StateRecord;", "snapshotId", "J", "getSnapshotId$runtime", "()J", "setSnapshotId$runtime", "next", "Landroidx/compose/runtime/snapshots/StateRecord;", "getNext$runtime", "setNext$runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class StateRecord {
    public static final int $stable = 8;
    private StateRecord next;
    private long snapshotId;

    public abstract void assign(StateRecord p0);

    public abstract StateRecord create();

    public StateRecord(long j) {
        this.snapshotId = j;
    }

    /* JADX INFO: renamed from: getSnapshotId$runtime, reason: from getter */
    public final long getSnapshotId() {
        return this.snapshotId;
    }

    public final void setSnapshotId$runtime(long j) {
        this.snapshotId = j;
    }

    public StateRecord() {
        this(SnapshotKt.currentSnapshot().getSnapshotId());
    }

    @Deprecated(message = "Use snapshotId: Long constructor instead")
    public StateRecord(int i) {
        this(SnapshotId_jvmKt.toSnapshotId(i));
    }

    /* JADX INFO: renamed from: getNext$runtime, reason: from getter */
    public final StateRecord getNext() {
        return this.next;
    }

    public final void setNext$runtime(StateRecord stateRecord) {
        this.next = stateRecord;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use snapshotId: Long version instead")
    public /* synthetic */ StateRecord create(int p0) {
        StateRecord stateRecordCreate = create();
        stateRecordCreate.snapshotId = SnapshotId_jvmKt.toSnapshotId(p0);
        return stateRecordCreate;
    }

    public StateRecord create(long p0) {
        StateRecord stateRecordCreate = create();
        stateRecordCreate.snapshotId = p0;
        return stateRecordCreate;
    }
}
