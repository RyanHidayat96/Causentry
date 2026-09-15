package androidx.compose.material3;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.material3.tokens.RadioButtonTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aM\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u0007¢\u0006\u0002\u0010\u0014\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004\"\u0010\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004\"\u0010\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004¨\u0006\u0015"}, d2 = {"RadioAnimationDuration", "", "RadioButtonDotSize", "Landroidx/compose/ui/unit/Dp;", "F", "RadioButtonPadding", "RadioStrokeWidth", "RadioButton", "", "selected", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "colors", "Landroidx/compose/material3/RadioButtonColors;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/RadioButtonColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class RadioButtonKt {
    private static final int RadioAnimationDuration = 100;
    private static final float RadioButtonPadding = Dp.m6935constructorimpl(2.0f);
    private static final float RadioButtonDotSize = Dp.m6935constructorimpl(12.0f);
    private static final float RadioStrokeWidth = Dp.m6935constructorimpl(2.0f);

    /* JADX WARN: Code duplicated, block: B:100:0x013d  */
    /* JADX WARN: Code duplicated, block: B:103:0x0173  */
    /* JADX WARN: Code duplicated, block: B:104:0x01af  */
    /* JADX WARN: Code duplicated, block: B:107:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:108:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:111:0x0205  */
    /* JADX WARN: Code duplicated, block: B:113:0x020d  */
    /* JADX WARN: Code duplicated, block: B:116:0x0226  */
    /* JADX WARN: Code duplicated, block: B:120:0x0234  */
    /* JADX WARN: Code duplicated, block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0060  */
    /* JADX WARN: Code duplicated, block: B:39:0x0064  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x006f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0079  */
    /* JADX WARN: Code duplicated, block: B:49:0x007d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0085  */
    /* JADX WARN: Code duplicated, block: B:52:0x0088  */
    /* JADX WARN: Code duplicated, block: B:55:0x008e  */
    /* JADX WARN: Code duplicated, block: B:58:0x0096  */
    /* JADX WARN: Code duplicated, block: B:59:0x0098  */
    /* JADX WARN: Code duplicated, block: B:61:0x009b  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:80:0x00df A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:91:0x010b  */
    /* JADX WARN: Code duplicated, block: B:93:0x011d A[PHI: r1 r2 r10 r11
  0x011d: PHI (r1v46 int) = (r1v19 int), (r1v47 int) binds: [B:88:0x00f7, B:79:0x00dd] A[DONT_GENERATE, DONT_INLINE]
  0x011d: PHI (r2v16 androidx.compose.ui.Modifier) = (r2v8 androidx.compose.ui.Modifier), (r2v19 androidx.compose.ui.Modifier) binds: [B:88:0x00f7, B:79:0x00dd] A[DONT_GENERATE, DONT_INLINE]
  0x011d: PHI (r10v25 boolean) = (r10v3 boolean), (r10v2 boolean) binds: [B:88:0x00f7, B:79:0x00dd] A[DONT_GENERATE, DONT_INLINE]
  0x011d: PHI (r11v20 androidx.compose.material3.RadioButtonColors) = (r11v7 androidx.compose.material3.RadioButtonColors), (r11v6 androidx.compose.material3.RadioButtonColors) binds: [B:88:0x00f7, B:79:0x00dd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:96:0x012b  */
    /* JADX WARN: Code duplicated, block: B:99:0x0135  */
    public static final void RadioButton(final boolean z, final Function0<Unit> function0, Modifier modifier, boolean z2, RadioButtonColors radioButtonColors, MutableInteractionSource mutableInteractionSource, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int i4;
        boolean z3;
        int i5;
        RadioButtonColors radioButtonColorsColors;
        int i6;
        MutableInteractionSource mutableInteractionSource2;
        int i7;
        Modifier.Companion companion;
        Object objRememberedValue;
        Modifier modifier3;
        MutableInteractionSource mutableInteractionSource3;
        boolean z4;
        RadioButtonColors radioButtonColors2;
        float fM6935constructorimpl;
        final State<Dp> stateM449animateDpAsStateAjpBEmI;
        final State<Color> stateRadioColor$material3_release;
        boolean z5;
        int i8;
        Modifier.Companion companionM1253selectableO2vRcR0;
        Modifier.Companion companionMinimumInteractiveComponentSize;
        boolean zChanged;
        boolean zChanged2;
        Object objRememberedValue2;
        final RadioButtonColors radioButtonColors3;
        final boolean z6;
        final MutableInteractionSource mutableInteractionSource4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(408580840);
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
        int i9 = i2 & 4;
        if (i9 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    z3 = z2;
                    if (composerStartRestartGroup.changed(z3)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        radioButtonColorsColors = radioButtonColors;
                        int i10 = composerStartRestartGroup.changed(radioButtonColorsColors) ? 16384 : 8192;
                        i3 |= i10;
                    } else {
                        radioButtonColorsColors = radioButtonColors;
                    }
                    i3 |= i10;
                } else {
                    radioButtonColorsColors = radioButtonColors;
                }
                i6 = i2 & 32;
                if (i6 != 0) {
                    if ((196608 & i) == 0) {
                        mutableInteractionSource2 = mutableInteractionSource;
                        if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                            i7 = 131072;
                        } else {
                            i7 = 65536;
                        }
                        i3 |= i7;
                    }
                    if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i9 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier2;
                            }
                            if (i4 != 0) {
                                z3 = true;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                radioButtonColorsColors = RadioButtonDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                            }
                            if (i6 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(735546075);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                modifier3 = companion;
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                                z4 = z3;
                                radioButtonColors2 = radioButtonColorsColors;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(408580840, i3, -1, "androidx.compose.material3.RadioButton (RadioButton.kt:79)");
                            }
                            if (z) {
                                fM6935constructorimpl = Dp.m6935constructorimpl(RadioButtonDotSize / 2.0f);
                            } else {
                                fM6935constructorimpl = Dp.m6935constructorimpl(0.0f);
                            }
                            stateM449animateDpAsStateAjpBEmI = AnimateAsStateKt.m449animateDpAsStateAjpBEmI(fM6935constructorimpl, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composerStartRestartGroup, 48, 12);
                            stateRadioColor$material3_release = radioButtonColors2.radioColor$material3_release(z4, z, composerStartRestartGroup, ((i3 << 3) & 112) | ((i3 >> 9) & 14) | ((i3 >> 6) & 896));
                            composerStartRestartGroup.startReplaceableGroup(735546399);
                            if (function0 != null) {
                                z5 = z4;
                                i8 = 2;
                                companionM1253selectableO2vRcR0 = SelectableKt.m1253selectableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource3, RippleKt.m1744rememberRipple9IZ8Weo(false, Dp.m6935constructorimpl(RadioButtonTokens.INSTANCE.m3298getStateLayerSizeD9Ej5fM() / 2.0f), 0L, composerStartRestartGroup, 54, 4), z5, Role.m6137boximpl(Role.INSTANCE.m6149getRadioButtono7Vup1c()), function0);
                            } else {
                                z5 = z4;
                                i8 = 2;
                                companionM1253selectableO2vRcR0 = Modifier.INSTANCE;
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            if (function0 != null) {
                                companionMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                            } else {
                                companionMinimumInteractiveComponentSize = Modifier.INSTANCE;
                            }
                            Modifier modifierM1039requiredSize3ABfNKs = SizeKt.m1039requiredSize3ABfNKs(PaddingKt.m1002padding3ABfNKs(SizeKt.wrapContentSize$default(modifier3.then(companionMinimumInteractiveComponentSize).then(companionM1253selectableO2vRcR0), Alignment.INSTANCE.getCenter(), false, i8, null), RadioButtonPadding), RadioButtonTokens.INSTANCE.m3297getIconSizeD9Ej5fM());
                            composerStartRestartGroup.startReplaceableGroup(735547384);
                            zChanged = composerStartRestartGroup.changed(stateRadioColor$material3_release);
                            zChanged2 = composerStartRestartGroup.changed(stateM449animateDpAsStateAjpBEmI);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (!(zChanged | zChanged2) || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.RadioButtonKt$RadioButton$2$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                        invoke2(drawScope);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(DrawScope drawScope) {
                                        float f = drawScope.mo694toPx0680j_4(RadioButtonKt.RadioStrokeWidth);
                                        float f2 = f / 2.0f;
                                        DrawScope.m4779drawCircleVaOC9Bg$default(drawScope, stateRadioColor$material3_release.getValue().m4228unboximpl(), drawScope.mo694toPx0680j_4(Dp.m6935constructorimpl(RadioButtonTokens.INSTANCE.m3297getIconSizeD9Ej5fM() / 2.0f)) - f2, 0L, 0.0f, new Stroke(f, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                                        if (Dp.m6934compareTo0680j_4(stateM449animateDpAsStateAjpBEmI.getValue().m6949unboximpl(), Dp.m6935constructorimpl(0.0f)) > 0) {
                                            DrawScope.m4779drawCircleVaOC9Bg$default(drawScope, stateRadioColor$material3_release.getValue().m4228unboximpl(), drawScope.mo694toPx0680j_4(stateM449animateDpAsStateAjpBEmI.getValue().m6949unboximpl()) - f2, 0L, 0.0f, Fill.INSTANCE, null, 0, 108, null);
                                        }
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            CanvasKt.Canvas(modifierM1039requiredSize3ABfNKs, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier2 = modifier3;
                            radioButtonColors3 = radioButtonColors2;
                            z6 = z5;
                            mutableInteractionSource4 = mutableInteractionSource3;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            companion = modifier2;
                        }
                        modifier3 = companion;
                        z4 = z3;
                        radioButtonColors2 = radioButtonColorsColors;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(408580840, i3, -1, "androidx.compose.material3.RadioButton (RadioButton.kt:79)");
                        }
                        if (z) {
                            fM6935constructorimpl = Dp.m6935constructorimpl(RadioButtonDotSize / 2.0f);
                        } else {
                            fM6935constructorimpl = Dp.m6935constructorimpl(0.0f);
                        }
                        stateM449animateDpAsStateAjpBEmI = AnimateAsStateKt.m449animateDpAsStateAjpBEmI(fM6935constructorimpl, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composerStartRestartGroup, 48, 12);
                        stateRadioColor$material3_release = radioButtonColors2.radioColor$material3_release(z4, z, composerStartRestartGroup, ((i3 << 3) & 112) | ((i3 >> 9) & 14) | ((i3 >> 6) & 896));
                        composerStartRestartGroup.startReplaceableGroup(735546399);
                        if (function0 != null) {
                            z5 = z4;
                            i8 = 2;
                            companionM1253selectableO2vRcR0 = SelectableKt.m1253selectableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource3, RippleKt.m1744rememberRipple9IZ8Weo(false, Dp.m6935constructorimpl(RadioButtonTokens.INSTANCE.m3298getStateLayerSizeD9Ej5fM() / 2.0f), 0L, composerStartRestartGroup, 54, 4), z5, Role.m6137boximpl(Role.INSTANCE.m6149getRadioButtono7Vup1c()), function0);
                        } else {
                            z5 = z4;
                            i8 = 2;
                            companionM1253selectableO2vRcR0 = Modifier.INSTANCE;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        if (function0 != null) {
                            companionMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                        } else {
                            companionMinimumInteractiveComponentSize = Modifier.INSTANCE;
                        }
                        Modifier modifierM1039requiredSize3ABfNKs2 = SizeKt.m1039requiredSize3ABfNKs(PaddingKt.m1002padding3ABfNKs(SizeKt.wrapContentSize$default(modifier3.then(companionMinimumInteractiveComponentSize).then(companionM1253selectableO2vRcR0), Alignment.INSTANCE.getCenter(), false, i8, null), RadioButtonPadding), RadioButtonTokens.INSTANCE.m3297getIconSizeD9Ej5fM());
                        composerStartRestartGroup.startReplaceableGroup(735547384);
                        zChanged = composerStartRestartGroup.changed(stateRadioColor$material3_release);
                        zChanged2 = composerStartRestartGroup.changed(stateM449animateDpAsStateAjpBEmI);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged && !zChanged2) {
                            objRememberedValue2 = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.RadioButtonKt$RadioButton$2$1
                                @Override // kotlin.jvm.functions.Function1
                                public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                    invoke2(drawScope);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(DrawScope drawScope) {
                                    float f = drawScope.mo694toPx0680j_4(RadioButtonKt.RadioStrokeWidth);
                                    float f2 = f / 2.0f;
                                    DrawScope.m4779drawCircleVaOC9Bg$default(drawScope, stateRadioColor$material3_release.getValue().m4228unboximpl(), drawScope.mo694toPx0680j_4(Dp.m6935constructorimpl(RadioButtonTokens.INSTANCE.m3297getIconSizeD9Ej5fM() / 2.0f)) - f2, 0L, 0.0f, new Stroke(f, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                                    if (Dp.m6934compareTo0680j_4(stateM449animateDpAsStateAjpBEmI.getValue().m6949unboximpl(), Dp.m6935constructorimpl(0.0f)) > 0) {
                                        DrawScope.m4779drawCircleVaOC9Bg$default(drawScope, stateRadioColor$material3_release.getValue().m4228unboximpl(), drawScope.mo694toPx0680j_4(stateM449animateDpAsStateAjpBEmI.getValue().m6949unboximpl()) - f2, 0L, 0.0f, Fill.INSTANCE, null, 0, 108, null);
                                    }
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.RadioButtonKt$RadioButton$2$1
                                @Override // kotlin.jvm.functions.Function1
                                public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                    invoke2(drawScope);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(DrawScope drawScope) {
                                    float f = drawScope.mo694toPx0680j_4(RadioButtonKt.RadioStrokeWidth);
                                    float f2 = f / 2.0f;
                                    DrawScope.m4779drawCircleVaOC9Bg$default(drawScope, stateRadioColor$material3_release.getValue().m4228unboximpl(), drawScope.mo694toPx0680j_4(Dp.m6935constructorimpl(RadioButtonTokens.INSTANCE.m3297getIconSizeD9Ej5fM() / 2.0f)) - f2, 0L, 0.0f, new Stroke(f, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                                    if (Dp.m6934compareTo0680j_4(stateM449animateDpAsStateAjpBEmI.getValue().m6949unboximpl(), Dp.m6935constructorimpl(0.0f)) > 0) {
                                        DrawScope.m4779drawCircleVaOC9Bg$default(drawScope, stateRadioColor$material3_release.getValue().m4228unboximpl(), drawScope.mo694toPx0680j_4(stateM449animateDpAsStateAjpBEmI.getValue().m6949unboximpl()) - f2, 0L, 0.0f, Fill.INSTANCE, null, 0, 108, null);
                                    }
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        CanvasKt.Canvas(modifierM1039requiredSize3ABfNKs2, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier3;
                        radioButtonColors3 = radioButtonColors2;
                        z6 = z5;
                        mutableInteractionSource4 = mutableInteractionSource3;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        z6 = z3;
                        radioButtonColors3 = radioButtonColorsColors;
                        composerStartRestartGroup = composerStartRestartGroup;
                        mutableInteractionSource4 = mutableInteractionSource2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.RadioButtonKt.RadioButton.3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i11) {
                                RadioButtonKt.RadioButton(z, function0, modifier2, z6, radioButtonColors3, mutableInteractionSource4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                    }
                }
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                mutableInteractionSource2 = mutableInteractionSource;
                if ((74899 & i3) == 74898) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            radioButtonColorsColors = RadioButtonDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(735546075);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            modifier3 = companion;
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            z4 = z3;
                            radioButtonColors2 = radioButtonColorsColors;
                        } else {
                            modifier3 = companion;
                            z4 = z3;
                            radioButtonColors2 = radioButtonColorsColors;
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                    } else {
                        if (i9 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            radioButtonColorsColors = RadioButtonDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(735546075);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            modifier3 = companion;
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            z4 = z3;
                            radioButtonColors2 = radioButtonColorsColors;
                        } else {
                            modifier3 = companion;
                            z4 = z3;
                            radioButtonColors2 = radioButtonColorsColors;
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(408580840, i3, -1, "androidx.compose.material3.RadioButton (RadioButton.kt:79)");
                    }
                    if (z) {
                        fM6935constructorimpl = Dp.m6935constructorimpl(RadioButtonDotSize / 2.0f);
                    } else {
                        fM6935constructorimpl = Dp.m6935constructorimpl(0.0f);
                    }
                    stateM449animateDpAsStateAjpBEmI = AnimateAsStateKt.m449animateDpAsStateAjpBEmI(fM6935constructorimpl, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composerStartRestartGroup, 48, 12);
                    stateRadioColor$material3_release = radioButtonColors2.radioColor$material3_release(z4, z, composerStartRestartGroup, ((i3 << 3) & 112) | ((i3 >> 9) & 14) | ((i3 >> 6) & 896));
                    composerStartRestartGroup.startReplaceableGroup(735546399);
                    if (function0 != null) {
                        z5 = z4;
                        i8 = 2;
                        companionM1253selectableO2vRcR0 = SelectableKt.m1253selectableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource3, RippleKt.m1744rememberRipple9IZ8Weo(false, Dp.m6935constructorimpl(RadioButtonTokens.INSTANCE.m3298getStateLayerSizeD9Ej5fM() / 2.0f), 0L, composerStartRestartGroup, 54, 4), z5, Role.m6137boximpl(Role.INSTANCE.m6149getRadioButtono7Vup1c()), function0);
                    } else {
                        z5 = z4;
                        i8 = 2;
                        companionM1253selectableO2vRcR0 = Modifier.INSTANCE;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (function0 != null) {
                        companionMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                    } else {
                        companionMinimumInteractiveComponentSize = Modifier.INSTANCE;
                    }
                    Modifier modifierM1039requiredSize3ABfNKs3 = SizeKt.m1039requiredSize3ABfNKs(PaddingKt.m1002padding3ABfNKs(SizeKt.wrapContentSize$default(modifier3.then(companionMinimumInteractiveComponentSize).then(companionM1253selectableO2vRcR0), Alignment.INSTANCE.getCenter(), false, i8, null), RadioButtonPadding), RadioButtonTokens.INSTANCE.m3297getIconSizeD9Ej5fM());
                    composerStartRestartGroup.startReplaceableGroup(735547384);
                    zChanged = composerStartRestartGroup.changed(stateRadioColor$material3_release);
                    zChanged2 = composerStartRestartGroup.changed(stateM449animateDpAsStateAjpBEmI);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged && !zChanged2) {
                        objRememberedValue2 = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.RadioButtonKt$RadioButton$2$1
                            @Override // kotlin.jvm.functions.Function1
                            public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                invoke2(drawScope);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(DrawScope drawScope) {
                                float f = drawScope.mo694toPx0680j_4(RadioButtonKt.RadioStrokeWidth);
                                float f2 = f / 2.0f;
                                DrawScope.m4779drawCircleVaOC9Bg$default(drawScope, stateRadioColor$material3_release.getValue().m4228unboximpl(), drawScope.mo694toPx0680j_4(Dp.m6935constructorimpl(RadioButtonTokens.INSTANCE.m3297getIconSizeD9Ej5fM() / 2.0f)) - f2, 0L, 0.0f, new Stroke(f, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                                if (Dp.m6934compareTo0680j_4(stateM449animateDpAsStateAjpBEmI.getValue().m6949unboximpl(), Dp.m6935constructorimpl(0.0f)) > 0) {
                                    DrawScope.m4779drawCircleVaOC9Bg$default(drawScope, stateRadioColor$material3_release.getValue().m4228unboximpl(), drawScope.mo694toPx0680j_4(stateM449animateDpAsStateAjpBEmI.getValue().m6949unboximpl()) - f2, 0L, 0.0f, Fill.INSTANCE, null, 0, 108, null);
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.RadioButtonKt$RadioButton$2$1
                            @Override // kotlin.jvm.functions.Function1
                            public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                invoke2(drawScope);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(DrawScope drawScope) {
                                float f = drawScope.mo694toPx0680j_4(RadioButtonKt.RadioStrokeWidth);
                                float f2 = f / 2.0f;
                                DrawScope.m4779drawCircleVaOC9Bg$default(drawScope, stateRadioColor$material3_release.getValue().m4228unboximpl(), drawScope.mo694toPx0680j_4(Dp.m6935constructorimpl(RadioButtonTokens.INSTANCE.m3297getIconSizeD9Ej5fM() / 2.0f)) - f2, 0L, 0.0f, new Stroke(f, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                                if (Dp.m6934compareTo0680j_4(stateM449animateDpAsStateAjpBEmI.getValue().m6949unboximpl(), Dp.m6935constructorimpl(0.0f)) > 0) {
                                    DrawScope.m4779drawCircleVaOC9Bg$default(drawScope, stateRadioColor$material3_release.getValue().m4228unboximpl(), drawScope.mo694toPx0680j_4(stateM449animateDpAsStateAjpBEmI.getValue().m6949unboximpl()) - f2, 0L, 0.0f, Fill.INSTANCE, null, 0, 108, null);
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CanvasKt.Canvas(modifierM1039requiredSize3ABfNKs3, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier3;
                    radioButtonColors3 = radioButtonColors2;
                    z6 = z5;
                    mutableInteractionSource4 = mutableInteractionSource3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            radioButtonColorsColors = RadioButtonDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(735546075);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            modifier3 = companion;
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            z4 = z3;
                            radioButtonColors2 = radioButtonColorsColors;
                        } else {
                            modifier3 = companion;
                            z4 = z3;
                            radioButtonColors2 = radioButtonColorsColors;
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                    } else {
                        if (i9 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            radioButtonColorsColors = RadioButtonDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(735546075);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            modifier3 = companion;
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            z4 = z3;
                            radioButtonColors2 = radioButtonColorsColors;
                        } else {
                            modifier3 = companion;
                            z4 = z3;
                            radioButtonColors2 = radioButtonColorsColors;
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(408580840, i3, -1, "androidx.compose.material3.RadioButton (RadioButton.kt:79)");
                    }
                    if (z) {
                        fM6935constructorimpl = Dp.m6935constructorimpl(RadioButtonDotSize / 2.0f);
                    } else {
                        fM6935constructorimpl = Dp.m6935constructorimpl(0.0f);
                    }
                    stateM449animateDpAsStateAjpBEmI = AnimateAsStateKt.m449animateDpAsStateAjpBEmI(fM6935constructorimpl, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composerStartRestartGroup, 48, 12);
                    stateRadioColor$material3_release = radioButtonColors2.radioColor$material3_release(z4, z, composerStartRestartGroup, ((i3 << 3) & 112) | ((i3 >> 9) & 14) | ((i3 >> 6) & 896));
                    composerStartRestartGroup.startReplaceableGroup(735546399);
                    if (function0 != null) {
                        z5 = z4;
                        i8 = 2;
                        companionM1253selectableO2vRcR0 = SelectableKt.m1253selectableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource3, RippleKt.m1744rememberRipple9IZ8Weo(false, Dp.m6935constructorimpl(RadioButtonTokens.INSTANCE.m3298getStateLayerSizeD9Ej5fM() / 2.0f), 0L, composerStartRestartGroup, 54, 4), z5, Role.m6137boximpl(Role.INSTANCE.m6149getRadioButtono7Vup1c()), function0);
                    } else {
                        z5 = z4;
                        i8 = 2;
                        companionM1253selectableO2vRcR0 = Modifier.INSTANCE;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (function0 != null) {
                        companionMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                    } else {
                        companionMinimumInteractiveComponentSize = Modifier.INSTANCE;
                    }
                    Modifier modifierM1039requiredSize3ABfNKs4 = SizeKt.m1039requiredSize3ABfNKs(PaddingKt.m1002padding3ABfNKs(SizeKt.wrapContentSize$default(modifier3.then(companionMinimumInteractiveComponentSize).then(companionM1253selectableO2vRcR0), Alignment.INSTANCE.getCenter(), false, i8, null), RadioButtonPadding), RadioButtonTokens.INSTANCE.m3297getIconSizeD9Ej5fM());
                    composerStartRestartGroup.startReplaceableGroup(735547384);
                    zChanged = composerStartRestartGroup.changed(stateRadioColor$material3_release);
                    zChanged2 = composerStartRestartGroup.changed(stateM449animateDpAsStateAjpBEmI);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged && !zChanged2) {
                        objRememberedValue2 = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.RadioButtonKt$RadioButton$2$1
                            @Override // kotlin.jvm.functions.Function1
                            public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                invoke2(drawScope);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(DrawScope drawScope) {
                                float f = drawScope.mo694toPx0680j_4(RadioButtonKt.RadioStrokeWidth);
                                float f2 = f / 2.0f;
                                DrawScope.m4779drawCircleVaOC9Bg$default(drawScope, stateRadioColor$material3_release.getValue().m4228unboximpl(), drawScope.mo694toPx0680j_4(Dp.m6935constructorimpl(RadioButtonTokens.INSTANCE.m3297getIconSizeD9Ej5fM() / 2.0f)) - f2, 0L, 0.0f, new Stroke(f, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                                if (Dp.m6934compareTo0680j_4(stateM449animateDpAsStateAjpBEmI.getValue().m6949unboximpl(), Dp.m6935constructorimpl(0.0f)) > 0) {
                                    DrawScope.m4779drawCircleVaOC9Bg$default(drawScope, stateRadioColor$material3_release.getValue().m4228unboximpl(), drawScope.mo694toPx0680j_4(stateM449animateDpAsStateAjpBEmI.getValue().m6949unboximpl()) - f2, 0L, 0.0f, Fill.INSTANCE, null, 0, 108, null);
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.RadioButtonKt$RadioButton$2$1
                            @Override // kotlin.jvm.functions.Function1
                            public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                invoke2(drawScope);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(DrawScope drawScope) {
                                float f = drawScope.mo694toPx0680j_4(RadioButtonKt.RadioStrokeWidth);
                                float f2 = f / 2.0f;
                                DrawScope.m4779drawCircleVaOC9Bg$default(drawScope, stateRadioColor$material3_release.getValue().m4228unboximpl(), drawScope.mo694toPx0680j_4(Dp.m6935constructorimpl(RadioButtonTokens.INSTANCE.m3297getIconSizeD9Ej5fM() / 2.0f)) - f2, 0L, 0.0f, new Stroke(f, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                                if (Dp.m6934compareTo0680j_4(stateM449animateDpAsStateAjpBEmI.getValue().m6949unboximpl(), Dp.m6935constructorimpl(0.0f)) > 0) {
                                    DrawScope.m4779drawCircleVaOC9Bg$default(drawScope, stateRadioColor$material3_release.getValue().m4228unboximpl(), drawScope.mo694toPx0680j_4(stateM449animateDpAsStateAjpBEmI.getValue().m6949unboximpl()) - f2, 0L, 0.0f, Fill.INSTANCE, null, 0, 108, null);
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CanvasKt.Canvas(modifierM1039requiredSize3ABfNKs4, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier3;
                    radioButtonColors3 = radioButtonColors2;
                    z6 = z5;
                    mutableInteractionSource4 = mutableInteractionSource3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.RadioButtonKt.RadioButton.3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i11) {
                            RadioButtonKt.RadioButton(z, function0, modifier2, z6, radioButtonColors3, mutableInteractionSource4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 3072;
            z3 = z2;
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    radioButtonColorsColors = radioButtonColors;
                    if (composerStartRestartGroup.changed(radioButtonColorsColors)) {
                    }
                    i3 |= i10;
                } else {
                    radioButtonColorsColors = radioButtonColors;
                }
                i3 |= i10;
            } else {
                radioButtonColorsColors = radioButtonColors;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                if ((74899 & i3) == 74898) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            radioButtonColorsColors = RadioButtonDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(735546075);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            modifier3 = companion;
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            z4 = z3;
                            radioButtonColors2 = radioButtonColorsColors;
                        } else {
                            modifier3 = companion;
                            z4 = z3;
                            radioButtonColors2 = radioButtonColorsColors;
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                    } else {
                        if (i9 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            radioButtonColorsColors = RadioButtonDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(735546075);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            modifier3 = companion;
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            z4 = z3;
                            radioButtonColors2 = radioButtonColorsColors;
                        } else {
                            modifier3 = companion;
                            z4 = z3;
                            radioButtonColors2 = radioButtonColorsColors;
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(408580840, i3, -1, "androidx.compose.material3.RadioButton (RadioButton.kt:79)");
                    }
                    if (z) {
                        fM6935constructorimpl = Dp.m6935constructorimpl(RadioButtonDotSize / 2.0f);
                    } else {
                        fM6935constructorimpl = Dp.m6935constructorimpl(0.0f);
                    }
                    stateM449animateDpAsStateAjpBEmI = AnimateAsStateKt.m449animateDpAsStateAjpBEmI(fM6935constructorimpl, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composerStartRestartGroup, 48, 12);
                    stateRadioColor$material3_release = radioButtonColors2.radioColor$material3_release(z4, z, composerStartRestartGroup, ((i3 << 3) & 112) | ((i3 >> 9) & 14) | ((i3 >> 6) & 896));
                    composerStartRestartGroup.startReplaceableGroup(735546399);
                    if (function0 != null) {
                        z5 = z4;
                        i8 = 2;
                        companionM1253selectableO2vRcR0 = SelectableKt.m1253selectableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource3, RippleKt.m1744rememberRipple9IZ8Weo(false, Dp.m6935constructorimpl(RadioButtonTokens.INSTANCE.m3298getStateLayerSizeD9Ej5fM() / 2.0f), 0L, composerStartRestartGroup, 54, 4), z5, Role.m6137boximpl(Role.INSTANCE.m6149getRadioButtono7Vup1c()), function0);
                    } else {
                        z5 = z4;
                        i8 = 2;
                        companionM1253selectableO2vRcR0 = Modifier.INSTANCE;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (function0 != null) {
                        companionMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                    } else {
                        companionMinimumInteractiveComponentSize = Modifier.INSTANCE;
                    }
                    Modifier modifierM1039requiredSize3ABfNKs5 = SizeKt.m1039requiredSize3ABfNKs(PaddingKt.m1002padding3ABfNKs(SizeKt.wrapContentSize$default(modifier3.then(companionMinimumInteractiveComponentSize).then(companionM1253selectableO2vRcR0), Alignment.INSTANCE.getCenter(), false, i8, null), RadioButtonPadding), RadioButtonTokens.INSTANCE.m3297getIconSizeD9Ej5fM());
                    composerStartRestartGroup.startReplaceableGroup(735547384);
                    zChanged = composerStartRestartGroup.changed(stateRadioColor$material3_release);
                    zChanged2 = composerStartRestartGroup.changed(stateM449animateDpAsStateAjpBEmI);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged && !zChanged2) {
                        objRememberedValue2 = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.RadioButtonKt$RadioButton$2$1
                            @Override // kotlin.jvm.functions.Function1
                            public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                invoke2(drawScope);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(DrawScope drawScope) {
                                float f = drawScope.mo694toPx0680j_4(RadioButtonKt.RadioStrokeWidth);
                                float f2 = f / 2.0f;
                                DrawScope.m4779drawCircleVaOC9Bg$default(drawScope, stateRadioColor$material3_release.getValue().m4228unboximpl(), drawScope.mo694toPx0680j_4(Dp.m6935constructorimpl(RadioButtonTokens.INSTANCE.m3297getIconSizeD9Ej5fM() / 2.0f)) - f2, 0L, 0.0f, new Stroke(f, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                                if (Dp.m6934compareTo0680j_4(stateM449animateDpAsStateAjpBEmI.getValue().m6949unboximpl(), Dp.m6935constructorimpl(0.0f)) > 0) {
                                    DrawScope.m4779drawCircleVaOC9Bg$default(drawScope, stateRadioColor$material3_release.getValue().m4228unboximpl(), drawScope.mo694toPx0680j_4(stateM449animateDpAsStateAjpBEmI.getValue().m6949unboximpl()) - f2, 0L, 0.0f, Fill.INSTANCE, null, 0, 108, null);
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.RadioButtonKt$RadioButton$2$1
                            @Override // kotlin.jvm.functions.Function1
                            public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                invoke2(drawScope);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(DrawScope drawScope) {
                                float f = drawScope.mo694toPx0680j_4(RadioButtonKt.RadioStrokeWidth);
                                float f2 = f / 2.0f;
                                DrawScope.m4779drawCircleVaOC9Bg$default(drawScope, stateRadioColor$material3_release.getValue().m4228unboximpl(), drawScope.mo694toPx0680j_4(Dp.m6935constructorimpl(RadioButtonTokens.INSTANCE.m3297getIconSizeD9Ej5fM() / 2.0f)) - f2, 0L, 0.0f, new Stroke(f, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                                if (Dp.m6934compareTo0680j_4(stateM449animateDpAsStateAjpBEmI.getValue().m6949unboximpl(), Dp.m6935constructorimpl(0.0f)) > 0) {
                                    DrawScope.m4779drawCircleVaOC9Bg$default(drawScope, stateRadioColor$material3_release.getValue().m4228unboximpl(), drawScope.mo694toPx0680j_4(stateM449animateDpAsStateAjpBEmI.getValue().m6949unboximpl()) - f2, 0L, 0.0f, Fill.INSTANCE, null, 0, 108, null);
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CanvasKt.Canvas(modifierM1039requiredSize3ABfNKs5, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier3;
                    radioButtonColors3 = radioButtonColors2;
                    z6 = z5;
                    mutableInteractionSource4 = mutableInteractionSource3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            radioButtonColorsColors = RadioButtonDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(735546075);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            modifier3 = companion;
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            z4 = z3;
                            radioButtonColors2 = radioButtonColorsColors;
                        } else {
                            modifier3 = companion;
                            z4 = z3;
                            radioButtonColors2 = radioButtonColorsColors;
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                    } else {
                        if (i9 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            radioButtonColorsColors = RadioButtonDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(735546075);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            modifier3 = companion;
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            z4 = z3;
                            radioButtonColors2 = radioButtonColorsColors;
                        } else {
                            modifier3 = companion;
                            z4 = z3;
                            radioButtonColors2 = radioButtonColorsColors;
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(408580840, i3, -1, "androidx.compose.material3.RadioButton (RadioButton.kt:79)");
                    }
                    if (z) {
                        fM6935constructorimpl = Dp.m6935constructorimpl(RadioButtonDotSize / 2.0f);
                    } else {
                        fM6935constructorimpl = Dp.m6935constructorimpl(0.0f);
                    }
                    stateM449animateDpAsStateAjpBEmI = AnimateAsStateKt.m449animateDpAsStateAjpBEmI(fM6935constructorimpl, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composerStartRestartGroup, 48, 12);
                    stateRadioColor$material3_release = radioButtonColors2.radioColor$material3_release(z4, z, composerStartRestartGroup, ((i3 << 3) & 112) | ((i3 >> 9) & 14) | ((i3 >> 6) & 896));
                    composerStartRestartGroup.startReplaceableGroup(735546399);
                    if (function0 != null) {
                        z5 = z4;
                        i8 = 2;
                        companionM1253selectableO2vRcR0 = SelectableKt.m1253selectableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource3, RippleKt.m1744rememberRipple9IZ8Weo(false, Dp.m6935constructorimpl(RadioButtonTokens.INSTANCE.m3298getStateLayerSizeD9Ej5fM() / 2.0f), 0L, composerStartRestartGroup, 54, 4), z5, Role.m6137boximpl(Role.INSTANCE.m6149getRadioButtono7Vup1c()), function0);
                    } else {
                        z5 = z4;
                        i8 = 2;
                        companionM1253selectableO2vRcR0 = Modifier.INSTANCE;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (function0 != null) {
                        companionMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                    } else {
                        companionMinimumInteractiveComponentSize = Modifier.INSTANCE;
                    }
                    Modifier modifierM1039requiredSize3ABfNKs6 = SizeKt.m1039requiredSize3ABfNKs(PaddingKt.m1002padding3ABfNKs(SizeKt.wrapContentSize$default(modifier3.then(companionMinimumInteractiveComponentSize).then(companionM1253selectableO2vRcR0), Alignment.INSTANCE.getCenter(), false, i8, null), RadioButtonPadding), RadioButtonTokens.INSTANCE.m3297getIconSizeD9Ej5fM());
                    composerStartRestartGroup.startReplaceableGroup(735547384);
                    zChanged = composerStartRestartGroup.changed(stateRadioColor$material3_release);
                    zChanged2 = composerStartRestartGroup.changed(stateM449animateDpAsStateAjpBEmI);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged && !zChanged2) {
                        objRememberedValue2 = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.RadioButtonKt$RadioButton$2$1
                            @Override // kotlin.jvm.functions.Function1
                            public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                invoke2(drawScope);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(DrawScope drawScope) {
                                float f = drawScope.mo694toPx0680j_4(RadioButtonKt.RadioStrokeWidth);
                                float f2 = f / 2.0f;
                                DrawScope.m4779drawCircleVaOC9Bg$default(drawScope, stateRadioColor$material3_release.getValue().m4228unboximpl(), drawScope.mo694toPx0680j_4(Dp.m6935constructorimpl(RadioButtonTokens.INSTANCE.m3297getIconSizeD9Ej5fM() / 2.0f)) - f2, 0L, 0.0f, new Stroke(f, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                                if (Dp.m6934compareTo0680j_4(stateM449animateDpAsStateAjpBEmI.getValue().m6949unboximpl(), Dp.m6935constructorimpl(0.0f)) > 0) {
                                    DrawScope.m4779drawCircleVaOC9Bg$default(drawScope, stateRadioColor$material3_release.getValue().m4228unboximpl(), drawScope.mo694toPx0680j_4(stateM449animateDpAsStateAjpBEmI.getValue().m6949unboximpl()) - f2, 0L, 0.0f, Fill.INSTANCE, null, 0, 108, null);
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.RadioButtonKt$RadioButton$2$1
                            @Override // kotlin.jvm.functions.Function1
                            public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                invoke2(drawScope);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(DrawScope drawScope) {
                                float f = drawScope.mo694toPx0680j_4(RadioButtonKt.RadioStrokeWidth);
                                float f2 = f / 2.0f;
                                DrawScope.m4779drawCircleVaOC9Bg$default(drawScope, stateRadioColor$material3_release.getValue().m4228unboximpl(), drawScope.mo694toPx0680j_4(Dp.m6935constructorimpl(RadioButtonTokens.INSTANCE.m3297getIconSizeD9Ej5fM() / 2.0f)) - f2, 0L, 0.0f, new Stroke(f, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                                if (Dp.m6934compareTo0680j_4(stateM449animateDpAsStateAjpBEmI.getValue().m6949unboximpl(), Dp.m6935constructorimpl(0.0f)) > 0) {
                                    DrawScope.m4779drawCircleVaOC9Bg$default(drawScope, stateRadioColor$material3_release.getValue().m4228unboximpl(), drawScope.mo694toPx0680j_4(stateM449animateDpAsStateAjpBEmI.getValue().m6949unboximpl()) - f2, 0L, 0.0f, Fill.INSTANCE, null, 0, 108, null);
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CanvasKt.Canvas(modifierM1039requiredSize3ABfNKs6, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier3;
                    radioButtonColors3 = radioButtonColors2;
                    z6 = z5;
                    mutableInteractionSource4 = mutableInteractionSource3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.RadioButtonKt.RadioButton.3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i11) {
                            RadioButtonKt.RadioButton(z, function0, modifier2, z6, radioButtonColors3, mutableInteractionSource4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            mutableInteractionSource2 = mutableInteractionSource;
            if ((74899 & i3) == 74898) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        radioButtonColorsColors = RadioButtonDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(735546075);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        modifier3 = companion;
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        z4 = z3;
                        radioButtonColors2 = radioButtonColorsColors;
                    } else {
                        modifier3 = companion;
                        z4 = z3;
                        radioButtonColors2 = radioButtonColorsColors;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                } else {
                    if (i9 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        radioButtonColorsColors = RadioButtonDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(735546075);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        modifier3 = companion;
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        z4 = z3;
                        radioButtonColors2 = radioButtonColorsColors;
                    } else {
                        modifier3 = companion;
                        z4 = z3;
                        radioButtonColors2 = radioButtonColorsColors;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(408580840, i3, -1, "androidx.compose.material3.RadioButton (RadioButton.kt:79)");
                }
                if (z) {
                    fM6935constructorimpl = Dp.m6935constructorimpl(RadioButtonDotSize / 2.0f);
                } else {
                    fM6935constructorimpl = Dp.m6935constructorimpl(0.0f);
                }
                stateM449animateDpAsStateAjpBEmI = AnimateAsStateKt.m449animateDpAsStateAjpBEmI(fM6935constructorimpl, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composerStartRestartGroup, 48, 12);
                stateRadioColor$material3_release = radioButtonColors2.radioColor$material3_release(z4, z, composerStartRestartGroup, ((i3 << 3) & 112) | ((i3 >> 9) & 14) | ((i3 >> 6) & 896));
                composerStartRestartGroup.startReplaceableGroup(735546399);
                if (function0 != null) {
                    z5 = z4;
                    i8 = 2;
                    companionM1253selectableO2vRcR0 = SelectableKt.m1253selectableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource3, RippleKt.m1744rememberRipple9IZ8Weo(false, Dp.m6935constructorimpl(RadioButtonTokens.INSTANCE.m3298getStateLayerSizeD9Ej5fM() / 2.0f), 0L, composerStartRestartGroup, 54, 4), z5, Role.m6137boximpl(Role.INSTANCE.m6149getRadioButtono7Vup1c()), function0);
                } else {
                    z5 = z4;
                    i8 = 2;
                    companionM1253selectableO2vRcR0 = Modifier.INSTANCE;
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (function0 != null) {
                    companionMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                } else {
                    companionMinimumInteractiveComponentSize = Modifier.INSTANCE;
                }
                Modifier modifierM1039requiredSize3ABfNKs7 = SizeKt.m1039requiredSize3ABfNKs(PaddingKt.m1002padding3ABfNKs(SizeKt.wrapContentSize$default(modifier3.then(companionMinimumInteractiveComponentSize).then(companionM1253selectableO2vRcR0), Alignment.INSTANCE.getCenter(), false, i8, null), RadioButtonPadding), RadioButtonTokens.INSTANCE.m3297getIconSizeD9Ej5fM());
                composerStartRestartGroup.startReplaceableGroup(735547384);
                zChanged = composerStartRestartGroup.changed(stateRadioColor$material3_release);
                zChanged2 = composerStartRestartGroup.changed(stateM449animateDpAsStateAjpBEmI);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged && !zChanged2) {
                    objRememberedValue2 = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.RadioButtonKt$RadioButton$2$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DrawScope drawScope) {
                            float f = drawScope.mo694toPx0680j_4(RadioButtonKt.RadioStrokeWidth);
                            float f2 = f / 2.0f;
                            DrawScope.m4779drawCircleVaOC9Bg$default(drawScope, stateRadioColor$material3_release.getValue().m4228unboximpl(), drawScope.mo694toPx0680j_4(Dp.m6935constructorimpl(RadioButtonTokens.INSTANCE.m3297getIconSizeD9Ej5fM() / 2.0f)) - f2, 0L, 0.0f, new Stroke(f, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                            if (Dp.m6934compareTo0680j_4(stateM449animateDpAsStateAjpBEmI.getValue().m6949unboximpl(), Dp.m6935constructorimpl(0.0f)) > 0) {
                                DrawScope.m4779drawCircleVaOC9Bg$default(drawScope, stateRadioColor$material3_release.getValue().m4228unboximpl(), drawScope.mo694toPx0680j_4(stateM449animateDpAsStateAjpBEmI.getValue().m6949unboximpl()) - f2, 0L, 0.0f, Fill.INSTANCE, null, 0, 108, null);
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.RadioButtonKt$RadioButton$2$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DrawScope drawScope) {
                            float f = drawScope.mo694toPx0680j_4(RadioButtonKt.RadioStrokeWidth);
                            float f2 = f / 2.0f;
                            DrawScope.m4779drawCircleVaOC9Bg$default(drawScope, stateRadioColor$material3_release.getValue().m4228unboximpl(), drawScope.mo694toPx0680j_4(Dp.m6935constructorimpl(RadioButtonTokens.INSTANCE.m3297getIconSizeD9Ej5fM() / 2.0f)) - f2, 0L, 0.0f, new Stroke(f, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                            if (Dp.m6934compareTo0680j_4(stateM449animateDpAsStateAjpBEmI.getValue().m6949unboximpl(), Dp.m6935constructorimpl(0.0f)) > 0) {
                                DrawScope.m4779drawCircleVaOC9Bg$default(drawScope, stateRadioColor$material3_release.getValue().m4228unboximpl(), drawScope.mo694toPx0680j_4(stateM449animateDpAsStateAjpBEmI.getValue().m6949unboximpl()) - f2, 0L, 0.0f, Fill.INSTANCE, null, 0, 108, null);
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(modifierM1039requiredSize3ABfNKs7, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
                radioButtonColors3 = radioButtonColors2;
                z6 = z5;
                mutableInteractionSource4 = mutableInteractionSource3;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        radioButtonColorsColors = RadioButtonDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(735546075);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        modifier3 = companion;
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        z4 = z3;
                        radioButtonColors2 = radioButtonColorsColors;
                    } else {
                        modifier3 = companion;
                        z4 = z3;
                        radioButtonColors2 = radioButtonColorsColors;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                } else {
                    if (i9 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        radioButtonColorsColors = RadioButtonDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(735546075);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        modifier3 = companion;
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        z4 = z3;
                        radioButtonColors2 = radioButtonColorsColors;
                    } else {
                        modifier3 = companion;
                        z4 = z3;
                        radioButtonColors2 = radioButtonColorsColors;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(408580840, i3, -1, "androidx.compose.material3.RadioButton (RadioButton.kt:79)");
                }
                if (z) {
                    fM6935constructorimpl = Dp.m6935constructorimpl(RadioButtonDotSize / 2.0f);
                } else {
                    fM6935constructorimpl = Dp.m6935constructorimpl(0.0f);
                }
                stateM449animateDpAsStateAjpBEmI = AnimateAsStateKt.m449animateDpAsStateAjpBEmI(fM6935constructorimpl, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composerStartRestartGroup, 48, 12);
                stateRadioColor$material3_release = radioButtonColors2.radioColor$material3_release(z4, z, composerStartRestartGroup, ((i3 << 3) & 112) | ((i3 >> 9) & 14) | ((i3 >> 6) & 896));
                composerStartRestartGroup.startReplaceableGroup(735546399);
                if (function0 != null) {
                    z5 = z4;
                    i8 = 2;
                    companionM1253selectableO2vRcR0 = SelectableKt.m1253selectableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource3, RippleKt.m1744rememberRipple9IZ8Weo(false, Dp.m6935constructorimpl(RadioButtonTokens.INSTANCE.m3298getStateLayerSizeD9Ej5fM() / 2.0f), 0L, composerStartRestartGroup, 54, 4), z5, Role.m6137boximpl(Role.INSTANCE.m6149getRadioButtono7Vup1c()), function0);
                } else {
                    z5 = z4;
                    i8 = 2;
                    companionM1253selectableO2vRcR0 = Modifier.INSTANCE;
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (function0 != null) {
                    companionMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                } else {
                    companionMinimumInteractiveComponentSize = Modifier.INSTANCE;
                }
                Modifier modifierM1039requiredSize3ABfNKs8 = SizeKt.m1039requiredSize3ABfNKs(PaddingKt.m1002padding3ABfNKs(SizeKt.wrapContentSize$default(modifier3.then(companionMinimumInteractiveComponentSize).then(companionM1253selectableO2vRcR0), Alignment.INSTANCE.getCenter(), false, i8, null), RadioButtonPadding), RadioButtonTokens.INSTANCE.m3297getIconSizeD9Ej5fM());
                composerStartRestartGroup.startReplaceableGroup(735547384);
                zChanged = composerStartRestartGroup.changed(stateRadioColor$material3_release);
                zChanged2 = composerStartRestartGroup.changed(stateM449animateDpAsStateAjpBEmI);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged && !zChanged2) {
                    objRememberedValue2 = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.RadioButtonKt$RadioButton$2$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DrawScope drawScope) {
                            float f = drawScope.mo694toPx0680j_4(RadioButtonKt.RadioStrokeWidth);
                            float f2 = f / 2.0f;
                            DrawScope.m4779drawCircleVaOC9Bg$default(drawScope, stateRadioColor$material3_release.getValue().m4228unboximpl(), drawScope.mo694toPx0680j_4(Dp.m6935constructorimpl(RadioButtonTokens.INSTANCE.m3297getIconSizeD9Ej5fM() / 2.0f)) - f2, 0L, 0.0f, new Stroke(f, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                            if (Dp.m6934compareTo0680j_4(stateM449animateDpAsStateAjpBEmI.getValue().m6949unboximpl(), Dp.m6935constructorimpl(0.0f)) > 0) {
                                DrawScope.m4779drawCircleVaOC9Bg$default(drawScope, stateRadioColor$material3_release.getValue().m4228unboximpl(), drawScope.mo694toPx0680j_4(stateM449animateDpAsStateAjpBEmI.getValue().m6949unboximpl()) - f2, 0L, 0.0f, Fill.INSTANCE, null, 0, 108, null);
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.RadioButtonKt$RadioButton$2$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DrawScope drawScope) {
                            float f = drawScope.mo694toPx0680j_4(RadioButtonKt.RadioStrokeWidth);
                            float f2 = f / 2.0f;
                            DrawScope.m4779drawCircleVaOC9Bg$default(drawScope, stateRadioColor$material3_release.getValue().m4228unboximpl(), drawScope.mo694toPx0680j_4(Dp.m6935constructorimpl(RadioButtonTokens.INSTANCE.m3297getIconSizeD9Ej5fM() / 2.0f)) - f2, 0L, 0.0f, new Stroke(f, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                            if (Dp.m6934compareTo0680j_4(stateM449animateDpAsStateAjpBEmI.getValue().m6949unboximpl(), Dp.m6935constructorimpl(0.0f)) > 0) {
                                DrawScope.m4779drawCircleVaOC9Bg$default(drawScope, stateRadioColor$material3_release.getValue().m4228unboximpl(), drawScope.mo694toPx0680j_4(stateM449animateDpAsStateAjpBEmI.getValue().m6949unboximpl()) - f2, 0L, 0.0f, Fill.INSTANCE, null, 0, 108, null);
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(modifierM1039requiredSize3ABfNKs8, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
                radioButtonColors3 = radioButtonColors2;
                z6 = z5;
                mutableInteractionSource4 = mutableInteractionSource3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.RadioButtonKt.RadioButton.3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i11) {
                        RadioButtonKt.RadioButton(z, function0, modifier2, z6, radioButtonColors3, mutableInteractionSource4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 384;
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                z3 = z2;
                if (composerStartRestartGroup.changed(z3)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    radioButtonColorsColors = radioButtonColors;
                    if (composerStartRestartGroup.changed(radioButtonColorsColors)) {
                    }
                    i3 |= i10;
                } else {
                    radioButtonColorsColors = radioButtonColors;
                }
                i3 |= i10;
            } else {
                radioButtonColorsColors = radioButtonColors;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                if ((74899 & i3) == 74898) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            radioButtonColorsColors = RadioButtonDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(735546075);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            modifier3 = companion;
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            z4 = z3;
                            radioButtonColors2 = radioButtonColorsColors;
                        } else {
                            modifier3 = companion;
                            z4 = z3;
                            radioButtonColors2 = radioButtonColorsColors;
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                    } else {
                        if (i9 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            radioButtonColorsColors = RadioButtonDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(735546075);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            modifier3 = companion;
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            z4 = z3;
                            radioButtonColors2 = radioButtonColorsColors;
                        } else {
                            modifier3 = companion;
                            z4 = z3;
                            radioButtonColors2 = radioButtonColorsColors;
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(408580840, i3, -1, "androidx.compose.material3.RadioButton (RadioButton.kt:79)");
                    }
                    if (z) {
                        fM6935constructorimpl = Dp.m6935constructorimpl(RadioButtonDotSize / 2.0f);
                    } else {
                        fM6935constructorimpl = Dp.m6935constructorimpl(0.0f);
                    }
                    stateM449animateDpAsStateAjpBEmI = AnimateAsStateKt.m449animateDpAsStateAjpBEmI(fM6935constructorimpl, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composerStartRestartGroup, 48, 12);
                    stateRadioColor$material3_release = radioButtonColors2.radioColor$material3_release(z4, z, composerStartRestartGroup, ((i3 << 3) & 112) | ((i3 >> 9) & 14) | ((i3 >> 6) & 896));
                    composerStartRestartGroup.startReplaceableGroup(735546399);
                    if (function0 != null) {
                        z5 = z4;
                        i8 = 2;
                        companionM1253selectableO2vRcR0 = SelectableKt.m1253selectableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource3, RippleKt.m1744rememberRipple9IZ8Weo(false, Dp.m6935constructorimpl(RadioButtonTokens.INSTANCE.m3298getStateLayerSizeD9Ej5fM() / 2.0f), 0L, composerStartRestartGroup, 54, 4), z5, Role.m6137boximpl(Role.INSTANCE.m6149getRadioButtono7Vup1c()), function0);
                    } else {
                        z5 = z4;
                        i8 = 2;
                        companionM1253selectableO2vRcR0 = Modifier.INSTANCE;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (function0 != null) {
                        companionMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                    } else {
                        companionMinimumInteractiveComponentSize = Modifier.INSTANCE;
                    }
                    Modifier modifierM1039requiredSize3ABfNKs9 = SizeKt.m1039requiredSize3ABfNKs(PaddingKt.m1002padding3ABfNKs(SizeKt.wrapContentSize$default(modifier3.then(companionMinimumInteractiveComponentSize).then(companionM1253selectableO2vRcR0), Alignment.INSTANCE.getCenter(), false, i8, null), RadioButtonPadding), RadioButtonTokens.INSTANCE.m3297getIconSizeD9Ej5fM());
                    composerStartRestartGroup.startReplaceableGroup(735547384);
                    zChanged = composerStartRestartGroup.changed(stateRadioColor$material3_release);
                    zChanged2 = composerStartRestartGroup.changed(stateM449animateDpAsStateAjpBEmI);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged && !zChanged2) {
                        objRememberedValue2 = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.RadioButtonKt$RadioButton$2$1
                            @Override // kotlin.jvm.functions.Function1
                            public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                invoke2(drawScope);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(DrawScope drawScope) {
                                float f = drawScope.mo694toPx0680j_4(RadioButtonKt.RadioStrokeWidth);
                                float f2 = f / 2.0f;
                                DrawScope.m4779drawCircleVaOC9Bg$default(drawScope, stateRadioColor$material3_release.getValue().m4228unboximpl(), drawScope.mo694toPx0680j_4(Dp.m6935constructorimpl(RadioButtonTokens.INSTANCE.m3297getIconSizeD9Ej5fM() / 2.0f)) - f2, 0L, 0.0f, new Stroke(f, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                                if (Dp.m6934compareTo0680j_4(stateM449animateDpAsStateAjpBEmI.getValue().m6949unboximpl(), Dp.m6935constructorimpl(0.0f)) > 0) {
                                    DrawScope.m4779drawCircleVaOC9Bg$default(drawScope, stateRadioColor$material3_release.getValue().m4228unboximpl(), drawScope.mo694toPx0680j_4(stateM449animateDpAsStateAjpBEmI.getValue().m6949unboximpl()) - f2, 0L, 0.0f, Fill.INSTANCE, null, 0, 108, null);
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.RadioButtonKt$RadioButton$2$1
                            @Override // kotlin.jvm.functions.Function1
                            public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                invoke2(drawScope);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(DrawScope drawScope) {
                                float f = drawScope.mo694toPx0680j_4(RadioButtonKt.RadioStrokeWidth);
                                float f2 = f / 2.0f;
                                DrawScope.m4779drawCircleVaOC9Bg$default(drawScope, stateRadioColor$material3_release.getValue().m4228unboximpl(), drawScope.mo694toPx0680j_4(Dp.m6935constructorimpl(RadioButtonTokens.INSTANCE.m3297getIconSizeD9Ej5fM() / 2.0f)) - f2, 0L, 0.0f, new Stroke(f, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                                if (Dp.m6934compareTo0680j_4(stateM449animateDpAsStateAjpBEmI.getValue().m6949unboximpl(), Dp.m6935constructorimpl(0.0f)) > 0) {
                                    DrawScope.m4779drawCircleVaOC9Bg$default(drawScope, stateRadioColor$material3_release.getValue().m4228unboximpl(), drawScope.mo694toPx0680j_4(stateM449animateDpAsStateAjpBEmI.getValue().m6949unboximpl()) - f2, 0L, 0.0f, Fill.INSTANCE, null, 0, 108, null);
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CanvasKt.Canvas(modifierM1039requiredSize3ABfNKs9, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier3;
                    radioButtonColors3 = radioButtonColors2;
                    z6 = z5;
                    mutableInteractionSource4 = mutableInteractionSource3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            radioButtonColorsColors = RadioButtonDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(735546075);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            modifier3 = companion;
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            z4 = z3;
                            radioButtonColors2 = radioButtonColorsColors;
                        } else {
                            modifier3 = companion;
                            z4 = z3;
                            radioButtonColors2 = radioButtonColorsColors;
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                    } else {
                        if (i9 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            radioButtonColorsColors = RadioButtonDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(735546075);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            modifier3 = companion;
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            z4 = z3;
                            radioButtonColors2 = radioButtonColorsColors;
                        } else {
                            modifier3 = companion;
                            z4 = z3;
                            radioButtonColors2 = radioButtonColorsColors;
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(408580840, i3, -1, "androidx.compose.material3.RadioButton (RadioButton.kt:79)");
                    }
                    if (z) {
                        fM6935constructorimpl = Dp.m6935constructorimpl(RadioButtonDotSize / 2.0f);
                    } else {
                        fM6935constructorimpl = Dp.m6935constructorimpl(0.0f);
                    }
                    stateM449animateDpAsStateAjpBEmI = AnimateAsStateKt.m449animateDpAsStateAjpBEmI(fM6935constructorimpl, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composerStartRestartGroup, 48, 12);
                    stateRadioColor$material3_release = radioButtonColors2.radioColor$material3_release(z4, z, composerStartRestartGroup, ((i3 << 3) & 112) | ((i3 >> 9) & 14) | ((i3 >> 6) & 896));
                    composerStartRestartGroup.startReplaceableGroup(735546399);
                    if (function0 != null) {
                        z5 = z4;
                        i8 = 2;
                        companionM1253selectableO2vRcR0 = SelectableKt.m1253selectableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource3, RippleKt.m1744rememberRipple9IZ8Weo(false, Dp.m6935constructorimpl(RadioButtonTokens.INSTANCE.m3298getStateLayerSizeD9Ej5fM() / 2.0f), 0L, composerStartRestartGroup, 54, 4), z5, Role.m6137boximpl(Role.INSTANCE.m6149getRadioButtono7Vup1c()), function0);
                    } else {
                        z5 = z4;
                        i8 = 2;
                        companionM1253selectableO2vRcR0 = Modifier.INSTANCE;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (function0 != null) {
                        companionMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                    } else {
                        companionMinimumInteractiveComponentSize = Modifier.INSTANCE;
                    }
                    Modifier modifierM1039requiredSize3ABfNKs10 = SizeKt.m1039requiredSize3ABfNKs(PaddingKt.m1002padding3ABfNKs(SizeKt.wrapContentSize$default(modifier3.then(companionMinimumInteractiveComponentSize).then(companionM1253selectableO2vRcR0), Alignment.INSTANCE.getCenter(), false, i8, null), RadioButtonPadding), RadioButtonTokens.INSTANCE.m3297getIconSizeD9Ej5fM());
                    composerStartRestartGroup.startReplaceableGroup(735547384);
                    zChanged = composerStartRestartGroup.changed(stateRadioColor$material3_release);
                    zChanged2 = composerStartRestartGroup.changed(stateM449animateDpAsStateAjpBEmI);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged && !zChanged2) {
                        objRememberedValue2 = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.RadioButtonKt$RadioButton$2$1
                            @Override // kotlin.jvm.functions.Function1
                            public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                invoke2(drawScope);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(DrawScope drawScope) {
                                float f = drawScope.mo694toPx0680j_4(RadioButtonKt.RadioStrokeWidth);
                                float f2 = f / 2.0f;
                                DrawScope.m4779drawCircleVaOC9Bg$default(drawScope, stateRadioColor$material3_release.getValue().m4228unboximpl(), drawScope.mo694toPx0680j_4(Dp.m6935constructorimpl(RadioButtonTokens.INSTANCE.m3297getIconSizeD9Ej5fM() / 2.0f)) - f2, 0L, 0.0f, new Stroke(f, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                                if (Dp.m6934compareTo0680j_4(stateM449animateDpAsStateAjpBEmI.getValue().m6949unboximpl(), Dp.m6935constructorimpl(0.0f)) > 0) {
                                    DrawScope.m4779drawCircleVaOC9Bg$default(drawScope, stateRadioColor$material3_release.getValue().m4228unboximpl(), drawScope.mo694toPx0680j_4(stateM449animateDpAsStateAjpBEmI.getValue().m6949unboximpl()) - f2, 0L, 0.0f, Fill.INSTANCE, null, 0, 108, null);
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.RadioButtonKt$RadioButton$2$1
                            @Override // kotlin.jvm.functions.Function1
                            public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                invoke2(drawScope);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(DrawScope drawScope) {
                                float f = drawScope.mo694toPx0680j_4(RadioButtonKt.RadioStrokeWidth);
                                float f2 = f / 2.0f;
                                DrawScope.m4779drawCircleVaOC9Bg$default(drawScope, stateRadioColor$material3_release.getValue().m4228unboximpl(), drawScope.mo694toPx0680j_4(Dp.m6935constructorimpl(RadioButtonTokens.INSTANCE.m3297getIconSizeD9Ej5fM() / 2.0f)) - f2, 0L, 0.0f, new Stroke(f, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                                if (Dp.m6934compareTo0680j_4(stateM449animateDpAsStateAjpBEmI.getValue().m6949unboximpl(), Dp.m6935constructorimpl(0.0f)) > 0) {
                                    DrawScope.m4779drawCircleVaOC9Bg$default(drawScope, stateRadioColor$material3_release.getValue().m4228unboximpl(), drawScope.mo694toPx0680j_4(stateM449animateDpAsStateAjpBEmI.getValue().m6949unboximpl()) - f2, 0L, 0.0f, Fill.INSTANCE, null, 0, 108, null);
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CanvasKt.Canvas(modifierM1039requiredSize3ABfNKs10, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier3;
                    radioButtonColors3 = radioButtonColors2;
                    z6 = z5;
                    mutableInteractionSource4 = mutableInteractionSource3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.RadioButtonKt.RadioButton.3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i11) {
                            RadioButtonKt.RadioButton(z, function0, modifier2, z6, radioButtonColors3, mutableInteractionSource4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            mutableInteractionSource2 = mutableInteractionSource;
            if ((74899 & i3) == 74898) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        radioButtonColorsColors = RadioButtonDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(735546075);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        modifier3 = companion;
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        z4 = z3;
                        radioButtonColors2 = radioButtonColorsColors;
                    } else {
                        modifier3 = companion;
                        z4 = z3;
                        radioButtonColors2 = radioButtonColorsColors;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                } else {
                    if (i9 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        radioButtonColorsColors = RadioButtonDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(735546075);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        modifier3 = companion;
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        z4 = z3;
                        radioButtonColors2 = radioButtonColorsColors;
                    } else {
                        modifier3 = companion;
                        z4 = z3;
                        radioButtonColors2 = radioButtonColorsColors;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(408580840, i3, -1, "androidx.compose.material3.RadioButton (RadioButton.kt:79)");
                }
                if (z) {
                    fM6935constructorimpl = Dp.m6935constructorimpl(RadioButtonDotSize / 2.0f);
                } else {
                    fM6935constructorimpl = Dp.m6935constructorimpl(0.0f);
                }
                stateM449animateDpAsStateAjpBEmI = AnimateAsStateKt.m449animateDpAsStateAjpBEmI(fM6935constructorimpl, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composerStartRestartGroup, 48, 12);
                stateRadioColor$material3_release = radioButtonColors2.radioColor$material3_release(z4, z, composerStartRestartGroup, ((i3 << 3) & 112) | ((i3 >> 9) & 14) | ((i3 >> 6) & 896));
                composerStartRestartGroup.startReplaceableGroup(735546399);
                if (function0 != null) {
                    z5 = z4;
                    i8 = 2;
                    companionM1253selectableO2vRcR0 = SelectableKt.m1253selectableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource3, RippleKt.m1744rememberRipple9IZ8Weo(false, Dp.m6935constructorimpl(RadioButtonTokens.INSTANCE.m3298getStateLayerSizeD9Ej5fM() / 2.0f), 0L, composerStartRestartGroup, 54, 4), z5, Role.m6137boximpl(Role.INSTANCE.m6149getRadioButtono7Vup1c()), function0);
                } else {
                    z5 = z4;
                    i8 = 2;
                    companionM1253selectableO2vRcR0 = Modifier.INSTANCE;
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (function0 != null) {
                    companionMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                } else {
                    companionMinimumInteractiveComponentSize = Modifier.INSTANCE;
                }
                Modifier modifierM1039requiredSize3ABfNKs11 = SizeKt.m1039requiredSize3ABfNKs(PaddingKt.m1002padding3ABfNKs(SizeKt.wrapContentSize$default(modifier3.then(companionMinimumInteractiveComponentSize).then(companionM1253selectableO2vRcR0), Alignment.INSTANCE.getCenter(), false, i8, null), RadioButtonPadding), RadioButtonTokens.INSTANCE.m3297getIconSizeD9Ej5fM());
                composerStartRestartGroup.startReplaceableGroup(735547384);
                zChanged = composerStartRestartGroup.changed(stateRadioColor$material3_release);
                zChanged2 = composerStartRestartGroup.changed(stateM449animateDpAsStateAjpBEmI);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged && !zChanged2) {
                    objRememberedValue2 = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.RadioButtonKt$RadioButton$2$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DrawScope drawScope) {
                            float f = drawScope.mo694toPx0680j_4(RadioButtonKt.RadioStrokeWidth);
                            float f2 = f / 2.0f;
                            DrawScope.m4779drawCircleVaOC9Bg$default(drawScope, stateRadioColor$material3_release.getValue().m4228unboximpl(), drawScope.mo694toPx0680j_4(Dp.m6935constructorimpl(RadioButtonTokens.INSTANCE.m3297getIconSizeD9Ej5fM() / 2.0f)) - f2, 0L, 0.0f, new Stroke(f, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                            if (Dp.m6934compareTo0680j_4(stateM449animateDpAsStateAjpBEmI.getValue().m6949unboximpl(), Dp.m6935constructorimpl(0.0f)) > 0) {
                                DrawScope.m4779drawCircleVaOC9Bg$default(drawScope, stateRadioColor$material3_release.getValue().m4228unboximpl(), drawScope.mo694toPx0680j_4(stateM449animateDpAsStateAjpBEmI.getValue().m6949unboximpl()) - f2, 0L, 0.0f, Fill.INSTANCE, null, 0, 108, null);
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.RadioButtonKt$RadioButton$2$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DrawScope drawScope) {
                            float f = drawScope.mo694toPx0680j_4(RadioButtonKt.RadioStrokeWidth);
                            float f2 = f / 2.0f;
                            DrawScope.m4779drawCircleVaOC9Bg$default(drawScope, stateRadioColor$material3_release.getValue().m4228unboximpl(), drawScope.mo694toPx0680j_4(Dp.m6935constructorimpl(RadioButtonTokens.INSTANCE.m3297getIconSizeD9Ej5fM() / 2.0f)) - f2, 0L, 0.0f, new Stroke(f, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                            if (Dp.m6934compareTo0680j_4(stateM449animateDpAsStateAjpBEmI.getValue().m6949unboximpl(), Dp.m6935constructorimpl(0.0f)) > 0) {
                                DrawScope.m4779drawCircleVaOC9Bg$default(drawScope, stateRadioColor$material3_release.getValue().m4228unboximpl(), drawScope.mo694toPx0680j_4(stateM449animateDpAsStateAjpBEmI.getValue().m6949unboximpl()) - f2, 0L, 0.0f, Fill.INSTANCE, null, 0, 108, null);
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(modifierM1039requiredSize3ABfNKs11, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
                radioButtonColors3 = radioButtonColors2;
                z6 = z5;
                mutableInteractionSource4 = mutableInteractionSource3;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        radioButtonColorsColors = RadioButtonDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(735546075);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        modifier3 = companion;
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        z4 = z3;
                        radioButtonColors2 = radioButtonColorsColors;
                    } else {
                        modifier3 = companion;
                        z4 = z3;
                        radioButtonColors2 = radioButtonColorsColors;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                } else {
                    if (i9 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        radioButtonColorsColors = RadioButtonDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(735546075);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        modifier3 = companion;
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        z4 = z3;
                        radioButtonColors2 = radioButtonColorsColors;
                    } else {
                        modifier3 = companion;
                        z4 = z3;
                        radioButtonColors2 = radioButtonColorsColors;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(408580840, i3, -1, "androidx.compose.material3.RadioButton (RadioButton.kt:79)");
                }
                if (z) {
                    fM6935constructorimpl = Dp.m6935constructorimpl(RadioButtonDotSize / 2.0f);
                } else {
                    fM6935constructorimpl = Dp.m6935constructorimpl(0.0f);
                }
                stateM449animateDpAsStateAjpBEmI = AnimateAsStateKt.m449animateDpAsStateAjpBEmI(fM6935constructorimpl, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composerStartRestartGroup, 48, 12);
                stateRadioColor$material3_release = radioButtonColors2.radioColor$material3_release(z4, z, composerStartRestartGroup, ((i3 << 3) & 112) | ((i3 >> 9) & 14) | ((i3 >> 6) & 896));
                composerStartRestartGroup.startReplaceableGroup(735546399);
                if (function0 != null) {
                    z5 = z4;
                    i8 = 2;
                    companionM1253selectableO2vRcR0 = SelectableKt.m1253selectableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource3, RippleKt.m1744rememberRipple9IZ8Weo(false, Dp.m6935constructorimpl(RadioButtonTokens.INSTANCE.m3298getStateLayerSizeD9Ej5fM() / 2.0f), 0L, composerStartRestartGroup, 54, 4), z5, Role.m6137boximpl(Role.INSTANCE.m6149getRadioButtono7Vup1c()), function0);
                } else {
                    z5 = z4;
                    i8 = 2;
                    companionM1253selectableO2vRcR0 = Modifier.INSTANCE;
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (function0 != null) {
                    companionMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                } else {
                    companionMinimumInteractiveComponentSize = Modifier.INSTANCE;
                }
                Modifier modifierM1039requiredSize3ABfNKs12 = SizeKt.m1039requiredSize3ABfNKs(PaddingKt.m1002padding3ABfNKs(SizeKt.wrapContentSize$default(modifier3.then(companionMinimumInteractiveComponentSize).then(companionM1253selectableO2vRcR0), Alignment.INSTANCE.getCenter(), false, i8, null), RadioButtonPadding), RadioButtonTokens.INSTANCE.m3297getIconSizeD9Ej5fM());
                composerStartRestartGroup.startReplaceableGroup(735547384);
                zChanged = composerStartRestartGroup.changed(stateRadioColor$material3_release);
                zChanged2 = composerStartRestartGroup.changed(stateM449animateDpAsStateAjpBEmI);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged && !zChanged2) {
                    objRememberedValue2 = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.RadioButtonKt$RadioButton$2$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DrawScope drawScope) {
                            float f = drawScope.mo694toPx0680j_4(RadioButtonKt.RadioStrokeWidth);
                            float f2 = f / 2.0f;
                            DrawScope.m4779drawCircleVaOC9Bg$default(drawScope, stateRadioColor$material3_release.getValue().m4228unboximpl(), drawScope.mo694toPx0680j_4(Dp.m6935constructorimpl(RadioButtonTokens.INSTANCE.m3297getIconSizeD9Ej5fM() / 2.0f)) - f2, 0L, 0.0f, new Stroke(f, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                            if (Dp.m6934compareTo0680j_4(stateM449animateDpAsStateAjpBEmI.getValue().m6949unboximpl(), Dp.m6935constructorimpl(0.0f)) > 0) {
                                DrawScope.m4779drawCircleVaOC9Bg$default(drawScope, stateRadioColor$material3_release.getValue().m4228unboximpl(), drawScope.mo694toPx0680j_4(stateM449animateDpAsStateAjpBEmI.getValue().m6949unboximpl()) - f2, 0L, 0.0f, Fill.INSTANCE, null, 0, 108, null);
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.RadioButtonKt$RadioButton$2$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DrawScope drawScope) {
                            float f = drawScope.mo694toPx0680j_4(RadioButtonKt.RadioStrokeWidth);
                            float f2 = f / 2.0f;
                            DrawScope.m4779drawCircleVaOC9Bg$default(drawScope, stateRadioColor$material3_release.getValue().m4228unboximpl(), drawScope.mo694toPx0680j_4(Dp.m6935constructorimpl(RadioButtonTokens.INSTANCE.m3297getIconSizeD9Ej5fM() / 2.0f)) - f2, 0L, 0.0f, new Stroke(f, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                            if (Dp.m6934compareTo0680j_4(stateM449animateDpAsStateAjpBEmI.getValue().m6949unboximpl(), Dp.m6935constructorimpl(0.0f)) > 0) {
                                DrawScope.m4779drawCircleVaOC9Bg$default(drawScope, stateRadioColor$material3_release.getValue().m4228unboximpl(), drawScope.mo694toPx0680j_4(stateM449animateDpAsStateAjpBEmI.getValue().m6949unboximpl()) - f2, 0L, 0.0f, Fill.INSTANCE, null, 0, 108, null);
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(modifierM1039requiredSize3ABfNKs12, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
                radioButtonColors3 = radioButtonColors2;
                z6 = z5;
                mutableInteractionSource4 = mutableInteractionSource3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.RadioButtonKt.RadioButton.3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i11) {
                        RadioButtonKt.RadioButton(z, function0, modifier2, z6, radioButtonColors3, mutableInteractionSource4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 3072;
        z3 = z2;
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                radioButtonColorsColors = radioButtonColors;
                if (composerStartRestartGroup.changed(radioButtonColorsColors)) {
                }
                i3 |= i10;
            } else {
                radioButtonColorsColors = radioButtonColors;
            }
            i3 |= i10;
        } else {
            radioButtonColorsColors = radioButtonColors;
        }
        i6 = i2 & 32;
        if (i6 != 0) {
            if ((196608 & i) == 0) {
                mutableInteractionSource2 = mutableInteractionSource;
                if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i3 |= i7;
            }
            if ((74899 & i3) == 74898) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        radioButtonColorsColors = RadioButtonDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(735546075);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        modifier3 = companion;
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        z4 = z3;
                        radioButtonColors2 = radioButtonColorsColors;
                    } else {
                        modifier3 = companion;
                        z4 = z3;
                        radioButtonColors2 = radioButtonColorsColors;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                } else {
                    if (i9 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        radioButtonColorsColors = RadioButtonDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(735546075);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        modifier3 = companion;
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        z4 = z3;
                        radioButtonColors2 = radioButtonColorsColors;
                    } else {
                        modifier3 = companion;
                        z4 = z3;
                        radioButtonColors2 = radioButtonColorsColors;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(408580840, i3, -1, "androidx.compose.material3.RadioButton (RadioButton.kt:79)");
                }
                if (z) {
                    fM6935constructorimpl = Dp.m6935constructorimpl(RadioButtonDotSize / 2.0f);
                } else {
                    fM6935constructorimpl = Dp.m6935constructorimpl(0.0f);
                }
                stateM449animateDpAsStateAjpBEmI = AnimateAsStateKt.m449animateDpAsStateAjpBEmI(fM6935constructorimpl, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composerStartRestartGroup, 48, 12);
                stateRadioColor$material3_release = radioButtonColors2.radioColor$material3_release(z4, z, composerStartRestartGroup, ((i3 << 3) & 112) | ((i3 >> 9) & 14) | ((i3 >> 6) & 896));
                composerStartRestartGroup.startReplaceableGroup(735546399);
                if (function0 != null) {
                    z5 = z4;
                    i8 = 2;
                    companionM1253selectableO2vRcR0 = SelectableKt.m1253selectableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource3, RippleKt.m1744rememberRipple9IZ8Weo(false, Dp.m6935constructorimpl(RadioButtonTokens.INSTANCE.m3298getStateLayerSizeD9Ej5fM() / 2.0f), 0L, composerStartRestartGroup, 54, 4), z5, Role.m6137boximpl(Role.INSTANCE.m6149getRadioButtono7Vup1c()), function0);
                } else {
                    z5 = z4;
                    i8 = 2;
                    companionM1253selectableO2vRcR0 = Modifier.INSTANCE;
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (function0 != null) {
                    companionMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                } else {
                    companionMinimumInteractiveComponentSize = Modifier.INSTANCE;
                }
                Modifier modifierM1039requiredSize3ABfNKs13 = SizeKt.m1039requiredSize3ABfNKs(PaddingKt.m1002padding3ABfNKs(SizeKt.wrapContentSize$default(modifier3.then(companionMinimumInteractiveComponentSize).then(companionM1253selectableO2vRcR0), Alignment.INSTANCE.getCenter(), false, i8, null), RadioButtonPadding), RadioButtonTokens.INSTANCE.m3297getIconSizeD9Ej5fM());
                composerStartRestartGroup.startReplaceableGroup(735547384);
                zChanged = composerStartRestartGroup.changed(stateRadioColor$material3_release);
                zChanged2 = composerStartRestartGroup.changed(stateM449animateDpAsStateAjpBEmI);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged && !zChanged2) {
                    objRememberedValue2 = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.RadioButtonKt$RadioButton$2$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DrawScope drawScope) {
                            float f = drawScope.mo694toPx0680j_4(RadioButtonKt.RadioStrokeWidth);
                            float f2 = f / 2.0f;
                            DrawScope.m4779drawCircleVaOC9Bg$default(drawScope, stateRadioColor$material3_release.getValue().m4228unboximpl(), drawScope.mo694toPx0680j_4(Dp.m6935constructorimpl(RadioButtonTokens.INSTANCE.m3297getIconSizeD9Ej5fM() / 2.0f)) - f2, 0L, 0.0f, new Stroke(f, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                            if (Dp.m6934compareTo0680j_4(stateM449animateDpAsStateAjpBEmI.getValue().m6949unboximpl(), Dp.m6935constructorimpl(0.0f)) > 0) {
                                DrawScope.m4779drawCircleVaOC9Bg$default(drawScope, stateRadioColor$material3_release.getValue().m4228unboximpl(), drawScope.mo694toPx0680j_4(stateM449animateDpAsStateAjpBEmI.getValue().m6949unboximpl()) - f2, 0L, 0.0f, Fill.INSTANCE, null, 0, 108, null);
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.RadioButtonKt$RadioButton$2$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DrawScope drawScope) {
                            float f = drawScope.mo694toPx0680j_4(RadioButtonKt.RadioStrokeWidth);
                            float f2 = f / 2.0f;
                            DrawScope.m4779drawCircleVaOC9Bg$default(drawScope, stateRadioColor$material3_release.getValue().m4228unboximpl(), drawScope.mo694toPx0680j_4(Dp.m6935constructorimpl(RadioButtonTokens.INSTANCE.m3297getIconSizeD9Ej5fM() / 2.0f)) - f2, 0L, 0.0f, new Stroke(f, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                            if (Dp.m6934compareTo0680j_4(stateM449animateDpAsStateAjpBEmI.getValue().m6949unboximpl(), Dp.m6935constructorimpl(0.0f)) > 0) {
                                DrawScope.m4779drawCircleVaOC9Bg$default(drawScope, stateRadioColor$material3_release.getValue().m4228unboximpl(), drawScope.mo694toPx0680j_4(stateM449animateDpAsStateAjpBEmI.getValue().m6949unboximpl()) - f2, 0L, 0.0f, Fill.INSTANCE, null, 0, 108, null);
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(modifierM1039requiredSize3ABfNKs13, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
                radioButtonColors3 = radioButtonColors2;
                z6 = z5;
                mutableInteractionSource4 = mutableInteractionSource3;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        radioButtonColorsColors = RadioButtonDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(735546075);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        modifier3 = companion;
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        z4 = z3;
                        radioButtonColors2 = radioButtonColorsColors;
                    } else {
                        modifier3 = companion;
                        z4 = z3;
                        radioButtonColors2 = radioButtonColorsColors;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                } else {
                    if (i9 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        radioButtonColorsColors = RadioButtonDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(735546075);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        modifier3 = companion;
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        z4 = z3;
                        radioButtonColors2 = radioButtonColorsColors;
                    } else {
                        modifier3 = companion;
                        z4 = z3;
                        radioButtonColors2 = radioButtonColorsColors;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(408580840, i3, -1, "androidx.compose.material3.RadioButton (RadioButton.kt:79)");
                }
                if (z) {
                    fM6935constructorimpl = Dp.m6935constructorimpl(RadioButtonDotSize / 2.0f);
                } else {
                    fM6935constructorimpl = Dp.m6935constructorimpl(0.0f);
                }
                stateM449animateDpAsStateAjpBEmI = AnimateAsStateKt.m449animateDpAsStateAjpBEmI(fM6935constructorimpl, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composerStartRestartGroup, 48, 12);
                stateRadioColor$material3_release = radioButtonColors2.radioColor$material3_release(z4, z, composerStartRestartGroup, ((i3 << 3) & 112) | ((i3 >> 9) & 14) | ((i3 >> 6) & 896));
                composerStartRestartGroup.startReplaceableGroup(735546399);
                if (function0 != null) {
                    z5 = z4;
                    i8 = 2;
                    companionM1253selectableO2vRcR0 = SelectableKt.m1253selectableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource3, RippleKt.m1744rememberRipple9IZ8Weo(false, Dp.m6935constructorimpl(RadioButtonTokens.INSTANCE.m3298getStateLayerSizeD9Ej5fM() / 2.0f), 0L, composerStartRestartGroup, 54, 4), z5, Role.m6137boximpl(Role.INSTANCE.m6149getRadioButtono7Vup1c()), function0);
                } else {
                    z5 = z4;
                    i8 = 2;
                    companionM1253selectableO2vRcR0 = Modifier.INSTANCE;
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (function0 != null) {
                    companionMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                } else {
                    companionMinimumInteractiveComponentSize = Modifier.INSTANCE;
                }
                Modifier modifierM1039requiredSize3ABfNKs14 = SizeKt.m1039requiredSize3ABfNKs(PaddingKt.m1002padding3ABfNKs(SizeKt.wrapContentSize$default(modifier3.then(companionMinimumInteractiveComponentSize).then(companionM1253selectableO2vRcR0), Alignment.INSTANCE.getCenter(), false, i8, null), RadioButtonPadding), RadioButtonTokens.INSTANCE.m3297getIconSizeD9Ej5fM());
                composerStartRestartGroup.startReplaceableGroup(735547384);
                zChanged = composerStartRestartGroup.changed(stateRadioColor$material3_release);
                zChanged2 = composerStartRestartGroup.changed(stateM449animateDpAsStateAjpBEmI);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged && !zChanged2) {
                    objRememberedValue2 = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.RadioButtonKt$RadioButton$2$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DrawScope drawScope) {
                            float f = drawScope.mo694toPx0680j_4(RadioButtonKt.RadioStrokeWidth);
                            float f2 = f / 2.0f;
                            DrawScope.m4779drawCircleVaOC9Bg$default(drawScope, stateRadioColor$material3_release.getValue().m4228unboximpl(), drawScope.mo694toPx0680j_4(Dp.m6935constructorimpl(RadioButtonTokens.INSTANCE.m3297getIconSizeD9Ej5fM() / 2.0f)) - f2, 0L, 0.0f, new Stroke(f, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                            if (Dp.m6934compareTo0680j_4(stateM449animateDpAsStateAjpBEmI.getValue().m6949unboximpl(), Dp.m6935constructorimpl(0.0f)) > 0) {
                                DrawScope.m4779drawCircleVaOC9Bg$default(drawScope, stateRadioColor$material3_release.getValue().m4228unboximpl(), drawScope.mo694toPx0680j_4(stateM449animateDpAsStateAjpBEmI.getValue().m6949unboximpl()) - f2, 0L, 0.0f, Fill.INSTANCE, null, 0, 108, null);
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.RadioButtonKt$RadioButton$2$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DrawScope drawScope) {
                            float f = drawScope.mo694toPx0680j_4(RadioButtonKt.RadioStrokeWidth);
                            float f2 = f / 2.0f;
                            DrawScope.m4779drawCircleVaOC9Bg$default(drawScope, stateRadioColor$material3_release.getValue().m4228unboximpl(), drawScope.mo694toPx0680j_4(Dp.m6935constructorimpl(RadioButtonTokens.INSTANCE.m3297getIconSizeD9Ej5fM() / 2.0f)) - f2, 0L, 0.0f, new Stroke(f, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                            if (Dp.m6934compareTo0680j_4(stateM449animateDpAsStateAjpBEmI.getValue().m6949unboximpl(), Dp.m6935constructorimpl(0.0f)) > 0) {
                                DrawScope.m4779drawCircleVaOC9Bg$default(drawScope, stateRadioColor$material3_release.getValue().m4228unboximpl(), drawScope.mo694toPx0680j_4(stateM449animateDpAsStateAjpBEmI.getValue().m6949unboximpl()) - f2, 0L, 0.0f, Fill.INSTANCE, null, 0, 108, null);
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(modifierM1039requiredSize3ABfNKs14, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
                radioButtonColors3 = radioButtonColors2;
                z6 = z5;
                mutableInteractionSource4 = mutableInteractionSource3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.RadioButtonKt.RadioButton.3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i11) {
                        RadioButtonKt.RadioButton(z, function0, modifier2, z6, radioButtonColors3, mutableInteractionSource4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
        }
        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        mutableInteractionSource2 = mutableInteractionSource;
        if ((74899 & i3) == 74898) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i9 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier2;
                }
                if (i4 != 0) {
                    z3 = true;
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    radioButtonColorsColors = RadioButtonDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                }
                if (i6 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(735546075);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    modifier3 = companion;
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    z4 = z3;
                    radioButtonColors2 = radioButtonColorsColors;
                } else {
                    modifier3 = companion;
                    z4 = z3;
                    radioButtonColors2 = radioButtonColorsColors;
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
            } else {
                if (i9 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier2;
                }
                if (i4 != 0) {
                    z3 = true;
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    radioButtonColorsColors = RadioButtonDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                }
                if (i6 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(735546075);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    modifier3 = companion;
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    z4 = z3;
                    radioButtonColors2 = radioButtonColorsColors;
                } else {
                    modifier3 = companion;
                    z4 = z3;
                    radioButtonColors2 = radioButtonColorsColors;
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(408580840, i3, -1, "androidx.compose.material3.RadioButton (RadioButton.kt:79)");
            }
            if (z) {
                fM6935constructorimpl = Dp.m6935constructorimpl(RadioButtonDotSize / 2.0f);
            } else {
                fM6935constructorimpl = Dp.m6935constructorimpl(0.0f);
            }
            stateM449animateDpAsStateAjpBEmI = AnimateAsStateKt.m449animateDpAsStateAjpBEmI(fM6935constructorimpl, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composerStartRestartGroup, 48, 12);
            stateRadioColor$material3_release = radioButtonColors2.radioColor$material3_release(z4, z, composerStartRestartGroup, ((i3 << 3) & 112) | ((i3 >> 9) & 14) | ((i3 >> 6) & 896));
            composerStartRestartGroup.startReplaceableGroup(735546399);
            if (function0 != null) {
                z5 = z4;
                i8 = 2;
                companionM1253selectableO2vRcR0 = SelectableKt.m1253selectableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource3, RippleKt.m1744rememberRipple9IZ8Weo(false, Dp.m6935constructorimpl(RadioButtonTokens.INSTANCE.m3298getStateLayerSizeD9Ej5fM() / 2.0f), 0L, composerStartRestartGroup, 54, 4), z5, Role.m6137boximpl(Role.INSTANCE.m6149getRadioButtono7Vup1c()), function0);
            } else {
                z5 = z4;
                i8 = 2;
                companionM1253selectableO2vRcR0 = Modifier.INSTANCE;
            }
            composerStartRestartGroup.endReplaceableGroup();
            if (function0 != null) {
                companionMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
            } else {
                companionMinimumInteractiveComponentSize = Modifier.INSTANCE;
            }
            Modifier modifierM1039requiredSize3ABfNKs15 = SizeKt.m1039requiredSize3ABfNKs(PaddingKt.m1002padding3ABfNKs(SizeKt.wrapContentSize$default(modifier3.then(companionMinimumInteractiveComponentSize).then(companionM1253selectableO2vRcR0), Alignment.INSTANCE.getCenter(), false, i8, null), RadioButtonPadding), RadioButtonTokens.INSTANCE.m3297getIconSizeD9Ej5fM());
            composerStartRestartGroup.startReplaceableGroup(735547384);
            zChanged = composerStartRestartGroup.changed(stateRadioColor$material3_release);
            zChanged2 = composerStartRestartGroup.changed(stateM449animateDpAsStateAjpBEmI);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (!zChanged && !zChanged2) {
                objRememberedValue2 = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.RadioButtonKt$RadioButton$2$1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                        invoke2(drawScope);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(DrawScope drawScope) {
                        float f = drawScope.mo694toPx0680j_4(RadioButtonKt.RadioStrokeWidth);
                        float f2 = f / 2.0f;
                        DrawScope.m4779drawCircleVaOC9Bg$default(drawScope, stateRadioColor$material3_release.getValue().m4228unboximpl(), drawScope.mo694toPx0680j_4(Dp.m6935constructorimpl(RadioButtonTokens.INSTANCE.m3297getIconSizeD9Ej5fM() / 2.0f)) - f2, 0L, 0.0f, new Stroke(f, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                        if (Dp.m6934compareTo0680j_4(stateM449animateDpAsStateAjpBEmI.getValue().m6949unboximpl(), Dp.m6935constructorimpl(0.0f)) > 0) {
                            DrawScope.m4779drawCircleVaOC9Bg$default(drawScope, stateRadioColor$material3_release.getValue().m4228unboximpl(), drawScope.mo694toPx0680j_4(stateM449animateDpAsStateAjpBEmI.getValue().m6949unboximpl()) - f2, 0L, 0.0f, Fill.INSTANCE, null, 0, 108, null);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.RadioButtonKt$RadioButton$2$1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                        invoke2(drawScope);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(DrawScope drawScope) {
                        float f = drawScope.mo694toPx0680j_4(RadioButtonKt.RadioStrokeWidth);
                        float f2 = f / 2.0f;
                        DrawScope.m4779drawCircleVaOC9Bg$default(drawScope, stateRadioColor$material3_release.getValue().m4228unboximpl(), drawScope.mo694toPx0680j_4(Dp.m6935constructorimpl(RadioButtonTokens.INSTANCE.m3297getIconSizeD9Ej5fM() / 2.0f)) - f2, 0L, 0.0f, new Stroke(f, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                        if (Dp.m6934compareTo0680j_4(stateM449animateDpAsStateAjpBEmI.getValue().m6949unboximpl(), Dp.m6935constructorimpl(0.0f)) > 0) {
                            DrawScope.m4779drawCircleVaOC9Bg$default(drawScope, stateRadioColor$material3_release.getValue().m4228unboximpl(), drawScope.mo694toPx0680j_4(stateM449animateDpAsStateAjpBEmI.getValue().m6949unboximpl()) - f2, 0L, 0.0f, Fill.INSTANCE, null, 0, 108, null);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CanvasKt.Canvas(modifierM1039requiredSize3ABfNKs15, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
            radioButtonColors3 = radioButtonColors2;
            z6 = z5;
            mutableInteractionSource4 = mutableInteractionSource3;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i9 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier2;
                }
                if (i4 != 0) {
                    z3 = true;
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    radioButtonColorsColors = RadioButtonDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                }
                if (i6 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(735546075);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    modifier3 = companion;
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    z4 = z3;
                    radioButtonColors2 = radioButtonColorsColors;
                } else {
                    modifier3 = companion;
                    z4 = z3;
                    radioButtonColors2 = radioButtonColorsColors;
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
            } else {
                if (i9 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier2;
                }
                if (i4 != 0) {
                    z3 = true;
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    radioButtonColorsColors = RadioButtonDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                }
                if (i6 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(735546075);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    modifier3 = companion;
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    z4 = z3;
                    radioButtonColors2 = radioButtonColorsColors;
                } else {
                    modifier3 = companion;
                    z4 = z3;
                    radioButtonColors2 = radioButtonColorsColors;
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(408580840, i3, -1, "androidx.compose.material3.RadioButton (RadioButton.kt:79)");
            }
            if (z) {
                fM6935constructorimpl = Dp.m6935constructorimpl(RadioButtonDotSize / 2.0f);
            } else {
                fM6935constructorimpl = Dp.m6935constructorimpl(0.0f);
            }
            stateM449animateDpAsStateAjpBEmI = AnimateAsStateKt.m449animateDpAsStateAjpBEmI(fM6935constructorimpl, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composerStartRestartGroup, 48, 12);
            stateRadioColor$material3_release = radioButtonColors2.radioColor$material3_release(z4, z, composerStartRestartGroup, ((i3 << 3) & 112) | ((i3 >> 9) & 14) | ((i3 >> 6) & 896));
            composerStartRestartGroup.startReplaceableGroup(735546399);
            if (function0 != null) {
                z5 = z4;
                i8 = 2;
                companionM1253selectableO2vRcR0 = SelectableKt.m1253selectableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource3, RippleKt.m1744rememberRipple9IZ8Weo(false, Dp.m6935constructorimpl(RadioButtonTokens.INSTANCE.m3298getStateLayerSizeD9Ej5fM() / 2.0f), 0L, composerStartRestartGroup, 54, 4), z5, Role.m6137boximpl(Role.INSTANCE.m6149getRadioButtono7Vup1c()), function0);
            } else {
                z5 = z4;
                i8 = 2;
                companionM1253selectableO2vRcR0 = Modifier.INSTANCE;
            }
            composerStartRestartGroup.endReplaceableGroup();
            if (function0 != null) {
                companionMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
            } else {
                companionMinimumInteractiveComponentSize = Modifier.INSTANCE;
            }
            Modifier modifierM1039requiredSize3ABfNKs16 = SizeKt.m1039requiredSize3ABfNKs(PaddingKt.m1002padding3ABfNKs(SizeKt.wrapContentSize$default(modifier3.then(companionMinimumInteractiveComponentSize).then(companionM1253selectableO2vRcR0), Alignment.INSTANCE.getCenter(), false, i8, null), RadioButtonPadding), RadioButtonTokens.INSTANCE.m3297getIconSizeD9Ej5fM());
            composerStartRestartGroup.startReplaceableGroup(735547384);
            zChanged = composerStartRestartGroup.changed(stateRadioColor$material3_release);
            zChanged2 = composerStartRestartGroup.changed(stateM449animateDpAsStateAjpBEmI);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (!zChanged && !zChanged2) {
                objRememberedValue2 = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.RadioButtonKt$RadioButton$2$1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                        invoke2(drawScope);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(DrawScope drawScope) {
                        float f = drawScope.mo694toPx0680j_4(RadioButtonKt.RadioStrokeWidth);
                        float f2 = f / 2.0f;
                        DrawScope.m4779drawCircleVaOC9Bg$default(drawScope, stateRadioColor$material3_release.getValue().m4228unboximpl(), drawScope.mo694toPx0680j_4(Dp.m6935constructorimpl(RadioButtonTokens.INSTANCE.m3297getIconSizeD9Ej5fM() / 2.0f)) - f2, 0L, 0.0f, new Stroke(f, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                        if (Dp.m6934compareTo0680j_4(stateM449animateDpAsStateAjpBEmI.getValue().m6949unboximpl(), Dp.m6935constructorimpl(0.0f)) > 0) {
                            DrawScope.m4779drawCircleVaOC9Bg$default(drawScope, stateRadioColor$material3_release.getValue().m4228unboximpl(), drawScope.mo694toPx0680j_4(stateM449animateDpAsStateAjpBEmI.getValue().m6949unboximpl()) - f2, 0L, 0.0f, Fill.INSTANCE, null, 0, 108, null);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.RadioButtonKt$RadioButton$2$1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                        invoke2(drawScope);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(DrawScope drawScope) {
                        float f = drawScope.mo694toPx0680j_4(RadioButtonKt.RadioStrokeWidth);
                        float f2 = f / 2.0f;
                        DrawScope.m4779drawCircleVaOC9Bg$default(drawScope, stateRadioColor$material3_release.getValue().m4228unboximpl(), drawScope.mo694toPx0680j_4(Dp.m6935constructorimpl(RadioButtonTokens.INSTANCE.m3297getIconSizeD9Ej5fM() / 2.0f)) - f2, 0L, 0.0f, new Stroke(f, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                        if (Dp.m6934compareTo0680j_4(stateM449animateDpAsStateAjpBEmI.getValue().m6949unboximpl(), Dp.m6935constructorimpl(0.0f)) > 0) {
                            DrawScope.m4779drawCircleVaOC9Bg$default(drawScope, stateRadioColor$material3_release.getValue().m4228unboximpl(), drawScope.mo694toPx0680j_4(stateM449animateDpAsStateAjpBEmI.getValue().m6949unboximpl()) - f2, 0L, 0.0f, Fill.INSTANCE, null, 0, 108, null);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CanvasKt.Canvas(modifierM1039requiredSize3ABfNKs16, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
            radioButtonColors3 = radioButtonColors2;
            z6 = z5;
            mutableInteractionSource4 = mutableInteractionSource3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.RadioButtonKt.RadioButton.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i11) {
                    RadioButtonKt.RadioButton(z, function0, modifier2, z6, radioButtonColors3, mutableInteractionSource4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }
}
