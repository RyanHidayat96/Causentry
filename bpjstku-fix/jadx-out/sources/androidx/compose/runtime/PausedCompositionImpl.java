package androidx.compose.runtime;

import androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0;
import androidx.collection.ScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.internal.RememberEventDispatcher;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B`\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0011\u0012\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\fH\u0000¢\u0006\u0004\b\u001e\u0010\u001cJ\u000f\u0010\u001f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001f\u0010\u001cJ\u000f\u0010 \u001a\u00020\fH\u0002¢\u0006\u0004\b \u0010\u001cJ \u0010\"\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020!2\u0006\u0010\u0005\u001a\u00020!H\u0082\b¢\u0006\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010(\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010,\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R%\u00100\u001a\r\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001a\u00104\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001e\u00108\u001a\u0006\u0012\u0002\b\u00030\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u001e\u0010<\u001a\u00060\u0013j\u0002`\u00148\u0007X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R&\u0010B\u001a\u0012\u0012\u0004\u0012\u00020!0@j\b\u0012\u0004\u0012\u00020!`A8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u001c\u0010F\u001a\b\u0012\u0004\u0012\u00020E0D8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u001a\u0010I\u001a\u00020H8\u0001X\u0081\u0004¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\"\u0010N\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130M8\u0001X\u0081\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u0014\u0010S\u001a\u00020\u000f8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bR\u00107R\u0014\u0010T\u001a\u00020\u000f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bT\u00107R\u0014\u0010U\u001a\u00020\u000f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bU\u00107R\u0014\u0010V\u001a\u00020\u000f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bV\u00107"}, d2 = {"Landroidx/compose/runtime/PausedCompositionImpl;", "Landroidx/compose/runtime/PausedComposition;", "Landroidx/compose/runtime/CompositionImpl;", "p0", "Landroidx/compose/runtime/CompositionContext;", "p1", "Landroidx/compose/runtime/ComposerImpl;", "p2", "", "Landroidx/compose/runtime/RememberObserver;", "p3", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "p4", "", "p5", "Landroidx/compose/runtime/Applier;", "p6", "", "Landroidx/compose/runtime/platform/SynchronizedObject;", "p7", "<init>", "(Landroidx/compose/runtime/CompositionImpl;Landroidx/compose/runtime/CompositionContext;Landroidx/compose/runtime/ComposerImpl;Ljava/util/Set;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/runtime/Applier;Ljava/lang/Object;)V", "Landroidx/compose/runtime/ShouldPauseCallback;", "resume", "(Landroidx/compose/runtime/ShouldPauseCallback;)Z", "apply", "()V", "cancel", "markIncomplete$runtime", "markComplete", "applyChanges", "Landroidx/compose/runtime/PausedCompositionState;", "updateState", "(Landroidx/compose/runtime/PausedCompositionState;Landroidx/compose/runtime/PausedCompositionState;)V", "composition", "Landroidx/compose/runtime/CompositionImpl;", "getComposition", "()Landroidx/compose/runtime/CompositionImpl;", "context", "Landroidx/compose/runtime/CompositionContext;", "getContext", "()Landroidx/compose/runtime/CompositionContext;", "composer", "Landroidx/compose/runtime/ComposerImpl;", "getComposer", "()Landroidx/compose/runtime/ComposerImpl;", FirebaseAnalytics.Param.CONTENT, "Lkotlin/jvm/functions/Function2;", "getContent", "()Lkotlin/jvm/functions/Function2;", "reusable", "Z", "getReusable", "()Z", "applier", "Landroidx/compose/runtime/Applier;", "getApplier", "()Landroidx/compose/runtime/Applier;", "lock", "Ljava/lang/Object;", "getLock", "()Ljava/lang/Object;", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/internal/b;", RemoteConfigConstants.ResponseFieldKey.STATE, "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/collection/ScatterSet;", "Landroidx/compose/runtime/RecomposeScopeImpl;", "invalidScopes", "Landroidx/collection/ScatterSet;", "Landroidx/compose/runtime/internal/RememberEventDispatcher;", "rememberManager", "Landroidx/compose/runtime/internal/RememberEventDispatcher;", "getRememberManager$runtime", "()Landroidx/compose/runtime/internal/RememberEventDispatcher;", "Landroidx/compose/runtime/RecordingApplier;", "pausableApplier", "Landroidx/compose/runtime/RecordingApplier;", "getPausableApplier$runtime", "()Landroidx/compose/runtime/RecordingApplier;", "isRecomposing$runtime", "isRecomposing", "isComplete", "isApplied", "isCancelled"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PausedCompositionImpl implements PausedComposition {
    public static final int $stable = 8;
    private final Applier<?> applier;
    private final ComposerImpl composer;
    private final CompositionImpl composition;
    private final Function2<Composer, Integer, Unit> content;
    private final CompositionContext context;
    private final Object lock;
    private final RecordingApplier<Object> pausableApplier;
    private final RememberEventDispatcher rememberManager;
    private final boolean reusable;
    private AtomicReference<PausedCompositionState> state = new AtomicReference<>(PausedCompositionState.InitialPending);
    private ScatterSet<RecomposeScopeImpl> invalidScopes = ScatterSetKt.emptyScatterSet();

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PausedCompositionState.values().length];
            try {
                iArr[PausedCompositionState.InitialPending.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PausedCompositionState.RecomposePending.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PausedCompositionState.Recomposing.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PausedCompositionState.ApplyPending.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PausedCompositionState.Applied.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PausedCompositionState.Cancelled.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PausedCompositionState.Invalid.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PausedCompositionImpl(CompositionImpl compositionImpl, CompositionContext compositionContext, ComposerImpl composerImpl, Set<RememberObserver> set, Function2<? super Composer, ? super Integer, Unit> function2, boolean z, Applier<?> applier, Object obj) {
        this.composition = compositionImpl;
        this.context = compositionContext;
        this.composer = composerImpl;
        this.content = function2;
        this.reusable = z;
        this.applier = applier;
        this.lock = obj;
        RememberEventDispatcher rememberEventDispatcher = new RememberEventDispatcher();
        rememberEventDispatcher.prepare(set, composerImpl.getErrorContext$runtime());
        this.rememberManager = rememberEventDispatcher;
        this.pausableApplier = new RecordingApplier<>(applier.getCurrent());
    }

    public final CompositionImpl getComposition() {
        return this.composition;
    }

    public final CompositionContext getContext() {
        return this.context;
    }

    public final ComposerImpl getComposer() {
        return this.composer;
    }

    public final Function2<Composer, Integer, Unit> getContent() {
        return this.content;
    }

    public final boolean getReusable() {
        return this.reusable;
    }

    public final Applier<?> getApplier() {
        return this.applier;
    }

    public final Object getLock() {
        return this.lock;
    }

    /* JADX INFO: renamed from: getRememberManager$runtime, reason: from getter */
    public final RememberEventDispatcher getRememberManager() {
        return this.rememberManager;
    }

    public final RecordingApplier<Object> getPausableApplier$runtime() {
        return this.pausableApplier;
    }

    public final boolean isRecomposing$runtime() {
        return this.state.get() == PausedCompositionState.Recomposing;
    }

    @Override // androidx.compose.runtime.PausedComposition
    public final boolean isComplete() {
        return this.state.get().compareTo(PausedCompositionState.ApplyPending) >= 0;
    }

    @Override // androidx.compose.runtime.PausedComposition
    public final boolean isApplied() {
        return this.state.get() == PausedCompositionState.Applied;
    }

    @Override // androidx.compose.runtime.PausedComposition
    public final boolean isCancelled() {
        return this.state.get() == PausedCompositionState.Cancelled;
    }

    @Override // androidx.compose.runtime.PausedComposition
    public final boolean resume(ShouldPauseCallback p0) throws Exception {
        try {
            switch (WhenMappings.$EnumSwitchMapping$0[this.state.get().ordinal()]) {
                case 1:
                    if (this.reusable) {
                        this.composer.startReuseFromRoot();
                    }
                    try {
                        this.invalidScopes = this.context.composeInitialPaused$runtime(this.composition, p0, this.content);
                        if (this.reusable) {
                            this.composer.endReuseFromRoot();
                        }
                        PausedCompositionState pausedCompositionState = PausedCompositionState.InitialPending;
                        PausedCompositionState pausedCompositionState2 = PausedCompositionState.RecomposePending;
                        if (!PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.state, pausedCompositionState, pausedCompositionState2)) {
                            StringBuilder sb = new StringBuilder("Unexpected state change from: ");
                            sb.append(pausedCompositionState);
                            sb.append(" to: ");
                            sb.append(pausedCompositionState2);
                            sb.append('.');
                            PreconditionsKt.throwIllegalStateException(sb.toString());
                        }
                        if (this.invalidScopes.isEmpty()) {
                            markComplete();
                        }
                        return isComplete();
                    } catch (Throwable th) {
                        if (this.reusable) {
                            this.composer.endReuseFromRoot();
                        }
                        throw th;
                    }
                case 2:
                    PausedCompositionState pausedCompositionState3 = PausedCompositionState.RecomposePending;
                    PausedCompositionState pausedCompositionState4 = PausedCompositionState.Recomposing;
                    if (!PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.state, pausedCompositionState3, pausedCompositionState4)) {
                        StringBuilder sb2 = new StringBuilder("Unexpected state change from: ");
                        sb2.append(pausedCompositionState3);
                        sb2.append(" to: ");
                        sb2.append(pausedCompositionState4);
                        sb2.append('.');
                        PreconditionsKt.throwIllegalStateException(sb2.toString());
                    }
                    try {
                        this.invalidScopes = this.context.recomposePaused$runtime(this.composition, p0, this.invalidScopes);
                        PausedCompositionState pausedCompositionState5 = PausedCompositionState.Recomposing;
                        PausedCompositionState pausedCompositionState6 = PausedCompositionState.RecomposePending;
                        if (!PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.state, pausedCompositionState5, pausedCompositionState6)) {
                            StringBuilder sb3 = new StringBuilder("Unexpected state change from: ");
                            sb3.append(pausedCompositionState5);
                            sb3.append(" to: ");
                            sb3.append(pausedCompositionState6);
                            sb3.append('.');
                            PreconditionsKt.throwIllegalStateException(sb3.toString());
                        }
                        if (this.invalidScopes.isEmpty()) {
                            markComplete();
                        }
                        return isComplete();
                    } catch (Throwable th2) {
                        PausedCompositionState pausedCompositionState7 = PausedCompositionState.Recomposing;
                        PausedCompositionState pausedCompositionState8 = PausedCompositionState.RecomposePending;
                        if (!PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.state, pausedCompositionState7, pausedCompositionState8)) {
                            StringBuilder sb4 = new StringBuilder("Unexpected state change from: ");
                            sb4.append(pausedCompositionState7);
                            sb4.append(" to: ");
                            sb4.append(pausedCompositionState8);
                            sb4.append('.');
                            PreconditionsKt.throwIllegalStateException(sb4.toString());
                        }
                        throw th2;
                    }
                case 3:
                    ComposerKt.composeRuntimeError("Recursive call to resume()");
                    throw new KotlinNothingValueException();
                case 4:
                    throw new IllegalStateException("Pausable composition is complete and apply() should be applied".toString());
                case 5:
                    throw new IllegalStateException("The paused composition has been applied".toString());
                case 6:
                    throw new IllegalStateException("The paused composition has been cancelled".toString());
                case 7:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception".toString());
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } catch (Exception e2) {
            this.state.set(PausedCompositionState.Invalid);
            throw e2;
        }
    }

    @Override // androidx.compose.runtime.PausedComposition
    public final void apply() throws Exception {
        try {
            switch (WhenMappings.$EnumSwitchMapping$0[this.state.get().ordinal()]) {
                case 1:
                case 2:
                case 3:
                    throw new IllegalStateException("The paused composition has not completed yet".toString());
                case 4:
                    applyChanges();
                    PausedCompositionState pausedCompositionState = PausedCompositionState.ApplyPending;
                    PausedCompositionState pausedCompositionState2 = PausedCompositionState.Applied;
                    if (PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.state, pausedCompositionState, pausedCompositionState2)) {
                        return;
                    }
                    StringBuilder sb = new StringBuilder("Unexpected state change from: ");
                    sb.append(pausedCompositionState);
                    sb.append(" to: ");
                    sb.append(pausedCompositionState2);
                    sb.append('.');
                    PreconditionsKt.throwIllegalStateException(sb.toString());
                    return;
                case 5:
                    throw new IllegalStateException("The paused composition has already been applied".toString());
                case 6:
                    throw new IllegalStateException("The paused composition has been cancelled".toString());
                case 7:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception".toString());
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } catch (Exception e2) {
            this.state.set(PausedCompositionState.Invalid);
            throw e2;
        }
    }

    @Override // androidx.compose.runtime.PausedComposition
    public final void cancel() {
        this.state.set(PausedCompositionState.Cancelled);
        ScatterSet<RememberObserverHolder> scatterSetExtractRememberSet = this.rememberManager.extractRememberSet();
        this.rememberManager.dispatchAbandons();
        this.composition.pausedCompositionFinished$runtime(scatterSetExtractRememberSet);
    }

    public final void markIncomplete$runtime() {
        if (this.state.get() != PausedCompositionState.RecomposePending) {
            PausedCompositionState pausedCompositionState = PausedCompositionState.ApplyPending;
            PausedCompositionState pausedCompositionState2 = PausedCompositionState.RecomposePending;
            if (PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.state, pausedCompositionState, pausedCompositionState2)) {
                return;
            }
            StringBuilder sb = new StringBuilder("Unexpected state change from: ");
            sb.append(pausedCompositionState);
            sb.append(" to: ");
            sb.append(pausedCompositionState2);
            sb.append('.');
            PreconditionsKt.throwIllegalStateException(sb.toString());
        }
    }

    private final void markComplete() {
        PausedCompositionState pausedCompositionState = PausedCompositionState.RecomposePending;
        PausedCompositionState pausedCompositionState2 = PausedCompositionState.ApplyPending;
        if (PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.state, pausedCompositionState, pausedCompositionState2)) {
            return;
        }
        StringBuilder sb = new StringBuilder("Unexpected state change from: ");
        sb.append(pausedCompositionState);
        sb.append(" to: ");
        sb.append(pausedCompositionState2);
        sb.append('.');
        PreconditionsKt.throwIllegalStateException(sb.toString());
    }

    private final void applyChanges() {
        synchronized (this.lock) {
            try {
                RecordingApplier<Object> recordingApplier = this.pausableApplier;
                Applier<?> applier = this.applier;
                Intrinsics.checkNotNull(applier, "");
                recordingApplier.playTo(applier, this.rememberManager);
                this.rememberManager.dispatchRememberObservers();
                this.rememberManager.dispatchSideEffects();
                this.rememberManager.dispatchAbandons();
                this.composition.pausedCompositionFinished$runtime(null);
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                this.rememberManager.dispatchAbandons();
                this.composition.pausedCompositionFinished$runtime(null);
                throw th;
            }
        }
    }

    private final void updateState(PausedCompositionState p0, PausedCompositionState p1) {
        if (PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.state, p0, p1)) {
            return;
        }
        StringBuilder sb = new StringBuilder("Unexpected state change from: ");
        sb.append(p0);
        sb.append(" to: ");
        sb.append(p1);
        sb.append('.');
        PreconditionsKt.throwIllegalStateException(sb.toString());
    }
}
