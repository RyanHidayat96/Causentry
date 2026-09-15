package androidx.compose.ui.graphics.vector;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0004\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\nJ\u001f\u0010\f\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\nJ\u001f\u0010\r\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\r\u0010\nJ\u0017\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0011\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0012\u0010\u000fJ?\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J?\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0019\u0010\u0018J/\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ/\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001c\u0010\u001bJ/\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001d\u0010\u001bJ/\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001e\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001f\u0010\nJ\u001f\u0010 \u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b \u0010\nJG\u0010#\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020!2\u0006\u0010\u0015\u001a\u00020!2\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u0006H\u0007¢\u0006\u0004\b#\u0010$JG\u0010%\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020!2\u0006\u0010\u0015\u001a\u00020!2\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u0006H\u0007¢\u0006\u0004\b%\u0010$R$\u0010)\u001a\u0012\u0012\u0004\u0012\u00020'0&j\b\u0012\u0004\u0012\u00020'`(8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020'0+8G¢\u0006\u0006\u001a\u0004\b,\u0010-"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathBuilder;", "", "<init>", "()V", "close", "()Landroidx/compose/ui/graphics/vector/PathBuilder;", "", "p0", "p1", "moveTo", "(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;", "moveToRelative", "lineTo", "lineToRelative", "horizontalLineTo", "(F)Landroidx/compose/ui/graphics/vector/PathBuilder;", "horizontalLineToRelative", "verticalLineTo", "verticalLineToRelative", "p2", "p3", "p4", "p5", "curveTo", "(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;", "curveToRelative", "reflectiveCurveTo", "(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;", "reflectiveCurveToRelative", "quadTo", "quadToRelative", "reflectiveQuadTo", "reflectiveQuadToRelative", "", "p6", "arcTo", "(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;", "arcToRelative", "Ljava/util/ArrayList;", "Landroidx/compose/ui/graphics/vector/PathNode;", "Lkotlin/collections/b;", "_nodes", "Ljava/util/ArrayList;", "", "getNodes", "()Ljava/util/List;", "nodes"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PathBuilder {
    private final ArrayList<PathNode> _nodes = new ArrayList<>(32);

    public final List<PathNode> getNodes() {
        return this._nodes;
    }

    public final PathBuilder close() {
        this._nodes.add(PathNode.Close.INSTANCE);
        return this;
    }

    public final PathBuilder moveTo(float p0, float p1) {
        this._nodes.add(new PathNode.MoveTo(p0, p1));
        return this;
    }

    public final PathBuilder moveToRelative(float p0, float p1) {
        this._nodes.add(new PathNode.RelativeMoveTo(p0, p1));
        return this;
    }

    public final PathBuilder lineTo(float p0, float p1) {
        this._nodes.add(new PathNode.LineTo(p0, p1));
        return this;
    }

    public final PathBuilder lineToRelative(float p0, float p1) {
        this._nodes.add(new PathNode.RelativeLineTo(p0, p1));
        return this;
    }

    public final PathBuilder horizontalLineTo(float p0) {
        this._nodes.add(new PathNode.HorizontalTo(p0));
        return this;
    }

    public final PathBuilder horizontalLineToRelative(float p0) {
        this._nodes.add(new PathNode.RelativeHorizontalTo(p0));
        return this;
    }

    public final PathBuilder verticalLineTo(float p0) {
        this._nodes.add(new PathNode.VerticalTo(p0));
        return this;
    }

    public final PathBuilder verticalLineToRelative(float p0) {
        this._nodes.add(new PathNode.RelativeVerticalTo(p0));
        return this;
    }

    public final PathBuilder curveTo(float p0, float p1, float p2, float p3, float p4, float p5) {
        this._nodes.add(new PathNode.CurveTo(p0, p1, p2, p3, p4, p5));
        return this;
    }

    public final PathBuilder curveToRelative(float p0, float p1, float p2, float p3, float p4, float p5) {
        this._nodes.add(new PathNode.RelativeCurveTo(p0, p1, p2, p3, p4, p5));
        return this;
    }

    public final PathBuilder reflectiveCurveTo(float p0, float p1, float p2, float p3) {
        this._nodes.add(new PathNode.ReflectiveCurveTo(p0, p1, p2, p3));
        return this;
    }

    public final PathBuilder reflectiveCurveToRelative(float p0, float p1, float p2, float p3) {
        this._nodes.add(new PathNode.RelativeReflectiveCurveTo(p0, p1, p2, p3));
        return this;
    }

    public final PathBuilder quadTo(float p0, float p1, float p2, float p3) {
        this._nodes.add(new PathNode.QuadTo(p0, p1, p2, p3));
        return this;
    }

    public final PathBuilder quadToRelative(float p0, float p1, float p2, float p3) {
        this._nodes.add(new PathNode.RelativeQuadTo(p0, p1, p2, p3));
        return this;
    }

    public final PathBuilder reflectiveQuadTo(float p0, float p1) {
        this._nodes.add(new PathNode.ReflectiveQuadTo(p0, p1));
        return this;
    }

    public final PathBuilder reflectiveQuadToRelative(float p0, float p1) {
        this._nodes.add(new PathNode.RelativeReflectiveQuadTo(p0, p1));
        return this;
    }

    public final PathBuilder arcTo(float p0, float p1, float p2, boolean p3, boolean p4, float p5, float p6) {
        this._nodes.add(new PathNode.ArcTo(p0, p1, p2, p3, p4, p5, p6));
        return this;
    }

    public final PathBuilder arcToRelative(float p0, float p1, float p2, boolean p3, boolean p4, float p5, float p6) {
        this._nodes.add(new PathNode.RelativeArcTo(p0, p1, p2, p3, p4, p5, p6));
        return this;
    }
}
