package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import androidx.exifinterface.media.ExifInterface;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableCollection;
import kotlin.jvm.internal.markers.KMutableSet;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001f\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010)\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0015\n\u0002\b\t\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001BB\u001b\b\u0016\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\b\u0001\u0012\u00028\u0000\u0018\u00010\u0000¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0016\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007¢\u0006\u0004\b\u0005\u0010\bB\u001b\b\u0016\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\b\u0001\u0012\u00028\u0000\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\nB\u0013\b\u0007\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u000b¢\u0006\u0004\b\u0005\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\u00020\u00102\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0000¢\u0006\u0004\b\u0011\u0010\u0006J\u001d\u0010\u0011\u001a\u00020\r2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u000fJ\u001d\u0010\u0016\u001a\u00020\r2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\u0012J\u0015\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u000b¢\u0006\u0004\b\u0017\u0010\fJ\u001a\u0010\u0019\u001a\u00020\r2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u000fJ\u000f\u0010\u001a\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u000b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 H\u0097\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b#\u0010\u000fJ\u001d\u0010$\u001a\u00020\r2\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0000¢\u0006\u0004\b$\u0010%J\u001d\u0010$\u001a\u00020\r2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0016¢\u0006\u0004\b$\u0010\u0012J\u0015\u0010&\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u000b¢\u0006\u0004\b&\u0010'J\u001d\u0010(\u001a\u00020\r2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0016¢\u0006\u0004\b(\u0010\u0012J\u0017\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\tH\u0007¢\u0006\u0004\b)\u0010*J)\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00010\t\"\u0004\b\u0001\u0010+2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\tH\u0007¢\u0006\u0004\b)\u0010,J\u000f\u0010.\u001a\u00020-H\u0017¢\u0006\u0004\b.\u0010/J\u0015\u00100\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u000b¢\u0006\u0004\b0\u0010'R\"\u00101\u001a\u00020\u000b8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u0010\u001b\"\u0004\b4\u0010\fR*\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\t8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u0010*\"\u0004\b8\u0010\nR\"\u0010:\u001a\u0002098\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u0014\u0010A\u001a\u00020\u000b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010\u001b"}, d2 = {"Landroidx/collection/ArraySet;", ExifInterface.LONGITUDE_EAST, "", "", "p0", "<init>", "(Landroidx/collection/ArraySet;)V", "", "(Ljava/util/Collection;)V", "", "([Ljava/lang/Object;)V", "", "(I)V", "", "add", "(Ljava/lang/Object;)Z", "", "addAll", "(Ljava/util/Collection;)Z", "clear", "()V", "contains", "containsAll", "ensureCapacity", "", "equals", "hashCode", "()I", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "remove", "removeAll", "(Landroidx/collection/ArraySet;)Z", "removeAt", "(I)Ljava/lang/Object;", "retainAll", "toArray", "()[Ljava/lang/Object;", ExifInterface.GPS_DIRECTION_TRUE, "([Ljava/lang/Object;)[Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "valueAt", "_size", "I", "get_size$collection", "set_size$collection", "array", "[Ljava/lang/Object;", "getArray$collection", "setArray$collection", "", "hashes", "[I", "getHashes$collection", "()[I", "setHashes$collection", "([I)V", "getSize", "size", "ElementIterator"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ArraySet<E> implements Collection<E>, Set<E>, KMutableCollection, KMutableSet {
    private int _size;
    private Object[] array;
    private int[] hashes;

    public ArraySet(int i) {
        this.hashes = ContainerHelpersKt.EMPTY_INTS;
        this.array = ContainerHelpersKt.EMPTY_OBJECTS;
        if (i > 0) {
            ArraySetKt.allocArrays(this, i);
        }
    }

    public /* synthetic */ ArraySet(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return get_size();
    }

    /* JADX INFO: renamed from: getHashes$collection, reason: from getter */
    public final int[] getHashes() {
        return this.hashes;
    }

    public final void setHashes$collection(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "");
        this.hashes = iArr;
    }

    /* JADX INFO: renamed from: getArray$collection, reason: from getter */
    public final Object[] getArray() {
        return this.array;
    }

    public final void setArray$collection(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "");
        this.array = objArr;
    }

    public final int get_size$collection() {
        return this._size;
    }

    public final void set_size$collection(int i) {
        this._size = i;
    }

    /* JADX INFO: renamed from: getSize, reason: from getter */
    public final int get_size() {
        return this._size;
    }

    public ArraySet(ArraySet<? extends E> arraySet) {
        this(0);
        if (arraySet != null) {
            addAll((ArraySet) arraySet);
        }
    }

    public ArraySet(Collection<? extends E> collection) {
        this(0);
        if (collection != null) {
            addAll(collection);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ArraySet(E[] eArr) {
        this(0);
        if (eArr != null) {
            Iterator it = ArrayIteratorKt.iterator(eArr);
            while (it.hasNext()) {
                add(it.next());
            }
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return ArraysKt.copyOfRange(this.array, 0, this._size);
    }

    @Override // java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        T[] tArr = (T[]) ArraySetJvmUtil.resizeForToArray(p0, this._size);
        ArraysKt.copyInto(this.array, tArr, 0, 0, this._size);
        Intrinsics.checkNotNull(tArr);
        return tArr;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        return new ElementIterator();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroidx/collection/ArraySet$ElementIterator;", "Landroidx/collection/IndexBasedArrayIterator;", "<init>", "(Landroidx/collection/ArraySet;)V", "", "p0", "elementAt", "(I)Ljava/lang/Object;", "", "removeAt", "(I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
    final class ElementIterator extends IndexBasedArrayIterator<E> {
        public ElementIterator() {
            super(ArraySet.this.get_size$collection());
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        protected final E elementAt(int p0) {
            return ArraySet.this.valueAt(p0);
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        protected final void removeAt(int p0) {
            ArraySet.this.removeAt(p0);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (get_size$collection() != 0) {
            setHashes$collection(ContainerHelpersKt.EMPTY_INTS);
            setArray$collection(ContainerHelpersKt.EMPTY_OBJECTS);
            set_size$collection(0);
        }
        if (get_size$collection() != 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final void ensureCapacity(int p0) {
        int i = get_size$collection();
        if (getHashes().length < p0) {
            int[] hashes = getHashes();
            Object[] array = getArray();
            ArraySetKt.allocArrays(this, p0);
            if (get_size$collection() > 0) {
                ArraysKt.copyInto$default(hashes, getHashes(), 0, 0, get_size$collection(), 6, (Object) null);
                ArraysKt.copyInto$default(array, getArray(), 0, 0, get_size$collection(), 6, (Object) null);
            }
        }
        if (get_size$collection() != i) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object p0) {
        return indexOf(p0) >= 0;
    }

    public final int indexOf(Object p0) {
        return p0 == null ? ArraySetKt.indexOfNull(this) : ArraySetKt.indexOf(this, p0, p0.hashCode());
    }

    public final E valueAt(int p0) {
        return (E) getArray()[p0];
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return get_size$collection() <= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(E p0) {
        int i;
        int iIndexOf;
        int i2 = get_size$collection();
        if (p0 == null) {
            iIndexOf = ArraySetKt.indexOfNull(this);
            i = 0;
        } else {
            int iHashCode = p0.hashCode();
            i = iHashCode;
            iIndexOf = ArraySetKt.indexOf(this, p0, iHashCode);
        }
        if (iIndexOf >= 0) {
            return false;
        }
        int i3 = ~iIndexOf;
        if (i2 >= getHashes().length) {
            int i4 = 8;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i4 = 4;
            }
            int[] hashes = getHashes();
            Object[] array = getArray();
            ArraySetKt.allocArrays(this, i4);
            if (i2 != get_size$collection()) {
                throw new ConcurrentModificationException();
            }
            if (getHashes().length != 0) {
                ArraysKt.copyInto$default(hashes, getHashes(), 0, 0, hashes.length, 6, (Object) null);
                ArraysKt.copyInto$default(array, getArray(), 0, 0, array.length, 6, (Object) null);
            }
        }
        if (i3 < i2) {
            int i5 = i3 + 1;
            ArraysKt.copyInto(getHashes(), getHashes(), i5, i3, i2);
            ArraysKt.copyInto(getArray(), getArray(), i5, i3, i2);
        }
        if (i2 != get_size$collection() || i3 >= getHashes().length) {
            throw new ConcurrentModificationException();
        }
        getHashes()[i3] = i;
        getArray()[i3] = p0;
        set_size$collection(get_size$collection() + 1);
        return true;
    }

    public final void addAll(ArraySet<? extends E> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        int i = p0.get_size$collection();
        ensureCapacity(get_size$collection() + i);
        if (get_size$collection() != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                add(p0.valueAt(i2));
            }
            return;
        }
        if (i > 0) {
            ArraysKt.copyInto$default(p0.getHashes(), getHashes(), 0, 0, i, 6, (Object) null);
            ArraysKt.copyInto$default(p0.getArray(), getArray(), 0, 0, i, 6, (Object) null);
            if (get_size$collection() != 0) {
                throw new ConcurrentModificationException();
            }
            set_size$collection(i);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object p0) {
        int iIndexOf = indexOf(p0);
        if (iIndexOf < 0) {
            return false;
        }
        removeAt(iIndexOf);
        return true;
    }

    public final E removeAt(int p0) {
        int i = get_size$collection();
        E e2 = (E) getArray()[p0];
        if (i <= 1) {
            clear();
            return e2;
        }
        int i2 = i - 1;
        if (getHashes().length > 8 && get_size$collection() < getHashes().length / 3) {
            int i3 = get_size$collection() > 8 ? get_size$collection() + (get_size$collection() >> 1) : 8;
            int[] hashes = getHashes();
            Object[] array = getArray();
            ArraySetKt.allocArrays(this, i3);
            if (p0 > 0) {
                ArraysKt.copyInto$default(hashes, getHashes(), 0, 0, p0, 6, (Object) null);
                ArraysKt.copyInto$default(array, getArray(), 0, 0, p0, 6, (Object) null);
            }
            if (p0 < i2) {
                int i4 = p0 + 1;
                ArraysKt.copyInto(hashes, getHashes(), p0, i4, i);
                ArraysKt.copyInto(array, getArray(), p0, i4, i);
            }
        } else {
            if (p0 < i2) {
                int i5 = p0 + 1;
                ArraysKt.copyInto(getHashes(), getHashes(), p0, i5, i);
                ArraysKt.copyInto(getArray(), getArray(), p0, i5, i);
            }
            getArray()[i2] = null;
        }
        if (i != get_size$collection()) {
            throw new ConcurrentModificationException();
        }
        set_size$collection(i2);
        return e2;
    }

    public final boolean removeAll(ArraySet<? extends E> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        int i = p0.get_size$collection();
        int i2 = get_size$collection();
        for (int i3 = 0; i3 < i; i3++) {
            remove(p0.valueAt(i3));
        }
        return i2 != get_size$collection();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof Set) || size() != ((Set) p0).size()) {
            return false;
        }
        try {
            int i = get_size$collection();
            for (int i2 = 0; i2 < i; i2++) {
                if (!((Set) p0).contains(valueAt(i2))) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] hashes = getHashes();
        int i = get_size$collection();
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += hashes[i3];
        }
        return i2;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(get_size$collection() * 14);
        sb.append('{');
        int i = get_size$collection();
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            E eValueAt = valueAt(i2);
            if (eValueAt != this) {
                sb.append(eValueAt);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<? extends Object> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        Iterator<? extends Object> it = p0.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection<? extends E> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        ensureCapacity(get_size$collection() + p0.size());
        Iterator<? extends E> it = p0.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<? extends Object> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        Iterator<? extends Object> it = p0.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<? extends Object> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        boolean z = false;
        for (int i = get_size$collection() - 1; i >= 0; i--) {
            if (!CollectionsKt.contains(p0, getArray()[i])) {
                removeAt(i);
                z = true;
            }
        }
        return z;
    }

    public ArraySet() {
        this(0, 1, null);
    }
}
