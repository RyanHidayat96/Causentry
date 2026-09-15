package androidx.p005navigation.p008internal;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.p002lifecycle.Lifecycle;
import androidx.p002lifecycle.LifecycleRegistry;
import androidx.p002lifecycle.SavedStateHandle;
import androidx.p002lifecycle.SavedStateHandleSupport;
import androidx.p002lifecycle.SavedStateViewModelFactory;
import androidx.p002lifecycle.ViewModel;
import androidx.p002lifecycle.ViewModelProvider;
import androidx.p002lifecycle.ViewModelStore;
import androidx.p002lifecycle.viewmodel.CreationExtras;
import androidx.p002lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import androidx.p002lifecycle.viewmodel.MutableCreationExtras;
import androidx.p005navigation.NavBackStackEntry;
import androidx.p005navigation.NavDestination;
import androidx.p005navigation.NavViewModelStoreProvider;
import androidx.p013savedstate.SavedStateRegistry;
import androidx.p013savedstate.SavedStateRegistryController;
import androidx.p013savedstate.SavedStateWriter;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001:\u0001lB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\u00020\u00072\n\u0010\u0003\u001a\u00060\fj\u0002`\rH\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\"\u0010\u001d\u001a\u00020\u001c8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010#\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\"\u0010(\u001a\u00020'8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001c\u0010/\u001a\u0004\u0018\u00010.8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001a\u00103\u001a\u00020\u00108\u0001X\u0081\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u0010\u0012R\"\u00106\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b6\u0010$\u001a\u0004\b7\u0010&R\u001a\u00109\u001a\u0002088\u0001X\u0081\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\"\u0010>\u001a\u00020=8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u001b\u0010I\u001a\u00020D8AX\u0081\u0084\u0002¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u001c\u0010K\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010&R\u0014\u0010O\u001a\u00020L8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bM\u0010NR\u001a\u0010Q\u001a\u00020P8\u0001X\u0081\u0004¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR*\u0010U\u001a\u00020'2\u0006\u0010\u0003\u001a\u00020'8\u0001@AX\u0081\u000e¢\u0006\u0012\n\u0004\bU\u0010)\u001a\u0004\bV\u0010+\"\u0004\bW\u0010-R\u0014\u0010[\u001a\u00020X8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bY\u0010ZR\u001a\u0010]\u001a\u00020\\8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R\u0014\u0010d\u001a\u00020a8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bb\u0010cR\u0014\u0010h\u001a\u00020e8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bf\u0010gR\u001b\u0010k\u001a\u00020\\8CX\u0083\u0084\u0002¢\u0006\f\n\u0004\bi\u0010F\u001a\u0004\bj\u0010`"}, d2 = {"Landroidx/navigation/internal/NavBackStackEntryImpl;", "", "Landroidx/navigation/NavBackStackEntry;", "p0", "<init>", "(Landroidx/navigation/NavBackStackEntry;)V", "Landroidx/lifecycle/Lifecycle$Event;", "", "handleLifecycleEvent$navigation_common_release", "(Landroidx/lifecycle/Lifecycle$Event;)V", "updateState$navigation_common_release", "()V", "Landroid/os/Bundle;", "Landroidx/savedstate/b;", "saveState$navigation_common_release", "(Landroid/os/Bundle;)V", "", "toString", "()Ljava/lang/String;", "entry", "Landroidx/navigation/NavBackStackEntry;", "getEntry", "()Landroidx/navigation/NavBackStackEntry;", "Landroidx/navigation/internal/NavContext;", "context", "Landroidx/navigation/internal/NavContext;", "getContext$navigation_common_release", "()Landroidx/navigation/internal/NavContext;", "Landroidx/navigation/NavDestination;", FirebaseAnalytics.Param.DESTINATION, "Landroidx/navigation/NavDestination;", "getDestination$navigation_common_release", "()Landroidx/navigation/NavDestination;", "setDestination$navigation_common_release", "(Landroidx/navigation/NavDestination;)V", "immutableArgs", "Landroid/os/Bundle;", "getImmutableArgs$navigation_common_release", "()Landroid/os/Bundle;", "Landroidx/lifecycle/Lifecycle$State;", "hostLifecycleState", "Landroidx/lifecycle/Lifecycle$State;", "getHostLifecycleState$navigation_common_release", "()Landroidx/lifecycle/Lifecycle$State;", "setHostLifecycleState$navigation_common_release", "(Landroidx/lifecycle/Lifecycle$State;)V", "Landroidx/navigation/NavViewModelStoreProvider;", "viewModelStoreProvider", "Landroidx/navigation/NavViewModelStoreProvider;", "getViewModelStoreProvider$navigation_common_release", "()Landroidx/navigation/NavViewModelStoreProvider;", "id", "Ljava/lang/String;", "getId$navigation_common_release", "savedState", "getSavedState$navigation_common_release", "Landroidx/savedstate/SavedStateRegistryController;", "savedStateRegistryController", "Landroidx/savedstate/SavedStateRegistryController;", "getSavedStateRegistryController$navigation_common_release", "()Landroidx/savedstate/SavedStateRegistryController;", "", "savedStateRegistryAttached", "Z", "getSavedStateRegistryAttached$navigation_common_release", "()Z", "setSavedStateRegistryAttached$navigation_common_release", "(Z)V", "Landroidx/lifecycle/SavedStateViewModelFactory;", "defaultFactory$delegate", "Lkotlin/Lazy;", "getDefaultFactory$navigation_common_release", "()Landroidx/lifecycle/SavedStateViewModelFactory;", "defaultFactory", "getArguments$navigation_common_release", "arguments", "Landroidx/lifecycle/SavedStateHandle;", "getSavedStateHandle$navigation_common_release", "()Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "Landroidx/lifecycle/LifecycleRegistry;", "lifecycle", "Landroidx/lifecycle/LifecycleRegistry;", "getLifecycle$navigation_common_release", "()Landroidx/lifecycle/LifecycleRegistry;", "maxLifecycle", "getMaxLifecycle$navigation_common_release", "setMaxLifecycle$navigation_common_release", "Landroidx/lifecycle/ViewModelStore;", "getViewModelStore$navigation_common_release", "()Landroidx/lifecycle/ViewModelStore;", "viewModelStore", "Landroidx/lifecycle/ViewModelProvider$Factory;", "defaultViewModelProviderFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getDefaultViewModelProviderFactory$navigation_common_release", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "Landroidx/lifecycle/viewmodel/MutableCreationExtras;", "getDefaultViewModelCreationExtras$navigation_common_release", "()Landroidx/lifecycle/viewmodel/MutableCreationExtras;", "defaultViewModelCreationExtras", "Landroidx/savedstate/SavedStateRegistry;", "getSavedStateRegistry$navigation_common_release", "()Landroidx/savedstate/SavedStateRegistry;", "savedStateRegistry", "navResultSavedStateFactory$delegate", "getNavResultSavedStateFactory", "navResultSavedStateFactory", "SavedStateViewModel"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NavBackStackEntryImpl {
    private final NavContext context;

    /* JADX INFO: renamed from: defaultFactory$delegate, reason: from kotlin metadata */
    private final Lazy defaultFactory;
    private final ViewModelProvider.Factory defaultViewModelProviderFactory;
    private NavDestination destination;
    private final NavBackStackEntry entry;
    private Lifecycle.State hostLifecycleState;
    private final String id;
    private final Bundle immutableArgs;
    private final LifecycleRegistry lifecycle;
    private Lifecycle.State maxLifecycle;

    /* JADX INFO: renamed from: navResultSavedStateFactory$delegate, reason: from kotlin metadata */
    private final Lazy navResultSavedStateFactory;
    private final Bundle savedState;
    private boolean savedStateRegistryAttached;
    private final SavedStateRegistryController savedStateRegistryController;
    private final NavViewModelStoreProvider viewModelStoreProvider;

    public NavBackStackEntryImpl(NavBackStackEntry navBackStackEntry) {
        Intrinsics.checkNotNullParameter(navBackStackEntry, "");
        this.entry = navBackStackEntry;
        this.context = navBackStackEntry.getContext();
        this.destination = navBackStackEntry.getDestination();
        this.immutableArgs = navBackStackEntry.getImmutableArgs();
        this.hostLifecycleState = navBackStackEntry.getHostLifecycleState();
        this.viewModelStoreProvider = navBackStackEntry.getViewModelStoreProvider();
        this.id = navBackStackEntry.getId();
        this.savedState = navBackStackEntry.getSavedState();
        this.savedStateRegistryController = SavedStateRegistryController.INSTANCE.create(navBackStackEntry);
        this.defaultFactory = LazyKt.lazy(new Function0() { // from class: androidx.navigation.internal.NavBackStackEntryImpl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NavBackStackEntryImpl.defaultFactory_delegate$lambda$0();
            }
        });
        this.lifecycle = new LifecycleRegistry(navBackStackEntry);
        this.maxLifecycle = Lifecycle.State.INITIALIZED;
        this.defaultViewModelProviderFactory = getDefaultFactory$navigation_common_release();
        this.navResultSavedStateFactory = LazyKt.lazy(new Function0() { // from class: androidx.navigation.internal.NavBackStackEntryImpl$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NavBackStackEntryImpl.navResultSavedStateFactory_delegate$lambda$10();
            }
        });
    }

    public final NavBackStackEntry getEntry() {
        return this.entry;
    }

    /* JADX INFO: renamed from: getContext$navigation_common_release, reason: from getter */
    public final NavContext getContext() {
        return this.context;
    }

    /* JADX INFO: renamed from: getDestination$navigation_common_release, reason: from getter */
    public final NavDestination getDestination() {
        return this.destination;
    }

    public final void setDestination$navigation_common_release(NavDestination navDestination) {
        Intrinsics.checkNotNullParameter(navDestination, "");
        this.destination = navDestination;
    }

    /* JADX INFO: renamed from: getImmutableArgs$navigation_common_release, reason: from getter */
    public final Bundle getImmutableArgs() {
        return this.immutableArgs;
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

    /* JADX INFO: renamed from: getId$navigation_common_release, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: getSavedState$navigation_common_release, reason: from getter */
    public final Bundle getSavedState() {
        return this.savedState;
    }

    /* JADX INFO: renamed from: getSavedStateRegistryController$navigation_common_release, reason: from getter */
    public final SavedStateRegistryController getSavedStateRegistryController() {
        return this.savedStateRegistryController;
    }

    /* JADX INFO: renamed from: getSavedStateRegistryAttached$navigation_common_release, reason: from getter */
    public final boolean getSavedStateRegistryAttached() {
        return this.savedStateRegistryAttached;
    }

    public final void setSavedStateRegistryAttached$navigation_common_release(boolean z) {
        this.savedStateRegistryAttached = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SavedStateViewModelFactory defaultFactory_delegate$lambda$0() {
        return new SavedStateViewModelFactory();
    }

    public final SavedStateViewModelFactory getDefaultFactory$navigation_common_release() {
        return (SavedStateViewModelFactory) this.defaultFactory.getValue();
    }

    public final Bundle getArguments$navigation_common_release() {
        Pair[] pairArr;
        if (this.immutableArgs == null) {
            return null;
        }
        Map mapEmptyMap = MapsKt.emptyMap();
        if (mapEmptyMap.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(mapEmptyMap.size());
            for (Map.Entry entry : mapEmptyMap.entrySet()) {
                arrayList.add(TuplesKt.to((String) entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleBundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        SavedStateWriter.m7458putAllimpl(SavedStateWriter.m7454constructorimpl(bundleBundleOf), this.immutableArgs);
        return bundleBundleOf;
    }

    public final SavedStateHandle getSavedStateHandle$navigation_common_release() {
        if (!this.savedStateRegistryAttached) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).".toString());
        }
        if (this.lifecycle.getState() == Lifecycle.State.DESTROYED) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.".toString());
        }
        return ((SavedStateViewModel) ViewModelProvider.Companion.create$default(ViewModelProvider.INSTANCE, this.entry, getNavResultSavedStateFactory(), (CreationExtras) null, 4, (Object) null).get(Reflection.getOrCreateKotlinClass(SavedStateViewModel.class))).getHandle();
    }

    /* JADX INFO: renamed from: getLifecycle$navigation_common_release, reason: from getter */
    public final LifecycleRegistry getLifecycle() {
        return this.lifecycle;
    }

    /* JADX INFO: renamed from: getMaxLifecycle$navigation_common_release, reason: from getter */
    public final Lifecycle.State getMaxLifecycle() {
        return this.maxLifecycle;
    }

    public final void setMaxLifecycle$navigation_common_release(Lifecycle.State state) {
        Intrinsics.checkNotNullParameter(state, "");
        this.maxLifecycle = state;
        updateState$navigation_common_release();
    }

    public final void handleLifecycleEvent$navigation_common_release(Lifecycle.Event p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        this.entry.setHostLifecycleState$navigation_common_release(p0.getTargetState());
        this.hostLifecycleState = p0.getTargetState();
        updateState$navigation_common_release();
    }

    public final void updateState$navigation_common_release() {
        if (!this.savedStateRegistryAttached) {
            this.savedStateRegistryController.performAttach();
            this.savedStateRegistryAttached = true;
            if (this.viewModelStoreProvider != null) {
                SavedStateHandleSupport.enableSavedStateHandles(this.entry);
            }
            this.savedStateRegistryController.performRestore(this.savedState);
        }
        if (this.hostLifecycleState.ordinal() < this.maxLifecycle.ordinal()) {
            this.lifecycle.setCurrentState(this.hostLifecycleState);
        } else {
            this.lifecycle.setCurrentState(this.maxLifecycle);
        }
    }

    public final ViewModelStore getViewModelStore$navigation_common_release() {
        if (!this.savedStateRegistryAttached) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).".toString());
        }
        if (this.lifecycle.getState() == Lifecycle.State.DESTROYED) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.".toString());
        }
        NavViewModelStoreProvider navViewModelStoreProvider = this.viewModelStoreProvider;
        if (navViewModelStoreProvider == null) {
            throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.".toString());
        }
        return navViewModelStoreProvider.getViewModelStore(this.id);
    }

    /* JADX INFO: renamed from: getDefaultViewModelProviderFactory$navigation_common_release, reason: from getter */
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return this.defaultViewModelProviderFactory;
    }

    public final MutableCreationExtras getDefaultViewModelCreationExtras$navigation_common_release() {
        MutableCreationExtras mutableCreationExtras = new MutableCreationExtras(null, 1, null);
        mutableCreationExtras.set(SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY, this.entry);
        mutableCreationExtras.set(SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY, this.entry);
        Bundle arguments$navigation_common_release = getArguments$navigation_common_release();
        if (arguments$navigation_common_release != null) {
            mutableCreationExtras.set(SavedStateHandleSupport.DEFAULT_ARGS_KEY, arguments$navigation_common_release);
        }
        return mutableCreationExtras;
    }

    public final SavedStateRegistry getSavedStateRegistry$navigation_common_release() {
        return this.savedStateRegistryController.getSavedStateRegistry();
    }

    public final void saveState$navigation_common_release(Bundle p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        this.savedStateRegistryController.performSave(p0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Reflection.getOrCreateKotlinClass(this.entry.getClass()).getSimpleName());
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append(this.id);
        sb2.append(')');
        sb.append(sb2.toString());
        sb.append(" destination=");
        sb.append(this.destination);
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    private final ViewModelProvider.Factory getNavResultSavedStateFactory() {
        return (ViewModelProvider.Factory) this.navResultSavedStateFactory.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SavedStateViewModel navResultSavedStateFactory_delegate$lambda$10$lambda$9$lambda$8(CreationExtras creationExtras) {
        Intrinsics.checkNotNullParameter(creationExtras, "");
        return new SavedStateViewModel(SavedStateHandleSupport.createSavedStateHandle(creationExtras));
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Landroidx/navigation/internal/NavBackStackEntryImpl$SavedStateViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/SavedStateHandle;", "p0", "<init>", "(Landroidx/lifecycle/SavedStateHandle;)V", "handle", "Landroidx/lifecycle/SavedStateHandle;", "getHandle", "()Landroidx/lifecycle/SavedStateHandle;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class SavedStateViewModel extends ViewModel {
        private final SavedStateHandle handle;

        public SavedStateViewModel(SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(savedStateHandle, "");
            this.handle = savedStateHandle;
        }

        public final SavedStateHandle getHandle() {
            return this.handle;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewModelProvider.Factory navResultSavedStateFactory_delegate$lambda$10() {
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        initializerViewModelFactoryBuilder.addInitializer(Reflection.getOrCreateKotlinClass(SavedStateViewModel.class), new Function1() { // from class: androidx.navigation.internal.NavBackStackEntryImpl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NavBackStackEntryImpl.navResultSavedStateFactory_delegate$lambda$10$lambda$9$lambda$8((CreationExtras) obj);
            }
        });
        return initializerViewModelFactoryBuilder.build();
    }
}
