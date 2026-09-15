package androidx.p005navigation;

import android.os.Bundle;
import androidx.p005navigation.p008internal.SynchronizedObject;
import defpackage.EncoderImplExternalSyntheticLambda14;
import defpackage.lambdasignalSourceStopped7androidxcameravideointernalencoderEncoderImpl;
import defpackage.lambdastop3androidxcameravideointernalencoderEncoderImpl;
import defpackage.stopMediaCodec;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ'\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\n2\u000e\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\fH'¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0014\u0010\bJ\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0015\u0010\bJ\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\bJ\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0017\u0010\bR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR \u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u001c0\u001b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR \u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u001f0\u001b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010\u001eR*\u0010!\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00108G@GX\u0087\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#\"\u0004\b$\u0010%R&\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u001c0&8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R&\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u001f0&8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b,\u0010*"}, d2 = {"Landroidx/navigation/NavigatorState;", "", "<init>", "()V", "Landroidx/navigation/NavBackStackEntry;", "p0", "", "push", "(Landroidx/navigation/NavBackStackEntry;)V", "pushWithTransition", "Landroidx/navigation/NavDestination;", "Landroid/os/Bundle;", "Landroidx/savedstate/b;", "p1", "createBackStackEntry", "(Landroidx/navigation/NavDestination;Landroid/os/Bundle;)Landroidx/navigation/NavBackStackEntry;", "", "pop", "(Landroidx/navigation/NavBackStackEntry;Z)V", "popWithTransition", "onLaunchSingleTop", "onLaunchSingleTopWithTransition", "markTransitionComplete", "prepareForTransition", "Landroidx/navigation/internal/SynchronizedObject;", "backStackLock", "Landroidx/navigation/internal/SynchronizedObject;", "Llambdastop3androidxcameravideointernalencoderEncoderImpl;", "", "_backStack", "Llambdastop3androidxcameravideointernalencoderEncoderImpl;", "", "_transitionsInProgress", "isNavigating", "Z", "()Z", "setNavigating", "(Z)V", "LstopMediaCodec;", "backStack", "LstopMediaCodec;", "getBackStack", "()LstopMediaCodec;", "transitionsInProgress", "getTransitionsInProgress"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class NavigatorState {
    private final lambdastop3androidxcameravideointernalencoderEncoderImpl<List<NavBackStackEntry>> _backStack;
    private final lambdastop3androidxcameravideointernalencoderEncoderImpl<Set<NavBackStackEntry>> _transitionsInProgress;
    private final stopMediaCodec<List<NavBackStackEntry>> backStack;
    private final SynchronizedObject backStackLock = new SynchronizedObject();
    private boolean isNavigating;
    private final stopMediaCodec<Set<NavBackStackEntry>> transitionsInProgress;

    public abstract NavBackStackEntry createBackStackEntry(NavDestination p0, Bundle p1);

    public NavigatorState() {
        lambdastop3androidxcameravideointernalencoderEncoderImpl<List<NavBackStackEntry>> lambdastop3androidxcameravideointernalencoderencoderimplTuitionPaymentFragmentspecialinlinedviewModeldefault2 = EncoderImplExternalSyntheticLambda14.TuitionPaymentFragmentspecialinlinedviewModeldefault2(CollectionsKt.emptyList());
        this._backStack = lambdastop3androidxcameravideointernalencoderencoderimplTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        lambdastop3androidxcameravideointernalencoderEncoderImpl<Set<NavBackStackEntry>> lambdastop3androidxcameravideointernalencoderencoderimplTuitionPaymentFragmentspecialinlinedviewModeldefault3 = EncoderImplExternalSyntheticLambda14.TuitionPaymentFragmentspecialinlinedviewModeldefault2(SetsKt.emptySet());
        this._transitionsInProgress = lambdastop3androidxcameravideointernalencoderencoderimplTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        this.backStack = new lambdasignalSourceStopped7androidxcameravideointernalencoderEncoderImpl(lambdastop3androidxcameravideointernalencoderencoderimplTuitionPaymentFragmentspecialinlinedviewModeldefault2, null);
        this.transitionsInProgress = new lambdasignalSourceStopped7androidxcameravideointernalencoderEncoderImpl(lambdastop3androidxcameravideointernalencoderencoderimplTuitionPaymentFragmentspecialinlinedviewModeldefault3, null);
    }

    /* JADX INFO: renamed from: isNavigating, reason: from getter */
    public final boolean getIsNavigating() {
        return this.isNavigating;
    }

    public final void setNavigating(boolean z) {
        this.isNavigating = z;
    }

    public final stopMediaCodec<List<NavBackStackEntry>> getBackStack() {
        return this.backStack;
    }

    public final stopMediaCodec<Set<NavBackStackEntry>> getTransitionsInProgress() {
        return this.transitionsInProgress;
    }

    public void push(NavBackStackEntry p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        synchronized (this.backStackLock) {
            this._backStack.b(CollectionsKt.plus((Collection<? extends NavBackStackEntry>) this._backStack.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), p0));
            Unit unit = Unit.INSTANCE;
        }
    }

    public void pushWithTransition(NavBackStackEntry p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        Set<NavBackStackEntry> setTuitionPaymentFragmentspecialinlinedviewModeldefault1 = this._transitionsInProgress.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        if (!(setTuitionPaymentFragmentspecialinlinedviewModeldefault1 instanceof Collection) || !setTuitionPaymentFragmentspecialinlinedviewModeldefault1.isEmpty()) {
            Iterator<T> it = setTuitionPaymentFragmentspecialinlinedviewModeldefault1.iterator();
            while (it.hasNext()) {
                if (((NavBackStackEntry) it.next()) == p0) {
                    List<NavBackStackEntry> listTuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.backStack.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    if (!(listTuitionPaymentFragmentspecialinlinedviewModeldefault1 instanceof Collection) || !listTuitionPaymentFragmentspecialinlinedviewModeldefault1.isEmpty()) {
                        Iterator<T> it2 = listTuitionPaymentFragmentspecialinlinedviewModeldefault1.iterator();
                        while (it2.hasNext()) {
                            if (((NavBackStackEntry) it2.next()) == p0) {
                                return;
                            }
                        }
                        break;
                    }
                    break;
                }
            }
        }
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) CollectionsKt.lastOrNull((List) this.backStack.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        if (navBackStackEntry != null) {
            lambdastop3androidxcameravideointernalencoderEncoderImpl<Set<NavBackStackEntry>> lambdastop3androidxcameravideointernalencoderencoderimpl = this._transitionsInProgress;
            lambdastop3androidxcameravideointernalencoderencoderimpl.b(SetsKt.plus(lambdastop3androidxcameravideointernalencoderencoderimpl.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), navBackStackEntry));
        }
        lambdastop3androidxcameravideointernalencoderEncoderImpl<Set<NavBackStackEntry>> lambdastop3androidxcameravideointernalencoderencoderimpl2 = this._transitionsInProgress;
        lambdastop3androidxcameravideointernalencoderencoderimpl2.b(SetsKt.plus(lambdastop3androidxcameravideointernalencoderencoderimpl2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), p0));
        push(p0);
    }

    public void pop(NavBackStackEntry p0, boolean p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        synchronized (this.backStackLock) {
            lambdastop3androidxcameravideointernalencoderEncoderImpl lambdastop3androidxcameravideointernalencoderencoderimpl = this._backStack;
            Iterable iterable = (Iterable) this._backStack.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            ArrayList arrayList = new ArrayList();
            for (Object obj : iterable) {
                if (Intrinsics.areEqual((NavBackStackEntry) obj, p0)) {
                    break;
                } else {
                    arrayList.add(obj);
                }
            }
            lambdastop3androidxcameravideointernalencoderencoderimpl.b(arrayList);
            Unit unit = Unit.INSTANCE;
        }
    }

    public void popWithTransition(NavBackStackEntry p0, boolean p1) {
        NavBackStackEntry navBackStackEntryPrevious;
        Intrinsics.checkNotNullParameter(p0, "");
        Set<NavBackStackEntry> setTuitionPaymentFragmentspecialinlinedviewModeldefault1 = this._transitionsInProgress.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        if (!(setTuitionPaymentFragmentspecialinlinedviewModeldefault1 instanceof Collection) || !setTuitionPaymentFragmentspecialinlinedviewModeldefault1.isEmpty()) {
            Iterator<T> it = setTuitionPaymentFragmentspecialinlinedviewModeldefault1.iterator();
            while (it.hasNext()) {
                if (((NavBackStackEntry) it.next()) == p0) {
                    List<NavBackStackEntry> listTuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.backStack.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    if ((listTuitionPaymentFragmentspecialinlinedviewModeldefault1 instanceof Collection) && listTuitionPaymentFragmentspecialinlinedviewModeldefault1.isEmpty()) {
                        return;
                    }
                    Iterator<T> it2 = listTuitionPaymentFragmentspecialinlinedviewModeldefault1.iterator();
                    while (it2.hasNext()) {
                        if (((NavBackStackEntry) it2.next()) == p0) {
                            break;
                        }
                    }
                    return;
                }
            }
        }
        lambdastop3androidxcameravideointernalencoderEncoderImpl<Set<NavBackStackEntry>> lambdastop3androidxcameravideointernalencoderencoderimpl = this._transitionsInProgress;
        lambdastop3androidxcameravideointernalencoderencoderimpl.b(SetsKt.plus(lambdastop3androidxcameravideointernalencoderencoderimpl.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), p0));
        List<NavBackStackEntry> listTuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.backStack.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        ListIterator<NavBackStackEntry> listIterator = listTuitionPaymentFragmentspecialinlinedviewModeldefault2.listIterator(listTuitionPaymentFragmentspecialinlinedviewModeldefault2.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                navBackStackEntryPrevious = null;
                break;
            }
            navBackStackEntryPrevious = listIterator.previous();
            NavBackStackEntry navBackStackEntry = navBackStackEntryPrevious;
            if (!Intrinsics.areEqual(navBackStackEntry, p0) && this.backStack.TuitionPaymentFragmentspecialinlinedviewModeldefault1().lastIndexOf(navBackStackEntry) < this.backStack.TuitionPaymentFragmentspecialinlinedviewModeldefault1().lastIndexOf(p0)) {
                break;
            }
        }
        NavBackStackEntry navBackStackEntry2 = navBackStackEntryPrevious;
        if (navBackStackEntry2 != null) {
            lambdastop3androidxcameravideointernalencoderEncoderImpl<Set<NavBackStackEntry>> lambdastop3androidxcameravideointernalencoderencoderimpl2 = this._transitionsInProgress;
            lambdastop3androidxcameravideointernalencoderencoderimpl2.b(SetsKt.plus(lambdastop3androidxcameravideointernalencoderencoderimpl2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), navBackStackEntry2));
        }
        pop(p0, p1);
    }

    public void onLaunchSingleTop(NavBackStackEntry p0) {
        int iNextIndex;
        Intrinsics.checkNotNullParameter(p0, "");
        synchronized (this.backStackLock) {
            List mutableList = CollectionsKt.toMutableList((Collection) getBackStack().TuitionPaymentFragmentspecialinlinedviewModeldefault1());
            ListIterator listIterator = mutableList.listIterator(mutableList.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    iNextIndex = -1;
                    break;
                } else if (Intrinsics.areEqual(((NavBackStackEntry) listIterator.previous()).getId(), p0.getId())) {
                    iNextIndex = listIterator.nextIndex();
                    break;
                }
            }
            mutableList.set(iNextIndex, p0);
            this._backStack.b(mutableList);
            Unit unit = Unit.INSTANCE;
        }
    }

    public void onLaunchSingleTopWithTransition(NavBackStackEntry p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        List<NavBackStackEntry> listTuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.backStack.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        ListIterator<NavBackStackEntry> listIterator = listTuitionPaymentFragmentspecialinlinedviewModeldefault1.listIterator(listTuitionPaymentFragmentspecialinlinedviewModeldefault1.size());
        while (listIterator.hasPrevious()) {
            NavBackStackEntry navBackStackEntryPrevious = listIterator.previous();
            if (Intrinsics.areEqual(navBackStackEntryPrevious.getId(), p0.getId())) {
                lambdastop3androidxcameravideointernalencoderEncoderImpl<Set<NavBackStackEntry>> lambdastop3androidxcameravideointernalencoderencoderimpl = this._transitionsInProgress;
                lambdastop3androidxcameravideointernalencoderencoderimpl.b(SetsKt.plus((Set<? extends NavBackStackEntry>) SetsKt.plus(lambdastop3androidxcameravideointernalencoderencoderimpl.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), navBackStackEntryPrevious), p0));
                onLaunchSingleTop(p0);
                return;
            }
        }
        throw new NoSuchElementException("List contains no element matching the predicate.");
    }

    public void markTransitionComplete(NavBackStackEntry p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        lambdastop3androidxcameravideointernalencoderEncoderImpl<Set<NavBackStackEntry>> lambdastop3androidxcameravideointernalencoderencoderimpl = this._transitionsInProgress;
        lambdastop3androidxcameravideointernalencoderencoderimpl.b(SetsKt.minus(lambdastop3androidxcameravideointernalencoderencoderimpl.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), p0));
    }

    public void prepareForTransition(NavBackStackEntry p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        lambdastop3androidxcameravideointernalencoderEncoderImpl<Set<NavBackStackEntry>> lambdastop3androidxcameravideointernalencoderencoderimpl = this._transitionsInProgress;
        lambdastop3androidxcameravideointernalencoderencoderimpl.b(SetsKt.plus(lambdastop3androidxcameravideointernalencoderencoderimpl.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), p0));
    }
}
