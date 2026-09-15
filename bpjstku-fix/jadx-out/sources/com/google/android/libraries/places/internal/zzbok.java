package com.google.android.libraries.places.internal;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.common.base.VerifyException;
import defpackage.CameraStateRegistryCameraRegistration;
import defpackage.isCameraClosing;
import defpackage.notifyOnConfigureAvailableListener;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbok extends zzbjf {
    static final boolean zza;
    static final boolean zzb;
    protected static final boolean zzc;
    private static final Logger zzg;
    private static final Set zzh;
    private static final String zzi;
    private static final String zzj;
    private static final String zzk;
    private static final zzboj zzl;
    private static String zzm;
    private zzbjb zzA;
    final zzbjn zzd;
    protected boolean zzf;
    private final String zzp;
    private final String zzq;
    private final int zzr;
    private final zzbsu zzs;
    private final long zzt;
    private final zzbkd zzu;
    private final zzbje zzv;
    private final isCameraClosing zzw;
    private boolean zzx;
    private Executor zzy;
    private boolean zzz;
    private final Random zzn = new Random();
    protected volatile zzboa zze = zzboc.INSTANCE;
    private final AtomicReference zzo = new AtomicReference();

    static {
        zzboj zzbojVar;
        Logger logger = Logger.getLogger(zzbok.class.getName());
        zzg = logger;
        zzh = Collections.unmodifiableSet(new HashSet(Arrays.asList("clientLanguage", "percentage", "clientHostname", "serviceConfig")));
        String property = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi", "true");
        zzi = property;
        String property2 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi_localhost", "false");
        zzj = property2;
        String property3 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_service_config", "false");
        zzk = property3;
        zza = Boolean.parseBoolean(property);
        zzb = Boolean.parseBoolean(property2);
        zzc = Boolean.parseBoolean(property3);
        try {
            try {
                try {
                    zzbojVar = (zzboj) Class.forName("io.grpc.internal.JndiResourceResolverFactory", true, zzbok.class.getClassLoader()).asSubclass(zzboj.class).getConstructor(new Class[0]).newInstance(new Object[0]);
                    if (zzbojVar.zzb() != null) {
                        logger.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "JndiResourceResolverFactory not available, skipping.", zzbojVar.zzb());
                        zzbojVar = null;
                    }
                } catch (Exception e2) {
                    zzg.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Can't construct JndiResourceResolverFactory, skipping.", (Throwable) e2);
                }
            } catch (Exception e3) {
                zzg.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Can't find JndiResourceResolverFactory ctor, skipping.", (Throwable) e3);
            }
        } catch (ClassCastException e4) {
            zzg.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Unable to cast JndiResourceResolverFactory, skipping.", (Throwable) e4);
        } catch (ClassNotFoundException e5) {
            zzg.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Unable to find JndiResourceResolverFactory, skipping.", (Throwable) e5);
        }
        zzl = zzbojVar;
    }

    protected zzbok(String str, String str2, zzbiy zzbiyVar, zzbwd zzbwdVar, isCameraClosing iscameraclosing, boolean z) {
        if (zzbiyVar == null) {
            throw new NullPointerException("args");
        }
        if (str2 == null) {
            throw new NullPointerException("name");
        }
        URI uriCreate = URI.create("//".concat(String.valueOf(str2)));
        if (!(uriCreate.getHost() != null)) {
            throw new IllegalArgumentException(CameraStateRegistryCameraRegistration.b("Invalid DNS name: %s", str2));
        }
        String authority = uriCreate.getAuthority();
        if (authority == null) {
            throw new NullPointerException(CameraStateRegistryCameraRegistration.b("nameUri (%s) doesn't have an authority", uriCreate));
        }
        this.zzp = authority;
        this.zzq = uriCreate.getHost();
        if (uriCreate.getPort() == -1) {
            this.zzr = zzbiyVar.zza();
        } else {
            this.zzr = uriCreate.getPort();
        }
        zzbjn zzbjnVarZzb = zzbiyVar.zzb();
        if (zzbjnVarZzb == null) {
            throw new NullPointerException("proxyDetector");
        }
        this.zzd = zzbjnVarZzb;
        Executor executorZzf = zzbiyVar.zzf();
        if (executorZzf != null) {
            this.zzs = new zzboq(executorZzf);
        } else {
            this.zzs = zzbwf.zzc(zzbwdVar);
        }
        long nanos = 0;
        if (!z) {
            String property = System.getProperty("networkaddress.cache.ttl");
            long j = 30;
            if (property != null) {
                try {
                    j = Long.parseLong(property);
                } catch (NumberFormatException unused) {
                    zzg.logp(Level.WARNING, "io.grpc.internal.DnsNameResolver", "getNetworkAddressCacheTtlNanos", "Property({0}) valid is not valid number format({1}), fall back to default({2})", new Object[]{"networkaddress.cache.ttl", property, 30L});
                }
            }
            nanos = j > 0 ? TimeUnit.SECONDS.toNanos(j) : j;
        }
        this.zzt = nanos;
        if (iscameraclosing == null) {
            throw new NullPointerException(NotificationCompat.CATEGORY_STOPWATCH);
        }
        this.zzw = iscameraclosing;
        zzbkd zzbkdVarZzc = zzbiyVar.zzc();
        if (zzbkdVarZzc == null) {
            throw new NullPointerException("syncContext");
        }
        this.zzu = zzbkdVarZzc;
        zzbje zzbjeVarZze = zzbiyVar.zze();
        if (zzbjeVarZze == null) {
            throw new NullPointerException("serviceConfigParser");
        }
        this.zzv = zzbjeVarZze;
    }

    private final void zzm() {
        if (this.zzz || this.zzx) {
            return;
        }
        if (this.zzf) {
            long j = this.zzt;
            if (j != 0) {
                if (j <= 0) {
                    return;
                }
                isCameraClosing iscameraclosing = this.zzw;
                if (TimeUnit.NANOSECONDS.convert(iscameraclosing.TuitionPaymentFragmentspecialinlinedviewModeldefault2 ? (iscameraclosing.b.b() - iscameraclosing.TuitionPaymentFragmentspecialinlinedviewModeldefault1) + iscameraclosing.TuitionPaymentFragmentbindingInflater1 : iscameraclosing.TuitionPaymentFragmentbindingInflater1, TimeUnit.NANOSECONDS) <= j) {
                    return;
                }
            }
        }
        this.zzz = true;
        this.zzy.execute(new zzboh(this, this.zzA));
    }

    private static String zzn() {
        if (zzm == null) {
            try {
                zzm = InetAddress.getLocalHost().getHostName();
            } catch (UnknownHostException e2) {
                throw new RuntimeException(e2);
            }
        }
        return zzm;
    }

    @Override // com.google.android.libraries.places.internal.zzbjf
    public final void zzb(zzbjb zzbjbVar) {
        if (!(this.zzA == null)) {
            throw new IllegalStateException("already started");
        }
        this.zzy = (Executor) this.zzs.zza();
        if (zzbjbVar == null) {
            throw new NullPointerException(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        }
        this.zzA = zzbjbVar;
        zzm();
    }

    @Override // com.google.android.libraries.places.internal.zzbjf
    public final void zzc() {
        if (this.zzx) {
            return;
        }
        this.zzx = true;
        Executor executor = this.zzy;
        if (executor != null) {
            this.zzs.zzb(executor);
            this.zzy = null;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbjf
    public final void zzd() {
        if (!(this.zzA != null)) {
            throw new IllegalStateException("not started");
        }
        zzm();
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01d4 A[Catch: RuntimeException -> 0x0200, TryCatch #2 {RuntimeException -> 0x0200, blocks: (B:64:0x0137, B:65:0x013f, B:67:0x0145, B:70:0x015a, B:71:0x0167, B:72:0x0168, B:74:0x0170, B:76:0x0176, B:77:0x017a, B:79:0x0180, B:81:0x018e, B:83:0x0196, B:90:0x01a7, B:93:0x01ae, B:94:0x01bb, B:95:0x01bc, B:97:0x01c4, B:99:0x01ca, B:100:0x01ce, B:102:0x01d4, B:106:0x01e3, B:111:0x01ed, B:112:0x01ff), top: B:145:0x0137 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:158:0x01ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:0x01ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:0x01e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:170:0x01e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:? A[LOOP:5: B:100:0x01ce->B:171:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0095  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:83:0x0196 A[Catch: RuntimeException -> 0x0200, TryCatch #2 {RuntimeException -> 0x0200, blocks: (B:64:0x0137, B:65:0x013f, B:67:0x0145, B:70:0x015a, B:71:0x0167, B:72:0x0168, B:74:0x0170, B:76:0x0176, B:77:0x017a, B:79:0x0180, B:81:0x018e, B:83:0x0196, B:90:0x01a7, B:93:0x01ae, B:94:0x01bb, B:95:0x01bc, B:97:0x01c4, B:99:0x01ca, B:100:0x01ce, B:102:0x01d4, B:106:0x01e3, B:111:0x01ed, B:112:0x01ff), top: B:145:0x0137 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:90:0x01a7 A[Catch: RuntimeException -> 0x0200, TryCatch #2 {RuntimeException -> 0x0200, blocks: (B:64:0x0137, B:65:0x013f, B:67:0x0145, B:70:0x015a, B:71:0x0167, B:72:0x0168, B:74:0x0170, B:76:0x0176, B:77:0x017a, B:79:0x0180, B:81:0x018e, B:83:0x0196, B:90:0x01a7, B:93:0x01ae, B:94:0x01bb, B:95:0x01bc, B:97:0x01c4, B:99:0x01ca, B:100:0x01ce, B:102:0x01d4, B:106:0x01e3, B:111:0x01ed, B:112:0x01ff), top: B:145:0x0137 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:95:0x01bc A[Catch: RuntimeException -> 0x0200, TryCatch #2 {RuntimeException -> 0x0200, blocks: (B:64:0x0137, B:65:0x013f, B:67:0x0145, B:70:0x015a, B:71:0x0167, B:72:0x0168, B:74:0x0170, B:76:0x0176, B:77:0x017a, B:79:0x0180, B:81:0x018e, B:83:0x0196, B:90:0x01a7, B:93:0x01ae, B:94:0x01bb, B:95:0x01bc, B:97:0x01c4, B:99:0x01ca, B:100:0x01ce, B:102:0x01d4, B:106:0x01e3, B:111:0x01ed, B:112:0x01ff), top: B:145:0x0137 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x01c4 A[Catch: RuntimeException -> 0x0200, TryCatch #2 {RuntimeException -> 0x0200, blocks: (B:64:0x0137, B:65:0x013f, B:67:0x0145, B:70:0x015a, B:71:0x0167, B:72:0x0168, B:74:0x0170, B:76:0x0176, B:77:0x017a, B:79:0x0180, B:81:0x018e, B:83:0x0196, B:90:0x01a7, B:93:0x01ae, B:94:0x01bb, B:95:0x01bc, B:97:0x01c4, B:99:0x01ca, B:100:0x01ce, B:102:0x01d4, B:106:0x01e3, B:111:0x01ed, B:112:0x01ff), top: B:145:0x0137 }] */
    protected final zzbob zze(boolean z) {
        zzboi zzboiVarZza;
        zzbiz zzbizVarZzb;
        Double dZze;
        List listZzc;
        Map mapZzd;
        Iterator it;
        int iIntValue;
        boolean z2;
        zzboj zzbojVar;
        zzbiz zzbizVarZzb2 = null;
        zzbob zzbobVar = new zzbob(null);
        try {
            try {
                try {
                    List listUnmodifiableList = Collections.unmodifiableList(Arrays.asList(InetAddress.getAllByName(this.zzq)));
                    ArrayList arrayList = new ArrayList(listUnmodifiableList.size());
                    Iterator it2 = listUnmodifiableList.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(new zzbgl(Collections.singletonList(new InetSocketAddress((InetAddress) it2.next(), this.zzr)), zzbez.zza));
                    }
                    zzbobVar.zzd(Collections.unmodifiableList(arrayList));
                    if (zzc) {
                        String str = this.zzq;
                        List<String> listEmptyList = Collections.emptyList();
                        boolean z3 = zza;
                        boolean z4 = zzb;
                        if (!z3) {
                            zzboiVarZza = null;
                        } else if (!"localhost".equalsIgnoreCase(str)) {
                            if (!str.contains(":")) {
                                boolean z5 = true;
                                for (int i = 0; i < str.length(); i++) {
                                    char cCharAt = str.charAt(i);
                                    if (cCharAt != '.') {
                                        z5 &= cCharAt >= '0' && cCharAt <= '9';
                                    }
                                }
                                if (!z5) {
                                    zzboiVarZza = (zzboi) this.zzo.get();
                                    if (zzboiVarZza == null) {
                                        zzboiVarZza = zzbojVar.zza();
                                    }
                                }
                            }
                            zzboiVarZza = null;
                        } else if (z4) {
                            zzboiVarZza = (zzboi) this.zzo.get();
                            if (zzboiVarZza == null && (zzbojVar = zzl) != null) {
                                zzboiVarZza = zzbojVar.zza();
                            }
                        } else {
                            zzboiVarZza = null;
                        }
                        if (zzboiVarZza != null) {
                            try {
                                listEmptyList = zzboiVarZza.zza();
                            } catch (Exception e2) {
                                zzg.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "resolveServiceConfig", "ServiceConfig resolution failure", (Throwable) e2);
                            }
                        }
                        if (listEmptyList.isEmpty()) {
                            zzg.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "resolveServiceConfig", "No TXT records found for {0}", new Object[]{this.zzq});
                        } else {
                            Random random = this.zzn;
                            String strZzn = zzn();
                            try {
                                ArrayList<Map> arrayList2 = new ArrayList();
                                for (String str2 : listEmptyList) {
                                    if (str2.startsWith("grpc_config=")) {
                                        Object objZza = zzbqi.zza(str2.substring(12));
                                        if (!(objZza instanceof List)) {
                                            throw new ClassCastException("wrong type ".concat(String.valueOf(String.valueOf(objZza))));
                                        }
                                        List list = (List) objZza;
                                        zzbqj.zzj(list);
                                        arrayList2.addAll(list);
                                    } else {
                                        zzg.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "parseTxtResults", "Ignoring non service config {0}", new Object[]{str2});
                                    }
                                }
                                Map map = null;
                                for (Map map2 : arrayList2) {
                                    try {
                                        for (Map.Entry entry : map2.entrySet()) {
                                            if (!zzh.contains(entry.getKey())) {
                                                throw new VerifyException(CameraStateRegistryCameraRegistration.b("Bad key: %s", entry));
                                            }
                                        }
                                        List listZzc2 = zzbqj.zzc(map2, "clientLanguage");
                                        if (listZzc2 == null || listZzc2.isEmpty()) {
                                            dZze = zzbqj.zze(map2, "percentage");
                                            if (dZze == null) {
                                                listZzc = zzbqj.zzc(map2, "clientHostname");
                                                if (listZzc != null && !listZzc.isEmpty()) {
                                                    it = listZzc.iterator();
                                                    while (true) {
                                                        if (!it.hasNext()) {
                                                            map = null;
                                                        } else if (((String) it.next()).equals(strZzn)) {
                                                        }
                                                    }
                                                }
                                                mapZzd = zzbqj.zzd(map2, "serviceConfig");
                                                if (mapZzd != null) {
                                                    throw new VerifyException(String.format("key '%s' missing in '%s'", map2, "serviceConfig"));
                                                }
                                                map = mapZzd;
                                            } else {
                                                iIntValue = dZze.intValue();
                                                if (iIntValue >= 0 || iIntValue > 100) {
                                                    z2 = false;
                                                } else {
                                                    z2 = true;
                                                }
                                                if (z2) {
                                                    throw new VerifyException(CameraStateRegistryCameraRegistration.b("Bad percentage: %s", dZze));
                                                }
                                                if (random.nextInt(100) >= iIntValue) {
                                                    listZzc = zzbqj.zzc(map2, "clientHostname");
                                                    if (listZzc != null) {
                                                        it = listZzc.iterator();
                                                        while (true) {
                                                            if (!it.hasNext()) {
                                                                if (((String) it.next()).equals(strZzn)) {
                                                                }
                                                            }
                                                        }
                                                    }
                                                    mapZzd = zzbqj.zzd(map2, "serviceConfig");
                                                    if (mapZzd != null) {
                                                        throw new VerifyException(String.format("key '%s' missing in '%s'", map2, "serviceConfig"));
                                                    }
                                                    map = mapZzd;
                                                }
                                                map = null;
                                            }
                                        } else {
                                            Iterator it3 = listZzc2.iterator();
                                            while (true) {
                                                if (it3.hasNext()) {
                                                    if ("java".equalsIgnoreCase((String) it3.next())) {
                                                        dZze = zzbqj.zze(map2, "percentage");
                                                        if (dZze == null) {
                                                            listZzc = zzbqj.zzc(map2, "clientHostname");
                                                            if (listZzc != null) {
                                                                it = listZzc.iterator();
                                                                while (true) {
                                                                    if (!it.hasNext()) {
                                                                        if (((String) it.next()).equals(strZzn)) {
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            mapZzd = zzbqj.zzd(map2, "serviceConfig");
                                                            if (mapZzd != null) {
                                                                throw new VerifyException(String.format("key '%s' missing in '%s'", map2, "serviceConfig"));
                                                            }
                                                            map = mapZzd;
                                                        } else {
                                                            iIntValue = dZze.intValue();
                                                            if (iIntValue >= 0) {
                                                                z2 = false;
                                                            } else {
                                                                z2 = false;
                                                            }
                                                            if (z2) {
                                                                throw new VerifyException(CameraStateRegistryCameraRegistration.b("Bad percentage: %s", dZze));
                                                            }
                                                            if (random.nextInt(100) >= iIntValue) {
                                                                listZzc = zzbqj.zzc(map2, "clientHostname");
                                                                if (listZzc != null) {
                                                                    it = listZzc.iterator();
                                                                    while (true) {
                                                                        if (!it.hasNext()) {
                                                                            if (((String) it.next()).equals(strZzn)) {
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                mapZzd = zzbqj.zzd(map2, "serviceConfig");
                                                                if (mapZzd != null) {
                                                                    throw new VerifyException(String.format("key '%s' missing in '%s'", map2, "serviceConfig"));
                                                                }
                                                                map = mapZzd;
                                                            }
                                                        }
                                                    }
                                                }
                                                map = null;
                                            }
                                        }
                                        if (map != null) {
                                            break;
                                        }
                                    } catch (RuntimeException e3) {
                                        zzbizVarZzb = zzbiz.zzb(zzbjv.zzc.zze("failed to pick service config choice").zzd(e3));
                                    }
                                }
                                zzbizVarZzb = map == null ? null : zzbiz.zza(map);
                            } catch (IOException | RuntimeException e4) {
                                zzbizVarZzb = zzbiz.zzb(zzbjv.zzc.zze("failed to parse TXT records").zzd(e4));
                            }
                            if (zzbizVarZzb != null) {
                                zzbizVarZzb2 = zzbizVarZzb.zzd() != null ? zzbiz.zzb(zzbizVarZzb.zzd()) : this.zzv.zza((Map) zzbizVarZzb.zzc());
                            }
                        }
                        zzbobVar.zzf(zzbizVarZzb2);
                    }
                    return zzbobVar;
                } catch (Throwable th) {
                    if (0 != 0) {
                        zzg.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "resolveAddresses", "Address resolution failure", (Throwable) null);
                    }
                    throw th;
                }
            } catch (Exception e5) {
                notifyOnConfigureAvailableListener.TuitionPaymentFragmentspecialinlinedviewModeldefault3(e5);
                throw new RuntimeException(e5);
            }
        } catch (Exception e6) {
            zzbobVar.zzb(zzbjv.zzi.zze("Unable to resolve host ".concat(String.valueOf(this.zzq))).zzd(e6));
            return zzbobVar;
        }
    }

    final /* synthetic */ zzbgl zzf() throws IOException {
        zzbjm zzbjmVarZza = this.zzd.zza(InetSocketAddress.createUnresolved(this.zzq, this.zzr));
        if (zzbjmVarZza == null) {
            return null;
        }
        return new zzbgl(Collections.singletonList(zzbjmVarZza), zzbez.zza);
    }

    @Override // com.google.android.libraries.places.internal.zzbjf
    public final String zza() {
        return this.zzp;
    }

    final /* synthetic */ String zzh() {
        return this.zzq;
    }

    final /* synthetic */ long zzi() {
        return this.zzt;
    }

    final /* synthetic */ zzbkd zzj() {
        return this.zzu;
    }

    final /* synthetic */ isCameraClosing zzk() {
        return this.zzw;
    }

    final /* synthetic */ void zzl(boolean z) {
        this.zzz = false;
    }
}
