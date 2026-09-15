package androidx.compose.foundation.lazy;

import androidx.compose.foundation.CheckScrollableContainerConstraintsKt;
import androidx.compose.foundation.ScrollingContainerKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
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
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0098\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00010\u0019¢\u0006\u0002\b\u001bH\u0001¢\u0006\u0002\u0010\u001c\u001a\u009a\u0001\u0010\u001d\u001a\u0019\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001e¢\u0006\u0002\b\u001b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\tH\u0003¢\u0006\u0002\u0010*¨\u0006+"}, d2 = {"LazyList", "", "modifier", "Landroidx/compose/ui/Modifier;", RemoteConfigConstants.ResponseFieldKey.STATE, "Landroidx/compose/foundation/lazy/LazyListState;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "reverseLayout", "", "isVertical", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "userScrollEnabled", "beyondBoundsItemCount", "", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/LazyListScope;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZZLandroidx/compose/foundation/gestures/FlingBehavior;ZILandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "rememberLazyListMeasurePolicy", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "itemProviderLambda", "Lkotlin/Function0;", "Landroidx/compose/foundation/lazy/LazyListItemProvider;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "graphicsContext", "Landroidx/compose/ui/graphics/GraphicsContext;", "stickyHeadersEnabled", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZZILandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/ui/graphics/GraphicsContext;ZLandroidx/compose/runtime/Composer;II)Lkotlin/jvm/functions/Function2;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class LazyListKt {
    /* JADX WARN: Code duplicated, block: B:101:0x0122  */
    /* JADX WARN: Code duplicated, block: B:103:0x0128  */
    /* JADX WARN: Code duplicated, block: B:104:0x012b  */
    /* JADX WARN: Code duplicated, block: B:108:0x0133  */
    /* JADX WARN: Code duplicated, block: B:109:0x0138  */
    /* JADX WARN: Code duplicated, block: B:111:0x013e  */
    /* JADX WARN: Code duplicated, block: B:113:0x0144  */
    /* JADX WARN: Code duplicated, block: B:114:0x0147  */
    /* JADX WARN: Code duplicated, block: B:116:0x014c  */
    /* JADX WARN: Code duplicated, block: B:119:0x0152  */
    /* JADX WARN: Code duplicated, block: B:120:0x0155  */
    /* JADX WARN: Code duplicated, block: B:122:0x015b  */
    /* JADX WARN: Code duplicated, block: B:124:0x0161  */
    /* JADX WARN: Code duplicated, block: B:125:0x0164  */
    /* JADX WARN: Code duplicated, block: B:129:0x016e  */
    /* JADX WARN: Code duplicated, block: B:130:0x0171  */
    /* JADX WARN: Code duplicated, block: B:132:0x0175  */
    /* JADX WARN: Code duplicated, block: B:134:0x017b  */
    /* JADX WARN: Code duplicated, block: B:138:0x0188  */
    /* JADX WARN: Code duplicated, block: B:143:0x01a4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:144:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:145:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:148:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:149:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:151:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:152:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:154:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:155:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:157:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:158:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:161:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:164:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:167:0x027d  */
    /* JADX WARN: Code duplicated, block: B:168:0x0280  */
    /* JADX WARN: Code duplicated, block: B:171:0x0333  */
    /* JADX WARN: Code duplicated, block: B:175:0x0345  */
    /* JADX WARN: Code duplicated, block: B:177:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0068  */
    /* JADX WARN: Code duplicated, block: B:37:0x006b  */
    /* JADX WARN: Code duplicated, block: B:39:0x006f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0077  */
    /* JADX WARN: Code duplicated, block: B:42:0x007a  */
    /* JADX WARN: Code duplicated, block: B:47:0x0085  */
    /* JADX WARN: Code duplicated, block: B:48:0x0088  */
    /* JADX WARN: Code duplicated, block: B:50:0x008c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0092  */
    /* JADX WARN: Code duplicated, block: B:53:0x0095  */
    /* JADX WARN: Code duplicated, block: B:57:0x009e  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:78:0x00db  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:91:0x0104  */
    /* JADX WARN: Code duplicated, block: B:93:0x010a  */
    /* JADX WARN: Code duplicated, block: B:94:0x010d  */
    /* JADX WARN: Code duplicated, block: B:98:0x0117  */
    /* JADX WARN: Code duplicated, block: B:99:0x011c  */
    public static final void LazyList(final Modifier modifier, final LazyListState lazyListState, final PaddingValues paddingValues, final boolean z, final boolean z2, final FlingBehavior flingBehavior, final boolean z3, int i, Alignment.Horizontal horizontal, Arrangement.Vertical vertical, Alignment.Vertical vertical2, Arrangement.Horizontal horizontal2, final Function1<? super LazyListScope, Unit> function1, Composer composer, final int i2, final int i3, final int i4) {
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
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        Alignment.Horizontal horizontal3;
        Arrangement.Vertical vertical3;
        Alignment.Vertical vertical4;
        Arrangement.Horizontal horizontal4;
        Object objRememberedValue;
        Orientation orientation;
        Composer composer2;
        final int i23;
        final Alignment.Horizontal horizontal5;
        final Arrangement.Vertical vertical5;
        final Alignment.Vertical vertical6;
        final Arrangement.Horizontal horizontal6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(620764179);
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerStartRestartGroup.changed(lazyListState) ? 32 : 16;
        }
        if ((i4 & 4) == 0) {
            if ((i2 & 384) == 0) {
                i5 |= composerStartRestartGroup.changed(paddingValues) ? 256 : 128;
            }
            if ((i4 & 8) != 0) {
                if ((i2 & 3072) == 0) {
                    if (composerStartRestartGroup.changed(z)) {
                        i6 = 2048;
                    } else {
                        i6 = 1024;
                    }
                    i5 |= i6;
                }
                if ((i4 & 16) != 0) {
                    i5 |= 24576;
                } else if ((i2 & 24576) == 0) {
                    if (composerStartRestartGroup.changed(z2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i5 |= i7;
                }
                if ((i4 & 32) != 0) {
                    if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        if (composerStartRestartGroup.changed(flingBehavior)) {
                            i8 = 131072;
                        } else {
                            i8 = 65536;
                        }
                        i5 |= i8;
                    }
                    if ((i4 & 64) != 0) {
                        i5 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        if (composerStartRestartGroup.changed(z3)) {
                            i9 = 1048576;
                        } else {
                            i9 = 524288;
                        }
                        i5 |= i9;
                    }
                    i10 = i4 & 128;
                    if (i10 != 0) {
                        i5 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        if (composerStartRestartGroup.changed(i)) {
                            i11 = 8388608;
                        } else {
                            i11 = 4194304;
                        }
                        i5 |= i11;
                    }
                    i12 = i4 & 256;
                    if (i12 != 0) {
                        i5 |= 100663296;
                    } else if ((i2 & 100663296) == 0) {
                        if (composerStartRestartGroup.changed(horizontal)) {
                            i13 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        } else {
                            i13 = 33554432;
                        }
                        i5 |= i13;
                    }
                    i14 = i4 & 512;
                    if (i14 != 0) {
                        i5 |= 805306368;
                    } else if ((i2 & 805306368) == 0) {
                        if (composerStartRestartGroup.changed(vertical)) {
                            i15 = 536870912;
                        } else {
                            i15 = 268435456;
                        }
                        i5 |= i15;
                    }
                    i16 = i4 & 1024;
                    if (i16 != 0) {
                        i17 = i3 | 6;
                    } else if ((i3 & 6) == 0) {
                        if (composerStartRestartGroup.changed(vertical2)) {
                            i18 = 4;
                        } else {
                            i18 = 2;
                        }
                        i17 = i3 | i18;
                    } else {
                        i17 = i3;
                    }
                    i19 = i4 & 2048;
                    if (i19 != 0) {
                        i17 |= 48;
                    } else if ((i3 & 48) == 0) {
                        if (composerStartRestartGroup.changed(horizontal2)) {
                            i20 = 32;
                        } else {
                            i20 = 16;
                        }
                        i17 |= i20;
                    }
                    i21 = i17;
                    if ((i4 & 4096) != 0) {
                        i21 |= 384;
                    } else if ((i3 & 384) == 0) {
                        i21 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
                    }
                    if ((306783379 & i5) == 306783378 || (i21 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
                        if (i10 != 0) {
                            i22 = 0;
                        } else {
                            i22 = i;
                        }
                        if (i12 != 0) {
                            horizontal3 = null;
                        } else {
                            horizontal3 = horizontal;
                        }
                        if (i14 != 0) {
                            vertical3 = null;
                        } else {
                            vertical3 = vertical;
                        }
                        if (i16 != 0) {
                            vertical4 = null;
                        } else {
                            vertical4 = vertical2;
                        }
                        if (i19 != 0) {
                            horizontal4 = null;
                        } else {
                            horizontal4 = horizontal2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(620764179, i5, i21, "androidx.compose.foundation.lazy.LazyList (LazyList.kt:80)");
                        }
                        int i24 = (i5 >> 3) & 14;
                        Function0<LazyListItemProvider> function0RememberLazyListItemProviderLambda = LazyListItemProviderKt.rememberLazyListItemProviderLambda(lazyListState, function1, composerStartRestartGroup, i24 | ((i21 >> 3) & 112));
                        int i25 = i5 >> 9;
                        LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyListSemanticState = LazyListSemanticsKt.rememberLazyListSemanticState(lazyListState, z2, composerStartRestartGroup, i24 | (i25 & 112));
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                            composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                            objRememberedValue = compositionScopedCoroutineScopeCanceller;
                        }
                        int i26 = i5 >> 6;
                        int i27 = i21 << 21;
                        int i28 = i5;
                        int i29 = i22;
                        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyListMeasurePolicy = rememberLazyListMeasurePolicy(function0RememberLazyListItemProviderLambda, lazyListState, paddingValues, z, z2, i22, horizontal3, vertical4, horizontal4, vertical3, ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope(), (GraphicsContext) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext()), !((Boolean) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalScrollCaptureInProgress())).booleanValue(), composerStartRestartGroup, (65520 & i5) | (i26 & 458752) | (i26 & 3670016) | (29360128 & i27) | (i27 & 234881024) | (1879048192 & i5), 0);
                        if (z2) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Horizontal;
                        }
                        Orientation orientation2 = orientation;
                        composer2 = composerStartRestartGroup;
                        LazyLayoutKt.LazyLayout(function0RememberLazyListItemProviderLambda, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier.then(lazyListState.getRemeasurementModifier()).then(lazyListState.getAwaitLayoutModifier()), function0RememberLazyListItemProviderLambda, lazyLayoutSemanticStateRememberLazyListSemanticState, orientation2, z3, z, composerStartRestartGroup, (i26 & 57344) | ((i28 << 6) & 458752)), LazyListBeyondBoundsModifierKt.rememberLazyListBeyondBoundsState(lazyListState, i29, composer2, i24 | ((i28 >> 18) & 112)), lazyListState.getBeyondBoundsInfo(), z, (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation2, z3, composer2, (MutableVector.$stable << 6) | (i28 & 7168) | (3670016 & i28)).then(lazyListState.getItemAnimator$foundation_release().getModifier()), lazyListState, orientation2, z3, z, flingBehavior, lazyListState.getInternalInteractionSource(), null, composer2, (i28 & 112) | (i25 & 7168) | (57344 & (i28 << 3)) | (i28 & 458752), 64), lazyListState.getPrefetchState(), function2RememberLazyListMeasurePolicy, composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        i23 = i29;
                        horizontal5 = horizontal3;
                        vertical5 = vertical3;
                        vertical6 = vertical4;
                        horizontal6 = horizontal4;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        i23 = i;
                        horizontal5 = horizontal;
                        vertical6 = vertical2;
                        horizontal6 = horizontal2;
                        composer2 = composerStartRestartGroup;
                        vertical5 = vertical;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyListKt.LazyList.1
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

                            public final void invoke(Composer composer3, int i30) {
                                LazyListKt.LazyList(modifier, lazyListState, paddingValues, z, z2, flingBehavior, z3, i23, horizontal5, vertical5, vertical6, horizontal6, function1, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
                            }
                        });
                    }
                }
                i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                if ((i4 & 64) != 0) {
                    i5 |= 1572864;
                } else if ((i2 & 1572864) == 0) {
                    if (composerStartRestartGroup.changed(z3)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i5 |= i9;
                }
                i10 = i4 & 128;
                if (i10 != 0) {
                    i5 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    if (composerStartRestartGroup.changed(i)) {
                        i11 = 8388608;
                    } else {
                        i11 = 4194304;
                    }
                    i5 |= i11;
                }
                i12 = i4 & 256;
                if (i12 != 0) {
                    i5 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    if (composerStartRestartGroup.changed(horizontal)) {
                        i13 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i13 = 33554432;
                    }
                    i5 |= i13;
                }
                i14 = i4 & 512;
                if (i14 != 0) {
                    i5 |= 805306368;
                } else if ((i2 & 805306368) == 0) {
                    if (composerStartRestartGroup.changed(vertical)) {
                        i15 = 536870912;
                    } else {
                        i15 = 268435456;
                    }
                    i5 |= i15;
                }
                i16 = i4 & 1024;
                if (i16 != 0) {
                    i17 = i3 | 6;
                } else if ((i3 & 6) == 0) {
                    if (composerStartRestartGroup.changed(vertical2)) {
                        i18 = 4;
                    } else {
                        i18 = 2;
                    }
                    i17 = i3 | i18;
                } else {
                    i17 = i3;
                }
                i19 = i4 & 2048;
                if (i19 != 0) {
                    i17 |= 48;
                } else if ((i3 & 48) == 0) {
                    if (composerStartRestartGroup.changed(horizontal2)) {
                        i20 = 32;
                    } else {
                        i20 = 16;
                    }
                    i17 |= i20;
                }
                i21 = i17;
                if ((i4 & 4096) != 0) {
                    i21 |= 384;
                } else if ((i3 & 384) == 0) {
                    i21 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
                }
                if ((306783379 & i5) == 306783378) {
                    if (i10 != 0) {
                        i22 = 0;
                    } else {
                        i22 = i;
                    }
                    if (i12 != 0) {
                        horizontal3 = null;
                    } else {
                        horizontal3 = horizontal;
                    }
                    if (i14 != 0) {
                        vertical3 = null;
                    } else {
                        vertical3 = vertical;
                    }
                    if (i16 != 0) {
                        vertical4 = null;
                    } else {
                        vertical4 = vertical2;
                    }
                    if (i19 != 0) {
                        horizontal4 = null;
                    } else {
                        horizontal4 = horizontal2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(620764179, i5, i21, "androidx.compose.foundation.lazy.LazyList (LazyList.kt:80)");
                    }
                    int i210 = (i5 >> 3) & 14;
                    Function0<LazyListItemProvider> function0RememberLazyListItemProviderLambda2 = LazyListItemProviderKt.rememberLazyListItemProviderLambda(lazyListState, function1, composerStartRestartGroup, i210 | ((i21 >> 3) & 112));
                    int i211 = i5 >> 9;
                    LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyListSemanticState2 = LazyListSemanticsKt.rememberLazyListSemanticState(lazyListState, z2, composerStartRestartGroup, i210 | (i211 & 112));
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller2 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                        composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller2);
                        objRememberedValue = compositionScopedCoroutineScopeCanceller2;
                    }
                    int i212 = i5 >> 6;
                    int i213 = i21 << 21;
                    int i214 = i5;
                    int i215 = i22;
                    Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyListMeasurePolicy2 = rememberLazyListMeasurePolicy(function0RememberLazyListItemProviderLambda2, lazyListState, paddingValues, z, z2, i22, horizontal3, vertical4, horizontal4, vertical3, ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope(), (GraphicsContext) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext()), !((Boolean) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalScrollCaptureInProgress())).booleanValue(), composerStartRestartGroup, (65520 & i5) | (i212 & 458752) | (i212 & 3670016) | (29360128 & i213) | (i213 & 234881024) | (1879048192 & i5), 0);
                    if (z2) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    Orientation orientation3 = orientation;
                    composer2 = composerStartRestartGroup;
                    LazyLayoutKt.LazyLayout(function0RememberLazyListItemProviderLambda2, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier.then(lazyListState.getRemeasurementModifier()).then(lazyListState.getAwaitLayoutModifier()), function0RememberLazyListItemProviderLambda2, lazyLayoutSemanticStateRememberLazyListSemanticState2, orientation3, z3, z, composerStartRestartGroup, (i212 & 57344) | ((i214 << 6) & 458752)), LazyListBeyondBoundsModifierKt.rememberLazyListBeyondBoundsState(lazyListState, i215, composer2, i210 | ((i214 >> 18) & 112)), lazyListState.getBeyondBoundsInfo(), z, (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation3, z3, composer2, (MutableVector.$stable << 6) | (i214 & 7168) | (3670016 & i214)).then(lazyListState.getItemAnimator$foundation_release().getModifier()), lazyListState, orientation3, z3, z, flingBehavior, lazyListState.getInternalInteractionSource(), null, composer2, (i214 & 112) | (i211 & 7168) | (57344 & (i214 << 3)) | (i214 & 458752), 64), lazyListState.getPrefetchState(), function2RememberLazyListMeasurePolicy2, composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i23 = i215;
                    horizontal5 = horizontal3;
                    vertical5 = vertical3;
                    vertical6 = vertical4;
                    horizontal6 = horizontal4;
                } else {
                    if (i10 != 0) {
                        i22 = 0;
                    } else {
                        i22 = i;
                    }
                    if (i12 != 0) {
                        horizontal3 = null;
                    } else {
                        horizontal3 = horizontal;
                    }
                    if (i14 != 0) {
                        vertical3 = null;
                    } else {
                        vertical3 = vertical;
                    }
                    if (i16 != 0) {
                        vertical4 = null;
                    } else {
                        vertical4 = vertical2;
                    }
                    if (i19 != 0) {
                        horizontal4 = null;
                    } else {
                        horizontal4 = horizontal2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(620764179, i5, i21, "androidx.compose.foundation.lazy.LazyList (LazyList.kt:80)");
                    }
                    int i216 = (i5 >> 3) & 14;
                    Function0<LazyListItemProvider> function0RememberLazyListItemProviderLambda3 = LazyListItemProviderKt.rememberLazyListItemProviderLambda(lazyListState, function1, composerStartRestartGroup, i216 | ((i21 >> 3) & 112));
                    int i217 = i5 >> 9;
                    LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyListSemanticState3 = LazyListSemanticsKt.rememberLazyListSemanticState(lazyListState, z2, composerStartRestartGroup, i216 | (i217 & 112));
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller3 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                        composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller3);
                        objRememberedValue = compositionScopedCoroutineScopeCanceller3;
                    }
                    int i218 = i5 >> 6;
                    int i219 = i21 << 21;
                    int i2110 = i5;
                    int i2111 = i22;
                    Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyListMeasurePolicy3 = rememberLazyListMeasurePolicy(function0RememberLazyListItemProviderLambda3, lazyListState, paddingValues, z, z2, i22, horizontal3, vertical4, horizontal4, vertical3, ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope(), (GraphicsContext) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext()), !((Boolean) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalScrollCaptureInProgress())).booleanValue(), composerStartRestartGroup, (65520 & i5) | (i218 & 458752) | (i218 & 3670016) | (29360128 & i219) | (i219 & 234881024) | (1879048192 & i5), 0);
                    if (z2) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    Orientation orientation4 = orientation;
                    composer2 = composerStartRestartGroup;
                    LazyLayoutKt.LazyLayout(function0RememberLazyListItemProviderLambda3, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier.then(lazyListState.getRemeasurementModifier()).then(lazyListState.getAwaitLayoutModifier()), function0RememberLazyListItemProviderLambda3, lazyLayoutSemanticStateRememberLazyListSemanticState3, orientation4, z3, z, composerStartRestartGroup, (i218 & 57344) | ((i2110 << 6) & 458752)), LazyListBeyondBoundsModifierKt.rememberLazyListBeyondBoundsState(lazyListState, i2111, composer2, i216 | ((i2110 >> 18) & 112)), lazyListState.getBeyondBoundsInfo(), z, (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation4, z3, composer2, (MutableVector.$stable << 6) | (i2110 & 7168) | (3670016 & i2110)).then(lazyListState.getItemAnimator$foundation_release().getModifier()), lazyListState, orientation4, z3, z, flingBehavior, lazyListState.getInternalInteractionSource(), null, composer2, (i2110 & 112) | (i217 & 7168) | (57344 & (i2110 << 3)) | (i2110 & 458752), 64), lazyListState.getPrefetchState(), function2RememberLazyListMeasurePolicy3, composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i23 = i2111;
                    horizontal5 = horizontal3;
                    vertical5 = vertical3;
                    vertical6 = vertical4;
                    horizontal6 = horizontal4;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyListKt.LazyList.1
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

                        public final void invoke(Composer composer3, int i30) {
                            LazyListKt.LazyList(modifier, lazyListState, paddingValues, z, z2, flingBehavior, z3, i23, horizontal5, vertical5, vertical6, horizontal6, function1, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
                        }
                    });
                }
            }
            i5 |= 3072;
            if ((i4 & 16) != 0) {
                i5 |= 24576;
            } else if ((i2 & 24576) == 0) {
                if (composerStartRestartGroup.changed(z2)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i5 |= i7;
            }
            if ((i4 & 32) != 0) {
                if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    if (composerStartRestartGroup.changed(flingBehavior)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i5 |= i8;
                }
                if ((i4 & 64) != 0) {
                    i5 |= 1572864;
                } else if ((i2 & 1572864) == 0) {
                    if (composerStartRestartGroup.changed(z3)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i5 |= i9;
                }
                i10 = i4 & 128;
                if (i10 != 0) {
                    i5 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    if (composerStartRestartGroup.changed(i)) {
                        i11 = 8388608;
                    } else {
                        i11 = 4194304;
                    }
                    i5 |= i11;
                }
                i12 = i4 & 256;
                if (i12 != 0) {
                    i5 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    if (composerStartRestartGroup.changed(horizontal)) {
                        i13 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i13 = 33554432;
                    }
                    i5 |= i13;
                }
                i14 = i4 & 512;
                if (i14 != 0) {
                    i5 |= 805306368;
                } else if ((i2 & 805306368) == 0) {
                    if (composerStartRestartGroup.changed(vertical)) {
                        i15 = 536870912;
                    } else {
                        i15 = 268435456;
                    }
                    i5 |= i15;
                }
                i16 = i4 & 1024;
                if (i16 != 0) {
                    i17 = i3 | 6;
                } else if ((i3 & 6) == 0) {
                    if (composerStartRestartGroup.changed(vertical2)) {
                        i18 = 4;
                    } else {
                        i18 = 2;
                    }
                    i17 = i3 | i18;
                } else {
                    i17 = i3;
                }
                i19 = i4 & 2048;
                if (i19 != 0) {
                    i17 |= 48;
                } else if ((i3 & 48) == 0) {
                    if (composerStartRestartGroup.changed(horizontal2)) {
                        i20 = 32;
                    } else {
                        i20 = 16;
                    }
                    i17 |= i20;
                }
                i21 = i17;
                if ((i4 & 4096) != 0) {
                    i21 |= 384;
                } else if ((i3 & 384) == 0) {
                    i21 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
                }
                if ((306783379 & i5) == 306783378) {
                    if (i10 != 0) {
                        i22 = 0;
                    } else {
                        i22 = i;
                    }
                    if (i12 != 0) {
                        horizontal3 = null;
                    } else {
                        horizontal3 = horizontal;
                    }
                    if (i14 != 0) {
                        vertical3 = null;
                    } else {
                        vertical3 = vertical;
                    }
                    if (i16 != 0) {
                        vertical4 = null;
                    } else {
                        vertical4 = vertical2;
                    }
                    if (i19 != 0) {
                        horizontal4 = null;
                    } else {
                        horizontal4 = horizontal2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(620764179, i5, i21, "androidx.compose.foundation.lazy.LazyList (LazyList.kt:80)");
                    }
                    int i2112 = (i5 >> 3) & 14;
                    Function0<LazyListItemProvider> function0RememberLazyListItemProviderLambda4 = LazyListItemProviderKt.rememberLazyListItemProviderLambda(lazyListState, function1, composerStartRestartGroup, i2112 | ((i21 >> 3) & 112));
                    int i2113 = i5 >> 9;
                    LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyListSemanticState4 = LazyListSemanticsKt.rememberLazyListSemanticState(lazyListState, z2, composerStartRestartGroup, i2112 | (i2113 & 112));
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller4 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                        composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller4);
                        objRememberedValue = compositionScopedCoroutineScopeCanceller4;
                    }
                    int i2114 = i5 >> 6;
                    int i2115 = i21 << 21;
                    int i2116 = i5;
                    int i2117 = i22;
                    Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyListMeasurePolicy4 = rememberLazyListMeasurePolicy(function0RememberLazyListItemProviderLambda4, lazyListState, paddingValues, z, z2, i22, horizontal3, vertical4, horizontal4, vertical3, ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope(), (GraphicsContext) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext()), !((Boolean) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalScrollCaptureInProgress())).booleanValue(), composerStartRestartGroup, (65520 & i5) | (i2114 & 458752) | (i2114 & 3670016) | (29360128 & i2115) | (i2115 & 234881024) | (1879048192 & i5), 0);
                    if (z2) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    Orientation orientation5 = orientation;
                    composer2 = composerStartRestartGroup;
                    LazyLayoutKt.LazyLayout(function0RememberLazyListItemProviderLambda4, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier.then(lazyListState.getRemeasurementModifier()).then(lazyListState.getAwaitLayoutModifier()), function0RememberLazyListItemProviderLambda4, lazyLayoutSemanticStateRememberLazyListSemanticState4, orientation5, z3, z, composerStartRestartGroup, (i2114 & 57344) | ((i2116 << 6) & 458752)), LazyListBeyondBoundsModifierKt.rememberLazyListBeyondBoundsState(lazyListState, i2117, composer2, i2112 | ((i2116 >> 18) & 112)), lazyListState.getBeyondBoundsInfo(), z, (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation5, z3, composer2, (MutableVector.$stable << 6) | (i2116 & 7168) | (3670016 & i2116)).then(lazyListState.getItemAnimator$foundation_release().getModifier()), lazyListState, orientation5, z3, z, flingBehavior, lazyListState.getInternalInteractionSource(), null, composer2, (i2116 & 112) | (i2113 & 7168) | (57344 & (i2116 << 3)) | (i2116 & 458752), 64), lazyListState.getPrefetchState(), function2RememberLazyListMeasurePolicy4, composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i23 = i2117;
                    horizontal5 = horizontal3;
                    vertical5 = vertical3;
                    vertical6 = vertical4;
                    horizontal6 = horizontal4;
                } else {
                    if (i10 != 0) {
                        i22 = 0;
                    } else {
                        i22 = i;
                    }
                    if (i12 != 0) {
                        horizontal3 = null;
                    } else {
                        horizontal3 = horizontal;
                    }
                    if (i14 != 0) {
                        vertical3 = null;
                    } else {
                        vertical3 = vertical;
                    }
                    if (i16 != 0) {
                        vertical4 = null;
                    } else {
                        vertical4 = vertical2;
                    }
                    if (i19 != 0) {
                        horizontal4 = null;
                    } else {
                        horizontal4 = horizontal2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(620764179, i5, i21, "androidx.compose.foundation.lazy.LazyList (LazyList.kt:80)");
                    }
                    int i2118 = (i5 >> 3) & 14;
                    Function0<LazyListItemProvider> function0RememberLazyListItemProviderLambda5 = LazyListItemProviderKt.rememberLazyListItemProviderLambda(lazyListState, function1, composerStartRestartGroup, i2118 | ((i21 >> 3) & 112));
                    int i2119 = i5 >> 9;
                    LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyListSemanticState5 = LazyListSemanticsKt.rememberLazyListSemanticState(lazyListState, z2, composerStartRestartGroup, i2118 | (i2119 & 112));
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller5 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                        composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller5);
                        objRememberedValue = compositionScopedCoroutineScopeCanceller5;
                    }
                    int i21110 = i5 >> 6;
                    int i21111 = i21 << 21;
                    int i21112 = i5;
                    int i21113 = i22;
                    Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyListMeasurePolicy5 = rememberLazyListMeasurePolicy(function0RememberLazyListItemProviderLambda5, lazyListState, paddingValues, z, z2, i22, horizontal3, vertical4, horizontal4, vertical3, ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope(), (GraphicsContext) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext()), !((Boolean) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalScrollCaptureInProgress())).booleanValue(), composerStartRestartGroup, (65520 & i5) | (i21110 & 458752) | (i21110 & 3670016) | (29360128 & i21111) | (i21111 & 234881024) | (1879048192 & i5), 0);
                    if (z2) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    Orientation orientation6 = orientation;
                    composer2 = composerStartRestartGroup;
                    LazyLayoutKt.LazyLayout(function0RememberLazyListItemProviderLambda5, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier.then(lazyListState.getRemeasurementModifier()).then(lazyListState.getAwaitLayoutModifier()), function0RememberLazyListItemProviderLambda5, lazyLayoutSemanticStateRememberLazyListSemanticState5, orientation6, z3, z, composerStartRestartGroup, (i21110 & 57344) | ((i21112 << 6) & 458752)), LazyListBeyondBoundsModifierKt.rememberLazyListBeyondBoundsState(lazyListState, i21113, composer2, i2118 | ((i21112 >> 18) & 112)), lazyListState.getBeyondBoundsInfo(), z, (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation6, z3, composer2, (MutableVector.$stable << 6) | (i21112 & 7168) | (3670016 & i21112)).then(lazyListState.getItemAnimator$foundation_release().getModifier()), lazyListState, orientation6, z3, z, flingBehavior, lazyListState.getInternalInteractionSource(), null, composer2, (i21112 & 112) | (i2119 & 7168) | (57344 & (i21112 << 3)) | (i21112 & 458752), 64), lazyListState.getPrefetchState(), function2RememberLazyListMeasurePolicy5, composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i23 = i21113;
                    horizontal5 = horizontal3;
                    vertical5 = vertical3;
                    vertical6 = vertical4;
                    horizontal6 = horizontal4;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyListKt.LazyList.1
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

                        public final void invoke(Composer composer3, int i30) {
                            LazyListKt.LazyList(modifier, lazyListState, paddingValues, z, z2, flingBehavior, z3, i23, horizontal5, vertical5, vertical6, horizontal6, function1, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
                        }
                    });
                }
            }
            i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            if ((i4 & 64) != 0) {
                i5 |= 1572864;
            } else if ((i2 & 1572864) == 0) {
                if (composerStartRestartGroup.changed(z3)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i5 |= i9;
            }
            i10 = i4 & 128;
            if (i10 != 0) {
                i5 |= 12582912;
            } else if ((i2 & 12582912) == 0) {
                if (composerStartRestartGroup.changed(i)) {
                    i11 = 8388608;
                } else {
                    i11 = 4194304;
                }
                i5 |= i11;
            }
            i12 = i4 & 256;
            if (i12 != 0) {
                i5 |= 100663296;
            } else if ((i2 & 100663296) == 0) {
                if (composerStartRestartGroup.changed(horizontal)) {
                    i13 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i13 = 33554432;
                }
                i5 |= i13;
            }
            i14 = i4 & 512;
            if (i14 != 0) {
                i5 |= 805306368;
            } else if ((i2 & 805306368) == 0) {
                if (composerStartRestartGroup.changed(vertical)) {
                    i15 = 536870912;
                } else {
                    i15 = 268435456;
                }
                i5 |= i15;
            }
            i16 = i4 & 1024;
            if (i16 != 0) {
                i17 = i3 | 6;
            } else if ((i3 & 6) == 0) {
                if (composerStartRestartGroup.changed(vertical2)) {
                    i18 = 4;
                } else {
                    i18 = 2;
                }
                i17 = i3 | i18;
            } else {
                i17 = i3;
            }
            i19 = i4 & 2048;
            if (i19 != 0) {
                i17 |= 48;
            } else if ((i3 & 48) == 0) {
                if (composerStartRestartGroup.changed(horizontal2)) {
                    i20 = 32;
                } else {
                    i20 = 16;
                }
                i17 |= i20;
            }
            i21 = i17;
            if ((i4 & 4096) != 0) {
                i21 |= 384;
            } else if ((i3 & 384) == 0) {
                i21 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
            }
            if ((306783379 & i5) == 306783378) {
                if (i10 != 0) {
                    i22 = 0;
                } else {
                    i22 = i;
                }
                if (i12 != 0) {
                    horizontal3 = null;
                } else {
                    horizontal3 = horizontal;
                }
                if (i14 != 0) {
                    vertical3 = null;
                } else {
                    vertical3 = vertical;
                }
                if (i16 != 0) {
                    vertical4 = null;
                } else {
                    vertical4 = vertical2;
                }
                if (i19 != 0) {
                    horizontal4 = null;
                } else {
                    horizontal4 = horizontal2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(620764179, i5, i21, "androidx.compose.foundation.lazy.LazyList (LazyList.kt:80)");
                }
                int i21114 = (i5 >> 3) & 14;
                Function0<LazyListItemProvider> function0RememberLazyListItemProviderLambda6 = LazyListItemProviderKt.rememberLazyListItemProviderLambda(lazyListState, function1, composerStartRestartGroup, i21114 | ((i21 >> 3) & 112));
                int i21115 = i5 >> 9;
                LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyListSemanticState6 = LazyListSemanticsKt.rememberLazyListSemanticState(lazyListState, z2, composerStartRestartGroup, i21114 | (i21115 & 112));
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller6 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                    composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller6);
                    objRememberedValue = compositionScopedCoroutineScopeCanceller6;
                }
                int i21116 = i5 >> 6;
                int i21117 = i21 << 21;
                int i21118 = i5;
                int i21119 = i22;
                Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyListMeasurePolicy6 = rememberLazyListMeasurePolicy(function0RememberLazyListItemProviderLambda6, lazyListState, paddingValues, z, z2, i22, horizontal3, vertical4, horizontal4, vertical3, ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope(), (GraphicsContext) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext()), !((Boolean) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalScrollCaptureInProgress())).booleanValue(), composerStartRestartGroup, (65520 & i5) | (i21116 & 458752) | (i21116 & 3670016) | (29360128 & i21117) | (i21117 & 234881024) | (1879048192 & i5), 0);
                if (z2) {
                    orientation = Orientation.Vertical;
                } else {
                    orientation = Orientation.Horizontal;
                }
                Orientation orientation7 = orientation;
                composer2 = composerStartRestartGroup;
                LazyLayoutKt.LazyLayout(function0RememberLazyListItemProviderLambda6, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier.then(lazyListState.getRemeasurementModifier()).then(lazyListState.getAwaitLayoutModifier()), function0RememberLazyListItemProviderLambda6, lazyLayoutSemanticStateRememberLazyListSemanticState6, orientation7, z3, z, composerStartRestartGroup, (i21116 & 57344) | ((i21118 << 6) & 458752)), LazyListBeyondBoundsModifierKt.rememberLazyListBeyondBoundsState(lazyListState, i21119, composer2, i21114 | ((i21118 >> 18) & 112)), lazyListState.getBeyondBoundsInfo(), z, (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation7, z3, composer2, (MutableVector.$stable << 6) | (i21118 & 7168) | (3670016 & i21118)).then(lazyListState.getItemAnimator$foundation_release().getModifier()), lazyListState, orientation7, z3, z, flingBehavior, lazyListState.getInternalInteractionSource(), null, composer2, (i21118 & 112) | (i21115 & 7168) | (57344 & (i21118 << 3)) | (i21118 & 458752), 64), lazyListState.getPrefetchState(), function2RememberLazyListMeasurePolicy6, composer2, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i23 = i21119;
                horizontal5 = horizontal3;
                vertical5 = vertical3;
                vertical6 = vertical4;
                horizontal6 = horizontal4;
            } else {
                if (i10 != 0) {
                    i22 = 0;
                } else {
                    i22 = i;
                }
                if (i12 != 0) {
                    horizontal3 = null;
                } else {
                    horizontal3 = horizontal;
                }
                if (i14 != 0) {
                    vertical3 = null;
                } else {
                    vertical3 = vertical;
                }
                if (i16 != 0) {
                    vertical4 = null;
                } else {
                    vertical4 = vertical2;
                }
                if (i19 != 0) {
                    horizontal4 = null;
                } else {
                    horizontal4 = horizontal2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(620764179, i5, i21, "androidx.compose.foundation.lazy.LazyList (LazyList.kt:80)");
                }
                int i211110 = (i5 >> 3) & 14;
                Function0<LazyListItemProvider> function0RememberLazyListItemProviderLambda7 = LazyListItemProviderKt.rememberLazyListItemProviderLambda(lazyListState, function1, composerStartRestartGroup, i211110 | ((i21 >> 3) & 112));
                int i211111 = i5 >> 9;
                LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyListSemanticState7 = LazyListSemanticsKt.rememberLazyListSemanticState(lazyListState, z2, composerStartRestartGroup, i211110 | (i211111 & 112));
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller7 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                    composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller7);
                    objRememberedValue = compositionScopedCoroutineScopeCanceller7;
                }
                int i211112 = i5 >> 6;
                int i211113 = i21 << 21;
                int i211114 = i5;
                int i211115 = i22;
                Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyListMeasurePolicy7 = rememberLazyListMeasurePolicy(function0RememberLazyListItemProviderLambda7, lazyListState, paddingValues, z, z2, i22, horizontal3, vertical4, horizontal4, vertical3, ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope(), (GraphicsContext) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext()), !((Boolean) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalScrollCaptureInProgress())).booleanValue(), composerStartRestartGroup, (65520 & i5) | (i211112 & 458752) | (i211112 & 3670016) | (29360128 & i211113) | (i211113 & 234881024) | (1879048192 & i5), 0);
                if (z2) {
                    orientation = Orientation.Vertical;
                } else {
                    orientation = Orientation.Horizontal;
                }
                Orientation orientation8 = orientation;
                composer2 = composerStartRestartGroup;
                LazyLayoutKt.LazyLayout(function0RememberLazyListItemProviderLambda7, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier.then(lazyListState.getRemeasurementModifier()).then(lazyListState.getAwaitLayoutModifier()), function0RememberLazyListItemProviderLambda7, lazyLayoutSemanticStateRememberLazyListSemanticState7, orientation8, z3, z, composerStartRestartGroup, (i211112 & 57344) | ((i211114 << 6) & 458752)), LazyListBeyondBoundsModifierKt.rememberLazyListBeyondBoundsState(lazyListState, i211115, composer2, i211110 | ((i211114 >> 18) & 112)), lazyListState.getBeyondBoundsInfo(), z, (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation8, z3, composer2, (MutableVector.$stable << 6) | (i211114 & 7168) | (3670016 & i211114)).then(lazyListState.getItemAnimator$foundation_release().getModifier()), lazyListState, orientation8, z3, z, flingBehavior, lazyListState.getInternalInteractionSource(), null, composer2, (i211114 & 112) | (i211111 & 7168) | (57344 & (i211114 << 3)) | (i211114 & 458752), 64), lazyListState.getPrefetchState(), function2RememberLazyListMeasurePolicy7, composer2, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i23 = i211115;
                horizontal5 = horizontal3;
                vertical5 = vertical3;
                vertical6 = vertical4;
                horizontal6 = horizontal4;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyListKt.LazyList.1
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

                    public final void invoke(Composer composer3, int i30) {
                        LazyListKt.LazyList(modifier, lazyListState, paddingValues, z, z2, flingBehavior, z3, i23, horizontal5, vertical5, vertical6, horizontal6, function1, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
                    }
                });
            }
        }
        i5 |= 384;
        if ((i4 & 8) != 0) {
            if ((i2 & 3072) == 0) {
                if (composerStartRestartGroup.changed(z)) {
                    i6 = 2048;
                } else {
                    i6 = 1024;
                }
                i5 |= i6;
            }
            if ((i4 & 16) != 0) {
                i5 |= 24576;
            } else if ((i2 & 24576) == 0) {
                if (composerStartRestartGroup.changed(z2)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i5 |= i7;
            }
            if ((i4 & 32) != 0) {
                if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    if (composerStartRestartGroup.changed(flingBehavior)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i5 |= i8;
                }
                if ((i4 & 64) != 0) {
                    i5 |= 1572864;
                } else if ((i2 & 1572864) == 0) {
                    if (composerStartRestartGroup.changed(z3)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i5 |= i9;
                }
                i10 = i4 & 128;
                if (i10 != 0) {
                    i5 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    if (composerStartRestartGroup.changed(i)) {
                        i11 = 8388608;
                    } else {
                        i11 = 4194304;
                    }
                    i5 |= i11;
                }
                i12 = i4 & 256;
                if (i12 != 0) {
                    i5 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    if (composerStartRestartGroup.changed(horizontal)) {
                        i13 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i13 = 33554432;
                    }
                    i5 |= i13;
                }
                i14 = i4 & 512;
                if (i14 != 0) {
                    i5 |= 805306368;
                } else if ((i2 & 805306368) == 0) {
                    if (composerStartRestartGroup.changed(vertical)) {
                        i15 = 536870912;
                    } else {
                        i15 = 268435456;
                    }
                    i5 |= i15;
                }
                i16 = i4 & 1024;
                if (i16 != 0) {
                    i17 = i3 | 6;
                } else if ((i3 & 6) == 0) {
                    if (composerStartRestartGroup.changed(vertical2)) {
                        i18 = 4;
                    } else {
                        i18 = 2;
                    }
                    i17 = i3 | i18;
                } else {
                    i17 = i3;
                }
                i19 = i4 & 2048;
                if (i19 != 0) {
                    i17 |= 48;
                } else if ((i3 & 48) == 0) {
                    if (composerStartRestartGroup.changed(horizontal2)) {
                        i20 = 32;
                    } else {
                        i20 = 16;
                    }
                    i17 |= i20;
                }
                i21 = i17;
                if ((i4 & 4096) != 0) {
                    i21 |= 384;
                } else if ((i3 & 384) == 0) {
                    i21 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
                }
                if ((306783379 & i5) == 306783378) {
                    if (i10 != 0) {
                        i22 = 0;
                    } else {
                        i22 = i;
                    }
                    if (i12 != 0) {
                        horizontal3 = null;
                    } else {
                        horizontal3 = horizontal;
                    }
                    if (i14 != 0) {
                        vertical3 = null;
                    } else {
                        vertical3 = vertical;
                    }
                    if (i16 != 0) {
                        vertical4 = null;
                    } else {
                        vertical4 = vertical2;
                    }
                    if (i19 != 0) {
                        horizontal4 = null;
                    } else {
                        horizontal4 = horizontal2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(620764179, i5, i21, "androidx.compose.foundation.lazy.LazyList (LazyList.kt:80)");
                    }
                    int i211116 = (i5 >> 3) & 14;
                    Function0<LazyListItemProvider> function0RememberLazyListItemProviderLambda8 = LazyListItemProviderKt.rememberLazyListItemProviderLambda(lazyListState, function1, composerStartRestartGroup, i211116 | ((i21 >> 3) & 112));
                    int i211117 = i5 >> 9;
                    LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyListSemanticState8 = LazyListSemanticsKt.rememberLazyListSemanticState(lazyListState, z2, composerStartRestartGroup, i211116 | (i211117 & 112));
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller8 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                        composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller8);
                        objRememberedValue = compositionScopedCoroutineScopeCanceller8;
                    }
                    int i211118 = i5 >> 6;
                    int i211119 = i21 << 21;
                    int i2111110 = i5;
                    int i2111111 = i22;
                    Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyListMeasurePolicy8 = rememberLazyListMeasurePolicy(function0RememberLazyListItemProviderLambda8, lazyListState, paddingValues, z, z2, i22, horizontal3, vertical4, horizontal4, vertical3, ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope(), (GraphicsContext) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext()), !((Boolean) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalScrollCaptureInProgress())).booleanValue(), composerStartRestartGroup, (65520 & i5) | (i211118 & 458752) | (i211118 & 3670016) | (29360128 & i211119) | (i211119 & 234881024) | (1879048192 & i5), 0);
                    if (z2) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    Orientation orientation9 = orientation;
                    composer2 = composerStartRestartGroup;
                    LazyLayoutKt.LazyLayout(function0RememberLazyListItemProviderLambda8, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier.then(lazyListState.getRemeasurementModifier()).then(lazyListState.getAwaitLayoutModifier()), function0RememberLazyListItemProviderLambda8, lazyLayoutSemanticStateRememberLazyListSemanticState8, orientation9, z3, z, composerStartRestartGroup, (i211118 & 57344) | ((i2111110 << 6) & 458752)), LazyListBeyondBoundsModifierKt.rememberLazyListBeyondBoundsState(lazyListState, i2111111, composer2, i211116 | ((i2111110 >> 18) & 112)), lazyListState.getBeyondBoundsInfo(), z, (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation9, z3, composer2, (MutableVector.$stable << 6) | (i2111110 & 7168) | (3670016 & i2111110)).then(lazyListState.getItemAnimator$foundation_release().getModifier()), lazyListState, orientation9, z3, z, flingBehavior, lazyListState.getInternalInteractionSource(), null, composer2, (i2111110 & 112) | (i211117 & 7168) | (57344 & (i2111110 << 3)) | (i2111110 & 458752), 64), lazyListState.getPrefetchState(), function2RememberLazyListMeasurePolicy8, composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i23 = i2111111;
                    horizontal5 = horizontal3;
                    vertical5 = vertical3;
                    vertical6 = vertical4;
                    horizontal6 = horizontal4;
                } else {
                    if (i10 != 0) {
                        i22 = 0;
                    } else {
                        i22 = i;
                    }
                    if (i12 != 0) {
                        horizontal3 = null;
                    } else {
                        horizontal3 = horizontal;
                    }
                    if (i14 != 0) {
                        vertical3 = null;
                    } else {
                        vertical3 = vertical;
                    }
                    if (i16 != 0) {
                        vertical4 = null;
                    } else {
                        vertical4 = vertical2;
                    }
                    if (i19 != 0) {
                        horizontal4 = null;
                    } else {
                        horizontal4 = horizontal2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(620764179, i5, i21, "androidx.compose.foundation.lazy.LazyList (LazyList.kt:80)");
                    }
                    int i2111112 = (i5 >> 3) & 14;
                    Function0<LazyListItemProvider> function0RememberLazyListItemProviderLambda9 = LazyListItemProviderKt.rememberLazyListItemProviderLambda(lazyListState, function1, composerStartRestartGroup, i2111112 | ((i21 >> 3) & 112));
                    int i2111113 = i5 >> 9;
                    LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyListSemanticState9 = LazyListSemanticsKt.rememberLazyListSemanticState(lazyListState, z2, composerStartRestartGroup, i2111112 | (i2111113 & 112));
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller9 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                        composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller9);
                        objRememberedValue = compositionScopedCoroutineScopeCanceller9;
                    }
                    int i2111114 = i5 >> 6;
                    int i2111115 = i21 << 21;
                    int i2111116 = i5;
                    int i2111117 = i22;
                    Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyListMeasurePolicy9 = rememberLazyListMeasurePolicy(function0RememberLazyListItemProviderLambda9, lazyListState, paddingValues, z, z2, i22, horizontal3, vertical4, horizontal4, vertical3, ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope(), (GraphicsContext) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext()), !((Boolean) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalScrollCaptureInProgress())).booleanValue(), composerStartRestartGroup, (65520 & i5) | (i2111114 & 458752) | (i2111114 & 3670016) | (29360128 & i2111115) | (i2111115 & 234881024) | (1879048192 & i5), 0);
                    if (z2) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    Orientation orientation10 = orientation;
                    composer2 = composerStartRestartGroup;
                    LazyLayoutKt.LazyLayout(function0RememberLazyListItemProviderLambda9, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier.then(lazyListState.getRemeasurementModifier()).then(lazyListState.getAwaitLayoutModifier()), function0RememberLazyListItemProviderLambda9, lazyLayoutSemanticStateRememberLazyListSemanticState9, orientation10, z3, z, composerStartRestartGroup, (i2111114 & 57344) | ((i2111116 << 6) & 458752)), LazyListBeyondBoundsModifierKt.rememberLazyListBeyondBoundsState(lazyListState, i2111117, composer2, i2111112 | ((i2111116 >> 18) & 112)), lazyListState.getBeyondBoundsInfo(), z, (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation10, z3, composer2, (MutableVector.$stable << 6) | (i2111116 & 7168) | (3670016 & i2111116)).then(lazyListState.getItemAnimator$foundation_release().getModifier()), lazyListState, orientation10, z3, z, flingBehavior, lazyListState.getInternalInteractionSource(), null, composer2, (i2111116 & 112) | (i2111113 & 7168) | (57344 & (i2111116 << 3)) | (i2111116 & 458752), 64), lazyListState.getPrefetchState(), function2RememberLazyListMeasurePolicy9, composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i23 = i2111117;
                    horizontal5 = horizontal3;
                    vertical5 = vertical3;
                    vertical6 = vertical4;
                    horizontal6 = horizontal4;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyListKt.LazyList.1
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

                        public final void invoke(Composer composer3, int i30) {
                            LazyListKt.LazyList(modifier, lazyListState, paddingValues, z, z2, flingBehavior, z3, i23, horizontal5, vertical5, vertical6, horizontal6, function1, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
                        }
                    });
                }
            }
            i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            if ((i4 & 64) != 0) {
                i5 |= 1572864;
            } else if ((i2 & 1572864) == 0) {
                if (composerStartRestartGroup.changed(z3)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i5 |= i9;
            }
            i10 = i4 & 128;
            if (i10 != 0) {
                i5 |= 12582912;
            } else if ((i2 & 12582912) == 0) {
                if (composerStartRestartGroup.changed(i)) {
                    i11 = 8388608;
                } else {
                    i11 = 4194304;
                }
                i5 |= i11;
            }
            i12 = i4 & 256;
            if (i12 != 0) {
                i5 |= 100663296;
            } else if ((i2 & 100663296) == 0) {
                if (composerStartRestartGroup.changed(horizontal)) {
                    i13 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i13 = 33554432;
                }
                i5 |= i13;
            }
            i14 = i4 & 512;
            if (i14 != 0) {
                i5 |= 805306368;
            } else if ((i2 & 805306368) == 0) {
                if (composerStartRestartGroup.changed(vertical)) {
                    i15 = 536870912;
                } else {
                    i15 = 268435456;
                }
                i5 |= i15;
            }
            i16 = i4 & 1024;
            if (i16 != 0) {
                i17 = i3 | 6;
            } else if ((i3 & 6) == 0) {
                if (composerStartRestartGroup.changed(vertical2)) {
                    i18 = 4;
                } else {
                    i18 = 2;
                }
                i17 = i3 | i18;
            } else {
                i17 = i3;
            }
            i19 = i4 & 2048;
            if (i19 != 0) {
                i17 |= 48;
            } else if ((i3 & 48) == 0) {
                if (composerStartRestartGroup.changed(horizontal2)) {
                    i20 = 32;
                } else {
                    i20 = 16;
                }
                i17 |= i20;
            }
            i21 = i17;
            if ((i4 & 4096) != 0) {
                i21 |= 384;
            } else if ((i3 & 384) == 0) {
                i21 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
            }
            if ((306783379 & i5) == 306783378) {
                if (i10 != 0) {
                    i22 = 0;
                } else {
                    i22 = i;
                }
                if (i12 != 0) {
                    horizontal3 = null;
                } else {
                    horizontal3 = horizontal;
                }
                if (i14 != 0) {
                    vertical3 = null;
                } else {
                    vertical3 = vertical;
                }
                if (i16 != 0) {
                    vertical4 = null;
                } else {
                    vertical4 = vertical2;
                }
                if (i19 != 0) {
                    horizontal4 = null;
                } else {
                    horizontal4 = horizontal2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(620764179, i5, i21, "androidx.compose.foundation.lazy.LazyList (LazyList.kt:80)");
                }
                int i2111118 = (i5 >> 3) & 14;
                Function0<LazyListItemProvider> function0RememberLazyListItemProviderLambda10 = LazyListItemProviderKt.rememberLazyListItemProviderLambda(lazyListState, function1, composerStartRestartGroup, i2111118 | ((i21 >> 3) & 112));
                int i2111119 = i5 >> 9;
                LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyListSemanticState10 = LazyListSemanticsKt.rememberLazyListSemanticState(lazyListState, z2, composerStartRestartGroup, i2111118 | (i2111119 & 112));
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller10 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                    composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller10);
                    objRememberedValue = compositionScopedCoroutineScopeCanceller10;
                }
                int i21111110 = i5 >> 6;
                int i21111111 = i21 << 21;
                int i21111112 = i5;
                int i21111113 = i22;
                Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyListMeasurePolicy10 = rememberLazyListMeasurePolicy(function0RememberLazyListItemProviderLambda10, lazyListState, paddingValues, z, z2, i22, horizontal3, vertical4, horizontal4, vertical3, ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope(), (GraphicsContext) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext()), !((Boolean) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalScrollCaptureInProgress())).booleanValue(), composerStartRestartGroup, (65520 & i5) | (i21111110 & 458752) | (i21111110 & 3670016) | (29360128 & i21111111) | (i21111111 & 234881024) | (1879048192 & i5), 0);
                if (z2) {
                    orientation = Orientation.Vertical;
                } else {
                    orientation = Orientation.Horizontal;
                }
                Orientation orientation11 = orientation;
                composer2 = composerStartRestartGroup;
                LazyLayoutKt.LazyLayout(function0RememberLazyListItemProviderLambda10, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier.then(lazyListState.getRemeasurementModifier()).then(lazyListState.getAwaitLayoutModifier()), function0RememberLazyListItemProviderLambda10, lazyLayoutSemanticStateRememberLazyListSemanticState10, orientation11, z3, z, composerStartRestartGroup, (i21111110 & 57344) | ((i21111112 << 6) & 458752)), LazyListBeyondBoundsModifierKt.rememberLazyListBeyondBoundsState(lazyListState, i21111113, composer2, i2111118 | ((i21111112 >> 18) & 112)), lazyListState.getBeyondBoundsInfo(), z, (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation11, z3, composer2, (MutableVector.$stable << 6) | (i21111112 & 7168) | (3670016 & i21111112)).then(lazyListState.getItemAnimator$foundation_release().getModifier()), lazyListState, orientation11, z3, z, flingBehavior, lazyListState.getInternalInteractionSource(), null, composer2, (i21111112 & 112) | (i2111119 & 7168) | (57344 & (i21111112 << 3)) | (i21111112 & 458752), 64), lazyListState.getPrefetchState(), function2RememberLazyListMeasurePolicy10, composer2, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i23 = i21111113;
                horizontal5 = horizontal3;
                vertical5 = vertical3;
                vertical6 = vertical4;
                horizontal6 = horizontal4;
            } else {
                if (i10 != 0) {
                    i22 = 0;
                } else {
                    i22 = i;
                }
                if (i12 != 0) {
                    horizontal3 = null;
                } else {
                    horizontal3 = horizontal;
                }
                if (i14 != 0) {
                    vertical3 = null;
                } else {
                    vertical3 = vertical;
                }
                if (i16 != 0) {
                    vertical4 = null;
                } else {
                    vertical4 = vertical2;
                }
                if (i19 != 0) {
                    horizontal4 = null;
                } else {
                    horizontal4 = horizontal2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(620764179, i5, i21, "androidx.compose.foundation.lazy.LazyList (LazyList.kt:80)");
                }
                int i21111114 = (i5 >> 3) & 14;
                Function0<LazyListItemProvider> function0RememberLazyListItemProviderLambda11 = LazyListItemProviderKt.rememberLazyListItemProviderLambda(lazyListState, function1, composerStartRestartGroup, i21111114 | ((i21 >> 3) & 112));
                int i21111115 = i5 >> 9;
                LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyListSemanticState11 = LazyListSemanticsKt.rememberLazyListSemanticState(lazyListState, z2, composerStartRestartGroup, i21111114 | (i21111115 & 112));
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller11 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                    composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller11);
                    objRememberedValue = compositionScopedCoroutineScopeCanceller11;
                }
                int i21111116 = i5 >> 6;
                int i21111117 = i21 << 21;
                int i21111118 = i5;
                int i21111119 = i22;
                Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyListMeasurePolicy11 = rememberLazyListMeasurePolicy(function0RememberLazyListItemProviderLambda11, lazyListState, paddingValues, z, z2, i22, horizontal3, vertical4, horizontal4, vertical3, ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope(), (GraphicsContext) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext()), !((Boolean) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalScrollCaptureInProgress())).booleanValue(), composerStartRestartGroup, (65520 & i5) | (i21111116 & 458752) | (i21111116 & 3670016) | (29360128 & i21111117) | (i21111117 & 234881024) | (1879048192 & i5), 0);
                if (z2) {
                    orientation = Orientation.Vertical;
                } else {
                    orientation = Orientation.Horizontal;
                }
                Orientation orientation12 = orientation;
                composer2 = composerStartRestartGroup;
                LazyLayoutKt.LazyLayout(function0RememberLazyListItemProviderLambda11, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier.then(lazyListState.getRemeasurementModifier()).then(lazyListState.getAwaitLayoutModifier()), function0RememberLazyListItemProviderLambda11, lazyLayoutSemanticStateRememberLazyListSemanticState11, orientation12, z3, z, composerStartRestartGroup, (i21111116 & 57344) | ((i21111118 << 6) & 458752)), LazyListBeyondBoundsModifierKt.rememberLazyListBeyondBoundsState(lazyListState, i21111119, composer2, i21111114 | ((i21111118 >> 18) & 112)), lazyListState.getBeyondBoundsInfo(), z, (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation12, z3, composer2, (MutableVector.$stable << 6) | (i21111118 & 7168) | (3670016 & i21111118)).then(lazyListState.getItemAnimator$foundation_release().getModifier()), lazyListState, orientation12, z3, z, flingBehavior, lazyListState.getInternalInteractionSource(), null, composer2, (i21111118 & 112) | (i21111115 & 7168) | (57344 & (i21111118 << 3)) | (i21111118 & 458752), 64), lazyListState.getPrefetchState(), function2RememberLazyListMeasurePolicy11, composer2, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i23 = i21111119;
                horizontal5 = horizontal3;
                vertical5 = vertical3;
                vertical6 = vertical4;
                horizontal6 = horizontal4;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyListKt.LazyList.1
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

                    public final void invoke(Composer composer3, int i30) {
                        LazyListKt.LazyList(modifier, lazyListState, paddingValues, z, z2, flingBehavior, z3, i23, horizontal5, vertical5, vertical6, horizontal6, function1, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
                    }
                });
            }
        }
        i5 |= 3072;
        if ((i4 & 16) != 0) {
            i5 |= 24576;
        } else if ((i2 & 24576) == 0) {
            if (composerStartRestartGroup.changed(z2)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i5 |= i7;
        }
        if ((i4 & 32) != 0) {
            if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                if (composerStartRestartGroup.changed(flingBehavior)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i5 |= i8;
            }
            if ((i4 & 64) != 0) {
                i5 |= 1572864;
            } else if ((i2 & 1572864) == 0) {
                if (composerStartRestartGroup.changed(z3)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i5 |= i9;
            }
            i10 = i4 & 128;
            if (i10 != 0) {
                i5 |= 12582912;
            } else if ((i2 & 12582912) == 0) {
                if (composerStartRestartGroup.changed(i)) {
                    i11 = 8388608;
                } else {
                    i11 = 4194304;
                }
                i5 |= i11;
            }
            i12 = i4 & 256;
            if (i12 != 0) {
                i5 |= 100663296;
            } else if ((i2 & 100663296) == 0) {
                if (composerStartRestartGroup.changed(horizontal)) {
                    i13 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i13 = 33554432;
                }
                i5 |= i13;
            }
            i14 = i4 & 512;
            if (i14 != 0) {
                i5 |= 805306368;
            } else if ((i2 & 805306368) == 0) {
                if (composerStartRestartGroup.changed(vertical)) {
                    i15 = 536870912;
                } else {
                    i15 = 268435456;
                }
                i5 |= i15;
            }
            i16 = i4 & 1024;
            if (i16 != 0) {
                i17 = i3 | 6;
            } else if ((i3 & 6) == 0) {
                if (composerStartRestartGroup.changed(vertical2)) {
                    i18 = 4;
                } else {
                    i18 = 2;
                }
                i17 = i3 | i18;
            } else {
                i17 = i3;
            }
            i19 = i4 & 2048;
            if (i19 != 0) {
                i17 |= 48;
            } else if ((i3 & 48) == 0) {
                if (composerStartRestartGroup.changed(horizontal2)) {
                    i20 = 32;
                } else {
                    i20 = 16;
                }
                i17 |= i20;
            }
            i21 = i17;
            if ((i4 & 4096) != 0) {
                i21 |= 384;
            } else if ((i3 & 384) == 0) {
                i21 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
            }
            if ((306783379 & i5) == 306783378) {
                if (i10 != 0) {
                    i22 = 0;
                } else {
                    i22 = i;
                }
                if (i12 != 0) {
                    horizontal3 = null;
                } else {
                    horizontal3 = horizontal;
                }
                if (i14 != 0) {
                    vertical3 = null;
                } else {
                    vertical3 = vertical;
                }
                if (i16 != 0) {
                    vertical4 = null;
                } else {
                    vertical4 = vertical2;
                }
                if (i19 != 0) {
                    horizontal4 = null;
                } else {
                    horizontal4 = horizontal2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(620764179, i5, i21, "androidx.compose.foundation.lazy.LazyList (LazyList.kt:80)");
                }
                int i211111110 = (i5 >> 3) & 14;
                Function0<LazyListItemProvider> function0RememberLazyListItemProviderLambda12 = LazyListItemProviderKt.rememberLazyListItemProviderLambda(lazyListState, function1, composerStartRestartGroup, i211111110 | ((i21 >> 3) & 112));
                int i211111111 = i5 >> 9;
                LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyListSemanticState12 = LazyListSemanticsKt.rememberLazyListSemanticState(lazyListState, z2, composerStartRestartGroup, i211111110 | (i211111111 & 112));
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller12 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                    composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller12);
                    objRememberedValue = compositionScopedCoroutineScopeCanceller12;
                }
                int i211111112 = i5 >> 6;
                int i211111113 = i21 << 21;
                int i211111114 = i5;
                int i211111115 = i22;
                Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyListMeasurePolicy12 = rememberLazyListMeasurePolicy(function0RememberLazyListItemProviderLambda12, lazyListState, paddingValues, z, z2, i22, horizontal3, vertical4, horizontal4, vertical3, ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope(), (GraphicsContext) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext()), !((Boolean) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalScrollCaptureInProgress())).booleanValue(), composerStartRestartGroup, (65520 & i5) | (i211111112 & 458752) | (i211111112 & 3670016) | (29360128 & i211111113) | (i211111113 & 234881024) | (1879048192 & i5), 0);
                if (z2) {
                    orientation = Orientation.Vertical;
                } else {
                    orientation = Orientation.Horizontal;
                }
                Orientation orientation13 = orientation;
                composer2 = composerStartRestartGroup;
                LazyLayoutKt.LazyLayout(function0RememberLazyListItemProviderLambda12, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier.then(lazyListState.getRemeasurementModifier()).then(lazyListState.getAwaitLayoutModifier()), function0RememberLazyListItemProviderLambda12, lazyLayoutSemanticStateRememberLazyListSemanticState12, orientation13, z3, z, composerStartRestartGroup, (i211111112 & 57344) | ((i211111114 << 6) & 458752)), LazyListBeyondBoundsModifierKt.rememberLazyListBeyondBoundsState(lazyListState, i211111115, composer2, i211111110 | ((i211111114 >> 18) & 112)), lazyListState.getBeyondBoundsInfo(), z, (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation13, z3, composer2, (MutableVector.$stable << 6) | (i211111114 & 7168) | (3670016 & i211111114)).then(lazyListState.getItemAnimator$foundation_release().getModifier()), lazyListState, orientation13, z3, z, flingBehavior, lazyListState.getInternalInteractionSource(), null, composer2, (i211111114 & 112) | (i211111111 & 7168) | (57344 & (i211111114 << 3)) | (i211111114 & 458752), 64), lazyListState.getPrefetchState(), function2RememberLazyListMeasurePolicy12, composer2, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i23 = i211111115;
                horizontal5 = horizontal3;
                vertical5 = vertical3;
                vertical6 = vertical4;
                horizontal6 = horizontal4;
            } else {
                if (i10 != 0) {
                    i22 = 0;
                } else {
                    i22 = i;
                }
                if (i12 != 0) {
                    horizontal3 = null;
                } else {
                    horizontal3 = horizontal;
                }
                if (i14 != 0) {
                    vertical3 = null;
                } else {
                    vertical3 = vertical;
                }
                if (i16 != 0) {
                    vertical4 = null;
                } else {
                    vertical4 = vertical2;
                }
                if (i19 != 0) {
                    horizontal4 = null;
                } else {
                    horizontal4 = horizontal2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(620764179, i5, i21, "androidx.compose.foundation.lazy.LazyList (LazyList.kt:80)");
                }
                int i211111116 = (i5 >> 3) & 14;
                Function0<LazyListItemProvider> function0RememberLazyListItemProviderLambda13 = LazyListItemProviderKt.rememberLazyListItemProviderLambda(lazyListState, function1, composerStartRestartGroup, i211111116 | ((i21 >> 3) & 112));
                int i211111117 = i5 >> 9;
                LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyListSemanticState13 = LazyListSemanticsKt.rememberLazyListSemanticState(lazyListState, z2, composerStartRestartGroup, i211111116 | (i211111117 & 112));
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller13 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                    composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller13);
                    objRememberedValue = compositionScopedCoroutineScopeCanceller13;
                }
                int i211111118 = i5 >> 6;
                int i211111119 = i21 << 21;
                int i2111111110 = i5;
                int i2111111111 = i22;
                Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyListMeasurePolicy13 = rememberLazyListMeasurePolicy(function0RememberLazyListItemProviderLambda13, lazyListState, paddingValues, z, z2, i22, horizontal3, vertical4, horizontal4, vertical3, ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope(), (GraphicsContext) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext()), !((Boolean) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalScrollCaptureInProgress())).booleanValue(), composerStartRestartGroup, (65520 & i5) | (i211111118 & 458752) | (i211111118 & 3670016) | (29360128 & i211111119) | (i211111119 & 234881024) | (1879048192 & i5), 0);
                if (z2) {
                    orientation = Orientation.Vertical;
                } else {
                    orientation = Orientation.Horizontal;
                }
                Orientation orientation14 = orientation;
                composer2 = composerStartRestartGroup;
                LazyLayoutKt.LazyLayout(function0RememberLazyListItemProviderLambda13, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier.then(lazyListState.getRemeasurementModifier()).then(lazyListState.getAwaitLayoutModifier()), function0RememberLazyListItemProviderLambda13, lazyLayoutSemanticStateRememberLazyListSemanticState13, orientation14, z3, z, composerStartRestartGroup, (i211111118 & 57344) | ((i2111111110 << 6) & 458752)), LazyListBeyondBoundsModifierKt.rememberLazyListBeyondBoundsState(lazyListState, i2111111111, composer2, i211111116 | ((i2111111110 >> 18) & 112)), lazyListState.getBeyondBoundsInfo(), z, (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation14, z3, composer2, (MutableVector.$stable << 6) | (i2111111110 & 7168) | (3670016 & i2111111110)).then(lazyListState.getItemAnimator$foundation_release().getModifier()), lazyListState, orientation14, z3, z, flingBehavior, lazyListState.getInternalInteractionSource(), null, composer2, (i2111111110 & 112) | (i211111117 & 7168) | (57344 & (i2111111110 << 3)) | (i2111111110 & 458752), 64), lazyListState.getPrefetchState(), function2RememberLazyListMeasurePolicy13, composer2, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i23 = i2111111111;
                horizontal5 = horizontal3;
                vertical5 = vertical3;
                vertical6 = vertical4;
                horizontal6 = horizontal4;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyListKt.LazyList.1
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

                    public final void invoke(Composer composer3, int i30) {
                        LazyListKt.LazyList(modifier, lazyListState, paddingValues, z, z2, flingBehavior, z3, i23, horizontal5, vertical5, vertical6, horizontal6, function1, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
                    }
                });
            }
        }
        i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        if ((i4 & 64) != 0) {
            i5 |= 1572864;
        } else if ((i2 & 1572864) == 0) {
            if (composerStartRestartGroup.changed(z3)) {
                i9 = 1048576;
            } else {
                i9 = 524288;
            }
            i5 |= i9;
        }
        i10 = i4 & 128;
        if (i10 != 0) {
            i5 |= 12582912;
        } else if ((i2 & 12582912) == 0) {
            if (composerStartRestartGroup.changed(i)) {
                i11 = 8388608;
            } else {
                i11 = 4194304;
            }
            i5 |= i11;
        }
        i12 = i4 & 256;
        if (i12 != 0) {
            i5 |= 100663296;
        } else if ((i2 & 100663296) == 0) {
            if (composerStartRestartGroup.changed(horizontal)) {
                i13 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
            } else {
                i13 = 33554432;
            }
            i5 |= i13;
        }
        i14 = i4 & 512;
        if (i14 != 0) {
            i5 |= 805306368;
        } else if ((i2 & 805306368) == 0) {
            if (composerStartRestartGroup.changed(vertical)) {
                i15 = 536870912;
            } else {
                i15 = 268435456;
            }
            i5 |= i15;
        }
        i16 = i4 & 1024;
        if (i16 != 0) {
            i17 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            if (composerStartRestartGroup.changed(vertical2)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i17 = i3 | i18;
        } else {
            i17 = i3;
        }
        i19 = i4 & 2048;
        if (i19 != 0) {
            i17 |= 48;
        } else if ((i3 & 48) == 0) {
            if (composerStartRestartGroup.changed(horizontal2)) {
                i20 = 32;
            } else {
                i20 = 16;
            }
            i17 |= i20;
        }
        i21 = i17;
        if ((i4 & 4096) != 0) {
            i21 |= 384;
        } else if ((i3 & 384) == 0) {
            i21 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((306783379 & i5) == 306783378) {
            if (i10 != 0) {
                i22 = 0;
            } else {
                i22 = i;
            }
            if (i12 != 0) {
                horizontal3 = null;
            } else {
                horizontal3 = horizontal;
            }
            if (i14 != 0) {
                vertical3 = null;
            } else {
                vertical3 = vertical;
            }
            if (i16 != 0) {
                vertical4 = null;
            } else {
                vertical4 = vertical2;
            }
            if (i19 != 0) {
                horizontal4 = null;
            } else {
                horizontal4 = horizontal2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(620764179, i5, i21, "androidx.compose.foundation.lazy.LazyList (LazyList.kt:80)");
            }
            int i2111111112 = (i5 >> 3) & 14;
            Function0<LazyListItemProvider> function0RememberLazyListItemProviderLambda14 = LazyListItemProviderKt.rememberLazyListItemProviderLambda(lazyListState, function1, composerStartRestartGroup, i2111111112 | ((i21 >> 3) & 112));
            int i2111111113 = i5 >> 9;
            LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyListSemanticState14 = LazyListSemanticsKt.rememberLazyListSemanticState(lazyListState, z2, composerStartRestartGroup, i2111111112 | (i2111111113 & 112));
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller14 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller14);
                objRememberedValue = compositionScopedCoroutineScopeCanceller14;
            }
            int i2111111114 = i5 >> 6;
            int i2111111115 = i21 << 21;
            int i2111111116 = i5;
            int i2111111117 = i22;
            Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyListMeasurePolicy14 = rememberLazyListMeasurePolicy(function0RememberLazyListItemProviderLambda14, lazyListState, paddingValues, z, z2, i22, horizontal3, vertical4, horizontal4, vertical3, ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope(), (GraphicsContext) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext()), !((Boolean) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalScrollCaptureInProgress())).booleanValue(), composerStartRestartGroup, (65520 & i5) | (i2111111114 & 458752) | (i2111111114 & 3670016) | (29360128 & i2111111115) | (i2111111115 & 234881024) | (1879048192 & i5), 0);
            if (z2) {
                orientation = Orientation.Vertical;
            } else {
                orientation = Orientation.Horizontal;
            }
            Orientation orientation15 = orientation;
            composer2 = composerStartRestartGroup;
            LazyLayoutKt.LazyLayout(function0RememberLazyListItemProviderLambda14, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier.then(lazyListState.getRemeasurementModifier()).then(lazyListState.getAwaitLayoutModifier()), function0RememberLazyListItemProviderLambda14, lazyLayoutSemanticStateRememberLazyListSemanticState14, orientation15, z3, z, composerStartRestartGroup, (i2111111114 & 57344) | ((i2111111116 << 6) & 458752)), LazyListBeyondBoundsModifierKt.rememberLazyListBeyondBoundsState(lazyListState, i2111111117, composer2, i2111111112 | ((i2111111116 >> 18) & 112)), lazyListState.getBeyondBoundsInfo(), z, (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation15, z3, composer2, (MutableVector.$stable << 6) | (i2111111116 & 7168) | (3670016 & i2111111116)).then(lazyListState.getItemAnimator$foundation_release().getModifier()), lazyListState, orientation15, z3, z, flingBehavior, lazyListState.getInternalInteractionSource(), null, composer2, (i2111111116 & 112) | (i2111111113 & 7168) | (57344 & (i2111111116 << 3)) | (i2111111116 & 458752), 64), lazyListState.getPrefetchState(), function2RememberLazyListMeasurePolicy14, composer2, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            i23 = i2111111117;
            horizontal5 = horizontal3;
            vertical5 = vertical3;
            vertical6 = vertical4;
            horizontal6 = horizontal4;
        } else {
            if (i10 != 0) {
                i22 = 0;
            } else {
                i22 = i;
            }
            if (i12 != 0) {
                horizontal3 = null;
            } else {
                horizontal3 = horizontal;
            }
            if (i14 != 0) {
                vertical3 = null;
            } else {
                vertical3 = vertical;
            }
            if (i16 != 0) {
                vertical4 = null;
            } else {
                vertical4 = vertical2;
            }
            if (i19 != 0) {
                horizontal4 = null;
            } else {
                horizontal4 = horizontal2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(620764179, i5, i21, "androidx.compose.foundation.lazy.LazyList (LazyList.kt:80)");
            }
            int i2111111118 = (i5 >> 3) & 14;
            Function0<LazyListItemProvider> function0RememberLazyListItemProviderLambda15 = LazyListItemProviderKt.rememberLazyListItemProviderLambda(lazyListState, function1, composerStartRestartGroup, i2111111118 | ((i21 >> 3) & 112));
            int i2111111119 = i5 >> 9;
            LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyListSemanticState15 = LazyListSemanticsKt.rememberLazyListSemanticState(lazyListState, z2, composerStartRestartGroup, i2111111118 | (i2111111119 & 112));
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller15 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller15);
                objRememberedValue = compositionScopedCoroutineScopeCanceller15;
            }
            int i21111111110 = i5 >> 6;
            int i21111111111 = i21 << 21;
            int i21111111112 = i5;
            int i21111111113 = i22;
            Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyListMeasurePolicy15 = rememberLazyListMeasurePolicy(function0RememberLazyListItemProviderLambda15, lazyListState, paddingValues, z, z2, i22, horizontal3, vertical4, horizontal4, vertical3, ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope(), (GraphicsContext) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalGraphicsContext()), !((Boolean) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalScrollCaptureInProgress())).booleanValue(), composerStartRestartGroup, (65520 & i5) | (i21111111110 & 458752) | (i21111111110 & 3670016) | (29360128 & i21111111111) | (i21111111111 & 234881024) | (1879048192 & i5), 0);
            if (z2) {
                orientation = Orientation.Vertical;
            } else {
                orientation = Orientation.Horizontal;
            }
            Orientation orientation16 = orientation;
            composer2 = composerStartRestartGroup;
            LazyLayoutKt.LazyLayout(function0RememberLazyListItemProviderLambda15, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier.then(lazyListState.getRemeasurementModifier()).then(lazyListState.getAwaitLayoutModifier()), function0RememberLazyListItemProviderLambda15, lazyLayoutSemanticStateRememberLazyListSemanticState15, orientation16, z3, z, composerStartRestartGroup, (i21111111110 & 57344) | ((i21111111112 << 6) & 458752)), LazyListBeyondBoundsModifierKt.rememberLazyListBeyondBoundsState(lazyListState, i21111111113, composer2, i2111111118 | ((i21111111112 >> 18) & 112)), lazyListState.getBeyondBoundsInfo(), z, (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation16, z3, composer2, (MutableVector.$stable << 6) | (i21111111112 & 7168) | (3670016 & i21111111112)).then(lazyListState.getItemAnimator$foundation_release().getModifier()), lazyListState, orientation16, z3, z, flingBehavior, lazyListState.getInternalInteractionSource(), null, composer2, (i21111111112 & 112) | (i2111111119 & 7168) | (57344 & (i21111111112 << 3)) | (i21111111112 & 458752), 64), lazyListState.getPrefetchState(), function2RememberLazyListMeasurePolicy15, composer2, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            i23 = i21111111113;
            horizontal5 = horizontal3;
            vertical5 = vertical3;
            vertical6 = vertical4;
            horizontal6 = horizontal4;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyListKt.LazyList.1
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

                public final void invoke(Composer composer3, int i30) {
                    LazyListKt.LazyList(modifier, lazyListState, paddingValues, z, z2, flingBehavior, z3, i23, horizontal5, vertical5, vertical6, horizontal6, function1, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0075  */
    /* JADX WARN: Code duplicated, block: B:49:0x0090  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:89:0x0109  */
    private static final Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> rememberLazyListMeasurePolicy(final Function0<? extends LazyListItemProvider> function0, final LazyListState lazyListState, final PaddingValues paddingValues, final boolean z, final boolean z2, final int i, final Alignment.Horizontal horizontal, final Alignment.Vertical vertical, final Arrangement.Horizontal horizontal2, final Arrangement.Vertical vertical2, final CoroutineScope coroutineScope, final GraphicsContext graphicsContext, final boolean z3, Composer composer, int i2, int i3) {
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1972347046, i2, i3, "androidx.compose.foundation.lazy.rememberLazyListMeasurePolicy (LazyList.kt:170)");
        }
        if (((i2 & 112) ^ 48) > 32 && composer.changed(lazyListState)) {
            z4 = true;
        } else if ((i2 & 48) == 32) {
            z4 = true;
        } else {
            z4 = false;
        }
        boolean z11 = (((i2 & 896) ^ 384) > 256 && composer.changed(paddingValues)) || (i2 & 384) == 256;
        boolean z12 = (((i2 & 7168) ^ 3072) > 2048 && composer.changed(z)) || (i2 & 3072) == 2048;
        if (((57344 & i2) ^ 24576) > 16384 && composer.changed(z2)) {
            z5 = true;
        } else if ((i2 & 24576) == 16384) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (((3670016 & i2) ^ 1572864) > 1048576 && composer.changed(horizontal)) {
            z6 = true;
        } else if ((1572864 & i2) == 1048576) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (((29360128 & i2) ^ 12582912) > 8388608 && composer.changed(vertical)) {
            z7 = true;
        } else if ((i2 & 12582912) == 8388608) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (((234881024 & i2) ^ 100663296) > 67108864 && composer.changed(horizontal2)) {
            z8 = true;
        } else if ((i2 & 100663296) == 67108864) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (((1879048192 & i2) ^ 805306368) > 536870912 && composer.changed(vertical2)) {
            z9 = true;
        } else if ((i2 & 805306368) == 536870912) {
            z9 = true;
        } else {
            z9 = false;
        }
        boolean zChanged = composer.changed(graphicsContext);
        if (((i3 & 896) ^ 384) > 256 && composer.changed(z3)) {
            z10 = true;
        } else if ((i3 & 384) == 256) {
            z10 = true;
        } else {
            z10 = false;
        }
        Object objRememberedValue = composer.rememberedValue();
        if ((z8 | z4 | z11 | z12 | z5 | z6 | z7 | z9 | zChanged | z10) || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = (Function2) new Function2<LazyLayoutMeasureScope, Constraints, LazyListMeasureResult>() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1
                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ LazyListMeasureResult invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) {
                    return m1104invoke0kLqBqw(lazyLayoutMeasureScope, constraints.getValue());
                }

                /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                public final LazyListMeasureResult m1104invoke0kLqBqw(final LazyLayoutMeasureScope lazyLayoutMeasureScope, final long j) {
                    int i4;
                    int i5;
                    int i6;
                    float spacing;
                    int iM6888getMaxWidthimpl;
                    long jIntOffset;
                    float scrollToBeConsumed;
                    List<Integer> listEmptyList;
                    ObservableScopeInvalidator.m1176attachToScopeimpl(lazyListState.m1119getMeasurementScopeInvalidatorzYiylxw$foundation_release());
                    boolean z13 = lazyListState.getHasLookaheadPassOccurred() || lazyLayoutMeasureScope.isLookingAhead();
                    CheckScrollableContainerConstraintsKt.m585checkScrollableContainerConstraintsK40F9xA(j, z2 ? Orientation.Vertical : Orientation.Horizontal);
                    if (z2) {
                        i4 = lazyLayoutMeasureScope.mo688roundToPx0680j_4(paddingValues.mo953calculateLeftPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                    } else {
                        i4 = lazyLayoutMeasureScope.mo688roundToPx0680j_4(PaddingKt.calculateStartPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                    }
                    if (z2) {
                        i5 = lazyLayoutMeasureScope.mo688roundToPx0680j_4(paddingValues.mo954calculateRightPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                    } else {
                        i5 = lazyLayoutMeasureScope.mo688roundToPx0680j_4(PaddingKt.calculateEndPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                    }
                    int i7 = lazyLayoutMeasureScope.mo688roundToPx0680j_4(paddingValues.getTop());
                    int i8 = lazyLayoutMeasureScope.mo688roundToPx0680j_4(paddingValues.getBottom());
                    final int i9 = i7 + i8;
                    final int i10 = i4 + i5;
                    boolean z14 = z2;
                    int i11 = z14 ? i9 : i10;
                    if (z14 && !z) {
                        i6 = i7;
                    } else if (z14 && z) {
                        i6 = i8;
                    } else {
                        i6 = (z14 || z) ? i5 : i4;
                    }
                    final int i12 = i11 - i6;
                    final long jM6907offsetNN6EwU = ConstraintsKt.m6907offsetNN6EwU(j, -i10, -i9);
                    final LazyListItemProvider lazyListItemProviderInvoke = function0.invoke();
                    lazyListItemProviderInvoke.getItemScope().setMaxSize(Constraints.m6888getMaxWidthimpl(jM6907offsetNN6EwU), Constraints.m6887getMaxHeightimpl(jM6907offsetNN6EwU));
                    if (z2) {
                        Arrangement.Vertical vertical3 = vertical2;
                        if (vertical3 == null) {
                            throw new IllegalArgumentException("null verticalArrangement when isVertical == true".toString());
                        }
                        spacing = vertical3.getSpacing();
                    } else {
                        Arrangement.Horizontal horizontal3 = horizontal2;
                        if (horizontal3 == null) {
                            throw new IllegalArgumentException("null horizontalAlignment when isVertical == false".toString());
                        }
                        spacing = horizontal3.getSpacing();
                    }
                    final int i13 = lazyLayoutMeasureScope.mo688roundToPx0680j_4(spacing);
                    final int itemCount = lazyListItemProviderInvoke.getItemCount();
                    if (z2) {
                        iM6888getMaxWidthimpl = Constraints.m6887getMaxHeightimpl(j) - i9;
                    } else {
                        iM6888getMaxWidthimpl = Constraints.m6888getMaxWidthimpl(j) - i10;
                    }
                    int i14 = iM6888getMaxWidthimpl;
                    if (!z || i14 > 0) {
                        jIntOffset = IntOffsetKt.IntOffset(i4, i7);
                    } else {
                        boolean z15 = z2;
                        if (!z15) {
                            i4 += i14;
                        }
                        if (z15) {
                            i7 += i14;
                        }
                        jIntOffset = IntOffsetKt.IntOffset(i4, i7);
                    }
                    final long j2 = jIntOffset;
                    final boolean z16 = z2;
                    final Alignment.Horizontal horizontal4 = horizontal;
                    final Alignment.Vertical vertical4 = vertical;
                    final boolean z17 = z;
                    final LazyListState lazyListState2 = lazyListState;
                    final int i15 = i6;
                    LazyListMeasuredItemProvider lazyListMeasuredItemProvider = new LazyListMeasuredItemProvider(jM6907offsetNN6EwU, z16, lazyListItemProviderInvoke, lazyLayoutMeasureScope, itemCount, i13, horizontal4, vertical4, z17, i15, i12, j2, lazyListState2) { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$1
                        final /* synthetic */ int $afterContentPadding;
                        final /* synthetic */ int $beforeContentPadding;
                        final /* synthetic */ Alignment.Horizontal $horizontalAlignment;
                        final /* synthetic */ boolean $isVertical;
                        final /* synthetic */ int $itemsCount;
                        final /* synthetic */ boolean $reverseLayout;
                        final /* synthetic */ int $spaceBetweenItems;
                        final /* synthetic */ LazyListState $state;
                        final /* synthetic */ LazyLayoutMeasureScope $this_null;
                        final /* synthetic */ Alignment.Vertical $verticalAlignment;
                        final /* synthetic */ long $visualItemOffset;

                        {
                            this.$isVertical = z16;
                            this.$this_null = lazyLayoutMeasureScope;
                            this.$itemsCount = itemCount;
                            this.$spaceBetweenItems = i13;
                            this.$horizontalAlignment = horizontal4;
                            this.$verticalAlignment = vertical4;
                            this.$reverseLayout = z17;
                            this.$beforeContentPadding = i15;
                            this.$afterContentPadding = i12;
                            this.$visualItemOffset = j2;
                            this.$state = lazyListState2;
                        }

                        @Override // androidx.compose.foundation.lazy.LazyListMeasuredItemProvider
                        /* JADX INFO: renamed from: createItem-X9ElhV4, reason: not valid java name */
                        public final LazyListMeasuredItem mo1105createItemX9ElhV4(int p0, Object p1, Object p2, List<? extends Placeable> p3, long p4) {
                            return new LazyListMeasuredItem(p0, p3, this.$isVertical, this.$horizontalAlignment, this.$verticalAlignment, this.$this_null.getLayoutDirection(), this.$reverseLayout, this.$beforeContentPadding, this.$afterContentPadding, p0 == this.$itemsCount + (-1) ? 0 : this.$spaceBetweenItems, this.$visualItemOffset, p1, p2, this.$state.getItemAnimator$foundation_release(), p4, null);
                        }
                    };
                    Snapshot.Companion companion = Snapshot.INSTANCE;
                    LazyListState lazyListState3 = lazyListState;
                    Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                    Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                    Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                    try {
                        int iUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release = lazyListState3.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(lazyListItemProviderInvoke, lazyListState3.getFirstVisibleItemIndex());
                        int firstVisibleItemScrollOffset = lazyListState3.getFirstVisibleItemScrollOffset();
                        Unit unit = Unit.INSTANCE;
                        companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                        List<Integer> listCalculateLazyLayoutPinnedIndices = LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(lazyListItemProviderInvoke, lazyListState.getPinnedItems(), lazyListState.getBeyondBoundsInfo());
                        if (lazyLayoutMeasureScope.isLookingAhead() || !z13) {
                            scrollToBeConsumed = lazyListState.getScrollToBeConsumed();
                        } else {
                            scrollToBeConsumed = lazyListState.getScrollDeltaBetweenPasses$foundation_release();
                        }
                        float f = scrollToBeConsumed;
                        if (z3) {
                            listEmptyList = lazyListItemProviderInvoke.getHeaderIndexes();
                        } else {
                            listEmptyList = CollectionsKt.emptyList();
                        }
                        LazyListMeasureResult lazyListMeasureResultM1109measureLazyListx0Ok8Vo = LazyListMeasureKt.m1109measureLazyListx0Ok8Vo(itemCount, lazyListMeasuredItemProvider, i14, i6, i12, i13, iUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release, firstVisibleItemScrollOffset, f, jM6907offsetNN6EwU, z2, listEmptyList, vertical2, horizontal2, z, lazyLayoutMeasureScope, lazyListState.getItemAnimator$foundation_release(), i, listCalculateLazyLayoutPinnedIndices, z13, lazyLayoutMeasureScope.isLookingAhead(), lazyListState.getPostLookaheadLayoutInfo(), coroutineScope, lazyListState.m1120getPlacementScopeInvalidatorzYiylxw$foundation_release(), graphicsContext, new Function3<Integer, Integer, Function1<? super Placeable.PlacementScope, ? extends Unit>, MeasureResult>() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1$measureResult$1
                            @Override // kotlin.jvm.functions.Function3
                            public final /* bridge */ /* synthetic */ MeasureResult invoke(Integer num, Integer num2, Function1<? super Placeable.PlacementScope, ? extends Unit> function1) {
                                return invoke(num.intValue(), num2.intValue(), (Function1<? super Placeable.PlacementScope, Unit>) function1);
                            }

                            public final MeasureResult invoke(int i16, int i17, Function1<? super Placeable.PlacementScope, Unit> function1) {
                                return lazyLayoutMeasureScope.layout(ConstraintsKt.m6905constrainWidthK40F9xA(j, i16 + i10), ConstraintsKt.m6904constrainHeightK40F9xA(j, i17 + i9), MapsKt.emptyMap(), function1);
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }
                        });
                        LazyListState.applyMeasureResult$foundation_release$default(lazyListState, lazyListMeasureResultM1109measureLazyListx0Ok8Vo, lazyLayoutMeasureScope.isLookingAhead(), false, 4, null);
                        return lazyListMeasureResultM1109measureLazyListx0Ok8Vo;
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
