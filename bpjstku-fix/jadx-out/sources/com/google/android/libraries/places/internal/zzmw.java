package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class zzmw {
    public static zzaks zza(zzmp zzmpVar, zzmo zzmoVar) {
        return zzb(zzmpVar, zzmoVar == zzmo.AUTOCOMPLETE_WIDGET ? 2 : 3, zzmoVar, com.google.android.libraries.places.api.auth.zzb.zza);
    }

    public static zzaks zzb(zzmp zzmpVar, int i, zzmo zzmoVar, com.google.android.libraries.places.api.auth.zzb zzbVar) throws Throwable {
        int i2;
        zzmo zzmoVar2 = zzmo.PROGRAMMATIC_KOTLIN_API;
        int iOrdinal = zzmpVar.zzc().ordinal();
        if (iOrdinal != 0) {
            i2 = 4;
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    i2 = 5;
                } else if (iOrdinal != 3) {
                    i2 = iOrdinal != 4 ? 1 : 8;
                } else {
                    i2 = 7;
                }
            }
        } else {
            i2 = 2;
        }
        int i3 = zzmoVar == zzmoVar2 ? 2 : 3;
        zzaks zzaksVarZza = zzakz.zza();
        zzul zzulVarZza = zzuq.zza();
        zzulVarZza.zza(zzmpVar.zza());
        zzulVarZza.zzb(zzmpVar.zzb());
        zzaksVarZza.zza((zzuq) zzulVarZza.zzG());
        zzaksVarZza.zzg(i == 2);
        zzaksVarZza.zzr(i);
        zzaksVarZza.zzq(i2);
        zzaksVarZza.zzs(i3);
        zzaksVarZza.zzi("4.4.1");
        zzaksVarZza.zzm(zzbVar.zza());
        String strZzc = zzbVar.zzc();
        if (strZzc != null) {
            zzahk zzahkVarZza = zzahl.zza();
            zzahkVarZza.zza(strZzc);
            zzaksVarZza.zzl(zzahkVarZza);
        }
        return zzaksVarZza;
    }
}
