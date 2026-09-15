package com.google.android.libraries.places.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
final class zzbvi implements zzblt {
    final zzbvj zza;
    final /* synthetic */ zzbvl zzb;

    zzbvi(zzbvl zzbvlVar, zzbvj zzbvjVar) {
        Objects.requireNonNull(zzbvlVar);
        this.zzb = zzbvlVar;
        this.zza = zzbvjVar;
    }

    private static final Integer zze(zzbip zzbipVar) {
        String str = (String) zzbipVar.zzb(zzbvl.zzf);
        if (str == null) {
            return null;
        }
        try {
            return Integer.valueOf(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzblt
    public final void zza(zzbip zzbipVar) {
        AtomicInteger atomicInteger;
        int i;
        int i2;
        zzbvj zzbvjVar = this.zza;
        int i3 = zzbvjVar.zzd;
        if (i3 > 0) {
            zzbil zzbilVar = zzbvl.zze;
            zzbipVar.zzd(zzbilVar);
            zzbipVar.zzc(zzbilVar, String.valueOf(i3));
        }
        zzbvl zzbvlVar = this.zzb;
        zzbvlVar.zzp(zzbvjVar);
        if (zzbvlVar.zzQ().zzf == zzbvjVar) {
            if (zzbvlVar.zzO() != null) {
                zzbvk zzbvkVarZzO = zzbvlVar.zzO();
                do {
                    atomicInteger = zzbvkVarZzO.zzd;
                    i = atomicInteger.get();
                    i2 = zzbvkVarZzO.zza;
                    if (i == i2) {
                        break;
                    }
                } while (!atomicInteger.compareAndSet(i, Math.min(zzbvkVarZzO.zzc + i, i2)));
            }
            zzbkd zzbkdVar = (zzbkd) zzbvlVar.zzF();
            zzbkdVar.zzb(new zzbvb(this, zzbipVar));
            zzbkdVar.zza();
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbwj
    public final void zzb(zzbwi zzbwiVar) {
        zzbvl zzbvlVar = this.zzb;
        zzbvj zzbvjVar = zzbvlVar.zzQ().zzf;
        if (!(zzbvjVar != null)) {
            throw new IllegalStateException("Headers should be received prior to messages.");
        }
        if (zzbvjVar != this.zza) {
            zzbpf.zzg(zzbwiVar);
            return;
        }
        zzbkd zzbkdVar = (zzbkd) zzbvlVar.zzF();
        zzbkdVar.zzb(new zzbvg(this, zzbwiVar));
        zzbkdVar.zza();
    }

    /* JADX WARN: Code duplicated, block: B:99:0x0224  */
    @Override // com.google.android.libraries.places.internal.zzblt
    public final void zzc(zzbjv zzbjvVar, zzbls zzblsVar, zzbip zzbipVar) {
        long nanos;
        boolean z;
        zzbuv zzbuvVar;
        zzbvl zzbvlVar = this.zzb;
        synchronized (zzbvlVar.zzK()) {
            zzbva zzbvaVarZzQ = zzbvlVar.zzQ();
            zzbvj zzbvjVar = this.zza;
            zzbvjVar.zzb = true;
            Collection collection = zzbvaVarZzQ.zzc;
            if (collection.contains(zzbvjVar)) {
                ArrayList arrayList = new ArrayList(collection);
                arrayList.remove(zzbvjVar);
                zzbvaVarZzQ = new zzbva(zzbvaVarZzQ.zzb, Collections.unmodifiableCollection(arrayList), zzbvaVarZzQ.zzd, zzbvaVarZzQ.zzf, zzbvaVarZzQ.zzg, zzbvaVarZzQ.zza, zzbvaVarZzQ.zzh, zzbvaVarZzQ.zze);
            }
            zzbvlVar.zzR(zzbvaVarZzQ);
            zzbvlVar.zzP().zza(zzbjvVar.zzg());
        }
        zzbvl zzbvlVar2 = this.zzb;
        if (zzbvlVar2.zzU().decrementAndGet() == Integer.MIN_VALUE) {
            zzbkd zzbkdVar = (zzbkd) zzbvlVar2.zzF();
            zzbkdVar.zzb(new zzbve(this));
            zzbkdVar.zza();
            return;
        }
        zzbvj zzbvjVar2 = this.zza;
        if (zzbvjVar2.zzc) {
            zzbvlVar2.zzp(zzbvjVar2);
            if (zzbvlVar2.zzQ().zzf == zzbvjVar2) {
                zzbvlVar2.zzB(zzbjvVar, zzblsVar, zzbipVar);
                return;
            }
            return;
        }
        zzbls zzblsVar2 = zzbls.MISCARRIED;
        if (zzblsVar == zzblsVar2 && zzbvlVar2.zzT().incrementAndGet() > 1000) {
            zzbvl zzbvlVar3 = this.zzb;
            zzbvj zzbvjVar3 = this.zza;
            zzbvlVar3.zzp(zzbvjVar3);
            if (zzbvlVar3.zzQ().zzf == zzbvjVar3) {
                zzbvlVar3.zzB(zzbjv.zzh.zze("Too many transparent retries. Might be a bug in gRPC").zzd(new zzbjy(zzbjvVar, null)), zzblsVar, zzbipVar);
                return;
            }
            return;
        }
        if (zzbvlVar2.zzQ().zzf == null) {
            if (zzblsVar == zzblsVar2 || (zzblsVar == zzbls.REFUSED && zzbvlVar2.zzS().compareAndSet(false, true))) {
                zzbvl zzbvlVar4 = this.zzb;
                zzbvj zzbvjVar4 = this.zza;
                zzbvj zzbvjVarZzq = zzbvlVar4.zzq(zzbvjVar4.zzd, true);
                if (zzbvjVarZzq != null) {
                    if (zzbvlVar4.zzJ()) {
                        synchronized (zzbvlVar4.zzK()) {
                            zzbva zzbvaVarZzQ2 = zzbvlVar4.zzQ();
                            ArrayList arrayList2 = new ArrayList(zzbvaVarZzQ2.zzd);
                            arrayList2.remove(zzbvjVar4);
                            arrayList2.add(zzbvjVarZzq);
                            zzbvlVar4.zzR(new zzbva(zzbvaVarZzQ2.zzb, zzbvaVarZzQ2.zzc, Collections.unmodifiableCollection(arrayList2), zzbvaVarZzQ2.zzf, zzbvaVarZzQ2.zzg, zzbvaVarZzQ2.zza, zzbvaVarZzQ2.zzh, zzbvaVarZzQ2.zze));
                        }
                    }
                    this.zzb.zzE().execute(new zzbvf(this, zzbvjVarZzq));
                    return;
                }
                return;
            }
            if (zzblsVar != zzbls.DROPPED) {
                zzbvlVar2.zzS().set(true);
                if (zzbvlVar2.zzJ()) {
                    Integer numZze = zze(zzbipVar);
                    zzbvl zzbvlVar5 = this.zzb;
                    boolean zContains = zzbvlVar5.zzI().zzc.contains(zzbjvVar.zzg());
                    boolean z2 = (zzbvlVar5.zzO() == null || (!zContains && (numZze == null || numZze.intValue() >= 0))) ? false : !zzbvlVar5.zzO().zzb();
                    if (zContains && !z2 && !zzbjvVar.zzj() && numZze != null && numZze.intValue() > 0) {
                        numZze = 0;
                    }
                    boolean z3 = zContains && !z2;
                    if (z3) {
                        zzbvlVar5.zzy(numZze);
                    }
                    synchronized (zzbvlVar5.zzK()) {
                        zzbva zzbvaVarZzQ3 = zzbvlVar5.zzQ();
                        zzbvj zzbvjVar5 = this.zza;
                        ArrayList arrayList3 = new ArrayList(zzbvaVarZzQ3.zzd);
                        arrayList3.remove(zzbvjVar5);
                        zzbvlVar5.zzR(new zzbva(zzbvaVarZzQ3.zzb, zzbvaVarZzQ3.zzc, Collections.unmodifiableCollection(arrayList3), zzbvaVarZzQ3.zzf, zzbvaVarZzQ3.zzg, zzbvaVarZzQ3.zza, zzbvaVarZzQ3.zzh, zzbvaVarZzQ3.zze));
                        if (z3 && (zzbvlVar5.zzz(zzbvlVar5.zzQ()) || !zzbvlVar5.zzQ().zzd.isEmpty())) {
                            return;
                        }
                    }
                } else {
                    if (zzbvlVar2.zzH() == null) {
                        nanos = 0;
                        z = false;
                    } else {
                        boolean zContains2 = zzbvlVar2.zzH().zzf.contains(zzbjvVar.zzg());
                        Integer numZze2 = zze(zzbipVar);
                        boolean z4 = (zzbvlVar2.zzO() == null || (!zContains2 && (numZze2 == null || numZze2.intValue() >= 0))) ? false : !zzbvlVar2.zzO().zzb();
                        if (zzbvlVar2.zzH().zza <= zzbvjVar2.zzd + 1 || z4) {
                            nanos = 0;
                            z = false;
                        } else if (numZze2 == null) {
                            if (zContains2) {
                                zzbvm zzbvmVarZzH = zzbvlVar2.zzH();
                                long jZzab = zzbvlVar2.zzab();
                                long jZzab2 = zzbvlVar2.zzab();
                                nanos = zzbvl.zzj(jZzab);
                                zzbvlVar2.zzac(Math.min((long) (jZzab2 * zzbvmVarZzH.zzd), zzbvlVar2.zzH().zzc));
                                z = true;
                            } else {
                                nanos = 0;
                                z = false;
                            }
                        } else if (numZze2.intValue() >= 0) {
                            nanos = TimeUnit.MILLISECONDS.toNanos(numZze2.intValue());
                            zzbvlVar2.zzac(zzbvlVar2.zzH().zzb);
                            z = true;
                        } else {
                            nanos = 0;
                            z = false;
                        }
                    }
                    if (z) {
                        zzbvj zzbvjVarZzq2 = zzbvlVar2.zzq(zzbvjVar2.zzd + 1, false);
                        if (zzbvjVarZzq2 != null) {
                            synchronized (zzbvlVar2.zzK()) {
                                zzbuvVar = new zzbuv(zzbvlVar2.zzK());
                                zzbvlVar2.zzZ(zzbuvVar);
                            }
                            zzbuvVar.zza(this.zzb.zzG().schedule(new zzbvd(this, zzbuvVar, zzbvjVarZzq2), nanos, TimeUnit.NANOSECONDS));
                            return;
                        }
                        return;
                    }
                }
            } else if (zzbvlVar2.zzJ()) {
                zzbvlVar2.zzA();
            }
        }
        zzbvl zzbvlVar6 = this.zzb;
        zzbvj zzbvjVar6 = this.zza;
        zzbvlVar6.zzp(zzbvjVar6);
        if (zzbvlVar6.zzQ().zzf == zzbvjVar6) {
            zzbvlVar6.zzB(zzbjvVar, zzblsVar, zzbipVar);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbwj
    public final void zzd() {
        zzbvl zzbvlVar = this.zzb;
        if (zzbvlVar.zzm()) {
            zzbkd zzbkdVar = (zzbkd) zzbvlVar.zzF();
            zzbkdVar.zzb(new zzbvh(this));
            zzbkdVar.zza();
        }
    }
}
