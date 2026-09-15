package com.google.android.libraries.places.internal;

import com.google.common.collect.ImmutableList;

/* JADX INFO: loaded from: classes3.dex */
final class zzapc implements zzbfj {
    private final zzcbd zza;
    private final Class zzb;
    private final Class zzc;

    @Override // com.google.android.libraries.places.internal.zzbfj
    public final zzbfi zza(zzbiu zzbiuVar, zzbfd zzbfdVar, zzbfe zzbfeVar) {
        try {
            ImmutableList immutableList = (ImmutableList) this.zza.zzb();
            zzapd.zzb(zzbiuVar, this.zzb, true);
            zzapd.zzb(zzbiuVar, this.zzc, false);
            return new zzaqd(new zzapy(zzbfeVar, zzbiuVar, zzbfdVar, 2, immutableList));
        } catch (zzbjw e2) {
            return new zzaqm(zzbjv.zzb(e2));
        }
    }

    zzapc(zzcbd zzcbdVar, int i, Class cls, Class cls2) {
        this.zza = zzcbdVar;
        this.zzb = cls;
        this.zzc = cls2;
    }
}
