package com.google.android.libraries.places.internal;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zzqv {
    int zza;
    final int zzb;
    zzqv zzc;
    final Map zzd = new HashMap(0);

    zzqv(int i, int i2, zzqv zzqvVar) {
        if (i > i2) {
            throw new IllegalArgumentException();
        }
        this.zza = i;
        this.zzb = i2;
        this.zzc = null;
    }

    public final String toString() {
        int iIdentityHashCode = System.identityHashCode(this);
        StringBuilder sb = new StringBuilder(String.valueOf(iIdentityHashCode).length() + 4);
        sb.append("Node");
        sb.append(iIdentityHashCode);
        return sb.toString();
    }
}
