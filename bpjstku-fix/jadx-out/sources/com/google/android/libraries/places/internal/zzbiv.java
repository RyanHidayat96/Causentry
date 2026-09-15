package com.google.android.libraries.places.internal;

import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbiv {
    private static zzbiv zza;

    zzbiv() {
        new HashSet();
    }

    public static zzbiv zza() {
        zzbiv zzbivVar;
        synchronized (zzbiv.class) {
            if (zza == null) {
                zza = new zzbiv();
            }
            zzbivVar = zza;
        }
        return zzbivVar;
    }
}
