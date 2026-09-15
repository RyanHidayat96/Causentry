package com.google.android.libraries.places.api.model;

import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: loaded from: classes3.dex */
final class zzax extends zzez {
    private LatLng zza;
    private LatLng zzb;

    final zzez zza(LatLng latLng) {
        if (latLng == null) {
            throw new NullPointerException("Null southwest");
        }
        this.zza = latLng;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.zzez
    final zzez zzb(LatLng latLng) {
        if (latLng == null) {
            throw new NullPointerException("Null northeast");
        }
        this.zzb = latLng;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.zzez
    final RectangularBounds zzc() {
        LatLng latLng;
        LatLng latLng2 = this.zza;
        if (latLng2 != null && (latLng = this.zzb) != null) {
            return new zzds(latLng2, latLng);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zza == null) {
            sb.append(" southwest");
        }
        if (this.zzb == null) {
            sb.append(" northeast");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    zzax() {
    }
}
