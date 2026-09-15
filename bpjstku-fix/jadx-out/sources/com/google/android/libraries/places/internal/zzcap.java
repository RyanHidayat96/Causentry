package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class zzcap extends zzcao {
    final /* synthetic */ zzcaq zza;

    protected zzcap(zzcaq zzcaqVar) {
        Objects.requireNonNull(zzcaqVar);
        this.zza = zzcaqVar;
    }

    @Override // com.google.android.libraries.places.internal.zzcao, com.google.android.libraries.places.internal.zzbhr
    public void zzb(zzbfy zzbfyVar, zzbhy zzbhyVar) {
        zzcaq zzcaqVar = this.zza;
        if (zzcaqVar.zzh() != zzbfy.SHUTDOWN) {
            zzcaqVar.zzi(zzbfyVar);
            zzcaqVar.zzj(zzbhyVar);
            zzcas zzcasVar = zzcaqVar.zza;
            if (zzcasVar.zzf) {
                return;
            }
            zzcasVar.zze();
        }
    }

    @Override // com.google.android.libraries.places.internal.zzcao
    protected final zzbhr zzf() {
        return this.zza.zza.zzk();
    }
}
