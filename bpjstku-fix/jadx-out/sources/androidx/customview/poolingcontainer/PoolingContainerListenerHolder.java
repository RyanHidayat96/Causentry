package androidx.customview.poolingcontainer;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\u0003J\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\bR$\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u000bj\b\u0012\u0004\u0012\u00020\u0004`\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/customview/poolingcontainer/PoolingContainerListenerHolder;", "", "<init>", "()V", "Landroidx/customview/poolingcontainer/PoolingContainerListener;", "p0", "", "addListener", "(Landroidx/customview/poolingcontainer/PoolingContainerListener;)V", "onRelease", "removeListener", "Ljava/util/ArrayList;", "Lkotlin/collections/b;", "listeners", "Ljava/util/ArrayList;"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class PoolingContainerListenerHolder {
    private final ArrayList<PoolingContainerListener> listeners = new ArrayList<>();

    public final void addListener(PoolingContainerListener p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        this.listeners.add(p0);
    }

    public final void removeListener(PoolingContainerListener p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        this.listeners.remove(p0);
    }

    public final void onRelease() {
        for (int lastIndex = CollectionsKt.getLastIndex(this.listeners); lastIndex >= 0; lastIndex--) {
            this.listeners.get(lastIndex).onRelease();
        }
    }
}
