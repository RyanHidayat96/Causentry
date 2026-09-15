package androidx.camera.core.internal;

import androidx.camera.core.impl.Identifier;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_CameraUseCaseAdapter_CameraId extends CameraUseCaseAdapter.CameraId {
    private final Identifier cameraConfigId;
    private final String cameraIdString;

    AutoValue_CameraUseCaseAdapter_CameraId(String str, Identifier identifier) {
        if (str == null) {
            throw new NullPointerException("Null cameraIdString");
        }
        this.cameraIdString = str;
        if (identifier == null) {
            throw new NullPointerException("Null cameraConfigId");
        }
        this.cameraConfigId = identifier;
    }

    @Override // androidx.camera.core.internal.CameraUseCaseAdapter.CameraId
    public final String getCameraIdString() {
        return this.cameraIdString;
    }

    @Override // androidx.camera.core.internal.CameraUseCaseAdapter.CameraId
    public final Identifier getCameraConfigId() {
        return this.cameraConfigId;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CameraId{cameraIdString=");
        sb.append(this.cameraIdString);
        sb.append(", cameraConfigId=");
        sb.append(this.cameraConfigId);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CameraUseCaseAdapter.CameraId)) {
            return false;
        }
        CameraUseCaseAdapter.CameraId cameraId = (CameraUseCaseAdapter.CameraId) obj;
        return this.cameraIdString.equals(cameraId.getCameraIdString()) && this.cameraConfigId.equals(cameraId.getCameraConfigId());
    }

    public final int hashCode() {
        return ((this.cameraIdString.hashCode() ^ 1000003) * 1000003) ^ this.cameraConfigId.hashCode();
    }
}
