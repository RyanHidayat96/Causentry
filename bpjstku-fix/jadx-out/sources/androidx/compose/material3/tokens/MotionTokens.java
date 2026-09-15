package androidx.compose.material3.tokens;

import androidx.compose.animation.core.CubicBezierEasing;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0016\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0006R\u001a\u0010\u0017\u001a\u00020\u00168\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u00168\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u001a\u0010\u001d\u001a\u00020\u00168\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR\u001a\u0010\u001f\u001a\u00020\u00168\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b \u0010\u001aR\u001a\u0010!\u001a\u00020\u00168\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0018\u001a\u0004\b\"\u0010\u001aR\u001a\u0010#\u001a\u00020\u00168\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u0018\u001a\u0004\b$\u0010\u001aR\u001a\u0010%\u001a\u00020\u00168\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u0018\u001a\u0004\b&\u0010\u001aR\u001a\u0010'\u001a\u00020\u00168\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u0018\u001a\u0004\b(\u0010\u001aR\u001a\u0010)\u001a\u00020\u00168\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u0018\u001a\u0004\b*\u0010\u001aR\u001a\u0010+\u001a\u00020\u00168\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010\u0018\u001a\u0004\b,\u0010\u001a"}, d2 = {"Landroidx/compose/material3/tokens/MotionTokens;", "", "<init>", "()V", "", "DurationExtraLong1", "D", "DurationExtraLong2", "DurationExtraLong3", "DurationExtraLong4", "DurationLong1", "DurationLong2", "DurationLong3", "DurationLong4", "DurationMedium1", "DurationMedium2", "DurationMedium3", "DurationMedium4", "DurationShort1", "DurationShort2", "DurationShort3", "DurationShort4", "Landroidx/compose/animation/core/CubicBezierEasing;", "EasingEmphasizedAccelerateCubicBezier", "Landroidx/compose/animation/core/CubicBezierEasing;", "getEasingEmphasizedAccelerateCubicBezier", "()Landroidx/compose/animation/core/CubicBezierEasing;", "EasingEmphasizedCubicBezier", "getEasingEmphasizedCubicBezier", "EasingEmphasizedDecelerateCubicBezier", "getEasingEmphasizedDecelerateCubicBezier", "EasingLegacyAccelerateCubicBezier", "getEasingLegacyAccelerateCubicBezier", "EasingLegacyCubicBezier", "getEasingLegacyCubicBezier", "EasingLegacyDecelerateCubicBezier", "getEasingLegacyDecelerateCubicBezier", "EasingLinearCubicBezier", "getEasingLinearCubicBezier", "EasingStandardAccelerateCubicBezier", "getEasingStandardAccelerateCubicBezier", "EasingStandardCubicBezier", "getEasingStandardCubicBezier", "EasingStandardDecelerateCubicBezier", "getEasingStandardDecelerateCubicBezier"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MotionTokens {
    public static final int $stable = 0;
    public static final double DurationExtraLong1 = 700.0d;
    public static final double DurationExtraLong2 = 800.0d;
    public static final double DurationExtraLong3 = 900.0d;
    public static final double DurationExtraLong4 = 1000.0d;
    public static final double DurationLong1 = 450.0d;
    public static final double DurationLong2 = 500.0d;
    public static final double DurationLong3 = 550.0d;
    public static final double DurationLong4 = 600.0d;
    public static final double DurationMedium1 = 250.0d;
    public static final double DurationMedium2 = 300.0d;
    public static final double DurationMedium3 = 350.0d;
    public static final double DurationMedium4 = 400.0d;
    public static final double DurationShort1 = 50.0d;
    public static final double DurationShort2 = 100.0d;
    public static final double DurationShort3 = 150.0d;
    public static final double DurationShort4 = 200.0d;
    public static final MotionTokens INSTANCE = new MotionTokens();
    private static final CubicBezierEasing EasingEmphasizedCubicBezier = new CubicBezierEasing(0.2f, 0.0f, 0.0f, 1.0f);
    private static final CubicBezierEasing EasingEmphasizedAccelerateCubicBezier = new CubicBezierEasing(0.3f, 0.0f, 0.8f, 0.15f);
    private static final CubicBezierEasing EasingEmphasizedDecelerateCubicBezier = new CubicBezierEasing(0.05f, 0.7f, 0.1f, 1.0f);
    private static final CubicBezierEasing EasingLegacyCubicBezier = new CubicBezierEasing(0.4f, 0.0f, 0.2f, 1.0f);
    private static final CubicBezierEasing EasingLegacyAccelerateCubicBezier = new CubicBezierEasing(0.4f, 0.0f, 1.0f, 1.0f);
    private static final CubicBezierEasing EasingLegacyDecelerateCubicBezier = new CubicBezierEasing(0.0f, 0.0f, 0.2f, 1.0f);
    private static final CubicBezierEasing EasingLinearCubicBezier = new CubicBezierEasing(0.0f, 0.0f, 1.0f, 1.0f);
    private static final CubicBezierEasing EasingStandardCubicBezier = new CubicBezierEasing(0.2f, 0.0f, 0.0f, 1.0f);
    private static final CubicBezierEasing EasingStandardAccelerateCubicBezier = new CubicBezierEasing(0.3f, 0.0f, 1.0f, 1.0f);
    private static final CubicBezierEasing EasingStandardDecelerateCubicBezier = new CubicBezierEasing(0.0f, 0.0f, 0.0f, 1.0f);

    private MotionTokens() {
    }

    public final CubicBezierEasing getEasingEmphasizedCubicBezier() {
        return EasingEmphasizedCubicBezier;
    }

    public final CubicBezierEasing getEasingEmphasizedAccelerateCubicBezier() {
        return EasingEmphasizedAccelerateCubicBezier;
    }

    public final CubicBezierEasing getEasingEmphasizedDecelerateCubicBezier() {
        return EasingEmphasizedDecelerateCubicBezier;
    }

    public final CubicBezierEasing getEasingLegacyCubicBezier() {
        return EasingLegacyCubicBezier;
    }

    public final CubicBezierEasing getEasingLegacyAccelerateCubicBezier() {
        return EasingLegacyAccelerateCubicBezier;
    }

    public final CubicBezierEasing getEasingLegacyDecelerateCubicBezier() {
        return EasingLegacyDecelerateCubicBezier;
    }

    public final CubicBezierEasing getEasingLinearCubicBezier() {
        return EasingLinearCubicBezier;
    }

    public final CubicBezierEasing getEasingStandardCubicBezier() {
        return EasingStandardCubicBezier;
    }

    public final CubicBezierEasing getEasingStandardAccelerateCubicBezier() {
        return EasingStandardAccelerateCubicBezier;
    }

    public final CubicBezierEasing getEasingStandardDecelerateCubicBezier() {
        return EasingStandardDecelerateCubicBezier;
    }
}
