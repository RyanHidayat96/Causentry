package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes3.dex */
class zzbxy {
    private static final Logger zzb = Logger.getLogger(zzbxy.class.getName());
    private static final zzbyv zzc = zzbyv.zze();
    private static final zzbxy zzd;
    protected final zzbyv zza;

    static {
        zzbxy zzbxyVar;
        ClassLoader classLoader = zzbxy.class.getClassLoader();
        try {
            classLoader.loadClass("com.android.org.conscrypt.OpenSSLSocketImpl");
        } catch (ClassNotFoundException e2) {
            zzb.logp(Level.FINE, "io.grpc.okhttp.OkHttpProtocolNegotiator", "createNegotiator", "Unable to find Conscrypt. Skipping", (Throwable) e2);
            try {
                classLoader.loadClass("org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl");
            } catch (ClassNotFoundException e3) {
                zzb.logp(Level.FINE, "io.grpc.okhttp.OkHttpProtocolNegotiator", "createNegotiator", "Unable to find any OpenSSLSocketImpl. Skipping", (Throwable) e3);
                zzbxyVar = new zzbxy(zzc);
            }
        }
        zzbxyVar = new zzbxx(zzc);
        zzd = zzbxyVar;
    }

    zzbxy(zzbyv zzbyvVar) {
        if (zzbyvVar == null) {
            throw new NullPointerException("platform");
        }
        this.zza = zzbyvVar;
    }

    public String zza(SSLSocket sSLSocket, String str, List list) throws IOException {
        if (list != null) {
            zzb(sSLSocket, str, list);
        }
        try {
            sSLSocket.startHandshake();
            String strZzc = zzc(sSLSocket);
            if (strZzc != null) {
                this.zza.zzd(sSLSocket);
                return strZzc;
            }
            String strValueOf = String.valueOf(list);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 44);
            sb.append("TLS ALPN negotiation failed with protocols: ");
            sb.append(strValueOf);
            throw new RuntimeException(sb.toString());
        } catch (Throwable th) {
            this.zza.zzd(sSLSocket);
            throw th;
        }
    }

    protected void zzb(SSLSocket sSLSocket, String str, List list) {
        this.zza.zza(sSLSocket, str, list);
    }

    public String zzc(SSLSocket sSLSocket) {
        return this.zza.zzb(sSLSocket);
    }

    public static zzbxy zzd() {
        return zzd;
    }
}
