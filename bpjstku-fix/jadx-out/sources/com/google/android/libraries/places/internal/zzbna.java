package com.google.android.libraries.places.internal;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import defpackage.CameraStateRegistryCameraRegistration;
import defpackage.registerCamera;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public class zzbna extends zzbfi {
    private static final zzbfi zzj;
    private final ScheduledFuture zza;
    private final Executor zzb;
    private final zzbgd zzc;
    private volatile boolean zzd;
    private zzbfh zze;
    private zzbfi zzf;
    private zzbjv zzg;
    private List zzh = new ArrayList();
    private zzbmz zzi;

    static {
        Logger.getLogger(zzbna.class.getName());
        zzj = new zzbmt();
    }

    protected zzbna(Executor executor, ScheduledExecutorService scheduledExecutorService, zzbgg zzbggVar) {
        ScheduledFuture<?> scheduledFutureSchedule;
        if (executor == null) {
            throw new NullPointerException("callExecutor");
        }
        this.zzb = executor;
        if (scheduledExecutorService == null) {
            throw new NullPointerException("scheduler");
        }
        this.zzc = zzbgd.zza();
        if (zzbggVar == null) {
            scheduledFutureSchedule = null;
        } else {
            long jZzc = zzbggVar.zzc(TimeUnit.NANOSECONDS);
            long jAbs = Math.abs(jZzc) / TimeUnit.SECONDS.toNanos(1L);
            long jAbs2 = Math.abs(jZzc);
            long nanos = TimeUnit.SECONDS.toNanos(1L);
            StringBuilder sb = new StringBuilder();
            if (jZzc < 0) {
                sb.append("ClientCall started after CallOptions deadline was exceeded. Deadline has been exceeded for ");
            } else {
                sb.append("Deadline CallOptions will be exceeded in ");
            }
            sb.append(jAbs);
            sb.append(String.format(Locale.US, ".%09d", Long.valueOf(jAbs2 % nanos)));
            sb.append("s. ");
            scheduledFutureSchedule = scheduledExecutorService.schedule(new zzbmm(this, sb), jZzc, TimeUnit.NANOSECONDS);
        }
        this.zza = scheduledFutureSchedule;
    }

    private final void zzl(zzbjv zzbjvVar, boolean z) {
        zzbfh zzbfhVar;
        boolean z2;
        synchronized (this) {
            if (this.zzf == null) {
                zzo(zzj);
                zzbfhVar = this.zze;
                this.zzg = zzbjvVar;
                z2 = false;
            } else {
                if (z) {
                    return;
                }
                zzbfhVar = null;
                z2 = true;
            }
            if (z2) {
                zzm(new zzbmp(this, zzbjvVar));
            } else {
                if (zzbfhVar != null) {
                    this.zzb.execute(new zzbmu(this, zzbfhVar, zzbjvVar));
                }
                zzi();
            }
            zzg();
        }
    }

    private final void zzm(Runnable runnable) {
        synchronized (this) {
            if (this.zzd) {
                runnable.run();
            } else {
                this.zzh.add(runnable);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        if (r0.hasNext() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX INFO: renamed from: zzn, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzi() {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r3)
            java.util.List r1 = r3.zzh     // Catch: java.lang.Throwable -> L42
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L42
            if (r1 == 0) goto L24
            r0 = 0
            r3.zzh = r0     // Catch: java.lang.Throwable -> L42
            r0 = 1
            r3.zzd = r0     // Catch: java.lang.Throwable -> L42
            com.google.android.libraries.places.internal.zzbmz r0 = r3.zzi     // Catch: java.lang.Throwable -> L42
            monitor-exit(r3)
            if (r0 == 0) goto L23
            java.util.concurrent.Executor r1 = r3.zzb
            com.google.android.libraries.places.internal.zzbmn r2 = new com.google.android.libraries.places.internal.zzbmn
            r2.<init>(r3, r0)
            r1.execute(r2)
        L23:
            return
        L24:
            java.util.List r1 = r3.zzh     // Catch: java.lang.Throwable -> L42
            r3.zzh = r0     // Catch: java.lang.Throwable -> L42
            monitor-exit(r3)
            java.util.Iterator r0 = r1.iterator()
        L2d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3d
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L2d
        L3d:
            r1.clear()
            r0 = r1
            goto L5
        L42:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzbna.zzi():void");
    }

    private final void zzo(zzbfi zzbfiVar) {
        zzbfi zzbfiVar2 = this.zzf;
        if (!(zzbfiVar2 == null)) {
            throw new IllegalStateException(CameraStateRegistryCameraRegistration.b("realCall already set to %s", zzbfiVar2));
        }
        ScheduledFuture scheduledFuture = this.zza;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.zzf = zzbfiVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbfi
    public final void zza(zzbfh zzbfhVar, zzbip zzbipVar) {
        zzbjv zzbjvVar;
        boolean z;
        if (!(this.zze == null)) {
            throw new IllegalStateException("already started");
        }
        synchronized (this) {
            try {
                if (zzbfhVar == null) {
                    throw new NullPointerException(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                }
                this.zze = zzbfhVar;
                zzbjvVar = this.zzg;
                z = this.zzd;
                if (!z) {
                    zzbmz zzbmzVar = new zzbmz(zzbfhVar);
                    this.zzi = zzbmzVar;
                    zzbfhVar = zzbmzVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zzbjvVar != null) {
            this.zzb.execute(new zzbmu(this, zzbfhVar, zzbjvVar));
        } else if (z) {
            this.zzf.zza(zzbfhVar, zzbipVar);
        } else {
            zzm(new zzbmo(this, zzbfhVar, zzbipVar));
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbfi
    public final void zzb(Object obj) {
        if (this.zzd) {
            this.zzf.zzb(obj);
        } else {
            zzm(new zzbmq(this, obj));
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbfi
    public final void zzc(int i) {
        if (this.zzd) {
            this.zzf.zzc(i);
        } else {
            zzm(new zzbmr(this, i));
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbfi
    public final void zzd() {
        zzm(new zzbms(this));
    }

    @Override // com.google.android.libraries.places.internal.zzbfi
    public final void zze(String str, Throwable th) {
        zzbjv zzbjvVar = zzbjv.zzb;
        zzbjv zzbjvVarZze = str != null ? zzbjvVar.zze(str) : zzbjvVar.zze("Call cancelled without message");
        if (th != null) {
            zzbjvVarZze = zzbjvVarZze.zzd(th);
        }
        zzl(zzbjvVarZze, false);
    }

    public final Runnable zzf(zzbfi zzbfiVar) {
        synchronized (this) {
            if (this.zzf != null) {
                return null;
            }
            if (zzbfiVar == null) {
                throw new NullPointerException(NotificationCompat.CATEGORY_CALL);
            }
            zzo(zzbfiVar);
            return new zzbml(this, this.zzc);
        }
    }

    protected void zzg() {
    }

    public final String toString() {
        registerCamera.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = new registerCamera.TuitionPaymentFragmentbindingInflater1(getClass().getSimpleName(), (byte) 0);
        zzbfi zzbfiVar = this.zzf;
        registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = new registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
        tuitionPaymentFragmentspecialinlinedviewModeldefault2.b = zzbfiVar;
        tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "realCall";
        return tuitionPaymentFragmentbindingInflater1.toString();
    }

    final /* synthetic */ void zzh(zzbjv zzbjvVar, boolean z) {
        zzl(zzbjvVar, true);
    }

    final /* synthetic */ zzbgd zzj() {
        return this.zzc;
    }

    final /* synthetic */ zzbfi zzk() {
        return this.zzf;
    }
}
