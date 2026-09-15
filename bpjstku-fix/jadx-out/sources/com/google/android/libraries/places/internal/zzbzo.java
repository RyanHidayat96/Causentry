package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbzo {
    private int zza;
    private final int[] zzb = new int[10];

    public final zzbzo zza(int i, int i2, int i3) {
        if (i >= 10) {
            return this;
        }
        this.zza = (1 << i) | this.zza;
        this.zzb[i] = i3;
        return this;
    }

    public final int zzc(int i) {
        return this.zzb[i];
    }

    final int zzd() {
        return Integer.bitCount(this.zza);
    }

    public final boolean zzb(int i) {
        return ((1 << i) & this.zza) != 0;
    }

    final int zze() {
        if ((this.zza & 2) != 0) {
            return this.zzb[1];
        }
        return -1;
    }

    final int zzf(int i) {
        return (this.zza & 32) != 0 ? this.zzb[5] : i;
    }
}
