package androidx.compose.material3;

import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0011\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0015\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00028Gø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0014R\u001d\u0010\u0019\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u0019\u0010\u0012\u001a\u0004\b\u001a\u0010\u0014\u0082\u0002\u0004\n\u0002\b!"}, d2 = {"Landroidx/compose/material3/TabPosition;", "", "Landroidx/compose/ui/unit/Dp;", "p0", "p1", "p2", "<init>", "(FFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "contentWidth", "F", "getContentWidth-D9Ej5fM", "()F", "left", "getLeft-D9Ej5fM", "getRight-D9Ej5fM", "right", "width", "getWidth-D9Ej5fM"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TabPosition {
    public static final int $stable = 0;
    private final float contentWidth;
    private final float left;
    private final float width;

    private TabPosition(float f, float f2, float f3) {
        this.left = f;
        this.width = f2;
        this.contentWidth = f3;
    }

    /* JADX INFO: renamed from: getContentWidth-D9Ej5fM, reason: not valid java name and from getter */
    public final float getContentWidth() {
        return this.contentWidth;
    }

    /* JADX INFO: renamed from: getLeft-D9Ej5fM, reason: not valid java name and from getter */
    public final float getLeft() {
        return this.left;
    }

    /* JADX INFO: renamed from: getWidth-D9Ej5fM, reason: not valid java name and from getter */
    public final float getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: getRight-D9Ej5fM, reason: not valid java name */
    public final float m2549getRightD9Ej5fM() {
        return Dp.m6935constructorimpl(this.left + this.width);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof TabPosition)) {
            return false;
        }
        TabPosition tabPosition = (TabPosition) p0;
        return Dp.m6940equalsimpl0(this.left, tabPosition.left) && Dp.m6940equalsimpl0(this.width, tabPosition.width) && Dp.m6940equalsimpl0(this.contentWidth, tabPosition.contentWidth);
    }

    public final int hashCode() {
        return (((Dp.m6941hashCodeimpl(this.left) * 31) + Dp.m6941hashCodeimpl(this.width)) * 31) + Dp.m6941hashCodeimpl(this.contentWidth);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TabPosition(left=");
        sb.append((Object) Dp.m6946toStringimpl(this.left));
        sb.append(", right=");
        sb.append((Object) Dp.m6946toStringimpl(m2549getRightD9Ej5fM()));
        sb.append(", width=");
        sb.append((Object) Dp.m6946toStringimpl(this.width));
        sb.append(", contentWidth=");
        sb.append((Object) Dp.m6946toStringimpl(this.contentWidth));
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ TabPosition(float f, float f2, float f3, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3);
    }
}
