package com.google.android.libraries.places.internal;

import defpackage.CameraStateRegistryCameraRegistration;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes3.dex */
final class zzbxo implements Runnable {
    final /* synthetic */ CountDownLatch zza;
    final /* synthetic */ CyclicBarrier zzb;
    final /* synthetic */ zzbwx zzc;
    final /* synthetic */ CountDownLatch zzd;
    final /* synthetic */ zzbxt zze;

    zzbxo(zzbxt zzbxtVar, CountDownLatch countDownLatch, CyclicBarrier cyclicBarrier, zzbwx zzbwxVar, CountDownLatch countDownLatch2) {
        this.zza = countDownLatch;
        this.zzb = cyclicBarrier;
        this.zzc = zzbwxVar;
        this.zzd = countDownLatch2;
        Objects.requireNonNull(zzbxtVar);
        this.zze = zzbxtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbxt zzbxtVar;
        zzbxr zzbxrVar;
        zzcbl zzcblVarZzc = zzcbp.zzc(new zzbxn(this));
        try {
            try {
                try {
                    this.zza.await();
                    this.zzb.await(1000L, TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    zzbxt zzbxtVar2 = this.zze;
                    zzbxtVar2.zzM(new zzbxr(zzbxtVar2, zzbxtVar2.zzC().zza(zzcblVarZzc, true)));
                    this.zzd.countDown();
                    throw th;
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (BrokenBarrierException | TimeoutException unused2) {
                zzbxtVar = this.zze;
                zzbxtVar.zzu(0, zzbyz.INTERNAL_ERROR, zzbjv.zzi.zze("Timed out waiting for second handshake thread. The transport executor pool may have run out of threads"));
                zzbxrVar = new zzbxr(zzbxtVar, zzbxtVar.zzC().zza(zzcblVarZzc, true));
                zzbxtVar.zzM(zzbxrVar);
                this.zzd.countDown();
            }
            zzbxt zzbxtVar3 = this.zze;
            zzbgt zzbgtVar = zzbxtVar3.zzb;
            if (zzbgtVar == null) {
                zzbxtVar3.zzx(zzbxtVar3.zzS().createSocket(zzbxtVar3.zzA().getAddress(), zzbxtVar3.zzA().getPort()));
            } else {
                if (!(zzbgtVar.zzc() instanceof InetSocketAddress)) {
                    zzbjv zzbjvVar = zzbjv.zzh;
                    String strValueOf = String.valueOf(zzbgtVar.zzc().getClass());
                    StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 41);
                    sb.append("Unsupported SocketAddress implementation ");
                    sb.append(strValueOf);
                    throw new zzbjw(zzbjvVar.zze(sb.toString()), null);
                }
                zzbxtVar3.zzx(zzbxtVar3.zzs(zzbgtVar.zzd(), (InetSocketAddress) zzbgtVar.zzc(), zzbgtVar.zzb(), zzbgtVar.zza()));
            }
            if (zzbxtVar3.zzT() != null) {
                SSLSocketFactory sSLSocketFactoryZzT = zzbxtVar3.zzT();
                HostnameVerifier hostnameVerifierZzU = zzbxtVar3.zzU();
                Socket socketZzw = zzbxtVar3.zzw();
                String strZzk = zzbxtVar3.zzk();
                int iZzl = zzbxtVar3.zzl();
                zzbyl zzbylVarZzX = zzbxtVar3.zzX();
                if (sSLSocketFactoryZzT == null) {
                    throw new NullPointerException("sslSocketFactory");
                }
                if (socketZzw == null) {
                    throw new NullPointerException("socket");
                }
                if (zzbylVarZzX == null) {
                    throw new NullPointerException("spec");
                }
                SSLSocket sSLSocket = (SSLSocket) sSLSocketFactoryZzT.createSocket(socketZzw, strZzk, iZzl, true);
                zzbylVarZzX.zzb(sSLSocket, false);
                String strZza = zzbxy.zzd().zza(sSLSocket, strZzk, zzbylVarZzX.zza() ? zzbya.zza : null);
                List list = zzbya.zza;
                boolean zContains = list.contains(zzbyw.zza(strZza));
                String strValueOf2 = String.valueOf(list);
                StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf2).length() + 50);
                sb2.append("Only ");
                sb2.append(strValueOf2);
                sb2.append(" are supported, but negotiated protocol is %s");
                String string = sb2.toString();
                if (!zContains) {
                    throw new IllegalStateException(CameraStateRegistryCameraRegistration.b(string, strZza));
                }
                if (!hostnameVerifierZzU.verify((strZzk.startsWith("[") && strZzk.endsWith("]")) ? strZzk.substring(1, strZzk.length() - 1) : strZzk, sSLSocket.getSession())) {
                    throw new SSLPeerUnverifiedException("Cannot verify hostname: ".concat(String.valueOf(strZzk)));
                }
                zzbxtVar3.zzz(sSLSocket.getSession());
                zzbxtVar3.zzx(sSLSocket);
            }
            zzbxtVar3.zzw().setTcpNoDelay(true);
            zzcbl zzcblVarZzc2 = zzcbp.zzc(zzcbp.zzb(zzbxtVar3.zzw()));
            this.zzc.zzb(zzcbp.zza(zzbxtVar3.zzw()), zzbxtVar3.zzw());
            zzbex zzbexVarZzc = zzbxtVar3.zzN().zzc();
            zzbexVarZzc.zza(zzbgr.zza, zzbxtVar3.zzw().getRemoteSocketAddress());
            zzbexVarZzc.zza(zzbgr.zzb, zzbxtVar3.zzw().getLocalSocketAddress());
            zzbexVarZzc.zza(zzbgr.zzc, zzbxtVar3.zzy());
            zzbexVarZzc.zza(zzbox.zza, zzbxtVar3.zzy() == null ? zzbjo.NONE : zzbjo.PRIVACY_AND_INTEGRITY);
            zzbxtVar3.zzO(zzbexVarZzc.zzc());
            zzbxtVar3.zzM(new zzbxr(zzbxtVar3, zzbxtVar3.zzC().zza(zzcblVarZzc2, true)));
            this.zzd.countDown();
            synchronized (zzbxtVar3.zzG()) {
                Socket socketZzw2 = zzbxtVar3.zzw();
                if (socketZzw2 == null) {
                    throw new NullPointerException("socket");
                }
                Socket socket = socketZzw2;
                zzbxtVar3.zzV(socketZzw2);
                if (zzbxtVar3.zzy() != null) {
                    new zzbgx(zzbxtVar3.zzy());
                }
            }
        } catch (zzbjw e2) {
            this.zze.zzu(0, zzbyz.INTERNAL_ERROR, e2.zza());
            zzbxtVar = this.zze;
            zzbxrVar = new zzbxr(zzbxtVar, zzbxtVar.zzC().zza(zzcblVarZzc, true));
            zzbxtVar.zzM(zzbxrVar);
            this.zzd.countDown();
        } catch (Exception e3) {
            zzbxtVar = this.zze;
            zzbxtVar.zzg(e3);
            zzbxrVar = new zzbxr(zzbxtVar, zzbxtVar.zzC().zza(zzcblVarZzc, true));
            zzbxtVar.zzM(zzbxrVar);
            this.zzd.countDown();
        }
    }
}
