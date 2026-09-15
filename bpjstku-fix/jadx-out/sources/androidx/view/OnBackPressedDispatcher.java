package androidx.view;

import android.window.OnBackInvokedDispatcher;
import androidx.core.util.Consumer;
import androidx.p002lifecycle.Lifecycle;
import androidx.p002lifecycle.LifecycleEventObserver;
import androidx.p002lifecycle.LifecycleObserver;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p010navigationevent.NavigationEvent;
import androidx.p010navigationevent.NavigationEventDispatcher;
import androidx.p010navigationevent.NavigationEventInput;
import androidx.p010navigationevent.OnBackCompletedFallback;
import androidx.p010navigationevent.OnBackInvokedDefaultInput;
import androidx.p010navigationevent.OnBackInvokedOverlayInput;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001+B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB\u0015\b\u0017\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u001b\u0010\u001aR\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0013\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010 R\u001f\u0010&\u001a\u00060!R\u00020\u00008CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher;", "", "Ljava/lang/Runnable;", "p0", "Landroidx/core/util/Consumer;", "", "p1", "<init>", "(Ljava/lang/Runnable;Landroidx/core/util/Consumer;)V", "(Ljava/lang/Runnable;)V", "Landroid/window/OnBackInvokedDispatcher;", "", "setOnBackInvokedDispatcher", "(Landroid/window/OnBackInvokedDispatcher;)V", "Landroidx/activity/OnBackPressedCallback;", "addCallback", "(Landroidx/activity/OnBackPressedCallback;)V", "Landroidx/lifecycle/LifecycleOwner;", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/activity/OnBackPressedCallback;)V", "hasEnabledCallbacks", "()Z", "Landroidx/activity/BackEventCompat;", "dispatchOnBackStarted", "(Landroidx/activity/BackEventCompat;)V", "dispatchOnBackProgressed", "onBackPressed", "()V", "dispatchOnBackCancelled", "fallbackOnBackPressed", "Ljava/lang/Runnable;", "onHasEnabledCallbacksChanged", "Landroidx/core/util/Consumer;", "Z", "Landroidx/activity/OnBackPressedDispatcher$OnBackPressedEventInput;", "eventInput$delegate", "Lkotlin/Lazy;", "getEventInput", "()Landroidx/activity/OnBackPressedDispatcher$OnBackPressedEventInput;", "eventInput", "Landroidx/navigationevent/NavigationEventDispatcher;", "getEventDispatcher$activity", "()Landroidx/navigationevent/NavigationEventDispatcher;", "eventDispatcher", "OnBackPressedEventInput"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OnBackPressedDispatcher {

    /* JADX INFO: renamed from: eventInput$delegate, reason: from kotlin metadata */
    private final Lazy eventInput;
    private final Runnable fallbackOnBackPressed;
    private boolean hasEnabledCallbacks;
    private final Consumer<Boolean> onHasEnabledCallbacksChanged;

    public OnBackPressedDispatcher(Runnable runnable, Consumer<Boolean> consumer) {
        this.fallbackOnBackPressed = runnable;
        this.onHasEnabledCallbacksChanged = consumer;
        this.eventInput = LazyKt.lazy(new Function0() { // from class: androidx.activity.OnBackPressedDispatcher$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OnBackPressedDispatcher.eventInput_delegate$lambda$0(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OnBackPressedEventInput eventInput_delegate$lambda$0(OnBackPressedDispatcher onBackPressedDispatcher) {
        return onBackPressedDispatcher.new OnBackPressedEventInput();
    }

    private final OnBackPressedEventInput getEventInput() {
        return (OnBackPressedEventInput) this.eventInput.getValue();
    }

    public final NavigationEventDispatcher getEventDispatcher$activity() {
        return getEventInput().getDispatcher();
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this(runnable, null);
    }

    public /* synthetic */ OnBackPressedDispatcher(Runnable runnable, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : runnable);
    }

    public final void setOnBackInvokedDispatcher(OnBackInvokedDispatcher p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        getEventDispatcher$activity().addInput(new OnBackInvokedDefaultInput(p0), 1);
        getEventDispatcher$activity().addInput(new OnBackInvokedOverlayInput(p0), 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void addCallback(OnBackPressedCallback p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        NavigationEventDispatcher.addHandler$default(getEventDispatcher$activity(), p0.createNavigationEventHandler$activity(new OnBackPressedCallbackInfo(p0, null, 2, 0 == true ? 1 : 0)), 0, 2, null);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [androidx.activity.OnBackPressedDispatcher$addCallback$observer$1] */
    public final void addCallback(LifecycleOwner p0, OnBackPressedCallback p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        final Lifecycle lifecycle = p0.getLifecycle();
        if (lifecycle.getState() == Lifecycle.State.DESTROYED) {
            return;
        }
        final OnBackPressedCallback.OnBackPressedEventHandler onBackPressedEventHandlerCreateNavigationEventHandler$activity = p1.createNavigationEventHandler$activity(new OnBackPressedCallbackInfo(p1, p0));
        if (ActivityFlags.isOnBackPressedLifecycleOrderMaintained) {
            onBackPressedEventHandlerCreateNavigationEventHandler$activity.setLifecycleActive(false);
            NavigationEventDispatcher.addHandler$default(getEventDispatcher$activity(), onBackPressedEventHandlerCreateNavigationEventHandler$activity, 0, 2, null);
        }
        final ?? r1 = new LifecycleEventObserver() { // from class: androidx.activity.OnBackPressedDispatcher$addCallback$observer$1

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[Lifecycle.Event.values().length];
                    try {
                        iArr[Lifecycle.Event.ON_START.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[Lifecycle.Event.ON_STOP.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // androidx.p002lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner p2, Lifecycle.Event p3) {
                Intrinsics.checkNotNullParameter(p2, "");
                Intrinsics.checkNotNullParameter(p3, "");
                int i = WhenMappings.$EnumSwitchMapping$0[p3.ordinal()];
                if (i == 1) {
                    if (ActivityFlags.isOnBackPressedLifecycleOrderMaintained) {
                        onBackPressedEventHandlerCreateNavigationEventHandler$activity.setLifecycleActive(true);
                        return;
                    } else {
                        NavigationEventDispatcher.addHandler$default(this.getEventDispatcher$activity(), onBackPressedEventHandlerCreateNavigationEventHandler$activity, 0, 2, null);
                        return;
                    }
                }
                if (i != 2) {
                    if (i != 3) {
                        return;
                    }
                    onBackPressedEventHandlerCreateNavigationEventHandler$activity.remove();
                    lifecycle.removeObserver(this);
                    return;
                }
                if (ActivityFlags.isOnBackPressedLifecycleOrderMaintained) {
                    onBackPressedEventHandlerCreateNavigationEventHandler$activity.setLifecycleActive(false);
                } else {
                    onBackPressedEventHandlerCreateNavigationEventHandler$activity.remove();
                }
            }
        };
        lifecycle.addObserver((LifecycleObserver) r1);
        p1.addCloseable$activity(new AutoCloseable() { // from class: androidx.activity.OnBackPressedDispatcher$$ExternalSyntheticLambda1
            @Override // java.lang.AutoCloseable
            public final void close() {
                OnBackPressedDispatcher.addCallback$lambda$0(lifecycle, r1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addCallback$lambda$0(Lifecycle lifecycle, OnBackPressedDispatcher$addCallback$observer$1 onBackPressedDispatcher$addCallback$observer$1) {
        lifecycle.removeObserver(onBackPressedDispatcher$addCallback$observer$1);
    }

    /* JADX INFO: renamed from: hasEnabledCallbacks, reason: from getter */
    public final boolean getHasEnabledCallbacks() {
        return this.hasEnabledCallbacks;
    }

    public final void dispatchOnBackStarted(BackEventCompat p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        getEventInput().backStarted(p0.toNavigationEvent());
    }

    public final void dispatchOnBackProgressed(BackEventCompat p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        getEventInput().backProgressed(p0.toNavigationEvent());
    }

    public final void onBackPressed() {
        getEventInput().backCompleted();
    }

    public final void dispatchOnBackCancelled() {
        getEventInput().backCancelled();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OnBackPressedDispatcher() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bJ\r\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher$OnBackPressedEventInput;", "Landroidx/navigationevent/NavigationEventInput;", "<init>", "(Landroidx/activity/OnBackPressedDispatcher;)V", "", "p0", "", "onHasEnabledHandlersChanged", "(Z)V", "Landroidx/navigationevent/NavigationEvent;", "backStarted", "(Landroidx/navigationevent/NavigationEvent;)V", "backProgressed", "backCancelled", "()V", "backCompleted", "Landroidx/navigationevent/NavigationEventDispatcher;", "dispatcher", "Landroidx/navigationevent/NavigationEventDispatcher;", "getDispatcher", "()Landroidx/navigationevent/NavigationEventDispatcher;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    final class OnBackPressedEventInput extends NavigationEventInput {
        private final NavigationEventDispatcher dispatcher;

        public OnBackPressedEventInput() {
            NavigationEventDispatcher navigationEventDispatcher = new NavigationEventDispatcher(new OnBackCompletedFallback() { // from class: androidx.activity.OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0
                @Override // androidx.p010navigationevent.OnBackCompletedFallback
                public final void onBackCompletedFallback() {
                    OnBackPressedDispatcher.OnBackPressedEventInput.dispatcher$lambda$0(onBackPressedDispatcher);
                }
            });
            navigationEventDispatcher.addInput(this);
            this.dispatcher = navigationEventDispatcher;
        }

        public final NavigationEventDispatcher getDispatcher() {
            return this.dispatcher;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void dispatcher$lambda$0(OnBackPressedDispatcher onBackPressedDispatcher) {
            Runnable runnable = onBackPressedDispatcher.fallbackOnBackPressed;
            if (runnable != null) {
                runnable.run();
            }
        }

        @Override // androidx.p010navigationevent.NavigationEventInput
        public final void onHasEnabledHandlersChanged(boolean p0) {
            OnBackPressedDispatcher.this.hasEnabledCallbacks = p0;
            Consumer consumer = OnBackPressedDispatcher.this.onHasEnabledCallbacksChanged;
            if (consumer != null) {
                consumer.accept(Boolean.valueOf(p0));
            }
        }

        public final void backStarted(NavigationEvent p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            dispatchOnBackStarted(p0);
        }

        public final void backProgressed(NavigationEvent p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            dispatchOnBackProgressed(p0);
        }

        public final void backCancelled() {
            dispatchOnBackCancelled();
        }

        public final void backCompleted() {
            dispatchOnBackCompleted();
        }
    }
}
