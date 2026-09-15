package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbeq implements zzbep {
    private final Object zza;

    public static zzbep zza(Object obj) {
        if (obj != null) {
            return new zzbeq(obj);
        }
        throw new NullPointerException("instance cannot be null");
    }

    private zzbeq(Object obj) {
        this.zza = obj;
    }

    @Override // com.google.android.libraries.places.internal.zzcbd
    public final Object zzb() {
        return this.zza;
    }
}
