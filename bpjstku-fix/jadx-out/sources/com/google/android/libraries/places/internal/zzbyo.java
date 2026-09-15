package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbyo {
    private final String[] zza;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int iZza = zza();
        for (int i = 0; i < iZza; i++) {
            sb.append(zzb(i));
            sb.append(": ");
            sb.append(zzc(i));
            sb.append("\n");
        }
        return sb.toString();
    }

    public final int zza() {
        return this.zza.length >> 1;
    }

    public final String zzb(int i) {
        int i2 = i + i;
        if (i2 < 0) {
            return null;
        }
        String[] strArr = this.zza;
        if (i2 < strArr.length) {
            return strArr[i2];
        }
        return null;
    }

    public final String zzc(int i) {
        int i2 = i + i + 1;
        if (i2 < 0) {
            return null;
        }
        String[] strArr = this.zza;
        if (i2 < strArr.length) {
            return strArr[i2];
        }
        return null;
    }
}
