package com.midtrans.sdk.uikit.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import defpackage.areCroppingInDifferentDirection;

/* JADX INFO: loaded from: classes4.dex */
public class AspectRatioImageView extends AppCompatImageView {
    private boolean TuitionPaymentFragmentbindingInflater1;
    private float TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private int b;

    public AspectRatioImageView(Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        int measuredWidth;
        int measuredHeight;
        super.onMeasure(i, i2);
        if (this.TuitionPaymentFragmentbindingInflater1) {
            int i3 = this.b;
            if (i3 == 0) {
                measuredWidth = getMeasuredWidth();
                measuredHeight = (int) (measuredWidth / this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            } else {
                if (i3 != 1) {
                    StringBuilder sb = new StringBuilder("Unknown measurement with ID ");
                    sb.append(this.b);
                    throw new IllegalStateException(sb.toString());
                }
                measuredHeight = getMeasuredHeight();
                measuredWidth = (int) (measuredHeight * this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
            setMeasuredDimension(measuredWidth, measuredHeight);
        }
    }

    public void setAspectRatio(float f) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = f;
        if (this.TuitionPaymentFragmentbindingInflater1) {
            requestLayout();
        }
    }

    public void setAspectRatioEnabled(boolean z) {
        this.TuitionPaymentFragmentbindingInflater1 = z;
        requestLayout();
    }

    public void setDominantMeasurement(int i) {
        if (i != 1 && i != 0) {
            throw new IllegalArgumentException("Invalid measurement type.");
        }
        this.b = i;
        requestLayout();
    }

    public AspectRatioImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, areCroppingInDifferentDirection.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = typedArrayObtainStyledAttributes.getFloat(areCroppingInDifferentDirection.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1, 1.0f);
        this.TuitionPaymentFragmentbindingInflater1 = typedArrayObtainStyledAttributes.getBoolean(areCroppingInDifferentDirection.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1, false);
        this.b = typedArrayObtainStyledAttributes.getInt(areCroppingInDifferentDirection.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3, 0);
        typedArrayObtainStyledAttributes.recycle();
    }
}
