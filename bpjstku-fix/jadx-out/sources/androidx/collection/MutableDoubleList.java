package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0013\n\u0002\b\u001a\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\b\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\fJ\u0018\u0010\r\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0001H\u0086\b¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\r\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u000fH\u0086\b¢\u0006\u0004\b\r\u0010\u0010J\u001d\u0010\r\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0001¢\u0006\u0004\b\r\u0010\u0011J\u001d\u0010\r\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000f¢\u0006\u0004\b\r\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0005J\u0018\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0001H\u0086\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0006H\u0086\n¢\u0006\u0004\b\u0016\u0010\u0018J\u0018\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000fH\u0086\u0002¢\u0006\u0004\b\u0016\u0010\u0019J\u0018\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0001H\u0086\n¢\u0006\u0004\b\u001a\u0010\u0017J\u0018\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0006H\u0086\n¢\u0006\u0004\b\u001a\u0010\u0018J\u0018\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000fH\u0086\n¢\u0006\u0004\b\u001a\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\tJ\u0015\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u001c\u0010\u000eJ\u0015\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u000f¢\u0006\u0004\b\u001c\u0010\u0010J\u0015\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010!\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b!\u0010\u000eJ\u0015\u0010!\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u000f¢\u0006\u0004\b!\u0010\u0010J \u0010\"\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\u000b¢\u0006\u0004\b$\u0010\u0014J\r\u0010%\u001a\u00020\u000b¢\u0006\u0004\b%\u0010\u0014J\u0017\u0010&\u001a\u00020\u000b2\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b&\u0010\u0005R\u0012\u0010)\u001a\u00020\u00028Ç\u0002¢\u0006\u0006\u001a\u0004\b'\u0010("}, d2 = {"Landroidx/collection/MutableDoubleList;", "Landroidx/collection/DoubleList;", "", "p0", "<init>", "(I)V", "", "", "add", "(D)Z", "p1", "", "(ID)V", "addAll", "(Landroidx/collection/DoubleList;)Z", "", "([D)Z", "(ILandroidx/collection/DoubleList;)Z", "(I[D)Z", "clear", "()V", "ensureCapacity", "minusAssign", "(Landroidx/collection/DoubleList;)V", "(D)V", "([D)V", "plusAssign", "remove", "removeAll", "removeAt", "(I)D", "removeRange", "(II)V", "retainAll", "set", "(ID)D", "sort", "sortDescending", "trim", "getCapacity", "()I", "capacity"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MutableDoubleList extends DoubleList {
    public MutableDoubleList(int i) {
        super(i, null);
    }

    public /* synthetic */ MutableDoubleList(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 16 : i);
    }

    public final int getCapacity() {
        return this.content.length;
    }

    public final boolean add(double p0) {
        ensureCapacity(this._size + 1);
        this.content[this._size] = p0;
        this._size++;
        return true;
    }

    public final void add(int p0, double p1) {
        if (p0 < 0 || p0 > this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        ensureCapacity(this._size + 1);
        double[] dArr = this.content;
        if (p0 != this._size) {
            ArraysKt.copyInto(dArr, dArr, p0 + 1, p0, this._size);
        }
        dArr[p0] = p1;
        this._size++;
    }

    public final boolean addAll(int p0, double[] p1) {
        Intrinsics.checkNotNullParameter(p1, "");
        if (p0 < 0 || p0 > this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("");
        }
        if (p1.length == 0) {
            return false;
        }
        ensureCapacity(this._size + p1.length);
        double[] dArr = this.content;
        if (p0 != this._size) {
            ArraysKt.copyInto(dArr, dArr, p1.length + p0, p0, this._size);
        }
        ArraysKt.copyInto$default(p1, dArr, p0, 0, 0, 12, (Object) null);
        this._size += p1.length;
        return true;
    }

    public final boolean addAll(int p0, DoubleList p1) {
        Intrinsics.checkNotNullParameter(p1, "");
        if (p0 < 0 || p0 > this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("");
        }
        if (p1._size == 0) {
            return false;
        }
        ensureCapacity(this._size + p1._size);
        double[] dArr = this.content;
        if (p0 != this._size) {
            ArraysKt.copyInto(dArr, dArr, p1._size + p0, p0, this._size);
        }
        ArraysKt.copyInto(p1.content, dArr, p0, 0, p1._size);
        this._size += p1._size;
        return true;
    }

    public final boolean addAll(DoubleList p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return addAll(this._size, p0);
    }

    public final boolean addAll(double[] p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return addAll(this._size, p0);
    }

    public final void plusAssign(DoubleList p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        addAll(this._size, p0);
    }

    public final void plusAssign(double[] p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        addAll(this._size, p0);
    }

    public final void clear() {
        this._size = 0;
    }

    public static /* synthetic */ void trim$default(MutableDoubleList mutableDoubleList, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = mutableDoubleList._size;
        }
        mutableDoubleList.trim(i);
    }

    public final void trim(int p0) {
        int iMax = Math.max(p0, this._size);
        if (this.content.length > iMax) {
            double[] dArrCopyOf = Arrays.copyOf(this.content, iMax);
            Intrinsics.checkNotNullExpressionValue(dArrCopyOf, "");
            this.content = dArrCopyOf;
        }
    }

    public final void ensureCapacity(int p0) {
        double[] dArr = this.content;
        if (dArr.length < p0) {
            double[] dArrCopyOf = Arrays.copyOf(dArr, Math.max(p0, (dArr.length * 3) / 2));
            Intrinsics.checkNotNullExpressionValue(dArrCopyOf, "");
            this.content = dArrCopyOf;
        }
    }

    public final void plusAssign(double p0) {
        add(p0);
    }

    public final void minusAssign(double p0) {
        remove(p0);
    }

    public final boolean remove(double p0) {
        int iIndexOf = indexOf(p0);
        if (iIndexOf < 0) {
            return false;
        }
        removeAt(iIndexOf);
        return true;
    }

    public final boolean removeAll(double[] p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        int i = this._size;
        for (double d : p0) {
            remove(d);
        }
        return i != this._size;
    }

    public final boolean removeAll(DoubleList p0) {
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

    public final double removeAt(int p0) {
        if (p0 < 0 || p0 >= this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        double[] dArr = this.content;
        double d = dArr[p0];
        if (p0 != this._size - 1) {
            ArraysKt.copyInto(dArr, dArr, p0, p0 + 1, this._size);
        }
        this._size--;
        return d;
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

    public final boolean retainAll(double[] p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        int i = this._size;
        double[] dArr = this.content;
        int i2 = this._size - 1;
        while (true) {
            int i3 = 0;
            if (i2 < 0) {
                break;
            }
            double d = dArr[i2];
            int length = p0.length;
            while (true) {
                if (i3 < length) {
                    if (p0[i3] != d) {
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

    public final boolean retainAll(DoubleList p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        int i = this._size;
        double[] dArr = this.content;
        for (int i2 = this._size - 1; i2 >= 0; i2--) {
            if (!p0.contains(dArr[i2])) {
                removeAt(i2);
            }
        }
        return i != this._size;
    }

    public final double set(int p0, double p1) {
        if (p0 < 0 || p0 >= this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        double[] dArr = this.content;
        double d = dArr[p0];
        dArr[p0] = p1;
        return d;
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

    public final void minusAssign(double[] p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        for (double d : p0) {
            remove(d);
        }
    }

    public final void minusAssign(DoubleList p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        double[] dArr = p0.content;
        int i = p0._size;
        for (int i2 = 0; i2 < i; i2++) {
            remove(dArr[i2]);
        }
    }

    public MutableDoubleList() {
        this(0, 1, null);
    }
}
