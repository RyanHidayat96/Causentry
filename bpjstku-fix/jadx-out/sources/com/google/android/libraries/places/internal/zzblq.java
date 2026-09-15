package com.google.android.libraries.places.internal;

import com.google.common.util.concurrent.DirectExecutor;
import com.google.firebase.analytics.FirebaseAnalytics;
import defpackage.registerCamera;
import java.nio.charset.Charset;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
final class zzblq extends zzbfi {
    private static final Logger zza = Logger.getLogger(zzblq.class.getName());
    private static final double zzb;
    private final zzbiu zzc;
    private final Executor zzd;
    private final boolean zze;
    private final zzblh zzf;
    private final zzbgd zzg;
    private zzblk zzh;
    private final boolean zzi;
    private zzbfd zzj;
    private zzblr zzk;
    private boolean zzl;
    private boolean zzm;
    private final ScheduledExecutorService zzn;
    private zzbgj zzo = zzbgj.zza();
    private final zzbqx zzp;

    static {
        Charset.forName("US-ASCII");
        zzb = TimeUnit.SECONDS.toNanos(1L);
    }

    zzblq(zzbiu zzbiuVar, Executor executor, zzbfd zzbfdVar, zzbqx zzbqxVar, ScheduledExecutorService scheduledExecutorService, zzblh zzblhVar, zzbhb zzbhbVar) {
        this.zzc = zzbiuVar;
        zzbiuVar.zzb();
        boolean z = true;
        if (executor == DirectExecutor.INSTANCE) {
            this.zzd = new zzbvs();
            this.zze = true;
        } else {
            this.zzd = new zzbvw(executor);
            this.zze = false;
        }
        this.zzf = zzblhVar;
        this.zzg = zzbgd.zza();
        if (zzbiuVar.zza() != zzbis.UNARY && zzbiuVar.zza() != zzbis.SERVER_STREAMING) {
            z = false;
        }
        this.zzi = z;
        this.zzj = zzbfdVar;
        this.zzp = zzbqxVar;
        this.zzn = scheduledExecutorService;
    }

