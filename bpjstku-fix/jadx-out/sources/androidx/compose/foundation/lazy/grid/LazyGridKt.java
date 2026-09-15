package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.CheckScrollableContainerConstraintsKt;
import androidx.compose.foundation.ScrollingContainerKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableDefaults;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocalKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsStateKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000v\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a~\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u0017H\u0001¢\u0006\u0002\u0010\u0018\u001a~\u0010\u0019\u001a\u0019\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001a¢\u0006\u0002\b\u00172\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0003¢\u0006\u0002\u0010%¨\u0006&"}, d2 = {"LazyGrid", "", "modifier", "Landroidx/compose/ui/Modifier;", RemoteConfigConstants.ResponseFieldKey.STATE, "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "slots", "Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "reverseLayout", "", "isVertical", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "userScrollEnabled", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/grid/LazyGridScope;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;Landroidx/compose/foundation/layout/PaddingValues;ZZLandroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "rememberLazyGridMeasurePolicy", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "itemProviderLambda", "Lkotlin/Function0;", "Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "graphicsContext", "Landroidx/compose/ui/graphics/GraphicsContext;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;Landroidx/compose/foundation/layout/PaddingValues;ZZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/ui/graphics/GraphicsContext;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function2;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class LazyGridKt {
    /* JADX WARN: Code duplicated, block: B:102:0x011d  */
    /* JADX WARN: Code duplicated, block: B:103:0x0120  */
    /* JADX WARN: Code duplicated, block: B:105:0x0124  */
    /* JADX WARN: Code duplicated, block: B:107:0x012c  */
    /* JADX WARN: Code duplicated, block: B:108:0x012f  */
    /* JADX WARN: Code duplicated, block: B:113:0x013a  */
    /* JADX WARN: Code duplicated, block: B:114:0x013d  */
    /* JADX WARN: Code duplicated, block: B:116:0x0141  */
    /* JADX WARN: Code duplicated, block: B:118:0x0147  */
    /* JADX WARN: Code duplicated, block: B:119:0x0149  */
    /* JADX WARN: Code duplicated, block: B:121:0x014d  */
    /* JADX WARN: Code duplicated, block: B:124:0x0159  */
    /* JADX WARN: Code duplicated, block: B:129:0x0170  */
    /* JADX WARN: Code duplicated, block: B:131:0x0178  */
    /* JADX WARN: Code duplicated, block: B:137:0x0192 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:138:0x0194  */
    /* JADX WARN: Code duplicated, block: B:139:0x0199  */
    /* JADX WARN: Code duplicated, block: B:141:0x019c  */
    /* JADX WARN: Code duplicated, block: B:142:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:144:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:145:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:148:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:149:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:153:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:156:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:159:0x0259  */
    /* JADX WARN: Code duplicated, block: B:160:0x025c  */
    /* JADX WARN: Code duplicated, block: B:163:0x0309  */
    /* JADX WARN: Code duplicated, block: B:167:0x0319  */
    /* JADX WARN: Code duplicated, block: B:169:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x008a  */
    /* JADX WARN: Code duplicated, block: B:50:0x008d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0091  */
    /* JADX WARN: Code duplicated, block: B:54:0x0099  */
    /* JADX WARN: Code duplicated, block: B:55:0x009c  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:80:0x00df  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:91:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:92:0x0101  */
    /* JADX WARN: Code duplicated, block: B:94:0x0105  */
    /* JADX WARN: Code duplicated, block: B:96:0x010d  */
    /* JADX WARN: Code duplicated, block: B:97:0x0110  */
    public static final void LazyGrid(Modifier modifier, final LazyGridState lazyGridState, final LazyGridSlotsProvider lazyGridSlotsProvider, PaddingValues paddingValues, boolean z, final boolean z2, FlingBehavior flingBehavior, final boolean z3, final Arrangement.Vertical vertical, final Arrangement.Horizontal horizontal, final Function1<? super LazyGridScope, Unit> function1, Composer composer, final int i, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        PaddingValues paddingValues2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Modifier.Companion companion;
        PaddingValues paddingValuesM995PaddingValues0680j_4;
        boolean z4;
        FlingBehavior flingBehavior2;
        int i13;
        Object objRememberedValue;
        Orientation orientation;
        Composer composer2;
        final Modifier modifier3;
        final PaddingValues paddingValues3;
        final FlingBehavior flingBehavior3;
        final boolean z5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i14;
        Composer composerStartRestartGroup = composer.startRestartGroup(-649686062);
        int i15 = i3 & 1;
        if (i15 != 0) {
            i4 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i4 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(lazyGridState) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            i4 |= (i & 512) == 0 ? composerStartRestartGroup.changed(lazyGridSlotsProvider) : composerStartRestartGroup.changedInstance(lazyGridSlotsProvider) ? 256 : 128;
        }
        int i16 = i3 & 8;
        if (i16 == 0) {
            if ((i & 3072) == 0) {
                paddingValues2 = paddingValues;
                i4 |= composerStartRestartGroup.changed(paddingValues2) ? 2048 : 1024;
            }
            i5 = i3 & 16;
            if (i5 != 0) {
                if ((i & 24576) == 0) {
                    if (composerStartRestartGroup.changed(z)) {
                        i6 = 16384;
                    } else {
                        i6 = 8192;
                    }
                    i4 |= i6;
                }
                if ((i3 & 32) != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    if (composerStartRestartGroup.changed(z2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i4 |= i7;
                }
                if ((i & 1572864) != 0) {
                    if ((i3 & 64) == 0 || !composerStartRestartGroup.changed(flingBehavior)) {
                        i14 = 524288;
                    } else {
                        i14 = 1048576;
                    }
                    i4 |= i14;
                }
                if ((i3 & 128) != 0) {
                    if ((i & 12582912) == 0) {
                        if (composerStartRestartGroup.changed(z3)) {
                            i8 = 8388608;
                        } else {
                            i8 = 4194304;
                        }
                        i4 |= i8;
                    }
                    if ((i3 & 256) != 0) {
                        if ((i & 100663296) == 0) {
                            if (composerStartRestartGroup.changed(vertical)) {
                                i9 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                            } else {
                                i9 = 33554432;
                            }
                            i4 |= i9;
                        }
                        if ((i3 & 512) != 0) {
                            if ((i & 805306368) == 0) {
                                if (composerStartRestartGroup.changed(horizontal)) {
                                    i10 = 536870912;
                                } else {
                                    i10 = 268435456;
                                }
                                i4 |= i10;
                            }
                            if ((i3 & 1024) != 0) {
                                i11 = i2 | 6;
                            } else if ((i2 & 6) == 0) {
                                if (composerStartRestartGroup.changedInstance(function1)) {
                                    i12 = 4;
                                } else {
                                    i12 = 2;
                                }
                                i11 = i2 | i12;
                            } else {
                                i11 = i2;
                            }
                            if ((i4 & 306783379) == 306783378 || (i11 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.startDefaults();
                                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                    if (i15 != 0) {
                                        companion = Modifier.INSTANCE;
                                    } else {
                                        companion = modifier2;
                                    }
                                    if (i16 != 0) {
                                        paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                                    } else {
                                        paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                                    }
                                    if (i5 != 0) {
                                        z4 = false;
                                    } else {
                                        z4 = z;
                                    }
                                    if ((i3 & 64) != 0) {
                                        i4 &= -3670017;
                                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                    } else {
                                        flingBehavior2 = flingBehavior;
                                    }
                                    i13 = i4;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    if ((i3 & 64) != 0) {
                                        i4 &= -3670017;
                                    }
                                    flingBehavior2 = flingBehavior;
                                    companion = modifier2;
                                    i13 = i4;
                                    paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                                    z4 = z;
                                }
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-649686062, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:77)");
                                }
                                int i17 = i13 >> 3;
                                int i18 = i17 & 14;
                                Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(lazyGridState, function1, composerStartRestartGroup, ((i11 << 3) & 112) | i18);
                                int i19 = i13 >> 9;
                                LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState = LazySemanticsKt.rememberLazyGridSemanticState(lazyGridState, z4, composerStartRestartGroup, (i19 & 112) | i18);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                                    composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                    objRememberedValue = compositionScopedCoroutineScopeCanceller;
                                }
                                int i20 = i13;
                                boolean z6 = z4;
                                Modifier modifier4 = companion;
                                Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda, lazyGridState, lazyGridSlotsProvider, paddingValuesM995PaddingValues0680j_4, z4, z2, horizontal, vertical, ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope(), (GraphicsContext) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext()), composerStartRestartGroup, (29360128 & i17) | (524272 & i13) | (i19 & 3670016));
                                if (z2) {
                                    orientation = Orientation.Vertical;
                                } else {
                                    orientation = Orientation.Horizontal;
                                }
                                Orientation orientation2 = orientation;
                                composer2 = composerStartRestartGroup;
                                LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier4.then(lazyGridState.getRemeasurementModifier()).then(lazyGridState.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda, lazyLayoutSemanticStateRememberLazyGridSemanticState, orientation2, z3, z6, composerStartRestartGroup, (i19 & 57344) | ((i20 << 3) & 458752)), LazyGridBeyondBoundsModifierKt.rememberLazyGridBeyondBoundsState(lazyGridState, composerStartRestartGroup, i18), lazyGridState.getBeyondBoundsInfo(), z6, (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation2, z3, composerStartRestartGroup, (i17 & 3670016) | (MutableVector.$stable << 6) | (i17 & 7168)).then(lazyGridState.getItemAnimator$foundation_release().getModifier()), lazyGridState, orientation2, z3, z6, flingBehavior2, lazyGridState.getInternalInteractionSource(), null, composerStartRestartGroup, (i20 & 112) | ((i20 >> 12) & 7168) | (i20 & 57344) | (458752 & i17), 64), lazyGridState.getPrefetchState(), function2RememberLazyGridMeasurePolicy, composer2, 0, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier3 = modifier4;
                                paddingValues3 = paddingValuesM995PaddingValues0680j_4;
                                flingBehavior3 = flingBehavior2;
                                z5 = z6;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                z5 = z;
                                modifier3 = modifier2;
                                paddingValues3 = paddingValues2;
                                composer2 = composerStartRestartGroup;
                                flingBehavior3 = flingBehavior;
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt.LazyGrid.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i21) {
                                        LazyGridKt.LazyGrid(modifier3, lazyGridState, lazyGridSlotsProvider, paddingValues3, z5, z2, flingBehavior3, z3, vertical, horizontal, function1, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                                    }
                                });
                            }
                        }
                        i4 |= 805306368;
                        if ((i3 & 1024) != 0) {
                            i11 = i2 | 6;
                        } else if ((i2 & 6) == 0) {
                            if (composerStartRestartGroup.changedInstance(function1)) {
                                i12 = 4;
                            } else {
                                i12 = 2;
                            }
                            i11 = i2 | i12;
                        } else {
                            i11 = i2;
                        }
                        if ((i4 & 306783379) == 306783378) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if (i15 != 0) {
                                    companion = Modifier.INSTANCE;
                                } else {
                                    companion = modifier2;
                                }
                                if (i16 != 0) {
                                    paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                                } else {
                                    paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                                }
                                if (i5 != 0) {
                                    z4 = false;
                                } else {
                                    z4 = z;
                                }
                                if ((i3 & 64) != 0) {
                                    i4 &= -3670017;
                                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                } else {
                                    flingBehavior2 = flingBehavior;
                                }
                                i13 = i4;
                            } else {
                                if (i15 != 0) {
                                    companion = Modifier.INSTANCE;
                                } else {
                                    companion = modifier2;
                                }
                                if (i16 != 0) {
                                    paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                                } else {
                                    paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                                }
                                if (i5 != 0) {
                                    z4 = false;
                                } else {
                                    z4 = z;
                                }
                                if ((i3 & 64) != 0) {
                                    i4 &= -3670017;
                                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                } else {
                                    flingBehavior2 = flingBehavior;
                                }
                                i13 = i4;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-649686062, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:77)");
                            }
                            int i110 = i13 >> 3;
                            int i111 = i110 & 14;
                            Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda2 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(lazyGridState, function1, composerStartRestartGroup, ((i11 << 3) & 112) | i111);
                            int i112 = i13 >> 9;
                            LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState2 = LazySemanticsKt.rememberLazyGridSemanticState(lazyGridState, z4, composerStartRestartGroup, (i112 & 112) | i111);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller2 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                                composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller2);
                                objRememberedValue = compositionScopedCoroutineScopeCanceller2;
                            }
                            int i21 = i13;
                            boolean z7 = z4;
                            Modifier modifier5 = companion;
                            Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy2 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda2, lazyGridState, lazyGridSlotsProvider, paddingValuesM995PaddingValues0680j_4, z4, z2, horizontal, vertical, ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope(), (GraphicsContext) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext()), composerStartRestartGroup, (29360128 & i110) | (524272 & i13) | (i112 & 3670016));
                            if (z2) {
                                orientation = Orientation.Vertical;
                            } else {
                                orientation = Orientation.Horizontal;
                            }
                            Orientation orientation3 = orientation;
                            composer2 = composerStartRestartGroup;
                            LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda2, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier5.then(lazyGridState.getRemeasurementModifier()).then(lazyGridState.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda2, lazyLayoutSemanticStateRememberLazyGridSemanticState2, orientation3, z3, z7, composerStartRestartGroup, (i112 & 57344) | ((i21 << 3) & 458752)), LazyGridBeyondBoundsModifierKt.rememberLazyGridBeyondBoundsState(lazyGridState, composerStartRestartGroup, i111), lazyGridState.getBeyondBoundsInfo(), z7, (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation3, z3, composerStartRestartGroup, (i110 & 3670016) | (MutableVector.$stable << 6) | (i110 & 7168)).then(lazyGridState.getItemAnimator$foundation_release().getModifier()), lazyGridState, orientation3, z3, z7, flingBehavior2, lazyGridState.getInternalInteractionSource(), null, composerStartRestartGroup, (i21 & 112) | ((i21 >> 12) & 7168) | (i21 & 57344) | (458752 & i110), 64), lazyGridState.getPrefetchState(), function2RememberLazyGridMeasurePolicy2, composer2, 0, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier5;
                            paddingValues3 = paddingValuesM995PaddingValues0680j_4;
                            flingBehavior3 = flingBehavior2;
                            z5 = z7;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if (i15 != 0) {
                                    companion = Modifier.INSTANCE;
                                } else {
                                    companion = modifier2;
                                }
                                if (i16 != 0) {
                                    paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                                } else {
                                    paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                                }
                                if (i5 != 0) {
                                    z4 = false;
                                } else {
                                    z4 = z;
                                }
                                if ((i3 & 64) != 0) {
                                    i4 &= -3670017;
                                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                } else {
                                    flingBehavior2 = flingBehavior;
                                }
                                i13 = i4;
                            } else {
                                if (i15 != 0) {
                                    companion = Modifier.INSTANCE;
                                } else {
                                    companion = modifier2;
                                }
                                if (i16 != 0) {
                                    paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                                } else {
                                    paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                                }
                                if (i5 != 0) {
                                    z4 = false;
                                } else {
                                    z4 = z;
                                }
                                if ((i3 & 64) != 0) {
                                    i4 &= -3670017;
                                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                } else {
                                    flingBehavior2 = flingBehavior;
                                }
                                i13 = i4;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-649686062, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:77)");
                            }
                            int i113 = i13 >> 3;
                            int i114 = i113 & 14;
                            Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda3 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(lazyGridState, function1, composerStartRestartGroup, ((i11 << 3) & 112) | i114);
                            int i115 = i13 >> 9;
                            LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState3 = LazySemanticsKt.rememberLazyGridSemanticState(lazyGridState, z4, composerStartRestartGroup, (i115 & 112) | i114);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller3 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                                composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller3);
                                objRememberedValue = compositionScopedCoroutineScopeCanceller3;
                            }
                            int i22 = i13;
                            boolean z8 = z4;
                            Modifier modifier6 = companion;
                            Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy3 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda3, lazyGridState, lazyGridSlotsProvider, paddingValuesM995PaddingValues0680j_4, z4, z2, horizontal, vertical, ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope(), (GraphicsContext) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext()), composerStartRestartGroup, (29360128 & i113) | (524272 & i13) | (i115 & 3670016));
                            if (z2) {
                                orientation = Orientation.Vertical;
                            } else {
                                orientation = Orientation.Horizontal;
                            }
                            Orientation orientation4 = orientation;
                            composer2 = composerStartRestartGroup;
                            LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda3, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier6.then(lazyGridState.getRemeasurementModifier()).then(lazyGridState.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda3, lazyLayoutSemanticStateRememberLazyGridSemanticState3, orientation4, z3, z8, composerStartRestartGroup, (i115 & 57344) | ((i22 << 3) & 458752)), LazyGridBeyondBoundsModifierKt.rememberLazyGridBeyondBoundsState(lazyGridState, composerStartRestartGroup, i114), lazyGridState.getBeyondBoundsInfo(), z8, (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation4, z3, composerStartRestartGroup, (i113 & 3670016) | (MutableVector.$stable << 6) | (i113 & 7168)).then(lazyGridState.getItemAnimator$foundation_release().getModifier()), lazyGridState, orientation4, z3, z8, flingBehavior2, lazyGridState.getInternalInteractionSource(), null, composerStartRestartGroup, (i22 & 112) | ((i22 >> 12) & 7168) | (i22 & 57344) | (458752 & i113), 64), lazyGridState.getPrefetchState(), function2RememberLazyGridMeasurePolicy3, composer2, 0, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier6;
                            paddingValues3 = paddingValuesM995PaddingValues0680j_4;
                            flingBehavior3 = flingBehavior2;
                            z5 = z8;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt.LazyGrid.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i23) {
                                    LazyGridKt.LazyGrid(modifier3, lazyGridState, lazyGridSlotsProvider, paddingValues3, z5, z2, flingBehavior3, z3, vertical, horizontal, function1, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                                }
                            });
                        }
                    }
                    i4 |= 100663296;
                    if ((i3 & 512) != 0) {
                        if ((i & 805306368) == 0) {
                            if (composerStartRestartGroup.changed(horizontal)) {
                                i10 = 536870912;
                            } else {
                                i10 = 268435456;
                            }
                            i4 |= i10;
                        }
                        if ((i3 & 1024) != 0) {
                            i11 = i2 | 6;
                        } else if ((i2 & 6) == 0) {
                            if (composerStartRestartGroup.changedInstance(function1)) {
                                i12 = 4;
                            } else {
                                i12 = 2;
                            }
                            i11 = i2 | i12;
                        } else {
                            i11 = i2;
                        }
                        if ((i4 & 306783379) == 306783378) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if (i15 != 0) {
                                    companion = Modifier.INSTANCE;
                                } else {
                                    companion = modifier2;
                                }
                                if (i16 != 0) {
                                    paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                                } else {
                                    paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                                }
                                if (i5 != 0) {
                                    z4 = false;
                                } else {
                                    z4 = z;
                                }
                                if ((i3 & 64) != 0) {
                                    i4 &= -3670017;
                                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                } else {
                                    flingBehavior2 = flingBehavior;
                                }
                                i13 = i4;
                            } else {
                                if (i15 != 0) {
                                    companion = Modifier.INSTANCE;
                                } else {
                                    companion = modifier2;
                                }
                                if (i16 != 0) {
                                    paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                                } else {
                                    paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                                }
                                if (i5 != 0) {
                                    z4 = false;
                                } else {
                                    z4 = z;
                                }
                                if ((i3 & 64) != 0) {
                                    i4 &= -3670017;
                                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                } else {
                                    flingBehavior2 = flingBehavior;
                                }
                                i13 = i4;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-649686062, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:77)");
                            }
                            int i116 = i13 >> 3;
                            int i117 = i116 & 14;
                            Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda4 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(lazyGridState, function1, composerStartRestartGroup, ((i11 << 3) & 112) | i117);
                            int i118 = i13 >> 9;
                            LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState4 = LazySemanticsKt.rememberLazyGridSemanticState(lazyGridState, z4, composerStartRestartGroup, (i118 & 112) | i117);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller4 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                                composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller4);
                                objRememberedValue = compositionScopedCoroutineScopeCanceller4;
                            }
                            int i23 = i13;
                            boolean z9 = z4;
                            Modifier modifier7 = companion;
                            Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy4 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda4, lazyGridState, lazyGridSlotsProvider, paddingValuesM995PaddingValues0680j_4, z4, z2, horizontal, vertical, ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope(), (GraphicsContext) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext()), composerStartRestartGroup, (29360128 & i116) | (524272 & i13) | (i118 & 3670016));
                            if (z2) {
                                orientation = Orientation.Vertical;
                            } else {
                                orientation = Orientation.Horizontal;
                            }
                            Orientation orientation5 = orientation;
                            composer2 = composerStartRestartGroup;
                            LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda4, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier7.then(lazyGridState.getRemeasurementModifier()).then(lazyGridState.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda4, lazyLayoutSemanticStateRememberLazyGridSemanticState4, orientation5, z3, z9, composerStartRestartGroup, (i118 & 57344) | ((i23 << 3) & 458752)), LazyGridBeyondBoundsModifierKt.rememberLazyGridBeyondBoundsState(lazyGridState, composerStartRestartGroup, i117), lazyGridState.getBeyondBoundsInfo(), z9, (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation5, z3, composerStartRestartGroup, (i116 & 3670016) | (MutableVector.$stable << 6) | (i116 & 7168)).then(lazyGridState.getItemAnimator$foundation_release().getModifier()), lazyGridState, orientation5, z3, z9, flingBehavior2, lazyGridState.getInternalInteractionSource(), null, composerStartRestartGroup, (i23 & 112) | ((i23 >> 12) & 7168) | (i23 & 57344) | (458752 & i116), 64), lazyGridState.getPrefetchState(), function2RememberLazyGridMeasurePolicy4, composer2, 0, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier7;
                            paddingValues3 = paddingValuesM995PaddingValues0680j_4;
                            flingBehavior3 = flingBehavior2;
                            z5 = z9;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if (i15 != 0) {
                                    companion = Modifier.INSTANCE;
                                } else {
                                    companion = modifier2;
                                }
                                if (i16 != 0) {
                                    paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                                } else {
                                    paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                                }
                                if (i5 != 0) {
                                    z4 = false;
                                } else {
                                    z4 = z;
                                }
                                if ((i3 & 64) != 0) {
                                    i4 &= -3670017;
                                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                } else {
                                    flingBehavior2 = flingBehavior;
                                }
                                i13 = i4;
                            } else {
                                if (i15 != 0) {
                                    companion = Modifier.INSTANCE;
                                } else {
                                    companion = modifier2;
                                }
                                if (i16 != 0) {
                                    paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                                } else {
                                    paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                                }
                                if (i5 != 0) {
                                    z4 = false;
                                } else {
                                    z4 = z;
                                }
                                if ((i3 & 64) != 0) {
                                    i4 &= -3670017;
                                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                } else {
                                    flingBehavior2 = flingBehavior;
                                }
                                i13 = i4;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-649686062, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:77)");
                            }
                            int i119 = i13 >> 3;
                            int i1110 = i119 & 14;
                            Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda5 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(lazyGridState, function1, composerStartRestartGroup, ((i11 << 3) & 112) | i1110);
                            int i1111 = i13 >> 9;
                            LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState5 = LazySemanticsKt.rememberLazyGridSemanticState(lazyGridState, z4, composerStartRestartGroup, (i1111 & 112) | i1110);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller5 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                                composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller5);
                                objRememberedValue = compositionScopedCoroutineScopeCanceller5;
                            }
                            int i24 = i13;
                            boolean z10 = z4;
                            Modifier modifier8 = companion;
                            Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy5 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda5, lazyGridState, lazyGridSlotsProvider, paddingValuesM995PaddingValues0680j_4, z4, z2, horizontal, vertical, ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope(), (GraphicsContext) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext()), composerStartRestartGroup, (29360128 & i119) | (524272 & i13) | (i1111 & 3670016));
                            if (z2) {
                                orientation = Orientation.Vertical;
                            } else {
                                orientation = Orientation.Horizontal;
                            }
                            Orientation orientation6 = orientation;
                            composer2 = composerStartRestartGroup;
                            LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda5, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier8.then(lazyGridState.getRemeasurementModifier()).then(lazyGridState.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda5, lazyLayoutSemanticStateRememberLazyGridSemanticState5, orientation6, z3, z10, composerStartRestartGroup, (i1111 & 57344) | ((i24 << 3) & 458752)), LazyGridBeyondBoundsModifierKt.rememberLazyGridBeyondBoundsState(lazyGridState, composerStartRestartGroup, i1110), lazyGridState.getBeyondBoundsInfo(), z10, (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation6, z3, composerStartRestartGroup, (i119 & 3670016) | (MutableVector.$stable << 6) | (i119 & 7168)).then(lazyGridState.getItemAnimator$foundation_release().getModifier()), lazyGridState, orientation6, z3, z10, flingBehavior2, lazyGridState.getInternalInteractionSource(), null, composerStartRestartGroup, (i24 & 112) | ((i24 >> 12) & 7168) | (i24 & 57344) | (458752 & i119), 64), lazyGridState.getPrefetchState(), function2RememberLazyGridMeasurePolicy5, composer2, 0, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier8;
                            paddingValues3 = paddingValuesM995PaddingValues0680j_4;
                            flingBehavior3 = flingBehavior2;
                            z5 = z10;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt.LazyGrid.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i25) {
                                    LazyGridKt.LazyGrid(modifier3, lazyGridState, lazyGridSlotsProvider, paddingValues3, z5, z2, flingBehavior3, z3, vertical, horizontal, function1, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                                }
                            });
                        }
                    }
                    i4 |= 805306368;
                    if ((i3 & 1024) != 0) {
                        i11 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        if (composerStartRestartGroup.changedInstance(function1)) {
                            i12 = 4;
                        } else {
                            i12 = 2;
                        }
                        i11 = i2 | i12;
                    } else {
                        i11 = i2;
                    }
                    if ((i4 & 306783379) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i15 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier2;
                            }
                            if (i16 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            } else {
                                paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i5 != 0) {
                                z4 = false;
                            } else {
                                z4 = z;
                            }
                            if ((i3 & 64) != 0) {
                                i4 &= -3670017;
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            i13 = i4;
                        } else {
                            if (i15 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier2;
                            }
                            if (i16 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            } else {
                                paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i5 != 0) {
                                z4 = false;
                            } else {
                                z4 = z;
                            }
                            if ((i3 & 64) != 0) {
                                i4 &= -3670017;
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            i13 = i4;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-649686062, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:77)");
                        }
                        int i1112 = i13 >> 3;
                        int i1113 = i1112 & 14;
                        Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda6 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(lazyGridState, function1, composerStartRestartGroup, ((i11 << 3) & 112) | i1113);
                        int i1114 = i13 >> 9;
                        LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState6 = LazySemanticsKt.rememberLazyGridSemanticState(lazyGridState, z4, composerStartRestartGroup, (i1114 & 112) | i1113);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller6 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                            composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller6);
                            objRememberedValue = compositionScopedCoroutineScopeCanceller6;
                        }
                        int i25 = i13;
                        boolean z11 = z4;
                        Modifier modifier9 = companion;
                        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy6 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda6, lazyGridState, lazyGridSlotsProvider, paddingValuesM995PaddingValues0680j_4, z4, z2, horizontal, vertical, ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope(), (GraphicsContext) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext()), composerStartRestartGroup, (29360128 & i1112) | (524272 & i13) | (i1114 & 3670016));
                        if (z2) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Horizontal;
                        }
                        Orientation orientation7 = orientation;
                        composer2 = composerStartRestartGroup;
                        LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda6, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier9.then(lazyGridState.getRemeasurementModifier()).then(lazyGridState.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda6, lazyLayoutSemanticStateRememberLazyGridSemanticState6, orientation7, z3, z11, composerStartRestartGroup, (i1114 & 57344) | ((i25 << 3) & 458752)), LazyGridBeyondBoundsModifierKt.rememberLazyGridBeyondBoundsState(lazyGridState, composerStartRestartGroup, i1113), lazyGridState.getBeyondBoundsInfo(), z11, (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation7, z3, composerStartRestartGroup, (i1112 & 3670016) | (MutableVector.$stable << 6) | (i1112 & 7168)).then(lazyGridState.getItemAnimator$foundation_release().getModifier()), lazyGridState, orientation7, z3, z11, flingBehavior2, lazyGridState.getInternalInteractionSource(), null, composerStartRestartGroup, (i25 & 112) | ((i25 >> 12) & 7168) | (i25 & 57344) | (458752 & i1112), 64), lazyGridState.getPrefetchState(), function2RememberLazyGridMeasurePolicy6, composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier9;
                        paddingValues3 = paddingValuesM995PaddingValues0680j_4;
                        flingBehavior3 = flingBehavior2;
                        z5 = z11;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i15 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier2;
                            }
                            if (i16 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            } else {
                                paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i5 != 0) {
                                z4 = false;
                            } else {
                                z4 = z;
                            }
                            if ((i3 & 64) != 0) {
                                i4 &= -3670017;
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            i13 = i4;
                        } else {
                            if (i15 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier2;
                            }
                            if (i16 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            } else {
                                paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i5 != 0) {
                                z4 = false;
                            } else {
                                z4 = z;
                            }
                            if ((i3 & 64) != 0) {
                                i4 &= -3670017;
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            i13 = i4;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-649686062, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:77)");
                        }
                        int i1115 = i13 >> 3;
                        int i1116 = i1115 & 14;
                        Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda7 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(lazyGridState, function1, composerStartRestartGroup, ((i11 << 3) & 112) | i1116);
                        int i1117 = i13 >> 9;
                        LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState7 = LazySemanticsKt.rememberLazyGridSemanticState(lazyGridState, z4, composerStartRestartGroup, (i1117 & 112) | i1116);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller7 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                            composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller7);
                            objRememberedValue = compositionScopedCoroutineScopeCanceller7;
                        }
                        int i26 = i13;
                        boolean z12 = z4;
                        Modifier modifier10 = companion;
                        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy7 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda7, lazyGridState, lazyGridSlotsProvider, paddingValuesM995PaddingValues0680j_4, z4, z2, horizontal, vertical, ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope(), (GraphicsContext) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext()), composerStartRestartGroup, (29360128 & i1115) | (524272 & i13) | (i1117 & 3670016));
                        if (z2) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Horizontal;
                        }
                        Orientation orientation8 = orientation;
                        composer2 = composerStartRestartGroup;
                        LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda7, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier10.then(lazyGridState.getRemeasurementModifier()).then(lazyGridState.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda7, lazyLayoutSemanticStateRememberLazyGridSemanticState7, orientation8, z3, z12, composerStartRestartGroup, (i1117 & 57344) | ((i26 << 3) & 458752)), LazyGridBeyondBoundsModifierKt.rememberLazyGridBeyondBoundsState(lazyGridState, composerStartRestartGroup, i1116), lazyGridState.getBeyondBoundsInfo(), z12, (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation8, z3, composerStartRestartGroup, (i1115 & 3670016) | (MutableVector.$stable << 6) | (i1115 & 7168)).then(lazyGridState.getItemAnimator$foundation_release().getModifier()), lazyGridState, orientation8, z3, z12, flingBehavior2, lazyGridState.getInternalInteractionSource(), null, composerStartRestartGroup, (i26 & 112) | ((i26 >> 12) & 7168) | (i26 & 57344) | (458752 & i1115), 64), lazyGridState.getPrefetchState(), function2RememberLazyGridMeasurePolicy7, composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier10;
                        paddingValues3 = paddingValuesM995PaddingValues0680j_4;
                        flingBehavior3 = flingBehavior2;
                        z5 = z12;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt.LazyGrid.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i27) {
                                LazyGridKt.LazyGrid(modifier3, lazyGridState, lazyGridSlotsProvider, paddingValues3, z5, z2, flingBehavior3, z3, vertical, horizontal, function1, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                            }
                        });
                    }
                }
                i4 |= 12582912;
                if ((i3 & 256) != 0) {
                    if ((i & 100663296) == 0) {
                        if (composerStartRestartGroup.changed(vertical)) {
                            i9 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        } else {
                            i9 = 33554432;
                        }
                        i4 |= i9;
                    }
                    if ((i3 & 512) != 0) {
                        if ((i & 805306368) == 0) {
                            if (composerStartRestartGroup.changed(horizontal)) {
                                i10 = 536870912;
                            } else {
                                i10 = 268435456;
                            }
                            i4 |= i10;
                        }
                        if ((i3 & 1024) != 0) {
                            i11 = i2 | 6;
                        } else if ((i2 & 6) == 0) {
                            if (composerStartRestartGroup.changedInstance(function1)) {
                                i12 = 4;
                            } else {
                                i12 = 2;
                            }
                            i11 = i2 | i12;
                        } else {
                            i11 = i2;
                        }
                        if ((i4 & 306783379) == 306783378) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if (i15 != 0) {
                                    companion = Modifier.INSTANCE;
                                } else {
                                    companion = modifier2;
                                }
                                if (i16 != 0) {
                                    paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                                } else {
                                    paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                                }
                                if (i5 != 0) {
                                    z4 = false;
                                } else {
                                    z4 = z;
                                }
                                if ((i3 & 64) != 0) {
                                    i4 &= -3670017;
                                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                } else {
                                    flingBehavior2 = flingBehavior;
                                }
                                i13 = i4;
                            } else {
                                if (i15 != 0) {
                                    companion = Modifier.INSTANCE;
                                } else {
                                    companion = modifier2;
                                }
                                if (i16 != 0) {
                                    paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                                } else {
                                    paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                                }
                                if (i5 != 0) {
                                    z4 = false;
                                } else {
                                    z4 = z;
                                }
                                if ((i3 & 64) != 0) {
                                    i4 &= -3670017;
                                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                } else {
                                    flingBehavior2 = flingBehavior;
                                }
                                i13 = i4;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-649686062, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:77)");
                            }
                            int i1118 = i13 >> 3;
                            int i1119 = i1118 & 14;
                            Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda8 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(lazyGridState, function1, composerStartRestartGroup, ((i11 << 3) & 112) | i1119);
                            int i11110 = i13 >> 9;
                            LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState8 = LazySemanticsKt.rememberLazyGridSemanticState(lazyGridState, z4, composerStartRestartGroup, (i11110 & 112) | i1119);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller8 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                                composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller8);
                                objRememberedValue = compositionScopedCoroutineScopeCanceller8;
                            }
                            int i27 = i13;
                            boolean z13 = z4;
                            Modifier modifier11 = companion;
                            Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy8 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda8, lazyGridState, lazyGridSlotsProvider, paddingValuesM995PaddingValues0680j_4, z4, z2, horizontal, vertical, ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope(), (GraphicsContext) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext()), composerStartRestartGroup, (29360128 & i1118) | (524272 & i13) | (i11110 & 3670016));
                            if (z2) {
                                orientation = Orientation.Vertical;
                            } else {
                                orientation = Orientation.Horizontal;
                            }
                            Orientation orientation9 = orientation;
                            composer2 = composerStartRestartGroup;
                            LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda8, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier11.then(lazyGridState.getRemeasurementModifier()).then(lazyGridState.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda8, lazyLayoutSemanticStateRememberLazyGridSemanticState8, orientation9, z3, z13, composerStartRestartGroup, (i11110 & 57344) | ((i27 << 3) & 458752)), LazyGridBeyondBoundsModifierKt.rememberLazyGridBeyondBoundsState(lazyGridState, composerStartRestartGroup, i1119), lazyGridState.getBeyondBoundsInfo(), z13, (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation9, z3, composerStartRestartGroup, (i1118 & 3670016) | (MutableVector.$stable << 6) | (i1118 & 7168)).then(lazyGridState.getItemAnimator$foundation_release().getModifier()), lazyGridState, orientation9, z3, z13, flingBehavior2, lazyGridState.getInternalInteractionSource(), null, composerStartRestartGroup, (i27 & 112) | ((i27 >> 12) & 7168) | (i27 & 57344) | (458752 & i1118), 64), lazyGridState.getPrefetchState(), function2RememberLazyGridMeasurePolicy8, composer2, 0, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier11;
                            paddingValues3 = paddingValuesM995PaddingValues0680j_4;
                            flingBehavior3 = flingBehavior2;
                            z5 = z13;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if (i15 != 0) {
                                    companion = Modifier.INSTANCE;
                                } else {
                                    companion = modifier2;
                                }
                                if (i16 != 0) {
                                    paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                                } else {
                                    paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                                }
                                if (i5 != 0) {
                                    z4 = false;
                                } else {
                                    z4 = z;
                                }
                                if ((i3 & 64) != 0) {
                                    i4 &= -3670017;
                                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                } else {
                                    flingBehavior2 = flingBehavior;
                                }
                                i13 = i4;
                            } else {
                                if (i15 != 0) {
                                    companion = Modifier.INSTANCE;
                                } else {
                                    companion = modifier2;
                                }
                                if (i16 != 0) {
                                    paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                                } else {
                                    paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                                }
                                if (i5 != 0) {
                                    z4 = false;
                                } else {
                                    z4 = z;
                                }
                                if ((i3 & 64) != 0) {
                                    i4 &= -3670017;
                                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                } else {
                                    flingBehavior2 = flingBehavior;
                                }
                                i13 = i4;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-649686062, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:77)");
                            }
                            int i11111 = i13 >> 3;
                            int i11112 = i11111 & 14;
                            Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda9 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(lazyGridState, function1, composerStartRestartGroup, ((i11 << 3) & 112) | i11112);
                            int i11113 = i13 >> 9;
                            LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState9 = LazySemanticsKt.rememberLazyGridSemanticState(lazyGridState, z4, composerStartRestartGroup, (i11113 & 112) | i11112);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller9 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                                composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller9);
                                objRememberedValue = compositionScopedCoroutineScopeCanceller9;
                            }
                            int i28 = i13;
                            boolean z14 = z4;
                            Modifier modifier12 = companion;
                            Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy9 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda9, lazyGridState, lazyGridSlotsProvider, paddingValuesM995PaddingValues0680j_4, z4, z2, horizontal, vertical, ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope(), (GraphicsContext) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext()), composerStartRestartGroup, (29360128 & i11111) | (524272 & i13) | (i11113 & 3670016));
                            if (z2) {
                                orientation = Orientation.Vertical;
                            } else {
                                orientation = Orientation.Horizontal;
                            }
                            Orientation orientation10 = orientation;
                            composer2 = composerStartRestartGroup;
                            LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda9, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier12.then(lazyGridState.getRemeasurementModifier()).then(lazyGridState.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda9, lazyLayoutSemanticStateRememberLazyGridSemanticState9, orientation10, z3, z14, composerStartRestartGroup, (i11113 & 57344) | ((i28 << 3) & 458752)), LazyGridBeyondBoundsModifierKt.rememberLazyGridBeyondBoundsState(lazyGridState, composerStartRestartGroup, i11112), lazyGridState.getBeyondBoundsInfo(), z14, (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation10, z3, composerStartRestartGroup, (i11111 & 3670016) | (MutableVector.$stable << 6) | (i11111 & 7168)).then(lazyGridState.getItemAnimator$foundation_release().getModifier()), lazyGridState, orientation10, z3, z14, flingBehavior2, lazyGridState.getInternalInteractionSource(), null, composerStartRestartGroup, (i28 & 112) | ((i28 >> 12) & 7168) | (i28 & 57344) | (458752 & i11111), 64), lazyGridState.getPrefetchState(), function2RememberLazyGridMeasurePolicy9, composer2, 0, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier12;
                            paddingValues3 = paddingValuesM995PaddingValues0680j_4;
                            flingBehavior3 = flingBehavior2;
                            z5 = z14;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt.LazyGrid.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i29) {
                                    LazyGridKt.LazyGrid(modifier3, lazyGridState, lazyGridSlotsProvider, paddingValues3, z5, z2, flingBehavior3, z3, vertical, horizontal, function1, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                                }
                            });
                        }
                    }
                    i4 |= 805306368;
                    if ((i3 & 1024) != 0) {
                        i11 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        if (composerStartRestartGroup.changedInstance(function1)) {
                            i12 = 4;
                        } else {
                            i12 = 2;
                        }
                        i11 = i2 | i12;
                    } else {
                        i11 = i2;
                    }
                    if ((i4 & 306783379) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i15 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier2;
                            }
                            if (i16 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            } else {
                                paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i5 != 0) {
                                z4 = false;
                            } else {
                                z4 = z;
                            }
                            if ((i3 & 64) != 0) {
                                i4 &= -3670017;
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            i13 = i4;
                        } else {
                            if (i15 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier2;
                            }
                            if (i16 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            } else {
                                paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i5 != 0) {
                                z4 = false;
                            } else {
                                z4 = z;
                            }
                            if ((i3 & 64) != 0) {
                                i4 &= -3670017;
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            i13 = i4;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-649686062, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:77)");
                        }
                        int i11114 = i13 >> 3;
                        int i11115 = i11114 & 14;
                        Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda10 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(lazyGridState, function1, composerStartRestartGroup, ((i11 << 3) & 112) | i11115);
                        int i11116 = i13 >> 9;
                        LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState10 = LazySemanticsKt.rememberLazyGridSemanticState(lazyGridState, z4, composerStartRestartGroup, (i11116 & 112) | i11115);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller10 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                            composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller10);
                            objRememberedValue = compositionScopedCoroutineScopeCanceller10;
                        }
                        int i29 = i13;
                        boolean z15 = z4;
                        Modifier modifier13 = companion;
                        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy10 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda10, lazyGridState, lazyGridSlotsProvider, paddingValuesM995PaddingValues0680j_4, z4, z2, horizontal, vertical, ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope(), (GraphicsContext) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext()), composerStartRestartGroup, (29360128 & i11114) | (524272 & i13) | (i11116 & 3670016));
                        if (z2) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Horizontal;
                        }
                        Orientation orientation11 = orientation;
                        composer2 = composerStartRestartGroup;
                        LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda10, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier13.then(lazyGridState.getRemeasurementModifier()).then(lazyGridState.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda10, lazyLayoutSemanticStateRememberLazyGridSemanticState10, orientation11, z3, z15, composerStartRestartGroup, (i11116 & 57344) | ((i29 << 3) & 458752)), LazyGridBeyondBoundsModifierKt.rememberLazyGridBeyondBoundsState(lazyGridState, composerStartRestartGroup, i11115), lazyGridState.getBeyondBoundsInfo(), z15, (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation11, z3, composerStartRestartGroup, (i11114 & 3670016) | (MutableVector.$stable << 6) | (i11114 & 7168)).then(lazyGridState.getItemAnimator$foundation_release().getModifier()), lazyGridState, orientation11, z3, z15, flingBehavior2, lazyGridState.getInternalInteractionSource(), null, composerStartRestartGroup, (i29 & 112) | ((i29 >> 12) & 7168) | (i29 & 57344) | (458752 & i11114), 64), lazyGridState.getPrefetchState(), function2RememberLazyGridMeasurePolicy10, composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier13;
                        paddingValues3 = paddingValuesM995PaddingValues0680j_4;
                        flingBehavior3 = flingBehavior2;
                        z5 = z15;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i15 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier2;
                            }
                            if (i16 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            } else {
                                paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i5 != 0) {
                                z4 = false;
                            } else {
                                z4 = z;
                            }
                            if ((i3 & 64) != 0) {
                                i4 &= -3670017;
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            i13 = i4;
                        } else {
                            if (i15 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier2;
                            }
                            if (i16 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            } else {
                                paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i5 != 0) {
                                z4 = false;
                            } else {
                                z4 = z;
                            }
                            if ((i3 & 64) != 0) {
                                i4 &= -3670017;
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            i13 = i4;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-649686062, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:77)");
                        }
                        int i11117 = i13 >> 3;
                        int i11118 = i11117 & 14;
                        Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda11 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(lazyGridState, function1, composerStartRestartGroup, ((i11 << 3) & 112) | i11118);
                        int i11119 = i13 >> 9;
                        LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState11 = LazySemanticsKt.rememberLazyGridSemanticState(lazyGridState, z4, composerStartRestartGroup, (i11119 & 112) | i11118);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller11 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                            composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller11);
                            objRememberedValue = compositionScopedCoroutineScopeCanceller11;
                        }
                        int i210 = i13;
                        boolean z16 = z4;
                        Modifier modifier14 = companion;
                        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy11 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda11, lazyGridState, lazyGridSlotsProvider, paddingValuesM995PaddingValues0680j_4, z4, z2, horizontal, vertical, ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope(), (GraphicsContext) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext()), composerStartRestartGroup, (29360128 & i11117) | (524272 & i13) | (i11119 & 3670016));
                        if (z2) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Horizontal;
                        }
                        Orientation orientation12 = orientation;
                        composer2 = composerStartRestartGroup;
                        LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda11, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier14.then(lazyGridState.getRemeasurementModifier()).then(lazyGridState.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda11, lazyLayoutSemanticStateRememberLazyGridSemanticState11, orientation12, z3, z16, composerStartRestartGroup, (i11119 & 57344) | ((i210 << 3) & 458752)), LazyGridBeyondBoundsModifierKt.rememberLazyGridBeyondBoundsState(lazyGridState, composerStartRestartGroup, i11118), lazyGridState.getBeyondBoundsInfo(), z16, (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation12, z3, composerStartRestartGroup, (i11117 & 3670016) | (MutableVector.$stable << 6) | (i11117 & 7168)).then(lazyGridState.getItemAnimator$foundation_release().getModifier()), lazyGridState, orientation12, z3, z16, flingBehavior2, lazyGridState.getInternalInteractionSource(), null, composerStartRestartGroup, (i210 & 112) | ((i210 >> 12) & 7168) | (i210 & 57344) | (458752 & i11117), 64), lazyGridState.getPrefetchState(), function2RememberLazyGridMeasurePolicy11, composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier14;
                        paddingValues3 = paddingValuesM995PaddingValues0680j_4;
                        flingBehavior3 = flingBehavior2;
                        z5 = z16;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt.LazyGrid.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i211) {
                                LazyGridKt.LazyGrid(modifier3, lazyGridState, lazyGridSlotsProvider, paddingValues3, z5, z2, flingBehavior3, z3, vertical, horizontal, function1, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                            }
                        });
                    }
                }
                i4 |= 100663296;
                if ((i3 & 512) != 0) {
                    if ((i & 805306368) == 0) {
                        if (composerStartRestartGroup.changed(horizontal)) {
                            i10 = 536870912;
                        } else {
                            i10 = 268435456;
                        }
                        i4 |= i10;
                    }
                    if ((i3 & 1024) != 0) {
                        i11 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        if (composerStartRestartGroup.changedInstance(function1)) {
                            i12 = 4;
                        } else {
                            i12 = 2;
                        }
                        i11 = i2 | i12;
                    } else {
                        i11 = i2;
                    }
                    if ((i4 & 306783379) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i15 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier2;
                            }
                            if (i16 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            } else {
                                paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i5 != 0) {
                                z4 = false;
                            } else {
                                z4 = z;
                            }
                            if ((i3 & 64) != 0) {
                                i4 &= -3670017;
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            i13 = i4;
                        } else {
                            if (i15 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier2;
                            }
                            if (i16 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            } else {
                                paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i5 != 0) {
                                z4 = false;
                            } else {
                                z4 = z;
                            }
                            if ((i3 & 64) != 0) {
                                i4 &= -3670017;
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            i13 = i4;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-649686062, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:77)");
                        }
                        int i111110 = i13 >> 3;
                        int i111111 = i111110 & 14;
                        Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda12 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(lazyGridState, function1, composerStartRestartGroup, ((i11 << 3) & 112) | i111111);
                        int i111112 = i13 >> 9;
                        LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState12 = LazySemanticsKt.rememberLazyGridSemanticState(lazyGridState, z4, composerStartRestartGroup, (i111112 & 112) | i111111);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller12 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                            composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller12);
                            objRememberedValue = compositionScopedCoroutineScopeCanceller12;
                        }
                        int i211 = i13;
                        boolean z17 = z4;
                        Modifier modifier15 = companion;
                        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy12 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda12, lazyGridState, lazyGridSlotsProvider, paddingValuesM995PaddingValues0680j_4, z4, z2, horizontal, vertical, ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope(), (GraphicsContext) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext()), composerStartRestartGroup, (29360128 & i111110) | (524272 & i13) | (i111112 & 3670016));
                        if (z2) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Horizontal;
                        }
                        Orientation orientation13 = orientation;
                        composer2 = composerStartRestartGroup;
                        LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda12, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier15.then(lazyGridState.getRemeasurementModifier()).then(lazyGridState.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda12, lazyLayoutSemanticStateRememberLazyGridSemanticState12, orientation13, z3, z17, composerStartRestartGroup, (i111112 & 57344) | ((i211 << 3) & 458752)), LazyGridBeyondBoundsModifierKt.rememberLazyGridBeyondBoundsState(lazyGridState, composerStartRestartGroup, i111111), lazyGridState.getBeyondBoundsInfo(), z17, (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation13, z3, composerStartRestartGroup, (i111110 & 3670016) | (MutableVector.$stable << 6) | (i111110 & 7168)).then(lazyGridState.getItemAnimator$foundation_release().getModifier()), lazyGridState, orientation13, z3, z17, flingBehavior2, lazyGridState.getInternalInteractionSource(), null, composerStartRestartGroup, (i211 & 112) | ((i211 >> 12) & 7168) | (i211 & 57344) | (458752 & i111110), 64), lazyGridState.getPrefetchState(), function2RememberLazyGridMeasurePolicy12, composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier15;
                        paddingValues3 = paddingValuesM995PaddingValues0680j_4;
                        flingBehavior3 = flingBehavior2;
                        z5 = z17;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i15 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier2;
                            }
                            if (i16 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            } else {
                                paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i5 != 0) {
                                z4 = false;
                            } else {
                                z4 = z;
                            }
                            if ((i3 & 64) != 0) {
                                i4 &= -3670017;
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            i13 = i4;
                        } else {
                            if (i15 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier2;
                            }
                            if (i16 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            } else {
                                paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i5 != 0) {
                                z4 = false;
                            } else {
                                z4 = z;
                            }
                            if ((i3 & 64) != 0) {
                                i4 &= -3670017;
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            i13 = i4;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-649686062, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:77)");
                        }
                        int i111113 = i13 >> 3;
                        int i111114 = i111113 & 14;
                        Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda13 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(lazyGridState, function1, composerStartRestartGroup, ((i11 << 3) & 112) | i111114);
                        int i111115 = i13 >> 9;
                        LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState13 = LazySemanticsKt.rememberLazyGridSemanticState(lazyGridState, z4, composerStartRestartGroup, (i111115 & 112) | i111114);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller13 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                            composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller13);
                            objRememberedValue = compositionScopedCoroutineScopeCanceller13;
                        }
                        int i212 = i13;
                        boolean z18 = z4;
                        Modifier modifier16 = companion;
                        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy13 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda13, lazyGridState, lazyGridSlotsProvider, paddingValuesM995PaddingValues0680j_4, z4, z2, horizontal, vertical, ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope(), (GraphicsContext) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext()), composerStartRestartGroup, (29360128 & i111113) | (524272 & i13) | (i111115 & 3670016));
                        if (z2) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Horizontal;
                        }
                        Orientation orientation14 = orientation;
                        composer2 = composerStartRestartGroup;
                        LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda13, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier16.then(lazyGridState.getRemeasurementModifier()).then(lazyGridState.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda13, lazyLayoutSemanticStateRememberLazyGridSemanticState13, orientation14, z3, z18, composerStartRestartGroup, (i111115 & 57344) | ((i212 << 3) & 458752)), LazyGridBeyondBoundsModifierKt.rememberLazyGridBeyondBoundsState(lazyGridState, composerStartRestartGroup, i111114), lazyGridState.getBeyondBoundsInfo(), z18, (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation14, z3, composerStartRestartGroup, (i111113 & 3670016) | (MutableVector.$stable << 6) | (i111113 & 7168)).then(lazyGridState.getItemAnimator$foundation_release().getModifier()), lazyGridState, orientation14, z3, z18, flingBehavior2, lazyGridState.getInternalInteractionSource(), null, composerStartRestartGroup, (i212 & 112) | ((i212 >> 12) & 7168) | (i212 & 57344) | (458752 & i111113), 64), lazyGridState.getPrefetchState(), function2RememberLazyGridMeasurePolicy13, composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier16;
                        paddingValues3 = paddingValuesM995PaddingValues0680j_4;
                        flingBehavior3 = flingBehavior2;
                        z5 = z18;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt.LazyGrid.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i213) {
                                LazyGridKt.LazyGrid(modifier3, lazyGridState, lazyGridSlotsProvider, paddingValues3, z5, z2, flingBehavior3, z3, vertical, horizontal, function1, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                            }
                        });
                    }
                }
                i4 |= 805306368;
                if ((i3 & 1024) != 0) {
                    i11 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i12 = 4;
                    } else {
                        i12 = 2;
                    }
                    i11 = i2 | i12;
                } else {
                    i11 = i2;
                }
                if ((i4 & 306783379) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i15 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier2;
                        }
                        if (i16 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        } else {
                            paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i5 != 0) {
                            z4 = false;
                        } else {
                            z4 = z;
                        }
                        if ((i3 & 64) != 0) {
                            i4 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        i13 = i4;
                    } else {
                        if (i15 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier2;
                        }
                        if (i16 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        } else {
                            paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i5 != 0) {
                            z4 = false;
                        } else {
                            z4 = z;
                        }
                        if ((i3 & 64) != 0) {
                            i4 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        i13 = i4;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-649686062, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:77)");
                    }
                    int i111116 = i13 >> 3;
                    int i111117 = i111116 & 14;
                    Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda14 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(lazyGridState, function1, composerStartRestartGroup, ((i11 << 3) & 112) | i111117);
                    int i111118 = i13 >> 9;
                    LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState14 = LazySemanticsKt.rememberLazyGridSemanticState(lazyGridState, z4, composerStartRestartGroup, (i111118 & 112) | i111117);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller14 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                        composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller14);
                        objRememberedValue = compositionScopedCoroutineScopeCanceller14;
                    }
                    int i213 = i13;
                    boolean z19 = z4;
                    Modifier modifier17 = companion;
                    Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy14 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda14, lazyGridState, lazyGridSlotsProvider, paddingValuesM995PaddingValues0680j_4, z4, z2, horizontal, vertical, ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope(), (GraphicsContext) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext()), composerStartRestartGroup, (29360128 & i111116) | (524272 & i13) | (i111118 & 3670016));
                    if (z2) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    Orientation orientation15 = orientation;
                    composer2 = composerStartRestartGroup;
                    LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda14, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier17.then(lazyGridState.getRemeasurementModifier()).then(lazyGridState.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda14, lazyLayoutSemanticStateRememberLazyGridSemanticState14, orientation15, z3, z19, composerStartRestartGroup, (i111118 & 57344) | ((i213 << 3) & 458752)), LazyGridBeyondBoundsModifierKt.rememberLazyGridBeyondBoundsState(lazyGridState, composerStartRestartGroup, i111117), lazyGridState.getBeyondBoundsInfo(), z19, (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation15, z3, composerStartRestartGroup, (i111116 & 3670016) | (MutableVector.$stable << 6) | (i111116 & 7168)).then(lazyGridState.getItemAnimator$foundation_release().getModifier()), lazyGridState, orientation15, z3, z19, flingBehavior2, lazyGridState.getInternalInteractionSource(), null, composerStartRestartGroup, (i213 & 112) | ((i213 >> 12) & 7168) | (i213 & 57344) | (458752 & i111116), 64), lazyGridState.getPrefetchState(), function2RememberLazyGridMeasurePolicy14, composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier17;
                    paddingValues3 = paddingValuesM995PaddingValues0680j_4;
                    flingBehavior3 = flingBehavior2;
                    z5 = z19;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i15 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier2;
                        }
                        if (i16 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        } else {
                            paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i5 != 0) {
                            z4 = false;
                        } else {
                            z4 = z;
                        }
                        if ((i3 & 64) != 0) {
                            i4 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        i13 = i4;
                    } else {
                        if (i15 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier2;
                        }
                        if (i16 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        } else {
                            paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i5 != 0) {
                            z4 = false;
                        } else {
                            z4 = z;
                        }
                        if ((i3 & 64) != 0) {
                            i4 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        i13 = i4;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-649686062, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:77)");
                    }
                    int i111119 = i13 >> 3;
                    int i1111110 = i111119 & 14;
                    Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda15 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(lazyGridState, function1, composerStartRestartGroup, ((i11 << 3) & 112) | i1111110);
                    int i1111111 = i13 >> 9;
                    LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState15 = LazySemanticsKt.rememberLazyGridSemanticState(lazyGridState, z4, composerStartRestartGroup, (i1111111 & 112) | i1111110);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller15 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                        composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller15);
                        objRememberedValue = compositionScopedCoroutineScopeCanceller15;
                    }
                    int i214 = i13;
                    boolean z110 = z4;
                    Modifier modifier18 = companion;
                    Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy15 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda15, lazyGridState, lazyGridSlotsProvider, paddingValuesM995PaddingValues0680j_4, z4, z2, horizontal, vertical, ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope(), (GraphicsContext) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext()), composerStartRestartGroup, (29360128 & i111119) | (524272 & i13) | (i1111111 & 3670016));
                    if (z2) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    Orientation orientation16 = orientation;
                    composer2 = composerStartRestartGroup;
                    LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda15, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier18.then(lazyGridState.getRemeasurementModifier()).then(lazyGridState.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda15, lazyLayoutSemanticStateRememberLazyGridSemanticState15, orientation16, z3, z110, composerStartRestartGroup, (i1111111 & 57344) | ((i214 << 3) & 458752)), LazyGridBeyondBoundsModifierKt.rememberLazyGridBeyondBoundsState(lazyGridState, composerStartRestartGroup, i1111110), lazyGridState.getBeyondBoundsInfo(), z110, (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation16, z3, composerStartRestartGroup, (i111119 & 3670016) | (MutableVector.$stable << 6) | (i111119 & 7168)).then(lazyGridState.getItemAnimator$foundation_release().getModifier()), lazyGridState, orientation16, z3, z110, flingBehavior2, lazyGridState.getInternalInteractionSource(), null, composerStartRestartGroup, (i214 & 112) | ((i214 >> 12) & 7168) | (i214 & 57344) | (458752 & i111119), 64), lazyGridState.getPrefetchState(), function2RememberLazyGridMeasurePolicy15, composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier18;
                    paddingValues3 = paddingValuesM995PaddingValues0680j_4;
                    flingBehavior3 = flingBehavior2;
                    z5 = z110;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt.LazyGrid.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i215) {
                            LazyGridKt.LazyGrid(modifier3, lazyGridState, lazyGridSlotsProvider, paddingValues3, z5, z2, flingBehavior3, z3, vertical, horizontal, function1, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                        }
                    });
                }
            }
            i4 |= 24576;
            if ((i3 & 32) != 0) {
                i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                if (composerStartRestartGroup.changed(z2)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i4 |= i7;
            }
            if ((i & 1572864) != 0) {
                if ((i3 & 64) == 0) {
                    i14 = 524288;
                } else {
                    i14 = 524288;
                }
                i4 |= i14;
            }
            if ((i3 & 128) != 0) {
                if ((i & 12582912) == 0) {
                    if (composerStartRestartGroup.changed(z3)) {
                        i8 = 8388608;
                    } else {
                        i8 = 4194304;
                    }
                    i4 |= i8;
                }
                if ((i3 & 256) != 0) {
                    if ((i & 100663296) == 0) {
                        if (composerStartRestartGroup.changed(vertical)) {
                            i9 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        } else {
                            i9 = 33554432;
                        }
                        i4 |= i9;
                    }
                    if ((i3 & 512) != 0) {
                        if ((i & 805306368) == 0) {
                            if (composerStartRestartGroup.changed(horizontal)) {
                                i10 = 536870912;
                            } else {
                                i10 = 268435456;
                            }
                            i4 |= i10;
                        }
                        if ((i3 & 1024) != 0) {
                            i11 = i2 | 6;
                        } else if ((i2 & 6) == 0) {
                            if (composerStartRestartGroup.changedInstance(function1)) {
                                i12 = 4;
                            } else {
                                i12 = 2;
                            }
                            i11 = i2 | i12;
                        } else {
                            i11 = i2;
                        }
                        if ((i4 & 306783379) == 306783378) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if (i15 != 0) {
                                    companion = Modifier.INSTANCE;
                                } else {
                                    companion = modifier2;
                                }
                                if (i16 != 0) {
                                    paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                                } else {
                                    paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                                }
                                if (i5 != 0) {
                                    z4 = false;
                                } else {
                                    z4 = z;
                                }
                                if ((i3 & 64) != 0) {
                                    i4 &= -3670017;
                                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                } else {
                                    flingBehavior2 = flingBehavior;
                                }
                                i13 = i4;
                            } else {
                                if (i15 != 0) {
                                    companion = Modifier.INSTANCE;
                                } else {
                                    companion = modifier2;
                                }
                                if (i16 != 0) {
                                    paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                                } else {
                                    paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                                }
                                if (i5 != 0) {
                                    z4 = false;
                                } else {
                                    z4 = z;
                                }
                                if ((i3 & 64) != 0) {
                                    i4 &= -3670017;
                                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                } else {
                                    flingBehavior2 = flingBehavior;
                                }
                                i13 = i4;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-649686062, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:77)");
                            }
                            int i1111112 = i13 >> 3;
                            int i1111113 = i1111112 & 14;
                            Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda16 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(lazyGridState, function1, composerStartRestartGroup, ((i11 << 3) & 112) | i1111113);
                            int i1111114 = i13 >> 9;
                            LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState16 = LazySemanticsKt.rememberLazyGridSemanticState(lazyGridState, z4, composerStartRestartGroup, (i1111114 & 112) | i1111113);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller16 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                                composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller16);
                                objRememberedValue = compositionScopedCoroutineScopeCanceller16;
                            }
                            int i215 = i13;
                            boolean z111 = z4;
                            Modifier modifier19 = companion;
                            Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy16 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda16, lazyGridState, lazyGridSlotsProvider, paddingValuesM995PaddingValues0680j_4, z4, z2, horizontal, vertical, ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope(), (GraphicsContext) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext()), composerStartRestartGroup, (29360128 & i1111112) | (524272 & i13) | (i1111114 & 3670016));
                            if (z2) {
                                orientation = Orientation.Vertical;
                            } else {
                                orientation = Orientation.Horizontal;
                            }
                            Orientation orientation17 = orientation;
                            composer2 = composerStartRestartGroup;
                            LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda16, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier19.then(lazyGridState.getRemeasurementModifier()).then(lazyGridState.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda16, lazyLayoutSemanticStateRememberLazyGridSemanticState16, orientation17, z3, z111, composerStartRestartGroup, (i1111114 & 57344) | ((i215 << 3) & 458752)), LazyGridBeyondBoundsModifierKt.rememberLazyGridBeyondBoundsState(lazyGridState, composerStartRestartGroup, i1111113), lazyGridState.getBeyondBoundsInfo(), z111, (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation17, z3, composerStartRestartGroup, (i1111112 & 3670016) | (MutableVector.$stable << 6) | (i1111112 & 7168)).then(lazyGridState.getItemAnimator$foundation_release().getModifier()), lazyGridState, orientation17, z3, z111, flingBehavior2, lazyGridState.getInternalInteractionSource(), null, composerStartRestartGroup, (i215 & 112) | ((i215 >> 12) & 7168) | (i215 & 57344) | (458752 & i1111112), 64), lazyGridState.getPrefetchState(), function2RememberLazyGridMeasurePolicy16, composer2, 0, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier19;
                            paddingValues3 = paddingValuesM995PaddingValues0680j_4;
                            flingBehavior3 = flingBehavior2;
                            z5 = z111;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if (i15 != 0) {
                                    companion = Modifier.INSTANCE;
                                } else {
                                    companion = modifier2;
                                }
                                if (i16 != 0) {
                                    paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                                } else {
                                    paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                                }
                                if (i5 != 0) {
                                    z4 = false;
                                } else {
                                    z4 = z;
                                }
                                if ((i3 & 64) != 0) {
                                    i4 &= -3670017;
                                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                } else {
                                    flingBehavior2 = flingBehavior;
                                }
                                i13 = i4;
                            } else {
                                if (i15 != 0) {
                                    companion = Modifier.INSTANCE;
                                } else {
                                    companion = modifier2;
                                }
                                if (i16 != 0) {
                                    paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                                } else {
                                    paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                                }
                                if (i5 != 0) {
                                    z4 = false;
                                } else {
                                    z4 = z;
                                }
                                if ((i3 & 64) != 0) {
                                    i4 &= -3670017;
                                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                } else {
                                    flingBehavior2 = flingBehavior;
                                }
                                i13 = i4;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-649686062, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:77)");
                            }
                            int i1111115 = i13 >> 3;
                            int i1111116 = i1111115 & 14;
                            Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda17 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(lazyGridState, function1, composerStartRestartGroup, ((i11 << 3) & 112) | i1111116);
                            int i1111117 = i13 >> 9;
                            LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState17 = LazySemanticsKt.rememberLazyGridSemanticState(lazyGridState, z4, composerStartRestartGroup, (i1111117 & 112) | i1111116);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller17 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                                composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller17);
                                objRememberedValue = compositionScopedCoroutineScopeCanceller17;
                            }
                            int i216 = i13;
                            boolean z112 = z4;
                            Modifier modifier110 = companion;
                            Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy17 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda17, lazyGridState, lazyGridSlotsProvider, paddingValuesM995PaddingValues0680j_4, z4, z2, horizontal, vertical, ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope(), (GraphicsContext) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext()), composerStartRestartGroup, (29360128 & i1111115) | (524272 & i13) | (i1111117 & 3670016));
                            if (z2) {
                                orientation = Orientation.Vertical;
                            } else {
                                orientation = Orientation.Horizontal;
                            }
                            Orientation orientation18 = orientation;
                            composer2 = composerStartRestartGroup;
                            LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda17, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier110.then(lazyGridState.getRemeasurementModifier()).then(lazyGridState.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda17, lazyLayoutSemanticStateRememberLazyGridSemanticState17, orientation18, z3, z112, composerStartRestartGroup, (i1111117 & 57344) | ((i216 << 3) & 458752)), LazyGridBeyondBoundsModifierKt.rememberLazyGridBeyondBoundsState(lazyGridState, composerStartRestartGroup, i1111116), lazyGridState.getBeyondBoundsInfo(), z112, (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation18, z3, composerStartRestartGroup, (i1111115 & 3670016) | (MutableVector.$stable << 6) | (i1111115 & 7168)).then(lazyGridState.getItemAnimator$foundation_release().getModifier()), lazyGridState, orientation18, z3, z112, flingBehavior2, lazyGridState.getInternalInteractionSource(), null, composerStartRestartGroup, (i216 & 112) | ((i216 >> 12) & 7168) | (i216 & 57344) | (458752 & i1111115), 64), lazyGridState.getPrefetchState(), function2RememberLazyGridMeasurePolicy17, composer2, 0, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier110;
                            paddingValues3 = paddingValuesM995PaddingValues0680j_4;
                            flingBehavior3 = flingBehavior2;
                            z5 = z112;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt.LazyGrid.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i217) {
                                    LazyGridKt.LazyGrid(modifier3, lazyGridState, lazyGridSlotsProvider, paddingValues3, z5, z2, flingBehavior3, z3, vertical, horizontal, function1, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                                }
                            });
                        }
                    }
                    i4 |= 805306368;
                    if ((i3 & 1024) != 0) {
                        i11 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        if (composerStartRestartGroup.changedInstance(function1)) {
                            i12 = 4;
                        } else {
                            i12 = 2;
                        }
                        i11 = i2 | i12;
                    } else {
                        i11 = i2;
                    }
                    if ((i4 & 306783379) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i15 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier2;
                            }
                            if (i16 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            } else {
                                paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i5 != 0) {
                                z4 = false;
                            } else {
                                z4 = z;
                            }
                            if ((i3 & 64) != 0) {
                                i4 &= -3670017;
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            i13 = i4;
                        } else {
                            if (i15 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier2;
                            }
                            if (i16 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            } else {
                                paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i5 != 0) {
                                z4 = false;
                            } else {
                                z4 = z;
                            }
                            if ((i3 & 64) != 0) {
                                i4 &= -3670017;
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            i13 = i4;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-649686062, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:77)");
                        }
                        int i1111118 = i13 >> 3;
                        int i1111119 = i1111118 & 14;
                        Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda18 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(lazyGridState, function1, composerStartRestartGroup, ((i11 << 3) & 112) | i1111119);
                        int i11111110 = i13 >> 9;
                        LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState18 = LazySemanticsKt.rememberLazyGridSemanticState(lazyGridState, z4, composerStartRestartGroup, (i11111110 & 112) | i1111119);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller18 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                            composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller18);
                            objRememberedValue = compositionScopedCoroutineScopeCanceller18;
                        }
                        int i217 = i13;
                        boolean z113 = z4;
                        Modifier modifier111 = companion;
                        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy18 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda18, lazyGridState, lazyGridSlotsProvider, paddingValuesM995PaddingValues0680j_4, z4, z2, horizontal, vertical, ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope(), (GraphicsContext) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext()), composerStartRestartGroup, (29360128 & i1111118) | (524272 & i13) | (i11111110 & 3670016));
                        if (z2) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Horizontal;
                        }
                        Orientation orientation19 = orientation;
                        composer2 = composerStartRestartGroup;
                        LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda18, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier111.then(lazyGridState.getRemeasurementModifier()).then(lazyGridState.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda18, lazyLayoutSemanticStateRememberLazyGridSemanticState18, orientation19, z3, z113, composerStartRestartGroup, (i11111110 & 57344) | ((i217 << 3) & 458752)), LazyGridBeyondBoundsModifierKt.rememberLazyGridBeyondBoundsState(lazyGridState, composerStartRestartGroup, i1111119), lazyGridState.getBeyondBoundsInfo(), z113, (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation19, z3, composerStartRestartGroup, (i1111118 & 3670016) | (MutableVector.$stable << 6) | (i1111118 & 7168)).then(lazyGridState.getItemAnimator$foundation_release().getModifier()), lazyGridState, orientation19, z3, z113, flingBehavior2, lazyGridState.getInternalInteractionSource(), null, composerStartRestartGroup, (i217 & 112) | ((i217 >> 12) & 7168) | (i217 & 57344) | (458752 & i1111118), 64), lazyGridState.getPrefetchState(), function2RememberLazyGridMeasurePolicy18, composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier111;
                        paddingValues3 = paddingValuesM995PaddingValues0680j_4;
                        flingBehavior3 = flingBehavior2;
                        z5 = z113;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i15 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier2;
                            }
                            if (i16 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            } else {
                                paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i5 != 0) {
                                z4 = false;
                            } else {
                                z4 = z;
                            }
                            if ((i3 & 64) != 0) {
                                i4 &= -3670017;
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            i13 = i4;
                        } else {
                            if (i15 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier2;
                            }
                            if (i16 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            } else {
                                paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i5 != 0) {
                                z4 = false;
                            } else {
                                z4 = z;
                            }
                            if ((i3 & 64) != 0) {
                                i4 &= -3670017;
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            i13 = i4;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-649686062, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:77)");
                        }
                        int i11111111 = i13 >> 3;
                        int i11111112 = i11111111 & 14;
                        Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda19 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(lazyGridState, function1, composerStartRestartGroup, ((i11 << 3) & 112) | i11111112);
                        int i11111113 = i13 >> 9;
                        LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState19 = LazySemanticsKt.rememberLazyGridSemanticState(lazyGridState, z4, composerStartRestartGroup, (i11111113 & 112) | i11111112);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller19 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                            composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller19);
                            objRememberedValue = compositionScopedCoroutineScopeCanceller19;
                        }
                        int i218 = i13;
                        boolean z114 = z4;
                        Modifier modifier112 = companion;
                        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy19 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda19, lazyGridState, lazyGridSlotsProvider, paddingValuesM995PaddingValues0680j_4, z4, z2, horizontal, vertical, ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope(), (GraphicsContext) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext()), composerStartRestartGroup, (29360128 & i11111111) | (524272 & i13) | (i11111113 & 3670016));
                        if (z2) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Horizontal;
                        }
                        Orientation orientation110 = orientation;
                        composer2 = composerStartRestartGroup;
                        LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda19, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier112.then(lazyGridState.getRemeasurementModifier()).then(lazyGridState.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda19, lazyLayoutSemanticStateRememberLazyGridSemanticState19, orientation110, z3, z114, composerStartRestartGroup, (i11111113 & 57344) | ((i218 << 3) & 458752)), LazyGridBeyondBoundsModifierKt.rememberLazyGridBeyondBoundsState(lazyGridState, composerStartRestartGroup, i11111112), lazyGridState.getBeyondBoundsInfo(), z114, (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation110, z3, composerStartRestartGroup, (i11111111 & 3670016) | (MutableVector.$stable << 6) | (i11111111 & 7168)).then(lazyGridState.getItemAnimator$foundation_release().getModifier()), lazyGridState, orientation110, z3, z114, flingBehavior2, lazyGridState.getInternalInteractionSource(), null, composerStartRestartGroup, (i218 & 112) | ((i218 >> 12) & 7168) | (i218 & 57344) | (458752 & i11111111), 64), lazyGridState.getPrefetchState(), function2RememberLazyGridMeasurePolicy19, composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier112;
                        paddingValues3 = paddingValuesM995PaddingValues0680j_4;
                        flingBehavior3 = flingBehavior2;
                        z5 = z114;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt.LazyGrid.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i219) {
                                LazyGridKt.LazyGrid(modifier3, lazyGridState, lazyGridSlotsProvider, paddingValues3, z5, z2, flingBehavior3, z3, vertical, horizontal, function1, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                            }
                        });
                    }
                }
                i4 |= 100663296;
                if ((i3 & 512) != 0) {
                    if ((i & 805306368) == 0) {
                        if (composerStartRestartGroup.changed(horizontal)) {
                            i10 = 536870912;
                        } else {
                            i10 = 268435456;
                        }
                        i4 |= i10;
                    }
                    if ((i3 & 1024) != 0) {
                        i11 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        if (composerStartRestartGroup.changedInstance(function1)) {
                            i12 = 4;
                        } else {
                            i12 = 2;
                        }
                        i11 = i2 | i12;
                    } else {
                        i11 = i2;
                    }
                    if ((i4 & 306783379) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i15 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier2;
                            }
                            if (i16 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            } else {
                                paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i5 != 0) {
                                z4 = false;
                            } else {
                                z4 = z;
                            }
                            if ((i3 & 64) != 0) {
                                i4 &= -3670017;
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            i13 = i4;
                        } else {
                            if (i15 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier2;
                            }
                            if (i16 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            } else {
                                paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i5 != 0) {
                                z4 = false;
                            } else {
                                z4 = z;
                            }
                            if ((i3 & 64) != 0) {
                                i4 &= -3670017;
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            i13 = i4;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-649686062, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:77)");
                        }
                        int i11111114 = i13 >> 3;
                        int i11111115 = i11111114 & 14;
                        Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda110 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(lazyGridState, function1, composerStartRestartGroup, ((i11 << 3) & 112) | i11111115);
                        int i11111116 = i13 >> 9;
                        LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState110 = LazySemanticsKt.rememberLazyGridSemanticState(lazyGridState, z4, composerStartRestartGroup, (i11111116 & 112) | i11111115);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller110 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                            composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller110);
                            objRememberedValue = compositionScopedCoroutineScopeCanceller110;
                        }
                        int i219 = i13;
                        boolean z115 = z4;
                        Modifier modifier113 = companion;
                        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy110 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda110, lazyGridState, lazyGridSlotsProvider, paddingValuesM995PaddingValues0680j_4, z4, z2, horizontal, vertical, ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope(), (GraphicsContext) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext()), composerStartRestartGroup, (29360128 & i11111114) | (524272 & i13) | (i11111116 & 3670016));
                        if (z2) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Horizontal;
                        }
                        Orientation orientation111 = orientation;
                        composer2 = composerStartRestartGroup;
                        LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda110, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier113.then(lazyGridState.getRemeasurementModifier()).then(lazyGridState.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda110, lazyLayoutSemanticStateRememberLazyGridSemanticState110, orientation111, z3, z115, composerStartRestartGroup, (i11111116 & 57344) | ((i219 << 3) & 458752)), LazyGridBeyondBoundsModifierKt.rememberLazyGridBeyondBoundsState(lazyGridState, composerStartRestartGroup, i11111115), lazyGridState.getBeyondBoundsInfo(), z115, (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation111, z3, composerStartRestartGroup, (i11111114 & 3670016) | (MutableVector.$stable << 6) | (i11111114 & 7168)).then(lazyGridState.getItemAnimator$foundation_release().getModifier()), lazyGridState, orientation111, z3, z115, flingBehavior2, lazyGridState.getInternalInteractionSource(), null, composerStartRestartGroup, (i219 & 112) | ((i219 >> 12) & 7168) | (i219 & 57344) | (458752 & i11111114), 64), lazyGridState.getPrefetchState(), function2RememberLazyGridMeasurePolicy110, composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier113;
                        paddingValues3 = paddingValuesM995PaddingValues0680j_4;
                        flingBehavior3 = flingBehavior2;
                        z5 = z115;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i15 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier2;
                            }
                            if (i16 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            } else {
                                paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i5 != 0) {
                                z4 = false;
                            } else {
                                z4 = z;
                            }
                            if ((i3 & 64) != 0) {
                                i4 &= -3670017;
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            i13 = i4;
                        } else {
                            if (i15 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier2;
                            }
                            if (i16 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            } else {
                                paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i5 != 0) {
                                z4 = false;
                            } else {
                                z4 = z;
                            }
                            if ((i3 & 64) != 0) {
                                i4 &= -3670017;
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            i13 = i4;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-649686062, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:77)");
                        }
                        int i11111117 = i13 >> 3;
                        int i11111118 = i11111117 & 14;
                        Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda111 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(lazyGridState, function1, composerStartRestartGroup, ((i11 << 3) & 112) | i11111118);
                        int i11111119 = i13 >> 9;
                        LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState111 = LazySemanticsKt.rememberLazyGridSemanticState(lazyGridState, z4, composerStartRestartGroup, (i11111119 & 112) | i11111118);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller111 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                            composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller111);
                            objRememberedValue = compositionScopedCoroutineScopeCanceller111;
                        }
                        int i2110 = i13;
                        boolean z116 = z4;
                        Modifier modifier114 = companion;
                        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy111 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda111, lazyGridState, lazyGridSlotsProvider, paddingValuesM995PaddingValues0680j_4, z4, z2, horizontal, vertical, ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope(), (GraphicsContext) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext()), composerStartRestartGroup, (29360128 & i11111117) | (524272 & i13) | (i11111119 & 3670016));
                        if (z2) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Horizontal;
                        }
                        Orientation orientation112 = orientation;
                        composer2 = composerStartRestartGroup;
                        LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda111, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier114.then(lazyGridState.getRemeasurementModifier()).then(lazyGridState.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda111, lazyLayoutSemanticStateRememberLazyGridSemanticState111, orientation112, z3, z116, composerStartRestartGroup, (i11111119 & 57344) | ((i2110 << 3) & 458752)), LazyGridBeyondBoundsModifierKt.rememberLazyGridBeyondBoundsState(lazyGridState, composerStartRestartGroup, i11111118), lazyGridState.getBeyondBoundsInfo(), z116, (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation112, z3, composerStartRestartGroup, (i11111117 & 3670016) | (MutableVector.$stable << 6) | (i11111117 & 7168)).then(lazyGridState.getItemAnimator$foundation_release().getModifier()), lazyGridState, orientation112, z3, z116, flingBehavior2, lazyGridState.getInternalInteractionSource(), null, composerStartRestartGroup, (i2110 & 112) | ((i2110 >> 12) & 7168) | (i2110 & 57344) | (458752 & i11111117), 64), lazyGridState.getPrefetchState(), function2RememberLazyGridMeasurePolicy111, composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier114;
                        paddingValues3 = paddingValuesM995PaddingValues0680j_4;
                        flingBehavior3 = flingBehavior2;
                        z5 = z116;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt.LazyGrid.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i2111) {
                                LazyGridKt.LazyGrid(modifier3, lazyGridState, lazyGridSlotsProvider, paddingValues3, z5, z2, flingBehavior3, z3, vertical, horizontal, function1, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                            }
                        });
                    }
                }
                i4 |= 805306368;
                if ((i3 & 1024) != 0) {
                    i11 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i12 = 4;
                    } else {
                        i12 = 2;
                    }
                    i11 = i2 | i12;
                } else {
                    i11 = i2;
                }
                if ((i4 & 306783379) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i15 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier2;
                        }
                        if (i16 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        } else {
                            paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i5 != 0) {
                            z4 = false;
                        } else {
                            z4 = z;
                        }
                        if ((i3 & 64) != 0) {
                            i4 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        i13 = i4;
                    } else {
                        if (i15 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier2;
                        }
                        if (i16 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        } else {
                            paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i5 != 0) {
                            z4 = false;
                        } else {
                            z4 = z;
                        }
                        if ((i3 & 64) != 0) {
                            i4 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        i13 = i4;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-649686062, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:77)");
                    }
                    int i111111110 = i13 >> 3;
                    int i111111111 = i111111110 & 14;
                    Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda112 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(lazyGridState, function1, composerStartRestartGroup, ((i11 << 3) & 112) | i111111111);
                    int i111111112 = i13 >> 9;
                    LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState112 = LazySemanticsKt.rememberLazyGridSemanticState(lazyGridState, z4, composerStartRestartGroup, (i111111112 & 112) | i111111111);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller112 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                        composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller112);
                        objRememberedValue = compositionScopedCoroutineScopeCanceller112;
                    }
                    int i2111 = i13;
                    boolean z117 = z4;
                    Modifier modifier115 = companion;
                    Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy112 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda112, lazyGridState, lazyGridSlotsProvider, paddingValuesM995PaddingValues0680j_4, z4, z2, horizontal, vertical, ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope(), (GraphicsContext) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext()), composerStartRestartGroup, (29360128 & i111111110) | (524272 & i13) | (i111111112 & 3670016));
                    if (z2) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    Orientation orientation113 = orientation;
                    composer2 = composerStartRestartGroup;
                    LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda112, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier115.then(lazyGridState.getRemeasurementModifier()).then(lazyGridState.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda112, lazyLayoutSemanticStateRememberLazyGridSemanticState112, orientation113, z3, z117, composerStartRestartGroup, (i111111112 & 57344) | ((i2111 << 3) & 458752)), LazyGridBeyondBoundsModifierKt.rememberLazyGridBeyondBoundsState(lazyGridState, composerStartRestartGroup, i111111111), lazyGridState.getBeyondBoundsInfo(), z117, (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation113, z3, composerStartRestartGroup, (i111111110 & 3670016) | (MutableVector.$stable << 6) | (i111111110 & 7168)).then(lazyGridState.getItemAnimator$foundation_release().getModifier()), lazyGridState, orientation113, z3, z117, flingBehavior2, lazyGridState.getInternalInteractionSource(), null, composerStartRestartGroup, (i2111 & 112) | ((i2111 >> 12) & 7168) | (i2111 & 57344) | (458752 & i111111110), 64), lazyGridState.getPrefetchState(), function2RememberLazyGridMeasurePolicy112, composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier115;
                    paddingValues3 = paddingValuesM995PaddingValues0680j_4;
                    flingBehavior3 = flingBehavior2;
                    z5 = z117;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i15 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier2;
                        }
                        if (i16 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        } else {
                            paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i5 != 0) {
                            z4 = false;
                        } else {
                            z4 = z;
                        }
                        if ((i3 & 64) != 0) {
                            i4 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        i13 = i4;
                    } else {
                        if (i15 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier2;
                        }
                        if (i16 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        } else {
                            paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i5 != 0) {
                            z4 = false;
                        } else {
                            z4 = z;
                        }
                        if ((i3 & 64) != 0) {
                            i4 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        i13 = i4;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-649686062, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:77)");
                    }
                    int i111111113 = i13 >> 3;
                    int i111111114 = i111111113 & 14;
                    Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda113 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(lazyGridState, function1, composerStartRestartGroup, ((i11 << 3) & 112) | i111111114);
                    int i111111115 = i13 >> 9;
                    LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState113 = LazySemanticsKt.rememberLazyGridSemanticState(lazyGridState, z4, composerStartRestartGroup, (i111111115 & 112) | i111111114);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller113 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                        composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller113);
                        objRememberedValue = compositionScopedCoroutineScopeCanceller113;
                    }
                    int i2112 = i13;
                    boolean z118 = z4;
                    Modifier modifier116 = companion;
                    Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy113 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda113, lazyGridState, lazyGridSlotsProvider, paddingValuesM995PaddingValues0680j_4, z4, z2, horizontal, vertical, ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope(), (GraphicsContext) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext()), composerStartRestartGroup, (29360128 & i111111113) | (524272 & i13) | (i111111115 & 3670016));
                    if (z2) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    Orientation orientation114 = orientation;
                    composer2 = composerStartRestartGroup;
                    LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda113, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier116.then(lazyGridState.getRemeasurementModifier()).then(lazyGridState.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda113, lazyLayoutSemanticStateRememberLazyGridSemanticState113, orientation114, z3, z118, composerStartRestartGroup, (i111111115 & 57344) | ((i2112 << 3) & 458752)), LazyGridBeyondBoundsModifierKt.rememberLazyGridBeyondBoundsState(lazyGridState, composerStartRestartGroup, i111111114), lazyGridState.getBeyondBoundsInfo(), z118, (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation114, z3, composerStartRestartGroup, (i111111113 & 3670016) | (MutableVector.$stable << 6) | (i111111113 & 7168)).then(lazyGridState.getItemAnimator$foundation_release().getModifier()), lazyGridState, orientation114, z3, z118, flingBehavior2, lazyGridState.getInternalInteractionSource(), null, composerStartRestartGroup, (i2112 & 112) | ((i2112 >> 12) & 7168) | (i2112 & 57344) | (458752 & i111111113), 64), lazyGridState.getPrefetchState(), function2RememberLazyGridMeasurePolicy113, composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier116;
                    paddingValues3 = paddingValuesM995PaddingValues0680j_4;
                    flingBehavior3 = flingBehavior2;
                    z5 = z118;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt.LazyGrid.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i2113) {
                            LazyGridKt.LazyGrid(modifier3, lazyGridState, lazyGridSlotsProvider, paddingValues3, z5, z2, flingBehavior3, z3, vertical, horizontal, function1, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                        }
                    });
                }
            }
            i4 |= 12582912;
            if ((i3 & 256) != 0) {
                if ((i & 100663296) == 0) {
                    if (composerStartRestartGroup.changed(vertical)) {
                        i9 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i9 = 33554432;
                    }
                    i4 |= i9;
                }
                if ((i3 & 512) != 0) {
                    if ((i & 805306368) == 0) {
                        if (composerStartRestartGroup.changed(horizontal)) {
                            i10 = 536870912;
                        } else {
                            i10 = 268435456;
                        }
                        i4 |= i10;
                    }
                    if ((i3 & 1024) != 0) {
                        i11 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        if (composerStartRestartGroup.changedInstance(function1)) {
                            i12 = 4;
                        } else {
                            i12 = 2;
                        }
                        i11 = i2 | i12;
                    } else {
                        i11 = i2;
                    }
                    if ((i4 & 306783379) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i15 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier2;
                            }
                            if (i16 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            } else {
                                paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i5 != 0) {
                                z4 = false;
                            } else {
                                z4 = z;
                            }
                            if ((i3 & 64) != 0) {
                                i4 &= -3670017;
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            i13 = i4;
                        } else {
                            if (i15 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier2;
                            }
                            if (i16 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            } else {
                                paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i5 != 0) {
                                z4 = false;
                            } else {
                                z4 = z;
                            }
                            if ((i3 & 64) != 0) {
                                i4 &= -3670017;
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            i13 = i4;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-649686062, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:77)");
                        }
                        int i111111116 = i13 >> 3;
                        int i111111117 = i111111116 & 14;
                        Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda114 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(lazyGridState, function1, composerStartRestartGroup, ((i11 << 3) & 112) | i111111117);
                        int i111111118 = i13 >> 9;
                        LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState114 = LazySemanticsKt.rememberLazyGridSemanticState(lazyGridState, z4, composerStartRestartGroup, (i111111118 & 112) | i111111117);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller114 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                            composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller114);
                            objRememberedValue = compositionScopedCoroutineScopeCanceller114;
                        }
                        int i2113 = i13;
                        boolean z119 = z4;
                        Modifier modifier117 = companion;
                        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy114 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda114, lazyGridState, lazyGridSlotsProvider, paddingValuesM995PaddingValues0680j_4, z4, z2, horizontal, vertical, ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope(), (GraphicsContext) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext()), composerStartRestartGroup, (29360128 & i111111116) | (524272 & i13) | (i111111118 & 3670016));
                        if (z2) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Horizontal;
                        }
                        Orientation orientation115 = orientation;
                        composer2 = composerStartRestartGroup;
                        LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda114, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier117.then(lazyGridState.getRemeasurementModifier()).then(lazyGridState.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda114, lazyLayoutSemanticStateRememberLazyGridSemanticState114, orientation115, z3, z119, composerStartRestartGroup, (i111111118 & 57344) | ((i2113 << 3) & 458752)), LazyGridBeyondBoundsModifierKt.rememberLazyGridBeyondBoundsState(lazyGridState, composerStartRestartGroup, i111111117), lazyGridState.getBeyondBoundsInfo(), z119, (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation115, z3, composerStartRestartGroup, (i111111116 & 3670016) | (MutableVector.$stable << 6) | (i111111116 & 7168)).then(lazyGridState.getItemAnimator$foundation_release().getModifier()), lazyGridState, orientation115, z3, z119, flingBehavior2, lazyGridState.getInternalInteractionSource(), null, composerStartRestartGroup, (i2113 & 112) | ((i2113 >> 12) & 7168) | (i2113 & 57344) | (458752 & i111111116), 64), lazyGridState.getPrefetchState(), function2RememberLazyGridMeasurePolicy114, composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier117;
                        paddingValues3 = paddingValuesM995PaddingValues0680j_4;
                        flingBehavior3 = flingBehavior2;
                        z5 = z119;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i15 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier2;
                            }
                            if (i16 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            } else {
                                paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i5 != 0) {
                                z4 = false;
                            } else {
                                z4 = z;
                            }
                            if ((i3 & 64) != 0) {
                                i4 &= -3670017;
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            i13 = i4;
                        } else {
                            if (i15 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier2;
                            }
                            if (i16 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            } else {
                                paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i5 != 0) {
                                z4 = false;
                            } else {
                                z4 = z;
                            }
                            if ((i3 & 64) != 0) {
                                i4 &= -3670017;
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            i13 = i4;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-649686062, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:77)");
                        }
                        int i111111119 = i13 >> 3;
                        int i1111111110 = i111111119 & 14;
                        Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda115 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(lazyGridState, function1, composerStartRestartGroup, ((i11 << 3) & 112) | i1111111110);
                        int i1111111111 = i13 >> 9;
                        LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState115 = LazySemanticsKt.rememberLazyGridSemanticState(lazyGridState, z4, composerStartRestartGroup, (i1111111111 & 112) | i1111111110);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller115 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                            composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller115);
                            objRememberedValue = compositionScopedCoroutineScopeCanceller115;
                        }
                        int i2114 = i13;
                        boolean z1110 = z4;
                        Modifier modifier118 = companion;
                        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy115 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda115, lazyGridState, lazyGridSlotsProvider, paddingValuesM995PaddingValues0680j_4, z4, z2, horizontal, vertical, ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope(), (GraphicsContext) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext()), composerStartRestartGroup, (29360128 & i111111119) | (524272 & i13) | (i1111111111 & 3670016));
                        if (z2) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Horizontal;
                        }
                        Orientation orientation116 = orientation;
                        composer2 = composerStartRestartGroup;
                        LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda115, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier118.then(lazyGridState.getRemeasurementModifier()).then(lazyGridState.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda115, lazyLayoutSemanticStateRememberLazyGridSemanticState115, orientation116, z3, z1110, composerStartRestartGroup, (i1111111111 & 57344) | ((i2114 << 3) & 458752)), LazyGridBeyondBoundsModifierKt.rememberLazyGridBeyondBoundsState(lazyGridState, composerStartRestartGroup, i1111111110), lazyGridState.getBeyondBoundsInfo(), z1110, (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation116, z3, composerStartRestartGroup, (i111111119 & 3670016) | (MutableVector.$stable << 6) | (i111111119 & 7168)).then(lazyGridState.getItemAnimator$foundation_release().getModifier()), lazyGridState, orientation116, z3, z1110, flingBehavior2, lazyGridState.getInternalInteractionSource(), null, composerStartRestartGroup, (i2114 & 112) | ((i2114 >> 12) & 7168) | (i2114 & 57344) | (458752 & i111111119), 64), lazyGridState.getPrefetchState(), function2RememberLazyGridMeasurePolicy115, composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier118;
                        paddingValues3 = paddingValuesM995PaddingValues0680j_4;
                        flingBehavior3 = flingBehavior2;
                        z5 = z1110;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt.LazyGrid.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i2115) {
                                LazyGridKt.LazyGrid(modifier3, lazyGridState, lazyGridSlotsProvider, paddingValues3, z5, z2, flingBehavior3, z3, vertical, horizontal, function1, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                            }
                        });
                    }
                }
                i4 |= 805306368;
                if ((i3 & 1024) != 0) {
                    i11 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i12 = 4;
                    } else {
                        i12 = 2;
                    }
                    i11 = i2 | i12;
                } else {
                    i11 = i2;
                }
                if ((i4 & 306783379) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i15 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier2;
                        }
                        if (i16 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        } else {
                            paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i5 != 0) {
                            z4 = false;
                        } else {
                            z4 = z;
                        }
                        if ((i3 & 64) != 0) {
                            i4 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        i13 = i4;
                    } else {
                        if (i15 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier2;
                        }
                        if (i16 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        } else {
                            paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i5 != 0) {
                            z4 = false;
                        } else {
                            z4 = z;
                        }
                        if ((i3 & 64) != 0) {
                            i4 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        i13 = i4;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-649686062, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:77)");
                    }
                    int i1111111112 = i13 >> 3;
                    int i1111111113 = i1111111112 & 14;
                    Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda116 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(lazyGridState, function1, composerStartRestartGroup, ((i11 << 3) & 112) | i1111111113);
                    int i1111111114 = i13 >> 9;
                    LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState116 = LazySemanticsKt.rememberLazyGridSemanticState(lazyGridState, z4, composerStartRestartGroup, (i1111111114 & 112) | i1111111113);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller116 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                        composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller116);
                        objRememberedValue = compositionScopedCoroutineScopeCanceller116;
                    }
                    int i2115 = i13;
                    boolean z1111 = z4;
                    Modifier modifier119 = companion;
                    Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy116 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda116, lazyGridState, lazyGridSlotsProvider, paddingValuesM995PaddingValues0680j_4, z4, z2, horizontal, vertical, ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope(), (GraphicsContext) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext()), composerStartRestartGroup, (29360128 & i1111111112) | (524272 & i13) | (i1111111114 & 3670016));
                    if (z2) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    Orientation orientation117 = orientation;
                    composer2 = composerStartRestartGroup;
                    LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda116, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier119.then(lazyGridState.getRemeasurementModifier()).then(lazyGridState.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda116, lazyLayoutSemanticStateRememberLazyGridSemanticState116, orientation117, z3, z1111, composerStartRestartGroup, (i1111111114 & 57344) | ((i2115 << 3) & 458752)), LazyGridBeyondBoundsModifierKt.rememberLazyGridBeyondBoundsState(lazyGridState, composerStartRestartGroup, i1111111113), lazyGridState.getBeyondBoundsInfo(), z1111, (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation117, z3, composerStartRestartGroup, (i1111111112 & 3670016) | (MutableVector.$stable << 6) | (i1111111112 & 7168)).then(lazyGridState.getItemAnimator$foundation_release().getModifier()), lazyGridState, orientation117, z3, z1111, flingBehavior2, lazyGridState.getInternalInteractionSource(), null, composerStartRestartGroup, (i2115 & 112) | ((i2115 >> 12) & 7168) | (i2115 & 57344) | (458752 & i1111111112), 64), lazyGridState.getPrefetchState(), function2RememberLazyGridMeasurePolicy116, composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier119;
                    paddingValues3 = paddingValuesM995PaddingValues0680j_4;
                    flingBehavior3 = flingBehavior2;
                    z5 = z1111;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i15 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier2;
                        }
                        if (i16 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        } else {
                            paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i5 != 0) {
                            z4 = false;
                        } else {
                            z4 = z;
                        }
                        if ((i3 & 64) != 0) {
                            i4 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        i13 = i4;
                    } else {
                        if (i15 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier2;
                        }
                        if (i16 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        } else {
                            paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i5 != 0) {
                            z4 = false;
                        } else {
                            z4 = z;
                        }
                        if ((i3 & 64) != 0) {
                            i4 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        i13 = i4;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-649686062, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:77)");
                    }
                    int i1111111115 = i13 >> 3;
                    int i1111111116 = i1111111115 & 14;
                    Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda117 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(lazyGridState, function1, composerStartRestartGroup, ((i11 << 3) & 112) | i1111111116);
                    int i1111111117 = i13 >> 9;
                    LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState117 = LazySemanticsKt.rememberLazyGridSemanticState(lazyGridState, z4, composerStartRestartGroup, (i1111111117 & 112) | i1111111116);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller117 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                        composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller117);
                        objRememberedValue = compositionScopedCoroutineScopeCanceller117;
                    }
                    int i2116 = i13;
                    boolean z1112 = z4;
                    Modifier modifier1110 = companion;
                    Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy117 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda117, lazyGridState, lazyGridSlotsProvider, paddingValuesM995PaddingValues0680j_4, z4, z2, horizontal, vertical, ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope(), (GraphicsContext) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext()), composerStartRestartGroup, (29360128 & i1111111115) | (524272 & i13) | (i1111111117 & 3670016));
                    if (z2) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    Orientation orientation118 = orientation;
                    composer2 = composerStartRestartGroup;
                    LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda117, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier1110.then(lazyGridState.getRemeasurementModifier()).then(lazyGridState.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda117, lazyLayoutSemanticStateRememberLazyGridSemanticState117, orientation118, z3, z1112, composerStartRestartGroup, (i1111111117 & 57344) | ((i2116 << 3) & 458752)), LazyGridBeyondBoundsModifierKt.rememberLazyGridBeyondBoundsState(lazyGridState, composerStartRestartGroup, i1111111116), lazyGridState.getBeyondBoundsInfo(), z1112, (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation118, z3, composerStartRestartGroup, (i1111111115 & 3670016) | (MutableVector.$stable << 6) | (i1111111115 & 7168)).then(lazyGridState.getItemAnimator$foundation_release().getModifier()), lazyGridState, orientation118, z3, z1112, flingBehavior2, lazyGridState.getInternalInteractionSource(), null, composerStartRestartGroup, (i2116 & 112) | ((i2116 >> 12) & 7168) | (i2116 & 57344) | (458752 & i1111111115), 64), lazyGridState.getPrefetchState(), function2RememberLazyGridMeasurePolicy117, composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier1110;
                    paddingValues3 = paddingValuesM995PaddingValues0680j_4;
                    flingBehavior3 = flingBehavior2;
                    z5 = z1112;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt.LazyGrid.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i2117) {
                            LazyGridKt.LazyGrid(modifier3, lazyGridState, lazyGridSlotsProvider, paddingValues3, z5, z2, flingBehavior3, z3, vertical, horizontal, function1, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                        }
                    });
                }
            }
            i4 |= 100663296;
            if ((i3 & 512) != 0) {
                if ((i & 805306368) == 0) {
                    if (composerStartRestartGroup.changed(horizontal)) {
                        i10 = 536870912;
                    } else {
                        i10 = 268435456;
                    }
                    i4 |= i10;
                }
                if ((i3 & 1024) != 0) {
                    i11 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i12 = 4;
                    } else {
                        i12 = 2;
                    }
                    i11 = i2 | i12;
                } else {
                    i11 = i2;
                }
                if ((i4 & 306783379) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i15 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier2;
                        }
                        if (i16 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        } else {
                            paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i5 != 0) {
                            z4 = false;
                        } else {
                            z4 = z;
                        }
                        if ((i3 & 64) != 0) {
                            i4 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        i13 = i4;
                    } else {
                        if (i15 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier2;
                        }
                        if (i16 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        } else {
                            paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i5 != 0) {
                            z4 = false;
                        } else {
                            z4 = z;
                        }
                        if ((i3 & 64) != 0) {
                            i4 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        i13 = i4;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-649686062, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:77)");
                    }
                    int i1111111118 = i13 >> 3;
                    int i1111111119 = i1111111118 & 14;
                    Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda118 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(lazyGridState, function1, composerStartRestartGroup, ((i11 << 3) & 112) | i1111111119);
                    int i11111111110 = i13 >> 9;
                    LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState118 = LazySemanticsKt.rememberLazyGridSemanticState(lazyGridState, z4, composerStartRestartGroup, (i11111111110 & 112) | i1111111119);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller118 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                        composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller118);
                        objRememberedValue = compositionScopedCoroutineScopeCanceller118;
                    }
                    int i2117 = i13;
                    boolean z1113 = z4;
                    Modifier modifier1111 = companion;
                    Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy118 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda118, lazyGridState, lazyGridSlotsProvider, paddingValuesM995PaddingValues0680j_4, z4, z2, horizontal, vertical, ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope(), (GraphicsContext) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext()), composerStartRestartGroup, (29360128 & i1111111118) | (524272 & i13) | (i11111111110 & 3670016));
                    if (z2) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    Orientation orientation119 = orientation;
                    composer2 = composerStartRestartGroup;
                    LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda118, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier1111.then(lazyGridState.getRemeasurementModifier()).then(lazyGridState.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda118, lazyLayoutSemanticStateRememberLazyGridSemanticState118, orientation119, z3, z1113, composerStartRestartGroup, (i11111111110 & 57344) | ((i2117 << 3) & 458752)), LazyGridBeyondBoundsModifierKt.rememberLazyGridBeyondBoundsState(lazyGridState, composerStartRestartGroup, i1111111119), lazyGridState.getBeyondBoundsInfo(), z1113, (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation119, z3, composerStartRestartGroup, (i1111111118 & 3670016) | (MutableVector.$stable << 6) | (i1111111118 & 7168)).then(lazyGridState.getItemAnimator$foundation_release().getModifier()), lazyGridState, orientation119, z3, z1113, flingBehavior2, lazyGridState.getInternalInteractionSource(), null, composerStartRestartGroup, (i2117 & 112) | ((i2117 >> 12) & 7168) | (i2117 & 57344) | (458752 & i1111111118), 64), lazyGridState.getPrefetchState(), function2RememberLazyGridMeasurePolicy118, composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier1111;
                    paddingValues3 = paddingValuesM995PaddingValues0680j_4;
                    flingBehavior3 = flingBehavior2;
                    z5 = z1113;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i15 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier2;
                        }
                        if (i16 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        } else {
                            paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i5 != 0) {
                            z4 = false;
                        } else {
                            z4 = z;
                        }
                        if ((i3 & 64) != 0) {
                            i4 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        i13 = i4;
                    } else {
                        if (i15 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier2;
                        }
                        if (i16 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        } else {
                            paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i5 != 0) {
                            z4 = false;
                        } else {
                            z4 = z;
                        }
                        if ((i3 & 64) != 0) {
                            i4 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        i13 = i4;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-649686062, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:77)");
                    }
                    int i11111111111 = i13 >> 3;
                    int i11111111112 = i11111111111 & 14;
                    Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda119 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(lazyGridState, function1, composerStartRestartGroup, ((i11 << 3) & 112) | i11111111112);
                    int i11111111113 = i13 >> 9;
                    LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState119 = LazySemanticsKt.rememberLazyGridSemanticState(lazyGridState, z4, composerStartRestartGroup, (i11111111113 & 112) | i11111111112);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller119 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                        composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller119);
                        objRememberedValue = compositionScopedCoroutineScopeCanceller119;
                    }
                    int i2118 = i13;
                    boolean z1114 = z4;
                    Modifier modifier1112 = companion;
                    Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy119 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda119, lazyGridState, lazyGridSlotsProvider, paddingValuesM995PaddingValues0680j_4, z4, z2, horizontal, vertical, ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope(), (GraphicsContext) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext()), composerStartRestartGroup, (29360128 & i11111111111) | (524272 & i13) | (i11111111113 & 3670016));
                    if (z2) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    Orientation orientation1110 = orientation;
                    composer2 = composerStartRestartGroup;
                    LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda119, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier1112.then(lazyGridState.getRemeasurementModifier()).then(lazyGridState.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda119, lazyLayoutSemanticStateRememberLazyGridSemanticState119, orientation1110, z3, z1114, composerStartRestartGroup, (i11111111113 & 57344) | ((i2118 << 3) & 458752)), LazyGridBeyondBoundsModifierKt.rememberLazyGridBeyondBoundsState(lazyGridState, composerStartRestartGroup, i11111111112), lazyGridState.getBeyondBoundsInfo(), z1114, (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation1110, z3, composerStartRestartGroup, (i11111111111 & 3670016) | (MutableVector.$stable << 6) | (i11111111111 & 7168)).then(lazyGridState.getItemAnimator$foundation_release().getModifier()), lazyGridState, orientation1110, z3, z1114, flingBehavior2, lazyGridState.getInternalInteractionSource(), null, composerStartRestartGroup, (i2118 & 112) | ((i2118 >> 12) & 7168) | (i2118 & 57344) | (458752 & i11111111111), 64), lazyGridState.getPrefetchState(), function2RememberLazyGridMeasurePolicy119, composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier1112;
                    paddingValues3 = paddingValuesM995PaddingValues0680j_4;
                    flingBehavior3 = flingBehavior2;
                    z5 = z1114;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt.LazyGrid.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i2119) {
                            LazyGridKt.LazyGrid(modifier3, lazyGridState, lazyGridSlotsProvider, paddingValues3, z5, z2, flingBehavior3, z3, vertical, horizontal, function1, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                        }
                    });
                }
            }
            i4 |= 805306368;
            if ((i3 & 1024) != 0) {
                i11 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i12 = 4;
                } else {
                    i12 = 2;
                }
                i11 = i2 | i12;
            } else {
                i11 = i2;
            }
            if ((i4 & 306783379) == 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i15 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if (i16 != 0) {
                        paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                    } else {
                        paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i5 != 0) {
                        z4 = false;
                    } else {
                        z4 = z;
                    }
                    if ((i3 & 64) != 0) {
                        i4 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    i13 = i4;
                } else {
                    if (i15 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if (i16 != 0) {
                        paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                    } else {
                        paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i5 != 0) {
                        z4 = false;
                    } else {
                        z4 = z;
                    }
                    if ((i3 & 64) != 0) {
                        i4 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    i13 = i4;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-649686062, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:77)");
                }
                int i11111111114 = i13 >> 3;
                int i11111111115 = i11111111114 & 14;
                Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda1110 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(lazyGridState, function1, composerStartRestartGroup, ((i11 << 3) & 112) | i11111111115);
                int i11111111116 = i13 >> 9;
                LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState1110 = LazySemanticsKt.rememberLazyGridSemanticState(lazyGridState, z4, composerStartRestartGroup, (i11111111116 & 112) | i11111111115);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller1110 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                    composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller1110);
                    objRememberedValue = compositionScopedCoroutineScopeCanceller1110;
                }
                int i2119 = i13;
                boolean z1115 = z4;
                Modifier modifier1113 = companion;
                Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy1110 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda1110, lazyGridState, lazyGridSlotsProvider, paddingValuesM995PaddingValues0680j_4, z4, z2, horizontal, vertical, ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope(), (GraphicsContext) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext()), composerStartRestartGroup, (29360128 & i11111111114) | (524272 & i13) | (i11111111116 & 3670016));
                if (z2) {
                    orientation = Orientation.Vertical;
                } else {
                    orientation = Orientation.Horizontal;
                }
                Orientation orientation1111 = orientation;
                composer2 = composerStartRestartGroup;
                LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda1110, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier1113.then(lazyGridState.getRemeasurementModifier()).then(lazyGridState.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda1110, lazyLayoutSemanticStateRememberLazyGridSemanticState1110, orientation1111, z3, z1115, composerStartRestartGroup, (i11111111116 & 57344) | ((i2119 << 3) & 458752)), LazyGridBeyondBoundsModifierKt.rememberLazyGridBeyondBoundsState(lazyGridState, composerStartRestartGroup, i11111111115), lazyGridState.getBeyondBoundsInfo(), z1115, (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation1111, z3, composerStartRestartGroup, (i11111111114 & 3670016) | (MutableVector.$stable << 6) | (i11111111114 & 7168)).then(lazyGridState.getItemAnimator$foundation_release().getModifier()), lazyGridState, orientation1111, z3, z1115, flingBehavior2, lazyGridState.getInternalInteractionSource(), null, composerStartRestartGroup, (i2119 & 112) | ((i2119 >> 12) & 7168) | (i2119 & 57344) | (458752 & i11111111114), 64), lazyGridState.getPrefetchState(), function2RememberLazyGridMeasurePolicy1110, composer2, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier1113;
                paddingValues3 = paddingValuesM995PaddingValues0680j_4;
                flingBehavior3 = flingBehavior2;
                z5 = z1115;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i15 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if (i16 != 0) {
                        paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                    } else {
                        paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i5 != 0) {
                        z4 = false;
                    } else {
                        z4 = z;
                    }
                    if ((i3 & 64) != 0) {
                        i4 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    i13 = i4;
                } else {
                    if (i15 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if (i16 != 0) {
                        paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                    } else {
                        paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i5 != 0) {
                        z4 = false;
                    } else {
                        z4 = z;
                    }
                    if ((i3 & 64) != 0) {
                        i4 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    i13 = i4;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-649686062, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:77)");
                }
                int i11111111117 = i13 >> 3;
                int i11111111118 = i11111111117 & 14;
                Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda1111 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(lazyGridState, function1, composerStartRestartGroup, ((i11 << 3) & 112) | i11111111118);
                int i11111111119 = i13 >> 9;
                LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState1111 = LazySemanticsKt.rememberLazyGridSemanticState(lazyGridState, z4, composerStartRestartGroup, (i11111111119 & 112) | i11111111118);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller1111 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                    composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller1111);
                    objRememberedValue = compositionScopedCoroutineScopeCanceller1111;
                }
                int i21110 = i13;
                boolean z1116 = z4;
                Modifier modifier1114 = companion;
                Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy1111 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda1111, lazyGridState, lazyGridSlotsProvider, paddingValuesM995PaddingValues0680j_4, z4, z2, horizontal, vertical, ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope(), (GraphicsContext) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext()), composerStartRestartGroup, (29360128 & i11111111117) | (524272 & i13) | (i11111111119 & 3670016));
                if (z2) {
                    orientation = Orientation.Vertical;
                } else {
                    orientation = Orientation.Horizontal;
                }
                Orientation orientation1112 = orientation;
                composer2 = composerStartRestartGroup;
                LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda1111, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier1114.then(lazyGridState.getRemeasurementModifier()).then(lazyGridState.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda1111, lazyLayoutSemanticStateRememberLazyGridSemanticState1111, orientation1112, z3, z1116, composerStartRestartGroup, (i11111111119 & 57344) | ((i21110 << 3) & 458752)), LazyGridBeyondBoundsModifierKt.rememberLazyGridBeyondBoundsState(lazyGridState, composerStartRestartGroup, i11111111118), lazyGridState.getBeyondBoundsInfo(), z1116, (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation1112, z3, composerStartRestartGroup, (i11111111117 & 3670016) | (MutableVector.$stable << 6) | (i11111111117 & 7168)).then(lazyGridState.getItemAnimator$foundation_release().getModifier()), lazyGridState, orientation1112, z3, z1116, flingBehavior2, lazyGridState.getInternalInteractionSource(), null, composerStartRestartGroup, (i21110 & 112) | ((i21110 >> 12) & 7168) | (i21110 & 57344) | (458752 & i11111111117), 64), lazyGridState.getPrefetchState(), function2RememberLazyGridMeasurePolicy1111, composer2, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier1114;
                paddingValues3 = paddingValuesM995PaddingValues0680j_4;
                flingBehavior3 = flingBehavior2;
                z5 = z1116;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt.LazyGrid.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i21111) {
                        LazyGridKt.LazyGrid(modifier3, lazyGridState, lazyGridSlotsProvider, paddingValues3, z5, z2, flingBehavior3, z3, vertical, horizontal, function1, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                    }
                });
            }
        }
        i4 |= 3072;
        paddingValues2 = paddingValues;
        i5 = i3 & 16;
        if (i5 != 0) {
            if ((i & 24576) == 0) {
                if (composerStartRestartGroup.changed(z)) {
                    i6 = 16384;
                } else {
                    i6 = 8192;
                }
                i4 |= i6;
            }
            if ((i3 & 32) != 0) {
                i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                if (composerStartRestartGroup.changed(z2)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i4 |= i7;
            }
            if ((i & 1572864) != 0) {
                if ((i3 & 64) == 0) {
                    i14 = 524288;
                } else {
                    i14 = 524288;
                }
                i4 |= i14;
            }
            if ((i3 & 128) != 0) {
                if ((i & 12582912) == 0) {
                    if (composerStartRestartGroup.changed(z3)) {
                        i8 = 8388608;
                    } else {
                        i8 = 4194304;
                    }
                    i4 |= i8;
                }
                if ((i3 & 256) != 0) {
                    if ((i & 100663296) == 0) {
                        if (composerStartRestartGroup.changed(vertical)) {
                            i9 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        } else {
                            i9 = 33554432;
                        }
                        i4 |= i9;
                    }
                    if ((i3 & 512) != 0) {
                        if ((i & 805306368) == 0) {
                            if (composerStartRestartGroup.changed(horizontal)) {
                                i10 = 536870912;
                            } else {
                                i10 = 268435456;
                            }
                            i4 |= i10;
                        }
                        if ((i3 & 1024) != 0) {
                            i11 = i2 | 6;
                        } else if ((i2 & 6) == 0) {
                            if (composerStartRestartGroup.changedInstance(function1)) {
                                i12 = 4;
                            } else {
                                i12 = 2;
                            }
                            i11 = i2 | i12;
                        } else {
                            i11 = i2;
                        }
                        if ((i4 & 306783379) == 306783378) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if (i15 != 0) {
                                    companion = Modifier.INSTANCE;
                                } else {
                                    companion = modifier2;
                                }
                                if (i16 != 0) {
                                    paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                                } else {
                                    paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                                }
                                if (i5 != 0) {
                                    z4 = false;
                                } else {
                                    z4 = z;
                                }
                                if ((i3 & 64) != 0) {
                                    i4 &= -3670017;
                                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                } else {
                                    flingBehavior2 = flingBehavior;
                                }
                                i13 = i4;
                            } else {
                                if (i15 != 0) {
                                    companion = Modifier.INSTANCE;
                                } else {
                                    companion = modifier2;
                                }
                                if (i16 != 0) {
                                    paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                                } else {
                                    paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                                }
                                if (i5 != 0) {
                                    z4 = false;
                                } else {
                                    z4 = z;
                                }
                                if ((i3 & 64) != 0) {
                                    i4 &= -3670017;
                                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                } else {
                                    flingBehavior2 = flingBehavior;
                                }
                                i13 = i4;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-649686062, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:77)");
                            }
                            int i111111111110 = i13 >> 3;
                            int i111111111111 = i111111111110 & 14;
                            Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda1112 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(lazyGridState, function1, composerStartRestartGroup, ((i11 << 3) & 112) | i111111111111);
                            int i111111111112 = i13 >> 9;
                            LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState1112 = LazySemanticsKt.rememberLazyGridSemanticState(lazyGridState, z4, composerStartRestartGroup, (i111111111112 & 112) | i111111111111);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller1112 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                                composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller1112);
                                objRememberedValue = compositionScopedCoroutineScopeCanceller1112;
                            }
                            int i21111 = i13;
                            boolean z1117 = z4;
                            Modifier modifier1115 = companion;
                            Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy1112 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda1112, lazyGridState, lazyGridSlotsProvider, paddingValuesM995PaddingValues0680j_4, z4, z2, horizontal, vertical, ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope(), (GraphicsContext) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext()), composerStartRestartGroup, (29360128 & i111111111110) | (524272 & i13) | (i111111111112 & 3670016));
                            if (z2) {
                                orientation = Orientation.Vertical;
                            } else {
                                orientation = Orientation.Horizontal;
                            }
                            Orientation orientation1113 = orientation;
                            composer2 = composerStartRestartGroup;
                            LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda1112, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier1115.then(lazyGridState.getRemeasurementModifier()).then(lazyGridState.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda1112, lazyLayoutSemanticStateRememberLazyGridSemanticState1112, orientation1113, z3, z1117, composerStartRestartGroup, (i111111111112 & 57344) | ((i21111 << 3) & 458752)), LazyGridBeyondBoundsModifierKt.rememberLazyGridBeyondBoundsState(lazyGridState, composerStartRestartGroup, i111111111111), lazyGridState.getBeyondBoundsInfo(), z1117, (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation1113, z3, composerStartRestartGroup, (i111111111110 & 3670016) | (MutableVector.$stable << 6) | (i111111111110 & 7168)).then(lazyGridState.getItemAnimator$foundation_release().getModifier()), lazyGridState, orientation1113, z3, z1117, flingBehavior2, lazyGridState.getInternalInteractionSource(), null, composerStartRestartGroup, (i21111 & 112) | ((i21111 >> 12) & 7168) | (i21111 & 57344) | (458752 & i111111111110), 64), lazyGridState.getPrefetchState(), function2RememberLazyGridMeasurePolicy1112, composer2, 0, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier1115;
                            paddingValues3 = paddingValuesM995PaddingValues0680j_4;
                            flingBehavior3 = flingBehavior2;
                            z5 = z1117;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if (i15 != 0) {
                                    companion = Modifier.INSTANCE;
                                } else {
                                    companion = modifier2;
                                }
                                if (i16 != 0) {
                                    paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                                } else {
                                    paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                                }
                                if (i5 != 0) {
                                    z4 = false;
                                } else {
                                    z4 = z;
                                }
                                if ((i3 & 64) != 0) {
                                    i4 &= -3670017;
                                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                } else {
                                    flingBehavior2 = flingBehavior;
                                }
                                i13 = i4;
                            } else {
                                if (i15 != 0) {
                                    companion = Modifier.INSTANCE;
                                } else {
                                    companion = modifier2;
                                }
                                if (i16 != 0) {
                                    paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                                } else {
                                    paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                                }
                                if (i5 != 0) {
                                    z4 = false;
                                } else {
                                    z4 = z;
                                }
                                if ((i3 & 64) != 0) {
                                    i4 &= -3670017;
                                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                } else {
                                    flingBehavior2 = flingBehavior;
                                }
                                i13 = i4;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-649686062, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:77)");
                            }
                            int i111111111113 = i13 >> 3;
                            int i111111111114 = i111111111113 & 14;
                            Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda1113 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(lazyGridState, function1, composerStartRestartGroup, ((i11 << 3) & 112) | i111111111114);
                            int i111111111115 = i13 >> 9;
                            LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState1113 = LazySemanticsKt.rememberLazyGridSemanticState(lazyGridState, z4, composerStartRestartGroup, (i111111111115 & 112) | i111111111114);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller1113 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                                composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller1113);
                                objRememberedValue = compositionScopedCoroutineScopeCanceller1113;
                            }
                            int i21112 = i13;
                            boolean z1118 = z4;
                            Modifier modifier1116 = companion;
                            Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy1113 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda1113, lazyGridState, lazyGridSlotsProvider, paddingValuesM995PaddingValues0680j_4, z4, z2, horizontal, vertical, ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope(), (GraphicsContext) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext()), composerStartRestartGroup, (29360128 & i111111111113) | (524272 & i13) | (i111111111115 & 3670016));
                            if (z2) {
                                orientation = Orientation.Vertical;
                            } else {
                                orientation = Orientation.Horizontal;
                            }
                            Orientation orientation1114 = orientation;
                            composer2 = composerStartRestartGroup;
                            LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda1113, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier1116.then(lazyGridState.getRemeasurementModifier()).then(lazyGridState.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda1113, lazyLayoutSemanticStateRememberLazyGridSemanticState1113, orientation1114, z3, z1118, composerStartRestartGroup, (i111111111115 & 57344) | ((i21112 << 3) & 458752)), LazyGridBeyondBoundsModifierKt.rememberLazyGridBeyondBoundsState(lazyGridState, composerStartRestartGroup, i111111111114), lazyGridState.getBeyondBoundsInfo(), z1118, (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation1114, z3, composerStartRestartGroup, (i111111111113 & 3670016) | (MutableVector.$stable << 6) | (i111111111113 & 7168)).then(lazyGridState.getItemAnimator$foundation_release().getModifier()), lazyGridState, orientation1114, z3, z1118, flingBehavior2, lazyGridState.getInternalInteractionSource(), null, composerStartRestartGroup, (i21112 & 112) | ((i21112 >> 12) & 7168) | (i21112 & 57344) | (458752 & i111111111113), 64), lazyGridState.getPrefetchState(), function2RememberLazyGridMeasurePolicy1113, composer2, 0, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier1116;
                            paddingValues3 = paddingValuesM995PaddingValues0680j_4;
                            flingBehavior3 = flingBehavior2;
                            z5 = z1118;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt.LazyGrid.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i21113) {
                                    LazyGridKt.LazyGrid(modifier3, lazyGridState, lazyGridSlotsProvider, paddingValues3, z5, z2, flingBehavior3, z3, vertical, horizontal, function1, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                                }
                            });
                        }
                    }
                    i4 |= 805306368;
                    if ((i3 & 1024) != 0) {
                        i11 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        if (composerStartRestartGroup.changedInstance(function1)) {
                            i12 = 4;
                        } else {
                            i12 = 2;
                        }
                        i11 = i2 | i12;
                    } else {
                        i11 = i2;
                    }
                    if ((i4 & 306783379) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i15 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier2;
                            }
                            if (i16 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            } else {
                                paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i5 != 0) {
                                z4 = false;
                            } else {
                                z4 = z;
                            }
                            if ((i3 & 64) != 0) {
                                i4 &= -3670017;
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            i13 = i4;
                        } else {
                            if (i15 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier2;
                            }
                            if (i16 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            } else {
                                paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i5 != 0) {
                                z4 = false;
                            } else {
                                z4 = z;
                            }
                            if ((i3 & 64) != 0) {
                                i4 &= -3670017;
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            i13 = i4;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-649686062, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:77)");
                        }
                        int i111111111116 = i13 >> 3;
                        int i111111111117 = i111111111116 & 14;
                        Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda1114 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(lazyGridState, function1, composerStartRestartGroup, ((i11 << 3) & 112) | i111111111117);
                        int i111111111118 = i13 >> 9;
                        LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState1114 = LazySemanticsKt.rememberLazyGridSemanticState(lazyGridState, z4, composerStartRestartGroup, (i111111111118 & 112) | i111111111117);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller1114 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                            composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller1114);
                            objRememberedValue = compositionScopedCoroutineScopeCanceller1114;
                        }
                        int i21113 = i13;
                        boolean z1119 = z4;
                        Modifier modifier1117 = companion;
                        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy1114 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda1114, lazyGridState, lazyGridSlotsProvider, paddingValuesM995PaddingValues0680j_4, z4, z2, horizontal, vertical, ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope(), (GraphicsContext) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext()), composerStartRestartGroup, (29360128 & i111111111116) | (524272 & i13) | (i111111111118 & 3670016));
                        if (z2) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Horizontal;
                        }
                        Orientation orientation1115 = orientation;
                        composer2 = composerStartRestartGroup;
                        LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda1114, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier1117.then(lazyGridState.getRemeasurementModifier()).then(lazyGridState.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda1114, lazyLayoutSemanticStateRememberLazyGridSemanticState1114, orientation1115, z3, z1119, composerStartRestartGroup, (i111111111118 & 57344) | ((i21113 << 3) & 458752)), LazyGridBeyondBoundsModifierKt.rememberLazyGridBeyondBoundsState(lazyGridState, composerStartRestartGroup, i111111111117), lazyGridState.getBeyondBoundsInfo(), z1119, (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation1115, z3, composerStartRestartGroup, (i111111111116 & 3670016) | (MutableVector.$stable << 6) | (i111111111116 & 7168)).then(lazyGridState.getItemAnimator$foundation_release().getModifier()), lazyGridState, orientation1115, z3, z1119, flingBehavior2, lazyGridState.getInternalInteractionSource(), null, composerStartRestartGroup, (i21113 & 112) | ((i21113 >> 12) & 7168) | (i21113 & 57344) | (458752 & i111111111116), 64), lazyGridState.getPrefetchState(), function2RememberLazyGridMeasurePolicy1114, composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier1117;
                        paddingValues3 = paddingValuesM995PaddingValues0680j_4;
                        flingBehavior3 = flingBehavior2;
                        z5 = z1119;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i15 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier2;
                            }
                            if (i16 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            } else {
                                paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i5 != 0) {
                                z4 = false;
                            } else {
                                z4 = z;
                            }
                            if ((i3 & 64) != 0) {
                                i4 &= -3670017;
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            i13 = i4;
                        } else {
                            if (i15 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier2;
                            }
                            if (i16 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            } else {
                                paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i5 != 0) {
                                z4 = false;
                            } else {
                                z4 = z;
                            }
                            if ((i3 & 64) != 0) {
                                i4 &= -3670017;
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            i13 = i4;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-649686062, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:77)");
                        }
                        int i111111111119 = i13 >> 3;
                        int i1111111111110 = i111111111119 & 14;
                        Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda1115 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(lazyGridState, function1, composerStartRestartGroup, ((i11 << 3) & 112) | i1111111111110);
                        int i1111111111111 = i13 >> 9;
                        LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState1115 = LazySemanticsKt.rememberLazyGridSemanticState(lazyGridState, z4, composerStartRestartGroup, (i1111111111111 & 112) | i1111111111110);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller1115 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                            composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller1115);
                            objRememberedValue = compositionScopedCoroutineScopeCanceller1115;
                        }
                        int i21114 = i13;
                        boolean z11110 = z4;
                        Modifier modifier1118 = companion;
                        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy1115 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda1115, lazyGridState, lazyGridSlotsProvider, paddingValuesM995PaddingValues0680j_4, z4, z2, horizontal, vertical, ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope(), (GraphicsContext) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext()), composerStartRestartGroup, (29360128 & i111111111119) | (524272 & i13) | (i1111111111111 & 3670016));
                        if (z2) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Horizontal;
                        }
                        Orientation orientation1116 = orientation;
                        composer2 = composerStartRestartGroup;
                        LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda1115, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier1118.then(lazyGridState.getRemeasurementModifier()).then(lazyGridState.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda1115, lazyLayoutSemanticStateRememberLazyGridSemanticState1115, orientation1116, z3, z11110, composerStartRestartGroup, (i1111111111111 & 57344) | ((i21114 << 3) & 458752)), LazyGridBeyondBoundsModifierKt.rememberLazyGridBeyondBoundsState(lazyGridState, composerStartRestartGroup, i1111111111110), lazyGridState.getBeyondBoundsInfo(), z11110, (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation1116, z3, composerStartRestartGroup, (i111111111119 & 3670016) | (MutableVector.$stable << 6) | (i111111111119 & 7168)).then(lazyGridState.getItemAnimator$foundation_release().getModifier()), lazyGridState, orientation1116, z3, z11110, flingBehavior2, lazyGridState.getInternalInteractionSource(), null, composerStartRestartGroup, (i21114 & 112) | ((i21114 >> 12) & 7168) | (i21114 & 57344) | (458752 & i111111111119), 64), lazyGridState.getPrefetchState(), function2RememberLazyGridMeasurePolicy1115, composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier1118;
                        paddingValues3 = paddingValuesM995PaddingValues0680j_4;
                        flingBehavior3 = flingBehavior2;
                        z5 = z11110;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt.LazyGrid.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i21115) {
                                LazyGridKt.LazyGrid(modifier3, lazyGridState, lazyGridSlotsProvider, paddingValues3, z5, z2, flingBehavior3, z3, vertical, horizontal, function1, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                            }
                        });
                    }
                }
                i4 |= 100663296;
                if ((i3 & 512) != 0) {
                    if ((i & 805306368) == 0) {
                        if (composerStartRestartGroup.changed(horizontal)) {
                            i10 = 536870912;
                        } else {
                            i10 = 268435456;
                        }
                        i4 |= i10;
                    }
                    if ((i3 & 1024) != 0) {
                        i11 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        if (composerStartRestartGroup.changedInstance(function1)) {
                            i12 = 4;
                        } else {
                            i12 = 2;
                        }
                        i11 = i2 | i12;
                    } else {
                        i11 = i2;
                    }
                    if ((i4 & 306783379) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i15 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier2;
                            }
                            if (i16 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            } else {
                                paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i5 != 0) {
                                z4 = false;
                            } else {
                                z4 = z;
                            }
                            if ((i3 & 64) != 0) {
                                i4 &= -3670017;
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            i13 = i4;
                        } else {
                            if (i15 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier2;
                            }
                            if (i16 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            } else {
                                paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i5 != 0) {
                                z4 = false;
                            } else {
                                z4 = z;
                            }
                            if ((i3 & 64) != 0) {
                                i4 &= -3670017;
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            i13 = i4;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-649686062, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:77)");
                        }
                        int i1111111111112 = i13 >> 3;
                        int i1111111111113 = i1111111111112 & 14;
                        Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda1116 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(lazyGridState, function1, composerStartRestartGroup, ((i11 << 3) & 112) | i1111111111113);
                        int i1111111111114 = i13 >> 9;
                        LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState1116 = LazySemanticsKt.rememberLazyGridSemanticState(lazyGridState, z4, composerStartRestartGroup, (i1111111111114 & 112) | i1111111111113);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller1116 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                            composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller1116);
                            objRememberedValue = compositionScopedCoroutineScopeCanceller1116;
                        }
                        int i21115 = i13;
                        boolean z11111 = z4;
                        Modifier modifier1119 = companion;
                        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy1116 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda1116, lazyGridState, lazyGridSlotsProvider, paddingValuesM995PaddingValues0680j_4, z4, z2, horizontal, vertical, ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope(), (GraphicsContext) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext()), composerStartRestartGroup, (29360128 & i1111111111112) | (524272 & i13) | (i1111111111114 & 3670016));
                        if (z2) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Horizontal;
                        }
                        Orientation orientation1117 = orientation;
                        composer2 = composerStartRestartGroup;
                        LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda1116, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier1119.then(lazyGridState.getRemeasurementModifier()).then(lazyGridState.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda1116, lazyLayoutSemanticStateRememberLazyGridSemanticState1116, orientation1117, z3, z11111, composerStartRestartGroup, (i1111111111114 & 57344) | ((i21115 << 3) & 458752)), LazyGridBeyondBoundsModifierKt.rememberLazyGridBeyondBoundsState(lazyGridState, composerStartRestartGroup, i1111111111113), lazyGridState.getBeyondBoundsInfo(), z11111, (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation1117, z3, composerStartRestartGroup, (i1111111111112 & 3670016) | (MutableVector.$stable << 6) | (i1111111111112 & 7168)).then(lazyGridState.getItemAnimator$foundation_release().getModifier()), lazyGridState, orientation1117, z3, z11111, flingBehavior2, lazyGridState.getInternalInteractionSource(), null, composerStartRestartGroup, (i21115 & 112) | ((i21115 >> 12) & 7168) | (i21115 & 57344) | (458752 & i1111111111112), 64), lazyGridState.getPrefetchState(), function2RememberLazyGridMeasurePolicy1116, composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier1119;
                        paddingValues3 = paddingValuesM995PaddingValues0680j_4;
                        flingBehavior3 = flingBehavior2;
                        z5 = z11111;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i15 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier2;
                            }
                            if (i16 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            } else {
                                paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i5 != 0) {
                                z4 = false;
                            } else {
                                z4 = z;
                            }
                            if ((i3 & 64) != 0) {
                                i4 &= -3670017;
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            i13 = i4;
                        } else {
                            if (i15 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier2;
                            }
                            if (i16 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            } else {
                                paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i5 != 0) {
                                z4 = false;
                            } else {
                                z4 = z;
                            }
                            if ((i3 & 64) != 0) {
                                i4 &= -3670017;
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            i13 = i4;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-649686062, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:77)");
                        }
                        int i1111111111115 = i13 >> 3;
                        int i1111111111116 = i1111111111115 & 14;
                        Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda1117 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(lazyGridState, function1, composerStartRestartGroup, ((i11 << 3) & 112) | i1111111111116);
                        int i1111111111117 = i13 >> 9;
                        LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState1117 = LazySemanticsKt.rememberLazyGridSemanticState(lazyGridState, z4, composerStartRestartGroup, (i1111111111117 & 112) | i1111111111116);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller1117 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                            composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller1117);
                            objRememberedValue = compositionScopedCoroutineScopeCanceller1117;
                        }
                        int i21116 = i13;
                        boolean z11112 = z4;
                        Modifier modifier11110 = companion;
                        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy1117 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda1117, lazyGridState, lazyGridSlotsProvider, paddingValuesM995PaddingValues0680j_4, z4, z2, horizontal, vertical, ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope(), (GraphicsContext) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext()), composerStartRestartGroup, (29360128 & i1111111111115) | (524272 & i13) | (i1111111111117 & 3670016));
                        if (z2) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Horizontal;
                        }
                        Orientation orientation1118 = orientation;
                        composer2 = composerStartRestartGroup;
                        LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda1117, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier11110.then(lazyGridState.getRemeasurementModifier()).then(lazyGridState.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda1117, lazyLayoutSemanticStateRememberLazyGridSemanticState1117, orientation1118, z3, z11112, composerStartRestartGroup, (i1111111111117 & 57344) | ((i21116 << 3) & 458752)), LazyGridBeyondBoundsModifierKt.rememberLazyGridBeyondBoundsState(lazyGridState, composerStartRestartGroup, i1111111111116), lazyGridState.getBeyondBoundsInfo(), z11112, (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation1118, z3, composerStartRestartGroup, (i1111111111115 & 3670016) | (MutableVector.$stable << 6) | (i1111111111115 & 7168)).then(lazyGridState.getItemAnimator$foundation_release().getModifier()), lazyGridState, orientation1118, z3, z11112, flingBehavior2, lazyGridState.getInternalInteractionSource(), null, composerStartRestartGroup, (i21116 & 112) | ((i21116 >> 12) & 7168) | (i21116 & 57344) | (458752 & i1111111111115), 64), lazyGridState.getPrefetchState(), function2RememberLazyGridMeasurePolicy1117, composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier11110;
                        paddingValues3 = paddingValuesM995PaddingValues0680j_4;
                        flingBehavior3 = flingBehavior2;
                        z5 = z11112;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt.LazyGrid.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i21117) {
                                LazyGridKt.LazyGrid(modifier3, lazyGridState, lazyGridSlotsProvider, paddingValues3, z5, z2, flingBehavior3, z3, vertical, horizontal, function1, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                            }
                        });
                    }
                }
                i4 |= 805306368;
                if ((i3 & 1024) != 0) {
                    i11 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i12 = 4;
                    } else {
                        i12 = 2;
                    }
                    i11 = i2 | i12;
                } else {
                    i11 = i2;
                }
                if ((i4 & 306783379) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i15 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier2;
                        }
                        if (i16 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        } else {
                            paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i5 != 0) {
                            z4 = false;
                        } else {
                            z4 = z;
                        }
                        if ((i3 & 64) != 0) {
                            i4 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        i13 = i4;
                    } else {
                        if (i15 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier2;
                        }
                        if (i16 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        } else {
                            paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i5 != 0) {
                            z4 = false;
                        } else {
                            z4 = z;
                        }
                        if ((i3 & 64) != 0) {
                            i4 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        i13 = i4;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-649686062, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:77)");
                    }
                    int i1111111111118 = i13 >> 3;
                    int i1111111111119 = i1111111111118 & 14;
                    Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda1118 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(lazyGridState, function1, composerStartRestartGroup, ((i11 << 3) & 112) | i1111111111119);
                    int i11111111111110 = i13 >> 9;
                    LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState1118 = LazySemanticsKt.rememberLazyGridSemanticState(lazyGridState, z4, composerStartRestartGroup, (i11111111111110 & 112) | i1111111111119);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller1118 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                        composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller1118);
                        objRememberedValue = compositionScopedCoroutineScopeCanceller1118;
                    }
                    int i21117 = i13;
                    boolean z11113 = z4;
                    Modifier modifier11111 = companion;
                    Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy1118 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda1118, lazyGridState, lazyGridSlotsProvider, paddingValuesM995PaddingValues0680j_4, z4, z2, horizontal, vertical, ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope(), (GraphicsContext) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext()), composerStartRestartGroup, (29360128 & i1111111111118) | (524272 & i13) | (i11111111111110 & 3670016));
                    if (z2) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    Orientation orientation1119 = orientation;
                    composer2 = composerStartRestartGroup;
                    LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda1118, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier11111.then(lazyGridState.getRemeasurementModifier()).then(lazyGridState.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda1118, lazyLayoutSemanticStateRememberLazyGridSemanticState1118, orientation1119, z3, z11113, composerStartRestartGroup, (i11111111111110 & 57344) | ((i21117 << 3) & 458752)), LazyGridBeyondBoundsModifierKt.rememberLazyGridBeyondBoundsState(lazyGridState, composerStartRestartGroup, i1111111111119), lazyGridState.getBeyondBoundsInfo(), z11113, (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation1119, z3, composerStartRestartGroup, (i1111111111118 & 3670016) | (MutableVector.$stable << 6) | (i1111111111118 & 7168)).then(lazyGridState.getItemAnimator$foundation_release().getModifier()), lazyGridState, orientation1119, z3, z11113, flingBehavior2, lazyGridState.getInternalInteractionSource(), null, composerStartRestartGroup, (i21117 & 112) | ((i21117 >> 12) & 7168) | (i21117 & 57344) | (458752 & i1111111111118), 64), lazyGridState.getPrefetchState(), function2RememberLazyGridMeasurePolicy1118, composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier11111;
                    paddingValues3 = paddingValuesM995PaddingValues0680j_4;
                    flingBehavior3 = flingBehavior2;
                    z5 = z11113;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i15 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier2;
                        }
                        if (i16 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        } else {
                            paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i5 != 0) {
                            z4 = false;
                        } else {
                            z4 = z;
                        }
                        if ((i3 & 64) != 0) {
                            i4 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        i13 = i4;
                    } else {
                        if (i15 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier2;
                        }
                        if (i16 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        } else {
                            paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i5 != 0) {
                            z4 = false;
                        } else {
                            z4 = z;
                        }
                        if ((i3 & 64) != 0) {
                            i4 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        i13 = i4;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-649686062, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:77)");
                    }
                    int i11111111111111 = i13 >> 3;
                    int i11111111111112 = i11111111111111 & 14;
                    Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda1119 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(lazyGridState, function1, composerStartRestartGroup, ((i11 << 3) & 112) | i11111111111112);
                    int i11111111111113 = i13 >> 9;
                    LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState1119 = LazySemanticsKt.rememberLazyGridSemanticState(lazyGridState, z4, composerStartRestartGroup, (i11111111111113 & 112) | i11111111111112);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller1119 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                        composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller1119);
                        objRememberedValue = compositionScopedCoroutineScopeCanceller1119;
                    }
                    int i21118 = i13;
                    boolean z11114 = z4;
                    Modifier modifier11112 = companion;
                    Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy1119 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda1119, lazyGridState, lazyGridSlotsProvider, paddingValuesM995PaddingValues0680j_4, z4, z2, horizontal, vertical, ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope(), (GraphicsContext) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext()), composerStartRestartGroup, (29360128 & i11111111111111) | (524272 & i13) | (i11111111111113 & 3670016));
                    if (z2) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    Orientation orientation11110 = orientation;
                    composer2 = composerStartRestartGroup;
                    LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda1119, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier11112.then(lazyGridState.getRemeasurementModifier()).then(lazyGridState.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda1119, lazyLayoutSemanticStateRememberLazyGridSemanticState1119, orientation11110, z3, z11114, composerStartRestartGroup, (i11111111111113 & 57344) | ((i21118 << 3) & 458752)), LazyGridBeyondBoundsModifierKt.rememberLazyGridBeyondBoundsState(lazyGridState, composerStartRestartGroup, i11111111111112), lazyGridState.getBeyondBoundsInfo(), z11114, (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation11110, z3, composerStartRestartGroup, (i11111111111111 & 3670016) | (MutableVector.$stable << 6) | (i11111111111111 & 7168)).then(lazyGridState.getItemAnimator$foundation_release().getModifier()), lazyGridState, orientation11110, z3, z11114, flingBehavior2, lazyGridState.getInternalInteractionSource(), null, composerStartRestartGroup, (i21118 & 112) | ((i21118 >> 12) & 7168) | (i21118 & 57344) | (458752 & i11111111111111), 64), lazyGridState.getPrefetchState(), function2RememberLazyGridMeasurePolicy1119, composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier11112;
                    paddingValues3 = paddingValuesM995PaddingValues0680j_4;
                    flingBehavior3 = flingBehavior2;
                    z5 = z11114;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt.LazyGrid.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i21119) {
                            LazyGridKt.LazyGrid(modifier3, lazyGridState, lazyGridSlotsProvider, paddingValues3, z5, z2, flingBehavior3, z3, vertical, horizontal, function1, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                        }
                    });
                }
            }
            i4 |= 12582912;
            if ((i3 & 256) != 0) {
                if ((i & 100663296) == 0) {
                    if (composerStartRestartGroup.changed(vertical)) {
                        i9 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i9 = 33554432;
                    }
                    i4 |= i9;
                }
                if ((i3 & 512) != 0) {
                    if ((i & 805306368) == 0) {
                        if (composerStartRestartGroup.changed(horizontal)) {
                            i10 = 536870912;
                        } else {
                            i10 = 268435456;
                        }
                        i4 |= i10;
                    }
                    if ((i3 & 1024) != 0) {
                        i11 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        if (composerStartRestartGroup.changedInstance(function1)) {
                            i12 = 4;
                        } else {
                            i12 = 2;
                        }
                        i11 = i2 | i12;
                    } else {
                        i11 = i2;
                    }
                    if ((i4 & 306783379) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i15 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier2;
                            }
                            if (i16 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            } else {
                                paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i5 != 0) {
                                z4 = false;
                            } else {
                                z4 = z;
                            }
                            if ((i3 & 64) != 0) {
                                i4 &= -3670017;
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            i13 = i4;
                        } else {
                            if (i15 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier2;
                            }
                            if (i16 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            } else {
                                paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i5 != 0) {
                                z4 = false;
                            } else {
                                z4 = z;
                            }
                            if ((i3 & 64) != 0) {
                                i4 &= -3670017;
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            i13 = i4;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-649686062, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:77)");
                        }
                        int i11111111111114 = i13 >> 3;
                        int i11111111111115 = i11111111111114 & 14;
                        Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda11110 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(lazyGridState, function1, composerStartRestartGroup, ((i11 << 3) & 112) | i11111111111115);
                        int i11111111111116 = i13 >> 9;
                        LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState11110 = LazySemanticsKt.rememberLazyGridSemanticState(lazyGridState, z4, composerStartRestartGroup, (i11111111111116 & 112) | i11111111111115);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller11110 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                            composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller11110);
                            objRememberedValue = compositionScopedCoroutineScopeCanceller11110;
                        }
                        int i21119 = i13;
                        boolean z11115 = z4;
                        Modifier modifier11113 = companion;
                        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy11110 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda11110, lazyGridState, lazyGridSlotsProvider, paddingValuesM995PaddingValues0680j_4, z4, z2, horizontal, vertical, ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope(), (GraphicsContext) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext()), composerStartRestartGroup, (29360128 & i11111111111114) | (524272 & i13) | (i11111111111116 & 3670016));
                        if (z2) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Horizontal;
                        }
                        Orientation orientation11111 = orientation;
                        composer2 = composerStartRestartGroup;
                        LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda11110, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier11113.then(lazyGridState.getRemeasurementModifier()).then(lazyGridState.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda11110, lazyLayoutSemanticStateRememberLazyGridSemanticState11110, orientation11111, z3, z11115, composerStartRestartGroup, (i11111111111116 & 57344) | ((i21119 << 3) & 458752)), LazyGridBeyondBoundsModifierKt.rememberLazyGridBeyondBoundsState(lazyGridState, composerStartRestartGroup, i11111111111115), lazyGridState.getBeyondBoundsInfo(), z11115, (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation11111, z3, composerStartRestartGroup, (i11111111111114 & 3670016) | (MutableVector.$stable << 6) | (i11111111111114 & 7168)).then(lazyGridState.getItemAnimator$foundation_release().getModifier()), lazyGridState, orientation11111, z3, z11115, flingBehavior2, lazyGridState.getInternalInteractionSource(), null, composerStartRestartGroup, (i21119 & 112) | ((i21119 >> 12) & 7168) | (i21119 & 57344) | (458752 & i11111111111114), 64), lazyGridState.getPrefetchState(), function2RememberLazyGridMeasurePolicy11110, composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier11113;
                        paddingValues3 = paddingValuesM995PaddingValues0680j_4;
                        flingBehavior3 = flingBehavior2;
                        z5 = z11115;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i15 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier2;
                            }
                            if (i16 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            } else {
                                paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i5 != 0) {
                                z4 = false;
                            } else {
                                z4 = z;
                            }
                            if ((i3 & 64) != 0) {
                                i4 &= -3670017;
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            i13 = i4;
                        } else {
                            if (i15 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier2;
                            }
                            if (i16 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            } else {
                                paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i5 != 0) {
                                z4 = false;
                            } else {
                                z4 = z;
                            }
                            if ((i3 & 64) != 0) {
                                i4 &= -3670017;
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            i13 = i4;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-649686062, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:77)");
                        }
                        int i11111111111117 = i13 >> 3;
                        int i11111111111118 = i11111111111117 & 14;
                        Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda11111 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(lazyGridState, function1, composerStartRestartGroup, ((i11 << 3) & 112) | i11111111111118);
                        int i11111111111119 = i13 >> 9;
                        LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState11111 = LazySemanticsKt.rememberLazyGridSemanticState(lazyGridState, z4, composerStartRestartGroup, (i11111111111119 & 112) | i11111111111118);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller11111 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                            composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller11111);
                            objRememberedValue = compositionScopedCoroutineScopeCanceller11111;
                        }
                        int i211110 = i13;
                        boolean z11116 = z4;
                        Modifier modifier11114 = companion;
                        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy11111 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda11111, lazyGridState, lazyGridSlotsProvider, paddingValuesM995PaddingValues0680j_4, z4, z2, horizontal, vertical, ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope(), (GraphicsContext) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext()), composerStartRestartGroup, (29360128 & i11111111111117) | (524272 & i13) | (i11111111111119 & 3670016));
                        if (z2) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Horizontal;
                        }
                        Orientation orientation11112 = orientation;
                        composer2 = composerStartRestartGroup;
                        LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda11111, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier11114.then(lazyGridState.getRemeasurementModifier()).then(lazyGridState.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda11111, lazyLayoutSemanticStateRememberLazyGridSemanticState11111, orientation11112, z3, z11116, composerStartRestartGroup, (i11111111111119 & 57344) | ((i211110 << 3) & 458752)), LazyGridBeyondBoundsModifierKt.rememberLazyGridBeyondBoundsState(lazyGridState, composerStartRestartGroup, i11111111111118), lazyGridState.getBeyondBoundsInfo(), z11116, (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation11112, z3, composerStartRestartGroup, (i11111111111117 & 3670016) | (MutableVector.$stable << 6) | (i11111111111117 & 7168)).then(lazyGridState.getItemAnimator$foundation_release().getModifier()), lazyGridState, orientation11112, z3, z11116, flingBehavior2, lazyGridState.getInternalInteractionSource(), null, composerStartRestartGroup, (i211110 & 112) | ((i211110 >> 12) & 7168) | (i211110 & 57344) | (458752 & i11111111111117), 64), lazyGridState.getPrefetchState(), function2RememberLazyGridMeasurePolicy11111, composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier11114;
                        paddingValues3 = paddingValuesM995PaddingValues0680j_4;
                        flingBehavior3 = flingBehavior2;
                        z5 = z11116;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt.LazyGrid.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i211111) {
                                LazyGridKt.LazyGrid(modifier3, lazyGridState, lazyGridSlotsProvider, paddingValues3, z5, z2, flingBehavior3, z3, vertical, horizontal, function1, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                            }
                        });
                    }
                }
                i4 |= 805306368;
                if ((i3 & 1024) != 0) {
                    i11 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i12 = 4;
                    } else {
                        i12 = 2;
                    }
                    i11 = i2 | i12;
                } else {
                    i11 = i2;
                }
                if ((i4 & 306783379) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i15 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier2;
                        }
                        if (i16 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        } else {
                            paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i5 != 0) {
                            z4 = false;
                        } else {
                            z4 = z;
                        }
                        if ((i3 & 64) != 0) {
                            i4 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        i13 = i4;
                    } else {
                        if (i15 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier2;
                        }
                        if (i16 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        } else {
                            paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i5 != 0) {
                            z4 = false;
                        } else {
                            z4 = z;
                        }
                        if ((i3 & 64) != 0) {
                            i4 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        i13 = i4;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-649686062, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:77)");
                    }
                    int i111111111111110 = i13 >> 3;
                    int i111111111111111 = i111111111111110 & 14;
                    Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda11112 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(lazyGridState, function1, composerStartRestartGroup, ((i11 << 3) & 112) | i111111111111111);
                    int i111111111111112 = i13 >> 9;
                    LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState11112 = LazySemanticsKt.rememberLazyGridSemanticState(lazyGridState, z4, composerStartRestartGroup, (i111111111111112 & 112) | i111111111111111);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller11112 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                        composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller11112);
                        objRememberedValue = compositionScopedCoroutineScopeCanceller11112;
                    }
                    int i211111 = i13;
                    boolean z11117 = z4;
                    Modifier modifier11115 = companion;
                    Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy11112 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda11112, lazyGridState, lazyGridSlotsProvider, paddingValuesM995PaddingValues0680j_4, z4, z2, horizontal, vertical, ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope(), (GraphicsContext) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext()), composerStartRestartGroup, (29360128 & i111111111111110) | (524272 & i13) | (i111111111111112 & 3670016));
                    if (z2) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    Orientation orientation11113 = orientation;
                    composer2 = composerStartRestartGroup;
                    LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda11112, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier11115.then(lazyGridState.getRemeasurementModifier()).then(lazyGridState.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda11112, lazyLayoutSemanticStateRememberLazyGridSemanticState11112, orientation11113, z3, z11117, composerStartRestartGroup, (i111111111111112 & 57344) | ((i211111 << 3) & 458752)), LazyGridBeyondBoundsModifierKt.rememberLazyGridBeyondBoundsState(lazyGridState, composerStartRestartGroup, i111111111111111), lazyGridState.getBeyondBoundsInfo(), z11117, (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation11113, z3, composerStartRestartGroup, (i111111111111110 & 3670016) | (MutableVector.$stable << 6) | (i111111111111110 & 7168)).then(lazyGridState.getItemAnimator$foundation_release().getModifier()), lazyGridState, orientation11113, z3, z11117, flingBehavior2, lazyGridState.getInternalInteractionSource(), null, composerStartRestartGroup, (i211111 & 112) | ((i211111 >> 12) & 7168) | (i211111 & 57344) | (458752 & i111111111111110), 64), lazyGridState.getPrefetchState(), function2RememberLazyGridMeasurePolicy11112, composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier11115;
                    paddingValues3 = paddingValuesM995PaddingValues0680j_4;
                    flingBehavior3 = flingBehavior2;
                    z5 = z11117;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i15 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier2;
                        }
                        if (i16 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        } else {
                            paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i5 != 0) {
                            z4 = false;
                        } else {
                            z4 = z;
                        }
                        if ((i3 & 64) != 0) {
                            i4 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        i13 = i4;
                    } else {
                        if (i15 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier2;
                        }
                        if (i16 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        } else {
                            paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i5 != 0) {
                            z4 = false;
                        } else {
                            z4 = z;
                        }
                        if ((i3 & 64) != 0) {
                            i4 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        i13 = i4;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-649686062, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:77)");
                    }
                    int i111111111111113 = i13 >> 3;
                    int i111111111111114 = i111111111111113 & 14;
                    Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda11113 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(lazyGridState, function1, composerStartRestartGroup, ((i11 << 3) & 112) | i111111111111114);
                    int i111111111111115 = i13 >> 9;
                    LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState11113 = LazySemanticsKt.rememberLazyGridSemanticState(lazyGridState, z4, composerStartRestartGroup, (i111111111111115 & 112) | i111111111111114);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller11113 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                        composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller11113);
                        objRememberedValue = compositionScopedCoroutineScopeCanceller11113;
                    }
                    int i211112 = i13;
                    boolean z11118 = z4;
                    Modifier modifier11116 = companion;
                    Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy11113 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda11113, lazyGridState, lazyGridSlotsProvider, paddingValuesM995PaddingValues0680j_4, z4, z2, horizontal, vertical, ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope(), (GraphicsContext) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext()), composerStartRestartGroup, (29360128 & i111111111111113) | (524272 & i13) | (i111111111111115 & 3670016));
                    if (z2) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    Orientation orientation11114 = orientation;
                    composer2 = composerStartRestartGroup;
                    LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda11113, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier11116.then(lazyGridState.getRemeasurementModifier()).then(lazyGridState.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda11113, lazyLayoutSemanticStateRememberLazyGridSemanticState11113, orientation11114, z3, z11118, composerStartRestartGroup, (i111111111111115 & 57344) | ((i211112 << 3) & 458752)), LazyGridBeyondBoundsModifierKt.rememberLazyGridBeyondBoundsState(lazyGridState, composerStartRestartGroup, i111111111111114), lazyGridState.getBeyondBoundsInfo(), z11118, (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation11114, z3, composerStartRestartGroup, (i111111111111113 & 3670016) | (MutableVector.$stable << 6) | (i111111111111113 & 7168)).then(lazyGridState.getItemAnimator$foundation_release().getModifier()), lazyGridState, orientation11114, z3, z11118, flingBehavior2, lazyGridState.getInternalInteractionSource(), null, composerStartRestartGroup, (i211112 & 112) | ((i211112 >> 12) & 7168) | (i211112 & 57344) | (458752 & i111111111111113), 64), lazyGridState.getPrefetchState(), function2RememberLazyGridMeasurePolicy11113, composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier11116;
                    paddingValues3 = paddingValuesM995PaddingValues0680j_4;
                    flingBehavior3 = flingBehavior2;
                    z5 = z11118;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt.LazyGrid.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i211113) {
                            LazyGridKt.LazyGrid(modifier3, lazyGridState, lazyGridSlotsProvider, paddingValues3, z5, z2, flingBehavior3, z3, vertical, horizontal, function1, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                        }
                    });
                }
            }
            i4 |= 100663296;
            if ((i3 & 512) != 0) {
                if ((i & 805306368) == 0) {
                    if (composerStartRestartGroup.changed(horizontal)) {
                        i10 = 536870912;
                    } else {
                        i10 = 268435456;
                    }
                    i4 |= i10;
                }
                if ((i3 & 1024) != 0) {
                    i11 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i12 = 4;
                    } else {
                        i12 = 2;
                    }
                    i11 = i2 | i12;
                } else {
                    i11 = i2;
                }
                if ((i4 & 306783379) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i15 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier2;
                        }
                        if (i16 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        } else {
                            paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i5 != 0) {
                            z4 = false;
                        } else {
                            z4 = z;
                        }
                        if ((i3 & 64) != 0) {
                            i4 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        i13 = i4;
                    } else {
                        if (i15 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier2;
                        }
                        if (i16 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        } else {
                            paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i5 != 0) {
                            z4 = false;
                        } else {
                            z4 = z;
                        }
                        if ((i3 & 64) != 0) {
                            i4 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        i13 = i4;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-649686062, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:77)");
                    }
                    int i111111111111116 = i13 >> 3;
                    int i111111111111117 = i111111111111116 & 14;
                    Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda11114 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(lazyGridState, function1, composerStartRestartGroup, ((i11 << 3) & 112) | i111111111111117);
                    int i111111111111118 = i13 >> 9;
                    LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState11114 = LazySemanticsKt.rememberLazyGridSemanticState(lazyGridState, z4, composerStartRestartGroup, (i111111111111118 & 112) | i111111111111117);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller11114 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                        composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller11114);
                        objRememberedValue = compositionScopedCoroutineScopeCanceller11114;
                    }
                    int i211113 = i13;
                    boolean z11119 = z4;
                    Modifier modifier11117 = companion;
                    Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy11114 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda11114, lazyGridState, lazyGridSlotsProvider, paddingValuesM995PaddingValues0680j_4, z4, z2, horizontal, vertical, ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope(), (GraphicsContext) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext()), composerStartRestartGroup, (29360128 & i111111111111116) | (524272 & i13) | (i111111111111118 & 3670016));
                    if (z2) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    Orientation orientation11115 = orientation;
                    composer2 = composerStartRestartGroup;
                    LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda11114, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier11117.then(lazyGridState.getRemeasurementModifier()).then(lazyGridState.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda11114, lazyLayoutSemanticStateRememberLazyGridSemanticState11114, orientation11115, z3, z11119, composerStartRestartGroup, (i111111111111118 & 57344) | ((i211113 << 3) & 458752)), LazyGridBeyondBoundsModifierKt.rememberLazyGridBeyondBoundsState(lazyGridState, composerStartRestartGroup, i111111111111117), lazyGridState.getBeyondBoundsInfo(), z11119, (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation11115, z3, composerStartRestartGroup, (i111111111111116 & 3670016) | (MutableVector.$stable << 6) | (i111111111111116 & 7168)).then(lazyGridState.getItemAnimator$foundation_release().getModifier()), lazyGridState, orientation11115, z3, z11119, flingBehavior2, lazyGridState.getInternalInteractionSource(), null, composerStartRestartGroup, (i211113 & 112) | ((i211113 >> 12) & 7168) | (i211113 & 57344) | (458752 & i111111111111116), 64), lazyGridState.getPrefetchState(), function2RememberLazyGridMeasurePolicy11114, composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier11117;
                    paddingValues3 = paddingValuesM995PaddingValues0680j_4;
                    flingBehavior3 = flingBehavior2;
                    z5 = z11119;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i15 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier2;
                        }
                        if (i16 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        } else {
                            paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i5 != 0) {
                            z4 = false;
                        } else {
                            z4 = z;
                        }
                        if ((i3 & 64) != 0) {
                            i4 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        i13 = i4;
                    } else {
                        if (i15 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier2;
                        }
                        if (i16 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        } else {
                            paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i5 != 0) {
                            z4 = false;
                        } else {
                            z4 = z;
                        }
                        if ((i3 & 64) != 0) {
                            i4 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        i13 = i4;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-649686062, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:77)");
                    }
                    int i111111111111119 = i13 >> 3;
                    int i1111111111111110 = i111111111111119 & 14;
                    Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda11115 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(lazyGridState, function1, composerStartRestartGroup, ((i11 << 3) & 112) | i1111111111111110);
                    int i1111111111111111 = i13 >> 9;
                    LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState11115 = LazySemanticsKt.rememberLazyGridSemanticState(lazyGridState, z4, composerStartRestartGroup, (i1111111111111111 & 112) | i1111111111111110);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller11115 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                        composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller11115);
                        objRememberedValue = compositionScopedCoroutineScopeCanceller11115;
                    }
                    int i211114 = i13;
                    boolean z111110 = z4;
                    Modifier modifier11118 = companion;
                    Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy11115 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda11115, lazyGridState, lazyGridSlotsProvider, paddingValuesM995PaddingValues0680j_4, z4, z2, horizontal, vertical, ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope(), (GraphicsContext) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext()), composerStartRestartGroup, (29360128 & i111111111111119) | (524272 & i13) | (i1111111111111111 & 3670016));
                    if (z2) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    Orientation orientation11116 = orientation;
                    composer2 = composerStartRestartGroup;
                    LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda11115, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier11118.then(lazyGridState.getRemeasurementModifier()).then(lazyGridState.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda11115, lazyLayoutSemanticStateRememberLazyGridSemanticState11115, orientation11116, z3, z111110, composerStartRestartGroup, (i1111111111111111 & 57344) | ((i211114 << 3) & 458752)), LazyGridBeyondBoundsModifierKt.rememberLazyGridBeyondBoundsState(lazyGridState, composerStartRestartGroup, i1111111111111110), lazyGridState.getBeyondBoundsInfo(), z111110, (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation11116, z3, composerStartRestartGroup, (i111111111111119 & 3670016) | (MutableVector.$stable << 6) | (i111111111111119 & 7168)).then(lazyGridState.getItemAnimator$foundation_release().getModifier()), lazyGridState, orientation11116, z3, z111110, flingBehavior2, lazyGridState.getInternalInteractionSource(), null, composerStartRestartGroup, (i211114 & 112) | ((i211114 >> 12) & 7168) | (i211114 & 57344) | (458752 & i111111111111119), 64), lazyGridState.getPrefetchState(), function2RememberLazyGridMeasurePolicy11115, composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier11118;
                    paddingValues3 = paddingValuesM995PaddingValues0680j_4;
                    flingBehavior3 = flingBehavior2;
                    z5 = z111110;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt.LazyGrid.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i211115) {
                            LazyGridKt.LazyGrid(modifier3, lazyGridState, lazyGridSlotsProvider, paddingValues3, z5, z2, flingBehavior3, z3, vertical, horizontal, function1, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                        }
                    });
                }
            }
            i4 |= 805306368;
            if ((i3 & 1024) != 0) {
                i11 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i12 = 4;
                } else {
                    i12 = 2;
                }
                i11 = i2 | i12;
            } else {
                i11 = i2;
            }
            if ((i4 & 306783379) == 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i15 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if (i16 != 0) {
                        paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                    } else {
                        paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i5 != 0) {
                        z4 = false;
                    } else {
                        z4 = z;
                    }
                    if ((i3 & 64) != 0) {
                        i4 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    i13 = i4;
                } else {
                    if (i15 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if (i16 != 0) {
                        paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                    } else {
                        paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i5 != 0) {
                        z4 = false;
                    } else {
                        z4 = z;
                    }
                    if ((i3 & 64) != 0) {
                        i4 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    i13 = i4;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-649686062, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:77)");
                }
                int i1111111111111112 = i13 >> 3;
                int i1111111111111113 = i1111111111111112 & 14;
                Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda11116 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(lazyGridState, function1, composerStartRestartGroup, ((i11 << 3) & 112) | i1111111111111113);
                int i1111111111111114 = i13 >> 9;
                LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState11116 = LazySemanticsKt.rememberLazyGridSemanticState(lazyGridState, z4, composerStartRestartGroup, (i1111111111111114 & 112) | i1111111111111113);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller11116 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                    composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller11116);
                    objRememberedValue = compositionScopedCoroutineScopeCanceller11116;
                }
                int i211115 = i13;
                boolean z111111 = z4;
                Modifier modifier11119 = companion;
                Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy11116 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda11116, lazyGridState, lazyGridSlotsProvider, paddingValuesM995PaddingValues0680j_4, z4, z2, horizontal, vertical, ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope(), (GraphicsContext) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext()), composerStartRestartGroup, (29360128 & i1111111111111112) | (524272 & i13) | (i1111111111111114 & 3670016));
                if (z2) {
                    orientation = Orientation.Vertical;
                } else {
                    orientation = Orientation.Horizontal;
                }
                Orientation orientation11117 = orientation;
                composer2 = composerStartRestartGroup;
                LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda11116, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier11119.then(lazyGridState.getRemeasurementModifier()).then(lazyGridState.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda11116, lazyLayoutSemanticStateRememberLazyGridSemanticState11116, orientation11117, z3, z111111, composerStartRestartGroup, (i1111111111111114 & 57344) | ((i211115 << 3) & 458752)), LazyGridBeyondBoundsModifierKt.rememberLazyGridBeyondBoundsState(lazyGridState, composerStartRestartGroup, i1111111111111113), lazyGridState.getBeyondBoundsInfo(), z111111, (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation11117, z3, composerStartRestartGroup, (i1111111111111112 & 3670016) | (MutableVector.$stable << 6) | (i1111111111111112 & 7168)).then(lazyGridState.getItemAnimator$foundation_release().getModifier()), lazyGridState, orientation11117, z3, z111111, flingBehavior2, lazyGridState.getInternalInteractionSource(), null, composerStartRestartGroup, (i211115 & 112) | ((i211115 >> 12) & 7168) | (i211115 & 57344) | (458752 & i1111111111111112), 64), lazyGridState.getPrefetchState(), function2RememberLazyGridMeasurePolicy11116, composer2, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier11119;
                paddingValues3 = paddingValuesM995PaddingValues0680j_4;
                flingBehavior3 = flingBehavior2;
                z5 = z111111;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i15 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if (i16 != 0) {
                        paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                    } else {
                        paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i5 != 0) {
                        z4 = false;
                    } else {
                        z4 = z;
                    }
                    if ((i3 & 64) != 0) {
                        i4 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    i13 = i4;
                } else {
                    if (i15 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if (i16 != 0) {
                        paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                    } else {
                        paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i5 != 0) {
                        z4 = false;
                    } else {
                        z4 = z;
                    }
                    if ((i3 & 64) != 0) {
                        i4 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    i13 = i4;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-649686062, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:77)");
                }
                int i1111111111111115 = i13 >> 3;
                int i1111111111111116 = i1111111111111115 & 14;
                Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda11117 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(lazyGridState, function1, composerStartRestartGroup, ((i11 << 3) & 112) | i1111111111111116);
                int i1111111111111117 = i13 >> 9;
                LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState11117 = LazySemanticsKt.rememberLazyGridSemanticState(lazyGridState, z4, composerStartRestartGroup, (i1111111111111117 & 112) | i1111111111111116);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller11117 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                    composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller11117);
                    objRememberedValue = compositionScopedCoroutineScopeCanceller11117;
                }
                int i211116 = i13;
                boolean z111112 = z4;
                Modifier modifier111110 = companion;
                Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy11117 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda11117, lazyGridState, lazyGridSlotsProvider, paddingValuesM995PaddingValues0680j_4, z4, z2, horizontal, vertical, ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope(), (GraphicsContext) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext()), composerStartRestartGroup, (29360128 & i1111111111111115) | (524272 & i13) | (i1111111111111117 & 3670016));
                if (z2) {
                    orientation = Orientation.Vertical;
                } else {
                    orientation = Orientation.Horizontal;
                }
                Orientation orientation11118 = orientation;
                composer2 = composerStartRestartGroup;
                LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda11117, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier111110.then(lazyGridState.getRemeasurementModifier()).then(lazyGridState.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda11117, lazyLayoutSemanticStateRememberLazyGridSemanticState11117, orientation11118, z3, z111112, composerStartRestartGroup, (i1111111111111117 & 57344) | ((i211116 << 3) & 458752)), LazyGridBeyondBoundsModifierKt.rememberLazyGridBeyondBoundsState(lazyGridState, composerStartRestartGroup, i1111111111111116), lazyGridState.getBeyondBoundsInfo(), z111112, (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation11118, z3, composerStartRestartGroup, (i1111111111111115 & 3670016) | (MutableVector.$stable << 6) | (i1111111111111115 & 7168)).then(lazyGridState.getItemAnimator$foundation_release().getModifier()), lazyGridState, orientation11118, z3, z111112, flingBehavior2, lazyGridState.getInternalInteractionSource(), null, composerStartRestartGroup, (i211116 & 112) | ((i211116 >> 12) & 7168) | (i211116 & 57344) | (458752 & i1111111111111115), 64), lazyGridState.getPrefetchState(), function2RememberLazyGridMeasurePolicy11117, composer2, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier111110;
                paddingValues3 = paddingValuesM995PaddingValues0680j_4;
                flingBehavior3 = flingBehavior2;
                z5 = z111112;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt.LazyGrid.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i211117) {
                        LazyGridKt.LazyGrid(modifier3, lazyGridState, lazyGridSlotsProvider, paddingValues3, z5, z2, flingBehavior3, z3, vertical, horizontal, function1, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                    }
                });
            }
        }
        i4 |= 24576;
        if ((i3 & 32) != 0) {
            i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            if (composerStartRestartGroup.changed(z2)) {
                i7 = 131072;
            } else {
                i7 = 65536;
            }
            i4 |= i7;
        }
        if ((i & 1572864) != 0) {
            if ((i3 & 64) == 0) {
                i14 = 524288;
            } else {
                i14 = 524288;
            }
            i4 |= i14;
        }
        if ((i3 & 128) != 0) {
            if ((i & 12582912) == 0) {
                if (composerStartRestartGroup.changed(z3)) {
                    i8 = 8388608;
                } else {
                    i8 = 4194304;
                }
                i4 |= i8;
            }
            if ((i3 & 256) != 0) {
                if ((i & 100663296) == 0) {
                    if (composerStartRestartGroup.changed(vertical)) {
                        i9 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i9 = 33554432;
                    }
                    i4 |= i9;
                }
                if ((i3 & 512) != 0) {
                    if ((i & 805306368) == 0) {
                        if (composerStartRestartGroup.changed(horizontal)) {
                            i10 = 536870912;
                        } else {
                            i10 = 268435456;
                        }
                        i4 |= i10;
                    }
                    if ((i3 & 1024) != 0) {
                        i11 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        if (composerStartRestartGroup.changedInstance(function1)) {
                            i12 = 4;
                        } else {
                            i12 = 2;
                        }
                        i11 = i2 | i12;
                    } else {
                        i11 = i2;
                    }
                    if ((i4 & 306783379) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i15 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier2;
                            }
                            if (i16 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            } else {
                                paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i5 != 0) {
                                z4 = false;
                            } else {
                                z4 = z;
                            }
                            if ((i3 & 64) != 0) {
                                i4 &= -3670017;
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            i13 = i4;
                        } else {
                            if (i15 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier2;
                            }
                            if (i16 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            } else {
                                paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i5 != 0) {
                                z4 = false;
                            } else {
                                z4 = z;
                            }
                            if ((i3 & 64) != 0) {
                                i4 &= -3670017;
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            i13 = i4;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-649686062, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:77)");
                        }
                        int i1111111111111118 = i13 >> 3;
                        int i1111111111111119 = i1111111111111118 & 14;
                        Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda11118 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(lazyGridState, function1, composerStartRestartGroup, ((i11 << 3) & 112) | i1111111111111119);
                        int i11111111111111110 = i13 >> 9;
                        LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState11118 = LazySemanticsKt.rememberLazyGridSemanticState(lazyGridState, z4, composerStartRestartGroup, (i11111111111111110 & 112) | i1111111111111119);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller11118 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                            composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller11118);
                            objRememberedValue = compositionScopedCoroutineScopeCanceller11118;
                        }
                        int i211117 = i13;
                        boolean z111113 = z4;
                        Modifier modifier111111 = companion;
                        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy11118 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda11118, lazyGridState, lazyGridSlotsProvider, paddingValuesM995PaddingValues0680j_4, z4, z2, horizontal, vertical, ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope(), (GraphicsContext) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext()), composerStartRestartGroup, (29360128 & i1111111111111118) | (524272 & i13) | (i11111111111111110 & 3670016));
                        if (z2) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Horizontal;
                        }
                        Orientation orientation11119 = orientation;
                        composer2 = composerStartRestartGroup;
                        LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda11118, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier111111.then(lazyGridState.getRemeasurementModifier()).then(lazyGridState.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda11118, lazyLayoutSemanticStateRememberLazyGridSemanticState11118, orientation11119, z3, z111113, composerStartRestartGroup, (i11111111111111110 & 57344) | ((i211117 << 3) & 458752)), LazyGridBeyondBoundsModifierKt.rememberLazyGridBeyondBoundsState(lazyGridState, composerStartRestartGroup, i1111111111111119), lazyGridState.getBeyondBoundsInfo(), z111113, (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation11119, z3, composerStartRestartGroup, (i1111111111111118 & 3670016) | (MutableVector.$stable << 6) | (i1111111111111118 & 7168)).then(lazyGridState.getItemAnimator$foundation_release().getModifier()), lazyGridState, orientation11119, z3, z111113, flingBehavior2, lazyGridState.getInternalInteractionSource(), null, composerStartRestartGroup, (i211117 & 112) | ((i211117 >> 12) & 7168) | (i211117 & 57344) | (458752 & i1111111111111118), 64), lazyGridState.getPrefetchState(), function2RememberLazyGridMeasurePolicy11118, composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier111111;
                        paddingValues3 = paddingValuesM995PaddingValues0680j_4;
                        flingBehavior3 = flingBehavior2;
                        z5 = z111113;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i15 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier2;
                            }
                            if (i16 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            } else {
                                paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i5 != 0) {
                                z4 = false;
                            } else {
                                z4 = z;
                            }
                            if ((i3 & 64) != 0) {
                                i4 &= -3670017;
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            i13 = i4;
                        } else {
                            if (i15 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier2;
                            }
                            if (i16 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            } else {
                                paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i5 != 0) {
                                z4 = false;
                            } else {
                                z4 = z;
                            }
                            if ((i3 & 64) != 0) {
                                i4 &= -3670017;
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            i13 = i4;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-649686062, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:77)");
                        }
                        int i11111111111111111 = i13 >> 3;
                        int i11111111111111112 = i11111111111111111 & 14;
                        Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda11119 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(lazyGridState, function1, composerStartRestartGroup, ((i11 << 3) & 112) | i11111111111111112);
                        int i11111111111111113 = i13 >> 9;
                        LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState11119 = LazySemanticsKt.rememberLazyGridSemanticState(lazyGridState, z4, composerStartRestartGroup, (i11111111111111113 & 112) | i11111111111111112);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller11119 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                            composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller11119);
                            objRememberedValue = compositionScopedCoroutineScopeCanceller11119;
                        }
                        int i211118 = i13;
                        boolean z111114 = z4;
                        Modifier modifier111112 = companion;
                        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy11119 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda11119, lazyGridState, lazyGridSlotsProvider, paddingValuesM995PaddingValues0680j_4, z4, z2, horizontal, vertical, ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope(), (GraphicsContext) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext()), composerStartRestartGroup, (29360128 & i11111111111111111) | (524272 & i13) | (i11111111111111113 & 3670016));
                        if (z2) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Horizontal;
                        }
                        Orientation orientation111110 = orientation;
                        composer2 = composerStartRestartGroup;
                        LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda11119, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier111112.then(lazyGridState.getRemeasurementModifier()).then(lazyGridState.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda11119, lazyLayoutSemanticStateRememberLazyGridSemanticState11119, orientation111110, z3, z111114, composerStartRestartGroup, (i11111111111111113 & 57344) | ((i211118 << 3) & 458752)), LazyGridBeyondBoundsModifierKt.rememberLazyGridBeyondBoundsState(lazyGridState, composerStartRestartGroup, i11111111111111112), lazyGridState.getBeyondBoundsInfo(), z111114, (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation111110, z3, composerStartRestartGroup, (i11111111111111111 & 3670016) | (MutableVector.$stable << 6) | (i11111111111111111 & 7168)).then(lazyGridState.getItemAnimator$foundation_release().getModifier()), lazyGridState, orientation111110, z3, z111114, flingBehavior2, lazyGridState.getInternalInteractionSource(), null, composerStartRestartGroup, (i211118 & 112) | ((i211118 >> 12) & 7168) | (i211118 & 57344) | (458752 & i11111111111111111), 64), lazyGridState.getPrefetchState(), function2RememberLazyGridMeasurePolicy11119, composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier111112;
                        paddingValues3 = paddingValuesM995PaddingValues0680j_4;
                        flingBehavior3 = flingBehavior2;
                        z5 = z111114;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt.LazyGrid.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i211119) {
                                LazyGridKt.LazyGrid(modifier3, lazyGridState, lazyGridSlotsProvider, paddingValues3, z5, z2, flingBehavior3, z3, vertical, horizontal, function1, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                            }
                        });
                    }
                }
                i4 |= 805306368;
                if ((i3 & 1024) != 0) {
                    i11 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i12 = 4;
                    } else {
                        i12 = 2;
                    }
                    i11 = i2 | i12;
                } else {
                    i11 = i2;
                }
                if ((i4 & 306783379) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i15 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier2;
                        }
                        if (i16 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        } else {
                            paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i5 != 0) {
                            z4 = false;
                        } else {
                            z4 = z;
                        }
                        if ((i3 & 64) != 0) {
                            i4 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        i13 = i4;
                    } else {
                        if (i15 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier2;
                        }
                        if (i16 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        } else {
                            paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i5 != 0) {
                            z4 = false;
                        } else {
                            z4 = z;
                        }
                        if ((i3 & 64) != 0) {
                            i4 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        i13 = i4;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-649686062, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:77)");
                    }
                    int i11111111111111114 = i13 >> 3;
                    int i11111111111111115 = i11111111111111114 & 14;
                    Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda111110 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(lazyGridState, function1, composerStartRestartGroup, ((i11 << 3) & 112) | i11111111111111115);
                    int i11111111111111116 = i13 >> 9;
                    LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState111110 = LazySemanticsKt.rememberLazyGridSemanticState(lazyGridState, z4, composerStartRestartGroup, (i11111111111111116 & 112) | i11111111111111115);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller111110 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                        composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller111110);
                        objRememberedValue = compositionScopedCoroutineScopeCanceller111110;
                    }
                    int i211119 = i13;
                    boolean z111115 = z4;
                    Modifier modifier111113 = companion;
                    Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy111110 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda111110, lazyGridState, lazyGridSlotsProvider, paddingValuesM995PaddingValues0680j_4, z4, z2, horizontal, vertical, ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope(), (GraphicsContext) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext()), composerStartRestartGroup, (29360128 & i11111111111111114) | (524272 & i13) | (i11111111111111116 & 3670016));
                    if (z2) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    Orientation orientation111111 = orientation;
                    composer2 = composerStartRestartGroup;
                    LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda111110, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier111113.then(lazyGridState.getRemeasurementModifier()).then(lazyGridState.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda111110, lazyLayoutSemanticStateRememberLazyGridSemanticState111110, orientation111111, z3, z111115, composerStartRestartGroup, (i11111111111111116 & 57344) | ((i211119 << 3) & 458752)), LazyGridBeyondBoundsModifierKt.rememberLazyGridBeyondBoundsState(lazyGridState, composerStartRestartGroup, i11111111111111115), lazyGridState.getBeyondBoundsInfo(), z111115, (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation111111, z3, composerStartRestartGroup, (i11111111111111114 & 3670016) | (MutableVector.$stable << 6) | (i11111111111111114 & 7168)).then(lazyGridState.getItemAnimator$foundation_release().getModifier()), lazyGridState, orientation111111, z3, z111115, flingBehavior2, lazyGridState.getInternalInteractionSource(), null, composerStartRestartGroup, (i211119 & 112) | ((i211119 >> 12) & 7168) | (i211119 & 57344) | (458752 & i11111111111111114), 64), lazyGridState.getPrefetchState(), function2RememberLazyGridMeasurePolicy111110, composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier111113;
                    paddingValues3 = paddingValuesM995PaddingValues0680j_4;
                    flingBehavior3 = flingBehavior2;
                    z5 = z111115;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i15 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier2;
                        }
                        if (i16 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        } else {
                            paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i5 != 0) {
                            z4 = false;
                        } else {
                            z4 = z;
                        }
                        if ((i3 & 64) != 0) {
                            i4 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        i13 = i4;
                    } else {
                        if (i15 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier2;
                        }
                        if (i16 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        } else {
                            paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i5 != 0) {
                            z4 = false;
                        } else {
                            z4 = z;
                        }
                        if ((i3 & 64) != 0) {
                            i4 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        i13 = i4;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-649686062, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:77)");
                    }
                    int i11111111111111117 = i13 >> 3;
                    int i11111111111111118 = i11111111111111117 & 14;
                    Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda111111 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(lazyGridState, function1, composerStartRestartGroup, ((i11 << 3) & 112) | i11111111111111118);
                    int i11111111111111119 = i13 >> 9;
                    LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState111111 = LazySemanticsKt.rememberLazyGridSemanticState(lazyGridState, z4, composerStartRestartGroup, (i11111111111111119 & 112) | i11111111111111118);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller111111 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                        composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller111111);
                        objRememberedValue = compositionScopedCoroutineScopeCanceller111111;
                    }
                    int i2111110 = i13;
                    boolean z111116 = z4;
                    Modifier modifier111114 = companion;
                    Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy111111 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda111111, lazyGridState, lazyGridSlotsProvider, paddingValuesM995PaddingValues0680j_4, z4, z2, horizontal, vertical, ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope(), (GraphicsContext) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext()), composerStartRestartGroup, (29360128 & i11111111111111117) | (524272 & i13) | (i11111111111111119 & 3670016));
                    if (z2) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    Orientation orientation111112 = orientation;
                    composer2 = composerStartRestartGroup;
                    LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda111111, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier111114.then(lazyGridState.getRemeasurementModifier()).then(lazyGridState.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda111111, lazyLayoutSemanticStateRememberLazyGridSemanticState111111, orientation111112, z3, z111116, composerStartRestartGroup, (i11111111111111119 & 57344) | ((i2111110 << 3) & 458752)), LazyGridBeyondBoundsModifierKt.rememberLazyGridBeyondBoundsState(lazyGridState, composerStartRestartGroup, i11111111111111118), lazyGridState.getBeyondBoundsInfo(), z111116, (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation111112, z3, composerStartRestartGroup, (i11111111111111117 & 3670016) | (MutableVector.$stable << 6) | (i11111111111111117 & 7168)).then(lazyGridState.getItemAnimator$foundation_release().getModifier()), lazyGridState, orientation111112, z3, z111116, flingBehavior2, lazyGridState.getInternalInteractionSource(), null, composerStartRestartGroup, (i2111110 & 112) | ((i2111110 >> 12) & 7168) | (i2111110 & 57344) | (458752 & i11111111111111117), 64), lazyGridState.getPrefetchState(), function2RememberLazyGridMeasurePolicy111111, composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier111114;
                    paddingValues3 = paddingValuesM995PaddingValues0680j_4;
                    flingBehavior3 = flingBehavior2;
                    z5 = z111116;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt.LazyGrid.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i2111111) {
                            LazyGridKt.LazyGrid(modifier3, lazyGridState, lazyGridSlotsProvider, paddingValues3, z5, z2, flingBehavior3, z3, vertical, horizontal, function1, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                        }
                    });
                }
            }
            i4 |= 100663296;
            if ((i3 & 512) != 0) {
                if ((i & 805306368) == 0) {
                    if (composerStartRestartGroup.changed(horizontal)) {
                        i10 = 536870912;
                    } else {
                        i10 = 268435456;
                    }
                    i4 |= i10;
                }
                if ((i3 & 1024) != 0) {
                    i11 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i12 = 4;
                    } else {
                        i12 = 2;
                    }
                    i11 = i2 | i12;
                } else {
                    i11 = i2;
                }
                if ((i4 & 306783379) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i15 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier2;
                        }
                        if (i16 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        } else {
                            paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i5 != 0) {
                            z4 = false;
                        } else {
                            z4 = z;
                        }
                        if ((i3 & 64) != 0) {
                            i4 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        i13 = i4;
                    } else {
                        if (i15 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier2;
                        }
                        if (i16 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        } else {
                            paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i5 != 0) {
                            z4 = false;
                        } else {
                            z4 = z;
                        }
                        if ((i3 & 64) != 0) {
                            i4 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        i13 = i4;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-649686062, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:77)");
                    }
                    int i111111111111111110 = i13 >> 3;
                    int i111111111111111111 = i111111111111111110 & 14;
                    Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda111112 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(lazyGridState, function1, composerStartRestartGroup, ((i11 << 3) & 112) | i111111111111111111);
                    int i111111111111111112 = i13 >> 9;
                    LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState111112 = LazySemanticsKt.rememberLazyGridSemanticState(lazyGridState, z4, composerStartRestartGroup, (i111111111111111112 & 112) | i111111111111111111);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller111112 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                        composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller111112);
                        objRememberedValue = compositionScopedCoroutineScopeCanceller111112;
                    }
                    int i2111111 = i13;
                    boolean z111117 = z4;
                    Modifier modifier111115 = companion;
                    Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy111112 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda111112, lazyGridState, lazyGridSlotsProvider, paddingValuesM995PaddingValues0680j_4, z4, z2, horizontal, vertical, ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope(), (GraphicsContext) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext()), composerStartRestartGroup, (29360128 & i111111111111111110) | (524272 & i13) | (i111111111111111112 & 3670016));
                    if (z2) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    Orientation orientation111113 = orientation;
                    composer2 = composerStartRestartGroup;
                    LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda111112, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier111115.then(lazyGridState.getRemeasurementModifier()).then(lazyGridState.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda111112, lazyLayoutSemanticStateRememberLazyGridSemanticState111112, orientation111113, z3, z111117, composerStartRestartGroup, (i111111111111111112 & 57344) | ((i2111111 << 3) & 458752)), LazyGridBeyondBoundsModifierKt.rememberLazyGridBeyondBoundsState(lazyGridState, composerStartRestartGroup, i111111111111111111), lazyGridState.getBeyondBoundsInfo(), z111117, (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation111113, z3, composerStartRestartGroup, (i111111111111111110 & 3670016) | (MutableVector.$stable << 6) | (i111111111111111110 & 7168)).then(lazyGridState.getItemAnimator$foundation_release().getModifier()), lazyGridState, orientation111113, z3, z111117, flingBehavior2, lazyGridState.getInternalInteractionSource(), null, composerStartRestartGroup, (i2111111 & 112) | ((i2111111 >> 12) & 7168) | (i2111111 & 57344) | (458752 & i111111111111111110), 64), lazyGridState.getPrefetchState(), function2RememberLazyGridMeasurePolicy111112, composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier111115;
                    paddingValues3 = paddingValuesM995PaddingValues0680j_4;
                    flingBehavior3 = flingBehavior2;
                    z5 = z111117;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i15 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier2;
                        }
                        if (i16 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        } else {
                            paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i5 != 0) {
                            z4 = false;
                        } else {
                            z4 = z;
                        }
                        if ((i3 & 64) != 0) {
                            i4 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        i13 = i4;
                    } else {
                        if (i15 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier2;
                        }
                        if (i16 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        } else {
                            paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i5 != 0) {
                            z4 = false;
                        } else {
                            z4 = z;
                        }
                        if ((i3 & 64) != 0) {
                            i4 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        i13 = i4;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-649686062, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:77)");
                    }
                    int i111111111111111113 = i13 >> 3;
                    int i111111111111111114 = i111111111111111113 & 14;
                    Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda111113 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(lazyGridState, function1, composerStartRestartGroup, ((i11 << 3) & 112) | i111111111111111114);
                    int i111111111111111115 = i13 >> 9;
                    LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState111113 = LazySemanticsKt.rememberLazyGridSemanticState(lazyGridState, z4, composerStartRestartGroup, (i111111111111111115 & 112) | i111111111111111114);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller111113 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                        composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller111113);
                        objRememberedValue = compositionScopedCoroutineScopeCanceller111113;
                    }
                    int i2111112 = i13;
                    boolean z111118 = z4;
                    Modifier modifier111116 = companion;
                    Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy111113 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda111113, lazyGridState, lazyGridSlotsProvider, paddingValuesM995PaddingValues0680j_4, z4, z2, horizontal, vertical, ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope(), (GraphicsContext) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext()), composerStartRestartGroup, (29360128 & i111111111111111113) | (524272 & i13) | (i111111111111111115 & 3670016));
                    if (z2) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    Orientation orientation111114 = orientation;
                    composer2 = composerStartRestartGroup;
                    LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda111113, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier111116.then(lazyGridState.getRemeasurementModifier()).then(lazyGridState.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda111113, lazyLayoutSemanticStateRememberLazyGridSemanticState111113, orientation111114, z3, z111118, composerStartRestartGroup, (i111111111111111115 & 57344) | ((i2111112 << 3) & 458752)), LazyGridBeyondBoundsModifierKt.rememberLazyGridBeyondBoundsState(lazyGridState, composerStartRestartGroup, i111111111111111114), lazyGridState.getBeyondBoundsInfo(), z111118, (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation111114, z3, composerStartRestartGroup, (i111111111111111113 & 3670016) | (MutableVector.$stable << 6) | (i111111111111111113 & 7168)).then(lazyGridState.getItemAnimator$foundation_release().getModifier()), lazyGridState, orientation111114, z3, z111118, flingBehavior2, lazyGridState.getInternalInteractionSource(), null, composerStartRestartGroup, (i2111112 & 112) | ((i2111112 >> 12) & 7168) | (i2111112 & 57344) | (458752 & i111111111111111113), 64), lazyGridState.getPrefetchState(), function2RememberLazyGridMeasurePolicy111113, composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier111116;
                    paddingValues3 = paddingValuesM995PaddingValues0680j_4;
                    flingBehavior3 = flingBehavior2;
                    z5 = z111118;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt.LazyGrid.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i2111113) {
                            LazyGridKt.LazyGrid(modifier3, lazyGridState, lazyGridSlotsProvider, paddingValues3, z5, z2, flingBehavior3, z3, vertical, horizontal, function1, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                        }
                    });
                }
            }
            i4 |= 805306368;
            if ((i3 & 1024) != 0) {
                i11 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i12 = 4;
                } else {
                    i12 = 2;
                }
                i11 = i2 | i12;
            } else {
                i11 = i2;
            }
            if ((i4 & 306783379) == 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i15 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if (i16 != 0) {
                        paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                    } else {
                        paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i5 != 0) {
                        z4 = false;
                    } else {
                        z4 = z;
                    }
                    if ((i3 & 64) != 0) {
                        i4 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    i13 = i4;
                } else {
                    if (i15 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if (i16 != 0) {
                        paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                    } else {
                        paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i5 != 0) {
                        z4 = false;
                    } else {
                        z4 = z;
                    }
                    if ((i3 & 64) != 0) {
                        i4 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    i13 = i4;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-649686062, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:77)");
                }
                int i111111111111111116 = i13 >> 3;
                int i111111111111111117 = i111111111111111116 & 14;
                Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda111114 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(lazyGridState, function1, composerStartRestartGroup, ((i11 << 3) & 112) | i111111111111111117);
                int i111111111111111118 = i13 >> 9;
                LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState111114 = LazySemanticsKt.rememberLazyGridSemanticState(lazyGridState, z4, composerStartRestartGroup, (i111111111111111118 & 112) | i111111111111111117);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller111114 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                    composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller111114);
                    objRememberedValue = compositionScopedCoroutineScopeCanceller111114;
                }
                int i2111113 = i13;
                boolean z111119 = z4;
                Modifier modifier111117 = companion;
                Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy111114 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda111114, lazyGridState, lazyGridSlotsProvider, paddingValuesM995PaddingValues0680j_4, z4, z2, horizontal, vertical, ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope(), (GraphicsContext) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext()), composerStartRestartGroup, (29360128 & i111111111111111116) | (524272 & i13) | (i111111111111111118 & 3670016));
                if (z2) {
                    orientation = Orientation.Vertical;
                } else {
                    orientation = Orientation.Horizontal;
                }
                Orientation orientation111115 = orientation;
                composer2 = composerStartRestartGroup;
                LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda111114, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier111117.then(lazyGridState.getRemeasurementModifier()).then(lazyGridState.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda111114, lazyLayoutSemanticStateRememberLazyGridSemanticState111114, orientation111115, z3, z111119, composerStartRestartGroup, (i111111111111111118 & 57344) | ((i2111113 << 3) & 458752)), LazyGridBeyondBoundsModifierKt.rememberLazyGridBeyondBoundsState(lazyGridState, composerStartRestartGroup, i111111111111111117), lazyGridState.getBeyondBoundsInfo(), z111119, (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation111115, z3, composerStartRestartGroup, (i111111111111111116 & 3670016) | (MutableVector.$stable << 6) | (i111111111111111116 & 7168)).then(lazyGridState.getItemAnimator$foundation_release().getModifier()), lazyGridState, orientation111115, z3, z111119, flingBehavior2, lazyGridState.getInternalInteractionSource(), null, composerStartRestartGroup, (i2111113 & 112) | ((i2111113 >> 12) & 7168) | (i2111113 & 57344) | (458752 & i111111111111111116), 64), lazyGridState.getPrefetchState(), function2RememberLazyGridMeasurePolicy111114, composer2, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier111117;
                paddingValues3 = paddingValuesM995PaddingValues0680j_4;
                flingBehavior3 = flingBehavior2;
                z5 = z111119;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i15 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if (i16 != 0) {
                        paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                    } else {
                        paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i5 != 0) {
                        z4 = false;
                    } else {
                        z4 = z;
                    }
                    if ((i3 & 64) != 0) {
                        i4 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    i13 = i4;
                } else {
                    if (i15 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if (i16 != 0) {
                        paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                    } else {
                        paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i5 != 0) {
                        z4 = false;
                    } else {
                        z4 = z;
                    }
                    if ((i3 & 64) != 0) {
                        i4 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    i13 = i4;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-649686062, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:77)");
                }
                int i111111111111111119 = i13 >> 3;
                int i1111111111111111110 = i111111111111111119 & 14;
                Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda111115 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(lazyGridState, function1, composerStartRestartGroup, ((i11 << 3) & 112) | i1111111111111111110);
                int i1111111111111111111 = i13 >> 9;
                LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState111115 = LazySemanticsKt.rememberLazyGridSemanticState(lazyGridState, z4, composerStartRestartGroup, (i1111111111111111111 & 112) | i1111111111111111110);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller111115 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                    composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller111115);
                    objRememberedValue = compositionScopedCoroutineScopeCanceller111115;
                }
                int i2111114 = i13;
                boolean z1111110 = z4;
                Modifier modifier111118 = companion;
                Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy111115 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda111115, lazyGridState, lazyGridSlotsProvider, paddingValuesM995PaddingValues0680j_4, z4, z2, horizontal, vertical, ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope(), (GraphicsContext) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext()), composerStartRestartGroup, (29360128 & i111111111111111119) | (524272 & i13) | (i1111111111111111111 & 3670016));
                if (z2) {
                    orientation = Orientation.Vertical;
                } else {
                    orientation = Orientation.Horizontal;
                }
                Orientation orientation111116 = orientation;
                composer2 = composerStartRestartGroup;
                LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda111115, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier111118.then(lazyGridState.getRemeasurementModifier()).then(lazyGridState.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda111115, lazyLayoutSemanticStateRememberLazyGridSemanticState111115, orientation111116, z3, z1111110, composerStartRestartGroup, (i1111111111111111111 & 57344) | ((i2111114 << 3) & 458752)), LazyGridBeyondBoundsModifierKt.rememberLazyGridBeyondBoundsState(lazyGridState, composerStartRestartGroup, i1111111111111111110), lazyGridState.getBeyondBoundsInfo(), z1111110, (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation111116, z3, composerStartRestartGroup, (i111111111111111119 & 3670016) | (MutableVector.$stable << 6) | (i111111111111111119 & 7168)).then(lazyGridState.getItemAnimator$foundation_release().getModifier()), lazyGridState, orientation111116, z3, z1111110, flingBehavior2, lazyGridState.getInternalInteractionSource(), null, composerStartRestartGroup, (i2111114 & 112) | ((i2111114 >> 12) & 7168) | (i2111114 & 57344) | (458752 & i111111111111111119), 64), lazyGridState.getPrefetchState(), function2RememberLazyGridMeasurePolicy111115, composer2, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier111118;
                paddingValues3 = paddingValuesM995PaddingValues0680j_4;
                flingBehavior3 = flingBehavior2;
                z5 = z1111110;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt.LazyGrid.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i2111115) {
                        LazyGridKt.LazyGrid(modifier3, lazyGridState, lazyGridSlotsProvider, paddingValues3, z5, z2, flingBehavior3, z3, vertical, horizontal, function1, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                    }
                });
            }
        }
        i4 |= 12582912;
        if ((i3 & 256) != 0) {
            if ((i & 100663296) == 0) {
                if (composerStartRestartGroup.changed(vertical)) {
                    i9 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i9 = 33554432;
                }
                i4 |= i9;
            }
            if ((i3 & 512) != 0) {
                if ((i & 805306368) == 0) {
                    if (composerStartRestartGroup.changed(horizontal)) {
                        i10 = 536870912;
                    } else {
                        i10 = 268435456;
                    }
                    i4 |= i10;
                }
                if ((i3 & 1024) != 0) {
                    i11 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i12 = 4;
                    } else {
                        i12 = 2;
                    }
                    i11 = i2 | i12;
                } else {
                    i11 = i2;
                }
                if ((i4 & 306783379) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i15 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier2;
                        }
                        if (i16 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        } else {
                            paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i5 != 0) {
                            z4 = false;
                        } else {
                            z4 = z;
                        }
                        if ((i3 & 64) != 0) {
                            i4 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        i13 = i4;
                    } else {
                        if (i15 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier2;
                        }
                        if (i16 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        } else {
                            paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i5 != 0) {
                            z4 = false;
                        } else {
                            z4 = z;
                        }
                        if ((i3 & 64) != 0) {
                            i4 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        i13 = i4;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-649686062, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:77)");
                    }
                    int i1111111111111111112 = i13 >> 3;
                    int i1111111111111111113 = i1111111111111111112 & 14;
                    Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda111116 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(lazyGridState, function1, composerStartRestartGroup, ((i11 << 3) & 112) | i1111111111111111113);
                    int i1111111111111111114 = i13 >> 9;
                    LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState111116 = LazySemanticsKt.rememberLazyGridSemanticState(lazyGridState, z4, composerStartRestartGroup, (i1111111111111111114 & 112) | i1111111111111111113);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller111116 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                        composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller111116);
                        objRememberedValue = compositionScopedCoroutineScopeCanceller111116;
                    }
                    int i2111115 = i13;
                    boolean z1111111 = z4;
                    Modifier modifier111119 = companion;
                    Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy111116 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda111116, lazyGridState, lazyGridSlotsProvider, paddingValuesM995PaddingValues0680j_4, z4, z2, horizontal, vertical, ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope(), (GraphicsContext) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext()), composerStartRestartGroup, (29360128 & i1111111111111111112) | (524272 & i13) | (i1111111111111111114 & 3670016));
                    if (z2) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    Orientation orientation111117 = orientation;
                    composer2 = composerStartRestartGroup;
                    LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda111116, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier111119.then(lazyGridState.getRemeasurementModifier()).then(lazyGridState.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda111116, lazyLayoutSemanticStateRememberLazyGridSemanticState111116, orientation111117, z3, z1111111, composerStartRestartGroup, (i1111111111111111114 & 57344) | ((i2111115 << 3) & 458752)), LazyGridBeyondBoundsModifierKt.rememberLazyGridBeyondBoundsState(lazyGridState, composerStartRestartGroup, i1111111111111111113), lazyGridState.getBeyondBoundsInfo(), z1111111, (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation111117, z3, composerStartRestartGroup, (i1111111111111111112 & 3670016) | (MutableVector.$stable << 6) | (i1111111111111111112 & 7168)).then(lazyGridState.getItemAnimator$foundation_release().getModifier()), lazyGridState, orientation111117, z3, z1111111, flingBehavior2, lazyGridState.getInternalInteractionSource(), null, composerStartRestartGroup, (i2111115 & 112) | ((i2111115 >> 12) & 7168) | (i2111115 & 57344) | (458752 & i1111111111111111112), 64), lazyGridState.getPrefetchState(), function2RememberLazyGridMeasurePolicy111116, composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier111119;
                    paddingValues3 = paddingValuesM995PaddingValues0680j_4;
                    flingBehavior3 = flingBehavior2;
                    z5 = z1111111;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i15 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier2;
                        }
                        if (i16 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        } else {
                            paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i5 != 0) {
                            z4 = false;
                        } else {
                            z4 = z;
                        }
                        if ((i3 & 64) != 0) {
                            i4 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        i13 = i4;
                    } else {
                        if (i15 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier2;
                        }
                        if (i16 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        } else {
                            paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i5 != 0) {
                            z4 = false;
                        } else {
                            z4 = z;
                        }
                        if ((i3 & 64) != 0) {
                            i4 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        i13 = i4;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-649686062, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:77)");
                    }
                    int i1111111111111111115 = i13 >> 3;
                    int i1111111111111111116 = i1111111111111111115 & 14;
                    Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda111117 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(lazyGridState, function1, composerStartRestartGroup, ((i11 << 3) & 112) | i1111111111111111116);
                    int i1111111111111111117 = i13 >> 9;
                    LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState111117 = LazySemanticsKt.rememberLazyGridSemanticState(lazyGridState, z4, composerStartRestartGroup, (i1111111111111111117 & 112) | i1111111111111111116);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller111117 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                        composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller111117);
                        objRememberedValue = compositionScopedCoroutineScopeCanceller111117;
                    }
                    int i2111116 = i13;
                    boolean z1111112 = z4;
                    Modifier modifier1111110 = companion;
                    Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy111117 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda111117, lazyGridState, lazyGridSlotsProvider, paddingValuesM995PaddingValues0680j_4, z4, z2, horizontal, vertical, ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope(), (GraphicsContext) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext()), composerStartRestartGroup, (29360128 & i1111111111111111115) | (524272 & i13) | (i1111111111111111117 & 3670016));
                    if (z2) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    Orientation orientation111118 = orientation;
                    composer2 = composerStartRestartGroup;
                    LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda111117, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier1111110.then(lazyGridState.getRemeasurementModifier()).then(lazyGridState.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda111117, lazyLayoutSemanticStateRememberLazyGridSemanticState111117, orientation111118, z3, z1111112, composerStartRestartGroup, (i1111111111111111117 & 57344) | ((i2111116 << 3) & 458752)), LazyGridBeyondBoundsModifierKt.rememberLazyGridBeyondBoundsState(lazyGridState, composerStartRestartGroup, i1111111111111111116), lazyGridState.getBeyondBoundsInfo(), z1111112, (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation111118, z3, composerStartRestartGroup, (i1111111111111111115 & 3670016) | (MutableVector.$stable << 6) | (i1111111111111111115 & 7168)).then(lazyGridState.getItemAnimator$foundation_release().getModifier()), lazyGridState, orientation111118, z3, z1111112, flingBehavior2, lazyGridState.getInternalInteractionSource(), null, composerStartRestartGroup, (i2111116 & 112) | ((i2111116 >> 12) & 7168) | (i2111116 & 57344) | (458752 & i1111111111111111115), 64), lazyGridState.getPrefetchState(), function2RememberLazyGridMeasurePolicy111117, composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier1111110;
                    paddingValues3 = paddingValuesM995PaddingValues0680j_4;
                    flingBehavior3 = flingBehavior2;
                    z5 = z1111112;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt.LazyGrid.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i2111117) {
                            LazyGridKt.LazyGrid(modifier3, lazyGridState, lazyGridSlotsProvider, paddingValues3, z5, z2, flingBehavior3, z3, vertical, horizontal, function1, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                        }
                    });
                }
            }
            i4 |= 805306368;
            if ((i3 & 1024) != 0) {
                i11 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i12 = 4;
                } else {
                    i12 = 2;
                }
                i11 = i2 | i12;
            } else {
                i11 = i2;
            }
            if ((i4 & 306783379) == 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i15 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if (i16 != 0) {
                        paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                    } else {
                        paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i5 != 0) {
                        z4 = false;
                    } else {
                        z4 = z;
                    }
                    if ((i3 & 64) != 0) {
                        i4 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    i13 = i4;
                } else {
                    if (i15 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if (i16 != 0) {
                        paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                    } else {
                        paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i5 != 0) {
                        z4 = false;
                    } else {
                        z4 = z;
                    }
                    if ((i3 & 64) != 0) {
                        i4 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    i13 = i4;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-649686062, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:77)");
                }
                int i1111111111111111118 = i13 >> 3;
                int i1111111111111111119 = i1111111111111111118 & 14;
                Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda111118 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(lazyGridState, function1, composerStartRestartGroup, ((i11 << 3) & 112) | i1111111111111111119);
                int i11111111111111111110 = i13 >> 9;
                LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState111118 = LazySemanticsKt.rememberLazyGridSemanticState(lazyGridState, z4, composerStartRestartGroup, (i11111111111111111110 & 112) | i1111111111111111119);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller111118 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                    composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller111118);
                    objRememberedValue = compositionScopedCoroutineScopeCanceller111118;
                }
                int i2111117 = i13;
                boolean z1111113 = z4;
                Modifier modifier1111111 = companion;
                Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy111118 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda111118, lazyGridState, lazyGridSlotsProvider, paddingValuesM995PaddingValues0680j_4, z4, z2, horizontal, vertical, ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope(), (GraphicsContext) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext()), composerStartRestartGroup, (29360128 & i1111111111111111118) | (524272 & i13) | (i11111111111111111110 & 3670016));
                if (z2) {
                    orientation = Orientation.Vertical;
                } else {
                    orientation = Orientation.Horizontal;
                }
                Orientation orientation111119 = orientation;
                composer2 = composerStartRestartGroup;
                LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda111118, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier1111111.then(lazyGridState.getRemeasurementModifier()).then(lazyGridState.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda111118, lazyLayoutSemanticStateRememberLazyGridSemanticState111118, orientation111119, z3, z1111113, composerStartRestartGroup, (i11111111111111111110 & 57344) | ((i2111117 << 3) & 458752)), LazyGridBeyondBoundsModifierKt.rememberLazyGridBeyondBoundsState(lazyGridState, composerStartRestartGroup, i1111111111111111119), lazyGridState.getBeyondBoundsInfo(), z1111113, (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation111119, z3, composerStartRestartGroup, (i1111111111111111118 & 3670016) | (MutableVector.$stable << 6) | (i1111111111111111118 & 7168)).then(lazyGridState.getItemAnimator$foundation_release().getModifier()), lazyGridState, orientation111119, z3, z1111113, flingBehavior2, lazyGridState.getInternalInteractionSource(), null, composerStartRestartGroup, (i2111117 & 112) | ((i2111117 >> 12) & 7168) | (i2111117 & 57344) | (458752 & i1111111111111111118), 64), lazyGridState.getPrefetchState(), function2RememberLazyGridMeasurePolicy111118, composer2, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier1111111;
                paddingValues3 = paddingValuesM995PaddingValues0680j_4;
                flingBehavior3 = flingBehavior2;
                z5 = z1111113;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i15 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if (i16 != 0) {
                        paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                    } else {
                        paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i5 != 0) {
                        z4 = false;
                    } else {
                        z4 = z;
                    }
                    if ((i3 & 64) != 0) {
                        i4 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    i13 = i4;
                } else {
                    if (i15 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if (i16 != 0) {
                        paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                    } else {
                        paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i5 != 0) {
                        z4 = false;
                    } else {
                        z4 = z;
                    }
                    if ((i3 & 64) != 0) {
                        i4 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    i13 = i4;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-649686062, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:77)");
                }
                int i11111111111111111111 = i13 >> 3;
                int i11111111111111111112 = i11111111111111111111 & 14;
                Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda111119 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(lazyGridState, function1, composerStartRestartGroup, ((i11 << 3) & 112) | i11111111111111111112);
                int i11111111111111111113 = i13 >> 9;
                LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState111119 = LazySemanticsKt.rememberLazyGridSemanticState(lazyGridState, z4, composerStartRestartGroup, (i11111111111111111113 & 112) | i11111111111111111112);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller111119 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                    composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller111119);
                    objRememberedValue = compositionScopedCoroutineScopeCanceller111119;
                }
                int i2111118 = i13;
                boolean z1111114 = z4;
                Modifier modifier1111112 = companion;
                Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy111119 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda111119, lazyGridState, lazyGridSlotsProvider, paddingValuesM995PaddingValues0680j_4, z4, z2, horizontal, vertical, ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope(), (GraphicsContext) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext()), composerStartRestartGroup, (29360128 & i11111111111111111111) | (524272 & i13) | (i11111111111111111113 & 3670016));
                if (z2) {
                    orientation = Orientation.Vertical;
                } else {
                    orientation = Orientation.Horizontal;
                }
                Orientation orientation1111110 = orientation;
                composer2 = composerStartRestartGroup;
                LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda111119, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier1111112.then(lazyGridState.getRemeasurementModifier()).then(lazyGridState.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda111119, lazyLayoutSemanticStateRememberLazyGridSemanticState111119, orientation1111110, z3, z1111114, composerStartRestartGroup, (i11111111111111111113 & 57344) | ((i2111118 << 3) & 458752)), LazyGridBeyondBoundsModifierKt.rememberLazyGridBeyondBoundsState(lazyGridState, composerStartRestartGroup, i11111111111111111112), lazyGridState.getBeyondBoundsInfo(), z1111114, (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation1111110, z3, composerStartRestartGroup, (i11111111111111111111 & 3670016) | (MutableVector.$stable << 6) | (i11111111111111111111 & 7168)).then(lazyGridState.getItemAnimator$foundation_release().getModifier()), lazyGridState, orientation1111110, z3, z1111114, flingBehavior2, lazyGridState.getInternalInteractionSource(), null, composerStartRestartGroup, (i2111118 & 112) | ((i2111118 >> 12) & 7168) | (i2111118 & 57344) | (458752 & i11111111111111111111), 64), lazyGridState.getPrefetchState(), function2RememberLazyGridMeasurePolicy111119, composer2, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier1111112;
                paddingValues3 = paddingValuesM995PaddingValues0680j_4;
                flingBehavior3 = flingBehavior2;
                z5 = z1111114;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt.LazyGrid.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i2111119) {
                        LazyGridKt.LazyGrid(modifier3, lazyGridState, lazyGridSlotsProvider, paddingValues3, z5, z2, flingBehavior3, z3, vertical, horizontal, function1, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                    }
                });
            }
        }
        i4 |= 100663296;
        if ((i3 & 512) != 0) {
            if ((i & 805306368) == 0) {
                if (composerStartRestartGroup.changed(horizontal)) {
                    i10 = 536870912;
                } else {
                    i10 = 268435456;
                }
                i4 |= i10;
            }
            if ((i3 & 1024) != 0) {
                i11 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i12 = 4;
                } else {
                    i12 = 2;
                }
                i11 = i2 | i12;
            } else {
                i11 = i2;
            }
            if ((i4 & 306783379) == 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i15 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if (i16 != 0) {
                        paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                    } else {
                        paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i5 != 0) {
                        z4 = false;
                    } else {
                        z4 = z;
                    }
                    if ((i3 & 64) != 0) {
                        i4 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    i13 = i4;
                } else {
                    if (i15 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if (i16 != 0) {
                        paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                    } else {
                        paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i5 != 0) {
                        z4 = false;
                    } else {
                        z4 = z;
                    }
                    if ((i3 & 64) != 0) {
                        i4 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    i13 = i4;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-649686062, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:77)");
                }
                int i11111111111111111114 = i13 >> 3;
                int i11111111111111111115 = i11111111111111111114 & 14;
                Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda1111110 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(lazyGridState, function1, composerStartRestartGroup, ((i11 << 3) & 112) | i11111111111111111115);
                int i11111111111111111116 = i13 >> 9;
                LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState1111110 = LazySemanticsKt.rememberLazyGridSemanticState(lazyGridState, z4, composerStartRestartGroup, (i11111111111111111116 & 112) | i11111111111111111115);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller1111110 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                    composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller1111110);
                    objRememberedValue = compositionScopedCoroutineScopeCanceller1111110;
                }
                int i2111119 = i13;
                boolean z1111115 = z4;
                Modifier modifier1111113 = companion;
                Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy1111110 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda1111110, lazyGridState, lazyGridSlotsProvider, paddingValuesM995PaddingValues0680j_4, z4, z2, horizontal, vertical, ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope(), (GraphicsContext) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext()), composerStartRestartGroup, (29360128 & i11111111111111111114) | (524272 & i13) | (i11111111111111111116 & 3670016));
                if (z2) {
                    orientation = Orientation.Vertical;
                } else {
                    orientation = Orientation.Horizontal;
                }
                Orientation orientation1111111 = orientation;
                composer2 = composerStartRestartGroup;
                LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda1111110, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier1111113.then(lazyGridState.getRemeasurementModifier()).then(lazyGridState.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda1111110, lazyLayoutSemanticStateRememberLazyGridSemanticState1111110, orientation1111111, z3, z1111115, composerStartRestartGroup, (i11111111111111111116 & 57344) | ((i2111119 << 3) & 458752)), LazyGridBeyondBoundsModifierKt.rememberLazyGridBeyondBoundsState(lazyGridState, composerStartRestartGroup, i11111111111111111115), lazyGridState.getBeyondBoundsInfo(), z1111115, (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation1111111, z3, composerStartRestartGroup, (i11111111111111111114 & 3670016) | (MutableVector.$stable << 6) | (i11111111111111111114 & 7168)).then(lazyGridState.getItemAnimator$foundation_release().getModifier()), lazyGridState, orientation1111111, z3, z1111115, flingBehavior2, lazyGridState.getInternalInteractionSource(), null, composerStartRestartGroup, (i2111119 & 112) | ((i2111119 >> 12) & 7168) | (i2111119 & 57344) | (458752 & i11111111111111111114), 64), lazyGridState.getPrefetchState(), function2RememberLazyGridMeasurePolicy1111110, composer2, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier1111113;
                paddingValues3 = paddingValuesM995PaddingValues0680j_4;
                flingBehavior3 = flingBehavior2;
                z5 = z1111115;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i15 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if (i16 != 0) {
                        paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                    } else {
                        paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i5 != 0) {
                        z4 = false;
                    } else {
                        z4 = z;
                    }
                    if ((i3 & 64) != 0) {
                        i4 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    i13 = i4;
                } else {
                    if (i15 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if (i16 != 0) {
                        paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                    } else {
                        paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i5 != 0) {
                        z4 = false;
                    } else {
                        z4 = z;
                    }
                    if ((i3 & 64) != 0) {
                        i4 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    i13 = i4;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-649686062, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:77)");
                }
                int i11111111111111111117 = i13 >> 3;
                int i11111111111111111118 = i11111111111111111117 & 14;
                Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda1111111 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(lazyGridState, function1, composerStartRestartGroup, ((i11 << 3) & 112) | i11111111111111111118);
                int i11111111111111111119 = i13 >> 9;
                LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState1111111 = LazySemanticsKt.rememberLazyGridSemanticState(lazyGridState, z4, composerStartRestartGroup, (i11111111111111111119 & 112) | i11111111111111111118);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller1111111 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                    composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller1111111);
                    objRememberedValue = compositionScopedCoroutineScopeCanceller1111111;
                }
                int i21111110 = i13;
                boolean z1111116 = z4;
                Modifier modifier1111114 = companion;
                Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy1111111 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda1111111, lazyGridState, lazyGridSlotsProvider, paddingValuesM995PaddingValues0680j_4, z4, z2, horizontal, vertical, ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope(), (GraphicsContext) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext()), composerStartRestartGroup, (29360128 & i11111111111111111117) | (524272 & i13) | (i11111111111111111119 & 3670016));
                if (z2) {
                    orientation = Orientation.Vertical;
                } else {
                    orientation = Orientation.Horizontal;
                }
                Orientation orientation1111112 = orientation;
                composer2 = composerStartRestartGroup;
                LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda1111111, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier1111114.then(lazyGridState.getRemeasurementModifier()).then(lazyGridState.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda1111111, lazyLayoutSemanticStateRememberLazyGridSemanticState1111111, orientation1111112, z3, z1111116, composerStartRestartGroup, (i11111111111111111119 & 57344) | ((i21111110 << 3) & 458752)), LazyGridBeyondBoundsModifierKt.rememberLazyGridBeyondBoundsState(lazyGridState, composerStartRestartGroup, i11111111111111111118), lazyGridState.getBeyondBoundsInfo(), z1111116, (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation1111112, z3, composerStartRestartGroup, (i11111111111111111117 & 3670016) | (MutableVector.$stable << 6) | (i11111111111111111117 & 7168)).then(lazyGridState.getItemAnimator$foundation_release().getModifier()), lazyGridState, orientation1111112, z3, z1111116, flingBehavior2, lazyGridState.getInternalInteractionSource(), null, composerStartRestartGroup, (i21111110 & 112) | ((i21111110 >> 12) & 7168) | (i21111110 & 57344) | (458752 & i11111111111111111117), 64), lazyGridState.getPrefetchState(), function2RememberLazyGridMeasurePolicy1111111, composer2, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier1111114;
                paddingValues3 = paddingValuesM995PaddingValues0680j_4;
                flingBehavior3 = flingBehavior2;
                z5 = z1111116;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt.LazyGrid.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i21111111) {
                        LazyGridKt.LazyGrid(modifier3, lazyGridState, lazyGridSlotsProvider, paddingValues3, z5, z2, flingBehavior3, z3, vertical, horizontal, function1, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                    }
                });
            }
        }
        i4 |= 805306368;
        if ((i3 & 1024) != 0) {
            i11 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            if (composerStartRestartGroup.changedInstance(function1)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i2 | i12;
        } else {
            i11 = i2;
        }
        if ((i4 & 306783379) == 306783378) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i15 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier2;
                }
                if (i16 != 0) {
                    paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                } else {
                    paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                }
                if (i5 != 0) {
                    z4 = false;
                } else {
                    z4 = z;
                }
                if ((i3 & 64) != 0) {
                    i4 &= -3670017;
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                } else {
                    flingBehavior2 = flingBehavior;
                }
                i13 = i4;
            } else {
                if (i15 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier2;
                }
                if (i16 != 0) {
                    paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                } else {
                    paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                }
                if (i5 != 0) {
                    z4 = false;
                } else {
                    z4 = z;
                }
                if ((i3 & 64) != 0) {
                    i4 &= -3670017;
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                } else {
                    flingBehavior2 = flingBehavior;
                }
                i13 = i4;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-649686062, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:77)");
            }
            int i111111111111111111110 = i13 >> 3;
            int i111111111111111111111 = i111111111111111111110 & 14;
            Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda1111112 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(lazyGridState, function1, composerStartRestartGroup, ((i11 << 3) & 112) | i111111111111111111111);
            int i111111111111111111112 = i13 >> 9;
            LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState1111112 = LazySemanticsKt.rememberLazyGridSemanticState(lazyGridState, z4, composerStartRestartGroup, (i111111111111111111112 & 112) | i111111111111111111111);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller1111112 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller1111112);
                objRememberedValue = compositionScopedCoroutineScopeCanceller1111112;
            }
            int i21111111 = i13;
            boolean z1111117 = z4;
            Modifier modifier1111115 = companion;
            Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy1111112 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda1111112, lazyGridState, lazyGridSlotsProvider, paddingValuesM995PaddingValues0680j_4, z4, z2, horizontal, vertical, ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope(), (GraphicsContext) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext()), composerStartRestartGroup, (29360128 & i111111111111111111110) | (524272 & i13) | (i111111111111111111112 & 3670016));
            if (z2) {
                orientation = Orientation.Vertical;
            } else {
                orientation = Orientation.Horizontal;
            }
            Orientation orientation1111113 = orientation;
            composer2 = composerStartRestartGroup;
            LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda1111112, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier1111115.then(lazyGridState.getRemeasurementModifier()).then(lazyGridState.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda1111112, lazyLayoutSemanticStateRememberLazyGridSemanticState1111112, orientation1111113, z3, z1111117, composerStartRestartGroup, (i111111111111111111112 & 57344) | ((i21111111 << 3) & 458752)), LazyGridBeyondBoundsModifierKt.rememberLazyGridBeyondBoundsState(lazyGridState, composerStartRestartGroup, i111111111111111111111), lazyGridState.getBeyondBoundsInfo(), z1111117, (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation1111113, z3, composerStartRestartGroup, (i111111111111111111110 & 3670016) | (MutableVector.$stable << 6) | (i111111111111111111110 & 7168)).then(lazyGridState.getItemAnimator$foundation_release().getModifier()), lazyGridState, orientation1111113, z3, z1111117, flingBehavior2, lazyGridState.getInternalInteractionSource(), null, composerStartRestartGroup, (i21111111 & 112) | ((i21111111 >> 12) & 7168) | (i21111111 & 57344) | (458752 & i111111111111111111110), 64), lazyGridState.getPrefetchState(), function2RememberLazyGridMeasurePolicy1111112, composer2, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier1111115;
            paddingValues3 = paddingValuesM995PaddingValues0680j_4;
            flingBehavior3 = flingBehavior2;
            z5 = z1111117;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i15 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier2;
                }
                if (i16 != 0) {
                    paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                } else {
                    paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                }
                if (i5 != 0) {
                    z4 = false;
                } else {
                    z4 = z;
                }
                if ((i3 & 64) != 0) {
                    i4 &= -3670017;
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                } else {
                    flingBehavior2 = flingBehavior;
                }
                i13 = i4;
            } else {
                if (i15 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier2;
                }
                if (i16 != 0) {
                    paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                } else {
                    paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                }
                if (i5 != 0) {
                    z4 = false;
                } else {
                    z4 = z;
                }
                if ((i3 & 64) != 0) {
                    i4 &= -3670017;
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                } else {
                    flingBehavior2 = flingBehavior;
                }
                i13 = i4;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-649686062, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:77)");
            }
            int i111111111111111111113 = i13 >> 3;
            int i111111111111111111114 = i111111111111111111113 & 14;
            Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda1111113 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(lazyGridState, function1, composerStartRestartGroup, ((i11 << 3) & 112) | i111111111111111111114);
            int i111111111111111111115 = i13 >> 9;
            LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState1111113 = LazySemanticsKt.rememberLazyGridSemanticState(lazyGridState, z4, composerStartRestartGroup, (i111111111111111111115 & 112) | i111111111111111111114);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller1111113 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller1111113);
                objRememberedValue = compositionScopedCoroutineScopeCanceller1111113;
            }
            int i21111112 = i13;
            boolean z1111118 = z4;
            Modifier modifier1111116 = companion;
            Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy1111113 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda1111113, lazyGridState, lazyGridSlotsProvider, paddingValuesM995PaddingValues0680j_4, z4, z2, horizontal, vertical, ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope(), (GraphicsContext) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext()), composerStartRestartGroup, (29360128 & i111111111111111111113) | (524272 & i13) | (i111111111111111111115 & 3670016));
            if (z2) {
                orientation = Orientation.Vertical;
            } else {
                orientation = Orientation.Horizontal;
            }
            Orientation orientation1111114 = orientation;
            composer2 = composerStartRestartGroup;
            LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda1111113, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier1111116.then(lazyGridState.getRemeasurementModifier()).then(lazyGridState.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda1111113, lazyLayoutSemanticStateRememberLazyGridSemanticState1111113, orientation1111114, z3, z1111118, composerStartRestartGroup, (i111111111111111111115 & 57344) | ((i21111112 << 3) & 458752)), LazyGridBeyondBoundsModifierKt.rememberLazyGridBeyondBoundsState(lazyGridState, composerStartRestartGroup, i111111111111111111114), lazyGridState.getBeyondBoundsInfo(), z1111118, (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation1111114, z3, composerStartRestartGroup, (i111111111111111111113 & 3670016) | (MutableVector.$stable << 6) | (i111111111111111111113 & 7168)).then(lazyGridState.getItemAnimator$foundation_release().getModifier()), lazyGridState, orientation1111114, z3, z1111118, flingBehavior2, lazyGridState.getInternalInteractionSource(), null, composerStartRestartGroup, (i21111112 & 112) | ((i21111112 >> 12) & 7168) | (i21111112 & 57344) | (458752 & i111111111111111111113), 64), lazyGridState.getPrefetchState(), function2RememberLazyGridMeasurePolicy1111113, composer2, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier1111116;
            paddingValues3 = paddingValuesM995PaddingValues0680j_4;
            flingBehavior3 = flingBehavior2;
            z5 = z1111118;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt.LazyGrid.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i21111113) {
                    LazyGridKt.LazyGrid(modifier3, lazyGridState, lazyGridSlotsProvider, paddingValues3, z5, z2, flingBehavior3, z3, vertical, horizontal, function1, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002a  */
    /* JADX WARN: Code duplicated, block: B:47:0x008c  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c4  */
    private static final Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> rememberLazyGridMeasurePolicy(final Function0<? extends LazyGridItemProvider> function0, final LazyGridState lazyGridState, final LazyGridSlotsProvider lazyGridSlotsProvider, final PaddingValues paddingValues, final boolean z, final boolean z2, final Arrangement.Horizontal horizontal, final Arrangement.Vertical vertical, final CoroutineScope coroutineScope, final GraphicsContext graphicsContext, Composer composer, int i) {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1585069765, i, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:161)");
        }
        if (((i & 112) ^ 48) > 32 && composer.changed(lazyGridState)) {
            z3 = true;
        } else if ((i & 48) == 32) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z7 = (((i & 896) ^ 384) > 256 && composer.changed(lazyGridSlotsProvider)) || (i & 384) == 256;
        boolean z8 = (((i & 7168) ^ 3072) > 2048 && composer.changed(paddingValues)) || (i & 3072) == 2048;
        boolean z9 = (((57344 & i) ^ 24576) > 16384 && composer.changed(z)) || (i & 24576) == 16384;
        if (((458752 & i) ^ ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) > 131072 && composer.changed(z2)) {
            z4 = true;
        } else if ((196608 & i) == 131072) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (((3670016 & i) ^ 1572864) > 1048576 && composer.changed(horizontal)) {
            z5 = true;
        } else if ((1572864 & i) == 1048576) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (((29360128 & i) ^ 12582912) > 8388608 && composer.changed(vertical)) {
            z6 = true;
        } else if ((i & 12582912) == 8388608) {
            z6 = true;
        } else {
            z6 = false;
        }
        boolean zChanged = composer.changed(graphicsContext);
        Object objRememberedValue = composer.rememberedValue();
        if ((z3 | z7 | z8 | z9 | z4 | z5 | z6 | zChanged) || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = (Function2) new Function2<LazyLayoutMeasureScope, Constraints, LazyGridMeasureResult>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1
                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ LazyGridMeasureResult invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) {
                    return m1140invoke0kLqBqw(lazyLayoutMeasureScope, constraints.getValue());
                }

                /* JADX WARN: Type inference failed for: r18v0, types: [androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1] */
                /* JADX WARN: Type inference failed for: r2v15, types: [androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1] */
                /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                public final LazyGridMeasureResult m1140invoke0kLqBqw(final LazyLayoutMeasureScope lazyLayoutMeasureScope, final long j) {
                    int i2;
                    int i3;
                    int i4;
                    float spacing;
                    int iM6888getMaxWidthimpl;
                    long jIntOffset;
                    int lineIndexOfItem;
                    int firstVisibleItemScrollOffset;
                    ObservableScopeInvalidator.m1176attachToScopeimpl(lazyGridState.m1148getMeasurementScopeInvalidatorzYiylxw$foundation_release());
                    CheckScrollableContainerConstraintsKt.m585checkScrollableContainerConstraintsK40F9xA(j, z2 ? Orientation.Vertical : Orientation.Horizontal);
                    if (z2) {
                        i2 = lazyLayoutMeasureScope.mo688roundToPx0680j_4(paddingValues.mo953calculateLeftPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                    } else {
                        i2 = lazyLayoutMeasureScope.mo688roundToPx0680j_4(PaddingKt.calculateStartPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                    }
                    if (z2) {
                        i3 = lazyLayoutMeasureScope.mo688roundToPx0680j_4(paddingValues.mo954calculateRightPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                    } else {
                        i3 = lazyLayoutMeasureScope.mo688roundToPx0680j_4(PaddingKt.calculateEndPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                    }
                    int i5 = lazyLayoutMeasureScope.mo688roundToPx0680j_4(paddingValues.getTop());
                    int i6 = lazyLayoutMeasureScope.mo688roundToPx0680j_4(paddingValues.getBottom());
                    final int i7 = i5 + i6;
                    final int i8 = i2 + i3;
                    boolean z10 = z2;
                    int i9 = z10 ? i7 : i8;
                    if (z10 && !z) {
                        i4 = i5;
                    } else if (z10 && z) {
                        i4 = i6;
                    } else {
                        i4 = (z10 || z) ? i3 : i2;
                    }
                    final int i10 = i9 - i4;
                    long jM6907offsetNN6EwU = ConstraintsKt.m6907offsetNN6EwU(j, -i8, -i7);
                    final LazyGridItemProvider lazyGridItemProviderInvoke = function0.invoke();
                    final LazyGridSpanLayoutProvider spanLayoutProvider = lazyGridItemProviderInvoke.getSpanLayoutProvider();
                    LazyLayoutMeasureScope lazyLayoutMeasureScope2 = lazyLayoutMeasureScope;
                    final LazyGridSlots lazyGridSlotsMo1129invoke0kLqBqw = lazyGridSlotsProvider.mo1129invoke0kLqBqw(lazyLayoutMeasureScope2, j);
                    int length = lazyGridSlotsMo1129invoke0kLqBqw.getSizes().length;
                    spanLayoutProvider.setSlotsPerLine(length);
                    if (z2) {
                        Arrangement.Vertical vertical2 = vertical;
                        if (vertical2 == null) {
                            throw new IllegalArgumentException("null verticalArrangement when isVertical == true".toString());
                        }
                        spacing = vertical2.getSpacing();
                    } else {
                        Arrangement.Horizontal horizontal2 = horizontal;
                        if (horizontal2 == null) {
                            throw new IllegalArgumentException("null horizontalArrangement when isVertical == false".toString());
                        }
                        spacing = horizontal2.getSpacing();
                    }
                    final int i11 = lazyLayoutMeasureScope.mo688roundToPx0680j_4(spacing);
                    final int itemCount = lazyGridItemProviderInvoke.getItemCount();
                    if (z2) {
                        iM6888getMaxWidthimpl = Constraints.m6887getMaxHeightimpl(j) - i7;
                    } else {
                        iM6888getMaxWidthimpl = Constraints.m6888getMaxWidthimpl(j) - i8;
                    }
                    int i12 = iM6888getMaxWidthimpl;
                    if (!z || i12 > 0) {
                        jIntOffset = IntOffsetKt.IntOffset(i2, i5);
                    } else {
                        boolean z11 = z2;
                        if (!z11) {
                            i2 += i12;
                        }
                        if (z11) {
                            i5 += i12;
                        }
                        jIntOffset = IntOffsetKt.IntOffset(i2, i5);
                    }
                    final long j2 = jIntOffset;
                    final LazyGridState lazyGridState2 = lazyGridState;
                    final boolean z12 = z2;
                    final boolean z13 = z;
                    final int i13 = i4;
                    final ?? r18 = new LazyGridMeasuredItemProvider(lazyGridItemProviderInvoke, lazyLayoutMeasureScope, i11, lazyGridState2, z12, z13, i13, i10, j2) { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1
                        final /* synthetic */ int $afterContentPadding;
                        final /* synthetic */ int $beforeContentPadding;
                        final /* synthetic */ boolean $isVertical;
                        final /* synthetic */ boolean $reverseLayout;
                        final /* synthetic */ LazyGridState $state;
                        final /* synthetic */ LazyLayoutMeasureScope $this_null;
                        final /* synthetic */ long $visualItemOffset;

                        {
                            this.$this_null = lazyLayoutMeasureScope;
                            this.$state = lazyGridState2;
                            this.$isVertical = z12;
                            this.$reverseLayout = z13;
                            this.$beforeContentPadding = i13;
                            this.$afterContentPadding = i10;
                            this.$visualItemOffset = j2;
                        }

                        @Override // androidx.compose.foundation.lazy.grid.LazyGridMeasuredItemProvider
                        /* JADX INFO: renamed from: createItem-O3s9Psw, reason: not valid java name */
                        public final LazyGridMeasuredItem mo1141createItemO3s9Psw(int p0, Object p1, Object p2, int p3, int p4, List<? extends Placeable> p5, long p6, int p7, int p8) {
                            return new LazyGridMeasuredItem(p0, p1, this.$isVertical, p3, p4, this.$reverseLayout, this.$this_null.getLayoutDirection(), this.$beforeContentPadding, this.$afterContentPadding, p5, this.$visualItemOffset, p2, this.$state.getItemAnimator$foundation_release(), p6, p7, p8, null);
                        }
                    };
                    final boolean z14 = z2;
                    final ?? r2 = new LazyGridMeasuredLineProvider(z14, lazyGridSlotsMo1129invoke0kLqBqw, itemCount, i11, r18, spanLayoutProvider) { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1
                        final /* synthetic */ boolean $isVertical;
                        final /* synthetic */ LazyGridSlots $resolvedSlots;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(z14, lazyGridSlotsMo1129invoke0kLqBqw, itemCount, i11, r18, spanLayoutProvider);
                            this.$isVertical = z14;
                            this.$resolvedSlots = lazyGridSlotsMo1129invoke0kLqBqw;
                        }

                        @Override // androidx.compose.foundation.lazy.grid.LazyGridMeasuredLineProvider
                        public final LazyGridMeasuredLine createLine(int p0, LazyGridMeasuredItem[] p1, List<GridItemSpan> p2, int p3) {
                            return new LazyGridMeasuredLine(p0, p1, this.$resolvedSlots, p2, this.$isVertical, p3);
                        }
                    };
                    Function1<Integer, ArrayList<Pair<? extends Integer, ? extends Constraints>>> function1 = new Function1<Integer, ArrayList<Pair<? extends Integer, ? extends Constraints>>>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$prefetchInfoRetriever$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ ArrayList<Pair<? extends Integer, ? extends Constraints>> invoke(Integer num) {
                            return invoke(num.intValue());
                        }

                        public final ArrayList<Pair<Integer, Constraints>> invoke(int i14) {
                            LazyGridSpanLayoutProvider.LineConfiguration lineConfiguration = spanLayoutProvider.getLineConfiguration(i14);
                            int firstItemIndex = lineConfiguration.getFirstItemIndex();
                            ArrayList<Pair<Integer, Constraints>> arrayList = new ArrayList<>(lineConfiguration.getSpans().size());
                            List<GridItemSpan> spans = lineConfiguration.getSpans();
                            LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1 lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1 = r2;
                            int size = spans.size();
                            int i15 = 0;
                            for (int i16 = 0; i16 < size; i16++) {
                                int iM1125getCurrentLineSpanimpl = GridItemSpan.m1125getCurrentLineSpanimpl(spans.get(i16).getPackedValue());
                                arrayList.add(TuplesKt.to(Integer.valueOf(firstItemIndex), Constraints.m6875boximpl(lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1.m1147childConstraintsJhjzzOo$foundation_release(i15, iM1125getCurrentLineSpanimpl))));
                                firstItemIndex++;
                                i15 += iM1125getCurrentLineSpanimpl;
                            }
                            return arrayList;
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    Snapshot.Companion companion = Snapshot.INSTANCE;
                    LazyGridState lazyGridState3 = lazyGridState;
                    Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                    Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                    Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                    try {
                        int iUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release = lazyGridState3.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(lazyGridItemProviderInvoke, lazyGridState3.getFirstVisibleItemIndex());
                        if (iUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release < itemCount || itemCount <= 0) {
                            lineIndexOfItem = spanLayoutProvider.getLineIndexOfItem(iUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release);
                            firstVisibleItemScrollOffset = lazyGridState3.getFirstVisibleItemScrollOffset();
                        } else {
                            lineIndexOfItem = spanLayoutProvider.getLineIndexOfItem(itemCount - 1);
                            firstVisibleItemScrollOffset = 0;
                        }
                        Unit unit = Unit.INSTANCE;
                        companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                        LazyGridMeasureResult lazyGridMeasureResultM1143measureLazyGridOZKpZRA = LazyGridMeasureKt.m1143measureLazyGridOZKpZRA(itemCount, (LazyGridMeasuredLineProvider) r2, (LazyGridMeasuredItemProvider) r18, i12, i4, i10, i11, lineIndexOfItem, firstVisibleItemScrollOffset, lazyGridState.getScrollToBeConsumed(), jM6907offsetNN6EwU, z2, vertical, horizontal, z, lazyLayoutMeasureScope2, lazyGridState.getItemAnimator$foundation_release(), length, LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(lazyGridItemProviderInvoke, lazyGridState.getPinnedItems(), lazyGridState.getBeyondBoundsInfo()), coroutineScope, lazyGridState.m1149getPlacementScopeInvalidatorzYiylxw$foundation_release(), graphicsContext, function1, new Function3<Integer, Integer, Function1<? super Placeable.PlacementScope, ? extends Unit>, MeasureResult>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measureResult$1
                            @Override // kotlin.jvm.functions.Function3
                            public final /* bridge */ /* synthetic */ MeasureResult invoke(Integer num, Integer num2, Function1<? super Placeable.PlacementScope, ? extends Unit> function2) {
                                return invoke(num.intValue(), num2.intValue(), (Function1<? super Placeable.PlacementScope, Unit>) function2);
                            }

                            public final MeasureResult invoke(int i14, int i15, Function1<? super Placeable.PlacementScope, Unit> function2) {
                                return lazyLayoutMeasureScope.layout(ConstraintsKt.m6905constrainWidthK40F9xA(j, i14 + i8), ConstraintsKt.m6904constrainHeightK40F9xA(j, i15 + i7), MapsKt.emptyMap(), function2);
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }
                        });
                        LazyGridState.applyMeasureResult$foundation_release$default(lazyGridState, lazyGridMeasureResultM1143measureLazyGridOZKpZRA, false, 2, null);
                        return lazyGridMeasureResultM1143measureLazyGridOZKpZRA;
                    } catch (Throwable th) {
                        companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                        throw th;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
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
