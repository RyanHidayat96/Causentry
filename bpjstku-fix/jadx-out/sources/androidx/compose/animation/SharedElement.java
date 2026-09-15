package androidx.compose.animation;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.Size;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\rJ(\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0010ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\nJ\r\u0010\u0018\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\u0016J\r\u0010\u0019\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u0016R/\u0010!\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0002\u001a\u0004\u0018\u00010\u001a8C@CX\u0083\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R/\u0010%\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0002\u001a\u0004\u0018\u00010\u001a8G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\u001e\"\u0004\b$\u0010 R+\u0010*\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u000b8G@CX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b&\u0010\u001c\u001a\u0004\b'\u0010\r\"\u0004\b(\u0010)R\u001a\u0010+\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\b0/8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001a\u00102\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R \u00107\u001a\b\u0012\u0004\u0012\u00020\u0007068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0013\u0010<\u001a\u0004\u0018\u00010\u001a8G¢\u0006\u0006\u001a\u0004\b;\u0010\u001eR(\u0010=\u001a\u0004\u0018\u00010\u00072\b\u0010\u0002\u001a\u0004\u0018\u00010\u00078\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0A8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010B\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001"}, d2 = {"Landroidx/compose/animation/SharedElement;", "", "p0", "Landroidx/compose/animation/SharedTransitionScopeImpl;", "p1", "<init>", "(Ljava/lang/Object;Landroidx/compose/animation/SharedTransitionScopeImpl;)V", "Landroidx/compose/animation/SharedElementInternalState;", "", "addState", "(Landroidx/compose/animation/SharedElementInternalState;)V", "", "hasVisibleContent", "()Z", "isAnimating", "Landroidx/compose/ui/geometry/Size;", "Landroidx/compose/ui/geometry/Offset;", "p2", "onLookaheadResult-v_w8tDc", "(Landroidx/compose/animation/SharedElementInternalState;JJ)V", "onLookaheadResult", "onSharedTransitionFinished", "()V", "removeState", "updateMatch", "updateTargetBoundsProvider", "Landroidx/compose/ui/geometry/Rect;", "_targetBounds$delegate", "Landroidx/compose/runtime/MutableState;", "get_targetBounds", "()Landroidx/compose/ui/geometry/Rect;", "set_targetBounds", "(Landroidx/compose/ui/geometry/Rect;)V", "_targetBounds", "currentBounds$delegate", "getCurrentBounds", "setCurrentBounds", "currentBounds", "foundMatch$delegate", "getFoundMatch", "setFoundMatch", "(Z)V", "foundMatch", "key", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "Lkotlin/Function0;", "observingVisibilityChange", "Lkotlin/jvm/functions/Function0;", "scope", "Landroidx/compose/animation/SharedTransitionScopeImpl;", "getScope", "()Landroidx/compose/animation/SharedTransitionScopeImpl;", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "states", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "getStates", "()Landroidx/compose/runtime/snapshots/SnapshotStateList;", "getTargetBounds", "targetBounds", "targetBoundsProvider", "Landroidx/compose/animation/SharedElementInternalState;", "getTargetBoundsProvider$animation_release", "()Landroidx/compose/animation/SharedElementInternalState;", "Lkotlin/Function1;", "Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SharedElement {
    public static final int $stable = 8;
    private final Object key;
    private final SharedTransitionScopeImpl scope;
    private SharedElementInternalState targetBoundsProvider;

    /* JADX INFO: renamed from: _targetBounds$delegate, reason: from kotlin metadata */
    private final MutableState _targetBounds = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* JADX INFO: renamed from: foundMatch$delegate, reason: from kotlin metadata */
    private final MutableState foundMatch = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: currentBounds$delegate, reason: from kotlin metadata */
    private final MutableState currentBounds = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    private final SnapshotStateList<SharedElementInternalState> states = SnapshotStateKt.mutableStateListOf();
    private final Function1<SharedElement, Unit> updateMatch = new Function1<SharedElement, Unit>() { // from class: androidx.compose.animation.SharedElement.updateMatch.1
        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Unit invoke(SharedElement sharedElement) {
            invoke2(sharedElement);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(SharedElement sharedElement) {
            SharedElement.this.updateMatch();
        }

        {
            super(1);
        }
    };
    private final Function0<Unit> observingVisibilityChange = new Function0<Unit>() { // from class: androidx.compose.animation.SharedElement$observingVisibilityChange$1
        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.this$0.hasVisibleContent();
        }

        {
            super(0);
        }
    };

    public SharedElement(Object obj, SharedTransitionScopeImpl sharedTransitionScopeImpl) {
        this.key = obj;
        this.scope = sharedTransitionScopeImpl;
    }

    public final Object getKey() {
        return this.key;
    }

    public final SharedTransitionScopeImpl getScope() {
        return this.scope;
    }

    public final boolean isAnimating() {
        SnapshotStateList<SharedElementInternalState> snapshotStateList = this.states;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            if (snapshotStateList.get(i).getBoundsAnimation().isRunning()) {
                if (getFoundMatch()) {
                    return true;
                }
            }
        }
        return false;
    }

    private final Rect get_targetBounds() {
        return (Rect) this._targetBounds.getValue();
    }

    private final void set_targetBounds(Rect rect) {
        this._targetBounds.setValue(rect);
    }

    public final Rect getTargetBounds() {
        SharedElementInternalState sharedElementInternalState = this.targetBoundsProvider;
        set_targetBounds(sharedElementInternalState != null ? RectKt.m4014Recttz77jQw(sharedElementInternalState.m427calculateLookaheadOffsetF1C5BW0(), sharedElementInternalState.m428getNonNullLookaheadSizeNHjbRc()) : null);
        return get_targetBounds();
    }

    public final void updateMatch() {
        boolean zHasVisibleContent = hasVisibleContent();
        if (this.states.size() > 1 && zHasVisibleContent) {
            setFoundMatch(true);
        } else if (!this.scope.isTransitionActive() || !zHasVisibleContent) {
            setFoundMatch(false);
        }
        if (this.states.isEmpty()) {
            return;
        }
        SharedTransitionScopeKt.getSharedTransitionObserver().observeReads(this, this.updateMatch, this.observingVisibilityChange);
    }

    private final void setFoundMatch(boolean z) {
        this.foundMatch.setValue(Boolean.valueOf(z));
    }

    public final boolean getFoundMatch() {
        return ((Boolean) this.foundMatch.getValue()).booleanValue();
    }

    public final Rect getCurrentBounds() {
        return (Rect) this.currentBounds.getValue();
    }

    public final void setCurrentBounds(Rect rect) {
        this.currentBounds.setValue(rect);
    }

    /* JADX INFO: renamed from: getTargetBoundsProvider$animation_release, reason: from getter */
    public final SharedElementInternalState getTargetBoundsProvider() {
        return this.targetBoundsProvider;
    }

    /* JADX INFO: renamed from: onLookaheadResult-v_w8tDc, reason: not valid java name */
    public final void m426onLookaheadResultv_w8tDc(SharedElementInternalState p0, long p1, long p2) {
        if (p0.getBoundsAnimation().getTarget()) {
            this.targetBoundsProvider = p0;
            Rect rect = get_targetBounds();
            Offset offsetM3963boximpl = rect != null ? Offset.m3963boximpl(rect.m4009getTopLeftF1C5BW0()) : null;
            if (offsetM3963boximpl != null && Offset.m3971equalsimpl0(offsetM3963boximpl.m3984unboximpl(), p2)) {
                Rect rect2 = get_targetBounds();
                Size sizeM4031boximpl = rect2 != null ? Size.m4031boximpl(rect2.m4007getSizeNHjbRc()) : null;
                if (sizeM4031boximpl != null && Size.m4039equalsimpl0(sizeM4031boximpl.m4048unboximpl(), p1)) {
                    return;
                }
            }
            Rect rectM4014Recttz77jQw = RectKt.m4014Recttz77jQw(p2, p1);
            set_targetBounds(rectM4014Recttz77jQw);
            SnapshotStateList<SharedElementInternalState> snapshotStateList = this.states;
            int size = snapshotStateList.size();
            for (int i = 0; i < size; i++) {
                BoundsAnimation boundsAnimation = snapshotStateList.get(i).getBoundsAnimation();
                Rect currentBounds = getCurrentBounds();
                Intrinsics.checkNotNull(currentBounds);
                boundsAnimation.animate(currentBounds, rectM4014Recttz77jQw);
            }
        }
    }

    public final SnapshotStateList<SharedElementInternalState> getStates() {
        return this.states;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean hasVisibleContent() {
        SnapshotStateList<SharedElementInternalState> snapshotStateList = this.states;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            if (snapshotStateList.get(i).getBoundsAnimation().getTarget()) {
                return true;
            }
        }
        return false;
    }

    public final void updateTargetBoundsProvider() {
        SnapshotStateList<SharedElementInternalState> snapshotStateList = this.states;
        int size = snapshotStateList.size() - 1;
        SharedElementInternalState sharedElementInternalState = null;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                SharedElementInternalState sharedElementInternalState2 = snapshotStateList.get(size);
                if (sharedElementInternalState2.getBoundsAnimation().getTarget()) {
                    sharedElementInternalState = sharedElementInternalState2;
                }
                if (i < 0) {
                    break;
                } else {
                    size = i;
                }
            }
        }
        if (Intrinsics.areEqual(sharedElementInternalState, this.targetBoundsProvider)) {
            return;
        }
        this.targetBoundsProvider = sharedElementInternalState;
        set_targetBounds(null);
    }

    public final void onSharedTransitionFinished() {
        setFoundMatch(this.states.size() > 1 && hasVisibleContent());
        set_targetBounds(null);
    }

    public final void addState(SharedElementInternalState p0) {
        this.states.add(p0);
        SharedTransitionScopeKt.getSharedTransitionObserver().observeReads(this, this.updateMatch, this.observingVisibilityChange);
    }

    public final void removeState(SharedElementInternalState p0) {
        this.states.remove(p0);
        if (this.states.isEmpty()) {
            updateMatch();
            SharedTransitionScopeKt.getSharedTransitionObserver().clear(this);
        } else {
            SharedTransitionScopeKt.getSharedTransitionObserver().observeReads(this, this.updateMatch, this.observingVisibilityChange);
        }
    }
}
