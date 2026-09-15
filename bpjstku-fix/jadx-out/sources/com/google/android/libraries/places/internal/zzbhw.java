package com.google.android.libraries.places.internal;

import defpackage.registerCamera;
import defpackage.tryOpenCamera;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbhw {
    private final List zza;
    private final zzbez zzb;
    private final Object zzc;

    /* synthetic */ zzbhw(List list, zzbez zzbezVar, Object obj, byte[] bArr) {
        if (list == null) {
            throw new NullPointerException("addresses");
        }
        this.zza = Collections.unmodifiableList(new ArrayList(list));
        if (zzbezVar == null) {
            throw new NullPointerException("attributes");
        }
        this.zzb = zzbezVar;
        this.zzc = obj;
    }

    public static zzbhv zza() {
        return new zzbhv();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbhw)) {
            return false;
        }
        zzbhw zzbhwVar = (zzbhw) obj;
        return tryOpenCamera.b(this.zza, zzbhwVar.zza) && tryOpenCamera.b(this.zzb, zzbhwVar.zzb) && tryOpenCamera.b(this.zzc, zzbhwVar.zzc);
    }

    public final int hashCode() {
        return tryOpenCamera.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.zza, this.zzb, this.zzc);
    }

    public final zzbhv zzb() {
        zzbhv zzbhvVar = new zzbhv();
        zzbhvVar.zza(this.zza);
        zzbhvVar.zzb(this.zzb);
        zzbhvVar.zzc(this.zzc);
        return zzbhvVar;
    }

    public final String toString() {
        registerCamera.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = new registerCamera.TuitionPaymentFragmentbindingInflater1(getClass().getSimpleName(), (byte) 0);
        List list = this.zza;
        registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = new registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
        tuitionPaymentFragmentspecialinlinedviewModeldefault2.b = list;
        tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "addresses";
        zzbez zzbezVar = this.zzb;
        registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = new registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
        tuitionPaymentFragmentspecialinlinedviewModeldefault3.b = zzbezVar;
        tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "attributes";
        Object obj = this.zzc;
        registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault4 = new registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault4;
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault4;
        tuitionPaymentFragmentspecialinlinedviewModeldefault4.b = obj;
        tuitionPaymentFragmentspecialinlinedviewModeldefault4.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "loadBalancingPolicyConfig";
        return tuitionPaymentFragmentbindingInflater1.toString();
    }

    public final List zzc() {
        return this.zza;
    }

    public final zzbez zzd() {
        return this.zzb;
    }

    public final Object zze() {
        return this.zzc;
    }
}
