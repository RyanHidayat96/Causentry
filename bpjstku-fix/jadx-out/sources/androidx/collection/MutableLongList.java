package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0002\b\u0019\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\t\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\fJ\u0018\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0001H\u0086\b¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0001¢\u0006\u0004\b\r\u0010\u000fJ\u001d\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0010¢\u0006\u0004\b\r\u0010\u0011J\u0018\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0010H\u0086\b¢\u0006\u0004\b\r\u0010\u0012J\r\u0010\u0013\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0005J\u0018\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0001H\u0086\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0006H\u0086\n¢\u0006\u0004\b\u0016\u0010\u0018J\u0018\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0010H\u0086\u0002¢\u0006\u0004\b\u0016\u0010\u0019J\u0018\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0001H\u0086\n¢\u0006\u0004\b\u001a\u0010\u0017J\u0018\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0006H\u0086\n¢\u0006\u0004\b\u001a\u0010\u0018J\u0018\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0010H\u0086\n¢\u0006\u0004\b\u001a\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\fJ\u0015\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u001c\u0010\u000eJ\u0015\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0010¢\u0006\u0004\b\u001c\u0010\u0012J\u0015\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010!\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b!\u0010\u000eJ\u0015\u0010!\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0010¢\u0006\u0004\b!\u0010\u0012J \u0010\"\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\b¢\u0006\u0004\b$\u0010\u0014J\r\u0010%\u001a\u00020\b¢\u0006\u0004\b%\u0010\u0014J\u0017\u0010&\u001a\u00020\b2\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b&\u0010\u0005R\u0012\u0010)\u001a\u00020\u00028Ç\u0002¢\u0006\u0006\u001a\u0004\b'\u0010("}, d2 = {"Landroidx/collection/MutableLongList;", "Landroidx/collection/LongList;", "", "p0", "<init>", "(I)V", "", "p1", "", "add", "(IJ)V", "", "(J)Z", "addAll", "(Landroidx/collection/LongList;)Z", "(ILandroidx/collection/LongList;)Z", "", "(I[J)Z", "([J)Z", "clear", "()V", "ensureCapacity", "minusAssign", "(Landroidx/collection/LongList;)V", "(J)V", "([J)V", "plusAssign", "remove", "removeAll", "removeAt", "(I)J", "removeRange", "(II)V", "retainAll", "set", "(IJ)J", "sort", "sortDescending", "trim", "getCapacity", "()I", "capacity"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MutableLongList extends LongList {
    public MutableLongList(int i) {
        super(i, null);
    }

    public /* synthetic */ MutableLongList(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 16 : i);
    }

    public final int getCapacity() {
        return this.content.length;
    }

    public final boolean add(long p0) {
        ensureCapacity(this._size + 1);
        this.content[this._size] = p0;
        this._size++;
        return true;
    }

    public final void add(int p0, long p1) {
        if (p0 < 0 || p0 > this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        ensureCapacity(this._size + 1);
        long[] jArr = this.content;
        if (p0 != this._size) {
            ArraysKt.copyInto(jArr, jArr, p0 + 1, p0, this._size);
        }
        jArr[p0] = p1;
        this._size++;
    }

    public final boolean addAll(int p0, long[] p1) {
        Intrinsics.checkNotNullParameter(p1, "");
        if (p0 < 0 || p0 > this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("");
        }
        if (p1.length == 0) {
            return false;
        }
        ensureCapacity(this._size + p1.length);
        long[] jArr = this.content;
        if (p0 != this._size) {
            ArraysKt.copyInto(jArr, jArr, p1.length + p0, p0, this._size);
        }
        ArraysKt.copyInto$default(p1, jArr, p0, 0, 0, 12, (Object) null);
        this._size += p1.length;
        return true;
    }

    public final boolean addAll(int p0, LongList p1) {
        Intrinsics.checkNotNullParameter(p1, "");
        if (p0 < 0 || p0 > this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("");
        }
        if (p1._size == 0) {
            return false;
        }
        ensureCapacity(this._size + p1._size);
        long[] jArr = this.content;
        if (p0 != this._size) {
            ArraysKt.copyInto(jArr, jArr, p1._size + p0, p0, this._size);
        }
        ArraysKt.copyInto(p1.content, jArr, p0, 0, p1._size);
        this._size += p1._size;
        return true;
    }

    public final boolean addAll(LongList p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return addAll(this._size, p0);
    }

    public final boolean addAll(long[] p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return addAll(this._size, p0);
    }

    public final void plusAssign(LongList p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        addAll(this._size, p0);
    }

    public final void plusAssign(long[] p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        addAll(this._size, p0);
    }

    public final void clear() {
        this._size = 0;
    }

    public static /* synthetic */ void trim$default(MutableLongList mutableLongList, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = mutableLongList._size;
        }
        mutableLongList.trim(i);
    }

    public final void trim(int p0) {
        int iMax = Math.max(p0, this._size);
        if (this.content.length > iMax) {
            long[] jArrCopyOf = Arrays.copyOf(this.content, iMax);
            Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "");
            this.content = jArrCopyOf;
        }
    }

    public final void ensureCapacity(int p0) {
        long[] jArr = this.content;
        if (jArr.length < p0) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, Math.max(p0, (jArr.length * 3) / 2));
            Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "");
            this.content = jArrCopyOf;
        }
    }

    public final void plusAssign(long p0) {
        add(p0);
    }

    public final void minusAssign(long p0) {
        remove(p0);
    }

    public final boolean remove(long p0) {
        int iIndexOf = indexOf(p0);
        if (iIndexOf < 0) {
            return false;
        }
        removeAt(iIndexOf);
        return true;
    }

    public final boolean removeAll(long[] p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        int i = this._size;
        for (long j : p0) {
            remove(j);
        }
        return i != this._size;
    }

    public final boolean removeAll(LongList p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        int i = this._size;
        int i2 = p0._size - 1;
        if (i2 >= 0) {
            int i3 = 0;
            while (true) {
                remove(p0.get(i3));
                if (i3 == i2) {
                    break;
                }
                i3++;
            }
        }
        return i != this._size;
    }

    public final long removeAt(int p0) {
        if (p0 < 0 || p0 >= this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        long[] jArr = this.content;
        long j = jArr[p0];
        if (p0 != this._size - 1) {
            ArraysKt.copyInto(jArr, jArr, p0, p0 + 1, this._size);
        }
        this._size--;
        return j;
    }

    public final void removeRange(int p0, int p1) {
        if (p0 < 0 || p0 > this._size || p1 < 0 || p1 > this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        if (p1 < p0) {
            RuntimeHelpersKt.throwIllegalArgumentException("The end index must be < start index");
        }
        if (p1 != p0) {
            if (p1 < this._size) {
                ArraysKt.copyInto(this.content, this.content, p0, p1, this._size);
            }
            this._size -= p1 - p0;
        }
    }

    public final boolean retainAll(long[] p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        int i = this._size;
        long[] jArr = this.content;
        int i2 = this._size - 1;
        while (true) {
            int i3 = 0;
            if (i2 < 0) {
                break;
            }
            long j = jArr[i2];
            int length = p0.length;
            while (true) {
                if (i3 < length) {
                    if (p0[i3] != j) {
                        i3++;
                    } else if (i3 >= 0) {
                        break;
                    }
                }
                removeAt(i2);
                break;
            }
            i2--;
        }
        return i != this._size;
    }

    public final boolean retainAll(LongList p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        int i = this._size;
        long[] jArr = this.content;
        for (int i2 = this._size - 1; i2 >= 0; i2--) {
            if (!p0.contains(jArr[i2])) {
                removeAt(i2);
            }
        }
        return i != this._size;
    }

    public final long set(int p0, long p1) {
        if (p0 < 0 || p0 >= this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        long[] jArr = this.content;
        long j = jArr[p0];
        jArr[p0] = p1;
        return j;
    }

    public final void sort() {
        if (this._size == 0) {
            return;
        }
        ArraysKt.sort(this.content, 0, this._size);
    }

    public final void sortDescending() {
        if (this._size == 0) {
            return;
        }
        ArraysKt.sortDescending(this.content, 0, this._size);
    }

    public final void minusAssign(long[] p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        for (long j : p0) {
            remove(j);
        }
    }

    public final void minusAssign(LongList p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        long[] jArr = p0.content;
        int i = p0._size;
        for (int i2 = 0; i2 < i; i2++) {
            remove(jArr[i2]);
        }
    }

    public MutableLongList() {
        this(0, 1, null);
    }
}
