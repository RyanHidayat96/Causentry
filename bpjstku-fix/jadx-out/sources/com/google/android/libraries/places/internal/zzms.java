package com.google.android.libraries.places.internal;

import defpackage.getContainerClass;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzms implements getContainerClass {
    final /* synthetic */ zzaks zza;
    final /* synthetic */ zzmu zzb;

    zzms(zzmu zzmuVar, zzaks zzaksVar) {
        this.zza = zzaksVar;
        Objects.requireNonNull(zzmuVar);
        this.zzb = zzmuVar;
    }

    @Override // defpackage.getContainerClass
    public final void onFailure(Throwable th) {
        this.zzb.zzc(this.zza);
    }

    @Override // defpackage.getContainerClass
    public final /* synthetic */ void onSuccess(Object obj) {
        String str = (String) obj;
        if (!str.isEmpty()) {
            zzaks zzaksVar = this.zza;
            zzbdv zzbdvVarZzc = zzbdw.zzc();
            zzbdvVarZzc.zza(str);
            zzaksVar.zzk(zzbdvVarZzc);
        }
        this.zzb.zzc(this.zza);
    }
}
