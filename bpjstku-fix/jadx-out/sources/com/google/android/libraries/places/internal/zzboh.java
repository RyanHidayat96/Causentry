package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.util.Collections;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
final class zzboh implements Runnable {
    final /* synthetic */ zzbok zza;
    private final zzbjb zzb;

    zzboh(zzbok zzbokVar, zzbjb zzbjbVar) {
        Objects.requireNonNull(zzbokVar);
        this.zza = zzbokVar;
        if (zzbjbVar == null) {
            throw new NullPointerException("savedListener");
        }
        this.zzb = zzbjbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        if (zzbok.zzg.isLoggable(Level.FINER)) {
            zzbok.zzg.logp(Level.FINER, "io.grpc.internal.DnsNameResolver$Resolve", "run", "Attempting DNS resolution of ".concat(String.valueOf(this.zza.zzh())));
        }
        final zzbob zzbobVarZze = null;
        try {
            try {
                zzbok zzbokVar = this.zza;
                zzbgl zzbglVarZzf = zzbokVar.zzf();
                final zzbjc zzbjcVarZza = zzbjd.zza();
                if (zzbglVarZzf != null) {
                    if (zzbok.zzg.isLoggable(Level.FINER)) {
                        Logger logger = zzbok.zzg;
                        Level level = Level.FINER;
                        String string = zzbglVarZzf.toString();
                        StringBuilder sb = new StringBuilder(string.length() + 20);
                        sb.append("Using proxy address ");
                        sb.append(string);
                        logger.logp(level, "io.grpc.internal.DnsNameResolver$Resolve", "run", sb.toString());
                    }
                    zzbjcVarZza.zza(zzbjx.zza(Collections.singletonList(zzbglVarZzf)));
                } else {
                    zzbobVarZze = zzbokVar.zze(false);
                    if (zzbobVarZze.zza() != null) {
                        zzbkd zzbkdVarZzj = zzbokVar.zzj();
                        zzbkdVarZzj.zzb(new Runnable() { // from class: com.google.android.libraries.places.internal.zzbof
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() throws Throwable {
                                this.zza.zzc(zzbobVarZze);
                            }
                        });
                        zzbkdVarZzj.zza();
                        z = zzbobVarZze.zza() == null;
                        zzbkd zzbkdVarZzj2 = zzbokVar.zzj();
                        zzbkdVarZzj2.zzb(new zzbod(this, z));
                        zzbkdVarZzj2.zza();
                        return;
                    }
                    if (zzbobVarZze.zzc() != null) {
                        zzbjcVarZza.zza(zzbjx.zza(zzbobVarZze.zzc()));
                    }
                    if (zzbobVarZze.zze() != null) {
                        zzbjcVarZza.zzb(zzbobVarZze.zze());
                    }
                }
                zzbkd zzbkdVarZzj3 = zzbokVar.zzj();
                zzbkdVarZzj3.zzb(new Runnable() { // from class: com.google.android.libraries.places.internal.zzboe
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzb(zzbjcVarZza);
                    }
                });
                zzbkdVarZzj3.zza();
            } catch (IOException e2) {
                zzbkd zzbkdVarZzj4 = this.zza.zzj();
                zzbkdVarZzj4.zzb(new Runnable() { // from class: com.google.android.libraries.places.internal.zzbog
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() throws Throwable {
                        this.zza.zza(e2);
                    }
                });
                zzbkdVarZzj4.zza();
            }
            z = zzbobVarZze != null && zzbobVarZze.zza() == null;
            zzbok zzbokVar2 = this.zza;
            zzbod zzbodVar = new zzbod(this, z);
            zzbkd zzbkdVarZzj5 = zzbokVar2.zzj();
            zzbkdVarZzj5.zzb(zzbodVar);
            zzbkdVarZzj5.zza();
        } catch (Throwable th) {
            z = 0 != 0 && zzbobVarZze.zza() == null;
            zzbok zzbokVar3 = this.zza;
            zzbod zzbodVar2 = new zzbod(this, z);
            zzbkd zzbkdVarZzj6 = zzbokVar3.zzj();
            zzbkdVarZzj6.zzb(zzbodVar2);
            zzbkdVarZzj6.zza();
            throw th;
        }
    }

    final /* synthetic */ void zza(IOException iOException) throws Throwable {
        String strZzh = this.zza.zzh();
        zzbjc zzbjcVarZza = zzbjd.zza();
        zzbjcVarZza.zza(zzbjx.zzb(zzbjv.zzi.zze("Unable to resolve host ".concat(String.valueOf(strZzh))).zzd(iOException)));
        this.zzb.zza(zzbjcVarZza.zzc());
    }

    final /* synthetic */ void zzb(zzbjc zzbjcVar) {
        this.zzb.zza(zzbjcVar.zzc());
    }

    final /* synthetic */ void zzc(zzbob zzbobVar) throws Throwable {
        zzbjv zzbjvVarZza = zzbobVar.zza();
        zzbjc zzbjcVarZza = zzbjd.zza();
        zzbjcVarZza.zza(zzbjx.zzb(zzbjvVarZza));
        this.zzb.zza(zzbjcVarZza.zzc());
    }
}
