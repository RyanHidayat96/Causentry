package androidx.compose.ui.geometry;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\r\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\r\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0010J-\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\bJ\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0015\u0010\u0017J\u0018\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\tH\u0086\u0002¢\u0006\u0004\b\u0018\u0010\u0019J-\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0017¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\u001f\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010\u0010R\"\u0010$\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\"\"\u0004\b&\u0010\u0010R\"\u0010'\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b'\u0010 \u001a\u0004\b(\u0010\"\"\u0004\b)\u0010\u0010R\"\u0010*\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b*\u0010 \u001a\u0004\b+\u0010\"\"\u0004\b,\u0010\u0010R\u0012\u0010.\u001a\u00020\u00028Ç\u0002¢\u0006\u0006\u001a\u0004\b-\u0010\"R\u0012\u00100\u001a\u00020\u00028Ç\u0002¢\u0006\u0006\u001a\u0004\b/\u0010\"R\u0011\u00104\u001a\u0002018G¢\u0006\u0006\u001a\u0004\b2\u00103R\u0011\u00105\u001a\u00020\u00148G¢\u0006\u0006\u001a\u0004\b5\u00106R\u0011\u00107\u001a\u00020\u00148G¢\u0006\u0006\u001a\u0004\b7\u00106R\u0011\u00108\u001a\u00020\u00148G¢\u0006\u0006\u001a\u0004\b8\u00106R\u0011\u0010:\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b9\u0010\"R\u0011\u0010<\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b;\u0010\"R\u0011\u0010>\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b=\u00103R\u0011\u0010@\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b?\u00103R\u0011\u0010B\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\bA\u00103R\u0011\u0010D\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\bC\u00103R\u0011\u0010F\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\bE\u00103R\u0011\u0010H\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\bG\u00103R\u0011\u0010J\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\bI\u00103R\u0011\u0010L\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\bK\u00103R\u0011\u0010N\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\bM\u00103"}, d2 = {"Landroidx/compose/ui/geometry/MutableRect;", "", "", "p0", "p1", "p2", "p3", "<init>", "(FFFF)V", "Landroidx/compose/ui/geometry/Offset;", "", "translate-k-4lQ0M", "(J)V", "translate", "(FF)V", "inflate", "(F)V", "deflate", "intersect", "Landroidx/compose/ui/geometry/Rect;", "", "overlaps", "(Landroidx/compose/ui/geometry/Rect;)Z", "(Landroidx/compose/ui/geometry/MutableRect;)Z", "contains-k-4lQ0M", "(J)Z", "contains", "set", "", "toString", "()Ljava/lang/String;", "left", "F", "getLeft", "()F", "setLeft", "top", "getTop", "setTop", "right", "getRight", "setRight", "bottom", "getBottom", "setBottom", "getWidth", "width", "getHeight", "height", "Landroidx/compose/ui/geometry/Size;", "getSize-NH-jbRc", "()J", "size", "isInfinite", "()Z", "isFinite", "isEmpty", "getMinDimension", "minDimension", "getMaxDimension", "maxDimension", "getTopLeft-F1C5BW0", "topLeft", "getTopCenter-F1C5BW0", "topCenter", "getTopRight-F1C5BW0", "topRight", "getCenterLeft-F1C5BW0", "centerLeft", "getCenter-F1C5BW0", "center", "getCenterRight-F1C5BW0", "centerRight", "getBottomLeft-F1C5BW0", "bottomLeft", "getBottomCenter-F1C5BW0", "bottomCenter", "getBottomRight-F1C5BW0", "bottomRight"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MutableRect {
    public static final int $stable = 8;
    private float bottom;
    private float left;
    private float right;
    private float top;

    public MutableRect(float f, float f2, float f3, float f4) {
        this.left = f;
        this.top = f2;
        this.right = f3;
        this.bottom = f4;
    }

    public final float getBottom() {
        return this.bottom;
    }

    public final float getLeft() {
        return this.left;
    }

    public final float getRight() {
        return this.right;
    }

    public final float getTop() {
        return this.top;
    }

    public final void setBottom(float f) {
        this.bottom = f;
    }

    public final void setLeft(float f) {
        this.left = f;
    }

    public final void setRight(float f) {
        this.right = f;
    }

    public final void setTop(float f) {
        this.top = f;
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

    public final void translate(float p0, float p1) {
        this.left += p0;
        this.top += p1;
        this.right += p0;
        this.bottom += p1;
    }

    public final void inflate(float p0) {
        this.left -= p0;
        this.top -= p0;
        this.right += p0;
        this.bottom += p0;
    }

    public final void deflate(float p0) {
        inflate(-p0);
    }

    public final void intersect(float p0, float p1, float p2, float p3) {
        this.left = Math.max(p0, this.left);
        this.top = Math.max(p1, this.top);
        this.right = Math.min(p2, this.right);
        this.bottom = Math.min(p3, this.bottom);
    }

    public final boolean overlaps(Rect p0) {
        boolean z = this.left < p0.getRight();
        boolean z2 = p0.getLeft() < this.right;
        return z & z2 & (this.top < p0.getBottom()) & (p0.getTop() < this.bottom);
    }

    public final boolean overlaps(MutableRect p0) {
        return this.right > p0.left && p0.right > this.left && this.bottom > p0.top && p0.bottom > this.top;
    }

    /* JADX INFO: renamed from: getTopLeft-F1C5BW0, reason: not valid java name */
    public final long m3957getTopLeftF1C5BW0() {
        float f = this.left;
        return Offset.m3966constructorimpl((((long) Float.floatToRawIntBits(this.top)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32));
    }

    /* JADX INFO: renamed from: getTopCenter-F1C5BW0, reason: not valid java name */
    public final long m3956getTopCenterF1C5BW0() {
        float f = this.left;
        float right = (getRight() - getLeft()) / 2.0f;
        float f2 = this.top;
        return Offset.m3966constructorimpl((((long) Float.floatToRawIntBits(f + right)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
    }

    /* JADX INFO: renamed from: getTopRight-F1C5BW0, reason: not valid java name */
    public final long m3958getTopRightF1C5BW0() {
        float f = this.right;
        return Offset.m3966constructorimpl((((long) Float.floatToRawIntBits(this.top)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32));
    }

    /* JADX INFO: renamed from: getCenterLeft-F1C5BW0, reason: not valid java name */
    public final long m3953getCenterLeftF1C5BW0() {
        float f = this.left;
        return Offset.m3966constructorimpl((((long) Float.floatToRawIntBits(this.top + ((getBottom() - getTop()) / 2.0f))) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32));
    }

    /* JADX INFO: renamed from: getCenter-F1C5BW0, reason: not valid java name */
    public final long m3952getCenterF1C5BW0() {
        float f = this.left;
        float right = (getRight() - getLeft()) / 2.0f;
        float f2 = this.top;
        float bottom = (getBottom() - getTop()) / 2.0f;
        return Offset.m3966constructorimpl((((long) Float.floatToRawIntBits(f + right)) << 32) | (((long) Float.floatToRawIntBits(f2 + bottom)) & 4294967295L));
    }

    /* JADX INFO: renamed from: getCenterRight-F1C5BW0, reason: not valid java name */
    public final long m3954getCenterRightF1C5BW0() {
        float f = this.right;
        return Offset.m3966constructorimpl((((long) Float.floatToRawIntBits(this.top + ((getBottom() - getTop()) / 2.0f))) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32));
    }

    /* JADX INFO: renamed from: getBottomLeft-F1C5BW0, reason: not valid java name */
    public final long m3950getBottomLeftF1C5BW0() {
        float f = this.left;
        return Offset.m3966constructorimpl((((long) Float.floatToRawIntBits(this.bottom)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32));
    }

    /* JADX INFO: renamed from: getBottomCenter-F1C5BW0, reason: not valid java name */
    public final long m3949getBottomCenterF1C5BW0() {
        float f = this.left;
        float right = (getRight() - getLeft()) / 2.0f;
        float f2 = this.bottom;
        return Offset.m3966constructorimpl((((long) Float.floatToRawIntBits(f + right)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
    }

    /* JADX INFO: renamed from: getBottomRight-F1C5BW0, reason: not valid java name */
    public final long m3951getBottomRightF1C5BW0() {
        float f = this.right;
        return Offset.m3966constructorimpl((((long) Float.floatToRawIntBits(this.bottom)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32));
    }

    public final void set(float p0, float p1, float p2, float p3) {
        this.left = p0;
        this.top = p1;
        this.right = p2;
        this.bottom = p3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MutableRect(");
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
    public final long m3955getSizeNHjbRc() {
        float right = getRight();
        float left = getLeft();
        float bottom = getBottom();
        float top = getTop();
        return Size.m4034constructorimpl((((long) Float.floatToRawIntBits(right - left)) << 32) | (((long) Float.floatToRawIntBits(bottom - top)) & 4294967295L));
    }

    /* JADX INFO: renamed from: translate-k-4lQ0M, reason: not valid java name */
    public final void m3959translatek4lQ0M(long p0) {
        translate(Float.intBitsToFloat((int) (p0 >> 32)), Float.intBitsToFloat((int) (p0 & 4294967295L)));
    }

    public final float getMinDimension() {
        return Math.min(Math.abs(getRight() - getLeft()), Math.abs(getBottom() - getTop()));
    }

    public final float getMaxDimension() {
        return Math.max(Math.abs(getRight() - getLeft()), Math.abs(getBottom() - getTop()));
    }

    /* JADX INFO: renamed from: contains-k-4lQ0M, reason: not valid java name */
    public final boolean m3948containsk4lQ0M(long p0) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (p0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (p0 & 4294967295L));
        boolean z = fIntBitsToFloat >= this.left;
        boolean z2 = fIntBitsToFloat < this.right;
        return z & z2 & (fIntBitsToFloat2 >= this.top) & (fIntBitsToFloat2 < this.bottom);
    }
}
