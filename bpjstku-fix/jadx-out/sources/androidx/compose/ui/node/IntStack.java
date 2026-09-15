package androidx.compose.ui.node;

import androidx.compose.ui.internal.InlineClassHelperKt;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ-\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u000e¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001a\u0010\u0012J'\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u00020\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010#\u001a\u00020\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0011\u0010&\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b%\u0010\u0014"}, d2 = {"Landroidx/compose/ui/node/IntStack;", "", "", "p0", "<init>", "(I)V", "get", "(I)I", "", "resizeStack", "([I)[I", "p1", "p2", "p3", "", "pushRange", "(IIII)V", "pushDiagonal", "(III)V", "pop", "()I", "", "isNotEmpty", "()Z", "sortDiagonals", "()V", "quickSort", "partition", "(III)I", "swapDiagonal", "(II)V", "compareDiagonal", "(II)Z", "stack", "[I", "lastIndex", "I", "getSize", "size"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class IntStack {
    private int lastIndex;
    private int[] stack;

    public IntStack(int i) {
        this.stack = new int[i];
    }

    public final int get(int p0) {
        return this.stack[p0];
    }

    /* JADX INFO: renamed from: getSize, reason: from getter */
    public final int getLastIndex() {
        return this.lastIndex;
    }

    private final int[] resizeStack(int[] p0) {
        int[] iArrCopyOf = Arrays.copyOf(p0, p0.length * 2);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "");
        this.stack = iArrCopyOf;
        return iArrCopyOf;
    }

    public final void pushRange(int p0, int p1, int p2, int p3) {
        int i = this.lastIndex;
        int[] iArrResizeStack = this.stack;
        int i2 = i + 4;
        if (i2 >= iArrResizeStack.length) {
            iArrResizeStack = resizeStack(iArrResizeStack);
        }
        iArrResizeStack[i] = p0;
        iArrResizeStack[i + 1] = p1;
        iArrResizeStack[i + 2] = p2;
        iArrResizeStack[i + 3] = p3;
        this.lastIndex = i2;
    }

    public final void pushDiagonal(int p0, int p1, int p2) {
        int i = this.lastIndex;
        int[] iArrResizeStack = this.stack;
        int i2 = i + 3;
        if (i2 >= iArrResizeStack.length) {
            iArrResizeStack = resizeStack(iArrResizeStack);
        }
        iArrResizeStack[i] = p0 + p2;
        iArrResizeStack[i + 1] = p1 + p2;
        iArrResizeStack[i + 2] = p2;
        this.lastIndex = i2;
    }

    public final int pop() {
        int[] iArr = this.stack;
        int i = this.lastIndex - 1;
        this.lastIndex = i;
        return iArr[i];
    }

    public final boolean isNotEmpty() {
        return this.lastIndex != 0;
    }

    public final void sortDiagonals() {
        int i = this.lastIndex;
        if (i % 3 != 0) {
            InlineClassHelperKt.throwIllegalStateException("Array size not a multiple of 3");
        }
        if (i > 3) {
            quickSort(0, i - 3, 3);
        }
    }

    private final void quickSort(int p0, int p1, int p2) {
        while (p0 < p1) {
            int iPartition = partition(p0, p1, p2);
            quickSort(p0, iPartition - p2, p2);
            p0 = iPartition + p2;
        }
    }

    private final int partition(int p0, int p1, int p2) {
        int i = p0 - p2;
        while (p0 < p1) {
            if (compareDiagonal(p0, p1)) {
                i += p2;
                swapDiagonal(i, p0);
            }
            p0 += p2;
        }
        int i2 = i + p2;
        swapDiagonal(i2, p1);
        return i2;
    }

    private final void swapDiagonal(int p0, int p1) {
        int[] iArr = this.stack;
        MyersDiffKt.swap(iArr, p0, p1);
        MyersDiffKt.swap(iArr, p0 + 1, p1 + 1);
        MyersDiffKt.swap(iArr, p0 + 2, p1 + 2);
    }

    private final boolean compareDiagonal(int p0, int p1) {
        int[] iArr = this.stack;
        int i = iArr[p0];
        int i2 = iArr[p1];
        return i < i2 || (i == i2 && iArr[p0 + 1] <= iArr[p1 + 1]);
    }
}
