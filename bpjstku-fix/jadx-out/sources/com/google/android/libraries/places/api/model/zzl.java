package com.google.android.libraries.places.api.model;

/* JADX INFO: loaded from: classes3.dex */
abstract class zzl extends zzek {
    private final int zza;
    private final int zzb;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzek)) {
            return false;
        }
        zzek zzekVar = (zzek) obj;
        return this.zza == zzekVar.zza() && this.zzb == zzekVar.zzb();
    }

    public final String toString() {
        int i = this.zza;
        int length = String.valueOf(i).length();
        int i2 = this.zzb;
        StringBuilder sb = new StringBuilder(length + 31 + String.valueOf(i2).length() + 1);
        sb.append("SubstringMatch{offset=");
        sb.append(i);
        sb.append(", length=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }

    zzl(int i, int i2) {
        this.zza = i;
        this.zzb = i2;
    }

    public final int hashCode() {
        return ((this.zza ^ 1000003) * 1000003) ^ this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.zzek
    final int zza() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.zzek
    final int zzb() {
        return this.zzb;
    }
}
