package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.common.collect.ImmutableMap;

/* JADX INFO: loaded from: classes3.dex */
public final class zzlm {
    private static final ImmutableMap zza = ImmutableMap.TuitionPaymentFragmentspecialinlinedviewModeldefault1().TuitionPaymentFragmentbindingInflater1(TypeFilter.ADDRESS, PlaceTypes.ADDRESS).TuitionPaymentFragmentbindingInflater1(TypeFilter.CITIES, PlaceTypes.CITIES).TuitionPaymentFragmentbindingInflater1(TypeFilter.ESTABLISHMENT, PlaceTypes.ESTABLISHMENT).TuitionPaymentFragmentbindingInflater1(TypeFilter.GEOCODE, PlaceTypes.GEOCODE).TuitionPaymentFragmentbindingInflater1(TypeFilter.REGIONS, PlaceTypes.REGIONS).TuitionPaymentFragmentspecialinlinedviewModeldefault3();

    public static String zza(TypeFilter typeFilter) {
        String str = (String) zza.get(typeFilter);
        return str == null ? "" : str;
    }
}
