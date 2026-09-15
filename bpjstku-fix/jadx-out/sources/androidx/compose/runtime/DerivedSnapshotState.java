package androidx.compose.runtime;

import androidx.collection.MutableObjectIntMap;
import androidx.collection.ObjectIntMap;
import androidx.collection.ObjectIntMapKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.IntRef;
import androidx.compose.runtime.internal.System_jvmKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.StateObject;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import androidx.compose.runtime.snapshots.StateRecord;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u00010B%\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\rJA\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0007\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\"\u0010\u001d\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020\u000b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010(\u001a\u00028\u00008WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000)8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0019\u0010/\u001a\u0004\u0018\u00018\u00008G¢\u0006\f\u0012\u0004\b-\u0010.\u001a\u0004\b,\u0010'"}, d2 = {"Landroidx/compose/runtime/DerivedSnapshotState;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/runtime/snapshots/StateObjectImpl;", "Landroidx/compose/runtime/DerivedState;", "Lkotlin/Function0;", "p0", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "p1", "<init>", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/SnapshotMutationPolicy;)V", "Landroidx/compose/runtime/snapshots/Snapshot;", "Landroidx/compose/runtime/snapshots/StateRecord;", "current", "(Landroidx/compose/runtime/snapshots/Snapshot;)Landroidx/compose/runtime/snapshots/StateRecord;", "Landroidx/compose/runtime/DerivedSnapshotState$ResultRecord;", "", "p2", "p3", "currentRecord", "(Landroidx/compose/runtime/DerivedSnapshotState$ResultRecord;Landroidx/compose/runtime/snapshots/Snapshot;ZLkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/DerivedSnapshotState$ResultRecord;", "", "prependStateRecord", "(Landroidx/compose/runtime/snapshots/StateRecord;)V", "", "toString", "()Ljava/lang/String;", "displayValue", "calculation", "Lkotlin/jvm/functions/Function0;", "policy", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "getPolicy", "()Landroidx/compose/runtime/SnapshotMutationPolicy;", "first", "Landroidx/compose/runtime/DerivedSnapshotState$ResultRecord;", "getFirstStateRecord", "()Landroidx/compose/runtime/snapshots/StateRecord;", "firstStateRecord", "getValue", "()Ljava/lang/Object;", "value", "Landroidx/compose/runtime/DerivedState$Record;", "getCurrentRecord", "()Landroidx/compose/runtime/DerivedState$Record;", "getDebuggerDisplayValue", "getDebuggerDisplayValue$annotations", "()V", "debuggerDisplayValue", "ResultRecord"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class DerivedSnapshotState<T> extends StateObjectImpl implements DerivedState<T> {
    private final Function0<T> calculation;
    private ResultRecord<T> first = new ResultRecord<>(SnapshotKt.currentSnapshot().getSnapshotId());
    private final SnapshotMutationPolicy<T> policy;

    public static /* synthetic */ void getDebuggerDisplayValue$annotations() {
    }

    @Override // androidx.compose.runtime.DerivedState
    public final SnapshotMutationPolicy<T> getPolicy() {
        return this.policy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DerivedSnapshotState(Function0<? extends T> function0, SnapshotMutationPolicy<T> snapshotMutationPolicy) {
        this.calculation = function0;
        this.policy = snapshotMutationPolicy;
    }

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\f\b\u0007\u0018\u0000 7*\u0004\b\u0001\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003:\u00017B\u0013\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\f\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0017¢\u0006\u0004\b\f\u0010\u000eJ!\u0010\u0013\u001a\u00020\u00122\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u000f2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0016\u001a\u00020\u00152\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u000f2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0017R&\u0010\u0018\u001a\u00060\u0004j\u0002`\u00058\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\bR\"\u0010\u001d\u001a\u00020\u00158\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R(\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#8\u0017@\u0017X\u0097\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R$\u0010,\u001a\u0004\u0018\u00010+8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u00102\u001a\u00020\u00158\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b2\u0010\u001e\u001a\u0004\b3\u0010 \"\u0004\b4\u0010\"R\u0014\u00106\u001a\u00028\u00018WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u0010/"}, d2 = {"Landroidx/compose/runtime/DerivedSnapshotState$ResultRecord;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/runtime/snapshots/StateRecord;", "Landroidx/compose/runtime/DerivedState$Record;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "p0", "<init>", "(J)V", "", "assign", "(Landroidx/compose/runtime/snapshots/StateRecord;)V", "create", "()Landroidx/compose/runtime/snapshots/StateRecord;", "(J)Landroidx/compose/runtime/snapshots/StateRecord;", "Landroidx/compose/runtime/DerivedState;", "Landroidx/compose/runtime/snapshots/Snapshot;", "p1", "", "isValid", "(Landroidx/compose/runtime/DerivedState;Landroidx/compose/runtime/snapshots/Snapshot;)Z", "", "readableHash", "(Landroidx/compose/runtime/DerivedState;Landroidx/compose/runtime/snapshots/Snapshot;)I", "validSnapshotId", "J", "getValidSnapshotId", "()J", "setValidSnapshotId", "validSnapshotWriteCount", "I", "getValidSnapshotWriteCount", "()I", "setValidSnapshotWriteCount", "(I)V", "Landroidx/collection/ObjectIntMap;", "Landroidx/compose/runtime/snapshots/StateObject;", "dependencies", "Landroidx/collection/ObjectIntMap;", "getDependencies", "()Landroidx/collection/ObjectIntMap;", "setDependencies", "(Landroidx/collection/ObjectIntMap;)V", "", "result", "Ljava/lang/Object;", "getResult", "()Ljava/lang/Object;", "setResult", "(Ljava/lang/Object;)V", "resultHash", "getResultHash", "setResultHash", "getCurrentValue", "currentValue", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ResultRecord<T> extends StateRecord implements DerivedState.Record<T> {
        private ObjectIntMap<StateObject> dependencies;
        private Object result;
        private int resultHash;
        private long validSnapshotId;
        private int validSnapshotWriteCount;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;
        private static final Object Unset = new Object();

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/compose/runtime/DerivedSnapshotState$ResultRecord$Companion;", "", "<init>", "()V", "Unset", "Ljava/lang/Object;", "getUnset", "()Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final Object getUnset() {
                return ResultRecord.Unset;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public ResultRecord(long j) {
            super(j);
            this.dependencies = ObjectIntMapKt.emptyObjectIntMap();
            this.result = Unset;
        }

        public final long getValidSnapshotId() {
            return this.validSnapshotId;
        }

        public final void setValidSnapshotId(long j) {
            this.validSnapshotId = j;
        }

        public final int getValidSnapshotWriteCount() {
            return this.validSnapshotWriteCount;
        }

        public final void setValidSnapshotWriteCount(int i) {
            this.validSnapshotWriteCount = i;
        }

        @Override // androidx.compose.runtime.DerivedState.Record
        public final ObjectIntMap<StateObject> getDependencies() {
            return this.dependencies;
        }

        public final void setDependencies(ObjectIntMap<StateObject> objectIntMap) {
            this.dependencies = objectIntMap;
        }

        public final Object getResult() {
            return this.result;
        }

        public final void setResult(Object obj) {
            this.result = obj;
        }

        public final int getResultHash() {
            return this.resultHash;
        }

        public final void setResultHash(int i) {
            this.resultHash = i;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public final void assign(StateRecord p0) {
            Intrinsics.checkNotNull(p0, "");
            ResultRecord resultRecord = (ResultRecord) p0;
            setDependencies(resultRecord.getDependencies());
            this.result = resultRecord.result;
            this.resultHash = resultRecord.resultHash;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public final StateRecord create() {
            return create(SnapshotKt.currentSnapshot().getSnapshotId());
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public final StateRecord create(long p0) {
            return new ResultRecord(p0);
        }

        @Override // androidx.compose.runtime.DerivedState.Record
        public final T getCurrentValue() {
            return (T) this.result;
        }

        public final boolean isValid(DerivedState<?> p0, Snapshot p1) {
            boolean z;
            boolean z2;
            synchronized (SnapshotKt.getLock()) {
                z = false;
                z2 = (this.validSnapshotId == p1.getSnapshotId() && this.validSnapshotWriteCount == p1.getWriteCount()) ? false : true;
            }
            if (this.result != Unset && (!z2 || this.resultHash == readableHash(p0, p1))) {
                z = true;
            }
            if (!z || !z2) {
                return z;
            }
            synchronized (SnapshotKt.getLock()) {
                this.validSnapshotId = p1.getSnapshotId();
                this.validSnapshotWriteCount = p1.getWriteCount();
                Unit unit = Unit.INSTANCE;
            }
            return true;
        }

        /* JADX WARN: Code duplicated, block: B:39:0x00b2 A[DONT_GENERATE, LOOP:3: B:38:0x00b0->B:39:0x00b2, LOOP_END] */
        public final int readableHash(DerivedState<?> p0, Snapshot p1) {
            ObjectIntMap<StateObject> dependencies;
            int i;
            int iIdentityHashCode;
            StateRecord stateRecordCurrent;
            synchronized (SnapshotKt.getLock()) {
                dependencies = getDependencies();
            }
            char c = 7;
            if (!dependencies.isNotEmpty()) {
                return 7;
            }
            MutableVector<DerivedStateObserver> mutableVectorDerivedStateObservers = SnapshotStateKt.derivedStateObservers();
            DerivedStateObserver[] derivedStateObserverArr = mutableVectorDerivedStateObservers.content;
            int size = mutableVectorDerivedStateObservers.getSize();
            for (int i2 = 0; i2 < size; i2++) {
                derivedStateObserverArr[i2].start(p0);
            }
            try {
                Object[] objArr = dependencies.keys;
                int[] iArr = dependencies.values;
                long[] jArr = dependencies.metadata;
                int length = jArr.length - 2;
                if (length >= 0) {
                    iIdentityHashCode = 7;
                    int i3 = 0;
                    while (true) {
                        long j = jArr[i3];
                        if ((((~j) << c) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8;
                            int i5 = 8 - ((~(i3 - length)) >>> 31);
                            int i6 = 0;
                            while (i6 < i5) {
                                if ((j & 255) < 128) {
                                    int i7 = (i3 << 3) + i6;
                                    StateObject stateObject = (StateObject) objArr[i7];
                                    if (iArr[i7] == 1) {
                                        if (stateObject instanceof DerivedSnapshotState) {
                                            stateRecordCurrent = ((DerivedSnapshotState) stateObject).current(p1);
                                        } else {
                                            stateRecordCurrent = SnapshotKt.current(stateObject.getFirstStateRecord(), p1);
                                        }
                                        iIdentityHashCode = (((iIdentityHashCode * 31) + System_jvmKt.identityHashCode(stateRecordCurrent)) * 31) + Long.hashCode(stateRecordCurrent.getSnapshotId());
                                    }
                                }
                                j >>= 8;
                                i6++;
                                i4 = 8;
                            }
                            if (i5 != i4) {
                                break;
                            }
                        }
                        if (i3 != length) {
                            i3++;
                            c = 7;
                        } else {
                            i = iIdentityHashCode;
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                    return iIdentityHashCode;
                }
                i = 7;
                iIdentityHashCode = i;
                Unit unit2 = Unit.INSTANCE;
                return iIdentityHashCode;
            } finally {
                DerivedStateObserver[] derivedStateObserverArr2 = mutableVectorDerivedStateObservers.content;
                int size2 = mutableVectorDerivedStateObservers.getSize();
                for (int i8 = 0; i8 < size2; i8++) {
                    derivedStateObserverArr2[i8].done(p0);
                }
            }
        }
    }

    public final StateRecord current(Snapshot p0) {
        return currentRecord((ResultRecord) SnapshotKt.current(this.first, p0), p0, false, this.calculation);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x00aa A[Catch: all -> 0x00ca, LOOP:1: B:14:0x0055->B:29:0x00aa, LOOP_END, TryCatch #2 {all -> 0x00ca, blocks: (B:8:0x0029, B:10:0x0039, B:11:0x0045, B:14:0x0055, B:16:0x006a, B:18:0x0076, B:20:0x0080, B:22:0x0097, B:25:0x009e, B:29:0x00aa, B:30:0x00b2), top: B:86:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x00b2 A[EDGE_INSN: B:91:0x00b2->B:30:0x00b2 BREAK  A[LOOP:1: B:14:0x0055->B:29:0x00aa], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    private final ResultRecord<T> currentRecord(ResultRecord<T> p0, Snapshot p1, boolean p2, Function0<? extends T> p3) {
        SnapshotMutationPolicy<T> policy;
        int i;
        ResultRecord<T> resultRecord = p0;
        DerivedSnapshotState<T> derivedSnapshotState = this;
        if (!resultRecord.isValid(derivedSnapshotState, p1)) {
            final MutableObjectIntMap mutableObjectIntMap = new MutableObjectIntMap(0, 1, null);
            final IntRef intRef = (IntRef) SnapshotStateKt__DerivedStateKt.calculationBlockNestedLevel.get();
            if (intRef == null) {
                intRef = new IntRef(0);
                SnapshotStateKt__DerivedStateKt.calculationBlockNestedLevel.set(intRef);
            }
            final int element = intRef.getElement();
            MutableVector<DerivedStateObserver> mutableVectorDerivedStateObservers = SnapshotStateKt.derivedStateObservers();
            DerivedStateObserver[] derivedStateObserverArr = mutableVectorDerivedStateObservers.content;
            int size = mutableVectorDerivedStateObservers.getSize();
            for (int i2 = 0; i2 < size; i2++) {
                derivedStateObserverArr[i2].start(derivedSnapshotState);
            }
            try {
                intRef.setElement(element + 1);
                Object objObserve = Snapshot.INSTANCE.observe(new Function1() { // from class: androidx.compose.runtime.DerivedSnapshotState$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return DerivedSnapshotState.currentRecord$lambda$5$lambda$4$lambda$3(this.f$0, intRef, mutableObjectIntMap, element, obj);
                    }
                }, null, p3);
                intRef.setElement(element);
                DerivedStateObserver[] derivedStateObserverArr2 = mutableVectorDerivedStateObservers.content;
                int size2 = mutableVectorDerivedStateObservers.getSize();
                for (int i3 = 0; i3 < size2; i3++) {
                    derivedStateObserverArr2[i3].done(derivedSnapshotState);
                }
                synchronized (SnapshotKt.getLock()) {
                    Snapshot current = Snapshot.INSTANCE.getCurrent();
                    if (p0.getResult() != ResultRecord.INSTANCE.getUnset() && (policy = getPolicy()) != 0 && policy.equivalent(objObserve, p0.getResult())) {
                        resultRecord.setDependencies(mutableObjectIntMap);
                        resultRecord.setResultHash(resultRecord.readableHash(this, current));
                    } else {
                        resultRecord = (ResultRecord) SnapshotKt.newWritableRecord(this.first, this, current);
                        resultRecord.setDependencies(mutableObjectIntMap);
                        resultRecord.setResultHash(resultRecord.readableHash(this, current));
                        resultRecord.setResult(objObserve);
                    }
                }
                IntRef intRef2 = (IntRef) SnapshotStateKt__DerivedStateKt.calculationBlockNestedLevel.get();
                if (intRef2 == null || intRef2.getElement() != 0) {
                    return resultRecord;
                }
                Snapshot.INSTANCE.notifyObjectsInitialized();
                synchronized (SnapshotKt.getLock()) {
                    Snapshot current2 = Snapshot.INSTANCE.getCurrent();
                    resultRecord.setValidSnapshotId(current2.getSnapshotId());
                    resultRecord.setValidSnapshotWriteCount(current2.getWriteCount());
                    Unit unit = Unit.INSTANCE;
                }
                return resultRecord;
            } catch (Throwable th) {
                DerivedStateObserver[] derivedStateObserverArr3 = mutableVectorDerivedStateObservers.content;
                int size3 = mutableVectorDerivedStateObservers.getSize();
                for (int i4 = 0; i4 < size3; i4++) {
                    derivedStateObserverArr3[i4].done(derivedSnapshotState);
                }
                throw th;
            }
        }
        if (p2) {
            MutableVector<DerivedStateObserver> mutableVectorDerivedStateObservers2 = SnapshotStateKt.derivedStateObservers();
            DerivedStateObserver[] derivedStateObserverArr4 = mutableVectorDerivedStateObservers2.content;
            int size4 = mutableVectorDerivedStateObservers2.getSize();
            for (int i5 = 0; i5 < size4; i5++) {
                derivedStateObserverArr4[i5].start(derivedSnapshotState);
            }
            try {
                ObjectIntMap<StateObject> dependencies = p0.getDependencies();
                IntRef intRef3 = (IntRef) SnapshotStateKt__DerivedStateKt.calculationBlockNestedLevel.get();
                if (intRef3 == null) {
                    intRef3 = new IntRef(0);
                    SnapshotStateKt__DerivedStateKt.calculationBlockNestedLevel.set(intRef3);
                }
                int element2 = intRef3.getElement();
                Object[] objArr = dependencies.keys;
                int[] iArr = dependencies.values;
                long[] jArr = dependencies.metadata;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i6 = 0;
                    while (true) {
                        long j = jArr[i6];
                        long[] jArr2 = jArr;
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i6 != length) {
                                break;
                                break;
                            }
                            i6++;
                            jArr = jArr2;
                        } else {
                            int i7 = 8;
                            int i8 = 8 - ((~(i6 - length)) >>> 31);
                            int i9 = 0;
                            while (i9 < i8) {
                                if ((j & 255) < 128) {
                                    int i10 = (i6 << 3) + i9;
                                    StateObject stateObject = (StateObject) objArr[i10];
                                    intRef3.setElement(element2 + iArr[i10]);
                                    Function1<Object, Unit> readObserver = p1.getReadObserver();
                                    if (readObserver != null) {
                                        readObserver.invoke(stateObject);
                                    }
                                    i = 8;
                                } else {
                                    i = i7;
                                }
                                j >>= i;
                                i9++;
                                i7 = i;
                            }
                            if (i8 != i7) {
                                break;
                            }
                            if (i6 != length) {
                                break;
                            }
                            i6++;
                            jArr = jArr2;
                        }
                    }
                }
                intRef3.setElement(element2);
                Unit unit2 = Unit.INSTANCE;
            } finally {
                DerivedStateObserver[] derivedStateObserverArr5 = mutableVectorDerivedStateObservers2.content;
                int size5 = mutableVectorDerivedStateObservers2.getSize();
                for (int i11 = 0; i11 < size5; i11++) {
                    derivedStateObserverArr5[i11].done(derivedSnapshotState);
                }
            }
        }
        return resultRecord;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit currentRecord$lambda$5$lambda$4$lambda$3(DerivedSnapshotState derivedSnapshotState, IntRef intRef, MutableObjectIntMap mutableObjectIntMap, int i, Object obj) {
        if (obj == derivedSnapshotState) {
            throw new IllegalStateException("A derived state calculation cannot read itself".toString());
        }
        if (obj instanceof StateObject) {
            mutableObjectIntMap.set(obj, Math.min(intRef.getElement() - i, mutableObjectIntMap.getOrDefault(obj, Integer.MAX_VALUE)));
        }
        return Unit.INSTANCE;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public final StateRecord getFirstStateRecord() {
        return this.first;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public final void prependStateRecord(StateRecord p0) {
        Intrinsics.checkNotNull(p0, "");
        this.first = (ResultRecord) p0;
    }

    @Override // androidx.compose.runtime.State
    public final T getValue() {
        Function1<Object, Unit> readObserver = Snapshot.INSTANCE.getCurrent().getReadObserver();
        if (readObserver != null) {
            readObserver.invoke(this);
        }
        Snapshot current = Snapshot.INSTANCE.getCurrent();
        return (T) currentRecord((ResultRecord) SnapshotKt.current(this.first, current), current, true, this.calculation).getResult();
    }

    @Override // androidx.compose.runtime.DerivedState
    public final DerivedState.Record<T> getCurrentRecord() {
        Snapshot current = Snapshot.INSTANCE.getCurrent();
        return currentRecord((ResultRecord) SnapshotKt.current(this.first, current), current, false, this.calculation);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DerivedState(value=");
        sb.append(displayValue());
        sb.append(")@");
        sb.append(hashCode());
        return sb.toString();
    }

    public final T getDebuggerDisplayValue() {
        ResultRecord resultRecord = (ResultRecord) SnapshotKt.current(this.first);
        if (resultRecord.isValid(this, Snapshot.INSTANCE.getCurrent())) {
            return (T) resultRecord.getResult();
        }
        return null;
    }

    private final String displayValue() {
        ResultRecord resultRecord = (ResultRecord) SnapshotKt.current(this.first);
        if (resultRecord.isValid(this, Snapshot.INSTANCE.getCurrent())) {
            return String.valueOf(resultRecord.getResult());
        }
        return "<Not calculated>";
    }
}
