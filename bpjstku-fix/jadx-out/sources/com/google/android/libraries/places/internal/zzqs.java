package com.google.android.libraries.places.internal;

import androidx.collection.SimpleArrayMap;

/* JADX INFO: loaded from: classes3.dex */
final class zzqs extends zzqt {
    static final zzqt zza;

    static {
        zzqt zzqtVarZzb = new zzqs(null, new SimpleArrayMap(0)).zzb();
        zza = zzqtVarZzb;
        zzqs zzqsVar = new zzqs(zzqtVarZzb, new SimpleArrayMap(), null);
        boolean zZzh = zzqsVar.zzh();
        Boolean bool = Boolean.TRUE;
        if (!(!zZzh)) {
            throw new IllegalStateException("Can't mutate after handing to trace");
        }
        zzqr zzqrVarZzf = zzqt.zzf();
        if (!(!zzqsVar.zzd(zzqrVarZzf))) {
            throw new IllegalStateException("Key already present");
        }
        zzqsVar.zzg().put(zzqrVarZzf, bool);
        zzqsVar.zzb();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private zzqs(zzqt zzqtVar, SimpleArrayMap simpleArrayMap) {
        super(null, simpleArrayMap, 0 == true ? 1 : 0);
    }

    /* synthetic */ zzqs(zzqt zzqtVar, SimpleArrayMap simpleArrayMap, byte[] bArr) {
        super(zzqtVar, simpleArrayMap, null);
    }
}
