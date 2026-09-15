package com.google.android.gms.internal.mlkit_vision_common;

/* JADX INFO: loaded from: classes6.dex */
public final class zzlk {
    private static zzlk zza;

    public static final boolean zzb() {
        return zzlj.zza("mlkit-dev-profiling");
    }

    private zzlk() {
    }

    public static zzlk zza() {
        zzlk zzlkVar;
        synchronized (zzlk.class) {
            if (zza == null) {
                zza = new zzlk();
            }
            zzlkVar = zza;
        }
        return zzlkVar;
    }
}
