package com.google.android.libraries.places.internal;

import defpackage.registerCamera;

/* JADX INFO: loaded from: classes3.dex */
class zzbov extends zzbjf {
    private final zzbjf zza;

    zzbov(zzbjf zzbjfVar) {
        if (zzbjfVar == null) {
            throw new NullPointerException("delegate can not be null");
        }
        this.zza = zzbjfVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbjf
    public void zzb(zzbjb zzbjbVar) {
        this.zza.zzb(zzbjbVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjf
    public void zzc() {
        this.zza.zzc();
    }

    @Override // com.google.android.libraries.places.internal.zzbjf
    public final void zzd() {
        this.zza.zzd();
    }

    public final String toString() {
        registerCamera.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = new registerCamera.TuitionPaymentFragmentbindingInflater1(getClass().getSimpleName(), (byte) 0);
        zzbjf zzbjfVar = this.zza;
        registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = new registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
        tuitionPaymentFragmentspecialinlinedviewModeldefault2.b = zzbjfVar;
        tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "delegate";
        return tuitionPaymentFragmentbindingInflater1.toString();
    }

    @Override // com.google.android.libraries.places.internal.zzbjf
    public final String zza() {
        return this.zza.zza();
    }
}
