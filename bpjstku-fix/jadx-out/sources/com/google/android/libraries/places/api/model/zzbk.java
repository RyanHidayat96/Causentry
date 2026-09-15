package com.google.android.libraries.places.api.model;

/* JADX INFO: loaded from: classes3.dex */
abstract class zzbk extends SubDestination {
    private final String zza;
    private final String zzb;

    zzbk(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.zza = str;
        if (str2 == null) {
            throw new NullPointerException("Null name");
        }
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SubDestination)) {
            return false;
        }
        SubDestination subDestination = (SubDestination) obj;
        return this.zza.equals(subDestination.getId()) && this.zzb.equals(subDestination.getName());
    }

    public final int hashCode() {
        return ((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode();
    }

    public final String toString() {
        String str = this.zza;
        int length = str.length();
        String str2 = this.zzb;
        StringBuilder sb = new StringBuilder(length + 25 + str2.length() + 1);
        sb.append("SubDestination{id=");
        sb.append(str);
        sb.append(", name=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.api.model.SubDestination
    public final String getId() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.SubDestination
    public final String getName() {
        return this.zzb;
    }
}
