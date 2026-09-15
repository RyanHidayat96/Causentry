package com.google.android.libraries.places.internal;

import defpackage.registerCamera;

/* JADX INFO: loaded from: classes3.dex */
final class zzbte extends zzbhy {
    private final zzbht zza;

    zzbte(zzbht zzbhtVar) {
        if (zzbhtVar == null) {
            throw new NullPointerException("result");
        }
        this.zza = zzbhtVar;
    }

    public final String toString() {
        registerCamera.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = new registerCamera.TuitionPaymentFragmentbindingInflater1(zzbte.class.getSimpleName(), (byte) 0);
        zzbht zzbhtVar = this.zza;
        registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = new registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
        tuitionPaymentFragmentspecialinlinedviewModeldefault2.b = zzbhtVar;
        tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "result";
        return tuitionPaymentFragmentbindingInflater1.toString();
    }

    @Override // com.google.android.libraries.places.internal.zzbhy
    public final zzbht zza(zzbhu zzbhuVar) {
        return this.zza;
    }
}
