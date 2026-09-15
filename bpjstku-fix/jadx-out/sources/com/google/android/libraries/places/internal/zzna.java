package com.google.android.libraries.places.internal;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;
import com.google.android.libraries.places.widget.model.AutocompleteUiCustomization;
import com.google.common.collect.ImmutableList;

/* JADX INFO: loaded from: classes3.dex */
abstract class zzna extends zzng {
    private final zzoh zza;
    private final AutocompleteActivityMode zzb;
    private final ImmutableList zzc;
    private final zzoc zzd;
    private final LatLng zze;
    private final String zzf;
    private final String zzg;
    private final LocationBias zzh;
    private final LocationRestriction zzi;
    private final ImmutableList zzj;
    private final TypeFilter zzk;
    private final ImmutableList zzl;
    private final int zzm;
    private final int zzn;
    private final String zzo;
    private final AutocompleteUiCustomization zzp;
    private final boolean zzq;
    private final AutocompleteSessionToken zzr;

    zzna(zzoh zzohVar, AutocompleteActivityMode autocompleteActivityMode, ImmutableList immutableList, zzoc zzocVar, LatLng latLng, String str, String str2, LocationBias locationBias, LocationRestriction locationRestriction, ImmutableList immutableList2, TypeFilter typeFilter, ImmutableList immutableList3, int i, int i2, String str3, AutocompleteUiCustomization autocompleteUiCustomization, boolean z, AutocompleteSessionToken autocompleteSessionToken) {
        if (zzohVar == null) {
            throw new NullPointerException("Null widgetBackend");
        }
        this.zza = zzohVar;
        if (autocompleteActivityMode == null) {
            throw new NullPointerException("Null mode");
        }
        this.zzb = autocompleteActivityMode;
        if (immutableList == null) {
            throw new NullPointerException("Null placeFields");
        }
        this.zzc = immutableList;
        if (zzocVar == null) {
            throw new NullPointerException("Null activityOrigin");
        }
        this.zzd = zzocVar;
        this.zze = latLng;
        this.zzf = str;
        this.zzg = str2;
        this.zzh = locationBias;
        this.zzi = locationRestriction;
        if (immutableList2 == null) {
            throw new NullPointerException("Null countries");
        }
        this.zzj = immutableList2;
        this.zzk = typeFilter;
        if (immutableList3 == null) {
            throw new NullPointerException("Null typesFilter");
        }
        this.zzl = immutableList3;
        this.zzm = i;
        this.zzn = i2;
        this.zzo = str3;
        this.zzp = autocompleteUiCustomization;
        this.zzq = z;
        this.zzr = autocompleteSessionToken;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzng)) {
            return false;
        }
        zzng zzngVar = (zzng) obj;
        if (!this.zza.equals(zzngVar.zza()) || !this.zzb.equals(zzngVar.zzb()) || !this.zzc.equals(zzngVar.zzc()) || !this.zzd.equals(zzngVar.zzd())) {
            return false;
        }
        LatLng latLng = this.zze;
        if (latLng == null) {
            if (zzngVar.zze() != null) {
                return false;
            }
        } else if (!latLng.equals(zzngVar.zze())) {
            return false;
        }
        String str = this.zzf;
        if (str == null) {
            if (zzngVar.zzf() != null) {
                return false;
            }
        } else if (!str.equals(zzngVar.zzf())) {
            return false;
        }
        String str2 = this.zzg;
        if (str2 == null) {
            if (zzngVar.zzg() != null) {
                return false;
            }
        } else if (!str2.equals(zzngVar.zzg())) {
            return false;
        }
        LocationBias locationBias = this.zzh;
        if (locationBias == null) {
            if (zzngVar.zzh() != null) {
                return false;
            }
        } else if (!locationBias.equals(zzngVar.zzh())) {
            return false;
        }
        LocationRestriction locationRestriction = this.zzi;
        if (locationRestriction == null) {
            if (zzngVar.zzi() != null) {
                return false;
            }
        } else if (!locationRestriction.equals(zzngVar.zzi())) {
            return false;
        }
        if (!this.zzj.equals(zzngVar.zzj())) {
            return false;
        }
        TypeFilter typeFilter = this.zzk;
        if (typeFilter == null) {
            if (zzngVar.zzk() != null) {
                return false;
            }
        } else if (!typeFilter.equals(zzngVar.zzk())) {
            return false;
        }
        if (!this.zzl.equals(zzngVar.zzl()) || this.zzm != zzngVar.zzm() || this.zzn != zzngVar.zzn()) {
            return false;
        }
        String str3 = this.zzo;
        if (str3 == null) {
            if (zzngVar.zzo() != null) {
                return false;
            }
        } else if (!str3.equals(zzngVar.zzo())) {
            return false;
        }
        AutocompleteUiCustomization autocompleteUiCustomization = this.zzp;
        if (autocompleteUiCustomization == null) {
            if (zzngVar.zzp() != null) {
                return false;
            }
        } else if (!autocompleteUiCustomization.equals(zzngVar.zzp())) {
            return false;
        }
        if (this.zzq != zzngVar.zzq()) {
            return false;
        }
        AutocompleteSessionToken autocompleteSessionToken = this.zzr;
        if (autocompleteSessionToken == null) {
            if (zzngVar.zzr() != null) {
                return false;
            }
        } else if (!autocompleteSessionToken.equals(zzngVar.zzr())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode();
        int iHashCode2 = this.zzb.hashCode();
        int iHashCode3 = this.zzc.hashCode();
        int iHashCode4 = this.zzd.hashCode();
        LatLng latLng = this.zze;
        int iHashCode5 = latLng == null ? 0 : latLng.hashCode();
        String str = this.zzf;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        String str2 = this.zzg;
        int iHashCode7 = str2 == null ? 0 : str2.hashCode();
        LocationBias locationBias = this.zzh;
        int iHashCode8 = locationBias == null ? 0 : locationBias.hashCode();
        LocationRestriction locationRestriction = this.zzi;
        int iHashCode9 = locationRestriction == null ? 0 : locationRestriction.hashCode();
        int iHashCode10 = this.zzj.hashCode();
        TypeFilter typeFilter = this.zzk;
        int iHashCode11 = typeFilter == null ? 0 : typeFilter.hashCode();
        int iHashCode12 = this.zzl.hashCode();
        int i = this.zzm;
        int i2 = this.zzn;
        String str3 = this.zzo;
        int iHashCode13 = str3 == null ? 0 : str3.hashCode();
        AutocompleteUiCustomization autocompleteUiCustomization = this.zzp;
        int iHashCode14 = autocompleteUiCustomization == null ? 0 : autocompleteUiCustomization.hashCode();
        int i3 = true != this.zzq ? 1237 : 1231;
        AutocompleteSessionToken autocompleteSessionToken = this.zzr;
        return ((((((((((((((((((((((((((((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ iHashCode4) * 1000003) ^ iHashCode5) * 1000003) ^ iHashCode6) * 1000003) ^ iHashCode7) * 1000003) ^ iHashCode8) * 1000003) ^ iHashCode9) * 1000003) ^ iHashCode10) * 1000003) ^ iHashCode11) * 1000003) ^ iHashCode12) * 1000003) ^ i) * 1000003) ^ i2) * 1000003) ^ iHashCode13) * 1000003) ^ iHashCode14) * 1000003) ^ i3) * 1000003) ^ (autocompleteSessionToken != null ? autocompleteSessionToken.hashCode() : 0);
    }

    public final String toString() {
        String string = this.zza.toString();
        int length = string.length();
        String string2 = this.zzb.toString();
        int length2 = string2.length();
        String string3 = this.zzc.toString();
        int length3 = string3.length();
        String string4 = this.zzd.toString();
        int length4 = string4.length();
        AutocompleteSessionToken autocompleteSessionToken = this.zzr;
        AutocompleteUiCustomization autocompleteUiCustomization = this.zzp;
        ImmutableList immutableList = this.zzl;
        TypeFilter typeFilter = this.zzk;
        ImmutableList immutableList2 = this.zzj;
        LocationRestriction locationRestriction = this.zzi;
        LocationBias locationBias = this.zzh;
        String strValueOf = String.valueOf(this.zze);
        String strValueOf2 = String.valueOf(locationBias);
        String strValueOf3 = String.valueOf(locationRestriction);
        String string5 = immutableList2.toString();
        String strValueOf4 = String.valueOf(typeFilter);
        String string6 = immutableList.toString();
        String strValueOf5 = String.valueOf(autocompleteUiCustomization);
        String strValueOf6 = String.valueOf(autocompleteSessionToken);
        int length5 = String.valueOf(strValueOf).length();
        String str = this.zzf;
        int length6 = String.valueOf(str).length();
        String str2 = this.zzg;
        int length7 = String.valueOf(str2).length();
        int length8 = String.valueOf(strValueOf2).length();
        int length9 = String.valueOf(strValueOf3).length();
        int length10 = string5.length();
        int length11 = String.valueOf(strValueOf4).length();
        int length12 = string6.length();
        int i = this.zzm;
        int length13 = String.valueOf(i).length();
        int i2 = this.zzn;
        int length14 = String.valueOf(i2).length();
        String str3 = this.zzo;
        int length15 = String.valueOf(str3).length();
        int length16 = String.valueOf(strValueOf5).length();
        boolean z = this.zzq;
        StringBuilder sb = new StringBuilder(length + 41 + length2 + 14 + length3 + 17 + length4 + 9 + length5 + 15 + length6 + 7 + length7 + 15 + length8 + 22 + length9 + 12 + length10 + 13 + length11 + 14 + length12 + 15 + length13 + 19 + length14 + 13 + length15 + 30 + length16 + 36 + String.valueOf(z).length() + 27 + String.valueOf(strValueOf6).length() + 1);
        sb.append("AutocompleteOptions{widgetBackend=");
        sb.append(string);
        sb.append(", mode=");
        sb.append(string2);
        sb.append(", placeFields=");
        sb.append(string3);
        sb.append(", activityOrigin=");
        sb.append(string4);
        sb.append(", origin=");
        sb.append(strValueOf);
        sb.append(", initialQuery=");
        sb.append(str);
        sb.append(", hint=");
        sb.append(str2);
        sb.append(", locationBias=");
        sb.append(strValueOf2);
        sb.append(", locationRestriction=");
        sb.append(strValueOf3);
        sb.append(", countries=");
        sb.append(string5);
        sb.append(", typeFilter=");
        sb.append(strValueOf4);
        sb.append(", typesFilter=");
        sb.append(string6);
        sb.append(", primaryColor=");
        sb.append(i);
        sb.append(", primaryColorDark=");
        sb.append(i2);
        sb.append(", regionCode=");
        sb.append(str3);
        sb.append(", autocompleteUiCustomization=");
        sb.append(strValueOf5);
        sb.append(", pureServiceAreaBusinessesIncluded=");
        sb.append(z);
        sb.append(", autocompleteSessionToken=");
        sb.append(strValueOf6);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.internal.zzng
    public final zzoh zza() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzng
    public final AutocompleteActivityMode zzb() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.internal.zzng
    public final ImmutableList zzc() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.internal.zzng
    public final zzoc zzd() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.internal.zzng
    public final LatLng zze() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.internal.zzng
    public final String zzf() {
        return this.zzf;
    }

    @Override // com.google.android.libraries.places.internal.zzng
    public final String zzg() {
        return this.zzg;
    }

    @Override // com.google.android.libraries.places.internal.zzng
    public final LocationBias zzh() {
        return this.zzh;
    }

    @Override // com.google.android.libraries.places.internal.zzng
    public final LocationRestriction zzi() {
        return this.zzi;
    }

    @Override // com.google.android.libraries.places.internal.zzng
    public final ImmutableList zzj() {
        return this.zzj;
    }

    @Override // com.google.android.libraries.places.internal.zzng
    @Deprecated
    public final TypeFilter zzk() {
        return this.zzk;
    }

    @Override // com.google.android.libraries.places.internal.zzng
    public final ImmutableList zzl() {
        return this.zzl;
    }

    @Override // com.google.android.libraries.places.internal.zzng
    public final int zzm() {
        return this.zzm;
    }

    @Override // com.google.android.libraries.places.internal.zzng
    public final int zzn() {
        return this.zzn;
    }

    @Override // com.google.android.libraries.places.internal.zzng
    public final String zzo() {
        return this.zzo;
    }

    @Override // com.google.android.libraries.places.internal.zzng
    public final AutocompleteUiCustomization zzp() {
        return this.zzp;
    }

    @Override // com.google.android.libraries.places.internal.zzng
    public final boolean zzq() {
        return this.zzq;
    }

    @Override // com.google.android.libraries.places.internal.zzng
    public final AutocompleteSessionToken zzr() {
        return this.zzr;
    }

    @Override // com.google.android.libraries.places.internal.zzng
    public final zznf zzs() {
        return new zzmz(this);
    }
}
