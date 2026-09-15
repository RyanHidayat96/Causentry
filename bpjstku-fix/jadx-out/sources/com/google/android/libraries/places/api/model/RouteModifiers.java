package com.google.android.libraries.places.api.model;

import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class RouteModifiers implements Parcelable {

    /* JADX INFO: loaded from: classes6.dex */
    public static abstract class Builder {
        public abstract RouteModifiers build();

        public abstract boolean isFerryAvoided();

        public abstract boolean isHighwayAvoided();

        public abstract boolean isIndoorAvoided();

        public abstract boolean isTollAvoided();

        public abstract Builder setFerryAvoided(boolean z);

        public abstract Builder setHighwayAvoided(boolean z);

        public abstract Builder setIndoorAvoided(boolean z);

        public abstract Builder setTollAvoided(boolean z);
    }

    public static Builder builder() {
        zzbb zzbbVar = new zzbb();
        zzbbVar.setTollAvoided(false);
        zzbbVar.setHighwayAvoided(false);
        zzbbVar.setFerryAvoided(false);
        zzbbVar.setIndoorAvoided(false);
        return zzbbVar;
    }

    public abstract boolean isFerryAvoided();

    public abstract boolean isHighwayAvoided();

    public abstract boolean isIndoorAvoided();

    public abstract boolean isTollAvoided();
}
