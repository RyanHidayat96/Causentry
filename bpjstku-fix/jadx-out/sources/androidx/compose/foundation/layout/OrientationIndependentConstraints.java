package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\r\b\u0081@\u0018\u00002\u00020\u0001B)\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\t\u0012\u0006\u0010\u0004\u001a\u00020\n¢\u0006\u0004\b\u0007\u0010\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\fJ8\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0013\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u0018J\u0010\u0010\u001d\u001a\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\fJ\u0018\u0010\u001f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u000bJ\u0010\u0010#\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"R\u0012\u0010%\u001a\u00020\u00028Ç\u0002¢\u0006\u0006\u001a\u0004\b$\u0010\u0015R\u0012\u0010'\u001a\u00020\u00028Ç\u0002¢\u0006\u0006\u001a\u0004\b&\u0010\u0015R\u0012\u0010)\u001a\u00020\u00028Ç\u0002¢\u0006\u0006\u001a\u0004\b(\u0010\u0015R\u0012\u0010+\u001a\u00020\u00028Ç\u0002¢\u0006\u0006\u001a\u0004\b*\u0010\u0015R\u0017\u0010,\u001a\u00020\t8\u0002X\u0083\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b,\u0010-\u0088\u0001,\u0092\u0001\u00020\t\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!"}, d2 = {"Landroidx/compose/foundation/layout/OrientationIndependentConstraints;", "", "", "p0", "p1", "p2", "p3", "constructor-impl", "(IIII)J", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/foundation/layout/LayoutOrientation;", "(JLandroidx/compose/foundation/layout/LayoutOrientation;)J", "(J)J", "copy-yUG9Ft0", "(JIIII)J", "copy", "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", "hashCode-impl", "(J)I", "hashCode", "maxHeight-impl", "(JLandroidx/compose/foundation/layout/LayoutOrientation;)I", "maxHeight", "maxWidth-impl", "maxWidth", "stretchCrossAxis-q4ezo7Y", "stretchCrossAxis", "toBoxConstraints-OenEA2s", "toBoxConstraints", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "getCrossAxisMax-impl", "crossAxisMax", "getCrossAxisMin-impl", "crossAxisMin", "getMainAxisMax-impl", "mainAxisMax", "getMainAxisMin-impl", "mainAxisMin", "value", "J"}, k = 1, mv = {1, 8, 0}, xi = 48)
@JvmInline
public final class OrientationIndependentConstraints {
    private final long value;

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    private static long m970constructorimpl(long j) {
        return j;
    }

    private /* synthetic */ OrientationIndependentConstraints(long j) {
        this.value = j;
    }

    /* JADX INFO: renamed from: getMainAxisMin-impl, reason: not valid java name */
    public static final int m979getMainAxisMinimpl(long j) {
        return Constraints.m6890getMinWidthimpl(j);
    }

    /* JADX INFO: renamed from: getMainAxisMax-impl, reason: not valid java name */
    public static final int m978getMainAxisMaximpl(long j) {
        return Constraints.m6888getMaxWidthimpl(j);
    }

    /* JADX INFO: renamed from: getCrossAxisMin-impl, reason: not valid java name */
    public static final int m977getCrossAxisMinimpl(long j) {
        return Constraints.m6889getMinHeightimpl(j);
    }

