package com.google.android.libraries.places.internal;

import android.text.TextUtils;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class zzkj extends zzks {
    zzkj(FindAutocompletePredictionsRequest findAutocompletePredictionsRequest, Locale locale, String str, zzmx zzmxVar) {
        super(findAutocompletePredictionsRequest, locale, str, zzmxVar);
    }

    @Override // com.google.android.libraries.places.internal.zzks
    public final Map zze() {
        HashMap map = new HashMap();
        FindAutocompletePredictionsRequest findAutocompletePredictionsRequest = (FindAutocompletePredictionsRequest) zza();
        TypeFilter typeFilter = findAutocompletePredictionsRequest.getTypeFilter();
        List<String> typesFilter = findAutocompletePredictionsRequest.getTypesFilter();
        String query = findAutocompletePredictionsRequest.getQuery();
        zzg(map, "input", query == null ? null : query.replaceFirst("^\\s+", "").replaceFirst("\\s+$", " "), null);
        zzg(map, "types", typesFilter.isEmpty() ? typeFilter != null ? zzlm.zza(typeFilter) : null : TextUtils.join("|", typesFilter), null);
        zzg(map, "sessiontoken", findAutocompletePredictionsRequest.getSessionToken(), null);
        zzg(map, "origin", zzlk.zzc(findAutocompletePredictionsRequest.getOrigin()), null);
        zzg(map, "locationbias", zzlk.zzd(findAutocompletePredictionsRequest.getLocationBias()), null);
        zzg(map, "locationrestriction", zzlk.zze(findAutocompletePredictionsRequest.getLocationRestriction()), null);
        List<String> countries = findAutocompletePredictionsRequest.getCountries();
        StringBuilder sb = new StringBuilder();
        for (String str : countries) {
            String strConcat = TextUtils.isEmpty(str) ? null : "country:".concat(String.valueOf(str.toLowerCase(Locale.US)));
            if (strConcat != null) {
                if (sb.length() != 0) {
                    sb.append('|');
                }
                sb.append(strConcat);
            }
        }
        zzg(map, "components", sb.length() == 0 ? null : sb.toString(), null);
        return map;
    }

    @Override // com.google.android.libraries.places.internal.zzks
    protected final String zzf() {
        return "autocomplete/json";
    }
}
