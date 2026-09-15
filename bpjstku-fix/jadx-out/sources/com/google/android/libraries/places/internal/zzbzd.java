package com.google.android.libraries.places.internal;

import okhttp3.internal.http2.Header;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbzd {
    public static final zzcbn zza = zzcbm.zza(Header.RESPONSE_STATUS_UTF8);
    public static final zzcbn zzb = zzcbm.zza(Header.TARGET_METHOD_UTF8);
    public static final zzcbn zzc = zzcbm.zza(Header.TARGET_PATH_UTF8);
    public static final zzcbn zzd = zzcbm.zza(Header.TARGET_SCHEME_UTF8);
    public static final zzcbn zze = zzcbm.zza(Header.TARGET_AUTHORITY_UTF8);
    public final zzcbn zzf;
    public final zzcbn zzg;
    final int zzh;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbzd)) {
            return false;
        }
        zzbzd zzbzdVar = (zzbzd) obj;
        return this.zzf.equals(zzbzdVar.zzf) && this.zzg.equals(zzbzdVar.zzg);
    }

    public final int hashCode() {
        return ((this.zzf.hashCode() + 527) * 31) + this.zzg.hashCode();
    }

    public final String toString() {
        return String.format("%s: %s", this.zzf.zze(), this.zzg.zze());
    }

    static {
        zzcbm.zza(":host");
        zzcbm.zza(":version");
    }

    public zzbzd(String str, String str2) {
        this(zzcbm.zza(str), zzcbm.zza(str2));
    }

    public zzbzd(zzcbn zzcbnVar, zzcbn zzcbnVar2) {
        this.zzf = zzcbnVar;
        this.zzg = zzcbnVar2;
        this.zzh = zzcbnVar.zzj() + 32 + zzcbnVar2.zzj();
    }
}
