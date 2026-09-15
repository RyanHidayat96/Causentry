package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzayo implements zzbbt {
    @Override // com.google.android.libraries.places.internal.zzbbt
    public final /* bridge */ /* synthetic */ Object zza(zzazc zzazcVar, zzazp zzazpVar) throws zzbar {
        zzbcl zzbclVar;
        zzbbl zzbblVar = (zzbbl) zzb(zzazcVar, zzazpVar);
        if (zzbblVar == null || zzbblVar.zzbA()) {
            return zzbblVar;
        }
        if (zzbblVar instanceof zzaym) {
            zzbclVar = new zzbcl((zzaym) zzbblVar);
        } else {
            if (zzbblVar instanceof zzayn) {
                throw null;
            }
            zzbclVar = new zzbcl(zzbblVar);
        }
        throw zzbclVar.zza();
    }
}
