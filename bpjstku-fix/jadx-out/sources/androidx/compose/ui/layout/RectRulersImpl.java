package androidx.compose.ui.layout;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\"\u0010\u000b\u001a\u00020\n8\u0017@\u0017X\u0097\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0012\u001a\u00020\u00118\u0017@\u0017X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0018\u001a\u00020\n8\u0017@\u0017X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\f\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R\"\u0010\u001b\u001a\u00020\u00118\u0017@\u0017X\u0097\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017"}, d2 = {"Landroidx/compose/ui/layout/RectRulersImpl;", "Landroidx/compose/ui/layout/RectRulers;", "", "p0", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "name", "Ljava/lang/String;", "Landroidx/compose/ui/layout/VerticalRuler;", "left", "Landroidx/compose/ui/layout/VerticalRuler;", "getLeft", "()Landroidx/compose/ui/layout/VerticalRuler;", "setLeft", "(Landroidx/compose/ui/layout/VerticalRuler;)V", "Landroidx/compose/ui/layout/HorizontalRuler;", "top", "Landroidx/compose/ui/layout/HorizontalRuler;", "getTop", "()Landroidx/compose/ui/layout/HorizontalRuler;", "setTop", "(Landroidx/compose/ui/layout/HorizontalRuler;)V", "right", "getRight", "setRight", "bottom", "getBottom", "setBottom"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class RectRulersImpl implements RectRulers {
    private final String name;
    private VerticalRuler left = new VerticalRuler();
    private HorizontalRuler top = new HorizontalRuler();
    private VerticalRuler right = new VerticalRuler();
    private HorizontalRuler bottom = new HorizontalRuler();

    public RectRulersImpl(String str) {
        this.name = str;
    }

    @Override // androidx.compose.ui.layout.RectRulers
    public final VerticalRuler getLeft() {
        return this.left;
    }

    public final void setLeft(VerticalRuler verticalRuler) {
        this.left = verticalRuler;
    }

    @Override // androidx.compose.ui.layout.RectRulers
    public final HorizontalRuler getTop() {
        return this.top;
    }

    public final void setTop(HorizontalRuler horizontalRuler) {
        this.top = horizontalRuler;
    }

    @Override // androidx.compose.ui.layout.RectRulers
    public final VerticalRuler getRight() {
        return this.right;
    }

    public final void setRight(VerticalRuler verticalRuler) {
        this.right = verticalRuler;
    }

    @Override // androidx.compose.ui.layout.RectRulers
    public final HorizontalRuler getBottom() {
        return this.bottom;
    }

    public final void setBottom(HorizontalRuler horizontalRuler) {
        this.bottom = horizontalRuler;
    }

    public final String toString() {
        if (this.name == null) {
            return super.toString();
        }
        StringBuilder sb = new StringBuilder("RectRulers(");
        sb.append(this.name);
        sb.append(')');
        return sb.toString();
    }
}
