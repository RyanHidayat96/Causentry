package com.google.android.libraries.places.api.model;

/* JADX INFO: loaded from: classes3.dex */
abstract class zzaw extends zzey {
    private final Money zza;
    private final Money zzb;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzey)) {
            return false;
        }
        zzey zzeyVar = (zzey) obj;
        Money money = this.zza;
        if (money == null) {
            if (zzeyVar.zza() != null) {
                return false;
            }
        } else if (!money.equals(zzeyVar.zza())) {
            return false;
        }
        Money money2 = this.zzb;
        if (money2 == null) {
            if (zzeyVar.zzb() != null) {
                return false;
            }
        } else if (!money2.equals(zzeyVar.zzb())) {
            return false;
        }
        return true;
    }

    public final String toString() {
        Money money = this.zzb;
        String strValueOf = String.valueOf(this.zza);
        String strValueOf2 = String.valueOf(money);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 33 + String.valueOf(strValueOf2).length() + 1);
        sb.append("PriceRange{startPrice=");
        sb.append(strValueOf);
        sb.append(", endPrice=");
        sb.append(strValueOf2);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        Money money = this.zza;
        int iHashCode = money == null ? 0 : money.hashCode();
        Money money2 = this.zzb;
        return ((iHashCode ^ 1000003) * 1000003) ^ (money2 != null ? money2.hashCode() : 0);
    }

    zzaw(Money money, Money money2) {
        this.zza = money;
        this.zzb = money2;
    }

    @Override // com.google.android.libraries.places.api.model.zzey
    public final Money zza() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.zzey
    public final Money zzb() {
        return this.zzb;
    }
}
