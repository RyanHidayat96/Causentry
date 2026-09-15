package androidx.compose.foundation.lazy.grid;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "p0", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "GridItemSpan", "(I)J"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class LazyGridSpanKt {
    public static final long GridItemSpan(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The span value should be higher than 0".toString());
        }
        return GridItemSpan.m1122constructorimpl(i);
    }
}
