package androidx.camera.core.impl;

import androidx.camera.core.DynamicRange;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_SessionConfig_OutputConfig extends SessionConfig.OutputConfig {
    private final DynamicRange dynamicRange;
    private final int mirrorMode;
    private final String physicalCameraId;
    private final List<DeferrableSurface> sharedSurfaces;
    private final DeferrableSurface surface;
    private final int surfaceGroupId;

    private AutoValue_SessionConfig_OutputConfig(DeferrableSurface deferrableSurface, List<DeferrableSurface> list, String str, int i, int i2, DynamicRange dynamicRange) {
        this.surface = deferrableSurface;
        this.sharedSurfaces = list;
        this.physicalCameraId = str;
        this.mirrorMode = i;
        this.surfaceGroupId = i2;
        this.dynamicRange = dynamicRange;
    }

    @Override // androidx.camera.core.impl.SessionConfig.OutputConfig
    public final DeferrableSurface getSurface() {
        return this.surface;
    }

    @Override // androidx.camera.core.impl.SessionConfig.OutputConfig
    public final List<DeferrableSurface> getSharedSurfaces() {
        return this.sharedSurfaces;
    }

    @Override // androidx.camera.core.impl.SessionConfig.OutputConfig
    public final String getPhysicalCameraId() {
        return this.physicalCameraId;
    }

    @Override // androidx.camera.core.impl.SessionConfig.OutputConfig
    public final int getMirrorMode() {
        return this.mirrorMode;
    }

    @Override // androidx.camera.core.impl.SessionConfig.OutputConfig
    public final int getSurfaceGroupId() {
        return this.surfaceGroupId;
    }

    @Override // androidx.camera.core.impl.SessionConfig.OutputConfig
    public final DynamicRange getDynamicRange() {
        return this.dynamicRange;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OutputConfig{surface=");
        sb.append(this.surface);
        sb.append(", sharedSurfaces=");
        sb.append(this.sharedSurfaces);
        sb.append(", physicalCameraId=");
        sb.append(this.physicalCameraId);
        sb.append(", mirrorMode=");
        sb.append(this.mirrorMode);
        sb.append(", surfaceGroupId=");
        sb.append(this.surfaceGroupId);
        sb.append(", dynamicRange=");
        sb.append(this.dynamicRange);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SessionConfig.OutputConfig)) {
            return false;
        }
        SessionConfig.OutputConfig outputConfig = (SessionConfig.OutputConfig) obj;
        if (!this.surface.equals(outputConfig.getSurface()) || !this.sharedSurfaces.equals(outputConfig.getSharedSurfaces())) {
            return false;
        }
        String str = this.physicalCameraId;
        if (str == null) {
            if (outputConfig.getPhysicalCameraId() != null) {
                return false;
            }
        } else if (!str.equals(outputConfig.getPhysicalCameraId())) {
            return false;
        }
        return this.mirrorMode == outputConfig.getMirrorMode() && this.surfaceGroupId == outputConfig.getSurfaceGroupId() && this.dynamicRange.equals(outputConfig.getDynamicRange());
    }

    public final int hashCode() {
        int iHashCode = this.surface.hashCode();
        int iHashCode2 = this.sharedSurfaces.hashCode();
        String str = this.physicalCameraId;
        return ((((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.mirrorMode) * 1000003) ^ this.surfaceGroupId) * 1000003) ^ this.dynamicRange.hashCode();
    }

    static final class Builder extends SessionConfig.OutputConfig.Builder {
        private DynamicRange dynamicRange;
        private Integer mirrorMode;
        private String physicalCameraId;
        private List<DeferrableSurface> sharedSurfaces;
        private DeferrableSurface surface;
        private Integer surfaceGroupId;

        Builder() {
        }

        @Override // androidx.camera.core.impl.SessionConfig.OutputConfig.Builder
        public final SessionConfig.OutputConfig.Builder setSurface(DeferrableSurface deferrableSurface) {
            if (deferrableSurface == null) {
                throw new NullPointerException("Null surface");
            }
            this.surface = deferrableSurface;
            return this;
        }

        @Override // androidx.camera.core.impl.SessionConfig.OutputConfig.Builder
        public final SessionConfig.OutputConfig.Builder setSharedSurfaces(List<DeferrableSurface> list) {
            if (list == null) {
                throw new NullPointerException("Null sharedSurfaces");
            }
            this.sharedSurfaces = list;
            return this;
        }

        @Override // androidx.camera.core.impl.SessionConfig.OutputConfig.Builder
        public final SessionConfig.OutputConfig.Builder setPhysicalCameraId(String str) {
            this.physicalCameraId = str;
            return this;
        }

        @Override // androidx.camera.core.impl.SessionConfig.OutputConfig.Builder
        public final SessionConfig.OutputConfig.Builder setMirrorMode(int i) {
            this.mirrorMode = Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.core.impl.SessionConfig.OutputConfig.Builder
        public final SessionConfig.OutputConfig.Builder setSurfaceGroupId(int i) {
            this.surfaceGroupId = Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.core.impl.SessionConfig.OutputConfig.Builder
        public final SessionConfig.OutputConfig.Builder setDynamicRange(DynamicRange dynamicRange) {
            if (dynamicRange == null) {
                throw new NullPointerException("Null dynamicRange");
            }
            this.dynamicRange = dynamicRange;
            return this;
        }

        @Override // androidx.camera.core.impl.SessionConfig.OutputConfig.Builder
        public final SessionConfig.OutputConfig build() {
            String string;
            if (this.surface != null) {
                string = "";
            } else {
                string = " surface";
            }
            if (this.sharedSurfaces == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(string);
                sb.append(" sharedSurfaces");
                string = sb.toString();
            }
            if (this.mirrorMode == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(" mirrorMode");
                string = sb2.toString();
            }
            if (this.surfaceGroupId == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(string);
                sb3.append(" surfaceGroupId");
                string = sb3.toString();
            }
            if (this.dynamicRange == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(string);
                sb4.append(" dynamicRange");
                string = sb4.toString();
            }
            if (!string.isEmpty()) {
                throw new IllegalStateException("Missing required properties:".concat(String.valueOf(string)));
            }
            return new AutoValue_SessionConfig_OutputConfig(this.surface, this.sharedSurfaces, this.physicalCameraId, this.mirrorMode.intValue(), this.surfaceGroupId.intValue(), this.dynamicRange);
        }
    }
}
