package com.google.android.libraries.places.internal;

import java.io.InputStream;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzblm extends zzbmj {
    final /* synthetic */ zzbwi zza;
    final /* synthetic */ zzblp zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzblm(zzblp zzblpVar, zzcaz zzcazVar, zzbwi zzbwiVar) {
        super(zzblpVar.zza.zzl());
        this.zza = zzbwiVar;
        Objects.requireNonNull(zzblpVar);
        this.zzb = zzblpVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbmj
    public final void zza() {
        zzblp zzblpVar = this.zzb;
        zzblq zzblqVar = zzblpVar.zza;
        if (zzblpVar.zzg() != null) {
            zzbpf.zzg(this.zza);
            return;
        }
        while (true) {
            try {
                InputStream inputStreamZza = this.zza.zza();
                if (inputStreamZza == null) {
                    return;
                }
                try {
                    zzblpVar.zzf().zzb(zzblqVar.zzi().zzd(inputStreamZza));
                    inputStreamZza.close();
                } catch (Throwable th) {
                    zzbpf.zzh(inputStreamZza);
                    throw th;
                }
            } catch (Throwable th2) {
                zzbpf.zzg(this.zza);
                this.zzb.zze(zzbjv.zzb.zzd(th2).zze("Failed to read message."));
                return;
            }
        }
    }
}
