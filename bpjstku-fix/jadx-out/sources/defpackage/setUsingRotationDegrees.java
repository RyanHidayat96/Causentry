package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* JADX INFO: loaded from: classes4.dex */
public class setUsingRotationDegrees extends ReplacementSpan {
    String TuitionPaymentFragmentbindingInflater1 = "";
    float TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 80.0f;
    int b = -16776961;

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        String str = this.TuitionPaymentFragmentbindingInflater1;
        int iMeasureText = (int) paint.measureText(str, 0, str.length());
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = paint.getTextSize();
        return iMeasureText;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Paint paint2 = new Paint();
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setColor(this.b);
        paint2.setAntiAlias(true);
        paint2.setTextSize(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        canvas.drawText(this.TuitionPaymentFragmentbindingInflater1, f, i5, paint2);
    }
}
