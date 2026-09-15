package com.google.android.libraries.places.internal;

import java.util.LinkedHashSet;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzbrn implements Runnable {
    final /* synthetic */ zzbrq zza;
    final /* synthetic */ zzbrr zzb;

    zzbrn(zzbrr zzbrrVar, zzbrq zzbrqVar) {
        this.zza = zzbrqVar;
        Objects.requireNonNull(zzbrrVar);
        this.zzb = zzbrrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbrr zzbrrVar = this.zzb;
        if (zzbrrVar.zzf().get() != zzbrx.zzs()) {
            this.zza.zzl();
            return;
        }
        zzbrx zzbrxVar = zzbrrVar.zza;
        if (zzbrxVar.zzH() == null) {
            zzbrxVar.zzI(new LinkedHashSet());
            zzbrxVar.zzf.zza(zzbrxVar.zzJ(), true);
        }
        zzbrxVar.zzH().add(this.zza);
    }
}
