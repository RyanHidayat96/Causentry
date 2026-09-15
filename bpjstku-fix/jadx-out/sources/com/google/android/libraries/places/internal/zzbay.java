package com.google.android.libraries.places.internal;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class zzbay {
    public static final List zza(Object obj, long j) {
        zzbao zzbaoVar = (zzbao) zzbct.zzn(obj, j);
        if (zzbaoVar.zza()) {
            return zzbaoVar;
        }
        int size = zzbaoVar.size();
        zzbao zzbaoVarZzg = zzbaoVar.zzg(size == 0 ? 10 : size + size);
        zzbct.zzo(obj, j, zzbaoVarZzg);
        return zzbaoVarZzg;
    }

    zzbay() {
    }
}
