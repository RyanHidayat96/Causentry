package defpackage;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes3.dex */
public final class setCaptureType extends setDefaultCaptureConfig<Drawable> {
    @Override // defpackage.setDefaultCaptureConfig
    protected final /* synthetic */ void setResource(Drawable drawable) {
        ((ImageView) this.view).setImageDrawable(drawable);
    }

    public setCaptureType(ImageView imageView) {
        super(imageView);
    }
}
