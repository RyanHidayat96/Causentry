package com.google.android.libraries.places.api.net;

import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.RoutingSummary;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
final class zzv extends SearchByTextResponse {
    private final List zza;
    private final List zzb;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SearchByTextResponse)) {
            return false;
        }
        SearchByTextResponse searchByTextResponse = (SearchByTextResponse) obj;
        if (!this.zza.equals(searchByTextResponse.getPlaces())) {
            return false;
        }
        List list = this.zzb;
        if (list == null) {
            if (searchByTextResponse.getRoutingSummaries() != null) {
                return false;
            }
        } else if (!list.equals(searchByTextResponse.getRoutingSummaries())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode();
        List list = this.zzb;
        return ((iHashCode ^ 1000003) * 1000003) ^ (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        String string = this.zza.toString();
        int length = string.length();
        String strValueOf = String.valueOf(this.zzb);
        StringBuilder sb = new StringBuilder(length + 47 + String.valueOf(strValueOf).length() + 1);
        sb.append("SearchByTextResponse{places=");
        sb.append(string);
        sb.append(", routingSummaries=");
        sb.append(strValueOf);
        sb.append("}");
        return sb.toString();
    }

    /* synthetic */ zzv(List list, List list2, byte[] bArr) {
        this.zza = list;
        this.zzb = list2;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextResponse
    public final List<Place> getPlaces() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextResponse
    public final List<RoutingSummary> getRoutingSummaries() {
        return this.zzb;
    }
}
