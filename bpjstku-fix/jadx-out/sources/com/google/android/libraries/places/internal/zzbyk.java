package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbyk {
    private String[] zza;
    private String[] zzb;
    private boolean zzc;

    public zzbyk(zzbyl zzbylVar) {
        boolean z = zzbylVar.zzb;
        this.zza = zzbylVar.zzc();
        this.zzb = zzbylVar.zzd();
        this.zzc = zzbylVar.zzc;
    }

    public final zzbyk zza(zzbyj... zzbyjVarArr) {
        String[] strArr = new String[zzbyjVarArr.length];
        for (int i = 0; i < zzbyjVarArr.length; i++) {
            strArr[i] = zzbyjVarArr[i].zzbb;
        }
        this.zza = strArr;
        return this;
    }

    public final zzbyk zzb(String... strArr) {
        this.zza = strArr == null ? null : (String[]) strArr.clone();
        return this;
    }

    public final zzbyk zzc(zzbyx... zzbyxVarArr) {
        String[] strArr = new String[zzbyxVarArr.length];
        for (int i = 0; i < zzbyxVarArr.length; i++) {
            strArr[i] = zzbyxVarArr[i].zzf;
        }
        this.zzb = strArr;
        return this;
    }

    public final zzbyk zzd(String... strArr) {
        this.zzb = strArr == null ? null : (String[]) strArr.clone();
        return this;
    }

    public final zzbyl zzf() {
        return new zzbyl(this, null);
    }

    public zzbyk(boolean z) {
    }

    public final zzbyk zze(boolean z) {
        this.zzc = true;
        return this;
    }

    final /* synthetic */ String[] zzg() {
        return this.zza;
    }

    final /* synthetic */ String[] zzh() {
        return this.zzb;
    }

    final /* synthetic */ boolean zzi() {
        return this.zzc;
    }
}
