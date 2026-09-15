package androidx.compose.material.ripple;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u001a\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a&\u0010\u000b\u001a\u00020\u0002*\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0000H\u0000ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\"\u0014\u0010\r\u001a\u00020\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e\"\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\"\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011\"\u0014\u0010\u0013\u001a\u00020\u000f8\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001"}, d2 = {"Landroidx/compose/ui/geometry/Size;", "p0", "", "getRippleStartRadius-uvyYCjk", "(J)F", "getRippleStartRadius", "Landroidx/compose/ui/unit/Density;", "", "p1", "getRippleEndRadius-cSwnlzA", "(Landroidx/compose/ui/unit/Density;ZJ)F", "getRippleEndRadius", "Landroidx/compose/ui/unit/Dp;", "BoundedRippleExtraRadius", "F", "", "FadeInDuration", "I", "FadeOutDuration", "RadiusDuration"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class RippleAnimationKt {
    private static final float BoundedRippleExtraRadius = Dp.m6935constructorimpl(10.0f);
    private static final int FadeInDuration = 75;
    private static final int FadeOutDuration = 150;
    private static final int RadiusDuration = 225;

    /* JADX INFO: renamed from: getRippleStartRadius-uvyYCjk, reason: not valid java name */
    public static final float m1739getRippleStartRadiusuvyYCjk(long j) {
        return Math.max(Size.m4043getWidthimpl(j), Size.m4040getHeightimpl(j)) * 0.3f;
    }

    /* JADX INFO: renamed from: getRippleEndRadius-cSwnlzA, reason: not valid java name */
    public static final float m1738getRippleEndRadiuscSwnlzA(Density density, boolean z, long j) {
        float fM3972getDistanceimpl = Offset.m3972getDistanceimpl(OffsetKt.Offset(Size.m4043getWidthimpl(j), Size.m4040getHeightimpl(j))) / 2.0f;
        return z ? fM3972getDistanceimpl + density.mo694toPx0680j_4(BoundedRippleExtraRadius) : fM3972getDistanceimpl;
    }
}
