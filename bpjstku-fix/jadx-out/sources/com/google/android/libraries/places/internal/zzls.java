package com.google.android.libraries.places.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
final class zzls implements zzmc {
    private Context zza;
    private zzmf zzb;
    private zzmp zzc;

    @Override // com.google.android.libraries.places.internal.zzmc
    public final zzmd zza() {
        zzber.zzb(this.zza, Context.class);
        zzber.zzb(this.zzb, zzmf.class);
        zzber.zzb(this.zzc, zzmp.class);
        return new zzlt(this.zza, this.zzb, this.zzc);
    }

    @Override // com.google.android.libraries.places.internal.zzmc
    public final /* synthetic */ zzmc zzb(zzmp zzmpVar) {
        this.zzc = zzmpVar;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzmc
    public final /* synthetic */ zzmc zzc(zzmf zzmfVar) {
        this.zzb = zzmfVar;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzmc
    public final /* synthetic */ zzmc zzd(Context context) {
        this.zza = context;
        return this;
    }

    private zzls() {
        throw null;
    }

    /* synthetic */ zzls(byte[] bArr) {
    }
}
