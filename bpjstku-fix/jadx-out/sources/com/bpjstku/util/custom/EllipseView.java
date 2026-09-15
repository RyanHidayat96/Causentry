package com.bpjstku.util.custom;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.bpjstku.R;
import defpackage.onPlaybackPositionUpdate;

/* JADX INFO: loaded from: classes6.dex */
public class EllipseView extends AppCompatTextView {
    private int TuitionPaymentFragmentbindingInflater1;
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private GradientDrawable TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private boolean b;
    private int d;
    private int g;

    public EllipseView(Context context) {
        super(context);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
        b(null);
    }

    public EllipseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
        b(attributeSet);
    }

    public EllipseView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
        b(attributeSet);
    }

    private void b(AttributeSet attributeSet) {
        TuitionPaymentFragmentbindingInflater1(attributeSet);
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = gradientDrawable;
        gradientDrawable.setShape(0);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.setStroke(this.d, this.g);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.setCornerRadius(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.setColor(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ? this.TuitionPaymentFragmentbindingInflater1 : getResources().getColor(R.color.material_on_background_disabled));
        setBackground(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        setDisableEllipseView(this.b);
    }

    private void TuitionPaymentFragmentbindingInflater1(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, onPlaybackPositionUpdate.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            try {
                this.g = typedArrayObtainStyledAttributes.getInt(3, getResources().getColor(android.R.color.white));
                this.d = typedArrayObtainStyledAttributes.getInt(4, 0);
                this.TuitionPaymentFragmentbindingInflater1 = typedArrayObtainStyledAttributes.getInt(1, getResources().getColor(android.R.color.white));
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
                this.b = typedArrayObtainStyledAttributes.getBoolean(2, false);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.setColor(i);
    }

    public void setDisableEllipseView(boolean z) {
        this.b = z;
        setBackgroundColor(z ? getResources().getColor(R.color.material_on_background_disabled) : this.TuitionPaymentFragmentbindingInflater1);
        setEnabled(!z);
    }

    public void setEnabledEllipseView(boolean z) {
        setEnabled(z);
        setBackgroundColor(z ? this.TuitionPaymentFragmentbindingInflater1 : getResources().getColor(R.color.material_on_background_disabled));
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = z;
    }
}
