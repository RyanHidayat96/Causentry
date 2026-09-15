package androidx.compose.material3;

import android.content.Context;
import android.os.Build;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.core.math.MathUtils;
import kotlin.Metadata;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\tH\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\f\u0010\b\u001a\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\r\u0010\b\u001a\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\tH\u0001¢\u0006\u0004\b\u000e\u0010\u000b\u001a\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\u000f\u0010\b\u001a\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0017\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001e\u0010\u0017\u001a\u00020\u0014*\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u0000H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001"}, d2 = {"", "p0", "", "delinearized", "(F)I", "Landroid/content/Context;", "Landroidx/compose/material3/ColorScheme;", "dynamicDarkColorScheme", "(Landroid/content/Context;)Landroidx/compose/material3/ColorScheme;", "Landroidx/compose/material3/TonalPalette;", "dynamicDarkColorScheme31", "(Landroidx/compose/material3/TonalPalette;)Landroidx/compose/material3/ColorScheme;", "dynamicDarkColorScheme34", "dynamicLightColorScheme", "dynamicLightColorScheme31", "dynamicLightColorScheme34", "dynamicTonalPalette", "(Landroid/content/Context;)Landroidx/compose/material3/TonalPalette;", "labInvf", "(F)F", "Landroidx/compose/ui/graphics/Color;", "setLuminance-DxMtmZc", "(JF)J", "setLuminance"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class DynamicTonalPaletteKt {
    private static final float labInvf(float f) {
        float f2 = f * f * f;
        return f2 > 0.008856452f ? f2 : ((f * 116.0f) - 16.0f) / 903.2963f;
    }

    public static final TonalPalette dynamicTonalPalette(Context context) {
        return new TonalPalette(ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_neutral1_0), ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_neutral1_10), m2069setLuminanceDxMtmZc(ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_neutral1_600), 98.0f), m2069setLuminanceDxMtmZc(ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_neutral1_600), 96.0f), ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_neutral1_50), m2069setLuminanceDxMtmZc(ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_neutral1_600), 94.0f), m2069setLuminanceDxMtmZc(ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_neutral1_600), 92.0f), ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_neutral1_100), m2069setLuminanceDxMtmZc(ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_neutral1_600), 87.0f), ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_neutral1_200), ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_neutral1_300), ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_neutral1_400), ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_neutral1_500), ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_neutral1_600), ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_neutral1_700), m2069setLuminanceDxMtmZc(ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_neutral1_600), 24.0f), m2069setLuminanceDxMtmZc(ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_neutral1_600), 22.0f), ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_neutral1_800), m2069setLuminanceDxMtmZc(ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_neutral1_600), 17.0f), m2069setLuminanceDxMtmZc(ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_neutral1_600), 12.0f), ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_neutral1_900), m2069setLuminanceDxMtmZc(ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_neutral1_600), 6.0f), m2069setLuminanceDxMtmZc(ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_neutral1_600), 4.0f), ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_neutral1_1000), ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_neutral2_0), ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_neutral2_10), m2069setLuminanceDxMtmZc(ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_neutral2_600), 98.0f), m2069setLuminanceDxMtmZc(ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_neutral2_600), 96.0f), ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_neutral2_50), m2069setLuminanceDxMtmZc(ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_neutral2_600), 94.0f), m2069setLuminanceDxMtmZc(ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_neutral2_600), 92.0f), ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_neutral2_100), m2069setLuminanceDxMtmZc(ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_neutral2_600), 87.0f), ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_neutral2_200), ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_neutral2_300), ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_neutral2_400), ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_neutral2_500), ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_neutral2_600), ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_neutral2_700), m2069setLuminanceDxMtmZc(ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_neutral2_600), 24.0f), m2069setLuminanceDxMtmZc(ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_neutral2_600), 22.0f), ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_neutral2_800), m2069setLuminanceDxMtmZc(ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_neutral2_600), 17.0f), m2069setLuminanceDxMtmZc(ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_neutral2_600), 12.0f), ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_neutral2_900), m2069setLuminanceDxMtmZc(ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_neutral2_600), 6.0f), m2069setLuminanceDxMtmZc(ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_neutral2_600), 4.0f), ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_neutral2_1000), ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_accent1_0), ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_accent1_10), ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_accent1_50), ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_accent1_100), ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_accent1_200), ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_accent1_300), ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_accent1_400), ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_accent1_500), ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_accent1_600), ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_accent1_700), ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_accent1_800), ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_accent1_900), ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_accent1_1000), ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_accent2_0), ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_accent2_10), ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_accent2_50), ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_accent2_100), ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_accent2_200), ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_accent2_300), ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_accent2_400), ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_accent2_500), ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_accent2_600), ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_accent2_700), ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_accent2_800), ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_accent2_900), ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_accent2_1000), ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_accent3_0), ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_accent3_10), ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_accent3_50), ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_accent3_100), ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_accent3_200), ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_accent3_300), ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_accent3_400), ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_accent3_500), ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_accent3_600), ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_accent3_700), ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_accent3_800), ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_accent3_900), ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_accent3_1000), null);
    }

    public static final ColorScheme dynamicLightColorScheme(Context context) {
        if (Build.VERSION.SDK_INT >= 34) {
            return dynamicLightColorScheme34(context);
        }
        return dynamicLightColorScheme31(dynamicTonalPalette(context));
    }

    public static final ColorScheme dynamicDarkColorScheme(Context context) {
        if (Build.VERSION.SDK_INT >= 34) {
            return dynamicDarkColorScheme34(context);
        }
        return dynamicDarkColorScheme31(dynamicTonalPalette(context));
    }

    /* JADX INFO: renamed from: setLuminance-DxMtmZc, reason: not valid java name */
    public static final long m2069setLuminanceDxMtmZc(long j, float f) {
        double d = f;
        if ((d < 1.0E-4d) | (d > 99.9999d)) {
            int iDelinearized = delinearized(labInvf((f + 16.0f) / 116.0f) * 100.0f);
            return ColorKt.Color$default(iDelinearized, iDelinearized, iDelinearized, 0, 8, null);
        }
        long jM4215convertvNxB06k = Color.m4215convertvNxB06k(j, ColorSpaces.INSTANCE.getCieLab());
        return Color.m4215convertvNxB06k(ColorKt.Color$default(f, Color.m4210component2impl(jM4215convertvNxB06k), Color.m4211component3impl(jM4215convertvNxB06k), 0.0f, ColorSpaces.INSTANCE.getCieLab(), 8, null), ColorSpaces.INSTANCE.getSrgb());
    }

    private static final int delinearized(float f) {
        double d = f / 100.0f;
        return MathUtils.clamp(MathKt.roundToInt((d <= 0.0031308d ? d * 12.92d : (Math.pow(d, 0.4166666666666667d) * 1.055d) - 0.055d) * 255.0d), 0, 255);
    }

    public static final ColorScheme dynamicLightColorScheme31(TonalPalette tonalPalette) {
        long primary40 = tonalPalette.getPrimary40();
        long primary100 = tonalPalette.getPrimary100();
        long primary90 = tonalPalette.getPrimary90();
        long primary10 = tonalPalette.getPrimary10();
        long primary80 = tonalPalette.getPrimary80();
        long secondary40 = tonalPalette.getSecondary40();
        long secondary100 = tonalPalette.getSecondary100();
        long secondary90 = tonalPalette.getSecondary90();
        long secondary10 = tonalPalette.getSecondary10();
        long tertiary40 = tonalPalette.getTertiary40();
        long tertiary100 = tonalPalette.getTertiary100();
        long tertiary90 = tonalPalette.getTertiary90();
        long tertiary10 = tonalPalette.getTertiary10();
        long neutralVariant98 = tonalPalette.getNeutralVariant98();
        long neutralVariant10 = tonalPalette.getNeutralVariant10();
        long neutralVariant99 = tonalPalette.getNeutralVariant98();
        long neutralVariant11 = tonalPalette.getNeutralVariant10();
        long neutralVariant90 = tonalPalette.getNeutralVariant90();
        long neutralVariant30 = tonalPalette.getNeutralVariant30();
        long neutralVariant20 = tonalPalette.getNeutralVariant20();
        long neutralVariant95 = tonalPalette.getNeutralVariant95();
        long neutralVariant50 = tonalPalette.getNeutralVariant50();
        long neutralVariant80 = tonalPalette.getNeutralVariant80();
        long neutralVariant0 = tonalPalette.getNeutralVariant0();
        long neutralVariant910 = tonalPalette.getNeutralVariant98();
        long neutralVariant87 = tonalPalette.getNeutralVariant87();
        return ColorSchemeKt.m1929lightColorSchemeCXl9yA$default(primary40, primary100, primary90, primary10, primary80, secondary40, secondary100, secondary90, secondary10, tertiary40, tertiary100, tertiary90, tertiary10, neutralVariant98, neutralVariant10, neutralVariant99, neutralVariant11, neutralVariant90, neutralVariant30, tonalPalette.getPrimary40(), neutralVariant20, neutralVariant95, 0L, 0L, 0L, 0L, neutralVariant50, neutralVariant80, neutralVariant0, neutralVariant910, tonalPalette.getNeutralVariant94(), tonalPalette.getNeutralVariant92(), tonalPalette.getNeutralVariant90(), tonalPalette.getNeutralVariant96(), tonalPalette.getNeutralVariant100(), neutralVariant87, 62914560, 0, null);
    }

    public static final ColorScheme dynamicLightColorScheme34(Context context) {
        long jM1880getColorWaAFU9c = ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_primary_light);
        long jM1880getColorWaAFU9c2 = ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_on_primary_light);
        long jM1880getColorWaAFU9c3 = ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_primary_container_light);
        long jM1880getColorWaAFU9c4 = ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_on_primary_container_light);
        long jM1880getColorWaAFU9c5 = ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_primary_dark);
        long jM1880getColorWaAFU9c6 = ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_secondary_light);
        long jM1880getColorWaAFU9c7 = ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_on_secondary_light);
        long jM1880getColorWaAFU9c8 = ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_secondary_container_light);
        long jM1880getColorWaAFU9c9 = ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_on_secondary_container_light);
        long jM1880getColorWaAFU9c10 = ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_tertiary_light);
        long jM1880getColorWaAFU9c11 = ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_on_tertiary_light);
        long jM1880getColorWaAFU9c12 = ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_tertiary_container_light);
        long jM1880getColorWaAFU9c13 = ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_on_tertiary_container_light);
        long jM1880getColorWaAFU9c14 = ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_background_light);
        long jM1880getColorWaAFU9c15 = ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_on_background_light);
        long jM1880getColorWaAFU9c16 = ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_surface_light);
        long jM1880getColorWaAFU9c17 = ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_on_surface_light);
        long jM1880getColorWaAFU9c18 = ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_surface_variant_light);
        long jM1880getColorWaAFU9c19 = ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_on_surface_variant_light);
        long jM1880getColorWaAFU9c20 = ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_surface_dark);
        long jM1880getColorWaAFU9c21 = ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_on_surface_dark);
        long jM1880getColorWaAFU9c22 = ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_outline_light);
        long jM1880getColorWaAFU9c23 = ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_outline_variant_light);
        long jM1880getColorWaAFU9c24 = ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_surface_bright_light);
        long jM1880getColorWaAFU9c25 = ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_surface_dim_light);
        return ColorSchemeKt.m1929lightColorSchemeCXl9yA$default(jM1880getColorWaAFU9c, jM1880getColorWaAFU9c2, jM1880getColorWaAFU9c3, jM1880getColorWaAFU9c4, jM1880getColorWaAFU9c5, jM1880getColorWaAFU9c6, jM1880getColorWaAFU9c7, jM1880getColorWaAFU9c8, jM1880getColorWaAFU9c9, jM1880getColorWaAFU9c10, jM1880getColorWaAFU9c11, jM1880getColorWaAFU9c12, jM1880getColorWaAFU9c13, jM1880getColorWaAFU9c14, jM1880getColorWaAFU9c15, jM1880getColorWaAFU9c16, jM1880getColorWaAFU9c17, jM1880getColorWaAFU9c18, jM1880getColorWaAFU9c19, ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_primary_light), jM1880getColorWaAFU9c20, jM1880getColorWaAFU9c21, 0L, 0L, 0L, 0L, jM1880getColorWaAFU9c22, jM1880getColorWaAFU9c23, 0L, jM1880getColorWaAFU9c24, ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_surface_container_light), ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_surface_container_high_light), ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_surface_container_highest_light), ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_surface_container_low_light), ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_surface_container_lowest_light), jM1880getColorWaAFU9c25, 331350016, 0, null);
    }

    public static final ColorScheme dynamicDarkColorScheme31(TonalPalette tonalPalette) {
        long primary80 = tonalPalette.getPrimary80();
        long primary20 = tonalPalette.getPrimary20();
        long primary30 = tonalPalette.getPrimary30();
        long primary90 = tonalPalette.getPrimary90();
        long primary40 = tonalPalette.getPrimary40();
        long secondary80 = tonalPalette.getSecondary80();
        long secondary20 = tonalPalette.getSecondary20();
        long secondary30 = tonalPalette.getSecondary30();
        long secondary90 = tonalPalette.getSecondary90();
        long tertiary80 = tonalPalette.getTertiary80();
        long tertiary20 = tonalPalette.getTertiary20();
        long tertiary30 = tonalPalette.getTertiary30();
        long tertiary90 = tonalPalette.getTertiary90();
        long neutralVariant6 = tonalPalette.getNeutralVariant6();
        long neutralVariant90 = tonalPalette.getNeutralVariant90();
        long neutralVariant7 = tonalPalette.getNeutralVariant6();
        long neutralVariant91 = tonalPalette.getNeutralVariant90();
        long neutralVariant30 = tonalPalette.getNeutralVariant30();
        long neutralVariant80 = tonalPalette.getNeutralVariant80();
        long neutralVariant92 = tonalPalette.getNeutralVariant90();
        long neutralVariant20 = tonalPalette.getNeutralVariant20();
        long neutralVariant60 = tonalPalette.getNeutralVariant60();
        long neutralVariant31 = tonalPalette.getNeutralVariant30();
        long neutralVariant0 = tonalPalette.getNeutralVariant0();
        long neutralVariant24 = tonalPalette.getNeutralVariant24();
        long neutralVariant8 = tonalPalette.getNeutralVariant6();
        return ColorSchemeKt.m1925darkColorSchemeCXl9yA$default(primary80, primary20, primary30, primary90, primary40, secondary80, secondary20, secondary30, secondary90, tertiary80, tertiary20, tertiary30, tertiary90, neutralVariant6, neutralVariant90, neutralVariant7, neutralVariant91, neutralVariant30, neutralVariant80, tonalPalette.getPrimary80(), neutralVariant92, neutralVariant20, 0L, 0L, 0L, 0L, neutralVariant60, neutralVariant31, neutralVariant0, neutralVariant24, tonalPalette.getNeutralVariant12(), tonalPalette.getNeutralVariant17(), tonalPalette.getNeutralVariant22(), tonalPalette.getNeutralVariant10(), tonalPalette.getNeutralVariant4(), neutralVariant8, 62914560, 0, null);
    }

    public static final ColorScheme dynamicDarkColorScheme34(Context context) {
        long jM1880getColorWaAFU9c = ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_primary_dark);
        long jM1880getColorWaAFU9c2 = ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_on_primary_dark);
        long jM1880getColorWaAFU9c3 = ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_primary_container_dark);
        long jM1880getColorWaAFU9c4 = ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_on_primary_container_dark);
        long jM1880getColorWaAFU9c5 = ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_primary_light);
        long jM1880getColorWaAFU9c6 = ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_secondary_dark);
        long jM1880getColorWaAFU9c7 = ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_on_secondary_dark);
        long jM1880getColorWaAFU9c8 = ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_secondary_container_dark);
        long jM1880getColorWaAFU9c9 = ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_on_secondary_container_dark);
        long jM1880getColorWaAFU9c10 = ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_tertiary_dark);
        long jM1880getColorWaAFU9c11 = ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_on_tertiary_dark);
        long jM1880getColorWaAFU9c12 = ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_tertiary_container_dark);
        long jM1880getColorWaAFU9c13 = ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_on_tertiary_container_dark);
        long jM1880getColorWaAFU9c14 = ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_background_dark);
        long jM1880getColorWaAFU9c15 = ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_on_background_dark);
        long jM1880getColorWaAFU9c16 = ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_surface_dark);
        long jM1880getColorWaAFU9c17 = ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_on_surface_dark);
        long jM1880getColorWaAFU9c18 = ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_surface_variant_dark);
        long jM1880getColorWaAFU9c19 = ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_on_surface_variant_dark);
        long jM1880getColorWaAFU9c20 = ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_surface_light);
        long jM1880getColorWaAFU9c21 = ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_on_surface_light);
        long jM1880getColorWaAFU9c22 = ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_outline_dark);
        long jM1880getColorWaAFU9c23 = ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_outline_variant_dark);
        long jM1880getColorWaAFU9c24 = ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_surface_bright_dark);
        long jM1880getColorWaAFU9c25 = ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_surface_dim_dark);
        return ColorSchemeKt.m1925darkColorSchemeCXl9yA$default(jM1880getColorWaAFU9c, jM1880getColorWaAFU9c2, jM1880getColorWaAFU9c3, jM1880getColorWaAFU9c4, jM1880getColorWaAFU9c5, jM1880getColorWaAFU9c6, jM1880getColorWaAFU9c7, jM1880getColorWaAFU9c8, jM1880getColorWaAFU9c9, jM1880getColorWaAFU9c10, jM1880getColorWaAFU9c11, jM1880getColorWaAFU9c12, jM1880getColorWaAFU9c13, jM1880getColorWaAFU9c14, jM1880getColorWaAFU9c15, jM1880getColorWaAFU9c16, jM1880getColorWaAFU9c17, jM1880getColorWaAFU9c18, jM1880getColorWaAFU9c19, ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_primary_dark), jM1880getColorWaAFU9c20, jM1880getColorWaAFU9c21, 0L, 0L, 0L, 0L, jM1880getColorWaAFU9c22, jM1880getColorWaAFU9c23, 0L, jM1880getColorWaAFU9c24, ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_surface_container_dark), ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_surface_container_high_dark), ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_surface_container_highest_dark), ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_surface_container_low_dark), ColorResourceHelper.INSTANCE.m1880getColorWaAFU9c(context, android.R.color.system_surface_container_lowest_dark), jM1880getColorWaAFU9c25, 331350016, 0, null);
    }
}
