package com.google.android.libraries.places.internal;

import defpackage.CameraStateRegistryCameraRegistration;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzbqc implements Runnable {
    final /* synthetic */ zzbjv zza;
    final /* synthetic */ zzbqe zzb;

    zzbqc(zzbqe zzbqeVar, zzbjv zzbjvVar) {
        this.zza = zzbjvVar;
        Objects.requireNonNull(zzbqeVar);
        this.zzb = zzbqeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbqe zzbqeVar = this.zzb;
        zzbqg zzbqgVar = zzbqeVar.zzc;
        if (zzbqgVar.zzE().zzc() != zzbfy.SHUTDOWN) {
            zzbmg zzbmgVar = zzbqeVar.zza;
            if (zzbqgVar.zzC() == zzbmgVar) {
                zzbqgVar.zzD(null);
                zzbqgVar.zzr().zzd();
                zzbqgVar.zzh(zzbfy.IDLE);
            } else if (zzbqgVar.zzA() == zzbmgVar) {
                boolean z = zzbqgVar.zzE().zzc() == zzbfy.CONNECTING;
                zzbfy zzbfyVarZzc = zzbqgVar.zzE().zzc();
                if (!z) {
                    throw new IllegalStateException(CameraStateRegistryCameraRegistration.b("Expected state is CONNECTING, actual state is %s", zzbfyVarZzc));
                }
                zzbqgVar.zzr().zzc();
                if (zzbqgVar.zzr().zza()) {
                    zzbqgVar.zzf();
                    return;
                }
                zzbqgVar.zzB(null);
                zzbqgVar.zzr().zzd();
                zzbqgVar.zzg(this.zza);
            }
        }
    }
}
