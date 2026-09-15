package androidx.view;

import androidx.p002lifecycle.LifecycleOwner;
import androidx.p010navigationevent.NavigationEventInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0082\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÇ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015H×\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u000b"}, d2 = {"Landroidx/activity/OnBackPressedCallbackInfo;", "Landroidx/navigationevent/NavigationEventInfo;", "Landroidx/activity/OnBackPressedCallback;", "p0", "Landroidx/lifecycle/LifecycleOwner;", "p1", "<init>", "(Landroidx/activity/OnBackPressedCallback;Landroidx/lifecycle/LifecycleOwner;)V", "component1", "()Landroidx/activity/OnBackPressedCallback;", "component2", "()Landroidx/lifecycle/LifecycleOwner;", "copy", "(Landroidx/activity/OnBackPressedCallback;Landroidx/lifecycle/LifecycleOwner;)Landroidx/activity/OnBackPressedCallbackInfo;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "callback", "Landroidx/activity/OnBackPressedCallback;", "getCallback", "owner", "Landroidx/lifecycle/LifecycleOwner;", "getOwner"}, k = 1, mv = {2, 1, 0}, xi = 48)
final /* data */ class OnBackPressedCallbackInfo extends NavigationEventInfo {
    private final OnBackPressedCallback callback;
    private final LifecycleOwner owner;

    public OnBackPressedCallbackInfo(OnBackPressedCallback onBackPressedCallback, LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "");
        this.callback = onBackPressedCallback;
        this.owner = lifecycleOwner;
    }

    public /* synthetic */ OnBackPressedCallbackInfo(OnBackPressedCallback onBackPressedCallback, LifecycleOwner lifecycleOwner, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(onBackPressedCallback, (i & 2) != 0 ? null : lifecycleOwner);
    }

    public final OnBackPressedCallback getCallback() {
        return this.callback;
    }

    public final LifecycleOwner getOwner() {
        return this.owner;
    }

    public static /* synthetic */ OnBackPressedCallbackInfo copy$default(OnBackPressedCallbackInfo onBackPressedCallbackInfo, OnBackPressedCallback onBackPressedCallback, LifecycleOwner lifecycleOwner, int i, Object obj) {
        if ((i & 1) != 0) {
            onBackPressedCallback = onBackPressedCallbackInfo.callback;
        }
        if ((i & 2) != 0) {
            lifecycleOwner = onBackPressedCallbackInfo.owner;
        }
        return onBackPressedCallbackInfo.copy(onBackPressedCallback, lifecycleOwner);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final OnBackPressedCallback getCallback() {
        return this.callback;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final LifecycleOwner getOwner() {
        return this.owner;
    }

    public final OnBackPressedCallbackInfo copy(OnBackPressedCallback p0, LifecycleOwner p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        return new OnBackPressedCallbackInfo(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof OnBackPressedCallbackInfo)) {
            return false;
        }
        OnBackPressedCallbackInfo onBackPressedCallbackInfo = (OnBackPressedCallbackInfo) p0;
        return Intrinsics.areEqual(this.callback, onBackPressedCallbackInfo.callback) && Intrinsics.areEqual(this.owner, onBackPressedCallbackInfo.owner);
    }

    public final int hashCode() {
        int iHashCode = this.callback.hashCode();
        LifecycleOwner lifecycleOwner = this.owner;
        return (iHashCode * 31) + (lifecycleOwner == null ? 0 : lifecycleOwner.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnBackPressedCallbackInfo(callback=");
        sb.append(this.callback);
        sb.append(", owner=");
        sb.append(this.owner);
        sb.append(')');
        return sb.toString();
    }
}
