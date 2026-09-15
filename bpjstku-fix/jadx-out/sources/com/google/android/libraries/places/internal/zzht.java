package com.google.android.libraries.places.internal;

import defpackage.getContainerClass;
import defpackage.lambdanew2androidxcameracoreimplDeferrableSurface;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzht implements getContainerClass {
    final /* synthetic */ lambdanew2androidxcameracoreimplDeferrableSurface zza;

    zzht(zzip zzipVar, lambdanew2androidxcameracoreimplDeferrableSurface lambdanew2androidxcameracoreimpldeferrablesurface) {
        this.zza = lambdanew2androidxcameracoreimpldeferrablesurface;
        Objects.requireNonNull(zzipVar);
    }

    @Override // defpackage.getContainerClass
    public final void onFailure(Throwable th) {
        com.google.android.libraries.places.api.auth.zza zzaVarZzd = com.google.android.libraries.places.api.auth.zzb.zzd();
        zzaVarZzd.zza(true);
        zzaVarZzd.zzb("eyJlcnJvciI6IlVOS05PV05fRVJST1IifQ==");
        zzaVarZzd.zzc(th.getMessage());
        this.zza.set(zzaVarZzd.zzd());
    }

    @Override // defpackage.getContainerClass
    public final /* synthetic */ void onSuccess(Object obj) {
        com.google.android.libraries.places.api.auth.zza zzaVarZzd = com.google.android.libraries.places.api.auth.zzb.zzd();
        zzaVarZzd.zza(true);
        zzaVarZzd.zzb((String) obj);
        zzaVarZzd.zzc(null);
        this.zza.set(zzaVarZzd.zzd());
    }
}
