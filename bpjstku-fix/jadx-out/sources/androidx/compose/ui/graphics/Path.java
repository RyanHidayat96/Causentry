package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\bg\u0018\u0000 Q2\u00020\u0001:\u0002RQJ\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\u0007J\u001f\u0010\t\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\u0007J\u001f\u0010\n\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u0007J/\u0010\r\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H'¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ/\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H'¢\u0006\u0004\b\u0010\u0010\u000eJ/\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u000eJ?\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0002H&¢\u0006\u0004\b\u0014\u0010\u0015J?\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0002H&¢\u0006\u0004\b\u0016\u0010\u0015J/\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00172\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ/\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00172\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0018H&¢\u0006\u0004\b\u001b\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0017H'¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00172\b\b\u0002\u0010\u0004\u001a\u00020\u001eH&¢\u0006\u0004\b\u001c\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0017H'¢\u0006\u0004\b \u0010\u001dJ!\u0010 \u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00172\b\b\u0002\u0010\u0004\u001a\u00020\u001eH&¢\u0006\u0004\b \u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020!H'¢\u0006\u0004\b\"\u0010#J!\u0010\"\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020!2\b\b\u0002\u0010\u0004\u001a\u00020\u001eH&¢\u0006\u0004\b\"\u0010$J'\u0010%\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00172\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H&¢\u0006\u0004\b%\u0010&J'\u0010'\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00172\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H&¢\u0006\u0004\b'\u0010&J!\u0010+\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020(H&¢\u0006\u0004\b)\u0010*J\u000f\u0010,\u001a\u00020\u0005H&¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0005H&¢\u0006\u0004\b.\u0010-J\u000f\u0010/\u001a\u00020\u0005H\u0016¢\u0006\u0004\b/\u0010-J\u0017\u00102\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020(H&¢\u0006\u0004\b0\u00101J\u0017\u00106\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u000203H\u0016¢\u0006\u0004\b4\u00105J\u000f\u00107\u001a\u00020\u0017H'¢\u0006\u0004\b7\u00108J\u0010\u0010:\u001a\u000209H\u0097\u0002¢\u0006\u0004\b:\u0010;J!\u0010:\u001a\u0002092\u0006\u0010\u0003\u001a\u00020<2\b\b\u0002\u0010\u0004\u001a\u00020\u0002H\u0017¢\u0006\u0004\b:\u0010=J'\u0010A\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020>H&¢\u0006\u0004\b?\u0010@J\u0018\u0010B\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0097\u0002¢\u0006\u0004\bB\u0010CJ\u0018\u0010D\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0097\u0002¢\u0006\u0004\bD\u0010CJ\u0018\u0010E\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0097\u0004¢\u0006\u0004\bE\u0010CJ\u0018\u0010F\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0097\u0004¢\u0006\u0004\bF\u0010CJ\u0018\u0010G\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0097\u0004¢\u0006\u0004\bG\u0010CR\u001c\u0010M\u001a\u00020H8'@'X¦\u000e¢\u0006\f\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u0014\u0010N\u001a\u00020\u00188'X¦\u0004¢\u0006\u0006\u001a\u0004\bN\u0010OR\u0014\u0010P\u001a\u00020\u00188'X¦\u0004¢\u0006\u0006\u001a\u0004\bP\u0010Oø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/Path;", "", "", "p0", "p1", "", "moveTo", "(FF)V", "relativeMoveTo", "lineTo", "relativeLineTo", "p2", "p3", "quadraticBezierTo", "(FFFF)V", "quadraticTo", "relativeQuadraticBezierTo", "relativeQuadraticTo", "p4", "p5", "cubicTo", "(FFFFFF)V", "relativeCubicTo", "Landroidx/compose/ui/geometry/Rect;", "", "arcToRad", "(Landroidx/compose/ui/geometry/Rect;FFZ)V", "arcTo", "addRect", "(Landroidx/compose/ui/geometry/Rect;)V", "Landroidx/compose/ui/graphics/Path$Direction;", "(Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/graphics/Path$Direction;)V", "addOval", "Landroidx/compose/ui/geometry/RoundRect;", "addRoundRect", "(Landroidx/compose/ui/geometry/RoundRect;)V", "(Landroidx/compose/ui/geometry/RoundRect;Landroidx/compose/ui/graphics/Path$Direction;)V", "addArcRad", "(Landroidx/compose/ui/geometry/Rect;FF)V", "addArc", "Landroidx/compose/ui/geometry/Offset;", "addPath-Uv8p0NA", "(Landroidx/compose/ui/graphics/Path;J)V", "addPath", "close", "()V", "reset", "rewind", "translate-k-4lQ0M", "(J)V", "translate", "Landroidx/compose/ui/graphics/Matrix;", "transform-58bKbWc", "([F)V", "transform", "getBounds", "()Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/graphics/PathIterator;", "iterator", "()Landroidx/compose/ui/graphics/PathIterator;", "Landroidx/compose/ui/graphics/PathIterator$ConicEvaluation;", "(Landroidx/compose/ui/graphics/PathIterator$ConicEvaluation;F)Landroidx/compose/ui/graphics/PathIterator;", "Landroidx/compose/ui/graphics/PathOperation;", "op-N5in7k0", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Path;I)Z", "op", "plus", "(Landroidx/compose/ui/graphics/Path;)Landroidx/compose/ui/graphics/Path;", "minus", "or", "and", "xor", "Landroidx/compose/ui/graphics/PathFillType;", "getFillType-Rg-k1Os", "()I", "setFillType-oQ8Xj4U", "(I)V", "fillType", "isConvex", "()Z", "isEmpty", "Companion", "Direction"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface Path {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    void addArc(Rect p0, float p1, float p2);

    void addArcRad(Rect p0, float p1, float p2);

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Prefer usage of addOval() with a winding direction", replaceWith = @ReplaceWith(expression = "addOval(oval)", imports = {}))
    /* synthetic */ void addOval(Rect p0);

    void addOval(Rect p0, Direction p1);

    /* JADX INFO: renamed from: addPath-Uv8p0NA */
    void mo4106addPathUv8p0NA(Path p0, long p1);

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Prefer usage of addRect() with a winding direction", replaceWith = @ReplaceWith(expression = "addRect(rect)", imports = {}))
    /* synthetic */ void addRect(Rect p0);

    void addRect(Rect p0, Direction p1);

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Prefer usage of addRoundRect() with a winding direction", replaceWith = @ReplaceWith(expression = "addRoundRect(roundRect)", imports = {}))
    /* synthetic */ void addRoundRect(RoundRect p0);

    void addRoundRect(RoundRect p0, Direction p1);

    void arcTo(Rect p0, float p1, float p2, boolean p3);

    void close();

    void cubicTo(float p0, float p1, float p2, float p3, float p4, float p5);

    Rect getBounds();

    /* JADX INFO: renamed from: getFillType-Rg-k1Os */
    int mo4107getFillTypeRgk1Os();

    boolean isConvex();

    boolean isEmpty();

    void lineTo(float p0, float p1);

    void moveTo(float p0, float p1);

    /* JADX INFO: renamed from: op-N5in7k0 */
    boolean mo4108opN5in7k0(Path p0, Path p1, int p2);

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use quadraticTo() for consistency with cubicTo()", replaceWith = @ReplaceWith(expression = "quadraticTo(x1, y1, x2, y2)", imports = {}))
    void quadraticBezierTo(float p0, float p1, float p2, float p3);

    void relativeCubicTo(float p0, float p1, float p2, float p3, float p4, float p5);

    void relativeLineTo(float p0, float p1);

    void relativeMoveTo(float p0, float p1);

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use relativeQuadraticTo() for consistency with relativeCubicTo()", replaceWith = @ReplaceWith(expression = "relativeQuadraticTo(dx1, dy1, dx2, dy2)", imports = {}))
    void relativeQuadraticBezierTo(float p0, float p1, float p2, float p3);

    void reset();

    /* JADX INFO: renamed from: setFillType-oQ8Xj4U */
    void mo4109setFillTypeoQ8Xj4U(int i);

    /* JADX INFO: renamed from: transform-58bKbWc */
    default void mo4110transform58bKbWc(float[] p0) {
    }

    /* JADX INFO: renamed from: translate-k-4lQ0M */
    void mo4111translatek4lQ0M(long p0);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Landroidx/compose/ui/graphics/Path$Direction;", "", "<init>", "(Ljava/lang/String;I)V", "CounterClockwise", "Clockwise"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum Direction {
        CounterClockwise,
        Clockwise;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

        public static EnumEntries<Direction> getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static void quadraticTo(Path path, float f, float f2, float f3, float f4) {
            Path.super.quadraticTo(f, f2, f3, f4);
        }

        @Deprecated
        public static void relativeQuadraticTo(Path path, float f, float f2, float f3, float f4) {
            Path.super.relativeQuadraticTo(f, f2, f3, f4);
        }

        @Deprecated
        public static void arcToRad(Path path, Rect rect, float f, float f2, boolean z) {
            Path.super.arcToRad(rect, f, f2, z);
        }

        @Deprecated
        public static void rewind(Path path) {
            Path.super.rewind();
        }

        @Deprecated
        /* JADX INFO: renamed from: transform-58bKbWc, reason: not valid java name */
        public static void m4504transform58bKbWc(Path path, float[] fArr) {
            Path.super.mo4110transform58bKbWc(fArr);
        }

        @Deprecated
        public static PathIterator iterator(Path path) {
            return Path.super.iterator();
        }

        @Deprecated
        public static PathIterator iterator(Path path, PathIterator.ConicEvaluation conicEvaluation, float f) {
            return Path.super.iterator(conicEvaluation, f);
        }

        @Deprecated
        public static Path plus(Path path, Path path2) {
            return Path.super.plus(path2);
        }

        @Deprecated
        public static Path minus(Path path, Path path2) {
            return Path.super.minus(path2);
        }

        @Deprecated
        public static Path or(Path path, Path path2) {
            return Path.super.or(path2);
        }

        @Deprecated
        public static Path and(Path path, Path path2) {
            return Path.super.and(path2);
        }

        @Deprecated
        public static Path xor(Path path, Path path2) {
            return Path.super.xor(path2);
        }
    }

    default void quadraticTo(float p0, float p1, float p2, float p3) {
        quadraticBezierTo(p0, p1, p2, p3);
    }

    default void relativeQuadraticTo(float p0, float p1, float p2, float p3) {
        relativeQuadraticBezierTo(p0, p1, p2, p3);
    }

    default void arcToRad(Rect p0, float p1, float p2, boolean p3) {
        arcTo(p0, DegreesKt.degrees(p1), DegreesKt.degrees(p2), p3);
    }

    static /* synthetic */ void addRect$default(Path path, Rect rect, Direction direction, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addRect");
        }
        if ((i & 2) != 0) {
            direction = Direction.CounterClockwise;
        }
        path.addRect(rect, direction);
    }

    static /* synthetic */ void addOval$default(Path path, Rect rect, Direction direction, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addOval");
        }
        if ((i & 2) != 0) {
            direction = Direction.CounterClockwise;
        }
        path.addOval(rect, direction);
    }

    static /* synthetic */ void addRoundRect$default(Path path, RoundRect roundRect, Direction direction, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addRoundRect");
        }
        if ((i & 2) != 0) {
            direction = Direction.CounterClockwise;
        }
        path.addRoundRect(roundRect, direction);
    }

    /* JADX INFO: renamed from: addPath-Uv8p0NA$default, reason: not valid java name */
    static /* synthetic */ void m4501addPathUv8p0NA$default(Path path, Path path2, long j, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addPath-Uv8p0NA");
        }
        if ((i & 2) != 0) {
            j = Offset.INSTANCE.m3990getZeroF1C5BW0();
        }
        path.mo4106addPathUv8p0NA(path2, j);
    }

    default void rewind() {
        reset();
    }

    default PathIterator iterator() {
        return AndroidPathIterator_androidKt.PathIterator$default(this, null, 0.0f, 6, null);
    }

    static /* synthetic */ PathIterator iterator$default(Path path, PathIterator.ConicEvaluation conicEvaluation, float f, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: iterator");
        }
        if ((i & 2) != 0) {
            f = 0.25f;
        }
        return path.iterator(conicEvaluation, f);
    }

    default PathIterator iterator(PathIterator.ConicEvaluation p0, float p1) {
        return AndroidPathIterator_androidKt.PathIterator(this, p0, p1);
    }

    default Path plus(Path p0) {
        Path Path = AndroidPath_androidKt.Path();
        Path.mo4108opN5in7k0(this, p0, PathOperation.INSTANCE.m4526getUnionb3I0S0c());
        return Path;
    }

    default Path minus(Path p0) {
        Path Path = AndroidPath_androidKt.Path();
        Path.mo4108opN5in7k0(this, p0, PathOperation.INSTANCE.m4523getDifferenceb3I0S0c());
        return Path;
    }

    default Path or(Path p0) {
        return plus(p0);
    }

    default Path and(Path p0) {
        Path Path = AndroidPath_androidKt.Path();
        Path.mo4108opN5in7k0(this, p0, PathOperation.INSTANCE.m4524getIntersectb3I0S0c());
        return Path;
    }

    default Path xor(Path p0) {
        Path Path = AndroidPath_androidKt.Path();
        Path.mo4108opN5in7k0(this, p0, PathOperation.INSTANCE.m4527getXorb3I0S0c());
        return Path;
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroidx/compose/ui/graphics/Path$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/PathOperation;", "p0", "Landroidx/compose/ui/graphics/Path;", "p1", "p2", "combine-xh6zSI8", "(ILandroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Path;)Landroidx/compose/ui/graphics/Path;", "combine"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: renamed from: combine-xh6zSI8, reason: not valid java name */
        public final Path m4502combinexh6zSI8(int p0, Path p1, Path p2) {
            Path Path = AndroidPath_androidKt.Path();
            if (Path.mo4108opN5in7k0(p1, p2, p0)) {
                return Path;
            }
            throw new IllegalArgumentException("Path.combine() failed.  This may be due an invalid path; in particular, check for NaN values.");
        }
    }
}
