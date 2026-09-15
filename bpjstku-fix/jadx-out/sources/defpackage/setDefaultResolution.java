package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes3.dex */
public interface setDefaultResolution<R> extends getDefaultConfig {
    ImageAnalysisBuilder getRequest();

    void getSize(setHighResolutionDisabled sethighresolutiondisabled);

    void onLoadCleared(Drawable drawable);

    void onLoadFailed(Drawable drawable);

    void onLoadStarted(Drawable drawable);

    void onResourceReady(R r, setImageQueueDepth<? super R> setimagequeuedepth);

    void removeCallback(setHighResolutionDisabled sethighresolutiondisabled);

    void setRequest(ImageAnalysisBuilder imageAnalysisBuilder);
}
