package com.google.android.libraries.places.widget.internal.placedetails;

import com.google.android.libraries.places.R;

/* JADX INFO: loaded from: classes3.dex */
final class zzbr {
    private final int zza;
    private final boolean zzb;

    public final int zza(int i) {
        int i2 = this.zza;
        if (i < i2) {
            return R.drawable.ratings_full_star;
        }
        if (i == i2) {
            return this.zzb ? R.drawable.ratings_half_star : R.drawable.ratings_empty_star;
        }
        return R.drawable.ratings_empty_star;
    }

    public zzbr(int i, boolean z) {
        this.zza = i;
        this.zzb = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbr)) {
            return false;
        }
        zzbr zzbrVar = (zzbr) obj;
        return this.zza == zzbrVar.zza && this.zzb == zzbrVar.zzb;
    }

    public final int hashCode() {
        return (Integer.hashCode(this.zza) * 31) + Boolean.hashCode(this.zzb);
    }

    public final String toString() {
        int i = this.zza;
        int length = String.valueOf(i).length();
        boolean z = this.zzb;
        StringBuilder sb = new StringBuilder(length + 40 + String.valueOf(z).length() + 1);
        sb.append("StarsModel(numWholeStars=");
        sb.append(i);
        sb.append(", showHalfStar=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }
}
