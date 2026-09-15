package com.google.android.libraries.places.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcax extends zzbic {
    @Override // com.google.android.libraries.places.internal.zzbhp
    public final zzbia zza(zzbhr zzbhrVar) {
        return new zzcaw(zzbhrVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbic
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.libraries.places.internal.zzbic
    public final int zzc() {
        return 5;
    }

    @Override // com.google.android.libraries.places.internal.zzbic
    public final zzbiz zze(Map map) {
        return zzbiz.zza("no service config");
    }

    @Override // com.google.android.libraries.places.internal.zzbic
    public final String zzd() {
        return "round_robin";
    }
}
