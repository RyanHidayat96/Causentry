package androidx.compose.material3;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.compose.ui.window.PopupProperties;
import androidx.compose.ui.window.SecureFlagPolicy;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001an\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u001c\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u000f¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001ad\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\r2\u001c\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u000f¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u008e\u0001\u0010\u0017\u001a\u00020\u00012\u0011\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u00112\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005¢\u0006\u0002\b\u00112\u0015\b\u0002\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005¢\u0006\u0002\b\u00112\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"H\u0007¢\u0006\u0002\u0010#\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"DropdownMenu", "", "expanded", "", "onDismissRequest", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", TypedValues.CycleType.S_WAVE_OFFSET, "Landroidx/compose/ui/unit/DpOffset;", "scrollState", "Landroidx/compose/foundation/ScrollState;", "properties", "Landroidx/compose/ui/window/PopupProperties;", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "DropdownMenu-4kj-_NE", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;JLandroidx/compose/foundation/ScrollState;Landroidx/compose/ui/window/PopupProperties;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "DropdownMenu-ILWXrKs", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/window/PopupProperties;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "DropdownMenuItem", "text", "onClick", "leadingIcon", "trailingIcon", "enabled", "colors", "Landroidx/compose/material3/MenuItemColors;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/material3/MenuItemColors;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class AndroidMenu_androidKt {
    /* JADX WARN: Code duplicated, block: B:100:0x014b  */
    /* JADX WARN: Code duplicated, block: B:104:0x0160  */
    /* JADX WARN: Code duplicated, block: B:107:0x017b  */
    /* JADX WARN: Code duplicated, block: B:110:0x019d  */
    /* JADX WARN: Code duplicated, block: B:112:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:114:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:117:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:118:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:121:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:123:0x0204  */
    /* JADX WARN: Code duplicated, block: B:127:0x025f  */
    /* JADX WARN: Code duplicated, block: B:131:0x026d  */
    /* JADX WARN: Code duplicated, block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0061  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:46:0x007c  */
    /* JADX WARN: Code duplicated, block: B:54:0x0091  */
    /* JADX WARN: Code duplicated, block: B:57:0x0099  */
    /* JADX WARN: Code duplicated, block: B:58:0x009b  */
    /* JADX WARN: Code duplicated, block: B:60:0x009e  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:89:0x0106 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:90:0x0108  */
    /* JADX WARN: Code duplicated, block: B:91:0x010d  */
    /* JADX WARN: Code duplicated, block: B:93:0x0110  */
    /* JADX WARN: Code duplicated, block: B:96:0x0122  */
    /* JADX WARN: Code duplicated, block: B:97:0x0129  */
    /* JADX WARN: Code duplicated, block: B:99:0x012e  */
    /* JADX INFO: renamed from: DropdownMenu-4kj-_NE, reason: not valid java name */
    public static final void m1756DropdownMenu4kj_NE(final boolean z, final Function0<Unit> function0, Modifier modifier, long j, ScrollState scrollState, PopupProperties popupProperties, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        long jM6956DpOffsetYgX7TsA;
        int i5;
        int i6;
        PopupProperties popupProperties2;
        int i7;
        int i8;
        Modifier.Companion companion;
        ScrollState scrollStateRememberScrollState;
        int i9;
        ScrollState scrollState2;
        ScrollState scrollState3;
        PopupProperties popupProperties3;
        long j2;
        Modifier modifier3;
        Object objRememberedValue;
        final MutableTransitionState mutableTransitionState;
        Object objRememberedValue2;
        final MutableState mutableState;
        Density density;
        boolean z2;
        boolean zChanged;
        Object objRememberedValue3;
        final Modifier modifier4;
        final long j3;
        final ScrollState scrollState4;
        final PopupProperties popupProperties4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1137929566);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i10 = i2 & 4;
        if (i10 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                i3 |= 3072;
                jM6956DpOffsetYgX7TsA = j;
            } else {
                jM6956DpOffsetYgX7TsA = j;
                if ((i & 3072) == 0) {
                    if (composerStartRestartGroup.changed(jM6956DpOffsetYgX7TsA)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
            }
            if ((i & 24576) != 0) {
                i3 |= ((i2 & 16) == 0 || !composerStartRestartGroup.changed(scrollState)) ? 8192 : 16384;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    popupProperties2 = popupProperties;
                    if (composerStartRestartGroup.changed(popupProperties2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i8 = 1048576;
                    } else {
                        i8 = 524288;
                    }
                    i3 |= i8;
                }
                if ((i3 & 599187) == 599186 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) == 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        i9 = i3;
                        scrollState2 = scrollState;
                    } else {
                        if (i10 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier2;
                        }
                        if (i4 != 0) {
                            jM6956DpOffsetYgX7TsA = DpKt.m6956DpOffsetYgX7TsA(Dp.m6935constructorimpl(0.0f), Dp.m6935constructorimpl(0.0f));
                        }
                        if ((i2 & 16) != 0) {
                            scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                            i3 &= -57345;
                        } else {
                            scrollStateRememberScrollState = scrollState;
                        }
                        if (i6 != 0) {
                            scrollState3 = scrollStateRememberScrollState;
                            popupProperties3 = new PopupProperties(true, false, false, (SecureFlagPolicy) null, false, false, 62, (DefaultConstructorMarker) null);
                            j2 = jM6956DpOffsetYgX7TsA;
                            modifier3 = companion;
                        } else {
                            Modifier modifier5 = companion;
                            i9 = i3;
                            scrollState2 = scrollStateRememberScrollState;
                            modifier2 = modifier5;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1137929566, i3, -1, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:91)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(463006278);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new MutableTransitionState(Boolean.FALSE);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        mutableTransitionState = (MutableTransitionState) objRememberedValue;
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableTransitionState.setTargetState$animation_core_release(Boolean.valueOf(z));
                        if (!((Boolean) mutableTransitionState.getCurrentState()).booleanValue() || ((Boolean) mutableTransitionState.getTargetState()).booleanValue()) {
                            composerStartRestartGroup.startReplaceableGroup(463006465);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TransformOrigin.m4614boximpl(TransformOrigin.INSTANCE.m4627getCenterSzJe1aQ()), null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            mutableState = (MutableState) objRememberedValue2;
                            composerStartRestartGroup.endReplaceableGroup();
                            density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                            composerStartRestartGroup.startReplaceableGroup(463006596);
                            if ((i3 & 7168) == 2048) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            zChanged = composerStartRestartGroup.changed(density);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (!(z2 | zChanged) || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = new DropdownMenuPositionProvider(j2, density, 0, new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                        invoke2(intRect, intRect2);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(IntRect intRect, IntRect intRect2) {
                                        mutableState.setValue(TransformOrigin.m4614boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }
                                }, 4, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            final ScrollState scrollState5 = scrollState3;
                            final Modifier modifier6 = modifier3;
                            AndroidPopup_androidKt.Popup((DropdownMenuPositionProvider) objRememberedValue3, function0, popupProperties3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -848116919, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$1
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i11) {
                                    if ((i11 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-848116919, i11, -1, "androidx.compose.material3.DropdownMenu.<anonymous> (AndroidMenu.android.kt:112)");
                                        }
                                        MenuKt.DropdownMenuContent(mutableTransitionState, mutableState, scrollState5, modifier6, function3, composer2, MutableTransitionState.$stable | 48, 0);
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
                            }), composerStartRestartGroup, (i3 & 112) | 3072 | ((i3 >> 9) & 896), 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        j3 = j2;
                        scrollState4 = scrollState3;
                        popupProperties4 = popupProperties3;
                    }
                    j2 = jM6956DpOffsetYgX7TsA;
                    popupProperties3 = popupProperties2;
                    scrollState3 = scrollState2;
                    i3 = i9;
                    modifier3 = modifier2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1137929566, i3, -1, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:91)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(463006278);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new MutableTransitionState(Boolean.FALSE);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    mutableTransitionState = (MutableTransitionState) objRememberedValue;
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableTransitionState.setTargetState$animation_core_release(Boolean.valueOf(z));
                    if (!((Boolean) mutableTransitionState.getCurrentState()).booleanValue()) {
                        composerStartRestartGroup.startReplaceableGroup(463006465);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TransformOrigin.m4614boximpl(TransformOrigin.INSTANCE.m4627getCenterSzJe1aQ()), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        mutableState = (MutableState) objRememberedValue2;
                        composerStartRestartGroup.endReplaceableGroup();
                        density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        composerStartRestartGroup.startReplaceableGroup(463006596);
                        if ((i3 & 7168) == 2048) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        zChanged = composerStartRestartGroup.changed(density);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (!(z2 | zChanged)) {
                            objRememberedValue3 = new DropdownMenuPositionProvider(j2, density, 0, new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                    invoke2(intRect, intRect2);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(IntRect intRect, IntRect intRect2) {
                                    mutableState.setValue(TransformOrigin.m4614boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }
                            }, 4, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new DropdownMenuPositionProvider(j2, density, 0, new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                    invoke2(intRect, intRect2);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(IntRect intRect, IntRect intRect2) {
                                    mutableState.setValue(TransformOrigin.m4614boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }
                            }, 4, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        final ScrollState scrollState6 = scrollState3;
                        final Modifier modifier7 = modifier3;
                        AndroidPopup_androidKt.Popup((DropdownMenuPositionProvider) objRememberedValue3, function0, popupProperties3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -848116919, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$1
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i11) {
                                if ((i11 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-848116919, i11, -1, "androidx.compose.material3.DropdownMenu.<anonymous> (AndroidMenu.android.kt:112)");
                                    }
                                    MenuKt.DropdownMenuContent(mutableTransitionState, mutableState, scrollState6, modifier7, function3, composer2, MutableTransitionState.$stable | 48, 0);
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
                        }), composerStartRestartGroup, (i3 & 112) | 3072 | ((i3 >> 9) & 896), 0);
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(463006465);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TransformOrigin.m4614boximpl(TransformOrigin.INSTANCE.m4627getCenterSzJe1aQ()), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        mutableState = (MutableState) objRememberedValue2;
                        composerStartRestartGroup.endReplaceableGroup();
                        density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        composerStartRestartGroup.startReplaceableGroup(463006596);
                        if ((i3 & 7168) == 2048) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        zChanged = composerStartRestartGroup.changed(density);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (!(z2 | zChanged)) {
                            objRememberedValue3 = new DropdownMenuPositionProvider(j2, density, 0, new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                    invoke2(intRect, intRect2);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(IntRect intRect, IntRect intRect2) {
                                    mutableState.setValue(TransformOrigin.m4614boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }
                            }, 4, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new DropdownMenuPositionProvider(j2, density, 0, new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                    invoke2(intRect, intRect2);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(IntRect intRect, IntRect intRect2) {
                                    mutableState.setValue(TransformOrigin.m4614boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }
                            }, 4, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        final ScrollState scrollState7 = scrollState3;
                        final Modifier modifier8 = modifier3;
                        AndroidPopup_androidKt.Popup((DropdownMenuPositionProvider) objRememberedValue3, function0, popupProperties3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -848116919, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$1
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i11) {
                                if ((i11 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-848116919, i11, -1, "androidx.compose.material3.DropdownMenu.<anonymous> (AndroidMenu.android.kt:112)");
                                    }
                                    MenuKt.DropdownMenuContent(mutableTransitionState, mutableState, scrollState7, modifier8, function3, composer2, MutableTransitionState.$stable | 48, 0);
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
                        }), composerStartRestartGroup, (i3 & 112) | 3072 | ((i3 >> 9) & 896), 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    j3 = j2;
                    scrollState4 = scrollState3;
                    popupProperties4 = popupProperties3;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    scrollState4 = scrollState;
                    modifier4 = modifier2;
                    j3 = jM6956DpOffsetYgX7TsA;
                    popupProperties4 = popupProperties2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$2
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

                        public final void invoke(Composer composer2, int i11) {
                            AndroidMenu_androidKt.m1756DropdownMenu4kj_NE(z, function0, modifier4, j3, scrollState4, popupProperties4, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            popupProperties2 = popupProperties;
            if ((i2 & 64) != 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (composerStartRestartGroup.changedInstance(function3)) {
                    i8 = 1048576;
                } else {
                    i8 = 524288;
                }
                i3 |= i8;
            }
            if ((i3 & 599187) == 599186) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) == 0) {
                    if (i10 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if (i4 != 0) {
                        jM6956DpOffsetYgX7TsA = DpKt.m6956DpOffsetYgX7TsA(Dp.m6935constructorimpl(0.0f), Dp.m6935constructorimpl(0.0f));
                    }
                    if ((i2 & 16) != 0) {
                        scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                        i3 &= -57345;
                    } else {
                        scrollStateRememberScrollState = scrollState;
                    }
                    if (i6 != 0) {
                        scrollState3 = scrollStateRememberScrollState;
                        popupProperties3 = new PopupProperties(true, false, false, (SecureFlagPolicy) null, false, false, 62, (DefaultConstructorMarker) null);
                        j2 = jM6956DpOffsetYgX7TsA;
                        modifier3 = companion;
                    } else {
                        Modifier modifier9 = companion;
                        i9 = i3;
                        scrollState2 = scrollStateRememberScrollState;
                        modifier2 = modifier9;
                        j2 = jM6956DpOffsetYgX7TsA;
                        popupProperties3 = popupProperties2;
                        scrollState3 = scrollState2;
                        i3 = i9;
                        modifier3 = modifier2;
                    }
                } else {
                    if (i10 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if (i4 != 0) {
                        jM6956DpOffsetYgX7TsA = DpKt.m6956DpOffsetYgX7TsA(Dp.m6935constructorimpl(0.0f), Dp.m6935constructorimpl(0.0f));
                    }
                    if ((i2 & 16) != 0) {
                        scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                        i3 &= -57345;
                    } else {
                        scrollStateRememberScrollState = scrollState;
                    }
                    if (i6 != 0) {
                        scrollState3 = scrollStateRememberScrollState;
                        popupProperties3 = new PopupProperties(true, false, false, (SecureFlagPolicy) null, false, false, 62, (DefaultConstructorMarker) null);
                        j2 = jM6956DpOffsetYgX7TsA;
                        modifier3 = companion;
                    } else {
                        Modifier modifier10 = companion;
                        i9 = i3;
                        scrollState2 = scrollStateRememberScrollState;
                        modifier2 = modifier10;
                        j2 = jM6956DpOffsetYgX7TsA;
                        popupProperties3 = popupProperties2;
                        scrollState3 = scrollState2;
                        i3 = i9;
                        modifier3 = modifier2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1137929566, i3, -1, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:91)");
                }
                composerStartRestartGroup.startReplaceableGroup(463006278);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new MutableTransitionState(Boolean.FALSE);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                mutableTransitionState = (MutableTransitionState) objRememberedValue;
                composerStartRestartGroup.endReplaceableGroup();
                mutableTransitionState.setTargetState$animation_core_release(Boolean.valueOf(z));
                if (!((Boolean) mutableTransitionState.getCurrentState()).booleanValue()) {
                    composerStartRestartGroup.startReplaceableGroup(463006465);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TransformOrigin.m4614boximpl(TransformOrigin.INSTANCE.m4627getCenterSzJe1aQ()), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    mutableState = (MutableState) objRememberedValue2;
                    composerStartRestartGroup.endReplaceableGroup();
                    density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    composerStartRestartGroup.startReplaceableGroup(463006596);
                    if ((i3 & 7168) == 2048) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    zChanged = composerStartRestartGroup.changed(density);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!(z2 | zChanged)) {
                        objRememberedValue3 = new DropdownMenuPositionProvider(j2, density, 0, new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                invoke2(intRect, intRect2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(IntRect intRect, IntRect intRect2) {
                                mutableState.setValue(TransformOrigin.m4614boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }
                        }, 4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new DropdownMenuPositionProvider(j2, density, 0, new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                invoke2(intRect, intRect2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(IntRect intRect, IntRect intRect2) {
                                mutableState.setValue(TransformOrigin.m4614boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }
                        }, 4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    final ScrollState scrollState8 = scrollState3;
                    final Modifier modifier11 = modifier3;
                    AndroidPopup_androidKt.Popup((DropdownMenuPositionProvider) objRememberedValue3, function0, popupProperties3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -848116919, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$1
                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i11) {
                            if ((i11 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-848116919, i11, -1, "androidx.compose.material3.DropdownMenu.<anonymous> (AndroidMenu.android.kt:112)");
                                }
                                MenuKt.DropdownMenuContent(mutableTransitionState, mutableState, scrollState8, modifier11, function3, composer2, MutableTransitionState.$stable | 48, 0);
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
                    }), composerStartRestartGroup, (i3 & 112) | 3072 | ((i3 >> 9) & 896), 0);
                } else {
                    composerStartRestartGroup.startReplaceableGroup(463006465);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TransformOrigin.m4614boximpl(TransformOrigin.INSTANCE.m4627getCenterSzJe1aQ()), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    mutableState = (MutableState) objRememberedValue2;
                    composerStartRestartGroup.endReplaceableGroup();
                    density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    composerStartRestartGroup.startReplaceableGroup(463006596);
                    if ((i3 & 7168) == 2048) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    zChanged = composerStartRestartGroup.changed(density);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!(z2 | zChanged)) {
                        objRememberedValue3 = new DropdownMenuPositionProvider(j2, density, 0, new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                invoke2(intRect, intRect2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(IntRect intRect, IntRect intRect2) {
                                mutableState.setValue(TransformOrigin.m4614boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }
                        }, 4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new DropdownMenuPositionProvider(j2, density, 0, new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                invoke2(intRect, intRect2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(IntRect intRect, IntRect intRect2) {
                                mutableState.setValue(TransformOrigin.m4614boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }
                        }, 4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    final ScrollState scrollState9 = scrollState3;
                    final Modifier modifier12 = modifier3;
                    AndroidPopup_androidKt.Popup((DropdownMenuPositionProvider) objRememberedValue3, function0, popupProperties3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -848116919, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$1
                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i11) {
                            if ((i11 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-848116919, i11, -1, "androidx.compose.material3.DropdownMenu.<anonymous> (AndroidMenu.android.kt:112)");
                                }
                                MenuKt.DropdownMenuContent(mutableTransitionState, mutableState, scrollState9, modifier12, function3, composer2, MutableTransitionState.$stable | 48, 0);
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
                    }), composerStartRestartGroup, (i3 & 112) | 3072 | ((i3 >> 9) & 896), 0);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                j3 = j2;
                scrollState4 = scrollState3;
                popupProperties4 = popupProperties3;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) == 0) {
                    if (i10 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if (i4 != 0) {
                        jM6956DpOffsetYgX7TsA = DpKt.m6956DpOffsetYgX7TsA(Dp.m6935constructorimpl(0.0f), Dp.m6935constructorimpl(0.0f));
                    }
                    if ((i2 & 16) != 0) {
                        scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                        i3 &= -57345;
                    } else {
                        scrollStateRememberScrollState = scrollState;
                    }
                    if (i6 != 0) {
                        scrollState3 = scrollStateRememberScrollState;
                        popupProperties3 = new PopupProperties(true, false, false, (SecureFlagPolicy) null, false, false, 62, (DefaultConstructorMarker) null);
                        j2 = jM6956DpOffsetYgX7TsA;
                        modifier3 = companion;
                    } else {
                        Modifier modifier13 = companion;
                        i9 = i3;
                        scrollState2 = scrollStateRememberScrollState;
                        modifier2 = modifier13;
                        j2 = jM6956DpOffsetYgX7TsA;
                        popupProperties3 = popupProperties2;
                        scrollState3 = scrollState2;
                        i3 = i9;
                        modifier3 = modifier2;
                    }
                } else {
                    if (i10 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if (i4 != 0) {
                        jM6956DpOffsetYgX7TsA = DpKt.m6956DpOffsetYgX7TsA(Dp.m6935constructorimpl(0.0f), Dp.m6935constructorimpl(0.0f));
                    }
                    if ((i2 & 16) != 0) {
                        scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                        i3 &= -57345;
                    } else {
                        scrollStateRememberScrollState = scrollState;
                    }
                    if (i6 != 0) {
                        scrollState3 = scrollStateRememberScrollState;
                        popupProperties3 = new PopupProperties(true, false, false, (SecureFlagPolicy) null, false, false, 62, (DefaultConstructorMarker) null);
                        j2 = jM6956DpOffsetYgX7TsA;
                        modifier3 = companion;
                    } else {
                        Modifier modifier14 = companion;
                        i9 = i3;
                        scrollState2 = scrollStateRememberScrollState;
                        modifier2 = modifier14;
                        j2 = jM6956DpOffsetYgX7TsA;
                        popupProperties3 = popupProperties2;
                        scrollState3 = scrollState2;
                        i3 = i9;
                        modifier3 = modifier2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1137929566, i3, -1, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:91)");
                }
                composerStartRestartGroup.startReplaceableGroup(463006278);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new MutableTransitionState(Boolean.FALSE);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                mutableTransitionState = (MutableTransitionState) objRememberedValue;
                composerStartRestartGroup.endReplaceableGroup();
                mutableTransitionState.setTargetState$animation_core_release(Boolean.valueOf(z));
                if (!((Boolean) mutableTransitionState.getCurrentState()).booleanValue()) {
                    composerStartRestartGroup.startReplaceableGroup(463006465);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TransformOrigin.m4614boximpl(TransformOrigin.INSTANCE.m4627getCenterSzJe1aQ()), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    mutableState = (MutableState) objRememberedValue2;
                    composerStartRestartGroup.endReplaceableGroup();
                    density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    composerStartRestartGroup.startReplaceableGroup(463006596);
                    if ((i3 & 7168) == 2048) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    zChanged = composerStartRestartGroup.changed(density);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!(z2 | zChanged)) {
                        objRememberedValue3 = new DropdownMenuPositionProvider(j2, density, 0, new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                invoke2(intRect, intRect2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(IntRect intRect, IntRect intRect2) {
                                mutableState.setValue(TransformOrigin.m4614boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }
                        }, 4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new DropdownMenuPositionProvider(j2, density, 0, new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                invoke2(intRect, intRect2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(IntRect intRect, IntRect intRect2) {
                                mutableState.setValue(TransformOrigin.m4614boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }
                        }, 4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    final ScrollState scrollState10 = scrollState3;
                    final Modifier modifier15 = modifier3;
                    AndroidPopup_androidKt.Popup((DropdownMenuPositionProvider) objRememberedValue3, function0, popupProperties3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -848116919, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$1
                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i11) {
                            if ((i11 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-848116919, i11, -1, "androidx.compose.material3.DropdownMenu.<anonymous> (AndroidMenu.android.kt:112)");
                                }
                                MenuKt.DropdownMenuContent(mutableTransitionState, mutableState, scrollState10, modifier15, function3, composer2, MutableTransitionState.$stable | 48, 0);
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
                    }), composerStartRestartGroup, (i3 & 112) | 3072 | ((i3 >> 9) & 896), 0);
                } else {
                    composerStartRestartGroup.startReplaceableGroup(463006465);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TransformOrigin.m4614boximpl(TransformOrigin.INSTANCE.m4627getCenterSzJe1aQ()), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    mutableState = (MutableState) objRememberedValue2;
                    composerStartRestartGroup.endReplaceableGroup();
                    density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    composerStartRestartGroup.startReplaceableGroup(463006596);
                    if ((i3 & 7168) == 2048) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    zChanged = composerStartRestartGroup.changed(density);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!(z2 | zChanged)) {
                        objRememberedValue3 = new DropdownMenuPositionProvider(j2, density, 0, new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                invoke2(intRect, intRect2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(IntRect intRect, IntRect intRect2) {
                                mutableState.setValue(TransformOrigin.m4614boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }
                        }, 4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new DropdownMenuPositionProvider(j2, density, 0, new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                invoke2(intRect, intRect2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(IntRect intRect, IntRect intRect2) {
                                mutableState.setValue(TransformOrigin.m4614boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }
                        }, 4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    final ScrollState scrollState11 = scrollState3;
                    final Modifier modifier16 = modifier3;
                    AndroidPopup_androidKt.Popup((DropdownMenuPositionProvider) objRememberedValue3, function0, popupProperties3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -848116919, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$1
                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i11) {
                            if ((i11 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-848116919, i11, -1, "androidx.compose.material3.DropdownMenu.<anonymous> (AndroidMenu.android.kt:112)");
                                }
                                MenuKt.DropdownMenuContent(mutableTransitionState, mutableState, scrollState11, modifier16, function3, composer2, MutableTransitionState.$stable | 48, 0);
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
                    }), composerStartRestartGroup, (i3 & 112) | 3072 | ((i3 >> 9) & 896), 0);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                j3 = j2;
                scrollState4 = scrollState3;
                popupProperties4 = popupProperties3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$2
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

                    public final void invoke(Composer composer2, int i11) {
                        AndroidMenu_androidKt.m1756DropdownMenu4kj_NE(z, function0, modifier4, j3, scrollState4, popupProperties4, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 384;
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
            jM6956DpOffsetYgX7TsA = j;
        } else {
            jM6956DpOffsetYgX7TsA = j;
            if ((i & 3072) == 0) {
                if (composerStartRestartGroup.changed(jM6956DpOffsetYgX7TsA)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
        }
        if ((i & 24576) != 0) {
            i3 |= ((i2 & 16) == 0 || !composerStartRestartGroup.changed(scrollState)) ? 8192 : 16384;
        }
        i6 = i2 & 32;
        if (i6 != 0) {
            if ((196608 & i) == 0) {
                popupProperties2 = popupProperties;
                if (composerStartRestartGroup.changed(popupProperties2)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i3 |= i7;
            }
            if ((i2 & 64) != 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (composerStartRestartGroup.changedInstance(function3)) {
                    i8 = 1048576;
                } else {
                    i8 = 524288;
                }
                i3 |= i8;
            }
            if ((i3 & 599187) == 599186) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) == 0) {
                    if (i10 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if (i4 != 0) {
                        jM6956DpOffsetYgX7TsA = DpKt.m6956DpOffsetYgX7TsA(Dp.m6935constructorimpl(0.0f), Dp.m6935constructorimpl(0.0f));
                    }
                    if ((i2 & 16) != 0) {
                        scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                        i3 &= -57345;
                    } else {
                        scrollStateRememberScrollState = scrollState;
                    }
                    if (i6 != 0) {
                        scrollState3 = scrollStateRememberScrollState;
                        popupProperties3 = new PopupProperties(true, false, false, (SecureFlagPolicy) null, false, false, 62, (DefaultConstructorMarker) null);
                        j2 = jM6956DpOffsetYgX7TsA;
                        modifier3 = companion;
                    } else {
                        Modifier modifier17 = companion;
                        i9 = i3;
                        scrollState2 = scrollStateRememberScrollState;
                        modifier2 = modifier17;
                        j2 = jM6956DpOffsetYgX7TsA;
                        popupProperties3 = popupProperties2;
                        scrollState3 = scrollState2;
                        i3 = i9;
                        modifier3 = modifier2;
                    }
                } else {
                    if (i10 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if (i4 != 0) {
                        jM6956DpOffsetYgX7TsA = DpKt.m6956DpOffsetYgX7TsA(Dp.m6935constructorimpl(0.0f), Dp.m6935constructorimpl(0.0f));
                    }
                    if ((i2 & 16) != 0) {
                        scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                        i3 &= -57345;
                    } else {
                        scrollStateRememberScrollState = scrollState;
                    }
                    if (i6 != 0) {
                        scrollState3 = scrollStateRememberScrollState;
                        popupProperties3 = new PopupProperties(true, false, false, (SecureFlagPolicy) null, false, false, 62, (DefaultConstructorMarker) null);
                        j2 = jM6956DpOffsetYgX7TsA;
                        modifier3 = companion;
                    } else {
                        Modifier modifier18 = companion;
                        i9 = i3;
                        scrollState2 = scrollStateRememberScrollState;
                        modifier2 = modifier18;
                        j2 = jM6956DpOffsetYgX7TsA;
                        popupProperties3 = popupProperties2;
                        scrollState3 = scrollState2;
                        i3 = i9;
                        modifier3 = modifier2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1137929566, i3, -1, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:91)");
                }
                composerStartRestartGroup.startReplaceableGroup(463006278);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new MutableTransitionState(Boolean.FALSE);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                mutableTransitionState = (MutableTransitionState) objRememberedValue;
                composerStartRestartGroup.endReplaceableGroup();
                mutableTransitionState.setTargetState$animation_core_release(Boolean.valueOf(z));
                if (!((Boolean) mutableTransitionState.getCurrentState()).booleanValue()) {
                    composerStartRestartGroup.startReplaceableGroup(463006465);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TransformOrigin.m4614boximpl(TransformOrigin.INSTANCE.m4627getCenterSzJe1aQ()), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    mutableState = (MutableState) objRememberedValue2;
                    composerStartRestartGroup.endReplaceableGroup();
                    density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    composerStartRestartGroup.startReplaceableGroup(463006596);
                    if ((i3 & 7168) == 2048) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    zChanged = composerStartRestartGroup.changed(density);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!(z2 | zChanged)) {
                        objRememberedValue3 = new DropdownMenuPositionProvider(j2, density, 0, new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                invoke2(intRect, intRect2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(IntRect intRect, IntRect intRect2) {
                                mutableState.setValue(TransformOrigin.m4614boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }
                        }, 4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new DropdownMenuPositionProvider(j2, density, 0, new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                invoke2(intRect, intRect2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(IntRect intRect, IntRect intRect2) {
                                mutableState.setValue(TransformOrigin.m4614boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }
                        }, 4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    final ScrollState scrollState12 = scrollState3;
                    final Modifier modifier19 = modifier3;
                    AndroidPopup_androidKt.Popup((DropdownMenuPositionProvider) objRememberedValue3, function0, popupProperties3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -848116919, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$1
                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i11) {
                            if ((i11 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-848116919, i11, -1, "androidx.compose.material3.DropdownMenu.<anonymous> (AndroidMenu.android.kt:112)");
                                }
                                MenuKt.DropdownMenuContent(mutableTransitionState, mutableState, scrollState12, modifier19, function3, composer2, MutableTransitionState.$stable | 48, 0);
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
                    }), composerStartRestartGroup, (i3 & 112) | 3072 | ((i3 >> 9) & 896), 0);
                } else {
                    composerStartRestartGroup.startReplaceableGroup(463006465);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TransformOrigin.m4614boximpl(TransformOrigin.INSTANCE.m4627getCenterSzJe1aQ()), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    mutableState = (MutableState) objRememberedValue2;
                    composerStartRestartGroup.endReplaceableGroup();
                    density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    composerStartRestartGroup.startReplaceableGroup(463006596);
                    if ((i3 & 7168) == 2048) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    zChanged = composerStartRestartGroup.changed(density);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!(z2 | zChanged)) {
                        objRememberedValue3 = new DropdownMenuPositionProvider(j2, density, 0, new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                invoke2(intRect, intRect2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(IntRect intRect, IntRect intRect2) {
                                mutableState.setValue(TransformOrigin.m4614boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }
                        }, 4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new DropdownMenuPositionProvider(j2, density, 0, new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                invoke2(intRect, intRect2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(IntRect intRect, IntRect intRect2) {
                                mutableState.setValue(TransformOrigin.m4614boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }
                        }, 4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    final ScrollState scrollState13 = scrollState3;
                    final Modifier modifier110 = modifier3;
                    AndroidPopup_androidKt.Popup((DropdownMenuPositionProvider) objRememberedValue3, function0, popupProperties3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -848116919, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$1
                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i11) {
                            if ((i11 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-848116919, i11, -1, "androidx.compose.material3.DropdownMenu.<anonymous> (AndroidMenu.android.kt:112)");
                                }
                                MenuKt.DropdownMenuContent(mutableTransitionState, mutableState, scrollState13, modifier110, function3, composer2, MutableTransitionState.$stable | 48, 0);
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
                    }), composerStartRestartGroup, (i3 & 112) | 3072 | ((i3 >> 9) & 896), 0);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                j3 = j2;
                scrollState4 = scrollState3;
                popupProperties4 = popupProperties3;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) == 0) {
                    if (i10 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if (i4 != 0) {
                        jM6956DpOffsetYgX7TsA = DpKt.m6956DpOffsetYgX7TsA(Dp.m6935constructorimpl(0.0f), Dp.m6935constructorimpl(0.0f));
                    }
                    if ((i2 & 16) != 0) {
                        scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                        i3 &= -57345;
                    } else {
                        scrollStateRememberScrollState = scrollState;
                    }
                    if (i6 != 0) {
                        scrollState3 = scrollStateRememberScrollState;
                        popupProperties3 = new PopupProperties(true, false, false, (SecureFlagPolicy) null, false, false, 62, (DefaultConstructorMarker) null);
                        j2 = jM6956DpOffsetYgX7TsA;
                        modifier3 = companion;
                    } else {
                        Modifier modifier111 = companion;
                        i9 = i3;
                        scrollState2 = scrollStateRememberScrollState;
                        modifier2 = modifier111;
                        j2 = jM6956DpOffsetYgX7TsA;
                        popupProperties3 = popupProperties2;
                        scrollState3 = scrollState2;
                        i3 = i9;
                        modifier3 = modifier2;
                    }
                } else {
                    if (i10 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if (i4 != 0) {
                        jM6956DpOffsetYgX7TsA = DpKt.m6956DpOffsetYgX7TsA(Dp.m6935constructorimpl(0.0f), Dp.m6935constructorimpl(0.0f));
                    }
                    if ((i2 & 16) != 0) {
                        scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                        i3 &= -57345;
                    } else {
                        scrollStateRememberScrollState = scrollState;
                    }
                    if (i6 != 0) {
                        scrollState3 = scrollStateRememberScrollState;
                        popupProperties3 = new PopupProperties(true, false, false, (SecureFlagPolicy) null, false, false, 62, (DefaultConstructorMarker) null);
                        j2 = jM6956DpOffsetYgX7TsA;
                        modifier3 = companion;
                    } else {
                        Modifier modifier112 = companion;
                        i9 = i3;
                        scrollState2 = scrollStateRememberScrollState;
                        modifier2 = modifier112;
                        j2 = jM6956DpOffsetYgX7TsA;
                        popupProperties3 = popupProperties2;
                        scrollState3 = scrollState2;
                        i3 = i9;
                        modifier3 = modifier2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1137929566, i3, -1, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:91)");
                }
                composerStartRestartGroup.startReplaceableGroup(463006278);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new MutableTransitionState(Boolean.FALSE);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                mutableTransitionState = (MutableTransitionState) objRememberedValue;
                composerStartRestartGroup.endReplaceableGroup();
                mutableTransitionState.setTargetState$animation_core_release(Boolean.valueOf(z));
                if (!((Boolean) mutableTransitionState.getCurrentState()).booleanValue()) {
                    composerStartRestartGroup.startReplaceableGroup(463006465);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TransformOrigin.m4614boximpl(TransformOrigin.INSTANCE.m4627getCenterSzJe1aQ()), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    mutableState = (MutableState) objRememberedValue2;
                    composerStartRestartGroup.endReplaceableGroup();
                    density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    composerStartRestartGroup.startReplaceableGroup(463006596);
                    if ((i3 & 7168) == 2048) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    zChanged = composerStartRestartGroup.changed(density);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!(z2 | zChanged)) {
                        objRememberedValue3 = new DropdownMenuPositionProvider(j2, density, 0, new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                invoke2(intRect, intRect2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(IntRect intRect, IntRect intRect2) {
                                mutableState.setValue(TransformOrigin.m4614boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }
                        }, 4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new DropdownMenuPositionProvider(j2, density, 0, new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                invoke2(intRect, intRect2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(IntRect intRect, IntRect intRect2) {
                                mutableState.setValue(TransformOrigin.m4614boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }
                        }, 4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    final ScrollState scrollState14 = scrollState3;
                    final Modifier modifier113 = modifier3;
                    AndroidPopup_androidKt.Popup((DropdownMenuPositionProvider) objRememberedValue3, function0, popupProperties3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -848116919, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$1
                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i11) {
                            if ((i11 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-848116919, i11, -1, "androidx.compose.material3.DropdownMenu.<anonymous> (AndroidMenu.android.kt:112)");
                                }
                                MenuKt.DropdownMenuContent(mutableTransitionState, mutableState, scrollState14, modifier113, function3, composer2, MutableTransitionState.$stable | 48, 0);
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
                    }), composerStartRestartGroup, (i3 & 112) | 3072 | ((i3 >> 9) & 896), 0);
                } else {
                    composerStartRestartGroup.startReplaceableGroup(463006465);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TransformOrigin.m4614boximpl(TransformOrigin.INSTANCE.m4627getCenterSzJe1aQ()), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    mutableState = (MutableState) objRememberedValue2;
                    composerStartRestartGroup.endReplaceableGroup();
                    density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    composerStartRestartGroup.startReplaceableGroup(463006596);
                    if ((i3 & 7168) == 2048) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    zChanged = composerStartRestartGroup.changed(density);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!(z2 | zChanged)) {
                        objRememberedValue3 = new DropdownMenuPositionProvider(j2, density, 0, new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                invoke2(intRect, intRect2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(IntRect intRect, IntRect intRect2) {
                                mutableState.setValue(TransformOrigin.m4614boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }
                        }, 4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new DropdownMenuPositionProvider(j2, density, 0, new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                invoke2(intRect, intRect2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(IntRect intRect, IntRect intRect2) {
                                mutableState.setValue(TransformOrigin.m4614boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }
                        }, 4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    final ScrollState scrollState15 = scrollState3;
                    final Modifier modifier114 = modifier3;
                    AndroidPopup_androidKt.Popup((DropdownMenuPositionProvider) objRememberedValue3, function0, popupProperties3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -848116919, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$1
                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i11) {
                            if ((i11 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-848116919, i11, -1, "androidx.compose.material3.DropdownMenu.<anonymous> (AndroidMenu.android.kt:112)");
                                }
                                MenuKt.DropdownMenuContent(mutableTransitionState, mutableState, scrollState15, modifier114, function3, composer2, MutableTransitionState.$stable | 48, 0);
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
                    }), composerStartRestartGroup, (i3 & 112) | 3072 | ((i3 >> 9) & 896), 0);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                j3 = j2;
                scrollState4 = scrollState3;
                popupProperties4 = popupProperties3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$2
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

                    public final void invoke(Composer composer2, int i11) {
                        AndroidMenu_androidKt.m1756DropdownMenu4kj_NE(z, function0, modifier4, j3, scrollState4, popupProperties4, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
        }
        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        popupProperties2 = popupProperties;
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            if (composerStartRestartGroup.changedInstance(function3)) {
                i8 = 1048576;
            } else {
                i8 = 524288;
            }
            i3 |= i8;
        }
        if ((i3 & 599187) == 599186) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0) {
                if (i10 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier2;
                }
                if (i4 != 0) {
                    jM6956DpOffsetYgX7TsA = DpKt.m6956DpOffsetYgX7TsA(Dp.m6935constructorimpl(0.0f), Dp.m6935constructorimpl(0.0f));
                }
                if ((i2 & 16) != 0) {
                    scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                    i3 &= -57345;
                } else {
                    scrollStateRememberScrollState = scrollState;
                }
                if (i6 != 0) {
                    scrollState3 = scrollStateRememberScrollState;
                    popupProperties3 = new PopupProperties(true, false, false, (SecureFlagPolicy) null, false, false, 62, (DefaultConstructorMarker) null);
                    j2 = jM6956DpOffsetYgX7TsA;
                    modifier3 = companion;
                } else {
                    Modifier modifier115 = companion;
                    i9 = i3;
                    scrollState2 = scrollStateRememberScrollState;
                    modifier2 = modifier115;
                    j2 = jM6956DpOffsetYgX7TsA;
                    popupProperties3 = popupProperties2;
                    scrollState3 = scrollState2;
                    i3 = i9;
                    modifier3 = modifier2;
                }
            } else {
                if (i10 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier2;
                }
                if (i4 != 0) {
                    jM6956DpOffsetYgX7TsA = DpKt.m6956DpOffsetYgX7TsA(Dp.m6935constructorimpl(0.0f), Dp.m6935constructorimpl(0.0f));
                }
                if ((i2 & 16) != 0) {
                    scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                    i3 &= -57345;
                } else {
                    scrollStateRememberScrollState = scrollState;
                }
                if (i6 != 0) {
                    scrollState3 = scrollStateRememberScrollState;
                    popupProperties3 = new PopupProperties(true, false, false, (SecureFlagPolicy) null, false, false, 62, (DefaultConstructorMarker) null);
                    j2 = jM6956DpOffsetYgX7TsA;
                    modifier3 = companion;
                } else {
                    Modifier modifier116 = companion;
                    i9 = i3;
                    scrollState2 = scrollStateRememberScrollState;
                    modifier2 = modifier116;
                    j2 = jM6956DpOffsetYgX7TsA;
                    popupProperties3 = popupProperties2;
                    scrollState3 = scrollState2;
                    i3 = i9;
                    modifier3 = modifier2;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1137929566, i3, -1, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:91)");
            }
            composerStartRestartGroup.startReplaceableGroup(463006278);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new MutableTransitionState(Boolean.FALSE);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            mutableTransitionState = (MutableTransitionState) objRememberedValue;
            composerStartRestartGroup.endReplaceableGroup();
            mutableTransitionState.setTargetState$animation_core_release(Boolean.valueOf(z));
            if (!((Boolean) mutableTransitionState.getCurrentState()).booleanValue()) {
                composerStartRestartGroup.startReplaceableGroup(463006465);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TransformOrigin.m4614boximpl(TransformOrigin.INSTANCE.m4627getCenterSzJe1aQ()), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                mutableState = (MutableState) objRememberedValue2;
                composerStartRestartGroup.endReplaceableGroup();
                density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                composerStartRestartGroup.startReplaceableGroup(463006596);
                if ((i3 & 7168) == 2048) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                zChanged = composerStartRestartGroup.changed(density);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!(z2 | zChanged)) {
                    objRememberedValue3 = new DropdownMenuPositionProvider(j2, density, 0, new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                            invoke2(intRect, intRect2);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(IntRect intRect, IntRect intRect2) {
                            mutableState.setValue(TransformOrigin.m4614boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }
                    }, 4, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new DropdownMenuPositionProvider(j2, density, 0, new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                            invoke2(intRect, intRect2);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(IntRect intRect, IntRect intRect2) {
                            mutableState.setValue(TransformOrigin.m4614boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }
                    }, 4, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                final ScrollState scrollState16 = scrollState3;
                final Modifier modifier117 = modifier3;
                AndroidPopup_androidKt.Popup((DropdownMenuPositionProvider) objRememberedValue3, function0, popupProperties3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -848116919, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$1
                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i11) {
                        if ((i11 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-848116919, i11, -1, "androidx.compose.material3.DropdownMenu.<anonymous> (AndroidMenu.android.kt:112)");
                            }
                            MenuKt.DropdownMenuContent(mutableTransitionState, mutableState, scrollState16, modifier117, function3, composer2, MutableTransitionState.$stable | 48, 0);
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
                }), composerStartRestartGroup, (i3 & 112) | 3072 | ((i3 >> 9) & 896), 0);
            } else {
                composerStartRestartGroup.startReplaceableGroup(463006465);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TransformOrigin.m4614boximpl(TransformOrigin.INSTANCE.m4627getCenterSzJe1aQ()), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                mutableState = (MutableState) objRememberedValue2;
                composerStartRestartGroup.endReplaceableGroup();
                density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                composerStartRestartGroup.startReplaceableGroup(463006596);
                if ((i3 & 7168) == 2048) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                zChanged = composerStartRestartGroup.changed(density);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!(z2 | zChanged)) {
                    objRememberedValue3 = new DropdownMenuPositionProvider(j2, density, 0, new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                            invoke2(intRect, intRect2);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(IntRect intRect, IntRect intRect2) {
                            mutableState.setValue(TransformOrigin.m4614boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }
                    }, 4, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new DropdownMenuPositionProvider(j2, density, 0, new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                            invoke2(intRect, intRect2);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(IntRect intRect, IntRect intRect2) {
                            mutableState.setValue(TransformOrigin.m4614boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }
                    }, 4, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                final ScrollState scrollState17 = scrollState3;
                final Modifier modifier118 = modifier3;
                AndroidPopup_androidKt.Popup((DropdownMenuPositionProvider) objRememberedValue3, function0, popupProperties3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -848116919, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$1
                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i11) {
                        if ((i11 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-848116919, i11, -1, "androidx.compose.material3.DropdownMenu.<anonymous> (AndroidMenu.android.kt:112)");
                            }
                            MenuKt.DropdownMenuContent(mutableTransitionState, mutableState, scrollState17, modifier118, function3, composer2, MutableTransitionState.$stable | 48, 0);
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
                }), composerStartRestartGroup, (i3 & 112) | 3072 | ((i3 >> 9) & 896), 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            j3 = j2;
            scrollState4 = scrollState3;
            popupProperties4 = popupProperties3;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0) {
                if (i10 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier2;
                }
                if (i4 != 0) {
                    jM6956DpOffsetYgX7TsA = DpKt.m6956DpOffsetYgX7TsA(Dp.m6935constructorimpl(0.0f), Dp.m6935constructorimpl(0.0f));
                }
                if ((i2 & 16) != 0) {
                    scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                    i3 &= -57345;
                } else {
                    scrollStateRememberScrollState = scrollState;
                }
                if (i6 != 0) {
                    scrollState3 = scrollStateRememberScrollState;
                    popupProperties3 = new PopupProperties(true, false, false, (SecureFlagPolicy) null, false, false, 62, (DefaultConstructorMarker) null);
                    j2 = jM6956DpOffsetYgX7TsA;
                    modifier3 = companion;
                } else {
                    Modifier modifier119 = companion;
                    i9 = i3;
                    scrollState2 = scrollStateRememberScrollState;
                    modifier2 = modifier119;
                    j2 = jM6956DpOffsetYgX7TsA;
                    popupProperties3 = popupProperties2;
                    scrollState3 = scrollState2;
                    i3 = i9;
                    modifier3 = modifier2;
                }
            } else {
                if (i10 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier2;
                }
                if (i4 != 0) {
                    jM6956DpOffsetYgX7TsA = DpKt.m6956DpOffsetYgX7TsA(Dp.m6935constructorimpl(0.0f), Dp.m6935constructorimpl(0.0f));
                }
                if ((i2 & 16) != 0) {
                    scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                    i3 &= -57345;
                } else {
                    scrollStateRememberScrollState = scrollState;
                }
                if (i6 != 0) {
                    scrollState3 = scrollStateRememberScrollState;
                    popupProperties3 = new PopupProperties(true, false, false, (SecureFlagPolicy) null, false, false, 62, (DefaultConstructorMarker) null);
                    j2 = jM6956DpOffsetYgX7TsA;
                    modifier3 = companion;
                } else {
                    Modifier modifier1110 = companion;
                    i9 = i3;
                    scrollState2 = scrollStateRememberScrollState;
                    modifier2 = modifier1110;
                    j2 = jM6956DpOffsetYgX7TsA;
                    popupProperties3 = popupProperties2;
                    scrollState3 = scrollState2;
                    i3 = i9;
                    modifier3 = modifier2;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1137929566, i3, -1, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:91)");
            }
            composerStartRestartGroup.startReplaceableGroup(463006278);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new MutableTransitionState(Boolean.FALSE);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            mutableTransitionState = (MutableTransitionState) objRememberedValue;
            composerStartRestartGroup.endReplaceableGroup();
            mutableTransitionState.setTargetState$animation_core_release(Boolean.valueOf(z));
            if (!((Boolean) mutableTransitionState.getCurrentState()).booleanValue()) {
                composerStartRestartGroup.startReplaceableGroup(463006465);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TransformOrigin.m4614boximpl(TransformOrigin.INSTANCE.m4627getCenterSzJe1aQ()), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                mutableState = (MutableState) objRememberedValue2;
                composerStartRestartGroup.endReplaceableGroup();
                density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                composerStartRestartGroup.startReplaceableGroup(463006596);
                if ((i3 & 7168) == 2048) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                zChanged = composerStartRestartGroup.changed(density);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!(z2 | zChanged)) {
                    objRememberedValue3 = new DropdownMenuPositionProvider(j2, density, 0, new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                            invoke2(intRect, intRect2);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(IntRect intRect, IntRect intRect2) {
                            mutableState.setValue(TransformOrigin.m4614boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }
                    }, 4, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new DropdownMenuPositionProvider(j2, density, 0, new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                            invoke2(intRect, intRect2);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(IntRect intRect, IntRect intRect2) {
                            mutableState.setValue(TransformOrigin.m4614boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }
                    }, 4, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                final ScrollState scrollState18 = scrollState3;
                final Modifier modifier1111 = modifier3;
                AndroidPopup_androidKt.Popup((DropdownMenuPositionProvider) objRememberedValue3, function0, popupProperties3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -848116919, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$1
                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i11) {
                        if ((i11 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-848116919, i11, -1, "androidx.compose.material3.DropdownMenu.<anonymous> (AndroidMenu.android.kt:112)");
                            }
                            MenuKt.DropdownMenuContent(mutableTransitionState, mutableState, scrollState18, modifier1111, function3, composer2, MutableTransitionState.$stable | 48, 0);
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
                }), composerStartRestartGroup, (i3 & 112) | 3072 | ((i3 >> 9) & 896), 0);
            } else {
                composerStartRestartGroup.startReplaceableGroup(463006465);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TransformOrigin.m4614boximpl(TransformOrigin.INSTANCE.m4627getCenterSzJe1aQ()), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                mutableState = (MutableState) objRememberedValue2;
                composerStartRestartGroup.endReplaceableGroup();
                density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                composerStartRestartGroup.startReplaceableGroup(463006596);
                if ((i3 & 7168) == 2048) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                zChanged = composerStartRestartGroup.changed(density);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!(z2 | zChanged)) {
                    objRememberedValue3 = new DropdownMenuPositionProvider(j2, density, 0, new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                            invoke2(intRect, intRect2);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(IntRect intRect, IntRect intRect2) {
                            mutableState.setValue(TransformOrigin.m4614boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }
                    }, 4, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new DropdownMenuPositionProvider(j2, density, 0, new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                            invoke2(intRect, intRect2);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(IntRect intRect, IntRect intRect2) {
                            mutableState.setValue(TransformOrigin.m4614boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }
                    }, 4, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                final ScrollState scrollState19 = scrollState3;
                final Modifier modifier1112 = modifier3;
                AndroidPopup_androidKt.Popup((DropdownMenuPositionProvider) objRememberedValue3, function0, popupProperties3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -848116919, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$1
                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i11) {
                        if ((i11 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-848116919, i11, -1, "androidx.compose.material3.DropdownMenu.<anonymous> (AndroidMenu.android.kt:112)");
                            }
                            MenuKt.DropdownMenuContent(mutableTransitionState, mutableState, scrollState19, modifier1112, function3, composer2, MutableTransitionState.$stable | 48, 0);
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
                }), composerStartRestartGroup, (i3 & 112) | 3072 | ((i3 >> 9) & 896), 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            j3 = j2;
            scrollState4 = scrollState3;
            popupProperties4 = popupProperties3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$2
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

                public final void invoke(Composer composer2, int i11) {
                    AndroidMenu_androidKt.m1756DropdownMenu4kj_NE(z, function0, modifier4, j3, scrollState4, popupProperties4, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x004c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:49:0x0084  */
    /* JADX WARN: Code duplicated, block: B:51:0x0088  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:54:0x0093  */
    /* JADX WARN: Code duplicated, block: B:59:0x009f  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:64:0x00af  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00be  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:79:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:82:0x0104  */
    /* JADX WARN: Code duplicated, block: B:85:0x0134  */
    /* JADX WARN: Code duplicated, block: B:89:0x0141  */
    /* JADX WARN: Code duplicated, block: B:91:? A[RETURN, SYNTHETIC] */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Replaced by a DropdownMenu function with a ScrollState parameter", replaceWith = @ReplaceWith(expression = "DropdownMenu(expanded,onDismissRequest, modifier, offset, rememberScrollState(), properties, content)", imports = {"androidx.compose.foundation.rememberScrollState"}))
    /* JADX INFO: renamed from: DropdownMenu-ILWXrKs, reason: not valid java name */
    public static final /* synthetic */ void m1757DropdownMenuILWXrKs(final boolean z, final Function0 function0, Modifier modifier, long j, PopupProperties popupProperties, final Function3 function3, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Modifier modifier2;
        int i5;
        int i6;
        long jM6956DpOffsetYgX7TsA;
        int i7;
        int i8;
        PopupProperties popupProperties2;
        int i9;
        int i10;
        PopupProperties popupProperties3;
        final Modifier modifier3;
        final PopupProperties popupProperties4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(354826666);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) == 0) {
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    modifier2 = modifier;
                    if (composerStartRestartGroup.changed(modifier2)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 3072) == 0) {
                        jM6956DpOffsetYgX7TsA = j;
                        if (composerStartRestartGroup.changed(jM6956DpOffsetYgX7TsA)) {
                            i7 = 2048;
                        } else {
                            i7 = 1024;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 16;
                    if (i8 != 0) {
                        if ((i & 24576) == 0) {
                            popupProperties2 = popupProperties;
                            if (composerStartRestartGroup.changed(popupProperties2)) {
                                i9 = 16384;
                            } else {
                                i9 = 8192;
                            }
                            i3 |= i9;
                        }
                        if ((i2 & 32) != 0) {
                            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            if (composerStartRestartGroup.changedInstance(function3)) {
                                i10 = 131072;
                            } else {
                                i10 = 65536;
                            }
                            i3 |= i10;
                        }
                        if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                            if (i4 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i6 != 0) {
                                jM6956DpOffsetYgX7TsA = DpKt.m6956DpOffsetYgX7TsA(Dp.m6935constructorimpl(0.0f), Dp.m6935constructorimpl(0.0f));
                            }
                            long j2 = jM6956DpOffsetYgX7TsA;
                            if (i8 != 0) {
                                popupProperties3 = new PopupProperties(true, false, false, (SecureFlagPolicy) null, false, false, 62, (DefaultConstructorMarker) null);
                            } else {
                                popupProperties3 = popupProperties2;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(354826666, i3, -1, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:141)");
                            }
                            int i11 = i3 << 3;
                            m1756DropdownMenu4kj_NE(z, function0, modifier2, j2, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties3, function3, composerStartRestartGroup, (i3 & 8190) | (458752 & i11) | (i11 & 3670016), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier2;
                            jM6956DpOffsetYgX7TsA = j2;
                            popupProperties4 = popupProperties3;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                            popupProperties4 = popupProperties2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            final long j3 = jM6956DpOffsetYgX7TsA;
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$3
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

                                public final void invoke(Composer composer2, int i12) {
                                    AndroidMenu_androidKt.m1757DropdownMenuILWXrKs(z, function0, modifier3, j3, popupProperties4, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                }
                            });
                        }
                    }
                    i3 |= 24576;
                    popupProperties2 = popupProperties;
                    if ((i2 & 32) != 0) {
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        if (composerStartRestartGroup.changedInstance(function3)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                        i3 |= i10;
                    }
                    if ((74899 & i3) == 74898) {
                        if (i4 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i6 != 0) {
                            jM6956DpOffsetYgX7TsA = DpKt.m6956DpOffsetYgX7TsA(Dp.m6935constructorimpl(0.0f), Dp.m6935constructorimpl(0.0f));
                        }
                        long j4 = jM6956DpOffsetYgX7TsA;
                        if (i8 != 0) {
                            popupProperties3 = new PopupProperties(true, false, false, (SecureFlagPolicy) null, false, false, 62, (DefaultConstructorMarker) null);
                        } else {
                            popupProperties3 = popupProperties2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(354826666, i3, -1, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:141)");
                        }
                        int i12 = i3 << 3;
                        m1756DropdownMenu4kj_NE(z, function0, modifier2, j4, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties3, function3, composerStartRestartGroup, (i3 & 8190) | (458752 & i12) | (i12 & 3670016), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier2;
                        jM6956DpOffsetYgX7TsA = j4;
                        popupProperties4 = popupProperties3;
                    } else {
                        if (i4 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i6 != 0) {
                            jM6956DpOffsetYgX7TsA = DpKt.m6956DpOffsetYgX7TsA(Dp.m6935constructorimpl(0.0f), Dp.m6935constructorimpl(0.0f));
                        }
                        long j5 = jM6956DpOffsetYgX7TsA;
                        if (i8 != 0) {
                            popupProperties3 = new PopupProperties(true, false, false, (SecureFlagPolicy) null, false, false, 62, (DefaultConstructorMarker) null);
                        } else {
                            popupProperties3 = popupProperties2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(354826666, i3, -1, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:141)");
                        }
                        int i13 = i3 << 3;
                        m1756DropdownMenu4kj_NE(z, function0, modifier2, j5, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties3, function3, composerStartRestartGroup, (i3 & 8190) | (458752 & i13) | (i13 & 3670016), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier2;
                        jM6956DpOffsetYgX7TsA = j5;
                        popupProperties4 = popupProperties3;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        final long j6 = jM6956DpOffsetYgX7TsA;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$3
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

                            public final void invoke(Composer composer2, int i14) {
                                AndroidMenu_androidKt.m1757DropdownMenuILWXrKs(z, function0, modifier3, j6, popupProperties4, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                    }
                }
                i3 |= 3072;
                jM6956DpOffsetYgX7TsA = j;
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 24576) == 0) {
                        popupProperties2 = popupProperties;
                        if (composerStartRestartGroup.changed(popupProperties2)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    if ((i2 & 32) != 0) {
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        if (composerStartRestartGroup.changedInstance(function3)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                        i3 |= i10;
                    }
                    if ((74899 & i3) == 74898) {
                        if (i4 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i6 != 0) {
                            jM6956DpOffsetYgX7TsA = DpKt.m6956DpOffsetYgX7TsA(Dp.m6935constructorimpl(0.0f), Dp.m6935constructorimpl(0.0f));
                        }
                        long j7 = jM6956DpOffsetYgX7TsA;
                        if (i8 != 0) {
                            popupProperties3 = new PopupProperties(true, false, false, (SecureFlagPolicy) null, false, false, 62, (DefaultConstructorMarker) null);
                        } else {
                            popupProperties3 = popupProperties2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(354826666, i3, -1, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:141)");
                        }
                        int i14 = i3 << 3;
                        m1756DropdownMenu4kj_NE(z, function0, modifier2, j7, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties3, function3, composerStartRestartGroup, (i3 & 8190) | (458752 & i14) | (i14 & 3670016), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier2;
                        jM6956DpOffsetYgX7TsA = j7;
                        popupProperties4 = popupProperties3;
                    } else {
                        if (i4 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i6 != 0) {
                            jM6956DpOffsetYgX7TsA = DpKt.m6956DpOffsetYgX7TsA(Dp.m6935constructorimpl(0.0f), Dp.m6935constructorimpl(0.0f));
                        }
                        long j8 = jM6956DpOffsetYgX7TsA;
                        if (i8 != 0) {
                            popupProperties3 = new PopupProperties(true, false, false, (SecureFlagPolicy) null, false, false, 62, (DefaultConstructorMarker) null);
                        } else {
                            popupProperties3 = popupProperties2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(354826666, i3, -1, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:141)");
                        }
                        int i15 = i3 << 3;
                        m1756DropdownMenu4kj_NE(z, function0, modifier2, j8, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties3, function3, composerStartRestartGroup, (i3 & 8190) | (458752 & i15) | (i15 & 3670016), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier2;
                        jM6956DpOffsetYgX7TsA = j8;
                        popupProperties4 = popupProperties3;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        final long j9 = jM6956DpOffsetYgX7TsA;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$3
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

                            public final void invoke(Composer composer2, int i16) {
                                AndroidMenu_androidKt.m1757DropdownMenuILWXrKs(z, function0, modifier3, j9, popupProperties4, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                    }
                }
                i3 |= 24576;
                popupProperties2 = popupProperties;
                if ((i2 & 32) != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i3 |= i10;
                }
                if ((74899 & i3) == 74898) {
                    if (i4 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i6 != 0) {
                        jM6956DpOffsetYgX7TsA = DpKt.m6956DpOffsetYgX7TsA(Dp.m6935constructorimpl(0.0f), Dp.m6935constructorimpl(0.0f));
                    }
                    long j10 = jM6956DpOffsetYgX7TsA;
                    if (i8 != 0) {
                        popupProperties3 = new PopupProperties(true, false, false, (SecureFlagPolicy) null, false, false, 62, (DefaultConstructorMarker) null);
                    } else {
                        popupProperties3 = popupProperties2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(354826666, i3, -1, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:141)");
                    }
                    int i16 = i3 << 3;
                    m1756DropdownMenu4kj_NE(z, function0, modifier2, j10, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties3, function3, composerStartRestartGroup, (i3 & 8190) | (458752 & i16) | (i16 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    jM6956DpOffsetYgX7TsA = j10;
                    popupProperties4 = popupProperties3;
                } else {
                    if (i4 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i6 != 0) {
                        jM6956DpOffsetYgX7TsA = DpKt.m6956DpOffsetYgX7TsA(Dp.m6935constructorimpl(0.0f), Dp.m6935constructorimpl(0.0f));
                    }
                    long j11 = jM6956DpOffsetYgX7TsA;
                    if (i8 != 0) {
                        popupProperties3 = new PopupProperties(true, false, false, (SecureFlagPolicy) null, false, false, 62, (DefaultConstructorMarker) null);
                    } else {
                        popupProperties3 = popupProperties2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(354826666, i3, -1, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:141)");
                    }
                    int i17 = i3 << 3;
                    m1756DropdownMenu4kj_NE(z, function0, modifier2, j11, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties3, function3, composerStartRestartGroup, (i3 & 8190) | (458752 & i17) | (i17 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    jM6956DpOffsetYgX7TsA = j11;
                    popupProperties4 = popupProperties3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final long j12 = jM6956DpOffsetYgX7TsA;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$3
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

                        public final void invoke(Composer composer2, int i18) {
                            AndroidMenu_androidKt.m1757DropdownMenuILWXrKs(z, function0, modifier3, j12, popupProperties4, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 384;
            modifier2 = modifier;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    jM6956DpOffsetYgX7TsA = j;
                    if (composerStartRestartGroup.changed(jM6956DpOffsetYgX7TsA)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 24576) == 0) {
                        popupProperties2 = popupProperties;
                        if (composerStartRestartGroup.changed(popupProperties2)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    if ((i2 & 32) != 0) {
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        if (composerStartRestartGroup.changedInstance(function3)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                        i3 |= i10;
                    }
                    if ((74899 & i3) == 74898) {
                        if (i4 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i6 != 0) {
                            jM6956DpOffsetYgX7TsA = DpKt.m6956DpOffsetYgX7TsA(Dp.m6935constructorimpl(0.0f), Dp.m6935constructorimpl(0.0f));
                        }
                        long j13 = jM6956DpOffsetYgX7TsA;
                        if (i8 != 0) {
                            popupProperties3 = new PopupProperties(true, false, false, (SecureFlagPolicy) null, false, false, 62, (DefaultConstructorMarker) null);
                        } else {
                            popupProperties3 = popupProperties2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(354826666, i3, -1, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:141)");
                        }
                        int i18 = i3 << 3;
                        m1756DropdownMenu4kj_NE(z, function0, modifier2, j13, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties3, function3, composerStartRestartGroup, (i3 & 8190) | (458752 & i18) | (i18 & 3670016), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier2;
                        jM6956DpOffsetYgX7TsA = j13;
                        popupProperties4 = popupProperties3;
                    } else {
                        if (i4 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i6 != 0) {
                            jM6956DpOffsetYgX7TsA = DpKt.m6956DpOffsetYgX7TsA(Dp.m6935constructorimpl(0.0f), Dp.m6935constructorimpl(0.0f));
                        }
                        long j14 = jM6956DpOffsetYgX7TsA;
                        if (i8 != 0) {
                            popupProperties3 = new PopupProperties(true, false, false, (SecureFlagPolicy) null, false, false, 62, (DefaultConstructorMarker) null);
                        } else {
                            popupProperties3 = popupProperties2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(354826666, i3, -1, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:141)");
                        }
                        int i19 = i3 << 3;
                        m1756DropdownMenu4kj_NE(z, function0, modifier2, j14, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties3, function3, composerStartRestartGroup, (i3 & 8190) | (458752 & i19) | (i19 & 3670016), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier2;
                        jM6956DpOffsetYgX7TsA = j14;
                        popupProperties4 = popupProperties3;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        final long j15 = jM6956DpOffsetYgX7TsA;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$3
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

                            public final void invoke(Composer composer2, int i110) {
                                AndroidMenu_androidKt.m1757DropdownMenuILWXrKs(z, function0, modifier3, j15, popupProperties4, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                    }
                }
                i3 |= 24576;
                popupProperties2 = popupProperties;
                if ((i2 & 32) != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i3 |= i10;
                }
                if ((74899 & i3) == 74898) {
                    if (i4 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i6 != 0) {
                        jM6956DpOffsetYgX7TsA = DpKt.m6956DpOffsetYgX7TsA(Dp.m6935constructorimpl(0.0f), Dp.m6935constructorimpl(0.0f));
                    }
                    long j16 = jM6956DpOffsetYgX7TsA;
                    if (i8 != 0) {
                        popupProperties3 = new PopupProperties(true, false, false, (SecureFlagPolicy) null, false, false, 62, (DefaultConstructorMarker) null);
                    } else {
                        popupProperties3 = popupProperties2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(354826666, i3, -1, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:141)");
                    }
                    int i110 = i3 << 3;
                    m1756DropdownMenu4kj_NE(z, function0, modifier2, j16, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties3, function3, composerStartRestartGroup, (i3 & 8190) | (458752 & i110) | (i110 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    jM6956DpOffsetYgX7TsA = j16;
                    popupProperties4 = popupProperties3;
                } else {
                    if (i4 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i6 != 0) {
                        jM6956DpOffsetYgX7TsA = DpKt.m6956DpOffsetYgX7TsA(Dp.m6935constructorimpl(0.0f), Dp.m6935constructorimpl(0.0f));
                    }
                    long j17 = jM6956DpOffsetYgX7TsA;
                    if (i8 != 0) {
                        popupProperties3 = new PopupProperties(true, false, false, (SecureFlagPolicy) null, false, false, 62, (DefaultConstructorMarker) null);
                    } else {
                        popupProperties3 = popupProperties2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(354826666, i3, -1, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:141)");
                    }
                    int i111 = i3 << 3;
                    m1756DropdownMenu4kj_NE(z, function0, modifier2, j17, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties3, function3, composerStartRestartGroup, (i3 & 8190) | (458752 & i111) | (i111 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    jM6956DpOffsetYgX7TsA = j17;
                    popupProperties4 = popupProperties3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final long j18 = jM6956DpOffsetYgX7TsA;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$3
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

                        public final void invoke(Composer composer2, int i112) {
                            AndroidMenu_androidKt.m1757DropdownMenuILWXrKs(z, function0, modifier3, j18, popupProperties4, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 3072;
            jM6956DpOffsetYgX7TsA = j;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 24576) == 0) {
                    popupProperties2 = popupProperties;
                    if (composerStartRestartGroup.changed(popupProperties2)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                if ((i2 & 32) != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i3 |= i10;
                }
                if ((74899 & i3) == 74898) {
                    if (i4 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i6 != 0) {
                        jM6956DpOffsetYgX7TsA = DpKt.m6956DpOffsetYgX7TsA(Dp.m6935constructorimpl(0.0f), Dp.m6935constructorimpl(0.0f));
                    }
                    long j19 = jM6956DpOffsetYgX7TsA;
                    if (i8 != 0) {
                        popupProperties3 = new PopupProperties(true, false, false, (SecureFlagPolicy) null, false, false, 62, (DefaultConstructorMarker) null);
                    } else {
                        popupProperties3 = popupProperties2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(354826666, i3, -1, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:141)");
                    }
                    int i112 = i3 << 3;
                    m1756DropdownMenu4kj_NE(z, function0, modifier2, j19, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties3, function3, composerStartRestartGroup, (i3 & 8190) | (458752 & i112) | (i112 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    jM6956DpOffsetYgX7TsA = j19;
                    popupProperties4 = popupProperties3;
                } else {
                    if (i4 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i6 != 0) {
                        jM6956DpOffsetYgX7TsA = DpKt.m6956DpOffsetYgX7TsA(Dp.m6935constructorimpl(0.0f), Dp.m6935constructorimpl(0.0f));
                    }
                    long j110 = jM6956DpOffsetYgX7TsA;
                    if (i8 != 0) {
                        popupProperties3 = new PopupProperties(true, false, false, (SecureFlagPolicy) null, false, false, 62, (DefaultConstructorMarker) null);
                    } else {
                        popupProperties3 = popupProperties2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(354826666, i3, -1, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:141)");
                    }
                    int i113 = i3 << 3;
                    m1756DropdownMenu4kj_NE(z, function0, modifier2, j110, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties3, function3, composerStartRestartGroup, (i3 & 8190) | (458752 & i113) | (i113 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    jM6956DpOffsetYgX7TsA = j110;
                    popupProperties4 = popupProperties3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final long j111 = jM6956DpOffsetYgX7TsA;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$3
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

                        public final void invoke(Composer composer2, int i114) {
                            AndroidMenu_androidKt.m1757DropdownMenuILWXrKs(z, function0, modifier3, j111, popupProperties4, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 24576;
            popupProperties2 = popupProperties;
            if ((i2 & 32) != 0) {
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                if (composerStartRestartGroup.changedInstance(function3)) {
                    i10 = 131072;
                } else {
                    i10 = 65536;
                }
                i3 |= i10;
            }
            if ((74899 & i3) == 74898) {
                if (i4 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i6 != 0) {
                    jM6956DpOffsetYgX7TsA = DpKt.m6956DpOffsetYgX7TsA(Dp.m6935constructorimpl(0.0f), Dp.m6935constructorimpl(0.0f));
                }
                long j112 = jM6956DpOffsetYgX7TsA;
                if (i8 != 0) {
                    popupProperties3 = new PopupProperties(true, false, false, (SecureFlagPolicy) null, false, false, 62, (DefaultConstructorMarker) null);
                } else {
                    popupProperties3 = popupProperties2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(354826666, i3, -1, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:141)");
                }
                int i114 = i3 << 3;
                m1756DropdownMenu4kj_NE(z, function0, modifier2, j112, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties3, function3, composerStartRestartGroup, (i3 & 8190) | (458752 & i114) | (i114 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                jM6956DpOffsetYgX7TsA = j112;
                popupProperties4 = popupProperties3;
            } else {
                if (i4 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i6 != 0) {
                    jM6956DpOffsetYgX7TsA = DpKt.m6956DpOffsetYgX7TsA(Dp.m6935constructorimpl(0.0f), Dp.m6935constructorimpl(0.0f));
                }
                long j113 = jM6956DpOffsetYgX7TsA;
                if (i8 != 0) {
                    popupProperties3 = new PopupProperties(true, false, false, (SecureFlagPolicy) null, false, false, 62, (DefaultConstructorMarker) null);
                } else {
                    popupProperties3 = popupProperties2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(354826666, i3, -1, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:141)");
                }
                int i115 = i3 << 3;
                m1756DropdownMenu4kj_NE(z, function0, modifier2, j113, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties3, function3, composerStartRestartGroup, (i3 & 8190) | (458752 & i115) | (i115 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                jM6956DpOffsetYgX7TsA = j113;
                popupProperties4 = popupProperties3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final long j114 = jM6956DpOffsetYgX7TsA;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$3
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

                    public final void invoke(Composer composer2, int i116) {
                        AndroidMenu_androidKt.m1757DropdownMenuILWXrKs(z, function0, modifier3, j114, popupProperties4, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 48;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                if (composerStartRestartGroup.changed(modifier2)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    jM6956DpOffsetYgX7TsA = j;
                    if (composerStartRestartGroup.changed(jM6956DpOffsetYgX7TsA)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 24576) == 0) {
                        popupProperties2 = popupProperties;
                        if (composerStartRestartGroup.changed(popupProperties2)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    if ((i2 & 32) != 0) {
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        if (composerStartRestartGroup.changedInstance(function3)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                        i3 |= i10;
                    }
                    if ((74899 & i3) == 74898) {
                        if (i4 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i6 != 0) {
                            jM6956DpOffsetYgX7TsA = DpKt.m6956DpOffsetYgX7TsA(Dp.m6935constructorimpl(0.0f), Dp.m6935constructorimpl(0.0f));
                        }
                        long j115 = jM6956DpOffsetYgX7TsA;
                        if (i8 != 0) {
                            popupProperties3 = new PopupProperties(true, false, false, (SecureFlagPolicy) null, false, false, 62, (DefaultConstructorMarker) null);
                        } else {
                            popupProperties3 = popupProperties2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(354826666, i3, -1, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:141)");
                        }
                        int i116 = i3 << 3;
                        m1756DropdownMenu4kj_NE(z, function0, modifier2, j115, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties3, function3, composerStartRestartGroup, (i3 & 8190) | (458752 & i116) | (i116 & 3670016), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier2;
                        jM6956DpOffsetYgX7TsA = j115;
                        popupProperties4 = popupProperties3;
                    } else {
                        if (i4 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i6 != 0) {
                            jM6956DpOffsetYgX7TsA = DpKt.m6956DpOffsetYgX7TsA(Dp.m6935constructorimpl(0.0f), Dp.m6935constructorimpl(0.0f));
                        }
                        long j116 = jM6956DpOffsetYgX7TsA;
                        if (i8 != 0) {
                            popupProperties3 = new PopupProperties(true, false, false, (SecureFlagPolicy) null, false, false, 62, (DefaultConstructorMarker) null);
                        } else {
                            popupProperties3 = popupProperties2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(354826666, i3, -1, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:141)");
                        }
                        int i117 = i3 << 3;
                        m1756DropdownMenu4kj_NE(z, function0, modifier2, j116, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties3, function3, composerStartRestartGroup, (i3 & 8190) | (458752 & i117) | (i117 & 3670016), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier2;
                        jM6956DpOffsetYgX7TsA = j116;
                        popupProperties4 = popupProperties3;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        final long j117 = jM6956DpOffsetYgX7TsA;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$3
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

                            public final void invoke(Composer composer2, int i118) {
                                AndroidMenu_androidKt.m1757DropdownMenuILWXrKs(z, function0, modifier3, j117, popupProperties4, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                    }
                }
                i3 |= 24576;
                popupProperties2 = popupProperties;
                if ((i2 & 32) != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i3 |= i10;
                }
                if ((74899 & i3) == 74898) {
                    if (i4 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i6 != 0) {
                        jM6956DpOffsetYgX7TsA = DpKt.m6956DpOffsetYgX7TsA(Dp.m6935constructorimpl(0.0f), Dp.m6935constructorimpl(0.0f));
                    }
                    long j118 = jM6956DpOffsetYgX7TsA;
                    if (i8 != 0) {
                        popupProperties3 = new PopupProperties(true, false, false, (SecureFlagPolicy) null, false, false, 62, (DefaultConstructorMarker) null);
                    } else {
                        popupProperties3 = popupProperties2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(354826666, i3, -1, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:141)");
                    }
                    int i118 = i3 << 3;
                    m1756DropdownMenu4kj_NE(z, function0, modifier2, j118, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties3, function3, composerStartRestartGroup, (i3 & 8190) | (458752 & i118) | (i118 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    jM6956DpOffsetYgX7TsA = j118;
                    popupProperties4 = popupProperties3;
                } else {
                    if (i4 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i6 != 0) {
                        jM6956DpOffsetYgX7TsA = DpKt.m6956DpOffsetYgX7TsA(Dp.m6935constructorimpl(0.0f), Dp.m6935constructorimpl(0.0f));
                    }
                    long j119 = jM6956DpOffsetYgX7TsA;
                    if (i8 != 0) {
                        popupProperties3 = new PopupProperties(true, false, false, (SecureFlagPolicy) null, false, false, 62, (DefaultConstructorMarker) null);
                    } else {
                        popupProperties3 = popupProperties2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(354826666, i3, -1, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:141)");
                    }
                    int i119 = i3 << 3;
                    m1756DropdownMenu4kj_NE(z, function0, modifier2, j119, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties3, function3, composerStartRestartGroup, (i3 & 8190) | (458752 & i119) | (i119 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    jM6956DpOffsetYgX7TsA = j119;
                    popupProperties4 = popupProperties3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final long j1110 = jM6956DpOffsetYgX7TsA;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$3
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

                        public final void invoke(Composer composer2, int i1110) {
                            AndroidMenu_androidKt.m1757DropdownMenuILWXrKs(z, function0, modifier3, j1110, popupProperties4, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 3072;
            jM6956DpOffsetYgX7TsA = j;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 24576) == 0) {
                    popupProperties2 = popupProperties;
                    if (composerStartRestartGroup.changed(popupProperties2)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                if ((i2 & 32) != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i3 |= i10;
                }
                if ((74899 & i3) == 74898) {
                    if (i4 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i6 != 0) {
                        jM6956DpOffsetYgX7TsA = DpKt.m6956DpOffsetYgX7TsA(Dp.m6935constructorimpl(0.0f), Dp.m6935constructorimpl(0.0f));
                    }
                    long j1111 = jM6956DpOffsetYgX7TsA;
                    if (i8 != 0) {
                        popupProperties3 = new PopupProperties(true, false, false, (SecureFlagPolicy) null, false, false, 62, (DefaultConstructorMarker) null);
                    } else {
                        popupProperties3 = popupProperties2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(354826666, i3, -1, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:141)");
                    }
                    int i1110 = i3 << 3;
                    m1756DropdownMenu4kj_NE(z, function0, modifier2, j1111, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties3, function3, composerStartRestartGroup, (i3 & 8190) | (458752 & i1110) | (i1110 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    jM6956DpOffsetYgX7TsA = j1111;
                    popupProperties4 = popupProperties3;
                } else {
                    if (i4 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i6 != 0) {
                        jM6956DpOffsetYgX7TsA = DpKt.m6956DpOffsetYgX7TsA(Dp.m6935constructorimpl(0.0f), Dp.m6935constructorimpl(0.0f));
                    }
                    long j1112 = jM6956DpOffsetYgX7TsA;
                    if (i8 != 0) {
                        popupProperties3 = new PopupProperties(true, false, false, (SecureFlagPolicy) null, false, false, 62, (DefaultConstructorMarker) null);
                    } else {
                        popupProperties3 = popupProperties2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(354826666, i3, -1, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:141)");
                    }
                    int i1111 = i3 << 3;
                    m1756DropdownMenu4kj_NE(z, function0, modifier2, j1112, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties3, function3, composerStartRestartGroup, (i3 & 8190) | (458752 & i1111) | (i1111 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    jM6956DpOffsetYgX7TsA = j1112;
                    popupProperties4 = popupProperties3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final long j1113 = jM6956DpOffsetYgX7TsA;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$3
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

                        public final void invoke(Composer composer2, int i1112) {
                            AndroidMenu_androidKt.m1757DropdownMenuILWXrKs(z, function0, modifier3, j1113, popupProperties4, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 24576;
            popupProperties2 = popupProperties;
            if ((i2 & 32) != 0) {
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                if (composerStartRestartGroup.changedInstance(function3)) {
                    i10 = 131072;
                } else {
                    i10 = 65536;
                }
                i3 |= i10;
            }
            if ((74899 & i3) == 74898) {
                if (i4 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i6 != 0) {
                    jM6956DpOffsetYgX7TsA = DpKt.m6956DpOffsetYgX7TsA(Dp.m6935constructorimpl(0.0f), Dp.m6935constructorimpl(0.0f));
                }
                long j1114 = jM6956DpOffsetYgX7TsA;
                if (i8 != 0) {
                    popupProperties3 = new PopupProperties(true, false, false, (SecureFlagPolicy) null, false, false, 62, (DefaultConstructorMarker) null);
                } else {
                    popupProperties3 = popupProperties2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(354826666, i3, -1, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:141)");
                }
                int i1112 = i3 << 3;
                m1756DropdownMenu4kj_NE(z, function0, modifier2, j1114, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties3, function3, composerStartRestartGroup, (i3 & 8190) | (458752 & i1112) | (i1112 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                jM6956DpOffsetYgX7TsA = j1114;
                popupProperties4 = popupProperties3;
            } else {
                if (i4 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i6 != 0) {
                    jM6956DpOffsetYgX7TsA = DpKt.m6956DpOffsetYgX7TsA(Dp.m6935constructorimpl(0.0f), Dp.m6935constructorimpl(0.0f));
                }
                long j1115 = jM6956DpOffsetYgX7TsA;
                if (i8 != 0) {
                    popupProperties3 = new PopupProperties(true, false, false, (SecureFlagPolicy) null, false, false, 62, (DefaultConstructorMarker) null);
                } else {
                    popupProperties3 = popupProperties2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(354826666, i3, -1, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:141)");
                }
                int i1113 = i3 << 3;
                m1756DropdownMenu4kj_NE(z, function0, modifier2, j1115, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties3, function3, composerStartRestartGroup, (i3 & 8190) | (458752 & i1113) | (i1113 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                jM6956DpOffsetYgX7TsA = j1115;
                popupProperties4 = popupProperties3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final long j1116 = jM6956DpOffsetYgX7TsA;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$3
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

                    public final void invoke(Composer composer2, int i1114) {
                        AndroidMenu_androidKt.m1757DropdownMenuILWXrKs(z, function0, modifier3, j1116, popupProperties4, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 384;
        modifier2 = modifier;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 3072) == 0) {
                jM6956DpOffsetYgX7TsA = j;
                if (composerStartRestartGroup.changed(jM6956DpOffsetYgX7TsA)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i3 |= i7;
            }
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 24576) == 0) {
                    popupProperties2 = popupProperties;
                    if (composerStartRestartGroup.changed(popupProperties2)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                if ((i2 & 32) != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i3 |= i10;
                }
                if ((74899 & i3) == 74898) {
                    if (i4 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i6 != 0) {
                        jM6956DpOffsetYgX7TsA = DpKt.m6956DpOffsetYgX7TsA(Dp.m6935constructorimpl(0.0f), Dp.m6935constructorimpl(0.0f));
                    }
                    long j1117 = jM6956DpOffsetYgX7TsA;
                    if (i8 != 0) {
                        popupProperties3 = new PopupProperties(true, false, false, (SecureFlagPolicy) null, false, false, 62, (DefaultConstructorMarker) null);
                    } else {
                        popupProperties3 = popupProperties2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(354826666, i3, -1, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:141)");
                    }
                    int i1114 = i3 << 3;
                    m1756DropdownMenu4kj_NE(z, function0, modifier2, j1117, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties3, function3, composerStartRestartGroup, (i3 & 8190) | (458752 & i1114) | (i1114 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    jM6956DpOffsetYgX7TsA = j1117;
                    popupProperties4 = popupProperties3;
                } else {
                    if (i4 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i6 != 0) {
                        jM6956DpOffsetYgX7TsA = DpKt.m6956DpOffsetYgX7TsA(Dp.m6935constructorimpl(0.0f), Dp.m6935constructorimpl(0.0f));
                    }
                    long j1118 = jM6956DpOffsetYgX7TsA;
                    if (i8 != 0) {
                        popupProperties3 = new PopupProperties(true, false, false, (SecureFlagPolicy) null, false, false, 62, (DefaultConstructorMarker) null);
                    } else {
                        popupProperties3 = popupProperties2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(354826666, i3, -1, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:141)");
                    }
                    int i1115 = i3 << 3;
                    m1756DropdownMenu4kj_NE(z, function0, modifier2, j1118, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties3, function3, composerStartRestartGroup, (i3 & 8190) | (458752 & i1115) | (i1115 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    jM6956DpOffsetYgX7TsA = j1118;
                    popupProperties4 = popupProperties3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final long j1119 = jM6956DpOffsetYgX7TsA;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$3
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

                        public final void invoke(Composer composer2, int i1116) {
                            AndroidMenu_androidKt.m1757DropdownMenuILWXrKs(z, function0, modifier3, j1119, popupProperties4, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 24576;
            popupProperties2 = popupProperties;
            if ((i2 & 32) != 0) {
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                if (composerStartRestartGroup.changedInstance(function3)) {
                    i10 = 131072;
                } else {
                    i10 = 65536;
                }
                i3 |= i10;
            }
            if ((74899 & i3) == 74898) {
                if (i4 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i6 != 0) {
                    jM6956DpOffsetYgX7TsA = DpKt.m6956DpOffsetYgX7TsA(Dp.m6935constructorimpl(0.0f), Dp.m6935constructorimpl(0.0f));
                }
                long j11110 = jM6956DpOffsetYgX7TsA;
                if (i8 != 0) {
                    popupProperties3 = new PopupProperties(true, false, false, (SecureFlagPolicy) null, false, false, 62, (DefaultConstructorMarker) null);
                } else {
                    popupProperties3 = popupProperties2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(354826666, i3, -1, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:141)");
                }
                int i1116 = i3 << 3;
                m1756DropdownMenu4kj_NE(z, function0, modifier2, j11110, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties3, function3, composerStartRestartGroup, (i3 & 8190) | (458752 & i1116) | (i1116 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                jM6956DpOffsetYgX7TsA = j11110;
                popupProperties4 = popupProperties3;
            } else {
                if (i4 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i6 != 0) {
                    jM6956DpOffsetYgX7TsA = DpKt.m6956DpOffsetYgX7TsA(Dp.m6935constructorimpl(0.0f), Dp.m6935constructorimpl(0.0f));
                }
                long j11111 = jM6956DpOffsetYgX7TsA;
                if (i8 != 0) {
                    popupProperties3 = new PopupProperties(true, false, false, (SecureFlagPolicy) null, false, false, 62, (DefaultConstructorMarker) null);
                } else {
                    popupProperties3 = popupProperties2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(354826666, i3, -1, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:141)");
                }
                int i1117 = i3 << 3;
                m1756DropdownMenu4kj_NE(z, function0, modifier2, j11111, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties3, function3, composerStartRestartGroup, (i3 & 8190) | (458752 & i1117) | (i1117 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                jM6956DpOffsetYgX7TsA = j11111;
                popupProperties4 = popupProperties3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final long j11112 = jM6956DpOffsetYgX7TsA;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$3
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

                    public final void invoke(Composer composer2, int i1118) {
                        AndroidMenu_androidKt.m1757DropdownMenuILWXrKs(z, function0, modifier3, j11112, popupProperties4, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 3072;
        jM6956DpOffsetYgX7TsA = j;
        i8 = i2 & 16;
        if (i8 != 0) {
            if ((i & 24576) == 0) {
                popupProperties2 = popupProperties;
                if (composerStartRestartGroup.changed(popupProperties2)) {
                    i9 = 16384;
                } else {
                    i9 = 8192;
                }
                i3 |= i9;
            }
            if ((i2 & 32) != 0) {
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                if (composerStartRestartGroup.changedInstance(function3)) {
                    i10 = 131072;
                } else {
                    i10 = 65536;
                }
                i3 |= i10;
            }
            if ((74899 & i3) == 74898) {
                if (i4 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i6 != 0) {
                    jM6956DpOffsetYgX7TsA = DpKt.m6956DpOffsetYgX7TsA(Dp.m6935constructorimpl(0.0f), Dp.m6935constructorimpl(0.0f));
                }
                long j11113 = jM6956DpOffsetYgX7TsA;
                if (i8 != 0) {
                    popupProperties3 = new PopupProperties(true, false, false, (SecureFlagPolicy) null, false, false, 62, (DefaultConstructorMarker) null);
                } else {
                    popupProperties3 = popupProperties2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(354826666, i3, -1, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:141)");
                }
                int i1118 = i3 << 3;
                m1756DropdownMenu4kj_NE(z, function0, modifier2, j11113, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties3, function3, composerStartRestartGroup, (i3 & 8190) | (458752 & i1118) | (i1118 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                jM6956DpOffsetYgX7TsA = j11113;
                popupProperties4 = popupProperties3;
            } else {
                if (i4 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i6 != 0) {
                    jM6956DpOffsetYgX7TsA = DpKt.m6956DpOffsetYgX7TsA(Dp.m6935constructorimpl(0.0f), Dp.m6935constructorimpl(0.0f));
                }
                long j11114 = jM6956DpOffsetYgX7TsA;
                if (i8 != 0) {
                    popupProperties3 = new PopupProperties(true, false, false, (SecureFlagPolicy) null, false, false, 62, (DefaultConstructorMarker) null);
                } else {
                    popupProperties3 = popupProperties2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(354826666, i3, -1, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:141)");
                }
                int i1119 = i3 << 3;
                m1756DropdownMenu4kj_NE(z, function0, modifier2, j11114, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties3, function3, composerStartRestartGroup, (i3 & 8190) | (458752 & i1119) | (i1119 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                jM6956DpOffsetYgX7TsA = j11114;
                popupProperties4 = popupProperties3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final long j11115 = jM6956DpOffsetYgX7TsA;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$3
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

                    public final void invoke(Composer composer2, int i11110) {
                        AndroidMenu_androidKt.m1757DropdownMenuILWXrKs(z, function0, modifier3, j11115, popupProperties4, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 24576;
        popupProperties2 = popupProperties;
        if ((i2 & 32) != 0) {
            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            if (composerStartRestartGroup.changedInstance(function3)) {
                i10 = 131072;
            } else {
                i10 = 65536;
            }
            i3 |= i10;
        }
        if ((74899 & i3) == 74898) {
            if (i4 != 0) {
                modifier2 = Modifier.INSTANCE;
            }
            if (i6 != 0) {
                jM6956DpOffsetYgX7TsA = DpKt.m6956DpOffsetYgX7TsA(Dp.m6935constructorimpl(0.0f), Dp.m6935constructorimpl(0.0f));
            }
            long j11116 = jM6956DpOffsetYgX7TsA;
            if (i8 != 0) {
                popupProperties3 = new PopupProperties(true, false, false, (SecureFlagPolicy) null, false, false, 62, (DefaultConstructorMarker) null);
            } else {
                popupProperties3 = popupProperties2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(354826666, i3, -1, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:141)");
            }
            int i11110 = i3 << 3;
            m1756DropdownMenu4kj_NE(z, function0, modifier2, j11116, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties3, function3, composerStartRestartGroup, (i3 & 8190) | (458752 & i11110) | (i11110 & 3670016), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier2;
            jM6956DpOffsetYgX7TsA = j11116;
            popupProperties4 = popupProperties3;
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.INSTANCE;
            }
            if (i6 != 0) {
                jM6956DpOffsetYgX7TsA = DpKt.m6956DpOffsetYgX7TsA(Dp.m6935constructorimpl(0.0f), Dp.m6935constructorimpl(0.0f));
            }
            long j11117 = jM6956DpOffsetYgX7TsA;
            if (i8 != 0) {
                popupProperties3 = new PopupProperties(true, false, false, (SecureFlagPolicy) null, false, false, 62, (DefaultConstructorMarker) null);
            } else {
                popupProperties3 = popupProperties2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(354826666, i3, -1, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:141)");
            }
            int i11111 = i3 << 3;
            m1756DropdownMenu4kj_NE(z, function0, modifier2, j11117, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties3, function3, composerStartRestartGroup, (i3 & 8190) | (458752 & i11111) | (i11111 & 3670016), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier2;
            jM6956DpOffsetYgX7TsA = j11117;
            popupProperties4 = popupProperties3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final long j11118 = jM6956DpOffsetYgX7TsA;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$3
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

                public final void invoke(Composer composer2, int i11112) {
                    AndroidMenu_androidKt.m1757DropdownMenuILWXrKs(z, function0, modifier3, j11118, popupProperties4, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x011a  */
    /* JADX WARN: Code duplicated, block: B:104:0x012f  */
    /* JADX WARN: Code duplicated, block: B:106:0x0139  */
    /* JADX WARN: Code duplicated, block: B:112:0x014f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x0151  */
    /* JADX WARN: Code duplicated, block: B:114:0x0156  */
    /* JADX WARN: Code duplicated, block: B:117:0x015b  */
    /* JADX WARN: Code duplicated, block: B:120:0x015f  */
    /* JADX WARN: Code duplicated, block: B:122:0x0162  */
    /* JADX WARN: Code duplicated, block: B:123:0x0164  */
    /* JADX WARN: Code duplicated, block: B:126:0x0169  */
    /* JADX WARN: Code duplicated, block: B:127:0x0172  */
    /* JADX WARN: Code duplicated, block: B:129:0x0175  */
    /* JADX WARN: Code duplicated, block: B:130:0x017c  */
    /* JADX WARN: Code duplicated, block: B:132:0x0180  */
    /* JADX WARN: Code duplicated, block: B:134:0x0192  */
    /* JADX WARN: Code duplicated, block: B:136:0x019f A[PHI: r0 r3 r4 r5 r7 r8 r9
  0x019f: PHI (r0v7 androidx.compose.foundation.layout.PaddingValues) = (r0v3 androidx.compose.foundation.layout.PaddingValues), (r0v9 androidx.compose.foundation.layout.PaddingValues) binds: [B:131:0x017e, B:111:0x0147] A[DONT_GENERATE, DONT_INLINE]
  0x019f: PHI (r3v27 int) = (r3v22 int), (r3v28 int) binds: [B:131:0x017e, B:111:0x0147] A[DONT_GENERATE, DONT_INLINE]
  0x019f: PHI (r4v12 androidx.compose.ui.Modifier) = (r4v7 androidx.compose.ui.Modifier), (r4v14 androidx.compose.ui.Modifier) binds: [B:131:0x017e, B:111:0x0147] A[DONT_GENERATE, DONT_INLINE]
  0x019f: PHI (r5v9 kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) = 
  (r5v6 kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>)
  (r5v10 kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>)
 binds: [B:131:0x017e, B:111:0x0147] A[DONT_GENERATE, DONT_INLINE]
  0x019f: PHI (r7v10 boolean) = (r7v6 boolean), (r7v11 boolean) binds: [B:131:0x017e, B:111:0x0147] A[DONT_GENERATE, DONT_INLINE]
  0x019f: PHI (r8v7 kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) = 
  (r8v3 kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>)
  (r8v2 kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>)
 binds: [B:131:0x017e, B:111:0x0147] A[DONT_GENERATE, DONT_INLINE]
  0x019f: PHI (r9v12 androidx.compose.material3.MenuItemColors) = (r9v7 androidx.compose.material3.MenuItemColors), (r9v13 androidx.compose.material3.MenuItemColors) binds: [B:131:0x017e, B:111:0x0147] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:139:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:142:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:146:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:27:0x004e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0052  */
    /* JADX WARN: Code duplicated, block: B:31:0x005a  */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:49:0x0086  */
    /* JADX WARN: Code duplicated, block: B:51:0x008a  */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:54:0x0095  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:81:0x00da  */
    /* JADX WARN: Code duplicated, block: B:82:0x00df  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:86:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:91:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:92:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:94:0x0103  */
    /* JADX WARN: Code duplicated, block: B:96:0x0109  */
    /* JADX WARN: Code duplicated, block: B:97:0x010c  */
    public static final void DropdownMenuItem(final Function2<? super Composer, ? super Integer, Unit> function2, final Function0<Unit> function0, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function4, boolean z, MenuItemColors menuItemColors, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        Function2<? super Composer, ? super Integer, Unit> function5;
        int i7;
        int i8;
        Function2<? super Composer, ? super Integer, Unit> function6;
        int i9;
        int i10;
        boolean z2;
        int i11;
        MenuItemColors menuItemColors2;
        int i12;
        int i13;
        int i14;
        int i15;
        Modifier.Companion companion;
        final Function2<? super Composer, ? super Integer, Unit> function7;
        boolean z3;
        MenuItemColors menuItemColorsItemColors;
        PaddingValues dropdownMenuItemContentPadding;
        Object objRememberedValue;
        MutableInteractionSource mutableInteractionSource2;
        final Modifier modifier2;
        final boolean z4;
        final Function2<? super Composer, ? super Integer, Unit> function8;
        final MenuItemColors menuItemColors3;
        final PaddingValues paddingValues2;
        final MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1826340448);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) == 0) {
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    if (composerStartRestartGroup.changed(modifier)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 3072) == 0) {
                        function5 = function3;
                        if (composerStartRestartGroup.changedInstance(function5)) {
                            i7 = 2048;
                        } else {
                            i7 = 1024;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 16;
                    if (i8 != 0) {
                        if ((i & 24576) == 0) {
                            function6 = function4;
                            if (composerStartRestartGroup.changedInstance(function6)) {
                                i9 = 16384;
                            } else {
                                i9 = 8192;
                            }
                            i3 |= i9;
                        }
                        i10 = i2 & 32;
                        if (i10 != 0) {
                            if ((196608 & i) == 0) {
                                z2 = z;
                                if (composerStartRestartGroup.changed(z2)) {
                                    i11 = 131072;
                                } else {
                                    i11 = 65536;
                                }
                                i3 |= i11;
                            }
                            if ((1572864 & i) == 0) {
                                if ((i2 & 64) == 0) {
                                    menuItemColors2 = menuItemColors;
                                    int i16 = composerStartRestartGroup.changed(menuItemColors2) ? 1048576 : 524288;
                                    i3 |= i16;
                                } else {
                                    menuItemColors2 = menuItemColors;
                                }
                                i3 |= i16;
                            } else {
                                menuItemColors2 = menuItemColors;
                            }
                            i12 = i2 & 128;
                            if (i12 != 0) {
                                i3 |= 12582912;
                            } else if ((i & 12582912) == 0) {
                                if (composerStartRestartGroup.changed(paddingValues)) {
                                    i13 = 8388608;
                                } else {
                                    i13 = 4194304;
                                }
                                i3 |= i13;
                            }
                            i14 = i2 & 256;
                            if (i14 != 0) {
                                i3 |= 100663296;
                            } else if ((i & 100663296) == 0) {
                                if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                                    i15 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                                } else {
                                    i15 = 33554432;
                                }
                                i3 |= i15;
                            }
                            if ((i3 & 38347923) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.startDefaults();
                                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                    if (i4 != 0) {
                                        companion = Modifier.INSTANCE;
                                    } else {
                                        companion = modifier;
                                    }
                                    if (i6 != 0) {
                                        function5 = null;
                                    }
                                    function7 = i8 == 0 ? function6 : null;
                                    if (i10 != 0) {
                                        z3 = true;
                                    } else {
                                        z3 = z2;
                                    }
                                    if ((i2 & 64) != 0) {
                                        menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                                        i3 &= -3670017;
                                    } else {
                                        menuItemColorsItemColors = menuItemColors2;
                                    }
                                    if (i12 != 0) {
                                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                                    } else {
                                        dropdownMenuItemContentPadding = paddingValues;
                                    }
                                    if (i14 != 0) {
                                        composerStartRestartGroup.startReplaceableGroup(1989948114);
                                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                        }
                                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                                        composerStartRestartGroup.endReplaceableGroup();
                                    }
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1826340448, i3, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:189)");
                                    }
                                    MenuKt.DropdownMenuItemContent(function2, function0, companion, function5, function7, z3, menuItemColorsItemColors, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, i3 & 268435454);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    modifier2 = companion;
                                    z4 = z3;
                                    function8 = function5;
                                    menuItemColors3 = menuItemColorsItemColors;
                                    paddingValues2 = dropdownMenuItemContentPadding;
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    if ((i2 & 64) != 0) {
                                        i3 &= -3670017;
                                    }
                                    companion = modifier;
                                    dropdownMenuItemContentPadding = paddingValues;
                                    function7 = function6;
                                    z3 = z2;
                                    menuItemColorsItemColors = menuItemColors2;
                                }
                                mutableInteractionSource2 = mutableInteractionSource;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1826340448, i3, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:189)");
                                }
                                MenuKt.DropdownMenuItemContent(function2, function0, companion, function5, function7, z3, menuItemColorsItemColors, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, i3 & 268435454);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier2 = companion;
                                z4 = z3;
                                function8 = function5;
                                menuItemColors3 = menuItemColorsItemColors;
                                paddingValues2 = dropdownMenuItemContentPadding;
                                mutableInteractionSource3 = mutableInteractionSource2;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                modifier2 = modifier;
                                mutableInteractionSource3 = mutableInteractionSource;
                                function8 = function5;
                                function7 = function6;
                                z4 = z2;
                                menuItemColors3 = menuItemColors2;
                                paddingValues2 = paddingValues;
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt.DropdownMenuItem.2
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

                                    public final void invoke(Composer composer2, int i17) {
                                        AndroidMenu_androidKt.DropdownMenuItem(function2, function0, modifier2, function8, function7, z4, menuItemColors3, paddingValues2, mutableInteractionSource3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                    }
                                });
                            }
                        }
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        z2 = z;
                        if ((1572864 & i) == 0) {
                            if ((i2 & 64) == 0) {
                                menuItemColors2 = menuItemColors;
                                if (composerStartRestartGroup.changed(menuItemColors2)) {
                                }
                                i3 |= i16;
                            } else {
                                menuItemColors2 = menuItemColors;
                            }
                            i3 |= i16;
                        } else {
                            menuItemColors2 = menuItemColors;
                        }
                        i12 = i2 & 128;
                        if (i12 != 0) {
                            i3 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            if (composerStartRestartGroup.changed(paddingValues)) {
                                i13 = 8388608;
                            } else {
                                i13 = 4194304;
                            }
                            i3 |= i13;
                        }
                        i14 = i2 & 256;
                        if (i14 != 0) {
                            i3 |= 100663296;
                        } else if ((i & 100663296) == 0) {
                            if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                                i15 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                            } else {
                                i15 = 33554432;
                            }
                            i3 |= i15;
                        }
                        if ((i3 & 38347923) == 38347922) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if (i4 != 0) {
                                    companion = Modifier.INSTANCE;
                                } else {
                                    companion = modifier;
                                }
                                if (i6 != 0) {
                                    function5 = null;
                                }
                                if (i8 == 0) {
                                }
                                if (i10 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z2;
                                }
                                if ((i2 & 64) != 0) {
                                    menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                                    i3 &= -3670017;
                                } else {
                                    menuItemColorsItemColors = menuItemColors2;
                                }
                                if (i12 != 0) {
                                    dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                                } else {
                                    dropdownMenuItemContentPadding = paddingValues;
                                }
                                if (i14 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                            } else {
                                if (i4 != 0) {
                                    companion = Modifier.INSTANCE;
                                } else {
                                    companion = modifier;
                                }
                                if (i6 != 0) {
                                    function5 = null;
                                }
                                if (i8 == 0) {
                                }
                                if (i10 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z2;
                                }
                                if ((i2 & 64) != 0) {
                                    menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                                    i3 &= -3670017;
                                } else {
                                    menuItemColorsItemColors = menuItemColors2;
                                }
                                if (i12 != 0) {
                                    dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                                } else {
                                    dropdownMenuItemContentPadding = paddingValues;
                                }
                                if (i14 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1826340448, i3, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:189)");
                            }
                            MenuKt.DropdownMenuItemContent(function2, function0, companion, function5, function7, z3, menuItemColorsItemColors, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, i3 & 268435454);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier2 = companion;
                            z4 = z3;
                            function8 = function5;
                            menuItemColors3 = menuItemColorsItemColors;
                            paddingValues2 = dropdownMenuItemContentPadding;
                            mutableInteractionSource3 = mutableInteractionSource2;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if (i4 != 0) {
                                    companion = Modifier.INSTANCE;
                                } else {
                                    companion = modifier;
                                }
                                if (i6 != 0) {
                                    function5 = null;
                                }
                                if (i8 == 0) {
                                }
                                if (i10 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z2;
                                }
                                if ((i2 & 64) != 0) {
                                    menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                                    i3 &= -3670017;
                                } else {
                                    menuItemColorsItemColors = menuItemColors2;
                                }
                                if (i12 != 0) {
                                    dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                                } else {
                                    dropdownMenuItemContentPadding = paddingValues;
                                }
                                if (i14 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                            } else {
                                if (i4 != 0) {
                                    companion = Modifier.INSTANCE;
                                } else {
                                    companion = modifier;
                                }
                                if (i6 != 0) {
                                    function5 = null;
                                }
                                if (i8 == 0) {
                                }
                                if (i10 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z2;
                                }
                                if ((i2 & 64) != 0) {
                                    menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                                    i3 &= -3670017;
                                } else {
                                    menuItemColorsItemColors = menuItemColors2;
                                }
                                if (i12 != 0) {
                                    dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                                } else {
                                    dropdownMenuItemContentPadding = paddingValues;
                                }
                                if (i14 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1826340448, i3, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:189)");
                            }
                            MenuKt.DropdownMenuItemContent(function2, function0, companion, function5, function7, z3, menuItemColorsItemColors, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, i3 & 268435454);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier2 = companion;
                            z4 = z3;
                            function8 = function5;
                            menuItemColors3 = menuItemColorsItemColors;
                            paddingValues2 = dropdownMenuItemContentPadding;
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt.DropdownMenuItem.2
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

                                public final void invoke(Composer composer2, int i17) {
                                    AndroidMenu_androidKt.DropdownMenuItem(function2, function0, modifier2, function8, function7, z4, menuItemColors3, paddingValues2, mutableInteractionSource3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                }
                            });
                        }
                    }
                    i3 |= 24576;
                    function6 = function4;
                    i10 = i2 & 32;
                    if (i10 != 0) {
                        if ((196608 & i) == 0) {
                            z2 = z;
                            if (composerStartRestartGroup.changed(z2)) {
                                i11 = 131072;
                            } else {
                                i11 = 65536;
                            }
                            i3 |= i11;
                        }
                        if ((1572864 & i) == 0) {
                            if ((i2 & 64) == 0) {
                                menuItemColors2 = menuItemColors;
                                if (composerStartRestartGroup.changed(menuItemColors2)) {
                                }
                                i3 |= i16;
                            } else {
                                menuItemColors2 = menuItemColors;
                            }
                            i3 |= i16;
                        } else {
                            menuItemColors2 = menuItemColors;
                        }
                        i12 = i2 & 128;
                        if (i12 != 0) {
                            i3 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            if (composerStartRestartGroup.changed(paddingValues)) {
                                i13 = 8388608;
                            } else {
                                i13 = 4194304;
                            }
                            i3 |= i13;
                        }
                        i14 = i2 & 256;
                        if (i14 != 0) {
                            i3 |= 100663296;
                        } else if ((i & 100663296) == 0) {
                            if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                                i15 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                            } else {
                                i15 = 33554432;
                            }
                            i3 |= i15;
                        }
                        if ((i3 & 38347923) == 38347922) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if (i4 != 0) {
                                    companion = Modifier.INSTANCE;
                                } else {
                                    companion = modifier;
                                }
                                if (i6 != 0) {
                                    function5 = null;
                                }
                                if (i8 == 0) {
                                }
                                if (i10 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z2;
                                }
                                if ((i2 & 64) != 0) {
                                    menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                                    i3 &= -3670017;
                                } else {
                                    menuItemColorsItemColors = menuItemColors2;
                                }
                                if (i12 != 0) {
                                    dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                                } else {
                                    dropdownMenuItemContentPadding = paddingValues;
                                }
                                if (i14 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                            } else {
                                if (i4 != 0) {
                                    companion = Modifier.INSTANCE;
                                } else {
                                    companion = modifier;
                                }
                                if (i6 != 0) {
                                    function5 = null;
                                }
                                if (i8 == 0) {
                                }
                                if (i10 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z2;
                                }
                                if ((i2 & 64) != 0) {
                                    menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                                    i3 &= -3670017;
                                } else {
                                    menuItemColorsItemColors = menuItemColors2;
                                }
                                if (i12 != 0) {
                                    dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                                } else {
                                    dropdownMenuItemContentPadding = paddingValues;
                                }
                                if (i14 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1826340448, i3, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:189)");
                            }
                            MenuKt.DropdownMenuItemContent(function2, function0, companion, function5, function7, z3, menuItemColorsItemColors, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, i3 & 268435454);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier2 = companion;
                            z4 = z3;
                            function8 = function5;
                            menuItemColors3 = menuItemColorsItemColors;
                            paddingValues2 = dropdownMenuItemContentPadding;
                            mutableInteractionSource3 = mutableInteractionSource2;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if (i4 != 0) {
                                    companion = Modifier.INSTANCE;
                                } else {
                                    companion = modifier;
                                }
                                if (i6 != 0) {
                                    function5 = null;
                                }
                                if (i8 == 0) {
                                }
                                if (i10 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z2;
                                }
                                if ((i2 & 64) != 0) {
                                    menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                                    i3 &= -3670017;
                                } else {
                                    menuItemColorsItemColors = menuItemColors2;
                                }
                                if (i12 != 0) {
                                    dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                                } else {
                                    dropdownMenuItemContentPadding = paddingValues;
                                }
                                if (i14 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                            } else {
                                if (i4 != 0) {
                                    companion = Modifier.INSTANCE;
                                } else {
                                    companion = modifier;
                                }
                                if (i6 != 0) {
                                    function5 = null;
                                }
                                if (i8 == 0) {
                                }
                                if (i10 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z2;
                                }
                                if ((i2 & 64) != 0) {
                                    menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                                    i3 &= -3670017;
                                } else {
                                    menuItemColorsItemColors = menuItemColors2;
                                }
                                if (i12 != 0) {
                                    dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                                } else {
                                    dropdownMenuItemContentPadding = paddingValues;
                                }
                                if (i14 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1826340448, i3, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:189)");
                            }
                            MenuKt.DropdownMenuItemContent(function2, function0, companion, function5, function7, z3, menuItemColorsItemColors, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, i3 & 268435454);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier2 = companion;
                            z4 = z3;
                            function8 = function5;
                            menuItemColors3 = menuItemColorsItemColors;
                            paddingValues2 = dropdownMenuItemContentPadding;
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt.DropdownMenuItem.2
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

                                public final void invoke(Composer composer2, int i17) {
                                    AndroidMenu_androidKt.DropdownMenuItem(function2, function0, modifier2, function8, function7, z4, menuItemColors3, paddingValues2, mutableInteractionSource3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                }
                            });
                        }
                    }
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    z2 = z;
                    if ((1572864 & i) == 0) {
                        if ((i2 & 64) == 0) {
                            menuItemColors2 = menuItemColors;
                            if (composerStartRestartGroup.changed(menuItemColors2)) {
                            }
                            i3 |= i16;
                        } else {
                            menuItemColors2 = menuItemColors;
                        }
                        i3 |= i16;
                    } else {
                        menuItemColors2 = menuItemColors;
                    }
                    i12 = i2 & 128;
                    if (i12 != 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        if (composerStartRestartGroup.changed(paddingValues)) {
                            i13 = 8388608;
                        } else {
                            i13 = 4194304;
                        }
                        i3 |= i13;
                    }
                    i14 = i2 & 256;
                    if (i14 != 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                            i15 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        } else {
                            i15 = 33554432;
                        }
                        i3 |= i15;
                    }
                    if ((i3 & 38347923) == 38347922) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i4 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            if (i6 != 0) {
                                function5 = null;
                            }
                            if (i8 == 0) {
                            }
                            if (i10 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 64) != 0) {
                                menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                menuItemColorsItemColors = menuItemColors2;
                            }
                            if (i12 != 0) {
                                dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                            } else {
                                dropdownMenuItemContentPadding = paddingValues;
                            }
                            if (i14 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                        } else {
                            if (i4 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            if (i6 != 0) {
                                function5 = null;
                            }
                            if (i8 == 0) {
                            }
                            if (i10 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 64) != 0) {
                                menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                menuItemColorsItemColors = menuItemColors2;
                            }
                            if (i12 != 0) {
                                dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                            } else {
                                dropdownMenuItemContentPadding = paddingValues;
                            }
                            if (i14 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1826340448, i3, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:189)");
                        }
                        MenuKt.DropdownMenuItemContent(function2, function0, companion, function5, function7, z3, menuItemColorsItemColors, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, i3 & 268435454);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = companion;
                        z4 = z3;
                        function8 = function5;
                        menuItemColors3 = menuItemColorsItemColors;
                        paddingValues2 = dropdownMenuItemContentPadding;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i4 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            if (i6 != 0) {
                                function5 = null;
                            }
                            if (i8 == 0) {
                            }
                            if (i10 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 64) != 0) {
                                menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                menuItemColorsItemColors = menuItemColors2;
                            }
                            if (i12 != 0) {
                                dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                            } else {
                                dropdownMenuItemContentPadding = paddingValues;
                            }
                            if (i14 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                        } else {
                            if (i4 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            if (i6 != 0) {
                                function5 = null;
                            }
                            if (i8 == 0) {
                            }
                            if (i10 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 64) != 0) {
                                menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                menuItemColorsItemColors = menuItemColors2;
                            }
                            if (i12 != 0) {
                                dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                            } else {
                                dropdownMenuItemContentPadding = paddingValues;
                            }
                            if (i14 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1826340448, i3, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:189)");
                        }
                        MenuKt.DropdownMenuItemContent(function2, function0, companion, function5, function7, z3, menuItemColorsItemColors, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, i3 & 268435454);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = companion;
                        z4 = z3;
                        function8 = function5;
                        menuItemColors3 = menuItemColorsItemColors;
                        paddingValues2 = dropdownMenuItemContentPadding;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt.DropdownMenuItem.2
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

                            public final void invoke(Composer composer2, int i17) {
                                AndroidMenu_androidKt.DropdownMenuItem(function2, function0, modifier2, function8, function7, z4, menuItemColors3, paddingValues2, mutableInteractionSource3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                    }
                }
                i3 |= 3072;
                function5 = function3;
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 24576) == 0) {
                        function6 = function4;
                        if (composerStartRestartGroup.changedInstance(function6)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    i10 = i2 & 32;
                    if (i10 != 0) {
                        if ((196608 & i) == 0) {
                            z2 = z;
                            if (composerStartRestartGroup.changed(z2)) {
                                i11 = 131072;
                            } else {
                                i11 = 65536;
                            }
                            i3 |= i11;
                        }
                        if ((1572864 & i) == 0) {
                            if ((i2 & 64) == 0) {
                                menuItemColors2 = menuItemColors;
                                if (composerStartRestartGroup.changed(menuItemColors2)) {
                                }
                                i3 |= i16;
                            } else {
                                menuItemColors2 = menuItemColors;
                            }
                            i3 |= i16;
                        } else {
                            menuItemColors2 = menuItemColors;
                        }
                        i12 = i2 & 128;
                        if (i12 != 0) {
                            i3 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            if (composerStartRestartGroup.changed(paddingValues)) {
                                i13 = 8388608;
                            } else {
                                i13 = 4194304;
                            }
                            i3 |= i13;
                        }
                        i14 = i2 & 256;
                        if (i14 != 0) {
                            i3 |= 100663296;
                        } else if ((i & 100663296) == 0) {
                            if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                                i15 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                            } else {
                                i15 = 33554432;
                            }
                            i3 |= i15;
                        }
                        if ((i3 & 38347923) == 38347922) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if (i4 != 0) {
                                    companion = Modifier.INSTANCE;
                                } else {
                                    companion = modifier;
                                }
                                if (i6 != 0) {
                                    function5 = null;
                                }
                                if (i8 == 0) {
                                }
                                if (i10 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z2;
                                }
                                if ((i2 & 64) != 0) {
                                    menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                                    i3 &= -3670017;
                                } else {
                                    menuItemColorsItemColors = menuItemColors2;
                                }
                                if (i12 != 0) {
                                    dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                                } else {
                                    dropdownMenuItemContentPadding = paddingValues;
                                }
                                if (i14 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                            } else {
                                if (i4 != 0) {
                                    companion = Modifier.INSTANCE;
                                } else {
                                    companion = modifier;
                                }
                                if (i6 != 0) {
                                    function5 = null;
                                }
                                if (i8 == 0) {
                                }
                                if (i10 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z2;
                                }
                                if ((i2 & 64) != 0) {
                                    menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                                    i3 &= -3670017;
                                } else {
                                    menuItemColorsItemColors = menuItemColors2;
                                }
                                if (i12 != 0) {
                                    dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                                } else {
                                    dropdownMenuItemContentPadding = paddingValues;
                                }
                                if (i14 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1826340448, i3, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:189)");
                            }
                            MenuKt.DropdownMenuItemContent(function2, function0, companion, function5, function7, z3, menuItemColorsItemColors, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, i3 & 268435454);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier2 = companion;
                            z4 = z3;
                            function8 = function5;
                            menuItemColors3 = menuItemColorsItemColors;
                            paddingValues2 = dropdownMenuItemContentPadding;
                            mutableInteractionSource3 = mutableInteractionSource2;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if (i4 != 0) {
                                    companion = Modifier.INSTANCE;
                                } else {
                                    companion = modifier;
                                }
                                if (i6 != 0) {
                                    function5 = null;
                                }
                                if (i8 == 0) {
                                }
                                if (i10 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z2;
                                }
                                if ((i2 & 64) != 0) {
                                    menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                                    i3 &= -3670017;
                                } else {
                                    menuItemColorsItemColors = menuItemColors2;
                                }
                                if (i12 != 0) {
                                    dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                                } else {
                                    dropdownMenuItemContentPadding = paddingValues;
                                }
                                if (i14 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                            } else {
                                if (i4 != 0) {
                                    companion = Modifier.INSTANCE;
                                } else {
                                    companion = modifier;
                                }
                                if (i6 != 0) {
                                    function5 = null;
                                }
                                if (i8 == 0) {
                                }
                                if (i10 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z2;
                                }
                                if ((i2 & 64) != 0) {
                                    menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                                    i3 &= -3670017;
                                } else {
                                    menuItemColorsItemColors = menuItemColors2;
                                }
                                if (i12 != 0) {
                                    dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                                } else {
                                    dropdownMenuItemContentPadding = paddingValues;
                                }
                                if (i14 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1826340448, i3, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:189)");
                            }
                            MenuKt.DropdownMenuItemContent(function2, function0, companion, function5, function7, z3, menuItemColorsItemColors, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, i3 & 268435454);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier2 = companion;
                            z4 = z3;
                            function8 = function5;
                            menuItemColors3 = menuItemColorsItemColors;
                            paddingValues2 = dropdownMenuItemContentPadding;
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt.DropdownMenuItem.2
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

                                public final void invoke(Composer composer2, int i17) {
                                    AndroidMenu_androidKt.DropdownMenuItem(function2, function0, modifier2, function8, function7, z4, menuItemColors3, paddingValues2, mutableInteractionSource3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                }
                            });
                        }
                    }
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    z2 = z;
                    if ((1572864 & i) == 0) {
                        if ((i2 & 64) == 0) {
                            menuItemColors2 = menuItemColors;
                            if (composerStartRestartGroup.changed(menuItemColors2)) {
                            }
                            i3 |= i16;
                        } else {
                            menuItemColors2 = menuItemColors;
                        }
                        i3 |= i16;
                    } else {
                        menuItemColors2 = menuItemColors;
                    }
                    i12 = i2 & 128;
                    if (i12 != 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        if (composerStartRestartGroup.changed(paddingValues)) {
                            i13 = 8388608;
                        } else {
                            i13 = 4194304;
                        }
                        i3 |= i13;
                    }
                    i14 = i2 & 256;
                    if (i14 != 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                            i15 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        } else {
                            i15 = 33554432;
                        }
                        i3 |= i15;
                    }
                    if ((i3 & 38347923) == 38347922) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i4 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            if (i6 != 0) {
                                function5 = null;
                            }
                            if (i8 == 0) {
                            }
                            if (i10 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 64) != 0) {
                                menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                menuItemColorsItemColors = menuItemColors2;
                            }
                            if (i12 != 0) {
                                dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                            } else {
                                dropdownMenuItemContentPadding = paddingValues;
                            }
                            if (i14 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                        } else {
                            if (i4 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            if (i6 != 0) {
                                function5 = null;
                            }
                            if (i8 == 0) {
                            }
                            if (i10 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 64) != 0) {
                                menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                menuItemColorsItemColors = menuItemColors2;
                            }
                            if (i12 != 0) {
                                dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                            } else {
                                dropdownMenuItemContentPadding = paddingValues;
                            }
                            if (i14 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1826340448, i3, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:189)");
                        }
                        MenuKt.DropdownMenuItemContent(function2, function0, companion, function5, function7, z3, menuItemColorsItemColors, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, i3 & 268435454);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = companion;
                        z4 = z3;
                        function8 = function5;
                        menuItemColors3 = menuItemColorsItemColors;
                        paddingValues2 = dropdownMenuItemContentPadding;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i4 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            if (i6 != 0) {
                                function5 = null;
                            }
                            if (i8 == 0) {
                            }
                            if (i10 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 64) != 0) {
                                menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                menuItemColorsItemColors = menuItemColors2;
                            }
                            if (i12 != 0) {
                                dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                            } else {
                                dropdownMenuItemContentPadding = paddingValues;
                            }
                            if (i14 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                        } else {
                            if (i4 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            if (i6 != 0) {
                                function5 = null;
                            }
                            if (i8 == 0) {
                            }
                            if (i10 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 64) != 0) {
                                menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                menuItemColorsItemColors = menuItemColors2;
                            }
                            if (i12 != 0) {
                                dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                            } else {
                                dropdownMenuItemContentPadding = paddingValues;
                            }
                            if (i14 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1826340448, i3, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:189)");
                        }
                        MenuKt.DropdownMenuItemContent(function2, function0, companion, function5, function7, z3, menuItemColorsItemColors, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, i3 & 268435454);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = companion;
                        z4 = z3;
                        function8 = function5;
                        menuItemColors3 = menuItemColorsItemColors;
                        paddingValues2 = dropdownMenuItemContentPadding;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt.DropdownMenuItem.2
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

                            public final void invoke(Composer composer2, int i17) {
                                AndroidMenu_androidKt.DropdownMenuItem(function2, function0, modifier2, function8, function7, z4, menuItemColors3, paddingValues2, mutableInteractionSource3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                    }
                }
                i3 |= 24576;
                function6 = function4;
                i10 = i2 & 32;
                if (i10 != 0) {
                    if ((196608 & i) == 0) {
                        z2 = z;
                        if (composerStartRestartGroup.changed(z2)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i3 |= i11;
                    }
                    if ((1572864 & i) == 0) {
                        if ((i2 & 64) == 0) {
                            menuItemColors2 = menuItemColors;
                            if (composerStartRestartGroup.changed(menuItemColors2)) {
                            }
                            i3 |= i16;
                        } else {
                            menuItemColors2 = menuItemColors;
                        }
                        i3 |= i16;
                    } else {
                        menuItemColors2 = menuItemColors;
                    }
                    i12 = i2 & 128;
                    if (i12 != 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        if (composerStartRestartGroup.changed(paddingValues)) {
                            i13 = 8388608;
                        } else {
                            i13 = 4194304;
                        }
                        i3 |= i13;
                    }
                    i14 = i2 & 256;
                    if (i14 != 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                            i15 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        } else {
                            i15 = 33554432;
                        }
                        i3 |= i15;
                    }
                    if ((i3 & 38347923) == 38347922) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i4 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            if (i6 != 0) {
                                function5 = null;
                            }
                            if (i8 == 0) {
                            }
                            if (i10 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 64) != 0) {
                                menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                menuItemColorsItemColors = menuItemColors2;
                            }
                            if (i12 != 0) {
                                dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                            } else {
                                dropdownMenuItemContentPadding = paddingValues;
                            }
                            if (i14 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                        } else {
                            if (i4 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            if (i6 != 0) {
                                function5 = null;
                            }
                            if (i8 == 0) {
                            }
                            if (i10 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 64) != 0) {
                                menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                menuItemColorsItemColors = menuItemColors2;
                            }
                            if (i12 != 0) {
                                dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                            } else {
                                dropdownMenuItemContentPadding = paddingValues;
                            }
                            if (i14 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1826340448, i3, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:189)");
                        }
                        MenuKt.DropdownMenuItemContent(function2, function0, companion, function5, function7, z3, menuItemColorsItemColors, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, i3 & 268435454);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = companion;
                        z4 = z3;
                        function8 = function5;
                        menuItemColors3 = menuItemColorsItemColors;
                        paddingValues2 = dropdownMenuItemContentPadding;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i4 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            if (i6 != 0) {
                                function5 = null;
                            }
                            if (i8 == 0) {
                            }
                            if (i10 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 64) != 0) {
                                menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                menuItemColorsItemColors = menuItemColors2;
                            }
                            if (i12 != 0) {
                                dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                            } else {
                                dropdownMenuItemContentPadding = paddingValues;
                            }
                            if (i14 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                        } else {
                            if (i4 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            if (i6 != 0) {
                                function5 = null;
                            }
                            if (i8 == 0) {
                            }
                            if (i10 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 64) != 0) {
                                menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                menuItemColorsItemColors = menuItemColors2;
                            }
                            if (i12 != 0) {
                                dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                            } else {
                                dropdownMenuItemContentPadding = paddingValues;
                            }
                            if (i14 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1826340448, i3, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:189)");
                        }
                        MenuKt.DropdownMenuItemContent(function2, function0, companion, function5, function7, z3, menuItemColorsItemColors, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, i3 & 268435454);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = companion;
                        z4 = z3;
                        function8 = function5;
                        menuItemColors3 = menuItemColorsItemColors;
                        paddingValues2 = dropdownMenuItemContentPadding;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt.DropdownMenuItem.2
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

                            public final void invoke(Composer composer2, int i17) {
                                AndroidMenu_androidKt.DropdownMenuItem(function2, function0, modifier2, function8, function7, z4, menuItemColors3, paddingValues2, mutableInteractionSource3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                    }
                }
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                z2 = z;
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        menuItemColors2 = menuItemColors;
                        if (composerStartRestartGroup.changed(menuItemColors2)) {
                        }
                        i3 |= i16;
                    } else {
                        menuItemColors2 = menuItemColors;
                    }
                    i3 |= i16;
                } else {
                    menuItemColors2 = menuItemColors;
                }
                i12 = i2 & 128;
                if (i12 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (composerStartRestartGroup.changed(paddingValues)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i3 |= i13;
                }
                i14 = i2 & 256;
                if (i14 != 0) {
                    i3 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                        i15 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i15 = 33554432;
                    }
                    i3 |= i15;
                }
                if ((i3 & 38347923) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i4 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        }
                        if (i8 == 0) {
                        }
                        if (i10 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 64) != 0) {
                            menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            menuItemColorsItemColors = menuItemColors2;
                        }
                        if (i12 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues;
                        }
                        if (i14 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                    } else {
                        if (i4 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        }
                        if (i8 == 0) {
                        }
                        if (i10 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 64) != 0) {
                            menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            menuItemColorsItemColors = menuItemColors2;
                        }
                        if (i12 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues;
                        }
                        if (i14 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1826340448, i3, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:189)");
                    }
                    MenuKt.DropdownMenuItemContent(function2, function0, companion, function5, function7, z3, menuItemColorsItemColors, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, i3 & 268435454);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = companion;
                    z4 = z3;
                    function8 = function5;
                    menuItemColors3 = menuItemColorsItemColors;
                    paddingValues2 = dropdownMenuItemContentPadding;
                    mutableInteractionSource3 = mutableInteractionSource2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i4 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        }
                        if (i8 == 0) {
                        }
                        if (i10 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 64) != 0) {
                            menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            menuItemColorsItemColors = menuItemColors2;
                        }
                        if (i12 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues;
                        }
                        if (i14 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                    } else {
                        if (i4 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        }
                        if (i8 == 0) {
                        }
                        if (i10 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 64) != 0) {
                            menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            menuItemColorsItemColors = menuItemColors2;
                        }
                        if (i12 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues;
                        }
                        if (i14 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1826340448, i3, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:189)");
                    }
                    MenuKt.DropdownMenuItemContent(function2, function0, companion, function5, function7, z3, menuItemColorsItemColors, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, i3 & 268435454);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = companion;
                    z4 = z3;
                    function8 = function5;
                    menuItemColors3 = menuItemColorsItemColors;
                    paddingValues2 = dropdownMenuItemContentPadding;
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt.DropdownMenuItem.2
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

                        public final void invoke(Composer composer2, int i17) {
                            AndroidMenu_androidKt.DropdownMenuItem(function2, function0, modifier2, function8, function7, z4, menuItemColors3, paddingValues2, mutableInteractionSource3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 384;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    function5 = function3;
                    if (composerStartRestartGroup.changedInstance(function5)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 24576) == 0) {
                        function6 = function4;
                        if (composerStartRestartGroup.changedInstance(function6)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    i10 = i2 & 32;
                    if (i10 != 0) {
                        if ((196608 & i) == 0) {
                            z2 = z;
                            if (composerStartRestartGroup.changed(z2)) {
                                i11 = 131072;
                            } else {
                                i11 = 65536;
                            }
                            i3 |= i11;
                        }
                        if ((1572864 & i) == 0) {
                            if ((i2 & 64) == 0) {
                                menuItemColors2 = menuItemColors;
                                if (composerStartRestartGroup.changed(menuItemColors2)) {
                                }
                                i3 |= i16;
                            } else {
                                menuItemColors2 = menuItemColors;
                            }
                            i3 |= i16;
                        } else {
                            menuItemColors2 = menuItemColors;
                        }
                        i12 = i2 & 128;
                        if (i12 != 0) {
                            i3 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            if (composerStartRestartGroup.changed(paddingValues)) {
                                i13 = 8388608;
                            } else {
                                i13 = 4194304;
                            }
                            i3 |= i13;
                        }
                        i14 = i2 & 256;
                        if (i14 != 0) {
                            i3 |= 100663296;
                        } else if ((i & 100663296) == 0) {
                            if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                                i15 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                            } else {
                                i15 = 33554432;
                            }
                            i3 |= i15;
                        }
                        if ((i3 & 38347923) == 38347922) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if (i4 != 0) {
                                    companion = Modifier.INSTANCE;
                                } else {
                                    companion = modifier;
                                }
                                if (i6 != 0) {
                                    function5 = null;
                                }
                                if (i8 == 0) {
                                }
                                if (i10 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z2;
                                }
                                if ((i2 & 64) != 0) {
                                    menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                                    i3 &= -3670017;
                                } else {
                                    menuItemColorsItemColors = menuItemColors2;
                                }
                                if (i12 != 0) {
                                    dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                                } else {
                                    dropdownMenuItemContentPadding = paddingValues;
                                }
                                if (i14 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                            } else {
                                if (i4 != 0) {
                                    companion = Modifier.INSTANCE;
                                } else {
                                    companion = modifier;
                                }
                                if (i6 != 0) {
                                    function5 = null;
                                }
                                if (i8 == 0) {
                                }
                                if (i10 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z2;
                                }
                                if ((i2 & 64) != 0) {
                                    menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                                    i3 &= -3670017;
                                } else {
                                    menuItemColorsItemColors = menuItemColors2;
                                }
                                if (i12 != 0) {
                                    dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                                } else {
                                    dropdownMenuItemContentPadding = paddingValues;
                                }
                                if (i14 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1826340448, i3, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:189)");
                            }
                            MenuKt.DropdownMenuItemContent(function2, function0, companion, function5, function7, z3, menuItemColorsItemColors, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, i3 & 268435454);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier2 = companion;
                            z4 = z3;
                            function8 = function5;
                            menuItemColors3 = menuItemColorsItemColors;
                            paddingValues2 = dropdownMenuItemContentPadding;
                            mutableInteractionSource3 = mutableInteractionSource2;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if (i4 != 0) {
                                    companion = Modifier.INSTANCE;
                                } else {
                                    companion = modifier;
                                }
                                if (i6 != 0) {
                                    function5 = null;
                                }
                                if (i8 == 0) {
                                }
                                if (i10 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z2;
                                }
                                if ((i2 & 64) != 0) {
                                    menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                                    i3 &= -3670017;
                                } else {
                                    menuItemColorsItemColors = menuItemColors2;
                                }
                                if (i12 != 0) {
                                    dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                                } else {
                                    dropdownMenuItemContentPadding = paddingValues;
                                }
                                if (i14 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                            } else {
                                if (i4 != 0) {
                                    companion = Modifier.INSTANCE;
                                } else {
                                    companion = modifier;
                                }
                                if (i6 != 0) {
                                    function5 = null;
                                }
                                if (i8 == 0) {
                                }
                                if (i10 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z2;
                                }
                                if ((i2 & 64) != 0) {
                                    menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                                    i3 &= -3670017;
                                } else {
                                    menuItemColorsItemColors = menuItemColors2;
                                }
                                if (i12 != 0) {
                                    dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                                } else {
                                    dropdownMenuItemContentPadding = paddingValues;
                                }
                                if (i14 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1826340448, i3, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:189)");
                            }
                            MenuKt.DropdownMenuItemContent(function2, function0, companion, function5, function7, z3, menuItemColorsItemColors, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, i3 & 268435454);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier2 = companion;
                            z4 = z3;
                            function8 = function5;
                            menuItemColors3 = menuItemColorsItemColors;
                            paddingValues2 = dropdownMenuItemContentPadding;
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt.DropdownMenuItem.2
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

                                public final void invoke(Composer composer2, int i17) {
                                    AndroidMenu_androidKt.DropdownMenuItem(function2, function0, modifier2, function8, function7, z4, menuItemColors3, paddingValues2, mutableInteractionSource3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                }
                            });
                        }
                    }
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    z2 = z;
                    if ((1572864 & i) == 0) {
                        if ((i2 & 64) == 0) {
                            menuItemColors2 = menuItemColors;
                            if (composerStartRestartGroup.changed(menuItemColors2)) {
                            }
                            i3 |= i16;
                        } else {
                            menuItemColors2 = menuItemColors;
                        }
                        i3 |= i16;
                    } else {
                        menuItemColors2 = menuItemColors;
                    }
                    i12 = i2 & 128;
                    if (i12 != 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        if (composerStartRestartGroup.changed(paddingValues)) {
                            i13 = 8388608;
                        } else {
                            i13 = 4194304;
                        }
                        i3 |= i13;
                    }
                    i14 = i2 & 256;
                    if (i14 != 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                            i15 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        } else {
                            i15 = 33554432;
                        }
                        i3 |= i15;
                    }
                    if ((i3 & 38347923) == 38347922) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i4 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            if (i6 != 0) {
                                function5 = null;
                            }
                            if (i8 == 0) {
                            }
                            if (i10 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 64) != 0) {
                                menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                menuItemColorsItemColors = menuItemColors2;
                            }
                            if (i12 != 0) {
                                dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                            } else {
                                dropdownMenuItemContentPadding = paddingValues;
                            }
                            if (i14 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                        } else {
                            if (i4 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            if (i6 != 0) {
                                function5 = null;
                            }
                            if (i8 == 0) {
                            }
                            if (i10 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 64) != 0) {
                                menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                menuItemColorsItemColors = menuItemColors2;
                            }
                            if (i12 != 0) {
                                dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                            } else {
                                dropdownMenuItemContentPadding = paddingValues;
                            }
                            if (i14 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1826340448, i3, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:189)");
                        }
                        MenuKt.DropdownMenuItemContent(function2, function0, companion, function5, function7, z3, menuItemColorsItemColors, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, i3 & 268435454);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = companion;
                        z4 = z3;
                        function8 = function5;
                        menuItemColors3 = menuItemColorsItemColors;
                        paddingValues2 = dropdownMenuItemContentPadding;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i4 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            if (i6 != 0) {
                                function5 = null;
                            }
                            if (i8 == 0) {
                            }
                            if (i10 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 64) != 0) {
                                menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                menuItemColorsItemColors = menuItemColors2;
                            }
                            if (i12 != 0) {
                                dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                            } else {
                                dropdownMenuItemContentPadding = paddingValues;
                            }
                            if (i14 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                        } else {
                            if (i4 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            if (i6 != 0) {
                                function5 = null;
                            }
                            if (i8 == 0) {
                            }
                            if (i10 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 64) != 0) {
                                menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                menuItemColorsItemColors = menuItemColors2;
                            }
                            if (i12 != 0) {
                                dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                            } else {
                                dropdownMenuItemContentPadding = paddingValues;
                            }
                            if (i14 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1826340448, i3, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:189)");
                        }
                        MenuKt.DropdownMenuItemContent(function2, function0, companion, function5, function7, z3, menuItemColorsItemColors, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, i3 & 268435454);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = companion;
                        z4 = z3;
                        function8 = function5;
                        menuItemColors3 = menuItemColorsItemColors;
                        paddingValues2 = dropdownMenuItemContentPadding;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt.DropdownMenuItem.2
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

                            public final void invoke(Composer composer2, int i17) {
                                AndroidMenu_androidKt.DropdownMenuItem(function2, function0, modifier2, function8, function7, z4, menuItemColors3, paddingValues2, mutableInteractionSource3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                    }
                }
                i3 |= 24576;
                function6 = function4;
                i10 = i2 & 32;
                if (i10 != 0) {
                    if ((196608 & i) == 0) {
                        z2 = z;
                        if (composerStartRestartGroup.changed(z2)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i3 |= i11;
                    }
                    if ((1572864 & i) == 0) {
                        if ((i2 & 64) == 0) {
                            menuItemColors2 = menuItemColors;
                            if (composerStartRestartGroup.changed(menuItemColors2)) {
                            }
                            i3 |= i16;
                        } else {
                            menuItemColors2 = menuItemColors;
                        }
                        i3 |= i16;
                    } else {
                        menuItemColors2 = menuItemColors;
                    }
                    i12 = i2 & 128;
                    if (i12 != 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        if (composerStartRestartGroup.changed(paddingValues)) {
                            i13 = 8388608;
                        } else {
                            i13 = 4194304;
                        }
                        i3 |= i13;
                    }
                    i14 = i2 & 256;
                    if (i14 != 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                            i15 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        } else {
                            i15 = 33554432;
                        }
                        i3 |= i15;
                    }
                    if ((i3 & 38347923) == 38347922) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i4 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            if (i6 != 0) {
                                function5 = null;
                            }
                            if (i8 == 0) {
                            }
                            if (i10 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 64) != 0) {
                                menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                menuItemColorsItemColors = menuItemColors2;
                            }
                            if (i12 != 0) {
                                dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                            } else {
                                dropdownMenuItemContentPadding = paddingValues;
                            }
                            if (i14 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                        } else {
                            if (i4 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            if (i6 != 0) {
                                function5 = null;
                            }
                            if (i8 == 0) {
                            }
                            if (i10 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 64) != 0) {
                                menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                menuItemColorsItemColors = menuItemColors2;
                            }
                            if (i12 != 0) {
                                dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                            } else {
                                dropdownMenuItemContentPadding = paddingValues;
                            }
                            if (i14 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1826340448, i3, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:189)");
                        }
                        MenuKt.DropdownMenuItemContent(function2, function0, companion, function5, function7, z3, menuItemColorsItemColors, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, i3 & 268435454);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = companion;
                        z4 = z3;
                        function8 = function5;
                        menuItemColors3 = menuItemColorsItemColors;
                        paddingValues2 = dropdownMenuItemContentPadding;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i4 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            if (i6 != 0) {
                                function5 = null;
                            }
                            if (i8 == 0) {
                            }
                            if (i10 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 64) != 0) {
                                menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                menuItemColorsItemColors = menuItemColors2;
                            }
                            if (i12 != 0) {
                                dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                            } else {
                                dropdownMenuItemContentPadding = paddingValues;
                            }
                            if (i14 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                        } else {
                            if (i4 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            if (i6 != 0) {
                                function5 = null;
                            }
                            if (i8 == 0) {
                            }
                            if (i10 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 64) != 0) {
                                menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                menuItemColorsItemColors = menuItemColors2;
                            }
                            if (i12 != 0) {
                                dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                            } else {
                                dropdownMenuItemContentPadding = paddingValues;
                            }
                            if (i14 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1826340448, i3, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:189)");
                        }
                        MenuKt.DropdownMenuItemContent(function2, function0, companion, function5, function7, z3, menuItemColorsItemColors, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, i3 & 268435454);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = companion;
                        z4 = z3;
                        function8 = function5;
                        menuItemColors3 = menuItemColorsItemColors;
                        paddingValues2 = dropdownMenuItemContentPadding;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt.DropdownMenuItem.2
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

                            public final void invoke(Composer composer2, int i17) {
                                AndroidMenu_androidKt.DropdownMenuItem(function2, function0, modifier2, function8, function7, z4, menuItemColors3, paddingValues2, mutableInteractionSource3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                    }
                }
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                z2 = z;
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        menuItemColors2 = menuItemColors;
                        if (composerStartRestartGroup.changed(menuItemColors2)) {
                        }
                        i3 |= i16;
                    } else {
                        menuItemColors2 = menuItemColors;
                    }
                    i3 |= i16;
                } else {
                    menuItemColors2 = menuItemColors;
                }
                i12 = i2 & 128;
                if (i12 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (composerStartRestartGroup.changed(paddingValues)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i3 |= i13;
                }
                i14 = i2 & 256;
                if (i14 != 0) {
                    i3 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                        i15 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i15 = 33554432;
                    }
                    i3 |= i15;
                }
                if ((i3 & 38347923) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i4 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        }
                        if (i8 == 0) {
                        }
                        if (i10 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 64) != 0) {
                            menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            menuItemColorsItemColors = menuItemColors2;
                        }
                        if (i12 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues;
                        }
                        if (i14 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                    } else {
                        if (i4 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        }
                        if (i8 == 0) {
                        }
                        if (i10 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 64) != 0) {
                            menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            menuItemColorsItemColors = menuItemColors2;
                        }
                        if (i12 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues;
                        }
                        if (i14 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1826340448, i3, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:189)");
                    }
                    MenuKt.DropdownMenuItemContent(function2, function0, companion, function5, function7, z3, menuItemColorsItemColors, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, i3 & 268435454);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = companion;
                    z4 = z3;
                    function8 = function5;
                    menuItemColors3 = menuItemColorsItemColors;
                    paddingValues2 = dropdownMenuItemContentPadding;
                    mutableInteractionSource3 = mutableInteractionSource2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i4 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        }
                        if (i8 == 0) {
                        }
                        if (i10 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 64) != 0) {
                            menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            menuItemColorsItemColors = menuItemColors2;
                        }
                        if (i12 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues;
                        }
                        if (i14 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                    } else {
                        if (i4 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        }
                        if (i8 == 0) {
                        }
                        if (i10 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 64) != 0) {
                            menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            menuItemColorsItemColors = menuItemColors2;
                        }
                        if (i12 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues;
                        }
                        if (i14 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1826340448, i3, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:189)");
                    }
                    MenuKt.DropdownMenuItemContent(function2, function0, companion, function5, function7, z3, menuItemColorsItemColors, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, i3 & 268435454);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = companion;
                    z4 = z3;
                    function8 = function5;
                    menuItemColors3 = menuItemColorsItemColors;
                    paddingValues2 = dropdownMenuItemContentPadding;
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt.DropdownMenuItem.2
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

                        public final void invoke(Composer composer2, int i17) {
                            AndroidMenu_androidKt.DropdownMenuItem(function2, function0, modifier2, function8, function7, z4, menuItemColors3, paddingValues2, mutableInteractionSource3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 3072;
            function5 = function3;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 24576) == 0) {
                    function6 = function4;
                    if (composerStartRestartGroup.changedInstance(function6)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 32;
                if (i10 != 0) {
                    if ((196608 & i) == 0) {
                        z2 = z;
                        if (composerStartRestartGroup.changed(z2)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i3 |= i11;
                    }
                    if ((1572864 & i) == 0) {
                        if ((i2 & 64) == 0) {
                            menuItemColors2 = menuItemColors;
                            if (composerStartRestartGroup.changed(menuItemColors2)) {
                            }
                            i3 |= i16;
                        } else {
                            menuItemColors2 = menuItemColors;
                        }
                        i3 |= i16;
                    } else {
                        menuItemColors2 = menuItemColors;
                    }
                    i12 = i2 & 128;
                    if (i12 != 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        if (composerStartRestartGroup.changed(paddingValues)) {
                            i13 = 8388608;
                        } else {
                            i13 = 4194304;
                        }
                        i3 |= i13;
                    }
                    i14 = i2 & 256;
                    if (i14 != 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                            i15 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        } else {
                            i15 = 33554432;
                        }
                        i3 |= i15;
                    }
                    if ((i3 & 38347923) == 38347922) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i4 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            if (i6 != 0) {
                                function5 = null;
                            }
                            if (i8 == 0) {
                            }
                            if (i10 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 64) != 0) {
                                menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                menuItemColorsItemColors = menuItemColors2;
                            }
                            if (i12 != 0) {
                                dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                            } else {
                                dropdownMenuItemContentPadding = paddingValues;
                            }
                            if (i14 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                        } else {
                            if (i4 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            if (i6 != 0) {
                                function5 = null;
                            }
                            if (i8 == 0) {
                            }
                            if (i10 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 64) != 0) {
                                menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                menuItemColorsItemColors = menuItemColors2;
                            }
                            if (i12 != 0) {
                                dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                            } else {
                                dropdownMenuItemContentPadding = paddingValues;
                            }
                            if (i14 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1826340448, i3, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:189)");
                        }
                        MenuKt.DropdownMenuItemContent(function2, function0, companion, function5, function7, z3, menuItemColorsItemColors, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, i3 & 268435454);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = companion;
                        z4 = z3;
                        function8 = function5;
                        menuItemColors3 = menuItemColorsItemColors;
                        paddingValues2 = dropdownMenuItemContentPadding;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i4 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            if (i6 != 0) {
                                function5 = null;
                            }
                            if (i8 == 0) {
                            }
                            if (i10 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 64) != 0) {
                                menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                menuItemColorsItemColors = menuItemColors2;
                            }
                            if (i12 != 0) {
                                dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                            } else {
                                dropdownMenuItemContentPadding = paddingValues;
                            }
                            if (i14 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                        } else {
                            if (i4 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            if (i6 != 0) {
                                function5 = null;
                            }
                            if (i8 == 0) {
                            }
                            if (i10 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 64) != 0) {
                                menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                menuItemColorsItemColors = menuItemColors2;
                            }
                            if (i12 != 0) {
                                dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                            } else {
                                dropdownMenuItemContentPadding = paddingValues;
                            }
                            if (i14 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1826340448, i3, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:189)");
                        }
                        MenuKt.DropdownMenuItemContent(function2, function0, companion, function5, function7, z3, menuItemColorsItemColors, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, i3 & 268435454);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = companion;
                        z4 = z3;
                        function8 = function5;
                        menuItemColors3 = menuItemColorsItemColors;
                        paddingValues2 = dropdownMenuItemContentPadding;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt.DropdownMenuItem.2
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

                            public final void invoke(Composer composer2, int i17) {
                                AndroidMenu_androidKt.DropdownMenuItem(function2, function0, modifier2, function8, function7, z4, menuItemColors3, paddingValues2, mutableInteractionSource3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                    }
                }
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                z2 = z;
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        menuItemColors2 = menuItemColors;
                        if (composerStartRestartGroup.changed(menuItemColors2)) {
                        }
                        i3 |= i16;
                    } else {
                        menuItemColors2 = menuItemColors;
                    }
                    i3 |= i16;
                } else {
                    menuItemColors2 = menuItemColors;
                }
                i12 = i2 & 128;
                if (i12 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (composerStartRestartGroup.changed(paddingValues)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i3 |= i13;
                }
                i14 = i2 & 256;
                if (i14 != 0) {
                    i3 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                        i15 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i15 = 33554432;
                    }
                    i3 |= i15;
                }
                if ((i3 & 38347923) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i4 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        }
                        if (i8 == 0) {
                        }
                        if (i10 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 64) != 0) {
                            menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            menuItemColorsItemColors = menuItemColors2;
                        }
                        if (i12 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues;
                        }
                        if (i14 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                    } else {
                        if (i4 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        }
                        if (i8 == 0) {
                        }
                        if (i10 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 64) != 0) {
                            menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            menuItemColorsItemColors = menuItemColors2;
                        }
                        if (i12 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues;
                        }
                        if (i14 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1826340448, i3, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:189)");
                    }
                    MenuKt.DropdownMenuItemContent(function2, function0, companion, function5, function7, z3, menuItemColorsItemColors, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, i3 & 268435454);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = companion;
                    z4 = z3;
                    function8 = function5;
                    menuItemColors3 = menuItemColorsItemColors;
                    paddingValues2 = dropdownMenuItemContentPadding;
                    mutableInteractionSource3 = mutableInteractionSource2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i4 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        }
                        if (i8 == 0) {
                        }
                        if (i10 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 64) != 0) {
                            menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            menuItemColorsItemColors = menuItemColors2;
                        }
                        if (i12 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues;
                        }
                        if (i14 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                    } else {
                        if (i4 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        }
                        if (i8 == 0) {
                        }
                        if (i10 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 64) != 0) {
                            menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            menuItemColorsItemColors = menuItemColors2;
                        }
                        if (i12 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues;
                        }
                        if (i14 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1826340448, i3, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:189)");
                    }
                    MenuKt.DropdownMenuItemContent(function2, function0, companion, function5, function7, z3, menuItemColorsItemColors, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, i3 & 268435454);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = companion;
                    z4 = z3;
                    function8 = function5;
                    menuItemColors3 = menuItemColorsItemColors;
                    paddingValues2 = dropdownMenuItemContentPadding;
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt.DropdownMenuItem.2
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

                        public final void invoke(Composer composer2, int i17) {
                            AndroidMenu_androidKt.DropdownMenuItem(function2, function0, modifier2, function8, function7, z4, menuItemColors3, paddingValues2, mutableInteractionSource3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 24576;
            function6 = function4;
            i10 = i2 & 32;
            if (i10 != 0) {
                if ((196608 & i) == 0) {
                    z2 = z;
                    if (composerStartRestartGroup.changed(z2)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i3 |= i11;
                }
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        menuItemColors2 = menuItemColors;
                        if (composerStartRestartGroup.changed(menuItemColors2)) {
                        }
                        i3 |= i16;
                    } else {
                        menuItemColors2 = menuItemColors;
                    }
                    i3 |= i16;
                } else {
                    menuItemColors2 = menuItemColors;
                }
                i12 = i2 & 128;
                if (i12 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (composerStartRestartGroup.changed(paddingValues)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i3 |= i13;
                }
                i14 = i2 & 256;
                if (i14 != 0) {
                    i3 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                        i15 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i15 = 33554432;
                    }
                    i3 |= i15;
                }
                if ((i3 & 38347923) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i4 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        }
                        if (i8 == 0) {
                        }
                        if (i10 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 64) != 0) {
                            menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            menuItemColorsItemColors = menuItemColors2;
                        }
                        if (i12 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues;
                        }
                        if (i14 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                    } else {
                        if (i4 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        }
                        if (i8 == 0) {
                        }
                        if (i10 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 64) != 0) {
                            menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            menuItemColorsItemColors = menuItemColors2;
                        }
                        if (i12 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues;
                        }
                        if (i14 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1826340448, i3, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:189)");
                    }
                    MenuKt.DropdownMenuItemContent(function2, function0, companion, function5, function7, z3, menuItemColorsItemColors, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, i3 & 268435454);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = companion;
                    z4 = z3;
                    function8 = function5;
                    menuItemColors3 = menuItemColorsItemColors;
                    paddingValues2 = dropdownMenuItemContentPadding;
                    mutableInteractionSource3 = mutableInteractionSource2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i4 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        }
                        if (i8 == 0) {
                        }
                        if (i10 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 64) != 0) {
                            menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            menuItemColorsItemColors = menuItemColors2;
                        }
                        if (i12 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues;
                        }
                        if (i14 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                    } else {
                        if (i4 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        }
                        if (i8 == 0) {
                        }
                        if (i10 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 64) != 0) {
                            menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            menuItemColorsItemColors = menuItemColors2;
                        }
                        if (i12 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues;
                        }
                        if (i14 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1826340448, i3, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:189)");
                    }
                    MenuKt.DropdownMenuItemContent(function2, function0, companion, function5, function7, z3, menuItemColorsItemColors, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, i3 & 268435454);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = companion;
                    z4 = z3;
                    function8 = function5;
                    menuItemColors3 = menuItemColorsItemColors;
                    paddingValues2 = dropdownMenuItemContentPadding;
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt.DropdownMenuItem.2
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

                        public final void invoke(Composer composer2, int i17) {
                            AndroidMenu_androidKt.DropdownMenuItem(function2, function0, modifier2, function8, function7, z4, menuItemColors3, paddingValues2, mutableInteractionSource3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            z2 = z;
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    menuItemColors2 = menuItemColors;
                    if (composerStartRestartGroup.changed(menuItemColors2)) {
                    }
                    i3 |= i16;
                } else {
                    menuItemColors2 = menuItemColors;
                }
                i3 |= i16;
            } else {
                menuItemColors2 = menuItemColors;
            }
            i12 = i2 & 128;
            if (i12 != 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (composerStartRestartGroup.changed(paddingValues)) {
                    i13 = 8388608;
                } else {
                    i13 = 4194304;
                }
                i3 |= i13;
            }
            i14 = i2 & 256;
            if (i14 != 0) {
                i3 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                    i15 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i15 = 33554432;
                }
                i3 |= i15;
            }
            if ((i3 & 38347923) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i4 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i6 != 0) {
                        function5 = null;
                    }
                    if (i8 == 0) {
                    }
                    if (i10 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if ((i2 & 64) != 0) {
                        menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        menuItemColorsItemColors = menuItemColors2;
                    }
                    if (i12 != 0) {
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    } else {
                        dropdownMenuItemContentPadding = paddingValues;
                    }
                    if (i14 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                } else {
                    if (i4 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i6 != 0) {
                        function5 = null;
                    }
                    if (i8 == 0) {
                    }
                    if (i10 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if ((i2 & 64) != 0) {
                        menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        menuItemColorsItemColors = menuItemColors2;
                    }
                    if (i12 != 0) {
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    } else {
                        dropdownMenuItemContentPadding = paddingValues;
                    }
                    if (i14 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1826340448, i3, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:189)");
                }
                MenuKt.DropdownMenuItemContent(function2, function0, companion, function5, function7, z3, menuItemColorsItemColors, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, i3 & 268435454);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = companion;
                z4 = z3;
                function8 = function5;
                menuItemColors3 = menuItemColorsItemColors;
                paddingValues2 = dropdownMenuItemContentPadding;
                mutableInteractionSource3 = mutableInteractionSource2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i4 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i6 != 0) {
                        function5 = null;
                    }
                    if (i8 == 0) {
                    }
                    if (i10 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if ((i2 & 64) != 0) {
                        menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        menuItemColorsItemColors = menuItemColors2;
                    }
                    if (i12 != 0) {
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    } else {
                        dropdownMenuItemContentPadding = paddingValues;
                    }
                    if (i14 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                } else {
                    if (i4 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i6 != 0) {
                        function5 = null;
                    }
                    if (i8 == 0) {
                    }
                    if (i10 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if ((i2 & 64) != 0) {
                        menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        menuItemColorsItemColors = menuItemColors2;
                    }
                    if (i12 != 0) {
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    } else {
                        dropdownMenuItemContentPadding = paddingValues;
                    }
                    if (i14 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1826340448, i3, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:189)");
                }
                MenuKt.DropdownMenuItemContent(function2, function0, companion, function5, function7, z3, menuItemColorsItemColors, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, i3 & 268435454);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = companion;
                z4 = z3;
                function8 = function5;
                menuItemColors3 = menuItemColorsItemColors;
                paddingValues2 = dropdownMenuItemContentPadding;
                mutableInteractionSource3 = mutableInteractionSource2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt.DropdownMenuItem.2
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

                    public final void invoke(Composer composer2, int i17) {
                        AndroidMenu_androidKt.DropdownMenuItem(function2, function0, modifier2, function8, function7, z4, menuItemColors3, paddingValues2, mutableInteractionSource3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 48;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                if (composerStartRestartGroup.changed(modifier)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    function5 = function3;
                    if (composerStartRestartGroup.changedInstance(function5)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 24576) == 0) {
                        function6 = function4;
                        if (composerStartRestartGroup.changedInstance(function6)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    i10 = i2 & 32;
                    if (i10 != 0) {
                        if ((196608 & i) == 0) {
                            z2 = z;
                            if (composerStartRestartGroup.changed(z2)) {
                                i11 = 131072;
                            } else {
                                i11 = 65536;
                            }
                            i3 |= i11;
                        }
                        if ((1572864 & i) == 0) {
                            if ((i2 & 64) == 0) {
                                menuItemColors2 = menuItemColors;
                                if (composerStartRestartGroup.changed(menuItemColors2)) {
                                }
                                i3 |= i16;
                            } else {
                                menuItemColors2 = menuItemColors;
                            }
                            i3 |= i16;
                        } else {
                            menuItemColors2 = menuItemColors;
                        }
                        i12 = i2 & 128;
                        if (i12 != 0) {
                            i3 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            if (composerStartRestartGroup.changed(paddingValues)) {
                                i13 = 8388608;
                            } else {
                                i13 = 4194304;
                            }
                            i3 |= i13;
                        }
                        i14 = i2 & 256;
                        if (i14 != 0) {
                            i3 |= 100663296;
                        } else if ((i & 100663296) == 0) {
                            if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                                i15 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                            } else {
                                i15 = 33554432;
                            }
                            i3 |= i15;
                        }
                        if ((i3 & 38347923) == 38347922) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if (i4 != 0) {
                                    companion = Modifier.INSTANCE;
                                } else {
                                    companion = modifier;
                                }
                                if (i6 != 0) {
                                    function5 = null;
                                }
                                if (i8 == 0) {
                                }
                                if (i10 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z2;
                                }
                                if ((i2 & 64) != 0) {
                                    menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                                    i3 &= -3670017;
                                } else {
                                    menuItemColorsItemColors = menuItemColors2;
                                }
                                if (i12 != 0) {
                                    dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                                } else {
                                    dropdownMenuItemContentPadding = paddingValues;
                                }
                                if (i14 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                            } else {
                                if (i4 != 0) {
                                    companion = Modifier.INSTANCE;
                                } else {
                                    companion = modifier;
                                }
                                if (i6 != 0) {
                                    function5 = null;
                                }
                                if (i8 == 0) {
                                }
                                if (i10 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z2;
                                }
                                if ((i2 & 64) != 0) {
                                    menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                                    i3 &= -3670017;
                                } else {
                                    menuItemColorsItemColors = menuItemColors2;
                                }
                                if (i12 != 0) {
                                    dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                                } else {
                                    dropdownMenuItemContentPadding = paddingValues;
                                }
                                if (i14 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1826340448, i3, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:189)");
                            }
                            MenuKt.DropdownMenuItemContent(function2, function0, companion, function5, function7, z3, menuItemColorsItemColors, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, i3 & 268435454);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier2 = companion;
                            z4 = z3;
                            function8 = function5;
                            menuItemColors3 = menuItemColorsItemColors;
                            paddingValues2 = dropdownMenuItemContentPadding;
                            mutableInteractionSource3 = mutableInteractionSource2;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if (i4 != 0) {
                                    companion = Modifier.INSTANCE;
                                } else {
                                    companion = modifier;
                                }
                                if (i6 != 0) {
                                    function5 = null;
                                }
                                if (i8 == 0) {
                                }
                                if (i10 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z2;
                                }
                                if ((i2 & 64) != 0) {
                                    menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                                    i3 &= -3670017;
                                } else {
                                    menuItemColorsItemColors = menuItemColors2;
                                }
                                if (i12 != 0) {
                                    dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                                } else {
                                    dropdownMenuItemContentPadding = paddingValues;
                                }
                                if (i14 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                            } else {
                                if (i4 != 0) {
                                    companion = Modifier.INSTANCE;
                                } else {
                                    companion = modifier;
                                }
                                if (i6 != 0) {
                                    function5 = null;
                                }
                                if (i8 == 0) {
                                }
                                if (i10 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z2;
                                }
                                if ((i2 & 64) != 0) {
                                    menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                                    i3 &= -3670017;
                                } else {
                                    menuItemColorsItemColors = menuItemColors2;
                                }
                                if (i12 != 0) {
                                    dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                                } else {
                                    dropdownMenuItemContentPadding = paddingValues;
                                }
                                if (i14 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1826340448, i3, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:189)");
                            }
                            MenuKt.DropdownMenuItemContent(function2, function0, companion, function5, function7, z3, menuItemColorsItemColors, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, i3 & 268435454);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier2 = companion;
                            z4 = z3;
                            function8 = function5;
                            menuItemColors3 = menuItemColorsItemColors;
                            paddingValues2 = dropdownMenuItemContentPadding;
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt.DropdownMenuItem.2
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

                                public final void invoke(Composer composer2, int i17) {
                                    AndroidMenu_androidKt.DropdownMenuItem(function2, function0, modifier2, function8, function7, z4, menuItemColors3, paddingValues2, mutableInteractionSource3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                }
                            });
                        }
                    }
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    z2 = z;
                    if ((1572864 & i) == 0) {
                        if ((i2 & 64) == 0) {
                            menuItemColors2 = menuItemColors;
                            if (composerStartRestartGroup.changed(menuItemColors2)) {
                            }
                            i3 |= i16;
                        } else {
                            menuItemColors2 = menuItemColors;
                        }
                        i3 |= i16;
                    } else {
                        menuItemColors2 = menuItemColors;
                    }
                    i12 = i2 & 128;
                    if (i12 != 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        if (composerStartRestartGroup.changed(paddingValues)) {
                            i13 = 8388608;
                        } else {
                            i13 = 4194304;
                        }
                        i3 |= i13;
                    }
                    i14 = i2 & 256;
                    if (i14 != 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                            i15 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        } else {
                            i15 = 33554432;
                        }
                        i3 |= i15;
                    }
                    if ((i3 & 38347923) == 38347922) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i4 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            if (i6 != 0) {
                                function5 = null;
                            }
                            if (i8 == 0) {
                            }
                            if (i10 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 64) != 0) {
                                menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                menuItemColorsItemColors = menuItemColors2;
                            }
                            if (i12 != 0) {
                                dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                            } else {
                                dropdownMenuItemContentPadding = paddingValues;
                            }
                            if (i14 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                        } else {
                            if (i4 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            if (i6 != 0) {
                                function5 = null;
                            }
                            if (i8 == 0) {
                            }
                            if (i10 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 64) != 0) {
                                menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                menuItemColorsItemColors = menuItemColors2;
                            }
                            if (i12 != 0) {
                                dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                            } else {
                                dropdownMenuItemContentPadding = paddingValues;
                            }
                            if (i14 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1826340448, i3, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:189)");
                        }
                        MenuKt.DropdownMenuItemContent(function2, function0, companion, function5, function7, z3, menuItemColorsItemColors, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, i3 & 268435454);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = companion;
                        z4 = z3;
                        function8 = function5;
                        menuItemColors3 = menuItemColorsItemColors;
                        paddingValues2 = dropdownMenuItemContentPadding;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i4 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            if (i6 != 0) {
                                function5 = null;
                            }
                            if (i8 == 0) {
                            }
                            if (i10 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 64) != 0) {
                                menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                menuItemColorsItemColors = menuItemColors2;
                            }
                            if (i12 != 0) {
                                dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                            } else {
                                dropdownMenuItemContentPadding = paddingValues;
                            }
                            if (i14 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                        } else {
                            if (i4 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            if (i6 != 0) {
                                function5 = null;
                            }
                            if (i8 == 0) {
                            }
                            if (i10 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 64) != 0) {
                                menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                menuItemColorsItemColors = menuItemColors2;
                            }
                            if (i12 != 0) {
                                dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                            } else {
                                dropdownMenuItemContentPadding = paddingValues;
                            }
                            if (i14 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1826340448, i3, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:189)");
                        }
                        MenuKt.DropdownMenuItemContent(function2, function0, companion, function5, function7, z3, menuItemColorsItemColors, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, i3 & 268435454);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = companion;
                        z4 = z3;
                        function8 = function5;
                        menuItemColors3 = menuItemColorsItemColors;
                        paddingValues2 = dropdownMenuItemContentPadding;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt.DropdownMenuItem.2
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

                            public final void invoke(Composer composer2, int i17) {
                                AndroidMenu_androidKt.DropdownMenuItem(function2, function0, modifier2, function8, function7, z4, menuItemColors3, paddingValues2, mutableInteractionSource3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                    }
                }
                i3 |= 24576;
                function6 = function4;
                i10 = i2 & 32;
                if (i10 != 0) {
                    if ((196608 & i) == 0) {
                        z2 = z;
                        if (composerStartRestartGroup.changed(z2)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i3 |= i11;
                    }
                    if ((1572864 & i) == 0) {
                        if ((i2 & 64) == 0) {
                            menuItemColors2 = menuItemColors;
                            if (composerStartRestartGroup.changed(menuItemColors2)) {
                            }
                            i3 |= i16;
                        } else {
                            menuItemColors2 = menuItemColors;
                        }
                        i3 |= i16;
                    } else {
                        menuItemColors2 = menuItemColors;
                    }
                    i12 = i2 & 128;
                    if (i12 != 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        if (composerStartRestartGroup.changed(paddingValues)) {
                            i13 = 8388608;
                        } else {
                            i13 = 4194304;
                        }
                        i3 |= i13;
                    }
                    i14 = i2 & 256;
                    if (i14 != 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                            i15 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        } else {
                            i15 = 33554432;
                        }
                        i3 |= i15;
                    }
                    if ((i3 & 38347923) == 38347922) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i4 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            if (i6 != 0) {
                                function5 = null;
                            }
                            if (i8 == 0) {
                            }
                            if (i10 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 64) != 0) {
                                menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                menuItemColorsItemColors = menuItemColors2;
                            }
                            if (i12 != 0) {
                                dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                            } else {
                                dropdownMenuItemContentPadding = paddingValues;
                            }
                            if (i14 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                        } else {
                            if (i4 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            if (i6 != 0) {
                                function5 = null;
                            }
                            if (i8 == 0) {
                            }
                            if (i10 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 64) != 0) {
                                menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                menuItemColorsItemColors = menuItemColors2;
                            }
                            if (i12 != 0) {
                                dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                            } else {
                                dropdownMenuItemContentPadding = paddingValues;
                            }
                            if (i14 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1826340448, i3, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:189)");
                        }
                        MenuKt.DropdownMenuItemContent(function2, function0, companion, function5, function7, z3, menuItemColorsItemColors, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, i3 & 268435454);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = companion;
                        z4 = z3;
                        function8 = function5;
                        menuItemColors3 = menuItemColorsItemColors;
                        paddingValues2 = dropdownMenuItemContentPadding;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i4 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            if (i6 != 0) {
                                function5 = null;
                            }
                            if (i8 == 0) {
                            }
                            if (i10 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 64) != 0) {
                                menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                menuItemColorsItemColors = menuItemColors2;
                            }
                            if (i12 != 0) {
                                dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                            } else {
                                dropdownMenuItemContentPadding = paddingValues;
                            }
                            if (i14 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                        } else {
                            if (i4 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            if (i6 != 0) {
                                function5 = null;
                            }
                            if (i8 == 0) {
                            }
                            if (i10 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 64) != 0) {
                                menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                menuItemColorsItemColors = menuItemColors2;
                            }
                            if (i12 != 0) {
                                dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                            } else {
                                dropdownMenuItemContentPadding = paddingValues;
                            }
                            if (i14 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1826340448, i3, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:189)");
                        }
                        MenuKt.DropdownMenuItemContent(function2, function0, companion, function5, function7, z3, menuItemColorsItemColors, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, i3 & 268435454);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = companion;
                        z4 = z3;
                        function8 = function5;
                        menuItemColors3 = menuItemColorsItemColors;
                        paddingValues2 = dropdownMenuItemContentPadding;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt.DropdownMenuItem.2
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

                            public final void invoke(Composer composer2, int i17) {
                                AndroidMenu_androidKt.DropdownMenuItem(function2, function0, modifier2, function8, function7, z4, menuItemColors3, paddingValues2, mutableInteractionSource3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                    }
                }
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                z2 = z;
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        menuItemColors2 = menuItemColors;
                        if (composerStartRestartGroup.changed(menuItemColors2)) {
                        }
                        i3 |= i16;
                    } else {
                        menuItemColors2 = menuItemColors;
                    }
                    i3 |= i16;
                } else {
                    menuItemColors2 = menuItemColors;
                }
                i12 = i2 & 128;
                if (i12 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (composerStartRestartGroup.changed(paddingValues)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i3 |= i13;
                }
                i14 = i2 & 256;
                if (i14 != 0) {
                    i3 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                        i15 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i15 = 33554432;
                    }
                    i3 |= i15;
                }
                if ((i3 & 38347923) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i4 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        }
                        if (i8 == 0) {
                        }
                        if (i10 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 64) != 0) {
                            menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            menuItemColorsItemColors = menuItemColors2;
                        }
                        if (i12 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues;
                        }
                        if (i14 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                    } else {
                        if (i4 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        }
                        if (i8 == 0) {
                        }
                        if (i10 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 64) != 0) {
                            menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            menuItemColorsItemColors = menuItemColors2;
                        }
                        if (i12 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues;
                        }
                        if (i14 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1826340448, i3, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:189)");
                    }
                    MenuKt.DropdownMenuItemContent(function2, function0, companion, function5, function7, z3, menuItemColorsItemColors, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, i3 & 268435454);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = companion;
                    z4 = z3;
                    function8 = function5;
                    menuItemColors3 = menuItemColorsItemColors;
                    paddingValues2 = dropdownMenuItemContentPadding;
                    mutableInteractionSource3 = mutableInteractionSource2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i4 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        }
                        if (i8 == 0) {
                        }
                        if (i10 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 64) != 0) {
                            menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            menuItemColorsItemColors = menuItemColors2;
                        }
                        if (i12 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues;
                        }
                        if (i14 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                    } else {
                        if (i4 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        }
                        if (i8 == 0) {
                        }
                        if (i10 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 64) != 0) {
                            menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            menuItemColorsItemColors = menuItemColors2;
                        }
                        if (i12 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues;
                        }
                        if (i14 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1826340448, i3, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:189)");
                    }
                    MenuKt.DropdownMenuItemContent(function2, function0, companion, function5, function7, z3, menuItemColorsItemColors, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, i3 & 268435454);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = companion;
                    z4 = z3;
                    function8 = function5;
                    menuItemColors3 = menuItemColorsItemColors;
                    paddingValues2 = dropdownMenuItemContentPadding;
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt.DropdownMenuItem.2
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

                        public final void invoke(Composer composer2, int i17) {
                            AndroidMenu_androidKt.DropdownMenuItem(function2, function0, modifier2, function8, function7, z4, menuItemColors3, paddingValues2, mutableInteractionSource3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 3072;
            function5 = function3;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 24576) == 0) {
                    function6 = function4;
                    if (composerStartRestartGroup.changedInstance(function6)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 32;
                if (i10 != 0) {
                    if ((196608 & i) == 0) {
                        z2 = z;
                        if (composerStartRestartGroup.changed(z2)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i3 |= i11;
                    }
                    if ((1572864 & i) == 0) {
                        if ((i2 & 64) == 0) {
                            menuItemColors2 = menuItemColors;
                            if (composerStartRestartGroup.changed(menuItemColors2)) {
                            }
                            i3 |= i16;
                        } else {
                            menuItemColors2 = menuItemColors;
                        }
                        i3 |= i16;
                    } else {
                        menuItemColors2 = menuItemColors;
                    }
                    i12 = i2 & 128;
                    if (i12 != 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        if (composerStartRestartGroup.changed(paddingValues)) {
                            i13 = 8388608;
                        } else {
                            i13 = 4194304;
                        }
                        i3 |= i13;
                    }
                    i14 = i2 & 256;
                    if (i14 != 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                            i15 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        } else {
                            i15 = 33554432;
                        }
                        i3 |= i15;
                    }
                    if ((i3 & 38347923) == 38347922) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i4 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            if (i6 != 0) {
                                function5 = null;
                            }
                            if (i8 == 0) {
                            }
                            if (i10 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 64) != 0) {
                                menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                menuItemColorsItemColors = menuItemColors2;
                            }
                            if (i12 != 0) {
                                dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                            } else {
                                dropdownMenuItemContentPadding = paddingValues;
                            }
                            if (i14 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                        } else {
                            if (i4 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            if (i6 != 0) {
                                function5 = null;
                            }
                            if (i8 == 0) {
                            }
                            if (i10 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 64) != 0) {
                                menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                menuItemColorsItemColors = menuItemColors2;
                            }
                            if (i12 != 0) {
                                dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                            } else {
                                dropdownMenuItemContentPadding = paddingValues;
                            }
                            if (i14 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1826340448, i3, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:189)");
                        }
                        MenuKt.DropdownMenuItemContent(function2, function0, companion, function5, function7, z3, menuItemColorsItemColors, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, i3 & 268435454);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = companion;
                        z4 = z3;
                        function8 = function5;
                        menuItemColors3 = menuItemColorsItemColors;
                        paddingValues2 = dropdownMenuItemContentPadding;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i4 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            if (i6 != 0) {
                                function5 = null;
                            }
                            if (i8 == 0) {
                            }
                            if (i10 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 64) != 0) {
                                menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                menuItemColorsItemColors = menuItemColors2;
                            }
                            if (i12 != 0) {
                                dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                            } else {
                                dropdownMenuItemContentPadding = paddingValues;
                            }
                            if (i14 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                        } else {
                            if (i4 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            if (i6 != 0) {
                                function5 = null;
                            }
                            if (i8 == 0) {
                            }
                            if (i10 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 64) != 0) {
                                menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                menuItemColorsItemColors = menuItemColors2;
                            }
                            if (i12 != 0) {
                                dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                            } else {
                                dropdownMenuItemContentPadding = paddingValues;
                            }
                            if (i14 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1826340448, i3, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:189)");
                        }
                        MenuKt.DropdownMenuItemContent(function2, function0, companion, function5, function7, z3, menuItemColorsItemColors, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, i3 & 268435454);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = companion;
                        z4 = z3;
                        function8 = function5;
                        menuItemColors3 = menuItemColorsItemColors;
                        paddingValues2 = dropdownMenuItemContentPadding;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt.DropdownMenuItem.2
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

                            public final void invoke(Composer composer2, int i17) {
                                AndroidMenu_androidKt.DropdownMenuItem(function2, function0, modifier2, function8, function7, z4, menuItemColors3, paddingValues2, mutableInteractionSource3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                    }
                }
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                z2 = z;
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        menuItemColors2 = menuItemColors;
                        if (composerStartRestartGroup.changed(menuItemColors2)) {
                        }
                        i3 |= i16;
                    } else {
                        menuItemColors2 = menuItemColors;
                    }
                    i3 |= i16;
                } else {
                    menuItemColors2 = menuItemColors;
                }
                i12 = i2 & 128;
                if (i12 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (composerStartRestartGroup.changed(paddingValues)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i3 |= i13;
                }
                i14 = i2 & 256;
                if (i14 != 0) {
                    i3 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                        i15 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i15 = 33554432;
                    }
                    i3 |= i15;
                }
                if ((i3 & 38347923) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i4 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        }
                        if (i8 == 0) {
                        }
                        if (i10 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 64) != 0) {
                            menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            menuItemColorsItemColors = menuItemColors2;
                        }
                        if (i12 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues;
                        }
                        if (i14 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                    } else {
                        if (i4 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        }
                        if (i8 == 0) {
                        }
                        if (i10 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 64) != 0) {
                            menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            menuItemColorsItemColors = menuItemColors2;
                        }
                        if (i12 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues;
                        }
                        if (i14 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1826340448, i3, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:189)");
                    }
                    MenuKt.DropdownMenuItemContent(function2, function0, companion, function5, function7, z3, menuItemColorsItemColors, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, i3 & 268435454);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = companion;
                    z4 = z3;
                    function8 = function5;
                    menuItemColors3 = menuItemColorsItemColors;
                    paddingValues2 = dropdownMenuItemContentPadding;
                    mutableInteractionSource3 = mutableInteractionSource2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i4 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        }
                        if (i8 == 0) {
                        }
                        if (i10 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 64) != 0) {
                            menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            menuItemColorsItemColors = menuItemColors2;
                        }
                        if (i12 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues;
                        }
                        if (i14 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                    } else {
                        if (i4 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        }
                        if (i8 == 0) {
                        }
                        if (i10 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 64) != 0) {
                            menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            menuItemColorsItemColors = menuItemColors2;
                        }
                        if (i12 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues;
                        }
                        if (i14 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1826340448, i3, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:189)");
                    }
                    MenuKt.DropdownMenuItemContent(function2, function0, companion, function5, function7, z3, menuItemColorsItemColors, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, i3 & 268435454);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = companion;
                    z4 = z3;
                    function8 = function5;
                    menuItemColors3 = menuItemColorsItemColors;
                    paddingValues2 = dropdownMenuItemContentPadding;
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt.DropdownMenuItem.2
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

                        public final void invoke(Composer composer2, int i17) {
                            AndroidMenu_androidKt.DropdownMenuItem(function2, function0, modifier2, function8, function7, z4, menuItemColors3, paddingValues2, mutableInteractionSource3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 24576;
            function6 = function4;
            i10 = i2 & 32;
            if (i10 != 0) {
                if ((196608 & i) == 0) {
                    z2 = z;
                    if (composerStartRestartGroup.changed(z2)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i3 |= i11;
                }
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        menuItemColors2 = menuItemColors;
                        if (composerStartRestartGroup.changed(menuItemColors2)) {
                        }
                        i3 |= i16;
                    } else {
                        menuItemColors2 = menuItemColors;
                    }
                    i3 |= i16;
                } else {
                    menuItemColors2 = menuItemColors;
                }
                i12 = i2 & 128;
                if (i12 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (composerStartRestartGroup.changed(paddingValues)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i3 |= i13;
                }
                i14 = i2 & 256;
                if (i14 != 0) {
                    i3 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                        i15 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i15 = 33554432;
                    }
                    i3 |= i15;
                }
                if ((i3 & 38347923) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i4 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        }
                        if (i8 == 0) {
                        }
                        if (i10 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 64) != 0) {
                            menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            menuItemColorsItemColors = menuItemColors2;
                        }
                        if (i12 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues;
                        }
                        if (i14 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                    } else {
                        if (i4 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        }
                        if (i8 == 0) {
                        }
                        if (i10 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 64) != 0) {
                            menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            menuItemColorsItemColors = menuItemColors2;
                        }
                        if (i12 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues;
                        }
                        if (i14 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1826340448, i3, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:189)");
                    }
                    MenuKt.DropdownMenuItemContent(function2, function0, companion, function5, function7, z3, menuItemColorsItemColors, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, i3 & 268435454);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = companion;
                    z4 = z3;
                    function8 = function5;
                    menuItemColors3 = menuItemColorsItemColors;
                    paddingValues2 = dropdownMenuItemContentPadding;
                    mutableInteractionSource3 = mutableInteractionSource2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i4 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        }
                        if (i8 == 0) {
                        }
                        if (i10 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 64) != 0) {
                            menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            menuItemColorsItemColors = menuItemColors2;
                        }
                        if (i12 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues;
                        }
                        if (i14 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                    } else {
                        if (i4 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        }
                        if (i8 == 0) {
                        }
                        if (i10 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 64) != 0) {
                            menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            menuItemColorsItemColors = menuItemColors2;
                        }
                        if (i12 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues;
                        }
                        if (i14 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1826340448, i3, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:189)");
                    }
                    MenuKt.DropdownMenuItemContent(function2, function0, companion, function5, function7, z3, menuItemColorsItemColors, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, i3 & 268435454);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = companion;
                    z4 = z3;
                    function8 = function5;
                    menuItemColors3 = menuItemColorsItemColors;
                    paddingValues2 = dropdownMenuItemContentPadding;
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt.DropdownMenuItem.2
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

                        public final void invoke(Composer composer2, int i17) {
                            AndroidMenu_androidKt.DropdownMenuItem(function2, function0, modifier2, function8, function7, z4, menuItemColors3, paddingValues2, mutableInteractionSource3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            z2 = z;
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    menuItemColors2 = menuItemColors;
                    if (composerStartRestartGroup.changed(menuItemColors2)) {
                    }
                    i3 |= i16;
                } else {
                    menuItemColors2 = menuItemColors;
                }
                i3 |= i16;
            } else {
                menuItemColors2 = menuItemColors;
            }
            i12 = i2 & 128;
            if (i12 != 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (composerStartRestartGroup.changed(paddingValues)) {
                    i13 = 8388608;
                } else {
                    i13 = 4194304;
                }
                i3 |= i13;
            }
            i14 = i2 & 256;
            if (i14 != 0) {
                i3 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                    i15 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i15 = 33554432;
                }
                i3 |= i15;
            }
            if ((i3 & 38347923) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i4 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i6 != 0) {
                        function5 = null;
                    }
                    if (i8 == 0) {
                    }
                    if (i10 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if ((i2 & 64) != 0) {
                        menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        menuItemColorsItemColors = menuItemColors2;
                    }
                    if (i12 != 0) {
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    } else {
                        dropdownMenuItemContentPadding = paddingValues;
                    }
                    if (i14 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                } else {
                    if (i4 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i6 != 0) {
                        function5 = null;
                    }
                    if (i8 == 0) {
                    }
                    if (i10 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if ((i2 & 64) != 0) {
                        menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        menuItemColorsItemColors = menuItemColors2;
                    }
                    if (i12 != 0) {
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    } else {
                        dropdownMenuItemContentPadding = paddingValues;
                    }
                    if (i14 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1826340448, i3, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:189)");
                }
                MenuKt.DropdownMenuItemContent(function2, function0, companion, function5, function7, z3, menuItemColorsItemColors, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, i3 & 268435454);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = companion;
                z4 = z3;
                function8 = function5;
                menuItemColors3 = menuItemColorsItemColors;
                paddingValues2 = dropdownMenuItemContentPadding;
                mutableInteractionSource3 = mutableInteractionSource2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i4 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i6 != 0) {
                        function5 = null;
                    }
                    if (i8 == 0) {
                    }
                    if (i10 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if ((i2 & 64) != 0) {
                        menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        menuItemColorsItemColors = menuItemColors2;
                    }
                    if (i12 != 0) {
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    } else {
                        dropdownMenuItemContentPadding = paddingValues;
                    }
                    if (i14 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                } else {
                    if (i4 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i6 != 0) {
                        function5 = null;
                    }
                    if (i8 == 0) {
                    }
                    if (i10 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if ((i2 & 64) != 0) {
                        menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        menuItemColorsItemColors = menuItemColors2;
                    }
                    if (i12 != 0) {
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    } else {
                        dropdownMenuItemContentPadding = paddingValues;
                    }
                    if (i14 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1826340448, i3, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:189)");
                }
                MenuKt.DropdownMenuItemContent(function2, function0, companion, function5, function7, z3, menuItemColorsItemColors, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, i3 & 268435454);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = companion;
                z4 = z3;
                function8 = function5;
                menuItemColors3 = menuItemColorsItemColors;
                paddingValues2 = dropdownMenuItemContentPadding;
                mutableInteractionSource3 = mutableInteractionSource2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt.DropdownMenuItem.2
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

                    public final void invoke(Composer composer2, int i17) {
                        AndroidMenu_androidKt.DropdownMenuItem(function2, function0, modifier2, function8, function7, z4, menuItemColors3, paddingValues2, mutableInteractionSource3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 384;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 3072) == 0) {
                function5 = function3;
                if (composerStartRestartGroup.changedInstance(function5)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i3 |= i7;
            }
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 24576) == 0) {
                    function6 = function4;
                    if (composerStartRestartGroup.changedInstance(function6)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 32;
                if (i10 != 0) {
                    if ((196608 & i) == 0) {
                        z2 = z;
                        if (composerStartRestartGroup.changed(z2)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i3 |= i11;
                    }
                    if ((1572864 & i) == 0) {
                        if ((i2 & 64) == 0) {
                            menuItemColors2 = menuItemColors;
                            if (composerStartRestartGroup.changed(menuItemColors2)) {
                            }
                            i3 |= i16;
                        } else {
                            menuItemColors2 = menuItemColors;
                        }
                        i3 |= i16;
                    } else {
                        menuItemColors2 = menuItemColors;
                    }
                    i12 = i2 & 128;
                    if (i12 != 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        if (composerStartRestartGroup.changed(paddingValues)) {
                            i13 = 8388608;
                        } else {
                            i13 = 4194304;
                        }
                        i3 |= i13;
                    }
                    i14 = i2 & 256;
                    if (i14 != 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                            i15 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        } else {
                            i15 = 33554432;
                        }
                        i3 |= i15;
                    }
                    if ((i3 & 38347923) == 38347922) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i4 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            if (i6 != 0) {
                                function5 = null;
                            }
                            if (i8 == 0) {
                            }
                            if (i10 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 64) != 0) {
                                menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                menuItemColorsItemColors = menuItemColors2;
                            }
                            if (i12 != 0) {
                                dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                            } else {
                                dropdownMenuItemContentPadding = paddingValues;
                            }
                            if (i14 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                        } else {
                            if (i4 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            if (i6 != 0) {
                                function5 = null;
                            }
                            if (i8 == 0) {
                            }
                            if (i10 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 64) != 0) {
                                menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                menuItemColorsItemColors = menuItemColors2;
                            }
                            if (i12 != 0) {
                                dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                            } else {
                                dropdownMenuItemContentPadding = paddingValues;
                            }
                            if (i14 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1826340448, i3, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:189)");
                        }
                        MenuKt.DropdownMenuItemContent(function2, function0, companion, function5, function7, z3, menuItemColorsItemColors, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, i3 & 268435454);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = companion;
                        z4 = z3;
                        function8 = function5;
                        menuItemColors3 = menuItemColorsItemColors;
                        paddingValues2 = dropdownMenuItemContentPadding;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i4 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            if (i6 != 0) {
                                function5 = null;
                            }
                            if (i8 == 0) {
                            }
                            if (i10 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 64) != 0) {
                                menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                menuItemColorsItemColors = menuItemColors2;
                            }
                            if (i12 != 0) {
                                dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                            } else {
                                dropdownMenuItemContentPadding = paddingValues;
                            }
                            if (i14 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                        } else {
                            if (i4 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            if (i6 != 0) {
                                function5 = null;
                            }
                            if (i8 == 0) {
                            }
                            if (i10 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 64) != 0) {
                                menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                menuItemColorsItemColors = menuItemColors2;
                            }
                            if (i12 != 0) {
                                dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                            } else {
                                dropdownMenuItemContentPadding = paddingValues;
                            }
                            if (i14 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1826340448, i3, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:189)");
                        }
                        MenuKt.DropdownMenuItemContent(function2, function0, companion, function5, function7, z3, menuItemColorsItemColors, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, i3 & 268435454);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = companion;
                        z4 = z3;
                        function8 = function5;
                        menuItemColors3 = menuItemColorsItemColors;
                        paddingValues2 = dropdownMenuItemContentPadding;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt.DropdownMenuItem.2
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

                            public final void invoke(Composer composer2, int i17) {
                                AndroidMenu_androidKt.DropdownMenuItem(function2, function0, modifier2, function8, function7, z4, menuItemColors3, paddingValues2, mutableInteractionSource3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                    }
                }
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                z2 = z;
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        menuItemColors2 = menuItemColors;
                        if (composerStartRestartGroup.changed(menuItemColors2)) {
                        }
                        i3 |= i16;
                    } else {
                        menuItemColors2 = menuItemColors;
                    }
                    i3 |= i16;
                } else {
                    menuItemColors2 = menuItemColors;
                }
                i12 = i2 & 128;
                if (i12 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (composerStartRestartGroup.changed(paddingValues)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i3 |= i13;
                }
                i14 = i2 & 256;
                if (i14 != 0) {
                    i3 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                        i15 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i15 = 33554432;
                    }
                    i3 |= i15;
                }
                if ((i3 & 38347923) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i4 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        }
                        if (i8 == 0) {
                        }
                        if (i10 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 64) != 0) {
                            menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            menuItemColorsItemColors = menuItemColors2;
                        }
                        if (i12 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues;
                        }
                        if (i14 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                    } else {
                        if (i4 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        }
                        if (i8 == 0) {
                        }
                        if (i10 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 64) != 0) {
                            menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            menuItemColorsItemColors = menuItemColors2;
                        }
                        if (i12 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues;
                        }
                        if (i14 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1826340448, i3, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:189)");
                    }
                    MenuKt.DropdownMenuItemContent(function2, function0, companion, function5, function7, z3, menuItemColorsItemColors, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, i3 & 268435454);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = companion;
                    z4 = z3;
                    function8 = function5;
                    menuItemColors3 = menuItemColorsItemColors;
                    paddingValues2 = dropdownMenuItemContentPadding;
                    mutableInteractionSource3 = mutableInteractionSource2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i4 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        }
                        if (i8 == 0) {
                        }
                        if (i10 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 64) != 0) {
                            menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            menuItemColorsItemColors = menuItemColors2;
                        }
                        if (i12 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues;
                        }
                        if (i14 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                    } else {
                        if (i4 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        }
                        if (i8 == 0) {
                        }
                        if (i10 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 64) != 0) {
                            menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            menuItemColorsItemColors = menuItemColors2;
                        }
                        if (i12 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues;
                        }
                        if (i14 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1826340448, i3, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:189)");
                    }
                    MenuKt.DropdownMenuItemContent(function2, function0, companion, function5, function7, z3, menuItemColorsItemColors, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, i3 & 268435454);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = companion;
                    z4 = z3;
                    function8 = function5;
                    menuItemColors3 = menuItemColorsItemColors;
                    paddingValues2 = dropdownMenuItemContentPadding;
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt.DropdownMenuItem.2
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

                        public final void invoke(Composer composer2, int i17) {
                            AndroidMenu_androidKt.DropdownMenuItem(function2, function0, modifier2, function8, function7, z4, menuItemColors3, paddingValues2, mutableInteractionSource3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 24576;
            function6 = function4;
            i10 = i2 & 32;
            if (i10 != 0) {
                if ((196608 & i) == 0) {
                    z2 = z;
                    if (composerStartRestartGroup.changed(z2)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i3 |= i11;
                }
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        menuItemColors2 = menuItemColors;
                        if (composerStartRestartGroup.changed(menuItemColors2)) {
                        }
                        i3 |= i16;
                    } else {
                        menuItemColors2 = menuItemColors;
                    }
                    i3 |= i16;
                } else {
                    menuItemColors2 = menuItemColors;
                }
                i12 = i2 & 128;
                if (i12 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (composerStartRestartGroup.changed(paddingValues)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i3 |= i13;
                }
                i14 = i2 & 256;
                if (i14 != 0) {
                    i3 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                        i15 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i15 = 33554432;
                    }
                    i3 |= i15;
                }
                if ((i3 & 38347923) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i4 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        }
                        if (i8 == 0) {
                        }
                        if (i10 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 64) != 0) {
                            menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            menuItemColorsItemColors = menuItemColors2;
                        }
                        if (i12 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues;
                        }
                        if (i14 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                    } else {
                        if (i4 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        }
                        if (i8 == 0) {
                        }
                        if (i10 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 64) != 0) {
                            menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            menuItemColorsItemColors = menuItemColors2;
                        }
                        if (i12 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues;
                        }
                        if (i14 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1826340448, i3, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:189)");
                    }
                    MenuKt.DropdownMenuItemContent(function2, function0, companion, function5, function7, z3, menuItemColorsItemColors, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, i3 & 268435454);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = companion;
                    z4 = z3;
                    function8 = function5;
                    menuItemColors3 = menuItemColorsItemColors;
                    paddingValues2 = dropdownMenuItemContentPadding;
                    mutableInteractionSource3 = mutableInteractionSource2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i4 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        }
                        if (i8 == 0) {
                        }
                        if (i10 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 64) != 0) {
                            menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            menuItemColorsItemColors = menuItemColors2;
                        }
                        if (i12 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues;
                        }
                        if (i14 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                    } else {
                        if (i4 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        }
                        if (i8 == 0) {
                        }
                        if (i10 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 64) != 0) {
                            menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            menuItemColorsItemColors = menuItemColors2;
                        }
                        if (i12 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues;
                        }
                        if (i14 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1826340448, i3, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:189)");
                    }
                    MenuKt.DropdownMenuItemContent(function2, function0, companion, function5, function7, z3, menuItemColorsItemColors, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, i3 & 268435454);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = companion;
                    z4 = z3;
                    function8 = function5;
                    menuItemColors3 = menuItemColorsItemColors;
                    paddingValues2 = dropdownMenuItemContentPadding;
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt.DropdownMenuItem.2
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

                        public final void invoke(Composer composer2, int i17) {
                            AndroidMenu_androidKt.DropdownMenuItem(function2, function0, modifier2, function8, function7, z4, menuItemColors3, paddingValues2, mutableInteractionSource3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            z2 = z;
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    menuItemColors2 = menuItemColors;
                    if (composerStartRestartGroup.changed(menuItemColors2)) {
                    }
                    i3 |= i16;
                } else {
                    menuItemColors2 = menuItemColors;
                }
                i3 |= i16;
            } else {
                menuItemColors2 = menuItemColors;
            }
            i12 = i2 & 128;
            if (i12 != 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (composerStartRestartGroup.changed(paddingValues)) {
                    i13 = 8388608;
                } else {
                    i13 = 4194304;
                }
                i3 |= i13;
            }
            i14 = i2 & 256;
            if (i14 != 0) {
                i3 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                    i15 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i15 = 33554432;
                }
                i3 |= i15;
            }
            if ((i3 & 38347923) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i4 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i6 != 0) {
                        function5 = null;
                    }
                    if (i8 == 0) {
                    }
                    if (i10 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if ((i2 & 64) != 0) {
                        menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        menuItemColorsItemColors = menuItemColors2;
                    }
                    if (i12 != 0) {
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    } else {
                        dropdownMenuItemContentPadding = paddingValues;
                    }
                    if (i14 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                } else {
                    if (i4 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i6 != 0) {
                        function5 = null;
                    }
                    if (i8 == 0) {
                    }
                    if (i10 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if ((i2 & 64) != 0) {
                        menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        menuItemColorsItemColors = menuItemColors2;
                    }
                    if (i12 != 0) {
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    } else {
                        dropdownMenuItemContentPadding = paddingValues;
                    }
                    if (i14 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1826340448, i3, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:189)");
                }
                MenuKt.DropdownMenuItemContent(function2, function0, companion, function5, function7, z3, menuItemColorsItemColors, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, i3 & 268435454);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = companion;
                z4 = z3;
                function8 = function5;
                menuItemColors3 = menuItemColorsItemColors;
                paddingValues2 = dropdownMenuItemContentPadding;
                mutableInteractionSource3 = mutableInteractionSource2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i4 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i6 != 0) {
                        function5 = null;
                    }
                    if (i8 == 0) {
                    }
                    if (i10 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if ((i2 & 64) != 0) {
                        menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        menuItemColorsItemColors = menuItemColors2;
                    }
                    if (i12 != 0) {
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    } else {
                        dropdownMenuItemContentPadding = paddingValues;
                    }
                    if (i14 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                } else {
                    if (i4 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i6 != 0) {
                        function5 = null;
                    }
                    if (i8 == 0) {
                    }
                    if (i10 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if ((i2 & 64) != 0) {
                        menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        menuItemColorsItemColors = menuItemColors2;
                    }
                    if (i12 != 0) {
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    } else {
                        dropdownMenuItemContentPadding = paddingValues;
                    }
                    if (i14 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1826340448, i3, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:189)");
                }
                MenuKt.DropdownMenuItemContent(function2, function0, companion, function5, function7, z3, menuItemColorsItemColors, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, i3 & 268435454);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = companion;
                z4 = z3;
                function8 = function5;
                menuItemColors3 = menuItemColorsItemColors;
                paddingValues2 = dropdownMenuItemContentPadding;
                mutableInteractionSource3 = mutableInteractionSource2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt.DropdownMenuItem.2
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

                    public final void invoke(Composer composer2, int i17) {
                        AndroidMenu_androidKt.DropdownMenuItem(function2, function0, modifier2, function8, function7, z4, menuItemColors3, paddingValues2, mutableInteractionSource3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 3072;
        function5 = function3;
        i8 = i2 & 16;
        if (i8 != 0) {
            if ((i & 24576) == 0) {
                function6 = function4;
                if (composerStartRestartGroup.changedInstance(function6)) {
                    i9 = 16384;
                } else {
                    i9 = 8192;
                }
                i3 |= i9;
            }
            i10 = i2 & 32;
            if (i10 != 0) {
                if ((196608 & i) == 0) {
                    z2 = z;
                    if (composerStartRestartGroup.changed(z2)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i3 |= i11;
                }
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        menuItemColors2 = menuItemColors;
                        if (composerStartRestartGroup.changed(menuItemColors2)) {
                        }
                        i3 |= i16;
                    } else {
                        menuItemColors2 = menuItemColors;
                    }
                    i3 |= i16;
                } else {
                    menuItemColors2 = menuItemColors;
                }
                i12 = i2 & 128;
                if (i12 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (composerStartRestartGroup.changed(paddingValues)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i3 |= i13;
                }
                i14 = i2 & 256;
                if (i14 != 0) {
                    i3 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                        i15 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i15 = 33554432;
                    }
                    i3 |= i15;
                }
                if ((i3 & 38347923) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i4 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        }
                        if (i8 == 0) {
                        }
                        if (i10 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 64) != 0) {
                            menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            menuItemColorsItemColors = menuItemColors2;
                        }
                        if (i12 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues;
                        }
                        if (i14 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                    } else {
                        if (i4 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        }
                        if (i8 == 0) {
                        }
                        if (i10 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 64) != 0) {
                            menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            menuItemColorsItemColors = menuItemColors2;
                        }
                        if (i12 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues;
                        }
                        if (i14 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1826340448, i3, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:189)");
                    }
                    MenuKt.DropdownMenuItemContent(function2, function0, companion, function5, function7, z3, menuItemColorsItemColors, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, i3 & 268435454);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = companion;
                    z4 = z3;
                    function8 = function5;
                    menuItemColors3 = menuItemColorsItemColors;
                    paddingValues2 = dropdownMenuItemContentPadding;
                    mutableInteractionSource3 = mutableInteractionSource2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i4 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        }
                        if (i8 == 0) {
                        }
                        if (i10 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 64) != 0) {
                            menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            menuItemColorsItemColors = menuItemColors2;
                        }
                        if (i12 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues;
                        }
                        if (i14 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                    } else {
                        if (i4 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        }
                        if (i8 == 0) {
                        }
                        if (i10 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 64) != 0) {
                            menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            menuItemColorsItemColors = menuItemColors2;
                        }
                        if (i12 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues;
                        }
                        if (i14 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1826340448, i3, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:189)");
                    }
                    MenuKt.DropdownMenuItemContent(function2, function0, companion, function5, function7, z3, menuItemColorsItemColors, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, i3 & 268435454);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = companion;
                    z4 = z3;
                    function8 = function5;
                    menuItemColors3 = menuItemColorsItemColors;
                    paddingValues2 = dropdownMenuItemContentPadding;
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt.DropdownMenuItem.2
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

                        public final void invoke(Composer composer2, int i17) {
                            AndroidMenu_androidKt.DropdownMenuItem(function2, function0, modifier2, function8, function7, z4, menuItemColors3, paddingValues2, mutableInteractionSource3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            z2 = z;
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    menuItemColors2 = menuItemColors;
                    if (composerStartRestartGroup.changed(menuItemColors2)) {
                    }
                    i3 |= i16;
                } else {
                    menuItemColors2 = menuItemColors;
                }
                i3 |= i16;
            } else {
                menuItemColors2 = menuItemColors;
            }
            i12 = i2 & 128;
            if (i12 != 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (composerStartRestartGroup.changed(paddingValues)) {
                    i13 = 8388608;
                } else {
                    i13 = 4194304;
                }
                i3 |= i13;
            }
            i14 = i2 & 256;
            if (i14 != 0) {
                i3 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                    i15 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i15 = 33554432;
                }
                i3 |= i15;
            }
            if ((i3 & 38347923) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i4 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i6 != 0) {
                        function5 = null;
                    }
                    if (i8 == 0) {
                    }
                    if (i10 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if ((i2 & 64) != 0) {
                        menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        menuItemColorsItemColors = menuItemColors2;
                    }
                    if (i12 != 0) {
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    } else {
                        dropdownMenuItemContentPadding = paddingValues;
                    }
                    if (i14 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                } else {
                    if (i4 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i6 != 0) {
                        function5 = null;
                    }
                    if (i8 == 0) {
                    }
                    if (i10 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if ((i2 & 64) != 0) {
                        menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        menuItemColorsItemColors = menuItemColors2;
                    }
                    if (i12 != 0) {
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    } else {
                        dropdownMenuItemContentPadding = paddingValues;
                    }
                    if (i14 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1826340448, i3, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:189)");
                }
                MenuKt.DropdownMenuItemContent(function2, function0, companion, function5, function7, z3, menuItemColorsItemColors, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, i3 & 268435454);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = companion;
                z4 = z3;
                function8 = function5;
                menuItemColors3 = menuItemColorsItemColors;
                paddingValues2 = dropdownMenuItemContentPadding;
                mutableInteractionSource3 = mutableInteractionSource2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i4 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i6 != 0) {
                        function5 = null;
                    }
                    if (i8 == 0) {
                    }
                    if (i10 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if ((i2 & 64) != 0) {
                        menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        menuItemColorsItemColors = menuItemColors2;
                    }
                    if (i12 != 0) {
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    } else {
                        dropdownMenuItemContentPadding = paddingValues;
                    }
                    if (i14 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                } else {
                    if (i4 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i6 != 0) {
                        function5 = null;
                    }
                    if (i8 == 0) {
                    }
                    if (i10 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if ((i2 & 64) != 0) {
                        menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        menuItemColorsItemColors = menuItemColors2;
                    }
                    if (i12 != 0) {
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    } else {
                        dropdownMenuItemContentPadding = paddingValues;
                    }
                    if (i14 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1826340448, i3, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:189)");
                }
                MenuKt.DropdownMenuItemContent(function2, function0, companion, function5, function7, z3, menuItemColorsItemColors, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, i3 & 268435454);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = companion;
                z4 = z3;
                function8 = function5;
                menuItemColors3 = menuItemColorsItemColors;
                paddingValues2 = dropdownMenuItemContentPadding;
                mutableInteractionSource3 = mutableInteractionSource2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt.DropdownMenuItem.2
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

                    public final void invoke(Composer composer2, int i17) {
                        AndroidMenu_androidKt.DropdownMenuItem(function2, function0, modifier2, function8, function7, z4, menuItemColors3, paddingValues2, mutableInteractionSource3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 24576;
        function6 = function4;
        i10 = i2 & 32;
        if (i10 != 0) {
            if ((196608 & i) == 0) {
                z2 = z;
                if (composerStartRestartGroup.changed(z2)) {
                    i11 = 131072;
                } else {
                    i11 = 65536;
                }
                i3 |= i11;
            }
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    menuItemColors2 = menuItemColors;
                    if (composerStartRestartGroup.changed(menuItemColors2)) {
                    }
                    i3 |= i16;
                } else {
                    menuItemColors2 = menuItemColors;
                }
                i3 |= i16;
            } else {
                menuItemColors2 = menuItemColors;
            }
            i12 = i2 & 128;
            if (i12 != 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (composerStartRestartGroup.changed(paddingValues)) {
                    i13 = 8388608;
                } else {
                    i13 = 4194304;
                }
                i3 |= i13;
            }
            i14 = i2 & 256;
            if (i14 != 0) {
                i3 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                    i15 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i15 = 33554432;
                }
                i3 |= i15;
            }
            if ((i3 & 38347923) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i4 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i6 != 0) {
                        function5 = null;
                    }
                    if (i8 == 0) {
                    }
                    if (i10 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if ((i2 & 64) != 0) {
                        menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        menuItemColorsItemColors = menuItemColors2;
                    }
                    if (i12 != 0) {
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    } else {
                        dropdownMenuItemContentPadding = paddingValues;
                    }
                    if (i14 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                } else {
                    if (i4 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i6 != 0) {
                        function5 = null;
                    }
                    if (i8 == 0) {
                    }
                    if (i10 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if ((i2 & 64) != 0) {
                        menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        menuItemColorsItemColors = menuItemColors2;
                    }
                    if (i12 != 0) {
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    } else {
                        dropdownMenuItemContentPadding = paddingValues;
                    }
                    if (i14 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1826340448, i3, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:189)");
                }
                MenuKt.DropdownMenuItemContent(function2, function0, companion, function5, function7, z3, menuItemColorsItemColors, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, i3 & 268435454);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = companion;
                z4 = z3;
                function8 = function5;
                menuItemColors3 = menuItemColorsItemColors;
                paddingValues2 = dropdownMenuItemContentPadding;
                mutableInteractionSource3 = mutableInteractionSource2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i4 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i6 != 0) {
                        function5 = null;
                    }
                    if (i8 == 0) {
                    }
                    if (i10 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if ((i2 & 64) != 0) {
                        menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        menuItemColorsItemColors = menuItemColors2;
                    }
                    if (i12 != 0) {
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    } else {
                        dropdownMenuItemContentPadding = paddingValues;
                    }
                    if (i14 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                } else {
                    if (i4 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i6 != 0) {
                        function5 = null;
                    }
                    if (i8 == 0) {
                    }
                    if (i10 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if ((i2 & 64) != 0) {
                        menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        menuItemColorsItemColors = menuItemColors2;
                    }
                    if (i12 != 0) {
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    } else {
                        dropdownMenuItemContentPadding = paddingValues;
                    }
                    if (i14 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(1989948114);
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
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1826340448, i3, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:189)");
                }
                MenuKt.DropdownMenuItemContent(function2, function0, companion, function5, function7, z3, menuItemColorsItemColors, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, i3 & 268435454);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = companion;
                z4 = z3;
                function8 = function5;
                menuItemColors3 = menuItemColorsItemColors;
                paddingValues2 = dropdownMenuItemContentPadding;
                mutableInteractionSource3 = mutableInteractionSource2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt.DropdownMenuItem.2
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

                    public final void invoke(Composer composer2, int i17) {
                        AndroidMenu_androidKt.DropdownMenuItem(function2, function0, modifier2, function8, function7, z4, menuItemColors3, paddingValues2, mutableInteractionSource3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
        }
        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        z2 = z;
        if ((1572864 & i) == 0) {
            if ((i2 & 64) == 0) {
                menuItemColors2 = menuItemColors;
                if (composerStartRestartGroup.changed(menuItemColors2)) {
                }
                i3 |= i16;
            } else {
                menuItemColors2 = menuItemColors;
            }
            i3 |= i16;
        } else {
            menuItemColors2 = menuItemColors;
        }
        i12 = i2 & 128;
        if (i12 != 0) {
            i3 |= 12582912;
        } else if ((i & 12582912) == 0) {
            if (composerStartRestartGroup.changed(paddingValues)) {
                i13 = 8388608;
            } else {
                i13 = 4194304;
            }
            i3 |= i13;
        }
        i14 = i2 & 256;
        if (i14 != 0) {
            i3 |= 100663296;
        } else if ((i & 100663296) == 0) {
            if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                i15 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
            } else {
                i15 = 33554432;
            }
            i3 |= i15;
        }
        if ((i3 & 38347923) == 38347922) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i4 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier;
                }
                if (i6 != 0) {
                    function5 = null;
                }
                if (i8 == 0) {
                }
                if (i10 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if ((i2 & 64) != 0) {
                    menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                    i3 &= -3670017;
                } else {
                    menuItemColorsItemColors = menuItemColors2;
                }
                if (i12 != 0) {
                    dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                } else {
                    dropdownMenuItemContentPadding = paddingValues;
                }
                if (i14 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(1989948114);
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
            } else {
                if (i4 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier;
                }
                if (i6 != 0) {
                    function5 = null;
                }
                if (i8 == 0) {
                }
                if (i10 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if ((i2 & 64) != 0) {
                    menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                    i3 &= -3670017;
                } else {
                    menuItemColorsItemColors = menuItemColors2;
                }
                if (i12 != 0) {
                    dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                } else {
                    dropdownMenuItemContentPadding = paddingValues;
                }
                if (i14 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(1989948114);
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
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1826340448, i3, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:189)");
            }
            MenuKt.DropdownMenuItemContent(function2, function0, companion, function5, function7, z3, menuItemColorsItemColors, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, i3 & 268435454);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = companion;
            z4 = z3;
            function8 = function5;
            menuItemColors3 = menuItemColorsItemColors;
            paddingValues2 = dropdownMenuItemContentPadding;
            mutableInteractionSource3 = mutableInteractionSource2;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i4 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier;
                }
                if (i6 != 0) {
                    function5 = null;
                }
                if (i8 == 0) {
                }
                if (i10 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if ((i2 & 64) != 0) {
                    menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                    i3 &= -3670017;
                } else {
                    menuItemColorsItemColors = menuItemColors2;
                }
                if (i12 != 0) {
                    dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                } else {
                    dropdownMenuItemContentPadding = paddingValues;
                }
                if (i14 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(1989948114);
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
            } else {
                if (i4 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier;
                }
                if (i6 != 0) {
                    function5 = null;
                }
                if (i8 == 0) {
                }
                if (i10 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if ((i2 & 64) != 0) {
                    menuItemColorsItemColors = MenuDefaults.INSTANCE.itemColors(composerStartRestartGroup, 6);
                    i3 &= -3670017;
                } else {
                    menuItemColorsItemColors = menuItemColors2;
                }
                if (i12 != 0) {
                    dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                } else {
                    dropdownMenuItemContentPadding = paddingValues;
                }
                if (i14 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(1989948114);
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
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1826340448, i3, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:189)");
            }
            MenuKt.DropdownMenuItemContent(function2, function0, companion, function5, function7, z3, menuItemColorsItemColors, dropdownMenuItemContentPadding, mutableInteractionSource2, composerStartRestartGroup, i3 & 268435454);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = companion;
            z4 = z3;
            function8 = function5;
            menuItemColors3 = menuItemColorsItemColors;
            paddingValues2 = dropdownMenuItemContentPadding;
            mutableInteractionSource3 = mutableInteractionSource2;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidMenu_androidKt.DropdownMenuItem.2
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

                public final void invoke(Composer composer2, int i17) {
                    AndroidMenu_androidKt.DropdownMenuItem(function2, function0, modifier2, function8, function7, z4, menuItemColors3, paddingValues2, mutableInteractionSource3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }
}
