package androidx.compose.ui.layout;

import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.node.MotionReferencePlacementDelegate;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u00002\u00020\u0001:\u0001+B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J:\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0019\u0010\r\u001a\u0015\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n¢\u0006\u0002\b\fH$¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u000e\u0010\u0012R$\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u00138\u0007@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R$\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u00138\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00138WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0017R\u0014\u0010\u001d\u001a\u00020\u00138WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0017R*\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0007\u001a\u00020\u001e8\u0005@EX\u0085\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R*\u0010&\u001a\u00020%2\u0006\u0010\u0007\u001a\u00020%8\u0005@EX\u0085\u000e¢\u0006\u0012\n\u0004\b&\u0010 \u001a\u0004\b'\u0010\"\"\u0004\b(\u0010$R$\u0010)\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00068\u0005@BX\u0085\u000e¢\u0006\f\n\u0004\b)\u0010 \u001a\u0004\b*\u0010\""}, d2 = {"Landroidx/compose/ui/layout/Placeable;", "Landroidx/compose/ui/layout/Measured;", "<init>", "()V", "", "onMeasuredSizeChanged", "Landroidx/compose/ui/unit/IntOffset;", "p0", "", "p1", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/ExtensionFunctionType;", "p2", "placeAt-f8xVGno", "(JFLkotlin/jvm/functions/Function1;)V", "placeAt", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "(JFLandroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "", "width", "I", "getWidth", "()I", "height", "getHeight", "getMeasuredWidth", "measuredWidth", "getMeasuredHeight", "measuredHeight", "Landroidx/compose/ui/unit/IntSize;", "measuredSize", "J", "getMeasuredSize-YbymL2g", "()J", "setMeasuredSize-ozmzZPI", "(J)V", "Landroidx/compose/ui/unit/Constraints;", "measurementConstraints", "getMeasurementConstraints-msEJaDk", "setMeasurementConstraints-BRTryo0", "apparentToRealOffset", "getApparentToRealOffset-nOcc-ac", "PlacementScope"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class Placeable implements Measured {
    public static final int $stable = 8;
    private int height;
    private int width;
    private long measuredSize = IntSize.m7101constructorimpl(0);
    private long measurementConstraints = PlaceableKt.DefaultConstraints;
    private long apparentToRealOffset = IntOffset.INSTANCE.m7074getZeronOccac();

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: placeAt-f8xVGno */
    public abstract void mo5638placeAtf8xVGno(long p0, float p1, Function1<? super GraphicsLayerScope, Unit> p2);

    public final int getWidth() {
        return this.width;
    }

    public final int getHeight() {
        return this.height;
    }

    @Override // androidx.compose.ui.layout.Measured
    public int getMeasuredWidth() {
        return (int) (this.measuredSize >> 32);
    }

    @Override // androidx.compose.ui.layout.Measured
    public int getMeasuredHeight() {
        return (int) (this.measuredSize & 4294967295L);
    }

    /* JADX INFO: renamed from: getMeasuredSize-YbymL2g, reason: not valid java name and from getter */
    protected final long getMeasuredSize() {
        return this.measuredSize;
    }

    /* JADX INFO: renamed from: setMeasuredSize-ozmzZPI, reason: not valid java name */
    protected final void m5700setMeasuredSizeozmzZPI(long j) {
        if (IntSize.m7104equalsimpl0(this.measuredSize, j)) {
            return;
        }
        this.measuredSize = j;
        onMeasuredSizeChanged();
    }

    private final void onMeasuredSizeChanged() {
        this.width = RangesKt.coerceIn((int) (this.measuredSize >> 32), Constraints.m6890getMinWidthimpl(this.measurementConstraints), Constraints.m6888getMaxWidthimpl(this.measurementConstraints));
        int iCoerceIn = RangesKt.coerceIn((int) (this.measuredSize & 4294967295L), Constraints.m6889getMinHeightimpl(this.measurementConstraints), Constraints.m6887getMaxHeightimpl(this.measurementConstraints));
        this.height = iCoerceIn;
        int i = this.width;
        long j = this.measuredSize;
        long j2 = ((long) ((iCoerceIn - ((int) (j & 4294967295L))) / 2)) & 4294967295L;
        this.apparentToRealOffset = IntOffset.m7057constructorimpl(j2 | (((long) ((i - ((int) (j >> 32))) / 2)) << 32));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: placeAt-f8xVGno, reason: not valid java name */
    public void mo5699placeAtf8xVGno(long p0, float p1, GraphicsLayer p2) {
        mo5638placeAtf8xVGno(p0, p1, (Function1<? super GraphicsLayerScope, Unit>) null);
    }

    /* JADX INFO: renamed from: getMeasurementConstraints-msEJaDk, reason: not valid java name and from getter */
    protected final long getMeasurementConstraints() {
        return this.measurementConstraints;
    }

    /* JADX INFO: renamed from: setMeasurementConstraints-BRTryo0, reason: not valid java name */
    public final void m5701setMeasurementConstraintsBRTryo0(long j) {
        if (Constraints.m6881equalsimpl0(this.measurementConstraints, j)) {
            return;
        }
        this.measurementConstraints = j;
        onMeasuredSizeChanged();
    }

    /* JADX INFO: renamed from: getApparentToRealOffset-nOcc-ac, reason: not valid java name and from getter */
    protected final long getApparentToRealOffset() {
        return this.apparentToRealOffset;
    }

    @Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000f\u001a\u00020\f*\u00020\t2\u0006\u0010\u0006\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u000f\u001a\u00020\f*\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0012J+\u0010\u0013\u001a\u00020\f*\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0005¢\u0006\u0004\b\u0013\u0010\u0012J#\u0010\u0013\u001a\u00020\f*\u00020\t2\u0006\u0010\u0006\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\u0014\u0010\u000eJ>\u0010\u001a\u001a\u00020\f*\u00020\t2\u0006\u0010\u0006\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\u0019\b\u0002\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\f0\u0015¢\u0006\u0002\b\u0017¢\u0006\u0004\b\u0018\u0010\u0019JF\u0010\u001a\u001a\u00020\f*\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00052\u0019\b\u0002\u0010\u001b\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\f0\u0015¢\u0006\u0002\b\u0017¢\u0006\u0004\b\u001a\u0010\u001cJF\u0010\u001d\u001a\u00020\f*\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00052\u0019\b\u0002\u0010\u001b\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\f0\u0015¢\u0006\u0002\b\u0017¢\u0006\u0004\b\u001d\u0010\u001cJ>\u0010\u001d\u001a\u00020\f*\u00020\t2\u0006\u0010\u0006\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\u0019\b\u0002\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\f0\u0015¢\u0006\u0002\b\u0017¢\u0006\u0004\b\u001e\u0010\u0019J3\u0010\u001d\u001a\u00020\f*\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u001f2\b\b\u0002\u0010\u001b\u001a\u00020\u0005¢\u0006\u0004\b\u001d\u0010 J+\u0010\u001d\u001a\u00020\f*\u00020\t2\u0006\u0010\u0006\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u001f2\b\b\u0002\u0010\u0011\u001a\u00020\u0005¢\u0006\u0004\b\u001e\u0010!J3\u0010\u001a\u001a\u00020\f*\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u001f2\b\b\u0002\u0010\u001b\u001a\u00020\u0005¢\u0006\u0004\b\u001a\u0010 J+\u0010\u001a\u001a\u00020\f*\u00020\t2\u0006\u0010\u0006\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u001f2\b\b\u0002\u0010\u0011\u001a\u00020\u0005¢\u0006\u0004\b\u0018\u0010!JA\u0010#\u001a\u00020\f*\u00020\t2\u0006\u0010\u0006\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\u001b\b\b\u0010\u0011\u001a\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\f\u0018\u00010\u0015¢\u0006\u0002\b\u0017H\u0080\b¢\u0006\u0004\b\"\u0010\u0019J,\u0010#\u001a\u00020\f*\u00020\t2\u0006\u0010\u0006\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u001fH\u0080\b¢\u0006\u0004\b\"\u0010$JA\u0010&\u001a\u00020\f*\u00020\t2\u0006\u0010\u0006\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\u001b\b\b\u0010\u0011\u001a\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\f\u0018\u00010\u0015¢\u0006\u0002\b\u0017H\u0080\b¢\u0006\u0004\b%\u0010\u0019J,\u0010&\u001a\u00020\f*\u00020\t2\u0006\u0010\u0006\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u001fH\u0080\b¢\u0006\u0004\b%\u0010$J&\u0010'\u001a\u00020\f2\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\f0\u0015¢\u0006\u0002\b\u0017¢\u0006\u0004\b'\u0010(J\u0013\u0010)\u001a\u00020\f*\u00020\tH\u0002¢\u0006\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010,R\u0014\u00102\u001a\u00020\u00108%X¤\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u00106\u001a\u0002038%X¤\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0016\u0010:\u001a\u0004\u0018\u0001078WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0016\u0010<\u001a\u00020;8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b<\u0010="}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Landroidx/compose/ui/unit/Density;", "<init>", "()V", "Landroidx/compose/ui/layout/Ruler;", "", "p0", "current", "(Landroidx/compose/ui/layout/Ruler;F)F", "Landroidx/compose/ui/layout/Placeable;", "Landroidx/compose/ui/unit/IntOffset;", "p1", "", "placeRelative-70tqf50", "(Landroidx/compose/ui/layout/Placeable;JF)V", "placeRelative", "", "p2", "(Landroidx/compose/ui/layout/Placeable;IIF)V", "place", "place-70tqf50", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/ExtensionFunctionType;", "placeRelativeWithLayer-aW-9-wM", "(Landroidx/compose/ui/layout/Placeable;JFLkotlin/jvm/functions/Function1;)V", "placeRelativeWithLayer", "p3", "(Landroidx/compose/ui/layout/Placeable;IIFLkotlin/jvm/functions/Function1;)V", "placeWithLayer", "placeWithLayer-aW-9-wM", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "(Landroidx/compose/ui/layout/Placeable;IILandroidx/compose/ui/graphics/layer/GraphicsLayer;F)V", "(Landroidx/compose/ui/layout/Placeable;JLandroidx/compose/ui/graphics/layer/GraphicsLayer;F)V", "placeAutoMirrored-aW-9-wM$ui_release", "placeAutoMirrored", "(Landroidx/compose/ui/layout/Placeable;JFLandroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "placeApparentToRealOffset-aW-9-wM$ui_release", "placeApparentToRealOffset", "withMotionFrameOfReferencePlacement", "(Lkotlin/jvm/functions/Function1;)V", "handleMotionFrameOfReferencePlacement", "(Landroidx/compose/ui/layout/Placeable;)V", "getDensity", "()F", "density", "getFontScale", "fontScale", "getParentWidth", "()I", "parentWidth", "Landroidx/compose/ui/unit/LayoutDirection;", "getParentLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "parentLayoutDirection", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "", "motionFrameOfReferencePlacement", "Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @PlacementScopeMarker
    public static abstract class PlacementScope implements Density {
        public static final int $stable = 0;
        private boolean motionFrameOfReferencePlacement;

        public float current(Ruler ruler, float f) {
            return f;
        }

        public LayoutCoordinates getCoordinates() {
            return null;
        }

        @Override // androidx.compose.ui.unit.Density
        public float getDensity() {
            return 1.0f;
        }

        @Override // androidx.compose.ui.unit.FontScaling
        public float getFontScale() {
            return 1.0f;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public abstract LayoutDirection getParentLayoutDirection();

        /* JADX INFO: Access modifiers changed from: protected */
        public abstract int getParentWidth();

        /* JADX INFO: renamed from: placeRelative-70tqf50$default, reason: not valid java name */
        public static /* synthetic */ void m5703placeRelative70tqf50$default(PlacementScope placementScope, Placeable placeable, long j, float f, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative-70tqf50");
            }
            if ((i & 2) != 0) {
                f = 0.0f;
            }
            placementScope.m5713placeRelative70tqf50(placeable, j, f);
        }

        public static /* synthetic */ void placeRelative$default(PlacementScope placementScope, Placeable placeable, int i, int i2, float f, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative");
            }
            if ((i3 & 4) != 0) {
                f = 0.0f;
            }
            placementScope.placeRelative(placeable, i, i2, f);
        }

        public static /* synthetic */ void place$default(PlacementScope placementScope, Placeable placeable, int i, int i2, float f, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place");
            }
            if ((i3 & 4) != 0) {
                f = 0.0f;
            }
            placementScope.place(placeable, i, i2, f);
        }

        /* JADX INFO: renamed from: place-70tqf50$default, reason: not valid java name */
        public static /* synthetic */ void m5702place70tqf50$default(PlacementScope placementScope, Placeable placeable, long j, float f, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place-70tqf50");
            }
            if ((i & 2) != 0) {
                f = 0.0f;
            }
            placementScope.m5708place70tqf50(placeable, j, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: placeRelativeWithLayer-aW-9-wM$default, reason: not valid java name */
        public static /* synthetic */ void m5704placeRelativeWithLayeraW9wM$default(PlacementScope placementScope, Placeable placeable, long j, float f, Function1 function1, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
            }
            if ((i & 2) != 0) {
                f = 0.0f;
            }
            float f2 = f;
            if ((i & 4) != 0) {
                function1 = PlaceableKt.DefaultLayerBlock;
            }
            placementScope.m5714placeRelativeWithLayeraW9wM(placeable, j, f2, (Function1<? super GraphicsLayerScope, Unit>) function1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void placeRelativeWithLayer$default(PlacementScope placementScope, Placeable placeable, int i, int i2, float f, Function1 function1, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer");
            }
            if ((i3 & 4) != 0) {
                f = 0.0f;
            }
            float f2 = f;
            if ((i3 & 8) != 0) {
                function1 = PlaceableKt.DefaultLayerBlock;
            }
            placementScope.placeRelativeWithLayer(placeable, i, i2, f2, (Function1<? super GraphicsLayerScope, Unit>) function1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void placeWithLayer$default(PlacementScope placementScope, Placeable placeable, int i, int i2, float f, Function1 function1, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer");
            }
            if ((i3 & 4) != 0) {
                f = 0.0f;
            }
            float f2 = f;
            if ((i3 & 8) != 0) {
                function1 = PlaceableKt.DefaultLayerBlock;
            }
            placementScope.placeWithLayer(placeable, i, i2, f2, (Function1<? super GraphicsLayerScope, Unit>) function1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: placeWithLayer-aW-9-wM$default, reason: not valid java name */
        public static /* synthetic */ void m5706placeWithLayeraW9wM$default(PlacementScope placementScope, Placeable placeable, long j, float f, Function1 function1, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
            }
            if ((i & 2) != 0) {
                f = 0.0f;
            }
            float f2 = f;
            if ((i & 4) != 0) {
                function1 = PlaceableKt.DefaultLayerBlock;
            }
            placementScope.m5716placeWithLayeraW9wM(placeable, j, f2, (Function1<? super GraphicsLayerScope, Unit>) function1);
        }

        public static /* synthetic */ void placeWithLayer$default(PlacementScope placementScope, Placeable placeable, int i, int i2, GraphicsLayer graphicsLayer, float f, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer");
            }
            if ((i3 & 8) != 0) {
                f = 0.0f;
            }
            placementScope.placeWithLayer(placeable, i, i2, graphicsLayer, f);
        }

        /* JADX INFO: renamed from: placeWithLayer-aW-9-wM$default, reason: not valid java name */
        public static /* synthetic */ void m5707placeWithLayeraW9wM$default(PlacementScope placementScope, Placeable placeable, long j, GraphicsLayer graphicsLayer, float f, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
            }
            if ((i & 4) != 0) {
                f = 0.0f;
            }
            placementScope.m5717placeWithLayeraW9wM(placeable, j, graphicsLayer, f);
        }

        public static /* synthetic */ void placeRelativeWithLayer$default(PlacementScope placementScope, Placeable placeable, int i, int i2, GraphicsLayer graphicsLayer, float f, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer");
            }
            if ((i3 & 8) != 0) {
                f = 0.0f;
            }
            placementScope.placeRelativeWithLayer(placeable, i, i2, graphicsLayer, f);
        }

        /* JADX INFO: renamed from: placeRelativeWithLayer-aW-9-wM$default, reason: not valid java name */
        public static /* synthetic */ void m5705placeRelativeWithLayeraW9wM$default(PlacementScope placementScope, Placeable placeable, long j, GraphicsLayer graphicsLayer, float f, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
            }
            if ((i & 4) != 0) {
                f = 0.0f;
            }
            placementScope.m5715placeRelativeWithLayeraW9wM(placeable, j, graphicsLayer, f);
        }

        /* JADX INFO: renamed from: placeAutoMirrored-aW-9-wM$ui_release, reason: not valid java name */
        public final void m5712placeAutoMirroredaW9wM$ui_release(Placeable placeable, long j, float f, Function1<? super GraphicsLayerScope, Unit> function1) {
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo5638placeAtf8xVGno(IntOffset.m7067plusqkQi6aY(j, placeable.apparentToRealOffset), f, function1);
                return;
            }
            int parentWidth = getParentWidth();
            int width = placeable.getWidth();
            long jM7057constructorimpl = IntOffset.m7057constructorimpl((((long) IntOffset.m7064getYimpl(j)) & 4294967295L) | (((long) ((parentWidth - width) - IntOffset.m7063getXimpl(j))) << 32));
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo5638placeAtf8xVGno(IntOffset.m7067plusqkQi6aY(jM7057constructorimpl, placeable.apparentToRealOffset), f, function1);
        }

        /* JADX INFO: renamed from: placeAutoMirrored-aW-9-wM$ui_release, reason: not valid java name */
        public final void m5711placeAutoMirroredaW9wM$ui_release(Placeable placeable, long j, float f, GraphicsLayer graphicsLayer) {
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo5699placeAtf8xVGno(IntOffset.m7067plusqkQi6aY(j, placeable.apparentToRealOffset), f, graphicsLayer);
                return;
            }
            int parentWidth = getParentWidth();
            int width = placeable.getWidth();
            long jM7057constructorimpl = IntOffset.m7057constructorimpl((((long) IntOffset.m7064getYimpl(j)) & 4294967295L) | (((long) ((parentWidth - width) - IntOffset.m7063getXimpl(j))) << 32));
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo5699placeAtf8xVGno(IntOffset.m7067plusqkQi6aY(jM7057constructorimpl, placeable.apparentToRealOffset), f, graphicsLayer);
        }

        /* JADX INFO: renamed from: placeApparentToRealOffset-aW-9-wM$ui_release, reason: not valid java name */
        public final void m5710placeApparentToRealOffsetaW9wM$ui_release(Placeable placeable, long j, float f, Function1<? super GraphicsLayerScope, Unit> function1) {
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo5638placeAtf8xVGno(IntOffset.m7067plusqkQi6aY(j, placeable.apparentToRealOffset), f, function1);
        }

        /* JADX INFO: renamed from: placeApparentToRealOffset-aW-9-wM$ui_release, reason: not valid java name */
        public final void m5709placeApparentToRealOffsetaW9wM$ui_release(Placeable placeable, long j, float f, GraphicsLayer graphicsLayer) {
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo5699placeAtf8xVGno(IntOffset.m7067plusqkQi6aY(j, placeable.apparentToRealOffset), f, graphicsLayer);
        }

        public final void withMotionFrameOfReferencePlacement(Function1<? super PlacementScope, Unit> p0) {
            this.motionFrameOfReferencePlacement = true;
            p0.invoke(this);
            this.motionFrameOfReferencePlacement = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public final void handleMotionFrameOfReferencePlacement(Placeable placeable) {
            if (placeable instanceof MotionReferencePlacementDelegate) {
                ((MotionReferencePlacementDelegate) placeable).updatePlacedUnderMotionFrameOfReference(this.motionFrameOfReferencePlacement);
            }
        }

        /* JADX INFO: renamed from: placeRelative-70tqf50, reason: not valid java name */
        public final void m5713placeRelative70tqf50(Placeable placeable, long j, float f) {
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo5638placeAtf8xVGno(IntOffset.m7067plusqkQi6aY(j, placeable.apparentToRealOffset), f, (Function1<? super GraphicsLayerScope, Unit>) null);
                return;
            }
            int parentWidth = getParentWidth();
            int width = placeable.getWidth();
            long jM7057constructorimpl = IntOffset.m7057constructorimpl((((long) IntOffset.m7064getYimpl(j)) & 4294967295L) | (((long) ((parentWidth - width) - IntOffset.m7063getXimpl(j))) << 32));
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo5638placeAtf8xVGno(IntOffset.m7067plusqkQi6aY(jM7057constructorimpl, placeable.apparentToRealOffset), f, (Function1<? super GraphicsLayerScope, Unit>) null);
        }

        public final void placeRelative(Placeable placeable, int i, int i2, float f) {
            long jM7057constructorimpl = IntOffset.m7057constructorimpl((((long) i2) & 4294967295L) | (i << 32));
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo5638placeAtf8xVGno(IntOffset.m7067plusqkQi6aY(jM7057constructorimpl, placeable.apparentToRealOffset), f, (Function1<? super GraphicsLayerScope, Unit>) null);
                return;
            }
            int parentWidth = getParentWidth();
            int width = placeable.getWidth();
            long jM7057constructorimpl2 = IntOffset.m7057constructorimpl((((long) IntOffset.m7064getYimpl(jM7057constructorimpl)) & 4294967295L) | (((long) ((parentWidth - width) - IntOffset.m7063getXimpl(jM7057constructorimpl))) << 32));
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo5638placeAtf8xVGno(IntOffset.m7067plusqkQi6aY(jM7057constructorimpl2, placeable.apparentToRealOffset), f, (Function1<? super GraphicsLayerScope, Unit>) null);
        }

        public final void place(Placeable placeable, int i, int i2, float f) {
            long jM7057constructorimpl = IntOffset.m7057constructorimpl((((long) i2) & 4294967295L) | (((long) i) << 32));
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo5638placeAtf8xVGno(IntOffset.m7067plusqkQi6aY(jM7057constructorimpl, placeable.apparentToRealOffset), f, (Function1<? super GraphicsLayerScope, Unit>) null);
        }

        /* JADX INFO: renamed from: place-70tqf50, reason: not valid java name */
        public final void m5708place70tqf50(Placeable placeable, long j, float f) {
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo5638placeAtf8xVGno(IntOffset.m7067plusqkQi6aY(j, placeable.apparentToRealOffset), f, (Function1<? super GraphicsLayerScope, Unit>) null);
        }

        /* JADX INFO: renamed from: placeRelativeWithLayer-aW-9-wM, reason: not valid java name */
        public final void m5714placeRelativeWithLayeraW9wM(Placeable placeable, long j, float f, Function1<? super GraphicsLayerScope, Unit> function1) {
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo5638placeAtf8xVGno(IntOffset.m7067plusqkQi6aY(j, placeable.apparentToRealOffset), f, function1);
                return;
            }
            int parentWidth = getParentWidth();
            int width = placeable.getWidth();
            long jM7057constructorimpl = IntOffset.m7057constructorimpl((((long) IntOffset.m7064getYimpl(j)) & 4294967295L) | (((long) ((parentWidth - width) - IntOffset.m7063getXimpl(j))) << 32));
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo5638placeAtf8xVGno(IntOffset.m7067plusqkQi6aY(jM7057constructorimpl, placeable.apparentToRealOffset), f, function1);
        }

        public final void placeRelativeWithLayer(Placeable placeable, int i, int i2, float f, Function1<? super GraphicsLayerScope, Unit> function1) {
            long jM7057constructorimpl = IntOffset.m7057constructorimpl((((long) i2) & 4294967295L) | (i << 32));
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo5638placeAtf8xVGno(IntOffset.m7067plusqkQi6aY(jM7057constructorimpl, placeable.apparentToRealOffset), f, function1);
                return;
            }
            int parentWidth = getParentWidth();
            int width = placeable.getWidth();
            long jM7057constructorimpl2 = IntOffset.m7057constructorimpl((((long) IntOffset.m7064getYimpl(jM7057constructorimpl)) & 4294967295L) | (((long) ((parentWidth - width) - IntOffset.m7063getXimpl(jM7057constructorimpl))) << 32));
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo5638placeAtf8xVGno(IntOffset.m7067plusqkQi6aY(jM7057constructorimpl2, placeable.apparentToRealOffset), f, function1);
        }

        public final void placeWithLayer(Placeable placeable, int i, int i2, float f, Function1<? super GraphicsLayerScope, Unit> function1) {
            long jM7057constructorimpl = IntOffset.m7057constructorimpl((((long) i2) & 4294967295L) | (((long) i) << 32));
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo5638placeAtf8xVGno(IntOffset.m7067plusqkQi6aY(jM7057constructorimpl, placeable.apparentToRealOffset), f, function1);
        }

        /* JADX INFO: renamed from: placeWithLayer-aW-9-wM, reason: not valid java name */
        public final void m5716placeWithLayeraW9wM(Placeable placeable, long j, float f, Function1<? super GraphicsLayerScope, Unit> function1) {
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo5638placeAtf8xVGno(IntOffset.m7067plusqkQi6aY(j, placeable.apparentToRealOffset), f, function1);
        }

        public final void placeWithLayer(Placeable placeable, int i, int i2, GraphicsLayer graphicsLayer, float f) {
            long jM7057constructorimpl = IntOffset.m7057constructorimpl((((long) i2) & 4294967295L) | (((long) i) << 32));
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo5699placeAtf8xVGno(IntOffset.m7067plusqkQi6aY(jM7057constructorimpl, placeable.apparentToRealOffset), f, graphicsLayer);
        }

        /* JADX INFO: renamed from: placeWithLayer-aW-9-wM, reason: not valid java name */
        public final void m5717placeWithLayeraW9wM(Placeable placeable, long j, GraphicsLayer graphicsLayer, float f) {
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo5699placeAtf8xVGno(IntOffset.m7067plusqkQi6aY(j, placeable.apparentToRealOffset), f, graphicsLayer);
        }

        public final void placeRelativeWithLayer(Placeable placeable, int i, int i2, GraphicsLayer graphicsLayer, float f) {
            long jM7057constructorimpl = IntOffset.m7057constructorimpl((((long) i2) & 4294967295L) | (i << 32));
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo5699placeAtf8xVGno(IntOffset.m7067plusqkQi6aY(jM7057constructorimpl, placeable.apparentToRealOffset), f, graphicsLayer);
                return;
            }
            int parentWidth = getParentWidth();
            int width = placeable.getWidth();
            long jM7057constructorimpl2 = IntOffset.m7057constructorimpl((((long) IntOffset.m7064getYimpl(jM7057constructorimpl)) & 4294967295L) | (((long) ((parentWidth - width) - IntOffset.m7063getXimpl(jM7057constructorimpl))) << 32));
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo5699placeAtf8xVGno(IntOffset.m7067plusqkQi6aY(jM7057constructorimpl2, placeable.apparentToRealOffset), f, graphicsLayer);
        }

        /* JADX INFO: renamed from: placeRelativeWithLayer-aW-9-wM, reason: not valid java name */
        public final void m5715placeRelativeWithLayeraW9wM(Placeable placeable, long j, GraphicsLayer graphicsLayer, float f) {
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo5699placeAtf8xVGno(IntOffset.m7067plusqkQi6aY(j, placeable.apparentToRealOffset), f, graphicsLayer);
                return;
            }
            int parentWidth = getParentWidth();
            int width = placeable.getWidth();
            long jM7057constructorimpl = IntOffset.m7057constructorimpl((((long) IntOffset.m7064getYimpl(j)) & 4294967295L) | (((long) ((parentWidth - width) - IntOffset.m7063getXimpl(j))) << 32));
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo5699placeAtf8xVGno(IntOffset.m7067plusqkQi6aY(jM7057constructorimpl, placeable.apparentToRealOffset), f, graphicsLayer);
        }
    }
}
