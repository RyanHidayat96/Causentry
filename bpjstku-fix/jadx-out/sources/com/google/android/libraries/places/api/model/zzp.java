package com.google.android.libraries.places.api.model;

import java.time.Instant;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzp extends ConnectorAggregation {
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 189150127;
    private final EVConnectorType zza;
    private final Double zzb;
    private final Integer zzc;
    private final Integer zzd;
    private final Integer zze;
    private final Instant zzf;

    zzp(EVConnectorType eVConnectorType, Double d, Integer num, Integer num2, Integer num3, Instant instant) {
        if (eVConnectorType == null) {
            throw new NullPointerException("Null type");
        }
        this.zza = eVConnectorType;
        this.zzb = d;
        this.zzc = num;
        this.zzd = num2;
        this.zze = num3;
        this.zzf = instant;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectorAggregation)) {
            return false;
        }
        ConnectorAggregation connectorAggregation = (ConnectorAggregation) obj;
        if (!this.zza.equals(connectorAggregation.getType()) || !this.zzb.equals(connectorAggregation.getMaxChargeRateKw()) || !this.zzc.equals(connectorAggregation.getCount())) {
            return false;
        }
        Integer num = this.zzd;
        if (num == null) {
            if (connectorAggregation.getAvailableCount() != null) {
                return false;
            }
        } else if (!num.equals(connectorAggregation.getAvailableCount())) {
            return false;
        }
        Integer num2 = this.zze;
        if (num2 == null) {
            if (connectorAggregation.getOutOfServiceCount() != null) {
                return false;
            }
        } else if (!num2.equals(connectorAggregation.getOutOfServiceCount())) {
            return false;
        }
        Instant instant = this.zzf;
        if (instant == null) {
            if (connectorAggregation.getAvailabilityLastUpdateTime() != null) {
                return false;
            }
        } else if (!instant.equals(connectorAggregation.getAvailabilityLastUpdateTime())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode();
        int iHashCode2 = this.zzb.hashCode();
        int iHashCode3 = this.zzc.hashCode();
        Integer num = this.zzd;
        int iHashCode4 = num == null ? 0 : num.hashCode();
        Integer num2 = this.zze;
        int iHashCode5 = num2 == null ? 0 : num2.hashCode();
        Instant instant = this.zzf;
        return ((((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ iHashCode4) * 1000003) ^ iHashCode5) * 1000003) ^ (instant != null ? instant.hashCode() : 0);
    }

    public final String toString() {
        String string = this.zza.toString();
        int length = string.length();
        String strValueOf = String.valueOf(this.zzf);
        Double d = this.zzb;
        int length2 = d.toString().length();
        Integer num = this.zzc;
        int length3 = num.toString().length();
        Integer num2 = this.zzd;
        int length4 = String.valueOf(num2).length();
        Integer num3 = this.zze;
        StringBuilder sb = new StringBuilder(length + 44 + length2 + 8 + length3 + 17 + length4 + 20 + String.valueOf(num3).length() + 29 + String.valueOf(strValueOf).length() + 1);
        sb.append("ConnectorAggregation{type=");
        sb.append(string);
        sb.append(", maxChargeRateKw=");
        sb.append(d);
        sb.append(", count=");
        sb.append(num);
        sb.append(", availableCount=");
        sb.append(num2);
        sb.append(", outOfServiceCount=");
        sb.append(num3);
        sb.append(", availabilityLastUpdateTime=");
        sb.append(strValueOf);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.api.model.ConnectorAggregation
    public final Instant getAvailabilityLastUpdateTime() {
        return this.zzf;
    }

    @Override // com.google.android.libraries.places.api.model.ConnectorAggregation
    public final Integer getAvailableCount() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.model.ConnectorAggregation
    public final Integer getCount() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.model.ConnectorAggregation
    public final Double getMaxChargeRateKw() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.ConnectorAggregation
    public final Integer getOutOfServiceCount() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.api.model.ConnectorAggregation
    public final EVConnectorType getType() {
        return this.zza;
    }
}
