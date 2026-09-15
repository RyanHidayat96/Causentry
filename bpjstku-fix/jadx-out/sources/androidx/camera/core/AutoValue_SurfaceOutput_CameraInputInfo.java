package androidx.camera.core;

import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.impl.CameraInternal;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_SurfaceOutput_CameraInputInfo extends SurfaceOutput.CameraInputInfo {
    private final CameraInternal cameraInternal;
    private final Rect inputCropRect;
    private final Size inputSize;
    private final boolean mirroring;
    private final int rotationDegrees;

    AutoValue_SurfaceOutput_CameraInputInfo(Size size, Rect rect, CameraInternal cameraInternal, int i, boolean z) {
        if (size == null) {
            throw new NullPointerException("Null inputSize");
        }
        this.inputSize = size;
        if (rect == null) {
            throw new NullPointerException("Null inputCropRect");
        }
        this.inputCropRect = rect;
        this.cameraInternal = cameraInternal;
        this.rotationDegrees = i;
        this.mirroring = z;
    }

    @Override // androidx.camera.core.SurfaceOutput.CameraInputInfo
    public final Size getInputSize() {
        return this.inputSize;
    }

    @Override // androidx.camera.core.SurfaceOutput.CameraInputInfo
    public final Rect getInputCropRect() {
        return this.inputCropRect;
    }

    @Override // androidx.camera.core.SurfaceOutput.CameraInputInfo
    public final CameraInternal getCameraInternal() {
        return this.cameraInternal;
    }

    @Override // androidx.camera.core.SurfaceOutput.CameraInputInfo
    public final int getRotationDegrees() {
        return this.rotationDegrees;
    }

    @Override // androidx.camera.core.SurfaceOutput.CameraInputInfo
    public final boolean getMirroring() {
        return this.mirroring;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CameraInputInfo{inputSize=");
        sb.append(this.inputSize);
        sb.append(", inputCropRect=");
        sb.append(this.inputCropRect);
        sb.append(", cameraInternal=");
        sb.append(this.cameraInternal);
        sb.append(", rotationDegrees=");
        sb.append(this.rotationDegrees);
        sb.append(", mirroring=");
        sb.append(this.mirroring);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SurfaceOutput.CameraInputInfo)) {
            return false;
        }
        SurfaceOutput.CameraInputInfo cameraInputInfo = (SurfaceOutput.CameraInputInfo) obj;
        if (!this.inputSize.equals(cameraInputInfo.getInputSize()) || !this.inputCropRect.equals(cameraInputInfo.getInputCropRect())) {
            return false;
        }
        CameraInternal cameraInternal = this.cameraInternal;
        if (cameraInternal == null) {
            if (cameraInputInfo.getCameraInternal() != null) {
                return false;
            }
        } else if (!cameraInternal.equals(cameraInputInfo.getCameraInternal())) {
            return false;
        }
        return this.rotationDegrees == cameraInputInfo.getRotationDegrees() && this.mirroring == cameraInputInfo.getMirroring();
    }

    public final int hashCode() {
        int iHashCode = this.inputSize.hashCode();
        int iHashCode2 = this.inputCropRect.hashCode();
        CameraInternal cameraInternal = this.cameraInternal;
        int iHashCode3 = cameraInternal == null ? 0 : cameraInternal.hashCode();
        return ((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ this.rotationDegrees) * 1000003) ^ (this.mirroring ? 1231 : 1237);
    }
}
