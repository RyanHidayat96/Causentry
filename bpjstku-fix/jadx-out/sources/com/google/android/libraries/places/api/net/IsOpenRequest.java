package com.google.android.libraries.places.api.net;

import com.google.android.gms.tasks.CancellationToken;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.internal.zzmg;

/* JADX INFO: loaded from: classes3.dex */
public abstract class IsOpenRequest implements zzmg {

    public static abstract class Builder {
        public IsOpenRequest build() {
            IsOpenRequest isOpenRequestZza = zza();
            Place place = isOpenRequestZza.getPlace();
            if (place != null) {
                if (!(place.getId() != null)) {
                    throw new IllegalArgumentException("Place must have a valid place id.");
                }
            }
            return isOpenRequestZza;
        }

        public abstract CancellationToken getCancellationToken();

        public abstract Place getPlace();

        public abstract String getPlaceId();

        public abstract long getUtcTimeMillis();

        public abstract Builder setCancellationToken(CancellationToken cancellationToken);

        public abstract Builder setPlace(Place place);

        public abstract Builder setPlaceId(String str);

        public abstract Builder setUtcTimeMillis(long j);

        abstract IsOpenRequest zza();
    }

    public static Builder builder(Place place) {
        zzp zzpVar = new zzp();
        zzpVar.setPlace(place);
        zzpVar.setUtcTimeMillis(System.currentTimeMillis());
        return zzpVar;
    }

    public static IsOpenRequest newInstance(Place place) {
        return builder(place).build();
    }

    @Override // com.google.android.libraries.places.internal.zzmg
    public abstract CancellationToken getCancellationToken();

    public abstract Place getPlace();

    public abstract String getPlaceId();

    public abstract long getUtcTimeMillis();

    public static IsOpenRequest newInstance(Place place, long j) {
        return builder(place, j).build();
    }

    public static Builder builder(Place place, long j) {
        zzp zzpVar = new zzp();
        zzpVar.setPlace(place);
        zzpVar.setUtcTimeMillis(j);
        return zzpVar;
    }

    public static IsOpenRequest newInstance(String str) {
        return builder(str).build();
    }

    public static Builder builder(String str) {
        zzp zzpVar = new zzp();
        zzpVar.setPlaceId(str);
        zzpVar.setUtcTimeMillis(System.currentTimeMillis());
        return zzpVar;
    }

    public static IsOpenRequest newInstance(String str, long j) {
        return builder(str, j).build();
    }

    public static Builder builder(String str, long j) {
        zzp zzpVar = new zzp();
        zzpVar.setPlaceId(str);
        zzpVar.setUtcTimeMillis(j);
        return zzpVar;
    }
}
