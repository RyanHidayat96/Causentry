package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u001a\u001e\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0082\b¢\u0006\u0004\b\u0004\u0010\u0005\u001a7\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\u0006\u0010\u0002\u001a\u00020\u00072\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0002\b\tH\u0083\b¢\u0006\u0004\b\u000b\u0010\f\u001aO\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0013*\u00020\r2\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\b2\u0017\u0010\n\u001a\u0013\u0012\t\u0012\u00070\u000f¢\u0006\u0002\b\u0010\u0012\u0004\u0012\u00020\u00110\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0083\b¢\u0006\u0004\b\u0014\u0010\u0015\u001a=\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0013*\u00020\r2\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00170\u00162\u0006\u0010\n\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001f\u0010\u001b\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00170\u0016H\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a#\u0010\u001d\u001a\u00020\u0003*\u00020\r2\u0006\u0010\u0002\u001a\u00020\u00182\u0006\u0010\n\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a>\u0010\u001f\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00132\b\b\u0002\u0010\u0002\u001a\u00020\u00112\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\bH\u0082\b¢\u0006\u0004\b\u001f\u0010 \u001a#\u0010!\u001a\u00020\u000f*\u00020\r2\u0006\u0010\u0002\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000fH\u0002¢\u0006\u0004\b!\u0010\"\u001a+\u0010&\u001a\u00020\u0003*\u00020#2\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00030\bH\u0082\bø\u0001\u0000¢\u0006\u0004\b$\u0010%\u001a\u0013\u0010'\u001a\u00020\u000f*\u00020\u0018H\u0002¢\u0006\u0004\b'\u0010(\u001a4\u0010)\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00162\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f0\bH\u0082\b¢\u0006\u0004\b)\u0010*\u001a\u001d\u0010+\u001a\u00020\u000f*\u00020\u00182\b\b\u0002\u0010\u0002\u001a\u00020\u000fH\u0000¢\u0006\u0004\b+\u0010,\u001a\u001e\u0010/\u001a\u00020\u000f*\u00020\u00182\u0006\u0010\u0002\u001a\u00020#H\u0002ø\u0001\u0000¢\u0006\u0004\b-\u0010.\u001a3\u00102\u001a\u000201*\u00020\r2\u0006\u0010\u0002\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00182\u0006\u00100\u001a\u00020\u0011H\u0003¢\u0006\u0004\b2\u00103\u001a\u008c\u0001\u0010G\u001a\u000201*\u00020\u00072\u0006\u0010\u0002\u001a\u0002042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00132\u0006\u0010\u0012\u001a\u0002052\u0006\u00100\u001a\u0002062\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u00020\u00112\u0006\u0010:\u001a\u00020\u00112\u0006\u0010<\u001a\u00020;2\u0006\u0010=\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020\u000f2\u0006\u0010?\u001a\u00020\u000f2\u0006\u0010@\u001a\u00020\u000f2\u0006\u0010B\u001a\u00020A2\u0006\u0010D\u001a\u00020CH\u0001ø\u0001\u0000¢\u0006\u0004\bE\u0010F\u001a\u001b\u0010H\u001a\u00020\u0003*\u00020\u00182\u0006\u0010\u0002\u001a\u00020\u000fH\u0002¢\u0006\u0004\bH\u0010I\u001a(\u0010J\u001a\u00020\u0018*\u00020\u00182\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\bH\u0082\b¢\u0006\u0004\bJ\u0010K\"\u0014\u0010L\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\bL\u0010M\"\u0014\u0010N\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\bN\u0010O\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001"}, d2 = {"Lkotlin/Function0;", "", "p0", "", "debugLog", "(Lkotlin/jvm/functions/Function0;)V", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "p1", "withDebugLogging", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;", "", "Lkotlin/ParameterName;", "", "p2", "", "calculateExtraItems", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Z)Ljava/util/List;", "", "Lkotlin/collections/ArrayDeque;", "", "calculateVisibleItems", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;[Lkotlin/collections/ArrayDeque;[II)Ljava/util/List;", "debugRender", "([Lkotlin/collections/ArrayDeque;)Ljava/lang/String;", "ensureIndicesInRange", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;[II)V", "fastForEach", "(Ljava/util/List;ZLkotlin/jvm/functions/Function1;)V", "findPreviousItemIndex", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;II)I", "Landroidx/compose/foundation/lazy/staggeredgrid/SpanRange;", "forEach-nIS5qE8", "(JLkotlin/jvm/functions/Function1;)V", "forEach", "indexOfMaxValue", "([I)I", "indexOfMinBy", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)I", "indexOfMinValue", "([II)I", "maxInRange-jy6DScQ", "([IJ)I", "maxInRange", "p3", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "measure", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;I[I[IZ)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;", "Landroidx/compose/ui/unit/Constraints;", "p4", "p5", "p6", "Landroidx/compose/ui/unit/IntOffset;", "p7", "p8", "p9", "p10", "p11", "Lkotlinx/coroutines/CoroutineScope;", "p12", "Landroidx/compose/ui/graphics/GraphicsContext;", "p13", "measureStaggeredGrid-XtK8cYQ", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Ljava/util/List;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;JZZJIIIILkotlinx/coroutines/CoroutineScope;Landroidx/compose/ui/graphics/GraphicsContext;)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "measureStaggeredGrid", "offsetBy", "([II)V", "transform", "([ILkotlin/jvm/functions/Function1;)[I", "DebugLoggingEnabled", "Z", "Unset", "I"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class LazyStaggeredGridMeasureKt {
    private static final boolean DebugLoggingEnabled = false;
    private static final int Unset = Integer.MIN_VALUE;

    private static final void debugLog(Function0<String> function0) {
    }

    private static final <T> T withDebugLogging(LazyLayoutMeasureScope lazyLayoutMeasureScope, Function1<? super LazyLayoutMeasureScope, ? extends T> function1) {
        return function1.invoke(lazyLayoutMeasureScope);
    }

    private static final String debugRender(ArrayDeque<LazyStaggeredGridMeasuredItem>[] arrayDequeArr) {
        return "";
    }

    /* JADX INFO: renamed from: measureStaggeredGrid-XtK8cYQ, reason: not valid java name */
    public static final LazyStaggeredGridMeasureResult m1213measureStaggeredGridXtK8cYQ(LazyLayoutMeasureScope lazyLayoutMeasureScope, LazyStaggeredGridState lazyStaggeredGridState, List<Integer> list, LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider, LazyStaggeredGridSlots lazyStaggeredGridSlots, long j, boolean z, boolean z2, long j2, int i, int i2, int i3, int i4, CoroutineScope coroutineScope, GraphicsContext graphicsContext) {
        int i5;
        int iM1212maxInRangejy6DScQ;
        LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext = new LazyStaggeredGridMeasureContext(lazyStaggeredGridState, list, lazyStaggeredGridItemProvider, lazyStaggeredGridSlots, j, z, lazyLayoutMeasureScope, i, j2, i3, i4, z2, i2, coroutineScope, graphicsContext, null);
        int[] iArrUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release = lazyStaggeredGridState.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(lazyStaggeredGridItemProvider, lazyStaggeredGridState.getScrollPosition().getIndices());
        int[] scrollOffsets = lazyStaggeredGridState.getScrollPosition().getScrollOffsets();
        if (iArrUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release.length != lazyStaggeredGridMeasureContext.getLaneCount()) {
            lazyStaggeredGridMeasureContext.getLaneInfo().reset();
            int laneCount = lazyStaggeredGridMeasureContext.getLaneCount();
            int[] iArr = new int[laneCount];
            int i6 = 0;
            while (i6 < laneCount) {
                if (i6 >= iArrUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release.length || (iM1212maxInRangejy6DScQ = iArrUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release[i6]) == -1) {
                    iM1212maxInRangejy6DScQ = i6 == 0 ? 0 : m1212maxInRangejy6DScQ(iArr, SpanRange.m1223constructorimpl(0, i6)) + 1;
                }
                iArr[i6] = iM1212maxInRangejy6DScQ;
                lazyStaggeredGridMeasureContext.getLaneInfo().setLane(iArr[i6], i6);
                i6++;
            }
            iArrUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release = iArr;
        }
        if (scrollOffsets.length != lazyStaggeredGridMeasureContext.getLaneCount()) {
            int laneCount2 = lazyStaggeredGridMeasureContext.getLaneCount();
            int[] iArr2 = new int[laneCount2];
            int i7 = 0;
            while (i7 < laneCount2) {
                if (i7 < scrollOffsets.length) {
                    i5 = scrollOffsets[i7];
                } else {
                    i5 = i7 == 0 ? 0 : iArr2[i7 - 1];
                }
                iArr2[i7] = i5;
                i7++;
            }
            scrollOffsets = iArr2;
        }
        return measure(lazyStaggeredGridMeasureContext, Math.round(lazyStaggeredGridState.getScrollToBeConsumed()), iArrUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release, scrollOffsets, true);
    }

    /* JADX WARN: Code duplicated, block: B:250:0x0569  */
    private static final LazyStaggeredGridMeasureResult measure(final LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int i, int[] iArr, int[] iArr2, boolean z) {
        LazyLayoutMeasureScope measureScope;
        int laneCount;
        ArrayDeque[] arrayDequeArr;
        boolean z2;
        int iIndexOf;
        int i2;
        int[] iArrCopyOf;
        int length;
        boolean z3;
        int i3;
        int i4;
        int i5;
        int[] iArr3;
        int[] iArr4;
        int i6;
        int[] iArr5;
        int iM6905constrainWidthK40F9xA;
        int iM6887getMaxHeightimpl;
        int i7;
        ArrayList arrayListEmptyList;
        boolean z4;
        List<Integer> list;
        int i8;
        int[] iArr6;
        int i9;
        int i10;
        int[] gaps;
        int i11;
        int i12 = i;
        int[] iArr7 = iArr;
        int[] iArr8 = iArr2;
        boolean z5 = z;
        loop0: while (true) {
            measureScope = lazyStaggeredGridMeasureContext.getMeasureScope();
            int itemCount = lazyStaggeredGridMeasureContext.getItemProvider().getItemCount();
            if (itemCount <= 0 || lazyStaggeredGridMeasureContext.getLaneCount() == 0) {
                int iM6890getMinWidthimpl = Constraints.m6890getMinWidthimpl(lazyStaggeredGridMeasureContext.getConstraints());
                int iM6889getMinHeightimpl = Constraints.m6889getMinHeightimpl(lazyStaggeredGridMeasureContext.getConstraints());
                lazyStaggeredGridMeasureContext.getState().getItemAnimator$foundation_release().onMeasured(0, iM6890getMinWidthimpl, iM6889getMinHeightimpl, new ArrayList(), lazyStaggeredGridMeasureContext.getMeasuredItemProvider().getKeyIndexMap(), lazyStaggeredGridMeasureContext.getMeasuredItemProvider(), lazyStaggeredGridMeasureContext.getIsVertical(), false, lazyStaggeredGridMeasureContext.getLaneCount(), false, 0, 0, lazyStaggeredGridMeasureContext.getCoroutineScope(), lazyStaggeredGridMeasureContext.getGraphicsContext());
                long jM1167getMinSizeToFitDisappearingItemsYbymL2g = lazyStaggeredGridMeasureContext.getState().getItemAnimator$foundation_release().m1167getMinSizeToFitDisappearingItemsYbymL2g();
                if (!IntSize.m7104equalsimpl0(jM1167getMinSizeToFitDisappearingItemsYbymL2g, IntSize.INSTANCE.m7111getZeroYbymL2g())) {
                    iM6890getMinWidthimpl = ConstraintsKt.m6905constrainWidthK40F9xA(lazyStaggeredGridMeasureContext.getConstraints(), IntSize.m7106getWidthimpl(jM1167getMinSizeToFitDisappearingItemsYbymL2g));
                    iM6889getMinHeightimpl = ConstraintsKt.m6904constrainHeightK40F9xA(lazyStaggeredGridMeasureContext.getConstraints(), IntSize.m7105getHeightimpl(jM1167getMinSizeToFitDisappearingItemsYbymL2g));
                }
                return new LazyStaggeredGridMeasureResult(iArr7, iArr8, 0.0f, MeasureScope.layout$default(measureScope, iM6890getMinWidthimpl, iM6889getMinHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt$measure$1$1
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Placeable.PlacementScope placementScope) {
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                        invoke2(placementScope);
                        return Unit.INSTANCE;
                    }
                }, 4, null), false, lazyStaggeredGridMeasureContext.getIsVertical(), false, lazyStaggeredGridMeasureContext.getResolvedSlots(), lazyStaggeredGridMeasureContext.getItemProvider().getSpanProvider(), measureScope, itemCount, CollectionsKt.emptyList(), IntSizeKt.IntSize(Constraints.m6890getMinWidthimpl(lazyStaggeredGridMeasureContext.getConstraints()), Constraints.m6889getMinHeightimpl(lazyStaggeredGridMeasureContext.getConstraints())), -lazyStaggeredGridMeasureContext.getBeforeContentPadding(), lazyStaggeredGridMeasureContext.getMainAxisAvailableSize() + lazyStaggeredGridMeasureContext.getAfterContentPadding(), lazyStaggeredGridMeasureContext.getBeforeContentPadding(), lazyStaggeredGridMeasureContext.getAfterContentPadding(), lazyStaggeredGridMeasureContext.getMainAxisSpacing(), lazyStaggeredGridMeasureContext.getCoroutineScope(), null);
            }
            int[] iArrCopyOf2 = Arrays.copyOf(iArr7, iArr7.length);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf2, "");
            int[] iArrCopyOf3 = Arrays.copyOf(iArr8, iArr8.length);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf3, "");
            ensureIndicesInRange(lazyStaggeredGridMeasureContext, iArrCopyOf2, itemCount);
            offsetBy(iArrCopyOf3, -i12);
            laneCount = lazyStaggeredGridMeasureContext.getLaneCount();
            arrayDequeArr = new ArrayDeque[laneCount];
            for (int i13 = 0; i13 < laneCount; i13++) {
                arrayDequeArr[i13] = new ArrayDeque(16);
            }
            offsetBy(iArrCopyOf3, -lazyStaggeredGridMeasureContext.getBeforeContentPadding());
            boolean z6 = false;
            while (true) {
                if (!measure$lambda$38$hasSpaceBeforeFirst(iArrCopyOf2, iArrCopyOf3, lazyStaggeredGridMeasureContext)) {
                    z2 = z6;
                    iIndexOf = -1;
                    break;
                }
                iIndexOf = indexOfMaxValue(iArrCopyOf2);
                int i14 = iArrCopyOf2[iIndexOf];
                int length2 = iArrCopyOf3.length;
                int i15 = 0;
                while (i15 < length2) {
                    boolean z7 = z6;
                    if (iArrCopyOf2[i15] != iArrCopyOf2[iIndexOf]) {
                        int i16 = iArrCopyOf3[i15];
                        int i17 = iArrCopyOf3[iIndexOf];
                        if (i16 < i17) {
                            iArrCopyOf3[i15] = i17;
                        }
                    }
                    i15++;
                    z6 = z7;
                }
                z2 = z6;
                int iFindPreviousItemIndex = findPreviousItemIndex(lazyStaggeredGridMeasureContext, i14, iIndexOf);
                if (iFindPreviousItemIndex < 0) {
                    break;
                }
                long jM1208getSpanRangelOCCd4c = lazyStaggeredGridMeasureContext.m1208getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), iFindPreviousItemIndex, iIndexOf);
                int i18 = (int) (4294967295L & jM1208getSpanRangelOCCd4c);
                LazyLayoutMeasureScope lazyLayoutMeasureScope = measureScope;
                int i19 = itemCount;
                int i20 = (int) (jM1208getSpanRangelOCCd4c >> 32);
                int i21 = i18 - i20;
                lazyStaggeredGridMeasureContext.getLaneInfo().setLane(iFindPreviousItemIndex, i21 != 1 ? -2 : i20);
                LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItemM1217getAndMeasurejy6DScQ = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m1217getAndMeasurejy6DScQ(iFindPreviousItemIndex, jM1208getSpanRangelOCCd4c);
                int iM1212maxInRangejy6DScQ = m1212maxInRangejy6DScQ(iArrCopyOf3, jM1208getSpanRangelOCCd4c);
                int[] gaps2 = i21 != 1 ? lazyStaggeredGridMeasureContext.getLaneInfo().getGaps(iFindPreviousItemIndex) : null;
                while (i20 < i18) {
                    iArrCopyOf2[i20] = iFindPreviousItemIndex;
                    int mainAxisSizeWithSpacings = lazyStaggeredGridMeasuredItemM1217getAndMeasurejy6DScQ.getMainAxisSizeWithSpacings() + iM1212maxInRangejy6DScQ + (gaps2 == null ? 0 : gaps2[i20]);
                    iArrCopyOf3[i20] = mainAxisSizeWithSpacings;
                    if (lazyStaggeredGridMeasureContext.getMainAxisAvailableSize() + mainAxisSizeWithSpacings <= 0) {
                        z2 = true;
                    }
                    i20++;
                }
                z6 = z2;
                itemCount = i19;
                measureScope = lazyLayoutMeasureScope;
            }
            i2 = -lazyStaggeredGridMeasureContext.getBeforeContentPadding();
            int i22 = iArrCopyOf3[0];
            if (i22 < i2) {
                i12 += i22;
                offsetBy(iArrCopyOf3, i2 - i22);
            }
            offsetBy(iArrCopyOf3, lazyStaggeredGridMeasureContext.getBeforeContentPadding());
            int i23 = -1;
            if (iIndexOf == -1) {
                iIndexOf = ArraysKt.indexOf(iArrCopyOf2, 0);
            }
            if (iIndexOf != -1 && measure$lambda$38$misalignedStart(iArrCopyOf2, lazyStaggeredGridMeasureContext, iArrCopyOf3, iIndexOf) && z5) {
                lazyStaggeredGridMeasureContext.getLaneInfo().reset();
                int length3 = iArrCopyOf2.length;
                iArr7 = new int[length3];
                int i24 = 0;
                while (i24 < length3) {
                    iArr7[i24] = i23;
                    i24++;
                    i23 = -1;
                }
                int length4 = iArrCopyOf3.length;
                iArr8 = new int[length4];
                for (int i25 = 0; i25 < length4; i25++) {
                    iArr8[i25] = iArrCopyOf3[iIndexOf];
                }
            } else {
                iArrCopyOf = Arrays.copyOf(iArrCopyOf2, iArrCopyOf2.length);
                Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "");
                length = iArrCopyOf3.length;
                int[] iArr9 = new int[length];
                for (int i26 = 0; i26 < length; i26++) {
                    iArr9[i26] = -iArrCopyOf3[i26];
                }
                int mainAxisSpacing = i2 + lazyStaggeredGridMeasureContext.getMainAxisSpacing();
                int iCoerceAtLeast = RangesKt.coerceAtLeast(lazyStaggeredGridMeasureContext.getMainAxisAvailableSize() + lazyStaggeredGridMeasureContext.getAfterContentPadding(), 0);
                boolean z8 = z2;
                int iIndexOfMinValue$default = indexOfMinValue$default(iArrCopyOf, 0, 1, null);
                int laneCount2 = 0;
                while (iIndexOfMinValue$default != -1 && laneCount2 < lazyStaggeredGridMeasureContext.getLaneCount()) {
                    int i27 = iArrCopyOf[iIndexOfMinValue$default];
                    int iIndexOfMinValue = indexOfMinValue(iArrCopyOf, i27);
                    laneCount2++;
                    if (i27 >= 0) {
                        boolean z9 = z8;
                        long jM1208getSpanRangelOCCd4c2 = lazyStaggeredGridMeasureContext.m1208getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), i27, iIndexOfMinValue$default);
                        LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItemM1217getAndMeasurejy6DScQ2 = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m1217getAndMeasurejy6DScQ(i27, jM1208getSpanRangelOCCd4c2);
                        int i28 = (int) (jM1208getSpanRangelOCCd4c2 & 4294967295L);
                        int i29 = (int) (jM1208getSpanRangelOCCd4c2 >> 32);
                        int i30 = i28 - i29;
                        lazyStaggeredGridMeasureContext.getLaneInfo().setLane(i27, i30 != 1 ? -2 : i29);
                        int iM1212maxInRangejy6DScQ2 = m1212maxInRangejy6DScQ(iArr9, jM1208getSpanRangelOCCd4c2);
                        for (int i31 = i29; i31 < i28; i31++) {
                            iArr9[i31] = lazyStaggeredGridMeasuredItemM1217getAndMeasurejy6DScQ2.getMainAxisSizeWithSpacings() + iM1212maxInRangejy6DScQ2;
                            iArrCopyOf[i31] = i27;
                            arrayDequeArr[i31].addLast(lazyStaggeredGridMeasuredItemM1217getAndMeasurejy6DScQ2);
                        }
                        if (iM1212maxInRangejy6DScQ2 >= mainAxisSpacing || iArr9[i29] > mainAxisSpacing) {
                            i11 = 1;
                        } else {
                            lazyStaggeredGridMeasuredItemM1217getAndMeasurejy6DScQ2.setVisible(false);
                            i11 = 1;
                            z9 = true;
                        }
                        laneCount2 = i30 != i11 ? lazyStaggeredGridMeasureContext.getLaneCount() : laneCount2;
                        z8 = z9;
                    }
                    iIndexOfMinValue$default = iIndexOfMinValue;
                    i12 = i12;
                    z5 = z5;
                    iArrCopyOf3 = iArrCopyOf3;
                    iArrCopyOf2 = iArrCopyOf2;
                    iCoerceAtLeast = iCoerceAtLeast;
                }
                int i32 = i12;
                boolean z10 = z5;
                int i33 = iCoerceAtLeast;
                int[] iArr10 = iArrCopyOf2;
                int[] iArr11 = iArrCopyOf3;
                z3 = z8;
                while (true) {
                    int i34 = 0;
                    while (true) {
                        if (i34 >= length) {
                            i3 = i33;
                            for (int i35 = 0; i35 < laneCount; i35++) {
                                if (!arrayDequeArr[i35].isEmpty()) {
                                    i4 = itemCount;
                                    i5 = 1;
                                    break;
                                }
                            }
                            break;
                        }
                        int i36 = iArr9[i34];
                        i3 = i33;
                        if (i36 < i3 || i36 <= 0) {
                            break;
                        }
                        i34++;
                        i33 = i3;
                    }
                    i5 = 1;
                    int iIndexOfMinValue$default2 = indexOfMinValue$default(iArr9, 0, 1, null);
                    int iMaxOrThrow = ArraysKt.maxOrThrow(iArrCopyOf) + 1;
                    i4 = itemCount;
                    if (iMaxOrThrow >= i4) {
                        break;
                    }
                    int i37 = i3;
                    int[] iArr12 = iArrCopyOf;
                    int i38 = laneCount;
                    int i39 = length;
                    int[] iArr13 = iArr9;
                    int[] iArr14 = iArr11;
                    int[] iArr15 = iArr10;
                    long jM1208getSpanRangelOCCd4c3 = lazyStaggeredGridMeasureContext.m1208getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), iMaxOrThrow, iIndexOfMinValue$default2);
                    itemCount = i4;
                    int i40 = (int) (jM1208getSpanRangelOCCd4c3 & 4294967295L);
                    int i41 = (int) (jM1208getSpanRangelOCCd4c3 >> 32);
                    int i42 = i40 - i41;
                    lazyStaggeredGridMeasureContext.getLaneInfo().setLane(iMaxOrThrow, i42 != 1 ? -2 : i41);
                    LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItemM1217getAndMeasurejy6DScQ3 = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m1217getAndMeasurejy6DScQ(iMaxOrThrow, jM1208getSpanRangelOCCd4c3);
                    int iM1212maxInRangejy6DScQ3 = m1212maxInRangejy6DScQ(iArr13, jM1208getSpanRangelOCCd4c3);
                    if (i42 != 1) {
                        gaps = lazyStaggeredGridMeasureContext.getLaneInfo().getGaps(iMaxOrThrow);
                        if (gaps == null) {
                            gaps = new int[lazyStaggeredGridMeasureContext.getLaneCount()];
                        }
                    } else {
                        gaps = null;
                    }
                    for (int i43 = i41; i43 < i40; i43++) {
                        if (gaps != null) {
                            gaps[i43] = iM1212maxInRangejy6DScQ3 - iArr13[i43];
                        }
                        iArr12[i43] = iMaxOrThrow;
                        iArr13[i43] = lazyStaggeredGridMeasuredItemM1217getAndMeasurejy6DScQ3.getMainAxisSizeWithSpacings() + iM1212maxInRangejy6DScQ3;
                        arrayDequeArr[i43].addLast(lazyStaggeredGridMeasuredItemM1217getAndMeasurejy6DScQ3);
                    }
                    lazyStaggeredGridMeasureContext.getLaneInfo().setGaps(iMaxOrThrow, gaps);
                    if (iM1212maxInRangejy6DScQ3 < mainAxisSpacing && iArr13[i41] <= mainAxisSpacing) {
                        lazyStaggeredGridMeasuredItemM1217getAndMeasurejy6DScQ3.setVisible(false);
                    }
                    iArr9 = iArr13;
                    length = i39;
                    iArr11 = iArr14;
                    laneCount = i38;
                    i33 = i37;
                    iArr10 = iArr15;
                    iArrCopyOf = iArr12;
                }
                int i44 = 0;
                while (i44 < laneCount) {
                    ArrayDeque arrayDeque = arrayDequeArr[i44];
                    while (arrayDeque.size() > i5 && !((LazyStaggeredGridMeasuredItem) arrayDeque.first()).getIsVisible()) {
                        LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem = (LazyStaggeredGridMeasuredItem) arrayDeque.removeFirst();
                        int[] gaps3 = lazyStaggeredGridMeasuredItem.getSpan() != i5 ? lazyStaggeredGridMeasureContext.getLaneInfo().getGaps(lazyStaggeredGridMeasuredItem.getIndex()) : null;
                        iArr11[i44] = iArr11[i44] - (lazyStaggeredGridMeasuredItem.getMainAxisSizeWithSpacings() + (gaps3 == null ? 0 : gaps3[i44]));
                        i5 = 1;
                    }
                    LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem2 = (LazyStaggeredGridMeasuredItem) arrayDeque.firstOrNull();
                    iArr10[i44] = lazyStaggeredGridMeasuredItem2 != null ? lazyStaggeredGridMeasuredItem2.getIndex() : -1;
                    i44++;
                    i5 = 1;
                }
                for (int i45 : iArrCopyOf) {
                    if (i45 == i4 - 1) {
                        offsetBy(iArr9, -lazyStaggeredGridMeasureContext.getMainAxisSpacing());
                        break;
                    }
                }
                for (int i46 = 0; i46 < length; i46++) {
                    if (iArr9[i46] >= lazyStaggeredGridMeasureContext.getMainAxisAvailableSize()) {
                        i4 = i4;
                        iArrCopyOf = iArrCopyOf;
                        length = length;
                        iArr5 = iArr9;
                        i6 = i32;
                        iArr3 = iArr11;
                        iArr4 = iArr10;
                        break loop0;
                    }
                }
                int mainAxisAvailableSize = lazyStaggeredGridMeasureContext.getMainAxisAvailableSize() - iArr9[indexOfMaxValue(iArr9)];
                iArr3 = iArr11;
                offsetBy(iArr3, -mainAxisAvailableSize);
                offsetBy(iArr9, mainAxisAvailableSize);
                boolean z11 = false;
                while (true) {
                    int length5 = iArr3.length;
                    int i47 = 0;
                    while (true) {
                        if (i47 >= length5) {
                            iArr4 = iArr10;
                        } else if (iArr3[i47] < lazyStaggeredGridMeasureContext.getBeforeContentPadding()) {
                            int iIndexOfMinValue$default3 = indexOfMinValue$default(iArr3, 0, 1, null);
                            int iIndexOfMaxValue = indexOfMaxValue(iArr10);
                            if (iIndexOfMinValue$default3 != iIndexOfMaxValue) {
                                if (iArr3[iIndexOfMinValue$default3] == iArr3[iIndexOfMaxValue]) {
                                    iIndexOfMinValue$default3 = iIndexOfMaxValue;
                                } else {
                                    z11 = true;
                                }
                            }
                            int i48 = iArr10[iIndexOfMinValue$default3];
                            if (i48 == -1) {
                                i48 = i4;
                            }
                            int iFindPreviousItemIndex2 = findPreviousItemIndex(lazyStaggeredGridMeasureContext, i48, iIndexOfMinValue$default3);
                            if (iFindPreviousItemIndex2 < 0) {
                                iArr4 = iArr10;
                                if ((z11 || measure$lambda$38$misalignedStart(iArr4, lazyStaggeredGridMeasureContext, iArr3, iIndexOfMinValue$default3)) && z10) {
                                    lazyStaggeredGridMeasureContext.getLaneInfo().reset();
                                    int length6 = iArr4.length;
                                    iArr7 = new int[length6];
                                    for (int i49 = 0; i49 < length6; i49++) {
                                        iArr7[i49] = -1;
                                    }
                                    int length7 = iArr3.length;
                                    iArr8 = new int[length7];
                                    for (int i50 = 0; i50 < length7; i50++) {
                                        iArr8[i50] = iArr3[iIndexOfMinValue$default3];
                                    }
                                }
                                i12 = i32;
                            } else {
                                int[] iArr16 = iArr10;
                                int[] iArr17 = iArrCopyOf;
                                long jM1208getSpanRangelOCCd4c4 = lazyStaggeredGridMeasureContext.m1208getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), iFindPreviousItemIndex2, iIndexOfMinValue$default3);
                                boolean z12 = z11;
                                int i51 = i4;
                                int i52 = (int) (jM1208getSpanRangelOCCd4c4 & 4294967295L);
                                int i53 = length;
                                int[] iArr18 = iArr9;
                                int i54 = (int) (jM1208getSpanRangelOCCd4c4 >> 32);
                                int i55 = i52 - i54;
                                lazyStaggeredGridMeasureContext.getLaneInfo().setLane(iFindPreviousItemIndex2, i55 != 1 ? -2 : i54);
                                LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItemM1217getAndMeasurejy6DScQ4 = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m1217getAndMeasurejy6DScQ(iFindPreviousItemIndex2, jM1208getSpanRangelOCCd4c4);
                                int iM1212maxInRangejy6DScQ4 = m1212maxInRangejy6DScQ(iArr3, jM1208getSpanRangelOCCd4c4);
                                int[] gaps4 = i55 != 1 ? lazyStaggeredGridMeasureContext.getLaneInfo().getGaps(iFindPreviousItemIndex2) : null;
                                while (i54 < i52) {
                                    if (iArr3[i54] != iM1212maxInRangejy6DScQ4) {
                                        z12 = true;
                                    }
                                    arrayDequeArr[i54].addFirst(lazyStaggeredGridMeasuredItemM1217getAndMeasurejy6DScQ4);
                                    iArr16[i54] = iFindPreviousItemIndex2;
                                    iArr3[i54] = lazyStaggeredGridMeasuredItemM1217getAndMeasurejy6DScQ4.getMainAxisSizeWithSpacings() + iM1212maxInRangejy6DScQ4 + (gaps4 == null ? 0 : gaps4[i54]);
                                    i54++;
                                }
                                iArr10 = iArr16;
                                iArrCopyOf = iArr17;
                                z11 = z12;
                                length = i53;
                                i4 = i51;
                                iArr9 = iArr18;
                            }
                        } else {
                            i47++;
                        }
                        if (z11 && z10) {
                            lazyStaggeredGridMeasureContext.getLaneInfo().reset();
                            iArr8 = iArr3;
                            iArr7 = iArr4;
                            i12 = i32;
                        } else {
                            i6 = i32 + mainAxisAvailableSize;
                            int i56 = iArr3[indexOfMinValue$default(iArr3, 0, 1, null)];
                            if (i56 >= 0) {
                                iArr5 = iArr9;
                                break;
                            }
                            i6 += i56;
                            iArr5 = iArr9;
                            offsetBy(iArr5, i56);
                            offsetBy(iArr3, -i56);
                            break;
                        }
                    }
                }
            }
            z5 = false;
        }
        float scrollToBeConsumed = (MathKt.getSign(Math.round(lazyStaggeredGridMeasureContext.getState().getScrollToBeConsumed())) != MathKt.getSign(i6) || Math.abs(Math.round(lazyStaggeredGridMeasureContext.getState().getScrollToBeConsumed())) < Math.abs(i6)) ? lazyStaggeredGridMeasureContext.getState().getScrollToBeConsumed() : i6;
        int[] iArrCopyOf4 = Arrays.copyOf(iArr3, iArr3.length);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf4, "copyOf(this, size)");
        int length8 = iArrCopyOf4.length;
        for (int i57 = 0; i57 < length8; i57++) {
            iArrCopyOf4[i57] = -iArrCopyOf4[i57];
        }
        if (lazyStaggeredGridMeasureContext.getBeforeContentPadding() > lazyStaggeredGridMeasureContext.getMainAxisSpacing()) {
            int i58 = 0;
            while (i58 < laneCount) {
                ArrayDeque arrayDeque2 = arrayDequeArr[i58];
                int size = arrayDeque2.size();
                int i59 = 0;
                while (true) {
                    if (i59 >= size) {
                        i9 = laneCount;
                        break;
                    }
                    LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem3 = (LazyStaggeredGridMeasuredItem) arrayDeque2.get(i59);
                    i9 = laneCount;
                    int[] gaps5 = lazyStaggeredGridMeasureContext.getLaneInfo().getGaps(lazyStaggeredGridMeasuredItem3.getIndex());
                    int mainAxisSizeWithSpacings2 = lazyStaggeredGridMeasuredItem3.getMainAxisSizeWithSpacings() + (gaps5 == null ? 0 : gaps5[i58]);
                    if (i59 == CollectionsKt.getLastIndex(arrayDeque2) || (i10 = iArr3[i58]) == 0 || i10 < mainAxisSizeWithSpacings2) {
                        break;
                    }
                    iArr3[i58] = i10 - mainAxisSizeWithSpacings2;
                    i59++;
                    iArr4[i58] = ((LazyStaggeredGridMeasuredItem) arrayDeque2.get(i59)).getIndex();
                    laneCount = i9;
                }
                i58++;
                laneCount = i9;
            }
        }
        int beforeContentPadding = lazyStaggeredGridMeasureContext.getBeforeContentPadding() + lazyStaggeredGridMeasureContext.getAfterContentPadding();
        if (lazyStaggeredGridMeasureContext.getIsVertical()) {
            iM6905constrainWidthK40F9xA = Constraints.m6888getMaxWidthimpl(lazyStaggeredGridMeasureContext.getConstraints());
        } else {
            iM6905constrainWidthK40F9xA = ConstraintsKt.m6905constrainWidthK40F9xA(lazyStaggeredGridMeasureContext.getConstraints(), ArraysKt.maxOrThrow(iArr5) + beforeContentPadding);
        }
        if (lazyStaggeredGridMeasureContext.getIsVertical()) {
            iM6887getMaxHeightimpl = ConstraintsKt.m6904constrainHeightK40F9xA(lazyStaggeredGridMeasureContext.getConstraints(), ArraysKt.maxOrThrow(iArr5) + beforeContentPadding);
        } else {
            iM6887getMaxHeightimpl = Constraints.m6887getMaxHeightimpl(lazyStaggeredGridMeasureContext.getConstraints());
        }
        int iMin = (Math.min(lazyStaggeredGridMeasureContext.getIsVertical() ? iM6887getMaxHeightimpl : iM6905constrainWidthK40F9xA, lazyStaggeredGridMeasureContext.getMainAxisAvailableSize()) - lazyStaggeredGridMeasureContext.getBeforeContentPadding()) + lazyStaggeredGridMeasureContext.getAfterContentPadding();
        int mainAxisSizeWithSpacings3 = iArrCopyOf4[0];
        List<Integer> pinnedItems = lazyStaggeredGridMeasureContext.getPinnedItems();
        int size2 = pinnedItems.size() - 1;
        if (size2 >= 0) {
            arrayListEmptyList = null;
            while (true) {
                int i60 = size2 - 1;
                int iIntValue = pinnedItems.get(size2).intValue();
                List<Integer> list2 = pinnedItems;
                int lane = lazyStaggeredGridMeasureContext.getLaneInfo().getLane(iIntValue);
                i7 = i3;
                if (lane != -2 && lane != -1) {
                    if (iArr4[lane] > iIntValue) {
                        long jM1208getSpanRangelOCCd4c5 = lazyStaggeredGridMeasureContext.m1208getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), iIntValue, 0);
                        if (arrayListEmptyList == null) {
                            arrayListEmptyList = new ArrayList();
                        }
                        List list3 = arrayListEmptyList;
                        LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItemM1217getAndMeasurejy6DScQ5 = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m1217getAndMeasurejy6DScQ(iIntValue, jM1208getSpanRangelOCCd4c5);
                        mainAxisSizeWithSpacings3 -= lazyStaggeredGridMeasuredItemM1217getAndMeasurejy6DScQ5.getMainAxisSizeWithSpacings();
                        lazyStaggeredGridMeasuredItemM1217getAndMeasurejy6DScQ5.position(mainAxisSizeWithSpacings3, 0, iMin);
                        list3.add(lazyStaggeredGridMeasuredItemM1217getAndMeasurejy6DScQ5);
                        arrayListEmptyList = list3;
                    }
                } else {
                    int length9 = iArr4.length;
                    int i61 = 0;
                    while (true) {
                        if (i61 < length9) {
                            int i62 = length9;
                            if (iArr4[i61] > iIntValue) {
                                i61++;
                                length9 = i62;
                            }
                        } else {
                            long jM1208getSpanRangelOCCd4c6 = lazyStaggeredGridMeasureContext.m1208getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), iIntValue, 0);
                            if (arrayListEmptyList == null) {
                                arrayListEmptyList = new ArrayList();
                            }
                            List list4 = arrayListEmptyList;
                            LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItemM1217getAndMeasurejy6DScQ6 = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m1217getAndMeasurejy6DScQ(iIntValue, jM1208getSpanRangelOCCd4c6);
                            mainAxisSizeWithSpacings3 -= lazyStaggeredGridMeasuredItemM1217getAndMeasurejy6DScQ6.getMainAxisSizeWithSpacings();
                            lazyStaggeredGridMeasuredItemM1217getAndMeasurejy6DScQ6.position(mainAxisSizeWithSpacings3, 0, iMin);
                            list4.add(lazyStaggeredGridMeasuredItemM1217getAndMeasurejy6DScQ6);
                            arrayListEmptyList = list4;
                        }
                    }
                }
                if (i60 < 0) {
                    break;
                }
                size2 = i60;
                pinnedItems = list2;
                beforeContentPadding = beforeContentPadding;
                i3 = i7;
            }
        } else {
            beforeContentPadding = beforeContentPadding;
            i7 = i3;
            arrayListEmptyList = null;
        }
        if (arrayListEmptyList == null) {
            arrayListEmptyList = CollectionsKt.emptyList();
        }
        List<LazyStaggeredGridMeasuredItem> listCalculateVisibleItems = calculateVisibleItems(lazyStaggeredGridMeasureContext, arrayDequeArr, iArrCopyOf4, iMin);
        int mainAxisSizeWithSpacings4 = iArrCopyOf4[0];
        List<Integer> pinnedItems2 = lazyStaggeredGridMeasureContext.getPinnedItems();
        int size3 = pinnedItems2.size();
        int i63 = 0;
        ArrayList arrayListEmptyList2 = null;
        while (i63 < size3) {
            int iIntValue2 = pinnedItems2.get(i63).intValue();
            int i64 = i4;
            if (iIntValue2 >= i64) {
                list = pinnedItems2;
                i8 = size3;
            } else {
                list = pinnedItems2;
                int lane2 = lazyStaggeredGridMeasureContext.getLaneInfo().getLane(iIntValue2);
                i8 = size3;
                if (lane2 != -2 && lane2 != -1) {
                    if (iArrCopyOf[lane2] < iIntValue2) {
                        iArr6 = iArrCopyOf;
                    }
                } else {
                    iArr6 = iArrCopyOf;
                    int length10 = iArr6.length;
                    int i65 = 0;
                    while (true) {
                        if (i65 < length10) {
                            int i66 = length10;
                            if (iArr6[i65] < iIntValue2) {
                                i65++;
                                length10 = i66;
                            } else {
                                i63++;
                                iArrCopyOf = iArr6;
                                pinnedItems2 = list;
                                size3 = i8;
                                i4 = i64;
                                iArr4 = iArr4;
                            }
                        }
                    }
                }
                long jM1208getSpanRangelOCCd4c7 = lazyStaggeredGridMeasureContext.m1208getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), iIntValue2, 0);
                if (arrayListEmptyList2 == null) {
                    arrayListEmptyList2 = new ArrayList();
                }
                LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItemM1217getAndMeasurejy6DScQ7 = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m1217getAndMeasurejy6DScQ(iIntValue2, jM1208getSpanRangelOCCd4c7);
                lazyStaggeredGridMeasuredItemM1217getAndMeasurejy6DScQ7.position(mainAxisSizeWithSpacings4, 0, iMin);
                mainAxisSizeWithSpacings4 += lazyStaggeredGridMeasuredItemM1217getAndMeasurejy6DScQ7.getMainAxisSizeWithSpacings();
                arrayListEmptyList2.add(lazyStaggeredGridMeasuredItemM1217getAndMeasurejy6DScQ7);
                i63++;
                iArrCopyOf = iArr6;
                pinnedItems2 = list;
                size3 = i8;
                i4 = i64;
                iArr4 = iArr4;
            }
            iArr6 = iArrCopyOf;
            i63++;
            iArrCopyOf = iArr6;
            pinnedItems2 = list;
            size3 = i8;
            i4 = i64;
            iArr4 = iArr4;
        }
        int[] iArr19 = iArr4;
        int[] iArr20 = iArrCopyOf;
        int i67 = i4;
        if (arrayListEmptyList2 == null) {
            arrayListEmptyList2 = CollectionsKt.emptyList();
        }
        final ArrayList arrayList = new ArrayList();
        arrayList.addAll(arrayListEmptyList);
        arrayList.addAll(listCalculateVisibleItems);
        arrayList.addAll(arrayListEmptyList2);
        lazyStaggeredGridMeasureContext.getState().getItemAnimator$foundation_release().onMeasured((int) scrollToBeConsumed, iM6905constrainWidthK40F9xA, iM6887getMaxHeightimpl, arrayList, lazyStaggeredGridMeasureContext.getMeasuredItemProvider().getKeyIndexMap(), lazyStaggeredGridMeasureContext.getMeasuredItemProvider(), lazyStaggeredGridMeasureContext.getIsVertical(), false, lazyStaggeredGridMeasureContext.getLaneCount(), false, ArraysKt.minOrThrow(iArr3), ArraysKt.maxOrThrow(iArr5) + beforeContentPadding, lazyStaggeredGridMeasureContext.getCoroutineScope(), lazyStaggeredGridMeasureContext.getGraphicsContext());
        long jM1167getMinSizeToFitDisappearingItemsYbymL2g2 = lazyStaggeredGridMeasureContext.getState().getItemAnimator$foundation_release().m1167getMinSizeToFitDisappearingItemsYbymL2g();
        if (!IntSize.m7104equalsimpl0(jM1167getMinSizeToFitDisappearingItemsYbymL2g2, IntSize.INSTANCE.m7111getZeroYbymL2g())) {
            int i68 = lazyStaggeredGridMeasureContext.getIsVertical() ? iM6887getMaxHeightimpl : iM6905constrainWidthK40F9xA;
            iM6905constrainWidthK40F9xA = ConstraintsKt.m6905constrainWidthK40F9xA(lazyStaggeredGridMeasureContext.getConstraints(), Math.max(iM6905constrainWidthK40F9xA, IntSize.m7106getWidthimpl(jM1167getMinSizeToFitDisappearingItemsYbymL2g2)));
            iM6887getMaxHeightimpl = ConstraintsKt.m6904constrainHeightK40F9xA(lazyStaggeredGridMeasureContext.getConstraints(), Math.max(iM6887getMaxHeightimpl, IntSize.m7105getHeightimpl(jM1167getMinSizeToFitDisappearingItemsYbymL2g2)));
            int i69 = lazyStaggeredGridMeasureContext.getIsVertical() ? iM6887getMaxHeightimpl : iM6905constrainWidthK40F9xA;
            if (i69 != i68) {
                int size4 = arrayList.size();
                for (int i70 = 0; i70 < size4; i70++) {
                    ((LazyStaggeredGridMeasuredItem) arrayList.get(i70)).updateMainAxisLayoutSize(i69);
                }
            }
        }
        int i71 = length;
        int i72 = 0;
        while (true) {
            if (i72 >= i71) {
                for (int i73 : iArr20) {
                    if (i73 >= i67 - 1) {
                        z4 = false;
                        return new LazyStaggeredGridMeasureResult(iArr19, iArr3, scrollToBeConsumed, MeasureScope.layout$default(measureScope, iM6905constrainWidthK40F9xA, iM6887getMaxHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt$measure$1$30
                            @Override // kotlin.jvm.functions.Function1
                            public final /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                invoke2(placementScope);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(Placeable.PlacementScope placementScope) {
                                List<LazyStaggeredGridMeasuredItem> list5 = arrayList;
                                LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext2 = lazyStaggeredGridMeasureContext;
                                int size5 = list5.size();
                                for (int i74 = 0; i74 < size5; i74++) {
                                    list5.get(i74).place(placementScope, lazyStaggeredGridMeasureContext2);
                                }
                                ObservableScopeInvalidator.m1176attachToScopeimpl(lazyStaggeredGridMeasureContext.getState().m1221getPlacementScopeInvalidatorzYiylxw$foundation_release());
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }
                        }, 4, null), z4, lazyStaggeredGridMeasureContext.getIsVertical(), z3, lazyStaggeredGridMeasureContext.getResolvedSlots(), lazyStaggeredGridMeasureContext.getItemProvider().getSpanProvider(), measureScope, i67, listCalculateVisibleItems, IntSizeKt.IntSize(iM6905constrainWidthK40F9xA, iM6887getMaxHeightimpl), i2, i7, lazyStaggeredGridMeasureContext.getBeforeContentPadding(), lazyStaggeredGridMeasureContext.getAfterContentPadding(), lazyStaggeredGridMeasureContext.getMainAxisSpacing(), lazyStaggeredGridMeasureContext.getCoroutineScope(), null);
                    }
                }
                break;
            }
            if (iArr5[i72] > lazyStaggeredGridMeasureContext.getMainAxisAvailableSize()) {
                break;
            }
            i72++;
        }
        z4 = true;
        return new LazyStaggeredGridMeasureResult(iArr19, iArr3, scrollToBeConsumed, MeasureScope.layout$default(measureScope, iM6905constrainWidthK40F9xA, iM6887getMaxHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt$measure$1$30
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope placementScope) {
                List<LazyStaggeredGridMeasuredItem> list5 = arrayList;
                LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext2 = lazyStaggeredGridMeasureContext;
                int size5 = list5.size();
                for (int i74 = 0; i74 < size5; i74++) {
                    list5.get(i74).place(placementScope, lazyStaggeredGridMeasureContext2);
                }
                ObservableScopeInvalidator.m1176attachToScopeimpl(lazyStaggeredGridMeasureContext.getState().m1221getPlacementScopeInvalidatorzYiylxw$foundation_release());
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        }, 4, null), z4, lazyStaggeredGridMeasureContext.getIsVertical(), z3, lazyStaggeredGridMeasureContext.getResolvedSlots(), lazyStaggeredGridMeasureContext.getItemProvider().getSpanProvider(), measureScope, i67, listCalculateVisibleItems, IntSizeKt.IntSize(iM6905constrainWidthK40F9xA, iM6887getMaxHeightimpl), i2, i7, lazyStaggeredGridMeasureContext.getBeforeContentPadding(), lazyStaggeredGridMeasureContext.getAfterContentPadding(), lazyStaggeredGridMeasureContext.getMainAxisSpacing(), lazyStaggeredGridMeasureContext.getCoroutineScope(), null);
    }

    private static final boolean measure$lambda$38$hasSpaceBeforeFirst(int[] iArr, int[] iArr2, LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext) {
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            if (iArr2[i] < Math.max(-lazyStaggeredGridMeasureContext.getMainAxisSpacing(), 0) && i2 > 0) {
                return true;
            }
        }
        return false;
    }

    private static final boolean measure$lambda$38$misalignedStart(int[] iArr, LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int[] iArr2, int i) {
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (findPreviousItemIndex(lazyStaggeredGridMeasureContext, iArr[i2], i2) == -1 && iArr2[i2] != iArr2[i]) {
                return true;
            }
        }
        int length2 = iArr.length;
        for (int i3 = 0; i3 < length2; i3++) {
            if (findPreviousItemIndex(lazyStaggeredGridMeasureContext, iArr[i3], i3) != -1 && iArr2[i3] >= iArr2[i]) {
                return true;
            }
        }
        int lane = lazyStaggeredGridMeasureContext.getLaneInfo().getLane(0);
        return (lane == 0 || lane == -1 || lane == -2) ? false : true;
    }

    private static final List<LazyStaggeredGridMeasuredItem> calculateVisibleItems(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, ArrayDeque<LazyStaggeredGridMeasuredItem>[] arrayDequeArr, int[] iArr, int i) {
        int size = 0;
        for (ArrayDeque<LazyStaggeredGridMeasuredItem> arrayDeque : arrayDequeArr) {
            size += arrayDeque.size();
        }
        ArrayList arrayList = new ArrayList(size);
        while (true) {
            for (ArrayDeque<LazyStaggeredGridMeasuredItem> arrayDeque2 : arrayDequeArr) {
                if (!arrayDeque2.isEmpty()) {
                    int length = arrayDequeArr.length;
                    int i2 = -1;
                    int i3 = Integer.MAX_VALUE;
                    for (int i4 = 0; i4 < length; i4++) {
                        LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItemFirstOrNull = arrayDequeArr[i4].firstOrNull();
                        int index = lazyStaggeredGridMeasuredItemFirstOrNull != null ? lazyStaggeredGridMeasuredItemFirstOrNull.getIndex() : Integer.MAX_VALUE;
                        if (i3 > index) {
                            i2 = i4;
                            i3 = index;
                        }
                    }
                    LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItemRemoveFirst = arrayDequeArr[i2].removeFirst();
                    if (lazyStaggeredGridMeasuredItemRemoveFirst.getLane() == i2) {
                        long jM1223constructorimpl = SpanRange.m1223constructorimpl(lazyStaggeredGridMeasuredItemRemoveFirst.getLane(), lazyStaggeredGridMeasuredItemRemoveFirst.getSpan());
                        int iM1212maxInRangejy6DScQ = m1212maxInRangejy6DScQ(iArr, jM1223constructorimpl);
                        lazyStaggeredGridMeasuredItemRemoveFirst.position(iM1212maxInRangejy6DScQ, lazyStaggeredGridMeasureContext.getResolvedSlots().getPositions()[i2], i);
                        arrayList.add(lazyStaggeredGridMeasuredItemRemoveFirst);
                        int i5 = (int) (jM1223constructorimpl & 4294967295L);
                        for (int i6 = (int) (jM1223constructorimpl >> 32); i6 < i5; i6++) {
                            iArr[i6] = lazyStaggeredGridMeasuredItemRemoveFirst.getMainAxisSizeWithSpacings() + iM1212maxInRangejy6DScQ;
                        }
                    }
                }
            }
            return arrayList;
        }
    }

    private static final List<LazyStaggeredGridMeasuredItem> calculateExtraItems(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, Function1<? super LazyStaggeredGridMeasuredItem, Unit> function1, Function1<? super Integer, Boolean> function2, boolean z) {
        List<Integer> pinnedItems = lazyStaggeredGridMeasureContext.getPinnedItems();
        ArrayList arrayList = null;
        if (z) {
            int size = pinnedItems.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i = size - 1;
                    int iIntValue = pinnedItems.get(size).intValue();
                    if (function2.invoke(Integer.valueOf(iIntValue)).booleanValue()) {
                        long jM1208getSpanRangelOCCd4c = lazyStaggeredGridMeasureContext.m1208getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), iIntValue, 0);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItemM1217getAndMeasurejy6DScQ = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m1217getAndMeasurejy6DScQ(iIntValue, jM1208getSpanRangelOCCd4c);
                        function1.invoke(lazyStaggeredGridMeasuredItemM1217getAndMeasurejy6DScQ);
                        arrayList.add(lazyStaggeredGridMeasuredItemM1217getAndMeasurejy6DScQ);
                    }
                    if (i < 0) {
                        break;
                    }
                    size = i;
                }
            }
        } else {
            int size2 = pinnedItems.size();
            for (int i2 = 0; i2 < size2; i2++) {
                int iIntValue2 = pinnedItems.get(i2).intValue();
                if (function2.invoke(Integer.valueOf(iIntValue2)).booleanValue()) {
                    long jM1208getSpanRangelOCCd4c2 = lazyStaggeredGridMeasureContext.m1208getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), iIntValue2, 0);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItemM1217getAndMeasurejy6DScQ2 = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m1217getAndMeasurejy6DScQ(iIntValue2, jM1208getSpanRangelOCCd4c2);
                    function1.invoke(lazyStaggeredGridMeasuredItemM1217getAndMeasurejy6DScQ2);
                    arrayList.add(lazyStaggeredGridMeasuredItemM1217getAndMeasurejy6DScQ2);
                }
            }
        }
        return arrayList == null ? CollectionsKt.emptyList() : arrayList;
    }

    /* JADX INFO: renamed from: forEach-nIS5qE8, reason: not valid java name */
    private static final void m1211forEachnIS5qE8(long j, Function1<? super Integer, Unit> function1) {
        int i = (int) (j & 4294967295L);
        for (int i2 = (int) (j >> 32); i2 < i; i2++) {
            function1.invoke(Integer.valueOf(i2));
        }
    }

    private static final void offsetBy(int[] iArr, int i) {
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = iArr[i2] + i;
        }
    }

    /* JADX INFO: renamed from: maxInRange-jy6DScQ, reason: not valid java name */
    private static final int m1212maxInRangejy6DScQ(int[] iArr, long j) {
        int i = (int) (j & 4294967295L);
        int iMax = Integer.MIN_VALUE;
        for (int i2 = (int) (j >> 32); i2 < i; i2++) {
            iMax = Math.max(iMax, iArr[i2]);
        }
        return iMax;
    }

    public static /* synthetic */ int indexOfMinValue$default(int[] iArr, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = Integer.MIN_VALUE;
        }
        return indexOfMinValue(iArr, i);
    }

    public static final int indexOfMinValue(int[] iArr, int i) {
        int length = iArr.length;
        int i2 = -1;
        int i3 = Integer.MAX_VALUE;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = iArr[i4];
            if (i + 1 <= i5 && i5 < i3) {
                i2 = i4;
                i3 = i5;
            }
        }
        return i2;
    }

    private static final <T> int indexOfMinBy(T[] tArr, Function1<? super T, Integer> function1) {
        int length = tArr.length;
        int i = -1;
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < length; i3++) {
            int iIntValue = function1.invoke(tArr[i3]).intValue();
            if (i2 > iIntValue) {
                i = i3;
                i2 = iIntValue;
            }
        }
        return i;
    }

    private static final int indexOfMaxValue(int[] iArr) {
        int length = iArr.length;
        int i = -1;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = iArr[i3];
            if (i2 < i4) {
                i = i3;
                i2 = i4;
            }
        }
        return i;
    }

    private static final int[] transform(int[] iArr, Function1<? super Integer, Integer> function1) {
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            iArr[i] = function1.invoke(Integer.valueOf(iArr[i])).intValue();
        }
        return iArr;
    }

    private static final void ensureIndicesInRange(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int[] iArr, int i) {
        int length = iArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i2 = length - 1;
            while (true) {
                if (iArr[length] < i && lazyStaggeredGridMeasureContext.getLaneInfo().assignedToLane(iArr[length], length)) {
                    break;
                } else {
                    iArr[length] = findPreviousItemIndex(lazyStaggeredGridMeasureContext, iArr[length], length);
                }
            }
            if (iArr[length] >= 0 && !lazyStaggeredGridMeasureContext.isFullSpan(lazyStaggeredGridMeasureContext.getItemProvider(), iArr[length])) {
                lazyStaggeredGridMeasureContext.getLaneInfo().setLane(iArr[length], length);
            }
            if (i2 < 0) {
                return;
            } else {
                length = i2;
            }
        }
    }

    private static final int findPreviousItemIndex(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int i, int i2) {
        return lazyStaggeredGridMeasureContext.getLaneInfo().findPreviousItemIndex(i, i2);
    }

    private static final <T> void fastForEach(List<? extends T> list, boolean z, Function1<? super T, Unit> function1) {
        if (z) {
            int size = list.size() - 1;
            if (size < 0) {
                return;
            }
            while (true) {
                int i = size - 1;
                function1.invoke(list.get(size));
                if (i < 0) {
                    return;
                } else {
                    size = i;
                }
            }
        } else {
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                function1.invoke(list.get(i2));
            }
        }
    }

    static /* synthetic */ void fastForEach$default(List list, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 1) == 0 && z) {
            int size = list.size() - 1;
            if (size < 0) {
                return;
            }
            while (true) {
                int i2 = size - 1;
                function1.invoke(list.get(size));
                if (i2 < 0) {
                    return;
                } else {
                    size = i2;
                }
            }
        } else {
            int size2 = list.size();
            for (int i3 = 0; i3 < size2; i3++) {
                function1.invoke(list.get(i3));
            }
        }
    }
}
