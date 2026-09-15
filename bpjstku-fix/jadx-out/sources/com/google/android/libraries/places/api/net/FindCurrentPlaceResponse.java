package com.google.android.libraries.places.api.net;

import com.google.android.libraries.places.api.model.PlaceLikelihood;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class FindCurrentPlaceResponse {
    public static FindCurrentPlaceResponse newInstance(List<PlaceLikelihood> list) {
        return new zzo(ImmutableList.TuitionPaymentFragmentspecialinlinedviewModeldefault1(list));
    }

    public abstract List<PlaceLikelihood> getPlaceLikelihoods();
}
