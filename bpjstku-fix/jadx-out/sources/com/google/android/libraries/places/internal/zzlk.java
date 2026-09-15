package com.google.android.libraries.places.internal;

import android.location.Location;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.RectangularBounds;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import defpackage.recalculateAvailableCameras;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class zzlk {
    private static final ImmutableMap zza = ImmutableMap.TuitionPaymentFragmentspecialinlinedviewModeldefault1().TuitionPaymentFragmentbindingInflater1(zzfe.NONE, "NONE").TuitionPaymentFragmentbindingInflater1(zzfe.PSK, "WPA_PSK").TuitionPaymentFragmentbindingInflater1(zzfe.EAP, "WPA_EAP").TuitionPaymentFragmentbindingInflater1(zzfe.OTHER, "SECURED_NONE").TuitionPaymentFragmentspecialinlinedviewModeldefault3();

    public static String zzb(Location location) {
        if (location == null) {
            return null;
        }
        return zzf(location.getLatitude(), location.getLongitude());
    }

    public static String zzc(LatLng latLng) {
        if (latLng == null) {
            return null;
        }
        return zzf(latLng.latitude, latLng.longitude);
    }

    private static String zzf(double d, double d2) {
        return String.format(Locale.US, "%.15f,%.15f", Double.valueOf(d), Double.valueOf(d2));
    }

    private static String zzg(RectangularBounds rectangularBounds) {
        LatLng southwest = rectangularBounds.getSouthwest();
        double d = southwest.latitude;
        double d2 = southwest.longitude;
        LatLng northeast = rectangularBounds.getNortheast();
        return String.format(Locale.US, "rectangle:%.15f,%.15f|%.15f,%.15f", Double.valueOf(d), Double.valueOf(d2), Double.valueOf(northeast.latitude), Double.valueOf(northeast.longitude));
    }

    public static String zza(ImmutableList immutableList, int i) {
        StringBuilder sb = new StringBuilder();
        int size = immutableList.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzff zzffVar = (zzff) immutableList.get(i2);
            int length = sb.length();
            String strValueOf = String.valueOf(recalculateAvailableCameras.TuitionPaymentFragmentspecialinlinedviewModeldefault3(",").TuitionPaymentFragmentspecialinlinedviewModeldefault2("=").TuitionPaymentFragmentspecialinlinedviewModeldefault1(new StringBuilder(), ImmutableMap.TuitionPaymentFragmentspecialinlinedviewModeldefault1().TuitionPaymentFragmentbindingInflater1("mac", zzffVar.zza()).TuitionPaymentFragmentbindingInflater1("strength_dbm", Integer.valueOf(zzffVar.zzb())).TuitionPaymentFragmentbindingInflater1("wifi_auth_type", zza.get(zzffVar.zzc())).TuitionPaymentFragmentbindingInflater1("is_connected", Boolean.valueOf(zzffVar.zzd())).TuitionPaymentFragmentbindingInflater1("frequency_mhz", Integer.valueOf(zzffVar.zze())).TuitionPaymentFragmentspecialinlinedviewModeldefault3().entrySet().iterator()).toString());
            int length2 = sb.length();
            String strConcat = (length > 0 ? "|" : "").concat(strValueOf);
            if (length2 + strConcat.length() > 4000) {
                break;
            }
            sb.append(strConcat);
        }
        return sb.toString();
    }

    public static String zzd(LocationBias locationBias) {
        if (locationBias == null) {
            return null;
        }
        if (locationBias instanceof RectangularBounds) {
            return zzg((RectangularBounds) locationBias);
        }
        throw new AssertionError("Unknown LocationBias type.");
    }

    public static String zze(LocationRestriction locationRestriction) {
        if (locationRestriction == null) {
            return null;
        }
        if (locationRestriction instanceof RectangularBounds) {
            return zzg((RectangularBounds) locationRestriction);
        }
        throw new AssertionError("Unknown LocationRestriction type.");
    }
}
