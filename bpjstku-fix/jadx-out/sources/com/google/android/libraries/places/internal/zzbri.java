package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzbri extends zzbfe {
    final /* synthetic */ zzbrr zza;

    zzbri(zzbrr zzbrrVar) {
        Objects.requireNonNull(zzbrrVar);
        this.zza = zzbrrVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbfe
    public final zzbfi zza(zzbiu zzbiuVar, zzbfd zzbfdVar) {
        zzbrx zzbrxVar = this.zza.zza;
        zzblq zzblqVar = new zzblq(zzbiuVar, zzbrxVar.zzp(zzbfdVar), zzbfdVar, zzbrxVar.zzah(), zzbrxVar.zzR() ? null : zzbrxVar.zzu().zzb(), zzbrxVar.zzT(), null);
        zzblqVar.zzf(zzbrxVar.zzy());
        return zzblqVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbfe
    public final String zzb() {
        return this.zza.zzg();
    }
}
