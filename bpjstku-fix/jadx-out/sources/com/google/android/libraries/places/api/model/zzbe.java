package com.google.android.libraries.places.api.model;

import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzbe extends RoutingParameters {
    private final LatLng zza;
    private final RoutingParameters.TravelMode zzb;
    private final RouteModifiers zzc;
    private final RoutingParameters.RoutingPreference zzd;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RoutingParameters)) {
            return false;
        }
        RoutingParameters routingParameters = (RoutingParameters) obj;
        LatLng latLng = this.zza;
        if (latLng == null) {
            if (routingParameters.getOrigin() != null) {
                return false;
            }
        } else if (!latLng.equals(routingParameters.getOrigin())) {
            return false;
        }
        RoutingParameters.TravelMode travelMode = this.zzb;
        if (travelMode == null) {
            if (routingParameters.getTravelMode() != null) {
                return false;
            }
        } else if (!travelMode.equals(routingParameters.getTravelMode())) {
            return false;
        }
        RouteModifiers routeModifiers = this.zzc;
        if (routeModifiers == null) {
            if (routingParameters.getRouteModifiers() != null) {
                return false;
            }
        } else if (!routeModifiers.equals(routingParameters.getRouteModifiers())) {
            return false;
        }
        RoutingParameters.RoutingPreference routingPreference = this.zzd;
        if (routingPreference == null) {
            if (routingParameters.getRoutingPreference() != null) {
                return false;
            }
        } else if (!routingPreference.equals(routingParameters.getRoutingPreference())) {
            return false;
        }
        return true;
    }

    public final String toString() {
        RoutingParameters.RoutingPreference routingPreference = this.zzd;
        RouteModifiers routeModifiers = this.zzc;
        RoutingParameters.TravelMode travelMode = this.zzb;
        String strValueOf = String.valueOf(this.zza);
        String strValueOf2 = String.valueOf(travelMode);
        String strValueOf3 = String.valueOf(routeModifiers);
        String strValueOf4 = String.valueOf(routingPreference);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 38 + String.valueOf(strValueOf2).length() + 17 + String.valueOf(strValueOf3).length() + 20 + String.valueOf(strValueOf4).length() + 1);
        sb.append("RoutingParameters{origin=");
        sb.append(strValueOf);
        sb.append(", travelMode=");
        sb.append(strValueOf2);
        sb.append(", routeModifiers=");
        sb.append(strValueOf3);
        sb.append(", routingPreference=");
        sb.append(strValueOf4);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        LatLng latLng = this.zza;
        int iHashCode = latLng == null ? 0 : latLng.hashCode();
        RoutingParameters.TravelMode travelMode = this.zzb;
        int iHashCode2 = travelMode == null ? 0 : travelMode.hashCode();
        RouteModifiers routeModifiers = this.zzc;
        int iHashCode3 = routeModifiers == null ? 0 : routeModifiers.hashCode();
        RoutingParameters.RoutingPreference routingPreference = this.zzd;
        return ((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ (routingPreference != null ? routingPreference.hashCode() : 0);
    }

    zzbe(LatLng latLng, RoutingParameters.TravelMode travelMode, RouteModifiers routeModifiers, RoutingParameters.RoutingPreference routingPreference) {
        this.zza = latLng;
        this.zzb = travelMode;
        this.zzc = routeModifiers;
        this.zzd = routingPreference;
    }

    @Override // com.google.android.libraries.places.api.model.RoutingParameters
    public final LatLng getOrigin() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.RoutingParameters
    public final RouteModifiers getRouteModifiers() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.model.RoutingParameters
    public final RoutingParameters.RoutingPreference getRoutingPreference() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.model.RoutingParameters
    public final RoutingParameters.TravelMode getTravelMode() {
        return this.zzb;
    }
}
