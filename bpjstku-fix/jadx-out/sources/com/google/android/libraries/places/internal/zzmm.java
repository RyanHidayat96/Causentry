package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
final class zzmm extends zzmp {
    private final String zza;
    private final int zzb;
    private final zzmo zzc;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzmp)) {
            return false;
        }
        zzmp zzmpVar = (zzmp) obj;
        return this.zza.equals(zzmpVar.zza()) && this.zzb == zzmpVar.zzb() && this.zzc.equals(zzmpVar.zzc());
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode();
        return ((((iHashCode ^ 1000003) * 1000003) ^ this.zzb) * 1000003) ^ this.zzc.hashCode();
    }

    public final String toString() {
        String string = this.zzc.toString();
        int i = this.zzb;
        int length = String.valueOf(i).length();
        int length2 = string.length();
        String str = this.zza;
        StringBuilder sb = new StringBuilder(str.length() + 40 + length + 16 + length2 + 1);
        sb.append("ClientProfile{packageName=");
        sb.append(str);
        sb.append(", versionCode=");
        sb.append(i);
        sb.append(", requestSource=");
        sb.append(string);
        sb.append("}");
        return sb.toString();
    }

    /* synthetic */ zzmm(String str, int i, zzmo zzmoVar, byte[] bArr) {
        this.zza = str;
        this.zzb = i;
        this.zzc = zzmoVar;
    }

    @Override // com.google.android.libraries.places.internal.zzmp
    public final String zza() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzmp
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.internal.zzmp
    public final zzmo zzc() {
        return this.zzc;
    }
}
