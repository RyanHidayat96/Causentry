package androidx.compose.ui.geometry;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\"\b\u0087\b\u0018\u0000 ^2\u00020\u0001:\u0001^B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\f\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0011\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\tH\u0086\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001b\u001a\u00020\u001aH\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001eJ8\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\"\u0010\u0013J\u001a\u0010#\u001a\u00020\u00142\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'R \u0010(\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b(\u0010)\u0012\u0004\b+\u0010,\u001a\u0004\b*\u0010\u001eR \u0010-\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b-\u0010)\u0012\u0004\b/\u0010,\u001a\u0004\b.\u0010\u001eR \u00100\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b0\u0010)\u0012\u0004\b2\u0010,\u001a\u0004\b1\u0010\u001eR \u00103\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b3\u0010)\u0012\u0004\b5\u0010,\u001a\u0004\b4\u0010\u001eR\u001b\u00108\u001a\u00020\u00028Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b7\u0010,\u001a\u0004\b6\u0010\u001eR\u001b\u0010;\u001a\u00020\u00028Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b:\u0010,\u001a\u0004\b9\u0010\u001eR\u001a\u0010@\u001a\u00020<8GX\u0087\u0004¢\u0006\f\u0012\u0004\b?\u0010,\u001a\u0004\b=\u0010>R\u001a\u0010A\u001a\u00020\u00148GX\u0087\u0004¢\u0006\f\u0012\u0004\bC\u0010,\u001a\u0004\bA\u0010BR\u001a\u0010D\u001a\u00020\u00148GX\u0087\u0004¢\u0006\f\u0012\u0004\bE\u0010,\u001a\u0004\bD\u0010BR\u001a\u0010F\u001a\u00020\u00148GX\u0087\u0004¢\u0006\f\u0012\u0004\bG\u0010,\u001a\u0004\bF\u0010BR\u0011\u0010I\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\bH\u0010\u001eR\u0011\u0010K\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\bJ\u0010\u001eR\u0011\u0010M\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\bL\u0010>R\u0011\u0010O\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\bN\u0010>R\u0011\u0010Q\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\bP\u0010>R\u0011\u0010S\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\bR\u0010>R\u0011\u0010U\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\bT\u0010>R\u0011\u0010W\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\bV\u0010>R\u0011\u0010Y\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\bX\u0010>R\u0011\u0010[\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\bZ\u0010>R\u0011\u0010]\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b\\\u0010>"}, d2 = {"Landroidx/compose/ui/geometry/Rect;", "", "", "p0", "p1", "p2", "p3", "<init>", "(FFFF)V", "Landroidx/compose/ui/geometry/Offset;", "translate-k-4lQ0M", "(J)Landroidx/compose/ui/geometry/Rect;", "translate", "(FF)Landroidx/compose/ui/geometry/Rect;", "inflate", "(F)Landroidx/compose/ui/geometry/Rect;", "deflate", "intersect", "(Landroidx/compose/ui/geometry/Rect;)Landroidx/compose/ui/geometry/Rect;", "(FFFF)Landroidx/compose/ui/geometry/Rect;", "", "overlaps", "(Landroidx/compose/ui/geometry/Rect;)Z", "contains-k-4lQ0M", "(J)Z", "contains", "", "toString", "()Ljava/lang/String;", "component1", "()F", "component2", "component3", "component4", "copy", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "left", "F", "getLeft", "getLeft$annotations", "()V", "top", "getTop", "getTop$annotations", "right", "getRight", "getRight$annotations", "bottom", "getBottom", "getBottom$annotations", "getWidth", "getWidth$annotations", "width", "getHeight", "getHeight$annotations", "height", "Landroidx/compose/ui/geometry/Size;", "getSize-NH-jbRc", "()J", "getSize-NH-jbRc$annotations", "size", "isInfinite", "()Z", "isInfinite$annotations", "isFinite", "isFinite$annotations", "isEmpty", "isEmpty$annotations", "getMinDimension", "minDimension", "getMaxDimension", "maxDimension", "getTopLeft-F1C5BW0", "topLeft", "getTopCenter-F1C5BW0", "topCenter", "getTopRight-F1C5BW0", "topRight", "getCenterLeft-F1C5BW0", "centerLeft", "getCenter-F1C5BW0", "center", "getCenterRight-F1C5BW0", "centerRight", "getBottomLeft-F1C5BW0", "bottomLeft", "getBottomCenter-F1C5BW0", "bottomCenter", "getBottomRight-F1C5BW0", "bottomRight", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Rect {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Rect Zero = new Rect(0.0f, 0.0f, 0.0f, 0.0f);
    private final float bottom;
    private final float left;
    private final float right;
    private final float top;

    public static /* synthetic */ void getBottom$annotations() {
    }

    public static /* synthetic */ void getHeight$annotations() {
    }

    public static /* synthetic */ void getLeft$annotations() {
    }

    public static /* synthetic */ void getRight$annotations() {
    }

    /* JADX INFO: renamed from: getSize-NH-jbRc$annotations, reason: not valid java name */
    public static /* synthetic */ void m3999getSizeNHjbRc$annotations() {
    }

    public static /* synthetic */ void getTop$annotations() {
    }

    public static /* synthetic */ void getWidth$annotations() {
    }

    public static /* synthetic */ void isEmpty$annotations() {
    }

    public static /* synthetic */ void isFinite$annotations() {
    }

    public static /* synthetic */ void isInfinite$annotations() {
    }

    public Rect(float f, float f2, float f3, float f4) {
        this.left = f;
        this.top = f2;
        this.right = f3;
        this.bottom = f4;
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

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/geometry/Rect$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/geometry/Rect;", "Zero", "Landroidx/compose/ui/geometry/Rect;", "getZero", "()Landroidx/compose/ui/geometry/Rect;", "getZero$annotations"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public static /* synthetic */ void getZero$annotations() {
        }

        private Companion() {
        }

        public final Rect getZero() {
            return Rect.Zero;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final float getWidth() {
        return getRight() - getLeft();
    }

    public final float getHeight() {
        return getBottom() - getTop();
    }

    public final boolean isInfinite() {
        boolean z = this.left == Float.POSITIVE_INFINITY;
        boolean z2 = this.top == Float.POSITIVE_INFINITY;
        return z | z2 | (this.right == Float.POSITIVE_INFINITY) | (this.bottom == Float.POSITIVE_INFINITY);
    }

    public final boolean isFinite() {
        boolean z = (Float.floatToRawIntBits(this.left) & Integer.MAX_VALUE) < 2139095040;
        boolean z2 = (Float.floatToRawIntBits(this.top) & Integer.MAX_VALUE) < 2139095040;
        return z & z2 & ((Float.floatToRawIntBits(this.right) & Integer.MAX_VALUE) < 2139095040) & ((Integer.MAX_VALUE & Float.floatToRawIntBits(this.bottom)) < 2139095040);
    }

    public final boolean isEmpty() {
        return (this.left >= this.right) | (this.top >= this.bottom);
    }

    /* JADX INFO: renamed from: translate-k-4lQ0M, reason: not valid java name */
    public final Rect m4011translatek4lQ0M(long p0) {
        int i = (int) (p0 >> 32);
        int i2 = (int) (p0 & 4294967295L);
        return new Rect(this.left + Float.intBitsToFloat(i), this.top + Float.intBitsToFloat(i2), this.right + Float.intBitsToFloat(i), this.bottom + Float.intBitsToFloat(i2));
    }

    public final Rect translate(float p0, float p1) {
        return new Rect(this.left + p0, this.top + p1, this.right + p0, this.bottom + p1);
    }

    public final Rect inflate(float p0) {
        return new Rect(this.left - p0, this.top - p0, this.right + p0, this.bottom + p0);
    }

    public final Rect deflate(float p0) {
        return inflate(-p0);
    }

    public final Rect intersect(Rect p0) {
        return new Rect(Math.max(this.left, p0.left), Math.max(this.top, p0.top), Math.min(this.right, p0.right), Math.min(this.bottom, p0.bottom));
    }

    public final Rect intersect(float p0, float p1, float p2, float p3) {
        return new Rect(Math.max(this.left, p0), Math.max(this.top, p1), Math.min(this.right, p2), Math.min(this.bottom, p3));
    }

    public final boolean overlaps(Rect p0) {
        boolean z = this.left < p0.right;
        boolean z2 = p0.left < this.right;
        return z & z2 & (this.top < p0.bottom) & (p0.top < this.bottom);
    }

    /* JADX INFO: renamed from: getTopLeft-F1C5BW0, reason: not valid java name */
    public final long m4009getTopLeftF1C5BW0() {
        float f = this.left;
        return Offset.m3966constructorimpl((((long) Float.floatToRawIntBits(this.top)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32));
    }

    /* JADX INFO: renamed from: getTopCenter-F1C5BW0, reason: not valid java name */
    public final long m4008getTopCenterF1C5BW0() {
        float f = this.left;
        float right = (getRight() - getLeft()) / 2.0f;
        float f2 = this.top;
        return Offset.m3966constructorimpl((((long) Float.floatToRawIntBits(f + right)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
    }

    /* JADX INFO: renamed from: getTopRight-F1C5BW0, reason: not valid java name */
    public final long m4010getTopRightF1C5BW0() {
        float f = this.right;
        return Offset.m3966constructorimpl((((long) Float.floatToRawIntBits(this.top)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32));
    }

    /* JADX INFO: renamed from: getCenterLeft-F1C5BW0, reason: not valid java name */
    public final long m4005getCenterLeftF1C5BW0() {
        float f = this.left;
        return Offset.m3966constructorimpl((((long) Float.floatToRawIntBits(this.top + ((getBottom() - getTop()) / 2.0f))) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32));
    }

    /* JADX INFO: renamed from: getCenter-F1C5BW0, reason: not valid java name */
    public final long m4004getCenterF1C5BW0() {
        float f = this.left;
        float right = (getRight() - getLeft()) / 2.0f;
        float f2 = this.top;
        float bottom = (getBottom() - getTop()) / 2.0f;
        return Offset.m3966constructorimpl((((long) Float.floatToRawIntBits(f + right)) << 32) | (((long) Float.floatToRawIntBits(f2 + bottom)) & 4294967295L));
    }

    /* JADX INFO: renamed from: getCenterRight-F1C5BW0, reason: not valid java name */
    public final long m4006getCenterRightF1C5BW0() {
        float f = this.right;
        return Offset.m3966constructorimpl((((long) Float.floatToRawIntBits(this.top + ((getBottom() - getTop()) / 2.0f))) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32));
    }

    /* JADX INFO: renamed from: getBottomLeft-F1C5BW0, reason: not valid java name */
    public final long m4002getBottomLeftF1C5BW0() {
        float f = this.left;
        return Offset.m3966constructorimpl((((long) Float.floatToRawIntBits(this.bottom)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32));
    }

    /* JADX INFO: renamed from: getBottomCenter-F1C5BW0, reason: not valid java name */
    public final long m4001getBottomCenterF1C5BW0() {
        float f = this.left;
        float right = (getRight() - getLeft()) / 2.0f;
        float f2 = this.bottom;
        return Offset.m3966constructorimpl((((long) Float.floatToRawIntBits(f + right)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
    }

    /* JADX INFO: renamed from: getBottomRight-F1C5BW0, reason: not valid java name */
    public final long m4003getBottomRightF1C5BW0() {
        float f = this.right;
        return Offset.m3966constructorimpl((((long) Float.floatToRawIntBits(this.bottom)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Rect.fromLTRB(");
        sb.append(GeometryUtilsKt.toStringAsFixed(this.left, 1));
        sb.append(", ");
        sb.append(GeometryUtilsKt.toStringAsFixed(this.top, 1));
        sb.append(", ");
        sb.append(GeometryUtilsKt.toStringAsFixed(this.right, 1));
        sb.append(", ");
        sb.append(GeometryUtilsKt.toStringAsFixed(this.bottom, 1));
        sb.append(')');
        return sb.toString();
    }

    /* JADX INFO: renamed from: getSize-NH-jbRc, reason: not valid java name */
    public final long m4007getSizeNHjbRc() {
        float right = getRight();
        float left = getLeft();
        float bottom = getBottom();
        float top = getTop();
        return Size.m4034constructorimpl((((long) Float.floatToRawIntBits(right - left)) << 32) | (((long) Float.floatToRawIntBits(bottom - top)) & 4294967295L));
    }

    public final float getMinDimension() {
        return Math.min(Math.abs(getRight() - getLeft()), Math.abs(getBottom() - getTop()));
    }

    public final float getMaxDimension() {
        return Math.max(Math.abs(getRight() - getLeft()), Math.abs(getBottom() - getTop()));
    }

    /* JADX INFO: renamed from: contains-k-4lQ0M, reason: not valid java name */
    public final boolean m4000containsk4lQ0M(long p0) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (p0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (p0 & 4294967295L));
        boolean z = fIntBitsToFloat >= this.left;
        boolean z2 = fIntBitsToFloat < this.right;
        return z & z2 & (fIntBitsToFloat2 >= this.top) & (fIntBitsToFloat2 < this.bottom);
    }

    public static /* synthetic */ Rect copy$default(Rect rect, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = rect.left;
        }
        if ((i & 2) != 0) {
            f2 = rect.top;
        }
        if ((i & 4) != 0) {
            f3 = rect.right;
        }
        if ((i & 8) != 0) {
            f4 = rect.bottom;
        }
        return rect.copy(f, f2, f3, f4);
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

    public final Rect copy(float p0, float p1, float p2, float p3) {
        return new Rect(p0, p1, p2, p3);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof Rect)) {
            return false;
        }
        Rect rect = (Rect) p0;
        return Float.compare(this.left, rect.left) == 0 && Float.compare(this.top, rect.top) == 0 && Float.compare(this.right, rect.right) == 0 && Float.compare(this.bottom, rect.bottom) == 0;
    }

    public final int hashCode() {
        return (((((Float.hashCode(this.left) * 31) + Float.hashCode(this.top)) * 31) + Float.hashCode(this.right)) * 31) + Float.hashCode(this.bottom);
    }
}
