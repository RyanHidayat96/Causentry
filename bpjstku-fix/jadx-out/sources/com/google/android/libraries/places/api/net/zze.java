package com.google.android.libraries.places.api.net;

import com.google.android.gms.tasks.CancellationToken;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.Place;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class zze extends FetchPlaceRequest {
    private final String zza;
    private final List zzb;
    private final AutocompleteSessionToken zzc;
    private final CancellationToken zzd;
    private final String zze;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FetchPlaceRequest)) {
            return false;
        }
        FetchPlaceRequest fetchPlaceRequest = (FetchPlaceRequest) obj;
        if (!this.zza.equals(fetchPlaceRequest.getPlaceId()) || !this.zzb.equals(fetchPlaceRequest.getPlaceFields())) {
            return false;
        }
        AutocompleteSessionToken autocompleteSessionToken = this.zzc;
        if (autocompleteSessionToken == null) {
            if (fetchPlaceRequest.getSessionToken() != null) {
                return false;
            }
        } else if (!autocompleteSessionToken.equals(fetchPlaceRequest.getSessionToken())) {
            return false;
        }
        CancellationToken cancellationToken = this.zzd;
        if (cancellationToken == null) {
            if (fetchPlaceRequest.getCancellationToken() != null) {
                return false;
            }
        } else if (!cancellationToken.equals(fetchPlaceRequest.getCancellationToken())) {
            return false;
        }
        String str = this.zze;
        if (str == null) {
            if (fetchPlaceRequest.getRegionCode() != null) {
                return false;
            }
        } else if (!str.equals(fetchPlaceRequest.getRegionCode())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode();
        int iHashCode2 = this.zzb.hashCode();
        AutocompleteSessionToken autocompleteSessionToken = this.zzc;
        int iHashCode3 = autocompleteSessionToken == null ? 0 : autocompleteSessionToken.hashCode();
        CancellationToken cancellationToken = this.zzd;
        int iHashCode4 = cancellationToken == null ? 0 : cancellationToken.hashCode();
        String str = this.zze;
        return ((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ iHashCode4) * 1000003) ^ (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        String string = this.zzb.toString();
        int length = string.length();
        CancellationToken cancellationToken = this.zzd;
        String strValueOf = String.valueOf(this.zzc);
        String strValueOf2 = String.valueOf(cancellationToken);
        int length2 = String.valueOf(strValueOf).length();
        int length3 = String.valueOf(strValueOf2).length();
        String str = this.zze;
        int length4 = String.valueOf(str).length();
        String str2 = this.zza;
        StringBuilder sb = new StringBuilder(str2.length() + 40 + length + 15 + length2 + 20 + length3 + 13 + length4 + 1);
        sb.append("FetchPlaceRequest{placeId=");
        sb.append(str2);
        sb.append(", placeFields=");
        sb.append(string);
        sb.append(", sessionToken=");
        sb.append(strValueOf);
        sb.append(", cancellationToken=");
        sb.append(strValueOf2);
        sb.append(", regionCode=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }

    /* synthetic */ zze(String str, List list, AutocompleteSessionToken autocompleteSessionToken, CancellationToken cancellationToken, String str2, byte[] bArr) {
        this.zza = str;
        this.zzb = list;
        this.zzc = autocompleteSessionToken;
        this.zzd = cancellationToken;
        this.zze = str2;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPlaceRequest, com.google.android.libraries.places.internal.zzmg
    public final CancellationToken getCancellationToken() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPlaceRequest
    public final List<Place.Field> getPlaceFields() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPlaceRequest
    public final String getPlaceId() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPlaceRequest
    public final String getRegionCode() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPlaceRequest
    public final AutocompleteSessionToken getSessionToken() {
        return this.zzc;
    }
}
