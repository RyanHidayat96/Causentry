package com.google.android.libraries.places.internal;

import com.google.common.net.HostAndPort;
import defpackage.CameraStateRegistryCameraRegistration;
import defpackage.ConfigOptionPriority;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes3.dex */
final class zzbxx extends zzbxy {
    private static final zzbyq zzb = new zzbyq(null, "setUseSessionTickets", Boolean.TYPE);
    private static final zzbyq zzc = new zzbyq(null, "setHostname", String.class);
    private static final zzbyq zzd = new zzbyq(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
    private static final zzbyq zze = new zzbyq(null, "setAlpnProtocols", byte[].class);
    private static final zzbyq zzf = new zzbyq(byte[].class, "getNpnSelectedProtocol", new Class[0]);
    private static final zzbyq zzg = new zzbyq(null, "setNpnProtocols", byte[].class);
    private static final Method zzh;
    private static final Method zzi;
    private static final Method zzj;
    private static final Method zzk;
    private static final Method zzl;
    private static final Method zzm;
    private static final Constructor zzn;

    static {
        Method method;
        Method method2;
        Method method3;
        NoSuchMethodException noSuchMethodException;
        Method method4;
        ClassNotFoundException classNotFoundException;
        Method method5;
        Method method6;
        Method method7;
        Method method8;
        NoSuchMethodException noSuchMethodException2;
        Method method9;
        ClassNotFoundException classNotFoundException2;
        Constructor<?> constructor = null;
        try {
            method = SSLParameters.class.getMethod("setApplicationProtocols", String[].class);
            try {
                method5 = SSLParameters.class.getMethod("getApplicationProtocols", new Class[0]);
                try {
                    method6 = SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]);
                    try {
                        Class<?> cls = Class.forName("android.net.ssl.SSLSockets");
                        method7 = cls.getMethod("isSupportedSocket", SSLSocket.class);
                        try {
                            method8 = cls.getMethod("setUseSessionTickets", SSLSocket.class, Boolean.TYPE);
                        } catch (ClassNotFoundException e2) {
                            classNotFoundException = e2;
                            method4 = method5;
                            method2 = method6;
                            method3 = method7;
                            zzbxy.zzb.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 10.0+ APIs", (Throwable) classNotFoundException);
                            method5 = method4;
                            method6 = method2;
                            method7 = method3;
                            method8 = null;
                        } catch (NoSuchMethodException e3) {
                            noSuchMethodException = e3;
                            method4 = method5;
                            method2 = method6;
                            method3 = method7;
                            zzbxy.zzb.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 10.0+ APIs", (Throwable) noSuchMethodException);
                            method5 = method4;
                            method6 = method2;
                            method7 = method3;
                            method8 = null;
                        }
                    } catch (ClassNotFoundException e4) {
                        method3 = null;
                        classNotFoundException = e4;
                        method4 = method5;
                        method2 = method6;
                    } catch (NoSuchMethodException e5) {
                        method3 = null;
                        noSuchMethodException = e5;
                        method4 = method5;
                        method2 = method6;
                    }
                } catch (ClassNotFoundException e6) {
                    method2 = null;
                    method3 = null;
                    classNotFoundException = e6;
                    method4 = method5;
                } catch (NoSuchMethodException e7) {
                    method2 = null;
                    method3 = null;
                    noSuchMethodException = e7;
                    method4 = method5;
                }
            } catch (ClassNotFoundException e8) {
                e = e8;
                method2 = null;
                method3 = null;
                classNotFoundException = e;
                method4 = null;
                zzbxy.zzb.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 10.0+ APIs", (Throwable) classNotFoundException);
                method5 = method4;
                method6 = method2;
                method7 = method3;
                method8 = null;
                zzj = method;
                zzk = method5;
                zzl = method6;
                zzh = method7;
                zzi = method8;
                Method method10 = SSLParameters.class.getMethod("setServerNames", List.class);
                try {
                    constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                } catch (ClassNotFoundException e9) {
                    classNotFoundException2 = e9;
                    method9 = method10;
                    zzbxy.zzb.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 7.0+ APIs", (Throwable) classNotFoundException2);
                    method10 = method9;
                } catch (NoSuchMethodException e10) {
                    noSuchMethodException2 = e10;
                    method9 = method10;
                    zzbxy.zzb.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 7.0+ APIs", (Throwable) noSuchMethodException2);
                    method10 = method9;
                }
                zzm = method10;
                zzn = constructor;
            } catch (NoSuchMethodException e11) {
                e = e11;
                method2 = null;
                method3 = null;
                noSuchMethodException = e;
                method4 = null;
                zzbxy.zzb.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 10.0+ APIs", (Throwable) noSuchMethodException);
                method5 = method4;
                method6 = method2;
                method7 = method3;
                method8 = null;
                zzj = method;
                zzk = method5;
                zzl = method6;
                zzh = method7;
                zzi = method8;
                Method method11 = SSLParameters.class.getMethod("setServerNames", List.class);
                constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                zzm = method11;
                zzn = constructor;
            }
        } catch (ClassNotFoundException e12) {
            e = e12;
            method = null;
        } catch (NoSuchMethodException e13) {
            e = e13;
            method = null;
        }
        zzj = method;
        zzk = method5;
        zzl = method6;
        zzh = method7;
        zzi = method8;
        try {
            Method method12 = SSLParameters.class.getMethod("setServerNames", List.class);
            constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
        } catch (ClassNotFoundException e14) {
            classNotFoundException2 = e14;
            method9 = null;
        } catch (NoSuchMethodException e15) {
            noSuchMethodException2 = e15;
            method9 = null;
        }
        zzm = method12;
        zzn = constructor;
    }

    zzbxx(zzbyv zzbyvVar) {
        super(zzbyvVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbxy
    public final String zza(SSLSocket sSLSocket, String str, List list) throws IOException {
        String strZzc = zzc(sSLSocket);
        return strZzc == null ? super.zza(sSLSocket, str, list) : strZzc;
    }

    @Override // com.google.android.libraries.places.internal.zzbxy
    protected final void zzb(SSLSocket sSLSocket, String str, List list) {
        Constructor constructor;
        boolean z;
        Method method;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((zzbyw) it.next()).toString());
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        if (str != null) {
            try {
                try {
                    if (!str.contains("_")) {
                        try {
                            if (!(zzbpf.zzb(str).getAuthority().indexOf(64) == -1)) {
                                throw new IllegalArgumentException(CameraStateRegistryCameraRegistration.b("Userinfo must not be present on authority: '%s'", str));
                            }
                            Method method2 = zzh;
                            if (method2 == null || !((Boolean) method2.invoke(null, sSLSocket)).booleanValue()) {
                                zzb.zzb(sSLSocket, Boolean.TRUE);
                            } else {
                                zzi.invoke(null, sSLSocket, Boolean.TRUE);
                            }
                            Method method3 = zzm;
                            if (method3 == null || (constructor = zzn) == null || ConfigOptionPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault2(HostAndPort.TuitionPaymentFragmentspecialinlinedviewModeldefault3(str).host)) {
                                zzc.zzb(sSLSocket, str);
                            } else {
                                method3.invoke(sSLParameters, Collections.singletonList(constructor.newInstance(str)));
                            }
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                } catch (InvocationTargetException e2) {
                    throw new RuntimeException(e2);
                }
            } catch (IllegalAccessException e3) {
                throw new RuntimeException(e3);
            } catch (InstantiationException e4) {
                throw new RuntimeException(e4);
            }
        }
        Method method4 = zzl;
        if (method4 != null) {
            try {
                method4.invoke(sSLSocket, new Object[0]);
                zzj.invoke(sSLParameters, strArr);
                z = true;
            } catch (InvocationTargetException e5) {
                if (!(e5.getTargetException() instanceof UnsupportedOperationException)) {
                    throw e5;
                }
                zzbxy.zzb.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "configureTlsExtensions", "setApplicationProtocol unsupported, will try old methods");
                z = false;
            }
        } else {
            z = false;
        }
        sSLSocket.setSSLParameters(sSLParameters);
        if (z && (method = zzk) != null && Arrays.equals(strArr, (String[]) method.invoke(sSLSocket.getSSLParameters(), new Object[0]))) {
            return;
        }
        Object[] objArr = {zzbyv.zzg(list)};
        zzbyv zzbyvVar = this.zza;
        if (zzbyvVar.zzc() == 1) {
            zze.zzc(sSLSocket, objArr);
        }
        if (zzbyvVar.zzc() == 3) {
            throw new RuntimeException("We can not do TLS handshake on this Android version, please install the Google Play Services Dynamic Security Provider to use TLS");
        }
        zzg.zzc(sSLSocket, objArr);
    }

    @Override // com.google.android.libraries.places.internal.zzbxy
    public final String zzc(SSLSocket sSLSocket) {
        Method method = zzl;
        if (method != null) {
            try {
                return (String) method.invoke(sSLSocket, new Object[0]);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            } catch (InvocationTargetException e3) {
                if (!(e3.getTargetException() instanceof UnsupportedOperationException)) {
                    throw new RuntimeException(e3);
                }
                zzbxy.zzb.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "getSelectedProtocol", "Socket unsupported for getApplicationProtocol, will try old methods");
            }
        }
        if (this.zza.zzc() == 1) {
            try {
                byte[] bArr = (byte[]) zzd.zzc(sSLSocket, new Object[0]);
                if (bArr != null) {
                    return new String(bArr, zzbyy.zzb);
                }
            } catch (Exception e4) {
                zzbxy.zzb.logp(Level.FINE, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "getSelectedProtocol", "Failed calling getAlpnSelectedProtocol()", (Throwable) e4);
            }
        }
        if (this.zza.zzc() == 3) {
            return null;
        }
        try {
            byte[] bArr2 = (byte[]) zzf.zzc(sSLSocket, new Object[0]);
            if (bArr2 != null) {
                return new String(bArr2, zzbyy.zzb);
            }
            return null;
        } catch (Exception e5) {
            zzbxy.zzb.logp(Level.FINE, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "getSelectedProtocol", "Failed calling getNpnSelectedProtocol()", (Throwable) e5);
            return null;
        }
    }
}
