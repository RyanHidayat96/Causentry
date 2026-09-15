package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbhn {
    private final String zza;
    private final Object zzb;

    public static zzbhn zza(String str) {
        return new zzbhn("internal:health-check-consumer-listener", null);
    }

    public static zzbhn zzb(String str, Object obj) {
        return new zzbhn("internal:disable-subchannel-reconnect", obj);
    }

    private zzbhn(String str, Object obj) {
        this.zza = str;
        this.zzb = obj;
    }

    public final String toString() {
        return this.zza;
    }

    final /* synthetic */ Object zzc() {
        return this.zzb;
    }
}
