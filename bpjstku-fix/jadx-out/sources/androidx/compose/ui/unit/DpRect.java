package androidx.compose.ui.unit;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u0001/B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\t\u0012\u0006\u0010\u0004\u001a\u00020\n¢\u0006\u0004\b\u0007\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\rJ\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJ8\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eH×\u0001¢\u0006\u0004\b\u001f\u0010 R \u0010!\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b!\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\rR \u0010&\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b&\u0010\"\u0012\u0004\b(\u0010%\u001a\u0004\b'\u0010\rR \u0010)\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b)\u0010\"\u0012\u0004\b+\u0010%\u001a\u0004\b*\u0010\rR \u0010,\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b,\u0010\"\u0012\u0004\b.\u0010%\u001a\u0004\b-\u0010\r"}, d2 = {"Landroidx/compose/ui/unit/DpRect;", "", "Landroidx/compose/ui/unit/Dp;", "p0", "p1", "p2", "p3", "<init>", "(FFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/unit/DpOffset;", "Landroidx/compose/ui/unit/DpSize;", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-D9Ej5fM", "()F", "component1", "component2-D9Ej5fM", "component2", "component3-D9Ej5fM", "component3", "component4-D9Ej5fM", "component4", "copy-a9UjIt4", "(FFFF)Landroidx/compose/ui/unit/DpRect;", "copy", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "left", "F", "getLeft-D9Ej5fM", "getLeft-D9Ej5fM$annotations", "()V", "top", "getTop-D9Ej5fM", "getTop-D9Ej5fM$annotations", "right", "getRight-D9Ej5fM", "getRight-D9Ej5fM$annotations", "bottom", "getBottom-D9Ej5fM", "getBottom-D9Ej5fM$annotations", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DpRect {
    public static final int $stable = 0;
    private final float bottom;
    private final float left;
    private final float right;
    private final float top;

    /* JADX INFO: renamed from: getBottom-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m7008getBottomD9Ej5fM$annotations() {
    }

    /* JADX INFO: renamed from: getLeft-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m7009getLeftD9Ej5fM$annotations() {
    }

    /* JADX INFO: renamed from: getRight-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m7010getRightD9Ej5fM$annotations() {
    }

    /* JADX INFO: renamed from: getTop-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m7011getTopD9Ej5fM$annotations() {
    }

    private DpRect(float f, float f2, float f3, float f4) {
        this.left = f;
        this.top = f2;
        this.right = f3;
        this.bottom = f4;
    }

    /* JADX INFO: renamed from: getLeft-D9Ej5fM, reason: not valid java name */
    public final float m7018getLeftD9Ej5fM() {
        return this.left;
    }

    /* JADX INFO: renamed from: getTop-D9Ej5fM, reason: not valid java name */
    public final float m7020getTopD9Ej5fM() {
        return this.top;
    }

    /* JADX INFO: renamed from: getRight-D9Ej5fM, reason: not valid java name */
    public final float m7019getRightD9Ej5fM() {
        return this.right;
    }

    /* JADX INFO: renamed from: getBottom-D9Ej5fM, reason: not valid java name */
    public final float m7017getBottomD9Ej5fM() {
        return this.bottom;
    }

    private DpRect(long j, long j2) {
        this(DpOffset.m6996getXD9Ej5fM(j), DpOffset.m6998getYD9Ej5fM(j), Dp.m6935constructorimpl(DpOffset.m6996getXD9Ej5fM(j) + DpSize.m7033getWidthD9Ej5fM(j2)), Dp.m6935constructorimpl(DpOffset.m6998getYD9Ej5fM(j) + DpSize.m7031getHeightD9Ej5fM(j2)), null);
    }

    public /* synthetic */ DpRect(float f, float f2, float f3, float f4, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4);
    }

    public /* synthetic */ DpRect(long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2);
    }

    /* JADX INFO: renamed from: copy-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ DpRect m7007copya9UjIt4$default(DpRect dpRect, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = dpRect.left;
        }
        if ((i & 2) != 0) {
            f2 = dpRect.top;
        }
        if ((i & 4) != 0) {
            f3 = dpRect.right;
        }
        if ((i & 8) != 0) {
            f4 = dpRect.bottom;
        }
        return dpRect.m7016copya9UjIt4(f, f2, f3, f4);
    }

    /* JADX INFO: renamed from: component1-D9Ej5fM, reason: not valid java name and from getter */
    public final float getLeft() {
        return this.left;
    }

    /* JADX INFO: renamed from: component2-D9Ej5fM, reason: not valid java name and from getter */
    public final float getTop() {
        return this.top;
    }

    /* JADX INFO: renamed from: component3-D9Ej5fM, reason: not valid java name and from getter */
    public final float getRight() {
        return this.right;
    }

    /* JADX INFO: renamed from: component4-D9Ej5fM, reason: not valid java name and from getter */
    public final float getBottom() {
        return this.bottom;
    }

    /* JADX INFO: renamed from: copy-a9UjIt4, reason: not valid java name */
    public final DpRect m7016copya9UjIt4(float p0, float p1, float p2, float p3) {
        return new DpRect(p0, p1, p2, p3, null);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof DpRect)) {
            return false;
        }
        DpRect dpRect = (DpRect) p0;
        return Dp.m6940equalsimpl0(this.left, dpRect.left) && Dp.m6940equalsimpl0(this.top, dpRect.top) && Dp.m6940equalsimpl0(this.right, dpRect.right) && Dp.m6940equalsimpl0(this.bottom, dpRect.bottom);
    }

    public final int hashCode() {
        return (((((Dp.m6941hashCodeimpl(this.left) * 31) + Dp.m6941hashCodeimpl(this.top)) * 31) + Dp.m6941hashCodeimpl(this.right)) * 31) + Dp.m6941hashCodeimpl(this.bottom);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DpRect(left=");
        sb.append((Object) Dp.m6946toStringimpl(this.left));
        sb.append(", top=");
        sb.append((Object) Dp.m6946toStringimpl(this.top));
        sb.append(", right=");
        sb.append((Object) Dp.m6946toStringimpl(this.right));
        sb.append(", bottom=");
        sb.append((Object) Dp.m6946toStringimpl(this.bottom));
        sb.append(')');
        return sb.toString();
    }
}
