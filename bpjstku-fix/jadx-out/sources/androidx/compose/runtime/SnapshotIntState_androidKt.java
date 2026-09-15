package androidx.compose.runtime;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "p0", "Landroidx/compose/runtime/MutableIntState;", "createSnapshotMutableIntState", "(I)Landroidx/compose/runtime/MutableIntState;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SnapshotIntState_androidKt {
    public static final MutableIntState createSnapshotMutableIntState(int i) {
        return new ParcelableSnapshotMutableIntState(i);
    }
}
