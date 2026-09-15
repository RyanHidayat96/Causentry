package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.PreconditionsKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.markers.KMutableList;
import kotlin.jvm.internal.markers.KMutableListIterator;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\b\n\u0002\u0010)\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010+\n\u0002\b\u0016\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000e\u001a\u00020\n2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0097\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0019\u0010\u0013J\u0017\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001a\u0010\fJ\u001f\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001a\u0010\u001cJ%\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010\u001d\u001a\u00020\n2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0016¢\u0006\u0004\b\u001d\u0010\u000fJ\u000f\u0010\u001f\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000!H\u0017¢\u0006\u0004\b\"\u0010#J\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000!2\u0006\u0010\u0004\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\"\u0010$J\u0017\u0010%\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b%\u0010\fJ\u001d\u0010&\u001a\u00020\n2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0016¢\u0006\u0004\b&\u0010\u000fJ\u0017\u0010'\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¢\u0006\u0004\b'\u0010\u0011J\u001d\u0010(\u001a\u00020\n2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0016¢\u0006\u0004\b(\u0010\u000fJ \u0010)\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b)\u0010*J%\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u001bH\u0002¢\u0006\u0004\b-\u0010 R \u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0014\u00102\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00104\u001a\u00020\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b4\u00103R$\u00105\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00058\u0017@RX\u0097\u000e¢\u0006\f\n\u0004\b5\u00103\u001a\u0004\b6\u00107"}, d2 = {"Landroidx/compose/runtime/snapshots/SubList;", ExifInterface.GPS_DIRECTION_TRUE, "", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "p0", "", "p1", "p2", "<init>", "(Landroidx/compose/runtime/snapshots/SnapshotStateList;II)V", "", "contains", "(Ljava/lang/Object;)Z", "", "containsAll", "(Ljava/util/Collection;)Z", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "lastIndexOf", "add", "", "(ILjava/lang/Object;)V", "addAll", "(ILjava/util/Collection;)Z", "clear", "()V", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "remove", "removeAll", "removeAt", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "subList", "(II)Ljava/util/List;", "validateModification", "parentList", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "getParentList", "()Landroidx/compose/runtime/snapshots/SnapshotStateList;", TypedValues.CycleType.S_WAVE_OFFSET, "I", "structure", "size", "getSize", "()I"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SubList<T> implements List<T>, KMutableList {
    public static final int $stable = 8;
    private final int offset;
    private final SnapshotStateList<T> parentList;
    private int size;
    private int structure;

    public SubList(SnapshotStateList<T> snapshotStateList, int i, int i2) {
        this.parentList = snapshotStateList;
        this.offset = i;
        this.structure = SnapshotStateListKt.getStructure(snapshotStateList);
        this.size = i2 - i;
    }

    public final SnapshotStateList<T> getParentList() {
        return this.parentList;
    }

    @Override // java.util.List
    public final T remove(int i) {
        return removeAt(i);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return getSize();
    }

    public final int getSize() {
        return this.size;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object p0) {
        return indexOf(p0) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<?> p0) {
        Collection<?> collection = p0;
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final T get(int p0) {
        validateModification();
        SnapshotStateListKt.validateRange(p0, size());
        return this.parentList.get(this.offset + p0);
    }

    @Override // java.util.List
    public final int indexOf(Object p0) {
        validateModification();
        int i = this.offset;
        Iterator<Integer> it = RangesKt.until(i, size() + i).iterator();
        while (it.hasNext()) {
            int iNextInt = ((IntIterator) it).nextInt();
            if (Intrinsics.areEqual(p0, this.parentList.get(iNextInt))) {
                return iNextInt - this.offset;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object p0) {
        validateModification();
        int size = this.offset + size();
        do {
            size--;
            if (size < this.offset) {
                return -1;
            }
        } while (!Intrinsics.areEqual(p0, this.parentList.get(size)));
        return size - this.offset;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(T p0) {
        validateModification();
        this.parentList.add(this.offset + size(), p0);
        this.size = size() + 1;
        this.structure = SnapshotStateListKt.getStructure(this.parentList);
        return true;
    }

    @Override // java.util.List
    public final void add(int p0, T p1) {
        validateModification();
        this.parentList.add(this.offset + p0, p1);
        this.size = size() + 1;
        this.structure = SnapshotStateListKt.getStructure(this.parentList);
    }

    @Override // java.util.List
    public final boolean addAll(int p0, Collection<? extends T> p1) {
        validateModification();
        boolean zAddAll = this.parentList.addAll(p0 + this.offset, p1);
        if (zAddAll) {
            this.size = size() + p1.size();
            this.structure = SnapshotStateListKt.getStructure(this.parentList);
        }
        return zAddAll;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends T> p0) {
        return addAll(size(), p0);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        if (size() > 0) {
            validateModification();
            SnapshotStateList<T> snapshotStateList = this.parentList;
            int i = this.offset;
            snapshotStateList.removeRange(i, size() + i);
            this.size = 0;
            this.structure = SnapshotStateListKt.getStructure(this.parentList);
        }
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator(int p0) {
        validateModification();
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = p0 - 1;
        return new AnonymousClass1(intRef, this);
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.snapshots.SubList$listIterator$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010+\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0001\n\u0002\b\u0007\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\u0007J\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0004J\u0010\u0010\u0010\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\tJ\u000f\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u000e"}, d2 = {"Landroidx/compose/runtime/snapshots/SubList$listIterator$1;", "", "", "hasPrevious", "()Z", "", "nextIndex", "()I", "previous", "()Ljava/lang/Object;", "previousIndex", "p0", "", "add", "(Ljava/lang/Object;)Ljava/lang/Void;", "hasNext", "next", "remove", "()Ljava/lang/Void;", "set"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass1 implements ListIterator<T>, KMutableListIterator {
        final /* synthetic */ Ref.IntRef $current;
        final /* synthetic */ SubList<T> this$0;

        AnonymousClass1(Ref.IntRef intRef, SubList<T> subList) {
            this.$current = intRef;
            this.this$0 = subList;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.$current.element >= 0;
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.$current.element + 1;
        }

        @Override // java.util.ListIterator
        public final T previous() {
            int i = this.$current.element;
            SnapshotStateListKt.validateRange(i, this.this$0.size());
            this.$current.element = i - 1;
            return this.this$0.get(i);
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.$current.element;
        }

        @Override // java.util.ListIterator
        public final Void add(T p0) {
            SnapshotStateListKt.modificationError();
            throw new KotlinNothingValueException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.$current.element < this.this$0.size() - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final T next() {
            int i = this.$current.element + 1;
            SnapshotStateListKt.validateRange(i, this.this$0.size());
            this.$current.element = i;
            return this.this$0.get(i);
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final Void remove() {
            SnapshotStateListKt.modificationError();
            throw new KotlinNothingValueException();
        }

        @Override // java.util.ListIterator
        public final Void set(T p0) {
            SnapshotStateListKt.modificationError();
            throw new KotlinNothingValueException();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object p0) {
        int iIndexOf = indexOf(p0);
        if (iIndexOf < 0) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<?> p0) {
        Iterator<?> it = p0.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    public final T removeAt(int p0) {
        validateModification();
        T tRemove = this.parentList.remove(this.offset + p0);
        this.size = size() - 1;
        this.structure = SnapshotStateListKt.getStructure(this.parentList);
        return tRemove;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<?> p0) {
        validateModification();
        SnapshotStateList<T> snapshotStateList = this.parentList;
        int i = this.offset;
        int iRetainAllInRange$runtime = snapshotStateList.retainAllInRange$runtime(p0, i, size() + i);
        if (iRetainAllInRange$runtime > 0) {
            this.structure = SnapshotStateListKt.getStructure(this.parentList);
            this.size = size() - iRetainAllInRange$runtime;
        }
        return iRetainAllInRange$runtime > 0;
    }

    @Override // java.util.List
    public final T set(int p0, T p1) {
        SnapshotStateListKt.validateRange(p0, size());
        validateModification();
        T t = this.parentList.set(p0 + this.offset, p1);
        this.structure = SnapshotStateListKt.getStructure(this.parentList);
        return t;
    }

    @Override // java.util.List
    public final List<T> subList(int p0, int p1) {
        if (p0 < 0 || p0 > p1 || p1 > size()) {
            PreconditionsKt.throwIllegalArgumentException("fromIndex or toIndex are out of bounds");
        }
        validateModification();
        SnapshotStateList<T> snapshotStateList = this.parentList;
        int i = this.offset;
        return new SubList(snapshotStateList, p0 + i, p1 + i);
    }

    private final void validateModification() {
        if (SnapshotStateListKt.getStructure(this.parentList) != this.structure) {
            throw new ConcurrentModificationException();
        }
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
