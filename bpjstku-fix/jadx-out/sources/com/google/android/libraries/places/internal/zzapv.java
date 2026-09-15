package com.google.android.libraries.places.internal;

import java.util.LinkedHashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzapv {
    final /* synthetic */ zzapy zza;
    private final Object zzb;
    private final LinkedHashMap zzc;
    private int zzd;

    /* synthetic */ zzapv(zzapy zzapyVar, Object obj, byte[] bArr) {
        Objects.requireNonNull(zzapyVar);
        this.zza = zzapyVar;
        this.zzc = new LinkedHashMap();
        this.zzb = obj;
    }

    final boolean zza() {
        return this.zzc.isEmpty() && this.zzd == this.zza.zzr().zzd();
    }

    final boolean zzb() {
        return this.zzc.isEmpty() && this.zzd == this.zza.zzr().zzf() + 1;
    }

    final /* synthetic */ Object zzc() {
        return this.zzb;
    }

    final /* synthetic */ LinkedHashMap zzd() {
        return this.zzc;
    }

    final /* synthetic */ int zze() {
        return this.zzd;
    }

    final /* synthetic */ void zzf(int i) {
        this.zzd = i;
    }
}
