package defpackage;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.request.target.ViewTarget;

/* JADX INFO: loaded from: classes3.dex */
public abstract class setDefaultCaptureConfig<Z> extends ViewTarget<ImageView, Z> implements setImageQueueDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault1 {
    private Animatable animatable;

    protected abstract void setResource(Z z);

    public setDefaultCaptureConfig(ImageView imageView) {
        super(imageView);
    }

    @Deprecated
    public setDefaultCaptureConfig(ImageView imageView, boolean z) {
        super(imageView, z);
    }

    @Override // setImageQueueDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault1
    public Drawable getCurrentDrawable() {
        return ((ImageView) this.view).getDrawable();
    }

    @Override // setImageQueueDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault1
    public void setDrawable(Drawable drawable) {
        ((ImageView) this.view).setImageDrawable(drawable);
    }

    @Override // com.bumptech.glide.request.target.ViewTarget, defpackage.setBackpressureStrategy, defpackage.setDefaultResolution
    public void onLoadStarted(Drawable drawable) {
        super.onLoadStarted(drawable);
        setResourceInternal(null);
        setDrawable(drawable);
    }

    @Override // defpackage.setBackpressureStrategy, defpackage.setDefaultResolution
    public void onLoadFailed(Drawable drawable) {
        super.onLoadFailed(drawable);
        setResourceInternal(null);
        setDrawable(drawable);
    }

    @Override // com.bumptech.glide.request.target.ViewTarget, defpackage.setBackpressureStrategy, defpackage.setDefaultResolution
    public void onLoadCleared(Drawable drawable) {
        super.onLoadCleared(drawable);
        Animatable animatable = this.animatable;
        if (animatable != null) {
            animatable.stop();
        }
        setResourceInternal(null);
        setDrawable(drawable);
    }

    @Override // defpackage.setDefaultResolution
    public void onResourceReady(Z z, setImageQueueDepth<? super Z> setimagequeuedepth) {
        if (setimagequeuedepth == null || !setimagequeuedepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3(z, this)) {
            setResourceInternal(z);
        } else {
            maybeUpdateAnimatable(z);
        }
    }

    @Override // defpackage.setBackpressureStrategy, defpackage.getDefaultConfig
    public void onStart() {
        Animatable animatable = this.animatable;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // defpackage.setBackpressureStrategy, defpackage.getDefaultConfig
    public void onStop() {
        Animatable animatable = this.animatable;
        if (animatable != null) {
            animatable.stop();
        }
    }

    private void setResourceInternal(Z z) {
        setResource(z);
        maybeUpdateAnimatable(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void maybeUpdateAnimatable(Z z) {
        if (z instanceof Animatable) {
            Animatable animatable = (Animatable) z;
            this.animatable = animatable;
            animatable.start();
            return;
        }
        this.animatable = null;
    }
}
