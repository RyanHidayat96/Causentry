package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
final class zzbzm {
    private final zzbzm[] zza;
    private final int zzb;
    private final int zzc;

    zzbzm() {
        this.zza = new zzbzm[256];
        this.zzb = 0;
        this.zzc = 0;
    }

    zzbzm(int i, int i2) {
        this.zza = null;
        this.zzb = i;
        int i3 = i2 & 7;
        this.zzc = i3 == 0 ? 8 : i3;
    }

    final /* synthetic */ zzbzm[] zza() {
        return this.zza;
    }

    final /* synthetic */ int zzb() {
        return this.zzb;
    }

    final /* synthetic */ int zzc() {
        return this.zzc;
    }
}
