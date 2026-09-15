package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbgu {
    private String zza;
    private zzbgv zzb;
    private Long zzc;
    private zzbhk zzd;

    public final zzbgu zzb(long j) {
        this.zzc = Long.valueOf(j);
        return this;
    }

    public final zzbgw zze() {
        String str = this.zza;
        if (str == null) {
            throw new NullPointerException("description");
        }
        zzbgv zzbgvVar = this.zzb;
        if (zzbgvVar == null) {
            throw new NullPointerException("severity");
        }
        Long l = this.zzc;
        if (l != null) {
            return new zzbgw(str, zzbgvVar, l.longValue(), null, this.zzd, null);
        }
        throw new NullPointerException("timestampNanos");
    }

    public final zzbgu zza(String str) {
        this.zza = str;
        return this;
    }

    public final zzbgu zzc(zzbgv zzbgvVar) {
        this.zzb = zzbgvVar;
        return this;
    }

    public final zzbgu zzd(zzbhk zzbhkVar) {
        this.zzd = zzbhkVar;
        return this;
    }
}
