package com.google.android.libraries.places.internal;

import androidx.core.os.EnvironmentCompat;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.UByte;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbjj {
    private static final Logger zza = Logger.getLogger(zzbjj.class.getName());
    private static zzbjj zzb;
    private String zzc;
    private final LinkedHashSet zzd;
    private ImmutableMap zze;

    public zzbjj() {
        new zzbjh(this, null);
        this.zzc = EnvironmentCompat.MEDIA_UNKNOWN;
        this.zzd = new LinkedHashSet();
        this.zze = ImmutableMap.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
    }

    public static zzbjj zzc() {
        zzbjj zzbjjVar;
        synchronized (zzbjj.class) {
            if (zzb == null) {
                ArrayList arrayList = new ArrayList();
                try {
                    arrayList.add(Class.forName("com.google.android.libraries.places.internal.zzbol"));
                } catch (ClassNotFoundException e2) {
                    zza.logp(Level.FINE, "io.grpc.NameResolverRegistry", "getHardCodedClasses", "Unable to find DNS NameResolver", (Throwable) e2);
                }
                List<zzbjg> listZza = zzbjr.zza(zzbjg.class, Collections.unmodifiableList(arrayList), zzbjg.class.getClassLoader(), new zzbji(null));
                if (listZza.isEmpty()) {
                    zza.logp(Level.WARNING, "io.grpc.NameResolverRegistry", "getDefaultRegistry", "No NameResolverProviders found via ServiceLoader, including for DNS. This is probably due to a broken build. If using ProGuard, check your configuration");
                }
                zzb = new zzbjj();
                for (zzbjg zzbjgVar : listZza) {
                    zza.logp(Level.FINE, "io.grpc.NameResolverRegistry", "getDefaultRegistry", "Service loader found ".concat(String.valueOf(String.valueOf(zzbjgVar))));
                    zzb.zze(zzbjgVar);
                }
                zzb.zzf();
            }
            zzbjjVar = zzb;
        }
        return zzbjjVar;
    }

    private final void zze(zzbjg zzbjgVar) {
        synchronized (this) {
            zzbjgVar.zzc();
            this.zzd.add(zzbjgVar);
        }
    }

    private final void zzf() {
        synchronized (this) {
            HashMap map = new HashMap();
            String strZzb = EnvironmentCompat.MEDIA_UNKNOWN;
            byte b = UByte.MIN_VALUE;
            for (zzbjg zzbjgVar : this.zzd) {
                String strZzb2 = zzbjgVar.zzb();
                if (((zzbjg) map.get(strZzb2)) != null) {
                    zzbjgVar.zzd();
                } else {
                    map.put(strZzb2, zzbjgVar);
                }
                zzbjgVar.zzd();
                if (b < 5) {
                    zzbjgVar.zzd();
                    strZzb = zzbjgVar.zzb();
                }
                b = 5;
            }
            this.zze = ImmutableMap.TuitionPaymentFragmentspecialinlinedviewModeldefault1(map);
            this.zzc = strZzb;
        }
    }

    public final zzbjg zzb(String str) {
        if (str == null) {
            return null;
        }
        return (zzbjg) zzd().get(str.toLowerCase(Locale.US));
    }

    public final String zza() {
        String str;
        synchronized (this) {
            str = this.zzc;
        }
        return str;
    }

    final Map zzd() {
        ImmutableMap immutableMap;
        synchronized (this) {
            immutableMap = this.zze;
        }
        return immutableMap;
    }
}
