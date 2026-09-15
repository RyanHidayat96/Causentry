package com.google.android.libraries.places.api.model;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
abstract class zzj extends AutocompletePrediction {
    private final String zza;
    private final Integer zzb;
    private final List zzc;
    private final List zzd;
    private final String zze;
    private final String zzf;
    private final String zzg;
    private final List zzh;
    private final List zzi;
    private final List zzj;

    zzj(String str, Integer num, List list, List list2, String str2, String str3, String str4, List list3, List list4, List list5) {
        if (str == null) {
            throw new NullPointerException("Null placeId");
        }
        this.zza = str;
        this.zzb = num;
        if (list == null) {
            throw new NullPointerException("Null placeTypes");
        }
        this.zzc = list;
        if (list2 == null) {
            throw new NullPointerException("Null types");
        }
        this.zzd = list2;
        if (str2 == null) {
            throw new NullPointerException("Null fullText");
        }
        this.zze = str2;
        if (str3 == null) {
            throw new NullPointerException("Null primaryText");
        }
        this.zzf = str3;
        if (str4 == null) {
            throw new NullPointerException("Null secondaryText");
        }
        this.zzg = str4;
        if (list3 == null) {
            throw new NullPointerException("Null fullTextMatchedSubstrings");
        }
        this.zzh = list3;
        if (list4 == null) {
            throw new NullPointerException("Null primaryTextMatchedSubstrings");
        }
        this.zzi = list4;
        if (list5 == null) {
            throw new NullPointerException("Null secondaryTextMatchedSubstrings");
        }
        this.zzj = list5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AutocompletePrediction)) {
            return false;
        }
        AutocompletePrediction autocompletePrediction = (AutocompletePrediction) obj;
        if (!this.zza.equals(autocompletePrediction.getPlaceId())) {
            return false;
        }
        Integer num = this.zzb;
        if (num == null) {
            if (autocompletePrediction.getDistanceMeters() != null) {
                return false;
            }
        } else if (!num.equals(autocompletePrediction.getDistanceMeters())) {
            return false;
        }
        return this.zzc.equals(autocompletePrediction.getPlaceTypes()) && this.zzd.equals(autocompletePrediction.getTypes()) && this.zze.equals(autocompletePrediction.zza()) && this.zzf.equals(autocompletePrediction.zzb()) && this.zzg.equals(autocompletePrediction.zzc()) && this.zzh.equals(autocompletePrediction.zzd()) && this.zzi.equals(autocompletePrediction.zze()) && this.zzj.equals(autocompletePrediction.zzf());
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode();
        Integer num = this.zzb;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        int iHashCode3 = this.zzc.hashCode();
        int iHashCode4 = this.zzd.hashCode();
        int iHashCode5 = this.zze.hashCode();
        int iHashCode6 = this.zzf.hashCode();
        int iHashCode7 = this.zzg.hashCode();
        return ((((((((((((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ iHashCode4) * 1000003) ^ iHashCode5) * 1000003) ^ iHashCode6) * 1000003) ^ iHashCode7) * 1000003) ^ this.zzh.hashCode()) * 1000003) ^ this.zzi.hashCode()) * 1000003) ^ this.zzj.hashCode();
    }

    public final String toString() {
        List list = this.zzj;
        List list2 = this.zzi;
        List list3 = this.zzh;
        List list4 = this.zzd;
        String string = this.zzc.toString();
        String string2 = list4.toString();
        String string3 = list3.toString();
        String string4 = list2.toString();
        String string5 = list.toString();
        Integer num = this.zzb;
        int length = String.valueOf(num).length();
        int length2 = string.length();
        int length3 = string2.length();
        int length4 = string3.length();
        int length5 = string4.length();
        int length6 = string5.length();
        String str = this.zza;
        int length7 = str.length();
        String str2 = this.zze;
        int length8 = str2.length();
        String str3 = this.zzf;
        int length9 = str3.length();
        String str4 = this.zzg;
        StringBuilder sb = new StringBuilder(length7 + 48 + length + 13 + length2 + 8 + length3 + 11 + length8 + 14 + length9 + 16 + str4.length() + 28 + length4 + 31 + length5 + 33 + length6 + 1);
        sb.append("AutocompletePrediction{placeId=");
        sb.append(str);
        sb.append(", distanceMeters=");
        sb.append(num);
        sb.append(", placeTypes=");
        sb.append(string);
        sb.append(", types=");
        sb.append(string2);
        sb.append(", fullText=");
        sb.append(str2);
        sb.append(", primaryText=");
        sb.append(str3);
        sb.append(", secondaryText=");
        sb.append(str4);
        sb.append(", fullTextMatchedSubstrings=");
        sb.append(string3);
        sb.append(", primaryTextMatchedSubstrings=");
        sb.append(string4);
        sb.append(", secondaryTextMatchedSubstrings=");
        sb.append(string5);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction
    public Integer getDistanceMeters() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction
    public String getPlaceId() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction
    @Deprecated
    public List<Place.Type> getPlaceTypes() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction
    public List<String> getTypes() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction
    final String zza() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction
    final String zzb() {
        return this.zzf;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction
    final String zzc() {
        return this.zzg;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction
    final List zzd() {
        return this.zzh;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction
    final List zze() {
        return this.zzi;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction
    final List zzf() {
        return this.zzj;
    }
}
