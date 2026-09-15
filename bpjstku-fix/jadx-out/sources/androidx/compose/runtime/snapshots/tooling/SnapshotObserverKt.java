package androidx.compose.runtime.snapshots.tooling;

import androidx.collection.ScatterSet;
import androidx.compose.runtime.collection.ScatterSetWrapperKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.snapshots.ObserverHandle;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.StateObject;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u009e\u0001\u0010\u0012\u001a\u00028\u0000\"\b\b\u0000\u0010\u0007*\u00020\u00062\b\u0010\u0002\u001a\u0004\u0018\u00010\u00062\u0016\b\b\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b2\u0016\b\b\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b2\u0006\u0010\u000e\u001a\u00020\r2@\b\u0004\u0010\u0011\u001a:\u0012\u0017\u0012\u0015\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\u0002\b\u0010\u0012\u0017\u0012\u0015\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\u0002\b\u0010\u0012\u0004\u0012\u00028\u00000\u000fH\u0081\b¢\u0006\u0004\b\u0012\u0010\u0013\u001aq\u0010\u0018\u001a\u001c\u0012\u0004\u0012\u00020\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00170\u0015*\b\u0012\u0004\u0012\u00020\u00010\u00142\b\u0010\u0002\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\r2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bH\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001aI\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b2\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b2\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bH\u0002¢\u0006\u0004\b\u0018\u0010\u001a\u001aA\u0010\u001b\u001a\u00020\n*\b\u0012\u0004\u0012\u00020\u00010\u00142\b\u0010\u0002\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0017H\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0017\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a'\u0010!\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u00062\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001fH\u0000¢\u0006\u0004\b!\u0010\"\"$\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00148\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b#\u0010$\u0012\u0004\b%\u0010&"}, d2 = {"Landroidx/compose/runtime/snapshots/Snapshot$Companion;", "Landroidx/compose/runtime/snapshots/tooling/SnapshotObserver;", "p0", "Landroidx/compose/runtime/snapshots/ObserverHandle;", "observeSnapshots", "(Landroidx/compose/runtime/snapshots/Snapshot$Companion;Landroidx/compose/runtime/snapshots/tooling/SnapshotObserver;)Landroidx/compose/runtime/snapshots/ObserverHandle;", "Landroidx/compose/runtime/snapshots/Snapshot;", "R", "Lkotlin/Function1;", "", "", "p1", "p2", "", "p3", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "p4", "creatingSnapshot", "(Landroidx/compose/runtime/snapshots/Snapshot;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function2;)Landroidx/compose/runtime/snapshots/Snapshot;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "Lkotlin/Pair;", "Landroidx/compose/runtime/snapshots/tooling/SnapshotInstanceObservers;", "", "mergeObservers", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;Landroidx/compose/runtime/snapshots/Snapshot;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lkotlin/Pair;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;", "dispatchCreatedObservers", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/Snapshot;Ljava/util/Map;)V", "dispatchObserverOnPreDispose", "(Landroidx/compose/runtime/snapshots/Snapshot;)V", "Landroidx/collection/ScatterSet;", "Landroidx/compose/runtime/snapshots/StateObject;", "dispatchObserverOnApplied", "(Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/collection/ScatterSet;)V", "observers", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "getObservers$annotations", "()V"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SnapshotObserverKt {
    private static PersistentList<? extends SnapshotObserver> observers;

    private static /* synthetic */ void getObservers$annotations() {
    }

    public static final <R extends Snapshot> R creatingSnapshot(Snapshot snapshot, Function1<Object, Unit> function1, Function1<Object, Unit> function2, boolean z, Function2<? super Function1<Object, Unit>, ? super Function1<Object, Unit>, ? extends R> function3) {
        Map<SnapshotObserver, SnapshotInstanceObservers> second;
        PersistentList persistentList = observers;
        if (persistentList != null) {
            Pair<SnapshotInstanceObservers, Map<SnapshotObserver, SnapshotInstanceObservers>> pairMergeObservers = mergeObservers(persistentList, snapshot, z, function1, function2);
            SnapshotInstanceObservers first = pairMergeObservers.getFirst();
            Function1<Object, Unit> readObserver = first.getReadObserver();
            function2 = first.getWriteObserver();
            second = pairMergeObservers.getSecond();
            function1 = readObserver;
        } else {
            second = null;
        }
        R rInvoke = function3.invoke(function1, function2);
        if (persistentList != null) {
            dispatchCreatedObservers(persistentList, snapshot, rInvoke, second);
        }
        return rInvoke;
    }

    public static final Pair<SnapshotInstanceObservers, Map<SnapshotObserver, SnapshotInstanceObservers>> mergeObservers(PersistentList<? extends SnapshotObserver> persistentList, Snapshot snapshot, boolean z, Function1<Object, Unit> function1, Function1<Object, Unit> function2) {
        PersistentList<? extends SnapshotObserver> persistentList2 = persistentList;
        int size = persistentList2.size();
        LinkedHashMap linkedHashMap = null;
        for (int i = 0; i < size; i++) {
            SnapshotObserver snapshotObserver = persistentList2.get(i);
            SnapshotInstanceObservers snapshotInstanceObserversOnPreCreate = snapshotObserver.onPreCreate(snapshot, z);
            if (snapshotInstanceObserversOnPreCreate != null) {
                function1 = mergeObservers(snapshotInstanceObserversOnPreCreate.getReadObserver(), function1);
                function2 = mergeObservers(snapshotInstanceObserversOnPreCreate.getWriteObserver(), function2);
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap();
                }
                linkedHashMap.put(snapshotObserver, snapshotInstanceObserversOnPreCreate);
            }
        }
        return TuplesKt.to(new SnapshotInstanceObservers(function1, function2), linkedHashMap);
    }

    private static final Function1<Object, Unit> mergeObservers(final Function1<Object, Unit> function1, final Function1<Object, Unit> function2) {
        if (function1 == null || function2 == null) {
            return function1 == null ? function2 : function1;
        }
        return new Function1() { // from class: androidx.compose.runtime.snapshots.tooling.SnapshotObserverKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SnapshotObserverKt.mergeObservers$lambda$6(function1, function2, obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mergeObservers$lambda$6(Function1 function1, Function1 function2, Object obj) {
        function1.invoke(obj);
        function2.invoke(obj);
        return Unit.INSTANCE;
    }

    public static final void dispatchCreatedObservers(PersistentList<? extends SnapshotObserver> persistentList, Snapshot snapshot, Snapshot snapshot2, Map<SnapshotObserver, SnapshotInstanceObservers> map) {
        PersistentList<? extends SnapshotObserver> persistentList2 = persistentList;
        int size = persistentList2.size();
        for (int i = 0; i < size; i++) {
            SnapshotObserver snapshotObserver = persistentList2.get(i);
            snapshotObserver.onCreated(snapshot2, snapshot, map != null ? map.get(snapshotObserver) : null);
        }
    }

    public static final void dispatchObserverOnPreDispose(Snapshot snapshot) {
        PersistentList<? extends SnapshotObserver> persistentList = observers;
        if (persistentList != null) {
            PersistentList<? extends SnapshotObserver> persistentList2 = persistentList;
            int size = persistentList2.size();
            for (int i = 0; i < size; i++) {
                persistentList2.get(i).onPreDispose(snapshot);
            }
        }
    }

    public static final void dispatchObserverOnApplied(Snapshot snapshot, ScatterSet<StateObject> scatterSet) {
        Set<? extends Object> setEmptySet;
        PersistentList<? extends SnapshotObserver> persistentList = observers;
        PersistentList<? extends SnapshotObserver> persistentList2 = persistentList;
        if (persistentList2 == null || persistentList2.isEmpty()) {
            return;
        }
        if (scatterSet == null || (setEmptySet = ScatterSetWrapperKt.wrapIntoSet(scatterSet)) == null) {
            setEmptySet = SetsKt.emptySet();
        }
        PersistentList<? extends SnapshotObserver> persistentList3 = persistentList;
        int size = persistentList3.size();
        for (int i = 0; i < size; i++) {
            persistentList3.get(i).onApplied(snapshot, setEmptySet);
        }
    }

    public static final ObserverHandle observeSnapshots(Snapshot.Companion companion, final SnapshotObserver snapshotObserver) {
        synchronized (SnapshotKt.getLock()) {
            PersistentList<? extends SnapshotObserver> persistentListPersistentListOf = observers;
            if (persistentListPersistentListOf == null) {
                persistentListPersistentListOf = ExtensionsKt.persistentListOf();
            }
            observers = persistentListPersistentListOf.add(snapshotObserver);
            Unit unit = Unit.INSTANCE;
        }
        return new ObserverHandle() { // from class: androidx.compose.runtime.snapshots.tooling.SnapshotObserverKt$$ExternalSyntheticLambda1
            @Override // androidx.compose.runtime.snapshots.ObserverHandle
            public final void dispose() {
                SnapshotObserverKt.observeSnapshots$lambda$3(snapshotObserver);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observeSnapshots$lambda$3(SnapshotObserver snapshotObserver) {
        synchronized (SnapshotKt.getLock()) {
            PersistentList<? extends SnapshotObserver> persistentList = observers;
            PersistentList<? extends SnapshotObserver> persistentList2 = null;
            PersistentList<? extends SnapshotObserver> persistentListRemove = persistentList != null ? persistentList.remove(snapshotObserver) : null;
            if (persistentListRemove != null && !persistentListRemove.isEmpty()) {
                persistentList2 = persistentListRemove;
            }
            observers = persistentList2;
            Unit unit = Unit.INSTANCE;
        }
    }
}
