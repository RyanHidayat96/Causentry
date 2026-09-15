package com.google.android.libraries.places.internal;

import defpackage.registerCamera;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzbgm extends zzbih {
    protected abstract zzbih zza();

    public final zzbih zzb(zzbfj... zzbfjVarArr) {
        ((zzbsc) zza()).zza(Arrays.asList(zzbfjVarArr));
        return this;
    }

    public final zzbih zzc(String str) {
        ((zzbsc) zza()).zzb(str);
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzbih
    public final zzbif zzd() {
        return zza().zzd();
    }

    public final String toString() {
        registerCamera.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = new registerCamera.TuitionPaymentFragmentbindingInflater1(getClass().getSimpleName(), (byte) 0);
        zzbih zzbihVarZza = zza();
        registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = new registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
        tuitionPaymentFragmentspecialinlinedviewModeldefault2.b = zzbihVarZza;
        tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "delegate";
        return tuitionPaymentFragmentbindingInflater1.toString();
    }

    protected zzbgm() {
    }
}
