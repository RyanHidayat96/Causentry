package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzbut extends zzbfp {
    long zzb;
    final /* synthetic */ zzbvl zzc;
    private final zzbvj zzd;

    zzbut(zzbvl zzbvlVar, zzbvj zzbvjVar) {
        Objects.requireNonNull(zzbvlVar);
        this.zzc = zzbvlVar;
        this.zzd = zzbvjVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbjz
    public final void zza(long j) {
        zzbvl zzbvlVar = this.zzc;
        if (zzbvlVar.zzQ().zzf == null) {
            synchronized (zzbvlVar.zzK()) {
                if (zzbvlVar.zzQ().zzf == null) {
                    zzbvj zzbvjVar = this.zzd;
                    if (!zzbvjVar.zzb) {
                        long j2 = this.zzb + j;
                        this.zzb = j2;
                        if (j2 <= zzbvlVar.zzW()) {
                            return;
                        }
                        if (j2 > zzbvlVar.zzM()) {
                            zzbvjVar.zzc = true;
                        } else {
                            long jZza = zzbvlVar.zzL().zza(j2 - zzbvlVar.zzW());
                            zzbvlVar.zzX(this.zzb);
                            if (jZza > zzbvlVar.zzN()) {
                                zzbvjVar.zzc = true;
                            }
                        }
                        Runnable runnableZzo = zzbvjVar.zzc ? zzbvlVar.zzo(zzbvjVar) : null;
                        if (runnableZzo != null) {
                            runnableZzo.run();
                        }
                    }
                }
            }
        }
    }
}
