package com.google.android.libraries.places.internal;

import defpackage.registerCamera;

/* JADX INFO: loaded from: classes3.dex */
abstract class zzbjk extends zzbfi {
    @Override // com.google.android.libraries.places.internal.zzbfi
    public void zzc(int i) {
        zzf().zzc(i);
    }

    @Override // com.google.android.libraries.places.internal.zzbfi
    public void zzd() {
        zzf().zzd();
    }

    @Override // com.google.android.libraries.places.internal.zzbfi
    public void zze(String str, Throwable th) {
        zzf().zze(str, th);
    }

    protected abstract zzbfi zzf();

    public final String toString() {
        registerCamera.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = new registerCamera.TuitionPaymentFragmentbindingInflater1(getClass().getSimpleName(), (byte) 0);
        zzbfi zzbfiVarZzf = zzf();
        registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = new registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
        tuitionPaymentFragmentspecialinlinedviewModeldefault2.b = zzbfiVarZzf;
        tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "delegate";
        return tuitionPaymentFragmentbindingInflater1.toString();
    }

    zzbjk() {
    }
}
