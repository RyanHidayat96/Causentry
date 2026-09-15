package com.google.android.libraries.places.internal;

import android.content.Context;
import com.google.common.util.concurrent.DirectExecutor;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.getCameraRegistration;
import defpackage.getCloseFuture;
import java.time.Instant;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
final class zzjf {
    final zzbif zza;
    final ScheduledExecutorService zzb = Executors.newSingleThreadScheduledExecutor();
    int zzc = 0;
    Long zzd;
    zzbck zze;
    String zzf;
    private final Context zzg;
    private final zzbdg zzh;

    zzjf(Context context, zzbif zzbifVar) {
        this.zzg = context;
        this.zza = zzbifVar;
        this.zzh = zzbdh.zzc(zzbifVar);
    }

    public final ListenableFuture zzb() {
        this.zzc++;
        Context context = this.zzg;
        zzbdi zzbdiVarZzc = zzbdj.zzc();
        zzbdiVarZzc.zza(context.getPackageName());
        zzbdj zzbdjVar = (zzbdj) zzbdiVarZzc.zzG();
        zzbdg zzbdgVar = this.zzh;
        ListenableFuture listenableFutureZzb = zzcaj.zzb(zzbdgVar.zzc().zza(zzbdh.zza(), zzbdgVar.zzd()), zzbdjVar);
        getCloseFuture.TuitionPaymentFragmentspecialinlinedviewModeldefault3(listenableFutureZzb, new zzjc(this), DirectExecutor.INSTANCE);
        return listenableFutureZzb;
    }

    final String zzc(long j) {
        String packageName = this.zzg.getPackageName();
        int length = packageName.length() + 1;
        long[] jArr = new long[length];
        jArr[0] = j;
        int i = 0;
        while (i < packageName.length()) {
            int i2 = i + 1;
            jArr[i2] = ((long) packageName.codePointAt(i)) & 4294967295L;
            i = i2;
        }
        long j2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            j2 = ((j2 * 1729) + jArr[i3]) % 131071;
        }
        String strValueOf = String.valueOf(j2);
        this.zzf = strValueOf;
        return strValueOf;
    }

    public final ListenableFuture zza() {
        zzbck zzbckVar = this.zze;
        if (zzbckVar == null || zzbckVar.zzc() < Instant.now().getEpochSecond()) {
            return getCloseFuture.TuitionPaymentFragmentbindingInflater1(zzb(), new getCameraRegistration() { // from class: com.google.android.libraries.places.internal.zzje
                @Override // defpackage.getCameraRegistration
                public final /* synthetic */ Object apply(Object obj) {
                    String str = this.zza.zzf;
                    if (str != null) {
                        return str;
                    }
                    throw new IllegalStateException("Signature not generated.");
                }
            }, DirectExecutor.INSTANCE);
        }
        String str = this.zzf;
        if (str != null) {
            return getCloseFuture.TuitionPaymentFragmentspecialinlinedviewModeldefault3(str);
        }
        throw new IllegalStateException("Signature not generated.");
    }
}
