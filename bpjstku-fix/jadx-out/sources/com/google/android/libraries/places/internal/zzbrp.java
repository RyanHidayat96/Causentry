package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzbrp implements Runnable {
    final /* synthetic */ zzbrq zza;

    zzbrp(zzbrq zzbrqVar) {
        Objects.requireNonNull(zzbrqVar);
        this.zza = zzbrqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbrq zzbrqVar = this.zza;
        zzbrx zzbrxVar = zzbrqVar.zzd.zza;
        if (zzbrxVar.zzH() != null) {
            zzbrxVar.zzH().remove(zzbrqVar);
            if (zzbrxVar.zzH().isEmpty()) {
                zzbrxVar.zzf.zza(zzbrxVar.zzJ(), false);
                zzbrxVar.zzI(null);
                if (zzbrxVar.zzM().get()) {
                    zzbrxVar.zzL().zza(zzbrx.zzc);
                }
            }
        }
    }
}
