package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.TextDelegateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004BU\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012,\u0010\u0014\u001a(\u0012\u0004\u0012\u00020\u000e\u0012\u0011\u0012\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f¢\u0006\u0002\b\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\r¢\u0006\u0002\b\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J[\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2,\u0010\u0014\u001a(\u0012\u0004\u0012\u00020\u000e\u0012\u0011\u0012\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f¢\u0006\u0002\b\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\r¢\u0006\u0002\b\u0013¢\u0006\u0004\b\u001a\u0010\u0016J&\u0010!\u001a\u00020\u001e*\u00020\u001b2\u0006\u0010\u0006\u001a\u00020\u001c2\u0006\u0010\b\u001a\u00020\u001dH\u0017ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 R*\u0010%\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b%\u0010&\u0012\u0004\b'\u0010(R\u0016\u0010)\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010+\u001a\u00020\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b+\u0010,\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001"}, d2 = {"Landroidx/compose/foundation/text/input/internal/TextFieldTextLayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "p0", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "p1", "Landroidx/compose/ui/text/TextStyle;", "p2", "", "p3", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "Lkotlin/Function0;", "Landroidx/compose/ui/text/TextLayoutResult;", "Lkotlin/ParameterName;", "", "Lkotlin/ExtensionFunctionType;", "p4", "<init>", "(Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/ui/text/TextStyle;ZLkotlin/jvm/functions/Function2;)V", "Landroidx/compose/ui/layout/LayoutCoordinates;", "onGloballyPositioned", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "updateNode", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "", "Landroidx/compose/ui/layout/AlignmentLine;", "", "baselineCache", "Ljava/util/Map;", "getBaselineCache$annotations", "()V", "singleLine", "Z", "textLayoutState", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TextFieldTextLayoutModifierNode extends Modifier.Node implements LayoutModifierNode, GlobalPositionAwareModifierNode, CompositionLocalConsumerModifierNode {
    public static final int $stable = 8;
    private Map<AlignmentLine, Integer> baselineCache;
    private boolean singleLine;
    private TextLayoutState textLayoutState;

    private static /* synthetic */ void getBaselineCache$annotations() {
    }

    public TextFieldTextLayoutModifierNode(TextLayoutState textLayoutState, TransformedTextFieldState transformedTextFieldState, TextStyle textStyle, boolean z, Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function2) {
        this.textLayoutState = textLayoutState;
        this.singleLine = z;
        textLayoutState.setOnTextLayout(function2);
        TextLayoutState textLayoutState2 = this.textLayoutState;
        boolean z2 = this.singleLine;
        textLayoutState2.updateNonMeasureInputs(transformedTextFieldState, textStyle, z2, !z2);
    }

    public final void updateNode(TextLayoutState p0, TransformedTextFieldState p1, TextStyle p2, boolean p3, Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> p4) {
        this.textLayoutState = p0;
        p0.setOnTextLayout(p4);
        this.singleLine = p3;
        this.textLayoutState.updateNonMeasureInputs(p1, p2, p3, !p3);
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public final void onGloballyPositioned(LayoutCoordinates p0) {
        this.textLayoutState.setTextLayoutNodeCoordinates(p0);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final MeasureResult mo412measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        float fM6935constructorimpl;
        TextLayoutResult textLayoutResultM1539layoutWithNewMeasureInputshBUhpc = this.textLayoutState.m1539layoutWithNewMeasureInputshBUhpc(measureScope, measureScope.getLayoutDirection(), (FontFamily.Resolver) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalFontFamilyResolver()), j);
        final Placeable placeableMo5637measureBRTryo0 = measurable.mo5637measureBRTryo0(Constraints.INSTANCE.m6897fitPrioritizingWidthZbe2FdA(IntSize.m7106getWidthimpl(textLayoutResultM1539layoutWithNewMeasureInputshBUhpc.getSize()), IntSize.m7106getWidthimpl(textLayoutResultM1539layoutWithNewMeasureInputshBUhpc.getSize()), IntSize.m7105getHeightimpl(textLayoutResultM1539layoutWithNewMeasureInputshBUhpc.getSize()), IntSize.m7105getHeightimpl(textLayoutResultM1539layoutWithNewMeasureInputshBUhpc.getSize())));
        TextLayoutState textLayoutState = this.textLayoutState;
        if (this.singleLine) {
            fM6935constructorimpl = measureScope.mo691toDpu2uoSUM(TextDelegateKt.ceilToIntPx(textLayoutResultM1539layoutWithNewMeasureInputshBUhpc.getLineBottom(0)));
        } else {
            fM6935constructorimpl = Dp.m6935constructorimpl(0.0f);
        }
        textLayoutState.m1540setMinHeightForSingleLineField0680j_4(fM6935constructorimpl);
        LinkedHashMap linkedHashMap = this.baselineCache;
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap(2);
        }
        linkedHashMap.put(AlignmentLineKt.getFirstBaseline(), Integer.valueOf(Math.round(textLayoutResultM1539layoutWithNewMeasureInputshBUhpc.getFirstBaseline())));
        linkedHashMap.put(AlignmentLineKt.getLastBaseline(), Integer.valueOf(Math.round(textLayoutResultM1539layoutWithNewMeasureInputshBUhpc.getLastBaseline())));
        this.baselineCache = linkedHashMap;
        int iM7106getWidthimpl = IntSize.m7106getWidthimpl(textLayoutResultM1539layoutWithNewMeasureInputshBUhpc.getSize());
        int iM7105getHeightimpl = IntSize.m7105getHeightimpl(textLayoutResultM1539layoutWithNewMeasureInputshBUhpc.getSize());
        Map<AlignmentLine, Integer> map = this.baselineCache;
        Intrinsics.checkNotNull(map);
        return measureScope.layout(iM7106getWidthimpl, iM7105getHeightimpl, map, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldTextLayoutModifierNode$measure$1
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.place$default(placementScope, placeableMo5637measureBRTryo0, 0, 0, 0.0f, 4, null);
            }

            {
                super(1);
            }
        });
    }
}
