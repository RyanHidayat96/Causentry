package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzbws extends zzbww {
    final /* synthetic */ zzbwx zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbws(zzbwx zzbwxVar) {
        super(zzbwxVar, null);
        Objects.requireNonNull(zzbwxVar);
        this.zza = zzbwxVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbww
    public final void zza() throws IOException {
        int iZzm;
        zzcbj zzcbjVar = new zzcbj();
        zzbwx zzbwxVar = this.zza;
        synchronized (zzbwxVar.zzd()) {
            zzcbjVar.zzc(zzbwxVar.zze(), zzbwxVar.zze().zzi());
            zzbwxVar.zzg(false);
            iZzm = zzbwxVar.zzm();
        }
        zzbwx zzbwxVar2 = this.zza;
        zzbwxVar2.zzi().zzc(zzcbjVar, zzcbjVar.zzb());
        synchronized (zzbwxVar2.zzd()) {
            zzbwxVar2.zzn(zzbwxVar2.zzm() - iZzm);
        }
    }
}
