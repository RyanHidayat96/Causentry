package androidx.compose.material3.carousel;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010(\n\u0002\b\u0004\n\u0002\u0010*\n\u0002\b \b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0000\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\n\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0096\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\rH\u0097\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0014\u0010\u0013J\u0018\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006H\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\f¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u001cH\u0097\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\f¢\u0006\u0004\b\u001f\u0010\u000fJ\u0018\u0010 \u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0001¢\u0006\u0004\b \u0010\u0016J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020!H\u0097\u0001¢\u0006\u0004\b\"\u0010#J\u001e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020!2\u0006\u0010\u0003\u001a\u00020\rH\u0097\u0001¢\u0006\u0004\b\"\u0010$J&\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010%\u001a\u00020\rH\u0097\u0001¢\u0006\u0004\b&\u0010'R\u001a\u0010(\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010,\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001a\u00100\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010)\u001a\u0004\b1\u0010+R\u001a\u00102\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010-\u001a\u0004\b3\u0010/R\u001a\u00104\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010)\u001a\u0004\b5\u0010+R\u001a\u00106\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010-\u001a\u0004\b7\u0010/R\u001a\u00108\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b8\u0010)\u001a\u0004\b9\u0010+R\u001a\u0010:\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010-\u001a\u0004\b;\u0010/R\u001a\u0010<\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010)\u001a\u0004\b=\u0010+R\u001a\u0010>\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b>\u0010-\u001a\u0004\b?\u0010/R\u0014\u0010A\u001a\u00020\r8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b@\u0010/"}, d2 = {"Landroidx/compose/material3/carousel/KeylineList;", "", "Landroidx/compose/material3/carousel/Keyline;", "p0", "<init>", "(Ljava/util/List;)V", "", "contains", "(Landroidx/compose/material3/carousel/Keyline;)Z", "", "containsAll", "(Ljava/util/Collection;)Z", "", "", "firstIndexAfterFocalRangeWithSize", "(F)I", "get", "(I)Landroidx/compose/material3/carousel/Keyline;", "getKeylineAfter", "(F)Landroidx/compose/material3/carousel/Keyline;", "getKeylineBefore", "indexOf", "(Landroidx/compose/material3/carousel/Keyline;)I", "isEmpty", "()Z", "isFirstFocalItemAtStartOfContainer", "isLastFocalItemAtEndOfContainer", "(F)Z", "", "iterator", "()Ljava/util/Iterator;", "lastIndexBeforeFocalRangeWithSize", "lastIndexOf", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "p1", "subList", "(II)Ljava/util/List;", "firstFocal", "Landroidx/compose/material3/carousel/Keyline;", "getFirstFocal", "()Landroidx/compose/material3/carousel/Keyline;", "firstFocalIndex", "I", "getFirstFocalIndex", "()I", "firstNonAnchor", "getFirstNonAnchor", "firstNonAnchorIndex", "getFirstNonAnchorIndex", "lastFocal", "getLastFocal", "lastFocalIndex", "getLastFocalIndex", "lastNonAnchor", "getLastNonAnchor", "lastNonAnchorIndex", "getLastNonAnchorIndex", "pivot", "getPivot", "pivotIndex", "getPivotIndex", "getSize", "size"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class KeylineList implements List<Keyline>, KMappedMarker {
    public static final int $stable = 8;
    private final /* synthetic */ List<Keyline> $$delegate_0;
    private final Keyline firstFocal;
    private final int firstFocalIndex;
    private final Keyline firstNonAnchor;
    private final int firstNonAnchorIndex;
    private final Keyline lastFocal;
    private final int lastFocalIndex;
    private final Keyline lastNonAnchor;
    private final int lastNonAnchorIndex;
    private final Keyline pivot;
    private final int pivotIndex;

    public KeylineList(List<Keyline> list) {
        int iNextIndex;
        int iNextIndex2;
        this.$$delegate_0 = list;
        KeylineList keylineList = this;
        Iterator<Keyline> it = keylineList.iterator();
        int i = 0;
        int i2 = 0;
        while (true) {
            iNextIndex = -1;
            if (!it.hasNext()) {
                i2 = -1;
                break;
            } else if (it.next().isPivot()) {
                break;
            } else {
                i2++;
            }
        }
        this.pivotIndex = i2;
        this.pivot = get(i2);
        Iterator<Keyline> it2 = keylineList.iterator();
        int i3 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i3 = -1;
                break;
            } else if (!it2.next().isAnchor()) {
                break;
            } else {
                i3++;
            }
        }
        this.firstNonAnchorIndex = i3;
        this.firstNonAnchor = get(i3);
        ListIterator<Keyline> listIterator = keylineList.listIterator(keylineList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                iNextIndex2 = -1;
                break;
            } else if (!listIterator.previous().isAnchor()) {
                iNextIndex2 = listIterator.nextIndex();
                break;
            }
        }
        this.lastNonAnchorIndex = iNextIndex2;
        this.lastNonAnchor = get(iNextIndex2);
        Iterator<Keyline> it3 = keylineList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                i = -1;
                break;
            } else if (it3.next().isFocal()) {
                break;
            } else {
                i++;
            }
        }
        this.firstFocalIndex = i;
        Keyline keyline = (Keyline) CollectionsKt.getOrNull(keylineList, i);
        if (keyline == null) {
            throw new NoSuchElementException("All KeylineLists must have at least one focal keyline");
        }
        this.firstFocal = keyline;
        ListIterator<Keyline> listIterator2 = keylineList.listIterator(keylineList.size());
        while (listIterator2.hasPrevious()) {
            if (listIterator2.previous().isFocal()) {
                iNextIndex = listIterator2.nextIndex();
                break;
            }
        }
        this.lastFocalIndex = iNextIndex;
        Keyline keyline2 = (Keyline) CollectionsKt.getOrNull(keylineList, iNextIndex);
        if (keyline2 == null) {
            throw new NoSuchElementException("All KeylineLists must have at least one focal keyline");
        }
        this.lastFocal = keyline2;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Keyline) {
            return contains((Keyline) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Keyline) {
            return indexOf((Keyline) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Keyline) {
            return lastIndexOf((Keyline) obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return getSize();
    }

    public final int getPivotIndex() {
        return this.pivotIndex;
    }

    public final Keyline getPivot() {
        return this.pivot;
    }

    public final int getFirstNonAnchorIndex() {
        return this.firstNonAnchorIndex;
    }

    public final Keyline getFirstNonAnchor() {
        return this.firstNonAnchor;
    }

    public final int getLastNonAnchorIndex() {
        return this.lastNonAnchorIndex;
    }

    public final Keyline getLastNonAnchor() {
        return this.lastNonAnchor;
    }

    public final int getFirstFocalIndex() {
        return this.firstFocalIndex;
    }

    public final Keyline getFirstFocal() {
        return this.firstFocal;
    }

    public final int getLastFocalIndex() {
        return this.lastFocalIndex;
    }

    public final Keyline getLastFocal() {
        return this.lastFocal;
    }

    public final boolean isFirstFocalItemAtStartOfContainer() {
        return this.firstFocal.getOffset() - (this.firstFocal.getSize() / 2.0f) >= 0.0f && Intrinsics.areEqual(this.firstFocal, this.firstNonAnchor);
    }

    public final boolean isLastFocalItemAtEndOfContainer(float p0) {
        return this.lastFocal.getOffset() + (this.lastFocal.getSize() / 2.0f) <= p0 && Intrinsics.areEqual(this.lastFocal, this.lastNonAnchor);
    }

    public final int firstIndexAfterFocalRangeWithSize(float p0) {
        Integer next;
        KeylineList keylineList = this;
        Iterator<Integer> it = new IntRange(this.lastFocalIndex, CollectionsKt.getLastIndex(keylineList)).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (get(next.intValue()).getSize() != p0);
        Integer num = next;
        return num != null ? num.intValue() : CollectionsKt.getLastIndex(keylineList);
    }

    public final int lastIndexBeforeFocalRangeWithSize(float p0) {
        Integer next;
        Iterator<Integer> it = RangesKt.downTo(this.firstFocalIndex - 1, 0).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (get(next.intValue()).getSize() != p0);
        Integer num = next;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final Keyline getKeylineBefore(float p0) {
        int size = size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                Keyline keyline = get(size);
                if (keyline.getUnadjustedOffset() < p0) {
                    return keyline;
                }
                if (i >= 0) {
                    size = i;
                }
            }
        }
        return (Keyline) CollectionsKt.first((List) this);
    }

    public final Keyline getKeylineAfter(float p0) {
        Keyline keyline;
        KeylineList keylineList = this;
        int size = keylineList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                keyline = null;
                break;
            }
            keyline = keylineList.get(i);
            if (keyline.getUnadjustedOffset() >= p0) {
                break;
            }
            i++;
        }
        Keyline keyline2 = keyline;
        return keyline2 == null ? (Keyline) CollectionsKt.last((List) keylineList) : keyline2;
    }

    /* JADX INFO: renamed from: add, reason: avoid collision after fix types in other method */
    public final void add2(int i, Keyline keyline) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* synthetic */ void add(int i, Keyline keyline) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean add(Keyline keyline) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends Keyline> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends Keyline> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean contains(Keyline p0) {
        return this.$$delegate_0.contains(p0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<? extends Object> p0) {
        return this.$$delegate_0.containsAll(p0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.List
    public final Keyline get(int p0) {
        return this.$$delegate_0.get(p0);
    }

    public final int getSize() {
        return this.$$delegate_0.size();
    }

    public final int indexOf(Keyline p0) {
        return this.$$delegate_0.indexOf(p0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.$$delegate_0.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<Keyline> iterator() {
        return this.$$delegate_0.iterator();
    }

    public final int lastIndexOf(Keyline p0) {
        return this.$$delegate_0.lastIndexOf(p0);
    }

    @Override // java.util.List
    public final ListIterator<Keyline> listIterator() {
        return this.$$delegate_0.listIterator();
    }

    @Override // java.util.List
    public final ListIterator<Keyline> listIterator(int p0) {
        return this.$$delegate_0.listIterator(p0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.List
    public final Keyline remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* synthetic */ Keyline remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator<Keyline> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: set, reason: avoid collision after fix types in other method */
    public final Keyline set2(int i, Keyline keyline) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* synthetic */ Keyline set(int i, Keyline keyline) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void sort(Comparator<? super Keyline> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List<Keyline> subList(int p0, int p1) {
        return this.$$delegate_0.subList(p0, p1);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) CollectionToArray.toArray(this, tArr);
    }
}
