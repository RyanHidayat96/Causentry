package com.midtrans.sdk.uikit.widgets;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.ImageButton;
import defpackage.AutoValue_CameraUseCaseAdapter_CameraId;

/* JADX INFO: loaded from: classes4.dex */
public class RoundedImageView extends ImageButton {
    public RoundedImageView(Context context) {
        super(context);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Path path = new Path();
        path.addRoundRect(new RectF(0.0f, 0.0f, getWidth(), getHeight()), 18.0f, 18.0f, Path.Direction.CW);
        canvas.clipPath(path);
        super.onDraw(canvas);
    }

    public RoundedImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RoundedImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        AutoValue_CameraUseCaseAdapter_CameraId.TuitionPaymentFragmentbindingInflater1[0] = Class.forName("lambdacancelFocusAndMetering13androidxcameracamera2internalFocusMeteringControl").getDeclaredField("TuitionPaymentFragmentspecialinlinedviewModeldefault1");
    }
}
