package com.google.android.libraries.places.api.net;

import com.google.android.gms.tasks.CancellationToken;
import com.google.android.libraries.places.api.model.EVSearchOptions;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.RoutingParameters;
import com.google.android.libraries.places.api.model.SearchAlongRouteParameters;
import com.google.android.libraries.places.internal.zzmg;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Range;
import defpackage.updateAndVerifyState;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class SearchByTextRequest implements zzmg {

    public static abstract class Builder {
        public SearchByTextRequest build() {
            setPlaceFields(ImmutableList.TuitionPaymentFragmentspecialinlinedviewModeldefault1(getPlaceFields()));
            setPriceLevels(ImmutableList.TuitionPaymentFragmentspecialinlinedviewModeldefault1(getPriceLevels()));
            Double minRating = getMinRating();
            Double dValueOf = Double.valueOf(5.0d);
            Double dValueOf2 = Double.valueOf(1.0d);
            if (minRating != null) {
                updateAndVerifyState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(minRating.doubleValue() >= 1.0d && minRating.doubleValue() <= 5.0d, "Min rating must not be out of range of %s to %s, but was: %s.", dValueOf2, dValueOf, minRating);
            }
            List<Integer> priceLevels = getPriceLevels();
            if (!priceLevels.isEmpty()) {
                for (Integer num : priceLevels) {
                    Range rangeTuitionPaymentFragmentspecialinlinedviewModeldefault2 = Range.TuitionPaymentFragmentspecialinlinedviewModeldefault2(0, 4);
                    updateAndVerifyState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(rangeTuitionPaymentFragmentspecialinlinedviewModeldefault2.lowerBound.b(num) && !rangeTuitionPaymentFragmentspecialinlinedviewModeldefault2.upperBound.b(num), "Price level must not be out of range of %s to %s, but was: %s.", dValueOf2, dValueOf, num);
                }
            }
            return zza();
        }

        public abstract CancellationToken getCancellationToken();

        public abstract EVSearchOptions getEvSearchOptions();

        public abstract String getIncludedType();

        public abstract LocationBias getLocationBias();

        public abstract LocationRestriction getLocationRestriction();

        public abstract Integer getMaxResultCount();

        public abstract Double getMinRating();

        public abstract List<Place.Field> getPlaceFields();

        public abstract List<Integer> getPriceLevels();

        public abstract RankPreference getRankPreference();

        public abstract String getRegionCode();

        public abstract RoutingParameters getRoutingParameters();

        public abstract SearchAlongRouteParameters getSearchAlongRouteParameters();

        public abstract String getTextQuery();

        public abstract boolean isOpenNow();

        public abstract boolean isPureServiceAreaBusinessesIncluded();

        public abstract boolean isRoutingSummariesIncluded();

        public abstract boolean isStrictTypeFiltering();

        public abstract Builder setCancellationToken(CancellationToken cancellationToken);

        public abstract Builder setEvSearchOptions(EVSearchOptions eVSearchOptions);

        public abstract Builder setIncludedType(String str);

        public abstract Builder setLocationBias(LocationBias locationBias);

        public abstract Builder setLocationRestriction(LocationRestriction locationRestriction);

        public abstract Builder setMaxResultCount(Integer num);

        public abstract Builder setMinRating(Double d);

        public abstract Builder setOpenNow(boolean z);

        public abstract Builder setPlaceFields(List<Place.Field> list);

        public abstract Builder setPriceLevels(List<Integer> list);

        public abstract Builder setPureServiceAreaBusinessesIncluded(boolean z);

        public abstract Builder setRankPreference(RankPreference rankPreference);

        public abstract Builder setRegionCode(String str);

        public abstract Builder setRoutingParameters(RoutingParameters routingParameters);

        public abstract Builder setRoutingSummariesIncluded(boolean z);

        public abstract Builder setSearchAlongRouteParameters(SearchAlongRouteParameters searchAlongRouteParameters);

        public abstract Builder setStrictTypeFiltering(boolean z);

        public abstract Builder setTextQuery(String str);

        abstract SearchByTextRequest zza();
    }

    public enum RankPreference {
        DISTANCE,
        RELEVANCE
    }

    public static Builder builder(String str, List<Place.Field> list) {
        zzs zzsVar = new zzs();
        zzsVar.setOpenNow(false);
        zzsVar.setPlaceFields(list);
        zzsVar.setPriceLevels(new ArrayList());
        zzsVar.setTextQuery(str);
        zzsVar.setStrictTypeFiltering(false);
        zzsVar.setRoutingSummariesIncluded(false);
        zzsVar.setPureServiceAreaBusinessesIncluded(false);
        return zzsVar;
    }

    public static SearchByTextRequest newInstance(String str, List<Place.Field> list) {
        return builder(str, list).build();
    }

    public abstract EVSearchOptions getEvSearchOptions();

    public abstract String getIncludedType();

    public abstract LocationBias getLocationBias();

    public abstract LocationRestriction getLocationRestriction();

    public abstract Integer getMaxResultCount();

    public abstract Double getMinRating();

    public abstract List<Place.Field> getPlaceFields();

    public abstract List<Integer> getPriceLevels();

    public abstract RankPreference getRankPreference();

    public abstract String getRegionCode();

    public abstract RoutingParameters getRoutingParameters();

    public abstract SearchAlongRouteParameters getSearchAlongRouteParameters();

    public abstract String getTextQuery();

    public abstract boolean isOpenNow();

    public abstract boolean isPureServiceAreaBusinessesIncluded();

    public abstract boolean isRoutingSummariesIncluded();

    public abstract boolean isStrictTypeFiltering();

    public abstract Builder zza();
}
