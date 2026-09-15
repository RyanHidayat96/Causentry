package com.google.android.libraries.places.internal;

import androidx.core.app.NotificationCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import defpackage.CameraStateRegistryCameraRegistration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbvr extends zzbje {
    private final boolean zza;
    private final zzblb zzb;

    public zzbvr(boolean z, int i, int i2, zzblb zzblbVar) {
        this.zza = z;
        if (zzblbVar == null) {
            throw new NullPointerException("autoLoadBalancerFactory");
        }
        this.zzb = zzblbVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbje
    public final zzbiz zza(Map map) {
        Object objZzc;
        zzbvk zzbvkVar;
        zzbsh zzbshVar;
        Map mapZzd;
        try {
            zzbiz zzbizVarZza = this.zzb.zza(map);
            zzbsf zzbsfVar = null;
            if (zzbizVarZza == null) {
                objZzc = null;
            } else {
                if (zzbizVarZza.zzd() != null) {
                    return zzbiz.zzb(zzbizVarZza.zzd());
                }
                objZzc = zzbizVarZza.zzc();
            }
            boolean z = this.zza;
            if (!z || map == null || (mapZzd = zzbqj.zzd(map, "retryThrottling")) == null) {
                zzbvkVar = null;
            } else {
                float fFloatValue = zzbqj.zze(mapZzd, "maxTokens").floatValue();
                float fFloatValue2 = zzbqj.zze(mapZzd, "tokenRatio").floatValue();
                if (!(fFloatValue > 0.0f)) {
                    throw new IllegalStateException("maxToken should be greater than zero");
                }
                if (!(fFloatValue2 > 0.0f)) {
                    throw new IllegalStateException("tokenRatio should be greater than zero");
                }
                zzbvkVar = new zzbvk(fFloatValue, fFloatValue2);
            }
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            Map mapZzd2 = map == null ? null : zzbqj.zzd(map, "healthCheckConfig");
            List<Map> listZzb = zzbqj.zzb(map, "methodConfig");
            if (listZzb == null) {
                zzbshVar = new zzbsh(null, map2, map3, zzbvkVar, objZzc, mapZzd2);
            } else {
                for (Map map4 : listZzb) {
                    zzbsf zzbsfVar2 = new zzbsf(map4, z, 5, 5);
                    List<Map> listZzb2 = zzbqj.zzb(map4, "name");
                    if (listZzb2 != null && !listZzb2.isEmpty()) {
                        for (Map map5 : listZzb2) {
                            String strZzg = zzbqj.zzg(map5, NotificationCompat.CATEGORY_SERVICE);
                            String strZzg2 = zzbqj.zzg(map5, FirebaseAnalytics.Param.METHOD);
                            if (strZzg == null || strZzg.isEmpty()) {
                                if (!(strZzg2 == null || strZzg2.isEmpty())) {
                                    throw new IllegalArgumentException(CameraStateRegistryCameraRegistration.b("missing service name for method %s", strZzg2));
                                }
                                if (!(zzbsfVar == null)) {
                                    throw new IllegalArgumentException(CameraStateRegistryCameraRegistration.b("Duplicate default method config in service config %s", map));
                                }
                                zzbsfVar = zzbsfVar2;
                            } else if (strZzg2 == null || strZzg2.isEmpty()) {
                                if (!(!map3.containsKey(strZzg))) {
                                    throw new IllegalArgumentException(CameraStateRegistryCameraRegistration.b("Duplicate service %s", strZzg));
                                }
                                map3.put(strZzg, zzbsfVar2);
                            } else {
                                String strZzh = zzbiu.zzh(strZzg, strZzg2);
                                if (!(!map2.containsKey(strZzh))) {
                                    throw new IllegalArgumentException(CameraStateRegistryCameraRegistration.b("Duplicate method name %s", strZzh));
                                }
                                map2.put(strZzh, zzbsfVar2);
                            }
                        }
                    }
                }
                zzbshVar = new zzbsh(zzbsfVar, map2, map3, zzbvkVar, objZzc, mapZzd2);
            }
            return zzbiz.zza(zzbshVar);
        } catch (RuntimeException e2) {
            return zzbiz.zzb(zzbjv.zzc.zze("failed to parse service config").zzd(e2));
        }
    }
}
