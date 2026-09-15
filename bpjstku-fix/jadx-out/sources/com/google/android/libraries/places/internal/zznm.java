package com.google.android.libraries.places.internal;

import com.google.android.gms.tasks.CancellationTokenSource;

/* JADX INFO: loaded from: classes3.dex */
final class zznm extends zznr {
    private final CancellationTokenSource zza;
    private final String zzb;

    zznm(CancellationTokenSource cancellationTokenSource, String str) {
        this.zza = cancellationTokenSource;
        if (str == null) {
            throw new NullPointerException("Null placeId");
        }
        this.zzb = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zznr)) {
            return false;
        }
        zznr zznrVar = (zznr) obj;
        return this.zza.equals(zznrVar.zza()) && this.zzb.equals(zznrVar.zzb());
    }

    public final int hashCode() {
        return ((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode();
    }

    public final String toString() {
        String string = this.zza.toString();
        int length = string.length();
        String str = this.zzb;
        StringBuilder sb = new StringBuilder(length + 30 + str.length() + 1);
        sb.append("PlaceRequest{source=");
        sb.append(string);
        sb.append(", placeId=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.internal.zzns
    public final CancellationTokenSource zza() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.internal.zznr
    public final String zzb() {
        return this.zzb;
    }
}
