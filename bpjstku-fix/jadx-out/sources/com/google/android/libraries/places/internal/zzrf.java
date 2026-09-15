package com.google.android.libraries.places.internal;

import android.os.Process;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class zzrf implements Runnable {
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    final /* synthetic */ zzrb zza;
    final /* synthetic */ Runnable zzb;

    @Override // java.lang.Runnable
    public final void run() {
        zzrb zzrbVar = this.zza;
        Intrinsics.checkNotNull(zzrbVar, "");
        zzqy zzqyVarZzd = zzqj.zzd();
        zzra zzraVarZzc = zzqj.zzc(zzqyVarZzd, (zzra) zzrbVar);
        try {
            this.zzb.run();
            Unit unit = Unit.INSTANCE;
            zzqj.zzc(zzqyVarZzd, zzraVarZzc);
        } catch (Throwable th) {
            try {
                zzqi.zza(th);
                throw th;
            } catch (Throwable th2) {
                zzqj.zzc(zzqyVarZzd, zzraVarZzc);
                throw th2;
            }
        }
    }

    public final String toString() {
        Runnable runnable = this.zzb;
        StringBuilder sb = new StringBuilder(runnable.toString().length() + 14);
        sb.append("propagating=[");
        sb.append(runnable);
        sb.append("]");
        return sb.toString();
    }

    zzrf(zzrb zzrbVar, Runnable runnable) {
        this.zza = zzrbVar;
        this.zzb = runnable;
    }

    public static int b() {
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i2 = i % 9926356;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i + 1;
        if (i2 != 0) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
        int iMyUid = Process.myUid();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iMyUid;
        return iMyUid;
    }
}
