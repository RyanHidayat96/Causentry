package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
final class zzaqc {
    private final zzbjv zza;
    private final int zzb;

    static zzaqc zzb(int i) {
        return new zzaqc(i, null);
    }

    static zzaqc zzc(int i, zzbjv zzbjvVar) {
        if (i != 4) {
            i = 5;
        }
        return new zzaqc(i, zzbjvVar);
    }

    private zzaqc(int i, zzbjv zzbjvVar) {
        this.zzb = i;
        this.zza = zzbjvVar;
    }

    final /* synthetic */ zzbjv zza() {
        return this.zza;
    }

    final /* synthetic */ int zzd() {
        return this.zzb;
    }
}
