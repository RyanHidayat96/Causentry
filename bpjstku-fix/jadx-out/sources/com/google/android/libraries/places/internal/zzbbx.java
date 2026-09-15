package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
final class zzbbx implements zzbbi {
    private final zzbbl zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    zzbbx(zzbbl zzbblVar, String str, Object[] objArr) {
        this.zza = zzbblVar;
        this.zzb = str;
        this.zzc = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.zzd = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            char cCharAt2 = str.charAt(i3);
            if (cCharAt2 < 55296) {
                this.zzd = i | (cCharAt2 << i2);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i2;
                i2 += 13;
                i3++;
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbbi
    public final boolean zza() {
        return (this.zzd & 2) == 2;
    }

    @Override // com.google.android.libraries.places.internal.zzbbi
    public final zzbbl zzb() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzbbi
    public final int zzc() {
        int i = this.zzd;
        if ((i & 1) != 0) {
            return 1;
        }
        return (i & 4) == 4 ? 3 : 2;
    }

    final String zzd() {
        return this.zzb;
    }

    final Object[] zze() {
        return this.zzc;
    }
}
