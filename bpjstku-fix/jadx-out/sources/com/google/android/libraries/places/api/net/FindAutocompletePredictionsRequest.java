package com.google.android.libraries.places.api.net;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.internal.zzmg;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class FindAutocompletePredictionsRequest implements zzmg {

    public static abstract class Builder {
        public FindAutocompletePredictionsRequest build() {
            setCountries(ImmutableList.TuitionPaymentFragmentspecialinlinedviewModeldefault1(getCountries()));
            setTypesFilter(ImmutableList.TuitionPaymentFragmentspecialinlinedviewModeldefault1(getTypesFilter()));
            return zza();
        }

        public abstract CancellationToken getCancellationToken();

        public abstract List<String> getCountries();

        public abstract Integer getInputOffset();

        public abstract LocationBias getLocationBias();

        public abstract LocationRestriction getLocationRestriction();

        public abstract LatLng getOrigin();

        public abstract String getQuery();

        public abstract String getRegionCode();

        public abstract AutocompleteSessionToken getSessionToken();

        @Deprecated
        public abstract TypeFilter getTypeFilter();

        public abstract List<String> getTypesFilter();

        public abstract boolean isPureServiceAreaBusinessesIncluded();

        public abstract Builder setCancellationToken(CancellationToken cancellationToken);

        public abstract Builder setCountries(List<String> list);

        public Builder setCountries(String... strArr) {
            return setCountries(ImmutableList.TuitionPaymentFragmentspecialinlinedviewModeldefault3((Object[]) strArr));
        }

        @Deprecated
        public Builder setCountry(String str) {
            setCountries(str == null ? ImmutableList.asInterface() : ImmutableList.TuitionPaymentFragmentspecialinlinedviewModeldefault3(str));
            return this;
        }

        public abstract Builder setInputOffset(Integer num);

        public abstract Builder setLocationBias(LocationBias locationBias);

        public abstract Builder setLocationRestriction(LocationRestriction locationRestriction);

        public abstract Builder setOrigin(LatLng latLng);

        public abstract Builder setPureServiceAreaBusinessesIncluded(boolean z);

        public abstract Builder setQuery(String str);

        public abstract Builder setRegionCode(String str);

        public abstract Builder setSessionToken(AutocompleteSessionToken autocompleteSessionToken);

        @Deprecated
        public abstract Builder setTypeFilter(TypeFilter typeFilter);

        public abstract Builder setTypesFilter(List<String> list);

        abstract FindAutocompletePredictionsRequest zza();
    }

    public static Builder builder() {
        zzj zzjVar = new zzj();
        zzjVar.setCountries(new ArrayList());
        zzjVar.setTypesFilter(new ArrayList());
        zzjVar.setPureServiceAreaBusinessesIncluded(false);
        return zzjVar;
    }

    public static FindAutocompletePredictionsRequest newInstance(String str) {
        Builder builder = builder();
        builder.setQuery(str);
        return builder.build();
    }

    @Override // com.google.android.libraries.places.internal.zzmg
    public abstract CancellationToken getCancellationToken();

    public abstract List<String> getCountries();

    @Deprecated
    public String getCountry() {
        if (getCountries().size() > 1) {
            throw new UnsupportedOperationException("Multiple countries found in this request - use getCountries() instead of getCountry().");
        }
        Iterator<T> it = getCountries().iterator();
        return (String) (it.hasNext() ? it.next() : null);
    }

    public abstract Integer getInputOffset();

    public abstract LocationBias getLocationBias();

    public abstract LocationRestriction getLocationRestriction();

    public abstract LatLng getOrigin();

    public abstract String getQuery();

    public abstract String getRegionCode();

    public abstract AutocompleteSessionToken getSessionToken();

    @Deprecated
    public abstract TypeFilter getTypeFilter();

    public abstract List<String> getTypesFilter();

    public abstract boolean isPureServiceAreaBusinessesIncluded();
}
