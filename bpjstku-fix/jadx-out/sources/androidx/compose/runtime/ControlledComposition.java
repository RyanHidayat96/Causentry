package androidx.compose.runtime;

import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001J\"\u0010\u0006\u001a\u00020\u00032\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\n\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\t0\bH&¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\r\u001a\u00020\f2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\t0\bH&¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u000f\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\tH&¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\tH&¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\fH&¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u0019\u001a\u00020\u00032\u001a\u0010\u0005\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00170\u0016H'¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u001bH'¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0003H&¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0003H&¢\u0006\u0004\b \u0010\u001fJ\u000f\u0010!\u001a\u00020\u0003H&¢\u0006\u0004\b!\u0010\u001fJ\u000f\u0010\"\u001a\u00020\u0003H&¢\u0006\u0004\b\"\u0010\u001fJ\u000f\u0010#\u001a\u00020\u0003H&¢\u0006\u0004\b#\u0010\u001fJ\u000f\u0010$\u001a\u00020\u0003H'¢\u0006\u0004\b$\u0010\u001fJ5\u0010)\u001a\u00028\u0000\"\u0004\b\u0000\u0010%2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00002\u0006\u0010'\u001a\u00020&2\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H&¢\u0006\u0004\b)\u0010*J\u001b\u0010,\u001a\u0004\u0018\u00010+2\b\u0010\u0005\u001a\u0004\u0018\u00010+H&¢\u0006\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020\f8'X¦\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\u0015R\u0014\u00100\u001a\u00020\f8'X¦\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\u0015\u0082\u0001\u00011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/ControlledComposition;", "Landroidx/compose/runtime/Composition;", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "p0", "composeContent", "(Lkotlin/jvm/functions/Function2;)V", "", "", "recordModificationsOf", "(Ljava/util/Set;)V", "", "observesAnyOf", "(Ljava/util/Set;)Z", "prepareCompose", "(Lkotlin/jvm/functions/Function0;)V", "recordReadOf", "(Ljava/lang/Object;)V", "recordWriteOf", "recompose", "()Z", "", "Lkotlin/Pair;", "Landroidx/compose/runtime/MovableContentStateReference;", "insertMovableContent", "(Ljava/util/List;)V", "Landroidx/compose/runtime/MovableContentState;", "disposeUnusedMovableContent", "(Landroidx/compose/runtime/MovableContentState;)V", "applyChanges", "()V", "applyLateChanges", "changesApplied", "abandonChanges", "invalidateAll", "verifyConsistent", "R", "", "p1", "p2", "delegateInvalidations", "(Landroidx/compose/runtime/ControlledComposition;ILkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Landroidx/compose/runtime/ShouldPauseCallback;", "getAndSetShouldPauseCallback", "(Landroidx/compose/runtime/ShouldPauseCallback;)Landroidx/compose/runtime/ShouldPauseCallback;", "isComposing", "getHasPendingChanges", "hasPendingChanges", "Landroidx/compose/runtime/CompositionImpl;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ControlledComposition extends Composition {
    void abandonChanges();

    void applyChanges();

    void applyLateChanges();

    void changesApplied();

    void composeContent(Function2<? super Composer, ? super Integer, Unit> p0);

    <R> R delegateInvalidations(ControlledComposition p0, int p1, Function0<? extends R> p2);

    void disposeUnusedMovableContent(MovableContentState p0);

    ShouldPauseCallback getAndSetShouldPauseCallback(ShouldPauseCallback p0);

    boolean getHasPendingChanges();

    void insertMovableContent(List<Pair<MovableContentStateReference, MovableContentStateReference>> p0);

    void invalidateAll();

    boolean isComposing();

    boolean observesAnyOf(Set<? extends Object> p0);

    void prepareCompose(Function0<Unit> p0);

    boolean recompose();

    void recordModificationsOf(Set<? extends Object> p0);

    void recordReadOf(Object p0);

    void recordWriteOf(Object p0);

    void verifyConsistent();
}
