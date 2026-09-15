package com.google.android.libraries.places.api.model;

import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class PaymentOptions implements Parcelable {

    public static abstract class Builder {
        public abstract PaymentOptions build();

        public abstract Place.BooleanPlaceAttributeValue getAcceptsCashOnly();

        public abstract Place.BooleanPlaceAttributeValue getAcceptsCreditCards();

        public abstract Place.BooleanPlaceAttributeValue getAcceptsDebitCards();

        public abstract Place.BooleanPlaceAttributeValue getAcceptsNfc();

        public abstract Builder setAcceptsCashOnly(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract Builder setAcceptsCreditCards(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract Builder setAcceptsDebitCards(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract Builder setAcceptsNfc(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue);
    }

    public static Builder builder() {
        zzak zzakVar = new zzak();
        zzakVar.setAcceptsCreditCards(Place.BooleanPlaceAttributeValue.UNKNOWN);
        zzakVar.setAcceptsDebitCards(Place.BooleanPlaceAttributeValue.UNKNOWN);
        zzakVar.setAcceptsCashOnly(Place.BooleanPlaceAttributeValue.UNKNOWN);
        zzakVar.setAcceptsNfc(Place.BooleanPlaceAttributeValue.UNKNOWN);
        return zzakVar;
    }

    public abstract Place.BooleanPlaceAttributeValue getAcceptsCashOnly();

    public abstract Place.BooleanPlaceAttributeValue getAcceptsCreditCards();

    public abstract Place.BooleanPlaceAttributeValue getAcceptsDebitCards();

    public abstract Place.BooleanPlaceAttributeValue getAcceptsNfc();
}
