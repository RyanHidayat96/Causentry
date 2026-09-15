package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbzr {
    private final String zza;
    private final int zzb;
    private final String zzc;

    /* synthetic */ zzbzr(zzbzq zzbzqVar, byte[] bArr) {
        this.zza = zzbzqVar.zzb;
        this.zzb = zzbzqVar.zzd();
        this.zzc = zzbzqVar.toString();
    }

    public static int zzc(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    static int zzd(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'a' && c <= 'f') {
            return c - 'W';
        }
        if (c < 'A' || c > 'F') {
            return -1;
        }
        return c - '7';
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzbzr) && ((zzbzr) obj).zzc.equals(this.zzc);
    }

    public final int hashCode() {
        return this.zzc.hashCode();
    }

    public final String toString() {
        return this.zzc;
    }

    public final String zza() {
        return this.zza;
    }

    public final int zzb() {
        return this.zzb;
    }
}
