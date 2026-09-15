package androidx.compose.animation;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b9\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002BG\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0017\u001a\u00020\u0014ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0004\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001f\u0010\u001dR+\u0010&\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00058G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010(\u001a\u0004\u0018\u00010'8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R/\u00104\u001a\u0004\u0018\u00010.2\b\u0010\u0004\u001a\u0004\u0018\u00010.8G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b/\u0010!\u001a\u0004\b0\u00101\"\u0004\b2\u00103R*\u00107\u001a\n\u0012\u0006\u0012\u0004\u0018\u000106058\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u0014\u0010?\u001a\u00020=8Gø\u0001\u0001¢\u0006\u0006\u001a\u0004\b>\u0010\u0016R+\u0010E\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000b8G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b@\u0010!\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR$\u0010F\u001a\u0004\u0018\u00010\u00008\u0017@\u0017X\u0097\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR+\u0010Q\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00078G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\bL\u0010!\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR+\u0010W\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\t8G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\bR\u0010!\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR+\u0010[\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\t8G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\bX\u0010!\u001a\u0004\bY\u0010T\"\u0004\bZ\u0010VR+\u0010a\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00038G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b\\\u0010!\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\u0014\u0010c\u001a\u00020\t8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\bb\u0010TR\u0014\u0010e\u001a\u00020\t8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bd\u0010TR\u0011\u0010g\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\bf\u0010TR\u0011\u0010i\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\bh\u0010TR+\u0010o\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u000e8G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\bj\u0010!\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR+\u0010v\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u00108W@WX\u0097\u008e\u0002¢\u0006\u0012\n\u0004\bp\u0010q\u001a\u0004\br\u0010s\"\u0004\bt\u0010u\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!"}, d2 = {"Landroidx/compose/animation/SharedElementInternalState;", "Landroidx/compose/animation/LayerRenderer;", "Landroidx/compose/runtime/RememberObserver;", "Landroidx/compose/animation/SharedElement;", "p0", "Landroidx/compose/animation/BoundsAnimation;", "p1", "Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;", "p2", "", "p3", "Landroidx/compose/animation/SharedTransitionScope$OverlayClip;", "p4", "p5", "Landroidx/compose/animation/SharedTransitionScope$SharedContentState;", "p6", "", "p7", "<init>", "(Landroidx/compose/animation/SharedElement;Landroidx/compose/animation/BoundsAnimation;Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;ZLandroidx/compose/animation/SharedTransitionScope$OverlayClip;ZLandroidx/compose/animation/SharedTransitionScope$SharedContentState;F)V", "Landroidx/compose/ui/geometry/Offset;", "calculateLookaheadOffset-F1C5BW0", "()J", "calculateLookaheadOffset", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "drawInOverlay", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "onAbandoned", "()V", "onForgotten", "onRemembered", "boundsAnimation$delegate", "Landroidx/compose/runtime/MutableState;", "getBoundsAnimation", "()Landroidx/compose/animation/BoundsAnimation;", "setBoundsAnimation", "(Landroidx/compose/animation/BoundsAnimation;)V", "boundsAnimation", "Landroidx/compose/ui/graphics/Path;", "clipPathInOverlay", "Landroidx/compose/ui/graphics/Path;", "getClipPathInOverlay$animation_release", "()Landroidx/compose/ui/graphics/Path;", "setClipPathInOverlay$animation_release", "(Landroidx/compose/ui/graphics/Path;)V", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer$delegate", "getLayer", "()Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "setLayer", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "layer", "Lkotlin/Function0;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "lookaheadCoords", "Lkotlin/jvm/functions/Function0;", "getLookaheadCoords", "()Lkotlin/jvm/functions/Function0;", "setLookaheadCoords", "(Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/ui/geometry/Size;", "getNonNullLookaheadSize-NH-jbRc", "nonNullLookaheadSize", "overlayClip$delegate", "getOverlayClip", "()Landroidx/compose/animation/SharedTransitionScope$OverlayClip;", "setOverlayClip", "(Landroidx/compose/animation/SharedTransitionScope$OverlayClip;)V", "overlayClip", "parentState", "Landroidx/compose/animation/SharedElementInternalState;", "getParentState", "()Landroidx/compose/animation/SharedElementInternalState;", "setParentState", "(Landroidx/compose/animation/SharedElementInternalState;)V", "placeHolderSize$delegate", "getPlaceHolderSize", "()Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;", "setPlaceHolderSize", "(Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;)V", "placeHolderSize", "renderInOverlayDuringTransition$delegate", "getRenderInOverlayDuringTransition", "()Z", "setRenderInOverlayDuringTransition", "(Z)V", "renderInOverlayDuringTransition", "renderOnlyWhenVisible$delegate", "getRenderOnlyWhenVisible", "setRenderOnlyWhenVisible", "renderOnlyWhenVisible", "sharedElement$delegate", "getSharedElement", "()Landroidx/compose/animation/SharedElement;", "setSharedElement", "(Landroidx/compose/animation/SharedElement;)V", "sharedElement", "getShouldRenderBasedOnTarget", "shouldRenderBasedOnTarget", "getShouldRenderInOverlay$animation_release", "shouldRenderInOverlay", "getShouldRenderInPlace", "shouldRenderInPlace", "getTarget", TypedValues.AttributesType.S_TARGET, "userState$delegate", "getUserState", "()Landroidx/compose/animation/SharedTransitionScope$SharedContentState;", "setUserState", "(Landroidx/compose/animation/SharedTransitionScope$SharedContentState;)V", "userState", "zIndex$delegate", "Landroidx/compose/runtime/MutableFloatState;", "getZIndex", "()F", "setZIndex", "(F)V", "zIndex"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SharedElementInternalState implements LayerRenderer, RememberObserver {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: boundsAnimation$delegate, reason: from kotlin metadata */
    private final MutableState boundsAnimation;
    private Path clipPathInOverlay;

    /* JADX INFO: renamed from: overlayClip$delegate, reason: from kotlin metadata */
    private final MutableState overlayClip;
    private SharedElementInternalState parentState;

    /* JADX INFO: renamed from: placeHolderSize$delegate, reason: from kotlin metadata */
    private final MutableState placeHolderSize;

    /* JADX INFO: renamed from: renderInOverlayDuringTransition$delegate, reason: from kotlin metadata */
    private final MutableState renderInOverlayDuringTransition;

    /* JADX INFO: renamed from: renderOnlyWhenVisible$delegate, reason: from kotlin metadata */
    private final MutableState renderOnlyWhenVisible;

    /* JADX INFO: renamed from: sharedElement$delegate, reason: from kotlin metadata */
    private final MutableState sharedElement;

    /* JADX INFO: renamed from: userState$delegate, reason: from kotlin metadata */
    private final MutableState userState;

    /* JADX INFO: renamed from: zIndex$delegate, reason: from kotlin metadata */
    private final MutableFloatState zIndex;
    private Function0<? extends LayoutCoordinates> lookaheadCoords = new Function0() { // from class: androidx.compose.animation.SharedElementInternalState$lookaheadCoords$1
        @Override // kotlin.jvm.functions.Function0
        public final Void invoke() {
            return null;
        }
    };

    /* JADX INFO: renamed from: layer$delegate, reason: from kotlin metadata */
    private final MutableState layer = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    @Override // androidx.compose.runtime.RememberObserver
    public final void onAbandoned() {
    }

    public SharedElementInternalState(SharedElement sharedElement, BoundsAnimation boundsAnimation, SharedTransitionScope.PlaceHolderSize placeHolderSize, boolean z, SharedTransitionScope.OverlayClip overlayClip, boolean z2, SharedTransitionScope.SharedContentState sharedContentState, float f) {
        this.zIndex = PrimitiveSnapshotStateKt.mutableFloatStateOf(f);
        this.renderInOverlayDuringTransition = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z2), null, 2, null);
        this.sharedElement = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(sharedElement, null, 2, null);
        this.boundsAnimation = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(boundsAnimation, null, 2, null);
        this.placeHolderSize = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(placeHolderSize, null, 2, null);
        this.renderOnlyWhenVisible = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z), null, 2, null);
        this.overlayClip = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(overlayClip, null, 2, null);
        this.userState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(sharedContentState, null, 2, null);
    }

    @Override // androidx.compose.animation.LayerRenderer
    public final float getZIndex() {
        return this.zIndex.getFloatValue();
    }

    public final void setZIndex(float f) {
        this.zIndex.setFloatValue(f);
    }

    public final boolean getRenderInOverlayDuringTransition() {
        return ((Boolean) this.renderInOverlayDuringTransition.getValue()).booleanValue();
    }

    public final void setRenderInOverlayDuringTransition(boolean z) {
        this.renderInOverlayDuringTransition.setValue(Boolean.valueOf(z));
    }

    public final SharedElement getSharedElement() {
        return (SharedElement) this.sharedElement.getValue();
    }

    public final void setSharedElement(SharedElement sharedElement) {
        this.sharedElement.setValue(sharedElement);
    }

    public final BoundsAnimation getBoundsAnimation() {
        return (BoundsAnimation) this.boundsAnimation.getValue();
    }

    public final void setBoundsAnimation(BoundsAnimation boundsAnimation) {
        this.boundsAnimation.setValue(boundsAnimation);
    }

    public final SharedTransitionScope.PlaceHolderSize getPlaceHolderSize() {
        return (SharedTransitionScope.PlaceHolderSize) this.placeHolderSize.getValue();
    }

    public final void setPlaceHolderSize(SharedTransitionScope.PlaceHolderSize placeHolderSize) {
        this.placeHolderSize.setValue(placeHolderSize);
    }

    public final boolean getRenderOnlyWhenVisible() {
        return ((Boolean) this.renderOnlyWhenVisible.getValue()).booleanValue();
    }

    public final void setRenderOnlyWhenVisible(boolean z) {
        this.renderOnlyWhenVisible.setValue(Boolean.valueOf(z));
    }

    public final SharedTransitionScope.OverlayClip getOverlayClip() {
        return (SharedTransitionScope.OverlayClip) this.overlayClip.getValue();
    }

    public final void setOverlayClip(SharedTransitionScope.OverlayClip overlayClip) {
        this.overlayClip.setValue(overlayClip);
    }

    public final SharedTransitionScope.SharedContentState getUserState() {
        return (SharedTransitionScope.SharedContentState) this.userState.getValue();
    }

    public final void setUserState(SharedTransitionScope.SharedContentState sharedContentState) {
        this.userState.setValue(sharedContentState);
    }

    /* JADX INFO: renamed from: getClipPathInOverlay$animation_release, reason: from getter */
    public final Path getClipPathInOverlay() {
        return this.clipPathInOverlay;
    }

    public final void setClipPathInOverlay$animation_release(Path path) {
        this.clipPathInOverlay = path;
    }

    @Override // androidx.compose.animation.LayerRenderer
    public final void drawInOverlay(DrawScope p0) {
        GraphicsLayer layer = getLayer();
        if (layer == null || !getShouldRenderInOverlay$animation_release()) {
            return;
        }
        if (getSharedElement().getCurrentBounds() == null) {
            throw new IllegalArgumentException("Error: current bounds not set yet.".toString());
        }
        Rect currentBounds = getSharedElement().getCurrentBounds();
        Unit unit = null;
        Offset offsetM3963boximpl = currentBounds != null ? Offset.m3963boximpl(currentBounds.m4009getTopLeftF1C5BW0()) : null;
        Intrinsics.checkNotNull(offsetM3963boximpl);
        long jM3984unboximpl = offsetM3963boximpl.m3984unboximpl();
        float fM3974getXimpl = Offset.m3974getXimpl(jM3984unboximpl);
        float fM3975getYimpl = Offset.m3975getYimpl(jM3984unboximpl);
        Path path = this.clipPathInOverlay;
        if (path != null) {
            int iM4207getIntersectrtfAjoo = ClipOp.INSTANCE.m4207getIntersectrtfAjoo();
            DrawContext drawContext = p0.getDrawContext();
            long jMo4719getSizeNHjbRc = drawContext.mo4719getSizeNHjbRc();
            drawContext.getCanvas().save();
            try {
                drawContext.getTransform().mo4721clipPathmtrdDE(path, iM4207getIntersectrtfAjoo);
                p0.getDrawContext().getTransform().translate(fM3974getXimpl, fM3975getYimpl);
                try {
                    GraphicsLayerKt.drawLayer(p0, layer);
                    p0.getDrawContext().getTransform().translate(-fM3974getXimpl, -fM3975getYimpl);
                    drawContext.getCanvas().restore();
                    drawContext.mo4720setSizeuvyYCjk(jMo4719getSizeNHjbRc);
                    unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    p0.getDrawContext().getTransform().translate(-fM3974getXimpl, -fM3975getYimpl);
                    throw th;
                }
            } catch (Throwable th2) {
                drawContext.getCanvas().restore();
                drawContext.mo4720setSizeuvyYCjk(jMo4719getSizeNHjbRc);
                throw th2;
            }
        }
        if (unit == null) {
            p0.getDrawContext().getTransform().translate(fM3974getXimpl, fM3975getYimpl);
            try {
                GraphicsLayerKt.drawLayer(p0, layer);
            } finally {
                p0.getDrawContext().getTransform().translate(-fM3974getXimpl, -fM3975getYimpl);
            }
        }
    }

    /* JADX INFO: renamed from: getNonNullLookaheadSize-NH-jbRc, reason: not valid java name */
    public final long m428getNonNullLookaheadSizeNHjbRc() {
        LayoutCoordinates layoutCoordinatesInvoke = this.lookaheadCoords.invoke();
        if (layoutCoordinatesInvoke == null) {
            StringBuilder sb = new StringBuilder("Error: lookahead coordinates is null for ");
            sb.append(getSharedElement().getKey());
            sb.append('.');
            throw new IllegalArgumentException(sb.toString().toString());
        }
        return IntSizeKt.m7118toSizeozmzZPI(layoutCoordinatesInvoke.mo5645getSizeYbymL2g());
    }

    public final Function0<LayoutCoordinates> getLookaheadCoords() {
        return this.lookaheadCoords;
    }

    public final void setLookaheadCoords(Function0<? extends LayoutCoordinates> function0) {
        this.lookaheadCoords = function0;
    }

    @Override // androidx.compose.animation.LayerRenderer
    public final SharedElementInternalState getParentState() {
        return this.parentState;
    }

    public final void setParentState(SharedElementInternalState sharedElementInternalState) {
        this.parentState = sharedElementInternalState;
    }

    /* JADX INFO: renamed from: calculateLookaheadOffset-F1C5BW0, reason: not valid java name */
    public final long m427calculateLookaheadOffsetF1C5BW0() {
        LayoutCoordinates layoutCoordinatesInvoke = this.lookaheadCoords.invoke();
        if (layoutCoordinatesInvoke == null) {
            throw new IllegalArgumentException("Error: lookahead coordinates is null.".toString());
        }
        return getSharedElement().getScope().getLookaheadRoot$animation_release().mo5646localPositionOfR5De75A(layoutCoordinatesInvoke, Offset.INSTANCE.m3990getZeroF1C5BW0());
    }

    public final boolean getTarget() {
        return getBoundsAnimation().getTarget();
    }

    public final GraphicsLayer getLayer() {
        return (GraphicsLayer) this.layer.getValue();
    }

    public final void setLayer(GraphicsLayer graphicsLayer) {
        this.layer.setValue(graphicsLayer);
    }

    private final boolean getShouldRenderBasedOnTarget() {
        return Intrinsics.areEqual(getSharedElement().getTargetBoundsProvider(), this) || !getRenderOnlyWhenVisible();
    }

    public final boolean getShouldRenderInOverlay$animation_release() {
        return getShouldRenderBasedOnTarget() && getSharedElement().getFoundMatch() && getRenderInOverlayDuringTransition();
    }

    public final boolean getShouldRenderInPlace() {
        if (getSharedElement().getFoundMatch()) {
            return !getShouldRenderInOverlay$animation_release() && getShouldRenderBasedOnTarget();
        }
        return true;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onRemembered() {
        getSharedElement().getScope().onStateAdded$animation_release(this);
        getSharedElement().updateTargetBoundsProvider();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onForgotten() {
        getSharedElement().getScope().onStateRemoved$animation_release(this);
        getSharedElement().updateTargetBoundsProvider();
    }
}
