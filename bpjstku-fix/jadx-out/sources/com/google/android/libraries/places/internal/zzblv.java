package com.google.android.libraries.places.internal;

import defpackage.tryOpenCamera;

/* JADX INFO: loaded from: classes3.dex */
public final class zzblv {
    private String zza = "unknown-authority";
    private zzbez zzb = zzbez.zza;
    private String zzc;
    private zzbgt zzd;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzblv)) {
            return false;
        }
        zzblv zzblvVar = (zzblv) obj;
        return this.zza.equals(zzblvVar.zza) && this.zzb.equals(zzblvVar.zzb) && tryOpenCamera.b(this.zzc, zzblvVar.zzc) && tryOpenCamera.b(this.zzd, zzblvVar.zzd);
    }

    public final int hashCode() {
        return tryOpenCamera.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.zza, this.zzb, this.zzc, this.zzd);
    }

    public final zzblv zzb(String str) {
        if (str == null) {
            throw new NullPointerException("authority");
        }
        this.zza = str;
        return this;
    }

    public final zzblv zzd(zzbez zzbezVar) {
        if (zzbezVar == null) {
            throw new NullPointerException("eagAttributes");
        }
        this.zzb = zzbezVar;
        return this;
    }

    public final String zza() {
        return this.zza;
    }

    public final zzbez zzc() {
        return this.zzb;
    }

    public final String zze() {
        return this.zzc;
    }

    public final zzblv zzf(String str) {
        this.zzc = str;
        return this;
    }

    public final zzbgt zzg() {
        return this.zzd;
    }

    public final zzblv zzh(zzbgt zzbgtVar) {
        this.zzd = zzbgtVar;
        return this;
    }
}
