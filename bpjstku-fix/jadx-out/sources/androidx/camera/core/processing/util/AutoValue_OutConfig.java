package androidx.camera.core.processing.util;

import android.graphics.Rect;
import android.util.Size;
import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_OutConfig extends OutConfig {
    private final Rect getCropRect;
    private final int getFormat;
    private final int getRotationDegrees;
    private final Size getSize;
    private final int getTargets;
    private final UUID getUuid;
    private final boolean isMirroring;
    private final boolean shouldRespectInputCropRect;

    AutoValue_OutConfig(UUID uuid, int i, int i2, Rect rect, Size size, int i3, boolean z, boolean z2) {
        if (uuid == null) {
            throw new NullPointerException("Null getUuid");
        }
        this.getUuid = uuid;
        this.getTargets = i;
        this.getFormat = i2;
        if (rect == null) {
            throw new NullPointerException("Null getCropRect");
        }
        this.getCropRect = rect;
        if (size == null) {
            throw new NullPointerException("Null getSize");
        }
        this.getSize = size;
        this.getRotationDegrees = i3;
        this.isMirroring = z;
        this.shouldRespectInputCropRect = z2;
    }

    @Override // androidx.camera.core.processing.util.OutConfig
    final UUID getUuid() {
        return this.getUuid;
    }

    @Override // androidx.camera.core.processing.util.OutConfig
    public final int getTargets() {
        return this.getTargets;
    }

    @Override // androidx.camera.core.processing.util.OutConfig
    public final int getFormat() {
        return this.getFormat;
    }

    @Override // androidx.camera.core.processing.util.OutConfig
    public final Rect getCropRect() {
        return this.getCropRect;
    }

    @Override // androidx.camera.core.processing.util.OutConfig
    public final Size getSize() {
        return this.getSize;
    }

    @Override // androidx.camera.core.processing.util.OutConfig
    public final int getRotationDegrees() {
        return this.getRotationDegrees;
    }

    @Override // androidx.camera.core.processing.util.OutConfig
    public final boolean isMirroring() {
        return this.isMirroring;
    }

    @Override // androidx.camera.core.processing.util.OutConfig
    public final boolean shouldRespectInputCropRect() {
        return this.shouldRespectInputCropRect;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OutConfig{getUuid=");
        sb.append(this.getUuid);
        sb.append(", getTargets=");
        sb.append(this.getTargets);
        sb.append(", getFormat=");
        sb.append(this.getFormat);
        sb.append(", getCropRect=");
        sb.append(this.getCropRect);
        sb.append(", getSize=");
        sb.append(this.getSize);
        sb.append(", getRotationDegrees=");
        sb.append(this.getRotationDegrees);
        sb.append(", isMirroring=");
        sb.append(this.isMirroring);
        sb.append(", shouldRespectInputCropRect=");
        sb.append(this.shouldRespectInputCropRect);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OutConfig)) {
            return false;
        }
        OutConfig outConfig = (OutConfig) obj;
        return this.getUuid.equals(outConfig.getUuid()) && this.getTargets == outConfig.getTargets() && this.getFormat == outConfig.getFormat() && this.getCropRect.equals(outConfig.getCropRect()) && this.getSize.equals(outConfig.getSize()) && this.getRotationDegrees == outConfig.getRotationDegrees() && this.isMirroring == outConfig.isMirroring() && this.shouldRespectInputCropRect == outConfig.shouldRespectInputCropRect();
    }

    public final int hashCode() {
        int iHashCode = this.getUuid.hashCode();
        int i = this.getTargets;
        int i2 = this.getFormat;
        int iHashCode2 = this.getCropRect.hashCode();
        int iHashCode3 = this.getSize.hashCode();
        int i3 = this.getRotationDegrees;
        return ((((((((((((((iHashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ i2) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ i3) * 1000003) ^ (this.isMirroring ? 1231 : 1237)) * 1000003) ^ (this.shouldRespectInputCropRect ? 1231 : 1237);
    }
}
