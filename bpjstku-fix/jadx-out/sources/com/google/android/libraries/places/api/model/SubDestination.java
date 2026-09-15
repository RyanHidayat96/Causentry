package com.google.android.libraries.places.api.model;

import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class SubDestination implements Parcelable {

    public static abstract class Builder {
        public abstract SubDestination build();

        public abstract Builder setId(String str);

        public abstract Builder setName(String str);
    }

    public static SubDestination newInstance(String str, String str2) {
        zzbj zzbjVar = new zzbj();
        zzbjVar.setId(str);
        zzbjVar.setName(str2);
        return zzbjVar.build();
    }

    public abstract String getId();

    public abstract String getName();
}
