package com.google.android.libraries.places.api.model;

import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class SearchAlongRouteParameters implements Parcelable {
    public static SearchAlongRouteParameters newInstance(Polyline polyline) {
        return new zzec(polyline);
    }

    public abstract Polyline getPolyline();
}
