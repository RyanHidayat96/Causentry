package androidx.p005navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentOnAttachListener;
import androidx.fragment.app.FragmentTransaction;
import androidx.p002lifecycle.Lifecycle;
import androidx.p002lifecycle.LifecycleEventObserver;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.ViewModel;
import androidx.p002lifecycle.ViewModelProvider;
import androidx.p002lifecycle.ViewModelStore;
import androidx.p002lifecycle.viewmodel.CreationExtras;
import androidx.p002lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import androidx.p005navigation.NavBackStackEntry;
import androidx.p005navigation.NavDestination;
import androidx.p005navigation.NavOptions;
import androidx.p005navigation.Navigator;
import androidx.p005navigation.NavigatorProvider;
import androidx.p005navigation.NavigatorState;
import defpackage.stopMediaCodec;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.sequences.SequencesKt;

/* JADX INFO: loaded from: classes5.dex */
@Navigator.Name("fragment")
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u0000 K2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004LMKNB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ1\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0017¢\u0006\u0004\b\u001f\u0010 J1\u0010$\u001a\u00020\u000f2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00120!2\b\u0010\u0006\u001a\u0004\u0018\u00010\"2\b\u0010\b\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b$\u0010%J+\u0010$\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00122\b\u0010\u0006\u001a\u0004\u0018\u00010\"2\b\u0010\b\u001a\u0004\u0018\u00010#H\u0002¢\u0006\u0004\b$\u0010&J\u0017\u0010'\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u0012H\u0016¢\u0006\u0004\b'\u0010(J!\u0010*\u001a\u00020)2\u0006\u0010\u0004\u001a\u00020\u00122\b\u0010\u0006\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0004\b*\u0010+J\u0011\u0010,\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u001dH\u0016¢\u0006\u0004\b.\u0010/J+\u00100\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u001c2\b\b\u0002\u0010\u0006\u001a\u00020\u000b2\b\b\u0002\u0010\b\u001a\u00020\u000bH\u0002¢\u0006\u0004\b0\u00101R\u0014\u00102\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00104\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00106\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\u001c088\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b9\u0010:R,\u0010=\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u000b0<0;8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R \u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120!0A8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0014\u0010F\u001a\u00020E8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bF\u0010GR \u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020E0H8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bI\u0010J"}, d2 = {"Landroidx/navigation/fragment/FragmentNavigator;", "Landroidx/navigation/Navigator;", "Landroidx/navigation/fragment/FragmentNavigator$Destination;", "Landroid/content/Context;", "p0", "Landroidx/fragment/app/FragmentManager;", "p1", "", "p2", "<init>", "(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;I)V", "", "isLoggingEnabled", "(I)Z", "Landroidx/navigation/NavigatorState;", "", "onAttach", "(Landroidx/navigation/NavigatorState;)V", "Landroidx/navigation/NavBackStackEntry;", "Landroidx/fragment/app/Fragment;", "attachObservers", "(Landroidx/navigation/NavBackStackEntry;Landroidx/fragment/app/Fragment;)V", "attachClearViewModel$navigation_fragment_release", "(Landroidx/fragment/app/Fragment;Landroidx/navigation/NavBackStackEntry;Landroidx/navigation/NavigatorState;)V", "popBackStack", "(Landroidx/navigation/NavBackStackEntry;Z)V", "createDestination", "()Landroidx/navigation/fragment/FragmentNavigator$Destination;", "", "Landroid/os/Bundle;", "p3", "instantiateFragment", "(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;Ljava/lang/String;Landroid/os/Bundle;)Landroidx/fragment/app/Fragment;", "", "Landroidx/navigation/NavOptions;", "Landroidx/navigation/Navigator$Extras;", "navigate", "(Ljava/util/List;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)V", "(Landroidx/navigation/NavBackStackEntry;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)V", "onLaunchSingleTop", "(Landroidx/navigation/NavBackStackEntry;)V", "Landroidx/fragment/app/FragmentTransaction;", "createFragmentTransaction", "(Landroidx/navigation/NavBackStackEntry;Landroidx/navigation/NavOptions;)Landroidx/fragment/app/FragmentTransaction;", "onSaveState", "()Landroid/os/Bundle;", "onRestoreState", "(Landroid/os/Bundle;)V", "addPendingOps", "(Ljava/lang/String;ZZ)V", "context", "Landroid/content/Context;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "containerId", "I", "", "savedIds", "Ljava/util/Set;", "", "Lkotlin/Pair;", "pendingOps", "Ljava/util/List;", "getPendingOps$navigation_fragment_release", "()Ljava/util/List;", "LstopMediaCodec;", "getBackStack$navigation_fragment_release", "()LstopMediaCodec;", "backStack", "Landroidx/lifecycle/LifecycleEventObserver;", "fragmentObserver", "Landroidx/lifecycle/LifecycleEventObserver;", "Lkotlin/Function1;", "fragmentViewObserver", "Lkotlin/jvm/functions/Function1;", "Companion", "Destination", "Extras", "ClearEntryStateViewModel"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class FragmentNavigator extends Navigator<Destination> {
    private static final Companion Companion = new Companion(null);
    private static final String KEY_SAVED_IDS = "androidx-nav-fragment:navigator:savedIds";
    private static final String TAG = "FragmentNavigator";
    private final int containerId;
    private final Context context;
    private final FragmentManager fragmentManager;
    private final LifecycleEventObserver fragmentObserver;
    private final Function1<NavBackStackEntry, LifecycleEventObserver> fragmentViewObserver;
    private final List<Pair<String, Boolean>> pendingOps;
    private final Set<String> savedIds;

    public FragmentNavigator(Context context, FragmentManager fragmentManager, int i) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        this.context = context;
        this.fragmentManager = fragmentManager;
        this.containerId = i;
        this.savedIds = new LinkedHashSet();
        this.pendingOps = new ArrayList();
        this.fragmentObserver = new LifecycleEventObserver() { // from class: androidx.navigation.fragment.FragmentNavigator$$ExternalSyntheticLambda0
            @Override // androidx.p002lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                FragmentNavigator.fragmentObserver$lambda$1(this.f$0, lifecycleOwner, event);
            }
        };
        this.fragmentViewObserver = new Function1() { // from class: androidx.navigation.fragment.FragmentNavigator$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FragmentNavigator.fragmentViewObserver$lambda$3(this.f$0, (NavBackStackEntry) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isLoggingEnabled(int p0) {
        return Log.isLoggable(FragmentManager.TAG, p0) || Log.isLoggable(TAG, p0);
    }

    public final List<Pair<String, Boolean>> getPendingOps$navigation_fragment_release() {
        return this.pendingOps;
    }

    public final stopMediaCodec<List<NavBackStackEntry>> getBackStack$navigation_fragment_release() {
        return getState().getBackStack();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fragmentObserver$lambda$1(FragmentNavigator fragmentNavigator, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(event, "");
        if (event == Lifecycle.Event.ON_DESTROY) {
            Fragment fragment = (Fragment) lifecycleOwner;
            Object obj = null;
            for (Object obj2 : fragmentNavigator.getState().getTransitionsInProgress().TuitionPaymentFragmentspecialinlinedviewModeldefault1()) {
                if (Intrinsics.areEqual(((NavBackStackEntry) obj2).getId(), fragment.getTag())) {
                    obj = obj2;
                }
            }
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
            if (navBackStackEntry != null) {
                if (fragmentNavigator.isLoggingEnabled(2)) {
                    Objects.toString(navBackStackEntry);
                    Objects.toString(lifecycleOwner);
                }
                fragmentNavigator.getState().markTransitionComplete(navBackStackEntry);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LifecycleEventObserver fragmentViewObserver$lambda$3(final FragmentNavigator fragmentNavigator, final NavBackStackEntry navBackStackEntry) {
        Intrinsics.checkNotNullParameter(navBackStackEntry, "");
        return new LifecycleEventObserver() { // from class: androidx.navigation.fragment.FragmentNavigator$$ExternalSyntheticLambda2
            @Override // androidx.p002lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                FragmentNavigator.fragmentViewObserver$lambda$3$lambda$2(this.f$0, navBackStackEntry, lifecycleOwner, event);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fragmentViewObserver$lambda$3$lambda$2(FragmentNavigator fragmentNavigator, NavBackStackEntry navBackStackEntry, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(event, "");
        if (event == Lifecycle.Event.ON_RESUME && fragmentNavigator.getState().getBackStack().TuitionPaymentFragmentspecialinlinedviewModeldefault1().contains(navBackStackEntry)) {
            if (fragmentNavigator.isLoggingEnabled(2)) {
                Objects.toString(navBackStackEntry);
                Objects.toString(lifecycleOwner);
            }
            fragmentNavigator.getState().markTransitionComplete(navBackStackEntry);
        }
        if (event == Lifecycle.Event.ON_DESTROY) {
            if (fragmentNavigator.isLoggingEnabled(2)) {
                Objects.toString(navBackStackEntry);
                Objects.toString(lifecycleOwner);
            }
            fragmentNavigator.getState().markTransitionComplete(navBackStackEntry);
        }
    }

    @Override // androidx.p005navigation.Navigator
    public void onAttach(final NavigatorState p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        super.onAttach(p0);
        isLoggingEnabled(2);
        this.fragmentManager.addFragmentOnAttachListener(new FragmentOnAttachListener() { // from class: androidx.navigation.fragment.FragmentNavigator$$ExternalSyntheticLambda5
            @Override // androidx.fragment.app.FragmentOnAttachListener
            public final void onAttachFragment(FragmentManager fragmentManager, Fragment fragment) {
                FragmentNavigator.onAttach$lambda$5(p0, this, fragmentManager, fragment);
            }
        });
        this.fragmentManager.addOnBackStackChangedListener(new FragmentManager.OnBackStackChangedListener() { // from class: androidx.navigation.fragment.FragmentNavigator.onAttach.2
            @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
            public final void onBackStackChanged() {
            }

            @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
            public final void onBackStackChangeStarted(Fragment p1, boolean p2) {
                NavBackStackEntry navBackStackEntryPrevious;
                Intrinsics.checkNotNullParameter(p1, "");
                if (p2) {
                    List<NavBackStackEntry> listTuitionPaymentFragmentspecialinlinedviewModeldefault1 = p0.getBackStack().TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    ListIterator<NavBackStackEntry> listIterator = listTuitionPaymentFragmentspecialinlinedviewModeldefault1.listIterator(listTuitionPaymentFragmentspecialinlinedviewModeldefault1.size());
                    do {
                        if (!listIterator.hasPrevious()) {
                            navBackStackEntryPrevious = null;
                            break;
                        }
                        navBackStackEntryPrevious = listIterator.previous();
                    } while (!Intrinsics.areEqual(navBackStackEntryPrevious.getId(), p1.getTag()));
                    NavBackStackEntry navBackStackEntry = navBackStackEntryPrevious;
                    if (this.isLoggingEnabled(2)) {
                        Objects.toString(p1);
                        Objects.toString(navBackStackEntry);
                    }
                    if (navBackStackEntry != null) {
                        p0.prepareForTransition(navBackStackEntry);
                    }
                }
            }

            @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
            public final void onBackStackChangeCommitted(Fragment p1, boolean p2) {
                Object obj;
                Object objPrevious;
                Intrinsics.checkNotNullParameter(p1, "");
                List listPlus = CollectionsKt.plus((Collection) p0.getBackStack().TuitionPaymentFragmentspecialinlinedviewModeldefault1(), (Iterable) p0.getTransitionsInProgress().TuitionPaymentFragmentspecialinlinedviewModeldefault1());
                ListIterator listIterator = listPlus.listIterator(listPlus.size());
                do {
                    obj = null;
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator.previous();
                } while (!Intrinsics.areEqual(((NavBackStackEntry) objPrevious).getId(), p1.getTag()));
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) objPrevious;
                boolean z = p2 && this.getPendingOps$navigation_fragment_release().isEmpty() && p1.isRemoving();
                for (Object obj2 : this.getPendingOps$navigation_fragment_release()) {
                    if (Intrinsics.areEqual(((Pair) obj2).getFirst(), p1.getTag())) {
                        obj = obj2;
                        break;
                    }
                }
                Pair pair = (Pair) obj;
                if (pair != null) {
                    this.getPendingOps$navigation_fragment_release().remove(pair);
                }
                if (!z && this.isLoggingEnabled(2)) {
                    Objects.toString(p1);
                    Objects.toString(navBackStackEntry);
                }
                boolean z2 = pair != null && ((Boolean) pair.getSecond()).booleanValue();
                if (!p2 && !z2 && navBackStackEntry == null) {
                    StringBuilder sb = new StringBuilder("The fragment ");
                    sb.append(p1);
                    sb.append(" is unknown to the FragmentNavigator. Please use the navigate() function to add fragments to the FragmentNavigator managed FragmentManager.");
                    throw new IllegalArgumentException(sb.toString().toString());
                }
                if (navBackStackEntry != null) {
                    this.attachClearViewModel$navigation_fragment_release(p1, navBackStackEntry, p0);
                    if (z) {
                        if (this.isLoggingEnabled(2)) {
                            Objects.toString(p1);
                            Objects.toString(navBackStackEntry);
                        }
                        p0.popWithTransition(navBackStackEntry, false);
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttach$lambda$5(NavigatorState navigatorState, FragmentNavigator fragmentNavigator, FragmentManager fragmentManager, Fragment fragment) {
        NavBackStackEntry navBackStackEntryPrevious;
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(fragment, "");
        List<NavBackStackEntry> listTuitionPaymentFragmentspecialinlinedviewModeldefault1 = navigatorState.getBackStack().TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        ListIterator<NavBackStackEntry> listIterator = listTuitionPaymentFragmentspecialinlinedviewModeldefault1.listIterator(listTuitionPaymentFragmentspecialinlinedviewModeldefault1.size());
        do {
            if (!listIterator.hasPrevious()) {
                navBackStackEntryPrevious = null;
                break;
            }
            navBackStackEntryPrevious = listIterator.previous();
        } while (!Intrinsics.areEqual(navBackStackEntryPrevious.getId(), fragment.getTag()));
        NavBackStackEntry navBackStackEntry = navBackStackEntryPrevious;
        if (fragmentNavigator.isLoggingEnabled(2)) {
            Objects.toString(fragment);
            Objects.toString(navBackStackEntry);
            Objects.toString(fragmentNavigator.fragmentManager);
        }
        if (navBackStackEntry != null) {
            fragmentNavigator.attachObservers(navBackStackEntry, fragment);
            fragmentNavigator.attachClearViewModel$navigation_fragment_release(fragment, navBackStackEntry, navigatorState);
        }
    }

    private final void attachObservers(final NavBackStackEntry p0, final Fragment p1) {
        p1.getViewLifecycleOwnerLiveData().observe(p1, new FragmentNavigator$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: androidx.navigation.fragment.FragmentNavigator$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FragmentNavigator.attachObservers$lambda$7(this.f$0, p1, p0, (LifecycleOwner) obj);
            }
        }));
        p1.getLifecycle().addObserver(this.fragmentObserver);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit attachObservers$lambda$7(FragmentNavigator fragmentNavigator, Fragment fragment, NavBackStackEntry navBackStackEntry, LifecycleOwner lifecycleOwner) {
        List<Pair<String, Boolean>> list = fragmentNavigator.pendingOps;
        boolean z = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual(((Pair) it.next()).getFirst(), fragment.getTag())) {
                    z = true;
                    break;
                }
            }
        }
        if (lifecycleOwner != null && !z) {
            Lifecycle lifecycle = fragment.getViewLifecycleOwner().getLifecycle();
            if (lifecycle.getState().isAtLeast(Lifecycle.State.CREATED)) {
                lifecycle.addObserver(fragmentNavigator.fragmentViewObserver.invoke(navBackStackEntry));
            }
        }
        return Unit.INSTANCE;
    }

    public final void attachClearViewModel$navigation_fragment_release(final Fragment p0, final NavBackStackEntry p1, final NavigatorState p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        ViewModelStore viewModelStore = p0.getViewModelStore();
        Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        initializerViewModelFactoryBuilder.addInitializer(Reflection.getOrCreateKotlinClass(ClearEntryStateViewModel.class), new Function1() { // from class: androidx.navigation.fragment.FragmentNavigator$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FragmentNavigator.attachClearViewModel$lambda$9$lambda$8((CreationExtras) obj);
            }
        });
        ((ClearEntryStateViewModel) new ViewModelProvider(viewModelStore, initializerViewModelFactoryBuilder.build(), CreationExtras.Empty.INSTANCE).get(ClearEntryStateViewModel.class)).setCompleteTransition(new WeakReference<>(new Function0() { // from class: androidx.navigation.fragment.FragmentNavigator$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FragmentNavigator.attachClearViewModel$lambda$12(p1, p2, this, p0);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClearEntryStateViewModel attachClearViewModel$lambda$9$lambda$8(CreationExtras creationExtras) {
        Intrinsics.checkNotNullParameter(creationExtras, "");
        return new ClearEntryStateViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit attachClearViewModel$lambda$12(NavBackStackEntry navBackStackEntry, NavigatorState navigatorState, FragmentNavigator fragmentNavigator, Fragment fragment) {
        for (NavBackStackEntry navBackStackEntry2 : navigatorState.getTransitionsInProgress().TuitionPaymentFragmentspecialinlinedviewModeldefault1()) {
            if (fragmentNavigator.isLoggingEnabled(2)) {
                Objects.toString(navBackStackEntry2);
                Objects.toString(fragment);
            }
            navigatorState.markTransitionComplete(navBackStackEntry2);
        }
        return Unit.INSTANCE;
    }

    @Override // androidx.p005navigation.Navigator
    public void popBackStack(NavBackStackEntry p0, boolean p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        if (this.fragmentManager.isStateSaved()) {
            return;
        }
        List<NavBackStackEntry> listTuitionPaymentFragmentspecialinlinedviewModeldefault1 = getState().getBackStack().TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iIndexOf = listTuitionPaymentFragmentspecialinlinedviewModeldefault1.indexOf(p0);
        List<NavBackStackEntry> listSubList = listTuitionPaymentFragmentspecialinlinedviewModeldefault1.subList(iIndexOf, listTuitionPaymentFragmentspecialinlinedviewModeldefault1.size());
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) CollectionsKt.first((List) listTuitionPaymentFragmentspecialinlinedviewModeldefault1);
        NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) CollectionsKt.getOrNull(listTuitionPaymentFragmentspecialinlinedviewModeldefault1, iIndexOf - 1);
        if (navBackStackEntry2 != null) {
            addPendingOps$default(this, navBackStackEntry2.getId(), false, false, 6, null);
        }
        List<NavBackStackEntry> list = listSubList;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            NavBackStackEntry navBackStackEntry3 = (NavBackStackEntry) obj;
            if (SequencesKt.contains(SequencesKt.map(CollectionsKt.asSequence(this.pendingOps), new Function1() { // from class: androidx.navigation.fragment.FragmentNavigator$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return FragmentNavigator.popBackStack$lambda$14$lambda$13((Pair) obj2);
                }
            }), navBackStackEntry3.getId()) || !Intrinsics.areEqual(navBackStackEntry3.getId(), navBackStackEntry.getId())) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            addPendingOps$default(this, ((NavBackStackEntry) it.next()).getId(), true, false, 4, null);
        }
        if (p1) {
            for (NavBackStackEntry navBackStackEntry4 : CollectionsKt.reversed(list)) {
                if (Intrinsics.areEqual(navBackStackEntry4, navBackStackEntry)) {
                    Objects.toString(navBackStackEntry4);
                } else {
                    this.fragmentManager.saveBackStack(navBackStackEntry4.getId());
                    this.savedIds.add(navBackStackEntry4.getId());
                }
            }
        } else {
            this.fragmentManager.popBackStack(p0.getId(), 1);
        }
        if (isLoggingEnabled(2)) {
            Objects.toString(p0);
        }
        getState().popWithTransition(p0, p1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String popBackStack$lambda$14$lambda$13(Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        return (String) pair.getFirst();
    }

    @Override // androidx.p005navigation.Navigator
    public Destination createDestination() {
        return new Destination(this);
    }

    @Deprecated(message = "Set a custom {@link androidx.fragment.app.FragmentFactory} via\n      {@link FragmentManager#setFragmentFactory(FragmentFactory)} to control\n      instantiation of Fragments.")
    public Fragment instantiateFragment(Context p0, FragmentManager p1, String p2, Bundle p3) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Fragment fragmentInstantiate = p1.getFragmentFactory().instantiate(p0.getClassLoader(), p2);
        Intrinsics.checkNotNullExpressionValue(fragmentInstantiate, "");
        return fragmentInstantiate;
    }

    @Override // androidx.p005navigation.Navigator
    public void navigate(List<NavBackStackEntry> p0, NavOptions p1, Navigator.Extras p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        if (this.fragmentManager.isStateSaved()) {
            return;
        }
        Iterator<NavBackStackEntry> it = p0.iterator();
        while (it.hasNext()) {
            navigate(it.next(), p1, p2);
        }
    }

    private final void navigate(NavBackStackEntry p0, NavOptions p1, Navigator.Extras p2) {
        boolean zIsEmpty = getState().getBackStack().TuitionPaymentFragmentspecialinlinedviewModeldefault1().isEmpty();
        if (p1 != null && !zIsEmpty && p1.getRestoreState() && this.savedIds.remove(p0.getId())) {
            this.fragmentManager.restoreBackStack(p0.getId());
            getState().pushWithTransition(p0);
            return;
        }
        FragmentTransaction fragmentTransactionCreateFragmentTransaction = createFragmentTransaction(p0, p1);
        if (!zIsEmpty) {
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) CollectionsKt.lastOrNull((List) getState().getBackStack().TuitionPaymentFragmentspecialinlinedviewModeldefault1());
            if (navBackStackEntry != null) {
                addPendingOps$default(this, navBackStackEntry.getId(), false, false, 6, null);
            }
            addPendingOps$default(this, p0.getId(), false, false, 6, null);
            fragmentTransactionCreateFragmentTransaction.addToBackStack(p0.getId());
        }
        if (p2 instanceof Extras) {
            for (Map.Entry<View, String> entry : ((Extras) p2).getSharedElements().entrySet()) {
                fragmentTransactionCreateFragmentTransaction.addSharedElement(entry.getKey(), entry.getValue());
            }
        }
        fragmentTransactionCreateFragmentTransaction.commit();
        if (isLoggingEnabled(2)) {
            Objects.toString(p0);
        }
        getState().pushWithTransition(p0);
    }

    @Override // androidx.p005navigation.Navigator
    public void onLaunchSingleTop(NavBackStackEntry p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        if (this.fragmentManager.isStateSaved()) {
            return;
        }
        FragmentTransaction fragmentTransactionCreateFragmentTransaction = createFragmentTransaction(p0, null);
        List<NavBackStackEntry> listTuitionPaymentFragmentspecialinlinedviewModeldefault1 = getState().getBackStack().TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        if (listTuitionPaymentFragmentspecialinlinedviewModeldefault1.size() > 1) {
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) CollectionsKt.getOrNull(listTuitionPaymentFragmentspecialinlinedviewModeldefault1, CollectionsKt.getLastIndex(listTuitionPaymentFragmentspecialinlinedviewModeldefault1) - 1);
            if (navBackStackEntry != null) {
                addPendingOps$default(this, navBackStackEntry.getId(), false, false, 6, null);
            }
            addPendingOps$default(this, p0.getId(), true, false, 4, null);
            this.fragmentManager.popBackStack(p0.getId(), 1);
            addPendingOps$default(this, p0.getId(), false, false, 2, null);
            fragmentTransactionCreateFragmentTransaction.addToBackStack(p0.getId());
        }
        fragmentTransactionCreateFragmentTransaction.commit();
        getState().onLaunchSingleTop(p0);
    }

    private final FragmentTransaction createFragmentTransaction(NavBackStackEntry p0, NavOptions p1) {
        NavDestination destination = p0.getDestination();
        Intrinsics.checkNotNull(destination, "");
        Bundle arguments = p0.getArguments();
        String className = ((Destination) destination).getClassName();
        if (className.charAt(0) == '.') {
            StringBuilder sb = new StringBuilder();
            sb.append(this.context.getPackageName());
            sb.append(className);
            className = sb.toString();
        }
        Fragment fragmentInstantiate = this.fragmentManager.getFragmentFactory().instantiate(this.context.getClassLoader(), className);
        Intrinsics.checkNotNullExpressionValue(fragmentInstantiate, "");
        fragmentInstantiate.setArguments(arguments);
        FragmentTransaction fragmentTransactionBeginTransaction = this.fragmentManager.beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
        int enterAnim = p1 != null ? p1.getEnterAnim() : -1;
        int exitAnim = p1 != null ? p1.getExitAnim() : -1;
        int popEnterAnim = p1 != null ? p1.getPopEnterAnim() : -1;
        int popExitAnim = p1 != null ? p1.getPopExitAnim() : -1;
        if (enterAnim != -1 || exitAnim != -1 || popEnterAnim != -1 || popExitAnim != -1) {
            if (enterAnim == -1) {
                enterAnim = 0;
            }
            if (exitAnim == -1) {
                exitAnim = 0;
            }
            if (popEnterAnim == -1) {
                popEnterAnim = 0;
            }
            fragmentTransactionBeginTransaction.setCustomAnimations(enterAnim, exitAnim, popEnterAnim, popExitAnim != -1 ? popExitAnim : 0);
        }
        fragmentTransactionBeginTransaction.replace(this.containerId, fragmentInstantiate, p0.getId());
        fragmentTransactionBeginTransaction.setPrimaryNavigationFragment(fragmentInstantiate);
        fragmentTransactionBeginTransaction.setReorderingAllowed(true);
        return fragmentTransactionBeginTransaction;
    }

    @Override // androidx.p005navigation.Navigator
    public Bundle onSaveState() {
        if (this.savedIds.isEmpty()) {
            return null;
        }
        return BundleKt.bundleOf(TuplesKt.to(KEY_SAVED_IDS, new ArrayList(this.savedIds)));
    }

    @Override // androidx.p005navigation.Navigator
    public void onRestoreState(Bundle p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        ArrayList<String> stringArrayList = p0.getStringArrayList(KEY_SAVED_IDS);
        if (stringArrayList != null) {
            this.savedIds.clear();
            CollectionsKt.addAll(this.savedIds, stringArrayList);
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0003\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001d\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0012"}, d2 = {"Landroidx/navigation/fragment/FragmentNavigator$Destination;", "Landroidx/navigation/NavDestination;", "Landroidx/navigation/Navigator;", "p0", "<init>", "(Landroidx/navigation/Navigator;)V", "Landroidx/navigation/NavigatorProvider;", "(Landroidx/navigation/NavigatorProvider;)V", "Landroid/content/Context;", "Landroid/util/AttributeSet;", "p1", "", "onInflate", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "setClassName", "(Ljava/lang/String;)Landroidx/navigation/fragment/FragmentNavigator$Destination;", "toString", "()Ljava/lang/String;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "_className", "Ljava/lang/String;", "getClassName", "className"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static class Destination extends NavDestination {
        private String _className;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Destination(Navigator<? extends Destination> navigator) {
            super(navigator);
            Intrinsics.checkNotNullParameter(navigator, "");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Destination(NavigatorProvider navigatorProvider) {
            this((Navigator<? extends Destination>) navigatorProvider.getNavigator(FragmentNavigator.class));
            Intrinsics.checkNotNullParameter(navigatorProvider, "");
        }

        @Override // androidx.p005navigation.NavDestination
        public void onInflate(Context p0, AttributeSet p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            super.onInflate(p0, p1);
            TypedArray typedArrayObtainAttributes = p0.getResources().obtainAttributes(p1, R.styleable.FragmentNavigator);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainAttributes, "");
            String string = typedArrayObtainAttributes.getString(R.styleable.FragmentNavigator_android_name);
            if (string != null) {
                setClassName(string);
            }
            Unit unit = Unit.INSTANCE;
            typedArrayObtainAttributes.recycle();
        }

        public final Destination setClassName(String p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this._className = p0;
            return this;
        }

        public final String getClassName() {
            String str = this._className;
            if (str == null) {
                throw new IllegalStateException("Fragment class was not set".toString());
            }
            Intrinsics.checkNotNull(str, "");
            return str;
        }

        @Override // androidx.p005navigation.NavDestination
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append(" class=");
            String str = this._className;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            return string;
        }

        @Override // androidx.p005navigation.NavDestination
        public boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            return p0 != null && (p0 instanceof Destination) && super.equals(p0) && Intrinsics.areEqual(this._className, ((Destination) p0)._className);
        }

        @Override // androidx.p005navigation.NavDestination
        public int hashCode() {
            int iHashCode = super.hashCode();
            String str = this._className;
            return (iHashCode * 31) + (str != null ? str.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u000fB\u001d\b\u0000\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007R0\u0010\n\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\bj\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004`\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001d\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028G¢\u0006\u0006\u001a\u0004\b\f\u0010\r"}, d2 = {"Landroidx/navigation/fragment/FragmentNavigator$Extras;", "Landroidx/navigation/Navigator$Extras;", "", "Landroid/view/View;", "", "p0", "<init>", "(Ljava/util/Map;)V", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "_sharedElements", "Ljava/util/LinkedHashMap;", "getSharedElements", "()Ljava/util/Map;", "sharedElements", "Builder"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Extras implements Navigator.Extras {
        private final LinkedHashMap<View, String> _sharedElements;

        public Extras(Map<View, String> map) {
            Intrinsics.checkNotNullParameter(map, "");
            LinkedHashMap<View, String> linkedHashMap = new LinkedHashMap<>();
            this._sharedElements = linkedHashMap;
            linkedHashMap.putAll(map);
        }

        public final Map<View, String> getSharedElements() {
            return MapsKt.toMap(this._sharedElements);
        }

        /* JADX INFO: loaded from: classes6.dex */
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u00020\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000fR0\u0010\u0012\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0010j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u00118\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/navigation/fragment/FragmentNavigator$Extras$Builder;", "", "<init>", "()V", "", "Landroid/view/View;", "", "p0", "addSharedElements", "(Ljava/util/Map;)Landroidx/navigation/fragment/FragmentNavigator$Extras$Builder;", "p1", "addSharedElement", "(Landroid/view/View;Ljava/lang/String;)Landroidx/navigation/fragment/FragmentNavigator$Extras$Builder;", "Landroidx/navigation/fragment/FragmentNavigator$Extras;", "build", "()Landroidx/navigation/fragment/FragmentNavigator$Extras;", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "_sharedElements", "Ljava/util/LinkedHashMap;"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Builder {
            private final LinkedHashMap<View, String> _sharedElements = new LinkedHashMap<>();

            public final Builder addSharedElements(Map<View, String> p0) {
                Intrinsics.checkNotNullParameter(p0, "");
                for (Map.Entry<View, String> entry : p0.entrySet()) {
                    addSharedElement(entry.getKey(), entry.getValue());
                }
                return this;
            }

            public final Builder addSharedElement(View p0, String p1) {
                Intrinsics.checkNotNullParameter(p0, "");
                Intrinsics.checkNotNullParameter(p1, "");
                this._sharedElements.put(p0, p1);
                return this;
            }

            public final Extras build() {
                return new Extras(this._sharedElements);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006"}, d2 = {"Landroidx/navigation/fragment/FragmentNavigator$Companion;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "KEY_SAVED_IDS"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0003R.\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00070\u00068\u0007@\u0007X\u0087.¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r"}, d2 = {"Landroidx/navigation/fragment/FragmentNavigator$ClearEntryStateViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "", "onCleared", "Ljava/lang/ref/WeakReference;", "Lkotlin/Function0;", "completeTransition", "Ljava/lang/ref/WeakReference;", "getCompleteTransition", "()Ljava/lang/ref/WeakReference;", "setCompleteTransition", "(Ljava/lang/ref/WeakReference;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ClearEntryStateViewModel extends ViewModel {
        public WeakReference<Function0<Unit>> completeTransition;

        public final WeakReference<Function0<Unit>> getCompleteTransition() {
            WeakReference<Function0<Unit>> weakReference = this.completeTransition;
            if (weakReference != null) {
                return weakReference;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }

        public final void setCompleteTransition(WeakReference<Function0<Unit>> weakReference) {
            Intrinsics.checkNotNullParameter(weakReference, "");
            this.completeTransition = weakReference;
        }

        @Override // androidx.p002lifecycle.ViewModel
        public final void onCleared() {
            super.onCleared();
            Function0<Unit> function0 = getCompleteTransition().get();
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    static /* synthetic */ void addPendingOps$default(FragmentNavigator fragmentNavigator, String str, boolean z, boolean z2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addPendingOps");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = true;
        }
        fragmentNavigator.addPendingOps(str, z, z2);
    }

    private final void addPendingOps(final String p0, boolean p1, boolean p2) {
        if (p2) {
            CollectionsKt.removeAll((List) this.pendingOps, new Function1() { // from class: androidx.navigation.fragment.FragmentNavigator$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(FragmentNavigator.addPendingOps$lambda$16(p0, (Pair) obj));
                }
            });
        }
        this.pendingOps.add(TuplesKt.to(p0, Boolean.valueOf(p1)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean addPendingOps$lambda$16(String str, Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        return Intrinsics.areEqual(pair.getFirst(), str);
    }
}
