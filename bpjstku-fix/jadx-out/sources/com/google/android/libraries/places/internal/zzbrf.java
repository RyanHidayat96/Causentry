package com.google.android.libraries.places.internal;

import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
final class zzbrf extends zzbhr {
    zzbkw zza;
    final /* synthetic */ zzbrx zzb;

    /* synthetic */ zzbrf(zzbrx zzbrxVar, byte[] bArr) {
        Objects.requireNonNull(zzbrxVar);
        this.zzb = zzbrxVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbhr
    public final /* synthetic */ zzbhx zza(zzbho zzbhoVar) {
        zzbrx zzbrxVar = this.zzb;
        zzbrxVar.zze.zzc();
        if (!zzbrxVar.zzP()) {
            return new zzbrv(zzbrxVar, zzbhoVar);
        }
        throw new IllegalStateException("Channel is being terminated");
    }

    @Override // com.google.android.libraries.places.internal.zzbhr
    public final void zzb(zzbfy zzbfyVar, zzbhy zzbhyVar) {
        zzbrx zzbrxVar = this.zzb;
        zzbrxVar.zze.zzc();
        if (zzbfyVar == null) {
            throw new NullPointerException("newState");
        }
        if (zzbhyVar == null) {
            throw new NullPointerException("newPicker");
        }
        if (this != zzbrxVar.zzE() || zzbrxVar.zzF()) {
            return;
        }
        zzbrxVar.zzo(zzbhyVar);
        if (zzbfyVar != zzbfy.SHUTDOWN) {
            zzbrxVar.zzV().zzb(2, "Entering {0} state with picker: {1}", zzbfyVar, zzbhyVar);
            zzbrxVar.zzA().zza(zzbfyVar);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbhr
    public final void zzc() {
        zzbkd zzbkdVar = this.zzb.zze;
        zzbkdVar.zzc();
        zzbkdVar.zzb(new zzbre(this));
        zzbkdVar.zza();
    }

    @Override // com.google.android.libraries.places.internal.zzbhr
    public final zzbkd zzd() {
        return this.zzb.zze;
    }

    @Override // com.google.android.libraries.places.internal.zzbhr
    public final ScheduledExecutorService zze() {
        return this.zzb.zzv();
    }
}
