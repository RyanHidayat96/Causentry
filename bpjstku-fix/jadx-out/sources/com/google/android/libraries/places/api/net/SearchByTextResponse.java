package com.google.android.libraries.places.api.net;

import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.RoutingSummary;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class SearchByTextResponse {

    public static abstract class Builder {
        public abstract SearchByTextResponse autoBuild();

        public SearchByTextResponse build() {
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
        zzu zzuVar = new zzu();
        zzuVar.setPlaces(list);
        return zzuVar;
    }

    public static SearchByTextResponse newInstance(List<Place> list) {
        zzu zzuVar = new zzu();
        zzuVar.setPlaces(list);
        return zzuVar.build();
    }

    public abstract List<Place> getPlaces();

    public abstract List<RoutingSummary> getRoutingSummaries();
}
