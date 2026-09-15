package androidx.compose.ui.geometry;

import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u000f\u001a?\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\b\u0010\t\u001a7\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\b\u0010\u000e\u001a\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a?\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\r2\b\b\u0002\u0010\u0002\u001a\u00020\n2\b\b\u0002\u0010\u0003\u001a\u00020\n2\b\b\u0002\u0010\u0004\u001a\u00020\n2\b\b\u0002\u0010\u0005\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001b\u0010\u0016\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a'\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\"\u0015\u0010\u001b\u001a\u00020\r*\u00020\u00078G¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\"\u0015\u0010\u001d\u001a\u00020\r*\u00020\u00078G¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001a\"\u0015\u0010\u001f\u001a\u00020\u001e*\u00020\u00078G¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \"\u0015\u0010!\u001a\u00020\u001e*\u00020\u00078G¢\u0006\u0006\u001a\u0004\b!\u0010 \"\u0015\u0010\"\u001a\u00020\u001e*\u00020\u00078G¢\u0006\u0006\u001a\u0004\b\"\u0010 \"\u0015\u0010#\u001a\u00020\u001e*\u00020\u00078G¢\u0006\u0006\u001a\u0004\b#\u0010 \"\u0015\u0010$\u001a\u00020\u001e*\u00020\u00078G¢\u0006\u0006\u001a\u0004\b$\u0010 \"\u0015\u0010'\u001a\u00020\u0000*\u00020\u00078G¢\u0006\u0006\u001a\u0004\b%\u0010&\"\u0015\u0010)\u001a\u00020\u0000*\u00020\u00078G¢\u0006\u0006\u001a\u0004\b(\u0010&\"\u0015\u0010,\u001a\u00020\u0013*\u00020\u00078G¢\u0006\u0006\u001a\u0004\b*\u0010+\"\u0015\u0010-\u001a\u00020\u001e*\u00020\u00078G¢\u0006\u0006\u001a\u0004\b-\u0010 "}, d2 = {"", "p0", "p1", "p2", "p3", "p4", "p5", "Landroidx/compose/ui/geometry/RoundRect;", "RoundRect", "(FFFFFF)Landroidx/compose/ui/geometry/RoundRect;", "Landroidx/compose/ui/geometry/CornerRadius;", "RoundRect-gG7oq9Y", "(FFFFJ)Landroidx/compose/ui/geometry/RoundRect;", "Landroidx/compose/ui/geometry/Rect;", "(Landroidx/compose/ui/geometry/Rect;FF)Landroidx/compose/ui/geometry/RoundRect;", "RoundRect-sniSvfs", "(Landroidx/compose/ui/geometry/Rect;J)Landroidx/compose/ui/geometry/RoundRect;", "RoundRect-ZAM2FJo", "(Landroidx/compose/ui/geometry/Rect;JJJJ)Landroidx/compose/ui/geometry/RoundRect;", "Landroidx/compose/ui/geometry/Offset;", "translate-Uv8p0NA", "(Landroidx/compose/ui/geometry/RoundRect;J)Landroidx/compose/ui/geometry/RoundRect;", "translate", "lerp", "(Landroidx/compose/ui/geometry/RoundRect;Landroidx/compose/ui/geometry/RoundRect;F)Landroidx/compose/ui/geometry/RoundRect;", "getBoundingRect", "(Landroidx/compose/ui/geometry/RoundRect;)Landroidx/compose/ui/geometry/Rect;", "boundingRect", "getSafeInnerRect", "safeInnerRect", "", "isEmpty", "(Landroidx/compose/ui/geometry/RoundRect;)Z", "isFinite", "isRect", "isEllipse", "isCircle", "getMinDimension", "(Landroidx/compose/ui/geometry/RoundRect;)F", "minDimension", "getMaxDimension", "maxDimension", "getCenter", "(Landroidx/compose/ui/geometry/RoundRect;)J", "center", "isSimple"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class RoundRectKt {
    public static final RoundRect RoundRect(Rect rect, float f, float f2) {
        return RoundRect(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), f, f2);
    }

    /* JADX INFO: renamed from: RoundRect-ZAM2FJo, reason: not valid java name */
    public static final RoundRect m4026RoundRectZAM2FJo(Rect rect, long j, long j2, long j3, long j4) {
        return new RoundRect(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), j, j2, j3, j4, null);
    }

    /* JADX INFO: renamed from: translate-Uv8p0NA, reason: not valid java name */
    public static final RoundRect m4030translateUv8p0NA(RoundRect roundRect, long j) {
        float left = roundRect.getLeft();
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        float top = roundRect.getTop();
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i2);
        float right = roundRect.getRight();
        float fIntBitsToFloat3 = Float.intBitsToFloat(i);
        float bottom = roundRect.getBottom();
        return new RoundRect(left + fIntBitsToFloat, top + fIntBitsToFloat2, right + fIntBitsToFloat3, Float.intBitsToFloat(i2) + bottom, roundRect.m4024getTopLeftCornerRadiuskKHJgLs(), roundRect.m4025getTopRightCornerRadiuskKHJgLs(), roundRect.m4023getBottomRightCornerRadiuskKHJgLs(), roundRect.m4022getBottomLeftCornerRadiuskKHJgLs(), null);
    }

    public static final Rect getBoundingRect(RoundRect roundRect) {
        return new Rect(roundRect.getLeft(), roundRect.getTop(), roundRect.getRight(), roundRect.getBottom());
    }

    public static final Rect getSafeInnerRect(RoundRect roundRect) {
        float fMax = Math.max(Float.intBitsToFloat((int) (roundRect.m4022getBottomLeftCornerRadiuskKHJgLs() >> 32)), Float.intBitsToFloat((int) (roundRect.m4024getTopLeftCornerRadiuskKHJgLs() >> 32)));
        float fMax2 = Math.max(Float.intBitsToFloat((int) (roundRect.m4024getTopLeftCornerRadiuskKHJgLs() & 4294967295L)), Float.intBitsToFloat((int) (roundRect.m4025getTopRightCornerRadiuskKHJgLs() & 4294967295L)));
        float fMax3 = Math.max(Float.intBitsToFloat((int) (roundRect.m4025getTopRightCornerRadiuskKHJgLs() >> 32)), Float.intBitsToFloat((int) (roundRect.m4023getBottomRightCornerRadiuskKHJgLs() >> 32)));
        float fMax4 = Math.max(Float.intBitsToFloat((int) (roundRect.m4023getBottomRightCornerRadiuskKHJgLs() & 4294967295L)), Float.intBitsToFloat((int) (roundRect.m4022getBottomLeftCornerRadiuskKHJgLs() & 4294967295L)));
        return new Rect(roundRect.getLeft() + (fMax * 0.29289323f), roundRect.getTop() + (fMax2 * 0.29289323f), roundRect.getRight() - (fMax3 * 0.29289323f), roundRect.getBottom() - (fMax4 * 0.29289323f));
    }

    public static final boolean isEmpty(RoundRect roundRect) {
        return roundRect.getLeft() >= roundRect.getRight() || roundRect.getTop() >= roundRect.getBottom();
    }

    public static final boolean isFinite(RoundRect roundRect) {
        return (Float.floatToRawIntBits(roundRect.getLeft()) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(roundRect.getTop()) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(roundRect.getRight()) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(roundRect.getBottom()) & Integer.MAX_VALUE) < 2139095040;
    }

    public static final boolean isRect(RoundRect roundRect) {
        long jM4024getTopLeftCornerRadiuskKHJgLs = roundRect.m4024getTopLeftCornerRadiuskKHJgLs() & 9223372034707292159L;
        if (((jM4024getTopLeftCornerRadiuskKHJgLs - InlineClassHelperKt.Uint64Low32) & (~jM4024getTopLeftCornerRadiuskKHJgLs) & (-9223372034707292160L)) == 0) {
            return false;
        }
        long jM4025getTopRightCornerRadiuskKHJgLs = roundRect.m4025getTopRightCornerRadiuskKHJgLs() & 9223372034707292159L;
        if (((jM4025getTopRightCornerRadiuskKHJgLs - InlineClassHelperKt.Uint64Low32) & (~jM4025getTopRightCornerRadiuskKHJgLs) & (-9223372034707292160L)) == 0) {
            return false;
        }
        long jM4022getBottomLeftCornerRadiuskKHJgLs = roundRect.m4022getBottomLeftCornerRadiuskKHJgLs() & 9223372034707292159L;
        if (((jM4022getBottomLeftCornerRadiuskKHJgLs - InlineClassHelperKt.Uint64Low32) & (~jM4022getBottomLeftCornerRadiuskKHJgLs) & (-9223372034707292160L)) == 0) {
            return false;
        }
        long jM4023getBottomRightCornerRadiuskKHJgLs = roundRect.m4023getBottomRightCornerRadiuskKHJgLs() & 9223372034707292159L;
        return (((jM4023getBottomRightCornerRadiuskKHJgLs - InlineClassHelperKt.Uint64Low32) & (~jM4023getBottomRightCornerRadiuskKHJgLs)) & (-9223372034707292160L)) != 0;
    }

    public static final boolean isEllipse(RoundRect roundRect) {
        return roundRect.m4024getTopLeftCornerRadiuskKHJgLs() == roundRect.m4025getTopRightCornerRadiuskKHJgLs() && roundRect.m4025getTopRightCornerRadiuskKHJgLs() == roundRect.m4023getBottomRightCornerRadiuskKHJgLs() && roundRect.m4023getBottomRightCornerRadiuskKHJgLs() == roundRect.m4022getBottomLeftCornerRadiuskKHJgLs() && ((double) roundRect.getWidth()) <= ((double) Float.intBitsToFloat((int) (roundRect.m4024getTopLeftCornerRadiuskKHJgLs() >> 32))) * 2.0d && ((double) roundRect.getHeight()) <= ((double) Float.intBitsToFloat((int) (roundRect.m4024getTopLeftCornerRadiuskKHJgLs() & 4294967295L))) * 2.0d;
    }

    public static final boolean isCircle(RoundRect roundRect) {
        return roundRect.getWidth() == roundRect.getHeight() && isEllipse(roundRect);
    }

    public static final float getMinDimension(RoundRect roundRect) {
        return Math.min(Math.abs(roundRect.getWidth()), Math.abs(roundRect.getHeight()));
    }

    public static final float getMaxDimension(RoundRect roundRect) {
        return Math.max(Math.abs(roundRect.getWidth()), Math.abs(roundRect.getHeight()));
    }

    public static final long getCenter(RoundRect roundRect) {
        float left = roundRect.getLeft();
        float width = roundRect.getWidth() / 2.0f;
        float top = roundRect.getTop();
        float height = roundRect.getHeight() / 2.0f;
        return Offset.m3966constructorimpl((((long) Float.floatToRawIntBits(left + width)) << 32) | (((long) Float.floatToRawIntBits(top + height)) & 4294967295L));
    }

    public static final boolean isSimple(RoundRect roundRect) {
        long jM4024getTopLeftCornerRadiuskKHJgLs = roundRect.m4024getTopLeftCornerRadiuskKHJgLs();
        return (jM4024getTopLeftCornerRadiuskKHJgLs >>> 32) == (jM4024getTopLeftCornerRadiuskKHJgLs & 4294967295L) && roundRect.m4024getTopLeftCornerRadiuskKHJgLs() == roundRect.m4025getTopRightCornerRadiuskKHJgLs() && roundRect.m4024getTopLeftCornerRadiuskKHJgLs() == roundRect.m4023getBottomRightCornerRadiuskKHJgLs() && roundRect.m4024getTopLeftCornerRadiuskKHJgLs() == roundRect.m4022getBottomLeftCornerRadiuskKHJgLs();
    }

    public static final RoundRect lerp(RoundRect roundRect, RoundRect roundRect2, float f) {
        return new RoundRect(MathHelpersKt.lerp(roundRect.getLeft(), roundRect2.getLeft(), f), MathHelpersKt.lerp(roundRect.getTop(), roundRect2.getTop(), f), MathHelpersKt.lerp(roundRect.getRight(), roundRect2.getRight(), f), MathHelpersKt.lerp(roundRect.getBottom(), roundRect2.getBottom(), f), CornerRadiusKt.m3947lerp3Ry4LBc(roundRect.m4024getTopLeftCornerRadiuskKHJgLs(), roundRect2.m4024getTopLeftCornerRadiuskKHJgLs(), f), CornerRadiusKt.m3947lerp3Ry4LBc(roundRect.m4025getTopRightCornerRadiuskKHJgLs(), roundRect2.m4025getTopRightCornerRadiuskKHJgLs(), f), CornerRadiusKt.m3947lerp3Ry4LBc(roundRect.m4023getBottomRightCornerRadiuskKHJgLs(), roundRect2.m4023getBottomRightCornerRadiuskKHJgLs(), f), CornerRadiusKt.m3947lerp3Ry4LBc(roundRect.m4022getBottomLeftCornerRadiuskKHJgLs(), roundRect2.m4022getBottomLeftCornerRadiuskKHJgLs(), f), null);
    }

    public static final RoundRect RoundRect(float f, float f2, float f3, float f4, float f5, float f6) {
        long jM3928constructorimpl = CornerRadius.m3928constructorimpl((((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f6)) & 4294967295L));
        return new RoundRect(f, f2, f3, f4, jM3928constructorimpl, jM3928constructorimpl, jM3928constructorimpl, jM3928constructorimpl, null);
    }

    /* JADX INFO: renamed from: RoundRect-gG7oq9Y, reason: not valid java name */
    public static final RoundRect m4028RoundRectgG7oq9Y(float f, float f2, float f3, float f4, long j) {
        return RoundRect(f, f2, f3, f4, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    /* JADX INFO: renamed from: RoundRect-sniSvfs, reason: not valid java name */
    public static final RoundRect m4029RoundRectsniSvfs(Rect rect, long j) {
        return RoundRect(rect, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
    }
}
