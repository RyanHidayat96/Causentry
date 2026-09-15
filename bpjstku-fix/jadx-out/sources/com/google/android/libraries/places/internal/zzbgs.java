package com.google.android.libraries.places.internal;

import java.net.InetSocketAddress;
import java.net.SocketAddress;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbgs {
    private SocketAddress zza;
    private InetSocketAddress zzb;
    private String zzc;
    private String zzd;

    public final zzbgs zza(SocketAddress socketAddress) {
        if (socketAddress == null) {
            throw new NullPointerException("proxyAddress");
        }
        this.zza = socketAddress;
        return this;
    }

    public final zzbgs zzb(InetSocketAddress inetSocketAddress) {
        if (inetSocketAddress == null) {
            throw new NullPointerException("targetAddress");
        }
        this.zzb = inetSocketAddress;
        return this;
    }

    public final zzbgt zze() {
        return new zzbgt(this.zza, this.zzb, this.zzc, this.zzd, null);
    }

    private zzbgs() {
        throw null;
    }

    /* synthetic */ zzbgs(byte[] bArr) {
    }

    public final zzbgs zzc(String str) {
        this.zzc = str;
        return this;
    }

    public final zzbgs zzd(String str) {
        this.zzd = str;
        return this;
    }
}