    /* JADX INFO: renamed from: getCrossAxisMax-impl, reason: not valid java name */
    public static final int m976getCrossAxisMaximpl(long j) {
        return Constraints.m6887getMaxHeightimpl(j);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m969constructorimpl(int i, int i2, int i3, int i4) {
        return m970constructorimpl(ConstraintsKt.Constraints(i, i2, i3, i4));
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m971constructorimpl(long j, LayoutOrientation layoutOrientation) {
        return m969constructorimpl(layoutOrientation == LayoutOrientation.Horizontal ? Constraints.m6890getMinWidthimpl(j) : Constraints.m6889getMinHeightimpl(j), layoutOrientation == LayoutOrientation.Horizontal ? Constraints.m6888getMaxWidthimpl(j) : Constraints.m6887getMaxHeightimpl(j), layoutOrientation == LayoutOrientation.Horizontal ? Constraints.m6889getMinHeightimpl(j) : Constraints.m6890getMinWidthimpl(j), layoutOrientation == LayoutOrientation.Horizontal ? Constraints.m6887getMaxHeightimpl(j) : Constraints.m6888getMaxWidthimpl(j));
    }

    /* JADX INFO: renamed from: toBoxConstraints-OenEA2s, reason: not valid java name */
    public static final long m984toBoxConstraintsOenEA2s(long j, LayoutOrientation layoutOrientation) {
        if (layoutOrientation == LayoutOrientation.Horizontal) {
            return ConstraintsKt.Constraints(Constraints.m6890getMinWidthimpl(j), Constraints.m6888getMaxWidthimpl(j), Constraints.m6889getMinHeightimpl(j), Constraints.m6887getMaxHeightimpl(j));
        }
        return ConstraintsKt.Constraints(Constraints.m6889getMinHeightimpl(j), Constraints.m6887getMaxHeightimpl(j), Constraints.m6890getMinWidthimpl(j), Constraints.m6888getMaxWidthimpl(j));
    }

    /* JADX INFO: renamed from: maxWidth-impl, reason: not valid java name */
    public static final int m982maxWidthimpl(long j, LayoutOrientation layoutOrientation) {
        if (layoutOrientation == LayoutOrientation.Horizontal) {
            return Constraints.m6888getMaxWidthimpl(j);
        }
        return Constraints.m6887getMaxHeightimpl(j);
    }

    /* JADX INFO: renamed from: maxHeight-impl, reason: not valid java name */
    public static final int m981maxHeightimpl(long j, LayoutOrientation layoutOrientation) {
        if (layoutOrientation == LayoutOrientation.Horizontal) {
            return Constraints.m6887getMaxHeightimpl(j);
        }
        return Constraints.m6888getMaxWidthimpl(j);
    }

    /* JADX INFO: renamed from: copy-yUG9Ft0, reason: not valid java name */
    public static final long m972copyyUG9Ft0(long j, int i, int i2, int i3, int i4) {
        return m969constructorimpl(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: stretchCrossAxis-q4ezo7Y, reason: not valid java name */
    public static final long m983stretchCrossAxisq4ezo7Y(long j) {
        return m969constructorimpl(Constraints.m6890getMinWidthimpl(j), Constraints.m6888getMaxWidthimpl(j), Constraints.m6887getMaxHeightimpl(j) != Integer.MAX_VALUE ? Constraints.m6887getMaxHeightimpl(j) : Constraints.m6889getMinHeightimpl(j), Constraints.m6887getMaxHeightimpl(j));
    }

    /* JADX INFO: renamed from: copy-yUG9Ft0$default, reason: not valid java name */
    public static /* synthetic */ long m973copyyUG9Ft0$default(long j, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = Constraints.m6890getMinWidthimpl(j);
        }
        int i6 = i;
        if ((i5 & 2) != 0) {
            i2 = Constraints.m6888getMaxWidthimpl(j);
        }
        int i7 = i2;
        if ((i5 & 4) != 0) {
            i3 = Constraints.m6889getMinHeightimpl(j);
        }
        int i8 = i3;
        if ((i5 & 8) != 0) {
            i4 = Constraints.m6887getMaxHeightimpl(j);
        }
        return m972copyyUG9Ft0(j, i6, i7, i8, i4);
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ OrientationIndependentConstraints m968boximpl(long j) {
        return new OrientationIndependentConstraints(j);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m974equalsimpl(long j, Object obj) {
        return (obj instanceof OrientationIndependentConstraints) && Constraints.m6881equalsimpl0(j, ((OrientationIndependentConstraints) obj).getValue());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m975equalsimpl0(long j, long j2) {
        return Constraints.m6881equalsimpl0(j, j2);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m980hashCodeimpl(long j) {
        return Constraints.m6891hashCodeimpl(j);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m985toStringimpl(long j) {
        StringBuilder sb = new StringBuilder("OrientationIndependentConstraints(value=");
        sb.append((Object) Constraints.m6893toStringimpl(j));
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        return m974equalsimpl(this.value, obj);
    }

    public final int hashCode() {
        return m980hashCodeimpl(this.value);
    }

    public final String toString() {
        return m985toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getValue() {
        return this.value;
    }
}
