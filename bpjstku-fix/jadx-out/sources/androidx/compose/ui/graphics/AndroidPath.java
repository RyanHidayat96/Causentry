package androidx.compose.ui.graphics;

import android.graphics.RectF;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u001f\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\nJ/\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0011J/\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0011J/\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0011J?\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J?\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J/\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020 H\u0016¢\u0006\u0004\b\u001e\u0010!J\u0017\u0010\"\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\"\u0010\u001fJ\u001f\u0010\"\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010!J\u0017\u0010$\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u001f\u0010$\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020#2\u0006\u0010\u0007\u001a\u00020 H\u0016¢\u0006\u0004\b$\u0010&J'\u0010'\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b'\u0010(J'\u0010)\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b)\u0010(J\u001f\u0010-\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020*H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020\bH\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\bH\u0016¢\u0006\u0004\b0\u0010/J\u000f\u00101\u001a\u00020\bH\u0016¢\u0006\u0004\b1\u0010/J\u0017\u00104\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020*H\u0016¢\u0006\u0004\b2\u00103J\u0017\u00108\u001a\u00020\b2\u0006\u0010\u0003\u001a\u000205H\u0016¢\u0006\u0004\b6\u00107J\u000f\u00109\u001a\u00020\u001aH\u0017¢\u0006\u0004\b9\u0010:J'\u0010>\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020;H\u0016¢\u0006\u0004\b<\u0010=J\u0017\u0010?\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u001aH\u0002¢\u0006\u0004\b?\u0010\u001fR\u001a\u0010@\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0018\u0010E\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010H\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010K\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bK\u0010LR$\u0010R\u001a\u00020M2\u0006\u0010\u0003\u001a\u00020M8W@WX\u0096\u000e¢\u0006\f\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u001a\u0010S\u001a\u00020\u001b8WX\u0096\u0004¢\u0006\f\u0012\u0004\bU\u0010/\u001a\u0004\bS\u0010TR\u0014\u0010V\u001a\u00020\u001b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bV\u0010T"}, d2 = {"Landroidx/compose/ui/graphics/AndroidPath;", "Landroidx/compose/ui/graphics/Path;", "Landroid/graphics/Path;", "p0", "<init>", "(Landroid/graphics/Path;)V", "", "p1", "", "moveTo", "(FF)V", "relativeMoveTo", "lineTo", "relativeLineTo", "p2", "p3", "quadraticBezierTo", "(FFFF)V", "quadraticTo", "relativeQuadraticBezierTo", "relativeQuadraticTo", "p4", "p5", "cubicTo", "(FFFFFF)V", "relativeCubicTo", "Landroidx/compose/ui/geometry/Rect;", "", "arcTo", "(Landroidx/compose/ui/geometry/Rect;FFZ)V", "addRect", "(Landroidx/compose/ui/geometry/Rect;)V", "Landroidx/compose/ui/graphics/Path$Direction;", "(Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/graphics/Path$Direction;)V", "addOval", "Landroidx/compose/ui/geometry/RoundRect;", "addRoundRect", "(Landroidx/compose/ui/geometry/RoundRect;)V", "(Landroidx/compose/ui/geometry/RoundRect;Landroidx/compose/ui/graphics/Path$Direction;)V", "addArcRad", "(Landroidx/compose/ui/geometry/Rect;FF)V", "addArc", "Landroidx/compose/ui/geometry/Offset;", "addPath-Uv8p0NA", "(Landroidx/compose/ui/graphics/Path;J)V", "addPath", "close", "()V", "reset", "rewind", "translate-k-4lQ0M", "(J)V", "translate", "Landroidx/compose/ui/graphics/Matrix;", "transform-58bKbWc", "([F)V", "transform", "getBounds", "()Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/graphics/PathOperation;", "op-N5in7k0", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Path;I)Z", "op", "validateRectangle", "internalPath", "Landroid/graphics/Path;", "getInternalPath", "()Landroid/graphics/Path;", "Landroid/graphics/RectF;", "rectF", "Landroid/graphics/RectF;", "", "radii", "[F", "Landroid/graphics/Matrix;", "mMatrix", "Landroid/graphics/Matrix;", "Landroidx/compose/ui/graphics/PathFillType;", "getFillType-Rg-k1Os", "()I", "setFillType-oQ8Xj4U", "(I)V", "fillType", "isConvex", "()Z", "isConvex$annotations", "isEmpty"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AndroidPath implements Path {
    private final android.graphics.Path internalPath;
    private android.graphics.Matrix mMatrix;
    private float[] radii;
    private RectF rectF;

    public static /* synthetic */ void isConvex$annotations() {
    }

    public AndroidPath(android.graphics.Path path) {
        this.internalPath = path;
    }

    public /* synthetic */ AndroidPath(android.graphics.Path path, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new android.graphics.Path() : path);
    }

    public final android.graphics.Path getInternalPath() {
        return this.internalPath;
    }

    @Override // androidx.compose.ui.graphics.Path
    /* JADX INFO: renamed from: getFillType-Rg-k1Os, reason: not valid java name */
    public final int mo4107getFillTypeRgk1Os() {
        if (this.internalPath.getFillType() == android.graphics.Path.FillType.EVEN_ODD) {
            return PathFillType.INSTANCE.m4513getEvenOddRgk1Os();
        }
        return PathFillType.INSTANCE.m4514getNonZeroRgk1Os();
    }

    @Override // androidx.compose.ui.graphics.Path
    /* JADX INFO: renamed from: setFillType-oQ8Xj4U, reason: not valid java name */
    public final void mo4109setFillTypeoQ8Xj4U(int i) {
        android.graphics.Path.FillType fillType;
        android.graphics.Path path = this.internalPath;
        if (PathFillType.m4509equalsimpl0(i, PathFillType.INSTANCE.m4513getEvenOddRgk1Os())) {
            fillType = android.graphics.Path.FillType.EVEN_ODD;
        } else {
            fillType = android.graphics.Path.FillType.WINDING;
        }
        path.setFillType(fillType);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void moveTo(float p0, float p1) {
        this.internalPath.moveTo(p0, p1);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void relativeMoveTo(float p0, float p1) {
        this.internalPath.rMoveTo(p0, p1);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void lineTo(float p0, float p1) {
        this.internalPath.lineTo(p0, p1);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void relativeLineTo(float p0, float p1) {
        this.internalPath.rLineTo(p0, p1);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void quadraticBezierTo(float p0, float p1, float p2, float p3) {
        this.internalPath.quadTo(p0, p1, p2, p3);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void quadraticTo(float p0, float p1, float p2, float p3) {
        this.internalPath.quadTo(p0, p1, p2, p3);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void relativeQuadraticBezierTo(float p0, float p1, float p2, float p3) {
        this.internalPath.rQuadTo(p0, p1, p2, p3);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void relativeQuadraticTo(float p0, float p1, float p2, float p3) {
        this.internalPath.rQuadTo(p0, p1, p2, p3);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void cubicTo(float p0, float p1, float p2, float p3, float p4, float p5) {
        this.internalPath.cubicTo(p0, p1, p2, p3, p4, p5);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void relativeCubicTo(float p0, float p1, float p2, float p3, float p4, float p5) {
        this.internalPath.rCubicTo(p0, p1, p2, p3, p4, p5);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void arcTo(Rect p0, float p1, float p2, boolean p3) {
        float left = p0.getLeft();
        float top = p0.getTop();
        float right = p0.getRight();
        float bottom = p0.getBottom();
        if (this.rectF == null) {
            this.rectF = new RectF();
        }
        RectF rectF = this.rectF;
        Intrinsics.checkNotNull(rectF);
        rectF.set(left, top, right, bottom);
        android.graphics.Path path = this.internalPath;
        RectF rectF2 = this.rectF;
        Intrinsics.checkNotNull(rectF2);
        path.arcTo(rectF2, p1, p2, p3);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void addRect(Rect p0) {
        addRect(p0, Path.Direction.CounterClockwise);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void addRect(Rect p0, Path.Direction p1) {
        validateRectangle(p0);
        if (this.rectF == null) {
            this.rectF = new RectF();
        }
        RectF rectF = this.rectF;
        Intrinsics.checkNotNull(rectF);
        rectF.set(p0.getLeft(), p0.getTop(), p0.getRight(), p0.getBottom());
        android.graphics.Path path = this.internalPath;
        RectF rectF2 = this.rectF;
        Intrinsics.checkNotNull(rectF2);
        path.addRect(rectF2, AndroidPath_androidKt.toPlatformPathDirection(p1));
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void addOval(Rect p0) {
        addOval(p0, Path.Direction.CounterClockwise);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void addOval(Rect p0, Path.Direction p1) {
        if (this.rectF == null) {
            this.rectF = new RectF();
        }
        RectF rectF = this.rectF;
        Intrinsics.checkNotNull(rectF);
        rectF.set(p0.getLeft(), p0.getTop(), p0.getRight(), p0.getBottom());
        android.graphics.Path path = this.internalPath;
        RectF rectF2 = this.rectF;
        Intrinsics.checkNotNull(rectF2);
        path.addOval(rectF2, AndroidPath_androidKt.toPlatformPathDirection(p1));
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void addRoundRect(RoundRect p0) {
        addRoundRect(p0, Path.Direction.CounterClockwise);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void addRoundRect(RoundRect p0, Path.Direction p1) {
        if (this.rectF == null) {
            this.rectF = new RectF();
        }
        RectF rectF = this.rectF;
        Intrinsics.checkNotNull(rectF);
        rectF.set(p0.getLeft(), p0.getTop(), p0.getRight(), p0.getBottom());
        if (this.radii == null) {
            this.radii = new float[8];
        }
        float[] fArr = this.radii;
        Intrinsics.checkNotNull(fArr);
        fArr[0] = Float.intBitsToFloat((int) (p0.m4024getTopLeftCornerRadiuskKHJgLs() >> 32));
        fArr[1] = Float.intBitsToFloat((int) (p0.m4024getTopLeftCornerRadiuskKHJgLs() & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (p0.m4025getTopRightCornerRadiuskKHJgLs() >> 32));
        fArr[3] = Float.intBitsToFloat((int) (p0.m4025getTopRightCornerRadiuskKHJgLs() & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (p0.m4023getBottomRightCornerRadiuskKHJgLs() >> 32));
        fArr[5] = Float.intBitsToFloat((int) (p0.m4023getBottomRightCornerRadiuskKHJgLs() & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (p0.m4022getBottomLeftCornerRadiuskKHJgLs() >> 32));
        fArr[7] = Float.intBitsToFloat((int) (p0.m4022getBottomLeftCornerRadiuskKHJgLs() & 4294967295L));
        android.graphics.Path path = this.internalPath;
        RectF rectF2 = this.rectF;
        Intrinsics.checkNotNull(rectF2);
        float[] fArr2 = this.radii;
        Intrinsics.checkNotNull(fArr2);
        path.addRoundRect(rectF2, fArr2, AndroidPath_androidKt.toPlatformPathDirection(p1));
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void addArcRad(Rect p0, float p1, float p2) {
        addArc(p0, DegreesKt.degrees(p1), DegreesKt.degrees(p2));
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void addArc(Rect p0, float p1, float p2) {
        validateRectangle(p0);
        if (this.rectF == null) {
            this.rectF = new RectF();
        }
        RectF rectF = this.rectF;
        Intrinsics.checkNotNull(rectF);
        rectF.set(p0.getLeft(), p0.getTop(), p0.getRight(), p0.getBottom());
        android.graphics.Path path = this.internalPath;
        RectF rectF2 = this.rectF;
        Intrinsics.checkNotNull(rectF2);
        path.addArc(rectF2, p1, p2);
    }

    @Override // androidx.compose.ui.graphics.Path
    /* JADX INFO: renamed from: addPath-Uv8p0NA, reason: not valid java name */
    public final void mo4106addPathUv8p0NA(Path p0, long p1) {
        android.graphics.Path path = this.internalPath;
        if (p0 instanceof AndroidPath) {
            path.addPath(((AndroidPath) p0).getInternalPath(), Float.intBitsToFloat((int) (p1 >> 32)), Float.intBitsToFloat((int) (p1 & 4294967295L)));
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void close() {
        this.internalPath.close();
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void reset() {
        this.internalPath.reset();
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void rewind() {
        this.internalPath.rewind();
    }

    @Override // androidx.compose.ui.graphics.Path
    /* JADX INFO: renamed from: translate-k-4lQ0M, reason: not valid java name */
    public final void mo4111translatek4lQ0M(long p0) {
        android.graphics.Matrix matrix = this.mMatrix;
        if (matrix == null) {
            this.mMatrix = new android.graphics.Matrix();
        } else {
            Intrinsics.checkNotNull(matrix);
            matrix.reset();
        }
        android.graphics.Matrix matrix2 = this.mMatrix;
        Intrinsics.checkNotNull(matrix2);
        matrix2.setTranslate(Float.intBitsToFloat((int) (p0 >> 32)), Float.intBitsToFloat((int) (p0 & 4294967295L)));
        android.graphics.Path path = this.internalPath;
        android.graphics.Matrix matrix3 = this.mMatrix;
        Intrinsics.checkNotNull(matrix3);
        path.transform(matrix3);
    }

    @Override // androidx.compose.ui.graphics.Path
    /* JADX INFO: renamed from: transform-58bKbWc, reason: not valid java name */
    public final void mo4110transform58bKbWc(float[] p0) {
        if (this.mMatrix == null) {
            this.mMatrix = new android.graphics.Matrix();
        }
        android.graphics.Matrix matrix = this.mMatrix;
        Intrinsics.checkNotNull(matrix);
        AndroidMatrixConversions_androidKt.m4086setFromEL8BTi8(matrix, p0);
        android.graphics.Path path = this.internalPath;
        android.graphics.Matrix matrix2 = this.mMatrix;
        Intrinsics.checkNotNull(matrix2);
        path.transform(matrix2);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final Rect getBounds() {
        if (this.rectF == null) {
            this.rectF = new RectF();
        }
        RectF rectF = this.rectF;
        Intrinsics.checkNotNull(rectF);
        this.internalPath.computeBounds(rectF, true);
        return new Rect(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // androidx.compose.ui.graphics.Path
    /* JADX INFO: renamed from: op-N5in7k0, reason: not valid java name */
    public final boolean mo4108opN5in7k0(Path p0, Path p1, int p2) {
        android.graphics.Path.Op op;
        if (PathOperation.m4519equalsimpl0(p2, PathOperation.INSTANCE.m4523getDifferenceb3I0S0c())) {
            op = android.graphics.Path.Op.DIFFERENCE;
        } else if (PathOperation.m4519equalsimpl0(p2, PathOperation.INSTANCE.m4524getIntersectb3I0S0c())) {
            op = android.graphics.Path.Op.INTERSECT;
        } else if (PathOperation.m4519equalsimpl0(p2, PathOperation.INSTANCE.m4525getReverseDifferenceb3I0S0c())) {
            op = android.graphics.Path.Op.REVERSE_DIFFERENCE;
        } else {
            op = PathOperation.m4519equalsimpl0(p2, PathOperation.INSTANCE.m4526getUnionb3I0S0c()) ? android.graphics.Path.Op.UNION : android.graphics.Path.Op.XOR;
        }
        android.graphics.Path path = this.internalPath;
        if (!(p0 instanceof AndroidPath)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        android.graphics.Path internalPath = ((AndroidPath) p0).getInternalPath();
        if (p1 instanceof AndroidPath) {
            return path.op(internalPath, ((AndroidPath) p1).getInternalPath(), op);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // androidx.compose.ui.graphics.Path
    public final boolean isConvex() {
        return this.internalPath.isConvex();
    }

    @Override // androidx.compose.ui.graphics.Path
    public final boolean isEmpty() {
        return this.internalPath.isEmpty();
    }

    private final void validateRectangle(Rect p0) {
        if (Float.isNaN(p0.getLeft()) || Float.isNaN(p0.getTop()) || Float.isNaN(p0.getRight()) || Float.isNaN(p0.getBottom())) {
            AndroidPath_androidKt.throwIllegalStateException("Invalid rectangle, make sure no value is NaN");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AndroidPath() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
