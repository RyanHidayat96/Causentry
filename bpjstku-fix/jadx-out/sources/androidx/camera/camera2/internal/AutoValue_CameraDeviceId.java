package androidx.camera.camera2.internal;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_CameraDeviceId extends CameraDeviceId {
    private final String brand;
    private final String cameraId;
    private final String device;
    private final String model;

    AutoValue_CameraDeviceId(String str, String str2, String str3, String str4) {
        if (str == null) {
            throw new NullPointerException("Null brand");
        }
        this.brand = str;
        if (str2 == null) {
            throw new NullPointerException("Null device");
        }
        this.device = str2;
        if (str3 == null) {
            throw new NullPointerException("Null model");
        }
        this.model = str3;
        if (str4 == null) {
            throw new NullPointerException("Null cameraId");
        }
        this.cameraId = str4;
    }

    @Override // androidx.camera.camera2.internal.CameraDeviceId
    public final String getBrand() {
        return this.brand;
    }

    @Override // androidx.camera.camera2.internal.CameraDeviceId
    public final String getDevice() {
        return this.device;
    }

    @Override // androidx.camera.camera2.internal.CameraDeviceId
    public final String getModel() {
        return this.model;
    }

    @Override // androidx.camera.camera2.internal.CameraDeviceId
    public final String getCameraId() {
        return this.cameraId;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CameraDeviceId{brand=");
        sb.append(this.brand);
        sb.append(", device=");
        sb.append(this.device);
        sb.append(", model=");
        sb.append(this.model);
        sb.append(", cameraId=");
        sb.append(this.cameraId);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CameraDeviceId)) {
            return false;
        }
        CameraDeviceId cameraDeviceId = (CameraDeviceId) obj;
        return this.brand.equals(cameraDeviceId.getBrand()) && this.device.equals(cameraDeviceId.getDevice()) && this.model.equals(cameraDeviceId.getModel()) && this.cameraId.equals(cameraDeviceId.getCameraId());
    }

    public final int hashCode() {
        int iHashCode = this.brand.hashCode();
        return ((((((iHashCode ^ 1000003) * 1000003) ^ this.device.hashCode()) * 1000003) ^ this.model.hashCode()) * 1000003) ^ this.cameraId.hashCode();
    }
}
