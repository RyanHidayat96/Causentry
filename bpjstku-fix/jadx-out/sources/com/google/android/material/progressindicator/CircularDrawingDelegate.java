package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.math.MathUtils;

/* JADX INFO: loaded from: classes6.dex */
final class CircularDrawingDelegate extends DrawingDelegate<CircularProgressIndicatorSpec> {
    private static final float ROUND_CAP_RAMP_DOWN_THRESHHOLD = 0.01f;
    private float adjustedRadius;
    private float displayedCornerRadius;
    private float displayedTrackThickness;
    private float totalTrackLengthFraction;
    private boolean useStrokeCap;

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    final void drawStopIndicator(Canvas canvas, Paint paint, int i, int i2) {
    }

    CircularDrawingDelegate(CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(circularProgressIndicatorSpec);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    final int getPreferredWidth() {
        return getSize();
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    final int getPreferredHeight() {
        return getSize();
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    final void adjustCanvas(Canvas canvas, Rect rect, float f, boolean z, boolean z2) {
        float fWidth = rect.width() / getPreferredWidth();
        float fHeight = rect.height() / getPreferredHeight();
        float f2 = (((CircularProgressIndicatorSpec) this.spec).indicatorSize / 2.0f) + ((CircularProgressIndicatorSpec) this.spec).indicatorInset;
        canvas.translate((f2 * fWidth) + rect.left, (f2 * fHeight) + rect.top);
        canvas.rotate(-90.0f);
        canvas.scale(fWidth, fHeight);
        if (((CircularProgressIndicatorSpec) this.spec).indicatorDirection != 0) {
            canvas.scale(1.0f, -1.0f);
        }
        float f3 = -f2;
        canvas.clipRect(f3, f3, f2, f2);
        this.useStrokeCap = ((CircularProgressIndicatorSpec) this.spec).trackThickness / 2 <= ((CircularProgressIndicatorSpec) this.spec).trackCornerRadius;
        this.displayedTrackThickness = ((CircularProgressIndicatorSpec) this.spec).trackThickness * f;
        this.displayedCornerRadius = Math.min(((CircularProgressIndicatorSpec) this.spec).trackThickness / 2, ((CircularProgressIndicatorSpec) this.spec).trackCornerRadius) * f;
        this.adjustedRadius = (((CircularProgressIndicatorSpec) this.spec).indicatorSize - ((CircularProgressIndicatorSpec) this.spec).trackThickness) / 2.0f;
        if (z || z2) {
            if ((z && ((CircularProgressIndicatorSpec) this.spec).showAnimationBehavior == 2) || (z2 && ((CircularProgressIndicatorSpec) this.spec).hideAnimationBehavior == 1)) {
                this.adjustedRadius += ((1.0f - f) * ((CircularProgressIndicatorSpec) this.spec).trackThickness) / 2.0f;
            } else if ((z && ((CircularProgressIndicatorSpec) this.spec).showAnimationBehavior == 1) || (z2 && ((CircularProgressIndicatorSpec) this.spec).hideAnimationBehavior == 2)) {
                this.adjustedRadius -= ((1.0f - f) * ((CircularProgressIndicatorSpec) this.spec).trackThickness) / 2.0f;
            }
        }
        if (z2 && ((CircularProgressIndicatorSpec) this.spec).hideAnimationBehavior == 3) {
            this.totalTrackLengthFraction = f;
        } else {
            this.totalTrackLengthFraction = 1.0f;
        }
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    final void fillIndicator(Canvas canvas, Paint paint, DrawingDelegate.ActiveIndicator activeIndicator, int i) {
        drawArc(canvas, paint, activeIndicator.startFraction, activeIndicator.endFraction, MaterialColors.compositeARGBWithAlpha(activeIndicator.color, i), activeIndicator.gapSize, activeIndicator.gapSize);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    final void fillTrack(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3) {
        drawArc(canvas, paint, f, f2, MaterialColors.compositeARGBWithAlpha(i, i2), i3, i3);
    }

    private void drawArc(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3) {
        float f3;
        float f4;
        float f5 = f;
        float f6 = f2;
        int i4 = i2;
        while (true) {
            if (f6 < f5) {
                f6 += 1.0f;
            }
            f3 = f6 - f5;
            f4 = f5 % 1.0f;
            if (this.totalTrackLengthFraction >= 1.0f) {
                break;
            }
            float f7 = f4 + f3;
            if (f7 <= 1.0f) {
                break;
            }
            drawArc(canvas, paint, f4, 1.0f, i, i4, 0);
            i4 = 0;
            f5 = 1.0f;
            f6 = f7;
        }
        float degrees = (float) Math.toDegrees(this.displayedCornerRadius / this.adjustedRadius);
        if (f4 == 0.0f && f3 >= 0.99f) {
            f3 += ((f3 - 0.99f) * ((degrees * 2.0f) / 360.0f)) / 0.01f;
        }
        float fLerp = MathUtils.lerp(1.0f - this.totalTrackLengthFraction, 1.0f, f4);
        float fLerp2 = MathUtils.lerp(0.0f, this.totalTrackLengthFraction, f3);
        float degrees2 = (float) Math.toDegrees(i4 / this.adjustedRadius);
        float degrees3 = ((fLerp2 * 360.0f) - degrees2) - ((float) Math.toDegrees(i3 / this.adjustedRadius));
        float f8 = (fLerp * 360.0f) + degrees2;
        if (degrees3 > 0.0f) {
            paint.setAntiAlias(true);
            paint.setColor(i);
            paint.setStrokeWidth(this.displayedTrackThickness);
            float f9 = degrees * 2.0f;
            if (degrees3 < f9) {
                float f10 = degrees3 / f9;
                paint.setStyle(Paint.Style.FILL);
                drawRoundedBlock(canvas, paint, f8 + (degrees * f10), this.displayedCornerRadius * 2.0f, this.displayedTrackThickness, f10);
                return;
            }
            float f11 = this.adjustedRadius;
            float f12 = -f11;
            RectF rectF = new RectF(f12, f12, f11, f11);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(this.useStrokeCap ? Paint.Cap.ROUND : Paint.Cap.BUTT);
            float f13 = f8 + degrees;
            canvas.drawArc(rectF, f13, degrees3 - f9, false, paint);
            if (this.useStrokeCap || this.displayedCornerRadius <= 0.0f) {
                return;
            }
            paint.setStyle(Paint.Style.FILL);
            drawRoundedBlock(canvas, paint, f13, this.displayedCornerRadius * 2.0f, this.displayedTrackThickness);
            drawRoundedBlock(canvas, paint, (f8 + degrees3) - degrees, this.displayedCornerRadius * 2.0f, this.displayedTrackThickness);
        }
    }

    private int getSize() {
        return ((CircularProgressIndicatorSpec) this.spec).indicatorSize + (((CircularProgressIndicatorSpec) this.spec).indicatorInset * 2);
    }

    private void drawRoundedBlock(Canvas canvas, Paint paint, float f, float f2, float f3) {
        drawRoundedBlock(canvas, paint, f, f2, f3, 1.0f);
    }

    private void drawRoundedBlock(Canvas canvas, Paint paint, float f, float f2, float f3, float f4) {
        float fMin = (int) Math.min(f3, this.displayedTrackThickness);
        float f5 = f2 / 2.0f;
        float fMin2 = Math.min(f5, (this.displayedCornerRadius * fMin) / this.displayedTrackThickness);
        RectF rectF = new RectF((-fMin) / 2.0f, (-f2) / 2.0f, fMin / 2.0f, f5);
        canvas.save();
        double d = f;
        canvas.translate((float) (((double) this.adjustedRadius) * Math.cos(Math.toRadians(d))), (float) (((double) this.adjustedRadius) * Math.sin(Math.toRadians(d))));
        canvas.rotate(f);
        canvas.scale(f4, f4);
        canvas.drawRoundRect(rectF, fMin2, fMin2, paint);
        canvas.restore();
    }
}
