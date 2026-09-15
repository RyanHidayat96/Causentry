package com.google.android.libraries.places.api.model;

/* JADX INFO: loaded from: classes3.dex */
abstract class zzas extends PlaceLikelihood {
    private final Place zza;
    private final double zzb;

    zzas(Place place, double d) {
        if (place == null) {
            throw new NullPointerException("Null place");
        }
        this.zza = place;
        this.zzb = d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PlaceLikelihood)) {
            return false;
        }
        PlaceLikelihood placeLikelihood = (PlaceLikelihood) obj;
        return this.zza.equals(placeLikelihood.getPlace()) && Double.doubleToLongBits(this.zzb) == Double.doubleToLongBits(placeLikelihood.getLikelihood());
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
        StringBuilder sb = new StringBuilder(length + 35 + String.valueOf(d).length() + 1);
        sb.append("PlaceLikelihood{place=");
        sb.append(string);
        sb.append(", likelihood=");
        sb.append(d);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.api.model.PlaceLikelihood
    public final double getLikelihood() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.PlaceLikelihood
    public final Place getPlace() {
        return this.zza;
    }
}
