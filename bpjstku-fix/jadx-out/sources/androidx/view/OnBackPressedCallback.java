package androidx.view;

import androidx.p010navigationevent.NavigationEvent;
import androidx.p010navigationevent.NavigationEventHandler;
import androidx.p010navigationevent.NavigationEventInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001:\u0001\"B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\tH\u0017¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\tH\u0017¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\u0006H'¢\u0006\u0004\b\r\u0010\bJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u000e\u0010\bJ\u001b\u0010\u0011\u001a\u00020\u00062\n\u0010\u0003\u001a\u00060\u000fj\u0002`\u0010H\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0013\u001a\u00020\u00062\n\u0010\u0003\u001a\u00060\u000fj\u0002`\u0010H\u0000¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u00188\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR*\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d\"\u0004\b\u001e\u0010\u0005R\u001e\u0010 \u001a\f\u0012\b\u0012\u00060\u000fj\u0002`\u00100\u001f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010!"}, d2 = {"Landroidx/activity/OnBackPressedCallback;", "", "", "p0", "<init>", "(Z)V", "", "remove", "()V", "Landroidx/activity/BackEventCompat;", "handleOnBackStarted", "(Landroidx/activity/BackEventCompat;)V", "handleOnBackProgressed", "handleOnBackPressed", "handleOnBackCancelled", "Ljava/lang/AutoCloseable;", "Lkotlin/jdk7/TuitionPaymentFragmentbindingInflater1;", "addCloseable$activity", "(Ljava/lang/AutoCloseable;)V", "removeCloseable$activity", "Landroidx/navigationevent/NavigationEventInfo;", "Landroidx/activity/OnBackPressedCallback$OnBackPressedEventHandler;", "createNavigationEventHandler$activity", "(Landroidx/navigationevent/NavigationEventInfo;)Landroidx/activity/OnBackPressedCallback$OnBackPressedEventHandler;", "", "eventHandlers", "Ljava/util/List;", "isEnabled", "Z", "()Z", "setEnabled", "Ljava/util/concurrent/CopyOnWriteArrayList;", "closeables", "Ljava/util/concurrent/CopyOnWriteArrayList;", "OnBackPressedEventHandler"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class OnBackPressedCallback {
    private boolean isEnabled;
    private final List<OnBackPressedEventHandler> eventHandlers = new ArrayList();
    private final CopyOnWriteArrayList<AutoCloseable> closeables = new CopyOnWriteArrayList<>();

    public void handleOnBackCancelled() {
    }

    public abstract void handleOnBackPressed();

    public void handleOnBackProgressed(BackEventCompat p0) {
        Intrinsics.checkNotNullParameter(p0, "backEvent");
    }

    public void handleOnBackStarted(BackEventCompat p0) {
        Intrinsics.checkNotNullParameter(p0, "backEvent");
    }

    public OnBackPressedCallback(boolean z) {
        this.isEnabled = z;
    }

    /* JADX INFO: renamed from: isEnabled, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    public final void setEnabled(boolean z) {
        this.isEnabled = z;
        for (OnBackPressedEventHandler onBackPressedEventHandler : this.eventHandlers) {
            onBackPressedEventHandler.setBackEnabled(onBackPressedEventHandler.getIsLifecycleActive() && z);
        }
    }

    public final void remove() throws Exception {
        Iterator<AutoCloseable> it = this.closeables.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().close();
        }
        this.closeables.clear();
        Iterator<OnBackPressedEventHandler> it2 = this.eventHandlers.iterator();
        while (it2.hasNext()) {
            it2.next().remove();
        }
        this.eventHandlers.clear();
    }

    public final void addCloseable$activity(AutoCloseable p0) {
        Intrinsics.checkNotNullParameter(p0, "closeable");
        this.closeables.add(p0);
    }

    public final void removeCloseable$activity(AutoCloseable p0) {
        Intrinsics.checkNotNullParameter(p0, "closeable");
        this.closeables.remove(p0);
    }

    public final OnBackPressedEventHandler createNavigationEventHandler$activity(NavigationEventInfo p0) {
        Intrinsics.checkNotNullParameter(p0, "info");
        OnBackPressedEventHandler onBackPressedEventHandler = new OnBackPressedEventHandler(this, p0);
        this.eventHandlers.add(onBackPressedEventHandler);
        return onBackPressedEventHandler;
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\bH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\bH\u0014¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\tH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R*\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u00128\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015\"\u0004\b\u0016\u0010\u0017"}, d2 = {"Landroidx/activity/OnBackPressedCallback$OnBackPressedEventHandler;", "Landroidx/navigationevent/NavigationEventHandler;", "Landroidx/navigationevent/NavigationEventInfo;", "Landroidx/activity/OnBackPressedCallback;", "p0", "p1", "<init>", "(Landroidx/activity/OnBackPressedCallback;Landroidx/navigationevent/NavigationEventInfo;)V", "Landroidx/navigationevent/NavigationEvent;", "", "onBackStarted", "(Landroidx/navigationevent/NavigationEvent;)V", "onBackProgressed", "onBackCompleted", "()V", "onBackCancelled", "onBackPressedCallback", "Landroidx/activity/OnBackPressedCallback;", "", "isLifecycleActive", "Z", "()Z", "setLifecycleActive", "(Z)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnBackPressedEventHandler extends NavigationEventHandler<NavigationEventInfo> {
        private boolean isLifecycleActive;
        private final OnBackPressedCallback onBackPressedCallback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnBackPressedEventHandler(OnBackPressedCallback onBackPressedCallback, NavigationEventInfo navigationEventInfo) {
            super(navigationEventInfo, onBackPressedCallback.getIsEnabled());
            Intrinsics.checkNotNullParameter(onBackPressedCallback, "");
            Intrinsics.checkNotNullParameter(navigationEventInfo, "");
            this.onBackPressedCallback = onBackPressedCallback;
            this.isLifecycleActive = true;
        }

        /* JADX INFO: renamed from: isLifecycleActive, reason: from getter */
        public final boolean getIsLifecycleActive() {
            return this.isLifecycleActive;
        }

        public final void setLifecycleActive(boolean z) {
            this.isLifecycleActive = z;
            setBackEnabled(z && this.onBackPressedCallback.getIsEnabled());
        }

        @Override // androidx.p010navigationevent.NavigationEventHandler
        public final void onBackStarted(NavigationEvent p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.onBackPressedCallback.handleOnBackStarted(new BackEventCompat(p0));
        }

        @Override // androidx.p010navigationevent.NavigationEventHandler
        public final void onBackProgressed(NavigationEvent p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.onBackPressedCallback.handleOnBackProgressed(new BackEventCompat(p0));
        }

        @Override // androidx.p010navigationevent.NavigationEventHandler
        public final void onBackCompleted() {
            this.onBackPressedCallback.handleOnBackPressed();
        }

        @Override // androidx.p010navigationevent.NavigationEventHandler
        public final void onBackCancelled() {
            this.onBackPressedCallback.handleOnBackCancelled();
        }
    }
}
