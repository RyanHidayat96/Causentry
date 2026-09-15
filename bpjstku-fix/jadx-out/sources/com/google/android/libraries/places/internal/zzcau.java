package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzcau extends zzcaq {
    final /* synthetic */ zzcaw zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzcau(zzcaw zzcawVar, Object obj, zzbhp zzbhpVar) {
        super(zzcawVar, obj, zzbhpVar);
        Objects.requireNonNull(zzcawVar);
        this.zzb = zzcawVar;
    }

    @Override // com.google.android.libraries.places.internal.zzcaq
    protected final zzcap zza() {
        return new zzcat(this);
    }
}
