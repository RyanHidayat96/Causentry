package com.google.android.libraries.places.internal;

import defpackage.registerCamera;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzcao extends zzbhr {
    @Override // com.google.android.libraries.places.internal.zzbhr
    public final zzbhx zza(zzbho zzbhoVar) {
        return zzf().zza(zzbhoVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbhr
    public final void zzc() {
        zzf().zzc();
    }

    @Override // com.google.android.libraries.places.internal.zzbhr
    public final zzbkd zzd() {
        return zzf().zzd();
    }

    @Override // com.google.android.libraries.places.internal.zzbhr
    public final ScheduledExecutorService zze() {
        return zzf().zze();
    }

    protected abstract zzbhr zzf();

    public final String toString() {
        registerCamera.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = new registerCamera.TuitionPaymentFragmentbindingInflater1(getClass().getSimpleName(), (byte) 0);
        zzbhr zzbhrVarZzf = zzf();
        registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = new registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
        tuitionPaymentFragmentspecialinlinedviewModeldefault2.b = zzbhrVarZzf;
        tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "delegate";
        return tuitionPaymentFragmentbindingInflater1.toString();
    }

    @Override // com.google.android.libraries.places.internal.zzbhr
    public void zzb(zzbfy zzbfyVar, zzbhy zzbhyVar) {
        throw null;
    }
}
