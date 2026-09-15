package com.google.android.libraries.places.api.model;

import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class EVChargeOptions implements Parcelable {

    public static abstract class Builder {
        public abstract EVChargeOptions build();

        public abstract Builder setConnectorAggregations(List<ConnectorAggregation> list);

        public abstract Builder setConnectorCount(Integer num);
    }

    public static EVChargeOptions newInstance(Integer num, List<ConnectorAggregation> list) {
        zzq zzqVar = new zzq();
        zzqVar.setConnectorCount(num);
        zzqVar.setConnectorAggregations(list);
        return zzqVar.build();
    }

    public abstract List<ConnectorAggregation> getConnectorAggregations();

    public abstract Integer getConnectorCount();
}
