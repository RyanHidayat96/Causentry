package com.google.android.libraries.places.internal;

import defpackage.registerCamera;
import defpackage.tryOpenCamera;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbvx {
    private final String zza;
    private final Map zzb;

    public zzbvx(String str, Map map) {
        if (str == null) {
            throw new NullPointerException("policyName");
        }
        this.zza = str;
        if (map == null) {
            throw new NullPointerException("rawConfigValue");
        }
        this.zzb = map;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbvx)) {
            return false;
        }
        zzbvx zzbvxVar = (zzbvx) obj;
        return this.zza.equals(zzbvxVar.zza) && this.zzb.equals(zzbvxVar.zzb);
    }

    public final int hashCode() {
        return tryOpenCamera.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.zza, this.zzb);
    }

    public final String toString() {
        registerCamera.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = new registerCamera.TuitionPaymentFragmentbindingInflater1(getClass().getSimpleName(), (byte) 0);
        String str = this.zza;
        registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = new registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
        tuitionPaymentFragmentspecialinlinedviewModeldefault2.b = str;
        tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "policyName";
        Map map = this.zzb;
        registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = new registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
        tuitionPaymentFragmentspecialinlinedviewModeldefault3.b = map;
        tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "rawConfigValue";
        return tuitionPaymentFragmentbindingInflater1.toString();
    }

    public final String zza() {
        return this.zza;
    }

    public final Map zzb() {
        return this.zzb;
    }
}
