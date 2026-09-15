package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzbwu implements Runnable {
    final /* synthetic */ zzbwx zza;

    zzbwu(zzbwx zzbwxVar) {
        Objects.requireNonNull(zzbwxVar);
        this.zza = zzbwxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            zzbwx zzbwxVar = this.zza;
            if (zzbwxVar.zzi() != null && zzbwxVar.zze().zzb() > 0) {
                zzbwxVar.zzi().zzc(zzbwxVar.zze(), zzbwxVar.zze().zzb());
            }
        } catch (IOException e2) {
            this.zza.zzf().zzg(e2);
        }
        try {
            zzbwx zzbwxVar2 = this.zza;
            if (zzbwxVar2.zzi() != null) {
                zzbwxVar2.zzi().close();
            }
        } catch (IOException e3) {
            this.zza.zzf().zzg(e3);
        }
        try {
            zzbwx zzbwxVar3 = this.zza;
            if (zzbwxVar3.zzj() != null) {
                zzbwxVar3.zzj().close();
            }
        } catch (IOException e4) {
            this.zza.zzf().zzg(e4);
        }
    }
}
