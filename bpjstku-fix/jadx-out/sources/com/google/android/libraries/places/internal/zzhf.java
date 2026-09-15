package com.google.android.libraries.places.internal;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.libraries.places.api.model.CircularBounds;
import com.google.android.libraries.places.api.model.RectangularBounds;

/* JADX INFO: loaded from: classes3.dex */
final class zzhf {
    static final zzbee zza(LatLng latLng) {
        zzbed zzbedVarZzf = zzbee.zzf();
        zzbedVarZzf.zza(latLng.latitude);
        zzbedVarZzf.zzb(latLng.longitude);
        return (zzbee) zzbedVarZzf.zzG();
    }

    static final zzatq zzb(CircularBounds circularBounds) {
        LatLng center = circularBounds.getCenter();
        zzatp zzatpVarZza = zzatq.zza();
        zzbed zzbedVarZzf = zzbee.zzf();
        zzbedVarZzf.zza(center.latitude);
        zzbedVarZzf.zzb(center.longitude);
        zzatpVarZza.zza(zzbedVarZzf);
        zzatpVarZza.zzb(circularBounds.getRadius());
        return (zzatq) zzatpVarZza.zzG();
    }

    static final zzaqo zzc(RectangularBounds rectangularBounds) {
        LatLng southwest = rectangularBounds.getSouthwest();
        LatLng northeast = rectangularBounds.getNortheast();
        zzaqn zzaqnVarZzd = zzaqo.zzd();
        zzbed zzbedVarZzf = zzbee.zzf();
        zzbedVarZzf.zza(southwest.latitude);
        zzbedVarZzf.zzb(southwest.longitude);
        zzaqnVarZzd.zza((zzbee) zzbedVarZzf.zzG());
        zzbed zzbedVarZzf2 = zzbee.zzf();
        zzbedVarZzf2.zza(northeast.latitude);
        zzbedVarZzf2.zzb(northeast.longitude);
        zzaqnVarZzd.zzb((zzbee) zzbedVarZzf2.zzG());
        return (zzaqo) zzaqnVarZzd.zzG();
    }

    zzhf() {
    }
}
