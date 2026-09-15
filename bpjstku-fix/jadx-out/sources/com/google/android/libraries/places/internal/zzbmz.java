package com.google.android.libraries.places.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class zzbmz extends zzbfh {
    private final zzbfh zza;
    private volatile boolean zzb;
    private List zzc = new ArrayList();

    public zzbmz(zzbfh zzbfhVar) {
        this.zza = zzbfhVar;
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

    @Override // com.google.android.libraries.places.internal.zzbfh
    public final void zza(zzbip zzbipVar) {
        if (this.zzb) {
            this.zza.zza(zzbipVar);
        } else {
            zzg(new zzbmv(this, zzbipVar));
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbfh
    public final void zzb(Object obj) {
        if (this.zzb) {
            this.zza.zzb(obj);
        } else {
            zzg(new zzbmw(this, obj));
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbfh
    public final void zzc(zzbjv zzbjvVar, zzbip zzbipVar) {
        zzg(new zzbmx(this, zzbjvVar, zzbipVar));
    }

    @Override // com.google.android.libraries.places.internal.zzbfh
    public final void zzd() {
        if (this.zzb) {
            this.zza.zzd();
        } else {
            zzg(new zzbmy(this));
        }
    }

    final void zze() {
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

    final /* synthetic */ zzbfh zzf() {
        return this.zza;
    }
}
