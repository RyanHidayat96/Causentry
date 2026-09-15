package com.google.android.gms.internal.mlkit_common;

/* JADX INFO: loaded from: classes6.dex */
final class zzmd extends zzmj {
    private final String zza;
    private final boolean zzb;
    private final int zzc;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzmj)) {
            return false;
        }
        zzmj zzmjVar = (zzmj) obj;
        return this.zza.equals(zzmjVar.zzb()) && this.zzb == zzmjVar.zzc() && this.zzc == zzmjVar.zza();
    }

    public final int hashCode() {
        return ((((this.zza.hashCode() ^ 1000003) * 1000003) ^ (true != this.zzb ? 1237 : 1231)) * 1000003) ^ this.zzc;
    }

    public final String toString() {
        return "MLKitLoggingOptions{libraryName=" + this.zza + ", enableFirelog=" + this.zzb + ", firelogEventType=" + this.zzc + "}";
    }

    /* synthetic */ zzmd(String str, boolean z, int i, zzmc zzmcVar) {
        this.zza = str;
        this.zzb = z;
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzmj
    public final int zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzmj
    public final String zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzmj
    public final boolean zzc() {
        return this.zzb;
    }
}
