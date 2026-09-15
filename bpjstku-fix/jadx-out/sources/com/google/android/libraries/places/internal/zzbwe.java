package com.google.android.libraries.places.internal;

import java.util.IdentityHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbwe {
    private static final zzbwe zza = new zzbwe(new zzbwa());
    private final IdentityHashMap zzb = new IdentityHashMap();
    private ScheduledExecutorService zzc;

    zzbwe(zzbwa zzbwaVar) {
    }

    public static Object zza(zzbwd zzbwdVar) {
        return zza.zzc(zzbwdVar);
    }

    public static Object zzb(zzbwd zzbwdVar, Object obj) {
        zza.zzd(zzbwdVar, obj);
        return null;
    }

    final Object zzc(zzbwd zzbwdVar) {
        Object obj;
        synchronized (this) {
            IdentityHashMap identityHashMap = this.zzb;
            zzbwc zzbwcVar = (zzbwc) identityHashMap.get(zzbwdVar);
            if (zzbwcVar == null) {
                zzbwcVar = new zzbwc(zzbwdVar.zzb());
                identityHashMap.put(zzbwdVar, zzbwcVar);
            }
            ScheduledFuture scheduledFuture = zzbwcVar.zzc;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                zzbwcVar.zzc = null;
            }
            zzbwcVar.zzb++;
            obj = zzbwcVar.zza;
        }
        return obj;
    }

    final Object zzd(zzbwd zzbwdVar, Object obj) {
        synchronized (this) {
            zzbwc zzbwcVar = (zzbwc) this.zzb.get(zzbwdVar);
            if (zzbwcVar == null) {
                throw new IllegalArgumentException("No cached instance found for ".concat(String.valueOf(String.valueOf(zzbwdVar))));
            }
            if (!(obj == zzbwcVar.zza)) {
                throw new IllegalArgumentException("Releasing the wrong instance");
            }
            if (!(zzbwcVar.zzb > 0)) {
                throw new IllegalStateException("Refcount has already reached zero");
            }
            int i = zzbwcVar.zzb - 1;
            zzbwcVar.zzb = i;
            if (i == 0) {
                if (!(zzbwcVar.zzc == null)) {
                    throw new IllegalStateException("Destroy task already scheduled");
                }
                if (this.zzc == null) {
                    this.zzc = Executors.newSingleThreadScheduledExecutor(zzbpf.zzd("grpc-shared-destroyer-%d", true));
                }
                zzbwcVar.zzc = this.zzc.schedule(new zzbql(new zzbwb(this, zzbwcVar, zzbwdVar, obj)), 1L, TimeUnit.SECONDS);
            }
        }
        return null;
    }

    final /* synthetic */ IdentityHashMap zze() {
        return this.zzb;
    }

    final /* synthetic */ ScheduledExecutorService zzf() {
        return this.zzc;
    }

    final /* synthetic */ void zzg(ScheduledExecutorService scheduledExecutorService) {
        this.zzc = null;
    }
}
