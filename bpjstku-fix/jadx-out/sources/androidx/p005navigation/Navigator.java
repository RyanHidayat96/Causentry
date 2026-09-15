package androidx.p005navigation;

import android.os.Bundle;
import androidx.p005navigation.NavDestination;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u000212B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\tH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00028\u0000H'¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0015\u001a\u00020\n2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J=\u0010\u0015\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0007\u001a\u00028\u00002\u000e\u0010\u0012\u001a\n\u0018\u00010\u0019j\u0004\u0018\u0001`\u001a2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00112\b\u0010\u001b\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010 J\u0017\u0010!\u001a\n\u0018\u00010\u0019j\u0004\u0018\u0001`\u001aH\u0016¢\u0006\u0004\b!\u0010\"J\u001b\u0010#\u001a\u00020\n2\n\u0010\u0007\u001a\u00060\u0019j\u0002`\u001aH\u0016¢\u0006\u0004\b#\u0010$R\u0016\u0010%\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020\u00068AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0018\u0010*\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020\t8EX\u0084\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R$\u0010/\u001a\u00020\u001d2\u0006\u0010\u0007\u001a\u00020\u001d8\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b/\u0010 "}, d2 = {"Landroidx/navigation/Navigator;", "Landroidx/navigation/NavDestination;", "D", "", "<init>", "()V", "", "p0", "(Ljava/lang/String;)V", "Landroidx/navigation/NavigatorState;", "", "onAttach", "(Landroidx/navigation/NavigatorState;)V", "createDestination", "()Landroidx/navigation/NavDestination;", "", "Landroidx/navigation/NavBackStackEntry;", "Landroidx/navigation/NavOptions;", "p1", "Landroidx/navigation/Navigator$Extras;", "p2", "navigate", "(Ljava/util/List;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)V", "onLaunchSingleTop", "(Landroidx/navigation/NavBackStackEntry;)V", "Landroid/os/Bundle;", "Landroidx/savedstate/b;", "p3", "(Landroidx/navigation/NavDestination;Landroid/os/Bundle;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)Landroidx/navigation/NavDestination;", "", "popBackStack", "(Landroidx/navigation/NavBackStackEntry;Z)V", "()Z", "onSaveState", "()Landroid/os/Bundle;", "onRestoreState", "(Landroid/os/Bundle;)V", "_name", "Ljava/lang/String;", "getName$navigation_common_release", "()Ljava/lang/String;", "name", "_state", "Landroidx/navigation/NavigatorState;", "getState", "()Landroidx/navigation/NavigatorState;", RemoteConfigConstants.ResponseFieldKey.STATE, "isAttached", "Z", "Name", "Extras"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class Navigator<D extends NavDestination> {
    private final String _name;
    private NavigatorState _state;
    private boolean isAttached;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/navigation/Navigator$Extras;", ""}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Extras {
    }

    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001B\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002R\u0011\u0010\u0004\u001a\u00020\u00028\u0007¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/navigation/Navigator$Name;", "", "", "p0", "value", "()Ljava/lang/String;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @kotlin.annotation.Target(allowedTargets = {AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.CLASS})
    @Retention(RetentionPolicy.RUNTIME)
    @kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
    public @interface Name {
        String value();
    }

    public abstract D createDestination();

    public Bundle onSaveState() {
        return null;
    }

    public boolean popBackStack() {
        return true;
    }

    public Navigator() {
        this._name = null;
    }

    public Navigator(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this._name = str;
    }

    public final String getName$navigation_common_release() {
        String str = this._name;
        if (str != null) {
            return str;
        }
        String simpleName = Reflection.getOrCreateKotlinClass(getClass()).getSimpleName();
        Intrinsics.checkNotNull(simpleName);
        return StringsKt.removeSuffix(simpleName, (CharSequence) "Navigator");
    }

    public final NavigatorState getState() {
        NavigatorState navigatorState = this._state;
        if (navigatorState != null) {
            return navigatorState;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached".toString());
    }

    /* JADX INFO: renamed from: isAttached, reason: from getter */
    public final boolean getIsAttached() {
        return this.isAttached;
    }

    public void onAttach(NavigatorState p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        this._state = p0;
        this.isAttached = true;
    }

    public void navigate(List<NavBackStackEntry> p0, final NavOptions p1, final Extras p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        Iterator it = SequencesKt.filterNotNull(SequencesKt.map(CollectionsKt.asSequence(p0), new Function1() { // from class: androidx.navigation.Navigator$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Navigator.navigate$lambda$1(this.f$0, p1, p2, (NavBackStackEntry) obj);
            }
        })).iterator();
        while (it.hasNext()) {
            getState().push((NavBackStackEntry) it.next());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final NavBackStackEntry navigate$lambda$1(Navigator navigator, NavOptions navOptions, Extras extras, NavBackStackEntry navBackStackEntry) {
        NavDestination navDestinationNavigate;
        Intrinsics.checkNotNullParameter(navBackStackEntry, "");
        NavDestination destination = navBackStackEntry.getDestination();
        if (!(destination instanceof NavDestination)) {
            destination = null;
        }
        if (destination == null || (navDestinationNavigate = navigator.navigate(destination, navBackStackEntry.getArguments(), navOptions, extras)) == null) {
            return null;
        }
        return Intrinsics.areEqual(navDestinationNavigate, destination) ? navBackStackEntry : navigator.getState().createBackStackEntry(navDestinationNavigate, navDestinationNavigate.addInDefaultArgs(navBackStackEntry.getArguments()));
    }

    public void onLaunchSingleTop(NavBackStackEntry p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        NavDestination destination = p0.getDestination();
        if (!(destination instanceof NavDestination)) {
            destination = null;
        }
        if (destination == null) {
            return;
        }
        navigate(destination, null, NavOptionsBuilderKt.navOptions(new Function1() { // from class: androidx.navigation.Navigator$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Navigator.onLaunchSingleTop$lambda$3((NavOptionsBuilder) obj);
            }
        }), null);
        getState().onLaunchSingleTop(p0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onLaunchSingleTop$lambda$3(NavOptionsBuilder navOptionsBuilder) {
        Intrinsics.checkNotNullParameter(navOptionsBuilder, "");
        navOptionsBuilder.setLaunchSingleTop(true);
        return Unit.INSTANCE;
    }

    public void popBackStack(NavBackStackEntry p0, boolean p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        List<NavBackStackEntry> listTuitionPaymentFragmentspecialinlinedviewModeldefault1 = getState().getBackStack().TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        if (!listTuitionPaymentFragmentspecialinlinedviewModeldefault1.contains(p0)) {
            StringBuilder sb = new StringBuilder("popBackStack was called with ");
            sb.append(p0);
            sb.append(" which does not exist in back stack ");
            sb.append(listTuitionPaymentFragmentspecialinlinedviewModeldefault1);
            throw new IllegalStateException(sb.toString().toString());
        }
        ListIterator<NavBackStackEntry> listIterator = listTuitionPaymentFragmentspecialinlinedviewModeldefault1.listIterator(listTuitionPaymentFragmentspecialinlinedviewModeldefault1.size());
        NavBackStackEntry navBackStackEntryPrevious = null;
        while (popBackStack()) {
            navBackStackEntryPrevious = listIterator.previous();
            if (Intrinsics.areEqual(navBackStackEntryPrevious, p0)) {
                break;
            }
        }
        if (navBackStackEntryPrevious != null) {
            getState().pop(navBackStackEntryPrevious, p1);
        }
    }

    public NavDestination navigate(D p0, Bundle p1, NavOptions p2, Extras p3) {
        Intrinsics.checkNotNullParameter(p0, "");
        return p0;
    }

    public void onRestoreState(Bundle p0) {
        Intrinsics.checkNotNullParameter(p0, "");
    }
}
