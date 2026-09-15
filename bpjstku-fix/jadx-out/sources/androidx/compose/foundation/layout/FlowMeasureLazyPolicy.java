package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001d\b\u0082\b\u0018\u00002\u00020\u0001B\u0099\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0017\u0010\u0017\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0002\b\u00160\u0013\u0012'\u0010\u001b\u001a#\u0012\t\u0012\u00070\r¢\u0006\u0002\b\u0019\u0012\t\u0012\u00070\u001a¢\u0006\u0002\b\u0019\u0012\u0004\u0012\u00020\u00150\u0018¢\u0006\u0002\b\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0011HÂ\u0003¢\u0006\u0004\b \u0010!J!\u0010\"\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0002\b\u00160\u0013HÂ\u0003¢\u0006\u0004\b\"\u0010#J1\u0010$\u001a#\u0012\t\u0012\u00070\r¢\u0006\u0002\b\u0019\u0012\t\u0012\u00070\u001a¢\u0006\u0002\b\u0019\u0012\u0004\u0012\u00020\u00150\u0018¢\u0006\u0002\b\u0016HÂ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0004HÇ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0006HÇ\u0003¢\u0006\u0004\b(\u0010)J\u0013\u0010,\u001a\u00020\bHÂ\u0003ø\u0001\u0000¢\u0006\u0004\b*\u0010+J\u0010\u0010-\u001a\u00020\nHÇ\u0003¢\u0006\u0004\b-\u0010.J\u0013\u00100\u001a\u00020\bHÂ\u0003ø\u0001\u0000¢\u0006\u0004\b/\u0010+J\u0010\u00101\u001a\u00020\rHÂ\u0003¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\rHÂ\u0003¢\u0006\u0004\b3\u00102J\u0010\u00104\u001a\u00020\rHÂ\u0003¢\u0006\u0004\b4\u00102J½\u0001\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u0019\b\u0002\u0010\u0017\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0002\b\u00160\u00132)\b\u0002\u0010\u001b\u001a#\u0012\t\u0012\u00070\r¢\u0006\u0002\b\u0019\u0012\t\u0012\u00070\u001a¢\u0006\u0002\b\u0019\u0012\u0004\u0012\u00020\u00150\u0018¢\u0006\u0002\b\u0016HÇ\u0001ø\u0001\u0000¢\u0006\u0004\b5\u00106J\u001a\u00109\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u000108HÖ\u0003¢\u0006\u0004\b9\u0010:J!\u0010>\u001a\u0014\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020=0\u0018H\u0007¢\u0006\u0004\b>\u0010?J\u0010\u0010@\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b@\u00102J\u0010\u0010B\u001a\u00020AH×\u0001¢\u0006\u0004\bB\u0010CJ\u001e\u0010F\u001a\u00020=*\u00020;2\u0006\u0010\u0003\u001a\u00020<H\u0002ø\u0001\u0000¢\u0006\u0004\bD\u0010ER\u001a\u0010G\u001a\u00020\n8\u0017X\u0097\u0004¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010.R\u0017\u0010J\u001a\u00020\b8\u0002X\u0083\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\bJ\u0010KR5\u0010L\u001a#\u0012\t\u0012\u00070\r¢\u0006\u0002\b\u0019\u0012\t\u0012\u00070\u001a¢\u0006\u0002\b\u0019\u0012\u0004\u0012\u00020\u00150\u0018¢\u0006\u0002\b\u00168\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u001a\u0010N\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010'R\u001a\u0010Q\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bQ\u0010\u001fR\u0014\u0010S\u001a\u00020\r8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0017\u0010U\u001a\u00020\b8\u0002X\u0083\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\bU\u0010KR\u0014\u0010V\u001a\u00020\r8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bV\u0010TR\u0014\u0010W\u001a\u00020\r8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bW\u0010TR\u0014\u0010X\u001a\u00020\u00118\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bX\u0010YR%\u0010Z\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0002\b\u00160\u00138\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u001a\u0010\\\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010)\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!"}, d2 = {"Landroidx/compose/foundation/layout/FlowMeasureLazyPolicy;", "Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;", "", "p0", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "p1", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "p2", "Landroidx/compose/ui/unit/Dp;", "p3", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "p4", "p5", "", "p6", "p7", "p8", "Landroidx/compose/foundation/layout/FlowLayoutOverflowState;", "p9", "", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "p10", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "Landroidx/compose/foundation/layout/FlowLineInfo;", "p11", "<init>", "(ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;FLandroidx/compose/foundation/layout/CrossAxisAlignment;FIIILandroidx/compose/foundation/layout/FlowLayoutOverflowState;Ljava/util/List;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()Z", "component10", "()Landroidx/compose/foundation/layout/FlowLayoutOverflowState;", "component11", "()Ljava/util/List;", "component12", "()Lkotlin/jvm/functions/Function4;", "component2", "()Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "component3", "()Landroidx/compose/foundation/layout/Arrangement$Vertical;", "component4-D9Ej5fM", "()F", "component4", "component5", "()Landroidx/compose/foundation/layout/CrossAxisAlignment;", "component6-D9Ej5fM", "component6", "component7", "()I", "component8", "component9", "copy-E4Q9ldg", "(ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;FLandroidx/compose/foundation/layout/CrossAxisAlignment;FIIILandroidx/compose/foundation/layout/FlowLayoutOverflowState;Ljava/util/List;Lkotlin/jvm/functions/Function4;)Landroidx/compose/foundation/layout/FlowMeasureLazyPolicy;", "copy", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "getMeasurePolicy", "()Lkotlin/jvm/functions/Function2;", "hashCode", "", "toString", "()Ljava/lang/String;", "measure-0kLqBqw", "(Landroidx/compose/ui/layout/SubcomposeMeasureScope;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "crossAxisAlignment", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "getCrossAxisAlignment", "crossAxisArrangementSpacing", "F", "getComposable", "Lkotlin/jvm/functions/Function4;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "getHorizontalArrangement", "isHorizontal", "Z", "itemCount", "I", "mainAxisSpacing", "maxItemsInMainAxis", "maxLines", "overflow", "Landroidx/compose/foundation/layout/FlowLayoutOverflowState;", "overflowComposables", "Ljava/util/List;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "getVerticalArrangement"}, k = 1, mv = {1, 8, 0}, xi = 48)
final /* data */ class FlowMeasureLazyPolicy implements FlowLineMeasurePolicy {
    private final CrossAxisAlignment crossAxisAlignment;
    private final float crossAxisArrangementSpacing;
    private final Function4<Integer, FlowLineInfo, Composer, Integer, Unit> getComposable;
    private final Arrangement.Horizontal horizontalArrangement;
    private final boolean isHorizontal;
    private final int itemCount;
    private final float mainAxisSpacing;
    private final int maxItemsInMainAxis;
    private final int maxLines;
    private final FlowLayoutOverflowState overflow;
    private final List<Function2<Composer, Integer, Unit>> overflowComposables;
    private final Arrangement.Vertical verticalArrangement;

    /* JADX WARN: Multi-variable type inference failed */
    private FlowMeasureLazyPolicy(boolean z, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, float f, CrossAxisAlignment crossAxisAlignment, float f2, int i, int i2, int i3, FlowLayoutOverflowState flowLayoutOverflowState, List<? extends Function2<? super Composer, ? super Integer, Unit>> list, Function4<? super Integer, ? super FlowLineInfo, ? super Composer, ? super Integer, Unit> function4) {
        this.isHorizontal = z;
        this.horizontalArrangement = horizontal;
        this.verticalArrangement = vertical;
        this.mainAxisSpacing = f;
        this.crossAxisAlignment = crossAxisAlignment;
        this.crossAxisArrangementSpacing = f2;
        this.itemCount = i;
        this.maxLines = i2;
        this.maxItemsInMainAxis = i3;
        this.overflow = flowLayoutOverflowState;
        this.overflowComposables = list;
        this.getComposable = function4;
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    public final boolean isHorizontal() {
        return this.isHorizontal;
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    public final Arrangement.Horizontal getHorizontalArrangement() {
        return this.horizontalArrangement;
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    public final Arrangement.Vertical getVerticalArrangement() {
        return this.verticalArrangement;
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    public final CrossAxisAlignment getCrossAxisAlignment() {
        return this.crossAxisAlignment;
    }

    public final Function2<SubcomposeMeasureScope, Constraints, MeasureResult> getMeasurePolicy() {
        return new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.foundation.layout.FlowMeasureLazyPolicy.getMeasurePolicy.1
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                return m945invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
            }

            /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
            public final MeasureResult m945invoke0kLqBqw(SubcomposeMeasureScope subcomposeMeasureScope, long j) {
                return FlowMeasureLazyPolicy.this.m943measure0kLqBqw(subcomposeMeasureScope, j);
            }

            {
                super(2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: measure-0kLqBqw, reason: not valid java name */
    public final MeasureResult m943measure0kLqBqw(final SubcomposeMeasureScope subcomposeMeasureScope, long j) {
        LayoutOrientation layoutOrientation;
        if (this.itemCount <= 0 || this.maxLines == 0 || this.maxItemsInMainAxis == 0 || (Constraints.m6887getMaxHeightimpl(j) == 0 && this.overflow.getType$foundation_layout_release() != FlowLayoutOverflow.OverflowType.Visible)) {
            return MeasureScope.layout$default(subcomposeMeasureScope, 0, 0, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.FlowMeasureLazyPolicy$measure$1
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Placeable.PlacementScope placementScope) {
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                    invoke2(placementScope);
                    return Unit.INSTANCE;
                }
            }, 4, null);
        }
        ContextualFlowItemIterator contextualFlowItemIterator = new ContextualFlowItemIterator(this.itemCount, new Function2<Integer, FlowLineInfo, List<? extends Measurable>>() { // from class: androidx.compose.foundation.layout.FlowMeasureLazyPolicy$measure$measurablesIterator$1
            @Override // kotlin.jvm.functions.Function2
            public final /* bridge */ /* synthetic */ List<? extends Measurable> invoke(Integer num, FlowLineInfo flowLineInfo) {
                return invoke(num.intValue(), flowLineInfo);
            }

            public final List<Measurable> invoke(final int i, final FlowLineInfo flowLineInfo) {
                SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                Integer numValueOf = Integer.valueOf(i);
                final FlowMeasureLazyPolicy flowMeasureLazyPolicy = this;
                return subcomposeMeasureScope2.subcompose(numValueOf, ComposableLambdaKt.composableLambdaInstance(-195060736, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.layout.FlowMeasureLazyPolicy$measure$measurablesIterator$1.1
                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer, int i2) {
                        if ((i2 & 3) == 2 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-195060736, i2, -1, "androidx.compose.foundation.layout.FlowMeasureLazyPolicy.measure.<anonymous>.<anonymous> (ContextualFlowLayout.kt:452)");
                        }
                        flowMeasureLazyPolicy.getComposable.invoke(Integer.valueOf(i), flowLineInfo, composer, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }
                }));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }
        });
        this.overflow.setItemCount$foundation_layout_release(this.itemCount);
        FlowMeasureLazyPolicy flowMeasureLazyPolicy = this;
        this.overflow.m933setOverflowMeasurablesVKLhPVY$foundation_layout_release(flowMeasureLazyPolicy, j, new Function2<Boolean, Integer, Measurable>() { // from class: androidx.compose.foundation.layout.FlowMeasureLazyPolicy$measure$2
            @Override // kotlin.jvm.functions.Function2
            public final /* bridge */ /* synthetic */ Measurable invoke(Boolean bool, Integer num) {
                return invoke(bool.booleanValue(), num.intValue());
            }

            public final Measurable invoke(boolean z, int i) {
                Function2<? super Composer, ? super Integer, Unit> function2 = (Function2) CollectionsKt.getOrNull(this.this$0.overflowComposables, !z ? 1 : 0);
                if (function2 == null) {
                    return null;
                }
                SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                FlowMeasureLazyPolicy flowMeasureLazyPolicy2 = this.this$0;
                StringBuilder sb = new StringBuilder();
                sb.append(z);
                sb.append(flowMeasureLazyPolicy2.itemCount);
                sb.append(i);
                return (Measurable) CollectionsKt.getOrNull(subcomposeMeasureScope2.subcompose(sb.toString(), function2), 0);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }
        });
        SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
        ContextualFlowItemIterator contextualFlowItemIterator2 = contextualFlowItemIterator;
        float f = this.mainAxisSpacing;
        float f2 = this.crossAxisArrangementSpacing;
        if (isHorizontal()) {
            layoutOrientation = LayoutOrientation.Horizontal;
        } else {
            layoutOrientation = LayoutOrientation.Vertical;
        }
        return FlowLayoutKt.m927breakDownItemsdi9J0FM(subcomposeMeasureScope2, flowMeasureLazyPolicy, contextualFlowItemIterator2, f, f2, OrientationIndependentConstraints.m971constructorimpl(j, layoutOrientation), this.maxItemsInMainAxis, this.maxLines, this.overflow);
    }

    public /* synthetic */ FlowMeasureLazyPolicy(boolean z, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, float f, CrossAxisAlignment crossAxisAlignment, float f2, int i, int i2, int i3, FlowLayoutOverflowState flowLayoutOverflowState, List list, Function4 function4, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, horizontal, vertical, f, crossAxisAlignment, f2, i, i2, i3, flowLayoutOverflowState, list, function4);
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    private final FlowLayoutOverflowState getOverflow() {
        return this.overflow;
    }

    private final List<Function2<Composer, Integer, Unit>> component11() {
        return this.overflowComposables;
    }

    private final Function4<Integer, FlowLineInfo, Composer, Integer, Unit> component12() {
        return this.getComposable;
    }

    /* JADX INFO: renamed from: component4-D9Ej5fM, reason: not valid java name and from getter */
    private final float getMainAxisSpacing() {
        return this.mainAxisSpacing;
    }

    /* JADX INFO: renamed from: component6-D9Ej5fM, reason: not valid java name and from getter */
    private final float getCrossAxisArrangementSpacing() {
        return this.crossAxisArrangementSpacing;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    private final int getItemCount() {
        return this.itemCount;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    private final int getMaxLines() {
        return this.maxLines;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    private final int getMaxItemsInMainAxis() {
        return this.maxItemsInMainAxis;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsHorizontal() {
        return this.isHorizontal;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Arrangement.Horizontal getHorizontalArrangement() {
        return this.horizontalArrangement;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Arrangement.Vertical getVerticalArrangement() {
        return this.verticalArrangement;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final CrossAxisAlignment getCrossAxisAlignment() {
        return this.crossAxisAlignment;
    }

    /* JADX INFO: renamed from: copy-E4Q9ldg, reason: not valid java name */
    public final FlowMeasureLazyPolicy m944copyE4Q9ldg(boolean p0, Arrangement.Horizontal p1, Arrangement.Vertical p2, float p3, CrossAxisAlignment p4, float p5, int p6, int p7, int p8, FlowLayoutOverflowState p9, List<? extends Function2<? super Composer, ? super Integer, Unit>> p10, Function4<? super Integer, ? super FlowLineInfo, ? super Composer, ? super Integer, Unit> p11) {
        return new FlowMeasureLazyPolicy(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, null);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof FlowMeasureLazyPolicy)) {
            return false;
        }
        FlowMeasureLazyPolicy flowMeasureLazyPolicy = (FlowMeasureLazyPolicy) p0;
        return this.isHorizontal == flowMeasureLazyPolicy.isHorizontal && Intrinsics.areEqual(this.horizontalArrangement, flowMeasureLazyPolicy.horizontalArrangement) && Intrinsics.areEqual(this.verticalArrangement, flowMeasureLazyPolicy.verticalArrangement) && Dp.m6940equalsimpl0(this.mainAxisSpacing, flowMeasureLazyPolicy.mainAxisSpacing) && Intrinsics.areEqual(this.crossAxisAlignment, flowMeasureLazyPolicy.crossAxisAlignment) && Dp.m6940equalsimpl0(this.crossAxisArrangementSpacing, flowMeasureLazyPolicy.crossAxisArrangementSpacing) && this.itemCount == flowMeasureLazyPolicy.itemCount && this.maxLines == flowMeasureLazyPolicy.maxLines && this.maxItemsInMainAxis == flowMeasureLazyPolicy.maxItemsInMainAxis && Intrinsics.areEqual(this.overflow, flowMeasureLazyPolicy.overflow) && Intrinsics.areEqual(this.overflowComposables, flowMeasureLazyPolicy.overflowComposables) && Intrinsics.areEqual(this.getComposable, flowMeasureLazyPolicy.getComposable);
    }

    public final int hashCode() {
        return (((((((((((((((((((((Boolean.hashCode(this.isHorizontal) * 31) + this.horizontalArrangement.hashCode()) * 31) + this.verticalArrangement.hashCode()) * 31) + Dp.m6941hashCodeimpl(this.mainAxisSpacing)) * 31) + this.crossAxisAlignment.hashCode()) * 31) + Dp.m6941hashCodeimpl(this.crossAxisArrangementSpacing)) * 31) + Integer.hashCode(this.itemCount)) * 31) + Integer.hashCode(this.maxLines)) * 31) + Integer.hashCode(this.maxItemsInMainAxis)) * 31) + this.overflow.hashCode()) * 31) + this.overflowComposables.hashCode()) * 31) + this.getComposable.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlowMeasureLazyPolicy(isHorizontal=");
        sb.append(this.isHorizontal);
        sb.append(", horizontalArrangement=");
        sb.append(this.horizontalArrangement);
        sb.append(", verticalArrangement=");
        sb.append(this.verticalArrangement);
        sb.append(", mainAxisSpacing=");
        sb.append((Object) Dp.m6946toStringimpl(this.mainAxisSpacing));
        sb.append(", crossAxisAlignment=");
        sb.append(this.crossAxisAlignment);
        sb.append(", crossAxisArrangementSpacing=");
        sb.append((Object) Dp.m6946toStringimpl(this.crossAxisArrangementSpacing));
        sb.append(", itemCount=");
        sb.append(this.itemCount);
        sb.append(", maxLines=");
        sb.append(this.maxLines);
        sb.append(", maxItemsInMainAxis=");
        sb.append(this.maxItemsInMainAxis);
        sb.append(", overflow=");
        sb.append(this.overflow);
        sb.append(", overflowComposables=");
        sb.append(this.overflowComposables);
        sb.append(", getComposable=");
        sb.append(this.getComposable);
        sb.append(')');
        return sb.toString();
    }
}
