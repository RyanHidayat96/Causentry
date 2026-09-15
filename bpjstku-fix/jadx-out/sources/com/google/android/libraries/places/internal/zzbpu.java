package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzbpu implements Runnable {
    final /* synthetic */ zzbmg zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzbqg zzc;

    zzbpu(zzbqg zzbqgVar, zzbmg zzbmgVar, boolean z) {
        this.zza = zzbmgVar;
        this.zzb = z;
        Objects.requireNonNull(zzbqgVar);
        this.zzc = zzbqgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zzz().zza(this.zza, this.zzb);
    }
}
