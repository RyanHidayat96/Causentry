package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0017\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u0007\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u000bJ\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0001H\u0086\b¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0001¢\u0006\u0004\b\f\u0010\u000eJ\u001d\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u000f¢\u0006\u0004\b\f\u0010\u0010J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u000fH\u0086\b¢\u0006\u0004\b\f\u0010\u0011J\r\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0005J\u0018\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0001H\u0086\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\n¢\u0006\u0004\b\u0015\u0010\u0005J\u0018\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u000fH\u0086\u0002¢\u0006\u0004\b\u0015\u0010\u0017J\u0018\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0001H\u0086\n¢\u0006\u0004\b\u0018\u0010\u0016J\u0018\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\n¢\u0006\u0004\b\u0018\u0010\u0005J\u0018\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u000fH\u0086\n¢\u0006\u0004\b\u0018\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\bJ\u0015\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u001a\u0010\rJ\u0015\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u000f¢\u0006\u0004\b\u001a\u0010\u0011J\u0015\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u000bJ\u0015\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u001e\u0010\rJ\u0015\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u000f¢\u0006\u0004\b\u001e\u0010\u0011J \u0010\u001f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\n¢\u0006\u0004\b!\u0010\u0013J\r\u0010\"\u001a\u00020\n¢\u0006\u0004\b\"\u0010\u0013J\u0017\u0010#\u001a\u00020\n2\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b#\u0010\u0005R\u0012\u0010&\u001a\u00020\u00028Ç\u0002¢\u0006\u0006\u001a\u0004\b$\u0010%"}, d2 = {"Landroidx/collection/MutableIntList;", "Landroidx/collection/IntList;", "", "p0", "<init>", "(I)V", "", "add", "(I)Z", "p1", "", "(II)V", "addAll", "(Landroidx/collection/IntList;)Z", "(ILandroidx/collection/IntList;)Z", "", "(I[I)Z", "([I)Z", "clear", "()V", "ensureCapacity", "minusAssign", "(Landroidx/collection/IntList;)V", "([I)V", "plusAssign", "remove", "removeAll", "removeAt", "(I)I", "removeRange", "retainAll", "set", "(II)I", "sort", "sortDescending", "trim", "getCapacity", "()I", "capacity"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MutableIntList extends IntList {
    public MutableIntList(int i) {
        super(i, null);
    }

    public /* synthetic */ MutableIntList(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 16 : i);
    }

    public final int getCapacity() {
        return this.content.length;
    }

    public final boolean add(int p0) {
        ensureCapacity(this._size + 1);
        this.content[this._size] = p0;
        this._size++;
        return true;
    }

    public final void add(int p0, int p1) {
        if (p0 < 0 || p0 > this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        ensureCapacity(this._size + 1);
        int[] iArr = this.content;
        if (p0 != this._size) {
            ArraysKt.copyInto(iArr, iArr, p0 + 1, p0, this._size);
        }
        iArr[p0] = p1;
        this._size++;
    }

    public final boolean addAll(int p0, int[] p1) {
        Intrinsics.checkNotNullParameter(p1, "");
        if (p0 < 0 || p0 > this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("");
        }
        if (p1.length == 0) {
            return false;
        }
        ensureCapacity(this._size + p1.length);
        int[] iArr = this.content;
        if (p0 != this._size) {
            ArraysKt.copyInto(iArr, iArr, p1.length + p0, p0, this._size);
        }
        ArraysKt.copyInto$default(p1, iArr, p0, 0, 0, 12, (Object) null);
        this._size += p1.length;
        return true;
    }

    public final boolean addAll(int p0, IntList p1) {
        Intrinsics.checkNotNullParameter(p1, "");
        if (p0 < 0 || p0 > this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("");
        }
        if (p1._size == 0) {
            return false;
        }
        ensureCapacity(this._size + p1._size);
        int[] iArr = this.content;
        if (p0 != this._size) {
            ArraysKt.copyInto(iArr, iArr, p1._size + p0, p0, this._size);
        }
        ArraysKt.copyInto(p1.content, iArr, p0, 0, p1._size);
        this._size += p1._size;
        return true;
    }

    public final boolean addAll(IntList p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return addAll(this._size, p0);
    }

    public final boolean addAll(int[] p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return addAll(this._size, p0);
    }

    public final void plusAssign(IntList p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        addAll(this._size, p0);
    }

    public final void plusAssign(int[] p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        addAll(this._size, p0);
    }

    public final void clear() {
        this._size = 0;
    }

    public static /* synthetic */ void trim$default(MutableIntList mutableIntList, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = mutableIntList._size;
        }
        mutableIntList.trim(i);
    }

    public final void trim(int p0) {
        int iMax = Math.max(p0, this._size);
        if (this.content.length > iMax) {
            int[] iArrCopyOf = Arrays.copyOf(this.content, iMax);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "");
            this.content = iArrCopyOf;
        }
    }

    public final void ensureCapacity(int p0) {
        int[] iArr = this.content;
        if (iArr.length < p0) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, Math.max(p0, (iArr.length * 3) / 2));
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "");
            this.content = iArrCopyOf;
        }
    }

    public final void plusAssign(int p0) {
        add(p0);
    }

    public final void minusAssign(int p0) {
        remove(p0);
    }

    public final boolean remove(int p0) {
        int iIndexOf = indexOf(p0);
        if (iIndexOf < 0) {
            return false;
        }
        removeAt(iIndexOf);
        return true;
    }

    public final boolean removeAll(int[] p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        int i = this._size;
        for (int i2 : p0) {
            remove(i2);
        }
        return i != this._size;
    }

    public final boolean removeAll(IntList p0) {
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

    public final int removeAt(int p0) {
        if (p0 < 0 || p0 >= this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        int[] iArr = this.content;
        int i = iArr[p0];
        if (p0 != this._size - 1) {
            ArraysKt.copyInto(iArr, iArr, p0, p0 + 1, this._size);
        }
        this._size--;
        return i;
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

    public final boolean retainAll(int[] p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        int i = this._size;
        int[] iArr = this.content;
        int i2 = this._size - 1;
        while (true) {
            int i3 = 0;
            if (i2 < 0) {
                break;
            }
            int i4 = iArr[i2];
            int length = p0.length;
            while (true) {
                if (i3 < length) {
                    if (p0[i3] != i4) {
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

    public final boolean retainAll(IntList p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        int i = this._size;
        int[] iArr = this.content;
        for (int i2 = this._size - 1; i2 >= 0; i2--) {
            if (!p0.contains(iArr[i2])) {
                removeAt(i2);
            }
        }
        return i != this._size;
    }

    public final int set(int p0, int p1) {
        if (p0 < 0 || p0 >= this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        int[] iArr = this.content;
        int i = iArr[p0];
        iArr[p0] = p1;
        return i;
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

    public final void minusAssign(int[] p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        for (int i : p0) {
            remove(i);
        }
    }

    public final void minusAssign(IntList p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        int[] iArr = p0.content;
        int i = p0._size;
        for (int i2 = 0; i2 < i; i2++) {
            remove(iArr[i2]);
        }
    }

    public MutableIntList() {
        this(0, 1, null);
    }
}
