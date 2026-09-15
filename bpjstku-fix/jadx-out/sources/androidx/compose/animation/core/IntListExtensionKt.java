package androidx.compose.animation.core;

import androidx.collection.IntList;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u001a/\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/collection/IntList;", "", "p0", "p1", "p2", "binarySearch", "(Landroidx/collection/IntList;III)I"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class IntListExtensionKt {
    public static /* synthetic */ int binarySearch$default(IntList intList, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = intList.getSize();
        }
        return binarySearch(intList, i, i2, i3);
    }

    public static final int binarySearch(IntList intList, int i, int i2, int i3) {
        if (i2 > i3) {
            StringBuilder sb = new StringBuilder("fromIndex(");
            sb.append(i2);
            sb.append(") > toIndex(");
            sb.append(i3);
            sb.append(')');
            PreconditionsKt.throwIllegalArgumentException(sb.toString());
        }
        if (i2 < 0) {
            throw new IndexOutOfBoundsException("Index out of range: ".concat(String.valueOf(i2)));
        }
        if (i3 > intList.getSize()) {
            throw new IndexOutOfBoundsException("Index out of range: ".concat(String.valueOf(i3)));
        }
        int i4 = i3 - 1;
        while (i2 <= i4) {
            int i5 = (i2 + i4) >>> 1;
            int i6 = intList.get(i5);
            if (i6 < i) {
                i2 = i5 + 1;
            } else {
                if (i6 <= i) {
                    return i5;
                }
                i4 = i5 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final int binarySearch(IntList intList, int i) {
        return binarySearch$default(intList, i, 0, 0, 6, null);
    }

    public static final int binarySearch(IntList intList, int i, int i2) {
        return binarySearch$default(intList, i, i2, 0, 4, null);
    }
}
