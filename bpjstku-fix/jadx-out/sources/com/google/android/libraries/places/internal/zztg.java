package com.google.android.libraries.places.internal;

import java.util.Set;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes6.dex */
public final class zztg implements zzsz {
    private final String zza;
    private final Level zzb;
    private final Set zzc;
    private final zzsq zzd;
    private final int zze;

    private zztg() {
        this("", true, 2, Level.ALL, false, zzti.zzb, zzti.zzc);
    }

    /* synthetic */ zztg(byte[] bArr) {
        this("", true, 2, Level.ALL, false, zzti.zzb, zzti.zzc);
    }

    @Override // com.google.android.libraries.places.internal.zzsz
    public final zzsh zza(String str) {
        return new zzti(this.zza, str, true, 2, this.zzb, this.zzc, this.zzd, null);
    }

    private zztg(String str, boolean z, int i, Level level, boolean z2, Set set, zzsq zzsqVar) {
        this.zza = "";
        this.zze = 2;
        this.zzb = level;
        this.zzc = set;
        this.zzd = zzsqVar;
    }

    public final zztg zzb(boolean z) {
        Set set = this.zzc;
        zzsq zzsqVar = this.zzd;
        return new zztg(this.zza, true, 2, Level.OFF, false, set, zzsqVar);
    }
}
