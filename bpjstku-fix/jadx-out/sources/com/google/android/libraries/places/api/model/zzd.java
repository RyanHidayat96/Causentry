package com.google.android.libraries.places.api.model;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
abstract class zzd extends AddressComponent {
    private final String zza;
    private final String zzb;
    private final List zzc;

    zzd(String str, String str2, List list) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.zza = str;
        this.zzb = str2;
        if (list == null) {
            throw new NullPointerException("Null types");
        }
        this.zzc = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AddressComponent)) {
            return false;
        }
        AddressComponent addressComponent = (AddressComponent) obj;
        if (!this.zza.equals(addressComponent.getName())) {
            return false;
        }
        String str = this.zzb;
        if (str == null) {
            if (addressComponent.getShortName() != null) {
                return false;
            }
        } else if (!str.equals(addressComponent.getShortName())) {
            return false;
        }
        return this.zzc.equals(addressComponent.getTypes());
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode();
        String str = this.zzb;
        return ((((iHashCode ^ 1000003) * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.zzc.hashCode();
    }

    public final String toString() {
        String string = this.zzc.toString();
        String str = this.zzb;
        int length = String.valueOf(str).length();
        int length2 = string.length();
        String str2 = this.zza;
        StringBuilder sb = new StringBuilder(str2.length() + 34 + length + 8 + length2 + 1);
        sb.append("AddressComponent{name=");
        sb.append(str2);
        sb.append(", shortName=");
        sb.append(str);
        sb.append(", types=");
        sb.append(string);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.api.model.AddressComponent
    public final String getName() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.AddressComponent
    public final String getShortName() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.AddressComponent
    public final List<String> getTypes() {
        return this.zzc;
    }
}
