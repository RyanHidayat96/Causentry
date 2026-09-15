package com.google.android.libraries.places.internal;

import com.google.android.gms.maps.model.LatLng;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.lambdanew2androidxcameracoreimplDeferrableSurface;

/* JADX INFO: loaded from: classes3.dex */
public final class zzhl {
    private final zzbif zza;
    private final zzir zzb;

    public final ListenableFuture zza(LatLng latLng, com.google.android.libraries.places.api.auth.zzb zzbVar, String str) {
        zzasj zzasjVar = (zzasj) zzask.zzb(this.zza).zze(zzcam.zza(this.zzb.zzb(str, "results.placeId,results.types")), zzep.zza(zzbVar.zzb()));
        zzasa zzasaVarZza = zzasb.zza();
        double d = latLng.latitude;
        double d2 = latLng.longitude;
        StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 1 + String.valueOf(d2).length());
        sb.append(d);
        sb.append(",");
        sb.append(d2);
        zzasaVarZza.zza(sb.toString());
        zzasb zzasbVar = (zzasb) zzasaVarZza.zzG();
        lambdanew2androidxcameracoreimplDeferrableSurface lambdanew2androidxcameracoreimpldeferrablesurfaceTuitionPaymentFragmentspecialinlinedviewModeldefault3 = lambdanew2androidxcameracoreimplDeferrableSurface.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        zzcaj.zza(zzasjVar.zzc().zza(zzask.zza(), zzasjVar.zzd()), zzasbVar, new zzhk(this, lambdanew2androidxcameracoreimpldeferrablesurfaceTuitionPaymentFragmentspecialinlinedviewModeldefault3));
        return lambdanew2androidxcameracoreimpldeferrablesurfaceTuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    zzhl(zzbif zzbifVar, zzir zzirVar) {
        this.zza = zzbifVar;
        this.zzb = zzirVar;
    }
}
