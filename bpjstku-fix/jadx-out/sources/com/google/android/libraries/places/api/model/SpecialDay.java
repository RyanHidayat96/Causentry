package com.google.android.libraries.places.api.model;

import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class SpecialDay implements Parcelable {

    public static abstract class Builder {
        public abstract SpecialDay build();

        public abstract LocalDate getDate();

        public abstract boolean isExceptional();

        public abstract Builder setDate(LocalDate localDate);

        public abstract Builder setExceptional(boolean z);
    }

    public static Builder builder(LocalDate localDate) {
        zzbh zzbhVar = new zzbh();
        zzbhVar.setDate(localDate);
        zzbhVar.setExceptional(false);
        return zzbhVar;
    }

    public abstract LocalDate getDate();

    public abstract boolean isExceptional();
}
