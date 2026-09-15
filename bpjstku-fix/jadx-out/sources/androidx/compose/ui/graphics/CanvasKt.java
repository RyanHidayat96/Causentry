package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\"\u0010\u0007\u001a\u00020\u0006*\u00020\u00022\f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0086\b¢\u0006\u0004\b\u0007\u0010\b\u001a2\u0010\r\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0001\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0086\b¢\u0006\u0004\b\r\u0010\u000e\u001a)\u0010\u0010\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011\u001a-\u0010\u0012\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u000f2\b\b\u0002\u0010\u000b\u001a\u00020\u000f2\b\b\u0002\u0010\f\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0011\u001a3\u0010\u0014\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u000f2\b\b\u0002\u0010\u000b\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015"}, d2 = {"Landroidx/compose/ui/graphics/ImageBitmap;", "p0", "Landroidx/compose/ui/graphics/Canvas;", "Canvas", "(Landroidx/compose/ui/graphics/ImageBitmap;)Landroidx/compose/ui/graphics/Canvas;", "Lkotlin/Function0;", "", "withSave", "(Landroidx/compose/ui/graphics/Canvas;Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/graphics/Paint;", "p1", "p2", "withSaveLayer", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/graphics/Paint;Lkotlin/jvm/functions/Function0;)V", "", "rotate", "(Landroidx/compose/ui/graphics/Canvas;FFF)V", "rotateRad", "p3", "scale", "(Landroidx/compose/ui/graphics/Canvas;FFFF)V"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CanvasKt {
    public static final Canvas Canvas(ImageBitmap imageBitmap) {
        return AndroidCanvas_androidKt.ActualCanvas(imageBitmap);
    }

    public static final void withSave(Canvas canvas, Function0<Unit> function0) {
        try {
            canvas.save();
            function0.invoke();
        } finally {
            canvas.restore();
        }
    }

    public static final void withSaveLayer(Canvas canvas, Rect rect, Paint paint, Function0<Unit> function0) {
        try {
            canvas.saveLayer(rect, paint);
            function0.invoke();
        } finally {
            canvas.restore();
        }
    }

    public static final void rotate(Canvas canvas, float f, float f2, float f3) {
        if (f == 0.0f) {
            return;
        }
        canvas.translate(f2, f3);
        canvas.rotate(f);
        canvas.translate(-f2, -f3);
    }

    public static /* synthetic */ void rotateRad$default(Canvas canvas, float f, float f2, float f3, int i, Object obj) {
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        rotateRad(canvas, f, f2, f3);
    }

    public static final void rotateRad(Canvas canvas, float f, float f2, float f3) {
        rotate(canvas, DegreesKt.degrees(f), f2, f3);
    }

    public static /* synthetic */ void scale$default(Canvas canvas, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 2) != 0) {
            f2 = f;
        }
        scale(canvas, f, f2, f3, f4);
    }

    public static final void scale(Canvas canvas, float f, float f2, float f3, float f4) {
        if (f == 1.0f && f2 == 1.0f) {
            return;
        }
        canvas.translate(f3, f4);
        canvas.scale(f, f2);
        canvas.translate(-f3, -f4);
    }
}
