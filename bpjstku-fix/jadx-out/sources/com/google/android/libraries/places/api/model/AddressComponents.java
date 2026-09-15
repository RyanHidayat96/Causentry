package com.google.android.libraries.places.api.model;

import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AddressComponents implements Parcelable {
    public static AddressComponents newInstance(List<AddressComponent> list) {
        return new zzbs(list);
    }

    public abstract List<AddressComponent> asList();
}
