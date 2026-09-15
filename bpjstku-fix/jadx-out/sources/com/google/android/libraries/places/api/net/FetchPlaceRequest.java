package com.google.android.libraries.places.api.net;

import com.google.android.gms.tasks.CancellationToken;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.internal.zzmg;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class FetchPlaceRequest implements zzmg {

    public static abstract class Builder {
        public FetchPlaceRequest build() {
            zzb(ImmutableList.TuitionPaymentFragmentspecialinlinedviewModeldefault1(zzc().getPlaceFields()));
            return zzc();
        }

        public abstract CancellationToken getCancellationToken();

        public abstract String getRegionCode();

        public abstract AutocompleteSessionToken getSessionToken();

        public abstract Builder setCancellationToken(CancellationToken cancellationToken);

        public abstract Builder setRegionCode(String str);

        public abstract Builder setSessionToken(AutocompleteSessionToken autocompleteSessionToken);

        abstract Builder zzb(List list);

        abstract FetchPlaceRequest zzc();
    }

    public static Builder builder(String str, List<Place.Field> list) {
        zzd zzdVar = new zzd();
        zzdVar.zza(str);
        zzdVar.zzb(list);
        return zzdVar;
    }

    public static FetchPlaceRequest newInstance(String str, List<Place.Field> list) {
        return builder(str, list).build();
    }

    @Override // com.google.android.libraries.places.internal.zzmg
    public abstract CancellationToken getCancellationToken();

    public abstract List<Place.Field> getPlaceFields();

    public abstract String getPlaceId();

    public abstract String getRegionCode();

    public abstract AutocompleteSessionToken getSessionToken();
}
