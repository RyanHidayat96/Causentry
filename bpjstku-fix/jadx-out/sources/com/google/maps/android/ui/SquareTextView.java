package com.google.maps.android.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: loaded from: classes6.dex */
public class SquareTextView extends AppCompatTextView {
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private int b;

    public SquareTextView(Context context) {
        super(context);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        this.b = 0;
    }

    public SquareTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        this.b = 0;
    }

    public SquareTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        this.b = 0;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int iMax = Math.max(measuredWidth, measuredHeight);
        if (measuredWidth > measuredHeight) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = measuredWidth - measuredHeight;
            this.b = 0;
        } else {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            this.b = measuredHeight - measuredWidth;
        }
        setMeasuredDimension(iMax, iMax);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        canvas.translate(this.b / 2, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 / 2);
        super.draw(canvas);
    }
}
