package androidx.p010navigationevent;

import defpackage.EncoderImplExternalSyntheticLambda14;
import defpackage.lambdasignalSourceStopped7androidxcameravideointernalencoderEncoderImpl;
import defpackage.lambdastop3androidxcameravideointernalencoderEncoderImpl;
import defpackage.stopMediaCodec;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010#\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\b\u0010\tJ+\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u00062\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\u00042\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006¢\u0006\u0004\b\u0010\u0010\tJ%\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u0018J'\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001f\u0010 J.\u0010#\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00062\u0016\u0010\u0007\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0004\u0012\u00020\"0!H\u0082\b¢\u0006\u0004\b#\u0010$J\u0015\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%H\u0002¢\u0006\u0004\b'\u0010(R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020*0)8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b+\u0010,R \u0010.\u001a\b\u0012\u0004\u0012\u00020*0-8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001a\u00103\u001a\b\u0012\u0004\u0012\u0002020)8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b3\u0010,R \u00104\u001a\b\u0012\u0004\u0012\u0002020-8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010/\u001a\u0004\b5\u00101R\u001e\u00107\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001e\u00109\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b9\u00108R\u001c\u0010:\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u001c\u0010<\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b<\u0010=\u0012\u0004\b>\u0010\u0003R\u0018\u0010?\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00110A8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00110A8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bD\u0010CR\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00110A8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bE\u0010CR\u0016\u0010F\u001a\u00020\"8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010H\u001a\u00020\"8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bH\u0010GR\u0016\u0010I\u001a\u00020\"8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bI\u0010G"}, d2 = {"Landroidx/navigationevent/NavigationEventProcessor;", "", "<init>", "()V", "", "refreshEnabledHandlers", "Landroidx/navigationevent/NavigationEventHandler;", "p0", "updateEnabledHandlerInfo$navigationevent", "(Landroidx/navigationevent/NavigationEventHandler;)V", "Landroidx/navigationevent/NavigationEventDispatcher;", "p1", "", "p2", "addHandler", "(Landroidx/navigationevent/NavigationEventDispatcher;Landroidx/navigationevent/NavigationEventHandler;I)V", "removeHandler", "Landroidx/navigationevent/NavigationEventInput;", "addInput", "(Landroidx/navigationevent/NavigationEventDispatcher;Landroidx/navigationevent/NavigationEventInput;I)V", "removeInput", "(Landroidx/navigationevent/NavigationEventInput;)V", "Landroidx/navigationevent/NavigationEvent;", "dispatchOnStarted", "(Landroidx/navigationevent/NavigationEventInput;ILandroidx/navigationevent/NavigationEvent;)V", "dispatchOnProgressed", "Landroidx/navigationevent/OnBackCompletedFallback;", "dispatchOnCompleted", "(Landroidx/navigationevent/NavigationEventInput;ILandroidx/navigationevent/OnBackCompletedFallback;)V", "dispatchOnCancelled", "(Landroidx/navigationevent/NavigationEventInput;I)V", "resolveEnabledHandler", "(I)Landroidx/navigationevent/NavigationEventHandler;", "Lkotlin/Function1;", "", "findHandler", "(Lkotlin/jvm/functions/Function1;)Landroidx/navigationevent/NavigationEventHandler;", "", "Landroidx/navigationevent/NavigationEventInfo;", "resolveCombinedBackInfo", "()Ljava/util/List;", "Llambdastop3androidxcameravideointernalencoderEncoderImpl;", "Landroidx/navigationevent/NavigationEventTransitionState;", "_transitionState", "Llambdastop3androidxcameravideointernalencoderEncoderImpl;", "LstopMediaCodec;", "transitionState", "LstopMediaCodec;", "getTransitionState", "()LstopMediaCodec;", "Landroidx/navigationevent/NavigationEventHistory;", "_history", "history", "getHistory", "Lkotlin/collections/ArrayDeque;", "overlayHandlers", "Lkotlin/collections/ArrayDeque;", "defaultHandlers", "inProgressHandler", "Landroidx/navigationevent/NavigationEventHandler;", "inProgressDirection", "I", "getInProgressDirection$annotations", "inProgressInput", "Landroidx/navigationevent/NavigationEventInput;", "", "unspecifiedInputs", "Ljava/util/Set;", "defaultInputs", "overlayInputs", "hasEnabledDefaultHandlers", "Z", "hasEnabledOverlayHandlers", "hasEnabledAnyHandlers"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NavigationEventProcessor {
    private final lambdastop3androidxcameravideointernalencoderEncoderImpl<NavigationEventHistory> _history;
    private final lambdastop3androidxcameravideointernalencoderEncoderImpl<NavigationEventTransitionState> _transitionState;
    private final ArrayDeque<NavigationEventHandler<?>> defaultHandlers;
    private final Set<NavigationEventInput> defaultInputs;
    private boolean hasEnabledAnyHandlers;
    private boolean hasEnabledDefaultHandlers;
    private boolean hasEnabledOverlayHandlers;
    private final stopMediaCodec<NavigationEventHistory> history;
    private int inProgressDirection;
    private NavigationEventHandler<?> inProgressHandler;
    private NavigationEventInput inProgressInput;
    private final ArrayDeque<NavigationEventHandler<?>> overlayHandlers;
    private final Set<NavigationEventInput> overlayInputs;
    private final stopMediaCodec<NavigationEventTransitionState> transitionState;
    private final Set<NavigationEventInput> unspecifiedInputs;

    private static /* synthetic */ void getInProgressDirection$annotations() {
    }

    public NavigationEventProcessor() {
        lambdastop3androidxcameravideointernalencoderEncoderImpl<NavigationEventTransitionState> lambdastop3androidxcameravideointernalencoderencoderimplTuitionPaymentFragmentspecialinlinedviewModeldefault2 = EncoderImplExternalSyntheticLambda14.TuitionPaymentFragmentspecialinlinedviewModeldefault2(NavigationEventTransitionState.Idle.INSTANCE);
        this._transitionState = lambdastop3androidxcameravideointernalencoderencoderimplTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        this.transitionState = new lambdasignalSourceStopped7androidxcameravideointernalencoderEncoderImpl(lambdastop3androidxcameravideointernalencoderencoderimplTuitionPaymentFragmentspecialinlinedviewModeldefault2, null);
        lambdastop3androidxcameravideointernalencoderEncoderImpl<NavigationEventHistory> lambdastop3androidxcameravideointernalencoderencoderimplTuitionPaymentFragmentspecialinlinedviewModeldefault3 = EncoderImplExternalSyntheticLambda14.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new NavigationEventHistory());
        this._history = lambdastop3androidxcameravideointernalencoderencoderimplTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        this.history = new lambdasignalSourceStopped7androidxcameravideointernalencoderEncoderImpl(lambdastop3androidxcameravideointernalencoderencoderimplTuitionPaymentFragmentspecialinlinedviewModeldefault3, null);
        this.overlayHandlers = new ArrayDeque<>();
        this.defaultHandlers = new ArrayDeque<>();
        this.unspecifiedInputs = new LinkedHashSet();
        this.defaultInputs = new LinkedHashSet();
        this.overlayInputs = new LinkedHashSet();
    }

    public final stopMediaCodec<NavigationEventTransitionState> getTransitionState() {
        return this.transitionState;
    }

    public final stopMediaCodec<NavigationEventHistory> getHistory() {
        return this.history;
    }

    public final void refreshEnabledHandlers() {
        boolean z;
        boolean z2;
        ArrayDeque<NavigationEventHandler<?>> arrayDeque = this.overlayHandlers;
        if ((arrayDeque instanceof Collection) && arrayDeque.isEmpty()) {
            z = false;
        } else {
            Iterator<NavigationEventHandler<?>> it = arrayDeque.iterator();
            while (true) {
                if (it.hasNext()) {
                    NavigationEventHandler<?> next = it.next();
                    if (next.isBackEnabled() || next.isForwardEnabled()) {
                        z = true;
                    }
                } else {
                    z = false;
                }
            }
        }
        ArrayDeque<NavigationEventHandler<?>> arrayDeque2 = this.defaultHandlers;
        if ((arrayDeque2 instanceof Collection) && arrayDeque2.isEmpty()) {
            z2 = false;
        } else {
            Iterator<NavigationEventHandler<?>> it2 = arrayDeque2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    NavigationEventHandler<?> next2 = it2.next();
                    if (next2.isBackEnabled() || next2.isForwardEnabled()) {
                        z2 = true;
                    }
                } else {
                    z2 = false;
                }
            }
        }
        boolean z3 = z || z2;
        boolean z4 = this.hasEnabledOverlayHandlers != z;
        boolean z5 = this.hasEnabledDefaultHandlers != z2;
        boolean z6 = this.hasEnabledAnyHandlers != z3;
        if (z4) {
            Iterator<NavigationEventInput> it3 = this.overlayInputs.iterator();
            while (it3.hasNext()) {
                it3.next().doOnHasEnabledHandlersChanged$navigationevent(z);
            }
        }
        if (z5) {
            Iterator<NavigationEventInput> it4 = this.defaultInputs.iterator();
            while (it4.hasNext()) {
                it4.next().doOnHasEnabledHandlersChanged$navigationevent(z2);
            }
        }
        if (z6) {
            Iterator<NavigationEventInput> it5 = this.unspecifiedInputs.iterator();
            while (it5.hasNext()) {
                it5.next().doOnHasEnabledHandlersChanged$navigationevent(z3);
            }
        }
        this.hasEnabledOverlayHandlers = z;
        this.hasEnabledDefaultHandlers = z2;
        this.hasEnabledAnyHandlers = z3;
        NavigationEventHandler<?> navigationEventHandlerResolveEnabledHandler$default = this.inProgressHandler;
        if (navigationEventHandlerResolveEnabledHandler$default == null) {
            navigationEventHandlerResolveEnabledHandler$default = resolveEnabledHandler$default(this, 0, 1, null);
        }
        updateEnabledHandlerInfo$navigationevent(navigationEventHandlerResolveEnabledHandler$default);
    }

    public final void updateEnabledHandlerInfo$navigationevent(NavigationEventHandler<?> p0) {
        NavigationEventHistory navigationEventHistory;
        NavigationEventHandler<?> navigationEventHandlerResolveEnabledHandler$default = this.inProgressHandler;
        if (navigationEventHandlerResolveEnabledHandler$default == null) {
            navigationEventHandlerResolveEnabledHandler$default = resolveEnabledHandler$default(this, 0, 1, null);
        }
        if (Intrinsics.areEqual(navigationEventHandlerResolveEnabledHandler$default, p0)) {
            if (navigationEventHandlerResolveEnabledHandler$default == null) {
                navigationEventHistory = new NavigationEventHistory();
            } else {
                navigationEventHistory = new NavigationEventHistory(navigationEventHandlerResolveEnabledHandler$default.getCurrentInfo(), resolveCombinedBackInfo(), navigationEventHandlerResolveEnabledHandler$default.getForwardInfo());
            }
            if (Intrinsics.areEqual(this._history.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), navigationEventHistory)) {
                return;
            }
            this._history.b(navigationEventHistory);
            Iterator<NavigationEventInput> it = this.overlayInputs.iterator();
            while (it.hasNext()) {
                it.next().doOnHistoryChanged$navigationevent(navigationEventHistory);
            }
            Iterator<NavigationEventInput> it2 = this.defaultInputs.iterator();
            while (it2.hasNext()) {
                it2.next().doOnHistoryChanged$navigationevent(navigationEventHistory);
            }
            Iterator<NavigationEventInput> it3 = this.unspecifiedInputs.iterator();
            while (it3.hasNext()) {
                it3.next().doOnHistoryChanged$navigationevent(navigationEventHistory);
            }
        }
    }

    public static /* synthetic */ void addHandler$default(NavigationEventProcessor navigationEventProcessor, NavigationEventDispatcher navigationEventDispatcher, NavigationEventHandler navigationEventHandler, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 1;
        }
        navigationEventProcessor.addHandler(navigationEventDispatcher, navigationEventHandler, i);
    }

    public final void addHandler(NavigationEventDispatcher p0, NavigationEventHandler<?> p1, int p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        if (p1.getDispatcher() != null) {
            StringBuilder sb = new StringBuilder("Handler '");
            sb.append(p1);
            sb.append("' is already registered with a dispatcher");
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (p2 == 0) {
            this.overlayHandlers.addFirst(p1);
        } else if (p2 == 1) {
            this.defaultHandlers.addFirst(p1);
        } else {
            throw new IllegalArgumentException("Unsupported priority value: ".concat(String.valueOf(p2)));
        }
        p1.setDispatcher$navigationevent(p0);
        refreshEnabledHandlers();
    }

    public final void removeHandler(NavigationEventHandler<?> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        if (Intrinsics.areEqual(p0, this.inProgressHandler)) {
            int i = this.inProgressDirection;
            if (i == -1) {
                p0.doOnBackCancelled$navigationevent();
            } else if (i == 1) {
                p0.doOnForwardCancelled$navigationevent();
            }
            this.inProgressHandler = null;
            this.inProgressDirection = 0;
            this.inProgressInput = null;
        }
        this.overlayHandlers.remove(p0);
        this.defaultHandlers.remove(p0);
        p0.setDispatcher$navigationevent(null);
        refreshEnabledHandlers();
    }

    public final void addInput(NavigationEventDispatcher p0, NavigationEventInput p1, int p2) {
        Set<NavigationEventInput> set;
        boolean z;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        if (p1.getDispatcher() != null) {
            StringBuilder sb = new StringBuilder("Input '");
            sb.append(p1);
            sb.append("' is already added to dispatcher ");
            sb.append(p1.getDispatcher());
            sb.append('.');
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (p2 == 0) {
            set = this.overlayInputs;
        } else if (p2 == 1) {
            set = this.defaultInputs;
        } else {
            set = this.unspecifiedInputs;
        }
        set.add(p1);
        p1.setDispatcher$navigationevent(p0);
        p1.doOnAdded$navigationevent(p0);
        p1.doOnHistoryChanged$navigationevent(this.history.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        if (p2 == 0) {
            z = this.hasEnabledOverlayHandlers;
        } else if (p2 == 1) {
            z = this.hasEnabledDefaultHandlers;
        } else {
            z = this.hasEnabledAnyHandlers;
        }
        p1.doOnHasEnabledHandlersChanged$navigationevent(z);
    }

    public final void removeInput(NavigationEventInput p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        this.overlayInputs.remove(p0);
        this.defaultInputs.remove(p0);
        this.unspecifiedInputs.remove(p0);
        p0.setDispatcher$navigationevent(null);
        p0.doOnRemoved$navigationevent();
    }

    public static /* synthetic */ void dispatchOnStarted$default(NavigationEventProcessor navigationEventProcessor, NavigationEventInput navigationEventInput, int i, NavigationEvent navigationEvent, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            navigationEvent = null;
        }
        navigationEventProcessor.dispatchOnStarted(navigationEventInput, i, navigationEvent);
    }

    public final void dispatchOnStarted(NavigationEventInput p0, int p1, NavigationEvent p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        if (this.inProgressDirection == 0) {
            NavigationEventHandler<?> navigationEventHandlerResolveEnabledHandler = resolveEnabledHandler(p1);
            this.inProgressHandler = navigationEventHandlerResolveEnabledHandler;
            this.inProgressDirection = p1;
            this.inProgressInput = p0;
            if (p2 != null) {
                if (p1 != -1) {
                    if (p1 == 1 && navigationEventHandlerResolveEnabledHandler != null) {
                        navigationEventHandlerResolveEnabledHandler.doOnForwardStarted$navigationevent(p2);
                    }
                } else if (navigationEventHandlerResolveEnabledHandler != null) {
                    navigationEventHandlerResolveEnabledHandler.doOnBackStarted$navigationevent(p2);
                }
                this._transitionState.b(new NavigationEventTransitionState.InProgress(p2, p1));
            }
        }
    }

    public final void dispatchOnProgressed(NavigationEventInput p0, int p1, NavigationEvent p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p2, "");
        if (Intrinsics.areEqual(p0, this.inProgressInput) && p1 == this.inProgressDirection) {
            NavigationEventHandler<?> navigationEventHandlerResolveEnabledHandler = this.inProgressHandler;
            if (navigationEventHandlerResolveEnabledHandler == null) {
                navigationEventHandlerResolveEnabledHandler = resolveEnabledHandler(p1);
            }
            if (p1 != -1) {
                if (p1 == 1 && navigationEventHandlerResolveEnabledHandler != null) {
                    navigationEventHandlerResolveEnabledHandler.doOnForwardProgressed$navigationevent(p2);
                }
            } else if (navigationEventHandlerResolveEnabledHandler != null) {
                navigationEventHandlerResolveEnabledHandler.doOnBackProgressed$navigationevent(p2);
            }
            this._transitionState.b(new NavigationEventTransitionState.InProgress(p2, p1));
        }
    }

    public final void dispatchOnCompleted(NavigationEventInput p0, int p1, OnBackCompletedFallback p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        if (Intrinsics.areEqual(p0, this.inProgressInput) && p1 == this.inProgressDirection) {
            NavigationEventHandler<?> navigationEventHandlerResolveEnabledHandler = this.inProgressHandler;
            if (navigationEventHandlerResolveEnabledHandler == null) {
                navigationEventHandlerResolveEnabledHandler = resolveEnabledHandler(p1);
            }
            this.inProgressHandler = null;
            this.inProgressDirection = 0;
            this.inProgressInput = null;
            if (p1 != -1) {
                if (p1 == 1 && navigationEventHandlerResolveEnabledHandler != null) {
                    navigationEventHandlerResolveEnabledHandler.doOnForwardCompleted$navigationevent();
                }
            } else if (navigationEventHandlerResolveEnabledHandler != null) {
                navigationEventHandlerResolveEnabledHandler.doOnBackCompleted$navigationevent();
            } else if (p2 != null) {
                p2.onBackCompletedFallback();
            }
            this._transitionState.b(NavigationEventTransitionState.Idle.INSTANCE);
        }
    }

    public final void dispatchOnCancelled(NavigationEventInput p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        if (Intrinsics.areEqual(p0, this.inProgressInput) && p1 == this.inProgressDirection) {
            NavigationEventHandler<?> navigationEventHandlerResolveEnabledHandler = this.inProgressHandler;
            if (navigationEventHandlerResolveEnabledHandler == null) {
                navigationEventHandlerResolveEnabledHandler = resolveEnabledHandler(p1);
            }
            this.inProgressHandler = null;
            this.inProgressDirection = 0;
            this.inProgressInput = null;
            if (p1 != -1) {
                if (p1 == 1 && navigationEventHandlerResolveEnabledHandler != null) {
                    navigationEventHandlerResolveEnabledHandler.doOnForwardCancelled$navigationevent();
                }
            } else if (navigationEventHandlerResolveEnabledHandler != null) {
                navigationEventHandlerResolveEnabledHandler.doOnBackCancelled$navigationevent();
            }
            this._transitionState.b(NavigationEventTransitionState.Idle.INSTANCE);
        }
    }

    static /* synthetic */ NavigationEventHandler resolveEnabledHandler$default(NavigationEventProcessor navigationEventProcessor, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return navigationEventProcessor.resolveEnabledHandler(i);
    }

    private final NavigationEventHandler<?> findHandler(Function1<? super NavigationEventHandler<?>, Boolean> p0) {
        NavigationEventHandler<?> navigationEventHandler;
        NavigationEventHandler<?> next;
        Iterator<NavigationEventHandler<?>> it = this.overlayHandlers.iterator();
        do {
            navigationEventHandler = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!p0.invoke(next).booleanValue());
        NavigationEventHandler<?> navigationEventHandler2 = next;
        if (navigationEventHandler2 != null) {
            return navigationEventHandler2;
        }
        for (NavigationEventHandler<?> navigationEventHandler3 : this.defaultHandlers) {
            if (p0.invoke(navigationEventHandler3).booleanValue()) {
                navigationEventHandler = navigationEventHandler3;
                break;
            }
        }
        return navigationEventHandler;
    }

    private final List<NavigationEventInfo> resolveCombinedBackInfo() {
        ArrayList arrayList = new ArrayList();
        for (NavigationEventHandler<?> navigationEventHandler : this.overlayHandlers) {
            if (navigationEventHandler.isBackEnabled() && !navigationEventHandler.getBackInfo().isEmpty()) {
                arrayList.addAll(navigationEventHandler.getBackInfo());
            }
        }
        for (NavigationEventHandler<?> navigationEventHandler2 : this.defaultHandlers) {
            if (navigationEventHandler2.isBackEnabled() && !navigationEventHandler2.getBackInfo().isEmpty()) {
                arrayList.addAll(navigationEventHandler2.getBackInfo());
            }
        }
        return arrayList;
    }

    private final NavigationEventHandler<?> resolveEnabledHandler(int p0) {
        NavigationEventHandler<?> next;
        NavigationEventHandler<?> next2;
        NavigationEventHandler<?> navigationEventHandler;
        NavigationEventHandler<?> next3;
        NavigationEventHandler<?> navigationEventHandler2 = null;
        if (p0 == -1) {
            Iterator<NavigationEventHandler<?>> it = this.overlayHandlers.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!next.isBackEnabled());
            NavigationEventHandler<?> navigationEventHandler3 = next;
            if (navigationEventHandler3 != null) {
                return navigationEventHandler3;
            }
            for (NavigationEventHandler<?> navigationEventHandler4 : this.defaultHandlers) {
                if (navigationEventHandler4.isBackEnabled()) {
                    navigationEventHandler2 = navigationEventHandler4;
                    break;
                }
            }
            return navigationEventHandler2;
        }
        if (p0 != 0) {
            if (p0 != 1) {
                StringBuilder sb = new StringBuilder("Unsupported direction: '");
                sb.append(p0);
                sb.append("'.");
                throw new IllegalStateException(sb.toString().toString());
            }
            Iterator<NavigationEventHandler<?>> it2 = this.overlayHandlers.iterator();
            do {
                if (!it2.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it2.next();
            } while (!next3.isForwardEnabled());
            NavigationEventHandler<?> navigationEventHandler5 = next3;
            if (navigationEventHandler5 != null) {
                return navigationEventHandler5;
            }
            for (NavigationEventHandler<?> navigationEventHandler6 : this.defaultHandlers) {
                if (navigationEventHandler6.isForwardEnabled()) {
                    navigationEventHandler2 = navigationEventHandler6;
                    break;
                }
            }
            return navigationEventHandler2;
        }
        Iterator<NavigationEventHandler<?>> it3 = this.overlayHandlers.iterator();
        do {
            if (!it3.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it3.next();
            navigationEventHandler = next2;
            if (navigationEventHandler.isBackEnabled()) {
                break;
            }
        } while (!navigationEventHandler.isForwardEnabled());
        NavigationEventHandler<?> navigationEventHandler7 = next2;
        if (navigationEventHandler7 != null) {
            return navigationEventHandler7;
        }
        for (NavigationEventHandler<?> navigationEventHandler8 : this.defaultHandlers) {
            NavigationEventHandler<?> navigationEventHandler9 = navigationEventHandler8;
            if (navigationEventHandler9.isBackEnabled() || navigationEventHandler9.isForwardEnabled()) {
                navigationEventHandler2 = navigationEventHandler8;
                break;
            }
        }
        return navigationEventHandler2;
    }
}
