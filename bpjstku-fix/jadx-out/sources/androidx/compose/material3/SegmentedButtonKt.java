package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.material3.tokens.OutlinedSegmentedButtonTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicyKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000v\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aD\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\u001c\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u000b¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a3\u0010\u0011\u001a\u00020\u00062\u0011\u0010\u0012\u001a\r\u0012\u0004\u0012\u00020\u00060\u0013¢\u0006\u0002\b\r2\u0011\u0010\n\u001a\r\u0012\u0004\u0012\u00020\u00060\u0013¢\u0006\u0002\b\rH\u0003¢\u0006\u0002\u0010\u0014\u001aD\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\u001c\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00060\u000b¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0010\u001a\u008f\u0001\u0010\u0018\u001a\u00020\u0006*\u00020\f2\u0006\u0010\u0019\u001a\u00020\u001a2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00060\u000b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u001e\u001a\u00020\u001a2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\u0013\b\u0002\u0010\u0012\u001a\r\u0012\u0004\u0012\u00020\u00060\u0013¢\u0006\u0002\b\r2\u0011\u0010%\u001a\r\u0012\u0004\u0012\u00020\u00060\u0013¢\u0006\u0002\b\rH\u0007¢\u0006\u0002\u0010&\u001a\u0089\u0001\u0010\u0018\u001a\u00020\u0006*\u00020\u00162\u0006\u0010'\u001a\u00020\u001a2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00060\u00132\u0006\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u001e\u001a\u00020\u001a2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\u0013\b\u0002\u0010\u0012\u001a\r\u0012\u0004\u0012\u00020\u00060\u0013¢\u0006\u0002\b\r2\u0011\u0010%\u001a\r\u0012\u0004\u0012\u00020\u00060\u0013¢\u0006\u0002\b\rH\u0007¢\u0006\u0002\u0010)\u001a\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+*\u00020-H\u0003¢\u0006\u0002\u0010.\u001a\"\u0010/\u001a\u00020\b*\u00020\b2\u0006\u0010\u0019\u001a\u00020\u001a2\f\u00100\u001a\b\u0012\u0004\u0012\u00020,0+H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00061"}, d2 = {"CheckedZIndexFactor", "", "IconSpacing", "Landroidx/compose/ui/unit/Dp;", "F", "MultiChoiceSegmentedButtonRow", "", "modifier", "Landroidx/compose/ui/Modifier;", "space", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function1;", "Landroidx/compose/material3/MultiChoiceSegmentedButtonRowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "MultiChoiceSegmentedButtonRow-uFdPcIQ", "(Landroidx/compose/ui/Modifier;FLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "SegmentedButtonContent", "icon", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "SingleChoiceSegmentedButtonRow", "Landroidx/compose/material3/SingleChoiceSegmentedButtonRowScope;", "SingleChoiceSegmentedButtonRow-uFdPcIQ", "SegmentedButton", "checked", "", "onCheckedChange", "shape", "Landroidx/compose/ui/graphics/Shape;", "enabled", "colors", "Landroidx/compose/material3/SegmentedButtonColors;", "border", "Landroidx/compose/foundation/BorderStroke;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", Constants.ScionAnalytics.PARAM_LABEL, "(Landroidx/compose/material3/MultiChoiceSegmentedButtonRowScope;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/SegmentedButtonColors;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "selected", "onClick", "(Landroidx/compose/material3/SingleChoiceSegmentedButtonRowScope;ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/SegmentedButtonColors;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "interactionCountAsState", "Landroidx/compose/runtime/State;", "", "Landroidx/compose/foundation/interaction/InteractionSource;", "(Landroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "interactionZIndex", "interactionCount", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SegmentedButtonKt {
    private static final float CheckedZIndexFactor = 5.0f;
    private static final float IconSpacing = Dp.m6935constructorimpl(8.0f);

    /* JADX WARN: Code duplicated, block: B:100:0x0118  */
    /* JADX WARN: Code duplicated, block: B:102:0x011e  */
    /* JADX WARN: Code duplicated, block: B:103:0x0121  */
    /* JADX WARN: Code duplicated, block: B:107:0x0129  */
    /* JADX WARN: Code duplicated, block: B:108:0x012c  */
    /* JADX WARN: Code duplicated, block: B:110:0x0130  */
    /* JADX WARN: Code duplicated, block: B:112:0x0136  */
    /* JADX WARN: Code duplicated, block: B:113:0x0138  */
    /* JADX WARN: Code duplicated, block: B:115:0x013c  */
    /* JADX WARN: Code duplicated, block: B:118:0x0148  */
    /* JADX WARN: Code duplicated, block: B:123:0x0165  */
    /* JADX WARN: Code duplicated, block: B:125:0x0171  */
    /* JADX WARN: Code duplicated, block: B:135:0x0199 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:136:0x019b  */
    /* JADX WARN: Code duplicated, block: B:137:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:139:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:142:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:143:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:146:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:147:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:149:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:151:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:153:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:155:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:156:0x0204  */
    /* JADX WARN: Code duplicated, block: B:160:0x0218  */
    /* JADX WARN: Code duplicated, block: B:163:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:167:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:169:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x009a  */
    /* JADX WARN: Code duplicated, block: B:57:0x009c  */
    /* JADX WARN: Code duplicated, block: B:59:0x009f  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:90:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:92:0x0100  */
    /* JADX WARN: Code duplicated, block: B:93:0x0103  */
    /* JADX WARN: Code duplicated, block: B:97:0x010d  */
    /* JADX WARN: Code duplicated, block: B:98:0x0112  */
    public static final void SegmentedButton(final MultiChoiceSegmentedButtonRowScope multiChoiceSegmentedButtonRowScope, final boolean z, final Function1<? super Boolean, Unit> function1, final Shape shape, Modifier modifier, boolean z2, SegmentedButtonColors segmentedButtonColors, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        boolean z3;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Modifier.Companion companion;
        SegmentedButtonColors segmentedButtonColorsColors;
        BorderStroke borderStrokeM2349borderStrokel07J4OM$default;
        MutableInteractionSource mutableInteractionSource2;
        ComposableLambda composableLambda;
        final Function2<? super Composer, ? super Integer, Unit> function4;
        MutableInteractionSource mutableInteractionSource3;
        Modifier modifier2;
        SegmentedButtonColors segmentedButtonColors2;
        BorderStroke borderStroke2;
        Object objRememberedValue;
        int i13;
        Composer composer2;
        final SegmentedButtonColors segmentedButtonColors3;
        final boolean z4;
        final Modifier modifier3;
        final BorderStroke borderStroke3;
        final MutableInteractionSource mutableInteractionSource4;
        final Function2<? super Composer, ? super Integer, Unit> function5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i14;
        int i15;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1596038053);
        if ((Integer.MIN_VALUE & i3) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(multiChoiceSegmentedButtonRowScope) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 1) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i3 & 2) != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i3 & 4) != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            i4 |= composerStartRestartGroup.changed(shape) ? 2048 : 1024;
        }
        int i16 = i3 & 8;
        if (i16 == 0) {
            if ((i & 24576) == 0) {
                i4 |= composerStartRestartGroup.changed(modifier) ? 16384 : 8192;
            }
            i5 = i3 & 16;
            if (i5 != 0) {
                if ((196608 & i) == 0) {
                    z3 = z2;
                    if (composerStartRestartGroup.changed(z3)) {
                        i6 = 131072;
                    } else {
                        i6 = 65536;
                    }
                    i4 |= i6;
                }
                if ((i & 1572864) != 0) {
                    if ((i3 & 32) == 0 || !composerStartRestartGroup.changed(segmentedButtonColors)) {
                        i15 = 524288;
                    } else {
                        i15 = 1048576;
                    }
                    i4 |= i15;
                }
                if ((i & 12582912) != 0) {
                    if ((i3 & 64) == 0 || !composerStartRestartGroup.changed(borderStroke)) {
                        i14 = 4194304;
                    } else {
                        i14 = 8388608;
                    }
                    i4 |= i14;
                }
                i7 = i3 & 128;
                if (i7 != 0) {
                    i4 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                        i8 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i8 = 33554432;
                    }
                    i4 |= i8;
                }
                i9 = i3 & 256;
                if (i9 != 0) {
                    i4 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i10 = 536870912;
                    } else {
                        i10 = 268435456;
                    }
                    i4 |= i10;
                }
                if ((i3 & 512) != 0) {
                    i11 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (composerStartRestartGroup.changedInstance(function3)) {
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
                        if (i16 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if (i5 != 0) {
                            z3 = true;
                        }
                        if ((i3 & 32) != 0) {
                            segmentedButtonColorsColors = SegmentedButtonDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                            i4 &= -3670017;
                        } else {
                            segmentedButtonColorsColors = segmentedButtonColors;
                        }
                        if ((i3 & 64) != 0) {
                            borderStrokeM2349borderStrokel07J4OM$default = SegmentedButtonDefaults.m2349borderStrokel07J4OM$default(SegmentedButtonDefaults.INSTANCE, segmentedButtonColorsColors.m2333borderColorWaAFU9c$material3_release(z3, z), 0.0f, 2, null);
                            i4 &= -29360129;
                        } else {
                            borderStrokeM2349borderStrokel07J4OM$default = borderStroke;
                        }
                        if (i7 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-773603666);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if (i9 != 0) {
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 970447394, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt.SegmentedButton.2
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i17) {
                                    if ((i17 & 3) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(970447394, i17, -1, "androidx.compose.material3.SegmentedButton.<anonymous> (SegmentedButton.kt:139)");
                                    }
                                    SegmentedButtonDefaults.INSTANCE.Icon(z, null, null, composer3, 3072, 6);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }
                            });
                        } else {
                            composableLambda = function2;
                        }
                        function4 = composableLambda;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        modifier2 = companion;
                        segmentedButtonColors2 = segmentedButtonColorsColors;
                        borderStroke2 = borderStrokeM2349borderStrokel07J4OM$default;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i3 & 32) != 0) {
                            i4 &= -3670017;
                        }
                        if ((i3 & 64) != 0) {
                            i4 &= -29360129;
                        }
                        modifier2 = modifier;
                        segmentedButtonColors2 = segmentedButtonColors;
                        borderStroke2 = borderStroke;
                        mutableInteractionSource3 = mutableInteractionSource;
                        function4 = function2;
                    }
                    boolean z5 = z3;
                    i13 = i4;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1596038053, i13, i11, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:141)");
                    }
                    int i17 = (i13 >> 24) & 14;
                    SegmentedButtonColors segmentedButtonColors4 = segmentedButtonColors2;
                    Function2<? super Composer, ? super Integer, Unit> function6 = function4;
                    composer2 = composerStartRestartGroup;
                    SurfaceKt.m2508Surfaced85dljk(z, function1, SizeKt.m1031defaultMinSizeVpY3zN4(interactionZIndex(RowScope.weight$default(multiChoiceSegmentedButtonRowScope, modifier2, 1.0f, false, 2, null), z, interactionCountAsState(mutableInteractionSource3, composerStartRestartGroup, i17)), ButtonDefaults.INSTANCE.m1806getMinWidthD9Ej5fM(), ButtonDefaults.INSTANCE.m1805getMinHeightD9Ej5fM()), z5, shape, segmentedButtonColors2.m2334containerColorWaAFU9c$material3_release(z5, z), segmentedButtonColors2.m2335contentColorWaAFU9c$material3_release(z5, z), 0.0f, 0.0f, borderStroke2, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1635710341, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt.SegmentedButton.3
                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i18) {
                            if ((i18 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1635710341, i18, -1, "androidx.compose.material3.SegmentedButton.<anonymous> (SegmentedButton.kt:163)");
                            }
                            SegmentedButtonKt.SegmentedButtonContent(function4, function3, composer3, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }
                    }), composer2, ((i13 >> 3) & 126) | ((i13 >> 6) & 7168) | ((i13 << 3) & 57344) | ((i13 << 6) & 1879048192), i17 | 48, 384);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    segmentedButtonColors3 = segmentedButtonColors4;
                    z4 = z5;
                    modifier3 = modifier2;
                    borderStroke3 = borderStroke2;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    function5 = function6;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    segmentedButtonColors3 = segmentedButtonColors;
                    borderStroke3 = borderStroke;
                    mutableInteractionSource4 = mutableInteractionSource;
                    function5 = function2;
                    composer2 = composerStartRestartGroup;
                    z4 = z3;
                    modifier3 = modifier;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt.SegmentedButton.4
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

                        public final void invoke(Composer composer3, int i18) {
                            SegmentedButtonKt.SegmentedButton(multiChoiceSegmentedButtonRowScope, z, function1, shape, modifier3, z4, segmentedButtonColors3, borderStroke3, mutableInteractionSource4, function5, function3, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                        }
                    });
                }
            }
            i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            z3 = z2;
            if ((i & 1572864) != 0) {
                if ((i3 & 32) == 0) {
                    i15 = 524288;
                } else {
                    i15 = 524288;
                }
                i4 |= i15;
            }
            if ((i & 12582912) != 0) {
                if ((i3 & 64) == 0) {
                    i14 = 4194304;
                } else {
                    i14 = 4194304;
                }
                i4 |= i14;
            }
            i7 = i3 & 128;
            if (i7 != 0) {
                i4 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                    i8 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i8 = 33554432;
                }
                i4 |= i8;
            }
            i9 = i3 & 256;
            if (i9 != 0) {
                i4 |= 805306368;
            } else if ((i & 805306368) == 0) {
                if (composerStartRestartGroup.changedInstance(function2)) {
                    i10 = 536870912;
                } else {
                    i10 = 268435456;
                }
                i4 |= i10;
            }
            if ((i3 & 512) != 0) {
                i11 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                if (composerStartRestartGroup.changedInstance(function3)) {
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
                    if (i16 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i5 != 0) {
                        z3 = true;
                    }
                    if ((i3 & 32) != 0) {
                        segmentedButtonColorsColors = SegmentedButtonDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                        i4 &= -3670017;
                    } else {
                        segmentedButtonColorsColors = segmentedButtonColors;
                    }
                    if ((i3 & 64) != 0) {
                        borderStrokeM2349borderStrokel07J4OM$default = SegmentedButtonDefaults.m2349borderStrokel07J4OM$default(SegmentedButtonDefaults.INSTANCE, segmentedButtonColorsColors.m2333borderColorWaAFU9c$material3_release(z3, z), 0.0f, 2, null);
                        i4 &= -29360129;
                    } else {
                        borderStrokeM2349borderStrokel07J4OM$default = borderStroke;
                    }
                    if (i7 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-773603666);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if (i9 != 0) {
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 970447394, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt.SegmentedButton.2
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i18) {
                                if ((i18 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(970447394, i18, -1, "androidx.compose.material3.SegmentedButton.<anonymous> (SegmentedButton.kt:139)");
                                }
                                SegmentedButtonDefaults.INSTANCE.Icon(z, null, null, composer3, 3072, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }
                        });
                    } else {
                        composableLambda = function2;
                    }
                    function4 = composableLambda;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    modifier2 = companion;
                    segmentedButtonColors2 = segmentedButtonColorsColors;
                    borderStroke2 = borderStrokeM2349borderStrokel07J4OM$default;
                } else {
                    if (i16 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i5 != 0) {
                        z3 = true;
                    }
                    if ((i3 & 32) != 0) {
                        segmentedButtonColorsColors = SegmentedButtonDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                        i4 &= -3670017;
                    } else {
                        segmentedButtonColorsColors = segmentedButtonColors;
                    }
                    if ((i3 & 64) != 0) {
                        borderStrokeM2349borderStrokel07J4OM$default = SegmentedButtonDefaults.m2349borderStrokel07J4OM$default(SegmentedButtonDefaults.INSTANCE, segmentedButtonColorsColors.m2333borderColorWaAFU9c$material3_release(z3, z), 0.0f, 2, null);
                        i4 &= -29360129;
                    } else {
                        borderStrokeM2349borderStrokel07J4OM$default = borderStroke;
                    }
                    if (i7 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-773603666);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if (i9 != 0) {
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 970447394, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt.SegmentedButton.2
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i18) {
                                if ((i18 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(970447394, i18, -1, "androidx.compose.material3.SegmentedButton.<anonymous> (SegmentedButton.kt:139)");
                                }
                                SegmentedButtonDefaults.INSTANCE.Icon(z, null, null, composer3, 3072, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }
                        });
                    } else {
                        composableLambda = function2;
                    }
                    function4 = composableLambda;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    modifier2 = companion;
                    segmentedButtonColors2 = segmentedButtonColorsColors;
                    borderStroke2 = borderStrokeM2349borderStrokel07J4OM$default;
                }
                boolean z6 = z3;
                i13 = i4;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1596038053, i13, i11, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:141)");
                }
                int i18 = (i13 >> 24) & 14;
                SegmentedButtonColors segmentedButtonColors5 = segmentedButtonColors2;
                Function2<? super Composer, ? super Integer, Unit> function7 = function4;
                composer2 = composerStartRestartGroup;
                SurfaceKt.m2508Surfaced85dljk(z, function1, SizeKt.m1031defaultMinSizeVpY3zN4(interactionZIndex(RowScope.weight$default(multiChoiceSegmentedButtonRowScope, modifier2, 1.0f, false, 2, null), z, interactionCountAsState(mutableInteractionSource3, composerStartRestartGroup, i18)), ButtonDefaults.INSTANCE.m1806getMinWidthD9Ej5fM(), ButtonDefaults.INSTANCE.m1805getMinHeightD9Ej5fM()), z6, shape, segmentedButtonColors2.m2334containerColorWaAFU9c$material3_release(z6, z), segmentedButtonColors2.m2335contentColorWaAFU9c$material3_release(z6, z), 0.0f, 0.0f, borderStroke2, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1635710341, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt.SegmentedButton.3
                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i19) {
                        if ((i19 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1635710341, i19, -1, "androidx.compose.material3.SegmentedButton.<anonymous> (SegmentedButton.kt:163)");
                        }
                        SegmentedButtonKt.SegmentedButtonContent(function4, function3, composer3, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }
                }), composer2, ((i13 >> 3) & 126) | ((i13 >> 6) & 7168) | ((i13 << 3) & 57344) | ((i13 << 6) & 1879048192), i18 | 48, 384);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                segmentedButtonColors3 = segmentedButtonColors5;
                z4 = z6;
                modifier3 = modifier2;
                borderStroke3 = borderStroke2;
                mutableInteractionSource4 = mutableInteractionSource3;
                function5 = function7;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i16 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i5 != 0) {
                        z3 = true;
                    }
                    if ((i3 & 32) != 0) {
                        segmentedButtonColorsColors = SegmentedButtonDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                        i4 &= -3670017;
                    } else {
                        segmentedButtonColorsColors = segmentedButtonColors;
                    }
                    if ((i3 & 64) != 0) {
                        borderStrokeM2349borderStrokel07J4OM$default = SegmentedButtonDefaults.m2349borderStrokel07J4OM$default(SegmentedButtonDefaults.INSTANCE, segmentedButtonColorsColors.m2333borderColorWaAFU9c$material3_release(z3, z), 0.0f, 2, null);
                        i4 &= -29360129;
                    } else {
                        borderStrokeM2349borderStrokel07J4OM$default = borderStroke;
                    }
                    if (i7 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-773603666);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if (i9 != 0) {
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 970447394, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt.SegmentedButton.2
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i19) {
                                if ((i19 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(970447394, i19, -1, "androidx.compose.material3.SegmentedButton.<anonymous> (SegmentedButton.kt:139)");
                                }
                                SegmentedButtonDefaults.INSTANCE.Icon(z, null, null, composer3, 3072, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }
                        });
                    } else {
                        composableLambda = function2;
                    }
                    function4 = composableLambda;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    modifier2 = companion;
                    segmentedButtonColors2 = segmentedButtonColorsColors;
                    borderStroke2 = borderStrokeM2349borderStrokel07J4OM$default;
                } else {
                    if (i16 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i5 != 0) {
                        z3 = true;
                    }
                    if ((i3 & 32) != 0) {
                        segmentedButtonColorsColors = SegmentedButtonDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                        i4 &= -3670017;
                    } else {
                        segmentedButtonColorsColors = segmentedButtonColors;
                    }
                    if ((i3 & 64) != 0) {
                        borderStrokeM2349borderStrokel07J4OM$default = SegmentedButtonDefaults.m2349borderStrokel07J4OM$default(SegmentedButtonDefaults.INSTANCE, segmentedButtonColorsColors.m2333borderColorWaAFU9c$material3_release(z3, z), 0.0f, 2, null);
                        i4 &= -29360129;
                    } else {
                        borderStrokeM2349borderStrokel07J4OM$default = borderStroke;
                    }
                    if (i7 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-773603666);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if (i9 != 0) {
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 970447394, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt.SegmentedButton.2
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i19) {
                                if ((i19 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(970447394, i19, -1, "androidx.compose.material3.SegmentedButton.<anonymous> (SegmentedButton.kt:139)");
                                }
                                SegmentedButtonDefaults.INSTANCE.Icon(z, null, null, composer3, 3072, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }
                        });
                    } else {
                        composableLambda = function2;
                    }
                    function4 = composableLambda;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    modifier2 = companion;
                    segmentedButtonColors2 = segmentedButtonColorsColors;
                    borderStroke2 = borderStrokeM2349borderStrokel07J4OM$default;
                }
                boolean z7 = z3;
                i13 = i4;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1596038053, i13, i11, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:141)");
                }
                int i19 = (i13 >> 24) & 14;
                SegmentedButtonColors segmentedButtonColors6 = segmentedButtonColors2;
                Function2<? super Composer, ? super Integer, Unit> function8 = function4;
                composer2 = composerStartRestartGroup;
                SurfaceKt.m2508Surfaced85dljk(z, function1, SizeKt.m1031defaultMinSizeVpY3zN4(interactionZIndex(RowScope.weight$default(multiChoiceSegmentedButtonRowScope, modifier2, 1.0f, false, 2, null), z, interactionCountAsState(mutableInteractionSource3, composerStartRestartGroup, i19)), ButtonDefaults.INSTANCE.m1806getMinWidthD9Ej5fM(), ButtonDefaults.INSTANCE.m1805getMinHeightD9Ej5fM()), z7, shape, segmentedButtonColors2.m2334containerColorWaAFU9c$material3_release(z7, z), segmentedButtonColors2.m2335contentColorWaAFU9c$material3_release(z7, z), 0.0f, 0.0f, borderStroke2, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1635710341, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt.SegmentedButton.3
                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i110) {
                        if ((i110 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1635710341, i110, -1, "androidx.compose.material3.SegmentedButton.<anonymous> (SegmentedButton.kt:163)");
                        }
                        SegmentedButtonKt.SegmentedButtonContent(function4, function3, composer3, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }
                }), composer2, ((i13 >> 3) & 126) | ((i13 >> 6) & 7168) | ((i13 << 3) & 57344) | ((i13 << 6) & 1879048192), i19 | 48, 384);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                segmentedButtonColors3 = segmentedButtonColors6;
                z4 = z7;
                modifier3 = modifier2;
                borderStroke3 = borderStroke2;
                mutableInteractionSource4 = mutableInteractionSource3;
                function5 = function8;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt.SegmentedButton.4
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

                    public final void invoke(Composer composer3, int i110) {
                        SegmentedButtonKt.SegmentedButton(multiChoiceSegmentedButtonRowScope, z, function1, shape, modifier3, z4, segmentedButtonColors3, borderStroke3, mutableInteractionSource4, function5, function3, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                    }
                });
            }
        }
        i4 |= 24576;
        i5 = i3 & 16;
        if (i5 != 0) {
            if ((196608 & i) == 0) {
                z3 = z2;
                if (composerStartRestartGroup.changed(z3)) {
                    i6 = 131072;
                } else {
                    i6 = 65536;
                }
                i4 |= i6;
            }
            if ((i & 1572864) != 0) {
                if ((i3 & 32) == 0) {
                    i15 = 524288;
                } else {
                    i15 = 524288;
                }
                i4 |= i15;
            }
            if ((i & 12582912) != 0) {
                if ((i3 & 64) == 0) {
                    i14 = 4194304;
                } else {
                    i14 = 4194304;
                }
                i4 |= i14;
            }
            i7 = i3 & 128;
            if (i7 != 0) {
                i4 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                    i8 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i8 = 33554432;
                }
                i4 |= i8;
            }
            i9 = i3 & 256;
            if (i9 != 0) {
                i4 |= 805306368;
            } else if ((i & 805306368) == 0) {
                if (composerStartRestartGroup.changedInstance(function2)) {
                    i10 = 536870912;
                } else {
                    i10 = 268435456;
                }
                i4 |= i10;
            }
            if ((i3 & 512) != 0) {
                i11 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                if (composerStartRestartGroup.changedInstance(function3)) {
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
                    if (i16 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i5 != 0) {
                        z3 = true;
                    }
                    if ((i3 & 32) != 0) {
                        segmentedButtonColorsColors = SegmentedButtonDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                        i4 &= -3670017;
                    } else {
                        segmentedButtonColorsColors = segmentedButtonColors;
                    }
                    if ((i3 & 64) != 0) {
                        borderStrokeM2349borderStrokel07J4OM$default = SegmentedButtonDefaults.m2349borderStrokel07J4OM$default(SegmentedButtonDefaults.INSTANCE, segmentedButtonColorsColors.m2333borderColorWaAFU9c$material3_release(z3, z), 0.0f, 2, null);
                        i4 &= -29360129;
                    } else {
                        borderStrokeM2349borderStrokel07J4OM$default = borderStroke;
                    }
                    if (i7 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-773603666);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if (i9 != 0) {
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 970447394, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt.SegmentedButton.2
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i110) {
                                if ((i110 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(970447394, i110, -1, "androidx.compose.material3.SegmentedButton.<anonymous> (SegmentedButton.kt:139)");
                                }
                                SegmentedButtonDefaults.INSTANCE.Icon(z, null, null, composer3, 3072, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }
                        });
                    } else {
                        composableLambda = function2;
                    }
                    function4 = composableLambda;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    modifier2 = companion;
                    segmentedButtonColors2 = segmentedButtonColorsColors;
                    borderStroke2 = borderStrokeM2349borderStrokel07J4OM$default;
                } else {
                    if (i16 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i5 != 0) {
                        z3 = true;
                    }
                    if ((i3 & 32) != 0) {
                        segmentedButtonColorsColors = SegmentedButtonDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                        i4 &= -3670017;
                    } else {
                        segmentedButtonColorsColors = segmentedButtonColors;
                    }
                    if ((i3 & 64) != 0) {
                        borderStrokeM2349borderStrokel07J4OM$default = SegmentedButtonDefaults.m2349borderStrokel07J4OM$default(SegmentedButtonDefaults.INSTANCE, segmentedButtonColorsColors.m2333borderColorWaAFU9c$material3_release(z3, z), 0.0f, 2, null);
                        i4 &= -29360129;
                    } else {
                        borderStrokeM2349borderStrokel07J4OM$default = borderStroke;
                    }
                    if (i7 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-773603666);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if (i9 != 0) {
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 970447394, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt.SegmentedButton.2
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i110) {
                                if ((i110 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(970447394, i110, -1, "androidx.compose.material3.SegmentedButton.<anonymous> (SegmentedButton.kt:139)");
                                }
                                SegmentedButtonDefaults.INSTANCE.Icon(z, null, null, composer3, 3072, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }
                        });
                    } else {
                        composableLambda = function2;
                    }
                    function4 = composableLambda;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    modifier2 = companion;
                    segmentedButtonColors2 = segmentedButtonColorsColors;
                    borderStroke2 = borderStrokeM2349borderStrokel07J4OM$default;
                }
                boolean z8 = z3;
                i13 = i4;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1596038053, i13, i11, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:141)");
                }
                int i110 = (i13 >> 24) & 14;
                SegmentedButtonColors segmentedButtonColors7 = segmentedButtonColors2;
                Function2<? super Composer, ? super Integer, Unit> function9 = function4;
                composer2 = composerStartRestartGroup;
                SurfaceKt.m2508Surfaced85dljk(z, function1, SizeKt.m1031defaultMinSizeVpY3zN4(interactionZIndex(RowScope.weight$default(multiChoiceSegmentedButtonRowScope, modifier2, 1.0f, false, 2, null), z, interactionCountAsState(mutableInteractionSource3, composerStartRestartGroup, i110)), ButtonDefaults.INSTANCE.m1806getMinWidthD9Ej5fM(), ButtonDefaults.INSTANCE.m1805getMinHeightD9Ej5fM()), z8, shape, segmentedButtonColors2.m2334containerColorWaAFU9c$material3_release(z8, z), segmentedButtonColors2.m2335contentColorWaAFU9c$material3_release(z8, z), 0.0f, 0.0f, borderStroke2, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1635710341, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt.SegmentedButton.3
                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i111) {
                        if ((i111 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1635710341, i111, -1, "androidx.compose.material3.SegmentedButton.<anonymous> (SegmentedButton.kt:163)");
                        }
                        SegmentedButtonKt.SegmentedButtonContent(function4, function3, composer3, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }
                }), composer2, ((i13 >> 3) & 126) | ((i13 >> 6) & 7168) | ((i13 << 3) & 57344) | ((i13 << 6) & 1879048192), i110 | 48, 384);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                segmentedButtonColors3 = segmentedButtonColors7;
                z4 = z8;
                modifier3 = modifier2;
                borderStroke3 = borderStroke2;
                mutableInteractionSource4 = mutableInteractionSource3;
                function5 = function9;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i16 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i5 != 0) {
                        z3 = true;
                    }
                    if ((i3 & 32) != 0) {
                        segmentedButtonColorsColors = SegmentedButtonDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                        i4 &= -3670017;
                    } else {
                        segmentedButtonColorsColors = segmentedButtonColors;
                    }
                    if ((i3 & 64) != 0) {
                        borderStrokeM2349borderStrokel07J4OM$default = SegmentedButtonDefaults.m2349borderStrokel07J4OM$default(SegmentedButtonDefaults.INSTANCE, segmentedButtonColorsColors.m2333borderColorWaAFU9c$material3_release(z3, z), 0.0f, 2, null);
                        i4 &= -29360129;
                    } else {
                        borderStrokeM2349borderStrokel07J4OM$default = borderStroke;
                    }
                    if (i7 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-773603666);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if (i9 != 0) {
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 970447394, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt.SegmentedButton.2
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i111) {
                                if ((i111 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(970447394, i111, -1, "androidx.compose.material3.SegmentedButton.<anonymous> (SegmentedButton.kt:139)");
                                }
                                SegmentedButtonDefaults.INSTANCE.Icon(z, null, null, composer3, 3072, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }
                        });
                    } else {
                        composableLambda = function2;
                    }
                    function4 = composableLambda;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    modifier2 = companion;
                    segmentedButtonColors2 = segmentedButtonColorsColors;
                    borderStroke2 = borderStrokeM2349borderStrokel07J4OM$default;
                } else {
                    if (i16 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i5 != 0) {
                        z3 = true;
                    }
                    if ((i3 & 32) != 0) {
                        segmentedButtonColorsColors = SegmentedButtonDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                        i4 &= -3670017;
                    } else {
                        segmentedButtonColorsColors = segmentedButtonColors;
                    }
                    if ((i3 & 64) != 0) {
                        borderStrokeM2349borderStrokel07J4OM$default = SegmentedButtonDefaults.m2349borderStrokel07J4OM$default(SegmentedButtonDefaults.INSTANCE, segmentedButtonColorsColors.m2333borderColorWaAFU9c$material3_release(z3, z), 0.0f, 2, null);
                        i4 &= -29360129;
                    } else {
                        borderStrokeM2349borderStrokel07J4OM$default = borderStroke;
                    }
                    if (i7 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-773603666);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if (i9 != 0) {
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 970447394, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt.SegmentedButton.2
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i111) {
                                if ((i111 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(970447394, i111, -1, "androidx.compose.material3.SegmentedButton.<anonymous> (SegmentedButton.kt:139)");
                                }
                                SegmentedButtonDefaults.INSTANCE.Icon(z, null, null, composer3, 3072, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }
                        });
                    } else {
                        composableLambda = function2;
                    }
                    function4 = composableLambda;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    modifier2 = companion;
                    segmentedButtonColors2 = segmentedButtonColorsColors;
                    borderStroke2 = borderStrokeM2349borderStrokel07J4OM$default;
                }
                boolean z9 = z3;
                i13 = i4;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1596038053, i13, i11, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:141)");
                }
                int i111 = (i13 >> 24) & 14;
                SegmentedButtonColors segmentedButtonColors8 = segmentedButtonColors2;
                Function2<? super Composer, ? super Integer, Unit> function10 = function4;
                composer2 = composerStartRestartGroup;
                SurfaceKt.m2508Surfaced85dljk(z, function1, SizeKt.m1031defaultMinSizeVpY3zN4(interactionZIndex(RowScope.weight$default(multiChoiceSegmentedButtonRowScope, modifier2, 1.0f, false, 2, null), z, interactionCountAsState(mutableInteractionSource3, composerStartRestartGroup, i111)), ButtonDefaults.INSTANCE.m1806getMinWidthD9Ej5fM(), ButtonDefaults.INSTANCE.m1805getMinHeightD9Ej5fM()), z9, shape, segmentedButtonColors2.m2334containerColorWaAFU9c$material3_release(z9, z), segmentedButtonColors2.m2335contentColorWaAFU9c$material3_release(z9, z), 0.0f, 0.0f, borderStroke2, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1635710341, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt.SegmentedButton.3
                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i112) {
                        if ((i112 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1635710341, i112, -1, "androidx.compose.material3.SegmentedButton.<anonymous> (SegmentedButton.kt:163)");
                        }
                        SegmentedButtonKt.SegmentedButtonContent(function4, function3, composer3, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }
                }), composer2, ((i13 >> 3) & 126) | ((i13 >> 6) & 7168) | ((i13 << 3) & 57344) | ((i13 << 6) & 1879048192), i111 | 48, 384);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                segmentedButtonColors3 = segmentedButtonColors8;
                z4 = z9;
                modifier3 = modifier2;
                borderStroke3 = borderStroke2;
                mutableInteractionSource4 = mutableInteractionSource3;
                function5 = function10;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt.SegmentedButton.4
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

                    public final void invoke(Composer composer3, int i112) {
                        SegmentedButtonKt.SegmentedButton(multiChoiceSegmentedButtonRowScope, z, function1, shape, modifier3, z4, segmentedButtonColors3, borderStroke3, mutableInteractionSource4, function5, function3, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                    }
                });
            }
        }
        i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        z3 = z2;
        if ((i & 1572864) != 0) {
            if ((i3 & 32) == 0) {
                i15 = 524288;
            } else {
                i15 = 524288;
            }
            i4 |= i15;
        }
        if ((i & 12582912) != 0) {
            if ((i3 & 64) == 0) {
                i14 = 4194304;
            } else {
                i14 = 4194304;
            }
            i4 |= i14;
        }
        i7 = i3 & 128;
        if (i7 != 0) {
            i4 |= 100663296;
        } else if ((i & 100663296) == 0) {
            if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                i8 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
            } else {
                i8 = 33554432;
            }
            i4 |= i8;
        }
        i9 = i3 & 256;
        if (i9 != 0) {
            i4 |= 805306368;
        } else if ((i & 805306368) == 0) {
            if (composerStartRestartGroup.changedInstance(function2)) {
                i10 = 536870912;
            } else {
                i10 = 268435456;
            }
            i4 |= i10;
        }
        if ((i3 & 512) != 0) {
            i11 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            if (composerStartRestartGroup.changedInstance(function3)) {
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
                if (i16 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier;
                }
                if (i5 != 0) {
                    z3 = true;
                }
                if ((i3 & 32) != 0) {
                    segmentedButtonColorsColors = SegmentedButtonDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                    i4 &= -3670017;
                } else {
                    segmentedButtonColorsColors = segmentedButtonColors;
                }
                if ((i3 & 64) != 0) {
                    borderStrokeM2349borderStrokel07J4OM$default = SegmentedButtonDefaults.m2349borderStrokel07J4OM$default(SegmentedButtonDefaults.INSTANCE, segmentedButtonColorsColors.m2333borderColorWaAFU9c$material3_release(z3, z), 0.0f, 2, null);
                    i4 &= -29360129;
                } else {
                    borderStrokeM2349borderStrokel07J4OM$default = borderStroke;
                }
                if (i7 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-773603666);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    mutableInteractionSource2 = mutableInteractionSource;
                }
                if (i9 != 0) {
                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 970447394, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt.SegmentedButton.2
                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i112) {
                            if ((i112 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(970447394, i112, -1, "androidx.compose.material3.SegmentedButton.<anonymous> (SegmentedButton.kt:139)");
                            }
                            SegmentedButtonDefaults.INSTANCE.Icon(z, null, null, composer3, 3072, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }
                    });
                } else {
                    composableLambda = function2;
                }
                function4 = composableLambda;
                mutableInteractionSource3 = mutableInteractionSource2;
                modifier2 = companion;
                segmentedButtonColors2 = segmentedButtonColorsColors;
                borderStroke2 = borderStrokeM2349borderStrokel07J4OM$default;
            } else {
                if (i16 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier;
                }
                if (i5 != 0) {
                    z3 = true;
                }
                if ((i3 & 32) != 0) {
                    segmentedButtonColorsColors = SegmentedButtonDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                    i4 &= -3670017;
                } else {
                    segmentedButtonColorsColors = segmentedButtonColors;
                }
                if ((i3 & 64) != 0) {
                    borderStrokeM2349borderStrokel07J4OM$default = SegmentedButtonDefaults.m2349borderStrokel07J4OM$default(SegmentedButtonDefaults.INSTANCE, segmentedButtonColorsColors.m2333borderColorWaAFU9c$material3_release(z3, z), 0.0f, 2, null);
                    i4 &= -29360129;
                } else {
                    borderStrokeM2349borderStrokel07J4OM$default = borderStroke;
                }
                if (i7 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-773603666);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    mutableInteractionSource2 = mutableInteractionSource;
                }
                if (i9 != 0) {
                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 970447394, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt.SegmentedButton.2
                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i112) {
                            if ((i112 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(970447394, i112, -1, "androidx.compose.material3.SegmentedButton.<anonymous> (SegmentedButton.kt:139)");
                            }
                            SegmentedButtonDefaults.INSTANCE.Icon(z, null, null, composer3, 3072, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }
                    });
                } else {
                    composableLambda = function2;
                }
                function4 = composableLambda;
                mutableInteractionSource3 = mutableInteractionSource2;
                modifier2 = companion;
                segmentedButtonColors2 = segmentedButtonColorsColors;
                borderStroke2 = borderStrokeM2349borderStrokel07J4OM$default;
            }
            boolean z10 = z3;
            i13 = i4;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1596038053, i13, i11, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:141)");
            }
            int i112 = (i13 >> 24) & 14;
            SegmentedButtonColors segmentedButtonColors9 = segmentedButtonColors2;
            Function2<? super Composer, ? super Integer, Unit> function11 = function4;
            composer2 = composerStartRestartGroup;
            SurfaceKt.m2508Surfaced85dljk(z, function1, SizeKt.m1031defaultMinSizeVpY3zN4(interactionZIndex(RowScope.weight$default(multiChoiceSegmentedButtonRowScope, modifier2, 1.0f, false, 2, null), z, interactionCountAsState(mutableInteractionSource3, composerStartRestartGroup, i112)), ButtonDefaults.INSTANCE.m1806getMinWidthD9Ej5fM(), ButtonDefaults.INSTANCE.m1805getMinHeightD9Ej5fM()), z10, shape, segmentedButtonColors2.m2334containerColorWaAFU9c$material3_release(z10, z), segmentedButtonColors2.m2335contentColorWaAFU9c$material3_release(z10, z), 0.0f, 0.0f, borderStroke2, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1635710341, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt.SegmentedButton.3
                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i113) {
                    if ((i113 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1635710341, i113, -1, "androidx.compose.material3.SegmentedButton.<anonymous> (SegmentedButton.kt:163)");
                    }
                    SegmentedButtonKt.SegmentedButtonContent(function4, function3, composer3, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }
            }), composer2, ((i13 >> 3) & 126) | ((i13 >> 6) & 7168) | ((i13 << 3) & 57344) | ((i13 << 6) & 1879048192), i112 | 48, 384);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            segmentedButtonColors3 = segmentedButtonColors9;
            z4 = z10;
            modifier3 = modifier2;
            borderStroke3 = borderStroke2;
            mutableInteractionSource4 = mutableInteractionSource3;
            function5 = function11;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i16 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier;
                }
                if (i5 != 0) {
                    z3 = true;
                }
                if ((i3 & 32) != 0) {
                    segmentedButtonColorsColors = SegmentedButtonDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                    i4 &= -3670017;
                } else {
                    segmentedButtonColorsColors = segmentedButtonColors;
                }
                if ((i3 & 64) != 0) {
                    borderStrokeM2349borderStrokel07J4OM$default = SegmentedButtonDefaults.m2349borderStrokel07J4OM$default(SegmentedButtonDefaults.INSTANCE, segmentedButtonColorsColors.m2333borderColorWaAFU9c$material3_release(z3, z), 0.0f, 2, null);
                    i4 &= -29360129;
                } else {
                    borderStrokeM2349borderStrokel07J4OM$default = borderStroke;
                }
                if (i7 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-773603666);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    mutableInteractionSource2 = mutableInteractionSource;
                }
                if (i9 != 0) {
                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 970447394, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt.SegmentedButton.2
                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i113) {
                            if ((i113 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(970447394, i113, -1, "androidx.compose.material3.SegmentedButton.<anonymous> (SegmentedButton.kt:139)");
                            }
                            SegmentedButtonDefaults.INSTANCE.Icon(z, null, null, composer3, 3072, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }
                    });
                } else {
                    composableLambda = function2;
                }
                function4 = composableLambda;
                mutableInteractionSource3 = mutableInteractionSource2;
                modifier2 = companion;
                segmentedButtonColors2 = segmentedButtonColorsColors;
                borderStroke2 = borderStrokeM2349borderStrokel07J4OM$default;
            } else {
                if (i16 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier;
                }
                if (i5 != 0) {
                    z3 = true;
                }
                if ((i3 & 32) != 0) {
                    segmentedButtonColorsColors = SegmentedButtonDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                    i4 &= -3670017;
                } else {
                    segmentedButtonColorsColors = segmentedButtonColors;
                }
                if ((i3 & 64) != 0) {
                    borderStrokeM2349borderStrokel07J4OM$default = SegmentedButtonDefaults.m2349borderStrokel07J4OM$default(SegmentedButtonDefaults.INSTANCE, segmentedButtonColorsColors.m2333borderColorWaAFU9c$material3_release(z3, z), 0.0f, 2, null);
                    i4 &= -29360129;
                } else {
                    borderStrokeM2349borderStrokel07J4OM$default = borderStroke;
                }
                if (i7 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-773603666);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    mutableInteractionSource2 = mutableInteractionSource;
                }
                if (i9 != 0) {
                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 970447394, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt.SegmentedButton.2
                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i113) {
                            if ((i113 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(970447394, i113, -1, "androidx.compose.material3.SegmentedButton.<anonymous> (SegmentedButton.kt:139)");
                            }
                            SegmentedButtonDefaults.INSTANCE.Icon(z, null, null, composer3, 3072, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }
                    });
                } else {
                    composableLambda = function2;
                }
                function4 = composableLambda;
                mutableInteractionSource3 = mutableInteractionSource2;
                modifier2 = companion;
                segmentedButtonColors2 = segmentedButtonColorsColors;
                borderStroke2 = borderStrokeM2349borderStrokel07J4OM$default;
            }
            boolean z11 = z3;
            i13 = i4;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1596038053, i13, i11, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:141)");
            }
            int i113 = (i13 >> 24) & 14;
            SegmentedButtonColors segmentedButtonColors10 = segmentedButtonColors2;
            Function2<? super Composer, ? super Integer, Unit> function12 = function4;
            composer2 = composerStartRestartGroup;
            SurfaceKt.m2508Surfaced85dljk(z, function1, SizeKt.m1031defaultMinSizeVpY3zN4(interactionZIndex(RowScope.weight$default(multiChoiceSegmentedButtonRowScope, modifier2, 1.0f, false, 2, null), z, interactionCountAsState(mutableInteractionSource3, composerStartRestartGroup, i113)), ButtonDefaults.INSTANCE.m1806getMinWidthD9Ej5fM(), ButtonDefaults.INSTANCE.m1805getMinHeightD9Ej5fM()), z11, shape, segmentedButtonColors2.m2334containerColorWaAFU9c$material3_release(z11, z), segmentedButtonColors2.m2335contentColorWaAFU9c$material3_release(z11, z), 0.0f, 0.0f, borderStroke2, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1635710341, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt.SegmentedButton.3
                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i114) {
                    if ((i114 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1635710341, i114, -1, "androidx.compose.material3.SegmentedButton.<anonymous> (SegmentedButton.kt:163)");
                    }
                    SegmentedButtonKt.SegmentedButtonContent(function4, function3, composer3, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }
            }), composer2, ((i13 >> 3) & 126) | ((i13 >> 6) & 7168) | ((i13 << 3) & 57344) | ((i13 << 6) & 1879048192), i113 | 48, 384);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            segmentedButtonColors3 = segmentedButtonColors10;
            z4 = z11;
            modifier3 = modifier2;
            borderStroke3 = borderStroke2;
            mutableInteractionSource4 = mutableInteractionSource3;
            function5 = function12;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt.SegmentedButton.4
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

                public final void invoke(Composer composer3, int i114) {
                    SegmentedButtonKt.SegmentedButton(multiChoiceSegmentedButtonRowScope, z, function1, shape, modifier3, z4, segmentedButtonColors3, borderStroke3, mutableInteractionSource4, function5, function3, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0118  */
    /* JADX WARN: Code duplicated, block: B:102:0x011e  */
    /* JADX WARN: Code duplicated, block: B:103:0x0121  */
    /* JADX WARN: Code duplicated, block: B:107:0x0129  */
    /* JADX WARN: Code duplicated, block: B:108:0x012c  */
    /* JADX WARN: Code duplicated, block: B:110:0x0130  */
    /* JADX WARN: Code duplicated, block: B:112:0x0136  */
    /* JADX WARN: Code duplicated, block: B:113:0x0138  */
    /* JADX WARN: Code duplicated, block: B:115:0x013c  */
    /* JADX WARN: Code duplicated, block: B:118:0x0148  */
    /* JADX WARN: Code duplicated, block: B:123:0x0165  */
    /* JADX WARN: Code duplicated, block: B:125:0x0171  */
    /* JADX WARN: Code duplicated, block: B:135:0x0199 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:136:0x019b  */
    /* JADX WARN: Code duplicated, block: B:137:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:139:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:142:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:143:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:146:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:147:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:149:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:151:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:153:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:155:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:156:0x0204  */
    /* JADX WARN: Code duplicated, block: B:160:0x0218  */
    /* JADX WARN: Code duplicated, block: B:163:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:167:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:169:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x009a  */
    /* JADX WARN: Code duplicated, block: B:57:0x009c  */
    /* JADX WARN: Code duplicated, block: B:59:0x009f  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:90:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:92:0x0100  */
    /* JADX WARN: Code duplicated, block: B:93:0x0103  */
    /* JADX WARN: Code duplicated, block: B:97:0x010d  */
    /* JADX WARN: Code duplicated, block: B:98:0x0112  */
    public static final void SegmentedButton(final SingleChoiceSegmentedButtonRowScope singleChoiceSegmentedButtonRowScope, final boolean z, final Function0<Unit> function0, final Shape shape, Modifier modifier, boolean z2, SegmentedButtonColors segmentedButtonColors, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        boolean z3;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Modifier.Companion companion;
        SegmentedButtonColors segmentedButtonColorsColors;
        BorderStroke borderStrokeM2349borderStrokel07J4OM$default;
        MutableInteractionSource mutableInteractionSource2;
        ComposableLambda composableLambda;
        final Function2<? super Composer, ? super Integer, Unit> function4;
        MutableInteractionSource mutableInteractionSource3;
        Modifier modifier2;
        SegmentedButtonColors segmentedButtonColors2;
        BorderStroke borderStroke2;
        Object objRememberedValue;
        int i13;
        Composer composer2;
        final SegmentedButtonColors segmentedButtonColors3;
        final boolean z4;
        final Modifier modifier3;
        final BorderStroke borderStroke3;
        final MutableInteractionSource mutableInteractionSource4;
        final Function2<? super Composer, ? super Integer, Unit> function5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i14;
        int i15;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1016574361);
        if ((Integer.MIN_VALUE & i3) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(singleChoiceSegmentedButtonRowScope) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 1) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i3 & 2) != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i3 & 4) != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            i4 |= composerStartRestartGroup.changed(shape) ? 2048 : 1024;
        }
        int i16 = i3 & 8;
        if (i16 == 0) {
            if ((i & 24576) == 0) {
                i4 |= composerStartRestartGroup.changed(modifier) ? 16384 : 8192;
            }
            i5 = i3 & 16;
            if (i5 != 0) {
                if ((196608 & i) == 0) {
                    z3 = z2;
                    if (composerStartRestartGroup.changed(z3)) {
                        i6 = 131072;
                    } else {
                        i6 = 65536;
                    }
                    i4 |= i6;
                }
                if ((i & 1572864) != 0) {
                    if ((i3 & 32) == 0 || !composerStartRestartGroup.changed(segmentedButtonColors)) {
                        i15 = 524288;
                    } else {
                        i15 = 1048576;
                    }
                    i4 |= i15;
                }
                if ((i & 12582912) != 0) {
                    if ((i3 & 64) == 0 || !composerStartRestartGroup.changed(borderStroke)) {
                        i14 = 4194304;
                    } else {
                        i14 = 8388608;
                    }
                    i4 |= i14;
                }
                i7 = i3 & 128;
                if (i7 != 0) {
                    i4 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                        i8 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i8 = 33554432;
                    }
                    i4 |= i8;
                }
                i9 = i3 & 256;
                if (i9 != 0) {
                    i4 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i10 = 536870912;
                    } else {
                        i10 = 268435456;
                    }
                    i4 |= i10;
                }
                if ((i3 & 512) != 0) {
                    i11 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (composerStartRestartGroup.changedInstance(function3)) {
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
                        if (i16 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if (i5 != 0) {
                            z3 = true;
                        }
                        if ((i3 & 32) != 0) {
                            segmentedButtonColorsColors = SegmentedButtonDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                            i4 &= -3670017;
                        } else {
                            segmentedButtonColorsColors = segmentedButtonColors;
                        }
                        if ((i3 & 64) != 0) {
                            borderStrokeM2349borderStrokel07J4OM$default = SegmentedButtonDefaults.m2349borderStrokel07J4OM$default(SegmentedButtonDefaults.INSTANCE, segmentedButtonColorsColors.m2333borderColorWaAFU9c$material3_release(z3, z), 0.0f, 2, null);
                            i4 &= -29360129;
                        } else {
                            borderStrokeM2349borderStrokel07J4OM$default = borderStroke;
                        }
                        if (i7 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-773600241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if (i9 != 0) {
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1235063168, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt.SegmentedButton.6
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i17) {
                                    if ((i17 & 3) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1235063168, i17, -1, "androidx.compose.material3.SegmentedButton.<anonymous> (SegmentedButton.kt:214)");
                                    }
                                    SegmentedButtonDefaults.INSTANCE.Icon(z, null, null, composer3, 3072, 6);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }
                            });
                        } else {
                            composableLambda = function2;
                        }
                        function4 = composableLambda;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        modifier2 = companion;
                        segmentedButtonColors2 = segmentedButtonColorsColors;
                        borderStroke2 = borderStrokeM2349borderStrokel07J4OM$default;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i3 & 32) != 0) {
                            i4 &= -3670017;
                        }
                        if ((i3 & 64) != 0) {
                            i4 &= -29360129;
                        }
                        modifier2 = modifier;
                        segmentedButtonColors2 = segmentedButtonColors;
                        borderStroke2 = borderStroke;
                        mutableInteractionSource3 = mutableInteractionSource;
                        function4 = function2;
                    }
                    boolean z5 = z3;
                    i13 = i4;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1016574361, i13, i11, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:216)");
                    }
                    int i17 = (i13 >> 24) & 14;
                    SegmentedButtonColors segmentedButtonColors4 = segmentedButtonColors2;
                    Function2<? super Composer, ? super Integer, Unit> function6 = function4;
                    composer2 = composerStartRestartGroup;
                    SurfaceKt.m2507Surfaced85dljk(z, function0, SemanticsModifierKt.semantics$default(SizeKt.m1031defaultMinSizeVpY3zN4(interactionZIndex(RowScope.weight$default(singleChoiceSegmentedButtonRowScope, modifier2, 1.0f, false, 2, null), z, interactionCountAsState(mutableInteractionSource3, composerStartRestartGroup, i17)), ButtonDefaults.INSTANCE.m1806getMinWidthD9Ej5fM(), ButtonDefaults.INSTANCE.m1805getMinHeightD9Ej5fM()), false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt.SegmentedButton.7
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            SemanticsPropertiesKt.m6163setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m6149getRadioButtono7Vup1c());
                        }
                    }, 1, null), z5, shape, segmentedButtonColors2.m2334containerColorWaAFU9c$material3_release(z5, z), segmentedButtonColors2.m2335contentColorWaAFU9c$material3_release(z5, z), 0.0f, 0.0f, borderStroke2, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 383378045, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt.SegmentedButton.8
                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i18) {
                            if ((i18 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(383378045, i18, -1, "androidx.compose.material3.SegmentedButton.<anonymous> (SegmentedButton.kt:239)");
                            }
                            SegmentedButtonKt.SegmentedButtonContent(function4, function3, composer3, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }
                    }), composer2, ((i13 >> 3) & 126) | ((i13 >> 6) & 7168) | ((i13 << 3) & 57344) | ((i13 << 6) & 1879048192), i17 | 48, 384);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    segmentedButtonColors3 = segmentedButtonColors4;
                    z4 = z5;
                    modifier3 = modifier2;
                    borderStroke3 = borderStroke2;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    function5 = function6;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    segmentedButtonColors3 = segmentedButtonColors;
                    borderStroke3 = borderStroke;
                    mutableInteractionSource4 = mutableInteractionSource;
                    function5 = function2;
                    composer2 = composerStartRestartGroup;
                    z4 = z3;
                    modifier3 = modifier;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt.SegmentedButton.9
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

                        public final void invoke(Composer composer3, int i18) {
                            SegmentedButtonKt.SegmentedButton(singleChoiceSegmentedButtonRowScope, z, function0, shape, modifier3, z4, segmentedButtonColors3, borderStroke3, mutableInteractionSource4, function5, function3, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                        }
                    });
                }
            }
            i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            z3 = z2;
            if ((i & 1572864) != 0) {
                if ((i3 & 32) == 0) {
                    i15 = 524288;
                } else {
                    i15 = 524288;
                }
                i4 |= i15;
            }
            if ((i & 12582912) != 0) {
                if ((i3 & 64) == 0) {
                    i14 = 4194304;
                } else {
                    i14 = 4194304;
                }
                i4 |= i14;
            }
            i7 = i3 & 128;
            if (i7 != 0) {
                i4 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                    i8 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i8 = 33554432;
                }
                i4 |= i8;
            }
            i9 = i3 & 256;
            if (i9 != 0) {
                i4 |= 805306368;
            } else if ((i & 805306368) == 0) {
                if (composerStartRestartGroup.changedInstance(function2)) {
                    i10 = 536870912;
                } else {
                    i10 = 268435456;
                }
                i4 |= i10;
            }
            if ((i3 & 512) != 0) {
                i11 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                if (composerStartRestartGroup.changedInstance(function3)) {
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
                    if (i16 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i5 != 0) {
                        z3 = true;
                    }
                    if ((i3 & 32) != 0) {
                        segmentedButtonColorsColors = SegmentedButtonDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                        i4 &= -3670017;
                    } else {
                        segmentedButtonColorsColors = segmentedButtonColors;
                    }
                    if ((i3 & 64) != 0) {
                        borderStrokeM2349borderStrokel07J4OM$default = SegmentedButtonDefaults.m2349borderStrokel07J4OM$default(SegmentedButtonDefaults.INSTANCE, segmentedButtonColorsColors.m2333borderColorWaAFU9c$material3_release(z3, z), 0.0f, 2, null);
                        i4 &= -29360129;
                    } else {
                        borderStrokeM2349borderStrokel07J4OM$default = borderStroke;
                    }
                    if (i7 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-773600241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if (i9 != 0) {
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1235063168, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt.SegmentedButton.6
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i18) {
                                if ((i18 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1235063168, i18, -1, "androidx.compose.material3.SegmentedButton.<anonymous> (SegmentedButton.kt:214)");
                                }
                                SegmentedButtonDefaults.INSTANCE.Icon(z, null, null, composer3, 3072, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }
                        });
                    } else {
                        composableLambda = function2;
                    }
                    function4 = composableLambda;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    modifier2 = companion;
                    segmentedButtonColors2 = segmentedButtonColorsColors;
                    borderStroke2 = borderStrokeM2349borderStrokel07J4OM$default;
                } else {
                    if (i16 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i5 != 0) {
                        z3 = true;
                    }
                    if ((i3 & 32) != 0) {
                        segmentedButtonColorsColors = SegmentedButtonDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                        i4 &= -3670017;
                    } else {
                        segmentedButtonColorsColors = segmentedButtonColors;
                    }
                    if ((i3 & 64) != 0) {
                        borderStrokeM2349borderStrokel07J4OM$default = SegmentedButtonDefaults.m2349borderStrokel07J4OM$default(SegmentedButtonDefaults.INSTANCE, segmentedButtonColorsColors.m2333borderColorWaAFU9c$material3_release(z3, z), 0.0f, 2, null);
                        i4 &= -29360129;
                    } else {
                        borderStrokeM2349borderStrokel07J4OM$default = borderStroke;
                    }
                    if (i7 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-773600241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if (i9 != 0) {
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1235063168, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt.SegmentedButton.6
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i18) {
                                if ((i18 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1235063168, i18, -1, "androidx.compose.material3.SegmentedButton.<anonymous> (SegmentedButton.kt:214)");
                                }
                                SegmentedButtonDefaults.INSTANCE.Icon(z, null, null, composer3, 3072, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }
                        });
                    } else {
                        composableLambda = function2;
                    }
                    function4 = composableLambda;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    modifier2 = companion;
                    segmentedButtonColors2 = segmentedButtonColorsColors;
                    borderStroke2 = borderStrokeM2349borderStrokel07J4OM$default;
                }
                boolean z6 = z3;
                i13 = i4;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1016574361, i13, i11, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:216)");
                }
                int i18 = (i13 >> 24) & 14;
                SegmentedButtonColors segmentedButtonColors5 = segmentedButtonColors2;
                Function2<? super Composer, ? super Integer, Unit> function7 = function4;
                composer2 = composerStartRestartGroup;
                SurfaceKt.m2507Surfaced85dljk(z, function0, SemanticsModifierKt.semantics$default(SizeKt.m1031defaultMinSizeVpY3zN4(interactionZIndex(RowScope.weight$default(singleChoiceSegmentedButtonRowScope, modifier2, 1.0f, false, 2, null), z, interactionCountAsState(mutableInteractionSource3, composerStartRestartGroup, i18)), ButtonDefaults.INSTANCE.m1806getMinWidthD9Ej5fM(), ButtonDefaults.INSTANCE.m1805getMinHeightD9Ej5fM()), false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt.SegmentedButton.7
                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        SemanticsPropertiesKt.m6163setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m6149getRadioButtono7Vup1c());
                    }
                }, 1, null), z6, shape, segmentedButtonColors2.m2334containerColorWaAFU9c$material3_release(z6, z), segmentedButtonColors2.m2335contentColorWaAFU9c$material3_release(z6, z), 0.0f, 0.0f, borderStroke2, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 383378045, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt.SegmentedButton.8
                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i19) {
                        if ((i19 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(383378045, i19, -1, "androidx.compose.material3.SegmentedButton.<anonymous> (SegmentedButton.kt:239)");
                        }
                        SegmentedButtonKt.SegmentedButtonContent(function4, function3, composer3, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }
                }), composer2, ((i13 >> 3) & 126) | ((i13 >> 6) & 7168) | ((i13 << 3) & 57344) | ((i13 << 6) & 1879048192), i18 | 48, 384);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                segmentedButtonColors3 = segmentedButtonColors5;
                z4 = z6;
                modifier3 = modifier2;
                borderStroke3 = borderStroke2;
                mutableInteractionSource4 = mutableInteractionSource3;
                function5 = function7;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i16 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i5 != 0) {
                        z3 = true;
                    }
                    if ((i3 & 32) != 0) {
                        segmentedButtonColorsColors = SegmentedButtonDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                        i4 &= -3670017;
                    } else {
                        segmentedButtonColorsColors = segmentedButtonColors;
                    }
                    if ((i3 & 64) != 0) {
                        borderStrokeM2349borderStrokel07J4OM$default = SegmentedButtonDefaults.m2349borderStrokel07J4OM$default(SegmentedButtonDefaults.INSTANCE, segmentedButtonColorsColors.m2333borderColorWaAFU9c$material3_release(z3, z), 0.0f, 2, null);
                        i4 &= -29360129;
                    } else {
                        borderStrokeM2349borderStrokel07J4OM$default = borderStroke;
                    }
                    if (i7 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-773600241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if (i9 != 0) {
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1235063168, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt.SegmentedButton.6
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i19) {
                                if ((i19 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1235063168, i19, -1, "androidx.compose.material3.SegmentedButton.<anonymous> (SegmentedButton.kt:214)");
                                }
                                SegmentedButtonDefaults.INSTANCE.Icon(z, null, null, composer3, 3072, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }
                        });
                    } else {
                        composableLambda = function2;
                    }
                    function4 = composableLambda;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    modifier2 = companion;
                    segmentedButtonColors2 = segmentedButtonColorsColors;
                    borderStroke2 = borderStrokeM2349borderStrokel07J4OM$default;
                } else {
                    if (i16 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i5 != 0) {
                        z3 = true;
                    }
                    if ((i3 & 32) != 0) {
                        segmentedButtonColorsColors = SegmentedButtonDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                        i4 &= -3670017;
                    } else {
                        segmentedButtonColorsColors = segmentedButtonColors;
                    }
                    if ((i3 & 64) != 0) {
                        borderStrokeM2349borderStrokel07J4OM$default = SegmentedButtonDefaults.m2349borderStrokel07J4OM$default(SegmentedButtonDefaults.INSTANCE, segmentedButtonColorsColors.m2333borderColorWaAFU9c$material3_release(z3, z), 0.0f, 2, null);
                        i4 &= -29360129;
                    } else {
                        borderStrokeM2349borderStrokel07J4OM$default = borderStroke;
                    }
                    if (i7 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-773600241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if (i9 != 0) {
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1235063168, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt.SegmentedButton.6
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i19) {
                                if ((i19 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1235063168, i19, -1, "androidx.compose.material3.SegmentedButton.<anonymous> (SegmentedButton.kt:214)");
                                }
                                SegmentedButtonDefaults.INSTANCE.Icon(z, null, null, composer3, 3072, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }
                        });
                    } else {
                        composableLambda = function2;
                    }
                    function4 = composableLambda;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    modifier2 = companion;
                    segmentedButtonColors2 = segmentedButtonColorsColors;
                    borderStroke2 = borderStrokeM2349borderStrokel07J4OM$default;
                }
                boolean z7 = z3;
                i13 = i4;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1016574361, i13, i11, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:216)");
                }
                int i19 = (i13 >> 24) & 14;
                SegmentedButtonColors segmentedButtonColors6 = segmentedButtonColors2;
                Function2<? super Composer, ? super Integer, Unit> function8 = function4;
                composer2 = composerStartRestartGroup;
                SurfaceKt.m2507Surfaced85dljk(z, function0, SemanticsModifierKt.semantics$default(SizeKt.m1031defaultMinSizeVpY3zN4(interactionZIndex(RowScope.weight$default(singleChoiceSegmentedButtonRowScope, modifier2, 1.0f, false, 2, null), z, interactionCountAsState(mutableInteractionSource3, composerStartRestartGroup, i19)), ButtonDefaults.INSTANCE.m1806getMinWidthD9Ej5fM(), ButtonDefaults.INSTANCE.m1805getMinHeightD9Ej5fM()), false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt.SegmentedButton.7
                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        SemanticsPropertiesKt.m6163setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m6149getRadioButtono7Vup1c());
                    }
                }, 1, null), z7, shape, segmentedButtonColors2.m2334containerColorWaAFU9c$material3_release(z7, z), segmentedButtonColors2.m2335contentColorWaAFU9c$material3_release(z7, z), 0.0f, 0.0f, borderStroke2, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 383378045, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt.SegmentedButton.8
                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i110) {
                        if ((i110 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(383378045, i110, -1, "androidx.compose.material3.SegmentedButton.<anonymous> (SegmentedButton.kt:239)");
                        }
                        SegmentedButtonKt.SegmentedButtonContent(function4, function3, composer3, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }
                }), composer2, ((i13 >> 3) & 126) | ((i13 >> 6) & 7168) | ((i13 << 3) & 57344) | ((i13 << 6) & 1879048192), i19 | 48, 384);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                segmentedButtonColors3 = segmentedButtonColors6;
                z4 = z7;
                modifier3 = modifier2;
                borderStroke3 = borderStroke2;
                mutableInteractionSource4 = mutableInteractionSource3;
                function5 = function8;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt.SegmentedButton.9
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

                    public final void invoke(Composer composer3, int i110) {
                        SegmentedButtonKt.SegmentedButton(singleChoiceSegmentedButtonRowScope, z, function0, shape, modifier3, z4, segmentedButtonColors3, borderStroke3, mutableInteractionSource4, function5, function3, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                    }
                });
            }
        }
        i4 |= 24576;
        i5 = i3 & 16;
        if (i5 != 0) {
            if ((196608 & i) == 0) {
                z3 = z2;
                if (composerStartRestartGroup.changed(z3)) {
                    i6 = 131072;
                } else {
                    i6 = 65536;
                }
                i4 |= i6;
            }
            if ((i & 1572864) != 0) {
                if ((i3 & 32) == 0) {
                    i15 = 524288;
                } else {
                    i15 = 524288;
                }
                i4 |= i15;
            }
            if ((i & 12582912) != 0) {
                if ((i3 & 64) == 0) {
                    i14 = 4194304;
                } else {
                    i14 = 4194304;
                }
                i4 |= i14;
            }
            i7 = i3 & 128;
            if (i7 != 0) {
                i4 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                    i8 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i8 = 33554432;
                }
                i4 |= i8;
            }
            i9 = i3 & 256;
            if (i9 != 0) {
                i4 |= 805306368;
            } else if ((i & 805306368) == 0) {
                if (composerStartRestartGroup.changedInstance(function2)) {
                    i10 = 536870912;
                } else {
                    i10 = 268435456;
                }
                i4 |= i10;
            }
            if ((i3 & 512) != 0) {
                i11 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                if (composerStartRestartGroup.changedInstance(function3)) {
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
                    if (i16 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i5 != 0) {
                        z3 = true;
                    }
                    if ((i3 & 32) != 0) {
                        segmentedButtonColorsColors = SegmentedButtonDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                        i4 &= -3670017;
                    } else {
                        segmentedButtonColorsColors = segmentedButtonColors;
                    }
                    if ((i3 & 64) != 0) {
                        borderStrokeM2349borderStrokel07J4OM$default = SegmentedButtonDefaults.m2349borderStrokel07J4OM$default(SegmentedButtonDefaults.INSTANCE, segmentedButtonColorsColors.m2333borderColorWaAFU9c$material3_release(z3, z), 0.0f, 2, null);
                        i4 &= -29360129;
                    } else {
                        borderStrokeM2349borderStrokel07J4OM$default = borderStroke;
                    }
                    if (i7 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-773600241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if (i9 != 0) {
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1235063168, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt.SegmentedButton.6
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i110) {
                                if ((i110 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1235063168, i110, -1, "androidx.compose.material3.SegmentedButton.<anonymous> (SegmentedButton.kt:214)");
                                }
                                SegmentedButtonDefaults.INSTANCE.Icon(z, null, null, composer3, 3072, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }
                        });
                    } else {
                        composableLambda = function2;
                    }
                    function4 = composableLambda;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    modifier2 = companion;
                    segmentedButtonColors2 = segmentedButtonColorsColors;
                    borderStroke2 = borderStrokeM2349borderStrokel07J4OM$default;
                } else {
                    if (i16 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i5 != 0) {
                        z3 = true;
                    }
                    if ((i3 & 32) != 0) {
                        segmentedButtonColorsColors = SegmentedButtonDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                        i4 &= -3670017;
                    } else {
                        segmentedButtonColorsColors = segmentedButtonColors;
                    }
                    if ((i3 & 64) != 0) {
                        borderStrokeM2349borderStrokel07J4OM$default = SegmentedButtonDefaults.m2349borderStrokel07J4OM$default(SegmentedButtonDefaults.INSTANCE, segmentedButtonColorsColors.m2333borderColorWaAFU9c$material3_release(z3, z), 0.0f, 2, null);
                        i4 &= -29360129;
                    } else {
                        borderStrokeM2349borderStrokel07J4OM$default = borderStroke;
                    }
                    if (i7 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-773600241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if (i9 != 0) {
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1235063168, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt.SegmentedButton.6
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i110) {
                                if ((i110 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1235063168, i110, -1, "androidx.compose.material3.SegmentedButton.<anonymous> (SegmentedButton.kt:214)");
                                }
                                SegmentedButtonDefaults.INSTANCE.Icon(z, null, null, composer3, 3072, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }
                        });
                    } else {
                        composableLambda = function2;
                    }
                    function4 = composableLambda;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    modifier2 = companion;
                    segmentedButtonColors2 = segmentedButtonColorsColors;
                    borderStroke2 = borderStrokeM2349borderStrokel07J4OM$default;
                }
                boolean z8 = z3;
                i13 = i4;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1016574361, i13, i11, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:216)");
                }
                int i110 = (i13 >> 24) & 14;
                SegmentedButtonColors segmentedButtonColors7 = segmentedButtonColors2;
                Function2<? super Composer, ? super Integer, Unit> function9 = function4;
                composer2 = composerStartRestartGroup;
                SurfaceKt.m2507Surfaced85dljk(z, function0, SemanticsModifierKt.semantics$default(SizeKt.m1031defaultMinSizeVpY3zN4(interactionZIndex(RowScope.weight$default(singleChoiceSegmentedButtonRowScope, modifier2, 1.0f, false, 2, null), z, interactionCountAsState(mutableInteractionSource3, composerStartRestartGroup, i110)), ButtonDefaults.INSTANCE.m1806getMinWidthD9Ej5fM(), ButtonDefaults.INSTANCE.m1805getMinHeightD9Ej5fM()), false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt.SegmentedButton.7
                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        SemanticsPropertiesKt.m6163setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m6149getRadioButtono7Vup1c());
                    }
                }, 1, null), z8, shape, segmentedButtonColors2.m2334containerColorWaAFU9c$material3_release(z8, z), segmentedButtonColors2.m2335contentColorWaAFU9c$material3_release(z8, z), 0.0f, 0.0f, borderStroke2, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 383378045, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt.SegmentedButton.8
                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i111) {
                        if ((i111 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(383378045, i111, -1, "androidx.compose.material3.SegmentedButton.<anonymous> (SegmentedButton.kt:239)");
                        }
                        SegmentedButtonKt.SegmentedButtonContent(function4, function3, composer3, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }
                }), composer2, ((i13 >> 3) & 126) | ((i13 >> 6) & 7168) | ((i13 << 3) & 57344) | ((i13 << 6) & 1879048192), i110 | 48, 384);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                segmentedButtonColors3 = segmentedButtonColors7;
                z4 = z8;
                modifier3 = modifier2;
                borderStroke3 = borderStroke2;
                mutableInteractionSource4 = mutableInteractionSource3;
                function5 = function9;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i16 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i5 != 0) {
                        z3 = true;
                    }
                    if ((i3 & 32) != 0) {
                        segmentedButtonColorsColors = SegmentedButtonDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                        i4 &= -3670017;
                    } else {
                        segmentedButtonColorsColors = segmentedButtonColors;
                    }
                    if ((i3 & 64) != 0) {
                        borderStrokeM2349borderStrokel07J4OM$default = SegmentedButtonDefaults.m2349borderStrokel07J4OM$default(SegmentedButtonDefaults.INSTANCE, segmentedButtonColorsColors.m2333borderColorWaAFU9c$material3_release(z3, z), 0.0f, 2, null);
                        i4 &= -29360129;
                    } else {
                        borderStrokeM2349borderStrokel07J4OM$default = borderStroke;
                    }
                    if (i7 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-773600241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if (i9 != 0) {
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1235063168, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt.SegmentedButton.6
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i111) {
                                if ((i111 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1235063168, i111, -1, "androidx.compose.material3.SegmentedButton.<anonymous> (SegmentedButton.kt:214)");
                                }
                                SegmentedButtonDefaults.INSTANCE.Icon(z, null, null, composer3, 3072, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }
                        });
                    } else {
                        composableLambda = function2;
                    }
                    function4 = composableLambda;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    modifier2 = companion;
                    segmentedButtonColors2 = segmentedButtonColorsColors;
                    borderStroke2 = borderStrokeM2349borderStrokel07J4OM$default;
                } else {
                    if (i16 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i5 != 0) {
                        z3 = true;
                    }
                    if ((i3 & 32) != 0) {
                        segmentedButtonColorsColors = SegmentedButtonDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                        i4 &= -3670017;
                    } else {
                        segmentedButtonColorsColors = segmentedButtonColors;
                    }
                    if ((i3 & 64) != 0) {
                        borderStrokeM2349borderStrokel07J4OM$default = SegmentedButtonDefaults.m2349borderStrokel07J4OM$default(SegmentedButtonDefaults.INSTANCE, segmentedButtonColorsColors.m2333borderColorWaAFU9c$material3_release(z3, z), 0.0f, 2, null);
                        i4 &= -29360129;
                    } else {
                        borderStrokeM2349borderStrokel07J4OM$default = borderStroke;
                    }
                    if (i7 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-773600241);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if (i9 != 0) {
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1235063168, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt.SegmentedButton.6
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i111) {
                                if ((i111 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1235063168, i111, -1, "androidx.compose.material3.SegmentedButton.<anonymous> (SegmentedButton.kt:214)");
                                }
                                SegmentedButtonDefaults.INSTANCE.Icon(z, null, null, composer3, 3072, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }
                        });
                    } else {
                        composableLambda = function2;
                    }
                    function4 = composableLambda;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    modifier2 = companion;
                    segmentedButtonColors2 = segmentedButtonColorsColors;
                    borderStroke2 = borderStrokeM2349borderStrokel07J4OM$default;
                }
                boolean z9 = z3;
                i13 = i4;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1016574361, i13, i11, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:216)");
                }
                int i111 = (i13 >> 24) & 14;
                SegmentedButtonColors segmentedButtonColors8 = segmentedButtonColors2;
                Function2<? super Composer, ? super Integer, Unit> function10 = function4;
                composer2 = composerStartRestartGroup;
                SurfaceKt.m2507Surfaced85dljk(z, function0, SemanticsModifierKt.semantics$default(SizeKt.m1031defaultMinSizeVpY3zN4(interactionZIndex(RowScope.weight$default(singleChoiceSegmentedButtonRowScope, modifier2, 1.0f, false, 2, null), z, interactionCountAsState(mutableInteractionSource3, composerStartRestartGroup, i111)), ButtonDefaults.INSTANCE.m1806getMinWidthD9Ej5fM(), ButtonDefaults.INSTANCE.m1805getMinHeightD9Ej5fM()), false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt.SegmentedButton.7
                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        SemanticsPropertiesKt.m6163setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m6149getRadioButtono7Vup1c());
                    }
                }, 1, null), z9, shape, segmentedButtonColors2.m2334containerColorWaAFU9c$material3_release(z9, z), segmentedButtonColors2.m2335contentColorWaAFU9c$material3_release(z9, z), 0.0f, 0.0f, borderStroke2, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 383378045, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt.SegmentedButton.8
                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i112) {
                        if ((i112 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(383378045, i112, -1, "androidx.compose.material3.SegmentedButton.<anonymous> (SegmentedButton.kt:239)");
                        }
                        SegmentedButtonKt.SegmentedButtonContent(function4, function3, composer3, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }
                }), composer2, ((i13 >> 3) & 126) | ((i13 >> 6) & 7168) | ((i13 << 3) & 57344) | ((i13 << 6) & 1879048192), i111 | 48, 384);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                segmentedButtonColors3 = segmentedButtonColors8;
                z4 = z9;
                modifier3 = modifier2;
                borderStroke3 = borderStroke2;
                mutableInteractionSource4 = mutableInteractionSource3;
                function5 = function10;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt.SegmentedButton.9
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

                    public final void invoke(Composer composer3, int i112) {
                        SegmentedButtonKt.SegmentedButton(singleChoiceSegmentedButtonRowScope, z, function0, shape, modifier3, z4, segmentedButtonColors3, borderStroke3, mutableInteractionSource4, function5, function3, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                    }
                });
            }
        }
        i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        z3 = z2;
        if ((i & 1572864) != 0) {
            if ((i3 & 32) == 0) {
                i15 = 524288;
            } else {
                i15 = 524288;
            }
            i4 |= i15;
        }
        if ((i & 12582912) != 0) {
            if ((i3 & 64) == 0) {
                i14 = 4194304;
            } else {
                i14 = 4194304;
            }
            i4 |= i14;
        }
        i7 = i3 & 128;
        if (i7 != 0) {
            i4 |= 100663296;
        } else if ((i & 100663296) == 0) {
            if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                i8 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
            } else {
                i8 = 33554432;
            }
            i4 |= i8;
        }
        i9 = i3 & 256;
        if (i9 != 0) {
            i4 |= 805306368;
        } else if ((i & 805306368) == 0) {
            if (composerStartRestartGroup.changedInstance(function2)) {
                i10 = 536870912;
            } else {
                i10 = 268435456;
            }
            i4 |= i10;
        }
        if ((i3 & 512) != 0) {
            i11 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            if (composerStartRestartGroup.changedInstance(function3)) {
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
                if (i16 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier;
                }
                if (i5 != 0) {
                    z3 = true;
                }
                if ((i3 & 32) != 0) {
                    segmentedButtonColorsColors = SegmentedButtonDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                    i4 &= -3670017;
                } else {
                    segmentedButtonColorsColors = segmentedButtonColors;
                }
                if ((i3 & 64) != 0) {
                    borderStrokeM2349borderStrokel07J4OM$default = SegmentedButtonDefaults.m2349borderStrokel07J4OM$default(SegmentedButtonDefaults.INSTANCE, segmentedButtonColorsColors.m2333borderColorWaAFU9c$material3_release(z3, z), 0.0f, 2, null);
                    i4 &= -29360129;
                } else {
                    borderStrokeM2349borderStrokel07J4OM$default = borderStroke;
                }
                if (i7 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-773600241);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    mutableInteractionSource2 = mutableInteractionSource;
                }
                if (i9 != 0) {
                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1235063168, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt.SegmentedButton.6
                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i112) {
                            if ((i112 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1235063168, i112, -1, "androidx.compose.material3.SegmentedButton.<anonymous> (SegmentedButton.kt:214)");
                            }
                            SegmentedButtonDefaults.INSTANCE.Icon(z, null, null, composer3, 3072, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }
                    });
                } else {
                    composableLambda = function2;
                }
                function4 = composableLambda;
                mutableInteractionSource3 = mutableInteractionSource2;
                modifier2 = companion;
                segmentedButtonColors2 = segmentedButtonColorsColors;
                borderStroke2 = borderStrokeM2349borderStrokel07J4OM$default;
            } else {
                if (i16 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier;
                }
                if (i5 != 0) {
                    z3 = true;
                }
                if ((i3 & 32) != 0) {
                    segmentedButtonColorsColors = SegmentedButtonDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                    i4 &= -3670017;
                } else {
                    segmentedButtonColorsColors = segmentedButtonColors;
                }
                if ((i3 & 64) != 0) {
                    borderStrokeM2349borderStrokel07J4OM$default = SegmentedButtonDefaults.m2349borderStrokel07J4OM$default(SegmentedButtonDefaults.INSTANCE, segmentedButtonColorsColors.m2333borderColorWaAFU9c$material3_release(z3, z), 0.0f, 2, null);
                    i4 &= -29360129;
                } else {
                    borderStrokeM2349borderStrokel07J4OM$default = borderStroke;
                }
                if (i7 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-773600241);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    mutableInteractionSource2 = mutableInteractionSource;
                }
                if (i9 != 0) {
                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1235063168, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt.SegmentedButton.6
                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i112) {
                            if ((i112 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1235063168, i112, -1, "androidx.compose.material3.SegmentedButton.<anonymous> (SegmentedButton.kt:214)");
                            }
                            SegmentedButtonDefaults.INSTANCE.Icon(z, null, null, composer3, 3072, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }
                    });
                } else {
                    composableLambda = function2;
                }
                function4 = composableLambda;
                mutableInteractionSource3 = mutableInteractionSource2;
                modifier2 = companion;
                segmentedButtonColors2 = segmentedButtonColorsColors;
                borderStroke2 = borderStrokeM2349borderStrokel07J4OM$default;
            }
            boolean z10 = z3;
            i13 = i4;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1016574361, i13, i11, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:216)");
            }
            int i112 = (i13 >> 24) & 14;
            SegmentedButtonColors segmentedButtonColors9 = segmentedButtonColors2;
            Function2<? super Composer, ? super Integer, Unit> function11 = function4;
            composer2 = composerStartRestartGroup;
            SurfaceKt.m2507Surfaced85dljk(z, function0, SemanticsModifierKt.semantics$default(SizeKt.m1031defaultMinSizeVpY3zN4(interactionZIndex(RowScope.weight$default(singleChoiceSegmentedButtonRowScope, modifier2, 1.0f, false, 2, null), z, interactionCountAsState(mutableInteractionSource3, composerStartRestartGroup, i112)), ButtonDefaults.INSTANCE.m1806getMinWidthD9Ej5fM(), ButtonDefaults.INSTANCE.m1805getMinHeightD9Ej5fM()), false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt.SegmentedButton.7
                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    SemanticsPropertiesKt.m6163setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m6149getRadioButtono7Vup1c());
                }
            }, 1, null), z10, shape, segmentedButtonColors2.m2334containerColorWaAFU9c$material3_release(z10, z), segmentedButtonColors2.m2335contentColorWaAFU9c$material3_release(z10, z), 0.0f, 0.0f, borderStroke2, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 383378045, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt.SegmentedButton.8
                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i113) {
                    if ((i113 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(383378045, i113, -1, "androidx.compose.material3.SegmentedButton.<anonymous> (SegmentedButton.kt:239)");
                    }
                    SegmentedButtonKt.SegmentedButtonContent(function4, function3, composer3, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }
            }), composer2, ((i13 >> 3) & 126) | ((i13 >> 6) & 7168) | ((i13 << 3) & 57344) | ((i13 << 6) & 1879048192), i112 | 48, 384);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            segmentedButtonColors3 = segmentedButtonColors9;
            z4 = z10;
            modifier3 = modifier2;
            borderStroke3 = borderStroke2;
            mutableInteractionSource4 = mutableInteractionSource3;
            function5 = function11;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i16 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier;
                }
                if (i5 != 0) {
                    z3 = true;
                }
                if ((i3 & 32) != 0) {
                    segmentedButtonColorsColors = SegmentedButtonDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                    i4 &= -3670017;
                } else {
                    segmentedButtonColorsColors = segmentedButtonColors;
                }
                if ((i3 & 64) != 0) {
                    borderStrokeM2349borderStrokel07J4OM$default = SegmentedButtonDefaults.m2349borderStrokel07J4OM$default(SegmentedButtonDefaults.INSTANCE, segmentedButtonColorsColors.m2333borderColorWaAFU9c$material3_release(z3, z), 0.0f, 2, null);
                    i4 &= -29360129;
                } else {
                    borderStrokeM2349borderStrokel07J4OM$default = borderStroke;
                }
                if (i7 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-773600241);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    mutableInteractionSource2 = mutableInteractionSource;
                }
                if (i9 != 0) {
                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1235063168, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt.SegmentedButton.6
                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i113) {
                            if ((i113 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1235063168, i113, -1, "androidx.compose.material3.SegmentedButton.<anonymous> (SegmentedButton.kt:214)");
                            }
                            SegmentedButtonDefaults.INSTANCE.Icon(z, null, null, composer3, 3072, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }
                    });
                } else {
                    composableLambda = function2;
                }
                function4 = composableLambda;
                mutableInteractionSource3 = mutableInteractionSource2;
                modifier2 = companion;
                segmentedButtonColors2 = segmentedButtonColorsColors;
                borderStroke2 = borderStrokeM2349borderStrokel07J4OM$default;
            } else {
                if (i16 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier;
                }
                if (i5 != 0) {
                    z3 = true;
                }
                if ((i3 & 32) != 0) {
                    segmentedButtonColorsColors = SegmentedButtonDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                    i4 &= -3670017;
                } else {
                    segmentedButtonColorsColors = segmentedButtonColors;
                }
                if ((i3 & 64) != 0) {
                    borderStrokeM2349borderStrokel07J4OM$default = SegmentedButtonDefaults.m2349borderStrokel07J4OM$default(SegmentedButtonDefaults.INSTANCE, segmentedButtonColorsColors.m2333borderColorWaAFU9c$material3_release(z3, z), 0.0f, 2, null);
                    i4 &= -29360129;
                } else {
                    borderStrokeM2349borderStrokel07J4OM$default = borderStroke;
                }
                if (i7 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-773600241);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    mutableInteractionSource2 = mutableInteractionSource;
                }
                if (i9 != 0) {
                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1235063168, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt.SegmentedButton.6
                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i113) {
                            if ((i113 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1235063168, i113, -1, "androidx.compose.material3.SegmentedButton.<anonymous> (SegmentedButton.kt:214)");
                            }
                            SegmentedButtonDefaults.INSTANCE.Icon(z, null, null, composer3, 3072, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }
                    });
                } else {
                    composableLambda = function2;
                }
                function4 = composableLambda;
                mutableInteractionSource3 = mutableInteractionSource2;
                modifier2 = companion;
                segmentedButtonColors2 = segmentedButtonColorsColors;
                borderStroke2 = borderStrokeM2349borderStrokel07J4OM$default;
            }
            boolean z11 = z3;
            i13 = i4;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1016574361, i13, i11, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:216)");
            }
            int i113 = (i13 >> 24) & 14;
            SegmentedButtonColors segmentedButtonColors10 = segmentedButtonColors2;
            Function2<? super Composer, ? super Integer, Unit> function12 = function4;
            composer2 = composerStartRestartGroup;
            SurfaceKt.m2507Surfaced85dljk(z, function0, SemanticsModifierKt.semantics$default(SizeKt.m1031defaultMinSizeVpY3zN4(interactionZIndex(RowScope.weight$default(singleChoiceSegmentedButtonRowScope, modifier2, 1.0f, false, 2, null), z, interactionCountAsState(mutableInteractionSource3, composerStartRestartGroup, i113)), ButtonDefaults.INSTANCE.m1806getMinWidthD9Ej5fM(), ButtonDefaults.INSTANCE.m1805getMinHeightD9Ej5fM()), false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt.SegmentedButton.7
                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    SemanticsPropertiesKt.m6163setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m6149getRadioButtono7Vup1c());
                }
            }, 1, null), z11, shape, segmentedButtonColors2.m2334containerColorWaAFU9c$material3_release(z11, z), segmentedButtonColors2.m2335contentColorWaAFU9c$material3_release(z11, z), 0.0f, 0.0f, borderStroke2, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 383378045, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt.SegmentedButton.8
                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i114) {
                    if ((i114 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(383378045, i114, -1, "androidx.compose.material3.SegmentedButton.<anonymous> (SegmentedButton.kt:239)");
                    }
                    SegmentedButtonKt.SegmentedButtonContent(function4, function3, composer3, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }
            }), composer2, ((i13 >> 3) & 126) | ((i13 >> 6) & 7168) | ((i13 << 3) & 57344) | ((i13 << 6) & 1879048192), i113 | 48, 384);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            segmentedButtonColors3 = segmentedButtonColors10;
            z4 = z11;
            modifier3 = modifier2;
            borderStroke3 = borderStroke2;
            mutableInteractionSource4 = mutableInteractionSource3;
            function5 = function12;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt.SegmentedButton.9
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

                public final void invoke(Composer composer3, int i114) {
                    SegmentedButtonKt.SegmentedButton(singleChoiceSegmentedButtonRowScope, z, function0, shape, modifier3, z4, segmentedButtonColors3, borderStroke3, mutableInteractionSource4, function5, function3, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                }
            });
        }
    }

    /* JADX INFO: renamed from: SingleChoiceSegmentedButtonRow-uFdPcIQ, reason: not valid java name */
    public static final void m2355SingleChoiceSegmentedButtonRowuFdPcIQ(Modifier modifier, float f, final Function3<? super SingleChoiceSegmentedButtonRowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1520863498);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(f) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function3) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (i5 != 0) {
                f = SegmentedButtonDefaults.INSTANCE.m2352getBorderWidthD9Ej5fM();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1520863498, i3, -1, "androidx.compose.material3.SingleChoiceSegmentedButtonRow (SegmentedButton.kt:265)");
            }
            Modifier modifierWidth = IntrinsicKt.width(SizeKt.m1032defaultMinSizeVpY3zN4$default(SelectableGroupKt.selectableGroup(modifier), 0.0f, OutlinedSegmentedButtonTokens.INSTANCE.m3191getContainerHeightD9Ej5fM(), 1, null), IntrinsicSize.Min);
            Arrangement.HorizontalOrVertical horizontalOrVerticalM882spacedBy0680j_4 = Arrangement.INSTANCE.m882spacedBy0680j_4(Dp.m6935constructorimpl(-f));
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalOrVerticalM882spacedBy0680j_4, centerVertically, composerStartRestartGroup, 48);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierWidth);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3536constructorimpl = Updater.m3536constructorimpl(composerStartRestartGroup);
            Updater.m3543setimpl(composerM3536constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3543setimpl(composerM3536constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3536constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3536constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3536constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3536constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            function3ModifierMaterializerOf.invoke(SkippableUpdater.m3506boximpl(SkippableUpdater.m3507constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(-181589424);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new SingleChoiceSegmentedButtonScopeWrapper(rowScopeInstance);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            function3.invoke((SingleChoiceSegmentedButtonScopeWrapper) objRememberedValue, composerStartRestartGroup, Integer.valueOf(((i3 >> 3) & 112) | 6));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        final float f2 = f;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt$SingleChoiceSegmentedButtonRow$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i6) {
                    SegmentedButtonKt.m2355SingleChoiceSegmentedButtonRowuFdPcIQ(modifier2, f2, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: MultiChoiceSegmentedButtonRow-uFdPcIQ, reason: not valid java name */
    public static final void m2354MultiChoiceSegmentedButtonRowuFdPcIQ(Modifier modifier, float f, final Function3<? super MultiChoiceSegmentedButtonRowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(155922315);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(f) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function3) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (i5 != 0) {
                f = SegmentedButtonDefaults.INSTANCE.m2352getBorderWidthD9Ej5fM();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(155922315, i3, -1, "androidx.compose.material3.MultiChoiceSegmentedButtonRow (SegmentedButton.kt:303)");
            }
            Modifier modifierWidth = IntrinsicKt.width(SizeKt.m1032defaultMinSizeVpY3zN4$default(modifier, 0.0f, OutlinedSegmentedButtonTokens.INSTANCE.m3191getContainerHeightD9Ej5fM(), 1, null), IntrinsicSize.Min);
            Arrangement.HorizontalOrVertical horizontalOrVerticalM882spacedBy0680j_4 = Arrangement.INSTANCE.m882spacedBy0680j_4(Dp.m6935constructorimpl(-f));
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalOrVerticalM882spacedBy0680j_4, centerVertically, composerStartRestartGroup, 48);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierWidth);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3536constructorimpl = Updater.m3536constructorimpl(composerStartRestartGroup);
            Updater.m3543setimpl(composerM3536constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3543setimpl(composerM3536constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3536constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3536constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3536constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3536constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            function3ModifierMaterializerOf.invoke(SkippableUpdater.m3506boximpl(SkippableUpdater.m3507constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(573415834);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new MultiChoiceSegmentedButtonScopeWrapper(rowScopeInstance);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            function3.invoke((MultiChoiceSegmentedButtonScopeWrapper) objRememberedValue, composerStartRestartGroup, Integer.valueOf(((i3 >> 3) & 112) | 6));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        final float f2 = f;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt$MultiChoiceSegmentedButtonRow$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i6) {
                    SegmentedButtonKt.m2354MultiChoiceSegmentedButtonRowuFdPcIQ(modifier2, f2, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SegmentedButtonContent(final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function3, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1464121570);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function3) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1464121570, i2, -1, "androidx.compose.material3.SegmentedButtonContent (SegmentedButton.kt:321)");
            }
            Alignment center = Alignment.INSTANCE.getCenter();
            Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, ButtonDefaults.INSTANCE.getTextButtonContentPadding());
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierPadding);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3536constructorimpl = Updater.m3536constructorimpl(composerStartRestartGroup);
            Updater.m3543setimpl(composerM3536constructorimpl, measurePolicyRememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3543setimpl(composerM3536constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3536constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3536constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3536constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3536constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            function3ModifierMaterializerOf.invoke(SkippableUpdater.m3506boximpl(SkippableUpdater.m3507constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            TextKt.ProvideTextStyle(TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6), OutlinedSegmentedButtonTokens.INSTANCE.getLabelTextFont()), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1420592651, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt$SegmentedButtonContent$1$1
                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1420592651, i3, -1, "androidx.compose.material3.SegmentedButtonContent.<anonymous>.<anonymous> (SegmentedButton.kt:329)");
                        }
                        composer2.startReplaceableGroup(773894976);
                        composer2.startReplaceableGroup(-492369756);
                        Object objRememberedValue = composer2.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2));
                            composer2.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                            objRememberedValue = compositionScopedCoroutineScopeCanceller;
                        }
                        composer2.endReplaceableGroup();
                        CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                        composer2.endReplaceableGroup();
                        composer2.startReplaceableGroup(-1468900584);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new SegmentedButtonContentMeasurePolicy(coroutineScope);
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceableGroup();
                        Modifier modifierHeight = IntrinsicKt.height(Modifier.INSTANCE, IntrinsicSize.Min);
                        List listListOf = CollectionsKt.listOf((Object[]) new Function2[]{function2, function3});
                        composer2.startReplaceableGroup(1399185516);
                        Function2<Composer, Integer, Unit> function2CombineAsVirtualLayouts = LayoutKt.combineAsVirtualLayouts(listListOf);
                        composer2.startReplaceableGroup(1157296644);
                        SegmentedButtonContentMeasurePolicy segmentedButtonContentMeasurePolicy = (SegmentedButtonContentMeasurePolicy) objRememberedValue2;
                        boolean zChanged = composer2.changed(segmentedButtonContentMeasurePolicy);
                        Object objRememberedValue3 = composer2.rememberedValue();
                        if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = MultiContentMeasurePolicyKt.createMeasurePolicy(segmentedButtonContentMeasurePolicy);
                            composer2.updateRememberedValue(objRememberedValue3);
                        }
                        composer2.endReplaceableGroup();
                        MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue3;
                        composer2.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierHeight);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor2);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM3536constructorimpl2 = Updater.m3536constructorimpl(composer2);
                        Updater.m3543setimpl(composerM3536constructorimpl2, measurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3543setimpl(composerM3536constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (composerM3536constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3536constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM3536constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM3536constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        function3ModifierMaterializerOf2.invoke(SkippableUpdater.m3506boximpl(SkippableUpdater.m3507constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        function2CombineAsVirtualLayouts.invoke(composer2, 0);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }
            }), composerStartRestartGroup, 48);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt.SegmentedButtonContent.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    SegmentedButtonKt.SegmentedButtonContent(function2, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    private static final State<Integer> interactionCountAsState(InteractionSource interactionSource, Composer composer, int i) {
        composer.startReplaceableGroup(281890131);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(281890131, i, -1, "androidx.compose.material3.interactionCountAsState (SegmentedButton.kt:398)");
        }
        composer.startReplaceableGroup(-1372284393);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotIntStateKt.mutableIntStateOf(0);
            composer.updateRememberedValue(objRememberedValue);
        }
        MutableIntState mutableIntState = (MutableIntState) objRememberedValue;
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(-1372284334);
        int i2 = i & 14;
        boolean z = ((i2 ^ 6) > 4 && composer.changed(interactionSource)) || (i & 6) == 4;
        SegmentedButtonKt$interactionCountAsState$1$1 segmentedButtonKt$interactionCountAsState$1$1RememberedValue = composer.rememberedValue();
        if (z || segmentedButtonKt$interactionCountAsState$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
            segmentedButtonKt$interactionCountAsState$1$1RememberedValue = new SegmentedButtonKt$interactionCountAsState$1$1(interactionSource, mutableIntState, null);
            composer.updateRememberedValue(segmentedButtonKt$interactionCountAsState$1$1RememberedValue);
        }
        composer.endReplaceableGroup();
        EffectsKt.LaunchedEffect(interactionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) segmentedButtonKt$interactionCountAsState$1$1RememberedValue, composer, i2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return mutableIntState;
    }

    private static final Modifier interactionZIndex(Modifier modifier, final boolean z, final State<Integer> state) {
        return LayoutModifierKt.layout(modifier, new Function3<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: androidx.compose.material3.SegmentedButtonKt.interactionZIndex.1
            @Override // kotlin.jvm.functions.Function3
            public final /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
                return m2356invoke3p2s80s(measureScope, measurable, constraints.getValue());
            }

            /* JADX INFO: renamed from: invoke-3p2s80s, reason: not valid java name */
            public final MeasureResult m2356invoke3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
                final Placeable placeableMo5637measureBRTryo0 = measurable.mo5637measureBRTryo0(j);
                int width = placeableMo5637measureBRTryo0.getWidth();
                int height = placeableMo5637measureBRTryo0.getHeight();
                final State<Integer> state2 = state;
                final boolean z2 = z;
                return MeasureScope.layout$default(measureScope, width, height, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.SegmentedButtonKt.interactionZIndex.1.1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                        invoke2(placementScope);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Placeable.PlacementScope placementScope) {
                        placementScope.place(placeableMo5637measureBRTryo0, 0, 0, state2.getValue().floatValue() + (z2 ? 5.0f : 0.0f));
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }
                }, 4, null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }
        });
    }
}
