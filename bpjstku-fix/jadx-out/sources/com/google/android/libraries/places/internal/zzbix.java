package com.google.android.libraries.places.internal;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbix {
    private Integer zza;
    private zzbjn zzb;
    private zzbkd zzc;
    private zzbje zzd;
    private ScheduledExecutorService zze;
    private zzbfg zzf;
    private Executor zzg;
    private zzbiw zzh;
    private zzbjj zzi;

    public final zzbix zza(int i) {
        this.zza = 443;
        return this;
    }

    public final zzbix zzb(zzbjn zzbjnVar) {
        this.zzb = zzbjnVar;
        return this;
    }

    public final zzbix zzc(zzbkd zzbkdVar) {
        this.zzc = zzbkdVar;
        return this;
    }

    public final zzbix zzd(ScheduledExecutorService scheduledExecutorService) {
        this.zze = scheduledExecutorService;
        return this;
    }

    public final zzbix zze(zzbje zzbjeVar) {
        this.zzd = zzbjeVar;
        return this;
    }

    public final zzbix zzf(zzbfg zzbfgVar) {
        this.zzf = zzbfgVar;
        return this;
    }

    public final zzbiy zzj() {
        return new zzbiy(this, null);
    }

    zzbix() {
    }

    public final zzbix zzg(Executor executor) {
        this.zzg = executor;
        return this;
    }

    public final zzbix zzh(zzbiw zzbiwVar) {
        this.zzh = zzbiwVar;
        return this;
    }

    public final zzbix zzi(zzbjj zzbjjVar) {
        this.zzi = zzbjjVar;
        return this;
    }

    final /* synthetic */ Integer zzk() {
        return this.zza;
    }

    final /* synthetic */ zzbjn zzl() {
        return this.zzb;
    }

    final /* synthetic */ zzbkd zzm() {
        return this.zzc;
    }

    final /* synthetic */ zzbje zzn() {
        return this.zzd;
    }

    final /* synthetic */ ScheduledExecutorService zzo() {
        return this.zze;
    }

    final /* synthetic */ zzbfg zzp() {
        return this.zzf;
    }

    final /* synthetic */ Executor zzq() {
        return this.zzg;
    }

    final /* synthetic */ zzbiw zzr() {
        return this.zzh;
    }

    final /* synthetic */ zzbjj zzs() {
        return this.zzi;
    }
}
