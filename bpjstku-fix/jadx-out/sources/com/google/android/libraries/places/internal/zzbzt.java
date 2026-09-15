package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbzt {
    private final zzbzr zza;
    private final zzbyo zzb;

    /* synthetic */ zzbzt(zzbzs zzbzsVar, byte[] bArr) {
        this.zza = zzbzsVar.zzd();
        this.zzb = zzbzsVar.zze().zzb();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zza);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 13);
        sb.append("Request{url=");
        sb.append(strValueOf);
        sb.append("}");
        return sb.toString();
    }

    public final zzbzr zza() {
        return this.zza;
    }

    public final zzbyo zzb() {
        return this.zzb;
    }
}
