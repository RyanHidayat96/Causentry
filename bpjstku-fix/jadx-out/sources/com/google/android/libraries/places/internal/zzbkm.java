package com.google.android.libraries.places.internal;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzbkm extends zzbkq implements zzblr, zzbsq {
    public static final /* synthetic */ int zza = 0;
    private static final Logger zzb = Logger.getLogger(zzbkm.class.getName());
    private final zzbwp zzc;
    private final zzbow zzd;
    private final boolean zze;
    private zzbip zzf;
    private volatile boolean zzg;

    protected zzbkm(zzbwr zzbwrVar, zzbwg zzbwgVar, zzbwp zzbwpVar, zzbip zzbipVar, zzbfd zzbfdVar, boolean z) {
        if (zzbipVar == null) {
            throw new NullPointerException("headers");
        }
        if (zzbwpVar == null) {
            throw new NullPointerException("transportTracer");
        }
        this.zzc = zzbwpVar;
        this.zze = !Boolean.TRUE.equals(zzbfdVar.zzi(zzbpf.zzl));
        this.zzd = new zzbsr(this, zzbwrVar, zzbwgVar);
        this.zzf = zzbipVar;
    }

    @Override // com.google.android.libraries.places.internal.zzblr
    public final void zza(zzbgg zzbggVar) {
        zzbip zzbipVar = this.zzf;
        zzbil zzbilVar = zzbpf.zza;
        zzbipVar.zzd(zzbilVar);
        this.zzf.zzc(zzbilVar, Long.valueOf(Math.max(0L, zzbggVar.zzc(TimeUnit.NANOSECONDS))));
    }

    @Override // com.google.android.libraries.places.internal.zzblr
    public final void zzb(int i) {
        this.zzd.zzf(i);
    }

    @Override // com.google.android.libraries.places.internal.zzblr
    public final void zzc(int i) {
        zze().zzm(i);
    }

    @Override // com.google.android.libraries.places.internal.zzblr
    public final void zzd(zzbgj zzbgjVar) {
        zze().zzi(zzbgjVar);
    }

    protected abstract zzbkl zze();

    @Override // com.google.android.libraries.places.internal.zzblr
    public final void zzf(zzblt zzbltVar) {
        zze().zza(zzbltVar);
        zzg().zza(this.zzf, null);
        this.zzf = null;
    }

    protected abstract zzbkj zzg();

    @Override // com.google.android.libraries.places.internal.zzbsq
    public final void zzj(zzbwq zzbwqVar, boolean z, boolean z2, int i) {
        boolean z3 = true;
        if (zzbwqVar == null && !z) {
            z3 = false;
        }
        if (!z3) {
            throw new IllegalArgumentException("null frame before EOS");
        }
        zzg().zzb(zzbwqVar, z, z2, i);
    }

    @Override // com.google.android.libraries.places.internal.zzblr
    public final void zzk() {
        if (zze().zzc()) {
            return;
        }
        zze().zzj();
        zzh().zzd();
    }

    @Override // com.google.android.libraries.places.internal.zzblr
    public final void zzl(zzbjv zzbjvVar) {
        if (!(!zzbjvVar.zzj())) {
            throw new IllegalArgumentException("Should not cancel with OK status");
        }
        this.zzg = true;
        zzg().zzc(zzbjvVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbkq, com.google.android.libraries.places.internal.zzbwh
    public final boolean zzm() {
        return zzp().zzv() && !this.zzg;
    }

    @Override // com.google.android.libraries.places.internal.zzblr
    public final void zzn(zzbpl zzbplVar) {
        zzbplVar.zzb("remote_addr", zzam().zza(zzbgr.zza));
    }

    @Override // com.google.android.libraries.places.internal.zzbkq
    protected final zzbow zzh() {
        return this.zzd;
    }

    public final boolean zzi() {
        return this.zze;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzbwp zzo() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.internal.zzbkq
    protected /* synthetic */ zzbkp zzp() {
        throw null;
    }
}
