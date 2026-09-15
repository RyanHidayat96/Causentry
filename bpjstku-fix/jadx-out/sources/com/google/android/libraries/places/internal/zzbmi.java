package com.google.android.libraries.places.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
final class zzbmi {
    private ArrayList zza = new ArrayList();
    private volatile zzbfy zzb = zzbfy.IDLE;

    zzbmi() {
    }

    final void zza(zzbfy zzbfyVar) {
        if (zzbfyVar == null) {
            throw new NullPointerException("newState");
        }
        if (this.zzb == zzbfyVar || this.zzb == zzbfy.SHUTDOWN) {
            return;
        }
        this.zzb = zzbfyVar;
        if (this.zza.isEmpty()) {
            return;
        }
        ArrayList arrayList = this.zza;
        this.zza = new ArrayList();
        if (arrayList.size() <= 0) {
            return;
        }
        throw null;
    }
}
