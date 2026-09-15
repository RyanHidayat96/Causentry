package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.internal.System_jvmKt;
import androidx.compose.runtime.internal.WeakReference;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\u000b\u001a\u00020\n2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\tH\u0086\b¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u0016\u001a\u00020\r8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u001d\u001a\u00020\u001c8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R0\u0010%\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010$0#8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotWeakSet;", "", ExifInterface.GPS_DIRECTION_TRUE, "<init>", "()V", "p0", "", "add", "(Ljava/lang/Object;)Z", "Lkotlin/Function1;", "", "removeIf", "(Lkotlin/jvm/functions/Function1;)V", "", "p1", "find", "(Ljava/lang/Object;I)I", "p2", "findExactIndex", "(ILjava/lang/Object;I)I", "isValid$runtime", "()Z", "size", "I", "getSize$runtime", "()I", "setSize$runtime", "(I)V", "", "hashes", "[I", "getHashes$runtime", "()[I", "setHashes$runtime", "([I)V", "", "Landroidx/compose/runtime/internal/WeakReference;", "values", "[Landroidx/compose/runtime/internal/WeakReference;", "getValues$runtime", "()[Landroidx/compose/runtime/internal/WeakReference;", "setValues$runtime", "([Landroidx/compose/runtime/internal/WeakReference;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SnapshotWeakSet<T> {
    public static final int $stable = 8;
    private int size;
    private int[] hashes = new int[16];
    private WeakReference<T>[] values = new WeakReference[16];

    /* JADX INFO: renamed from: getSize$runtime, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    public final void setSize$runtime(int i) {
        this.size = i;
    }

    /* JADX INFO: renamed from: getHashes$runtime, reason: from getter */
    public final int[] getHashes() {
        return this.hashes;
    }

    public final void setHashes$runtime(int[] iArr) {
        this.hashes = iArr;
    }

    public final WeakReference<T>[] getValues$runtime() {
        return this.values;
    }

    public final void setValues$runtime(WeakReference<T>[] weakReferenceArr) {
        this.values = weakReferenceArr;
    }

    public final boolean add(T p0) {
        int iFind;
        int i = this.size;
        int iIdentityHashCode = System_jvmKt.identityHashCode(p0);
        if (i > 0) {
            iFind = find(p0, iIdentityHashCode);
            if (iFind >= 0) {
                return false;
            }
        } else {
            iFind = -1;
        }
        int i2 = -(iFind + 1);
        WeakReference<T>[] weakReferenceArr = this.values;
        int length = weakReferenceArr.length;
        if (i == length) {
            int i3 = length * 2;
            WeakReference<T>[] weakReferenceArr2 = new WeakReference[i3];
            int[] iArr = new int[i3];
            int i4 = i2 + 1;
            System.arraycopy(weakReferenceArr, i2, weakReferenceArr2, i4, i - i2);
            System.arraycopy(this.values, 0, weakReferenceArr2, 0, i2);
            ArraysKt.copyInto(this.hashes, iArr, i4, i2, i);
            ArraysKt.copyInto$default(this.hashes, iArr, 0, 0, i2, 6, (Object) null);
            this.values = weakReferenceArr2;
            this.hashes = iArr;
        } else {
            int i5 = i2 + 1;
            System.arraycopy(weakReferenceArr, i2, weakReferenceArr, i5, i - i2);
            int[] iArr2 = this.hashes;
            ArraysKt.copyInto(iArr2, iArr2, i5, i2, i);
        }
        this.values[i2] = new WeakReference<>(p0);
        this.hashes[i2] = iIdentityHashCode;
        this.size++;
        return true;
    }

    public final void removeIf(Function1<? super T, Boolean> p0) {
        int size = getSize();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            WeakReference<T> weakReference = getValues$runtime()[i];
            T t = weakReference != null ? weakReference.get() : null;
            if (t != null && !p0.invoke(t).booleanValue()) {
                if (i2 != i) {
                    getValues$runtime()[i2] = weakReference;
                    getHashes()[i2] = getHashes()[i];
                }
                i2++;
            }
            i++;
        }
        for (int i3 = i2; i3 < size; i3++) {
            getValues$runtime()[i3] = null;
            getHashes()[i3] = 0;
        }
        if (i2 != size) {
            setSize$runtime(i2);
        }
    }

    private final int find(T p0, int p1) {
        int i = this.size - 1;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            int i4 = this.hashes[i3];
            if (i4 < p1) {
                i2 = i3 + 1;
            } else {
                if (i4 <= p1) {
                    WeakReference<T> weakReference = this.values[i3];
                    return p0 == (weakReference != null ? weakReference.get() : null) ? i3 : findExactIndex(i3, p0, p1);
                }
                i = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    private final int findExactIndex(int p0, T p1, int p2) {
        int i = p0 - 1;
        while (true) {
            if (i < 0 || this.hashes[i] != p2) {
                break;
            }
            WeakReference<T> weakReference = this.values[i];
            if ((weakReference != null ? weakReference.get() : null) == p1) {
                return i;
            }
            i--;
        }
        int i2 = p0 + 1;
        int i3 = this.size;
        while (i2 < i3) {
            if (this.hashes[i2] != p2) {
                return -(i2 + 1);
            }
            WeakReference<T> weakReference2 = this.values[i2];
            if ((weakReference2 != null ? weakReference2.get() : null) == p1) {
                return i2;
            }
            i2++;
        }
        i2 = this.size;
        return -(i2 + 1);
    }

    public final boolean isValid$runtime() {
        WeakReference<T> weakReference;
        int i = this.size;
        WeakReference<T>[] weakReferenceArr = this.values;
        int[] iArr = this.hashes;
        int length = weakReferenceArr.length;
        if (i > length) {
            return false;
        }
        int i2 = Integer.MIN_VALUE;
        int i3 = 0;
        while (i3 < i) {
            int i4 = iArr[i3];
            if (i4 < i2 || (weakReference = weakReferenceArr[i3]) == null) {
                return false;
            }
            T t = weakReference.get();
            if (t != null && i4 != System_jvmKt.identityHashCode(t)) {
                return false;
            }
            i3++;
            i2 = i4;
        }
        while (i < length) {
            if (iArr[i] != 0 || weakReferenceArr[i] != null) {
                return false;
            }
            i++;
        }
        return true;
    }
}
