package androidx.camera.core.processing.concurrent;

import androidx.camera.core.processing.util.OutConfig;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_DualOutConfig extends DualOutConfig {
    private final OutConfig primaryOutConfig;
    private final OutConfig secondaryOutConfig;

    AutoValue_DualOutConfig(OutConfig outConfig, OutConfig outConfig2) {
        if (outConfig == null) {
            throw new NullPointerException("Null primaryOutConfig");
        }
        this.primaryOutConfig = outConfig;
        if (outConfig2 == null) {
            throw new NullPointerException("Null secondaryOutConfig");
        }
        this.secondaryOutConfig = outConfig2;
    }

    @Override // androidx.camera.core.processing.concurrent.DualOutConfig
    public final OutConfig getPrimaryOutConfig() {
        return this.primaryOutConfig;
    }

    @Override // androidx.camera.core.processing.concurrent.DualOutConfig
    public final OutConfig getSecondaryOutConfig() {
        return this.secondaryOutConfig;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DualOutConfig{primaryOutConfig=");
        sb.append(this.primaryOutConfig);
        sb.append(", secondaryOutConfig=");
        sb.append(this.secondaryOutConfig);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DualOutConfig)) {
            return false;
        }
        DualOutConfig dualOutConfig = (DualOutConfig) obj;
        return this.primaryOutConfig.equals(dualOutConfig.getPrimaryOutConfig()) && this.secondaryOutConfig.equals(dualOutConfig.getSecondaryOutConfig());
    }

    public final int hashCode() {
        return ((this.primaryOutConfig.hashCode() ^ 1000003) * 1000003) ^ this.secondaryOutConfig.hashCode();
    }
}
