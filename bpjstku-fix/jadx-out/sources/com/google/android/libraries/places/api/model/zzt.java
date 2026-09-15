package com.google.android.libraries.places.api.model;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzt extends EVSearchOptions {
    private final Double zza;
    private final List zzb;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EVSearchOptions)) {
            return false;
        }
        EVSearchOptions eVSearchOptions = (EVSearchOptions) obj;
        Double d = this.zza;
        if (d == null) {
            if (eVSearchOptions.getMinimumChargingRateKw() != null) {
                return false;
            }
        } else if (!d.equals(eVSearchOptions.getMinimumChargingRateKw())) {
            return false;
        }
        List list = this.zzb;
        if (list == null) {
            if (eVSearchOptions.getConnectorTypes() != null) {
                return false;
            }
        } else if (!list.equals(eVSearchOptions.getConnectorTypes())) {
            return false;
        }
        return true;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzb);
        Double d = this.zza;
        StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 55 + String.valueOf(strValueOf).length() + 1);
        sb.append("EVSearchOptions{minimumChargingRateKw=");
        sb.append(d);
        sb.append(", connectorTypes=");
        sb.append(strValueOf);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        Double d = this.zza;
        int iHashCode = d == null ? 0 : d.hashCode();
        List list = this.zzb;
        return ((iHashCode ^ 1000003) * 1000003) ^ (list != null ? list.hashCode() : 0);
    }

    zzt(Double d, List list) {
        this.zza = d;
        this.zzb = list;
    }

    @Override // com.google.android.libraries.places.api.model.EVSearchOptions
    public final List<EVConnectorType> getConnectorTypes() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.EVSearchOptions
    public final Double getMinimumChargingRateKw() {
        return this.zza;
    }
}
