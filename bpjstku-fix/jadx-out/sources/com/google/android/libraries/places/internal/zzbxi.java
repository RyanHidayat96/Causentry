package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzbxi implements zzbkj {
    final /* synthetic */ zzbxk zza;

    zzbxi(zzbxk zzbxkVar) {
        Objects.requireNonNull(zzbxkVar);
        this.zza = zzbxkVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbkj
    public final void zza(zzbip zzbipVar, byte[] bArr) {
        zzbxk zzbxkVar = this.zza;
        String strZzb = zzbxkVar.zzF().zzb();
        StringBuilder sb = new StringBuilder(String.valueOf(strZzb).length() + 1);
        sb.append("/");
        sb.append(strZzb);
        String string = sb.toString();
        synchronized (zzbxkVar.zzJ().zzO()) {
            zzbxkVar.zzJ().zzN(zzbipVar, string);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbkj
    public final void zzc(zzbjv zzbjvVar) {
        zzbxk zzbxkVar = this.zza;
        synchronized (zzbxkVar.zzJ().zzO()) {
            zzbxkVar.zzJ().zzL(zzbjvVar, true, null);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbkj
    public final void zzb(zzbwq zzbwqVar, boolean z, boolean z2, int i) {
        zzcbj zzcbjVarZze;
        if (zzbwqVar == null) {
            zzcbjVarZze = zzbxk.zzb;
        } else {
            zzcbjVarZze = ((zzbyb) zzbwqVar).zze();
            int iZzb = (int) zzcbjVarZze.zzb();
            if (iZzb > 0) {
                this.zza.zzw(iZzb);
            }
        }
        zzbxk zzbxkVar = this.zza;
        synchronized (zzbxkVar.zzJ().zzO()) {
            zzbxkVar.zzJ().zzM(zzcbjVarZze, z, z2);
            zzbxkVar.zzo().zzc(i);
        }
    }
}
