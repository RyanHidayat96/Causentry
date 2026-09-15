package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: loaded from: classes6.dex */
final class zzdy extends zzbe {
    public static final Parcelable.Creator<zzdy> CREATOR = new zzdx();

    zzdy(LatLng latLng, RoutingParameters.TravelMode travelMode, RouteModifiers routeModifiers, RoutingParameters.RoutingPreference routingPreference) {
        super(latLng, travelMode, routeModifiers, routingPreference);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(getOrigin(), i);
        parcel.writeParcelable(getTravelMode(), i);
        parcel.writeParcelable(getRouteModifiers(), i);
        parcel.writeParcelable(getRoutingPreference(), i);
    }
}
