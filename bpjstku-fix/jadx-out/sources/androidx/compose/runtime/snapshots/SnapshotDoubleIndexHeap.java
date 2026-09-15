package androidx.compose.runtime.snapshots;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00060\u0004j\u0002`\u00052\f\b\u0002\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u00020\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0003J!\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\t2\n\u0010\u0010\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0013\u0010\u000eJ\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0014\u0010\u000eJ\u001f\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0017\u0010\u000eJ\u000f\u0010\u0018\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001a\u0010\u000eR$\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\t8\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0019R\u001a\u0010 \u001a\u00060\u001ej\u0002`\u001f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b%\u0010$R\u0016\u0010&\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b&\u0010\u001c"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotDoubleIndexHeap;", "", "<init>", "()V", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "p0", "lowestOrDefault", "(J)J", "", "add", "(J)I", "", "remove", "(I)V", "validate", "p1", "validateHandle", "(IJ)V", "shiftUp", "shiftDown", "swap", "(II)V", "ensure", "allocateHandle", "()I", "freeHandle", "size", "I", "getSize", "", "Landroidx/compose/runtime/snapshots/SnapshotIdArray;", "values", "[J", "", FirebaseAnalytics.Param.INDEX, "[I", "handles", "firstFreeHandle"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SnapshotDoubleIndexHeap {
    public static final int $stable = 8;
    private int firstFreeHandle;
    private int[] handles;
    private int size;
    private long[] values = SnapshotId_jvmKt.snapshotIdArrayWithCapacity(16);
    private int[] index = new int[16];

    public SnapshotDoubleIndexHeap() {
        int[] iArr = new int[16];
        int i = 0;
        while (i < 16) {
            int i2 = i + 1;
            iArr[i] = i2;
            i = i2;
        }
        this.handles = iArr;
    }

    public final int getSize() {
        return this.size;
    }

    public static /* synthetic */ long lowestOrDefault$default(SnapshotDoubleIndexHeap snapshotDoubleIndexHeap, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 0;
        }
        return snapshotDoubleIndexHeap.lowestOrDefault(j);
    }

    public final long lowestOrDefault(long p0) {
        return this.size > 0 ? this.values[0] : p0;
    }

    public final int add(long p0) {
        ensure(this.size + 1);
        int i = this.size;
        this.size = i + 1;
        int iAllocateHandle = allocateHandle();
        this.values[i] = p0;
        this.index[i] = iAllocateHandle;
        this.handles[iAllocateHandle] = i;
        shiftUp(i);
        return iAllocateHandle;
    }

    public final void remove(int p0) {
        int i = this.handles[p0];
        swap(i, this.size - 1);
        this.size--;
        shiftUp(i);
        shiftDown(i);
        freeHandle(p0);
    }

    public final void validate() {
        int i = this.size;
        int i2 = 1;
        while (i2 < i) {
            int i3 = i2 + 1;
            long[] jArr = this.values;
            if (Intrinsics.compare(jArr[(i3 >> 1) - 1], jArr[i2]) > 0) {
                StringBuilder sb = new StringBuilder("Index ");
                sb.append(i2);
                sb.append(" is out of place");
                throw new IllegalStateException(sb.toString().toString());
            }
            i2 = i3;
        }
    }

    public final void validateHandle(int p0, long p1) {
        int i = this.handles[p0];
        if (this.index[i] != p0) {
            StringBuilder sb = new StringBuilder("Index for handle ");
            sb.append(p0);
            sb.append(" is corrupted");
            throw new IllegalStateException(sb.toString().toString());
        }
        if (this.values[i] == p1) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("Value for handle ");
        sb2.append(p0);
        sb2.append(" was ");
        sb2.append(this.values[i]);
        sb2.append(" but was supposed to be ");
        sb2.append(p1);
        throw new IllegalStateException(sb2.toString().toString());
    }

    private final void shiftUp(int p0) {
        long[] jArr = this.values;
        long j = jArr[p0];
        while (p0 > 0) {
            int i = ((p0 + 1) >> 1) - 1;
            if (Intrinsics.compare(jArr[i], j) <= 0) {
                return;
            }
            swap(i, p0);
            p0 = i;
        }
    }

    private final void shiftDown(int p0) {
        long[] jArr = this.values;
        int i = this.size;
        while (p0 < (i >> 1)) {
            int i2 = (p0 + 1) << 1;
            int i3 = i2 - 1;
            if (i2 < this.size && Intrinsics.compare(jArr[i2], jArr[i3]) < 0) {
                if (Intrinsics.compare(jArr[i2], jArr[p0]) >= 0) {
                    return;
                }
                swap(i2, p0);
                p0 = i2;
            } else {
                if (Intrinsics.compare(jArr[i3], jArr[p0]) >= 0) {
                    return;
                }
                swap(i3, p0);
                p0 = i3;
            }
        }
    }

    private final void swap(int p0, int p1) {
        long[] jArr = this.values;
        int[] iArr = this.index;
        int[] iArr2 = this.handles;
        long j = jArr[p0];
        jArr[p0] = jArr[p1];
        jArr[p1] = j;
        int i = iArr[p0];
        int i2 = iArr[p1];
        iArr[p0] = i2;
        iArr[p1] = i;
        iArr2[i2] = p0;
        iArr2[i] = p1;
    }

    private final void ensure(int p0) {
        int length = this.values.length;
        if (p0 <= length) {
            return;
        }
        int i = length * 2;
        long[] jArrSnapshotIdArrayWithCapacity = SnapshotId_jvmKt.snapshotIdArrayWithCapacity(i);
        int[] iArr = new int[i];
        ArraysKt.copyInto$default(this.values, jArrSnapshotIdArrayWithCapacity, 0, 0, 0, 12, (Object) null);
        ArraysKt.copyInto$default(this.index, iArr, 0, 0, 0, 14, (Object) null);
        this.values = jArrSnapshotIdArrayWithCapacity;
        this.index = iArr;
    }

    private final int allocateHandle() {
        int length = this.handles.length;
        if (this.firstFreeHandle >= length) {
            int i = length * 2;
            int[] iArr = new int[i];
            int i2 = 0;
            while (i2 < i) {
                int i3 = i2 + 1;
                iArr[i2] = i3;
                i2 = i3;
            }
            ArraysKt.copyInto$default(this.handles, iArr, 0, 0, 0, 14, (Object) null);
            this.handles = iArr;
        }
        int i4 = this.firstFreeHandle;
        this.firstFreeHandle = this.handles[i4];
        return i4;
    }

    private final void freeHandle(int p0) {
        this.handles[p0] = this.firstFreeHandle;
        this.firstFreeHandle = p0;
    }
}
