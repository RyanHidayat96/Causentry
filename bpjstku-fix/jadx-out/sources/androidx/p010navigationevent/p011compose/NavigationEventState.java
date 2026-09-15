package androidx.p010navigationevent.p011compose;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.exifinterface.media.ExifInterface;
import androidx.p010navigationevent.NavigationEventHandler;
import androidx.p010navigationevent.NavigationEventInfo;
import androidx.p010navigationevent.NavigationEventTransitionState;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B1\b\u0000\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\b\u0010\tR+\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\n8G@AX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R7\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058G@AX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R+\u0010\u001d\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u00008G@AX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR7\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058G@AX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\f\u001a\u0004\b\u001f\u0010\u0014\"\u0004\b \u0010\u0016R,\u0010#\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0001\u0018\u00010\"8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010("}, d2 = {"Landroidx/navigationevent/compose/NavigationEventState;", "Landroidx/navigationevent/NavigationEventInfo;", ExifInterface.GPS_DIRECTION_TRUE, "", "p0", "", "p1", "p2", "<init>", "(Landroidx/navigationevent/NavigationEventInfo;Ljava/util/List;Ljava/util/List;)V", "Landroidx/navigationevent/NavigationEventTransitionState;", "transitionState$delegate", "Landroidx/compose/runtime/MutableState;", "getTransitionState", "()Landroidx/navigationevent/NavigationEventTransitionState;", "setTransitionState$navigationevent_compose", "(Landroidx/navigationevent/NavigationEventTransitionState;)V", "transitionState", "backInfo$delegate", "getBackInfo", "()Ljava/util/List;", "setBackInfo$navigationevent_compose", "(Ljava/util/List;)V", "backInfo", "currentInfo$delegate", "getCurrentInfo", "()Landroidx/navigationevent/NavigationEventInfo;", "setCurrentInfo$navigationevent_compose", "(Landroidx/navigationevent/NavigationEventInfo;)V", "currentInfo", "forwardInfo$delegate", "getForwardInfo", "setForwardInfo$navigationevent_compose", "forwardInfo", "Landroidx/navigationevent/NavigationEventHandler;", "sourceHandler", "Landroidx/navigationevent/NavigationEventHandler;", "getSourceHandler$navigationevent_compose", "()Landroidx/navigationevent/NavigationEventHandler;", "setSourceHandler$navigationevent_compose", "(Landroidx/navigationevent/NavigationEventHandler;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NavigationEventState<T extends NavigationEventInfo> {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: backInfo$delegate, reason: from kotlin metadata */
    private final MutableState backInfo;

    /* JADX INFO: renamed from: currentInfo$delegate, reason: from kotlin metadata */
    private final MutableState currentInfo;

    /* JADX INFO: renamed from: forwardInfo$delegate, reason: from kotlin metadata */
    private final MutableState forwardInfo;
    private NavigationEventHandler<? extends NavigationEventInfo> sourceHandler;

    /* JADX INFO: renamed from: transitionState$delegate, reason: from kotlin metadata */
    private final MutableState transitionState;

    public NavigationEventState(T t, List<? extends T> list, List<? extends T> list2) {
        this.transitionState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(NavigationEventTransitionState.Idle.INSTANCE, null, 2, null);
        this.backInfo = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(list, null, 2, null);
        this.currentInfo = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t, null, 2, null);
        this.forwardInfo = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(list2, null, 2, null);
    }

    public /* synthetic */ NavigationEventState(NavigationEventInfo navigationEventInfo, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(navigationEventInfo, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? CollectionsKt.emptyList() : list2);
    }

    public final NavigationEventTransitionState getTransitionState() {
        return (NavigationEventTransitionState) this.transitionState.getValue();
    }

    public final void setTransitionState$navigationevent_compose(NavigationEventTransitionState navigationEventTransitionState) {
        this.transitionState.setValue(navigationEventTransitionState);
    }

    public final List<T> getBackInfo() {
        return (List) this.backInfo.getValue();
    }

    public final void setBackInfo$navigationevent_compose(List<? extends T> list) {
        this.backInfo.setValue(list);
    }

    public final T getCurrentInfo() {
        return (T) this.currentInfo.getValue();
    }

    public final void setCurrentInfo$navigationevent_compose(T t) {
        this.currentInfo.setValue(t);
    }

    public final List<T> getForwardInfo() {
        return (List) this.forwardInfo.getValue();
    }

    public final void setForwardInfo$navigationevent_compose(List<? extends T> list) {
        this.forwardInfo.setValue(list);
    }

    public final NavigationEventHandler<? extends NavigationEventInfo> getSourceHandler$navigationevent_compose() {
        return this.sourceHandler;
    }

    public final void setSourceHandler$navigationevent_compose(NavigationEventHandler<? extends NavigationEventInfo> navigationEventHandler) {
        this.sourceHandler = navigationEventHandler;
    }
}
