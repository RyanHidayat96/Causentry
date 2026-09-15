package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzbpp implements Runnable {
    final /* synthetic */ zzbqg zza;

    zzbpp(zzbqg zzbqgVar) {
        Objects.requireNonNull(zzbqgVar);
        this.zza = zzbqgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbqg zzbqgVar = this.zza;
        if (zzbqgVar.zzE().zzc() == zzbfy.IDLE) {
            zzbqgVar.zzo().zza(2, "CONNECTING as requested");
            zzbqgVar.zzh(zzbfy.CONNECTING);
            zzbqgVar.zzf();
        }
    }
}
