package com.google.android.libraries.places.api.net;

import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class FindAutocompletePredictionsResponse {
    public static FindAutocompletePredictionsResponse newInstance(List<AutocompletePrediction> list) {
        return new zzl(ImmutableList.TuitionPaymentFragmentspecialinlinedviewModeldefault1(list));
    }

    public abstract List<AutocompletePrediction> getAutocompletePredictions();
}
