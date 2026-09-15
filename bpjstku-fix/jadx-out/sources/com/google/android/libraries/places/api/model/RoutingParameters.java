package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: loaded from: classes4.dex */
public abstract class RoutingParameters implements Parcelable {

    /* JADX INFO: loaded from: classes6.dex */
    public static abstract class Builder {
        public abstract RoutingParameters build();

        public abstract LatLng getOrigin();

        public abstract RouteModifiers getRouteModifiers();

        public abstract RoutingPreference getRoutingPreference();

        public abstract TravelMode getTravelMode();

        public abstract Builder setOrigin(LatLng latLng);

        public abstract Builder setRouteModifiers(RouteModifiers routeModifiers);

        public abstract Builder setRoutingPreference(RoutingPreference routingPreference);

        public abstract Builder setTravelMode(TravelMode travelMode);
    }

    /* JADX INFO: loaded from: classes6.dex */
    public enum RoutingPreference implements Parcelable {
        ROUTING_PREFERENCE_UNSPECIFIED,
        TRAFFIC_UNAWARE,
        TRAFFIC_AWARE,
        TRAFFIC_AWARE_OPTIMAL;

        public static final Parcelable.Creator<RoutingPreference> CREATOR = new zzfa();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public enum TravelMode implements Parcelable {
        TRAVEL_MODE_UNSPECIFIED,
        DRIVE,
        BICYCLE,
        WALK,
        TWO_WHEELER;

        public static final Parcelable.Creator<TravelMode> CREATOR = new zzfb();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    public abstract LatLng getOrigin();

    public abstract RouteModifiers getRouteModifiers();

    public abstract RoutingPreference getRoutingPreference();

    public abstract TravelMode getTravelMode();

    public static Builder builder() {
        return new zzbd();
    }
}
