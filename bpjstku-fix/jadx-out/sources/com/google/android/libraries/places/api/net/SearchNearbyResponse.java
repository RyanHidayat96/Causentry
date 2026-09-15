package com.google.android.libraries.places.api.net;

import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.RoutingSummary;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class SearchNearbyResponse {

    public static abstract class Builder {
        public abstract SearchNearbyResponse autoBuild();

        public SearchNearbyResponse build() {
            setPlaces(ImmutableList.TuitionPaymentFragmentspecialinlinedviewModeldefault1(getPlaces()));
            List<RoutingSummary> routingSummaries = getRoutingSummaries();
            if (routingSummaries != null) {
                setRoutingSummaries(ImmutableList.TuitionPaymentFragmentspecialinlinedviewModeldefault1(routingSummaries));
            }
            return autoBuild();
        }

        public abstract List<Place> getPlaces();

        public abstract List<RoutingSummary> getRoutingSummaries();

        public abstract Builder setPlaces(List<Place> list);

        public abstract Builder setRoutingSummaries(List<RoutingSummary> list);
    }

    public static Builder builder(List<Place> list) {
        zzy zzyVar = new zzy();
        zzyVar.setPlaces(list);
        return zzyVar;
    }

    public static SearchNearbyResponse newInstance(List<Place> list) {
        zzy zzyVar = new zzy();
        zzyVar.setPlaces(list);
        return zzyVar.build();
    }

    public abstract List<Place> getPlaces();

    public abstract List<RoutingSummary> getRoutingSummaries();
}
