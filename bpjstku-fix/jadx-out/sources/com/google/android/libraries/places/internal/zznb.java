package com.google.android.libraries.places.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;
import com.google.android.libraries.places.widget.model.AutocompleteUiCustomization;
import com.google.common.collect.ImmutableList;

/* JADX INFO: loaded from: classes3.dex */
final class zznb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new zznc((zzoh) parcel.readParcelable(zzng.class.getClassLoader()), (AutocompleteActivityMode) parcel.readParcelable(zzng.class.getClassLoader()), ImmutableList.TuitionPaymentFragmentspecialinlinedviewModeldefault1(parcel.readArrayList(Place.Field.class.getClassLoader())), (zzoc) parcel.readParcelable(zzng.class.getClassLoader()), (LatLng) parcel.readParcelable(zzng.class.getClassLoader()), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, (LocationBias) parcel.readParcelable(zzng.class.getClassLoader()), (LocationRestriction) parcel.readParcelable(zzng.class.getClassLoader()), ImmutableList.TuitionPaymentFragmentspecialinlinedviewModeldefault1(parcel.readArrayList(String.class.getClassLoader())), (TypeFilter) parcel.readParcelable(zzng.class.getClassLoader()), ImmutableList.TuitionPaymentFragmentspecialinlinedviewModeldefault1(parcel.readArrayList(String.class.getClassLoader())), parcel.readInt(), parcel.readInt(), parcel.readInt() == 0 ? parcel.readString() : null, (AutocompleteUiCustomization) parcel.readParcelable(zzng.class.getClassLoader()), parcel.readInt() == 1, (AutocompleteSessionToken) parcel.readParcelable(zzng.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zznc[i];
    }

    zznb() {
    }
}
