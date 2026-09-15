package com.google.android.libraries.places.internal;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
final class zzbcq extends zzbcs {
    zzbcq(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.libraries.places.internal.zzbcs
    public final void zza(Object obj, long j, byte b) {
        if (zzbct.zzb) {
            zzbct.zzD(obj, j, b);
        } else {
            zzbct.zzE(obj, j, b);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbcs
    public final boolean zzb(Object obj, long j) {
        return zzbct.zzb ? zzbct.zzu(obj, j) : zzbct.zzv(obj, j);
    }

    @Override // com.google.android.libraries.places.internal.zzbcs
    public final void zzc(Object obj, long j, boolean z) {
        if (zzbct.zzb) {
            zzbct.zzD(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            zzbct.zzE(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbcs
    public final float zzd(Object obj, long j) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j));
    }

    @Override // com.google.android.libraries.places.internal.zzbcs
    public final void zze(Object obj, long j, float f) {
        this.zza.putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // com.google.android.libraries.places.internal.zzbcs
    public final double zzf(Object obj, long j) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j));
    }

    @Override // com.google.android.libraries.places.internal.zzbcs
    public final void zzg(Object obj, long j, double d) {
        this.zza.putLong(obj, j, Double.doubleToLongBits(d));
    }
}
