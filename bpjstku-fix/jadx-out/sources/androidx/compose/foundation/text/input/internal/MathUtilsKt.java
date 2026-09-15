package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.selection.SelectionManagerKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\u001a*\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002H\u0080\b¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001e\u0010\u000b\u001a\u00020\b*\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u0007H\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a&\u0010\u000e\u001a\u00020\u0000*\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0007H\u0000ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a*\u0010\u000f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002H\u0080\b¢\u0006\u0004\b\u000f\u0010\u0005\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001"}, d2 = {"", "p0", "Lkotlin/Function0;", "p1", "addExactOrElse", "(IILkotlin/jvm/functions/Function0;)I", "Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/ui/geometry/Rect;", "", "distanceSquaredToClosestCornerFromOutside-3MmeM6k", "(JLandroidx/compose/ui/geometry/Rect;)F", "distanceSquaredToClosestCornerFromOutside", "findClosestRect-9KIMszo", "(JLandroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;)I", "findClosestRect", "subtractExactOrElse"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class MathUtilsKt {
    public static final int addExactOrElse(int i, int i2, Function0<Integer> function0) {
        int i3 = i + i2;
        return ((i ^ i3) & (i2 ^ i3)) < 0 ? function0.invoke().intValue() : i3;
    }

    public static final int subtractExactOrElse(int i, int i2, Function0<Integer> function0) {
        int i3 = i - i2;
        return ((i ^ i2) & (i ^ i3)) < 0 ? function0.invoke().intValue() : i3;
    }

    /* JADX INFO: renamed from: findClosestRect-9KIMszo, reason: not valid java name */
    public static final int m1497findClosestRect9KIMszo(long j, Rect rect, Rect rect2) {
        float fM1496distanceSquaredToClosestCornerFromOutside3MmeM6k = m1496distanceSquaredToClosestCornerFromOutside3MmeM6k(j, rect);
        float fM1496distanceSquaredToClosestCornerFromOutside3MmeM6k2 = m1496distanceSquaredToClosestCornerFromOutside3MmeM6k(j, rect2);
        if (fM1496distanceSquaredToClosestCornerFromOutside3MmeM6k == fM1496distanceSquaredToClosestCornerFromOutside3MmeM6k2) {
            return 0;
        }
        return fM1496distanceSquaredToClosestCornerFromOutside3MmeM6k < fM1496distanceSquaredToClosestCornerFromOutside3MmeM6k2 ? -1 : 1;
    }

    /* JADX INFO: renamed from: distanceSquaredToClosestCornerFromOutside-3MmeM6k, reason: not valid java name */
    private static final float m1496distanceSquaredToClosestCornerFromOutside3MmeM6k(long j, Rect rect) {
        if (SelectionManagerKt.m1701containsInclusiveUv8p0NA(rect, j)) {
            return 0.0f;
        }
        float fM3973getDistanceSquaredimpl = Offset.m3973getDistanceSquaredimpl(Offset.m3978minusMKHz9U(rect.m4009getTopLeftF1C5BW0(), j));
        if (fM3973getDistanceSquaredimpl >= Float.MAX_VALUE) {
            fM3973getDistanceSquaredimpl = Float.MAX_VALUE;
        }
        float fM3973getDistanceSquaredimpl2 = Offset.m3973getDistanceSquaredimpl(Offset.m3978minusMKHz9U(rect.m4010getTopRightF1C5BW0(), j));
        if (fM3973getDistanceSquaredimpl2 < fM3973getDistanceSquaredimpl) {
            fM3973getDistanceSquaredimpl = fM3973getDistanceSquaredimpl2;
        }
        float fM3973getDistanceSquaredimpl3 = Offset.m3973getDistanceSquaredimpl(Offset.m3978minusMKHz9U(rect.m4002getBottomLeftF1C5BW0(), j));
        if (fM3973getDistanceSquaredimpl3 < fM3973getDistanceSquaredimpl) {
            fM3973getDistanceSquaredimpl = fM3973getDistanceSquaredimpl3;
        }
        float fM3973getDistanceSquaredimpl4 = Offset.m3973getDistanceSquaredimpl(Offset.m3978minusMKHz9U(rect.m4003getBottomRightF1C5BW0(), j));
        return fM3973getDistanceSquaredimpl4 < fM3973getDistanceSquaredimpl ? fM3973getDistanceSquaredimpl4 : fM3973getDistanceSquaredimpl;
    }
}
