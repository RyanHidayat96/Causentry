package com.google.android.libraries.places.api.model;

import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AuthorAttribution implements Parcelable {

    public static abstract class Builder {
        public AuthorAttribution build() {
            if (!zzb().getName().isEmpty()) {
                return zzb();
            }
            throw new IllegalArgumentException("Name must not be empty.");
        }

        public abstract String getPhotoUri();

        public abstract String getUri();

        public abstract Builder setPhotoUri(String str);

        public abstract Builder setUri(String str);

        abstract AuthorAttribution zzb();
    }

    public static Builder builder(String str) {
        zzf zzfVar = new zzf();
        zzfVar.zza(str);
        return zzfVar;
    }

    public abstract String getName();

    public abstract String getPhotoUri();

    public abstract String getUri();
}
