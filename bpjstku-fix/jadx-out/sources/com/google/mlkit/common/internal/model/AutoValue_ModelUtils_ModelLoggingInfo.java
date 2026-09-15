package com.google.mlkit.common.internal.model;

/* JADX INFO: loaded from: classes6.dex */
final class AutoValue_ModelUtils_ModelLoggingInfo extends ModelUtils.ModelLoggingInfo {
    private final long zza;
    private final String zzb;
    private final boolean zzc;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ModelUtils.ModelLoggingInfo)) {
            return false;
        }
        ModelUtils.ModelLoggingInfo modelLoggingInfo = (ModelUtils.ModelLoggingInfo) obj;
        return this.zza == modelLoggingInfo.getSize() && this.zzb.equals(modelLoggingInfo.getHash()) && this.zzc == modelLoggingInfo.isManifestModel();
    }

    public final int hashCode() {
        long j = this.zza;
        int i = (int) (j ^ (j >>> 32));
        return ((((i ^ 1000003) * 1000003) ^ this.zzb.hashCode()) * 1000003) ^ (true != this.zzc ? 1237 : 1231);
    }

    public final String toString() {
        long j = this.zza;
        String str = this.zzb;
        boolean z = this.zzc;
        StringBuilder sb = new StringBuilder("ModelLoggingInfo{size=");
        sb.append(j);
        sb.append(", hash=");
        sb.append(str);
        sb.append(", manifestModel=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }

    AutoValue_ModelUtils_ModelLoggingInfo(long j, String str, boolean z) {
        this.zza = j;
        this.zzb = str;
        this.zzc = z;
    }

    @Override // com.google.mlkit.common.internal.model.ModelUtils.ModelLoggingInfo
    public final String getHash() {
        return this.zzb;
    }

    @Override // com.google.mlkit.common.internal.model.ModelUtils.ModelLoggingInfo
    public final long getSize() {
        return this.zza;
    }

    @Override // com.google.mlkit.common.internal.model.ModelUtils.ModelLoggingInfo
    public final boolean isManifestModel() {
        return this.zzc;
    }
}
