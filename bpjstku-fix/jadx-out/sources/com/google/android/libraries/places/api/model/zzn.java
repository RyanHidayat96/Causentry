package com.google.android.libraries.places.api.model;

import android.content.Context;
import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzn extends CircularBounds {
    public static int TuitionPaymentFragmentbindingInflater1;
    public static int b;
    private final LatLng zza;
    private final double zzb;

    zzn(LatLng latLng, double d) {
        if (latLng == null) {
            throw new NullPointerException("Null center");
        }
        this.zza = latLng;
        this.zzb = d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CircularBounds)) {
            return false;
        }
        CircularBounds circularBounds = (CircularBounds) obj;
        return this.zza.equals(circularBounds.getCenter()) && Double.doubleToLongBits(this.zzb) == Double.doubleToLongBits(circularBounds.getRadius());
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode();
        double d = this.zzb;
        return ((iHashCode ^ 1000003) * 1000003) ^ ((int) (Double.doubleToLongBits(d) ^ (Double.doubleToLongBits(d) >>> 32)));
    }

    public final String toString() {
        String string = this.zza.toString();
        int length = string.length();
        double d = this.zzb;
        StringBuilder sb = new StringBuilder(length + 31 + String.valueOf(d).length() + 1);
        sb.append("CircularBounds{center=");
        sb.append(string);
        sb.append(", radius=");
        sb.append(d);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.api.model.CircularBounds
    public final LatLng getCenter() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.CircularBounds
    public final double getRadius() {
        return this.zzb;
    }

    public static int TuitionPaymentFragmentbindingInflater1() {
        int i = TuitionPaymentFragmentbindingInflater1;
        int i2 = i % 8992279;
        TuitionPaymentFragmentbindingInflater1 = i + 1;
        if (i2 != 0) {
            return b;
        }
        int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenWidthDp;
        b = i3;
        return i3;
    }
}
