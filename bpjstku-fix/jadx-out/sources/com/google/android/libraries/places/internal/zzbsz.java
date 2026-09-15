package com.google.android.libraries.places.internal;

import java.util.Objects;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes3.dex */
final class zzbsz implements zzbhz {
    final /* synthetic */ zzbti zza;
    private zzbth zzb;

    /* synthetic */ zzbsz(zzbti zzbtiVar, byte[] bArr) {
        Objects.requireNonNull(zzbtiVar);
        this.zza = zzbtiVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbhz
    public final void zza(zzbfz zzbfzVar) throws IllegalAccessException {
        zzbti zzbtiVar = this.zza;
        if (zzbtiVar.zzm()) {
            zzbti.zzh().logp(Level.WARNING, "io.grpc.internal.PickFirstLeafLoadBalancer$HealthListener", "onSubchannelState", "Ignoring health status {0} for subchannel {1} as this is not under a petiole policy", new Object[]{zzbfzVar, this.zzb.zzf()});
            return;
        }
        zzbti.zzh().logp(Level.FINE, "io.grpc.internal.PickFirstLeafLoadBalancer$HealthListener", "onSubchannelState", "Received health status {0} for subchannel {1}", new Object[]{zzbfzVar, this.zzb.zzf()});
        this.zzb.zzi(zzbfzVar);
        if (zzbtiVar.zzk().zza()) {
            if (this.zzb == zzbtiVar.zzj().get(zzbtiVar.zzk().zzd())) {
                zzbtiVar.zzg(this.zzb);
            }
        }
    }

    final /* synthetic */ void zzb(zzbth zzbthVar) {
        this.zzb = zzbthVar;
    }
}
