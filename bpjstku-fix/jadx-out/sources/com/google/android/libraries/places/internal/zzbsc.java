package com.google.android.libraries.places.internal;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import defpackage.CameraStateRegistryCameraRegistrationExternalSyntheticLambda0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbsc extends zzbih {
    private static final Method zzt;
    final zzbsu zzd;
    final zzbsu zze;
    final zzbjj zzf;
    final List zzg;
    final String zzh;
    String zzi;
    final String zzj;
    final zzbgj zzk;
    final zzbfv zzl;
    final long zzm;
    final zzbgy zzn;
    final List zzo;
    private final List zzu;
    private final zzbrz zzv;
    private final zzbry zzw;
    private static final Logger zzp = Logger.getLogger(zzbsc.class.getName());
    static final long zza = TimeUnit.MINUTES.toMillis(30);
    static final long zzb = TimeUnit.SECONDS.toMillis(1);
    private static final zzbsu zzq = zzbwf.zzc(zzbpf.zzm);
    private static final zzbgj zzr = zzbgj.zza();
    private static final zzbfv zzs = zzbfv.zza();
    static final Pattern zzc = Pattern.compile("[a-zA-Z][a-zA-Z0-9+.-]*:/.*");

    static {
        Method declaredMethod;
        try {
            declaredMethod = Class.forName("com.google.android.libraries.places.internal.zzbkh").getDeclaredMethod("getClientInterceptor", Boolean.TYPE, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE);
        } catch (ClassNotFoundException e2) {
            zzp.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "<clinit>", "Unable to apply census stats", (Throwable) e2);
            declaredMethod = null;
        } catch (NoSuchMethodException e3) {
            zzp.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "<clinit>", "Unable to apply census stats", (Throwable) e3);
            declaredMethod = null;
        }
        zzt = declaredMethod;
    }

    public zzbsc(String str, zzbff zzbffVar, zzbfa zzbfaVar, zzbrz zzbrzVar, zzbry zzbryVar) {
        zzbsu zzbsuVar = zzq;
        this.zzd = zzbsuVar;
        this.zze = zzbsuVar;
        this.zzu = new ArrayList();
        this.zzf = zzbjj.zzc();
        this.zzg = new ArrayList();
        this.zzj = "pick_first";
        this.zzk = zzr;
        this.zzl = zzs;
        this.zzm = zza;
        this.zzn = zzbgy.zza();
        this.zzo = new ArrayList();
        if (str == null) {
            throw new NullPointerException(TypedValues.AttributesType.S_TARGET);
        }
        this.zzh = str;
        if (zzbrzVar == null) {
            throw new NullPointerException("clientTransportFactoryBuilder");
        }
        this.zzv = zzbrzVar;
        this.zzw = zzbryVar;
        zzbhc.zza(this);
    }

    static zzbsb zze(String str, zzbjj zzbjjVar, Collection collection) {
        URI uri;
        StringBuilder sb = new StringBuilder();
        try {
            uri = new URI(str);
        } catch (URISyntaxException e2) {
            sb.append(e2.getMessage());
            uri = null;
        }
        zzbjg zzbjgVarZzb = uri != null ? zzbjjVar.zzb(uri.getScheme()) : null;
        String string = "";
        if (zzbjgVarZzb == null && !zzc.matcher(str).matches()) {
            try {
                String strZza = zzbjjVar.zza();
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 1);
                sb2.append("/");
                sb2.append(str);
                URI uri2 = new URI(strZza, "", sb2.toString(), null);
                uri = uri2;
                zzbjgVarZzb = zzbjjVar.zzb(uri2.getScheme());
            } catch (URISyntaxException e3) {
                throw new IllegalArgumentException(e3);
            }
        }
        if (zzbjgVarZzb != null) {
            if (collection == null || collection.containsAll(zzbjgVarZzb.zze())) {
                return new zzbsb(uri, zzbjgVarZzb);
            }
            throw new IllegalArgumentException(String.format("Address types of NameResolver '%s' for '%s' not supported by transport", uri.getScheme(), str));
        }
        if (sb.length() > 0) {
            String string2 = sb.toString();
            StringBuilder sb3 = new StringBuilder(string2.length() + 3);
            sb3.append(" (");
            sb3.append(string2);
            sb3.append(")");
            string = sb3.toString();
        }
        throw new IllegalArgumentException(String.format("Could not find a NameResolverProvider for %s%s", str, string));
    }

    public final zzbsc zza(List list) {
        this.zzu.addAll(list);
        return this;
    }

    final int zzc() {
        this.zzw.zza();
        return 443;
    }

    @Override // com.google.android.libraries.places.internal.zzbih
    public final zzbif zzd() {
        zzbfj zzbfjVar;
        zzblw zzblwVarZza = this.zzv.zza();
        zzbsb zzbsbVarZze = zze(this.zzh, this.zzf, Collections.singleton(InetSocketAddress.class));
        URI uri = zzbsbVarZze.zza;
        zzbjg zzbjgVar = zzbsbVarZze.zzb;
        zzbom zzbomVar = new zzbom();
        zzbwf zzbwfVarZzc = zzbwf.zzc(zzbpf.zzm);
        CameraStateRegistryCameraRegistrationExternalSyntheticLambda0 cameraStateRegistryCameraRegistrationExternalSyntheticLambda0 = zzbpf.zzo;
        List list = this.zzu;
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (true) {
            zzbfj zzbfjVar2 = null;
            if (!it.hasNext()) {
                zzbhc.zzb();
                Method method = zzt;
                if (method != null) {
                    try {
                        Boolean bool = Boolean.TRUE;
                        zzbfjVar = (zzbfj) method.invoke(null, bool, bool, Boolean.FALSE, bool);
                    } catch (IllegalAccessException e2) {
                        zzp.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (Throwable) e2);
                        zzbfjVar = null;
                    } catch (InvocationTargetException e3) {
                        zzp.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (Throwable) e3);
                        zzbfjVar = null;
                    }
                } else {
                    zzbfjVar = null;
                }
                if (zzbfjVar != null) {
                    arrayList.add(0, zzbfjVar);
                }
                try {
                    zzbfjVar2 = (zzbfj) Class.forName("com.google.android.libraries.places.internal.zzbki").getDeclaredMethod("getClientInterceptor", new Class[0]).invoke(null, new Object[0]);
                } catch (ClassNotFoundException e4) {
                    zzp.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (Throwable) e4);
                } catch (IllegalAccessException e5) {
                    zzp.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (Throwable) e5);
                } catch (NoSuchMethodException e6) {
                    zzp.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (Throwable) e6);
                } catch (InvocationTargetException e7) {
                    zzp.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (Throwable) e7);
                }
                if (zzbfjVar2 != null) {
                    arrayList.add(0, zzbfjVar2);
                }
                return new zzbse(new zzbrx(this, zzblwVarZza, uri, zzbjgVar, zzbomVar, zzbwfVarZzc, cameraStateRegistryCameraRegistrationExternalSyntheticLambda0, arrayList, zzbwk.zza));
            }
            zzbfj zzbfjVar3 = (zzbfj) it.next();
            if (zzbfjVar3 instanceof zzbsa) {
                zzbig zzbigVar = ((zzbsa) zzbfjVar3).zza;
                throw null;
            }
            arrayList.add(zzbfjVar3);
        }
    }

    public final zzbsc zzb(String str) {
        this.zzi = str;
        return this;
    }
}
