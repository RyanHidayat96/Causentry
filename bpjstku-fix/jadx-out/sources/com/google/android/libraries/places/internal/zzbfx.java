package com.google.android.libraries.places.internal;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class zzbfx {
    private static zzbfx zza;
    private final List zzb = Collections.emptyList();
    private int zzc = 0;

    zzbfx() {
    }

    public static zzbfx zza() {
        zzbfx zzbfxVar;
        synchronized (zzbfx.class) {
            if (zza == null) {
                zza = new zzbfx();
            }
            zzbfxVar = zza;
        }
        return zzbfxVar;
    }

    public final List zzb() {
        List list;
        synchronized (this) {
            this.zzc++;
            list = this.zzb;
        }
        return list;
    }

    public final boolean zzc() {
        synchronized (this) {
        }
        return false;
    }
}
