package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.ScrollingContainerKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableDefaults;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocalKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.PointerIconCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0089\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u0017H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"LazyStaggeredGrid", "", RemoteConfigConstants.ResponseFieldKey.STATE, "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "slots", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;", "modifier", "Landroidx/compose/ui/Modifier;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "reverseLayout", "", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "userScrollEnabled", "mainAxisSpacing", "Landroidx/compose/ui/unit/Dp;", "crossAxisSpacing", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;", "Lkotlin/ExtensionFunctionType;", "LazyStaggeredGrid-LJWHXA8", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/gestures/FlingBehavior;ZFFLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class LazyStaggeredGridKt {
    /* JADX WARN: Code duplicated, block: B:100:0x0119  */
    /* JADX WARN: Code duplicated, block: B:101:0x011e  */
    /* JADX WARN: Code duplicated, block: B:103:0x0124  */
    /* JADX WARN: Code duplicated, block: B:105:0x012a  */
    /* JADX WARN: Code duplicated, block: B:106:0x012d  */
    /* JADX WARN: Code duplicated, block: B:110:0x0135  */
    /* JADX WARN: Code duplicated, block: B:111:0x0138  */
    /* JADX WARN: Code duplicated, block: B:113:0x013c  */
    /* JADX WARN: Code duplicated, block: B:115:0x0142  */
    /* JADX WARN: Code duplicated, block: B:116:0x0144  */
    /* JADX WARN: Code duplicated, block: B:118:0x0148  */
    /* JADX WARN: Code duplicated, block: B:121:0x0154  */
    /* JADX WARN: Code duplicated, block: B:126:0x0174  */
    /* JADX WARN: Code duplicated, block: B:128:0x017c  */
    /* JADX WARN: Code duplicated, block: B:135:0x019e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:136:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:137:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:140:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:141:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:143:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:144:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:147:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:148:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:150:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:151:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:153:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:154:0x01db  */
    /* JADX WARN: Code duplicated, block: B:156:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:157:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:161:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:164:0x021c  */
    /* JADX WARN: Code duplicated, block: B:167:0x033f  */
    /* JADX WARN: Code duplicated, block: B:171:0x0354  */
    /* JADX WARN: Code duplicated, block: B:173:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x0085  */
    /* JADX WARN: Code duplicated, block: B:50:0x0088  */
    /* JADX WARN: Code duplicated, block: B:52:0x008c  */
    /* JADX WARN: Code duplicated, block: B:54:0x0094  */
    /* JADX WARN: Code duplicated, block: B:55:0x0097  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:80:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:90:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:91:0x0100  */
    /* JADX WARN: Code duplicated, block: B:93:0x0106  */
    /* JADX WARN: Code duplicated, block: B:95:0x010c  */
    /* JADX WARN: Code duplicated, block: B:96:0x010f  */
    /* JADX INFO: renamed from: LazyStaggeredGrid-LJWHXA8, reason: not valid java name */
    public static final void m1203LazyStaggeredGridLJWHXA8(final LazyStaggeredGridState lazyStaggeredGridState, final Orientation orientation, final LazyGridStaggeredGridSlotsProvider lazyGridStaggeredGridSlotsProvider, Modifier modifier, PaddingValues paddingValues, boolean z, FlingBehavior flingBehavior, boolean z2, float f, float f2, final Function1<? super LazyStaggeredGridScope, Unit> function1, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        Modifier.Companion companion;
        PaddingValues paddingValuesM995PaddingValues0680j_4;
        boolean z3;
        FlingBehavior flingBehavior2;
        boolean z4;
        float f3;
        float fM6935constructorimpl;
        float fM6935constructorimpl2;
        float f4;
        boolean z5;
        FlingBehavior flingBehavior3;
        boolean z6;
        float f5;
        Modifier modifier2;
        PaddingValues paddingValues2;
        int i17;
        Object objRememberedValue;
        Composer composer2;
        final boolean z7;
        final Modifier modifier3;
        final PaddingValues paddingValues3;
        final FlingBehavior flingBehavior4;
        final boolean z8;
        final float f6;
        final float f7;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i18;
        Composer composerStartRestartGroup = composer.startRestartGroup(288295126);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(lazyStaggeredGridState) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(orientation) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            i4 |= (i & 512) == 0 ? composerStartRestartGroup.changed(lazyGridStaggeredGridSlotsProvider) : composerStartRestartGroup.changedInstance(lazyGridStaggeredGridSlotsProvider) ? 256 : 128;
        }
        int i19 = i3 & 8;
        if (i19 == 0) {
            if ((i & 3072) == 0) {
                i4 |= composerStartRestartGroup.changed(modifier) ? 2048 : 1024;
            }
            i5 = i3 & 16;
            if (i5 != 0) {
                if ((i & 24576) == 0) {
                    if (composerStartRestartGroup.changed(paddingValues)) {
                        i6 = 16384;
                    } else {
                        i6 = 8192;
                    }
                    i4 |= i6;
                }
                i7 = i3 & 32;
                if (i7 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    if (composerStartRestartGroup.changed(z)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i4 |= i8;
                }
                if ((i & 1572864) != 0) {
                    if ((i3 & 64) == 0 || !composerStartRestartGroup.changed(flingBehavior)) {
                        i18 = 524288;
                    } else {
                        i18 = 1048576;
                    }
                    i4 |= i18;
                }
                i9 = i3 & 128;
                if (i9 != 0) {
                    i4 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (composerStartRestartGroup.changed(z2)) {
                        i10 = 8388608;
                    } else {
                        i10 = 4194304;
                    }
                    i4 |= i10;
                }
                i11 = i3 & 256;
                if (i11 != 0) {
                    i4 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    if (composerStartRestartGroup.changed(f)) {
                        i12 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i12 = 33554432;
                    }
                    i4 |= i12;
                }
                i13 = i3 & 512;
                if (i13 != 0) {
                    i4 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    if (composerStartRestartGroup.changed(f2)) {
                        i14 = 536870912;
                    } else {
                        i14 = 268435456;
                    }
                    i4 |= i14;
                }
                if ((i3 & 1024) != 0) {
                    i15 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i16 = 4;
                    } else {
                        i16 = 2;
                    }
                    i15 = i2 | i16;
                } else {
                    i15 = i2;
                }
                if ((i4 & 306783379) == 306783378 || (i15 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i19 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if (i5 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        } else {
                            paddingValuesM995PaddingValues0680j_4 = paddingValues;
                        }
                        if (i7 != 0) {
                            z3 = false;
                        } else {
                            z3 = z;
                        }
                        if ((i3 & 64) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i4 &= -3670017;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i9 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        if (i11 != 0) {
                            f3 = 0.0f;
                            fM6935constructorimpl = Dp.m6935constructorimpl(0.0f);
                        } else {
                            f3 = 0.0f;
                            fM6935constructorimpl = f;
                        }
                        if (i13 != 0) {
                            fM6935constructorimpl2 = Dp.m6935constructorimpl(f3);
                        } else {
                            fM6935constructorimpl2 = f2;
                        }
                        f4 = fM6935constructorimpl2;
                        z5 = z4;
                        flingBehavior3 = flingBehavior2;
                        z6 = z3;
                        f5 = fM6935constructorimpl;
                        modifier2 = companion;
                        paddingValues2 = paddingValuesM995PaddingValues0680j_4;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i3 & 64) != 0) {
                            i4 &= -3670017;
                        }
                        modifier2 = modifier;
                        paddingValues2 = paddingValues;
                        z6 = z;
                        flingBehavior3 = flingBehavior;
                        z5 = z2;
                        f5 = f;
                        f4 = f2;
                    }
                    i17 = i4;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(288295126, i17, i15, "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGrid (LazyStaggeredGrid.kt:60)");
                    }
                    int i20 = i17 & 14;
                    Function0<LazyStaggeredGridItemProvider> function0RememberStaggeredGridItemProviderLambda = LazyStaggeredGridItemProviderKt.rememberStaggeredGridItemProviderLambda(lazyStaggeredGridState, function1, composerStartRestartGroup, ((i15 << 3) & 112) | i20);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                        composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                        objRememberedValue = compositionScopedCoroutineScopeCanceller;
                    }
                    int i21 = i17 >> 6;
                    int i22 = i21 & 7168;
                    int i23 = i17 >> 9;
                    boolean z9 = z6;
                    Modifier modifier4 = modifier2;
                    Function2<LazyLayoutMeasureScope, Constraints, LazyStaggeredGridMeasureResult> function2M1214rememberStaggeredGridMeasurePolicyqKj4JfE = LazyStaggeredGridMeasurePolicyKt.m1214rememberStaggeredGridMeasurePolicyqKj4JfE(lazyStaggeredGridState, function0RememberStaggeredGridItemProviderLambda, paddingValues2, z6, orientation, f5, f4, ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope(), lazyGridStaggeredGridSlotsProvider, (GraphicsContext) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext()), composerStartRestartGroup, (i21 & 896) | i20 | i22 | ((i17 << 9) & 57344) | (i23 & 458752) | (i23 & 3670016) | ((i17 << 18) & 234881024));
                    int i24 = i17 >> 12;
                    int i25 = i17 >> 3;
                    composer2 = composerStartRestartGroup;
                    LazyLayoutKt.LazyLayout(function0RememberStaggeredGridItemProviderLambda, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier4.then(lazyStaggeredGridState.getRemeasurementModifier()).then(lazyStaggeredGridState.getAwaitLayoutModifier()), function0RememberStaggeredGridItemProviderLambda, LazyStaggeredGridSemanticsKt.rememberLazyStaggeredGridSemanticState(lazyStaggeredGridState, z9, composerStartRestartGroup, (i24 & 112) | i20), orientation, z5, z9, composerStartRestartGroup, ((i17 << 6) & 7168) | (i23 & 57344) | (i17 & 458752)), LazyStaggeredGridBeyondBoundsModifierKt.rememberLazyStaggeredGridBeyondBoundsState(lazyStaggeredGridState, composerStartRestartGroup, i20), lazyStaggeredGridState.getBeyondBoundsInfo(), z9, (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation, z5, composerStartRestartGroup, (3670016 & i25) | (MutableVector.$stable << 6) | i22 | ((i17 << 12) & 458752)).then(lazyStaggeredGridState.getItemAnimator$foundation_release().getModifier()), lazyStaggeredGridState, orientation, z5, z9, flingBehavior3, lazyStaggeredGridState.getMutableInteractionSource(), null, composerStartRestartGroup, ((i17 << 3) & PointerIconCompat.TYPE_TEXT) | (i24 & 7168) | (i25 & 57344) | (i25 & 458752), 64), lazyStaggeredGridState.getPrefetchState(), function2M1214rememberStaggeredGridMeasurePolicyqKj4JfE, composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z7 = z9;
                    modifier3 = modifier4;
                    paddingValues3 = paddingValues2;
                    flingBehavior4 = flingBehavior3;
                    z8 = z5;
                    f6 = f5;
                    f7 = f4;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier;
                    paddingValues3 = paddingValues;
                    z7 = z;
                    flingBehavior4 = flingBehavior;
                    z8 = z2;
                    f6 = f;
                    composer2 = composerStartRestartGroup;
                    f7 = f2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridKt$LazyStaggeredGrid$1
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

                        public final void invoke(Composer composer3, int i26) {
                            LazyStaggeredGridKt.m1203LazyStaggeredGridLJWHXA8(lazyStaggeredGridState, orientation, lazyGridStaggeredGridSlotsProvider, modifier3, paddingValues3, z7, flingBehavior4, z8, f6, f7, function1, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                        }
                    });
                }
            }
            i4 |= 24576;
            i7 = i3 & 32;
            if (i7 != 0) {
                i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                if (composerStartRestartGroup.changed(z)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i4 |= i8;
            }
            if ((i & 1572864) != 0) {
                if ((i3 & 64) == 0) {
                    i18 = 524288;
                } else {
                    i18 = 524288;
                }
                i4 |= i18;
            }
            i9 = i3 & 128;
            if (i9 != 0) {
                i4 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (composerStartRestartGroup.changed(z2)) {
                    i10 = 8388608;
                } else {
                    i10 = 4194304;
                }
                i4 |= i10;
            }
            i11 = i3 & 256;
            if (i11 != 0) {
                i4 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (composerStartRestartGroup.changed(f)) {
                    i12 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i12 = 33554432;
                }
                i4 |= i12;
            }
            i13 = i3 & 512;
            if (i13 != 0) {
                i4 |= 805306368;
            } else if ((i & 805306368) == 0) {
                if (composerStartRestartGroup.changed(f2)) {
                    i14 = 536870912;
                } else {
                    i14 = 268435456;
                }
                i4 |= i14;
            }
            if ((i3 & 1024) != 0) {
                i15 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i16 = 4;
                } else {
                    i16 = 2;
                }
                i15 = i2 | i16;
            } else {
                i15 = i2;
            }
            if ((i4 & 306783379) == 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i19 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i5 != 0) {
                        paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                    } else {
                        paddingValuesM995PaddingValues0680j_4 = paddingValues;
                    }
                    if (i7 != 0) {
                        z3 = false;
                    } else {
                        z3 = z;
                    }
                    if ((i3 & 64) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i4 &= -3670017;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i9 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    if (i11 != 0) {
                        f3 = 0.0f;
                        fM6935constructorimpl = Dp.m6935constructorimpl(0.0f);
                    } else {
                        f3 = 0.0f;
                        fM6935constructorimpl = f;
                    }
                    if (i13 != 0) {
                        fM6935constructorimpl2 = Dp.m6935constructorimpl(f3);
                    } else {
                        fM6935constructorimpl2 = f2;
                    }
                    f4 = fM6935constructorimpl2;
                    z5 = z4;
                    flingBehavior3 = flingBehavior2;
                    z6 = z3;
                    f5 = fM6935constructorimpl;
                    modifier2 = companion;
                    paddingValues2 = paddingValuesM995PaddingValues0680j_4;
                } else {
                    if (i19 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i5 != 0) {
                        paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                    } else {
                        paddingValuesM995PaddingValues0680j_4 = paddingValues;
                    }
                    if (i7 != 0) {
                        z3 = false;
                    } else {
                        z3 = z;
                    }
                    if ((i3 & 64) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i4 &= -3670017;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i9 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    if (i11 != 0) {
                        f3 = 0.0f;
                        fM6935constructorimpl = Dp.m6935constructorimpl(0.0f);
                    } else {
                        f3 = 0.0f;
                        fM6935constructorimpl = f;
                    }
                    if (i13 != 0) {
                        fM6935constructorimpl2 = Dp.m6935constructorimpl(f3);
                    } else {
                        fM6935constructorimpl2 = f2;
                    }
                    f4 = fM6935constructorimpl2;
                    z5 = z4;
                    flingBehavior3 = flingBehavior2;
                    z6 = z3;
                    f5 = fM6935constructorimpl;
                    modifier2 = companion;
                    paddingValues2 = paddingValuesM995PaddingValues0680j_4;
                }
                i17 = i4;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(288295126, i17, i15, "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGrid (LazyStaggeredGrid.kt:60)");
                }
                int i26 = i17 & 14;
                Function0<LazyStaggeredGridItemProvider> function0RememberStaggeredGridItemProviderLambda2 = LazyStaggeredGridItemProviderKt.rememberStaggeredGridItemProviderLambda(lazyStaggeredGridState, function1, composerStartRestartGroup, ((i15 << 3) & 112) | i26);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller2 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                    composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller2);
                    objRememberedValue = compositionScopedCoroutineScopeCanceller2;
                }
                int i27 = i17 >> 6;
                int i28 = i27 & 7168;
                int i29 = i17 >> 9;
                boolean z10 = z6;
                Modifier modifier5 = modifier2;
                Function2<LazyLayoutMeasureScope, Constraints, LazyStaggeredGridMeasureResult> function2M1214rememberStaggeredGridMeasurePolicyqKj4JfE2 = LazyStaggeredGridMeasurePolicyKt.m1214rememberStaggeredGridMeasurePolicyqKj4JfE(lazyStaggeredGridState, function0RememberStaggeredGridItemProviderLambda2, paddingValues2, z6, orientation, f5, f4, ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope(), lazyGridStaggeredGridSlotsProvider, (GraphicsContext) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext()), composerStartRestartGroup, (i27 & 896) | i26 | i28 | ((i17 << 9) & 57344) | (i29 & 458752) | (i29 & 3670016) | ((i17 << 18) & 234881024));
                int i210 = i17 >> 12;
                int i211 = i17 >> 3;
                composer2 = composerStartRestartGroup;
                LazyLayoutKt.LazyLayout(function0RememberStaggeredGridItemProviderLambda2, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier5.then(lazyStaggeredGridState.getRemeasurementModifier()).then(lazyStaggeredGridState.getAwaitLayoutModifier()), function0RememberStaggeredGridItemProviderLambda2, LazyStaggeredGridSemanticsKt.rememberLazyStaggeredGridSemanticState(lazyStaggeredGridState, z10, composerStartRestartGroup, (i210 & 112) | i26), orientation, z5, z10, composerStartRestartGroup, ((i17 << 6) & 7168) | (i29 & 57344) | (i17 & 458752)), LazyStaggeredGridBeyondBoundsModifierKt.rememberLazyStaggeredGridBeyondBoundsState(lazyStaggeredGridState, composerStartRestartGroup, i26), lazyStaggeredGridState.getBeyondBoundsInfo(), z10, (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation, z5, composerStartRestartGroup, (3670016 & i211) | (MutableVector.$stable << 6) | i28 | ((i17 << 12) & 458752)).then(lazyStaggeredGridState.getItemAnimator$foundation_release().getModifier()), lazyStaggeredGridState, orientation, z5, z10, flingBehavior3, lazyStaggeredGridState.getMutableInteractionSource(), null, composerStartRestartGroup, ((i17 << 3) & PointerIconCompat.TYPE_TEXT) | (i210 & 7168) | (i211 & 57344) | (i211 & 458752), 64), lazyStaggeredGridState.getPrefetchState(), function2M1214rememberStaggeredGridMeasurePolicyqKj4JfE2, composer2, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z7 = z10;
                modifier3 = modifier5;
                paddingValues3 = paddingValues2;
                flingBehavior4 = flingBehavior3;
                z8 = z5;
                f6 = f5;
                f7 = f4;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i19 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i5 != 0) {
                        paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                    } else {
                        paddingValuesM995PaddingValues0680j_4 = paddingValues;
                    }
                    if (i7 != 0) {
                        z3 = false;
                    } else {
                        z3 = z;
                    }
                    if ((i3 & 64) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i4 &= -3670017;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i9 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    if (i11 != 0) {
                        f3 = 0.0f;
                        fM6935constructorimpl = Dp.m6935constructorimpl(0.0f);
                    } else {
                        f3 = 0.0f;
                        fM6935constructorimpl = f;
                    }
                    if (i13 != 0) {
                        fM6935constructorimpl2 = Dp.m6935constructorimpl(f3);
                    } else {
                        fM6935constructorimpl2 = f2;
                    }
                    f4 = fM6935constructorimpl2;
                    z5 = z4;
                    flingBehavior3 = flingBehavior2;
                    z6 = z3;
                    f5 = fM6935constructorimpl;
                    modifier2 = companion;
                    paddingValues2 = paddingValuesM995PaddingValues0680j_4;
                } else {
                    if (i19 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i5 != 0) {
                        paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                    } else {
                        paddingValuesM995PaddingValues0680j_4 = paddingValues;
                    }
                    if (i7 != 0) {
                        z3 = false;
                    } else {
                        z3 = z;
                    }
                    if ((i3 & 64) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i4 &= -3670017;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i9 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    if (i11 != 0) {
                        f3 = 0.0f;
                        fM6935constructorimpl = Dp.m6935constructorimpl(0.0f);
                    } else {
                        f3 = 0.0f;
                        fM6935constructorimpl = f;
                    }
                    if (i13 != 0) {
                        fM6935constructorimpl2 = Dp.m6935constructorimpl(f3);
                    } else {
                        fM6935constructorimpl2 = f2;
                    }
                    f4 = fM6935constructorimpl2;
                    z5 = z4;
                    flingBehavior3 = flingBehavior2;
                    z6 = z3;
                    f5 = fM6935constructorimpl;
                    modifier2 = companion;
                    paddingValues2 = paddingValuesM995PaddingValues0680j_4;
                }
                i17 = i4;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(288295126, i17, i15, "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGrid (LazyStaggeredGrid.kt:60)");
                }
                int i212 = i17 & 14;
                Function0<LazyStaggeredGridItemProvider> function0RememberStaggeredGridItemProviderLambda3 = LazyStaggeredGridItemProviderKt.rememberStaggeredGridItemProviderLambda(lazyStaggeredGridState, function1, composerStartRestartGroup, ((i15 << 3) & 112) | i212);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller3 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                    composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller3);
                    objRememberedValue = compositionScopedCoroutineScopeCanceller3;
                }
                int i213 = i17 >> 6;
                int i214 = i213 & 7168;
                int i215 = i17 >> 9;
                boolean z11 = z6;
                Modifier modifier6 = modifier2;
                Function2<LazyLayoutMeasureScope, Constraints, LazyStaggeredGridMeasureResult> function2M1214rememberStaggeredGridMeasurePolicyqKj4JfE3 = LazyStaggeredGridMeasurePolicyKt.m1214rememberStaggeredGridMeasurePolicyqKj4JfE(lazyStaggeredGridState, function0RememberStaggeredGridItemProviderLambda3, paddingValues2, z6, orientation, f5, f4, ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope(), lazyGridStaggeredGridSlotsProvider, (GraphicsContext) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext()), composerStartRestartGroup, (i213 & 896) | i212 | i214 | ((i17 << 9) & 57344) | (i215 & 458752) | (i215 & 3670016) | ((i17 << 18) & 234881024));
                int i216 = i17 >> 12;
                int i217 = i17 >> 3;
                composer2 = composerStartRestartGroup;
                LazyLayoutKt.LazyLayout(function0RememberStaggeredGridItemProviderLambda3, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier6.then(lazyStaggeredGridState.getRemeasurementModifier()).then(lazyStaggeredGridState.getAwaitLayoutModifier()), function0RememberStaggeredGridItemProviderLambda3, LazyStaggeredGridSemanticsKt.rememberLazyStaggeredGridSemanticState(lazyStaggeredGridState, z11, composerStartRestartGroup, (i216 & 112) | i212), orientation, z5, z11, composerStartRestartGroup, ((i17 << 6) & 7168) | (i215 & 57344) | (i17 & 458752)), LazyStaggeredGridBeyondBoundsModifierKt.rememberLazyStaggeredGridBeyondBoundsState(lazyStaggeredGridState, composerStartRestartGroup, i212), lazyStaggeredGridState.getBeyondBoundsInfo(), z11, (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation, z5, composerStartRestartGroup, (3670016 & i217) | (MutableVector.$stable << 6) | i214 | ((i17 << 12) & 458752)).then(lazyStaggeredGridState.getItemAnimator$foundation_release().getModifier()), lazyStaggeredGridState, orientation, z5, z11, flingBehavior3, lazyStaggeredGridState.getMutableInteractionSource(), null, composerStartRestartGroup, ((i17 << 3) & PointerIconCompat.TYPE_TEXT) | (i216 & 7168) | (i217 & 57344) | (i217 & 458752), 64), lazyStaggeredGridState.getPrefetchState(), function2M1214rememberStaggeredGridMeasurePolicyqKj4JfE3, composer2, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z7 = z11;
                modifier3 = modifier6;
                paddingValues3 = paddingValues2;
                flingBehavior4 = flingBehavior3;
                z8 = z5;
                f6 = f5;
                f7 = f4;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridKt$LazyStaggeredGrid$1
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

                    public final void invoke(Composer composer3, int i218) {
                        LazyStaggeredGridKt.m1203LazyStaggeredGridLJWHXA8(lazyStaggeredGridState, orientation, lazyGridStaggeredGridSlotsProvider, modifier3, paddingValues3, z7, flingBehavior4, z8, f6, f7, function1, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                    }
                });
            }
        }
        i4 |= 3072;
        i5 = i3 & 16;
        if (i5 != 0) {
            if ((i & 24576) == 0) {
                if (composerStartRestartGroup.changed(paddingValues)) {
                    i6 = 16384;
                } else {
                    i6 = 8192;
                }
                i4 |= i6;
            }
            i7 = i3 & 32;
            if (i7 != 0) {
                i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                if (composerStartRestartGroup.changed(z)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i4 |= i8;
            }
            if ((i & 1572864) != 0) {
                if ((i3 & 64) == 0) {
                    i18 = 524288;
                } else {
                    i18 = 524288;
                }
                i4 |= i18;
            }
            i9 = i3 & 128;
            if (i9 != 0) {
                i4 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (composerStartRestartGroup.changed(z2)) {
                    i10 = 8388608;
                } else {
                    i10 = 4194304;
                }
                i4 |= i10;
            }
            i11 = i3 & 256;
            if (i11 != 0) {
                i4 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (composerStartRestartGroup.changed(f)) {
                    i12 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i12 = 33554432;
                }
                i4 |= i12;
            }
            i13 = i3 & 512;
            if (i13 != 0) {
                i4 |= 805306368;
            } else if ((i & 805306368) == 0) {
                if (composerStartRestartGroup.changed(f2)) {
                    i14 = 536870912;
                } else {
                    i14 = 268435456;
                }
                i4 |= i14;
            }
            if ((i3 & 1024) != 0) {
                i15 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i16 = 4;
                } else {
                    i16 = 2;
                }
                i15 = i2 | i16;
            } else {
                i15 = i2;
            }
            if ((i4 & 306783379) == 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i19 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i5 != 0) {
                        paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                    } else {
                        paddingValuesM995PaddingValues0680j_4 = paddingValues;
                    }
                    if (i7 != 0) {
                        z3 = false;
                    } else {
                        z3 = z;
                    }
                    if ((i3 & 64) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i4 &= -3670017;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i9 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    if (i11 != 0) {
                        f3 = 0.0f;
                        fM6935constructorimpl = Dp.m6935constructorimpl(0.0f);
                    } else {
                        f3 = 0.0f;
                        fM6935constructorimpl = f;
                    }
                    if (i13 != 0) {
                        fM6935constructorimpl2 = Dp.m6935constructorimpl(f3);
                    } else {
                        fM6935constructorimpl2 = f2;
                    }
                    f4 = fM6935constructorimpl2;
                    z5 = z4;
                    flingBehavior3 = flingBehavior2;
                    z6 = z3;
                    f5 = fM6935constructorimpl;
                    modifier2 = companion;
                    paddingValues2 = paddingValuesM995PaddingValues0680j_4;
                } else {
                    if (i19 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i5 != 0) {
                        paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                    } else {
                        paddingValuesM995PaddingValues0680j_4 = paddingValues;
                    }
                    if (i7 != 0) {
                        z3 = false;
                    } else {
                        z3 = z;
                    }
                    if ((i3 & 64) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i4 &= -3670017;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i9 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    if (i11 != 0) {
                        f3 = 0.0f;
                        fM6935constructorimpl = Dp.m6935constructorimpl(0.0f);
                    } else {
                        f3 = 0.0f;
                        fM6935constructorimpl = f;
                    }
                    if (i13 != 0) {
                        fM6935constructorimpl2 = Dp.m6935constructorimpl(f3);
                    } else {
                        fM6935constructorimpl2 = f2;
                    }
                    f4 = fM6935constructorimpl2;
                    z5 = z4;
                    flingBehavior3 = flingBehavior2;
                    z6 = z3;
                    f5 = fM6935constructorimpl;
                    modifier2 = companion;
                    paddingValues2 = paddingValuesM995PaddingValues0680j_4;
                }
                i17 = i4;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(288295126, i17, i15, "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGrid (LazyStaggeredGrid.kt:60)");
                }
                int i218 = i17 & 14;
                Function0<LazyStaggeredGridItemProvider> function0RememberStaggeredGridItemProviderLambda4 = LazyStaggeredGridItemProviderKt.rememberStaggeredGridItemProviderLambda(lazyStaggeredGridState, function1, composerStartRestartGroup, ((i15 << 3) & 112) | i218);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller4 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                    composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller4);
                    objRememberedValue = compositionScopedCoroutineScopeCanceller4;
                }
                int i219 = i17 >> 6;
                int i2110 = i219 & 7168;
                int i2111 = i17 >> 9;
                boolean z12 = z6;
                Modifier modifier7 = modifier2;
                Function2<LazyLayoutMeasureScope, Constraints, LazyStaggeredGridMeasureResult> function2M1214rememberStaggeredGridMeasurePolicyqKj4JfE4 = LazyStaggeredGridMeasurePolicyKt.m1214rememberStaggeredGridMeasurePolicyqKj4JfE(lazyStaggeredGridState, function0RememberStaggeredGridItemProviderLambda4, paddingValues2, z6, orientation, f5, f4, ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope(), lazyGridStaggeredGridSlotsProvider, (GraphicsContext) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext()), composerStartRestartGroup, (i219 & 896) | i218 | i2110 | ((i17 << 9) & 57344) | (i2111 & 458752) | (i2111 & 3670016) | ((i17 << 18) & 234881024));
                int i2112 = i17 >> 12;
                int i2113 = i17 >> 3;
                composer2 = composerStartRestartGroup;
                LazyLayoutKt.LazyLayout(function0RememberStaggeredGridItemProviderLambda4, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier7.then(lazyStaggeredGridState.getRemeasurementModifier()).then(lazyStaggeredGridState.getAwaitLayoutModifier()), function0RememberStaggeredGridItemProviderLambda4, LazyStaggeredGridSemanticsKt.rememberLazyStaggeredGridSemanticState(lazyStaggeredGridState, z12, composerStartRestartGroup, (i2112 & 112) | i218), orientation, z5, z12, composerStartRestartGroup, ((i17 << 6) & 7168) | (i2111 & 57344) | (i17 & 458752)), LazyStaggeredGridBeyondBoundsModifierKt.rememberLazyStaggeredGridBeyondBoundsState(lazyStaggeredGridState, composerStartRestartGroup, i218), lazyStaggeredGridState.getBeyondBoundsInfo(), z12, (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation, z5, composerStartRestartGroup, (3670016 & i2113) | (MutableVector.$stable << 6) | i2110 | ((i17 << 12) & 458752)).then(lazyStaggeredGridState.getItemAnimator$foundation_release().getModifier()), lazyStaggeredGridState, orientation, z5, z12, flingBehavior3, lazyStaggeredGridState.getMutableInteractionSource(), null, composerStartRestartGroup, ((i17 << 3) & PointerIconCompat.TYPE_TEXT) | (i2112 & 7168) | (i2113 & 57344) | (i2113 & 458752), 64), lazyStaggeredGridState.getPrefetchState(), function2M1214rememberStaggeredGridMeasurePolicyqKj4JfE4, composer2, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z7 = z12;
                modifier3 = modifier7;
                paddingValues3 = paddingValues2;
                flingBehavior4 = flingBehavior3;
                z8 = z5;
                f6 = f5;
                f7 = f4;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i19 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i5 != 0) {
                        paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                    } else {
                        paddingValuesM995PaddingValues0680j_4 = paddingValues;
                    }
                    if (i7 != 0) {
                        z3 = false;
                    } else {
                        z3 = z;
                    }
                    if ((i3 & 64) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i4 &= -3670017;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i9 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    if (i11 != 0) {
                        f3 = 0.0f;
                        fM6935constructorimpl = Dp.m6935constructorimpl(0.0f);
                    } else {
                        f3 = 0.0f;
                        fM6935constructorimpl = f;
                    }
                    if (i13 != 0) {
                        fM6935constructorimpl2 = Dp.m6935constructorimpl(f3);
                    } else {
                        fM6935constructorimpl2 = f2;
                    }
                    f4 = fM6935constructorimpl2;
                    z5 = z4;
                    flingBehavior3 = flingBehavior2;
                    z6 = z3;
                    f5 = fM6935constructorimpl;
                    modifier2 = companion;
                    paddingValues2 = paddingValuesM995PaddingValues0680j_4;
                } else {
                    if (i19 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i5 != 0) {
                        paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                    } else {
                        paddingValuesM995PaddingValues0680j_4 = paddingValues;
                    }
                    if (i7 != 0) {
                        z3 = false;
                    } else {
                        z3 = z;
                    }
                    if ((i3 & 64) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i4 &= -3670017;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i9 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    if (i11 != 0) {
                        f3 = 0.0f;
                        fM6935constructorimpl = Dp.m6935constructorimpl(0.0f);
                    } else {
                        f3 = 0.0f;
                        fM6935constructorimpl = f;
                    }
                    if (i13 != 0) {
                        fM6935constructorimpl2 = Dp.m6935constructorimpl(f3);
                    } else {
                        fM6935constructorimpl2 = f2;
                    }
                    f4 = fM6935constructorimpl2;
                    z5 = z4;
                    flingBehavior3 = flingBehavior2;
                    z6 = z3;
                    f5 = fM6935constructorimpl;
                    modifier2 = companion;
                    paddingValues2 = paddingValuesM995PaddingValues0680j_4;
                }
                i17 = i4;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(288295126, i17, i15, "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGrid (LazyStaggeredGrid.kt:60)");
                }
                int i2114 = i17 & 14;
                Function0<LazyStaggeredGridItemProvider> function0RememberStaggeredGridItemProviderLambda5 = LazyStaggeredGridItemProviderKt.rememberStaggeredGridItemProviderLambda(lazyStaggeredGridState, function1, composerStartRestartGroup, ((i15 << 3) & 112) | i2114);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller5 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                    composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller5);
                    objRememberedValue = compositionScopedCoroutineScopeCanceller5;
                }
                int i2115 = i17 >> 6;
                int i2116 = i2115 & 7168;
                int i2117 = i17 >> 9;
                boolean z13 = z6;
                Modifier modifier8 = modifier2;
                Function2<LazyLayoutMeasureScope, Constraints, LazyStaggeredGridMeasureResult> function2M1214rememberStaggeredGridMeasurePolicyqKj4JfE5 = LazyStaggeredGridMeasurePolicyKt.m1214rememberStaggeredGridMeasurePolicyqKj4JfE(lazyStaggeredGridState, function0RememberStaggeredGridItemProviderLambda5, paddingValues2, z6, orientation, f5, f4, ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope(), lazyGridStaggeredGridSlotsProvider, (GraphicsContext) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext()), composerStartRestartGroup, (i2115 & 896) | i2114 | i2116 | ((i17 << 9) & 57344) | (i2117 & 458752) | (i2117 & 3670016) | ((i17 << 18) & 234881024));
                int i2118 = i17 >> 12;
                int i2119 = i17 >> 3;
                composer2 = composerStartRestartGroup;
                LazyLayoutKt.LazyLayout(function0RememberStaggeredGridItemProviderLambda5, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier8.then(lazyStaggeredGridState.getRemeasurementModifier()).then(lazyStaggeredGridState.getAwaitLayoutModifier()), function0RememberStaggeredGridItemProviderLambda5, LazyStaggeredGridSemanticsKt.rememberLazyStaggeredGridSemanticState(lazyStaggeredGridState, z13, composerStartRestartGroup, (i2118 & 112) | i2114), orientation, z5, z13, composerStartRestartGroup, ((i17 << 6) & 7168) | (i2117 & 57344) | (i17 & 458752)), LazyStaggeredGridBeyondBoundsModifierKt.rememberLazyStaggeredGridBeyondBoundsState(lazyStaggeredGridState, composerStartRestartGroup, i2114), lazyStaggeredGridState.getBeyondBoundsInfo(), z13, (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation, z5, composerStartRestartGroup, (3670016 & i2119) | (MutableVector.$stable << 6) | i2116 | ((i17 << 12) & 458752)).then(lazyStaggeredGridState.getItemAnimator$foundation_release().getModifier()), lazyStaggeredGridState, orientation, z5, z13, flingBehavior3, lazyStaggeredGridState.getMutableInteractionSource(), null, composerStartRestartGroup, ((i17 << 3) & PointerIconCompat.TYPE_TEXT) | (i2118 & 7168) | (i2119 & 57344) | (i2119 & 458752), 64), lazyStaggeredGridState.getPrefetchState(), function2M1214rememberStaggeredGridMeasurePolicyqKj4JfE5, composer2, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z7 = z13;
                modifier3 = modifier8;
                paddingValues3 = paddingValues2;
                flingBehavior4 = flingBehavior3;
                z8 = z5;
                f6 = f5;
                f7 = f4;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridKt$LazyStaggeredGrid$1
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

                    public final void invoke(Composer composer3, int i2120) {
                        LazyStaggeredGridKt.m1203LazyStaggeredGridLJWHXA8(lazyStaggeredGridState, orientation, lazyGridStaggeredGridSlotsProvider, modifier3, paddingValues3, z7, flingBehavior4, z8, f6, f7, function1, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                    }
                });
            }
        }
        i4 |= 24576;
        i7 = i3 & 32;
        if (i7 != 0) {
            i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            if (composerStartRestartGroup.changed(z)) {
                i8 = 131072;
            } else {
                i8 = 65536;
            }
            i4 |= i8;
        }
        if ((i & 1572864) != 0) {
            if ((i3 & 64) == 0) {
                i18 = 524288;
            } else {
                i18 = 524288;
            }
            i4 |= i18;
        }
        i9 = i3 & 128;
        if (i9 != 0) {
            i4 |= 12582912;
        } else if ((i & 12582912) == 0) {
            if (composerStartRestartGroup.changed(z2)) {
                i10 = 8388608;
            } else {
                i10 = 4194304;
            }
            i4 |= i10;
        }
        i11 = i3 & 256;
        if (i11 != 0) {
            i4 |= 100663296;
        } else if ((i & 100663296) == 0) {
            if (composerStartRestartGroup.changed(f)) {
                i12 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
            } else {
                i12 = 33554432;
            }
            i4 |= i12;
        }
        i13 = i3 & 512;
        if (i13 != 0) {
            i4 |= 805306368;
        } else if ((i & 805306368) == 0) {
            if (composerStartRestartGroup.changed(f2)) {
                i14 = 536870912;
            } else {
                i14 = 268435456;
            }
            i4 |= i14;
        }
        if ((i3 & 1024) != 0) {
            i15 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            if (composerStartRestartGroup.changedInstance(function1)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i15 = i2 | i16;
        } else {
            i15 = i2;
        }
        if ((i4 & 306783379) == 306783378) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i19 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier;
                }
                if (i5 != 0) {
                    paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                } else {
                    paddingValuesM995PaddingValues0680j_4 = paddingValues;
                }
                if (i7 != 0) {
                    z3 = false;
                } else {
                    z3 = z;
                }
                if ((i3 & 64) != 0) {
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    i4 &= -3670017;
                } else {
                    flingBehavior2 = flingBehavior;
                }
                if (i9 != 0) {
                    z4 = true;
                } else {
                    z4 = z2;
                }
                if (i11 != 0) {
                    f3 = 0.0f;
                    fM6935constructorimpl = Dp.m6935constructorimpl(0.0f);
                } else {
                    f3 = 0.0f;
                    fM6935constructorimpl = f;
                }
                if (i13 != 0) {
                    fM6935constructorimpl2 = Dp.m6935constructorimpl(f3);
                } else {
                    fM6935constructorimpl2 = f2;
                }
                f4 = fM6935constructorimpl2;
                z5 = z4;
                flingBehavior3 = flingBehavior2;
                z6 = z3;
                f5 = fM6935constructorimpl;
                modifier2 = companion;
                paddingValues2 = paddingValuesM995PaddingValues0680j_4;
            } else {
                if (i19 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier;
                }
                if (i5 != 0) {
                    paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                } else {
                    paddingValuesM995PaddingValues0680j_4 = paddingValues;
                }
                if (i7 != 0) {
                    z3 = false;
                } else {
                    z3 = z;
                }
                if ((i3 & 64) != 0) {
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    i4 &= -3670017;
                } else {
                    flingBehavior2 = flingBehavior;
                }
                if (i9 != 0) {
                    z4 = true;
                } else {
                    z4 = z2;
                }
                if (i11 != 0) {
                    f3 = 0.0f;
                    fM6935constructorimpl = Dp.m6935constructorimpl(0.0f);
                } else {
                    f3 = 0.0f;
                    fM6935constructorimpl = f;
                }
                if (i13 != 0) {
                    fM6935constructorimpl2 = Dp.m6935constructorimpl(f3);
                } else {
                    fM6935constructorimpl2 = f2;
                }
                f4 = fM6935constructorimpl2;
                z5 = z4;
                flingBehavior3 = flingBehavior2;
                z6 = z3;
                f5 = fM6935constructorimpl;
                modifier2 = companion;
                paddingValues2 = paddingValuesM995PaddingValues0680j_4;
            }
            i17 = i4;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(288295126, i17, i15, "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGrid (LazyStaggeredGrid.kt:60)");
            }
            int i21110 = i17 & 14;
            Function0<LazyStaggeredGridItemProvider> function0RememberStaggeredGridItemProviderLambda6 = LazyStaggeredGridItemProviderKt.rememberStaggeredGridItemProviderLambda(lazyStaggeredGridState, function1, composerStartRestartGroup, ((i15 << 3) & 112) | i21110);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller6 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller6);
                objRememberedValue = compositionScopedCoroutineScopeCanceller6;
            }
            int i21111 = i17 >> 6;
            int i21112 = i21111 & 7168;
            int i21113 = i17 >> 9;
            boolean z14 = z6;
            Modifier modifier9 = modifier2;
            Function2<LazyLayoutMeasureScope, Constraints, LazyStaggeredGridMeasureResult> function2M1214rememberStaggeredGridMeasurePolicyqKj4JfE6 = LazyStaggeredGridMeasurePolicyKt.m1214rememberStaggeredGridMeasurePolicyqKj4JfE(lazyStaggeredGridState, function0RememberStaggeredGridItemProviderLambda6, paddingValues2, z6, orientation, f5, f4, ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope(), lazyGridStaggeredGridSlotsProvider, (GraphicsContext) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext()), composerStartRestartGroup, (i21111 & 896) | i21110 | i21112 | ((i17 << 9) & 57344) | (i21113 & 458752) | (i21113 & 3670016) | ((i17 << 18) & 234881024));
            int i21114 = i17 >> 12;
            int i21115 = i17 >> 3;
            composer2 = composerStartRestartGroup;
            LazyLayoutKt.LazyLayout(function0RememberStaggeredGridItemProviderLambda6, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier9.then(lazyStaggeredGridState.getRemeasurementModifier()).then(lazyStaggeredGridState.getAwaitLayoutModifier()), function0RememberStaggeredGridItemProviderLambda6, LazyStaggeredGridSemanticsKt.rememberLazyStaggeredGridSemanticState(lazyStaggeredGridState, z14, composerStartRestartGroup, (i21114 & 112) | i21110), orientation, z5, z14, composerStartRestartGroup, ((i17 << 6) & 7168) | (i21113 & 57344) | (i17 & 458752)), LazyStaggeredGridBeyondBoundsModifierKt.rememberLazyStaggeredGridBeyondBoundsState(lazyStaggeredGridState, composerStartRestartGroup, i21110), lazyStaggeredGridState.getBeyondBoundsInfo(), z14, (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation, z5, composerStartRestartGroup, (3670016 & i21115) | (MutableVector.$stable << 6) | i21112 | ((i17 << 12) & 458752)).then(lazyStaggeredGridState.getItemAnimator$foundation_release().getModifier()), lazyStaggeredGridState, orientation, z5, z14, flingBehavior3, lazyStaggeredGridState.getMutableInteractionSource(), null, composerStartRestartGroup, ((i17 << 3) & PointerIconCompat.TYPE_TEXT) | (i21114 & 7168) | (i21115 & 57344) | (i21115 & 458752), 64), lazyStaggeredGridState.getPrefetchState(), function2M1214rememberStaggeredGridMeasurePolicyqKj4JfE6, composer2, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z7 = z14;
            modifier3 = modifier9;
            paddingValues3 = paddingValues2;
            flingBehavior4 = flingBehavior3;
            z8 = z5;
            f6 = f5;
            f7 = f4;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i19 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier;
                }
                if (i5 != 0) {
                    paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                } else {
                    paddingValuesM995PaddingValues0680j_4 = paddingValues;
                }
                if (i7 != 0) {
                    z3 = false;
                } else {
                    z3 = z;
                }
                if ((i3 & 64) != 0) {
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    i4 &= -3670017;
                } else {
                    flingBehavior2 = flingBehavior;
                }
                if (i9 != 0) {
                    z4 = true;
                } else {
                    z4 = z2;
                }
                if (i11 != 0) {
                    f3 = 0.0f;
                    fM6935constructorimpl = Dp.m6935constructorimpl(0.0f);
                } else {
                    f3 = 0.0f;
                    fM6935constructorimpl = f;
                }
                if (i13 != 0) {
                    fM6935constructorimpl2 = Dp.m6935constructorimpl(f3);
                } else {
                    fM6935constructorimpl2 = f2;
                }
                f4 = fM6935constructorimpl2;
                z5 = z4;
                flingBehavior3 = flingBehavior2;
                z6 = z3;
                f5 = fM6935constructorimpl;
                modifier2 = companion;
                paddingValues2 = paddingValuesM995PaddingValues0680j_4;
            } else {
                if (i19 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier;
                }
                if (i5 != 0) {
                    paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                } else {
                    paddingValuesM995PaddingValues0680j_4 = paddingValues;
                }
                if (i7 != 0) {
                    z3 = false;
                } else {
                    z3 = z;
                }
                if ((i3 & 64) != 0) {
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    i4 &= -3670017;
                } else {
                    flingBehavior2 = flingBehavior;
                }
                if (i9 != 0) {
                    z4 = true;
                } else {
                    z4 = z2;
                }
                if (i11 != 0) {
                    f3 = 0.0f;
                    fM6935constructorimpl = Dp.m6935constructorimpl(0.0f);
                } else {
                    f3 = 0.0f;
                    fM6935constructorimpl = f;
                }
                if (i13 != 0) {
                    fM6935constructorimpl2 = Dp.m6935constructorimpl(f3);
                } else {
                    fM6935constructorimpl2 = f2;
                }
                f4 = fM6935constructorimpl2;
                z5 = z4;
                flingBehavior3 = flingBehavior2;
                z6 = z3;
                f5 = fM6935constructorimpl;
                modifier2 = companion;
                paddingValues2 = paddingValuesM995PaddingValues0680j_4;
            }
            i17 = i4;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(288295126, i17, i15, "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGrid (LazyStaggeredGrid.kt:60)");
            }
            int i21116 = i17 & 14;
            Function0<LazyStaggeredGridItemProvider> function0RememberStaggeredGridItemProviderLambda7 = LazyStaggeredGridItemProviderKt.rememberStaggeredGridItemProviderLambda(lazyStaggeredGridState, function1, composerStartRestartGroup, ((i15 << 3) & 112) | i21116);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller7 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller7);
                objRememberedValue = compositionScopedCoroutineScopeCanceller7;
            }
            int i21117 = i17 >> 6;
            int i21118 = i21117 & 7168;
            int i21119 = i17 >> 9;
            boolean z15 = z6;
            Modifier modifier10 = modifier2;
            Function2<LazyLayoutMeasureScope, Constraints, LazyStaggeredGridMeasureResult> function2M1214rememberStaggeredGridMeasurePolicyqKj4JfE7 = LazyStaggeredGridMeasurePolicyKt.m1214rememberStaggeredGridMeasurePolicyqKj4JfE(lazyStaggeredGridState, function0RememberStaggeredGridItemProviderLambda7, paddingValues2, z6, orientation, f5, f4, ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope(), lazyGridStaggeredGridSlotsProvider, (GraphicsContext) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext()), composerStartRestartGroup, (i21117 & 896) | i21116 | i21118 | ((i17 << 9) & 57344) | (i21119 & 458752) | (i21119 & 3670016) | ((i17 << 18) & 234881024));
            int i211110 = i17 >> 12;
            int i211111 = i17 >> 3;
            composer2 = composerStartRestartGroup;
            LazyLayoutKt.LazyLayout(function0RememberStaggeredGridItemProviderLambda7, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier10.then(lazyStaggeredGridState.getRemeasurementModifier()).then(lazyStaggeredGridState.getAwaitLayoutModifier()), function0RememberStaggeredGridItemProviderLambda7, LazyStaggeredGridSemanticsKt.rememberLazyStaggeredGridSemanticState(lazyStaggeredGridState, z15, composerStartRestartGroup, (i211110 & 112) | i21116), orientation, z5, z15, composerStartRestartGroup, ((i17 << 6) & 7168) | (i21119 & 57344) | (i17 & 458752)), LazyStaggeredGridBeyondBoundsModifierKt.rememberLazyStaggeredGridBeyondBoundsState(lazyStaggeredGridState, composerStartRestartGroup, i21116), lazyStaggeredGridState.getBeyondBoundsInfo(), z15, (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation, z5, composerStartRestartGroup, (3670016 & i211111) | (MutableVector.$stable << 6) | i21118 | ((i17 << 12) & 458752)).then(lazyStaggeredGridState.getItemAnimator$foundation_release().getModifier()), lazyStaggeredGridState, orientation, z5, z15, flingBehavior3, lazyStaggeredGridState.getMutableInteractionSource(), null, composerStartRestartGroup, ((i17 << 3) & PointerIconCompat.TYPE_TEXT) | (i211110 & 7168) | (i211111 & 57344) | (i211111 & 458752), 64), lazyStaggeredGridState.getPrefetchState(), function2M1214rememberStaggeredGridMeasurePolicyqKj4JfE7, composer2, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z7 = z15;
            modifier3 = modifier10;
            paddingValues3 = paddingValues2;
            flingBehavior4 = flingBehavior3;
            z8 = z5;
            f6 = f5;
            f7 = f4;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridKt$LazyStaggeredGrid$1
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

                public final void invoke(Composer composer3, int i2120) {
                    LazyStaggeredGridKt.m1203LazyStaggeredGridLJWHXA8(lazyStaggeredGridState, orientation, lazyGridStaggeredGridSlotsProvider, modifier3, paddingValues3, z7, flingBehavior4, z8, f6, f7, function1, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                }
            });
        }
    }
}
