package com.google.android.libraries.places.api.model;

import android.os.Parcelable;
import java.time.Duration;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Leg implements Parcelable {
    public static Leg newInstance(Duration duration, int i) {
        return new zzcs(duration, i);
    }

    public abstract int getDistanceMeters();

    public abstract Duration getDuration();
}
