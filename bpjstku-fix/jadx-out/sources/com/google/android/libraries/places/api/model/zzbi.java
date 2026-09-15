package com.google.android.libraries.places.api.model;

/* JADX INFO: loaded from: classes3.dex */
abstract class zzbi extends SpecialDay {
    private final LocalDate zza;
    private final boolean zzb;

    zzbi(LocalDate localDate, boolean z) {
        if (localDate == null) {
            throw new NullPointerException("Null date");
        }
        this.zza = localDate;
        this.zzb = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SpecialDay)) {
            return false;
        }
        SpecialDay specialDay = (SpecialDay) obj;
        return this.zza.equals(specialDay.getDate()) && this.zzb == specialDay.isExceptional();
    }

    public final int hashCode() {
        return ((this.zza.hashCode() ^ 1000003) * 1000003) ^ (true != this.zzb ? 1237 : 1231);
    }

    public final String toString() {
        String string = this.zza.toString();
        int length = string.length();
        boolean z = this.zzb;
        StringBuilder sb = new StringBuilder(length + 30 + String.valueOf(z).length() + 1);
        sb.append("SpecialDay{date=");
        sb.append(string);
        sb.append(", exceptional=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.api.model.SpecialDay
    public final LocalDate getDate() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.SpecialDay
    public final boolean isExceptional() {
        return this.zzb;
    }
}
