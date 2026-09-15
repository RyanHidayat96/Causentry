package androidx.compose.ui.geometry;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u001b\b\u0087\b\u0018\u0000 H2\u00020\u0001:\u0001HBO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u0012H\u0086\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0010\u0010!\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010#\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010 J\u0010\u0010%\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b$\u0010 J\u0010\u0010'\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b&\u0010 J`\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0007HÇ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010+\u001a\u00020\u00132\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010.\u001a\u00020-HÖ\u0001¢\u0006\u0004\b.\u0010/R\u001a\u00100\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u0010\u001bR\u001a\u00103\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b3\u00101\u001a\u0004\b4\u0010\u001bR\u001a\u00105\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b5\u00101\u001a\u0004\b6\u0010\u001bR\u001a\u00107\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b7\u00101\u001a\u0004\b8\u0010\u001bR\u001a\u00109\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010 R\u001a\u0010<\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010:\u001a\u0004\b=\u0010 R\u001a\u0010>\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b>\u0010:\u001a\u0004\b?\u0010 R\u001a\u0010@\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b@\u0010:\u001a\u0004\bA\u0010 R\u0011\u0010C\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\bB\u0010\u001bR\u0011\u0010E\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\bD\u0010\u001bR\u0018\u0010F\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bF\u0010G"}, d2 = {"Landroidx/compose/ui/geometry/RoundRect;", "", "", "p0", "p1", "p2", "p3", "Landroidx/compose/ui/geometry/CornerRadius;", "p4", "p5", "p6", "p7", "<init>", "(FFFFJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "scaledRadiiRect", "()Landroidx/compose/ui/geometry/RoundRect;", "minRadius", "(FFFF)F", "Landroidx/compose/ui/geometry/Offset;", "", "contains-k-4lQ0M", "(J)Z", "contains", "", "toString", "()Ljava/lang/String;", "component1", "()F", "component2", "component3", "component4", "component5-kKHJgLs", "()J", "component5", "component6-kKHJgLs", "component6", "component7-kKHJgLs", "component7", "component8-kKHJgLs", "component8", "copy-MDFrsts", "(FFFFJJJJ)Landroidx/compose/ui/geometry/RoundRect;", "copy", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "left", "F", "getLeft", "top", "getTop", "right", "getRight", "bottom", "getBottom", "topLeftCornerRadius", "J", "getTopLeftCornerRadius-kKHJgLs", "topRightCornerRadius", "getTopRightCornerRadius-kKHJgLs", "bottomRightCornerRadius", "getBottomRightCornerRadius-kKHJgLs", "bottomLeftCornerRadius", "getBottomLeftCornerRadius-kKHJgLs", "getWidth", "width", "getHeight", "height", "_scaledRadiiRect", "Landroidx/compose/ui/geometry/RoundRect;", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RoundRect {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final RoundRect Zero = RoundRectKt.m4028RoundRectgG7oq9Y(0.0f, 0.0f, 0.0f, 0.0f, CornerRadius.INSTANCE.m3946getZerokKHJgLs());
    private RoundRect _scaledRadiiRect;
    private final float bottom;
    private final long bottomLeftCornerRadius;
    private final long bottomRightCornerRadius;
    private final float left;
    private final float right;
    private final float top;
    private final long topLeftCornerRadius;
    private final long topRightCornerRadius;

    private RoundRect(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.left = f;
        this.top = f2;
        this.right = f3;
        this.bottom = f4;
        this.topLeftCornerRadius = j;
        this.topRightCornerRadius = j2;
        this.bottomRightCornerRadius = j3;
        this.bottomLeftCornerRadius = j4;
    }

    public final float getLeft() {
        return this.left;
    }

    public final float getTop() {
        return this.top;
    }

    public final float getRight() {
        return this.right;
    }

    public final float getBottom() {
        return this.bottom;
    }

    public /* synthetic */ RoundRect(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, (i & 16) != 0 ? CornerRadius.INSTANCE.m3946getZerokKHJgLs() : j, (i & 32) != 0 ? CornerRadius.INSTANCE.m3946getZerokKHJgLs() : j2, (i & 64) != 0 ? CornerRadius.INSTANCE.m3946getZerokKHJgLs() : j3, (i & 128) != 0 ? CornerRadius.INSTANCE.m3946getZerokKHJgLs() : j4, null);
    }

    /* JADX INFO: renamed from: getTopLeftCornerRadius-kKHJgLs, reason: not valid java name */
    public final long m4024getTopLeftCornerRadiuskKHJgLs() {
        return this.topLeftCornerRadius;
    }

    /* JADX INFO: renamed from: getTopRightCornerRadius-kKHJgLs, reason: not valid java name */
    public final long m4025getTopRightCornerRadiuskKHJgLs() {
        return this.topRightCornerRadius;
    }

    /* JADX INFO: renamed from: getBottomRightCornerRadius-kKHJgLs, reason: not valid java name */
    public final long m4023getBottomRightCornerRadiuskKHJgLs() {
        return this.bottomRightCornerRadius;
    }

    /* JADX INFO: renamed from: getBottomLeftCornerRadius-kKHJgLs, reason: not valid java name */
    public final long m4022getBottomLeftCornerRadiuskKHJgLs() {
        return this.bottomLeftCornerRadius;
    }

    public final float getWidth() {
        return this.right - this.left;
    }

    public final float getHeight() {
        return this.bottom - this.top;
    }

    private final RoundRect scaledRadiiRect() {
        RoundRect roundRect = this._scaledRadiiRect;
        if (roundRect != null) {
            return roundRect;
        }
        float fMinRadius = minRadius(minRadius(minRadius(minRadius(1.0f, Float.intBitsToFloat((int) (this.bottomLeftCornerRadius & 4294967295L)), Float.intBitsToFloat((int) (this.topLeftCornerRadius & 4294967295L)), getHeight()), Float.intBitsToFloat((int) (this.topLeftCornerRadius >> 32)), Float.intBitsToFloat((int) (this.topRightCornerRadius >> 32)), getWidth()), Float.intBitsToFloat((int) (this.topRightCornerRadius & 4294967295L)), Float.intBitsToFloat((int) (this.bottomRightCornerRadius & 4294967295L)), getHeight()), Float.intBitsToFloat((int) (this.bottomRightCornerRadius >> 32)), Float.intBitsToFloat((int) (this.bottomLeftCornerRadius >> 32)), getWidth());
        float f = this.left;
        float f2 = this.top;
        float f3 = this.right;
        float f4 = this.bottom;
        long jM3928constructorimpl = CornerRadius.m3928constructorimpl((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (this.topLeftCornerRadius & 4294967295L)) * fMinRadius)) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (this.topLeftCornerRadius >> 32)) * fMinRadius)) << 32));
        long jM3928constructorimpl2 = CornerRadius.m3928constructorimpl((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (this.topRightCornerRadius & 4294967295L)) * fMinRadius)) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (this.topRightCornerRadius >> 32)) * fMinRadius)) << 32));
        long jM3928constructorimpl3 = CornerRadius.m3928constructorimpl((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (this.bottomRightCornerRadius & 4294967295L)) * fMinRadius)) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (this.bottomRightCornerRadius >> 32)) * fMinRadius)) << 32));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.bottomLeftCornerRadius >> 32));
        float f5 = f * fMinRadius;
        float f6 = f2 * fMinRadius;
        float f7 = f3 * fMinRadius;
        float f8 = f4 * fMinRadius;
        RoundRect roundRect2 = new RoundRect(f5, f6, f7, f8, jM3928constructorimpl, jM3928constructorimpl2, jM3928constructorimpl3, CornerRadius.m3928constructorimpl((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (this.bottomLeftCornerRadius & 4294967295L)) * fMinRadius)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat * fMinRadius) << 32)), null);
        this._scaledRadiiRect = roundRect2;
        return roundRect2;
    }

    private final float minRadius(float p0, float p1, float p2, float p3) {
        float f = p1 + p2;
        return (f <= p3 || f == 0.0f) ? p0 : Math.min(p0, p3 / f);
    }

    public final String toString() {
        long j = this.topLeftCornerRadius;
        long j2 = this.topRightCornerRadius;
        long j3 = this.bottomRightCornerRadius;
        long j4 = this.bottomLeftCornerRadius;
        StringBuilder sb = new StringBuilder();
        sb.append(GeometryUtilsKt.toStringAsFixed(this.left, 1));
        sb.append(", ");
        sb.append(GeometryUtilsKt.toStringAsFixed(this.top, 1));
        sb.append(", ");
        sb.append(GeometryUtilsKt.toStringAsFixed(this.right, 1));
        sb.append(", ");
        sb.append(GeometryUtilsKt.toStringAsFixed(this.bottom, 1));
        String string = sb.toString();
        if (!CornerRadius.m3933equalsimpl0(j, j2) || !CornerRadius.m3933equalsimpl0(j2, j3) || !CornerRadius.m3933equalsimpl0(j3, j4)) {
            StringBuilder sb2 = new StringBuilder("RoundRect(rect=");
            sb2.append(string);
            sb2.append(", topLeft=");
            sb2.append((Object) CornerRadius.m3942toStringimpl(j));
            sb2.append(", topRight=");
            sb2.append((Object) CornerRadius.m3942toStringimpl(j2));
            sb2.append(", bottomRight=");
            sb2.append((Object) CornerRadius.m3942toStringimpl(j3));
            sb2.append(", bottomLeft=");
            sb2.append((Object) CornerRadius.m3942toStringimpl(j4));
            sb2.append(')');
            return sb2.toString();
        }
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
            StringBuilder sb3 = new StringBuilder("RoundRect(rect=");
            sb3.append(string);
            sb3.append(", radius=");
            sb3.append(GeometryUtilsKt.toStringAsFixed(Float.intBitsToFloat(i), 1));
            sb3.append(')');
            return sb3.toString();
        }
        StringBuilder sb4 = new StringBuilder("RoundRect(rect=");
        sb4.append(string);
        sb4.append(", x=");
        sb4.append(GeometryUtilsKt.toStringAsFixed(Float.intBitsToFloat(i), 1));
        sb4.append(", y=");
        sb4.append(GeometryUtilsKt.toStringAsFixed(Float.intBitsToFloat(i2), 1));
        sb4.append(')');
        return sb4.toString();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/geometry/RoundRect$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/geometry/RoundRect;", "Zero", "Landroidx/compose/ui/geometry/RoundRect;", "getZero", "()Landroidx/compose/ui/geometry/RoundRect;", "getZero$annotations"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        @JvmStatic
        public static /* synthetic */ void getZero$annotations() {
        }

        private Companion() {
        }

        public final RoundRect getZero() {
            return RoundRect.Zero;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: contains-k-4lQ0M, reason: not valid java name */
    public final boolean m4020containsk4lQ0M(long p0) {
        float fIntBitsToFloat;
        float fIntBitsToFloat2;
        float fIntBitsToFloat3;
        float fIntBitsToFloat4;
        int i = (int) (p0 >> 32);
        if (Float.intBitsToFloat(i) >= this.left && Float.intBitsToFloat(i) < this.right) {
            int i2 = (int) (p0 & 4294967295L);
            if (Float.intBitsToFloat(i2) >= this.top && Float.intBitsToFloat(i2) < this.bottom) {
                RoundRect roundRectScaledRadiiRect = scaledRadiiRect();
                if (Float.intBitsToFloat(i) < this.left + Float.intBitsToFloat((int) (roundRectScaledRadiiRect.topLeftCornerRadius >> 32)) && Float.intBitsToFloat(i2) < this.top + Float.intBitsToFloat((int) (roundRectScaledRadiiRect.topLeftCornerRadius & 4294967295L))) {
                    fIntBitsToFloat = (Float.intBitsToFloat(i) - this.left) - Float.intBitsToFloat((int) (roundRectScaledRadiiRect.topLeftCornerRadius >> 32));
                    fIntBitsToFloat2 = (Float.intBitsToFloat(i2) - this.top) - Float.intBitsToFloat((int) (roundRectScaledRadiiRect.topLeftCornerRadius & 4294967295L));
                    fIntBitsToFloat3 = Float.intBitsToFloat((int) (roundRectScaledRadiiRect.topLeftCornerRadius >> 32));
                    fIntBitsToFloat4 = Float.intBitsToFloat((int) (4294967295L & roundRectScaledRadiiRect.topLeftCornerRadius));
                } else if (Float.intBitsToFloat(i) > this.right - Float.intBitsToFloat((int) (roundRectScaledRadiiRect.topRightCornerRadius >> 32)) && Float.intBitsToFloat(i2) < this.top + Float.intBitsToFloat((int) (roundRectScaledRadiiRect.topRightCornerRadius & 4294967295L))) {
                    fIntBitsToFloat = (Float.intBitsToFloat(i) - this.right) + Float.intBitsToFloat((int) (roundRectScaledRadiiRect.topRightCornerRadius >> 32));
                    fIntBitsToFloat2 = (Float.intBitsToFloat(i2) - this.top) - Float.intBitsToFloat((int) (roundRectScaledRadiiRect.topRightCornerRadius & 4294967295L));
                    fIntBitsToFloat3 = Float.intBitsToFloat((int) (roundRectScaledRadiiRect.topRightCornerRadius >> 32));
                    fIntBitsToFloat4 = Float.intBitsToFloat((int) (4294967295L & roundRectScaledRadiiRect.topRightCornerRadius));
                } else if (Float.intBitsToFloat(i) > this.right - Float.intBitsToFloat((int) (roundRectScaledRadiiRect.bottomRightCornerRadius >> 32)) && Float.intBitsToFloat(i2) > this.bottom - Float.intBitsToFloat((int) (roundRectScaledRadiiRect.bottomRightCornerRadius & 4294967295L))) {
                    fIntBitsToFloat = (Float.intBitsToFloat(i) - this.right) + Float.intBitsToFloat((int) (roundRectScaledRadiiRect.bottomRightCornerRadius >> 32));
                    fIntBitsToFloat2 = (Float.intBitsToFloat(i2) - this.bottom) + Float.intBitsToFloat((int) (roundRectScaledRadiiRect.bottomRightCornerRadius & 4294967295L));
                    fIntBitsToFloat3 = Float.intBitsToFloat((int) (roundRectScaledRadiiRect.bottomRightCornerRadius >> 32));
                    fIntBitsToFloat4 = Float.intBitsToFloat((int) (4294967295L & roundRectScaledRadiiRect.bottomRightCornerRadius));
                } else {
                    if (Float.intBitsToFloat(i) >= this.left + Float.intBitsToFloat((int) (roundRectScaledRadiiRect.bottomLeftCornerRadius >> 32)) || Float.intBitsToFloat(i2) <= this.bottom - Float.intBitsToFloat((int) (roundRectScaledRadiiRect.bottomLeftCornerRadius & 4294967295L))) {
                        return true;
                    }
                    fIntBitsToFloat = (Float.intBitsToFloat(i) - this.left) - Float.intBitsToFloat((int) (roundRectScaledRadiiRect.bottomLeftCornerRadius >> 32));
                    fIntBitsToFloat2 = (Float.intBitsToFloat(i2) - this.bottom) + Float.intBitsToFloat((int) (roundRectScaledRadiiRect.bottomLeftCornerRadius & 4294967295L));
                    fIntBitsToFloat3 = Float.intBitsToFloat((int) (roundRectScaledRadiiRect.bottomLeftCornerRadius >> 32));
                    fIntBitsToFloat4 = Float.intBitsToFloat((int) (4294967295L & roundRectScaledRadiiRect.bottomLeftCornerRadius));
                }
                float f = fIntBitsToFloat / fIntBitsToFloat3;
                float f2 = fIntBitsToFloat2 / fIntBitsToFloat4;
                return (f * f) + (f2 * f2) <= 1.0f;
            }
        }
        return false;
    }

    public /* synthetic */ RoundRect(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, j, j2, j3, j4);
    }

    public static final RoundRect getZero() {
        return INSTANCE.getZero();
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getLeft() {
        return this.left;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getTop() {
        return this.top;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getRight() {
        return this.right;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getBottom() {
        return this.bottom;
    }

    /* JADX INFO: renamed from: component5-kKHJgLs, reason: not valid java name and from getter */
    public final long getTopLeftCornerRadius() {
        return this.topLeftCornerRadius;
    }

    /* JADX INFO: renamed from: component6-kKHJgLs, reason: not valid java name and from getter */
    public final long getTopRightCornerRadius() {
        return this.topRightCornerRadius;
    }

    /* JADX INFO: renamed from: component7-kKHJgLs, reason: not valid java name and from getter */
    public final long getBottomRightCornerRadius() {
        return this.bottomRightCornerRadius;
    }

    /* JADX INFO: renamed from: component8-kKHJgLs, reason: not valid java name and from getter */
    public final long getBottomLeftCornerRadius() {
        return this.bottomLeftCornerRadius;
    }

    /* JADX INFO: renamed from: copy-MDFrsts, reason: not valid java name */
    public final RoundRect m4021copyMDFrsts(float p0, float p1, float p2, float p3, long p4, long p5, long p6, long p7) {
        return new RoundRect(p0, p1, p2, p3, p4, p5, p6, p7, null);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof RoundRect)) {
            return false;
        }
        RoundRect roundRect = (RoundRect) p0;
        return Float.compare(this.left, roundRect.left) == 0 && Float.compare(this.top, roundRect.top) == 0 && Float.compare(this.right, roundRect.right) == 0 && Float.compare(this.bottom, roundRect.bottom) == 0 && CornerRadius.m3933equalsimpl0(this.topLeftCornerRadius, roundRect.topLeftCornerRadius) && CornerRadius.m3933equalsimpl0(this.topRightCornerRadius, roundRect.topRightCornerRadius) && CornerRadius.m3933equalsimpl0(this.bottomRightCornerRadius, roundRect.bottomRightCornerRadius) && CornerRadius.m3933equalsimpl0(this.bottomLeftCornerRadius, roundRect.bottomLeftCornerRadius);
    }

    public final int hashCode() {
        return (((((((((((((Float.hashCode(this.left) * 31) + Float.hashCode(this.top)) * 31) + Float.hashCode(this.right)) * 31) + Float.hashCode(this.bottom)) * 31) + CornerRadius.m3936hashCodeimpl(this.topLeftCornerRadius)) * 31) + CornerRadius.m3936hashCodeimpl(this.topRightCornerRadius)) * 31) + CornerRadius.m3936hashCodeimpl(this.bottomRightCornerRadius)) * 31) + CornerRadius.m3936hashCodeimpl(this.bottomLeftCornerRadius);
    }
}
