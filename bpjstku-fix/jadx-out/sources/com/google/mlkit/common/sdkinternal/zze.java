package com.google.mlkit.common.sdkinternal;

import android.os.Process;
import com.google.android.gms.internal.mlkit_common.zzmq;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zze implements Runnable {
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    public final /* synthetic */ CloseGuard zza;
    public final /* synthetic */ int zzb;
    public final /* synthetic */ zzmq zzc;
    public final /* synthetic */ Runnable zzd;

    public /* synthetic */ zze(CloseGuard closeGuard, int i, zzmq zzmqVar, Runnable runnable) {
        this.zza = closeGuard;
        this.zzb = i;
        this.zzc = zzmqVar;
        this.zzd = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zza(this.zzb, this.zzc, this.zzd);
    }

    public static int b() {
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i2 = i % 7566260;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i + 1;
        if (i2 != 0) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
        int iMyTid = Process.myTid();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = iMyTid;
        return iMyTid;
    }
}
