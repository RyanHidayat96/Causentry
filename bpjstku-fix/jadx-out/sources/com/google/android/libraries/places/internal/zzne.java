package com.google.android.libraries.places.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.Place;
import com.google.common.collect.ImmutableList;

/* JADX INFO: loaded from: classes3.dex */
final class zzne extends zzni {
    private final String zza;
    private final ImmutableList zzb;
    private final Place zzc;
    private final AutocompletePrediction zzd;
    private final AutocompleteSessionToken zze;
    private final Status zzf;
    private final int zzg;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzni)) {
            return false;
        }
        zzni zzniVar = (zzni) obj;
        if (this.zzg != zzniVar.zzg()) {
            return false;
        }
        String str = this.zza;
        if (str == null) {
            if (zzniVar.zza() != null) {
                return false;
            }
        } else if (!str.equals(zzniVar.zza())) {
            return false;
        }
        ImmutableList immutableList = this.zzb;
        if (immutableList == null) {
            if (zzniVar.zzb() != null) {
                return false;
            }
        } else if (!immutableList.equals(zzniVar.zzb())) {
            return false;
        }
        Place place = this.zzc;
        if (place == null) {
            if (zzniVar.zzc() != null) {
                return false;
            }
        } else if (!place.equals(zzniVar.zzc())) {
            return false;
        }
        AutocompletePrediction autocompletePrediction = this.zzd;
        if (autocompletePrediction == null) {
            if (zzniVar.zzd() != null) {
                return false;
            }
        } else if (!autocompletePrediction.equals(zzniVar.zzd())) {
            return false;
        }
        AutocompleteSessionToken autocompleteSessionToken = this.zze;
        if (autocompleteSessionToken == null) {
            if (zzniVar.zze() != null) {
                return false;
            }
        } else if (!autocompleteSessionToken.equals(zzniVar.zze())) {
            return false;
        }
        Status status = this.zzf;
        if (status == null) {
            if (zzniVar.zzf() != null) {
                return false;
            }
        } else if (!status.equals(zzniVar.zzf())) {
            return false;
        }
        return true;
    }

    public final String toString() {
        String str;
        switch (this.zzg) {
            case 1:
                str = "START";
                break;
            case 2:
                str = "RESET";
                break;
            case 3:
                str = "LOADING";
                break;
            case 4:
                str = "TRY_AGAIN_PROGRESS_LOADING";
                break;
            case 5:
                str = "SUCCESS_PREDICTIONS";
                break;
            case 6:
                str = "FAILURE_NO_PREDICTIONS";
                break;
            case 7:
                str = "FAILURE_PREDICTIONS";
                break;
            case 8:
                str = "SUCCESS_SELECTION";
                break;
            case 9:
                str = "FAILURE_SELECTION";
                break;
            default:
                str = "FAILURE_UNRESOLVABLE";
                break;
        }
        String str2 = this.zza;
        ImmutableList immutableList = this.zzb;
        Place place = this.zzc;
        AutocompletePrediction autocompletePrediction = this.zzd;
        AutocompleteSessionToken autocompleteSessionToken = this.zze;
        Status status = this.zzf;
        int length = str.length();
        String strValueOf = String.valueOf(immutableList);
        String strValueOf2 = String.valueOf(place);
        String strValueOf3 = String.valueOf(autocompletePrediction);
        String strValueOf4 = String.valueOf(autocompleteSessionToken);
        String strValueOf5 = String.valueOf(status);
        StringBuilder sb = new StringBuilder(length + 31 + String.valueOf(str2).length() + 14 + String.valueOf(strValueOf).length() + 8 + String.valueOf(strValueOf2).length() + 13 + String.valueOf(strValueOf3).length() + 15 + String.valueOf(strValueOf4).length() + 9 + String.valueOf(strValueOf5).length() + 1);
        sb.append("AutocompleteState{type=");
        sb.append(str);
        sb.append(", query=");
        sb.append(str2);
        sb.append(", predictions=");
        sb.append(strValueOf);
        sb.append(", place=");
        sb.append(strValueOf2);
        sb.append(", prediction=");
        sb.append(strValueOf3);
        sb.append(", sessionToken=");
        sb.append(strValueOf4);
        sb.append(", status=");
        sb.append(strValueOf5);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        String str = this.zza;
        int iHashCode = str == null ? 0 : str.hashCode();
        int i = this.zzg;
        ImmutableList immutableList = this.zzb;
        int iHashCode2 = immutableList == null ? 0 : immutableList.hashCode();
        Place place = this.zzc;
        int iHashCode3 = place == null ? 0 : place.hashCode();
        AutocompletePrediction autocompletePrediction = this.zzd;
        int iHashCode4 = autocompletePrediction == null ? 0 : autocompletePrediction.hashCode();
        AutocompleteSessionToken autocompleteSessionToken = this.zze;
        int iHashCode5 = autocompleteSessionToken == null ? 0 : autocompleteSessionToken.hashCode();
        Status status = this.zzf;
        return ((((((((((iHashCode ^ ((i ^ 1000003) * 1000003)) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ iHashCode4) * 1000003) ^ iHashCode5) * 1000003) ^ (status != null ? status.hashCode() : 0);
    }

    /* synthetic */ zzne(int i, String str, ImmutableList immutableList, Place place, AutocompletePrediction autocompletePrediction, AutocompleteSessionToken autocompleteSessionToken, Status status, byte[] bArr) {
        this.zzg = i;
        this.zza = str;
        this.zzb = immutableList;
        this.zzc = place;
        this.zzd = autocompletePrediction;
        this.zze = autocompleteSessionToken;
        this.zzf = status;
    }

    @Override // com.google.android.libraries.places.internal.zzni
    public final String zza() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzni
    public final ImmutableList zzb() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.internal.zzni
    public final Place zzc() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.internal.zzni
    public final AutocompletePrediction zzd() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.internal.zzni
    public final AutocompleteSessionToken zze() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.internal.zzni
    public final Status zzf() {
        return this.zzf;
    }

    @Override // com.google.android.libraries.places.internal.zzni
    public final int zzg() {
        return this.zzg;
    }
}
