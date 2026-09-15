package androidx.compose.runtime.snapshots;

import androidx.collection.MutableLongList;
import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\n\u0010\u0004\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotIdArrayBuilder;", "", "", "Landroidx/compose/runtime/snapshots/SnapshotIdArray;", "p0", "<init>", "([J)V", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "", "add", "(J)V", "toArray", "()[J", "Landroidx/collection/MutableLongList;", "list", "Landroidx/collection/MutableLongList;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SnapshotIdArrayBuilder {
    public static final int $stable = 8;
    private final MutableLongList list;

    public SnapshotIdArrayBuilder(long[] jArr) {
        MutableLongList mutableLongList;
        if (jArr != null) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
            mutableLongList = new MutableLongList(jArrCopyOf.length);
            mutableLongList.addAll(mutableLongList._size, jArrCopyOf);
        } else {
            mutableLongList = new MutableLongList(0, 1, null);
        }
        this.list = mutableLongList;
    }

    public final void add(long p0) {
        this.list.add(p0);
    }

    public final long[] toArray() {
        int i = this.list._size;
        if (i == 0) {
            return null;
        }
        long[] jArr = new long[i];
        MutableLongList mutableLongList = this.list;
        long[] jArr2 = mutableLongList.content;
        int i2 = mutableLongList._size;
        for (int i3 = 0; i3 < i2; i3++) {
            jArr[i3] = jArr2[i3];
        }
        return jArr;
    }
}
