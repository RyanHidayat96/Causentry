package androidx.compose.animation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerKt;
import androidx.compose.ui.layout.ApproachLayoutModifierNode;
import androidx.compose.ui.layout.ApproachMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.modifier.ModifierLocalMap;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.modifier.ModifierLocalModifierNodeKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\r\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J&\u0010\u001d\u001a\u00020\u001a*\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0018H\u0017ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001f\u001a\u00020\u000e*\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J&\u0010$\u001a\u00020\u001a*\u00020!2\u0006\u0010\u0006\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0018H\u0017ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u001b\u0010&\u001a\u00020\u001a*\u00020!2\u0006\u0010\u0006\u001a\u00020%H\u0002¢\u0006\u0004\b&\u0010'J\u0013\u0010(\u001a\u00020\u000e*\u00020\u0013H\u0002¢\u0006\u0004\b(\u0010)R\u0014\u0010-\u001a\u00020*8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R(\u0010/\u001a\u0004\u0018\u00010.2\b\u0010\u0006\u001a\u0004\u0018\u00010.8\u0002@CX\u0083\u000e¢\u0006\f\n\u0004\b/\u00100\"\u0004\b1\u00102R\u001a\u00104\u001a\u0002038\u0017X\u0097\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0014\u00109\u001a\u00020\u00138CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u0010\u0015R\u0014\u0010;\u001a\u00020\u00138CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b:\u0010\u0015R\u0014\u0010?\u001a\u00020<8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R*\u0010@\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00058\u0007@AX\u0087\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010\b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001"}, d2 = {"Landroidx/compose/animation/SharedBoundsNode;", "Landroidx/compose/ui/layout/ApproachLayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/modifier/ModifierLocalModifierNode;", "Landroidx/compose/animation/SharedElementInternalState;", "p0", "<init>", "(Landroidx/compose/animation/SharedElementInternalState;)V", "Landroidx/compose/ui/unit/IntSize;", "", "isMeasurementApproachInProgress-ozmzZPI", "(J)Z", "isMeasurementApproachInProgress", "", "onAttach", "()V", "onDetach", "onReset", "Landroidx/compose/ui/layout/LayoutCoordinates;", "requireLookaheadLayoutCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/layout/ApproachMeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/unit/Constraints;", "p1", "Landroidx/compose/ui/layout/MeasureResult;", "approachMeasure-3p2s80s", "(Landroidx/compose/ui/layout/ApproachMeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "approachMeasure", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "draw", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "Landroidx/compose/ui/layout/MeasureScope;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/layout/Placeable;", "place", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;)Landroidx/compose/ui/layout/MeasureResult;", "updateCurrentBounds", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "Landroidx/compose/animation/BoundsAnimation;", "getBoundsAnimation", "()Landroidx/compose/animation/BoundsAnimation;", "boundsAnimation", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "setLayer", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "Landroidx/compose/ui/modifier/ModifierLocalMap;", "providedValues", "Landroidx/compose/ui/modifier/ModifierLocalMap;", "getProvidedValues", "()Landroidx/compose/ui/modifier/ModifierLocalMap;", "getRootCoords", "rootCoords", "getRootLookaheadCoords", "rootLookaheadCoords", "Landroidx/compose/animation/SharedElement;", "getSharedElement", "()Landroidx/compose/animation/SharedElement;", "sharedElement", RemoteConfigConstants.ResponseFieldKey.STATE, "Landroidx/compose/animation/SharedElementInternalState;", "getState", "()Landroidx/compose/animation/SharedElementInternalState;", "setState$animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SharedBoundsNode extends Modifier.Node implements ApproachLayoutModifierNode, DrawModifierNode, ModifierLocalModifierNode {
    public static final int $stable = 8;
    private GraphicsLayer layer;
    private final ModifierLocalMap providedValues;
    private SharedElementInternalState state;

    public SharedBoundsNode(SharedElementInternalState sharedElementInternalState) {
        this.state = sharedElementInternalState;
        this.layer = sharedElementInternalState.getLayer();
        this.providedValues = ModifierLocalModifierNodeKt.modifierLocalMapOf(TuplesKt.to(SharedContentNodeKt.getModifierLocalSharedElementInternalState(), sharedElementInternalState));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LayoutCoordinates getRootCoords() {
        return getSharedElement().getScope().getRoot$animation_release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LayoutCoordinates getRootLookaheadCoords() {
        return getSharedElement().getScope().getLookaheadRoot$animation_release();
    }

    public final SharedElementInternalState getState() {
        return this.state;
    }

    public final void setState$animation_release(SharedElementInternalState sharedElementInternalState) {
        if (Intrinsics.areEqual(sharedElementInternalState, this.state)) {
            return;
        }
        this.state = sharedElementInternalState;
        if (getIsAttached()) {
            provide(SharedContentNodeKt.getModifierLocalSharedElementInternalState(), sharedElementInternalState);
            this.state.setParentState((SharedElementInternalState) getCurrent(SharedContentNodeKt.getModifierLocalSharedElementInternalState()));
            this.state.setLayer(this.layer);
            this.state.setLookaheadCoords(new Function0<LayoutCoordinates>() { // from class: androidx.compose.animation.SharedBoundsNode$state$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final LayoutCoordinates invoke() {
                    return this.this$0.requireLookaheadLayoutCoordinates();
                }

                {
                    super(0);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LayoutCoordinates requireLookaheadLayoutCoordinates() {
        return this.state.getSharedElement().getScope().toLookaheadCoordinates(DelegatableNodeKt.requireLayoutCoordinates(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BoundsAnimation getBoundsAnimation() {
        return this.state.getBoundsAnimation();
    }

    private final void setLayer(GraphicsLayer graphicsLayer) {
        if (graphicsLayer == null) {
            GraphicsLayer graphicsLayer2 = this.layer;
            if (graphicsLayer2 != null) {
                DelegatableNodeKt.requireGraphicsContext(this).releaseGraphicsLayer(graphicsLayer2);
            }
        } else {
            this.state.setLayer(graphicsLayer);
        }
        this.layer = graphicsLayer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SharedElement getSharedElement() {
        return this.state.getSharedElement();
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode
    public final ModifierLocalMap getProvidedValues() {
        return this.providedValues;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        super.onAttach();
        provide(SharedContentNodeKt.getModifierLocalSharedElementInternalState(), this.state);
        this.state.setParentState((SharedElementInternalState) getCurrent(SharedContentNodeKt.getModifierLocalSharedElementInternalState()));
        setLayer(DelegatableNodeKt.requireGraphicsContext(this).createGraphicsLayer());
        this.state.setLookaheadCoords(new Function0<LayoutCoordinates>() { // from class: androidx.compose.animation.SharedBoundsNode.onAttach.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final LayoutCoordinates invoke() {
                return SharedBoundsNode.this.requireLookaheadLayoutCoordinates();
            }

            {
                super(0);
            }
        });
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        super.onDetach();
        setLayer(null);
        this.state.setParentState(null);
        this.state.setLookaheadCoords(new Function0() { // from class: androidx.compose.animation.SharedBoundsNode.onDetach.1
            @Override // kotlin.jvm.functions.Function0
            public final Void invoke() {
                return null;
            }
        });
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onReset() {
        super.onReset();
        GraphicsLayer graphicsLayer = this.layer;
        if (graphicsLayer != null) {
            DelegatableNodeKt.requireGraphicsContext(this).releaseGraphicsLayer(graphicsLayer);
        }
        setLayer(DelegatableNodeKt.requireGraphicsContext(this).createGraphicsLayer());
    }

    @Override // androidx.compose.ui.layout.ApproachLayoutModifierNode, androidx.compose.ui.node.LayoutModifierNode
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final MeasureResult mo412measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        final Placeable placeableMo5637measureBRTryo0 = measurable.mo5637measureBRTryo0(j);
        final long jSize = SizeKt.Size(placeableMo5637measureBRTryo0.getWidth(), placeableMo5637measureBRTryo0.getHeight());
        return MeasureScope.layout$default(measureScope, placeableMo5637measureBRTryo0.getWidth(), placeableMo5637measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.animation.SharedBoundsNode$measure$1
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope placementScope) {
                Offset offsetM3963boximpl;
                LayoutCoordinates coordinates = placementScope.getCoordinates();
                if (coordinates != null) {
                    SharedBoundsNode sharedBoundsNode = this;
                    long j2 = jSize;
                    long jMo5646localPositionOfR5De75A = sharedBoundsNode.getRootLookaheadCoords().mo5646localPositionOfR5De75A(coordinates, Offset.INSTANCE.m3990getZeroF1C5BW0());
                    if (sharedBoundsNode.getSharedElement().getCurrentBounds() == null) {
                        sharedBoundsNode.getSharedElement().setCurrentBounds(RectKt.m4014Recttz77jQw(jMo5646localPositionOfR5De75A, j2));
                    }
                    offsetM3963boximpl = Offset.m3963boximpl(jMo5646localPositionOfR5De75A);
                } else {
                    offsetM3963boximpl = null;
                }
                Placeable.PlacementScope.place$default(placementScope, placeableMo5637measureBRTryo0, 0, 0, 0.0f, 4, null);
                if (offsetM3963boximpl != null) {
                    SharedBoundsNode sharedBoundsNode2 = this;
                    sharedBoundsNode2.getSharedElement().m426onLookaheadResultv_w8tDc(sharedBoundsNode2.getState(), jSize, offsetM3963boximpl.m3984unboximpl());
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        }, 4, null);
    }

    private final MeasureResult place(MeasureScope measureScope, final Placeable placeable) {
        long jMo429calculateSizeJyjRU_E = this.state.getPlaceHolderSize().mo429calculateSizeJyjRU_E(requireLookaheadLayoutCoordinates().mo5645getSizeYbymL2g(), IntSizeKt.IntSize(placeable.getWidth(), placeable.getHeight()));
        return MeasureScope.layout$default(measureScope, IntSize.m7106getWidthimpl(jMo429calculateSizeJyjRU_E), IntSize.m7105getHeightimpl(jMo429calculateSizeJyjRU_E), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.animation.SharedBoundsNode.place.1
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope placementScope) {
                long jM4009getTopLeftF1C5BW0;
                LayoutCoordinates coordinates;
                if (SharedBoundsNode.this.getSharedElement().getFoundMatch()) {
                    if (SharedBoundsNode.this.getSharedElement().getTargetBounds() != null) {
                        BoundsAnimation boundsAnimation = SharedBoundsNode.this.getBoundsAnimation();
                        Rect currentBounds = SharedBoundsNode.this.getSharedElement().getCurrentBounds();
                        Intrinsics.checkNotNull(currentBounds);
                        Rect targetBounds = SharedBoundsNode.this.getSharedElement().getTargetBounds();
                        Intrinsics.checkNotNull(targetBounds);
                        boundsAnimation.animate(currentBounds, targetBounds);
                    }
                    Rect value = SharedBoundsNode.this.getBoundsAnimation().getValue();
                    LayoutCoordinates coordinates2 = placementScope.getCoordinates();
                    Offset offsetM3963boximpl = coordinates2 != null ? Offset.m3963boximpl(SharedBoundsNode.this.getRootCoords().mo5646localPositionOfR5De75A(coordinates2, Offset.INSTANCE.m3990getZeroF1C5BW0())) : null;
                    if (value != null) {
                        if (SharedBoundsNode.this.getBoundsAnimation().getTarget()) {
                            SharedBoundsNode.this.getSharedElement().setCurrentBounds(value);
                        }
                        jM4009getTopLeftF1C5BW0 = value.m4009getTopLeftF1C5BW0();
                    } else {
                        if (SharedBoundsNode.this.getBoundsAnimation().getTarget() && (coordinates = placementScope.getCoordinates()) != null) {
                            SharedBoundsNode.this.updateCurrentBounds(coordinates);
                        }
                        Rect currentBounds2 = SharedBoundsNode.this.getSharedElement().getCurrentBounds();
                        Intrinsics.checkNotNull(currentBounds2);
                        jM4009getTopLeftF1C5BW0 = currentBounds2.m4009getTopLeftF1C5BW0();
                    }
                    long jM3978minusMKHz9U = offsetM3963boximpl != null ? Offset.m3978minusMKHz9U(jM4009getTopLeftF1C5BW0, offsetM3963boximpl.m3984unboximpl()) : Offset.INSTANCE.m3990getZeroF1C5BW0();
                    Placeable.PlacementScope.place$default(placementScope, placeable, Math.round(Offset.m3974getXimpl(jM3978minusMKHz9U)), Math.round(Offset.m3975getYimpl(jM3978minusMKHz9U)), 0.0f, 4, null);
                    return;
                }
                LayoutCoordinates coordinates3 = placementScope.getCoordinates();
                if (coordinates3 != null) {
                    SharedBoundsNode.this.updateCurrentBounds(coordinates3);
                }
                Placeable.PlacementScope.place$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.layout.ApproachLayoutModifierNode
    /* JADX INFO: renamed from: isMeasurementApproachInProgress-ozmzZPI, reason: not valid java name */
    public final boolean mo425isMeasurementApproachInProgressozmzZPI(long p0) {
        return getSharedElement().getFoundMatch() && this.state.getSharedElement().getScope().isTransitionActive();
    }

    @Override // androidx.compose.ui.layout.ApproachLayoutModifierNode
    /* JADX INFO: renamed from: approachMeasure-3p2s80s, reason: not valid java name */
    public final MeasureResult mo424approachMeasure3p2s80s(ApproachMeasureScope approachMeasureScope, Measurable measurable, long j) {
        if (getSharedElement().getFoundMatch()) {
            Rect value = getBoundsAnimation().getValue();
            if (value == null) {
                value = getSharedElement().getCurrentBounds();
            }
            if (value != null) {
                long jM7114roundToIntSizeuvyYCjk = IntSizeKt.m7114roundToIntSizeuvyYCjk(value.m4007getSizeNHjbRc());
                int iM7106getWidthimpl = IntSize.m7106getWidthimpl(jM7114roundToIntSizeuvyYCjk);
                int iM7105getHeightimpl = IntSize.m7105getHeightimpl(jM7114roundToIntSizeuvyYCjk);
                if (iM7106getWidthimpl == Integer.MAX_VALUE || iM7105getHeightimpl == Integer.MAX_VALUE) {
                    StringBuilder sb = new StringBuilder("Error: Infinite width/height is invalid. animated bounds: ");
                    sb.append(getBoundsAnimation().getValue());
                    sb.append(", current bounds: ");
                    sb.append(getSharedElement().getCurrentBounds());
                    throw new IllegalArgumentException(sb.toString().toString());
                }
                j = Constraints.INSTANCE.m6898fixedJhjzzOo(RangesKt.coerceAtLeast(iM7106getWidthimpl, 0), RangesKt.coerceAtLeast(iM7105getHeightimpl, 0));
            }
        }
        return place(approachMeasureScope, measurable.mo5637measureBRTryo0(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateCurrentBounds(LayoutCoordinates layoutCoordinates) {
        getSharedElement().setCurrentBounds(RectKt.m4014Recttz77jQw(getRootCoords().mo5646localPositionOfR5De75A(layoutCoordinates, Offset.INSTANCE.m3990getZeroF1C5BW0()), SizeKt.Size(IntSize.m7106getWidthimpl(layoutCoordinates.mo5645getSizeYbymL2g()), IntSize.m7105getHeightimpl(layoutCoordinates.mo5645getSizeYbymL2g()))));
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void draw(final ContentDrawScope contentDrawScope) {
        SharedElementInternalState sharedElementInternalState = this.state;
        SharedTransitionScope.OverlayClip overlayClip = sharedElementInternalState.getOverlayClip();
        SharedTransitionScope.SharedContentState userState = this.state.getUserState();
        Rect currentBounds = getSharedElement().getCurrentBounds();
        Intrinsics.checkNotNull(currentBounds);
        sharedElementInternalState.setClipPathInOverlay$animation_release(overlayClip.getClipPath(userState, currentBounds, contentDrawScope.getLayoutDirection(), DelegatableNodeKt.requireDensity(this)));
        GraphicsLayer layer = this.state.getLayer();
        if (layer == null) {
            StringBuilder sb = new StringBuilder("Error: Layer is null when accessed for shared bounds/element : ");
            sb.append(getSharedElement().getKey());
            sb.append(",target: ");
            sb.append(this.state.getBoundsAnimation().getTarget());
            sb.append(", is attached: ");
            sb.append(getIsAttached());
            throw new IllegalArgumentException(sb.toString().toString());
        }
        ContentDrawScope contentDrawScope2 = contentDrawScope;
        DrawScope.m4796recordJVtK1S4$default(contentDrawScope2, layer, 0L, new Function1<DrawScope, Unit>() { // from class: androidx.compose.animation.SharedBoundsNode.draw.1
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                invoke2(drawScope);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(DrawScope drawScope) {
                contentDrawScope.drawContent();
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        }, 1, null);
        if (this.state.getShouldRenderInPlace()) {
            GraphicsLayerKt.drawLayer(contentDrawScope2, layer);
        }
    }
}
