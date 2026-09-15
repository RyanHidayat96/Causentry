package com.google.android.gms.internal.auth;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
final class zzcd extends zzda {
    private final Context zza;
    private final zzdj zzb;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzda)) {
            return false;
        }
        zzda zzdaVar = (zzda) obj;
        return this.zza.equals(zzdaVar.zza()) && this.zzb.equals(zzdaVar.zzb());
    }

    public final int hashCode() {
        return ((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode();
    }

    public final String toString() {
        return "FlagsContext{context=" + this.zza.toString() + ", hermeticFileOverrides=" + this.zzb.toString() + "}";
    }

    zzcd(Context context, zzdj zzdjVar) {
        this.zza = context;
        this.zzb = zzdjVar;
    }

    @Override // com.google.android.gms.internal.auth.zzda
    final Context zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.auth.zzda
    final zzdj zzb() {
        return this.zzb;
    }
}
