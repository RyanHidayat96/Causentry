package androidx.camera.core;

import android.graphics.Bitmap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\u0007J\u0017\u0010\r\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0016\u001a\f\u0012\b\u0012\u0006*\u00020\u00010\u00010\u00158\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00018CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019"}, d2 = {"Landroidx/camera/core/DelegatingImageSavedCallback;", "Landroidx/camera/core/ImageCapture$OnImageSavedCallback;", "p0", "<init>", "(Landroidx/camera/core/ImageCapture$OnImageSavedCallback;)V", "", "dispose", "()V", "", "onCaptureProcessProgressed", "(I)V", "onCaptureStarted", "Landroidx/camera/core/ImageCaptureException;", "onError", "(Landroidx/camera/core/ImageCaptureException;)V", "Landroidx/camera/core/ImageCapture$OutputFileResults;", "onImageSaved", "(Landroidx/camera/core/ImageCapture$OutputFileResults;)V", "Landroid/graphics/Bitmap;", "onPostviewBitmapAvailable", "(Landroid/graphics/Bitmap;)V", "Ljava/util/concurrent/atomic/AtomicReference;", "_delegate", "Ljava/util/concurrent/atomic/AtomicReference;", "getDelegate", "()Landroidx/camera/core/ImageCapture$OnImageSavedCallback;", "delegate"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class DelegatingImageSavedCallback implements ImageCapture.OnImageSavedCallback {
    private final AtomicReference<ImageCapture.OnImageSavedCallback> _delegate;

    public DelegatingImageSavedCallback(ImageCapture.OnImageSavedCallback onImageSavedCallback) {
        Intrinsics.checkNotNullParameter(onImageSavedCallback, "");
        this._delegate = new AtomicReference<>(onImageSavedCallback);
    }

    private final ImageCapture.OnImageSavedCallback getDelegate() {
        return this._delegate.get();
    }

    public final void dispose() {
        this._delegate.set(null);
    }

    @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
    public final void onCaptureStarted() {
        ImageCapture.OnImageSavedCallback delegate = getDelegate();
        if (delegate != null) {
            delegate.onCaptureStarted();
        }
    }

    @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
    public final void onCaptureProcessProgressed(int p0) {
        ImageCapture.OnImageSavedCallback delegate = getDelegate();
        if (delegate != null) {
            delegate.onCaptureProcessProgressed(p0);
        }
    }

    @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
    public final void onPostviewBitmapAvailable(Bitmap p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        ImageCapture.OnImageSavedCallback delegate = getDelegate();
        if (delegate != null) {
            delegate.onPostviewBitmapAvailable(p0);
        }
    }

    @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
    public final void onImageSaved(ImageCapture.OutputFileResults p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        ImageCapture.OnImageSavedCallback delegate = getDelegate();
        if (delegate != null) {
            delegate.onImageSaved(p0);
        }
    }

    @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
    public final void onError(ImageCaptureException p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        ImageCapture.OnImageSavedCallback delegate = getDelegate();
        if (delegate != null) {
            delegate.onError(p0);
        }
    }
}
