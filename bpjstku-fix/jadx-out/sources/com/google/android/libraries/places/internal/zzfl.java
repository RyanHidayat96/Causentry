package com.google.android.libraries.places.internal;

import com.android.volley.AuthFailureError;
import com.android.volley.NetworkError;
import com.android.volley.ParseError;
import com.android.volley.ServerError;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.api.net.PlacesStatusCodes;

/* JADX INFO: loaded from: classes3.dex */
final class zzfl {
    static ApiException zza(VolleyError volleyError) {
        int i;
        if (volleyError instanceof NetworkError) {
            i = 7;
        } else if (volleyError instanceof TimeoutError) {
            i = 15;
        } else if ((volleyError instanceof ServerError) || (volleyError instanceof ParseError)) {
            i = 8;
        } else {
            i = volleyError instanceof AuthFailureError ? PlacesStatusCodes.REQUEST_DENIED : 13;
        }
        return new ApiException(new Status(i, String.format("Unexpected server error (HTTP Code: %s. Message: %s.)", volleyError.networkResponse == null ? "N/A" : String.valueOf(volleyError.networkResponse.statusCode), volleyError)));
    }

    static ApiException zzb(zzbjy zzbjyVar) {
        zzbjv zzbjvVarZzb = zzbjv.zzb(zzbjyVar);
        int iOrdinal = zzbjvVarZzb.zzg().ordinal();
        if (iOrdinal == 3) {
            return new ApiException(new Status(PlacesStatusCodes.INVALID_REQUEST, zzbjvVarZzb.zzh()));
        }
        if (iOrdinal == 4) {
            return new ApiException(new Status(15, zzbjvVarZzb.zzh()));
        }
        if (iOrdinal == 5) {
            return new ApiException(new Status(PlacesStatusCodes.NOT_FOUND, zzbjvVarZzb.zzh()));
        }
        if (iOrdinal == 7) {
            return new ApiException(new Status(PlacesStatusCodes.REQUEST_DENIED, zzbjvVarZzb.zzh()));
        }
        if (iOrdinal != 13) {
            return iOrdinal != 14 ? new ApiException(new Status(13, zzbjvVarZzb.zzh())) : new ApiException(new Status(7, zzbjvVarZzb.zzh()));
        }
        return new ApiException(new Status(8, zzbjvVarZzb.zzh()));
    }
}
