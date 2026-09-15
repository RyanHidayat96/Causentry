package androidx.compose.foundation.layout;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\bH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u000eJ\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u001a\u0010\u001bR+\u0010#\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u001c8A@AX\u0081\u008e\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R+\u0010%\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t8G@CX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b$\u0010\u001e\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u0010+\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u0015"}, d2 = {"Landroidx/compose/foundation/layout/AndroidWindowInsets;", "Landroidx/compose/foundation/layout/WindowInsets;", "", "p0", "", "p1", "<init>", "(ILjava/lang/String;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/ui/unit/Density;", "getBottom", "(Landroidx/compose/ui/unit/Density;)I", "Landroidx/compose/ui/unit/LayoutDirection;", "getLeft", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;)I", "getRight", "getTop", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Landroidx/core/view/WindowInsetsCompat;", "", "update$foundation_layout_release", "(Landroidx/core/view/WindowInsetsCompat;I)V", "Landroidx/core/graphics/Insets;", "insets$delegate", "Landroidx/compose/runtime/MutableState;", "getInsets$foundation_layout_release", "()Landroidx/core/graphics/Insets;", "setInsets$foundation_layout_release", "(Landroidx/core/graphics/Insets;)V", "insets", "isVisible$delegate", "isVisible", "()Z", "setVisible", "(Z)V", "name", "Ljava/lang/String;", "type", "I", "getType$foundation_layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidWindowInsets implements WindowInsets {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: insets$delegate, reason: from kotlin metadata */
    private final MutableState insets = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Insets.NONE, null, 2, null);

    /* JADX INFO: renamed from: isVisible$delegate, reason: from kotlin metadata */
    private final MutableState isVisible = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
    private final String name;
    private final int type;

    public AndroidWindowInsets(int i, String str) {
        this.type = i;
        this.name = str;
    }

    /* JADX INFO: renamed from: getType$foundation_layout_release, reason: from getter */
    public final int getType() {
        return this.type;
    }

    public final Insets getInsets$foundation_layout_release() {
        return (Insets) this.insets.getValue();
    }

    public final void setInsets$foundation_layout_release(Insets insets) {
        this.insets.setValue(insets);
    }

    private final void setVisible(boolean z) {
        this.isVisible.setValue(Boolean.valueOf(z));
    }

    public final boolean isVisible() {
        return ((Boolean) this.isVisible.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getLeft(Density p0, LayoutDirection p1) {
        return getInsets$foundation_layout_release().left;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getTop(Density p0) {
        return getInsets$foundation_layout_release().top;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getRight(Density p0, LayoutDirection p1) {
        return getInsets$foundation_layout_release().right;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getBottom(Density p0) {
        return getInsets$foundation_layout_release().bottom;
    }

    public final void update$foundation_layout_release(WindowInsetsCompat p0, int p1) {
        if (p1 == 0 || (p1 & this.type) != 0) {
            setInsets$foundation_layout_release(p0.getInsets(this.type));
            setVisible(p0.isVisible(this.type));
        }
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof AndroidWindowInsets) && this.type == ((AndroidWindowInsets) p0).type;
    }

    public final int hashCode() {
        return this.type;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name);
        sb.append('(');
        sb.append(getInsets$foundation_layout_release().left);
        sb.append(", ");
        sb.append(getInsets$foundation_layout_release().top);
        sb.append(", ");
        sb.append(getInsets$foundation_layout_release().right);
        sb.append(", ");
        sb.append(getInsets$foundation_layout_release().bottom);
        sb.append(')');
        return sb.toString();
    }
}
