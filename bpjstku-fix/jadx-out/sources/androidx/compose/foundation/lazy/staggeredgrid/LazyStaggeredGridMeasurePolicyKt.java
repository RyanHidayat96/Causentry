package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.CheckScrollableContainerConstraintsKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsStateKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u007f\u0010\u001b\u001a\u0019\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0014¢\u0006\u0002\b\u00182\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a+\u0010\u001d\u001a\u00020\u000b*\u00020\u00052\u0006\u0010\u0001\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a+\u0010\u001f\u001a\u00020\u000b*\u00020\u00052\u0006\u0010\u0001\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010\u001e\u001a#\u0010 \u001a\u00020\u000b*\u00020\u00052\u0006\u0010\u0001\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u001cH\u0002¢\u0006\u0004\b \u0010!\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "p0", "Lkotlin/Function0;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;", "p1", "Landroidx/compose/foundation/layout/PaddingValues;", "p2", "", "p3", "Landroidx/compose/foundation/gestures/Orientation;", "p4", "Landroidx/compose/ui/unit/Dp;", "p5", "p6", "Lkotlinx/coroutines/CoroutineScope;", "p7", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;", "p8", "Landroidx/compose/ui/graphics/GraphicsContext;", "p9", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "Lkotlin/ExtensionFunctionType;", "rememberStaggeredGridMeasurePolicy-qKj4JfE", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/gestures/Orientation;FFLkotlinx/coroutines/CoroutineScope;Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;Landroidx/compose/ui/graphics/GraphicsContext;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function2;", "rememberStaggeredGridMeasurePolicy", "Landroidx/compose/ui/unit/LayoutDirection;", "afterPadding", "(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/ui/unit/LayoutDirection;)F", "beforePadding", "startPadding", "(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/ui/unit/LayoutDirection;)F"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class LazyStaggeredGridMeasurePolicyKt {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Orientation.values().length];
            try {
                iArr[Orientation.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Orientation.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0030  */
    /* JADX WARN: Code duplicated, block: B:39:0x007a  */
    /* JADX WARN: Code duplicated, block: B:49:0x0095  */
    /* JADX WARN: Code duplicated, block: B:67:0x00cc  */
    /* JADX INFO: renamed from: rememberStaggeredGridMeasurePolicy-qKj4JfE, reason: not valid java name */
    public static final Function2<LazyLayoutMeasureScope, Constraints, LazyStaggeredGridMeasureResult> m1214rememberStaggeredGridMeasurePolicyqKj4JfE(final LazyStaggeredGridState lazyStaggeredGridState, final Function0<? extends LazyStaggeredGridItemProvider> function0, final PaddingValues paddingValues, final boolean z, final Orientation orientation, final float f, float f2, final CoroutineScope coroutineScope, final LazyGridStaggeredGridSlotsProvider lazyGridStaggeredGridSlotsProvider, final GraphicsContext graphicsContext, Composer composer, int i) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1630140849, i, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberStaggeredGridMeasurePolicy (LazyStaggeredGridMeasurePolicy.kt:50)");
        }
        boolean zChanged = composer.changed(lazyStaggeredGridState);
        if (((i & 112) ^ 48) > 32 && composer.changed(function0)) {
            z2 = true;
        } else if ((i & 48) == 32) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z6 = (((i & 896) ^ 384) > 256 && composer.changed(paddingValues)) || (i & 384) == 256;
        boolean z7 = (((i & 7168) ^ 3072) > 2048 && composer.changed(z)) || (i & 3072) == 2048;
        if (((57344 & i) ^ 24576) > 16384 && composer.changed(orientation)) {
            z3 = true;
        } else if ((i & 24576) == 16384) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (((458752 & i) ^ ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) > 131072 && composer.changed(f)) {
            z4 = true;
        } else if ((196608 & i) == 131072) {
            z4 = true;
        } else {
            z4 = false;
        }
        boolean z8 = (((3670016 & i) ^ 1572864) > 1048576 && composer.changed(f2)) || (i & 1572864) == 1048576;
        if (((234881024 & i) ^ 100663296) > 67108864 && composer.changed(lazyGridStaggeredGridSlotsProvider)) {
            z5 = true;
        } else if ((i & 100663296) == 67108864) {
            z5 = true;
        } else {
            z5 = false;
        }
        boolean zChanged2 = composer.changed(graphicsContext);
        Object objRememberedValue = composer.rememberedValue();
        if ((zChanged2 | zChanged | z2 | z6 | z7 | z3 | z4 | z8 | z5) || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = (Function2) new Function2<LazyLayoutMeasureScope, Constraints, LazyStaggeredGridMeasureResult>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1
                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ LazyStaggeredGridMeasureResult invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) {
                    return m1215invoke0kLqBqw(lazyLayoutMeasureScope, constraints.getValue());
                }

                /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                public final LazyStaggeredGridMeasureResult m1215invoke0kLqBqw(LazyLayoutMeasureScope lazyLayoutMeasureScope, long j) {
                    long jIntOffset;
                    ObservableScopeInvalidator.m1176attachToScopeimpl(lazyStaggeredGridState.m1220getMeasurementScopeInvalidatorzYiylxw$foundation_release());
                    CheckScrollableContainerConstraintsKt.m585checkScrollableContainerConstraintsK40F9xA(j, orientation);
                    LazyStaggeredGridSlots lazyStaggeredGridSlotsMo1196invoke0kLqBqw = lazyGridStaggeredGridSlotsProvider.mo1196invoke0kLqBqw(lazyLayoutMeasureScope, j);
                    boolean z9 = orientation == Orientation.Vertical;
                    LazyStaggeredGridItemProvider lazyStaggeredGridItemProviderInvoke = function0.invoke();
                    int i2 = lazyLayoutMeasureScope.mo688roundToPx0680j_4(LazyStaggeredGridMeasurePolicyKt.beforePadding(paddingValues, orientation, z, lazyLayoutMeasureScope.getLayoutDirection()));
                    int i3 = lazyLayoutMeasureScope.mo688roundToPx0680j_4(LazyStaggeredGridMeasurePolicyKt.afterPadding(paddingValues, orientation, z, lazyLayoutMeasureScope.getLayoutDirection()));
                    int i4 = lazyLayoutMeasureScope.mo688roundToPx0680j_4(LazyStaggeredGridMeasurePolicyKt.startPadding(paddingValues, orientation, lazyLayoutMeasureScope.getLayoutDirection()));
                    int iM6887getMaxHeightimpl = z9 ? Constraints.m6887getMaxHeightimpl(j) : Constraints.m6888getMaxWidthimpl(j);
                    if (z9) {
                        jIntOffset = IntOffsetKt.IntOffset(i4, i2);
                    } else {
                        jIntOffset = IntOffsetKt.IntOffset(i2, i4);
                    }
                    long j2 = jIntOffset;
                    PaddingValues paddingValues2 = paddingValues;
                    int i5 = lazyLayoutMeasureScope.mo688roundToPx0680j_4(Dp.m6935constructorimpl(PaddingKt.calculateStartPadding(paddingValues2, lazyLayoutMeasureScope.getLayoutDirection()) + PaddingKt.calculateEndPadding(paddingValues2, lazyLayoutMeasureScope.getLayoutDirection())));
                    PaddingValues paddingValues3 = paddingValues;
                    int i6 = (iM6887getMaxHeightimpl - i2) - i3;
                    boolean z10 = z9;
                    LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResultM1213measureStaggeredGridXtK8cYQ = LazyStaggeredGridMeasureKt.m1213measureStaggeredGridXtK8cYQ(lazyLayoutMeasureScope, lazyStaggeredGridState, LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(lazyStaggeredGridItemProviderInvoke, lazyStaggeredGridState.getPinnedItems(), lazyStaggeredGridState.getBeyondBoundsInfo()), lazyStaggeredGridItemProviderInvoke, lazyStaggeredGridSlotsMo1196invoke0kLqBqw, Constraints.m6878copyZbe2FdA$default(j, ConstraintsKt.m6905constrainWidthK40F9xA(j, i5), 0, ConstraintsKt.m6904constrainHeightK40F9xA(j, lazyLayoutMeasureScope.mo688roundToPx0680j_4(Dp.m6935constructorimpl(paddingValues3.getTop() + paddingValues3.getBottom()))), 0, 10, null), z10, z, j2, i6, lazyLayoutMeasureScope.mo688roundToPx0680j_4(f), i2, i3, coroutineScope, graphicsContext);
                    LazyStaggeredGridState.applyMeasureResult$foundation_release$default(lazyStaggeredGridState, lazyStaggeredGridMeasureResultM1213measureStaggeredGridXtK8cYQ, false, 2, null);
                    return lazyStaggeredGridMeasureResultM1213measureStaggeredGridXtK8cYQ;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function2<LazyLayoutMeasureScope, Constraints, LazyStaggeredGridMeasureResult> function2 = (Function2) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return function2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float startPadding(PaddingValues paddingValues, Orientation orientation, LayoutDirection layoutDirection) {
        int i = WhenMappings.$EnumSwitchMapping$0[orientation.ordinal()];
        if (i == 1) {
            return PaddingKt.calculateStartPadding(paddingValues, layoutDirection);
        }
        if (i == 2) {
            return paddingValues.getTop();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float beforePadding(PaddingValues paddingValues, Orientation orientation, boolean z, LayoutDirection layoutDirection) {
        int i = WhenMappings.$EnumSwitchMapping$0[orientation.ordinal()];
        if (i == 1) {
            return z ? paddingValues.getBottom() : paddingValues.getTop();
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        if (z) {
            return PaddingKt.calculateEndPadding(paddingValues, layoutDirection);
        }
        return PaddingKt.calculateStartPadding(paddingValues, layoutDirection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float afterPadding(PaddingValues paddingValues, Orientation orientation, boolean z, LayoutDirection layoutDirection) {
        int i = WhenMappings.$EnumSwitchMapping$0[orientation.ordinal()];
        if (i == 1) {
            return z ? paddingValues.getTop() : paddingValues.getBottom();
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        if (z) {
            return PaddingKt.calculateStartPadding(paddingValues, layoutDirection);
        }
        return PaddingKt.calculateEndPadding(paddingValues, layoutDirection);
    }
}
