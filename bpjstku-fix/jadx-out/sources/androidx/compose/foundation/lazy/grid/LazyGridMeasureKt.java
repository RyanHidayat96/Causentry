package androidx.compose.foundation.lazy.grid;

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
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.math.MathKt;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0002\u001aH\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\b0\u0007H\u0083\b¢\u0006\u0004\b\u000b\u0010\f\u001a\u0093\u0001\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u001a2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\r0\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\n0\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\n0\u00002\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a®\u0002\u00108\u001a\u0002052\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u001d2\u0006\u0010\u0016\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00132\b\u0010\u001f\u001a\u0004\u0018\u00010\u00152\u0006\u0010 \u001a\u00020\b2\u0006\u0010!\u001a\u00020\u00182\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\n0\"2\u0006\u0010$\u001a\u00020\u00012\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2)\u0010.\u001a%\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b,\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u001e0-0\u00000\u00072/\u00104\u001a+\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u0002010\u0007¢\u0006\u0002\b2\u0012\u0004\u0012\u0002030/H\u0001ø\u0001\u0000¢\u0006\u0004\b6\u00107\u001a-\u0010;\u001a\u000201\"\u0004\b\u0000\u00109*\b\u0012\u0004\u0012\u00028\u00000\u001a2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000:H\u0002¢\u0006\u0004\b;\u0010<\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001"}, d2 = {"", "", "p0", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider;", "p1", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider;", "p2", "Lkotlin/Function1;", "", "p3", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "calculateExtraItems", "(Ljava/util/List;Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider;Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider;Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;", "p4", "p5", "p6", "p7", "p8", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "p9", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "p10", "p11", "Landroidx/compose/ui/unit/Density;", "p12", "", "calculateItemsOffsets", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;IIIIIZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;)Ljava/util/List;", "", "Landroidx/compose/ui/unit/Constraints;", "p13", "p14", "p15", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "p16", "p17", "p18", "Lkotlinx/coroutines/CoroutineScope;", "p19", "Landroidx/compose/foundation/lazy/layout/ObservableScopeInvalidator;", "p20", "Landroidx/compose/ui/graphics/GraphicsContext;", "p21", "Lkotlin/ParameterName;", "Lkotlin/Pair;", "p22", "Lkotlin/Function3;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "Lkotlin/ExtensionFunctionType;", "Landroidx/compose/ui/layout/MeasureResult;", "p23", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;", "measureLazyGrid-OZKpZRA", "(ILandroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider;Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider;IIIIIIFJZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;ILjava/util/List;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/graphics/GraphicsContext;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;)Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;", "measureLazyGrid", ExifInterface.GPS_DIRECTION_TRUE, "", "addAllFromArray", "(Ljava/util/List;[Ljava/lang/Object;)V"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class LazyGridMeasureKt {
    private static final int calculateItemsOffsets$reverseAware(int i, boolean z, int i2) {
        return !z ? i : (i2 - i) - 1;
    }

    /* JADX INFO: renamed from: measureLazyGrid-OZKpZRA, reason: not valid java name */
    public static final LazyGridMeasureResult m1143measureLazyGridOZKpZRA(int i, LazyGridMeasuredLineProvider lazyGridMeasuredLineProvider, LazyGridMeasuredItemProvider lazyGridMeasuredItemProvider, int i2, int i3, int i4, int i5, int i6, int i7, float f, long j, boolean z, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, boolean z2, Density density, LazyLayoutItemAnimator<LazyGridMeasuredItem> lazyLayoutItemAnimator, int i8, List<Integer> list, CoroutineScope coroutineScope, final MutableState<Unit> mutableState, GraphicsContext graphicsContext, Function1<? super Integer, ? extends List<Pair<Integer, Constraints>>> function1, Function3<? super Integer, ? super Integer, ? super Function1<? super Placeable.PlacementScope, Unit>, ? extends MeasureResult> function3) {
        boolean z3;
        int i9;
        int i10;
        int i11;
        LazyGridMeasuredLine lazyGridMeasuredLine;
        int iM6905constrainWidthK40F9xA;
        int iM6887getMaxHeightimpl;
        int iM6904constrainHeightK40F9xA;
        int i12;
        List<LazyGridMeasuredItem> list2;
        int i13;
        float f2;
        LazyGridMeasuredItem[] items;
        LazyGridMeasuredItem lazyGridMeasuredItem;
        int i14;
        if (i3 < 0) {
            throw new IllegalArgumentException("negative beforeContentPadding".toString());
        }
        if (i4 < 0) {
            throw new IllegalArgumentException("negative afterContentPadding".toString());
        }
        if (i <= 0) {
            int iM6890getMinWidthimpl = Constraints.m6890getMinWidthimpl(j);
            int iM6889getMinHeightimpl = Constraints.m6889getMinHeightimpl(j);
            lazyLayoutItemAnimator.onMeasured(0, iM6890getMinWidthimpl, iM6889getMinHeightimpl, new ArrayList(), lazyGridMeasuredItemProvider.getKeyIndexMap(), lazyGridMeasuredItemProvider, z, false, i8, false, 0, 0, coroutineScope, graphicsContext);
            long jM1167getMinSizeToFitDisappearingItemsYbymL2g = lazyLayoutItemAnimator.m1167getMinSizeToFitDisappearingItemsYbymL2g();
            if (!IntSize.m7104equalsimpl0(jM1167getMinSizeToFitDisappearingItemsYbymL2g, IntSize.INSTANCE.m7111getZeroYbymL2g())) {
                iM6890getMinWidthimpl = ConstraintsKt.m6905constrainWidthK40F9xA(j, IntSize.m7106getWidthimpl(jM1167getMinSizeToFitDisappearingItemsYbymL2g));
                iM6889getMinHeightimpl = ConstraintsKt.m6904constrainHeightK40F9xA(j, IntSize.m7105getHeightimpl(jM1167getMinSizeToFitDisappearingItemsYbymL2g));
            }
            return new LazyGridMeasureResult(null, 0, false, 0.0f, function3.invoke(Integer.valueOf(iM6890getMinWidthimpl), Integer.valueOf(iM6889getMinHeightimpl), new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridMeasureKt$measureLazyGrid$3
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Placeable.PlacementScope placementScope) {
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                    invoke2(placementScope);
                    return Unit.INSTANCE;
                }
            }), false, coroutineScope, density, i8, function1, CollectionsKt.emptyList(), -i3, i2 + i4, 0, z2, z ? Orientation.Vertical : Orientation.Horizontal, i4, i5);
        }
        int iRound = Math.round(f);
        int i15 = i7 - iRound;
        if (i6 == 0 && i15 < 0) {
            iRound += i15;
            i15 = 0;
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        int i16 = -i3;
        int i17 = (i5 < 0 ? i5 : 0) + i16;
        int mainAxisSizeWithSpacings = i15 + i17;
        int i18 = i6;
        while (mainAxisSizeWithSpacings < 0 && i18 > 0) {
            i18--;
            LazyGridMeasuredLine andMeasure = lazyGridMeasuredLineProvider.getAndMeasure(i18);
            arrayDeque.add(0, andMeasure);
            mainAxisSizeWithSpacings += andMeasure.getMainAxisSizeWithSpacings();
        }
        if (mainAxisSizeWithSpacings < i17) {
            iRound += mainAxisSizeWithSpacings;
            mainAxisSizeWithSpacings = i17;
        }
        int i19 = mainAxisSizeWithSpacings - i17;
        int i20 = i2 + i4;
        int i21 = i18;
        int iCoerceAtLeast = RangesKt.coerceAtLeast(i20, 0);
        int i22 = i21;
        int mainAxisSizeWithSpacings2 = i19;
        int i23 = i16;
        int mainAxisSizeWithSpacings3 = -i19;
        int i24 = 0;
        boolean z4 = false;
        while (true) {
            z3 = true;
            if (i24 >= arrayDeque.size()) {
                break;
            }
            if (mainAxisSizeWithSpacings3 >= iCoerceAtLeast) {
                arrayDeque.remove(i24);
                z4 = true;
            } else {
                i22++;
                mainAxisSizeWithSpacings3 += ((LazyGridMeasuredLine) arrayDeque.get(i24)).getMainAxisSizeWithSpacings();
                i24++;
            }
        }
        int mainAxisSizeWithSpacings4 = mainAxisSizeWithSpacings3;
        boolean z5 = z4;
        int i25 = i22;
        int i26 = i21;
        while (i25 < i && (mainAxisSizeWithSpacings4 < iCoerceAtLeast || mainAxisSizeWithSpacings4 <= 0 || arrayDeque.isEmpty())) {
            int i27 = iCoerceAtLeast;
            LazyGridMeasuredLine andMeasure2 = lazyGridMeasuredLineProvider.getAndMeasure(i25);
            if (andMeasure2.isEmpty()) {
                break;
            }
            mainAxisSizeWithSpacings4 += andMeasure2.getMainAxisSizeWithSpacings();
            if (mainAxisSizeWithSpacings4 <= i17) {
                i14 = i17;
                if (((LazyGridMeasuredItem) ArraysKt.last(andMeasure2.getItems())).getIndex() != i - 1) {
                    mainAxisSizeWithSpacings2 -= andMeasure2.getMainAxisSizeWithSpacings();
                    i26 = i25 + 1;
                    z5 = true;
                }
                i25++;
                iCoerceAtLeast = i27;
                i17 = i14;
            } else {
                i14 = i17;
            }
            arrayDeque.add(andMeasure2);
            i26 = i26;
            i25++;
            iCoerceAtLeast = i27;
            i17 = i14;
        }
        int i28 = i26;
        if (mainAxisSizeWithSpacings4 < i2) {
            int i29 = i2 - mainAxisSizeWithSpacings4;
            int i30 = mainAxisSizeWithSpacings4 + i29;
            int i31 = i28;
            int mainAxisSizeWithSpacings5 = mainAxisSizeWithSpacings2 - i29;
            while (mainAxisSizeWithSpacings5 < i3 && i31 > 0) {
                int i32 = i31 - 1;
                LazyGridMeasuredLine andMeasure3 = lazyGridMeasuredLineProvider.getAndMeasure(i32);
                arrayDeque.add(0, andMeasure3);
                mainAxisSizeWithSpacings5 += andMeasure3.getMainAxisSizeWithSpacings();
                i31 = i32;
            }
            iRound += i29;
            if (mainAxisSizeWithSpacings5 < 0) {
                iRound += mainAxisSizeWithSpacings5;
                i9 = i30 + mainAxisSizeWithSpacings5;
                i10 = 0;
            } else {
                i9 = i30;
                i10 = mainAxisSizeWithSpacings5;
            }
        } else {
            i9 = mainAxisSizeWithSpacings4;
            i10 = mainAxisSizeWithSpacings2;
        }
        float f3 = (MathKt.getSign(Math.round(f)) != MathKt.getSign(iRound) || Math.abs(Math.round(f)) < Math.abs(iRound)) ? f : iRound;
        if (i10 < 0) {
            throw new IllegalArgumentException("negative initial offset".toString());
        }
        int i33 = -i10;
        LazyGridMeasuredLine lazyGridMeasuredLine2 = (LazyGridMeasuredLine) arrayDeque.first();
        LazyGridMeasuredItem lazyGridMeasuredItem2 = (LazyGridMeasuredItem) ArraysKt.firstOrNull(lazyGridMeasuredLine2.getItems());
        int index = lazyGridMeasuredItem2 != null ? lazyGridMeasuredItem2.getIndex() : 0;
        LazyGridMeasuredLine lazyGridMeasuredLine3 = (LazyGridMeasuredLine) arrayDeque.lastOrNull();
        int index2 = (lazyGridMeasuredLine3 == null || (items = lazyGridMeasuredLine3.getItems()) == null || (lazyGridMeasuredItem = (LazyGridMeasuredItem) ArraysKt.lastOrNull(items)) == null) ? 0 : lazyGridMeasuredItem.getIndex();
        int size = list.size();
        ArrayList arrayListEmptyList = null;
        List listEmptyList = null;
        int i34 = 0;
        while (i34 < size) {
            int i35 = size;
            int iIntValue = list.get(i34).intValue();
            if (iIntValue < 0 || iIntValue >= index) {
                i13 = index2;
                f2 = f3;
            } else {
                float f4 = f3;
                int iSpanOf = lazyGridMeasuredLineProvider.spanOf(iIntValue);
                i13 = index2;
                f2 = f4;
                LazyGridMeasuredItem lazyGridMeasuredItemMo1116getAndMeasurehBUhpc = lazyGridMeasuredItemProvider.mo1116getAndMeasurehBUhpc(iIntValue, 0, iSpanOf, lazyGridMeasuredLineProvider.m1147childConstraintsJhjzzOo$foundation_release(0, iSpanOf));
                ArrayList arrayList = listEmptyList == null ? new ArrayList() : listEmptyList;
                arrayList.add(lazyGridMeasuredItemMo1116getAndMeasurehBUhpc);
                listEmptyList = arrayList;
            }
            i34++;
            index2 = i13;
            i10 = i10;
            size = i35;
            i23 = i23;
            index = index;
            f3 = f2;
            i20 = i20;
        }
        int i36 = index2;
        int i37 = index;
        float f5 = f3;
        int i38 = i20;
        int i39 = i23;
        int i40 = i10;
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        List list3 = listEmptyList;
        int size2 = list.size();
        for (int i41 = 0; i41 < size2; i41++) {
            int iIntValue2 = list.get(i41).intValue();
            if (i36 + 1 <= iIntValue2 && iIntValue2 < i) {
                int iSpanOf2 = lazyGridMeasuredLineProvider.spanOf(iIntValue2);
                LazyGridMeasuredItem lazyGridMeasuredItemMo1116getAndMeasurehBUhpc2 = lazyGridMeasuredItemProvider.mo1116getAndMeasurehBUhpc(iIntValue2, 0, iSpanOf2, lazyGridMeasuredLineProvider.m1147childConstraintsJhjzzOo$foundation_release(0, iSpanOf2));
                if (arrayListEmptyList == null) {
                    arrayListEmptyList = new ArrayList();
                }
                List list4 = arrayListEmptyList;
                list4.add(lazyGridMeasuredItemMo1116getAndMeasurehBUhpc2);
                arrayListEmptyList = list4;
            }
        }
        if (arrayListEmptyList == null) {
            arrayListEmptyList = CollectionsKt.emptyList();
        }
        List list5 = arrayListEmptyList;
        if (i3 > 0 || i5 < 0) {
            int size3 = arrayDeque.size();
            int i42 = i40;
            int i43 = 0;
            while (i43 < size3) {
                int mainAxisSizeWithSpacings6 = ((LazyGridMeasuredLine) arrayDeque.get(i43)).getMainAxisSizeWithSpacings();
                if (i42 == 0 || mainAxisSizeWithSpacings6 > i42 || i43 == CollectionsKt.getLastIndex(arrayDeque)) {
                    break;
                }
                i42 -= mainAxisSizeWithSpacings6;
                i43++;
                lazyGridMeasuredLine2 = (LazyGridMeasuredLine) arrayDeque.get(i43);
            }
            i11 = i42;
            lazyGridMeasuredLine = lazyGridMeasuredLine2;
        } else {
            lazyGridMeasuredLine = lazyGridMeasuredLine2;
            i11 = i40;
        }
        if (z) {
            iM6905constrainWidthK40F9xA = Constraints.m6888getMaxWidthimpl(j);
        } else {
            iM6905constrainWidthK40F9xA = ConstraintsKt.m6905constrainWidthK40F9xA(j, i9);
        }
        int i44 = iM6905constrainWidthK40F9xA;
        if (z) {
            iM6887getMaxHeightimpl = ConstraintsKt.m6904constrainHeightK40F9xA(j, i9);
        } else {
            iM6887getMaxHeightimpl = Constraints.m6887getMaxHeightimpl(j);
        }
        int i45 = iM6887getMaxHeightimpl;
        int i46 = i9;
        final List<LazyGridMeasuredItem> listCalculateItemsOffsets = calculateItemsOffsets(arrayDeque, list3, list5, i44, i45, i46, i2, i33, z, vertical, horizontal, z2, density);
        lazyLayoutItemAnimator.onMeasured((int) f5, i44, i45, listCalculateItemsOffsets, lazyGridMeasuredItemProvider.getKeyIndexMap(), lazyGridMeasuredItemProvider, z, false, i8, false, i11, i46, coroutineScope, graphicsContext);
        long jM1167getMinSizeToFitDisappearingItemsYbymL2g2 = lazyLayoutItemAnimator.m1167getMinSizeToFitDisappearingItemsYbymL2g();
        if (IntSize.m7104equalsimpl0(jM1167getMinSizeToFitDisappearingItemsYbymL2g2, IntSize.INSTANCE.m7111getZeroYbymL2g())) {
            iM6904constrainHeightK40F9xA = i45;
            i12 = i44;
        } else {
            int i47 = z ? i45 : i44;
            int iM6905constrainWidthK40F9xA2 = ConstraintsKt.m6905constrainWidthK40F9xA(j, Math.max(i44, IntSize.m7106getWidthimpl(jM1167getMinSizeToFitDisappearingItemsYbymL2g2)));
            iM6904constrainHeightK40F9xA = ConstraintsKt.m6904constrainHeightK40F9xA(j, Math.max(i45, IntSize.m7105getHeightimpl(jM1167getMinSizeToFitDisappearingItemsYbymL2g2)));
            int i48 = z ? iM6904constrainHeightK40F9xA : iM6905constrainWidthK40F9xA2;
            if (i48 != i47) {
                int size4 = listCalculateItemsOffsets.size();
                for (int i49 = 0; i49 < size4; i49++) {
                    listCalculateItemsOffsets.get(i49).updateMainAxisLayoutSize(i48);
                }
            }
            i12 = iM6905constrainWidthK40F9xA2;
        }
        if (i36 == i - 1 && i46 <= i2) {
            z3 = false;
        }
        MeasureResult measureResultInvoke = function3.invoke(Integer.valueOf(i12), Integer.valueOf(iM6904constrainHeightK40F9xA), new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridMeasureKt$measureLazyGrid$6
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope placementScope) {
                List<LazyGridMeasuredItem> list6 = listCalculateItemsOffsets;
                int size5 = list6.size();
                for (int i50 = 0; i50 < size5; i50++) {
                    list6.get(i50).place(placementScope);
                }
                ObservableScopeInvalidator.m1176attachToScopeimpl(mutableState);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        });
        if (list3.isEmpty() && list5.isEmpty()) {
            list2 = listCalculateItemsOffsets;
        } else {
            ArrayList arrayList2 = new ArrayList(listCalculateItemsOffsets.size());
            int size5 = listCalculateItemsOffsets.size();
            int i50 = 0;
            while (i50 < size5) {
                LazyGridMeasuredItem lazyGridMeasuredItem3 = listCalculateItemsOffsets.get(i50);
                int index3 = lazyGridMeasuredItem3.getIndex();
                int i51 = i37;
                if (i51 <= index3 && index3 <= i36) {
                    arrayList2.add(lazyGridMeasuredItem3);
                }
                i50++;
                i37 = i51;
            }
            list2 = arrayList2;
        }
        return new LazyGridMeasureResult(lazyGridMeasuredLine, i11, z3, f5, measureResultInvoke, z5, coroutineScope, density, i8, function1, list2, i39, i38, i, z2, z ? Orientation.Vertical : Orientation.Horizontal, i4, i5);
    }

    private static final List<LazyGridMeasuredItem> calculateItemsOffsets(List<LazyGridMeasuredLine> list, List<LazyGridMeasuredItem> list2, List<LazyGridMeasuredItem> list3, int i, int i2, int i3, int i4, int i5, boolean z, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, boolean z2, Density density) {
        int i6 = z ? i2 : i;
        boolean z3 = i3 < Math.min(i6, i4);
        if (z3 && i5 != 0) {
            throw new IllegalStateException("non-zero firstLineScrollOffset".toString());
        }
        int size = list.size();
        int length = 0;
        for (int i7 = 0; i7 < size; i7++) {
            length += list.get(i7).getItems().length;
        }
        ArrayList arrayList = new ArrayList(length);
        if (z3) {
            if (!list2.isEmpty() || !list3.isEmpty()) {
                throw new IllegalArgumentException("no items".toString());
            }
            int size2 = list.size();
            int[] iArr = new int[size2];
            for (int i8 = 0; i8 < size2; i8++) {
                iArr[i8] = list.get(calculateItemsOffsets$reverseAware(i8, z2, size2)).getMainAxisSize();
            }
            int[] iArr2 = new int[size2];
            for (int i9 = 0; i9 < size2; i9++) {
                iArr2[i9] = 0;
            }
            if (z) {
                if (vertical == null) {
                    throw new IllegalArgumentException("null verticalArrangement".toString());
                }
                vertical.arrange(density, i6, iArr, iArr2);
            } else {
                if (horizontal == null) {
                    throw new IllegalArgumentException("null horizontalArrangement".toString());
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
                    int mainAxisSize = iArr2[first];
                    LazyGridMeasuredLine lazyGridMeasuredLine = list.get(calculateItemsOffsets$reverseAware(first, z2, size2));
                    if (z2) {
                        mainAxisSize = (i6 - mainAxisSize) - lazyGridMeasuredLine.getMainAxisSize();
                    }
                    addAllFromArray(arrayList, lazyGridMeasuredLine.position(mainAxisSize, i, i2));
                    if (first == last) {
                        break;
                    }
                    first += step;
                }
            }
        } else {
            int size3 = list2.size() - 1;
            if (size3 >= 0) {
                int mainAxisSizeWithSpacings = i5;
                while (true) {
                    int i10 = size3 - 1;
                    LazyGridMeasuredItem lazyGridMeasuredItem = list2.get(size3);
                    mainAxisSizeWithSpacings -= lazyGridMeasuredItem.getMainAxisSizeWithSpacings();
                    lazyGridMeasuredItem.position(mainAxisSizeWithSpacings, 0, i, i2);
                    arrayList.add(lazyGridMeasuredItem);
                    if (i10 < 0) {
                        break;
                    }
                    size3 = i10;
                }
            }
            int size4 = list.size();
            int mainAxisSizeWithSpacings2 = i5;
            for (int i11 = 0; i11 < size4; i11++) {
                LazyGridMeasuredLine lazyGridMeasuredLine2 = list.get(i11);
                addAllFromArray(arrayList, lazyGridMeasuredLine2.position(mainAxisSizeWithSpacings2, i, i2));
                mainAxisSizeWithSpacings2 += lazyGridMeasuredLine2.getMainAxisSizeWithSpacings();
            }
            int size5 = list3.size();
            for (int i12 = 0; i12 < size5; i12++) {
                LazyGridMeasuredItem lazyGridMeasuredItem2 = list3.get(i12);
                lazyGridMeasuredItem2.position(mainAxisSizeWithSpacings2, 0, i, i2);
                arrayList.add(lazyGridMeasuredItem2);
                mainAxisSizeWithSpacings2 += lazyGridMeasuredItem2.getMainAxisSizeWithSpacings();
            }
        }
        return arrayList;
    }

    private static final <T> void addAllFromArray(List<T> list, T[] tArr) {
        for (T t : tArr) {
            list.add(t);
        }
    }

    private static final List<LazyGridMeasuredItem> calculateExtraItems(List<Integer> list, LazyGridMeasuredItemProvider lazyGridMeasuredItemProvider, LazyGridMeasuredLineProvider lazyGridMeasuredLineProvider, Function1<? super Integer, Boolean> function1) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            int iIntValue = list.get(i).intValue();
            if (function1.invoke(Integer.valueOf(iIntValue)).booleanValue()) {
                int iSpanOf = lazyGridMeasuredLineProvider.spanOf(iIntValue);
                LazyGridMeasuredItem lazyGridMeasuredItemMo1116getAndMeasurehBUhpc = lazyGridMeasuredItemProvider.mo1116getAndMeasurehBUhpc(iIntValue, 0, iSpanOf, lazyGridMeasuredLineProvider.m1147childConstraintsJhjzzOo$foundation_release(0, iSpanOf));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(lazyGridMeasuredItemMo1116getAndMeasurehBUhpc);
            }
        }
        return arrayList == null ? CollectionsKt.emptyList() : arrayList;
    }
}
