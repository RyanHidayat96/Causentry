package androidx.p005navigation.p008internal;

import androidx.collection.SparseArrayCompat;
import androidx.p005navigation.NavDestination;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMutableIterator;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u000b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/navigation/internal/NavGraphImpl$iterator$1;", "", "Landroidx/navigation/NavDestination;", "", "hasNext", "()Z", "next", "()Landroidx/navigation/NavDestination;", "", "remove", "()V", "", FirebaseAnalytics.Param.INDEX, "I", "wentToNext", "Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NavGraphImpl$iterator$1 implements Iterator<NavDestination>, KMutableIterator {
    private int index = -1;
    final /* synthetic */ NavGraphImpl this$0;
    private boolean wentToNext;

    NavGraphImpl$iterator$1(NavGraphImpl navGraphImpl) {
        this.this$0 = navGraphImpl;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.index + 1 < this.this$0.getNodes$navigation_common_release().size();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public final NavDestination next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.wentToNext = true;
        SparseArrayCompat<NavDestination> nodes$navigation_common_release = this.this$0.getNodes$navigation_common_release();
        int i = this.index + 1;
        this.index = i;
        return nodes$navigation_common_release.valueAt(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.wentToNext) {
            throw new IllegalStateException("You must call next() before you can remove an element".toString());
        }
        SparseArrayCompat<NavDestination> nodes$navigation_common_release = this.this$0.getNodes$navigation_common_release();
        nodes$navigation_common_release.valueAt(this.index).setParent(null);
        nodes$navigation_common_release.removeAt(this.index);
        this.index--;
        this.wentToNext = false;
    }
}
