package androidx.compose.foundation.pager;

import androidx.compose.foundation.CheckScrollableContainerConstraintsKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsStateKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a¡\u0001\u0010!\u001a\u0019\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001a¢\u0006\u0002\b\u001e2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0000H\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001"}, d2 = {"Lkotlin/Function0;", "Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;", "p0", "Landroidx/compose/foundation/pager/PagerState;", "p1", "Landroidx/compose/foundation/layout/PaddingValues;", "p2", "", "p3", "Landroidx/compose/foundation/gestures/Orientation;", "p4", "", "p5", "Landroidx/compose/ui/unit/Dp;", "p6", "Landroidx/compose/foundation/pager/PageSize;", "p7", "Landroidx/compose/ui/Alignment$Horizontal;", "p8", "Landroidx/compose/ui/Alignment$Vertical;", "p9", "Landroidx/compose/foundation/gestures/snapping/SnapPosition;", "p10", "Lkotlinx/coroutines/CoroutineScope;", "p11", "p12", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "Lkotlin/ExtensionFunctionType;", "rememberPagerMeasurePolicy-8u0NR3k", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/gestures/Orientation;IFLandroidx/compose/foundation/pager/PageSize;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/snapping/SnapPosition;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Lkotlin/jvm/functions/Function2;", "rememberPagerMeasurePolicy"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PagerMeasurePolicyKt {
    /* JADX WARN: Code duplicated, block: B:109:0x0139  */
    /* JADX WARN: Code duplicated, block: B:13:0x002b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0075  */
    /* JADX WARN: Code duplicated, block: B:49:0x0090  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:89:0x0100  */
    /* JADX WARN: Code duplicated, block: B:99:0x011a  */
    /* JADX INFO: renamed from: rememberPagerMeasurePolicy-8u0NR3k, reason: not valid java name */
    public static final Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> m1245rememberPagerMeasurePolicy8u0NR3k(final Function0<PagerLazyLayoutItemProvider> function0, final PagerState pagerState, final PaddingValues paddingValues, final boolean z, final Orientation orientation, final int i, final float f, final PageSize pageSize, final Alignment.Horizontal horizontal, final Alignment.Vertical vertical, final SnapPosition snapPosition, final CoroutineScope coroutineScope, final Function0<Integer> function1, Composer composer, int i2, int i3) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1391419623, i2, i3, "androidx.compose.foundation.pager.rememberPagerMeasurePolicy (PagerMeasurePolicy.kt:56)");
        }
        if (((i2 & 112) ^ 48) > 32 && composer.changed(pagerState)) {
            z2 = true;
        } else if ((i2 & 48) == 32) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z11 = (((i2 & 896) ^ 384) > 256 && composer.changed(paddingValues)) || (i2 & 384) == 256;
        boolean z12 = (((i2 & 7168) ^ 3072) > 2048 && composer.changed(z)) || (i2 & 3072) == 2048;
        if (((57344 & i2) ^ 24576) > 16384 && composer.changed(orientation)) {
            z3 = true;
        } else if ((i2 & 24576) == 16384) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (((234881024 & i2) ^ 100663296) > 67108864 && composer.changed(horizontal)) {
            z4 = true;
        } else if ((100663296 & i2) == 67108864) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (((1879048192 & i2) ^ 805306368) > 536870912 && composer.changed(vertical)) {
            z5 = true;
        } else if ((i2 & 805306368) == 536870912) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (((3670016 & i2) ^ 1572864) > 1048576 && composer.changed(f)) {
            z6 = true;
        } else if ((i2 & 1572864) == 1048576) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (((29360128 & i2) ^ 12582912) > 8388608 && composer.changed(pageSize)) {
            z7 = true;
        } else if ((i2 & 12582912) == 8388608) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (((i3 & 14) ^ 6) > 4 && composer.changed(snapPosition)) {
            z8 = true;
        } else if ((i3 & 6) == 4) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (((i3 & 896) ^ 384) > 256 && composer.changed(function1)) {
            z9 = true;
        } else if ((i3 & 384) == 256) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (((458752 & i2) ^ ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) > 131072 && composer.changed(i)) {
            z10 = true;
        } else if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 131072) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean zChanged = composer.changed(coroutineScope);
        Object objRememberedValue = composer.rememberedValue();
        if ((z9 | z6 | z2 | z11 | z12 | z3 | z4 | z5 | z7 | z8 | z10 | zChanged) || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = (Function2) new Function2<LazyLayoutMeasureScope, Constraints, PagerMeasureResult>() { // from class: androidx.compose.foundation.pager.PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1
                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ PagerMeasureResult invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) {
                    return m1246invoke0kLqBqw(lazyLayoutMeasureScope, constraints.getValue());
                }

                /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                public final PagerMeasureResult m1246invoke0kLqBqw(final LazyLayoutMeasureScope lazyLayoutMeasureScope, final long j) {
                    int i4;
                    int i5;
                    int i6;
                    int iM6888getMaxWidthimpl;
                    long jIntOffset;
                    ObservableScopeInvalidator.m1176attachToScopeimpl(pagerState.m1247getMeasurementScopeInvalidatorzYiylxw$foundation_release());
                    boolean z13 = orientation == Orientation.Vertical;
                    CheckScrollableContainerConstraintsKt.m585checkScrollableContainerConstraintsK40F9xA(j, z13 ? Orientation.Vertical : Orientation.Horizontal);
                    if (z13) {
                        i4 = lazyLayoutMeasureScope.mo688roundToPx0680j_4(paddingValues.mo953calculateLeftPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                    } else {
                        i4 = lazyLayoutMeasureScope.mo688roundToPx0680j_4(PaddingKt.calculateStartPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                    }
                    if (z13) {
                        i5 = lazyLayoutMeasureScope.mo688roundToPx0680j_4(paddingValues.mo954calculateRightPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                    } else {
                        i5 = lazyLayoutMeasureScope.mo688roundToPx0680j_4(PaddingKt.calculateEndPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                    }
                    int i7 = lazyLayoutMeasureScope.mo688roundToPx0680j_4(paddingValues.getTop());
                    int i8 = lazyLayoutMeasureScope.mo688roundToPx0680j_4(paddingValues.getBottom());
                    final int i9 = i7 + i8;
                    final int i10 = i4 + i5;
                    int i11 = z13 ? i9 : i10;
                    if (z13 && !z) {
                        i6 = i7;
                    } else if (z13 && z) {
                        i6 = i8;
                    } else {
                        i6 = (z13 || z) ? i5 : i4;
                    }
                    int i12 = i11 - i6;
                    long jM6907offsetNN6EwU = ConstraintsKt.m6907offsetNN6EwU(j, -i10, -i9);
                    LazyLayoutMeasureScope lazyLayoutMeasureScope2 = lazyLayoutMeasureScope;
                    pagerState.setDensity$foundation_release(lazyLayoutMeasureScope2);
                    int i13 = lazyLayoutMeasureScope.mo688roundToPx0680j_4(f);
                    if (z13) {
                        iM6888getMaxWidthimpl = Constraints.m6887getMaxHeightimpl(j) - i9;
                    } else {
                        iM6888getMaxWidthimpl = Constraints.m6888getMaxWidthimpl(j) - i10;
                    }
                    if (!z || iM6888getMaxWidthimpl > 0) {
                        jIntOffset = IntOffsetKt.IntOffset(i4, i7);
                    } else {
                        if (!z13) {
                            i4 += iM6888getMaxWidthimpl;
                        }
                        if (z13) {
                            i7 += iM6888getMaxWidthimpl;
                        }
                        jIntOffset = IntOffsetKt.IntOffset(i4, i7);
                    }
                    long j2 = jIntOffset;
                    int iCoerceAtLeast = RangesKt.coerceAtLeast(pageSize.calculateMainAxisPageSize(lazyLayoutMeasureScope2, iM6888getMaxWidthimpl, i13), 0);
                    pagerState.m1251setPremeasureConstraintsBRTryo0$foundation_release(ConstraintsKt.Constraints$default(0, orientation == Orientation.Vertical ? Constraints.m6888getMaxWidthimpl(jM6907offsetNN6EwU) : iCoerceAtLeast, 0, orientation != Orientation.Vertical ? Constraints.m6887getMaxHeightimpl(jM6907offsetNN6EwU) : iCoerceAtLeast, 5, null));
                    PagerLazyLayoutItemProvider pagerLazyLayoutItemProviderInvoke = function0.invoke();
                    Snapshot.Companion companion = Snapshot.INSTANCE;
                    PagerState pagerState2 = pagerState;
                    SnapPosition snapPosition2 = snapPosition;
                    Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                    Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                    Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                    try {
                        int iMatchScrollPositionWithKey$foundation_release = pagerState2.matchScrollPositionWithKey$foundation_release(pagerLazyLayoutItemProviderInvoke, pagerState2.getCurrentPage());
                        int iCurrentPageOffset = PagerKt.currentPageOffset(snapPosition2, iM6888getMaxWidthimpl, iCoerceAtLeast, i13, i6, i12, pagerState2.getCurrentPage(), pagerState2.getCurrentPageOffsetFraction(), pagerState2.getPageCount());
                        Unit unit = Unit.INSTANCE;
                        companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                        int i14 = iM6888getMaxWidthimpl;
                        PagerMeasureResult pagerMeasureResultM1244measurePagerbmk8ZPk = PagerMeasureKt.m1244measurePagerbmk8ZPk(lazyLayoutMeasureScope, function1.invoke().intValue(), pagerLazyLayoutItemProviderInvoke, i14, i6, i12, i13, iMatchScrollPositionWithKey$foundation_release, iCurrentPageOffset, jM6907offsetNN6EwU, orientation, vertical, horizontal, z, j2, iCoerceAtLeast, i, LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(pagerLazyLayoutItemProviderInvoke, pagerState.getPinnedPages(), pagerState.getBeyondBoundsInfo()), snapPosition, pagerState.m1248getPlacementScopeInvalidatorzYiylxw$foundation_release(), coroutineScope, new Function3<Integer, Integer, Function1<? super Placeable.PlacementScope, ? extends Unit>, MeasureResult>() { // from class: androidx.compose.foundation.pager.PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1$measureResult$1
                            @Override // kotlin.jvm.functions.Function3
                            public final /* bridge */ /* synthetic */ MeasureResult invoke(Integer num, Integer num2, Function1<? super Placeable.PlacementScope, ? extends Unit> function2) {
                                return invoke(num.intValue(), num2.intValue(), (Function1<? super Placeable.PlacementScope, Unit>) function2);
                            }

                            public final MeasureResult invoke(int i15, int i16, Function1<? super Placeable.PlacementScope, Unit> function2) {
                                return lazyLayoutMeasureScope.layout(ConstraintsKt.m6905constrainWidthK40F9xA(j, i15 + i10), ConstraintsKt.m6904constrainHeightK40F9xA(j, i16 + i9), MapsKt.emptyMap(), function2);
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }
                        });
                        PagerState.applyMeasureResult$foundation_release$default(pagerState, pagerMeasureResultM1244measurePagerbmk8ZPk, false, 2, null);
                        return pagerMeasureResultM1244measurePagerbmk8ZPk;
                    } catch (Throwable th) {
                        companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                        throw th;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2 = (Function2) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return function2;
    }
}
