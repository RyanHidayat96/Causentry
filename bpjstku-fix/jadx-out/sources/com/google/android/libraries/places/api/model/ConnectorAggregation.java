package com.google.android.libraries.places.api.model;

import android.os.Parcelable;
import java.time.Instant;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ConnectorAggregation implements Parcelable {

    /* JADX INFO: loaded from: classes4.dex */
    public static abstract class Builder {
        public abstract ConnectorAggregation build();

        public abstract Instant getAvailabilityLastUpdateTime();

        public abstract Integer getAvailableCount();

        public abstract Integer getOutOfServiceCount();

        public abstract Builder setAvailabilityLastUpdateTime(Instant instant);

        public abstract Builder setAvailableCount(Integer num);

        public abstract Builder setCount(Integer num);

        public abstract Builder setMaxChargeRateKw(Double d);

        public abstract Builder setOutOfServiceCount(Integer num);

        public abstract Builder setType(EVConnectorType eVConnectorType);
    }

    public static Builder builder(EVConnectorType eVConnectorType, Double d, Integer num) {
        zzo zzoVar = new zzo();
        zzoVar.setType(eVConnectorType);
        zzoVar.setMaxChargeRateKw(d);
        zzoVar.setCount(num);
        return zzoVar;
    }

    public abstract Instant getAvailabilityLastUpdateTime();

    public abstract Integer getAvailableCount();

    public abstract Integer getCount();

    public abstract Double getMaxChargeRateKw();

    public abstract Integer getOutOfServiceCount();

    public abstract EVConnectorType getType();
}
