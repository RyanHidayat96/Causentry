package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0093\u0001\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u00142\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001ac\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00142\u0006\u0010\u0003\u001a\u00020\u00172\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00002\u0006\u0010\b\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a;\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00172\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0000H\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a£\u0002\u00109\u001a\u0002062\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00172\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\u001e2\u0006\u0010\u0010\u001a\u00020\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\r2\b\u0010\u001f\u001a\u0004\u0018\u00010\u000f2\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u00122\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00010\"2\u0006\u0010$\u001a\u00020\u00052\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00050\u00002\u0006\u0010&\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020\u000b2\b\u0010(\u001a\u0004\u0018\u00010\u00192\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-2/\u00105\u001a+\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020200¢\u0006\u0002\b3\u0012\u0004\u0012\u0002040/H\u0001ø\u0001\u0000¢\u0006\u0004\b7\u00108\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001"}, d2 = {"", "Landroidx/compose/foundation/lazy/LazyListMeasuredItem;", "p0", "p1", "p2", "", "p3", "p4", "p5", "p6", "p7", "", "p8", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "p9", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "p10", "p11", "Landroidx/compose/ui/unit/Density;", "p12", "", "calculateItemsOffsets", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;IIIIIZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;)Ljava/util/List;", "Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;", "", "Landroidx/compose/foundation/lazy/LazyListLayoutInfo;", "createItemsAfterList", "(Ljava/util/List;Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;IILjava/util/List;FZLandroidx/compose/foundation/lazy/LazyListLayoutInfo;)Ljava/util/List;", "createItemsBeforeList", "(ILandroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;ILjava/util/List;)Ljava/util/List;", "Landroidx/compose/ui/unit/Constraints;", "p13", "p14", "p15", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "p16", "p17", "p18", "p19", "p20", "p21", "Lkotlinx/coroutines/CoroutineScope;", "p22", "Landroidx/compose/foundation/lazy/layout/ObservableScopeInvalidator;", "p23", "Landroidx/compose/ui/graphics/GraphicsContext;", "p24", "Lkotlin/Function3;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "Lkotlin/ExtensionFunctionType;", "Landroidx/compose/ui/layout/MeasureResult;", "p25", "Landroidx/compose/foundation/lazy/LazyListMeasureResult;", "measureLazyList-x0Ok8Vo", "(ILandroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;IIIIIIFJZLjava/util/List;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;ILjava/util/List;ZZLandroidx/compose/foundation/lazy/LazyListLayoutInfo;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/graphics/GraphicsContext;Lkotlin/jvm/functions/Function3;)Landroidx/compose/foundation/lazy/LazyListMeasureResult;", "measureLazyList"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class LazyListMeasureKt {
    private static final int calculateItemsOffsets$reverseAware(int i, boolean z, int i2) {
        return !z ? i : (i2 - i) - 1;
    }

    /* JADX INFO: renamed from: measureLazyList-x0Ok8Vo, reason: not valid java name */
    public static final LazyListMeasureResult m1109measureLazyListx0Ok8Vo(int i, LazyListMeasuredItemProvider lazyListMeasuredItemProvider, int i2, int i3, int i4, int i5, int i6, int i7, float f, long j, boolean z, List<Integer> list, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, boolean z2, Density density, LazyLayoutItemAnimator<LazyListMeasuredItem> lazyLayoutItemAnimator, int i8, List<Integer> list2, boolean z3, final boolean z4, LazyListLayoutInfo lazyListLayoutInfo, CoroutineScope coroutineScope, final MutableState<Unit> mutableState, GraphicsContext graphicsContext, Function3<? super Integer, ? super Integer, ? super Function1<? super Placeable.PlacementScope, Unit>, ? extends MeasureResult> function3) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        LazyListMeasuredItem lazyListMeasuredItem;
        int i17;
        ArrayDeque arrayDeque;
        float f2;
        LazyListMeasuredItem lazyListMeasuredItem2;
        List<LazyListMeasuredItem> list3;
        int i18;
        if (i3 < 0) {
            throw new IllegalArgumentException("invalid beforeContentPadding".toString());
        }
        if (i4 < 0) {
            throw new IllegalArgumentException("invalid afterContentPadding".toString());
        }
        if (i <= 0) {
            int iM6890getMinWidthimpl = Constraints.m6890getMinWidthimpl(j);
            int iM6889getMinHeightimpl = Constraints.m6889getMinHeightimpl(j);
            lazyLayoutItemAnimator.onMeasured(0, iM6890getMinWidthimpl, iM6889getMinHeightimpl, new ArrayList(), lazyListMeasuredItemProvider.getKeyIndexMap(), lazyListMeasuredItemProvider, z, z4, 1, z3, 0, 0, coroutineScope, graphicsContext);
            if (!z4) {
                long jM1167getMinSizeToFitDisappearingItemsYbymL2g = lazyLayoutItemAnimator.m1167getMinSizeToFitDisappearingItemsYbymL2g();
                if (!IntSize.m7104equalsimpl0(jM1167getMinSizeToFitDisappearingItemsYbymL2g, IntSize.INSTANCE.m7111getZeroYbymL2g())) {
                    iM6890getMinWidthimpl = ConstraintsKt.m6905constrainWidthK40F9xA(j, IntSize.m7106getWidthimpl(jM1167getMinSizeToFitDisappearingItemsYbymL2g));
                    iM6889getMinHeightimpl = ConstraintsKt.m6904constrainHeightK40F9xA(j, IntSize.m7105getHeightimpl(jM1167getMinSizeToFitDisappearingItemsYbymL2g));
                }
            }
            return new LazyListMeasureResult(null, 0, false, 0.0f, function3.invoke(Integer.valueOf(iM6890getMinWidthimpl), Integer.valueOf(iM6889getMinHeightimpl), new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$3
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Placeable.PlacementScope placementScope) {
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                    invoke2(placementScope);
                    return Unit.INSTANCE;
                }
            }), 0.0f, false, coroutineScope, density, lazyListMeasuredItemProvider.getChildConstraints(), CollectionsKt.emptyList(), -i3, i2 + i4, 0, z2, z ? Orientation.Vertical : Orientation.Horizontal, i4, i5, null);
        }
        int i19 = 0;
        int i20 = i6;
        if (i20 >= i) {
            i20 = i - 1;
            i9 = 0;
        } else {
            i9 = i7;
        }
        int iRound = Math.round(f);
        int i21 = i9 - iRound;
        if (i20 != 0 || i21 >= 0) {
            i10 = iRound;
        } else {
            i10 = iRound + i21;
            i21 = 0;
        }
        ArrayDeque arrayDeque2 = new ArrayDeque();
        int i22 = -i3;
        int i23 = (i5 < 0 ? i5 : 0) + i22;
        int mainAxisSizeWithSpacings = i21 + i23;
        int iMax = 0;
        while (mainAxisSizeWithSpacings < 0 && i20 > 0) {
            int i24 = i20 - 1;
            ArrayDeque arrayDeque3 = arrayDeque2;
            LazyListMeasuredItem lazyListMeasuredItemM1115getAndMeasure0kLqBqw$default = LazyListMeasuredItemProvider.m1115getAndMeasure0kLqBqw$default(lazyListMeasuredItemProvider, i24, 0L, 2, null);
            arrayDeque3.add(0, lazyListMeasuredItemM1115getAndMeasure0kLqBqw$default);
            iMax = Math.max(iMax, lazyListMeasuredItemM1115getAndMeasure0kLqBqw$default.getCrossAxisSize());
            mainAxisSizeWithSpacings += lazyListMeasuredItemM1115getAndMeasure0kLqBqw$default.getMainAxisSizeWithSpacings();
            arrayDeque2 = arrayDeque3;
            i20 = i24;
            i23 = i23;
            i22 = i22;
        }
        int i25 = i23;
        int i26 = i22;
        ArrayDeque arrayDeque4 = arrayDeque2;
        int i27 = iMax;
        if (mainAxisSizeWithSpacings < i25) {
            i10 += mainAxisSizeWithSpacings;
            mainAxisSizeWithSpacings = i25;
        }
        int i28 = mainAxisSizeWithSpacings - i25;
        int i29 = i2 + i4;
        int iCoerceAtLeast = RangesKt.coerceAtLeast(i29, 0);
        int mainAxisSizeWithSpacings2 = -i28;
        int i30 = i20;
        int i31 = i30;
        boolean z5 = false;
        while (i19 < arrayDeque4.size()) {
            if (mainAxisSizeWithSpacings2 >= iCoerceAtLeast) {
                arrayDeque4.remove(i19);
                z5 = true;
            } else {
                i31++;
                mainAxisSizeWithSpacings2 += ((LazyListMeasuredItem) arrayDeque4.get(i19)).getMainAxisSizeWithSpacings();
                i19++;
            }
        }
        int i32 = i30;
        boolean z6 = z5;
        int mainAxisSizeWithSpacings3 = i28;
        int i33 = i27;
        int mainAxisSizeWithSpacings4 = mainAxisSizeWithSpacings2;
        int i34 = i31;
        while (i34 < i && (mainAxisSizeWithSpacings4 < iCoerceAtLeast || mainAxisSizeWithSpacings4 <= 0 || arrayDeque4.isEmpty())) {
            int i35 = i34;
            int i36 = i33;
            int i37 = iCoerceAtLeast;
            int i38 = i29;
            LazyListMeasuredItem lazyListMeasuredItemM1115getAndMeasure0kLqBqw$default2 = LazyListMeasuredItemProvider.m1115getAndMeasure0kLqBqw$default(lazyListMeasuredItemProvider, i34, 0L, 2, null);
            mainAxisSizeWithSpacings4 += lazyListMeasuredItemM1115getAndMeasure0kLqBqw$default2.getMainAxisSizeWithSpacings();
            if (mainAxisSizeWithSpacings4 <= i25) {
                i18 = i35;
                if (i18 != i - 1) {
                    mainAxisSizeWithSpacings3 -= lazyListMeasuredItemM1115getAndMeasure0kLqBqw$default2.getMainAxisSizeWithSpacings();
                    i32 = i18 + 1;
                    z6 = true;
                    i33 = i36;
                }
                i34 = i18 + 1;
                iCoerceAtLeast = i37;
                i29 = i38;
            } else {
                i18 = i35;
            }
            int iMax2 = Math.max(i36, lazyListMeasuredItemM1115getAndMeasure0kLqBqw$default2.getCrossAxisSize());
            arrayDeque4.add(lazyListMeasuredItemM1115getAndMeasure0kLqBqw$default2);
            i33 = iMax2;
            i34 = i18 + 1;
            iCoerceAtLeast = i37;
            i29 = i38;
        }
        int i39 = i29;
        int i40 = i34;
        if (mainAxisSizeWithSpacings4 < i2) {
            int i41 = i2 - mainAxisSizeWithSpacings4;
            int i42 = mainAxisSizeWithSpacings4 + i41;
            int i43 = i32;
            int mainAxisSizeWithSpacings5 = mainAxisSizeWithSpacings3 - i41;
            int iMax3 = i33;
            while (mainAxisSizeWithSpacings5 < i3 && i43 > 0) {
                int i44 = i43 - 1;
                LazyListMeasuredItem lazyListMeasuredItemM1115getAndMeasure0kLqBqw$default3 = LazyListMeasuredItemProvider.m1115getAndMeasure0kLqBqw$default(lazyListMeasuredItemProvider, i44, 0L, 2, null);
                arrayDeque4.add(0, lazyListMeasuredItemM1115getAndMeasure0kLqBqw$default3);
                iMax3 = Math.max(iMax3, lazyListMeasuredItemM1115getAndMeasure0kLqBqw$default3.getCrossAxisSize());
                mainAxisSizeWithSpacings5 += lazyListMeasuredItemM1115getAndMeasure0kLqBqw$default3.getMainAxisSizeWithSpacings();
                i40 = i40;
                i43 = i44;
            }
            int i45 = mainAxisSizeWithSpacings5;
            i11 = i40;
            int i46 = i41 + i10;
            if (i45 < 0) {
                i14 = 0;
                i33 = iMax3;
                i32 = i43;
                i13 = i46 + i45;
                i12 = i42 + i45;
            } else {
                i33 = iMax3;
                i14 = i45;
                i32 = i43;
                i13 = i46;
                i12 = i42;
            }
        } else {
            i11 = i40;
            i12 = mainAxisSizeWithSpacings4;
            i13 = i10;
            i14 = mainAxisSizeWithSpacings3;
        }
        float f3 = (MathKt.getSign(Math.round(f)) != MathKt.getSign(i13) || Math.abs(Math.round(f)) < Math.abs(i13)) ? f : i13;
        float f4 = f - f3;
        float f5 = (!z4 || i13 <= i10 || f4 > 0.0f) ? 0.0f : (i13 - i10) + f4;
        if (i14 < 0) {
            throw new IllegalArgumentException("negative currentFirstItemScrollOffset".toString());
        }
        int i47 = -i14;
        LazyListMeasuredItem lazyListMeasuredItem3 = (LazyListMeasuredItem) arrayDeque4.first();
        if (i3 > 0 || i5 < 0) {
            int size = arrayDeque4.size();
            LazyListMeasuredItem lazyListMeasuredItem4 = lazyListMeasuredItem3;
            int i48 = 0;
            while (true) {
                if (i48 < size) {
                    i15 = i47;
                    int mainAxisSizeWithSpacings6 = ((LazyListMeasuredItem) arrayDeque4.get(i48)).getMainAxisSizeWithSpacings();
                    if (i14 != 0 && mainAxisSizeWithSpacings6 <= i14) {
                        i16 = i33;
                        if (i48 == CollectionsKt.getLastIndex(arrayDeque4)) {
                            break;
                        }
                        i14 -= mainAxisSizeWithSpacings6;
                        i48++;
                        i33 = i16;
                        lazyListMeasuredItem4 = (LazyListMeasuredItem) arrayDeque4.get(i48);
                        i47 = i15;
                    }
                } else {
                    i15 = i47;
                }
                i16 = i33;
                break;
            }
            lazyListMeasuredItem = lazyListMeasuredItem4;
            i17 = i14;
        } else {
            lazyListMeasuredItem = lazyListMeasuredItem3;
            i17 = i14;
            i15 = i47;
            i16 = i33;
        }
        List<LazyListMeasuredItem> listCreateItemsBeforeList = createItemsBeforeList(i32, lazyListMeasuredItemProvider, i8, list2);
        int iMax4 = i16;
        int i49 = 0;
        for (int size2 = listCreateItemsBeforeList.size(); i49 < size2; size2 = size2) {
            iMax4 = Math.max(iMax4, listCreateItemsBeforeList.get(i49).getCrossAxisSize());
            i49++;
        }
        ArrayDeque arrayDeque5 = arrayDeque4;
        int i50 = iMax4;
        int i51 = i15;
        float f6 = f3;
        float f7 = f5;
        LazyListMeasuredItem lazyListMeasuredItem5 = lazyListMeasuredItem;
        List<LazyListMeasuredItem> listCreateItemsAfterList = createItemsAfterList(arrayDeque5, lazyListMeasuredItemProvider, i, i8, list2, f6, z4, lazyListLayoutInfo);
        int size3 = listCreateItemsAfterList.size();
        int iMax5 = i50;
        for (int i52 = 0; i52 < size3; i52++) {
            iMax5 = Math.max(iMax5, listCreateItemsAfterList.get(i52).getCrossAxisSize());
        }
        boolean z7 = Intrinsics.areEqual(lazyListMeasuredItem5, arrayDeque4.first()) && listCreateItemsBeforeList.isEmpty() && listCreateItemsAfterList.isEmpty();
        int iM6905constrainWidthK40F9xA = ConstraintsKt.m6905constrainWidthK40F9xA(j, z ? iMax5 : i12);
        if (z) {
            iMax5 = i12;
        }
        int iM6904constrainHeightK40F9xA = ConstraintsKt.m6904constrainHeightK40F9xA(j, iMax5);
        final List<LazyListMeasuredItem> listCalculateItemsOffsets = calculateItemsOffsets(arrayDeque5, listCreateItemsBeforeList, listCreateItemsAfterList, iM6905constrainWidthK40F9xA, iM6904constrainHeightK40F9xA, i12, i2, i51, z, vertical, horizontal, z2, density);
        lazyLayoutItemAnimator.onMeasured((int) f6, iM6905constrainWidthK40F9xA, iM6904constrainHeightK40F9xA, listCalculateItemsOffsets, lazyListMeasuredItemProvider.getKeyIndexMap(), lazyListMeasuredItemProvider, z, z4, 1, z3, i17, i12, coroutineScope, graphicsContext);
        if (z4) {
            arrayDeque = arrayDeque4;
            f2 = f6;
            lazyListMeasuredItem2 = lazyListMeasuredItem5;
        } else {
            lazyListMeasuredItem2 = lazyListMeasuredItem5;
            long jM1167getMinSizeToFitDisappearingItemsYbymL2g2 = lazyLayoutItemAnimator.m1167getMinSizeToFitDisappearingItemsYbymL2g();
            arrayDeque = arrayDeque4;
            if (!IntSize.m7104equalsimpl0(jM1167getMinSizeToFitDisappearingItemsYbymL2g2, IntSize.INSTANCE.m7111getZeroYbymL2g())) {
                int i53 = z ? iM6904constrainHeightK40F9xA : iM6905constrainWidthK40F9xA;
                iM6905constrainWidthK40F9xA = ConstraintsKt.m6905constrainWidthK40F9xA(j, Math.max(iM6905constrainWidthK40F9xA, IntSize.m7106getWidthimpl(jM1167getMinSizeToFitDisappearingItemsYbymL2g2)));
                iM6904constrainHeightK40F9xA = ConstraintsKt.m6904constrainHeightK40F9xA(j, Math.max(iM6904constrainHeightK40F9xA, IntSize.m7105getHeightimpl(jM1167getMinSizeToFitDisappearingItemsYbymL2g2)));
                int i54 = z ? iM6904constrainHeightK40F9xA : iM6905constrainWidthK40F9xA;
                if (i54 != i53) {
                    int size4 = listCalculateItemsOffsets.size();
                    for (int i55 = 0; i55 < size4; i55++) {
                        listCalculateItemsOffsets.get(i55).updateMainAxisLayoutSize(i54);
                    }
                }
            }
        }
        f2 = f6;
        int i56 = iM6905constrainWidthK40F9xA;
        int i57 = iM6904constrainHeightK40F9xA;
        final LazyListMeasuredItem lazyListMeasuredItemFindOrComposeLazyListHeader = !list.isEmpty() ? LazyListHeadersKt.findOrComposeLazyListHeader(listCalculateItemsOffsets, lazyListMeasuredItemProvider, list, i3, i56, i57) : null;
        boolean z8 = i11 < i || i12 > i2;
        MeasureResult measureResultInvoke = function3.invoke(Integer.valueOf(i56), Integer.valueOf(i57), new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$8
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope placementScope) {
                List<LazyListMeasuredItem> list4 = listCalculateItemsOffsets;
                LazyListMeasuredItem lazyListMeasuredItem6 = lazyListMeasuredItemFindOrComposeLazyListHeader;
                boolean z9 = z4;
                int size5 = list4.size();
                for (int i58 = 0; i58 < size5; i58++) {
                    LazyListMeasuredItem lazyListMeasuredItem7 = list4.get(i58);
                    if (lazyListMeasuredItem7 != lazyListMeasuredItem6) {
                        lazyListMeasuredItem7.place(placementScope, z9);
                    }
                }
                LazyListMeasuredItem lazyListMeasuredItem8 = lazyListMeasuredItemFindOrComposeLazyListHeader;
                if (lazyListMeasuredItem8 != null) {
                    lazyListMeasuredItem8.place(placementScope, z4);
                }
                ObservableScopeInvalidator.m1176attachToScopeimpl(mutableState);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        });
        if (z7) {
            list3 = listCalculateItemsOffsets;
        } else {
            ArrayList arrayList = new ArrayList(listCalculateItemsOffsets.size());
            int size5 = listCalculateItemsOffsets.size();
            for (int i58 = 0; i58 < size5; i58++) {
                LazyListMeasuredItem lazyListMeasuredItem6 = listCalculateItemsOffsets.get(i58);
                LazyListMeasuredItem lazyListMeasuredItem7 = lazyListMeasuredItem6;
                if ((lazyListMeasuredItem7.getIndex() >= ((LazyListMeasuredItem) arrayDeque.first()).getIndex() && lazyListMeasuredItem7.getIndex() <= ((LazyListMeasuredItem) arrayDeque.last()).getIndex()) || lazyListMeasuredItem7 == lazyListMeasuredItemFindOrComposeLazyListHeader) {
                    arrayList.add(lazyListMeasuredItem6);
                }
            }
            list3 = arrayList;
        }
        return new LazyListMeasureResult(lazyListMeasuredItem2, i17, z8, f2, measureResultInvoke, f7, z6, coroutineScope, density, lazyListMeasuredItemProvider.getChildConstraints(), list3, i26, i39, i, z2, z ? Orientation.Vertical : Orientation.Horizontal, i4, i5, null);
    }

    private static final List<LazyListMeasuredItem> createItemsAfterList(List<LazyListMeasuredItem> list, LazyListMeasuredItemProvider lazyListMeasuredItemProvider, int i, int i2, List<Integer> list2, float f, boolean z, LazyListLayoutInfo lazyListLayoutInfo) {
        ArrayList arrayList;
        LazyListItemInfo lazyListItemInfo;
        LazyListMeasuredItem lazyListMeasuredItem;
        LazyListMeasuredItem lazyListMeasuredItem2;
        int mainAxisSizeWithSpacings;
        LazyListMeasuredItem lazyListMeasuredItem3;
        int index;
        int iMin;
        LazyListMeasuredItem lazyListMeasuredItem4;
        LazyListMeasuredItem lazyListMeasuredItem5;
        int i3 = i - 1;
        int iMin2 = Math.min(((LazyListMeasuredItem) CollectionsKt.last((List) list)).getIndex() + i2, i3);
        int index2 = ((LazyListMeasuredItem) CollectionsKt.last((List) list)).getIndex() + 1;
        if (index2 <= iMin2) {
            ArrayList arrayList2 = null;
            while (true) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList = arrayList2;
                arrayList.add(LazyListMeasuredItemProvider.m1115getAndMeasure0kLqBqw$default(lazyListMeasuredItemProvider, index2, 0L, 2, null));
                if (index2 == iMin2) {
                    break;
                }
                index2++;
                arrayList2 = arrayList;
            }
        } else {
            arrayList = null;
        }
        if (z && lazyListLayoutInfo != null && !lazyListLayoutInfo.getVisibleItemsInfo().isEmpty()) {
            List<LazyListItemInfo> visibleItemsInfo = lazyListLayoutInfo.getVisibleItemsInfo();
            int size = visibleItemsInfo.size() - 1;
            while (true) {
                if (size < 0) {
                    lazyListItemInfo = null;
                    break;
                }
                if (visibleItemsInfo.get(size).getIndex() > iMin2 && (size == 0 || visibleItemsInfo.get(size - 1).getIndex() <= iMin2)) {
                    lazyListItemInfo = visibleItemsInfo.get(size);
                    break;
                }
                size--;
            }
            LazyListItemInfo lazyListItemInfo2 = (LazyListItemInfo) CollectionsKt.last((List) lazyListLayoutInfo.getVisibleItemsInfo());
            if (lazyListItemInfo != null && (index = lazyListItemInfo.getIndex()) <= (iMin = Math.min(lazyListItemInfo2.getIndex(), i3))) {
                while (true) {
                    if (arrayList != null) {
                        int size2 = arrayList.size();
                        int i4 = 0;
                        while (true) {
                            if (i4 >= size2) {
                                lazyListMeasuredItem5 = null;
                                break;
                            }
                            lazyListMeasuredItem5 = arrayList.get(i4);
                            if (lazyListMeasuredItem5.getIndex() == index) {
                                break;
                            }
                            i4++;
                        }
                        lazyListMeasuredItem4 = lazyListMeasuredItem5;
                    } else {
                        lazyListMeasuredItem4 = null;
                    }
                    if (lazyListMeasuredItem4 == null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(LazyListMeasuredItemProvider.m1115getAndMeasure0kLqBqw$default(lazyListMeasuredItemProvider, index, 0L, 2, null));
                    }
                    if (index == iMin) {
                        break;
                    }
                    index++;
                }
            }
            float viewportEndOffset = ((lazyListLayoutInfo.getViewportEndOffset() - lazyListItemInfo2.getOffset()) - lazyListItemInfo2.getSize()) - f;
            if (viewportEndOffset > 0.0f) {
                int index3 = lazyListItemInfo2.getIndex() + 1;
                int i5 = 0;
                while (index3 < i && i5 < viewportEndOffset) {
                    if (index3 <= iMin2) {
                        int size3 = list.size();
                        int i6 = 0;
                        while (true) {
                            if (i6 >= size3) {
                                lazyListMeasuredItem3 = null;
                                break;
                            }
                            lazyListMeasuredItem3 = list.get(i6);
                            if (lazyListMeasuredItem3.getIndex() == index3) {
                                break;
                            }
                            i6++;
                        }
                        lazyListMeasuredItem = lazyListMeasuredItem3;
                    } else if (arrayList != null) {
                        int size4 = arrayList.size();
                        int i7 = 0;
                        while (true) {
                            if (i7 >= size4) {
                                lazyListMeasuredItem2 = null;
                                break;
                            }
                            lazyListMeasuredItem2 = arrayList.get(i7);
                            if (lazyListMeasuredItem2.getIndex() == index3) {
                                break;
                            }
                            i7++;
                        }
                        lazyListMeasuredItem = lazyListMeasuredItem2;
                    } else {
                        lazyListMeasuredItem = null;
                    }
                    if (lazyListMeasuredItem != null) {
                        index3++;
                        mainAxisSizeWithSpacings = lazyListMeasuredItem.getMainAxisSizeWithSpacings();
                    } else {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(LazyListMeasuredItemProvider.m1115getAndMeasure0kLqBqw$default(lazyListMeasuredItemProvider, index3, 0L, 2, null));
                        index3++;
                        mainAxisSizeWithSpacings = ((LazyListMeasuredItem) CollectionsKt.last((List) arrayList)).getMainAxisSizeWithSpacings();
                    }
                    i5 += mainAxisSizeWithSpacings;
                }
            }
        }
        if (arrayList != null && ((LazyListMeasuredItem) CollectionsKt.last((List) arrayList)).getIndex() > iMin2) {
            iMin2 = ((LazyListMeasuredItem) CollectionsKt.last((List) arrayList)).getIndex();
        }
        int size5 = list2.size();
        for (int i8 = 0; i8 < size5; i8++) {
            int iIntValue = list2.get(i8).intValue();
            if (iIntValue > iMin2) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(LazyListMeasuredItemProvider.m1115getAndMeasure0kLqBqw$default(lazyListMeasuredItemProvider, iIntValue, 0L, 2, null));
            }
        }
        return arrayList == null ? CollectionsKt.emptyList() : arrayList;
    }

    private static final List<LazyListMeasuredItem> createItemsBeforeList(int i, LazyListMeasuredItemProvider lazyListMeasuredItemProvider, int i2, List<Integer> list) {
        int iMax = Math.max(0, i - i2);
        int i3 = i - 1;
        ArrayList arrayList = null;
        if (iMax <= i3) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(LazyListMeasuredItemProvider.m1115getAndMeasure0kLqBqw$default(lazyListMeasuredItemProvider, i3, 0L, 2, null));
                if (i3 == iMax) {
                    break;
                }
                i3--;
            }
        }
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i4 = size - 1;
                int iIntValue = list.get(size).intValue();
                if (iIntValue < iMax) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(LazyListMeasuredItemProvider.m1115getAndMeasure0kLqBqw$default(lazyListMeasuredItemProvider, iIntValue, 0L, 2, null));
                }
                if (i4 < 0) {
                    break;
                }
                size = i4;
            }
        }
        return arrayList == null ? CollectionsKt.emptyList() : arrayList;
    }

    private static final List<LazyListMeasuredItem> calculateItemsOffsets(List<LazyListMeasuredItem> list, List<LazyListMeasuredItem> list2, List<LazyListMeasuredItem> list3, int i, int i2, int i3, int i4, int i5, boolean z, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, boolean z2, Density density) {
        int i6 = z ? i2 : i;
        boolean z3 = i3 < Math.min(i6, i4);
        if (z3 && i5 != 0) {
            throw new IllegalStateException("non-zero itemsScrollOffset".toString());
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size() + list3.size());
        if (z3) {
            if (!list2.isEmpty() || !list3.isEmpty()) {
                throw new IllegalArgumentException("no extra items".toString());
            }
            int size = list.size();
            int[] iArr = new int[size];
            for (int i7 = 0; i7 < size; i7++) {
                iArr[i7] = list.get(calculateItemsOffsets$reverseAware(i7, z2, size)).getSize();
            }
            int[] iArr2 = new int[size];
            for (int i8 = 0; i8 < size; i8++) {
                iArr2[i8] = 0;
            }
            if (z) {
                if (vertical == null) {
                    throw new IllegalArgumentException("null verticalArrangement when isVertical == true".toString());
                }
                vertical.arrange(density, i6, iArr, iArr2);
            } else {
                if (horizontal == null) {
                    throw new IllegalArgumentException("null horizontalArrangement when isVertical == false".toString());
                }
                horizontal.arrange(density, i6, iArr, LayoutDirection.Ltr, iArr2);
            }
            IntRange indices = ArraysKt.getIndices(iArr2);
            if (z2) {
                indices = RangesKt.reversed(indices);
            }
            int first = indices.getFirst();
            int last = indices.getLast();
            int step = indices.getStep();
            if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                while (true) {
                    int size2 = iArr2[first];
                    LazyListMeasuredItem lazyListMeasuredItem = list.get(calculateItemsOffsets$reverseAware(first, z2, size));
                    if (z2) {
                        size2 = (i6 - size2) - lazyListMeasuredItem.getSize();
                    }
                    lazyListMeasuredItem.position(size2, i, i2);
                    arrayList.add(lazyListMeasuredItem);
                    if (first == last) {
                        break;
                    }
                    first += step;
                }
            }
        } else {
            int size3 = list2.size();
            int mainAxisSizeWithSpacings = i5;
            for (int i9 = 0; i9 < size3; i9++) {
                LazyListMeasuredItem lazyListMeasuredItem2 = list2.get(i9);
                mainAxisSizeWithSpacings -= lazyListMeasuredItem2.getMainAxisSizeWithSpacings();
                lazyListMeasuredItem2.position(mainAxisSizeWithSpacings, i, i2);
                arrayList.add(lazyListMeasuredItem2);
            }
            int size4 = list.size();
            int mainAxisSizeWithSpacings2 = i5;
            for (int i10 = 0; i10 < size4; i10++) {
                LazyListMeasuredItem lazyListMeasuredItem3 = list.get(i10);
                lazyListMeasuredItem3.position(mainAxisSizeWithSpacings2, i, i2);
                arrayList.add(lazyListMeasuredItem3);
                mainAxisSizeWithSpacings2 += lazyListMeasuredItem3.getMainAxisSizeWithSpacings();
            }
            int size5 = list3.size();
            for (int i11 = 0; i11 < size5; i11++) {
                LazyListMeasuredItem lazyListMeasuredItem4 = list3.get(i11);
                lazyListMeasuredItem4.position(mainAxisSizeWithSpacings2, i, i2);
                arrayList.add(lazyListMeasuredItem4);
                mainAxisSizeWithSpacings2 += lazyListMeasuredItem4.getMainAxisSizeWithSpacings();
            }
        }
        return arrayList;
    }
}
