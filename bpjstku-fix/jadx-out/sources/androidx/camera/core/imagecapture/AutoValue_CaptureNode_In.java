package androidx.camera.core.imagecapture;

import android.util.Size;
import androidx.camera.core.ImageReaderProxyProvider;
import androidx.camera.core.processing.Edge;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_CaptureNode_In extends CaptureNode.In {
    private final Edge<TakePictureManager.CaptureError> errorEdge;
    private final ImageReaderProxyProvider imageReaderProxyProvider;
    private final int inputFormat;
    private final int outputFormat;
    private final int postviewImageFormat;
    private final Size postviewSize;
    private final Edge<ProcessingRequest> requestEdge;
    private final Size size;
    private final boolean virtualCamera;

    AutoValue_CaptureNode_In(Size size, int i, int i2, boolean z, ImageReaderProxyProvider imageReaderProxyProvider, Size size2, int i3, Edge<ProcessingRequest> edge, Edge<TakePictureManager.CaptureError> edge2) {
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.size = size;
        this.inputFormat = i;
        this.outputFormat = i2;
        this.virtualCamera = z;
        this.imageReaderProxyProvider = imageReaderProxyProvider;
        this.postviewSize = size2;
        this.postviewImageFormat = i3;
        if (edge == null) {
            throw new NullPointerException("Null requestEdge");
        }
        this.requestEdge = edge;
        if (edge2 == null) {
            throw new NullPointerException("Null errorEdge");
        }
        this.errorEdge = edge2;
    }

    @Override // androidx.camera.core.imagecapture.CaptureNode.In
    final Size getSize() {
        return this.size;
    }

    @Override // androidx.camera.core.imagecapture.CaptureNode.In
    final int getInputFormat() {
        return this.inputFormat;
    }

    @Override // androidx.camera.core.imagecapture.CaptureNode.In
    final int getOutputFormat() {
        return this.outputFormat;
    }

    @Override // androidx.camera.core.imagecapture.CaptureNode.In
    final boolean isVirtualCamera() {
        return this.virtualCamera;
    }

    @Override // androidx.camera.core.imagecapture.CaptureNode.In
    final ImageReaderProxyProvider getImageReaderProxyProvider() {
        return this.imageReaderProxyProvider;
    }

    @Override // androidx.camera.core.imagecapture.CaptureNode.In
    final Size getPostviewSize() {
        return this.postviewSize;
    }

    @Override // androidx.camera.core.imagecapture.CaptureNode.In
    final int getPostviewImageFormat() {
        return this.postviewImageFormat;
    }

    @Override // androidx.camera.core.imagecapture.CaptureNode.In
    final Edge<ProcessingRequest> getRequestEdge() {
        return this.requestEdge;
    }

    @Override // androidx.camera.core.imagecapture.CaptureNode.In
    final Edge<TakePictureManager.CaptureError> getErrorEdge() {
        return this.errorEdge;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("In{size=");
        sb.append(this.size);
        sb.append(", inputFormat=");
        sb.append(this.inputFormat);
        sb.append(", outputFormat=");
        sb.append(this.outputFormat);
        sb.append(", virtualCamera=");
        sb.append(this.virtualCamera);
        sb.append(", imageReaderProxyProvider=");
        sb.append(this.imageReaderProxyProvider);
        sb.append(", postviewSize=");
        sb.append(this.postviewSize);
        sb.append(", postviewImageFormat=");
        sb.append(this.postviewImageFormat);
        sb.append(", requestEdge=");
        sb.append(this.requestEdge);
        sb.append(", errorEdge=");
        sb.append(this.errorEdge);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CaptureNode.In)) {
            return false;
        }
        CaptureNode.In in = (CaptureNode.In) obj;
        if (!this.size.equals(in.getSize()) || this.inputFormat != in.getInputFormat() || this.outputFormat != in.getOutputFormat() || this.virtualCamera != in.isVirtualCamera()) {
            return false;
        }
        ImageReaderProxyProvider imageReaderProxyProvider = this.imageReaderProxyProvider;
        if (imageReaderProxyProvider == null) {
            if (in.getImageReaderProxyProvider() != null) {
                return false;
            }
        } else if (!imageReaderProxyProvider.equals(in.getImageReaderProxyProvider())) {
            return false;
        }
        Size size = this.postviewSize;
        if (size == null) {
            if (in.getPostviewSize() != null) {
                return false;
            }
        } else if (!size.equals(in.getPostviewSize())) {
            return false;
        }
        return this.postviewImageFormat == in.getPostviewImageFormat() && this.requestEdge.equals(in.getRequestEdge()) && this.errorEdge.equals(in.getErrorEdge());
    }

    public final int hashCode() {
        int iHashCode = this.size.hashCode();
        int i = this.inputFormat;
        int i2 = this.outputFormat;
        int i3 = this.virtualCamera ? 1231 : 1237;
        ImageReaderProxyProvider imageReaderProxyProvider = this.imageReaderProxyProvider;
        int iHashCode2 = imageReaderProxyProvider == null ? 0 : imageReaderProxyProvider.hashCode();
        Size size = this.postviewSize;
        return ((((((((((((((((iHashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ i2) * 1000003) ^ i3) * 1000003) ^ iHashCode2) * 1000003) ^ (size != null ? size.hashCode() : 0)) * 1000003) ^ this.postviewImageFormat) * 1000003) ^ this.requestEdge.hashCode()) * 1000003) ^ this.errorEdge.hashCode();
    }
}
