package com.google.android.libraries.places.internal;

import android.os.Build;
import android.os.Trace;
import com.google.common.collect.ImmutableSet;
import java.util.ArrayDeque;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class zzqj {
    static final zzpx zza;
    public static final /* synthetic */ int zzb = 0;
    private static final AtomicReference zzc;
    private static final WeakHashMap zzd;
    private static final zzqm zze;

    final class zza {
        public static boolean zza() {
            return Trace.isEnabled();
        }
    }

    static {
        ImmutableSet.TuitionPaymentFragmentbindingInflater1("androidx.fragment.app.FragmentViewLifecycleOwner.handleLifecycleEvent", "com.google.android.libraries.logging.logger.transmitters.clearcut", "com.google.android.libraries.performance.primes.transmitter.clearcut", "com.google.android.libraries.performance.primes.metrics.crash.CrashMetricServiceImpl", "com.google.android.libraries.performance.primes.metrics.crash.applicationexit.ApplicationExitMetricServiceImpl");
        zzc = new AtomicReference(ImmutableSet.g());
        zza = new zzpx("tiktok_systrace");
        zzd = new WeakHashMap();
        zze = new zzqm();
        new ArrayDeque();
        new ArrayDeque();
    }

    static ImmutableSet zza() {
        return (ImmutableSet) zzc.get();
    }

    static zzra zzb(boolean z) {
        zzqy zzqyVarZzd = zzd();
        zzra zzraVar = zzqyVarZzd.zzb;
        return (zzraVar == null || zzraVar == zzqq.zza) ? zzqp.zzh(zzqyVarZzd) : zzraVar;
    }

    public static zzra zzc(zzqy zzqyVar, zzra zzraVar) {
        zzra zzraVar2;
        zzrj zzrjVar = zzqyVar.zzc;
        zzra zzraVar3 = zzqyVar.zzb;
        if (zzraVar3 != zzraVar) {
            if (zzraVar3 == null) {
                zzqyVar.zza = Build.VERSION.SDK_INT >= 29 ? zza.zza() : zzpz.zza(zza);
            }
            if (zzqyVar.zza) {
                if (zzraVar3 != null) {
                    zzraVar2 = zzraVar != null ? zzraVar : null;
                    zzqz.zzb(zzraVar3);
                } else {
                    zzraVar2 = zzraVar;
                }
                if (zzraVar2 != null) {
                    zzqz.zza(zzraVar2);
                }
            }
            if (zzraVar3 != zzraVar) {
                if (zzraVar == null) {
                    zzraVar = null;
                }
                zzqyVar.zzb = zzraVar;
                return zzraVar3;
            }
        }
        return zzraVar;
    }

    public static zzqy zzd() {
        return (zzqy) zze.get();
    }

    public static boolean zze() {
        zzra zzraVar = zzd().zzb;
        return (zzraVar == null || zzraVar == zzqq.zza) ? false : true;
    }
}
