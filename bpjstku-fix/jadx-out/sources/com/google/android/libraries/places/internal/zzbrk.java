package com.google.android.libraries.places.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzbrk implements Runnable {
    final /* synthetic */ zzbrr zza;

    zzbrk(zzbrr zzbrrVar) {
        Objects.requireNonNull(zzbrrVar);
        this.zza = zzbrrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        zzbrr zzbrrVar = this.zza;
        if (zzbrrVar.zzf().get() == zzbrx.zzs()) {
            zzbrrVar.zzf().set(null);
        }
        zzbrx zzbrxVar = zzbrrVar.zza;
        if (zzbrxVar.zzH() != null) {
            Iterator it = zzbrxVar.zzH().iterator();
            while (it.hasNext()) {
                ((zzbrq) it.next()).zze("Channel is forcefully shutdown", null);
            }
        }
        zzbrw zzbrwVarZzL = zzbrxVar.zzL();
        zzbjv zzbjvVar = zzbrx.zzb;
        zzbrwVarZzL.zza(zzbjvVar);
        synchronized (zzbrwVarZzL.zza) {
            arrayList = new ArrayList(zzbrwVarZzL.zzb);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((zzblr) arrayList.get(i)).zzl(zzbjvVar);
        }
        zzbrwVarZzL.zzd.zzK().zze(zzbjvVar);
    }
}
