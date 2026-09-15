package androidx.compose.runtime;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Landroidx/compose/runtime/RelativeGroupPath;", "Landroidx/compose/runtime/SourceInformationGroupPath;", "p0", "", "p1", "<init>", "(Landroidx/compose/runtime/SourceInformationGroupPath;I)V", "Landroidx/compose/runtime/SlotTable;", "", "getIdentity", "(Landroidx/compose/runtime/SlotTable;)Ljava/lang/Object;", "parent", "Landroidx/compose/runtime/SourceInformationGroupPath;", "getParent", "()Landroidx/compose/runtime/SourceInformationGroupPath;", FirebaseAnalytics.Param.INDEX, "I", "getIndex", "()I"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class RelativeGroupPath extends SourceInformationGroupPath {
    private final int index;
    private final SourceInformationGroupPath parent;

    public final int getIndex() {
        return this.index;
    }

    public final SourceInformationGroupPath getParent() {
        return this.parent;
    }

    public RelativeGroupPath(SourceInformationGroupPath sourceInformationGroupPath, int i) {
        super(null);
        this.parent = sourceInformationGroupPath;
        this.index = i;
    }

    @Override // androidx.compose.runtime.SourceInformationGroupPath
    public final Object getIdentity(SlotTable p0) {
        return new SourceInformationSlotTableGroupIdentity(this.parent.getIdentity(p0), this.index);
    }
}
