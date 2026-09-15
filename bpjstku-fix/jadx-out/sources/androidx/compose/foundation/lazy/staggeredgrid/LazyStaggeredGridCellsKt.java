package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\u001a'\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "p0", "p1", "p2", "", "calculateCellsCrossAxisSizeImpl", "(III)[I"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class LazyStaggeredGridCellsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int[] calculateCellsCrossAxisSizeImpl(int i, int i2, int i3) {
        int i4;
        int i5 = i - (i3 * (i2 - 1));
        int i6 = i5 / i2;
        int[] iArr = new int[i2];
        int i7 = 0;
        while (i7 < i2) {
            if (i6 < 0) {
                i4 = 0;
            } else {
                i4 = (i7 < i5 % i2 ? 1 : 0) + i6;
            }
            iArr[i7] = i4;
            i7++;
        }
        return iArr;
    }
}
