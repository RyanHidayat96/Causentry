package androidx.compose.ui.text.android;

import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.graphics.text.MeasuredText;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\u001d\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ%\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\f\u0010\u0011J%\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\f\u0010\u0012JM\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ=\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001eJ]\u0010#\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u001f2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00142\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0019¢\u0006\u0004\b#\u0010$J\u001d\u0010&\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020%¢\u0006\u0004\b&\u0010'"}, d2 = {"Landroidx/compose/ui/text/android/CanvasCompatQ;", "", "<init>", "()V", "Landroid/graphics/Canvas;", "p0", "", "enableZ", "(Landroid/graphics/Canvas;)V", "disableZ", "", "p1", "drawColor", "(Landroid/graphics/Canvas;J)V", "", "Landroid/graphics/BlendMode;", "p2", "(Landroid/graphics/Canvas;ILandroid/graphics/BlendMode;)V", "(Landroid/graphics/Canvas;JLandroid/graphics/BlendMode;)V", "Landroid/graphics/RectF;", "", "p3", "p4", "p5", "p6", "Landroid/graphics/Paint;", "p7", "drawDoubleRoundRect", "(Landroid/graphics/Canvas;Landroid/graphics/RectF;FFLandroid/graphics/RectF;FFLandroid/graphics/Paint;)V", "", "(Landroid/graphics/Canvas;Landroid/graphics/RectF;[FLandroid/graphics/RectF;[FLandroid/graphics/Paint;)V", "Landroid/graphics/text/MeasuredText;", "", "p8", "p9", "drawTextRun", "(Landroid/graphics/Canvas;Landroid/graphics/text/MeasuredText;IIIIFFZLandroid/graphics/Paint;)V", "Landroid/graphics/RenderNode;", "drawRenderNode", "(Landroid/graphics/Canvas;Landroid/graphics/RenderNode;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class CanvasCompatQ {
    public static final CanvasCompatQ INSTANCE = new CanvasCompatQ();

    private CanvasCompatQ() {
    }

    public final void enableZ(Canvas p0) {
        p0.enableZ();
    }

    public final void disableZ(Canvas p0) {
        p0.disableZ();
    }

    public final void drawColor(Canvas p0, long p1) {
        p0.drawColor(p1);
    }

    public final void drawColor(Canvas p0, int p1, BlendMode p2) {
        p0.drawColor(p1, p2);
    }

    public final void drawColor(Canvas p0, long p1, BlendMode p2) {
        p0.drawColor(p1, p2);
    }

    public final void drawDoubleRoundRect(Canvas p0, RectF p1, float p2, float p3, RectF p4, float p5, float p6, Paint p7) {
        p0.drawDoubleRoundRect(p1, p2, p3, p4, p5, p6, p7);
    }

    public final void drawDoubleRoundRect(Canvas p0, RectF p1, float[] p2, RectF p3, float[] p4, Paint p5) {
        p0.drawDoubleRoundRect(p1, p2, p3, p4, p5);
    }

    public final void drawTextRun(Canvas p0, MeasuredText p1, int p2, int p3, int p4, int p5, float p6, float p7, boolean p8, Paint p9) {
        p0.drawTextRun(p1, p2, p3, p4, p5, p6, p7, p8, p9);
    }

    public final void drawRenderNode(Canvas p0, RenderNode p1) {
        p0.drawRenderNode(p1);
    }
}
