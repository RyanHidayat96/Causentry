package com.google.android.libraries.places.internal;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes3.dex */
public final class zzkb {
    private Bitmap zza;

    public final zzkc zza() {
        Bitmap bitmap = this.zza;
        if (bitmap != null) {
            return new zzkc(bitmap, null);
        }
        throw new IllegalStateException("Photo must be set to non-null value.");
    }

    public final zzkb zzb(Bitmap bitmap) {
        this.zza = bitmap;
        return this;
    }
}
