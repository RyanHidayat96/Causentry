package kotlin.collections;

import androidx.exifinterface.media.ExifInterface;
import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\r\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B\u001f\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\n\u0010\fJ\u0018\u0010\r\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0097\u0002¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\"\u0004\b\u0001\u0010\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005H\u0015¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005H\u0015¢\u0006\u0004\b\u0015\u0010\u0017J\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\u001d\u0010\fJ\u001c\u0010\u001e\u001a\u00020\b*\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH\u0082\b¢\u0006\u0004\b\u001e\u0010\u001fR\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010$\u001a\u00020\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b$\u0010#R$\u0010%\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8\u0017@RX\u0097\u000e¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b&\u0010'"}, d2 = {"Lkotlin/collections/RingBuffer;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/collections/AbstractList;", "Ljava/util/RandomAccess;", "Lkotlin/collections/TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "", "p0", "", "p1", "<init>", "([Ljava/lang/Object;I)V", "(I)V", "get", "(I)Ljava/lang/Object;", "", "isFull", "()Z", "", "iterator", "()Ljava/util/Iterator;", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", "()[Ljava/lang/Object;", "expanded", "(I)Lkotlin/collections/RingBuffer;", "", "add", "(Ljava/lang/Object;)V", "removeFirst", "forward", "(II)I", "buffer", "[Ljava/lang/Object;", "capacity", "I", "startIndex", "size", "getSize", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class RingBuffer<T> extends AbstractList<T> implements RandomAccess {
    private final Object[] buffer;
    private final int capacity;
    private int size;
    private int startIndex;

    public RingBuffer(Object[] objArr, int i) {
        Intrinsics.checkNotNullParameter(objArr, "");
        this.buffer = objArr;
        if (i < 0) {
            throw new IllegalArgumentException("ring buffer filled size should not be negative but it is ".concat(String.valueOf(i)).toString());
        }
        if (i > objArr.length) {
            StringBuilder sb = new StringBuilder("ring buffer filled size: ");
            sb.append(i);
            sb.append(" cannot be larger than the buffer size: ");
            sb.append(objArr.length);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        this.capacity = objArr.length;
        this.size = i;
    }

    public RingBuffer(int i) {
        this(new Object[i], 0);
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public final int getSize() {
        return this.size;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final T get(int p0) {
        AbstractList.INSTANCE.checkElementIndex$kotlin_stdlib(p0, size());
        return (T) this.buffer[(this.startIndex + p0) % this.capacity];
    }

    public final boolean isFull() {
        return size() == this.capacity;
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<T> iterator() {
        return new AbstractIterator<T>(this) { // from class: kotlin.collections.RingBuffer.iterator.1
            private int count;
            private int index;
            final /* synthetic */ RingBuffer<T> this$0;

            {
                this.this$0 = this;
                this.count = this.size();
                this.index = ((RingBuffer) this).startIndex;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.collections.AbstractIterator
            protected final void computeNext() {
                if (this.count != 0) {
                    setNext(((RingBuffer) this.this$0).buffer[this.index]);
                    this.index = (this.index + 1) % ((RingBuffer) this.this$0).capacity;
                    this.count--;
                    return;
                }
                done();
            }
        };
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        int length = p0.length;
        Object[] objArr = p0;
        if (length < size()) {
            Object[] objArr2 = (T[]) Arrays.copyOf(p0, size());
            Intrinsics.checkNotNullExpressionValue(objArr2, "");
            objArr = objArr2;
        }
        int size = size();
        int i = 0;
        int i2 = 0;
        for (int i3 = this.startIndex; i2 < size && i3 < this.capacity; i3++) {
            objArr[i2] = this.buffer[i3];
            i2++;
        }
        while (i2 < size) {
            objArr[i2] = this.buffer[i];
            i2++;
            i++;
        }
        return (T[]) CollectionsKt.terminateCollectionToArray(size, objArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(new Object[size()]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final RingBuffer<T> expanded(int p0) {
        Object[] array;
        int i = this.capacity;
        int iCoerceAtMost = RangesKt.coerceAtMost(i + (i >> 1) + 1, p0);
        if (this.startIndex == 0) {
            array = Arrays.copyOf(this.buffer, iCoerceAtMost);
            Intrinsics.checkNotNullExpressionValue(array, "");
        } else {
            array = toArray(new Object[iCoerceAtMost]);
        }
        return new RingBuffer<>(array, size());
    }

    @Override // java.util.Collection, java.util.List
    public final void add(T p0) {
        if (isFull()) {
            throw new IllegalStateException("ring buffer is full");
        }
        this.buffer[(this.startIndex + size()) % this.capacity] = p0;
        this.size = size() + 1;
    }

    public final void removeFirst(int p0) {
        if (p0 < 0) {
            throw new IllegalArgumentException("n shouldn't be negative but it is ".concat(String.valueOf(p0)).toString());
        }
        if (p0 > size()) {
            StringBuilder sb = new StringBuilder("n shouldn't be greater than the buffer size: n = ");
            sb.append(p0);
            sb.append(", size = ");
            sb.append(size());
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (p0 > 0) {
            int i = this.startIndex;
            int i2 = (i + p0) % this.capacity;
            if (i > i2) {
                ArraysKt.fill(this.buffer, (Object) null, i, this.capacity);
                ArraysKt.fill(this.buffer, (Object) null, 0, i2);
            } else {
                ArraysKt.fill(this.buffer, (Object) null, i, i2);
            }
            this.startIndex = i2;
            this.size = size() - p0;
        }
    }

    private final int forward(int i, int i2) {
        return (i + i2) % this.capacity;
    }
}
