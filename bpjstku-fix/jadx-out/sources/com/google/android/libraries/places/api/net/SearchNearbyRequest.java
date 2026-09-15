package com.google.android.libraries.places.api.net;

import com.google.android.gms.tasks.CancellationToken;
import com.google.android.libraries.places.api.model.CircularBounds;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.RoutingParameters;
import com.google.android.libraries.places.internal.zzmg;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class SearchNearbyRequest implements zzmg {

    public static abstract class Builder {
        public SearchNearbyRequest build() {
            List<Place.Field> placeFields = getPlaceFields();
            boolean z = getLocationRestriction() instanceof CircularBounds;
            List<String> includedTypes = getIncludedTypes();
            List<String> excludedTypes = getExcludedTypes();
            List<String> includedPrimaryTypes = getIncludedPrimaryTypes();
            List<String> excludedPrimaryTypes = getExcludedPrimaryTypes();
            if (!z) {
                throw new IllegalArgumentException("LocationRestriction must be of type CircularBounds.");
            }
            setPlaceFields(ImmutableList.TuitionPaymentFragmentspecialinlinedviewModeldefault1(placeFields));
            if (includedTypes != null) {
                setIncludedTypes(ImmutableList.TuitionPaymentFragmentspecialinlinedviewModeldefault1(includedTypes));
            }
            if (excludedTypes != null) {
                setExcludedTypes(ImmutableList.TuitionPaymentFragmentspecialinlinedviewModeldefault1(excludedTypes));
            }
            if (includedPrimaryTypes != null) {
                setIncludedPrimaryTypes(ImmutableList.TuitionPaymentFragmentspecialinlinedviewModeldefault1(includedPrimaryTypes));
            }
            if (excludedPrimaryTypes != null) {
                setExcludedPrimaryTypes(ImmutableList.TuitionPaymentFragmentspecialinlinedviewModeldefault1(excludedPrimaryTypes));
            }
            return zza();
        }

        public abstract CancellationToken getCancellationToken();

        public abstract List<String> getExcludedPrimaryTypes();

        public abstract List<String> getExcludedTypes();

        public abstract List<String> getIncludedPrimaryTypes();

        public abstract List<String> getIncludedTypes();

        public abstract LocationRestriction getLocationRestriction();

        public abstract Integer getMaxResultCount();

        public abstract List<Place.Field> getPlaceFields();

        public abstract RankPreference getRankPreference();

        public abstract String getRegionCode();

        public abstract RoutingParameters getRoutingParameters();

        public abstract boolean isRoutingSummariesIncluded();

        public abstract Builder setCancellationToken(CancellationToken cancellationToken);

        public abstract Builder setExcludedPrimaryTypes(List<String> list);

        public abstract Builder setExcludedTypes(List<String> list);

        public abstract Builder setIncludedPrimaryTypes(List<String> list);

        public abstract Builder setIncludedTypes(List<String> list);

        public abstract Builder setLocationRestriction(LocationRestriction locationRestriction);

        public abstract Builder setMaxResultCount(Integer num);

        public abstract Builder setPlaceFields(List<Place.Field> list);

        public abstract Builder setRankPreference(RankPreference rankPreference);

        public abstract Builder setRegionCode(String str);

        public abstract Builder setRoutingParameters(RoutingParameters routingParameters);

        public abstract Builder setRoutingSummariesIncluded(boolean z);

        abstract SearchNearbyRequest zza();
    }

    public enum RankPreference {
        DISTANCE,
        POPULARITY
    }

    public static Builder builder(LocationRestriction locationRestriction, List<Place.Field> list) {
        zzw zzwVar = new zzw();
        zzwVar.setLocationRestriction(locationRestriction);
        zzwVar.setPlaceFields(list);
        zzwVar.setRoutingSummariesIncluded(false);
        return zzwVar;
    }

    public static SearchNearbyRequest newInstance(LocationRestriction locationRestriction, List<Place.Field> list) {
        return builder(locationRestriction, list).build();
    }

    @Override // com.google.android.libraries.places.internal.zzmg
    public abstract CancellationToken getCancellationToken();

    public abstract List<String> getExcludedPrimaryTypes();

    public abstract List<String> getExcludedTypes();

    public abstract List<String> getIncludedPrimaryTypes();

    public abstract List<String> getIncludedTypes();

    public abstract LocationRestriction getLocationRestriction();

    public abstract Integer getMaxResultCount();

    public abstract List<Place.Field> getPlaceFields();

    public abstract RankPreference getRankPreference();

    public abstract String getRegionCode();

    public abstract RoutingParameters getRoutingParameters();

    public abstract boolean isRoutingSummariesIncluded();

    public abstract Builder zza();
}
