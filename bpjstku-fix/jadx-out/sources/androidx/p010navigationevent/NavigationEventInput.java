package androidx.p010navigationevent;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0015¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0006H\u0015¢\u0006\u0004\b\u000b\u0010\u0003J\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\fH\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\fH\u0015¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0010H\u0015¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0014H\u0005¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0014H\u0005¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0006H\u0005¢\u0006\u0004\b\u0018\u0010\u0003J\u000f\u0010\u0019\u001a\u00020\u0006H\u0005¢\u0006\u0004\b\u0019\u0010\u0003J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0014H\u0005¢\u0006\u0004\b\u001a\u0010\u0016J\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0014H\u0005¢\u0006\u0004\b\u001b\u0010\u0016J\u000f\u0010\u001c\u001a\u00020\u0006H\u0005¢\u0006\u0004\b\u001c\u0010\u0003J\u000f\u0010\u001d\u001a\u00020\u0006H\u0005¢\u0006\u0004\b\u001d\u0010\u0003R$\u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0001@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010\bR\u0016\u0010#\u001a\u00020\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010%\u001a\u00020\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b%\u0010$"}, d2 = {"Landroidx/navigationevent/NavigationEventInput;", "", "<init>", "()V", "Landroidx/navigationevent/NavigationEventDispatcher;", "p0", "", "doOnAdded$navigationevent", "(Landroidx/navigationevent/NavigationEventDispatcher;)V", "onAdded", "doOnRemoved$navigationevent", "onRemoved", "", "doOnHasEnabledHandlersChanged$navigationevent", "(Z)V", "onHasEnabledHandlersChanged", "Landroidx/navigationevent/NavigationEventHistory;", "doOnHistoryChanged$navigationevent", "(Landroidx/navigationevent/NavigationEventHistory;)V", "onHistoryChanged", "Landroidx/navigationevent/NavigationEvent;", "dispatchOnBackStarted", "(Landroidx/navigationevent/NavigationEvent;)V", "dispatchOnBackProgressed", "dispatchOnBackCancelled", "dispatchOnBackCompleted", "dispatchOnForwardStarted", "dispatchOnForwardProgressed", "dispatchOnForwardCancelled", "dispatchOnForwardCompleted", "dispatcher", "Landroidx/navigationevent/NavigationEventDispatcher;", "getDispatcher$navigationevent", "()Landroidx/navigationevent/NavigationEventDispatcher;", "setDispatcher$navigationevent", "isPredictiveBackInProgress", "Z", "isPredictiveForwardInProgress"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class NavigationEventInput {
    private NavigationEventDispatcher dispatcher;
    private boolean isPredictiveBackInProgress;
    private boolean isPredictiveForwardInProgress;

    protected void onHasEnabledHandlersChanged(boolean p0) {
    }

    protected void onRemoved() {
    }

    /* JADX INFO: renamed from: getDispatcher$navigationevent, reason: from getter */
    public final NavigationEventDispatcher getDispatcher() {
        return this.dispatcher;
    }

    public final void setDispatcher$navigationevent(NavigationEventDispatcher navigationEventDispatcher) {
        this.dispatcher = navigationEventDispatcher;
    }

    public final void doOnAdded$navigationevent(NavigationEventDispatcher p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        onAdded(p0);
    }

    public final void doOnRemoved$navigationevent() {
        onRemoved();
    }

    public final void doOnHasEnabledHandlersChanged$navigationevent(boolean p0) {
        onHasEnabledHandlersChanged(p0);
    }

    public final void doOnHistoryChanged$navigationevent(NavigationEventHistory p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        onHistoryChanged(p0);
    }

    protected final void dispatchOnBackStarted(NavigationEvent p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        NavigationEventDispatcher navigationEventDispatcher = this.dispatcher;
        if (navigationEventDispatcher == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.".toString());
        }
        if (this.isPredictiveBackInProgress) {
            return;
        }
        navigationEventDispatcher.dispatchOnStarted$navigationevent(this, -1, p0);
        this.isPredictiveBackInProgress = true;
    }

    protected final void dispatchOnBackProgressed(NavigationEvent p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        NavigationEventDispatcher navigationEventDispatcher = this.dispatcher;
        if (navigationEventDispatcher == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.".toString());
        }
        if (this.isPredictiveBackInProgress) {
            navigationEventDispatcher.dispatchOnProgressed$navigationevent(this, -1, p0);
        }
    }

    protected final void dispatchOnBackCancelled() {
        NavigationEventDispatcher navigationEventDispatcher = this.dispatcher;
        if (navigationEventDispatcher == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.".toString());
        }
        if (!this.isPredictiveBackInProgress) {
            navigationEventDispatcher.dispatchOnStarted$navigationevent(this, -1, null);
        }
        navigationEventDispatcher.dispatchOnCancelled$navigationevent(this, -1);
        this.isPredictiveBackInProgress = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void dispatchOnBackCompleted() {
        NavigationEventDispatcher navigationEventDispatcher = this.dispatcher;
        if (navigationEventDispatcher == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.".toString());
        }
        if (!this.isPredictiveBackInProgress) {
            navigationEventDispatcher.dispatchOnStarted$navigationevent(this, -1, null);
        }
        navigationEventDispatcher.dispatchOnCompleted$navigationevent(this, -1);
        this.isPredictiveBackInProgress = false;
    }

    protected final void dispatchOnForwardStarted(NavigationEvent p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        NavigationEventDispatcher navigationEventDispatcher = this.dispatcher;
        if (navigationEventDispatcher == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.".toString());
        }
        if (this.isPredictiveForwardInProgress) {
            return;
        }
        navigationEventDispatcher.dispatchOnStarted$navigationevent(this, 1, p0);
        this.isPredictiveForwardInProgress = true;
    }

    protected final void dispatchOnForwardProgressed(NavigationEvent p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        NavigationEventDispatcher navigationEventDispatcher = this.dispatcher;
        if (navigationEventDispatcher == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.".toString());
        }
        if (this.isPredictiveForwardInProgress) {
            navigationEventDispatcher.dispatchOnProgressed$navigationevent(this, 1, p0);
        }
    }

    protected final void dispatchOnForwardCancelled() {
        NavigationEventDispatcher navigationEventDispatcher = this.dispatcher;
        if (navigationEventDispatcher == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.".toString());
        }
        if (!this.isPredictiveForwardInProgress) {
            navigationEventDispatcher.dispatchOnStarted$navigationevent(this, 1, null);
        }
        navigationEventDispatcher.dispatchOnCancelled$navigationevent(this, 1);
        this.isPredictiveForwardInProgress = false;
    }

    protected final void dispatchOnForwardCompleted() {
        NavigationEventDispatcher navigationEventDispatcher = this.dispatcher;
        if (navigationEventDispatcher == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.".toString());
        }
        if (!this.isPredictiveForwardInProgress) {
            navigationEventDispatcher.dispatchOnStarted$navigationevent(this, 1, null);
        }
        navigationEventDispatcher.dispatchOnCompleted$navigationevent(this, 1);
        this.isPredictiveForwardInProgress = false;
    }

    protected void onAdded(NavigationEventDispatcher p0) {
        Intrinsics.checkNotNullParameter(p0, "");
    }

    protected void onHistoryChanged(NavigationEventHistory p0) {
        Intrinsics.checkNotNullParameter(p0, "");
    }
}
