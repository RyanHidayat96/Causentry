package com.google.android.libraries.places.widget.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class zzi implements Parcelable {
    public static final Parcelable.Creator<zzi> CREATOR = new zzh();
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public zzi(String str, String str2, String str3, String str4, String str5, String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzi)) {
            return false;
        }
        zzi zziVar = (zzi) obj;
        return Intrinsics.areEqual(this.zza, zziVar.zza) && Intrinsics.areEqual(this.zzb, zziVar.zzb) && Intrinsics.areEqual(this.zzc, zziVar.zzc) && Intrinsics.areEqual(this.zzd, zziVar.zzd) && Intrinsics.areEqual(this.zze, zziVar.zze) && Intrinsics.areEqual(this.zzf, zziVar.zzf);
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode();
        String str = this.zzb;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.zzc;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.zzd;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.zze;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.zzf;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        String str = this.zza;
        int length = String.valueOf(str).length();
        String str2 = this.zzb;
        int length2 = String.valueOf(str2).length();
        String str3 = this.zzc;
        int length3 = String.valueOf(str3).length();
        String str4 = this.zzd;
        int length4 = String.valueOf(str4).length();
        String str5 = this.zze;
        int length5 = String.valueOf(str5).length();
        String str6 = this.zzf;
        StringBuilder sb = new StringBuilder(length + 43 + length2 + 17 + length3 + 18 + length4 + 15 + length5 + 17 + String.valueOf(str6).length() + 1);
        sb.append("PhotoPageData(photoUri=");
        sb.append(str);
        sb.append(", photoThumbnailUri=");
        sb.append(str2);
        sb.append(", reportPhotoUri=");
        sb.append(str3);
        sb.append(", userDisplayName=");
        sb.append(str4);
        sb.append(", userImageUri=");
        sb.append(str5);
        sb.append(", userProfileUri=");
        sb.append(str6);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
        parcel.writeString(this.zzd);
        parcel.writeString(this.zze);
        parcel.writeString(this.zzf);
    }

    public final String zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzc;
    }

    public final String zzd() {
        return this.zzd;
    }

    public final String zze() {
        return this.zze;
    }

    public final String zzf() {
        return this.zzf;
    }
}
