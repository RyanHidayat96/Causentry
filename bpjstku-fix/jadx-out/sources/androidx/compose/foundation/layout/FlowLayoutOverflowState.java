package androidx.compose.foundation.layout;

import androidx.collection.IntIntPair;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0081\b\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÁ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÀ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÀ\u0003¢\u0006\u0004\b\r\u0010\fJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÇ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0003\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J,\u0010\u0017\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0003\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\fJ6\u0010\"\u001a\u00020\u001f2\u0006\u0010\u0003\u001a\u00020\u001b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u001c2\b\u0010\u0006\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001e\u001a\u00020\u001dH\u0000ø\u0001\u0000¢\u0006\u0004\b \u0010!JH\u0010\"\u001a\u00020\u001f2\u0006\u0010\u0003\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u001d2$\u0010\u0006\u001a \u0012\t\u0012\u00070\u0010¢\u0006\u0002\b$\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b$\u0012\u0006\u0012\u0004\u0018\u00010\u001c0#H\u0000ø\u0001\u0000¢\u0006\u0004\b%\u0010&J6\u0010\"\u001a\u00020\u001f2\b\u0010\u0003\u001a\u0004\u0018\u00010'2\b\u0010\u0005\u001a\u0004\u0018\u00010'2\u0006\u0010\u0006\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001dH\u0000ø\u0001\u0000¢\u0006\u0004\b \u0010(J\u0010\u0010*\u001a\u00020)H×\u0001¢\u0006\u0004\b*\u0010+R\u0018\u0010,\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010/\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u001b\u00101\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000eø\u0001\u0001¢\u0006\u0006\n\u0004\b1\u00102R6\u00103\u001a\"\u0012\t\u0012\u00070\u0010¢\u0006\u0002\b$\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b$\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\"\u00105\u001a\u00020\u00048\u0001@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u0010\f\"\u0004\b8\u00109R\"\u0010:\u001a\u00020\u00048\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b:\u00106\u001a\u0004\b;\u0010\f\"\u0004\b<\u00109R\u001a\u0010=\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b=\u00106\u001a\u0004\b>\u0010\fR\u001a\u0010?\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b?\u00106\u001a\u0004\b@\u0010\fR\u0014\u0010B\u001a\u00020\u00048AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bA\u0010\fR\u0018\u0010C\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bC\u0010-R\u0018\u0010D\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bD\u00100R\u001b\u0010E\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0083\u000eø\u0001\u0001¢\u0006\u0006\n\u0004\bE\u00102R\u001a\u0010F\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!"}, d2 = {"Landroidx/compose/foundation/layout/FlowLayoutOverflowState;", "", "Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;", "p0", "", "p1", "p2", "<init>", "(Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;II)V", "component1$foundation_layout_release", "()Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;", "component2$foundation_layout_release", "()I", "component3$foundation_layout_release", "copy", "(Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;II)Landroidx/compose/foundation/layout/FlowLayoutOverflowState;", "", "Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapEllipsisInfo;", "ellipsisInfo$foundation_layout_release", "(ZII)Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapEllipsisInfo;", "Landroidx/collection/IntIntPair;", "ellipsisSize-F35zm-w$foundation_layout_release", "(ZII)Landroidx/collection/IntIntPair;", "ellipsisSize", "equals", "(Ljava/lang/Object;)Z", "hashCode", "Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/unit/Constraints;", "p3", "", "setOverflowMeasurables--hBUhpc$foundation_layout_release", "(Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;Landroidx/compose/ui/layout/Measurable;Landroidx/compose/ui/layout/Measurable;J)V", "setOverflowMeasurables", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "setOverflowMeasurables-VKLhPVY$foundation_layout_release", "(Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;JLkotlin/jvm/functions/Function2;)V", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;Landroidx/compose/ui/layout/IntrinsicMeasurable;ZJ)V", "", "toString", "()Ljava/lang/String;", "collapseMeasurable", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/layout/Placeable;", "collapsePlaceable", "Landroidx/compose/ui/layout/Placeable;", "collapseSize", "Landroidx/collection/IntIntPair;", "getOverflowMeasurable", "Lkotlin/jvm/functions/Function2;", "itemCount", "I", "getItemCount$foundation_layout_release", "setItemCount$foundation_layout_release", "(I)V", "itemShown", "getItemShown$foundation_layout_release", "setItemShown$foundation_layout_release", "minCrossAxisSizeToShowCollapse", "getMinCrossAxisSizeToShowCollapse$foundation_layout_release", "minLinesToShowCollapse", "getMinLinesToShowCollapse$foundation_layout_release", "getNoOfItemsShown$foundation_layout_release", "noOfItemsShown", "seeMoreMeasurable", "seeMorePlaceable", "seeMoreSize", "type", "Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;", "getType$foundation_layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class FlowLayoutOverflowState {
    public static final int $stable = 8;
    private Measurable collapseMeasurable;
    private Placeable collapsePlaceable;
    private IntIntPair collapseSize;
    private Function2<? super Boolean, ? super Integer, ? extends Measurable> getOverflowMeasurable;
    private int itemCount;
    private int itemShown = -1;
    private final int minCrossAxisSizeToShowCollapse;
    private final int minLinesToShowCollapse;
    private Measurable seeMoreMeasurable;
    private Placeable seeMorePlaceable;
    private IntIntPair seeMoreSize;
    private final FlowLayoutOverflow.OverflowType type;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FlowLayoutOverflow.OverflowType.values().length];
            try {
                iArr[FlowLayoutOverflow.OverflowType.Visible.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FlowLayoutOverflow.OverflowType.Clip.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FlowLayoutOverflow.OverflowType.ExpandIndicator.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FlowLayoutOverflow.OverflowType.ExpandOrCollapseIndicator.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public FlowLayoutOverflowState(FlowLayoutOverflow.OverflowType overflowType, int i, int i2) {
        this.type = overflowType;
        this.minLinesToShowCollapse = i;
        this.minCrossAxisSizeToShowCollapse = i2;
    }

    public final FlowLayoutOverflow.OverflowType getType$foundation_layout_release() {
        return this.type;
    }

    public final int getMinLinesToShowCollapse$foundation_layout_release() {
        return this.minLinesToShowCollapse;
    }

    public final int getMinCrossAxisSizeToShowCollapse$foundation_layout_release() {
        return this.minCrossAxisSizeToShowCollapse;
    }

    public final int getNoOfItemsShown$foundation_layout_release() {
        int i = this.itemShown;
        if (i != -1) {
            return i;
        }
        throw new IllegalStateException("Accessing noOfItemsShown before it is set. Are you calling this in the Composition phase, rather than in the draw phase? Consider our samples on how to use it during the draw phase or consider using ContextualFlowRow/ContextualFlowColumn which initializes this method in the composition phase.");
    }

    /* JADX INFO: renamed from: getItemShown$foundation_layout_release, reason: from getter */
    public final int getItemShown() {
        return this.itemShown;
    }

    public final void setItemShown$foundation_layout_release(int i) {
        this.itemShown = i;
    }

    /* JADX INFO: renamed from: getItemCount$foundation_layout_release, reason: from getter */
    public final int getItemCount() {
        return this.itemCount;
    }

    public final void setItemCount$foundation_layout_release(int i) {
        this.itemCount = i;
    }

    /* JADX INFO: renamed from: ellipsisSize-F35zm-w$foundation_layout_release, reason: not valid java name */
    public final IntIntPair m930ellipsisSizeF35zmw$foundation_layout_release(boolean p0, int p1, int p2) {
        int i = WhenMappings.$EnumSwitchMapping$0[this.type.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                if (p0) {
                    return this.seeMoreSize;
                }
                if (p1 + 1 < this.minLinesToShowCollapse || p2 < this.minCrossAxisSizeToShowCollapse) {
                    return null;
                }
                return this.collapseSize;
            }
            if (p0) {
                return this.seeMoreSize;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0036  */
    /* JADX WARN: Code duplicated, block: B:30:0x0060  */
    /* JADX WARN: Code duplicated, block: B:36:0x006f A[PHI: r11 r12
  0x006f: PHI (r11v10 androidx.compose.ui.layout.Measurable) = (r11v4 androidx.compose.ui.layout.Measurable), (r11v15 androidx.compose.ui.layout.Measurable) binds: [B:33:0x0068, B:20:0x003c] A[DONT_GENERATE, DONT_INLINE]
  0x006f: PHI (r12v4 androidx.collection.IntIntPair) = (r12v1 androidx.collection.IntIntPair), (r12v7 androidx.collection.IntIntPair) binds: [B:33:0x0068, B:20:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    public final FlowLayoutBuildingBlocks.WrapEllipsisInfo ellipsisInfo$foundation_layout_release(boolean p0, int p1, int p2) {
        Measurable measurableInvoke;
        IntIntPair intIntPair;
        Placeable placeable;
        Measurable measurable;
        Placeable placeable2;
        int i = WhenMappings.$EnumSwitchMapping$0[this.type.ordinal()];
        if (i == 1 || i == 2) {
            return null;
        }
        if (i != 3 && i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        if (p0) {
            Function2<? super Boolean, ? super Integer, ? extends Measurable> function2 = this.getOverflowMeasurable;
            if (function2 != null) {
                measurableInvoke = function2.invoke(Boolean.TRUE, Integer.valueOf(getNoOfItemsShown$foundation_layout_release()));
                if (measurableInvoke == null) {
                    measurableInvoke = this.seeMoreMeasurable;
                }
            } else {
                measurableInvoke = this.seeMoreMeasurable;
            }
            intIntPair = this.seeMoreSize;
            if (this.getOverflowMeasurable == null) {
                placeable = this.seeMorePlaceable;
                measurable = measurableInvoke;
                placeable2 = placeable;
            } else {
                measurable = measurableInvoke;
                placeable2 = null;
            }
        } else {
            if (p1 < this.minLinesToShowCollapse - 1 || p2 < this.minCrossAxisSizeToShowCollapse) {
                measurableInvoke = null;
            } else {
                Function2<? super Boolean, ? super Integer, ? extends Measurable> function3 = this.getOverflowMeasurable;
                if (function3 != null) {
                    measurableInvoke = function3.invoke(Boolean.FALSE, Integer.valueOf(getNoOfItemsShown$foundation_layout_release()));
                    if (measurableInvoke == null) {
                        measurableInvoke = this.collapseMeasurable;
                    }
                } else {
                    measurableInvoke = this.collapseMeasurable;
                }
            }
            intIntPair = this.collapseSize;
            if (this.getOverflowMeasurable == null) {
                placeable = this.collapsePlaceable;
                measurable = measurableInvoke;
                placeable2 = placeable;
            } else {
                measurable = measurableInvoke;
                placeable2 = null;
            }
        }
        if (measurable == null) {
            return null;
        }
        Intrinsics.checkNotNull(intIntPair);
        return new FlowLayoutBuildingBlocks.WrapEllipsisInfo(measurable, placeable2, intIntPair.getPackedValue(), false, 8, null);
    }

    /* JADX INFO: renamed from: setOverflowMeasurables--hBUhpc$foundation_layout_release, reason: not valid java name */
    public final void m932setOverflowMeasurableshBUhpc$foundation_layout_release(IntrinsicMeasurable p0, IntrinsicMeasurable p1, boolean p2, long p3) {
        long jM971constructorimpl = OrientationIndependentConstraints.m971constructorimpl(p3, p2 ? LayoutOrientation.Horizontal : LayoutOrientation.Vertical);
        if (p0 != null) {
            int iMainAxisMin = FlowLayoutKt.mainAxisMin(p0, p2, Constraints.m6887getMaxHeightimpl(jM971constructorimpl));
            this.seeMoreSize = IntIntPair.m342boximpl(IntIntPair.m345constructorimpl(iMainAxisMin, FlowLayoutKt.crossAxisMin(p0, p2, iMainAxisMin)));
            this.seeMoreMeasurable = p0 instanceof Measurable ? (Measurable) p0 : null;
            this.seeMorePlaceable = null;
        }
        if (p1 != null) {
            int iMainAxisMin2 = FlowLayoutKt.mainAxisMin(p1, p2, Constraints.m6887getMaxHeightimpl(jM971constructorimpl));
            this.collapseSize = IntIntPair.m342boximpl(IntIntPair.m345constructorimpl(iMainAxisMin2, FlowLayoutKt.crossAxisMin(p1, p2, iMainAxisMin2)));
            this.collapseMeasurable = p1 instanceof Measurable ? (Measurable) p1 : null;
            this.collapsePlaceable = null;
        }
    }

    /* JADX INFO: renamed from: setOverflowMeasurables--hBUhpc$foundation_layout_release, reason: not valid java name */
    public final void m931setOverflowMeasurableshBUhpc$foundation_layout_release(final FlowLineMeasurePolicy p0, Measurable p1, Measurable p2, long p3) {
        LayoutOrientation layoutOrientation = p0.isHorizontal() ? LayoutOrientation.Horizontal : LayoutOrientation.Vertical;
        long jM984toBoxConstraintsOenEA2s = OrientationIndependentConstraints.m984toBoxConstraintsOenEA2s(OrientationIndependentConstraints.m973copyyUG9Ft0$default(OrientationIndependentConstraints.m971constructorimpl(p3, layoutOrientation), 0, 0, 0, 0, 10, null), layoutOrientation);
        if (p1 != null) {
            FlowLayoutKt.m928measureAndCacherqJ1uqs(p1, p0, jM984toBoxConstraintsOenEA2s, new Function1<Placeable, Unit>() { // from class: androidx.compose.foundation.layout.FlowLayoutOverflowState$setOverflowMeasurables$3$1
                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ Unit invoke(Placeable placeable) {
                    invoke2(placeable);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Placeable placeable) {
                    int iMainAxisSize;
                    int iCrossAxisSize;
                    if (placeable != null) {
                        FlowLineMeasurePolicy flowLineMeasurePolicy = p0;
                        iMainAxisSize = flowLineMeasurePolicy.mainAxisSize(placeable);
                        iCrossAxisSize = flowLineMeasurePolicy.crossAxisSize(placeable);
                    } else {
                        iMainAxisSize = 0;
                        iCrossAxisSize = 0;
                    }
                    this.this$0.seeMoreSize = IntIntPair.m342boximpl(IntIntPair.m345constructorimpl(iMainAxisSize, iCrossAxisSize));
                    this.this$0.seeMorePlaceable = placeable;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }
            });
            this.seeMoreMeasurable = p1;
        }
        if (p2 != null) {
            FlowLayoutKt.m928measureAndCacherqJ1uqs(p2, p0, jM984toBoxConstraintsOenEA2s, new Function1<Placeable, Unit>() { // from class: androidx.compose.foundation.layout.FlowLayoutOverflowState$setOverflowMeasurables$4$1
                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ Unit invoke(Placeable placeable) {
                    invoke2(placeable);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Placeable placeable) {
                    int iMainAxisSize;
                    int iCrossAxisSize;
                    if (placeable != null) {
                        FlowLineMeasurePolicy flowLineMeasurePolicy = p0;
                        iMainAxisSize = flowLineMeasurePolicy.mainAxisSize(placeable);
                        iCrossAxisSize = flowLineMeasurePolicy.crossAxisSize(placeable);
                    } else {
                        iMainAxisSize = 0;
                        iCrossAxisSize = 0;
                    }
                    this.this$0.collapseSize = IntIntPair.m342boximpl(IntIntPair.m345constructorimpl(iMainAxisSize, iCrossAxisSize));
                    this.this$0.collapsePlaceable = placeable;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }
            });
            this.collapseMeasurable = p2;
        }
    }

    /* JADX INFO: renamed from: setOverflowMeasurables-VKLhPVY$foundation_layout_release, reason: not valid java name */
    public final void m933setOverflowMeasurablesVKLhPVY$foundation_layout_release(FlowLineMeasurePolicy p0, long p1, Function2<? super Boolean, ? super Integer, ? extends Measurable> p2) {
        this.itemShown = 0;
        this.getOverflowMeasurable = p2;
        m931setOverflowMeasurableshBUhpc$foundation_layout_release(p0, p2.invoke(Boolean.TRUE, 0), p2.invoke(Boolean.FALSE, 0), p1);
    }

    public static /* synthetic */ FlowLayoutOverflowState copy$default(FlowLayoutOverflowState flowLayoutOverflowState, FlowLayoutOverflow.OverflowType overflowType, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            overflowType = flowLayoutOverflowState.type;
        }
        if ((i3 & 2) != 0) {
            i = flowLayoutOverflowState.minLinesToShowCollapse;
        }
        if ((i3 & 4) != 0) {
            i2 = flowLayoutOverflowState.minCrossAxisSizeToShowCollapse;
        }
        return flowLayoutOverflowState.copy(overflowType, i, i2);
    }

    /* JADX INFO: renamed from: component1$foundation_layout_release, reason: from getter */
    public final FlowLayoutOverflow.OverflowType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2$foundation_layout_release, reason: from getter */
    public final int getMinLinesToShowCollapse() {
        return this.minLinesToShowCollapse;
    }

    /* JADX INFO: renamed from: component3$foundation_layout_release, reason: from getter */
    public final int getMinCrossAxisSizeToShowCollapse() {
        return this.minCrossAxisSizeToShowCollapse;
    }

    public final FlowLayoutOverflowState copy(FlowLayoutOverflow.OverflowType p0, int p1, int p2) {
        return new FlowLayoutOverflowState(p0, p1, p2);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof FlowLayoutOverflowState)) {
            return false;
        }
        FlowLayoutOverflowState flowLayoutOverflowState = (FlowLayoutOverflowState) p0;
        return this.type == flowLayoutOverflowState.type && this.minLinesToShowCollapse == flowLayoutOverflowState.minLinesToShowCollapse && this.minCrossAxisSizeToShowCollapse == flowLayoutOverflowState.minCrossAxisSizeToShowCollapse;
    }

    public final int hashCode() {
        return (((this.type.hashCode() * 31) + Integer.hashCode(this.minLinesToShowCollapse)) * 31) + Integer.hashCode(this.minCrossAxisSizeToShowCollapse);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlowLayoutOverflowState(type=");
        sb.append(this.type);
        sb.append(", minLinesToShowCollapse=");
        sb.append(this.minLinesToShowCollapse);
        sb.append(", minCrossAxisSizeToShowCollapse=");
        sb.append(this.minCrossAxisSizeToShowCollapse);
        sb.append(')');
        return sb.toString();
    }
}
