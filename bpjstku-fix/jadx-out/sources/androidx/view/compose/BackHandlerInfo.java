package androidx.view.compose;

import androidx.p010navigationevent.NavigationEventInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÇ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014H×\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u001a\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Landroidx/activity/compose/BackHandlerInfo;", "Landroidx/navigationevent/NavigationEventInfo;", "", "p0", "", "p1", "<init>", "(Ljava/lang/Object;J)V", "component1", "()Ljava/lang/Object;", "component2", "()J", "copy", "(Ljava/lang/Object;J)Landroidx/activity/compose/BackHandlerInfo;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "owner", "Ljava/lang/Object;", "getOwner", "compositeKey", "J", "getCompositeKey"}, k = 1, mv = {2, 1, 0}, xi = 48)
final /* data */ class BackHandlerInfo extends NavigationEventInfo {
    private final long compositeKey;
    private final Object owner;

    public BackHandlerInfo(Object obj, long j) {
        this.owner = obj;
        this.compositeKey = j;
    }

    public final long getCompositeKey() {
        return this.compositeKey;
    }

    public final Object getOwner() {
        return this.owner;
    }

    public static /* synthetic */ BackHandlerInfo copy$default(BackHandlerInfo backHandlerInfo, Object obj, long j, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = backHandlerInfo.owner;
        }
        if ((i & 2) != 0) {
            j = backHandlerInfo.compositeKey;
        }
        return backHandlerInfo.copy(obj, j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Object getOwner() {
        return this.owner;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getCompositeKey() {
        return this.compositeKey;
    }

    public final BackHandlerInfo copy(Object p0, long p1) {
        return new BackHandlerInfo(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof BackHandlerInfo)) {
            return false;
        }
        BackHandlerInfo backHandlerInfo = (BackHandlerInfo) p0;
        return Intrinsics.areEqual(this.owner, backHandlerInfo.owner) && this.compositeKey == backHandlerInfo.compositeKey;
    }

    public final int hashCode() {
        return (this.owner.hashCode() * 31) + Long.hashCode(this.compositeKey);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackHandlerInfo(owner=");
        sb.append(this.owner);
        sb.append(", compositeKey=");
        sb.append(this.compositeKey);
        sb.append(')');
        return sb.toString();
    }
}
