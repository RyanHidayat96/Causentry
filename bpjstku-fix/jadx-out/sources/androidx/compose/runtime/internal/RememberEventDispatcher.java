package androidx.compose.runtime.internal;

import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterMapKt;
import androidx.collection.ScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RememberManager;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.RememberObserverHolder;
import androidx.compose.runtime.Stack;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.tooling.CompositionErrorContext;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJA\u0010\u000f\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\t0\f¢\u0006\u0002\b\rH\u0086\b¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0003J\u0017\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u001d\u0010\u0017\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\t0\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u001dH\u0016¢\u0006\u0004\b \u0010\u001fJ\u0017\u0010!\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u001dH\u0016¢\u0006\u0004\b!\u0010\u001fJ\r\u0010\"\u001a\u00020\t¢\u0006\u0004\b\"\u0010\u0003J\u0015\u0010#\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0019¢\u0006\u0004\b#\u0010\u001bJ\u001b\u0010%\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00120$¢\u0006\u0004\b%\u0010&J\u0015\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010$¢\u0006\u0004\b'\u0010(J\u001d\u0010*\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00120)H\u0002¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020\t¢\u0006\u0004\b,\u0010\u0003J\r\u0010-\u001a\u00020\t¢\u0006\u0004\b-\u0010\u0003J\u0017\u0010/\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020.H\u0002¢\u0006\u0004\b/\u00100J,\u00102\u001a\u00028\u0000\"\u0004\b\u0000\u001012\u0006\u0010\u0006\u001a\u00020.2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0082\b¢\u0006\u0004\b2\u00103R\u001e\u00104\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u00106\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120)8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u00108R\u001c\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0012098\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u001c\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00120)8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b<\u00108R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020.0)8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b=\u00108R \u0010>\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00160)8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b>\u00108R\u001e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u0001098\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010;R$\u0010A\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020@\u0018\u00010?8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bA\u0010BR$\u0010D\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120)\u0018\u00010C8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u001e\u0010F\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010$8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bF\u0010G"}, d2 = {"Landroidx/compose/runtime/internal/RememberEventDispatcher;", "Landroidx/compose/runtime/RememberManager;", "<init>", "()V", "", "Landroidx/compose/runtime/RememberObserver;", "p0", "Landroidx/compose/runtime/tooling/CompositionErrorContext;", "p1", "", "prepare", "(Ljava/util/Set;Landroidx/compose/runtime/tooling/CompositionErrorContext;)V", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "p2", "use", "(Ljava/util/Set;Landroidx/compose/runtime/tooling/CompositionErrorContext;Lkotlin/jvm/functions/Function1;)V", "clear", "Landroidx/compose/runtime/RememberObserverHolder;", "remembering", "(Landroidx/compose/runtime/RememberObserverHolder;)V", "forgetting", "Lkotlin/Function0;", "sideEffect", "(Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/runtime/ComposeNodeLifecycleCallback;", "deactivating", "(Landroidx/compose/runtime/ComposeNodeLifecycleCallback;)V", "releasing", "Landroidx/compose/runtime/RecomposeScopeImpl;", "rememberPausingScope", "(Landroidx/compose/runtime/RecomposeScopeImpl;)V", "startResumingScope", "endResumingScope", "dispatchRememberObservers", "dispatchOnDeactivateIfNecessary", "Landroidx/collection/ScatterSet;", "ignoreForgotten", "(Landroidx/collection/ScatterSet;)V", "extractRememberSet", "()Landroidx/collection/ScatterSet;", "Landroidx/compose/runtime/collection/MutableVector;", "dispatchRememberList", "(Landroidx/compose/runtime/collection/MutableVector;)V", "dispatchSideEffects", "dispatchAbandons", "", "recordLeaving", "(Ljava/lang/Object;)V", ExifInterface.GPS_DIRECTION_TRUE, "withComposeStackTrace", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "abandoning", "Ljava/util/Set;", "traceContext", "Landroidx/compose/runtime/tooling/CompositionErrorContext;", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/collection/MutableScatterSet;", "rememberSet", "Landroidx/collection/MutableScatterSet;", "currentRememberingList", "leaving", "sideEffects", "Landroidx/collection/MutableScatterMap;", "Landroidx/compose/runtime/internal/PausedCompositionRemembers;", "pausedPlaceholders", "Landroidx/collection/MutableScatterMap;", "Landroidx/compose/runtime/Stack;", "nestedRemembersLists", "Ljava/util/ArrayList;", "ignoreLeavingSet", "Landroidx/collection/ScatterSet;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RememberEventDispatcher implements RememberManager {
    public static final int $stable = 8;
    private Set<RememberObserver> abandoning;
    private MutableVector<RememberObserverHolder> currentRememberingList;
    private ScatterSet<RememberObserverHolder> ignoreLeavingSet;
    private final MutableVector<Object> leaving;
    private ArrayList<T> nestedRemembersLists;
    private MutableScatterMap<RecomposeScopeImpl, PausedCompositionRemembers> pausedPlaceholders;
    private MutableScatterSet<ComposeNodeLifecycleCallback> releasing;
    private MutableScatterSet<RememberObserverHolder> rememberSet;
    private final MutableVector<RememberObserverHolder> remembering;
    private final MutableVector<Function0<Unit>> sideEffects;
    private CompositionErrorContext traceContext;

    public RememberEventDispatcher() {
        MutableVector<RememberObserverHolder> mutableVector = new MutableVector<>(new RememberObserverHolder[16], 0);
        this.remembering = mutableVector;
        this.rememberSet = ScatterSetKt.mutableScatterSetOf();
        this.currentRememberingList = mutableVector;
        this.leaving = new MutableVector<>(new Object[16], 0);
        this.sideEffects = new MutableVector<>(new Function0[16], 0);
    }

    public final void prepare(Set<RememberObserver> p0, CompositionErrorContext p1) {
        clear();
        this.abandoning = p0;
        this.traceContext = p1;
    }

    public final void use(Set<RememberObserver> p0, CompositionErrorContext p1, Function1<? super RememberEventDispatcher, Unit> p2) {
        try {
            prepare(p0, p1);
            p2.invoke(this);
        } finally {
            clear();
        }
    }

    public final void clear() {
        this.abandoning = null;
        this.traceContext = null;
        this.remembering.clear();
        this.rememberSet.clear();
        this.currentRememberingList = this.remembering;
        this.leaving.clear();
        this.sideEffects.clear();
        this.releasing = null;
        this.pausedPlaceholders = null;
        this.nestedRemembersLists = null;
    }

    @Override // androidx.compose.runtime.RememberManager
    public final void remembering(RememberObserverHolder p0) {
        this.currentRememberingList.add(p0);
        this.rememberSet.add(p0);
    }

    @Override // androidx.compose.runtime.RememberManager
    public final void forgetting(RememberObserverHolder p0) {
        if (this.rememberSet.contains(p0)) {
            this.rememberSet.remove(p0);
            if (!this.currentRememberingList.remove(p0) && !this.remembering.remove(p0)) {
                forgetting$removeFrom(p0, this.remembering);
            }
            Set<RememberObserver> set = this.abandoning;
            if (set == null) {
                return;
            } else {
                set.add(p0.getWrapped());
            }
        }
        ScatterSet<RememberObserverHolder> scatterSet = this.ignoreLeavingSet;
        if (scatterSet == null || !scatterSet.contains(p0)) {
            recordLeaving(p0);
        }
    }

    @Override // androidx.compose.runtime.RememberManager
    public final void sideEffect(Function0<Unit> p0) {
        this.sideEffects.add(p0);
    }

    @Override // androidx.compose.runtime.RememberManager
    public final void deactivating(ComposeNodeLifecycleCallback p0) {
        recordLeaving(p0);
    }

    @Override // androidx.compose.runtime.RememberManager
    public final void releasing(ComposeNodeLifecycleCallback p0) {
        MutableScatterSet<ComposeNodeLifecycleCallback> mutableScatterSetMutableScatterSetOf = this.releasing;
        if (mutableScatterSetMutableScatterSetOf == null) {
            mutableScatterSetMutableScatterSetOf = ScatterSetKt.mutableScatterSetOf();
            this.releasing = mutableScatterSetMutableScatterSetOf;
        }
        mutableScatterSetMutableScatterSetOf.plusAssign(p0);
        recordLeaving(p0);
    }

    @Override // androidx.compose.runtime.RememberManager
    public final void rememberPausingScope(RecomposeScopeImpl p0) {
        Set<RememberObserver> set = this.abandoning;
        if (set == null) {
            return;
        }
        PausedCompositionRemembers pausedCompositionRemembers = new PausedCompositionRemembers(set);
        MutableScatterMap<RecomposeScopeImpl, PausedCompositionRemembers> mutableScatterMapMutableScatterMapOf = this.pausedPlaceholders;
        if (mutableScatterMapMutableScatterMapOf == null) {
            mutableScatterMapMutableScatterMapOf = ScatterMapKt.mutableScatterMapOf();
            this.pausedPlaceholders = mutableScatterMapMutableScatterMapOf;
        }
        mutableScatterMapMutableScatterMapOf.set(p0, pausedCompositionRemembers);
        this.currentRememberingList.add(new RememberObserverHolder(pausedCompositionRemembers, null));
    }

    @Override // androidx.compose.runtime.RememberManager
    public final void startResumingScope(RecomposeScopeImpl p0) {
        MutableScatterMap<RecomposeScopeImpl, PausedCompositionRemembers> mutableScatterMap = this.pausedPlaceholders;
        PausedCompositionRemembers pausedCompositionRemembers = mutableScatterMap != null ? mutableScatterMap.get(p0) : null;
        if (pausedCompositionRemembers != null) {
            ArrayList arrayListM3520constructorimpl$default = this.nestedRemembersLists;
            if (arrayListM3520constructorimpl$default == null) {
                arrayListM3520constructorimpl$default = Stack.m3520constructorimpl$default(null, 1, null);
                this.nestedRemembersLists = arrayListM3520constructorimpl$default;
            }
            Stack.m3530pushimpl(arrayListM3520constructorimpl$default, this.currentRememberingList);
            this.currentRememberingList = pausedCompositionRemembers.getPausedRemembers();
        }
    }

    @Override // androidx.compose.runtime.RememberManager
    public final void endResumingScope(RecomposeScopeImpl p0) {
        MutableVector<RememberObserverHolder> mutableVector;
        MutableScatterMap<RecomposeScopeImpl, PausedCompositionRemembers> mutableScatterMap = this.pausedPlaceholders;
        if (mutableScatterMap == null || mutableScatterMap.get(p0) == null) {
            return;
        }
        ArrayList<T> arrayList = this.nestedRemembersLists;
        if (arrayList != 0 && (mutableVector = (MutableVector) Stack.m3529popimpl(arrayList)) != null) {
            this.currentRememberingList = mutableVector;
        }
        mutableScatterMap.remove(p0);
    }

    public final void dispatchRememberObservers() {
        Set<RememberObserver> set = this.abandoning;
        if (set == null) {
            return;
        }
        this.ignoreLeavingSet = null;
        if (this.leaving.getSize() != 0) {
            Object objBeginSection = Trace.INSTANCE.beginSection("Compose:onForgotten");
            try {
                MutableScatterSet<ComposeNodeLifecycleCallback> mutableScatterSet = this.releasing;
                for (int size = this.leaving.getSize() - 1; size >= 0; size--) {
                    Object obj = this.leaving.content[size];
                    if (obj instanceof RememberObserverHolder) {
                        try {
                            RememberObserver wrapped = ((RememberObserverHolder) obj).getWrapped();
                            set.remove(wrapped);
                            wrapped.onForgotten();
                        } catch (Throwable th) {
                            CompositionErrorContext compositionErrorContext = this.traceContext;
                            if (compositionErrorContext != null) {
                                compositionErrorContext.attachComposeStackTrace(th, obj);
                            }
                            throw th;
                        }
                    }
                    if (obj instanceof ComposeNodeLifecycleCallback) {
                        if (mutableScatterSet != null && mutableScatterSet.contains((ComposeNodeLifecycleCallback) obj)) {
                            ((ComposeNodeLifecycleCallback) obj).onRelease();
                        } else {
                            ((ComposeNodeLifecycleCallback) obj).onDeactivate();
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                }
                Unit unit2 = Unit.INSTANCE;
                Trace.INSTANCE.endSection(objBeginSection);
            } catch (Throwable th2) {
                Trace.INSTANCE.endSection(objBeginSection);
                throw th2;
            }
        }
        if (this.remembering.getSize() != 0) {
            Object objBeginSection2 = Trace.INSTANCE.beginSection("Compose:onRemembered");
            try {
                dispatchRememberList(this.remembering);
                Unit unit3 = Unit.INSTANCE;
            } finally {
                Trace.INSTANCE.endSection(objBeginSection2);
            }
        }
    }

    public final void dispatchOnDeactivateIfNecessary(ComposeNodeLifecycleCallback p0) {
        if (this.leaving.remove(p0)) {
            p0.onDeactivate();
        }
    }

    public final void ignoreForgotten(ScatterSet<RememberObserverHolder> p0) {
        this.ignoreLeavingSet = p0;
    }

    public final ScatterSet<RememberObserverHolder> extractRememberSet() {
        if (!this.rememberSet.isNotEmpty()) {
            return null;
        }
        MutableScatterSet<RememberObserverHolder> mutableScatterSet = this.rememberSet;
        this.rememberSet = ScatterSetKt.mutableScatterSetOf();
        this.remembering.clear();
        return mutableScatterSet;
    }

    private final void dispatchRememberList(MutableVector<RememberObserverHolder> p0) {
        Set<RememberObserver> set = this.abandoning;
        if (set != null) {
            RememberObserverHolder[] rememberObserverHolderArr = p0.content;
            int size = p0.getSize();
            for (int i = 0; i < size; i++) {
                RememberObserverHolder rememberObserverHolder = rememberObserverHolderArr[i];
                RememberObserver wrapped = rememberObserverHolder.getWrapped();
                set.remove(wrapped);
                try {
                    wrapped.onRemembered();
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    CompositionErrorContext compositionErrorContext = this.traceContext;
                    if (compositionErrorContext != null) {
                        compositionErrorContext.attachComposeStackTrace(th, rememberObserverHolder);
                    }
                    throw th;
                }
            }
        }
    }

    public final void dispatchSideEffects() {
        if (this.sideEffects.getSize() != 0) {
            Object objBeginSection = Trace.INSTANCE.beginSection("Compose:sideeffects");
            try {
                MutableVector<Function0<Unit>> mutableVector = this.sideEffects;
                Function0<Unit>[] function0Arr = mutableVector.content;
                int size = mutableVector.getSize();
                for (int i = 0; i < size; i++) {
                    function0Arr[i].invoke();
                }
                this.sideEffects.clear();
                Unit unit = Unit.INSTANCE;
            } finally {
                Trace.INSTANCE.endSection(objBeginSection);
            }
        }
    }

    public final void dispatchAbandons() {
        Set<RememberObserver> set = this.abandoning;
        if (set == null || set.isEmpty()) {
            return;
        }
        Object objBeginSection = Trace.INSTANCE.beginSection("Compose:abandons");
        try {
            Iterator<RememberObserver> it = set.iterator();
            while (it.hasNext()) {
                RememberObserver next = it.next();
                it.remove();
                next.onAbandoned();
            }
            Unit unit = Unit.INSTANCE;
        } finally {
            Trace.INSTANCE.endSection(objBeginSection);
        }
    }

    private final void recordLeaving(Object p0) {
        this.leaving.add(p0);
    }

    private final <T> T withComposeStackTrace(Object p0, Function0<? extends T> p1) {
        try {
            return p1.invoke();
        } catch (Throwable th) {
            CompositionErrorContext compositionErrorContext = this.traceContext;
            if (compositionErrorContext != null) {
                compositionErrorContext.attachComposeStackTrace(th, p0);
            }
            throw th;
        }
    }

    private static final boolean forgetting$removeFrom(RememberObserverHolder rememberObserverHolder, MutableVector<RememberObserverHolder> mutableVector) {
        RememberObserverHolder[] rememberObserverHolderArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            RememberObserver wrapped = rememberObserverHolderArr[i].getWrapped();
            if (wrapped instanceof PausedCompositionRemembers) {
                MutableVector<RememberObserverHolder> pausedRemembers = ((PausedCompositionRemembers) wrapped).getPausedRemembers();
                if (pausedRemembers.remove(rememberObserverHolder) || forgetting$removeFrom(rememberObserverHolder, pausedRemembers)) {
                    return true;
                }
            }
        }
        return false;
    }
}
