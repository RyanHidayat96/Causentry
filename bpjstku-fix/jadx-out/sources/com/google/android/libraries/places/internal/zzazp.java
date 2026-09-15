package com.google.android.libraries.places.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzazp {
    static final zzazp zza = new zzazp(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private final Map zzd;

    zzazp() {
        this.zzd = new HashMap();
    }

    public static zzazp zza() {
        return zza;
    }

    public final zzbad zzb(zzbbl zzbblVar, int i) {
        return (zzbad) this.zzd.get(new zzazo(zzbblVar, i));
    }

    zzazp(boolean z) {
        this.zzd = Collections.emptyMap();
    }
}
