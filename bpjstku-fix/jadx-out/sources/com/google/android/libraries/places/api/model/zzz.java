package com.google.android.libraries.places.api.model;

import java.time.Duration;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzz extends Leg {
    private final Duration zza;
    private final int zzb;

    zzz(Duration duration, int i) {
        if (duration == null) {
            throw new NullPointerException("Null duration");
        }
        this.zza = duration;
        this.zzb = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Leg)) {
            return false;
        }
        Leg leg = (Leg) obj;
        return this.zza.equals(leg.getDuration()) && this.zzb == leg.getDistanceMeters();
    }

    public final int hashCode() {
        return ((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb;
    }

    public final String toString() {
        String string = this.zza.toString();
        int length = string.length();
        int i = this.zzb;
        StringBuilder sb = new StringBuilder(length + 30 + String.valueOf(i).length() + 1);
        sb.append("Leg{duration=");
        sb.append(string);
        sb.append(", distanceMeters=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.api.model.Leg
    public final int getDistanceMeters() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.Leg
    public final Duration getDuration() {
        return this.zza;
    }
}
