package androidx.view.compose.internal;

import androidx.p010navigationevent.NavigationEventDispatcher;
import androidx.view.OnBackPressedDispatcher;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b\f\u0010\u000bR\u0016\u0010\r\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/activity/compose/internal/BackHandlerDispatcherCompat;", "", "Landroidx/navigationevent/NavigationEventDispatcher;", "p0", "Landroidx/activity/OnBackPressedDispatcher;", "p1", "<init>", "(Landroidx/navigationevent/NavigationEventDispatcher;Landroidx/activity/OnBackPressedDispatcher;)V", "Landroidx/activity/compose/internal/BackHandlerCompat;", "", "addHandler", "(Landroidx/activity/compose/internal/BackHandlerCompat;)V", "removeHandler", "navigationEventDispatcher", "Landroidx/navigationevent/NavigationEventDispatcher;", "onBackPressedDispatcher", "Landroidx/activity/OnBackPressedDispatcher;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BackHandlerDispatcherCompat {
    public static final int $stable = 8;
    private final NavigationEventDispatcher navigationEventDispatcher;
    private final OnBackPressedDispatcher onBackPressedDispatcher;

    public BackHandlerDispatcherCompat(NavigationEventDispatcher navigationEventDispatcher, OnBackPressedDispatcher onBackPressedDispatcher) {
        this.navigationEventDispatcher = navigationEventDispatcher;
        this.onBackPressedDispatcher = onBackPressedDispatcher;
        if ((navigationEventDispatcher == null ? onBackPressedDispatcher : navigationEventDispatcher) == null) {
            throw new IllegalArgumentException("At least one dispatcher (NavigationEventDispatcher or OnBackPressedDispatcher) must be non-null.".toString());
        }
    }

    public final void addHandler(BackHandlerCompat p0) {
        NavigationEventDispatcher navigationEventDispatcher = this.navigationEventDispatcher;
        if (navigationEventDispatcher != null) {
            NavigationEventDispatcher.addHandler$default(navigationEventDispatcher, p0.getNavigationEventHandler(), 0, 2, null);
            return;
        }
        OnBackPressedDispatcher onBackPressedDispatcher = this.onBackPressedDispatcher;
        if (onBackPressedDispatcher != null) {
            onBackPressedDispatcher.addCallback(p0.getOnBackPressedCallback());
            return;
        }
        throw new IllegalStateException("Unreachable".toString());
    }

    public final void removeHandler(BackHandlerCompat p0) throws Exception {
        if (this.navigationEventDispatcher != null) {
            p0.getNavigationEventHandler().remove();
        } else {
            if (this.onBackPressedDispatcher == null) {
                throw new IllegalStateException("Unreachable".toString());
            }
            p0.getOnBackPressedCallback().remove();
        }
    }
}
