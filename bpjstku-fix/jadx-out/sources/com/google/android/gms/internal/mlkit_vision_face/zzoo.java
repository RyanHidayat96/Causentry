package com.google.android.gms.internal.mlkit_vision_face;

/* JADX INFO: loaded from: classes4.dex */
public final class zzoo {
    private static zzoo zza;

    private zzoo() {
    }

    public static zzoo zza() {
        zzoo zzooVar;
        synchronized (zzoo.class) {
            if (zza == null) {
                zza = new zzoo();
            }
            zzooVar = zza;
        }
        return zzooVar;
    }
}
