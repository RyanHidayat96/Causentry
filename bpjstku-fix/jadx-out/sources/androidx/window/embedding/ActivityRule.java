package androidx.window.embedding;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0081\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018"}, d2 = {"Landroidx/window/embedding/ActivityRule;", "Landroidx/window/embedding/EmbeddingRule;", "", "Landroidx/window/embedding/ActivityFilter;", "p0", "", "p1", "<init>", "(Ljava/util/Set;Z)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "plus$window_release", "(Landroidx/window/embedding/ActivityFilter;)Landroidx/window/embedding/ActivityRule;", "alwaysExpand", "Z", "getAlwaysExpand", "()Z", "filters", "Ljava/util/Set;", "getFilters", "()Ljava/util/Set;"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class ActivityRule extends EmbeddingRule {
    private final boolean alwaysExpand;
    private final Set<ActivityFilter> filters;

    public /* synthetic */ ActivityRule(Set set, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(set, (i & 2) != 0 ? false : z);
    }

    public final boolean getAlwaysExpand() {
        return this.alwaysExpand;
    }

    public ActivityRule(Set<ActivityFilter> set, boolean z) {
        Intrinsics.checkNotNullParameter(set, "");
        this.alwaysExpand = z;
        this.filters = CollectionsKt.toSet(set);
    }

    public final Set<ActivityFilter> getFilters() {
        return this.filters;
    }

    public final ActivityRule plus$window_release(ActivityFilter p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(this.filters);
        linkedHashSet.add(p0);
        return new ActivityRule(CollectionsKt.toSet(linkedHashSet), this.alwaysExpand);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ActivityRule)) {
            return false;
        }
        ActivityRule activityRule = (ActivityRule) p0;
        return Intrinsics.areEqual(this.filters, activityRule.filters) && this.alwaysExpand == activityRule.alwaysExpand;
    }

    public final int hashCode() {
        return (this.filters.hashCode() * 31) + Boolean.hashCode(this.alwaysExpand);
    }
}
