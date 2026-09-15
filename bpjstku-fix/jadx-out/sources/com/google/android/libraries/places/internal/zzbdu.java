package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbdu {
    private static volatile zzbiu zza;

    public static zzbiu zza() {
        zzbiu zzbiuVarZzf;
        zzbiu zzbiuVar = zza;
        if (zzbiuVar != null) {
            return zzbiuVar;
        }
        synchronized (zzbdu.class) {
            zzbiuVarZzf = zza;
            if (zzbiuVarZzf == null) {
                zzbiq zzbiqVarZzi = zzbiu.zzi(null, null);
                zzbiqVarZzi.zzc(zzbis.UNARY);
                zzbiqVarZzi.zzd(zzbiu.zzh("google.internal.maps.mapsmobilesdks.v1.MapsMobileSDKsService", "GetSession"));
                zzbiqVarZzi.zze(true);
                zzbiqVarZzi.zza(zzbzw.zza(zzbdp.zze()));
                zzbiqVarZzi.zzb(zzbzw.zza(zzbdr.zze()));
                zzbiuVarZzf = zzbiqVarZzi.zzf();
                zza = zzbiuVarZzf;
            }
        }
        return zzbiuVarZzf;
    }

    public static zzbdt zzb(zzbfe zzbfeVar) {
        return (zzbdt) zzbzy.zzb(new zzbds(), zzbfeVar, zzbfd.zza);
    }

    private zzbdu() {
    }
}
