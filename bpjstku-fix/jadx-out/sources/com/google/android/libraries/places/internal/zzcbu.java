package com.google.android.libraries.places.internal;

import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcbu {
    public final byte[] zza;
    public int zzb;
    public int zzc;
    public boolean zzd;
    public final boolean zze;
    public zzcbu zzf;
    public zzcbu zzg;

    public final zzcbu zza() {
        this.zzd = true;
        return new zzcbu(this.zza, this.zzb, this.zzc, true, false);
    }

    public final zzcbu zzb() {
        zzcbu zzcbuVar = this.zzf;
        if (zzcbuVar == this) {
            zzcbuVar = null;
        }
        zzcbu zzcbuVar2 = this.zzg;
        Intrinsics.checkNotNull(zzcbuVar2);
        zzcbuVar2.zzf = this.zzf;
        zzcbu zzcbuVar3 = this.zzf;
        Intrinsics.checkNotNull(zzcbuVar3);
        zzcbuVar3.zzg = this.zzg;
        this.zzf = null;
        this.zzg = null;
        return zzcbuVar;
    }

    public final zzcbu zzc(zzcbu zzcbuVar) {
        Intrinsics.checkNotNullParameter(zzcbuVar, "");
        zzcbuVar.zzg = this;
        zzcbuVar.zzf = this.zzf;
        zzcbu zzcbuVar2 = this.zzf;
        Intrinsics.checkNotNull(zzcbuVar2);
        zzcbuVar2.zzg = zzcbuVar;
        this.zzf = zzcbuVar;
        return zzcbuVar;
    }

    public final void zze(zzcbu zzcbuVar, int i) {
        Intrinsics.checkNotNullParameter(zzcbuVar, "");
        if (!zzcbuVar.zze) {
            throw new IllegalStateException("only owner can write");
        }
        int i2 = zzcbuVar.zzc;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (zzcbuVar.zzd) {
                throw new IllegalArgumentException();
            }
            int i4 = zzcbuVar.zzb;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = zzcbuVar.zza;
            ArraysKt.copyInto$default(bArr, bArr, 0, i4, i2, 2, (Object) null);
            i2 = zzcbuVar.zzc - zzcbuVar.zzb;
            zzcbuVar.zzc = i2;
            zzcbuVar.zzb = 0;
        }
        byte[] bArr2 = this.zza;
        byte[] bArr3 = zzcbuVar.zza;
        int i5 = this.zzb;
        ArraysKt.copyInto(bArr2, bArr3, i2, i5, i5 + i);
        zzcbuVar.zzc += i;
        this.zzb += i;
    }

    public final zzcbu zzd(int i) {
        zzcbu zzcbuVarZza;
        if (i > this.zzc - this.zzb) {
            throw new IllegalArgumentException("byteCount out of range");
        }
        if (i >= 1024) {
            zzcbuVarZza = zza();
        } else {
            byte[] bArr = this.zza;
            zzcbuVarZza = zzcbv.zza();
            byte[] bArr2 = zzcbuVarZza.zza;
            int i2 = this.zzb;
            ArraysKt.copyInto$default(bArr, bArr2, 0, i2, i2 + i, 2, (Object) null);
        }
        zzcbuVarZza.zzc = zzcbuVarZza.zzb + i;
        this.zzb += i;
        zzcbu zzcbuVar = this.zzg;
        Intrinsics.checkNotNull(zzcbuVar);
        zzcbuVar.zzc(zzcbuVarZza);
        return zzcbuVarZza;
    }

    public zzcbu() {
        this.zza = new byte[8192];
        this.zze = true;
        this.zzd = false;
    }

    public zzcbu(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(bArr, "");
        this.zza = bArr;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = z;
        this.zze = false;
    }
}
