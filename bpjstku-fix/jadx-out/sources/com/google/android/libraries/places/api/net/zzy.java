package com.google.android.libraries.places.api.net;

import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.RoutingSummary;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzy extends SearchNearbyResponse.Builder {
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -1326456784;
    private List zza;
    private List zzb;

    @Override // com.google.android.libraries.places.api.net.SearchNearbyResponse.Builder
    public final SearchNearbyResponse autoBuild() {
        List list = this.zza;
        if (list != null) {
            return new zzz(list, this.zzb, null);
        }
        throw new IllegalStateException("Missing required properties: places");
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyResponse.Builder
    public final List<Place> getPlaces() {
        List<Place> list = this.zza;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("Property \"places\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyResponse.Builder
    public final SearchNearbyResponse.Builder setPlaces(List<Place> list) {
        if (list == null) {
            throw new NullPointerException("Null places");
        }
        this.zza = list;
        return this;
    }

    zzy() {
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyResponse.Builder
    public final List<RoutingSummary> getRoutingSummaries() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.net.SearchNearbyResponse.Builder
    public final SearchNearbyResponse.Builder setRoutingSummaries(List<RoutingSummary> list) {
        this.zzb = list;
        return this;
    }
}
