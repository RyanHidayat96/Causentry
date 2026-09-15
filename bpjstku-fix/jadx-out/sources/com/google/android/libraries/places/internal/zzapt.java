package com.google.android.libraries.places.internal;

import android.os.Process;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zzapt implements Runnable {
    public static int TuitionPaymentFragmentbindingInflater1;
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final /* synthetic */ zzapu zza;
    private final /* synthetic */ zzbip zzb;

    /* synthetic */ zzapt(zzapu zzapuVar, zzbip zzbipVar) {
        this.zza = zzapuVar;
        this.zzb = zzbipVar;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        this.zza.zze(this.zzb);
    }

    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = TuitionPaymentFragmentbindingInflater1;
        int i2 = i % 8770513;
        TuitionPaymentFragmentbindingInflater1 = i + 1;
        if (i2 != 0) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
        int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = startElapsedRealtime;
        return startElapsedRealtime;
    }
}
