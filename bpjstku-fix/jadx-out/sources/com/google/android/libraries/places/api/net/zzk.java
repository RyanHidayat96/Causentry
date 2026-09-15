package com.google.android.libraries.places.api.net;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.TypeFilter;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class zzk extends FindAutocompletePredictionsRequest {
    private final String zza;
    private final LocationBias zzb;
    private final LocationRestriction zzc;
    private final LatLng zzd;
    private final List zze;
    private final AutocompleteSessionToken zzf;
    private final TypeFilter zzg;
    private final List zzh;
    private final Integer zzi;
    private final String zzj;
    private final boolean zzk;
    private final CancellationToken zzl;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FindAutocompletePredictionsRequest)) {
            return false;
        }
        FindAutocompletePredictionsRequest findAutocompletePredictionsRequest = (FindAutocompletePredictionsRequest) obj;
        String str = this.zza;
        if (str == null) {
            if (findAutocompletePredictionsRequest.getQuery() != null) {
                return false;
            }
        } else if (!str.equals(findAutocompletePredictionsRequest.getQuery())) {
            return false;
        }
        LocationBias locationBias = this.zzb;
        if (locationBias == null) {
            if (findAutocompletePredictionsRequest.getLocationBias() != null) {
                return false;
            }
        } else if (!locationBias.equals(findAutocompletePredictionsRequest.getLocationBias())) {
            return false;
        }
        LocationRestriction locationRestriction = this.zzc;
        if (locationRestriction == null) {
            if (findAutocompletePredictionsRequest.getLocationRestriction() != null) {
                return false;
            }
        } else if (!locationRestriction.equals(findAutocompletePredictionsRequest.getLocationRestriction())) {
            return false;
        }
        LatLng latLng = this.zzd;
        if (latLng == null) {
            if (findAutocompletePredictionsRequest.getOrigin() != null) {
                return false;
            }
        } else if (!latLng.equals(findAutocompletePredictionsRequest.getOrigin())) {
            return false;
        }
        if (!this.zze.equals(findAutocompletePredictionsRequest.getCountries())) {
            return false;
        }
        AutocompleteSessionToken autocompleteSessionToken = this.zzf;
        if (autocompleteSessionToken == null) {
            if (findAutocompletePredictionsRequest.getSessionToken() != null) {
                return false;
            }
        } else if (!autocompleteSessionToken.equals(findAutocompletePredictionsRequest.getSessionToken())) {
            return false;
        }
        TypeFilter typeFilter = this.zzg;
        if (typeFilter == null) {
            if (findAutocompletePredictionsRequest.getTypeFilter() != null) {
                return false;
            }
        } else if (!typeFilter.equals(findAutocompletePredictionsRequest.getTypeFilter())) {
            return false;
        }
        if (!this.zzh.equals(findAutocompletePredictionsRequest.getTypesFilter())) {
            return false;
        }
        Integer num = this.zzi;
        if (num == null) {
            if (findAutocompletePredictionsRequest.getInputOffset() != null) {
                return false;
            }
        } else if (!num.equals(findAutocompletePredictionsRequest.getInputOffset())) {
            return false;
        }
        String str2 = this.zzj;
        if (str2 == null) {
            if (findAutocompletePredictionsRequest.getRegionCode() != null) {
                return false;
            }
        } else if (!str2.equals(findAutocompletePredictionsRequest.getRegionCode())) {
            return false;
        }
        if (this.zzk != findAutocompletePredictionsRequest.isPureServiceAreaBusinessesIncluded()) {
            return false;
        }
        CancellationToken cancellationToken = this.zzl;
        if (cancellationToken == null) {
            if (findAutocompletePredictionsRequest.getCancellationToken() != null) {
                return false;
            }
        } else if (!cancellationToken.equals(findAutocompletePredictionsRequest.getCancellationToken())) {
            return false;
        }
        return true;
    }

    public final String toString() {
        CancellationToken cancellationToken = this.zzl;
        List list = this.zzh;
        TypeFilter typeFilter = this.zzg;
        AutocompleteSessionToken autocompleteSessionToken = this.zzf;
        List list2 = this.zze;
        LatLng latLng = this.zzd;
        LocationRestriction locationRestriction = this.zzc;
        String strValueOf = String.valueOf(this.zzb);
        String strValueOf2 = String.valueOf(locationRestriction);
        String strValueOf3 = String.valueOf(latLng);
        String string = list2.toString();
        String strValueOf4 = String.valueOf(autocompleteSessionToken);
        String strValueOf5 = String.valueOf(typeFilter);
        String string2 = list.toString();
        String strValueOf6 = String.valueOf(cancellationToken);
        String str = this.zza;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(strValueOf).length();
        int length3 = String.valueOf(strValueOf2).length();
        int length4 = String.valueOf(strValueOf3).length();
        int length5 = string.length();
        int length6 = String.valueOf(strValueOf4).length();
        int length7 = String.valueOf(strValueOf5).length();
        int length8 = string2.length();
        Integer num = this.zzi;
        int length9 = String.valueOf(num).length();
        String str2 = this.zzj;
        int length10 = String.valueOf(str2).length();
        boolean z = this.zzk;
        StringBuilder sb = new StringBuilder(length + 56 + length2 + 22 + length3 + 9 + length4 + 12 + length5 + 15 + length6 + 13 + length7 + 14 + length8 + 14 + length9 + 13 + length10 + 36 + String.valueOf(z).length() + 20 + String.valueOf(strValueOf6).length() + 1);
        sb.append("FindAutocompletePredictionsRequest{query=");
        sb.append(str);
        sb.append(", locationBias=");
        sb.append(strValueOf);
        sb.append(", locationRestriction=");
        sb.append(strValueOf2);
        sb.append(", origin=");
        sb.append(strValueOf3);
        sb.append(", countries=");
        sb.append(string);
        sb.append(", sessionToken=");
        sb.append(strValueOf4);
        sb.append(", typeFilter=");
        sb.append(strValueOf5);
        sb.append(", typesFilter=");
        sb.append(string2);
        sb.append(", inputOffset=");
        sb.append(num);
        sb.append(", regionCode=");
        sb.append(str2);
        sb.append(", pureServiceAreaBusinessesIncluded=");
        sb.append(z);
        sb.append(", cancellationToken=");
        sb.append(strValueOf6);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        String str = this.zza;
        int iHashCode = str == null ? 0 : str.hashCode();
        LocationBias locationBias = this.zzb;
        int iHashCode2 = locationBias == null ? 0 : locationBias.hashCode();
        LocationRestriction locationRestriction = this.zzc;
        int iHashCode3 = locationRestriction == null ? 0 : locationRestriction.hashCode();
        LatLng latLng = this.zzd;
        int iHashCode4 = latLng == null ? 0 : latLng.hashCode();
        int iHashCode5 = this.zze.hashCode();
        AutocompleteSessionToken autocompleteSessionToken = this.zzf;
        int iHashCode6 = autocompleteSessionToken == null ? 0 : autocompleteSessionToken.hashCode();
        TypeFilter typeFilter = this.zzg;
        int iHashCode7 = typeFilter == null ? 0 : typeFilter.hashCode();
        int iHashCode8 = this.zzh.hashCode();
        Integer num = this.zzi;
        int iHashCode9 = num == null ? 0 : num.hashCode();
        String str2 = this.zzj;
        int iHashCode10 = str2 == null ? 0 : str2.hashCode();
        int i = true != this.zzk ? 1237 : 1231;
        CancellationToken cancellationToken = this.zzl;
        return ((((((((((((((((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ iHashCode4) * 1000003) ^ iHashCode5) * 1000003) ^ iHashCode6) * 1000003) ^ iHashCode7) * 1000003) ^ iHashCode8) * 1000003) ^ iHashCode9) * 1000003) ^ iHashCode10) * 1000003) ^ i) * 1000003) ^ (cancellationToken != null ? cancellationToken.hashCode() : 0);
    }

    /* synthetic */ zzk(String str, LocationBias locationBias, LocationRestriction locationRestriction, LatLng latLng, List list, AutocompleteSessionToken autocompleteSessionToken, TypeFilter typeFilter, List list2, Integer num, String str2, boolean z, CancellationToken cancellationToken, byte[] bArr) {
        this.zza = str;
        this.zzb = locationBias;
        this.zzc = locationRestriction;
        this.zzd = latLng;
        this.zze = list;
        this.zzf = autocompleteSessionToken;
        this.zzg = typeFilter;
        this.zzh = list2;
        this.zzi = num;
        this.zzj = str2;
        this.zzk = z;
        this.zzl = cancellationToken;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest, com.google.android.libraries.places.internal.zzmg
    public final CancellationToken getCancellationToken() {
        return this.zzl;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest
    public final List<String> getCountries() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest
    public final Integer getInputOffset() {
        return this.zzi;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest
    public final LocationBias getLocationBias() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest
    public final LocationRestriction getLocationRestriction() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest
    public final LatLng getOrigin() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest
    public final String getQuery() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest
    public final String getRegionCode() {
        return this.zzj;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest
    public final AutocompleteSessionToken getSessionToken() {
        return this.zzf;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest
    @Deprecated
    public final TypeFilter getTypeFilter() {
        return this.zzg;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest
    public final List<String> getTypesFilter() {
        return this.zzh;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest
    public final boolean isPureServiceAreaBusinessesIncluded() {
        return this.zzk;
    }
}
