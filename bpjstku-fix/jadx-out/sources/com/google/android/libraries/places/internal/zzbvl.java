package com.google.android.libraries.places.internal;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
abstract class zzbvl implements zzblr {
    private long zzA;
    private zzbjv zzB;
    private boolean zzC;
    private final zzbiu zzb;
    private final Executor zzc;
    private final ScheduledExecutorService zzg;
    private final zzbip zzh;
    private final zzbvm zzi;
    private final zzbpg zzj;
    private final boolean zzk;
    private final zzbuu zzm;
    private final long zzn;
    private final long zzo;
    private final zzbvk zzp;
    private zzbuy zzv;
    private long zzw;
    private zzblt zzx;
    private zzbuv zzy;
    private zzbuv zzz;
    static final zzbil zze = zzbil.zzc("grpc-previous-rpc-attempts", zzbip.zza);
    static final zzbil zzf = zzbil.zzc("grpc-retry-pushback-ms", zzbip.zza);
    private static final zzbjv zza = zzbjv.zzb.zze("Stream thrown away because RetriableStream committed");
    private static final Random zzD = new Random();
    private static final boolean zzE = zzbpf.zzj("GRPC_EXPERIMENTAL_XDS_RLS_LB", true);
    private final Executor zzd = new zzbkd(new zzbuc(this));
    private final Object zzl = new Object();
    private final zzbpl zzq = new zzbpl();
    private volatile zzbva zzr = new zzbva(new ArrayList(8), Collections.emptyList(), null, null, false, false, false, 0);
    private final AtomicBoolean zzs = new AtomicBoolean();
    private final AtomicInteger zzt = new AtomicInteger();
    private final AtomicInteger zzu = new AtomicInteger();

