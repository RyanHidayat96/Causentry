package com.google.android.libraries.places.widget.internal.placedetails;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbc {
    private final boolean zza;
    private final List zzb;
    private final int zzc;
    private final int zzd;

    public zzbc(boolean z, List list, int i, int i2) {
        Intrinsics.checkNotNullParameter(list, "");
        this.zza = z;
        this.zzb = list;
        this.zzc = i;
        this.zzd = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbc)) {
            return false;
        }
        zzbc zzbcVar = (zzbc) obj;
        return this.zza == zzbcVar.zza && Intrinsics.areEqual(this.zzb, zzbcVar.zzb) && this.zzc == zzbcVar.zzc && this.zzd == zzbcVar.zzd;
    }

    public final int hashCode() {
        return (((((Boolean.hashCode(this.zza) * 31) + this.zzb.hashCode()) * 31) + Integer.hashCode(this.zzc)) * 31) + Integer.hashCode(this.zzd);
    }

    public final String toString() {
        boolean z = this.zza;
        int length = String.valueOf(z).length();
        List list = this.zzb;
        int length2 = String.valueOf(list).length();
        int i = this.zzc;
        int length3 = String.valueOf(i).length();
        int i2 = this.zzd;
        StringBuilder sb = new StringBuilder(length + 51 + length2 + 29 + length3 + 29 + String.valueOf(i2).length() + 1);
        sb.append("RequestConfiguration(mediaRequested=");
        sb.append(z);
        sb.append(", fieldsToLoad=");
        sb.append(list);
        sb.append(", thumbSizeDimensionInPixels=");
        sb.append(i);
        sb.append(", screenMaxDimensionInPixels=");
        sb.append(i2);
        sb.append(")");
        return sb.toString();
    }

    public final boolean zza() {
        return this.zza;
    }

    public final List zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zzc;
    }

    public final int zzd() {
        return this.zzd;
    }
}
