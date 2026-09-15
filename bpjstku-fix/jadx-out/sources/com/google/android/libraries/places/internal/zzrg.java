package com.google.android.libraries.places.internal;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes3.dex */
public final class zzrg implements Runnable {
    final /* synthetic */ Ref.ObjectRef zza;
    final /* synthetic */ zzra zzb;
    final /* synthetic */ Runnable zzc;

    @Override // java.lang.Runnable
    public final void run() {
        if (((zzrm) this.zza.element) != null) {
            throw null;
        }
        zzra zzraVar = this.zzb;
        Intrinsics.checkNotNull(zzraVar, "");
        Runnable runnable = this.zzc;
        zzqy zzqyVarZzd = zzqj.zzd();
        zzra zzraVarZzc = zzqj.zzc(zzqyVarZzd, zzraVar);
        try {
            runnable.run();
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
        Runnable runnable = this.zzc;
        StringBuilder sb = new StringBuilder(runnable.toString().length() + 14);
        sb.append("propagating=[");
        sb.append(runnable);
        sb.append("]");
        return sb.toString();
    }

    zzrg(Ref.ObjectRef objectRef, zzra zzraVar, Runnable runnable) {
        this.zza = objectRef;
        this.zzb = zzraVar;
        this.zzc = runnable;
    }
}
