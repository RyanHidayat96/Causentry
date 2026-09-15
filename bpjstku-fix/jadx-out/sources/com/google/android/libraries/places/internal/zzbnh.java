package com.google.android.libraries.places.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
final class zzbnh implements zzbsj {
    private final Executor zzc;
    private final zzbkd zzd;
    private Runnable zze;
    private Runnable zzf;
    private Runnable zzg;
    private zzbsi zzh;
    private final zzbhf zza = zzbhf.zza(zzbnh.class, null);
    private final Object zzb = new Object();
    private Collection zzi = new LinkedHashSet();
    private volatile zzbng zzj = new zzbng(null, null, null);

    zzbnh(Executor executor, zzbkd zzbkdVar) {
        this.zzc = executor;
        this.zzd = zzbkdVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbsj
    public final Runnable zzao(zzbsi zzbsiVar) {
        this.zzh = zzbsiVar;
        this.zze = new zzbnb(this, zzbsiVar);
        this.zzf = new zzbnc(this, zzbsiVar);
        this.zzg = new zzbnd(this, zzbsiVar);
        return null;
    }

    @Override // com.google.android.libraries.places.internal.zzblu
    public final zzblr zzb(zzbiu zzbiuVar, zzbip zzbipVar, zzbfd zzbfdVar, zzbfp[] zzbfpVarArr) {
        zzblr zzbooVar;
        zzbht zzbhtVarZza;
        zzbng zzbngVar;
        int size;
        try {
            zzbtq zzbtqVar = new zzbtq(zzbiuVar, zzbipVar, zzbfdVar, new zzbsw(zzbfpVarArr));
            zzbng zzbngVar2 = this.zzj;
            while (true) {
                zzbjv zzbjvVar = zzbngVar2.zzb;
                if (zzbjvVar == null) {
                    zzbhy zzbhyVar = zzbngVar2.zza;
                    byte[] bArr = null;
                    if (zzbhyVar != null) {
                        zzbhtVarZza = zzbhyVar.zza(zzbtqVar);
                        zzbfd zzbfdVarZza = zzbtqVar.zza();
                        zzblu zzbluVarZze = zzbpf.zze(zzbhtVarZza, zzbfdVarZza.zzk());
                        if (zzbluVarZze != null) {
                            zzbooVar = zzbluVarZze.zzb(zzbtqVar.zzc(), zzbtqVar.zzb(), zzbfdVarZza, zzbfpVarArr);
                            break;
                        }
                    } else {
                        zzbhtVarZza = null;
                    }
                    Object obj = this.zzb;
                    synchronized (obj) {
                        zzbngVar = this.zzj;
                        if (zzbngVar2 == zzbngVar) {
                            zzbnf zzbnfVar = new zzbnf(this, zzbtqVar, zzbfpVarArr, bArr);
                            if (zzbtqVar.zza().zzk() && zzbhtVarZza != null && zzbhtVarZza.zzh()) {
                                zzbnfVar.zzj(zzbhtVarZza.zzf());
                            }
                            this.zzi.add(zzbnfVar);
                            synchronized (obj) {
                                size = this.zzi.size();
                            }
                            zzbooVar = zzbnfVar;
                            break;
                        }
                    }
                    if (size == 1) {
                        this.zzd.zzb(this.zze);
                    }
                    for (zzbfp zzbfpVar : zzbfpVarArr) {
                    }
                    zzbooVar = zzbnfVar;
                    break;
                }
                zzbooVar = new zzboo(zzbjvVar, zzbls.PROCESSED, zzbfpVarArr);
                break;
                zzbngVar2 = zzbngVar;
            }
            this.zzd.zza();
            return zzbooVar;
        } catch (Throwable th) {
            this.zzd.zza();
            throw th;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbsj
    public final void zzd(zzbjv zzbjvVar) {
        Runnable runnable;
        synchronized (this.zzb) {
            if (this.zzj.zzb != null) {
                return;
            }
            this.zzj = this.zzj.zzb(zzbjvVar);
            zzbkd zzbkdVar = this.zzd;
            zzbkdVar.zzb(new zzbne(this, zzbjvVar));
            if (!zzf() && (runnable = this.zzg) != null) {
                zzbkdVar.zzb(runnable);
                this.zzg = null;
            }
            this.zzd.zza();
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbsj
    public final void zze(zzbjv zzbjvVar) {
        Collection<zzbnf> collection;
        Runnable runnable;
        zzd(zzbjvVar);
        synchronized (this.zzb) {
            collection = this.zzi;
            runnable = this.zzg;
            this.zzg = null;
            if (!collection.isEmpty()) {
                this.zzi = Collections.emptyList();
            }
        }
        if (runnable != null) {
            for (zzbnf zzbnfVar : collection) {
                Runnable runnableZzo = zzbnfVar.zzo(new zzboo(zzbjvVar, zzbls.REFUSED, zzbnfVar.zzi()));
                if (runnableZzo != null) {
                    ((zzbnp) runnableZzo).zza.zzp();
                }
            }
            zzbkd zzbkdVar = this.zzd;
            zzbkdVar.zzb(runnable);
            zzbkdVar.zza();
        }
    }

    public final boolean zzf() {
        boolean zIsEmpty;
        synchronized (this.zzb) {
            zIsEmpty = this.zzi.isEmpty();
        }
        return !zIsEmpty;
    }

    final void zzg(zzbhy zzbhyVar) {
        Runnable runnable;
        synchronized (this.zzb) {
            this.zzj = this.zzj.zza(zzbhyVar);
            if (zzbhyVar != null && zzf()) {
                ArrayList arrayList = new ArrayList(this.zzi);
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    zzbnf zzbnfVar = (zzbnf) arrayList.get(i);
                    zzbht zzbhtVarZza = zzbhyVar.zza(zzbnfVar.zzh());
                    zzbfd zzbfdVarZza = zzbnfVar.zzh().zza();
                    if (zzbfdVarZza.zzk() && zzbhtVarZza.zzh()) {
                        zzbnfVar.zzj(zzbhtVarZza.zzf());
                    }
                    zzblu zzbluVarZze = zzbpf.zze(zzbhtVarZza, zzbfdVarZza.zzk());
                    if (zzbluVarZze != null) {
                        Executor executorZzj = this.zzc;
                        if (zzbfdVarZza.zzj() != null) {
                            executorZzj = zzbfdVarZza.zzj();
                        }
                        Runnable runnableZzg = zzbnfVar.zzg(zzbluVarZze, null);
                        if (runnableZzg != null) {
                            executorZzj.execute(runnableZzg);
                        }
                        arrayList2.add(zzbnfVar);
                    }
                }
                synchronized (this.zzb) {
                    if (zzf()) {
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            this.zzi.remove((zzbnf) it.next());
                        }
                        if (this.zzi.isEmpty()) {
                            this.zzi = new LinkedHashSet();
                        }
                        if (!zzf()) {
                            zzbkd zzbkdVar = this.zzd;
                            zzbkdVar.zzb(this.zzf);
                            if (this.zzj.zzb != null && (runnable = this.zzg) != null) {
                                zzbkdVar.zzb(runnable);
                                this.zzg = null;
                            }
                        }
                        this.zzd.zza();
                    }
                }
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbhk
    public final zzbhf zzc() {
        return this.zza;
    }

    final /* synthetic */ Object zzh() {
        return this.zzb;
    }

    final /* synthetic */ zzbkd zzi() {
        return this.zzd;
    }

    final /* synthetic */ Runnable zzj() {
        return this.zzf;
    }

    final /* synthetic */ Runnable zzk() {
        return this.zzg;
    }

    final /* synthetic */ void zzl(Runnable runnable) {
        this.zzg = null;
    }

    final /* synthetic */ zzbsi zzm() {
        return this.zzh;
    }

    final /* synthetic */ Collection zzn() {
        return this.zzi;
    }

    final /* synthetic */ zzbng zzo() {
        return this.zzj;
    }
}
