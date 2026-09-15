package com.google.android.libraries.places.internal;

import com.bpjstku.data.registration.general.RegistrationDataStore$$ExternalSyntheticLambda36;
import com.google.android.gms.security.ProviderInstaller;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes3.dex */
public class zzbyv {
    public static final Logger zza = Logger.getLogger(zzbyv.class.getName());
    private static final String[] zzb = {"com.google.android.gms.org.conscrypt.OpenSSLProvider", "org.conscrypt.OpenSSLProvider", "com.android.org.conscrypt.OpenSSLProvider", "org.apache.harmony.xnet.provider.jsse.OpenSSLProvider", "com.google.android.libraries.stitch.sslguard.SslGuardProvider"};
    private static final zzbyv zzc = zzh();
    private final Provider zzd;

    public static byte[] zzg(List list) {
        zzcbj zzcbjVar = new zzcbj();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            zzbyw zzbywVar = (zzbyw) list.get(i);
            if (zzbywVar != zzbyw.HTTP_1_0) {
                zzcbjVar.zzA(zzbywVar.toString().length());
                zzcbjVar.zzv(zzbywVar.toString());
            }
        }
        return zzcbjVar.zzr(zzcbjVar.zzb());
    }

    private static zzbyv zzh() {
        Method method;
        Provider provider;
        Method method2;
        Method method3;
        int i;
        Provider[] providers = Security.getProviders();
        int length = providers.length;
        int i2 = 0;
        loop0: while (true) {
            method = null;
            if (i2 >= length) {
                provider = null;
                break;
            }
            Provider provider2 = providers[i2];
            String[] strArr = zzb;
            int length2 = strArr.length;
            for (int i3 = 0; i3 < 5; i3++) {
                String str = strArr[i3];
                if (str.equals(provider2.getClass().getName())) {
                    zza.logp(Level.FINE, "io.grpc.okhttp.internal.Platform", "getAndroidSecurityProvider", "Found registered provider {0}", str);
                    provider = provider2;
                    break loop0;
                }
            }
            i2++;
        }
        if (provider != null) {
            zzbyq zzbyqVar = new zzbyq(null, "setUseSessionTickets", Boolean.TYPE);
            zzbyq zzbyqVar2 = new zzbyq(null, "setHostname", String.class);
            zzbyq zzbyqVar3 = new zzbyq(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
            zzbyq zzbyqVar4 = new zzbyq(null, "setAlpnProtocols", byte[].class);
            try {
                Class<?> cls = Class.forName("android.net.TrafficStats");
                Method method4 = cls.getMethod("tagSocket", Socket.class);
                try {
                    method = cls.getMethod("untagSocket", Socket.class);
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                }
                method2 = method4;
                method3 = method;
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                method2 = null;
                method3 = null;
            }
            if (!provider.getName().equals(ProviderInstaller.PROVIDER_NAME) && !provider.getName().equals("Conscrypt") && !provider.getName().equals("Ssl_Guard")) {
                try {
                    zzbyv.class.getClassLoader().loadClass("android.net.Network");
                } catch (ClassNotFoundException e2) {
                    zza.logp(Level.FINE, "io.grpc.okhttp.internal.Platform", "isAtLeastAndroid5", "Can't find class", (Throwable) e2);
                    try {
                        zzbyv.class.getClassLoader().loadClass("android.app.ActivityOptions");
                        i = 2;
                    } catch (ClassNotFoundException e3) {
                        zza.logp(Level.FINE, "io.grpc.okhttp.internal.Platform", "isAtLeastAndroid41", "Can't find class", (Throwable) e3);
                        i = 3;
                    }
                }
            }
            i = 1;
            return new zzbyr(zzbyqVar, zzbyqVar2, method2, method3, zzbyqVar3, zzbyqVar4, provider, i);
        }
        try {
            Provider provider3 = SSLContext.getDefault().getProvider();
            try {
                try {
                    SSLContext sSLContext = SSLContext.getInstance("TLS", provider3);
                    if (RegistrationDataStore$$ExternalSyntheticLambda36.b(new ArrayList()) != 0) {
                        int i4 = 0 % 2;
                        throw new ArithmeticException();
                    }
                    sSLContext.init(null, null, null);
                    SSLEngine.class.getMethod("getApplicationProtocol", new Class[0]).invoke(sSLContext.createSSLEngine(), new Object[0]);
                    return new zzbys(provider3, SSLParameters.class.getMethod("setApplicationProtocols", String[].class), SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]), null);
                } catch (ClassNotFoundException | NoSuchMethodException unused3) {
                    return new zzbyv(provider3);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException unused4) {
                Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN");
                StringBuilder sb = new StringBuilder(36);
                sb.append("org.eclipse.jetty.alpn.ALPN");
                sb.append("$Provider");
                Class<?> cls3 = Class.forName(sb.toString());
                StringBuilder sb2 = new StringBuilder(42);
                sb2.append("org.eclipse.jetty.alpn.ALPN");
                sb2.append("$ClientProvider");
                Class<?> cls4 = Class.forName(sb2.toString());
                StringBuilder sb3 = new StringBuilder(42);
                sb3.append("org.eclipse.jetty.alpn.ALPN");
                sb3.append("$ServerProvider");
                return new zzbyt(cls2.getMethod("put", SSLSocket.class, cls3), cls2.getMethod("get", SSLSocket.class), cls2.getMethod("remove", SSLSocket.class), cls4, Class.forName(sb3.toString()), provider3);
            }
        } catch (NoSuchAlgorithmException e4) {
            throw new RuntimeException(e4);
        }
    }

    public void zza(SSLSocket sSLSocket, String str, List list) {
    }

    public String zzb(SSLSocket sSLSocket) {
        return null;
    }

    public int zzc() {
        return 3;
    }

    public void zzd(SSLSocket sSLSocket) {
    }

    public zzbyv(Provider provider) {
        this.zzd = provider;
    }

    public static zzbyv zze() {
        return zzc;
    }

    public final Provider zzf() {
        return this.zzd;
    }
}
