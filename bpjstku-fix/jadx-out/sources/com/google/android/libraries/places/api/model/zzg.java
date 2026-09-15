package com.google.android.libraries.places.api.model;

/* JADX INFO: loaded from: classes3.dex */
abstract class zzg extends AuthorAttribution {
    private final String zza;
    private final String zzb;
    private final String zzc;

    zzg(String str, String str2, String str3) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AuthorAttribution)) {
            return false;
        }
        AuthorAttribution authorAttribution = (AuthorAttribution) obj;
        if (!this.zza.equals(authorAttribution.getName())) {
            return false;
        }
        String str = this.zzb;
        if (str == null) {
            if (authorAttribution.getUri() != null) {
                return false;
            }
        } else if (!str.equals(authorAttribution.getUri())) {
            return false;
        }
        String str2 = this.zzc;
        if (str2 == null) {
            if (authorAttribution.getPhotoUri() != null) {
                return false;
            }
        } else if (!str2.equals(authorAttribution.getPhotoUri())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode();
        String str = this.zzb;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.zzc;
        return ((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.zzb;
        int length = String.valueOf(str).length();
        String str2 = this.zzc;
        int length2 = String.valueOf(str2).length();
        String str3 = this.zza;
        StringBuilder sb = new StringBuilder(str3.length() + 29 + length + 11 + length2 + 1);
        sb.append("AuthorAttribution{name=");
        sb.append(str3);
        sb.append(", uri=");
        sb.append(str);
        sb.append(", photoUri=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.api.model.AuthorAttribution
    public final String getName() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.AuthorAttribution
    public final String getPhotoUri() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.model.AuthorAttribution
    public final String getUri() {
        return this.zzb;
    }
}
