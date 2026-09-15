package com.google.android.libraries.places.internal;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.libraries.places.api.model.RouteModifiers;
import com.google.android.libraries.places.api.model.RoutingParameters;

/* JADX INFO: loaded from: classes3.dex */
final class zzjo {
    public static final zzaxm zza(RoutingParameters routingParameters) {
        int i;
        zzaxl zzaxlVarZza = zzaxm.zza();
        LatLng origin = routingParameters.getOrigin();
        if (origin != null) {
            zzaxlVarZza.zza(zzhf.zza(origin));
        }
        RoutingParameters.TravelMode travelMode = routingParameters.getTravelMode();
        int i2 = 5;
        if (travelMode != null) {
            int iOrdinal = travelMode.ordinal();
            if (iOrdinal == 1) {
                i = 3;
            } else if (iOrdinal == 2) {
                i = 4;
            } else if (iOrdinal != 3) {
                i = iOrdinal != 4 ? 2 : 6;
            } else {
                i = 5;
            }
            zzaxlVarZza.zzc(i);
        }
        RouteModifiers routeModifiers = routingParameters.getRouteModifiers();
        if (routeModifiers != null) {
            zzaxj zzaxjVarZza = zzaxk.zza();
            zzaxjVarZza.zza(routeModifiers.isTollAvoided());
            zzaxjVarZza.zzb(routeModifiers.isHighwayAvoided());
            zzaxjVarZza.zzc(routeModifiers.isFerryAvoided());
            zzaxjVarZza.zzd(routeModifiers.isIndoorAvoided());
            zzaxlVarZza.zzb((zzaxk) zzaxjVarZza.zzG());
        }
        RoutingParameters.RoutingPreference routingPreference = routingParameters.getRoutingPreference();
        if (routingPreference != null) {
            int iOrdinal2 = routingPreference.ordinal();
            if (iOrdinal2 == 1) {
                i2 = 3;
            } else if (iOrdinal2 == 2) {
                i2 = 4;
            } else if (iOrdinal2 != 3) {
                i2 = 2;
            }
            zzaxlVarZza.zzd(i2);
        }
        return (zzaxm) zzaxlVarZza.zzG();
    }

    zzjo(zzhf zzhfVar) {
    }
}
