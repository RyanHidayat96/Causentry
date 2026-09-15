package androidx.camera.core.imagecapture;

import androidx.camera.core.ImageCaptureException;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_TakePictureManager_CaptureError extends TakePictureManager.CaptureError {
    private final ImageCaptureException imageCaptureException;
    private final int requestId;

    AutoValue_TakePictureManager_CaptureError(int i, ImageCaptureException imageCaptureException) {
        this.requestId = i;
        if (imageCaptureException == null) {
            throw new NullPointerException("Null imageCaptureException");
        }
        this.imageCaptureException = imageCaptureException;
    }

    @Override // androidx.camera.core.imagecapture.TakePictureManager.CaptureError
    final int getRequestId() {
        return this.requestId;
    }

    @Override // androidx.camera.core.imagecapture.TakePictureManager.CaptureError
    final ImageCaptureException getImageCaptureException() {
        return this.imageCaptureException;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CaptureError{requestId=");
        sb.append(this.requestId);
        sb.append(", imageCaptureException=");
        sb.append(this.imageCaptureException);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TakePictureManager.CaptureError)) {
            return false;
        }
        TakePictureManager.CaptureError captureError = (TakePictureManager.CaptureError) obj;
        return this.requestId == captureError.getRequestId() && this.imageCaptureException.equals(captureError.getImageCaptureException());
    }

    public final int hashCode() {
        return ((this.requestId ^ 1000003) * 1000003) ^ this.imageCaptureException.hashCode();
    }
}