    static final /* synthetic */ void zzq(zzbfh zzbfhVar, zzbjv zzbjvVar, zzbip zzbipVar) {
        try {
            zzbfhVar.zzc(zzbjvVar, zzbipVar);
        } catch (RuntimeException e2) {
            zza.logp(Level.WARNING, "io.grpc.internal.ClientCallImpl", "closeObserver", "Exception thrown by onClose() in ClientCall", (Throwable) e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzr, reason: merged with bridge method [inline-methods] */
    public final zzbgg zzg() {
        zzbgg zzbggVarZzb = this.zzj.zzb();
        if (zzbggVarZzb == null) {
            return null;
        }
        return zzbggVarZzb;
    }

    private final void zzs(Object obj) {
        zzblr zzblrVar = this.zzk;
        if (!(zzblrVar != null)) {
            throw new IllegalStateException("Not started");
        }
        if (!(!this.zzl)) {
            throw new IllegalStateException("call was cancelled");
        }
        if (!(true ^ this.zzm)) {
            throw new IllegalStateException("call was half-closed");
        }
        try {
            if (zzblrVar instanceof zzbvl) {
                ((zzbvl) zzblrVar).zzi(obj);
            } else {
                zzblrVar.zzt(this.zzc.zze(obj));
            }
            if (this.zzi) {
                return;
            }
            this.zzk.zzu();
        } catch (Error e2) {
            this.zzk.zzl(zzbjv.zzb.zze("Client sendMessage() failed with Error"));
            throw e2;
        } catch (RuntimeException e3) {
            this.zzk.zzl(zzbjv.zzb.zzd(e3).zze("Failed to stream message"));
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbfi
    public final void zza(zzbfh zzbfhVar, zzbip zzbipVar) {
        zzblr zzbqwVar;
        if (!(this.zzk == null)) {
            throw new IllegalStateException("Already started");
        }
        if (!(!this.zzl)) {
            throw new IllegalStateException("call was cancelled");
        }
        if (zzbfhVar == null) {
            throw new NullPointerException("observer");
        }
        if (zzbipVar == null) {
            throw new NullPointerException("headers");
        }
        zzbgd zzbgdVar = this.zzg;
        zzbfd zzbfdVar = this.zzj;
        zzbfc zzbfcVar = zzbsf.zza;
        zzbsf zzbsfVar = (zzbsf) zzbfdVar.zzi(zzbfcVar);
        if (zzbsfVar != null) {
            Long l = zzbsfVar.zzb;
            if (l != null) {
                zzbgg zzbggVarZza = zzbgg.zza(l.longValue(), TimeUnit.NANOSECONDS);
                zzbgg zzbggVarZzb = this.zzj.zzb();
                if (zzbggVarZzb == null || zzbggVarZza.compareTo(zzbggVarZzb) < 0) {
                    this.zzj = this.zzj.zza(zzbggVarZza);
                }
            }
            Boolean bool = zzbsfVar.zzc;
            if (bool != null) {
                this.zzj = bool.booleanValue() ? this.zzj.zzc() : this.zzj.zzd();
            }
            Integer num = zzbsfVar.zzd;
            if (num != null) {
                Integer numZzn = this.zzj.zzn();
                if (numZzn != null) {
                    this.zzj = this.zzj.zzl(Math.min(numZzn.intValue(), num.intValue()));
                } else {
                    this.zzj = this.zzj.zzl(num.intValue());
                }
            }
            Integer num2 = zzbsfVar.zze;
            if (num2 != null) {
                Integer numZzo = this.zzj.zzo();
                if (numZzo != null) {
                    this.zzj = this.zzj.zzm(Math.min(numZzo.intValue(), num2.intValue()));
                } else {
                    this.zzj = this.zzj.zzm(num2.intValue());
                }
            }
        }
        zzbft zzbftVar = zzbfs.zza;
        zzbgj zzbgjVar = this.zzo;
        zzbipVar.zzd(zzbpf.zzf);
        zzbipVar.zzd(zzbpf.zzb);
        zzbil zzbilVar = zzbpf.zzc;
        zzbipVar.zzd(zzbilVar);
        byte[] bArrZza = zzbhd.zza(zzbgjVar);
        if (bArrZza.length != 0) {
            zzbipVar.zzc(zzbilVar, bArrZza);
        }
        zzbipVar.zzd(zzbpf.zzd);
        zzbipVar.zzd(zzbpf.zze);
        zzbgg zzbggVarZzg = zzg();
        boolean z = zzbggVarZzg != null && zzbggVarZzg.equals(null);
        zzblk zzblkVar = new zzblk(this, zzbggVarZzg, z);
        this.zzh = zzblkVar;
        if (zzbggVarZzg == null || zzblkVar.zzd() > 0) {
            zzbqx zzbqxVar = this.zzp;
            zzbiu zzbiuVar = this.zzc;
            zzbfd zzbfdVar2 = this.zzj;
            zzbrx zzbrxVar = zzbqxVar.zzb;
            if (zzbrxVar.zzag()) {
                zzbsf zzbsfVar2 = (zzbsf) zzbfdVar2.zzi(zzbfcVar);
                zzbqwVar = new zzbqw(zzbqxVar, zzbiuVar, zzbipVar, zzbfdVar2, zzbsfVar2 == null ? null : zzbsfVar2.zzf, zzbsfVar2 != null ? zzbsfVar2.zzg : null, zzbgdVar);
            } else {
                zzbfp[] zzbfpVarArrZzf = zzbpf.zzf(zzbfdVar2, zzbipVar, 0, false);
                zzbgd zzbgdVarZzb = zzbgdVar.zzb();
                try {
                    zzbqwVar = zzbrxVar.zzK().zzb(zzbiuVar, zzbipVar, zzbfdVar2, zzbfpVarArrZzf);
                    zzbgdVar.zzc(zzbgdVarZzb);
                } catch (Throwable th) {
                    zzbgdVar.zzc(zzbgdVarZzb);
                    throw th;
                }
            }
            this.zzk = zzbqwVar;
        } else {
            zzbfp[] zzbfpVarArrZzf2 = zzbpf.zzf(this.zzj, zzbipVar, 0, false);
            String str = true != z ? "CallOptions" : "Context";
            Long l2 = (Long) this.zzj.zzi(zzbfp.zza);
            double dZzd = this.zzh.zzd();
            double d = zzb;
            this.zzk = new zzboo(zzbjv.zzd.zze(String.format("ClientCall started after %s deadline was exceeded %.9f seconds ago. Name resolution delay %.9f seconds.", str, Double.valueOf(dZzd / d), Double.valueOf(l2 == null ? 0.0d : l2.longValue() / d))), zzbls.PROCESSED, zzbfpVarArrZzf2);
        }
        if (this.zze) {
            this.zzk.zzr();
        }
        if (this.zzj.zzn() != null) {
            this.zzk.zzc(this.zzj.zzn().intValue());
        }
        if (this.zzj.zzo() != null) {
            this.zzk.zzb(this.zzj.zzo().intValue());
        }
        if (zzbggVarZzg != null) {
            this.zzk.zza(zzbggVarZzg);
        }
        this.zzk.zzv(zzbftVar);
        this.zzk.zzd(this.zzo);
        this.zzf.zza();
        this.zzk.zzf(new zzblp(this, zzbfhVar));
        this.zzh.zza();
    }

    @Override // com.google.android.libraries.places.internal.zzbfi
    public final void zzc(int i) {
        zzblr zzblrVar = this.zzk;
        if (!(zzblrVar != null)) {
            throw new IllegalStateException("Not started");
        }
        zzblrVar.zzs(i);
    }

    @Override // com.google.android.libraries.places.internal.zzbfi
    public final void zzd() {
        zzblr zzblrVar = this.zzk;
        if (!(zzblrVar != null)) {
            throw new IllegalStateException("Not started");
        }
        if (!(!this.zzl)) {
            throw new IllegalStateException("call was cancelled");
        }
        if (!(!this.zzm)) {
            throw new IllegalStateException("call already half-closed");
        }
        this.zzm = true;
        zzblrVar.zzk();
    }

    @Override // com.google.android.libraries.places.internal.zzbfi
    public final void zzb(Object obj) {
        zzs(obj);
    }

    @Override // com.google.android.libraries.places.internal.zzbfi
    public final void zze(String str, Throwable th) {
        if (str == null && th == null) {
            th = new CancellationException("Cancelled without a message or cause");
            zza.logp(Level.WARNING, "io.grpc.internal.ClientCallImpl", "cancelInternal", "Cancelling without a message or cause is suboptimal", th);
        }
        if (this.zzl) {
            return;
        }
        this.zzl = true;
        try {
            if (this.zzk != null) {
                zzbjv zzbjvVar = zzbjv.zzb;
                zzbjv zzbjvVarZze = str != null ? zzbjvVar.zze(str) : zzbjvVar.zze("Call cancelled without message");
                if (th != null) {
                    zzbjvVarZze = zzbjvVarZze.zzd(th);
                }
                this.zzk.zzl(zzbjvVarZze);
            }
        } finally {
            zzblk zzblkVar = this.zzh;
            if (zzblkVar != null) {
                zzblkVar.zzb();
            }
        }
    }

    public final String toString() {
        registerCamera.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = new registerCamera.TuitionPaymentFragmentbindingInflater1(getClass().getSimpleName(), (byte) 0);
        zzbiu zzbiuVar = this.zzc;
        registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = new registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
        tuitionPaymentFragmentspecialinlinedviewModeldefault2.b = zzbiuVar;
        tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = FirebaseAnalytics.Param.METHOD;
        return tuitionPaymentFragmentbindingInflater1.toString();
    }

    final zzblq zzf(zzbgj zzbgjVar) {
        this.zzo = zzbgjVar;
        return this;
    }

    final /* synthetic */ zzbiu zzi() {
        return this.zzc;
    }

    final /* synthetic */ Executor zzj() {
        return this.zzd;
    }

    final /* synthetic */ zzblh zzk() {
        return this.zzf;
    }

    final /* synthetic */ zzbgd zzl() {
        return this.zzg;
    }

    final /* synthetic */ zzblk zzm() {
        return this.zzh;
    }

    final /* synthetic */ zzbfd zzn() {
        return this.zzj;
    }

    final /* synthetic */ zzblr zzo() {
        return this.zzk;
    }

    final /* synthetic */ ScheduledExecutorService zzp() {
        return this.zzn;
    }
}
