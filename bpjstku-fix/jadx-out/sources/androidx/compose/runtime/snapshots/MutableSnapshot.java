package androidx.compose.runtime.snapshots;

import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.collection.ScatterSetWrapperKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.snapshots.tooling.SnapshotInstanceObservers;
import androidx.compose.runtime.snapshots.tooling.SnapshotObserver;
import androidx.compose.runtime.snapshots.tooling.SnapshotObserverKt;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u001d\n\u0002\u0010 \n\u0002\b\u0017\b\u0017\u0018\u0000 g2\u00020\u0001:\u0001gBI\b\u0000\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J?\u0010\u0011\u001a\u00020\u00002\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00072\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007H\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u0018\u001a\u00020\u00012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007H\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u001c\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\tH\u0010¢\u0006\u0004\b\u001d\u0010\u0017J\u000f\u0010\u001e\u001a\u00020\tH\u0010¢\u0006\u0004\b\u001e\u0010\u0017J\u000f\u0010\u001f\u001a\u00020\tH\u0010¢\u0006\u0004\b\u001f\u0010\u0017J\u000f\u0010 \u001a\u00020\tH\u0002¢\u0006\u0004\b \u0010\u0017J\u000f\u0010!\u001a\u00020\tH\u0002¢\u0006\u0004\b!\u0010\u0017J\u000f\u0010\"\u001a\u00020\tH\u0002¢\u0006\u0004\b\"\u0010\u0017JG\u0010'\u001a\u00020\u00132\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020$0#2\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020&\u0018\u00010%2\u0006\u0010\u000b\u001a\u00020\u0005H\u0001¢\u0006\u0004\b'\u0010(J$\u0010+\u001a\u00028\u0000\"\u0004\b\u0000\u0010)2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000*H\u0080\b¢\u0006\u0004\b+\u0010,J\u000f\u0010+\u001a\u00020\tH\u0000¢\u0006\u0004\b+\u0010\u0017J\u001b\u0010-\u001a\u00020\t2\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0000¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020/H\u0000¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020\t2\u0006\u0010\u0004\u001a\u000202H\u0000¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\tH\u0002¢\u0006\u0004\b5\u0010\u0017J\u0017\u00106\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005H\u0000¢\u0006\u0004\b6\u00107J\u0017\u00108\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020$H\u0010¢\u0006\u0004\b8\u00109R(\u0010:\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00078\u0011X\u0091\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R(\u0010>\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00078\u0011X\u0091\u0004¢\u0006\f\n\u0004\b>\u0010;\u001a\u0004\b?\u0010=R\u0014\u0010A\u001a\u00020\u000e8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010\u0010R\u0014\u0010D\u001a\u00020\u00018WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR\"\u0010E\u001a\u00020/8\u0011@\u0011X\u0091\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u00101R*\u0010J\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#8\u0011@\u0011X\u0091\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR*\u0010Q\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010P8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\"\u0010W\u001a\u00020\u00058\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u00107R\"\u0010\\\u001a\u0002028\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u00104R\u0016\u0010a\u001a\u00020/8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\ba\u0010FR\"\u0010b\u001a\u00020\u000e8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010\u0010\"\u0004\be\u0010f"}, d2 = {"Landroidx/compose/runtime/snapshots/MutableSnapshot;", "Landroidx/compose/runtime/snapshots/Snapshot;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "p0", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "p1", "Lkotlin/Function1;", "", "", "p2", "p3", "<init>", "(JLandroidx/compose/runtime/snapshots/SnapshotIdSet;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "", "hasPendingChanges", "()Z", "takeNestedMutableSnapshot", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/MutableSnapshot;", "Landroidx/compose/runtime/snapshots/SnapshotApplyResult;", "apply", "()Landroidx/compose/runtime/snapshots/SnapshotApplyResult;", "dispose", "()V", "takeNestedSnapshot", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/Snapshot;", "nestedActivated$runtime", "(Landroidx/compose/runtime/snapshots/Snapshot;)V", "nestedDeactivated$runtime", "notifyObjectsInitialized$runtime", "closeLocked$runtime", "releasePinnedSnapshotsForCloseLocked$runtime", "validateNotApplied", "validateNotAppliedOrPinned", "abandon", "Landroidx/collection/MutableScatterSet;", "Landroidx/compose/runtime/snapshots/StateObject;", "", "Landroidx/compose/runtime/snapshots/StateRecord;", "innerApplyLocked$runtime", "(JLandroidx/collection/MutableScatterSet;Ljava/util/Map;Landroidx/compose/runtime/snapshots/SnapshotIdSet;)Landroidx/compose/runtime/snapshots/SnapshotApplyResult;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function0;", "advance$runtime", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "recordPrevious$runtime", "(J)V", "", "recordPreviousPinnedSnapshot$runtime", "(I)V", "", "recordPreviousPinnedSnapshots$runtime", "([I)V", "releasePreviouslyPinnedSnapshotsLocked", "recordPreviousList$runtime", "(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)V", "recordModified$runtime", "(Landroidx/compose/runtime/snapshots/StateObject;)V", "readObserver", "Lkotlin/jvm/functions/Function1;", "getReadObserver$runtime", "()Lkotlin/jvm/functions/Function1;", "writeObserver", "getWriteObserver$runtime", "getReadOnly", "readOnly", "getRoot", "()Landroidx/compose/runtime/snapshots/Snapshot;", "root", "writeCount", "I", "getWriteCount$runtime", "()I", "setWriteCount$runtime", "modified", "Landroidx/collection/MutableScatterSet;", "getModified$runtime", "()Landroidx/collection/MutableScatterSet;", "setModified$runtime", "(Landroidx/collection/MutableScatterSet;)V", "", "merged", "Ljava/util/List;", "getMerged$runtime", "()Ljava/util/List;", "setMerged$runtime", "(Ljava/util/List;)V", "previousIds", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "getPreviousIds$runtime", "()Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "setPreviousIds$runtime", "previousPinnedSnapshots", "[I", "getPreviousPinnedSnapshots$runtime", "()[I", "setPreviousPinnedSnapshots$runtime", "snapshots", "applied", "Z", "getApplied$runtime", "setApplied$runtime", "(Z)V", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class MutableSnapshot extends Snapshot {
    private boolean applied;
    private List<? extends StateObject> merged;
    private MutableScatterSet<StateObject> modified;
    private SnapshotIdSet previousIds;
    private int[] previousPinnedSnapshots;
    private final Function1<Object, Unit> readObserver;
    private int snapshots;
    private int writeCount;
    private final Function1<Object, Unit> writeObserver;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int[] EmptyIntArray = new int[0];

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public boolean getReadOnly() {
        return false;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* JADX INFO: renamed from: getReadObserver$runtime, reason: merged with bridge method [inline-methods] */
    public Function1<Object, Unit> getReadObserver() {
        return this.readObserver;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public Function1<Object, Unit> getWriteObserver$runtime() {
        return this.writeObserver;
    }

    public MutableSnapshot(long j, SnapshotIdSet snapshotIdSet, Function1<Object, Unit> function1, Function1<Object, Unit> function2) {
        super(j, snapshotIdSet, (DefaultConstructorMarker) null);
        this.readObserver = function1;
        this.writeObserver = function2;
        this.previousIds = SnapshotIdSet.INSTANCE.getEMPTY();
        this.previousPinnedSnapshots = EmptyIntArray;
        this.snapshots = 1;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public boolean hasPendingChanges() {
        MutableScatterSet<StateObject> modified$runtime = getModified$runtime();
        return modified$runtime != null && modified$runtime.isNotEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MutableSnapshot takeNestedMutableSnapshot$default(MutableSnapshot mutableSnapshot, Function1 function1, Function1 function2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: takeNestedMutableSnapshot");
        }
        if ((i & 1) != 0) {
            function1 = null;
        }
        if ((i & 2) != 0) {
            function2 = null;
        }
        return mutableSnapshot.takeNestedMutableSnapshot(function1, function2);
    }

    public MutableSnapshot takeNestedMutableSnapshot(Function1<Object, Unit> p0, Function1<Object, Unit> p1) {
        Function1<Object, Unit> function1;
        Function1<Object, Unit> function2;
        Map<SnapshotObserver, SnapshotInstanceObservers> second;
        NestedMutableSnapshot nestedMutableSnapshot;
        validateNotDisposed$runtime();
        validateNotAppliedOrPinned();
        PersistentList persistentList = SnapshotObserverKt.observers;
        if (persistentList != null) {
            Pair<SnapshotInstanceObservers, Map<SnapshotObserver, SnapshotInstanceObservers>> pairMergeObservers = SnapshotObserverKt.mergeObservers(persistentList, this, false, p0, p1);
            SnapshotInstanceObservers first = pairMergeObservers.getFirst();
            Function1<Object, Unit> readObserver = first.getReadObserver();
            Function1<Object, Unit> writeObserver = first.getWriteObserver();
            second = pairMergeObservers.getSecond();
            function2 = writeObserver;
            function1 = readObserver;
        } else {
            function1 = p0;
            function2 = p1;
            second = null;
        }
        recordPrevious$runtime(getSnapshotId());
        synchronized (SnapshotKt.getLock()) {
            long j = SnapshotKt.nextSnapshotId;
            SnapshotKt.nextSnapshotId++;
            SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(j);
            SnapshotIdSet invalid = getInvalid();
            setInvalid$runtime(invalid.set(j));
            nestedMutableSnapshot = new NestedMutableSnapshot(j, SnapshotKt.addRange(invalid, getSnapshotId() + 1, j), SnapshotKt.mergedReadObserver$default(function1, getReadObserver(), false, 4, null), SnapshotKt.mergedWriteObserver(function2, getWriteObserver$runtime()), this);
        }
        if (!getApplied() && !getDisposed()) {
            long snapshotId = getSnapshotId();
            synchronized (SnapshotKt.getLock()) {
                long j2 = SnapshotKt.nextSnapshotId;
                SnapshotKt.nextSnapshotId++;
                setSnapshotId$runtime(j2);
                SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(getSnapshotId());
                Unit unit = Unit.INSTANCE;
            }
            setInvalid$runtime(SnapshotKt.addRange(getInvalid(), snapshotId + 1, getSnapshotId()));
        }
        NestedMutableSnapshot nestedMutableSnapshot2 = nestedMutableSnapshot;
        if (persistentList != null) {
            SnapshotObserverKt.dispatchCreatedObservers(persistentList, this, nestedMutableSnapshot2, second);
        }
        return nestedMutableSnapshot2;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0148 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x014a A[Catch: all -> 0x01be, LOOP:2: B:46:0x011a->B:56:0x014a, LOOP_END, TryCatch #1 {, blocks: (B:41:0x00fe, B:43:0x010e, B:46:0x011a, B:48:0x0124, B:50:0x012e, B:52:0x0138, B:53:0x0142, B:56:0x014a, B:58:0x0150, B:61:0x015c, B:63:0x0166, B:65:0x0170, B:67:0x017a, B:68:0x0185, B:74:0x0196, B:75:0x0199, B:77:0x019d, B:79:0x01a7, B:80:0x01b3), top: B:92:0x00fe }] */
    /* JADX WARN: Code duplicated, block: B:97:0x014e A[EDGE_INSN: B:97:0x014e->B:57:0x014e BREAK  A[LOOP:2: B:46:0x011a->B:56:0x014a], SYNTHETIC] */
    public SnapshotApplyResult apply() {
        Map<StateRecord, ? extends StateRecord> mapOptimisticMerges;
        List list;
        MutableScatterSet<StateObject> modified$runtime;
        MutableScatterSet<StateObject> modified$runtime2 = getModified$runtime();
        if (modified$runtime2 != null) {
            GlobalSnapshot globalSnapshot = SnapshotKt.globalSnapshot;
            mapOptimisticMerges = SnapshotKt.optimisticMerges(globalSnapshot.getSnapshotId(), this, SnapshotKt.openSnapshots.clear(globalSnapshot.getSnapshotId()));
        } else {
            mapOptimisticMerges = null;
        }
        List listEmptyList = CollectionsKt.emptyList();
        synchronized (SnapshotKt.getLock()) {
            SnapshotKt.validateOpen(this);
            if (modified$runtime2 != null && modified$runtime2.get_size() != 0) {
                GlobalSnapshot globalSnapshot2 = SnapshotKt.globalSnapshot;
                SnapshotApplyResult snapshotApplyResultInnerApplyLocked$runtime = innerApplyLocked$runtime(SnapshotKt.nextSnapshotId, modified$runtime2, mapOptimisticMerges, SnapshotKt.openSnapshots.clear(globalSnapshot2.getSnapshotId()));
                if (!Intrinsics.areEqual(snapshotApplyResultInnerApplyLocked$runtime, SnapshotApplyResult.Success.INSTANCE)) {
                    return snapshotApplyResultInnerApplyLocked$runtime;
                }
                closeLocked$runtime();
                modified$runtime = globalSnapshot2.getModified$runtime();
                SnapshotKt.resetGlobalSnapshotLocked(globalSnapshot2, SnapshotKt.emptyLambda);
                setModified$runtime(null);
                globalSnapshot2.setModified$runtime(null);
                list = SnapshotKt.applyObservers;
            } else {
                closeLocked$runtime();
                GlobalSnapshot globalSnapshot3 = SnapshotKt.globalSnapshot;
                MutableScatterSet<StateObject> modified$runtime3 = globalSnapshot3.getModified$runtime();
                SnapshotKt.resetGlobalSnapshotLocked(globalSnapshot3, SnapshotKt.emptyLambda);
                if (modified$runtime3 == null || !modified$runtime3.isNotEmpty()) {
                    list = listEmptyList;
                    modified$runtime = null;
                } else {
                    list = SnapshotKt.applyObservers;
                    modified$runtime = modified$runtime3;
                }
            }
            Unit unit = Unit.INSTANCE;
            this.applied = true;
            if (modified$runtime != null) {
                Set setWrapIntoSet = ScatterSetWrapperKt.wrapIntoSet(modified$runtime);
                if (!setWrapIntoSet.isEmpty()) {
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        ((Function2) list.get(i)).invoke(setWrapIntoSet, this);
                    }
                }
            }
            if (modified$runtime2 != null && modified$runtime2.isNotEmpty()) {
                Set setWrapIntoSet2 = ScatterSetWrapperKt.wrapIntoSet(modified$runtime2);
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((Function2) list.get(i2)).invoke(setWrapIntoSet2, this);
                }
            }
            SnapshotObserverKt.dispatchObserverOnApplied(this, modified$runtime2);
            synchronized (SnapshotKt.getLock()) {
                releasePinnedSnapshotsForCloseLocked$runtime();
                SnapshotKt.checkAndOverwriteUnusedRecordsLocked();
                if (modified$runtime != null) {
                    MutableScatterSet<StateObject> mutableScatterSet = modified$runtime;
                    Object[] objArr = mutableScatterSet.elements;
                    long[] jArr = mutableScatterSet.metadata;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i3 = 0;
                        while (true) {
                            long j = jArr[i3];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                if (i3 != length) {
                                    break;
                                    break;
                                }
                                i3++;
                            } else {
                                int i4 = 8 - ((~(i3 - length)) >>> 31);
                                for (int i5 = 0; i5 < i4; i5++) {
                                    if ((j & 255) < 128) {
                                        SnapshotKt.processForUnusedRecordsLocked((StateObject) objArr[(i3 << 3) + i5]);
                                    }
                                    j >>= 8;
                                }
                                if (i4 != 8) {
                                    break;
                                }
                                if (i3 != length) {
                                    break;
                                }
                                i3++;
                            }
                        }
                    }
                }
                if (modified$runtime2 != null) {
                    MutableScatterSet<StateObject> mutableScatterSet2 = modified$runtime2;
                    Object[] objArr2 = mutableScatterSet2.elements;
                    long[] jArr2 = mutableScatterSet2.metadata;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i6 = 0;
                        while (true) {
                            long j2 = jArr2[i6];
                            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i7 = 8 - ((~(i6 - length2)) >>> 31);
                                for (int i8 = 0; i8 < i7; i8++) {
                                    if ((j2 & 255) < 128) {
                                        SnapshotKt.processForUnusedRecordsLocked((StateObject) objArr2[(i6 << 3) + i8]);
                                    }
                                    j2 >>= 8;
                                }
                                if (i7 != 8) {
                                    break;
                                }
                            }
                            if (i6 == length2) {
                                break;
                            }
                            i6++;
                        }
                    }
                }
                List<? extends StateObject> list2 = this.merged;
                if (list2 != null) {
                    int size3 = list2.size();
                    for (int i9 = 0; i9 < size3; i9++) {
                        SnapshotKt.processForUnusedRecordsLocked(list2.get(i9));
                    }
                }
                this.merged = null;
                Unit unit2 = Unit.INSTANCE;
            }
            return SnapshotApplyResult.Success.INSTANCE;
        }
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public Snapshot getRoot() {
        return this;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void dispose() {
        if (getDisposed()) {
            return;
        }
        super.dispose();
        MutableSnapshot mutableSnapshot = this;
        mo3674nestedDeactivated$runtime(mutableSnapshot);
        SnapshotObserverKt.dispatchObserverOnPreDispose(mutableSnapshot);
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public Snapshot takeNestedSnapshot(Function1<Object, Unit> p0) {
        Function1<Object, Unit> function1;
        Map<SnapshotObserver, SnapshotInstanceObservers> second;
        NestedReadonlySnapshot nestedReadonlySnapshot;
        validateNotDisposed$runtime();
        validateNotAppliedOrPinned();
        long snapshotId = getSnapshotId();
        MutableSnapshot mutableSnapshot = this instanceof GlobalSnapshot ? null : this;
        PersistentList persistentList = SnapshotObserverKt.observers;
        if (persistentList != null) {
            Pair<SnapshotInstanceObservers, Map<SnapshotObserver, SnapshotInstanceObservers>> pairMergeObservers = SnapshotObserverKt.mergeObservers(persistentList, mutableSnapshot, true, p0, null);
            SnapshotInstanceObservers first = pairMergeObservers.getFirst();
            Function1<Object, Unit> readObserver = first.getReadObserver();
            first.getWriteObserver();
            second = pairMergeObservers.getSecond();
            function1 = readObserver;
        } else {
            function1 = p0;
            second = null;
        }
        recordPrevious$runtime(getSnapshotId());
        synchronized (SnapshotKt.getLock()) {
            long j = SnapshotKt.nextSnapshotId;
            SnapshotKt.nextSnapshotId++;
            SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(j);
            nestedReadonlySnapshot = new NestedReadonlySnapshot(j, SnapshotKt.addRange(getInvalid(), snapshotId + 1, j), SnapshotKt.mergedReadObserver$default(function1, getReadObserver(), false, 4, null), this);
        }
        if (!getApplied() && !getDisposed()) {
            long snapshotId2 = getSnapshotId();
            synchronized (SnapshotKt.getLock()) {
                long j2 = SnapshotKt.nextSnapshotId;
                SnapshotKt.nextSnapshotId++;
                setSnapshotId$runtime(j2);
                SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(getSnapshotId());
                Unit unit = Unit.INSTANCE;
            }
            setInvalid$runtime(SnapshotKt.addRange(getInvalid(), snapshotId2 + 1, getSnapshotId()));
        }
        NestedReadonlySnapshot nestedReadonlySnapshot2 = nestedReadonlySnapshot;
        if (persistentList != null) {
            SnapshotObserverKt.dispatchCreatedObservers(persistentList, mutableSnapshot, nestedReadonlySnapshot2, second);
        }
        return nestedReadonlySnapshot2;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* JADX INFO: renamed from: nestedActivated$runtime */
    public void mo3673nestedActivated$runtime(Snapshot p0) {
        this.snapshots++;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* JADX INFO: renamed from: nestedDeactivated$runtime */
    public void mo3674nestedDeactivated$runtime(Snapshot p0) {
        if (this.snapshots <= 0) {
            PreconditionsKt.throwIllegalArgumentException("no pending nested snapshots");
        }
        int i = this.snapshots - 1;
        this.snapshots = i;
        if (i != 0 || this.applied) {
            return;
        }
        abandon();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void notifyObjectsInitialized$runtime() {
        if (this.applied || getDisposed()) {
            return;
        }
        advance$runtime();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void closeLocked$runtime() {
        SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.clear(getSnapshotId()).andNot(this.previousIds);
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void releasePinnedSnapshotsForCloseLocked$runtime() {
        releasePreviouslyPinnedSnapshotsLocked();
        super.releasePinnedSnapshotsForCloseLocked$runtime();
    }

    private final void validateNotApplied() {
        if (this.applied) {
            PreconditionsKt.throwIllegalStateException("Unsupported operation on a snapshot that has been applied");
        }
    }

    private final void validateNotAppliedOrPinned() {
        if (!this.applied || ((Snapshot) this).pinningTrackingHandle >= 0) {
            return;
        }
        PreconditionsKt.throwIllegalStateException("Unsupported operation on a disposed or applied snapshot");
    }

    /* JADX WARN: Code duplicated, block: B:23:0x007e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0080 A[LOOP:0: B:7:0x0020->B:24:0x0080, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x0083 A[EDGE_INSN: B:28:0x0083->B:25:0x0083 BREAK  A[LOOP:0: B:7:0x0020->B:24:0x0080], SYNTHETIC] */
    private final void abandon() {
        MutableScatterSet<StateObject> modified$runtime = getModified$runtime();
        if (modified$runtime != null) {
            validateNotApplied();
            setModified$runtime(null);
            long snapshotId = getSnapshotId();
            MutableScatterSet<StateObject> mutableScatterSet = modified$runtime;
            Object[] objArr = mutableScatterSet.elements;
            long[] jArr = mutableScatterSet.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i != length) {
                            break;
                            break;
                        }
                        i++;
                    } else {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                for (StateRecord firstStateRecord = ((StateObject) objArr[(i << 3) + i3]).getFirstStateRecord(); firstStateRecord != null; firstStateRecord = firstStateRecord.getNext()) {
                                    if (firstStateRecord.getSnapshotId() == snapshotId || CollectionsKt.contains(this.previousIds, Long.valueOf(firstStateRecord.getSnapshotId()))) {
                                        firstStateRecord.setSnapshotId$runtime(SnapshotKt.INVALID_SNAPSHOT);
                                    }
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        } else if (i != length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
        }
        closeAndReleasePinning$runtime();
    }

    public final SnapshotApplyResult innerApplyLocked$runtime(long p0, MutableScatterSet<StateObject> p1, Map<StateRecord, ? extends StateRecord> p2, SnapshotIdSet p3) {
        SnapshotIdSet snapshotIdSet;
        long[] jArr;
        Object[] objArr;
        int i;
        long[] jArr2;
        Object[] objArr2;
        int i2;
        StateRecord stateRecord;
        StateRecord stateRecordMergeRecords;
        SnapshotIdSet snapshotIdSetOr = getInvalid().set(getSnapshotId()).or(this.previousIds);
        MutableScatterSet<StateObject> mutableScatterSet = p1;
        Object[] objArr3 = mutableScatterSet.elements;
        long[] jArr3 = mutableScatterSet.metadata;
        int length = jArr3.length - 2;
        ArrayList arrayList = null;
        ArrayList arrayListPlus = null;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr3[i3];
                ArrayList arrayList2 = arrayList;
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8;
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((j & 255) < 128) {
                            StateObject stateObject = (StateObject) objArr3[(i3 << 3) + i6];
                            jArr2 = jArr3;
                            StateRecord firstStateRecord = stateObject.getFirstStateRecord();
                            objArr2 = objArr3;
                            StateRecord stateRecord2 = SnapshotKt.readable(firstStateRecord, p0, p3);
                            if (stateRecord2 != null && (stateRecord = SnapshotKt.readable(firstStateRecord, getSnapshotId(), snapshotIdSetOr)) != null && stateRecord.getSnapshotId() != SnapshotId_jvmKt.toSnapshotId(1) && !Intrinsics.areEqual(stateRecord2, stateRecord)) {
                                i2 = length;
                                snapshotIdSetOr = snapshotIdSetOr;
                                StateRecord stateRecord3 = SnapshotKt.readable(firstStateRecord, getSnapshotId(), getInvalid());
                                if (stateRecord3 == null) {
                                    SnapshotKt.readError();
                                    throw new KotlinNothingValueException();
                                }
                                if (p2 == null || (stateRecordMergeRecords = p2.get(stateRecord2)) == null) {
                                    stateRecordMergeRecords = stateObject.mergeRecords(stateRecord, stateRecord2, stateRecord3);
                                }
                                if (stateRecordMergeRecords == null) {
                                    return new SnapshotApplyResult.Failure(this);
                                }
                                if (!Intrinsics.areEqual(stateRecordMergeRecords, stateRecord3)) {
                                    if (Intrinsics.areEqual(stateRecordMergeRecords, stateRecord2)) {
                                        if (arrayList2 == null) {
                                            arrayList2 = new ArrayList();
                                        }
                                        ArrayList arrayList3 = arrayList2;
                                        arrayList3.add(TuplesKt.to(stateObject, stateRecord2.create(getSnapshotId())));
                                        if (arrayListPlus == null) {
                                            arrayListPlus = new ArrayList();
                                        }
                                        arrayListPlus.add(stateObject);
                                        arrayList2 = arrayList3;
                                    } else {
                                        if (arrayList2 == null) {
                                            arrayList2 = new ArrayList();
                                        }
                                        ArrayList arrayList4 = arrayList2;
                                        arrayList4.add(!Intrinsics.areEqual(stateRecordMergeRecords, stateRecord) ? TuplesKt.to(stateObject, stateRecordMergeRecords) : TuplesKt.to(stateObject, stateRecord.create(getSnapshotId())));
                                        arrayList2 = arrayList4;
                                    }
                                }
                            }
                            j >>= 8;
                            i6++;
                            i4 = 8;
                            length = i2;
                            jArr3 = jArr2;
                            objArr3 = objArr2;
                            snapshotIdSetOr = snapshotIdSetOr;
                            p0 = p0;
                        } else {
                            jArr2 = jArr3;
                            objArr2 = objArr3;
                        }
                        i2 = length;
                        j >>= 8;
                        i6++;
                        i4 = 8;
                        length = i2;
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                        snapshotIdSetOr = snapshotIdSetOr;
                        p0 = p0;
                    }
                    snapshotIdSet = snapshotIdSetOr;
                    jArr = jArr3;
                    objArr = objArr3;
                    i = length;
                    int i7 = i4;
                    arrayList = arrayList2;
                    if (i5 != i7) {
                        break;
                    }
                } else {
                    snapshotIdSet = snapshotIdSetOr;
                    jArr = jArr3;
                    objArr = objArr3;
                    i = length;
                    arrayList = arrayList2;
                }
                if (i3 == i) {
                    break;
                }
                i3++;
                length = i;
                jArr3 = jArr;
                objArr3 = objArr;
                snapshotIdSetOr = snapshotIdSet;
            }
        }
        if (arrayList != null) {
            advance$runtime();
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                Pair pair = (Pair) arrayList.get(i8);
                StateObject stateObject2 = (StateObject) pair.component1();
                StateRecord stateRecord4 = (StateRecord) pair.component2();
                stateRecord4.setSnapshotId$runtime(p0);
                synchronized (SnapshotKt.getLock()) {
                    stateRecord4.setNext$runtime(stateObject2.getFirstStateRecord());
                    stateObject2.prependStateRecord(stateRecord4);
                    Unit unit = Unit.INSTANCE;
                }
            }
        }
        if (arrayListPlus != null) {
            int size2 = arrayListPlus.size();
            for (int i9 = 0; i9 < size2; i9++) {
                p1.remove(arrayListPlus.get(i9));
            }
            List<? extends StateObject> list = this.merged;
            if (list != null) {
                arrayListPlus = CollectionsKt.plus((Collection) list, (Iterable) arrayListPlus);
            }
            this.merged = arrayListPlus;
        }
        return SnapshotApplyResult.Success.INSTANCE;
    }

    public final <T> T advance$runtime(Function0<? extends T> p0) {
        recordPrevious$runtime(getSnapshotId());
        T tInvoke = p0.invoke();
        if (getApplied() || getDisposed()) {
            return tInvoke;
        }
        long snapshotId = getSnapshotId();
        synchronized (SnapshotKt.getLock()) {
            long j = SnapshotKt.nextSnapshotId;
            SnapshotKt.nextSnapshotId++;
            setSnapshotId$runtime(j);
            SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(getSnapshotId());
            Unit unit = Unit.INSTANCE;
        }
        setInvalid$runtime(SnapshotKt.addRange(getInvalid(), snapshotId + 1, getSnapshotId()));
        return tInvoke;
    }

    public final void recordPreviousPinnedSnapshot$runtime(int p0) {
        if (p0 >= 0) {
            this.previousPinnedSnapshots = ArraysKt.plus(this.previousPinnedSnapshots, p0);
        }
    }

    public final void recordPreviousPinnedSnapshots$runtime(int[] p0) {
        if (p0.length == 0) {
            return;
        }
        int[] iArr = this.previousPinnedSnapshots;
        if (iArr.length != 0) {
            p0 = ArraysKt.plus(iArr, p0);
        }
        this.previousPinnedSnapshots = p0;
    }

    private final void releasePreviouslyPinnedSnapshotsLocked() {
        int length = this.previousPinnedSnapshots.length;
        for (int i = 0; i < length; i++) {
            SnapshotKt.releasePinningLocked(this.previousPinnedSnapshots[i]);
        }
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* JADX INFO: renamed from: recordModified$runtime */
    public void mo3675recordModified$runtime(StateObject p0) {
        MutableScatterSet<StateObject> modified$runtime = getModified$runtime();
        if (modified$runtime == null) {
            modified$runtime = ScatterSetKt.mutableScatterSetOf();
            setModified$runtime(modified$runtime);
        }
        modified$runtime.add(p0);
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* JADX INFO: renamed from: getWriteCount$runtime, reason: from getter */
    public int getWriteCount() {
        return this.writeCount;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void setWriteCount$runtime(int i) {
        this.writeCount = i;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public MutableScatterSet<StateObject> getModified$runtime() {
        return this.modified;
    }

    public void setModified$runtime(MutableScatterSet<StateObject> mutableScatterSet) {
        this.modified = mutableScatterSet;
    }

    public final List<StateObject> getMerged$runtime() {
        return this.merged;
    }

    public final void setMerged$runtime(List<? extends StateObject> list) {
        this.merged = list;
    }

    /* JADX INFO: renamed from: getPreviousIds$runtime, reason: from getter */
    public final SnapshotIdSet getPreviousIds() {
        return this.previousIds;
    }

    public final void setPreviousIds$runtime(SnapshotIdSet snapshotIdSet) {
        this.previousIds = snapshotIdSet;
    }

    /* JADX INFO: renamed from: getPreviousPinnedSnapshots$runtime, reason: from getter */
    public final int[] getPreviousPinnedSnapshots() {
        return this.previousPinnedSnapshots;
    }

    public final void setPreviousPinnedSnapshots$runtime(int[] iArr) {
        this.previousPinnedSnapshots = iArr;
    }

    /* JADX INFO: renamed from: getApplied$runtime, reason: from getter */
    public final boolean getApplied() {
        return this.applied;
    }

    public final void setApplied$runtime(boolean z) {
        this.applied = z;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/runtime/snapshots/MutableSnapshot$Companion;", "", "<init>", "()V", "", "EmptyIntArray", "[I"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final void advance$runtime() {
        recordPrevious$runtime(getSnapshotId());
        Unit unit = Unit.INSTANCE;
        if (getApplied() || getDisposed()) {
            return;
        }
        long snapshotId = getSnapshotId();
        synchronized (SnapshotKt.getLock()) {
            long j = SnapshotKt.nextSnapshotId;
            SnapshotKt.nextSnapshotId++;
            setSnapshotId$runtime(j);
            SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(getSnapshotId());
            Unit unit2 = Unit.INSTANCE;
        }
        setInvalid$runtime(SnapshotKt.addRange(getInvalid(), snapshotId + 1, getSnapshotId()));
    }

    public final void recordPrevious$runtime(long p0) {
        synchronized (SnapshotKt.getLock()) {
            this.previousIds = this.previousIds.set(p0);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void recordPreviousList$runtime(SnapshotIdSet p0) {
        synchronized (SnapshotKt.getLock()) {
            this.previousIds = this.previousIds.or(p0);
            Unit unit = Unit.INSTANCE;
        }
    }
}
