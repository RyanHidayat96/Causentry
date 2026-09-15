package com.google.android.libraries.places.api.auth;

/* JADX INFO: loaded from: classes3.dex */
final class zzd extends zzb {
    private final boolean zzb;
    private final String zzc;
    private final String zzd;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzb)) {
            return false;
        }
        zzb zzbVar = (zzb) obj;
        if (this.zzb != zzbVar.zza()) {
            return false;
        }
        String str = this.zzc;
        if (str == null) {
            if (zzbVar.zzb() != null) {
                return false;
            }
        } else if (!str.equals(zzbVar.zzb())) {
            return false;
        }
        String str2 = this.zzd;
        if (str2 == null) {
            if (zzbVar.zzc() != null) {
                return false;
            }
        } else if (!str2.equals(zzbVar.zzc())) {
            return false;
        }
        return true;
    }

    public final String toString() {
        boolean z = this.zzb;
        int length = String.valueOf(z).length();
        String str = this.zzc;
        int length2 = String.valueOf(str).length();
        String str2 = this.zzd;
        StringBuilder sb = new StringBuilder(length + 47 + length2 + 26 + String.valueOf(str2).length() + 1);
        sb.append("AppCheckResult{appCheckEnabled=");
        sb.append(z);
        sb.append(", appCheckToken=");
        sb.append(str);
        sb.append(", appCheckTokenFetchError=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        String str = this.zzc;
        int iHashCode = str == null ? 0 : str.hashCode();
        int i = true != this.zzb ? 1237 : 1231;
        String str2 = this.zzd;
        return ((iHashCode ^ ((i ^ 1000003) * 1000003)) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }

    /* synthetic */ zzd(boolean z, String str, String str2, byte[] bArr) {
        this.zzb = z;
        this.zzc = str;
        this.zzd = str2;
    }

    @Override // com.google.android.libraries.places.api.auth.zzb
    public final boolean zza() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.auth.zzb
    public final String zzb() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.auth.zzb
    public final String zzc() {
        return this.zzd;
    }
}
