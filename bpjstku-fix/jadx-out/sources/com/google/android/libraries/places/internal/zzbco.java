package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
final class zzbco extends zzbcm {
    @Override // com.google.android.libraries.places.internal.zzbcm
    final /* synthetic */ void zza(Object obj, int i, long j) {
        ((zzbcn) obj).zzk(i << 3, Long.valueOf(j));
    }

    @Override // com.google.android.libraries.places.internal.zzbcm
    final /* synthetic */ void zzb(Object obj, int i, int i2) {
        ((zzbcn) obj).zzk((i << 3) | 5, Integer.valueOf(i2));
    }

    @Override // com.google.android.libraries.places.internal.zzbcm
    final /* synthetic */ void zzc(Object obj, int i, long j) {
        ((zzbcn) obj).zzk((i << 3) | 1, Long.valueOf(j));
    }

    @Override // com.google.android.libraries.places.internal.zzbcm
    final /* synthetic */ void zzd(Object obj, int i, zzayz zzayzVar) {
        ((zzbcn) obj).zzk((i << 3) | 2, zzayzVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbcm
    final /* synthetic */ void zze(Object obj, int i, Object obj2) {
        ((zzbcn) obj).zzk((i << 3) | 3, (zzbcn) obj2);
    }

    @Override // com.google.android.libraries.places.internal.zzbcm
    final /* synthetic */ Object zzg(Object obj) {
        zzbcn zzbcnVar = (zzbcn) obj;
        zzbcnVar.zzd();
        return zzbcnVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbcm
    final /* synthetic */ Object zzh(Object obj) {
        zzbae zzbaeVar = (zzbae) obj;
        zzbcn zzbcnVar = zzbaeVar.zzc;
        if (zzbcnVar != zzbcn.zza()) {
            return zzbcnVar;
        }
        zzbcn zzbcnVarZzb = zzbcn.zzb();
        zzbaeVar.zzc = zzbcnVarZzb;
        return zzbcnVarZzb;
    }

    @Override // com.google.android.libraries.places.internal.zzbcm
    final /* synthetic */ void zzi(Object obj, Object obj2) {
        ((zzbae) obj).zzc = (zzbcn) obj2;
    }

    @Override // com.google.android.libraries.places.internal.zzbcm
    final void zzj(Object obj) {
        ((zzbae) obj).zzc.zzd();
    }

    zzbco() {
    }

    @Override // com.google.android.libraries.places.internal.zzbcm
    final /* synthetic */ Object zzf() {
        return zzbcn.zzb();
    }
}
