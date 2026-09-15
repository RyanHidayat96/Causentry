package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
final class zzbth {
    private final zzbhx zza;
    private zzbfy zzb;
    private boolean zzc = false;
    private zzbfz zzd = zzbfz.zza(zzbfy.IDLE);

    public zzbth(zzbhx zzbhxVar, zzbfy zzbfyVar) {
        this.zza = zzbhxVar;
        this.zzb = zzbfyVar;
    }

    final /* synthetic */ zzbfy zze() {
        return this.zzd.zzc();
    }

    public final zzbhx zza() {
        return this.zza;
    }

    public final zzbfy zzb() {
        return this.zzb;
    }

    public final boolean zzc() {
        return this.zzc;
    }

    final /* synthetic */ void zzd(zzbfy zzbfyVar) {
        boolean z;
        this.zzb = zzbfyVar;
        if (zzbfyVar == zzbfy.READY || zzbfyVar == zzbfy.TRANSIENT_FAILURE) {
            z = true;
        } else if (zzbfyVar != zzbfy.IDLE) {
            return;
        } else {
            z = false;
        }
        this.zzc = z;
    }

    final /* synthetic */ zzbhx zzf() {
        return this.zza;
    }

    final /* synthetic */ zzbfy zzg() {
        return this.zzb;
    }

    final /* synthetic */ zzbfz zzh() {
        return this.zzd;
    }

    final /* synthetic */ void zzi(zzbfz zzbfzVar) {
        this.zzd = zzbfzVar;
    }
}
