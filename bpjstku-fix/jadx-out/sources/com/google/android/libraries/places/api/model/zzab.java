package com.google.android.libraries.places.api.model;

/* JADX INFO: loaded from: classes3.dex */
abstract class zzab extends LocalDate {
    private final int zza;
    private final int zzb;
    private final int zzc;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocalDate)) {
            return false;
        }
        LocalDate localDate = (LocalDate) obj;
        return this.zza == localDate.getYear() && this.zzb == localDate.getMonth() && this.zzc == localDate.getDay();
    }

    zzab(int i, int i2, int i3) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
    }

    @Override // com.google.android.libraries.places.api.model.LocalDate
    public final int getDay() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.model.LocalDate
    public final int getMonth() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.LocalDate
    public final int getYear() {
        return this.zza;
    }

    public final int hashCode() {
        return ((((this.zza ^ 1000003) * 1000003) ^ this.zzb) * 1000003) ^ this.zzc;
    }
}
