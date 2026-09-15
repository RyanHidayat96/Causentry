package com.google.android.libraries.places.api.model;

/* JADX INFO: loaded from: classes3.dex */
abstract class zzau extends PlusCode {
    private final String zza;
    private final String zzb;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PlusCode)) {
            return false;
        }
        PlusCode plusCode = (PlusCode) obj;
        String str = this.zza;
        if (str == null) {
            if (plusCode.getCompoundCode() != null) {
                return false;
            }
        } else if (!str.equals(plusCode.getCompoundCode())) {
            return false;
        }
        String str2 = this.zzb;
        if (str2 == null) {
            if (plusCode.getGlobalCode() != null) {
                return false;
            }
        } else if (!str2.equals(plusCode.getGlobalCode())) {
            return false;
        }
        return true;
    }

    public final String toString() {
        String str = this.zza;
        int length = String.valueOf(str).length();
        String str2 = this.zzb;
        StringBuilder sb = new StringBuilder(length + 35 + String.valueOf(str2).length() + 1);
        sb.append("PlusCode{compoundCode=");
        sb.append(str);
        sb.append(", globalCode=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        String str = this.zza;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.zzb;
        return ((iHashCode ^ 1000003) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }

    zzau(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    @Override // com.google.android.libraries.places.api.model.PlusCode
    public final String getCompoundCode() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.PlusCode
    public final String getGlobalCode() {
        return this.zzb;
    }
}
