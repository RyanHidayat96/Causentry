package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0002\u001a\u0004\u0018\u00010\u0007H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u000eJ\u000f\u0010\u0014\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0017¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u001d\u001a\u00020\u00038\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0015\u0082\u0002\u0004\n\u0002\b!"}, d2 = {"Landroidx/compose/foundation/layout/LimitInsets;", "Landroidx/compose/foundation/layout/WindowInsets;", "p0", "Landroidx/compose/foundation/layout/WindowInsetsSides;", "p1", "<init>", "(Landroidx/compose/foundation/layout/WindowInsets;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/ui/unit/Density;", "", "getBottom", "(Landroidx/compose/ui/unit/Density;)I", "Landroidx/compose/ui/unit/LayoutDirection;", "getLeft", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;)I", "getRight", "getTop", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "insets", "Landroidx/compose/foundation/layout/WindowInsets;", "getInsets", "()Landroidx/compose/foundation/layout/WindowInsets;", "sides", "I", "getSides-JoeWqyM"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class LimitInsets implements WindowInsets {
    private final WindowInsets insets;
    private final int sides;

    private LimitInsets(WindowInsets windowInsets, int i) {
        this.insets = windowInsets;
        this.sides = i;
    }

    public final WindowInsets getInsets() {
        return this.insets;
    }

    /* JADX INFO: renamed from: getSides-JoeWqyM, reason: not valid java name and from getter */
    public final int getSides() {
        return this.sides;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getLeft(Density p0, LayoutDirection p1) {
        int iM1090getAllowLeftInRtlJoeWqyM$foundation_layout_release;
        if (p1 == LayoutDirection.Ltr) {
            iM1090getAllowLeftInRtlJoeWqyM$foundation_layout_release = WindowInsetsSides.INSTANCE.m1089getAllowLeftInLtrJoeWqyM$foundation_layout_release();
        } else {
            iM1090getAllowLeftInRtlJoeWqyM$foundation_layout_release = WindowInsetsSides.INSTANCE.m1090getAllowLeftInRtlJoeWqyM$foundation_layout_release();
        }
        if (WindowInsetsSides.m1083hasAnybkgdKaI$foundation_layout_release(this.sides, iM1090getAllowLeftInRtlJoeWqyM$foundation_layout_release)) {
            return this.insets.getLeft(p0, p1);
        }
        return 0;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getTop(Density p0) {
        if (WindowInsetsSides.m1083hasAnybkgdKaI$foundation_layout_release(this.sides, WindowInsetsSides.INSTANCE.m1099getTopJoeWqyM())) {
            return this.insets.getTop(p0);
        }
        return 0;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getRight(Density p0, LayoutDirection p1) {
        int iM1092getAllowRightInRtlJoeWqyM$foundation_layout_release;
        if (p1 == LayoutDirection.Ltr) {
            iM1092getAllowRightInRtlJoeWqyM$foundation_layout_release = WindowInsetsSides.INSTANCE.m1091getAllowRightInLtrJoeWqyM$foundation_layout_release();
        } else {
            iM1092getAllowRightInRtlJoeWqyM$foundation_layout_release = WindowInsetsSides.INSTANCE.m1092getAllowRightInRtlJoeWqyM$foundation_layout_release();
        }
        if (WindowInsetsSides.m1083hasAnybkgdKaI$foundation_layout_release(this.sides, iM1092getAllowRightInRtlJoeWqyM$foundation_layout_release)) {
            return this.insets.getRight(p0, p1);
        }
        return 0;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getBottom(Density p0) {
        if (WindowInsetsSides.m1083hasAnybkgdKaI$foundation_layout_release(this.sides, WindowInsetsSides.INSTANCE.m1093getBottomJoeWqyM())) {
            return this.insets.getBottom(p0);
        }
        return 0;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof LimitInsets)) {
            return false;
        }
        LimitInsets limitInsets = (LimitInsets) p0;
        return Intrinsics.areEqual(this.insets, limitInsets.insets) && WindowInsetsSides.m1082equalsimpl0(this.sides, limitInsets.sides);
    }

    public final int hashCode() {
        return (this.insets.hashCode() * 31) + WindowInsetsSides.m1084hashCodeimpl(this.sides);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.insets);
        sb.append(" only ");
        sb.append((Object) WindowInsetsSides.m1086toStringimpl(this.sides));
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ LimitInsets(WindowInsets windowInsets, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(windowInsets, i);
    }
}
