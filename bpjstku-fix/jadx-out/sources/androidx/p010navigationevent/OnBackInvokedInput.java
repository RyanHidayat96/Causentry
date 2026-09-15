package androidx.p010navigationevent;

import android.os.Build;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b7\u0018\u00002\u00020\u0001B\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u000f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019\u0082\u0001\u0002\u001a\u001b"}, d2 = {"Landroidx/navigationevent/OnBackInvokedInput;", "Landroidx/navigationevent/NavigationEventInput;", "Landroid/window/OnBackInvokedDispatcher;", "p0", "", "p1", "<init>", "(Landroid/window/OnBackInvokedDispatcher;I)V", "", "onRemoved", "()V", "", "onHasEnabledHandlersChanged", "(Z)V", "updateBackInvokedCallbackState", "Landroid/window/OnBackInvokedCallback;", "createOnBackAnimationCallback", "()Landroid/window/OnBackInvokedCallback;", "onBackInvokedDispatcher", "Landroid/window/OnBackInvokedDispatcher;", "onBackInvokedCallbackPriority", "I", "onBackInvokedCallback", "Landroid/window/OnBackInvokedCallback;", "backInvokedCallbackRegistered", "Z", "Landroidx/navigationevent/OnBackInvokedDefaultInput;", "Landroidx/navigationevent/OnBackInvokedOverlayInput;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class OnBackInvokedInput extends NavigationEventInput {
    private boolean backInvokedCallbackRegistered;
    private final OnBackInvokedCallback onBackInvokedCallback;
    private final int onBackInvokedCallbackPriority;
    private final OnBackInvokedDispatcher onBackInvokedDispatcher;

    private OnBackInvokedInput(OnBackInvokedDispatcher onBackInvokedDispatcher, int i) {
        OnBackInvokedCallback onBackInvokedCallbackCreateOnBackAnimationCallback;
        this.onBackInvokedDispatcher = onBackInvokedDispatcher;
        this.onBackInvokedCallbackPriority = i;
        if (Build.VERSION.SDK_INT == 33) {
            onBackInvokedCallbackCreateOnBackAnimationCallback = new OnBackInvokedCallback() { // from class: androidx.navigationevent.OnBackInvokedInput$$ExternalSyntheticLambda0
                @Override // android.window.OnBackInvokedCallback
                public final void onBackInvoked() {
                    this.f$0.dispatchOnBackCompleted();
                }
            };
        } else {
            onBackInvokedCallbackCreateOnBackAnimationCallback = createOnBackAnimationCallback();
        }
        this.onBackInvokedCallback = onBackInvokedCallbackCreateOnBackAnimationCallback;
    }

    @Override // androidx.p010navigationevent.NavigationEventInput
    protected void onRemoved() {
        updateBackInvokedCallbackState(false);
    }

    @Override // androidx.p010navigationevent.NavigationEventInput
    protected void onHasEnabledHandlersChanged(boolean p0) {
        updateBackInvokedCallbackState(p0);
    }

    private final void updateBackInvokedCallbackState(boolean p0) {
        if (p0 && !this.backInvokedCallbackRegistered) {
            this.onBackInvokedDispatcher.registerOnBackInvokedCallback(this.onBackInvokedCallbackPriority, this.onBackInvokedCallback);
            this.backInvokedCallbackRegistered = true;
        } else {
            if (p0 || !this.backInvokedCallbackRegistered) {
                return;
            }
            this.onBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.onBackInvokedCallback);
            this.backInvokedCallbackRegistered = false;
        }
    }

    private final OnBackInvokedCallback createOnBackAnimationCallback() {
        return new OnBackAnimationCallback() { // from class: androidx.navigationevent.OnBackInvokedInput.createOnBackAnimationCallback.1
            @Override // android.window.OnBackAnimationCallback
            public final void onBackStarted(BackEvent p0) {
                Intrinsics.checkNotNullParameter(p0, "");
                OnBackInvokedInput.this.dispatchOnBackStarted(BackEvent.NavigationEvent(p0));
            }

            @Override // android.window.OnBackAnimationCallback
            public final void onBackProgressed(BackEvent p0) {
                Intrinsics.checkNotNullParameter(p0, "");
                OnBackInvokedInput.this.dispatchOnBackProgressed(BackEvent.NavigationEvent(p0));
            }

            @Override // android.window.OnBackInvokedCallback
            public final void onBackInvoked() {
                OnBackInvokedInput.this.dispatchOnBackCompleted();
            }

            @Override // android.window.OnBackAnimationCallback
            public final void onBackCancelled() {
                OnBackInvokedInput.this.dispatchOnBackCancelled();
            }
        };
    }

    public /* synthetic */ OnBackInvokedInput(OnBackInvokedDispatcher onBackInvokedDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(onBackInvokedDispatcher, i);
    }
}
