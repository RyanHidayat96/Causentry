package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbdh {
    private static volatile zzbiu zza;
    private static volatile zzbiu zzb;

    public static zzbiu zza() {
        zzbiu zzbiuVarZzf;
        zzbiu zzbiuVar = zza;
        if (zzbiuVar != null) {
            return zzbiuVar;
        }
        synchronized (zzbdh.class) {
            zzbiuVarZzf = zza;
            if (zzbiuVarZzf == null) {
                zzbiq zzbiqVarZzi = zzbiu.zzi(null, null);
                zzbiqVarZzi.zzc(zzbis.UNARY);
                zzbiqVarZzi.zzd(zzbiu.zzh("google.internal.maps.gmpsdksbackend.v1.GmpSdksBackendService", "InitMapsJwt"));
                zzbiqVarZzi.zze(true);
                zzbiqVarZzi.zza(zzbzw.zza(zzbdj.zze()));
                zzbiqVarZzi.zzb(zzbzw.zza(zzbdl.zzf()));
                zzbiuVarZzf = zzbiqVarZzi.zzf();
                zza = zzbiuVarZzf;
            }
        }
        return zzbiuVarZzf;
    }

    public static zzbiu zzb() {
        zzbiu zzbiuVarZzf;
        zzbiu zzbiuVar = zzb;
        if (zzbiuVar != null) {
            return zzbiuVar;
        }
        synchronized (zzbdh.class) {
            zzbiuVarZzf = zzb;
            if (zzbiuVarZzf == null) {
                zzbiq zzbiqVarZzi = zzbiu.zzi(null, null);
                zzbiqVarZzi.zzc(zzbis.UNARY);
                zzbiqVarZzi.zzd(zzbiu.zzh("google.internal.maps.gmpsdksbackend.v1.GmpSdksBackendService", "GetPlaceWidgetMetadata"));
                zzbiqVarZzi.zze(true);
                zzbiqVarZzi.zza(zzbzw.zza(zzbde.zze()));
                zzbiqVarZzi.zzb(zzbzw.zza(zzbdn.zze()));
                zzbiuVarZzf = zzbiqVarZzi.zzf();
                zzb = zzbiuVarZzf;
            }
        }
        return zzbiuVarZzf;
    }

    public static zzbdg zzc(zzbfe zzbfeVar) {
        return (zzbdg) zzbzy.zzb(new zzbdf(), zzbfeVar, zzbfd.zza);
    }

    private zzbdh() {
    }
}
