package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.foundation.gestures.snapping.SnapPositionKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\u001aO\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001aO\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001aG\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001e\u0010\u0015\u001a\u00020\u00142\f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0082\b¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0093\u0001\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030!*\u00020\u00172\f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u0000H\u0002¢\u0006\u0004\b\"\u0010#\u001aj\u0010,\u001a\u00020\u0003*\u00020\u00172\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020$2\u0006\u0010\u0005\u001a\u00020%2\u0006\u0010\u0006\u001a\u00020&2\u0006\u0010\u0007\u001a\u00020\u00192\b\u0010\t\u001a\u0004\u0018\u00010'2\b\u0010\n\u001a\u0004\u0018\u00010(2\u0006\u0010\u0018\u001a\u00020)2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0000H\u0002ø\u0001\u0000¢\u0006\u0004\b*\u0010+\u001añ\u0001\u0010>\u001a\u00020;*\u00020\u00172\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020%2\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020$2\u0006\u0010\u001c\u001a\u00020\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010(2\b\u0010\u001f\u001a\u0004\u0018\u00010'2\u0006\u0010 \u001a\u00020\u001b2\u0006\u0010-\u001a\u00020&2\u0006\u0010.\u001a\u00020\u00002\u0006\u0010/\u001a\u00020\u00002\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\u0006\u00101\u001a\u00020\b2\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u0002042/\u0010:\u001a+\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0000\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\u00140\r¢\u0006\u0002\b8\u0012\u0004\u0012\u00020906H\u0001ø\u0001\u0000¢\u0006\u0004\b<\u0010=\"\u0014\u0010@\u001a\u00020?8\u0000X\u0081T¢\u0006\u0006\n\u0004\b@\u0010A\"\u0014\u0010B\u001a\u00020?8\u0000X\u0081T¢\u0006\u0006\n\u0004\bB\u0010A\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001"}, d2 = {"", "p0", "", "Landroidx/compose/foundation/pager/MeasuredPage;", "p1", "p2", "p3", "p4", "Landroidx/compose/foundation/gestures/snapping/SnapPosition;", "p5", "p6", "calculateNewCurrentPage", "(ILjava/util/List;IIILandroidx/compose/foundation/gestures/snapping/SnapPosition;I)Landroidx/compose/foundation/pager/MeasuredPage;", "Lkotlin/Function1;", "createPagesAfterList", "(IIILjava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "createPagesBeforeList", "(IILjava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "Lkotlin/Function0;", "", "", "debugLog", "(Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "p7", "Landroidx/compose/foundation/gestures/Orientation;", "p8", "", "p9", "Landroidx/compose/ui/unit/Density;", "p10", "p11", "p12", "", "calculatePagesOffsets", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;Ljava/util/List;Ljava/util/List;Ljava/util/List;IIIIILandroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/ui/unit/Density;II)Ljava/util/List;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;", "Landroidx/compose/ui/unit/IntOffset;", "Landroidx/compose/ui/Alignment$Horizontal;", "Landroidx/compose/ui/Alignment$Vertical;", "Landroidx/compose/ui/unit/LayoutDirection;", "getAndMeasure-SGf7dI0", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;IJLandroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;JLandroidx/compose/foundation/gestures/Orientation;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/ui/unit/LayoutDirection;ZI)Landroidx/compose/foundation/pager/MeasuredPage;", "getAndMeasure", "p13", "p14", "p15", "p16", "p17", "Landroidx/compose/foundation/lazy/layout/ObservableScopeInvalidator;", "p18", "Lkotlinx/coroutines/CoroutineScope;", "p19", "Lkotlin/Function3;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/ExtensionFunctionType;", "Landroidx/compose/ui/layout/MeasureResult;", "p20", "Landroidx/compose/foundation/pager/PagerMeasureResult;", "measurePager-bmk8ZPk", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;ILandroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;IIIIIIJLandroidx/compose/foundation/gestures/Orientation;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/ui/Alignment$Horizontal;ZJIILjava/util/List;Landroidx/compose/foundation/gestures/snapping/SnapPosition;Landroidx/compose/runtime/MutableState;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function3;)Landroidx/compose/foundation/pager/PagerMeasureResult;", "measurePager", "", "MaxPageOffset", "F", "MinPageOffset"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PagerMeasureKt {
    public static final float MaxPageOffset = 0.5f;
    public static final float MinPageOffset = -0.5f;

    private static final int calculatePagesOffsets$reverseAware(int i, boolean z, int i2) {
        return !z ? i : (i2 - i) - 1;
    }

    private static final void debugLog(Function0<String> function0) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: measurePager-bmk8ZPk, reason: not valid java name */
    public static final PagerMeasureResult m1244measurePagerbmk8ZPk(final LazyLayoutMeasureScope lazyLayoutMeasureScope, int i, final PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, int i2, int i3, int i4, int i5, int i6, int i7, long j, final Orientation orientation, final Alignment.Vertical vertical, final Alignment.Horizontal horizontal, final boolean z, final long j2, final int i8, int i9, List<Integer> list, SnapPosition snapPosition, final MutableState<Unit> mutableState, CoroutineScope coroutineScope, Function3<? super Integer, ? super Integer, ? super Function1<? super Placeable.PlacementScope, Unit>, ? extends MeasureResult> function3) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        List<MeasuredPage> list2;
        ArrayList arrayListEmptyList;
        ArrayList arrayListEmptyList2;
        if (i3 < 0) {
            throw new IllegalArgumentException("negative beforeContentPadding".toString());
        }
        if (i4 < 0) {
            throw new IllegalArgumentException("negative afterContentPadding".toString());
        }
        int i15 = 0;
        int iCoerceAtLeast = RangesKt.coerceAtLeast(i8 + i5, 0);
        if (i <= 0) {
            return new PagerMeasureResult(CollectionsKt.emptyList(), i8, i5, i4, orientation, -i3, i2 + i4, false, i9, null, null, 0.0f, 0, false, snapPosition, function3.invoke(Integer.valueOf(Constraints.m6890getMinWidthimpl(j)), Integer.valueOf(Constraints.m6889getMinHeightimpl(j)), new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.pager.PagerMeasureKt$measurePager$4
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Placeable.PlacementScope placementScope) {
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                    invoke2(placementScope);
                    return Unit.INSTANCE;
                }
            }), false, null, null, coroutineScope, 393216, null);
        }
        final long jConstraints$default = ConstraintsKt.Constraints$default(0, orientation == Orientation.Vertical ? Constraints.m6888getMaxWidthimpl(j) : i8, 0, orientation != Orientation.Vertical ? Constraints.m6887getMaxHeightimpl(j) : i8, 5, null);
        int i16 = i6;
        int i17 = i7;
        while (i16 > 0 && i17 > 0) {
            i16--;
            i17 -= iCoerceAtLeast;
        }
        int i18 = i17 * (-1);
        if (i16 >= i) {
            i16 = i - 1;
            i18 = 0;
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        int i19 = -i3;
        int i20 = (i5 < 0 ? i5 : 0) + i19;
        int i21 = i18 + i20;
        int iMax = 0;
        while (i21 < 0 && i16 > 0) {
            int i22 = i16 - 1;
            ArrayDeque arrayDeque2 = arrayDeque;
            int i23 = i15;
            int i24 = iCoerceAtLeast;
            MeasuredPage measuredPageM1243getAndMeasureSGf7dI0 = m1243getAndMeasureSGf7dI0(lazyLayoutMeasureScope, i22, jConstraints$default, pagerLazyLayoutItemProvider, j2, orientation, horizontal, vertical, lazyLayoutMeasureScope.getLayoutDirection(), z, i8);
            arrayDeque2.add(i23, measuredPageM1243getAndMeasureSGf7dI0);
            iMax = Math.max(iMax, measuredPageM1243getAndMeasureSGf7dI0.getCrossAxisSize());
            i21 += i24;
            i16 = i22;
            i20 = i20;
            arrayDeque = arrayDeque2;
            i15 = i23;
            iCoerceAtLeast = i24;
            i19 = i19;
        }
        int i25 = i21;
        int i26 = i19;
        int i27 = i20;
        ArrayDeque arrayDeque3 = arrayDeque;
        int i28 = i15;
        int i29 = iCoerceAtLeast;
        int i30 = (i25 < i27 ? i27 : i25) - i27;
        int i31 = i2 + i4;
        int iCoerceAtLeast2 = RangesKt.coerceAtLeast(i31, i28);
        int i32 = -i30;
        int i33 = i28;
        int i34 = i33;
        int i35 = i16;
        while (i33 < arrayDeque3.size()) {
            if (i32 >= iCoerceAtLeast2) {
                arrayDeque3.remove(i33);
                i34 = 1;
            } else {
                i35++;
                i32 += i29;
                i33++;
            }
        }
        int i36 = i16;
        int i37 = i30;
        int i38 = i34;
        int i39 = i35;
        int i40 = i32;
        while (i39 < i && (i40 < iCoerceAtLeast2 || i40 <= 0 || arrayDeque3.isEmpty())) {
            int i41 = i31;
            int i42 = i39;
            int i43 = i36;
            int i44 = iCoerceAtLeast2;
            int i45 = i40;
            int i46 = i29;
            MeasuredPage measuredPageM1243getAndMeasureSGf7dI1 = m1243getAndMeasureSGf7dI0(lazyLayoutMeasureScope, i39, jConstraints$default, pagerLazyLayoutItemProvider, j2, orientation, horizontal, vertical, lazyLayoutMeasureScope.getLayoutDirection(), z, i8);
            int i47 = i - 1;
            i40 = (i42 == i47 ? i8 : i46) + i45;
            if (i40 > i27 || i42 == i47) {
                iMax = Math.max(iMax, measuredPageM1243getAndMeasureSGf7dI1.getCrossAxisSize());
                arrayDeque3.add(measuredPageM1243getAndMeasureSGf7dI1);
                i36 = i43;
            } else {
                i37 -= i46;
                i36 = i42 + 1;
                i38 = 1;
            }
            i39 = i42 + 1;
            i31 = i41;
            i29 = i46;
            iCoerceAtLeast2 = i44;
        }
        int i48 = i36;
        int i49 = i31;
        int i50 = i39;
        int i51 = i40;
        int i52 = i29;
        if (i51 < i2) {
            int i53 = i2 - i51;
            int i54 = i37 - i53;
            int i55 = i53 + i51;
            i14 = i48;
            int i56 = i52;
            int i57 = i54;
            while (i57 < i3 && i14 > 0) {
                i14--;
                int i58 = i56;
                MeasuredPage measuredPageM1243getAndMeasureSGf7dI2 = m1243getAndMeasureSGf7dI0(lazyLayoutMeasureScope, i14, jConstraints$default, pagerLazyLayoutItemProvider, j2, orientation, horizontal, vertical, lazyLayoutMeasureScope.getLayoutDirection(), z, i8);
                arrayDeque3.add(0, measuredPageM1243getAndMeasureSGf7dI2);
                iMax = Math.max(iMax, measuredPageM1243getAndMeasureSGf7dI2.getCrossAxisSize());
                i57 += i58;
                i56 = i58;
            }
            i10 = i56;
            i11 = 0;
            if (i57 < 0) {
                i12 = i55 + i57;
                i13 = 0;
            } else {
                i13 = i57;
                i12 = i55;
            }
        } else {
            i10 = i52;
            i11 = 0;
            i12 = i51;
            i13 = i37;
            i14 = i48;
        }
        if (i13 < 0) {
            throw new IllegalArgumentException("invalid currentFirstPageScrollOffset".toString());
        }
        int i59 = -i13;
        MeasuredPage measuredPage = (MeasuredPage) arrayDeque3.first();
        if (i3 > 0 || i5 < 0) {
            int size = arrayDeque3.size();
            int i60 = i11;
            while (i60 < size && i13 != 0 && i10 <= i13 && i60 != CollectionsKt.getLastIndex(arrayDeque3)) {
                i13 -= i10;
                i60++;
                measuredPage = (MeasuredPage) arrayDeque3.get(i60);
            }
        }
        int i61 = i13;
        MeasuredPage measuredPage2 = measuredPage;
        int i62 = i11;
        List<MeasuredPage> listCreatePagesBeforeList = createPagesBeforeList(i14, i9, list, new Function1<Integer, MeasuredPage>() { // from class: androidx.compose.foundation.pager.PagerMeasureKt$measurePager$extraPagesBefore$1
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ MeasuredPage invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final MeasuredPage invoke(int i63) {
                LazyLayoutMeasureScope lazyLayoutMeasureScope2 = lazyLayoutMeasureScope;
                return PagerMeasureKt.m1243getAndMeasureSGf7dI0(lazyLayoutMeasureScope2, i63, jConstraints$default, pagerLazyLayoutItemProvider, j2, orientation, horizontal, vertical, lazyLayoutMeasureScope2.getLayoutDirection(), z, i8);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        });
        int size2 = listCreatePagesBeforeList.size();
        for (int i63 = i62; i63 < size2; i63++) {
            iMax = Math.max(iMax, listCreatePagesBeforeList.get(i63).getCrossAxisSize());
        }
        int i64 = iMax;
        int i65 = i10;
        List<MeasuredPage> listCreatePagesAfterList = createPagesAfterList(((MeasuredPage) arrayDeque3.last()).getIndex(), i, i9, list, new Function1<Integer, MeasuredPage>() { // from class: androidx.compose.foundation.pager.PagerMeasureKt$measurePager$extraPagesAfter$1
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ MeasuredPage invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final MeasuredPage invoke(int i66) {
                LazyLayoutMeasureScope lazyLayoutMeasureScope2 = lazyLayoutMeasureScope;
                return PagerMeasureKt.m1243getAndMeasureSGf7dI0(lazyLayoutMeasureScope2, i66, jConstraints$default, pagerLazyLayoutItemProvider, j2, orientation, horizontal, vertical, lazyLayoutMeasureScope2.getLayoutDirection(), z, i8);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        });
        int size3 = listCreatePagesAfterList.size();
        int iMax2 = i64;
        for (int i66 = i62; i66 < size3; i66++) {
            iMax2 = Math.max(iMax2, listCreatePagesAfterList.get(i66).getCrossAxisSize());
        }
        int i67 = (Intrinsics.areEqual(measuredPage2, arrayDeque3.first()) && listCreatePagesBeforeList.isEmpty() && listCreatePagesAfterList.isEmpty()) ? 1 : i62;
        int iM6905constrainWidthK40F9xA = ConstraintsKt.m6905constrainWidthK40F9xA(j, orientation == Orientation.Vertical ? iMax2 : i12);
        if (orientation == Orientation.Vertical) {
            iMax2 = i12;
        }
        int iM6904constrainHeightK40F9xA = ConstraintsKt.m6904constrainHeightK40F9xA(j, iMax2);
        final List<MeasuredPage> listCalculatePagesOffsets = calculatePagesOffsets(lazyLayoutMeasureScope, arrayDeque3, listCreatePagesBeforeList, listCreatePagesAfterList, iM6905constrainWidthK40F9xA, iM6904constrainHeightK40F9xA, i12, i2, i59, orientation, z, lazyLayoutMeasureScope, i5, i8);
        if (i67 != 0) {
            list2 = listCalculatePagesOffsets;
        } else {
            ArrayList arrayList = new ArrayList(listCalculatePagesOffsets.size());
            int size4 = listCalculatePagesOffsets.size();
            for (int i68 = i62; i68 < size4; i68++) {
                MeasuredPage measuredPage3 = listCalculatePagesOffsets.get(i68);
                MeasuredPage measuredPage4 = measuredPage3;
                if (measuredPage4.getIndex() >= ((MeasuredPage) arrayDeque3.first()).getIndex() && measuredPage4.getIndex() <= ((MeasuredPage) arrayDeque3.last()).getIndex()) {
                    arrayList.add(measuredPage3);
                }
            }
            list2 = arrayList;
        }
        if (listCreatePagesBeforeList.isEmpty()) {
            arrayListEmptyList = CollectionsKt.emptyList();
        } else {
            ArrayList arrayList2 = new ArrayList(listCalculatePagesOffsets.size());
            int size5 = listCalculatePagesOffsets.size();
            for (int i69 = i62; i69 < size5; i69++) {
                MeasuredPage measuredPage5 = listCalculatePagesOffsets.get(i69);
                if (measuredPage5.getIndex() < ((MeasuredPage) arrayDeque3.first()).getIndex()) {
                    arrayList2.add(measuredPage5);
                }
            }
            arrayListEmptyList = arrayList2;
        }
        List list3 = arrayListEmptyList;
        if (listCreatePagesAfterList.isEmpty()) {
            arrayListEmptyList2 = CollectionsKt.emptyList();
        } else {
            ArrayList arrayList3 = new ArrayList(listCalculatePagesOffsets.size());
            int size6 = listCalculatePagesOffsets.size();
            for (int i70 = i62; i70 < size6; i70++) {
                MeasuredPage measuredPage6 = listCalculatePagesOffsets.get(i70);
                if (measuredPage6.getIndex() > ((MeasuredPage) arrayDeque3.last()).getIndex()) {
                    arrayList3.add(measuredPage6);
                }
            }
            arrayListEmptyList2 = arrayList3;
        }
        List list4 = arrayListEmptyList2;
        int i71 = i12;
        MeasuredPage measuredPageCalculateNewCurrentPage = calculateNewCurrentPage(orientation == Orientation.Vertical ? iM6904constrainHeightK40F9xA : iM6905constrainWidthK40F9xA, list2, i3, i4, i65, snapPosition, i);
        return new PagerMeasureResult(list2, i8, i5, i4, orientation, i26, i49, z, i9, measuredPage2, measuredPageCalculateNewCurrentPage, i65 == 0 ? 0.0f : RangesKt.coerceIn((snapPosition.position(i2, i8, i3, i4, measuredPageCalculateNewCurrentPage != null ? measuredPageCalculateNewCurrentPage.getIndex() : i62, i) - (measuredPageCalculateNewCurrentPage != null ? measuredPageCalculateNewCurrentPage.getOffset() : i62)) / i65, -0.5f, 0.5f), i61, (i50 < i || i71 > i2) ? 1 : i62, snapPosition, function3.invoke(Integer.valueOf(iM6905constrainWidthK40F9xA), Integer.valueOf(iM6904constrainHeightK40F9xA), new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.pager.PagerMeasureKt$measurePager$14
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope placementScope) {
                List<MeasuredPage> list5 = listCalculatePagesOffsets;
                int size7 = list5.size();
                for (int i72 = 0; i72 < size7; i72++) {
                    list5.get(i72).place(placementScope);
                }
                ObservableScopeInvalidator.m1176attachToScopeimpl(mutableState);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        }), i38, list3, list4, coroutineScope);
    }

    private static final List<MeasuredPage> createPagesAfterList(int i, int i2, int i3, List<Integer> list, Function1<? super Integer, MeasuredPage> function1) {
        int iMin = Math.min(i3 + i, i2 - 1);
        int i4 = i + 1;
        ArrayList arrayList = null;
        if (i4 <= iMin) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(function1.invoke(Integer.valueOf(i4)));
                if (i4 == iMin) {
                    break;
                }
                i4++;
            }
        }
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            int iIntValue = list.get(i5).intValue();
            if (iMin + 1 <= iIntValue && iIntValue < i2) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(function1.invoke(Integer.valueOf(iIntValue)));
            }
        }
        return arrayList == null ? CollectionsKt.emptyList() : arrayList;
    }

    private static final List<MeasuredPage> createPagesBeforeList(int i, int i2, List<Integer> list, Function1<? super Integer, MeasuredPage> function1) {
        int iMax = Math.max(0, i - i2);
        int i3 = i - 1;
        ArrayList arrayList = null;
        if (iMax <= i3) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(function1.invoke(Integer.valueOf(i3)));
                if (i3 == iMax) {
                    break;
                }
                i3--;
            }
        }
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            int iIntValue = list.get(i4).intValue();
            if (iIntValue < iMax) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(function1.invoke(Integer.valueOf(iIntValue)));
            }
        }
        return arrayList == null ? CollectionsKt.emptyList() : arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getAndMeasure-SGf7dI0, reason: not valid java name */
    public static final MeasuredPage m1243getAndMeasureSGf7dI0(LazyLayoutMeasureScope lazyLayoutMeasureScope, int i, long j, PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, long j2, Orientation orientation, Alignment.Horizontal horizontal, Alignment.Vertical vertical, LayoutDirection layoutDirection, boolean z, int i2) {
        return new MeasuredPage(i, i2, lazyLayoutMeasureScope.mo1173measure0kLqBqw(i, j), j2, pagerLazyLayoutItemProvider.getKey(i), orientation, horizontal, vertical, layoutDirection, z, null);
    }

    private static final List<MeasuredPage> calculatePagesOffsets(LazyLayoutMeasureScope lazyLayoutMeasureScope, List<MeasuredPage> list, List<MeasuredPage> list2, List<MeasuredPage> list3, int i, int i2, int i3, int i4, int i5, Orientation orientation, boolean z, Density density, int i6, int i7) {
        int i8 = i7 + i6;
        int i9 = orientation == Orientation.Vertical ? i2 : i;
        boolean z2 = i3 < Math.min(i9, i4);
        if (z2 && i5 != 0) {
            throw new IllegalStateException("non-zero pagesScrollOffset=".concat(String.valueOf(i5)).toString());
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size() + list3.size());
        if (z2) {
            if (!list2.isEmpty() || !list3.isEmpty()) {
                throw new IllegalArgumentException("No extra pages".toString());
            }
            int size = list.size();
            int[] iArr = new int[size];
            for (int i10 = 0; i10 < size; i10++) {
                iArr[i10] = i7;
            }
            int[] iArr2 = new int[size];
            for (int i11 = 0; i11 < size; i11++) {
                iArr2[i11] = 0;
            }
            Arrangement.HorizontalOrVertical horizontalOrVerticalM885spacedBy0680j_4 = Arrangement.Absolute.INSTANCE.m885spacedBy0680j_4(lazyLayoutMeasureScope.mo691toDpu2uoSUM(i6));
            if (orientation == Orientation.Vertical) {
                horizontalOrVerticalM885spacedBy0680j_4.arrange(density, i9, iArr, iArr2);
            } else {
                horizontalOrVerticalM885spacedBy0680j_4.arrange(density, i9, iArr, LayoutDirection.Ltr, iArr2);
            }
            IntRange indices = ArraysKt.getIndices(iArr2);
            if (z) {
                indices = RangesKt.reversed(indices);
            }
            int first = indices.getFirst();
            int last = indices.getLast();
            int step = indices.getStep();
            if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                while (true) {
                    int size2 = iArr2[first];
                    MeasuredPage measuredPage = list.get(calculatePagesOffsets$reverseAware(first, z, size));
                    if (z) {
                        size2 = (i9 - size2) - measuredPage.getSize();
                    }
                    measuredPage.position(size2, i, i2);
                    arrayList.add(measuredPage);
                    if (first == last) {
                        break;
                    }
                    first += step;
                }
            }
        } else {
            int size3 = list2.size();
            int i12 = i5;
            for (int i13 = 0; i13 < size3; i13++) {
                MeasuredPage measuredPage2 = list2.get(i13);
                i12 -= i8;
                measuredPage2.position(i12, i, i2);
                arrayList.add(measuredPage2);
            }
            int size4 = list.size();
            int i14 = i5;
            for (int i15 = 0; i15 < size4; i15++) {
                MeasuredPage measuredPage3 = list.get(i15);
                measuredPage3.position(i14, i, i2);
                arrayList.add(measuredPage3);
                i14 += i8;
            }
            int size5 = list3.size();
            for (int i16 = 0; i16 < size5; i16++) {
                MeasuredPage measuredPage4 = list3.get(i16);
                measuredPage4.position(i14, i, i2);
                arrayList.add(measuredPage4);
                i14 += i8;
            }
        }
        return arrayList;
    }

    private static final MeasuredPage calculateNewCurrentPage(int i, List<MeasuredPage> list, int i2, int i3, int i4, SnapPosition snapPosition, int i5) {
        MeasuredPage measuredPage;
        if (list.isEmpty()) {
            measuredPage = null;
        } else {
            MeasuredPage measuredPage2 = list.get(0);
            MeasuredPage measuredPage3 = measuredPage2;
            float f = -Math.abs(SnapPositionKt.calculateDistanceToDesiredSnapPosition(i, i2, i3, i4, measuredPage3.getOffset(), measuredPage3.getIndex(), snapPosition, i5));
            int lastIndex = CollectionsKt.getLastIndex(list);
            if (lastIndex > 0) {
                int i6 = 1;
                while (true) {
                    MeasuredPage measuredPage4 = list.get(i6);
                    MeasuredPage measuredPage5 = measuredPage4;
                    float f2 = -Math.abs(SnapPositionKt.calculateDistanceToDesiredSnapPosition(i, i2, i3, i4, measuredPage5.getOffset(), measuredPage5.getIndex(), snapPosition, i5));
                    if (Float.compare(f, f2) < 0) {
                        measuredPage2 = measuredPage4;
                        f = f2;
                    }
                    if (i6 == lastIndex) {
                        break;
                    }
                    i6++;
                }
            }
            measuredPage = measuredPage2;
        }
        return measuredPage;
    }
}
