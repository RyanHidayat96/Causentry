package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.HoverableKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.material3.tokens.SliderTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PointMode;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.profileinstaller.ProfileVerifier;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JB\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J3\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007¢\u0006\u0002\u0010\u0018J3\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007¢\u0006\u0002\u0010\u001bJ3\u0010\u0015\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007¢\u0006\u0002\u0010\u001eJ\r\u0010\u000e\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u001fJv\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020!2\b\b\u0002\u0010#\u001a\u00020!2\b\b\u0002\u0010$\u001a\u00020!2\b\b\u0002\u0010%\u001a\u00020!2\b\b\u0002\u0010&\u001a\u00020!2\b\b\u0002\u0010'\u001a\u00020!2\b\b\u0002\u0010(\u001a\u00020!2\b\b\u0002\u0010)\u001a\u00020!2\b\b\u0002\u0010*\u001a\u00020!H\u0007ø\u0001\u0000¢\u0006\u0004\b+\u0010,JN\u0010-\u001a\u00020\t*\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u0002022\u0006\u0010$\u001a\u00020!2\u0006\u0010\"\u001a\u00020!2\u0006\u0010%\u001a\u00020!2\u0006\u0010#\u001a\u00020!H\u0002ø\u0001\u0000¢\u0006\u0004\b4\u00105R\u0018\u0010\u0003\u001a\u00020\u0004*\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00066"}, d2 = {"Landroidx/compose/material3/SliderDefaults;", "", "()V", "defaultSliderColors", "Landroidx/compose/material3/SliderColors;", "Landroidx/compose/material3/ColorScheme;", "getDefaultSliderColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/SliderColors;", "Thumb", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "modifier", "Landroidx/compose/ui/Modifier;", "colors", "enabled", "", "thumbSize", "Landroidx/compose/ui/unit/DpSize;", "Thumb-9LiSoMs", "(Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderColors;ZJLandroidx/compose/runtime/Composer;II)V", "Track", "rangeSliderState", "Landroidx/compose/material3/RangeSliderState;", "(Landroidx/compose/material3/RangeSliderState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderColors;ZLandroidx/compose/runtime/Composer;II)V", "sliderPositions", "Landroidx/compose/material3/SliderPositions;", "(Landroidx/compose/material3/SliderPositions;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderColors;ZLandroidx/compose/runtime/Composer;II)V", "sliderState", "Landroidx/compose/material3/SliderState;", "(Landroidx/compose/material3/SliderState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderColors;ZLandroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/SliderColors;", "thumbColor", "Landroidx/compose/ui/graphics/Color;", "activeTrackColor", "activeTickColor", "inactiveTrackColor", "inactiveTickColor", "disabledThumbColor", "disabledActiveTrackColor", "disabledActiveTickColor", "disabledInactiveTrackColor", "disabledInactiveTickColor", "colors-q0g_0yA", "(JJJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/SliderColors;", "drawTrack", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "tickFractions", "", "activeRangeStart", "", "activeRangeEnd", "drawTrack-LUBghH0", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;[FFFJJJJ)V", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SliderDefaults {
    public static final int $stable = 0;
    public static final SliderDefaults INSTANCE = new SliderDefaults();

    private SliderDefaults() {
    }

    public final SliderColors colors(Composer composer, int i) {
        composer.startReplaceableGroup(1376295968);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1376295968, i, -1, "androidx.compose.material3.SliderDefaults.colors (Slider.kt:885)");
        }
        SliderColors defaultSliderColors$material3_release = getDefaultSliderColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultSliderColors$material3_release;
    }

    /* JADX INFO: renamed from: colors-q0g_0yA, reason: not valid java name */
    public final SliderColors m2398colorsq0g_0yA(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, Composer composer, int i, int i2, int i3) {
        composer.startReplaceableGroup(885588574);
        long jM4254getUnspecified0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m4254getUnspecified0d7_KjU() : j;
        long jM4254getUnspecified0d7_KjU2 = (i3 & 2) != 0 ? Color.INSTANCE.m4254getUnspecified0d7_KjU() : j2;
        long jM4254getUnspecified0d7_KjU3 = (i3 & 4) != 0 ? Color.INSTANCE.m4254getUnspecified0d7_KjU() : j3;
        long jM4254getUnspecified0d7_KjU4 = (i3 & 8) != 0 ? Color.INSTANCE.m4254getUnspecified0d7_KjU() : j4;
        long jM4254getUnspecified0d7_KjU5 = (i3 & 16) != 0 ? Color.INSTANCE.m4254getUnspecified0d7_KjU() : j5;
        long jM4254getUnspecified0d7_KjU6 = (i3 & 32) != 0 ? Color.INSTANCE.m4254getUnspecified0d7_KjU() : j6;
        long jM4254getUnspecified0d7_KjU7 = (i3 & 64) != 0 ? Color.INSTANCE.m4254getUnspecified0d7_KjU() : j7;
        long jM4254getUnspecified0d7_KjU8 = (i3 & 128) != 0 ? Color.INSTANCE.m4254getUnspecified0d7_KjU() : j8;
        long jM4254getUnspecified0d7_KjU9 = (i3 & 256) != 0 ? Color.INSTANCE.m4254getUnspecified0d7_KjU() : j9;
        long jM4254getUnspecified0d7_KjU10 = (i3 & 512) != 0 ? Color.INSTANCE.m4254getUnspecified0d7_KjU() : j10;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(885588574, i, i2, "androidx.compose.material3.SliderDefaults.colors (Slider.kt:926)");
        }
        SliderColors sliderColorsM2381copyK518z4 = getDefaultSliderColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m2381copyK518z4(jM4254getUnspecified0d7_KjU, jM4254getUnspecified0d7_KjU2, jM4254getUnspecified0d7_KjU3, jM4254getUnspecified0d7_KjU4, jM4254getUnspecified0d7_KjU5, jM4254getUnspecified0d7_KjU6, jM4254getUnspecified0d7_KjU7, jM4254getUnspecified0d7_KjU8, jM4254getUnspecified0d7_KjU9, jM4254getUnspecified0d7_KjU10);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return sliderColorsM2381copyK518z4;
    }

    public final SliderColors getDefaultSliderColors$material3_release(ColorScheme colorScheme) {
        SliderColors defaultSliderColorsCached = colorScheme.getDefaultSliderColorsCached();
        if (defaultSliderColorsCached != null) {
            return defaultSliderColorsCached;
        }
        SliderColors sliderColors = new SliderColors(ColorSchemeKt.fromToken(colorScheme, SliderTokens.INSTANCE.getHandleColor()), ColorSchemeKt.fromToken(colorScheme, SliderTokens.INSTANCE.getActiveTrackColor()), Color.m4217copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, SliderTokens.INSTANCE.getTickMarksActiveContainerColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, SliderTokens.INSTANCE.getInactiveTrackColor()), Color.m4217copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, SliderTokens.INSTANCE.getTickMarksInactiveContainerColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorKt.m4263compositeOverOWjLjI(Color.m4217copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, SliderTokens.INSTANCE.getDisabledHandleColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), colorScheme.getSurface()), Color.m4217copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, SliderTokens.INSTANCE.getDisabledActiveTrackColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m4217copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, SliderTokens.INSTANCE.getTickMarksDisabledContainerColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m4217copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, SliderTokens.INSTANCE.getDisabledInactiveTrackColor()), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), Color.m4217copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, SliderTokens.INSTANCE.getTickMarksDisabledContainerColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultSliderColorsCached$material3_release(sliderColors);
        return sliderColors;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0147  */
    /* JADX WARN: Code duplicated, block: B:103:0x014f  */
    /* JADX WARN: Code duplicated, block: B:106:0x016a  */
    /* JADX WARN: Code duplicated, block: B:107:0x016f  */
    /* JADX WARN: Code duplicated, block: B:110:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:113:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:117:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0046  */
    /* JADX WARN: Code duplicated, block: B:28:0x004a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    /* JADX WARN: Code duplicated, block: B:34:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0061  */
    /* JADX WARN: Code duplicated, block: B:38:0x0064  */
    /* JADX WARN: Code duplicated, block: B:40:0x0068  */
    /* JADX WARN: Code duplicated, block: B:42:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x0073  */
    /* JADX WARN: Code duplicated, block: B:48:0x007d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0080  */
    /* JADX WARN: Code duplicated, block: B:51:0x0084  */
    /* JADX WARN: Code duplicated, block: B:53:0x008c  */
    /* JADX WARN: Code duplicated, block: B:54:0x008f  */
    /* JADX WARN: Code duplicated, block: B:59:0x009c  */
    /* JADX WARN: Code duplicated, block: B:60:0x009f  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:88:0x0103 A[PHI: r3 r7 r9 r12
  0x0103: PHI (r3v23 int) = (r3v18 int), (r3v17 int), (r3v25 int) binds: [B:86:0x00fa, B:77:0x00dc, B:78:0x00de] A[DONT_GENERATE, DONT_INLINE]
  0x0103: PHI (r7v6 androidx.compose.ui.Modifier) = (r7v3 androidx.compose.ui.Modifier), (r7v2 androidx.compose.ui.Modifier), (r7v2 androidx.compose.ui.Modifier) binds: [B:86:0x00fa, B:77:0x00dc, B:78:0x00de] A[DONT_GENERATE, DONT_INLINE]
  0x0103: PHI (r9v10 androidx.compose.material3.SliderColors) = 
  (r9v7 androidx.compose.material3.SliderColors)
  (r9v6 androidx.compose.material3.SliderColors)
  (r9v6 androidx.compose.material3.SliderColors)
 binds: [B:86:0x00fa, B:77:0x00dc, B:78:0x00de] A[DONT_GENERATE, DONT_INLINE]
  0x0103: PHI (r12v9 boolean) = (r12v3 boolean), (r12v2 boolean), (r12v2 boolean) binds: [B:86:0x00fa, B:77:0x00dc, B:78:0x00de] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:91:0x010f  */
    /* JADX WARN: Code duplicated, block: B:94:0x0127  */
    /* JADX WARN: Code duplicated, block: B:98:0x013f  */
    /* JADX WARN: Instruction removed from duplicated block: B:72:0x00c9, please report this as an issue */
    /* JADX INFO: renamed from: Thumb-9LiSoMs, reason: not valid java name */
    public final void m2397Thumb9LiSoMs(final MutableInteractionSource mutableInteractionSource, Modifier modifier, SliderColors sliderColors, boolean z, long j, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        SliderColors sliderColors2;
        int i4;
        boolean z2;
        int i5;
        int i6;
        long j2;
        int i7;
        int i8;
        long j3;
        int i9;
        boolean z3;
        Object objRememberedValue;
        SnapshotStateList snapshotStateList;
        boolean z4;
        SliderDefaults$Thumb$1$1 sliderDefaults$Thumb$1$1RememberedValue;
        float fM6935constructorimpl;
        final boolean z5;
        final Modifier modifier3;
        final SliderColors sliderColors3;
        final long j4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-290277409);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(mutableInteractionSource) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                if ((i2 & 4) == 0) {
                    sliderColors2 = sliderColors;
                    int i11 = composerStartRestartGroup.changed(sliderColors2) ? 256 : 128;
                    i3 |= i11;
                } else {
                    sliderColors2 = sliderColors;
                }
                i3 |= i11;
            } else {
                sliderColors2 = sliderColors;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    z2 = z;
                    if (composerStartRestartGroup.changed(z2)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    if ((i & 24576) == 0) {
                        j2 = j;
                        if (composerStartRestartGroup.changed(j2)) {
                            i7 = 16384;
                        } else {
                            i7 = 8192;
                        }
                        i3 |= i7;
                    }
                    if ((i2 & 32) != 0) {
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        if (composerStartRestartGroup.changed(this)) {
                            i8 = 131072;
                        } else {
                            i8 = 65536;
                        }
                        i3 |= i8;
                    }
                    if ((i3 & 74899) == 74898 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) == 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                            }
                        } else {
                            if (i10 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if ((i2 & 4) != 0) {
                                SliderColors sliderColorsColors = colors(composerStartRestartGroup, (i3 >> 15) & 14);
                                i3 &= -897;
                                sliderColors2 = sliderColorsColors;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if (i6 != 0) {
                                j3 = SliderKt.ThumbSize;
                                i9 = i3;
                                z3 = z2;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-290277409, i9, -1, "androidx.compose.material3.SliderDefaults.Thumb (Slider.kt:985)");
                            }
                            composerStartRestartGroup.startReplaceableGroup(-1142853216);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = SnapshotStateKt.mutableStateListOf();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            snapshotStateList = (SnapshotStateList) objRememberedValue;
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.startReplaceableGroup(-1142853127);
                            int i12 = i9 & 14;
                            z4 = i12 == 4;
                            sliderDefaults$Thumb$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!z4 || sliderDefaults$Thumb$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                                sliderDefaults$Thumb$1$1RememberedValue = new SliderDefaults$Thumb$1$1(mutableInteractionSource, snapshotStateList, null);
                                composerStartRestartGroup.updateRememberedValue(sliderDefaults$Thumb$1$1RememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            EffectsKt.LaunchedEffect(mutableInteractionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) sliderDefaults$Thumb$1$1RememberedValue, composerStartRestartGroup, i12);
                            if (!snapshotStateList.isEmpty()) {
                                fM6935constructorimpl = SliderKt.ThumbPressedElevation;
                            } else {
                                fM6935constructorimpl = SliderKt.ThumbDefaultElevation;
                            }
                            Shape value = ShapesKt.getValue(SliderTokens.INSTANCE.getHandleShape(), composerStartRestartGroup, 6);
                            long j5 = j3;
                            Modifier modifierHoverable$default = HoverableKt.hoverable$default(IndicationKt.indication(SizeKt.m1048size6HolHcs(modifier2, j3), mutableInteractionSource, RippleKt.m1744rememberRipple9IZ8Weo(false, Dp.m6935constructorimpl(SliderTokens.INSTANCE.m3323getStateLayerSizeD9Ej5fM() / 2.0f), 0L, composerStartRestartGroup, 54, 4)), mutableInteractionSource, false, 2, null);
                            if (!z3) {
                                fM6935constructorimpl = Dp.m6935constructorimpl(0.0f);
                            }
                            SpacerKt.Spacer(BackgroundKt.m556backgroundbw27NRU(ShadowKt.m3821shadows4CzXII$default(modifierHoverable$default, fM6935constructorimpl, value, false, 0L, 0L, 24, null), sliderColors2.m2392thumbColorvNxB06k$material3_release(z3), value), composerStartRestartGroup, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z5 = z3;
                            modifier3 = modifier2;
                            sliderColors3 = sliderColors2;
                            j4 = j5;
                        }
                        i9 = i3;
                        z3 = z2;
                        j3 = j2;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-290277409, i9, -1, "androidx.compose.material3.SliderDefaults.Thumb (Slider.kt:985)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-1142853216);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = SnapshotStateKt.mutableStateListOf();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        snapshotStateList = (SnapshotStateList) objRememberedValue;
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.startReplaceableGroup(-1142853127);
                        int i13 = i9 & 14;
                        if (i13 == 4) {
                        }
                        sliderDefaults$Thumb$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!z4) {
                            sliderDefaults$Thumb$1$1RememberedValue = new SliderDefaults$Thumb$1$1(mutableInteractionSource, snapshotStateList, null);
                            composerStartRestartGroup.updateRememberedValue(sliderDefaults$Thumb$1$1RememberedValue);
                        } else {
                            sliderDefaults$Thumb$1$1RememberedValue = new SliderDefaults$Thumb$1$1(mutableInteractionSource, snapshotStateList, null);
                            composerStartRestartGroup.updateRememberedValue(sliderDefaults$Thumb$1$1RememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        EffectsKt.LaunchedEffect(mutableInteractionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) sliderDefaults$Thumb$1$1RememberedValue, composerStartRestartGroup, i13);
                        if (!snapshotStateList.isEmpty()) {
                            fM6935constructorimpl = SliderKt.ThumbPressedElevation;
                        } else {
                            fM6935constructorimpl = SliderKt.ThumbDefaultElevation;
                        }
                        Shape value2 = ShapesKt.getValue(SliderTokens.INSTANCE.getHandleShape(), composerStartRestartGroup, 6);
                        long j6 = j3;
                        Modifier modifierHoverable$default2 = HoverableKt.hoverable$default(IndicationKt.indication(SizeKt.m1048size6HolHcs(modifier2, j3), mutableInteractionSource, RippleKt.m1744rememberRipple9IZ8Weo(false, Dp.m6935constructorimpl(SliderTokens.INSTANCE.m3323getStateLayerSizeD9Ej5fM() / 2.0f), 0L, composerStartRestartGroup, 54, 4)), mutableInteractionSource, false, 2, null);
                        if (!z3) {
                            fM6935constructorimpl = Dp.m6935constructorimpl(0.0f);
                        }
                        SpacerKt.Spacer(BackgroundKt.m556backgroundbw27NRU(ShadowKt.m3821shadows4CzXII$default(modifierHoverable$default2, fM6935constructorimpl, value2, false, 0L, 0L, 24, null), sliderColors2.m2392thumbColorvNxB06k$material3_release(z3), value2), composerStartRestartGroup, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z5 = z3;
                        modifier3 = modifier2;
                        sliderColors3 = sliderColors2;
                        j4 = j6;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        sliderColors3 = sliderColors2;
                        z5 = z2;
                        j4 = j2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Thumb$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i14) {
                                this.$tmp2_rcvr.m2397Thumb9LiSoMs(mutableInteractionSource, modifier3, sliderColors3, z5, j4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                    }
                }
                i3 |= 24576;
                j2 = j;
                if ((i2 & 32) != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    if (composerStartRestartGroup.changed(this)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i3 |= i8;
                }
                if ((i3 & 74899) == 74898) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) == 0) {
                        if (i10 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i2 & 4) != 0) {
                            SliderColors sliderColorsColors2 = colors(composerStartRestartGroup, (i3 >> 15) & 14);
                            i3 &= -897;
                            sliderColors2 = sliderColorsColors2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if (i6 != 0) {
                            j3 = SliderKt.ThumbSize;
                            i9 = i3;
                            z3 = z2;
                        } else {
                            i9 = i3;
                            z3 = z2;
                            j3 = j2;
                        }
                    } else {
                        if (i10 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i2 & 4) != 0) {
                            SliderColors sliderColorsColors3 = colors(composerStartRestartGroup, (i3 >> 15) & 14);
                            i3 &= -897;
                            sliderColors2 = sliderColorsColors3;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if (i6 != 0) {
                            j3 = SliderKt.ThumbSize;
                            i9 = i3;
                            z3 = z2;
                        } else {
                            i9 = i3;
                            z3 = z2;
                            j3 = j2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-290277409, i9, -1, "androidx.compose.material3.SliderDefaults.Thumb (Slider.kt:985)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-1142853216);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = SnapshotStateKt.mutableStateListOf();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    snapshotStateList = (SnapshotStateList) objRememberedValue;
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-1142853127);
                    int i14 = i9 & 14;
                    if (i14 == 4) {
                    }
                    sliderDefaults$Thumb$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z4) {
                        sliderDefaults$Thumb$1$1RememberedValue = new SliderDefaults$Thumb$1$1(mutableInteractionSource, snapshotStateList, null);
                        composerStartRestartGroup.updateRememberedValue(sliderDefaults$Thumb$1$1RememberedValue);
                    } else {
                        sliderDefaults$Thumb$1$1RememberedValue = new SliderDefaults$Thumb$1$1(mutableInteractionSource, snapshotStateList, null);
                        composerStartRestartGroup.updateRememberedValue(sliderDefaults$Thumb$1$1RememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(mutableInteractionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) sliderDefaults$Thumb$1$1RememberedValue, composerStartRestartGroup, i14);
                    if (!snapshotStateList.isEmpty()) {
                        fM6935constructorimpl = SliderKt.ThumbPressedElevation;
                    } else {
                        fM6935constructorimpl = SliderKt.ThumbDefaultElevation;
                    }
                    Shape value3 = ShapesKt.getValue(SliderTokens.INSTANCE.getHandleShape(), composerStartRestartGroup, 6);
                    long j7 = j3;
                    Modifier modifierHoverable$default3 = HoverableKt.hoverable$default(IndicationKt.indication(SizeKt.m1048size6HolHcs(modifier2, j3), mutableInteractionSource, RippleKt.m1744rememberRipple9IZ8Weo(false, Dp.m6935constructorimpl(SliderTokens.INSTANCE.m3323getStateLayerSizeD9Ej5fM() / 2.0f), 0L, composerStartRestartGroup, 54, 4)), mutableInteractionSource, false, 2, null);
                    if (!z3) {
                        fM6935constructorimpl = Dp.m6935constructorimpl(0.0f);
                    }
                    SpacerKt.Spacer(BackgroundKt.m556backgroundbw27NRU(ShadowKt.m3821shadows4CzXII$default(modifierHoverable$default3, fM6935constructorimpl, value3, false, 0L, 0L, 24, null), sliderColors2.m2392thumbColorvNxB06k$material3_release(z3), value3), composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z5 = z3;
                    modifier3 = modifier2;
                    sliderColors3 = sliderColors2;
                    j4 = j7;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) == 0) {
                        if (i10 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i2 & 4) != 0) {
                            SliderColors sliderColorsColors4 = colors(composerStartRestartGroup, (i3 >> 15) & 14);
                            i3 &= -897;
                            sliderColors2 = sliderColorsColors4;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if (i6 != 0) {
                            j3 = SliderKt.ThumbSize;
                            i9 = i3;
                            z3 = z2;
                        } else {
                            i9 = i3;
                            z3 = z2;
                            j3 = j2;
                        }
                    } else {
                        if (i10 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i2 & 4) != 0) {
                            SliderColors sliderColorsColors5 = colors(composerStartRestartGroup, (i3 >> 15) & 14);
                            i3 &= -897;
                            sliderColors2 = sliderColorsColors5;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if (i6 != 0) {
                            j3 = SliderKt.ThumbSize;
                            i9 = i3;
                            z3 = z2;
                        } else {
                            i9 = i3;
                            z3 = z2;
                            j3 = j2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-290277409, i9, -1, "androidx.compose.material3.SliderDefaults.Thumb (Slider.kt:985)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-1142853216);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = SnapshotStateKt.mutableStateListOf();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    snapshotStateList = (SnapshotStateList) objRememberedValue;
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-1142853127);
                    int i15 = i9 & 14;
                    if (i15 == 4) {
                    }
                    sliderDefaults$Thumb$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z4) {
                        sliderDefaults$Thumb$1$1RememberedValue = new SliderDefaults$Thumb$1$1(mutableInteractionSource, snapshotStateList, null);
                        composerStartRestartGroup.updateRememberedValue(sliderDefaults$Thumb$1$1RememberedValue);
                    } else {
                        sliderDefaults$Thumb$1$1RememberedValue = new SliderDefaults$Thumb$1$1(mutableInteractionSource, snapshotStateList, null);
                        composerStartRestartGroup.updateRememberedValue(sliderDefaults$Thumb$1$1RememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(mutableInteractionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) sliderDefaults$Thumb$1$1RememberedValue, composerStartRestartGroup, i15);
                    if (!snapshotStateList.isEmpty()) {
                        fM6935constructorimpl = SliderKt.ThumbPressedElevation;
                    } else {
                        fM6935constructorimpl = SliderKt.ThumbDefaultElevation;
                    }
                    Shape value4 = ShapesKt.getValue(SliderTokens.INSTANCE.getHandleShape(), composerStartRestartGroup, 6);
                    long j8 = j3;
                    Modifier modifierHoverable$default4 = HoverableKt.hoverable$default(IndicationKt.indication(SizeKt.m1048size6HolHcs(modifier2, j3), mutableInteractionSource, RippleKt.m1744rememberRipple9IZ8Weo(false, Dp.m6935constructorimpl(SliderTokens.INSTANCE.m3323getStateLayerSizeD9Ej5fM() / 2.0f), 0L, composerStartRestartGroup, 54, 4)), mutableInteractionSource, false, 2, null);
                    if (!z3) {
                        fM6935constructorimpl = Dp.m6935constructorimpl(0.0f);
                    }
                    SpacerKt.Spacer(BackgroundKt.m556backgroundbw27NRU(ShadowKt.m3821shadows4CzXII$default(modifierHoverable$default4, fM6935constructorimpl, value4, false, 0L, 0L, 24, null), sliderColors2.m2392thumbColorvNxB06k$material3_release(z3), value4), composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z5 = z3;
                    modifier3 = modifier2;
                    sliderColors3 = sliderColors2;
                    j4 = j8;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Thumb$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i16) {
                            this.$tmp2_rcvr.m2397Thumb9LiSoMs(mutableInteractionSource, modifier3, sliderColors3, z5, j4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 3072;
            z2 = z;
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    j2 = j;
                    if (composerStartRestartGroup.changed(j2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                if ((i2 & 32) != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    if (composerStartRestartGroup.changed(this)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i3 |= i8;
                }
                if ((i3 & 74899) == 74898) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) == 0) {
                        if (i10 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i2 & 4) != 0) {
                            SliderColors sliderColorsColors6 = colors(composerStartRestartGroup, (i3 >> 15) & 14);
                            i3 &= -897;
                            sliderColors2 = sliderColorsColors6;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if (i6 != 0) {
                            j3 = SliderKt.ThumbSize;
                            i9 = i3;
                            z3 = z2;
                        } else {
                            i9 = i3;
                            z3 = z2;
                            j3 = j2;
                        }
                    } else {
                        if (i10 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i2 & 4) != 0) {
                            SliderColors sliderColorsColors7 = colors(composerStartRestartGroup, (i3 >> 15) & 14);
                            i3 &= -897;
                            sliderColors2 = sliderColorsColors7;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if (i6 != 0) {
                            j3 = SliderKt.ThumbSize;
                            i9 = i3;
                            z3 = z2;
                        } else {
                            i9 = i3;
                            z3 = z2;
                            j3 = j2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-290277409, i9, -1, "androidx.compose.material3.SliderDefaults.Thumb (Slider.kt:985)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-1142853216);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = SnapshotStateKt.mutableStateListOf();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    snapshotStateList = (SnapshotStateList) objRememberedValue;
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-1142853127);
                    int i16 = i9 & 14;
                    if (i16 == 4) {
                    }
                    sliderDefaults$Thumb$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z4) {
                        sliderDefaults$Thumb$1$1RememberedValue = new SliderDefaults$Thumb$1$1(mutableInteractionSource, snapshotStateList, null);
                        composerStartRestartGroup.updateRememberedValue(sliderDefaults$Thumb$1$1RememberedValue);
                    } else {
                        sliderDefaults$Thumb$1$1RememberedValue = new SliderDefaults$Thumb$1$1(mutableInteractionSource, snapshotStateList, null);
                        composerStartRestartGroup.updateRememberedValue(sliderDefaults$Thumb$1$1RememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(mutableInteractionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) sliderDefaults$Thumb$1$1RememberedValue, composerStartRestartGroup, i16);
                    if (!snapshotStateList.isEmpty()) {
                        fM6935constructorimpl = SliderKt.ThumbPressedElevation;
                    } else {
                        fM6935constructorimpl = SliderKt.ThumbDefaultElevation;
                    }
                    Shape value5 = ShapesKt.getValue(SliderTokens.INSTANCE.getHandleShape(), composerStartRestartGroup, 6);
                    long j9 = j3;
                    Modifier modifierHoverable$default5 = HoverableKt.hoverable$default(IndicationKt.indication(SizeKt.m1048size6HolHcs(modifier2, j3), mutableInteractionSource, RippleKt.m1744rememberRipple9IZ8Weo(false, Dp.m6935constructorimpl(SliderTokens.INSTANCE.m3323getStateLayerSizeD9Ej5fM() / 2.0f), 0L, composerStartRestartGroup, 54, 4)), mutableInteractionSource, false, 2, null);
                    if (!z3) {
                        fM6935constructorimpl = Dp.m6935constructorimpl(0.0f);
                    }
                    SpacerKt.Spacer(BackgroundKt.m556backgroundbw27NRU(ShadowKt.m3821shadows4CzXII$default(modifierHoverable$default5, fM6935constructorimpl, value5, false, 0L, 0L, 24, null), sliderColors2.m2392thumbColorvNxB06k$material3_release(z3), value5), composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z5 = z3;
                    modifier3 = modifier2;
                    sliderColors3 = sliderColors2;
                    j4 = j9;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) == 0) {
                        if (i10 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i2 & 4) != 0) {
                            SliderColors sliderColorsColors8 = colors(composerStartRestartGroup, (i3 >> 15) & 14);
                            i3 &= -897;
                            sliderColors2 = sliderColorsColors8;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if (i6 != 0) {
                            j3 = SliderKt.ThumbSize;
                            i9 = i3;
                            z3 = z2;
                        } else {
                            i9 = i3;
                            z3 = z2;
                            j3 = j2;
                        }
                    } else {
                        if (i10 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i2 & 4) != 0) {
                            SliderColors sliderColorsColors9 = colors(composerStartRestartGroup, (i3 >> 15) & 14);
                            i3 &= -897;
                            sliderColors2 = sliderColorsColors9;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if (i6 != 0) {
                            j3 = SliderKt.ThumbSize;
                            i9 = i3;
                            z3 = z2;
                        } else {
                            i9 = i3;
                            z3 = z2;
                            j3 = j2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-290277409, i9, -1, "androidx.compose.material3.SliderDefaults.Thumb (Slider.kt:985)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-1142853216);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = SnapshotStateKt.mutableStateListOf();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    snapshotStateList = (SnapshotStateList) objRememberedValue;
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-1142853127);
                    int i17 = i9 & 14;
                    if (i17 == 4) {
                    }
                    sliderDefaults$Thumb$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z4) {
                        sliderDefaults$Thumb$1$1RememberedValue = new SliderDefaults$Thumb$1$1(mutableInteractionSource, snapshotStateList, null);
                        composerStartRestartGroup.updateRememberedValue(sliderDefaults$Thumb$1$1RememberedValue);
                    } else {
                        sliderDefaults$Thumb$1$1RememberedValue = new SliderDefaults$Thumb$1$1(mutableInteractionSource, snapshotStateList, null);
                        composerStartRestartGroup.updateRememberedValue(sliderDefaults$Thumb$1$1RememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(mutableInteractionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) sliderDefaults$Thumb$1$1RememberedValue, composerStartRestartGroup, i17);
                    if (!snapshotStateList.isEmpty()) {
                        fM6935constructorimpl = SliderKt.ThumbPressedElevation;
                    } else {
                        fM6935constructorimpl = SliderKt.ThumbDefaultElevation;
                    }
                    Shape value6 = ShapesKt.getValue(SliderTokens.INSTANCE.getHandleShape(), composerStartRestartGroup, 6);
                    long j10 = j3;
                    Modifier modifierHoverable$default6 = HoverableKt.hoverable$default(IndicationKt.indication(SizeKt.m1048size6HolHcs(modifier2, j3), mutableInteractionSource, RippleKt.m1744rememberRipple9IZ8Weo(false, Dp.m6935constructorimpl(SliderTokens.INSTANCE.m3323getStateLayerSizeD9Ej5fM() / 2.0f), 0L, composerStartRestartGroup, 54, 4)), mutableInteractionSource, false, 2, null);
                    if (!z3) {
                        fM6935constructorimpl = Dp.m6935constructorimpl(0.0f);
                    }
                    SpacerKt.Spacer(BackgroundKt.m556backgroundbw27NRU(ShadowKt.m3821shadows4CzXII$default(modifierHoverable$default6, fM6935constructorimpl, value6, false, 0L, 0L, 24, null), sliderColors2.m2392thumbColorvNxB06k$material3_release(z3), value6), composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z5 = z3;
                    modifier3 = modifier2;
                    sliderColors3 = sliderColors2;
                    j4 = j10;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Thumb$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i18) {
                            this.$tmp2_rcvr.m2397Thumb9LiSoMs(mutableInteractionSource, modifier3, sliderColors3, z5, j4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 24576;
            j2 = j;
            if ((i2 & 32) != 0) {
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                if (composerStartRestartGroup.changed(this)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i3 |= i8;
            }
            if ((i3 & 74899) == 74898) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) == 0) {
                    if (i10 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i2 & 4) != 0) {
                        SliderColors sliderColorsColors10 = colors(composerStartRestartGroup, (i3 >> 15) & 14);
                        i3 &= -897;
                        sliderColors2 = sliderColorsColors10;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if (i6 != 0) {
                        j3 = SliderKt.ThumbSize;
                        i9 = i3;
                        z3 = z2;
                    } else {
                        i9 = i3;
                        z3 = z2;
                        j3 = j2;
                    }
                } else {
                    if (i10 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i2 & 4) != 0) {
                        SliderColors sliderColorsColors11 = colors(composerStartRestartGroup, (i3 >> 15) & 14);
                        i3 &= -897;
                        sliderColors2 = sliderColorsColors11;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if (i6 != 0) {
                        j3 = SliderKt.ThumbSize;
                        i9 = i3;
                        z3 = z2;
                    } else {
                        i9 = i3;
                        z3 = z2;
                        j3 = j2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-290277409, i9, -1, "androidx.compose.material3.SliderDefaults.Thumb (Slider.kt:985)");
                }
                composerStartRestartGroup.startReplaceableGroup(-1142853216);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotStateKt.mutableStateListOf();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                snapshotStateList = (SnapshotStateList) objRememberedValue;
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-1142853127);
                int i18 = i9 & 14;
                if (i18 == 4) {
                }
                sliderDefaults$Thumb$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z4) {
                    sliderDefaults$Thumb$1$1RememberedValue = new SliderDefaults$Thumb$1$1(mutableInteractionSource, snapshotStateList, null);
                    composerStartRestartGroup.updateRememberedValue(sliderDefaults$Thumb$1$1RememberedValue);
                } else {
                    sliderDefaults$Thumb$1$1RememberedValue = new SliderDefaults$Thumb$1$1(mutableInteractionSource, snapshotStateList, null);
                    composerStartRestartGroup.updateRememberedValue(sliderDefaults$Thumb$1$1RememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(mutableInteractionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) sliderDefaults$Thumb$1$1RememberedValue, composerStartRestartGroup, i18);
                if (!snapshotStateList.isEmpty()) {
                    fM6935constructorimpl = SliderKt.ThumbPressedElevation;
                } else {
                    fM6935constructorimpl = SliderKt.ThumbDefaultElevation;
                }
                Shape value7 = ShapesKt.getValue(SliderTokens.INSTANCE.getHandleShape(), composerStartRestartGroup, 6);
                long j11 = j3;
                Modifier modifierHoverable$default7 = HoverableKt.hoverable$default(IndicationKt.indication(SizeKt.m1048size6HolHcs(modifier2, j3), mutableInteractionSource, RippleKt.m1744rememberRipple9IZ8Weo(false, Dp.m6935constructorimpl(SliderTokens.INSTANCE.m3323getStateLayerSizeD9Ej5fM() / 2.0f), 0L, composerStartRestartGroup, 54, 4)), mutableInteractionSource, false, 2, null);
                if (!z3) {
                    fM6935constructorimpl = Dp.m6935constructorimpl(0.0f);
                }
                SpacerKt.Spacer(BackgroundKt.m556backgroundbw27NRU(ShadowKt.m3821shadows4CzXII$default(modifierHoverable$default7, fM6935constructorimpl, value7, false, 0L, 0L, 24, null), sliderColors2.m2392thumbColorvNxB06k$material3_release(z3), value7), composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z5 = z3;
                modifier3 = modifier2;
                sliderColors3 = sliderColors2;
                j4 = j11;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) == 0) {
                    if (i10 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i2 & 4) != 0) {
                        SliderColors sliderColorsColors12 = colors(composerStartRestartGroup, (i3 >> 15) & 14);
                        i3 &= -897;
                        sliderColors2 = sliderColorsColors12;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if (i6 != 0) {
                        j3 = SliderKt.ThumbSize;
                        i9 = i3;
                        z3 = z2;
                    } else {
                        i9 = i3;
                        z3 = z2;
                        j3 = j2;
                    }
                } else {
                    if (i10 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i2 & 4) != 0) {
                        SliderColors sliderColorsColors13 = colors(composerStartRestartGroup, (i3 >> 15) & 14);
                        i3 &= -897;
                        sliderColors2 = sliderColorsColors13;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if (i6 != 0) {
                        j3 = SliderKt.ThumbSize;
                        i9 = i3;
                        z3 = z2;
                    } else {
                        i9 = i3;
                        z3 = z2;
                        j3 = j2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-290277409, i9, -1, "androidx.compose.material3.SliderDefaults.Thumb (Slider.kt:985)");
                }
                composerStartRestartGroup.startReplaceableGroup(-1142853216);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotStateKt.mutableStateListOf();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                snapshotStateList = (SnapshotStateList) objRememberedValue;
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-1142853127);
                int i19 = i9 & 14;
                if (i19 == 4) {
                }
                sliderDefaults$Thumb$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z4) {
                    sliderDefaults$Thumb$1$1RememberedValue = new SliderDefaults$Thumb$1$1(mutableInteractionSource, snapshotStateList, null);
                    composerStartRestartGroup.updateRememberedValue(sliderDefaults$Thumb$1$1RememberedValue);
                } else {
                    sliderDefaults$Thumb$1$1RememberedValue = new SliderDefaults$Thumb$1$1(mutableInteractionSource, snapshotStateList, null);
                    composerStartRestartGroup.updateRememberedValue(sliderDefaults$Thumb$1$1RememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(mutableInteractionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) sliderDefaults$Thumb$1$1RememberedValue, composerStartRestartGroup, i19);
                if (!snapshotStateList.isEmpty()) {
                    fM6935constructorimpl = SliderKt.ThumbPressedElevation;
                } else {
                    fM6935constructorimpl = SliderKt.ThumbDefaultElevation;
                }
                Shape value8 = ShapesKt.getValue(SliderTokens.INSTANCE.getHandleShape(), composerStartRestartGroup, 6);
                long j12 = j3;
                Modifier modifierHoverable$default8 = HoverableKt.hoverable$default(IndicationKt.indication(SizeKt.m1048size6HolHcs(modifier2, j3), mutableInteractionSource, RippleKt.m1744rememberRipple9IZ8Weo(false, Dp.m6935constructorimpl(SliderTokens.INSTANCE.m3323getStateLayerSizeD9Ej5fM() / 2.0f), 0L, composerStartRestartGroup, 54, 4)), mutableInteractionSource, false, 2, null);
                if (!z3) {
                    fM6935constructorimpl = Dp.m6935constructorimpl(0.0f);
                }
                SpacerKt.Spacer(BackgroundKt.m556backgroundbw27NRU(ShadowKt.m3821shadows4CzXII$default(modifierHoverable$default8, fM6935constructorimpl, value8, false, 0L, 0L, 24, null), sliderColors2.m2392thumbColorvNxB06k$material3_release(z3), value8), composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z5 = z3;
                modifier3 = modifier2;
                sliderColors3 = sliderColors2;
                j4 = j12;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Thumb$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i110) {
                        this.$tmp2_rcvr.m2397Thumb9LiSoMs(mutableInteractionSource, modifier3, sliderColors3, z5, j4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                sliderColors2 = sliderColors;
                if (composerStartRestartGroup.changed(sliderColors2)) {
                }
                i3 |= i11;
            } else {
                sliderColors2 = sliderColors;
            }
            i3 |= i11;
        } else {
            sliderColors2 = sliderColors;
        }
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                z2 = z;
                if (composerStartRestartGroup.changed(z2)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    j2 = j;
                    if (composerStartRestartGroup.changed(j2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                if ((i2 & 32) != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    if (composerStartRestartGroup.changed(this)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i3 |= i8;
                }
                if ((i3 & 74899) == 74898) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) == 0) {
                        if (i10 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i2 & 4) != 0) {
                            SliderColors sliderColorsColors14 = colors(composerStartRestartGroup, (i3 >> 15) & 14);
                            i3 &= -897;
                            sliderColors2 = sliderColorsColors14;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if (i6 != 0) {
                            j3 = SliderKt.ThumbSize;
                            i9 = i3;
                            z3 = z2;
                        } else {
                            i9 = i3;
                            z3 = z2;
                            j3 = j2;
                        }
                    } else {
                        if (i10 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i2 & 4) != 0) {
                            SliderColors sliderColorsColors15 = colors(composerStartRestartGroup, (i3 >> 15) & 14);
                            i3 &= -897;
                            sliderColors2 = sliderColorsColors15;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if (i6 != 0) {
                            j3 = SliderKt.ThumbSize;
                            i9 = i3;
                            z3 = z2;
                        } else {
                            i9 = i3;
                            z3 = z2;
                            j3 = j2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-290277409, i9, -1, "androidx.compose.material3.SliderDefaults.Thumb (Slider.kt:985)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-1142853216);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = SnapshotStateKt.mutableStateListOf();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    snapshotStateList = (SnapshotStateList) objRememberedValue;
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-1142853127);
                    int i110 = i9 & 14;
                    if (i110 == 4) {
                    }
                    sliderDefaults$Thumb$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z4) {
                        sliderDefaults$Thumb$1$1RememberedValue = new SliderDefaults$Thumb$1$1(mutableInteractionSource, snapshotStateList, null);
                        composerStartRestartGroup.updateRememberedValue(sliderDefaults$Thumb$1$1RememberedValue);
                    } else {
                        sliderDefaults$Thumb$1$1RememberedValue = new SliderDefaults$Thumb$1$1(mutableInteractionSource, snapshotStateList, null);
                        composerStartRestartGroup.updateRememberedValue(sliderDefaults$Thumb$1$1RememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(mutableInteractionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) sliderDefaults$Thumb$1$1RememberedValue, composerStartRestartGroup, i110);
                    if (!snapshotStateList.isEmpty()) {
                        fM6935constructorimpl = SliderKt.ThumbPressedElevation;
                    } else {
                        fM6935constructorimpl = SliderKt.ThumbDefaultElevation;
                    }
                    Shape value9 = ShapesKt.getValue(SliderTokens.INSTANCE.getHandleShape(), composerStartRestartGroup, 6);
                    long j13 = j3;
                    Modifier modifierHoverable$default9 = HoverableKt.hoverable$default(IndicationKt.indication(SizeKt.m1048size6HolHcs(modifier2, j3), mutableInteractionSource, RippleKt.m1744rememberRipple9IZ8Weo(false, Dp.m6935constructorimpl(SliderTokens.INSTANCE.m3323getStateLayerSizeD9Ej5fM() / 2.0f), 0L, composerStartRestartGroup, 54, 4)), mutableInteractionSource, false, 2, null);
                    if (!z3) {
                        fM6935constructorimpl = Dp.m6935constructorimpl(0.0f);
                    }
                    SpacerKt.Spacer(BackgroundKt.m556backgroundbw27NRU(ShadowKt.m3821shadows4CzXII$default(modifierHoverable$default9, fM6935constructorimpl, value9, false, 0L, 0L, 24, null), sliderColors2.m2392thumbColorvNxB06k$material3_release(z3), value9), composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z5 = z3;
                    modifier3 = modifier2;
                    sliderColors3 = sliderColors2;
                    j4 = j13;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) == 0) {
                        if (i10 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i2 & 4) != 0) {
                            SliderColors sliderColorsColors16 = colors(composerStartRestartGroup, (i3 >> 15) & 14);
                            i3 &= -897;
                            sliderColors2 = sliderColorsColors16;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if (i6 != 0) {
                            j3 = SliderKt.ThumbSize;
                            i9 = i3;
                            z3 = z2;
                        } else {
                            i9 = i3;
                            z3 = z2;
                            j3 = j2;
                        }
                    } else {
                        if (i10 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i2 & 4) != 0) {
                            SliderColors sliderColorsColors17 = colors(composerStartRestartGroup, (i3 >> 15) & 14);
                            i3 &= -897;
                            sliderColors2 = sliderColorsColors17;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if (i6 != 0) {
                            j3 = SliderKt.ThumbSize;
                            i9 = i3;
                            z3 = z2;
                        } else {
                            i9 = i3;
                            z3 = z2;
                            j3 = j2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-290277409, i9, -1, "androidx.compose.material3.SliderDefaults.Thumb (Slider.kt:985)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-1142853216);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = SnapshotStateKt.mutableStateListOf();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    snapshotStateList = (SnapshotStateList) objRememberedValue;
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-1142853127);
                    int i111 = i9 & 14;
                    if (i111 == 4) {
                    }
                    sliderDefaults$Thumb$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z4) {
                        sliderDefaults$Thumb$1$1RememberedValue = new SliderDefaults$Thumb$1$1(mutableInteractionSource, snapshotStateList, null);
                        composerStartRestartGroup.updateRememberedValue(sliderDefaults$Thumb$1$1RememberedValue);
                    } else {
                        sliderDefaults$Thumb$1$1RememberedValue = new SliderDefaults$Thumb$1$1(mutableInteractionSource, snapshotStateList, null);
                        composerStartRestartGroup.updateRememberedValue(sliderDefaults$Thumb$1$1RememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(mutableInteractionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) sliderDefaults$Thumb$1$1RememberedValue, composerStartRestartGroup, i111);
                    if (!snapshotStateList.isEmpty()) {
                        fM6935constructorimpl = SliderKt.ThumbPressedElevation;
                    } else {
                        fM6935constructorimpl = SliderKt.ThumbDefaultElevation;
                    }
                    Shape value10 = ShapesKt.getValue(SliderTokens.INSTANCE.getHandleShape(), composerStartRestartGroup, 6);
                    long j14 = j3;
                    Modifier modifierHoverable$default10 = HoverableKt.hoverable$default(IndicationKt.indication(SizeKt.m1048size6HolHcs(modifier2, j3), mutableInteractionSource, RippleKt.m1744rememberRipple9IZ8Weo(false, Dp.m6935constructorimpl(SliderTokens.INSTANCE.m3323getStateLayerSizeD9Ej5fM() / 2.0f), 0L, composerStartRestartGroup, 54, 4)), mutableInteractionSource, false, 2, null);
                    if (!z3) {
                        fM6935constructorimpl = Dp.m6935constructorimpl(0.0f);
                    }
                    SpacerKt.Spacer(BackgroundKt.m556backgroundbw27NRU(ShadowKt.m3821shadows4CzXII$default(modifierHoverable$default10, fM6935constructorimpl, value10, false, 0L, 0L, 24, null), sliderColors2.m2392thumbColorvNxB06k$material3_release(z3), value10), composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z5 = z3;
                    modifier3 = modifier2;
                    sliderColors3 = sliderColors2;
                    j4 = j14;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Thumb$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i112) {
                            this.$tmp2_rcvr.m2397Thumb9LiSoMs(mutableInteractionSource, modifier3, sliderColors3, z5, j4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 24576;
            j2 = j;
            if ((i2 & 32) != 0) {
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                if (composerStartRestartGroup.changed(this)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i3 |= i8;
            }
            if ((i3 & 74899) == 74898) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) == 0) {
                    if (i10 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i2 & 4) != 0) {
                        SliderColors sliderColorsColors18 = colors(composerStartRestartGroup, (i3 >> 15) & 14);
                        i3 &= -897;
                        sliderColors2 = sliderColorsColors18;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if (i6 != 0) {
                        j3 = SliderKt.ThumbSize;
                        i9 = i3;
                        z3 = z2;
                    } else {
                        i9 = i3;
                        z3 = z2;
                        j3 = j2;
                    }
                } else {
                    if (i10 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i2 & 4) != 0) {
                        SliderColors sliderColorsColors19 = colors(composerStartRestartGroup, (i3 >> 15) & 14);
                        i3 &= -897;
                        sliderColors2 = sliderColorsColors19;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if (i6 != 0) {
                        j3 = SliderKt.ThumbSize;
                        i9 = i3;
                        z3 = z2;
                    } else {
                        i9 = i3;
                        z3 = z2;
                        j3 = j2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-290277409, i9, -1, "androidx.compose.material3.SliderDefaults.Thumb (Slider.kt:985)");
                }
                composerStartRestartGroup.startReplaceableGroup(-1142853216);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotStateKt.mutableStateListOf();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                snapshotStateList = (SnapshotStateList) objRememberedValue;
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-1142853127);
                int i112 = i9 & 14;
                if (i112 == 4) {
                }
                sliderDefaults$Thumb$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z4) {
                    sliderDefaults$Thumb$1$1RememberedValue = new SliderDefaults$Thumb$1$1(mutableInteractionSource, snapshotStateList, null);
                    composerStartRestartGroup.updateRememberedValue(sliderDefaults$Thumb$1$1RememberedValue);
                } else {
                    sliderDefaults$Thumb$1$1RememberedValue = new SliderDefaults$Thumb$1$1(mutableInteractionSource, snapshotStateList, null);
                    composerStartRestartGroup.updateRememberedValue(sliderDefaults$Thumb$1$1RememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(mutableInteractionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) sliderDefaults$Thumb$1$1RememberedValue, composerStartRestartGroup, i112);
                if (!snapshotStateList.isEmpty()) {
                    fM6935constructorimpl = SliderKt.ThumbPressedElevation;
                } else {
                    fM6935constructorimpl = SliderKt.ThumbDefaultElevation;
                }
                Shape value11 = ShapesKt.getValue(SliderTokens.INSTANCE.getHandleShape(), composerStartRestartGroup, 6);
                long j15 = j3;
                Modifier modifierHoverable$default11 = HoverableKt.hoverable$default(IndicationKt.indication(SizeKt.m1048size6HolHcs(modifier2, j3), mutableInteractionSource, RippleKt.m1744rememberRipple9IZ8Weo(false, Dp.m6935constructorimpl(SliderTokens.INSTANCE.m3323getStateLayerSizeD9Ej5fM() / 2.0f), 0L, composerStartRestartGroup, 54, 4)), mutableInteractionSource, false, 2, null);
                if (!z3) {
                    fM6935constructorimpl = Dp.m6935constructorimpl(0.0f);
                }
                SpacerKt.Spacer(BackgroundKt.m556backgroundbw27NRU(ShadowKt.m3821shadows4CzXII$default(modifierHoverable$default11, fM6935constructorimpl, value11, false, 0L, 0L, 24, null), sliderColors2.m2392thumbColorvNxB06k$material3_release(z3), value11), composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z5 = z3;
                modifier3 = modifier2;
                sliderColors3 = sliderColors2;
                j4 = j15;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) == 0) {
                    if (i10 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i2 & 4) != 0) {
                        SliderColors sliderColorsColors110 = colors(composerStartRestartGroup, (i3 >> 15) & 14);
                        i3 &= -897;
                        sliderColors2 = sliderColorsColors110;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if (i6 != 0) {
                        j3 = SliderKt.ThumbSize;
                        i9 = i3;
                        z3 = z2;
                    } else {
                        i9 = i3;
                        z3 = z2;
                        j3 = j2;
                    }
                } else {
                    if (i10 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i2 & 4) != 0) {
                        SliderColors sliderColorsColors111 = colors(composerStartRestartGroup, (i3 >> 15) & 14);
                        i3 &= -897;
                        sliderColors2 = sliderColorsColors111;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if (i6 != 0) {
                        j3 = SliderKt.ThumbSize;
                        i9 = i3;
                        z3 = z2;
                    } else {
                        i9 = i3;
                        z3 = z2;
                        j3 = j2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-290277409, i9, -1, "androidx.compose.material3.SliderDefaults.Thumb (Slider.kt:985)");
                }
                composerStartRestartGroup.startReplaceableGroup(-1142853216);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotStateKt.mutableStateListOf();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                snapshotStateList = (SnapshotStateList) objRememberedValue;
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-1142853127);
                int i113 = i9 & 14;
                if (i113 == 4) {
                }
                sliderDefaults$Thumb$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z4) {
                    sliderDefaults$Thumb$1$1RememberedValue = new SliderDefaults$Thumb$1$1(mutableInteractionSource, snapshotStateList, null);
                    composerStartRestartGroup.updateRememberedValue(sliderDefaults$Thumb$1$1RememberedValue);
                } else {
                    sliderDefaults$Thumb$1$1RememberedValue = new SliderDefaults$Thumb$1$1(mutableInteractionSource, snapshotStateList, null);
                    composerStartRestartGroup.updateRememberedValue(sliderDefaults$Thumb$1$1RememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(mutableInteractionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) sliderDefaults$Thumb$1$1RememberedValue, composerStartRestartGroup, i113);
                if (!snapshotStateList.isEmpty()) {
                    fM6935constructorimpl = SliderKt.ThumbPressedElevation;
                } else {
                    fM6935constructorimpl = SliderKt.ThumbDefaultElevation;
                }
                Shape value12 = ShapesKt.getValue(SliderTokens.INSTANCE.getHandleShape(), composerStartRestartGroup, 6);
                long j16 = j3;
                Modifier modifierHoverable$default12 = HoverableKt.hoverable$default(IndicationKt.indication(SizeKt.m1048size6HolHcs(modifier2, j3), mutableInteractionSource, RippleKt.m1744rememberRipple9IZ8Weo(false, Dp.m6935constructorimpl(SliderTokens.INSTANCE.m3323getStateLayerSizeD9Ej5fM() / 2.0f), 0L, composerStartRestartGroup, 54, 4)), mutableInteractionSource, false, 2, null);
                if (!z3) {
                    fM6935constructorimpl = Dp.m6935constructorimpl(0.0f);
                }
                SpacerKt.Spacer(BackgroundKt.m556backgroundbw27NRU(ShadowKt.m3821shadows4CzXII$default(modifierHoverable$default12, fM6935constructorimpl, value12, false, 0L, 0L, 24, null), sliderColors2.m2392thumbColorvNxB06k$material3_release(z3), value12), composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z5 = z3;
                modifier3 = modifier2;
                sliderColors3 = sliderColors2;
                j4 = j16;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Thumb$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i114) {
                        this.$tmp2_rcvr.m2397Thumb9LiSoMs(mutableInteractionSource, modifier3, sliderColors3, z5, j4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 3072;
        z2 = z;
        i6 = i2 & 16;
        if (i6 != 0) {
            if ((i & 24576) == 0) {
                j2 = j;
                if (composerStartRestartGroup.changed(j2)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            if ((i2 & 32) != 0) {
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                if (composerStartRestartGroup.changed(this)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i3 |= i8;
            }
            if ((i3 & 74899) == 74898) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) == 0) {
                    if (i10 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i2 & 4) != 0) {
                        SliderColors sliderColorsColors112 = colors(composerStartRestartGroup, (i3 >> 15) & 14);
                        i3 &= -897;
                        sliderColors2 = sliderColorsColors112;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if (i6 != 0) {
                        j3 = SliderKt.ThumbSize;
                        i9 = i3;
                        z3 = z2;
                    } else {
                        i9 = i3;
                        z3 = z2;
                        j3 = j2;
                    }
                } else {
                    if (i10 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i2 & 4) != 0) {
                        SliderColors sliderColorsColors113 = colors(composerStartRestartGroup, (i3 >> 15) & 14);
                        i3 &= -897;
                        sliderColors2 = sliderColorsColors113;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if (i6 != 0) {
                        j3 = SliderKt.ThumbSize;
                        i9 = i3;
                        z3 = z2;
                    } else {
                        i9 = i3;
                        z3 = z2;
                        j3 = j2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-290277409, i9, -1, "androidx.compose.material3.SliderDefaults.Thumb (Slider.kt:985)");
                }
                composerStartRestartGroup.startReplaceableGroup(-1142853216);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotStateKt.mutableStateListOf();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                snapshotStateList = (SnapshotStateList) objRememberedValue;
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-1142853127);
                int i114 = i9 & 14;
                if (i114 == 4) {
                }
                sliderDefaults$Thumb$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z4) {
                    sliderDefaults$Thumb$1$1RememberedValue = new SliderDefaults$Thumb$1$1(mutableInteractionSource, snapshotStateList, null);
                    composerStartRestartGroup.updateRememberedValue(sliderDefaults$Thumb$1$1RememberedValue);
                } else {
                    sliderDefaults$Thumb$1$1RememberedValue = new SliderDefaults$Thumb$1$1(mutableInteractionSource, snapshotStateList, null);
                    composerStartRestartGroup.updateRememberedValue(sliderDefaults$Thumb$1$1RememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(mutableInteractionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) sliderDefaults$Thumb$1$1RememberedValue, composerStartRestartGroup, i114);
                if (!snapshotStateList.isEmpty()) {
                    fM6935constructorimpl = SliderKt.ThumbPressedElevation;
                } else {
                    fM6935constructorimpl = SliderKt.ThumbDefaultElevation;
                }
                Shape value13 = ShapesKt.getValue(SliderTokens.INSTANCE.getHandleShape(), composerStartRestartGroup, 6);
                long j17 = j3;
                Modifier modifierHoverable$default13 = HoverableKt.hoverable$default(IndicationKt.indication(SizeKt.m1048size6HolHcs(modifier2, j3), mutableInteractionSource, RippleKt.m1744rememberRipple9IZ8Weo(false, Dp.m6935constructorimpl(SliderTokens.INSTANCE.m3323getStateLayerSizeD9Ej5fM() / 2.0f), 0L, composerStartRestartGroup, 54, 4)), mutableInteractionSource, false, 2, null);
                if (!z3) {
                    fM6935constructorimpl = Dp.m6935constructorimpl(0.0f);
                }
                SpacerKt.Spacer(BackgroundKt.m556backgroundbw27NRU(ShadowKt.m3821shadows4CzXII$default(modifierHoverable$default13, fM6935constructorimpl, value13, false, 0L, 0L, 24, null), sliderColors2.m2392thumbColorvNxB06k$material3_release(z3), value13), composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z5 = z3;
                modifier3 = modifier2;
                sliderColors3 = sliderColors2;
                j4 = j17;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) == 0) {
                    if (i10 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i2 & 4) != 0) {
                        SliderColors sliderColorsColors114 = colors(composerStartRestartGroup, (i3 >> 15) & 14);
                        i3 &= -897;
                        sliderColors2 = sliderColorsColors114;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if (i6 != 0) {
                        j3 = SliderKt.ThumbSize;
                        i9 = i3;
                        z3 = z2;
                    } else {
                        i9 = i3;
                        z3 = z2;
                        j3 = j2;
                    }
                } else {
                    if (i10 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i2 & 4) != 0) {
                        SliderColors sliderColorsColors115 = colors(composerStartRestartGroup, (i3 >> 15) & 14);
                        i3 &= -897;
                        sliderColors2 = sliderColorsColors115;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if (i6 != 0) {
                        j3 = SliderKt.ThumbSize;
                        i9 = i3;
                        z3 = z2;
                    } else {
                        i9 = i3;
                        z3 = z2;
                        j3 = j2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-290277409, i9, -1, "androidx.compose.material3.SliderDefaults.Thumb (Slider.kt:985)");
                }
                composerStartRestartGroup.startReplaceableGroup(-1142853216);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotStateKt.mutableStateListOf();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                snapshotStateList = (SnapshotStateList) objRememberedValue;
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-1142853127);
                int i115 = i9 & 14;
                if (i115 == 4) {
                }
                sliderDefaults$Thumb$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z4) {
                    sliderDefaults$Thumb$1$1RememberedValue = new SliderDefaults$Thumb$1$1(mutableInteractionSource, snapshotStateList, null);
                    composerStartRestartGroup.updateRememberedValue(sliderDefaults$Thumb$1$1RememberedValue);
                } else {
                    sliderDefaults$Thumb$1$1RememberedValue = new SliderDefaults$Thumb$1$1(mutableInteractionSource, snapshotStateList, null);
                    composerStartRestartGroup.updateRememberedValue(sliderDefaults$Thumb$1$1RememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(mutableInteractionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) sliderDefaults$Thumb$1$1RememberedValue, composerStartRestartGroup, i115);
                if (!snapshotStateList.isEmpty()) {
                    fM6935constructorimpl = SliderKt.ThumbPressedElevation;
                } else {
                    fM6935constructorimpl = SliderKt.ThumbDefaultElevation;
                }
                Shape value14 = ShapesKt.getValue(SliderTokens.INSTANCE.getHandleShape(), composerStartRestartGroup, 6);
                long j18 = j3;
                Modifier modifierHoverable$default14 = HoverableKt.hoverable$default(IndicationKt.indication(SizeKt.m1048size6HolHcs(modifier2, j3), mutableInteractionSource, RippleKt.m1744rememberRipple9IZ8Weo(false, Dp.m6935constructorimpl(SliderTokens.INSTANCE.m3323getStateLayerSizeD9Ej5fM() / 2.0f), 0L, composerStartRestartGroup, 54, 4)), mutableInteractionSource, false, 2, null);
                if (!z3) {
                    fM6935constructorimpl = Dp.m6935constructorimpl(0.0f);
                }
                SpacerKt.Spacer(BackgroundKt.m556backgroundbw27NRU(ShadowKt.m3821shadows4CzXII$default(modifierHoverable$default14, fM6935constructorimpl, value14, false, 0L, 0L, 24, null), sliderColors2.m2392thumbColorvNxB06k$material3_release(z3), value14), composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z5 = z3;
                modifier3 = modifier2;
                sliderColors3 = sliderColors2;
                j4 = j18;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Thumb$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i116) {
                        this.$tmp2_rcvr.m2397Thumb9LiSoMs(mutableInteractionSource, modifier3, sliderColors3, z5, j4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 24576;
        j2 = j;
        if ((i2 & 32) != 0) {
            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            if (composerStartRestartGroup.changed(this)) {
                i8 = 131072;
            } else {
                i8 = 65536;
            }
            i3 |= i8;
        }
        if ((i3 & 74899) == 74898) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0) {
                if (i10 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if ((i2 & 4) != 0) {
                    SliderColors sliderColorsColors116 = colors(composerStartRestartGroup, (i3 >> 15) & 14);
                    i3 &= -897;
                    sliderColors2 = sliderColorsColors116;
                }
                if (i4 != 0) {
                    z2 = true;
                }
                if (i6 != 0) {
                    j3 = SliderKt.ThumbSize;
                    i9 = i3;
                    z3 = z2;
                } else {
                    i9 = i3;
                    z3 = z2;
                    j3 = j2;
                }
            } else {
                if (i10 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if ((i2 & 4) != 0) {
                    SliderColors sliderColorsColors117 = colors(composerStartRestartGroup, (i3 >> 15) & 14);
                    i3 &= -897;
                    sliderColors2 = sliderColorsColors117;
                }
                if (i4 != 0) {
                    z2 = true;
                }
                if (i6 != 0) {
                    j3 = SliderKt.ThumbSize;
                    i9 = i3;
                    z3 = z2;
                } else {
                    i9 = i3;
                    z3 = z2;
                    j3 = j2;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-290277409, i9, -1, "androidx.compose.material3.SliderDefaults.Thumb (Slider.kt:985)");
            }
            composerStartRestartGroup.startReplaceableGroup(-1142853216);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt.mutableStateListOf();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            snapshotStateList = (SnapshotStateList) objRememberedValue;
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(-1142853127);
            int i116 = i9 & 14;
            if (i116 == 4) {
            }
            sliderDefaults$Thumb$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (!z4) {
                sliderDefaults$Thumb$1$1RememberedValue = new SliderDefaults$Thumb$1$1(mutableInteractionSource, snapshotStateList, null);
                composerStartRestartGroup.updateRememberedValue(sliderDefaults$Thumb$1$1RememberedValue);
            } else {
                sliderDefaults$Thumb$1$1RememberedValue = new SliderDefaults$Thumb$1$1(mutableInteractionSource, snapshotStateList, null);
                composerStartRestartGroup.updateRememberedValue(sliderDefaults$Thumb$1$1RememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(mutableInteractionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) sliderDefaults$Thumb$1$1RememberedValue, composerStartRestartGroup, i116);
            if (!snapshotStateList.isEmpty()) {
                fM6935constructorimpl = SliderKt.ThumbPressedElevation;
            } else {
                fM6935constructorimpl = SliderKt.ThumbDefaultElevation;
            }
            Shape value15 = ShapesKt.getValue(SliderTokens.INSTANCE.getHandleShape(), composerStartRestartGroup, 6);
            long j19 = j3;
            Modifier modifierHoverable$default15 = HoverableKt.hoverable$default(IndicationKt.indication(SizeKt.m1048size6HolHcs(modifier2, j3), mutableInteractionSource, RippleKt.m1744rememberRipple9IZ8Weo(false, Dp.m6935constructorimpl(SliderTokens.INSTANCE.m3323getStateLayerSizeD9Ej5fM() / 2.0f), 0L, composerStartRestartGroup, 54, 4)), mutableInteractionSource, false, 2, null);
            if (!z3) {
                fM6935constructorimpl = Dp.m6935constructorimpl(0.0f);
            }
            SpacerKt.Spacer(BackgroundKt.m556backgroundbw27NRU(ShadowKt.m3821shadows4CzXII$default(modifierHoverable$default15, fM6935constructorimpl, value15, false, 0L, 0L, 24, null), sliderColors2.m2392thumbColorvNxB06k$material3_release(z3), value15), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z5 = z3;
            modifier3 = modifier2;
            sliderColors3 = sliderColors2;
            j4 = j19;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0) {
                if (i10 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if ((i2 & 4) != 0) {
                    SliderColors sliderColorsColors118 = colors(composerStartRestartGroup, (i3 >> 15) & 14);
                    i3 &= -897;
                    sliderColors2 = sliderColorsColors118;
                }
                if (i4 != 0) {
                    z2 = true;
                }
                if (i6 != 0) {
                    j3 = SliderKt.ThumbSize;
                    i9 = i3;
                    z3 = z2;
                } else {
                    i9 = i3;
                    z3 = z2;
                    j3 = j2;
                }
            } else {
                if (i10 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if ((i2 & 4) != 0) {
                    SliderColors sliderColorsColors119 = colors(composerStartRestartGroup, (i3 >> 15) & 14);
                    i3 &= -897;
                    sliderColors2 = sliderColorsColors119;
                }
                if (i4 != 0) {
                    z2 = true;
                }
                if (i6 != 0) {
                    j3 = SliderKt.ThumbSize;
                    i9 = i3;
                    z3 = z2;
                } else {
                    i9 = i3;
                    z3 = z2;
                    j3 = j2;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-290277409, i9, -1, "androidx.compose.material3.SliderDefaults.Thumb (Slider.kt:985)");
            }
            composerStartRestartGroup.startReplaceableGroup(-1142853216);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt.mutableStateListOf();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            snapshotStateList = (SnapshotStateList) objRememberedValue;
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(-1142853127);
            int i117 = i9 & 14;
            if (i117 == 4) {
            }
            sliderDefaults$Thumb$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (!z4) {
                sliderDefaults$Thumb$1$1RememberedValue = new SliderDefaults$Thumb$1$1(mutableInteractionSource, snapshotStateList, null);
                composerStartRestartGroup.updateRememberedValue(sliderDefaults$Thumb$1$1RememberedValue);
            } else {
                sliderDefaults$Thumb$1$1RememberedValue = new SliderDefaults$Thumb$1$1(mutableInteractionSource, snapshotStateList, null);
                composerStartRestartGroup.updateRememberedValue(sliderDefaults$Thumb$1$1RememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(mutableInteractionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) sliderDefaults$Thumb$1$1RememberedValue, composerStartRestartGroup, i117);
            if (!snapshotStateList.isEmpty()) {
                fM6935constructorimpl = SliderKt.ThumbPressedElevation;
            } else {
                fM6935constructorimpl = SliderKt.ThumbDefaultElevation;
            }
            Shape value16 = ShapesKt.getValue(SliderTokens.INSTANCE.getHandleShape(), composerStartRestartGroup, 6);
            long j110 = j3;
            Modifier modifierHoverable$default16 = HoverableKt.hoverable$default(IndicationKt.indication(SizeKt.m1048size6HolHcs(modifier2, j3), mutableInteractionSource, RippleKt.m1744rememberRipple9IZ8Weo(false, Dp.m6935constructorimpl(SliderTokens.INSTANCE.m3323getStateLayerSizeD9Ej5fM() / 2.0f), 0L, composerStartRestartGroup, 54, 4)), mutableInteractionSource, false, 2, null);
            if (!z3) {
                fM6935constructorimpl = Dp.m6935constructorimpl(0.0f);
            }
            SpacerKt.Spacer(BackgroundKt.m556backgroundbw27NRU(ShadowKt.m3821shadows4CzXII$default(modifierHoverable$default16, fM6935constructorimpl, value16, false, 0L, 0L, 24, null), sliderColors2.m2392thumbColorvNxB06k$material3_release(z3), value16), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z5 = z3;
            modifier3 = modifier2;
            sliderColors3 = sliderColors2;
            j4 = j110;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Thumb$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i118) {
                    this.$tmp2_rcvr.m2397Thumb9LiSoMs(mutableInteractionSource, modifier3, sliderColors3, z5, j4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:31:0x005a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:40:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082  */
    /* JADX WARN: Code duplicated, block: B:49:0x0085  */
    /* JADX WARN: Code duplicated, block: B:51:0x0089  */
    /* JADX WARN: Code duplicated, block: B:53:0x008f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0092  */
    /* JADX WARN: Code duplicated, block: B:58:0x009b  */
    /* JADX WARN: Code duplicated, block: B:61:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:76:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:77:0x00de A[PHI: r4 r5 r9
  0x00de: PHI (r4v20 int) = (r4v14 int), (r4v21 int) binds: [B:75:0x00da, B:68:0x00c1] A[DONT_GENERATE, DONT_INLINE]
  0x00de: PHI (r5v7 androidx.compose.ui.Modifier) = (r5v2 androidx.compose.ui.Modifier), (r5v9 androidx.compose.ui.Modifier) binds: [B:75:0x00da, B:68:0x00c1] A[DONT_GENERATE, DONT_INLINE]
  0x00de: PHI (r9v19 androidx.compose.material3.SliderColors) = (r9v7 androidx.compose.material3.SliderColors), (r9v6 androidx.compose.material3.SliderColors) binds: [B:75:0x00da, B:68:0x00c1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:80:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:83:0x0127  */
    /* JADX WARN: Code duplicated, block: B:84:0x0129  */
    /* JADX WARN: Code duplicated, block: B:87:0x014a  */
    /* JADX WARN: Code duplicated, block: B:89:0x0152  */
    /* JADX WARN: Code duplicated, block: B:92:0x0172  */
    /* JADX WARN: Code duplicated, block: B:96:0x0180  */
    /* JADX WARN: Code duplicated, block: B:98:? A[RETURN, SYNTHETIC] */
    @Deprecated(message = "Use version that supports slider state")
    public final void Track(final SliderPositions sliderPositions, Modifier modifier, SliderColors sliderColors, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        SliderColors sliderColors2;
        int i4;
        boolean z2;
        int i5;
        int i6;
        Modifier.Companion companion;
        boolean z3;
        int i7;
        final long jM2394trackColorWaAFU9c$material3_release;
        final long jM2394trackColorWaAFU9c$material3_release2;
        final long jM2393tickColorWaAFU9c$material3_release;
        final long jM2393tickColorWaAFU9c$material3_release2;
        Composer composer2;
        boolean zChanged;
        boolean z4;
        boolean zChanged2;
        boolean zChanged3;
        boolean zChanged4;
        Object objRememberedValue;
        final Modifier modifier3;
        final SliderColors sliderColors3;
        final boolean z5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1546713545);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(sliderPositions) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                if ((i2 & 4) == 0) {
                    sliderColors2 = sliderColors;
                    int i9 = composerStartRestartGroup.changed(sliderColors2) ? 256 : 128;
                    i3 |= i9;
                } else {
                    sliderColors2 = sliderColors;
                }
                i3 |= i9;
            } else {
                sliderColors2 = sliderColors;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    z2 = z;
                    if (composerStartRestartGroup.changed(z2)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    if (composerStartRestartGroup.changed(this)) {
                        i6 = 16384;
                    } else {
                        i6 = 8192;
                    }
                    i3 |= i6;
                }
                if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i8 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier2;
                        }
                        if ((i2 & 4) != 0) {
                            SliderColors sliderColorsColors = colors(composerStartRestartGroup, (i3 >> 12) & 14);
                            i3 &= -897;
                            sliderColors2 = sliderColorsColors;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        SliderColors sliderColors4 = sliderColors2;
                        i7 = i3;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1546713545, i7, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1044)");
                        }
                        jM2394trackColorWaAFU9c$material3_release = sliderColors4.m2394trackColorWaAFU9c$material3_release(z3, false);
                        jM2394trackColorWaAFU9c$material3_release2 = sliderColors4.m2394trackColorWaAFU9c$material3_release(z3, true);
                        jM2393tickColorWaAFU9c$material3_release = sliderColors4.m2393tickColorWaAFU9c$material3_release(z3, false);
                        jM2393tickColorWaAFU9c$material3_release2 = sliderColors4.m2393tickColorWaAFU9c$material3_release(z3, true);
                        Modifier modifierM1033height3ABfNKs = SizeKt.m1033height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), SliderKt.getTrackHeight());
                        composer2 = composerStartRestartGroup;
                        composer2.startReplaceableGroup(-1134220194);
                        zChanged = composer2.changed(jM2394trackColorWaAFU9c$material3_release);
                        if ((i7 & 14) == 4) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        Modifier modifier4 = companion;
                        zChanged2 = composer2.changed(jM2394trackColorWaAFU9c$material3_release2);
                        zChanged3 = composer2.changed(jM2393tickColorWaAFU9c$material3_release);
                        zChanged4 = composer2.changed(jM2393tickColorWaAFU9c$material3_release2);
                        objRememberedValue = composer2.rememberedValue();
                        if (!(zChanged2 | zChanged | z4 | zChanged3 | zChanged4) || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$1$1
                                @Override // kotlin.jvm.functions.Function1
                                public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                    invoke2(drawScope);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(DrawScope drawScope) {
                                    boolean z6 = drawScope.getLayoutDirection() == LayoutDirection.Rtl;
                                    long jOffset = OffsetKt.Offset(0.0f, Offset.m3975getYimpl(drawScope.mo4797getCenterF1C5BW0()));
                                    long jOffset2 = OffsetKt.Offset(Size.m4043getWidthimpl(drawScope.mo4798getSizeNHjbRc()), Offset.m3975getYimpl(drawScope.mo4797getCenterF1C5BW0()));
                                    long j = z6 ? jOffset2 : jOffset;
                                    long j2 = !z6 ? jOffset2 : jOffset;
                                    float f = drawScope.mo694toPx0680j_4(SliderKt.TickSize);
                                    float f2 = drawScope.mo694toPx0680j_4(SliderKt.getTrackHeight());
                                    long j3 = j2;
                                    long j4 = j;
                                    DrawScope.m4784drawLineNGM6Ib0$default(drawScope, jM2394trackColorWaAFU9c$material3_release, j, j2, f2, StrokeCap.INSTANCE.m4590getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                                    DrawScope.m4784drawLineNGM6Ib0$default(drawScope, jM2394trackColorWaAFU9c$material3_release2, OffsetKt.Offset(Offset.m3974getXimpl(j4) + ((Offset.m3974getXimpl(j3) - Offset.m3974getXimpl(j4)) * sliderPositions.getActiveRange().getStart().floatValue()), Offset.m3975getYimpl(drawScope.mo4797getCenterF1C5BW0())), OffsetKt.Offset(Offset.m3974getXimpl(j4) + ((Offset.m3974getXimpl(j3) - Offset.m3974getXimpl(j4)) * sliderPositions.getActiveRange().getEndInclusive().floatValue()), Offset.m3975getYimpl(drawScope.mo4797getCenterF1C5BW0())), f2, StrokeCap.INSTANCE.m4590getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                                    float[] tickFractions = sliderPositions.getTickFractions();
                                    SliderPositions sliderPositions2 = sliderPositions;
                                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                                    int length = tickFractions.length;
                                    for (int i10 = 0; i10 < length; i10++) {
                                        float f3 = tickFractions[i10];
                                        Boolean boolValueOf = Boolean.valueOf(f3 > sliderPositions2.getActiveRange().getEndInclusive().floatValue() || f3 < sliderPositions2.getActiveRange().getStart().floatValue());
                                        Object obj = linkedHashMap.get(boolValueOf);
                                        if (obj == null) {
                                            obj = (List) new ArrayList();
                                            linkedHashMap.put(boolValueOf, obj);
                                        }
                                        ((List) obj).add(Float.valueOf(f3));
                                    }
                                    long j5 = jM2393tickColorWaAFU9c$material3_release;
                                    long j6 = jM2393tickColorWaAFU9c$material3_release2;
                                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                                        boolean zBooleanValue = ((Boolean) entry.getKey()).booleanValue();
                                        List list = (List) entry.getValue();
                                        ArrayList arrayList = new ArrayList(list.size());
                                        int size = list.size();
                                        int i11 = 0;
                                        while (i11 < size) {
                                            long j7 = j4;
                                            arrayList.add(Offset.m3963boximpl(OffsetKt.Offset(Offset.m3974getXimpl(OffsetKt.m3997lerpWko1d7g(j7, j3, ((Number) list.get(i11)).floatValue())), Offset.m3975getYimpl(drawScope.mo4797getCenterF1C5BW0()))));
                                            i11++;
                                            j4 = j7;
                                        }
                                        long j8 = j4;
                                        long j9 = j3;
                                        DrawScope.m4789drawPointsF8ZwMP8$default(drawScope, arrayList, PointMode.INSTANCE.m4537getPointsr_lszbg(), zBooleanValue ? j5 : j6, f, StrokeCap.INSTANCE.m4590getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                                        j6 = j6;
                                        j4 = j8;
                                        j3 = j9;
                                    }
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        composer2.endReplaceableGroup();
                        CanvasKt.Canvas(modifierM1033height3ABfNKs, (Function1) objRememberedValue, composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                        sliderColors3 = sliderColors4;
                        z5 = z3;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        companion = modifier2;
                    }
                    z3 = z2;
                    SliderColors sliderColors5 = sliderColors2;
                    i7 = i3;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1546713545, i7, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1044)");
                    }
                    jM2394trackColorWaAFU9c$material3_release = sliderColors5.m2394trackColorWaAFU9c$material3_release(z3, false);
                    jM2394trackColorWaAFU9c$material3_release2 = sliderColors5.m2394trackColorWaAFU9c$material3_release(z3, true);
                    jM2393tickColorWaAFU9c$material3_release = sliderColors5.m2393tickColorWaAFU9c$material3_release(z3, false);
                    jM2393tickColorWaAFU9c$material3_release2 = sliderColors5.m2393tickColorWaAFU9c$material3_release(z3, true);
                    Modifier modifierM1033height3ABfNKs2 = SizeKt.m1033height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), SliderKt.getTrackHeight());
                    composer2 = composerStartRestartGroup;
                    composer2.startReplaceableGroup(-1134220194);
                    zChanged = composer2.changed(jM2394trackColorWaAFU9c$material3_release);
                    if ((i7 & 14) == 4) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    Modifier modifier5 = companion;
                    zChanged2 = composer2.changed(jM2394trackColorWaAFU9c$material3_release2);
                    zChanged3 = composer2.changed(jM2393tickColorWaAFU9c$material3_release);
                    zChanged4 = composer2.changed(jM2393tickColorWaAFU9c$material3_release2);
                    objRememberedValue = composer2.rememberedValue();
                    if (!(zChanged2 | zChanged | z4 | zChanged3 | zChanged4)) {
                        objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$1$1
                            @Override // kotlin.jvm.functions.Function1
                            public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                invoke2(drawScope);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(DrawScope drawScope) {
                                boolean z6 = drawScope.getLayoutDirection() == LayoutDirection.Rtl;
                                long jOffset = OffsetKt.Offset(0.0f, Offset.m3975getYimpl(drawScope.mo4797getCenterF1C5BW0()));
                                long jOffset2 = OffsetKt.Offset(Size.m4043getWidthimpl(drawScope.mo4798getSizeNHjbRc()), Offset.m3975getYimpl(drawScope.mo4797getCenterF1C5BW0()));
                                long j = z6 ? jOffset2 : jOffset;
                                long j2 = !z6 ? jOffset2 : jOffset;
                                float f = drawScope.mo694toPx0680j_4(SliderKt.TickSize);
                                float f2 = drawScope.mo694toPx0680j_4(SliderKt.getTrackHeight());
                                long j3 = j2;
                                long j4 = j;
                                DrawScope.m4784drawLineNGM6Ib0$default(drawScope, jM2394trackColorWaAFU9c$material3_release, j, j2, f2, StrokeCap.INSTANCE.m4590getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                                DrawScope.m4784drawLineNGM6Ib0$default(drawScope, jM2394trackColorWaAFU9c$material3_release2, OffsetKt.Offset(Offset.m3974getXimpl(j4) + ((Offset.m3974getXimpl(j3) - Offset.m3974getXimpl(j4)) * sliderPositions.getActiveRange().getStart().floatValue()), Offset.m3975getYimpl(drawScope.mo4797getCenterF1C5BW0())), OffsetKt.Offset(Offset.m3974getXimpl(j4) + ((Offset.m3974getXimpl(j3) - Offset.m3974getXimpl(j4)) * sliderPositions.getActiveRange().getEndInclusive().floatValue()), Offset.m3975getYimpl(drawScope.mo4797getCenterF1C5BW0())), f2, StrokeCap.INSTANCE.m4590getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                                float[] tickFractions = sliderPositions.getTickFractions();
                                SliderPositions sliderPositions2 = sliderPositions;
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                int length = tickFractions.length;
                                for (int i10 = 0; i10 < length; i10++) {
                                    float f3 = tickFractions[i10];
                                    Boolean boolValueOf = Boolean.valueOf(f3 > sliderPositions2.getActiveRange().getEndInclusive().floatValue() || f3 < sliderPositions2.getActiveRange().getStart().floatValue());
                                    Object obj = linkedHashMap.get(boolValueOf);
                                    if (obj == null) {
                                        obj = (List) new ArrayList();
                                        linkedHashMap.put(boolValueOf, obj);
                                    }
                                    ((List) obj).add(Float.valueOf(f3));
                                }
                                long j5 = jM2393tickColorWaAFU9c$material3_release;
                                long j6 = jM2393tickColorWaAFU9c$material3_release2;
                                for (Map.Entry entry : linkedHashMap.entrySet()) {
                                    boolean zBooleanValue = ((Boolean) entry.getKey()).booleanValue();
                                    List list = (List) entry.getValue();
                                    ArrayList arrayList = new ArrayList(list.size());
                                    int size = list.size();
                                    int i11 = 0;
                                    while (i11 < size) {
                                        long j7 = j4;
                                        arrayList.add(Offset.m3963boximpl(OffsetKt.Offset(Offset.m3974getXimpl(OffsetKt.m3997lerpWko1d7g(j7, j3, ((Number) list.get(i11)).floatValue())), Offset.m3975getYimpl(drawScope.mo4797getCenterF1C5BW0()))));
                                        i11++;
                                        j4 = j7;
                                    }
                                    long j8 = j4;
                                    long j9 = j3;
                                    DrawScope.m4789drawPointsF8ZwMP8$default(drawScope, arrayList, PointMode.INSTANCE.m4537getPointsr_lszbg(), zBooleanValue ? j5 : j6, f, StrokeCap.INSTANCE.m4590getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                                    j6 = j6;
                                    j4 = j8;
                                    j3 = j9;
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$1$1
                            @Override // kotlin.jvm.functions.Function1
                            public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                invoke2(drawScope);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(DrawScope drawScope) {
                                boolean z6 = drawScope.getLayoutDirection() == LayoutDirection.Rtl;
                                long jOffset = OffsetKt.Offset(0.0f, Offset.m3975getYimpl(drawScope.mo4797getCenterF1C5BW0()));
                                long jOffset2 = OffsetKt.Offset(Size.m4043getWidthimpl(drawScope.mo4798getSizeNHjbRc()), Offset.m3975getYimpl(drawScope.mo4797getCenterF1C5BW0()));
                                long j = z6 ? jOffset2 : jOffset;
                                long j2 = !z6 ? jOffset2 : jOffset;
                                float f = drawScope.mo694toPx0680j_4(SliderKt.TickSize);
                                float f2 = drawScope.mo694toPx0680j_4(SliderKt.getTrackHeight());
                                long j3 = j2;
                                long j4 = j;
                                DrawScope.m4784drawLineNGM6Ib0$default(drawScope, jM2394trackColorWaAFU9c$material3_release, j, j2, f2, StrokeCap.INSTANCE.m4590getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                                DrawScope.m4784drawLineNGM6Ib0$default(drawScope, jM2394trackColorWaAFU9c$material3_release2, OffsetKt.Offset(Offset.m3974getXimpl(j4) + ((Offset.m3974getXimpl(j3) - Offset.m3974getXimpl(j4)) * sliderPositions.getActiveRange().getStart().floatValue()), Offset.m3975getYimpl(drawScope.mo4797getCenterF1C5BW0())), OffsetKt.Offset(Offset.m3974getXimpl(j4) + ((Offset.m3974getXimpl(j3) - Offset.m3974getXimpl(j4)) * sliderPositions.getActiveRange().getEndInclusive().floatValue()), Offset.m3975getYimpl(drawScope.mo4797getCenterF1C5BW0())), f2, StrokeCap.INSTANCE.m4590getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                                float[] tickFractions = sliderPositions.getTickFractions();
                                SliderPositions sliderPositions2 = sliderPositions;
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                int length = tickFractions.length;
                                for (int i10 = 0; i10 < length; i10++) {
                                    float f3 = tickFractions[i10];
                                    Boolean boolValueOf = Boolean.valueOf(f3 > sliderPositions2.getActiveRange().getEndInclusive().floatValue() || f3 < sliderPositions2.getActiveRange().getStart().floatValue());
                                    Object obj = linkedHashMap.get(boolValueOf);
                                    if (obj == null) {
                                        obj = (List) new ArrayList();
                                        linkedHashMap.put(boolValueOf, obj);
                                    }
                                    ((List) obj).add(Float.valueOf(f3));
                                }
                                long j5 = jM2393tickColorWaAFU9c$material3_release;
                                long j6 = jM2393tickColorWaAFU9c$material3_release2;
                                for (Map.Entry entry : linkedHashMap.entrySet()) {
                                    boolean zBooleanValue = ((Boolean) entry.getKey()).booleanValue();
                                    List list = (List) entry.getValue();
                                    ArrayList arrayList = new ArrayList(list.size());
                                    int size = list.size();
                                    int i11 = 0;
                                    while (i11 < size) {
                                        long j7 = j4;
                                        arrayList.add(Offset.m3963boximpl(OffsetKt.Offset(Offset.m3974getXimpl(OffsetKt.m3997lerpWko1d7g(j7, j3, ((Number) list.get(i11)).floatValue())), Offset.m3975getYimpl(drawScope.mo4797getCenterF1C5BW0()))));
                                        i11++;
                                        j4 = j7;
                                    }
                                    long j8 = j4;
                                    long j9 = j3;
                                    DrawScope.m4789drawPointsF8ZwMP8$default(drawScope, arrayList, PointMode.INSTANCE.m4537getPointsr_lszbg(), zBooleanValue ? j5 : j6, f, StrokeCap.INSTANCE.m4590getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                                    j6 = j6;
                                    j4 = j8;
                                    j3 = j9;
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    composer2.endReplaceableGroup();
                    CanvasKt.Canvas(modifierM1033height3ABfNKs2, (Function1) objRememberedValue, composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                    sliderColors3 = sliderColors5;
                    z5 = z3;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier2;
                    sliderColors3 = sliderColors2;
                    z5 = z2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderDefaults.Track.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i10) {
                            SliderDefaults.this.Track(sliderPositions, modifier3, sliderColors3, z5, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 3072;
            z2 = z;
            if ((i2 & 16) != 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                if (composerStartRestartGroup.changed(this)) {
                    i6 = 16384;
                } else {
                    i6 = 8192;
                }
                i3 |= i6;
            }
            if ((i3 & 9363) == 9362) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if ((i2 & 4) != 0) {
                        SliderColors sliderColorsColors2 = colors(composerStartRestartGroup, (i3 >> 12) & 14);
                        i3 &= -897;
                        sliderColors2 = sliderColorsColors2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                } else {
                    if (i8 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if ((i2 & 4) != 0) {
                        SliderColors sliderColorsColors3 = colors(composerStartRestartGroup, (i3 >> 12) & 14);
                        i3 &= -897;
                        sliderColors2 = sliderColorsColors3;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                }
                SliderColors sliderColors6 = sliderColors2;
                i7 = i3;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1546713545, i7, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1044)");
                }
                jM2394trackColorWaAFU9c$material3_release = sliderColors6.m2394trackColorWaAFU9c$material3_release(z3, false);
                jM2394trackColorWaAFU9c$material3_release2 = sliderColors6.m2394trackColorWaAFU9c$material3_release(z3, true);
                jM2393tickColorWaAFU9c$material3_release = sliderColors6.m2393tickColorWaAFU9c$material3_release(z3, false);
                jM2393tickColorWaAFU9c$material3_release2 = sliderColors6.m2393tickColorWaAFU9c$material3_release(z3, true);
                Modifier modifierM1033height3ABfNKs3 = SizeKt.m1033height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), SliderKt.getTrackHeight());
                composer2 = composerStartRestartGroup;
                composer2.startReplaceableGroup(-1134220194);
                zChanged = composer2.changed(jM2394trackColorWaAFU9c$material3_release);
                if ((i7 & 14) == 4) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                Modifier modifier6 = companion;
                zChanged2 = composer2.changed(jM2394trackColorWaAFU9c$material3_release2);
                zChanged3 = composer2.changed(jM2393tickColorWaAFU9c$material3_release);
                zChanged4 = composer2.changed(jM2393tickColorWaAFU9c$material3_release2);
                objRememberedValue = composer2.rememberedValue();
                if (!(zChanged2 | zChanged | z4 | zChanged3 | zChanged4)) {
                    objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$1$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DrawScope drawScope) {
                            boolean z6 = drawScope.getLayoutDirection() == LayoutDirection.Rtl;
                            long jOffset = OffsetKt.Offset(0.0f, Offset.m3975getYimpl(drawScope.mo4797getCenterF1C5BW0()));
                            long jOffset2 = OffsetKt.Offset(Size.m4043getWidthimpl(drawScope.mo4798getSizeNHjbRc()), Offset.m3975getYimpl(drawScope.mo4797getCenterF1C5BW0()));
                            long j = z6 ? jOffset2 : jOffset;
                            long j2 = !z6 ? jOffset2 : jOffset;
                            float f = drawScope.mo694toPx0680j_4(SliderKt.TickSize);
                            float f2 = drawScope.mo694toPx0680j_4(SliderKt.getTrackHeight());
                            long j3 = j2;
                            long j4 = j;
                            DrawScope.m4784drawLineNGM6Ib0$default(drawScope, jM2394trackColorWaAFU9c$material3_release, j, j2, f2, StrokeCap.INSTANCE.m4590getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                            DrawScope.m4784drawLineNGM6Ib0$default(drawScope, jM2394trackColorWaAFU9c$material3_release2, OffsetKt.Offset(Offset.m3974getXimpl(j4) + ((Offset.m3974getXimpl(j3) - Offset.m3974getXimpl(j4)) * sliderPositions.getActiveRange().getStart().floatValue()), Offset.m3975getYimpl(drawScope.mo4797getCenterF1C5BW0())), OffsetKt.Offset(Offset.m3974getXimpl(j4) + ((Offset.m3974getXimpl(j3) - Offset.m3974getXimpl(j4)) * sliderPositions.getActiveRange().getEndInclusive().floatValue()), Offset.m3975getYimpl(drawScope.mo4797getCenterF1C5BW0())), f2, StrokeCap.INSTANCE.m4590getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                            float[] tickFractions = sliderPositions.getTickFractions();
                            SliderPositions sliderPositions2 = sliderPositions;
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            int length = tickFractions.length;
                            for (int i10 = 0; i10 < length; i10++) {
                                float f3 = tickFractions[i10];
                                Boolean boolValueOf = Boolean.valueOf(f3 > sliderPositions2.getActiveRange().getEndInclusive().floatValue() || f3 < sliderPositions2.getActiveRange().getStart().floatValue());
                                Object obj = linkedHashMap.get(boolValueOf);
                                if (obj == null) {
                                    obj = (List) new ArrayList();
                                    linkedHashMap.put(boolValueOf, obj);
                                }
                                ((List) obj).add(Float.valueOf(f3));
                            }
                            long j5 = jM2393tickColorWaAFU9c$material3_release;
                            long j6 = jM2393tickColorWaAFU9c$material3_release2;
                            for (Map.Entry entry : linkedHashMap.entrySet()) {
                                boolean zBooleanValue = ((Boolean) entry.getKey()).booleanValue();
                                List list = (List) entry.getValue();
                                ArrayList arrayList = new ArrayList(list.size());
                                int size = list.size();
                                int i11 = 0;
                                while (i11 < size) {
                                    long j7 = j4;
                                    arrayList.add(Offset.m3963boximpl(OffsetKt.Offset(Offset.m3974getXimpl(OffsetKt.m3997lerpWko1d7g(j7, j3, ((Number) list.get(i11)).floatValue())), Offset.m3975getYimpl(drawScope.mo4797getCenterF1C5BW0()))));
                                    i11++;
                                    j4 = j7;
                                }
                                long j8 = j4;
                                long j9 = j3;
                                DrawScope.m4789drawPointsF8ZwMP8$default(drawScope, arrayList, PointMode.INSTANCE.m4537getPointsr_lszbg(), zBooleanValue ? j5 : j6, f, StrokeCap.INSTANCE.m4590getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                                j6 = j6;
                                j4 = j8;
                                j3 = j9;
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$1$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DrawScope drawScope) {
                            boolean z6 = drawScope.getLayoutDirection() == LayoutDirection.Rtl;
                            long jOffset = OffsetKt.Offset(0.0f, Offset.m3975getYimpl(drawScope.mo4797getCenterF1C5BW0()));
                            long jOffset2 = OffsetKt.Offset(Size.m4043getWidthimpl(drawScope.mo4798getSizeNHjbRc()), Offset.m3975getYimpl(drawScope.mo4797getCenterF1C5BW0()));
                            long j = z6 ? jOffset2 : jOffset;
                            long j2 = !z6 ? jOffset2 : jOffset;
                            float f = drawScope.mo694toPx0680j_4(SliderKt.TickSize);
                            float f2 = drawScope.mo694toPx0680j_4(SliderKt.getTrackHeight());
                            long j3 = j2;
                            long j4 = j;
                            DrawScope.m4784drawLineNGM6Ib0$default(drawScope, jM2394trackColorWaAFU9c$material3_release, j, j2, f2, StrokeCap.INSTANCE.m4590getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                            DrawScope.m4784drawLineNGM6Ib0$default(drawScope, jM2394trackColorWaAFU9c$material3_release2, OffsetKt.Offset(Offset.m3974getXimpl(j4) + ((Offset.m3974getXimpl(j3) - Offset.m3974getXimpl(j4)) * sliderPositions.getActiveRange().getStart().floatValue()), Offset.m3975getYimpl(drawScope.mo4797getCenterF1C5BW0())), OffsetKt.Offset(Offset.m3974getXimpl(j4) + ((Offset.m3974getXimpl(j3) - Offset.m3974getXimpl(j4)) * sliderPositions.getActiveRange().getEndInclusive().floatValue()), Offset.m3975getYimpl(drawScope.mo4797getCenterF1C5BW0())), f2, StrokeCap.INSTANCE.m4590getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                            float[] tickFractions = sliderPositions.getTickFractions();
                            SliderPositions sliderPositions2 = sliderPositions;
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            int length = tickFractions.length;
                            for (int i10 = 0; i10 < length; i10++) {
                                float f3 = tickFractions[i10];
                                Boolean boolValueOf = Boolean.valueOf(f3 > sliderPositions2.getActiveRange().getEndInclusive().floatValue() || f3 < sliderPositions2.getActiveRange().getStart().floatValue());
                                Object obj = linkedHashMap.get(boolValueOf);
                                if (obj == null) {
                                    obj = (List) new ArrayList();
                                    linkedHashMap.put(boolValueOf, obj);
                                }
                                ((List) obj).add(Float.valueOf(f3));
                            }
                            long j5 = jM2393tickColorWaAFU9c$material3_release;
                            long j6 = jM2393tickColorWaAFU9c$material3_release2;
                            for (Map.Entry entry : linkedHashMap.entrySet()) {
                                boolean zBooleanValue = ((Boolean) entry.getKey()).booleanValue();
                                List list = (List) entry.getValue();
                                ArrayList arrayList = new ArrayList(list.size());
                                int size = list.size();
                                int i11 = 0;
                                while (i11 < size) {
                                    long j7 = j4;
                                    arrayList.add(Offset.m3963boximpl(OffsetKt.Offset(Offset.m3974getXimpl(OffsetKt.m3997lerpWko1d7g(j7, j3, ((Number) list.get(i11)).floatValue())), Offset.m3975getYimpl(drawScope.mo4797getCenterF1C5BW0()))));
                                    i11++;
                                    j4 = j7;
                                }
                                long j8 = j4;
                                long j9 = j3;
                                DrawScope.m4789drawPointsF8ZwMP8$default(drawScope, arrayList, PointMode.INSTANCE.m4537getPointsr_lszbg(), zBooleanValue ? j5 : j6, f, StrokeCap.INSTANCE.m4590getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                                j6 = j6;
                                j4 = j8;
                                j3 = j9;
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceableGroup();
                CanvasKt.Canvas(modifierM1033height3ABfNKs3, (Function1) objRememberedValue, composer2, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier6;
                sliderColors3 = sliderColors6;
                z5 = z3;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if ((i2 & 4) != 0) {
                        SliderColors sliderColorsColors4 = colors(composerStartRestartGroup, (i3 >> 12) & 14);
                        i3 &= -897;
                        sliderColors2 = sliderColorsColors4;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                } else {
                    if (i8 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if ((i2 & 4) != 0) {
                        SliderColors sliderColorsColors5 = colors(composerStartRestartGroup, (i3 >> 12) & 14);
                        i3 &= -897;
                        sliderColors2 = sliderColorsColors5;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                }
                SliderColors sliderColors7 = sliderColors2;
                i7 = i3;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1546713545, i7, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1044)");
                }
                jM2394trackColorWaAFU9c$material3_release = sliderColors7.m2394trackColorWaAFU9c$material3_release(z3, false);
                jM2394trackColorWaAFU9c$material3_release2 = sliderColors7.m2394trackColorWaAFU9c$material3_release(z3, true);
                jM2393tickColorWaAFU9c$material3_release = sliderColors7.m2393tickColorWaAFU9c$material3_release(z3, false);
                jM2393tickColorWaAFU9c$material3_release2 = sliderColors7.m2393tickColorWaAFU9c$material3_release(z3, true);
                Modifier modifierM1033height3ABfNKs4 = SizeKt.m1033height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), SliderKt.getTrackHeight());
                composer2 = composerStartRestartGroup;
                composer2.startReplaceableGroup(-1134220194);
                zChanged = composer2.changed(jM2394trackColorWaAFU9c$material3_release);
                if ((i7 & 14) == 4) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                Modifier modifier7 = companion;
                zChanged2 = composer2.changed(jM2394trackColorWaAFU9c$material3_release2);
                zChanged3 = composer2.changed(jM2393tickColorWaAFU9c$material3_release);
                zChanged4 = composer2.changed(jM2393tickColorWaAFU9c$material3_release2);
                objRememberedValue = composer2.rememberedValue();
                if (!(zChanged2 | zChanged | z4 | zChanged3 | zChanged4)) {
                    objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$1$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DrawScope drawScope) {
                            boolean z6 = drawScope.getLayoutDirection() == LayoutDirection.Rtl;
                            long jOffset = OffsetKt.Offset(0.0f, Offset.m3975getYimpl(drawScope.mo4797getCenterF1C5BW0()));
                            long jOffset2 = OffsetKt.Offset(Size.m4043getWidthimpl(drawScope.mo4798getSizeNHjbRc()), Offset.m3975getYimpl(drawScope.mo4797getCenterF1C5BW0()));
                            long j = z6 ? jOffset2 : jOffset;
                            long j2 = !z6 ? jOffset2 : jOffset;
                            float f = drawScope.mo694toPx0680j_4(SliderKt.TickSize);
                            float f2 = drawScope.mo694toPx0680j_4(SliderKt.getTrackHeight());
                            long j3 = j2;
                            long j4 = j;
                            DrawScope.m4784drawLineNGM6Ib0$default(drawScope, jM2394trackColorWaAFU9c$material3_release, j, j2, f2, StrokeCap.INSTANCE.m4590getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                            DrawScope.m4784drawLineNGM6Ib0$default(drawScope, jM2394trackColorWaAFU9c$material3_release2, OffsetKt.Offset(Offset.m3974getXimpl(j4) + ((Offset.m3974getXimpl(j3) - Offset.m3974getXimpl(j4)) * sliderPositions.getActiveRange().getStart().floatValue()), Offset.m3975getYimpl(drawScope.mo4797getCenterF1C5BW0())), OffsetKt.Offset(Offset.m3974getXimpl(j4) + ((Offset.m3974getXimpl(j3) - Offset.m3974getXimpl(j4)) * sliderPositions.getActiveRange().getEndInclusive().floatValue()), Offset.m3975getYimpl(drawScope.mo4797getCenterF1C5BW0())), f2, StrokeCap.INSTANCE.m4590getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                            float[] tickFractions = sliderPositions.getTickFractions();
                            SliderPositions sliderPositions2 = sliderPositions;
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            int length = tickFractions.length;
                            for (int i10 = 0; i10 < length; i10++) {
                                float f3 = tickFractions[i10];
                                Boolean boolValueOf = Boolean.valueOf(f3 > sliderPositions2.getActiveRange().getEndInclusive().floatValue() || f3 < sliderPositions2.getActiveRange().getStart().floatValue());
                                Object obj = linkedHashMap.get(boolValueOf);
                                if (obj == null) {
                                    obj = (List) new ArrayList();
                                    linkedHashMap.put(boolValueOf, obj);
                                }
                                ((List) obj).add(Float.valueOf(f3));
                            }
                            long j5 = jM2393tickColorWaAFU9c$material3_release;
                            long j6 = jM2393tickColorWaAFU9c$material3_release2;
                            for (Map.Entry entry : linkedHashMap.entrySet()) {
                                boolean zBooleanValue = ((Boolean) entry.getKey()).booleanValue();
                                List list = (List) entry.getValue();
                                ArrayList arrayList = new ArrayList(list.size());
                                int size = list.size();
                                int i11 = 0;
                                while (i11 < size) {
                                    long j7 = j4;
                                    arrayList.add(Offset.m3963boximpl(OffsetKt.Offset(Offset.m3974getXimpl(OffsetKt.m3997lerpWko1d7g(j7, j3, ((Number) list.get(i11)).floatValue())), Offset.m3975getYimpl(drawScope.mo4797getCenterF1C5BW0()))));
                                    i11++;
                                    j4 = j7;
                                }
                                long j8 = j4;
                                long j9 = j3;
                                DrawScope.m4789drawPointsF8ZwMP8$default(drawScope, arrayList, PointMode.INSTANCE.m4537getPointsr_lszbg(), zBooleanValue ? j5 : j6, f, StrokeCap.INSTANCE.m4590getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                                j6 = j6;
                                j4 = j8;
                                j3 = j9;
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$1$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DrawScope drawScope) {
                            boolean z6 = drawScope.getLayoutDirection() == LayoutDirection.Rtl;
                            long jOffset = OffsetKt.Offset(0.0f, Offset.m3975getYimpl(drawScope.mo4797getCenterF1C5BW0()));
                            long jOffset2 = OffsetKt.Offset(Size.m4043getWidthimpl(drawScope.mo4798getSizeNHjbRc()), Offset.m3975getYimpl(drawScope.mo4797getCenterF1C5BW0()));
                            long j = z6 ? jOffset2 : jOffset;
                            long j2 = !z6 ? jOffset2 : jOffset;
                            float f = drawScope.mo694toPx0680j_4(SliderKt.TickSize);
                            float f2 = drawScope.mo694toPx0680j_4(SliderKt.getTrackHeight());
                            long j3 = j2;
                            long j4 = j;
                            DrawScope.m4784drawLineNGM6Ib0$default(drawScope, jM2394trackColorWaAFU9c$material3_release, j, j2, f2, StrokeCap.INSTANCE.m4590getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                            DrawScope.m4784drawLineNGM6Ib0$default(drawScope, jM2394trackColorWaAFU9c$material3_release2, OffsetKt.Offset(Offset.m3974getXimpl(j4) + ((Offset.m3974getXimpl(j3) - Offset.m3974getXimpl(j4)) * sliderPositions.getActiveRange().getStart().floatValue()), Offset.m3975getYimpl(drawScope.mo4797getCenterF1C5BW0())), OffsetKt.Offset(Offset.m3974getXimpl(j4) + ((Offset.m3974getXimpl(j3) - Offset.m3974getXimpl(j4)) * sliderPositions.getActiveRange().getEndInclusive().floatValue()), Offset.m3975getYimpl(drawScope.mo4797getCenterF1C5BW0())), f2, StrokeCap.INSTANCE.m4590getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                            float[] tickFractions = sliderPositions.getTickFractions();
                            SliderPositions sliderPositions2 = sliderPositions;
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            int length = tickFractions.length;
                            for (int i10 = 0; i10 < length; i10++) {
                                float f3 = tickFractions[i10];
                                Boolean boolValueOf = Boolean.valueOf(f3 > sliderPositions2.getActiveRange().getEndInclusive().floatValue() || f3 < sliderPositions2.getActiveRange().getStart().floatValue());
                                Object obj = linkedHashMap.get(boolValueOf);
                                if (obj == null) {
                                    obj = (List) new ArrayList();
                                    linkedHashMap.put(boolValueOf, obj);
                                }
                                ((List) obj).add(Float.valueOf(f3));
                            }
                            long j5 = jM2393tickColorWaAFU9c$material3_release;
                            long j6 = jM2393tickColorWaAFU9c$material3_release2;
                            for (Map.Entry entry : linkedHashMap.entrySet()) {
                                boolean zBooleanValue = ((Boolean) entry.getKey()).booleanValue();
                                List list = (List) entry.getValue();
                                ArrayList arrayList = new ArrayList(list.size());
                                int size = list.size();
                                int i11 = 0;
                                while (i11 < size) {
                                    long j7 = j4;
                                    arrayList.add(Offset.m3963boximpl(OffsetKt.Offset(Offset.m3974getXimpl(OffsetKt.m3997lerpWko1d7g(j7, j3, ((Number) list.get(i11)).floatValue())), Offset.m3975getYimpl(drawScope.mo4797getCenterF1C5BW0()))));
                                    i11++;
                                    j4 = j7;
                                }
                                long j8 = j4;
                                long j9 = j3;
                                DrawScope.m4789drawPointsF8ZwMP8$default(drawScope, arrayList, PointMode.INSTANCE.m4537getPointsr_lszbg(), zBooleanValue ? j5 : j6, f, StrokeCap.INSTANCE.m4590getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                                j6 = j6;
                                j4 = j8;
                                j3 = j9;
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceableGroup();
                CanvasKt.Canvas(modifierM1033height3ABfNKs4, (Function1) objRememberedValue, composer2, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier7;
                sliderColors3 = sliderColors7;
                z5 = z3;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderDefaults.Track.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i10) {
                        SliderDefaults.this.Track(sliderPositions, modifier3, sliderColors3, z5, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                sliderColors2 = sliderColors;
                if (composerStartRestartGroup.changed(sliderColors2)) {
                }
                i3 |= i9;
            } else {
                sliderColors2 = sliderColors;
            }
            i3 |= i9;
        } else {
            sliderColors2 = sliderColors;
        }
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                z2 = z;
                if (composerStartRestartGroup.changed(z2)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            if ((i2 & 16) != 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                if (composerStartRestartGroup.changed(this)) {
                    i6 = 16384;
                } else {
                    i6 = 8192;
                }
                i3 |= i6;
            }
            if ((i3 & 9363) == 9362) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if ((i2 & 4) != 0) {
                        SliderColors sliderColorsColors6 = colors(composerStartRestartGroup, (i3 >> 12) & 14);
                        i3 &= -897;
                        sliderColors2 = sliderColorsColors6;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                } else {
                    if (i8 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if ((i2 & 4) != 0) {
                        SliderColors sliderColorsColors7 = colors(composerStartRestartGroup, (i3 >> 12) & 14);
                        i3 &= -897;
                        sliderColors2 = sliderColorsColors7;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                }
                SliderColors sliderColors8 = sliderColors2;
                i7 = i3;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1546713545, i7, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1044)");
                }
                jM2394trackColorWaAFU9c$material3_release = sliderColors8.m2394trackColorWaAFU9c$material3_release(z3, false);
                jM2394trackColorWaAFU9c$material3_release2 = sliderColors8.m2394trackColorWaAFU9c$material3_release(z3, true);
                jM2393tickColorWaAFU9c$material3_release = sliderColors8.m2393tickColorWaAFU9c$material3_release(z3, false);
                jM2393tickColorWaAFU9c$material3_release2 = sliderColors8.m2393tickColorWaAFU9c$material3_release(z3, true);
                Modifier modifierM1033height3ABfNKs5 = SizeKt.m1033height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), SliderKt.getTrackHeight());
                composer2 = composerStartRestartGroup;
                composer2.startReplaceableGroup(-1134220194);
                zChanged = composer2.changed(jM2394trackColorWaAFU9c$material3_release);
                if ((i7 & 14) == 4) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                Modifier modifier8 = companion;
                zChanged2 = composer2.changed(jM2394trackColorWaAFU9c$material3_release2);
                zChanged3 = composer2.changed(jM2393tickColorWaAFU9c$material3_release);
                zChanged4 = composer2.changed(jM2393tickColorWaAFU9c$material3_release2);
                objRememberedValue = composer2.rememberedValue();
                if (!(zChanged2 | zChanged | z4 | zChanged3 | zChanged4)) {
                    objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$1$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DrawScope drawScope) {
                            boolean z6 = drawScope.getLayoutDirection() == LayoutDirection.Rtl;
                            long jOffset = OffsetKt.Offset(0.0f, Offset.m3975getYimpl(drawScope.mo4797getCenterF1C5BW0()));
                            long jOffset2 = OffsetKt.Offset(Size.m4043getWidthimpl(drawScope.mo4798getSizeNHjbRc()), Offset.m3975getYimpl(drawScope.mo4797getCenterF1C5BW0()));
                            long j = z6 ? jOffset2 : jOffset;
                            long j2 = !z6 ? jOffset2 : jOffset;
                            float f = drawScope.mo694toPx0680j_4(SliderKt.TickSize);
                            float f2 = drawScope.mo694toPx0680j_4(SliderKt.getTrackHeight());
                            long j3 = j2;
                            long j4 = j;
                            DrawScope.m4784drawLineNGM6Ib0$default(drawScope, jM2394trackColorWaAFU9c$material3_release, j, j2, f2, StrokeCap.INSTANCE.m4590getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                            DrawScope.m4784drawLineNGM6Ib0$default(drawScope, jM2394trackColorWaAFU9c$material3_release2, OffsetKt.Offset(Offset.m3974getXimpl(j4) + ((Offset.m3974getXimpl(j3) - Offset.m3974getXimpl(j4)) * sliderPositions.getActiveRange().getStart().floatValue()), Offset.m3975getYimpl(drawScope.mo4797getCenterF1C5BW0())), OffsetKt.Offset(Offset.m3974getXimpl(j4) + ((Offset.m3974getXimpl(j3) - Offset.m3974getXimpl(j4)) * sliderPositions.getActiveRange().getEndInclusive().floatValue()), Offset.m3975getYimpl(drawScope.mo4797getCenterF1C5BW0())), f2, StrokeCap.INSTANCE.m4590getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                            float[] tickFractions = sliderPositions.getTickFractions();
                            SliderPositions sliderPositions2 = sliderPositions;
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            int length = tickFractions.length;
                            for (int i10 = 0; i10 < length; i10++) {
                                float f3 = tickFractions[i10];
                                Boolean boolValueOf = Boolean.valueOf(f3 > sliderPositions2.getActiveRange().getEndInclusive().floatValue() || f3 < sliderPositions2.getActiveRange().getStart().floatValue());
                                Object obj = linkedHashMap.get(boolValueOf);
                                if (obj == null) {
                                    obj = (List) new ArrayList();
                                    linkedHashMap.put(boolValueOf, obj);
                                }
                                ((List) obj).add(Float.valueOf(f3));
                            }
                            long j5 = jM2393tickColorWaAFU9c$material3_release;
                            long j6 = jM2393tickColorWaAFU9c$material3_release2;
                            for (Map.Entry entry : linkedHashMap.entrySet()) {
                                boolean zBooleanValue = ((Boolean) entry.getKey()).booleanValue();
                                List list = (List) entry.getValue();
                                ArrayList arrayList = new ArrayList(list.size());
                                int size = list.size();
                                int i11 = 0;
                                while (i11 < size) {
                                    long j7 = j4;
                                    arrayList.add(Offset.m3963boximpl(OffsetKt.Offset(Offset.m3974getXimpl(OffsetKt.m3997lerpWko1d7g(j7, j3, ((Number) list.get(i11)).floatValue())), Offset.m3975getYimpl(drawScope.mo4797getCenterF1C5BW0()))));
                                    i11++;
                                    j4 = j7;
                                }
                                long j8 = j4;
                                long j9 = j3;
                                DrawScope.m4789drawPointsF8ZwMP8$default(drawScope, arrayList, PointMode.INSTANCE.m4537getPointsr_lszbg(), zBooleanValue ? j5 : j6, f, StrokeCap.INSTANCE.m4590getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                                j6 = j6;
                                j4 = j8;
                                j3 = j9;
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$1$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DrawScope drawScope) {
                            boolean z6 = drawScope.getLayoutDirection() == LayoutDirection.Rtl;
                            long jOffset = OffsetKt.Offset(0.0f, Offset.m3975getYimpl(drawScope.mo4797getCenterF1C5BW0()));
                            long jOffset2 = OffsetKt.Offset(Size.m4043getWidthimpl(drawScope.mo4798getSizeNHjbRc()), Offset.m3975getYimpl(drawScope.mo4797getCenterF1C5BW0()));
                            long j = z6 ? jOffset2 : jOffset;
                            long j2 = !z6 ? jOffset2 : jOffset;
                            float f = drawScope.mo694toPx0680j_4(SliderKt.TickSize);
                            float f2 = drawScope.mo694toPx0680j_4(SliderKt.getTrackHeight());
                            long j3 = j2;
                            long j4 = j;
                            DrawScope.m4784drawLineNGM6Ib0$default(drawScope, jM2394trackColorWaAFU9c$material3_release, j, j2, f2, StrokeCap.INSTANCE.m4590getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                            DrawScope.m4784drawLineNGM6Ib0$default(drawScope, jM2394trackColorWaAFU9c$material3_release2, OffsetKt.Offset(Offset.m3974getXimpl(j4) + ((Offset.m3974getXimpl(j3) - Offset.m3974getXimpl(j4)) * sliderPositions.getActiveRange().getStart().floatValue()), Offset.m3975getYimpl(drawScope.mo4797getCenterF1C5BW0())), OffsetKt.Offset(Offset.m3974getXimpl(j4) + ((Offset.m3974getXimpl(j3) - Offset.m3974getXimpl(j4)) * sliderPositions.getActiveRange().getEndInclusive().floatValue()), Offset.m3975getYimpl(drawScope.mo4797getCenterF1C5BW0())), f2, StrokeCap.INSTANCE.m4590getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                            float[] tickFractions = sliderPositions.getTickFractions();
                            SliderPositions sliderPositions2 = sliderPositions;
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            int length = tickFractions.length;
                            for (int i10 = 0; i10 < length; i10++) {
                                float f3 = tickFractions[i10];
                                Boolean boolValueOf = Boolean.valueOf(f3 > sliderPositions2.getActiveRange().getEndInclusive().floatValue() || f3 < sliderPositions2.getActiveRange().getStart().floatValue());
                                Object obj = linkedHashMap.get(boolValueOf);
                                if (obj == null) {
                                    obj = (List) new ArrayList();
                                    linkedHashMap.put(boolValueOf, obj);
                                }
                                ((List) obj).add(Float.valueOf(f3));
                            }
                            long j5 = jM2393tickColorWaAFU9c$material3_release;
                            long j6 = jM2393tickColorWaAFU9c$material3_release2;
                            for (Map.Entry entry : linkedHashMap.entrySet()) {
                                boolean zBooleanValue = ((Boolean) entry.getKey()).booleanValue();
                                List list = (List) entry.getValue();
                                ArrayList arrayList = new ArrayList(list.size());
                                int size = list.size();
                                int i11 = 0;
                                while (i11 < size) {
                                    long j7 = j4;
                                    arrayList.add(Offset.m3963boximpl(OffsetKt.Offset(Offset.m3974getXimpl(OffsetKt.m3997lerpWko1d7g(j7, j3, ((Number) list.get(i11)).floatValue())), Offset.m3975getYimpl(drawScope.mo4797getCenterF1C5BW0()))));
                                    i11++;
                                    j4 = j7;
                                }
                                long j8 = j4;
                                long j9 = j3;
                                DrawScope.m4789drawPointsF8ZwMP8$default(drawScope, arrayList, PointMode.INSTANCE.m4537getPointsr_lszbg(), zBooleanValue ? j5 : j6, f, StrokeCap.INSTANCE.m4590getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                                j6 = j6;
                                j4 = j8;
                                j3 = j9;
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceableGroup();
                CanvasKt.Canvas(modifierM1033height3ABfNKs5, (Function1) objRememberedValue, composer2, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier8;
                sliderColors3 = sliderColors8;
                z5 = z3;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if ((i2 & 4) != 0) {
                        SliderColors sliderColorsColors8 = colors(composerStartRestartGroup, (i3 >> 12) & 14);
                        i3 &= -897;
                        sliderColors2 = sliderColorsColors8;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                } else {
                    if (i8 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if ((i2 & 4) != 0) {
                        SliderColors sliderColorsColors9 = colors(composerStartRestartGroup, (i3 >> 12) & 14);
                        i3 &= -897;
                        sliderColors2 = sliderColorsColors9;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                }
                SliderColors sliderColors9 = sliderColors2;
                i7 = i3;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1546713545, i7, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1044)");
                }
                jM2394trackColorWaAFU9c$material3_release = sliderColors9.m2394trackColorWaAFU9c$material3_release(z3, false);
                jM2394trackColorWaAFU9c$material3_release2 = sliderColors9.m2394trackColorWaAFU9c$material3_release(z3, true);
                jM2393tickColorWaAFU9c$material3_release = sliderColors9.m2393tickColorWaAFU9c$material3_release(z3, false);
                jM2393tickColorWaAFU9c$material3_release2 = sliderColors9.m2393tickColorWaAFU9c$material3_release(z3, true);
                Modifier modifierM1033height3ABfNKs6 = SizeKt.m1033height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), SliderKt.getTrackHeight());
                composer2 = composerStartRestartGroup;
                composer2.startReplaceableGroup(-1134220194);
                zChanged = composer2.changed(jM2394trackColorWaAFU9c$material3_release);
                if ((i7 & 14) == 4) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                Modifier modifier9 = companion;
                zChanged2 = composer2.changed(jM2394trackColorWaAFU9c$material3_release2);
                zChanged3 = composer2.changed(jM2393tickColorWaAFU9c$material3_release);
                zChanged4 = composer2.changed(jM2393tickColorWaAFU9c$material3_release2);
                objRememberedValue = composer2.rememberedValue();
                if (!(zChanged2 | zChanged | z4 | zChanged3 | zChanged4)) {
                    objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$1$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DrawScope drawScope) {
                            boolean z6 = drawScope.getLayoutDirection() == LayoutDirection.Rtl;
                            long jOffset = OffsetKt.Offset(0.0f, Offset.m3975getYimpl(drawScope.mo4797getCenterF1C5BW0()));
                            long jOffset2 = OffsetKt.Offset(Size.m4043getWidthimpl(drawScope.mo4798getSizeNHjbRc()), Offset.m3975getYimpl(drawScope.mo4797getCenterF1C5BW0()));
                            long j = z6 ? jOffset2 : jOffset;
                            long j2 = !z6 ? jOffset2 : jOffset;
                            float f = drawScope.mo694toPx0680j_4(SliderKt.TickSize);
                            float f2 = drawScope.mo694toPx0680j_4(SliderKt.getTrackHeight());
                            long j3 = j2;
                            long j4 = j;
                            DrawScope.m4784drawLineNGM6Ib0$default(drawScope, jM2394trackColorWaAFU9c$material3_release, j, j2, f2, StrokeCap.INSTANCE.m4590getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                            DrawScope.m4784drawLineNGM6Ib0$default(drawScope, jM2394trackColorWaAFU9c$material3_release2, OffsetKt.Offset(Offset.m3974getXimpl(j4) + ((Offset.m3974getXimpl(j3) - Offset.m3974getXimpl(j4)) * sliderPositions.getActiveRange().getStart().floatValue()), Offset.m3975getYimpl(drawScope.mo4797getCenterF1C5BW0())), OffsetKt.Offset(Offset.m3974getXimpl(j4) + ((Offset.m3974getXimpl(j3) - Offset.m3974getXimpl(j4)) * sliderPositions.getActiveRange().getEndInclusive().floatValue()), Offset.m3975getYimpl(drawScope.mo4797getCenterF1C5BW0())), f2, StrokeCap.INSTANCE.m4590getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                            float[] tickFractions = sliderPositions.getTickFractions();
                            SliderPositions sliderPositions2 = sliderPositions;
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            int length = tickFractions.length;
                            for (int i10 = 0; i10 < length; i10++) {
                                float f3 = tickFractions[i10];
                                Boolean boolValueOf = Boolean.valueOf(f3 > sliderPositions2.getActiveRange().getEndInclusive().floatValue() || f3 < sliderPositions2.getActiveRange().getStart().floatValue());
                                Object obj = linkedHashMap.get(boolValueOf);
                                if (obj == null) {
                                    obj = (List) new ArrayList();
                                    linkedHashMap.put(boolValueOf, obj);
                                }
                                ((List) obj).add(Float.valueOf(f3));
                            }
                            long j5 = jM2393tickColorWaAFU9c$material3_release;
                            long j6 = jM2393tickColorWaAFU9c$material3_release2;
                            for (Map.Entry entry : linkedHashMap.entrySet()) {
                                boolean zBooleanValue = ((Boolean) entry.getKey()).booleanValue();
                                List list = (List) entry.getValue();
                                ArrayList arrayList = new ArrayList(list.size());
                                int size = list.size();
                                int i11 = 0;
                                while (i11 < size) {
                                    long j7 = j4;
                                    arrayList.add(Offset.m3963boximpl(OffsetKt.Offset(Offset.m3974getXimpl(OffsetKt.m3997lerpWko1d7g(j7, j3, ((Number) list.get(i11)).floatValue())), Offset.m3975getYimpl(drawScope.mo4797getCenterF1C5BW0()))));
                                    i11++;
                                    j4 = j7;
                                }
                                long j8 = j4;
                                long j9 = j3;
                                DrawScope.m4789drawPointsF8ZwMP8$default(drawScope, arrayList, PointMode.INSTANCE.m4537getPointsr_lszbg(), zBooleanValue ? j5 : j6, f, StrokeCap.INSTANCE.m4590getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                                j6 = j6;
                                j4 = j8;
                                j3 = j9;
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$1$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DrawScope drawScope) {
                            boolean z6 = drawScope.getLayoutDirection() == LayoutDirection.Rtl;
                            long jOffset = OffsetKt.Offset(0.0f, Offset.m3975getYimpl(drawScope.mo4797getCenterF1C5BW0()));
                            long jOffset2 = OffsetKt.Offset(Size.m4043getWidthimpl(drawScope.mo4798getSizeNHjbRc()), Offset.m3975getYimpl(drawScope.mo4797getCenterF1C5BW0()));
                            long j = z6 ? jOffset2 : jOffset;
                            long j2 = !z6 ? jOffset2 : jOffset;
                            float f = drawScope.mo694toPx0680j_4(SliderKt.TickSize);
                            float f2 = drawScope.mo694toPx0680j_4(SliderKt.getTrackHeight());
                            long j3 = j2;
                            long j4 = j;
                            DrawScope.m4784drawLineNGM6Ib0$default(drawScope, jM2394trackColorWaAFU9c$material3_release, j, j2, f2, StrokeCap.INSTANCE.m4590getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                            DrawScope.m4784drawLineNGM6Ib0$default(drawScope, jM2394trackColorWaAFU9c$material3_release2, OffsetKt.Offset(Offset.m3974getXimpl(j4) + ((Offset.m3974getXimpl(j3) - Offset.m3974getXimpl(j4)) * sliderPositions.getActiveRange().getStart().floatValue()), Offset.m3975getYimpl(drawScope.mo4797getCenterF1C5BW0())), OffsetKt.Offset(Offset.m3974getXimpl(j4) + ((Offset.m3974getXimpl(j3) - Offset.m3974getXimpl(j4)) * sliderPositions.getActiveRange().getEndInclusive().floatValue()), Offset.m3975getYimpl(drawScope.mo4797getCenterF1C5BW0())), f2, StrokeCap.INSTANCE.m4590getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                            float[] tickFractions = sliderPositions.getTickFractions();
                            SliderPositions sliderPositions2 = sliderPositions;
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            int length = tickFractions.length;
                            for (int i10 = 0; i10 < length; i10++) {
                                float f3 = tickFractions[i10];
                                Boolean boolValueOf = Boolean.valueOf(f3 > sliderPositions2.getActiveRange().getEndInclusive().floatValue() || f3 < sliderPositions2.getActiveRange().getStart().floatValue());
                                Object obj = linkedHashMap.get(boolValueOf);
                                if (obj == null) {
                                    obj = (List) new ArrayList();
                                    linkedHashMap.put(boolValueOf, obj);
                                }
                                ((List) obj).add(Float.valueOf(f3));
                            }
                            long j5 = jM2393tickColorWaAFU9c$material3_release;
                            long j6 = jM2393tickColorWaAFU9c$material3_release2;
                            for (Map.Entry entry : linkedHashMap.entrySet()) {
                                boolean zBooleanValue = ((Boolean) entry.getKey()).booleanValue();
                                List list = (List) entry.getValue();
                                ArrayList arrayList = new ArrayList(list.size());
                                int size = list.size();
                                int i11 = 0;
                                while (i11 < size) {
                                    long j7 = j4;
                                    arrayList.add(Offset.m3963boximpl(OffsetKt.Offset(Offset.m3974getXimpl(OffsetKt.m3997lerpWko1d7g(j7, j3, ((Number) list.get(i11)).floatValue())), Offset.m3975getYimpl(drawScope.mo4797getCenterF1C5BW0()))));
                                    i11++;
                                    j4 = j7;
                                }
                                long j8 = j4;
                                long j9 = j3;
                                DrawScope.m4789drawPointsF8ZwMP8$default(drawScope, arrayList, PointMode.INSTANCE.m4537getPointsr_lszbg(), zBooleanValue ? j5 : j6, f, StrokeCap.INSTANCE.m4590getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                                j6 = j6;
                                j4 = j8;
                                j3 = j9;
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceableGroup();
                CanvasKt.Canvas(modifierM1033height3ABfNKs6, (Function1) objRememberedValue, composer2, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier9;
                sliderColors3 = sliderColors9;
                z5 = z3;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderDefaults.Track.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i10) {
                        SliderDefaults.this.Track(sliderPositions, modifier3, sliderColors3, z5, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 3072;
        z2 = z;
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            if (composerStartRestartGroup.changed(this)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i3 |= i6;
        }
        if ((i3 & 9363) == 9362) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i8 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier2;
                }
                if ((i2 & 4) != 0) {
                    SliderColors sliderColorsColors10 = colors(composerStartRestartGroup, (i3 >> 12) & 14);
                    i3 &= -897;
                    sliderColors2 = sliderColorsColors10;
                }
                if (i4 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
            } else {
                if (i8 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier2;
                }
                if ((i2 & 4) != 0) {
                    SliderColors sliderColorsColors11 = colors(composerStartRestartGroup, (i3 >> 12) & 14);
                    i3 &= -897;
                    sliderColors2 = sliderColorsColors11;
                }
                if (i4 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
            }
            SliderColors sliderColors10 = sliderColors2;
            i7 = i3;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1546713545, i7, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1044)");
            }
            jM2394trackColorWaAFU9c$material3_release = sliderColors10.m2394trackColorWaAFU9c$material3_release(z3, false);
            jM2394trackColorWaAFU9c$material3_release2 = sliderColors10.m2394trackColorWaAFU9c$material3_release(z3, true);
            jM2393tickColorWaAFU9c$material3_release = sliderColors10.m2393tickColorWaAFU9c$material3_release(z3, false);
            jM2393tickColorWaAFU9c$material3_release2 = sliderColors10.m2393tickColorWaAFU9c$material3_release(z3, true);
            Modifier modifierM1033height3ABfNKs7 = SizeKt.m1033height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), SliderKt.getTrackHeight());
            composer2 = composerStartRestartGroup;
            composer2.startReplaceableGroup(-1134220194);
            zChanged = composer2.changed(jM2394trackColorWaAFU9c$material3_release);
            if ((i7 & 14) == 4) {
                z4 = true;
            } else {
                z4 = false;
            }
            Modifier modifier10 = companion;
            zChanged2 = composer2.changed(jM2394trackColorWaAFU9c$material3_release2);
            zChanged3 = composer2.changed(jM2393tickColorWaAFU9c$material3_release);
            zChanged4 = composer2.changed(jM2393tickColorWaAFU9c$material3_release2);
            objRememberedValue = composer2.rememberedValue();
            if (!(zChanged2 | zChanged | z4 | zChanged3 | zChanged4)) {
                objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$1$1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                        invoke2(drawScope);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(DrawScope drawScope) {
                        boolean z6 = drawScope.getLayoutDirection() == LayoutDirection.Rtl;
                        long jOffset = OffsetKt.Offset(0.0f, Offset.m3975getYimpl(drawScope.mo4797getCenterF1C5BW0()));
                        long jOffset2 = OffsetKt.Offset(Size.m4043getWidthimpl(drawScope.mo4798getSizeNHjbRc()), Offset.m3975getYimpl(drawScope.mo4797getCenterF1C5BW0()));
                        long j = z6 ? jOffset2 : jOffset;
                        long j2 = !z6 ? jOffset2 : jOffset;
                        float f = drawScope.mo694toPx0680j_4(SliderKt.TickSize);
                        float f2 = drawScope.mo694toPx0680j_4(SliderKt.getTrackHeight());
                        long j3 = j2;
                        long j4 = j;
                        DrawScope.m4784drawLineNGM6Ib0$default(drawScope, jM2394trackColorWaAFU9c$material3_release, j, j2, f2, StrokeCap.INSTANCE.m4590getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                        DrawScope.m4784drawLineNGM6Ib0$default(drawScope, jM2394trackColorWaAFU9c$material3_release2, OffsetKt.Offset(Offset.m3974getXimpl(j4) + ((Offset.m3974getXimpl(j3) - Offset.m3974getXimpl(j4)) * sliderPositions.getActiveRange().getStart().floatValue()), Offset.m3975getYimpl(drawScope.mo4797getCenterF1C5BW0())), OffsetKt.Offset(Offset.m3974getXimpl(j4) + ((Offset.m3974getXimpl(j3) - Offset.m3974getXimpl(j4)) * sliderPositions.getActiveRange().getEndInclusive().floatValue()), Offset.m3975getYimpl(drawScope.mo4797getCenterF1C5BW0())), f2, StrokeCap.INSTANCE.m4590getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                        float[] tickFractions = sliderPositions.getTickFractions();
                        SliderPositions sliderPositions2 = sliderPositions;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        int length = tickFractions.length;
                        for (int i10 = 0; i10 < length; i10++) {
                            float f3 = tickFractions[i10];
                            Boolean boolValueOf = Boolean.valueOf(f3 > sliderPositions2.getActiveRange().getEndInclusive().floatValue() || f3 < sliderPositions2.getActiveRange().getStart().floatValue());
                            Object obj = linkedHashMap.get(boolValueOf);
                            if (obj == null) {
                                obj = (List) new ArrayList();
                                linkedHashMap.put(boolValueOf, obj);
                            }
                            ((List) obj).add(Float.valueOf(f3));
                        }
                        long j5 = jM2393tickColorWaAFU9c$material3_release;
                        long j6 = jM2393tickColorWaAFU9c$material3_release2;
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            boolean zBooleanValue = ((Boolean) entry.getKey()).booleanValue();
                            List list = (List) entry.getValue();
                            ArrayList arrayList = new ArrayList(list.size());
                            int size = list.size();
                            int i11 = 0;
                            while (i11 < size) {
                                long j7 = j4;
                                arrayList.add(Offset.m3963boximpl(OffsetKt.Offset(Offset.m3974getXimpl(OffsetKt.m3997lerpWko1d7g(j7, j3, ((Number) list.get(i11)).floatValue())), Offset.m3975getYimpl(drawScope.mo4797getCenterF1C5BW0()))));
                                i11++;
                                j4 = j7;
                            }
                            long j8 = j4;
                            long j9 = j3;
                            DrawScope.m4789drawPointsF8ZwMP8$default(drawScope, arrayList, PointMode.INSTANCE.m4537getPointsr_lszbg(), zBooleanValue ? j5 : j6, f, StrokeCap.INSTANCE.m4590getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                            j6 = j6;
                            j4 = j8;
                            j3 = j9;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$1$1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                        invoke2(drawScope);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(DrawScope drawScope) {
                        boolean z6 = drawScope.getLayoutDirection() == LayoutDirection.Rtl;
                        long jOffset = OffsetKt.Offset(0.0f, Offset.m3975getYimpl(drawScope.mo4797getCenterF1C5BW0()));
                        long jOffset2 = OffsetKt.Offset(Size.m4043getWidthimpl(drawScope.mo4798getSizeNHjbRc()), Offset.m3975getYimpl(drawScope.mo4797getCenterF1C5BW0()));
                        long j = z6 ? jOffset2 : jOffset;
                        long j2 = !z6 ? jOffset2 : jOffset;
                        float f = drawScope.mo694toPx0680j_4(SliderKt.TickSize);
                        float f2 = drawScope.mo694toPx0680j_4(SliderKt.getTrackHeight());
                        long j3 = j2;
                        long j4 = j;
                        DrawScope.m4784drawLineNGM6Ib0$default(drawScope, jM2394trackColorWaAFU9c$material3_release, j, j2, f2, StrokeCap.INSTANCE.m4590getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                        DrawScope.m4784drawLineNGM6Ib0$default(drawScope, jM2394trackColorWaAFU9c$material3_release2, OffsetKt.Offset(Offset.m3974getXimpl(j4) + ((Offset.m3974getXimpl(j3) - Offset.m3974getXimpl(j4)) * sliderPositions.getActiveRange().getStart().floatValue()), Offset.m3975getYimpl(drawScope.mo4797getCenterF1C5BW0())), OffsetKt.Offset(Offset.m3974getXimpl(j4) + ((Offset.m3974getXimpl(j3) - Offset.m3974getXimpl(j4)) * sliderPositions.getActiveRange().getEndInclusive().floatValue()), Offset.m3975getYimpl(drawScope.mo4797getCenterF1C5BW0())), f2, StrokeCap.INSTANCE.m4590getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                        float[] tickFractions = sliderPositions.getTickFractions();
                        SliderPositions sliderPositions2 = sliderPositions;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        int length = tickFractions.length;
                        for (int i10 = 0; i10 < length; i10++) {
                            float f3 = tickFractions[i10];
                            Boolean boolValueOf = Boolean.valueOf(f3 > sliderPositions2.getActiveRange().getEndInclusive().floatValue() || f3 < sliderPositions2.getActiveRange().getStart().floatValue());
                            Object obj = linkedHashMap.get(boolValueOf);
                            if (obj == null) {
                                obj = (List) new ArrayList();
                                linkedHashMap.put(boolValueOf, obj);
                            }
                            ((List) obj).add(Float.valueOf(f3));
                        }
                        long j5 = jM2393tickColorWaAFU9c$material3_release;
                        long j6 = jM2393tickColorWaAFU9c$material3_release2;
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            boolean zBooleanValue = ((Boolean) entry.getKey()).booleanValue();
                            List list = (List) entry.getValue();
                            ArrayList arrayList = new ArrayList(list.size());
                            int size = list.size();
                            int i11 = 0;
                            while (i11 < size) {
                                long j7 = j4;
                                arrayList.add(Offset.m3963boximpl(OffsetKt.Offset(Offset.m3974getXimpl(OffsetKt.m3997lerpWko1d7g(j7, j3, ((Number) list.get(i11)).floatValue())), Offset.m3975getYimpl(drawScope.mo4797getCenterF1C5BW0()))));
                                i11++;
                                j4 = j7;
                            }
                            long j8 = j4;
                            long j9 = j3;
                            DrawScope.m4789drawPointsF8ZwMP8$default(drawScope, arrayList, PointMode.INSTANCE.m4537getPointsr_lszbg(), zBooleanValue ? j5 : j6, f, StrokeCap.INSTANCE.m4590getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                            j6 = j6;
                            j4 = j8;
                            j3 = j9;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceableGroup();
            CanvasKt.Canvas(modifierM1033height3ABfNKs7, (Function1) objRememberedValue, composer2, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier10;
            sliderColors3 = sliderColors10;
            z5 = z3;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i8 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier2;
                }
                if ((i2 & 4) != 0) {
                    SliderColors sliderColorsColors12 = colors(composerStartRestartGroup, (i3 >> 12) & 14);
                    i3 &= -897;
                    sliderColors2 = sliderColorsColors12;
                }
                if (i4 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
            } else {
                if (i8 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier2;
                }
                if ((i2 & 4) != 0) {
                    SliderColors sliderColorsColors13 = colors(composerStartRestartGroup, (i3 >> 12) & 14);
                    i3 &= -897;
                    sliderColors2 = sliderColorsColors13;
                }
                if (i4 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
            }
            SliderColors sliderColors11 = sliderColors2;
            i7 = i3;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1546713545, i7, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1044)");
            }
            jM2394trackColorWaAFU9c$material3_release = sliderColors11.m2394trackColorWaAFU9c$material3_release(z3, false);
            jM2394trackColorWaAFU9c$material3_release2 = sliderColors11.m2394trackColorWaAFU9c$material3_release(z3, true);
            jM2393tickColorWaAFU9c$material3_release = sliderColors11.m2393tickColorWaAFU9c$material3_release(z3, false);
            jM2393tickColorWaAFU9c$material3_release2 = sliderColors11.m2393tickColorWaAFU9c$material3_release(z3, true);
            Modifier modifierM1033height3ABfNKs8 = SizeKt.m1033height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), SliderKt.getTrackHeight());
            composer2 = composerStartRestartGroup;
            composer2.startReplaceableGroup(-1134220194);
            zChanged = composer2.changed(jM2394trackColorWaAFU9c$material3_release);
            if ((i7 & 14) == 4) {
                z4 = true;
            } else {
                z4 = false;
            }
            Modifier modifier11 = companion;
            zChanged2 = composer2.changed(jM2394trackColorWaAFU9c$material3_release2);
            zChanged3 = composer2.changed(jM2393tickColorWaAFU9c$material3_release);
            zChanged4 = composer2.changed(jM2393tickColorWaAFU9c$material3_release2);
            objRememberedValue = composer2.rememberedValue();
            if (!(zChanged2 | zChanged | z4 | zChanged3 | zChanged4)) {
                objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$1$1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                        invoke2(drawScope);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(DrawScope drawScope) {
                        boolean z6 = drawScope.getLayoutDirection() == LayoutDirection.Rtl;
                        long jOffset = OffsetKt.Offset(0.0f, Offset.m3975getYimpl(drawScope.mo4797getCenterF1C5BW0()));
                        long jOffset2 = OffsetKt.Offset(Size.m4043getWidthimpl(drawScope.mo4798getSizeNHjbRc()), Offset.m3975getYimpl(drawScope.mo4797getCenterF1C5BW0()));
                        long j = z6 ? jOffset2 : jOffset;
                        long j2 = !z6 ? jOffset2 : jOffset;
                        float f = drawScope.mo694toPx0680j_4(SliderKt.TickSize);
                        float f2 = drawScope.mo694toPx0680j_4(SliderKt.getTrackHeight());
                        long j3 = j2;
                        long j4 = j;
                        DrawScope.m4784drawLineNGM6Ib0$default(drawScope, jM2394trackColorWaAFU9c$material3_release, j, j2, f2, StrokeCap.INSTANCE.m4590getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                        DrawScope.m4784drawLineNGM6Ib0$default(drawScope, jM2394trackColorWaAFU9c$material3_release2, OffsetKt.Offset(Offset.m3974getXimpl(j4) + ((Offset.m3974getXimpl(j3) - Offset.m3974getXimpl(j4)) * sliderPositions.getActiveRange().getStart().floatValue()), Offset.m3975getYimpl(drawScope.mo4797getCenterF1C5BW0())), OffsetKt.Offset(Offset.m3974getXimpl(j4) + ((Offset.m3974getXimpl(j3) - Offset.m3974getXimpl(j4)) * sliderPositions.getActiveRange().getEndInclusive().floatValue()), Offset.m3975getYimpl(drawScope.mo4797getCenterF1C5BW0())), f2, StrokeCap.INSTANCE.m4590getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                        float[] tickFractions = sliderPositions.getTickFractions();
                        SliderPositions sliderPositions2 = sliderPositions;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        int length = tickFractions.length;
                        for (int i10 = 0; i10 < length; i10++) {
                            float f3 = tickFractions[i10];
                            Boolean boolValueOf = Boolean.valueOf(f3 > sliderPositions2.getActiveRange().getEndInclusive().floatValue() || f3 < sliderPositions2.getActiveRange().getStart().floatValue());
                            Object obj = linkedHashMap.get(boolValueOf);
                            if (obj == null) {
                                obj = (List) new ArrayList();
                                linkedHashMap.put(boolValueOf, obj);
                            }
                            ((List) obj).add(Float.valueOf(f3));
                        }
                        long j5 = jM2393tickColorWaAFU9c$material3_release;
                        long j6 = jM2393tickColorWaAFU9c$material3_release2;
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            boolean zBooleanValue = ((Boolean) entry.getKey()).booleanValue();
                            List list = (List) entry.getValue();
                            ArrayList arrayList = new ArrayList(list.size());
                            int size = list.size();
                            int i11 = 0;
                            while (i11 < size) {
                                long j7 = j4;
                                arrayList.add(Offset.m3963boximpl(OffsetKt.Offset(Offset.m3974getXimpl(OffsetKt.m3997lerpWko1d7g(j7, j3, ((Number) list.get(i11)).floatValue())), Offset.m3975getYimpl(drawScope.mo4797getCenterF1C5BW0()))));
                                i11++;
                                j4 = j7;
                            }
                            long j8 = j4;
                            long j9 = j3;
                            DrawScope.m4789drawPointsF8ZwMP8$default(drawScope, arrayList, PointMode.INSTANCE.m4537getPointsr_lszbg(), zBooleanValue ? j5 : j6, f, StrokeCap.INSTANCE.m4590getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                            j6 = j6;
                            j4 = j8;
                            j3 = j9;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$1$1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                        invoke2(drawScope);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(DrawScope drawScope) {
                        boolean z6 = drawScope.getLayoutDirection() == LayoutDirection.Rtl;
                        long jOffset = OffsetKt.Offset(0.0f, Offset.m3975getYimpl(drawScope.mo4797getCenterF1C5BW0()));
                        long jOffset2 = OffsetKt.Offset(Size.m4043getWidthimpl(drawScope.mo4798getSizeNHjbRc()), Offset.m3975getYimpl(drawScope.mo4797getCenterF1C5BW0()));
                        long j = z6 ? jOffset2 : jOffset;
                        long j2 = !z6 ? jOffset2 : jOffset;
                        float f = drawScope.mo694toPx0680j_4(SliderKt.TickSize);
                        float f2 = drawScope.mo694toPx0680j_4(SliderKt.getTrackHeight());
                        long j3 = j2;
                        long j4 = j;
                        DrawScope.m4784drawLineNGM6Ib0$default(drawScope, jM2394trackColorWaAFU9c$material3_release, j, j2, f2, StrokeCap.INSTANCE.m4590getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                        DrawScope.m4784drawLineNGM6Ib0$default(drawScope, jM2394trackColorWaAFU9c$material3_release2, OffsetKt.Offset(Offset.m3974getXimpl(j4) + ((Offset.m3974getXimpl(j3) - Offset.m3974getXimpl(j4)) * sliderPositions.getActiveRange().getStart().floatValue()), Offset.m3975getYimpl(drawScope.mo4797getCenterF1C5BW0())), OffsetKt.Offset(Offset.m3974getXimpl(j4) + ((Offset.m3974getXimpl(j3) - Offset.m3974getXimpl(j4)) * sliderPositions.getActiveRange().getEndInclusive().floatValue()), Offset.m3975getYimpl(drawScope.mo4797getCenterF1C5BW0())), f2, StrokeCap.INSTANCE.m4590getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                        float[] tickFractions = sliderPositions.getTickFractions();
                        SliderPositions sliderPositions2 = sliderPositions;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        int length = tickFractions.length;
                        for (int i10 = 0; i10 < length; i10++) {
                            float f3 = tickFractions[i10];
                            Boolean boolValueOf = Boolean.valueOf(f3 > sliderPositions2.getActiveRange().getEndInclusive().floatValue() || f3 < sliderPositions2.getActiveRange().getStart().floatValue());
                            Object obj = linkedHashMap.get(boolValueOf);
                            if (obj == null) {
                                obj = (List) new ArrayList();
                                linkedHashMap.put(boolValueOf, obj);
                            }
                            ((List) obj).add(Float.valueOf(f3));
                        }
                        long j5 = jM2393tickColorWaAFU9c$material3_release;
                        long j6 = jM2393tickColorWaAFU9c$material3_release2;
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            boolean zBooleanValue = ((Boolean) entry.getKey()).booleanValue();
                            List list = (List) entry.getValue();
                            ArrayList arrayList = new ArrayList(list.size());
                            int size = list.size();
                            int i11 = 0;
                            while (i11 < size) {
                                long j7 = j4;
                                arrayList.add(Offset.m3963boximpl(OffsetKt.Offset(Offset.m3974getXimpl(OffsetKt.m3997lerpWko1d7g(j7, j3, ((Number) list.get(i11)).floatValue())), Offset.m3975getYimpl(drawScope.mo4797getCenterF1C5BW0()))));
                                i11++;
                                j4 = j7;
                            }
                            long j8 = j4;
                            long j9 = j3;
                            DrawScope.m4789drawPointsF8ZwMP8$default(drawScope, arrayList, PointMode.INSTANCE.m4537getPointsr_lszbg(), zBooleanValue ? j5 : j6, f, StrokeCap.INSTANCE.m4590getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                            j6 = j6;
                            j4 = j8;
                            j3 = j9;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceableGroup();
            CanvasKt.Canvas(modifierM1033height3ABfNKs8, (Function1) objRememberedValue, composer2, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier11;
            sliderColors3 = sliderColors11;
            z5 = z3;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderDefaults.Track.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i10) {
                    SliderDefaults.this.Track(sliderPositions, modifier3, sliderColors3, z5, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:31:0x005a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:40:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082  */
    /* JADX WARN: Code duplicated, block: B:49:0x0085  */
    /* JADX WARN: Code duplicated, block: B:51:0x0089  */
    /* JADX WARN: Code duplicated, block: B:53:0x008f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0092  */
    /* JADX WARN: Code duplicated, block: B:58:0x009b  */
    /* JADX WARN: Code duplicated, block: B:61:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:76:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:77:0x00de A[PHI: r4 r5 r9
  0x00de: PHI (r4v20 int) = (r4v14 int), (r4v21 int) binds: [B:75:0x00da, B:68:0x00c1] A[DONT_GENERATE, DONT_INLINE]
  0x00de: PHI (r5v7 androidx.compose.ui.Modifier) = (r5v2 androidx.compose.ui.Modifier), (r5v9 androidx.compose.ui.Modifier) binds: [B:75:0x00da, B:68:0x00c1] A[DONT_GENERATE, DONT_INLINE]
  0x00de: PHI (r9v20 androidx.compose.material3.SliderColors) = (r9v7 androidx.compose.material3.SliderColors), (r9v6 androidx.compose.material3.SliderColors) binds: [B:75:0x00da, B:68:0x00c1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:80:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:84:0x0124  */
    /* JADX WARN: Code duplicated, block: B:87:0x0147  */
    /* JADX WARN: Code duplicated, block: B:89:0x014f  */
    /* JADX WARN: Code duplicated, block: B:92:0x016f  */
    /* JADX WARN: Code duplicated, block: B:96:0x017d  */
    /* JADX WARN: Code duplicated, block: B:98:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:61:0x00aa, please report this as an issue */
    public final void Track(final SliderState sliderState, Modifier modifier, SliderColors sliderColors, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        SliderColors sliderColors2;
        int i4;
        boolean z2;
        int i5;
        int i6;
        Modifier.Companion companion;
        boolean z3;
        int i7;
        final long jM2394trackColorWaAFU9c$material3_release;
        final long jM2394trackColorWaAFU9c$material3_release2;
        final long jM2393tickColorWaAFU9c$material3_release;
        final long jM2393tickColorWaAFU9c$material3_release2;
        Composer composer2;
        boolean z4;
        boolean zChanged;
        boolean zChanged2;
        boolean zChanged3;
        boolean zChanged4;
        Object objRememberedValue;
        final Modifier modifier3;
        final boolean z5;
        final SliderColors sliderColors3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(593554206);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(sliderState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                if ((i2 & 4) == 0) {
                    sliderColors2 = sliderColors;
                    int i9 = composerStartRestartGroup.changed(sliderColors2) ? 256 : 128;
                    i3 |= i9;
                } else {
                    sliderColors2 = sliderColors;
                }
                i3 |= i9;
            } else {
                sliderColors2 = sliderColors;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    z2 = z;
                    if (composerStartRestartGroup.changed(z2)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    if (composerStartRestartGroup.changed(this)) {
                        i6 = 16384;
                    } else {
                        i6 = 8192;
                    }
                    i3 |= i6;
                }
                if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i8 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier2;
                        }
                        if ((i2 & 4) != 0) {
                            SliderColors sliderColorsColors = colors(composerStartRestartGroup, (i3 >> 12) & 14);
                            i3 &= -897;
                            sliderColors2 = sliderColorsColors;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        SliderColors sliderColors4 = sliderColors2;
                        i7 = i3;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(593554206, i7, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1122)");
                        }
                        jM2394trackColorWaAFU9c$material3_release = sliderColors4.m2394trackColorWaAFU9c$material3_release(z3, false);
                        jM2394trackColorWaAFU9c$material3_release2 = sliderColors4.m2394trackColorWaAFU9c$material3_release(z3, true);
                        jM2393tickColorWaAFU9c$material3_release = sliderColors4.m2393tickColorWaAFU9c$material3_release(z3, false);
                        jM2393tickColorWaAFU9c$material3_release2 = sliderColors4.m2393tickColorWaAFU9c$material3_release(z3, true);
                        Modifier modifierM1033height3ABfNKs = SizeKt.m1033height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), SliderKt.getTrackHeight());
                        composer2 = composerStartRestartGroup;
                        composer2.startReplaceableGroup(-1134217104);
                        z4 = (i7 & 14) == 4;
                        zChanged = composer2.changed(jM2394trackColorWaAFU9c$material3_release);
                        Modifier modifier4 = companion;
                        zChanged2 = composer2.changed(jM2394trackColorWaAFU9c$material3_release2);
                        zChanged3 = composer2.changed(jM2393tickColorWaAFU9c$material3_release);
                        zChanged4 = composer2.changed(jM2393tickColorWaAFU9c$material3_release2);
                        objRememberedValue = composer2.rememberedValue();
                        if (!(zChanged | z4 | zChanged2 | zChanged3 | zChanged4) || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$3$1
                                @Override // kotlin.jvm.functions.Function1
                                public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                    invoke2(drawScope);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(DrawScope drawScope) {
                                    SliderDefaults.INSTANCE.m2396drawTrackLUBghH0(drawScope, sliderState.getTickFractions(), 0.0f, sliderState.getCoercedValueAsFraction$material3_release(), jM2394trackColorWaAFU9c$material3_release, jM2394trackColorWaAFU9c$material3_release2, jM2393tickColorWaAFU9c$material3_release, jM2393tickColorWaAFU9c$material3_release2);
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        composer2.endReplaceableGroup();
                        CanvasKt.Canvas(modifierM1033height3ABfNKs, (Function1) objRememberedValue, composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                        z5 = z3;
                        sliderColors3 = sliderColors4;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        companion = modifier2;
                    }
                    z3 = z2;
                    SliderColors sliderColors5 = sliderColors2;
                    i7 = i3;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(593554206, i7, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1122)");
                    }
                    jM2394trackColorWaAFU9c$material3_release = sliderColors5.m2394trackColorWaAFU9c$material3_release(z3, false);
                    jM2394trackColorWaAFU9c$material3_release2 = sliderColors5.m2394trackColorWaAFU9c$material3_release(z3, true);
                    jM2393tickColorWaAFU9c$material3_release = sliderColors5.m2393tickColorWaAFU9c$material3_release(z3, false);
                    jM2393tickColorWaAFU9c$material3_release2 = sliderColors5.m2393tickColorWaAFU9c$material3_release(z3, true);
                    Modifier modifierM1033height3ABfNKs2 = SizeKt.m1033height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), SliderKt.getTrackHeight());
                    composer2 = composerStartRestartGroup;
                    composer2.startReplaceableGroup(-1134217104);
                    if ((i7 & 14) == 4) {
                    }
                    zChanged = composer2.changed(jM2394trackColorWaAFU9c$material3_release);
                    Modifier modifier5 = companion;
                    zChanged2 = composer2.changed(jM2394trackColorWaAFU9c$material3_release2);
                    zChanged3 = composer2.changed(jM2393tickColorWaAFU9c$material3_release);
                    zChanged4 = composer2.changed(jM2393tickColorWaAFU9c$material3_release2);
                    objRememberedValue = composer2.rememberedValue();
                    if (!(zChanged | z4 | zChanged2 | zChanged3 | zChanged4)) {
                        objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$3$1
                            @Override // kotlin.jvm.functions.Function1
                            public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                invoke2(drawScope);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(DrawScope drawScope) {
                                SliderDefaults.INSTANCE.m2396drawTrackLUBghH0(drawScope, sliderState.getTickFractions(), 0.0f, sliderState.getCoercedValueAsFraction$material3_release(), jM2394trackColorWaAFU9c$material3_release, jM2394trackColorWaAFU9c$material3_release2, jM2393tickColorWaAFU9c$material3_release, jM2393tickColorWaAFU9c$material3_release2);
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$3$1
                            @Override // kotlin.jvm.functions.Function1
                            public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                invoke2(drawScope);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(DrawScope drawScope) {
                                SliderDefaults.INSTANCE.m2396drawTrackLUBghH0(drawScope, sliderState.getTickFractions(), 0.0f, sliderState.getCoercedValueAsFraction$material3_release(), jM2394trackColorWaAFU9c$material3_release, jM2394trackColorWaAFU9c$material3_release2, jM2393tickColorWaAFU9c$material3_release, jM2393tickColorWaAFU9c$material3_release2);
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    composer2.endReplaceableGroup();
                    CanvasKt.Canvas(modifierM1033height3ABfNKs2, (Function1) objRememberedValue, composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                    z5 = z3;
                    sliderColors3 = sliderColors5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier2;
                    sliderColors3 = sliderColors2;
                    z5 = z2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderDefaults.Track.4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i10) {
                            SliderDefaults.this.Track(sliderState, modifier3, sliderColors3, z5, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 3072;
            z2 = z;
            if ((i2 & 16) != 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                if (composerStartRestartGroup.changed(this)) {
                    i6 = 16384;
                } else {
                    i6 = 8192;
                }
                i3 |= i6;
            }
            if ((i3 & 9363) == 9362) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if ((i2 & 4) != 0) {
                        SliderColors sliderColorsColors2 = colors(composerStartRestartGroup, (i3 >> 12) & 14);
                        i3 &= -897;
                        sliderColors2 = sliderColorsColors2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                } else {
                    if (i8 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if ((i2 & 4) != 0) {
                        SliderColors sliderColorsColors3 = colors(composerStartRestartGroup, (i3 >> 12) & 14);
                        i3 &= -897;
                        sliderColors2 = sliderColorsColors3;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                }
                SliderColors sliderColors6 = sliderColors2;
                i7 = i3;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(593554206, i7, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1122)");
                }
                jM2394trackColorWaAFU9c$material3_release = sliderColors6.m2394trackColorWaAFU9c$material3_release(z3, false);
                jM2394trackColorWaAFU9c$material3_release2 = sliderColors6.m2394trackColorWaAFU9c$material3_release(z3, true);
                jM2393tickColorWaAFU9c$material3_release = sliderColors6.m2393tickColorWaAFU9c$material3_release(z3, false);
                jM2393tickColorWaAFU9c$material3_release2 = sliderColors6.m2393tickColorWaAFU9c$material3_release(z3, true);
                Modifier modifierM1033height3ABfNKs3 = SizeKt.m1033height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), SliderKt.getTrackHeight());
                composer2 = composerStartRestartGroup;
                composer2.startReplaceableGroup(-1134217104);
                if ((i7 & 14) == 4) {
                }
                zChanged = composer2.changed(jM2394trackColorWaAFU9c$material3_release);
                Modifier modifier6 = companion;
                zChanged2 = composer2.changed(jM2394trackColorWaAFU9c$material3_release2);
                zChanged3 = composer2.changed(jM2393tickColorWaAFU9c$material3_release);
                zChanged4 = composer2.changed(jM2393tickColorWaAFU9c$material3_release2);
                objRememberedValue = composer2.rememberedValue();
                if (!(zChanged | z4 | zChanged2 | zChanged3 | zChanged4)) {
                    objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$3$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DrawScope drawScope) {
                            SliderDefaults.INSTANCE.m2396drawTrackLUBghH0(drawScope, sliderState.getTickFractions(), 0.0f, sliderState.getCoercedValueAsFraction$material3_release(), jM2394trackColorWaAFU9c$material3_release, jM2394trackColorWaAFU9c$material3_release2, jM2393tickColorWaAFU9c$material3_release, jM2393tickColorWaAFU9c$material3_release2);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$3$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DrawScope drawScope) {
                            SliderDefaults.INSTANCE.m2396drawTrackLUBghH0(drawScope, sliderState.getTickFractions(), 0.0f, sliderState.getCoercedValueAsFraction$material3_release(), jM2394trackColorWaAFU9c$material3_release, jM2394trackColorWaAFU9c$material3_release2, jM2393tickColorWaAFU9c$material3_release, jM2393tickColorWaAFU9c$material3_release2);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceableGroup();
                CanvasKt.Canvas(modifierM1033height3ABfNKs3, (Function1) objRememberedValue, composer2, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier6;
                z5 = z3;
                sliderColors3 = sliderColors6;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if ((i2 & 4) != 0) {
                        SliderColors sliderColorsColors4 = colors(composerStartRestartGroup, (i3 >> 12) & 14);
                        i3 &= -897;
                        sliderColors2 = sliderColorsColors4;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                } else {
                    if (i8 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if ((i2 & 4) != 0) {
                        SliderColors sliderColorsColors5 = colors(composerStartRestartGroup, (i3 >> 12) & 14);
                        i3 &= -897;
                        sliderColors2 = sliderColorsColors5;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                }
                SliderColors sliderColors7 = sliderColors2;
                i7 = i3;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(593554206, i7, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1122)");
                }
                jM2394trackColorWaAFU9c$material3_release = sliderColors7.m2394trackColorWaAFU9c$material3_release(z3, false);
                jM2394trackColorWaAFU9c$material3_release2 = sliderColors7.m2394trackColorWaAFU9c$material3_release(z3, true);
                jM2393tickColorWaAFU9c$material3_release = sliderColors7.m2393tickColorWaAFU9c$material3_release(z3, false);
                jM2393tickColorWaAFU9c$material3_release2 = sliderColors7.m2393tickColorWaAFU9c$material3_release(z3, true);
                Modifier modifierM1033height3ABfNKs4 = SizeKt.m1033height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), SliderKt.getTrackHeight());
                composer2 = composerStartRestartGroup;
                composer2.startReplaceableGroup(-1134217104);
                if ((i7 & 14) == 4) {
                }
                zChanged = composer2.changed(jM2394trackColorWaAFU9c$material3_release);
                Modifier modifier7 = companion;
                zChanged2 = composer2.changed(jM2394trackColorWaAFU9c$material3_release2);
                zChanged3 = composer2.changed(jM2393tickColorWaAFU9c$material3_release);
                zChanged4 = composer2.changed(jM2393tickColorWaAFU9c$material3_release2);
                objRememberedValue = composer2.rememberedValue();
                if (!(zChanged | z4 | zChanged2 | zChanged3 | zChanged4)) {
                    objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$3$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DrawScope drawScope) {
                            SliderDefaults.INSTANCE.m2396drawTrackLUBghH0(drawScope, sliderState.getTickFractions(), 0.0f, sliderState.getCoercedValueAsFraction$material3_release(), jM2394trackColorWaAFU9c$material3_release, jM2394trackColorWaAFU9c$material3_release2, jM2393tickColorWaAFU9c$material3_release, jM2393tickColorWaAFU9c$material3_release2);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$3$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DrawScope drawScope) {
                            SliderDefaults.INSTANCE.m2396drawTrackLUBghH0(drawScope, sliderState.getTickFractions(), 0.0f, sliderState.getCoercedValueAsFraction$material3_release(), jM2394trackColorWaAFU9c$material3_release, jM2394trackColorWaAFU9c$material3_release2, jM2393tickColorWaAFU9c$material3_release, jM2393tickColorWaAFU9c$material3_release2);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceableGroup();
                CanvasKt.Canvas(modifierM1033height3ABfNKs4, (Function1) objRememberedValue, composer2, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier7;
                z5 = z3;
                sliderColors3 = sliderColors7;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderDefaults.Track.4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i10) {
                        SliderDefaults.this.Track(sliderState, modifier3, sliderColors3, z5, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                sliderColors2 = sliderColors;
                if (composerStartRestartGroup.changed(sliderColors2)) {
                }
                i3 |= i9;
            } else {
                sliderColors2 = sliderColors;
            }
            i3 |= i9;
        } else {
            sliderColors2 = sliderColors;
        }
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                z2 = z;
                if (composerStartRestartGroup.changed(z2)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            if ((i2 & 16) != 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                if (composerStartRestartGroup.changed(this)) {
                    i6 = 16384;
                } else {
                    i6 = 8192;
                }
                i3 |= i6;
            }
            if ((i3 & 9363) == 9362) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if ((i2 & 4) != 0) {
                        SliderColors sliderColorsColors6 = colors(composerStartRestartGroup, (i3 >> 12) & 14);
                        i3 &= -897;
                        sliderColors2 = sliderColorsColors6;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                } else {
                    if (i8 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if ((i2 & 4) != 0) {
                        SliderColors sliderColorsColors7 = colors(composerStartRestartGroup, (i3 >> 12) & 14);
                        i3 &= -897;
                        sliderColors2 = sliderColorsColors7;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                }
                SliderColors sliderColors8 = sliderColors2;
                i7 = i3;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(593554206, i7, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1122)");
                }
                jM2394trackColorWaAFU9c$material3_release = sliderColors8.m2394trackColorWaAFU9c$material3_release(z3, false);
                jM2394trackColorWaAFU9c$material3_release2 = sliderColors8.m2394trackColorWaAFU9c$material3_release(z3, true);
                jM2393tickColorWaAFU9c$material3_release = sliderColors8.m2393tickColorWaAFU9c$material3_release(z3, false);
                jM2393tickColorWaAFU9c$material3_release2 = sliderColors8.m2393tickColorWaAFU9c$material3_release(z3, true);
                Modifier modifierM1033height3ABfNKs5 = SizeKt.m1033height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), SliderKt.getTrackHeight());
                composer2 = composerStartRestartGroup;
                composer2.startReplaceableGroup(-1134217104);
                if ((i7 & 14) == 4) {
                }
                zChanged = composer2.changed(jM2394trackColorWaAFU9c$material3_release);
                Modifier modifier8 = companion;
                zChanged2 = composer2.changed(jM2394trackColorWaAFU9c$material3_release2);
                zChanged3 = composer2.changed(jM2393tickColorWaAFU9c$material3_release);
                zChanged4 = composer2.changed(jM2393tickColorWaAFU9c$material3_release2);
                objRememberedValue = composer2.rememberedValue();
                if (!(zChanged | z4 | zChanged2 | zChanged3 | zChanged4)) {
                    objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$3$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DrawScope drawScope) {
                            SliderDefaults.INSTANCE.m2396drawTrackLUBghH0(drawScope, sliderState.getTickFractions(), 0.0f, sliderState.getCoercedValueAsFraction$material3_release(), jM2394trackColorWaAFU9c$material3_release, jM2394trackColorWaAFU9c$material3_release2, jM2393tickColorWaAFU9c$material3_release, jM2393tickColorWaAFU9c$material3_release2);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$3$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DrawScope drawScope) {
                            SliderDefaults.INSTANCE.m2396drawTrackLUBghH0(drawScope, sliderState.getTickFractions(), 0.0f, sliderState.getCoercedValueAsFraction$material3_release(), jM2394trackColorWaAFU9c$material3_release, jM2394trackColorWaAFU9c$material3_release2, jM2393tickColorWaAFU9c$material3_release, jM2393tickColorWaAFU9c$material3_release2);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceableGroup();
                CanvasKt.Canvas(modifierM1033height3ABfNKs5, (Function1) objRememberedValue, composer2, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier8;
                z5 = z3;
                sliderColors3 = sliderColors8;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if ((i2 & 4) != 0) {
                        SliderColors sliderColorsColors8 = colors(composerStartRestartGroup, (i3 >> 12) & 14);
                        i3 &= -897;
                        sliderColors2 = sliderColorsColors8;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                } else {
                    if (i8 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if ((i2 & 4) != 0) {
                        SliderColors sliderColorsColors9 = colors(composerStartRestartGroup, (i3 >> 12) & 14);
                        i3 &= -897;
                        sliderColors2 = sliderColorsColors9;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                }
                SliderColors sliderColors9 = sliderColors2;
                i7 = i3;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(593554206, i7, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1122)");
                }
                jM2394trackColorWaAFU9c$material3_release = sliderColors9.m2394trackColorWaAFU9c$material3_release(z3, false);
                jM2394trackColorWaAFU9c$material3_release2 = sliderColors9.m2394trackColorWaAFU9c$material3_release(z3, true);
                jM2393tickColorWaAFU9c$material3_release = sliderColors9.m2393tickColorWaAFU9c$material3_release(z3, false);
                jM2393tickColorWaAFU9c$material3_release2 = sliderColors9.m2393tickColorWaAFU9c$material3_release(z3, true);
                Modifier modifierM1033height3ABfNKs6 = SizeKt.m1033height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), SliderKt.getTrackHeight());
                composer2 = composerStartRestartGroup;
                composer2.startReplaceableGroup(-1134217104);
                if ((i7 & 14) == 4) {
                }
                zChanged = composer2.changed(jM2394trackColorWaAFU9c$material3_release);
                Modifier modifier9 = companion;
                zChanged2 = composer2.changed(jM2394trackColorWaAFU9c$material3_release2);
                zChanged3 = composer2.changed(jM2393tickColorWaAFU9c$material3_release);
                zChanged4 = composer2.changed(jM2393tickColorWaAFU9c$material3_release2);
                objRememberedValue = composer2.rememberedValue();
                if (!(zChanged | z4 | zChanged2 | zChanged3 | zChanged4)) {
                    objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$3$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DrawScope drawScope) {
                            SliderDefaults.INSTANCE.m2396drawTrackLUBghH0(drawScope, sliderState.getTickFractions(), 0.0f, sliderState.getCoercedValueAsFraction$material3_release(), jM2394trackColorWaAFU9c$material3_release, jM2394trackColorWaAFU9c$material3_release2, jM2393tickColorWaAFU9c$material3_release, jM2393tickColorWaAFU9c$material3_release2);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$3$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DrawScope drawScope) {
                            SliderDefaults.INSTANCE.m2396drawTrackLUBghH0(drawScope, sliderState.getTickFractions(), 0.0f, sliderState.getCoercedValueAsFraction$material3_release(), jM2394trackColorWaAFU9c$material3_release, jM2394trackColorWaAFU9c$material3_release2, jM2393tickColorWaAFU9c$material3_release, jM2393tickColorWaAFU9c$material3_release2);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceableGroup();
                CanvasKt.Canvas(modifierM1033height3ABfNKs6, (Function1) objRememberedValue, composer2, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier9;
                z5 = z3;
                sliderColors3 = sliderColors9;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderDefaults.Track.4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i10) {
                        SliderDefaults.this.Track(sliderState, modifier3, sliderColors3, z5, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 3072;
        z2 = z;
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            if (composerStartRestartGroup.changed(this)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i3 |= i6;
        }
        if ((i3 & 9363) == 9362) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i8 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier2;
                }
                if ((i2 & 4) != 0) {
                    SliderColors sliderColorsColors10 = colors(composerStartRestartGroup, (i3 >> 12) & 14);
                    i3 &= -897;
                    sliderColors2 = sliderColorsColors10;
                }
                if (i4 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
            } else {
                if (i8 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier2;
                }
                if ((i2 & 4) != 0) {
                    SliderColors sliderColorsColors11 = colors(composerStartRestartGroup, (i3 >> 12) & 14);
                    i3 &= -897;
                    sliderColors2 = sliderColorsColors11;
                }
                if (i4 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
            }
            SliderColors sliderColors10 = sliderColors2;
            i7 = i3;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(593554206, i7, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1122)");
            }
            jM2394trackColorWaAFU9c$material3_release = sliderColors10.m2394trackColorWaAFU9c$material3_release(z3, false);
            jM2394trackColorWaAFU9c$material3_release2 = sliderColors10.m2394trackColorWaAFU9c$material3_release(z3, true);
            jM2393tickColorWaAFU9c$material3_release = sliderColors10.m2393tickColorWaAFU9c$material3_release(z3, false);
            jM2393tickColorWaAFU9c$material3_release2 = sliderColors10.m2393tickColorWaAFU9c$material3_release(z3, true);
            Modifier modifierM1033height3ABfNKs7 = SizeKt.m1033height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), SliderKt.getTrackHeight());
            composer2 = composerStartRestartGroup;
            composer2.startReplaceableGroup(-1134217104);
            if ((i7 & 14) == 4) {
            }
            zChanged = composer2.changed(jM2394trackColorWaAFU9c$material3_release);
            Modifier modifier10 = companion;
            zChanged2 = composer2.changed(jM2394trackColorWaAFU9c$material3_release2);
            zChanged3 = composer2.changed(jM2393tickColorWaAFU9c$material3_release);
            zChanged4 = composer2.changed(jM2393tickColorWaAFU9c$material3_release2);
            objRememberedValue = composer2.rememberedValue();
            if (!(zChanged | z4 | zChanged2 | zChanged3 | zChanged4)) {
                objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$3$1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                        invoke2(drawScope);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(DrawScope drawScope) {
                        SliderDefaults.INSTANCE.m2396drawTrackLUBghH0(drawScope, sliderState.getTickFractions(), 0.0f, sliderState.getCoercedValueAsFraction$material3_release(), jM2394trackColorWaAFU9c$material3_release, jM2394trackColorWaAFU9c$material3_release2, jM2393tickColorWaAFU9c$material3_release, jM2393tickColorWaAFU9c$material3_release2);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$3$1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                        invoke2(drawScope);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(DrawScope drawScope) {
                        SliderDefaults.INSTANCE.m2396drawTrackLUBghH0(drawScope, sliderState.getTickFractions(), 0.0f, sliderState.getCoercedValueAsFraction$material3_release(), jM2394trackColorWaAFU9c$material3_release, jM2394trackColorWaAFU9c$material3_release2, jM2393tickColorWaAFU9c$material3_release, jM2393tickColorWaAFU9c$material3_release2);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceableGroup();
            CanvasKt.Canvas(modifierM1033height3ABfNKs7, (Function1) objRememberedValue, composer2, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier10;
            z5 = z3;
            sliderColors3 = sliderColors10;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i8 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier2;
                }
                if ((i2 & 4) != 0) {
                    SliderColors sliderColorsColors12 = colors(composerStartRestartGroup, (i3 >> 12) & 14);
                    i3 &= -897;
                    sliderColors2 = sliderColorsColors12;
                }
                if (i4 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
            } else {
                if (i8 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier2;
                }
                if ((i2 & 4) != 0) {
                    SliderColors sliderColorsColors13 = colors(composerStartRestartGroup, (i3 >> 12) & 14);
                    i3 &= -897;
                    sliderColors2 = sliderColorsColors13;
                }
                if (i4 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
            }
            SliderColors sliderColors11 = sliderColors2;
            i7 = i3;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(593554206, i7, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1122)");
            }
            jM2394trackColorWaAFU9c$material3_release = sliderColors11.m2394trackColorWaAFU9c$material3_release(z3, false);
            jM2394trackColorWaAFU9c$material3_release2 = sliderColors11.m2394trackColorWaAFU9c$material3_release(z3, true);
            jM2393tickColorWaAFU9c$material3_release = sliderColors11.m2393tickColorWaAFU9c$material3_release(z3, false);
            jM2393tickColorWaAFU9c$material3_release2 = sliderColors11.m2393tickColorWaAFU9c$material3_release(z3, true);
            Modifier modifierM1033height3ABfNKs8 = SizeKt.m1033height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), SliderKt.getTrackHeight());
            composer2 = composerStartRestartGroup;
            composer2.startReplaceableGroup(-1134217104);
            if ((i7 & 14) == 4) {
            }
            zChanged = composer2.changed(jM2394trackColorWaAFU9c$material3_release);
            Modifier modifier11 = companion;
            zChanged2 = composer2.changed(jM2394trackColorWaAFU9c$material3_release2);
            zChanged3 = composer2.changed(jM2393tickColorWaAFU9c$material3_release);
            zChanged4 = composer2.changed(jM2393tickColorWaAFU9c$material3_release2);
            objRememberedValue = composer2.rememberedValue();
            if (!(zChanged | z4 | zChanged2 | zChanged3 | zChanged4)) {
                objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$3$1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                        invoke2(drawScope);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(DrawScope drawScope) {
                        SliderDefaults.INSTANCE.m2396drawTrackLUBghH0(drawScope, sliderState.getTickFractions(), 0.0f, sliderState.getCoercedValueAsFraction$material3_release(), jM2394trackColorWaAFU9c$material3_release, jM2394trackColorWaAFU9c$material3_release2, jM2393tickColorWaAFU9c$material3_release, jM2393tickColorWaAFU9c$material3_release2);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$3$1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                        invoke2(drawScope);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(DrawScope drawScope) {
                        SliderDefaults.INSTANCE.m2396drawTrackLUBghH0(drawScope, sliderState.getTickFractions(), 0.0f, sliderState.getCoercedValueAsFraction$material3_release(), jM2394trackColorWaAFU9c$material3_release, jM2394trackColorWaAFU9c$material3_release2, jM2393tickColorWaAFU9c$material3_release, jM2393tickColorWaAFU9c$material3_release2);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceableGroup();
            CanvasKt.Canvas(modifierM1033height3ABfNKs8, (Function1) objRememberedValue, composer2, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier11;
            z5 = z3;
            sliderColors3 = sliderColors11;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderDefaults.Track.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i10) {
                    SliderDefaults.this.Track(sliderState, modifier3, sliderColors3, z5, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:31:0x005a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:40:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082  */
    /* JADX WARN: Code duplicated, block: B:49:0x0085  */
    /* JADX WARN: Code duplicated, block: B:51:0x0089  */
    /* JADX WARN: Code duplicated, block: B:53:0x008f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0092  */
    /* JADX WARN: Code duplicated, block: B:58:0x009b  */
    /* JADX WARN: Code duplicated, block: B:61:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:76:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:77:0x00de A[PHI: r4 r5 r9
  0x00de: PHI (r4v20 int) = (r4v14 int), (r4v21 int) binds: [B:75:0x00da, B:68:0x00c1] A[DONT_GENERATE, DONT_INLINE]
  0x00de: PHI (r5v7 androidx.compose.ui.Modifier) = (r5v2 androidx.compose.ui.Modifier), (r5v9 androidx.compose.ui.Modifier) binds: [B:75:0x00da, B:68:0x00c1] A[DONT_GENERATE, DONT_INLINE]
  0x00de: PHI (r9v20 androidx.compose.material3.SliderColors) = (r9v7 androidx.compose.material3.SliderColors), (r9v6 androidx.compose.material3.SliderColors) binds: [B:75:0x00da, B:68:0x00c1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:80:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:84:0x0124  */
    /* JADX WARN: Code duplicated, block: B:87:0x0147  */
    /* JADX WARN: Code duplicated, block: B:89:0x014f  */
    /* JADX WARN: Code duplicated, block: B:92:0x016f  */
    /* JADX WARN: Code duplicated, block: B:96:0x017d  */
    /* JADX WARN: Code duplicated, block: B:98:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:61:0x00aa, please report this as an issue */
    public final void Track(final RangeSliderState rangeSliderState, Modifier modifier, SliderColors sliderColors, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        SliderColors sliderColors2;
        int i4;
        boolean z2;
        int i5;
        int i6;
        Modifier.Companion companion;
        boolean z3;
        int i7;
        final long jM2394trackColorWaAFU9c$material3_release;
        final long jM2394trackColorWaAFU9c$material3_release2;
        final long jM2393tickColorWaAFU9c$material3_release;
        final long jM2393tickColorWaAFU9c$material3_release2;
        Composer composer2;
        boolean z4;
        boolean zChanged;
        boolean zChanged2;
        boolean zChanged3;
        boolean zChanged4;
        Object objRememberedValue;
        final Modifier modifier3;
        final boolean z5;
        final SliderColors sliderColors3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1617869097);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(rangeSliderState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                if ((i2 & 4) == 0) {
                    sliderColors2 = sliderColors;
                    int i9 = composerStartRestartGroup.changed(sliderColors2) ? 256 : 128;
                    i3 |= i9;
                } else {
                    sliderColors2 = sliderColors;
                }
                i3 |= i9;
            } else {
                sliderColors2 = sliderColors;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    z2 = z;
                    if (composerStartRestartGroup.changed(z2)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    if (composerStartRestartGroup.changed(this)) {
                        i6 = 16384;
                    } else {
                        i6 = 8192;
                    }
                    i3 |= i6;
                }
                if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i8 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier2;
                        }
                        if ((i2 & 4) != 0) {
                            SliderColors sliderColorsColors = colors(composerStartRestartGroup, (i3 >> 12) & 14);
                            i3 &= -897;
                            sliderColors2 = sliderColorsColors;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        SliderColors sliderColors4 = sliderColors2;
                        i7 = i3;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1617869097, i7, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1162)");
                        }
                        jM2394trackColorWaAFU9c$material3_release = sliderColors4.m2394trackColorWaAFU9c$material3_release(z3, false);
                        jM2394trackColorWaAFU9c$material3_release2 = sliderColors4.m2394trackColorWaAFU9c$material3_release(z3, true);
                        jM2393tickColorWaAFU9c$material3_release = sliderColors4.m2393tickColorWaAFU9c$material3_release(z3, false);
                        jM2393tickColorWaAFU9c$material3_release2 = sliderColors4.m2393tickColorWaAFU9c$material3_release(z3, true);
                        Modifier modifierM1033height3ABfNKs = SizeKt.m1033height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), SliderKt.getTrackHeight());
                        composer2 = composerStartRestartGroup;
                        composer2.startReplaceableGroup(-1134215545);
                        z4 = (i7 & 14) == 4;
                        zChanged = composer2.changed(jM2394trackColorWaAFU9c$material3_release);
                        Modifier modifier4 = companion;
                        zChanged2 = composer2.changed(jM2394trackColorWaAFU9c$material3_release2);
                        zChanged3 = composer2.changed(jM2393tickColorWaAFU9c$material3_release);
                        zChanged4 = composer2.changed(jM2393tickColorWaAFU9c$material3_release2);
                        objRememberedValue = composer2.rememberedValue();
                        if (!(zChanged | z4 | zChanged2 | zChanged3 | zChanged4) || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$5$1
                                @Override // kotlin.jvm.functions.Function1
                                public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                    invoke2(drawScope);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(DrawScope drawScope) {
                                    SliderDefaults.INSTANCE.m2396drawTrackLUBghH0(drawScope, rangeSliderState.getTickFractions(), rangeSliderState.getCoercedActiveRangeStartAsFraction$material3_release(), rangeSliderState.getCoercedActiveRangeEndAsFraction$material3_release(), jM2394trackColorWaAFU9c$material3_release, jM2394trackColorWaAFU9c$material3_release2, jM2393tickColorWaAFU9c$material3_release, jM2393tickColorWaAFU9c$material3_release2);
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        composer2.endReplaceableGroup();
                        CanvasKt.Canvas(modifierM1033height3ABfNKs, (Function1) objRememberedValue, composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                        z5 = z3;
                        sliderColors3 = sliderColors4;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        companion = modifier2;
                    }
                    z3 = z2;
                    SliderColors sliderColors5 = sliderColors2;
                    i7 = i3;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1617869097, i7, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1162)");
                    }
                    jM2394trackColorWaAFU9c$material3_release = sliderColors5.m2394trackColorWaAFU9c$material3_release(z3, false);
                    jM2394trackColorWaAFU9c$material3_release2 = sliderColors5.m2394trackColorWaAFU9c$material3_release(z3, true);
                    jM2393tickColorWaAFU9c$material3_release = sliderColors5.m2393tickColorWaAFU9c$material3_release(z3, false);
                    jM2393tickColorWaAFU9c$material3_release2 = sliderColors5.m2393tickColorWaAFU9c$material3_release(z3, true);
                    Modifier modifierM1033height3ABfNKs2 = SizeKt.m1033height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), SliderKt.getTrackHeight());
                    composer2 = composerStartRestartGroup;
                    composer2.startReplaceableGroup(-1134215545);
                    if ((i7 & 14) == 4) {
                    }
                    zChanged = composer2.changed(jM2394trackColorWaAFU9c$material3_release);
                    Modifier modifier5 = companion;
                    zChanged2 = composer2.changed(jM2394trackColorWaAFU9c$material3_release2);
                    zChanged3 = composer2.changed(jM2393tickColorWaAFU9c$material3_release);
                    zChanged4 = composer2.changed(jM2393tickColorWaAFU9c$material3_release2);
                    objRememberedValue = composer2.rememberedValue();
                    if (!(zChanged | z4 | zChanged2 | zChanged3 | zChanged4)) {
                        objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$5$1
                            @Override // kotlin.jvm.functions.Function1
                            public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                invoke2(drawScope);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(DrawScope drawScope) {
                                SliderDefaults.INSTANCE.m2396drawTrackLUBghH0(drawScope, rangeSliderState.getTickFractions(), rangeSliderState.getCoercedActiveRangeStartAsFraction$material3_release(), rangeSliderState.getCoercedActiveRangeEndAsFraction$material3_release(), jM2394trackColorWaAFU9c$material3_release, jM2394trackColorWaAFU9c$material3_release2, jM2393tickColorWaAFU9c$material3_release, jM2393tickColorWaAFU9c$material3_release2);
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$5$1
                            @Override // kotlin.jvm.functions.Function1
                            public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                invoke2(drawScope);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(DrawScope drawScope) {
                                SliderDefaults.INSTANCE.m2396drawTrackLUBghH0(drawScope, rangeSliderState.getTickFractions(), rangeSliderState.getCoercedActiveRangeStartAsFraction$material3_release(), rangeSliderState.getCoercedActiveRangeEndAsFraction$material3_release(), jM2394trackColorWaAFU9c$material3_release, jM2394trackColorWaAFU9c$material3_release2, jM2393tickColorWaAFU9c$material3_release, jM2393tickColorWaAFU9c$material3_release2);
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    composer2.endReplaceableGroup();
                    CanvasKt.Canvas(modifierM1033height3ABfNKs2, (Function1) objRememberedValue, composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                    z5 = z3;
                    sliderColors3 = sliderColors5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier2;
                    sliderColors3 = sliderColors2;
                    z5 = z2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderDefaults.Track.6
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i10) {
                            SliderDefaults.this.Track(rangeSliderState, modifier3, sliderColors3, z5, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 3072;
            z2 = z;
            if ((i2 & 16) != 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                if (composerStartRestartGroup.changed(this)) {
                    i6 = 16384;
                } else {
                    i6 = 8192;
                }
                i3 |= i6;
            }
            if ((i3 & 9363) == 9362) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if ((i2 & 4) != 0) {
                        SliderColors sliderColorsColors2 = colors(composerStartRestartGroup, (i3 >> 12) & 14);
                        i3 &= -897;
                        sliderColors2 = sliderColorsColors2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                } else {
                    if (i8 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if ((i2 & 4) != 0) {
                        SliderColors sliderColorsColors3 = colors(composerStartRestartGroup, (i3 >> 12) & 14);
                        i3 &= -897;
                        sliderColors2 = sliderColorsColors3;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                }
                SliderColors sliderColors6 = sliderColors2;
                i7 = i3;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1617869097, i7, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1162)");
                }
                jM2394trackColorWaAFU9c$material3_release = sliderColors6.m2394trackColorWaAFU9c$material3_release(z3, false);
                jM2394trackColorWaAFU9c$material3_release2 = sliderColors6.m2394trackColorWaAFU9c$material3_release(z3, true);
                jM2393tickColorWaAFU9c$material3_release = sliderColors6.m2393tickColorWaAFU9c$material3_release(z3, false);
                jM2393tickColorWaAFU9c$material3_release2 = sliderColors6.m2393tickColorWaAFU9c$material3_release(z3, true);
                Modifier modifierM1033height3ABfNKs3 = SizeKt.m1033height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), SliderKt.getTrackHeight());
                composer2 = composerStartRestartGroup;
                composer2.startReplaceableGroup(-1134215545);
                if ((i7 & 14) == 4) {
                }
                zChanged = composer2.changed(jM2394trackColorWaAFU9c$material3_release);
                Modifier modifier6 = companion;
                zChanged2 = composer2.changed(jM2394trackColorWaAFU9c$material3_release2);
                zChanged3 = composer2.changed(jM2393tickColorWaAFU9c$material3_release);
                zChanged4 = composer2.changed(jM2393tickColorWaAFU9c$material3_release2);
                objRememberedValue = composer2.rememberedValue();
                if (!(zChanged | z4 | zChanged2 | zChanged3 | zChanged4)) {
                    objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$5$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DrawScope drawScope) {
                            SliderDefaults.INSTANCE.m2396drawTrackLUBghH0(drawScope, rangeSliderState.getTickFractions(), rangeSliderState.getCoercedActiveRangeStartAsFraction$material3_release(), rangeSliderState.getCoercedActiveRangeEndAsFraction$material3_release(), jM2394trackColorWaAFU9c$material3_release, jM2394trackColorWaAFU9c$material3_release2, jM2393tickColorWaAFU9c$material3_release, jM2393tickColorWaAFU9c$material3_release2);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$5$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DrawScope drawScope) {
                            SliderDefaults.INSTANCE.m2396drawTrackLUBghH0(drawScope, rangeSliderState.getTickFractions(), rangeSliderState.getCoercedActiveRangeStartAsFraction$material3_release(), rangeSliderState.getCoercedActiveRangeEndAsFraction$material3_release(), jM2394trackColorWaAFU9c$material3_release, jM2394trackColorWaAFU9c$material3_release2, jM2393tickColorWaAFU9c$material3_release, jM2393tickColorWaAFU9c$material3_release2);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceableGroup();
                CanvasKt.Canvas(modifierM1033height3ABfNKs3, (Function1) objRememberedValue, composer2, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier6;
                z5 = z3;
                sliderColors3 = sliderColors6;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if ((i2 & 4) != 0) {
                        SliderColors sliderColorsColors4 = colors(composerStartRestartGroup, (i3 >> 12) & 14);
                        i3 &= -897;
                        sliderColors2 = sliderColorsColors4;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                } else {
                    if (i8 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if ((i2 & 4) != 0) {
                        SliderColors sliderColorsColors5 = colors(composerStartRestartGroup, (i3 >> 12) & 14);
                        i3 &= -897;
                        sliderColors2 = sliderColorsColors5;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                }
                SliderColors sliderColors7 = sliderColors2;
                i7 = i3;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1617869097, i7, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1162)");
                }
                jM2394trackColorWaAFU9c$material3_release = sliderColors7.m2394trackColorWaAFU9c$material3_release(z3, false);
                jM2394trackColorWaAFU9c$material3_release2 = sliderColors7.m2394trackColorWaAFU9c$material3_release(z3, true);
                jM2393tickColorWaAFU9c$material3_release = sliderColors7.m2393tickColorWaAFU9c$material3_release(z3, false);
                jM2393tickColorWaAFU9c$material3_release2 = sliderColors7.m2393tickColorWaAFU9c$material3_release(z3, true);
                Modifier modifierM1033height3ABfNKs4 = SizeKt.m1033height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), SliderKt.getTrackHeight());
                composer2 = composerStartRestartGroup;
                composer2.startReplaceableGroup(-1134215545);
                if ((i7 & 14) == 4) {
                }
                zChanged = composer2.changed(jM2394trackColorWaAFU9c$material3_release);
                Modifier modifier7 = companion;
                zChanged2 = composer2.changed(jM2394trackColorWaAFU9c$material3_release2);
                zChanged3 = composer2.changed(jM2393tickColorWaAFU9c$material3_release);
                zChanged4 = composer2.changed(jM2393tickColorWaAFU9c$material3_release2);
                objRememberedValue = composer2.rememberedValue();
                if (!(zChanged | z4 | zChanged2 | zChanged3 | zChanged4)) {
                    objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$5$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DrawScope drawScope) {
                            SliderDefaults.INSTANCE.m2396drawTrackLUBghH0(drawScope, rangeSliderState.getTickFractions(), rangeSliderState.getCoercedActiveRangeStartAsFraction$material3_release(), rangeSliderState.getCoercedActiveRangeEndAsFraction$material3_release(), jM2394trackColorWaAFU9c$material3_release, jM2394trackColorWaAFU9c$material3_release2, jM2393tickColorWaAFU9c$material3_release, jM2393tickColorWaAFU9c$material3_release2);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$5$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DrawScope drawScope) {
                            SliderDefaults.INSTANCE.m2396drawTrackLUBghH0(drawScope, rangeSliderState.getTickFractions(), rangeSliderState.getCoercedActiveRangeStartAsFraction$material3_release(), rangeSliderState.getCoercedActiveRangeEndAsFraction$material3_release(), jM2394trackColorWaAFU9c$material3_release, jM2394trackColorWaAFU9c$material3_release2, jM2393tickColorWaAFU9c$material3_release, jM2393tickColorWaAFU9c$material3_release2);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceableGroup();
                CanvasKt.Canvas(modifierM1033height3ABfNKs4, (Function1) objRememberedValue, composer2, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier7;
                z5 = z3;
                sliderColors3 = sliderColors7;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderDefaults.Track.6
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i10) {
                        SliderDefaults.this.Track(rangeSliderState, modifier3, sliderColors3, z5, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                sliderColors2 = sliderColors;
                if (composerStartRestartGroup.changed(sliderColors2)) {
                }
                i3 |= i9;
            } else {
                sliderColors2 = sliderColors;
            }
            i3 |= i9;
        } else {
            sliderColors2 = sliderColors;
        }
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                z2 = z;
                if (composerStartRestartGroup.changed(z2)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            if ((i2 & 16) != 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                if (composerStartRestartGroup.changed(this)) {
                    i6 = 16384;
                } else {
                    i6 = 8192;
                }
                i3 |= i6;
            }
            if ((i3 & 9363) == 9362) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if ((i2 & 4) != 0) {
                        SliderColors sliderColorsColors6 = colors(composerStartRestartGroup, (i3 >> 12) & 14);
                        i3 &= -897;
                        sliderColors2 = sliderColorsColors6;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                } else {
                    if (i8 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if ((i2 & 4) != 0) {
                        SliderColors sliderColorsColors7 = colors(composerStartRestartGroup, (i3 >> 12) & 14);
                        i3 &= -897;
                        sliderColors2 = sliderColorsColors7;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                }
                SliderColors sliderColors8 = sliderColors2;
                i7 = i3;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1617869097, i7, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1162)");
                }
                jM2394trackColorWaAFU9c$material3_release = sliderColors8.m2394trackColorWaAFU9c$material3_release(z3, false);
                jM2394trackColorWaAFU9c$material3_release2 = sliderColors8.m2394trackColorWaAFU9c$material3_release(z3, true);
                jM2393tickColorWaAFU9c$material3_release = sliderColors8.m2393tickColorWaAFU9c$material3_release(z3, false);
                jM2393tickColorWaAFU9c$material3_release2 = sliderColors8.m2393tickColorWaAFU9c$material3_release(z3, true);
                Modifier modifierM1033height3ABfNKs5 = SizeKt.m1033height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), SliderKt.getTrackHeight());
                composer2 = composerStartRestartGroup;
                composer2.startReplaceableGroup(-1134215545);
                if ((i7 & 14) == 4) {
                }
                zChanged = composer2.changed(jM2394trackColorWaAFU9c$material3_release);
                Modifier modifier8 = companion;
                zChanged2 = composer2.changed(jM2394trackColorWaAFU9c$material3_release2);
                zChanged3 = composer2.changed(jM2393tickColorWaAFU9c$material3_release);
                zChanged4 = composer2.changed(jM2393tickColorWaAFU9c$material3_release2);
                objRememberedValue = composer2.rememberedValue();
                if (!(zChanged | z4 | zChanged2 | zChanged3 | zChanged4)) {
                    objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$5$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DrawScope drawScope) {
                            SliderDefaults.INSTANCE.m2396drawTrackLUBghH0(drawScope, rangeSliderState.getTickFractions(), rangeSliderState.getCoercedActiveRangeStartAsFraction$material3_release(), rangeSliderState.getCoercedActiveRangeEndAsFraction$material3_release(), jM2394trackColorWaAFU9c$material3_release, jM2394trackColorWaAFU9c$material3_release2, jM2393tickColorWaAFU9c$material3_release, jM2393tickColorWaAFU9c$material3_release2);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$5$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DrawScope drawScope) {
                            SliderDefaults.INSTANCE.m2396drawTrackLUBghH0(drawScope, rangeSliderState.getTickFractions(), rangeSliderState.getCoercedActiveRangeStartAsFraction$material3_release(), rangeSliderState.getCoercedActiveRangeEndAsFraction$material3_release(), jM2394trackColorWaAFU9c$material3_release, jM2394trackColorWaAFU9c$material3_release2, jM2393tickColorWaAFU9c$material3_release, jM2393tickColorWaAFU9c$material3_release2);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceableGroup();
                CanvasKt.Canvas(modifierM1033height3ABfNKs5, (Function1) objRememberedValue, composer2, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier8;
                z5 = z3;
                sliderColors3 = sliderColors8;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if ((i2 & 4) != 0) {
                        SliderColors sliderColorsColors8 = colors(composerStartRestartGroup, (i3 >> 12) & 14);
                        i3 &= -897;
                        sliderColors2 = sliderColorsColors8;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                } else {
                    if (i8 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if ((i2 & 4) != 0) {
                        SliderColors sliderColorsColors9 = colors(composerStartRestartGroup, (i3 >> 12) & 14);
                        i3 &= -897;
                        sliderColors2 = sliderColorsColors9;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                }
                SliderColors sliderColors9 = sliderColors2;
                i7 = i3;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1617869097, i7, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1162)");
                }
                jM2394trackColorWaAFU9c$material3_release = sliderColors9.m2394trackColorWaAFU9c$material3_release(z3, false);
                jM2394trackColorWaAFU9c$material3_release2 = sliderColors9.m2394trackColorWaAFU9c$material3_release(z3, true);
                jM2393tickColorWaAFU9c$material3_release = sliderColors9.m2393tickColorWaAFU9c$material3_release(z3, false);
                jM2393tickColorWaAFU9c$material3_release2 = sliderColors9.m2393tickColorWaAFU9c$material3_release(z3, true);
                Modifier modifierM1033height3ABfNKs6 = SizeKt.m1033height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), SliderKt.getTrackHeight());
                composer2 = composerStartRestartGroup;
                composer2.startReplaceableGroup(-1134215545);
                if ((i7 & 14) == 4) {
                }
                zChanged = composer2.changed(jM2394trackColorWaAFU9c$material3_release);
                Modifier modifier9 = companion;
                zChanged2 = composer2.changed(jM2394trackColorWaAFU9c$material3_release2);
                zChanged3 = composer2.changed(jM2393tickColorWaAFU9c$material3_release);
                zChanged4 = composer2.changed(jM2393tickColorWaAFU9c$material3_release2);
                objRememberedValue = composer2.rememberedValue();
                if (!(zChanged | z4 | zChanged2 | zChanged3 | zChanged4)) {
                    objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$5$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DrawScope drawScope) {
                            SliderDefaults.INSTANCE.m2396drawTrackLUBghH0(drawScope, rangeSliderState.getTickFractions(), rangeSliderState.getCoercedActiveRangeStartAsFraction$material3_release(), rangeSliderState.getCoercedActiveRangeEndAsFraction$material3_release(), jM2394trackColorWaAFU9c$material3_release, jM2394trackColorWaAFU9c$material3_release2, jM2393tickColorWaAFU9c$material3_release, jM2393tickColorWaAFU9c$material3_release2);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$5$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DrawScope drawScope) {
                            SliderDefaults.INSTANCE.m2396drawTrackLUBghH0(drawScope, rangeSliderState.getTickFractions(), rangeSliderState.getCoercedActiveRangeStartAsFraction$material3_release(), rangeSliderState.getCoercedActiveRangeEndAsFraction$material3_release(), jM2394trackColorWaAFU9c$material3_release, jM2394trackColorWaAFU9c$material3_release2, jM2393tickColorWaAFU9c$material3_release, jM2393tickColorWaAFU9c$material3_release2);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceableGroup();
                CanvasKt.Canvas(modifierM1033height3ABfNKs6, (Function1) objRememberedValue, composer2, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier9;
                z5 = z3;
                sliderColors3 = sliderColors9;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderDefaults.Track.6
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i10) {
                        SliderDefaults.this.Track(rangeSliderState, modifier3, sliderColors3, z5, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 3072;
        z2 = z;
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            if (composerStartRestartGroup.changed(this)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i3 |= i6;
        }
        if ((i3 & 9363) == 9362) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i8 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier2;
                }
                if ((i2 & 4) != 0) {
                    SliderColors sliderColorsColors10 = colors(composerStartRestartGroup, (i3 >> 12) & 14);
                    i3 &= -897;
                    sliderColors2 = sliderColorsColors10;
                }
                if (i4 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
            } else {
                if (i8 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier2;
                }
                if ((i2 & 4) != 0) {
                    SliderColors sliderColorsColors11 = colors(composerStartRestartGroup, (i3 >> 12) & 14);
                    i3 &= -897;
                    sliderColors2 = sliderColorsColors11;
                }
                if (i4 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
            }
            SliderColors sliderColors10 = sliderColors2;
            i7 = i3;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1617869097, i7, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1162)");
            }
            jM2394trackColorWaAFU9c$material3_release = sliderColors10.m2394trackColorWaAFU9c$material3_release(z3, false);
            jM2394trackColorWaAFU9c$material3_release2 = sliderColors10.m2394trackColorWaAFU9c$material3_release(z3, true);
            jM2393tickColorWaAFU9c$material3_release = sliderColors10.m2393tickColorWaAFU9c$material3_release(z3, false);
            jM2393tickColorWaAFU9c$material3_release2 = sliderColors10.m2393tickColorWaAFU9c$material3_release(z3, true);
            Modifier modifierM1033height3ABfNKs7 = SizeKt.m1033height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), SliderKt.getTrackHeight());
            composer2 = composerStartRestartGroup;
            composer2.startReplaceableGroup(-1134215545);
            if ((i7 & 14) == 4) {
            }
            zChanged = composer2.changed(jM2394trackColorWaAFU9c$material3_release);
            Modifier modifier10 = companion;
            zChanged2 = composer2.changed(jM2394trackColorWaAFU9c$material3_release2);
            zChanged3 = composer2.changed(jM2393tickColorWaAFU9c$material3_release);
            zChanged4 = composer2.changed(jM2393tickColorWaAFU9c$material3_release2);
            objRememberedValue = composer2.rememberedValue();
            if (!(zChanged | z4 | zChanged2 | zChanged3 | zChanged4)) {
                objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$5$1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                        invoke2(drawScope);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(DrawScope drawScope) {
                        SliderDefaults.INSTANCE.m2396drawTrackLUBghH0(drawScope, rangeSliderState.getTickFractions(), rangeSliderState.getCoercedActiveRangeStartAsFraction$material3_release(), rangeSliderState.getCoercedActiveRangeEndAsFraction$material3_release(), jM2394trackColorWaAFU9c$material3_release, jM2394trackColorWaAFU9c$material3_release2, jM2393tickColorWaAFU9c$material3_release, jM2393tickColorWaAFU9c$material3_release2);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$5$1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                        invoke2(drawScope);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(DrawScope drawScope) {
                        SliderDefaults.INSTANCE.m2396drawTrackLUBghH0(drawScope, rangeSliderState.getTickFractions(), rangeSliderState.getCoercedActiveRangeStartAsFraction$material3_release(), rangeSliderState.getCoercedActiveRangeEndAsFraction$material3_release(), jM2394trackColorWaAFU9c$material3_release, jM2394trackColorWaAFU9c$material3_release2, jM2393tickColorWaAFU9c$material3_release, jM2393tickColorWaAFU9c$material3_release2);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceableGroup();
            CanvasKt.Canvas(modifierM1033height3ABfNKs7, (Function1) objRememberedValue, composer2, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier10;
            z5 = z3;
            sliderColors3 = sliderColors10;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i8 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier2;
                }
                if ((i2 & 4) != 0) {
                    SliderColors sliderColorsColors12 = colors(composerStartRestartGroup, (i3 >> 12) & 14);
                    i3 &= -897;
                    sliderColors2 = sliderColorsColors12;
                }
                if (i4 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
            } else {
                if (i8 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier2;
                }
                if ((i2 & 4) != 0) {
                    SliderColors sliderColorsColors13 = colors(composerStartRestartGroup, (i3 >> 12) & 14);
                    i3 &= -897;
                    sliderColors2 = sliderColorsColors13;
                }
                if (i4 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
            }
            SliderColors sliderColors11 = sliderColors2;
            i7 = i3;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1617869097, i7, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1162)");
            }
            jM2394trackColorWaAFU9c$material3_release = sliderColors11.m2394trackColorWaAFU9c$material3_release(z3, false);
            jM2394trackColorWaAFU9c$material3_release2 = sliderColors11.m2394trackColorWaAFU9c$material3_release(z3, true);
            jM2393tickColorWaAFU9c$material3_release = sliderColors11.m2393tickColorWaAFU9c$material3_release(z3, false);
            jM2393tickColorWaAFU9c$material3_release2 = sliderColors11.m2393tickColorWaAFU9c$material3_release(z3, true);
            Modifier modifierM1033height3ABfNKs8 = SizeKt.m1033height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), SliderKt.getTrackHeight());
            composer2 = composerStartRestartGroup;
            composer2.startReplaceableGroup(-1134215545);
            if ((i7 & 14) == 4) {
            }
            zChanged = composer2.changed(jM2394trackColorWaAFU9c$material3_release);
            Modifier modifier11 = companion;
            zChanged2 = composer2.changed(jM2394trackColorWaAFU9c$material3_release2);
            zChanged3 = composer2.changed(jM2393tickColorWaAFU9c$material3_release);
            zChanged4 = composer2.changed(jM2393tickColorWaAFU9c$material3_release2);
            objRememberedValue = composer2.rememberedValue();
            if (!(zChanged | z4 | zChanged2 | zChanged3 | zChanged4)) {
                objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$5$1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                        invoke2(drawScope);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(DrawScope drawScope) {
                        SliderDefaults.INSTANCE.m2396drawTrackLUBghH0(drawScope, rangeSliderState.getTickFractions(), rangeSliderState.getCoercedActiveRangeStartAsFraction$material3_release(), rangeSliderState.getCoercedActiveRangeEndAsFraction$material3_release(), jM2394trackColorWaAFU9c$material3_release, jM2394trackColorWaAFU9c$material3_release2, jM2393tickColorWaAFU9c$material3_release, jM2393tickColorWaAFU9c$material3_release2);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$5$1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                        invoke2(drawScope);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(DrawScope drawScope) {
                        SliderDefaults.INSTANCE.m2396drawTrackLUBghH0(drawScope, rangeSliderState.getTickFractions(), rangeSliderState.getCoercedActiveRangeStartAsFraction$material3_release(), rangeSliderState.getCoercedActiveRangeEndAsFraction$material3_release(), jM2394trackColorWaAFU9c$material3_release, jM2394trackColorWaAFU9c$material3_release2, jM2393tickColorWaAFU9c$material3_release, jM2393tickColorWaAFU9c$material3_release2);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceableGroup();
            CanvasKt.Canvas(modifierM1033height3ABfNKs8, (Function1) objRememberedValue, composer2, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier11;
            z5 = z3;
            sliderColors3 = sliderColors11;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderDefaults.Track.6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i10) {
                    SliderDefaults.this.Track(rangeSliderState, modifier3, sliderColors3, z5, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: drawTrack-LUBghH0, reason: not valid java name */
    public final void m2396drawTrackLUBghH0(DrawScope drawScope, float[] fArr, float f, float f2, long j, long j2, long j3, long j4) {
        boolean z = drawScope.getLayoutDirection() == LayoutDirection.Rtl;
        long jOffset = OffsetKt.Offset(0.0f, Offset.m3975getYimpl(drawScope.mo4797getCenterF1C5BW0()));
        long jOffset2 = OffsetKt.Offset(Size.m4043getWidthimpl(drawScope.mo4798getSizeNHjbRc()), Offset.m3975getYimpl(drawScope.mo4797getCenterF1C5BW0()));
        long j5 = z ? jOffset2 : jOffset;
        long j6 = !z ? jOffset2 : jOffset;
        float f3 = drawScope.mo694toPx0680j_4(SliderKt.TickSize);
        float f4 = drawScope.mo694toPx0680j_4(SliderKt.getTrackHeight());
        long j7 = j6;
        long j8 = j5;
        DrawScope.m4784drawLineNGM6Ib0$default(drawScope, j, j5, j6, f4, StrokeCap.INSTANCE.m4590getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
        DrawScope.m4784drawLineNGM6Ib0$default(drawScope, j2, OffsetKt.Offset(Offset.m3974getXimpl(j8) + ((Offset.m3974getXimpl(j7) - Offset.m3974getXimpl(j8)) * f), Offset.m3975getYimpl(drawScope.mo4797getCenterF1C5BW0())), OffsetKt.Offset(Offset.m3974getXimpl(j8) + ((Offset.m3974getXimpl(j7) - Offset.m3974getXimpl(j8)) * f2), Offset.m3975getYimpl(drawScope.mo4797getCenterF1C5BW0())), f4, StrokeCap.INSTANCE.m4590getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
        int length = fArr.length;
        int i = 0;
        while (i < length) {
            float f5 = fArr[i];
            long j9 = j8;
            DrawScope.m4779drawCircleVaOC9Bg$default(drawScope, (f5 > f2 || f5 < f) ? j3 : j4, f3 / 2.0f, OffsetKt.Offset(Offset.m3974getXimpl(OffsetKt.m3997lerpWko1d7g(j9, j7, f5)), Offset.m3975getYimpl(drawScope.mo4797getCenterF1C5BW0())), 0.0f, null, null, 0, 120, null);
            i++;
            j8 = j9;
            j7 = j7;
        }
    }
}
