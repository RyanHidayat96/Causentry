package com.google.android.libraries.places.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class zzblb {
    private final zzbie zza;
    private final String zzb;

    zzblb(zzbie zzbieVar, String str) {
        if (zzbieVar == null) {
            throw new NullPointerException("registry");
        }
        this.zza = zzbieVar;
        this.zzb = "pick_first";
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00bb  */
    final zzbiz zza(Map map) {
        List<zzbvx> listUnmodifiableList;
        String strZzg;
        if (map != null) {
            try {
                ArrayList arrayList = new ArrayList();
                if (map.containsKey("loadBalancingConfig")) {
                    arrayList.addAll(zzbqj.zzb(map, "loadBalancingConfig"));
                }
                if (arrayList.isEmpty() && (strZzg = zzbqj.zzg(map, "loadBalancingPolicy")) != null) {
                    arrayList.add(Collections.singletonMap(strZzg.toLowerCase(Locale.ROOT), Collections.emptyMap()));
                }
                List<Map> listUnmodifiableList2 = Collections.unmodifiableList(arrayList);
                if (listUnmodifiableList2 != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Map map2 : listUnmodifiableList2) {
                        if (map2.size() != 1) {
                            int size = map2.size();
                            String strValueOf = String.valueOf(map2);
                            StringBuilder sb = new StringBuilder(String.valueOf(size).length() + 83 + String.valueOf(strValueOf).length());
                            sb.append("There are ");
                            sb.append(size);
                            sb.append(" fields in a LoadBalancingConfig object. Exactly one is expected. Config=");
                            sb.append(strValueOf);
                            throw new RuntimeException(sb.toString());
                        }
                        String str = (String) ((Map.Entry) map2.entrySet().iterator().next()).getKey();
                        arrayList2.add(new zzbvx(str, zzbqj.zzd(map2, str)));
                    }
                    listUnmodifiableList = Collections.unmodifiableList(arrayList2);
                } else {
                    listUnmodifiableList = null;
                }
            } catch (RuntimeException e2) {
                return zzbiz.zzb(zzbjv.zzc.zze("can't parse load balancer configuration").zzd(e2));
            }
        } else {
            listUnmodifiableList = null;
        }
        if (listUnmodifiableList == null || listUnmodifiableList.isEmpty()) {
            return null;
        }
        zzbie zzbieVar = this.zza;
        ArrayList arrayList3 = new ArrayList();
        for (zzbvx zzbvxVar : listUnmodifiableList) {
            String strZza = zzbvxVar.zza();
            zzbic zzbicVarZzb = zzbieVar.zzb(strZza);
            if (zzbicVarZzb != null) {
                if (!arrayList3.isEmpty()) {
                    Logger.getLogger(zzbvz.class.getName()).logp(Level.FINEST, "io.grpc.internal.ServiceConfigUtil", "selectLbPolicyFromList", "{0} specified by Service Config are not available", arrayList3);
                }
                zzbiz zzbizVarZze = zzbicVarZzb.zze(zzbvxVar.zzb());
                return zzbizVarZze.zzd() == null ? zzbiz.zza(new zzbvy(zzbicVarZzb, zzbizVarZze.zzc())) : zzbizVarZze;
            }
            arrayList3.add(strZza);
        }
        zzbjv zzbjvVar = zzbjv.zzc;
        String string = arrayList3.toString();
        StringBuilder sb2 = new StringBuilder(string.length() + 51);
        sb2.append("None of ");
        sb2.append(string);
        sb2.append(" specified by Service Config are available.");
        return zzbiz.zzb(zzbjvVar.zze(sb2.toString()));
    }

    final /* synthetic */ zzbic zzb(String str, String str2) throws zzbla {
        zzbic zzbicVarZzb = this.zza.zzb(str);
        if (zzbicVarZzb != null) {
            return zzbicVarZzb;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 68);
        sb.append("Trying to load '");
        sb.append(str);
        sb.append("' because using default policy, but it's unavailable");
        throw new zzbla(sb.toString(), null);
    }

    final /* synthetic */ zzbie zzc() {
        return this.zza;
    }

    final /* synthetic */ String zzd() {
        return this.zzb;
    }
}
