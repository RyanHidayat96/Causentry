package com.google.android.libraries.places.internal;

import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
abstract class zzqh extends zzqc {
    private final zzqt zza;

    zzqh(String str, String str2, String str3, int i, UUID uuid, String str4, zzqt zzqtVar, zzqy zzqyVar) {
        super("<skip trace>", "", "", 0, uuid, str4, zzqyVar);
        if (!zzqtVar.zze()) {
            throw new IllegalArgumentException();
        }
        this.zza = zzqtVar;
    }

    @Override // com.google.android.libraries.places.internal.zzra
    public final zzqt zzg() {
        return zzqt.zza(this.zza, zzj());
    }
}
