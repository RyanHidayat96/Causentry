package defpackage;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes3.dex */
public final class setBackgroundExecutor extends setDefaultCaptureConfig<Bitmap> {
    @Override // defpackage.setDefaultCaptureConfig
    protected final /* synthetic */ void setResource(Bitmap bitmap) {
        ((ImageView) this.view).setImageBitmap(bitmap);
    }

    public setBackgroundExecutor(ImageView imageView) {
        super(imageView);
    }
}
