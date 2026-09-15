package androidx.compose.ui.layout;

import android.graphics.Rect;
import androidx.collection.MutableObjectList;
import androidx.collection.ScatterMap;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LayoutModifierNodeKt;
import androidx.compose.ui.node.TraversableNode;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000f\u001a\u00020\f*\u00020\b2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\r\u0010\u000eR\u001d\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00108G¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0019\u001a\u00020\u00168G¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\u001b\u001a\u00020\u001a8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001d\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"0!8G¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020(0'8G¢\u0006\u0006\u001a\u0004\b)\u0010*R*\u0010,\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u0010\u0007R+\u00105\u001a\u0013\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020301¢\u0006\u0002\b48\u0007X\u0087\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0014\u0010;\u001a\u00020\u00118WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:"}, d2 = {"Landroidx/compose/ui/layout/RulerProviderModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/node/TraversableNode;", "Landroidx/compose/ui/layout/InsetsListener;", "p0", "<init>", "(Landroidx/compose/ui/layout/InsetsListener;)V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/unit/Constraints;", "p1", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/collection/ScatterMap;", "", "Landroidx/compose/ui/layout/WindowWindowInsetsAnimationValues;", "getInsetsValues", "()Landroidx/collection/ScatterMap;", "insetsValues", "Landroidx/compose/runtime/MutableIntState;", "getGeneration", "()Landroidx/compose/runtime/MutableIntState;", "generation", "", "previousGeneration", "I", "getPreviousGeneration", "()I", "setPreviousGeneration", "(I)V", "Landroidx/collection/MutableObjectList;", "Landroidx/compose/runtime/MutableState;", "Landroid/graphics/Rect;", "getCutoutRects", "()Landroidx/collection/MutableObjectList;", "cutoutRects", "", "Landroidx/compose/ui/layout/RectRulers;", "getCutoutRulers", "()Ljava/util/List;", "cutoutRulers", "insetsListener", "Landroidx/compose/ui/layout/InsetsListener;", "getInsetsListener", "()Landroidx/compose/ui/layout/InsetsListener;", "setInsetsListener", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/RulerScope;", "", "Lkotlin/ExtensionFunctionType;", "rulerLambda", "Lkotlin/jvm/functions/Function1;", "getRulerLambda", "()Lkotlin/jvm/functions/Function1;", "getTraverseKey", "()Ljava/lang/Object;", "traverseKey"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class RulerProviderModifierNode extends Modifier.Node implements LayoutModifierNode, TraversableNode {
    private InsetsListener insetsListener;
    private int previousGeneration = -1;
    private final Function1<RulerScope, Unit> rulerLambda;

    public RulerProviderModifierNode(final InsetsListener insetsListener) {
        this.insetsListener = insetsListener;
        this.rulerLambda = new Function1<RulerScope, Unit>() { // from class: androidx.compose.ui.layout.RulerProviderModifierNode$rulerLambda$1
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Unit invoke(RulerScope rulerScope) {
                invoke2(rulerScope);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(RulerScope rulerScope) {
                RulerProviderModifierNode rulerProviderModifierNode = this.this$0;
                rulerProviderModifierNode.setPreviousGeneration(rulerProviderModifierNode.getGeneration().getIntValue());
                if (this.this$0.getPreviousGeneration() > 0) {
                    long jMo5645getSizeYbymL2g = rulerScope.getCoordinates().mo5645getSizeYbymL2g();
                    ScatterMap<Object, WindowWindowInsetsAnimationValues> insetsValues = insetsListener.getInsetsValues();
                    int i = (int) (jMo5645getSizeYbymL2g >> 32);
                    int i2 = (int) (jMo5645getSizeYbymL2g & 4294967295L);
                    for (WindowInsetsRulers windowInsetsRulers : WindowInsetsRulers_androidKt.AnimatableInsetsRulers) {
                        WindowWindowInsetsAnimationValues windowWindowInsetsAnimationValues = insetsValues.get(windowInsetsRulers);
                        Intrinsics.checkNotNull(windowWindowInsetsAnimationValues);
                        WindowWindowInsetsAnimationValues windowWindowInsetsAnimationValues2 = windowWindowInsetsAnimationValues;
                        WindowInsetsRulers_androidKt.m5756provideInsetsValuescytEWk0(rulerScope, windowInsetsRulers.getCurrent(), windowWindowInsetsAnimationValues2.getCurrent(), i, i2);
                        if (windowWindowInsetsAnimationValues2.isAnimating()) {
                            WindowInsetsRulers_androidKt.m5756provideInsetsValuescytEWk0(rulerScope, windowWindowInsetsAnimationValues2.getSource(), windowWindowInsetsAnimationValues2.getSourceValueInsets(), i, i2);
                            WindowInsetsRulers_androidKt.m5756provideInsetsValuescytEWk0(rulerScope, windowWindowInsetsAnimationValues2.getTarget(), windowWindowInsetsAnimationValues2.getTargetValueInsets(), i, i2);
                        }
                        WindowInsetsRulers_androidKt.m5756provideInsetsValuescytEWk0(rulerScope, windowInsetsRulers.getMaximum(), windowWindowInsetsAnimationValues2.getMaximum(), i, i2);
                    }
                    if (this.this$0.getCutoutRects().isNotEmpty()) {
                        MutableObjectList<MutableState<Rect>> cutoutRects = this.this$0.getCutoutRects();
                        RulerProviderModifierNode rulerProviderModifierNode2 = this.this$0;
                        Object[] objArr = cutoutRects.content;
                        int i3 = cutoutRects._size;
                        for (int i4 = 0; i4 < i3; i4++) {
                            MutableState mutableState = (MutableState) objArr[i4];
                            RectRulers rectRulers = rulerProviderModifierNode2.getCutoutRulers().get(i4);
                            Rect rect = (Rect) mutableState.getValue();
                            rulerScope.provides(rectRulers.getLeft(), rect.left);
                            rulerScope.provides(rectRulers.getTop(), rect.top);
                            rulerScope.provides(rectRulers.getRight(), rect.right);
                            rulerScope.provides(rectRulers.getBottom(), rect.bottom);
                        }
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        };
    }

    public final ScatterMap<Object, WindowWindowInsetsAnimationValues> getInsetsValues() {
        return this.insetsListener.getInsetsValues();
    }

    public final MutableIntState getGeneration() {
        return this.insetsListener.getGeneration();
    }

    public final int getPreviousGeneration() {
        return this.previousGeneration;
    }

    public final void setPreviousGeneration(int i) {
        this.previousGeneration = i;
    }

    public final MutableObjectList<MutableState<Rect>> getCutoutRects() {
        return this.insetsListener.getDisplayCutouts();
    }

    public final List<RectRulers> getCutoutRulers() {
        return this.insetsListener.getDisplayCutoutRulers();
    }

    public final InsetsListener getInsetsListener() {
        return this.insetsListener;
    }

    public final void setInsetsListener(InsetsListener insetsListener) {
        if (this.insetsListener != insetsListener) {
            this.insetsListener = insetsListener;
            LayoutModifierNodeKt.requestRemeasure(this);
        }
    }

    public final Function1<RulerScope, Unit> getRulerLambda() {
        return this.rulerLambda;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final MeasureResult mo412measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        final Placeable placeableMo5637measureBRTryo0 = measurable.mo5637measureBRTryo0(j);
        return MeasureScope.layout$default(measureScope, placeableMo5637measureBRTryo0.getWidth(), placeableMo5637measureBRTryo0.getHeight(), null, this.rulerLambda, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.ui.layout.RulerProviderModifierNode$measure$1
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
        }, 4, null);
    }

    @Override // androidx.compose.ui.node.TraversableNode
    public final Object getTraverseKey() {
        return "androidx.compose.ui.layout.WindowInsetsRulers";
    }
}
