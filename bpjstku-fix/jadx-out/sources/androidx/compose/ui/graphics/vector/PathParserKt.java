package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Path;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0014\n\u0002\b\u0004\u001a#\u0010\u0004\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a_\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a_\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0014\u0010\u0016\u001a\u00020\u0006*\u00020\u0006H\u0082\b¢\u0006\u0004\b\u0016\u0010\u0017\"\u001a\u0010\u0019\u001a\u00020\u00188\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c"}, d2 = {"", "Landroidx/compose/ui/graphics/vector/PathNode;", "Landroidx/compose/ui/graphics/Path;", "p0", "toPath", "(Ljava/util/List;Landroidx/compose/ui/graphics/Path;)Landroidx/compose/ui/graphics/Path;", "", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "", "p8", "p9", "", "drawArc", "(Landroidx/compose/ui/graphics/Path;DDDDDDDZZ)V", "arcToBezier", "(Landroidx/compose/ui/graphics/Path;DDDDDDDDD)V", "toRadians", "(D)D", "", "EmptyArray", "[F", "getEmptyArray", "()[F"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PathParserKt {
    private static final float[] EmptyArray = new float[0];

    private static final double toRadians(double d) {
        return (d / 180.0d) * 3.141592653589793d;
    }

    public static final float[] getEmptyArray() {
        return EmptyArray;
    }

    public static /* synthetic */ Path toPath$default(List list, Path path, int i, Object obj) {
        if ((i & 1) != 0) {
            path = AndroidPath_androidKt.Path();
        }
        return toPath(list, path);
    }

    public static final Path toPath(List<? extends PathNode> list, Path path) {
        PathNode pathNode;
        float f;
        int i;
        int i2;
        float arcStartX;
        float arcStartY;
        float f2;
        float f3;
        float x1;
        float dy2;
        float x2;
        float y2;
        float f4;
        float f5;
        float dx1;
        float dy3;
        List<? extends PathNode> list2 = list;
        Path path2 = path;
        int iMo4107getFillTypeRgk1Os = path.mo4107getFillTypeRgk1Os();
        path.rewind();
        path2.mo4109setFillTypeoQ8Xj4U(iMo4107getFillTypeRgk1Os);
        PathNode pathNode2 = list.isEmpty() ? PathNode.Close.INSTANCE : list2.get(0);
        int size = list2.size();
        float f6 = 0.0f;
        int i3 = 0;
        float dy1 = 0.0f;
        float dx2 = 0.0f;
        float x = 0.0f;
        float y = 0.0f;
        float f7 = 0.0f;
        float f8 = 0.0f;
        while (i3 < size) {
            PathNode pathNode3 = list2.get(i3);
            if (pathNode3 instanceof PathNode.Close) {
                path.close();
                pathNode = pathNode3;
                f = f6;
                i = i3;
                i2 = size;
                arcStartX = f7;
                arcStartY = f8;
            } else {
                if (pathNode3 instanceof PathNode.RelativeMoveTo) {
                    PathNode.RelativeMoveTo relativeMoveTo = (PathNode.RelativeMoveTo) pathNode3;
                    x += relativeMoveTo.getDx();
                    y += relativeMoveTo.getDy();
                    path2.relativeMoveTo(relativeMoveTo.getDx(), relativeMoveTo.getDy());
                    f7 = x;
                } else {
                    if (pathNode3 instanceof PathNode.MoveTo) {
                        PathNode.MoveTo moveTo = (PathNode.MoveTo) pathNode3;
                        float x3 = moveTo.getX();
                        float y3 = moveTo.getY();
                        path2.moveTo(moveTo.getX(), moveTo.getY());
                        x = x3;
                        f7 = x;
                        y = y3;
                    } else {
                        if (pathNode3 instanceof PathNode.RelativeLineTo) {
                            PathNode.RelativeLineTo relativeLineTo = (PathNode.RelativeLineTo) pathNode3;
                            path2.relativeLineTo(relativeLineTo.getDx(), relativeLineTo.getDy());
                            x += relativeLineTo.getDx();
                            dy2 = relativeLineTo.getDy();
                        } else {
                            if (pathNode3 instanceof PathNode.LineTo) {
                                PathNode.LineTo lineTo = (PathNode.LineTo) pathNode3;
                                path2.lineTo(lineTo.getX(), lineTo.getY());
                                float x4 = lineTo.getX();
                                y = lineTo.getY();
                                x = x4;
                            } else if (pathNode3 instanceof PathNode.RelativeHorizontalTo) {
                                PathNode.RelativeHorizontalTo relativeHorizontalTo = (PathNode.RelativeHorizontalTo) pathNode3;
                                path2.relativeLineTo(relativeHorizontalTo.getDx(), f6);
                                x += relativeHorizontalTo.getDx();
                            } else if (pathNode3 instanceof PathNode.HorizontalTo) {
                                PathNode.HorizontalTo horizontalTo = (PathNode.HorizontalTo) pathNode3;
                                path2.lineTo(horizontalTo.getX(), y);
                                x = horizontalTo.getX();
                            } else if (pathNode3 instanceof PathNode.RelativeVerticalTo) {
                                PathNode.RelativeVerticalTo relativeVerticalTo = (PathNode.RelativeVerticalTo) pathNode3;
                                path2.relativeLineTo(f6, relativeVerticalTo.getDy());
                                dy2 = relativeVerticalTo.getDy();
                            } else if (pathNode3 instanceof PathNode.VerticalTo) {
                                PathNode.VerticalTo verticalTo = (PathNode.VerticalTo) pathNode3;
                                path2.lineTo(x, verticalTo.getY());
                                y = verticalTo.getY();
                            } else {
                                if (pathNode3 instanceof PathNode.RelativeCurveTo) {
                                    PathNode.RelativeCurveTo relativeCurveTo = (PathNode.RelativeCurveTo) pathNode3;
                                    path.relativeCubicTo(relativeCurveTo.getDx1(), relativeCurveTo.getDy1(), relativeCurveTo.getDx2(), relativeCurveTo.getDy2(), relativeCurveTo.getDx3(), relativeCurveTo.getDy3());
                                    dx1 = relativeCurveTo.getDx2() + x;
                                    dy1 = relativeCurveTo.getDy2() + y;
                                    x += relativeCurveTo.getDx3();
                                    dy3 = relativeCurveTo.getDy3();
                                } else {
                                    if (pathNode3 instanceof PathNode.CurveTo) {
                                        PathNode.CurveTo curveTo = (PathNode.CurveTo) pathNode3;
                                        path.cubicTo(curveTo.getX1(), curveTo.getY1(), curveTo.getX2(), curveTo.getY2(), curveTo.getX3(), curveTo.getY3());
                                        x1 = curveTo.getX2();
                                        dy1 = curveTo.getY2();
                                        x2 = curveTo.getX3();
                                        y2 = curveTo.getY3();
                                    } else if (pathNode3 instanceof PathNode.RelativeReflectiveCurveTo) {
                                        if (pathNode2.getIsCurve()) {
                                            float f9 = y - dy1;
                                            f4 = x - dx2;
                                            f5 = f9;
                                        } else {
                                            f4 = f6;
                                            f5 = f4;
                                        }
                                        PathNode.RelativeReflectiveCurveTo relativeReflectiveCurveTo = (PathNode.RelativeReflectiveCurveTo) pathNode3;
                                        path.relativeCubicTo(f4, f5, relativeReflectiveCurveTo.getDx1(), relativeReflectiveCurveTo.getDy1(), relativeReflectiveCurveTo.getDx2(), relativeReflectiveCurveTo.getDy2());
                                        dx1 = relativeReflectiveCurveTo.getDx1() + x;
                                        dy1 = relativeReflectiveCurveTo.getDy1() + y;
                                        x += relativeReflectiveCurveTo.getDx2();
                                        dy3 = relativeReflectiveCurveTo.getDy2();
                                    } else if (pathNode3 instanceof PathNode.ReflectiveCurveTo) {
                                        if (pathNode2.getIsCurve()) {
                                            x = (x * 2.0f) - dx2;
                                            y = (y * 2.0f) - dy1;
                                        }
                                        PathNode.ReflectiveCurveTo reflectiveCurveTo = (PathNode.ReflectiveCurveTo) pathNode3;
                                        path.cubicTo(x, y, reflectiveCurveTo.getX1(), reflectiveCurveTo.getY1(), reflectiveCurveTo.getX2(), reflectiveCurveTo.getY2());
                                        x1 = reflectiveCurveTo.getX1();
                                        dy1 = reflectiveCurveTo.getY1();
                                        x2 = reflectiveCurveTo.getX2();
                                        y2 = reflectiveCurveTo.getY2();
                                    } else if (pathNode3 instanceof PathNode.RelativeQuadTo) {
                                        PathNode.RelativeQuadTo relativeQuadTo = (PathNode.RelativeQuadTo) pathNode3;
                                        path2.relativeQuadraticTo(relativeQuadTo.getDx1(), relativeQuadTo.getDy1(), relativeQuadTo.getDx2(), relativeQuadTo.getDy2());
                                        dx2 = relativeQuadTo.getDx1() + x;
                                        dy1 = relativeQuadTo.getDy1() + y;
                                        x += relativeQuadTo.getDx2();
                                        dy2 = relativeQuadTo.getDy2();
                                    } else if (pathNode3 instanceof PathNode.QuadTo) {
                                        PathNode.QuadTo quadTo = (PathNode.QuadTo) pathNode3;
                                        path2.quadraticTo(quadTo.getX1(), quadTo.getY1(), quadTo.getX2(), quadTo.getY2());
                                        float x5 = quadTo.getX1();
                                        float y1 = quadTo.getY1();
                                        float x6 = quadTo.getX2();
                                        y = quadTo.getY2();
                                        x = x6;
                                        pathNode = pathNode3;
                                        f = f6;
                                        i = i3;
                                        i2 = size;
                                        dx2 = x5;
                                        dy1 = y1;
                                    } else if (pathNode3 instanceof PathNode.RelativeReflectiveQuadTo) {
                                        if (pathNode2.getIsQuad()) {
                                            f2 = x - dx2;
                                            f3 = y - dy1;
                                        } else {
                                            f2 = f6;
                                            f3 = f2;
                                        }
                                        PathNode.RelativeReflectiveQuadTo relativeReflectiveQuadTo = (PathNode.RelativeReflectiveQuadTo) pathNode3;
                                        path2.relativeQuadraticTo(f2, f3, relativeReflectiveQuadTo.getDx(), relativeReflectiveQuadTo.getDy());
                                        x1 = f2 + x;
                                        x += relativeReflectiveQuadTo.getDx();
                                        dy1 = f3 + y;
                                        y = relativeReflectiveQuadTo.getDy() + y;
                                        pathNode = pathNode3;
                                        f = f6;
                                        i = i3;
                                        i2 = size;
                                        dx2 = x1;
                                    } else if (pathNode3 instanceof PathNode.ReflectiveQuadTo) {
                                        if (pathNode2.getIsQuad()) {
                                            x = (x * 2.0f) - dx2;
                                            y = (y * 2.0f) - dy1;
                                        }
                                        PathNode.ReflectiveQuadTo reflectiveQuadTo = (PathNode.ReflectiveQuadTo) pathNode3;
                                        path2.quadraticTo(x, y, reflectiveQuadTo.getX(), reflectiveQuadTo.getY());
                                        dx2 = x;
                                        pathNode = pathNode3;
                                        f = f6;
                                        i = i3;
                                        i2 = size;
                                        x = reflectiveQuadTo.getX();
                                        dy1 = y;
                                        y = reflectiveQuadTo.getY();
                                    } else if (pathNode3 instanceof PathNode.RelativeArcTo) {
                                        PathNode.RelativeArcTo relativeArcTo = (PathNode.RelativeArcTo) pathNode3;
                                        float arcStartDx = relativeArcTo.getArcStartDx() + x;
                                        float arcStartDy = relativeArcTo.getArcStartDy() + y;
                                        pathNode = pathNode3;
                                        i = i3;
                                        f = 0.0f;
                                        i2 = size;
                                        drawArc(path, x, y, arcStartDx, arcStartDy, relativeArcTo.getHorizontalEllipseRadius(), relativeArcTo.getVerticalEllipseRadius(), relativeArcTo.getTheta(), relativeArcTo.isMoreThanHalf(), relativeArcTo.isPositiveArc());
                                        arcStartY = arcStartDy;
                                        arcStartX = arcStartDx;
                                    } else {
                                        pathNode = pathNode3;
                                        f = f6;
                                        i = i3;
                                        i2 = size;
                                        if (!(pathNode instanceof PathNode.ArcTo)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        PathNode.ArcTo arcTo = (PathNode.ArcTo) pathNode;
                                        drawArc(path, x, y, arcTo.getArcStartX(), arcTo.getArcStartY(), arcTo.getHorizontalEllipseRadius(), arcTo.getVerticalEllipseRadius(), arcTo.getTheta(), arcTo.isMoreThanHalf(), arcTo.isPositiveArc());
                                        arcStartX = arcTo.getArcStartX();
                                        arcStartY = arcTo.getArcStartY();
                                    }
                                    x = x2;
                                    y = y2;
                                    pathNode = pathNode3;
                                    f = f6;
                                    i = i3;
                                    i2 = size;
                                    dx2 = x1;
                                }
                                y += dy3;
                                dx2 = dx1;
                            }
                            pathNode = pathNode3;
                            f = f6;
                            i = i3;
                            i2 = size;
                        }
                        y += dy2;
                        pathNode = pathNode3;
                        f = f6;
                        i = i3;
                        i2 = size;
                    }
                    i3 = i + 1;
                    path2 = path;
                    pathNode2 = pathNode;
                    f6 = f;
                    size = i2;
                    list2 = list;
                }
                f8 = y;
                pathNode = pathNode3;
                f = f6;
                i = i3;
                i2 = size;
                i3 = i + 1;
                path2 = path;
                pathNode2 = pathNode;
                f6 = f;
                size = i2;
                list2 = list;
            }
            dy1 = arcStartY;
            y = dy1;
            dx2 = arcStartX;
            x = dx2;
            i3 = i + 1;
            path2 = path;
            pathNode2 = pathNode;
            f6 = f;
            size = i2;
            list2 = list;
        }
        return path;
    }

    private static final void drawArc(Path path, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z, boolean z2) {
        double d8;
        double d9;
        double d10 = d5;
        double d11 = d6;
        while (true) {
            double d12 = (d7 / 180.0d) * 3.141592653589793d;
            double dCos = Math.cos(d12);
            double dSin = Math.sin(d12);
            double d13 = ((d * dCos) + (d2 * dSin)) / d10;
            double d14 = (((-d) * dSin) + (d2 * dCos)) / d11;
            double d15 = ((d3 * dCos) + (d4 * dSin)) / d10;
            double d16 = (((-d3) * dSin) + (d4 * dCos)) / d11;
            double d17 = d13 - d15;
            double d18 = d14 - d16;
            double d19 = (d13 + d15) / 2.0d;
            double d20 = (d14 + d16) / 2.0d;
            double d21 = (d17 * d17) + (d18 * d18);
            if (d21 == 0.0d) {
                return;
            }
            double d22 = (1.0d / d21) - 0.25d;
            if (d22 < 0.0d) {
                double dSqrt = (float) (Math.sqrt(d21) / 1.99999d);
                d10 *= dSqrt;
                d11 *= dSqrt;
            } else {
                double dSqrt2 = Math.sqrt(d22);
                double d23 = d17 * dSqrt2;
                double d24 = dSqrt2 * d18;
                if (z == z2) {
                    d8 = d19 - d24;
                    d9 = d20 + d23;
                } else {
                    d8 = d19 + d24;
                    d9 = d20 - d23;
                }
                double dAtan2 = Math.atan2(d14 - d9, d13 - d8);
                double dAtan3 = Math.atan2(d16 - d9, d15 - d8) - dAtan2;
                if (z2 != (dAtan3 >= 0.0d)) {
                    dAtan3 = dAtan3 > 0.0d ? dAtan3 - 6.283185307179586d : dAtan3 + 6.283185307179586d;
                }
                double d25 = d8 * d10;
                double d26 = d9 * d11;
                arcToBezier(path, (d25 * dCos) - (d26 * dSin), (d25 * dSin) + (d26 * dCos), d10, d11, d, d2, d12, dAtan2, dAtan3);
                return;
            }
        }
    }

    private static final void arcToBezier(Path path, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        double d10 = d3;
        int iCeil = (int) Math.ceil(Math.abs((d9 * 4.0d) / 3.141592653589793d));
        double dCos = Math.cos(d7);
        double dSin = Math.sin(d7);
        double dCos2 = Math.cos(d8);
        double dSin2 = Math.sin(d8);
        double d11 = -d10;
        double d12 = d11 * dCos;
        double d13 = d4 * dSin;
        double d14 = d11 * dSin;
        double d15 = d4 * dCos;
        double d16 = d9 / ((double) iCeil);
        double d17 = d6;
        double d18 = (dSin2 * d12) - (dCos2 * d13);
        double d19 = (dSin2 * d14) + (dCos2 * d15);
        double d20 = d8;
        int i = 0;
        double d21 = d5;
        while (i < iCeil) {
            double d22 = d20 + d16;
            double dSin3 = Math.sin(d22);
            double dCos3 = Math.cos(d22);
            double d23 = d16;
            double d24 = (d + ((d10 * dCos) * dCos3)) - (d13 * dSin3);
            double d25 = d2 + (d10 * dSin * dCos3) + (d15 * dSin3);
            double d26 = (d12 * dSin3) - (d13 * dCos3);
            double d27 = (dSin3 * d14) + (dCos3 * d15);
            double d28 = d22 - d20;
            double dTan = Math.tan(d28 / 2.0d);
            double dSin4 = (Math.sin(d28) * (Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d)) / 3.0d;
            path.cubicTo((float) (d21 + (d18 * dSin4)), (float) (d17 + (d19 * dSin4)), (float) (d24 - (dSin4 * d26)), (float) (d25 - (dSin4 * d27)), (float) d24, (float) d25);
            i++;
            d17 = d25;
            iCeil = iCeil;
            dSin = dSin;
            d20 = d22;
            d19 = d27;
            dCos = dCos;
            d18 = d26;
            d10 = d3;
            d21 = d24;
            d16 = d23;
        }
    }
}
