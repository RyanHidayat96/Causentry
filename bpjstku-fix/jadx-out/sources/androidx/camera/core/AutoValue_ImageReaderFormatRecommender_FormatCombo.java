package androidx.camera.core;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_ImageReaderFormatRecommender_FormatCombo extends ImageReaderFormatRecommender.FormatCombo {
    private final int imageAnalysisFormat;
    private final int imageCaptureFormat;

    AutoValue_ImageReaderFormatRecommender_FormatCombo(int i, int i2) {
        this.imageCaptureFormat = i;
        this.imageAnalysisFormat = i2;
    }

    @Override // androidx.camera.core.ImageReaderFormatRecommender.FormatCombo
    final int imageCaptureFormat() {
        return this.imageCaptureFormat;
    }

    @Override // androidx.camera.core.ImageReaderFormatRecommender.FormatCombo
    final int imageAnalysisFormat() {
        return this.imageAnalysisFormat;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FormatCombo{imageCaptureFormat=");
        sb.append(this.imageCaptureFormat);
        sb.append(", imageAnalysisFormat=");
        sb.append(this.imageAnalysisFormat);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImageReaderFormatRecommender.FormatCombo)) {
            return false;
        }
        ImageReaderFormatRecommender.FormatCombo formatCombo = (ImageReaderFormatRecommender.FormatCombo) obj;
        return this.imageCaptureFormat == formatCombo.imageCaptureFormat() && this.imageAnalysisFormat == formatCombo.imageAnalysisFormat();
    }

    public final int hashCode() {
        return ((this.imageCaptureFormat ^ 1000003) * 1000003) ^ this.imageAnalysisFormat;
    }
}
