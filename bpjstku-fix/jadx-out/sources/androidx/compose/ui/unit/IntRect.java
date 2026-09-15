package androidx.compose.ui.unit;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0087\b\u0018\u0000 X2\u00020\u0001:\u0001XB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\f\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u001a\u001a\u00020\u0019H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ8\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010#\u001a\u00020\u00132\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u001dR \u0010&\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b&\u0010'\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010\u001dR \u0010+\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b+\u0010'\u0012\u0004\b-\u0010*\u001a\u0004\b,\u0010\u001dR \u0010.\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b.\u0010'\u0012\u0004\b0\u0010*\u001a\u0004\b/\u0010\u001dR \u00101\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b1\u0010'\u0012\u0004\b3\u0010*\u001a\u0004\b2\u0010\u001dR\u001a\u00106\u001a\u00020\u00028GX\u0087\u0004¢\u0006\f\u0012\u0004\b5\u0010*\u001a\u0004\b4\u0010\u001dR\u001a\u00109\u001a\u00020\u00028GX\u0087\u0004¢\u0006\f\u0012\u0004\b8\u0010*\u001a\u0004\b7\u0010\u001dR\u001a\u0010>\u001a\u00020:8GX\u0087\u0004¢\u0006\f\u0012\u0004\b=\u0010*\u001a\u0004\b;\u0010<R\u001a\u0010?\u001a\u00020\u00138GX\u0087\u0004¢\u0006\f\u0012\u0004\bA\u0010*\u001a\u0004\b?\u0010@R\u0011\u0010C\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\bB\u0010\u001dR\u0011\u0010E\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\bD\u0010\u001dR\u0011\u0010G\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\bF\u0010<R\u0011\u0010I\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\bH\u0010<R\u0011\u0010K\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\bJ\u0010<R\u0011\u0010M\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\bL\u0010<R\u0011\u0010O\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\bN\u0010<R\u0011\u0010Q\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\bP\u0010<R\u0011\u0010S\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\bR\u0010<R\u0011\u0010U\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\bT\u0010<R\u0011\u0010W\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\bV\u0010<"}, d2 = {"Landroidx/compose/ui/unit/IntRect;", "", "", "p0", "p1", "p2", "p3", "<init>", "(IIII)V", "Landroidx/compose/ui/unit/IntOffset;", "translate--gyyYBs", "(J)Landroidx/compose/ui/unit/IntRect;", "translate", "(II)Landroidx/compose/ui/unit/IntRect;", "inflate", "(I)Landroidx/compose/ui/unit/IntRect;", "deflate", "intersect", "(Landroidx/compose/ui/unit/IntRect;)Landroidx/compose/ui/unit/IntRect;", "", "overlaps", "(Landroidx/compose/ui/unit/IntRect;)Z", "contains--gyyYBs", "(J)Z", "contains", "", "toString", "()Ljava/lang/String;", "component1", "()I", "component2", "component3", "component4", "copy", "(IIII)Landroidx/compose/ui/unit/IntRect;", "equals", "(Ljava/lang/Object;)Z", "hashCode", "left", "I", "getLeft", "getLeft$annotations", "()V", "top", "getTop", "getTop$annotations", "right", "getRight", "getRight$annotations", "bottom", "getBottom", "getBottom$annotations", "getWidth", "getWidth$annotations", "width", "getHeight", "getHeight$annotations", "height", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "()J", "getSize-YbymL2g$annotations", "size", "isEmpty", "()Z", "isEmpty$annotations", "getMinDimension", "minDimension", "getMaxDimension", "maxDimension", "getTopLeft-nOcc-ac", "topLeft", "getTopCenter-nOcc-ac", "topCenter", "getTopRight-nOcc-ac", "topRight", "getCenterLeft-nOcc-ac", "centerLeft", "getCenter-nOcc-ac", "center", "getCenterRight-nOcc-ac", "centerRight", "getBottomLeft-nOcc-ac", "bottomLeft", "getBottomCenter-nOcc-ac", "bottomCenter", "getBottomRight-nOcc-ac", "bottomRight", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class IntRect {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final IntRect Zero = new IntRect(0, 0, 0, 0);
    private final int bottom;
    private final int left;
    private final int right;
    private final int top;

    public static /* synthetic */ void getBottom$annotations() {
    }

    public static /* synthetic */ void getHeight$annotations() {
    }

    public static /* synthetic */ void getLeft$annotations() {
    }

    public static /* synthetic */ void getRight$annotations() {
    }

    /* JADX INFO: renamed from: getSize-YbymL2g$annotations, reason: not valid java name */
    public static /* synthetic */ void m7082getSizeYbymL2g$annotations() {
    }

    public static /* synthetic */ void getTop$annotations() {
    }

    public static /* synthetic */ void getWidth$annotations() {
    }

    public static /* synthetic */ void isEmpty$annotations() {
    }

    public IntRect(int i, int i2, int i3, int i4) {
        this.left = i;
        this.top = i2;
        this.right = i3;
        this.bottom = i4;
    }

    public final int getLeft() {
        return this.left;
    }

    public final int getTop() {
        return this.top;
    }

    public final int getRight() {
        return this.right;
    }

    public final int getBottom() {
        return this.bottom;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/unit/IntRect$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/unit/IntRect;", "Zero", "Landroidx/compose/ui/unit/IntRect;", "getZero", "()Landroidx/compose/ui/unit/IntRect;", "getZero$annotations"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public static /* synthetic */ void getZero$annotations() {
        }

        private Companion() {
        }

        public final IntRect getZero() {
            return IntRect.Zero;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final int getWidth() {
        return this.right - this.left;
    }

    public final int getHeight() {
        return this.bottom - this.top;
    }

    /* JADX INFO: renamed from: getSize-YbymL2g, reason: not valid java name */
    public final long m7090getSizeYbymL2g() {
        return IntSize.m7101constructorimpl((((long) getHeight()) & 4294967295L) | (((long) getWidth()) << 32));
    }

    public final boolean isEmpty() {
        return this.left >= this.right || this.top >= this.bottom;
    }

    /* JADX INFO: renamed from: translate--gyyYBs, reason: not valid java name */
    public final IntRect m7094translategyyYBs(long p0) {
        return new IntRect(this.left + IntOffset.m7063getXimpl(p0), this.top + IntOffset.m7064getYimpl(p0), this.right + IntOffset.m7063getXimpl(p0), this.bottom + IntOffset.m7064getYimpl(p0));
    }

    public final IntRect translate(int p0, int p1) {
        return new IntRect(this.left + p0, this.top + p1, this.right + p0, this.bottom + p1);
    }

    public final IntRect inflate(int p0) {
        return new IntRect(this.left - p0, this.top - p0, this.right + p0, this.bottom + p0);
    }

    public final IntRect deflate(int p0) {
        return inflate(-p0);
    }

    public final IntRect intersect(IntRect p0) {
        return new IntRect(Math.max(this.left, p0.left), Math.max(this.top, p0.top), Math.min(this.right, p0.right), Math.min(this.bottom, p0.bottom));
    }

    public final boolean overlaps(IntRect p0) {
        return this.right > p0.left && p0.right > this.left && this.bottom > p0.top && p0.bottom > this.top;
    }

    public final int getMinDimension() {
        return Math.min(Math.abs(getWidth()), Math.abs(getHeight()));
    }

    public final int getMaxDimension() {
        return Math.max(Math.abs(getWidth()), Math.abs(getHeight()));
    }

    /* JADX INFO: renamed from: getTopLeft-nOcc-ac, reason: not valid java name */
    public final long m7092getTopLeftnOccac() {
        return IntOffset.m7057constructorimpl((((long) this.top) & 4294967295L) | (((long) this.left) << 32));
    }

    /* JADX INFO: renamed from: getTopCenter-nOcc-ac, reason: not valid java name */
    public final long m7091getTopCenternOccac() {
        return IntOffset.m7057constructorimpl((((long) (this.left + (getWidth() / 2))) << 32) | (((long) this.top) & 4294967295L));
    }

    /* JADX INFO: renamed from: getTopRight-nOcc-ac, reason: not valid java name */
    public final long m7093getTopRightnOccac() {
        return IntOffset.m7057constructorimpl((((long) this.top) & 4294967295L) | (((long) this.right) << 32));
    }

    /* JADX INFO: renamed from: getCenterLeft-nOcc-ac, reason: not valid java name */
    public final long m7088getCenterLeftnOccac() {
        return IntOffset.m7057constructorimpl((((long) (this.top + (getHeight() / 2))) & 4294967295L) | (((long) this.left) << 32));
    }

    /* JADX INFO: renamed from: getCenter-nOcc-ac, reason: not valid java name */
    public final long m7087getCenternOccac() {
        return IntOffset.m7057constructorimpl((((long) (this.left + (getWidth() / 2))) << 32) | (((long) (this.top + (getHeight() / 2))) & 4294967295L));
    }

    /* JADX INFO: renamed from: getCenterRight-nOcc-ac, reason: not valid java name */
    public final long m7089getCenterRightnOccac() {
        return IntOffset.m7057constructorimpl((((long) (this.top + (getHeight() / 2))) & 4294967295L) | (((long) this.right) << 32));
    }

    /* JADX INFO: renamed from: getBottomLeft-nOcc-ac, reason: not valid java name */
    public final long m7085getBottomLeftnOccac() {
        return IntOffset.m7057constructorimpl((((long) this.bottom) & 4294967295L) | (((long) this.left) << 32));
    }

    /* JADX INFO: renamed from: getBottomCenter-nOcc-ac, reason: not valid java name */
    public final long m7084getBottomCenternOccac() {
        return IntOffset.m7057constructorimpl((((long) (this.left + (getWidth() / 2))) << 32) | (((long) this.bottom) & 4294967295L));
    }

    /* JADX INFO: renamed from: getBottomRight-nOcc-ac, reason: not valid java name */
    public final long m7086getBottomRightnOccac() {
        return IntOffset.m7057constructorimpl((((long) this.bottom) & 4294967295L) | (((long) this.right) << 32));
    }

    /* JADX INFO: renamed from: contains--gyyYBs, reason: not valid java name */
    public final boolean m7083containsgyyYBs(long p0) {
        return IntOffset.m7063getXimpl(p0) >= this.left && IntOffset.m7063getXimpl(p0) < this.right && IntOffset.m7064getYimpl(p0) >= this.top && IntOffset.m7064getYimpl(p0) < this.bottom;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRect.fromLTRB(");
        sb.append(this.left);
        sb.append(", ");
        sb.append(this.top);
        sb.append(", ");
        sb.append(this.right);
        sb.append(", ");
        sb.append(this.bottom);
        sb.append(')');
        return sb.toString();
    }

    public static /* synthetic */ IntRect copy$default(IntRect intRect, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = intRect.left;
        }
        if ((i5 & 2) != 0) {
            i2 = intRect.top;
        }
        if ((i5 & 4) != 0) {
            i3 = intRect.right;
        }
        if ((i5 & 8) != 0) {
            i4 = intRect.bottom;
        }
        return intRect.copy(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getLeft() {
        return this.left;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTop() {
        return this.top;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getRight() {
        return this.right;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getBottom() {
        return this.bottom;
    }

    public final IntRect copy(int p0, int p1, int p2, int p3) {
        return new IntRect(p0, p1, p2, p3);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof IntRect)) {
            return false;
        }
        IntRect intRect = (IntRect) p0;
        return this.left == intRect.left && this.top == intRect.top && this.right == intRect.right && this.bottom == intRect.bottom;
    }

    public final int hashCode() {
        return (((((Integer.hashCode(this.left) * 31) + Integer.hashCode(this.top)) * 31) + Integer.hashCode(this.right)) * 31) + Integer.hashCode(this.bottom);
    }
}
