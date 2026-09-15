package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u001f\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\fH&¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\f2\b\b\u0002\u0010\t\u001a\u00020\fH&¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\fH&¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\fH&¢\u0006\u0004\b\u0012\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u000eJ\u0017\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0014H&¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ9\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\f2\b\b\u0002\u0010\u001e\u001a\u00020\u0018H&¢\u0006\u0004\b\u001f\u0010 J!\u0010$\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020!2\b\b\u0002\u0010\t\u001a\u00020\u0018H&¢\u0006\u0004\b\"\u0010#J'\u0010(\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020%2\u0006\u0010\t\u001a\u00020%2\u0006\u0010\u001c\u001a\u00020\bH&¢\u0006\u0004\b&\u0010'J\u001f\u0010)\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b)\u0010\u000bJ7\u0010)\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\bH&¢\u0006\u0004\b)\u0010*JG\u0010-\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\f2\u0006\u0010+\u001a\u00020\f2\u0006\u0010,\u001a\u00020\bH&¢\u0006\u0004\b-\u0010.J\u001f\u0010/\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b/\u0010\u000bJ7\u0010/\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\bH&¢\u0006\u0004\b/\u0010*J'\u00102\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020%2\u0006\u0010\t\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\bH&¢\u0006\u0004\b0\u00101J7\u00104\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u0002032\u0006\u0010\u001e\u001a\u00020\bH\u0016¢\u0006\u0004\b4\u00105JO\u00104\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\f2\u0006\u0010+\u001a\u00020\f2\u0006\u0010,\u001a\u0002032\u0006\u00106\u001a\u00020\bH&¢\u0006\u0004\b4\u00107J7\u00108\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u0002032\u0006\u0010\u001e\u001a\u00020\bH\u0016¢\u0006\u0004\b8\u00105J\u001f\u00109\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020!2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b9\u0010:J'\u0010>\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020;2\u0006\u0010\t\u001a\u00020%2\u0006\u0010\u001c\u001a\u00020\bH&¢\u0006\u0004\b<\u0010=JG\u0010C\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020;2\b\b\u0002\u0010\t\u001a\u00020?2\b\b\u0002\u0010\u001c\u001a\u00020@2\b\b\u0002\u0010\u001d\u001a\u00020?2\b\b\u0002\u0010\u001e\u001a\u00020@2\u0006\u0010+\u001a\u00020\bH&¢\u0006\u0004\bA\u0010BJ-\u0010H\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020D2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020%0E2\u0006\u0010\u001c\u001a\u00020\bH&¢\u0006\u0004\bF\u0010GJ'\u0010L\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020D2\u0006\u0010\t\u001a\u00020I2\u0006\u0010\u001c\u001a\u00020\bH&¢\u0006\u0004\bJ\u0010KJ'\u0010Q\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020M2\u0006\u0010\t\u001a\u00020N2\u0006\u0010\u001c\u001a\u00020\bH&¢\u0006\u0004\bO\u0010PJ\u000f\u0010R\u001a\u00020\u0002H&¢\u0006\u0004\bR\u0010\u0004J\u000f\u0010S\u001a\u00020\u0002H&¢\u0006\u0004\bS\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/Canvas;", "", "", "save", "()V", "restore", "Landroidx/compose/ui/geometry/Rect;", "p0", "Landroidx/compose/ui/graphics/Paint;", "p1", "saveLayer", "(Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/graphics/Paint;)V", "", "translate", "(FF)V", "scale", "rotate", "(F)V", "skew", "skewRad", "Landroidx/compose/ui/graphics/Matrix;", "concat-58bKbWc", "([F)V", "concat", "Landroidx/compose/ui/graphics/ClipOp;", "clipRect-mtrdD-E", "(Landroidx/compose/ui/geometry/Rect;I)V", "clipRect", "p2", "p3", "p4", "clipRect-N_I0leg", "(FFFFI)V", "Landroidx/compose/ui/graphics/Path;", "clipPath-mtrdD-E", "(Landroidx/compose/ui/graphics/Path;I)V", "clipPath", "Landroidx/compose/ui/geometry/Offset;", "drawLine-Wko1d7g", "(JJLandroidx/compose/ui/graphics/Paint;)V", "drawLine", "drawRect", "(FFFFLandroidx/compose/ui/graphics/Paint;)V", "p5", "p6", "drawRoundRect", "(FFFFFFLandroidx/compose/ui/graphics/Paint;)V", "drawOval", "drawCircle-9KIMszo", "(JFLandroidx/compose/ui/graphics/Paint;)V", "drawCircle", "", "drawArc", "(Landroidx/compose/ui/geometry/Rect;FFZLandroidx/compose/ui/graphics/Paint;)V", "p7", "(FFFFFFZLandroidx/compose/ui/graphics/Paint;)V", "drawArcRad", "drawPath", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Paint;)V", "Landroidx/compose/ui/graphics/ImageBitmap;", "drawImage-d-4ec7I", "(Landroidx/compose/ui/graphics/ImageBitmap;JLandroidx/compose/ui/graphics/Paint;)V", "drawImage", "Landroidx/compose/ui/unit/IntOffset;", "Landroidx/compose/ui/unit/IntSize;", "drawImageRect-HPBpro0", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJLandroidx/compose/ui/graphics/Paint;)V", "drawImageRect", "Landroidx/compose/ui/graphics/PointMode;", "", "drawPoints-O7TthRY", "(ILjava/util/List;Landroidx/compose/ui/graphics/Paint;)V", "drawPoints", "", "drawRawPoints-O7TthRY", "(I[FLandroidx/compose/ui/graphics/Paint;)V", "drawRawPoints", "Landroidx/compose/ui/graphics/Vertices;", "Landroidx/compose/ui/graphics/BlendMode;", "drawVertices-TPEHhCM", "(Landroidx/compose/ui/graphics/Vertices;ILandroidx/compose/ui/graphics/Paint;)V", "drawVertices", "enableZ", "disableZ"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface Canvas {
    /* JADX INFO: renamed from: clipPath-mtrdD-E */
    void mo4068clipPathmtrdDE(Path p0, int p1);

    /* JADX INFO: renamed from: clipRect-N_I0leg */
    void mo4069clipRectN_I0leg(float p0, float p1, float p2, float p3, int p4);

    /* JADX INFO: renamed from: concat-58bKbWc */
    void mo4070concat58bKbWc(float[] p0);

    void disableZ();

    void drawArc(float p0, float p1, float p2, float p3, float p4, float p5, boolean p6, Paint p7);

    /* JADX INFO: renamed from: drawCircle-9KIMszo */
    void mo4071drawCircle9KIMszo(long p0, float p1, Paint p2);

    /* JADX INFO: renamed from: drawImage-d-4ec7I */
    void mo4072drawImaged4ec7I(ImageBitmap p0, long p1, Paint p2);

    /* JADX INFO: renamed from: drawImageRect-HPBpro0 */
    void mo4073drawImageRectHPBpro0(ImageBitmap p0, long p1, long p2, long p3, long p4, Paint p5);

    /* JADX INFO: renamed from: drawLine-Wko1d7g */
    void mo4074drawLineWko1d7g(long p0, long p1, Paint p2);

    void drawOval(float p0, float p1, float p2, float p3, Paint p4);

    void drawPath(Path p0, Paint p1);

    /* JADX INFO: renamed from: drawPoints-O7TthRY */
    void mo4075drawPointsO7TthRY(int p0, List<Offset> p1, Paint p2);

    /* JADX INFO: renamed from: drawRawPoints-O7TthRY */
    void mo4076drawRawPointsO7TthRY(int p0, float[] p1, Paint p2);

    void drawRect(float p0, float p1, float p2, float p3, Paint p4);

    void drawRoundRect(float p0, float p1, float p2, float p3, float p4, float p5, Paint p6);

    /* JADX INFO: renamed from: drawVertices-TPEHhCM */
    void mo4077drawVerticesTPEHhCM(Vertices p0, int p1, Paint p2);

    void enableZ();

    void restore();

    void rotate(float p0);

    void save();

    void saveLayer(Rect p0, Paint p1);

    void scale(float p0, float p1);

    void skew(float p0, float p1);

    void translate(float p0, float p1);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static void skewRad(Canvas canvas, float f, float f2) {
            Canvas.super.skewRad(f, f2);
        }

        @Deprecated
        /* JADX INFO: renamed from: clipRect-mtrdD-E, reason: not valid java name */
        public static void m4196clipRectmtrdDE(Canvas canvas, Rect rect, int i) {
            Canvas.super.m4193clipRectmtrdDE(rect, i);
        }

        @Deprecated
        public static void drawRect(Canvas canvas, Rect rect, Paint paint) {
            Canvas.super.drawRect(rect, paint);
        }

        @Deprecated
        public static void drawOval(Canvas canvas, Rect rect, Paint paint) {
            Canvas.super.drawOval(rect, paint);
        }

        @Deprecated
        public static void drawArc(Canvas canvas, Rect rect, float f, float f2, boolean z, Paint paint) {
            Canvas.super.drawArc(rect, f, f2, z, paint);
        }

        @Deprecated
        public static void drawArcRad(Canvas canvas, Rect rect, float f, float f2, boolean z, Paint paint) {
            Canvas.super.drawArcRad(rect, f, f2, z, paint);
        }
    }

    static /* synthetic */ void scale$default(Canvas canvas, float f, float f2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scale");
        }
        if ((i & 2) != 0) {
            f2 = f;
        }
        canvas.scale(f, f2);
    }

    default void skewRad(float p0, float p1) {
        skew(DegreesKt.degrees(p0), DegreesKt.degrees(p1));
    }

    /* JADX INFO: renamed from: clipRect-mtrdD-E$default, reason: not valid java name */
    static /* synthetic */ void m4191clipRectmtrdDE$default(Canvas canvas, Rect rect, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-mtrdD-E");
        }
        if ((i2 & 2) != 0) {
            i = ClipOp.INSTANCE.m4207getIntersectrtfAjoo();
        }
        canvas.m4193clipRectmtrdDE(rect, i);
    }

    /* JADX INFO: renamed from: clipRect-mtrdD-E, reason: not valid java name */
    default void m4193clipRectmtrdDE(Rect p0, int p1) {
        mo4069clipRectN_I0leg(p0.getLeft(), p0.getTop(), p0.getRight(), p0.getBottom(), p1);
    }

    /* JADX INFO: renamed from: clipRect-N_I0leg$default, reason: not valid java name */
    static /* synthetic */ void m4190clipRectN_I0leg$default(Canvas canvas, float f, float f2, float f3, float f4, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-N_I0leg");
        }
        if ((i2 & 16) != 0) {
            i = ClipOp.INSTANCE.m4207getIntersectrtfAjoo();
        }
        canvas.mo4069clipRectN_I0leg(f, f2, f3, f4, i);
    }

    /* JADX INFO: renamed from: clipPath-mtrdD-E$default, reason: not valid java name */
    static /* synthetic */ void m4189clipPathmtrdDE$default(Canvas canvas, Path path, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
        }
        if ((i2 & 2) != 0) {
            i = ClipOp.INSTANCE.m4207getIntersectrtfAjoo();
        }
        canvas.mo4068clipPathmtrdDE(path, i);
    }

    default void drawRect(Rect p0, Paint p1) {
        drawRect(p0.getLeft(), p0.getTop(), p0.getRight(), p0.getBottom(), p1);
    }

    default void drawOval(Rect p0, Paint p1) {
        drawOval(p0.getLeft(), p0.getTop(), p0.getRight(), p0.getBottom(), p1);
    }

    default void drawArc(Rect p0, float p1, float p2, boolean p3, Paint p4) {
        drawArc(p0.getLeft(), p0.getTop(), p0.getRight(), p0.getBottom(), p1, p2, p3, p4);
    }

    default void drawArcRad(Rect p0, float p1, float p2, boolean p3, Paint p4) {
        drawArc(p0, DegreesKt.degrees(p1), DegreesKt.degrees(p2), p3, p4);
    }

    /* JADX INFO: renamed from: drawImageRect-HPBpro0$default, reason: not valid java name */
    static /* synthetic */ void m4192drawImageRectHPBpro0$default(Canvas canvas, ImageBitmap imageBitmap, long j, long j2, long j3, long j4, Paint paint, int i, Object obj) {
        long jM7101constructorimpl;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImageRect-HPBpro0");
        }
        long jM7074getZeronOccac = (i & 2) != 0 ? IntOffset.INSTANCE.m7074getZeronOccac() : j;
        if ((i & 4) != 0) {
            jM7101constructorimpl = IntSize.m7101constructorimpl((((long) imageBitmap.getHeight()) & 4294967295L) | (((long) imageBitmap.getWidth()) << 32));
        } else {
            jM7101constructorimpl = j2;
        }
        canvas.mo4073drawImageRectHPBpro0(imageBitmap, jM7074getZeronOccac, jM7101constructorimpl, (i & 8) != 0 ? IntOffset.INSTANCE.m7074getZeronOccac() : j3, (i & 16) != 0 ? jM7101constructorimpl : j4, paint);
    }
}
