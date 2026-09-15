package com.google.android.libraries.places.api.model;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
abstract class zzap extends PhotoMetadata {
    private final String zza;
    private final int zzb;
    private final int zzc;
    private final String zzd;
    private final String zze;
    private final AuthorAttributions zzf;
    private final Uri zzg;

    zzap(String str, int i, int i2, String str2, String str3, AuthorAttributions authorAttributions, Uri uri) {
        if (str == null) {
            throw new NullPointerException("Null attributions");
        }
        this.zza = str;
        this.zzb = i;
        this.zzc = i2;
        if (str2 == null) {
            throw new NullPointerException("Null photoReference");
        }
        this.zzd = str2;
        this.zze = str3;
        this.zzf = authorAttributions;
        this.zzg = uri;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PhotoMetadata)) {
            return false;
        }
        PhotoMetadata photoMetadata = (PhotoMetadata) obj;
        if (!this.zza.equals(photoMetadata.getAttributions()) || this.zzb != photoMetadata.getHeight() || this.zzc != photoMetadata.getWidth() || !this.zzd.equals(photoMetadata.zza())) {
            return false;
        }
        String str = this.zze;
        if (str == null) {
            if (photoMetadata.zzb() != null) {
                return false;
            }
        } else if (!str.equals(photoMetadata.zzb())) {
            return false;
        }
        AuthorAttributions authorAttributions = this.zzf;
        if (authorAttributions == null) {
            if (photoMetadata.getAuthorAttributions() != null) {
                return false;
            }
        } else if (!authorAttributions.equals(photoMetadata.getAuthorAttributions())) {
            return false;
        }
        Uri uri = this.zzg;
        if (uri == null) {
            if (photoMetadata.zzc() != null) {
                return false;
            }
        } else if (!uri.equals(photoMetadata.zzc())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode();
        String str = this.zzd;
        int i = this.zzb;
        int i2 = this.zzc;
        int iHashCode2 = str.hashCode();
        String str2 = this.zze;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        AuthorAttributions authorAttributions = this.zzf;
        int iHashCode4 = authorAttributions == null ? 0 : authorAttributions.hashCode();
        Uri uri = this.zzg;
        return ((((((((((((iHashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ i2) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ iHashCode4) * 1000003) ^ (uri != null ? uri.hashCode() : 0);
    }

    public final String toString() {
        Uri uri = this.zzg;
        String strValueOf = String.valueOf(this.zzf);
        String strValueOf2 = String.valueOf(uri);
        int i = this.zzb;
        int length = String.valueOf(i).length();
        int i2 = this.zzc;
        int length2 = String.valueOf(i2).length();
        String str = this.zze;
        int length3 = String.valueOf(str).length();
        int length4 = String.valueOf(strValueOf).length();
        int length5 = String.valueOf(strValueOf2).length();
        String str2 = this.zza;
        int length6 = str2.length();
        String str3 = this.zzd;
        StringBuilder sb = new StringBuilder(length6 + 36 + length + 8 + length2 + 17 + str3.length() + 7 + length3 + 21 + length4 + 17 + length5 + 1);
        sb.append("PhotoMetadata{attributions=");
        sb.append(str2);
        sb.append(", height=");
        sb.append(i);
        sb.append(", width=");
        sb.append(i2);
        sb.append(", photoReference=");
        sb.append(str3);
        sb.append(", name=");
        sb.append(str);
        sb.append(", authorAttributions=");
        sb.append(strValueOf);
        sb.append(", flagContentUri=");
        sb.append(strValueOf2);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.api.model.PhotoMetadata
    public String getAttributions() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.PhotoMetadata
    public AuthorAttributions getAuthorAttributions() {
        return this.zzf;
    }

    @Override // com.google.android.libraries.places.api.model.PhotoMetadata
    public int getHeight() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.PhotoMetadata
    public int getWidth() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.model.PhotoMetadata
    public final String zza() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.model.PhotoMetadata
    public final String zzb() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.api.model.PhotoMetadata
    public final Uri zzc() {
        return this.zzg;
    }
}
