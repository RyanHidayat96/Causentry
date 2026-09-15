package com.google.android.libraries.places.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
final class zzou implements zzox {
    private Context zza;
    private zzmo zzb;

    @Override // com.google.android.libraries.places.internal.zzox
    public final zzoy zza() {
        zzber.zzb(this.zza, Context.class);
        zzber.zzb(this.zzb, zzmo.class);
        return new zzov(this.zza, this.zzb);
    }

    @Override // com.google.android.libraries.places.internal.zzox
    public final /* synthetic */ zzox zzb(zzmo zzmoVar) {
        this.zzb = zzmoVar;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzox
    public final /* synthetic */ zzox zzc(Context context) {
        this.zza = context;
        return this;
    }

    private zzou() {
        throw null;
    }

    /* synthetic */ zzou(byte[] bArr) {
    }
}
