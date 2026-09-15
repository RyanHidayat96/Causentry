package com.google.android.libraries.places.internal;

import com.google.android.gms.tasks.CancellationTokenSource;

/* JADX INFO: loaded from: classes3.dex */
final class zznl extends zznq {
    private final CancellationTokenSource zza;
    private final String zzb;

    zznl(CancellationTokenSource cancellationTokenSource, String str) {
        this.zza = cancellationTokenSource;
        if (str == null) {
            throw new NullPointerException("Null query");
        }
        this.zzb = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zznq)) {
            return false;
        }
        zznq zznqVar = (zznq) obj;
        return this.zza.equals(zznqVar.zza()) && this.zzb.equals(zznqVar.zzb());
    }

    public final int hashCode() {
        return ((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode();
    }

    public final String toString() {
        String string = this.zza.toString();
        int length = string.length();
        String str = this.zzb;
        StringBuilder sb = new StringBuilder(length + 35 + str.length() + 1);
        sb.append("AutocompleteRequest{source=");
        sb.append(string);
        sb.append(", query=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.internal.zzns
    public final CancellationTokenSource zza() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.internal.zznq
    public final String zzb() {
        return this.zzb;
    }
}
