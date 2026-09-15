package androidx.p005navigation;

import android.app.Application;
import android.os.Bundle;
import androidx.p002lifecycle.HasDefaultViewModelProviderFactory;
import androidx.p002lifecycle.Lifecycle;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.SavedStateHandle;
import androidx.p002lifecycle.ViewModelProvider;
import androidx.p002lifecycle.ViewModelStore;
import androidx.p002lifecycle.ViewModelStoreOwner;
import androidx.p002lifecycle.viewmodel.CreationExtras;
import androidx.p002lifecycle.viewmodel.MutableCreationExtras;
import androidx.p005navigation.p008internal.NavBackStackEntryImpl;
import androidx.p005navigation.p008internal.NavContext;
import androidx.p013savedstate.SavedStateRegistry;
import androidx.p013savedstate.SavedStateRegistryOwner;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 l2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001lB_\b\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n¢\u0006\u0004\b\u0013\u0010\u0014B#\b\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0000\u0012\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n¢\u0006\u0004\b\u0013\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0006\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001c\u001a\u00020\u00172\n\u0010\u0006\u001a\u00060\tj\u0002`\nH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u001eH\u0096\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0010H\u0017¢\u0006\u0004\b%\u0010&R\u001c\u0010'\u001a\u0004\u0018\u00010\u00058\u0001X\u0081\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R*\u0010+\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00101\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\"\u00105\u001a\u00020\f8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001c\u0010;\u001a\u0004\u0018\u00010\u000e8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001a\u0010?\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010&R\"\u0010B\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n8\u0001X\u0081\u0004¢\u0006\f\n\u0004\bB\u00102\u001a\u0004\bC\u00104R\u0014\u0010E\u001a\u00020D8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bE\u0010FR#\u0010J\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n8GX\u0086\u0084\u0002¢\u0006\f\u001a\u0004\bG\u00104*\u0004\bH\u0010IR\u001b\u0010P\u001a\u00020K8GX\u0087\u0084\u0002¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u001b\u0010U\u001a\u00020Q8WX\u0096\u0084\u0002¢\u0006\f\u001a\u0004\bR\u0010S*\u0004\bT\u0010IR$\u0010X\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bV\u00108\"\u0004\bW\u0010:R\u001b\u0010]\u001a\u00020Y8WX\u0096\u0084\u0002¢\u0006\f\u001a\u0004\bZ\u0010[*\u0004\b\\\u0010IR\u001b\u0010b\u001a\u00020^8WX\u0096\u0084\u0002¢\u0006\f\u001a\u0004\b_\u0010`*\u0004\ba\u0010IR\u0014\u0010f\u001a\u00020c8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bd\u0010eR\u001b\u0010k\u001a\u00020g8WX\u0096\u0084\u0002¢\u0006\f\u001a\u0004\bh\u0010i*\u0004\bj\u0010I"}, d2 = {"Landroidx/navigation/NavBackStackEntry;", "Landroidx/lifecycle/LifecycleOwner;", "Landroidx/lifecycle/ViewModelStoreOwner;", "Landroidx/lifecycle/HasDefaultViewModelProviderFactory;", "Landroidx/savedstate/SavedStateRegistryOwner;", "Landroidx/navigation/internal/NavContext;", "p0", "Landroidx/navigation/NavDestination;", "p1", "Landroid/os/Bundle;", "Landroidx/savedstate/b;", "p2", "Landroidx/lifecycle/Lifecycle$State;", "p3", "Landroidx/navigation/NavViewModelStoreProvider;", "p4", "", "p5", "p6", "<init>", "(Landroidx/navigation/internal/NavContext;Landroidx/navigation/NavDestination;Landroid/os/Bundle;Landroidx/lifecycle/Lifecycle$State;Landroidx/navigation/NavViewModelStoreProvider;Ljava/lang/String;Landroid/os/Bundle;)V", "(Landroidx/navigation/NavBackStackEntry;Landroid/os/Bundle;)V", "Landroidx/lifecycle/Lifecycle$Event;", "", "handleLifecycleEvent", "(Landroidx/lifecycle/Lifecycle$Event;)V", "updateState", "()V", "saveState", "(Landroid/os/Bundle;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "context", "Landroidx/navigation/internal/NavContext;", "getContext$navigation_common_release", "()Landroidx/navigation/internal/NavContext;", FirebaseAnalytics.Param.DESTINATION, "Landroidx/navigation/NavDestination;", "getDestination", "()Landroidx/navigation/NavDestination;", "setDestination", "(Landroidx/navigation/NavDestination;)V", "immutableArgs", "Landroid/os/Bundle;", "getImmutableArgs$navigation_common_release", "()Landroid/os/Bundle;", "hostLifecycleState", "Landroidx/lifecycle/Lifecycle$State;", "getHostLifecycleState$navigation_common_release", "()Landroidx/lifecycle/Lifecycle$State;", "setHostLifecycleState$navigation_common_release", "(Landroidx/lifecycle/Lifecycle$State;)V", "viewModelStoreProvider", "Landroidx/navigation/NavViewModelStoreProvider;", "getViewModelStoreProvider$navigation_common_release", "()Landroidx/navigation/NavViewModelStoreProvider;", "id", "Ljava/lang/String;", "getId", "savedState", "getSavedState$navigation_common_release", "Landroidx/navigation/internal/NavBackStackEntryImpl;", "impl", "Landroidx/navigation/internal/NavBackStackEntryImpl;", "getArguments", "getArguments$delegate", "(Landroidx/navigation/NavBackStackEntry;)Ljava/lang/Object;", "arguments", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle$delegate", "Lkotlin/Lazy;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "getLifecycle$delegate", "lifecycle", "getMaxLifecycle", "setMaxLifecycle", "maxLifecycle", "Landroidx/lifecycle/ViewModelStore;", "getViewModelStore", "()Landroidx/lifecycle/ViewModelStore;", "getViewModelStore$delegate", "viewModelStore", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getDefaultViewModelProviderFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "getDefaultViewModelProviderFactory$delegate", "defaultViewModelProviderFactory", "Landroidx/lifecycle/viewmodel/CreationExtras;", "getDefaultViewModelCreationExtras", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "defaultViewModelCreationExtras", "Landroidx/savedstate/SavedStateRegistry;", "getSavedStateRegistry", "()Landroidx/savedstate/SavedStateRegistry;", "getSavedStateRegistry$delegate", "savedStateRegistry", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NavBackStackEntry implements LifecycleOwner, ViewModelStoreOwner, HasDefaultViewModelProviderFactory, SavedStateRegistryOwner {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final NavContext context;
    private NavDestination destination;
    private Lifecycle.State hostLifecycleState;
    private final String id;
    private final Bundle immutableArgs;
    private final NavBackStackEntryImpl impl;
    private final Bundle savedState;

    /* JADX INFO: renamed from: savedStateHandle$delegate, reason: from kotlin metadata */
    private final Lazy savedStateHandle;
    private final NavViewModelStoreProvider viewModelStoreProvider;

    private NavBackStackEntry(NavContext navContext, NavDestination navDestination, Bundle bundle, Lifecycle.State state, NavViewModelStoreProvider navViewModelStoreProvider, String str, Bundle bundle2) {
        this.context = navContext;
        this.destination = navDestination;
        this.immutableArgs = bundle;
        this.hostLifecycleState = state;
        this.viewModelStoreProvider = navViewModelStoreProvider;
        this.id = str;
        this.savedState = bundle2;
        this.impl = new NavBackStackEntryImpl(this);
        this.savedStateHandle = LazyKt.lazy(new Function0() { // from class: androidx.navigation.NavBackStackEntry$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NavBackStackEntry.savedStateHandle_delegate$lambda$0(this.f$0);
            }
        });
    }

    /* JADX INFO: renamed from: getContext$navigation_common_release, reason: from getter */
    public final NavContext getContext() {
        return this.context;
    }

    public final NavDestination getDestination() {
        return this.destination;
    }

    public final void setDestination(NavDestination navDestination) {
        Intrinsics.checkNotNullParameter(navDestination, "");
        this.destination = navDestination;
    }

    /* JADX INFO: renamed from: getImmutableArgs$navigation_common_release, reason: from getter */
    public final Bundle getImmutableArgs() {
        return this.immutableArgs;
    }

    /* synthetic */ NavBackStackEntry(NavContext navContext, NavDestination navDestination, Bundle bundle, Lifecycle.State state, NavViewModelStoreProvider navViewModelStoreProvider, String str, Bundle bundle2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(navContext, navDestination, (i & 4) != 0 ? null : bundle, (i & 8) != 0 ? Lifecycle.State.CREATED : state, (i & 16) != 0 ? null : navViewModelStoreProvider, (i & 32) != 0 ? INSTANCE.randomUUID$navigation_common_release() : str, (i & 64) != 0 ? null : bundle2);
    }

    /* JADX INFO: renamed from: getHostLifecycleState$navigation_common_release, reason: from getter */
    public final Lifecycle.State getHostLifecycleState() {
        return this.hostLifecycleState;
    }

    public final void setHostLifecycleState$navigation_common_release(Lifecycle.State state) {
        Intrinsics.checkNotNullParameter(state, "");
        this.hostLifecycleState = state;
    }

    /* JADX INFO: renamed from: getViewModelStoreProvider$navigation_common_release, reason: from getter */
    public final NavViewModelStoreProvider getViewModelStoreProvider() {
        return this.viewModelStoreProvider;
    }

    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: getSavedState$navigation_common_release, reason: from getter */
    public final Bundle getSavedState() {
        return this.savedState;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavBackStackEntry(NavBackStackEntry navBackStackEntry, Bundle bundle) {
        this(navBackStackEntry.context, navBackStackEntry.destination, bundle, navBackStackEntry.hostLifecycleState, navBackStackEntry.viewModelStoreProvider, navBackStackEntry.id, navBackStackEntry.savedState);
        Intrinsics.checkNotNullParameter(navBackStackEntry, "");
        this.impl.setHostLifecycleState$navigation_common_release(navBackStackEntry.hostLifecycleState);
        this.impl.setMaxLifecycle$navigation_common_release(navBackStackEntry.getMaxLifecycle());
    }

    public /* synthetic */ NavBackStackEntry(NavBackStackEntry navBackStackEntry, Bundle bundle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(navBackStackEntry, (i & 2) != 0 ? navBackStackEntry.getArguments() : bundle);
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Je\u0010\u0013\u001a\u00020\u00122\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0010\b\u0002\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u0010\b\u0002\u0010\u0011\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\tH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0015\u0010\u0016"}, d2 = {"Landroidx/navigation/NavBackStackEntry$Companion;", "", "<init>", "()V", "Landroidx/navigation/internal/NavContext;", "p0", "Landroidx/navigation/NavDestination;", "p1", "Landroid/os/Bundle;", "Landroidx/savedstate/b;", "p2", "Landroidx/lifecycle/Lifecycle$State;", "p3", "Landroidx/navigation/NavViewModelStoreProvider;", "p4", "", "p5", "p6", "Landroidx/navigation/NavBackStackEntry;", "create", "(Landroidx/navigation/internal/NavContext;Landroidx/navigation/NavDestination;Landroid/os/Bundle;Landroidx/lifecycle/Lifecycle$State;Landroidx/navigation/NavViewModelStoreProvider;Ljava/lang/String;Landroid/os/Bundle;)Landroidx/navigation/NavBackStackEntry;", "randomUUID$navigation_common_release", "()Ljava/lang/String;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final NavBackStackEntry create(NavContext p0, NavDestination p1, Bundle p2, Lifecycle.State p3, NavViewModelStoreProvider p4, String p5, Bundle p6) {
            Intrinsics.checkNotNullParameter(p1, "");
            Intrinsics.checkNotNullParameter(p3, "");
            Intrinsics.checkNotNullParameter(p5, "");
            return new NavBackStackEntry(p0, p1, p2, p3, p4, p5, p6, null);
        }

        public final String randomUUID$navigation_common_release() {
            String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            return string;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final Bundle getArguments() {
        return this.impl.getArguments$navigation_common_release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SavedStateHandle savedStateHandle_delegate$lambda$0(NavBackStackEntry navBackStackEntry) {
        return navBackStackEntry.impl.getSavedStateHandle$navigation_common_release();
    }

    public final SavedStateHandle getSavedStateHandle() {
        return (SavedStateHandle) this.savedStateHandle.getValue();
    }

    @Override // androidx.p002lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.impl.getLifecycle();
    }

    public final Lifecycle.State getMaxLifecycle() {
        return this.impl.getMaxLifecycle();
    }

    public final void setMaxLifecycle(Lifecycle.State state) {
        Intrinsics.checkNotNullParameter(state, "");
        this.impl.setMaxLifecycle$navigation_common_release(state);
    }

    public final void handleLifecycleEvent(Lifecycle.Event p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        this.impl.handleLifecycleEvent$navigation_common_release(p0);
    }

    public final void updateState() {
        this.impl.updateState$navigation_common_release();
    }

    @Override // androidx.p002lifecycle.ViewModelStoreOwner
    public final ViewModelStore getViewModelStore() {
        return this.impl.getViewModelStore$navigation_common_release();
    }

    @Override // androidx.p002lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return this.impl.getDefaultViewModelProviderFactory();
    }

    @Override // androidx.p002lifecycle.HasDefaultViewModelProviderFactory
    public final CreationExtras getDefaultViewModelCreationExtras() {
        MutableCreationExtras defaultViewModelCreationExtras$navigation_common_release = this.impl.getDefaultViewModelCreationExtras$navigation_common_release();
        NavContext navContext = this.context;
        Object application = navContext != null ? navContext.getApplication() : null;
        Application application2 = application instanceof Application ? (Application) application : null;
        if (application2 != null) {
            defaultViewModelCreationExtras$navigation_common_release.set(ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY, application2);
        }
        return defaultViewModelCreationExtras$navigation_common_release;
    }

    @Override // androidx.p013savedstate.SavedStateRegistryOwner
    public final SavedStateRegistry getSavedStateRegistry() {
        return this.impl.getSavedStateRegistry$navigation_common_release();
    }

    public final void saveState(Bundle p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        this.impl.saveState$navigation_common_release(p0);
    }

    public final boolean equals(Object p0) {
        Set<String> setKeySet;
        if (p0 == null || !(p0 instanceof NavBackStackEntry)) {
            return false;
        }
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) p0;
        if (!Intrinsics.areEqual(this.id, navBackStackEntry.id) || !Intrinsics.areEqual(this.destination, navBackStackEntry.destination) || !Intrinsics.areEqual(getLifecycle(), navBackStackEntry.getLifecycle()) || !Intrinsics.areEqual(getSavedStateRegistry(), navBackStackEntry.getSavedStateRegistry())) {
            return false;
        }
        if (Intrinsics.areEqual(this.immutableArgs, navBackStackEntry.immutableArgs)) {
            return true;
        }
        Bundle bundle = this.immutableArgs;
        if (bundle == null || (setKeySet = bundle.keySet()) == null) {
            return false;
        }
        Set<String> set = setKeySet;
        if ((set instanceof Collection) && set.isEmpty()) {
            return true;
        }
        for (String str : set) {
            Object obj = this.immutableArgs.get(str);
            Bundle bundle2 = navBackStackEntry.immutableArgs;
            if (!Intrinsics.areEqual(obj, bundle2 != null ? bundle2.get(str) : null)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        Set<String> setKeySet;
        int iHashCode = (this.id.hashCode() * 31) + this.destination.hashCode();
        Bundle bundle = this.immutableArgs;
        if (bundle != null && (setKeySet = bundle.keySet()) != null) {
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                Object obj = this.immutableArgs.get((String) it.next());
                iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
            }
        }
        return (((iHashCode * 31) + getLifecycle().hashCode()) * 31) + getSavedStateRegistry().hashCode();
    }

    public final String toString() {
        return this.impl.toString();
    }

    public /* synthetic */ NavBackStackEntry(NavContext navContext, NavDestination navDestination, Bundle bundle, Lifecycle.State state, NavViewModelStoreProvider navViewModelStoreProvider, String str, Bundle bundle2, DefaultConstructorMarker defaultConstructorMarker) {
        this(navContext, navDestination, bundle, state, navViewModelStoreProvider, str, bundle2);
    }
}
