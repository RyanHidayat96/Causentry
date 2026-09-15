package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
final class zzcai extends zzcaf {
    private final zzcae zza;
    private Object zzb;
    private boolean zzc;

    @Override // com.google.android.libraries.places.internal.zzbfh
    public final void zza(zzbip zzbipVar) {
    }

    @Override // com.google.android.libraries.places.internal.zzbfh
    public final void zzb(Object obj) {
        if (this.zzc) {
            throw new zzbjy(zzbjv.zzh.zze("More than one value received for unary call"), null);
        }
        this.zzb = obj;
        this.zzc = true;
    }

    @Override // com.google.android.libraries.places.internal.zzbfh
    public final void zzc(zzbjv zzbjvVar, zzbip zzbipVar) {
        if (!zzbjvVar.zzj()) {
            this.zza.setException(new zzbjy(zzbjvVar, zzbipVar));
            return;
        }
        if (!this.zzc) {
            this.zza.setException(new zzbjy(zzbjv.zzh.zze("No value received for unary call"), zzbipVar));
        }
        this.zza.set(this.zzb);
    }

    @Override // com.google.android.libraries.places.internal.zzcaf
    final void zze() {
        this.zza.zza().zzc(2);
    }

    zzcai(zzcae zzcaeVar) {
        super(null);
        this.zzc = false;
        this.zza = zzcaeVar;
    }
}
