package com.google.android.libraries.places.internal;

import android.os.Build;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes6.dex */
final class zzte extends zzsx {
    static final boolean zza;
    static final boolean zzb;
    static final boolean zzc;
    private static final AtomicReference zzd;
    private static final AtomicLong zzf;
    private static final ConcurrentLinkedQueue zzg;
    private volatile zzsh zze;

    static {
        zza = Build.FINGERPRINT == null || "robolectric".equals(Build.FINGERPRINT);
        zzb = "goldfish".equals(Build.HARDWARE) || "ranchu".equals(Build.HARDWARE);
        zzc = "eng".equals(Build.TYPE) || "userdebug".equals(Build.TYPE);
        zzd = new AtomicReference();
        zzf = new AtomicLong();
        zzg = new ConcurrentLinkedQueue();
    }

    private zzte(String str) {
        super(str);
        if (zza || zzb) {
            this.zze = new zzsy().zza(zza());
        } else if (zzc) {
            this.zze = zzti.zzb().zzb(false).zza(zza());
        } else {
            this.zze = null;
        }
    }

    public static zzsh zzb(String str) {
        char cCharAt;
        AtomicReference atomicReference = zzd;
        if (atomicReference.get() != null) {
            return ((zzsz) atomicReference.get()).zza(str);
        }
        int length = str.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
            cCharAt = str.charAt(length);
            if (cCharAt == '$') {
                str = str.replace(Typography.dollar, '.');
                break;
            }
        } while (cCharAt != '.');
        zzte zzteVar = new zzte(str);
        ConcurrentLinkedQueue concurrentLinkedQueue = zztc.zza;
        concurrentLinkedQueue.offer(zzteVar);
        if (atomicReference.get() != null) {
            while (true) {
                zzte zzteVar2 = (zzte) concurrentLinkedQueue.poll();
                if (zzteVar2 == null) {
                    break;
                }
                zzteVar2.zze = ((zzsz) atomicReference.get()).zza(zzteVar2.zza());
            }
            if (((zztd) zzg.poll()) != null) {
                zzf.getAndDecrement();
                throw null;
            }
        }
        return zzteVar;
    }
}
