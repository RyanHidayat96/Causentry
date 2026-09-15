package com.google.android.libraries.places.internal;

import android.location.Location;
import com.google.android.libraries.places.api.net.FindCurrentPlaceRequest;
import com.google.common.collect.ImmutableList;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class zzkn extends zzks {
    private final Location zza;
    private final ImmutableList zzb;

    zzkn(FindCurrentPlaceRequest findCurrentPlaceRequest, Location location, ImmutableList immutableList, Locale locale, String str, zzmx zzmxVar) {
        super(findCurrentPlaceRequest, locale, str, zzmxVar);
        this.zza = location;
        this.zzb = immutableList;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0042  */
    @Override // com.google.android.libraries.places.internal.zzks
    public final Map zze() {
        Integer numValueOf;
        FindCurrentPlaceRequest findCurrentPlaceRequest = (FindCurrentPlaceRequest) zza();
        HashMap map = new HashMap();
        Location location = this.zza;
        zzg(map, FirebaseAnalytics.Param.LOCATION, zzlk.zzb(location), null);
        zzg(map, "wifiaccesspoints", zzlk.zza(this.zzb, 4000), null);
        if (location == null) {
            numValueOf = null;
        } else {
            float accuracy = location.getAccuracy();
            if (!location.hasAccuracy() || accuracy <= 0.0f) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(Math.round(accuracy * 100.0f));
            }
        }
        zzg(map, "precision", numValueOf, null);
        zzg(map, "timestamp", Long.valueOf(location.getTime()), null);
        zzg(map, "fields", zzll.zzb(findCurrentPlaceRequest.getPlaceFields()), null);
        return map;
    }

    @Override // com.google.android.libraries.places.internal.zzks
    protected final String zzf() {
        return "findplacefromuserlocation/json";
    }
}
