package com.google.android.libraries.places.api.model;

import android.os.Parcelable;
import com.google.common.collect.Range;
import defpackage.updateAndVerifyState;

/* JADX INFO: loaded from: classes3.dex */
public abstract class PlaceLikelihood implements Parcelable {
    public static final double LIKELIHOOD_MAX_VALUE = 1.0d;
    public static final double LIKELIHOOD_MIN_VALUE = 0.0d;

    public static PlaceLikelihood newInstance(Place place, double d) {
        Double dValueOf = Double.valueOf(0.0d);
        Double dValueOf2 = Double.valueOf(1.0d);
        Range rangeTuitionPaymentFragmentspecialinlinedviewModeldefault2 = Range.TuitionPaymentFragmentspecialinlinedviewModeldefault2(dValueOf, dValueOf2);
        Double dValueOf3 = Double.valueOf(d);
        updateAndVerifyState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(rangeTuitionPaymentFragmentspecialinlinedviewModeldefault2.lowerBound.b(dValueOf3) && !rangeTuitionPaymentFragmentspecialinlinedviewModeldefault2.upperBound.b(dValueOf3), "Likelihood must not be out-of-range: %s to %s, but was: %s.", dValueOf, dValueOf2, dValueOf3);
        return new zzdm(place, d);
    }

    public abstract double getLikelihood();

    public abstract Place getPlace();
}
