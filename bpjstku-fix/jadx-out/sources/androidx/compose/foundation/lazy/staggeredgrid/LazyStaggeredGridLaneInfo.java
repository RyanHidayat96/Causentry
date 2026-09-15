package androidx.compose.foundation.lazy.staggeredgrid;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 &2\u00020\u0001:\u0002&'B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\u0003J\u001f\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\fJ\r\u0010\u001d\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u0018R\u0016\u0010\u001e\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u00020\u00128\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u0010%"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;", "", "<init>", "()V", "", "p0", "p1", "", "assignedToLane", "(II)Z", "", "ensureCapacity", "(II)V", "ensureValidIndex", "(I)V", "findNextItemIndex", "(II)I", "findPreviousItemIndex", "", "getGaps", "(I)[I", "getLane", "(I)I", "lowerBound", "()I", "reset", "setGaps", "(I[I)V", "setLane", "upperBound", "anchor", "I", "lanes", "[I", "Lkotlin/collections/ArrayDeque;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo$SpannedItem;", "spannedItems", "Lkotlin/collections/ArrayDeque;", "Companion", "SpannedItem"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LazyStaggeredGridLaneInfo {
    public static final int FullSpan = -2;
    private static final int MaxCapacity = 131072;
    public static final int Unset = -1;
    private int anchor;
    private int[] lanes = new int[16];
    private final ArrayDeque<SpannedItem> spannedItems = new ArrayDeque<>();
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\b\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo$SpannedItem;", "", "", "p0", "", "p1", "<init>", "(I[I)V", "gaps", "[I", "getGaps", "()[I", "setGaps", "([I)V", FirebaseAnalytics.Param.INDEX, "I", "getIndex", "()I"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class SpannedItem {
        private int[] gaps;
        private final int index;

        public SpannedItem(int i, int[] iArr) {
            this.index = i;
            this.gaps = iArr;
        }

        public final int[] getGaps() {
            return this.gaps;
        }

        public final int getIndex() {
            return this.index;
        }

        public final void setGaps(int[] iArr) {
            this.gaps = iArr;
        }
    }

    public final void setLane(int p0, int p1) {
        if (p0 < 0) {
            throw new IllegalArgumentException("Negative lanes are not supported".toString());
        }
        ensureValidIndex(p0);
        this.lanes[p0 - this.anchor] = p1 + 1;
    }

    public final int getLane(int p0) {
        if (p0 < getAnchor() || p0 >= upperBound()) {
            return -1;
        }
        return this.lanes[p0 - this.anchor] - 1;
    }

    public final boolean assignedToLane(int p0, int p1) {
        int lane = getLane(p0);
        return lane == p1 || lane == -1 || lane == -2;
    }

    public final int upperBound() {
        return this.anchor + this.lanes.length;
    }

    /* JADX INFO: renamed from: lowerBound, reason: from getter */
    public final int getAnchor() {
        return this.anchor;
    }

    public final void reset() {
        ArraysKt.fill$default(this.lanes, 0, 0, 0, 6, (Object) null);
        this.spannedItems.clear();
    }

    public final int findPreviousItemIndex(int p0, int p1) {
        for (int i = p0 - 1; i >= 0; i--) {
            if (assignedToLane(i, p1)) {
                return i;
            }
        }
        return -1;
    }

    public final int findNextItemIndex(int p0, int p1) {
        int iUpperBound = upperBound();
        for (int i = p0 + 1; i < iUpperBound; i++) {
            if (assignedToLane(i, p1)) {
                return i;
            }
        }
        return upperBound();
    }

    public final void ensureValidIndex(int p0) {
        int i = this.anchor;
        int i2 = p0 - i;
        if (i2 >= 0 && i2 < 131072) {
            ensureCapacity$default(this, i2 + 1, 0, 2, null);
        } else {
            int iMax = Math.max(p0 - (this.lanes.length / 2), 0);
            this.anchor = iMax;
            int i3 = iMax - i;
            if (i3 >= 0) {
                int[] iArr = this.lanes;
                if (i3 < iArr.length) {
                    ArraysKt.copyInto(iArr, iArr, 0, i3, iArr.length);
                }
                int[] iArr2 = this.lanes;
                ArraysKt.fill(iArr2, 0, Math.max(0, iArr2.length - i3), this.lanes.length);
            } else {
                int i4 = -i3;
                int[] iArr3 = this.lanes;
                if (iArr3.length + i4 < 131072) {
                    ensureCapacity(iArr3.length + i4 + 1, i4);
                } else {
                    if (i4 < iArr3.length) {
                        ArraysKt.copyInto(iArr3, iArr3, i4, 0, iArr3.length - i4);
                    }
                    int[] iArr4 = this.lanes;
                    ArraysKt.fill(iArr4, 0, 0, Math.min(iArr4.length, i4));
                }
            }
        }
        while (!this.spannedItems.isEmpty() && this.spannedItems.first().getIndex() < getAnchor()) {
            this.spannedItems.removeFirst();
        }
        while (!this.spannedItems.isEmpty() && this.spannedItems.last().getIndex() > upperBound()) {
            this.spannedItems.removeLast();
        }
    }

    public final void setGaps(int p0, int[] p1) {
        ArrayDeque<SpannedItem> arrayDeque = this.spannedItems;
        final Integer numValueOf = Integer.valueOf(p0);
        int iBinarySearch = CollectionsKt.binarySearch(arrayDeque, 0, arrayDeque.size(), new Function1<SpannedItem, Integer>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo$setGaps$$inlined$binarySearchBy$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Integer invoke(LazyStaggeredGridLaneInfo.SpannedItem spannedItem) {
                return Integer.valueOf(ComparisonsKt.compareValues(Integer.valueOf(spannedItem.getIndex()), numValueOf));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        });
        if (iBinarySearch < 0) {
            if (p1 == null) {
                return;
            }
            this.spannedItems.add(-(iBinarySearch + 1), new SpannedItem(p0, p1));
            return;
        }
        if (p1 == null) {
            this.spannedItems.remove(iBinarySearch);
        } else {
            this.spannedItems.get(iBinarySearch).setGaps(p1);
        }
    }

    public final int[] getGaps(int p0) {
        ArrayDeque<SpannedItem> arrayDeque = this.spannedItems;
        final Integer numValueOf = Integer.valueOf(p0);
        SpannedItem spannedItem = (SpannedItem) CollectionsKt.getOrNull(this.spannedItems, CollectionsKt.binarySearch(arrayDeque, 0, arrayDeque.size(), new Function1<SpannedItem, Integer>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo$getGaps$$inlined$binarySearchBy$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Integer invoke(LazyStaggeredGridLaneInfo.SpannedItem spannedItem2) {
                return Integer.valueOf(ComparisonsKt.compareValues(Integer.valueOf(spannedItem2.getIndex()), numValueOf));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        }));
        if (spannedItem != null) {
            return spannedItem.getGaps();
        }
        return null;
    }

    static /* synthetic */ void ensureCapacity$default(LazyStaggeredGridLaneInfo lazyStaggeredGridLaneInfo, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        lazyStaggeredGridLaneInfo.ensureCapacity(i, i2);
    }

    private final void ensureCapacity(int p0, int p1) {
        if (p0 > 131072) {
            StringBuilder sb = new StringBuilder("Requested item capacity ");
            sb.append(p0);
            sb.append(" is larger than max supported: 131072!");
            throw new IllegalArgumentException(sb.toString().toString());
        }
        int[] iArr = this.lanes;
        if (iArr.length < p0) {
            int length = iArr.length;
            while (length < p0) {
                length *= 2;
            }
            this.lanes = ArraysKt.copyInto$default(this.lanes, new int[length], p1, 0, 0, 12, (Object) null);
        }
    }
}
