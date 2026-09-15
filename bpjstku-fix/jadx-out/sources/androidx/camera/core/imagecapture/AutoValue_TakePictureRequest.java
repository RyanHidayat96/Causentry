package androidx.camera.core.imagecapture;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.impl.CameraCaptureCallback;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_TakePictureRequest extends TakePictureRequest {
    private final Executor appExecutor;
    private final int captureMode;
    private final Rect cropRect;
    private final ImageCapture.OnImageCapturedCallback inMemoryCallback;
    private final int jpegQuality;
    private final ImageCapture.OnImageSavedCallback onDiskCallback;
    private final ImageCapture.OutputFileOptions outputFileOptions;
    private final int rotationDegrees;
    private final Matrix sensorToBufferTransform;
    private final List<CameraCaptureCallback> sessionConfigCameraCaptureCallbacks;

    AutoValue_TakePictureRequest(Executor executor, ImageCapture.OnImageCapturedCallback onImageCapturedCallback, ImageCapture.OnImageSavedCallback onImageSavedCallback, ImageCapture.OutputFileOptions outputFileOptions, Rect rect, Matrix matrix, int i, int i2, int i3, List<CameraCaptureCallback> list) {
        if (executor == null) {
            throw new NullPointerException("Null appExecutor");
        }
        this.appExecutor = executor;
        this.inMemoryCallback = onImageCapturedCallback;
        this.onDiskCallback = onImageSavedCallback;
        this.outputFileOptions = outputFileOptions;
        if (rect == null) {
            throw new NullPointerException("Null cropRect");
        }
        this.cropRect = rect;
        if (matrix == null) {
            throw new NullPointerException("Null sensorToBufferTransform");
        }
        this.sensorToBufferTransform = matrix;
        this.rotationDegrees = i;
        this.jpegQuality = i2;
        this.captureMode = i3;
        if (list == null) {
            throw new NullPointerException("Null sessionConfigCameraCaptureCallbacks");
        }
        this.sessionConfigCameraCaptureCallbacks = list;
    }

    @Override // androidx.camera.core.imagecapture.TakePictureRequest
    final Executor getAppExecutor() {
        return this.appExecutor;
    }

    @Override // androidx.camera.core.imagecapture.TakePictureRequest
    public final ImageCapture.OnImageCapturedCallback getInMemoryCallback() {
        return this.inMemoryCallback;
    }

    @Override // androidx.camera.core.imagecapture.TakePictureRequest
    public final ImageCapture.OnImageSavedCallback getOnDiskCallback() {
        return this.onDiskCallback;
    }

    @Override // androidx.camera.core.imagecapture.TakePictureRequest
    final ImageCapture.OutputFileOptions getOutputFileOptions() {
        return this.outputFileOptions;
    }

    @Override // androidx.camera.core.imagecapture.TakePictureRequest
    final Rect getCropRect() {
        return this.cropRect;
    }

    @Override // androidx.camera.core.imagecapture.TakePictureRequest
    final Matrix getSensorToBufferTransform() {
        return this.sensorToBufferTransform;
    }

    @Override // androidx.camera.core.imagecapture.TakePictureRequest
    final int getRotationDegrees() {
        return this.rotationDegrees;
    }

    @Override // androidx.camera.core.imagecapture.TakePictureRequest
    final int getJpegQuality() {
        return this.jpegQuality;
    }

    @Override // androidx.camera.core.imagecapture.TakePictureRequest
    final int getCaptureMode() {
        return this.captureMode;
    }

    @Override // androidx.camera.core.imagecapture.TakePictureRequest
    final List<CameraCaptureCallback> getSessionConfigCameraCaptureCallbacks() {
        return this.sessionConfigCameraCaptureCallbacks;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TakePictureRequest{appExecutor=");
        sb.append(this.appExecutor);
        sb.append(", inMemoryCallback=");
        sb.append(this.inMemoryCallback);
        sb.append(", onDiskCallback=");
        sb.append(this.onDiskCallback);
        sb.append(", outputFileOptions=");
        sb.append(this.outputFileOptions);
        sb.append(", cropRect=");
        sb.append(this.cropRect);
        sb.append(", sensorToBufferTransform=");
        sb.append(this.sensorToBufferTransform);
        sb.append(", rotationDegrees=");
        sb.append(this.rotationDegrees);
        sb.append(", jpegQuality=");
        sb.append(this.jpegQuality);
        sb.append(", captureMode=");
        sb.append(this.captureMode);
        sb.append(", sessionConfigCameraCaptureCallbacks=");
        sb.append(this.sessionConfigCameraCaptureCallbacks);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TakePictureRequest)) {
            return false;
        }
        TakePictureRequest takePictureRequest = (TakePictureRequest) obj;
        if (!this.appExecutor.equals(takePictureRequest.getAppExecutor())) {
            return false;
        }
        ImageCapture.OnImageCapturedCallback onImageCapturedCallback = this.inMemoryCallback;
        if (onImageCapturedCallback == null) {
            if (takePictureRequest.getInMemoryCallback() != null) {
                return false;
            }
        } else if (!onImageCapturedCallback.equals(takePictureRequest.getInMemoryCallback())) {
            return false;
        }
        ImageCapture.OnImageSavedCallback onImageSavedCallback = this.onDiskCallback;
        if (onImageSavedCallback == null) {
            if (takePictureRequest.getOnDiskCallback() != null) {
                return false;
            }
        } else if (!onImageSavedCallback.equals(takePictureRequest.getOnDiskCallback())) {
            return false;
        }
        ImageCapture.OutputFileOptions outputFileOptions = this.outputFileOptions;
        if (outputFileOptions == null) {
            if (takePictureRequest.getOutputFileOptions() != null) {
                return false;
            }
        } else if (!outputFileOptions.equals(takePictureRequest.getOutputFileOptions())) {
            return false;
        }
        return this.cropRect.equals(takePictureRequest.getCropRect()) && this.sensorToBufferTransform.equals(takePictureRequest.getSensorToBufferTransform()) && this.rotationDegrees == takePictureRequest.getRotationDegrees() && this.jpegQuality == takePictureRequest.getJpegQuality() && this.captureMode == takePictureRequest.getCaptureMode() && this.sessionConfigCameraCaptureCallbacks.equals(takePictureRequest.getSessionConfigCameraCaptureCallbacks());
    }

    public final int hashCode() {
        int iHashCode = this.appExecutor.hashCode();
        ImageCapture.OnImageCapturedCallback onImageCapturedCallback = this.inMemoryCallback;
        int iHashCode2 = onImageCapturedCallback == null ? 0 : onImageCapturedCallback.hashCode();
        ImageCapture.OnImageSavedCallback onImageSavedCallback = this.onDiskCallback;
        int iHashCode3 = onImageSavedCallback == null ? 0 : onImageSavedCallback.hashCode();
        ImageCapture.OutputFileOptions outputFileOptions = this.outputFileOptions;
        int iHashCode4 = outputFileOptions != null ? outputFileOptions.hashCode() : 0;
        int iHashCode5 = this.cropRect.hashCode();
        int iHashCode6 = this.sensorToBufferTransform.hashCode();
        return ((((((((((((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ iHashCode4) * 1000003) ^ iHashCode5) * 1000003) ^ iHashCode6) * 1000003) ^ this.rotationDegrees) * 1000003) ^ this.jpegQuality) * 1000003) ^ this.captureMode) * 1000003) ^ this.sessionConfigCameraCaptureCallbacks.hashCode();
    }
}
