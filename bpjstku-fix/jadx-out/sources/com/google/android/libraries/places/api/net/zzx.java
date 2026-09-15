package com.google.android.libraries.places.api.net;

import com.google.android.gms.tasks.CancellationToken;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.RoutingParameters;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
final class zzx extends SearchNearbyRequest {
    private final String zza;
    private final List zzb;
    private final List zzc;
    private final List zzd;
    private final List zze;
    private final Integer zzf;
    private final LocationRestriction zzg;
    private final List zzh;
    private final CancellationToken zzi;
    private final SearchNearbyRequest.RankPreference zzj;
    private final RoutingParameters zzk;
    private final boolean zzl;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SearchNearbyRequest)) {
            return false;
        }
        SearchNearbyRequest searchNearbyRequest = (SearchNearbyRequest) obj;
        String str = this.zza;
        if (str == null) {
            if (searchNearbyRequest.getRegionCode() != null) {
                return false;
            }
        } else if (!str.equals(searchNearbyRequest.getRegionCode())) {
            return false;
        }
        List list = this.zzb;
        if (list == null) {
            if (searchNearbyRequest.getIncludedTypes() != null) {
                return false;
            }
        } else if (!list.equals(searchNearbyRequest.getIncludedTypes())) {
            return false;
        }
        List list2 = this.zzc;
        if (list2 == null) {
            if (searchNearbyRequest.getExcludedTypes() != null) {
                return false;
            }
        } else if (!list2.equals(searchNearbyRequest.getExcludedTypes())) {
            return false;
        }
        List list3 = this.zzd;
        if (list3 == null) {
            if (searchNearbyRequest.getIncludedPrimaryTypes() != null) {
                return false;
            }
        } else if (!list3.equals(searchNearbyRequest.getIncludedPrimaryTypes())) {
            return false;
        }
        List list4 = this.zze;
        if (list4 == null) {
            if (searchNearbyRequest.getExcludedPrimaryTypes() != null) {
                return false;
            }
        } else if (!list4.equals(searchNearbyRequest.getExcludedPrimaryTypes())) {
            return false;
        }
        Integer num = this.zzf;
        if (num == null) {
            if (searchNearbyRequest.getMaxResultCount() != null) {
                return false;
            }
        } else if (!num.equals(searchNearbyRequest.getMaxResultCount())) {
            return false;
        }
        if (!this.zzg.equals(searchNearbyRequest.getLocationRestriction()) || !this.zzh.equals(searchNearbyRequest.getPlaceFields())) {
            return false;
        }
        CancellationToken cancellationToken = this.zzi;
        if (cancellationToken == null) {
            if (searchNearbyRequest.getCancellationToken() != null) {
                return false;
            }
        } else if (!cancellationToken.equals(searchNearbyRequest.getCancellationToken())) {
            return false;
        }
        SearchNearbyRequest.RankPreference rankPreference = this.zzj;
        if (rankPreference == null) {
            if (searchNearbyRequest.getRankPreference() != null) {
                return false;
            }
        } else if (!rankPreference.equals(searchNearbyRequest.getRankPreference())) {
            return false;
        }
        RoutingParameters routingParameters = this.zzk;
        if (routingParameters == null) {
            if (searchNearbyRequest.getRoutingParameters() != null) {
                return false;
            }
        } else if (!routingParameters.equals(searchNearbyRequest.getRoutingParameters())) {
            return false;
        }
        return this.zzl == searchNearbyRequest.isRoutingSummariesIncluded();
    }

    public final String toString() {
        RoutingParameters routingParameters = this.zzk;
        SearchNearbyRequest.RankPreference rankPreference = this.zzj;
        CancellationToken cancellationToken = this.zzi;
        List list = this.zzh;
        LocationRestriction locationRestriction = this.zzg;
        List list2 = this.zze;
        List list3 = this.zzd;
        List list4 = this.zzc;
        String strValueOf = String.valueOf(this.zzb);
        String strValueOf2 = String.valueOf(list4);
        String strValueOf3 = String.valueOf(list3);
        String strValueOf4 = String.valueOf(list2);
        String string = locationRestriction.toString();
        String string2 = list.toString();
        String strValueOf5 = String.valueOf(cancellationToken);
        String strValueOf6 = String.valueOf(rankPreference);
        String strValueOf7 = String.valueOf(routingParameters);
        String str = this.zza;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(strValueOf).length();
        int length3 = String.valueOf(strValueOf2).length();
        int length4 = String.valueOf(strValueOf3).length();
        int length5 = String.valueOf(strValueOf4).length();
        Integer num = this.zzf;
        int length6 = String.valueOf(num).length();
        int length7 = string.length();
        int length8 = string2.length();
        int length9 = String.valueOf(strValueOf5).length();
        int length10 = String.valueOf(strValueOf6).length();
        int length11 = String.valueOf(strValueOf7).length();
        boolean z = this.zzl;
        StringBuilder sb = new StringBuilder(length + 47 + length2 + 16 + length3 + 23 + length4 + 23 + length5 + 17 + length6 + 22 + length7 + 14 + length8 + 20 + length9 + 17 + length10 + 20 + length11 + 27 + String.valueOf(z).length() + 1);
        sb.append("SearchNearbyRequest{regionCode=");
        sb.append(str);
        sb.append(", includedTypes=");
        sb.append(strValueOf);
        sb.append(", excludedTypes=");
        sb.append(strValueOf2);
        sb.append(", includedPrimaryTypes=");
        sb.append(strValueOf3);
        sb.append(", excludedPrimaryTypes=");
        sb.append(strValueOf4);
        sb.append(", maxResultCount=");
        sb.append(num);
        sb.append(", locationRestriction=");
        sb.append(string);
        sb.append(", placeFields=");
        sb.append(string2);
        sb.append(", cancellationToken=");
        sb.append(strValueOf5);
        sb.append(", rankPreference=");
        sb.append(strValueOf6);
        sb.append(", routingParameters=");
        sb.append(strValueOf7);
        sb.append(", routingSummariesIncluded=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        String str = this.zza;
        int iHashCode = str == null ? 0 : str.hashCode();
        List list = this.zzb;
        int iHashCode2 = list == null ? 0 : list.hashCode();
        List list2 = this.zzc;
        int iHashCode3 = list2 == null ? 0 : list2.hashCode();
        List list3 = this.zzd;
        int iHashCode4 = list3 == null ? 0 : list3.hashCode();
        List list4 = this.zze;
        int iHashCode5 = list4 == null ? 0 : list4.hashCode();
        Integer num = this.zzf;
        int iHashCode6 = num == null ? 0 : num.hashCode();
        int iHashCode7 = this.zzg.hashCode();
        int iHashCode8 = this.zzh.hashCode();
        CancellationToken cancellationToken = this.zzi;
        int iHashCode9 = cancellationToken == null ? 0 : cancellationToken.hashCode();
        SearchNearbyRequest.RankPreference rankPreference = this.zzj;
        int iHashCode10 = rankPreference == null ? 0 : rankPreference.hashCode();
        RoutingParameters routingParameters = this.zzk;
        return ((((((((((((((((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ iHashCode4) * 1000003) ^ iHashCode5) * 1000003) ^ iHashCode6) * 1000003) ^ iHashCode7) * 1000003) ^ iHashCode8) * 1000003) ^ iHashCode9) * 1000003) ^ iHashCode10) * 1000003) ^ (routingParameters != null ? routingParameters.hashCode() : 0)) * 1000003) ^ (true != this.zzl ? 1237 : 1231);
    }

    /* synthetic */ zzx(String str, List list, List list2, List list3, List list4, Integer num, LocationRestriction locationRestriction, List list5, CancellationToken cancellationToken, SearchNearbyRequest.RankPreference rankPreference, RoutingParameters routingParameters, boolean z, byte[] bArr) {
        this.zza = str;
        this.zzb = list;
        this.zzc = list2;
        this.zzd = list3;
        this.zze = list4;
        this.zzf = num;
        this.zzg = locationRestriction;
        this.zzh = list5;
        this.zzi = cancellationToken;
        this.zzj = rankPreference;
        this.zzk = routingParameters;
        this.zzl = z;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest, com.google.android.libraries.places.internal.zzmg
    public final CancellationToken getCancellationToken() {
        return this.zzi;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest
    public final List<String> getExcludedPrimaryTypes() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest
    public final List<String> getExcludedTypes() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest
    public final List<String> getIncludedPrimaryTypes() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest
    public final List<String> getIncludedTypes() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest
    public final LocationRestriction getLocationRestriction() {
        return this.zzg;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest
    public final Integer getMaxResultCount() {
        return this.zzf;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest
    public final List<Place.Field> getPlaceFields() {
        return this.zzh;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest
    public final SearchNearbyRequest.RankPreference getRankPreference() {
        return this.zzj;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest
    public final String getRegionCode() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest
    public final RoutingParameters getRoutingParameters() {
        return this.zzk;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest
    public final boolean isRoutingSummariesIncluded() {
        return this.zzl;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyRequest
    public final SearchNearbyRequest.Builder zza() {
        return new zzw(this);
    }
}
