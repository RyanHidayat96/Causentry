package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzbwv extends zzbxa {
    final /* synthetic */ zzbwx zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbwv(zzbwx zzbwxVar, zzbzc zzbzcVar) {
        super(zzbzcVar);
        Objects.requireNonNull(zzbwxVar);
        this.zza = zzbwxVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbxa, com.google.android.libraries.places.internal.zzbzc
    public final void zza(zzbzo zzbzoVar) throws IOException {
        zzbwx zzbwxVar = this.zza;
        zzbwxVar.zzl(zzbwxVar.zzk() + 1);
        super.zza(zzbzoVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbxa, com.google.android.libraries.places.internal.zzbzc
    public final void zzb(int i, zzbyz zzbyzVar) throws IOException {
        zzbwx zzbwxVar = this.zza;
        zzbwxVar.zzl(zzbwxVar.zzk() + 1);
        super.zzb(i, zzbyzVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbxa, com.google.android.libraries.places.internal.zzbzc
    public final void zzc(boolean z, int i, int i2) throws IOException {
        if (z) {
            zzbwx zzbwxVar = this.zza;
            zzbwxVar.zzl(zzbwxVar.zzk() + 1);
        }
        super.zzc(z, i, i2);
    }
}
