package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: loaded from: classes6.dex */
final class zzdx implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new zzdy((LatLng) parcel.readParcelable(RoutingParameters.class.getClassLoader()), (RoutingParameters.TravelMode) parcel.readParcelable(RoutingParameters.class.getClassLoader()), (RouteModifiers) parcel.readParcelable(RoutingParameters.class.getClassLoader()), (RoutingParameters.RoutingPreference) parcel.readParcelable(RoutingParameters.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzdy[i];
    }

    zzdx() {
    }
}
