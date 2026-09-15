package androidx.p005navigation.p006compose;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.window.DialogProperties;
import androidx.p005navigation.FloatingWindow;
import androidx.p005navigation.NavBackStackEntry;
import androidx.p005navigation.NavDestination;
import androidx.p005navigation.NavOptions;
import androidx.p005navigation.Navigator;
import com.google.firebase.analytics.FirebaseAnalytics;
import defpackage.stopMediaCodec;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Navigator.Name(DialogNavigator.NAME)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001f\u001eB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\tJ1\u0010\u000f\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0016\u0010\tR \u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n0\u00178AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R \u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u001b0\u00178AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0019"}, d2 = {"Landroidx/navigation/compose/DialogNavigator;", "Landroidx/navigation/Navigator;", "Landroidx/navigation/compose/DialogNavigator$Destination;", "<init>", "()V", "Landroidx/navigation/NavBackStackEntry;", "p0", "", "dismiss$navigation_compose_release", "(Landroidx/navigation/NavBackStackEntry;)V", "", "Landroidx/navigation/NavOptions;", "p1", "Landroidx/navigation/Navigator$Extras;", "p2", "navigate", "(Ljava/util/List;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)V", "createDestination", "()Landroidx/navigation/compose/DialogNavigator$Destination;", "", "popBackStack", "(Landroidx/navigation/NavBackStackEntry;Z)V", "onTransitionComplete$navigation_compose_release", "LstopMediaCodec;", "getBackStack$navigation_compose_release", "()LstopMediaCodec;", "backStack", "", "getTransitionInProgress$navigation_compose_release", "transitionInProgress", "Companion", "Destination"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DialogNavigator extends Navigator<Destination> {
    public static final String NAME = "dialog";
    public static final int $stable = 8;

    public DialogNavigator() {
        super(NAME);
    }

    public final stopMediaCodec<List<NavBackStackEntry>> getBackStack$navigation_compose_release() {
        return getState().getBackStack();
    }

    public final stopMediaCodec<Set<NavBackStackEntry>> getTransitionInProgress$navigation_compose_release() {
        return getState().getTransitionsInProgress();
    }

    public final void dismiss$navigation_compose_release(NavBackStackEntry p0) {
        popBackStack(p0, false);
    }

    @Override // androidx.p005navigation.Navigator
    public final void navigate(List<NavBackStackEntry> p0, NavOptions p1, Navigator.Extras p2) {
        Iterator<T> it = p0.iterator();
        while (it.hasNext()) {
            getState().push((NavBackStackEntry) it.next());
        }
    }

    @Override // androidx.p005navigation.Navigator
    public final Destination createDestination() {
        return new Destination(this, null, ComposableSingletons$DialogNavigatorKt.INSTANCE.m7296getLambda$1092249270$navigation_compose_release(), 2, null);
    }

    @Override // androidx.p005navigation.Navigator
    public final void popBackStack(NavBackStackEntry p0, boolean p1) {
        getState().popWithTransition(p0, p1);
        int iIndexOf = CollectionsKt.indexOf(getState().getTransitionsInProgress().TuitionPaymentFragmentspecialinlinedviewModeldefault1(), p0);
        int i = 0;
        for (Object obj : getState().getTransitionsInProgress().TuitionPaymentFragmentspecialinlinedviewModeldefault1()) {
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
            if (i > iIndexOf) {
                onTransitionComplete$navigation_compose_release(navBackStackEntry);
            }
            i++;
        }
    }

    public final void onTransitionComplete$navigation_compose_release(NavBackStackEntry p0) {
        getState().markTransitionComplete(p0);
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B2\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u00058\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R+\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Landroidx/navigation/compose/DialogNavigator$Destination;", "Landroidx/navigation/NavDestination;", "Landroidx/navigation/FloatingWindow;", "Landroidx/navigation/compose/DialogNavigator;", "p0", "Landroidx/compose/ui/window/DialogProperties;", "p1", "Lkotlin/Function1;", "Landroidx/navigation/NavBackStackEntry;", "", "Landroidx/compose/runtime/Composable;", "p2", "<init>", "(Landroidx/navigation/compose/DialogNavigator;Landroidx/compose/ui/window/DialogProperties;Lkotlin/jvm/functions/Function3;)V", "dialogProperties", "Landroidx/compose/ui/window/DialogProperties;", "getDialogProperties$navigation_compose_release", "()Landroidx/compose/ui/window/DialogProperties;", FirebaseAnalytics.Param.CONTENT, "Lkotlin/jvm/functions/Function3;", "getContent$navigation_compose_release", "()Lkotlin/jvm/functions/Function3;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Destination extends NavDestination implements FloatingWindow {
        public static final int $stable = 8;
        private final Function3<NavBackStackEntry, Composer, Integer, Unit> content;
        private final DialogProperties dialogProperties;

        public /* synthetic */ Destination(DialogNavigator dialogNavigator, DialogProperties dialogProperties, Function3 function3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(dialogNavigator, (i & 2) != 0 ? new DialogProperties(false, false, false, 7, (DefaultConstructorMarker) null) : dialogProperties, function3);
        }

        /* JADX INFO: renamed from: getDialogProperties$navigation_compose_release, reason: from getter */
        public final DialogProperties getDialogProperties() {
            return this.dialogProperties;
        }

        public final Function3<NavBackStackEntry, Composer, Integer, Unit> getContent$navigation_compose_release() {
            return this.content;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Destination(DialogNavigator dialogNavigator, DialogProperties dialogProperties, Function3<? super NavBackStackEntry, ? super Composer, ? super Integer, Unit> function3) {
            super(dialogNavigator);
            this.dialogProperties = dialogProperties;
            this.content = function3;
        }
    }
}
