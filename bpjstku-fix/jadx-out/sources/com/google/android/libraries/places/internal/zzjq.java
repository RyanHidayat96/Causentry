package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.api.model.Leg;
import com.google.android.libraries.places.api.model.RoutingSummary;
import java.time.Duration;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
final class zzjq {
    public static final RoutingSummary zza(zzaxq zzaxqVar) {
        ArrayList arrayList = new ArrayList();
        for (zzaxp zzaxpVar : zzaxqVar.zza()) {
            zzazm zzazmVarZza = zzaxpVar.zza();
            arrayList.add(Leg.newInstance(Duration.ofSeconds(zzazmVarZza.zzc(), zzazmVarZza.zze()), zzaxpVar.zzc()));
        }
        return RoutingSummary.newInstance(arrayList);
    }

    zzjq() {
    }
}
