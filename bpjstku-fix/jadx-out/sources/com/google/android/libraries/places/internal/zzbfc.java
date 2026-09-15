package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbfc {
    private final String zza;

    public static zzbfc zza(String str) {
        if (str != null) {
            return new zzbfc(str, null);
        }
        throw new NullPointerException("debugString");
    }

    private zzbfc(String str, Object obj) {
        this.zza = str;
    }

    public final String toString() {
        return this.zza;
    }
}
