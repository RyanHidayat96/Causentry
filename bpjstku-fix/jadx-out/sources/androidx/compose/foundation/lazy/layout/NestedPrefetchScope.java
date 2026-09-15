package androidx.compose.foundation.lazy.layout;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\bw\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\"\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H&ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0001\u0001\u000bø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/layout/NestedPrefetchScope;", "", "", "p0", "", "schedulePrefetch", "(I)V", "Landroidx/compose/ui/unit/Constraints;", "p1", "schedulePrefetch-0kLqBqw", "(IJ)V", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$NestedPrefetchScopeImpl;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface NestedPrefetchScope {
    void schedulePrefetch(int p0);

    /* JADX INFO: renamed from: schedulePrefetch-0kLqBqw */
    void mo1175schedulePrefetch0kLqBqw(int p0, long p1);
}
