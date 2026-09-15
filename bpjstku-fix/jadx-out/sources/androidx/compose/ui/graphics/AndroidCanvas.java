package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.Region;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.IntOffset;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0003J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u000fJ\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J7\u0010\u001e\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\"\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u001f2\u0006\u0010\n\u001a\u00020\u001aH\u0016¢\u0006\u0004\b \u0010!J\u0013\u0010&\u001a\u00020#*\u00020\u001aH\u0007¢\u0006\u0004\b$\u0010%J'\u0010*\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020'2\u0006\u0010\n\u001a\u00020'2\u0006\u0010\u0018\u001a\u00020\tH\u0016¢\u0006\u0004\b(\u0010)J7\u0010+\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\tH\u0016¢\u0006\u0004\b+\u0010,JG\u0010/\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\r2\u0006\u0010-\u001a\u00020\r2\u0006\u0010.\u001a\u00020\tH\u0016¢\u0006\u0004\b/\u00100J7\u00101\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\tH\u0016¢\u0006\u0004\b1\u0010,J'\u00104\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020'2\u0006\u0010\n\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\tH\u0016¢\u0006\u0004\b2\u00103JO\u00107\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\r2\u0006\u0010-\u001a\u00020\r2\u0006\u0010.\u001a\u0002052\u0006\u00106\u001a\u00020\tH\u0016¢\u0006\u0004\b7\u00108J\u001f\u00109\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u001f2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b9\u0010:J'\u0010>\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020;2\u0006\u0010\n\u001a\u00020'2\u0006\u0010\u0018\u001a\u00020\tH\u0016¢\u0006\u0004\b<\u0010=J?\u0010C\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020;2\u0006\u0010\n\u001a\u00020?2\u0006\u0010\u0018\u001a\u00020@2\u0006\u0010\u0019\u001a\u00020?2\u0006\u0010\u001b\u001a\u00020@2\u0006\u0010-\u001a\u00020\tH\u0016¢\u0006\u0004\bA\u0010BJ-\u0010H\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020D2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020'0E2\u0006\u0010\u0018\u001a\u00020\tH\u0016¢\u0006\u0004\bF\u0010GJ\u000f\u0010I\u001a\u00020\u0004H\u0016¢\u0006\u0004\bI\u0010\u0003J\u000f\u0010J\u001a\u00020\u0004H\u0016¢\u0006\u0004\bJ\u0010\u0003J%\u0010H\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020'0E2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\bH\u0010KJ-\u0010M\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020'0E2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020LH\u0002¢\u0006\u0004\bM\u0010NJ'\u0010R\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020D2\u0006\u0010\n\u001a\u00020O2\u0006\u0010\u0018\u001a\u00020\tH\u0016¢\u0006\u0004\bP\u0010QJ'\u0010R\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020O2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020LH\u0002¢\u0006\u0004\bR\u0010SJ'\u0010T\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020O2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020LH\u0002¢\u0006\u0004\bT\u0010SJ'\u0010Y\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020U2\u0006\u0010\n\u001a\u00020V2\u0006\u0010\u0018\u001a\u00020\tH\u0016¢\u0006\u0004\bW\u0010XR,\u0010\\\u001a\u00060Zj\u0002`[8\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0004\b\\\u0010]\u0012\u0004\bb\u0010\u0003\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\u0018\u0010d\u001a\u0004\u0018\u00010c8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bd\u0010eR\u0018\u0010f\u001a\u0004\u0018\u00010c8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bf\u0010e"}, d2 = {"Landroidx/compose/ui/graphics/AndroidCanvas;", "Landroidx/compose/ui/graphics/Canvas;", "<init>", "()V", "", "save", "restore", "Landroidx/compose/ui/geometry/Rect;", "p0", "Landroidx/compose/ui/graphics/Paint;", "p1", "saveLayer", "(Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/graphics/Paint;)V", "", "translate", "(FF)V", "scale", "rotate", "(F)V", "skew", "Landroidx/compose/ui/graphics/Matrix;", "concat-58bKbWc", "([F)V", "concat", "p2", "p3", "Landroidx/compose/ui/graphics/ClipOp;", "p4", "clipRect-N_I0leg", "(FFFFI)V", "clipRect", "Landroidx/compose/ui/graphics/Path;", "clipPath-mtrdD-E", "(Landroidx/compose/ui/graphics/Path;I)V", "clipPath", "Landroid/graphics/Region$Op;", "toRegionOp--7u2Bmg", "(I)Landroid/graphics/Region$Op;", "toRegionOp", "Landroidx/compose/ui/geometry/Offset;", "drawLine-Wko1d7g", "(JJLandroidx/compose/ui/graphics/Paint;)V", "drawLine", "drawRect", "(FFFFLandroidx/compose/ui/graphics/Paint;)V", "p5", "p6", "drawRoundRect", "(FFFFFFLandroidx/compose/ui/graphics/Paint;)V", "drawOval", "drawCircle-9KIMszo", "(JFLandroidx/compose/ui/graphics/Paint;)V", "drawCircle", "", "p7", "drawArc", "(FFFFFFZLandroidx/compose/ui/graphics/Paint;)V", "drawPath", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Paint;)V", "Landroidx/compose/ui/graphics/ImageBitmap;", "drawImage-d-4ec7I", "(Landroidx/compose/ui/graphics/ImageBitmap;JLandroidx/compose/ui/graphics/Paint;)V", "drawImage", "Landroidx/compose/ui/unit/IntOffset;", "Landroidx/compose/ui/unit/IntSize;", "drawImageRect-HPBpro0", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJLandroidx/compose/ui/graphics/Paint;)V", "drawImageRect", "Landroidx/compose/ui/graphics/PointMode;", "", "drawPoints-O7TthRY", "(ILjava/util/List;Landroidx/compose/ui/graphics/Paint;)V", "drawPoints", "enableZ", "disableZ", "(Ljava/util/List;Landroidx/compose/ui/graphics/Paint;)V", "", "drawLines", "(Ljava/util/List;Landroidx/compose/ui/graphics/Paint;I)V", "", "drawRawPoints-O7TthRY", "(I[FLandroidx/compose/ui/graphics/Paint;)V", "drawRawPoints", "([FLandroidx/compose/ui/graphics/Paint;I)V", "drawRawLines", "Landroidx/compose/ui/graphics/Vertices;", "Landroidx/compose/ui/graphics/BlendMode;", "drawVertices-TPEHhCM", "(Landroidx/compose/ui/graphics/Vertices;ILandroidx/compose/ui/graphics/Paint;)V", "drawVertices", "Landroid/graphics/Canvas;", "Landroidx/compose/ui/graphics/TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "internalCanvas", "Landroid/graphics/Canvas;", "getInternalCanvas", "()Landroid/graphics/Canvas;", "setInternalCanvas", "(Landroid/graphics/Canvas;)V", "getInternalCanvas$annotations", "Landroid/graphics/Rect;", "srcRect", "Landroid/graphics/Rect;", "dstRect"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AndroidCanvas implements Canvas {
    private Rect dstRect;
    private android.graphics.Canvas internalCanvas = AndroidCanvas_androidKt.EmptyCanvas;
    private Rect srcRect;

    public static /* synthetic */ void getInternalCanvas$annotations() {
    }

    public final android.graphics.Canvas getInternalCanvas() {
        return this.internalCanvas;
    }

    public final void setInternalCanvas(android.graphics.Canvas canvas) {
        this.internalCanvas = canvas;
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void save() {
        this.internalCanvas.save();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void restore() {
        this.internalCanvas.restore();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void saveLayer(androidx.compose.ui.geometry.Rect p0, Paint p1) {
        this.internalCanvas.saveLayer(p0.getLeft(), p0.getTop(), p0.getRight(), p0.getBottom(), p1.getInternalPaint(), 31);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void translate(float p0, float p1) {
        this.internalCanvas.translate(p0, p1);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void scale(float p0, float p1) {
        this.internalCanvas.scale(p0, p1);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void rotate(float p0) {
        this.internalCanvas.rotate(p0);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void skew(float p0, float p1) {
        this.internalCanvas.skew(p0, p1);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: concat-58bKbWc, reason: not valid java name */
    public final void mo4070concat58bKbWc(float[] p0) {
        if (MatrixKt.m4486isIdentity58bKbWc(p0)) {
            return;
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        AndroidMatrixConversions_androidKt.m4086setFromEL8BTi8(matrix, p0);
        this.internalCanvas.concat(matrix);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: clipRect-N_I0leg, reason: not valid java name */
    public final void mo4069clipRectN_I0leg(float p0, float p1, float p2, float p3, int p4) {
        this.internalCanvas.clipRect(p0, p1, p2, p3, m4078toRegionOp7u2Bmg(p4));
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: clipPath-mtrdD-E, reason: not valid java name */
    public final void mo4068clipPathmtrdDE(Path p0, int p1) {
        android.graphics.Canvas canvas = this.internalCanvas;
        if (p0 instanceof AndroidPath) {
            canvas.clipPath(((AndroidPath) p0).getInternalPath(), m4078toRegionOp7u2Bmg(p1));
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    /* JADX INFO: renamed from: toRegionOp--7u2Bmg, reason: not valid java name */
    public final Region.Op m4078toRegionOp7u2Bmg(int i) {
        return ClipOp.m4202equalsimpl0(i, ClipOp.INSTANCE.m4206getDifferencertfAjoo()) ? Region.Op.DIFFERENCE : Region.Op.INTERSECT;
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: drawLine-Wko1d7g, reason: not valid java name */
    public final void mo4074drawLineWko1d7g(long p0, long p1, Paint p2) {
        this.internalCanvas.drawLine(Float.intBitsToFloat((int) (p0 >> 32)), Float.intBitsToFloat((int) (p0 & 4294967295L)), Float.intBitsToFloat((int) (p1 >> 32)), Float.intBitsToFloat((int) (p1 & 4294967295L)), p2.getInternalPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void drawRect(float p0, float p1, float p2, float p3, Paint p4) {
        this.internalCanvas.drawRect(p0, p1, p2, p3, p4.getInternalPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void drawRoundRect(float p0, float p1, float p2, float p3, float p4, float p5, Paint p6) {
        this.internalCanvas.drawRoundRect(p0, p1, p2, p3, p4, p5, p6.getInternalPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void drawOval(float p0, float p1, float p2, float p3, Paint p4) {
        this.internalCanvas.drawOval(p0, p1, p2, p3, p4.getInternalPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: drawCircle-9KIMszo, reason: not valid java name */
    public final void mo4071drawCircle9KIMszo(long p0, float p1, Paint p2) {
        this.internalCanvas.drawCircle(Float.intBitsToFloat((int) (p0 >> 32)), Float.intBitsToFloat((int) (p0 & 4294967295L)), p1, p2.getInternalPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void drawArc(float p0, float p1, float p2, float p3, float p4, float p5, boolean p6, Paint p7) {
        this.internalCanvas.drawArc(p0, p1, p2, p3, p4, p5, p6, p7.getInternalPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void drawPath(Path p0, Paint p1) {
        android.graphics.Canvas canvas = this.internalCanvas;
        if (p0 instanceof AndroidPath) {
            canvas.drawPath(((AndroidPath) p0).getInternalPath(), p1.getInternalPaint());
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: drawImage-d-4ec7I, reason: not valid java name */
    public final void mo4072drawImaged4ec7I(ImageBitmap p0, long p1, Paint p2) {
        this.internalCanvas.drawBitmap(AndroidImageBitmap_androidKt.asAndroidBitmap(p0), Float.intBitsToFloat((int) (p1 >> 32)), Float.intBitsToFloat((int) (p1 & 4294967295L)), p2.getInternalPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: drawImageRect-HPBpro0, reason: not valid java name */
    public final void mo4073drawImageRectHPBpro0(ImageBitmap p0, long p1, long p2, long p3, long p4, Paint p5) {
        if (this.srcRect == null) {
            this.srcRect = new Rect();
            this.dstRect = new Rect();
        }
        android.graphics.Canvas canvas = this.internalCanvas;
        Bitmap bitmapAsAndroidBitmap = AndroidImageBitmap_androidKt.asAndroidBitmap(p0);
        Rect rect = this.srcRect;
        Intrinsics.checkNotNull(rect);
        rect.left = IntOffset.m7063getXimpl(p1);
        rect.top = IntOffset.m7064getYimpl(p1);
        rect.right = IntOffset.m7063getXimpl(p1) + ((int) (p2 >> 32));
        rect.bottom = IntOffset.m7064getYimpl(p1) + ((int) (p2 & 4294967295L));
        Unit unit = Unit.INSTANCE;
        Rect rect2 = this.dstRect;
        Intrinsics.checkNotNull(rect2);
        rect2.left = IntOffset.m7063getXimpl(p3);
        rect2.top = IntOffset.m7064getYimpl(p3);
        rect2.right = IntOffset.m7063getXimpl(p3) + ((int) (p4 >> 32));
        rect2.bottom = IntOffset.m7064getYimpl(p3) + ((int) (p4 & 4294967295L));
        Unit unit2 = Unit.INSTANCE;
        canvas.drawBitmap(bitmapAsAndroidBitmap, rect, rect2, p5.getInternalPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: drawPoints-O7TthRY, reason: not valid java name */
    public final void mo4075drawPointsO7TthRY(int p0, List<Offset> p1, Paint p2) {
        if (PointMode.m4532equalsimpl0(p0, PointMode.INSTANCE.m4536getLinesr_lszbg())) {
            drawLines(p1, p2, 2);
        } else if (PointMode.m4532equalsimpl0(p0, PointMode.INSTANCE.m4538getPolygonr_lszbg())) {
            drawLines(p1, p2, 1);
        } else if (PointMode.m4532equalsimpl0(p0, PointMode.INSTANCE.m4537getPointsr_lszbg())) {
            drawPoints(p1, p2);
        }
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void enableZ() {
        CanvasUtils.INSTANCE.enableZ(this.internalCanvas, true);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void disableZ() {
        CanvasUtils.INSTANCE.enableZ(this.internalCanvas, false);
    }

    private final void drawLines(List<Offset> p0, Paint p1, int p2) {
        if (p0.size() >= 2) {
            android.graphics.Paint internalPaint = p1.getInternalPaint();
            int i = 0;
            while (i < p0.size() - 1) {
                long jM3984unboximpl = p0.get(i).m3984unboximpl();
                long jM3984unboximpl2 = p0.get(i + 1).m3984unboximpl();
                this.internalCanvas.drawLine(Float.intBitsToFloat((int) (jM3984unboximpl >> 32)), Float.intBitsToFloat((int) (jM3984unboximpl & 4294967295L)), Float.intBitsToFloat((int) (jM3984unboximpl2 >> 32)), Float.intBitsToFloat((int) (jM3984unboximpl2 & 4294967295L)), internalPaint);
                i += p2;
            }
        }
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: drawRawPoints-O7TthRY, reason: not valid java name */
    public final void mo4076drawRawPointsO7TthRY(int p0, float[] p1, Paint p2) {
        if (p1.length % 2 != 0) {
            throw new IllegalArgumentException("points must have an even number of values");
        }
        if (PointMode.m4532equalsimpl0(p0, PointMode.INSTANCE.m4536getLinesr_lszbg())) {
            drawRawLines(p1, p2, 2);
        } else if (PointMode.m4532equalsimpl0(p0, PointMode.INSTANCE.m4538getPolygonr_lszbg())) {
            drawRawLines(p1, p2, 1);
        } else if (PointMode.m4532equalsimpl0(p0, PointMode.INSTANCE.m4537getPointsr_lszbg())) {
            drawRawPoints(p1, p2, 2);
        }
    }

    private final void drawRawPoints(float[] p0, Paint p1, int p2) {
        if (p0.length % 2 == 0) {
            android.graphics.Paint internalPaint = p1.getInternalPaint();
            int i = 0;
            while (i < p0.length - 1) {
                this.internalCanvas.drawPoint(p0[i], p0[i + 1], internalPaint);
                i += p2;
            }
        }
    }

    private final void drawRawLines(float[] p0, Paint p1, int p2) {
        if (p0.length < 4 || p0.length % 2 != 0) {
            return;
        }
        android.graphics.Paint internalPaint = p1.getInternalPaint();
        int i = 0;
        while (i < p0.length - 3) {
            this.internalCanvas.drawLine(p0[i], p0[i + 1], p0[i + 2], p0[i + 3], internalPaint);
            i += p2 * 2;
        }
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: drawVertices-TPEHhCM, reason: not valid java name */
    public final void mo4077drawVerticesTPEHhCM(Vertices p0, int p1, Paint p2) {
        this.internalCanvas.drawVertices(AndroidVertexMode_androidKt.m4123toAndroidVertexModeJOOmi9M(p0.getVertexMode()), p0.getPositions().length, p0.getPositions(), 0, p0.getTextureCoordinates(), 0, p0.getColors(), 0, p0.getIndices(), 0, p0.getIndices().length, p2.getInternalPaint());
    }

    private final void drawPoints(List<Offset> p0, Paint p1) {
        int size = p0.size();
        for (int i = 0; i < size; i++) {
            long jM3984unboximpl = p0.get(i).m3984unboximpl();
            this.internalCanvas.drawPoint(Float.intBitsToFloat((int) (jM3984unboximpl >> 32)), Float.intBitsToFloat((int) (jM3984unboximpl & 4294967295L)), p1.getInternalPaint());
        }
    }
}
