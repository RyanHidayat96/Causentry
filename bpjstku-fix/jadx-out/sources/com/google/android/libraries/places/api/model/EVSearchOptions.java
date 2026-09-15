package com.google.android.libraries.places.api.model;

import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class EVSearchOptions implements Parcelable {

    /* JADX INFO: loaded from: classes6.dex */
    public static abstract class Builder {
        public abstract EVSearchOptions build();

        public abstract List<EVConnectorType> getConnectorTypes();

        public abstract Double getMinimumChargingRateKw();

        public abstract Builder setConnectorTypes(List<EVConnectorType> list);

        public abstract Builder setMinimumChargingRateKw(Double d);
    }

    public abstract List<EVConnectorType> getConnectorTypes();

    public abstract Double getMinimumChargingRateKw();

    public static Builder builder() {
        return new zzs();
    }
}
