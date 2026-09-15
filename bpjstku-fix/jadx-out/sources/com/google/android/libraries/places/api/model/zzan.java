package com.google.android.libraries.places.api.model;

/* JADX INFO: loaded from: classes3.dex */
abstract class zzan extends Period {
    private final TimeOfWeek zza;
    private final TimeOfWeek zzb;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Period)) {
            return false;
        }
        Period period = (Period) obj;
        TimeOfWeek timeOfWeek = this.zza;
        if (timeOfWeek == null) {
            if (period.getOpen() != null) {
                return false;
            }
        } else if (!timeOfWeek.equals(period.getOpen())) {
            return false;
        }
        TimeOfWeek timeOfWeek2 = this.zzb;
        if (timeOfWeek2 == null) {
            if (period.getClose() != null) {
                return false;
            }
        } else if (!timeOfWeek2.equals(period.getClose())) {
            return false;
        }
        return true;
    }

    public final String toString() {
        TimeOfWeek timeOfWeek = this.zzb;
        String strValueOf = String.valueOf(this.zza);
        String strValueOf2 = String.valueOf(timeOfWeek);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 20 + String.valueOf(strValueOf2).length() + 1);
        sb.append("Period{open=");
        sb.append(strValueOf);
        sb.append(", close=");
        sb.append(strValueOf2);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        TimeOfWeek timeOfWeek = this.zza;
        int iHashCode = timeOfWeek == null ? 0 : timeOfWeek.hashCode();
        TimeOfWeek timeOfWeek2 = this.zzb;
        return ((iHashCode ^ 1000003) * 1000003) ^ (timeOfWeek2 != null ? timeOfWeek2.hashCode() : 0);
    }

    zzan(TimeOfWeek timeOfWeek, TimeOfWeek timeOfWeek2) {
        this.zza = timeOfWeek;
        this.zzb = timeOfWeek2;
    }

    @Override // com.google.android.libraries.places.api.model.Period
    public final TimeOfWeek getClose() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.Period
    public final TimeOfWeek getOpen() {
        return this.zza;
    }
}
