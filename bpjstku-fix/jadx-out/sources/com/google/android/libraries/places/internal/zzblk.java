package com.google.android.libraries.places.internal;

import com.google.common.util.concurrent.DirectExecutor;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
final class zzblk implements Runnable, zzbga {
    final /* synthetic */ zzblq zza;
    private final boolean zzb;
    private final boolean zzc;
    private final long zzd;
    private volatile ScheduledFuture zze;
    private volatile boolean zzf;

    zzblk(zzblq zzblqVar, zzbgg zzbggVar, boolean z) {
        Objects.requireNonNull(zzblqVar);
        this.zza = zzblqVar;
        this.zzb = z;
        if (zzbggVar == null) {
            this.zzc = false;
            this.zzd = 0L;
        } else {
            this.zzc = true;
            this.zzd = zzbggVar.zzc(TimeUnit.NANOSECONDS);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzo().zzl(zzc());
    }

    final void zza() {
        if (this.zzf) {
            return;
        }
        if (this.zzc && !this.zzb) {
            zzblq zzblqVar = this.zza;
            if (zzblqVar.zzp() != null) {
                this.zze = zzblqVar.zzp().schedule(new zzbql(this), this.zzd, TimeUnit.NANOSECONDS);
            }
        }
        zzblq zzblqVar2 = this.zza;
        zzblqVar2.zzl().zzd(this, DirectExecutor.INSTANCE);
        if (this.zzf) {
            zzb();
        }
    }

    final void zzb() {
        this.zzf = true;
        ScheduledFuture scheduledFuture = this.zze;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    final zzbjv zzc() {
        long j = this.zzd;
        long jAbs = Math.abs(j) / TimeUnit.SECONDS.toNanos(1L);
        long jAbs2 = Math.abs(j);
        long nanos = TimeUnit.SECONDS.toNanos(1L);
        StringBuilder sb = new StringBuilder();
        sb.append(true != this.zzb ? "CallOptions" : "Context");
        sb.append(" deadline exceeded after ");
        if (j < 0) {
            sb.append('-');
        }
        sb.append(jAbs);
        sb.append(String.format(Locale.US, ".%09d", Long.valueOf(jAbs2 % nanos)));
        sb.append("s. ");
        zzblq zzblqVar = this.zza;
        Long l = (Long) zzblqVar.zzn().zzi(zzbfp.zza);
        sb.append(String.format(Locale.US, "Name resolution delay %.9f seconds.", Double.valueOf(l == null ? 0.0d : l.longValue() / zzblq.zzb)));
        if (zzblqVar.zzo() != null) {
            zzbpl zzbplVar = new zzbpl();
            zzblqVar.zzo().zzn(zzbplVar);
            sb.append(" ");
            sb.append(zzbplVar);
        }
        return zzbjv.zzd.zze(sb.toString());
    }

    final /* synthetic */ long zzd() {
        return this.zzd;
    }
}
