package com.google.android.libraries.places.internal;

import defpackage.registerCamera;
import defpackage.withValue;

/* JADX INFO: loaded from: classes3.dex */
final class zzcae extends withValue {
    private final zzbfi zza;

    zzcae(zzbfi zzbfiVar) {
        this.zza = zzbfiVar;
    }

    @Override // defpackage.withValue
    public final void interruptTask() {
        this.zza.zze("GrpcFuture was cancelled", null);
    }

    @Override // defpackage.withValue
    public final boolean set(Object obj) {
        return super.set(obj);
    }

    @Override // defpackage.withValue
    public final boolean setException(Throwable th) {
        return super.setException(th);
    }

    @Override // defpackage.withValue
    public final String pendingToString() {
        registerCamera.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = new registerCamera.TuitionPaymentFragmentbindingInflater1(getClass().getSimpleName(), (byte) 0);
        zzbfi zzbfiVar = this.zza;
        registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = new registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
        tuitionPaymentFragmentspecialinlinedviewModeldefault2.b = zzbfiVar;
        tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "clientCall";
        return tuitionPaymentFragmentbindingInflater1.toString();
    }

    final /* synthetic */ zzbfi zza() {
        return this.zza;
    }
}
