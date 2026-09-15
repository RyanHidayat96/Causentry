package com.google.android.libraries.places.api.net;

import com.google.android.gms.tasks.CancellationToken;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.internal.zzmg;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class FindCurrentPlaceRequest implements zzmg {

    public static abstract class Builder {
        public FindCurrentPlaceRequest build() {
            zza(ImmutableList.TuitionPaymentFragmentspecialinlinedviewModeldefault1(zzb().getPlaceFields()));
            return zzb();
        }

        public abstract CancellationToken getCancellationToken();

        public abstract Builder setCancellationToken(CancellationToken cancellationToken);

        abstract Builder zza(List list);

        abstract FindCurrentPlaceRequest zzb();
    }

    public static Builder builder(List<Place.Field> list) {
        zzm zzmVar = new zzm();
        zzmVar.zza(list);
        return zzmVar;
    }

    public static FindCurrentPlaceRequest newInstance(List<Place.Field> list) {
        return builder(list).build();
    }

    @Override // com.google.android.libraries.places.internal.zzmg
    public abstract CancellationToken getCancellationToken();

    public abstract List<Place.Field> getPlaceFields();
}
