package com.google.android.libraries.places.api.net;

import com.google.android.gms.tasks.CancellationToken;
import com.google.android.libraries.places.api.model.Place;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class zzn extends FindCurrentPlaceRequest {
    private final List zza;
    private final CancellationToken zzb;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FindCurrentPlaceRequest)) {
            return false;
        }
        FindCurrentPlaceRequest findCurrentPlaceRequest = (FindCurrentPlaceRequest) obj;
        if (!this.zza.equals(findCurrentPlaceRequest.getPlaceFields())) {
            return false;
        }
        CancellationToken cancellationToken = this.zzb;
        if (cancellationToken == null) {
            if (findCurrentPlaceRequest.getCancellationToken() != null) {
                return false;
            }
        } else if (!cancellationToken.equals(findCurrentPlaceRequest.getCancellationToken())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode();
        CancellationToken cancellationToken = this.zzb;
        return ((iHashCode ^ 1000003) * 1000003) ^ (cancellationToken == null ? 0 : cancellationToken.hashCode());
    }

    public final String toString() {
        String string = this.zza.toString();
        int length = string.length();
        String strValueOf = String.valueOf(this.zzb);
        StringBuilder sb = new StringBuilder(length + 56 + String.valueOf(strValueOf).length() + 1);
        sb.append("FindCurrentPlaceRequest{placeFields=");
        sb.append(string);
        sb.append(", cancellationToken=");
        sb.append(strValueOf);
        sb.append("}");
        return sb.toString();
    }

    /* synthetic */ zzn(List list, CancellationToken cancellationToken, byte[] bArr) {
        this.zza = list;
        this.zzb = cancellationToken;
    }

    @Override // com.google.android.libraries.places.api.net.FindCurrentPlaceRequest, com.google.android.libraries.places.internal.zzmg
    public final CancellationToken getCancellationToken() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.net.FindCurrentPlaceRequest
    public final List<Place.Field> getPlaceFields() {
        return this.zza;
    }
}
