package androidx.compose.ui.platform;

import android.graphics.Outline;
import android.os.Build;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Path;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000f\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0003J\u0017\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u001fH\u0002¢\u0006\u0004\b \u0010!J-\u0010$\u001a\u00020\b*\u0004\u0018\u00010\u001c2\u0006\u0010\u0005\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\"\u0010#R\u0016\u0010%\u001a\u00020\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010*\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010,\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010.\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b.\u0010-R$\u0010/\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\b8\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\b/\u0010&\u001a\u0004\b0\u00101R\u0016\u00102\u001a\u00020\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b2\u0010&R\u0018\u00103\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b3\u0010-R\u0018\u00104\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00106\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0013\u0010:\u001a\u0004\u0018\u00010'8G¢\u0006\u0006\u001a\u0004\b8\u00109R\u0011\u0010<\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b;\u00101R\u0013\u0010?\u001a\u0004\u0018\u00010\u001f8G¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0016\u0010@\u001a\u00020\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010B\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bB\u0010AR\u0016\u0010C\u001a\u00020\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bC\u0010&R\u0018\u0010D\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bD\u0010-R\u0018\u0010E\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bE\u0010-"}, d2 = {"Landroidx/compose/ui/platform/OutlineResolver;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/Outline;", "p0", "", "p1", "", "p2", "p3", "Landroidx/compose/ui/geometry/Size;", "p4", "update-S_szKao", "(Landroidx/compose/ui/graphics/Outline;FZFJ)Z", "update", "Landroidx/compose/ui/geometry/Offset;", "isInOutline-k-4lQ0M", "(J)Z", "isInOutline", "Landroidx/compose/ui/graphics/Canvas;", "", "clipToOutline", "(Landroidx/compose/ui/graphics/Canvas;)V", "updateCache", "Landroidx/compose/ui/geometry/Rect;", "updateCacheWithRect", "(Landroidx/compose/ui/geometry/Rect;)V", "Landroidx/compose/ui/geometry/RoundRect;", "updateCacheWithRoundRect", "(Landroidx/compose/ui/geometry/RoundRect;)V", "Landroidx/compose/ui/graphics/Path;", "updateCacheWithPath", "(Landroidx/compose/ui/graphics/Path;)V", "isSameBounds-4L21HEs", "(Landroidx/compose/ui/geometry/RoundRect;JJF)Z", "isSameBounds", "isSupportedOutline", "Z", "Landroid/graphics/Outline;", "cachedOutline", "Landroid/graphics/Outline;", "outline", "Landroidx/compose/ui/graphics/Outline;", "cachedRrectPath", "Landroidx/compose/ui/graphics/Path;", "outlinePath", "cacheIsDirty", "getCacheIsDirty$ui_release", "()Z", "usePathForClip", "tmpPath", "tmpRoundRect", "Landroidx/compose/ui/geometry/RoundRect;", "roundedCornerRadius", "F", "getAndroidOutline", "()Landroid/graphics/Outline;", "androidOutline", "getOutlineClipSupported", "outlineClipSupported", "getClipPath", "()Landroidx/compose/ui/graphics/Path;", "clipPath", "rectTopLeft", "J", "rectSize", "outlineNeeded", "tmpTouchPointPath", "tmpOpPath"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OutlineResolver {
    public static final int $stable = 8;
    private boolean cacheIsDirty;
    private final Outline cachedOutline;
    private Path cachedRrectPath;
    private boolean isSupportedOutline = true;
    private androidx.compose.ui.graphics.Outline outline;
    private boolean outlineNeeded;
    private Path outlinePath;
    private long rectSize;
    private long rectTopLeft;
    private float roundedCornerRadius;
    private Path tmpOpPath;
    private Path tmpPath;
    private RoundRect tmpRoundRect;
    private Path tmpTouchPointPath;
    private boolean usePathForClip;

    public OutlineResolver() {
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.cachedOutline = outline;
        this.rectTopLeft = Offset.INSTANCE.m3990getZeroF1C5BW0();
        this.rectSize = Size.INSTANCE.m4052getZeroNHjbRc();
    }

    /* JADX INFO: renamed from: getCacheIsDirty$ui_release, reason: from getter */
    public final boolean getCacheIsDirty() {
        return this.cacheIsDirty;
    }

    public final Outline getAndroidOutline() {
        updateCache();
        if (this.outlineNeeded && this.isSupportedOutline) {
            return this.cachedOutline;
        }
        return null;
    }

    public final boolean getOutlineClipSupported() {
        return !this.usePathForClip;
    }

    public final Path getClipPath() {
        updateCache();
        return this.outlinePath;
    }

    /* JADX INFO: renamed from: update-S_szKao, reason: not valid java name */
    public final boolean m6116updateS_szKao(androidx.compose.ui.graphics.Outline p0, float p1, boolean p2, float p3, long p4) {
        this.cachedOutline.setAlpha(p1);
        boolean zAreEqual = Intrinsics.areEqual(this.outline, p0);
        if (!zAreEqual) {
            this.outline = p0;
            this.cacheIsDirty = true;
        }
        this.rectSize = p4;
        boolean z = p0 != null && (p2 || p3 > 0.0f);
        if (this.outlineNeeded != z) {
            this.outlineNeeded = z;
            this.cacheIsDirty = true;
        }
        return !zAreEqual;
    }

    /* JADX INFO: renamed from: isInOutline-k-4lQ0M, reason: not valid java name */
    public final boolean m6115isInOutlinek4lQ0M(long p0) {
        androidx.compose.ui.graphics.Outline outline;
        if (this.outlineNeeded && (outline = this.outline) != null) {
            return ShapeContainingUtilKt.isInOutline(outline, Float.intBitsToFloat((int) (p0 >> 32)), Float.intBitsToFloat((int) (p0 & 4294967295L)), this.tmpTouchPointPath, this.tmpOpPath);
        }
        return true;
    }

    public final void clipToOutline(Canvas p0) {
        int i;
        Object obj;
        Canvas canvas;
        int i2;
        Path clipPath = getClipPath();
        if (clipPath != null) {
            Canvas.m4189clipPathmtrdDE$default(p0, clipPath, 0, 2, null);
            return;
        }
        float f = this.roundedCornerRadius;
        if (f > 0.0f) {
            Path Path = this.tmpPath;
            RoundRect roundRect = this.tmpRoundRect;
            if (Path == null || !m6114isSameBounds4L21HEs(roundRect, this.rectTopLeft, this.rectSize, f)) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (this.rectTopLeft >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.rectTopLeft & 4294967295L));
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (this.rectTopLeft >> 32));
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (this.rectSize >> 32));
                float fIntBitsToFloat5 = Float.intBitsToFloat((int) (this.rectTopLeft & 4294967295L));
                float fIntBitsToFloat6 = Float.intBitsToFloat((int) (this.rectSize & 4294967295L));
                float f2 = this.roundedCornerRadius;
                float f3 = fIntBitsToFloat4 + fIntBitsToFloat3;
                float f4 = fIntBitsToFloat5 + fIntBitsToFloat6;
                RoundRect roundRectM4028RoundRectgG7oq9Y = RoundRectKt.m4028RoundRectgG7oq9Y(fIntBitsToFloat, fIntBitsToFloat2, f3, f4, CornerRadius.m3928constructorimpl((((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32)));
                if (Path == null) {
                    Path = AndroidPath_androidKt.Path();
                } else {
                    Path.reset();
                }
                i = 2;
                obj = null;
                Path.addRoundRect$default(Path, roundRectM4028RoundRectgG7oq9Y, null, 2, null);
                this.tmpRoundRect = roundRectM4028RoundRectgG7oq9Y;
                this.tmpPath = Path;
                canvas = p0;
                i2 = 0;
            } else {
                canvas = p0;
                i2 = 0;
                i = 2;
                obj = null;
            }
            Canvas.m4189clipPathmtrdDE$default(canvas, Path, i2, i, obj);
            return;
        }
        Canvas.m4190clipRectN_I0leg$default(p0, Float.intBitsToFloat((int) (this.rectTopLeft >> 32)), Float.intBitsToFloat((int) (this.rectTopLeft & 4294967295L)), Float.intBitsToFloat((int) (this.rectSize >> 32)) + Float.intBitsToFloat((int) (this.rectTopLeft >> 32)), Float.intBitsToFloat((int) (this.rectSize & 4294967295L)) + Float.intBitsToFloat((int) (this.rectTopLeft & 4294967295L)), 0, 16, null);
    }

    private final void updateCache() {
        if (this.cacheIsDirty) {
            this.rectTopLeft = Offset.INSTANCE.m3990getZeroF1C5BW0();
            this.roundedCornerRadius = 0.0f;
            this.outlinePath = null;
            this.cacheIsDirty = false;
            this.usePathForClip = false;
            androidx.compose.ui.graphics.Outline outline = this.outline;
            if (outline != null && this.outlineNeeded && Float.intBitsToFloat((int) (this.rectSize >> 32)) > 0.0f && Float.intBitsToFloat((int) (this.rectSize & 4294967295L)) > 0.0f) {
                this.isSupportedOutline = true;
                if (outline instanceof androidx.compose.ui.graphics.Outline.Rectangle) {
                    updateCacheWithRect(((androidx.compose.ui.graphics.Outline.Rectangle) outline).getRect());
                    return;
                } else if (outline instanceof androidx.compose.ui.graphics.Outline.Rounded) {
                    updateCacheWithRoundRect(((androidx.compose.ui.graphics.Outline.Rounded) outline).getRoundRect());
                    return;
                } else {
                    if (!(outline instanceof androidx.compose.ui.graphics.Outline.Generic)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    updateCacheWithPath(((androidx.compose.ui.graphics.Outline.Generic) outline).getPath());
                    return;
                }
            }
            this.cachedOutline.setEmpty();
        }
    }

    private final void updateCacheWithRect(Rect p0) {
        float left = p0.getLeft();
        this.rectTopLeft = Offset.m3966constructorimpl((((long) Float.floatToRawIntBits(p0.getTop())) & 4294967295L) | (((long) Float.floatToRawIntBits(left)) << 32));
        float right = p0.getRight();
        float left2 = p0.getLeft();
        float bottom = p0.getBottom();
        float top = p0.getTop();
        this.rectSize = Size.m4034constructorimpl((((long) Float.floatToRawIntBits(right - left2)) << 32) | (((long) Float.floatToRawIntBits(bottom - top)) & 4294967295L));
        this.cachedOutline.setRect(Math.round(p0.getLeft()), Math.round(p0.getTop()), Math.round(p0.getRight()), Math.round(p0.getBottom()));
    }

    private final void updateCacheWithRoundRect(RoundRect p0) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (p0.m4024getTopLeftCornerRadiuskKHJgLs() >> 32));
        float left = p0.getLeft();
        float top = p0.getTop();
        this.rectTopLeft = Offset.m3966constructorimpl((Float.floatToRawIntBits(left) << 32) | (((long) Float.floatToRawIntBits(top)) & 4294967295L));
        float width = p0.getWidth();
        float height = p0.getHeight();
        this.rectSize = Size.m4034constructorimpl((Float.floatToRawIntBits(width) << 32) | (((long) Float.floatToRawIntBits(height)) & 4294967295L));
        if (RoundRectKt.isSimple(p0)) {
            this.cachedOutline.setRoundRect(Math.round(p0.getLeft()), Math.round(p0.getTop()), Math.round(p0.getRight()), Math.round(p0.getBottom()), fIntBitsToFloat);
            this.roundedCornerRadius = fIntBitsToFloat;
            return;
        }
        Path Path = this.cachedRrectPath;
        if (Path == null) {
            Path = AndroidPath_androidKt.Path();
            this.cachedRrectPath = Path;
        }
        Path.reset();
        Path.addRoundRect$default(Path, p0, null, 2, null);
        updateCacheWithPath(Path);
    }

    private final void updateCacheWithPath(Path p0) {
        if (Build.VERSION.SDK_INT > 28 || p0.isConvex()) {
            if (Build.VERSION.SDK_INT >= 30) {
                OutlineVerificationHelper.INSTANCE.setPath(this.cachedOutline, p0);
            } else {
                Outline outline = this.cachedOutline;
                if (p0 instanceof AndroidPath) {
                    outline.setConvexPath(((AndroidPath) p0).getInternalPath());
                } else {
                    throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                }
            }
            this.usePathForClip = !this.cachedOutline.canClip();
        } else {
            this.isSupportedOutline = false;
            this.cachedOutline.setEmpty();
            this.usePathForClip = true;
        }
        this.outlinePath = p0;
    }

    /* JADX INFO: renamed from: isSameBounds-4L21HEs, reason: not valid java name */
    private final boolean m6114isSameBounds4L21HEs(RoundRect roundRect, long j, long j2, float f) {
        if (roundRect == null || !RoundRectKt.isSimple(roundRect)) {
            return false;
        }
        int i = (int) (j >> 32);
        if (roundRect.getLeft() != Float.intBitsToFloat(i)) {
            return false;
        }
        int i2 = (int) (j & 4294967295L);
        return roundRect.getTop() == Float.intBitsToFloat(i2) && roundRect.getRight() == Float.intBitsToFloat(i) + Float.intBitsToFloat((int) (j2 >> 32)) && roundRect.getBottom() == Float.intBitsToFloat(i2) + Float.intBitsToFloat((int) (j2 & 4294967295L)) && Float.intBitsToFloat((int) (roundRect.m4024getTopLeftCornerRadiuskKHJgLs() >> 32)) == f;
    }
}
