package androidx.compose.ui.input.pointer.util;

import androidx.compose.ui.input.pointer.PointerId;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u000e\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0086\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u000e¢\u0006\u0004\b\r\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\fJ\u0018\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0086\b¢\u0006\u0004\b\u0014\u0010\fJ \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u000eH\u0086\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0006H\u0086\n¢\u0006\u0004\b\u001c\u0010\u0018J\r\u0010\u001d\u001a\u00020\u0016¢\u0006\u0004\b\u001d\u0010\u0003J\u0018\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0086\b¢\u0006\u0004\b\u001e\u0010\fJ\u0015\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u000e¢\u0006\u0004\b\u001f\u0010\fR$\u0010 \u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0012\u0010%\u001a\u00020\u00048Ç\u0002¢\u0006\u0006\u001a\u0004\b$\u0010#R\u0016\u0010&\u001a\u00020\u00198\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b&\u0010'"}, d2 = {"Landroidx/compose/ui/input/pointer/util/PointerIdArray;", "", "<init>", "()V", "", "p0", "Landroidx/compose/ui/input/pointer/PointerId;", "get-_I2yYro", "(I)J", "get", "", "remove-0FcD4WY", "(J)Z", "remove", "", "removeAt", "(I)Z", "isEmpty", "()Z", "add", "add-0FcD4WY", "p1", "", "set", "(IJ)V", "", "resizeStorage", "(I)[J", "set-DmW0f2w", "clear", "contains-0FcD4WY", "contains", "size", "I", "getSize", "()I", "getLastIndex", "lastIndex", "internalArray", "[J"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PointerIdArray {
    public static final int $stable = 8;
    private long[] internalArray = new long[2];
    private int size;

    public final int getSize() {
        return this.size;
    }

    public final int getLastIndex() {
        return getSize() - 1;
    }

    /* JADX INFO: renamed from: get-_I2yYro, reason: not valid java name */
    public final long m5603get_I2yYro(int p0) {
        return PointerId.m5489constructorimpl(this.internalArray[p0]);
    }

    /* JADX INFO: renamed from: remove-0FcD4WY, reason: not valid java name */
    public final boolean m5604remove0FcD4WY(long p0) {
        return remove(p0);
    }

    public final boolean remove(long p0) {
        int i = this.size;
        int i2 = 0;
        while (i2 < i) {
            if (p0 == this.internalArray[i2]) {
                int i3 = this.size;
                while (i2 < i3 - 1) {
                    long[] jArr = this.internalArray;
                    int i4 = i2 + 1;
                    jArr[i2] = jArr[i4];
                    i2 = i4;
                }
                this.size--;
                return true;
            }
            i2++;
        }
        return false;
    }

    public final boolean removeAt(int p0) {
        int i = this.size;
        if (p0 >= i) {
            return false;
        }
        while (p0 < i - 1) {
            long[] jArr = this.internalArray;
            int i2 = p0 + 1;
            jArr[p0] = jArr[i2];
            p0 = i2;
        }
        this.size--;
        return true;
    }

    public final boolean isEmpty() {
        return this.size == 0;
    }

    public final boolean add(long p0) {
        if (contains(p0)) {
            return false;
        }
        set(this.size, p0);
        return true;
    }

    /* JADX INFO: renamed from: add-0FcD4WY, reason: not valid java name */
    public final boolean m5601add0FcD4WY(long p0) {
        return add(p0);
    }

    public final void set(int p0, long p1) {
        long[] jArrResizeStorage = this.internalArray;
        if (p0 >= jArrResizeStorage.length) {
            jArrResizeStorage = resizeStorage(p0 + 1);
        }
        jArrResizeStorage[p0] = p1;
        if (p0 >= this.size) {
            this.size = p0 + 1;
        }
    }

    private final long[] resizeStorage(int p0) {
        long[] jArr = this.internalArray;
        long[] jArrCopyOf = Arrays.copyOf(jArr, Math.max(p0, jArr.length * 2));
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "");
        this.internalArray = jArrCopyOf;
        return jArrCopyOf;
    }

    /* JADX INFO: renamed from: set-DmW0f2w, reason: not valid java name */
    public final void m5605setDmW0f2w(int p0, long p1) {
        set(p0, p1);
    }

    public final void clear() {
        this.size = 0;
    }

    /* JADX INFO: renamed from: contains-0FcD4WY, reason: not valid java name */
    public final boolean m5602contains0FcD4WY(long p0) {
        return contains(p0);
    }

    public final boolean contains(long p0) {
        int i = this.size;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.internalArray[i2] == p0) {
                return true;
            }
        }
        return false;
    }
}
