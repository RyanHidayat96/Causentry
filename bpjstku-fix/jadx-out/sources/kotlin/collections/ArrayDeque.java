package kotlin.collections;

import androidx.exifinterface.media.ExifInterface;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 W*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001WB\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0007B\u0017\b\u0016\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\u0005\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000b\u0010\u0006J\u0017\u0010\f\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\f\u0010\u0006J\u0018\u0010\r\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0083\b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0083\b¢\u0006\u0004\b\u0012\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0013\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0014\u0010\u0010J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00028\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u001a\u0010\u0019J\r\u0010\u001b\u001a\u00028\u0000¢\u0006\u0004\b\u001b\u0010\u0019J\u000f\u0010\u001c\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u001c\u0010\u0019J\u0015\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u001f\u0010\u001eJ\r\u0010 \u001a\u00028\u0000¢\u0006\u0004\b \u0010\u0019J\u000f\u0010!\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b!\u0010\u0019J\r\u0010\"\u001a\u00028\u0000¢\u0006\u0004\b\"\u0010\u0019J\u000f\u0010#\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b#\u0010\u0019J\u0017\u0010$\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b$\u0010%J\u001f\u0010$\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010&\u001a\u00028\u0000H\u0016¢\u0006\u0004\b$\u0010'J%\u0010(\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0002¢\u0006\u0004\b(\u0010)J\u001d\u0010*\u001a\u00020\u00152\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b*\u0010+J%\u0010*\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b*\u0010,J\u0018\u0010-\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b-\u0010\u000eJ \u0010.\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010&\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b.\u0010/J\u0018\u00100\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b0\u0010%J\u0017\u00101\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b3\u00102J\u0017\u00104\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b4\u0010%J\u0017\u00105\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b5\u0010\u000eJ\u001d\u00106\u001a\u00020\u00152\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b6\u0010+J\u001d\u00107\u001a\u00020\u00152\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b7\u0010+J$\u00109\u001a\u00020\u00152\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001508H\u0082\b¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\nH\u0016¢\u0006\u0004\b;\u0010\u0007J)\u0010>\u001a\b\u0012\u0004\u0012\u00028\u00010=\"\u0004\b\u0001\u0010<2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010=H\u0017¢\u0006\u0004\b>\u0010?J\u0017\u0010>\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010@0=H\u0017¢\u0006\u0004\b>\u0010AJ\u001f\u0010B\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u0003H\u0014¢\u0006\u0004\bB\u0010CJ\u001f\u0010D\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u0003H\u0002¢\u0006\u0004\bD\u0010CJ\u001f\u0010E\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u0003H\u0002¢\u0006\u0004\bE\u0010CJ\u001f\u0010F\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u0003H\u0002¢\u0006\u0004\bF\u0010CJ\u000f\u0010G\u001a\u00020\nH\u0002¢\u0006\u0004\bG\u0010\u0007J)\u0010H\u001a\b\u0012\u0004\u0012\u00028\u00010=\"\u0004\b\u0001\u0010<2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010=H\u0001¢\u0006\u0004\bH\u0010?J\u0017\u0010H\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010@0=H\u0001¢\u0006\u0004\bH\u0010AJ\u001f\u0010I\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u0003H\u0000¢\u0006\u0004\bI\u0010CJO\u0010O\u001a\u00020\n2>\u0010\u0004\u001a:\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bK\u0012\b\bL\u0012\u0004\b\b(M\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010@0=¢\u0006\f\bK\u0012\b\bL\u0012\u0004\b\b(N\u0012\u0004\u0012\u00020\n0JH\u0000¢\u0006\u0004\bO\u0010PR\u0016\u0010M\u001a\u00020\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bM\u0010QR\u001e\u0010R\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010@0=8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bR\u0010SR$\u0010T\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00038\u0017@RX\u0097\u000e¢\u0006\f\n\u0004\bT\u0010Q\u001a\u0004\bU\u0010V"}, d2 = {"Lkotlin/collections/ArrayDeque;", ExifInterface.LONGITUDE_EAST, "Lkotlin/collections/AbstractMutableList;", "", "p0", "<init>", "(I)V", "()V", "", "(Ljava/util/Collection;)V", "", "ensureCapacity", "copyElements", "internalGet", "(I)Ljava/lang/Object;", "positiveMod", "(I)I", "negativeMod", "internalIndex", "incremented", "decremented", "", "isEmpty", "()Z", "first", "()Ljava/lang/Object;", "firstOrNull", "last", "lastOrNull", "addFirst", "(Ljava/lang/Object;)V", "addLast", "removeFirst", "removeFirstOrNull", "removeLast", "removeLastOrNull", "add", "(Ljava/lang/Object;)Z", "p1", "(ILjava/lang/Object;)V", "copyCollectionElements", "(ILjava/util/Collection;)V", "addAll", "(Ljava/util/Collection;)Z", "(ILjava/util/Collection;)Z", "get", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "contains", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "remove", "removeAt", "removeAll", "retainAll", "Lkotlin/Function1;", "filterInPlace", "(Lkotlin/jvm/functions/Function1;)Z", "clear", ExifInterface.GPS_DIRECTION_TRUE, "", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", "", "()[Ljava/lang/Object;", "removeRange", "(II)V", "removeRangeShiftPreceding", "removeRangeShiftSucceeding", "nullifyNonEmpty", "registerModification", "testToArray$kotlin_stdlib", "testRemoveRange$kotlin_stdlib", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "head", "elements", "internalStructure$kotlin_stdlib", "(Lkotlin/jvm/functions/Function2;)V", "I", "elementData", "[Ljava/lang/Object;", "size", "getSize", "()I", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ArrayDeque<E> extends AbstractMutableList<E> {
    private static final int defaultMinCapacity = 10;
    private Object[] elementData;
    private int head;
    private int size;
    private static final Object[] emptyElementData = new Object[0];

    @Override // kotlin.collections.AbstractMutableList
    public final int getSize() {
        return this.size;
    }

    public ArrayDeque(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = emptyElementData;
        } else if (i > 0) {
            objArr = new Object[i];
        } else {
            throw new IllegalArgumentException("Illegal Capacity: ".concat(String.valueOf(i)));
        }
        this.elementData = objArr;
    }

    public ArrayDeque() {
        this.elementData = emptyElementData;
    }

    public ArrayDeque(Collection<? extends E> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        Object[] array = collection.toArray(new Object[0]);
        this.elementData = array;
        this.size = array.length;
        if (array.length == 0) {
            this.elementData = emptyElementData;
        }
    }

    private final void ensureCapacity(int p0) {
        if (p0 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.elementData;
        if (p0 <= objArr.length) {
            return;
        }
        if (objArr == emptyElementData) {
            this.elementData = new Object[RangesKt.coerceAtLeast(p0, 10)];
        } else {
            copyElements(AbstractList.INSTANCE.newCapacity$kotlin_stdlib(this.elementData.length, p0));
        }
    }

    private final void copyElements(int p0) {
        Object[] objArr = new Object[p0];
        Object[] objArr2 = this.elementData;
        ArraysKt.copyInto(objArr2, objArr, 0, this.head, objArr2.length);
        Object[] objArr3 = this.elementData;
        int length = objArr3.length;
        int i = this.head;
        ArraysKt.copyInto(objArr3, objArr, length - i, 0, i);
        this.head = 0;
        this.elementData = objArr;
    }

    private final E internalGet(int p0) {
        return (E) this.elementData[p0];
    }

    private final int positiveMod(int p0) {
        Object[] objArr = this.elementData;
        return p0 >= objArr.length ? p0 - objArr.length : p0;
    }

    private final int negativeMod(int p0) {
        return p0 < 0 ? p0 + this.elementData.length : p0;
    }

    private final int internalIndex(int p0) {
        return positiveMod(this.head + p0);
    }

    private final int incremented(int p0) {
        if (p0 == ArraysKt.getLastIndex(this.elementData)) {
            return 0;
        }
        return p0 + 1;
    }

    private final int decremented(int p0) {
        return p0 == 0 ? ArraysKt.getLastIndex(this.elementData) : p0 - 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final E first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return (E) this.elementData[this.head];
    }

    public final E firstOrNull() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.elementData[this.head];
    }

    public final E last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return (E) this.elementData[positiveMod(this.head + CollectionsKt.getLastIndex(this))];
    }

    public final E lastOrNull() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.elementData[positiveMod(this.head + CollectionsKt.getLastIndex(this))];
    }

    public final void addFirst(E p0) {
        registerModification();
        ensureCapacity(size() + 1);
        int iDecremented = decremented(this.head);
        this.head = iDecremented;
        this.elementData[iDecremented] = p0;
        this.size = size() + 1;
    }

    public final void addLast(E p0) {
        registerModification();
        ensureCapacity(size() + 1);
        this.elementData[positiveMod(this.head + size())] = p0;
        this.size = size() + 1;
    }

    public final E removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        registerModification();
        Object[] objArr = this.elementData;
        int i = this.head;
        E e2 = (E) objArr[i];
        objArr[i] = null;
        this.head = incremented(i);
        this.size = size() - 1;
        return e2;
    }

    public final E removeFirstOrNull() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    public final E removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        registerModification();
        int iPositiveMod = positiveMod(this.head + CollectionsKt.getLastIndex(this));
        Object[] objArr = this.elementData;
        E e2 = (E) objArr[iPositiveMod];
        objArr[iPositiveMod] = null;
        this.size = size() - 1;
        return e2;
    }

    public final E removeLastOrNull() {
        if (isEmpty()) {
            return null;
        }
        return removeLast();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E p0) {
        addLast(p0);
        return true;
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public final void add(int p0, E p1) {
        AbstractList.INSTANCE.checkPositionIndex$kotlin_stdlib(p0, size());
        if (p0 == size()) {
            addLast(p1);
            return;
        }
        if (p0 == 0) {
            addFirst(p1);
            return;
        }
        registerModification();
        ensureCapacity(size() + 1);
        int iPositiveMod = positiveMod(this.head + p0);
        if (p0 < ((size() + 1) >> 1)) {
            int iDecremented = decremented(iPositiveMod);
            int iDecremented2 = decremented(this.head);
            int i = this.head;
            if (iDecremented >= i) {
                Object[] objArr = this.elementData;
                objArr[iDecremented2] = objArr[i];
                ArraysKt.copyInto(objArr, objArr, i, i + 1, iDecremented + 1);
            } else {
                Object[] objArr2 = this.elementData;
                ArraysKt.copyInto(objArr2, objArr2, i - 1, i, objArr2.length);
                Object[] objArr3 = this.elementData;
                objArr3[objArr3.length - 1] = objArr3[0];
                ArraysKt.copyInto(objArr3, objArr3, 0, 1, iDecremented + 1);
            }
            this.elementData[iDecremented] = p1;
            this.head = iDecremented2;
        } else {
            int iPositiveMod2 = positiveMod(this.head + size());
            if (iPositiveMod < iPositiveMod2) {
                Object[] objArr4 = this.elementData;
                ArraysKt.copyInto(objArr4, objArr4, iPositiveMod + 1, iPositiveMod, iPositiveMod2);
            } else {
                Object[] objArr5 = this.elementData;
                ArraysKt.copyInto(objArr5, objArr5, 1, 0, iPositiveMod2);
                Object[] objArr6 = this.elementData;
                objArr6[0] = objArr6[objArr6.length - 1];
                ArraysKt.copyInto(objArr6, objArr6, iPositiveMod + 1, iPositiveMod, objArr6.length - 1);
            }
            this.elementData[iPositiveMod] = p1;
        }
        this.size = size() + 1;
    }

    private final void copyCollectionElements(int p0, Collection<? extends E> p1) {
        Iterator<? extends E> it = p1.iterator();
        int length = this.elementData.length;
        while (p0 < length && it.hasNext()) {
            this.elementData[p0] = it.next();
            p0++;
        }
        int i = this.head;
        for (int i2 = 0; i2 < i && it.hasNext(); i2++) {
            this.elementData[i2] = it.next();
        }
        this.size = size() + p1.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends E> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        if (p0.isEmpty()) {
            return false;
        }
        registerModification();
        ensureCapacity(size() + p0.size());
        copyCollectionElements(positiveMod(this.head + size()), p0);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int p0, Collection<? extends E> p1) {
        Intrinsics.checkNotNullParameter(p1, "");
        AbstractList.INSTANCE.checkPositionIndex$kotlin_stdlib(p0, size());
        if (p1.isEmpty()) {
            return false;
        }
        if (p0 == size()) {
            return addAll(p1);
        }
        registerModification();
        ensureCapacity(size() + p1.size());
        int iPositiveMod = positiveMod(this.head + size());
        int iPositiveMod2 = positiveMod(this.head + p0);
        int size = p1.size();
        if (p0 < ((size() + 1) >> 1)) {
            int i = this.head;
            int length = i - size;
            if (iPositiveMod2 < i) {
                Object[] objArr = this.elementData;
                ArraysKt.copyInto(objArr, objArr, length, i, objArr.length);
                if (size >= iPositiveMod2) {
                    Object[] objArr2 = this.elementData;
                    ArraysKt.copyInto(objArr2, objArr2, objArr2.length - size, 0, iPositiveMod2);
                } else {
                    Object[] objArr3 = this.elementData;
                    ArraysKt.copyInto(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.elementData;
                    ArraysKt.copyInto(objArr4, objArr4, 0, size, iPositiveMod2);
                }
            } else if (length >= 0) {
                Object[] objArr5 = this.elementData;
                ArraysKt.copyInto(objArr5, objArr5, length, i, iPositiveMod2);
            } else {
                Object[] objArr6 = this.elementData;
                length += objArr6.length;
                int length2 = objArr6.length - length;
                if (length2 >= iPositiveMod2 - i) {
                    ArraysKt.copyInto(objArr6, objArr6, length, i, iPositiveMod2);
                } else {
                    ArraysKt.copyInto(objArr6, objArr6, length, i, i + length2);
                    Object[] objArr7 = this.elementData;
                    ArraysKt.copyInto(objArr7, objArr7, 0, this.head + length2, iPositiveMod2);
                }
            }
            this.head = length;
            copyCollectionElements(negativeMod(iPositiveMod2 - size), p1);
        } else {
            int i2 = iPositiveMod2 + size;
            if (iPositiveMod2 < iPositiveMod) {
                int i3 = size + iPositiveMod;
                Object[] objArr8 = this.elementData;
                if (i3 <= objArr8.length) {
                    ArraysKt.copyInto(objArr8, objArr8, i2, iPositiveMod2, iPositiveMod);
                } else if (i2 >= objArr8.length) {
                    ArraysKt.copyInto(objArr8, objArr8, i2 - objArr8.length, iPositiveMod2, iPositiveMod);
                } else {
                    int length3 = iPositiveMod - (i3 - objArr8.length);
                    ArraysKt.copyInto(objArr8, objArr8, 0, length3, iPositiveMod);
                    Object[] objArr9 = this.elementData;
                    ArraysKt.copyInto(objArr9, objArr9, i2, iPositiveMod2, length3);
                }
            } else {
                Object[] objArr10 = this.elementData;
                ArraysKt.copyInto(objArr10, objArr10, size, 0, iPositiveMod);
                Object[] objArr11 = this.elementData;
                if (i2 >= objArr11.length) {
                    ArraysKt.copyInto(objArr11, objArr11, i2 - objArr11.length, iPositiveMod2, objArr11.length);
                } else {
                    ArraysKt.copyInto(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.elementData;
                    ArraysKt.copyInto(objArr12, objArr12, i2, iPositiveMod2, objArr12.length - size);
                }
            }
            copyCollectionElements(iPositiveMod2, p1);
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int p0) {
        AbstractList.INSTANCE.checkElementIndex$kotlin_stdlib(p0, size());
        return (E) this.elementData[positiveMod(this.head + p0)];
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public final E set(int p0, E p1) {
        AbstractList.INSTANCE.checkElementIndex$kotlin_stdlib(p0, size());
        int iPositiveMod = positiveMod(this.head + p0);
        Object[] objArr = this.elementData;
        E e2 = (E) objArr[iPositiveMod];
        objArr[iPositiveMod] = p1;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object p0) {
        return indexOf(p0) != -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object p0) {
        int i;
        int iPositiveMod = positiveMod(this.head + size());
        int length = this.head;
        if (length < iPositiveMod) {
            while (length < iPositiveMod) {
                if (Intrinsics.areEqual(p0, this.elementData[length])) {
                    i = this.head;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iPositiveMod) {
            return -1;
        }
        int length2 = this.elementData.length;
        while (length < length2) {
            if (Intrinsics.areEqual(p0, this.elementData[length])) {
                i = this.head;
            } else {
                length++;
            }
        }
        for (int i2 = 0; i2 < iPositiveMod; i2++) {
            if (Intrinsics.areEqual(p0, this.elementData[i2])) {
                length = i2 + this.elementData.length;
                i = this.head;
            }
        }
        return -1;
        return length - i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object p0) {
        int lastIndex;
        int i;
        int iPositiveMod = positiveMod(this.head + size());
        int i2 = this.head;
        if (i2 < iPositiveMod) {
            lastIndex = iPositiveMod - 1;
            if (i2 <= lastIndex) {
                while (!Intrinsics.areEqual(p0, this.elementData[lastIndex])) {
                    if (lastIndex != i2) {
                        lastIndex--;
                    }
                }
                i = this.head;
                return lastIndex - i;
            }
            return -1;
        }
        if (i2 > iPositiveMod) {
            for (int i3 = iPositiveMod - 1; i3 >= 0; i3--) {
                if (Intrinsics.areEqual(p0, this.elementData[i3])) {
                    lastIndex = i3 + this.elementData.length;
                    i = this.head;
                    return lastIndex - i;
                }
            }
            lastIndex = ArraysKt.getLastIndex(this.elementData);
            int i4 = this.head;
            if (i4 <= lastIndex) {
                while (!Intrinsics.areEqual(p0, this.elementData[lastIndex])) {
                    if (lastIndex != i4) {
                        lastIndex--;
                    }
                }
                i = this.head;
                return lastIndex - i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object p0) {
        int iIndexOf = indexOf(p0);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // kotlin.collections.AbstractMutableList
    public final E removeAt(int p0) {
        AbstractList.INSTANCE.checkElementIndex$kotlin_stdlib(p0, size());
        ArrayDeque<E> arrayDeque = this;
        if (p0 == CollectionsKt.getLastIndex(arrayDeque)) {
            return removeLast();
        }
        if (p0 == 0) {
            return removeFirst();
        }
        registerModification();
        int iPositiveMod = positiveMod(this.head + p0);
        E e2 = (E) this.elementData[iPositiveMod];
        if (p0 < (size() >> 1)) {
            int i = this.head;
            if (iPositiveMod >= i) {
                Object[] objArr = this.elementData;
                ArraysKt.copyInto(objArr, objArr, i + 1, i, iPositiveMod);
            } else {
                Object[] objArr2 = this.elementData;
                ArraysKt.copyInto(objArr2, objArr2, 1, 0, iPositiveMod);
                Object[] objArr3 = this.elementData;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i2 = this.head;
                ArraysKt.copyInto(objArr3, objArr3, i2 + 1, i2, objArr3.length - 1);
            }
            Object[] objArr4 = this.elementData;
            int i3 = this.head;
            objArr4[i3] = null;
            this.head = incremented(i3);
        } else {
            int iPositiveMod2 = positiveMod(this.head + CollectionsKt.getLastIndex(arrayDeque));
            if (iPositiveMod <= iPositiveMod2) {
                Object[] objArr5 = this.elementData;
                ArraysKt.copyInto(objArr5, objArr5, iPositiveMod, iPositiveMod + 1, iPositiveMod2 + 1);
            } else {
                Object[] objArr6 = this.elementData;
                ArraysKt.copyInto(objArr6, objArr6, iPositiveMod, iPositiveMod + 1, objArr6.length);
                Object[] objArr7 = this.elementData;
                objArr7[objArr7.length - 1] = objArr7[0];
                ArraysKt.copyInto(objArr7, objArr7, 0, 1, iPositiveMod2 + 1);
            }
            this.elementData[iPositiveMod2] = null;
        }
        this.size = size() - 1;
        return e2;
    }

    private final boolean filterInPlace(Function1<? super E, Boolean> p0) {
        int iPositiveMod;
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.elementData.length != 0) {
            int iPositiveMod2 = positiveMod(this.head + size());
            int i = this.head;
            if (i < iPositiveMod2) {
                iPositiveMod = i;
                while (i < iPositiveMod2) {
                    Object obj = this.elementData[i];
                    if (p0.invoke(obj).booleanValue()) {
                        this.elementData[iPositiveMod] = obj;
                        iPositiveMod++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                ArraysKt.fill(this.elementData, (Object) null, iPositiveMod, iPositiveMod2);
            } else {
                int length = this.elementData.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr = this.elementData;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (p0.invoke(obj2).booleanValue()) {
                        this.elementData[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                iPositiveMod = positiveMod(i2);
                for (int i3 = 0; i3 < iPositiveMod2; i3++) {
                    Object[] objArr2 = this.elementData;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (p0.invoke(obj3).booleanValue()) {
                        this.elementData[iPositiveMod] = obj3;
                        iPositiveMod = incremented(iPositiveMod);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                registerModification();
                this.size = negativeMod(iPositiveMod - this.head);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            registerModification();
            nullifyNonEmpty(this.head, positiveMod(this.head + size()));
        }
        this.head = 0;
        this.size = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final <T> T[] toArray(T[] p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        if (p0.length < size()) {
            p0 = (T[]) ArraysKt.arrayOfNulls(p0, size());
        }
        int iPositiveMod = positiveMod(this.head + size());
        int i = this.head;
        if (i < iPositiveMod) {
            ArraysKt.copyInto$default(this.elementData, p0, 0, i, iPositiveMod, 2, (Object) null);
        } else if (!isEmpty()) {
            Object[] objArr = this.elementData;
            ArraysKt.copyInto(objArr, p0, 0, this.head, objArr.length);
            Object[] objArr2 = this.elementData;
            ArraysKt.copyInto(objArr2, p0, objArr2.length - this.head, 0, iPositiveMod);
        }
        return (T[]) CollectionsKt.terminateCollectionToArray(size(), p0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[size()]);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int p0, int p1) {
        AbstractList.INSTANCE.checkRangeIndexes$kotlin_stdlib(p0, p1, size());
        int i = p1 - p0;
        if (i == 0) {
            return;
        }
        if (i == size()) {
            clear();
            return;
        }
        if (i == 1) {
            remove(p0);
            return;
        }
        registerModification();
        if (p0 < size() - p1) {
            removeRangeShiftPreceding(p0, p1);
            int iPositiveMod = positiveMod(this.head + i);
            nullifyNonEmpty(this.head, iPositiveMod);
            this.head = iPositiveMod;
        } else {
            removeRangeShiftSucceeding(p0, p1);
            int iPositiveMod2 = positiveMod(this.head + size());
            nullifyNonEmpty(negativeMod(iPositiveMod2 - i), iPositiveMod2);
        }
        this.size = size() - i;
    }

    private final void removeRangeShiftPreceding(int p0, int p1) {
        int iPositiveMod = positiveMod(this.head + (p0 - 1));
        int iPositiveMod2 = positiveMod(this.head + (p1 - 1));
        while (p0 > 0) {
            int i = iPositiveMod + 1;
            int iMin = Math.min(p0, Math.min(i, iPositiveMod2 + 1));
            Object[] objArr = this.elementData;
            int i2 = iPositiveMod2 - iMin;
            int i3 = iPositiveMod - iMin;
            ArraysKt.copyInto(objArr, objArr, i2 + 1, i3 + 1, i);
            iPositiveMod = negativeMod(i3);
            iPositiveMod2 = negativeMod(i2);
            p0 -= iMin;
        }
    }

    private final void removeRangeShiftSucceeding(int p0, int p1) {
        int iPositiveMod = positiveMod(this.head + p1);
        int iPositiveMod2 = positiveMod(this.head + p0);
        int size = size();
        while (true) {
            size -= p1;
            if (size <= 0) {
                return;
            }
            Object[] objArr = this.elementData;
            p1 = Math.min(size, Math.min(objArr.length - iPositiveMod, objArr.length - iPositiveMod2));
            Object[] objArr2 = this.elementData;
            int i = iPositiveMod + p1;
            ArraysKt.copyInto(objArr2, objArr2, iPositiveMod2, iPositiveMod, i);
            iPositiveMod = positiveMod(i);
            iPositiveMod2 = positiveMod(iPositiveMod2 + p1);
        }
    }

    private final void nullifyNonEmpty(int p0, int p1) {
        if (p0 < p1) {
            ArraysKt.fill(this.elementData, (Object) null, p0, p1);
            return;
        }
        Object[] objArr = this.elementData;
        ArraysKt.fill(objArr, (Object) null, p0, objArr.length);
        ArraysKt.fill(this.elementData, (Object) null, 0, p1);
    }

    private final void registerModification() {
        ((java.util.AbstractList) this).modCount++;
    }

    public final <T> T[] testToArray$kotlin_stdlib(T[] p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return (T[]) toArray(p0);
    }

    public final Object[] testToArray$kotlin_stdlib() {
        return toArray();
    }

    public final void testRemoveRange$kotlin_stdlib(int p0, int p1) {
        removeRange(p0, p1);
    }

    public final void internalStructure$kotlin_stdlib(Function2<? super Integer, ? super Object[], Unit> p0) {
        int i;
        Intrinsics.checkNotNullParameter(p0, "");
        p0.invoke(Integer.valueOf((isEmpty() || (i = this.head) < positiveMod(this.head + size())) ? this.head : i - this.elementData.length), toArray());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection<?> p0) {
        int iPositiveMod;
        Intrinsics.checkNotNullParameter(p0, "");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.elementData.length != 0) {
            int iPositiveMod2 = positiveMod(this.head + size());
            int i = this.head;
            if (i < iPositiveMod2) {
                iPositiveMod = i;
                while (i < iPositiveMod2) {
                    Object obj = this.elementData[i];
                    if (p0.contains(obj)) {
                        z = true;
                    } else {
                        this.elementData[iPositiveMod] = obj;
                        iPositiveMod++;
                    }
                    i++;
                }
                ArraysKt.fill(this.elementData, (Object) null, iPositiveMod, iPositiveMod2);
            } else {
                int length = this.elementData.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr = this.elementData;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (p0.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.elementData[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                iPositiveMod = positiveMod(i2);
                for (int i3 = 0; i3 < iPositiveMod2; i3++) {
                    Object[] objArr2 = this.elementData;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (p0.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.elementData[iPositiveMod] = obj3;
                        iPositiveMod = incremented(iPositiveMod);
                    }
                }
                z = z2;
            }
            if (z) {
                registerModification();
                this.size = negativeMod(iPositiveMod - this.head);
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection<?> p0) {
        int iPositiveMod;
        Intrinsics.checkNotNullParameter(p0, "");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.elementData.length != 0) {
            int iPositiveMod2 = positiveMod(this.head + size());
            int i = this.head;
            if (i < iPositiveMod2) {
                iPositiveMod = i;
                while (i < iPositiveMod2) {
                    Object obj = this.elementData[i];
                    if (p0.contains(obj)) {
                        this.elementData[iPositiveMod] = obj;
                        iPositiveMod++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                ArraysKt.fill(this.elementData, (Object) null, iPositiveMod, iPositiveMod2);
            } else {
                int length = this.elementData.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr = this.elementData;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (p0.contains(obj2)) {
                        this.elementData[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                iPositiveMod = positiveMod(i2);
                for (int i3 = 0; i3 < iPositiveMod2; i3++) {
                    Object[] objArr2 = this.elementData;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (p0.contains(obj3)) {
                        this.elementData[iPositiveMod] = obj3;
                        iPositiveMod = incremented(iPositiveMod);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                registerModification();
                this.size = negativeMod(iPositiveMod - this.head);
            }
        }
        return z;
    }
}
