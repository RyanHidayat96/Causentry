package com.google.android.libraries.places.internal;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes3.dex */
final class zzbxg implements zzblw {
    final Executor zza;
    final ScheduledExecutorService zzb;
    final zzbwn zzc;
    final SSLSocketFactory zzd;
    final zzbyl zze;
    private final zzbsu zzf;
    private final zzbsu zzg;
    private final zzbku zzh = new zzbku("keepalive time nanos", Long.MAX_VALUE);
    private boolean zzi;

    /* synthetic */ zzbxg(zzbsu zzbsuVar, zzbsu zzbsuVar2, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, zzbyl zzbylVar, int i, boolean z, long j, long j2, int i2, boolean z2, int i3, zzbwn zzbwnVar, boolean z3, zzbff zzbffVar, byte[] bArr) {
        this.zzf = zzbsuVar;
        this.zza = (Executor) zzbsuVar.zza();
        this.zzg = zzbsuVar2;
        this.zzb = (ScheduledExecutorService) zzbsuVar2.zza();
        this.zzd = sSLSocketFactory;
        this.zze = zzbylVar;
        if (zzbwnVar == null) {
            throw new NullPointerException("transportTracerFactory");
        }
        this.zzc = zzbwnVar;
    }

    @Override // com.google.android.libraries.places.internal.zzblw, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.zzi) {
            return;
        }
        this.zzi = true;
        this.zzf.zzb(this.zza);
        this.zzg.zzb(this.zzb);
    }

    @Override // com.google.android.libraries.places.internal.zzblw
    public final zzbmg zza(SocketAddress socketAddress, zzblv zzblvVar, zzbfg zzbfgVar) {
        if (this.zzi) {
            throw new IllegalStateException("The transport factory is closed.");
        }
        return new zzbxt(this, (InetSocketAddress) socketAddress, zzblvVar.zza(), zzblvVar.zze(), zzblvVar.zzc(), zzblvVar.zzg(), new zzbxf(this, this.zzh.zza()), null);
    }

    @Override // com.google.android.libraries.places.internal.zzblw
    public final ScheduledExecutorService zzb() {
        return this.zzb;
    }
}
