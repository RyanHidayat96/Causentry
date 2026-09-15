package com.google.android.libraries.places.internal;

import defpackage.registerCamera;
import defpackage.tryOpenCamera;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbgw {
    public final String zza;
    public final zzbgv zzb;
    public final long zzc;
    public final zzbhk zzd;
    public final zzbhk zze;

    /* synthetic */ zzbgw(String str, zzbgv zzbgvVar, long j, zzbhk zzbhkVar, zzbhk zzbhkVar2, byte[] bArr) {
        this.zza = str;
        if (zzbgvVar == null) {
            throw new NullPointerException("severity");
        }
        this.zzb = zzbgvVar;
        this.zzc = j;
        this.zzd = null;
        this.zze = zzbhkVar2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbgw)) {
            return false;
        }
        zzbgw zzbgwVar = (zzbgw) obj;
        if (!tryOpenCamera.b(this.zza, zzbgwVar.zza) || !tryOpenCamera.b(this.zzb, zzbgwVar.zzb) || this.zzc != zzbgwVar.zzc) {
            return false;
        }
        zzbhk zzbhkVar = zzbgwVar.zzd;
        return tryOpenCamera.b(null, null) && tryOpenCamera.b(this.zze, zzbgwVar.zze);
    }

    public final int hashCode() {
        String str = this.zza;
        zzbgv zzbgvVar = this.zzb;
        long j = this.zzc;
        return tryOpenCamera.TuitionPaymentFragmentspecialinlinedviewModeldefault3(str, zzbgvVar, Long.valueOf(j), null, this.zze);
    }

    public final String toString() {
        registerCamera.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = new registerCamera.TuitionPaymentFragmentbindingInflater1(getClass().getSimpleName(), (byte) 0);
        String str = this.zza;
        registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = new registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
        tuitionPaymentFragmentspecialinlinedviewModeldefault2.b = str;
        tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "description";
        zzbgv zzbgvVar = this.zzb;
        registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = new registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
        tuitionPaymentFragmentspecialinlinedviewModeldefault3.b = zzbgvVar;
        tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "severity";
        String strValueOf = String.valueOf(this.zzc);
        registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault4 = new registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3((byte) 0);
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault4;
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault4;
        tuitionPaymentFragmentspecialinlinedviewModeldefault4.b = strValueOf;
        tuitionPaymentFragmentspecialinlinedviewModeldefault4.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "timestampNanos";
        registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault5 = new registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault5;
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault5;
        tuitionPaymentFragmentspecialinlinedviewModeldefault5.b = null;
        tuitionPaymentFragmentspecialinlinedviewModeldefault5.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "channelRef";
        zzbhk zzbhkVar = this.zze;
        registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault6 = new registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault6;
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault6;
        tuitionPaymentFragmentspecialinlinedviewModeldefault6.b = zzbhkVar;
        tuitionPaymentFragmentspecialinlinedviewModeldefault6.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "subchannelRef";
        return tuitionPaymentFragmentbindingInflater1.toString();
    }
}
