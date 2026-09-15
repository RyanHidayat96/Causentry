package com.google.android.libraries.places.api.model;

/* JADX INFO: loaded from: classes3.dex */
abstract class zzbm extends TimeOfWeek {
    private final LocalDate zza;
    private final DayOfWeek zzb;
    private final LocalTime zzc;
    private final boolean zzd;

    zzbm(LocalDate localDate, DayOfWeek dayOfWeek, LocalTime localTime, boolean z) {
        this.zza = localDate;
        if (dayOfWeek == null) {
            throw new NullPointerException("Null day");
        }
        this.zzb = dayOfWeek;
        if (localTime == null) {
            throw new NullPointerException("Null time");
        }
        this.zzc = localTime;
        this.zzd = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TimeOfWeek)) {
            return false;
        }
        TimeOfWeek timeOfWeek = (TimeOfWeek) obj;
        LocalDate localDate = this.zza;
        if (localDate == null) {
            if (timeOfWeek.getDate() != null) {
                return false;
            }
        } else if (!localDate.equals(timeOfWeek.getDate())) {
            return false;
        }
        return this.zzb.equals(timeOfWeek.getDay()) && this.zzc.equals(timeOfWeek.getTime()) && this.zzd == timeOfWeek.isTruncated();
    }

    public final String toString() {
        LocalTime localTime = this.zzc;
        DayOfWeek dayOfWeek = this.zzb;
        String strValueOf = String.valueOf(this.zza);
        String string = dayOfWeek.toString();
        String string2 = localTime.toString();
        int length = String.valueOf(strValueOf).length();
        int length2 = string.length();
        int length3 = string2.length();
        boolean z = this.zzd;
        StringBuilder sb = new StringBuilder(length + 22 + length2 + 7 + length3 + 12 + String.valueOf(z).length() + 1);
        sb.append("TimeOfWeek{date=");
        sb.append(strValueOf);
        sb.append(", day=");
        sb.append(string);
        sb.append(", time=");
        sb.append(string2);
        sb.append(", truncated=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        LocalDate localDate = this.zza;
        int iHashCode = localDate == null ? 0 : localDate.hashCode();
        int iHashCode2 = this.zzb.hashCode();
        return ((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ this.zzc.hashCode()) * 1000003) ^ (true != this.zzd ? 1237 : 1231);
    }

    @Override // com.google.android.libraries.places.api.model.TimeOfWeek
    public final LocalDate getDate() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.TimeOfWeek
    public final DayOfWeek getDay() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.TimeOfWeek
    public final LocalTime getTime() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.model.TimeOfWeek
    public final boolean isTruncated() {
        return this.zzd;
    }
}
