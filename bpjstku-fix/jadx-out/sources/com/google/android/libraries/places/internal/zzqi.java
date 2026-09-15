package com.google.android.libraries.places.internal;

import com.google.common.collect.ImmutableList;
import defpackage.setPreviewStabilization;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class zzqi {
    private static final WeakHashMap zza = new WeakHashMap();
    private static final WeakHashMap zzb = new WeakHashMap();

    public static void zza(Throwable th) {
        Throwable cause;
        zzrk zzrkVar;
        zzra zzraVar;
        WeakHashMap weakHashMap = zzb;
        synchronized (weakHashMap) {
            cause = th;
            while (cause != null) {
                try {
                    if (weakHashMap.containsKey(cause)) {
                        break;
                    } else {
                        cause = cause.getCause();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            weakHashMap.put(th, Boolean.valueOf(cause != null));
        }
        if (cause == null) {
            WeakHashMap weakHashMap2 = zza;
            synchronized (weakHashMap2) {
                Throwable cause2 = th;
                while (cause2 != null) {
                    if (weakHashMap2.containsKey(cause2)) {
                        break;
                    } else {
                        cause2 = cause2.getCause();
                    }
                }
                if (cause2 == null) {
                    zzrkVar = null;
                } else {
                    zzre zzreVar = (zzre) weakHashMap2.get(cause2);
                    weakHashMap2.put(th, zzreVar);
                    zzrkVar = new zzrk(cause2, zzreVar);
                }
            }
            if (zzrkVar != null || (zzraVar = zzqj.zzd().zzb) == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (zzraVar = zzqj.zzd().zzb; zzraVar != null; zzraVar = null) {
                arrayList.add(zzraVar);
            }
            zzqd zzqdVar = new zzqd();
            zzqdVar.zzc(((zzra) arrayList.get(0)).zzc());
            ((zzra) arrayList.get(0)).zzi();
            zzqdVar.zzd(-1L);
            ImmutableList.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1B = ImmutableList.b(arrayList.size());
            ImmutableList.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1B2 = ImmutableList.b(arrayList.size());
            for (zzra zzraVar2 : setPreviewStabilization.TuitionPaymentFragmentspecialinlinedviewModeldefault3(arrayList)) {
                tuitionPaymentFragmentbindingInflater1B2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(zzraVar2.zze());
                tuitionPaymentFragmentbindingInflater1B.TuitionPaymentFragmentspecialinlinedviewModeldefault3(zzraVar2.zzg());
            }
            synchronized (weakHashMap2) {
                tuitionPaymentFragmentbindingInflater1B2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
                zzqdVar.zza(ImmutableList.TuitionPaymentFragmentbindingInflater1(tuitionPaymentFragmentbindingInflater1B2.TuitionPaymentFragmentspecialinlinedviewModeldefault3, tuitionPaymentFragmentbindingInflater1B2.b));
                tuitionPaymentFragmentbindingInflater1B.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
                zzqdVar.zzb(ImmutableList.TuitionPaymentFragmentbindingInflater1(tuitionPaymentFragmentbindingInflater1B.TuitionPaymentFragmentspecialinlinedviewModeldefault3, tuitionPaymentFragmentbindingInflater1B.b));
                weakHashMap2.put(th, zzqdVar.zze());
            }
        }
    }
}
