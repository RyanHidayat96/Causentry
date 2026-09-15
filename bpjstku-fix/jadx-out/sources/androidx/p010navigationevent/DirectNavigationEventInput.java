package androidx.p010navigationevent;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\u0003J\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\bJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000f\u0010\u0003"}, d2 = {"Landroidx/navigationevent/DirectNavigationEventInput;", "Landroidx/navigationevent/NavigationEventInput;", "<init>", "()V", "Landroidx/navigationevent/NavigationEvent;", "p0", "", "backStarted", "(Landroidx/navigationevent/NavigationEvent;)V", "backProgressed", "backCancelled", "backCompleted", "forwardStarted", "forwardProgressed", "forwardCancelled", "forwardCompleted"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DirectNavigationEventInput extends NavigationEventInput {
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

    public final void forwardStarted(NavigationEvent p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        dispatchOnForwardStarted(p0);
    }

    public final void forwardProgressed(NavigationEvent p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        dispatchOnForwardProgressed(p0);
    }

    public final void forwardCancelled() {
        dispatchOnForwardCancelled();
    }

    public final void forwardCompleted() {
        dispatchOnForwardCompleted();
    }
}
