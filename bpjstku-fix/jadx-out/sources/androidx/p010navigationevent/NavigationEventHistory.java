package androidx.p010navigationevent;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\t\b\u0010¢\u0006\u0004\b\u0007\u0010\tB1\b\u0011\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0007\u0010\u000bJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0010"}, d2 = {"Landroidx/navigationevent/NavigationEventHistory;", "", "", "Landroidx/navigationevent/NavigationEventInfo;", "p0", "", "p1", "<init>", "(Ljava/util/List;I)V", "()V", "p2", "(Landroidx/navigationevent/NavigationEventInfo;Ljava/util/List;Ljava/util/List;)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "mergedHistory", "Ljava/util/List;", "getMergedHistory", "()Ljava/util/List;", "currentIndex", "I", "getCurrentIndex"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NavigationEventHistory {
    private final int currentIndex;
    private final List<NavigationEventInfo> mergedHistory;

    /* JADX WARN: Multi-variable type inference failed */
    private NavigationEventHistory(List<? extends NavigationEventInfo> list, int i) {
        this.mergedHistory = list;
        this.currentIndex = i;
        if (list.isEmpty() && i == -1) {
            return;
        }
        List<? extends NavigationEventInfo> list2 = list;
        if (!list2.isEmpty()) {
            int size = list2.size();
            if (i >= 0 && i < size) {
                return;
            }
        }
        StringBuilder sb = new StringBuilder("Invalid 'NavigationEventHistory' state:  'currentIndex' must be within the bounds of 'mergedHistory' (or -1 if empty). Received: currentIndex = '");
        sb.append(i);
        sb.append("', bounds = '");
        sb.append(CollectionsKt.getIndices(list2));
        sb.append("'.");
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public final List<NavigationEventInfo> getMergedHistory() {
        return this.mergedHistory;
    }

    public final int getCurrentIndex() {
        return this.currentIndex;
    }

    public NavigationEventHistory() {
        this((List<? extends NavigationEventInfo>) CollectionsKt.emptyList(), -1);
    }

    public /* synthetic */ NavigationEventHistory(NavigationEventInfo navigationEventInfo, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(navigationEventInfo, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? CollectionsKt.emptyList() : list2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NavigationEventHistory(NavigationEventInfo navigationEventInfo, List<? extends NavigationEventInfo> list, List<? extends NavigationEventInfo> list2) {
        Intrinsics.checkNotNullParameter(navigationEventInfo, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        List list3 = listCreateListBuilder;
        CollectionsKt.addAll(list3, list);
        list3.add(navigationEventInfo);
        CollectionsKt.addAll(list3, list2);
        this((List<? extends NavigationEventInfo>) CollectionsKt.build(listCreateListBuilder), list.size());
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (p0 == null || getClass() != p0.getClass()) {
            return false;
        }
        NavigationEventHistory navigationEventHistory = (NavigationEventHistory) p0;
        return this.currentIndex == navigationEventHistory.currentIndex && Intrinsics.areEqual(this.mergedHistory, navigationEventHistory.mergedHistory);
    }

    public final int hashCode() {
        return (this.currentIndex * 31) + this.mergedHistory.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavigationEventHistory(currentIndex=");
        sb.append(this.currentIndex);
        sb.append(", mergedHistory=");
        sb.append(this.mergedHistory);
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavigationEventHistory(NavigationEventInfo navigationEventInfo) {
        this(navigationEventInfo, null, null, 6, null);
        Intrinsics.checkNotNullParameter(navigationEventInfo, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavigationEventHistory(NavigationEventInfo navigationEventInfo, List<? extends NavigationEventInfo> list) {
        this(navigationEventInfo, list, null, 4, null);
        Intrinsics.checkNotNullParameter(navigationEventInfo, "");
        Intrinsics.checkNotNullParameter(list, "");
    }
}
