package com.google.android.libraries.places.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class zzbny implements zzblt {
    private final zzblt zza;
    private volatile boolean zzb;
    private List zzc = new ArrayList();

    public zzbny(zzblt zzbltVar) {
        this.zza = zzbltVar;
    }

    private final void zzg(Runnable runnable) {
        synchronized (this) {
            if (this.zzb) {
                runnable.run();
            } else {
                this.zzc.add(runnable);
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.zzblt
    public final void zza(zzbip zzbipVar) {
        zzg(new zzbnw(this, zzbipVar));
    }

    @Override // com.google.android.libraries.places.internal.zzbwj
    public final void zzb(zzbwi zzbwiVar) {
        if (this.zzb) {
            this.zza.zzb(zzbwiVar);
        } else {
            zzg(new zzbnu(this, zzbwiVar));
        }
    }

    @Override // com.google.android.libraries.places.internal.zzblt
    public final void zzc(zzbjv zzbjvVar, zzbls zzblsVar, zzbip zzbipVar) {
        zzg(new zzbnx(this, zzbjvVar, zzblsVar, zzbipVar));
    }

    @Override // com.google.android.libraries.places.internal.zzbwj
    public final void zzd() {
        if (this.zzb) {
            this.zza.zzd();
        } else {
            zzg(new zzbnv(this));
        }
    }

    public final void zze() {
        List list;
        List arrayList = new ArrayList();
        while (true) {
            synchronized (this) {
                if (this.zzc.isEmpty()) {
                    this.zzc = null;
                    this.zzb = true;
                    return;
                } else {
                    list = this.zzc;
                    this.zzc = arrayList;
                }
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            list.clear();
            arrayList = list;
        }
    }

    final /* synthetic */ zzblt zzf() {
        return this.zza;
    }
}
