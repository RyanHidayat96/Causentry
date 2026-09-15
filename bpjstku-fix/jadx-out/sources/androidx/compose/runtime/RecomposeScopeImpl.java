package androidx.compose.runtime;

import androidx.collection.MutableObjectIntMap;
import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u0000 l2\u00020\u00012\u00020\u0002:\u0001lB\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u0004\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0006J\u000f\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0010J)\u0010\u0015\u001a\u00020\b2\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\b0\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u0010J\u0015\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0004\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001f\u001a\u00020\b2\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u001a2\b\u0010\u0004\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b!\u0010\u001cJ1\u0010#\u001a\u00020\u001a*\u0006\u0012\u0002\b\u00030\u001d2\u0018\u0010\u0004\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\"H\u0002¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\b¢\u0006\u0004\b%\u0010\u0010J#\u0010(\u001a\u0010\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\b\u0018\u00010&2\u0006\u0010\u0004\u001a\u00020\u0014¢\u0006\u0004\b(\u0010)J\u0018\u0010*\u001a\u00020\u001a2\u0006\u0010\u0004\u001a\u00020\u0014H\u0082\b¢\u0006\u0004\b*\u0010+J \u0010,\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001aH\u0082\b¢\u0006\u0004\b,\u0010-R$\u0010.\u001a\u0004\u0018\u00010\u00038\u0001@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u0010\u0006R\u0016\u00103\u001a\u00020\u00148\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b3\u00104R$\u00106\u001a\u0004\u0018\u0001058\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u0011\u0010>\u001a\u00020\u001a8G¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0011\u0010@\u001a\u00020\u001a8G¢\u0006\u0006\u001a\u0004\b?\u0010=R$\u0010D\u001a\u00020\u001a2\u0006\u0010\u0004\u001a\u00020\u001a8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bA\u0010=\"\u0004\bB\u0010CR$\u0010G\u001a\u00020\u001a2\u0006\u0010\u0004\u001a\u00020\u001a8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bE\u0010=\"\u0004\bF\u0010CR$\u0010J\u001a\u00020\u001a2\u0006\u0010\u0004\u001a\u00020\u001a8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bH\u0010=\"\u0004\bI\u0010CR$\u0010M\u001a\u00020\u001a2\u0006\u0010\u0004\u001a\u00020\u001a8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bK\u0010=\"\u0004\bL\u0010CR$\u0010P\u001a\u00020\u001a2\u0006\u0010\u0004\u001a\u00020\u001a8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bN\u0010=\"\u0004\bO\u0010CR$\u0010S\u001a\u00020\u001a2\u0006\u0010\u0004\u001a\u00020\u001a8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bQ\u0010=\"\u0004\bR\u0010CR$\u0010V\u001a\u00020\u001a2\u0006\u0010\u0004\u001a\u00020\u001a8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bT\u0010=\"\u0004\bU\u0010CR$\u0010Y\u001a\u00020\u001a2\u0006\u0010\u0004\u001a\u00020\u001a8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bW\u0010=\"\u0004\bX\u0010CR*\u0010Z\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\b\u0018\u00010\u00138\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0016\u0010\\\u001a\u00020\u00148\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\\\u00104R\u001e\u0010^\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010]8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b^\u0010_R*\u0010`\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\"8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b`\u0010aR$\u0010d\u001a\u00020\u001a2\u0006\u0010\u0004\u001a\u00020\u001a8C@CX\u0082\u000e¢\u0006\f\u001a\u0004\bb\u0010=\"\u0004\bc\u0010CR$\u0010g\u001a\u00020\u001a2\u0006\u0010\u0004\u001a\u00020\u001a8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\be\u0010=\"\u0004\bf\u0010CR$\u0010j\u001a\u00020\u001a2\u0006\u0010\u0004\u001a\u00020\u001a8A@CX\u0080\u000e¢\u0006\f\u001a\u0004\bh\u0010=\"\u0004\bi\u0010CR\u0011\u0010k\u001a\u00020\u001a8G¢\u0006\u0006\u001a\u0004\bk\u0010="}, d2 = {"Landroidx/compose/runtime/RecomposeScopeImpl;", "Landroidx/compose/runtime/ScopeUpdateScope;", "Landroidx/compose/runtime/RecomposeScope;", "Landroidx/compose/runtime/RecomposeScopeOwner;", "p0", "<init>", "(Landroidx/compose/runtime/RecomposeScopeOwner;)V", "Landroidx/compose/runtime/Composer;", "", "compose", "(Landroidx/compose/runtime/Composer;)V", "", "Landroidx/compose/runtime/InvalidationResult;", "invalidateForResult", "(Ljava/lang/Object;)Landroidx/compose/runtime/InvalidationResult;", "release", "()V", "adoptedBy", "invalidate", "Lkotlin/Function2;", "", "updateScope", "(Lkotlin/jvm/functions/Function2;)V", "start", "(I)V", "scopeSkipped", "", "recordRead", "(Ljava/lang/Object;)Z", "Landroidx/compose/runtime/DerivedState;", "p1", "recordDerivedStateValue", "(Landroidx/compose/runtime/DerivedState;Ljava/lang/Object;)V", "isInvalidFor", "Landroidx/collection/MutableScatterMap;", "checkDerivedStateChanged", "(Landroidx/compose/runtime/DerivedState;Landroidx/collection/MutableScatterMap;)Z", "rereadTrackedInstances", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composition;", "end", "(I)Lkotlin/jvm/functions/Function1;", "getFlag", "(I)Z", "setFlag", "(IZ)V", "owner", "Landroidx/compose/runtime/RecomposeScopeOwner;", "getOwner$runtime", "()Landroidx/compose/runtime/RecomposeScopeOwner;", "setOwner$runtime", "flags", "I", "Landroidx/compose/runtime/Anchor;", "anchor", "Landroidx/compose/runtime/Anchor;", "getAnchor", "()Landroidx/compose/runtime/Anchor;", "setAnchor", "(Landroidx/compose/runtime/Anchor;)V", "getValid", "()Z", "valid", "getCanRecompose", "canRecompose", "getUsed", "setUsed", "(Z)V", "used", "getReusing", "setReusing", "reusing", "getResetReusing", "setResetReusing", "resetReusing", "getPaused", "setPaused", "paused", "getResuming", "setResuming", "resuming", "getDefaultsInScope", "setDefaultsInScope", "defaultsInScope", "getDefaultsInvalid", "setDefaultsInvalid", "defaultsInvalid", "getRequiresRecompose", "setRequiresRecompose", "requiresRecompose", "block", "Lkotlin/jvm/functions/Function2;", "currentToken", "Landroidx/collection/MutableObjectIntMap;", "trackedInstances", "Landroidx/collection/MutableObjectIntMap;", "trackedDependencies", "Landroidx/collection/MutableScatterMap;", "getRereading", "setRereading", "rereading", "getForcedRecompose", "setForcedRecompose", "forcedRecompose", "getSkipped$runtime", "setSkipped", "skipped", "isConditional", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RecomposeScopeImpl implements ScopeUpdateScope, RecomposeScope {
    private Anchor anchor;
    private Function2<? super Composer, ? super Integer, Unit> block;
    private int currentToken;
    private int flags;
    private RecomposeScopeOwner owner;
    private MutableScatterMap<DerivedState<?>, Object> trackedDependencies;
    private MutableObjectIntMap<Object> trackedInstances;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public RecomposeScopeImpl(RecomposeScopeOwner recomposeScopeOwner) {
        this.owner = recomposeScopeOwner;
    }

    /* JADX INFO: renamed from: getOwner$runtime, reason: from getter */
    public final RecomposeScopeOwner getOwner() {
        return this.owner;
    }

    public final void setOwner$runtime(RecomposeScopeOwner recomposeScopeOwner) {
        this.owner = recomposeScopeOwner;
    }

    public final Anchor getAnchor() {
        return this.anchor;
    }

    public final void setAnchor(Anchor anchor) {
        this.anchor = anchor;
    }

    public final boolean getValid() {
        Anchor anchor;
        return (this.owner == null || (anchor = this.anchor) == null || !anchor.getValid()) ? false : true;
    }

    public final boolean getCanRecompose() {
        return this.block != null;
    }

    public final void compose(Composer p0) {
        Function2<? super Composer, ? super Integer, Unit> function2 = this.block;
        if (function2 == null) {
            throw new IllegalStateException("Invalid restart scope".toString());
        }
        function2.invoke(p0, 1);
    }

    public final InvalidationResult invalidateForResult(Object p0) {
        InvalidationResult invalidationResultInvalidate;
        RecomposeScopeOwner recomposeScopeOwner = this.owner;
        return (recomposeScopeOwner == null || (invalidationResultInvalidate = recomposeScopeOwner.invalidate(this, p0)) == null) ? InvalidationResult.IGNORED : invalidationResultInvalidate;
    }

    public final void release() {
        RecomposeScopeOwner recomposeScopeOwner = this.owner;
        if (recomposeScopeOwner != null) {
            recomposeScopeOwner.recomposeScopeReleased(this);
        }
        this.owner = null;
        this.trackedInstances = null;
        this.trackedDependencies = null;
        this.block = null;
    }

    public final void adoptedBy(RecomposeScopeOwner p0) {
        this.owner = p0;
    }

    @Override // androidx.compose.runtime.RecomposeScope
    public final void invalidate() {
        RecomposeScopeOwner recomposeScopeOwner = this.owner;
        if (recomposeScopeOwner != null) {
            recomposeScopeOwner.invalidate(this, null);
        }
    }

    @Override // androidx.compose.runtime.ScopeUpdateScope
    public final void updateScope(Function2<? super Composer, ? super Integer, Unit> p0) {
        this.block = p0;
    }

    public final void start(int p0) {
        this.currentToken = p0;
        setSkipped(false);
    }

    public final void scopeSkipped() {
        if (getReusing()) {
            return;
        }
        setSkipped(true);
    }

    public final boolean recordRead(Object p0) {
        int i = 0;
        if (getRereading()) {
            return false;
        }
        MutableObjectIntMap<Object> mutableObjectIntMap = this.trackedInstances;
        int i2 = 1;
        if (mutableObjectIntMap == null) {
            mutableObjectIntMap = new MutableObjectIntMap<>(i, i2, null);
            this.trackedInstances = mutableObjectIntMap;
        }
        return mutableObjectIntMap.put(p0, this.currentToken, -1) == this.currentToken;
    }

    public final void recordDerivedStateValue(DerivedState<?> p0, Object p1) {
        MutableScatterMap<DerivedState<?>, Object> mutableScatterMap = this.trackedDependencies;
        if (mutableScatterMap == null) {
            mutableScatterMap = new MutableScatterMap<>(0, 1, null);
            this.trackedDependencies = mutableScatterMap;
        }
        mutableScatterMap.set(p0, p1);
    }

    public final boolean isConditional() {
        return this.trackedDependencies != null;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x006c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x006e A[LOOP:0: B:19:0x002f->B:33:0x006e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:36:0x0071 A[EDGE_INSN: B:36:0x0071->B:34:0x0071 BREAK  A[LOOP:0: B:19:0x002f->B:33:0x006e], SYNTHETIC] */
    public final boolean isInvalidFor(Object p0) {
        MutableScatterMap<DerivedState<?>, Object> mutableScatterMap;
        if (p0 == null || (mutableScatterMap = this.trackedDependencies) == null) {
            return true;
        }
        if (p0 instanceof DerivedState) {
            return checkDerivedStateChanged((DerivedState) p0, mutableScatterMap);
        }
        if (!(p0 instanceof ScatterSet)) {
            return true;
        }
        ScatterSet scatterSet = (ScatterSet) p0;
        if (scatterSet.isNotEmpty()) {
            Object[] objArr = scatterSet.elements;
            long[] jArr = scatterSet.metadata;
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
                                Object obj = objArr[(i << 3) + i3];
                                if (!(obj instanceof DerivedState) || checkDerivedStateChanged((DerivedState) obj, mutableScatterMap)) {
                                    return true;
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                        if (i != length) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        return false;
    }

    private final boolean checkDerivedStateChanged(DerivedState<?> derivedState, MutableScatterMap<DerivedState<?>, Object> mutableScatterMap) {
        Intrinsics.checkNotNull(derivedState, "");
        SnapshotMutationPolicy<?> policy = derivedState.getPolicy();
        if (policy == null) {
            policy = SnapshotStateKt.structuralEqualityPolicy();
        }
        return !policy.equivalent(derivedState.getCurrentRecord().getCurrentValue(), mutableScatterMap.get(derivedState));
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0052 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0054 A[LOOP:0: B:10:0x001d->B:20:0x0054, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0057 A[EDGE_INSN: B:30:0x0057->B:21:0x0057 BREAK  A[LOOP:0: B:10:0x001d->B:20:0x0054], SYNTHETIC] */
    public final void rereadTrackedInstances() {
        MutableObjectIntMap<Object> mutableObjectIntMap;
        RecomposeScopeOwner recomposeScopeOwner = this.owner;
        if (recomposeScopeOwner == null || (mutableObjectIntMap = this.trackedInstances) == null) {
            return;
        }
        setRereading(true);
        try {
            MutableObjectIntMap<Object> mutableObjectIntMap2 = mutableObjectIntMap;
            Object[] objArr = mutableObjectIntMap2.keys;
            int[] iArr = mutableObjectIntMap2.values;
            long[] jArr = mutableObjectIntMap2.metadata;
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
                                int i4 = (i << 3) + i3;
                                Object obj = objArr[i4];
                                int i5 = iArr[i4];
                                recomposeScopeOwner.recordReadOf(obj);
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
        } finally {
            setRereading(false);
        }
    }

    public final Function1<Composition, Unit> end(final int p0) {
        final MutableObjectIntMap<Object> mutableObjectIntMap = this.trackedInstances;
        if (mutableObjectIntMap == null || getSkipped$runtime()) {
            return null;
        }
        MutableObjectIntMap<Object> mutableObjectIntMap2 = mutableObjectIntMap;
        Object[] objArr = mutableObjectIntMap2.keys;
        int[] iArr = mutableObjectIntMap2.values;
        long[] jArr = mutableObjectIntMap2.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return null;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        if (iArr[i4] != p0) {
                            return new Function1() { // from class: androidx.compose.runtime.RecomposeScopeImpl$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    return RecomposeScopeImpl.end$lambda$9$lambda$8(this.f$0, p0, mutableObjectIntMap, (Composition) obj2);
                                }
                            };
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return null;
                }
            }
            if (i == length) {
                return null;
            }
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:34:0x0082 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0084 A[LOOP:0: B:11:0x0023->B:35:0x0084, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x0087 A[EDGE_INSN: B:39:0x0087->B:36:0x0087 BREAK  A[LOOP:0: B:11:0x0023->B:35:0x0084], SYNTHETIC] */
    public static final Unit end$lambda$9$lambda$8(RecomposeScopeImpl recomposeScopeImpl, int i, MutableObjectIntMap mutableObjectIntMap, Composition composition) {
        int i2;
        if (recomposeScopeImpl.currentToken == i && Intrinsics.areEqual(mutableObjectIntMap, recomposeScopeImpl.trackedInstances) && (composition instanceof CompositionImpl)) {
            long[] jArr = mutableObjectIntMap.metadata;
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
                        int i4 = 8;
                        int i5 = 8 - ((~(i3 - length)) >>> 31);
                        int i6 = 0;
                        while (i6 < i5) {
                            if ((255 & j) < 128) {
                                int i7 = (i3 << 3) + i6;
                                Object obj = mutableObjectIntMap.keys[i7];
                                boolean z = mutableObjectIntMap.values[i7] != i;
                                if (z) {
                                    CompositionImpl compositionImpl = (CompositionImpl) composition;
                                    compositionImpl.removeObservation$runtime(obj, recomposeScopeImpl);
                                    if (obj instanceof DerivedState) {
                                        compositionImpl.removeDerivedStateObservation$runtime((DerivedState) obj);
                                        MutableScatterMap<DerivedState<?>, Object> mutableScatterMap = recomposeScopeImpl.trackedDependencies;
                                        if (mutableScatterMap != null) {
                                            mutableScatterMap.remove((DerivedState<?>) obj);
                                        }
                                    }
                                }
                                if (z) {
                                    mutableObjectIntMap.removeValueAt(i7);
                                }
                                i2 = 8;
                            } else {
                                i2 = i4;
                            }
                            j >>= i2;
                            i6++;
                            i4 = i2;
                        }
                        if (i5 != i4) {
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
        return Unit.INSTANCE;
    }

    private final boolean getFlag(int p0) {
        return (p0 & this.flags) != 0;
    }

    private final void setFlag(int p0, boolean p1) {
        int i = this.flags;
        this.flags = p1 ? p0 | i : (~p0) & i;
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000e2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Landroidx/compose/runtime/RecomposeScopeImpl$Companion;", "", "<init>", "()V", "Landroidx/compose/runtime/SlotWriter;", "p0", "", "Landroidx/compose/runtime/Anchor;", "p1", "Landroidx/compose/runtime/RecomposeScopeOwner;", "p2", "", "adoptAnchoredScopes$runtime", "(Landroidx/compose/runtime/SlotWriter;Ljava/util/List;Landroidx/compose/runtime/RecomposeScopeOwner;)V", "Landroidx/compose/runtime/SlotTable;", "", "hasAnchoredRecomposeScopes$runtime", "(Landroidx/compose/runtime/SlotTable;Ljava/util/List;)Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final void adoptAnchoredScopes$runtime(SlotWriter p0, List<Anchor> p1, RecomposeScopeOwner p2) {
            List<Anchor> list = p1;
            if (list.isEmpty()) {
                return;
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Object objSlot = p0.slot(p1.get(i), 0);
                RecomposeScopeImpl recomposeScopeImpl = objSlot instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) objSlot : null;
                if (recomposeScopeImpl != null) {
                    recomposeScopeImpl.adoptedBy(p2);
                }
            }
        }

        public final boolean hasAnchoredRecomposeScopes$runtime(SlotTable p0, List<Anchor> p1) {
            List<Anchor> list = p1;
            if (!list.isEmpty()) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    Anchor anchor = p1.get(i);
                    if (p0.ownsAnchor(anchor) && (p0.slot$runtime(p0.anchorIndex(anchor), 0) instanceof RecomposeScopeImpl)) {
                        return true;
                    }
                }
            }
            return false;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final boolean getUsed() {
        return (this.flags & 1) != 0;
    }

    public final void setUsed(boolean z) {
        int i = this.flags;
        this.flags = z ? i | 1 : i & (-2);
    }

    public final boolean getReusing() {
        return (this.flags & 128) != 0;
    }

    public final void setReusing(boolean z) {
        int i = this.flags;
        this.flags = z ? i | 128 : i & (-129);
    }

    public final boolean getResetReusing() {
        return (this.flags & 1024) != 0;
    }

    public final void setResetReusing(boolean z) {
        int i = this.flags;
        this.flags = z ? i | 1024 : i & (-1025);
    }

    public final boolean getPaused() {
        return (this.flags & 256) != 0;
    }

    public final void setPaused(boolean z) {
        int i = this.flags;
        this.flags = z ? i | 256 : i & (-257);
    }

    public final boolean getResuming() {
        return (this.flags & 512) != 0;
    }

    public final void setResuming(boolean z) {
        int i = this.flags;
        this.flags = z ? i | 512 : i & (-513);
    }

    public final boolean getDefaultsInScope() {
        return (this.flags & 2) != 0;
    }

    public final void setDefaultsInScope(boolean z) {
        int i = this.flags;
        this.flags = z ? i | 2 : i & (-3);
    }

    public final boolean getDefaultsInvalid() {
        return (this.flags & 4) != 0;
    }

    public final void setDefaultsInvalid(boolean z) {
        int i = this.flags;
        this.flags = z ? i | 4 : i & (-5);
    }

    public final boolean getRequiresRecompose() {
        return (this.flags & 8) != 0;
    }

    public final void setRequiresRecompose(boolean z) {
        int i = this.flags;
        this.flags = z ? i | 8 : i & (-9);
    }

    private final boolean getRereading() {
        return (this.flags & 32) != 0;
    }

    private final void setRereading(boolean z) {
        int i = this.flags;
        this.flags = z ? i | 32 : i & (-33);
    }

    public final boolean getForcedRecompose() {
        return (this.flags & 64) != 0;
    }

    public final void setForcedRecompose(boolean z) {
        int i = this.flags;
        this.flags = z ? i | 64 : i & (-65);
    }

    public final boolean getSkipped$runtime() {
        return (this.flags & 16) != 0;
    }

    private final void setSkipped(boolean z) {
        int i = this.flags;
        this.flags = z ? i | 16 : i & (-17);
    }
}
