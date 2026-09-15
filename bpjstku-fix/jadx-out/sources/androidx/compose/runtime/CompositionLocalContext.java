package androidx.compose.runtime;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Landroidx/compose/runtime/CompositionLocalContext;", "", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "p0", "<init>", "(Landroidx/compose/runtime/PersistentCompositionLocalMap;)V", "compositionLocals", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "getCompositionLocals$runtime", "()Landroidx/compose/runtime/PersistentCompositionLocalMap;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CompositionLocalContext {
    public static final int $stable = 0;
    private final PersistentCompositionLocalMap compositionLocals;

    public CompositionLocalContext(PersistentCompositionLocalMap persistentCompositionLocalMap) {
        this.compositionLocals = persistentCompositionLocalMap;
    }

    /* JADX INFO: renamed from: getCompositionLocals$runtime, reason: from getter */
    public final PersistentCompositionLocalMap getCompositionLocals() {
        return this.compositionLocals;
    }
}
