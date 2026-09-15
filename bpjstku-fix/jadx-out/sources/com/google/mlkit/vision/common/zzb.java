package com.google.mlkit.vision.common;

import android.media.Image;

/* JADX INFO: loaded from: classes6.dex */
final class zzb {
    private final Image zza;

    final Image.Plane[] zzb() {
        return this.zza.getPlanes();
    }

    zzb(Image image) {
        this.zza = image;
    }

    final Image zza() {
        return this.zza;
    }
}
