package androidx.compose.ui.unit;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\b\u0010\u0006\u001a\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a'\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0013\u0010\u0013\u001a\u00020\u0004*\u00020\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014"}, d2 = {"Landroidx/compose/ui/unit/IntOffset;", "p0", "Landroidx/compose/ui/unit/IntSize;", "p1", "Landroidx/compose/ui/unit/IntRect;", "IntRect-VbeCjmY", "(JJ)Landroidx/compose/ui/unit/IntRect;", "IntRect", "IntRect-E1MhUcY", "", "IntRect-ar5cAso", "(JI)Landroidx/compose/ui/unit/IntRect;", "", "p2", "lerp", "(Landroidx/compose/ui/unit/IntRect;Landroidx/compose/ui/unit/IntRect;F)Landroidx/compose/ui/unit/IntRect;", "Landroidx/compose/ui/geometry/Rect;", "toRect", "(Landroidx/compose/ui/unit/IntRect;)Landroidx/compose/ui/geometry/Rect;", "roundToIntRect", "(Landroidx/compose/ui/geometry/Rect;)Landroidx/compose/ui/unit/IntRect;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class IntRectKt {
    /* JADX INFO: renamed from: IntRect-VbeCjmY, reason: not valid java name */
    public static final IntRect m7096IntRectVbeCjmY(long j, long j2) {
        return new IntRect(IntOffset.m7063getXimpl(j), IntOffset.m7064getYimpl(j), IntOffset.m7063getXimpl(j) + ((int) (j2 >> 32)), IntOffset.m7064getYimpl(j) + ((int) (j2 & 4294967295L)));
    }

    /* JADX INFO: renamed from: IntRect-E1MhUcY, reason: not valid java name */
    public static final IntRect m7095IntRectE1MhUcY(long j, long j2) {
        return new IntRect(IntOffset.m7063getXimpl(j), IntOffset.m7064getYimpl(j), IntOffset.m7063getXimpl(j2), IntOffset.m7064getYimpl(j2));
    }

    /* JADX INFO: renamed from: IntRect-ar5cAso, reason: not valid java name */
    public static final IntRect m7097IntRectar5cAso(long j, int i) {
        return new IntRect(IntOffset.m7063getXimpl(j) - i, IntOffset.m7064getYimpl(j) - i, IntOffset.m7063getXimpl(j) + i, IntOffset.m7064getYimpl(j) + i);
    }

    public static final IntRect lerp(IntRect intRect, IntRect intRect2, float f) {
        return new IntRect(MathHelpersKt.lerp(intRect.getLeft(), intRect2.getLeft(), f), MathHelpersKt.lerp(intRect.getTop(), intRect2.getTop(), f), MathHelpersKt.lerp(intRect.getRight(), intRect2.getRight(), f), MathHelpersKt.lerp(intRect.getBottom(), intRect2.getBottom(), f));
    }

    public static final Rect toRect(IntRect intRect) {
        return new Rect(intRect.getLeft(), intRect.getTop(), intRect.getRight(), intRect.getBottom());
    }

    public static final IntRect roundToIntRect(Rect rect) {
        return new IntRect(Math.round(rect.getLeft()), Math.round(rect.getTop()), Math.round(rect.getRight()), Math.round(rect.getBottom()));
    }
}
