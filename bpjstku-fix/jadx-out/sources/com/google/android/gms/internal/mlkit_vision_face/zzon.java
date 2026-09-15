package com.google.android.gms.internal.mlkit_vision_face;

/* JADX INFO: loaded from: classes6.dex */
public final class zzon {
    private static zzom zza;

    public static zzoc zza(zznt zzntVar) {
        zzoc zzocVar;
        synchronized (zzon.class) {
            if (zza == null) {
                zza = new zzom(null);
            }
            zzocVar = (zzoc) zza.get(zzntVar);
        }
        return zzocVar;
    }

    public static zzoc zzb(String str) {
        zzoc zzocVarZza;
        synchronized (zzon.class) {
            zzocVarZza = zza(zznt.zzd(str).zzd());
        }
        return zzocVarZza;
    }
}
