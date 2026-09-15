package androidx.compose.ui.layout;

import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\u00020\u000b8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u00108\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u000b8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0015\u0010\r\u001a\u0004\b\u0016\u0010\u000fR\u001a\u0010\u0017\u001a\u00020\u00108\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014"}, d2 = {"Landroidx/compose/ui/layout/InnerRectRulers;", "Landroidx/compose/ui/layout/RectRulers;", "", "p0", "<init>", "([Landroidx/compose/ui/layout/RectRulers;)V", "", "toString", "()Ljava/lang/String;", "rulers", "[Landroidx/compose/ui/layout/RectRulers;", "Landroidx/compose/ui/layout/VerticalRuler;", "left", "Landroidx/compose/ui/layout/VerticalRuler;", "getLeft", "()Landroidx/compose/ui/layout/VerticalRuler;", "Landroidx/compose/ui/layout/HorizontalRuler;", "top", "Landroidx/compose/ui/layout/HorizontalRuler;", "getTop", "()Landroidx/compose/ui/layout/HorizontalRuler;", "right", "getRight", "bottom", "getBottom"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class InnerRectRulers implements RectRulers {
    private final HorizontalRuler bottom;
    private final VerticalRuler left;
    private final VerticalRuler right;
    private final RectRulers[] rulers;
    private final HorizontalRuler top;

    public InnerRectRulers(RectRulers[] rectRulersArr) {
        this.rulers = rectRulersArr;
        VerticalRuler.Companion companion = VerticalRuler.INSTANCE;
        int length = rectRulersArr.length;
        VerticalRuler[] verticalRulerArr = new VerticalRuler[length];
        for (int i = 0; i < length; i++) {
            verticalRulerArr[i] = this.rulers[i].getLeft();
        }
        this.left = companion.maxOf(verticalRulerArr);
        HorizontalRuler.Companion companion2 = HorizontalRuler.INSTANCE;
        int length2 = this.rulers.length;
        HorizontalRuler[] horizontalRulerArr = new HorizontalRuler[length2];
        for (int i2 = 0; i2 < length2; i2++) {
            horizontalRulerArr[i2] = this.rulers[i2].getTop();
        }
        this.top = companion2.maxOf(horizontalRulerArr);
        VerticalRuler.Companion companion3 = VerticalRuler.INSTANCE;
        int length3 = this.rulers.length;
        VerticalRuler[] verticalRulerArr2 = new VerticalRuler[length3];
        for (int i3 = 0; i3 < length3; i3++) {
            verticalRulerArr2[i3] = this.rulers[i3].getRight();
        }
        this.right = companion3.minOf(verticalRulerArr2);
        HorizontalRuler.Companion companion4 = HorizontalRuler.INSTANCE;
        int length4 = this.rulers.length;
        HorizontalRuler[] horizontalRulerArr2 = new HorizontalRuler[length4];
        for (int i4 = 0; i4 < length4; i4++) {
            horizontalRulerArr2[i4] = this.rulers[i4].getBottom();
        }
        this.bottom = companion4.minOf(horizontalRulerArr2);
    }

    @Override // androidx.compose.ui.layout.RectRulers
    public final VerticalRuler getLeft() {
        return this.left;
    }

    @Override // androidx.compose.ui.layout.RectRulers
    public final HorizontalRuler getTop() {
        return this.top;
    }

    @Override // androidx.compose.ui.layout.RectRulers
    public final VerticalRuler getRight() {
        return this.right;
    }

    @Override // androidx.compose.ui.layout.RectRulers
    public final HorizontalRuler getBottom() {
        return this.bottom;
    }

    public final String toString() {
        return ArraysKt.joinToString$default(this.rulers, (CharSequence) null, "innermostOf(", ")", 0, (CharSequence) null, (Function1) null, 57, (Object) null);
    }
}
