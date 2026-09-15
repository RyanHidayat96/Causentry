package androidx.p010navigationevent;

import defpackage.stopMediaCodec;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 >2\u00020\u0001:\u0002?>B\u001d\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0000¢\u0006\u0004\b\u0005\u0010\tJ%\u0010\r\u001a\u00020\f2\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\n2\b\b\u0002\u0010\u0004\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u000f\u001a\u00020\f2\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\nH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0012\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0015\u0010\u0013J)\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u001a\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u001b\u0010\u0014J\u001f\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u001c\u0010\u0014J\u000f\u0010\u001d\u001a\u00020\fH\u0007¢\u0006\u0004\b\u001d\u0010\u0007J\u000f\u0010\u001e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001e\u0010\u0007R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001c\u0010$\u001a\u00020#8C@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&R*\u0010'\u001a\u00020#2\u0006\u0010\u0002\u001a\u00020#8G@GX\u0087\u000e¢\u0006\u0012\n\u0004\b'\u0010%\u001a\u0004\b'\u0010&\"\u0004\b(\u0010)R\u001a\u0010+\u001a\u00020*8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R \u00100\u001a\b\u0012\u0004\u0012\u00020\u00000/8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001e\u00104\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0/8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b4\u00101R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\u00110/8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b5\u00101R\u0017\u0010:\u001a\b\u0012\u0004\u0012\u000207068G¢\u0006\u0006\u001a\u0004\b8\u00109R\u0017\u0010=\u001a\b\u0012\u0004\u0012\u00020;068G¢\u0006\u0006\u001a\u0004\b<\u00109"}, d2 = {"Landroidx/navigationevent/NavigationEventDispatcher;", "", "p0", "Landroidx/navigationevent/OnBackCompletedFallback;", "p1", "<init>", "(Landroidx/navigationevent/NavigationEventDispatcher;Landroidx/navigationevent/OnBackCompletedFallback;)V", "()V", "(Landroidx/navigationevent/OnBackCompletedFallback;)V", "(Landroidx/navigationevent/NavigationEventDispatcher;)V", "Landroidx/navigationevent/NavigationEventHandler;", "", "", "addHandler", "(Landroidx/navigationevent/NavigationEventHandler;I)V", "removeHandler$navigationevent", "(Landroidx/navigationevent/NavigationEventHandler;)V", "Landroidx/navigationevent/NavigationEventInput;", "addInput", "(Landroidx/navigationevent/NavigationEventInput;)V", "(Landroidx/navigationevent/NavigationEventInput;I)V", "removeInput", "Landroidx/navigationevent/NavigationEvent;", "p2", "dispatchOnStarted$navigationevent", "(Landroidx/navigationevent/NavigationEventInput;ILandroidx/navigationevent/NavigationEvent;)V", "dispatchOnProgressed$navigationevent", "dispatchOnCompleted$navigationevent", "dispatchOnCancelled$navigationevent", "dispose", "checkInvariants", "parent", "Landroidx/navigationevent/NavigationEventDispatcher;", "onBackCompletedFallback", "Landroidx/navigationevent/OnBackCompletedFallback;", "", "isDisposed", "Z", "()Z", "isEnabled", "setEnabled", "(Z)V", "Landroidx/navigationevent/NavigationEventProcessor;", "sharedProcessor", "Landroidx/navigationevent/NavigationEventProcessor;", "getSharedProcessor$navigationevent", "()Landroidx/navigationevent/NavigationEventProcessor;", "", "childDispatchers", "Ljava/util/Set;", "getChildDispatchers$navigationevent", "()Ljava/util/Set;", "handlers", "inputs", "LstopMediaCodec;", "Landroidx/navigationevent/NavigationEventTransitionState;", "getTransitionState", "()LstopMediaCodec;", "transitionState", "Landroidx/navigationevent/NavigationEventHistory;", "getHistory", "history", "Companion", "Priority"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NavigationEventDispatcher {
    public static final int PRIORITY_DEFAULT = 1;
    public static final int PRIORITY_OVERLAY = 0;
    private final Set<NavigationEventDispatcher> childDispatchers;
    private final Set<NavigationEventHandler<?>> handlers;
    private final Set<NavigationEventInput> inputs;
    private boolean isDisposed;
    private boolean isEnabled;
    private final OnBackCompletedFallback onBackCompletedFallback;
    private NavigationEventDispatcher parent;
    private final NavigationEventProcessor sharedProcessor;

    /* JADX INFO: loaded from: classes4.dex */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0010\u001b\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000"}, d2 = {"Landroidx/navigationevent/NavigationEventDispatcher$Priority;", ""}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface Priority {
    }

    private NavigationEventDispatcher(NavigationEventDispatcher navigationEventDispatcher, OnBackCompletedFallback onBackCompletedFallback) {
        NavigationEventProcessor navigationEventProcessor;
        this.parent = navigationEventDispatcher;
        this.onBackCompletedFallback = onBackCompletedFallback;
        this.isEnabled = true;
        this.sharedProcessor = (navigationEventDispatcher == null || (navigationEventProcessor = navigationEventDispatcher.sharedProcessor) == null) ? new NavigationEventProcessor() : navigationEventProcessor;
        this.childDispatchers = new LinkedHashSet();
        this.handlers = new LinkedHashSet();
        this.inputs = new LinkedHashSet();
        NavigationEventDispatcher navigationEventDispatcher2 = this.parent;
        if (navigationEventDispatcher2 != null) {
            navigationEventDispatcher2.childDispatchers.add(this);
        }
    }

    public NavigationEventDispatcher() {
        this(null, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavigationEventDispatcher(OnBackCompletedFallback onBackCompletedFallback) {
        this(null, onBackCompletedFallback);
        Intrinsics.checkNotNullParameter(onBackCompletedFallback, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavigationEventDispatcher(NavigationEventDispatcher navigationEventDispatcher) {
        this(navigationEventDispatcher, null);
        Intrinsics.checkNotNullParameter(navigationEventDispatcher, "");
    }

    private final boolean isDisposed() {
        NavigationEventDispatcher navigationEventDispatcher = this.parent;
        if (navigationEventDispatcher == null || !navigationEventDispatcher.isDisposed()) {
            return this.isDisposed;
        }
        return true;
    }

    public final boolean isEnabled() {
        NavigationEventDispatcher navigationEventDispatcher = this.parent;
        if (navigationEventDispatcher == null || navigationEventDispatcher.isEnabled()) {
            return this.isEnabled;
        }
        return false;
    }

    public final void setEnabled(boolean z) {
        checkInvariants();
        if (this.isEnabled == z) {
            return;
        }
        this.isEnabled = z;
        this.sharedProcessor.refreshEnabledHandlers();
    }

    /* JADX INFO: renamed from: getSharedProcessor$navigationevent, reason: from getter */
    public final NavigationEventProcessor getSharedProcessor() {
        return this.sharedProcessor;
    }

    public final Set<NavigationEventDispatcher> getChildDispatchers$navigationevent() {
        return this.childDispatchers;
    }

    public final stopMediaCodec<NavigationEventTransitionState> getTransitionState() {
        return this.sharedProcessor.getTransitionState();
    }

    public final stopMediaCodec<NavigationEventHistory> getHistory() {
        return this.sharedProcessor.getHistory();
    }

    public static /* synthetic */ void addHandler$default(NavigationEventDispatcher navigationEventDispatcher, NavigationEventHandler navigationEventHandler, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 1;
        }
        navigationEventDispatcher.addHandler(navigationEventHandler, i);
    }

    public final void addHandler(NavigationEventHandler<?> p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        checkInvariants();
        if (this.handlers.add(p0)) {
            this.sharedProcessor.addHandler(this, p0, p1);
        }
    }

    public final void removeHandler$navigationevent(NavigationEventHandler<?> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        if (this.handlers.remove(p0)) {
            this.sharedProcessor.removeHandler(p0);
        }
    }

    public final void addInput(NavigationEventInput p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        checkInvariants();
        if (this.inputs.add(p0)) {
            this.sharedProcessor.addInput(this, p0, -1);
        }
    }

    public final void addInput(NavigationEventInput p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        checkInvariants();
        if (p1 != 1 && p1 != 0) {
            throw new IllegalArgumentException("Unsupported priority value: ".concat(String.valueOf(p1)).toString());
        }
        if (this.inputs.add(p0)) {
            this.sharedProcessor.addInput(this, p0, p1);
        }
    }

    public final void removeInput(NavigationEventInput p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        checkInvariants();
        if (this.inputs.remove(p0)) {
            this.sharedProcessor.removeInput(p0);
        }
    }

    public final void dispatchOnStarted$navigationevent(NavigationEventInput p0, int p1, NavigationEvent p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        checkInvariants();
        if (isEnabled()) {
            this.sharedProcessor.dispatchOnStarted(p0, p1, p2);
        }
    }

    public final void dispatchOnProgressed$navigationevent(NavigationEventInput p0, int p1, NavigationEvent p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p2, "");
        checkInvariants();
        if (isEnabled()) {
            this.sharedProcessor.dispatchOnProgressed(p0, p1, p2);
        }
    }

    public final void dispatchOnCompleted$navigationevent(NavigationEventInput p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        checkInvariants();
        if (isEnabled()) {
            this.sharedProcessor.dispatchOnCompleted(p0, p1, this.onBackCompletedFallback);
        }
    }

    public final void dispatchOnCancelled$navigationevent(NavigationEventInput p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        checkInvariants();
        if (isEnabled()) {
            this.sharedProcessor.dispatchOnCancelled(p0, p1);
        }
    }

    public final void dispose() {
        Set<NavigationEventDispatcher> set;
        checkInvariants();
        this.isDisposed = true;
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayDeque arrayDeque2 = arrayDeque;
        arrayDeque2.add(this);
        while (!arrayDeque2.isEmpty()) {
            NavigationEventDispatcher navigationEventDispatcher = (NavigationEventDispatcher) arrayDeque.removeFirst();
            navigationEventDispatcher.isDisposed = true;
            CollectionsKt.addAll(arrayDeque2, navigationEventDispatcher.childDispatchers);
            Iterator<NavigationEventInput> it = navigationEventDispatcher.inputs.iterator();
            while (it.hasNext()) {
                this.sharedProcessor.removeInput(it.next());
            }
            navigationEventDispatcher.inputs.clear();
            Iterator<NavigationEventHandler<?>> it2 = navigationEventDispatcher.handlers.iterator();
            while (it2.hasNext()) {
                it2.next().remove();
            }
            navigationEventDispatcher.handlers.clear();
            navigationEventDispatcher.childDispatchers.clear();
            NavigationEventDispatcher navigationEventDispatcher2 = navigationEventDispatcher.parent;
            if (navigationEventDispatcher2 != null && (set = navigationEventDispatcher2.childDispatchers) != null) {
                set.remove(navigationEventDispatcher);
            }
            navigationEventDispatcher.parent = null;
        }
    }

    private final void checkInvariants() {
        if (isDisposed()) {
            throw new IllegalStateException("This NavigationEventDispatcher has already been disposed and cannot be used.".toString());
        }
    }

    public final void addHandler(NavigationEventHandler<?> navigationEventHandler) {
        Intrinsics.checkNotNullParameter(navigationEventHandler, "");
        addHandler$default(this, navigationEventHandler, 0, 2, null);
    }
}
