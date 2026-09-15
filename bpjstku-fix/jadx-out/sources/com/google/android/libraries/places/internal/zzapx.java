package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
final class zzapx {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private boolean zzd = false;
    private final int zze;

    final zzapx zzc() {
        int i = this.zze;
        if (!(!(i == 4))) {
            throw new IllegalStateException("UNDERLYING_CALL_STARTED state is terminal, cannot transition");
        }
        if (i == 3) {
            return new zzapx(this.zza, 4, this.zzb, this.zzc);
        }
        if (i == 1 && this.zzd) {
            int i2 = this.zza;
            int i3 = this.zzb;
            return new zzapx(i2, 2, i3, i3);
        }
        int i4 = this.zzb;
        int i5 = i4 + 1;
        int i6 = this.zza;
        int i7 = i5 >= i6 ? 3 : 1;
        int i8 = this.zzc;
        if (i5 < i6) {
            i4 = i5;
        }
        return new zzapx(i6, i7, i4, i8);
    }

    private zzapx(int i, int i2, int i3, int i4) {
        this.zza = i;
        this.zze = i2;
        this.zzb = i3;
        this.zzc = i4;
    }

    static zzapx zzb(int i) {
        return new zzapx(i, 1, 0, 0);
    }

    final void zza() {
        this.zzd = true;
    }

    final /* synthetic */ int zzd() {
        return this.zza;
    }

    final /* synthetic */ int zze() {
        return this.zzb;
    }

    final /* synthetic */ int zzf() {
        return this.zzc;
    }

    final /* synthetic */ int zzg() {
        return this.zze;
    }
}
