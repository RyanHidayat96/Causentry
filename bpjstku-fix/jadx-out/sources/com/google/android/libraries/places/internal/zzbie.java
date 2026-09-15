package com.google.android.libraries.places.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbie {
    private static final Logger zza = Logger.getLogger(zzbie.class.getName());
    private static zzbie zzb;
    private static final Iterable zzc;
    private final LinkedHashSet zzd = new LinkedHashSet();
    private final LinkedHashMap zze = new LinkedHashMap();

    static {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(Class.forName("com.google.android.libraries.places.internal.zzbtp"));
        } catch (ClassNotFoundException e2) {
            zza.logp(Level.WARNING, "io.grpc.LoadBalancerRegistry", "getHardCodedClasses", "Unable to find pick-first LoadBalancer", (Throwable) e2);
        }
        try {
            arrayList.add(Class.forName("com.google.android.libraries.places.internal.zzcax"));
        } catch (ClassNotFoundException e3) {
            zza.logp(Level.FINE, "io.grpc.LoadBalancerRegistry", "getHardCodedClasses", "Unable to find round-robin LoadBalancer", (Throwable) e3);
        }
        zzc = Collections.unmodifiableList(arrayList);
    }

    public static zzbie zza() {
        zzbie zzbieVar;
        synchronized (zzbie.class) {
            if (zzb == null) {
                List<zzbic> listZza = zzbjr.zza(zzbic.class, zzc, zzbic.class.getClassLoader(), new zzbid());
                zzb = new zzbie();
                for (zzbic zzbicVar : listZza) {
                    zza.logp(Level.FINE, "io.grpc.LoadBalancerRegistry", "getDefaultRegistry", "Service loader found ".concat(String.valueOf(String.valueOf(zzbicVar))));
                    zzb.zzc(zzbicVar);
                }
                zzb.zzd();
            }
            zzbieVar = zzb;
        }
        return zzbieVar;
    }

    private final void zzc(zzbic zzbicVar) {
        synchronized (this) {
            zzbicVar.zzb();
            this.zzd.add(zzbicVar);
        }
    }

    private final void zzd() {
        synchronized (this) {
            LinkedHashMap linkedHashMap = this.zze;
            linkedHashMap.clear();
            for (zzbic zzbicVar : this.zzd) {
                String strZzd = zzbicVar.zzd();
                if (((zzbic) linkedHashMap.get(strZzd)) != null) {
                    zzbicVar.zzc();
                } else {
                    linkedHashMap.put(strZzd, zzbicVar);
                }
            }
        }
    }

    public final zzbic zzb(String str) {
        zzbic zzbicVar;
        synchronized (this) {
            LinkedHashMap linkedHashMap = this.zze;
            if (str == null) {
                throw new NullPointerException("policy");
            }
            zzbicVar = (zzbic) linkedHashMap.get(str);
        }
        return zzbicVar;
    }
}
