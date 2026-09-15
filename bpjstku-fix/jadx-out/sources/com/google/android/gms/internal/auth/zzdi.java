package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes6.dex */
final class zzdi extends zzdh {
    private final Object zza;

    public final boolean equals(Object obj) {
        if (obj instanceof zzdi) {
            return this.zza.equals(((zzdi) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.zza.toString() + ")";
    }

    @Override // com.google.android.gms.internal.auth.zzdh
    public final boolean zzb() {
        return true;
    }

    zzdi(Object obj) {
        this.zza = obj;
    }

    @Override // com.google.android.gms.internal.auth.zzdh
    public final Object zza() {
        return this.zza;
    }
}
