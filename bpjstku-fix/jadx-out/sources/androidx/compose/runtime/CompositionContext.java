package androidx.compose.runtime;

import androidx.collection.ScatterSet;
import androidx.compose.runtime.tooling.CompositionData;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0011\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH ¢\u0006\u0004\b\n\u0010\u000bJ8\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\f2\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH!¢\u0006\u0004\b\u0010\u0010\u0011J3\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH!¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u000fH ¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H ¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u000fH ¢\u0006\u0004\b\u0018\u0010\u0015J\u001d\u0010\u001b\u001a\u00020\u00072\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0010¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u001dH\u0010¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u001dH\u0010¢\u0006\u0004\b \u0010\u001fJ\u0017\u0010!\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H ¢\u0006\u0004\b!\u0010\u0017J\u0017\u0010\"\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H ¢\u0006\u0004\b\"\u0010\u0017J\u000f\u0010$\u001a\u00020#H\u0011¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0007H\u0010¢\u0006\u0004\b&\u0010\u0003J\u000f\u0010'\u001a\u00020\u0007H\u0010¢\u0006\u0004\b'\u0010\u0003J\u0017\u0010)\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020(H ¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020(H ¢\u0006\u0004\b+\u0010*J+\u0010.\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020(2\u0006\u0010\t\u001a\u00020,2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030-H ¢\u0006\u0004\b.\u0010/J\u0019\u00100\u001a\u0004\u0018\u00010,2\u0006\u0010\u0005\u001a\u00020(H\u0010¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H ¢\u0006\u0004\b2\u0010\u0017R\u0018\u00107\u001a\u000603j\u0002`48!X \u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u0014\u0010;\u001a\u0002088!X \u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0014\u0010=\u001a\u0002088!X \u0004¢\u0006\u0006\u001a\u0004\b<\u0010:R\u0014\u0010?\u001a\u0002088!X \u0004¢\u0006\u0006\u001a\u0004\b>\u0010:R\u0016\u0010C\u001a\u0004\u0018\u00010@8QX\u0090\u0004¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0014\u0010G\u001a\u00020D8'X¦\u0004¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0014\u0010I\u001a\u00020D8!X \u0004¢\u0006\u0006\u001a\u0004\bH\u0010FR\u0016\u0010M\u001a\u0004\u0018\u00010J8!X \u0004¢\u0006\u0006\u001a\u0004\bK\u0010L"}, d2 = {"Landroidx/compose/runtime/CompositionContext;", "", "<init>", "()V", "Landroidx/compose/runtime/ControlledComposition;", "p0", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "p1", "composeInitial$runtime", "(Landroidx/compose/runtime/ControlledComposition;Lkotlin/jvm/functions/Function2;)V", "Landroidx/compose/runtime/ShouldPauseCallback;", "p2", "Landroidx/collection/ScatterSet;", "Landroidx/compose/runtime/RecomposeScopeImpl;", "composeInitialPaused$runtime", "(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/ShouldPauseCallback;Lkotlin/jvm/functions/Function2;)Landroidx/collection/ScatterSet;", "recomposePaused$runtime", "(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/ShouldPauseCallback;Landroidx/collection/ScatterSet;)Landroidx/collection/ScatterSet;", "reportPausedScope$runtime", "(Landroidx/compose/runtime/RecomposeScopeImpl;)V", "invalidate$runtime", "(Landroidx/compose/runtime/ControlledComposition;)V", "invalidateScope$runtime", "", "Landroidx/compose/runtime/tooling/CompositionData;", "recordInspectionTable$runtime", "(Ljava/util/Set;)V", "Landroidx/compose/runtime/Composer;", "registerComposer$runtime", "(Landroidx/compose/runtime/Composer;)V", "unregisterComposer$runtime", "registerComposition$runtime", "unregisterComposition$runtime", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "getCompositionLocalScope$runtime", "()Landroidx/compose/runtime/PersistentCompositionLocalMap;", "startComposing$runtime", "doneComposing$runtime", "Landroidx/compose/runtime/MovableContentStateReference;", "insertMovableContent$runtime", "(Landroidx/compose/runtime/MovableContentStateReference;)V", "deletedMovableContent$runtime", "Landroidx/compose/runtime/MovableContentState;", "Landroidx/compose/runtime/Applier;", "movableContentStateReleased$runtime", "(Landroidx/compose/runtime/MovableContentStateReference;Landroidx/compose/runtime/MovableContentState;Landroidx/compose/runtime/Applier;)V", "movableContentStateResolve$runtime", "(Landroidx/compose/runtime/MovableContentStateReference;)Landroidx/compose/runtime/MovableContentState;", "reportRemovedComposition$runtime", "", "Landroidx/compose/runtime/CompositeKeyHashCode;", "getCompositeKeyHashCode$runtime", "()J", "compositeKeyHashCode", "", "getCollectingParameterInformation$runtime", "()Z", "collectingParameterInformation", "getCollectingSourceInformation$runtime", "collectingSourceInformation", "getCollectingCallByInformation$runtime", "collectingCallByInformation", "Landroidx/compose/runtime/CompositionObserverHolder;", "getObserverHolder$runtime", "()Landroidx/compose/runtime/CompositionObserverHolder;", "observerHolder", "Lkotlin/coroutines/CoroutineContext;", "getEffectCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "effectCoroutineContext", "getRecomposeCoroutineContext$runtime", "recomposeCoroutineContext", "Landroidx/compose/runtime/Composition;", "getComposition$runtime", "()Landroidx/compose/runtime/Composition;", "composition"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class CompositionContext {
    public static final int $stable = 0;

    public abstract void composeInitial$runtime(ControlledComposition p0, Function2<? super Composer, ? super Integer, Unit> p1);

    public abstract ScatterSet<RecomposeScopeImpl> composeInitialPaused$runtime(ControlledComposition p0, ShouldPauseCallback p1, Function2<? super Composer, ? super Integer, Unit> p2);

    public abstract void deletedMovableContent$runtime(MovableContentStateReference p0);

    public void doneComposing$runtime() {
    }

    public abstract boolean getCollectingCallByInformation$runtime();

    public abstract boolean getCollectingParameterInformation$runtime();

    public abstract boolean getCollectingSourceInformation$runtime();

    public abstract long getCompositeKeyHashCode$runtime();

    public abstract Composition getComposition$runtime();

    public abstract CoroutineContext getEffectCoroutineContext();

    public CompositionObserverHolder getObserverHolder$runtime() {
        return null;
    }

    public abstract CoroutineContext getRecomposeCoroutineContext$runtime();

    public abstract void insertMovableContent$runtime(MovableContentStateReference p0);

    public abstract void invalidate$runtime(ControlledComposition p0);

    public abstract void invalidateScope$runtime(RecomposeScopeImpl p0);

    public abstract void movableContentStateReleased$runtime(MovableContentStateReference p0, MovableContentState p1, Applier<?> p2);

    public MovableContentState movableContentStateResolve$runtime(MovableContentStateReference p0) {
        return null;
    }

    public abstract ScatterSet<RecomposeScopeImpl> recomposePaused$runtime(ControlledComposition p0, ShouldPauseCallback p1, ScatterSet<RecomposeScopeImpl> p2);

    public void recordInspectionTable$runtime(Set<CompositionData> p0) {
    }

    public void registerComposer$runtime(Composer p0) {
    }

    public abstract void registerComposition$runtime(ControlledComposition p0);

    public abstract void reportPausedScope$runtime(RecomposeScopeImpl p0);

    public abstract void reportRemovedComposition$runtime(ControlledComposition p0);

    public void startComposing$runtime() {
    }

    public void unregisterComposer$runtime(Composer p0) {
    }

    public abstract void unregisterComposition$runtime(ControlledComposition p0);

    public PersistentCompositionLocalMap getCompositionLocalScope$runtime() {
        return CompositionContextKt.EmptyPersistentCompositionLocalMap;
    }
}
