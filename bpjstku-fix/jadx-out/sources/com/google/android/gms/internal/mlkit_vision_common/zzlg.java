package com.google.android.gms.internal.mlkit_vision_common;

/* JADX INFO: loaded from: classes6.dex */
public final class zzlg {
    private static zzlf zza;

    public static zzkx zza(zzkr zzkrVar) {
        zzkx zzkxVar;
        synchronized (zzlg.class) {
            if (zza == null) {
                zza = new zzlf(null);
            }
            zzkxVar = (zzkx) zza.get(zzkrVar);
        }
        return zzkxVar;
    }

    public static zzkx zzb(String str) {
        zzkx zzkxVarZza;
        synchronized (zzlg.class) {
            zzkxVarZza = zza(zzkr.zzd("vision-common").zzd());
        }
        return zzkxVarZza;
    }
}
