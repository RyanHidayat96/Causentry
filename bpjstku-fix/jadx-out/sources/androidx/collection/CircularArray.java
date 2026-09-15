package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\b\b\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\n\u0010\tJ\r\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\fJ\u0018\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00028\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00028\u0000¢\u0006\u0004\b\u0015\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0016\u0010\u0006J\u0015\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0017\u0010\u0006J\r\u0010\u0018\u001a\u00020\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u001c8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0011\u0010 \u001a\u00028\u00008G¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0014R\u0016\u0010!\u001a\u00020\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001bR\u0011\u0010#\u001a\u00028\u00008G¢\u0006\u0006\u001a\u0004\b\"\u0010\u0014R\u0016\u0010$\u001a\u00020\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b$\u0010\u001b"}, d2 = {"Landroidx/collection/CircularArray;", ExifInterface.LONGITUDE_EAST, "", "", "p0", "<init>", "(I)V", "", "addFirst", "(Ljava/lang/Object;)V", "addLast", "clear", "()V", "doubleCapacity", "get", "(I)Ljava/lang/Object;", "", "isEmpty", "()Z", "popFirst", "()Ljava/lang/Object;", "popLast", "removeFromEnd", "removeFromStart", "size", "()I", "capacityBitmask", "I", "", "elements", "[Ljava/lang/Object;", "getFirst", "first", "head", "getLast", "last", "tail"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CircularArray<E> {
    private int capacityBitmask;
    private E[] elements;
    private int head;
    private int tail;

    public CircularArray(int i) {
        if (i <= 0) {
            RuntimeHelpersKt.throwIllegalArgumentException("capacity must be >= 1");
        }
        if (i > 1073741824) {
            RuntimeHelpersKt.throwIllegalArgumentException("capacity must be <= 2^30");
        }
        i = Integer.bitCount(i) != 1 ? Integer.highestOneBit(i - 1) << 1 : i;
        this.capacityBitmask = i - 1;
        this.elements = (E[]) new Object[i];
    }

    public /* synthetic */ CircularArray(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 8 : i);
    }

    private final void doubleCapacity() {
        E[] eArr = this.elements;
        int length = eArr.length;
        int i = this.head;
        int i2 = length << 1;
        if (i2 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        E[] eArr2 = (E[]) new Object[i2];
        ArraysKt.copyInto(eArr, eArr2, 0, i, length);
        ArraysKt.copyInto(this.elements, eArr2, length - i, 0, this.head);
        this.elements = eArr2;
        this.head = 0;
        this.tail = length;
        this.capacityBitmask = i2 - 1;
    }

    public final void addFirst(E p0) {
        int i = (this.head - 1) & this.capacityBitmask;
        this.head = i;
        this.elements[i] = p0;
        if (i == this.tail) {
            doubleCapacity();
        }
    }

    public final void addLast(E p0) {
        E[] eArr = this.elements;
        int i = this.tail;
        eArr[i] = p0;
        int i2 = this.capacityBitmask & (i + 1);
        this.tail = i2;
        if (i2 == this.head) {
            doubleCapacity();
        }
    }

    public final E popFirst() {
        int i = this.head;
        if (i == this.tail) {
            CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
            throw new ArrayIndexOutOfBoundsException();
        }
        E[] eArr = this.elements;
        E e2 = eArr[i];
        eArr[i] = null;
        this.head = (i + 1) & this.capacityBitmask;
        return e2;
    }

    public final E popLast() {
        int i = this.head;
        int i2 = this.tail;
        if (i == i2) {
            CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
            throw new ArrayIndexOutOfBoundsException();
        }
        int i3 = this.capacityBitmask & (i2 - 1);
        E[] eArr = this.elements;
        E e2 = eArr[i3];
        eArr[i3] = null;
        this.tail = i3;
        return e2;
    }

    public final void clear() {
        removeFromStart(size());
    }

    public final void removeFromStart(int p0) {
        if (p0 > 0) {
            if (p0 > size()) {
                CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
                throw new ArrayIndexOutOfBoundsException();
            }
            int length = this.elements.length;
            int i = this.head;
            if (p0 < length - i) {
                length = i + p0;
            }
            while (i < length) {
                this.elements[i] = null;
                i++;
            }
            int i2 = this.head;
            int i3 = length - i2;
            int i4 = p0 - i3;
            this.head = this.capacityBitmask & (i2 + i3);
            if (i4 > 0) {
                for (int i5 = 0; i5 < i4; i5++) {
                    this.elements[i5] = null;
                }
                this.head = i4;
            }
        }
    }

    public final void removeFromEnd(int p0) {
        if (p0 > 0) {
            if (p0 > size()) {
                CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
                throw new ArrayIndexOutOfBoundsException();
            }
            int i = this.tail;
            int i2 = p0 < i ? i - p0 : 0;
            for (int i3 = i2; i3 < i; i3++) {
                this.elements[i3] = null;
            }
            int i4 = this.tail;
            int i5 = i4 - i2;
            int i6 = p0 - i5;
            this.tail = i4 - i5;
            if (i6 > 0) {
                int length = this.elements.length;
                this.tail = length;
                int i7 = length - i6;
                for (int i8 = i7; i8 < length; i8++) {
                    this.elements[i8] = null;
                }
                this.tail = i7;
            }
        }
    }

    public final E getFirst() {
        int i = this.head;
        if (i == this.tail) {
            CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
            throw new ArrayIndexOutOfBoundsException();
        }
        E e2 = this.elements[i];
        Intrinsics.checkNotNull(e2);
        return e2;
    }

    public final E getLast() {
        int i = this.head;
        int i2 = this.tail;
        if (i == i2) {
            CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
            throw new ArrayIndexOutOfBoundsException();
        }
        E e2 = this.elements[(i2 - 1) & this.capacityBitmask];
        Intrinsics.checkNotNull(e2);
        return e2;
    }

    public final E get(int p0) {
        if (p0 < 0 || p0 >= size()) {
            CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
            throw new ArrayIndexOutOfBoundsException();
        }
        E e2 = this.elements[this.capacityBitmask & (this.head + p0)];
        Intrinsics.checkNotNull(e2);
        return e2;
    }

    public final int size() {
        return (this.tail - this.head) & this.capacityBitmask;
    }

    public final boolean isEmpty() {
        return this.head == this.tail;
    }

    public CircularArray() {
        this(0, 1, null);
    }
}
