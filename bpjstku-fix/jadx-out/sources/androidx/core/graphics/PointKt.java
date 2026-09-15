package androidx.core.graphics;

import android.graphics.Point;
import android.graphics.PointF;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0012\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086\n¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0086\n¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0014\u0010\u0002\u001a\u00020\u0006*\u00020\u0005H\u0086\n¢\u0006\u0004\b\u0002\u0010\u0007\u001a\u0014\u0010\u0004\u001a\u00020\u0006*\u00020\u0005H\u0086\n¢\u0006\u0004\b\u0004\u0010\u0007\u001a\u001c\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b\t\u0010\n\u001a\u001c\u0010\t\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0087\n¢\u0006\u0004\b\t\u0010\u000b\u001a\u001c\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0001H\u0087\n¢\u0006\u0004\b\t\u0010\f\u001a\u001c\u0010\t\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\b\u001a\u00020\u0006H\u0087\n¢\u0006\u0004\b\t\u0010\r\u001a\u001c\u0010\u000e\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b\u000e\u0010\n\u001a\u001c\u0010\u000e\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0087\n¢\u0006\u0004\b\u000e\u0010\u000b\u001a\u001c\u0010\u000e\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0001H\u0087\n¢\u0006\u0004\b\u000e\u0010\f\u001a\u001c\u0010\u000e\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\b\u001a\u00020\u0006H\u0087\n¢\u0006\u0004\b\u000e\u0010\r\u001a\u0014\u0010\u000f\u001a\u00020\u0000*\u00020\u0000H\u0087\n¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0014\u0010\u000f\u001a\u00020\u0005*\u00020\u0005H\u0087\n¢\u0006\u0004\b\u000f\u0010\u0011\u001a\u001c\u0010\u0012\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0006H\u0087\n¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001c\u0010\u0012\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\b\u001a\u00020\u0006H\u0087\n¢\u0006\u0004\b\u0012\u0010\r\u001a\u001c\u0010\u0014\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0006H\u0087\n¢\u0006\u0004\b\u0014\u0010\u0013\u001a\u001c\u0010\u0014\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\b\u001a\u00020\u0006H\u0087\n¢\u0006\u0004\b\u0014\u0010\r\u001a\u0014\u0010\u0015\u001a\u00020\u0005*\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0014\u0010\u0017\u001a\u00020\u0000*\u00020\u0005H\u0087\b¢\u0006\u0004\b\u0017\u0010\u0018"}, d2 = {"Landroid/graphics/Point;", "", "component1", "(Landroid/graphics/Point;)I", "component2", "Landroid/graphics/PointF;", "", "(Landroid/graphics/PointF;)F", "p0", "plus", "(Landroid/graphics/Point;Landroid/graphics/Point;)Landroid/graphics/Point;", "(Landroid/graphics/PointF;Landroid/graphics/PointF;)Landroid/graphics/PointF;", "(Landroid/graphics/Point;I)Landroid/graphics/Point;", "(Landroid/graphics/PointF;F)Landroid/graphics/PointF;", "minus", "unaryMinus", "(Landroid/graphics/Point;)Landroid/graphics/Point;", "(Landroid/graphics/PointF;)Landroid/graphics/PointF;", "times", "(Landroid/graphics/Point;F)Landroid/graphics/Point;", "div", "toPointF", "(Landroid/graphics/Point;)Landroid/graphics/PointF;", "toPoint", "(Landroid/graphics/PointF;)Landroid/graphics/Point;"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class PointKt {
    public static final int component1(Point point) {
        return point.x;
    }

    public static final int component2(Point point) {
        return point.y;
    }

    public static final float component1(PointF pointF) {
        return pointF.x;
    }

    public static final float component2(PointF pointF) {
        return pointF.y;
    }

    public static final Point plus(Point point, Point point2) {
        Point point3 = new Point(point.x, point.y);
        point3.offset(point2.x, point2.y);
        return point3;
    }

    public static final PointF plus(PointF pointF, PointF pointF2) {
        PointF pointF3 = new PointF(pointF.x, pointF.y);
        pointF3.offset(pointF2.x, pointF2.y);
        return pointF3;
    }

    public static final Point plus(Point point, int i) {
        Point point2 = new Point(point.x, point.y);
        point2.offset(i, i);
        return point2;
    }

    public static final PointF plus(PointF pointF, float f) {
        PointF pointF2 = new PointF(pointF.x, pointF.y);
        pointF2.offset(f, f);
        return pointF2;
    }

    public static final Point minus(Point point, Point point2) {
        Point point3 = new Point(point.x, point.y);
        point3.offset(-point2.x, -point2.y);
        return point3;
    }

    public static final PointF minus(PointF pointF, PointF pointF2) {
        PointF pointF3 = new PointF(pointF.x, pointF.y);
        pointF3.offset(-pointF2.x, -pointF2.y);
        return pointF3;
    }

    public static final Point minus(Point point, int i) {
        Point point2 = new Point(point.x, point.y);
        int i2 = -i;
        point2.offset(i2, i2);
        return point2;
    }

    public static final PointF minus(PointF pointF, float f) {
        PointF pointF2 = new PointF(pointF.x, pointF.y);
        float f2 = -f;
        pointF2.offset(f2, f2);
        return pointF2;
    }

    public static final Point unaryMinus(Point point) {
        return new Point(-point.x, -point.y);
    }

    public static final PointF unaryMinus(PointF pointF) {
        return new PointF(-pointF.x, -pointF.y);
    }

    public static final Point times(Point point, float f) {
        return new Point(Math.round(point.x * f), Math.round(point.y * f));
    }

    public static final PointF times(PointF pointF, float f) {
        return new PointF(pointF.x * f, pointF.y * f);
    }

    public static final Point div(Point point, float f) {
        return new Point(Math.round(point.x / f), Math.round(point.y / f));
    }

    public static final PointF div(PointF pointF, float f) {
        return new PointF(pointF.x / f, pointF.y / f);
    }

    public static final PointF toPointF(Point point) {
        return new PointF(point);
    }

    public static final Point toPoint(PointF pointF) {
        return new Point((int) pointF.x, (int) pointF.y);
    }
}
