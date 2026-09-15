package com.google.android.libraries.places.api.model;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
abstract class zzr extends EVChargeOptions {
    private final Integer zza;
    private final List zzb;

    zzr(Integer num, List list) {
        this.zza = num;
        if (list == null) {
            throw new NullPointerException("Null connectorAggregations");
        }
        this.zzb = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EVChargeOptions)) {
            return false;
        }
        EVChargeOptions eVChargeOptions = (EVChargeOptions) obj;
        return this.zza.equals(eVChargeOptions.getConnectorCount()) && this.zzb.equals(eVChargeOptions.getConnectorAggregations());
    }

    public final int hashCode() {
        return ((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode();
    }

    public final String toString() {
        String string = this.zzb.toString();
        Integer num = this.zza;
        StringBuilder sb = new StringBuilder(num.toString().length() + 55 + string.length() + 1);
        sb.append("EVChargeOptions{connectorCount=");
        sb.append(num);
        sb.append(", connectorAggregations=");
        sb.append(string);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.api.model.EVChargeOptions
    public final List<ConnectorAggregation> getConnectorAggregations() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.EVChargeOptions
    public final Integer getConnectorCount() {
        return this.zza;
    }
}
