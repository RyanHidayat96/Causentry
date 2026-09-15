package com.google.android.libraries.places.internal;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcbv {
    private static final zzcbu zza = new zzcbu(new byte[0], 0, 0, false, false);
    private static final int zzb;
    private static final AtomicReference[] zzc;

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        int iHighestOneBit = Integer.highestOneBit((iAvailableProcessors + iAvailableProcessors) - 1);
        zzb = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i = 0; i < iHighestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        zzc = atomicReferenceArr;
    }

    @JvmStatic
    public static final zzcbu zza() {
        AtomicReference atomicReferenceZzc = zzc();
        zzcbu zzcbuVar = zza;
        zzcbu zzcbuVar2 = (zzcbu) atomicReferenceZzc.getAndSet(zzcbuVar);
        if (zzcbuVar2 == zzcbuVar) {
            return new zzcbu();
        }
        if (zzcbuVar2 == null) {
            atomicReferenceZzc.set(null);
            return new zzcbu();
        }
        atomicReferenceZzc.set(zzcbuVar2.zzf);
        zzcbuVar2.zzf = null;
        zzcbuVar2.zzc = 0;
        return zzcbuVar2;
    }

    @JvmStatic
    public static final void zzb(zzcbu zzcbuVar) {
        Intrinsics.checkNotNullParameter(zzcbuVar, "");
        if (zzcbuVar.zzf != null || zzcbuVar.zzg != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (zzcbuVar.zzd) {
            return;
        }
        AtomicReference atomicReferenceZzc = zzc();
        zzcbu zzcbuVar2 = zza;
        zzcbu zzcbuVar3 = (zzcbu) atomicReferenceZzc.getAndSet(zzcbuVar2);
        if (zzcbuVar3 != zzcbuVar2) {
            int i = zzcbuVar3 != null ? zzcbuVar3.zzc : 0;
            if (i >= 65536) {
                atomicReferenceZzc.set(zzcbuVar3);
                return;
            }
            zzcbuVar.zzf = zzcbuVar3;
            zzcbuVar.zzb = 0;
            zzcbuVar.zzc = i + 8192;
            atomicReferenceZzc.set(zzcbuVar);
        }
    }

    private static final AtomicReference zzc() {
        return zzc[(int) (Thread.currentThread().getId() & (((long) zzb) - 1))];
    }
}
