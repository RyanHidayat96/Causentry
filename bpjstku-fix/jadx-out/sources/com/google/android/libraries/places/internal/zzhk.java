package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.api.model.PlaceTypes;
import defpackage.lambdanew2androidxcameracoreimplDeferrableSurface;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzhk implements zzcan {
    final List zza;
    final /* synthetic */ lambdanew2androidxcameracoreimplDeferrableSurface zzb;

    zzhk(zzhl zzhlVar, lambdanew2androidxcameracoreimplDeferrableSurface lambdanew2androidxcameracoreimpldeferrablesurface) {
        this.zzb = lambdanew2androidxcameracoreimpldeferrablesurface;
        Objects.requireNonNull(zzhlVar);
        this.zza = new ArrayList();
    }

    @Override // com.google.android.libraries.places.internal.zzcan
    public final void zza(Throwable th) {
        this.zzb.setException(th);
    }

    @Override // com.google.android.libraries.places.internal.zzcan
    public final void zzb() {
        List<zzash> list = this.zza;
        for (zzash zzashVar : list) {
            if (zzashVar.zzc().contains(PlaceTypes.POINT_OF_INTEREST)) {
                this.zzb.set(zzashVar.zza());
                return;
            }
        }
        this.zzb.set(list.isEmpty() ? "" : ((zzash) list.get(0)).zza());
    }

    @Override // com.google.android.libraries.places.internal.zzcan
    public final /* synthetic */ void zzc(Object obj) {
        this.zza.addAll(((zzasd) obj).zza());
    }
}
