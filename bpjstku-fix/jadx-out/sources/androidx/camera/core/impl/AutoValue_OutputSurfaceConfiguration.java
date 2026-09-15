package androidx.camera.core.impl;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_OutputSurfaceConfiguration extends OutputSurfaceConfiguration {
    private final OutputSurface imageAnalysisOutputSurface;
    private final OutputSurface imageCaptureOutputSurface;
    private final OutputSurface postviewOutputSurface;
    private final OutputSurface previewOutputSurface;

    AutoValue_OutputSurfaceConfiguration(OutputSurface outputSurface, OutputSurface outputSurface2, OutputSurface outputSurface3, OutputSurface outputSurface4) {
        if (outputSurface == null) {
            throw new NullPointerException("Null previewOutputSurface");
        }
        this.previewOutputSurface = outputSurface;
        if (outputSurface2 == null) {
            throw new NullPointerException("Null imageCaptureOutputSurface");
        }
        this.imageCaptureOutputSurface = outputSurface2;
        this.imageAnalysisOutputSurface = outputSurface3;
        this.postviewOutputSurface = outputSurface4;
    }

    @Override // androidx.camera.core.impl.OutputSurfaceConfiguration
    public final OutputSurface getPreviewOutputSurface() {
        return this.previewOutputSurface;
    }

    @Override // androidx.camera.core.impl.OutputSurfaceConfiguration
    public final OutputSurface getImageCaptureOutputSurface() {
        return this.imageCaptureOutputSurface;
    }

    @Override // androidx.camera.core.impl.OutputSurfaceConfiguration
    public final OutputSurface getImageAnalysisOutputSurface() {
        return this.imageAnalysisOutputSurface;
    }

    @Override // androidx.camera.core.impl.OutputSurfaceConfiguration
    public final OutputSurface getPostviewOutputSurface() {
        return this.postviewOutputSurface;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OutputSurfaceConfiguration{previewOutputSurface=");
        sb.append(this.previewOutputSurface);
        sb.append(", imageCaptureOutputSurface=");
        sb.append(this.imageCaptureOutputSurface);
        sb.append(", imageAnalysisOutputSurface=");
        sb.append(this.imageAnalysisOutputSurface);
        sb.append(", postviewOutputSurface=");
        sb.append(this.postviewOutputSurface);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OutputSurfaceConfiguration)) {
            return false;
        }
        OutputSurfaceConfiguration outputSurfaceConfiguration = (OutputSurfaceConfiguration) obj;
        if (!this.previewOutputSurface.equals(outputSurfaceConfiguration.getPreviewOutputSurface()) || !this.imageCaptureOutputSurface.equals(outputSurfaceConfiguration.getImageCaptureOutputSurface())) {
            return false;
        }
        OutputSurface outputSurface = this.imageAnalysisOutputSurface;
        if (outputSurface == null) {
            if (outputSurfaceConfiguration.getImageAnalysisOutputSurface() != null) {
                return false;
            }
        } else if (!outputSurface.equals(outputSurfaceConfiguration.getImageAnalysisOutputSurface())) {
            return false;
        }
        OutputSurface outputSurface2 = this.postviewOutputSurface;
        if (outputSurface2 == null) {
            if (outputSurfaceConfiguration.getPostviewOutputSurface() != null) {
                return false;
            }
        } else if (!outputSurface2.equals(outputSurfaceConfiguration.getPostviewOutputSurface())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = this.previewOutputSurface.hashCode();
        int iHashCode2 = this.imageCaptureOutputSurface.hashCode();
        OutputSurface outputSurface = this.imageAnalysisOutputSurface;
        int iHashCode3 = outputSurface == null ? 0 : outputSurface.hashCode();
        OutputSurface outputSurface2 = this.postviewOutputSurface;
        return ((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ (outputSurface2 != null ? outputSurface2.hashCode() : 0);
    }
}
