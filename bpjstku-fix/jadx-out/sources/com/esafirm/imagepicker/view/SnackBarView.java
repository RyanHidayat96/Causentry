package com.esafirm.imagepicker.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.interpolator.view.animation.FastOutLinearInInterpolator;
import com.bpjstku.R;
import defpackage.ViewPortBuilder;

/* JADX INFO: loaded from: classes3.dex */
public class SnackBarView extends RelativeLayout {
    private static final Interpolator b = new FastOutLinearInInterpolator();
    private TextView TuitionPaymentFragmentbindingInflater1;
    private Button TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public SnackBarView(Context context) {
        this(context, null);
    }

    public SnackBarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SnackBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View.inflate(getContext(), R.layout.ef_imagepikcer_snackbar, this);
        if (isInEditMode()) {
            return;
        }
        ViewCompat.setTranslationY(this, getContext().getResources().getDimensionPixelSize(R.dimen.ef_height_snackbar));
        ViewCompat.setAlpha(this, 0.0f);
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.ef_spacing_double);
        setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        this.TuitionPaymentFragmentbindingInflater1 = (TextView) findViewById(R.id.ef_snackbar_txt_bottom_caption);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = (Button) findViewById(R.id.ef_snackbar_btn_action);
    }

    public void setText(int i) {
        this.TuitionPaymentFragmentbindingInflater1.setText(i);
    }

    public void setOnActionClickListener(int i, final View.OnClickListener onClickListener) {
        if (i == 0) {
            i = R.string.ef_ok;
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.setText(i);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.setOnClickListener(new View.OnClickListener() { // from class: com.esafirm.imagepicker.view.SnackBarView.4
            @Override // android.view.View.OnClickListener
            public final void onClick(final View view) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
                try {
                    SnackBarView.b(SnackBarView.this, new Runnable() { // from class: com.esafirm.imagepicker.view.SnackBarView.4.3
                        @Override // java.lang.Runnable
                        public final void run() {
                            onClickListener.onClick(view);
                        }
                    });
                } finally {
                    ViewPortBuilder.b();
                }
            }
        });
    }

    public final void b(int i, View.OnClickListener onClickListener) {
        setText(i);
        setOnActionClickListener(0, onClickListener);
        ViewCompat.animate(this).translationY(0.0f).setDuration(200L).setInterpolator(b).alpha(1.0f);
    }

    static /* synthetic */ void b(SnackBarView snackBarView, Runnable runnable) {
        ViewCompat.animate(snackBarView).translationY(snackBarView.getHeight()).setDuration(200L).alpha(0.5f).withEndAction(runnable);
    }
}
