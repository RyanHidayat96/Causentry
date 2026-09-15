package androidx.p010navigationevent;

import androidx.exifinterface.media.ExifInterface;
import androidx.p010navigationevent.NavigationEventInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u001f\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ7\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00028\u00002\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0011H\u0015¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0011H\u0015¢\u0006\u0004\b\u0016\u0010\u0013J\u000f\u0010\u0017\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0017\u0010\rJ\u000f\u0010\u0018\u001a\u00020\u000bH\u0015¢\u0006\u0004\b\u0018\u0010\rJ\u000f\u0010\u0019\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0019\u0010\rJ\u000f\u0010\u001a\u001a\u00020\u000bH\u0015¢\u0006\u0004\b\u001a\u0010\rJ\u0017\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u001b\u0010\u0013J\u0017\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0011H\u0015¢\u0006\u0004\b\u001c\u0010\u0013J\u0017\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u001d\u0010\u0013J\u0017\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0011H\u0015¢\u0006\u0004\b\u001e\u0010\u0013J\u000f\u0010\u001f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u001f\u0010\rJ\u000f\u0010 \u001a\u00020\u000bH\u0015¢\u0006\u0004\b \u0010\rJ\u000f\u0010!\u001a\u00020\u000bH\u0000¢\u0006\u0004\b!\u0010\rJ\u000f\u0010\"\u001a\u00020\u000bH\u0015¢\u0006\u0004\b\"\u0010\rR$\u0010#\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u00008\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R0\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e8\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R0\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e8\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b,\u0010*R$\u0010.\u001a\u00020-2\u0006\u0010\u0004\u001a\u00020-8\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R*\u00102\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00058G@GX\u0087\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b2\u00104\"\u0004\b5\u00106R*\u00107\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00058G@GX\u0087\u000e¢\u0006\u0012\n\u0004\b7\u00103\u001a\u0004\b7\u00104\"\u0004\b8\u00106R$\u0010:\u001a\u0004\u0018\u0001098\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?"}, d2 = {"Landroidx/navigationevent/NavigationEventHandler;", "Landroidx/navigationevent/NavigationEventInfo;", ExifInterface.GPS_DIRECTION_TRUE, "", "p0", "", "p1", "p2", "<init>", "(Landroidx/navigationevent/NavigationEventInfo;ZZ)V", "(Landroidx/navigationevent/NavigationEventInfo;Z)V", "", "remove", "()V", "", "setInfo", "(Landroidx/navigationevent/NavigationEventInfo;Ljava/util/List;Ljava/util/List;)V", "Landroidx/navigationevent/NavigationEvent;", "doOnBackStarted$navigationevent", "(Landroidx/navigationevent/NavigationEvent;)V", "onBackStarted", "doOnBackProgressed$navigationevent", "onBackProgressed", "doOnBackCompleted$navigationevent", "onBackCompleted", "doOnBackCancelled$navigationevent", "onBackCancelled", "doOnForwardStarted$navigationevent", "onForwardStarted", "doOnForwardProgressed$navigationevent", "onForwardProgressed", "doOnForwardCompleted$navigationevent", "onForwardCompleted", "doOnForwardCancelled$navigationevent", "onForwardCancelled", "currentInfo", "Landroidx/navigationevent/NavigationEventInfo;", "getCurrentInfo", "()Landroidx/navigationevent/NavigationEventInfo;", "backInfo", "Ljava/util/List;", "getBackInfo", "()Ljava/util/List;", "forwardInfo", "getForwardInfo", "Landroidx/navigationevent/NavigationEventTransitionState;", "transitionState", "Landroidx/navigationevent/NavigationEventTransitionState;", "getTransitionState", "()Landroidx/navigationevent/NavigationEventTransitionState;", "isBackEnabled", "Z", "()Z", "setBackEnabled", "(Z)V", "isForwardEnabled", "setForwardEnabled", "Landroidx/navigationevent/NavigationEventDispatcher;", "dispatcher", "Landroidx/navigationevent/NavigationEventDispatcher;", "getDispatcher$navigationevent", "()Landroidx/navigationevent/NavigationEventDispatcher;", "setDispatcher$navigationevent", "(Landroidx/navigationevent/NavigationEventDispatcher;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class NavigationEventHandler<T extends NavigationEventInfo> {
    private List<? extends T> backInfo;
    private T currentInfo;
    private NavigationEventDispatcher dispatcher;
    private List<? extends T> forwardInfo;
    private boolean isBackEnabled;
    private boolean isForwardEnabled;
    private NavigationEventTransitionState transitionState;

    protected void onBackCancelled() {
    }

    protected void onForwardCancelled() {
    }

    public NavigationEventHandler(T t, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(t, "");
        this.currentInfo = t;
        this.backInfo = CollectionsKt.emptyList();
        this.forwardInfo = CollectionsKt.emptyList();
        this.transitionState = NavigationEventTransitionState.Idle.INSTANCE;
        this.isBackEnabled = z;
        this.isForwardEnabled = z2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavigationEventHandler(T t, boolean z) {
        this(t, z, false);
        Intrinsics.checkNotNullParameter(t, "");
    }

    public final T getCurrentInfo() {
        return this.currentInfo;
    }

    public final List<T> getBackInfo() {
        return this.backInfo;
    }

    public final List<T> getForwardInfo() {
        return this.forwardInfo;
    }

    public final NavigationEventTransitionState getTransitionState() {
        return this.transitionState;
    }

    public final boolean isBackEnabled() {
        NavigationEventDispatcher navigationEventDispatcher = this.dispatcher;
        if (navigationEventDispatcher == null || navigationEventDispatcher.isEnabled()) {
            return this.isBackEnabled;
        }
        return false;
    }

    public final void setBackEnabled(boolean z) {
        NavigationEventProcessor sharedProcessor;
        if (this.isBackEnabled != z) {
            this.isBackEnabled = z;
            NavigationEventDispatcher navigationEventDispatcher = this.dispatcher;
            if (navigationEventDispatcher == null || (sharedProcessor = navigationEventDispatcher.getSharedProcessor()) == null) {
                return;
            }
            sharedProcessor.refreshEnabledHandlers();
        }
    }

    public final boolean isForwardEnabled() {
        NavigationEventDispatcher navigationEventDispatcher = this.dispatcher;
        if (navigationEventDispatcher == null || navigationEventDispatcher.isEnabled()) {
            return this.isForwardEnabled;
        }
        return false;
    }

    public final void setForwardEnabled(boolean z) {
        NavigationEventProcessor sharedProcessor;
        if (this.isForwardEnabled != z) {
            this.isForwardEnabled = z;
            NavigationEventDispatcher navigationEventDispatcher = this.dispatcher;
            if (navigationEventDispatcher == null || (sharedProcessor = navigationEventDispatcher.getSharedProcessor()) == null) {
                return;
            }
            sharedProcessor.refreshEnabledHandlers();
        }
    }

    /* JADX INFO: renamed from: getDispatcher$navigationevent, reason: from getter */
    public final NavigationEventDispatcher getDispatcher() {
        return this.dispatcher;
    }

    public final void setDispatcher$navigationevent(NavigationEventDispatcher navigationEventDispatcher) {
        this.dispatcher = navigationEventDispatcher;
    }

    public final void remove() {
        NavigationEventDispatcher navigationEventDispatcher = this.dispatcher;
        if (navigationEventDispatcher != null) {
            navigationEventDispatcher.removeHandler$navigationevent(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setInfo$default(NavigationEventHandler navigationEventHandler, NavigationEventInfo navigationEventInfo, List list, List list2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setInfo");
        }
        if ((i & 2) != 0) {
            list = CollectionsKt.emptyList();
        }
        if ((i & 4) != 0) {
            list2 = CollectionsKt.emptyList();
        }
        navigationEventHandler.setInfo(navigationEventInfo, list, list2);
    }

    public final void setInfo(T p0, List<? extends T> p1, List<? extends T> p2) {
        NavigationEventProcessor sharedProcessor;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        this.currentInfo = p0;
        this.backInfo = p1;
        this.forwardInfo = p2;
        NavigationEventDispatcher navigationEventDispatcher = this.dispatcher;
        if (navigationEventDispatcher == null || (sharedProcessor = navigationEventDispatcher.getSharedProcessor()) == null) {
            return;
        }
        sharedProcessor.updateEnabledHandlerInfo$navigationevent(this);
    }

    public final void doOnBackStarted$navigationevent(NavigationEvent p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        this.transitionState = new NavigationEventTransitionState.InProgress(p0, -1);
        onBackStarted(p0);
    }

    public final void doOnBackProgressed$navigationevent(NavigationEvent p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        this.transitionState = new NavigationEventTransitionState.InProgress(p0, -1);
        onBackProgressed(p0);
    }

    public final void doOnBackCompleted$navigationevent() {
        this.transitionState = NavigationEventTransitionState.Idle.INSTANCE;
        onBackCompleted();
    }

    protected void onBackCompleted() {
        throw new UnsupportedOperationException("A handler that receives a 'backCompleted' event must override 'onBackCompleted()' to handle the callback.");
    }

    public final void doOnBackCancelled$navigationevent() {
        this.transitionState = NavigationEventTransitionState.Idle.INSTANCE;
        onBackCancelled();
    }

    public final void doOnForwardStarted$navigationevent(NavigationEvent p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        this.transitionState = new NavigationEventTransitionState.InProgress(p0, 1);
        onForwardStarted(p0);
    }

    public final void doOnForwardProgressed$navigationevent(NavigationEvent p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        this.transitionState = new NavigationEventTransitionState.InProgress(p0, 1);
        onForwardProgressed(p0);
    }

    public final void doOnForwardCompleted$navigationevent() {
        this.transitionState = NavigationEventTransitionState.Idle.INSTANCE;
        onForwardCompleted();
    }

    protected void onForwardCompleted() {
        throw new UnsupportedOperationException("A handler that receives a 'forwardCompleted' event must override 'onForwardCompleted()' to handle the callback.");
    }

    public final void doOnForwardCancelled$navigationevent() {
        this.transitionState = NavigationEventTransitionState.Idle.INSTANCE;
        onForwardCancelled();
    }

    protected void onBackProgressed(NavigationEvent p0) {
        Intrinsics.checkNotNullParameter(p0, "");
    }

    protected void onBackStarted(NavigationEvent p0) {
        Intrinsics.checkNotNullParameter(p0, "");
    }

    protected void onForwardProgressed(NavigationEvent p0) {
        Intrinsics.checkNotNullParameter(p0, "");
    }

    protected void onForwardStarted(NavigationEvent p0) {
        Intrinsics.checkNotNullParameter(p0, "");
    }

    public final void setInfo(T t) {
        Intrinsics.checkNotNullParameter(t, "");
        setInfo$default(this, t, null, null, 6, null);
    }

    public final void setInfo(T t, List<? extends T> list) {
        Intrinsics.checkNotNullParameter(t, "");
        Intrinsics.checkNotNullParameter(list, "");
        setInfo$default(this, t, list, null, 4, null);
    }
}
