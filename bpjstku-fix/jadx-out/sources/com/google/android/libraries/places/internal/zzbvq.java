package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbvq extends zzbov {
    private final zzbvn zza;

    zzbvq(zzbjf zzbjfVar, zzbvn zzbvnVar, zzbkd zzbkdVar) {
        super(zzbjfVar);
        this.zza = zzbvnVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbov, com.google.android.libraries.places.internal.zzbjf
    public final void zzb(zzbjb zzbjbVar) {
        super.zzb(new zzbvp(this, zzbjbVar));
    }

    @Override // com.google.android.libraries.places.internal.zzbov, com.google.android.libraries.places.internal.zzbjf
    public final void zzc() {
        super.zzc();
        this.zza.zzb();
    }

    final /* synthetic */ zzbvn zze() {
        return this.zza;
    }
}
