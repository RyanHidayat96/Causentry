package com.google.android.gms.internal.mlkit_common;

/* JADX INFO: loaded from: classes3.dex */
public final class zzne {
    private static zzne zza;

    public static void zzb() {
        zznd.zza();
    }

    private zzne() {
    }

    public static zzne zza() {
        zzne zzneVar;
        synchronized (zzne.class) {
            if (zza == null) {
                zza = new zzne();
            }
            zzneVar = zza;
        }
        return zzneVar;
    }
}
