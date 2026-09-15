package com.google.android.libraries.places.api.model;

import java.time.Instant;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
abstract class zzah extends OpeningHours {
    private final OpeningHours.HoursType zza;
    private final List zzb;
    private final List zzc;
    private final List zzd;
    private final Boolean zze;
    private final Instant zzf;
    private final Instant zzg;

    zzah(OpeningHours.HoursType hoursType, List list, List list2, List list3, Boolean bool, Instant instant, Instant instant2) {
        this.zza = hoursType;
        if (list == null) {
            throw new NullPointerException("Null periods");
        }
        this.zzb = list;
        if (list2 == null) {
            throw new NullPointerException("Null specialDays");
        }
        this.zzc = list2;
        if (list3 == null) {
            throw new NullPointerException("Null weekdayText");
        }
        this.zzd = list3;
        this.zze = bool;
        this.zzf = instant;
        this.zzg = instant2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OpeningHours)) {
            return false;
        }
        OpeningHours openingHours = (OpeningHours) obj;
        OpeningHours.HoursType hoursType = this.zza;
        if (hoursType == null) {
            if (openingHours.getHoursType() != null) {
                return false;
            }
        } else if (!hoursType.equals(openingHours.getHoursType())) {
            return false;
        }
        if (!this.zzb.equals(openingHours.getPeriods()) || !this.zzc.equals(openingHours.getSpecialDays()) || !this.zzd.equals(openingHours.getWeekdayText())) {
            return false;
        }
        Boolean bool = this.zze;
        if (bool == null) {
            if (openingHours.zza() != null) {
                return false;
            }
        } else if (!bool.equals(openingHours.zza())) {
            return false;
        }
        Instant instant = this.zzf;
        if (instant == null) {
            if (openingHours.zzb() != null) {
                return false;
            }
        } else if (!instant.equals(openingHours.zzb())) {
            return false;
        }
        Instant instant2 = this.zzg;
        if (instant2 == null) {
            if (openingHours.zzc() != null) {
                return false;
            }
        } else if (!instant2.equals(openingHours.zzc())) {
            return false;
        }
        return true;
    }

    public final String toString() {
        Instant instant = this.zzg;
        Instant instant2 = this.zzf;
        List list = this.zzd;
        List list2 = this.zzc;
        List list3 = this.zzb;
        String strValueOf = String.valueOf(this.zza);
        String string = list3.toString();
        String string2 = list2.toString();
        String string3 = list.toString();
        String strValueOf2 = String.valueOf(instant2);
        String strValueOf3 = String.valueOf(instant);
        int length = String.valueOf(strValueOf).length();
        int length2 = string.length();
        int length3 = string2.length();
        int length4 = string3.length();
        Boolean bool = this.zze;
        StringBuilder sb = new StringBuilder(length + 33 + length2 + 14 + length3 + 14 + length4 + 10 + String.valueOf(bool).length() + 11 + String.valueOf(strValueOf2).length() + 12 + String.valueOf(strValueOf3).length() + 1);
        sb.append("OpeningHours{hoursType=");
        sb.append(strValueOf);
        sb.append(", periods=");
        sb.append(string);
        sb.append(", specialDays=");
        sb.append(string2);
        sb.append(", weekdayText=");
        sb.append(string3);
        sb.append(", openNow=");
        sb.append(bool);
        sb.append(", nextOpen=");
        sb.append(strValueOf2);
        sb.append(", nextClose=");
        sb.append(strValueOf3);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        OpeningHours.HoursType hoursType = this.zza;
        int iHashCode = hoursType == null ? 0 : hoursType.hashCode();
        int iHashCode2 = this.zzb.hashCode();
        int iHashCode3 = this.zzc.hashCode();
        int iHashCode4 = this.zzd.hashCode();
        Boolean bool = this.zze;
        int iHashCode5 = bool == null ? 0 : bool.hashCode();
        Instant instant = this.zzf;
        int iHashCode6 = instant == null ? 0 : instant.hashCode();
        Instant instant2 = this.zzg;
        return ((((((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ iHashCode4) * 1000003) ^ iHashCode5) * 1000003) ^ iHashCode6) * 1000003) ^ (instant2 != null ? instant2.hashCode() : 0);
    }

    @Override // com.google.android.libraries.places.api.model.OpeningHours
    public OpeningHours.HoursType getHoursType() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.OpeningHours
    public List<Period> getPeriods() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.OpeningHours
    public List<SpecialDay> getSpecialDays() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.model.OpeningHours
    public List<String> getWeekdayText() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.model.OpeningHours
    public final Boolean zza() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.api.model.OpeningHours
    public final Instant zzb() {
        return this.zzf;
    }

    @Override // com.google.android.libraries.places.api.model.OpeningHours
    public final Instant zzc() {
        return this.zzg;
    }
}
