package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbgz {
    private Object zza;

    public final zzbgz zza(Object obj) {
        if (obj == null) {
            throw new NullPointerException("config");
        }
        this.zza = obj;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzbha zzb() {
        if (this.zza != null) {
            return new zzbha(zzbjv.zza, this.zza, null, 0 == true ? 1 : 0);
        }
        throw new IllegalStateException("config is not set");
    }

    private zzbgz() {
        throw null;
    }

    /* synthetic */ zzbgz(byte[] bArr) {
    }
}
