package com.google.android.libraries.places.api.model;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class zzq extends EVChargeOptions.Builder {
    private Integer zza;
    private List zzb;

    @Override // com.google.android.libraries.places.api.model.EVChargeOptions.Builder
    public final EVChargeOptions build() {
        List list;
        Integer num = this.zza;
        if (num != null && (list = this.zzb) != null) {
            return new zzci(num, list);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zza == null) {
            sb.append(" connectorCount");
        }
        if (this.zzb == null) {
            sb.append(" connectorAggregations");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // com.google.android.libraries.places.api.model.EVChargeOptions.Builder
    public final EVChargeOptions.Builder setConnectorAggregations(List<ConnectorAggregation> list) {
        if (list == null) {
            throw new NullPointerException("Null connectorAggregations");
        }
        this.zzb = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.EVChargeOptions.Builder
    public final EVChargeOptions.Builder setConnectorCount(Integer num) {
        if (num == null) {
            throw new NullPointerException("Null connectorCount");
        }
        this.zza = num;
        return this;
    }

    zzq() {
    }
}
