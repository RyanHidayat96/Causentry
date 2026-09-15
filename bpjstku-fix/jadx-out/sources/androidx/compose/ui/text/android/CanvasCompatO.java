package androidx.compose.ui.text.android;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\fJ5\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\t\u0010\u0011J5\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u0012¢\u0006\u0004\b\t\u0010\u0013J\u001d\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016"}, d2 = {"Landroidx/compose/ui/text/android/CanvasCompatO;", "", "<init>", "()V", "Landroid/graphics/Canvas;", "p0", "Landroid/graphics/RectF;", "p1", "", "clipOutRect", "(Landroid/graphics/Canvas;Landroid/graphics/RectF;)Z", "Landroid/graphics/Rect;", "(Landroid/graphics/Canvas;Landroid/graphics/Rect;)Z", "", "p2", "p3", "p4", "(Landroid/graphics/Canvas;FFFF)Z", "", "(Landroid/graphics/Canvas;IIII)Z", "Landroid/graphics/Path;", "clipOutPath", "(Landroid/graphics/Canvas;Landroid/graphics/Path;)Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class CanvasCompatO {
    public static final CanvasCompatO INSTANCE = new CanvasCompatO();

    private CanvasCompatO() {
    }

    public final boolean clipOutRect(Canvas p0, RectF p1) {
        return p0.clipOutRect(p1);
    }

    public final boolean clipOutRect(Canvas p0, Rect p1) {
        return p0.clipOutRect(p1);
    }

    public final boolean clipOutRect(Canvas p0, float p1, float p2, float p3, float p4) {
        return p0.clipOutRect(p1, p2, p3, p4);
    }

    public final boolean clipOutRect(Canvas p0, int p1, int p2, int p3, int p4) {
        return p0.clipOutRect(p1, p2, p3, p4);
    }

    public final boolean clipOutPath(Canvas p0, Path p1) {
        return p0.clipOutPath(p1);
    }
}
