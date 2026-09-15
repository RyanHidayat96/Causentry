package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u001a\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\b\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\fJ\u0018\u0010\r\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0001H\u0086\b¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\r\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u000fH\u0086\b¢\u0006\u0004\b\r\u0010\u0010J\u001d\u0010\r\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0001¢\u0006\u0004\b\r\u0010\u0011J\u001d\u0010\r\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000f¢\u0006\u0004\b\r\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0005J\u0018\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0001H\u0086\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0006H\u0086\n¢\u0006\u0004\b\u0016\u0010\u0018J\u0018\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000fH\u0086\u0002¢\u0006\u0004\b\u0016\u0010\u0019J\u0018\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0001H\u0086\n¢\u0006\u0004\b\u001a\u0010\u0017J\u0018\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0006H\u0086\n¢\u0006\u0004\b\u001a\u0010\u0018J\u0018\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000fH\u0086\n¢\u0006\u0004\b\u001a\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\tJ\u0015\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u001c\u0010\u000eJ\u0015\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u000f¢\u0006\u0004\b\u001c\u0010\u0010J\u0015\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010!\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b!\u0010\u000eJ\u0015\u0010!\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u000f¢\u0006\u0004\b!\u0010\u0010J \u0010\"\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\u000b¢\u0006\u0004\b$\u0010\u0014J\r\u0010%\u001a\u00020\u000b¢\u0006\u0004\b%\u0010\u0014J\u0017\u0010&\u001a\u00020\u000b2\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b&\u0010\u0005R\u0012\u0010)\u001a\u00020\u00028Ç\u0002¢\u0006\u0006\u001a\u0004\b'\u0010("}, d2 = {"Landroidx/collection/MutableFloatList;", "Landroidx/collection/FloatList;", "", "p0", "<init>", "(I)V", "", "", "add", "(F)Z", "p1", "", "(IF)V", "addAll", "(Landroidx/collection/FloatList;)Z", "", "([F)Z", "(ILandroidx/collection/FloatList;)Z", "(I[F)Z", "clear", "()V", "ensureCapacity", "minusAssign", "(Landroidx/collection/FloatList;)V", "(F)V", "([F)V", "plusAssign", "remove", "removeAll", "removeAt", "(I)F", "removeRange", "(II)V", "retainAll", "set", "(IF)F", "sort", "sortDescending", "trim", "getCapacity", "()I", "capacity"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MutableFloatList extends FloatList {
    public MutableFloatList(int i) {
        super(i, null);
    }

    public /* synthetic */ MutableFloatList(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 16 : i);
    }

    public final int getCapacity() {
        return this.content.length;
    }

    public final boolean add(float p0) {
        ensureCapacity(this._size + 1);
        this.content[this._size] = p0;
        this._size++;
        return true;
    }

    public final void add(int p0, float p1) {
        if (p0 < 0 || p0 > this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        ensureCapacity(this._size + 1);
        float[] fArr = this.content;
        if (p0 != this._size) {
            ArraysKt.copyInto(fArr, fArr, p0 + 1, p0, this._size);
        }
        fArr[p0] = p1;
        this._size++;
    }

    public final boolean addAll(int p0, float[] p1) {
        Intrinsics.checkNotNullParameter(p1, "");
        if (p0 < 0 || p0 > this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("");
        }
        if (p1.length == 0) {
            return false;
        }
        ensureCapacity(this._size + p1.length);
        float[] fArr = this.content;
        if (p0 != this._size) {
            ArraysKt.copyInto(fArr, fArr, p1.length + p0, p0, this._size);
        }
        ArraysKt.copyInto$default(p1, fArr, p0, 0, 0, 12, (Object) null);
        this._size += p1.length;
        return true;
    }

    public final boolean addAll(int p0, FloatList p1) {
        Intrinsics.checkNotNullParameter(p1, "");
        if (p0 < 0 || p0 > this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("");
        }
        if (p1._size == 0) {
            return false;
        }
        ensureCapacity(this._size + p1._size);
        float[] fArr = this.content;
        if (p0 != this._size) {
            ArraysKt.copyInto(fArr, fArr, p1._size + p0, p0, this._size);
        }
        ArraysKt.copyInto(p1.content, fArr, p0, 0, p1._size);
        this._size += p1._size;
        return true;
    }

    public final boolean addAll(FloatList p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return addAll(this._size, p0);
    }

    public final boolean addAll(float[] p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return addAll(this._size, p0);
    }

    public final void plusAssign(FloatList p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        addAll(this._size, p0);
    }

    public final void plusAssign(float[] p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        addAll(this._size, p0);
    }

    public final void clear() {
        this._size = 0;
    }

    public static /* synthetic */ void trim$default(MutableFloatList mutableFloatList, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = mutableFloatList._size;
        }
        mutableFloatList.trim(i);
    }

    public final void trim(int p0) {
        int iMax = Math.max(p0, this._size);
        if (this.content.length > iMax) {
            float[] fArrCopyOf = Arrays.copyOf(this.content, iMax);
            Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "");
            this.content = fArrCopyOf;
        }
    }

    public final void ensureCapacity(int p0) {
        float[] fArr = this.content;
        if (fArr.length < p0) {
            float[] fArrCopyOf = Arrays.copyOf(fArr, Math.max(p0, (fArr.length * 3) / 2));
            Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "");
            this.content = fArrCopyOf;
        }
    }

    public final void plusAssign(float p0) {
        add(p0);
    }

    public final void minusAssign(float p0) {
        remove(p0);
    }

    public final boolean remove(float p0) {
        int iIndexOf = indexOf(p0);
        if (iIndexOf < 0) {
            return false;
        }
        removeAt(iIndexOf);
        return true;
    }

    public final boolean removeAll(float[] p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        int i = this._size;
        for (float f : p0) {
            remove(f);
        }
        return i != this._size;
    }

    public final boolean removeAll(FloatList p0) {
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

    public final float removeAt(int p0) {
        if (p0 < 0 || p0 >= this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        float[] fArr = this.content;
        float f = fArr[p0];
        if (p0 != this._size - 1) {
            ArraysKt.copyInto(fArr, fArr, p0, p0 + 1, this._size);
        }
        this._size--;
        return f;
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

    public final boolean retainAll(float[] p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        int i = this._size;
        float[] fArr = this.content;
        int i2 = this._size - 1;
        while (true) {
            int i3 = 0;
            if (i2 < 0) {
                break;
            }
            float f = fArr[i2];
            int length = p0.length;
            while (true) {
                if (i3 < length) {
                    if (p0[i3] != f) {
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

    public final boolean retainAll(FloatList p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        int i = this._size;
        float[] fArr = this.content;
        for (int i2 = this._size - 1; i2 >= 0; i2--) {
            if (!p0.contains(fArr[i2])) {
                removeAt(i2);
            }
        }
        return i != this._size;
    }

    public final float set(int p0, float p1) {
        if (p0 < 0 || p0 >= this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        float[] fArr = this.content;
        float f = fArr[p0];
        fArr[p0] = p1;
        return f;
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

    public final void minusAssign(float[] p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        for (float f : p0) {
            remove(f);
        }
    }

    public final void minusAssign(FloatList p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        float[] fArr = p0.content;
        int i = p0._size;
        for (int i2 = 0; i2 < i; i2++) {
            remove(fArr[i2]);
        }
    }

    public MutableFloatList() {
        this(0, 1, null);
    }
}
