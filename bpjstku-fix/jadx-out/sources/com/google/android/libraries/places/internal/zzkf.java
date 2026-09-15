package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.api.net.FetchPlaceRequest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class zzkf extends zzks {
    zzkf(FetchPlaceRequest fetchPlaceRequest, Locale locale, String str, zzmx zzmxVar) {
        super(fetchPlaceRequest, locale, str, zzmxVar);
    }

    @Override // com.google.android.libraries.places.internal.zzks
    public final Map zze() {
        FetchPlaceRequest fetchPlaceRequest = (FetchPlaceRequest) zza();
        HashMap map = new HashMap();
        zzg(map, "placeid", fetchPlaceRequest.getPlaceId(), null);
        zzg(map, "sessiontoken", fetchPlaceRequest.getSessionToken(), null);
        zzg(map, "fields", zzll.zzb(fetchPlaceRequest.getPlaceFields()), null);
        return map;
    }

    @Override // com.google.android.libraries.places.internal.zzks
    protected final String zzf() {
        return "details/json";
    }
}
