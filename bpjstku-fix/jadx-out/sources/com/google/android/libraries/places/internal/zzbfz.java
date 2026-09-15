package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbfz {
    private final zzbfy zza;
    private final zzbjv zzb;

    private zzbfz(zzbfy zzbfyVar, zzbjv zzbjvVar) {
        if (zzbfyVar == null) {
            throw new NullPointerException("state is null");
        }
        this.zza = zzbfyVar;
        if (zzbjvVar == null) {
            throw new NullPointerException("status is null");
        }
        this.zzb = zzbjvVar;
    }

    public static zzbfz zza(zzbfy zzbfyVar) {
        if (zzbfyVar != zzbfy.TRANSIENT_FAILURE) {
            return new zzbfz(zzbfyVar, zzbjv.zza);
        }
        throw new IllegalArgumentException("state is TRANSIENT_ERROR. Use forError() instead");
    }

    public static zzbfz zzb(zzbjv zzbjvVar) {
        if (!zzbjvVar.zzj()) {
            return new zzbfz(zzbfy.TRANSIENT_FAILURE, zzbjvVar);
        }
        throw new IllegalArgumentException("The error status must not be OK");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbfz)) {
            return false;
        }
        zzbfz zzbfzVar = (zzbfz) obj;
        return this.zza.equals(zzbfzVar.zza) && this.zzb.equals(zzbfzVar.zzb);
    }

    public final int hashCode() {
        zzbjv zzbjvVar = this.zzb;
        return zzbjvVar.hashCode() ^ this.zza.hashCode();
    }

    public final String toString() {
        zzbjv zzbjvVar = this.zzb;
        if (zzbjvVar.zzj()) {
            return this.zza.toString();
        }
        String strValueOf = String.valueOf(this.zza);
        String strValueOf2 = String.valueOf(zzbjvVar);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 1 + String.valueOf(strValueOf2).length() + 1);
        sb.append(strValueOf);
        sb.append("(");
        sb.append(strValueOf2);
        sb.append(")");
        return sb.toString();
    }

    public final zzbfy zzc() {
        return this.zza;
    }

    public final zzbjv zzd() {
        return this.zzb;
    }
}
