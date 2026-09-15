package androidx.compose.runtime.snapshots;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0016\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0015\u001a$\u0010\u0004\u001a\u00020\u0003*\u00060\u0000j\u0002`\u00012\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\u0080\n¢\u0006\u0004\b\u0004\u0010\u0005\u001a \u0010\u0004\u001a\u00020\u0003*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0080\n¢\u0006\u0004\b\u0004\u0010\u0006\u001a$\u0010\u0007\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0080\n¢\u0006\u0004\b\u0007\u0010\b\u001a(\u0010\t\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\u0080\n¢\u0006\u0004\b\t\u0010\n\u001a$\u0010\t\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0080\n¢\u0006\u0004\b\t\u0010\b\u001a$\u0010\u000b\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0080\n¢\u0006\u0004\b\u000b\u0010\b\u001a$\u0010\f\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0080\n¢\u0006\u0004\b\f\u0010\b\u001a\u0018\u0010\r\u001a\u00020\u0003*\u00060\u0000j\u0002`\u0001H\u0086\b¢\u0006\u0004\b\r\u0010\u000e\u001a\u0018\u0010\u000f\u001a\u00020\u0000*\u00060\u0000j\u0002`\u0001H\u0086\b¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001b\u0010\u0013\u001a\u00060\u0011j\u0002`\u00122\u0006\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a$\u0010\u0015\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0011j\u0002`\u00122\u0006\u0010\u0002\u001a\u00020\u0003H\u0080\n¢\u0006\u0004\b\u0015\u0010\u0016\u001a,\u0010\u0019\u001a\u00020\u0018*\u00060\u0011j\u0002`\u00122\u0006\u0010\u0002\u001a\u00020\u00032\n\u0010\u0017\u001a\u00060\u0000j\u0002`\u0001H\u0080\n¢\u0006\u0004\b\u0019\u0010\u001a\u001a$\u0010\u001b\u001a\u00020\u0018*\u00060\u0011j\u0002`\u00122\n\u0010\u0002\u001a\u00060\u0011j\u0002`\u0012H\u0080\b¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001c\u0010\u001d\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0011j\u0002`\u0012H\u0080\b¢\u0006\u0004\b\u001d\u0010\u001e\u001a#\u0010\u001f\u001a\u00020\u0003*\u00060\u0011j\u0002`\u00122\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\u0000¢\u0006\u0004\b\u001f\u0010 \u001a0\u0010\"\u001a\u00020\u0018*\u00060\u0011j\u0002`\u00122\u0016\u0010\u0002\u001a\u0012\u0012\b\u0012\u00060\u0000j\u0002`\u0001\u0012\u0004\u0012\u00020\u00180!H\u0080\b¢\u0006\u0004\b\"\u0010#\u001a/\u0010$\u001a\u00060\u0011j\u0002`\u0012*\u00060\u0011j\u0002`\u00122\u0006\u0010\u0002\u001a\u00020\u00032\n\u0010\u0017\u001a\u00060\u0000j\u0002`\u0001H\u0001¢\u0006\u0004\b$\u0010%\u001a'\u0010&\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u0012*\u00060\u0011j\u0002`\u00122\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¢\u0006\u0004\b&\u0010'\u001a \u0010(\u001a\u00060\u0011j\u0002`\u00122\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\u0081\b¢\u0006\u0004\b(\u0010)\u001a\u0017\u0010*\u001a\u00060\u0000j\u0002`\u0001*\u00020\u0003H\u0000¢\u0006\u0004\b*\u0010+\u001a\u0017\u0010*\u001a\u00060\u0000j\u0002`\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b*\u0010\u0010\"\u0018\u0010,\u001a\u00060\u0000j\u0002`\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b,\u0010-\"\u0018\u0010.\u001a\u00060\u0000j\u0002`\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b.\u0010-\"\u0014\u0010/\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b/\u00100\"\u0018\u00101\u001a\u00060\u0000j\u0002`\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b1\u0010-\"\u001d\u00104\u001a\u00020\u0003*\u00060\u0011j\u0002`\u00128Á\u0002X\u0080\u0004¢\u0006\u0006\u001a\u0004\b2\u00103*\n\u00105\"\u00020\u00002\u00020\u0000*\n\u00106\"\u00020\u00112\u00020\u0011"}, d2 = {"", "Landroidx/compose/runtime/snapshots/SnapshotId;", "p0", "", "compareTo", "(JJ)I", "(JI)I", "plus", "(JI)J", "minus", "(JJ)J", "div", "times", "toInt", "(J)I", "toLong", "(J)J", "", "Landroidx/compose/runtime/snapshots/SnapshotIdArray;", "snapshotIdArrayWithCapacity", "(I)[J", "get", "([JI)J", "p1", "", "set", "([JIJ)V", "copyInto", "([J[J)V", "first", "([J)J", "binarySearch", "([JJ)I", "Lkotlin/Function1;", "forEach", "([JLkotlin/jvm/functions/Function1;)V", "withIdInsertedAt", "([JIJ)[J", "withIdRemovedAt", "([JI)[J", "snapshotIdArrayOf", "(J)[J", "toSnapshotId", "(I)J", "SnapshotIdZero", "J", "SnapshotIdMax", "SnapshotIdSize", "I", "SnapshotIdInvalidValue", "getSize", "([J)I", "size", "SnapshotId", "SnapshotIdArray"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SnapshotId_jvmKt {
    public static final long SnapshotIdInvalidValue = -1;
    public static final long SnapshotIdMax = Long.MAX_VALUE;
    public static final int SnapshotIdSize = 64;
    public static final long SnapshotIdZero = 0;

    public static final long minus(long j, int i) {
        return j - ((long) i);
    }

    public static final long minus(long j, long j2) {
        return j - j2;
    }

    public static final long plus(long j, int i) {
        return j + ((long) i);
    }

    public static final long times(long j, int i) {
        return j * ((long) i);
    }

    public static final int toInt(long j) {
        return (int) j;
    }

    public static final long toLong(long j) {
        return j;
    }

    public static final long toSnapshotId(int i) {
        return i;
    }

    public static final long toSnapshotId(long j) {
        return j;
    }

    public static final int compareTo(long j, long j2) {
        return Intrinsics.compare(j, j2);
    }

    public static final int compareTo(long j, int i) {
        return Intrinsics.compare(j, i);
    }

    public static final long div(long j, int i) {
        return j / ((long) i);
    }

    public static final long[] snapshotIdArrayWithCapacity(int i) {
        return new long[i];
    }

    public static final long get(long[] jArr, int i) {
        return jArr[i];
    }

    public static final void set(long[] jArr, int i, long j) {
        jArr[i] = j;
    }

    public static final int getSize(long[] jArr) {
        return jArr.length;
    }

    public static final void copyInto(long[] jArr, long[] jArr2) {
        ArraysKt.copyInto$default(jArr, jArr2, 0, 0, 0, 12, (Object) null);
    }

    public static final long first(long[] jArr) {
        return jArr[0];
    }

    public static final int binarySearch(long[] jArr, long j) {
        int length = jArr.length - 1;
        int i = 0;
        while (i <= length) {
            int i2 = (i + length) >>> 1;
            long j2 = jArr[i2];
            if (j > j2) {
                i = i2 + 1;
            } else {
                if (j >= j2) {
                    return i2;
                }
                length = i2 - 1;
            }
        }
        return -(i + 1);
    }

    public static final void forEach(long[] jArr, Function1<? super Long, Unit> function1) {
        for (long j : jArr) {
            function1.invoke(Long.valueOf(j));
        }
    }

    public static final long[] withIdInsertedAt(long[] jArr, int i, long j) {
        int length = jArr.length;
        long[] jArr2 = new long[length + 1];
        ArraysKt.copyInto(jArr, jArr2, 0, 0, i);
        ArraysKt.copyInto(jArr, jArr2, i + 1, i, length);
        jArr2[i] = j;
        return jArr2;
    }

    public static final long[] withIdRemovedAt(long[] jArr, int i) {
        int length = jArr.length;
        int i2 = length - 1;
        if (i2 == 0) {
            return null;
        }
        long[] jArr2 = new long[i2];
        if (i > 0) {
            ArraysKt.copyInto(jArr, jArr2, 0, 0, i);
        }
        if (i < i2) {
            ArraysKt.copyInto(jArr, jArr2, i, i + 1, length);
        }
        return jArr2;
    }

    public static final long[] snapshotIdArrayOf(long j) {
        return new long[]{j};
    }
}
