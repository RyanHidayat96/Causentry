package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class zzly implements zzbep {
    @Override // com.google.android.libraries.places.internal.zzcbd
    public final /* synthetic */ Object zzb() {
        zzbxh zzbxhVarZze = zzbxh.zze("gmpsdksbackend-pa.googleapis.com", 443);
        zzbxhVarZze.zzf();
        String property = System.getProperty("http.agent");
        if (property == null) {
            property = "";
        }
        zzbxhVarZze.zzc(property);
        return zzbxhVarZze.zzd();
    }
}
