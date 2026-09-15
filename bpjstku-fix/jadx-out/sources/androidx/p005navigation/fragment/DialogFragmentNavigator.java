package androidx.p005navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentOnAttachListener;
import androidx.p002lifecycle.Lifecycle;
import androidx.p002lifecycle.LifecycleEventObserver;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p005navigation.FloatingWindow;
import androidx.p005navigation.NavBackStackEntry;
import androidx.p005navigation.NavDestination;
import androidx.p005navigation.NavOptions;
import androidx.p005navigation.Navigator;
import androidx.p005navigation.NavigatorProvider;
import androidx.p005navigation.NavigatorState;
import androidx.p005navigation.p006compose.DialogNavigator;
import defpackage.stopMediaCodec;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Navigator.Name(DialogNavigator.NAME)
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0004\b\u0007\u0018\u0000 32\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000243B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0012\u0010\u0013J1\u0010\u0017\u001a\u00020\u000b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\t0\u00142\b\u0010\u0006\u001a\u0004\u0018\u00010\u00152\b\u0010\u000f\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0017\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0004\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b*\u0010+R \u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00140,8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R \u00101\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u001b008\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b1\u00102"}, d2 = {"Landroidx/navigation/fragment/DialogFragmentNavigator;", "Landroidx/navigation/Navigator;", "Landroidx/navigation/fragment/DialogFragmentNavigator$Destination;", "Landroid/content/Context;", "p0", "Landroidx/fragment/app/FragmentManager;", "p1", "<init>", "(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;)V", "Landroidx/navigation/NavBackStackEntry;", "", "", "popBackStack", "(Landroidx/navigation/NavBackStackEntry;Z)V", "", "p2", "popWithTransition", "(ILandroidx/navigation/NavBackStackEntry;Z)V", "createDestination", "()Landroidx/navigation/fragment/DialogFragmentNavigator$Destination;", "", "Landroidx/navigation/NavOptions;", "Landroidx/navigation/Navigator$Extras;", "navigate", "(Ljava/util/List;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)V", "(Landroidx/navigation/NavBackStackEntry;)V", "onLaunchSingleTop", "Landroidx/fragment/app/DialogFragment;", "createDialogFragment", "(Landroidx/navigation/NavBackStackEntry;)Landroidx/fragment/app/DialogFragment;", "Landroidx/navigation/NavigatorState;", "onAttach", "(Landroidx/navigation/NavigatorState;)V", "context", "Landroid/content/Context;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "", "", "restoredTagsAwaitingAttach", "Ljava/util/Set;", "Landroidx/navigation/fragment/DialogFragmentNavigator$observer$1;", "observer", "Landroidx/navigation/fragment/DialogFragmentNavigator$observer$1;", "LstopMediaCodec;", "getBackStack$navigation_fragment_release", "()LstopMediaCodec;", "backStack", "", "transitioningFragments", "Ljava/util/Map;", "Companion", "Destination"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DialogFragmentNavigator extends Navigator<Destination> {
    private static final Companion Companion = new Companion(null);
    private static final String TAG = "DialogFragmentNavigator";
    private final Context context;
    private final FragmentManager fragmentManager;
    private final DialogFragmentNavigator$observer$1 observer;
    private final Set<String> restoredTagsAwaitingAttach;
    private final Map<String, DialogFragment> transitioningFragments;

    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.navigation.fragment.DialogFragmentNavigator$observer$1] */
    public DialogFragmentNavigator(Context context, FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        this.context = context;
        this.fragmentManager = fragmentManager;
        this.restoredTagsAwaitingAttach = new LinkedHashSet();
        this.observer = new LifecycleEventObserver() { // from class: androidx.navigation.fragment.DialogFragmentNavigator$observer$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[Lifecycle.Event.values().length];
                    try {
                        iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[Lifecycle.Event.ON_STOP.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // androidx.p002lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner p0, Lifecycle.Event p1) {
                int iNextIndex;
                Intrinsics.checkNotNullParameter(p0, "");
                Intrinsics.checkNotNullParameter(p1, "");
                int i = WhenMappings.$EnumSwitchMapping$0[p1.ordinal()];
                if (i == 1) {
                    DialogFragment dialogFragment = (DialogFragment) p0;
                    List<NavBackStackEntry> listTuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.this$0.getState().getBackStack().TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    if (!(listTuitionPaymentFragmentspecialinlinedviewModeldefault1 instanceof Collection) || !listTuitionPaymentFragmentspecialinlinedviewModeldefault1.isEmpty()) {
                        Iterator<T> it = listTuitionPaymentFragmentspecialinlinedviewModeldefault1.iterator();
                        while (it.hasNext()) {
                            if (Intrinsics.areEqual(((NavBackStackEntry) it.next()).getId(), dialogFragment.getTag())) {
                                return;
                            }
                        }
                    }
                    dialogFragment.dismiss();
                    return;
                }
                Object obj = null;
                if (i == 2) {
                    DialogFragment dialogFragment2 = (DialogFragment) p0;
                    for (Object obj2 : this.this$0.getState().getTransitionsInProgress().TuitionPaymentFragmentspecialinlinedviewModeldefault1()) {
                        if (Intrinsics.areEqual(((NavBackStackEntry) obj2).getId(), dialogFragment2.getTag())) {
                            obj = obj2;
                        }
                    }
                    NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
                    if (navBackStackEntry != null) {
                        this.this$0.getState().markTransitionComplete(navBackStackEntry);
                        return;
                    }
                    return;
                }
                if (i != 3) {
                    if (i == 4) {
                        DialogFragment dialogFragment3 = (DialogFragment) p0;
                        for (Object obj3 : this.this$0.getState().getTransitionsInProgress().TuitionPaymentFragmentspecialinlinedviewModeldefault1()) {
                            if (Intrinsics.areEqual(((NavBackStackEntry) obj3).getId(), dialogFragment3.getTag())) {
                                obj = obj3;
                            }
                        }
                        NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) obj;
                        if (navBackStackEntry2 != null) {
                            this.this$0.getState().markTransitionComplete(navBackStackEntry2);
                        }
                        dialogFragment3.getLifecycle().removeObserver(this);
                        return;
                    }
                    return;
                }
                DialogFragment dialogFragment4 = (DialogFragment) p0;
                if (dialogFragment4.requireDialog().isShowing()) {
                    return;
                }
                List<NavBackStackEntry> listTuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.this$0.getState().getBackStack().TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                ListIterator<NavBackStackEntry> listIterator = listTuitionPaymentFragmentspecialinlinedviewModeldefault2.listIterator(listTuitionPaymentFragmentspecialinlinedviewModeldefault2.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        if (Intrinsics.areEqual(listIterator.previous().getId(), dialogFragment4.getTag())) {
                            iNextIndex = listIterator.nextIndex();
                            break;
                        }
                    } else {
                        iNextIndex = -1;
                        break;
                    }
                }
                NavBackStackEntry navBackStackEntry3 = (NavBackStackEntry) CollectionsKt.getOrNull(listTuitionPaymentFragmentspecialinlinedviewModeldefault2, iNextIndex);
                if (!Intrinsics.areEqual(CollectionsKt.lastOrNull((List) listTuitionPaymentFragmentspecialinlinedviewModeldefault2), navBackStackEntry3)) {
                    Objects.toString(dialogFragment4);
                }
                if (navBackStackEntry3 != null) {
                    this.this$0.popWithTransition(iNextIndex, navBackStackEntry3, false);
                }
            }
        };
        this.transitioningFragments = new LinkedHashMap();
    }

    public final stopMediaCodec<List<NavBackStackEntry>> getBackStack$navigation_fragment_release() {
        return getState().getBackStack();
    }

    @Override // androidx.p005navigation.Navigator
    public final void popBackStack(NavBackStackEntry p0, boolean p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        if (this.fragmentManager.isStateSaved()) {
            return;
        }
        List<NavBackStackEntry> listTuitionPaymentFragmentspecialinlinedviewModeldefault1 = getState().getBackStack().TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iIndexOf = listTuitionPaymentFragmentspecialinlinedviewModeldefault1.indexOf(p0);
        Iterator it = CollectionsKt.reversed(listTuitionPaymentFragmentspecialinlinedviewModeldefault1.subList(iIndexOf, listTuitionPaymentFragmentspecialinlinedviewModeldefault1.size())).iterator();
        while (it.hasNext()) {
            Fragment fragmentFindFragmentByTag = this.fragmentManager.findFragmentByTag(((NavBackStackEntry) it.next()).getId());
            if (fragmentFindFragmentByTag != null) {
                ((DialogFragment) fragmentFindFragmentByTag).dismiss();
            }
        }
        popWithTransition(iIndexOf, p0, p1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void popWithTransition(int p0, NavBackStackEntry p1, boolean p2) {
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) CollectionsKt.getOrNull(getState().getBackStack().TuitionPaymentFragmentspecialinlinedviewModeldefault1(), p0 - 1);
        boolean zContains = CollectionsKt.contains(getState().getTransitionsInProgress().TuitionPaymentFragmentspecialinlinedviewModeldefault1(), navBackStackEntry);
        getState().popWithTransition(p1, p2);
        if (navBackStackEntry == null || zContains) {
            return;
        }
        getState().markTransitionComplete(navBackStackEntry);
    }

    @Override // androidx.p005navigation.Navigator
    public final Destination createDestination() {
        return new Destination(this);
    }

    @Override // androidx.p005navigation.Navigator
    public final void navigate(List<NavBackStackEntry> p0, NavOptions p1, Navigator.Extras p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        if (this.fragmentManager.isStateSaved()) {
            return;
        }
        Iterator<NavBackStackEntry> it = p0.iterator();
        while (it.hasNext()) {
            navigate(it.next());
        }
    }

    private final void navigate(NavBackStackEntry p0) {
        createDialogFragment(p0).show(this.fragmentManager, p0.getId());
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) CollectionsKt.lastOrNull((List) getState().getBackStack().TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        boolean zContains = CollectionsKt.contains(getState().getTransitionsInProgress().TuitionPaymentFragmentspecialinlinedviewModeldefault1(), navBackStackEntry);
        getState().pushWithTransition(p0);
        if (navBackStackEntry == null || zContains) {
            return;
        }
        getState().markTransitionComplete(navBackStackEntry);
    }

    @Override // androidx.p005navigation.Navigator
    public final void onLaunchSingleTop(NavBackStackEntry p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        if (this.fragmentManager.isStateSaved()) {
            return;
        }
        DialogFragment dialogFragment = this.transitioningFragments.get(p0.getId());
        if (dialogFragment == null) {
            Fragment fragmentFindFragmentByTag = this.fragmentManager.findFragmentByTag(p0.getId());
            dialogFragment = fragmentFindFragmentByTag instanceof DialogFragment ? (DialogFragment) fragmentFindFragmentByTag : null;
        }
        if (dialogFragment != null) {
            dialogFragment.getLifecycle().removeObserver(this.observer);
            dialogFragment.dismiss();
        }
        createDialogFragment(p0).show(this.fragmentManager, p0.getId());
        getState().onLaunchSingleTopWithTransition(p0);
    }

    private final DialogFragment createDialogFragment(NavBackStackEntry p0) {
        NavDestination destination = p0.getDestination();
        Intrinsics.checkNotNull(destination, "");
        Destination destination2 = (Destination) destination;
        String className = destination2.getClassName();
        if (className.charAt(0) == '.') {
            StringBuilder sb = new StringBuilder();
            sb.append(this.context.getPackageName());
            sb.append(className);
            className = sb.toString();
        }
        Fragment fragmentInstantiate = this.fragmentManager.getFragmentFactory().instantiate(this.context.getClassLoader(), className);
        Intrinsics.checkNotNullExpressionValue(fragmentInstantiate, "");
        if (!DialogFragment.class.isAssignableFrom(fragmentInstantiate.getClass())) {
            StringBuilder sb2 = new StringBuilder("Dialog destination ");
            sb2.append(destination2.getClassName());
            sb2.append(" is not an instance of DialogFragment");
            throw new IllegalArgumentException(sb2.toString().toString());
        }
        DialogFragment dialogFragment = (DialogFragment) fragmentInstantiate;
        dialogFragment.setArguments(p0.getArguments());
        dialogFragment.getLifecycle().addObserver(this.observer);
        this.transitioningFragments.put(p0.getId(), dialogFragment);
        return dialogFragment;
    }

    @Override // androidx.p005navigation.Navigator
    public final void onAttach(NavigatorState p0) {
        Lifecycle lifecycle;
        Intrinsics.checkNotNullParameter(p0, "");
        super.onAttach(p0);
        for (NavBackStackEntry navBackStackEntry : p0.getBackStack().TuitionPaymentFragmentspecialinlinedviewModeldefault1()) {
            DialogFragment dialogFragment = (DialogFragment) this.fragmentManager.findFragmentByTag(navBackStackEntry.getId());
            if (dialogFragment == null || (lifecycle = dialogFragment.getLifecycle()) == null) {
                this.restoredTagsAwaitingAttach.add(navBackStackEntry.getId());
            } else {
                lifecycle.addObserver(this.observer);
            }
        }
        this.fragmentManager.addFragmentOnAttachListener(new FragmentOnAttachListener() { // from class: androidx.navigation.fragment.DialogFragmentNavigator$$ExternalSyntheticLambda0
            @Override // androidx.fragment.app.FragmentOnAttachListener
            public final void onAttachFragment(FragmentManager fragmentManager, Fragment fragment) {
                DialogFragmentNavigator.onAttach$lambda$1(this.f$0, fragmentManager, fragment);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttach$lambda$1(DialogFragmentNavigator dialogFragmentNavigator, FragmentManager fragmentManager, Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(fragment, "");
        Set<String> set = dialogFragmentNavigator.restoredTagsAwaitingAttach;
        if (TypeIntrinsics.asMutableCollection(set).remove(fragment.getTag())) {
            fragment.getLifecycle().addObserver(dialogFragmentNavigator.observer);
        }
        Map<String, DialogFragment> map = dialogFragmentNavigator.transitioningFragments;
        TypeIntrinsics.asMutableMap(map).remove(fragment.getTag());
    }

    /* JADX INFO: loaded from: classes4.dex */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0004\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001d\u001a\u00020\u000f8G¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c"}, d2 = {"Landroidx/navigation/fragment/DialogFragmentNavigator$Destination;", "Landroidx/navigation/NavDestination;", "Landroidx/navigation/FloatingWindow;", "Landroidx/navigation/Navigator;", "p0", "<init>", "(Landroidx/navigation/Navigator;)V", "Landroidx/navigation/NavigatorProvider;", "(Landroidx/navigation/NavigatorProvider;)V", "Landroid/content/Context;", "Landroid/util/AttributeSet;", "p1", "", "onInflate", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "setClassName", "(Ljava/lang/String;)Landroidx/navigation/fragment/DialogFragmentNavigator$Destination;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "_className", "Ljava/lang/String;", "getClassName", "()Ljava/lang/String;", "className"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static class Destination extends NavDestination implements FloatingWindow {
        private String _className;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Destination(Navigator<? extends Destination> navigator) {
            super(navigator);
            Intrinsics.checkNotNullParameter(navigator, "");
        }

        public final String getClassName() {
            String str = this._className;
            if (str == null) {
                throw new IllegalStateException("DialogFragment class was not set".toString());
            }
            Intrinsics.checkNotNull(str, "");
            return str;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Destination(NavigatorProvider navigatorProvider) {
            this((Navigator<? extends Destination>) navigatorProvider.getNavigator(DialogFragmentNavigator.class));
            Intrinsics.checkNotNullParameter(navigatorProvider, "");
        }

        @Override // androidx.p005navigation.NavDestination
        public void onInflate(Context p0, AttributeSet p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            super.onInflate(p0, p1);
            TypedArray typedArrayObtainAttributes = p0.getResources().obtainAttributes(p1, R.styleable.DialogFragmentNavigator);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainAttributes, "");
            String string = typedArrayObtainAttributes.getString(R.styleable.DialogFragmentNavigator_android_name);
            if (string != null) {
                setClassName(string);
            }
            typedArrayObtainAttributes.recycle();
        }

        public final Destination setClassName(String p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this._className = p0;
            return this;
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

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/navigation/fragment/DialogFragmentNavigator$Companion;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
