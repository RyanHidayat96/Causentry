package androidx.compose.material3;

import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\t\u001a\u00020\u0002HÆ\u0003ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\u0002HÆ\u0003ø\u0001\u0000¢\u0006\u0004\b\n\u0010\bJ'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÇ\u0001ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015H×\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0018\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\bR\u001d\u0010\u001b\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!"}, d2 = {"Landroidx/compose/material3/CaretProperties;", "", "Landroidx/compose/ui/unit/Dp;", "p0", "p1", "<init>", "(FFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-D9Ej5fM", "()F", "component1", "component2-D9Ej5fM", "component2", "copy-YgX7TsA", "(FF)Landroidx/compose/material3/CaretProperties;", "copy", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "caretHeight", "F", "getCaretHeight-D9Ej5fM", "caretWidth", "getCaretWidth-D9Ej5fM"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class CaretProperties {
    public static final int $stable = 0;
    private final float caretHeight;
    private final float caretWidth;

    private CaretProperties(float f, float f2) {
        this.caretHeight = f;
        this.caretWidth = f2;
    }

    /* JADX INFO: renamed from: getCaretHeight-D9Ej5fM, reason: not valid java name */
    public final float m1829getCaretHeightD9Ej5fM() {
        return this.caretHeight;
    }

    /* JADX INFO: renamed from: getCaretWidth-D9Ej5fM, reason: not valid java name */
    public final float m1830getCaretWidthD9Ej5fM() {
        return this.caretWidth;
    }

    public /* synthetic */ CaretProperties(float f, float f2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2);
    }

    /* JADX INFO: renamed from: copy-YgX7TsA$default, reason: not valid java name */
    public static /* synthetic */ CaretProperties m1825copyYgX7TsA$default(CaretProperties caretProperties, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = caretProperties.caretHeight;
        }
        if ((i & 2) != 0) {
            f2 = caretProperties.caretWidth;
        }
        return caretProperties.m1828copyYgX7TsA(f, f2);
    }

    /* JADX INFO: renamed from: component1-D9Ej5fM, reason: not valid java name and from getter */
    public final float getCaretHeight() {
        return this.caretHeight;
    }

    /* JADX INFO: renamed from: component2-D9Ej5fM, reason: not valid java name and from getter */
    public final float getCaretWidth() {
        return this.caretWidth;
    }

    /* JADX INFO: renamed from: copy-YgX7TsA, reason: not valid java name */
    public final CaretProperties m1828copyYgX7TsA(float p0, float p1) {
        return new CaretProperties(p0, p1, null);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof CaretProperties)) {
            return false;
        }
        CaretProperties caretProperties = (CaretProperties) p0;
        return Dp.m6940equalsimpl0(this.caretHeight, caretProperties.caretHeight) && Dp.m6940equalsimpl0(this.caretWidth, caretProperties.caretWidth);
    }

    public final int hashCode() {
        return (Dp.m6941hashCodeimpl(this.caretHeight) * 31) + Dp.m6941hashCodeimpl(this.caretWidth);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CaretProperties(caretHeight=");
        sb.append((Object) Dp.m6946toStringimpl(this.caretHeight));
        sb.append(", caretWidth=");
        sb.append((Object) Dp.m6946toStringimpl(this.caretWidth));
        sb.append(')');
        return sb.toString();
    }
}
