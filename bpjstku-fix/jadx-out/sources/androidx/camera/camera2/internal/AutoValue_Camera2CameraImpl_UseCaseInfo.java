package androidx.camera.camera2.internal;

import android.util.Size;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_Camera2CameraImpl_UseCaseInfo extends Camera2CameraImpl.UseCaseInfo {
    private final List<UseCaseConfigFactory.CaptureType> captureTypes;
    private final SessionConfig sessionConfig;
    private final StreamSpec streamSpec;
    private final Size surfaceResolution;
    private final UseCaseConfig<?> useCaseConfig;
    private final String useCaseId;
    private final Class<?> useCaseType;

    AutoValue_Camera2CameraImpl_UseCaseInfo(String str, Class<?> cls, SessionConfig sessionConfig, UseCaseConfig<?> useCaseConfig, Size size, StreamSpec streamSpec, List<UseCaseConfigFactory.CaptureType> list) {
        if (str == null) {
            throw new NullPointerException("Null useCaseId");
        }
        this.useCaseId = str;
        if (cls == null) {
            throw new NullPointerException("Null useCaseType");
        }
        this.useCaseType = cls;
        if (sessionConfig == null) {
            throw new NullPointerException("Null sessionConfig");
        }
        this.sessionConfig = sessionConfig;
        if (useCaseConfig == null) {
            throw new NullPointerException("Null useCaseConfig");
        }
        this.useCaseConfig = useCaseConfig;
        this.surfaceResolution = size;
        this.streamSpec = streamSpec;
        this.captureTypes = list;
    }

    @Override // androidx.camera.camera2.internal.Camera2CameraImpl.UseCaseInfo
    final String getUseCaseId() {
        return this.useCaseId;
    }

    @Override // androidx.camera.camera2.internal.Camera2CameraImpl.UseCaseInfo
    final Class<?> getUseCaseType() {
        return this.useCaseType;
    }

    @Override // androidx.camera.camera2.internal.Camera2CameraImpl.UseCaseInfo
    final SessionConfig getSessionConfig() {
        return this.sessionConfig;
    }

    @Override // androidx.camera.camera2.internal.Camera2CameraImpl.UseCaseInfo
    final UseCaseConfig<?> getUseCaseConfig() {
        return this.useCaseConfig;
    }

    @Override // androidx.camera.camera2.internal.Camera2CameraImpl.UseCaseInfo
    final Size getSurfaceResolution() {
        return this.surfaceResolution;
    }

    @Override // androidx.camera.camera2.internal.Camera2CameraImpl.UseCaseInfo
    final StreamSpec getStreamSpec() {
        return this.streamSpec;
    }

    @Override // androidx.camera.camera2.internal.Camera2CameraImpl.UseCaseInfo
    final List<UseCaseConfigFactory.CaptureType> getCaptureTypes() {
        return this.captureTypes;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UseCaseInfo{useCaseId=");
        sb.append(this.useCaseId);
        sb.append(", useCaseType=");
        sb.append(this.useCaseType);
        sb.append(", sessionConfig=");
        sb.append(this.sessionConfig);
        sb.append(", useCaseConfig=");
        sb.append(this.useCaseConfig);
        sb.append(", surfaceResolution=");
        sb.append(this.surfaceResolution);
        sb.append(", streamSpec=");
        sb.append(this.streamSpec);
        sb.append(", captureTypes=");
        sb.append(this.captureTypes);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Camera2CameraImpl.UseCaseInfo)) {
            return false;
        }
        Camera2CameraImpl.UseCaseInfo useCaseInfo = (Camera2CameraImpl.UseCaseInfo) obj;
        if (!this.useCaseId.equals(useCaseInfo.getUseCaseId()) || !this.useCaseType.equals(useCaseInfo.getUseCaseType()) || !this.sessionConfig.equals(useCaseInfo.getSessionConfig()) || !this.useCaseConfig.equals(useCaseInfo.getUseCaseConfig())) {
            return false;
        }
        Size size = this.surfaceResolution;
        if (size == null) {
            if (useCaseInfo.getSurfaceResolution() != null) {
                return false;
            }
        } else if (!size.equals(useCaseInfo.getSurfaceResolution())) {
            return false;
        }
        StreamSpec streamSpec = this.streamSpec;
        if (streamSpec == null) {
            if (useCaseInfo.getStreamSpec() != null) {
                return false;
            }
        } else if (!streamSpec.equals(useCaseInfo.getStreamSpec())) {
            return false;
        }
        List<UseCaseConfigFactory.CaptureType> list = this.captureTypes;
        if (list == null) {
            if (useCaseInfo.getCaptureTypes() != null) {
                return false;
            }
        } else if (!list.equals(useCaseInfo.getCaptureTypes())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = this.useCaseId.hashCode();
        int iHashCode2 = this.useCaseType.hashCode();
        int iHashCode3 = this.sessionConfig.hashCode();
        int iHashCode4 = this.useCaseConfig.hashCode();
        Size size = this.surfaceResolution;
        int iHashCode5 = size == null ? 0 : size.hashCode();
        StreamSpec streamSpec = this.streamSpec;
        int iHashCode6 = streamSpec == null ? 0 : streamSpec.hashCode();
        List<UseCaseConfigFactory.CaptureType> list = this.captureTypes;
        return ((((((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ iHashCode4) * 1000003) ^ iHashCode5) * 1000003) ^ iHashCode6) * 1000003) ^ (list != null ? list.hashCode() : 0);
    }
}
