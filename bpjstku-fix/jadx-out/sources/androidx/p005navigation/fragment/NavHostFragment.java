package androidx.p005navigation.fragment;

import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.core.os.BundleKt;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.ViewModelStore;
import androidx.p005navigation.NavController;
import androidx.p005navigation.NavHost;
import androidx.p005navigation.NavHostController;
import androidx.p005navigation.Navigation;
import androidx.p005navigation.Navigator;
import androidx.p005navigation.NavigatorProvider;
import androidx.p005navigation.R;
import androidx.p013savedstate.SavedStateRegistry;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0017\u0018\u0000 82\u00020\u00012\u00020\u0002:\u00018B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\nH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\rH\u0015¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0010H\u0015¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013H\u0015¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0006\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u001b2\b\u0010\u0019\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ)\u0010!\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020 2\b\u0010\u001a\u001a\u0004\u0018\u00010\nH\u0017¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\nH\u0017¢\u0006\u0004\b#\u0010\fJ\u000f\u0010$\u001a\u00020\u0007H\u0016¢\u0006\u0004\b$\u0010\u0004R\u001b\u0010)\u001a\u00020\r8AX\u0081\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0018\u0010*\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010-\u001a\u00020,8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00100\u001a\u00020/8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0011\u00104\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b2\u00103R\u0014\u00107\u001a\u00020,8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b5\u00106"}, d2 = {"Landroidx/navigation/fragment/NavHostFragment;", "Landroidx/fragment/app/Fragment;", "Landroidx/navigation/NavHost;", "<init>", "()V", "Landroid/content/Context;", "p0", "", "onAttach", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "onCreate", "(Landroid/os/Bundle;)V", "Landroidx/navigation/NavHostController;", "onCreateNavHostController", "(Landroidx/navigation/NavHostController;)V", "Landroidx/navigation/NavController;", "onCreateNavController", "(Landroidx/navigation/NavController;)V", "Landroidx/navigation/Navigator;", "Landroidx/navigation/fragment/FragmentNavigator$Destination;", "createFragmentNavigator", "()Landroidx/navigation/Navigator;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "p1", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/util/AttributeSet;", "onInflate", "(Landroid/content/Context;Landroid/util/AttributeSet;Landroid/os/Bundle;)V", "onSaveInstanceState", "onDestroyView", "navHostController$delegate", "Lkotlin/Lazy;", "getNavHostController$navigation_fragment_release", "()Landroidx/navigation/NavHostController;", "navHostController", "viewParent", "Landroid/view/View;", "", "graphId", "I", "", "defaultNavHost", "Z", "getNavController", "()Landroidx/navigation/NavController;", "navController", "getContainerId", "()I", "containerId", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class NavHostFragment extends Fragment implements NavHost {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String KEY_DEFAULT_NAV_HOST = "android-support-nav:fragment:defaultHost";
    public static final String KEY_GRAPH_ID = "android-support-nav:fragment:graphId";
    private static final String KEY_NAV_CONTROLLER_STATE = "android-support-nav:fragment:navControllerState";
    public static final String KEY_START_DESTINATION_ARGS = "android-support-nav:fragment:startDestinationArgs";
    private boolean defaultNavHost;
    private int graphId;

    /* JADX INFO: renamed from: navHostController$delegate, reason: from kotlin metadata */
    private final Lazy navHostController = LazyKt.lazy(new Function0() { // from class: androidx.navigation.fragment.NavHostFragment$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return NavHostFragment.navHostController_delegate$lambda$6(this.f$0);
        }
    });
    private View viewParent;

    public final NavHostController getNavHostController$navigation_fragment_release() {
        return (NavHostController) this.navHostController.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NavHostController navHostController_delegate$lambda$6(final NavHostFragment navHostFragment) {
        Context context = navHostFragment.getContext();
        if (context == null) {
            throw new IllegalStateException("NavController cannot be created before the fragment is attached".toString());
        }
        final NavHostController navHostController = new NavHostController(context);
        navHostController.setLifecycleOwner(navHostFragment);
        ViewModelStore viewModelStore = navHostFragment.getViewModelStore();
        Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
        navHostController.setViewModelStore(viewModelStore);
        navHostFragment.onCreateNavHostController(navHostController);
        Bundle bundleConsumeRestoredStateForKey = navHostFragment.getSavedStateRegistry().consumeRestoredStateForKey(KEY_NAV_CONTROLLER_STATE);
        if (bundleConsumeRestoredStateForKey != null) {
            navHostController.restoreState(bundleConsumeRestoredStateForKey);
        }
        navHostFragment.getSavedStateRegistry().registerSavedStateProvider(KEY_NAV_CONTROLLER_STATE, new SavedStateRegistry.SavedStateProvider() { // from class: androidx.navigation.fragment.NavHostFragment$$ExternalSyntheticLambda1
            @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
            public final Bundle saveState() {
                return NavHostFragment.navHostController_delegate$lambda$6$lambda$5$lambda$2(navHostController);
            }
        });
        Bundle bundleConsumeRestoredStateForKey2 = navHostFragment.getSavedStateRegistry().consumeRestoredStateForKey(KEY_GRAPH_ID);
        if (bundleConsumeRestoredStateForKey2 != null) {
            navHostFragment.graphId = bundleConsumeRestoredStateForKey2.getInt(KEY_GRAPH_ID);
        }
        navHostFragment.getSavedStateRegistry().registerSavedStateProvider(KEY_GRAPH_ID, new SavedStateRegistry.SavedStateProvider() { // from class: androidx.navigation.fragment.NavHostFragment$$ExternalSyntheticLambda2
            @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
            public final Bundle saveState() {
                return NavHostFragment.navHostController_delegate$lambda$6$lambda$5$lambda$4(this.f$0);
            }
        });
        int i = navHostFragment.graphId;
        if (i != 0) {
            navHostController.setGraph(i);
            return navHostController;
        }
        Bundle arguments = navHostFragment.getArguments();
        int i2 = arguments != null ? arguments.getInt(KEY_GRAPH_ID) : 0;
        Bundle bundle = arguments != null ? arguments.getBundle(KEY_START_DESTINATION_ARGS) : null;
        if (i2 != 0) {
            navHostController.setGraph(i2, bundle);
        }
        return navHostController;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle navHostController_delegate$lambda$6$lambda$5$lambda$2(NavHostController navHostController) {
        Bundle bundleSaveState = navHostController.saveState();
        if (bundleSaveState != null) {
            return bundleSaveState;
        }
        Bundle bundle = Bundle.EMPTY;
        Intrinsics.checkNotNullExpressionValue(bundle, "");
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle navHostController_delegate$lambda$6$lambda$5$lambda$4(NavHostFragment navHostFragment) {
        int i = navHostFragment.graphId;
        if (i != 0) {
            return BundleKt.bundleOf(TuplesKt.to(KEY_GRAPH_ID, Integer.valueOf(i)));
        }
        Bundle bundle = Bundle.EMPTY;
        Intrinsics.checkNotNull(bundle);
        return bundle;
    }

    @Override // androidx.p005navigation.NavHost
    public final NavController getNavController() {
        return getNavHostController$navigation_fragment_release();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        super.onAttach(p0);
        if (this.defaultNavHost) {
            getParentFragmentManager().beginTransaction().setPrimaryNavigationFragment(this).commit();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle p0) {
        getNavHostController$navigation_fragment_release();
        if (p0 != null && p0.getBoolean(KEY_DEFAULT_NAV_HOST, false)) {
            this.defaultNavHost = true;
            getParentFragmentManager().beginTransaction().setPrimaryNavigationFragment(this).commit();
        }
        super.onCreate(p0);
    }

    protected void onCreateNavHostController(NavHostController p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        onCreateNavController(p0);
    }

    @Deprecated(message = "Override {@link #onCreateNavHostController(NavHostController)} to gain\n      access to the full {@link NavHostController} that is created by this NavHostFragment.")
    protected void onCreateNavController(NavController p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        NavigatorProvider navigatorProvider = p0.getNavigatorProvider();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        navigatorProvider.addNavigator(new DialogFragmentNavigator(contextRequireContext, childFragmentManager));
        p0.getNavigatorProvider().addNavigator(createFragmentNavigator());
    }

    @Deprecated(message = "Use {@link #onCreateNavController(NavController)}")
    protected Navigator<? extends FragmentNavigator.Destination> createFragmentNavigator() {
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        return new FragmentNavigator(contextRequireContext, childFragmentManager, getContainerId());
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        Context context = p0.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
        fragmentContainerView.setId(getContainerId());
        return fragmentContainerView;
    }

    private final int getContainerId() {
        int id2 = getId();
        return (id2 == 0 || id2 == -1) ? R.id.nav_host_fragment_container : id2;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View p0, Bundle p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        super.onViewCreated(p0, p1);
        if (!(p0 instanceof ViewGroup)) {
            StringBuilder sb = new StringBuilder("created host view ");
            sb.append(p0);
            sb.append(" is not a ViewGroup");
            throw new IllegalStateException(sb.toString().toString());
        }
        Navigation.setViewNavController(p0, getNavHostController$navigation_fragment_release());
        ViewGroup viewGroup = (ViewGroup) p0;
        if (viewGroup.getParent() != null) {
            Object parent = viewGroup.getParent();
            Intrinsics.checkNotNull(parent, "");
            View view = (View) parent;
            this.viewParent = view;
            Intrinsics.checkNotNull(view);
            if (view.getId() == getId()) {
                View view2 = this.viewParent;
                Intrinsics.checkNotNull(view2);
                Navigation.setViewNavController(view2, getNavHostController$navigation_fragment_release());
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onInflate(Context p0, AttributeSet p1, Bundle p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        super.onInflate(p0, p1, p2);
        TypedArray typedArrayObtainStyledAttributes = p0.obtainStyledAttributes(p1, R.styleable.NavHost);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.NavHost_navGraph, 0);
        if (resourceId != 0) {
            this.graphId = resourceId;
        }
        Unit unit = Unit.INSTANCE;
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = p0.obtainStyledAttributes(p1, R.styleable.NavHostFragment);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes2, "");
        if (typedArrayObtainStyledAttributes2.getBoolean(R.styleable.NavHostFragment_defaultNavHost, false)) {
            this.defaultNavHost = true;
        }
        Unit unit2 = Unit.INSTANCE;
        typedArrayObtainStyledAttributes2.recycle();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        super.onSaveInstanceState(p0);
        if (this.defaultNavHost) {
            p0.putBoolean(KEY_DEFAULT_NAV_HOST, true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        View view = this.viewParent;
        if (view != null && Navigation.findNavController(view) == getNavHostController$navigation_fragment_release()) {
            Navigation.setViewNavController(view, null);
        }
        this.viewParent = null;
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u000f8\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000f8\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011"}, d2 = {"Landroidx/navigation/fragment/NavHostFragment$Companion;", "", "<init>", "()V", "Landroidx/fragment/app/Fragment;", "p0", "Landroidx/navigation/NavController;", "findNavController", "(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;", "", "Landroid/os/Bundle;", "p1", "Landroidx/navigation/fragment/NavHostFragment;", "create", "(ILandroid/os/Bundle;)Landroidx/navigation/fragment/NavHostFragment;", "", "KEY_GRAPH_ID", "Ljava/lang/String;", "KEY_START_DESTINATION_ARGS", "KEY_NAV_CONTROLLER_STATE", "KEY_DEFAULT_NAV_HOST"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public final NavController findNavController(Fragment p0) {
            Dialog dialog;
            Window window;
            Intrinsics.checkNotNullParameter(p0, "");
            for (Fragment parentFragment = p0; parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
                if (parentFragment instanceof NavHostFragment) {
                    return ((NavHostFragment) parentFragment).getNavHostController$navigation_fragment_release();
                }
                Fragment primaryNavigationFragment = parentFragment.getParentFragmentManager().getPrimaryNavigationFragment();
                if (primaryNavigationFragment instanceof NavHostFragment) {
                    return ((NavHostFragment) primaryNavigationFragment).getNavHostController$navigation_fragment_release();
                }
            }
            View view = p0.getView();
            if (view != null) {
                return Navigation.findNavController(view);
            }
            View decorView = null;
            DialogFragment dialogFragment = p0 instanceof DialogFragment ? (DialogFragment) p0 : null;
            if (dialogFragment != null && (dialog = dialogFragment.getDialog()) != null && (window = dialog.getWindow()) != null) {
                decorView = window.getDecorView();
            }
            if (decorView != null) {
                return Navigation.findNavController(decorView);
            }
            StringBuilder sb = new StringBuilder("Fragment ");
            sb.append(p0);
            sb.append(" does not have a NavController set");
            throw new IllegalStateException(sb.toString());
        }

        public static /* synthetic */ NavHostFragment create$default(Companion companion, int i, Bundle bundle, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                bundle = null;
            }
            return companion.create(i, bundle);
        }

        @JvmStatic
        public final NavHostFragment create(int p0, Bundle p1) {
            Bundle bundle;
            if (p0 != 0) {
                bundle = new Bundle();
                bundle.putInt(NavHostFragment.KEY_GRAPH_ID, p0);
            } else {
                bundle = null;
            }
            if (p1 != null) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putBundle(NavHostFragment.KEY_START_DESTINATION_ARGS, p1);
            }
            NavHostFragment navHostFragment = new NavHostFragment();
            if (bundle != null) {
                navHostFragment.setArguments(bundle);
            }
            return navHostFragment;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final NavHostFragment create(int i) {
            return create$default(this, i, null, 2, null);
        }
    }

    @JvmStatic
    public static final NavHostFragment create(int i) {
        return INSTANCE.create(i);
    }

    @JvmStatic
    public static final NavHostFragment create(int i, Bundle bundle) {
        return INSTANCE.create(i, bundle);
    }

    @JvmStatic
    public static final NavController findNavController(Fragment fragment) {
        return INSTANCE.findNavController(fragment);
    }
}
