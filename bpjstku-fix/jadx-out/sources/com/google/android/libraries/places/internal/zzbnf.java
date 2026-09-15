package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzbnf extends zzbnz {
    final /* synthetic */ zzbnh zza;
    private final zzbhu zzb;
    private final zzbgd zzc;
    private final zzbfp[] zzd;
    private volatile zzbjv zze;

    /* synthetic */ zzbnf(zzbnh zzbnhVar, zzbhu zzbhuVar, zzbfp[] zzbfpVarArr, byte[] bArr) {
        Objects.requireNonNull(zzbnhVar);
        this.zza = zzbnhVar;
        this.zzc = zzbgd.zza();
        this.zzb = zzbhuVar;
        this.zzd = zzbfpVarArr;
    }

    @Override // com.google.android.libraries.places.internal.zzbnz
    protected final void zze(zzbjv zzbjvVar) {
        int i = 0;
        while (true) {
            zzbfp[] zzbfpVarArr = this.zzd;
            if (i >= zzbfpVarArr.length) {
                return;
            }
            zzbfp zzbfpVar = zzbfpVarArr[i];
            i++;
        }
    }

    final /* synthetic */ Runnable zzg(zzblu zzbluVar, String str) {
        zzbgd zzbgdVarZzb = this.zzc.zzb();
        try {
            zzbhu zzbhuVar = this.zzb;
            zzblr zzblrVarZzb = zzbluVar.zzb(zzbhuVar.zzc(), zzbhuVar.zzb(), zzbhuVar.zza(), this.zzd);
            return zzo(zzblrVarZzb);
        } finally {
            this.zzc.zzc(zzbgdVarZzb);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbnz, com.google.android.libraries.places.internal.zzblr
    public final void zzl(zzbjv zzbjvVar) {
        super.zzl(zzbjvVar);
        zzbnh zzbnhVar = this.zza;
        synchronized (zzbnhVar.zzh()) {
            if (zzbnhVar.zzk() != null) {
                boolean zRemove = zzbnhVar.zzn().remove(this);
                if (!zzbnhVar.zzf() && zRemove) {
                    zzbnhVar.zzi().zzb(zzbnhVar.zzj());
                    if (zzbnhVar.zzo().zzb != null) {
                        zzbnhVar.zzi().zzb(zzbnhVar.zzk());
                        zzbnhVar.zzl(null);
                    }
                }
            }
        }
        this.zza.zzi().zza();
    }

    @Override // com.google.android.libraries.places.internal.zzbnz, com.google.android.libraries.places.internal.zzblr
    public final void zzn(zzbpl zzbplVar) {
        if (this.zzb.zza().zzk()) {
            zzbplVar.zza("wait_for_ready");
            zzbjv zzbjvVar = this.zze;
            if (zzbjvVar != null && !zzbjvVar.zzj()) {
                zzbplVar.zzb("Last Pick Failure", zzbjvVar);
            }
        }
        super.zzn(zzbplVar);
    }

    final /* synthetic */ zzbhu zzh() {
        return this.zzb;
    }

    final /* synthetic */ zzbfp[] zzi() {
        return this.zzd;
    }

    final /* synthetic */ void zzj(zzbjv zzbjvVar) {
        this.zze = zzbjvVar;
    }
}