    zzbvl(zzbiu zzbiuVar, zzbip zzbipVar, zzbuu zzbuuVar, long j, long j2, Executor executor, ScheduledExecutorService scheduledExecutorService, zzbvm zzbvmVar, zzbpg zzbpgVar, zzbvk zzbvkVar) {
        this.zzb = zzbiuVar;
        this.zzm = zzbuuVar;
        this.zzn = j;
        this.zzo = j2;
        this.zzc = executor;
        this.zzg = scheduledExecutorService;
        this.zzh = zzbipVar;
        this.zzi = zzbvmVar;
        if (zzbvmVar != null) {
            this.zzA = zzbvmVar.zzb;
        }
        this.zzj = zzbpgVar;
        if (!(zzbvmVar == null || zzbpgVar == null)) {
            throw new IllegalArgumentException("Should not provide both retryPolicy and hedgingPolicy");
        }
        this.zzk = zzbpgVar != null;
        this.zzp = zzbvkVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzaf, reason: merged with bridge method [inline-methods] */
    public final Runnable zzo(zzbvj zzbvjVar) {
        List list;
        Collection collectionEmptyList;
        boolean z;
        Future future;
        Future futureZzb;
        synchronized (this.zzl) {
            if (this.zzr.zzf != null) {
                return null;
            }
            Collection collection = this.zzr.zzc;
            zzbva zzbvaVar = this.zzr;
            if (!(zzbvaVar.zzf == null)) {
                throw new IllegalStateException("Already committed");
            }
            List list2 = zzbvaVar.zzb;
            if (zzbvaVar.zzc.contains(zzbvjVar)) {
                list = null;
                collectionEmptyList = Collections.singleton(zzbvjVar);
                z = true;
            } else {
                list = list2;
                collectionEmptyList = Collections.emptyList();
                z = false;
            }
            this.zzr = new zzbva(list, collectionEmptyList, zzbvaVar.zzd, zzbvjVar, zzbvaVar.zzg, z, zzbvaVar.zzh, zzbvaVar.zze);
            this.zzm.zza(-this.zzw);
            zzbuv zzbuvVar = this.zzy;
            boolean z2 = zzbuvVar != null ? zzbuvVar.zzc : false;
            if (zzbuvVar != null) {
                Future futureZzb2 = zzbuvVar.zzb();
                this.zzy = null;
                future = futureZzb2;
            } else {
                future = null;
            }
            zzbuv zzbuvVar2 = this.zzz;
            if (zzbuvVar2 != null) {
                futureZzb = zzbuvVar2.zzb();
                this.zzz = null;
            } else {
                futureZzb = null;
            }
            return new zzbue(this, collection, zzbvjVar, future, z2, futureZzb);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzag, reason: merged with bridge method [inline-methods] */
    public final zzbvj zzq(int i, boolean z) {
        AtomicInteger atomicInteger;
        int i2;
        do {
            atomicInteger = this.zzu;
            i2 = atomicInteger.get();
            if (i2 < 0) {
                return null;
            }
        } while (!atomicInteger.compareAndSet(i2, i2 + 1));
        zzbvj zzbvjVar = new zzbvj(i);
        zzbup zzbupVar = new zzbup(this, new zzbut(this, zzbvjVar));
        zzbip zzbipVar = this.zzh;
        zzbip zzbipVar2 = new zzbip();
        zzbipVar2.zzf(zzbipVar);
        if (i > 0) {
            zzbipVar2.zzc(zze, String.valueOf(i));
        }
        zzbvjVar.zza = zzh(zzbipVar2, zzbupVar, i, z);
        return zzbvjVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0085, code lost:
    
        r2 = r3.size();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008a, code lost:
    
        if (r5 >= r2) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008c, code lost:
    
        r7 = (com.google.android.libraries.places.internal.zzbus) r3.get(r5);
        r7.zza(r10);
        r4 = r4 | (r7 instanceof com.google.android.libraries.places.internal.zzbuz);
        r7 = r9.zzr;
        r8 = r7.zzf;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x009c, code lost:
    
        if (r8 == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x009e, code lost:
    
        if (r8 != r10) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a0, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a4, code lost:
    
        if (r7.zzg == false) goto L63;
     */
    /* JADX INFO: renamed from: zzah, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzx(com.google.android.libraries.places.internal.zzbvj r10) {
        /*
            r9 = this;
            r0 = 0
            r1 = 0
            r2 = r0
            r4 = r2
            r3 = r1
        L5:
            java.lang.Object r5 = r9.zzl
            monitor-enter(r5)
            com.google.android.libraries.places.internal.zzbva r6 = r9.zzr     // Catch: java.lang.Throwable -> La9
            com.google.android.libraries.places.internal.zzbvj r7 = r6.zzf     // Catch: java.lang.Throwable -> La9
            if (r7 == 0) goto L12
            if (r7 == r10) goto L12
            monitor-exit(r5)
            goto L34
        L12:
            boolean r7 = r6.zzg     // Catch: java.lang.Throwable -> La9
            if (r7 == 0) goto L18
            monitor-exit(r5)
            goto L34
        L18:
            java.util.List r7 = r6.zzb     // Catch: java.lang.Throwable -> La9
            int r8 = r7.size()     // Catch: java.lang.Throwable -> La9
            if (r2 != r8) goto L5e
            com.google.android.libraries.places.internal.zzbva r0 = r6.zza(r10)     // Catch: java.lang.Throwable -> La9
            r9.zzr = r0     // Catch: java.lang.Throwable -> La9
            boolean r0 = r9.zzm()     // Catch: java.lang.Throwable -> La9
            if (r0 != 0) goto L2e
            monitor-exit(r5)
            return
        L2e:
            com.google.android.libraries.places.internal.zzbuq r1 = new com.google.android.libraries.places.internal.zzbuq     // Catch: java.lang.Throwable -> La9
            r1.<init>(r9)     // Catch: java.lang.Throwable -> La9
            monitor-exit(r5)
        L34:
            if (r1 == 0) goto L41
            java.util.concurrent.Executor r10 = r9.zzd
            com.google.android.libraries.places.internal.zzbkd r10 = (com.google.android.libraries.places.internal.zzbkd) r10
            r10.zzb(r1)
            r10.zza()
            return
        L41:
            if (r4 != 0) goto L4d
            com.google.android.libraries.places.internal.zzblr r0 = r10.zza
            com.google.android.libraries.places.internal.zzbvi r1 = new com.google.android.libraries.places.internal.zzbvi
            r1.<init>(r9, r10)
            r0.zzf(r1)
        L4d:
            com.google.android.libraries.places.internal.zzblr r0 = r10.zza
            com.google.android.libraries.places.internal.zzbva r1 = r9.zzr
            com.google.android.libraries.places.internal.zzbvj r1 = r1.zzf
            if (r1 != r10) goto L58
            com.google.android.libraries.places.internal.zzbjv r10 = r9.zzB
            goto L5a
        L58:
            com.google.android.libraries.places.internal.zzbjv r10 = com.google.android.libraries.places.internal.zzbvl.zza
        L5a:
            r0.zzl(r10)
            return
        L5e:
            boolean r6 = r10.zzb     // Catch: java.lang.Throwable -> La9
            if (r6 == 0) goto L64
            monitor-exit(r5)
            return
        L64:
            int r6 = r2 + 128
            int r8 = r7.size()     // Catch: java.lang.Throwable -> La9
            int r6 = java.lang.Math.min(r6, r8)     // Catch: java.lang.Throwable -> La9
            if (r3 != 0) goto L7a
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> La9
            java.util.List r2 = r7.subList(r2, r6)     // Catch: java.lang.Throwable -> La9
            r3.<init>(r2)     // Catch: java.lang.Throwable -> La9
            goto L84
        L7a:
            r3.clear()     // Catch: java.lang.Throwable -> La9
            java.util.List r2 = r7.subList(r2, r6)     // Catch: java.lang.Throwable -> La9
            r3.addAll(r2)     // Catch: java.lang.Throwable -> La9
        L84:
            monitor-exit(r5)
            int r2 = r3.size()
            r5 = r0
        L8a:
            if (r5 >= r2) goto La6
            java.lang.Object r7 = r3.get(r5)
            com.google.android.libraries.places.internal.zzbus r7 = (com.google.android.libraries.places.internal.zzbus) r7
            r7.zza(r10)
            boolean r7 = r7 instanceof com.google.android.libraries.places.internal.zzbuz
            r4 = r4 | r7
            com.google.android.libraries.places.internal.zzbva r7 = r9.zzr
            com.google.android.libraries.places.internal.zzbvj r8 = r7.zzf
            if (r8 == 0) goto La0
            if (r8 != r10) goto La6
        La0:
            boolean r7 = r7.zzg
            int r5 = r5 + 1
            if (r7 == 0) goto L8a
        La6:
            r2 = r6
            goto L5
        La9:
            r10 = move-exception
            monitor-exit(r5)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzbvl.zzx(com.google.android.libraries.places.internal.zzbvj):void");
    }

    private final void zzai(zzbus zzbusVar) {
        Collection collection;
        synchronized (this.zzl) {
            if (!this.zzr.zza) {
                this.zzr.zzb.add(zzbusVar);
            }
            collection = this.zzr.zzc;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zzbusVar.zza((zzbvj) it.next());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzaj, reason: merged with bridge method [inline-methods] */
    public final boolean zzz(zzbva zzbvaVar) {
        return zzbvaVar.zzf == null && zzbvaVar.zze < this.zzj.zza && !zzbvaVar.zzh;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzak, reason: merged with bridge method [inline-methods] */
    public final void zzA() {
        Future future;
        synchronized (this.zzl) {
            zzbuv zzbuvVar = this.zzz;
            future = null;
            if (zzbuvVar != null) {
                Future futureZzb = zzbuvVar.zzb();
                this.zzz = null;
                future = futureZzb;
            }
            this.zzr = this.zzr.zzb();
        }
        if (future != null) {
            future.cancel(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzal, reason: merged with bridge method [inline-methods] */
    public final void zzB(zzbjv zzbjvVar, zzbls zzblsVar, zzbip zzbipVar) {
        this.zzv = new zzbuy(zzbjvVar, zzblsVar, zzbipVar);
        if (this.zzu.addAndGet(Integer.MIN_VALUE) == Integer.MIN_VALUE) {
            zzbkd zzbkdVar = (zzbkd) this.zzd;
            zzbkdVar.zzb(new zzbur(this, zzbjvVar, zzblsVar, zzbipVar));
            zzbkdVar.zza();
        }
    }

    public static long zzj(long j) {
        return (long) (j * (zzE ? (zzD.nextDouble() * 0.8d) + 0.4d : zzD.nextDouble()));
    }

    @Override // com.google.android.libraries.places.internal.zzblr
    public final void zza(zzbgg zzbggVar) {
        zzai(new zzbug(this, zzbggVar));
    }

    @Override // com.google.android.libraries.places.internal.zzblr
    public final void zzb(int i) {
        zzai(new zzbul(this, i));
    }

    @Override // com.google.android.libraries.places.internal.zzblr
    public final void zzc(int i) {
        zzai(new zzbuk(this, i));
    }

    @Override // com.google.android.libraries.places.internal.zzblr
    public final void zzd(zzbgj zzbgjVar) {
        zzai(new zzbuh(this, zzbgjVar));
    }

    abstract zzbjv zze();

    @Override // com.google.android.libraries.places.internal.zzblr
    public final void zzf(zzblt zzbltVar) {
        zzbuv zzbuvVar;
        zzbvk zzbvkVar;
        this.zzx = zzbltVar;
        zzbjv zzbjvVarZze = zze();
        if (zzbjvVarZze != null) {
            zzl(zzbjvVarZze);
            return;
        }
        synchronized (this.zzl) {
            this.zzr.zzb.add(new zzbuz(this));
        }
        zzbvj zzbvjVarZzq = zzq(0, false);
        if (zzbvjVarZzq == null) {
            return;
        }
        if (this.zzk) {
            Object obj = this.zzl;
            synchronized (obj) {
                this.zzr = this.zzr.zzc(zzbvjVarZzq);
                zzbuvVar = null;
                if (zzz(this.zzr) && ((zzbvkVar = this.zzp) == null || zzbvkVar.zza())) {
                    zzbuvVar = new zzbuv(obj);
                    this.zzz = zzbuvVar;
                }
            }
            if (zzbuvVar != null) {
                zzbuvVar.zza(this.zzg.schedule(new zzbux(this, zzbuvVar), this.zzj.zzb, TimeUnit.NANOSECONDS));
            }
        }
        zzx(zzbvjVarZzq);
    }

    abstract void zzg();

    abstract zzblr zzh(zzbip zzbipVar, zzbfm zzbfmVar, int i, boolean z);

    final void zzi(Object obj) {
        zzbva zzbvaVar = this.zzr;
        if (zzbvaVar.zza) {
            zzbvaVar.zzf.zza.zzt(this.zzb.zze(obj));
        } else {
            zzai(new zzbuo(this, obj));
        }
    }

    @Override // com.google.android.libraries.places.internal.zzblr
    public final void zzk() {
        zzai(new zzbuj(this));
    }

    @Override // com.google.android.libraries.places.internal.zzblr
    public final void zzl(zzbjv zzbjvVar) {
        zzbvj zzbvjVar;
        zzbvj zzbvjVar2 = new zzbvj(0);
        zzbvjVar2.zza = new zzbst();
        Runnable runnableZzo = zzo(zzbvjVar2);
        if (runnableZzo != null) {
            synchronized (this.zzl) {
                this.zzr = this.zzr.zza(zzbvjVar2);
            }
            runnableZzo.run();
            zzB(zzbjvVar, zzbls.PROCESSED, new zzbip());
            return;
        }
        synchronized (this.zzl) {
            if (this.zzr.zzc.contains(this.zzr.zzf)) {
                zzbvjVar = this.zzr.zzf;
            } else {
                this.zzB = zzbjvVar;
                zzbvjVar = null;
            }
            zzbva zzbvaVar = this.zzr;
            this.zzr = new zzbva(zzbvaVar.zzb, zzbvaVar.zzc, zzbvaVar.zzd, zzbvaVar.zzf, true, zzbvaVar.zza, zzbvaVar.zzh, zzbvaVar.zze);
        }
        if (zzbvjVar != null) {
            zzbvjVar.zza.zzl(zzbjvVar);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbwh
    public final boolean zzm() {
        Iterator it = this.zzr.zzc.iterator();
        while (it.hasNext()) {
            if (((zzbvj) it.next()).zza.zzm()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.internal.zzblr
    public final void zzn(zzbpl zzbplVar) {
        zzbva zzbvaVar;
        synchronized (this.zzl) {
            zzbplVar.zzb("closed", this.zzq);
            zzbvaVar = this.zzr;
        }
        zzbvj zzbvjVar = zzbvaVar.zzf;
        if (zzbvjVar != null) {
            zzbpl zzbplVar2 = new zzbpl();
            zzbvjVar.zza.zzn(zzbplVar2);
            zzbplVar.zzb("committed", zzbplVar2);
            return;
        }
        zzbpl zzbplVar3 = new zzbpl();
        for (zzbvj zzbvjVar2 : zzbvaVar.zzc) {
            zzbpl zzbplVar4 = new zzbpl();
            zzbvjVar2.zza.zzn(zzbplVar4);
            zzbplVar3.zza(zzbplVar4);
        }
        zzbplVar.zzb("open", zzbplVar3);
    }

    final /* synthetic */ void zzp(zzbvj zzbvjVar) {
        Runnable runnableZzo = zzo(zzbvjVar);
        if (runnableZzo != null) {
            this.zzc.execute(runnableZzo);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbwh
    public final void zzr() {
        zzai(new zzbum(this));
    }

    @Override // com.google.android.libraries.places.internal.zzbwh
    public final void zzs(int i) {
        zzbva zzbvaVar = this.zzr;
        if (zzbvaVar.zza) {
            zzbvaVar.zzf.zza.zzs(i);
        } else {
            zzai(new zzbun(this, i));
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbwh
    public final void zzt(InputStream inputStream) {
        throw new IllegalStateException("RetriableStream.writeMessage() should not be called directly");
    }

    @Override // com.google.android.libraries.places.internal.zzbwh
    public final void zzu() {
        zzbva zzbvaVar = this.zzr;
        if (zzbvaVar.zza) {
            zzbvaVar.zzf.zza.zzu();
        } else {
            zzai(new zzbui(this));
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbwh
    public final void zzv(zzbfu zzbfuVar) {
        zzai(new zzbuf(this, zzbfuVar));
    }

    final /* synthetic */ void zzy(Integer num) {
        if (num == null) {
            return;
        }
        if (num.intValue() < 0) {
            zzA();
            return;
        }
        Object obj = this.zzl;
        synchronized (obj) {
            zzbuv zzbuvVar = this.zzz;
            if (zzbuvVar == null) {
                return;
            }
            Future futureZzb = zzbuvVar.zzb();
            zzbuv zzbuvVar2 = new zzbuv(obj);
            this.zzz = zzbuvVar2;
            if (futureZzb != null) {
                futureZzb.cancel(false);
            }
            zzbuvVar2.zza(this.zzg.schedule(new zzbux(this, zzbuvVar2), num.intValue(), TimeUnit.MILLISECONDS));
        }
    }

    final /* synthetic */ zzbiu zzD() {
        return this.zzb;
    }

    final /* synthetic */ Executor zzE() {
        return this.zzc;
    }

    final /* synthetic */ Executor zzF() {
        return this.zzd;
    }

    final /* synthetic */ ScheduledExecutorService zzG() {
        return this.zzg;
    }

    final /* synthetic */ zzbvm zzH() {
        return this.zzi;
    }

    final /* synthetic */ zzbpg zzI() {
        return this.zzj;
    }

    final /* synthetic */ boolean zzJ() {
        return this.zzk;
    }

    final /* synthetic */ Object zzK() {
        return this.zzl;
    }

    final /* synthetic */ zzbuu zzL() {
        return this.zzm;
    }

    final /* synthetic */ long zzM() {
        return this.zzn;
    }

    final /* synthetic */ long zzN() {
        return this.zzo;
    }

    final /* synthetic */ zzbvk zzO() {
        return this.zzp;
    }

    final /* synthetic */ zzbpl zzP() {
        return this.zzq;
    }

    final /* synthetic */ zzbva zzQ() {
        return this.zzr;
    }

    final /* synthetic */ void zzR(zzbva zzbvaVar) {
        this.zzr = zzbvaVar;
    }

    final /* synthetic */ AtomicBoolean zzS() {
        return this.zzs;
    }

    final /* synthetic */ AtomicInteger zzT() {
        return this.zzt;
    }

    final /* synthetic */ AtomicInteger zzU() {
        return this.zzu;
    }

    final /* synthetic */ zzbuy zzV() {
        return this.zzv;
    }

    final /* synthetic */ long zzW() {
        return this.zzw;
    }

    final /* synthetic */ void zzX(long j) {
        this.zzw = j;
    }

    final /* synthetic */ zzblt zzY() {
        return this.zzx;
    }

    final /* synthetic */ void zzZ(zzbuv zzbuvVar) {
        this.zzy = zzbuvVar;
    }

    final /* synthetic */ void zzaa(zzbuv zzbuvVar) {
        this.zzz = zzbuvVar;
    }

    final /* synthetic */ long zzab() {
        return this.zzA;
    }

    final /* synthetic */ void zzac(long j) {
        this.zzA = j;
    }

    final /* synthetic */ boolean zzad() {
        return this.zzC;
    }

    final /* synthetic */ void zzae(boolean z) {
        this.zzC = true;
    }

    @Override // com.google.android.libraries.places.internal.zzblr
    public final zzbez zzam() {
        throw null;
    }
}
