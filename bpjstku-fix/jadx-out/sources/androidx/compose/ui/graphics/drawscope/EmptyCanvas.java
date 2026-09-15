package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Vertices;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0003J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u000fJ\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J7\u0010\u001e\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\"\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u001f2\u0006\u0010\n\u001a\u00020\u001aH\u0016¢\u0006\u0004\b \u0010!J'\u0010&\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020#2\u0006\u0010\n\u001a\u00020#2\u0006\u0010\u0018\u001a\u00020\tH\u0016¢\u0006\u0004\b$\u0010%J7\u0010'\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\tH\u0016¢\u0006\u0004\b'\u0010(JG\u0010+\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\r2\u0006\u0010)\u001a\u00020\r2\u0006\u0010*\u001a\u00020\tH\u0016¢\u0006\u0004\b+\u0010,J7\u0010-\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\tH\u0016¢\u0006\u0004\b-\u0010(J'\u00100\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020#2\u0006\u0010\n\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\tH\u0016¢\u0006\u0004\b.\u0010/JO\u00103\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\r2\u0006\u0010)\u001a\u00020\r2\u0006\u0010*\u001a\u0002012\u0006\u00102\u001a\u00020\tH\u0016¢\u0006\u0004\b3\u00104J\u001f\u00105\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u001f2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b5\u00106J'\u0010:\u001a\u00020\u00042\u0006\u0010\b\u001a\u0002072\u0006\u0010\n\u001a\u00020#2\u0006\u0010\u0018\u001a\u00020\tH\u0016¢\u0006\u0004\b8\u00109J?\u0010?\u001a\u00020\u00042\u0006\u0010\b\u001a\u0002072\u0006\u0010\n\u001a\u00020;2\u0006\u0010\u0018\u001a\u00020<2\u0006\u0010\u0019\u001a\u00020;2\u0006\u0010\u001b\u001a\u00020<2\u0006\u0010)\u001a\u00020\tH\u0016¢\u0006\u0004\b=\u0010>J-\u0010D\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020@2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020#0A2\u0006\u0010\u0018\u001a\u00020\tH\u0016¢\u0006\u0004\bB\u0010CJ'\u0010H\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020@2\u0006\u0010\n\u001a\u00020E2\u0006\u0010\u0018\u001a\u00020\tH\u0016¢\u0006\u0004\bF\u0010GJ'\u0010M\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020I2\u0006\u0010\n\u001a\u00020J2\u0006\u0010\u0018\u001a\u00020\tH\u0016¢\u0006\u0004\bK\u0010LJ\u000f\u0010N\u001a\u00020\u0004H\u0016¢\u0006\u0004\bN\u0010\u0003J\u000f\u0010O\u001a\u00020\u0004H\u0016¢\u0006\u0004\bO\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/EmptyCanvas;", "Landroidx/compose/ui/graphics/Canvas;", "<init>", "()V", "", "save", "restore", "Landroidx/compose/ui/geometry/Rect;", "p0", "Landroidx/compose/ui/graphics/Paint;", "p1", "saveLayer", "(Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/graphics/Paint;)V", "", "translate", "(FF)V", "scale", "rotate", "(F)V", "skew", "Landroidx/compose/ui/graphics/Matrix;", "concat-58bKbWc", "([F)V", "concat", "p2", "p3", "Landroidx/compose/ui/graphics/ClipOp;", "p4", "clipRect-N_I0leg", "(FFFFI)V", "clipRect", "Landroidx/compose/ui/graphics/Path;", "clipPath-mtrdD-E", "(Landroidx/compose/ui/graphics/Path;I)V", "clipPath", "Landroidx/compose/ui/geometry/Offset;", "drawLine-Wko1d7g", "(JJLandroidx/compose/ui/graphics/Paint;)V", "drawLine", "drawRect", "(FFFFLandroidx/compose/ui/graphics/Paint;)V", "p5", "p6", "drawRoundRect", "(FFFFFFLandroidx/compose/ui/graphics/Paint;)V", "drawOval", "drawCircle-9KIMszo", "(JFLandroidx/compose/ui/graphics/Paint;)V", "drawCircle", "", "p7", "drawArc", "(FFFFFFZLandroidx/compose/ui/graphics/Paint;)V", "drawPath", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Paint;)V", "Landroidx/compose/ui/graphics/ImageBitmap;", "drawImage-d-4ec7I", "(Landroidx/compose/ui/graphics/ImageBitmap;JLandroidx/compose/ui/graphics/Paint;)V", "drawImage", "Landroidx/compose/ui/unit/IntOffset;", "Landroidx/compose/ui/unit/IntSize;", "drawImageRect-HPBpro0", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJLandroidx/compose/ui/graphics/Paint;)V", "drawImageRect", "Landroidx/compose/ui/graphics/PointMode;", "", "drawPoints-O7TthRY", "(ILjava/util/List;Landroidx/compose/ui/graphics/Paint;)V", "drawPoints", "", "drawRawPoints-O7TthRY", "(I[FLandroidx/compose/ui/graphics/Paint;)V", "drawRawPoints", "Landroidx/compose/ui/graphics/Vertices;", "Landroidx/compose/ui/graphics/BlendMode;", "drawVertices-TPEHhCM", "(Landroidx/compose/ui/graphics/Vertices;ILandroidx/compose/ui/graphics/Paint;)V", "drawVertices", "enableZ", "disableZ"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EmptyCanvas implements Canvas {
    public static final EmptyCanvas INSTANCE = new EmptyCanvas();

    private EmptyCanvas() {
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void save() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void restore() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void saveLayer(Rect p0, Paint p1) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void translate(float p0, float p1) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void scale(float p0, float p1) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void rotate(float p0) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void skew(float p0, float p1) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: concat-58bKbWc */
    public final void mo4070concat58bKbWc(float[] p0) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: clipRect-N_I0leg */
    public final void mo4069clipRectN_I0leg(float p0, float p1, float p2, float p3, int p4) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: clipPath-mtrdD-E */
    public final void mo4068clipPathmtrdDE(Path p0, int p1) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: drawLine-Wko1d7g */
    public final void mo4074drawLineWko1d7g(long p0, long p1, Paint p2) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void drawRect(float p0, float p1, float p2, float p3, Paint p4) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void drawRoundRect(float p0, float p1, float p2, float p3, float p4, float p5, Paint p6) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void drawOval(float p0, float p1, float p2, float p3, Paint p4) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: drawCircle-9KIMszo */
    public final void mo4071drawCircle9KIMszo(long p0, float p1, Paint p2) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void drawArc(float p0, float p1, float p2, float p3, float p4, float p5, boolean p6, Paint p7) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void drawPath(Path p0, Paint p1) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: drawImage-d-4ec7I */
    public final void mo4072drawImaged4ec7I(ImageBitmap p0, long p1, Paint p2) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: drawImageRect-HPBpro0 */
    public final void mo4073drawImageRectHPBpro0(ImageBitmap p0, long p1, long p2, long p3, long p4, Paint p5) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: drawPoints-O7TthRY */
    public final void mo4075drawPointsO7TthRY(int p0, List<Offset> p1, Paint p2) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: drawRawPoints-O7TthRY */
    public final void mo4076drawRawPointsO7TthRY(int p0, float[] p1, Paint p2) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: drawVertices-TPEHhCM */
    public final void mo4077drawVerticesTPEHhCM(Vertices p0, int p1, Paint p2) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void enableZ() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void disableZ() {
        throw new UnsupportedOperationException();
    }
}
