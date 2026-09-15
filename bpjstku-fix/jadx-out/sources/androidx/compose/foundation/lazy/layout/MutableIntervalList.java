package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.collection.MutableVector;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ9\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0018\u0010\u000f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0004\u0012\u00020\b0\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0006\u001a\u00020\u0005H\u0097\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J!\u0010\u0016\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0\u00188\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR$\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00058\u0017@RX\u0097\u000e¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 "}, d2 = {"Landroidx/compose/foundation/lazy/layout/MutableIntervalList;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/foundation/lazy/layout/IntervalList;", "<init>", "()V", "", "p0", "p1", "", "addInterval", "(ILjava/lang/Object;)V", "checkIndexBounds", "(I)V", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/layout/IntervalList$Interval;", "p2", "forEach", "(IILkotlin/jvm/functions/Function1;)V", "get", "(I)Landroidx/compose/foundation/lazy/layout/IntervalList$Interval;", "getIntervalForIndex", "", "contains", "(Landroidx/compose/foundation/lazy/layout/IntervalList$Interval;I)Z", "Landroidx/compose/runtime/collection/MutableVector;", "intervals", "Landroidx/compose/runtime/collection/MutableVector;", "lastInterval", "Landroidx/compose/foundation/lazy/layout/IntervalList$Interval;", "size", "I", "getSize", "()I"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MutableIntervalList<T> implements IntervalList<T> {
    public static final int $stable = 8;
    private final MutableVector<IntervalList.Interval<T>> intervals = new MutableVector<>(new IntervalList.Interval[16], 0);
    private IntervalList.Interval<? extends T> lastInterval;
    private int size;

    @Override // androidx.compose.foundation.lazy.layout.IntervalList
    public final int getSize() {
        return this.size;
    }

    public final void addInterval(int p0, T p1) {
        if (p0 < 0) {
            throw new IllegalArgumentException("size should be >=0, but was ".concat(String.valueOf(p0)).toString());
        }
        if (p0 == 0) {
            return;
        }
        IntervalList.Interval<T> interval = new IntervalList.Interval<>(getSize(), p0, p1);
        this.size = getSize() + p0;
        this.intervals.add(interval);
    }

    @Override // androidx.compose.foundation.lazy.layout.IntervalList
    public final void forEach(int p0, int p1, Function1<? super IntervalList.Interval<? extends T>, Unit> p2) {
        checkIndexBounds(p0);
        checkIndexBounds(p1);
        if (p1 >= p0) {
            int iBinarySearch = IntervalListKt.binarySearch(this.intervals, p0);
            int startIndex = this.intervals.getContent()[iBinarySearch].getStartIndex();
            while (startIndex <= p1) {
                IntervalList.Interval<T> interval = this.intervals.getContent()[iBinarySearch];
                p2.invoke(interval);
                startIndex += interval.getSize();
                iBinarySearch++;
            }
            return;
        }
        StringBuilder sb = new StringBuilder("toIndex (");
        sb.append(p1);
        sb.append(") should be not smaller than fromIndex (");
        sb.append(p0);
        sb.append(')');
        throw new IllegalArgumentException(sb.toString().toString());
    }

    @Override // androidx.compose.foundation.lazy.layout.IntervalList
    public final IntervalList.Interval<T> get(int p0) {
        checkIndexBounds(p0);
        return getIntervalForIndex(p0);
    }

    private final IntervalList.Interval<T> getIntervalForIndex(int p0) {
        IntervalList.Interval<? extends T> interval = this.lastInterval;
        if (interval != null && contains(interval, p0)) {
            return interval;
        }
        MutableVector<IntervalList.Interval<T>> mutableVector = this.intervals;
        IntervalList.Interval interval2 = (IntervalList.Interval<? extends T>) mutableVector.getContent()[IntervalListKt.binarySearch(mutableVector, p0)];
        this.lastInterval = interval2;
        return interval2;
    }

    private final void checkIndexBounds(int p0) {
        if (p0 < 0 || p0 >= getSize()) {
            StringBuilder sb = new StringBuilder("Index ");
            sb.append(p0);
            sb.append(", size ");
            sb.append(getSize());
            throw new IndexOutOfBoundsException(sb.toString());
        }
    }

    private final boolean contains(IntervalList.Interval<? extends T> interval, int i) {
        return i < interval.getStartIndex() + interval.getSize() && interval.getStartIndex() <= i;
    }
}
