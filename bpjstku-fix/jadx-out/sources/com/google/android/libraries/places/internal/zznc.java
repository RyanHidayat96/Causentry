package com.google.android.libraries.places.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;
import com.google.android.libraries.places.widget.model.AutocompleteUiCustomization;
import com.google.common.collect.ImmutableList;

/* JADX INFO: loaded from: classes3.dex */
final class zznc extends zzna {
    public static final Parcelable.Creator<zznc> CREATOR = new zznb();

    zznc(zzoh zzohVar, AutocompleteActivityMode autocompleteActivityMode, ImmutableList immutableList, zzoc zzocVar, LatLng latLng, String str, String str2, LocationBias locationBias, LocationRestriction locationRestriction, ImmutableList immutableList2, TypeFilter typeFilter, ImmutableList immutableList3, int i, int i2, String str3, AutocompleteUiCustomization autocompleteUiCustomization, boolean z, AutocompleteSessionToken autocompleteSessionToken) {
        super(zzohVar, autocompleteActivityMode, immutableList, zzocVar, latLng, str, str2, locationBias, locationRestriction, immutableList2, typeFilter, immutableList3, i, i2, str3, autocompleteUiCustomization, z, autocompleteSessionToken);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(zza(), i);
        parcel.writeParcelable(zzb(), i);
        parcel.writeList(zzc());
        parcel.writeParcelable(zzd(), i);
        parcel.writeParcelable(zze(), i);
        if (zzf() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(zzf());
        }
        if (zzg() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(zzg());
        }
        parcel.writeParcelable(zzh(), i);
        parcel.writeParcelable(zzi(), i);
        parcel.writeList(zzj());
        parcel.writeParcelable(zzk(), i);
        parcel.writeList(zzl());
        parcel.writeInt(zzm());
        parcel.writeInt(zzn());
        if (zzo() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(zzo());
        }
        parcel.writeParcelable(zzp(), i);
        parcel.writeInt(zzq() ? 1 : 0);
        parcel.writeParcelable(zzr(), i);
    }
}
