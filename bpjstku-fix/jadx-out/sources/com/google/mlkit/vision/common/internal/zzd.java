package com.google.mlkit.vision.common.internal;

import defpackage.CameraControlInternal2;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class zzd implements Callable {
    public final /* synthetic */ MobileVisionBase zza;
    public final /* synthetic */ CameraControlInternal2 zzb;

    public /* synthetic */ zzd(MobileVisionBase mobileVisionBase, CameraControlInternal2 cameraControlInternal2) {
        this.zza = mobileVisionBase;
        this.zzb = cameraControlInternal2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.zza.zzb(this.zzb);
    }
}
