package com.google.android.libraries.places.api.model;

import java.time.Instant;

/* JADX INFO: loaded from: classes4.dex */
final class zzo extends ConnectorAggregation.Builder {
    private EVConnectorType zza;
    private Double zzb;
    private Integer zzc;
    private Integer zzd;
    private Integer zze;
    private Instant zzf;

    @Override // com.google.android.libraries.places.api.model.ConnectorAggregation.Builder
    public final ConnectorAggregation build() {
        Double d;
        Integer num;
        EVConnectorType eVConnectorType = this.zza;
        if (eVConnectorType != null && (d = this.zzb) != null && (num = this.zzc) != null) {
            return new zzcg(eVConnectorType, d, num, this.zzd, this.zze, this.zzf);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zza == null) {
            sb.append(" type");
        }
        if (this.zzb == null) {
            sb.append(" maxChargeRateKw");
        }
        if (this.zzc == null) {
            sb.append(" count");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // com.google.android.libraries.places.api.model.ConnectorAggregation.Builder
    public final ConnectorAggregation.Builder setCount(Integer num) {
        if (num == null) {
            throw new NullPointerException("Null count");
        }
        this.zzc = num;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.ConnectorAggregation.Builder
    public final ConnectorAggregation.Builder setMaxChargeRateKw(Double d) {
        if (d == null) {
            throw new NullPointerException("Null maxChargeRateKw");
        }
        this.zzb = d;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.ConnectorAggregation.Builder
    public final ConnectorAggregation.Builder setType(EVConnectorType eVConnectorType) {
        if (eVConnectorType == null) {
            throw new NullPointerException("Null type");
        }
        this.zza = eVConnectorType;
        return this;
    }

    zzo() {
    }

    @Override // com.google.android.libraries.places.api.model.ConnectorAggregation.Builder
    public final Instant getAvailabilityLastUpdateTime() {
        return this.zzf;
    }

    @Override // com.google.android.libraries.places.api.model.ConnectorAggregation.Builder
    public final Integer getAvailableCount() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.model.ConnectorAggregation.Builder
    public final Integer getOutOfServiceCount() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.api.model.ConnectorAggregation.Builder
    public final ConnectorAggregation.Builder setAvailabilityLastUpdateTime(Instant instant) {
        this.zzf = instant;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.ConnectorAggregation.Builder
    public final ConnectorAggregation.Builder setAvailableCount(Integer num) {
        this.zzd = num;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.ConnectorAggregation.Builder
    public final ConnectorAggregation.Builder setOutOfServiceCount(Integer num) {
        this.zze = num;
        return this;
    }
}
