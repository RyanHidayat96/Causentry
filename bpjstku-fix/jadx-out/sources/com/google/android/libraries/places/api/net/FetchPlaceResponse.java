package com.google.android.libraries.places.api.net;

import com.google.android.libraries.places.api.model.Place;
import defpackage.Present;
import defpackage.setRotate;

/* JADX INFO: loaded from: classes3.dex */
public abstract class FetchPlaceResponse {
    public static FetchPlaceResponse newInstance(Place place) {
        return new zzf(place);
    }

    public abstract Place getPlace();

    public static /* synthetic */ void b() {
        setRotate.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0] = Present.TuitionPaymentFragmentbindingInflater1[0];
    }
}
