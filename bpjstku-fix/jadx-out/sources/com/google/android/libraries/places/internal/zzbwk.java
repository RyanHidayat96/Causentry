package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
public interface zzbwk {
    public static final zzbwk zza;

    static {
        zzbwk zzbmfVar;
        try {
            Class.forName("java.time.Instant");
            zzbmfVar = new zzbpm();
        } catch (ClassNotFoundException unused) {
            zzbmfVar = new zzbmf();
        }
        zza = zzbmfVar;
    }

    long zza();
}
