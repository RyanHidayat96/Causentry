package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes5.dex */
public final class zzji {
    private static zzjh zza;

    public static void zza(zzjh zzjhVar) {
        synchronized (zzji.class) {
            if (zza != null) {
                throw new IllegalStateException("init() already called");
            }
            zza = zzjhVar;
        }
    }

    public static zzjh zzb() {
        zzjh zzjhVar;
        synchronized (zzji.class) {
            if (zza == null) {
                zza(new zzjl());
            }
            zzjhVar = zza;
        }
        return zzjhVar;
    }
}
